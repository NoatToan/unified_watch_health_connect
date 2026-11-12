package com.xiaomi.fitness.device.manager;

import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.ConnectAssist;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import com.xiaomi.wearable.CoreExtKt;
import com.xiaomi.wearable.connection.ConnectSource;
import com.xiaomi.wearable.connection.LimitTimesStrategy;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\"\u0010\u0012\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ConnectAssist;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "<init>", "()V", "timeLimit", "Lcom/xiaomi/wearable/connection/LimitTimesStrategy;", "getTimeLimit", "()Lcom/xiaomi/wearable/connection/LimitTimesStrategy;", "timeLimit$delegate", "Lkotlin/Lazy;", "visibleActivityCount", "", LoginPreferenceConfig.TYPE_REGISTER, "", "registerLifecycle", "onConnectStart", "did", "", "onConnectFailure", "errorCode", "retryTimes", "onConnectSuccess", "onDisconnect", "TAG", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConnectAssist implements OnDeviceStatusListener {

    @NotNull
    private static final String TAG = "ConnectAssist";
    private static int visibleActivityCount;

    @NotNull
    public static final ConnectAssist INSTANCE = new ConnectAssist();

    /* JADX INFO: renamed from: timeLimit$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy timeLimit = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wd4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ConnectAssist.timeLimit_delegate$lambda$0();
        }
    });

    private ConnectAssist() {
    }

    private final LimitTimesStrategy getTimeLimit() {
        return (LimitTimesStrategy) timeLimit.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConnectFailure$lambda$2(String str) {
        com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).connectDevice(str);
    }

    private final void registerLifecycle() {
        AppManager.INSTANCE.getInstance().registerLifecycleListener(new Function2() { // from class: xd4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ConnectAssist.registerLifecycle$lambda$1((String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerLifecycle$lambda$1(String activity, String lifecycle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (Intrinsics.areEqual(lifecycle, LifecycleConstantKt.ON_START)) {
            visibleActivityCount++;
        } else if (Intrinsics.areEqual(lifecycle, LifecycleConstantKt.ON_STOP)) {
            visibleActivityCount--;
        }
        Logger.i(TAG, "isForeground " + (visibleActivityCount > 0));
        ConnectSource.INSTANCE.setForeground(visibleActivityCount > 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LimitTimesStrategy timeLimit_delegate$lambda$0() {
        return new LimitTimesStrategy(5, 3);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(@Nullable final String did, int errorCode, int retryTimes) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (Intrinsics.areEqual(did, wearableDeviceModel != null ? wearableDeviceModel.getDid() : null) && errorCode == 2011 && ConnectSource.INSTANCE.isForeground()) {
            Logger.i(TAG, "onConnectFailure() bond state error did = " + did + ", errorCode = " + errorCode + ", isOverLimit = " + getTimeLimit().overLimit() + ",limit = " + (wearableDeviceModel != null ? Boolean.valueOf(wearableDeviceModel.getIsConnectActive()) : null));
            if ((wearableDeviceModel == null || wearableDeviceModel.getIsConnectActive()) && !getTimeLimit().overLimit()) {
                CoreExtKt.getHandler().postDelayed(new Runnable() { // from class: yd4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConnectAssist.onConnectFailure$lambda$2(did);
                    }
                }, ((long) getTimeLimit().getNextBackoff()) * 1000);
            }
        }
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(@Nullable String did) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(@Nullable String did) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(@Nullable String did) {
    }

    public final void register() {
        registerLifecycle();
        com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this);
    }
}
