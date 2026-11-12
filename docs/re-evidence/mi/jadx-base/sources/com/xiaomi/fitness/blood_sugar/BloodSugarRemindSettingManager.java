package com.xiaomi.fitness.blood_sugar;

import android.content.Context;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \"2\u00020\u0001:\u0001\"J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0002\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH&¢\u0006\u0002\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH&¢\u0006\u0002\u0010\u001dJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH&¢\u0006\u0002\u0010\u001dJ\u0017\u0010 \u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH&¢\u0006\u0002\u0010\u001dJ\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/BloodSugarRemindSettingManager;", "", "getBloodSugarRemindSettingFromLocal", "Lcom/xiaomi/fitness/blood_sugar/BloodSugarRemindSettingModel;", "updateBloodSugarRemindSettingToLocal", "", "bloodSugarRemindSettingModel", "goBloodSugarDeviceSettingsPage", "context", "Landroid/content/Context;", "isDeviceTimeExpire", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "isDeviceTimeExpireOneDay", "isDeviceTimeExpireOneHour", "isDeviceInConnectTime", "isDeviceInReactiveTime", "isDeviceInitDone", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Ljava/lang/Boolean;", "isDeviceToInitDoneTime", "", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Ljava/lang/Integer;", "registerBloodSugarTimeChangeReceive", "unregisterBloodSugarTimeChangeReceive", Constants.KEY_EXPIRED_TIME, "", "deviceTime", "Lcom/xiaomi/fitness/blood_sugar/DeviceTime;", "(Lcom/xiaomi/fitness/blood_sugar/DeviceTime;)Ljava/lang/Long;", "expireOneDayTime", "expireOneHourTime", "expireInitDoneTime", "isSugarDadaSyncDone", "Companion", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BloodSugarRemindSettingManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/BloodSugarRemindSettingManager$Companion;", "", "<init>", "()V", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Nullable
    Long expireInitDoneTime(@NotNull DeviceTime deviceTime);

    @Nullable
    Long expireOneDayTime(@NotNull DeviceTime deviceTime);

    @Nullable
    Long expireOneHourTime(@NotNull DeviceTime deviceTime);

    @Nullable
    Long expireTime(@NotNull DeviceTime deviceTime);

    @NotNull
    BloodSugarRemindSettingModel getBloodSugarRemindSettingFromLocal();

    void goBloodSugarDeviceSettingsPage(@NotNull Context context);

    boolean isDeviceInConnectTime(@NotNull WearableDeviceModel deviceModel);

    boolean isDeviceInReactiveTime(@NotNull WearableDeviceModel deviceModel);

    @Nullable
    Boolean isDeviceInitDone(@NotNull WearableDeviceModel deviceModel);

    boolean isDeviceTimeExpire(@NotNull WearableDeviceModel deviceModel);

    boolean isDeviceTimeExpireOneDay(@NotNull WearableDeviceModel deviceModel);

    boolean isDeviceTimeExpireOneHour(@NotNull WearableDeviceModel deviceModel);

    @Nullable
    Integer isDeviceToInitDoneTime(@NotNull WearableDeviceModel deviceModel);

    boolean isSugarDadaSyncDone(@NotNull WearableDeviceModel deviceModel);

    void registerBloodSugarTimeChangeReceive(@NotNull Context context);

    void unregisterBloodSugarTimeChangeReceive(@NotNull Context context);

    void updateBloodSugarRemindSettingToLocal(@NotNull BloodSugarRemindSettingModel bloodSugarRemindSettingModel);
}
