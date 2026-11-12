package com.xiaomi.hm.health.device.watch_skin;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.dfu.DfuState;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
public class WatchSkinSyncManager {
    private static final String c = "HMSkinSyncManager";
    private static Handler d;
    public static final /* synthetic */ boolean e = false;
    private Disposable a;
    private final Lazy<DeviceManagerApi> b;

    public interface SyncProgressListener {
        public static final int RESULT_CODE_FAIL = 1;
        public static final int RESULT_CODE_MUSIC = 4;
        public static final int RESULT_CODE_SPORT = 2;
        public static final int RESULT_CODE_SUCCESS = 0;
        public static final int RESULT_CODE_TIMING = 3;
        public static final int RESULT_CODE_USING_XIAOAI = 5;

        void onProgress(Progress progress);

        void onStart();

        void onStop(int i);
    }

    public class a extends HMCallback<DfuState> {
        public final /* synthetic */ SyncProgressListener a;
        public final /* synthetic */ String b;
        public final /* synthetic */ HMDeviceSource c;
        public final /* synthetic */ String d;
        public final /* synthetic */ byte[] e;
        public final /* synthetic */ HMMiLiProDevice f;

        public a(SyncProgressListener syncProgressListener, String str, HMDeviceSource hMDeviceSource, String str2, byte[] bArr, HMMiLiProDevice hMMiLiProDevice) {
            this.a = syncProgressListener;
            this.b = str;
            this.c = hMDeviceSource;
            this.d = str2;
            this.e = bArr;
            this.f = hMMiLiProDevice;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String l(HMDeviceSource hMDeviceSource, String str, String str2, byte[] bArr) throws Exception {
            try {
                return WatchSkinSyncManager.this.g(hMDeviceSource, str, str2, bArr);
            } catch (Exception e) {
                HMLog.i(WatchSkinSyncManager.c, "handleDialWithBg: " + e, new Object[0]);
                return "";
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(HMMiLiProDevice hMMiLiProDevice, SyncProgressListener syncProgressListener, String str) throws Exception {
            if (TextUtils.isEmpty(str)) {
                syncProgressListener.onStop(1);
            } else {
                WatchSkinSyncManager.this.i(hMMiLiProDevice, str, syncProgressListener);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void n(Throwable th) throws Exception {
            HMLog.i(WatchSkinSyncManager.c, "throwable: " + th, new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        @SuppressLint({"CheckResult"})
        public void onData(DfuState dfuState) {
            HMLog.i(WatchSkinSyncManager.c, "syncWF dfuState: " + dfuState.getState(), new Object[0]);
            if (dfuState.getState() == 32) {
                Handler handler = WatchSkinSyncManager.d;
                final SyncProgressListener syncProgressListener = this.a;
                handler.post(new Runnable() { // from class: com.xiaomi.hm.health.device.watch_skin.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        syncProgressListener.onStop(2);
                    }
                });
                return;
            }
            if (dfuState.getState() == 33) {
                Handler handler2 = WatchSkinSyncManager.d;
                final SyncProgressListener syncProgressListener2 = this.a;
                handler2.post(new Runnable() { // from class: com.xiaomi.hm.health.device.watch_skin.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        syncProgressListener2.onStop(3);
                    }
                });
                return;
            }
            if (dfuState.getState() == 48 && HMDeviceConfig.supportMusicControl()) {
                Handler handler3 = WatchSkinSyncManager.d;
                final SyncProgressListener syncProgressListener3 = this.a;
                handler3.post(new Runnable() { // from class: com.xiaomi.hm.health.device.watch_skin.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        syncProgressListener3.onStop(4);
                    }
                });
                return;
            }
            if (dfuState.getState() == 49) {
                Handler handler4 = WatchSkinSyncManager.d;
                final SyncProgressListener syncProgressListener4 = this.a;
                handler4.post(new Runnable() { // from class: com.xiaomi.hm.health.device.watch_skin.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        syncProgressListener4.onStop(5);
                    }
                });
                return;
            }
            if (!TextUtils.isEmpty(this.b)) {
                final HMDeviceSource hMDeviceSource = this.c;
                final String str = this.b;
                final String str2 = this.d;
                final byte[] bArr = this.e;
                Observable observableObserveOn = Observable.fromCallable(new Callable() { // from class: com.xiaomi.hm.health.device.watch_skin.s
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a.l(hMDeviceSource, str, str2, bArr);
                    }
                }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
                final HMMiLiProDevice hMMiLiProDevice = this.f;
                final SyncProgressListener syncProgressListener5 = this.a;
                observableObserveOn.subscribe(new Consumer() { // from class: com.xiaomi.hm.health.device.watch_skin.m
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) throws Exception {
                        this.a.m(hMMiLiProDevice, syncProgressListener5, (String) obj);
                    }
                }, new Consumer() { // from class: com.xiaomi.hm.health.device.watch_skin.n
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) throws Exception {
                        WatchSkinSyncManager.a.n((Throwable) obj);
                    }
                });
                return;
            }
            byte[] bArr2 = this.e;
            if (bArr2 == null) {
                WatchSkinSyncManager.this.i(this.f, this.d, this.a);
                return;
            }
            String strF = WatchSkinSyncManager.this.f(this.c, this.d, bArr2);
            StringBuilder sb = new StringBuilder();
            sb.append("assembleDialWithColor, ret: ");
            sb.append(strF != null);
            HMLog.i(WatchSkinSyncManager.c, sb.toString(), new Object[0]);
            if (strF != null) {
                WatchSkinSyncManager.this.i(this.f, strF, this.a);
            } else {
                WatchSkinSyncManager.this.i(this.f, this.d, this.a);
            }
        }
    }

    public class b implements IHMFirmwareUpgradeCallback {
        public final /* synthetic */ SyncProgressListener a;

        public b(SyncProgressListener syncProgressListener) {
            this.a = syncProgressListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(SyncProgressListener syncProgressListener, boolean z) {
            syncProgressListener.onStop(!z ? 1 : 0);
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwProgress(final Progress progress) {
            Handler handler = WatchSkinSyncManager.d;
            final SyncProgressListener syncProgressListener = this.a;
            handler.post(new Runnable() { // from class: com.xiaomi.hm.health.device.watch_skin.t
                @Override // java.lang.Runnable
                public final void run() {
                    syncProgressListener.onProgress(progress);
                }
            });
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStart(int i) {
            HMLog.i(WatchSkinSyncManager.c, "watch sync start, " + i, new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStop(final boolean z) {
            HMLog.i(WatchSkinSyncManager.c, "watch sync stop, result: " + z, new Object[0]);
            Handler handler = WatchSkinSyncManager.d;
            final SyncProgressListener syncProgressListener = this.a;
            handler.post(new Runnable() { // from class: com.xiaomi.hm.health.device.watch_skin.u
                @Override // java.lang.Runnable
                public final void run() {
                    WatchSkinSyncManager.b.d(syncProgressListener, z);
                }
            });
        }
    }

    public static class c {
        private static WatchSkinSyncManager a = new WatchSkinSyncManager();

        private c() {
        }
    }

    private WatchSkinSyncManager() {
        this.a = null;
        this.b = KoinJavaComponent.inject(DeviceManagerApi.class);
        d = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String f(HMDeviceSource hMDeviceSource, String str, byte[] bArr) {
        return DialBitmapProcessorFactory.INSTANCE.changeColorProcessor(null, hMDeviceSource, bArr).process(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String g(HMDeviceSource hMDeviceSource, String str, String str2, byte[] bArr) {
        DialBitmapProcessorFactory.Companion companion = DialBitmapProcessorFactory.INSTANCE;
        String strProcess = companion.createBitmapProcessor(hMDeviceSource).process(str);
        HMLog.i(c, "此时已经生成了目标bmp，开始组装表盘文件~", new Object[0]);
        return companion.createEmbedProcessor(hMDeviceSource, strProcess, bArr).process(str2);
    }

    public static WatchSkinSyncManager getInstance() {
        return c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(HMMiLiProDevice hMMiLiProDevice, String str, SyncProgressListener syncProgressListener) {
        hMMiLiProDevice.updateFwUpgrade(new HMFirmwareInfo(str, HMFirmwareType.FIRMWARE_DIAL), new b(syncProgressListener));
    }

    public void syncSkin(String str, String str2, byte[] bArr, @NonNull final SyncProgressListener syncProgressListener) {
        Handler handler = d;
        Objects.requireNonNull(syncProgressListener);
        handler.post(new Runnable() { // from class: il8
            @Override // java.lang.Runnable
            public final void run() {
                syncProgressListener.onStart();
            }
        });
        DeviceManagerApi value = this.b.getValue();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        HMDeviceSource boundDeviceSource = value.getBoundDeviceSource(hMDeviceType);
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) this.b.getValue().getDevice(hMDeviceType);
        if (hMMiLiProDevice != null && hMMiLiProDevice.isConnected()) {
            hMMiLiProDevice.getDfuState(new a(syncProgressListener, str, boundDeviceSource, str2, bArr, hMMiLiProDevice));
        } else {
            HMLog.i(c, "can't sync skin for no device connected.", new Object[0]);
            d.post(new Runnable() { // from class: hl8
                @Override // java.lang.Runnable
                public final void run() {
                    syncProgressListener.onStop(1);
                }
            });
        }
    }
}
