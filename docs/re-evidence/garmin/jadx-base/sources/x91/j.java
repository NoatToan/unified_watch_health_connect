package x91;

import ae2.h0;
import ae2.l0;
import ae2.q0;
import android.view.View;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditRidingPositionActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditTerrainActivity;
import fe2.s1;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p13.j0;
import p13.y;
import r22.t1;
import xa1.b0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189619a;

    public /* synthetic */ j(xc0.r rVar) {
        this.f189619a = 12;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        DateTime dateTimeC;
        switch (this.f189619a) {
            case 0:
                k kVar = k.f189620a;
                ((q91.d) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                ((Double) obj).doubleValue();
                k kVar2 = k.f189620a;
                return Unit.INSTANCE;
            case 2:
                aa1.f fVar = (aa1.f) obj;
                fVar.getClass();
                return Long.valueOf(fVar.f2270a.f143579a);
            case 3:
                aa1.g gVar = (aa1.g) obj;
                gVar.getClass();
                return Long.valueOf(gVar.f2275a.f143579a);
            case 4:
                ab1.a.b bVar = (ab1.a.b) obj;
                EditPowerGuideStrategyActivity.a aVar = EditPowerGuideStrategyActivity.f40384t;
                bVar.getClass();
                return Boolean.valueOf(bVar instanceof ab1.a.b.C0031a);
            case 5:
                ab1.a.b bVar2 = (ab1.a.b) obj;
                EditPowerGuideStrategyActivity.a aVar2 = EditPowerGuideStrategyActivity.f40384t;
                bVar2.getClass();
                return Boolean.valueOf(bVar2 instanceof ab1.a.b.C0033b);
            case 6:
                oi0.b bVar3 = (oi0.b) obj;
                EditPowerGuideStrategyActivity.a aVar3 = EditPowerGuideStrategyActivity.f40384t;
                bVar3.getClass();
                bVar3.s();
                bVar3.B();
                return Unit.INSTANCE;
            case 7:
                oi0.b bVar4 = (oi0.b) obj;
                EditPowerGuideStrategyActivity.a aVar4 = EditPowerGuideStrategyActivity.f40384t;
                bVar4.getClass();
                bVar4.y();
                bVar4.g();
                return Unit.INSTANCE;
            case 8:
                t1 t1Var = (t1) obj;
                EditRidingPositionActivity.a aVar5 = EditRidingPositionActivity.f40405b;
                t1Var.getClass();
                return Boolean.valueOf(!t1Var.f149897g);
            case 9:
                t1 t1Var2 = (t1) obj;
                EditTerrainActivity.a aVar6 = EditTerrainActivity.f40407b;
                t1Var2.getClass();
                return Boolean.valueOf(!t1Var2.f149897g);
            case 10:
                oi0.b bVar5 = (oi0.b) obj;
                int i14 = b0.f189732f;
                bVar5.getClass();
                bVar5.f();
                return Unit.INSTANCE;
            case 11:
                return Unit.INSTANCE;
            case 12:
                al2.c cVar = (al2.c) obj;
                Logger logger = xc0.r.f189956f;
                cVar.getClass();
                al2.b bVar6 = cVar.f3777c;
                Logger logger2 = xc0.r.f189956f;
                com.airbnb.lottie.animation.keyframe.a.u("handleSyncNowStatus: handling sync now response status: ", bVar6.name(), ".", logger2);
                int i15 = xc0.r.b.f189962a[bVar6.ordinal()];
                if (i15 != 1 && i15 != 2) {
                    if (i15 != 3) {
                        com.airbnb.lottie.animation.keyframe.a.z("handleSyncStatus: sync failed with ", bVar6.name(), ".", logger2);
                        bv2.p pVar = xc0.r.f189957g;
                        if (pVar == null) {
                            p005kotlin.jvm.internal.s.m("syncListener");
                            throw null;
                        }
                        bVar6.name().getClass();
                        pVar.f21557c.getClass();
                        View viewA = pVar.a();
                        if (viewA != null) {
                            viewA.clearAnimation();
                            viewA.setClickable(true);
                        }
                    } else {
                        logger2.debug("handleSyncNowStatus: handling sync now status: " + bVar6 + ".");
                        bv2.p pVar2 = xc0.r.f189957g;
                        if (pVar2 == null) {
                            p005kotlin.jvm.internal.s.m("syncListener");
                            throw null;
                        }
                        pVar2.c();
                    }
                }
                return Unit.INSTANCE;
            case 13:
                com.garmin.android.apps.connectmobile.repcounting.model.b bVar7 = (com.garmin.android.apps.connectmobile.repcounting.model.b) obj;
                bVar7.getClass();
                return Boolean.valueOf(bVar7.G() < 25.0d);
            case 14:
                int i16 = xd2.b.f190044j;
                ((Unit) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                be2.f fVar2 = (be2.f) obj;
                int i17 = xd2.b.f190044j;
                fVar2.getClass();
                return fVar2;
            case 16:
                int i18 = xd2.b.f190044j;
                ((Unit) obj).getClass();
                return Unit.INSTANCE;
            case 17:
                return (l0) obj;
            case 18:
                return (ae2.b) obj;
            case 19:
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return Unit.INSTANCE;
            case 23:
                List<q0> listA = ((ae2.h) obj).a();
                return listA == null ? j0.f134944a : listA;
            case 24:
                return (ae2.i) obj;
            case 25:
                List<ae2.m> listA2 = ((ae2.j) obj).a();
                if (listA2 == null) {
                    return j0.f134944a;
                }
                ArrayList arrayList = new ArrayList(y.r(listA2, 10));
                for (ae2.m mVar : listA2) {
                    ae2.n nVarA = mVar.getMessageBody();
                    Long lA = nVarA != null ? nVarA.getMessageId() : null;
                    ae2.n nVarA2 = mVar.getMessageBody();
                    Long lValueOf = (nVarA2 == null || (dateTimeC = nVarA2.getTimestamp()) == null) ? null : Long.valueOf(dateTimeC.getMillis());
                    ae2.n nVarA3 = mVar.getMessageBody();
                    arrayList.add(new s1(lA, lValueOf, nVarA3 != null ? nVarA3.getMessageText() : null, j0.f134944a, mVar.getSenderSessionId(), mVar.getSenderDisplayName(), mVar.getMessageSeq()));
                }
                return arrayList;
            case 26:
                List<h0> listA3 = ((ae2.j0) obj).a();
                return listA3 == null ? j0.f134944a : listA3;
            case 27:
                List<h0> listA4 = ((ae2.j0) obj).a();
                return listA4 == null ? j0.f134944a : listA4;
            case 28:
                h0 h0VarA = ((l0) obj).getSession();
                if (h0VarA != null) {
                    return h0VarA.getUrl();
                }
                return null;
            default:
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(int i14) {
        this.f189619a = i14;
    }
}
