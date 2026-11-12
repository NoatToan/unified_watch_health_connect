package dv0;

import androidx.room.a0;
import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import gl1.y;
import h5.e0;
import i3.ff;
import i3.hf;
import i3.i7;
import i3.mh;
import java.util.List;
import l72.f0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import p3.x3;
import s5.x0;
import sg0.f1;
import v62.e1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3 f61412b;

    public /* synthetic */ l(x3 x3Var, int i14) {
        this.f61411a = i14;
        this.f61412b = x3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        int i15;
        String strH;
        com.garmin.android.apps.connectmobile.userprofile.model.q qVar;
        hi0.a userFollowProfile;
        int i16 = this.f61411a;
        String fullName = null;
        x3 x3Var = this.f61412b;
        switch (i16) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    int i17 = o.b.f61422a[((yu0.c) x3Var.getF182175a()).ordinal()];
                    if (i17 != 1) {
                        if (i17 == 2) {
                            mVar.C(-1145008045);
                            strH = y.P(R.string.lbl_invalid_url_info, new Object[]{3, 64}, mVar);
                            mVar.f();
                        } else if (i17 == 3) {
                            mVar.C(-1145003295);
                            strH = y.P(R.string.livetrack_custom_url_rules_numbers, new Object[]{3, 64}, mVar);
                            mVar.f();
                        } else {
                            if (i17 != 4) {
                                throw n23.j.m(mVar, -1145013496);
                            }
                            i14 = -1144998138;
                            i15 = R.string.livetrack_available_profile_url;
                        }
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarF = d92.c.f(j92.f.f97933j, mVar);
                        h4.r.a aVar = h4.r.S;
                        d92.b.f58625c.getClass();
                        float f14 = j92.b.f97899b.f97920e;
                        mh.c(strH, c2.l.z(aVar, f14, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar, 0, 0, 131068);
                    } else {
                        i14 = -1145012086;
                        i15 = R.string.livetrack_not_available_profile_url;
                    }
                    strH = sn.a.h(mVar, i14, i15, mVar);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarF2 = d92.c.f(j92.f.f97933j, mVar);
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97920e;
                    mh.c(strH, c2.l.z(aVar2, f15, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, mVar, 0, 0, 131068);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                UserProfileActivity.a aVar3 = UserProfileActivity.f46494x;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    g3 g3Var = (g3) x3Var.getF182175a();
                    if (g3Var != null && (qVar = (com.garmin.android.apps.connectmobile.userprofile.model.q) g3Var.f35301b) != null && (userFollowProfile = qVar.getUserFollowProfile()) != null) {
                        fullName = userFollowProfile.getFullName();
                    }
                    s12.e.b(fullName, mVar2, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    hf.a(((Boolean) x3Var.getF182175a()).booleanValue(), null, null, false, d92.c.a(ff.f88115a, mVar3), mVar3, 48, 92);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    if (((List) x3Var.getF182175a()).isEmpty()) {
                        mVar4.C(577048484);
                        h4.r.a aVar4 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarY = c2.l.y(aVar4, j92.b.f97899b.f97920e);
                        String strQ = y.Q(mVar4, R.string.sensors_list_footer);
                        d6.h.f57752b.getClass();
                        int i18 = d6.h.f57755e;
                        d92.b.f58624b.getClass();
                        mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar4), mVar4, 0, 0, 130044);
                        mVar4.f();
                    } else {
                        mVar4.C(577413819);
                        qc0.b.b((List) x3Var.getF182175a(), mVar4, 0);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    ue0.l lVar = ((sg0.u) x3Var.getF182175a()).f159156a;
                    if (lVar == null) {
                        return Unit.INSTANCE;
                    }
                    h4.r.a aVar5 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar5, 0);
                    int iHashCode = Long.hashCode(mVar5.getU());
                    i2 i2VarX = mVar5.x();
                    h4.r rVarC = h4.k.c(aVar5, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar6);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar5);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar5);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f1.a(c2.l.C(aVar5, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), lVar.getFullName(), lVar.f170208m, lVar.A1(), lVar.getUserLevel(), mVar5, com.garmin.android.apps.connectmobile.userprofile.model.l.f46892e << 6, 0);
                    sg0.t.a(mVar5, 0);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.p.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.p.f46166c;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    if (((ny1.d) x3Var.getF182175a()) == ny1.d.YES) {
                        mVar6.C(-464418921);
                        h4.r.a aVar8 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarQ = x2.q(aVar8, j92.b.f97901d.f97904c);
                        s62.a.f157643a.getClass();
                        i7.b(e1.a(t62.b.f162798a), null, rVarQ, a0.c(mVar6), mVar6, 48, 0);
                        mVar6.f();
                    } else {
                        mVar6.C(-464125134);
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.p.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.p.f46166c;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    if (((ny1.d) x3Var.getF182175a()) == ny1.d.NO) {
                        mVar7.C(-1217116946);
                        h4.r.a aVar10 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarQ2 = x2.q(aVar10, j92.b.f97901d.f97904c);
                        s62.a.f157643a.getClass();
                        i7.b(e1.a(t62.b.f162798a), null, rVarQ2, a0.c(mVar7), mVar7, 48, 0);
                        mVar7.f();
                    } else {
                        mVar7.C(-1216823159);
                        mVar7.f();
                    }
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    hf.a(((Boolean) x3Var.getF182175a()).booleanValue(), null, null, false, d92.c.a(ff.f88115a, mVar8), mVar8, 48, 92);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                        mVar9.C(-565692546);
                        f0.f110999a.g(0, 3, 0L, null, mVar9);
                        mVar9.f();
                    } else {
                        mVar9.C(-565613744);
                        mVar9.f();
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    hf.a(((Boolean) x3Var.getF182175a()).booleanValue(), null, null, false, d92.c.a(ff.f88115a, mVar10), mVar10, 48, 92);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    hf.a(((Boolean) x3Var.getF182175a()).booleanValue(), null, null, false, d92.c.a(ff.f88115a, mVar11), mVar11, 48, 92);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
        }
    }
}
