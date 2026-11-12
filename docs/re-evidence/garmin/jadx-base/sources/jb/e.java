package jb;

import bb.g0;
import bb.h0;
import bb.l0;
import bb.p;
import bb.x;

/* JADX INFO: loaded from: classes.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f98093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f98094b;

    public class a extends x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g0 f98095b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g0 g0Var, g0 g0Var2) {
            super(g0Var);
            this.f98095b = g0Var2;
        }

        @Override // bb.x, bb.g0
        public final g0.a getSeekPoints(long j8) {
            g0.a seekPoints = this.f98095b.getSeekPoints(j8);
            h0 h0Var = seekPoints.f17174a;
            long j14 = h0Var.f17186a;
            long j15 = h0Var.f17187b;
            e eVar = e.this;
            h0 h0Var2 = new h0(j14, j15 + eVar.f98093a);
            h0 h0Var3 = seekPoints.f17175b;
            return new g0.a(h0Var2, new h0(h0Var3.f17186a, h0Var3.f17187b + eVar.f98093a));
        }
    }

    public e(long j8, p pVar) {
        this.f98093a = j8;
        this.f98094b = pVar;
    }

    @Override // bb.p
    public final void a(g0 g0Var) {
        this.f98094b.a(new a(g0Var, g0Var));
    }

    @Override // bb.p
    public final void endTracks() {
        this.f98094b.endTracks();
    }

    @Override // bb.p
    public final l0 track(int i14, int i15) {
        return this.f98094b.track(i14, i15);
    }
}
