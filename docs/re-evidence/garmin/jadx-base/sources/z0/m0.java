package z0;

import android.view.Surface;
import b0.g1;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f200676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f200677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1.l f200678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g1.r f200679d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f200680e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g1 f200681f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k0.h f200682g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y f200683h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f200684i = a.NOT_INITIALIZED;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ListenableFuture<Void> f200685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.concurrent.futures.b.a<Void> f200686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ListenableFuture<g1.i> f200687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.concurrent.futures.b.a<g1.i> f200688m;

    public enum a {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    public m0(g1.l lVar, Executor executor, Executor executor2) {
        IllegalStateException illegalStateException = new IllegalStateException("Cannot close the encoder before configuring.");
        l0.j.a aVar = l0.j.f107810a;
        this.f200685j = new l0.m.a(illegalStateException);
        this.f200686k = null;
        this.f200687l = new l0.m.a(new IllegalStateException("Cannot close the encoder before configuring."));
        this.f200688m = null;
        this.f200676a = executor2;
        this.f200677b = executor;
        this.f200678c = lVar;
    }

    public final void a() {
        int iOrdinal = this.f200684i.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            b();
            return;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            Objects.toString(this.f200684i);
            this.f200684i = a.PENDING_RELEASE;
        } else {
            if (iOrdinal == 4) {
                return;
            }
            wr.g.x("State ", this.f200684i, " is not handled");
        }
    }

    public final void b() {
        int iOrdinal = this.f200684i.ordinal();
        if (iOrdinal == 0) {
            this.f200684i = a.RELEASED;
            return;
        }
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            a aVar = this.f200684i;
            if (iOrdinal == 4) {
                Objects.toString(aVar);
                return;
            } else {
                kg.f.o("State ", aVar, " is not handled");
                return;
            }
        }
        this.f200684i = a.RELEASED;
        this.f200688m.b(this.f200679d);
        this.f200681f = null;
        g1.r rVar = this.f200679d;
        if (rVar == null) {
            this.f200686k.b(null);
            return;
        }
        Objects.toString(rVar);
        this.f200679d.g();
        this.f200679d.f74736j.addListener(new g0(this, 1), this.f200677b);
        this.f200679d = null;
    }

    public final String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f200681f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
