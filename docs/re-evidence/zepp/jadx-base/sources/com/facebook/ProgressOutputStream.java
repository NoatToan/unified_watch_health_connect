package com.facebook;

import android.os.Handler;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0#\u0012\u0006\u0010)\u001a\u00020\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R$\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0019\u0010)\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010\u0017¨\u0006."}, d2 = {"Lcom/facebook/ProgressOutputStream;", "Ljava/io/FilterOutputStream;", "Lcom/facebook/RequestOutputStream;", "", "size", "", "a", "b", "Lcom/facebook/GraphRequest;", "request", "setCurrentRequest", "", "buffer", "write", "", "offset", SessionDescription.p, "oneByte", "close", "J", "threshold", "<set-?>", "getBatchProgress", "()J", "batchProgress", "c", "lastReportedProgress", "Lcom/facebook/RequestProgress;", GoogleApiAvailabilityLight.a, "Lcom/facebook/RequestProgress;", "currentRequestProgress", "Lcom/facebook/GraphRequestBatch;", "e", "Lcom/facebook/GraphRequestBatch;", "requests", "", "f", "Ljava/util/Map;", "progressMap", "g", "getMaxProgress", "maxProgress", "Ljava/io/OutputStream;", Argument.OUT, "<init>", "(Ljava/io/OutputStream;Lcom/facebook/GraphRequestBatch;Ljava/util/Map;J)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ProgressOutputStream extends FilterOutputStream implements RequestOutputStream {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long threshold;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long batchProgress;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long lastReportedProgress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private RequestProgress currentRequestProgress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final GraphRequestBatch requests;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Map<GraphRequest, RequestProgress> progressMap;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final long maxProgress;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements Runnable {
        public final /* synthetic */ GraphRequestBatch.Callback b;

        public a(GraphRequestBatch.Callback callback) {
            this.b = callback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                ((GraphRequestBatch.OnProgressCallback) this.b).onBatchProgress(ProgressOutputStream.this.requests, ProgressOutputStream.this.getBatchProgress(), ProgressOutputStream.this.getMaxProgress());
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public ProgressOutputStream(@NotNull OutputStream outputStream, @NotNull GraphRequestBatch graphRequestBatch, @NotNull Map<GraphRequest, RequestProgress> map, long j) {
        super(outputStream);
        this.requests = graphRequestBatch;
        this.progressMap = map;
        this.maxProgress = j;
        this.threshold = FacebookSdk.getOnProgressThreshold();
    }

    private final void a(long size) {
        RequestProgress requestProgress = this.currentRequestProgress;
        if (requestProgress != null) {
            requestProgress.addProgress(size);
        }
        long j = this.batchProgress + size;
        this.batchProgress = j;
        if (j >= this.lastReportedProgress + this.threshold || j >= this.maxProgress) {
            b();
        }
    }

    private final void b() {
        if (this.batchProgress > this.lastReportedProgress) {
            for (GraphRequestBatch.Callback callback : this.requests.getCallbacks()) {
                if (callback instanceof GraphRequestBatch.OnProgressCallback) {
                    Handler callbackHandler = this.requests.getCallbackHandler();
                    if (callbackHandler != null) {
                        callbackHandler.post(new a(callback));
                    } else {
                        ((GraphRequestBatch.OnProgressCallback) callback).onBatchProgress(this.requests, this.batchProgress, this.maxProgress);
                    }
                }
            }
            this.lastReportedProgress = this.batchProgress;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        Iterator<RequestProgress> it2 = this.progressMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().reportProgress();
        }
        b();
    }

    public final long getBatchProgress() {
        return this.batchProgress;
    }

    public final long getMaxProgress() {
        return this.maxProgress;
    }

    @Override // com.facebook.RequestOutputStream
    public void setCurrentRequest(@Nullable GraphRequest request) {
        this.currentRequestProgress = request != null ? this.progressMap.get(request) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@NotNull byte[] buffer) throws IOException {
        ((FilterOutputStream) this).out.write(buffer);
        a(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@NotNull byte[] buffer, int offset, int length) throws IOException {
        ((FilterOutputStream) this).out.write(buffer, offset, length);
        a(length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int oneByte) throws IOException {
        ((FilterOutputStream) this).out.write(oneByte);
        a(1L);
    }
}
