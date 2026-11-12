package com.amazon.alexa.avs.message.request;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.amazon.alexa.avs.SpeechProfile;
import com.amazon.alexa.avs.exception.DirectiveHandlingException;
import com.amazon.alexa.avs.message.DialogRequestIdHeader;
import com.amazon.alexa.avs.message.MessageIdHeader;
import com.amazon.alexa.avs.message.Payload;
import com.amazon.alexa.avs.message.request.alerts.AlertPayload;
import com.amazon.alexa.avs.message.request.audioplayer.AudioPlayerPayload;
import com.amazon.alexa.avs.message.request.audioplayer.PlaybackFailedPayload;
import com.amazon.alexa.avs.message.request.audioplayer.PlaybackStutterFinishedPayload;
import com.amazon.alexa.avs.message.request.context.AlertsStatePayload;
import com.amazon.alexa.avs.message.request.context.NotificationsStatePayload;
import com.amazon.alexa.avs.message.request.context.PlaybackStatePayload;
import com.amazon.alexa.avs.message.request.context.SpeechStatePayload;
import com.amazon.alexa.avs.message.request.context.VolumeStatePayload;
import com.amazon.alexa.avs.message.request.settings.Setting;
import com.amazon.alexa.avs.message.request.settings.SettingsUpdatedPayload;
import com.amazon.alexa.avs.message.request.speechrecognizer.SpeechRecognizerPayload;
import com.amazon.alexa.avs.message.request.speechsynthesizer.SpeechLifecyclePayload;
import com.amazon.alexa.avs.message.request.system.ExceptionEncounteredPayload;
import com.amazon.alexa.avs.message.request.system.UserInactivityReportPayload;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RequestFactory {

    public interface Request {
        RequestBody withPlaybackStatePayload(PlaybackStatePayload playbackStatePayload);
    }

    public static RequestBody createAlertsAlertEnteredBackgroundEvent(String str) {
        return createAlertsEvent(AVSAPIConstants.Alerts.Events.AlertEnteredBackground.NAME, str);
    }

    public static RequestBody createAlertsAlertEnteredForegroundEvent(String str) {
        return createAlertsEvent(AVSAPIConstants.Alerts.Events.AlertEnteredForeground.NAME, str);
    }

    public static RequestBody createAlertsAlertStartedEvent(String str) {
        return createAlertsEvent(AVSAPIConstants.Alerts.Events.AlertStarted.NAME, str);
    }

    public static RequestBody createAlertsAlertStoppedEvent(String str) {
        return createAlertsEvent(AVSAPIConstants.Alerts.Events.AlertStopped.NAME, str);
    }

    public static RequestBody createAlertsDeleteAlertEvent(String str, boolean z) {
        return z ? createAlertsEvent(AVSAPIConstants.Alerts.Events.DeleteAlertSucceeded.NAME, str) : createAlertsEvent(AVSAPIConstants.Alerts.Events.DeleteAlertFailed.NAME, str);
    }

    private static RequestBody createAlertsEvent(String str, String str2) {
        return new RequestBody(new Event(new MessageIdHeader("Alerts", str), new AlertPayload(str2)));
    }

    public static RequestBody createAlertsSetAlertEvent(String str, boolean z) {
        return z ? createAlertsEvent(AVSAPIConstants.Alerts.Events.SetAlertSucceeded.NAME, str) : createAlertsEvent(AVSAPIConstants.Alerts.Events.SetAlertFailed.NAME, str);
    }

    private static RequestBody createAudioPlayerEvent(String str, String str2, long j) {
        return new RequestBody(new Event(new MessageIdHeader("AudioPlayer", str), new AudioPlayerPayload(str2, j)));
    }

    public static RequestBody createAudioPlayerPlaybackFailedEvent(String str, PlaybackStatePayload playbackStatePayload, PlaybackFailedPayload.ErrorType errorType) {
        return new RequestBody(new Event(new MessageIdHeader("AudioPlayer", AVSAPIConstants.AudioPlayer.Events.PlaybackFailed.NAME), new PlaybackFailedPayload(str, playbackStatePayload, errorType)));
    }

    public static RequestBody createAudioPlayerPlaybackFinishedEvent(String str, long j) {
        return createAudioPlayerEvent(AVSAPIConstants.AudioPlayer.Events.PlaybackFinished.NAME, str, j);
    }

    public static RequestBody createAudioPlayerPlaybackNearlyFinishedEvent(String str, long j) {
        return createAudioPlayerEvent(AVSAPIConstants.AudioPlayer.Events.PlaybackNearlyFinished.NAME, str, j);
    }

    public static RequestBody createAudioPlayerPlaybackPausedEvent(String str, long j) {
        return createAudioPlayerEvent(AVSAPIConstants.AudioPlayer.Events.PlaybackPaused.NAME, str, j);
    }

    public static RequestBody createAudioPlayerPlaybackQueueClearedEvent() {
        return new RequestBody(new Event(new MessageIdHeader("AudioPlayer", AVSAPIConstants.AudioPlayer.Events.PlaybackQueueCleared.NAME), new Payload()));
    }

    public static RequestBody createAudioPlayerPlaybackResumedEvent(String str, long j) {
        return createAudioPlayerEvent(AVSAPIConstants.AudioPlayer.Events.PlaybackResumed.NAME, str, j);
    }

    public static RequestBody createAudioPlayerPlaybackStartedEvent(String str, long j) {
        return createAudioPlayerEvent(AVSAPIConstants.AudioPlayer.Events.PlaybackStarted.NAME, str, j);
    }

    public static RequestBody createAudioPlayerPlaybackStoppedEvent(String str, long j) {
        return createAudioPlayerEvent(AVSAPIConstants.AudioPlayer.Events.PlaybackStopped.NAME, str, j);
    }

    public static RequestBody createAudioPlayerPlaybackStutterFinishedEvent(String str, long j, long j2) {
        return new RequestBody(new Event(new MessageIdHeader("AudioPlayer", AVSAPIConstants.AudioPlayer.Events.PlaybackStutterFinished.NAME), new PlaybackStutterFinishedPayload(str, j, j2)));
    }

    public static RequestBody createAudioPlayerPlaybackStutterStartedEvent(String str, long j) {
        return createAudioPlayerEvent(AVSAPIConstants.AudioPlayer.Events.PlaybackStutterStarted.NAME, str, j);
    }

    public static RequestBody createAudioPlayerProgressReportDelayElapsedEvent(String str, long j) {
        return createAudioPlayerEvent(AVSAPIConstants.AudioPlayer.Events.ProgressReportDelayElapsed.NAME, str, j);
    }

    public static RequestBody createAudioPlayerProgressReportIntervalElapsedEvent(String str, long j) {
        return createAudioPlayerEvent(AVSAPIConstants.AudioPlayer.Events.ProgressReportIntervalElapsed.NAME, str, j);
    }

    private static RequestBody createPlaybackControllerEvent(String str, PlaybackStatePayload playbackStatePayload, SpeechStatePayload speechStatePayload, AlertsStatePayload alertsStatePayload, VolumeStatePayload volumeStatePayload) {
        return createRequestWithStates(new Event(new MessageIdHeader("PlaybackController", str), new Payload()), playbackStatePayload, speechStatePayload, alertsStatePayload, volumeStatePayload);
    }

    public static RequestBody createPlaybackControllerNextEvent(PlaybackStatePayload playbackStatePayload, SpeechStatePayload speechStatePayload, AlertsStatePayload alertsStatePayload, VolumeStatePayload volumeStatePayload) {
        return createPlaybackControllerEvent(AVSAPIConstants.PlaybackController.Events.NextCommandIssued.NAME, playbackStatePayload, speechStatePayload, alertsStatePayload, volumeStatePayload);
    }

    public static RequestBody createPlaybackControllerPauseEvent(PlaybackStatePayload playbackStatePayload, SpeechStatePayload speechStatePayload, AlertsStatePayload alertsStatePayload, VolumeStatePayload volumeStatePayload) {
        return createPlaybackControllerEvent(AVSAPIConstants.PlaybackController.Events.PauseCommandIssued.NAME, playbackStatePayload, speechStatePayload, alertsStatePayload, volumeStatePayload);
    }

    public static RequestBody createPlaybackControllerPlayEvent(PlaybackStatePayload playbackStatePayload, SpeechStatePayload speechStatePayload, AlertsStatePayload alertsStatePayload, VolumeStatePayload volumeStatePayload) {
        return createPlaybackControllerEvent(AVSAPIConstants.PlaybackController.Events.PlayCommandIssued.NAME, playbackStatePayload, speechStatePayload, alertsStatePayload, volumeStatePayload);
    }

    public static RequestBody createPlaybackControllerPreviousEvent(PlaybackStatePayload playbackStatePayload, SpeechStatePayload speechStatePayload, AlertsStatePayload alertsStatePayload, VolumeStatePayload volumeStatePayload) {
        return createPlaybackControllerEvent(AVSAPIConstants.PlaybackController.Events.PreviousCommandIssued.NAME, playbackStatePayload, speechStatePayload, alertsStatePayload, volumeStatePayload);
    }

    private static RequestBody createRequestWithStates(Event event, Payload... payloadArr) {
        LinkedList linkedList = new LinkedList();
        for (Payload payload : payloadArr) {
            if (payload != null) {
                linkedList.add(ComponentStateFactory.createComponentState(payload));
            }
        }
        return new ContextEventRequestBody(linkedList, event);
    }

    public static RequestBody createSettingsUpdatedEvent(List<Setting> list) {
        return new RequestBody(new Event(new MessageIdHeader("Settings", AVSAPIConstants.Settings.Events.SettingsUpdated.NAME), new SettingsUpdatedPayload(list)));
    }

    public static RequestBody createSpeakerEvent(String str, long j, boolean z) {
        return new RequestBody(new Event(new MessageIdHeader("Speaker", str), new VolumeStatePayload(j, z)));
    }

    public static RequestBody createSpeakerMuteChangedEvent(long j, boolean z) {
        return createSpeakerEvent(AVSAPIConstants.Speaker.Events.MuteChanged.NAME, j, z);
    }

    public static RequestBody createSpeakerVolumeChangedEvent(long j, boolean z) {
        return createSpeakerEvent(AVSAPIConstants.Speaker.Events.VolumeChanged.NAME, j, z);
    }

    public static RequestBody createSpeechRecognizerRecognizeRequest(String str, SpeechProfile speechProfile, String str2, PlaybackStatePayload playbackStatePayload, SpeechStatePayload speechStatePayload, AlertsStatePayload alertsStatePayload, VolumeStatePayload volumeStatePayload) {
        return createRequestWithStates(new Event(new DialogRequestIdHeader("SpeechRecognizer", AVSAPIConstants.SpeechRecognizer.Events.Recognize.NAME, str), new SpeechRecognizerPayload(speechProfile, str2)), playbackStatePayload, speechStatePayload, alertsStatePayload, volumeStatePayload);
    }

    private static RequestBody createSpeechSynthesizerEvent(String str, String str2) {
        return new RequestBody(new Event(new MessageIdHeader("SpeechSynthesizer", str), new SpeechLifecyclePayload(str2)));
    }

    public static RequestBody createSpeechSynthesizerSpeechFinishedEvent(String str) {
        return createSpeechSynthesizerEvent(AVSAPIConstants.SpeechSynthesizer.Events.SpeechFinished.NAME, str);
    }

    public static RequestBody createSpeechSynthesizerSpeechStartedEvent(String str) {
        return createSpeechSynthesizerEvent(AVSAPIConstants.SpeechSynthesizer.Events.SpeechStarted.NAME, str);
    }

    public static RequestBody createSystemExceptionEncounteredEvent(String str, DirectiveHandlingException.ExceptionType exceptionType, String str2, PlaybackStatePayload playbackStatePayload, SpeechStatePayload speechStatePayload, AlertsStatePayload alertsStatePayload, VolumeStatePayload volumeStatePayload) {
        return createRequestWithStates(new Event(new MessageIdHeader("System", AVSAPIConstants.System.Events.ExceptionEncountered.NAME), new ExceptionEncounteredPayload(str, exceptionType, str2)), playbackStatePayload, speechStatePayload, alertsStatePayload, volumeStatePayload);
    }

    public static RequestBody createSystemSynchronizeStateEvent(PlaybackStatePayload playbackStatePayload, SpeechStatePayload speechStatePayload, AlertsStatePayload alertsStatePayload, VolumeStatePayload volumeStatePayload, NotificationsStatePayload notificationsStatePayload) {
        return createRequestWithStates(new Event(new MessageIdHeader("System", AVSAPIConstants.System.Events.SynchronizeState.NAME), new Payload()), playbackStatePayload, speechStatePayload, alertsStatePayload, volumeStatePayload, notificationsStatePayload);
    }

    public static RequestBody createSystemUserInactivityReportEvent(long j) {
        return new RequestBody(new Event(new MessageIdHeader("System", AVSAPIConstants.System.Events.UserInactivityReport.NAME), new UserInactivityReportPayload(j)));
    }

    public static RequestBody createSystemSynchronizeStateEvent() {
        return createRequestWithStates(new Event(new MessageIdHeader("System", AVSAPIConstants.System.Events.SynchronizeState.NAME), new Payload()), new Payload[0]);
    }
}
