package com.xiaomi.fitness.electronic.scale.export;

import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\bf\u0018\u0000 $2\u00020\u0001:\u0001$J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&JH\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0007H&J@\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J(\u0010!\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\"\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleCMDHelper;", "", "getDeviceBattery", "", "did", "", "onSyncCallback", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "getWifiStatus", "getHistoryData", "syncBindUer", "syncMainUserInfo", "isSync", "", "getUserList", "updateVirtualUserToDevice", "miID", "userId", "deviceId", "userWeight", "", "userSex", "userAge", "userHeight", "updateShareUserToDevice", "", "addOrUpdateMainUser", "age", "sex", "height", "weight", "", "bindUser", "delVirtualUserToDevice", "delSharedMember", "restoreFactory", "Companion", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ElectronicScaleCMDHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleCMDHelper$Companion;", "", "<init>", "()V", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void restoreFactory$default(ElectronicScaleCMDHelper electronicScaleCMDHelper, String str, OnEcoSyncCallback onEcoSyncCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: restoreFactory");
            }
            if ((i & 2) != 0) {
                onEcoSyncCallback = null;
            }
            electronicScaleCMDHelper.restoreFactory(str, onEcoSyncCallback);
        }
    }

    void addOrUpdateMainUser(@NotNull String miID, int age, int sex, int height, float weight, @NotNull String did, @NotNull OnEcoSyncCallback onSyncCallback);

    void bindUser(@NotNull String did, @NotNull OnEcoSyncCallback onSyncCallback);

    void delSharedMember(long userId, @NotNull String deviceId, @NotNull OnEcoSyncCallback onSyncCallback);

    void delVirtualUserToDevice(@NotNull String miID, long userId, @NotNull String deviceId, @NotNull OnEcoSyncCallback onSyncCallback);

    void getDeviceBattery(@NotNull String did, @NotNull OnEcoSyncCallback onSyncCallback);

    void getHistoryData(@NotNull String did, @NotNull OnEcoSyncCallback onSyncCallback);

    void getUserList(@NotNull String did);

    void getWifiStatus(@NotNull String did, @NotNull OnEcoSyncCallback onSyncCallback);

    void restoreFactory(@NotNull String did, @Nullable OnEcoSyncCallback onSyncCallback);

    void syncBindUer(@Nullable String did);

    void syncMainUserInfo(boolean isSync);

    void updateShareUserToDevice(@NotNull String deviceId, long miID, @NotNull OnEcoSyncCallback onSyncCallback);

    void updateVirtualUserToDevice(@NotNull String miID, @NotNull String userId, @NotNull String deviceId, int userWeight, int userSex, int userAge, int userHeight, @NotNull OnEcoSyncCallback onSyncCallback);
}
