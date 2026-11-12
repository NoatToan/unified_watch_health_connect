package com.mi.fitness.checkupdate.init;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.mi.fitness.checkupdate.init.CheckUpdateComponent;
import com.mi.fitness.checkupdate.ota.SilentUpgradeExtKt;
import com.mi.fitness.checkupdate.ota.SilentUpgradeManager;
import com.mi.fitness.checkupdate.util.CheckUpdateExtKt;
import com.mi.fitness.checkupdate.util.CheckUpdatePreferenceSupport;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetworkStateUtil;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.service.ServiceConnector;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0005\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002J\u0012\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/mi/fitness/checkupdate/init/CheckUpdateComponent;", "", "<init>", "()V", "mCheckUpdateReceiver", "com/mi/fitness/checkupdate/init/CheckUpdateComponent$mCheckUpdateReceiver$1", "Lcom/mi/fitness/checkupdate/init/CheckUpdateComponent$mCheckUpdateReceiver$1;", "initSilentUpgradeManager", "", "initCheckUpdate", "doInitCheck", "mNetworkListener", "Lkotlin/Function1;", "", "getMNetworkListener", "()Lkotlin/jvm/functions/Function1;", "unregisterNetworkListener", "isNetworkListenerRegistered", "()Z", "setNetworkListenerRegistered", "(Z)V", "checkUpdate", "did", "", "checkUpdateOnMainProcess", "updateInfo", "Ljava/io/Serializable;", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "检查更新")
public final class CheckUpdateComponent {

    @NotNull
    private static final String TAG = "CheckUpdateComponent";
    private boolean isNetworkListenerRegistered;

    @NotNull
    private final CheckUpdateComponent$mCheckUpdateReceiver$1 mCheckUpdateReceiver = new BroadcastReceiver() { // from class: com.mi.fitness.checkupdate.init.CheckUpdateComponent$mCheckUpdateReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            Serializable serializableExtra = intent.getSerializableExtra("updateInfo");
            Logger.i("CheckUpdateComponent", "mCheckUpdateReceiver: info = " + serializableExtra);
            this.this$0.checkUpdateOnMainProcess(serializableExtra);
        }
    };

    @NotNull
    private final Function1<Boolean, Unit> mNetworkListener = new Function1<Boolean, Unit>() { // from class: com.mi.fitness.checkupdate.init.CheckUpdateComponent$mNetworkListener$1
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public void invoke(boolean isConnect) {
            if (isConnect) {
                Logger.i("CheckUpdateComponent", "network connected");
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
                    this.this$0.checkUpdate(wearableDeviceModel.getDid());
                }
                this.this$0.setNetworkListenerRegistered(false);
                this.this$0.unregisterNetworkListener();
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkUpdate(final String did) {
        if (NetworkStateUtil.INSTANCE.getInstance(ApplicationExtKt.getApplication()).getStateInfo(ApplicationExtKt.getApplication()).isConnected()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: lu3
                @Override // java.lang.Runnable
                public final void run() {
                    CheckUpdateComponent.checkUpdate$lambda$1(did, this);
                }
            });
        } else {
            if (this.isNetworkListenerRegistered) {
                return;
            }
            this.isNetworkListenerRegistered = true;
            NetworkExtKt.registerConnectChangeListener(this.mNetworkListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkUpdate$lambda$1(String str, CheckUpdateComponent this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i("CheckUpdate", "onConnectSuccess isAppForeground:" + CheckUpdateExtKt.getAppManager().isAppForeground() + " did:" + str);
        if (str == null) {
            return;
        }
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getDeviceModel(str);
        if (!Intrinsics.areEqual(wearableDeviceModel, (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel())) {
            Logger.i("CheckUpdate", "onConnectSuccess deviceModel not match");
            return;
        }
        Logger.i("CheckUpdate", "isMainActivityOnTop: " + CheckUpdateExtKt.getMainHelper().isMainActivityOnTop() + "  currentActivity is null : " + (CheckUpdateExtKt.getAppManager().getCurrentActivity() == null));
        if (wearableDeviceModel != null && SilentUpgradeExtKt.supportSilentUpgrade(wearableDeviceModel) && CheckUpdatePreferenceSupport.INSTANCE.isSilentUpgradeOpen(wearableDeviceModel.getDid())) {
            Logger.i("CheckUpdate", "onConnectSuccess: supportSilentUpgrade");
        } else {
            this$0.checkUpdateOnMainProcess(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkUpdateOnMainProcess(Serializable updateInfo) {
        Logger.d(TAG, "checkUpdateOnMainProcess() called with: updateInfo = " + updateInfo);
        if (!CheckUpdateExtKt.getMainHelper().isMainActivityOnTop()) {
            com.mi.fitness.checkupdate.export.CheckUpdateExtKt.getCheckUpdateManager().setHasPendingCheckUpdate(true);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel != null) {
                WearableDeviceModel.DefaultImpls.readWatchInfo$default(wearableDeviceModel, null, 1, null);
                return;
            }
            return;
        }
        if (updateInfo == null) {
            com.mi.fitness.checkupdate.export.CheckUpdateExtKt.getCheckUpdateManager().checkUpdate(new Function1() { // from class: mu3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CheckUpdateComponent.checkUpdateOnMainProcess$lambda$3((Serializable) obj);
                }
            });
            return;
        }
        Activity currentActivity = CheckUpdateExtKt.getAppManager().getCurrentActivity();
        if (currentActivity != null) {
            com.mi.fitness.checkupdate.export.CheckUpdateExtKt.getCheckUpdateManager().handleCheckUpdateResult(currentActivity, updateInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUpdateOnMainProcess$lambda$3(Serializable result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (CheckUpdateExtKt.getMainHelper().isMainActivityOnTop()) {
            Activity currentActivity = CheckUpdateExtKt.getAppManager().getCurrentActivity();
            if (currentActivity != null) {
                com.mi.fitness.checkupdate.export.CheckUpdateExtKt.getCheckUpdateManager().handleCheckUpdateResult(currentActivity, result);
            }
        } else {
            Logger.i(TAG, "MainActivity is not on top ,stop handleCheckUpdateResult");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInitCheck() {
        Logger.i(TAG, "doInitCheck() called");
        ExecutorHelper.postInMain(new Runnable() { // from class: nu3
            @Override // java.lang.Runnable
            public final void run() {
                CheckUpdateComponent.doInitCheck$lambda$0(this.f28371a);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doInitCheck$lambda$0(CheckUpdateComponent this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            return;
        }
        this$0.checkUpdate(wearableDeviceModel.getDid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterNetworkListener() {
        NetworkExtKt.unregisterConnectChangeListener(this.mNetworkListener);
    }

    @NotNull
    public final Function1<Boolean, Unit> getMNetworkListener() {
        return this.mNetworkListener;
    }

    @ComponentTask(notEarlierThan = 2, notLaterThan = 2, onMainThread = true)
    public final void initCheckUpdate() {
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(this.mCheckUpdateReceiver, new IntentFilter(SilentUpgradeExtKt.UPGRADE_FORCE_ACTION), 2);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(this.mCheckUpdateReceiver, new IntentFilter(SilentUpgradeExtKt.UPGRADE_FORCE_ACTION));
        }
        ServiceConnector.Companion companion = ServiceConnector.INSTANCE;
        Logger.i(TAG, "initCheckUpdate: " + ServiceConnector.isConnected$default(companion.getInstance(), 0, 1, null));
        if (ServiceConnector.isConnected$default(companion.getInstance(), 0, 1, null)) {
            doInitCheck();
        } else {
            ServiceConnector.addServiceConnectListener$default(companion.getInstance(), new ServiceConnection() { // from class: com.mi.fitness.checkupdate.init.CheckUpdateComponent.initCheckUpdate.1
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName name, IBinder service) {
                    CheckUpdateComponent.this.doInitCheck();
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName name) {
                }
            }, 0, 2, null);
        }
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(new OnDeviceStatusListener() { // from class: com.mi.fitness.checkupdate.init.CheckUpdateComponent.initCheckUpdate.2
            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectFailure(String did, int errorCode, int retryTimes) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectStart(String did) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                CheckUpdateComponent.this.checkUpdate(did);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) {
            }
        });
    }

    @ComponentTask(name = "SilentUpgrade", notLaterThan = 4, processName = ":device")
    public final void initSilentUpgradeManager() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(SilentUpgradeManager.INSTANCE);
    }

    /* JADX INFO: renamed from: isNetworkListenerRegistered, reason: from getter */
    public final boolean getIsNetworkListenerRegistered() {
        return this.isNetworkListenerRegistered;
    }

    public final void setNetworkListenerRegistered(boolean z) {
        this.isNetworkListenerRegistered = z;
    }
}
