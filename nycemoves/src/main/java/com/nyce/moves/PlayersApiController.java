package com.nyce.moves;

import java.math.BigDecimal;
import com.nyce.moves.ModelApiResponse;
import com.nyce.moves.Player;
import com.nyce.moves.PlayerRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-19T16:41:29.282+05:30")

@Controller
public class PlayersApiController implements PlayersApi {

    private static final Logger log = LoggerFactory.getLogger(PlayersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PlayersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> createPlayer(@ApiParam(value = "Created user object" ,required=true )  @Valid @RequestBody PlayerRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> deletePlayer(@ApiParam(value = "The playerId that needs to be deleted",required=true) @PathVariable("playerId") String playerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{  \"code\" : \"code\",  \"message\" : \"message\",  \"status\" : \"SUCCESS\"}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getPlayer(@ApiParam(value = "The playerId of the current player",required=true) @PathVariable("playerId") Integer playerId,@ApiParam(value = "", defaultValue = "10") @Valid @RequestParam(value = "pageSize", required = false, defaultValue="10") BigDecimal pageSize,@ApiParam(value = "", defaultValue = "1") @Valid @RequestParam(value = "pageNumber", required = false, defaultValue="1") BigDecimal pageNumber) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> loginUser(@ApiParam(value = "The user name for login" ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "The password for login in clear text" ,required=true) @RequestHeader(value="password", required=true) String password) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> logoutUser(@ApiParam(value = "The playerId of the current player",required=true) @PathVariable("playerId") Integer playerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{  \"code\" : \"code\",  \"message\" : \"message\",  \"status\" : \"SUCCESS\"}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updatePlayer(@ApiParam(value = "player that need to be updated",required=true) @PathVariable("playerId") String playerId,@ApiParam(value = "Updated player object" ,required=true )  @Valid @RequestBody Player body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
