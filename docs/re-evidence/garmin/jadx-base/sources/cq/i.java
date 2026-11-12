package cq;

import android.content.Context;
import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import h5.e0;
import i3.m9;
import i3.mc;
import i3.w9;
import java.util.List;
import l72.p2;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p006l2.b2;
import p006l2.c1;
import p006l2.h1;
import p006l2.m1;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.p0;
import p3.x1;
import x5.l0;
import z2.h2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f55023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f55024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f55025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f55026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f55027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f55028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f55029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f55030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f55031j;

    public /* synthetic */ i(h4.r rVar, boolean z14, boolean z15, String str, String str2, String str3, String str4, e23.l lVar, int i14, int i15) {
        this.f55022a = 1;
        this.f55028g = rVar;
        this.f55023b = z14;
        this.f55024c = z15;
        this.f55025d = str;
        this.f55029h = str2;
        this.f55030i = str3;
        this.f55031j = str4;
        this.f55026e = lVar;
        this.f55027f = i15;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x01d4  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z14;
        int i14 = this.f55022a;
        boolean z15 = this.f55023b;
        int i15 = this.f55027f;
        Object obj3 = this.f55026e;
        Object obj4 = this.f55031j;
        Object obj5 = this.f55030i;
        Object obj6 = this.f55029h;
        Object obj7 = this.f55028g;
        Object obj8 = this.f55025d;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                u.e((List) obj7, (ActivityDetailChartDTO) obj6, (yo1.f) obj5, (mc) obj4, this.f55023b, (String) obj8, this.f55024c, (e23.l) obj3, (p3.m) obj, p0.t(1 | i15));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                da0.v.a((h4.r) obj7, this.f55023b, this.f55024c, (String) obj8, (String) obj6, (String) obj5, (String) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1), this.f55027f);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                w9.b((t2) obj7, (e23.a) obj6, (z3.e) obj5, (h4.r) obj4, this.f55023b, (e23.p) obj8, this.f55024c, (m9) obj3, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 3:
                h2 h2Var = (h2) obj7;
                b2 b2Var = (b2) obj6;
                e23.l lVar = (e23.l) obj3;
                l0 l0Var = (l0) obj5;
                x5.c0 c0Var = (x5.c0) obj4;
                g6.c cVar = (g6.c) obj8;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    c1 c1Var = new c1(b2Var, lVar, l0Var, c0Var, cVar, this.f55027f);
                    h4.r.a aVar = h4.r.S;
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(aVar, mVar);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, c1Var, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    b4.a(mVar, Integer.valueOf(iHashCode), h5.g.a.f81813j);
                    b4.b(h5.g.a.f81814k, mVar);
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    mVar.y();
                    if (b2Var.a() != m1.None && b2Var.c() != null) {
                        f5.c0 c0VarC = b2Var.c();
                        c0VarC.getClass();
                        z14 = c0VarC.isAttached() && z15;
                    }
                    h1.c(h2Var, z14, mVar, 0);
                    if (b2Var.a() == m1.Cursor && !this.f55024c && z15) {
                        mVar.C(-714666198);
                        h1.d(h2Var, mVar, 0);
                    } else {
                        mVar.C(-747377894);
                    }
                    mVar.f();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 4:
                pn1.f fVar = (pn1.f) obj7;
                km1.b bVar = (km1.b) obj6;
                Context context = (Context) obj5;
                o53.b0 b0Var = (o53.b0) obj8;
                mc mcVar = (mc) obj4;
                n1 n1Var = (n1) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    DateTime dateTimeF = km1.b.f(bVar);
                    Integer napTimeSec = bVar.getNapTimeSec();
                    fVar.f138687b.getClass();
                    String strA = b10.c.a(dateTimeF, z15);
                    if (strA.length() > 0) {
                        strA = "@".concat(strA);
                    }
                    String strA2 = fVar.a(strA, napTimeSec != null ? fVar.f138688c.c(napTimeSec.intValue()) : "");
                    p2 p2Var = p2.f111205a;
                    String strQ = gl1.y.Q(mVar2, R.string.sleep_lbl_nap);
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("label_secondary", fVar.b(context, bVar.getNapTimeSec(), km1.b.f(bVar), z15));
                    b92.a aVarB = c0235a.b();
                    boolean z16 = this.f55024c;
                    boolean zH = mVar2.h(z16);
                    int i16 = this.f55027f;
                    boolean zK = zH | mVar2.k(i16) | mVar2.r(b0Var) | mVar2.B(mcVar);
                    Object objQ = mVar2.q();
                    if (zK) {
                        pn1.c cVar2 = new pn1.c(z16, i16, b0Var, n1Var, mcVar);
                        mVar2.K(cVar2);
                        objQ = cVar2;
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            pn1.c cVar3 = new pn1.c(z16, i16, b0Var, n1Var, mcVar);
                            mVar2.K(cVar3);
                            objQ = cVar3;
                        }
                    }
                    int i17 = b92.a.f16960b;
                    p2Var.h(strQ, strA2, null, null, aVarB, false, false, null, null, null, (e23.a) objQ, mVar2, 0, 0, 1004);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).intValue();
                ya0.e0.b((String) obj8, (o90.a) obj7, (String) obj6, (e23.a) obj5, this.f55023b, (e23.a) obj4, this.f55024c, (e23.l) obj3, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, boolean z14, Object obj5, boolean z15, Object obj6, int i14, int i15) {
        this.f55022a = i15;
        this.f55028g = obj;
        this.f55029h = obj2;
        this.f55030i = obj3;
        this.f55031j = obj4;
        this.f55023b = z14;
        this.f55025d = obj5;
        this.f55024c = z15;
        this.f55026e = obj6;
        this.f55027f = i14;
    }

    public /* synthetic */ i(String str, o90.a aVar, String str2, e23.a aVar2, boolean z14, e23.a aVar3, boolean z15, e23.l lVar, int i14) {
        this.f55022a = 5;
        this.f55025d = str;
        this.f55028g = aVar;
        this.f55029h = str2;
        this.f55030i = aVar2;
        this.f55023b = z14;
        this.f55031j = aVar3;
        this.f55024c = z15;
        this.f55026e = lVar;
        this.f55027f = i14;
    }

    public /* synthetic */ i(pn1.f fVar, km1.b bVar, boolean z14, Context context, boolean z15, int i14, o53.b0 b0Var, mc mcVar, n1 n1Var) {
        this.f55022a = 4;
        this.f55028g = fVar;
        this.f55029h = bVar;
        this.f55023b = z14;
        this.f55030i = context;
        this.f55024c = z15;
        this.f55027f = i14;
        this.f55025d = b0Var;
        this.f55031j = mcVar;
        this.f55026e = n1Var;
    }

    public /* synthetic */ i(h2 h2Var, b2 b2Var, boolean z14, boolean z15, e23.l lVar, l0 l0Var, x5.c0 c0Var, g6.c cVar, int i14) {
        this.f55022a = 3;
        this.f55028g = h2Var;
        this.f55029h = b2Var;
        this.f55023b = z14;
        this.f55024c = z15;
        this.f55026e = lVar;
        this.f55030i = l0Var;
        this.f55031j = c0Var;
        this.f55025d = cVar;
        this.f55027f = i14;
    }
}
