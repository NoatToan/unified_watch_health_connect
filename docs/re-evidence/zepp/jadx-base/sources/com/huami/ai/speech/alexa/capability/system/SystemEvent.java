package com.huami.ai.speech.alexa.capability.system;

import com.huami.ai.speech.alexa.capability.EventApi;
import com.huami.ai.speech.alexa.entity.payload.LocalesPayload;
import com.huami.ai.speech.alexa.entity.payload.SoftwareInfoPayload;
import com.huami.ai.speech.alexa.entity.payload.TimeZonePayload;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\r"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/system/SystemEvent;", "Lcom/huami/ai/speech/alexa/capability/EventApi;", "", "synchronizeState", "Lcom/huami/ai/speech/alexa/entity/payload/TimeZonePayload;", "payload", "timeZoneReport", "timeZoneChanged", "Lcom/huami/ai/speech/alexa/entity/payload/LocalesPayload;", "localsChanged", "Lcom/huami/ai/speech/alexa/entity/payload/SoftwareInfoPayload;", "softwareInfoPayload", "softwareInfo", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public interface SystemEvent extends EventApi {
    void localsChanged(@NotNull LocalesPayload payload);

    void softwareInfo(@NotNull SoftwareInfoPayload softwareInfoPayload);

    void synchronizeState();

    void timeZoneChanged(@NotNull TimeZonePayload payload);

    void timeZoneReport(@NotNull TimeZonePayload payload);
}
