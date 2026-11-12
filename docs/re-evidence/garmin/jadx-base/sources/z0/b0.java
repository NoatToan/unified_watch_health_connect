package z0;

import android.media.MediaFormat;
import android.view.Surface;
import androidx.camera.core.impl.x1;
import b0.g1;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import z0.a0.b;
import z0.a0.e;

/* JADX INFO: loaded from: classes.dex */
public class b0 implements l0.c<g1.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f200590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.i f200591b;

    public b0(a0.i iVar, m0 m0Var) {
        this.f200591b = iVar;
        this.f200590a = m0Var;
    }

    @Override // l0.c
    public final void onFailure(Throwable th3) {
        Objects.toString(th3);
        a0.i iVar = this.f200591b;
        int i14 = iVar.f200577e;
        if (i14 < iVar.f200575c) {
            iVar.f200577e = i14 + 1;
            iVar.f200578f = k0.b.d().schedule(new vg1.d(23, a0.this.f200519e, new v.b0(this, 29)), a0.f200510p0, TimeUnit.MILLISECONDS);
            return;
        }
        a0 a0Var = a0.this;
        synchronized (a0Var.f200523g) {
            try {
                switch (a0Var.f200529l) {
                    case CONFIGURING:
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        if (a0Var.f200531n != -1) {
                            a0Var.f200531n = -1;
                            x1<e0> x1Var = a0Var.f200511a;
                            e0.a aVarL = a0.l(a0Var.f200529l);
                            g1.g gVar = a0Var.f200534q;
                            k kVar = e0.f200612a;
                            x1Var.f(new k(-1, aVarL, gVar));
                        }
                        a0Var.v(a0.j.ERROR);
                        break;
                    case IDLING:
                    case RECORDING:
                    case PAUSED:
                    case STOPPING:
                    case RESETTING:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + a0Var.f200529l + ": " + th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c9 A[Catch: all -> 0x009c, TryCatch #1 {all -> 0x009c, blocks: (B:22:0x0083, B:23:0x0089, B:56:0x0107, B:25:0x008e, B:28:0x0094, B:29:0x009b, B:33:0x00a0, B:34:0x00ac, B:35:0x00bf, B:38:0x00c3, B:40:0x00c9, B:42:0x00d3, B:44:0x00e0, B:43:0x00d9, B:45:0x00e3, B:47:0x00ec, B:50:0x00f1, B:51:0x00f8, B:52:0x00f9, B:53:0x0100, B:54:0x0101), top: B:77:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3 A[Catch: all -> 0x009c, TryCatch #1 {all -> 0x009c, blocks: (B:22:0x0083, B:23:0x0089, B:56:0x0107, B:25:0x008e, B:28:0x0094, B:29:0x009b, B:33:0x00a0, B:34:0x00ac, B:35:0x00bf, B:38:0x00c3, B:40:0x00c9, B:42:0x00d3, B:44:0x00e0, B:43:0x00d9, B:45:0x00e3, B:47:0x00ec, B:50:0x00f1, B:51:0x00f8, B:52:0x00f9, B:53:0x0100, B:54:0x0101), top: B:77:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9 A[Catch: all -> 0x009c, TryCatch #1 {all -> 0x009c, blocks: (B:22:0x0083, B:23:0x0089, B:56:0x0107, B:25:0x008e, B:28:0x0094, B:29:0x009b, B:33:0x00a0, B:34:0x00ac, B:35:0x00bf, B:38:0x00c3, B:40:0x00c9, B:42:0x00d3, B:44:0x00e0, B:43:0x00d9, B:45:0x00e3, B:47:0x00ec, B:50:0x00f1, B:51:0x00f8, B:52:0x00f9, B:53:0x0100, B:54:0x0101), top: B:77:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3 A[Catch: all -> 0x009c, TryCatch #1 {all -> 0x009c, blocks: (B:22:0x0083, B:23:0x0089, B:56:0x0107, B:25:0x008e, B:28:0x0094, B:29:0x009b, B:33:0x00a0, B:34:0x00ac, B:35:0x00bf, B:38:0x00c3, B:40:0x00c9, B:42:0x00d3, B:44:0x00e0, B:43:0x00d9, B:45:0x00e3, B:47:0x00ec, B:50:0x00f1, B:51:0x00f8, B:52:0x00f9, B:53:0x0100, B:54:0x0101), top: B:77:0x0083 }] */
    @Override // l0.c
    public final void onSuccess(g1.i iVar) {
        boolean z14;
        a0.j jVar;
        g1.i iVar2 = iVar;
        Objects.toString(iVar2);
        if (iVar2 == null) {
            return;
        }
        boolean z15 = false;
        k7.h.f(a0.this.f200512a0 == this.f200590a, null);
        k7.h.f(a0.this.D == null, null);
        a0 a0Var = a0.this;
        m0 m0Var = this.f200590a;
        k0.h hVar = a0Var.f200519e;
        g1.r rVar = m0Var.f200679d;
        rVar.getClass();
        a0Var.D = rVar;
        a0Var.f200528k.f(((g1.f0) rVar.f74734h).c());
        MediaFormat mediaFormat = a0Var.D.f74731e;
        if (mediaFormat.containsKey("bitrate")) {
            mediaFormat.getInteger("bitrate");
        }
        Surface surface = m0Var.f200684i == m0.a.READY ? m0Var.f200680e : null;
        a0Var.f200543z = surface;
        a0Var.u(surface);
        y yVar = new y(a0Var);
        m0Var.f200682g = hVar;
        m0Var.f200683h = yVar;
        l0.j.a(l0.j.f(m0Var.f200687l), new z(a0Var, m0Var), hVar);
        a0 a0Var2 = a0.this;
        synchronized (a0Var2.f200523g) {
            try {
                switch (a0Var2.f200529l) {
                    case CONFIGURING:
                        a0Var2.v(a0.j.IDLING);
                        z14 = false;
                        break;
                    case PENDING_RECORDING:
                        z14 = false;
                        if (a0Var2.Y == n0.a.INACTIVE) {
                            jVar = a0Var2.f200529l;
                            a0Var2.getClass();
                            if (jVar != a0.j.PENDING_PAUSED && jVar != a0.j.PENDING_RECORDING) {
                                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
                            }
                            throw new AssertionError("Pending recording should exist when in a PENDING state.");
                        }
                        if (a0.f200502h0.contains(a0Var2.f200529l)) {
                            a0Var2.v(a0Var2.f200530m);
                        } else {
                            o2.c.l(a0Var2.f200529l, "Cannot restore non-pending state when in state ");
                        }
                        Set<a0.j> set = a0.f200502h0;
                        break;
                        break;
                    case PENDING_PAUSED:
                        z14 = true;
                        if (a0Var2.Y == n0.a.INACTIVE) {
                            jVar = a0Var2.f200529l;
                            a0Var2.getClass();
                            if (jVar != a0.j.PENDING_PAUSED) {
                                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
                            }
                            throw new AssertionError("Pending recording should exist when in a PENDING state.");
                        }
                        if (a0.f200502h0.contains(a0Var2.f200529l)) {
                            a0Var2.v(a0Var2.f200530m);
                        } else {
                            o2.c.l(a0Var2.f200529l, "Cannot restore non-pending state when in state ");
                        }
                        Set<a0.j> set2 = a0.f200502h0;
                        break;
                        break;
                    case IDLING:
                    case RESETTING:
                        throw new AssertionError("Incorrectly invoke onConfigured() in state " + a0Var2.f200529l);
                    case PAUSED:
                        z15 = true;
                    case RECORDING:
                        k7.h.f(a0Var2.n(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                        z14 = z15;
                        z15 = true;
                        break;
                    case STOPPING:
                        if (!a0Var2.f200525h) {
                            throw new AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                        }
                        z14 = false;
                        break;
                        break;
                    default:
                        z14 = false;
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z15) {
            a0.h hVar2 = a0Var2.f200532o;
            ArrayList arrayList = a0Var2.f200537t;
            if (!arrayList.isEmpty()) {
                l0.n nVarB = l0.j.b(arrayList);
                if (!nVarB.isDone()) {
                    nVarB.cancel(true);
                }
                arrayList.clear();
            }
            androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
            aVar.f6080b = dVar;
            aVar.f6079a = v.h.class;
            try {
                a0Var2.D.k(a0Var2.new b(aVar, hVar2), a0Var2.f200519e);
                aVar.f6079a = "videoEncodingFuture";
            } catch (Exception e4) {
                dVar.a(e4);
            }
            arrayList.add(dVar);
            a0Var2.m();
            l0.j.a(l0.j.b(arrayList), a0Var2.new e(), k0.b.a());
            a0Var2.D.n();
            if (z14) {
                a0Var2.D.f();
            }
        }
    }
}
