package x0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.impl.utils.InterruptedRuntimeException;
import b0.x;
import com.google.common.util.concurrent.ListenableFuture;
import h0.r0;
import j0.u;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import k7.h;
import l0.j;
import l0.m;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v.b0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lx0/c;", "Ll0/c;", "Ljava/lang/Void;", "camera-lifecycle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements l0.c<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f188210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f188211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f188212c;

    public c(d dVar, x xVar, Context context) {
        this.f188210a = dVar;
        this.f188211b = xVar;
        this.f188212c = context;
    }

    @Override // l0.c
    public final void onFailure(Throwable th3) {
        ListenableFuture<Void> listenableFuture;
        d dVar = this.f188210a;
        dVar.getClass();
        b0 b0Var = new b0(dVar, 20);
        if (u.b()) {
            b0Var.run();
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            h.f(new Handler(Looper.getMainLooper()).post(new r0(17, b0Var, countDownLatch)), "Unable to post to main thread");
            try {
                if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Timeout to wait main thread execution");
                }
            } catch (InterruptedException e4) {
                throw new InterruptedRuntimeException(e4);
            }
        }
        x xVar = dVar.f188217e;
        if (xVar != null) {
            synchronized (xVar.f14090b) {
                try {
                    xVar.f14093e.removeCallbacksAndMessages("retry_token");
                    int iOrdinal = xVar.f14103o.ordinal();
                    if (iOrdinal == 0) {
                        xVar.f14103o = x.a.SHUTDOWN;
                        j.a aVar = j.f107810a;
                        listenableFuture = m.c.f107817b;
                    } else {
                        if (iOrdinal == 1) {
                            throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                        }
                        if (iOrdinal == 2 || iOrdinal == 3) {
                            xVar.f14103o = x.a.SHUTDOWN;
                            x.a(xVar.f14105q);
                            xVar.f14104p = androidx.concurrent.futures.b.a(new a73.j(xVar, 26));
                        }
                        listenableFuture = xVar.f14104p;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } else {
            j.a aVar2 = j.f107810a;
            listenableFuture = m.c.f107817b;
        }
        listenableFuture.getClass();
        synchronized (dVar.f188213a) {
            dVar.f188214b = null;
            dVar.f188215c = listenableFuture;
            dVar.f188219g.clear();
            dVar.f188220h.clear();
            Unit unit = Unit.INSTANCE;
        }
        dVar.f188217e = null;
        dVar.f188218f = null;
    }

    @Override // l0.c
    public final void onSuccess(Void r14) {
        x xVar = this.f188211b;
        d dVar = this.f188210a;
        dVar.f188217e = xVar;
        dVar.f188218f = j0.f.a(this.f188212c);
    }
}
