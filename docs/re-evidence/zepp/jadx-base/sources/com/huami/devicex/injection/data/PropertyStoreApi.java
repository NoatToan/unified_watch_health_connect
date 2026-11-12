package com.huami.devicex.injection.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.passport.Configs;
import com.xiaomi.hm.health.databases.model.HmProperty;
import java.util.List;
import kotlin.Metadata;
import org.cybergarage.upnp.device.ST;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b!\bf\u0018\u0000 D2\u00020\u0001:\u0002DEJ\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\u000f\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\tH&J\u0012\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0017\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H&J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\tH&J\b\u0010\u001a\u001a\u00020\tH&J,\u0010\u001f\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\tH&J\b\u0010 \u001a\u00020\tH&J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\tH&J\b\u0010#\u001a\u00020\tH&J \u0010'\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\t2\u0006\u0010&\u001a\u00020%H&J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\tH&J\b\u0010*\u001a\u00020\tH&J\b\u0010+\u001a\u00020\tH&J\n\u0010,\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010.\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010\u0002H&J\u0010\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\tH&J\u0010\u00102\u001a\u00020\u00052\u0006\u00101\u001a\u00020\tH&J\b\u00103\u001a\u00020\tH&J\u0018\u00106\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0002H&J\b\u00107\u001a\u00020\u0005H&J\n\u00108\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010:\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u00010\u0002H&J\b\u0010;\u001a\u00020\tH&J\u0010\u0010<\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\tH&J\b\u0010=\u001a\u00020\u0002H&J\u0010\u0010?\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u0010H&J\u0010\u0010A\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\tH&J\u0010\u0010B\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\tH&J\u0010\u0010C\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\tH&¨\u0006F"}, d2 = {"Lcom/huami/devicex/injection/data/PropertyStoreApi;", "", "", "key", "value", "", "setProperty", "defaultValue", "getProperty", "", "isForce", "postPropertiesToServer", "", "Lcom/xiaomi/hm/health/databases/model/HmProperty;", Configs.Params.PROPERTIES, "setProperties", "", "getRingType", "syncPropertiesToServerWhenLogout", "type", "getPropertyToWeightPermission", "userId", "setPropertyToWeightPermission", "getSmartAnalysis", "isOpen", "setThirdPartyAuth", "isGoogleFitAuth", "slpType", "isSlpOpen", "bodyType", "isBodyOpen", "setSmartAnalysis", "isYorkLiftWristOn", "enable", "setYorkLiftWristSwitch", "hasYorkProperty", "cacheResult", "Lcom/huami/devicex/injection/data/PropertyStoreApi$GetPropertyHandler;", "handler", "getPropertyAsync", "hasShow", "setHasShowSensorhubTips", "hasShowSensorhubTips", "isSupportInjectionLoc", "lastLocSendToDevice", "loc", "saveLastLocSendToDevice", "supportInjectionLoc", "saveSupportInjectionLoc", "isFirstBand", "setIsFirstSyncWatchDataAfterBand", "isFirstSyncWatchDataAfterBand", "startDay", "endDay", "saveWatchMissData", "clearWatchMissData", "readUUID", ST.UUID_DEVICE, "keepUUID", "isSyncedManualData", "setManualDataSyncState", "handleUUID", "flag", "setShowPublicPreView", "isShow", "setShowEarbudAlarmDialog", "setShowEarbudDeleteGuide", "setShowEarbudDeleteTip", "Companion", "GetPropertyHandler", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface PropertyStoreApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String PROPERTY_LABTOP_UNLOCK = "huami.mifit.user.settings.lab.laptopunlock";
    public static final int STATTUS_SYNCED = 1;
    public static final int STATTUS_SYNC_NEED = 0;
    public static final int TIME_INTERNAL = 60000;
    public static final long checkNetDataTime = 0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/devicex/injection/data/PropertyStoreApi$Companion;", "", "", "STATTUS_SYNCED", LogUtil.I, "STATTUS_SYNC_NEED", "", "checkNetDataTime", "J", "TIME_INTERNAL", "", "PROPERTY_LABTOP_UNLOCK", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @NotNull
        public static final String PROPERTY_LABTOP_UNLOCK = "huami.mifit.user.settings.lab.laptopunlock";
        public static final int STATTUS_SYNCED = 1;
        public static final int STATTUS_SYNC_NEED = 0;
        public static final int TIME_INTERNAL = 60000;
        public static final /* synthetic */ Companion a = new Companion();
        public static final long checkNetDataTime = 0;

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/huami/devicex/injection/data/PropertyStoreApi$GetPropertyHandler;", "", "", "value", "", "onSuccess", "onFailed", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public interface GetPropertyHandler {
        void onFailed();

        void onSuccess(@Nullable String value);
    }

    void clearWatchMissData();

    @Nullable
    String getProperty(@NotNull String key, @Nullable String defaultValue);

    void getPropertyAsync(@NotNull String key, boolean cacheResult, @NotNull GetPropertyHandler handler);

    boolean getPropertyToWeightPermission(@Nullable String type);

    int getRingType();

    boolean getSmartAnalysis(@Nullable String type);

    @NotNull
    String handleUUID();

    boolean hasShowSensorhubTips();

    boolean hasYorkProperty();

    boolean isFirstSyncWatchDataAfterBand();

    boolean isGoogleFitAuth();

    boolean isSupportInjectionLoc();

    boolean isSyncedManualData();

    boolean isYorkLiftWristOn();

    void keepUUID(@Nullable String uuid);

    @Nullable
    String lastLocSendToDevice();

    void postPropertiesToServer(boolean isForce);

    @Nullable
    String readUUID();

    void saveLastLocSendToDevice(@Nullable String loc);

    void saveSupportInjectionLoc(boolean supportInjectionLoc);

    void saveWatchMissData(@NotNull String startDay, @NotNull String endDay);

    void setHasShowSensorhubTips(boolean hasShow);

    void setIsFirstSyncWatchDataAfterBand(boolean isFirstBand);

    void setManualDataSyncState(boolean value);

    void setProperties(@Nullable List<? extends HmProperty> properties);

    void setProperty(@NotNull String key, @Nullable String value);

    void setPropertyToWeightPermission(@Nullable String userId);

    void setShowEarbudAlarmDialog(boolean isShow);

    void setShowEarbudDeleteGuide(boolean isShow);

    void setShowEarbudDeleteTip(boolean isShow);

    void setShowPublicPreView(int flag);

    void setSmartAnalysis(@Nullable String slpType, boolean isSlpOpen, @Nullable String bodyType, boolean isBodyOpen);

    void setThirdPartyAuth(@Nullable String type, boolean isOpen);

    void setYorkLiftWristSwitch(boolean enable);

    boolean syncPropertiesToServerWhenLogout();
}
