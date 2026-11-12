package com.google.android.exoplayer2;

import defpackage.wlq;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v.c f7866a = new v.c();

    @Override // com.google.android.exoplayer2.q
    public final void I(m mVar) {
        V(Collections.singletonList(mVar));
    }

    @Override // com.google.android.exoplayer2.q
    public final int L() {
        v vVarC = C();
        if (vVarC.q()) {
            return -1;
        }
        return vVarC.l(y(), S(), P());
    }

    @Override // com.google.android.exoplayer2.q
    public final int N() {
        v vVarC = C();
        if (vVarC.q()) {
            return -1;
        }
        return vVarC.e(y(), S(), P());
    }

    public q.b Q(q.b bVar) {
        boolean z = false;
        q.b.a aVarD = new q.b.a().b(bVar).d(3, !a()).d(4, x() && !a()).d(5, T() && !a());
        if (U() && !a()) {
            z = true;
        }
        return aVarD.d(6, z).d(7, !a()).e();
    }

    public final int R() {
        long jM = M();
        long duration = getDuration();
        if (jM == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return wlq.r((int) ((jM * 100) / duration), 0, 100);
    }

    public final int S() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    public final boolean T() {
        return N() != -1;
    }

    public final boolean U() {
        return L() != -1;
    }

    public final void V(List<m> list) {
        g(list, true);
    }

    @Override // com.google.android.exoplayer2.q
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && n() && B() == 0;
    }

    @Override // com.google.android.exoplayer2.q
    public final boolean l(int i) {
        return H().b(i);
    }

    @Override // com.google.android.exoplayer2.q
    public final void pause() {
        z(false);
    }

    @Override // com.google.android.exoplayer2.q
    public final void play() {
        z(true);
    }

    @Override // com.google.android.exoplayer2.q
    public final long q() {
        v vVarC = C();
        if (vVarC.q()) {
            return -9223372036854775807L;
        }
        return vVarC.n(y(), this.f7866a).d();
    }

    @Override // com.google.android.exoplayer2.q
    public final void seekTo(long j) {
        G(y(), j);
    }

    @Override // com.google.android.exoplayer2.q
    public final void stop() {
        p(false);
    }

    @Override // com.google.android.exoplayer2.q
    public final boolean x() {
        v vVarC = C();
        return !vVarC.q() && vVarC.n(y(), this.f7866a).h;
    }
}
