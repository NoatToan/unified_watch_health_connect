package com.amazon.alexa.avs.message.request;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.amazon.alexa.avs.message.Header;
import com.amazon.alexa.avs.message.Payload;
import com.amazon.alexa.avs.message.request.context.AlertsStatePayload;
import com.amazon.alexa.avs.message.request.context.ComponentState;
import com.amazon.alexa.avs.message.request.context.NotificationsStatePayload;
import com.amazon.alexa.avs.message.request.context.PlaybackStatePayload;
import com.amazon.alexa.avs.message.request.context.SpeechStatePayload;
import com.amazon.alexa.avs.message.request.context.VolumeStatePayload;

/* JADX INFO: loaded from: classes2.dex */
public class ComponentStateFactory {
    public static ComponentState createAlertState(AlertsStatePayload alertsStatePayload) {
        return new ComponentState(new Header("Alerts", AVSAPIConstants.Alerts.Events.AlertsState.NAME), alertsStatePayload);
    }

    public static ComponentState createComponentState(Payload payload) {
        if (payload instanceof PlaybackStatePayload) {
            return createPlaybackState((PlaybackStatePayload) payload);
        }
        if (payload instanceof SpeechStatePayload) {
            return createSpeechState((SpeechStatePayload) payload);
        }
        if (payload instanceof AlertsStatePayload) {
            return createAlertState((AlertsStatePayload) payload);
        }
        if (payload instanceof VolumeStatePayload) {
            return createVolumeState((VolumeStatePayload) payload);
        }
        if (payload instanceof NotificationsStatePayload) {
            return createNotificationsState((NotificationsStatePayload) payload);
        }
        throw new IllegalArgumentException("Unknown payload type");
    }

    public static ComponentState createNotificationsState(NotificationsStatePayload notificationsStatePayload) {
        return new ComponentState(new Header(AVSAPIConstants.Notifications.NAMESPACE, AVSAPIConstants.Notifications.Events.IndicatorState.NAME), notificationsStatePayload);
    }

    public static ComponentState createPlaybackState(PlaybackStatePayload playbackStatePayload) {
        return new ComponentState(new Header("AudioPlayer", AVSAPIConstants.AudioPlayer.Events.PlaybackState.NAME), playbackStatePayload);
    }

    public static ComponentState createSpeechState(SpeechStatePayload speechStatePayload) {
        return new ComponentState(new Header("SpeechSynthesizer", AVSAPIConstants.SpeechSynthesizer.Events.SpeechState.NAME), speechStatePayload);
    }

    public static ComponentState createVolumeState(VolumeStatePayload volumeStatePayload) {
        return new ComponentState(new Header("Speaker", AVSAPIConstants.Speaker.Events.VolumeState.NAME), volumeStatePayload);
    }
}
