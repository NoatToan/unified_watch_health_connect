package i91;

import a42.d0;
import am.z0;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.o;
import c.q;
import c2.t;
import c2.x2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import com.garmin.android.apps.connectmobile.group.create.GroupCreationActivity;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupTransferOwnershipActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity;
import com.garmin.android.apps.connectmobile.race_time_prediction.presentation.RaceTimePredictionActivity;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import d52.k;
import e23.l;
import e23.r;
import gl1.y;
import h2.c0;
import i3.fe;
import i3.i7;
import ih0.s;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jk0.x;
import l72.p2;
import l72.r1;
import lc.m0;
import lc.v;
import lc.w;
import nw0.p;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p1.z;
import p13.c1;
import p13.h0;
import p13.j0;
import p3.l0;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import p40.o0;
import r1.q2;
import rk0.b1;
import rk0.d1;
import rk0.w0;
import s5.x0;
import ty1.f1;
import v62.e1;
import v62.n1;
import w2.a0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f92332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f92333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f92334d;

    public /* synthetic */ e(l lVar, String str, p1 p1Var) {
        this.f92331a = 13;
        this.f92332b = lVar;
        this.f92334d = str;
        this.f92333c = p1Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        u82.a aVar;
        np.c cVar = (np.c) this.f92332b;
        op.a aVar2 = (op.a) this.f92333c;
        p1 p1Var = (p1) this.f92334d;
        o82.g gVar = (o82.g) obj;
        o82.a aVar3 = (o82.a) obj2;
        m mVar = (m) obj3;
        int iD = vb.h.d((Integer) obj4, gVar, aVar3);
        if ((iD & 6) == 0) {
            i14 = (mVar.k(gVar.ordinal()) ? 4 : 2) | iD;
        } else {
            i14 = iD;
        }
        if ((iD & 48) == 0) {
            i14 |= mVar.B(aVar3) ? 32 : 16;
        }
        int i15 = i14;
        if (mVar.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            cVar.getClass();
            int i16 = np.c.a.f126794a[gVar.ordinal()];
            if (i16 == 1) {
                aVar = cVar.f126790h;
            } else if (i16 == 2) {
                aVar = cVar.f126791i;
            } else if (i16 != 3) {
                aVar = i16 != 4 ? null : cVar.f126793k;
            } else {
                aVar = cVar.f126792j;
            }
            u82.a aVar4 = aVar;
            if (aVar4 == null) {
                mVar.C(-532129329);
                mVar.f();
            } else {
                mVar.C(-532129328);
                u82.e.b(aVar3, aVar4, null, false, z3.f.c(-416220267, new d0(gVar, cVar, aVar2, p1Var, 27), mVar), mVar, ((i15 >> 3) & 14) | 24576, 12);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        zc.d dVar = (zc.d) this.f92332b;
        p1 p1Var = (p1) this.f92333c;
        p1 p1Var2 = (p1) this.f92334d;
        int iIntValue = ((Integer) obj2).intValue();
        m mVar = (m) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        GroupTransferOwnershipActivity.a aVar = GroupTransferOwnershipActivity.f36209d;
        ((e2.d) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= mVar.k(iIntValue) ? 32 : 16;
        }
        if (mVar.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            x1 x1Var = n.f135158a;
            com.garmin.android.apps.connectmobile.group.details.about.member.a aVar2 = (com.garmin.android.apps.connectmobile.group.details.about.member.a) dVar.a(iIntValue);
            if (aVar2 == null) {
                return Unit.INSTANCE;
            }
            if (aVar2 instanceof com.garmin.android.apps.connectmobile.group.details.about.member.a.C0629a) {
                mVar.C(1036134622);
                r1.b(y.Q(mVar, ((com.garmin.android.apps.connectmobile.group.details.about.member.a.C0629a) aVar2).f36220a), null, mVar, 0, 2);
                mVar.f();
            } else {
                if (!(aVar2 instanceof com.garmin.android.apps.connectmobile.group.details.about.member.a.b)) {
                    throw n23.j.m(mVar, -1490598329);
                }
                mVar.C(1036346755);
                p2 p2Var = p2.f111205a;
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar = ((com.garmin.android.apps.connectmobile.group.details.about.member.a.b) aVar2).f36221a;
                String fullName = bVar.getFullName();
                if (fullName == null) {
                    fullName = "";
                }
                String location = bVar.getLocation();
                String str = location != null ? location : "";
                z3.e eVarC = z3.f.c(-1906678114, new m92.f(aVar2, 22), mVar);
                boolean zB = mVar.B(aVar2);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new p(aVar2, 10, p1Var, p1Var2);
                    mVar.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new p(aVar2, 10, p1Var, p1Var2);
                        mVar.K(objQ);
                    }
                }
                p2Var.h(fullName, str, null, null, null, false, false, eVarC, null, null, (e23.a) objQ, mVar, 12582912, 0, 892);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        lr0.a aVar = (lr0.a) this.f92332b;
        Activity activity = (Activity) this.f92333c;
        q qVar = (q) this.f92334d;
        u82.f fVar = (u82.f) obj2;
        m mVar = (m) obj3;
        int iC = vb.h.c((Integer) obj4, (t) obj, fVar);
        if ((iC & 48) == 0) {
            iC |= (iC & 64) == 0 ? mVar.B(fVar) : mVar.r(fVar) ? 32 : 16;
        }
        if (mVar.n(iC & 1, (iC & 145) != 144)) {
            x1 x1Var = n.f135158a;
            ir0.a aVar2 = (ir0.a) fVar.a();
            boolean zR = mVar.r(aVar) | mVar.r(activity) | mVar.r(qVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new ls0.h(aVar, 25, activity, qVar);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ls0.h(aVar, 25, activity, qVar);
                    mVar.K(objQ);
                }
            }
            rr0.j.c(aVar2, (l) objQ, mVar, ir0.a.f94762r);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        q72.b bVar = (q72.b) this.f92332b;
        final r72.i iVar = (r72.i) this.f92333c;
        final n82.f fVar = (n82.f) this.f92334d;
        o82.g gVar = (o82.g) obj;
        o82.a aVar = (o82.a) obj2;
        m mVar = (m) obj3;
        int iD = vb.h.d((Integer) obj4, gVar, aVar);
        if ((iD & 6) == 0) {
            i14 = (mVar.k(gVar.ordinal()) ? 4 : 2) | iD;
        } else {
            i14 = iD;
        }
        if ((iD & 48) == 0) {
            i14 |= mVar.B(aVar) ? 32 : 16;
        }
        final int i15 = 0;
        final int i16 = 1;
        if (mVar.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            switch (q72.h.c.f143290a[gVar.ordinal()]) {
                case 1:
                    mVar.C(1345813351);
                    u82.e.c(bVar.f143251a, null, null, z3.f.c(-386205506, new r() { // from class: q72.c
                        @Override // e23.r
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i17 = i15;
                            r72.i iVar2 = iVar;
                            t tVar = (t) obj5;
                            w82.a aVar2 = (w82.a) obj6;
                            m mVar2 = (m) obj7;
                            int iIntValue = ((Integer) obj8).intValue();
                            switch (i17) {
                                case 0:
                                    tVar.getClass();
                                    aVar2.getClass();
                                    x1 x1Var2 = n.f135158a;
                                    h4.r.a aVar3 = h4.r.S;
                                    h4.d.f81522a.getClass();
                                    h.a(tVar.c(aVar3, h4.d.a.f81525c), iVar2, aVar2, mVar2, (iIntValue << 3) & 896);
                                    break;
                                default:
                                    tVar.getClass();
                                    aVar2.getClass();
                                    x1 x1Var3 = n.f135158a;
                                    h4.r.a aVar4 = h4.r.S;
                                    h4.d.f81522a.getClass();
                                    h.c(tVar.c(aVar4, h4.d.a.f81525c), iVar2, aVar2, mVar2, (iIntValue << 3) & 896);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar), mVar, 3072);
                    mVar.f();
                    break;
                case 2:
                    mVar.C(1346095699);
                    u82.e.c(bVar.f143252b.a(aVar), null, null, z3.f.c(-1283713945, new r() { // from class: q72.c
                        @Override // e23.r
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i17 = i16;
                            r72.i iVar2 = iVar;
                            t tVar = (t) obj5;
                            w82.a aVar2 = (w82.a) obj6;
                            m mVar2 = (m) obj7;
                            int iIntValue = ((Integer) obj8).intValue();
                            switch (i17) {
                                case 0:
                                    tVar.getClass();
                                    aVar2.getClass();
                                    x1 x1Var2 = n.f135158a;
                                    h4.r.a aVar3 = h4.r.S;
                                    h4.d.f81522a.getClass();
                                    h.a(tVar.c(aVar3, h4.d.a.f81525c), iVar2, aVar2, mVar2, (iIntValue << 3) & 896);
                                    break;
                                default:
                                    tVar.getClass();
                                    aVar2.getClass();
                                    x1 x1Var3 = n.f135158a;
                                    h4.r.a aVar4 = h4.r.S;
                                    h4.d.f81522a.getClass();
                                    h.c(tVar.c(aVar4, h4.d.a.f81525c), iVar2, aVar2, mVar2, (iIntValue << 3) & 896);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar), mVar, 3072);
                    mVar.f();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    mVar.C(1346547865);
                    u82.e.c(bVar.f143253c.a(aVar), null, null, z3.f.c(393309382, new r() { // from class: q72.d
                        /* JADX WARN: Code duplicated, block: B:15:0x005d  */
                        /* JADX WARN: Code duplicated, block: B:8:0x0030  */
                        @Override // e23.r
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i17 = i15;
                            m.a aVar2 = m.f135153a;
                            n82.f fVar2 = fVar;
                            r72.i iVar2 = iVar;
                            t tVar = (t) obj5;
                            w82.a aVar3 = (w82.a) obj6;
                            m mVar2 = (m) obj7;
                            int iIntValue = ((Integer) obj8).intValue();
                            switch (i17) {
                                case 0:
                                    tVar.getClass();
                                    aVar3.getClass();
                                    x1 x1Var2 = n.f135158a;
                                    boolean zB = mVar2.B(fVar2);
                                    Object objQ = mVar2.q();
                                    if (zB) {
                                        objQ = new k(fVar2, 18);
                                        mVar2.K(objQ);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ == m.a.f135155b) {
                                            objQ = new k(fVar2, 18);
                                            mVar2.K(objQ);
                                        }
                                    }
                                    h.b(iVar2, aVar3, (l) objQ, mVar2, iIntValue & 112);
                                    break;
                                default:
                                    tVar.getClass();
                                    aVar3.getClass();
                                    x1 x1Var3 = n.f135158a;
                                    boolean zB2 = mVar2.B(fVar2);
                                    Object objQ2 = mVar2.q();
                                    if (zB2) {
                                        objQ2 = new k(fVar2, 17);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == m.a.f135155b) {
                                            objQ2 = new k(fVar2, 17);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    h.h(iVar2, aVar3, (l) objQ2, mVar2, iIntValue & 112);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar), mVar, 3072);
                    mVar.f();
                    break;
                default:
                    mVar.C(1346919524);
                    u82.e.c(bVar.f143254d.a(aVar), null, null, z3.f.c(1658326023, new r() { // from class: q72.d
                        /* JADX WARN: Code duplicated, block: B:15:0x005d  */
                        /* JADX WARN: Code duplicated, block: B:8:0x0030  */
                        @Override // e23.r
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i17 = i16;
                            m.a aVar2 = m.f135153a;
                            n82.f fVar2 = fVar;
                            r72.i iVar2 = iVar;
                            t tVar = (t) obj5;
                            w82.a aVar3 = (w82.a) obj6;
                            m mVar2 = (m) obj7;
                            int iIntValue = ((Integer) obj8).intValue();
                            switch (i17) {
                                case 0:
                                    tVar.getClass();
                                    aVar3.getClass();
                                    x1 x1Var2 = n.f135158a;
                                    boolean zB = mVar2.B(fVar2);
                                    Object objQ = mVar2.q();
                                    if (zB) {
                                        objQ = new k(fVar2, 18);
                                        mVar2.K(objQ);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ == m.a.f135155b) {
                                            objQ = new k(fVar2, 18);
                                            mVar2.K(objQ);
                                        }
                                    }
                                    h.b(iVar2, aVar3, (l) objQ, mVar2, iIntValue & 112);
                                    break;
                                default:
                                    tVar.getClass();
                                    aVar3.getClass();
                                    x1 x1Var3 = n.f135158a;
                                    boolean zB2 = mVar2.B(fVar2);
                                    Object objQ2 = mVar2.q();
                                    if (zB2) {
                                        objQ2 = new k(fVar2, 17);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == m.a.f135155b) {
                                            objQ2 = new k(fVar2, 17);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    h.h(iVar2, aVar3, (l) objQ2, mVar2, iIntValue & 112);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar), mVar, 3072);
                    mVar.f();
                    break;
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        String strValueOf;
        z zVar = (z) this.f92332b;
        l lVar = (l) this.f92333c;
        Context context = (Context) this.f92334d;
        int iIntValue = ((Integer) obj2).intValue();
        m mVar = (m) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        q80.b bVar = q80.b.f143300a;
        ((e2.d) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= mVar.k(iIntValue) ? 32 : 16;
        }
        int i14 = 1;
        if (mVar.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            x1 x1Var = n.f135158a;
            sd2.f fVar = (sd2.f) zVar.i(iIntValue);
            q80.b.f143300a.getClass();
            String displayName = fVar.getDisplayName();
            if (displayName == null || displayName.length() <= 0) {
                strValueOf = String.valueOf(fVar.getUnitID());
            } else {
                strValueOf = fVar.getDisplayName();
                strValueOf.getClass();
            }
            String str = strValueOf;
            p2 p2Var = p2.f111205a;
            z3.e eVarC = z3.f.c(-1628974625, new q72.f(i14, context, fVar), mVar);
            boolean zB = mVar.B(lVar) | mVar.r(fVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new o0(22, lVar, fVar);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new o0(22, lVar, fVar);
                    mVar.K(objQ);
                }
            }
            p2Var.g(str, null, null, eVarC, null, false, false, (e23.a) objQ, mVar, 3072, 246);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        mm1.b bVar = (mm1.b) this.f92332b;
        LocalDate localDate = (LocalDate) this.f92333c;
        LocalDate localDate2 = (LocalDate) this.f92334d;
        int iIntValue = ((Integer) obj2).intValue();
        m mVar = (m) obj3;
        ((Integer) obj4).getClass();
        ((c0) obj).getClass();
        x1 x1Var = n.f135158a;
        if (iIntValue == rn1.k.CONSISTENCY.f153657a) {
            mVar.C(902515465);
            rn1.c.a(bVar, localDate, localDate2, false, mVar, 3080, 0);
            mVar.f();
        } else if (iIntValue == rn1.k.ALIGNMENT.f153657a) {
            mVar.C(902676882);
            rn1.b.a(bVar, localDate, localDate2, mVar, 8);
            mVar.f();
        } else {
            mVar.C(902783987);
            mVar.f();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        p1 p1Var;
        i53.e<ActivityListItemDTO> eVar;
        int i14;
        MultiDayActivitiesEditActivity multiDayActivitiesEditActivity = (MultiDayActivitiesEditActivity) this.f92332b;
        m0 m0Var = (m0) this.f92333c;
        cy0.k kVar = (cy0.k) this.f92334d;
        m mVar = (m) obj3;
        ((Integer) obj4).getClass();
        MultiDayActivitiesEditActivity.a aVar = MultiDayActivitiesEditActivity.f39291b;
        ((r1.l) obj).getClass();
        ((v) obj2).getClass();
        x1 x1Var = n.f135158a;
        p1 p1VarC = p0.c(multiDayActivitiesEditActivity.ca().f101749h, mVar, 0);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        m.a.C2565a c2565a = m.a.f135155b;
        if (objQ == c2565a) {
            objQ = p0.n(null);
            mVar.K(objQ);
        }
        p1 p1Var2 = (p1) objQ;
        Object objQ2 = mVar.q();
        if (objQ2 == c2565a) {
            objQ2 = p0.n(Boolean.FALSE);
            mVar.K(objQ2);
        }
        p1 p1Var3 = (p1) objQ2;
        String str = ((sy0.j) p1VarC.getF182175a()).f161226a;
        Long l14 = ((sy0.j) p1VarC.getF182175a()).f161227b;
        Long l15 = ((sy0.j) p1VarC.getF182175a()).f161228c;
        sy0.f fVar = ((sy0.j) p1VarC.getF182175a()).f161230e;
        String str2 = fVar != null ? fVar.f161213c : null;
        sy0.m mVar2 = ((sy0.j) p1VarC.getF182175a()).f161231f;
        boolean z14 = ((sy0.j) p1VarC.getF182175a()).f161232g;
        boolean zW3 = multiDayActivitiesEditActivity.ca().W3();
        boolean zI1 = multiDayActivitiesEditActivity.ca().I1();
        cy0.e eVar2 = (cy0.e) p1Var2.getF182175a();
        i53.e<ActivityListItemDTO> eVar3 = ((sy0.j) p1VarC.getF182175a()).f161229d;
        Long l16 = ((sy0.j) multiDayActivitiesEditActivity.ca().f101748g.getValue()).f161228c;
        boolean z15 = l16 != null && l16.longValue() > DateTime.now().getMillis();
        boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
        boolean zR = mVar.r(multiDayActivitiesEditActivity);
        Object objQ3 = mVar.q();
        if (zR || objQ3 == c2565a) {
            objQ3 = new qy0.f(multiDayActivitiesEditActivity, 0);
            mVar.K(objQ3);
        }
        l lVar = (l) objQ3;
        boolean zR2 = mVar.r(multiDayActivitiesEditActivity);
        Object objQ4 = mVar.q();
        if (zR2 || objQ4 == c2565a) {
            objQ4 = new qy0.f(multiDayActivitiesEditActivity, 1);
            mVar.K(objQ4);
        }
        l lVar2 = (l) objQ4;
        boolean zR3 = mVar.r(multiDayActivitiesEditActivity);
        Object objQ5 = mVar.q();
        if (zR3 || objQ5 == c2565a) {
            objQ5 = new qy0.f(multiDayActivitiesEditActivity, 2);
            mVar.K(objQ5);
        }
        l lVar3 = (l) objQ5;
        Object objQ6 = mVar.q();
        if (objQ6 == c2565a) {
            objQ6 = new qk0.m(p1Var2, 4);
            mVar.K(objQ6);
        }
        e23.a aVar2 = (e23.a) objQ6;
        boolean zR4 = mVar.r(m0Var);
        Object objQ7 = mVar.q();
        if (zR4 || objQ7 == c2565a) {
            objQ7 = new nk0.l(m0Var, 14);
            mVar.K(objQ7);
        }
        e23.a aVar3 = (e23.a) objQ7;
        boolean zR5 = mVar.r(m0Var);
        Object objQ8 = mVar.q();
        if (zR5 || objQ8 == c2565a) {
            objQ8 = new nk0.l(m0Var, 15);
            mVar.K(objQ8);
        }
        e23.a aVar4 = (e23.a) objQ8;
        boolean zR6 = mVar.r(multiDayActivitiesEditActivity);
        Object objQ9 = mVar.q();
        int i15 = 3;
        if (zR6 || objQ9 == c2565a) {
            objQ9 = new qy0.f(multiDayActivitiesEditActivity, i15);
            mVar.K(objQ9);
        }
        l lVar4 = (l) objQ9;
        boolean zR7 = mVar.r(m0Var);
        Object objQ10 = mVar.q();
        if (zR7 || objQ10 == c2565a) {
            objQ10 = new nk0.l(m0Var, 16);
            mVar.K(objQ10);
        }
        e23.a aVar5 = (e23.a) objQ10;
        boolean zR8 = mVar.r(multiDayActivitiesEditActivity);
        Object objQ11 = mVar.q();
        if (zR8 || objQ11 == c2565a) {
            objQ11 = new qy0.g(multiDayActivitiesEditActivity, 1);
            mVar.K(objQ11);
        }
        e23.a aVar6 = (e23.a) objQ11;
        boolean zR9 = mVar.r(multiDayActivitiesEditActivity) | mVar.r(kVar);
        Object objQ12 = mVar.q();
        if (zR9 || objQ12 == c2565a) {
            p1Var = p1Var3;
            eVar = eVar3;
            i14 = 3;
            ok0.d dVar = new ok0.d(multiDayActivitiesEditActivity, kVar, p1Var2, p1Var, 11);
            mVar.K(dVar);
            objQ12 = dVar;
        } else {
            p1Var = p1Var3;
            eVar = eVar3;
            i14 = 3;
        }
        e23.a aVar7 = (e23.a) objQ12;
        boolean zR10 = mVar.r(multiDayActivitiesEditActivity);
        Object objQ13 = mVar.q();
        if (zR10 || objQ13 == c2565a) {
            objQ13 = new qy0.g(multiDayActivitiesEditActivity, 0);
            mVar.K(objQ13);
        }
        e23.a aVar8 = (e23.a) objQ13;
        Object objQ14 = mVar.q();
        if (objQ14 == c2565a) {
            objQ14 = new qk0.m(p1Var, i14);
            mVar.K(objQ14);
        }
        qy0.k.a(str, lVar, l14, l15, lVar2, lVar3, str2, mVar2, z14, zW3, zI1, eVar2, aVar2, aVar3, aVar4, lVar4, eVar, z15, aVar5, aVar6, aVar7, aVar8, zBooleanValue, (e23.a) objQ14, mVar, 0, 384, 3072, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x007a  */
    /* JADX WARN: Code duplicated, block: B:6:0x0053  */
    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        String strB;
        final k31.a aVar = (k31.a) this.f92332b;
        e23.p pVar = (e23.p) this.f92333c;
        l lVar = (l) this.f92334d;
        int iIntValue = ((Integer) obj2).intValue();
        m mVar = (m) obj3;
        ((Integer) obj4).getClass();
        ((c0) obj).getClass();
        x1 x1Var = n.f135158a;
        k31.c cVar = aVar.f102607e.get(iIntValue);
        boolean zR = mVar.r(aVar) | mVar.k(cVar.ordinal()) | mVar.B(pVar);
        Object objQ = mVar.q();
        m.a aVar2 = m.f135153a;
        if (zR) {
            objQ = new q42.v(aVar, 8, cVar, pVar);
            mVar.K(objQ);
        } else {
            aVar2.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new q42.v(aVar, 8, cVar, pVar);
                mVar.K(objQ);
            }
        }
        e23.a aVar3 = (e23.a) objQ;
        boolean zB = mVar.B(lVar) | mVar.k(cVar.ordinal());
        Object objQ2 = mVar.q();
        if (zB) {
            objQ2 = new qn0.f(21, lVar, cVar);
            mVar.K(objQ2);
        } else {
            aVar2.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = new qn0.f(21, lVar, cVar);
                mVar.K(objQ2);
            }
        }
        e23.a aVar4 = (e23.a) objQ2;
        String strC = cVar.c(a0.s(mVar));
        d31.d dVar = cVar.f102645a;
        d92.b.f58623a.getClass();
        d92.b.f58624b.getClass();
        final x0 x0VarE = d92.c.e(j92.f.f97931h);
        int i14 = r31.n.a.f150050a[dVar.ordinal()];
        if (i14 == 1 || i14 == 2) {
            mVar.C(-295752850);
            strB = cVar.b(a0.s(mVar), aVar.f102604b);
            mVar.f();
        } else {
            mVar.C(-295621751);
            strB = cVar.b(a0.s(mVar), new Object[0]);
            mVar.f();
        }
        final x0 x0Var = j92.f.f97932i;
        String strQ = y.Q(mVar, cVar.f102654j);
        final x0 x0VarE2 = d92.c.e(x0Var);
        if (dVar == d31.d.DEVICE_WELCOME) {
            mVar.C(-295248201);
            final int i15 = 3;
            final int i16 = 2;
            final int i17 = 4;
            r31.r.c(aVar.f102606d, strC, strB, strQ, aVar3, aVar4, x2.x(x2.f(h4.r.S, 1.0f), null, 3), x0VarE, x0Var, x0VarE2, new e23.q() { // from class: r31.m
                @Override // e23.q
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    int i18 = i16;
                    x0 x0Var2 = x0VarE;
                    k31.a aVar5 = aVar;
                    float fFloatValue = ((Float) obj5).floatValue();
                    p3.m mVar2 = (p3.m) obj6;
                    ((Integer) obj7).intValue();
                    switch (i18) {
                        case 0:
                            mVar2.C(1620857426);
                            x1 x1Var2 = p3.n.f135158a;
                            Iterator<T> it = aVar5.f102607e.iterator();
                            if (!it.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA = g6.f.a(i70.b.b(((k31.c) it.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                            while (it.hasNext()) {
                                g6.f fVarA2 = g6.f.a(i70.b.b(((k31.c) it.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                                if (fVarA.compareTo(fVarA2) < 0) {
                                    fVarA = fVarA2;
                                }
                            }
                            float f14 = fVarA.f75997a;
                            x1 x1Var3 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f14);
                        case 1:
                            mVar2.C(-1667428623);
                            x1 x1Var4 = p3.n.f135158a;
                            Iterator<T> it3 = aVar5.f102607e.iterator();
                            if (!it3.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA3 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it3.next()).f102654j), x0Var2, fFloatValue, mVar2));
                            while (it3.hasNext()) {
                                g6.f fVarA4 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it3.next()).f102654j), x0Var2, fFloatValue, mVar2));
                                if (fVarA3.compareTo(fVarA4) < 0) {
                                    fVarA3 = fVarA4;
                                }
                            }
                            float f15 = fVarA3.f75997a;
                            x1 x1Var5 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f15);
                        case 2:
                            mVar2.C(-755109466);
                            x1 x1Var6 = p3.n.f135158a;
                            Iterator<T> it4 = aVar5.f102607e.iterator();
                            if (!it4.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA5 = g6.f.a(i70.b.b(((k31.c) it4.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                            while (it4.hasNext()) {
                                g6.f fVarA6 = g6.f.a(i70.b.b(((k31.c) it4.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                                if (fVarA5.compareTo(fVarA6) < 0) {
                                    fVarA5 = fVarA6;
                                }
                            }
                            float f16 = fVarA5.f75997a;
                            x1 x1Var7 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f16);
                        case 3:
                            mVar2.C(1728290629);
                            x1 x1Var8 = p3.n.f135158a;
                            Iterator<T> it5 = aVar5.f102607e.iterator();
                            if (!it5.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA7 = g6.f.a(i70.b.b(((k31.c) it5.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                            while (it5.hasNext()) {
                                g6.f fVarA8 = g6.f.a(i70.b.b(((k31.c) it5.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                                if (fVarA7.compareTo(fVarA8) < 0) {
                                    fVarA7 = fVarA8;
                                }
                            }
                            float f17 = fVarA7.f75997a;
                            x1 x1Var9 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f17);
                        case 4:
                            mVar2.C(-83276572);
                            x1 x1Var10 = p3.n.f135158a;
                            Iterator<T> it6 = aVar5.f102607e.iterator();
                            if (!it6.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA9 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it6.next()).f102654j), x0Var2, fFloatValue, mVar2));
                            while (it6.hasNext()) {
                                g6.f fVarA10 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it6.next()).f102654j), x0Var2, fFloatValue, mVar2));
                                if (fVarA9.compareTo(fVarA10) < 0) {
                                    fVarA9 = fVarA10;
                                }
                            }
                            float f18 = fVarA9.f75997a;
                            x1 x1Var11 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f18);
                        default:
                            mVar2.C(614176179);
                            x1 x1Var12 = p3.n.f135158a;
                            Iterator<T> it7 = aVar5.f102607e.iterator();
                            if (!it7.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA11 = g6.f.a(i70.b.b(((k31.c) it7.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                            while (it7.hasNext()) {
                                g6.f fVarA12 = g6.f.a(i70.b.b(((k31.c) it7.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                                if (fVarA11.compareTo(fVarA12) < 0) {
                                    fVarA11 = fVarA12;
                                }
                            }
                            float f19 = fVarA11.f75997a;
                            x1 x1Var13 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f19);
                    }
                }
            }, new e23.q() { // from class: r31.m
                @Override // e23.q
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    int i18 = i15;
                    x0 x0Var2 = x0Var;
                    k31.a aVar5 = aVar;
                    float fFloatValue = ((Float) obj5).floatValue();
                    p3.m mVar2 = (p3.m) obj6;
                    ((Integer) obj7).intValue();
                    switch (i18) {
                        case 0:
                            mVar2.C(1620857426);
                            x1 x1Var2 = p3.n.f135158a;
                            Iterator<T> it = aVar5.f102607e.iterator();
                            if (!it.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA = g6.f.a(i70.b.b(((k31.c) it.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                            while (it.hasNext()) {
                                g6.f fVarA2 = g6.f.a(i70.b.b(((k31.c) it.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                                if (fVarA.compareTo(fVarA2) < 0) {
                                    fVarA = fVarA2;
                                }
                            }
                            float f14 = fVarA.f75997a;
                            x1 x1Var3 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f14);
                        case 1:
                            mVar2.C(-1667428623);
                            x1 x1Var4 = p3.n.f135158a;
                            Iterator<T> it3 = aVar5.f102607e.iterator();
                            if (!it3.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA3 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it3.next()).f102654j), x0Var2, fFloatValue, mVar2));
                            while (it3.hasNext()) {
                                g6.f fVarA4 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it3.next()).f102654j), x0Var2, fFloatValue, mVar2));
                                if (fVarA3.compareTo(fVarA4) < 0) {
                                    fVarA3 = fVarA4;
                                }
                            }
                            float f15 = fVarA3.f75997a;
                            x1 x1Var5 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f15);
                        case 2:
                            mVar2.C(-755109466);
                            x1 x1Var6 = p3.n.f135158a;
                            Iterator<T> it4 = aVar5.f102607e.iterator();
                            if (!it4.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA5 = g6.f.a(i70.b.b(((k31.c) it4.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                            while (it4.hasNext()) {
                                g6.f fVarA6 = g6.f.a(i70.b.b(((k31.c) it4.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                                if (fVarA5.compareTo(fVarA6) < 0) {
                                    fVarA5 = fVarA6;
                                }
                            }
                            float f16 = fVarA5.f75997a;
                            x1 x1Var7 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f16);
                        case 3:
                            mVar2.C(1728290629);
                            x1 x1Var8 = p3.n.f135158a;
                            Iterator<T> it5 = aVar5.f102607e.iterator();
                            if (!it5.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA7 = g6.f.a(i70.b.b(((k31.c) it5.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                            while (it5.hasNext()) {
                                g6.f fVarA8 = g6.f.a(i70.b.b(((k31.c) it5.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                                if (fVarA7.compareTo(fVarA8) < 0) {
                                    fVarA7 = fVarA8;
                                }
                            }
                            float f17 = fVarA7.f75997a;
                            x1 x1Var9 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f17);
                        case 4:
                            mVar2.C(-83276572);
                            x1 x1Var10 = p3.n.f135158a;
                            Iterator<T> it6 = aVar5.f102607e.iterator();
                            if (!it6.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA9 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it6.next()).f102654j), x0Var2, fFloatValue, mVar2));
                            while (it6.hasNext()) {
                                g6.f fVarA10 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it6.next()).f102654j), x0Var2, fFloatValue, mVar2));
                                if (fVarA9.compareTo(fVarA10) < 0) {
                                    fVarA9 = fVarA10;
                                }
                            }
                            float f18 = fVarA9.f75997a;
                            x1 x1Var11 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f18);
                        default:
                            mVar2.C(614176179);
                            x1 x1Var12 = p3.n.f135158a;
                            Iterator<T> it7 = aVar5.f102607e.iterator();
                            if (!it7.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA11 = g6.f.a(i70.b.b(((k31.c) it7.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                            while (it7.hasNext()) {
                                g6.f fVarA12 = g6.f.a(i70.b.b(((k31.c) it7.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                                if (fVarA11.compareTo(fVarA12) < 0) {
                                    fVarA11 = fVarA12;
                                }
                            }
                            float f19 = fVarA11.f75997a;
                            x1 x1Var13 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f19);
                    }
                }
            }, new e23.q() { // from class: r31.m
                @Override // e23.q
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    int i18 = i17;
                    x0 x0Var2 = x0VarE2;
                    k31.a aVar5 = aVar;
                    float fFloatValue = ((Float) obj5).floatValue();
                    p3.m mVar2 = (p3.m) obj6;
                    ((Integer) obj7).intValue();
                    switch (i18) {
                        case 0:
                            mVar2.C(1620857426);
                            x1 x1Var2 = p3.n.f135158a;
                            Iterator<T> it = aVar5.f102607e.iterator();
                            if (!it.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA = g6.f.a(i70.b.b(((k31.c) it.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                            while (it.hasNext()) {
                                g6.f fVarA2 = g6.f.a(i70.b.b(((k31.c) it.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                                if (fVarA.compareTo(fVarA2) < 0) {
                                    fVarA = fVarA2;
                                }
                            }
                            float f14 = fVarA.f75997a;
                            x1 x1Var3 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f14);
                        case 1:
                            mVar2.C(-1667428623);
                            x1 x1Var4 = p3.n.f135158a;
                            Iterator<T> it3 = aVar5.f102607e.iterator();
                            if (!it3.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA3 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it3.next()).f102654j), x0Var2, fFloatValue, mVar2));
                            while (it3.hasNext()) {
                                g6.f fVarA4 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it3.next()).f102654j), x0Var2, fFloatValue, mVar2));
                                if (fVarA3.compareTo(fVarA4) < 0) {
                                    fVarA3 = fVarA4;
                                }
                            }
                            float f15 = fVarA3.f75997a;
                            x1 x1Var5 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f15);
                        case 2:
                            mVar2.C(-755109466);
                            x1 x1Var6 = p3.n.f135158a;
                            Iterator<T> it4 = aVar5.f102607e.iterator();
                            if (!it4.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA5 = g6.f.a(i70.b.b(((k31.c) it4.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                            while (it4.hasNext()) {
                                g6.f fVarA6 = g6.f.a(i70.b.b(((k31.c) it4.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                                if (fVarA5.compareTo(fVarA6) < 0) {
                                    fVarA5 = fVarA6;
                                }
                            }
                            float f16 = fVarA5.f75997a;
                            x1 x1Var7 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f16);
                        case 3:
                            mVar2.C(1728290629);
                            x1 x1Var8 = p3.n.f135158a;
                            Iterator<T> it5 = aVar5.f102607e.iterator();
                            if (!it5.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA7 = g6.f.a(i70.b.b(((k31.c) it5.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                            while (it5.hasNext()) {
                                g6.f fVarA8 = g6.f.a(i70.b.b(((k31.c) it5.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                                if (fVarA7.compareTo(fVarA8) < 0) {
                                    fVarA7 = fVarA8;
                                }
                            }
                            float f17 = fVarA7.f75997a;
                            x1 x1Var9 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f17);
                        case 4:
                            mVar2.C(-83276572);
                            x1 x1Var10 = p3.n.f135158a;
                            Iterator<T> it6 = aVar5.f102607e.iterator();
                            if (!it6.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA9 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it6.next()).f102654j), x0Var2, fFloatValue, mVar2));
                            while (it6.hasNext()) {
                                g6.f fVarA10 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it6.next()).f102654j), x0Var2, fFloatValue, mVar2));
                                if (fVarA9.compareTo(fVarA10) < 0) {
                                    fVarA9 = fVarA10;
                                }
                            }
                            float f18 = fVarA9.f75997a;
                            x1 x1Var11 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f18);
                        default:
                            mVar2.C(614176179);
                            x1 x1Var12 = p3.n.f135158a;
                            Iterator<T> it7 = aVar5.f102607e.iterator();
                            if (!it7.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA11 = g6.f.a(i70.b.b(((k31.c) it7.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                            while (it7.hasNext()) {
                                g6.f fVarA12 = g6.f.a(i70.b.b(((k31.c) it7.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                                if (fVarA11.compareTo(fVarA12) < 0) {
                                    fVarA11 = fVarA12;
                                }
                            }
                            float f19 = fVarA11.f75997a;
                            x1 x1Var13 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f19);
                    }
                }
            }, mVar, 1572864);
            mVar.f();
        } else {
            mVar.C(-293942636);
            final int i18 = 5;
            final int i19 = 0;
            final int i24 = 1;
            r31.r.b(cVar.f102648d, strC, strB, strQ, aVar3, aVar4, x2.x(x2.f(h4.r.S, 1.0f), null, 3), x0VarE, x0Var, x0VarE2, new e23.q() { // from class: r31.m
                @Override // e23.q
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    int i110 = i18;
                    x0 x0Var2 = x0VarE;
                    k31.a aVar5 = aVar;
                    float fFloatValue = ((Float) obj5).floatValue();
                    p3.m mVar2 = (p3.m) obj6;
                    ((Integer) obj7).intValue();
                    switch (i110) {
                        case 0:
                            mVar2.C(1620857426);
                            x1 x1Var2 = p3.n.f135158a;
                            Iterator<T> it = aVar5.f102607e.iterator();
                            if (!it.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA = g6.f.a(i70.b.b(((k31.c) it.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                            while (it.hasNext()) {
                                g6.f fVarA2 = g6.f.a(i70.b.b(((k31.c) it.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                                if (fVarA.compareTo(fVarA2) < 0) {
                                    fVarA = fVarA2;
                                }
                            }
                            float f14 = fVarA.f75997a;
                            x1 x1Var3 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f14);
                        case 1:
                            mVar2.C(-1667428623);
                            x1 x1Var4 = p3.n.f135158a;
                            Iterator<T> it3 = aVar5.f102607e.iterator();
                            if (!it3.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA3 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it3.next()).f102654j), x0Var2, fFloatValue, mVar2));
                            while (it3.hasNext()) {
                                g6.f fVarA4 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it3.next()).f102654j), x0Var2, fFloatValue, mVar2));
                                if (fVarA3.compareTo(fVarA4) < 0) {
                                    fVarA3 = fVarA4;
                                }
                            }
                            float f15 = fVarA3.f75997a;
                            x1 x1Var5 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f15);
                        case 2:
                            mVar2.C(-755109466);
                            x1 x1Var6 = p3.n.f135158a;
                            Iterator<T> it4 = aVar5.f102607e.iterator();
                            if (!it4.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA5 = g6.f.a(i70.b.b(((k31.c) it4.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                            while (it4.hasNext()) {
                                g6.f fVarA6 = g6.f.a(i70.b.b(((k31.c) it4.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                                if (fVarA5.compareTo(fVarA6) < 0) {
                                    fVarA5 = fVarA6;
                                }
                            }
                            float f16 = fVarA5.f75997a;
                            x1 x1Var7 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f16);
                        case 3:
                            mVar2.C(1728290629);
                            x1 x1Var8 = p3.n.f135158a;
                            Iterator<T> it5 = aVar5.f102607e.iterator();
                            if (!it5.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA7 = g6.f.a(i70.b.b(((k31.c) it5.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                            while (it5.hasNext()) {
                                g6.f fVarA8 = g6.f.a(i70.b.b(((k31.c) it5.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                                if (fVarA7.compareTo(fVarA8) < 0) {
                                    fVarA7 = fVarA8;
                                }
                            }
                            float f17 = fVarA7.f75997a;
                            x1 x1Var9 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f17);
                        case 4:
                            mVar2.C(-83276572);
                            x1 x1Var10 = p3.n.f135158a;
                            Iterator<T> it6 = aVar5.f102607e.iterator();
                            if (!it6.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA9 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it6.next()).f102654j), x0Var2, fFloatValue, mVar2));
                            while (it6.hasNext()) {
                                g6.f fVarA10 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it6.next()).f102654j), x0Var2, fFloatValue, mVar2));
                                if (fVarA9.compareTo(fVarA10) < 0) {
                                    fVarA9 = fVarA10;
                                }
                            }
                            float f18 = fVarA9.f75997a;
                            x1 x1Var11 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f18);
                        default:
                            mVar2.C(614176179);
                            x1 x1Var12 = p3.n.f135158a;
                            Iterator<T> it7 = aVar5.f102607e.iterator();
                            if (!it7.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA11 = g6.f.a(i70.b.b(((k31.c) it7.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                            while (it7.hasNext()) {
                                g6.f fVarA12 = g6.f.a(i70.b.b(((k31.c) it7.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                                if (fVarA11.compareTo(fVarA12) < 0) {
                                    fVarA11 = fVarA12;
                                }
                            }
                            float f19 = fVarA11.f75997a;
                            x1 x1Var13 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f19);
                    }
                }
            }, new e23.q() { // from class: r31.m
                @Override // e23.q
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    int i110 = i19;
                    x0 x0Var2 = x0Var;
                    k31.a aVar5 = aVar;
                    float fFloatValue = ((Float) obj5).floatValue();
                    p3.m mVar2 = (p3.m) obj6;
                    ((Integer) obj7).intValue();
                    switch (i110) {
                        case 0:
                            mVar2.C(1620857426);
                            x1 x1Var2 = p3.n.f135158a;
                            Iterator<T> it = aVar5.f102607e.iterator();
                            if (!it.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA = g6.f.a(i70.b.b(((k31.c) it.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                            while (it.hasNext()) {
                                g6.f fVarA2 = g6.f.a(i70.b.b(((k31.c) it.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                                if (fVarA.compareTo(fVarA2) < 0) {
                                    fVarA = fVarA2;
                                }
                            }
                            float f14 = fVarA.f75997a;
                            x1 x1Var3 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f14);
                        case 1:
                            mVar2.C(-1667428623);
                            x1 x1Var4 = p3.n.f135158a;
                            Iterator<T> it3 = aVar5.f102607e.iterator();
                            if (!it3.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA3 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it3.next()).f102654j), x0Var2, fFloatValue, mVar2));
                            while (it3.hasNext()) {
                                g6.f fVarA4 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it3.next()).f102654j), x0Var2, fFloatValue, mVar2));
                                if (fVarA3.compareTo(fVarA4) < 0) {
                                    fVarA3 = fVarA4;
                                }
                            }
                            float f15 = fVarA3.f75997a;
                            x1 x1Var5 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f15);
                        case 2:
                            mVar2.C(-755109466);
                            x1 x1Var6 = p3.n.f135158a;
                            Iterator<T> it4 = aVar5.f102607e.iterator();
                            if (!it4.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA5 = g6.f.a(i70.b.b(((k31.c) it4.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                            while (it4.hasNext()) {
                                g6.f fVarA6 = g6.f.a(i70.b.b(((k31.c) it4.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                                if (fVarA5.compareTo(fVarA6) < 0) {
                                    fVarA5 = fVarA6;
                                }
                            }
                            float f16 = fVarA5.f75997a;
                            x1 x1Var7 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f16);
                        case 3:
                            mVar2.C(1728290629);
                            x1 x1Var8 = p3.n.f135158a;
                            Iterator<T> it5 = aVar5.f102607e.iterator();
                            if (!it5.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA7 = g6.f.a(i70.b.b(((k31.c) it5.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                            while (it5.hasNext()) {
                                g6.f fVarA8 = g6.f.a(i70.b.b(((k31.c) it5.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                                if (fVarA7.compareTo(fVarA8) < 0) {
                                    fVarA7 = fVarA8;
                                }
                            }
                            float f17 = fVarA7.f75997a;
                            x1 x1Var9 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f17);
                        case 4:
                            mVar2.C(-83276572);
                            x1 x1Var10 = p3.n.f135158a;
                            Iterator<T> it6 = aVar5.f102607e.iterator();
                            if (!it6.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA9 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it6.next()).f102654j), x0Var2, fFloatValue, mVar2));
                            while (it6.hasNext()) {
                                g6.f fVarA10 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it6.next()).f102654j), x0Var2, fFloatValue, mVar2));
                                if (fVarA9.compareTo(fVarA10) < 0) {
                                    fVarA9 = fVarA10;
                                }
                            }
                            float f18 = fVarA9.f75997a;
                            x1 x1Var11 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f18);
                        default:
                            mVar2.C(614176179);
                            x1 x1Var12 = p3.n.f135158a;
                            Iterator<T> it7 = aVar5.f102607e.iterator();
                            if (!it7.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA11 = g6.f.a(i70.b.b(((k31.c) it7.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                            while (it7.hasNext()) {
                                g6.f fVarA12 = g6.f.a(i70.b.b(((k31.c) it7.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                                if (fVarA11.compareTo(fVarA12) < 0) {
                                    fVarA11 = fVarA12;
                                }
                            }
                            float f19 = fVarA11.f75997a;
                            x1 x1Var13 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f19);
                    }
                }
            }, new e23.q() { // from class: r31.m
                @Override // e23.q
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    int i110 = i24;
                    x0 x0Var2 = x0VarE2;
                    k31.a aVar5 = aVar;
                    float fFloatValue = ((Float) obj5).floatValue();
                    p3.m mVar2 = (p3.m) obj6;
                    ((Integer) obj7).intValue();
                    switch (i110) {
                        case 0:
                            mVar2.C(1620857426);
                            x1 x1Var2 = p3.n.f135158a;
                            Iterator<T> it = aVar5.f102607e.iterator();
                            if (!it.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA = g6.f.a(i70.b.b(((k31.c) it.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                            while (it.hasNext()) {
                                g6.f fVarA2 = g6.f.a(i70.b.b(((k31.c) it.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                                if (fVarA.compareTo(fVarA2) < 0) {
                                    fVarA = fVarA2;
                                }
                            }
                            float f14 = fVarA.f75997a;
                            x1 x1Var3 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f14);
                        case 1:
                            mVar2.C(-1667428623);
                            x1 x1Var4 = p3.n.f135158a;
                            Iterator<T> it3 = aVar5.f102607e.iterator();
                            if (!it3.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA3 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it3.next()).f102654j), x0Var2, fFloatValue, mVar2));
                            while (it3.hasNext()) {
                                g6.f fVarA4 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it3.next()).f102654j), x0Var2, fFloatValue, mVar2));
                                if (fVarA3.compareTo(fVarA4) < 0) {
                                    fVarA3 = fVarA4;
                                }
                            }
                            float f15 = fVarA3.f75997a;
                            x1 x1Var5 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f15);
                        case 2:
                            mVar2.C(-755109466);
                            x1 x1Var6 = p3.n.f135158a;
                            Iterator<T> it4 = aVar5.f102607e.iterator();
                            if (!it4.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA5 = g6.f.a(i70.b.b(((k31.c) it4.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                            while (it4.hasNext()) {
                                g6.f fVarA6 = g6.f.a(i70.b.b(((k31.c) it4.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                                if (fVarA5.compareTo(fVarA6) < 0) {
                                    fVarA5 = fVarA6;
                                }
                            }
                            float f16 = fVarA5.f75997a;
                            x1 x1Var7 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f16);
                        case 3:
                            mVar2.C(1728290629);
                            x1 x1Var8 = p3.n.f135158a;
                            Iterator<T> it5 = aVar5.f102607e.iterator();
                            if (!it5.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA7 = g6.f.a(i70.b.b(((k31.c) it5.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                            while (it5.hasNext()) {
                                g6.f fVarA8 = g6.f.a(i70.b.b(((k31.c) it5.next()).b(a0.s(mVar2), new Object[0]), x0Var2, fFloatValue, mVar2));
                                if (fVarA7.compareTo(fVarA8) < 0) {
                                    fVarA7 = fVarA8;
                                }
                            }
                            float f17 = fVarA7.f75997a;
                            x1 x1Var9 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f17);
                        case 4:
                            mVar2.C(-83276572);
                            x1 x1Var10 = p3.n.f135158a;
                            Iterator<T> it6 = aVar5.f102607e.iterator();
                            if (!it6.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA9 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it6.next()).f102654j), x0Var2, fFloatValue, mVar2));
                            while (it6.hasNext()) {
                                g6.f fVarA10 = g6.f.a(i70.b.b(y.Q(mVar2, ((k31.c) it6.next()).f102654j), x0Var2, fFloatValue, mVar2));
                                if (fVarA9.compareTo(fVarA10) < 0) {
                                    fVarA9 = fVarA10;
                                }
                            }
                            float f18 = fVarA9.f75997a;
                            x1 x1Var11 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f18);
                        default:
                            mVar2.C(614176179);
                            x1 x1Var12 = p3.n.f135158a;
                            Iterator<T> it7 = aVar5.f102607e.iterator();
                            if (!it7.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            g6.f fVarA11 = g6.f.a(i70.b.b(((k31.c) it7.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                            while (it7.hasNext()) {
                                g6.f fVarA12 = g6.f.a(i70.b.b(((k31.c) it7.next()).c(a0.s(mVar2)), x0Var2, fFloatValue, mVar2));
                                if (fVarA11.compareTo(fVarA12) < 0) {
                                    fVarA11 = fVarA12;
                                }
                            }
                            float f19 = fVarA11.f75997a;
                            x1 x1Var13 = p3.n.f135158a;
                            mVar2.f();
                            return g6.f.a(f19);
                    }
                }
            }, 0L, mVar, 1572864, 24576);
            mVar.f();
        }
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        np.c cVar = (np.c) this.f92332b;
        rp.c cVar2 = (rp.c) this.f92333c;
        e23.a aVar = (e23.a) this.f92334d;
        v vVar = (v) obj2;
        m mVar = (m) obj3;
        q2.t((Integer) obj4, (r1.l) obj, vVar);
        x1 x1Var = n.f135158a;
        rp.f fVar = (rp.f) w.a(vVar, s0.f105811a.b(rp.f.class));
        fVar.getClass();
        o82.g gVar = o82.g.f130857j;
        o oVar = new o(fVar.f154062c, fVar.f154061b, 1);
        b63.i.INSTANCE.getClass();
        np.g.a(cVar, new sp.a(new n82.f.a(gVar, null, b63.q.c(b63.q.e(oVar, 1, b63.i.f16192f), 1, b63.i.f16190d), 2, null), j53.l.b()), cVar2, aVar, mVar, 64);
        return Unit.INSTANCE;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        sy.k kVar = (sy.k) this.f92332b;
        n82.f fVar = (n82.f) this.f92333c;
        sy.a aVar = (sy.a) this.f92334d;
        o82.g gVar = (o82.g) obj;
        o82.a aVar2 = (o82.a) obj2;
        m mVar = (m) obj3;
        int iD = vb.h.d((Integer) obj4, gVar, aVar2);
        if ((iD & 6) == 0) {
            i14 = (mVar.k(gVar.ordinal()) ? 4 : 2) | iD;
        } else {
            i14 = iD;
        }
        if ((iD & 48) == 0) {
            i14 |= mVar.B(aVar2) ? 32 : 16;
        }
        if (mVar.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            int i15 = sy.j.a.f161179a[gVar.ordinal()];
            if (i15 == 1) {
                mVar.C(-82412384);
                wy.d.a(aVar2, kVar, fVar, aVar, mVar, (i14 >> 3) & 14);
                mVar.f();
            } else if (i15 == 2 || i15 == 3) {
                mVar.C(-82405569);
                xy.j.b(aVar2, kVar, fVar, aVar, mVar, (i14 >> 3) & 14);
                mVar.f();
            } else if (i15 != 4) {
                mVar.C(1740646193);
                mVar.f();
            } else {
                mVar.C(-82401024);
                xy.l.b(aVar2, kVar, fVar, aVar, mVar, (i14 >> 3) & 14);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0389  */
    /* JADX WARN: Code duplicated, block: B:108:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:10:0x006d  */
    /* JADX WARN: Code duplicated, block: B:110:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:112:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:118:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:125:0x0433  */
    /* JADX WARN: Code duplicated, block: B:142:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:143:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:152:0x053a  */
    /* JADX WARN: Code duplicated, block: B:15:0x008c  */
    /* JADX WARN: Code duplicated, block: B:167:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:172:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:179:0x064a  */
    /* JADX WARN: Code duplicated, block: B:184:0x0667  */
    /* JADX WARN: Code duplicated, block: B:189:0x0686  */
    /* JADX WARN: Code duplicated, block: B:194:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:199:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:204:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:220:0x079f  */
    /* JADX WARN: Code duplicated, block: B:225:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:230:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:235:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:244:0x0874  */
    /* JADX WARN: Code duplicated, block: B:323:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:335:0x0b88  */
    /* JADX WARN: Code duplicated, block: B:340:0x0ba5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0197  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:60:0x022c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0260  */
    /* JADX WARN: Code duplicated, block: B:70:0x0285  */
    /* JADX WARN: Code duplicated, block: B:75:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:85:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:90:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x031e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v198, types: [java.lang.Object, o13.l] */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        m mVar;
        List<n72.i> listA;
        n72.i iVar;
        Object obj5;
        am.x0 x0Var;
        Object objD;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        int i14 = this.f92331a;
        int i15 = 14;
        Object obj18 = null;
        final int i16 = 2;
        final int i17 = 1;
        int i18 = 3;
        int i19 = 6;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        m.a aVar = m.f135153a;
        Object obj19 = this.f92334d;
        Object obj20 = this.f92333c;
        Object obj21 = this.f92332b;
        switch (i14) {
            case 0:
                r70.q qVar = (r70.q) obj20;
                String str = (String) obj19;
                String str2 = (String) obj;
                d91.f fVar = (d91.f) obj2;
                str2.getClass();
                fVar.getClass();
                ((g) obj21).f92338a.f92358c.f69997a.b(str2, fVar, (List) obj3, (String) obj4);
                if (fVar.f58533c) {
                    x53.c cVar = o53.s0.f129406a;
                    ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new g.b(qVar, str, null), 3);
                }
                return Unit.INSTANCE;
            case 1:
                ic1.m mVar2 = (ic1.m) obj21;
                l lVar = (l) obj20;
                n82.f fVar2 = (n82.f) obj19;
                o82.g gVar = (o82.g) obj;
                o82.a aVar2 = (o82.a) obj2;
                m mVar3 = (m) obj3;
                int iD = vb.h.d((Integer) obj4, gVar, aVar2);
                int i24 = (iD & 6) == 0 ? iD | (mVar3.k(gVar.ordinal()) ? 4 : 2) : iD;
                if ((iD & 48) == 0) {
                    i24 |= mVar3.B(aVar2) ? 32 : 16;
                }
                if (mVar3.n(i24 & 1, (i24 & 147) != 146)) {
                    x1 x1Var = n.f135158a;
                    int i25 = ic1.l.a.f92628a[gVar.ordinal()];
                    if (i25 == 1) {
                        mVar3.C(-1434137645);
                        u82.e.b(aVar2, mVar2.f92631c, null, false, z3.f.c(482725758, new e(aVar2, i16, mVar2, lVar), mVar3), mVar3, ((i24 >> 3) & 14) | 24576, 12);
                        mVar3.f();
                    } else if (i25 == 2 || i25 == 3) {
                        mVar3.C(-1434111776);
                        u82.e.b(aVar2, mVar2.f92632d, null, false, z3.f.c(1564924917, new ic1.k(aVar2, fVar2, z14 ? 1 : 0), mVar3), mVar3, ((i24 >> 3) & 14) | 24576, 12);
                        mVar3.f();
                    } else {
                        mVar3.C(-1434085702);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                final ic1.m mVar4 = (ic1.m) obj20;
                l lVar2 = (l) obj19;
                u82.f fVar3 = (u82.f) obj2;
                m mVar5 = (m) obj3;
                ((Integer) obj4).getClass();
                ((t) obj).getClass();
                fVar3.getClass();
                x1 x1Var2 = n.f135158a;
                dc1.a aVar3 = (dc1.a) fVar3.a();
                DateTime dateTimeK = vb.h.k(((o82.a) obj21).f130843a);
                tf0.i iVar2 = mVar4.f92629a;
                boolean zR = mVar5.r(mVar4);
                Object objQ = mVar5.q();
                if (zR) {
                    final boolean z17 = z15 ? 1 : 0;
                    objQ = new l() { // from class: ic1.j
                        @Override // e23.l
                        public final Object invoke(Object obj22) {
                            Object value;
                            switch (z17) {
                                case 0:
                                    boolean zBooleanValue = ((Boolean) obj22).booleanValue();
                                    r53.p2 p2Var = mVar4.f92630b;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, n.a((n) value, null, null, zBooleanValue, 3)));
                                    break;
                                default:
                                    DateTime dateTime = (DateTime) obj22;
                                    dateTime.getClass();
                                    o oVarB = g22.k.z(dateTime).b();
                                    m mVar6 = mVar4;
                                    mVar6.getClass();
                                    mVar6.f92631c.i(new o82.a(oVarB, null, 2, null), true);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar5.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        final int z18 = z15 ? 1 : 0;
                        objQ = new l() { // from class: ic1.j
                            @Override // e23.l
                            public final Object invoke(Object obj22) {
                                Object value;
                                switch (z18) {
                                    case 0:
                                        boolean zBooleanValue = ((Boolean) obj22).booleanValue();
                                        r53.p2 p2Var = mVar4.f92630b;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, n.a((n) value, null, null, zBooleanValue, 3)));
                                        break;
                                    default:
                                        DateTime dateTime = (DateTime) obj22;
                                        dateTime.getClass();
                                        o oVarB = g22.k.z(dateTime).b();
                                        m mVar6 = mVar4;
                                        mVar6.getClass();
                                        mVar6.f92631c.i(new o82.a(oVarB, null, 2, null), true);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar5.K(objQ);
                    }
                }
                l lVar3 = (l) objQ;
                boolean zR2 = mVar5.r(mVar4);
                Object objQ2 = mVar5.q();
                if (zR2) {
                    objQ2 = new l() { // from class: ic1.j
                        @Override // e23.l
                        public final Object invoke(Object obj22) {
                            Object value;
                            switch (i17) {
                                case 0:
                                    boolean zBooleanValue = ((Boolean) obj22).booleanValue();
                                    r53.p2 p2Var = mVar4.f92630b;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, n.a((n) value, null, null, zBooleanValue, 3)));
                                    break;
                                default:
                                    DateTime dateTime = (DateTime) obj22;
                                    dateTime.getClass();
                                    o oVarB = g22.k.z(dateTime).b();
                                    m mVar6 = mVar4;
                                    mVar6.getClass();
                                    mVar6.f92631c.i(new o82.a(oVarB, null, 2, null), true);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar5.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new l() { // from class: ic1.j
                            @Override // e23.l
                            public final Object invoke(Object obj22) {
                                Object value;
                                switch (i17) {
                                    case 0:
                                        boolean zBooleanValue = ((Boolean) obj22).booleanValue();
                                        r53.p2 p2Var = mVar4.f92630b;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, n.a((n) value, null, null, zBooleanValue, 3)));
                                        break;
                                    default:
                                        DateTime dateTime = (DateTime) obj22;
                                        dateTime.getClass();
                                        o oVarB = g22.k.z(dateTime).b();
                                        m mVar6 = mVar4;
                                        mVar6.getClass();
                                        mVar6.f92631c.i(new o82.a(oVarB, null, 2, null), true);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar5.K(objQ2);
                    }
                }
                mc1.b.b(aVar3, dateTimeK, iVar2, lVar3, (l) objQ2, lVar2, mVar5, tf0.i.f164439d << 6);
                return Unit.INSTANCE;
            case 3:
                s sVar = (s) obj20;
                o82.a aVar4 = (o82.a) obj19;
                u82.f fVar4 = (u82.f) obj2;
                m mVar6 = (m) obj3;
                ((Integer) obj4).getClass();
                ((t) obj).getClass();
                fVar4.getClass();
                x1 x1Var3 = n.f135158a;
                kh0.h.a(sVar, (List) fVar4.a(), vb.h.k(aVar4.f130843a), vb.h.k(aVar4.f130844b), com.garmin.android.apps.connectmobile.fitness_age.presentation.a.C0605a.f35223a[((o82.g) obj21).ordinal()] != 1 ? Integer.MAX_VALUE : 6, mVar6, 0);
                return Unit.INSTANCE;
            case 4:
                s sVar2 = (s) obj21;
                o82.a aVar5 = (o82.a) obj20;
                n82.f fVar5 = (n82.f) obj19;
                u82.f fVar6 = (u82.f) obj2;
                m mVar7 = (m) obj3;
                ((Integer) obj4).getClass();
                ((t) obj).getClass();
                fVar6.getClass();
                x1 x1Var4 = n.f135158a;
                List list = (List) fVar6.a();
                DateTime dateTimeK2 = vb.h.k(aVar5.f130843a);
                DateTime dateTimeK3 = vb.h.k(aVar5.f130844b);
                boolean zB = mVar7.B(fVar5);
                Object objQ3 = mVar7.q();
                if (zB) {
                    objQ3 = new k(fVar5, 8);
                    mVar7.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new k(fVar5, 8);
                        mVar7.K(objQ3);
                    }
                }
                kh0.k.a(sVar2, list, dateTimeK2, dateTimeK3, (l) objQ3, mVar7, 0);
                return Unit.INSTANCE;
            case 5:
                s sVar3 = (s) obj21;
                lc.y yVar = (lc.y) obj20;
                n82.f fVar7 = (n82.f) obj19;
                o82.g gVar2 = (o82.g) obj;
                o82.a aVar6 = (o82.a) obj2;
                m mVar8 = (m) obj3;
                int iD2 = vb.h.d((Integer) obj4, gVar2, aVar6);
                int i26 = (iD2 & 6) == 0 ? (mVar8.k(gVar2.ordinal()) ? 4 : 2) | iD2 : iD2;
                if ((iD2 & 48) == 0) {
                    i26 |= mVar8.B(aVar6) ? 32 : 16;
                }
                if (mVar8.n(i26 & 1, (i26 & 147) != 146)) {
                    x1 x1Var5 = n.f135158a;
                    int i27 = com.garmin.android.apps.connectmobile.fitness_age.presentation.a.C0605a.f35223a[gVar2.ordinal()];
                    if (i27 == 1 || i27 == 2) {
                        mVar8.C(-1983324266);
                        u82.e.b(aVar6, sVar3.f93491j, u1.n.e(h4.r.S, tn.k.a(d92.b.f58623a, mVar8), m1.f128891a), false, z3.f.c(-58548235, new e(gVar2, i18, sVar3, aVar6), mVar8), mVar8, ((i26 >> 3) & 14) | 24576, 8);
                        mVar8.f();
                    } else if (i27 == 3) {
                        mVar8.C(-1983967640);
                        u82.e.b(aVar6, sVar3.f93490i, u1.n.e(h4.r.S, tn.k.a(d92.b.f58623a, mVar8), m1.f128891a), false, z3.f.c(1027470220, new ao1.f(17, sVar3, yVar), mVar8), mVar8, ((i26 >> 3) & 14) | 24576, 8);
                        mVar8.f();
                    } else if (i27 != 4) {
                        mVar8.C(-2003562856);
                        mVar8.f();
                    } else {
                        mVar8.C(-1981857036);
                        u82.e.b(aVar6, sVar3.f93492k, u1.n.e(h4.r.S, tn.k.a(d92.b.f58623a, mVar8), m1.f128891a), false, z3.f.c(-1801605676, new e(sVar3, 4, aVar6, fVar7), mVar8), mVar8, ((i26 >> 3) & 14) | 24576, 8);
                        mVar8.f();
                    }
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 6:
                zc.d dVar = (zc.d) obj21;
                li0.f fVar8 = (li0.f) obj20;
                String str3 = (String) obj19;
                e2.d dVar2 = (e2.d) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m mVar9 = (m) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                dVar2.getClass();
                int i28 = (iIntValue2 & 6) == 0 ? iIntValue2 | (mVar9.B(dVar2) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i28 |= mVar9.k(iIntValue) ? 32 : 16;
                }
                if (mVar9.n(i28 & 1, (i28 & 147) != 146)) {
                    x1 x1Var6 = n.f135158a;
                    p003ji0.m mVar10 = (p003ji0.m) dVar.a(iIntValue);
                    if (mVar10 == null) {
                        mVar9.C(1469693276);
                        mVar9.f();
                    } else {
                        mVar9.C(1469693277);
                        if (mVar10 instanceof ji0.m.a) {
                            mVar9.C(105867539);
                            li0.c0.f112641a.a(((ji0.m.a) mVar10).f98798a, fVar8, e2.d.c(dVar2, h4.r.S), null, mVar9, li0.d0.f112647j | (li0.f.f112658h << 3), 8);
                            mVar = mVar9;
                            mVar.f();
                        } else {
                            mVar = mVar9;
                            if (!(mVar10 instanceof ji0.m.b)) {
                                throw n23.j.m(mVar, 105864538);
                            }
                            mVar.C(105876168);
                            int i29 = ((ji0.m.b) mVar10).f98799a;
                            if (str3 == null) {
                                str3 = "";
                            }
                            r1.b(y.P(i29, new Object[]{str3}, mVar), null, mVar, 0, 2);
                            mVar.f();
                        }
                        mVar.f();
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 7:
                n82.f fVar9 = (n82.f) obj21;
                o82.a aVar7 = (o82.a) obj20;
                ix.j jVar = (ix.j) obj19;
                u82.f fVar10 = (u82.f) obj2;
                m mVar11 = (m) obj3;
                ((Integer) obj4).intValue();
                ((t) obj).getClass();
                fVar10.getClass();
                x1 x1Var7 = n.f135158a;
                boolean zB2 = mVar11.B(fVar9) | mVar11.B(aVar7) | mVar11.r(jVar) | mVar11.r(fVar10);
                Object objQ4 = mVar11.q();
                if (zB2) {
                    objQ4 = new ix.i.a(fVar9, aVar7, jVar, fVar10, null);
                    mVar11.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new ix.i.a(fVar9, aVar7, jVar, fVar10, null);
                        mVar11.K(objQ4);
                    }
                }
                l0.e((e23.p) objQ4, fVar10, mVar11);
                bx.a aVar8 = (bx.a) fVar10.a();
                DateTime dateTimeAtStartOfDay = g22.l.h(aVar7.f130843a).toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay.getClass();
                ox.a.a(aVar8, dateTimeAtStartOfDay, jVar, mVar11, 0);
                return Unit.INSTANCE;
            case 8:
                u82.f fVar11 = (u82.f) obj2;
                int iC = vb.h.c((Integer) obj4, (t) obj, fVar11);
                x1 x1Var8 = n.f135158a;
                nf1.i.a((o82.a) obj21, (o82.g) obj20, fVar11, (p1) obj19, (m) obj3, ((iC << 3) & 896) | 3072);
                return Unit.INSTANCE;
            case 9:
                zc.d dVar3 = (zc.d) obj21;
                final GroupCreationActivity groupCreationActivity = (GroupCreationActivity) obj20;
                m0 m0Var = (m0) obj19;
                m mVar12 = (m) obj3;
                ((Integer) obj4).getClass();
                int i30 = GroupCreationActivity.f36131b;
                ((r1.l) obj).getClass();
                ((v) obj2).getClass();
                x1 x1Var9 = n.f135158a;
                boolean zR3 = mVar12.r(groupCreationActivity);
                Object objQ5 = mVar12.q();
                if (zR3) {
                    objQ5 = new l() { // from class: km0.a
                        @Override // e23.l
                        public final Object invoke(Object obj22) {
                            Object value;
                            Object value2;
                            int i34 = i16;
                            GroupCreationActivity groupCreationActivity2 = groupCreationActivity;
                            switch (i34) {
                                case 0:
                                    Long l14 = (Long) obj22;
                                    l14.longValue();
                                    int i35 = GroupCreationActivity.f36131b;
                                    r53.p2 p2Var = groupCreationActivity2.da().f105342i;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, c1.i((Set) value, l14)));
                                    break;
                                case 1:
                                    Long l15 = (Long) obj22;
                                    l15.longValue();
                                    int i36 = GroupCreationActivity.f36131b;
                                    r53.p2 p2Var2 = groupCreationActivity2.da().f105342i;
                                    do {
                                        value2 = p2Var2.getValue();
                                    } while (!p2Var2.b(value2, c1.f((Set) value2, l15)));
                                    break;
                                default:
                                    String str4 = (String) obj22;
                                    int i37 = GroupCreationActivity.f36131b;
                                    str4.getClass();
                                    i iVarDa = groupCreationActivity2.da();
                                    ge1.b.T(v1.a(iVarDa), null, null, new k(iVarDa, str4, null), 3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar12.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new l() { // from class: km0.a
                            @Override // e23.l
                            public final Object invoke(Object obj22) {
                                Object value;
                                Object value2;
                                int i34 = i16;
                                GroupCreationActivity groupCreationActivity2 = groupCreationActivity;
                                switch (i34) {
                                    case 0:
                                        Long l14 = (Long) obj22;
                                        l14.longValue();
                                        int i35 = GroupCreationActivity.f36131b;
                                        r53.p2 p2Var = groupCreationActivity2.da().f105342i;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, c1.i((Set) value, l14)));
                                        break;
                                    case 1:
                                        Long l15 = (Long) obj22;
                                        l15.longValue();
                                        int i36 = GroupCreationActivity.f36131b;
                                        r53.p2 p2Var2 = groupCreationActivity2.da().f105342i;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, c1.f((Set) value2, l15)));
                                        break;
                                    default:
                                        String str4 = (String) obj22;
                                        int i37 = GroupCreationActivity.f36131b;
                                        str4.getClass();
                                        i iVarDa = groupCreationActivity2.da();
                                        ge1.b.T(v1.a(iVarDa), null, null, new k(iVarDa, str4, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(objQ5);
                    }
                }
                l lVar4 = (l) objQ5;
                boolean zR4 = mVar12.r(m0Var);
                Object objQ6 = mVar12.q();
                if (zR4) {
                    objQ6 = new k62.j(m0Var, i16);
                    mVar12.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == m.a.f135155b) {
                        objQ6 = new k62.j(m0Var, i16);
                        mVar12.K(objQ6);
                    }
                }
                e23.a aVar9 = (e23.a) objQ6;
                boolean zR5 = mVar12.r(groupCreationActivity);
                Object objQ7 = mVar12.q();
                if (zR5) {
                    final boolean z19 = z16 ? 1 : 0;
                    objQ7 = new l() { // from class: km0.a
                        @Override // e23.l
                        public final Object invoke(Object obj22) {
                            Object value;
                            Object value2;
                            int i34 = z19;
                            GroupCreationActivity groupCreationActivity2 = groupCreationActivity;
                            switch (i34) {
                                case 0:
                                    Long l14 = (Long) obj22;
                                    l14.longValue();
                                    int i35 = GroupCreationActivity.f36131b;
                                    r53.p2 p2Var = groupCreationActivity2.da().f105342i;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, c1.i((Set) value, l14)));
                                    break;
                                case 1:
                                    Long l15 = (Long) obj22;
                                    l15.longValue();
                                    int i36 = GroupCreationActivity.f36131b;
                                    r53.p2 p2Var2 = groupCreationActivity2.da().f105342i;
                                    do {
                                        value2 = p2Var2.getValue();
                                    } while (!p2Var2.b(value2, c1.f((Set) value2, l15)));
                                    break;
                                default:
                                    String str4 = (String) obj22;
                                    int i37 = GroupCreationActivity.f36131b;
                                    str4.getClass();
                                    i iVarDa = groupCreationActivity2.da();
                                    ge1.b.T(v1.a(iVarDa), null, null, new k(iVarDa, str4, null), 3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar12.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == m.a.f135155b) {
                        final int z110 = z16 ? 1 : 0;
                        objQ7 = new l() { // from class: km0.a
                            @Override // e23.l
                            public final Object invoke(Object obj22) {
                                Object value;
                                Object value2;
                                int i34 = z110;
                                GroupCreationActivity groupCreationActivity2 = groupCreationActivity;
                                switch (i34) {
                                    case 0:
                                        Long l14 = (Long) obj22;
                                        l14.longValue();
                                        int i35 = GroupCreationActivity.f36131b;
                                        r53.p2 p2Var = groupCreationActivity2.da().f105342i;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, c1.i((Set) value, l14)));
                                        break;
                                    case 1:
                                        Long l15 = (Long) obj22;
                                        l15.longValue();
                                        int i36 = GroupCreationActivity.f36131b;
                                        r53.p2 p2Var2 = groupCreationActivity2.da().f105342i;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, c1.f((Set) value2, l15)));
                                        break;
                                    default:
                                        String str4 = (String) obj22;
                                        int i37 = GroupCreationActivity.f36131b;
                                        str4.getClass();
                                        i iVarDa = groupCreationActivity2.da();
                                        ge1.b.T(v1.a(iVarDa), null, null, new k(iVarDa, str4, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(objQ7);
                    }
                }
                l lVar5 = (l) objQ7;
                boolean zR6 = mVar12.r(groupCreationActivity);
                Object objQ8 = mVar12.q();
                if (zR6) {
                    objQ8 = new l() { // from class: km0.a
                        @Override // e23.l
                        public final Object invoke(Object obj22) {
                            Object value;
                            Object value2;
                            int i34 = i17;
                            GroupCreationActivity groupCreationActivity2 = groupCreationActivity;
                            switch (i34) {
                                case 0:
                                    Long l14 = (Long) obj22;
                                    l14.longValue();
                                    int i35 = GroupCreationActivity.f36131b;
                                    r53.p2 p2Var = groupCreationActivity2.da().f105342i;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, c1.i((Set) value, l14)));
                                    break;
                                case 1:
                                    Long l15 = (Long) obj22;
                                    l15.longValue();
                                    int i36 = GroupCreationActivity.f36131b;
                                    r53.p2 p2Var2 = groupCreationActivity2.da().f105342i;
                                    do {
                                        value2 = p2Var2.getValue();
                                    } while (!p2Var2.b(value2, c1.f((Set) value2, l15)));
                                    break;
                                default:
                                    String str4 = (String) obj22;
                                    int i37 = GroupCreationActivity.f36131b;
                                    str4.getClass();
                                    i iVarDa = groupCreationActivity2.da();
                                    ge1.b.T(v1.a(iVarDa), null, null, new k(iVarDa, str4, null), 3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar12.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == m.a.f135155b) {
                        objQ8 = new l() { // from class: km0.a
                            @Override // e23.l
                            public final Object invoke(Object obj22) {
                                Object value;
                                Object value2;
                                int i34 = i17;
                                GroupCreationActivity groupCreationActivity2 = groupCreationActivity;
                                switch (i34) {
                                    case 0:
                                        Long l14 = (Long) obj22;
                                        l14.longValue();
                                        int i35 = GroupCreationActivity.f36131b;
                                        r53.p2 p2Var = groupCreationActivity2.da().f105342i;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, c1.i((Set) value, l14)));
                                        break;
                                    case 1:
                                        Long l15 = (Long) obj22;
                                        l15.longValue();
                                        int i36 = GroupCreationActivity.f36131b;
                                        r53.p2 p2Var2 = groupCreationActivity2.da().f105342i;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, c1.f((Set) value2, l15)));
                                        break;
                                    default:
                                        String str4 = (String) obj22;
                                        int i37 = GroupCreationActivity.f36131b;
                                        str4.getClass();
                                        i iVarDa = groupCreationActivity2.da();
                                        ge1.b.T(v1.a(iVarDa), null, null, new k(iVarDa, str4, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(objQ8);
                    }
                }
                an0.c.b(dVar3, lVar4, aVar9, lVar5, (l) objQ8, mVar12, 8);
                return Unit.INSTANCE;
            case 10:
                km0.i iVar3 = (km0.i) obj21;
                p1 p1Var = (p1) obj19;
                m mVar13 = (m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (v) obj2);
                x1 x1Var10 = n.f135158a;
                String str4 = ((km0.b) ((x3) obj20).getF182175a()).f105297a;
                boolean z24 = !((Boolean) p1Var.getF182175a()).booleanValue();
                Object objQ9 = mVar13.q();
                aVar.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ9 == c2565a) {
                    objQ9 = new kb0.k(p1Var, 15);
                    mVar13.K(objQ9);
                }
                e23.a aVar10 = (e23.a) objQ9;
                boolean zR7 = mVar13.r(iVar3);
                Object objQ10 = mVar13.q();
                if (zR7 || objQ10 == c2565a) {
                    objQ10 = new km0.f(iVar3, 9);
                    mVar13.K(objQ10);
                }
                lm0.n.a(str4, z24, aVar10, (l) objQ10, mVar13, 384);
                return Unit.INSTANCE;
            case 11:
                km0.i iVar4 = (km0.i) obj21;
                Context context = (Context) obj20;
                m mVar14 = (m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                ((v) obj2).getClass();
                x1 x1Var11 = n.f135158a;
                km0.b bVar = (km0.b) ((x3) obj19).getF182175a();
                boolean zR8 = mVar14.r(iVar4);
                Object objQ11 = mVar14.q();
                if (zR8) {
                    objQ11 = new km0.f(iVar4, 11);
                    mVar14.K(objQ11);
                } else {
                    aVar.getClass();
                    if (objQ11 == m.a.f135155b) {
                        objQ11 = new km0.f(iVar4, 11);
                        mVar14.K(objQ11);
                    }
                }
                l lVar6 = (l) objQ11;
                boolean zR9 = mVar14.r(iVar4);
                Object objQ12 = mVar14.q();
                if (zR9) {
                    objQ12 = new km0.f(iVar4, 12);
                    mVar14.K(objQ12);
                } else {
                    aVar.getClass();
                    if (objQ12 == m.a.f135155b) {
                        objQ12 = new km0.f(iVar4, 12);
                        mVar14.K(objQ12);
                    }
                }
                l lVar7 = (l) objQ12;
                boolean zR10 = mVar14.r(iVar4);
                Object objQ13 = mVar14.q();
                if (zR10) {
                    objQ13 = new km0.f(iVar4, 13);
                    mVar14.K(objQ13);
                } else {
                    aVar.getClass();
                    if (objQ13 == m.a.f135155b) {
                        objQ13 = new km0.f(iVar4, 13);
                        mVar14.K(objQ13);
                    }
                }
                l lVar8 = (l) objQ13;
                boolean zR11 = mVar14.r(iVar4);
                Object objQ14 = mVar14.q();
                if (zR11) {
                    objQ14 = new km0.f(iVar4, 1);
                    mVar14.K(objQ14);
                } else {
                    aVar.getClass();
                    if (objQ14 == m.a.f135155b) {
                        objQ14 = new km0.f(iVar4, 1);
                        mVar14.K(objQ14);
                    }
                }
                l lVar9 = (l) objQ14;
                boolean zR12 = mVar14.r(iVar4);
                Object objQ15 = mVar14.q();
                if (zR12) {
                    objQ15 = new km0.f(iVar4, 2);
                    mVar14.K(objQ15);
                } else {
                    aVar.getClass();
                    if (objQ15 == m.a.f135155b) {
                        objQ15 = new km0.f(iVar4, 2);
                        mVar14.K(objQ15);
                    }
                }
                l lVar10 = (l) objQ15;
                boolean zR13 = mVar14.r(iVar4) | mVar14.r(context);
                Object objQ16 = mVar14.q();
                if (zR13) {
                    objQ16 = new k11.h(12, iVar4, context);
                    mVar14.K(objQ16);
                } else {
                    aVar.getClass();
                    if (objQ16 == m.a.f135155b) {
                        objQ16 = new k11.h(12, iVar4, context);
                        mVar14.K(objQ16);
                    }
                }
                lm0.l.a(bVar, lVar6, lVar7, lVar8, lVar9, lVar10, (e23.a) objQ16, mVar14, 0);
                return Unit.INSTANCE;
            case 12:
                km0.i iVar5 = (km0.i) obj21;
                e23.a aVar11 = (e23.a) obj20;
                m mVar15 = (m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                ((v) obj2).getClass();
                x1 x1Var12 = n.f135158a;
                List list2 = (List) ((x3) obj19).getF182175a();
                boolean zR14 = mVar15.r(iVar5);
                Object objQ17 = mVar15.q();
                if (zR14) {
                    objQ17 = new km0.f(iVar5, 0);
                    mVar15.K(objQ17);
                } else {
                    aVar.getClass();
                    if (objQ17 == m.a.f135155b) {
                        objQ17 = new km0.f(iVar5, 0);
                        mVar15.K(objQ17);
                    }
                }
                l lVar11 = (l) objQ17;
                boolean zR15 = mVar15.r(iVar5);
                Object objQ18 = mVar15.q();
                if (zR15) {
                    objQ18 = new km0.f(iVar5, 6);
                    mVar15.K(objQ18);
                } else {
                    aVar.getClass();
                    if (objQ18 == m.a.f135155b) {
                        objQ18 = new km0.f(iVar5, 6);
                        mVar15.K(objQ18);
                    }
                }
                lm0.g.a(list2, lVar11, (l) objQ18, aVar11, mVar15, 0);
                return Unit.INSTANCE;
            case 13:
                l lVar12 = (l) obj21;
                String str5 = (String) obj19;
                p1 p1Var2 = (p1) obj20;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                m mVar16 = (m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                x1 x1Var13 = n.f135158a;
                if (zBooleanValue) {
                    mVar16.C(-1005460288);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = n1.a(t62.b.f162798a);
                    h4.r.a aVar12 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarM = x2.m(aVar12, j92.b.f97901d.f97904c);
                    boolean zB3 = mVar16.B(lVar12);
                    Object objQ19 = mVar16.q();
                    if (zB3) {
                        objQ19 = new ew1.v1(lVar12, p1Var2, 11);
                        mVar16.K(objQ19);
                    } else {
                        aVar.getClass();
                        if (objQ19 == m.a.f135155b) {
                            objQ19 = new ew1.v1(lVar12, p1Var2, 11);
                            mVar16.K(objQ19);
                        }
                    }
                    i7.b(dVarA, null, u1.w.d(rVarM, false, null, null, (e23.a) objQ19, 15), sn.a.b(mVar16), mVar16, 48, 0);
                    mVar16.f();
                } else if (str5 == null || d53.w.J(str5)) {
                    mVar16.C(-1004619940);
                    mVar16.f();
                } else {
                    mVar16.C(-1004864995);
                    s62.a.f157643a.getClass();
                    i7.b(e1.a(t62.b.f162798a), null, null, fb1.c.g(d92.b.f58623a, mVar16), mVar16, 48, 4);
                    mVar16.f();
                }
                return Unit.INSTANCE;
            case 14:
                m72.i iVar6 = (m72.i) obj21;
                m0 m0Var2 = (m0) obj20;
                e23.a aVar13 = (e23.a) obj19;
                v vVar = (v) obj2;
                m mVar17 = (m) obj3;
                ((Integer) obj4).getClass();
                int i34 = PreviewCatalogActivity.f49781a;
                ((r1.l) obj).getClass();
                vVar.getClass();
                x1 x1Var14 = n.f135158a;
                w72.g.e eVar = (w72.g.e) w.a(vVar, s0.f105811a.b(w72.g.e.class));
                if (iVar6 == null || (listA = iVar6.a()) == null) {
                    listA = j0.f134944a;
                }
                for (Object obj22 : h0.C0(h0.C0(h0.C0(h0.C0(n72.k.f124900e, n72.k.f124897b), n72.k.f124898c), n72.k.f124899d), listA)) {
                    if (((n72.i) obj22).getF124912a() == eVar.f183528a) {
                        obj18 = obj22;
                        iVar = (n72.i) obj18;
                        if (iVar != null) {
                            mVar17.C(170212946);
                            m72.p.a(iVar, m0Var2, aVar13, mVar17, 0);
                            mVar17.f();
                        } else {
                            mVar17.C(170315122);
                            mVar17.f();
                            m0Var2.m();
                        }
                        x1 x1Var15 = n.f135158a;
                        return Unit.INSTANCE;
                    }
                }
                iVar = (n72.i) obj18;
                if (iVar != null) {
                    mVar17.C(170212946);
                    m72.p.a(iVar, m0Var2, aVar13, mVar17, 0);
                    mVar17.f();
                } else {
                    mVar17.C(170315122);
                    mVar17.f();
                    m0Var2.m();
                }
                x1 x1Var16 = n.f135158a;
                return Unit.INSTANCE;
            case 15:
                GearActivity gearActivity = (GearActivity) obj21;
                Object obj23 = (mk0.e) obj20;
                GearActivity.w wVar = (GearActivity.w) obj19;
                v vVar2 = (v) obj2;
                m mVar18 = (m) obj3;
                ((Integer) obj4).getClass();
                GearActivity.a aVar14 = GearActivity.f35500b;
                ((r1.l) obj).getClass();
                vVar2.getClass();
                x1 x1Var17 = n.f135158a;
                gearActivity.ea("Gear_TrackedActivities", mVar18, 6);
                t0 t0Var = s0.f105811a;
                GearRoute.s sVar4 = (GearRoute.s) w.a(vVar2, t0Var.b(GearRoute.s.class));
                w0 w0Var = sVar4.f35684b;
                boolean zB4 = mVar18.B(w0Var);
                Object objQ20 = mVar18.q();
                if (zB4) {
                    obj5 = objQ20;
                    Object objE = i53.a.e(w0Var.f153291b.keySet());
                    mVar18.K(objE);
                    obj5 = objE;
                } else {
                    aVar.getClass();
                    if (objQ20 == m.a.f135155b) {
                        obj5 = objQ20;
                        Object objE2 = i53.a.e(w0Var.f153291b.keySet());
                        mVar18.K(objE2);
                        obj5 = objE2;
                    }
                }
                obj5 = objQ20;
                i53.c cVar2 = (i53.c) obj5;
                boolean zB5 = mVar18.B(cVar2);
                Object objQ21 = mVar18.q();
                if (zB5) {
                    x0Var = (am.x0) h0.d0(cVar2);
                    if (x0Var != null) {
                        objD = z0.d(x0Var, x0Var);
                    } else {
                        objD = am.x0.f4308n;
                    }
                    objQ21 = objD;
                    mVar18.K(objQ21);
                } else {
                    aVar.getClass();
                    if (objQ21 == m.a.f135155b) {
                        x0Var = (am.x0) h0.d0(cVar2);
                        if (x0Var != null) {
                            objD = z0.d(x0Var, x0Var);
                        } else {
                            objD = am.x0.f4308n;
                        }
                        objQ21 = objD;
                        mVar18.K(objQ21);
                    }
                }
                am.x0 x0Var2 = (am.x0) objQ21;
                boolean zR16 = mVar18.r(sVar4) | mVar18.k(x0Var2.ordinal()) | mVar18.B(cVar2);
                Object objQ22 = mVar18.q();
                if (zR16) {
                    obj6 = objQ22;
                    Object aVar15 = new kk1.a(sVar4, 28, x0Var2, cVar2);
                    mVar18.K(aVar15);
                    obj6 = aVar15;
                } else {
                    aVar.getClass();
                    if (objQ22 == m.a.f135155b) {
                        obj6 = objQ22;
                        Object aVar16 = new kk1.a(sVar4, 28, x0Var2, cVar2);
                        mVar18.K(aVar16);
                        obj6 = aVar16;
                    }
                }
                obj6 = objQ22;
                e23.a aVar17 = (e23.a) obj6;
                mVar18.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar18);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(d1.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar18, 0), aVar17);
                mVar18.R();
                d1 d1Var = (d1) u1VarResolveViewModel;
                boolean zR17 = mVar18.r(obj23) | mVar18.r(gearActivity);
                Object objQ23 = mVar18.q();
                if (zR17) {
                    obj7 = objQ23;
                    Object eVar2 = new ml0.e(24, obj23, gearActivity);
                    mVar18.K(eVar2);
                    obj7 = eVar2;
                } else {
                    aVar.getClass();
                    if (objQ23 == m.a.f135155b) {
                        obj7 = objQ23;
                        Object eVar3 = new ml0.e(24, obj23, gearActivity);
                        mVar18.K(eVar3);
                        obj7 = eVar3;
                    }
                }
                obj7 = objQ23;
                b1.b(w0Var, d1Var, (l) obj7, wVar, mVar18, 0);
                return Unit.INSTANCE;
            case 16:
                GearActivity gearActivity2 = (GearActivity) obj21;
                bv.d dVar4 = (bv.d) obj20;
                m0 m0Var3 = (m0) obj19;
                v vVar3 = (v) obj2;
                m mVar19 = (m) obj3;
                ((Integer) obj4).getClass();
                GearActivity.a aVar18 = GearActivity.f35500b;
                ((r1.l) obj).getClass();
                vVar3.getClass();
                x1 x1Var18 = n.f135158a;
                gearActivity2.ea("Gear_GearDetails", mVar19, 6);
                t0 t0Var2 = s0.f105811a;
                GearRoute.i iVar7 = (GearRoute.i) w.a(vVar3, t0Var2.b(GearRoute.i.class));
                boolean zR18 = mVar19.r(iVar7);
                Object objQ24 = mVar19.q();
                if (zR18) {
                    obj8 = objQ24;
                    Object iVar8 = new n82.i(iVar7, 7);
                    mVar19.K(iVar8);
                    obj8 = iVar8;
                } else {
                    aVar.getClass();
                    if (objQ24 == m.a.f135155b) {
                        obj8 = objQ24;
                        Object iVar9 = new n82.i(iVar7, 7);
                        mVar19.K(iVar9);
                        obj8 = iVar9;
                    }
                }
                obj8 = objQ24;
                e23.a aVar19 = (e23.a) obj8;
                mVar19.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar19);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var2.b(rk0.h0.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar19, 0), aVar19);
                mVar19.R();
                rk0.h0 h0Var = (rk0.h0) u1VarResolveViewModel2;
                p1 p1VarN = n23.j.n(vVar3, "EditGearScreen_Edited", null, mVar19);
                x xVar = (x) p1VarN.getF182175a();
                boolean zB6 = mVar19.B(p1VarN) | mVar19.r(h0Var) | mVar19.r(vVar3);
                Object objQ25 = mVar19.q();
                if (zB6) {
                    obj9 = objQ25;
                    Object nVar = new GearActivity.n(p1VarN, h0Var, vVar3, null);
                    mVar19.K(nVar);
                    obj9 = nVar;
                } else {
                    aVar.getClass();
                    if (objQ25 == m.a.f135155b) {
                        obj9 = objQ25;
                        Object nVar2 = new GearActivity.n(p1VarN, h0Var, vVar3, null);
                        mVar19.K(nVar2);
                        obj9 = nVar2;
                    }
                }
                obj9 = objQ25;
                l0.e((e23.p) obj9, xVar, mVar19);
                p1 p1VarN2 = n23.j.n(vVar3, "ManagePhotos_Edited", null, mVar19);
                Boolean bool = (Boolean) p1VarN2.getF182175a();
                boolean zB7 = mVar19.B(p1VarN2) | mVar19.r(h0Var) | mVar19.r(vVar3);
                Object objQ26 = mVar19.q();
                if (zB7) {
                    obj10 = objQ26;
                    Object oVar = new GearActivity.o(h0Var, vVar3, p1VarN2, null);
                    mVar19.K(oVar);
                    obj10 = oVar;
                } else {
                    aVar.getClass();
                    if (objQ26 == m.a.f135155b) {
                        obj10 = objQ26;
                        Object oVar2 = new GearActivity.o(h0Var, vVar3, p1VarN2, null);
                        mVar19.K(oVar2);
                        obj10 = oVar2;
                    }
                }
                obj10 = objQ26;
                l0.e((e23.p) obj10, bool, mVar19);
                p1 p1VarN3 = n23.j.n(vVar3, "MultiActivitySelectionScreen_Selected", null, mVar19);
                qk0.d dVar5 = (qk0.d) p1VarN3.getF182175a();
                boolean zB8 = mVar19.B(p1VarN3) | mVar19.r(h0Var) | mVar19.r(vVar3);
                Object objQ27 = mVar19.q();
                if (zB8) {
                    obj11 = objQ27;
                    Object pVar = new GearActivity.p(p1VarN3, h0Var, vVar3, null);
                    mVar19.K(pVar);
                    obj11 = pVar;
                } else {
                    aVar.getClass();
                    if (objQ27 == m.a.f135155b) {
                        obj11 = objQ27;
                        Object pVar2 = new GearActivity.p(p1VarN3, h0Var, vVar3, null);
                        mVar19.K(pVar2);
                        obj11 = pVar2;
                    }
                }
                obj11 = objQ27;
                l0.e((e23.p) obj11, dVar5, mVar19);
                boolean zR19 = mVar19.r(m0Var3) | mVar19.r(gearActivity2);
                Object objQ28 = mVar19.q();
                int i35 = 20;
                if (zR19) {
                    obj12 = objQ28;
                    Object eVar4 = new ml0.e(i35, m0Var3, gearActivity2);
                    mVar19.K(eVar4);
                    obj12 = eVar4;
                } else {
                    aVar.getClass();
                    if (objQ28 == m.a.f135155b) {
                        obj12 = objQ28;
                        Object eVar5 = new ml0.e(i35, m0Var3, gearActivity2);
                        mVar19.K(eVar5);
                        obj12 = eVar5;
                    }
                }
                obj12 = objQ28;
                l lVar13 = (l) obj12;
                boolean zR20 = mVar19.r(m0Var3);
                Object objQ29 = mVar19.q();
                if (zR20) {
                    obj13 = objQ29;
                    Object wVar2 = new ky0.w(m0Var3, 5);
                    mVar19.K(wVar2);
                    obj13 = wVar2;
                } else {
                    aVar.getClass();
                    if (objQ29 == m.a.f135155b) {
                        obj13 = objQ29;
                        Object wVar3 = new ky0.w(m0Var3, 5);
                        mVar19.K(wVar3);
                        obj13 = wVar3;
                    }
                }
                obj13 = objQ29;
                l lVar14 = (l) obj13;
                boolean zR21 = mVar19.r(m0Var3);
                Object objQ30 = mVar19.q();
                if (zR21) {
                    obj14 = objQ30;
                    Object wVar4 = new ky0.w(m0Var3, i19);
                    mVar19.K(wVar4);
                    obj14 = wVar4;
                } else {
                    aVar.getClass();
                    if (objQ30 == m.a.f135155b) {
                        obj14 = objQ30;
                        Object wVar5 = new ky0.w(m0Var3, i19);
                        mVar19.K(wVar5);
                        obj14 = wVar5;
                    }
                }
                obj14 = objQ30;
                l lVar15 = (l) obj14;
                boolean zR22 = mVar19.r(m0Var3);
                Object objQ31 = mVar19.q();
                if (zR22) {
                    obj15 = objQ31;
                    Object j0Var = new b21.j0(m0Var3, i35);
                    mVar19.K(j0Var);
                    obj15 = j0Var;
                } else {
                    aVar.getClass();
                    if (objQ31 == m.a.f135155b) {
                        obj15 = objQ31;
                        Object j0Var2 = new b21.j0(m0Var3, i35);
                        mVar19.K(j0Var2);
                        obj15 = j0Var2;
                    }
                }
                obj15 = objQ31;
                e23.p pVar3 = (e23.p) obj15;
                boolean zR23 = mVar19.r(m0Var3);
                Object objQ32 = mVar19.q();
                int i36 = 21;
                if (zR23) {
                    obj16 = objQ32;
                    Object j0Var3 = new b21.j0(m0Var3, i36);
                    mVar19.K(j0Var3);
                    obj16 = j0Var3;
                } else {
                    aVar.getClass();
                    if (objQ32 == m.a.f135155b) {
                        obj16 = objQ32;
                        Object j0Var4 = new b21.j0(m0Var3, i36);
                        mVar19.K(j0Var4);
                        obj16 = j0Var4;
                    }
                }
                obj16 = objQ32;
                e23.p pVar4 = (e23.p) obj16;
                boolean zR24 = mVar19.r(m0Var3) | mVar19.r(iVar7);
                Object objQ33 = mVar19.q();
                if (zR24) {
                    obj17 = objQ33;
                    Object eVar6 = new ml0.e(i36, m0Var3, iVar7);
                    mVar19.K(eVar6);
                    obj17 = eVar6;
                } else {
                    aVar.getClass();
                    if (objQ33 == m.a.f135155b) {
                        obj17 = objQ33;
                        Object eVar7 = new ml0.e(i36, m0Var3, iVar7);
                        mVar19.K(eVar7);
                        obj17 = eVar7;
                    }
                }
                obj17 = objQ33;
                rk0.d0.b(h0Var, dVar4, lVar13, lVar14, lVar15, pVar3, pVar4, (l) obj17, iVar7.f35645b, mVar19, 0);
                return Unit.INSTANCE;
            case 17:
                return a(obj, obj2, obj3, obj4);
            case 18:
                x3 x3Var = (x3) obj20;
                m mVar20 = (m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (v) obj2);
                x1 x1Var19 = n.f135158a;
                ((lw1.f) obj21).z4();
                g02.s0.a(null, ((lw1.a) x3Var.getF182175a()).f115075a, z3.f.c(-1716337626, new mw0.i(i15, x3Var, (m0) obj19), mVar20), mVar20, 384, 1);
                return Unit.INSTANCE;
            case 19:
                return b(obj, obj2, obj3, obj4);
            case 20:
                return c(obj, obj2, obj3, obj4);
            case 21:
                v vVar4 = (v) obj2;
                int iB = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar4);
                x1 x1Var20 = n.f135158a;
                ((ot1.a) obj21).a(vVar4, (m0) obj20, (fe) obj19, (m) obj3, (iB >> 3) & 14);
                return Unit.INSTANCE;
            case 22:
                return d(obj, obj2, obj3, obj4);
            case 23:
                return e(obj, obj2, obj3, obj4);
            case 24:
                return f(obj, obj2, obj3, obj4);
            case 25:
                return g(obj, obj2, obj3, obj4);
            case 26:
                return h(obj, obj2, obj3, obj4);
            case 27:
                return i(obj, obj2, obj3, obj4);
            case 28:
                return j(obj, obj2, obj3, obj4);
            default:
                fg0.k kVar = (fg0.k) obj21;
                RaceTimePredictionActivity raceTimePredictionActivity = (RaceTimePredictionActivity) obj20;
                m0 m0Var4 = (m0) obj19;
                m mVar21 = (m) obj3;
                ((Integer) obj4).getClass();
                RaceTimePredictionActivity.a aVar20 = RaceTimePredictionActivity.f41078b;
                ((r1.l) obj).getClass();
                ((v) obj2).getClass();
                x1 x1Var21 = n.f135158a;
                if (kVar != null) {
                    mVar21.C(17922275);
                    uc1.f fVar12 = (uc1.f) raceTimePredictionActivity.f41079a.getValue();
                    boolean zR25 = mVar21.r(raceTimePredictionActivity) | mVar21.r(kVar);
                    Object objQ34 = mVar21.q();
                    if (zR25) {
                        objQ34 = new tb0.d(27, raceTimePredictionActivity, kVar);
                        mVar21.K(objQ34);
                    } else {
                        aVar.getClass();
                        if (objQ34 == m.a.f135155b) {
                            objQ34 = new tb0.d(27, raceTimePredictionActivity, kVar);
                            mVar21.K(objQ34);
                        }
                    }
                    e23.a aVar21 = (e23.a) objQ34;
                    boolean zR26 = mVar21.r(raceTimePredictionActivity);
                    Object objQ35 = mVar21.q();
                    if (zR26) {
                        objQ35 = new f1(raceTimePredictionActivity, 10);
                        mVar21.K(objQ35);
                    } else {
                        aVar.getClass();
                        if (objQ35 == m.a.f135155b) {
                            objQ35 = new f1(raceTimePredictionActivity, 10);
                            mVar21.K(objQ35);
                        }
                    }
                    com.garmin.android.apps.connectmobile.race_time_prediction.presentation.b.a(fVar12, kVar, m0Var4, aVar21, (e23.a) objQ35, mVar21, fg0.k.X << 3);
                    mVar21.f();
                } else {
                    mVar21.C(18327538);
                    mVar21.f();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(Object obj, int i14, Object obj2, Object obj3) {
        this.f92331a = i14;
        this.f92332b = obj;
        this.f92333c = obj2;
        this.f92334d = obj3;
    }
}
