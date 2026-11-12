package com.amazon.alexa.avs;

/* JADX INFO: loaded from: classes2.dex */
public final class AVSAPIConstants {

    public static class Alerts {
        public static final String NAMESPACE = "Alerts";

        public static final class Directives {

            public static final class DeleteAlert {
                public static final String NAME = "DeleteAlert";
            }

            public static final class SetAlert {
                public static final String NAME = "SetAlert";
            }
        }

        public static final class Events {

            public static final class AlertEnteredBackground {
                public static final String NAME = "AlertEnteredBackground";
            }

            public static final class AlertEnteredForeground {
                public static final String NAME = "AlertEnteredForeground";
            }

            public static final class AlertStarted {
                public static final String NAME = "AlertStarted";
            }

            public static final class AlertStopped {
                public static final String NAME = "AlertStopped";
            }

            public static final class AlertsState {
                public static final String NAME = "AlertsState";
            }

            public static final class DeleteAlertFailed {
                public static final String NAME = "DeleteAlertFailed";
            }

            public static final class DeleteAlertSucceeded {
                public static final String NAME = "DeleteAlertSucceeded";
            }

            public static final class SetAlertFailed {
                public static final String NAME = "SetAlertFailed";
            }

            public static final class SetAlertSucceeded {
                public static final String NAME = "SetAlertSucceeded";
            }
        }
    }

    public static final class AudioPlayer {
        public static final String NAMESPACE = "AudioPlayer";

        public static final class Directives {

            public static final class ClearQueue {
                public static final String NAME = "ClearQueue";
            }

            public static final class Play {
                public static final String NAME = "Play";
            }

            public static final class Stop {
                public static final String NAME = "Stop";
            }
        }

        public static final class Events {

            public static final class PlaybackFailed {
                public static final String NAME = "PlaybackFailed";
            }

            public static final class PlaybackFinished {
                public static final String NAME = "PlaybackFinished";
            }

            public static final class PlaybackNearlyFinished {
                public static final String NAME = "PlaybackNearlyFinished";
            }

            public static final class PlaybackPaused {
                public static final String NAME = "PlaybackPaused";
            }

            public static final class PlaybackQueueCleared {
                public static final String NAME = "PlaybackQueueCleared";
            }

            public static final class PlaybackResumed {
                public static final String NAME = "PlaybackResumed";
            }

            public static final class PlaybackStarted {
                public static final String NAME = "PlaybackStarted";
            }

            public static final class PlaybackState {
                public static final String NAME = "PlaybackState";
            }

            public static final class PlaybackStopped {
                public static final String NAME = "PlaybackStopped";
            }

            public static final class PlaybackStutterFinished {
                public static final String NAME = "PlaybackStutterFinished";
            }

            public static final class PlaybackStutterStarted {
                public static final String NAME = "PlaybackStutterStarted";
            }

            public static final class ProgressReportDelayElapsed {
                public static final String NAME = "ProgressReportDelayElapsed";
            }

            public static final class ProgressReportIntervalElapsed {
                public static final String NAME = "ProgressReportIntervalElapsed";
            }
        }
    }

    public static final class Notifications {
        public static final String NAMESPACE = "Notifications";

        public static final class Directives {

            public static final class ClearIndicator {
                public static final String NAME = "ClearIndicator";
            }

            public static final class SetIndicator {
                public static final String NAME = "SetIndicator";
            }
        }

        public static final class Events {

            public static final class IndicatorState {
                public static final String NAME = "IndicatorState";
            }
        }
    }

    public static final class PlaybackController {
        public static final String NAMESPACE = "PlaybackController";

        public static final class Events {

            public static final class NextCommandIssued {
                public static final String NAME = "NextCommandIssued";
            }

            public static final class PauseCommandIssued {
                public static final String NAME = "PauseCommandIssued";
            }

            public static final class PlayCommandIssued {
                public static final String NAME = "PlayCommandIssued";
            }

            public static final class PreviousCommandIssued {
                public static final String NAME = "PreviousCommandIssued";
            }
        }
    }

    public static final class Settings {
        public static final String NAMESPACE = "Settings";

        public static final class Events {

            public static final class SettingsUpdated {
                public static final String NAME = "SettingsUpdated";
            }
        }
    }

    public static final class Speaker {
        public static final String NAMESPACE = "Speaker";

        public static final class Directives {

            public static final class AdjustVolume {
                public static final String NAME = "AdjustVolume";
            }

            public static final class SetMute {
                public static final String NAME = "SetMute";
            }

            public static final class SetVolume {
                public static final String NAME = "SetVolume";
            }
        }

        public static final class Events {

            public static final class MuteChanged {
                public static final String NAME = "MuteChanged";
            }

            public static final class VolumeChanged {
                public static final String NAME = "VolumeChanged";
            }

            public static final class VolumeState {
                public static final String NAME = "VolumeState";
            }
        }
    }

    public static final class SpeechRecognizer {
        public static final String NAMESPACE = "SpeechRecognizer";

        public static final class Directives {

            public static final class ExpectSpeech {
                public static final String NAME = "ExpectSpeech";
            }

            public static final class RequestProcessingStarted {
                public static final String NAME = "RequestProcessingStarted";
            }

            public static final class StopCapture {
                public static final String NAME = "StopCapture";
            }
        }

        public static final class Events {

            public static final class ExpectSpeechTimedOut {
                public static final String NAME = "ExpectSpeechTimedOut";
            }

            public static final class Recognize {
                public static final String NAME = "Recognize";
            }
        }
    }

    public static final class SpeechSynthesizer {
        public static final String NAMESPACE = "SpeechSynthesizer";

        public static final class Directives {

            public static final class Speak {
                public static final String NAME = "Speak";
            }
        }

        public static final class Events {

            public static final class SpeechFinished {
                public static final String NAME = "SpeechFinished";
            }

            public static final class SpeechStarted {
                public static final String NAME = "SpeechStarted";
            }

            public static final class SpeechState {
                public static final String NAME = "SpeechState";
            }
        }
    }

    public static final class System {
        public static final String NAMESPACE = "System";

        public static final class Directives {

            public static final class ResetUserInactivity {
                public static final String NAME = "ResetUserInactivity";
            }

            public static final class SetEndpoint {
                public static final String NAME = "SetEndpoint";
            }
        }

        public static final class Events {

            public static final class ExceptionEncountered {
                public static final String NAME = "ExceptionEncountered";
            }

            public static final class SynchronizeState {
                public static final String NAME = "SynchronizeState";
            }

            public static final class UserInactivityReport {
                public static final String NAME = "UserInactivityReport";
            }
        }

        public static final class Exception {
            public static final String NAME = "Exception";
        }
    }

    public static final class TemplateRuntime {
        public static final String NAMESPACE = "TemplateRuntime";

        public static final class Directives {

            public static final class RenderPlayerInfo {
                public static final String NAME = "RenderPlayerInfo";
            }

            public static final class RenderTemplate {
                public static final String NAME = "RenderTemplate";
            }
        }
    }
}
