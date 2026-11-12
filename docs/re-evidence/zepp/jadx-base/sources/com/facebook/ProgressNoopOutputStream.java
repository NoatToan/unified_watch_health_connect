package com.facebook;

import android.os.Handler;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010&\u001a\u0004\u0018\u00010#¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0010H\u0016R\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/facebook/ProgressNoopOutputStream;", "Ljava/io/OutputStream;", "Lcom/facebook/RequestOutputStream;", "Lcom/facebook/GraphRequest;", "currentRequest", "", "setCurrentRequest", "", "Lcom/facebook/RequestProgress;", "getProgressMap", "", "size", "addProgress", "", "buffer", "write", "", "offset", SessionDescription.p, "oneByte", "", "a", "Ljava/util/Map;", "progressMap", "b", "Lcom/facebook/GraphRequest;", "c", "Lcom/facebook/RequestProgress;", "currentRequestProgress", "<set-?>", GoogleApiAvailabilityLight.a, LogUtil.I, "getMaxProgress", "()I", "maxProgress", "Landroid/os/Handler;", "e", "Landroid/os/Handler;", "callbackHandler", "<init>", "(Landroid/os/Handler;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ProgressNoopOutputStream extends OutputStream implements RequestOutputStream {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<GraphRequest, RequestProgress> progressMap = new HashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private GraphRequest currentRequest;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private RequestProgress currentRequestProgress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int maxProgress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Handler callbackHandler;

    public ProgressNoopOutputStream(@Nullable Handler handler) {
        this.callbackHandler = handler;
    }

    public final void addProgress(long size) {
        GraphRequest graphRequest = this.currentRequest;
        if (graphRequest != null) {
            if (this.currentRequestProgress == null) {
                RequestProgress requestProgress = new RequestProgress(this.callbackHandler, graphRequest);
                this.currentRequestProgress = requestProgress;
                this.progressMap.put(graphRequest, requestProgress);
            }
            RequestProgress requestProgress2 = this.currentRequestProgress;
            if (requestProgress2 != null) {
                requestProgress2.addToMax(size);
            }
            this.maxProgress += (int) size;
        }
    }

    public final int getMaxProgress() {
        return this.maxProgress;
    }

    @NotNull
    public final Map<GraphRequest, RequestProgress> getProgressMap() {
        return this.progressMap;
    }

    @Override // com.facebook.RequestOutputStream
    public void setCurrentRequest(@Nullable GraphRequest currentRequest) {
        this.currentRequest = currentRequest;
        this.currentRequestProgress = currentRequest != null ? this.progressMap.get(currentRequest) : null;
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] buffer) {
        addProgress(buffer.length);
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] buffer, int offset, int length) {
        addProgress(length);
    }

    @Override // java.io.OutputStream
    public void write(int oneByte) {
        addProgress(1L);
    }
}
