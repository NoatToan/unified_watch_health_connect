package com.huami.ai.speech.alexa.entity.payload;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/LocalesPayload;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "", "a", "[Ljava/lang/String;", "getLocales", "()[Ljava/lang/String;", "locales", "<init>", "([Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class LocalesPayload implements Payload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("locales")
    @NotNull
    private final String[] locales;

    public LocalesPayload(@NotNull String[] strArr) {
        this.locales = strArr;
    }

    @NotNull
    public final String[] getLocales() {
        return this.locales;
    }
}
