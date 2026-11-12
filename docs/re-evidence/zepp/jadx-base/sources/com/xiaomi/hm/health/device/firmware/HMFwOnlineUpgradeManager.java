package com.xiaomi.hm.health.device.firmware;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.device.core.agps.impl.store.AgpsTimeStore;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.injection.other.SmartExecutorApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.huami.wallet.ui.utils.WalletUI;
import com.xiaomi.hm.health.baseutil.ZipUtil;
import com.xiaomi.hm.health.bt.classic.HMSportController;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMBoltClassicDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.device.LullabyDevice;
import com.xiaomi.hm.health.bt.profile.base.BaseResourceInfo;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ExternalResourceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.base.SystemImageStatus;
import com.xiaomi.hm.health.bt.profile.dfu.ContinueModeExtraInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.IFirmwareInterruptedUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.dfu.OtaResult;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeModel;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.databases.model.FwDwonSuccessInfo;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.agps.HMAgpsUpgradeManager;
import com.xiaomi.hm.health.device.agps.LowBatteryApi;
import com.xiaomi.hm.health.device.bolt.FtmsErrorHelper;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import com.xiaomi.hm.health.device.event.HMNeverReminderEvent;
import com.xiaomi.hm.health.device.event.NewDfuUpgradeEvent;
import com.xiaomi.hm.health.device.feature.sync.SyncCenterManager;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.FwDaoManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.device.service.residentnoti.ResidentNotificationManager;
import com.xiaomi.hm.health.device.service.residentnoti.notify.DfuNotify;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMFwOnlineUpgradeManager {
    public static final int MILI_BATTERY_HIGH_LEVEL = 30;
    public static final int MILI_BATTERY_LEVEL = 10;
    public static boolean SUPPORT_CLOUD_FW_UPGRADE = true;
    private static final String q = "HMFwOnlineUpgradeManager";
    private static final int r = 20;
    private static final int s = 50;
    private static final int t = 4;
    private static final Lazy<DeviceManagerApi> u = KoinJavaComponent.inject(DeviceManagerApi.class);
    private static HMFwOnlineUpgradeManager v = null;
    private static final int w = 1;
    private static final int x = 2;
    private boolean a = true;
    private final Lazy<SmartExecutorApi> b;
    private final Executor c;
    private final Lazy<KeeperProxyApi> d;
    private final Lazy<DeviceXNavigator> e;
    private final SparseBooleanArray f;
    private HMFwOnlineUpgradeInfo g;
    private HMFwOnlineUpgradeInfo h;
    private HMDeviceSource i;
    private List<HMFwOnlineUpgradeInfo> j;
    private List<HMFwOnlineUpgradeInfo> k;
    private HMDeviceFwUpgradeEvent l;
    private volatile boolean m;
    private boolean n;
    private Lazy<LowBatteryApi> o;
    private long p;

    public class a implements Runnable, IHMFirmwareUpgradeCallback {
        private List<HMFwOnlineUpgradeInfo> a;
        private HMDeviceType d;
        private HMDeviceSource e;
        private boolean h;
        private int i;
        private List<Integer> b = new ArrayList();
        private Progress f = new Progress();
        private int g = -1;
        private long j = System.currentTimeMillis();
        private final ConditionVariable c = new ConditionVariable();

        public a(List<HMFwOnlineUpgradeInfo> list) {
            this.h = false;
            this.a = list;
            HMDeviceSource deviceSource = list.get(0).getDeviceSource();
            this.e = deviceSource;
            this.d = deviceSource.getType();
            HMFwOnlineUpgradeManager.this.p = System.currentTimeMillis();
            this.h = false;
            Iterator<HMFwOnlineUpgradeInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                File file = new File(it2.next().getFwFilePath());
                this.b.add(Integer.valueOf(this.i));
                this.i = (int) (((long) this.i) + file.length());
            }
            this.f.total = this.i;
        }

        private void a(boolean z) {
            HMDeviceType type = HMDeviceType.MILI;
            List<HMFwOnlineUpgradeInfo> list = this.a;
            if (list != null && list.size() > 0) {
                type = this.a.get(0).getDeviceSource().getType();
            }
            if (z) {
                HMFwOnlineAnalyticsKt.firmwareUpgradeSuccessContinue(this.a, HMFwOnlineUpgradeManager.y(this.j));
            } else {
                HMFwOnlineAnalyticsKt.firmwareUpgradeFailContinue(this.a, HMFwOnlineUpgradeManager.z(type), HMFwOnlineUpgradeManager.y(this.j));
            }
        }

        private String b(int i) {
            List<HMFwOnlineUpgradeInfo> list = this.a;
            if (list == null || list.size() <= i) {
                return null;
            }
            return this.a.get(i).getChangeLog();
        }

        private int c(int i) {
            List<HMFwOnlineUpgradeInfo> list = this.a;
            if (list == null || list.size() <= i) {
                return 0;
            }
            return this.a.get(i).getFwType();
        }

        private HMFirmwareType d(int i) {
            HMFirmwareType hMFirmwareType = HMFirmwareType.FIRMWARE;
            List<HMFwOnlineUpgradeInfo> list = this.a;
            return (list == null || list.size() <= i) ? hMFirmwareType : this.a.get(i).getFirmwareType();
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwProgress(Progress progress) {
            HMLog.d(HMFwOnlineUpgradeManager.q, "FwBatchTask onProgress:" + progress.getPercent(), new Object[0]);
            this.f.progress = this.b.get(this.g).intValue() + progress.progress;
            HMFirmwareType hMFirmwareTypeD = d(this.g);
            int iC = c(this.g);
            String strB = b(this.g);
            HMFwOnlineUpgradeManager.this.l = new HMDeviceFwUpgradeEvent(this.e, hMFirmwareTypeD, this.f);
            HMFwOnlineUpgradeManager.this.l.setmFwType(iC);
            HMFwOnlineUpgradeManager.this.l.setContinuousUpgrade(true);
            HMFwOnlineUpgradeManager.this.l.setmUpgradeLog(strB);
            EventBus.getDefault().post(HMFwOnlineUpgradeManager.this.l);
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStart(int i) {
            HMLog.i(HMFwOnlineUpgradeManager.q, "FwBatchTask onFwStart", new Object[0]);
            this.j = System.currentTimeMillis();
            HMFirmwareType hMFirmwareTypeD = d(this.g);
            int iC = c(this.g);
            String strB = b(this.g);
            HMFwOnlineUpgradeManager.this.l = new HMDeviceFwUpgradeEvent(this.e, hMFirmwareTypeD, 0);
            HMFwOnlineUpgradeManager.this.l.setProgress(this.f);
            HMFwOnlineUpgradeManager.this.l.setmFwType(iC);
            HMFwOnlineUpgradeManager.this.l.setmUpgradeLog(strB);
            HMFwOnlineUpgradeManager.this.l.setContinuousUpgrade(true);
            EventBus.getDefault().post(HMFwOnlineUpgradeManager.this.l);
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStop(boolean z) {
            a(z);
            HMLog.i(HMFwOnlineUpgradeManager.q, "FwBatchTask onFwStop:" + z, new Object[0]);
            HMFirmwareType hMFirmwareTypeD = d(this.g);
            int iC = c(this.g);
            String strB = b(this.g);
            if (this.g == this.a.size() - 1 && z) {
                HMFwOnlineUpgradeManager.this.m = false;
                this.c.open();
                HMLog.i(HMFwOnlineUpgradeManager.q, "FwBatchTask onFwStop: finish", new Object[0]);
                HMFwOnlineUpgradeManager.this.p = -1L;
                HMFwOnlineUpgradeManager.this.l = new HMDeviceFwUpgradeEvent(this.e, hMFirmwareTypeD, 2, true);
                HMFwOnlineUpgradeManager.this.l.setmFwType(iC);
                HMFwOnlineUpgradeManager.this.l.setmUpgradeLog(strB);
                HMFwOnlineUpgradeManager.this.l.setContinuousUpgrade(true);
                EventBus.getDefault().post(HMFwOnlineUpgradeManager.this.l);
                return;
            }
            if (!z) {
                HMFwOnlineUpgradeManager.this.m = false;
                this.h = true;
                HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.this;
                List<HMFwOnlineUpgradeInfo> list = this.a;
                hMFwOnlineUpgradeManager.j = list.subList(this.g, list.size());
                HMFwOnlineUpgradeManager.this.l = new HMDeviceFwUpgradeEvent(this.e, hMFirmwareTypeD, 2, false);
                HMFwOnlineUpgradeManager.this.l.setmFwType(iC);
                HMFwOnlineUpgradeManager.this.l.setmUpgradeLog(strB);
                HMFwOnlineUpgradeManager.this.l.setContinuousUpgrade(true);
                EventBus.getDefault().post(HMFwOnlineUpgradeManager.this.l);
            }
            this.c.open();
        }

        @Override // java.lang.Runnable
        public void run() {
            HMLog.i(HMFwOnlineUpgradeManager.q, "FwBatchTask upgrade fw :" + this.a.size(), new Object[0]);
            HMBaseDevice device = ((DeviceManagerApi) HMFwOnlineUpgradeManager.u.getValue()).getDevice(this.d);
            if (device == null || !device.isConnected()) {
                HMLog.i(HMFwOnlineUpgradeManager.q, "Device is not connected", new Object[0]);
                return;
            }
            HMFwOnlineUpgradeManager.this.m = true;
            HMLog.i(HMFwOnlineUpgradeManager.q, "FwBatchTask In main fw task", new Object[0]);
            int i = 0;
            while (i < this.a.size() && !this.h) {
                this.g = i;
                HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo = this.a.get(i);
                File file = new File(hMFwOnlineUpgradeInfo.getFwFilePath());
                HMLog.i(HMFwOnlineUpgradeManager.q, "FwBatchTask upgrade " + hMFwOnlineUpgradeInfo.getFwFilePath(), new Object[0]);
                HMFirmwareInfo hMFirmwareInfo = new HMFirmwareInfo(file.getPath(), hMFwOnlineUpgradeInfo.getFirmwareType(), i == this.a.size() - 1 ? HMFirmwareInfo.ContinueUpgradeState.LAST : HMFirmwareInfo.ContinueUpgradeState.CONTINUE, this.i);
                hMFirmwareInfo.setContinueModeExtraInfo(new ContinueModeExtraInfo(i, this.a.size(), this.i));
                hMFirmwareInfo.setUpgradeModel(UpgradeModel.CONTINUE_UPGRADE);
                device.updateFwUpgrade(hMFirmwareInfo, this);
                this.c.close();
                this.c.block();
                i++;
            }
            try {
                Thread.sleep(2000L);
            } catch (Exception e) {
                HMLog.i(HMFwOnlineUpgradeManager.q, e.toString(), new Object[0]);
            }
            HMLog.i(HMFwOnlineUpgradeManager.q, "FwBatchTask Out main fw task", new Object[0]);
        }
    }

    public class b implements Runnable, IFirmwareInterruptedUpgradeCallback {
        public HMFwOnlineUpgradeInfo a;
        private final ConditionVariable b;
        private HMFirmwareType c;
        private Progress d = null;
        private int e = 1;
        private long f = System.currentTimeMillis();
        private int g = 1;

        public b(HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo) {
            HMFwOnlineUpgradeManager.this.p = System.currentTimeMillis();
            this.a = hMFwOnlineUpgradeInfo;
            this.b = new ConditionVariable();
            this.c = hMFwOnlineUpgradeInfo.getFirmwareType();
        }

        private void f(HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo, boolean z) {
            if (z) {
                if (i()) {
                    HMLog.i(HMFwOnlineUpgradeManager.q, "打了静默传输，传输成功的点,耗时：" + HMFwOnlineUpgradeManager.y(this.f), new Object[0]);
                    HMFwOnlineAnalyticsKt.firmwareTransferSuccessBatch(hMFwOnlineUpgradeInfo, HMFwOnlineUpgradeManager.y(this.f));
                    return;
                }
                if (h()) {
                    HMLog.i(HMFwOnlineUpgradeManager.q, "打了强制升级，升级成功的点,耗时：" + HMFwOnlineUpgradeManager.y(this.f), new Object[0]);
                    HMFwOnlineAnalyticsKt.firmwareUpgradeSuccessBatch(hMFwOnlineUpgradeInfo, HMFwOnlineUpgradeManager.y(this.f));
                    return;
                }
                return;
            }
            HMDeviceType type = HMDeviceType.MILI;
            HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo2 = this.a;
            if (hMFwOnlineUpgradeInfo2 != null) {
                type = hMFwOnlineUpgradeInfo2.getDeviceSource().getType();
            }
            if (i()) {
                HMLog.i(HMFwOnlineUpgradeManager.q, "打了静默传输，传输失败的点,耗时：" + HMFwOnlineUpgradeManager.y(this.f), new Object[0]);
                HMFwOnlineAnalyticsKt.firmwareTransferFailBatch(hMFwOnlineUpgradeInfo, HMFwOnlineUpgradeManager.z(type), HMFwOnlineUpgradeManager.y(this.f));
                return;
            }
            if (h()) {
                if (this.g == 1) {
                    HMLog.i(HMFwOnlineUpgradeManager.q, "打了强制升级，传输失败的点,耗时：" + HMFwOnlineUpgradeManager.y(this.f), new Object[0]);
                    HMFwOnlineAnalyticsKt.firmwareTransferFailBatch(hMFwOnlineUpgradeInfo, HMFwOnlineUpgradeManager.z(type), HMFwOnlineUpgradeManager.y(this.f));
                    return;
                }
                HMLog.i(HMFwOnlineUpgradeManager.q, "打了强制升级，升级失败的点,耗时：" + HMFwOnlineUpgradeManager.y(this.f), new Object[0]);
                HMFwOnlineAnalyticsKt.firmwareUpgradeFailBatch(hMFwOnlineUpgradeInfo, HMFwOnlineUpgradeManager.z(type), HMFwOnlineUpgradeManager.y(this.f));
            }
        }

        @Nullable
        private HMFirmwareInfo g() {
            File file;
            try {
                String fwFilePath = this.a.getFwFilePath();
                Objects.requireNonNull(fwFilePath);
                file = new File(fwFilePath);
            } catch (Exception e) {
                HMLog.w(HMFwOnlineUpgradeManager.q, e, "getFirewareInfo", new Object[0]);
                file = null;
            }
            if (file == null) {
                return null;
            }
            HMLog.i(HMFwOnlineUpgradeManager.q, file.getAbsolutePath(), new Object[0]);
            if (this.a.getDeviceSource().getType() != HMDeviceType.EARBUD) {
                HMLog.i(HMFwOnlineUpgradeManager.q, file.getAbsolutePath(), new Object[0]);
                HMFirmwareInfo hMFirmwareInfo = new HMFirmwareInfo(file.getPath(), this.c);
                hMFirmwareInfo.setSilent(this.a.isSilent());
                HMLog.i(HMFwOnlineUpgradeManager.q, "isSilent: " + this.a.isSilent(), new Object[0]);
                hMFirmwareInfo.setUpgradeModel(this.a.isSilent() ? UpgradeModel.BACKGROUND : UpgradeModel.FOREGROUND);
                return hMFirmwareInfo;
            }
            try {
                File file2 = new File(file.getParent() == null ? DeviceXFunctionsKt.getContext().getFilesDir().getAbsolutePath() : file.getParent(), this.a.getFwVersionName());
                ArrayList<File> arrayListUpZipSelectedFile = ZipUtil.upZipSelectedFile(file, file2.getAbsolutePath(), "left");
                File file3 = !arrayListUpZipSelectedFile.isEmpty() ? arrayListUpZipSelectedFile.get(0) : null;
                ArrayList<File> arrayListUpZipSelectedFile2 = ZipUtil.upZipSelectedFile(file, file2.getAbsolutePath(), "right");
                File file4 = !arrayListUpZipSelectedFile2.isEmpty() ? arrayListUpZipSelectedFile2.get(0) : null;
                if (file3 != null && file4 != null) {
                    HMFirmwareInfo hMFirmwareInfo2 = new HMFirmwareInfo(file3.getAbsolutePath(), this.c);
                    hMFirmwareInfo2.setOtherFwPath(file4.getAbsolutePath());
                    return hMFirmwareInfo2;
                }
                HMLog.i(HMFwOnlineUpgradeManager.q, "earbud fwfile unzip fail,fwPath:" + this.a.getFwFilePath(), new Object[0]);
                return null;
            } catch (Exception e2) {
                HMLog.e(HMFwOnlineUpgradeManager.q, "earbud fwfile unzip fail,fwPath:" + this.a.getFwFilePath(), e2);
                e2.printStackTrace();
                return null;
            }
        }

        private boolean h() {
            HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo = this.a;
            return (hMFwOnlineUpgradeInfo == null || hMFwOnlineUpgradeInfo.getFirmwareType() != HMFirmwareType.FIRMWARE_BATCH || this.a.isSilent()) ? false : true;
        }

        private boolean i() {
            HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo = this.a;
            return hMFwOnlineUpgradeInfo != null && hMFwOnlineUpgradeInfo.getFirmwareType() == HMFirmwareType.FIRMWARE_BATCH && this.a.isSilent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String j() {
            return HMFwOnlineUpgradeManager.this.l.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String k() {
            return HMFwOnlineUpgradeManager.this.l.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String l() {
            return "Upgrade info:" + this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String m() {
            return "Device is not connected!!!";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String n() {
            return "In main fw task...";
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
        public void onError(int i) {
            this.e = i;
            HMFwOnlineUpgradeManager.this.l = new HMDeviceFwUpgradeEvent(this.a.getDeviceSource(), this.c, 2, false);
            HMFwOnlineUpgradeManager.this.l.setErrorCode(this.e);
            HMFwOnlineUpgradeManager.this.l.setFwVersion(this.a.getFwVersionName());
            HMFwOnlineUpgradeManager.this.l.setSupportPresetFirmwareInformation(this.a.isSupportPresetFirmwareInformation());
            EventBus.getDefault().postSticky(HMFwOnlineUpgradeManager.this.l);
            HMLog.info(HMFwOnlineUpgradeManager.q, new Function0() { // from class: com.xiaomi.hm.health.device.firmware.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.j();
                }
            });
            HMLog.i(HMFwOnlineUpgradeManager.q, "onError: " + i, new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwProgress(Progress progress) {
            if (this.d == null || progress.getPercent() != this.d.getPercent()) {
                HMFwOnlineUpgradeManager.this.l = new HMDeviceFwUpgradeEvent(this.a.getDeviceSource(), this.c, progress);
                HMFwOnlineUpgradeManager.this.l.setSupportPresetFirmwareInformation(this.a.isSupportPresetFirmwareInformation());
                EventBus.getDefault().post(HMFwOnlineUpgradeManager.this.l);
                this.d = progress;
            }
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStart(int i) {
            this.f = System.currentTimeMillis();
            HMLog.d(HMFwOnlineUpgradeManager.q, "onFwStart", new Object[0]);
            HMFwOnlineUpgradeManager.this.l = new HMDeviceFwUpgradeEvent(this.a.getDeviceSource(), this.c, 0);
            HMFwOnlineUpgradeManager.this.l.setFwVersion(this.a.getFwVersionName());
            HMFwOnlineUpgradeManager.this.l.setSupportPresetFirmwareInformation(this.a.isSupportPresetFirmwareInformation());
            EventBus.getDefault().post(HMFwOnlineUpgradeManager.this.l);
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStop(boolean z) {
            f(this.a, z);
            HMFwOnlineUpgradeManager.this.p = -1L;
            HMLog.d(HMFwOnlineUpgradeManager.q, "onFwStop:" + z, new Object[0]);
            if (!z) {
                HMFwOnlineUpgradeManager.this.g = this.a;
            }
            HMFwOnlineUpgradeManager.this.m = false;
            HMFwOnlineUpgradeManager.this.l = new HMDeviceFwUpgradeEvent(this.a.getDeviceSource(), this.c, 2, z);
            HMFwOnlineUpgradeManager.this.l.setErrorCode(this.e);
            HMFwOnlineUpgradeManager.this.l.setFwVersion(this.a.getFwVersionName());
            HMFwOnlineUpgradeManager.this.l.setSupportPresetFirmwareInformation(this.a.isSupportPresetFirmwareInformation());
            EventBus.getDefault().postSticky(HMFwOnlineUpgradeManager.this.l);
            HMLog.info(HMFwOnlineUpgradeManager.q, new Function0() { // from class: com.xiaomi.hm.health.device.firmware.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.k();
                }
            });
            this.b.open();
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareInterruptedUpgradeCallback
        public boolean onInterrupted() {
            HMDeviceType type;
            if (!this.a.isSilent() || this.a.getDeviceSource() == null || (type = this.a.getDeviceSource().getType()) == null) {
                return false;
            }
            return HMAgpsUpgradeManager.hasAgpsUpgrade(DeviceXFunctionsKt.getContext(), type);
        }

        @Override // java.lang.Runnable
        public void run() {
            HMLog.info(HMFwOnlineUpgradeManager.q, new Function0() { // from class: com.xiaomi.hm.health.device.firmware.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.l();
                }
            });
            HMDeviceType type = this.a.getDeviceSource().getType();
            HMBaseDevice device = ((DeviceManagerApi) HMFwOnlineUpgradeManager.u.getValue()).getDevice(type);
            if (device == null || !((DeviceManagerApi) HMFwOnlineUpgradeManager.u.getValue()).isConnected(type)) {
                HMLog.info(HMFwOnlineUpgradeManager.q, new Function0() { // from class: com.xiaomi.hm.health.device.firmware.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMFwOnlineUpgradeManager.b.m();
                    }
                });
                if (this.c == HMFirmwareType.FIRMWARE_BATCH) {
                    onFwStop(false);
                }
                if (this.c == HMFirmwareType.FIRMWARE && this.a.getDeviceSource() == HMDeviceSource.OTHER_HAYDN) {
                    onFwStop(false);
                    return;
                }
                return;
            }
            HMLog.info(HMFwOnlineUpgradeManager.q, new Function0() { // from class: com.xiaomi.hm.health.device.firmware.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMFwOnlineUpgradeManager.b.n();
                }
            });
            HMFwOnlineUpgradeManager.this.m = true;
            HMFirmwareInfo hMFirmwareInfoG = g();
            if (hMFirmwareInfoG == null) {
                onFwStop(false);
                return;
            }
            hMFirmwareInfoG.setSilent(this.a.isSilent());
            device.updateFwUpgrade(hMFirmwareInfoG, this);
            this.b.block();
            if (this.c == HMFirmwareType.RESOURCE_BASE) {
                HMFwOnlineUpgradeManager.this.enableFwUpgrade(this.a.getFwType(), true);
            }
            try {
                Thread.sleep(2000L);
            } catch (Exception e) {
                HMLog.d(HMFwOnlineUpgradeManager.q, e.toString(), new Object[0]);
            }
            HMLog.d(HMFwOnlineUpgradeManager.q, "Out main fw task...", new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
        public void upgradingProgress(@NotNull HMFirmwareType hMFirmwareType, @NotNull Progress progress) {
            if (this.g == 1 && h()) {
                HMLog.i(HMFwOnlineUpgradeManager.q, "打了前台升级，传输成功的点,耗时：" + HMFwOnlineUpgradeManager.y(this.f), new Object[0]);
                this.g = 2;
                HMFwOnlineAnalyticsKt.firmwareTransferSuccessBatch(this.a, HMFwOnlineUpgradeManager.y(this.f));
            }
            EventBus.getDefault().post(new NewDfuUpgradeEvent(this.a.getDeviceSource(), this.c, progress));
        }
    }

    private HMFwOnlineUpgradeManager() {
        Lazy<SmartExecutorApi> lazyInject = KoinJavaComponent.inject(SmartExecutorApi.class);
        this.b = lazyInject;
        this.c = lazyInject.getValue().getSerialExecutor();
        this.d = KoinJavaComponent.inject(KeeperProxyApi.class);
        this.e = KoinJavaComponent.inject(DeviceXNavigator.class);
        this.f = new SparseBooleanArray();
        this.i = HMDeviceSource.VDEVICE;
        this.l = null;
        this.m = false;
        this.n = false;
        this.o = KoinJavaComponent.inject(LowBatteryApi.class);
        this.p = -1L;
        UpgradeStateHolder.INSTANCE.register();
    }

    private HMFwOnlineUpgradeInfo A(FwDwonSuccessInfo fwDwonSuccessInfo, Context context, HMDeviceSource hMDeviceSource, int i, String str, String str2, int i2, int i3) {
        if (fwDwonSuccessInfo == null) {
            return null;
        }
        String fwPath = fwDwonSuccessInfo.getFwPath();
        String localMd5Content = fwDwonSuccessInfo.getLocalMd5Content();
        HMLog.i(q, "fwPath = " + fwPath + "; md5Content = " + localMd5Content, new Object[0]);
        if (TextUtils.isEmpty(fwPath) || TextUtils.isEmpty(localMd5Content) || !fwPath.contains(localMd5Content)) {
            HMLog.i(q, "fwFile is mismatch", new Object[0]);
            return null;
        }
        if (new File(fwPath).exists()) {
            return new HMFwOnlineUpgradeInfo(context, hMDeviceSource, i, fwPath, str, str2, i2, i3, fwDwonSuccessInfo.getForceUpgrade() == null || fwDwonSuccessInfo.getForceUpgrade().booleanValue(), fwDwonSuccessInfo.getChangeLog());
        }
        HMLog.i(q, "fwFile on sdcard is not exists", new Object[0]);
        return null;
    }

    private HMDeviceSource B() {
        return this.i;
    }

    private HMFirmwareType C(boolean z) {
        if (isSupportContinueUpgrade(this.i)) {
            return (z ? this.j : this.k).get(0).getFirmwareType();
        }
        return (z ? this.g : this.h).getFirmwareType();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0034: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:17:0x0034 */
    private static byte[] D(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    int iAvailable = fileInputStream.available();
                    byte[] bArr = new byte[iAvailable];
                    if (fileInputStream.read(bArr) != iAvailable) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                            HMLog.d(q, e.toString(), new Object[0]);
                        }
                        return null;
                    }
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        HMLog.d(q, e2.toString(), new Object[0]);
                    }
                    return bArr;
                } catch (Exception e3) {
                    e = e3;
                    HMLog.d(q, e.getMessage(), new Object[0]);
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            HMLog.d(q, e4.toString(), new Object[0]);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream3 = fileInputStream2;
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (IOException e5) {
                        HMLog.d(q, e5.toString(), new Object[0]);
                    }
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream3 != null) {
                fileInputStream3.close();
            }
            throw th;
        }
    }

    private int F(boolean z) {
        if (isSupportContinueUpgrade(this.i)) {
            return (z ? this.j : this.k).get(0).getFwType();
        }
        return (z ? this.g : this.h).getFwType();
    }

    private List<HMFwOnlineUpgradeInfo> G(Context context, HMDeviceType hMDeviceType, DeviceInfo deviceInfo) {
        ArrayList arrayList = new ArrayList();
        boolean z = !O(context, hMDeviceType);
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckDeviceVersion = checkDeviceVersion(context, hMDeviceType);
        if (z && hMFwOnlineUpgradeInfoCheckDeviceVersion != null) {
            arrayList.add(hMFwOnlineUpgradeInfoCheckDeviceVersion);
            return arrayList;
        }
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckChaohuGps = checkChaohuGps(context, hMDeviceType);
        if (hMFwOnlineUpgradeInfoCheckChaohuGps != null) {
            arrayList.add(hMFwOnlineUpgradeInfoCheckChaohuGps);
        }
        if (hMDeviceType != HMDeviceType.MILI) {
            HMLog.d(q, "return as not mili!!!", new Object[0]);
            return arrayList;
        }
        if (u.getValue().getDevice(hMDeviceType) == null) {
            return null;
        }
        if (deviceInfo == null) {
            HMLog.d(q, "return as no device info!!!", new Object[0]);
            return arrayList;
        }
        if (!HMDeviceConfig.hasFeatureFontRes(deviceInfo.getDeviceSource())) {
            HMLog.d(q, "return as not support device!!!", new Object[0]);
            return arrayList;
        }
        HMOtherVersion otherVersion = deviceInfo.getOtherVersion();
        HMLog.d(q, "HMOtherVersion:" + otherVersion, new Object[0]);
        if (otherVersion == null) {
            HMLog.d(q, "return as no version info!!!", new Object[0]);
            return arrayList;
        }
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckFont = checkFont(context, deviceInfo);
        if (hMFwOnlineUpgradeInfoCheckFont != null) {
            arrayList.add(hMFwOnlineUpgradeInfoCheckFont);
        }
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckBaseResource = checkBaseResource(context, deviceInfo);
        if (hMFwOnlineUpgradeInfoCheckBaseResource != null) {
            arrayList.add(hMFwOnlineUpgradeInfoCheckBaseResource);
        }
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckResource = checkResource(context, deviceInfo);
        if (hMFwOnlineUpgradeInfoCheckResource != null) {
            arrayList.add(hMFwOnlineUpgradeInfoCheckResource);
        }
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckExtResource = checkExtResource(context, deviceInfo);
        if (hMFwOnlineUpgradeInfoCheckExtResource != null) {
            arrayList.add(hMFwOnlineUpgradeInfoCheckExtResource);
        }
        if (hMFwOnlineUpgradeInfoCheckDeviceVersion != null) {
            arrayList.add(hMFwOnlineUpgradeInfoCheckDeviceVersion);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo = (HMFwOnlineUpgradeInfo) arrayList.get(i);
            if (hMFwOnlineUpgradeInfo != null && hMFwOnlineUpgradeInfo.getFirmwareType() == HMFirmwareType.FIRMWARE) {
                return arrayList.subList(0, i + 1);
            }
        }
        return arrayList;
    }

    private static int H(String str) throws Throwable {
        int fwOrder = -1;
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    int iAvailable = fileInputStream2.available() - 96;
                    long jSkip = fileInputStream2.skip(iAvailable);
                    byte[] bArr = new byte[32];
                    fileInputStream2.read(bArr);
                    HMFwHeader hMFwHeader = HMFwHeader.parse(bArr);
                    HMLog.d(q, "HMFwHeader:" + hMFwHeader, new Object[0]);
                    HMLog.d(q, "skipped:" + jSkip + ",skip:" + iAvailable, new Object[0]);
                    if (hMFwHeader != null && hMFwHeader.isValid()) {
                        fwOrder = hMFwHeader.getFwOrder();
                    }
                    try {
                        fileInputStream2.close();
                    } catch (IOException e) {
                        HMLog.d(q, e.toString(), new Object[0]);
                    }
                    return fwOrder;
                } catch (Exception e2) {
                    e = e2;
                    fileInputStream = fileInputStream2;
                    HMLog.d(q, e.getMessage(), new Object[0]);
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            HMLog.d(q, e3.toString(), new Object[0]);
                        }
                    }
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            HMLog.d(q, e4.toString(), new Object[0]);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    private FwDwonSuccessInfo I(HMDeviceType hMDeviceType) {
        DeviceInfo deviceInfo;
        HMBaseDevice device = u.getValue().getDevice(hMDeviceType);
        if (device == null || (deviceInfo = device.getDeviceInfo()) == null) {
            return null;
        }
        return FwDaoManager.getManager().getInfo(deviceInfo.getDeviceSource(), deviceInfo.getProductVersion());
    }

    private boolean J(FwDwonSuccessInfo fwDwonSuccessInfo) {
        return (fwDwonSuccessInfo == null || TextUtils.isEmpty(fwDwonSuccessInfo.getBaseResource()) || TextUtils.isEmpty(fwDwonSuccessInfo.getBaseResourceName()) || TextUtils.isEmpty(fwDwonSuccessInfo.getBaseResourcePath()) || fwDwonSuccessInfo.getBaseResourceVersionCode() == null) ? false : true;
    }

    private boolean K(int i) {
        return this.f.get(i, true);
    }

    private boolean L(FwDwonSuccessInfo fwDwonSuccessInfo) {
        return (fwDwonSuccessInfo == null || TextUtils.isEmpty(fwDwonSuccessInfo.getExternalResource()) || TextUtils.isEmpty(fwDwonSuccessInfo.getExternalResourceName()) || TextUtils.isEmpty(fwDwonSuccessInfo.getExternalResourcePath()) || fwDwonSuccessInfo.getExternalResourceVersionCode() == null) ? false : true;
    }

    private boolean M(FwDwonSuccessInfo fwDwonSuccessInfo) {
        return (fwDwonSuccessInfo == null || TextUtils.isEmpty(fwDwonSuccessInfo.getFont()) || TextUtils.isEmpty(fwDwonSuccessInfo.getFontName()) || TextUtils.isEmpty(fwDwonSuccessInfo.getFontPath()) || fwDwonSuccessInfo.getFontVersionCode() == null) ? false : true;
    }

    private boolean N(FwDwonSuccessInfo fwDwonSuccessInfo) {
        return (fwDwonSuccessInfo == null || TextUtils.isEmpty(fwDwonSuccessInfo.getGps()) || TextUtils.isEmpty(fwDwonSuccessInfo.getGpsName()) || TextUtils.isEmpty(fwDwonSuccessInfo.getGpsPath()) || TextUtils.isEmpty(fwDwonSuccessInfo.getGpsVersionCode())) ? false : true;
    }

    private boolean O(Context context, HMDeviceType hMDeviceType) throws Throwable {
        DeviceInfo deviceInfo;
        FwDwonSuccessInfo info;
        HMBaseDevice device = u.getValue().getDevice(hMDeviceType);
        if (device == null || (deviceInfo = device.getDeviceInfo()) == null || (info = FwDaoManager.getManager().getInfo(deviceInfo.getDeviceSource(), deviceInfo.getProductVersion())) == null || TextUtils.isEmpty(info.getFwPath())) {
            return false;
        }
        HMOtherVersion otherVersion = deviceInfo.getOtherVersion();
        HMLog.i(q, "[fwOrder], version: " + otherVersion, new Object[0]);
        if (otherVersion == null) {
            return false;
        }
        int iH = H(info.getFwPath());
        HMLog.i(q, "[fwOrder], fwOrder: " + iH, new Object[0]);
        return iH != -1 && iH == otherVersion.getVersion();
    }

    private boolean P(FwDwonSuccessInfo fwDwonSuccessInfo) {
        return (fwDwonSuccessInfo == null || TextUtils.isEmpty(fwDwonSuccessInfo.getResource()) || TextUtils.isEmpty(fwDwonSuccessInfo.getResourceName()) || TextUtils.isEmpty(fwDwonSuccessInfo.getResourcePath()) || fwDwonSuccessInfo.getResourceVersionCode() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit Q(HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo, Long l, OtaResult otaResult) {
        boolean z = false;
        HMLog.i(q, "crc: " + l, new Object[0]);
        EventBus.getDefault().post(new HMNeverReminderEvent(false, l == null ? -1L : this.d.getValue().getOtaStatus(l.longValue())));
        if (l == null) {
            return null;
        }
        if (otaResult != null && l.equals(otaResult.getCrc())) {
            z = true;
        }
        if (!z) {
            UpgradeStateHolder upgradeStateHolder = UpgradeStateHolder.INSTANCE;
            if (upgradeStateHolder.isNone()) {
                if (this.d.getValue().getOtaStatus(l.longValue()) == 0) {
                    showSilentUpgradeDlg(hMFwOnlineUpgradeInfo.getChangeLogForApp(), l);
                }
                ResidentNotificationManager.showNotification(DfuNotify.INSTANCE);
                upgradeStateHolder.setState(1);
                startFwUpgrade();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String R() {
        return "Low battery";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String S() {
        return "耳机只有在强制升级时才触发升级页面";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit T(HMBaseDevice hMBaseDevice, boolean z, boolean z2, HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo, boolean z3, Context context, HMDeviceType hMDeviceType, boolean z4) {
        BatteryInfo batteryInfo = hMBaseDevice.getBatteryInfo();
        if (z) {
            if (z2) {
                ResidentNotificationManager.showNotification(DfuNotify.INSTANCE);
                startFwUpgrade();
            } else if (batteryInfo.getLevel() > 30) {
                u(hMFwOnlineUpgradeInfo);
            } else {
                HMLog.i(q, "silent upgrade battery level low", new Object[0]);
            }
            return null;
        }
        boolean z5 = true;
        if (!z3) {
            if (!FwUpgradeFeature.INSTANCE.supportDfuV5(hMDeviceType) || !isSupportContinueUpgrade(this.i)) {
                d0(context, z4);
                return null;
            }
            DeviceXNavigator value = this.e.getValue();
            if (!z4 && !FwCheckKt.isFirmwaresContainsForce(this.k)) {
                z5 = false;
            }
            value.startContinueUpgradeActivity(context, z5, getChangeLog(false));
            return null;
        }
        UpgradeStateHolder upgradeStateHolder = UpgradeStateHolder.INSTANCE;
        if (!upgradeStateHolder.isNone()) {
            HMLog.i(q, "BatchUpgrade status not none", new Object[0]);
            return null;
        }
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportDebug()) {
            Toast.makeText(context, "当前升级的文件：" + this.h.a(), 1).show();
        }
        if (z2) {
            ResidentNotificationManager.showNotification(DfuNotify.INSTANCE);
            upgradeStateHolder.setState(1);
            startFwUpgrade();
        } else {
            if (batteryInfo.getLevel() <= 30) {
                HMLog.i(q, "batch upgrade battery level low", new Object[0]);
                return null;
            }
            HMLog.i(q, "gt2UpgradeTo:检查到强制升级，直接锁死页面开始升级", new Object[0]);
            ResidentNotificationManager.showNotification(DfuNotify.INSTANCE);
            if (x()) {
                upgradeStateHolder.setState(1);
                this.e.getValue().startHMGt2SystemUpgradeActivity(context, true, false, true);
            } else {
                HMLog.i(q, "return for upgrading", new Object[0]);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.d.getValue().clearFwUpgradeTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(Long l, AtomicBoolean atomicBoolean, DialogInterface dialogInterface, int i) {
        this.d.getValue().saveOtaCrc(l.longValue(), false);
        FwCheckKt.setAutoOtaAtNight(atomicBoolean.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(Long l, Activity activity, AtomicBoolean atomicBoolean, DialogInterface dialogInterface, int i) {
        this.d.getValue().saveOtaCrc(l.longValue(), true);
        HMLog.i(q, "gt2UpgradeTo:点击更新对话框进入升级页面", new Object[0]);
        this.e.getValue().startHMGt2SystemUpgradeActivity(activity, false, false, false);
        FwCheckKt.setAutoOtaAtNight(atomicBoolean.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(DialogInterface dialogInterface) {
        this.n = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Y(AtomicBoolean atomicBoolean, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            HMLog.i(q, "isChecked:" + z, new Object[0]);
            atomicBoolean.set(z);
            if (z) {
                HMFwOnlineAnalyticsKt.systemupdatetipsOpennightlyupdateC();
            } else {
                HMFwOnlineAnalyticsKt.systemupdatetipsClosenightlyupdateC();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Z(HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo, boolean z) {
        return "upgrade info: " + hMFwOnlineUpgradeInfo + ", isRetry: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a0(List list, boolean z) {
        return "continue upgrade: " + list + ", isRetry: " + z;
    }

    private void b0() {
        if (!isSupportContinueUpgrade(this.i)) {
            enableFwUpgrade(this.h.getFwType(), false);
            return;
        }
        List<HMFwOnlineUpgradeInfo> list = this.k;
        if (list != null) {
            Iterator<HMFwOnlineUpgradeInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                enableFwUpgrade(it2.next().getFwType(), false);
            }
        }
    }

    public static void checkUpgradeInDevicePage(Context context, HMDeviceType hMDeviceType) {
        checkUpgradeInDevicePage(context, hMDeviceType, false);
    }

    private void d0(Context context, boolean z) {
        if (this.h == null) {
            HMLog.i(q, "mFwUpgradeInfo is null.", new Object[0]);
            return;
        }
        b0();
        Intent intent = new Intent(context, (Class<?>) HMFwUpgradeActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("bind_type", F(false));
        intent.putExtra(HMFwUpgradeActivity.FW_UPGRADE_INFO_KEY, C(false));
        intent.putExtra("device_source", B().getValue());
        intent.putExtra(HMFwUpgradeActivity.FW_UPGRADE_CHANGE_LOG, getChangeLog(false));
        intent.putExtra(HMFwUpgradeActivity.FW_UPGRADE_DEVICE_IS_FORCE, this.h.isForceUpgrade() || z);
        context.startActivity(intent);
    }

    private boolean e0(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_GPS, hMDeviceSource);
    }

    public static synchronized HMFwOnlineUpgradeManager getInstance() {
        if (v == null) {
            v = new HMFwOnlineUpgradeManager();
        }
        return v;
    }

    public static boolean isSupportContinueUpgrade(HMDeviceSource hMDeviceSource) {
        if (hMDeviceSource == null) {
            return false;
        }
        HMBaseDevice device = u.getValue().getDevice(hMDeviceSource.getType());
        DeviceInfo deviceInfo = device == null ? null : device.getDeviceInfo();
        return deviceInfo != null && deviceInfo.getDeviceFeature().hasBase(1);
    }

    private void u(final HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo) {
        FwCheckKt.check(hMFwOnlineUpgradeInfo, new Function2() { // from class: dv2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return this.a.Q(hMFwOnlineUpgradeInfo, (Long) obj, (OtaResult) obj2);
            }
        });
    }

    private boolean w(Context context) {
        if (!isSupportContinueUpgrade(this.i)) {
            return v(context, this.g.getFwType(), this.g.getDeviceSource().getType());
        }
        while (true) {
            boolean z = true;
            for (HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo : this.j) {
                if (!z || !v(context, hMFwOnlineUpgradeInfo.getFwType(), hMFwOnlineUpgradeInfo.getDeviceSource().getType())) {
                    z = false;
                }
            }
            return z;
        }
    }

    private boolean x() {
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        boolean zIsUpgrading = FwUnZipStatusHolder.isUpgrading(hMDeviceType);
        boolean zIsDownloading = HMFwOnlineManager.getInstance().isDownloading(hMDeviceType);
        HMLog.i(q, "isUpgrading: " + zIsUpgrading + ", isDownloading: " + zIsDownloading, new Object[0]);
        return (zIsUpgrading || zIsDownloading) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long y(long j) {
        return System.currentTimeMillis() - j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String z(HMDeviceType hMDeviceType) {
        Lazy<DeviceManagerApi> lazy = u;
        if (lazy.getValue().isBluetoothEnable()) {
            return !lazy.getValue().isConnected(hMDeviceType) ? HMFwOnlineAnalyticsKt.BLE_DISCONNECT : "other";
        }
        return HMFwOnlineAnalyticsKt.BLUETOOTH_CLOSED;
    }

    public long E() {
        return this.p;
    }

    public boolean c0(Context context, HMDeviceType hMDeviceType, HMFirmwareType hMFirmwareType) {
        HMBaseDevice device;
        DeviceInfo deviceInfo;
        if (context == null || hMFirmwareType == null || hMDeviceType != HMDeviceType.MILI || (device = u.getValue().getDevice(hMDeviceType)) == null || (deviceInfo = device.getDeviceInfo()) == null) {
            return false;
        }
        if (hMFirmwareType != HMFirmwareType.FIRMWARE && checkDeviceVersion(context, hMDeviceType) != null) {
            return false;
        }
        if (hMFirmwareType != HMFirmwareType.RESOURCE_BASE && checkBaseResource(context, deviceInfo) != null) {
            return false;
        }
        if (hMFirmwareType != HMFirmwareType.RESOURCE_COMPRESS && hMFirmwareType != HMFirmwareType.RESOURCE && checkResource(context, deviceInfo) != null) {
            return false;
        }
        if (hMFirmwareType != HMFirmwareType.RESOURCE_EXTERNAL && checkExtResource(context, deviceInfo) != null) {
            return false;
        }
        if (hMFirmwareType == HMFirmwareType.FONT || checkFont(context, deviceInfo) == null) {
            return hMFirmwareType == HMFirmwareType.FIRMWARE_GPS || checkChaohuGps(context, hMDeviceType) == null;
        }
        return false;
    }

    public void cancelFwUpgrade() {
        this.h = null;
        EventBus.getDefault().post(new HMNeverReminderEvent(false, -1L));
    }

    public HMFwOnlineUpgradeInfo checkBaseResource(Context context, DeviceInfo deviceInfo) {
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        if (!HMDeviceFeature.hasFeatureBaseResource(deviceSource)) {
            HMLog.i(q, "return as not support base resource", new Object[0]);
            return null;
        }
        HMOtherVersion otherVersion = deviceInfo.getOtherVersion();
        if (otherVersion == null) {
            HMLog.i(q, "return as HMOtherVersion is null!!!", new Object[0]);
            return null;
        }
        BaseResourceInfo baseResourceInfo = otherVersion.getBaseResourceInfo();
        if (baseResourceInfo == null) {
            HMLog.i(q, "return as BaseResourceInfo is null!!!", new Object[0]);
            return null;
        }
        FwDwonSuccessInfo info = FwDaoManager.getManager().getInfo(deviceSource, deviceInfo.getProductVersion());
        if (!J(info)) {
            HMLog.i(q, "baseResource is null", new Object[0]);
            return null;
        }
        int resVersion = baseResourceInfo.getResVersion();
        int iIntValue = info.getBaseResourceVersionCode().intValue();
        int flag = HMFwOnlineManager.getFlag(info.getFwRelyVersion(), 3);
        int resFlag = baseResourceInfo.getResFlag();
        String baseResourcePath = info.getBaseResourcePath();
        HMLog.i(q, "deviceBaseResourceVersion:" + resVersion + ",currentBaseResourceVersion:" + iIntValue + ",flag:" + flag + ",currentFlag:" + resFlag, new Object[0]);
        boolean z = (iIntValue == -1 || TextUtils.isEmpty(baseResourcePath) || flag == -1 || flag == resFlag) ? false : true;
        boolean z2 = (iIntValue == -1 || TextUtils.isEmpty(baseResourcePath) || (resVersion != -1 && resVersion == iIntValue)) ? false : true;
        if (!z && !z2) {
            return null;
        }
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo = new HMFwOnlineUpgradeInfo(context, deviceSource, 6, baseResourcePath, String.valueOf(iIntValue), String.valueOf(resVersion), flag, resFlag, info.getForceUpgrade() == null || info.getForceUpgrade().booleanValue(), info.getChangeLog());
        hMFwOnlineUpgradeInfo.setFirmwareType(HMFirmwareType.RESOURCE_BASE);
        return hMFwOnlineUpgradeInfo;
    }

    public HMFwOnlineUpgradeInfo checkChaohuGps(Context context, HMDeviceType hMDeviceType) {
        HMBaseDevice device;
        DeviceInfo deviceInfo;
        HMLog.d(q, "checkChaohuGps", new Object[0]);
        Lazy<DeviceManagerApi> lazy = u;
        HMDeviceSource boundDeviceSource = lazy.getValue().getBoundDeviceSource(hMDeviceType);
        if (!e0(boundDeviceSource) || (device = lazy.getValue().getDevice(hMDeviceType)) == null || (deviceInfo = device.getDeviceInfo()) == null) {
            return null;
        }
        String gpsVersionStr = deviceInfo.getGpsVersionStr();
        FwDwonSuccessInfo info = FwDaoManager.getManager().getInfo(boundDeviceSource, deviceInfo.getProductVersion());
        if (!N(info)) {
            HMLog.i(q, "gps is null", new Object[0]);
            return null;
        }
        String gpsVersionCode = info.getGpsVersionCode();
        String gpsPath = info.getGpsPath();
        HMLog.d(q, "deviceGpsVersion = " + gpsVersionStr + ",appGpsVersion = " + gpsVersionCode, new Object[0]);
        if (!TextUtils.isEmpty(gpsVersionStr) && gpsVersionCode.startsWith(gpsVersionStr)) {
            return null;
        }
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo = new HMFwOnlineUpgradeInfo(context, boundDeviceSource, 9, gpsPath, gpsVersionCode, gpsVersionStr, -1, -1, info.getForceUpgrade() == null || info.getForceUpgrade().booleanValue(), info.getChangeLog());
        hMFwOnlineUpgradeInfo.setFirmwareType(HMFirmwareType.FIRMWARE_GPS);
        return hMFwOnlineUpgradeInfo;
    }

    public HMFwOnlineUpgradeInfo checkDeviceOtherVersion(Context context, HMDeviceType hMDeviceType) {
        HMLog.d(q, "checkDeviceOtherVersion", new Object[0]);
        if (hMDeviceType != HMDeviceType.MILI) {
            HMLog.d(q, "return as not mili!!!", new Object[0]);
            return null;
        }
        HMBaseDevice device = u.getValue().getDevice(hMDeviceType);
        if (device == null) {
            return null;
        }
        DeviceInfo deviceInfo = device.getDeviceInfo();
        if (deviceInfo == null) {
            HMLog.d(q, "return as no device info!!!", new Object[0]);
            return null;
        }
        if (!HMDeviceConfig.hasFeatureFontRes(deviceInfo.getDeviceSource())) {
            HMLog.d(q, "return as not support device!!!", new Object[0]);
            return null;
        }
        HMOtherVersion otherVersion = deviceInfo.getOtherVersion();
        HMLog.d(q, "HMOtherVersion:" + otherVersion, new Object[0]);
        if (otherVersion == null) {
            HMLog.d(q, "return as no version info!!!", new Object[0]);
            return null;
        }
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckFont = checkFont(context, deviceInfo);
        if (hMFwOnlineUpgradeInfoCheckFont != null) {
            return hMFwOnlineUpgradeInfoCheckFont;
        }
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckBaseResource = checkBaseResource(context, deviceInfo);
        if (hMFwOnlineUpgradeInfoCheckBaseResource != null) {
            return hMFwOnlineUpgradeInfoCheckBaseResource;
        }
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckExtResource = checkExtResource(context, deviceInfo);
        return hMFwOnlineUpgradeInfoCheckExtResource != null ? hMFwOnlineUpgradeInfoCheckExtResource : checkResource(context, deviceInfo);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    public HMFwOnlineUpgradeInfo checkDeviceVersion(Context context, HMDeviceType hMDeviceType) {
        DeviceInfo deviceInfo;
        int i;
        int i2;
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoA;
        byte[] bArrD;
        HMBaseDevice device = u.getValue().getDevice(hMDeviceType);
        if (device == null || (deviceInfo = device.getDeviceInfo()) == null) {
            return null;
        }
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        if (hMDeviceType == HMDeviceType.MILI) {
            i = 0;
        } else if (hMDeviceType == HMDeviceType.SHOES) {
            i = 3;
        } else if (hMDeviceType == HMDeviceType.WEIGHT) {
            i = 2;
        } else if (hMDeviceType == HMDeviceType.EARBUD) {
            i = 13;
        } else if (hMDeviceType == HMDeviceType.TREADMILL) {
            i = 11;
        } else if (hMDeviceType == HMDeviceType.HEADSET) {
            i = 12;
        } else {
            i = 0;
        }
        if (deviceSource == HMDeviceSource.SHOES_MARS) {
            i2 = 4;
        } else if (HMDeviceConfig.isWatch(deviceSource)) {
            i2 = 8;
        } else {
            i2 = HMDeviceSource.OTHER_BM == deviceSource ? 10 : i;
        }
        HMLog.i(q, " supportProductVersion = " + HMDeviceConfig.hasSurportProductVersionDevices(deviceSource), new Object[0]);
        FwDwonSuccessInfo info = FwDaoManager.getManager().getInfo(deviceSource, deviceInfo.getProductVersion());
        if (info == null) {
            HMLog.i(q, "no FwDownSuccessInfo!!!", new Object[0]);
            return null;
        }
        int deviceVersionCode = device.getDeviceVersionCode();
        String deviceVersion = device.getDeviceVersion();
        int firmware2Version = deviceInfo.getFirmware2Version();
        int versionCodeFromVersionName = ProfileUtils.getVersionCodeFromVersionName(info.getLocalFwVersion());
        int fw2Version = (deviceSource != HMDeviceSource.MILI_1S || (bArrD = D(info.getFwPath())) == null) ? -1 : ProfileUtils.getFw2Version(bArrD);
        HMOtherVersion otherVersion = deviceInfo.getOtherVersion();
        int flag = HMFwOnlineManager.getFlag(info.getFwRelyVersion(), 0);
        HMLog.i(q, "downloadVersion: " + versionCodeFromVersionName + ",currentHrVersion: " + firmware2Version, new Object[0]);
        StringBuilder sb = new StringBuilder();
        sb.append("downloadFlag: ");
        sb.append(flag);
        sb.append(",currentFlag: ");
        sb.append(otherVersion == null ? "null" : Integer.valueOf(otherVersion.getFwFlag()));
        HMLog.i(q, sb.toString(), new Object[0]);
        SystemImageStatus systemImageStatus = otherVersion != null ? otherVersion.getSystemImageStatus() : null;
        if (versionCodeFromVersionName != -1 && flag != -1 && otherVersion != null && flag != otherVersion.getFwFlag()) {
            hMFwOnlineUpgradeInfoA = A(info, context, deviceSource, i2, info.getLocalFwVersion(), deviceVersion, flag, otherVersion.getFwFlag());
        } else if (versionCodeFromVersionName != -1 && deviceVersionCode != -1 && versionCodeFromVersionName != deviceVersionCode) {
            hMFwOnlineUpgradeInfoA = A(info, context, deviceSource, i2, info.getLocalFwVersion(), deviceVersion, flag, otherVersion != null ? otherVersion.getFwFlag() : -1);
        } else if (fw2Version != -1 && firmware2Version != -1 && fw2Version != firmware2Version) {
            hMFwOnlineUpgradeInfoA = A(info, context, deviceSource, 1, info.getLocalFwVersion(), deviceVersion, flag, otherVersion != null ? otherVersion.getFwFlag() : -1);
        } else {
            if (systemImageStatus != SystemImageStatus.Broken.INSTANCE) {
                return null;
            }
            hMFwOnlineUpgradeInfoA = A(info, context, deviceSource, i2, info.getLocalFwVersion(), deviceVersion, flag, otherVersion.getFwFlag());
        }
        if (hMFwOnlineUpgradeInfoA != null) {
            hMFwOnlineUpgradeInfoA.setFirmwareType(HMFirmwareType.FIRMWARE);
        }
        return hMFwOnlineUpgradeInfoA;
    }

    public HMFwOnlineUpgradeInfo checkExtResource(Context context, DeviceInfo deviceInfo) {
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        if (!HMDeviceFeature.hasFeatureBaseResource(deviceSource)) {
            HMLog.i(q, "return as not support external resource", new Object[0]);
            return null;
        }
        HMOtherVersion otherVersion = deviceInfo.getOtherVersion();
        if (otherVersion == null) {
            HMLog.i(q, "return as HMOtherVersion is null!!!", new Object[0]);
            return null;
        }
        ExternalResourceInfo externalResourceInfo = otherVersion.getExternalResourceInfo();
        if (externalResourceInfo == null) {
            HMLog.i(q, "return as ExternalResourceInfo is null!!!", new Object[0]);
            return null;
        }
        FwDwonSuccessInfo info = FwDaoManager.getManager().getInfo(deviceSource, deviceInfo.getProductVersion());
        if (!L(info)) {
            HMLog.i(q, "extResource is null", new Object[0]);
            return null;
        }
        int version = externalResourceInfo.getVersion();
        int iIntValue = info.getExternalResourceVersionCode().intValue();
        int flag = HMFwOnlineManager.getFlag(info.getFwRelyVersion(), 4);
        int flag2 = externalResourceInfo.getFlag();
        String externalResourcePath = info.getExternalResourcePath();
        HMLog.i(q, "deviceExtResourceVersion:" + version + ",currentExtResourceVersion:" + iIntValue + ",flag:" + flag + ",currentFlag:" + flag2, new Object[0]);
        boolean z = (iIntValue == -1 || TextUtils.isEmpty(externalResourcePath) || flag == -1 || flag == flag2) ? false : true;
        boolean z2 = (iIntValue == -1 || TextUtils.isEmpty(externalResourcePath) || (version != -1 && version == iIntValue)) ? false : true;
        if (!z && !z2) {
            return null;
        }
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo = new HMFwOnlineUpgradeInfo(context, deviceSource, 6, externalResourcePath, String.valueOf(iIntValue), String.valueOf(version), flag, flag2, info.getForceUpgrade() == null || info.getForceUpgrade().booleanValue(), info.getChangeLog());
        hMFwOnlineUpgradeInfo.setFirmwareType(HMFirmwareType.RESOURCE_EXTERNAL);
        return hMFwOnlineUpgradeInfo;
    }

    public HMFwOnlineUpgradeInfo checkFont(Context context, DeviceInfo deviceInfo) {
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        HMOtherVersion otherVersion = deviceInfo.getOtherVersion();
        if (otherVersion == null) {
            HMLog.i(q, "otherVersion is null", new Object[0]);
            return null;
        }
        FwDwonSuccessInfo info = FwDaoManager.getManager().getInfo(deviceSource, deviceInfo.getProductVersion());
        if (!M(info)) {
            HMLog.i(q, "font is null", new Object[0]);
            return null;
        }
        Integer fontVersionCode = info.getFontVersionCode();
        String fontPath = info.getFontPath();
        int fontVersion = otherVersion.getFontVersion();
        int flag = HMFwOnlineManager.getFlag(info.getFwRelyVersion(), 2);
        boolean z = true;
        boolean z2 = (fontVersionCode.intValue() == -1 || flag == -1 || flag == otherVersion.getFontFlag()) ? false : true;
        HMLog.i(q, "deviceFontVersion:" + fontVersion + ",currentFontVersion:" + fontVersionCode + ",currentFontName:" + fontPath, new Object[0]);
        StringBuilder sb = new StringBuilder();
        sb.append("deviceFontFlag:");
        sb.append(flag);
        sb.append(",currentFontFlag:");
        sb.append(otherVersion.getFontFlag());
        HMLog.i(q, sb.toString(), new Object[0]);
        if (!z2 && fontVersion != -1 && fontVersionCode.intValue() == fontVersion) {
            return null;
        }
        if (info.getForceUpgrade() != null && !info.getForceUpgrade().booleanValue()) {
            z = false;
        }
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo = new HMFwOnlineUpgradeInfo(context, deviceSource, 5, fontPath, String.valueOf(fontVersionCode), String.valueOf(fontVersion), flag, otherVersion.getFontFlag(), z, info.getChangeLog());
        hMFwOnlineUpgradeInfo.setFirmwareType(HMFirmwareType.FONT);
        return hMFwOnlineUpgradeInfo;
    }

    public synchronized boolean checkFwUpgrade(Context context, HMDeviceType hMDeviceType, boolean z) {
        return checkFwUpgrade(context, hMDeviceType, z, false, false);
    }

    public HMFwOnlineUpgradeInfo checkResource(Context context, DeviceInfo deviceInfo) {
        HMOtherVersion otherVersion;
        if (deviceInfo == null || (otherVersion = deviceInfo.getOtherVersion()) == null) {
            HMLog.i(q, "deviceInfo or hmOtherVersion is null", new Object[0]);
            return null;
        }
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        int resourceVersion = otherVersion.getResourceVersion();
        FwDwonSuccessInfo info = FwDaoManager.getManager().getInfo(deviceSource, deviceInfo.getProductVersion());
        if (!P(info)) {
            HMLog.i(q, "resource is null", new Object[0]);
            return null;
        }
        Integer resourceVersionCode = info.getResourceVersionCode();
        String resourcePath = info.getResourcePath();
        int flag = HMFwOnlineManager.getFlag(info.getFwRelyVersion(), 1);
        boolean z = (resourceVersionCode.intValue() == -1 || TextUtils.isEmpty(resourcePath) || flag == -1 || flag == otherVersion.getResourceFlag()) ? false : true;
        boolean z2 = (resourceVersionCode.intValue() == -1 || TextUtils.isEmpty(resourcePath) || (resourceVersion != -1 && resourceVersionCode.intValue() == resourceVersion)) ? false : true;
        HMLog.i(q, "currentResourceVersion:" + resourceVersionCode + ",currentResourceName:" + resourcePath + ",device resourceVersion : " + resourceVersion + ",resourceFlag:" + flag + ",currentResourceFlag:" + otherVersion.getResourceFlag(), new Object[0]);
        if (!z && !z2) {
            return null;
        }
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo = new HMFwOnlineUpgradeInfo(context, deviceSource, 6, resourcePath, String.valueOf(resourceVersionCode), String.valueOf(resourceVersion), flag, otherVersion.getResourceFlag(), info.getForceUpgrade() == null || info.getForceUpgrade().booleanValue(), info.getChangeLog());
        hMFwOnlineUpgradeInfo.setFirmwareType(HMDeviceConfig.hasFeatureCompressRes(deviceSource) ? HMFirmwareType.RESOURCE_COMPRESS : HMFirmwareType.RESOURCE);
        return hMFwOnlineUpgradeInfo;
    }

    public void clearFwUpgradeTime() {
        this.c.execute(new Runnable() { // from class: hv2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.U();
            }
        });
    }

    public void enableFwUpgrade(boolean z) {
        if (z) {
            this.f.clear();
            return;
        }
        int size = this.f.size();
        if (size < 1) {
            return;
        }
        for (int i = 0; i < size; i++) {
            this.f.put(this.f.keyAt(i), z);
        }
    }

    public void executeUpgrade(HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo) {
        this.c.execute(new b(hMFwOnlineUpgradeInfo));
    }

    public boolean getAllowUpgrade() {
        return this.a;
    }

    public String getChangeLog(boolean z) {
        if (isSupportContinueUpgrade(this.i)) {
            List<HMFwOnlineUpgradeInfo> list = z ? this.j : this.k;
            return (list == null || list.isEmpty()) ? "" : list.get(0).getChangeLog();
        }
        if (z) {
            HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo = this.g;
            return hMFwOnlineUpgradeInfo == null ? "" : hMFwOnlineUpgradeInfo.getChangeLog();
        }
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo2 = this.h;
        return hMFwOnlineUpgradeInfo2 == null ? "" : hMFwOnlineUpgradeInfo2.getChangeLog();
    }

    public FwDwonSuccessInfo getFwDwonSuccessInfo(Context context, HMDeviceType hMDeviceType) {
        DeviceInfo deviceInfo;
        HMBaseDevice device = u.getValue().getDevice(hMDeviceType);
        if (device == null || (deviceInfo = device.getDeviceInfo()) == null) {
            return null;
        }
        return FwDaoManager.getManager().getInfo(deviceInfo.getDeviceSource(), deviceInfo.getProductVersion());
    }

    public HMFwOnlineUpgradeInfo getFwUpgradeInfo() {
        return this.h;
    }

    public String getFwUpgradeVer(Context context, HMDeviceType hMDeviceType) {
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckDeviceVersion = checkDeviceVersion(context, hMDeviceType);
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckDeviceOtherVersion = checkDeviceOtherVersion(context, hMDeviceType);
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckChaohuGps = checkChaohuGps(context, hMDeviceType);
        return (hMFwOnlineUpgradeInfoCheckDeviceVersion == null ? "fw" : hMFwOnlineUpgradeInfoCheckDeviceVersion.getFwVersionName()) + (hMFwOnlineUpgradeInfoCheckDeviceOtherVersion == null ? "other" : hMFwOnlineUpgradeInfoCheckDeviceOtherVersion.getFwVersionName()) + (hMFwOnlineUpgradeInfoCheckChaohuGps == null ? "gps" : hMFwOnlineUpgradeInfoCheckChaohuGps.getFwVersionName());
    }

    public HMFwOnlineUpgradeInfo getHMFwOnlineInfo(Context context, HMDeviceType hMDeviceType, boolean z) throws Throwable {
        boolean zO = O(context, hMDeviceType);
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckChaohuGps = zO ? checkChaohuGps(context, hMDeviceType) : checkDeviceVersion(context, hMDeviceType);
        if (hMFwOnlineUpgradeInfoCheckChaohuGps == null) {
            hMFwOnlineUpgradeInfoCheckChaohuGps = checkDeviceOtherVersion(context, hMDeviceType);
        }
        if (hMFwOnlineUpgradeInfoCheckChaohuGps == null) {
            hMFwOnlineUpgradeInfoCheckChaohuGps = zO ? checkDeviceVersion(context, hMDeviceType) : checkChaohuGps(context, hMDeviceType);
        }
        if (hMFwOnlineUpgradeInfoCheckChaohuGps != null) {
            hMFwOnlineUpgradeInfoCheckChaohuGps.setSupportPresetFirmwareInformation(z);
        }
        return hMFwOnlineUpgradeInfoCheckChaohuGps;
    }

    public HMFwOnlineUpgradeInfo getHMFwOnlineInfoInBatch(Context context, HMDeviceType hMDeviceType, boolean z) {
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckResource;
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckBaseResource;
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckFont;
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckExtResource;
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckChaohuGps;
        boolean z2 = !O(context, hMDeviceType);
        HMLog.i(q, "是否先升级固件：" + z2, new Object[0]);
        ArrayList arrayList = new ArrayList();
        HMBaseDevice device = u.getValue().getDevice(hMDeviceType);
        if (device == null) {
            return null;
        }
        DeviceInfo deviceInfo = device.getDeviceInfo();
        if (deviceInfo == null) {
            HMLog.d(q, "return as no device info!!!", new Object[0]);
            return null;
        }
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckDeviceVersion = checkDeviceVersion(context, hMDeviceType);
        if (hMFwOnlineUpgradeInfoCheckDeviceVersion != null && z2) {
            hMFwOnlineUpgradeInfoCheckResource = null;
            hMFwOnlineUpgradeInfoCheckBaseResource = null;
            hMFwOnlineUpgradeInfoCheckFont = null;
            hMFwOnlineUpgradeInfoCheckExtResource = null;
            hMFwOnlineUpgradeInfoCheckChaohuGps = null;
        } else {
            hMFwOnlineUpgradeInfoCheckResource = checkResource(context, deviceInfo);
            hMFwOnlineUpgradeInfoCheckBaseResource = checkBaseResource(context, deviceInfo);
            hMFwOnlineUpgradeInfoCheckExtResource = checkExtResource(context, deviceInfo);
            hMFwOnlineUpgradeInfoCheckFont = checkFont(context, deviceInfo);
            hMFwOnlineUpgradeInfoCheckChaohuGps = checkChaohuGps(context, hMDeviceType);
        }
        if (hMFwOnlineUpgradeInfoCheckDeviceVersion != null) {
            arrayList.add(hMFwOnlineUpgradeInfoCheckDeviceVersion);
        }
        if (hMFwOnlineUpgradeInfoCheckResource != null) {
            arrayList.add(hMFwOnlineUpgradeInfoCheckResource);
        }
        if (hMFwOnlineUpgradeInfoCheckBaseResource != null) {
            arrayList.add(hMFwOnlineUpgradeInfoCheckBaseResource);
        }
        if (hMFwOnlineUpgradeInfoCheckExtResource != null) {
            arrayList.add(hMFwOnlineUpgradeInfoCheckExtResource);
        }
        if (hMFwOnlineUpgradeInfoCheckFont != null) {
            arrayList.add(hMFwOnlineUpgradeInfoCheckFont);
        }
        if (hMFwOnlineUpgradeInfoCheckChaohuGps != null) {
            arrayList.add(hMFwOnlineUpgradeInfoCheckChaohuGps);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Collections.sort(arrayList);
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo = new HMFwOnlineUpgradeInfo(context);
        hMFwOnlineUpgradeInfo.setFirmwareType(HMFirmwareType.FIRMWARE_BATCH);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            hMFwOnlineUpgradeInfo.addChildFw((HMFwOnlineUpgradeInfo) it2.next());
        }
        hMFwOnlineUpgradeInfo.setDeviceSource(u.getValue().getBoundDeviceSource(hMDeviceType));
        FwDwonSuccessInfo fwDwonSuccessInfoI = I(hMDeviceType);
        if (fwDwonSuccessInfoI != null) {
            Integer buildTime = fwDwonSuccessInfoI.getBuildTime();
            hMFwOnlineUpgradeInfo.setBuildTime(buildTime != null ? buildTime.intValue() : 0);
            hMFwOnlineUpgradeInfo.setmChangeLog(fwDwonSuccessInfoI.getChangeLog());
        }
        hMFwOnlineUpgradeInfo.setSupportPresetFirmwareInformation(z);
        return hMFwOnlineUpgradeInfo;
    }

    public List<HMFwOnlineUpgradeInfo> getRetryFirmwareInfos() {
        return this.j;
    }

    public HMFwOnlineUpgradeInfo getUpgradeInfo() {
        return this.g;
    }

    public synchronized boolean hasFwUpgrade(Context context, HMDeviceType hMDeviceType) {
        HMLog.i(q, "hasFwUpgrade Device type:" + hMDeviceType, new Object[0]);
        if (context == null) {
            return false;
        }
        HMBaseDevice device = u.getValue().getDevice(hMDeviceType);
        if (device != null && device.isConnected()) {
            HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckDeviceVersion = checkDeviceVersion(context, hMDeviceType);
            if (hMFwOnlineUpgradeInfoCheckDeviceVersion == null) {
                hMFwOnlineUpgradeInfoCheckDeviceVersion = checkDeviceOtherVersion(context, hMDeviceType);
            }
            if (hMFwOnlineUpgradeInfoCheckDeviceVersion == null) {
                hMFwOnlineUpgradeInfoCheckDeviceVersion = checkChaohuGps(context, hMDeviceType);
            }
            return hMFwOnlineUpgradeInfoCheckDeviceVersion != null;
        }
        HMLog.i(q, "No connection!!!", new Object[0]);
        return false;
    }

    public boolean isUpgrading(HMDeviceType hMDeviceType) {
        HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent = this.l;
        if (hMDeviceFwUpgradeEvent == null || hMDeviceFwUpgradeEvent.getDeviceType() != hMDeviceType) {
            return false;
        }
        HMLog.i(q, this.l.toString(), new Object[0]);
        return this.l.isStart() || this.l.isProgress();
    }

    public void setAllowUpgrade(boolean z) {
        this.a = z;
    }

    public void showSilentUpgradeDlg(String str, final Long l) {
        if (!DeviceXFunctionsKt.getAppStateApi().isForeground()) {
            HMLog.i(q, "return as background", new Object[0]);
            return;
        }
        final Activity topActivity = DeviceXFunctionsKt.getAppStateApi().getTopActivity();
        if (!(topActivity instanceof AppCompatActivity)) {
            HMLog.i(q, "return as topActivity not match", new Object[0]);
            return;
        }
        if (this.e.getValue().isHMGt2SystemUpgradeActivity(topActivity)) {
            HMLog.i(q, "最上层Activity是HMGt2SystemUpgradeActivity，故不弹出", new Object[0]);
            return;
        }
        String string = topActivity.getString(R.string.new_system_upgrade_title);
        String str2 = String.format(DeviceXFunctionsKt.getContext().getString(R.string.new_system_upgrade_change_log), str);
        if (this.n) {
            HMLog.i(q, "弹窗已经在展示了。", new Object[0]);
            return;
        }
        Boolean boolSupportAutoOtaAtNight = FwCheckKt.supportAutoOtaAtNight();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialogFragment.Builder messageMaxLines = new AlertDialogFragment.Builder(topActivity).setTitle(string).setMessage(str2).setNegativeButton(R.string.do_not_remind_again, new DialogInterface.OnClickListener() { // from class: ev2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.V(l, atomicBoolean, dialogInterface, i);
            }
        }).setPositiveButton(R.string.new_system_upgrade_show, new DialogInterface.OnClickListener() { // from class: cv2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.W(l, topActivity, atomicBoolean, dialogInterface, i);
            }
        }).setCancelable(true).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: fv2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.a.X(dialogInterface);
            }
        }).setMessageMaxLines(4);
        if (boolSupportAutoOtaAtNight != null) {
            messageMaxLines.setCheckBox(DeviceXFunctionsKt.getString(R.string.auto_ota_at_night_tip_switch), boolSupportAutoOtaAtNight.booleanValue(), new CompoundButton.OnCheckedChangeListener() { // from class: gv2
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    HMFwOnlineUpgradeManager.Y(atomicBoolean, compoundButton, z);
                }
            });
        }
        messageMaxLines.show(((AppCompatActivity) topActivity).getSupportFragmentManager());
        this.n = true;
    }

    public boolean showUpdate(HMDeviceType hMDeviceType) {
        DeviceInfo deviceInfo;
        FwDwonSuccessInfo lastestInfo;
        HMBaseDevice device = u.getValue().getDevice(hMDeviceType);
        if (device == null || (deviceInfo = device.getDeviceInfo()) == null || (lastestInfo = FwDaoManager.getManager().getLastestInfo(deviceInfo.getDeviceSource(), deviceInfo.getProductVersion())) == null) {
            return false;
        }
        return HMFwOnlineManager.FW_TYPE_ONLINE.equals(lastestInfo.getFwType());
    }

    public void showUpgradeActivityForRetry(Context context) {
        HMDeviceSource hMDeviceSourceB = B();
        if (useOnline(hMDeviceSourceB.getType()) ? w(context) : HMFwUpgradeManager.getInstance().i(context, this.g.getFwType(), this.g.getDeviceSource().getType())) {
            Intent intent = new Intent(context, (Class<?>) HMFwUpgradeActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("bind_type", F(true));
            intent.putExtra(HMFwUpgradeActivity.FW_UPGRADE_INFO_KEY, C(true));
            intent.putExtra("device_source", hMDeviceSourceB.getValue());
            intent.putExtra(HMFwUpgradeActivity.FW_UPGRADE_DEVICE_IS_FORCE, true);
            intent.putExtra(HMFwUpgradeActivity.FW_UPGRADE_RETRY, true);
            if (useOnline(hMDeviceSourceB.getType())) {
                startFwUpgrade(true);
                intent.putExtra(HMFwUpgradeActivity.FW_UPGRADE_CHANGE_LOG, getChangeLog(true));
            } else {
                executeUpgrade(this.g);
            }
            context.startActivity(intent);
        }
    }

    public void startFwUpgrade() {
        startFwUpgrade(false);
    }

    public void startFwUpgradeBatch(final boolean z) {
        final List<HMFwOnlineUpgradeInfo> list = z ? this.j : this.k;
        HMLog.info(q, new Function0() { // from class: kv2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMFwOnlineUpgradeManager.a0(list, z);
            }
        });
        if (list == null || list.isEmpty()) {
            return;
        }
        executeUpgrade(list);
    }

    public boolean useOnline(HMDeviceType hMDeviceType) {
        DeviceInfo deviceInfo;
        FwDwonSuccessInfo info;
        HMBaseDevice device = u.getValue().getDevice(hMDeviceType);
        if (device == null || (deviceInfo = device.getDeviceInfo()) == null || (info = FwDaoManager.getManager().getInfo(deviceInfo.getDeviceSource(), deviceInfo.getProductVersion())) == null) {
            return true;
        }
        return HMFwOnlineManager.FW_TYPE_ONLINE.equals(info.getFwType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean v(Context context, int i, HMDeviceType hMDeviceType) {
        Lazy<DeviceManagerApi> lazy = u;
        HMDeviceSource boundDeviceSource = lazy.getValue().getBoundDeviceSource(hMDeviceType);
        HMDeviceType hMDeviceType2 = HMDeviceType.MILI;
        if (hMDeviceType != hMDeviceType2 && boundDeviceSource != HMDeviceSource.SHOES_MARS && hMDeviceType != HMDeviceType.HEADSET && hMDeviceType != HMDeviceType.EARBUD) {
            return true;
        }
        HMLog.d(q, "need checkDeviceBattery", new Object[0]);
        HMBaseDevice device = lazy.getValue().getDevice(hMDeviceType);
        if (device == 0) {
            return false;
        }
        BatteryInfo batteryInfo = device.getBatteryInfo();
        if ((device instanceof HeadsetDevice) && !(device instanceof LullabyDevice)) {
            HeadsetDevice headsetDevice = (HeadsetDevice) device;
            BatteryInfo batteryInfo2 = headsetDevice.getBatteryInfo(HeadsetDevice.Part.Right.INSTANCE);
            batteryInfo = headsetDevice.getBatteryInfo(HeadsetDevice.Part.Left.INSTANCE);
            if (batteryInfo == null && batteryInfo2 == null) {
                return false;
            }
            if (batteryInfo == null || batteryInfo2 == null ? batteryInfo == null : batteryInfo.getLevel() >= batteryInfo2.getLevel()) {
                batteryInfo = batteryInfo2;
            }
        }
        if (batteryInfo == null) {
            return false;
        }
        if (hMDeviceType == hMDeviceType2) {
            if (((device instanceof HMMiLiProDevice) && ((HMMiLiProDevice) device).isHuamiOs() && batteryInfo.getLevel() > 30) || batteryInfo.getLevel() > 10) {
                return true;
            }
            HMLog.info(q, new Function0() { // from class: lv2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMFwOnlineUpgradeManager.R();
                }
            });
            enableFwUpgrade(i, false);
            return false;
        }
        if (hMDeviceType != HMDeviceType.EARBUD) {
            if (batteryInfo.getLevel() < 0 || batteryInfo.getLevel() >= 20) {
                return true;
            }
            if (DeviceXFunctionsKt.getAppStateApi().isForeground()) {
                this.o.getValue().showOtherHelper(context, hMDeviceType.getValue());
            }
            enableFwUpgrade(i, false);
            return false;
        }
        HmEarbudDevice hmEarbudDevice = (HmEarbudDevice) device;
        BatteryInfo batteryInfo3 = hmEarbudDevice.getRightDevice() == null ? null : hmEarbudDevice.getRightDevice().getBatteryInfo();
        if (batteryInfo.getLevel() >= 50 && batteryInfo3 != null && batteryInfo3.getLevel() >= 50) {
            return true;
        }
        if (DeviceXFunctionsKt.getAppStateApi().isForeground()) {
            this.o.getValue().showEarbudHelper(context);
        }
        enableFwUpgrade(i, false);
        return false;
    }

    public static void checkUpgradeInDevicePage(Context context, HMDeviceType hMDeviceType, boolean z) {
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && getInstance().useOnline(hMDeviceType)) {
            if (!getInstance().getAllowUpgrade()) {
                getInstance().setAllowUpgrade(true);
                getInstance().checkFwUpgrade(context, hMDeviceType, false);
                return;
            } else {
                if (z) {
                    getInstance().checkFwUpgrade(context, hMDeviceType, false);
                    return;
                }
                return;
            }
        }
        if (!HMFwUpgradeManager.getInstance().getAllowUpgrade()) {
            HMFwUpgradeManager.getInstance().setAllowUpgrade(true);
            HMFwUpgradeManager.getInstance().checkFwUpgrade(context, hMDeviceType, false);
        } else if (z) {
            HMFwUpgradeManager.getInstance().checkFwUpgrade(context, hMDeviceType, false);
        }
    }

    public synchronized boolean checkFwUpgrade(Context context, HMDeviceType hMDeviceType, boolean z, boolean z2) {
        return checkFwUpgrade(context, hMDeviceType, z, z2, false);
    }

    public void executeUpgrade(List<HMFwOnlineUpgradeInfo> list) {
        HMLog.i(q, "executeUpgrade size:" + list.size(), new Object[0]);
        this.c.execute(new a(list));
    }

    public void startFwUpgrade(final boolean z) {
        if (isSupportContinueUpgrade(this.i)) {
            startFwUpgradeBatch(z);
            return;
        }
        final HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo = z ? this.g : this.h;
        HMLog.info(q, new Function0() { // from class: iv2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMFwOnlineUpgradeManager.Z(hMFwOnlineUpgradeInfo, z);
            }
        });
        if (hMFwOnlineUpgradeInfo != null) {
            executeUpgrade(hMFwOnlineUpgradeInfo);
        }
    }

    public synchronized boolean checkFwUpgrade(final Context context, final HMDeviceType hMDeviceType, final boolean z, boolean z2, final boolean z3) {
        DeviceInfo deviceInfo;
        HMFwOnlineUpgradeInfo hMFwOnlineInfo;
        HMLog.i(q, "checkFwUpgrade Device type:" + hMDeviceType, new Object[0]);
        if (context == null) {
            return false;
        }
        if (!this.a) {
            HMLog.i(q, "not allow", new Object[0]);
            return false;
        }
        if (FwCheckKt.isChecking()) {
            HMLog.i(q, "isChecking", new Object[0]);
            return false;
        }
        Lazy<DeviceManagerApi> lazy = u;
        final HMBaseDevice device = lazy.getValue().getDevice(hMDeviceType);
        if (device != null && lazy.getValue().isConnected(hMDeviceType) && (deviceInfo = device.getDeviceInfo()) != null) {
            if (HMDeviceConfig.isL66Series() && SyncCenterManager.INSTANCE.isSyncing(device)) {
                HMLog.i(q, "isSyncing", new Object[0]);
                return false;
            }
            if (!z && !HMFwOnlineManager.getInstance().needUpgrade(deviceInfo)) {
                HMLog.i(q, "today is cancel " + this.d.getValue().getFwUpgradeTime(HMFwOnlineManager.createDeviceValue(deviceInfo)), new Object[0]);
                return false;
            }
            if (device instanceof HMBoltClassicDevice) {
                HMSportController.TreadmillSportState sportState = ((HMBoltClassicDevice) device).getSportState();
                int errorCode = FtmsErrorHelper.INSTANCE.getErrorCode();
                HMLog.i(q, "sportState: " + sportState + ", errorCode: " + errorCode, new Object[0]);
                if (sportState != HMSportController.TreadmillSportState.NONE || errorCode != -1) {
                    return false;
                }
            }
            if (!z2 && HMFwUpgradeManager.isIgnoreFwUpgrade()) {
                HMLog.i(q, "Ignore as top activity!!!", new Object[0]);
                return false;
            }
            if (WalletUI.getInstance().isInWallet()) {
                HMLog.i(q, "Ignore as in wallet page!!!", new Object[0]);
                return false;
            }
            if (this.m) {
                HMLog.i(q, "FwTask upgrading", new Object[0]);
                return false;
            }
            if (HMAgpsUpgradeManager.getAgpsProgress() != null) {
                HMLog.i(q, "Agps progress!!!", new Object[0]);
                return false;
            }
            HMLog.d(q, deviceInfo.toString(), new Object[0]);
            final boolean zSupportSilentUpgrade = FwUpgradeFeature.INSTANCE.supportSilentUpgrade(hMDeviceType);
            FwDwonSuccessInfo fwDwonSuccessInfo = getFwDwonSuccessInfo(context, hMDeviceType);
            boolean zBooleanValue = fwDwonSuccessInfo != null ? fwDwonSuccessInfo.getForceUpgrade().booleanValue() : false;
            HMLog.i(q, "isForceUpgrade: " + zBooleanValue, new Object[0]);
            boolean zSupportPresetFirmwareInformation = FwCheckKt.supportPresetFirmwareInformation();
            if (zSupportSilentUpgrade && !zSupportPresetFirmwareInformation) {
                hMFwOnlineInfo = getHMFwOnlineInfoInBatch(context, hMDeviceType, zSupportPresetFirmwareInformation);
            } else {
                hMFwOnlineInfo = getHMFwOnlineInfo(context, hMDeviceType, zSupportPresetFirmwareInformation);
            }
            final HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo = hMFwOnlineInfo;
            boolean z4 = zBooleanValue | (hMFwOnlineUpgradeInfo != null && hMFwOnlineUpgradeInfo.isForceUpgrade());
            if (!z && hMDeviceType == HMDeviceType.EARBUD && !z4) {
                HMLog.info(q, new Function0() { // from class: mv2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMFwOnlineUpgradeManager.S();
                    }
                });
                return false;
            }
            if (e0(deviceInfo.getDeviceSource())) {
                String firmwareGpsVersion = this.d.getValue().getFirmwareGpsVersion();
                String gpsVersionStr = deviceInfo.getGpsVersionStr();
                AgpsTimeStore agpsTimeStoreApi = DeviceXFunctionsKt.getAgpsTimeStoreApi();
                if (agpsTimeStoreApi != null && !TextUtils.isEmpty(firmwareGpsVersion) && !TextUtils.isEmpty(gpsVersionStr) && !firmwareGpsVersion.equals(gpsVersionStr)) {
                    agpsTimeStoreApi.reset();
                }
                if (!TextUtils.isEmpty(gpsVersionStr)) {
                    this.d.getValue().setFirmwareGpsVersion(gpsVersionStr);
                }
            }
            boolean z5 = (hMFwOnlineUpgradeInfo == null || !zSupportSilentUpgrade || z4) ? false : true;
            if (hMFwOnlineUpgradeInfo == null) {
                if (HMFwOnlineManager.getInstance().isDownloading(hMDeviceType)) {
                    HMLog.i(q, "type:" + hMDeviceType.getValue() + " is download!!!", new Object[0]);
                    return false;
                }
                boolean zCheckAgpsUpgrade = HMAgpsUpgradeManager.checkAgpsUpgrade(context, hMDeviceType);
                HMLog.i(q, "checkAgpsUpgrade:" + zCheckAgpsUpgrade, new Object[0]);
                return zCheckAgpsUpgrade;
            }
            if (z5) {
                boolean zCheckAgpsUpgrade2 = HMAgpsUpgradeManager.checkAgpsUpgrade(context, hMDeviceType);
                HMLog.i(q, "checkAgpsUpgrade when silent upgrade:" + zCheckAgpsUpgrade2, new Object[0]);
                if (zCheckAgpsUpgrade2) {
                    return true;
                }
            }
            hMFwOnlineUpgradeInfo.setSilent(z5);
            if (!K(hMFwOnlineUpgradeInfo.getFwType())) {
                HMLog.i(q, "disable fw upgrade for " + hMFwOnlineUpgradeInfo.getFwType() + " now!!!", new Object[0]);
                return false;
            }
            if (!v(context, hMFwOnlineUpgradeInfo.getFwType(), hMDeviceType)) {
                HMLog.i(q, "Low battery!!!", new Object[0]);
                return false;
            }
            this.h = hMFwOnlineUpgradeInfo;
            this.k = G(context, hMDeviceType, deviceInfo);
            if (DeviceXFunctionsKt.getAppStateApi().getTopActivity() instanceof HMFwUpgradeFailedActivity) {
                HMLog.i(q, "return as HMFwUpgradeFailedActivity showing.", new Object[0]);
                return false;
            }
            if (!this.h.fwFileExist()) {
                HMLog.d(q, "fw file not exists!!!", new Object[0]);
                return false;
            }
            int fwType = this.h.getFwType();
            if (!DeviceXFunctionsKt.getAppStateApi().isForeground() && !z5) {
                HMLog.d(q, "Not fwupgrade in background!!!", new Object[0]);
                enableFwUpgrade(fwType, true);
                return false;
            }
            HMLog.i(q, "mFwUpgradeInfo = " + this.h.toString(), new Object[0]);
            HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
            this.i = deviceSource;
            final boolean z6 = z5;
            FwCheckKt.shouldStartUpgrade(this.h, deviceSource, z, new Function0() { // from class: jv2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.T(device, z6, z3, hMFwOnlineUpgradeInfo, zSupportSilentUpgrade, context, hMDeviceType, z);
                }
            });
            return true;
        }
        HMLog.i(q, "No connection!!!", new Object[0]);
        return false;
    }

    public void enableFwUpgrade(int i, boolean z) {
        this.f.put(i, z);
    }

    public String getChangeLog(DeviceInfo deviceInfo) {
        FwDwonSuccessInfo info = FwDaoManager.getManager().getInfo(deviceInfo.getDeviceSource(), deviceInfo.getProductVersion());
        if (info == null) {
            return null;
        }
        return info.getChangeLog();
    }
}
