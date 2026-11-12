package d62;

import android.os.Parcelable;
import b21.n9;
import c42.c0;
import c42.g0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.List;
import l72.p2;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.r<Boolean, d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zd0.k.a f58013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<zd0.k.a, Unit> f58014b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(zd0.k.a aVar, e23.l<? super zd0.k.a, Unit> lVar) {
            this.f58013a = aVar;
            this.f58014b = lVar;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                x1 x1Var = p3.n.f135158a;
                b82.c.b(null, null, z3.f.c(-1786201469, new c0(28, this.f58013a, this.f58014b), mVar2), null, 0L, mVar2, 384, 27);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(zd0.k.a aVar, boolean z14, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        int i16;
        o0 o0VarE = mVar.E(-509470026);
        int i17 = i14 | ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            String str = aVar.f204043b;
            if (aVar.f204045d) {
                i15 = 25582556;
                i16 = R.string.lbl_connected;
            } else {
                i15 = 25583972;
                i16 = R.string.devices_not_connected;
            }
            p2.f111205a.h(str, com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false), null, null, null, aVar.f204045d, false, z3.f.c(195071428, new g0(aVar, 1), o0VarE), z3.f.c(-1845603677, new an1.i(z14, 12), o0VarE), null, aVar2, o0VarE, 113246208, (i17 >> 6) & 14, 604);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b((Parcelable) aVar, z14, (e23.a) aVar2, i14, 5);
        }
    }

    public static final void b(List<zd0.k.a> list, boolean z14, zd0.k.a aVar, e23.l<? super zd0.k.a, Unit> lVar, e23.a<Unit> aVar2, e23.l<? super zd0.k.a, Unit> lVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        int i15;
        boolean z15;
        e23.l<? super zd0.k.a, Unit> lVar3;
        e23.a<Unit> aVar4;
        o0 o0VarE = mVar.E(727783627);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 32 : 16;
        } else {
            z15 = z14;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            lVar3 = lVar;
            i15 |= o0VarE.r(lVar3) ? 2048 : 1024;
        } else {
            lVar3 = lVar;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            aVar4 = aVar3;
            i15 |= o0VarE.r(aVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            aVar4 = aVar3;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            z02.d.a(false, z3.f.c(1773596262, new cq0.p(aVar2, 10), o0VarE), null, null, null, z3.f.c(-2098247454, new ck0.h(aVar, lVar2, list, z15, aVar4, lVar3), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(list, z14, aVar, lVar, aVar2, lVar2, aVar3, i14);
        }
    }
}
