package com.huami.ai.speech.alexa.capability.alerts;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.google.gson.Gson;
import com.huami.ai.speech.alexa.AlexaWebApi;
import com.huami.ai.speech.alexa.AlexaWebApiKt;
import com.huami.ai.speech.alexa.entity.EventEntity;
import com.huami.ai.speech.alexa.entity.EventEntityWrapper;
import com.huami.ai.speech.alexa.entity.Header;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.ai.speech.alexa.entity.payload.TokenPayload;
import com.huami.ai.speech.alexa.entity.payload.TokensPayload;
import com.huami.ai.speech.alexa.entity.payload.VolumePayload;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\bH\u0002J\u0016\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J\u0016\u0010\u000f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/alerts/AlertsEventImpl;", "Lcom/huami/ai/speech/alexa/capability/alerts/AlertsEvent;", "", "name", "token", "", "a", "Lcom/huami/ai/speech/alexa/entity/EventEntity;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "c", "payload", "b", "", "tokens", "deleteAlertsSucceeded", "deleteAlertsFailed", "alertStarted", "alertStopped", "setAlertSucceeded", "setAlertFailed", "deleteAlertSucceeded", "deleteAlertFailed", "", "volume", "volumeChanged", "Lcom/huami/ai/speech/alexa/AlexaWebApi;", "Lcom/huami/ai/speech/alexa/AlexaWebApi;", "webApi", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "gson", "<init>", "(Lcom/huami/ai/speech/alexa/AlexaWebApi;Lcom/google/gson/Gson;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AlertsEventImpl implements AlertsEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AlexaWebApi webApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Gson gson;

    public AlertsEventImpl(@NotNull AlexaWebApi alexaWebApi, @NotNull Gson gson) {
        this.webApi = alexaWebApi;
        this.gson = gson;
    }

    private final void a(String name, String token) {
        AlexaWebApiKt.events(this.webApi, (EventEntityWrapper<Payload>) new EventEntityWrapper(c(name, token)), this.gson);
    }

    private final EventEntity<Payload> b(String name, Payload payload) {
        EventEntity.Companion companion = EventEntity.INSTANCE;
        return new EventEntity<>(Header.INSTANCE.withMessage(name, "Alerts"), payload);
    }

    private final EventEntity<Payload> c(String name, String token) {
        return b(name, new TokenPayload(token));
    }

    @Override // com.huami.ai.speech.alexa.capability.alerts.AlertsEvent
    public void alertStarted(@NotNull String token) {
        a(AVSAPIConstants.Alerts.Events.AlertStarted.NAME, token);
    }

    @Override // com.huami.ai.speech.alexa.capability.alerts.AlertsEvent
    public void alertStopped(@NotNull String token) {
        a(AVSAPIConstants.Alerts.Events.AlertStopped.NAME, token);
    }

    @Override // com.huami.ai.speech.alexa.capability.alerts.AlertsEvent
    public void deleteAlertFailed(@NotNull String token) {
        a(AVSAPIConstants.Alerts.Events.DeleteAlertFailed.NAME, token);
    }

    @Override // com.huami.ai.speech.alexa.capability.alerts.AlertsEvent
    public void deleteAlertSucceeded(@NotNull String token) {
        a(AVSAPIConstants.Alerts.Events.DeleteAlertSucceeded.NAME, token);
    }

    @Override // com.huami.ai.speech.alexa.capability.alerts.AlertsEvent
    public void deleteAlertsFailed(@NotNull List<String> tokens) {
        AlexaWebApiKt.events(this.webApi, (EventEntityWrapper<Payload>) new EventEntityWrapper(b("DeleteAlertsFailed", new TokensPayload(tokens))), this.gson);
    }

    @Override // com.huami.ai.speech.alexa.capability.alerts.AlertsEvent
    public void deleteAlertsSucceeded(@NotNull List<String> tokens) {
        AlexaWebApiKt.events(this.webApi, (EventEntityWrapper<Payload>) new EventEntityWrapper(b("DeleteAlertsSucceeded", new TokensPayload(tokens))), this.gson);
    }

    @Override // com.huami.ai.speech.alexa.capability.alerts.AlertsEvent
    public void setAlertFailed(@NotNull String token) {
        a(AVSAPIConstants.Alerts.Events.SetAlertFailed.NAME, token);
    }

    @Override // com.huami.ai.speech.alexa.capability.alerts.AlertsEvent
    public void setAlertSucceeded(@NotNull String token) {
        a(AVSAPIConstants.Alerts.Events.SetAlertSucceeded.NAME, token);
    }

    @Override // com.huami.ai.speech.alexa.capability.alerts.AlertsEvent
    public void volumeChanged(long volume) {
        AlexaWebApiKt.events(this.webApi, (EventEntityWrapper<Payload>) new EventEntityWrapper(b(AVSAPIConstants.Speaker.Events.VolumeChanged.NAME, new VolumePayload(volume))), this.gson);
    }
}
