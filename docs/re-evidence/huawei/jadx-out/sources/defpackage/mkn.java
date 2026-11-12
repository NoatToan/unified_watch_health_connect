package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.Gson;
import com.huawei.datatype.DeviceCommand;
import com.huawei.devicesdk.callback.DeviceCompatibleCallback;
import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.IAddDeviceStateCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.DeviceStateCallback;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.HwAddDeviceInterface;
import com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinderUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.ExerciseUploadCloudListener;
import com.huawei.hwdevice.phoneprocess.mgr.hwbloodglucose.MacaTimeManager;
import com.huawei.hwdevice.phoneprocess.mgr.hwdevicestatusmgr.HwDeviceStatusPushManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.R;
import com.huawei.ui.main.stories.nps.interactors.HwNpsManager;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.wearmgr.outofprocess.datatype.BluetoothType;
import com.huawei.wearmgr.phoneprocess.adapterapi.WearMgrAdapterApi;
import health.compact.a.CommonUtil;
import health.compact.a.HwEncryptUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class mkn implements HwDeviceMgrInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mkn f41817a = null;
    private static final Object d = new Object();
    private static boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f41818b;
    private String h;
    private BTDeviceMgrUtil i;
    private DeviceStateCallback k;
    private mxc l;
    private mxg m;
    private volatile boolean n;
    private mkm o;
    private String q;
    private ncz r;
    private String t;
    private xgt u;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SparseArray<HwAddDeviceInterface> f41819c = new SparseArray<>();
    private boolean p = false;
    private BroadcastReceiver v = new BroadcastReceiver() { // from class: mkn.2

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f41821c = "";

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z;
            if (intent != null) {
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "currentAction: ", intent.getAction());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
                String str = simpleDateFormat.format(new Date());
                MacaTimeManager.d().c(context, intent);
                if ("android.intent.action.TIME_TICK".equals(intent.getAction())) {
                    if (mkn.this.o != null) {
                        mkn.this.o.c(mkn.this.getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "processMemoryCheck"));
                    }
                    if ("".equals(this.f41821c)) {
                        this.f41821c = str;
                        return;
                    }
                    try {
                        Date date = simpleDateFormat2.parse(str);
                        Date date2 = simpleDateFormat2.parse(this.f41821c);
                        long time = date.getTime() - date2.getTime();
                        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "currentTime:", date, ",mLaterTime:", date2, ",timeTap:", Long.valueOf(time));
                        long j = (time / 1000) / 60;
                        if (j > 25 || j < -25) {
                            this.f41821c = str;
                            z = true;
                        } else {
                            this.f41821c = str;
                            return;
                        }
                    } catch (ParseException unused) {
                        this.f41821c = str;
                        return;
                    }
                } else {
                    this.f41821c = str;
                    z = false;
                }
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "isNeedSetTime: ", Boolean.valueOf(z));
                if (mkn.this.o != null) {
                    mkn.this.o.e(intent, z);
                }
            }
        }
    };
    private DeviceStatusChangeCallback j = new DeviceStatusChangeCallback() { // from class: mkn.4
        @Override // com.huawei.devicesdk.callback.DeviceStatusChangeCallback
        public void onConnectStatusChanged(DeviceInfo deviceInfo, int i, int i2) {
            if (deviceInfo == null) {
                LogUtil.e("DEVMGR_HwUniteDeviceMgr", "DeviceInfo is null");
                return;
            }
            if (deviceInfo.getDeviceType() > 0) {
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "onConnectStatusChanged enter");
                UniteDevice uniteDeviceB = mkn.this.o.b(deviceInfo.getDeviceMac());
                if (uniteDeviceB == null) {
                    uniteDeviceB = new UniteDevice();
                    uniteDeviceB.setDeviceInfo(deviceInfo);
                }
                mkn.this.d(cox.c(uniteDeviceB), i);
                mkn.this.b(deviceInfo.getDeviceMac(), i2);
                HwDeviceStatusPushManager.b().d(cox.c(uniteDeviceB), i2);
            }
        }
    };
    private MessageReceiveCallback s = new MessageReceiveCallback() { // from class: mkn.3
        @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
        public void onChannelEnable(DeviceInfo deviceInfo, String str, int i) {
        }

        @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
        public void onDataReceived(DeviceInfo deviceInfo, cmm cmmVar, int i) {
            byte b2;
            if (deviceInfo == null || cmmVar == null || cmmVar.d() == null) {
                LogUtil.e("DEVMGR_HwUniteDeviceMgr", "DeviceInfo or DataFrame is null");
                return;
            }
            byte[] bArrD = cmmVar.d();
            if (bArrD.length > 2) {
                if (bArrD[0] == 1 && ((b2 = bArrD[1]) == 5 || b2 == 50)) {
                    LogUtil.a("DEVMGR_HwUniteDeviceMgr", "parseSynchronizeTimeDataResult");
                    mkn.this.b(cmmVar);
                }
                byte b3 = bArrD[0];
                if (b3 == 27 || b3 == 39) {
                    ReleaseLogUtil.d("DEVMGR_HwUniteDeviceMgr", "response sid: ", Integer.valueOf(b3), " cid: ", Integer.valueOf(bArrD[1]));
                }
                if (bArrD[0] == 1 && bArrD[1] == 58) {
                    LogUtil.a("DEVMGR_HwUniteDeviceMgr", "5.1.58 parse result, deviceIdentify: ", CommonUtil.n(deviceInfo.getDeviceMac()));
                    ExternalDeviceCapability externalDeviceCapabilityB = cnk.c().b(deviceInfo.getDeviceMac());
                    UniteDevice uniteDevice = new UniteDevice();
                    uniteDevice.setIdentify(deviceInfo.getDeviceMac());
                    uniteDevice.setCapability(externalDeviceCapabilityB);
                    uniteDevice.setDeviceInfo(deviceInfo);
                    mmu.e().c(cox.c(uniteDevice), cmmVar);
                }
            }
            if (deviceInfo.getDeviceType() > 0) {
                UniteDevice uniteDevice2 = new UniteDevice();
                uniteDevice2.setDeviceInfo(deviceInfo);
                mkn.this.e(cox.c(uniteDevice2), cmmVar.d().length, cmmVar.d());
            }
            mkn.this.o.d(mke.a(cmmVar.d()));
        }
    };
    private DeviceCompatibleCallback f = new DeviceCompatibleCallback() { // from class: mkn.5
        @Override // com.huawei.devicesdk.callback.DeviceCompatibleCallback
        public void adapterOperate(List<String> list) {
            new mjo().a(list);
            mku.d().c();
        }
    };
    private Context g = BaseApplication.getContext();

    /* JADX INFO: Access modifiers changed from: private */
    public void b(cmm cmmVar) {
        if (cmmVar == null || cmmVar.d() == null) {
            LogUtil.e("DEVMGR_HwUniteDeviceMgr", "DataFrame is null");
            return;
        }
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "parseTimeDataResult");
        cqb cqbVarE = cku.e(cmmVar.d());
        if (cqbVarE == null) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "synchronizeTimeDataResult tlvFather is null");
            return;
        }
        for (cqa cqaVar : cqbVarE.b()) {
            if (cpb.a(cqaVar.b()) == 1) {
                int iA = cpb.a(cqaVar.c());
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                int iAbs = Math.abs(iCurrentTimeMillis - iA);
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "synchronizeTimeData currentTime:", Integer.valueOf(iCurrentTimeMillis), ",replyTime:", Integer.valueOf(iA), "synchronizeTimeData offset:", Integer.valueOf(iAbs));
                if (iAbs >= 2 && !e) {
                    LogUtil.a("DEVMGR_HwUniteDeviceMgr", "checkTimeOffset offset: need resendCmd");
                    e = true;
                    this.o.h();
                    return;
                }
                e = false;
                return;
            }
        }
    }

    private mkn() {
        this.o = null;
        this.u = null;
        this.i = null;
        this.o = mkm.d();
        this.i = BTDeviceMgrUtil.c();
        xgt xgtVarB = xgt.b();
        this.u = xgtVarB;
        this.o.b(xgtVarB);
        this.l = mxc.e();
        this.m = mxg.b();
        this.f41818b = new b(Looper.getMainLooper());
        this.q = UUID.randomUUID().toString();
        this.t = UUID.randomUUID().toString();
        this.h = UUID.randomUUID().toString();
        xgt xgtVar = this.u;
        if (xgtVar != null) {
            xgtVar.registerHandshakeFilter(mky.b().c());
            this.u.registerDeviceCompatibleListener(this.h, this.f);
            this.u.a(this.g);
            this.u.registerDeviceStateListener(this.q, this.j);
            this.u.registerDeviceMessageListener(this.t, this.s);
        }
        q();
        this.r = new ncz();
        this.f41819c.put(2, new mkh());
        this.f41819c.put(1, new mkg());
        this.f41819c.put(0, new mkk());
        s();
    }

    public static mkn e() {
        mkn mknVar;
        synchronized (d) {
            if (f41817a == null) {
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "HwUniteDeviceMgr init.");
                f41817a = new mkn();
            }
            mknVar = f41817a;
        }
        return mknVar;
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void addDevice(DeviceParameter deviceParameter, IAddDeviceStateCallback iAddDeviceStateCallback, String str) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "Enter addDevice().");
        if (deviceParameter == null || deviceParameter.getNameFilter() == null || iAddDeviceStateCallback == null) {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "deviceParameter is null.");
            return;
        }
        nem.d().e(2);
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listC = this.l.c();
        if (b(deviceParameter, listC)) {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "addDevice device relation is assistant, enter switch device.");
            switchDevice(listC, deviceParameter.getMac());
        } else {
            d(deviceParameter, iAddDeviceStateCallback);
        }
    }

    private void d(DeviceParameter deviceParameter, IAddDeviceStateCallback iAddDeviceStateCallback) {
        int iC = SharedPreferenceManager.c(String.valueOf(10024), "isPairedDevice", 0);
        long jD = SharedPreferenceManager.d(String.valueOf(10024), "pairedDeviceTime", 0L);
        if (iC != 1 && jD == 0) {
            SharedPreferenceManager.c(String.valueOf(10024), "pairedDeviceTime", System.currentTimeMillis());
        }
        SharedPreferenceManager.d(String.valueOf(10024), "isPairedDevice", 1);
        if (!TextUtils.isEmpty(deviceParameter.getMac())) {
            if (mjx.d(deviceParameter.getProductType())) {
                if (deviceParameter.getProductType() == 275) {
                    cku.d(deviceParameter.getMac(), deviceParameter.getProductPin());
                } else {
                    cku.b(deviceParameter.getMac(), deviceParameter.getProductPin());
                }
                this.o.b(deviceParameter);
                return;
            }
            mkf.d().addDevice(deviceParameter, iAddDeviceStateCallback, "");
            return;
        }
        int bluetoothType = deviceParameter.getBluetoothType();
        if (bluetoothType == 0) {
            mkf.d().addDevice(deviceParameter, iAddDeviceStateCallback, "");
        } else if (bluetoothType == 1 || bluetoothType == 2) {
            this.f41819c.get(deviceParameter.getBluetoothType()).addDeviceHelper(deviceParameter);
        } else {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "switch other status");
        }
    }

    private boolean b(DeviceParameter deviceParameter, List<com.huawei.health.devicemgr.business.entity.DeviceInfo> list) {
        String strA = mkl.d().a(deviceParameter.getMac());
        Iterator<com.huawei.health.devicemgr.business.entity.DeviceInfo> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().getDeviceIdentify().equalsIgnoreCase(deviceParameter.getMac()) && "assistant_relationship".equalsIgnoreCase(strA)) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void connectDevice(DeviceInfo deviceInfo, int i) {
        if (deviceInfo != null) {
            if (!TextUtils.isEmpty(mkl.d().a(deviceInfo.getDeviceMac()))) {
                List<com.huawei.health.devicemgr.business.entity.DeviceInfo> deviceList = getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "connectDevice");
                c(deviceInfo, deviceList);
                mxc.e().a(this.o.e(deviceInfo, deviceList), true);
            }
            if (!mjx.d(deviceInfo.getDeviceType())) {
                mkf.d().connectDevice(deviceInfo, 0);
                return;
            } else {
                d(deviceInfo);
                return;
            }
        }
        mkf.d().connectDevice(null, i);
        b(i);
    }

    private void d(DeviceInfo deviceInfo) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "Enter connectDeviceDirectly().");
        if (deviceInfo.getDeviceMac() == null) {
            return;
        }
        nem.d().e(2);
        this.n = true;
        mkm mkmVar = this.o;
        if (mkmVar != null) {
            mkmVar.c(new UniteDevice().build(deviceInfo.getDeviceMac(), deviceInfo, null), false, ConnectMode.GENERAL);
        } else {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "connectDeviceDirectly mHwHandleUniteDeviceMgr is null");
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void unPair(List<String> list, boolean z) {
        ReleaseLogUtil.e("DEVMGR_HwUniteDeviceMgr", "unPair: ", Boolean.valueOf(z));
        e(list);
        if (z) {
            a(list);
            mkf.d().unPair(list, true);
            mku.d().c();
        } else {
            c(list);
            mkf.d().unPair(list, false);
        }
    }

    private void e(List<String> list) {
        UniteDevice uniteDeviceB;
        if (list == null) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "reportDeviceUnPairData macList is null");
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && (uniteDeviceB = this.o.b(str)) != null && uniteDeviceB.getDeviceInfo() != null) {
                cqp.a(100026, StringUtils.c((Object) uniteDeviceB.getDeviceInfo().getDeviceName()), String.valueOf(uniteDeviceB.getDeviceInfo().getDeviceConnectState()), "");
            }
        }
    }

    private void c(List<String> list) {
        mkm mkmVar = this.o;
        if (mkmVar == null) {
            LogUtil.e("DEVMGR_HwUniteDeviceMgr", "disconnectDevice mHwHandleUniteDeviceMgr is null");
            return;
        }
        List<UniteDevice> listI = mkmVar.i();
        if (list == null) {
            Iterator<UniteDevice> it = listI.iterator();
            while (it.hasNext()) {
                this.o.e(it.next());
            }
            return;
        }
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("DEVMGR_HwUniteDeviceMgr", "disconnectDevice mac is empty");
            } else {
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "disconnectDevice mac: ", CommonUtil.n(str));
                for (UniteDevice uniteDevice : listI) {
                    if (uniteDevice == null || uniteDevice.getDeviceInfo() == null || uniteDevice.getDeviceInfo().getDeviceMac() == null) {
                        LogUtil.j("DEVMGR_HwUniteDeviceMgr", "disconnectDevice parameter error");
                    } else if (uniteDevice.getDeviceInfo().getDeviceMac().equals(str)) {
                        this.o.e(uniteDevice);
                        if (uniteDevice.getDeviceInfo().getDeviceBtType() == 2) {
                            coi.b().e(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(uniteDevice.getDeviceInfo().getDeviceMac()));
                        }
                    }
                }
            }
        }
    }

    private void a(List<String> list) {
        if (this.o == null) {
            LogUtil.e("DEVMGR_HwUniteDeviceMgr", "removeDevice mHwHandleUniteDeviceMgr is null");
            return;
        }
        if (list == null) {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "deleteDevice macList is null");
            for (UniteDevice uniteDevice : this.o.i()) {
                if (uniteDevice == null || uniteDevice.getDeviceInfo() == null) {
                    LogUtil.j("DEVMGR_HwUniteDeviceMgr", "removeDevice parameter error");
                } else {
                    d(uniteDevice.getDeviceInfo().getDeviceMac());
                    ndb.b().e(uniteDevice.getDeviceInfo().getDeviceMac(), 20230830);
                }
            }
            return;
        }
        boolean zB = SharedPreferenceManager.b(Integer.toString(1000), "wearable_unpair_reconnection", false);
        this.p = zB;
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "mIsNotificationHideScene: ", Boolean.valueOf(zB));
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("DEVMGR_HwUniteDeviceMgr", "removeDevice mac is empty");
            } else {
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "removeDevice mac: ", CommonUtil.n(str));
                ndb.b().e(str, 20230830);
                d(str);
            }
        }
        if (this.p) {
            SharedPreferenceManager.a(Integer.toString(1000), "wearable_unpair_reconnection", false);
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "set WEARABLE_UNPAIR_RECONNECTION false");
            this.p = false;
        }
    }

    private void b(int i) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "forceConnectDevice enter", Integer.valueOf(i));
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listE = this.o.e();
        if (listE.size() == 0) {
            return;
        }
        boolean z = (BluetoothType.AW.getValue() & i) == BluetoothType.AW.getValue();
        boolean z2 = (BluetoothType.BR.getValue() & i) == BluetoothType.BR.getValue();
        boolean z3 = (BluetoothType.BLE.getValue() & i) == BluetoothType.BLE.getValue();
        boolean z4 = (BluetoothType.DUAL.getValue() & i) == BluetoothType.DUAL.getValue();
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "isConnectAw", Boolean.valueOf(z), "isConnectBr", Boolean.valueOf(z2), "isConnectBle", Boolean.valueOf(z3), "isConnectAual", Boolean.valueOf(z4));
        for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : listE) {
            if (i != BluetoothType.BLE.getValue() || cpt.a(deviceInfo.getDeviceName(), deviceInfo.getDeviceIdentify())) {
                int deviceBluetoothType = deviceInfo.getDeviceBluetoothType();
                if (z || deviceBluetoothType != 0) {
                    if (z2 || deviceBluetoothType != 1) {
                        if (z3 || deviceBluetoothType != 2) {
                            if (z4 || deviceBluetoothType != 4) {
                                if (deviceInfo.getDeviceConnectState() != 2 && deviceInfo.getDeviceActiveState() == 1) {
                                    UniteDevice uniteDeviceB = this.o.b(deviceInfo.getDeviceIdentify());
                                    if (deviceBluetoothType == 0) {
                                        if (deviceInfo.getDeviceConnectState() != 1) {
                                            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "Start to connect AW device.");
                                            this.o.c(uniteDeviceB, true, ConnectMode.GENERAL);
                                            return;
                                        }
                                        return;
                                    }
                                    if (deviceBluetoothType == 2 || this.o.b(deviceInfo)) {
                                        this.o.c(uniteDeviceB, true, ConnectMode.GENERAL);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void registerDeviceStateCallback(DeviceStateCallback deviceStateCallback) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "Enter registerDeviceStateCallback");
        this.k = deviceStateCallback;
        this.o.e(deviceStateCallback);
        mky.b().b(deviceStateCallback);
    }

    private void d(String str) {
        boolean z;
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listE = this.o.e();
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "removeCurrentDevice getDeviceInfoListHandle");
        Iterator<com.huawei.health.devicemgr.business.entity.DeviceInfo> it = listE.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (it.next().getDeviceIdentify().equalsIgnoreCase(str)) {
                z = true;
                break;
            }
        }
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "removeCurrentDevice isAdded:", Boolean.valueOf(z));
        if (z) {
            if (this.p) {
                coi.b().e(str);
                coi.b().e(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str));
                return;
            } else {
                a(str);
                return;
            }
        }
        this.o.c(str, true);
    }

    private void t() {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "sendDeviceListChangeBroadcast.");
        this.g.sendBroadcast(new Intent("com.huawei.bone.action.DEVICE_LIST_CHANGED"), LocalBroadcast.f36595c);
    }

    private void a(String str) {
        boolean z;
        com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo = null;
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> deviceList = getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "clearDeviceByMac");
        Iterator<com.huawei.health.devicemgr.business.entity.DeviceInfo> it = deviceList.iterator();
        while (it.hasNext()) {
            com.huawei.health.devicemgr.business.entity.DeviceInfo next = it.next();
            String deviceIdentify = next.getDeviceIdentify();
            if (deviceIdentify != null && deviceIdentify.equalsIgnoreCase(str)) {
                it.remove();
                deviceInfo = next;
                break;
            }
        }
        if (deviceInfo == null) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "deleteDeviceInfo is null.");
            return;
        }
        t();
        this.o.c(deviceInfo);
        UniteDevice uniteDeviceB = this.o.b(deviceInfo.getDeviceIdentify());
        if (uniteDeviceB != null) {
            this.l.d(str);
            this.u.unPairDevice(uniteDeviceB);
            z = true;
        } else {
            z = false;
        }
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "clearDeviceByMac isUdsDevice is ", Boolean.valueOf(z));
        if (z) {
            c(deviceList, deviceInfo);
            nem.d().d(deviceList);
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void sendDeviceData(DeviceCommand deviceCommand) {
        if (deviceCommand == null) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "sendDeviceData() deviceCommand is null.");
            return;
        }
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "sendDeviceData ServiceID:", Integer.valueOf(deviceCommand.getServiceID()), ", CommandID:", Integer.valueOf(deviceCommand.getCommandID()));
        if (((byte) deviceCommand.getServiceID()) == 1 && ((byte) deviceCommand.getCommandId()) == 48) {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "sendDeviceData, get 5.1.48 command content");
            e(deviceCommand);
            return;
        }
        HashSet hashSet = new HashSet();
        Map<String, UniteDevice> mapC = this.o.c(hashSet);
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> deviceList = mkf.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "sendDeviceData");
        if (!TextUtils.isEmpty(deviceCommand.getmIdentify())) {
            if (hashSet.contains(deviceCommand.getmIdentify()) || b(deviceCommand)) {
                a(deviceCommand);
                return;
            } else {
                mkf.d().sendDeviceData(deviceCommand);
                return;
            }
        }
        b(mapC, deviceList, deviceCommand);
    }

    private boolean b(DeviceCommand deviceCommand) {
        return ((byte) deviceCommand.getServiceID()) == 26 && ((byte) deviceCommand.getCommandId()) == 6;
    }

    private void b(Map<String, UniteDevice> map, List<com.huawei.health.devicemgr.business.entity.DeviceInfo> list, DeviceCommand deviceCommand) {
        if (map.size() + list.size() == 2) {
            for (UniteDevice uniteDevice : map.values()) {
                d(deviceCommand, uniteDevice, eel.d(uniteDevice.getDeviceInfo().getDeviceType()));
            }
            for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : list) {
                d(deviceCommand, deviceInfo.getDeviceIdentify(), eel.d(deviceInfo.getProductType()));
            }
            return;
        }
        if (map.size() + list.size() == 1) {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "sendDeviceData has only one device");
            if (map.size() == 1) {
                Iterator<UniteDevice> it = map.values().iterator();
                if (it.hasNext()) {
                    deviceCommand.setmIdentify(it.next().getIdentify());
                    a(deviceCommand);
                    return;
                }
                return;
            }
            mkf.d().sendDeviceData(deviceCommand);
            return;
        }
        LogUtil.d("DEVMGR_HwUniteDeviceMgr", "sendDeviceData go to else branch");
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public List<com.huawei.health.devicemgr.business.entity.DeviceInfo> getDeviceList(HwGetDevicesMode hwGetDevicesMode, HwGetDevicesParameter hwGetDevicesParameter, String str) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "getDeviceList enter mode: ", hwGetDevicesMode, " tag: ", str);
        ArrayList arrayList = new ArrayList(24);
        if (hwGetDevicesMode == null) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "getDeviceList mode is null.");
            return arrayList;
        }
        switch (AnonymousClass1.f41820a[hwGetDevicesMode.ordinal()]) {
            case 1:
                return g();
            case 2:
                return o();
            case 3:
                return d();
            case 4:
                return f();
            case 5:
                return e(hwGetDevicesParameter);
            case 6:
                return i();
            case 7:
                return a();
            case 8:
                return m();
            case 9:
                return n();
            default:
                LogUtil.j("DEVMGR_HwUniteDeviceMgr", "getDeviceList unsupport mode.");
                return arrayList;
        }
    }

    /* JADX INFO: renamed from: mkn$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41820a;

        static {
            int[] iArr = new int[HwGetDevicesMode.values().length];
            f41820a = iArr;
            try {
                iArr[HwGetDevicesMode.ALL_DEVICES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41820a[HwGetDevicesMode.CONNECTED_MAIN_DEVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41820a[HwGetDevicesMode.ACTIVE_MAIN_DEVICES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41820a[HwGetDevicesMode.CONNECTED_AW70_DEVICES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41820a[HwGetDevicesMode.IDENTIFY_DEVICES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41820a[HwGetDevicesMode.CONNECTED_DEVICES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41820a[HwGetDevicesMode.ACTIVE_DEVICES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41820a[HwGetDevicesMode.MAIN_FOLLOW_DEVICES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41820a[HwGetDevicesMode.FOLLOWED_DEVICES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void registerAdapter(WearMgrAdapterApi wearMgrAdapterApi) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "registerAdapter.");
    }

    private List<com.huawei.health.devicemgr.business.entity.DeviceInfo> g() {
        ArrayList arrayList = new ArrayList(24);
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listE = this.o.e();
        if (listE.size() != 0) {
            for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : listE) {
                if ("assistant_relationship".equals(deviceInfo.getRelationship())) {
                    deviceInfo.setDeviceConnectState(3);
                    deviceInfo.setDeviceActiveState(0);
                }
            }
            arrayList.addAll(listE);
        }
        arrayList.addAll(mkf.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, ""));
        if (arrayList.size() == 0) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "getAllDeviceList deviceInfoList size is zero.");
        }
        return mkl.d().a(arrayList);
    }

    private List<com.huawei.health.devicemgr.business.entity.DeviceInfo> o() {
        ArrayList arrayList = new ArrayList(24);
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listG = g();
        if (listG.size() == 0) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "return getConnectedMainDeviceList() size is 0");
            return arrayList;
        }
        for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : listG) {
            if (deviceInfo.getDeviceConnectState() == 2 && "main_relationship".equals(deviceInfo.getRelationship())) {
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "getConnectedMainDeviceList device name ", deviceInfo.getDeviceName());
                arrayList.add(deviceInfo);
            }
        }
        return arrayList;
    }

    private List<com.huawei.health.devicemgr.business.entity.DeviceInfo> i() {
        ArrayList arrayList = new ArrayList(24);
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listG = g();
        if (listG != null && listG.size() != 0) {
            for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : listG) {
                if (deviceInfo.getDeviceConnectState() == 2) {
                    LogUtil.a("DEVMGR_HwUniteDeviceMgr", "getConnectedDeviceList device name ", deviceInfo.getDeviceName());
                    arrayList.add(deviceInfo);
                }
            }
        }
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "return getConnectedDeviceList() size:", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private List<com.huawei.health.devicemgr.business.entity.DeviceInfo> f() {
        ArrayList arrayList = new ArrayList(24);
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listG = g();
        if (listG != null && listG.size() != 0) {
            for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : listG) {
                if (deviceInfo.getDeviceConnectState() == 2 && eel.d(deviceInfo.getProductType())) {
                    arrayList.add(deviceInfo);
                }
            }
        }
        if (arrayList.size() == 0) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "getConnectedAw70DeviceList deviceInfoList size is zero.");
        }
        return arrayList;
    }

    private List<com.huawei.health.devicemgr.business.entity.DeviceInfo> a() {
        ArrayList arrayList = new ArrayList(24);
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listG = g();
        if (listG != null && listG.size() != 0) {
            for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : listG) {
                if (deviceInfo.getDeviceActiveState() == 1) {
                    arrayList.add(deviceInfo);
                }
            }
        }
        if (arrayList.size() == 0) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "getActiveDeviceList deviceInfoListBaks size is zero.");
        }
        return arrayList;
    }

    private List<com.huawei.health.devicemgr.business.entity.DeviceInfo> d() {
        ArrayList arrayList = new ArrayList(24);
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listG = g();
        if (listG.size() != 0) {
            for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : listG) {
                if (deviceInfo.getDeviceActiveState() == 1 && "main_relationship".equals(deviceInfo.getRelationship())) {
                    arrayList.add(deviceInfo);
                }
            }
        }
        if (arrayList.size() == 0) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "getActiveMainDeviceList deviceInfoListBaks size is zero.");
        }
        return arrayList;
    }

    private List<com.huawei.health.devicemgr.business.entity.DeviceInfo> e(HwGetDevicesParameter hwGetDevicesParameter) {
        ArrayList arrayList = new ArrayList(24);
        if (hwGetDevicesParameter == null) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "getSpecificDeviceList parameter is null.");
            return arrayList;
        }
        String deviceIdentify = hwGetDevicesParameter.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "igetSpecificDeviceList identify of parameter is null.");
            return arrayList;
        }
        String strReplaceAll = deviceIdentify.replaceAll(":", "");
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listG = g();
        if (listG.size() != 0) {
            String strReplaceAll2 = "";
            for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : listG) {
                String deviceIdentify2 = deviceInfo.getDeviceIdentify();
                if (deviceIdentify2 != null) {
                    strReplaceAll2 = deviceIdentify2.replaceAll(":", "");
                }
                if (strReplaceAll2.contains(strReplaceAll)) {
                    arrayList.add(deviceInfo);
                    break;
                }
            }
        }
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "return getSpecificDeviceList() size:", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private List<com.huawei.health.devicemgr.business.entity.DeviceInfo> m() {
        ArrayList arrayList = new ArrayList(24);
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listG = g();
        if (listG != null && listG.size() != 0) {
            for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : listG) {
                if (deviceInfo.getDeviceActiveState() == 1 && ("main_relationship".equals(deviceInfo.getRelationship()) || "followed_relationship".equals(deviceInfo.getRelationship()))) {
                    arrayList.add(deviceInfo);
                }
            }
        }
        if (arrayList.size() == 0) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "getMainAndFollowDeviceList deviceInfoListBaks size is zero.");
        }
        return arrayList;
    }

    private List<com.huawei.health.devicemgr.business.entity.DeviceInfo> n() {
        ArrayList arrayList = new ArrayList(24);
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listG = g();
        if (listG != null && listG.size() != 0) {
            for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : listG) {
                if (deviceInfo.getDeviceActiveState() == 1 && "followed_relationship".equals(deviceInfo.getRelationship())) {
                    arrayList.add(deviceInfo);
                }
            }
        }
        if (arrayList.size() == 0) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "getFollowedDeviceList() deviceInfoListBaks size is zero.");
        }
        return arrayList;
    }

    private void d(DeviceCommand deviceCommand, String str, boolean z) {
        if (deviceCommand.getServiceID() == 23 && deviceCommand.getCommandID() == 15) {
            if (z) {
                deviceCommand.setmIdentify(str);
                mkf.d().sendDeviceData(deviceCommand);
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        deviceCommand.setmIdentify(str);
        mkf.d().sendDeviceData(deviceCommand);
    }

    private void d(DeviceCommand deviceCommand, UniteDevice uniteDevice, boolean z) {
        if (deviceCommand.getServiceID() == 23 && deviceCommand.getCommandID() == 15) {
            if (z) {
                deviceCommand.setmIdentify(uniteDevice.getIdentify());
                a(deviceCommand);
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        deviceCommand.setmIdentify(uniteDevice.getIdentify());
        a(deviceCommand);
    }

    private void a(DeviceCommand deviceCommand) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "sendDeviceCommand enter");
        if (lre.b(deviceCommand.getmIdentify()) && deviceCommand.getServiceID() != 9) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "OTA update, other command can't send...");
            return;
        }
        if (deviceCommand.getCommandID() == 13 && deviceCommand.getServiceID() == 1) {
            this.o.b();
        }
        this.o.e(deviceCommand);
    }

    private void e(DeviceCommand deviceCommand) {
        if (deviceCommand == null) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "getCommandContentAndNotifyUserSelect() deviceCommand is null.");
            return;
        }
        byte[] dataContent = deviceCommand.getDataContent();
        if (!(mky.b().e(deviceCommand.getmIdentify()) instanceof mkz)) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "Command is not instanceof StartupGuideUserSettingCommand");
        } else {
            ((mkz) mky.b().e(deviceCommand.getmIdentify())).b(dataContent);
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void switchDevice(List<com.huawei.health.devicemgr.business.entity.DeviceInfo> list, String str) {
        ReleaseLogUtil.d("DEVMGR_HwUniteDeviceMgr", "Enter switchDevice");
        if (list == null) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "Parameter is incorrect.");
            return;
        }
        for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : list) {
            if (deviceInfo != null && deviceInfo.getDeviceIdentify().equals(str)) {
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "switchDevice report");
                cqp.a(100057, deviceInfo.getDeviceName(), "", "");
                break;
            }
        }
        this.o.b();
        if (this.o.e().size() == 0) {
            mkf.d().switchDevice(list, str);
            return;
        }
        if (list.size() != getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "switchDevice").size()) {
            LogUtil.e("DEVMGR_HwUniteDeviceMgr", "Deleting devices is not supported");
        } else {
            a(list, str);
        }
    }

    private void a(List<com.huawei.health.devicemgr.business.entity.DeviceInfo> list, String str) {
        Iterator<Integer> it = this.o.c(list, str).iterator();
        while (it.hasNext()) {
            com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo = list.get(it.next().intValue());
            if (this.o.d(deviceInfo)) {
                if (eel.d(deviceInfo.getProductType())) {
                    this.l.a(deviceInfo);
                } else {
                    this.l.a(deviceInfo, true);
                }
                DeviceInfo deviceInfo2 = new DeviceInfo();
                if (mjx.d(deviceInfo.getProductType())) {
                    this.o.c(this.o.b(deviceInfo.getDeviceIdentify()), true, ConnectMode.GENERAL);
                } else {
                    deviceInfo2.setDeviceBtType(deviceInfo.getDeviceBluetoothType());
                    deviceInfo2.setDeviceName(deviceInfo.getDeviceName());
                    deviceInfo2.setDeviceMac(deviceInfo.getDeviceIdentify());
                    deviceInfo2.setDeviceType(deviceInfo.getProductType());
                    mkf.d().connectDevice(deviceInfo2, 0);
                }
            }
        }
    }

    private void c(DeviceInfo deviceInfo, List<com.huawei.health.devicemgr.business.entity.DeviceInfo> list) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "Enter handleSameTypeDevice(). deviceInfo isNull :", Boolean.valueOf(deviceInfo == null), ", deviceInfoList isNull :", Boolean.valueOf(list == null));
        if (deviceInfo == null || list == null) {
            return;
        }
        if (this.m.e(deviceInfo.getDeviceType(), deviceInfo.getDeviceMac())) {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "handleSameTypeDevice device is follow and is not aw70");
            return;
        }
        if (eel.d(deviceInfo.getDeviceType())) {
            for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo2 : list) {
                if (eel.d(deviceInfo2.getProductType()) && deviceInfo2.getDeviceActiveState() == 1 && !deviceInfo.getDeviceMac().equalsIgnoreCase(deviceInfo2.getDeviceIdentify())) {
                    LogUtil.a("DEVMGR_HwUniteDeviceMgr", "handleSameTypeDevice has active aw70 device");
                    e(deviceInfo2.getDeviceIdentify());
                }
            }
            return;
        }
        for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo3 : list) {
            if (!eel.d(deviceInfo3.getProductType(), deviceInfo3.getAutoDetectSwitchStatus()) && deviceInfo3.getDeviceActiveState() == 1 && !deviceInfo.getDeviceMac().equalsIgnoreCase(deviceInfo3.getDeviceIdentify()) && !this.m.e(deviceInfo3.getProductType(), deviceInfo3.getDeviceIdentify())) {
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "handleSameTypeDevice has active band mode device");
                g(deviceInfo3);
            }
        }
    }

    private void g(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        if (this.m.a(deviceInfo)) {
            return;
        }
        e(deviceInfo.getDeviceIdentify());
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void unRegisterDeviceStateCallback(DeviceStateCallback deviceStateCallback) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "enter unRegisterDeviceStateCallback");
        this.k = null;
        this.o.g();
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void destroy() {
        synchronized (d) {
            a((mkn) null);
        }
        mxg mxgVar = this.m;
        if (mxgVar != null) {
            mxgVar.d();
        }
        mxc mxcVar = this.l;
        if (mxcVar != null) {
            mxcVar.d();
        }
        mkm mkmVar = this.o;
        if (mkmVar != null) {
            mkmVar.a();
        }
        Context context = this.g;
        if (context != null) {
            try {
                context.unregisterReceiver(this.v);
            } catch (IllegalArgumentException unused) {
                LogUtil.e("DEVMGR_HwUniteDeviceMgr", "destroy IllegalArgumentException");
            }
        }
        xgt xgtVar = this.u;
        if (xgtVar != null) {
            xgtVar.unregisterDeviceStateListener(this.q);
            this.u.unregisterDeviceMessageListener(this.t);
            this.u.unregisterDeviceCompatibleListener(this.h);
        }
        nfm.d().c();
        ExerciseUploadCloudListener.getInstance().unRegisterExerciseUploadCloudListener();
        if (mkf.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "udsdestroy").size() == 0) {
            mkf.d().destroy();
        }
    }

    public void a(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo, int i) {
        if (deviceInfo == null) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "btDeviceInfo is null");
            return;
        }
        if (i == 2) {
            f(deviceInfo);
            this.u.updateDeviceAfterSimulatConnected(deviceInfo.getDeviceIdentify());
            String strA = mkl.d().a(deviceInfo.getDeviceIdentify());
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "simulatNotifyConnectionStateChanged deviceIdentify:", CommonUtil.n(deviceInfo.getDeviceIdentify()), " deviceRelation: ", strA);
            if ("main_relationship".equals(strA) && eey.d(deviceInfo, 219)) {
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "simulatNotifyConnectionStateChanged Connected device notification level register");
                ncc.c().a();
            }
            if (eey.d(deviceInfo, 256)) {
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "preProcessLogicBefore Connected device notification level register");
                mau.e().a();
            }
            if (eey.d(deviceInfo, 293)) {
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "preProcessLogicBefore Connected device register PhoneLockScreenStatus");
                ncb.d().a(this.u);
            }
            mvq.c().a();
        }
        if (i == 3) {
            ncb.d().b();
        }
        c(deviceInfo, i);
    }

    /* JADX INFO: loaded from: classes10.dex */
    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 55) {
                qpx.e(mkn.this.g.getApplicationContext(), mkn.this.g.getString(R.string.IDS_blite_guide_paire_fail_no_hilink_device_string));
            } else {
                if (i != 56) {
                    return;
                }
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "unPairDevice fail.");
            }
        }
    }

    private void q() {
        if (this.g != null) {
            this.g.registerReceiver(this.v, new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
            IntentFilter intentFilter = new IntentFilter("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            this.g.registerReceiver(this.v, intentFilter);
            this.g.registerReceiver(this.v, new IntentFilter("android.intent.action.DATE_CHANGED"));
        }
    }

    private void c(List<com.huawei.health.devicemgr.business.entity.DeviceInfo> list, com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        com.huawei.health.devicemgr.business.entity.DeviceInfo next;
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "Enter resetActiveDevice.");
        if (list.isEmpty()) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "resetActiveDevice usedDeviceList is empty.");
            return;
        }
        if ("followed_relationship".equals(deviceInfo.getRelationship()) && !eel.d(deviceInfo.getProductType())) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "resetActiveDevice is follow.");
            return;
        }
        ArrayList arrayList = new ArrayList(24);
        for (int i = 0; i < list.size(); i++) {
            if ("main_relationship".equals(list.get(i).getRelationship()) && list.get(i).getDeviceActiveState() == 1) {
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "active device name: ", list.get(i).getDeviceName());
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (!arrayList.isEmpty()) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "resetActiveDevice exist active device.");
            return;
        }
        Iterator<com.huawei.health.devicemgr.business.entity.DeviceInfo> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!"main_relationship".equalsIgnoreCase(mkl.d().a(next.getDeviceIdentify())));
        if (next != null) {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "resetActiveDevice activeMainDevice fuzzData: ", CommonUtil.n(next.getDeviceIdentify()));
            if (this.o.a(next.getDeviceIdentify())) {
                DeviceInfo deviceInfo2 = new DeviceInfo();
                deviceInfo2.setDeviceBtType(next.getDeviceBluetoothType());
                deviceInfo2.setDeviceName(next.getDeviceName());
                deviceInfo2.setDeviceMac(next.getDeviceIdentify());
                deviceInfo2.setDeviceType(next.getProductType());
                c(deviceInfo2, getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "resetActiveDevice"));
                d(deviceInfo2);
                return;
            }
            mkf.d().e(next);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo, int i) {
        if (deviceInfo == null) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "btDeviceInfo is null state:", Integer.valueOf(i));
            return;
        }
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "enter onDeviceConnectionStateChanged with state:", Integer.valueOf(i), " deviceIdentify:", CommonUtil.n(deviceInfo.getDeviceIdentify()));
        if (i == 33) {
            mkl.d().c(ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DEVMGR_HwUniteDeviceMgr"), "DEVMGR_HwUniteDeviceMgr");
        }
        if (i == 1) {
            loa.a().b(deviceInfo, System.currentTimeMillis());
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "mDeviceStateCallback device start connecting, time:", Long.valueOf(System.currentTimeMillis()));
        }
        e(deviceInfo, i);
    }

    private DeviceCapability d(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        UniteDevice uniteDeviceB;
        if (TextUtils.isEmpty(deviceInfo.getDeviceIdentify()) || (uniteDeviceB = this.o.b(deviceInfo.getDeviceIdentify())) == null) {
            return null;
        }
        return cox.e(uniteDeviceB);
    }

    private void n(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "Enter sendConnectStatus");
        DeviceCapability deviceCapabilityD = d(deviceInfo);
        if (deviceCapabilityD != null && deviceCapabilityD.isSupportConnectStatus()) {
            lnr lnrVarC = lmw.c();
            lnrVarC.e(deviceInfo.getDeviceIdentify());
            this.o.e(lnrVarC);
            return;
        }
        LogUtil.j("DEVMGR_HwUniteDeviceMgr", "not support connect status");
    }

    private void e(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo, int i) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "onDeviceConnectionStateChanged btState: ", Integer.valueOf(i));
        if (deviceInfo == null) {
            return;
        }
        if (i == 2) {
            this.l.a(deviceInfo, false);
            h(deviceInfo);
            f(deviceInfo);
            boolean zD = eey.d(deviceInfo, 223);
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "isSupportConnectNewPhone: ", Boolean.valueOf(zD), " deviceIdentify: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
            m(deviceInfo);
            n(deviceInfo);
            b(deviceInfo);
        }
        if (i == 3) {
            ncb.d().b();
        }
        if (i == 4) {
            mmu.e().d(deviceInfo);
            mmu.e().e(deviceInfo);
        }
        this.l.e(deviceInfo, i);
        y();
        if (CommonUtil.ck() && this.o != null) {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "onDeviceConnectionStateChanged is support wearProduct and uniteDeviceMgr is not null");
            eem.a(g(), "DEVMGR_HwUniteDeviceMgr");
        }
        if ("assistant_relationship".equals(deviceInfo.getRelationship())) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "sendConnectStateBroadcast intent is assistant device.");
        } else {
            c(deviceInfo, i);
        }
    }

    private void b(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        mmu.e().b(deviceInfo);
        mmu.e().a(deviceInfo);
    }

    private void h(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        String relationship = deviceInfo.getRelationship();
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "preProcessLogicBeforeConnectedBroadcast relationship is empty:", Boolean.valueOf(TextUtils.isEmpty(relationship)));
        if (TextUtils.isEmpty(relationship)) {
            String strA = mkl.d().a(deviceInfo.getDeviceIdentify());
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "preProcessLogicBeforeConnectedBroadcast deviceIdentify:", CommonUtil.n(deviceInfo.getDeviceIdentify()), " deviceRelation: ", strA);
            if ("main_relationship".equals(strA)) {
                if (eey.d(deviceInfo, 191)) {
                    LogUtil.a("DEVMGR_HwUniteDeviceMgr", "preProcessLogicBeforeConnectedBroadcast device sync register callback");
                    mxn.c().a();
                }
                if (eey.d(deviceInfo, 219)) {
                    LogUtil.a("DEVMGR_HwUniteDeviceMgr", "preProcessLogicBefore Connected device notification level register");
                    ncc.c().a();
                }
                mvq.c().a();
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "HwUniteDeviceDstSyncMgr.getInstance().registerZoneTimeDstOffListener();");
                if (eey.d(deviceInfo, 256)) {
                    LogUtil.a("DEVMGR_HwUniteDeviceMgr", "preProcessLogicBefore Connected device notification level register");
                    mau.e().a();
                }
                if (eey.d(deviceInfo, 293)) {
                    ncb.d().a(this.u);
                }
                if (mii.d(deviceInfo.getDeviceIdentify())) {
                    mox.e().a(deviceInfo);
                }
            }
        }
    }

    private void m(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 182);
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "isSupportReverseCapability: ", Boolean.valueOf(zD));
        if (zD) {
            byte[] bArrL = l();
            if (bArrL == null || bArrL.length == 0) {
                LogUtil.j("DEVMGR_HwUniteDeviceMgr", "sendReverseCapability capability is error.");
                return;
            }
            lnr lnrVarB = lmw.b(bArrL);
            lnrVarB.e(deviceInfo.getDeviceIdentify());
            this.o.e(lnrVarB);
            return;
        }
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "sendReverseCapability capability is not support.");
    }

    private byte[] l() {
        List<Integer> listA = mis.e().a();
        if (listA.size() - 1 < 0) {
            return new byte[0];
        }
        int iIntValue = listA.get(listA.size() - 1).intValue();
        byte[] bArr = new byte[iIntValue != 0 ? (iIntValue / 8) + 1 : 0];
        Iterator<Integer> it = listA.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            int i = iIntValue2 / 8;
            bArr[i] = (byte) ((1 << (iIntValue2 % 8)) | bArr[i]);
        }
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "getReverseCapabilityBytes result: ", cph.d(bArr));
        return bArr;
    }

    private void f(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 104);
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "onDeviceConnectionStateChanged, isSupportConfigManager: ", Boolean.valueOf(zD));
        if (zD) {
            mru.e().e(deviceInfo);
        }
    }

    private void c(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo, int i) {
        if (i == 1) {
            lmq.c(deviceInfo.getDeviceName());
        }
        if (i != 2) {
            lre.c(deviceInfo.getDeviceIdentify(), false);
            mxs.a().d();
            mln.b().d(deviceInfo);
            nbv.b().a();
            deviceInfo.setDeviceConnectState(i);
        } else {
            a(deviceInfo);
        }
        l(deviceInfo);
    }

    private void a(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        mxn.c().a(deviceInfo);
        mvk.d().a(deviceInfo);
        ExerciseUploadCloudListener.getInstance().registerExerciseUploadCloudListener();
        mxs.a().c();
        mln.b().e(deviceInfo);
        lre.d(deviceInfo.getDeviceIdentify(), true);
        if (eey.d(deviceInfo, FitWorkout.CATEGORY_REAL_SCENE) || eey.d(deviceInfo, 285)) {
            nbv.b().c();
        }
    }

    private void l(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "Enter sendConnectStateBroadcast(). ", Integer.valueOf(clz.c()));
        if (deviceInfo == null) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "In UDS-sendConnectStateBroadcast(), btDeviceInfo is null");
            return;
        }
        o(deviceInfo);
        nff.e(deviceInfo);
        mgu.a(deviceInfo);
        mli.d(deviceInfo);
        this.g.sendOrderedBroadcast(c(deviceInfo), LocalBroadcast.f36595c);
        mkm mkmVar = this.o;
        if (mkmVar != null) {
            e(deviceInfo, mkmVar.e());
        }
        DeviceStateCallback deviceStateCallback = this.k;
        if (deviceStateCallback != null) {
            deviceStateCallback.onConnectStatusChanged(deviceInfo);
        }
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> deviceList = getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, "sendConnectStateBroadcast");
        com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo2 = deviceList.size() > 0 ? deviceList.get(0) : null;
        if (deviceInfo2 != null && deviceInfo.getDeviceIdentify().equals(deviceInfo2.getDeviceIdentify())) {
            String string = this.g.getSharedPreferences("deviceUpdateSharedPreferences", 0).getString("aw70UpdateCheckTime", "");
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "Enter aw70 sendConnectStateBroadcast(). aw70 mAppCheckTime:", string);
            if (!this.o.e(string)) {
                Intent intent = new Intent("com.huawei.bone.action.UPDATE_DEVICE");
                intent.putExtra("is_current_device_aw70", true);
                this.g.sendBroadcast(intent, LocalBroadcast.f36595c);
            }
        } else if (deviceInfo.getDeviceConnectState() == 2) {
            clz.e(1000000);
        }
        if (deviceInfo.getDeviceConnectState() == 2) {
            mja.b(deviceInfo.getDeviceIdentify(), 1);
        }
    }

    private void o(final com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        String strB = net.b(deviceInfo);
        if (TextUtils.isEmpty(lua.e("cloud_device_name", strB, ""))) {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "sendConnectStateBroadcast getDeviceNameFromSp is null.");
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final String[] strArr = {""};
            ThreadPoolManager.c().a("DEVMGR_HwUniteDeviceMgr", new Runnable() { // from class: mkp
                @Override // java.lang.Runnable
                public final void run() {
                    mkn.e(strArr, deviceInfo, countDownLatch);
                }
            });
            try {
                countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                LogUtil.j("DEVMGR_HwUniteDeviceMgr", "sendConnectStateBroadcast getDeviceNameFromCloud time out.");
            }
            String str = strArr[0];
            ReleaseLogUtil.d("DEVMGR_HwUniteDeviceMgr", "sendConnectStateBroadcast getDeviceNameFromSp deviceName: ", str);
            net.b("DEVMGR_HwUniteDeviceMgr", strB, str);
        }
    }

    static /* synthetic */ void e(String[] strArr, com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo, CountDownLatch countDownLatch) {
        strArr[0] = net.e("DEVMGR_HwUniteDeviceMgr", deviceInfo);
        countDownLatch.countDown();
    }

    private Intent c(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "Enter createDeviceStateIntent deviceIdentify: ", CommonUtil.n(deviceInfo.getDeviceIdentify()), ", connectState: ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
        Intent intent = new Intent("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intent.setExtrasClassLoader(com.huawei.health.devicemgr.business.entity.DeviceInfo.class.getClassLoader());
        intent.putExtra("connect_error_code", clz.c());
        intent.putExtra("isDeviceConnectDirectly", this.n);
        if (deviceInfo.getDeviceConnectState() != 1) {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "createDeviceStateIntent mIsDeviceConnectDirectly reset.");
            this.n = false;
        }
        Bundle bundle = new Bundle();
        deviceInfo.setRelationship(mkl.d().a(deviceInfo.getDeviceIdentify()));
        bundle.putParcelable("deviceinfo", deviceInfo);
        bundle.putInt("wear_device_list_size", this.o.e().size());
        intent.putExtras(bundle);
        return intent;
    }

    private void e(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo, List<com.huawei.health.devicemgr.business.entity.DeviceInfo> list) {
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "EMUI SendConnectBroadcastToEmui, btDeviceInfo.getDeviceConnectState, ", Integer.valueOf(deviceConnectState), " fuzzDeviceIdentify: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
        oqm.c().d(deviceInfo);
        j(deviceInfo);
        nfj.e(deviceInfo);
        nfj.a(deviceInfo);
        nfj.b(deviceInfo);
        nfi.b(this.g, deviceInfo);
        ned.b(deviceInfo);
        mwk.c(deviceInfo);
        if (deviceInfo.getDeviceConnectState() == 2) {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "Enter sendConnectStateBroadcast isScreenOn:", Boolean.valueOf(ScreenUtil.d()));
            this.o.e(list);
            if (deviceInfo.getDeviceIdentify().equalsIgnoreCase("AndroidWear")) {
                LogUtil.d("DEVMGR_HwUniteDeviceMgr", "EMUI SendConnectBroadcastToEmui, don't need send broadcast for AndroidWear");
            } else {
                if (!TextUtils.isEmpty(deviceInfo.getNodeId())) {
                    return;
                }
                try {
                    Intent intent = new Intent("com.huawei.iconnect.action.DEVICE_BOND_STATE_CHANGED");
                    intent.setComponent(new ComponentName("com.huawei.iconnect", "com.huawei.iconnect.MessageIntentService"));
                    if (mke.b()) {
                        intent.putExtra("DEVICE_ID", mke.e(deviceInfo.getDeviceIdentify()));
                    } else {
                        intent.putExtra("com.huawei.iconnect.extra.DEVICE_MAC_ADDRESS", deviceInfo.getDeviceIdentify());
                    }
                    intent.putExtra("android.bluetooth.device.extra.BOND_STATE", 12);
                    intent.putExtra("com.huawei.iconnect.extra.PACKAGE_NAME", "com.huawei.health");
                    this.g.startService(intent);
                } catch (SecurityException unused) {
                    LogUtil.e("DEVMGR_HwUniteDeviceMgr", "0xA0200008", ",securityException");
                }
                LogUtil.d("DEVMGR_HwUniteDeviceMgr", "EMUI SendConnectBroadcastToEmui, send BOND_BONDED broadcast, getDeviceIdentify:", this.i.e(deviceInfo.getDeviceIdentify()));
            }
        }
        e(deviceInfo);
    }

    private void e(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "cancelNpsNotify enter");
        if (deviceInfo.getDeviceConnectState() != 2) {
            return;
        }
        String strE = SharedPreferenceManager.e(this.g, String.valueOf(10004), HwNpsManager.KEY_NPS_SHOW);
        String strC = (Utils.o() || deviceInfo.getDeviceIdType() == 1) ? c(deviceInfo.getSecurityDeviceId()) : "";
        if (TextUtils.isEmpty(strE) || !c(strC, deviceInfo)) {
            NotificationManagerCompat.from(this.g).cancel(781507976);
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "cancelNotify");
        }
    }

    private boolean c(String str, com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        return str.equals(deviceInfo.getUdidFromDevice()) || str.equals(deviceInfo.getDeviceIdentify()) || str.equals(deviceInfo.getDeviceUdid()) || str.equals((Utils.o() || deviceInfo.getDeviceIdType() == 1) ? c(deviceInfo.getSecurityDeviceId()) : "");
    }

    private String c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "deviceId is null return!");
            return "";
        }
        HwEncryptUtil hwEncryptUtilB = HwEncryptUtil.b(BaseApplication.getContext());
        String strA = hwEncryptUtilB != null ? hwEncryptUtilB.a("09F98935DF23B3E011F5638614670662IrzLoccccR72B/H4EI3GKB6ny7lTZGH7IB4hQWa2qra9LliDA6e9/qgL/9yUjVL0") : "";
        if (!TextUtils.isEmpty(strA)) {
            try {
                byte[] bytes = strA.getBytes(StandardCharsets.UTF_8);
                byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "HMACSHA256");
                Mac mac = Mac.getInstance("HmacSHA256");
                mac.init(secretKeySpec);
                return URLEncoder.encode(Base64.encodeToString(mac.doFinal(bytes2), 2), "UTF-8");
            } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException unused) {
                LogUtil.e("DEVMGR_HwUniteDeviceMgr", "UnsupportedEncodingException");
            }
        }
        return "";
    }

    private void j(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "notifyRemoteCameraCapability enter");
        if (deviceInfo.getDeviceConnectState() != 2) {
            return;
        }
        ndk ndkVarB = ndk.b();
        boolean zD = ndkVarB.d(deviceInfo);
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "notifyRemoteCameraCapability isSupportControlCapability:", Boolean.valueOf(zD));
        if (zD) {
            ndkVarB.a(deviceInfo);
            return;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "DEVMGR_HwUniteDeviceMgr");
        if (mapQueryDeviceCapability.isEmpty()) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "notifyRemoteCameraCapability, deviceCapabilityHashMaps is empty");
            return;
        }
        DeviceCapability deviceCapability = mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
        if (deviceCapability == null || !deviceCapability.isSupportRemoteCamera()) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "device not support remoteCamera.");
            return;
        }
        if (CommonUtil.bp() || (CommonUtil.bd() && !Utils.o())) {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "isMoreThanEmui80");
            e(deviceInfo, 1, 42, new byte[]{1, 1, 0});
        } else {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "lower than Emui8.1");
        }
    }

    private void e(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo, int i, int i2, byte[] bArr) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(i);
        deviceCommand.setCommandID(i2);
        deviceCommand.setDataLen(bArr.length);
        deviceCommand.setDataContent(bArr);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        this.o.e(deviceCommand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo, int i, byte[] bArr) {
        if (KitWearBinderUtil.a(deviceInfo, bArr)) {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "isForThemeData");
            return;
        }
        DeviceStateCallback deviceStateCallback = this.k;
        if (deviceStateCallback != null) {
            deviceStateCallback.onDataReceived(deviceInfo, i, bArr);
        } else {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "mDeviceStateClientCallback is null.");
        }
        ndb.b().a(deviceInfo, bArr);
        ncz nczVar = this.r;
        if (nczVar != null) {
            nczVar.a(deviceInfo, bArr);
        }
    }

    private void e(String str) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "disconnectOldDevice fuzzyMac: ", CommonUtil.n(str));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.o.a(str)) {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "disconnectOldDevice isNewDeviceList");
            this.o.c(str);
        } else {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "disconnectOldDevice disconnectDevice");
            mkf.d().e(str);
        }
        for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "disconnectOldDevice")) {
            if (deviceInfo != null && str.equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                i(deviceInfo);
                return;
            }
        }
    }

    private void i(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceBluetoothType() != 2 || BTDeviceMgrUtil.c().a(deviceInfo.getDeviceIdentify())) {
            return;
        }
        LogUtil.j("DEVMGR_HwUniteDeviceMgr", "removeBTDeviceInstance Remove bond device fail.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("DEVMGR_HwUniteDeviceMgr", "dealWithConnectErrorCode: deviceIdentify is incorrect");
            return;
        }
        if (i == 50014) {
            b(str);
            return;
        }
        if (i == 50054) {
            LogUtil.e("DEVMGR_HwUniteDeviceMgr", "dealWithConnectErrorCode: missing hilink device id");
            p();
        } else if (i == 70034) {
            LogUtil.e("DEVMGR_HwUniteDeviceMgr", "dealWithConnectErrorCode: unbind failed");
            r();
        } else {
            LogUtil.e("DEVMGR_HwUniteDeviceMgr", "dealWithConnectErrorCode default");
        }
    }

    private void b(String str) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.pairing.HwBtDialogActivity"));
            intent.setFlags(268435456);
            intent.putExtra(TtmlNode.TAG_STYLE, 1);
            intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, 1);
            intent.putExtra("content", 7);
            intent.putExtra("hichain_late_intent_key", str);
            this.g.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("DEVMGR_HwUniteDeviceMgr", "secretKeyLost ActivityNotFoundException.");
        }
    }

    private static void a(mkn mknVar) {
        f41817a = mknVar;
    }

    private void y() {
        if (this.o.i().size() == 0) {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "getUsedDevicesFromStorage size is 0.");
            mko.e(false, true);
        } else {
            LogUtil.a("DEVMGR_HwUniteDeviceMgr", "getUsedDevicesFromStorage size is 1.");
            mko.e(true, true);
        }
    }

    private void p() {
        b bVar = this.f41818b;
        if (bVar != null) {
            bVar.sendEmptyMessage(55);
        }
    }

    private void r() {
        b bVar = this.f41818b;
        if (bVar != null) {
            bVar.sendEmptyMessage(56);
        }
    }

    private void s() {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "Enter migrateDmsDeviceList().");
        Map<String, String> mapE = SharedPreferenceManager.e(this.g, String.valueOf(1000));
        if (mapE == null || mapE.size() == 0) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "map is empty.");
            return;
        }
        Set<String> setA = SharedPreferenceManager.a(this.g, String.valueOf(1000));
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "migrateDmsDeviceList size is ", Integer.valueOf(setA.size()));
        Iterator<Map.Entry<String, String>> it = mapE.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo = (com.huawei.health.devicemgr.business.entity.DeviceInfo) new Gson().fromJson(it.next().getValue(), com.huawei.health.devicemgr.business.entity.DeviceInfo.class);
            if (deviceInfo != null && mjx.d(deviceInfo.getProductType())) {
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "migrateDmsDeviceList deviceName is ", deviceInfo.getDeviceName());
                d(deviceInfo.getDeviceIdentify(), deviceInfo);
            } else if (deviceInfo != null) {
                LogUtil.a("DEVMGR_HwUniteDeviceMgr", "migrateDmsDeviceList isRemaining deviceName is ", deviceInfo.getDeviceName());
                setA.remove(deviceInfo.getDeviceIdentify());
                z = true;
            }
        }
        b(setA, z);
    }

    private void d(String str, com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "updateUdsDevice enter.");
        if (str == null) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "identify is null.");
            return;
        }
        DeviceInfo deviceInfo2 = new DeviceInfo();
        deviceInfo2.setDeviceMac(str);
        deviceInfo2.setDeviceName(deviceInfo.getDeviceName());
        deviceInfo2.setDeviceBtType(deviceInfo.getDeviceBluetoothType());
        deviceInfo2.setDeviceType(deviceInfo.getProductType());
        deviceInfo2.setDeviceConnectState(deviceInfo.getDeviceConnectState());
        deviceInfo2.setLastConnectedTime(deviceInfo.getLastConnectedTime());
        deviceInfo2.setUsing(deviceInfo.getDeviceActiveState() == 1);
        clw.c(str, deviceInfo2);
        cmo cmoVar = new cmo();
        cmoVar.d(str);
        cmoVar.d(ConnectMode.GENERAL);
        cmoVar.e(false);
        clw.c(str, cmoVar);
    }

    private void b(Set<String> set, boolean z) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "deleteDmsDeviceList deleteDmsDeviceList size ", Integer.valueOf(set.size()), "isRemaining is ", Boolean.valueOf(z));
        if (set.size() == 0) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "Dms device is not delete.");
            return;
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            SharedPreferenceManager.b(this.g, String.valueOf(1000), it.next());
        }
        if (!z) {
            mko.e(false, false);
        }
        mko.e(true, true);
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public Map<String, DeviceCapability> queryDeviceCapability(int i, String str, String str2) {
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "enter queryDeviceCapability queryType：", Integer.valueOf(i), "; queryContent:", CommonUtil.n(str), "; tag: ", str2);
        Map<String, DeviceCapability> map = new HashMap<>(4);
        if (i == 1) {
            d(str, map);
        } else if (i == 2) {
            map = j();
        } else if (i == 3) {
            map = h();
        } else if (i == 4) {
            a(map);
        } else if (i != 5) {
            LogUtil.j("DEVMGR_HwUniteDeviceMgr", "queryDeviceCapability queryType others");
        } else {
            map = k();
        }
        LogUtil.a("DEVMGR_HwUniteDeviceMgr", "queryDeviceCapability queryType：", Integer.valueOf(i), ";size:", Integer.valueOf(map.size()));
        return map;
    }

    private void d(String str, Map<String, DeviceCapability> map) {
        Map<String, DeviceCapability> mapH = h();
        for (Map.Entry<String, DeviceCapability> entry : mapH.entrySet()) {
            String key = entry.getKey();
            if (mapH.containsKey(key) && TextUtils.equals(key, str)) {
                map.put(key, entry.getValue());
                return;
            }
        }
    }

    private void a(Map<String, DeviceCapability> map) {
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listE = this.o.e();
        if (listE.size() != 0) {
            for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : listE) {
                if (deviceInfo.getDeviceActiveState() == 1 && deviceInfo.getRelationship().equals("main_relationship") && !eel.d(deviceInfo.getProductType())) {
                    LogUtil.d("DEVMGR_HwUniteDeviceMgr", "queryDeviceCapability device name ", deviceInfo.getDeviceName());
                    map.put(deviceInfo.getDeviceIdentify(), cox.e(this.o.b(deviceInfo.getDeviceIdentify())));
                }
            }
        }
        for (Map.Entry<String, DeviceCapability> entry : mkf.d().c().entrySet()) {
            String key = entry.getKey();
            if (!map.containsKey(key)) {
                map.put(key, entry.getValue());
            }
        }
    }

    private Map<String, DeviceCapability> h() {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.d().queryDeviceCapability(3, "", "DEVMGR_HwUniteDeviceMgr");
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listE = this.o.e();
        Map<String, UniteDevice> mapC = this.o.c();
        if (listE.size() != 0) {
            for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : listE) {
                DeviceCapability deviceCapabilityA = this.o.a(deviceInfo, mapC);
                if (deviceCapabilityA != null) {
                    mapQueryDeviceCapability.put(deviceInfo.getDeviceIdentify(), deviceCapabilityA);
                }
            }
        }
        Map<String, DeviceCapability> mapD = cox.d();
        if (mapD != null && mapD.size() != 0) {
            for (Map.Entry<String, DeviceCapability> entry : mapD.entrySet()) {
                if (!mapQueryDeviceCapability.containsKey(entry.getKey())) {
                    mapQueryDeviceCapability.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return mapQueryDeviceCapability;
    }

    private Map<String, DeviceCapability> j() {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.d().queryDeviceCapability(2, "", "DEVMGR_HwUniteDeviceMgr");
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listE = this.o.e();
        Map<String, UniteDevice> mapC = this.o.c();
        if (listE.size() != 0) {
            for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : listE) {
                DeviceCapability deviceCapabilityA = this.o.a(deviceInfo, mapC);
                if (deviceInfo.getDeviceConnectState() == 2 && deviceCapabilityA != null) {
                    mapQueryDeviceCapability.put(deviceInfo.getDeviceIdentify(), deviceCapabilityA);
                }
            }
        }
        return mapQueryDeviceCapability;
    }

    private Map<String, DeviceCapability> k() {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.d().queryDeviceCapability(2, "", "DEVMGR_HwUniteDeviceMgr");
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listE = this.o.e();
        Map<String, UniteDevice> mapC = this.o.c();
        if (listE.size() != 0) {
            for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : listE) {
                DeviceCapability deviceCapabilityA = this.o.a(deviceInfo, mapC);
                if (deviceInfo.getDeviceConnectState() == 2 && deviceInfo.getRelationship().equals("main_relationship") && deviceCapabilityA != null) {
                    mapQueryDeviceCapability.put(deviceInfo.getDeviceIdentify(), deviceCapabilityA);
                }
            }
        }
        return mapQueryDeviceCapability;
    }

    public boolean c() {
        return this.n;
    }

    public DeviceStateCallback b() {
        return this.k;
    }
}
