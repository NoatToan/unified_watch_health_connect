package com.huami.ai.speech.alexa.entity;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.huami.ai.speech.alexa.entity.payload.Alert;
import com.huami.ai.speech.alexa.entity.payload.AlertsStatePayload;
import com.huami.ai.speech.alexa.entity.payload.SpeechStatePayload;
import com.huami.ai.speech.alexa.entity.payload.VolumeStatePayload;
import com.huami.ai.speech.alexa.entity.payload.WakewordPayload;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\u001e\u0010\b\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0001\u001a*\u0010\r\u001a\u00020\u0003*\u00020\u00002\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u001a\u001e\u0010\u0011\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f¨\u0006\u0012"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/AlexaEntity;", "", "wakeWord", "", "speechRecognizerContext", "", "offsetInMilliseconds", "token", "speechSynthesizerContext", "", "Lcom/huami/ai/speech/alexa/entity/payload/Alert;", "allAlerts", "activeAlerts", "alertsContext", "volume", "", "muted", "speakerContext", "speech-alexa_release"}, k = 2, mv = {1, 5, 1})
public final class AlexaEntityKtxKt {
    public static final void alertsContext(@NotNull AlexaEntity alexaEntity, @NotNull List<Alert> list, @NotNull List<Alert> list2) {
        alexaEntity.getContexts().add(new ContextEntity<>(Header.INSTANCE.normal(AVSAPIConstants.Alerts.Events.AlertsState.NAME, "Alerts"), new AlertsStatePayload(list, list2)));
    }

    public static /* synthetic */ void alertsContext$default(AlexaEntity alexaEntity, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            list2 = new ArrayList();
        }
        alertsContext(alexaEntity, list, list2);
    }

    public static final void speakerContext(@NotNull AlexaEntity alexaEntity, int i, boolean z) {
        alexaEntity.getContexts().add(new ContextEntity<>(Header.INSTANCE.normal(AVSAPIConstants.Speaker.Events.VolumeState.NAME, "Speaker"), new VolumeStatePayload(z, i)));
    }

    public static /* synthetic */ void speakerContext$default(AlexaEntity alexaEntity, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 100;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        speakerContext(alexaEntity, i, z);
    }

    public static final void speechRecognizerContext(@NotNull AlexaEntity alexaEntity, @NotNull String str) {
        alexaEntity.getContexts().add(new ContextEntity<>(Header.INSTANCE.normal("RecognizerState", "SpeechRecognizer"), new WakewordPayload(str)));
    }

    public static /* synthetic */ void speechRecognizerContext$default(AlexaEntity alexaEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "ALEXA";
        }
        speechRecognizerContext(alexaEntity, str);
    }

    public static final void speechSynthesizerContext(@NotNull AlexaEntity alexaEntity, int i, @NotNull String str) {
        alexaEntity.getContexts().add(new ContextEntity<>(Header.INSTANCE.normal(AVSAPIConstants.SpeechSynthesizer.Events.SpeechState.NAME, "SpeechSynthesizer"), new SpeechStatePayload(i, str, i > 0 ? "PLAYING " : TrainingCourse.FINISHED)));
    }

    public static /* synthetic */ void speechSynthesizerContext$default(AlexaEntity alexaEntity, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            str = "";
        }
        speechSynthesizerContext(alexaEntity, i, str);
    }
}
