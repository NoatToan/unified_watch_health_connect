package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.BadParcelableException;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwlocationmgr.model.ILoactionCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.AiCoreSdkConstant;
import com.huawei.openalliance.ad.constant.ParamConstants;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class nei implements ParserInterface {
    private static nei d;
    private PendingIntent ad;
    private ThreadPoolManager ah;
    private ExtendHandler ai;
    private int f;
    private byte g;
    private AlarmManager i;
    private String j;
    private Context l;
    private DeviceInfo n;
    private long v;
    private List<String> z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42983c = new Object();
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<Integer> f42984a = new HashSet();
    private int ag = 0;
    private Location r = null;
    private int ab = 0;
    private boolean x = true;
    private lqq m = null;
    private boolean y = false;
    private c s = new c();
    private byte[] ae = new byte[6];
    private String w = "";
    private boolean u = false;
    private boolean q = false;
    private long ac = 0;
    private String o = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f42985b = new BroadcastReceiver() { // from class: nei.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("HwWeatherManager", "mAlarmClockReceiver receiver");
            nei.this.s();
        }
    };
    private BroadcastReceiver k = new BroadcastReceiver() { // from class: nei.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("HwWeatherManager", "mFirstConnectReceiver intent is null");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("HwWeatherManager", "mFirstConnectReceiver action:", action);
            if ("com.huawei.bone.action.REQUEST_BIND_DEVICE".equals(action) && TextUtils.isEmpty(intent.getStringExtra("connect_status"))) {
                nei.this.q = true;
                return;
            }
            if ("weather_location_change".equals(action)) {
                lqj.e(intent.getStringExtra("location"));
            } else if (!"weather_http_change".equalsIgnoreCase(action)) {
                LogUtil.d("HwWeatherManager", "mFirstConnectReceiver else");
            } else {
                lqj.e(intent.getIntExtra("code", 0));
            }
        }
    };
    private BroadcastReceiver h = new BroadcastReceiver() { // from class: nei.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("HwWeatherManager", "mConnectStateChangedReceiver intent is null");
                return;
            }
            LogUtil.a("HwWeatherManager", "mConnectStateChangedReceiver context: ", context, " intent:", intent.getAction());
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                if (deviceInfo == null) {
                    LogUtil.j("HwWeatherManager", "mConnectStateChangedReceiver deviceInfo is null");
                    return;
                }
                LogUtil.a("HwWeatherManager", "mConnectStateChangedReceiver DeviceConnectState: ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                if (deviceInfo.getDeviceConnectState() != 2) {
                    return;
                }
                DeviceCapability deviceCapabilityB = neg.b(deviceInfo);
                if (deviceCapabilityB == null || !deviceCapabilityB.isWeatherPush()) {
                    LogUtil.j("HwWeatherManager", "mConnectStateChangedReceiver DeviceCapability is null!");
                    return;
                }
                DeviceInfo deviceInfo2 = null;
                for (DeviceInfo deviceInfo3 : ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwWeatherManager")) {
                    if (!eel.d(deviceInfo3.getProductType())) {
                        deviceInfo2 = deviceInfo3;
                        break;
                    }
                }
                if (deviceInfo2 == null) {
                    nei.this.f = -1;
                } else {
                    nei.this.f = deviceInfo2.getDeviceBluetoothType();
                }
                if (!TextUtils.isEmpty(nei.this.o) && nei.this.o.equals(deviceInfo.getSecurityDeviceId()) && nei.this.f != 1) {
                    nei.this.n = deviceInfo;
                    LogUtil.a("HwWeatherManager", "mConnectStateChangedReceiver the same device");
                } else {
                    LogUtil.a("HwWeatherManager", "mConnectStateChangedReceiver not the same device or BR type");
                    nei.this.o = deviceInfo.getSecurityDeviceId();
                    nei.this.n = deviceInfo2;
                    nei.this.ac = 0L;
                    nei.this.u = true;
                }
                nei.this.e();
            }
        }
    };
    private BroadcastReceiver aa = new BroadcastReceiver() { // from class: nei.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("HwWeatherManager", "mNetworkChangedReceiver intent is null");
                return;
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                LogUtil.j("HwWeatherManager", "mNetworkChangedReceiver not CONNECTIVITY_ACTION");
                return;
            }
            int iC = neg.c(context);
            if (iC == -1) {
                LogUtil.a("HwWeatherManager", "mNetworkChangedReceiver net disconnect");
                return;
            }
            if (iC == 0 || iC == 1) {
                LogUtil.a("HwWeatherManager", "mNetworkChangedReceiver network connected: ", Integer.valueOf(iC));
                if (SystemClock.elapsedRealtime() - nei.this.v < 60000) {
                    LogUtil.a("HwWeatherManager", "mNetworkChangedReceiver network connected within 1 minute");
                    return;
                }
                DeviceCapability deviceCapabilityB = neg.b();
                if (deviceCapabilityB == null || !deviceCapabilityB.isWeatherPush()) {
                    return;
                }
                LogUtil.a("HwWeatherManager", "mNetworkChangedReceiver support weather push");
                nei.this.v = SystemClock.elapsedRealtime();
                nei.this.e();
                return;
            }
            LogUtil.j("HwWeatherManager", "mNetworkChangedReceiver unknown type");
        }
    };
    private ILoactionCallback t = new ILoactionCallback() { // from class: nei.6
        @Override // com.huawei.hwlocationmgr.model.ILoactionCallback
        public void dispatchLocationChanged(Location location) {
            synchronized (nei.f42983c) {
                mik.a("HwWeatherManager", "ILocationResultCallback get gps location:", Boolean.valueOf(location != null), " locationTasks:", nei.this.f42984a.toString());
            }
            ExtendHandler extendHandler = nei.this.ai;
            if (extendHandler != null) {
                extendHandler.removeMessages(200);
            }
            nei.this.u();
            if (location != null) {
                nei.this.r = location;
                String strB = neg.b(location);
                neg.e(location);
                synchronized (nei.f42983c) {
                    if (!nei.this.f42984a.isEmpty()) {
                        Iterator it = nei.this.f42984a.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            if (iIntValue == 1) {
                                nei.this.b(location);
                            } else if (iIntValue == 2) {
                                nei.this.n();
                            } else if (iIntValue == 3) {
                                nee.b(true, strB);
                            } else {
                                LogUtil.j("HwWeatherManager", "ILocationResultCallback get default");
                            }
                        }
                    }
                }
            } else {
                nei.this.p();
            }
            synchronized (nei.f42983c) {
                nei.this.f42984a.clear();
            }
        }
    };
    private mhs p = mhs.a();
    private npg af = npg.d();

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        synchronized (f42983c) {
            if (!this.f42984a.isEmpty()) {
                Iterator<Integer> it = this.f42984a.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    if (iIntValue == 1) {
                        r();
                    } else if (iIntValue == 2) {
                        nee.c(1, -1);
                    } else if (iIntValue == 3) {
                        nee.d(24, 6, 100001);
                    } else {
                        LogUtil.j("HwWeatherManager", "sendErrorCode default");
                    }
                }
            }
        }
        neg.e(1);
    }

    private nei(Context context) {
        this.l = context;
        if (this.p == null) {
            LogUtil.e("HwWeatherManager", "mHwSwitchSettingManager is null");
        }
        this.ai = HandlerCenter.b(this.s, "HwWeatherManager");
        o();
        LogUtil.a("HwWeatherManager", "HwWeatherManager init");
    }

    public static nei c() {
        nei neiVar;
        synchronized (e) {
            if (d == null) {
                d = new nei(BaseApplication.getContext());
            }
            neiVar = d;
        }
        return neiVar;
    }

    private void o() {
        BroadcastManagerUtil.c(this.l, this.h, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
        this.l.registerReceiver(this.aa, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), LocalBroadcast.f36595c, null);
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.REQUEST_BIND_DEVICE");
        if (lqj.b()) {
            intentFilter.addAction("weather_location_change");
            intentFilter.addAction("weather_http_change");
        }
        BroadcastManagerUtil.d(this.l, this.k, intentFilter, LocalBroadcast.f36595c, null);
        ArrayList arrayList = new ArrayList(0);
        this.z = arrayList;
        arrayList.add("network");
        this.z.add(GeocodeSearch.GPS);
        if (EnvironmentInfo.l()) {
            Object systemService = this.l.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (systemService instanceof AlarmManager) {
                this.i = (AlarmManager) systemService;
            } else {
                LogUtil.a("HwWeatherManager", "alarmManager is null");
            }
            BroadcastManagerUtil.c(this.l, this.f42985b, new IntentFilter("action_broadcast_alarm_clock"), LocalBroadcast.f36595c, null);
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        c(bArr, deviceInfo);
        d(bArr);
    }

    public void c(byte[] bArr, DeviceInfo deviceInfo) {
        if (bArr == null || bArr.length < 5) {
            LogUtil.j("HwWeatherManager", "handleDataFromDevice, length < 5, return");
            return;
        }
        if (bArr[0] != 15) {
            return;
        }
        String strE = eeq.e(bArr);
        LogUtil.a("HwWeatherManager", "handleDataFromDevice", strE);
        switch (bArr[1]) {
            case 1:
                if (!TextUtils.isEmpty(strE) && strE.length() >= 16 && "000186A0".equals(strE.substring(8, 16))) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.ac = jCurrentTimeMillis;
                    this.q = false;
                    LogUtil.a("HwWeatherManager", "success send data,mLastSendTime is :", Long.valueOf(jCurrentTimeMillis));
                    break;
                }
                break;
            case 2:
                b(bArr[4], deviceInfo);
                break;
            case 3:
                b(bArr);
                break;
            case 4:
                c(bArr);
                break;
            case 5:
                LogUtil.a("HwWeatherManager", "COMMAND_ID_UNIT_WEATHER!");
                l();
                break;
            case 6:
                a(bArr, deviceInfo);
                break;
            case 8:
                if (!TextUtils.isEmpty(strE) && strE.length() >= 16 && "000186A0".equals(strE.substring(8, 16))) {
                    LogUtil.a("HwWeatherManager", "COMMAND_ID_FUTURE_WEATHER :", strE.substring(8, 16));
                    break;
                }
                break;
            case 10:
                b(bArr, deviceInfo);
                break;
        }
    }

    public void e() {
        this.p.getSwitchSetting("weather_switch_status", new IBaseResponseCallback() { // from class: nei.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HwWeatherManager", "checkIsNeedPush errorCode: ", Integer.valueOf(i));
                if (i == 0 && (obj instanceof String) && "false".equals((String) obj)) {
                    nei.this.b(false);
                    LogUtil.j("HwWeatherManager", "checkIsNeedPush weather switch is false so return");
                } else {
                    nei.this.d(false);
                    if (nei.this.y) {
                        return;
                    }
                    nei.this.b(true);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(double d2, double d3) {
        if (this.m == null) {
            LogUtil.j("HwWeatherManager", "isPushCondition mDataWeather is null");
            return true;
        }
        if (System.currentTimeMillis() - this.ac > 3540000) {
            LogUtil.a("HwWeatherManager", "isPushCondition over 1 hour");
            return true;
        }
        try {
            if (Locale.getDefault() == null) {
                LogUtil.j("HwWeatherManager", "isPushCondition Locale.getDefault is null");
                return true;
            }
            List<Address> fromLocation = new Geocoder(this.l, Locale.getDefault()).getFromLocation(d2, d3, 1);
            if (fromLocation != null && !fromLocation.isEmpty()) {
                Address address = fromLocation.get(0);
                if (address != null && address.getSubLocality() != null && this.w != null) {
                    String subLocality = address.getSubLocality();
                    LogUtil.a("HwWeatherManager", "isPushCondition SubLocality:", subLocality, " mLastArea:", this.w);
                    if (!this.w.equals(subLocality)) {
                        this.w = subLocality;
                        return true;
                    }
                    return false;
                }
                LogUtil.j("HwWeatherManager", "isPushCondition address is null or empty");
                return true;
            }
            LogUtil.j("HwWeatherManager", "isPushCondition resultList is null");
            return true;
        } catch (Exception e2) {
            LogUtil.e("HwWeatherManager", "isPushCondition exception ", ExceptionUtils.c(e2));
        }
    }

    public void b(boolean z) {
        LogUtil.a("HwWeatherManager", "setWeatherSwitchStatus enable: ", Boolean.valueOf(z));
        if (!z) {
            nee.c(2, -1);
        }
        this.x = z;
        if (this.y && !z) {
            this.y = false;
            this.u = false;
            j();
            LogUtil.a("HwWeatherManager", "setWeatherSwitchStatus stop two hour handler");
            return;
        }
        if (z) {
            LogUtil.a("HwWeatherManager", "setWeatherSwitchStatus start two hour handler");
            this.y = true;
            s();
            return;
        }
        LogUtil.j("HwWeatherManager", "setWeatherSwitchStatus mIsPolling is false do nothing");
    }

    public void d(boolean z) {
        this.u = z;
        DeviceCapability deviceCapabilityB = neg.b();
        if (deviceCapabilityB == null) {
            LogUtil.j("HwWeatherManager", "pushWeatherData DeviceCapability is null");
        } else if (!deviceCapabilityB.isSupportUnitWeather()) {
            LogUtil.a("HwWeatherManager", "pushWeatherData not is SupportUnitWeather");
            l();
        } else {
            this.p.getSwitchSetting("weather_switch_unit_status", new IBaseResponseCallback() { // from class: nei.8
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    boolean z2;
                    LogUtil.a("HwWeatherManager", "pushWeatherData errorCode: ", Integer.valueOf(i));
                    if (i == 0 && (obj instanceof String)) {
                        z2 = !"false".equals((String) obj);
                    } else {
                        z2 = !UnitUtil.b();
                    }
                    LogUtil.a("HwWeatherManager", "pushWeatherData weather_unit_status isMetric: ", Boolean.valueOf(z2));
                    if (z2) {
                        nee.b(0);
                    } else {
                        nee.b(1);
                    }
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    class c implements Handler.Callback {
        private c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null) {
                return false;
            }
            int i = message.what;
            if (i == 100) {
                LogUtil.a("HwWeatherManager", "TwoHoursHandler MSG_ACTION_WEATHER_REPORT_DELAY");
                nei.this.s();
                return true;
            }
            if (i == 200) {
                nei.this.m();
                return true;
            }
            if (i == 400) {
                LogUtil.a("HwWeatherManager", "TwoHoursHandler MSG_GET_WEATHER_FAILED_RETRY mRetryNetworkNum: ", Integer.valueOf(nei.this.ag));
                if (nei.this.ag < 3 && nei.this.r != null) {
                    nei.this.n();
                    neg.e(3);
                } else {
                    LogUtil.a("HwWeatherManager", "TwoHoursHandler MSG_GET_WEATHER_FAILED_RETRY mRetryNetworkNum > 3");
                    nei.this.ag = 0;
                    neg.e(4);
                }
                return true;
            }
            if (i == 401) {
                LogUtil.a("HwWeatherManager", "TwoHoursHandler MSG_GET_FUTURE_WEATHER_FAILED_RETRY mRetryFutureNetworkNumber:", Integer.valueOf(nei.this.ab));
                if (nei.this.ab < 3 && nei.this.r != null) {
                    nei.this.n();
                    neg.e(3);
                } else {
                    LogUtil.a("HwWeatherManager", "TwoHoursHandler MSG_GET_FUTURE_WEATHER_FAILED_RETRY mRetryFutureNetworkNumber > 3");
                    nei.this.ab = 0;
                    neg.e(4);
                }
                return true;
            }
            LogUtil.j("HwWeatherManager", "TwoHoursHandler default");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        u();
        Location locationT = t();
        Object obj = f42983c;
        synchronized (obj) {
            mik.a("HwWeatherManager", "getLocationTimeOut locationTasks:", this.f42984a.toString(), " location:", Boolean.valueOf(locationT != null));
        }
        if (locationT != null) {
            String strB = neg.b(locationT);
            neg.e(locationT);
            synchronized (obj) {
                if (!this.f42984a.isEmpty()) {
                    Iterator<Integer> it = this.f42984a.iterator();
                    while (it.hasNext()) {
                        int iIntValue = it.next().intValue();
                        if (iIntValue == 1) {
                            this.r = locationT;
                            b(locationT);
                        } else if (iIntValue == 2) {
                            this.r = d(locationT);
                            n();
                        } else if (iIntValue == 3) {
                            nee.b(true, strB);
                        } else {
                            LogUtil.j("HwWeatherManager", "getLocationTimeOut default");
                        }
                    }
                }
            }
        } else {
            p();
        }
        synchronized (f42983c) {
            this.f42984a.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (this.y) {
            DeviceInfo deviceInfo = this.n;
            if (deviceInfo != null && deviceInfo.getProductType() >= 34) {
                this.y = false;
                j();
                LogUtil.j("HwWeatherManager", "processPolling new device, do not poll");
                return;
            }
            if (EnvironmentInfo.l()) {
                i();
                x();
            } else {
                ExtendHandler extendHandler = this.ai;
                if (extendHandler != null) {
                    extendHandler.removeMessages(100);
                    extendHandler.sendEmptyMessage(100, AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL);
                }
            }
            boolean zB = PowerKitManager.a().b();
            LogUtil.j("HwWeatherManager", "processPolling isSleeping: ", Boolean.valueOf(zB));
            if (zB) {
                return;
            }
            l();
            return;
        }
        LogUtil.a("HwWeatherManager", "processPolling can not pushWeatherToDevice");
        j();
    }

    private void j() {
        if (EnvironmentInfo.l()) {
            i();
            return;
        }
        ExtendHandler extendHandler = this.ai;
        if (extendHandler != null) {
            extendHandler.removeMessages(100);
        }
    }

    private void x() {
        if (this.i == null) {
            LogUtil.j("HwWeatherManager", "startAlarm mAlarmManager is null");
            return;
        }
        Intent intent = new Intent("action_broadcast_alarm_clock");
        if (this.ad == null) {
            this.ad = PendingIntent.getBroadcast(this.l, 0, intent, 201326592);
        }
        try {
            this.i.setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL, this.ad);
        } catch (SecurityException e2) {
            mik.a("HwWeatherManager", "Weather push startAlarm exception ", e2.getMessage());
        }
    }

    private void i() {
        PendingIntent pendingIntent;
        AlarmManager alarmManager = this.i;
        if (alarmManager == null || (pendingIntent = this.ad) == null) {
            LogUtil.j("HwWeatherManager", "startAlarm mAlarmManager or mPendingIntent is null");
        } else {
            alarmManager.cancel(pendingIntent);
        }
    }

    private void l() {
        if (h()) {
            return;
        }
        if ((this.u || lqj.c()) && !neg.a()) {
            c(2);
            return;
        }
        Location locationT = t();
        if (locationT != null) {
            this.r = d(locationT);
            n();
            return;
        }
        Location locationE = neg.e();
        mik.a("HwWeatherManager", "getLocationForWeatherInquire locationWeather valid is ", Boolean.valueOf(locationE != null));
        if (locationE == null || System.currentTimeMillis() - locationE.getTime() >= 3600000) {
            LogUtil.a("HwWeatherManager", "getLocationForWeatherInquire locationWeather over 1 hour");
            if (neg.a()) {
                Location locationC = neg.c();
                if (locationC != null) {
                    this.r = locationC;
                    n();
                    return;
                } else {
                    nee.c(1, -1);
                    return;
                }
            }
            c(2);
            return;
        }
        LogUtil.a("HwWeatherManager", "getLocationForWeatherInquire locationWeather less 1 hour");
        this.r = d(locationE);
        n();
    }

    private boolean h() {
        boolean zJ = neg.j();
        mik.a("HwWeatherManager", "checkPushWeatherConditions() isHasGpsSwitchAndPermissions:", Boolean.valueOf(zJ));
        if (!zJ) {
            Location locationC = neg.c();
            if (locationC != null) {
                this.r = locationC;
                n();
                return true;
            }
            nee.c(1, -1);
            return true;
        }
        if (!CommonUtil.ab(this.l)) {
            mik.a("HwWeatherManager", "checkPushWeatherConditions network connect false");
            nee.c(0, -1);
            return true;
        }
        mik.a("HwWeatherManager", "checkPushWeatherConditions query weather now, mIsWeatherNeededNow: ", Boolean.valueOf(this.u), " isBackgroundAndNoPermission:", Boolean.valueOf(neg.a()));
        return false;
    }

    private Location d(Location location) {
        Location locationC = neg.c();
        if (locationC != null) {
            mik.a("HwWeatherManager", "queryLocationByPhoneCache location.getTime() > deviceLocation.getTime() ", Boolean.valueOf(location.getTime() > locationC.getTime()));
            if (location.getTime() <= locationC.getTime()) {
                return locationC;
            }
        }
        return location;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    private Location t() {
        Location locationC;
        BadParcelableException e2;
        boolean z;
        Location location = null;
        try {
            locationC = this.af.c(this.z);
            try {
                if (locationC != null) {
                    LogUtil.a("HwWeatherManager", "queryLocationByPhoneCache lastKnown location is true");
                } else {
                    locationC = this.af.c();
                    if (locationC != null && System.currentTimeMillis() - locationC.getTime() >= 3600000) {
                        LogUtil.a("HwWeatherManager", "queryLocationByPhoneCache location over 1 hour, set location is null");
                    }
                    if (location != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mik.a("HwWeatherManager", "queryLocationByPhoneCache location is ", Boolean.valueOf(z));
                    return location;
                }
                location = locationC;
                if (location != null) {
                    z = true;
                } else {
                    z = false;
                }
                mik.a("HwWeatherManager", "queryLocationByPhoneCache location is ", Boolean.valueOf(z));
                return location;
            } catch (BadParcelableException e3) {
                e2 = e3;
                mik.a("HwWeatherManager", "queryLocationByPhoneCache badParcelableException:  ", e2.getMessage());
                return locationC;
            }
        } catch (BadParcelableException e4) {
            locationC = location;
            e2 = e4;
        }
    }

    private void c(int i) {
        synchronized (f42983c) {
            if (!this.f42984a.isEmpty()) {
                this.f42984a.add(Integer.valueOf(i));
                LogUtil.j("HwWeatherManager", "queryLocationByGps already regLocationListener, so return");
                return;
            }
            this.f42984a.add(Integer.valueOf(i));
            LogUtil.a("HwWeatherManager", "queryLocationByGps register LocationListener");
            u();
            this.af.a(this.t, "wearWeatherLocation");
            ExtendHandler extendHandler = this.ai;
            if (extendHandler != null) {
                if (EnvironmentInfo.l()) {
                    extendHandler.sendEmptyMessage(200, 8000L);
                } else {
                    extendHandler.sendEmptyMessage(200, 10000L);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        this.af.c("wearWeatherLocation");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        DeviceCapability deviceCapabilityB = neg.b();
        if (deviceCapabilityB == null || !deviceCapabilityB.isWeatherPush()) {
            LogUtil.j("HwWeatherManager", "processLocationForQuery this device not support weather push");
            return;
        }
        double latitude = this.r.getLatitude();
        double longitude = this.r.getLongitude();
        if (lqj.c()) {
            latitude = lqj.e();
            longitude = lqj.a();
            LogUtil.a("HwWeatherManager", "processLocationForQuery is developer mode, latitudeDev:", Double.valueOf(latitude), " longitudeDev:", Double.valueOf(longitude));
        }
        if (!Utils.o() || "JP".equals(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010))) {
            mik.a("HwWeatherManager", "processLocationForQuery country is China or Japan");
            BigDecimal bigDecimalE = neg.e(latitude);
            if (bigDecimalE != null) {
                latitude = bigDecimalE.setScale(3, 4).doubleValue();
            }
            BigDecimal bigDecimalE2 = neg.e(longitude);
            if (bigDecimalE2 != null) {
                longitude = bigDecimalE2.setScale(3, 4).doubleValue();
            }
        } else {
            BigDecimal bigDecimalE3 = neg.e(latitude);
            if (bigDecimalE3 != null) {
                latitude = bigDecimalE3.setScale(2, 4).doubleValue();
            }
            BigDecimal bigDecimalE4 = neg.e(longitude);
            if (bigDecimalE4 != null) {
                longitude = bigDecimalE4.setScale(2, 4).doubleValue();
            }
        }
        double d2 = latitude;
        double d3 = longitude;
        LogUtil.a("HwWeatherManager", "processLocationForQuery latitude is ", Double.valueOf(d2), " longitude is ", Double.valueOf(d3));
        boolean z = this.u;
        if (z) {
            this.ag = 0;
            this.ab = 0;
        }
        boolean z2 = (z || this.q) ? false : true;
        LogUtil.a("HwWeatherManager", "processLocationForQuery isCheckPushCondition:", Boolean.valueOf(z2));
        b(z2, d2, d3);
    }

    private void b(final boolean z, final double d2, final double d3) {
        if (this.ah == null) {
            this.ah = ThreadPoolManager.d(2, 4);
        }
        this.ah.a("hagWeather", new Runnable() { // from class: nei.9
            @Override // java.lang.Runnable
            public void run() {
                if (!z || nei.this.c(d2, d3)) {
                    nei.this.u = false;
                    if (Locale.getDefault() != null) {
                        try {
                            List<Address> fromLocation = new Geocoder(nei.this.l, Locale.getDefault()).getFromLocation(d2, d3, 1);
                            if (fromLocation != null && !fromLocation.isEmpty()) {
                                Address address = fromLocation.get(0);
                                if (address.getSubLocality() != null) {
                                    String subLocality = address.getSubLocality();
                                    LogUtil.a("HwWeatherManager", "asyncSendWeatherData SubLocality:", subLocality);
                                    nei.this.w = subLocality;
                                }
                            } else {
                                LogUtil.j("HwWeatherManager", "asyncSendWeatherData location result is null");
                            }
                        } catch (Exception e2) {
                            LogUtil.e("HwWeatherManager", "asyncSendWeatherData Exception ", ExceptionUtils.c(e2));
                        }
                    }
                    nei.this.e(d2, d3);
                    return;
                }
                LogUtil.j("HwWeatherManager", "asyncSendWeatherData don't need push weather");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(double d2, double d3) {
        boolean zD = nef.d();
        LogUtil.a("HwWeatherManager", "getWeather isSupportTideCapability: ", Boolean.valueOf(zD));
        lqq lqqVarE = lqh.d().e(zD, d2, d3);
        if (lqqVarE != null) {
            boolean z = (lqqVarE.n() == -99 || lqqVarE.q() == -99 || lqqVarE.t() == -99) ? false : true;
            mik.a("HwWeatherManager", "getWeather getWeatherInfo is ", z ? "success" : ParamConstants.CallbackMethod.ON_FAIL);
            if (lqqVarE.c() != null && lqqVarE.c().size() > 0) {
                String strValue = AnalyticsValue.HAG_WEATHER_PUSH.value();
                lmf.d().c(BaseApplication.getContext(), strValue, lqqVarE.c(), 0);
                a(zD, lqqVarE, strValue);
            }
            if (z) {
                c(lqqVarE);
                if (neg.g()) {
                    neg.d(lqqVarE);
                }
                this.ag = 0;
                if (neg.c(lqqVarE)) {
                    this.ab++;
                    ExtendHandler extendHandler = this.ai;
                    if (extendHandler != null) {
                        extendHandler.sendEmptyMessage(401, 120000L);
                        return;
                    }
                    return;
                }
                this.ab = 0;
                return;
            }
        }
        b(lqqVarE);
    }

    private void a(boolean z, lqq lqqVar, String str) {
        if (!z || lqqVar.e() == null) {
            return;
        }
        nef.a(lqqVar.e().getHagReportBiMap(), str);
    }

    private void b(lqq lqqVar) {
        if (neg.e(lqqVar)) {
            nee.c(0, 0);
            return;
        }
        if (this.ag == 0) {
            if (neg.a(lqqVar)) {
                nee.c(0, 0);
            } else {
                nee.c(0, -1);
            }
        }
        this.ag++;
        ExtendHandler extendHandler = this.ai;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(400, 120000L);
        }
    }

    private void c(lqq lqqVar) {
        if (lqqVar == null) {
            LogUtil.j("HwWeatherManager", "setWeatherData data is null");
            return;
        }
        DeviceCapability deviceCapabilityB = neg.b();
        if (deviceCapabilityB == null || !deviceCapabilityB.isWeatherPush()) {
            LogUtil.j("HwWeatherManager", "setWeatherData not support weather push");
        } else if (this.x) {
            this.m = lqqVar;
            nee.b();
        }
    }

    private void b(byte b2, DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = neg.b(deviceInfo);
        if (deviceCapabilityB == null) {
            LogUtil.j("HwWeatherManager", "DeviceCapability is null.");
            return;
        }
        this.g = b2;
        if (deviceCapabilityB.isAtmosphereSupportExpand()) {
            LogUtil.a("HwWeatherManager", "atmosphere support expand,later send cmd.");
            nee.c();
        } else if (!ned.c(deviceInfo)) {
            LogUtil.a("HwWeatherManager", "atmosphere support, push weather now");
            d((nec) null, deviceInfo);
        } else {
            ned.d(deviceInfo);
        }
    }

    private void a(byte[] bArr, DeviceInfo deviceInfo) {
        if (this.g == 0) {
            LogUtil.j("HwWeatherManager", "handleDeviceSupportDataExpand atmosphereSupport get fail");
            return;
        }
        boolean zC = ned.c(deviceInfo);
        LogUtil.a("HwWeatherManager", "handleDeviceSupportDataExpand isSupportFutureWeatherDetailCapability:", Boolean.valueOf(zC));
        this.ae = bArr;
        if (zC) {
            ned.d(deviceInfo);
        } else {
            d((nec) null, deviceInfo);
        }
    }

    private void b(byte[] bArr, DeviceInfo deviceInfo) {
        d(neg.c(bArr), deviceInfo);
    }

    private void d(nec necVar, DeviceInfo deviceInfo) {
        String strB;
        neb nebVarC;
        if (this.m == null || this.g == 0) {
            LogUtil.j("HwWeatherManager", "pushWeather mDataWeather is null or mAtmosphereSupport is 0");
            return;
        }
        DeviceCapability deviceCapabilityB = neg.b(deviceInfo);
        if (deviceCapabilityB != null && !deviceCapabilityB.isAtmosphereSupportExpand()) {
            nebVarC = neg.c(this.g);
            strB = nee.b(this.m, nebVarC);
        } else {
            byte[] bArr = this.ae;
            if (bArr == null || bArr.length < 6) {
                LogUtil.j("HwWeatherManager", "pushWeather mSupportWeatherFutureByte is invalid");
                return;
            }
            neb nebVarC2 = neg.c(bArr[4], bArr[5]);
            neb nebVarC3 = neg.c(this.g);
            nebVarC3.b(nebVarC2.c());
            nebVarC3.a(nebVarC2.o());
            String strB2 = nee.b(this.m, nebVarC3);
            String strD = nee.d(this.m, nebVarC2);
            LogUtil.a("HwWeatherManager", "pushWeather COMMAND_ID_ATMOSPHERE_SUPPORT_EXPAND, tlv: ", strB2, strD);
            strB = strB2 + strD;
            nebVarC = nebVarC3;
        }
        LogUtil.a("HwWeatherManager", "pushWeather command:", strB);
        boolean zK = neg.k();
        nebVarC.c(zK);
        LogUtil.a("HwWeatherManager", "pushWeather isSupportAlert :", Boolean.valueOf(zK));
        if (!TextUtils.isEmpty(strB)) {
            nee.c(strB, this.m, zK);
        }
        ned.c(this.m, necVar, nebVarC, deviceInfo);
        nef.b(this.m, deviceInfo);
        y();
    }

    private void y() {
        if (neg.l()) {
            if (neg.j()) {
                if (PermissionUtil.a() && neg.a()) {
                    nee.c(1, -1);
                    return;
                }
                return;
            }
            nee.c(1, -1);
        }
    }

    private void c(final byte[] bArr) {
        byte b2 = bArr[4];
        if (b2 == 1) {
            LogUtil.a("HwWeatherManager", "device request weather, push weather need check.");
        } else if (b2 == 2) {
            LogUtil.a("HwWeatherManager", "device request weather, push weather now");
            this.u = true;
        } else {
            LogUtil.j("HwWeatherManager", "handleDeviceRequestWeatherInfo unknown");
            return;
        }
        if (bArr.length == 5 && neg.g()) {
            LogUtil.a("HwWeatherManager", "need to check the cache validity");
            lqq lqqVarD = neg.d();
            if (lqqVarD == null) {
                LogUtil.a("HwWeatherManager", "invalid cache.");
            } else {
                mik.a("HwWeatherManager", "cache valid, push the cache weather data.");
                c(lqqVarD);
                return;
            }
        }
        neg.a(bArr);
        ThreadPoolManager.c().execute(new Runnable() { // from class: nei.10
            @Override // java.lang.Runnable
            public void run() {
                if (EnvironmentInfo.l()) {
                    LogUtil.a("HwWeatherManager", "PowerKitManager weather request");
                    byte[] bArr2 = bArr;
                    if (bArr2.length > 7 && bArr2[7] == 1) {
                        LogUtil.a("HwWeatherManager", "handleDeviceRequestWeatherInfo auto request powerKit.");
                        PowerKitManager.a().d("HwWeatherManager", 65535, 10000L, "user-weatherRequest");
                    } else {
                        LogUtil.a("HwWeatherManager", "handleDeviceRequestWeatherInfo user request powerKit.");
                        PowerKitManager.a().d("HwWeatherManager", 65535, 10000L, "user-weatherRequest");
                    }
                    LogUtil.a("HwWeatherManager", "PowerKitManager weather request end");
                }
            }
        });
        mik.b("HwWeatherManager", 15, 4);
        nee.d(15, 4, 100000);
        mik.a("HwWeatherManager", "handleDataFromDevice() mIsWeatherSwitchOn:", Boolean.valueOf(this.x));
        if (!this.x) {
            nee.c(2, -1);
        } else {
            l();
        }
    }

    private void d(byte[] bArr) {
        if (bArr == null || bArr.length < 5) {
            LogUtil.j("HwWeatherManager", "dataContents is null or length < 5");
            return;
        }
        if (bArr[0] != 24) {
            return;
        }
        LogUtil.a("HwWeatherManager", "device request location, dataContents[1]:", Byte.valueOf(bArr[1]));
        if (bArr[1] != 6) {
            return;
        }
        if (!neg.j()) {
            LogUtil.j("HwWeatherManager", "device request location, GpsPermissions is false");
            nee.d(24, 6, 100001);
        } else {
            boolean z = bArr[4] == 2;
            LogUtil.a("HwWeatherManager", "device request location, isUserActive:", Boolean.valueOf(z));
            a(z);
        }
    }

    private void a(boolean z) {
        mik.b("HwWeatherManager", 24, 6);
        if (z && !neg.a()) {
            c(3);
            return;
        }
        Location locationT = t();
        if (locationT != null) {
            this.r = locationT;
            LogUtil.a("HwWeatherManager", "device request location, location is valid, send gps to device");
            nee.b(true, neg.b(locationT));
        } else {
            LogUtil.j("HwWeatherManager", "device request location, phone cache is null, isBackgroundAndNoPermission: ", Boolean.valueOf(neg.a()));
            if (neg.a()) {
                nee.d(24, 6, 100001);
            } else {
                c(3);
            }
        }
    }

    public void a() {
        try {
            this.l.unregisterReceiver(this.h);
            this.l.unregisterReceiver(this.aa);
            this.l.unregisterReceiver(this.k);
            if (EnvironmentInfo.l()) {
                this.l.unregisterReceiver(this.f42985b);
            }
        } catch (Exception unused) {
            LogUtil.e("HwWeatherManager", "Exception: unregisterReceiver");
        }
        u();
        g();
        ThreadPoolManager threadPoolManager = this.ah;
        if (threadPoolManager != null) {
            threadPoolManager.shutdown();
        }
        ExtendHandler extendHandler = this.ai;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
            this.ai = null;
        }
        LogUtil.a("HwWeatherManager", "onDestroy");
    }

    private static void g() {
        synchronized (e) {
            d = null;
        }
    }

    private void b(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() <= 4) {
            LogUtil.e("HwWeatherManager", "deviceRequestAtmosphere get error data");
            r();
            return;
        }
        try {
            for (eew eewVar : new eet().b(strE.substring(4)).e()) {
                if (CommonUtil.v(eewVar.e()) != 1) {
                    LogUtil.j("HwWeatherManager", "deviceRequestAtmosphere other type: ", eewVar.e());
                } else {
                    LogUtil.a("HwWeatherManager", "deviceRequestAtmosphere value: ", eewVar.b());
                    b(eewVar.b());
                }
            }
        } catch (eeu unused) {
            LogUtil.e("HwWeatherManager", "deviceRequestAtmosphere TlvException");
            r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        q();
        StringBuilder sb = new StringBuilder(0);
        sb.append(eeq.d(127));
        sb.append(eeq.d(4));
        sb.append(eeq.c(100001L));
        nee.a(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.j = null;
    }

    private void b(String str) {
        this.j = str;
        if (TextUtils.isEmpty(str)) {
            r();
            return;
        }
        lqp lqpVarE = e(str);
        if (lqpVarE != null) {
            a(lqpVarE);
        } else {
            f();
        }
    }

    private void f() {
        boolean zJ = neg.j();
        mik.a("HwWeatherManager", "getAtmosphereFromNet() isHasGpsSwitchAndPermissions:", Boolean.valueOf(zJ));
        if (!zJ) {
            r();
            return;
        }
        boolean zAb = CommonUtil.ab(this.l);
        LogUtil.a("HwWeatherManager", "getAtmosphereFromNet atmosphere, netWork state: ", Boolean.valueOf(zAb));
        if (!zAb) {
            r();
            return;
        }
        Location locationT = t();
        if (locationT != null) {
            this.r = locationT;
            LogUtil.a("HwWeatherManager", "getAtmosphereFromNet atmosphere, location is valid");
            k();
        } else {
            boolean zA = neg.a();
            mik.a("HwWeatherManager", "getAtmosphereFromNet atmosphere, phone cache is null, isBackgroundAndNoPermission: ", Boolean.valueOf(zA));
            if (zA) {
                r();
            } else {
                c(1);
            }
        }
    }

    private lqp e(String str) {
        int i;
        int i2 = 0;
        try {
            i = Integer.parseInt(str, 16);
        } catch (NumberFormatException unused) {
            LogUtil.e("HwWeatherManager", "getAtmosphereFromServiceProvider NumberFormatException");
            i = 0;
        }
        ndw ndwVarB = neg.b(i);
        LogUtil.a("HwWeatherManager", "getAtmosphereFromServiceProvider atmosphereSupport: ", ndwVarB.toString());
        if (!ndwVarB.e()) {
            return null;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(15), "get_atmosphere_auto_press");
        LogUtil.a("HwWeatherManager", "getAtmosphereFromServiceProvider last info is: ", strE);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        String[] strArrSplit = strE.split("_");
        if (strArrSplit.length != 3) {
            return null;
        }
        long j = 0;
        double d2 = 0.0d;
        try {
            j = Long.parseLong(strArrSplit[0]);
            d2 = Double.parseDouble(strArrSplit[1]);
            i2 = Integer.parseInt(strArrSplit[2]);
        } catch (NumberFormatException unused2) {
            LogUtil.e("HwWeatherManager", "getAtmosphereFromServiceProvider exception split is not number");
        }
        if (neg.b(10, j)) {
            LogUtil.j("HwWeatherManager", "getAtmosphereFromServiceProvider gap time is rather than 10 minutes");
            return null;
        }
        lqp lqpVar = new lqp();
        lqpVar.d(d2);
        lqpVar.a(i2);
        LogUtil.a("HwWeatherManager", lqpVar.toString());
        return lqpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(lqp lqpVar) {
        if (TextUtils.isEmpty(this.j)) {
            StringBuilder sb = new StringBuilder(0);
            sb.append(e(lqpVar));
            nee.a(sb.toString());
        } else {
            try {
                nee.a(b(lqpVar, neg.b(Integer.parseInt(this.j, 16))));
            } catch (NumberFormatException unused) {
                LogUtil.e("HwWeatherManager", "pushAtmosphere NumberFormatException");
            }
        }
    }

    private String b(lqp lqpVar, ndw ndwVar) {
        if (lqpVar == null) {
            LogUtil.j("HwWeatherManager", "AtmosphereInfo is null");
            return null;
        }
        StringBuilder sb = new StringBuilder(0);
        if (ndwVar.e()) {
            sb.append(e(lqpVar));
        }
        return sb.toString();
    }

    private String e(lqp lqpVar) {
        int[] iArrA = neg.a(lqpVar.a());
        StringBuilder sb = new StringBuilder(0);
        sb.append(eeq.d(2));
        sb.append(eeq.d(2));
        sb.append(eeq.e(iArrA[0]));
        StringBuilder sb2 = new StringBuilder(0);
        sb2.append(eeq.d(3));
        sb2.append(eeq.d(1));
        sb2.append(eeq.d(lqpVar.c()));
        StringBuilder sb3 = new StringBuilder(0);
        sb3.append(eeq.d(4));
        sb3.append(eeq.d(2));
        sb3.append(eeq.e(iArrA[1]));
        LogUtil.a("HwWeatherManager", "pressureTLV : ", sb.toString(), "pressureUnitTLV : ", sb2.toString(), "pressureDecimalTLV : ", sb3.toString());
        return sb.toString() + sb2.toString() + sb3.toString();
    }

    private void k() {
        LogUtil.a("HwWeatherManager", "pushAtmosphereToDevice() ENTER");
        if (this.ah == null) {
            this.ah = ThreadPoolManager.d(2, 4);
        }
        this.ah.a("hagWeather", new Runnable() { // from class: nei.4
            @Override // java.lang.Runnable
            public void run() {
                lqo.b(nei.this.l).c(CommonUtil.e(nei.this.r.getLatitude(), 1), CommonUtil.e(nei.this.r.getLongitude(), 1), new ICloudOperationResult<lqp>() { // from class: nei.4.2
                    @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void operationResult(lqp lqpVar, String str, boolean z) {
                        if (lqpVar != null && lqpVar.d() != null && !lqpVar.d().isEmpty()) {
                            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HAG_WEATHER_PUSH.value(), lqpVar.d(), 0);
                        }
                        if (z && lqpVar != null) {
                            nei.this.a(lqpVar);
                            nei.this.d(lqpVar);
                            nei.this.q();
                        } else {
                            LogUtil.j("HwWeatherManager", "pushAtmosphereToDevice() AtmosphereInfo ERROR!");
                            nei.this.r();
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(lqp lqpVar) {
        LogUtil.a("HwWeatherManager", "enter saveInfoOnServiceProvider, mAtmosphereSupportValue is: ", this.j);
        if (!TextUtils.isEmpty(this.j)) {
            try {
                if (neg.b(Integer.parseInt(this.j, 16)).e()) {
                    neg.d(lqpVar);
                    return;
                }
                return;
            } catch (NumberFormatException unused) {
                LogUtil.e("HwWeatherManager", "valve is not number");
                return;
            }
        }
        neg.d(lqpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Location location) {
        LogUtil.a("HwWeatherManager", "handleWhenGetLocationSuccess hwLocation: ", Boolean.valueOf(location != null));
        if (location == null) {
            return;
        }
        this.r = location;
        k();
    }

    public void d() {
        LogUtil.a("HwWeatherManager", "pushLocalPressure enter");
        f();
    }
}
