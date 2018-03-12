package org.dukecon.feedback;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class DukeconFeedbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(DukeconFeedbackApplication.class, args);
    }

    @RestController
    private static class FeedbackController {
        @PutMapping("talk/{talkId}")
        public ResponseEntity postFeedback(@PathVariable("talkId") String talkId, @RequestBody FeedbackInput feedbackInput) {
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class FeedbackInput {
    private int rating;
    private String comment;
}