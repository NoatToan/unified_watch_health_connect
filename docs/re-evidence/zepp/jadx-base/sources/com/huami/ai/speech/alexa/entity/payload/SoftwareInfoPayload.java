package com.huami.ai.speech.alexa.entity.payload;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/SoftwareInfoPayload;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "a", "Ljava/lang/String;", "getFirmwareVersion", "()Ljava/lang/String;", "firmwareVersion", "<init>", "(Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class SoftwareInfoPayload implements Payload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("firmwareVersion")
    @NotNull
    private final String firmwareVersion;

    public SoftwareInfoPayload(@NotNull String str) {
        this.firmwareVersion = str;
    }

    @NotNull
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }
}
