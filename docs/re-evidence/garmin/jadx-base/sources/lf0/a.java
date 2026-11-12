package lf0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import f02.j;
import gl.c;
import gl1.y;
import i3.e5;
import kd0.h6;
import l30.i0;
import lc.u0;
import o13.p;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import pf0.s;
import r70.q;
import r70.r;
import w00.b;
import w2.a0;
import yz1.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llf0/a;", "Lr70/r;", "Lmf0/a;", "stateHolder", "<init>", "(Lmf0/a;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mf0.a f112129a;

    public a(mf0.a aVar) {
        aVar.getClass();
        this.f112129a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        long j8;
        long j14;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 989113475);
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
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            b bVar = new b(a0.s(o0VarQ));
            s sVar = new s(context);
            mf0.a aVar = this.f112129a;
            gf0.a aVar2 = aVar.f118291b;
            p pVarI = bVar.i(aVar2.getHeartRateAverage());
            String strC = sVar.c(aVar2);
            String strG = e5.g(y.Q(o0VarQ, R.string.lbl_result), ", ", strC);
            d dVar = aVar.f118290a;
            String strQ = y.Q(o0VarQ, R.string.lbl_ecg_recording);
            u4.d dVar2 = c10.a.f22484y.f22489b;
            j.f67738a.getClass();
            d92.b.f58623a.getClass();
            if (d92.b.d(o0VarQ)) {
                c.f77766a.getClass();
                j8 = c.f77767b.Z;
            } else {
                c.f77766a.getClass();
                j8 = c.f77767b.f77772b0;
            }
            if (d92.b.d(o0VarQ)) {
                c.f77766a.getClass();
                j14 = c.f77767b.f77791l;
            } else {
                c.f77766a.getClass();
                j14 = c.f77767b.f77777e;
            }
            long j15 = j14;
            String str = (String) pVarI.f128594a;
            String str2 = (String) pVarI.f128595b;
            boolean zR = o0VarQ.r(context) | o0VarQ.r(aVar2);
            Object objQ = o0VarQ.q();
            if (zR) {
                objQ = new i0(9, context, aVar2);
                o0VarQ.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new i0(9, context, aVar2);
                    o0VarQ.K(objQ);
                }
            }
            o0Var = o0VarQ;
            yz1.m.a(rVar, dVar, strQ, dVar2, j8, j15, strC, str, null, strG, str2, null, (e23.a) objQ, o0Var, i15 & 14, 2304);
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(this, rVar, qVar, i14, 18);
        }
    }
}
