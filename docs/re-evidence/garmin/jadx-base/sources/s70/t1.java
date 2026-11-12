package s70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import n70.u5;
import n70.v5;
import n70.w5;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p3.p2;
import v62.fa;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls70/t1;", "Lr70/r;", "Ly70/t;", "stateHolder", "<init>", "(Ly70/t;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t1 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.t f157805a;

    public t1(y70.t tVar) {
        tVar.getClass();
        this.f157805a = tVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bb  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, 313003832);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            y70.t tVar = this.f157805a;
            boolean zB = o0VarQ.B(tVar);
            Object objQ = o0VarQ.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                w5 w5Var = tVar.f194681a;
                l70.m0 m0VarA = w5Var.f124716a.a();
                r53.c2 c2Var = new r53.c2(new u5(w5Var, null));
                x53.c cVar = o53.s0.f129406a;
                objQ = r53.s.l(m0VarA, r53.s.A(c2Var, x53.b.f189152a), new r53.k(new p13.y0(w5Var.f124718c.h(c80.s0.HOME_MAINTENANCE, new z81.b(5)))), new v5(w5Var, null));
                o0VarQ.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    w5 w5Var2 = tVar.f194681a;
                    l70.m0 m0VarA2 = w5Var2.f124716a.a();
                    r53.c2 c2Var2 = new r53.c2(new u5(w5Var2, null));
                    x53.c cVar2 = o53.s0.f129406a;
                    objQ = r53.s.l(m0VarA2, r53.s.A(c2Var2, x53.b.f189152a), new r53.k(new p13.y0(w5Var2.f124718c.h(c80.s0.HOME_MAINTENANCE, new z81.b(5)))), new v5(w5Var2, null));
                    o0VarQ.K(objQ);
                }
            }
            o70.v vVar = (o70.v) s9.c.b((r53.i) objQ, null, o0VarQ, 48).getF182175a();
            if (vVar == null) {
                o0VarQ.C(323625303);
                o0VarQ.g0(false);
            } else {
                c80.o0 o0Var = vVar.f130107d;
                o0VarQ.C(323625304);
                if (o0Var != null) {
                    o0VarQ.C(-141371246);
                    l72.s sVar = l72.s.f111232a;
                    d92.b.f58623a.getClass();
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    bVar.getClass();
                    float f15 = eVar.f97920e;
                    bVar.getClass();
                    h4.r rVarC = c2.l.C(rVar, f14, eVar.f97920e, f15, 0.0f, 8);
                    Object objQ2 = o0VarQ.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = new s5.e0(22);
                        o0VarQ.K(objQ2);
                    }
                    h4.r rVarC2 = p5.v.c((e23.l) objQ2, rVarC, true);
                    l72.s.b bVar2 = l72.s.b.CAUTION;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = fa.a(t62.b.f162798a);
                    String str = o0Var.f25506b;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    String str3 = o0Var.f25507c;
                    String str4 = o0Var.f25508d;
                    boolean zR = o0VarQ.r(vVar) | o0VarQ.r(context);
                    Object objQ3 = o0VarQ.q();
                    if (zR || objQ3 == c2565a) {
                        objQ3 = new j1(1, vVar, context);
                        o0VarQ.K(objQ3);
                    }
                    sVar.d(rVarC2, bVar2, dVarA, str2, str3, str4, (e23.a) objQ3, null, o0VarQ, 113246256, 0);
                    o0VarQ = o0VarQ;
                    o0VarQ.g0(false);
                    z14 = false;
                } else {
                    o0VarQ.C(-140430086);
                    String str5 = ((zy0.l) KoinJavaComponent.get$default(zy0.l.class, null, null, 6, null)).f() ? "https://connect.garmin.cn/status/" : "https://connect.garmin.com/status/";
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f16 = eVar2.f97920e;
                    bVar3.getClass();
                    float f17 = eVar2.f97920e;
                    bVar3.getClass();
                    z14 = false;
                    h4.r rVarC3 = c2.l.C(rVar, f16, eVar2.f97920e, f17, 0.0f, 8);
                    boolean zR2 = o0VarQ.r(context) | o0VarQ.r(vVar) | o0VarQ.B(str5);
                    Object objQ4 = o0VarQ.q();
                    if (zR2) {
                        objQ4 = new q42.v(context, 27, vVar, str5);
                        o0VarQ.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new q42.v(context, 27, vVar, str5);
                            o0VarQ.K(objQ4);
                        }
                    }
                    h4.r rVarD = u1.w.d(rVarC3, false, null, null, (e23.a) objQ4, 15);
                    String str6 = vVar.f130104a;
                    str6.getClass();
                    u1.a(0, rVarD, str6, o0VarQ);
                    o0VarQ.g0(false);
                }
                o0VarQ.g0(z14);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, rVar, qVar, i14, 15);
        }
    }
}
