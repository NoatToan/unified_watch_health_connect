package com.huami.ai.speech.alexa;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J)\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/ai/speech/alexa/MultipartResponse;", "", "", "Lcom/huami/ai/speech/alexa/JsonMultipart;", "component1", "Lcom/huami/ai/speech/alexa/StreamMultipart;", "component2", "jsonParts", "streamParts", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getJsonParts", "()Ljava/util/List;", "b", "getStreamParts", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MultipartResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<JsonMultipart> jsonParts;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<StreamMultipart> streamParts;

    public MultipartResponse(@NotNull List<JsonMultipart> list, @NotNull List<StreamMultipart> list2) {
        this.jsonParts = list;
        this.streamParts = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultipartResponse copy$default(MultipartResponse multipartResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = multipartResponse.jsonParts;
        }
        if ((i & 2) != 0) {
            list2 = multipartResponse.streamParts;
        }
        return multipartResponse.copy(list, list2);
    }

    @NotNull
    public final List<JsonMultipart> component1() {
        return this.jsonParts;
    }

    @NotNull
    public final List<StreamMultipart> component2() {
        return this.streamParts;
    }

    @NotNull
    public final MultipartResponse copy(@NotNull List<JsonMultipart> jsonParts, @NotNull List<StreamMultipart> streamParts) {
        return new MultipartResponse(jsonParts, streamParts);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultipartResponse)) {
            return false;
        }
        MultipartResponse multipartResponse = (MultipartResponse) other;
        return Intrinsics.areEqual(this.jsonParts, multipartResponse.jsonParts) && Intrinsics.areEqual(this.streamParts, multipartResponse.streamParts);
    }

    @NotNull
    public final List<JsonMultipart> getJsonParts() {
        return this.jsonParts;
    }

    @NotNull
    public final List<StreamMultipart> getStreamParts() {
        return this.streamParts;
    }

    public int hashCode() {
        return (this.jsonParts.hashCode() * 31) + this.streamParts.hashCode();
    }

    @NotNull
    public String toString() {
        return "MultipartResponse(jsonParts=" + this.jsonParts + ", streamParts=" + this.streamParts + ')';
    }
}
