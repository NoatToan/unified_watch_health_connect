package com.xiaomi.fitness.sport.view.launch;

import androidx.lifecycle.LiveData;
import com.mi.health.utils.AmapLocation;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fitness.sport.view.launch.LaunchSportActivity$locationCallback$1;
import com.xiaomi.fitness.sport.view.launch.adapter.LaunchSportAdapter;
import com.xiaomi.fitness.sport.view.route.RunningRouteListBean;
import defpackage.bxa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/xiaomi/fitness/sport/view/launch/LaunchSportActivity$locationCallback$1", "Lcom/mi/health/utils/AmapLocation$ILocationListener;", "onLocationCallback", "", "location", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LaunchSportActivity$locationCallback$1 implements AmapLocation.ILocationListener {
    final /* synthetic */ LaunchSportActivity this$0;

    public LaunchSportActivity$locationCallback$1(LaunchSportActivity launchSportActivity) {
        this.this$0 = launchSportActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLocationCallback$lambda$2(LaunchSportActivity this$0, RunningRouteListBean runningRouteListBean) {
        LaunchSportAdapter launchSportAdapter;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (runningRouteListBean != null && runningRouteListBean.getRoute_Info_list() != null && (launchSportAdapter = this$0.launchAdapter) != null) {
            launchSportAdapter.setRouteData(runningRouteListBean);
        }
        return Unit.INSTANCE;
    }

    @Override // com.mi.health.utils.AmapLocation.ILocationListener
    public void onLocationCallback(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        double[] dArrB = bxa.b(location.latitude, location.longitude);
        Location location2 = new Location();
        location2.latitude = dArrB[0];
        location2.longitude = dArrB[1];
        LiveData<RunningRouteListBean> routeList = LaunchSportActivity.access$getMViewModel(this.this$0).getRouteList(location2);
        final LaunchSportActivity launchSportActivity = this.this$0;
        routeList.observe(launchSportActivity, new LaunchSportActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: m3e
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LaunchSportActivity$locationCallback$1.onLocationCallback$lambda$2(launchSportActivity, (RunningRouteListBean) obj);
            }
        }));
    }
}
