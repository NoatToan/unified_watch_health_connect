package com.xiaomi.hm.health.devicex.proxy.data;

import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.passport.Configs;
import com.xiaomi.hm.health.databases.model.HmProperty;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import com.xiaomi.hm.health.utils.Utils;
import java.util.List;
import kotlin.Metadata;
import org.cybergarage.upnp.device.ST;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\bD\u0010EJ\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016J\u001c\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J,\u0010\u001d\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001c\u001a\u00020\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u000fH\u0016J\b\u0010!\u001a\u00020\u000fH\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u000fH\u0016J \u0010'\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0016J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u000fH\u0016J\b\u0010*\u001a\u00020\u000fH\u0016J\b\u0010+\u001a\u00020\u000fH\u0016J\n\u0010,\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010.\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u000fH\u0016J\u0010\u00102\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u000fH\u0016J\b\u00103\u001a\u00020\u000fH\u0016J\u0018\u00106\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0002H\u0016J\b\u00107\u001a\u00020\u0005H\u0016J\n\u00108\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010:\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010;\u001a\u00020\u000fH\u0016J\u0010\u0010<\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000fH\u0016J\b\u0010=\u001a\u00020\u0002H\u0016J\u0010\u0010?\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\rH\u0016J\u0010\u0010A\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u000fH\u0016J\u0010\u0010B\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u000fH\u0016J\u0010\u0010C\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u000fH\u0016¨\u0006G"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/data/PropertyStoreImpl;", "Lcom/huami/devicex/injection/data/PropertyStoreApi;", "", "key", "value", "", "setProperty", "", "Lcom/xiaomi/hm/health/databases/model/HmProperty;", Configs.Params.PROPERTIES, "setProperties", "defaultValue", "getProperty", "", "getRingType", "", "syncPropertiesToServerWhenLogout", "type", "getPropertyToWeightPermission", "userId", "setPropertyToWeightPermission", "getSmartAnalysis", "isOpen", "setThirdPartyAuth", "isGoogleFitAuth", "slpType", "isSlpOpen", "bodyType", "isBodyOpen", "setSmartAnalysis", "isYorkLiftWristOn", "enable", "setYorkLiftWristSwitch", "hasYorkProperty", "isForce", "postPropertiesToServer", "cacheResult", "Lcom/huami/devicex/injection/data/PropertyStoreApi$GetPropertyHandler;", "handler", "getPropertyAsync", "hasShow", "setHasShowSensorhubTips", "hasShowSensorhubTips", "isSupportInjectionLoc", "lastLocSendToDevice", "loc", "saveLastLocSendToDevice", "supportInjectionLoc", "saveSupportInjectionLoc", "isFirstBand", "setIsFirstSyncWatchDataAfterBand", "isFirstSyncWatchDataAfterBand", "startDay", "endDay", "saveWatchMissData", "clearWatchMissData", "readUUID", ST.UUID_DEVICE, "keepUUID", "isSyncedManualData", "setManualDataSyncState", "handleUUID", "flag", "setShowPublicPreView", "isShow", "setShowEarbudAlarmDialog", "setShowEarbudDeleteGuide", "setShowEarbudDeleteTip", "<init>", "()V", "TempleHandlerWrapper", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PropertyStoreImpl implements PropertyStoreApi {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/data/PropertyStoreImpl$TempleHandlerWrapper;", "Lcom/xiaomi/hm/health/utils/HMPropertyUtil$GetPropertyHandler;", "", "value", "", "onSuccess", "onFailed", "Lcom/huami/devicex/injection/data/PropertyStoreApi$GetPropertyHandler;", "a", "Lcom/huami/devicex/injection/data/PropertyStoreApi$GetPropertyHandler;", "getHandler", "()Lcom/huami/devicex/injection/data/PropertyStoreApi$GetPropertyHandler;", "handler", "<init>", "(Lcom/xiaomi/hm/health/devicex/proxy/data/PropertyStoreImpl;Lcom/huami/devicex/injection/data/PropertyStoreApi$GetPropertyHandler;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public final class TempleHandlerWrapper implements HMPropertyUtil.GetPropertyHandler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final PropertyStoreApi.GetPropertyHandler handler;

        public TempleHandlerWrapper(PropertyStoreApi.GetPropertyHandler getPropertyHandler) {
            this.handler = getPropertyHandler;
        }

        @NotNull
        public final PropertyStoreApi.GetPropertyHandler getHandler() {
            return this.handler;
        }

        @Override // com.xiaomi.hm.health.utils.HMPropertyUtil.GetPropertyHandler
        public void onFailed() {
            this.handler.onFailed();
        }

        @Override // com.xiaomi.hm.health.utils.HMPropertyUtil.GetPropertyHandler
        public void onSuccess(@Nullable String value) {
            this.handler.onSuccess(value);
        }
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void clearWatchMissData() {
        HMKeeper.clearWatchMissData();
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    @Nullable
    public String getProperty(@NotNull String key, @Nullable String defaultValue) {
        return HMPropertyUtil.getProperty(key, defaultValue);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void getPropertyAsync(@NotNull String key, boolean cacheResult, @NotNull PropertyStoreApi.GetPropertyHandler handler) {
        HMPropertyUtil.getPropertyAsync(key, cacheResult, new TempleHandlerWrapper(handler));
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public boolean getPropertyToWeightPermission(@Nullable String type) {
        if (type == null) {
            return false;
        }
        return HMPropertyUtil.getPropertyToWeightPermission(type);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public int getRingType() {
        return HMPropertyUtil.getRingType();
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public boolean getSmartAnalysis(@Nullable String type) {
        if (type == null) {
            return false;
        }
        return HMPropertyUtil.getSmartAnalysis(type);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    @NotNull
    public String handleUUID() {
        return Utils.handleUUID();
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public boolean hasShowSensorhubTips() {
        return HMKeeper.hasShowSensorhubTips();
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public boolean hasYorkProperty() {
        return HMPropertyUtil.hasYorkProperty();
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public boolean isFirstSyncWatchDataAfterBand() {
        return HMKeeper.isFirstSyncWatchDataAfterBand();
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public boolean isGoogleFitAuth() {
        return HMPropertyUtil.isGoogleFitAuthed();
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public boolean isSupportInjectionLoc() {
        return HMKeeper.isSupportInjectionLoc();
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public boolean isSyncedManualData() {
        return HMKeeper.isSyncedManualData();
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public boolean isYorkLiftWristOn() {
        return HMPropertyUtil.isYorkLiftWristOn();
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void keepUUID(@Nullable String uuid) {
        HMKeeper.keepUUID(uuid);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    @Nullable
    public String lastLocSendToDevice() {
        return HMKeeper.lastLocSendToDevice();
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void postPropertiesToServer(boolean isForce) {
        HMPropertyUtil.postPropertisToServer(isForce);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    @Nullable
    public String readUUID() {
        return HMKeeper.readUUID();
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void saveLastLocSendToDevice(@Nullable String loc) {
        HMKeeper.saveLastLocSendToDevice(loc);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void saveSupportInjectionLoc(boolean supportInjectionLoc) {
        HMKeeper.saveSupportInjectionLoc(supportInjectionLoc);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void saveWatchMissData(@NotNull String startDay, @NotNull String endDay) {
        HMKeeper.saveWatchMissData(startDay, endDay);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void setHasShowSensorhubTips(boolean hasShow) {
        HMKeeper.setHasShowSensorhubTips(hasShow);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void setIsFirstSyncWatchDataAfterBand(boolean isFirstBand) {
        HMKeeper.setIsFirstSyncWatchDataAfterBand(isFirstBand);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void setManualDataSyncState(boolean value) {
        HMKeeper.setManualDataSyncState(value);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void setProperties(@Nullable List<? extends HmProperty> properties) {
        if (properties == null) {
            return;
        }
        HMPropertyUtil.setProperties(properties);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void setProperty(@NotNull String key, @Nullable String value) {
        HMPropertyUtil.setProperty(key, value);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void setPropertyToWeightPermission(@Nullable String userId) {
        if (userId == null) {
            return;
        }
        HMPropertyUtil.setPropertyToWeightPermission(userId);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void setShowEarbudAlarmDialog(boolean isShow) {
        HMKeeper.setShowEarbudAlarmDialog(isShow);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void setShowEarbudDeleteGuide(boolean isShow) {
        HMKeeper.setShowEarbudDeleteGuide(isShow);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void setShowEarbudDeleteTip(boolean isShow) {
        HMKeeper.setShowEarbudDeleteTip(isShow);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void setShowPublicPreView(int flag) {
        HMKeeper.setShowPublicPreView(flag);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void setSmartAnalysis(@Nullable String slpType, boolean isSlpOpen, @Nullable String bodyType, boolean isBodyOpen) {
        HMPropertyUtil.setSmartAnalysis(slpType, isSlpOpen, bodyType, isBodyOpen);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void setThirdPartyAuth(@Nullable String type, boolean isOpen) {
        HMPropertyUtil.setThirdPartyAuth(type, isOpen);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public void setYorkLiftWristSwitch(boolean enable) {
        HMPropertyUtil.setYorkLiftWristSwitch(enable);
    }

    @Override // com.huami.devicex.injection.data.PropertyStoreApi
    public boolean syncPropertiesToServerWhenLogout() {
        return HMPropertyUtil.syncPropertisToServerWhenLogout();
    }
}
