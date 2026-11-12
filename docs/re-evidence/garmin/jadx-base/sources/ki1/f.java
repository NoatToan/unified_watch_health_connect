package ki1;

import android.content.Context;
import android.view.View;
import b21.v4;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l72.f0;
import lc.m0;
import mp.j;
import mp.k;
import nc.y;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104829a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f104830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f104831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f104832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f104833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f104834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f104835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f104836h;

    public /* synthetic */ f(fi1.a aVar, boolean z14, Long l14, Float f14, z3.e eVar, boolean z15, e23.a aVar2, int i14) {
        this.f104832d = aVar;
        this.f104830b = z14;
        this.f104833e = l14;
        this.f104834f = f14;
        this.f104835g = eVar;
        this.f104831c = z15;
        this.f104836h = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x0219  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        int i15;
        m0 m0Var;
        int i16 = this.f104829a;
        boolean z14 = this.f104830b;
        p3.m.a aVar = p3.m.f135153a;
        Object obj3 = this.f104836h;
        Object obj4 = this.f104835g;
        Object obj5 = this.f104834f;
        Object obj6 = this.f104833e;
        Object obj7 = this.f104832d;
        switch (i16) {
            case 0:
                ((Integer) obj2).getClass();
                k.a((fi1.a) obj7, this.f104830b, (Long) obj6, (Float) obj5, (z3.e) obj4, this.f104831c, (e23.a) obj3, (p3.m) obj, p0.t(1));
                break;
            case 1:
                km0.d dVar = (km0.d) obj7;
                m0 m0Var2 = (m0) obj6;
                km0.i iVar = (km0.i) obj5;
                Context context = (Context) obj4;
                e23.r rVar = (e23.r) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    f0 f0Var = f0.f110999a;
                    if (z14) {
                        i14 = 1483949110;
                        i15 = R.string.lbl_create_group;
                    } else {
                        i14 = 1483950606;
                        i15 = R.string.lbl_next;
                    }
                    String strH = sn.a.h(mVar, i14, i15, mVar);
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    boolean zK = mVar.k(dVar.ordinal()) | mVar.r(m0Var2) | mVar.r(iVar) | mVar.r(context) | mVar.B(rVar);
                    Object objQ = mVar.q();
                    if (zK) {
                        v4 v4Var = new v4((Object) dVar, m0Var2, (Object) iVar, (Object) context, (Object) rVar, 16);
                        mVar.K(v4Var);
                        objQ = v4Var;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            v4 v4Var2 = new v4((Object) dVar, m0Var2, (Object) iVar, (Object) context, (Object) rVar, 16);
                            mVar.K(v4Var2);
                            objQ = v4Var2;
                        }
                    }
                    f0Var.d(384, 1, (e23.a) objQ, rVarF, strH, mVar, null, this.f104831c);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                final mp.k kVar = (mp.k) obj7;
                final o82.g gVar = (o82.g) obj6;
                final String str = (String) obj5;
                final i53.d dVar2 = (i53.d) obj4;
                final yp.b bVar = (yp.b) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarH = x2.h(x2.f(h4.r.S, 1.0f), pp.h.f139527a);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(rVarH, j92.b.f97899b.f97920e, 0.0f, 2);
                    Object objQ2 = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = new po2.o(9);
                        mVar2.K(objQ2);
                    }
                    e23.l lVar = (e23.l) objQ2;
                    boolean zK2 = mVar2.k(kVar.ordinal()) | mVar2.k(gVar.ordinal()) | mVar2.B(str);
                    final boolean z15 = this.f104830b;
                    boolean zH = zK2 | mVar2.h(z15);
                    final boolean z16 = this.f104831c;
                    boolean zH2 = zH | mVar2.h(z16) | mVar2.B(dVar2) | mVar2.r(bVar);
                    Object objQ3 = mVar2.q();
                    if (zH2 || objQ3 == c2565a) {
                        e23.l lVar2 = new e23.l() { // from class: pp.f
                            /* JADX WARN: Code duplicated, block: B:19:0x0077  */
                            @Override // e23.l
                            public final Object invoke(Object obj8) {
                                View view2 = (View) obj8;
                                view2.getClass();
                                up.a aVar2 = new up.a(view2, kVar, gVar, str, z15, z16, dVar2);
                                int[] iArr = up.a.C3211a.f172145a;
                                k kVar2 = aVar2.f172139a;
                                int i17 = iArr[kVar2.ordinal()];
                                yp.b bVar2 = bVar;
                                if (i17 == 1) {
                                    Boolean bool = aVar2.f172140b.get(j.MATCHES);
                                    if (bool == null) {
                                        bVar2 = null;
                                    } else if (!bool.booleanValue()) {
                                        if (bVar2 != null) {
                                            i53.d<k, List<yp.c>> dVar3 = bVar2.f198605a;
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            for (Map.Entry<k, List<yp.c>> entry : dVar3.entrySet()) {
                                                if (entry.getKey() != k.GAMES_NOT_WON) {
                                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                                }
                                            }
                                            bVar2 = new yp.b(i53.a.k(linkedHashMap));
                                        } else {
                                            bVar2 = null;
                                        }
                                    }
                                }
                                qz.a.b(aVar2.f172143e, bVar2, aVar2.f172144f, 4);
                                int i18 = up.a.C3211a.f172145a[kVar2.ordinal()];
                                if (i18 == 1 || i18 == 2 || i18 == 3 || i18 == 4) {
                                    v22.e.q(aVar2.f172142d);
                                } else {
                                    v22.e.q(aVar2.f172141c);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(lVar2);
                        objQ3 = lVar2;
                    }
                    p002j6.c.b(lVar, rVarA, (e23.l) objQ3, mVar2, 6, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ux1.j.g((String) obj7, (String) obj6, (String) obj5, this.f104830b, this.f104831c, (e23.a) obj3, (e23.a) obj4, (p3.m) obj, p0.t(196609));
                break;
            case 4:
                m0 m0Var3 = (m0) obj7;
                e23.a aVar2 = (e23.a) obj3;
                e23.a aVar3 = (e23.a) obj6;
                b63.o oVar = (b63.o) obj5;
                o82.g gVar2 = (o82.g) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    Object obj8 = z14 ? vv0.k.INSTANCE : vv0.j.INSTANCE;
                    boolean z17 = this.f104831c;
                    boolean zH3 = mVar3.h(z17) | mVar3.r(m0Var3) | mVar3.B(aVar2) | mVar3.B(aVar3) | mVar3.r(oVar) | mVar3.k(gVar2 == null ? -1 : gVar2.ordinal());
                    Object objQ4 = mVar3.q();
                    if (zH3) {
                        m0Var = m0Var3;
                        ds.e eVar = new ds.e(z17, aVar2, m0Var, aVar3, oVar, gVar2, 7);
                        mVar3.K(eVar);
                        objQ4 = eVar;
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            m0Var = m0Var3;
                            ds.e eVar2 = new ds.e(z17, aVar2, m0Var, aVar3, oVar, gVar2, 7);
                            mVar3.K(eVar2);
                            objQ4 = eVar2;
                        } else {
                            m0Var = m0Var3;
                        }
                    }
                    y.a(m0Var, obj8, null, null, null, null, null, null, null, (e23.l) objQ4, mVar3, 0, 2044);
                } else {
                    mVar3.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                vy0.v.a((String) obj7, this.f104830b, this.f104831c, (ty0.b) obj6, (e23.l) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(String str, String str2, String str3, boolean z14, boolean z15, e23.a aVar, e23.a aVar2, int i14) {
        this.f104832d = str;
        this.f104833e = str2;
        this.f104834f = str3;
        this.f104830b = z14;
        this.f104831c = z15;
        this.f104836h = aVar;
        this.f104835g = aVar2;
    }

    public /* synthetic */ f(String str, boolean z14, boolean z15, ty0.b bVar, e23.l lVar, e23.l lVar2, e23.a aVar, int i14) {
        this.f104832d = str;
        this.f104830b = z14;
        this.f104831c = z15;
        this.f104833e = bVar;
        this.f104834f = lVar;
        this.f104835g = lVar2;
        this.f104836h = aVar;
    }

    public /* synthetic */ f(mp.k kVar, o82.g gVar, String str, boolean z14, boolean z15, i53.d dVar, yp.b bVar) {
        this.f104832d = kVar;
        this.f104833e = gVar;
        this.f104834f = str;
        this.f104830b = z14;
        this.f104831c = z15;
        this.f104835g = dVar;
        this.f104836h = bVar;
    }

    public /* synthetic */ f(boolean z14, m0 m0Var, boolean z15, e23.a aVar, e23.a aVar2, b63.o oVar, o82.g gVar) {
        this.f104830b = z14;
        this.f104832d = m0Var;
        this.f104831c = z15;
        this.f104836h = aVar;
        this.f104833e = aVar2;
        this.f104834f = oVar;
        this.f104835g = gVar;
    }

    public /* synthetic */ f(boolean z14, boolean z15, km0.d dVar, m0 m0Var, km0.i iVar, Context context, e23.r rVar) {
        this.f104830b = z14;
        this.f104831c = z15;
        this.f104832d = dVar;
        this.f104833e = m0Var;
        this.f104834f = iVar;
        this.f104835g = context;
        this.f104836h = rVar;
    }
}
