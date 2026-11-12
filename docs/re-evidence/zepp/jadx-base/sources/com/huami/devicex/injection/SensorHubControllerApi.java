package com.huami.devicex.injection;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.device.callback.MyRealtimeStepCallback;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u000bH&J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0012"}, d2 = {"Lcom/huami/devicex/injection/SensorHubControllerApi;", "", "", "destroy", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/device/callback/MyRealtimeStepCallback;", "myRealtimeStepCallback", "create", "", "isSupportSensorHub", "Lcom/xiaomi/hm/health/bt/profile/base/RealtimeStep;", "getRealtimeStep", "Ljava/util/Calendar;", "deviceSyncTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/IHMActivityDataCallback;", "myActivityDataSyncCallback", "syncSensorHubData", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface SensorHubControllerApi {
    void create(@NotNull Context context, @NotNull MyRealtimeStepCallback myRealtimeStepCallback);

    void destroy();

    @NotNull
    RealtimeStep getRealtimeStep();

    boolean isSupportSensorHub();

    void syncSensorHubData(@NotNull Calendar deviceSyncTime, @NotNull IHMActivityDataCallback myActivityDataSyncCallback);
}
