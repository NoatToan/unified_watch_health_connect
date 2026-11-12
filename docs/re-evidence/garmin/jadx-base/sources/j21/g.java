package j21;

import android.content.Context;
import androidx.lifecycle.u1;
import b21.z8;
import b82.q0;
import b82.r0;
import c2.x2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.firebase.analytics.FirebaseAnalytics;
import ds.e0;
import e2.i0;
import f5.b1;
import f5.k2;
import f5.v1;
import f5.y0;
import gl1.y;
import i3.fe;
import java.util.List;
import l72.i3;
import o4.t1;
import o53.b0;
import p005kotlin.Unit;
import p006l2.a2;
import p006l2.z1;
import p13.h0;
import p3.m1;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f96657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f96658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f96659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f96660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f96661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f96662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f96663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f96664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f96665j;

    public /* synthetic */ g(h4.r rVar, String str, String str2, b92.a aVar, String str3, boolean z14, boolean z15, e23.a aVar2, e23.a aVar3, int i14) {
        this.f96656a = 0;
        this.f96660e = rVar;
        this.f96661f = str;
        this.f96662g = str2;
        this.f96664i = aVar;
        this.f96663h = str3;
        this.f96657b = z14;
        this.f96658c = z15;
        this.f96659d = aVar2;
        this.f96665j = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0083  */
    /* JADX WARN: Code duplicated, block: B:18:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:37:0x0181  */
    /* JADX WARN: Code duplicated, block: B:42:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x0257  */
    /* JADX WARN: Code duplicated, block: B:61:0x02b1  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f96656a;
        int i15 = 5;
        p3.m.a aVar = p3.m.f135153a;
        Object obj3 = this.f96662g;
        Object obj4 = this.f96665j;
        Object obj5 = this.f96659d;
        Object obj6 = this.f96661f;
        Object obj7 = this.f96664i;
        Object obj8 = this.f96663h;
        Object obj9 = this.f96660e;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                j.a((h4.r) obj9, (String) obj6, (String) obj3, (b92.a) obj7, (String) obj8, this.f96657b, this.f96658c, (e23.a) obj5, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                k2 k2Var = (k2) obj;
                g6.a aVar2 = (g6.a) obj2;
                k2Var.getClass();
                v1 v1VarQ = ((y0) h0.b0(k2Var.F0((z3.e) obj9, "collapsable"))).Q(aVar2.f75988a);
                ((m1) obj6).i(v1VarQ.f69145b);
                y0 y0Var = (y0) h0.b0(k2Var.F0(new z3.e(1439210568, true, new e11.l(this.f96657b, this.f96658c, (e23.a) obj5, (m3.r) obj3, (i0) obj8, k2Var, v1VarQ, (e23.l) obj7)), FirebaseAnalytics.Param.CONTENT));
                long j8 = aVar2.f75988a;
                return b1.h0(k2Var, g6.a.j(j8), g6.a.i(j8), new gw1.d(y0Var.Q(j8), 25, v1VarQ, (p003ji0.a) obj4));
            case 2:
                ((Integer) obj2).getClass();
                pk0.e.a((List) obj9, (String) obj6, (String) obj3, (e23.a) obj5, (e23.p) obj8, this.f96657b, this.f96658c, (e23.a) obj4, (e23.a) obj7, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                e23.a aVar3 = (e23.a) obj5;
                b0 b0Var = (b0) obj9;
                String str = (String) obj6;
                String str2 = (String) obj3;
                oe0.d dVar = (oe0.d) obj8;
                Context context = (Context) obj7;
                fe feVar = (fe) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    x0.f23314a.getClass();
                    String strW = gl1.d.W(x0.f23323a8);
                    boolean zB = mVar.B(aVar3);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new ux1.g(aVar3, 5);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ux1.g(aVar3, 5);
                            mVar.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    i53.f fVarA = i53.a.a(new i3("SAVE", y.Q(mVar, R.string.save), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean z14 = this.f96657b;
                    boolean zH = mVar.h(z14) | mVar.r(b0Var) | mVar.B(str) | mVar.B(str2) | mVar.r(dVar);
                    boolean z15 = this.f96658c;
                    boolean zH2 = zH | mVar.h(z15) | mVar.r(context);
                    Object objQ2 = mVar.q();
                    if (zH2) {
                        z8 z8Var = new z8(z14, b0Var, dVar, z15, context, feVar, str, str2, 4);
                        mVar.K(z8Var);
                        objQ2 = z8Var;
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            z8 z8Var2 = new z8(z14, b0Var, dVar, z15, context, feVar, str, str2, 4);
                            mVar.K(z8Var2);
                            objQ2 = z8Var2;
                        }
                    }
                    z02.f.e(strW, null, aVar4, fVarA, (e23.l) objQ2, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 4:
                e23.a aVar5 = (e23.a) obj5;
                b0 b0Var2 = (b0) obj9;
                String str3 = (String) obj6;
                String str4 = (String) obj3;
                oe0.s sVar = (oe0.s) obj8;
                Context context2 = (Context) obj7;
                fe feVar2 = (fe) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x0.f23314a.getClass();
                    String strW2 = gl1.d.W(x0.B8);
                    boolean zB2 = mVar2.B(aVar5);
                    Object objQ3 = mVar2.q();
                    if (zB2) {
                        objQ3 = new ux1.g(aVar5, 15);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ux1.g(aVar5, 15);
                            mVar2.K(objQ3);
                        }
                    }
                    e23.a aVar6 = (e23.a) objQ3;
                    i53.f fVarA2 = i53.a.a(new i3("SAVE", y.Q(mVar2, R.string.save), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean z16 = this.f96657b;
                    boolean zH3 = mVar2.h(z16) | mVar2.r(b0Var2) | mVar2.B(str3) | mVar2.B(str4) | mVar2.r(sVar);
                    boolean z17 = this.f96658c;
                    boolean zH4 = zH3 | mVar2.h(z17) | mVar2.r(context2);
                    Object objQ4 = mVar2.q();
                    if (zH4) {
                        z8 z8Var3 = new z8(z16, b0Var2, sVar, z17, context2, feVar2, str3, str4, 5);
                        mVar2.K(z8Var3);
                        objQ4 = z8Var3;
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            z8 z8Var4 = new z8(z16, b0Var2, sVar, z17, context2, feVar2, str3, str4, 5);
                            mVar2.K(z8Var4);
                            objQ4 = z8Var4;
                        }
                    }
                    z02.f.e(strW2, null, aVar6, fVarA2, (e23.l) objQ4, mVar2, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                h4.r rVar = (h4.r) obj9;
                m4.q qVar = (m4.q) obj8;
                e23.p pVar = (e23.p) obj7;
                String str5 = (String) obj6;
                a2 a2Var = (a2) obj5;
                a2.j jVar = (a2.j) obj4;
                String str6 = (String) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarH = x2.h(rVar, j92.b.f97899b.f97923h);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar3);
                    boolean zR = mVar3.r(qVar) | mVar3.B(pVar) | mVar3.B(str5);
                    Object objQ5 = mVar3.q();
                    if (zR) {
                        objQ5 = new q0(qVar, pVar, str5, 4);
                        mVar3.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new q0(qVar, pVar, str5, 4);
                            mVar3.K(objQ5);
                        }
                    }
                    e23.l lVar = (e23.l) objQ5;
                    boolean zR2 = mVar3.r(qVar) | mVar3.B(pVar) | mVar3.B(str5);
                    Object objQ6 = mVar3.q();
                    if (zR2) {
                        objQ6 = new q0(qVar, pVar, str5, i15);
                        mVar3.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new q0(qVar, pVar, str5, i15);
                            mVar3.K(objQ6);
                        }
                    }
                    z1 z1Var = new z1(lVar, null, null, null, (e23.l) objQ6, null, 46, null);
                    t1 t1Var = new t1(e0.e(mVar3), null);
                    boolean zB3 = mVar3.B(pVar);
                    Object objQ7 = mVar3.q();
                    if (zB3) {
                        objQ7 = new r0(pVar, 12);
                        mVar3.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new r0(pVar, 12);
                            mVar3.K(objQ7);
                        }
                    }
                    p006l2.r.a(str5, (e23.l) objQ7, rVarH, false, false, x0VarB, a2Var, z1Var, true, 0, 0, null, null, jVar, t1Var, z3.f.c(-202388605, new fv0.b(str5, jVar, str6, this.f96657b, this.f96658c, pVar, 2), mVar3), mVar3, 100663296, 7704);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(e23.a aVar, boolean z14, b0 b0Var, String str, String str2, u1 u1Var, boolean z15, Context context, fe feVar, int i14) {
        this.f96656a = i14;
        this.f96659d = aVar;
        this.f96657b = z14;
        this.f96660e = b0Var;
        this.f96661f = str;
        this.f96662g = str2;
        this.f96663h = u1Var;
        this.f96658c = z15;
        this.f96664i = context;
        this.f96665j = feVar;
    }

    public /* synthetic */ g(h4.r rVar, m4.q qVar, e23.p pVar, String str, a2 a2Var, a2.j jVar, String str2, boolean z14, boolean z15) {
        this.f96656a = 5;
        this.f96660e = rVar;
        this.f96663h = qVar;
        this.f96664i = pVar;
        this.f96661f = str;
        this.f96659d = a2Var;
        this.f96665j = jVar;
        this.f96662g = str2;
        this.f96657b = z14;
        this.f96658c = z15;
    }

    public /* synthetic */ g(List list, String str, String str2, e23.a aVar, e23.p pVar, boolean z14, boolean z15, e23.a aVar2, e23.a aVar3, int i14) {
        this.f96656a = 2;
        this.f96660e = list;
        this.f96661f = str;
        this.f96662g = str2;
        this.f96659d = aVar;
        this.f96663h = pVar;
        this.f96657b = z14;
        this.f96658c = z15;
        this.f96665j = aVar2;
        this.f96664i = aVar3;
    }

    public /* synthetic */ g(z3.e eVar, m1 m1Var, boolean z14, boolean z15, e23.a aVar, m3.s sVar, i0 i0Var, e23.l lVar, p003ji0.a aVar2) {
        this.f96656a = 1;
        this.f96660e = eVar;
        this.f96661f = m1Var;
        this.f96657b = z14;
        this.f96658c = z15;
        this.f96659d = aVar;
        this.f96662g = sVar;
        this.f96663h = i0Var;
        this.f96664i = lVar;
        this.f96665j = aVar2;
    }
}
