package ho2;

import android.content.DialogInterface;
import androidx.room.a0;
import b.u;
import c2.x2;
import c80.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactActivity;
import f5.w;
import gl1.y;
import h4.r;
import ht1.f0;
import i3.cf;
import i3.d5;
import i3.df;
import i3.i7;
import i3.m4;
import i3.mc;
import i3.si;
import o4.d0;
import o4.e0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.x;
import p3.p0;
import p3.x1;
import u1.y0;
import v62.e1;
import zd0.g1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84882a;

    public /* synthetic */ o(int i14) {
        this.f84882a = i14;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z14 = false;
        switch (this.f84882a) {
            case 0:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 1:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar2 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 2:
                DialogInterface dialogInterface3 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar3 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                dialogInterface3.getClass();
                dialogInterface3.dismiss();
                return Unit.INSTANCE;
            case 3:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ht1.a aVar = ht1.a.f85531a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.close_circle, mVar, 0), y.Q(mVar, R.string.lbl_close), null, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar), mVar, 0, 4);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ht1.c cVar4 = ht1.c.f85540a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    t4.d dVarA = n5.c.a(R.drawable.photo_delete_button, mVar2, 0);
                    String strQ = y.Q(mVar2, R.string.lbl_delete_photo);
                    d0.f128823b.getClass();
                    i7.a(dVarA, strQ, null, d0.f128832k, mVar2, 3072, 4);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                f0.a((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                hv0.c.a((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                hx0.b bVar = hx0.b.f86021a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    ub1.l lVarU = g1.u((g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null), s0.MCT_GENESIS, null, 6);
                    if (lVarU == null) {
                        mVar3.C(1582058617);
                        mVar3.f();
                    } else {
                        mVar3.C(1582058618);
                        z02.b.a(false, null, null, null, false, z3.f.c(-1013508769, new hx0.a(lVarU, z14 ? 1 : 0), mVar3), mVar3, 196608, 31);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                hx0.c cVar5 = hx0.c.f86027a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    t4.d dVarA2 = n5.c.a(R.drawable.exterior_link, mVar4, 0);
                    String strQ2 = y.Q(mVar4, R.string.common_learn_more);
                    r.a aVar2 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    y0.a(dVarA2, strQ2, x2.q(aVar2, eVar.f97920e), null, null, 0.0f, e0.a.a(e0.f128843b, d92.b.a(mVar4).f().c()), mVar4, 0, 56);
                    c2.l.f(x2.u(aVar2, eVar.f97919d), mVar4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                hz0.a aVar3 = hz0.a.f86402a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                i11.c cVar6 = i11.c.f87076a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    String str = new b92.a.C0235a(null, 1, null).b().f16961a.get("moreIconDescription");
                    b3.b.f15502a.getClass();
                    i7.b(d3.n.a(), str, null, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar6), mVar6, 0, 4);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 11:
                DialogInterface dialogInterface4 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                EditContactActivity.a aVar4 = EditContactActivity.f32500n;
                dialogInterface4.getClass();
                dialogInterface4.dismiss();
                return Unit.INSTANCE;
            case 12:
                m4 m4Var = (m4) obj2;
                Long lG = m4Var.g();
                Long lValueOf = Long.valueOf(m4Var.d());
                j23.l lVar = m4Var.f87404a;
                return x.k(lG, lValueOf, Integer.valueOf(lVar.f96796a), Integer.valueOf(lVar.f96797b), Integer.valueOf(m4Var.f()));
            case 13:
                d5 d5Var = (d5) obj2;
                Long lK = d5Var.k();
                Long lI = d5Var.i();
                Long lValueOf2 = Long.valueOf(d5Var.d());
                j23.l lVar2 = d5Var.f87404a;
                return x.k(lK, lI, lValueOf2, Integer.valueOf(lVar2.f96796a), Integer.valueOf(lVar2.f96797b), Integer.valueOf(d5Var.f()));
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Integer.valueOf(((w) obj).e0(((Integer) obj2).intValue()));
            case 16:
                return Integer.valueOf(((w) obj).l0(((Integer) obj2).intValue()));
            case 17:
                return Integer.valueOf(((w) obj).a0(((Integer) obj2).intValue()));
            case 18:
                return Integer.valueOf(((w) obj).O(((Integer) obj2).intValue()));
            case 19:
                return ((mc) obj2).c();
            case 20:
                return (df) ((cf) obj2).f87782a.f193585g.getF182175a();
            case 21:
                return (df) ((cf) obj2).f87782a.f193585g.getF182175a();
            case 22:
                return Integer.valueOf(((w) obj).O(((Integer) obj2).intValue()));
            case 23:
                return Integer.valueOf(((w) obj).l0(((Integer) obj2).intValue()));
            case 24:
                return Integer.valueOf(((w) obj).e0(((Integer) obj2).intValue()));
            case 25:
                return Integer.valueOf(((w) obj).a0(((Integer) obj2).intValue()));
            case 26:
                si siVar = (si) obj2;
                return x.k(Integer.valueOf(siVar.f89709c.getIntValue()), Integer.valueOf(siVar.f89710d.getIntValue()), Boolean.valueOf(siVar.f89707a));
            case 27:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                i51.a aVar5 = i51.a.f91784a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    String strQ3 = y.Q(mVar7, R.string.pacepro_lbl_race_distance);
                    u uVar = (u) mVar7.A(g02.d.f74342a);
                    boolean zR = mVar7.r(uVar);
                    Object objQ = mVar7.q();
                    if (zR) {
                        objQ = new i51.a.C1754a(uVar);
                        mVar7.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new i51.a.C1754a(uVar);
                            mVar7.K(objQ);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) ((k23.g) objQ), null, strQ3, mVar7, null);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 28:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                i51.a aVar6 = i51.a.f91784a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    r.a aVar7 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarQ = x2.q(aVar7, j92.b.f97901d.f97905d);
                    s62.a.f157643a.getClass();
                    i7.b(e1.a(t62.b.f162798a), null, rVarQ, a0.c(mVar8), mVar8, 48, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                i51.a aVar8 = i51.a.f91784a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    r.a aVar9 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarQ2 = x2.q(aVar9, j92.b.f97901d.f97905d);
                    s62.a.f157643a.getClass();
                    i7.b(e1.a(t62.b.f162798a), null, rVarQ2, a0.c(mVar9), mVar9, 48, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
        }
    }
}
