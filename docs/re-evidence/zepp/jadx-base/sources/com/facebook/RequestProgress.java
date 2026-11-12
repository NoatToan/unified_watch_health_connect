package com.facebook;

import android.os.Handler;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\tR$\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/facebook/RequestProgress;", "", "", "size", "", "addProgress", "addToMax", "reportProgress", "a", "J", "threshold", "<set-?>", "b", "getProgress", "()J", "progress", "c", "lastReportedProgress", GoogleApiAvailabilityLight.a, "getMaxProgress", "maxProgress", "Landroid/os/Handler;", "e", "Landroid/os/Handler;", "callbackHandler", "Lcom/facebook/GraphRequest;", "f", "Lcom/facebook/GraphRequest;", "request", "<init>", "(Landroid/os/Handler;Lcom/facebook/GraphRequest;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class RequestProgress {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long threshold = FacebookSdk.getOnProgressThreshold();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long progress;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long lastReportedProgress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long maxProgress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Handler callbackHandler;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final GraphRequest request;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements Runnable {
        public final /* synthetic */ GraphRequest.Callback a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        public a(GraphRequest.Callback callback, long j, long j2) {
            this.a = callback;
            this.b = j;
            this.c = j2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                ((GraphRequest.OnProgressCallback) this.a).onProgress(this.b, this.c);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public RequestProgress(@Nullable Handler handler, @NotNull GraphRequest graphRequest) {
        this.callbackHandler = handler;
        this.request = graphRequest;
    }

    public final void addProgress(long size) {
        long j = this.progress + size;
        this.progress = j;
        if (j >= this.lastReportedProgress + this.threshold || j >= this.maxProgress) {
            reportProgress();
        }
    }

    public final void addToMax(long size) {
        this.maxProgress += size;
    }

    public final long getMaxProgress() {
        return this.maxProgress;
    }

    public final long getProgress() {
        return this.progress;
    }

    public final void reportProgress() {
        if (this.progress > this.lastReportedProgress) {
            GraphRequest.Callback callback = this.request.getCallback();
            long j = this.maxProgress;
            if (j <= 0 || !(callback instanceof GraphRequest.OnProgressCallback)) {
                return;
            }
            long j2 = this.progress;
            Handler handler = this.callbackHandler;
            if (handler != null) {
                handler.post(new a(callback, j2, j));
            } else {
                ((GraphRequest.OnProgressCallback) callback).onProgress(j2, j);
            }
            this.lastReportedProgress = this.progress;
        }
    }
}
