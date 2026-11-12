package com.huami.ai.speech.alexa;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/ai/speech/alexa/JsonMultipart;", "Lcom/huami/ai/speech/alexa/Multipart;", "", "component1", "json", "copy", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "getJson", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class JsonMultipart extends Multipart {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String json;

    public JsonMultipart(@NotNull String str) {
        super("application/json", null);
        this.json = str;
    }

    public static /* synthetic */ JsonMultipart copy$default(JsonMultipart jsonMultipart, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jsonMultipart.json;
        }
        return jsonMultipart.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJson() {
        return this.json;
    }

    @NotNull
    public final JsonMultipart copy(@NotNull String json) {
        return new JsonMultipart(json);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof JsonMultipart) && Intrinsics.areEqual(this.json, ((JsonMultipart) other).json);
    }

    @NotNull
    public final String getJson() {
        return this.json;
    }

    public int hashCode() {
        return this.json.hashCode();
    }

    @NotNull
    public String toString() {
        return "JsonMultipart(json=" + this.json + ')';
    }
}
