package com.mi.fitness.checkupdate.ota;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.mi.fitness.checkupdate.export.CheckUpdateExtKt;
import com.mi.fitness.checkupdate.model.LatestVersion;
import com.mi.fitness.checkupdate.model.OtaUpgradeResult;
import com.mi.fitness.checkupdate.ota.SilentUpgradeManager;
import com.mi.fitness.checkupdate.ui.bluetooth.BluetoothOtaManager;
import com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager;
import com.mi.fitness.checkupdate.util.CheckUpdatePreferenceSupport;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.NetworkStateUtil;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.hm.health.bt.sdk.fw.FwType;
import defpackage.aje;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\b\u000e*\u0005\u0011\u0016\u0019,0\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0002J\u0012\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010$\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0016J\u0012\u0010(\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0005J\u0006\u0010.\u001a\u00020\u000fJ\b\u00102\u001a\u00020\u001cH\u0002J\b\u00107\u001a\u00020\u001cH\u0002J\b\u00108\u001a\u00020\u001cH\u0002J\u000e\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u0005J\u0006\u00109\u001a\u00020\u001cJ\b\u0010;\u001a\u00020\u001cH\u0002J\u0012\u0010<\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0004\n\u0002\u0010-R\u0010\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0004\n\u0002\u00101R\u001a\u00103\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006="}, d2 = {"Lcom/mi/fitness/checkupdate/ota/SilentUpgradeManager;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "<init>", "()V", "TAG", "", "mHandler", "Landroid/os/Handler;", "mOtaManager", "Lcom/mi/fitness/checkupdate/ota/IOtaManager;", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mRunnable", "Ljava/lang/Runnable;", "mSilentUpgradeState", "Lcom/mi/fitness/checkupdate/ota/SilentUpgradeState;", "mSilentUpgradeStateReceiver", "com/mi/fitness/checkupdate/ota/SilentUpgradeManager$mSilentUpgradeStateReceiver$1", "Lcom/mi/fitness/checkupdate/ota/SilentUpgradeManager$mSilentUpgradeStateReceiver$1;", "mInOtaPage", "", "mOTAStateReceiver", "com/mi/fitness/checkupdate/ota/SilentUpgradeManager$mOTAStateReceiver$1", "Lcom/mi/fitness/checkupdate/ota/SilentUpgradeManager$mOTAStateReceiver$1;", "mSilentUpgradeReceiver", "com/mi/fitness/checkupdate/ota/SilentUpgradeManager$mSilentUpgradeReceiver$1", "Lcom/mi/fitness/checkupdate/ota/SilentUpgradeManager$mSilentUpgradeReceiver$1;", "registerOtaPageReceiver", "", "updateState", "state", "retrySilentDelay", "delayTime", "", "onConnectStart", "did", "onConnectFailure", "errorCode", "", "retryTimes", "onConnectSuccess", SilentUpgradeExtKt.ACTION_INTERRUPT_SELF, "reason", "mDownloadListener", "com/mi/fitness/checkupdate/ota/SilentUpgradeManager$mDownloadListener$1", "Lcom/mi/fitness/checkupdate/ota/SilentUpgradeManager$mDownloadListener$1;", "getSilentUpgradeState", "mNetworkListener", "com/mi/fitness/checkupdate/ota/SilentUpgradeManager$mNetworkListener$1", "Lcom/mi/fitness/checkupdate/ota/SilentUpgradeManager$mNetworkListener$1;", "unregisterNetworkListener", "isNetworkListenerRegistered", "()Z", "setNetworkListenerRegistered", "(Z)V", "checkUpgrade", "downloadIfNeed", "upgradeIfNeed", "otaPath", "clearSilentUpgradeState", "onDisconnect", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SilentUpgradeManager implements OnDeviceStatusListener {

    @NotNull
    public static final SilentUpgradeManager INSTANCE;

    @NotNull
    private static final String TAG = "SilentUpgradeManager";
    private static boolean isNetworkListenerRegistered;
    private static WearableDeviceModel mDeviceModel;

    @NotNull
    private static final SilentUpgradeManager$mDownloadListener$1 mDownloadListener;

    @NotNull
    private static final Handler mHandler;
    private static boolean mInOtaPage;

    @NotNull
    private static final SilentUpgradeManager$mNetworkListener$1 mNetworkListener;

    @NotNull
    private static final SilentUpgradeManager$mOTAStateReceiver$1 mOTAStateReceiver;

    @Nullable
    private static IOtaManager mOtaManager;

    @NotNull
    private static final Runnable mRunnable;

    @NotNull
    private static final SilentUpgradeManager$mSilentUpgradeReceiver$1 mSilentUpgradeReceiver;

    @NotNull
    private static volatile SilentUpgradeState mSilentUpgradeState;

    @NotNull
    private static final SilentUpgradeManager$mSilentUpgradeStateReceiver$1 mSilentUpgradeStateReceiver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.mi.fitness.checkupdate.ota.SilentUpgradeManager$mDownloadListener$1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.mi.fitness.checkupdate.ota.SilentUpgradeManager$mNetworkListener$1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.BroadcastReceiver, com.mi.fitness.checkupdate.ota.SilentUpgradeManager$mSilentUpgradeStateReceiver$1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.mi.fitness.checkupdate.ota.SilentUpgradeManager$mOTAStateReceiver$1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.content.BroadcastReceiver, com.mi.fitness.checkupdate.ota.SilentUpgradeManager$mSilentUpgradeReceiver$1] */
    static {
        SilentUpgradeManager silentUpgradeManager = new SilentUpgradeManager();
        INSTANCE = silentUpgradeManager;
        mHandler = new Handler(Looper.getMainLooper());
        mRunnable = new Runnable() { // from class: ybm
            @Override // java.lang.Runnable
            public final void run() {
                SilentUpgradeManager.mRunnable$lambda$0();
            }
        };
        mSilentUpgradeState = SilentUpgradeState.UPGRADE_IDLE;
        ?? r1 = new BroadcastReceiver() { // from class: com.mi.fitness.checkupdate.ota.SilentUpgradeManager$mSilentUpgradeStateReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    return;
                }
                Serializable serializableExtra = intent.getSerializableExtra("action");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type kotlin.String");
                String str = (String) serializableExtra;
                Logger.i("SilentUpgradeManager", "mSilentUpgradeStateReceiver onReceive: action = " + str);
                if (Intrinsics.areEqual(str, SilentUpgradeExtKt.ACTION_INTERRUPTED)) {
                    SilentUpgradeManager silentUpgradeManager2 = SilentUpgradeManager.INSTANCE;
                    silentUpgradeManager2.updateState(SilentUpgradeState.UPGRADE_IDLE);
                    silentUpgradeManager2.retrySilentDelay(TimeUnit.MINUTES.toMillis(10L));
                } else if (Intrinsics.areEqual(str, "finish")) {
                    SilentUpgradeManager.INSTANCE.updateState(SilentUpgradeState.UPGRADE_PUSHED);
                }
            }
        };
        mSilentUpgradeStateReceiver = r1;
        mOTAStateReceiver = new BroadcastReceiver() { // from class: com.mi.fitness.checkupdate.ota.SilentUpgradeManager$mOTAStateReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    return;
                }
                SilentUpgradeManager silentUpgradeManager2 = SilentUpgradeManager.INSTANCE;
                SilentUpgradeManager.mInOtaPage = intent.getBooleanExtra("in_ota_page", false);
                Logger.i("SilentUpgradeManager", "SilentUpgradeManager called with: " + SilentUpgradeManager.mInOtaPage);
            }
        };
        ?? r2 = new BroadcastReceiver() { // from class: com.mi.fitness.checkupdate.ota.SilentUpgradeManager$mSilentUpgradeReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    return;
                }
                String stringExtra = intent.getStringExtra("path");
                Logger.i("SilentUpgradeManager", "upgradeIfNeed() called with: otaPath = " + stringExtra + ", process " + ApplicationExtKt.getProcessName(ApplicationExtKt.getApplication()));
                String processName = ApplicationExtKt.getProcessName(ApplicationExtKt.getApplication());
                if (processName == null || !StringsKt__StringsJVMKt.endsWith$default(processName, ":device", false, 2, null) || stringExtra == null) {
                    return;
                }
                SilentUpgradeManager silentUpgradeManager2 = SilentUpgradeManager.INSTANCE;
                SilentUpgradeManager.mOtaManager = new BluetoothOtaManager(stringExtra);
                SilentUpgradeManager.mSilentUpgradeState = SilentUpgradeState.UPGRADE_DOWNLOADED;
                SilentUpgradeManager.INSTANCE.upgradeIfNeed();
            }
        };
        mSilentUpgradeReceiver = r2;
        aje.b(ApplicationExtKt.getApplication()).c(r1, new IntentFilter(SilentUpgradeExtKt.SILENT_UPGRADE_ACTION));
        if (AppUtil.INSTANCE.isDevChannel()) {
            if (Build.VERSION.SDK_INT >= 33) {
                ApplicationExtKt.getApplication().registerReceiver(r2, new IntentFilter(SilentUpgradeExtKt.SILENT_UPGRADE_ACTION), 2);
            } else {
                ApplicationExtKt.getApplication().registerReceiver(r2, new IntentFilter(SilentUpgradeExtKt.SILENT_UPGRADE_ACTION));
            }
        }
        silentUpgradeManager.registerOtaPageReceiver();
        mDownloadListener = new DownloadListener() { // from class: com.mi.fitness.checkupdate.ota.SilentUpgradeManager$mDownloadListener$1
            @Override // com.mi.fitness.checkupdate.ota.DownloadListener
            public void onFinish(boolean result) {
                Logger.i("SilentUpgradeManager", "download finished result = " + result);
                if (result) {
                    SilentUpgradeManager silentUpgradeManager2 = SilentUpgradeManager.INSTANCE;
                    silentUpgradeManager2.updateState(SilentUpgradeState.UPGRADE_DOWNLOADED);
                    silentUpgradeManager2.upgradeIfNeed();
                }
            }

            @Override // com.mi.fitness.checkupdate.ota.DownloadListener
            public void onProgress(FwType type, int progress) {
                Logger.i("SilentUpgradeManager", "download progress type = " + type + ", progress = " + progress);
            }
        };
        mNetworkListener = new Function1<Boolean, Unit>() { // from class: com.mi.fitness.checkupdate.ota.SilentUpgradeManager$mNetworkListener$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public void invoke(boolean isConnect) {
                if (isConnect) {
                    Logger.i("SilentUpgradeManager", "network connected");
                    WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                    if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
                        SilentUpgradeManager.INSTANCE.checkUpgrade();
                    }
                    SilentUpgradeManager silentUpgradeManager2 = SilentUpgradeManager.INSTANCE;
                    silentUpgradeManager2.setNetworkListenerRegistered(false);
                    silentUpgradeManager2.unregisterNetworkListener();
                }
            }
        };
    }

    private SilentUpgradeManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkUpgrade() {
        Logger.i(TAG, "checkUpdate() called");
        CheckUpdatePreferenceSupport checkUpdatePreferenceSupport = CheckUpdatePreferenceSupport.INSTANCE;
        WearableDeviceModel wearableDeviceModel = mDeviceModel;
        WearableDeviceModel wearableDeviceModel2 = null;
        if (wearableDeviceModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            wearableDeviceModel = null;
        }
        if (checkUpdatePreferenceSupport.isSilentUpgradeOpen(wearableDeviceModel.getDid())) {
            if (NetworkStateUtil.INSTANCE.getInstance(ApplicationExtKt.getApplication()).getStateInfo(ApplicationExtKt.getApplication()).isConnected()) {
                CheckUpdateExtKt.getCheckUpdateManager().checkUpdate(new Function1() { // from class: zbm
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SilentUpgradeManager.checkUpgrade$lambda$2((Serializable) obj);
                    }
                });
                return;
            }
            if (!isNetworkListenerRegistered) {
                isNetworkListenerRegistered = true;
                NetworkExtKt.registerConnectChangeListener(mNetworkListener);
            }
            Logger.i(TAG, "checkUpdate called network not enable");
            return;
        }
        WearableDeviceModel wearableDeviceModel3 = mDeviceModel;
        if (wearableDeviceModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
        } else {
            wearableDeviceModel2 = wearableDeviceModel3;
        }
        Logger.i(TAG, "checkUpdate called current device silent upgrade is close " + wearableDeviceModel2 + ".did");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUpgrade$lambda$2(Serializable result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof LatestVersion) {
            LatestVersion latestVersion = (LatestVersion) result;
            Logger.i(TAG, "checkUpgrade: " + latestVersion.getIsNeedUpdate());
            if (latestVersion.getIsNeedUpdate()) {
                if (latestVersion.getForce()) {
                    SilentUpgradeExtKt.forceUpgrade(result);
                } else {
                    mOtaManager = new BluetoothOtaManager(latestVersion);
                }
            }
        } else if (result instanceof OtaUpgradeResult) {
            OtaUpgradeResult otaUpgradeResult = (OtaUpgradeResult) result;
            Logger.i(TAG, "checkUpdate: OtaUpgradeResult is force " + otaUpgradeResult.isForce());
            if (otaUpgradeResult.isNeedUpdate()) {
                if (otaUpgradeResult.isForce()) {
                    SilentUpgradeExtKt.forceUpgrade(result);
                } else {
                    mOtaManager = new HuamiOtaManager(otaUpgradeResult);
                }
            }
        } else {
            Logger.i(TAG, "checkUpdate: result " + result + "?");
        }
        IOtaManager iOtaManager = mOtaManager;
        boolean z = iOtaManager != null;
        Boolean boolValueOf = null;
        WearableDeviceModel wearableDeviceModel = null;
        if (iOtaManager != null) {
            WearableDeviceModel wearableDeviceModel2 = mDeviceModel;
            if (wearableDeviceModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            } else {
                wearableDeviceModel = wearableDeviceModel2;
            }
            boolValueOf = Boolean.valueOf(iOtaManager.isPushed(wearableDeviceModel.getDid()));
        }
        Logger.i(TAG, "checkUpdate: needUpgrade " + z + ", isPushed = " + boolValueOf);
        if (mOtaManager != null) {
            INSTANCE.downloadIfNeed();
        }
        return Unit.INSTANCE;
    }

    private final void clearSilentUpgradeState() {
        Logger.i(TAG, "clearSilentUpgradeState() called");
        mOtaManager = null;
        mHandler.removeCallbacks(mRunnable);
        updateState(SilentUpgradeState.UPGRADE_IDLE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r2.isSilentDownloadOnlyWifi(r3.getDid()) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void downloadIfNeed() {
        /*
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "downloadIfNeed() called thread "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "SilentUpgradeManager"
            com.xiaomi.fitness.common.log.Logger.i(r1, r0)
            com.mi.fitness.checkupdate.ota.IOtaManager r0 = com.mi.fitness.checkupdate.ota.SilentUpgradeManager.mOtaManager
            if (r0 != 0) goto L23
            return
        L23:
            r2 = 1
            if (r0 == 0) goto L3a
            boolean r0 = r0.isDownloaded()
            if (r0 != r2) goto L3a
            java.lang.String r0 = "downloadIfNeed: already downloaded"
            com.xiaomi.fitness.common.log.Logger.i(r1, r0)
            com.mi.fitness.checkupdate.ota.SilentUpgradeState r0 = com.mi.fitness.checkupdate.ota.SilentUpgradeState.UPGRADE_DOWNLOADED
            r4.updateState(r0)
            r4.upgradeIfNeed()
            goto L99
        L3a:
            com.xiaomi.fitness.common.utils.NetUtil r0 = com.xiaomi.fitness.common.utils.NetUtil.INSTANCE
            android.app.Application r3 = com.xiaomi.fitness.common.extensions.ApplicationExtKt.getApplication()
            int r0 = r0.getNetworkType(r3)
            if (r0 == r2) goto L82
            r2 = 4
            if (r0 == r2) goto L4b
            if (r0 != 0) goto L62
        L4b:
            com.mi.fitness.checkupdate.util.CheckUpdatePreferenceSupport r2 = com.mi.fitness.checkupdate.util.CheckUpdatePreferenceSupport.INSTANCE
            com.xiaomi.fitness.device.manager.export.WearableDeviceModel r3 = com.mi.fitness.checkupdate.ota.SilentUpgradeManager.mDeviceModel
            if (r3 != 0) goto L57
            java.lang.String r3 = "mDeviceModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r3 = 0
        L57:
            java.lang.String r3 = r3.getDid()
            boolean r2 = r2.isSilentDownloadOnlyWifi(r3)
            if (r2 != 0) goto L62
            goto L82
        L62:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "downloadIfNeed: network not allow to download , network type is "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.xiaomi.fitness.common.log.Logger.i(r1, r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            r1 = 10
            long r0 = r0.toMillis(r1)
            r4.retrySilentDelay(r0)
            goto L99
        L82:
            java.lang.String r0 = "downloadIfNeed: start silent download"
            com.xiaomi.fitness.common.log.Logger.i(r1, r0)
            com.mi.fitness.checkupdate.ota.SilentUpgradeState r0 = com.mi.fitness.checkupdate.ota.SilentUpgradeState.UPGRADE_DOWNLOADING
            r4.updateState(r0)
            com.mi.fitness.checkupdate.ota.IOtaManager r0 = com.mi.fitness.checkupdate.ota.SilentUpgradeManager.mOtaManager
            if (r0 == 0) goto L99
            kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.MainScope()
            com.mi.fitness.checkupdate.ota.SilentUpgradeManager$mDownloadListener$1 r2 = com.mi.fitness.checkupdate.ota.SilentUpgradeManager.mDownloadListener
            r0.startDownload(r1, r2)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mi.fitness.checkupdate.ota.SilentUpgradeManager.downloadIfNeed():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mRunnable$lambda$0() {
        WearableDeviceModel wearableDeviceModel = mDeviceModel;
        if (wearableDeviceModel == null) {
            Logger.i(TAG, "runnable retry deviceModel not init");
            return;
        }
        if (wearableDeviceModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            wearableDeviceModel = null;
        }
        if (!wearableDeviceModel.getIsDeviceConnected()) {
            Logger.i(TAG, "runnable retry deviceModel not connected");
        } else {
            Logger.i(TAG, "SilentUpgradeManager retry silent push");
            INSTANCE.checkUpgrade();
        }
    }

    private final void registerOtaPageReceiver() {
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(mOTAStateReceiver, new IntentFilter(SilentUpgradeExtKt.IN_OTA_PAGE_ACTION), 2);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(mOTAStateReceiver, new IntentFilter(SilentUpgradeExtKt.IN_OTA_PAGE_ACTION));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retrySilentDelay(long delayTime) {
        Logger.i(TAG, "retrySilentDelay: " + delayTime);
        Handler handler = mHandler;
        Runnable runnable = mRunnable;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, delayTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterNetworkListener() {
        NetworkExtKt.unregisterConnectChangeListener(mNetworkListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(SilentUpgradeState state) {
        Logger.i(TAG, "updateState() called " + state);
        mSilentUpgradeState = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit upgradeIfNeed$lambda$4$lambda$3(boolean z) {
        Logger.i(TAG, "upgradeIfNeed: startUpgrade result is " + z);
        if (z) {
            INSTANCE.updateState(SilentUpgradeState.UPGRADE_PUSHING);
        } else {
            INSTANCE.retrySilentDelay(TimeUnit.MINUTES.toMillis(10L));
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final SilentUpgradeState getSilentUpgradeState() {
        return mSilentUpgradeState;
    }

    public final void interruptSelf(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Logger.i(TAG, "interruptSelf: " + reason);
        updateState(SilentUpgradeState.UPGRADE_IDLE);
        IOtaManager iOtaManager = mOtaManager;
        if (iOtaManager != null) {
            iOtaManager.interruptIfNeed(reason);
        }
    }

    public final boolean isNetworkListenerRegistered() {
        return isNetworkListenerRegistered;
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(@Nullable String did) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(@Nullable String did) {
        if (did == null || did.length() == 0) {
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (!Intrinsics.areEqual(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, did)) {
            Logger.i(TAG, "onConnectSuccess: not current device model, no need upgrade");
            return;
        }
        if (!SilentUpgradeExtKt.supportSilentUpgrade(wearableDeviceModel)) {
            Logger.i(TAG, "onConnectSuccess: not support silent upgrade");
            return;
        }
        Logger.i(TAG, "onConnectSuccess() called with: did = " + did + ", " + mInOtaPage);
        mDeviceModel = wearableDeviceModel;
        if (mInOtaPage) {
            return;
        }
        checkUpgrade();
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(@Nullable String did) {
        WearableDeviceModel wearableDeviceModel = mDeviceModel;
        if (wearableDeviceModel != null) {
            if (wearableDeviceModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
                wearableDeviceModel = null;
            }
            if (!Intrinsics.areEqual(wearableDeviceModel.getDid(), did)) {
                return;
            }
        }
        clearSilentUpgradeState();
    }

    public final void setNetworkListenerRegistered(boolean z) {
        isNetworkListenerRegistered = z;
    }

    public final void upgradeIfNeed(@NotNull String otaPath) {
        Intrinsics.checkNotNullParameter(otaPath, "otaPath");
        Logger.i(TAG, "upgradeIfNeed() called with: otaPath = " + otaPath);
        Intent intent = new Intent(SilentUpgradeExtKt.SILENT_UPGRADE_ACTION);
        intent.putExtra("path", otaPath);
        ApplicationExtKt.getApplication().sendBroadcast(intent);
    }

    public final void upgradeIfNeed() {
        Logger.i(TAG, "upgradeIfNeed() called");
        if (mOtaManager == null) {
            Logger.i(TAG, "upgradeIfNeed: otaManager = null return");
            return;
        }
        if (mSilentUpgradeState != SilentUpgradeState.UPGRADE_DOWNLOADED) {
            Logger.i(TAG, "upgradeIfNeed: silent update state is " + mSilentUpgradeState);
            return;
        }
        IOtaManager iOtaManager = mOtaManager;
        if (iOtaManager != null) {
            iOtaManager.startUpgrade(new Function1() { // from class: acm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SilentUpgradeManager.upgradeIfNeed$lambda$4$lambda$3(((Boolean) obj).booleanValue());
                }
            });
        }
    }
}
