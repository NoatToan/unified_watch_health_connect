package ma;

import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.hls.SampleQueueMappingException;
import com.google.common.collect.Iterables;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class m implements sa.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f117555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f117556c = -1;

    public m(o oVar, int i14) {
        this.f117555b = oVar;
        this.f117554a = i14;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v9 int, still in use, count: 2, list:
          (r7v9 int) from 0x00c1: INVOKE (r6v0 java.util.ArrayList<ma.j>), (r7v9 int) VIRTUAL call: java.util.ArrayList.get(int):java.lang.Object A[MD:(int):E (c), WRAPPED]
          (r7v9 int) from 0x00ce: PHI (r7 I:??) = (r7v3 int), (r7v9 int) binds: [B:43:0x00cc, B:41:0x00c9] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // sa.n
    public final int a(androidx.media3.exoplayer.a0 r21, androidx.media3.decoder.DecoderInputBuffer r22, int r23) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.m.a(androidx.media3.exoplayer.a0, androidx.media3.decoder.DecoderInputBuffer, int):int");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final void b() {
        fa.a.a(this.f117556c == -1);
        o oVar = this.f117555b;
        oVar.h();
        oVar.f117570k0.getClass();
        int[] iArr = oVar.f117570k0;
        int i14 = this.f117554a;
        int i15 = iArr[i14];
        if (i15 != -1) {
            boolean[] zArr = oVar.J0;
            if (zArr[i15]) {
                i15 = -2;
            } else {
                zArr[i15] = true;
            }
        } else if (oVar.Z.contains(oVar.Y.a(i14))) {
            i15 = -3;
        } else {
            i15 = -2;
        }
        this.f117556c = i15;
    }

    public final boolean c() {
        int i14 = this.f117556c;
        return (i14 == -1 || i14 == -3 || i14 == -2) ? false : true;
    }

    @Override // sa.n
    public final boolean isReady() {
        if (this.f117556c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i14 = this.f117556c;
        o oVar = this.f117555b;
        return !oVar.q() && oVar.f117581x[i14].r(oVar.P0);
    }

    @Override // sa.n
    public final void maybeThrowError() throws IOException {
        int i14 = this.f117556c;
        o oVar = this.f117555b;
        if (i14 == -2) {
            oVar.h();
            throw new SampleQueueMappingException(oVar.Y.a(this.f117554a).f8217d[0].f8386n);
        }
        if (i14 == -1) {
            oVar.s();
            return;
        }
        if (i14 != -3) {
            oVar.s();
            o.d dVar = oVar.f117581x[i14];
            DrmSession drmSession = dVar.f9626h;
            if (drmSession == null || drmSession.getState() != 1) {
                return;
            }
            DrmSession.DrmSessionException error = dVar.f9626h.getError();
            error.getClass();
            throw error;
        }
    }

    @Override // sa.n
    public final int skipData(long j8) throws Throwable {
        if (!c()) {
            return 0;
        }
        int i14 = this.f117556c;
        o oVar = this.f117555b;
        if (oVar.q()) {
            return 0;
        }
        o.d dVar = oVar.f117581x[i14];
        int iP = dVar.p(j8, oVar.P0);
        j jVar = (j) Iterables.getLast(oVar.f117573n, null);
        if (jVar != null && !jVar.L) {
            iP = Math.min(iP, jVar.d(i14) - dVar.n());
        }
        dVar.z(iP);
        return iP;
    }
}
