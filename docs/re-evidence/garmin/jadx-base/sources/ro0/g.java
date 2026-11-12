package ro0;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import c22.k3;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.device.passcode.DevicePasscodeActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.help.HelpDetailsActivity;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.list.MultiDayActivitiesListActivity;
import com.garmin.android.apps.connectmobile.newsfeed.view.NewsFeedEmptyView;
import com.garmin.android.apps.connectmobile.social.share.UCropImageActivity;
import com.garmin.android.apps.connectmobile.training.CompletedTrainingPlansActivity;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.developer.SnowballUIReviewActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.transitrefund.NewFitPayTransitRefundActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.koin.android.scope.ServiceExtKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.y;
import ps.o0;
import r53.p2;
import s1.a1;
import s1.t1;
import s70.c1;
import s70.g0;
import s70.k0;
import s70.v0;
import sg0.e1;
import sg0.f0;
import sg0.p0;
import sg0.q0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f153765b;

    public /* synthetic */ g(Object obj, int i14) {
        this.f153764a = i14;
        this.f153765b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // e23.a
    public final Object invoke() {
        ?? arrayList;
        ?? r14;
        ArrayList<qs.r> arrayListZ;
        ArrayList arrayListI;
        Object value;
        int i14 = this.f153764a;
        boolean z14 = false;
        Object obj = this.f153765b;
        switch (i14) {
            case 0:
                return HelpActivity.ca((HelpActivity) obj);
            case 1:
                int i15 = HelpDetailsActivity.f36654a;
                ((HelpDetailsActivity) obj).onBackPressed();
                return Unit.INSTANCE;
            case 2:
                UCropImageActivity.a aVar = UCropImageActivity.f44623o;
                return k3.a((UCropImageActivity) obj, "crop_output.png");
            case 3:
                int i16 = SnowballUIReviewActivity.f51313a;
                qy2.a aVar2 = qy2.a.f148592a;
                NewFitPayTransitRefundActivity.f51706l.getClass();
                Intent intentA = NewFitPayTransitRefundActivity.a.a((SnowballUIReviewActivity) obj, "Will be replaced by model annotation", "Will be replaced by model annotation", "Will be replaced by model annotation");
                qy2.a.a(aVar2, intentA, 3);
                PendingIntent activity = PendingIntent.getActivity(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), 0, intentA.setFlags(268435456), 335544320);
                activity.getClass();
                return activity;
            case 4:
                rr.a aVar3 = (rr.a) obj;
                ActivityDetailChartDTO activityDetailChartDTO = aVar3.f154140d;
                if (activityDetailChartDTO == null || (arrayListI = o72.t.I(activityDetailChartDTO, "riderPosition")) == null) {
                    arrayList = j0.f134944a;
                } else {
                    arrayList = new ArrayList(y.r(arrayListI, 10));
                    Iterator it = arrayListI.iterator();
                    while (it.hasNext()) {
                        double dDoubleValue = ((Number) it.next()).doubleValue();
                        qs.r.f147152b.getClass();
                        arrayList.add(qs.r.a.a(dDoubleValue));
                    }
                }
                Iterable iterable = (Iterable) arrayList;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        if (((qs.r) it3.next()) != null) {
                            z14 = true;
                        }
                    }
                }
                new im.u();
                if (z14) {
                    arrayListZ = h0.Z(iterable);
                } else {
                    Object obj2 = aVar3.f154149m;
                    if (obj2 == null) {
                        r14 = obj2;
                        r14 = j0.f134944a;
                    }
                    r14 = obj2;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it4 = r14.iterator();
                    while (it4.hasNext()) {
                        qs.r rVarB = ((o0) it4.next()).b();
                        if (rVarB != null) {
                            arrayList2.add(rVarB);
                        }
                    }
                    arrayListZ = arrayList2;
                }
                bv.b.f21239a.getClass();
                bv.b.a();
                boolean zT = k1.f37122a.t();
                if (!z14 || !zT) {
                    return im.n.SEATED_STANDING;
                }
                if (!arrayListZ.isEmpty()) {
                    for (qs.r rVar : arrayListZ) {
                        rVar.getClass();
                        if (rVar == qs.r.A) {
                            return im.n.AUS;
                        }
                    }
                }
                return im.n.LUS;
            case 5:
                return rs2.b.logger_delegate$lambda$0((rs2.b) obj);
            case 6:
                CompletedTrainingPlansActivity.a aVar4 = CompletedTrainingPlansActivity.f45088h;
                ((CompletedTrainingPlansActivity) obj).da();
                return Unit.INSTANCE;
            case 7:
                MultiDayActivitiesListActivity.a aVar5 = MultiDayActivitiesListActivity.f39318c;
                ((MultiDayActivitiesListActivity) obj).finish();
                return Unit.INSTANCE;
            case 8:
                NewsFeedEmptyView newsFeedEmptyView = (NewsFeedEmptyView) obj;
                View.OnClickListener onClickListener = newsFeedEmptyView.f39539b;
                if (onClickListener != null) {
                    onClickListener.onClick(newsFeedEmptyView);
                }
                return Unit.INSTANCE;
            case 9:
                a1 a1Var = (a1) obj;
                t1 t1Var = a1Var.f155465e;
                a1Var.f155466f = t1Var != null ? t1Var.g() : 0L;
                return Unit.INSTANCE;
            case 10:
                ((t40.a) obj).f162265d.invoke();
                return Unit.INSTANCE;
            case 11:
                n70.t tVar = ((s70.q) obj).f157778a.f194653a;
                p2 p2Var = tVar.f124576c;
                j22.b bVar = j22.b.f96736a;
                Context context = tVar.f124574a;
                bVar.getClass();
                p2Var.k(null, Boolean.valueOf(j22.b.b(context)));
                return Unit.INSTANCE;
            case 12:
                ht.s sVar = ht.s.f85508a;
                lt.e.l lVar = new lt.e.l(lt.e.a.Tapped);
                sVar.getClass();
                ht.s.a(lVar);
                ((g0) obj).f157698a.f194660b.a(o70.f.DEVICE_SYNC.f129989a);
                return Unit.INSTANCE;
            case 13:
                ((k0) obj).f157718a.f194662a.a(o70.f.EMERGENCY_CONTACTS.f129989a);
                return Unit.INSTANCE;
            case 14:
                n70.g gVar = ((v0) obj).f157811a.f194668a;
                Long lR = gVar.r();
                if (lR != null) {
                    gVar.I(lR.longValue());
                }
                ht.a aVar6 = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new o13.p("Screen", "InReachHomeEmergencyContacts"), new o13.p("Action", "Dismiss"));
                aVar6.getClass();
                ht.a.a(bundleA, "UserAction");
                return Unit.INSTANCE;
            case 15:
                ((c1) obj).f157673a.f194676a.a(o70.f.LIVE_TRACK_CONTACTS.f129989a);
                return Unit.INSTANCE;
            case 16:
                return com.garmin.android.apps.ui.catalog.library.help.HelpActivity.K9((com.garmin.android.apps.ui.catalog.library.help.HelpActivity) obj);
            case 17:
                return ServiceExtKt.createServiceScope((Service) obj);
            case 18:
                DevicePasscodeActivity.a aVar7 = DevicePasscodeActivity.f33744a;
                ((DevicePasscodeActivity) obj).displayFailedMessage();
                return Unit.INSTANCE;
            case 19:
                sc.j[] jVarArr = (sc.j[]) obj;
                return new sc.f((sc.j[]) Arrays.copyOf(jVarArr, jVarArr.length));
            case 20:
                return ((hf.j) obj).b();
            case 21:
                sf0.e eVar = (sf0.e) obj;
                sf0.e.b bVar2 = sf0.e.f158826d;
                sf0.j jVar = (sf0.j) eVar.f158829c.getValue();
                String str = eVar.f158828b;
                if (str == null) {
                    p005kotlin.jvm.internal.s.m("dateRequested");
                    throw null;
                }
                jVar.y4(str).m(null);
                eVar.dismiss();
                return Unit.INSTANCE;
            case 22:
                int i17 = sf0.g.f158842w;
                return new iz1.g((sf0.g) obj, 17);
            case 23:
                ((q0) obj).invoke();
                return Unit.INSTANCE;
            case 24:
                p2 p2Var2 = ((f0) obj).f159087f;
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, sg0.u.b((sg0.u) p2Var2.getValue(), null, null, null, null, false, null, false, false, false, null, null, 7935)));
                return Unit.INSTANCE;
            case 25:
                ((q0) obj).invoke();
                return Unit.INSTANCE;
            case 26:
                ((p0) obj).invoke();
                return Unit.INSTANCE;
            case 27:
                ((p0) obj).invoke();
                return Unit.INSTANCE;
            case 28:
                ((nw0.n) obj).invoke();
                return Unit.INSTANCE;
            default:
                ((e1) obj).z4();
                return Unit.INSTANCE;
        }
    }
}
