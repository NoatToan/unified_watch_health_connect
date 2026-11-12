package com.xiaomi.fitness.settingitem;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.db.SettingItemDatabase;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import defpackage.vbq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 82\u00020\u0001:\u0003678B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bJ$\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u0015J \u0010$\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010\u0001J\u0018\u0010'\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010\u001c2\u0006\u0010&\u001a\u00020\u0001J\u001e\u0010'\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\"J\u001e\u0010)\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0001J*\u0010*\u001a\u00020+2\u0006\u0010(\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0002J&\u0010,\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0001J\u0006\u0010-\u001a\u00020\u0015J\b\u0010.\u001a\u00020\u0015H\u0002J\u0016\u0010/\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001cJ\u0018\u00100\u001a\u0004\u0018\u00010+2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001cJ\u0006\u00101\u001a\u00020\u0015J\u0010\u00102\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\b\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/settingitem/DeviceSettingManager;", "", "<init>", "()V", "updateListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/xiaomi/fitness/settingitem/DeviceSettingManager$UpdateSettingInfoListener;", "updateDeviceListeners", "Lcom/xiaomi/fitness/settingitem/DeviceSettingManager$UpdateDeviceSettingListener;", "deviceRequestHelper", "Lcom/xiaomi/fitness/settingitem/BaseSettingRequestHelper;", "getDeviceRequestHelper", "()Lcom/xiaomi/fitness/settingitem/BaseSettingRequestHelper;", "setDeviceRequestHelper", "(Lcom/xiaomi/fitness/settingitem/BaseSettingRequestHelper;)V", "userRequestHelper", "getUserRequestHelper", "setUserRequestHelper", "getUserLastUpdateTime", "", "addUpdateListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addUpdateDeviceListener", "removeUpdateListener", "removeUpdateDeviceListener", "notifySettingUpdate", "did", "", "valueMap", "Ljava/util/HashMap;", "tryUpdateSettingInfo", "deviceModel", "isHuamiDevice", "", "tryUpdateUserSettingInfo", "sendSettingItem", "key", "setObject", "sendUserSettingItem", "isBigData", "sendBigSettingItem", "buildSettingDeviceItem", "Lcom/xiaomi/fitness/settingitem/db/entity/SettingItemEntity;", "saveDeviceSetItem", "sendUnUploadSettingItems", "sendUnUploadUserSettingItems", "readSettingItem", "readSettingItemValue", "destroy", "clearData", "getDatabase", "Lcom/xiaomi/fitness/settingitem/db/SettingItemDatabase;", "onDeviceBind", "UpdateSettingInfoListener", "UpdateDeviceSettingListener", "Companion", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceSettingManager {

    @NotNull
    public static final String TAG = "DeviceSettingManager";

    @NotNull
    public static final String USER_DEVICE_TAG = "xiaomiwear_app";

    @NotNull
    private BaseSettingRequestHelper deviceRequestHelper;

    @NotNull
    private final CopyOnWriteArraySet<UpdateDeviceSettingListener> updateDeviceListeners;

    @NotNull
    private final CopyOnWriteArraySet<UpdateSettingInfoListener> updateListeners = new CopyOnWriteArraySet<>();

    @NotNull
    private BaseSettingRequestHelper userRequestHelper;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DeviceSettingManager instance = new DeviceSettingManager();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/settingitem/DeviceSettingManager$Companion;", "", "<init>", "()V", "TAG", "", "USER_DEVICE_TAG", "instance", "Lcom/xiaomi/fitness/settingitem/DeviceSettingManager;", "getInstance", "()Lcom/xiaomi/fitness/settingitem/DeviceSettingManager;", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DeviceSettingManager getInstance() {
            return DeviceSettingManager.instance;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/settingitem/DeviceSettingManager$UpdateDeviceSettingListener;", "", "onDeviceSettingUpdated", "", "did", "", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface UpdateDeviceSettingListener {
        void onDeviceSettingUpdated(@Nullable String did);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/settingitem/DeviceSettingManager$UpdateSettingInfoListener;", "", "onSettingValueUpdate", "", "did", "", "settingMap", "Ljava/util/HashMap;", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface UpdateSettingInfoListener {
        void onSettingValueUpdate(@Nullable String did, @NotNull HashMap<String, String> settingMap);
    }

    private DeviceSettingManager() {
        CopyOnWriteArraySet<UpdateDeviceSettingListener> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.updateDeviceListeners = copyOnWriteArraySet;
        this.deviceRequestHelper = new DeviceSettingRequestHelper(copyOnWriteArraySet);
        this.userRequestHelper = new UserSettingRequestHelper();
        NetworkExtKt.registerConnectChangeListener(new Function1<Boolean, Unit>() { // from class: com.xiaomi.fitness.settingitem.DeviceSettingManager$networkListener$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public void invoke(boolean isConnect) {
                if (isConnect && AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                    this.this$0.sendUnUploadSettingItems();
                }
            }
        });
    }

    private final SettingItemEntity buildSettingDeviceItem(boolean isBigData, String did, String key, Object setObject) {
        long j = 1000;
        return new SettingItemEntity(key, new Gson().toJson(setObject), did, "device_setting", System.currentTimeMillis() / j, System.currentTimeMillis() / j, false, isBigData);
    }

    private final SettingItemDatabase getDatabase() {
        return SettingItemDatabase.INSTANCE.getInstance();
    }

    private final void notifySettingUpdate(String did, HashMap<String, String> valueMap) {
        Iterator<UpdateSettingInfoListener> it = this.updateListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().onSettingValueUpdate(did, valueMap);
        }
    }

    private final void sendUnUploadUserSettingItems() {
        List<SettingItemEntity> settingByDid = getDatabase().settingItemDao().getSettingByDid("xiaomiwear_app", false);
        if (settingByDid == null) {
            return;
        }
        HashMap<String, String> map = new HashMap<>();
        for (SettingItemEntity settingItemEntity : settingByDid) {
            map.put(settingItemEntity.getKey(), settingItemEntity.getValue());
        }
        if (map.size() > 0) {
            this.deviceRequestHelper.uploadSmallSettingItems("xiaomiwear_app", map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryUpdateUserSettingInfo$lambda$0(DeviceSettingManager this$0, String did, HashMap valueMap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(valueMap, "valueMap");
        this$0.notifySettingUpdate(did, valueMap);
    }

    public final void addUpdateDeviceListener(@NotNull UpdateDeviceSettingListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.updateDeviceListeners.contains(listener)) {
            return;
        }
        this.updateDeviceListeners.add(listener);
    }

    public final void addUpdateListener(@NotNull UpdateSettingInfoListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.updateListeners.contains(listener)) {
            return;
        }
        this.updateListeners.add(listener);
    }

    public final void clearData(@Nullable String did) {
        if (did != null) {
            Logger.i(TAG, "clearData " + did);
            this.deviceRequestHelper.resetOnDeviceRemove(did);
            getDatabase().settingItemDao().deleteByDid(did);
            getDatabase().settingDeviceDao().deleteByDid(did);
        }
    }

    public final void destroy() {
        this.deviceRequestHelper.destroy();
        this.userRequestHelper.destroy();
    }

    @NotNull
    public final BaseSettingRequestHelper getDeviceRequestHelper() {
        return this.deviceRequestHelper;
    }

    public final long getUserLastUpdateTime() {
        SettingItemPreference settingItemPreference = SettingItemPreference.INSTANCE;
        Logger.i(TAG, "lastUpdateTime:" + settingItemPreference.getLAST_UPDATE_NAME());
        return settingItemPreference.getLAST_UPDATE_NAME();
    }

    @NotNull
    public final BaseSettingRequestHelper getUserRequestHelper() {
        return this.userRequestHelper;
    }

    public final void onDeviceBind(@Nullable String did) {
        this.deviceRequestHelper.destroy();
    }

    @NotNull
    public final SettingItemEntity readSettingItem(@NotNull String did, @NotNull String key) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(key, "key");
        SettingItemEntity settingItemValue = readSettingItemValue(did, key);
        if (settingItemValue == null) {
            return new SettingItemEntity(key, null, did, "device_setting", 0L, 0L, false, false);
        }
        Logger.d(TAG, "readSettingItem key: " + key + " result: " + settingItemValue);
        return settingItemValue;
    }

    @Nullable
    public final SettingItemEntity readSettingItemValue(@NotNull String did, @NotNull String key) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(key, "key");
        return getDatabase().settingItemDao().getSettingByKey(did, "device_setting", key);
    }

    public final void removeUpdateDeviceListener(@NotNull UpdateDeviceSettingListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.updateDeviceListeners.remove(listener);
    }

    public final void removeUpdateListener(@NotNull UpdateSettingInfoListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.updateListeners.remove(listener);
    }

    public final synchronized void saveDeviceSetItem(boolean isBigData, @NotNull String did, @NotNull String key, @NotNull Object setObject) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(setObject, "setObject");
        getDatabase().settingItemDao().insertOrUpdateSettingItem(buildSettingDeviceItem(isBigData, did, key, setObject));
    }

    public final synchronized void sendBigSettingItem(@NotNull String did, @NotNull String key, @NotNull Object setObject) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(setObject, "setObject");
        this.deviceRequestHelper.uploadBigSettingItem(buildSettingDeviceItem(true, did, key, setObject));
    }

    public final synchronized void sendSettingItem(@NotNull String did, @NotNull String key, @Nullable Object setObject) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(key, "key");
        Logger.i(TAG, "sendSettingItem did:" + did);
        this.deviceRequestHelper.uploadSmallSettingItems(buildSettingDeviceItem(false, did, key, setObject));
    }

    public final void sendUnUploadSettingItems() {
        List<SettingItemEntity> settingByDid;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        String did = wearableDeviceModel.getDid();
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel) && !TextUtils.isEmpty(did) && (settingByDid = getDatabase().settingItemDao().getSettingByDid(did, false)) != null && (!settingByDid.isEmpty())) {
            HashMap<String, String> map = new HashMap<>();
            for (SettingItemEntity settingItemEntity : settingByDid) {
                if (settingItemEntity.isBig()) {
                    this.deviceRequestHelper.uploadBigSettingItem(settingItemEntity);
                } else {
                    map.put(settingItemEntity.getKey(), settingItemEntity.getValue());
                }
            }
            if (map.size() > 0) {
                this.deviceRequestHelper.uploadSmallSettingItems(did, map);
            }
        }
        sendUnUploadUserSettingItems();
    }

    public final synchronized void sendUserSettingItem(@Nullable String key, @NotNull Object setObject) {
        Intrinsics.checkNotNullParameter(setObject, "setObject");
        Intrinsics.checkNotNull(key);
        sendUserSettingItem(key, setObject, true);
    }

    public final void setDeviceRequestHelper(@NotNull BaseSettingRequestHelper baseSettingRequestHelper) {
        Intrinsics.checkNotNullParameter(baseSettingRequestHelper, "<set-?>");
        this.deviceRequestHelper = baseSettingRequestHelper;
    }

    public final void setUserRequestHelper(@NotNull BaseSettingRequestHelper baseSettingRequestHelper) {
        Intrinsics.checkNotNullParameter(baseSettingRequestHelper, "<set-?>");
        this.userRequestHelper = baseSettingRequestHelper;
    }

    public final synchronized void tryUpdateSettingInfo(@Nullable String deviceModel, boolean isHuamiDevice) {
        if (isHuamiDevice) {
            BaseSettingRequestHelper.tryUpdateSettingInfo$default(this.deviceRequestHelper, deviceModel, isHuamiDevice, null, 4, null);
        }
    }

    public final synchronized void tryUpdateUserSettingInfo() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            this.userRequestHelper.tryUpdateSettingInfo(new vbq() { // from class: yc6
                @Override // defpackage.vbq
                public final void a(String str, HashMap map) {
                    DeviceSettingManager.tryUpdateUserSettingInfo$lambda$0(this.f40034a, str, map);
                }
            });
        }
    }

    public final synchronized void sendUserSettingItem(@NotNull String key, @NotNull Object setObject, boolean isBigData) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(setObject, "setObject");
        this.userRequestHelper.uploadUserSettingItem(buildSettingDeviceItem(isBigData, "xiaomiwear_app", key, setObject));
    }
}
