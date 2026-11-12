package bt1;

import android.content.Context;
import b82.a1;
import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.gms.stats.CodePackage;
import gl1.y;
import h5.e0;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import ky0.v0;
import l72.i3;
import l72.p2;
import l72.w1;
import o4.m1;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import ub1.i;
import ug2.x;
import w2.a0;
import yc.z0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f21119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f21122f;

    public /* synthetic */ m(int i14, e23.a aVar, e23.a aVar2, h4.r rVar, String str, boolean z14) {
        this.f21117a = 29;
        this.f21120d = rVar;
        this.f21118b = str;
        this.f21122f = aVar;
        this.f21121e = aVar2;
        this.f21119c = z14;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    private final Object a(Object obj, Object obj2) {
        boolean z14;
        jq1.g gVar = (jq1.g) this.f21120d;
        String str = (String) this.f21118b;
        e23.l lVar = (e23.l) this.f21121e;
        e23.l lVar2 = (e23.l) this.f21122f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            w1 w1Var = w1.TopEnd;
            l72.x1 x1Var2 = l72.x1.EndMedium;
            long j8 = (((long) (-248)) << 32) | (((long) 60) & 4294967295L);
            g6.k.a aVar = g6.k.f76003b;
            if (gVar != null) {
                List<Long> list = pq1.i.f139597a;
                List<jq1.f> list2 = gVar.f100010b;
                Object obj3 = null;
                if (list2 != null) {
                    for (Object obj4 : list2) {
                        Integer num = ((jq1.f) obj4).f100004c;
                        if ((num != null ? num.intValue() : 0) > 0) {
                            obj3 = obj4;
                            break;
                        }
                    }
                    obj3 = (jq1.f) obj3;
                }
                z14 = obj3 != null;
            }
            boolean z15 = z14 ? this.f21119c : false;
            boolean zB = mVar.B(lVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new me2.d(lVar, 29);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new me2.d(lVar, 29);
                    mVar.K(objQ);
                }
            }
            a1.a(str, w1Var, x1Var2, 220, j8, z15, (e23.a) objQ, z3.f.c(-1521863242, new ng2.i(gVar, 22, lVar, lVar2), mVar), mVar, 100691328, 2);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    private final Object b(Object obj, Object obj2) {
        String str = (String) this.f21118b;
        e23.a aVar = (e23.a) this.f21122f;
        i53.f fVar = (i53.f) this.f21120d;
        e23.a aVar2 = (e23.a) this.f21121e;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            boolean zB = mVar.B(aVar);
            Object objQ = mVar.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zB) {
                objQ = new t21.a(aVar, 19);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new t21.a(aVar, 19);
                    mVar.K(objQ);
                }
            }
            e23.a aVar4 = (e23.a) objQ;
            boolean z14 = this.f21119c;
            boolean zH = mVar.h(z14) | mVar.B(aVar2) | mVar.B(aVar);
            Object objQ2 = mVar.q();
            if (zH) {
                objQ2 = new ad0.f(z14, aVar2, aVar, 22);
                mVar.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ad0.f(z14, aVar2, aVar, 22);
                    mVar.K(objQ2);
                }
            }
            z02.f.d(str, null, null, aVar4, fVar, null, (e23.l) objQ2, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:151:0x063f  */
    /* JADX WARN: Code duplicated, block: B:196:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:235:0x096e  */
    /* JADX WARN: Code duplicated, block: B:274:0x0a2e  */
    /* JADX WARN: Code duplicated, block: B:282:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:324:0x0b46  */
    /* JADX WARN: Code duplicated, block: B:329:0x0b5d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0280  */
    /* JADX WARN: Code duplicated, block: B:70:0x02b2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z14;
        sh0.c.d dVar;
        List<sh0.c.d> listD;
        Object obj3;
        boolean z15;
        z42.f fVar;
        Object obj4;
        i53.c cVarB;
        int i14 = this.f21117a;
        int i15 = 5;
        int i16 = 6;
        boolean z16 = this.f21119c;
        p3.m.a aVar = p3.m.f135153a;
        Object obj5 = this.f21121e;
        Object obj6 = this.f21122f;
        Object obj7 = this.f21118b;
        final int i17 = 1;
        Object obj8 = this.f21120d;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                n.a((h4.r) obj8, (String) obj7, (String) obj5, this.f21119c, (e23.a) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                c21.e.a((String) obj7, this.f21119c, (b63.v) obj8, (e23.l) obj5, (e23.l) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                sh0.d dVar2 = (sh0.d) obj8;
                String str = (String) obj7;
                e23.l lVar = (e23.l) obj5;
                e23.l lVar2 = (e23.l) obj6;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    w1 w1Var = w1.TopEnd;
                    l72.x1 x1Var2 = l72.x1.EndMedium;
                    long j8 = (((long) (-248)) << 32) | (((long) 60) & 4294967295L);
                    g6.k.a aVar2 = g6.k.f76003b;
                    if (dVar2 == null) {
                        z14 = false;
                    } else {
                        sh0.c cVar = dVar2.f159292a;
                        if (cVar == null || (listD = cVar.d()) == null) {
                            dVar = null;
                        } else {
                            Iterator<T> it = listD.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    sh0.c.d dVar3 = (sh0.c.d) next;
                                    Double d14 = dVar3.f159290c;
                                    if ((d14 != null ? d14.doubleValue() : -1.0d) <= 0.0d) {
                                        Double d15 = dVar3.f159291d;
                                        if ((d15 != null ? d15.doubleValue() : -1.0d) > 0.0d) {
                                        }
                                    }
                                    obj3 = next;
                                } else {
                                    obj3 = null;
                                }
                            }
                            dVar = (sh0.c.d) obj3;
                        }
                        if (dVar != null) {
                            z14 = z16;
                        } else {
                            z14 = false;
                        }
                    }
                    boolean zB = mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new a40.a(lVar, 22);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a40.a(lVar, 22);
                            mVar.K(objQ);
                        }
                    }
                    a1.a(str, w1Var, x1Var2, 220, j8, z14, (e23.a) objQ, z3.f.c(-1369253070, new a42.a(dVar2, lVar, lVar2, 13), mVar), mVar, 100691328, 2);
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ck0.p.a((h4.r) obj8, (b63.o) obj7, this.f21119c, (b63.o) obj5, (pi0.a) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                cv1.k.b((h4.r) obj8, (String) obj7, (hv1.c) obj5, this.f21119c, (e23.a) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                z42.g gVar = (z42.g) obj8;
                String str2 = (String) obj7;
                e23.a aVar3 = (e23.a) obj6;
                e23.l lVar3 = (e23.l) obj5;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    w1 w1Var2 = w1.TopEnd;
                    l72.x1 x1Var5 = l72.x1.EndMedium;
                    long j14 = (((long) (-248)) << 32) | (((long) 60) & 4294967295L);
                    g6.k.a aVar4 = g6.k.f76003b;
                    if (gVar == null) {
                        z15 = false;
                    } else {
                        List<z42.f> list = gVar.f202397b;
                        if (list != null) {
                            Iterator<T> it3 = list.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    Integer pushes = ((z42.f) next2).getPushes();
                                    if ((pushes != null ? pushes.intValue() : 0) > 0) {
                                        obj4 = next2;
                                    }
                                } else {
                                    obj4 = null;
                                }
                            }
                            fVar = (z42.f) obj4;
                        } else {
                            fVar = null;
                        }
                        if (fVar != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    boolean z17 = z15 ? z16 : false;
                    boolean zB2 = mVar2.B(aVar3);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new e52.c(aVar3, 1);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e52.c(aVar3, 1);
                            mVar2.K(objQ2);
                        }
                    }
                    a1.a(str2, w1Var2, x1Var5, 220, j14, z17, (e23.a) objQ2, z3.f.c(1430841205, new a42.a(gVar, 18, aVar3, lVar3), mVar2), mVar2, 100691328, 2);
                    x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ea0.f.b((gv.a) obj8, this.f21119c, (e23.l) obj7, (e23.a) obj6, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                e23.a aVar5 = (e23.a) obj6;
                h2.b bVar = (h2.b) obj8;
                zc.d dVar4 = (zc.d) obj7;
                e23.l lVar4 = (e23.l) obj5;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    String strQ = y.Q(mVar3, R.string.title_photos);
                    if (z16) {
                        mVar3.C(1115918765);
                        mVar3.f();
                        cVarB = j53.l.b();
                    } else {
                        mVar3.C(1115563598);
                        cVarB = i53.a.a(new i3("menu_item_report_image", y.Q(mVar3, R.string.trail_detail_report_image_button), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        mVar3.f();
                    }
                    boolean zB3 = mVar3.B(bVar) | mVar3.r(dVar4) | mVar3.B(lVar4);
                    Object objQ3 = mVar3.q();
                    if (zB3) {
                        objQ3 = new ci0.b(bVar, 18, dVar4, lVar4);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ci0.b(bVar, 18, dVar4, lVar4);
                            mVar3.K(objQ3);
                        }
                    }
                    z02.f.d(strQ, null, null, aVar5, null, cVarB, (e23.l) objQ3, mVar3, 2097152, 54);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ew0.d.a((ew0.m) obj8, this.f21119c, (e23.a) obj6, (e23.a) obj7, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                ew0.h.a((ew0.k) obj8, this.f21119c, (x) obj7, (x) obj5, (e23.a) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                g3 g3Var = (g3) obj8;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.e) obj7;
                final Context context = (Context) obj5;
                final ub1.i iVar = (ub1.i) obj6;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    p2 p2Var = p2.f111205a;
                    String strQ2 = y.Q(mVar4, R.string.home_screen_insights);
                    h4.r.a aVar6 = h4.r.S;
                    boolean z18 = g3Var.f35300a != fw.p.LOADING;
                    p5.l.f136032b.getClass();
                    p5.l lVarA = p5.l.a(p5.l.f136034d);
                    boolean zR = mVar4.r(eVar);
                    Object objQ4 = mVar4.q();
                    if (zR) {
                        objQ4 = new fk0.b(eVar, false ? 1 : 0);
                        mVar4.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new fk0.b(eVar, false ? 1 : 0);
                            mVar4.K(objQ4);
                        }
                    }
                    boolean z19 = this.f21119c;
                    h4.r rVarB = j2.g.b(aVar6, z19, z18, lVarA, (e23.l) objQ4, 8);
                    Object objQ5 = mVar4.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ5 == c2565a) {
                        objQ5 = new fh0.b(4);
                        mVar4.K(objQ5);
                    }
                    p2Var.g(strQ2, p5.v.c((e23.l) objQ5, rVarB, false), null, null, z3.f.c(1884573285, new an1.i(z19, 21), mVar4), false, false, null, mVar4, 24576, 492);
                    String strQ3 = y.Q(mVar4, R.string.device_setting_language);
                    Object objQ6 = mVar4.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new fh0.b(5);
                        mVar4.K(objQ6);
                    }
                    h4.r rVarC = p5.v.c((e23.l) objQ6, aVar6, false);
                    boolean zR2 = mVar4.r(context) | mVar4.r(iVar);
                    Object objQ7 = mVar4.q();
                    if (zR2 || objQ7 == c2565a) {
                        final int i18 = false ? 1 : 0;
                        objQ7 = new e23.a() { // from class: fk0.c
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        i iVar2 = iVar;
                                        Context context2 = context;
                                        context2.startActivity(iVar2.a(context2));
                                        break;
                                    default:
                                        i iVar3 = iVar;
                                        Context context3 = context;
                                        context3.startActivity(iVar3.b(context3));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar4.K(objQ7);
                    }
                    p2Var.g(strQ3, rVarC, null, null, null, false, false, (e23.a) objQ7, mVar4, 0, 252);
                    String strQ4 = y.Q(mVar4, R.string.lbl_data_privacy);
                    Object objQ8 = mVar4.q();
                    if (objQ8 == c2565a) {
                        objQ8 = new fh0.b(6);
                        mVar4.K(objQ8);
                    }
                    h4.r rVarC2 = p5.v.c((e23.l) objQ8, aVar6, false);
                    boolean zR3 = mVar4.r(context) | mVar4.r(iVar);
                    Object objQ9 = mVar4.q();
                    if (zR3 || objQ9 == c2565a) {
                        objQ9 = new e23.a() { // from class: fk0.c
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        i iVar2 = iVar;
                                        Context context2 = context;
                                        context2.startActivity(iVar2.a(context2));
                                        break;
                                    default:
                                        i iVar3 = iVar;
                                        Context context3 = context;
                                        context3.startActivity(iVar3.b(context3));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar4.K(objQ9);
                    }
                    p2Var.g(strQ4, rVarC2, null, null, null, false, false, (e23.a) objQ9, mVar4, 0, 252);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 11:
                String str3 = (String) obj7;
                String str4 = (String) obj5;
                b92.a aVar7 = (b92.a) obj8;
                e23.a<Unit> aVar8 = (e23.a) obj6;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.f46024o;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    h4.r.a aVar10 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar5, 0);
                    int iHashCode = Long.hashCode(mVar5.getU());
                    i2 i2VarX = mVar5.x();
                    h4.r rVarC3 = h4.k.c(aVar10, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar11 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar11);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar5);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar5);
                    b0 b0Var = b0.f22601a;
                    p2 p2Var2 = p2.f111205a;
                    z3.e eVarC = z3.f.c(181909495, new e11.g(b0Var, z16, i15), mVar5);
                    int i19 = b92.a.f16960b;
                    p2Var2.h(str3, str4, null, null, aVar7, false, false, null, eVarC, null, aVar8, mVar5, 100663296, 0, 748);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 12:
                x xVar = (x) obj8;
                x xVar2 = (x) obj7;
                x xVar3 = (x) obj5;
                e23.a aVar12 = (e23.a) obj6;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    String strQ5 = y.Q(mVar6, R.string.lbl_lifestyle_logging);
                    i53.f fVarA = i53.a.a(new i3("HELP", y.Q(mVar6, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new i3("SETTINGS", y.Q(mVar6, R.string.action_settings), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new i3(CodePackage.REMINDERS, y.Q(mVar6, R.string.mct_reminders), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB4 = mVar6.B(xVar) | mVar6.B(xVar2) | mVar6.B(xVar3);
                    Object objQ10 = mVar6.q();
                    if (zB4) {
                        objQ10 = new ci0.b(xVar, 29, xVar2, xVar3);
                        mVar6.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new ci0.b(xVar, 29, xVar2, xVar3);
                            mVar6.K(objQ10);
                        }
                    }
                    e23.l lVar5 = (e23.l) objQ10;
                    if (z16) {
                        mVar6.C(-734233424);
                        z02.f.d(strQ5, null, null, aVar12, null, fVarA, lVar5, mVar6, 2097152, 54);
                        mVar6.f();
                    } else {
                        mVar6.C(-733974419);
                        z02.f.b(null, null, strQ5, null, null, null, fVarA, lVar5, mVar6, 2097152, 59);
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ic1.b.d((gc1.a) obj8, (String) obj7, (String) obj5, (Double) obj6, this.f21119c, (p3.m) obj, p0.t(9));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                il1.c.c((kl1.a) obj8, (i53.c) obj7, this.f21119c, (e23.l) obj5, (e23.l) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                j21.t.b(p0.t(24577), (e23.a) obj6, (h4.r) obj8, (String) obj7, (p3.m) obj, (u4.d) obj5, this.f21119c);
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                v0.c((sy0.c) obj8, (cy0.i) obj7, this.f21119c, (z0) obj5, (e23.a) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ky0.w1.a(this.f21119c, (sy0.k) obj8, (sy0.t) obj7, (PrivacyType) obj5, (e23.a) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                lb0.d.a((String) obj7, this.f21119c, (String) obj5, (e23.a) obj6, (k2.h) obj8, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                mw0.c.b((kw0.c) obj6, (String) obj7, (String) obj5, (h4.r) obj8, this.f21119c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                kw0.f fVar2 = (kw0.f) obj8;
                kw0.f fVar3 = (kw0.f) obj7;
                pv0.r rVar = (pv0.r) obj5;
                p1 p1Var = (p1) obj6;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    if (z16 || !gl1.d.E(fVar2) || fVar3.f106948e.isEmpty()) {
                        mVar7.C(-873204779);
                        mVar7.f();
                    } else {
                        mVar7.C(-873395057);
                        zv0.d dVar5 = zv0.d.f207169a;
                        l22.a aVarS = a0.s(mVar7);
                        dVar5.getClass();
                        mw0.j.g(p1Var, zv0.d.a(rVar, aVarS), mVar7, 6);
                        mVar7.f();
                    }
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                n02.b.a((n02.f) obj8, (e23.l) obj7, this.f21119c, (e23.a) obj6, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                nw0.g gVar2 = (nw0.g) obj8;
                e23.l lVar6 = (e23.l) obj7;
                x3 x3Var = (x3) obj5;
                p1 p1Var2 = (p1) obj6;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    h4.r.a aVar13 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar8, 0);
                    int iHashCode2 = Long.hashCode(mVar8.getU());
                    i2 i2VarX2 = mVar8.x();
                    h4.r rVarC4 = h4.k.c(aVar13, mVar8);
                    h5.g.V.getClass();
                    e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar14);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar8);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar8, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar8);
                    b0 b0Var2 = b0.f22601a;
                    String strQ6 = y.Q(mVar8, R.string.msg_do_you_want_to_log_behaviors);
                    String strQ7 = y.Q(mVar8, R.string.msg_auto_log_bahviors_settings);
                    i53.c cVarE = i53.a.e((List) x3Var.getF182175a());
                    boolean z24 = ((nw0.a) p1Var2.getF182175a()).f127983b;
                    boolean z25 = ((nw0.a) p1Var2.getF182175a()).f127984c && z16;
                    boolean zR4 = mVar8.r(gVar2) | mVar8.B(lVar6);
                    Object objQ11 = mVar8.q();
                    if (zR4) {
                        objQ11 = new ml0.e(28, gVar2, lVar6);
                        mVar8.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new ml0.e(28, gVar2, lVar6);
                            mVar8.K(objQ11);
                        }
                    }
                    xv0.a.a(strQ6, strQ7, cVarE, z24, z25, (e23.l) objQ11, mVar8, 0, 0);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarZ = c2.l.z(aVar13, eVar2.f97920e, eVar2.f97918c);
                    String strQ8 = y.Q(mVar8, R.string.msg_lifestyle_logging_auto_logging_info);
                    d92.b.f58624b.getClass();
                    mh.c(strQ8, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar8), mVar8, 0, 0, 131068);
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 23:
                uu.q qVar = (uu.q) obj8;
                zc.d dVar6 = (zc.d) obj7;
                a5.a aVar15 = (a5.a) obj5;
                p1 p1Var3 = (p1) obj6;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    h4.r.a aVar16 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.d(aVar16, 1.0f), vb.h.e(d92.b.f58623a, mVar9), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA3 = c2.y.a(kVar3, h4.d.a.f81536n, mVar9, 0);
                    int iHashCode3 = Long.hashCode(mVar9.getU());
                    i2 i2VarX3 = mVar9.x();
                    h4.r rVarC5 = h4.k.c(rVarE, mVar9);
                    h5.g.V.getClass();
                    e0.a aVar17 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar17);
                    } else {
                        mVar9.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar9);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar9);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar9, iHashCode3, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar9);
                    b0 b0Var3 = b0.f22601a;
                    com.garmin.android.apps.connectmobile.badges.service.model.r rVar2 = (com.garmin.android.apps.connectmobile.badges.service.model.r) p1Var3.getF182175a();
                    boolean zR5 = mVar9.r(qVar) | mVar9.r(dVar6);
                    Object objQ12 = mVar9.q();
                    if (zR5) {
                        objQ12 = new ph1.d(25, qVar, dVar6);
                        mVar9.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new ph1.d(25, qVar, dVar6);
                            mVar9.K(objQ12);
                        }
                    }
                    r22.i.b(rVar2, (e23.l) objQ12, mVar9, 0);
                    h4.r rVarA = a5.f.a(x2.d(aVar16, 1.0f), aVar15, null);
                    boolean zH = mVar9.h(z16) | mVar9.B(p1Var3) | mVar9.r(dVar6);
                    Object objQ13 = mVar9.q();
                    if (zH) {
                        objQ13 = new ad0.f(z16, dVar6, p1Var3, 18);
                        mVar9.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            objQ13 = new ad0.f(z16, dVar6, p1Var3, 18);
                            mVar9.K(objQ13);
                        }
                    }
                    e2.c.b(rVarA, null, null, null, null, null, false, null, (e23.l) objQ13, mVar9, 0, 510);
                    mVar9.y();
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 24:
                LocalDate localDate = (LocalDate) obj8;
                LocalDate localDate2 = (LocalDate) obj5;
                mm1.b bVar5 = (mm1.b) obj6;
                String str5 = (String) obj7;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g6.f.a aVar18 = g6.f.f75994b;
                    h4.r rVarH = x2.h(c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2), 350);
                    Object objQ14 = mVar10.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ14 == c2565a2) {
                        objQ14 = new rk0.n(i16);
                        mVar10.K(objQ14);
                    }
                    e23.l lVar7 = (e23.l) objQ14;
                    boolean zR6 = mVar10.r(localDate) | mVar10.r(localDate2);
                    boolean z26 = this.f21119c;
                    boolean zH2 = zR6 | mVar10.h(z26) | mVar10.r(bVar5) | mVar10.B(str5);
                    Object objQ15 = mVar10.q();
                    if (zH2 || objQ15 == c2565a2) {
                        cq.m mVar11 = new cq.m(localDate, localDate2, z26, bVar5, str5, 7);
                        mVar10.K(mVar11);
                        objQ15 = mVar11;
                    }
                    p002j6.c.b(lVar7, rVarH, (e23.l) objQ15, mVar10, 6, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 25:
                LocalDate localDate3 = (LocalDate) obj8;
                LocalDate localDate4 = (LocalDate) obj5;
                mm1.f fVar4 = (mm1.f) obj6;
                String str6 = (String) obj7;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g6.f.a aVar19 = g6.f.f75994b;
                    h4.r rVarH2 = x2.h(c2.l.A(rVarF2, j92.b.f97899b.f97920e, 0.0f, 2), 350);
                    Object objQ16 = mVar12.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                    if (objQ16 == c2565a3) {
                        objQ16 = new rk0.n(7);
                        mVar12.K(objQ16);
                    }
                    e23.l lVar8 = (e23.l) objQ16;
                    boolean zR7 = mVar12.r(localDate3) | mVar12.r(localDate4);
                    boolean z27 = this.f21119c;
                    boolean zH3 = zR7 | mVar12.h(z27) | mVar12.r(fVar4) | mVar12.B(str6);
                    Object objQ17 = mVar12.q();
                    if (zH3 || objQ17 == c2565a3) {
                        cq.m mVar13 = new cq.m(localDate3, localDate4, z27, fVar4, str6, 8);
                        mVar12.K(mVar13);
                        objQ17 = mVar13;
                    }
                    p002j6.c.b(lVar8, rVarH2, (e23.l) objQ17, mVar12, 6, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                sa0.l.b((sa0.n.b) obj8, (sa0.n) obj7, this.f21119c, (e23.a) obj6, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                return a(obj, obj2);
            case 28:
                return b(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                tw0.b.a((h4.r) obj8, (String) obj7, (e23.a) obj6, (e23.a) obj5, this.f21119c, (p3.m) obj, p0.t(3079));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ m(int i14, int i15, e23.a aVar, e23.a aVar2, Object obj, Object obj2, boolean z14) {
        this.f21117a = i15;
        this.f21120d = obj;
        this.f21118b = obj2;
        this.f21119c = z14;
        this.f21122f = aVar;
        this.f21121e = aVar2;
    }

    public /* synthetic */ m(e23.a aVar, boolean z14, h2.b bVar, zc.d dVar, e23.l lVar) {
        this.f21117a = 7;
        this.f21122f = aVar;
        this.f21119c = z14;
        this.f21120d = bVar;
        this.f21118b = dVar;
        this.f21121e = lVar;
    }

    public /* synthetic */ m(ew0.k kVar, boolean z14, x xVar, x xVar2, e23.a aVar, int i14) {
        this.f21117a = 9;
        this.f21120d = kVar;
        this.f21119c = z14;
        this.f21118b = xVar;
        this.f21121e = xVar2;
        this.f21122f = aVar;
    }

    public /* synthetic */ m(ew0.m mVar, boolean z14, e23.a aVar, e23.a aVar2, e23.a aVar3, int i14) {
        this.f21117a = 8;
        this.f21120d = mVar;
        this.f21119c = z14;
        this.f21122f = aVar;
        this.f21118b = aVar2;
        this.f21121e = aVar3;
    }

    public /* synthetic */ m(gc1.a aVar, String str, String str2, Double d14, boolean z14, int i14) {
        this.f21117a = 13;
        this.f21120d = aVar;
        this.f21118b = str;
        this.f21121e = str2;
        this.f21122f = d14;
        this.f21119c = z14;
    }

    public /* synthetic */ m(gv.a aVar, boolean z14, e23.l lVar, e23.a aVar2, e23.a aVar3, int i14) {
        this.f21117a = 6;
        this.f21120d = aVar;
        this.f21119c = z14;
        this.f21118b = lVar;
        this.f21122f = aVar2;
        this.f21121e = aVar3;
    }

    public /* synthetic */ m(h4.r rVar, String str, Object obj, boolean z14, e23.a aVar, int i14, int i15) {
        this.f21117a = i15;
        this.f21120d = rVar;
        this.f21118b = str;
        this.f21121e = obj;
        this.f21119c = z14;
        this.f21122f = aVar;
    }

    public /* synthetic */ m(h4.r rVar, boolean z14, u4.d dVar, String str, e23.a aVar, int i14) {
        this.f21117a = 15;
        this.f21120d = rVar;
        this.f21119c = z14;
        this.f21121e = dVar;
        this.f21118b = str;
        this.f21122f = aVar;
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4, boolean z14, int i14, int i15) {
        this.f21117a = i15;
        this.f21120d = obj;
        this.f21118b = obj2;
        this.f21119c = z14;
        this.f21121e = obj3;
        this.f21122f = obj4;
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, boolean z14, Object obj4, int i14) {
        this.f21117a = i14;
        this.f21120d = obj;
        this.f21118b = obj2;
        this.f21121e = obj3;
        this.f21119c = z14;
        this.f21122f = obj4;
    }

    public /* synthetic */ m(Object obj, boolean z14, String str, e23.l lVar, e23.l lVar2, int i14) {
        this.f21117a = i14;
        this.f21120d = obj;
        this.f21119c = z14;
        this.f21118b = str;
        this.f21121e = lVar;
        this.f21122f = lVar2;
    }

    public /* synthetic */ m(String str, e23.a aVar, i53.f fVar, boolean z14, e23.a aVar2) {
        this.f21117a = 28;
        this.f21118b = str;
        this.f21122f = aVar;
        this.f21120d = fVar;
        this.f21119c = z14;
        this.f21121e = aVar2;
    }

    public /* synthetic */ m(String str, String str2, b92.a aVar, e23.a aVar2, boolean z14) {
        this.f21117a = 11;
        this.f21118b = str;
        this.f21121e = str2;
        this.f21120d = aVar;
        this.f21122f = aVar2;
        this.f21119c = z14;
    }

    public /* synthetic */ m(String str, boolean z14, b63.v vVar, e23.l lVar, e23.l lVar2, int i14) {
        this.f21117a = 1;
        this.f21118b = str;
        this.f21119c = z14;
        this.f21120d = vVar;
        this.f21121e = lVar;
        this.f21122f = lVar2;
    }

    public /* synthetic */ m(String str, boolean z14, String str2, e23.a aVar, k2.h hVar, int i14) {
        this.f21117a = 18;
        this.f21118b = str;
        this.f21119c = z14;
        this.f21121e = str2;
        this.f21122f = aVar;
        this.f21120d = hVar;
    }

    public /* synthetic */ m(kw0.c cVar, String str, String str2, h4.r rVar, boolean z14, int i14) {
        this.f21117a = 19;
        this.f21122f = cVar;
        this.f21118b = str;
        this.f21121e = str2;
        this.f21120d = rVar;
        this.f21119c = z14;
    }

    public /* synthetic */ m(LocalDate localDate, LocalDate localDate2, boolean z14, Object obj, String str, int i14) {
        this.f21117a = i14;
        this.f21120d = localDate;
        this.f21121e = localDate2;
        this.f21119c = z14;
        this.f21122f = obj;
        this.f21118b = str;
    }

    public /* synthetic */ m(z42.g gVar, boolean z14, String str, e23.a aVar, e23.l lVar) {
        this.f21117a = 5;
        this.f21120d = gVar;
        this.f21119c = z14;
        this.f21118b = str;
        this.f21122f = aVar;
        this.f21121e = lVar;
    }

    public /* synthetic */ m(boolean z14, Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f21117a = i14;
        this.f21119c = z14;
        this.f21120d = obj;
        this.f21118b = obj2;
        this.f21121e = obj3;
        this.f21122f = obj4;
    }

    public /* synthetic */ m(boolean z14, sy0.k kVar, sy0.t tVar, PrivacyType privacyType, e23.a aVar, int i14) {
        this.f21117a = 17;
        this.f21119c = z14;
        this.f21120d = kVar;
        this.f21118b = tVar;
        this.f21121e = privacyType;
        this.f21122f = aVar;
    }
}
