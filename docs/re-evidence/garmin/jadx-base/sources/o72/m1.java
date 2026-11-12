package o72;

import android.app.Activity;
import android.net.Uri;
import androidx.lifecycle.ViewModelStoreOwner;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupDetailMemberListFragment;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.presentation.dev.PromotionsDevMenuActivity;
import i3.kb;
import java.util.HashSet;
import java.util.Map;
import org.joda.time.DateTime;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p3.b4;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m1 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f130479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f130480c;

    public /* synthetic */ m1(int i14, Object obj, Object obj2) {
        this.f130478a = i14;
        this.f130479b = obj;
        this.f130480c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        p3.p1 p1Var = (p3.p1) this.f130479b;
        hf.j jVar = (hf.j) this.f130480c;
        int iIntValue = ((Integer) obj2).intValue();
        p3.m mVar = (p3.m) obj3;
        ((Integer) obj4).getClass();
        ((h2.c0) obj).getClass();
        p3.x1 x1Var = p3.n.f135158a;
        y22.w wVar = (y22.w) p13.h0.e0(iIntValue, (i53.c) p1Var.getF182175a());
        if (wVar == null) {
            return Unit.INSTANCE;
        }
        h4.r rVarD = c2.x2.d(h4.r.S, 1.0f);
        h4.d.f81522a.getClass();
        f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
        int iHashCode = Long.hashCode(mVar.getU());
        p3.i2 i2VarX = mVar.x();
        h4.r rVarC = h4.k.c(rVarD, mVar);
        h5.g.V.getClass();
        h5.e0.a aVar = h5.g.a.f81805b;
        if (mVar.F() == null) {
            p3.p0.l();
            throw null;
        }
        mVar.z();
        if (mVar.getT()) {
            mVar.M(aVar);
        } else {
            mVar.c();
        }
        b4.c(h5.g.a.f81810g, z0VarD, mVar);
        b4.c(h5.g.a.f81809f, i2VarX, mVar);
        h5.g.a.b bVar = h5.g.a.f81813j;
        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
            v.h.z(iHashCode, mVar, iHashCode, bVar);
        }
        b4.c(h5.g.a.f81807d, rVarC, mVar);
        c2.u uVar = c2.u.f22885a;
        Uri uri = wVar.f194324a;
        d92.b.f58623a.getClass();
        t4.c cVar = new t4.c(d92.b.a(mVar).c().g(), null);
        f5.k.f68985a.getClass();
        jf.b.b(uri, null, jVar, null, cVar, null, null, null, null, null, null, f5.k.a.f68991f, null, 0, mVar, 48, 48, 63464);
        mVar.y();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:113:0x0412  */
    /* JADX WARN: Code duplicated, block: B:13:0x0072  */
    /* JADX WARN: Code duplicated, block: B:147:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:154:0x0506  */
    /* JADX WARN: Code duplicated, block: B:188:0x0647  */
    /* JADX WARN: Code duplicated, block: B:193:0x066b  */
    /* JADX WARN: Code duplicated, block: B:232:0x0773  */
    /* JADX WARN: Code duplicated, block: B:285:0x093e  */
    /* JADX WARN: Code duplicated, block: B:370:0x0ae9  */
    /* JADX WARN: Code duplicated, block: B:371:0x0af4  */
    /* JADX WARN: Code duplicated, block: B:399:0x0bae  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        int i15;
        String str;
        li0.d0 d0Var;
        p3.m mVar;
        int i16;
        int i17;
        int i18;
        Object obj5;
        Object obj6;
        int i19 = this.f130478a;
        int i24 = 4;
        int i25 = 3;
        int i26 = 2;
        p3.m.a aVar = p3.m.f135153a;
        boolean z14 = true;
        int i27 = 16;
        boolean z15 = false;
        Object obj7 = this.f130480c;
        Object obj8 = this.f130479b;
        switch (i19) {
            case 0:
                o82.g gVar = (o82.g) obj8;
                e23.l lVar = (e23.l) obj7;
                int iIntValue = ((Integer) obj2).intValue();
                p3.m mVar2 = (p3.m) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= mVar2.k(iIntValue) ? 32 : 16;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    o82.g gVar2 = (o82.g) o82.g.f130861n.get(iIntValue);
                    boolean z16 = gVar2 == gVar;
                    boolean zB = mVar2.B(lVar) | mVar2.k(gVar2.ordinal());
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new mt0.s1(26, lVar, gVar2);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new mt0.s1(26, lVar, gVar2);
                            mVar2.K(objQ);
                        }
                    }
                    i3.y1.b(z16, (e23.a) objQ, z3.f.c(619313304, new m92.f(gVar2, i27), mVar2), null, false, null, null, null, null, null, null, mVar2, 384, 4088);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                zc.d dVar = (zc.d) obj8;
                GroupDetailMemberListFragment groupDetailMemberListFragment = (GroupDetailMemberListFragment) obj7;
                int iIntValue3 = ((Integer) obj2).intValue();
                p3.m mVar3 = (p3.m) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= mVar3.k(iIntValue3) ? 32 : 16;
                }
                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.group.details.about.member.a aVar2 = (com.garmin.android.apps.connectmobile.group.details.about.member.a) dVar.a(iIntValue3);
                    if (aVar2 == null) {
                        return Unit.INSTANCE;
                    }
                    if (aVar2 instanceof com.garmin.android.apps.connectmobile.group.details.about.member.a.C0629a) {
                        mVar3.C(350745113);
                        l72.r1.b(gl1.y.Q(mVar3, ((com.garmin.android.apps.connectmobile.group.details.about.member.a.C0629a) aVar2).f36220a), null, mVar3, 0, 2);
                        mVar3.f();
                    } else {
                        if (!(aVar2 instanceof com.garmin.android.apps.connectmobile.group.details.about.member.a.b)) {
                            throw n23.j.m(mVar3, -1512707778);
                        }
                        mVar3.C(350958641);
                        com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar = ((com.garmin.android.apps.connectmobile.group.details.about.member.a.b) aVar2).f36221a;
                        li0.d0 d0Var2 = bVar.f31627o;
                        String strH = d0Var2 != null ? d0Var2.f112653f : null;
                        GroupDTO.c groupRole = bVar.getGroupRole();
                        int i28 = groupRole == null ? -1 : GroupDetailMemberListFragment.a.f36182a[groupRole.ordinal()];
                        if (i28 != 1) {
                            if (i28 != 2) {
                                mVar3.C(-1512684639);
                                mVar3.f();
                            } else {
                                i14 = -1512687276;
                                i15 = R.string.lbl_admin;
                            }
                            str = strH;
                            d0Var = bVar.f31627o;
                            if (d0Var == null) {
                                mVar3.C(351561094);
                                mVar3.f();
                                mVar = mVar3;
                            } else {
                                mVar3.C(351561095);
                                li0.c0.f112641a.a(li0.d0.b(d0Var, null, null, null, str, null, null, null, 479), ((nm0.f) groupDetailMemberListFragment.f36181b.getValue()).f126584i, null, null, mVar3, li0.d0.f112647j | (li0.f.f112658h << 3), 12);
                                mVar = mVar3;
                                mVar.f();
                                Unit unit = Unit.INSTANCE;
                            }
                            mVar.f();
                        } else {
                            i14 = -1512690956;
                            i15 = R.string.lbl_owner;
                        }
                        strH = sn.a.h(mVar3, i14, i15, mVar3);
                        str = strH;
                        d0Var = bVar.f31627o;
                        if (d0Var == null) {
                            mVar3.C(351561094);
                            mVar3.f();
                            mVar = mVar3;
                        } else {
                            mVar3.C(351561095);
                            li0.c0.f112641a.a(li0.d0.b(d0Var, null, null, null, str, null, null, null, 479), ((nm0.f) groupDetailMemberListFragment.f36181b.getValue()).f126584i, null, null, mVar3, li0.d0.f112647j | (li0.f.f112658h << 3), 12);
                            mVar = mVar3;
                            mVar.f();
                            Unit unit2 = Unit.INSTANCE;
                        }
                        mVar.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                zc.d dVar2 = (zc.d) obj8;
                GroupManageMembersActivity groupManageMembersActivity = (GroupManageMembersActivity) obj7;
                e2.d dVar3 = (e2.d) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                p3.m mVar4 = (p3.m) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                GroupManageMembersActivity.a aVar3 = GroupManageMembersActivity.f36194d;
                dVar3.getClass();
                if ((iIntValue6 & 6) == 0) {
                    i16 = (mVar4.B(dVar3) ? 4 : 2) | iIntValue6;
                } else {
                    i16 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i16 |= mVar4.k(iIntValue5) ? 32 : 16;
                }
                if (mVar4.n(i16 & 1, (i16 & 147) != 146)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.group.details.about.member.a aVar4 = (com.garmin.android.apps.connectmobile.group.details.about.member.a) dVar2.a(iIntValue5);
                    if (aVar4 == null) {
                        return Unit.INSTANCE;
                    }
                    if (aVar4 instanceof com.garmin.android.apps.connectmobile.group.details.about.member.a.C0629a) {
                        mVar4.C(398133080);
                        l72.r1.b(gl1.y.Q(mVar4, ((com.garmin.android.apps.connectmobile.group.details.about.member.a.C0629a) aVar4).f36220a), null, mVar4, 0, 2);
                        mVar4.f();
                    } else {
                        if (!(aVar4 instanceof com.garmin.android.apps.connectmobile.group.details.about.member.a.b)) {
                            throw n23.j.m(mVar4, -541345799);
                        }
                        mVar4.C(398499872);
                        l72.p2 p2Var = l72.p2.f111205a;
                        com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar2 = ((com.garmin.android.apps.connectmobile.group.details.about.member.a.b) aVar4).f36221a;
                        String fullName = bVar2.getFullName();
                        String str2 = fullName == null ? "" : fullName;
                        String location = bVar2.getLocation();
                        p2Var.h(str2, location == null ? "" : location, null, e2.d.c(dVar3, h4.r.S), null, false, false, z3.f.c(-391672002, new om0.d(groupManageMembersActivity, aVar4), mVar4), z3.f.c(2135591103, new om0.d(aVar4, groupManageMembersActivity), mVar4), null, null, mVar4, 113246208, 0, 1652);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 3:
                n82.f fVar = (n82.f) obj8;
                p3.p1 p1Var = (p3.p1) obj7;
                u82.f fVar2 = (u82.f) obj2;
                p3.m mVar5 = (p3.m) obj3;
                int iC = vb.h.c((Integer) obj4, (c2.t) obj, fVar2);
                if ((iC & 48) == 0) {
                    iC |= (iC & 64) == 0 ? mVar5.B(fVar2) : mVar5.r(fVar2) ? 32 : 16;
                }
                if (mVar5.n(iC & 1, (iC & 145) != 144)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    ir0.e eVar = (ir0.e) fVar2.a();
                    boolean z17 = ((or0.q) p1Var.getF182175a()).f133398b;
                    boolean zB2 = mVar5.B(fVar);
                    Object objQ2 = mVar5.q();
                    if (zB2) {
                        objQ2 = new d52.k(fVar, 13);
                        mVar5.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new d52.k(fVar, 13);
                            mVar5.K(objQ2);
                        }
                    }
                    rr0.y.d(eVar, z17, (e23.l) objQ2, mVar5, ir0.e.f94792c);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 4:
                r70.q qVar = (r70.q) obj7;
                int iIntValue7 = ((Integer) obj2).intValue();
                p3.m mVar6 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((h2.c0) obj).getClass();
                p3.x1 x1Var5 = p3.n.f135158a;
                r70.r rVarA = m70.f.a(((n70.a) obj8).f123996a.get(iIntValue7));
                if (rVarA == null) {
                    mVar6.C(-312778007);
                } else {
                    mVar6.C(1236836376);
                    rVarA.a(c2.x2.f(h4.r.S, 1.0f), qVar, mVar6, 6);
                }
                mVar6.f();
                return Unit.INSTANCE;
            case 5:
                o70.p pVar = (o70.p) obj8;
                r70.q qVar2 = (r70.q) obj7;
                int iIntValue8 = ((Integer) obj2).intValue();
                p3.m mVar7 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((h2.c0) obj).getClass();
                p3.x1 x1Var6 = p3.n.f135158a;
                h4.r.a aVar5 = h4.r.S;
                h4.r rVarI = yz1.s.i(aVar5, ((g6.c) mVar7.A(kotlin.t1.f91490h)).getF75992b());
                h4.d.f81522a.getClass();
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(mVar7.getU());
                p3.i2 i2VarX = mVar7.x();
                h4.r rVarC = h4.k.c(rVarI, mVar7);
                h5.g.V.getClass();
                h5.e0.a aVar6 = h5.g.a.f81805b;
                if (mVar7.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar7.z();
                if (mVar7.getT()) {
                    mVar7.M(aVar6);
                } else {
                    mVar7.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, mVar7);
                b4.c(h5.g.a.f81809f, i2VarX, mVar7);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar7, iHashCode, bVar3);
                }
                b4.c(h5.g.a.f81807d, rVarC, mVar7);
                c2.u uVar = c2.u.f22885a;
                r70.r rVarA2 = m70.f.a(pVar.f130052b.get(iIntValue8));
                if (rVarA2 == null) {
                    mVar7.C(-449802399);
                    mVar7.f();
                } else {
                    mVar7.C(-1261435744);
                    rVarA2.a(c2.x2.d(aVar5, 1.0f), qVar2, mVar7, 6);
                    mVar7.f();
                }
                mVar7.y();
                return Unit.INSTANCE;
            case 6:
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var7 = p3.n.f135158a;
                sg0.t.b((sg0.f0) obj8, (sg0.q0) obj7, (p3.m) obj3, 0);
                return Unit.INSTANCE;
            case 7:
                wn.c cVar = (wn.c) obj8;
                tn.u uVar2 = (tn.u) obj7;
                sn.h hVar = (sn.h) obj2;
                p3.m mVar8 = (p3.m) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                int i29 = tn.u.f165495e;
                ((e2.d) obj).getClass();
                if ((iIntValue9 & 48) == 0) {
                    iIntValue9 |= (iIntValue9 & 64) == 0 ? mVar8.B(hVar) : mVar8.r(hVar) ? 32 : 16;
                }
                if (mVar8.n(iIntValue9 & 1, (iIntValue9 & 145) != 144)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    if (hVar != null) {
                        mVar8.C(-1494076275);
                        l72.p2 p2Var2 = l72.p2.f111205a;
                        String strB = cVar.b(hVar);
                        DateTime dateTimeT = hVar.t();
                        String strB2 = dateTimeT != null ? new pi0.e(cVar.f186096a).b(dateTimeT, qi0.b.NUMERICAL_DATE_RELATIVE_24H_AM_PM_TIME) : cVar.f186097b.getString(R.string.no_value);
                        tn.b.f165451a.getClass();
                        z3.e eVar2 = tn.b.f165453c;
                        boolean zR = mVar8.r(uVar2);
                        if ((iIntValue9 & 112) != 32 && ((iIntValue9 & 64) == 0 || !mVar8.r(hVar))) {
                            z14 = false;
                        }
                        boolean z18 = zR | z14;
                        Object objQ3 = mVar8.q();
                        if (z18) {
                            objQ3 = new tb0.d(i24, uVar2, hVar);
                            mVar8.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new tb0.d(i24, uVar2, hVar);
                                mVar8.K(objQ3);
                            }
                        }
                        p2Var2.h(strB, strB2, null, null, null, false, false, eVar2, null, null, (e23.a) objQ3, mVar8, 12582912, 0, 892);
                        mVar8.f();
                    } else {
                        mVar8.C(-1493095125);
                        mVar8.f();
                    }
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                lc.m0 m0Var = (lc.m0) obj8;
                p3.m mVar9 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var9 = p3.n.f135158a;
                kb.a(null, z3.f.c(1952314006, new b21.j0(m0Var, 29), mVar9), null, null, null, 0, 0L, 0L, null, z3.f.c(682614123, new ry0.g(27, (yg2.h) obj7, m0Var), mVar9), mVar9, 805306416, 509);
                return Unit.INSTANCE;
            case 9:
                zl.b bVar4 = (zl.b) obj8;
                Activity activity = (Activity) obj7;
                p3.m mVar10 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                p3.x1 x1Var10 = p3.n.f135158a;
                p3.p1 p1VarC = s9.c.c(bVar4.f205175g, mVar10);
                u82.a<o82.a, yl.d> aVar7 = bVar4.f205177i;
                tf0.i iVar = bVar4.f205176h;
                Long l14 = (Long) p1VarC.getF182175a();
                boolean zR2 = mVar10.r(bVar4);
                Object objQ4 = mVar10.q();
                if (zR2) {
                    objQ4 = new ul.c.a(bVar4);
                    mVar10.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new ul.c.a(bVar4);
                        mVar10.K(objQ4);
                    }
                }
                e23.l lVar2 = (e23.l) ((k23.g) objQ4);
                boolean zR3 = mVar10.r(activity) | mVar10.r(bVar4);
                Object objQ5 = mVar10.q();
                if (zR3) {
                    objQ5 = new ul.b(activity, bVar4, z15 ? 1 : 0);
                    mVar10.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new ul.b(activity, bVar4, z15 ? 1 : 0);
                        mVar10.K(objQ5);
                    }
                }
                wl.c.a(aVar7, iVar, l14, lVar2, (e23.a) objQ5, mVar10, tf0.i.f164439d << 3);
                return Unit.INSTANCE;
            case 10:
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var11 = p3.n.f135158a;
                t70.i.b((t70.q) obj8, (e23.a) obj7, (p3.m) obj3, 0);
                return Unit.INSTANCE;
            case 11:
                s1.t1 t1Var = (s1.t1) obj8;
                Map map = (Map) obj7;
                r1.l lVar3 = (r1.l) obj;
                uc.c cVar2 = (uc.c) obj2;
                p3.m mVar11 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                p3.x1 x1Var12 = p3.n.f135158a;
                p3.v.b(new p3.n2[]{s9.j.f158018a.c(s9.m.a(p005kotlin.jvm.internal.s.g(t1Var.f155744a.a(), t1Var.f155747d.getF182175a()) ? androidx.lifecycle.b0.b.RESUMED : androidx.lifecycle.b0.b.STARTED, mVar11)), vc.a.f176931a.c(lVar3), uc.f.f169925a.c(p13.u0.c(new o13.p(p005kotlin.jvm.internal.s0.f105811a.b(cVar2.getClass()), cVar2.getF169931a()), map))}, z3.f.c(-1734941436, new tr2.o(cVar2, 15), mVar11), mVar11, 56);
                return Unit.INSTANCE;
            case 12:
                zc.d dVar4 = (zc.d) obj8;
                p3.x3 x3Var = (p3.x3) obj7;
                int iIntValue10 = ((Integer) obj2).intValue();
                p3.m mVar12 = (p3.m) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if ((iIntValue11 & 48) == 0) {
                    iIntValue11 |= mVar12.k(iIntValue10) ? 32 : 16;
                }
                if (mVar12.n(iIntValue11 & 1, (iIntValue11 & 145) != 144)) {
                    p3.x1 x1Var13 = p3.n.f135158a;
                    vt0.b bVar5 = (vt0.b) x3Var.getF182175a();
                    com.garmin.android.apps.connectmobile.leaderboard.model.f0 f0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.f0) dVar4.a(iIntValue10);
                    if (f0Var == null) {
                        return Unit.INSTANCE;
                    }
                    vt0.d.a(bVar5, f0Var, mVar12, com.garmin.android.apps.connectmobile.leaderboard.model.f0.f38147k << 3);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 13:
                e23.a aVar8 = (e23.a) obj8;
                gl1.n nVar = (gl1.n) obj7;
                p3.m mVar13 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var14 = p3.n.f135158a;
                boolean zB3 = mVar13.B(nVar);
                Object objQ6 = mVar13.q();
                if (zB3) {
                    objQ6 = new vu1.b(nVar, i26);
                    mVar13.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new vu1.b(nVar, i26);
                        mVar13.K(objQ6);
                    }
                }
                ew0.f0.a(aVar8, (e23.l) objQ6, mVar13, 0);
                return Unit.INSTANCE;
            case 14:
                vy0.t tVar = (vy0.t) obj8;
                e23.a aVar9 = (e23.a) obj7;
                p3.m mVar14 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var15 = p3.n.f135158a;
                boolean zR4 = mVar14.r(tVar);
                Object objQ7 = mVar14.q();
                if (zR4) {
                    objQ7 = new vu1.b(tVar, i24);
                    mVar14.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new vu1.b(tVar, i24);
                        mVar14.K(objQ7);
                    }
                }
                xy0.b.a(null, (e23.l) objQ7, aVar9, mVar14, 0);
                return Unit.INSTANCE;
            case 15:
                jl1.f.g gVar3 = (jl1.f.g) obj8;
                final z3.e eVar3 = (z3.e) obj7;
                e2.d dVar5 = (e2.d) obj;
                Integer num = (Integer) obj2;
                final int iIntValue12 = num.intValue();
                p3.m mVar15 = (p3.m) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                dVar5.getClass();
                if ((iIntValue13 & 6) == 0) {
                    i17 = (mVar15.B(dVar5) ? 4 : 2) | iIntValue13;
                } else {
                    i17 = iIntValue13;
                }
                if ((iIntValue13 & 48) == 0) {
                    i17 |= mVar15.k(iIntValue12) ? 32 : 16;
                }
                if (mVar15.n(i17 & 1, (i17 & 147) != 146)) {
                    p3.x1 x1Var16 = p3.n.f135158a;
                    w02.m.b(dVar5, gVar3.invoke(num), dVar5, null, false, z3.f.c(-841030972, new e23.r() { // from class: w02.n
                        @Override // e23.r
                        public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                            int i30;
                            i iVar2 = (i) obj9;
                            Boolean bool = (Boolean) obj10;
                            boolean zBooleanValue = bool.booleanValue();
                            p3.m mVar16 = (p3.m) obj11;
                            int iIntValue14 = ((Integer) obj12).intValue();
                            iVar2.getClass();
                            if ((iIntValue14 & 6) == 0) {
                                i30 = (mVar16.B(iVar2) ? 4 : 2) | iIntValue14;
                            } else {
                                i30 = iIntValue14;
                            }
                            if ((iIntValue14 & 48) == 0) {
                                i30 |= mVar16.h(zBooleanValue) ? 32 : 16;
                            }
                            if (mVar16.n(i30 & 1, (i30 & 147) != 146)) {
                                x1 x1Var17 = p3.n.f135158a;
                                eVar3.invoke(iVar2, Integer.valueOf(iIntValue12), bool, mVar16, Integer.valueOf((i30 & 14) | ((i30 << 3) & 896)));
                            } else {
                                mVar16.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar15), mVar15, (i17 & 14) | 196608 | ((i17 << 6) & 896));
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 16:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.l.o oVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.l.o) obj8;
                z3.e eVar4 = (z3.e) obj7;
                e2.d dVar6 = (e2.d) obj;
                Integer num2 = (Integer) obj2;
                int iIntValue14 = num2.intValue();
                p3.m mVar16 = (p3.m) obj3;
                int iIntValue15 = ((Integer) obj4).intValue();
                dVar6.getClass();
                if ((iIntValue15 & 6) == 0) {
                    i18 = iIntValue15 | (mVar16.B(dVar6) ? 4 : 2);
                } else {
                    i18 = iIntValue15;
                }
                if ((iIntValue15 & 48) == 0) {
                    i18 |= mVar16.k(iIntValue14) ? 32 : 16;
                }
                if (mVar16.n(i18 & 1, (i18 & 147) != 146)) {
                    p3.x1 x1Var17 = p3.n.f135158a;
                    Object objInvoke = oVar.invoke(num2);
                    w02.r rVar = (w02.r) mVar16.A(w02.m.f181115a);
                    boolean zB4 = mVar16.B(rVar) | mVar16.B(objInvoke);
                    Object objQ8 = mVar16.q();
                    if (zB4) {
                        obj5 = objQ8;
                        Object hVar2 = new w02.h(dVar6, rVar, objInvoke);
                        mVar16.K(hVar2);
                        obj5 = hVar2;
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            obj5 = objQ8;
                            Object hVar3 = new w02.h(dVar6, rVar, objInvoke);
                            mVar16.K(hVar3);
                            obj5 = hVar3;
                        }
                    }
                    obj5 = objQ8;
                    eVar4.invoke((w02.h) obj5, num2, mVar16, Integer.valueOf(i18 & 112));
                    HashSet<Object> hashSet = rVar.f181133l;
                    boolean zB5 = mVar16.B(rVar) | mVar16.r(objInvoke);
                    Object objQ9 = mVar16.q();
                    if (zB5) {
                        obj6 = objQ9;
                        w02.o oVar2 = new w02.o(rVar, objInvoke, null);
                        mVar16.K(oVar2);
                        obj6 = oVar2;
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            obj6 = objQ9;
                            w02.o oVar3 = new w02.o(rVar, objInvoke, null);
                            mVar16.K(oVar3);
                            obj6 = oVar3;
                        }
                    }
                    obj6 = objQ9;
                    p3.l0.e((e23.p) obj6, hashSet, mVar16);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 17:
                i53.c cVar3 = (i53.c) obj8;
                v21.e eVar5 = (v21.e) obj7;
                int iIntValue16 = ((Integer) obj2).intValue();
                p3.m mVar17 = (p3.m) obj3;
                int iIntValue17 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if ((iIntValue17 & 48) == 0) {
                    iIntValue17 |= mVar17.k(iIntValue16) ? 32 : 16;
                }
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 145) != 144)) {
                    p3.x1 x1Var18 = p3.n.f135158a;
                    b11.v vVar = (b11.v) cVar3.get(iIntValue16);
                    String strO = eVar5.o(vVar.getF14238e().f14254b, vVar.getF14238e().f14256d);
                    double dG0 = vVar.G0();
                    String strB3 = vVar.getF14239f().b(vVar.getF14238e().f14257e, vVar.G0(), mVar17, 0);
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("label_secondary", eVar5.a(Double.valueOf(dG0), strB3, vVar.getTotalCalories(), vVar.z3(), vVar.g4(), vVar.b4(), true));
                    b92.a aVarB = c0235a.b();
                    String strA = eVar5.a(Double.valueOf(dG0), strB3, vVar.getTotalCalories(), vVar.z3(), vVar.g4(), vVar.b4(), false);
                    String imageUrl = vVar.getImageUrl();
                    int i30 = b92.a.f16960b;
                    j21.q.a(strO, strA, aVarB, imageUrl, false, false, null, null, 0.0f, mVar17, 196608, 464);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 18:
                ky0.w wVar = (ky0.w) obj8;
                e23.a aVar10 = (e23.a) obj7;
                p3.m mVar18 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var19 = p3.n.f135158a;
                mVar18.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar18);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(w51.h0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar18, 0), null);
                mVar18.R();
                w51.v.a((w51.h0) u1VarResolveViewModel, wVar, aVar10, mVar18, 0);
                return Unit.INSTANCE;
            case 19:
                p3.m mVar19 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                int i34 = PromotionsDevMenuActivity.f41027b;
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                p3.x1 x1Var20 = p3.n.f135158a;
                z02.d.a(false, z3.f.c(699026007, new ug2.v((lc.m0) obj8, i25), mVar19), null, null, null, z3.f.c(-1539273517, new wb1.e((zd0.q0) obj7), mVar19), mVar19, 196656, 29);
                return Unit.INSTANCE;
            case 20:
                u82.d dVar7 = (u82.d) obj8;
                e23.l lVar4 = (e23.l) obj7;
                o82.a aVar11 = (o82.a) obj2;
                p3.m mVar20 = (p3.m) obj3;
                int iD = vb.h.d((Integer) obj4, (o82.g) obj, aVar11);
                if ((iD & 48) == 0) {
                    iD |= mVar20.B(aVar11) ? 32 : 16;
                }
                if (mVar20.n(iD & 1, (iD & 145) != 144)) {
                    p3.x1 x1Var21 = p3.n.f135158a;
                    u82.e.b(aVar11, dVar7, null, false, z3.f.c(-335204962, new aa2.j(lVar4, i26), mVar20), mVar20, ((iD >> 3) & 14) | 27648, 4);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 21:
                p3.x3 x3Var2 = (p3.x3) obj8;
                p3.m mVar21 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                NutritionActivity.a aVar12 = NutritionActivity.f39581f;
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                p3.x1 x1Var22 = p3.n.f135158a;
                g02.s0.a(null, ((x01.j) x3Var2.getF182175a()).f188282a, z3.f.c(-2044553593, new wb1.i(i27, x3Var2, (NutritionActivity) obj7), mVar21), mVar21, 384, 1);
                return Unit.INSTANCE;
            case 22:
                aa1.h hVar4 = (aa1.h) obj8;
                e23.l lVar5 = (e23.l) obj7;
                int iIntValue18 = ((Integer) obj2).intValue();
                p3.m mVar22 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((h2.c0) obj).getClass();
                p3.x1 x1Var23 = p3.n.f135158a;
                h4.r rVarE = u1.n.e(c2.x2.d(h4.r.S, 1.0f), tn.k.a(d92.b.f58623a, mVar22), o4.m1.f128891a);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode2 = Long.hashCode(mVar22.getU());
                p3.i2 i2VarX2 = mVar22.x();
                h4.r rVarC2 = h4.k.c(rVarE, mVar22);
                h5.g.V.getClass();
                h5.e0.a aVar13 = h5.g.a.f81805b;
                if (mVar22.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar22.z();
                if (mVar22.getT()) {
                    mVar22.M(aVar13);
                } else {
                    mVar22.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD2, mVar22);
                b4.c(h5.g.a.f81809f, i2VarX2, mVar22);
                h5.g.a.b bVar6 = h5.g.a.f81813j;
                if (mVar22.getT() || !p005kotlin.jvm.internal.s.g(mVar22.q(), Integer.valueOf(iHashCode2))) {
                    v.h.z(iHashCode2, mVar22, iHashCode2, bVar6);
                }
                b4.c(h5.g.a.f81807d, rVarC2, mVar22);
                c2.u uVar3 = c2.u.f22885a;
                q91.g gVar4 = (q91.g) p13.h0.e0(iIntValue18, hVar4.f2294f);
                i53.c<aa1.f> cVar4 = gVar4 != null ? hVar4.f2296h.get(gVar4) : null;
                if (cVar4 == null) {
                    mVar22.C(1621552190);
                    mVar22.f();
                } else {
                    mVar22.C(1621552191);
                    x91.r.a(cVar4, lVar5, mVar22, 0);
                    mVar22.f();
                }
                mVar22.y();
                return Unit.INSTANCE;
            case 23:
                return a(obj, obj2, obj3, obj4);
            default:
                i53.c cVar5 = (i53.c) obj8;
                e23.a aVar14 = (e23.a) obj7;
                ((Integer) obj2).getClass();
                p3.m mVar23 = (p3.m) obj3;
                int iIntValue19 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if (mVar23.n(iIntValue19 & 1, (iIntValue19 & 129) != 128)) {
                    p3.x1 x1Var24 = p3.n.f135158a;
                    String strP = gl1.y.P(R.string.trail_count_trail_options, new Object[]{Integer.valueOf(cVar5.size())}, mVar23);
                    boolean zB6 = mVar23.B(aVar14);
                    Object objQ10 = mVar23.q();
                    if (zB6) {
                        objQ10 = new zo1.y0(aVar14, 9);
                        mVar23.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new zo1.y0(aVar14, 9);
                            mVar23.K(objQ10);
                        }
                    }
                    ys1.b.a(null, strP, (e23.a) objQ10, mVar23, 0, 1);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
        }
    }
}
