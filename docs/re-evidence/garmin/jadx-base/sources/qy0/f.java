package qy0;

import am.x0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity.c;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity.d;
import e23.l;
import k30.o;
import o53.f0;
import p005kotlin.Unit;
import r53.p2;
import sy0.m;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiDayActivitiesEditActivity f148485b;

    public /* synthetic */ f(MultiDayActivitiesEditActivity multiDayActivitiesEditActivity, int i14) {
        this.f148484a = i14;
        this.f148485b = multiDayActivitiesEditActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        int i14 = this.f148484a;
        MultiDayActivitiesEditActivity multiDayActivitiesEditActivity = this.f148485b;
        switch (i14) {
            case 0:
                String str = (String) obj;
                MultiDayActivitiesEditActivity.a aVar = MultiDayActivitiesEditActivity.f39291b;
                str.getClass();
                multiDayActivitiesEditActivity.ca().e2(str);
                break;
            case 1:
                MultiDayActivitiesEditActivity.a aVar2 = MultiDayActivitiesEditActivity.f39291b;
                multiDayActivitiesEditActivity.ca().N3((Long) obj);
                multiDayActivitiesEditActivity.ca().N2();
                p2 p2Var = multiDayActivitiesEditActivity.ca().f101750i;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, sy0.b.a((sy0.b) value, null, 7)));
                ge1.b.T(f0.w(multiDayActivitiesEditActivity), null, null, multiDayActivitiesEditActivity.new c(null), 3);
                break;
            case 2:
                MultiDayActivitiesEditActivity.a aVar3 = MultiDayActivitiesEditActivity.f39291b;
                multiDayActivitiesEditActivity.ca().n3((Long) obj);
                multiDayActivitiesEditActivity.ca().N2();
                p2 p2Var2 = multiDayActivitiesEditActivity.ca().f101750i;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, sy0.b.a((sy0.b) value2, null, 7)));
                ge1.b.T(f0.w(multiDayActivitiesEditActivity), null, null, multiDayActivitiesEditActivity.new d(null), 3);
                break;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MultiDayActivitiesEditActivity.a aVar4 = MultiDayActivitiesEditActivity.f39291b;
                multiDayActivitiesEditActivity.ca().E1(zBooleanValue);
                break;
            case 4:
                x0 x0Var = (x0) obj;
                MultiDayActivitiesEditActivity.a aVar5 = MultiDayActivitiesEditActivity.f39291b;
                x0Var.getClass();
                multiDayActivitiesEditActivity.ca().D0(x0Var);
                break;
            case 5:
                MultiDayActivitiesEditActivity.a aVar6 = MultiDayActivitiesEditActivity.f39291b;
                multiDayActivitiesEditActivity.ca().u3((sy0.f) obj);
                break;
            case 6:
                m mVar = (m) obj;
                MultiDayActivitiesEditActivity.a aVar7 = MultiDayActivitiesEditActivity.f39291b;
                mVar.getClass();
                multiDayActivitiesEditActivity.ca().Q1(mVar);
                break;
            case 7:
                k30.m mVar2 = (k30.m) obj;
                MultiDayActivitiesEditActivity.a aVar8 = MultiDayActivitiesEditActivity.f39291b;
                mVar2.getClass();
                multiDayActivitiesEditActivity.ca().b0(mVar2);
                break;
            case 8:
                i53.c<o> cVar = (i53.c) obj;
                MultiDayActivitiesEditActivity.a aVar9 = MultiDayActivitiesEditActivity.f39291b;
                cVar.getClass();
                multiDayActivitiesEditActivity.ca().D1(cVar);
                break;
            case 9:
                ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj;
                MultiDayActivitiesEditActivity.a aVar10 = MultiDayActivitiesEditActivity.f39291b;
                activityListItemDTO.getClass();
                multiDayActivitiesEditActivity.ca().w4(activityListItemDTO);
                break;
            default:
                x0 x0Var2 = (x0) obj;
                MultiDayActivitiesEditActivity.a aVar11 = MultiDayActivitiesEditActivity.f39291b;
                x0Var2.getClass();
                multiDayActivitiesEditActivity.ca().D0(x0Var2);
                break;
        }
        return Unit.INSTANCE;
    }
}
