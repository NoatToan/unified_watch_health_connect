package com.xiaomi.hm.health.devicex.proxy.basic;

import android.content.Context;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.SensorHubControllerApi;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.device.callback.MyRealtimeStepCallback;
import com.xiaomi.hm.health.sensorhub.SensorHubController;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/basic/SensorHubControllerImpl;", "Lcom/huami/devicex/injection/SensorHubControllerApi;", "", "destroy", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/device/callback/MyRealtimeStepCallback;", "myRealtimeStepCallback", "create", "", "isSupportSensorHub", "Lcom/xiaomi/hm/health/bt/profile/base/RealtimeStep;", "getRealtimeStep", "Ljava/util/Calendar;", "deviceSyncTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/IHMActivityDataCallback;", "myActivityDataSyncCallback", "syncSensorHubData", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SensorHubControllerImpl implements SensorHubControllerApi {
    @Override // com.huami.devicex.injection.SensorHubControllerApi
    public void create(@NotNull Context context, @NotNull MyRealtimeStepCallback myRealtimeStepCallback) {
        SensorHubController.create(context, myRealtimeStepCallback);
    }

    @Override // com.huami.devicex.injection.SensorHubControllerApi
    public void destroy() {
        SensorHubController.destroy();
    }

    @Override // com.huami.devicex.injection.SensorHubControllerApi
    @NotNull
    public RealtimeStep getRealtimeStep() {
        return SensorHubController.getInstance().getRealtimeStep();
    }

    @Override // com.huami.devicex.injection.SensorHubControllerApi
    public boolean isSupportSensorHub() {
        return SensorHubController.isSupportSensorHub(DeviceXFunctionsKt.getContext());
    }

    @Override // com.huami.devicex.injection.SensorHubControllerApi
    public void syncSensorHubData(@NotNull Calendar deviceSyncTime, @NotNull IHMActivityDataCallback myActivityDataSyncCallback) {
        SensorHubController.getInstance().syncSensorHubData(deviceSyncTime, myActivityDataSyncCallback);
    }
}
