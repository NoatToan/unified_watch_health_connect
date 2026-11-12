package com.huawei.health.sportservice.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.healthcloud.plugintrack.manager.inteface.ITrackPointDataUpdater;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.gzx;
import defpackage.hau;
import defpackage.hbv;
import defpackage.ive;
import defpackage.ixu;
import defpackage.xjy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.POINT_DATA_MANAGER)
public class PointDataManager implements ManagerComponent {
    private static final String TAG = "SportService_PointDataManager";
    private PluginSportTrackAdapter mPluginTrackAdapter;
    private xjy mTreadmillStepPointData;
    private final ixu mTrackPointDataUtils = new ixu();
    private int mSportType = 0;
    private final hau mSportCallbackOption = new hau();
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private ITrackPointDataUpdater mTrackPointDataUpdater = new ITrackPointDataUpdater() { // from class: com.huawei.health.sportservice.manager.PointDataManager.1
        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITrackPointDataUpdater
        public float getActiveCalorie() {
            int iIntValue;
            Object data = BaseSportManager.getInstance().getData("ACTIVE_CALORIES_DATA");
            if ((data instanceof Integer) && (iIntValue = ((Integer) data).intValue()) > 0) {
                return (iIntValue * 1.0f) / 1000.0f;
            }
            Object data2 = BaseSportManager.getInstance().getData("CALORIES_DATA");
            if (gzx.e(data2)) {
                return ((Integer) data2).intValue();
            }
            return 0.0f;
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITrackPointDataUpdater
        public float getDistance() {
            Object data = BaseSportManager.getInstance().getData("DISTANCE_DATA");
            if (gzx.e(data)) {
                return ((Integer) data).intValue();
            }
            return 0.0f;
        }
    };

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void init() {
        LogUtil.a(TAG, "init()");
        if (this.mPluginTrackAdapter == null) {
            this.mPluginTrackAdapter = ive.c().a();
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        int sportType = BaseSportManager.getInstance().getSportType();
        this.mSportType = sportType;
        if (!hbv.c(sportType)) {
            LogUtil.j(TAG, "onPreSport() is not need step");
            return;
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add("TIME_ONE_SECOND_DURATION");
        arrayList.add("STEP_DATA");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, new SportDataNotify() { // from class: com.huawei.health.sportservice.manager.PointDataManager$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1187xc3030c1d(list, map);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onPreSport$0$com-huawei-health-sportservice-manager-PointDataManager, reason: not valid java name */
    /* synthetic */ void m1187xc3030c1d(List list, Map map) {
        if (list.contains("TIME_ONE_SECOND_DURATION")) {
            updateStepValue(((Integer) map.get("STEP_DATA")).intValue());
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        LogUtil.a(TAG, "onStartSport()");
        this.mTrackPointDataUtils.d(BaseApplication.b(), false);
        this.mTrackPointDataUtils.e(this.mTrackPointDataUpdater);
        if (hbv.c(this.mSportType)) {
            LogUtil.a(TAG, "onStartSport() startStepPointData()");
            startStepPointData(BaseApplication.b());
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        LogUtil.a(TAG, "onStopSport()");
        this.mTrackPointDataUtils.d();
        if (hbv.c(this.mSportType)) {
            stopStepPointData();
        }
        if (this.mPluginTrackAdapter != null) {
            LogUtil.a(TAG, "onStopSport() saveTrackPointData");
            this.mPluginTrackAdapter.saveTrackPointData(this.mTrackPointDataUtils.e(), BaseSportManager.getInstance().getSportType());
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        LogUtil.a(TAG, "destroy()");
        this.mTrackPointDataUtils.b();
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }

    private void updateStepValue(int i) {
        xjy xjyVar = this.mTreadmillStepPointData;
        if (xjyVar != null) {
            xjyVar.b(System.currentTimeMillis(), i);
        }
    }

    private void stopStepPointData() {
        xjy xjyVar = this.mTreadmillStepPointData;
        if (xjyVar != null) {
            xjyVar.b(System.currentTimeMillis());
        }
    }

    private void startStepPointData(final Context context) {
        LogUtil.a(TAG, "startStepPointData");
        this.mHandler.post(new Runnable() { // from class: com.huawei.health.sportservice.manager.PointDataManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1188xe645e23a(context);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$startStepPointData$1$com-huawei-health-sportservice-manager-PointDataManager, reason: not valid java name */
    /* synthetic */ void m1188xe645e23a(Context context) {
        xjy xjyVar = new xjy();
        this.mTreadmillStepPointData = xjyVar;
        xjyVar.c(context, System.currentTimeMillis());
        LogUtil.a(TAG, "startStepPointData end");
    }
}
