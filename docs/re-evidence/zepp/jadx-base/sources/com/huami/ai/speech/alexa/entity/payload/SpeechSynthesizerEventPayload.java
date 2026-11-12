package com.huami.ai.speech.alexa.entity.payload;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001c\u0010\u0004\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/SpeechSynthesizerEventPayload;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "component1", "token", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SpeechSynthesizerEventPayload implements Payload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("token")
    @NotNull
    private final String token;

    public SpeechSynthesizerEventPayload(@NotNull String str) {
        this.token = str;
    }

    public static /* synthetic */ SpeechSynthesizerEventPayload copy$default(SpeechSynthesizerEventPayload speechSynthesizerEventPayload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = speechSynthesizerEventPayload.token;
        }
        return speechSynthesizerEventPayload.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final SpeechSynthesizerEventPayload copy(@NotNull String token) {
        return new SpeechSynthesizerEventPayload(token);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SpeechSynthesizerEventPayload) && Intrinsics.areEqual(this.token, ((SpeechSynthesizerEventPayload) other).token);
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    @NotNull
    public String toString() {
        return "SpeechSynthesizerEventPayload(token=" + this.token + ')';
    }
}
