package org.dukecon.feedback.domain;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.dukecon.feedback.domain.model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DukeconFeedbackApplication {

    @Autowired
    @NonNull
    private FeedbackStore repository;

    public void save(Feedback feedback) {
        repository.saveOverwriteExisting(feedback);
    }
}
