package com.amazon.alexa.avs.message.request.audioplayer;

import com.amazon.alexa.avs.message.Payload;
import com.amazon.alexa.avs.message.request.context.PlaybackStatePayload;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaybackFailedPayload extends Payload {
    private final PlaybackStatePayload currentPlaybackState;
    private final ErrorStructure error;
    private final String token;

    public static final class ErrorStructure {
        private final String message;
        private final ErrorType type;

        public ErrorStructure(ErrorType errorType) {
            this.type = errorType;
            this.message = errorType.getMessage();
        }

        public String getMessage() {
            return this.message;
        }

        public ErrorType getType() {
            return this.type;
        }
    }

    public enum ErrorType {
        MEDIA_ERROR_UNKNOWN("An unknown error occurred"),
        MEDIA_ERROR_INVALID_REQUEST("The server recognized the request as being malformed (bad request, unauthorized, forbidden, not found, etc)"),
        MEDIA_ERROR_SERVICE_UNAVAILABLE("The device was unavailable to reach the service"),
        MEDIA_ERROR_INTERNAL_SERVER_ERROR("The server accepted the request, but was unable to process it as expected"),
        MEDIA_ERROR_INTERNAL_DEVICE_ERROR("There was an internal error on the device");

        private final String message;

        ErrorType(String str) {
            this.message = str;
        }

        public String getMessage() {
            return this.message;
        }
    }

    public PlaybackFailedPayload(String str, PlaybackStatePayload playbackStatePayload, ErrorType errorType) {
        this.token = str;
        this.currentPlaybackState = playbackStatePayload;
        this.error = new ErrorStructure(errorType);
    }

    public PlaybackStatePayload getCurrentPlaybackState() {
        return this.currentPlaybackState;
    }

    public ErrorStructure getError() {
        return this.error;
    }

    public String getToken() {
        return this.token;
    }
}
