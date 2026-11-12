package com.huawei.health.sportservice.manager;

import android.content.Context;
import android.os.Bundle;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.healthcloud.plugintrack.notification.HealthSportingNotificationHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.hau;
import defpackage.hbv;
import defpackage.izn;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.NOTIFICATION_MANAGER)
public class NotificationManager implements ManagerComponent {
    public static final float SPEED_HUNDRED_TRANSFER = 100.0f;
    private static final String TAG = "SportService_NotificationManager";
    public static final float TOTAL_DISTANCE_KILO_TRANSFER = 1000.0f;
    private static final int TRANSFER = 3600;
    private Context mContext;
    private int mSportType = 0;
    private HealthSportingNotificationHelper mSportingNotification = null;
    private hau mSportCallbackOption = new hau();

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        LogUtil.a(TAG, "onPreSport()");
        this.mContext = BaseApplication.b();
        this.mSportType = BaseSportManager.getInstance().getSportType();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        LogUtil.a(TAG, "onStartSport()");
        HealthSportingNotificationHelper healthSportingNotificationHelper = new HealthSportingNotificationHelper(this.mContext, this.mSportType, true, true, true);
        this.mSportingNotification = healthSportingNotificationHelper;
        healthSportingNotificationHelper.e(BaseSportManager.getInstance().getDataSource() == 100);
        this.mSportingNotification.a(BaseSportManager.getInstance().getDataSource() == 100);
        ArrayList arrayList = new ArrayList();
        arrayList.add("TIME_ONE_SECOND_DURATION");
        arrayList.add("UPDATE_VIEW_SIGNAL");
        arrayList.add("DISTANCE_DATA");
        arrayList.add("SPEED_DATA");
        arrayList.add("PACE_DATA");
        arrayList.add("HEART_RATE_DATA");
        arrayList.add("CALORIES_DATA");
        if (isSkip()) {
            arrayList.add("SKIP_NUM_DATA");
            arrayList.add("SKIPPING_AVG_SPEED_DATA");
        }
        arrayList.add("PADDLE_DATA");
        arrayList.add("WEIGHT_DATA");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, getSportDataNotify());
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void setParas(SportParamsType sportParamsType, Object obj) {
        if (SportParamsType.SPORT_LAUNCH_PARAS.equals(sportParamsType) && (obj instanceof SportLaunchParams) && this.mSportingNotification != null && ScreenUtil.d()) {
            LogUtil.a(TAG, "SPORT_LAUNCH_PARAS change, updateCurrentNotification");
            this.mSportingNotification.g();
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public boolean supportParas(SportParamsType sportParamsType) {
        return SportParamsType.SPORT_LAUNCH_PARAS.equals(sportParamsType);
    }

    private SportDataNotify getSportDataNotify() {
        return new SportDataNotify() { // from class: com.huawei.health.sportservice.manager.NotificationManager$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1186xd13fc717(list, map);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$getSportDataNotify$0$com-huawei-health-sportservice-manager-NotificationManager, reason: not valid java name */
    /* synthetic */ void m1186xd13fc717(List list, Map map) {
        String strValueOf;
        if (list.contains("TIME_ONE_SECOND_DURATION") || list.contains("UPDATE_VIEW_SIGNAL")) {
            LogUtil.a(TAG, "tagList: ", list, ", sportDataMap: ", map);
            long jLongValue = ((Long) map.get("TIME_ONE_SECOND_DURATION")).longValue();
            int iIntValue = ((Integer) map.get("DISTANCE_DATA")).intValue();
            int iIntValue2 = ((Integer) map.get("SPEED_DATA")).intValue();
            int iIntValue3 = ((Integer) map.get("PACE_DATA")).intValue();
            int iIntValue4 = ((Integer) map.get("HEART_RATE_DATA")).intValue();
            int iIntValue5 = ((Integer) map.get("CALORIES_DATA")).intValue();
            Bundle bundle = new Bundle();
            bundle.putString("duration", String.valueOf(UnitUtil.e(((int) jLongValue) / 1000)));
            bundle.putString("distance", getTotalDistance(iIntValue));
            bundle.putString("speed", getSpeedForNotify(iIntValue2));
            bundle.putString("pace", getPaceForNotify(iIntValue3, iIntValue2));
            bundle.putInt(BleConstants.SPORT_TYPE, this.mSportType);
            bundle.putString(IndoorEquipManagerApi.KEY_HEART_RATE, getHeartRate(iIntValue4));
            bundle.putString("calorie", String.valueOf(iIntValue5));
            if (isSkip()) {
                int iIntValue6 = ((Integer) map.get("SKIP_NUM_DATA")).intValue();
                int iIntValue7 = ((Integer) map.get("SKIPPING_AVG_SPEED_DATA")).intValue();
                if (iIntValue7 == -1) {
                    strValueOf = izn.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
                } else {
                    strValueOf = String.valueOf(iIntValue7);
                }
                bundle.putString("skippingSpeed", strValueOf);
                bundle.putString("skippingNum", String.valueOf(iIntValue6));
            }
            if (BaseSportManager.getInstance().getSportMode().equals("291")) {
                bundle.putInt("rowerWeight", getIntegerValue(map.get("WEIGHT_DATA")));
                bundle.putInt("rowerTimes", getIntegerValue(map.get("PADDLE_DATA")));
                bundle.putBoolean("rowerStrength", true);
            }
            if (this.mSportingNotification == null || !ScreenUtil.d()) {
                return;
            }
            LogUtil.a(TAG, "mSportingNotification.updateSportViewFragment()");
            this.mSportingNotification.updateSportViewFragment(bundle);
        }
    }

    private String getHeartRate(int i) {
        if (hbv.b(i)) {
            return String.valueOf(i);
        }
        return "";
    }

    private int getIntegerValue(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    private String getTotalDistance(int i) {
        if (UnitUtil.f()) {
            return String.valueOf(UnitUtil.e(i / 1000.0f, 3));
        }
        return String.valueOf(i / 1000.0f);
    }

    private String getSpeedForNotify(int i) {
        int i2 = BaseSportManager.getInstance().getDataSource() == 100 ? 2 : 1;
        if (UnitUtil.f()) {
            return UnitUtil.e(UnitUtil.e(i / 100.0f, 3), 1, i2);
        }
        return UnitUtil.e(i / 100.0f, 1, i2);
    }

    private String getPaceForNotify(int i, int i2) {
        if (this.mSportType == 274 || isPaceFromWear()) {
            return String.valueOf(i);
        }
        if (i2 != 0) {
            if (UnitUtil.f()) {
                return String.valueOf(3600.0d / UnitUtil.e(i2 / 100.0f, 3));
            }
            return String.valueOf(3600.0f / (i2 / 100.0f));
        }
        return String.valueOf(0);
    }

    private boolean isPaceFromWear() {
        if (BaseSportManager.getInstance().getDataSource() != 100) {
            return false;
        }
        int i = this.mSportType;
        return i == 258 || i == 264 || i == 257 || i == 281;
    }

    private boolean isSkip() {
        return this.mSportType == 283;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        LogUtil.a(TAG, "onStopSport()");
        if (this.mSportingNotification != null) {
            LogUtil.a(TAG, "onStopSport() mSportingNotification.closeNotification()");
            this.mSportingNotification.e();
            this.mSportingNotification = null;
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        LogUtil.a(TAG, "destroy()");
        if (this.mSportingNotification != null) {
            LogUtil.a(TAG, "destroy() mSportingNotification.closeNotification()");
            this.mSportingNotification.e();
            this.mSportingNotification = null;
        }
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }
}
