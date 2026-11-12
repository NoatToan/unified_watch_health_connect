package aq;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i3.c5;
import i3.t4;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12299d;

    public /* synthetic */ x2(int i14, long j8, h4.r rVar, int i15) {
        this.f12296a = 2;
        this.f12298c = i14;
        this.f12297b = j8;
        this.f12299d = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f12296a;
        int i15 = this.f12298c;
        long j8 = this.f12297b;
        Object obj3 = this.f12299d;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int i16 = y2.f12312f;
                ((y2) obj3).g(j8, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 1:
                ((Integer) obj2).getClass();
                c12.c.a(this.f12297b, (i53.c) obj3, (p3.m) obj, p3.p0.t(1), this.f12298c);
                break;
            case 2:
                ((Integer) obj2).getClass();
                e70.b.a(this.f12298c, p3.p0.t(1), this.f12297b, (h4.r) obj3, (p3.m) obj);
                break;
            case 3:
                ((Integer) obj2).getClass();
                g70.c.c(this.f12298c, (Integer) obj3, this.f12297b, (p3.m) obj, p3.p0.t(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int i17 = ix0.i.f95700f;
                ((ix0.i) obj3).i(j8, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                int i18 = o81.a.f130834f;
                ((o81.a) obj3).g(j8, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            default:
                c5 c5Var = (c5) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    float f14 = ((Configuration) mVar.A(AndroidCompositionLocals_androidKt.f6041a)).screenHeightDp;
                    g6.f.a aVar = g6.f.f75994b;
                    h4.r rVarJ = c2.x2.j(h4.r.S, 0.0f, f14, 1);
                    boolean zB = mVar.B(c5Var);
                    Object objQ = mVar.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zB) {
                        objQ = new t4(c5Var, 2);
                        mVar.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new t4(c5Var, 2);
                            mVar.K(objQ);
                        }
                    }
                    e23.l lVar = (e23.l) objQ;
                    boolean zB2 = mVar.B(c5Var);
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        objQ2 = new t4(c5Var, 3);
                        mVar.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new t4(c5Var, 3);
                            mVar.K(objQ2);
                        }
                    }
                    vx.c.e(rVarJ, this.f12298c, c5Var, this.f12297b, lVar, (e23.l) objQ2, mVar, 48);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ x2(int i14, c5 c5Var, long j8) {
        this.f12296a = 6;
        this.f12298c = i14;
        this.f12299d = c5Var;
        this.f12297b = j8;
    }

    public /* synthetic */ x2(int i14, Integer num, long j8, int i15) {
        this.f12296a = 3;
        this.f12298c = i14;
        this.f12299d = num;
        this.f12297b = j8;
    }

    public /* synthetic */ x2(long j8, i53.c cVar, int i14, int i15) {
        this.f12296a = 1;
        this.f12297b = j8;
        this.f12299d = cVar;
        this.f12298c = i15;
    }

    public /* synthetic */ x2(h82.c cVar, long j8, int i14, int i15) {
        this.f12296a = i15;
        this.f12299d = cVar;
        this.f12297b = j8;
        this.f12298c = i14;
    }
}
