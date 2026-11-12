package com.huami.ai.speech.alexa.http;

import com.huami.assistant.ocr.camera.CameraActivity;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Okio;
import okio.Pipe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/ai/speech/alexa/http/PipeBody;", "Lokhttp3/RequestBody;", "Lokio/BufferedSink;", "sink", "Lokhttp3/MediaType;", CameraActivity.KEY_CONTENT_TYPE, "", "writeTo", "Lokio/Pipe;", "a", "Lokio/Pipe;", "pipe", "b", "Lokio/BufferedSink;", "<init>", "()V", "Companion", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class PipeBody extends RequestBody {
    private static final long c = 8192;
    private static final long d = 10;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Pipe pipe;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final BufferedSink sink;

    public PipeBody() {
        Pipe pipe = new Pipe(8192L);
        this.pipe = pipe;
        this.sink = Okio.buffer(pipe.sink());
    }

    @Override // okhttp3.RequestBody
    @Nullable
    public MediaType contentType() {
        return MediaType.parse("application/octet-stream");
    }

    @NotNull
    public final BufferedSink sink() {
        this.sink.timeout().timeout(10L, TimeUnit.SECONDS);
        return this.sink;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull BufferedSink sink) throws IOException {
        sink.writeAll(this.pipe.source());
    }
}
