package com.huami.ai.speech.alexa.entity.payload;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/TokensPayload;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "", "component1", "token", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/util/List;", "getToken", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TokensPayload implements Payload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("tokens")
    @NotNull
    private final List<String> token;

    public TokensPayload(@NotNull List<String> list) {
        this.token = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TokensPayload copy$default(TokensPayload tokensPayload, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tokensPayload.token;
        }
        return tokensPayload.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.token;
    }

    @NotNull
    public final TokensPayload copy(@NotNull List<String> token) {
        return new TokensPayload(token);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TokensPayload) && Intrinsics.areEqual(this.token, ((TokensPayload) other).token);
    }

    @NotNull
    public final List<String> getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    @NotNull
    public String toString() {
        return "TokensPayload(token=" + this.token + ')';
    }
}
