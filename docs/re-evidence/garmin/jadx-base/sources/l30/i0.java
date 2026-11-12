package l30;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgDetailActivity;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.CardRefundFailedException;
import com.garmin.feature.garminpay.providers.gpay.ui.common.FitPayA2AInstallAppActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.transitrefund.NewFitPayTransitRefundActivity;
import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import java.util.List;
import p005kotlin.Unit;
import p3.n1;
import p3.o2;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f109588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f109589c;

    public /* synthetic */ i0(int i14, Object obj, Object obj2) {
        this.f109587a = i14;
        this.f109588b = obj;
        this.f109589c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17, types: [k63.e] */
    /* JADX WARN: Type inference failed for: r3v19, types: [m63.a0, m63.m1] */
    @Override // e23.a
    public final Object invoke() {
        yo2.b bVar;
        fo2.p pVarR;
        switch (this.f109587a) {
            case 0:
                ((z) this.f109588b).z4(new n30.c.l0(((n30.f) this.f109589c).f123456d.f181476a));
                return Unit.INSTANCE;
            case 1:
                MultipleCoursesActivity multipleCoursesActivity = (MultipleCoursesActivity) this.f109588b;
                List list = (List) this.f109589c;
                MultipleCoursesActivity.a aVar = MultipleCoursesActivity.f33000c;
                a1 a1VarDa = multipleCoursesActivity.da();
                a1VarDa.getClass();
                a1VarDa.x4(new n30.j.p(list));
                a1 a1VarDa2 = multipleCoursesActivity.da();
                a1VarDa2.getClass();
                a1VarDa2.x4(n30.j.b.f123497a);
                return Unit.INSTANCE;
            case 2:
                MultipleCoursesActivity multipleCoursesActivity2 = (MultipleCoursesActivity) this.f109588b;
                PointOfInterestDTO pointOfInterestDTO = (PointOfInterestDTO) this.f109589c;
                MultipleCoursesActivity.a aVar2 = MultipleCoursesActivity.f33000c;
                a1 a1VarDa3 = multipleCoursesActivity2.da();
                a1VarDa3.getClass();
                a1VarDa3.x4(new n30.j.r(pointOfInterestDTO));
                a1 a1VarDa4 = multipleCoursesActivity2.da();
                a1VarDa4.getClass();
                a1VarDa4.x4(n30.j.b.f123497a);
                return Unit.INSTANCE;
            case 3:
                MultipleCoursesActivity multipleCoursesActivity3 = (MultipleCoursesActivity) this.f109588b;
                fn0.a aVar3 = (fn0.a) this.f109589c;
                MultipleCoursesActivity.a aVar4 = MultipleCoursesActivity.f33000c;
                a1 a1VarDa5 = multipleCoursesActivity3.da();
                a1VarDa5.getClass();
                a1VarDa5.x4(new n30.j.q(aVar3));
                a1 a1VarDa6 = multipleCoursesActivity3.da();
                a1VarDa6.getClass();
                a1VarDa6.x4(n30.j.b.f123497a);
                return Unit.INSTANCE;
            case 4:
                p51.b bVar2 = (p51.b) this.f109588b;
                lc.y yVar = (lc.y) this.f109589c;
                bVar2.y4(w41.a.g.f181953a);
                yVar.m();
                return Unit.INSTANCE;
            case 5:
                lc.y yVar2 = (lc.y) this.f109588b;
                Activity activity = (Activity) this.f109589c;
                if (!yVar2.n() && activity != null) {
                    activity.finish();
                }
                return Unit.INSTANCE;
            case 6:
                c92.b bVar3 = (c92.b) this.f109588b;
                p1 p1Var = (p1) this.f109589c;
                if ((bVar3 != null ? bVar3.f26055b : null) == c92.a.DELETE) {
                    p1Var.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 7:
                ((e23.l) this.f109588b).invoke((mb0.b) this.f109589c);
                return Unit.INSTANCE;
            case 8:
                ((lc0.f) this.f109588b).f111936a.unregisterReceiver((lc0.e.a) this.f109589c);
                return Unit.INSTANCE;
            case 9:
                Context context = (Context) this.f109588b;
                gf0.a aVar5 = (gf0.a) this.f109589c;
                ht.s sVar = ht.s.f85508a;
                lt.e.b bVar4 = new lt.e.b(lt.e.a.Tapped, o70.b.ECG, null, 4, null);
                sVar.getClass();
                ht.s.a(bVar4);
                EcgDetailActivity.f34869p.getClass();
                context.getClass();
                Intent intent = new Intent(context, (Class<?>) EcgDetailActivity.class);
                intent.putExtra("ACTIVITY_EXTRA", aVar5);
                intent.putExtra("ACTIVITY_ID_EXTRA", aVar5.getDetailId());
                context.startActivity(intent);
                return Unit.INSTANCE;
            case 10:
                ((e23.l) this.f109588b).invoke("EditAddressRoute/" + ((fj2.a) this.f109589c).getAddressId());
                return Unit.INSTANCE;
            case 11:
                com.garmin.device.filetransfer.a aVar6 = (com.garmin.device.filetransfer.a) this.f109588b;
                lk2.c0 c0Var = (lk2.c0) this.f109589c;
                synchronized (aVar6.f50732h) {
                    aVar6.f50732h.remove(c0Var);
                }
                return Unit.INSTANCE;
            case 12:
                il.b bVar5 = (il.b) this.f109588b;
                Context context2 = (Context) this.f109589c;
                ht.s sVar2 = ht.s.f85508a;
                lt.e.k kVar = new lt.e.k(lt.e.a.Tapped, o70.t.f130063g);
                sVar2.getClass();
                ht.s.a(kVar);
                bVar5.e(context2);
                return Unit.INSTANCE;
            case 13:
                ((e23.l) this.f109588b).invoke((zd0.o.a) this.f109589c);
                return Unit.INSTANCE;
            case 14:
                ((lp.j) this.f109588b).f114117a.r((lp.k) this.f109589c);
                return Unit.INSTANCE;
            case 15:
                DeviceSettingsActivity deviceSettingsActivity = (DeviceSettingsActivity) this.f109588b;
                com.garmin.feature.garminpay.ui.devicesettings.a.d dVar = (com.garmin.feature.garminpay.ui.devicesettings.a.d) this.f109589c;
                DeviceSettingsActivity.a aVar7 = DeviceSettingsActivity.f51993w;
                try {
                    bVar = (yo2.b) fs2.a.f(((com.garmin.feature.garminpay.ui.devicesettings.a.d.b) dVar).f52096a.f179658e, yo2.b.class);
                    break;
                } catch (Exception unused) {
                    bVar = null;
                }
                if (bVar != null) {
                    try {
                        pVarR = bVar.getCreditCardLink();
                    } catch (Exception unused2) {
                        pVarR = null;
                    }
                    break;
                } else {
                    pVarR = null;
                }
                String link = pVarR != null ? pVarR.getLink() : null;
                deviceSettingsActivity.getClass();
                androidx.lifecycle.i0 i0VarW = o53.f0.w(deviceSettingsActivity);
                x53.c cVar = o53.s0.f129406a;
                ge1.b.T(i0VarW, u53.o.f168762a, null, new lr2.k(link, deviceSettingsActivity, null), 2);
                return Unit.INSTANCE;
            case 16:
                DeviceSettingsActivity deviceSettingsActivity2 = (DeviceSettingsActivity) this.f109588b;
                String str = (String) this.f109589c;
                DeviceSettingsActivity.a aVar8 = DeviceSettingsActivity.f51993w;
                yr2.a.a(deviceSettingsActivity2, p005kotlin.jvm.internal.s0.f105811a.b(FitPayA2AInstallAppActivity.class), p13.t0.b(new o13.p("app.package.name", str)));
                return Unit.INSTANCE;
            case 17:
                DeviceSettingsActivity deviceSettingsActivity3 = (DeviceSettingsActivity) this.f109588b;
                e23.a aVar9 = (e23.a) this.f109589c;
                mr2.d dVar2 = deviceSettingsActivity3.f51997i;
                if (dVar2 == null) {
                    p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                    throw null;
                }
                if (dVar2.f()) {
                    deviceSettingsActivity3.ia(aVar9);
                } else {
                    br2.c.f19585a.a(new ll0.b(7), deviceSettingsActivity3);
                }
                return Unit.INSTANCE;
            case 18:
                DeviceSettingsActivity deviceSettingsActivity4 = (DeviceSettingsActivity) this.f109588b;
                CardRefundFailedException cardRefundFailedException = (CardRefundFailedException) this.f109589c;
                qy2.d dVar3 = qy2.d.f148594a;
                NewFitPayTransitRefundActivity.a aVar10 = NewFitPayTransitRefundActivity.f51706l;
                String cardName = cardRefundFailedException.getCardName();
                String userId = cardRefundFailedException.getUserId();
                String refundId = cardRefundFailedException.getRefundId();
                aVar10.getClass();
                oc.b.K(deviceSettingsActivity4, dVar3, NewFitPayTransitRefundActivity.a.a(deviceSettingsActivity4, cardName, userId, refundId));
                return Unit.INSTANCE;
            case 19:
                ge1.b.T((o53.b0) this.f109588b, null, null, new ly0.g.b((ly0.o) this.f109589c, null), 3);
                return Unit.INSTANCE;
            case 20:
                m63.b0 b0Var = (m63.b0) this.f109588b;
                String str2 = (String) this.f109589c;
                Object a0Var = b0Var.f116919b;
                if (a0Var == 0) {
                    Enum[] enumArr = b0Var.f116918a;
                    a0Var = new m63.a0(str2, enumArr.length);
                    for (Enum r14 : enumArr) {
                        a0Var.j(r14.name(), false);
                    }
                }
                return a0Var;
            case 21:
                return k63.k.e((String) this.f109588b, k63.m.d.f103256a, new k63.e[0], new kp2.a((m63.f1) this.f109589c, 22));
            case 22:
                ky0.k kVar2 = (ky0.k) this.f109588b;
                ky0.k kVar3 = (ky0.k) this.f109589c;
                kVar2.invoke(null);
                kVar3.invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            case 23:
                List list2 = (List) this.f109588b;
                n1 n1Var = (n1) this.f109589c;
                n1Var.t((n1Var.getIntValue() + 1) % list2.size());
                return Unit.INSTANCE;
            case 24:
                ((fe1.n) this.f109588b).f70563g.i(new o82.a((b63.o) this.f109589c, null, 2, null), true);
                return Unit.INSTANCE;
            case 25:
                e23.l lVar = (e23.l) this.f109588b;
                le2.c cVar2 = (le2.c) this.f109589c;
                if (lVar != null) {
                    lVar.invoke(cVar2.f112058a);
                }
                return Boolean.TRUE;
            case 26:
                w4.a aVar11 = (w4.a) this.f109588b;
                p1 p1Var2 = (p1) this.f109589c;
                w4.b.f181904b.getClass();
                w4.d.f181907a.getClass();
                aVar11.a(w4.d.f181908b);
                p1Var2.setValue(zf2.b.ACTIVITY_SAVED_DIALOG);
                return Unit.INSTANCE;
            case 27:
                mg2.f fVar = (mg2.f) this.f109588b;
                mg2.v vVar = (mg2.v) this.f109589c;
                if (!p005kotlin.jvm.internal.s.g(fVar, vVar.f118429a)) {
                    p13.d0.B(new kp2.a(fVar, 29), vVar.f118430b);
                    o2 o2Var = vVar.f118431c;
                    if (o2Var != null) {
                        o2Var.invalidate();
                    }
                }
                return Unit.INSTANCE;
            case 28:
                mi0.c cVar3 = (mi0.c) this.f109588b;
                String str3 = (String) this.f109589c;
                int i14 = mi0.c.f118707j;
                return new fi0.t(cVar3.f118710b, str3, cVar3.f118709a, 20, cVar3.f118713e);
            default:
                ((e23.l) this.f109588b).invoke(Boolean.valueOf(!((mo.i) this.f109589c).f119863b));
                return Unit.INSTANCE;
        }
    }
}
