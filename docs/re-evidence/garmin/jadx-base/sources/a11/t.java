package a11;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class t {
    public static final void a(final int i14, final int i15, final i53.c cVar, final int i16, final int i17, final e23.l lVar, final e23.l lVar2, p3.m mVar, final int i18) {
        cVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(206949112);
        int i19 = i18 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.k(i15) ? 32 : 16) | (o0VarE.B(cVar) ? 256 : 128) | (o0VarE.k(i16) ? 2048 : 1024) | (o0VarE.k(i17) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i19 & 1, (599187 & i19) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            i53.c cVarH = ds.e0.h(i14, i15);
            b.f252a.getClass();
            r82.k.c(null, i53.a.a(new r82.p(cVarH, i16, null, null, b.f253b, 0.0f, true, true, null, null, lVar, 812, null), new r82.p(cVar, i17, null, b.f254c, null, 0.0f, true, true, null, null, lVar2, 820, null)), o0VarE, 0, 1);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(i14, i15, cVar, i16, i17, lVar, lVar2, i18) { // from class: a11.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f373a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f374b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i53.c f375c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f376d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f377e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.l f378f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.l f379g;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    t.a(this.f373a, this.f374b, this.f375c, this.f376d, this.f377e, this.f378f, this.f379g, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
