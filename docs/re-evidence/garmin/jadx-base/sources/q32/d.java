package q32;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import f72.rd;
import f72.sd;
import gl1.y;
import lc.u0;
import mx.h;
import o53.s0;
import o70.t;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import q71.e;
import r53.i;
import r53.s;
import r70.q;
import r70.r;
import u62.z2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq32/d;", "Lr70/r;", "Lr32/a;", "stateHolder", "Lq71/e;", "vo2MaxType", "<init>", "(Lr32/a;Lq71/e;)V", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r32.a f142438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f142439b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f142440a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.CYCLING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.ROWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f142440a = iArr;
        }
    }

    public d(r32.a aVar, e eVar) {
        aVar.getClass();
        eVar.getClass();
        this.f142438a = aVar;
        this.f142439b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        int i16;
        u4.d dVarA;
        t tVar;
        int i17;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -1977250293);
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
                p32.c cVar = this.f142438a.f150092a;
                objQ = s.A(new p32.a(cVar.f135407a, cVar), s0.f129406a);
                o0VarQ.K(objQ);
            }
            o32.a aVar = (o32.a) s9.c.b((i) objQ, null, o0VarQ, 48).getF182175a();
            int[] iArr = a.f142440a;
            e eVar = this.f142439b;
            int i18 = iArr[eVar.ordinal()];
            if (i18 == 1) {
                i16 = R.string.lbl_cycling_vo2_max;
            } else if (i18 == 2) {
                i16 = R.string.lbl_vo2_max;
            } else {
                if (i18 != 3) {
                    u0.r();
                    return;
                }
                i16 = R.string.lbl_rowing_vo2_max;
            }
            int i19 = iArr[eVar.ordinal()];
            if (i19 == 1) {
                s62.a.f157643a.getClass();
                dVarA = rd.a(t62.c.f162799a);
            } else if (i19 == 2) {
                s62.a.f157643a.getClass();
                dVarA = sd.a(t62.c.f162799a);
            } else if (i19 != 3) {
                u0.r();
                return;
            } else {
                s62.a.f157643a.getClass();
                dVarA = z2.a(t62.a.f162797a);
            }
            int i24 = iArr[eVar.ordinal()];
            if (i24 == 1) {
                tVar = t.N0;
            } else if (i24 == 2) {
                tVar = t.M0;
            } else {
                if (i24 != 3) {
                    u0.r();
                    return;
                }
                tVar = t.O0;
            }
            int i25 = iArr[eVar.ordinal()];
            if (i25 == 1) {
                i17 = R.string.vo2max_cycling_card_no_data_state_message_v2;
            } else if (i25 == 2) {
                i17 = R.string.vo2max_card_no_data_state_message;
            } else {
                if (i25 != 3) {
                    u0.r();
                    return;
                }
                i17 = R.string.vo2max_indoor_rowing_card_no_data_state_message;
            }
            Parcelable.Creator<c22.i> creator = c22.i.CREATOR;
            int i26 = i15 & 14;
            c.a(rVar, tVar, y.Q(o0VarQ, i16), dVarA, y.Q(o0VarQ, i17), aVar, o0VarQ, i26);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(this, rVar, qVar, i14, 10);
        }
    }
}
