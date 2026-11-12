package g80;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import androidx.lifecycle.w1;
import androidx.room.a0;
import aq1.d0;
import b63.q;
import c.w;
import c2.l2;
import c2.x2;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.developer.HelpRegistryActivity;
import com.garmin.android.apps.connectmobile.follow.domain.FollowRequestActivity;
import com.garmin.android.apps.connectmobile.follow.domain.FriendListActivity;
import com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsActivity;
import com.google.mlkit.common.MlKitException;
import e2.i0;
import e23.p;
import et1.v;
import gl1.y;
import gt1.o;
import gw0.g0;
import h2.f0;
import h21.t;
import h4.r;
import ho0.j;
import i3.h1;
import i3.i7;
import ii0.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l72.u0;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;
import p003ji0.k;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import r53.p2;
import ro0.l;
import v62.e1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f76248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f76249c;

    public /* synthetic */ e(int i14, Object obj, Object obj2) {
        this.f76247a = i14;
        this.f76248b = obj;
        this.f76249c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0295  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:115:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:120:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:135:0x0343  */
    /* JADX WARN: Code duplicated, block: B:140:0x036d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0397  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:170:0x0437  */
    /* JADX WARN: Code duplicated, block: B:212:0x0527  */
    /* JADX WARN: Code duplicated, block: B:213:0x055c  */
    /* JADX WARN: Code duplicated, block: B:229:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:234:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:239:0x0624  */
    /* JADX WARN: Code duplicated, block: B:260:0x0704  */
    /* JADX WARN: Code duplicated, block: B:286:0x07da  */
    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:360:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:366:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:380:0x0a52  */
    /* JADX WARN: Code duplicated, block: B:47:0x0124  */
    /* JADX WARN: Code duplicated, block: B:62:0x017b  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        ArrayList arrayList;
        String str;
        zf2.i iVar;
        Object value;
        int i14 = this.f76247a;
        m.a aVar = m.f135153a;
        final int i15 = 3;
        boolean z14 = false;
        final int i16 = 2;
        final int i17 = 1;
        Object obj3 = this.f76249c;
        Object obj4 = this.f76248b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int i18 = HelpRegistryActivity.f33616a;
                ((HelpRegistryActivity) obj4).da((l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                FollowRequestActivity followRequestActivity = (FollowRequestActivity) obj4;
                String str2 = (String) obj3;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                FollowRequestActivity.a aVar2 = FollowRequestActivity.f35245b;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    mi0.a aVar3 = (mi0.a) followRequestActivity.f35246a.getValue();
                    boolean zR = mVar.r(followRequestActivity);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new FollowRequestActivity.b(followRequestActivity);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new FollowRequestActivity.b(followRequestActivity);
                            mVar.K(objQ);
                        }
                    }
                    ii0.i.a(aVar3, str2, (e23.a) ((k23.g) objQ), mVar, mi0.a.f118681h);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                FriendListActivity friendListActivity = (FriendListActivity) obj4;
                k kVar = (k) obj3;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                FriendListActivity.a aVar4 = FriendListActivity.f35257b;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    if (s3.b()) {
                        mVar2.C(1597733672);
                        String userFullName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName();
                        boolean zR2 = mVar2.r(friendListActivity);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            objQ2 = new FriendListActivity.b(friendListActivity);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new FriendListActivity.b(friendListActivity);
                                mVar2.K(objQ2);
                            }
                        }
                        gg.b.c(0, (e23.a) objQ2, userFullName, mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(1597945092);
                        mi0.f fVar = (mi0.f) friendListActivity.f35258a.getValue();
                        boolean zR3 = mVar2.r(friendListActivity);
                        Object objQ3 = mVar2.q();
                        if (zR3) {
                            objQ3 = new FriendListActivity.c(friendListActivity);
                            mVar2.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new FriendListActivity.c(friendListActivity);
                                mVar2.K(objQ3);
                            }
                        }
                        u.a(fVar, kVar, (e23.a) objQ3, mVar2, mi0.f.f118765t);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                o.a((r) obj4, (us1.h) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                us1.k kVar2 = (us1.k) obj4;
                us1.k kVar3 = (us1.k) obj3;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    if (kVar2 == kVar3) {
                        mVar3.C(-228127942);
                        i7.a(n5.c.a(R.drawable.ic_check, mVar3, 0), y.Q(mVar3, R.string.lbl_selected), null, fb1.c.g(d92.b.f58623a, mVar3), mVar3, 0, 4);
                        mVar3.f();
                    } else {
                        mVar3.C(-227828110);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                p1 p1Var = (p1) obj4;
                us1.k kVar4 = (us1.k) obj3;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    g6.f.a aVar5 = g6.f.f75994b;
                    l2 l2VarA = c2.l.a(0);
                    Object objQ4 = mVar4.q();
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new gp.e(p1Var, i16);
                        mVar4.K(objQ4);
                    }
                    h1.c((e23.a) objQ4, null, false, null, null, null, l2VarA, null, z3.f.c(-674151053, new v(kVar4, 16), mVar4), mVar4, 817889286, 382);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                gw0.u uVar = (gw0.u) obj4;
                b63.o oVar = (b63.o) obj3;
                pv0.h hVar = (pv0.h) obj;
                pv0.y yVar = (pv0.y) obj2;
                hVar.getClass();
                uVar.getClass();
                oVar.getClass();
                List<pv0.o> list = hVar.f141378e;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj5 : list) {
                        if (!s.g(((pv0.o) obj5).f141395a, yVar != null ? Integer.valueOf(yVar.getF141473a()) : null)) {
                            arrayList.add(obj5);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    str = hVar.f141379f;
                } else {
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((pv0.o) it.next()).f141397c != null) {
                                    str = hVar.f141379f;
                                }
                            }
                        }
                    }
                    str = pv0.s.NO.f141418a;
                }
                ge1.b.T(v1.a(uVar), null, null, new gw0.v(pv0.h.a(hVar, arrayList, str, null, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD), uVar, oVar, null), 3);
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                g0.a((Double) obj4, (pv0.r) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                com.garmin.android.apps.connectmobile.training.fbtap.workouts.a aVar6 = (com.garmin.android.apps.connectmobile.training.fbtap.workouts.a) obj4;
                pi0.e eVar = (pi0.e) obj3;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.training.fbtap.workouts.a.C0878a c0878a = com.garmin.android.apps.connectmobile.training.fbtap.workouts.a.f45566c;
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    tx1.a aVar7 = new tx1.a();
                    boolean zR4 = mVar5.r(aVar6);
                    Object objQ5 = mVar5.q();
                    if (zR4) {
                        objQ5 = new g12.f(aVar6, 23);
                        mVar5.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == m.a.f135155b) {
                            objQ5 = new g12.f(aVar6, 23);
                            mVar5.K(objQ5);
                        }
                    }
                    z02.b.a(false, null, null, null, false, z3.f.c(-1247709688, new gw1.c(aVar6, z14 ? 1 : 0, eVar, w.c(aVar7, (e23.l) objQ5, mVar5, 0)), mVar5), mVar5, 196608, 31);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 9:
                o0 o0Var = (o0) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                o0Var.f105806a += ((f0) obj3).f80900a.f(fFloatValue - o0Var.f105806a);
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                t.c((i21.c) obj4, (i21.d) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                p pVar = (p) obj4;
                b63.v vVar = (b63.v) obj;
                g21.o oVar2 = (g21.o) obj2;
                vVar.getClass();
                pVar.invoke(q.a(((o82.a) obj3).f130843a, vVar), oVar2 != null ? lg.d.L(oVar2) : null);
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                h50.h.a((i50.e) obj4, (r) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                e23.l lVar = (e23.l) obj4;
                o51.c cVar = (o51.c) obj3;
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    t4.d dVarA = n5.c.a(R.drawable.ic_send_to_watch, mVar6, 0);
                    String strQ = y.Q(mVar6, R.string.lbl_send_to_device);
                    long jG = fb1.c.g(d92.b.f58623a, mVar6);
                    r.a aVar8 = r.S;
                    boolean zB = mVar6.B(lVar) | mVar6.r(cVar);
                    Object objQ6 = mVar6.q();
                    if (zB) {
                        objQ6 = new h51.e(lVar, cVar, 2);
                        mVar6.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new h51.e(lVar, cVar, 2);
                            mVar6.K(objQ6);
                        }
                    }
                    i7.a(dVarA, strQ, u1.w.d(aVar8, false, null, null, (e23.a) objQ6, 15), jG, mVar6, 0, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                h60.g.a((h60.h) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                h62.m mVar7 = (h62.m) obj4;
                m52.k kVar5 = (m52.k) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                kVar5.getClass();
                mVar7.getClass();
                ge1.b.T(v1.a(mVar7), null, null, new h62.q(zBooleanValue, mVar7, kVar5, null), 3);
                ((zc.d) obj3).e();
                return Unit.INSTANCE;
            case 16:
                Scope scope = (Scope) obj;
                h71.a aVar9 = h71.a.f82332a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var = s0.f105811a;
                return new i71.t((i71.r) scope.get((k23.d<?>) t0Var.b(i71.r.class), (StringQualifier) obj3, (e23.a<? extends ParametersHolder>) null), (i71.r) scope.get((k23.d<?>) t0Var.b(i71.r.class), (StringQualifier) obj4, (e23.a<? extends ParametersHolder>) null));
            case 17:
                h82.r rVar = (h82.r) obj4;
                final h81.h hVar2 = (h81.h) obj3;
                m mVar8 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i19 = h81.h.f82423h;
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    boolean zR5 = mVar8.r(hVar2);
                    Object objQ7 = mVar8.q();
                    if (zR5) {
                        objQ7 = new e23.a() { // from class: h81.f
                            @Override // e23.a
                            public final Object invoke() {
                                int i24 = i16;
                                h hVar3 = hVar2;
                                switch (i24) {
                                    case 0:
                                        int i25 = h.f82423h;
                                        hVar3.e("stamina_action");
                                        break;
                                    case 1:
                                        int i26 = h.f82423h;
                                        hVar3.e("stamina_zones_action");
                                        break;
                                    default:
                                        int i27 = h.f82423h;
                                        hVar3.e("endurance_score_action");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar8.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new e23.a() { // from class: h81.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i24 = i16;
                                    h hVar3 = hVar2;
                                    switch (i24) {
                                        case 0:
                                            int i25 = h.f82423h;
                                            hVar3.e("stamina_action");
                                            break;
                                        case 1:
                                            int i26 = h.f82423h;
                                            hVar3.e("stamina_zones_action");
                                            break;
                                        default:
                                            int i27 = h.f82423h;
                                            hVar3.e("endurance_score_action");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar8.K(objQ7);
                        }
                    }
                    rVar.B(R.string.lbl_endurance_score, null, false, (e23.a) objQ7, mVar8, 0, 6);
                    boolean zR6 = mVar8.r(hVar2);
                    Object objQ8 = mVar8.q();
                    if (zR6) {
                        final int i24 = z14 ? 1 : 0;
                        objQ8 = new e23.a() { // from class: h81.f
                            @Override // e23.a
                            public final Object invoke() {
                                int i25 = i24;
                                h hVar3 = hVar2;
                                switch (i25) {
                                    case 0:
                                        int i26 = h.f82423h;
                                        hVar3.e("stamina_action");
                                        break;
                                    case 1:
                                        int i27 = h.f82423h;
                                        hVar3.e("stamina_zones_action");
                                        break;
                                    default:
                                        int i28 = h.f82423h;
                                        hVar3.e("endurance_score_action");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar8.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == m.a.f135155b) {
                            final int i25 = z14 ? 1 : 0;
                            objQ8 = new e23.a() { // from class: h81.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i26 = i25;
                                    h hVar3 = hVar2;
                                    switch (i26) {
                                        case 0:
                                            int i27 = h.f82423h;
                                            hVar3.e("stamina_action");
                                            break;
                                        case 1:
                                            int i28 = h.f82423h;
                                            hVar3.e("stamina_zones_action");
                                            break;
                                        default:
                                            int i29 = h.f82423h;
                                            hVar3.e("endurance_score_action");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar8.K(objQ8);
                        }
                    }
                    rVar.B(R.string.lbl_stamina, null, false, (e23.a) objQ8, mVar8, 0, 6);
                    boolean zR7 = mVar8.r(hVar2);
                    Object objQ9 = mVar8.q();
                    if (zR7) {
                        objQ9 = new e23.a() { // from class: h81.f
                            @Override // e23.a
                            public final Object invoke() {
                                int i26 = i17;
                                h hVar3 = hVar2;
                                switch (i26) {
                                    case 0:
                                        int i27 = h.f82423h;
                                        hVar3.e("stamina_action");
                                        break;
                                    case 1:
                                        int i28 = h.f82423h;
                                        hVar3.e("stamina_zones_action");
                                        break;
                                    default:
                                        int i29 = h.f82423h;
                                        hVar3.e("endurance_score_action");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar8.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == m.a.f135155b) {
                            objQ9 = new e23.a() { // from class: h81.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i26 = i17;
                                    h hVar3 = hVar2;
                                    switch (i26) {
                                        case 0:
                                            int i27 = h.f82423h;
                                            hVar3.e("stamina_action");
                                            break;
                                        case 1:
                                            int i28 = h.f82423h;
                                            hVar3.e("stamina_zones_action");
                                            break;
                                        default:
                                            int i29 = h.f82423h;
                                            hVar3.e("endurance_score_action");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar8.K(objQ9);
                        }
                    }
                    rVar.B(R.string.lbl_stamina_zones, null, false, (e23.a) objQ9, mVar8, 0, 6);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ha0.f.c((Map) obj4, (e23.l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                p1 p1Var2 = (p1) obj4;
                rf2.h hVar3 = (rf2.h) obj3;
                m mVar9 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar9.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    o13.p pVar2 = (o13.p) p1Var2.getF182175a();
                    if (pVar2 == null || (iVar = (zf2.i) pVar2.f128594a) == null) {
                        mVar9.C(-482213015);
                        r.a aVar10 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(x2.q(aVar10, j92.b.f97901d.f97904c), mVar9);
                        mVar9.f();
                    } else {
                        Integer num = hVar3.f152481b;
                        if (num == null) {
                            if (iVar instanceof zf2.i.c) {
                                int i26 = ((zf2.i.c) iVar).f204654a;
                                Integer num2 = hVar3.f152480a;
                                if (num2 != null && i26 == num2.intValue()) {
                                    mVar9.C(-482664933);
                                    s62.a.f157643a.getClass();
                                    u4.d dVarA2 = e1.a(t62.b.f162798a);
                                    r.a aVar11 = r.S;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    i7.b(dVarA2, null, x2.q(aVar11, j92.b.f97901d.f97904c), a0.c(mVar9), mVar9, 48, 0);
                                    mVar9.f();
                                }
                            }
                            mVar9.C(-482213015);
                            r.a aVar12 = r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            c2.l.f(x2.q(aVar12, j92.b.f97901d.f97904c), mVar9);
                            mVar9.f();
                        } else if ((iVar instanceof zf2.i.b) && ((zf2.i.b) iVar).f204653a == num.intValue()) {
                            mVar9.C(-482664933);
                            s62.a.f157643a.getClass();
                            u4.d dVarA3 = e1.a(t62.b.f162798a);
                            r.a aVar13 = r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            i7.b(dVarA3, null, x2.q(aVar13, j92.b.f97901d.f97904c), a0.c(mVar9), mVar9, 48, 0);
                            mVar9.f();
                        } else {
                            mVar9.C(-482213015);
                            r.a aVar14 = r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            c2.l.f(x2.q(aVar14, j92.b.f97901d.f97904c), mVar9);
                            mVar9.f();
                        }
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 20:
                i53.c cVar2 = (i53.c) obj4;
                ho.b bVar = (ho.b) obj3;
                m mVar10 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar10.n(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    if (cVar2.contains(bVar)) {
                        mVar10.C(633490035);
                        s62.a.f157643a.getClass();
                        u4.d dVarA4 = e1.a(t62.b.f162798a);
                        long jG2 = fb1.c.g(d92.b.f58623a, mVar10);
                        r.a aVar15 = r.S;
                        d92.b.f58625c.getClass();
                        i7.b(dVarA4, null, x2.q(aVar15, j92.b.f97901d.f97905d), jG2, mVar10, 48, 0);
                        mVar10.f();
                    } else {
                        mVar10.C(633832120);
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 21:
                ((p) obj4).invoke(new jo.c.a.b((eo.d) obj, (eo.d) obj2), null);
                return Unit.INSTANCE;
            case 22:
                e23.a aVar16 = (e23.a) obj4;
                ho.a0 a0Var = (ho.a0) obj3;
                m mVar11 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar11.n(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    boolean zB2 = mVar11.B(aVar16) | mVar11.r(a0Var);
                    Object objQ10 = mVar11.q();
                    if (zB2) {
                        objQ10 = new ho.u(aVar16, a0Var, z14 ? 1 : 0);
                        mVar11.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == m.a.f135155b) {
                            objQ10 = new ho.u(aVar16, a0Var, z14 ? 1 : 0);
                            mVar11.K(objQ10);
                        }
                    }
                    u0.a(null, null, null, null, (e23.a) objQ10, mVar11, 0, 15);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 23:
                h82.r rVar2 = (h82.r) obj4;
                final ho0.h hVar4 = (ho0.h) obj3;
                m mVar12 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i27 = ho0.h.f84713l;
                if (mVar12.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    String strQ2 = y.Q(mVar12, R.string.lbl_about_your_reading);
                    boolean zR8 = mVar12.r(hVar4);
                    Object objQ11 = mVar12.q();
                    if (zR8) {
                        final int i28 = z14 ? 1 : 0;
                        objQ11 = new e23.a() { // from class: ho0.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i29 = i28;
                                h hVar5 = hVar4;
                                switch (i29) {
                                    case 0:
                                        int i30 = h.f84713l;
                                        hVar5.e("ABOUT_YOUR_READING_ACTION");
                                        break;
                                    case 1:
                                        int i34 = h.f84713l;
                                        hVar5.e("HOW_WE_MEASURE_HR_ACTION");
                                        break;
                                    case 2:
                                        int i35 = h.f84713l;
                                        hVar5.e("HOW_TO_USE_YOUR_READING_ACTION");
                                        break;
                                    default:
                                        int i36 = h.f84713l;
                                        hVar5.e("ABNORMAL_HR_ALERT_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == m.a.f135155b) {
                            final int i29 = z14 ? 1 : 0;
                            objQ11 = new e23.a() { // from class: ho0.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = i29;
                                    h hVar5 = hVar4;
                                    switch (i210) {
                                        case 0:
                                            int i30 = h.f84713l;
                                            hVar5.e("ABOUT_YOUR_READING_ACTION");
                                            break;
                                        case 1:
                                            int i34 = h.f84713l;
                                            hVar5.e("HOW_WE_MEASURE_HR_ACTION");
                                            break;
                                        case 2:
                                            int i35 = h.f84713l;
                                            hVar5.e("HOW_TO_USE_YOUR_READING_ACTION");
                                            break;
                                        default:
                                            int i36 = h.f84713l;
                                            hVar5.e("ABNORMAL_HR_ALERT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar12.K(objQ11);
                        }
                    }
                    rVar2.C(strQ2, null, false, (e23.a) objQ11, mVar12, 0, 6);
                    String strQ3 = y.Q(mVar12, R.string.lbl_how_we_measure_heart_rate);
                    boolean zR9 = mVar12.r(hVar4);
                    Object objQ12 = mVar12.q();
                    if (zR9) {
                        objQ12 = new e23.a() { // from class: ho0.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i210 = i17;
                                h hVar5 = hVar4;
                                switch (i210) {
                                    case 0:
                                        int i30 = h.f84713l;
                                        hVar5.e("ABOUT_YOUR_READING_ACTION");
                                        break;
                                    case 1:
                                        int i34 = h.f84713l;
                                        hVar5.e("HOW_WE_MEASURE_HR_ACTION");
                                        break;
                                    case 2:
                                        int i35 = h.f84713l;
                                        hVar5.e("HOW_TO_USE_YOUR_READING_ACTION");
                                        break;
                                    default:
                                        int i36 = h.f84713l;
                                        hVar5.e("ABNORMAL_HR_ALERT_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == m.a.f135155b) {
                            objQ12 = new e23.a() { // from class: ho0.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = i17;
                                    h hVar5 = hVar4;
                                    switch (i210) {
                                        case 0:
                                            int i30 = h.f84713l;
                                            hVar5.e("ABOUT_YOUR_READING_ACTION");
                                            break;
                                        case 1:
                                            int i34 = h.f84713l;
                                            hVar5.e("HOW_WE_MEASURE_HR_ACTION");
                                            break;
                                        case 2:
                                            int i35 = h.f84713l;
                                            hVar5.e("HOW_TO_USE_YOUR_READING_ACTION");
                                            break;
                                        default:
                                            int i36 = h.f84713l;
                                            hVar5.e("ABNORMAL_HR_ALERT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar12.K(objQ12);
                        }
                    }
                    rVar2.C(strQ3, null, false, (e23.a) objQ12, mVar12, 0, 6);
                    String strQ4 = y.Q(mVar12, R.string.lbl_how_to_use_reading);
                    boolean zR10 = mVar12.r(hVar4);
                    Object objQ13 = mVar12.q();
                    if (zR10) {
                        objQ13 = new e23.a() { // from class: ho0.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i210 = i16;
                                h hVar5 = hVar4;
                                switch (i210) {
                                    case 0:
                                        int i30 = h.f84713l;
                                        hVar5.e("ABOUT_YOUR_READING_ACTION");
                                        break;
                                    case 1:
                                        int i34 = h.f84713l;
                                        hVar5.e("HOW_WE_MEASURE_HR_ACTION");
                                        break;
                                    case 2:
                                        int i35 = h.f84713l;
                                        hVar5.e("HOW_TO_USE_YOUR_READING_ACTION");
                                        break;
                                    default:
                                        int i36 = h.f84713l;
                                        hVar5.e("ABNORMAL_HR_ALERT_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == m.a.f135155b) {
                            objQ13 = new e23.a() { // from class: ho0.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = i16;
                                    h hVar5 = hVar4;
                                    switch (i210) {
                                        case 0:
                                            int i30 = h.f84713l;
                                            hVar5.e("ABOUT_YOUR_READING_ACTION");
                                            break;
                                        case 1:
                                            int i34 = h.f84713l;
                                            hVar5.e("HOW_WE_MEASURE_HR_ACTION");
                                            break;
                                        case 2:
                                            int i35 = h.f84713l;
                                            hVar5.e("HOW_TO_USE_YOUR_READING_ACTION");
                                            break;
                                        default:
                                            int i36 = h.f84713l;
                                            hVar5.e("ABNORMAL_HR_ALERT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar12.K(objQ13);
                        }
                    }
                    rVar2.C(strQ4, null, false, (e23.a) objQ13, mVar12, 0, 6);
                    yb0.a aVar17 = hVar4.f84714f;
                    if (aVar17 == null || aVar17.f195679b.h() <= 0) {
                        mVar12.C(1296493482);
                        mVar12.f();
                    } else {
                        mVar12.C(1296340683);
                        String strQ5 = y.Q(mVar12, R.string.device_settings_abnormal_heart_rate);
                        boolean zR11 = mVar12.r(hVar4);
                        Object objQ14 = mVar12.q();
                        if (zR11) {
                            objQ14 = new e23.a() { // from class: ho0.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = i15;
                                    h hVar5 = hVar4;
                                    switch (i210) {
                                        case 0:
                                            int i30 = h.f84713l;
                                            hVar5.e("ABOUT_YOUR_READING_ACTION");
                                            break;
                                        case 1:
                                            int i34 = h.f84713l;
                                            hVar5.e("HOW_WE_MEASURE_HR_ACTION");
                                            break;
                                        case 2:
                                            int i35 = h.f84713l;
                                            hVar5.e("HOW_TO_USE_YOUR_READING_ACTION");
                                            break;
                                        default:
                                            int i36 = h.f84713l;
                                            hVar5.e("ABNORMAL_HR_ALERT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar12.K(objQ14);
                        } else {
                            aVar.getClass();
                            if (objQ14 == m.a.f135155b) {
                                objQ14 = new e23.a() { // from class: ho0.e
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i210 = i15;
                                        h hVar5 = hVar4;
                                        switch (i210) {
                                            case 0:
                                                int i30 = h.f84713l;
                                                hVar5.e("ABOUT_YOUR_READING_ACTION");
                                                break;
                                            case 1:
                                                int i34 = h.f84713l;
                                                hVar5.e("HOW_WE_MEASURE_HR_ACTION");
                                                break;
                                            case 2:
                                                int i35 = h.f84713l;
                                                hVar5.e("HOW_TO_USE_YOUR_READING_ACTION");
                                                break;
                                            default:
                                                int i36 = h.f84713l;
                                                hVar5.e("ABNORMAL_HR_ALERT_ACTION");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar12.K(objQ14);
                            }
                        }
                        rVar2.C(strQ5, null, false, (e23.a) objQ14, mVar12, 0, 6);
                        mVar12.f();
                    }
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 24:
                HeartRateReportsActivity heartRateReportsActivity = (HeartRateReportsActivity) obj4;
                w1 w1Var = heartRateReportsActivity.f36642a;
                j jVar = (j) obj3;
                m mVar13 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i30 = HeartRateReportsActivity.f36641d;
                if (mVar13.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    p1 p1VarC = s9.c.c(((qo0.a) w1Var.getValue()).f145921f, mVar13);
                    heartRateReportsActivity.setRequestedOrientation((((qo0.d) p1VarC.getF182175a()).f145952f == o82.g.f130850c && ((qo0.d) p1VarC.getF182175a()).f145954h) ? -1 : 5);
                    boolean z15 = ((Configuration) mVar13.A(AndroidCompositionLocals_androidKt.f6041a)).orientation == 1;
                    p2 p2Var = ((qo0.a) w1Var.getValue()).f145920e;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, qo0.d.a((qo0.d) value, false, false, false, z15, null, null, null, false, 247)));
                    qo0.a aVar18 = (qo0.a) w1Var.getValue();
                    yb0.a aVar19 = (yb0.a) heartRateReportsActivity.f36643b.getValue();
                    boolean zR12 = mVar13.r(heartRateReportsActivity);
                    Object objQ15 = mVar13.q();
                    if (zR12) {
                        objQ15 = new j(heartRateReportsActivity, i16);
                        mVar13.K(objQ15);
                    } else {
                        aVar.getClass();
                        if (objQ15 == m.a.f135155b) {
                            objQ15 = new j(heartRateReportsActivity, i16);
                            mVar13.K(objQ15);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ15;
                    boolean zR13 = mVar13.r(heartRateReportsActivity);
                    Object objQ16 = mVar13.q();
                    if (zR13) {
                        objQ16 = new ho0.i(heartRateReportsActivity, i17);
                        mVar13.K(objQ16);
                    } else {
                        aVar.getClass();
                        if (objQ16 == m.a.f135155b) {
                            objQ16 = new ho0.i(heartRateReportsActivity, i17);
                            mVar13.K(objQ16);
                        }
                    }
                    e23.a aVar20 = (e23.a) objQ16;
                    boolean zR14 = mVar13.r(heartRateReportsActivity);
                    Object objQ17 = mVar13.q();
                    if (zR14) {
                        objQ17 = new ho0.i(heartRateReportsActivity, i16);
                        mVar13.K(objQ17);
                    } else {
                        aVar.getClass();
                        if (objQ17 == m.a.f135155b) {
                            objQ17 = new ho0.i(heartRateReportsActivity, i16);
                            mVar13.K(objQ17);
                        }
                    }
                    e23.a aVar21 = (e23.a) objQ17;
                    boolean zB3 = mVar13.B(jVar);
                    Object objQ18 = mVar13.q();
                    if (zB3) {
                        objQ18 = new ho0.g(jVar, i17);
                        mVar13.K(objQ18);
                    } else {
                        aVar.getClass();
                        if (objQ18 == m.a.f135155b) {
                            objQ18 = new ho0.g(jVar, i17);
                            mVar13.K(objQ18);
                        }
                    }
                    ho0.m.a(aVar18, aVar19, lVar2, aVar20, aVar21, (e23.l) objQ18, mVar13, 64);
                    x1 x1Var13 = n.f135158a;
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 25:
                zc.d dVar = (zc.d) obj4;
                fo1.o0 o0Var2 = (fo1.o0) obj3;
                m mVar14 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar14.n(1 & iIntValue13, (iIntValue13 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    li0.p0.d(dVar, o0Var2.X, null, R.string.txt_empty_page_no_data, null, mVar14, 24968);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 26:
                h82.r rVar3 = (h82.r) obj4;
                final hp1.e eVar2 = (hp1.e) obj3;
                m mVar15 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                int i34 = hp1.e.f84947f;
                if (mVar15.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    boolean zR15 = mVar15.r(eVar2);
                    Object objQ19 = mVar15.q();
                    if (zR15) {
                        objQ19 = new e23.a() { // from class: hp1.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i35 = i17;
                                e eVar3 = eVar2;
                                switch (i35) {
                                    case 0:
                                        int i36 = e.f84947f;
                                        eVar3.e("MAXIMIZING_SOLAR_CHARGE_ACTION");
                                        break;
                                    default:
                                        int i37 = e.f84947f;
                                        eVar3.e("SOLAR_CHARGE_OVERVIEW_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar15.K(objQ19);
                    } else {
                        aVar.getClass();
                        if (objQ19 == m.a.f135155b) {
                            objQ19 = new e23.a() { // from class: hp1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i35 = i17;
                                    e eVar3 = eVar2;
                                    switch (i35) {
                                        case 0:
                                            int i36 = e.f84947f;
                                            eVar3.e("MAXIMIZING_SOLAR_CHARGE_ACTION");
                                            break;
                                        default:
                                            int i37 = e.f84947f;
                                            eVar3.e("SOLAR_CHARGE_OVERVIEW_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar15.K(objQ19);
                        }
                    }
                    rVar3.B(R.string.edge_solar_charge_overview_lbl, null, false, (e23.a) objQ19, mVar15, 0, 6);
                    boolean zR16 = mVar15.r(eVar2);
                    Object objQ20 = mVar15.q();
                    if (zR16) {
                        final int i35 = z14 ? 1 : 0;
                        objQ20 = new e23.a() { // from class: hp1.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i36 = i35;
                                e eVar3 = eVar2;
                                switch (i36) {
                                    case 0:
                                        int i37 = e.f84947f;
                                        eVar3.e("MAXIMIZING_SOLAR_CHARGE_ACTION");
                                        break;
                                    default:
                                        int i38 = e.f84947f;
                                        eVar3.e("SOLAR_CHARGE_OVERVIEW_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar15.K(objQ20);
                    } else {
                        aVar.getClass();
                        if (objQ20 == m.a.f135155b) {
                            final int i36 = z14 ? 1 : 0;
                            objQ20 = new e23.a() { // from class: hp1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i37 = i36;
                                    e eVar3 = eVar2;
                                    switch (i37) {
                                        case 0:
                                            int i38 = e.f84947f;
                                            eVar3.e("MAXIMIZING_SOLAR_CHARGE_ACTION");
                                            break;
                                        default:
                                            int i39 = e.f84947f;
                                            eVar3.e("SOLAR_CHARGE_OVERVIEW_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar15.K(objQ20);
                        }
                    }
                    rVar3.B(R.string.maximizing_edge_solar_charge_lbl, null, false, (e23.a) objQ20, mVar15, 0, 6);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 27:
                i0 i0Var = (i0) obj4;
                List list2 = (List) obj3;
                m mVar16 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    boolean zR17 = mVar16.r(list2);
                    Object objQ21 = mVar16.q();
                    if (zR17) {
                        objQ21 = new d0(list2, 10);
                        mVar16.K(objQ21);
                    } else {
                        aVar.getClass();
                        if (objQ21 == m.a.f135155b) {
                            objQ21 = new d0(list2, 10);
                            mVar16.K(objQ21);
                        }
                    }
                    e2.c.b(null, i0Var, null, null, null, null, false, null, (e23.l) objQ21, mVar16, 0, 509);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 28:
                final ht0.e eVar3 = (ht0.e) obj4;
                h82.r rVar4 = (h82.r) obj3;
                m mVar17 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                int i37 = ht0.e.f85518g;
                if (mVar17.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                    if (Double.isNaN(eVar3.f85519f.f179717b) && Double.isNaN(eVar3.f85519f.f179718c)) {
                        mVar17.C(439266280);
                        mVar17.f();
                    } else {
                        mVar17.C(439141350);
                        boolean zR18 = mVar17.r(eVar3);
                        Object objQ22 = mVar17.q();
                        if (zR18) {
                            final int i38 = z14 ? 1 : 0;
                            objQ22 = new e23.a() { // from class: ht0.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i39 = i38;
                                    e eVar4 = eVar3;
                                    switch (i39) {
                                        case 0:
                                            int i44 = e.f85518g;
                                            eVar4.e("READINGS_ACTION");
                                            break;
                                        case 1:
                                            int i45 = e.f85518g;
                                            eVar4.e("WHAT_IS_LT_ACTION");
                                            break;
                                        default:
                                            int i46 = e.f85518g;
                                            eVar4.e("MEASUREMENT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar17.K(objQ22);
                        } else {
                            aVar.getClass();
                            if (objQ22 == m.a.f135155b) {
                                final int i39 = z14 ? 1 : 0;
                                objQ22 = new e23.a() { // from class: ht0.c
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i310 = i39;
                                        e eVar4 = eVar3;
                                        switch (i310) {
                                            case 0:
                                                int i44 = e.f85518g;
                                                eVar4.e("READINGS_ACTION");
                                                break;
                                            case 1:
                                                int i45 = e.f85518g;
                                                eVar4.e("WHAT_IS_LT_ACTION");
                                                break;
                                            default:
                                                int i46 = e.f85518g;
                                                eVar4.e("MEASUREMENT_ACTION");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar17.K(objQ22);
                            }
                        }
                        rVar4.B(R.string.lbl_about_your_readings, null, false, (e23.a) objQ22, mVar17, 0, 6);
                        mVar17.f();
                    }
                    boolean zR19 = mVar17.r(eVar3);
                    Object objQ23 = mVar17.q();
                    if (zR19) {
                        objQ23 = new e23.a() { // from class: ht0.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i310 = i17;
                                e eVar4 = eVar3;
                                switch (i310) {
                                    case 0:
                                        int i44 = e.f85518g;
                                        eVar4.e("READINGS_ACTION");
                                        break;
                                    case 1:
                                        int i45 = e.f85518g;
                                        eVar4.e("WHAT_IS_LT_ACTION");
                                        break;
                                    default:
                                        int i46 = e.f85518g;
                                        eVar4.e("MEASUREMENT_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar17.K(objQ23);
                    } else {
                        aVar.getClass();
                        if (objQ23 == m.a.f135155b) {
                            objQ23 = new e23.a() { // from class: ht0.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i310 = i17;
                                    e eVar4 = eVar3;
                                    switch (i310) {
                                        case 0:
                                            int i44 = e.f85518g;
                                            eVar4.e("READINGS_ACTION");
                                            break;
                                        case 1:
                                            int i45 = e.f85518g;
                                            eVar4.e("WHAT_IS_LT_ACTION");
                                            break;
                                        default:
                                            int i46 = e.f85518g;
                                            eVar4.e("MEASUREMENT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar17.K(objQ23);
                        }
                    }
                    rVar4.B(R.string.lbl_what_is_lactate_threshold, null, false, (e23.a) objQ23, mVar17, 0, 6);
                    boolean zR20 = mVar17.r(eVar3);
                    Object objQ24 = mVar17.q();
                    if (zR20) {
                        objQ24 = new e23.a() { // from class: ht0.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i310 = i16;
                                e eVar4 = eVar3;
                                switch (i310) {
                                    case 0:
                                        int i44 = e.f85518g;
                                        eVar4.e("READINGS_ACTION");
                                        break;
                                    case 1:
                                        int i45 = e.f85518g;
                                        eVar4.e("WHAT_IS_LT_ACTION");
                                        break;
                                    default:
                                        int i46 = e.f85518g;
                                        eVar4.e("MEASUREMENT_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar17.K(objQ24);
                    } else {
                        aVar.getClass();
                        if (objQ24 == m.a.f135155b) {
                            objQ24 = new e23.a() { // from class: ht0.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i310 = i16;
                                    e eVar4 = eVar3;
                                    switch (i310) {
                                        case 0:
                                            int i44 = e.f85518g;
                                            eVar4.e("READINGS_ACTION");
                                            break;
                                        case 1:
                                            int i45 = e.f85518g;
                                            eVar4.e("WHAT_IS_LT_ACTION");
                                            break;
                                        default:
                                            int i46 = e.f85518g;
                                            eVar4.e("MEASUREMENT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar17.K(objQ24);
                        }
                    }
                    rVar4.B(R.string.lbl_how_to_get_measurement, null, false, (e23.a) objQ24, mVar17, 0, 6);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                hv0.e.a((gv0.d) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, int i14, int i15) {
        this.f76247a = i15;
        this.f76248b = obj;
        this.f76249c = obj2;
    }
}
