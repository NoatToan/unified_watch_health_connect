package com.xiaomi.fitness.settingitem;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.settingitem.DeviceSettingRequestHelper;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.ga8;
import defpackage.vbq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J-\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0017H\u0016¢\u0006\u0004\b\u0016\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\fR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/settingitem/DeviceSettingRequestHelper;", "Lcom/xiaomi/fitness/settingitem/BaseSettingRequestHelper;", "", "did", "", "isHuamiDevice", "", "updateBigSettings", "(Ljava/lang/String;Z)V", "success", "doOnEnd", StatConstants.PARAM_END, "()V", "deviceModelDid", "Lvbq;", "callBack", "doUpdateSettings", "(Ljava/lang/String;ZLvbq;)V", "Lcom/xiaomi/fitness/settingitem/db/entity/SettingItemEntity;", "itemInfo", "uploadBigSettingItem", "(Lcom/xiaomi/fitness/settingitem/db/entity/SettingItemEntity;)V", "uploadSmallSettingItems", "Ljava/util/HashMap;", "maps", "(Ljava/lang/String;Ljava/util/HashMap;)V", "destroy", "", "Lcom/xiaomi/fitness/settingitem/DeviceSettingManager$UpdateDeviceSettingListener;", "updateDeviceListener", "Ljava/util/Set;", "getUpdateDeviceListener", "()Ljava/util/Set;", "Lcom/xiaomi/fitness/settingitem/DeviceBigSettingHelper;", "bigSettingHelper", "Lcom/xiaomi/fitness/settingitem/DeviceBigSettingHelper;", "Lcom/xiaomi/fitness/settingitem/DeviceSmallSettingHelper;", "smallSettingHelper", "Lcom/xiaomi/fitness/settingitem/DeviceSmallSettingHelper;", "<init>", "(Ljava/util/Set;)V", "settingitem_release"}, k = 1, mv = {2, 0, 0})
public final class DeviceSettingRequestHelper extends BaseSettingRequestHelper {

    @NotNull
    private DeviceBigSettingHelper bigSettingHelper;

    @NotNull
    private DeviceSmallSettingHelper smallSettingHelper;

    @NotNull
    private final Set<DeviceSettingManager.UpdateDeviceSettingListener> updateDeviceListener;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceSettingRequestHelper(@NotNull Set<DeviceSettingManager.UpdateDeviceSettingListener> updateDeviceListener) {
        Intrinsics.checkNotNullParameter(updateDeviceListener, "updateDeviceListener");
        this.updateDeviceListener = updateDeviceListener;
        int i = 1;
        this.bigSettingHelper = new DeviceBigSettingHelper(null, i, 0 == true ? 1 : 0);
        this.smallSettingHelper = new DeviceSmallSettingHelper(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
    }

    private final void doOnEnd(String did, boolean success) {
        if (!success) {
            reset();
            return;
        }
        Iterator<DeviceSettingManager.UpdateDeviceSettingListener> it = this.updateDeviceListener.iterator();
        while (it.hasNext()) {
            it.next().onDeviceSettingUpdated(did);
        }
        end();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doUpdateSettings$lambda$0(DeviceSettingRequestHelper this$0, String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(BaseSettingRequestHelper.TAG, "DeviceSettingRequestHelper doUpdateSettings result:" + z2);
        if (z2) {
            this$0.updateBigSettings(str, z);
        }
    }

    private final void end() {
        setLastUpdateTime(System.currentTimeMillis());
        setUpdating(false);
    }

    private final void updateBigSettings(final String did, boolean isHuamiDevice) {
        Logger.i(BaseSettingRequestHelper.TAG, "updateBigSettings,did:" + did);
        this.bigSettingHelper.updateSettings(did, isHuamiDevice, new ga8() { // from class: zc6
            @Override // defpackage.ga8
            public final void a(boolean z) {
                DeviceSettingRequestHelper.updateBigSettings$lambda$1(this.f41116a, did, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBigSettings$lambda$1(DeviceSettingRequestHelper this$0, String did, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Logger.i(BaseSettingRequestHelper.TAG, "updateBigSettings,result:" + z);
        this$0.doOnEnd(did, z);
    }

    @Override // com.xiaomi.fitness.settingitem.BaseSettingRequestHelper
    public void destroy() {
        super.destroy();
        this.smallSettingHelper.destroy();
        this.bigSettingHelper.destroy();
    }

    @Override // com.xiaomi.fitness.settingitem.BaseSettingRequestHelper
    public void doUpdateSettings(@Nullable final String deviceModelDid, final boolean isHuamiDevice, @Nullable vbq callBack) {
        if (deviceModelDid != null) {
            this.smallSettingHelper.updateSettings(deviceModelDid, new ga8() { // from class: ad6
                @Override // defpackage.ga8
                public final void a(boolean z) {
                    DeviceSettingRequestHelper.doUpdateSettings$lambda$0(this.f895a, deviceModelDid, isHuamiDevice, z);
                }
            });
        }
    }

    @NotNull
    public final Set<DeviceSettingManager.UpdateDeviceSettingListener> getUpdateDeviceListener() {
        return this.updateDeviceListener;
    }

    @Override // com.xiaomi.fitness.settingitem.BaseSettingRequestHelper
    public void uploadBigSettingItem(@NotNull SettingItemEntity itemInfo) {
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        this.bigSettingHelper.uploadSettingItem(itemInfo);
    }

    @Override // com.xiaomi.fitness.settingitem.BaseSettingRequestHelper
    public void uploadSmallSettingItems(@NotNull SettingItemEntity itemInfo) {
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        this.smallSettingHelper.uploadSettingItem(itemInfo);
    }

    @Override // com.xiaomi.fitness.settingitem.BaseSettingRequestHelper
    public void uploadSmallSettingItems(@NotNull String did, @NotNull HashMap<String, String> maps) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(maps, "maps");
        this.smallSettingHelper.uploadSettingItems(did, maps);
    }
}
