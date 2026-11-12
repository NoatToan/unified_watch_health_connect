package si0;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import kg.f;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r53.i;
import r53.s;
import r70.q;
import r70.r;
import u4.d;
import u62.c4;
import u62.t;
import u62.z2;
import yi0.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsi0/b;", "Lr70/r;", "Lti0/b;", "stateHolder", "Lyi0/c;", "ftpSport", "<init>", "(Lti0/b;Lyi0/c;)V", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ti0.b f159360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f159361b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159362a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.CYCLING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.CROSS_COUNTRY_SKIING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.ROWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f159362a = iArr;
        }
    }

    public b(ti0.b bVar, c cVar) {
        bVar.getClass();
        cVar.getClass();
        this.f159360a = bVar;
        this.f159361b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        String strJ;
        d dVarA;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -1549199908);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarQ.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                ri0.d dVar = this.f159360a.f164573a;
                objQ = s.A(new ri0.a(dVar.f152808b, dVar), s0.f129406a);
                o0VarQ.K(objQ);
            }
            ti0.a aVar = (ti0.a) s9.c.b((i) objQ, null, o0VarQ, 48).getF182175a();
            int[] iArr = a.f159362a;
            c cVar = this.f159361b;
            int i16 = iArr[cVar.ordinal()];
            if (i16 == 1) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, 1572548804, R.string.lbl_cycling_ftp, o0VarQ, false);
            } else if (i16 == 2) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, 1572551558, R.string.lbl_xc_skiing_ftp, o0VarQ, false);
            } else {
                if (i16 != 3) {
                    throw f.h(o0VarQ, 1572547423, false);
                }
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, 1572553923, R.string.lbl_rowing_ftp, o0VarQ, false);
            }
            int i17 = iArr[cVar.ordinal()] == 3 ? R.string.rowing_ftp_card_no_data_state_message_2 : R.string.ftp_card_no_data_state_message;
            int i18 = iArr[cVar.ordinal()];
            if (i18 == 1) {
                s62.a.f157643a.getClass();
                dVarA = t.a(t62.a.f162797a);
            } else if (i18 == 2) {
                s62.a.f157643a.getClass();
                dVarA = c4.a(t62.a.f162797a);
            } else if (i18 != 3) {
                u0.r();
                return;
            } else {
                s62.a.f157643a.getClass();
                dVarA = z2.a(t62.a.f162797a);
            }
            si0.a.a(rVar, cVar.f197341c, strJ, dVarA, y.Q(o0VarQ, i17), aVar, o0VarQ, i15 & 14);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s70.n(this, rVar, qVar, i14, 21);
        }
    }
}
