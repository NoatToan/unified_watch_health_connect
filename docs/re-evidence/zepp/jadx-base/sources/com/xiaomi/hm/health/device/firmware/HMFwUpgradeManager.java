package com.xiaomi.hm.health.device.firmware;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.other.SmartExecutorApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.huami.wallet.ui.utils.WalletUI;
import com.huami.web.container.WebActivity;
import com.xiaomi.hm.health.bt.classic.HMSportController;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMBoltClassicDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.BaseResourceInfo;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.bt.profile.base.PnP;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.dfu.DfuState;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.databases.model.FwDwonSuccessInfo;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.agps.HMAgpsUpgradeManager;
import com.xiaomi.hm.health.device.agps.LowBatteryApi;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import com.xiaomi.hm.health.device.event.HMNeverReminderEvent;
import com.xiaomi.hm.health.device.fw_upgrade.FwDaoManager;
import com.xiaomi.hm.health.device.fw_upgrade.Md5FileUtils;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinConstant;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMFwUpgradeManager {
    private static final String n = "HMFwUpgradeManager";
    private static final Lazy<FirmwareManagerApi> o;
    private static final ArrayList<Class<Object>> p;
    private static HMFwUpgradeManager q;
    private boolean a = true;
    private final Lazy<SmartExecutorApi> b;
    private final Executor c;
    private final SparseBooleanArray d;
    private HMFwUpgradeInfo e;
    private HMFwUpgradeInfo f;
    private HMDeviceFwUpgradeEvent g;
    private HashMap<String, com.xiaomi.hm.health.device.firmware.b> h;
    private HMFirmwareType i;
    private volatile boolean j;
    private Lazy<LowBatteryApi> k;
    private final Lazy<DeviceManagerApi> l;
    private long m;

    public class a extends HMCallback<DfuState> {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onData(DfuState dfuState) {
            if (dfuState.getState() == 32 || dfuState.getState() == 33 || dfuState.getState() == 48) {
                HMLog.i(HMFwUpgradeManager.n, "not upgrade when sport", new Object[0]);
            } else {
                HMFwUpgradeManager.this.p(this.a, false);
            }
        }
    }

    public class b implements Runnable, IHMFirmwareUpgradeCallback {
        public HMFwUpgradeInfo a;
        private final ConditionVariable b;
        private HMFirmwareType c;
        private Progress d = null;

        public b(HMFwUpgradeInfo hMFwUpgradeInfo) {
            this.a = null;
            this.c = HMFirmwareType.FIRMWARE;
            HMFwUpgradeManager.this.m = System.currentTimeMillis();
            this.a = hMFwUpgradeInfo;
            this.b = new ConditionVariable();
            this.c = hMFwUpgradeInfo.getFirmwareType();
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwProgress(Progress progress) {
            if (this.d == null || progress.getPercent() != this.d.getPercent()) {
                HMFwUpgradeManager.this.g = new HMDeviceFwUpgradeEvent(this.a.getDeviceSource(), this.c, progress);
                EventBus.getDefault().post(HMFwUpgradeManager.this.g);
                this.d = progress;
            }
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStart(int i) {
            HMLog.d(HMFwUpgradeManager.n, "onFwStart", new Object[0]);
            HMFwUpgradeManager.this.g = new HMDeviceFwUpgradeEvent(this.a.getDeviceSource(), this.c, 0);
            HMFwUpgradeManager.this.g.setFwVersion(this.a.getFwVersionName());
            EventBus.getDefault().post(HMFwUpgradeManager.this.g);
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStop(boolean z) {
            HMFwUpgradeManager.this.m = -1L;
            HMLog.d(HMFwUpgradeManager.n, "onFwStop:" + z, new Object[0]);
            if (z) {
                if (this.a.getFirmwareType() == HMFirmwareType.FIRMWARE) {
                    HMFwUpgradeManager.this.i = this.a.getFirmwareType();
                }
                HMFwUtils.deleteFwFile(this.a);
            } else {
                HMFwUpgradeManager.this.e = this.a;
                HMFwUpgradeManager.this.i = null;
            }
            HMFwUpgradeManager.this.j = false;
            HMFwUpgradeManager.this.g = new HMDeviceFwUpgradeEvent(this.a.getDeviceSource(), this.c, 2, z);
            HMFwUpgradeManager.this.g.setFwVersion(this.a.getFwVersionName());
            EventBus.getDefault().post(HMFwUpgradeManager.this.g);
            this.b.open();
        }

        @Override // java.lang.Runnable
        public void run() {
            HMLog.d(HMFwUpgradeManager.n, "Upgrade info:" + this.a, new Object[0]);
            HMBaseDevice device = ((DeviceManagerApi) HMFwUpgradeManager.this.l.getValue()).getDevice(this.a.getDeviceSource().getType());
            if (device == null || !device.isConnected()) {
                HMLog.d(HMFwUpgradeManager.n, "Device is not connected!!!", new Object[0]);
                return;
            }
            HMLog.d(HMFwUpgradeManager.n, "In main fw task...", new Object[0]);
            HMFwUpgradeManager.this.j = true;
            boolean isFromFileFw = this.a.getIsFromFileFw();
            HMLog.i(HMFwUpgradeManager.n, "isFwFile = " + isFromFileFw, new Object[0]);
            File fileGenerateFwFileFromAssets = !isFromFileFw ? HMFwUtils.generateFwFileFromAssets(this.a.getContext(), this.a.getFwName()) : new File(this.a.getFwFilePath());
            HMLog.i(HMFwUpgradeManager.n, fileGenerateFwFileFromAssets.getAbsolutePath(), new Object[0]);
            device.updateFwUpgrade(new HMFirmwareInfo(fileGenerateFwFileFromAssets.getPath(), this.c), this);
            this.b.block();
            if (com.xiaomi.hm.health.device.firmware.a.h0.equals(this.a.getFwName()) || com.xiaomi.hm.health.device.firmware.a.i0.equals(this.a.getFwName()) || this.c == HMFirmwareType.RESOURCE_BASE) {
                HMFwUpgradeManager.this.enableFwUpgrade(this.a.getFwType(), true);
            }
            try {
                Thread.sleep(2000L);
            } catch (Exception e) {
                HMLog.d(HMFwUpgradeManager.n, e.toString(), new Object[0]);
            }
            HMLog.d(HMFwUpgradeManager.n, "Out main fw task...", new Object[0]);
        }
    }

    static {
        Lazy<FirmwareManagerApi> lazyInject = KoinJavaComponent.inject(FirmwareManagerApi.class);
        o = lazyInject;
        p = lazyInject.getValue().getIgnoreFwUpgradeList();
        q = null;
    }

    private HMFwUpgradeManager() {
        Lazy<SmartExecutorApi> lazyInject = KoinJavaComponent.inject(SmartExecutorApi.class);
        this.b = lazyInject;
        this.c = lazyInject.getValue().getSerialExecutor();
        this.d = new SparseBooleanArray();
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = false;
        this.k = KoinJavaComponent.inject(LowBatteryApi.class);
        this.l = KoinJavaComponent.inject(DeviceManagerApi.class);
        this.m = -1L;
        this.h = HMFwUtils.loadFirmwareInfos(DeviceXFunctionsKt.getContext());
    }

    public static synchronized void addIgnoreActivity(Class cls) {
        if (cls != null) {
            p.add(cls);
        }
    }

    public static synchronized HMFwUpgradeManager getInstance() {
        if (q == null) {
            q = new HMFwUpgradeManager();
        }
        return q;
    }

    public static synchronized boolean isIgnoreFwUpgrade() {
        String str;
        Activity topActivity = DeviceXFunctionsKt.getAppStateApi().getTopActivity();
        if (topActivity != null) {
            String name = topActivity.getClass().getName();
            HMLog.i(n, "top activity:" + name, new Object[0]);
            Iterator<Class<Object>> it2 = p.iterator();
            while (it2.hasNext()) {
                if (it2.next().getName().equals(name)) {
                    return true;
                }
            }
            if (topActivity instanceof WebActivity) {
                WebItem webItem = ((WebActivity) topActivity).getWebItem();
                if (webItem != null && (str = webItem.url) != null) {
                    if (str.equals(HMServerDef.getUrl(WatchSkinConstant.URL))) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    private HMFirmware j(HMDeviceSource hMDeviceSource, String str, int i) {
        com.xiaomi.hm.health.device.firmware.b bVar;
        String type = HMFwUtils.getType(hMDeviceSource);
        if (TextUtils.isEmpty(type) || (bVar = this.h.get(type)) == null) {
            return null;
        }
        String infoFtType = HMFwUtils.getInfoFtType(hMDeviceSource, str, i);
        HMLog.i(n, "ftInfoType:" + infoFtType, new Object[0]);
        if (TextUtils.isEmpty(infoFtType)) {
            return null;
        }
        return bVar.b(infoFtType);
    }

    private HMFirmware k(DeviceInfo deviceInfo) {
        com.xiaomi.hm.health.device.firmware.b bVar;
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        String type = deviceInfo.isMiLiHankou() ? com.xiaomi.hm.health.device.firmware.a.c : HMFwUtils.getType(deviceSource);
        if (TextUtils.isEmpty(type) || (bVar = this.h.get(type)) == null) {
            return null;
        }
        String infoResType = HMFwUtils.getInfoResType(deviceInfo.getHardwareVersionStr(), deviceSource);
        HMLog.i(n, "infoResType:" + infoResType, new Object[0]);
        if (TextUtils.isEmpty(infoResType)) {
            return null;
        }
        return bVar.b(infoResType);
    }

    private HMFwUpgradeInfo l(FwDwonSuccessInfo fwDwonSuccessInfo, Context context, HMDeviceSource hMDeviceSource, int i, int i2) {
        if (fwDwonSuccessInfo == null) {
            return null;
        }
        String fwPath = fwDwonSuccessInfo.getFwPath();
        String localMd5Content = fwDwonSuccessInfo.getLocalMd5Content();
        HMLog.i(n, "wholeFilePath = " + fwPath, new Object[0]);
        if (TextUtils.isEmpty(fwPath)) {
            return null;
        }
        File file = new File(fwPath);
        if (!file.exists()) {
            HMLog.i(n, "fwFile on sdcard is not exitst", new Object[0]);
            return null;
        }
        try {
            String fileMD5String = Md5FileUtils.getFileMD5String(file);
            HMLog.i(n, "localFwFileMd5 = " + fileMD5String + ",database md5Content = " + localMd5Content, new Object[0]);
            if (localMd5Content.equalsIgnoreCase(fileMD5String)) {
                return new HMFwUpgradeInfo(context, hMDeviceSource, i, true, fwPath, HMFwUtils.convertVersionCodeToName(i2), fwDwonSuccessInfo.getForceUpgrade() == null || fwDwonSuccessInfo.getForceUpgrade().booleanValue());
            }
            HMLog.i(n, "md5 is not same, return .", new Object[0]);
            return null;
        } catch (Exception e) {
            HMLog.i(n, "getFileMD5String exception:" + e.getMessage(), new Object[0]);
            return null;
        }
    }

    private boolean m(int i) {
        return this.d.get(i, true);
    }

    private boolean n(Context context, HMDeviceType hMDeviceType) {
        DeviceInfo deviceInfo;
        HMFirmware currentFwInfo;
        HMOtherVersion otherVersion;
        int fwOrder;
        HMBaseDevice device = this.l.getValue().getDevice(hMDeviceType);
        return (device == null || (deviceInfo = device.getDeviceInfo()) == null || (currentFwInfo = getCurrentFwInfo(deviceInfo)) == null || (otherVersion = deviceInfo.getOtherVersion()) == null || (fwOrder = HMFwUtils.getFwOrder(context, currentFwInfo.getFwName())) == -1 || fwOrder != otherVersion.getVersion()) ? false : true;
    }

    private boolean o(PnP pnP) {
        return pnP != null && pnP.vendorSource == 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Context context, boolean z) {
        enableFwUpgrade(this.f.getFwType(), false);
        Intent intent = new Intent(context, (Class<?>) HMFwUpgradeActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("bind_type", this.f.getFwType());
        intent.putExtra(HMFwUpgradeActivity.FW_UPGRADE_INFO_KEY, this.f.getFirmwareType());
        intent.putExtra("device_source", this.f.getDeviceSource().getValue());
        intent.putExtra(HMFwUpgradeActivity.FW_UPGRADE_DEVICE_IS_FORCE, this.f.isForceUpgrade() || z);
        context.startActivity(intent);
    }

    public static synchronized void removeIgnoreActivity(Class cls) {
        if (cls != null) {
            p.remove(cls);
        }
    }

    public void cancelFwUpgrade() {
        this.f = null;
        EventBus.getDefault().post(new HMNeverReminderEvent(false, -1L));
    }

    public HMFwUpgradeInfo checkBaseResource(Context context, DeviceInfo deviceInfo) {
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        if (!HMDeviceFeature.hasFeatureBaseResource(deviceSource)) {
            HMLog.i(n, "return as not support base resource", new Object[0]);
            return null;
        }
        HMOtherVersion otherVersion = deviceInfo.getOtherVersion();
        if (otherVersion == null) {
            HMLog.i(n, "return as HMOtherVersion is null!!!", new Object[0]);
            return null;
        }
        BaseResourceInfo baseResourceInfo = otherVersion.getBaseResourceInfo();
        if (baseResourceInfo == null) {
            HMLog.i(n, "return as BaseResourceInfo is null!!!", new Object[0]);
            return null;
        }
        com.xiaomi.hm.health.device.firmware.b bVar = this.h.get(HMFwUtils.getType(deviceSource));
        if (bVar == null) {
            HMLog.i(n, "return as HMFwInfo is null!!!", new Object[0]);
            return null;
        }
        HMFirmware hMFirmwareB = bVar.b(com.xiaomi.hm.health.device.firmware.a.T);
        if (hMFirmwareB == null) {
            HMLog.i(n, "return as base resource info is null!!!", new Object[0]);
            return null;
        }
        int resVersion = baseResourceInfo.getResVersion();
        int i = Integer.parseInt(hMFirmwareB.b);
        HMLog.i(n, "deviceBaseResourceVersion:" + resVersion + ",currentBaseResourceVersion:" + i, new Object[0]);
        if (i <= resVersion) {
            HMLog.i(n, "return as no need!!!", new Object[0]);
            return null;
        }
        HMFwUpgradeInfo hMFwUpgradeInfo = new HMFwUpgradeInfo(context, deviceSource, 6, hMFirmwareB.a, hMFirmwareB.b);
        hMFwUpgradeInfo.setFirmwareType(HMFirmwareType.RESOURCE_BASE);
        return hMFwUpgradeInfo;
    }

    public HMFwUpgradeInfo checkChaohuGps(Context context, HMDeviceType hMDeviceType) {
        HMBaseDevice device;
        DeviceInfo deviceInfo;
        HMLog.d(n, "checkChaohuGps", new Object[0]);
        HMDeviceSource boundDeviceSource = this.l.getValue().getBoundDeviceSource(hMDeviceType);
        if (!ConfigHelperKt.hasFeature(Feature.SUPPORT_GPS, boundDeviceSource) || (device = this.l.getValue().getDevice(hMDeviceType)) == null || (deviceInfo = device.getDeviceInfo()) == null) {
            return null;
        }
        String gpsVersionStr = deviceInfo.getGpsVersionStr();
        if (TextUtils.isEmpty(gpsVersionStr)) {
            return null;
        }
        String type = HMFwUtils.getType(boundDeviceSource);
        com.xiaomi.hm.health.device.firmware.b bVar = this.h.get(type);
        if (bVar == null) {
            HMLog.i(n, "no type:" + type, new Object[0]);
            return null;
        }
        HMFirmware hMFirmwareB = bVar.b("gps");
        if (hMFirmwareB == null) {
            HMLog.i(n, "no info:gps", new Object[0]);
            return null;
        }
        String fwVersion = hMFirmwareB.getFwVersion();
        String fwName = hMFirmwareB.getFwName();
        HMLog.d(n, "deviceGpsVersion = " + gpsVersionStr + ",appGpsVersion = " + fwVersion, new Object[0]);
        if (TextUtils.isEmpty(fwVersion) || TextUtils.isEmpty(gpsVersionStr) || fwVersion.equals(gpsVersionStr) || fwVersion.startsWith(gpsVersionStr)) {
            HMLog.d(n, "invalid gps info!", new Object[0]);
            return null;
        }
        HMFwUpgradeInfo hMFwUpgradeInfo = new HMFwUpgradeInfo(context, boundDeviceSource, 9, fwName, fwVersion);
        hMFwUpgradeInfo.setFirmwareType(HMFirmwareType.FIRMWARE_GPS);
        return hMFwUpgradeInfo;
    }

    public HMFwUpgradeInfo checkDeviceOtherVersion(Context context, HMDeviceType hMDeviceType) {
        HMLog.d(n, "checkDeviceOtherVersion", new Object[0]);
        if (hMDeviceType != HMDeviceType.MILI) {
            HMLog.d(n, "return as not mili!!!", new Object[0]);
            return null;
        }
        HMBaseDevice device = this.l.getValue().getDevice(hMDeviceType);
        if (device == null) {
            return null;
        }
        DeviceInfo deviceInfo = device.getDeviceInfo();
        if (deviceInfo == null) {
            HMLog.d(n, "return as no device info!!!", new Object[0]);
            return null;
        }
        if (!HMDeviceConfig.hasFeatureFontRes(deviceInfo.getDeviceSource())) {
            HMLog.d(n, "return as not support device!!!", new Object[0]);
            return null;
        }
        HMOtherVersion otherVersion = deviceInfo.getOtherVersion();
        HMLog.d(n, "HMOtherVersion:" + otherVersion, new Object[0]);
        if (otherVersion == null) {
            HMLog.d(n, "return as no version info!!!", new Object[0]);
            return null;
        }
        HMFwUpgradeInfo hMFwUpgradeInfoCheckFont = checkFont(context, deviceInfo);
        if (hMFwUpgradeInfoCheckFont != null) {
            return hMFwUpgradeInfoCheckFont;
        }
        HMFwUpgradeInfo hMFwUpgradeInfoCheckBaseResource = checkBaseResource(context, deviceInfo);
        return hMFwUpgradeInfoCheckBaseResource != null ? hMFwUpgradeInfoCheckBaseResource : checkResouce(context, deviceInfo);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x0148  */
    /* JADX WARN: Code duplicated, block: B:58:0x0150  */
    /* JADX WARN: Code duplicated, block: B:60:0x0156  */
    /* JADX WARN: Code duplicated, block: B:61:0x015b  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public HMFwUpgradeInfo checkDeviceVersion(Context context, HMDeviceType hMDeviceType) {
        DeviceInfo deviceInfo;
        int i;
        boolean z;
        HMFwUpgradeInfo hMFwUpgradeInfo;
        FwDwonSuccessInfo fwInfo;
        int localFwVersionCode;
        int localFwHrVersionCode;
        int i2;
        boolean z2;
        int i3;
        HMFwUpgradeInfo hMFwUpgradeInfoL;
        byte[] fwDataFromAssets;
        HMBaseDevice device = this.l.getValue().getDevice(hMDeviceType);
        if (device == null || (deviceInfo = device.getDeviceInfo()) == null) {
            return null;
        }
        int deviceVersionCode = device.getDeviceVersionCode();
        int firmware2Version = deviceInfo.getFirmware2Version();
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        if (hMDeviceType == HMDeviceType.MILI) {
            i = 0;
        } else if (hMDeviceType == HMDeviceType.SHOES) {
            i = 3;
        } else if (hMDeviceType == HMDeviceType.WEIGHT) {
            i = 2;
        } else if (hMDeviceType == HMDeviceType.TREADMILL) {
            i = 11;
        } else {
            i = 0;
        }
        if (deviceSource == HMDeviceSource.SHOES_MARS) {
            i = 4;
        } else if (HMDeviceConfig.isWatch(deviceSource)) {
            i = 8;
        } else if (HMDeviceSource.OTHER_BM == deviceSource) {
            i = 10;
        }
        HMFirmware currentFwInfo = getCurrentFwInfo(deviceInfo);
        if (currentFwInfo == null) {
            return null;
        }
        String fwName = currentFwInfo.getFwName();
        int versionCodeFromVersionName = ProfileUtils.getVersionCodeFromVersionName(currentFwInfo.getFwVersion());
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_1S;
        int fw2Version = (deviceSource != hMDeviceSource || (fwDataFromAssets = HMFwUtils.getFwDataFromAssets(context, fwName)) == null) ? -1 : ProfileUtils.getFw2Version(fwDataFromAssets);
        HMLog.i(n, "lastestVersionCode:" + versionCodeFromVersionName + ",currentVersionCode:" + deviceVersionCode, new Object[0]);
        HMLog.i(n, "lastestVersionName:" + HMFwUtils.convertVersionCodeToName(versionCodeFromVersionName) + ",currentVersionName:" + HMFwUtils.convertVersionCodeToName(deviceVersionCode), new Object[0]);
        HMLog.i(n, "lasterHrVersionCode:" + fw2Version + ",currentHrVersionCode:" + firmware2Version, new Object[0]);
        if (!HMFwUtils.isFwCondition(deviceInfo, currentFwInfo)) {
            if (fw2Version == -1 || firmware2Version == -1 || fw2Version <= firmware2Version) {
                z = false;
            } else {
                i = 1;
            }
            if (!deviceInfo.isMiLiProTPHIndian() || z) {
                HMFwUpgradeInfo hMFwUpgradeInfo2 = new HMFwUpgradeInfo(context, deviceSource, i, fwName, HMFwUtils.convertVersionCodeToName(versionCodeFromVersionName));
                hMFwUpgradeInfo2.setFirmwareType(HMFirmwareType.FIRMWARE);
                hMFwUpgradeInfo = hMFwUpgradeInfo2;
            } else {
                hMFwUpgradeInfo = null;
            }
            HMLog.i(n, "HMDeviceManager.hasSurportProductVersionDevices(fwSource) = " + HMDeviceConfig.hasSurportProductVersionDevices(deviceSource), new Object[0]);
            fwInfo = FwDaoManager.getManager().getFwInfo(deviceSource, deviceInfo.getProductVersion());
            if (fwInfo == null) {
                HMLog.i(n, "no FwDwonSuccessInfo!!!", new Object[0]);
                return hMFwUpgradeInfo;
            }
            localFwVersionCode = fwInfo.getLocalFwVersionCode();
            if (deviceSource == hMDeviceSource) {
                localFwHrVersionCode = fwInfo.getLocalFwHrVersionCode();
            } else {
                localFwHrVersionCode = -1;
            }
            HMLog.i(n, "fileVersionCode: " + localFwVersionCode + ", fileHrVersionCode : " + localFwHrVersionCode, new Object[0]);
            HMLog.i(n, "fileVersionName: " + HMFwUtils.convertVersionCodeToName(localFwVersionCode) + ", fileHrVersionCode : " + HMFwUtils.convertVersionCodeToName(localFwHrVersionCode), new Object[0]);
            if (localFwVersionCode == -1 && versionCodeFromVersionName != -1 && deviceVersionCode != -1 && localFwVersionCode > versionCodeFromVersionName && localFwVersionCode > deviceVersionCode) {
                i2 = i;
                z2 = true;
            } else if (localFwHrVersionCode != -1 || (i3 = fw2Version) == -1 || firmware2Version == -1 || localFwHrVersionCode <= i3 || localFwHrVersionCode <= firmware2Version) {
                i2 = i;
                z2 = false;
            } else {
                z2 = true;
                i2 = 1;
            }
            HMLog.i(n, "isFileRet = " + z2, new Object[0]);
            if (z2) {
                hMFwUpgradeInfoL = l(fwInfo, context, deviceSource, i2, localFwVersionCode);
            } else {
                hMFwUpgradeInfoL = null;
            }
            if (hMFwUpgradeInfoL == null && hMFwUpgradeInfo != null) {
                hMFwUpgradeInfoL.setFirmwareType(HMFirmwareType.FIRMWARE);
                return versionCodeFromVersionName > localFwVersionCode ? hMFwUpgradeInfo : hMFwUpgradeInfoL;
            }
            if (hMFwUpgradeInfoL != null) {
                return hMFwUpgradeInfoL;
            }
            return hMFwUpgradeInfo;
        }
        z = true;
        if (deviceInfo.isMiLiProTPHIndian()) {
            HMFwUpgradeInfo hMFwUpgradeInfo3 = new HMFwUpgradeInfo(context, deviceSource, i, fwName, HMFwUtils.convertVersionCodeToName(versionCodeFromVersionName));
            hMFwUpgradeInfo3.setFirmwareType(HMFirmwareType.FIRMWARE);
            hMFwUpgradeInfo = hMFwUpgradeInfo3;
        } else {
            HMFwUpgradeInfo hMFwUpgradeInfo4 = new HMFwUpgradeInfo(context, deviceSource, i, fwName, HMFwUtils.convertVersionCodeToName(versionCodeFromVersionName));
            hMFwUpgradeInfo4.setFirmwareType(HMFirmwareType.FIRMWARE);
            hMFwUpgradeInfo = hMFwUpgradeInfo4;
        }
        HMLog.i(n, "HMDeviceManager.hasSurportProductVersionDevices(fwSource) = " + HMDeviceConfig.hasSurportProductVersionDevices(deviceSource), new Object[0]);
        fwInfo = FwDaoManager.getManager().getFwInfo(deviceSource, deviceInfo.getProductVersion());
        if (fwInfo == null) {
            HMLog.i(n, "no FwDwonSuccessInfo!!!", new Object[0]);
            return hMFwUpgradeInfo;
        }
        localFwVersionCode = fwInfo.getLocalFwVersionCode();
        if (deviceSource == hMDeviceSource) {
            localFwHrVersionCode = fwInfo.getLocalFwHrVersionCode();
        } else {
            localFwHrVersionCode = -1;
        }
        HMLog.i(n, "fileVersionCode: " + localFwVersionCode + ", fileHrVersionCode : " + localFwHrVersionCode, new Object[0]);
        HMLog.i(n, "fileVersionName: " + HMFwUtils.convertVersionCodeToName(localFwVersionCode) + ", fileHrVersionCode : " + HMFwUtils.convertVersionCodeToName(localFwHrVersionCode), new Object[0]);
        if (localFwVersionCode == -1) {
            if (localFwHrVersionCode != -1) {
                i2 = i;
                z2 = false;
            } else {
                i2 = i;
                z2 = false;
            }
        } else if (localFwHrVersionCode != -1) {
            i2 = i;
            z2 = false;
        } else {
            i2 = i;
            z2 = false;
        }
        HMLog.i(n, "isFileRet = " + z2, new Object[0]);
        if (z2) {
            hMFwUpgradeInfoL = l(fwInfo, context, deviceSource, i2, localFwVersionCode);
        } else {
            hMFwUpgradeInfoL = null;
        }
        if (hMFwUpgradeInfoL == null) {
        }
        if (hMFwUpgradeInfoL != null) {
            return hMFwUpgradeInfoL;
        }
        return hMFwUpgradeInfo;
    }

    public HMFwUpgradeInfo checkFont(Context context, DeviceInfo deviceInfo) {
        String str;
        boolean z;
        HMFwUpgradeInfo hMFwUpgradeInfo;
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        HMOtherVersion otherVersion = deviceInfo.getOtherVersion();
        String hardwareVersionStr = deviceInfo.getHardwareVersionStr();
        int currentFontFlag = HMFwUtils.getCurrentFontFlag(deviceSource, hardwareVersionStr);
        if (currentFontFlag == -1) {
            HMLog.i(n, "current font type is unknown!", new Object[0]);
            return null;
        }
        if (currentFontFlag == 0 && otherVersion.getFontFlag() == 255) {
            HMLog.d(n, "return as Simplified Chinese to English!!!!", new Object[0]);
            return null;
        }
        int fontVersion = HMFwUtils.getFontVersion(otherVersion, hardwareVersionStr, deviceSource);
        HMFirmware hMFirmwareJ = j(deviceSource, hardwareVersionStr, otherVersion.getFontFlag());
        HMLog.i(n, "fontFw:" + hMFirmwareJ, new Object[0]);
        if (hMFirmwareJ == null) {
            HMLog.i(n, "no app font firmware!", new Object[0]);
            return null;
        }
        int iIntValue = Integer.parseInt(hMFirmwareJ.b);
        String fontPath = hMFirmwareJ.a;
        if (iIntValue == -1 || TextUtils.isEmpty(fontPath)) {
            HMLog.i(n, "invalid app font info!", new Object[0]);
            return null;
        }
        FwDwonSuccessInfo fontInfo = FwDaoManager.getManager().getFontInfo(deviceSource, deviceInfo.getProductVersion());
        if (fontInfo == null) {
            HMLog.i(n, "no font FwDwonSuccessInfo from net", new Object[0]);
            str = fontPath;
            z = false;
        } else {
            boolean z2 = fontInfo.getFontVersionCode().intValue() > iIntValue;
            if (z2) {
                iIntValue = fontInfo.getFontVersionCode().intValue();
            }
            if (z2) {
                fontPath = fontInfo.getFontPath();
            }
            HMLog.i(n, "fontInfo  " + fontInfo.getFontVersionCode() + "," + z2, new Object[0]);
            boolean z3 = z2;
            str = fontPath;
            z = z3;
        }
        HMLog.i(n, ",deviceFontVersion:" + fontVersion + ",currentFontVersion:" + iIntValue + ",currentFontName:" + str, new Object[0]);
        if (fontVersion != -1 && iIntValue <= fontVersion) {
            return null;
        }
        if (z) {
            hMFwUpgradeInfo = new HMFwUpgradeInfo(context, deviceSource, 5, true, str, String.valueOf(iIntValue), fontInfo.getForceUpgrade() == null || fontInfo.getForceUpgrade().booleanValue());
        } else {
            hMFwUpgradeInfo = new HMFwUpgradeInfo(context, deviceSource, 5, str, String.valueOf(iIntValue));
        }
        hMFwUpgradeInfo.setFirmwareType(HMFirmwareType.FONT);
        return hMFwUpgradeInfo;
    }

    public synchronized boolean checkFwUpgrade(Context context, HMDeviceType hMDeviceType, boolean z) {
        return checkFwUpgrade(context, hMDeviceType, z, false);
    }

    public HMFwUpgradeInfo checkResouce(Context context, DeviceInfo deviceInfo) {
        boolean z;
        HMFwUpgradeInfo hMFwUpgradeInfo;
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        int resVersion = HMFwUtils.getResVersion(deviceInfo.getOtherVersion(), deviceInfo.getHardwareVersionStr(), deviceSource);
        HMFirmware hMFirmwareK = k(deviceInfo);
        if (hMFirmwareK == null) {
            HMLog.i(n, "no valid res firmware", new Object[0]);
            return null;
        }
        int iIntValue = Integer.parseInt(hMFirmwareK.b);
        String resourcePath = hMFirmwareK.a;
        FwDwonSuccessInfo resInfo = FwDaoManager.getManager().getResInfo(deviceSource, deviceInfo.getProductVersion());
        if (resInfo == null) {
            HMLog.i(n, "no res FwDwonSuccessInfo from net", new Object[0]);
            z = false;
        } else {
            z = resInfo.getResourceVersionCode().intValue() > iIntValue;
            if (z) {
                iIntValue = resInfo.getResourceVersionCode().intValue();
            }
            if (z) {
                resourcePath = resInfo.getResourcePath();
            }
            HMLog.i(n, "isUseOnlineRes " + z, new Object[0]);
        }
        int i = iIntValue;
        String str = resourcePath;
        HMLog.i(n, "currentResourceVersion:" + i + ",currentResourceName:" + str + ",device resourceVersion : " + resVersion, new Object[0]);
        if (i == -1 || TextUtils.isEmpty(str) || (resVersion != -1 && i <= resVersion)) {
            return null;
        }
        if (z) {
            hMFwUpgradeInfo = new HMFwUpgradeInfo(context, deviceSource, 6, true, str, String.valueOf(i), resInfo.getForceUpgrade() == null || resInfo.getForceUpgrade().booleanValue());
        } else {
            hMFwUpgradeInfo = new HMFwUpgradeInfo(context, deviceSource, 6, str, String.valueOf(i));
        }
        hMFwUpgradeInfo.setFirmwareType(HMDeviceConfig.hasFeatureCompressRes(deviceSource) ? HMFirmwareType.RESOURCE_COMPRESS : HMFirmwareType.RESOURCE);
        return hMFwUpgradeInfo;
    }

    public void enableFwUpgrade(boolean z) {
        if (z) {
            this.d.clear();
            return;
        }
        int size = this.d.size();
        if (size < 1) {
            return;
        }
        for (int i = 0; i < size; i++) {
            this.d.put(this.d.keyAt(i), z);
        }
    }

    public void executeUpgrade(HMFwUpgradeInfo hMFwUpgradeInfo) {
        this.c.execute(new b(hMFwUpgradeInfo));
    }

    public boolean getAllowUpgrade() {
        return this.a;
    }

    public HMFirmware getCurrentFwInfo(DeviceInfo deviceInfo) {
        String type;
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        if (deviceSource == HMDeviceSource.MILI_PRO) {
            if (deviceInfo.isMiLiProTPH() || deviceInfo.isMiLiProTPHIndian()) {
                type = com.xiaomi.hm.health.device.firmware.a.h;
            } else if (deviceInfo.isMiLiProTPHAs7000()) {
                type = com.xiaomi.hm.health.device.firmware.a.i;
            } else if (deviceInfo.isMiLiProI()) {
                type = com.xiaomi.hm.health.device.firmware.a.n;
            } else {
                type = deviceInfo.isMiLiProTPHIndianNew() ? com.xiaomi.hm.health.device.firmware.a.j : com.xiaomi.hm.health.device.firmware.a.g;
            }
        } else if (deviceSource == HMDeviceSource.MILI_AMAZFIT) {
            type = deviceInfo.isAmazfitKx() ? com.xiaomi.hm.health.device.firmware.a.E : "amazfit";
        } else {
            type = (deviceSource == HMDeviceSource.MILI_WUHAN && deviceInfo.isMiLiHankou()) ? com.xiaomi.hm.health.device.firmware.a.c : HMFwUtils.getType(deviceSource);
        }
        HMLog.d(n, "type:" + type, new Object[0]);
        if (TextUtils.isEmpty(type)) {
            return null;
        }
        com.xiaomi.hm.health.device.firmware.b bVar = this.h.get(type);
        HMLog.d(n, "fwInfo:" + bVar, new Object[0]);
        if (bVar == null) {
            return null;
        }
        String infoFwType = HMFwUtils.getInfoFwType(deviceInfo.getHardwareVersionStr(), deviceSource);
        HMLog.i(n, "infoFwType:" + infoFwType, new Object[0]);
        if (TextUtils.isEmpty(infoFwType)) {
            return null;
        }
        HMFirmware hMFirmwareB = bVar.b(infoFwType);
        HMLog.d(n, "firmware:" + hMFirmwareB, new Object[0]);
        HMFirmware hMFirmwareB2 = bVar.b(com.xiaomi.hm.health.device.firmware.a.b0);
        HMLog.d(n, "firmwareTr:" + hMFirmwareB2, new Object[0]);
        return (hMFirmwareB2 == null || deviceInfo.getFirmwareVersion() >= ProfileUtils.getVersionCodeFromVersionName(hMFirmwareB2.getFwVersion())) ? hMFirmwareB : hMFirmwareB2;
    }

    public long getFwTaskId() {
        return this.m;
    }

    public String getFwUpgradeVer(Context context, HMDeviceType hMDeviceType) {
        HMFwUpgradeInfo hMFwUpgradeInfoCheckDeviceVersion = checkDeviceVersion(context, hMDeviceType);
        HMFwUpgradeInfo hMFwUpgradeInfoCheckDeviceOtherVersion = checkDeviceOtherVersion(context, hMDeviceType);
        HMFwUpgradeInfo hMFwUpgradeInfoCheckChaohuGps = checkChaohuGps(context, hMDeviceType);
        return (hMFwUpgradeInfoCheckDeviceVersion == null ? "fw" : hMFwUpgradeInfoCheckDeviceVersion.getFwVersionName()) + (hMFwUpgradeInfoCheckDeviceOtherVersion == null ? "other" : hMFwUpgradeInfoCheckDeviceOtherVersion.getFwVersionName()) + (hMFwUpgradeInfoCheckChaohuGps == null ? "gps" : hMFwUpgradeInfoCheckChaohuGps.getFwVersionName());
    }

    public HMFwUpgradeInfo getUpgradeInfo() {
        return this.e;
    }

    public synchronized boolean hasFwUpgrade(Context context, HMDeviceType hMDeviceType) {
        HMLog.i(n, "hasFwUpgrade Device type:" + hMDeviceType, new Object[0]);
        if (context == null) {
            return false;
        }
        HMBaseDevice device = this.l.getValue().getDevice(hMDeviceType);
        if (device != null && device.isConnected()) {
            DeviceInfo deviceInfo = device.getDeviceInfo();
            if (deviceInfo == null) {
                HMLog.i(n, "No DeviceInfo!!!", new Object[0]);
                return false;
            }
            if (o(deviceInfo.getPnp())) {
                HMLog.i(n, "ToB device disable firmware upgrade!!!", new Object[0]);
                return false;
            }
            HMFwUpgradeInfo hMFwUpgradeInfoCheckDeviceVersion = checkDeviceVersion(context, hMDeviceType);
            if (hMFwUpgradeInfoCheckDeviceVersion == null) {
                hMFwUpgradeInfoCheckDeviceVersion = checkDeviceOtherVersion(context, hMDeviceType);
            }
            if (hMFwUpgradeInfoCheckDeviceVersion == null) {
                hMFwUpgradeInfoCheckDeviceVersion = checkChaohuGps(context, hMDeviceType);
            }
            return hMFwUpgradeInfoCheckDeviceVersion != null;
        }
        HMLog.i(n, "No connection!!!", new Object[0]);
        return false;
    }

    public boolean i(Context context, int i, HMDeviceType hMDeviceType) {
        BatteryInfo batteryInfo;
        HMDeviceSource boundDeviceSource = this.l.getValue().getBoundDeviceSource(hMDeviceType);
        HMDeviceType hMDeviceType2 = HMDeviceType.MILI;
        if (hMDeviceType != hMDeviceType2 && boundDeviceSource != HMDeviceSource.SHOES_MARS) {
            return true;
        }
        HMLog.d(n, "need checkDeviceBattery", new Object[0]);
        HMBaseDevice device = this.l.getValue().getDevice(hMDeviceType);
        if (device == null || (batteryInfo = device.getBatteryInfo()) == null) {
            return false;
        }
        if (hMDeviceType == hMDeviceType2) {
            if (batteryInfo.getLevel() > 10) {
                return true;
            }
            if (DeviceXFunctionsKt.getAppStateApi().isForeground()) {
                this.k.getValue().showMiliHelper(context);
            }
            enableFwUpgrade(i, false);
            return false;
        }
        if (batteryInfo.getLevel() < 0 || batteryInfo.getLevel() >= 20) {
            return true;
        }
        if (DeviceXFunctionsKt.getAppStateApi().isForeground()) {
            this.k.getValue().showNormandyHelper(context);
        }
        enableFwUpgrade(i, false);
        return false;
    }

    public boolean isUpgrading(HMDeviceType hMDeviceType) {
        HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent = this.g;
        if (hMDeviceFwUpgradeEvent == null || hMDeviceFwUpgradeEvent.getDeviceType() != hMDeviceType) {
            return false;
        }
        HMLog.i(n, this.g.toString(), new Object[0]);
        return this.g.isStart() || this.g.isProgress();
    }

    public void setAllowUpgrade(boolean z) {
        this.a = z;
    }

    public void startFwUpgrade() {
        HMFwUpgradeInfo hMFwUpgradeInfo = this.f;
        if (hMFwUpgradeInfo != null) {
            executeUpgrade(hMFwUpgradeInfo);
        }
    }

    public synchronized boolean checkFwUpgrade(Context context, HMDeviceType hMDeviceType, boolean z, boolean z2) {
        HMFwUpgradeInfo hMFwUpgradeInfoCheckDeviceVersion;
        HMFirmwareType hMFirmwareType;
        HMLog.i(n, "checkFwUpgrade Device type:" + hMDeviceType, new Object[0]);
        if (context == null) {
            return false;
        }
        if (!this.a) {
            HMLog.i(n, "not allow", new Object[0]);
            return false;
        }
        if (!this.l.getValue().isConnected(hMDeviceType)) {
            HMLog.i(n, "No connection!!!", new Object[0]);
            return false;
        }
        HMBaseDevice device = this.l.getValue().getDevice(hMDeviceType);
        if (device != null && device.isConnected()) {
            DeviceInfo deviceInfo = device.getDeviceInfo();
            if (deviceInfo == null) {
                HMLog.i(n, "No DeviceInfo!!!", new Object[0]);
                return false;
            }
            if (o(deviceInfo.getPnp())) {
                HMLog.i(n, "ToB device disable firmware upgrade!!!", new Object[0]);
                return false;
            }
            if (!z2 && isIgnoreFwUpgrade()) {
                HMLog.i(n, "Ignore as top activity!!!", new Object[0]);
                return false;
            }
            if (WalletUI.getInstance().isInWallet()) {
                HMLog.i(n, "Ignore as in wallet page!!!", new Object[0]);
                return false;
            }
            if (this.j) {
                HMLog.i(n, "FwTask upgrading", new Object[0]);
                return false;
            }
            if (n(context, hMDeviceType)) {
                hMFwUpgradeInfoCheckDeviceVersion = checkChaohuGps(context, hMDeviceType);
                if (hMFwUpgradeInfoCheckDeviceVersion == null) {
                    hMFwUpgradeInfoCheckDeviceVersion = checkDeviceOtherVersion(context, hMDeviceType);
                }
                if (hMFwUpgradeInfoCheckDeviceVersion == null) {
                    hMFwUpgradeInfoCheckDeviceVersion = checkDeviceVersion(context, hMDeviceType);
                }
            } else {
                hMFwUpgradeInfoCheckDeviceVersion = checkDeviceVersion(context, hMDeviceType);
                if (hMFwUpgradeInfoCheckDeviceVersion == null) {
                    hMFwUpgradeInfoCheckDeviceVersion = checkDeviceOtherVersion(context, hMDeviceType);
                }
                if (hMFwUpgradeInfoCheckDeviceVersion == null) {
                    hMFwUpgradeInfoCheckDeviceVersion = checkChaohuGps(context, hMDeviceType);
                }
            }
            if (hMFwUpgradeInfoCheckDeviceVersion == null && HMAgpsUpgradeManager.checkAgpsUpgrade(context, hMDeviceType)) {
                HMLog.i(n, "No need fw upgrade device!!!", new Object[0]);
                return true;
            }
            if (hMFwUpgradeInfoCheckDeviceVersion == null) {
                return false;
            }
            if (!m(hMFwUpgradeInfoCheckDeviceVersion.getFwType())) {
                HMLog.i(n, "disable fw upgrade for " + hMFwUpgradeInfoCheckDeviceVersion.getFwType() + " now!!!", new Object[0]);
                return false;
            }
            if (!i(context, hMFwUpgradeInfoCheckDeviceVersion.getFwType(), hMDeviceType)) {
                HMLog.i(n, "Low battery!!!", new Object[0]);
                return false;
            }
            this.f = hMFwUpgradeInfoCheckDeviceVersion;
            if (DeviceXFunctionsKt.getAppStateApi().getTopActivity() instanceof HMFwUpgradeFailedActivity) {
                HMLog.i(n, "return as HMFwUpgradeFailedActivity showing.", new Object[0]);
                return false;
            }
            boolean isFromFileFw = this.f.getIsFromFileFw();
            HMLog.i(n, "isFwFile = " + isFromFileFw, new Object[0]);
            File fileGenerateFwFileFromAssets = !isFromFileFw ? HMFwUtils.generateFwFileFromAssets(context, this.f.getFwName()) : new File(this.f.getFwFilePath());
            if (fileGenerateFwFileFromAssets != null && fileGenerateFwFileFromAssets.exists()) {
                HMLog.i(n, fileGenerateFwFileFromAssets.getAbsolutePath(), new Object[0]);
                int fwType = this.f.getFwType();
                if (!DeviceXFunctionsKt.getAppStateApi().isForeground()) {
                    HMLog.d(n, "Not fwupgrade in background!!!", new Object[0]);
                    enableFwUpgrade(fwType, true);
                    return false;
                }
                HMLog.i(n, "mFwUpgradeInfoinfo = " + this.f.toString(), new Object[0]);
                HMFirmwareType hMFirmwareType2 = this.i;
                if (hMFirmwareType2 != null && hMFirmwareType2 == (hMFirmwareType = HMFirmwareType.FIRMWARE) && this.f.getFirmwareType() != hMFirmwareType) {
                    HMLog.i(n, "force upgrade!!!!", new Object[0]);
                    z = true;
                } else if (this.i != null && this.f.getFirmwareType() == HMFirmwareType.FIRMWARE) {
                    this.i = null;
                }
                this.f.setForceUpgrade(true);
                if (device.getDeviceInfo().getDeviceSource().getType() != HMDeviceType.TREADMILL) {
                    if (z || !HMDeviceConfig.hasFeatureSportOrTimer(device.getDeviceInfo().getDeviceSource())) {
                        p(context, z);
                    } else {
                        ((HMMiLiProDevice) device).getDfuState(new a(context));
                    }
                    return true;
                }
                HMBoltClassicDevice hMBoltClassicDevice = (HMBoltClassicDevice) device;
                if (hMBoltClassicDevice.getSportState() != HMSportController.TreadmillSportState.NONE) {
                    HMLog.i(n, "sport ongoing: " + hMBoltClassicDevice.getSportState(), new Object[0]);
                } else {
                    p(context, z);
                }
                return true;
            }
            HMLog.d(n, "No fw file!!!", new Object[0]);
            return false;
        }
        HMLog.i(n, "No connection!!!", new Object[0]);
        return false;
    }

    public void enableFwUpgrade(int i, boolean z) {
        this.d.put(i, z);
    }
}
