package sa1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.powerguide.PowerGuideListActivity;
import com.garmin.android.apps.connectmobile.powerguide.create.SelectCourseOrEventActivity;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PowerGuideListActivity f158281b;

    public /* synthetic */ k(PowerGuideListActivity powerGuideListActivity, int i14) {
        this.f158280a = i14;
        this.f158281b = powerGuideListActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f158280a;
        PowerGuideListActivity powerGuideListActivity = this.f158281b;
        switch (i14) {
            case 0:
                g3 g3Var = (g3) obj;
                int i15 = PowerGuideListActivity.f40349k;
                if (g3Var != null) {
                    int i16 = PowerGuideListActivity.b.f40356a[g3Var.f35300a.ordinal()];
                    if (i16 == 1) {
                        powerGuideListActivity.showProgressOverlay();
                        powerGuideListActivity.ca();
                    } else if (i16 == 2) {
                        powerGuideListActivity.hideProgressOverlay();
                        List<ab1.g> list = (List) g3Var.f35301b;
                        powerGuideListActivity.f40354i = list;
                        if (list == null || list.isEmpty()) {
                            com.garmin.android.apps.connectmobile.powerguide.a aVar = powerGuideListActivity.f40351f;
                            if (aVar == null) {
                                p005kotlin.jvm.internal.s.m("adapter");
                                throw null;
                            }
                            aVar.r(p13.w.c(ab1.o.a.f2619a));
                        } else {
                            List<ab1.g> list2 = powerGuideListActivity.f40354i;
                            if (list2 != null) {
                                com.garmin.android.apps.connectmobile.powerguide.a aVar2 = powerGuideListActivity.f40351f;
                                if (aVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("adapter");
                                    throw null;
                                }
                                ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
                                for (ab1.g gVar : list2) {
                                    gVar.getClass();
                                    Long l14 = gVar.f2568a;
                                    long jLongValue = l14 != null ? l14.longValue() : 0L;
                                    Long l15 = gVar.f2570c;
                                    long jLongValue2 = l15 != null ? l15.longValue() : 0L;
                                    String str = gVar.f2569b;
                                    if (str == null) {
                                        str = "";
                                    }
                                    ab1.p pVar = gVar.f2587v;
                                    Long l16 = gVar.f2585r;
                                    Float f14 = gVar.f2579l;
                                    float fFloatValue = 0.0f;
                                    float fFloatValue2 = f14 != null ? f14.floatValue() : 0.0f;
                                    Float f15 = gVar.f2580m;
                                    if (f15 != null) {
                                        fFloatValue = f15.floatValue();
                                    }
                                    arrayList.add(new ab1.o.c(jLongValue, jLongValue2, str, pVar, l16, new j23.e(fFloatValue2, fFloatValue), gVar.f2584q));
                                }
                                aVar2.r(arrayList);
                            }
                        }
                    } else {
                        if (i16 != 3) {
                            u0.r();
                            return null;
                        }
                        powerGuideListActivity.hideProgressOverlay();
                        powerGuideListActivity.displayFailedMessage();
                        com.garmin.android.apps.connectmobile.powerguide.a aVar3 = powerGuideListActivity.f40351f;
                        if (aVar3 == null) {
                            p005kotlin.jvm.internal.s.m("adapter");
                            throw null;
                        }
                        aVar3.r(p13.w.c(ab1.o.b.f2620a));
                    }
                }
                return Unit.INSTANCE;
            default:
                g3 g3Var2 = (g3) obj;
                int i17 = PowerGuideListActivity.f40349k;
                if (g3Var2 != null) {
                    int i18 = PowerGuideListActivity.b.f40356a[g3Var2.f35300a.ordinal()];
                    if (i18 == 1) {
                        powerGuideListActivity.showProgressOverlay();
                    } else if (i18 == 2) {
                        powerGuideListActivity.hideProgressOverlay();
                        List list3 = (List) g3Var2.f35301b;
                        ArrayList<? extends Parcelable> arrayList2 = list3 != null ? new ArrayList<>(list3) : null;
                        if (arrayList2 == null || arrayList2.isEmpty()) {
                            powerGuideListActivity.f40353h.p(powerGuideListActivity, (ArrayList) powerGuideListActivity.f40354i);
                        } else {
                            SelectCourseOrEventActivity.a aVar4 = SelectCourseOrEventActivity.f40383a;
                            ArrayList<? extends Parcelable> arrayList3 = (ArrayList) powerGuideListActivity.f40354i;
                            aVar4.getClass();
                            Intent intent = new Intent(powerGuideListActivity, (Class<?>) SelectCourseOrEventActivity.class);
                            Bundle bundle = new Bundle(2);
                            bundle.putParcelableArrayList("GCM_extra_power_guide_list", arrayList3);
                            bundle.putParcelableArrayList("GCM_extra_events_for_power_guide", arrayList2);
                            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
                            powerGuideListActivity.startActivityForResult(intent, 234);
                        }
                    } else {
                        if (i18 != 3) {
                            u0.r();
                            return null;
                        }
                        powerGuideListActivity.hideProgressOverlay();
                        powerGuideListActivity.displayFailedMessage();
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
