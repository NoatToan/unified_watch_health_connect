package defpackage;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.datatype.DeviceCommand;
import com.huawei.datatype.GpsParameter;
import com.huawei.datatype.GpsStruct;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwlocationmgr.model.ILoactionCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.AiCoreSdkConstant;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.R;
import com.huawei.watchface.api.HwWatchFaceApi;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EmuiBuild;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class mvx implements ParserInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mvx f42538a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f42540c;
    private Context h;
    private String j;
    private long k;
    private GpsParameter m;
    private Intent s;
    private Location w;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42539b = new Object();
    private static final Object d = new Object();
    private boolean t = false;
    private long q = 0;
    private List<GpsStruct> l = new ArrayList(10);
    private boolean p = false;
    private List<Long> y = new ArrayList(16);
    private List<Long> v = new ArrayList(16);
    private boolean i = false;
    private BroadcastReceiver g = new BroadcastReceiver() { // from class: mvx.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DeviceInfo deviceInfo;
            if (context == null || intent == null || !"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || (deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo")) == null) {
                return;
            }
            String securityDeviceId = deviceInfo.getSecurityDeviceId();
            ReleaseLogUtil.d("Track_HwGpsLocationManager", "mConnectStateChangedReceiver() status ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            if (deviceConnectState != 2) {
                if (deviceConnectState == 3) {
                    if (mvx.this.r != null) {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 3;
                        messageObtain.arg1 = 0;
                        mvx.this.r.sendMessage(messageObtain);
                        mvx.this.r.sendEmptyMessageDelayed(1, 300000L);
                        return;
                    }
                    return;
                }
                LogUtil.j("HwGpsLocationManager", "mConnectStateChangedReceiver onReceive default");
                return;
            }
            if (mvx.this.r != null) {
                mvx.this.r.removeMessages(1);
            }
            if (!mvw.c(deviceInfo)) {
                mvx.this.j = securityDeviceId;
                return;
            }
            if (mvx.this.j == null) {
                if (mvx.this.r != null) {
                    mvx.this.r.sendEmptyMessage(1);
                }
            } else if ((securityDeviceId == null || !mvx.this.j.equalsIgnoreCase(securityDeviceId)) && mvx.this.r != null) {
                mvx.this.r.sendEmptyMessage(1);
            }
            mvx.this.c(deviceInfo);
            mvx.this.j = deviceInfo.getSecurityDeviceId();
        }
    };
    private BroadcastReceiver o = new BroadcastReceiver() { // from class: mvx.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("HwGpsLocationManager", "mForegroundStatusChangeReceiver: intent is null");
                return;
            }
            if (HwWatchFaceApi.ACTION_FOREGROUND_STATUS.equals(intent.getAction())) {
                boolean unused = mvx.f42540c = intent.getBooleanExtra("isForeground", false);
                LogUtil.a("HwGpsLocationManager", "mForegroundStatusChangeReceiver() sIsForeground: ", Boolean.valueOf(mvx.f42540c));
                if (mvx.f42540c && mvx.this.t) {
                    mvx mvxVar = mvx.this;
                    mvxVar.c(mwb.b(mvxVar.h));
                }
            }
        }
    };
    private IBaseResponseCallback n = new IBaseResponseCallback() { // from class: mvx.2
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (obj instanceof GpsParameter) {
                mvx.this.m = (GpsParameter) obj;
                ReleaseLogUtil.d("Track_HwGpsLocationManager", "bitmap ", Integer.valueOf(mvx.this.m.getGpsInfoBitmap()), " fomat ", Integer.valueOf(mvx.this.m.getGpsParaFormat()), ",threshold=", Integer.valueOf(mvx.this.m.getGpsThreshold()));
            }
        }
    };
    private IBaseResponseCallback ad = new IBaseResponseCallback() { // from class: mvx.4
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            mvx mvxVar = mvx.this;
            mvxVar.b(mvxVar.n);
        }
    };
    private IBaseResponseCallback f = new IBaseResponseCallback() { // from class: mvx.1
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (obj instanceof Boolean) {
                mvx.this.t = ((Boolean) obj).booleanValue();
                if (mvx.this.t) {
                    mvx.this.m();
                    return;
                }
                ReleaseLogUtil.d("Track_HwGpsLocationManager", "device disable gps");
                mvx.this.c(100000);
                nfl.e(false);
                npg.d().c("wearSportTrackLocation");
                mvx.this.k();
            }
        }
    };
    private ILoactionCallback x = new ILoactionCallback() { // from class: mvx.10
        @Override // com.huawei.hwlocationmgr.model.ILoactionCallback
        public void dispatchLocationChanged(Location location) {
            b(mvx.this.y, "mLocationChanged");
            synchronized (mvx.e) {
                if (!mvx.this.t) {
                    npg.d().c("wearSportTrackLocation");
                    mvx.this.k();
                    return;
                }
                if (location == null || location.getProvider().equals(GeocodeSearch.GPS)) {
                    if (mvx.this.m == null) {
                        return;
                    }
                    GpsStruct gpsStruct = new GpsStruct();
                    String string = new StringBuffer(Integer.toBinaryString(mvx.this.m.getGpsInfoBitmap())).reverse().toString();
                    float fB = nps.b(mvx.this.w, location);
                    if (location != null && fB >= 0.0f && mvx.this.t) {
                        mvx.this.q += (long) ((int) (10.0f * fB));
                        c(location, gpsStruct, string, fB);
                        ReleaseLogUtil.d("HwGpsLocationManager", "isLocationResultReport :", Boolean.valueOf(mvx.this.i));
                        if (mvx.this.i) {
                            mvx.b("isGpsLocationResult", "true");
                            mvx.this.i = false;
                        }
                    }
                    mvx.this.w = location;
                    return;
                }
                b(mvx.this.v, "mLocationError");
            }
        }

        private void b(List<Long> list, String str) {
            synchronized (mvx.f42539b) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                list.add(Long.valueOf(jCurrentTimeMillis));
                if (list.get(list.size() - 1) != null && list.get(list.size() - 1).longValue() - list.get(0).longValue() >= 60000) {
                    ReleaseLogUtil.d("Track_HwGpsLocationManager", "gpsStatisticsPrint ", str, Integer.valueOf(list.size()));
                    list.clear();
                    list.add(Long.valueOf(jCurrentTimeMillis));
                }
            }
        }

        private void c(Location location, GpsStruct gpsStruct, String str, float f) {
            if (str != null) {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '1') {
                        mwb.e(i, mvx.this.q, location, f, gpsStruct);
                    }
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Location location2 = mvx.this.w;
                gpsStruct.setGpsStartTime((jCurrentTimeMillis - ((location == null || location2 == null) ? 0L : location.getTime() - location2.getTime())) / 1000);
                gpsStruct.setGpsEndTime(jCurrentTimeMillis / 1000);
                mvx.this.l.add(gpsStruct);
                if (mvx.this.m.getGpsParaFormat() == 1 || (mvx.this.m.getGpsParaFormat() == 2 && mvx.this.l.size() == mvx.this.m.getGpsParaElementNum())) {
                    mvx mvxVar = mvx.this;
                    mvxVar.e(mvxVar.l, mvx.this.u, location.hasSpeed());
                    mvx.this.l.clear();
                }
            }
        }
    };
    private IBaseResponseCallback u = new IBaseResponseCallback() { // from class: mvx.9
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i != 100000) {
                ReleaseLogUtil.d("Track_HwGpsLocationManager", "mSetGpsParameterCallback errorCode:", Integer.valueOf(i));
                nfl.e(false);
                npg.d().c("wearSportTrackLocation");
                mvx.this.k();
            }
        }
    };
    private mwd r = new mwd(this);

    private mvx(Context context) {
        this.j = "";
        this.h = context;
        if (n()) {
            l();
            nfl.e(false);
        }
        BroadcastManagerUtil.c(this.h, this.g, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
        BroadcastManager.d(this.o);
        DeviceInfo deviceInfoF = f();
        if (deviceInfoF != null) {
            this.j = deviceInfoF.getSecurityDeviceId();
        }
        c(this.f);
        if (deviceInfoF != null && mvw.c(deviceInfoF) && deviceInfoF.getDeviceConnectState() == 2) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            messageObtain.obj = deviceInfoF;
            this.r.sendMessageDelayed(messageObtain, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.q = 0L;
        GpsParameter gpsParameter = this.m;
        if (gpsParameter == null) {
            return;
        }
        if (gpsParameter.getGpsInfoBitmap() > 15 && !eey.d(f(), 332)) {
            ReleaseLogUtil.d("Track_HwGpsLocationManager", "bitmap not support lat,is emui5.0:", Boolean.valueOf(CommonUtil.au()));
            if (!CommonUtil.au() && !CommonUtil.bd()) {
                c(124004);
                return;
            }
        }
        if (mwb.b(this.h)) {
            ReleaseLogUtil.d("Track_HwGpsLocationManager", "device enable set gps");
            b("isGpsLocationEnable", "true");
            this.i = true;
            c(100000);
            if (EmuiBuild.e == 21 || ((CommonUtil.bf() && CommonUtil.bn()) || EnvironmentInfo.l())) {
                Intent intent = new Intent();
                this.s = intent;
                intent.setClassName(this.h, "com.huawei.healthcloud.plugintrack.service.GpsKeepForegroundService");
                this.s.putExtra("isStop", false);
                this.s.putExtra("stringKey", o());
                this.s.putExtra("id", "HwGpsLocationManager");
                e(this.s, false);
                this.p = true;
            }
            npg.d().a(this.x, "wearSportTrackLocation");
            a();
            this.w = null;
            nfl.e(true);
            c(true);
            return;
        }
        ReleaseLogUtil.e("Track_HwGpsLocationManager", "gps not open");
        b("isGpsLocationEnable", "false");
        this.i = false;
        c(124003);
        c(false);
    }

    private int o() {
        int iB = mwb.b();
        if (iB == 1) {
            return R.string.IDS_gps_band_location_loading;
        }
        if (iB == 2) {
            return R.string.IDS_gps_watches_location_loading;
        }
        return R.string.IDS_gps_location_loading;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        g();
        ReleaseLogUtil.d("Track_HwGpsLocationManager", "stopService LocationChanged :", Integer.valueOf(this.y.size()), ", LocationError:", Integer.valueOf(this.v.size()));
        synchronized (f42539b) {
            this.y.clear();
            this.v.clear();
        }
        if (this.p) {
            this.p = false;
            this.s.putExtra("isStop", true);
            e(this.s, true);
        }
    }

    private void l() {
        if (this.h == null) {
            LogUtil.j("HwGpsLocationManager", "killProcessStopService failed. context is null");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(this.h, "com.huawei.healthcloud.plugintrack.service.GpsKeepForegroundService");
        intent.putExtra("isStop", true);
        intent.putExtra("stringKey", o());
        intent.putExtra("id", "HwGpsLocationManager");
        e(intent, true);
    }

    private void e(Intent intent, boolean z) {
        Context context = this.h;
        if (context == null || intent == null) {
            LogUtil.j("HwGpsLocationManager", "startServiceForeground failed. context is null or intent is null");
            return;
        }
        try {
            if (z) {
                context.stopService(intent);
            } else {
                context.startService(intent);
            }
        } catch (Exception e2) {
            ReleaseLogUtil.a("Track_HwGpsLocationManager", "startForeground Exception ", ExceptionUtils.c(e2));
        }
    }

    private boolean n() {
        List<ActivityManager.RunningServiceInfo> runningServices;
        Object systemService = BaseApplication.getContext().getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null && (runningServices = activityManager.getRunningServices(30)) != null) {
            Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
            while (it.hasNext()) {
                if ("com.huawei.healthcloud.plugintrack.service.GpsKeepForegroundService".equals(it.next().service.getClassName())) {
                    LogUtil.a("HwGpsLocationManager", "service is running!!!");
                    return true;
                }
            }
        }
        return false;
    }

    public static mvx e() {
        mvx mvxVar;
        synchronized (d) {
            if (f42538a == null) {
                f42538a = new mvx(BaseApplication.getContext());
            }
            mvxVar = f42538a;
        }
        return mvxVar;
    }

    public void h() {
        this.h.unregisterReceiver(this.g);
        BroadcastManager.n(this.o);
        mwd mwdVar = this.r;
        if (mwdVar != null) {
            mwdVar.removeCallbacksAndMessages(null);
        }
        i();
    }

    private static void i() {
        synchronized (d) {
            f42538a = null;
        }
    }

    private DeviceInfo f() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "HwGpsLocationManager");
        if (deviceList.size() != 0) {
            LogUtil.a("HwGpsLocationManager", "getCurrentDeviceInfo() deviceList.size() ", Integer.valueOf(deviceList.size()));
            for (DeviceInfo deviceInfo : deviceList) {
                if (deviceInfo.getDeviceActiveState() == 1) {
                    return deviceInfo;
                }
            }
            LogUtil.j("HwGpsLocationManager", "getCurrentDeviceInfo() device's ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE");
            return null;
        }
        LogUtil.j("HwGpsLocationManager", "getCurrentDeviceInfo() deviceInfoList is null");
        return null;
    }

    private void e(DeviceCommand deviceCommand) {
        cpl.d("HwGpsLocationManager", deviceCommand.getDataContent(), "sendCommand deviceCommand ");
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public void b(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (mvw.d()) {
            LogUtil.a("HwGpsLocationManager", "getGpsParameter");
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(24);
            deviceCommand.setCommandID(1);
            String strB = eeq.b(0);
            String strD = eeq.d(129);
            StringBuilder sb = new StringBuilder(16);
            sb.append(strD);
            sb.append(strB);
            deviceCommand.setDataLen(sb.length() / 2);
            deviceCommand.setDataContent(eeq.c(sb.toString()));
            e(deviceCommand);
            mvw.d().add(iBaseResponseCallback);
        }
    }

    public void c(int i) {
        synchronized (mvw.d()) {
            LogUtil.a("HwGpsLocationManager", "setGpsStatus");
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(24);
            deviceCommand.setCommandID(2);
            String strC = eeq.c(i);
            String strD = eeq.d(strC.length() / 2);
            String strD2 = eeq.d(127);
            StringBuilder sb = new StringBuilder(16);
            sb.append(strD2);
            sb.append(strD);
            sb.append(strC);
            deviceCommand.setDataLen(sb.length() / 2);
            deviceCommand.setDataContent(eeq.c(sb.toString()));
            e(deviceCommand);
        }
    }

    public void e(List<GpsStruct> list, IBaseResponseCallback iBaseResponseCallback, boolean z) {
        LogUtil.a("HwGpsLocationManager", "gpsStructs.size() ", Integer.valueOf(list.size()));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(24);
        deviceCommand.setCommandID(3);
        byte[] bArrC = mvw.c(list, z);
        byte[] bArrA = eeq.a(bArrC.length);
        byte[] bArrJ = eeq.j(129);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrJ.length + bArrA.length + bArrC.length);
        byteBufferAllocate.put(bArrJ).put(bArrA).put(bArrC);
        deviceCommand.setDataLen(byteBufferAllocate.capacity());
        deviceCommand.setDataContent(byteBufferAllocate.array());
        e(deviceCommand);
        mvw.a().add(iBaseResponseCallback);
    }

    public void c(boolean z, IBaseResponseCallback iBaseResponseCallback) {
        String strD;
        String strD2;
        String strD3;
        synchronized (mvw.c()) {
            LogUtil.a("HwGpsLocationManager", "setGpsSupportParameter isEmui: ", Boolean.valueOf(z));
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(24);
            deviceCommand.setCommandID(4);
            if (z) {
                strD = eeq.d(1);
                strD2 = eeq.d(255);
                strD3 = eeq.d(1);
            } else {
                strD = eeq.d(0);
                strD2 = eeq.d(15);
                strD3 = eeq.d(1);
            }
            String strD4 = eeq.d(1);
            String strD5 = eeq.d(1);
            String strD6 = eeq.d(2);
            StringBuilder sb = new StringBuilder(16);
            sb.append(strD4);
            sb.append(strD3);
            sb.append(strD2);
            sb.append(strD6);
            sb.append(strD5);
            sb.append(strD);
            deviceCommand.setDataLen(sb.length() / 2);
            deviceCommand.setDataContent(eeq.c(sb.toString()));
            e(deviceCommand);
            mvw.c().add(iBaseResponseCallback);
        }
    }

    private void c(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (mvw.b()) {
            mvw.b().add(iBaseResponseCallback);
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        cpl.d("HwGpsLocationManager", bArr, "getResult(): ");
        if (deviceInfo == null) {
            LogUtil.a("HwGpsLocationManager", "getResult dev is null ");
        } else {
            mwb.e(bArr, deviceInfo);
        }
    }

    public final void c(DeviceInfo deviceInfo) {
        Map<String, DeviceCapability> mapQueryDeviceCapability;
        DeviceCapability deviceCapability = (deviceInfo == null || (mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "HwGpsLocationManager")) == null || mapQueryDeviceCapability.isEmpty()) ? null : mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
        boolean zIsSupportGpsSetParameter = deviceCapability != null ? deviceCapability.isSupportGpsSetParameter() : false;
        LogUtil.a("HwGpsLocationManager", "isSupportGPSSetParamet:", Boolean.valueOf(zIsSupportGpsSetParameter), ",is EMUI5.0:", Boolean.valueOf(CommonUtil.au()));
        if (zIsSupportGpsSetParameter) {
            boolean zD = eey.d(deviceInfo, 332);
            if (!CommonUtil.au() && !CommonUtil.bd() && zD) {
                b("isThirdPhone", "true");
            } else {
                b("isThirdPhone", "false");
            }
            if (CommonUtil.au() || CommonUtil.bd() || zD) {
                c(true, this.ad);
                return;
            } else {
                c(false, this.ad);
                return;
            }
        }
        b(this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("HwGpsLocationManager", "reportConnectGpsInfo: type or reportValue is empty.");
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
        linkedHashMap.put(str, str2);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_CONNECT_GPS_ABILITY_2129058.value(), linkedHashMap);
    }

    public void j() {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwGpsLocationManager");
        if (deviceList.size() > 0) {
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (!eel.d(deviceInfo2.getProductType())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
        }
        if (this.t) {
            if (deviceInfo == null || !this.j.equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                ReleaseLogUtil.e("Track_HwGpsLocationManager", "unregisterLocationCallback");
                nfl.e(false);
                npg.d().c("wearSportTrackLocation");
                this.t = false;
                k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    public void c(boolean z) {
        boolean z2;
        ReleaseLogUtil.d("Track_HwGpsLocationManager", "is open:", Boolean.valueOf(z));
        if (z) {
            try {
                if (BaseApplication.getContext().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 && BaseApplication.getContext().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (NoSuchMethodError e2) {
                LogUtil.e("HwGpsLocationManager", "checkPermission:", e2.getMessage());
                xjt.h("checkPermission:" + e2.getMessage());
            }
        } else {
            z2 = true;
        }
        if (z && z2) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ReleaseLogUtil.d("Track_HwGpsLocationManager", "currentTime is:", Long.valueOf(jCurrentTimeMillis), ";showTime is:", Long.valueOf(this.k), " ;sIsForeground: ", Boolean.valueOf(f42540c));
        if (f42540c && jCurrentTimeMillis - this.k > AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL) {
            LogUtil.a("HwGpsLocationManager", "is over 2hours");
            this.k = jCurrentTimeMillis;
            Intent intent = new Intent("com.huawei.bone.action.open_gps");
            intent.setPackage(BaseApplication.getAppPackage());
            BaseApplication.getContext().sendOrderedBroadcast(intent, LocalBroadcast.f36595c);
        }
    }

    public void a(int i) {
        if (this.r != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            messageObtain.arg1 = i;
            this.r.sendMessage(messageObtain);
        }
    }

    public void a() {
        if (EnvironmentInfo.l()) {
            LogUtil.a("HwGpsLocationManager", "PowerKitManager applyPowerKit connectGps request");
            PowerKitManager.a().d("HwGpsLocationManager", 65535, 600000L, "user-ConnectGps");
            this.r.removeMessages(4);
            this.r.sendEmptyMessageDelayed(4, 480000L);
            LogUtil.a("HwGpsLocationManager", "PowerKitManager applyPowerKit connectGps request end");
        }
    }

    public void g() {
        if (EnvironmentInfo.l()) {
            LogUtil.a("HwGpsLocationManager", "PowerKitManager unApplyPowerKit connectGps request");
            PowerKitManager.a().a("HwGpsLocationManager", 65535, "user-ConnectGps");
            this.r.removeMessages(4);
            LogUtil.a("HwGpsLocationManager", "PowerKitManager unApplyPowerKit connectGps request end");
        }
    }
}
