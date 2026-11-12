package com.huami.ai.speech.alexa;

import com.xiaomi.ai.core.AivsConfig;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/ai/speech/alexa/StreamMultipart;", "Lcom/huami/ai/speech/alexa/Multipart;", "", "component1", "Ljava/io/InputStream;", "component2", "contentId", AivsConfig.Tts.AUDIO_TYPE_STREAM, "copy", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "getContentId", "()Ljava/lang/String;", "c", "Ljava/io/InputStream;", "getStream", "()Ljava/io/InputStream;", "<init>", "(Ljava/lang/String;Ljava/io/InputStream;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StreamMultipart extends Multipart {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String contentId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final InputStream stream;

    public StreamMultipart(@NotNull String str, @NotNull InputStream inputStream) {
        super("application/octet-stream", null);
        this.contentId = str;
        this.stream = inputStream;
    }

    public static /* synthetic */ StreamMultipart copy$default(StreamMultipart streamMultipart, String str, InputStream inputStream, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamMultipart.contentId;
        }
        if ((i & 2) != 0) {
            inputStream = streamMultipart.stream;
        }
        return streamMultipart.copy(str, inputStream);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InputStream getStream() {
        return this.stream;
    }

    @NotNull
    public final StreamMultipart copy(@NotNull String contentId, @NotNull InputStream stream) {
        return new StreamMultipart(contentId, stream);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamMultipart)) {
            return false;
        }
        StreamMultipart streamMultipart = (StreamMultipart) other;
        return Intrinsics.areEqual(this.contentId, streamMultipart.contentId) && Intrinsics.areEqual(this.stream, streamMultipart.stream);
    }

    @NotNull
    public final String getContentId() {
        return this.contentId;
    }

    @NotNull
    public final InputStream getStream() {
        return this.stream;
    }

    public int hashCode() {
        return (this.contentId.hashCode() * 31) + this.stream.hashCode();
    }

    @NotNull
    public String toString() {
        return "StreamMultipart(contentId=" + this.contentId + ", stream=" + this.stream + ')';
    }
}
