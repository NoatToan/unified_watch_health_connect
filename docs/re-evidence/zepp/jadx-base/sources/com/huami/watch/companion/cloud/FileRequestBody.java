package com.huami.watch.companion.cloud;

import androidx.annotation.Nullable;
import com.huami.watch.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes16.dex */
public class FileRequestBody extends RequestBody {
    private String a;
    private MediaType b;
    private File c;
    private ProgressListener d;

    public interface ProgressListener {
        void onProgress(long j, long j2, boolean z);
    }

    public FileRequestBody(MediaType mediaType, File file) {
        this(mediaType, file, null);
    }

    public static FileRequestBody create(@Nullable MediaType mediaType, File file) {
        return create(mediaType, file, null);
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.c.length();
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws Throwable {
        long jContentLength = contentLength();
        ?? r0 = 0;
        Source source = null;
        try {
            try {
                Source source2 = Okio.source(this.c);
                try {
                    Buffer buffer = new Buffer();
                    long j = 0;
                    while (true) {
                        long j2 = source2.read(buffer, 2048L);
                        if (j2 == -1) {
                            break;
                        }
                        bufferedSink.write(buffer, j2);
                        bufferedSink.flush();
                        long j3 = j + j2;
                        ProgressListener progressListener = this.d;
                        if (progressListener != null) {
                            progressListener.onProgress(jContentLength, j3, jContentLength == j3);
                        }
                        j = j3;
                    }
                    Util.closeQuietly(source2);
                    r0 = j;
                } catch (IOException e) {
                    e = e;
                    source = source2;
                    e.printStackTrace();
                    Log.e(this.a, "writeTo:" + e.getMessage(), new Object[0]);
                    Util.closeQuietly(source);
                    r0 = source;
                } catch (Throwable th) {
                    th = th;
                    r0 = source2;
                    Util.closeQuietly((Closeable) r0);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public FileRequestBody(MediaType mediaType, File file, ProgressListener progressListener) {
        this.a = "FileRequestBody";
        this.b = mediaType;
        this.c = file;
        this.d = progressListener;
    }

    public static FileRequestBody create(@Nullable MediaType mediaType, File file, ProgressListener progressListener) {
        Objects.requireNonNull(file, "content == null");
        return new FileRequestBody(mediaType, file, progressListener);
    }
}
