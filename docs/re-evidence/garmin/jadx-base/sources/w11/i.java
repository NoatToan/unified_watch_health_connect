package w11;

import b63.v;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.fe;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import s70.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.r<Boolean, d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f181228a;

        public a(e23.a<Unit> aVar) {
            this.f181228a = aVar;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                x1 x1Var = p3.n.f135158a;
                b82.c.b(null, null, z3.f.c(1733494252, new a0(this.f181228a, 28), mVar2), null, 0L, mVar2, 384, 27);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(x11.f fVar, v21.e eVar, fe feVar, e23.l<? super v, Unit> lVar, e23.l<? super b11.l, Unit> lVar2, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        e23.l<? super b11.l, Unit> lVar3;
        o0 o0Var;
        fVar.getClass();
        eVar.getClass();
        feVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -1090073436);
        if ((i14 & 6) == 0) {
            i15 = (o0VarP.r(fVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarP.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarP.B(feVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarP.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            lVar3 = lVar2;
            i15 |= o0VarP.r(lVar3) ? 16384 : 8192;
        } else {
            lVar3 = lVar2;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarP.r(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarP.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarP.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarP;
            z02.d.a(fVar.f188409e, z3.f.c(92187881, new a0(aVar2, 27), o0VarP), z3.f.c(1917823658, new p21.b(feVar, 24), o0VarP), null, null, z3.f.c(-1195203603, new sg2.g(22, aVar, lVar3, fVar, eVar, lVar), o0VarP), o0Var, 197040, 24);
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(fVar, eVar, feVar, lVar, lVar2, aVar, aVar2, i14, 27);
        }
    }
}
