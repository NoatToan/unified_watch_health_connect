package com.xiaomi.fitness.settingitem;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import defpackage.vbq;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0010\b&\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b,\u0010\u001cJ-\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H$¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J-\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0010J%\u0010\u0017\u001a\u00020\b2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001d\u0010\u001cR\"\u0010\u001f\u001a\u00020\u001e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'\"\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/settingitem/BaseSettingRequestHelper;", "", "", "deviceModelDid", "", "isHuamiDevice", "Lvbq;", "callBack", "", "doUpdateSettings", "(Ljava/lang/String;ZLvbq;)V", "tryUpdateSettingInfo", "(Lvbq;)V", "Lcom/xiaomi/fitness/settingitem/db/entity/SettingItemEntity;", "itemInfo", "uploadBigSettingItem", "(Lcom/xiaomi/fitness/settingitem/db/entity/SettingItemEntity;)V", "uploadSmallSettingItems", "did", "Ljava/util/HashMap;", "maps", "(Ljava/lang/String;Ljava/util/HashMap;)V", "uploadUserSettingItem", "uploadUserSettingItems", "(Ljava/util/HashMap;)V", "resetOnDeviceRemove", "(Ljava/lang/String;)V", "destroy", "()V", "reset", "", DeviceSettingConfigKey.KEY_CHOISE_LAST_UPDATE_TIME, "J", "getLastUpdateTime", "()J", "setLastUpdateTime", "(J)V", "isUpdating", "Z", "()Z", "setUpdating", "(Z)V", "lastDid", "Ljava/lang/String;", "<init>", "Companion", "settingitem_release"}, k = 1, mv = {2, 0, 0})
public abstract class BaseSettingRequestHelper {

    @NotNull
    public static final String TAG = "[DeviceSetting]";
    public static final int UPDATE_SETTING_INTERVAL = 14400000;
    private boolean isUpdating;

    @Nullable
    private String lastDid;
    private long lastUpdateTime;

    public static /* synthetic */ void doUpdateSettings$default(BaseSettingRequestHelper baseSettingRequestHelper, String str, boolean z, vbq vbqVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doUpdateSettings");
        }
        if ((i & 4) != 0) {
            vbqVar = null;
        }
        baseSettingRequestHelper.doUpdateSettings(str, z, vbqVar);
    }

    public static /* synthetic */ void tryUpdateSettingInfo$default(BaseSettingRequestHelper baseSettingRequestHelper, vbq vbqVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryUpdateSettingInfo");
        }
        if ((i & 1) != 0) {
            vbqVar = null;
        }
        baseSettingRequestHelper.tryUpdateSettingInfo(vbqVar);
    }

    public void destroy() {
        reset();
    }

    public abstract void doUpdateSettings(@Nullable String deviceModelDid, boolean isHuamiDevice, @Nullable vbq callBack);

    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /* JADX INFO: renamed from: isUpdating, reason: from getter */
    public final boolean getIsUpdating() {
        return this.isUpdating;
    }

    public void reset() {
        this.lastUpdateTime = 0L;
        this.isUpdating = false;
    }

    public final void resetOnDeviceRemove(@Nullable String did) {
        if (did != null && Intrinsics.areEqual(did, this.lastDid)) {
            this.lastDid = null;
            reset();
        }
    }

    public final void setLastUpdateTime(long j) {
        this.lastUpdateTime = j;
    }

    public final void setUpdating(boolean z) {
        this.isUpdating = z;
    }

    public final void tryUpdateSettingInfo(@Nullable vbq callBack) {
        tryUpdateSettingInfo(null, false, callBack);
    }

    public void uploadBigSettingItem(@NotNull SettingItemEntity itemInfo) {
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
    }

    public void uploadSmallSettingItems(@NotNull SettingItemEntity itemInfo) {
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
    }

    public void uploadUserSettingItem(@NotNull SettingItemEntity itemInfo) {
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
    }

    public void uploadUserSettingItems(@NotNull HashMap<String, String> maps) {
        Intrinsics.checkNotNullParameter(maps, "maps");
    }

    public void uploadSmallSettingItems(@NotNull String did, @NotNull HashMap<String, String> maps) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(maps, "maps");
    }

    public static /* synthetic */ void tryUpdateSettingInfo$default(BaseSettingRequestHelper baseSettingRequestHelper, String str, boolean z, vbq vbqVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryUpdateSettingInfo");
        }
        if ((i & 4) != 0) {
            vbqVar = null;
        }
        baseSettingRequestHelper.tryUpdateSettingInfo(str, z, vbqVar);
    }

    public void tryUpdateSettingInfo(@Nullable String deviceModelDid, boolean isHuamiDevice, @Nullable vbq callBack) {
        if (deviceModelDid != null && !Intrinsics.areEqual(deviceModelDid, this.lastDid)) {
            this.lastDid = deviceModelDid;
            reset();
        }
        if (System.currentTimeMillis() - this.lastUpdateTime >= 14400000 && !this.isUpdating) {
            this.isUpdating = true;
            doUpdateSettings(deviceModelDid, isHuamiDevice, callBack);
            return;
        }
        Logger.d(TAG, "tryUpdateSettingInfo did:" + deviceModelDid + "  isUpdating = " + this.isUpdating);
    }
}
