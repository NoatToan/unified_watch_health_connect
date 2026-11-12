package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.callback.FitnessCloudCallBack;
import com.huawei.datatype.DeviceCommand;
import com.huawei.datatype.EventAlarmInfo;
import com.huawei.datatype.SmartAlarmInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcloudjs.a;
import com.huawei.hwcloudmodel.model.intelligent.TransferDeviceDataResponse;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.phoneprocess.service.HandleIntentService;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.watchface.videoedit.utils.ListUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LocalBroadcast;
import health.compact.a.MagicBuild;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lvv extends HwBaseManager implements BluetoothDataReceiveCallback, DataReceiveCallback {
    private static lvv g;
    private IBaseResponseCallback f;
    private int i;
    private BroadcastReceiver k;
    private lvw l;
    private String m;
    private Context n;
    private int o;
    private int p;
    private lvb q;
    private ExtendHandler r;
    private eet s;
    private mhs t;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40915a = new Object();
    private static final Object d = new Object();
    private static List<IBaseResponseCallback> j = new ArrayList(16);
    private static List<IBaseResponseCallback> h = new ArrayList(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<IBaseResponseCallback> f40916b = new ArrayList(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<IBaseResponseCallback> f40917c = new ArrayList(16);

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public boolean onDataMigrate() {
        return true;
    }

    static /* synthetic */ int a(lvv lvvVar) {
        int i = lvvVar.o;
        lvvVar.o = i + 1;
        return i;
    }

    private lvv(Context context) {
        super(context);
        this.o = 0;
        this.r = null;
        this.p = 0;
        this.m = "";
        this.s = new eet();
        this.i = 5;
        this.k = new BroadcastReceiver() { // from class: lvv.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                DeviceInfo deviceInfo;
                if (context2 == null || intent == null) {
                    LogUtil.j("HwAlarmManager", "mConnectStateChangedReceiver() context or intent is null ");
                    return;
                }
                LogUtil.a("HwAlarmManager", "mConnectStateChangedReceiver() context ", context2, " intent ", intent.getAction());
                if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    try {
                        deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                    } catch (BadParcelableException unused) {
                        LogUtil.e("HwAlarmManager", "fuzzy test exception");
                        deviceInfo = null;
                    }
                    if (deviceInfo != null) {
                        if (lvv.this.e(deviceInfo)) {
                            lvv.this.d(deviceInfo);
                            return;
                        } else {
                            LogUtil.j("HwAlarmManager", "This device does not have the correspond capability.");
                            return;
                        }
                    }
                    LogUtil.e("HwAlarmManager", "mConnectStateChangedReceiver() deviceInfo is null ");
                }
            }
        };
        this.f = new IBaseResponseCallback() { // from class: lvv.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HwAlarmManager", "mAutoSendResponseCallback() is comeback, errCode ", Integer.valueOf(i));
            }
        };
        this.n = context;
        this.l = new lvw(context);
        lvb lvbVarE = lvb.e();
        this.q = lvbVarE;
        if (lvbVarE == null) {
            LogUtil.e("HwAlarmManager", "HwAlarmManager mDeviceConfigManager is null");
        } else {
            BroadcastManagerUtil.c(this.n, this.k, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
            this.q.d(8, this);
        }
        this.t = mhs.a();
        this.r = HandlerCenter.b(new b(), "HwAlarmManager");
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo) {
        int autoDetectSwitchStatus = deviceInfo.getAutoDetectSwitchStatus();
        LogUtil.a("HwAlarmManager", "autoDetectSwitchStatus ", Integer.valueOf(autoDetectSwitchStatus));
        if (autoDetectSwitchStatus != 1) {
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            this.p = deviceConnectState;
            LogUtil.a("HwAlarmManager", "mDeviceConnect ", Integer.valueOf(deviceConnectState));
            if (deviceInfo.getDeviceConnectState() == 2) {
                String securityDeviceId = deviceInfo.getSecurityDeviceId();
                a(deviceInfo);
                b(securityDeviceId);
                return;
            }
            LogUtil.a("HwAlarmManager", "setSwitchDeviceInfo unKnow type");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return false;
        }
        Map<String, DeviceCapability> mapD = lvb.e().d(1, deviceInfo.getDeviceIdentify(), "HwAlarmManager");
        if (mapD == null || mapD.isEmpty()) {
            LogUtil.j("HwAlarmManager", "enter mConnectStateChangedReceiver, deviceCapabilityHashMaps is null or empty");
            return false;
        }
        DeviceCapability deviceCapability = mapD.get(deviceInfo.getDeviceIdentify());
        if (deviceCapability != null && (deviceCapability.isEventAlarm() || deviceCapability.isSmartAlarm())) {
            return true;
        }
        LogUtil.j("HwAlarmManager", "device not support event alarm or smart alarm.");
        return false;
    }

    public static lvv c(Context context) {
        lvv lvvVar;
        synchronized (d) {
            if (g == null && context != null) {
                LogUtil.a("HwAlarmManager", "getInstance() context ", context);
                g = new lvv(BaseApplication.getContext());
            }
            lvvVar = g;
        }
        return lvvVar;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 8;
    }

    public void b(final List<EventAlarmInfo> list, final IBaseResponseCallback iBaseResponseCallback, final boolean z) {
        ReleaseLogUtil.d("R_HwAlarmManager", " setEventAlarm begin ");
        synchronized (e) {
            b(new IBaseResponseCallback() { // from class: lvv.8
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    DeviceCommand deviceCommand = new DeviceCommand();
                    deviceCommand.setServiceID(8);
                    deviceCommand.setCommandID(1);
                    deviceCommand.setmIdentify(lvv.this.m);
                    LogUtil.a("HwAlarmManager", "setEventAlarm mCurrentDeviceId: ", BTDeviceMgrUtil.c().e(lvv.this.m));
                    ByteBuffer byteBufferA = lvv.this.l.a(list, true);
                    deviceCommand.setDataLen(byteBufferA.array().length);
                    deviceCommand.setDataContent(byteBufferA.array());
                    lvv.this.q.c(deviceCommand);
                    LogUtil.a("HwAlarmManager", "isNeedRespond ", Boolean.valueOf(z));
                    if (z) {
                        synchronized (lvv.n()) {
                            lvv.j.add(iBaseResponseCallback);
                        }
                        lvv.this.b((List<EventAlarmInfo>) list, (IBaseResponseCallback) null);
                        return;
                    }
                    lvv.this.b((List<EventAlarmInfo>) list, iBaseResponseCallback);
                }
            });
        }
    }

    private int e(SmartAlarmInfo smartAlarmInfo) {
        int smartAlarmEnable = smartAlarmInfo.getSmartAlarmEnable();
        String strE = SharedPreferenceManager.e(this.n, String.valueOf(10022), "ONCE_SMART_ALARM_INFO");
        LogUtil.a("HwAlarmManager", "once onceSmartAlarmIsOver json ", strE);
        if (!TextUtils.isEmpty(strE)) {
            smartAlarmEnable = e(smartAlarmInfo, (List<SmartAlarmInfo>) new Gson().fromJson(strE, new TypeToken<List<SmartAlarmInfo>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwalarmmgr.HwAlarmManager$4
            }.getType()));
        } else {
            LogUtil.j("HwAlarmManager", "once onceSmartAlarmIsOver json is null");
        }
        ReleaseLogUtil.d("R_HwAlarmManager", "once onceSmartAlarmIsOver smartAlarmEnable ,", Integer.valueOf(smartAlarmEnable));
        return smartAlarmEnable;
    }

    private int e(SmartAlarmInfo smartAlarmInfo, List<SmartAlarmInfo> list) {
        int smartAlarmEnable = smartAlarmInfo.getSmartAlarmEnable();
        if (list != null && !list.isEmpty()) {
            for (SmartAlarmInfo smartAlarmInfo2 : list) {
                if (smartAlarmInfo2.getSmartAlarmIndex() == smartAlarmInfo.getSmartAlarmIndex()) {
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    LogUtil.a("HwAlarmManager", "once curTime ", Long.valueOf(jCurrentTimeMillis));
                    if (jCurrentTimeMillis >= smartAlarmInfo2.getSmartAlarmTime()) {
                        smartAlarmEnable = 0;
                    }
                }
            }
        }
        return smartAlarmEnable;
    }

    public void e(List<EventAlarmInfo> list) {
        ReleaseLogUtil.d("R_HwAlarmManager", "once eventAlarmInfoList ", list.toString());
        ArrayList arrayList = new ArrayList(16);
        for (EventAlarmInfo eventAlarmInfo : list) {
            if (eventAlarmInfo.getEventAlarmRepeat() == 0 && eventAlarmInfo.getEventAlarmEnable() == 1) {
                arrayList.add(eventAlarmInfo);
            }
        }
        ReleaseLogUtil.d("R_HwAlarmManager", "once eventAlarm saveAlarmInfoList.size() ", Integer.valueOf(arrayList.size()));
        if (arrayList.isEmpty()) {
            return;
        }
        StorageParams storageParams = new StorageParams(0);
        String json = new Gson().toJson(arrayList);
        LogUtil.a("HwAlarmManager", "once eventAlarm saveOnceAlarm() json ", json);
        SharedPreferenceManager.e(this.n, String.valueOf(10022), "ONCE_EVENT_ALARM_INFO", json, storageParams);
    }

    public void b(String str, List<EventAlarmInfo> list, IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(8);
        deviceCommand.setCommandID(1);
        deviceCommand.setmIdentify(str);
        ByteBuffer byteBufferA = this.l.a(list, false);
        deviceCommand.setDataLen(byteBufferA.array().length);
        deviceCommand.setDataContent(byteBufferA.array());
        this.q.c(deviceCommand);
        ReleaseLogUtil.d("R_HwAlarmManager", "setDeviceEventAlarm is: ", byteBufferA.array());
        synchronized (n()) {
            j.clear();
            j.add(iBaseResponseCallback);
        }
    }

    public void c(final List<SmartAlarmInfo> list, final IBaseResponseCallback iBaseResponseCallback, final boolean z) {
        ReleaseLogUtil.d("R_HwAlarmManager", " setSmartAlarm()");
        synchronized (f40915a) {
            a(new IBaseResponseCallback() { // from class: lvv.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    ReleaseLogUtil.d("R_HwAlarmManager", "setSmartAlarm() before smartAlarmInfoList.size() ", Integer.valueOf(list.size()));
                    if (list.size() > 1) {
                        SmartAlarmInfo smartAlarmInfo = (SmartAlarmInfo) list.get(0);
                        list.clear();
                        list.add(smartAlarmInfo);
                    }
                    ReleaseLogUtil.d("R_HwAlarmManager", "setSmartAlarm() after smartAlarmList.size() ", Integer.valueOf(list.size()));
                    DeviceCommand deviceCommand = new DeviceCommand();
                    deviceCommand.setServiceID(8);
                    deviceCommand.setCommandID(2);
                    deviceCommand.setmIdentify(lvv.this.m);
                    LogUtil.a("HwAlarmManager", "setSmartAlarm mCurrentDeviceId");
                    ByteBuffer byteBufferC = lvv.this.c((List<SmartAlarmInfo>) list);
                    deviceCommand.setDataLen(byteBufferC.array().length);
                    deviceCommand.setDataContent(byteBufferC.array());
                    lvv.this.q.c(deviceCommand);
                    if (z) {
                        synchronized (lvv.o()) {
                            lvv.h.add(iBaseResponseCallback);
                        }
                        lvv.this.c((List<SmartAlarmInfo>) list, (IBaseResponseCallback) null);
                        return;
                    }
                    lvv.this.c((List<SmartAlarmInfo>) list, iBaseResponseCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ByteBuffer c(List<SmartAlarmInfo> list) {
        ByteBuffer byteBufferAllocate;
        byte[] bArrC;
        int iE;
        int size = list.size() * 18;
        if (size > 255) {
            byteBufferAllocate = ByteBuffer.allocate(size + 3);
            bArrC = eeq.c(eeq.e(size));
        } else {
            byteBufferAllocate = ByteBuffer.allocate(size + 2);
            bArrC = eeq.c(eeq.d(size));
        }
        byteBufferAllocate.put((byte) -127);
        byteBufferAllocate.put(bArrC);
        for (SmartAlarmInfo smartAlarmInfo : list) {
            byteBufferAllocate.put((byte) -126);
            byteBufferAllocate.put(eeq.c(eeq.d(16)));
            byteBufferAllocate.put((byte) 3);
            byteBufferAllocate.put((byte) 1);
            byteBufferAllocate.put(eeq.c(eeq.d(smartAlarmInfo.getSmartAlarmIndex())));
            byteBufferAllocate.put((byte) 4);
            byteBufferAllocate.put((byte) 1);
            if (smartAlarmInfo.getSmartAlarmRepeat() == 0 && smartAlarmInfo.getSmartAlarmEnable() == 1 && (iE = e(smartAlarmInfo)) == 0) {
                smartAlarmInfo.setSmartAlarmEnable(iE);
            }
            byteBufferAllocate.put(eeq.c(eeq.d(smartAlarmInfo.getSmartAlarmEnable())));
            byteBufferAllocate.put((byte) 5);
            byteBufferAllocate.put((byte) 2);
            byteBufferAllocate.put(eeq.c(eeq.e(eeq.f((smartAlarmInfo.getSmartAlarmStartTimeHour() * 100) + smartAlarmInfo.getSmartAlarmStartTimeMins()))));
            byteBufferAllocate.put((byte) 6);
            byteBufferAllocate.put((byte) 1);
            byteBufferAllocate.put(eeq.c(eeq.d(smartAlarmInfo.getSmartAlarmRepeat())));
            byteBufferAllocate.put((byte) 7);
            byteBufferAllocate.put((byte) 1);
            byteBufferAllocate.put(eeq.c(eeq.d(smartAlarmInfo.getSmartAlarmAheadTime())));
        }
        return byteBufferAllocate;
    }

    public void c(String str, List<SmartAlarmInfo> list, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("R_HwAlarmManager", " setDeviceSmartAlarm()");
        LogUtil.a("HwAlarmManager", "setSmartAlarm() before smartAlarmInfoList.size() ", Integer.valueOf(list.size()));
        if (list.size() > 1) {
            SmartAlarmInfo smartAlarmInfo = list.get(0);
            list.clear();
            list.add(smartAlarmInfo);
        }
        LogUtil.a("HwAlarmManager", "setSmartAlarm() after smartAlarmInfoList.size() ", Integer.valueOf(list.size()));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(8);
        deviceCommand.setCommandID(2);
        deviceCommand.setmIdentify(str);
        d(list, deviceCommand);
        ReleaseLogUtil.d("R_HwAlarmManager", "setDeviceSmartAlarm is: ", list);
        synchronized (o()) {
            h.clear();
            h.add(iBaseResponseCallback);
        }
    }

    private void d(List<SmartAlarmInfo> list, DeviceCommand deviceCommand) {
        ByteBuffer byteBufferAllocate;
        byte[] bArrC;
        int size = list.size() * 18;
        if (size > 255) {
            byteBufferAllocate = ByteBuffer.allocate(size + 3);
            bArrC = eeq.c(eeq.e(size));
        } else {
            byteBufferAllocate = ByteBuffer.allocate(size + 2);
            bArrC = eeq.c(eeq.d(size));
        }
        byteBufferAllocate.put((byte) -127);
        byteBufferAllocate.put(bArrC);
        d(list, deviceCommand, byteBufferAllocate);
    }

    private void d(List<SmartAlarmInfo> list, DeviceCommand deviceCommand, ByteBuffer byteBuffer) {
        for (SmartAlarmInfo smartAlarmInfo : list) {
            byteBuffer.put((byte) -126);
            byteBuffer.put(eeq.c(eeq.d(16)));
            byteBuffer.put((byte) 3);
            byteBuffer.put((byte) 1);
            byteBuffer.put(eeq.c(eeq.d(smartAlarmInfo.getSmartAlarmIndex())));
            byteBuffer.put((byte) 4);
            byteBuffer.put((byte) 1);
            byteBuffer.put(eeq.c(eeq.d(smartAlarmInfo.getSmartAlarmEnable())));
            byteBuffer.put((byte) 5);
            byteBuffer.put((byte) 2);
            byteBuffer.put(eeq.c(eeq.e(eeq.f((smartAlarmInfo.getSmartAlarmStartTimeHour() * 100) + smartAlarmInfo.getSmartAlarmStartTimeMins()))));
            byteBuffer.put((byte) 6);
            byteBuffer.put((byte) 1);
            byteBuffer.put(eeq.c(eeq.d(smartAlarmInfo.getSmartAlarmRepeat())));
            byteBuffer.put((byte) 7);
            byteBuffer.put((byte) 1);
            byteBuffer.put(eeq.c(eeq.d(smartAlarmInfo.getSmartAlarmAheadTime())));
            deviceCommand.setDataLen(byteBuffer.array().length);
            deviceCommand.setDataContent(byteBuffer.array());
            this.q.c(deviceCommand);
        }
    }

    private void c(byte[] bArr) {
        int iE;
        LogUtil.a("HwAlarmManager", "Alarm manager getResult ", eeq.e(bArr));
        byte b2 = bArr[1];
        int i = 0;
        if (b2 == 1 || b2 == 2) {
            iE = e(bArr);
            ReleaseLogUtil.d("R_HwAlarmManager", "Alarm manager info ", Integer.valueOf(iE), "message[1] ", Byte.valueOf(bArr[1]));
            if (iE != 100000) {
                i = -1;
            }
        } else {
            iE = 0;
        }
        c(bArr, i, iE);
        if (i != 0) {
            b("");
            LogUtil.a("HwAlarmManager", "bluetooth send error, clear mac");
        }
    }

    private void c(byte[] bArr, int i, int i2) {
        ReleaseLogUtil.d("R_HwAlarmManager", "commandId Received is ", Byte.valueOf(bArr[1]));
        byte b2 = bArr[1];
        if (b2 == 1) {
            synchronized (n()) {
                if (!j.isEmpty()) {
                    j.get(0).a(i, Integer.valueOf(i2));
                    j.remove(0);
                }
            }
            return;
        }
        if (b2 == 2) {
            synchronized (o()) {
                if (!h.isEmpty()) {
                    h.get(0).a(i, Integer.valueOf(i2));
                    h.remove(0);
                }
            }
            return;
        }
        if (b2 == 3) {
            synchronized (k()) {
                if (!f40916b.isEmpty()) {
                    f40916b.get(0).a(i, eeq.e(bArr));
                    f40916b.remove(0);
                }
            }
            return;
        }
        if (b2 == 4) {
            synchronized (l()) {
                if (!f40917c.isEmpty()) {
                    f40917c.get(0).a(i, eeq.e(bArr));
                    f40917c.remove(0);
                }
            }
            return;
        }
        if (b2 == 5) {
            a(eeq.e(bArr));
        } else if (b2 == 8) {
            d(eeq.e(bArr));
        } else {
            LogUtil.a("HwAlarmManager", "switchMessage unKnow type");
        }
    }

    private int e(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() <= 8) {
            return 0;
        }
        try {
            return Integer.parseInt(strE.substring(8, strE.length()), 16);
        } catch (NumberFormatException e2) {
            LogUtil.a("HwAlarmManager", e2.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object n() {
        List<IBaseResponseCallback> list;
        synchronized (lvv.class) {
            list = j;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object o() {
        List<IBaseResponseCallback> list;
        synchronized (lvv.class) {
            list = h;
        }
        return list;
    }

    private static Object k() {
        List<IBaseResponseCallback> list;
        synchronized (lvv.class) {
            list = f40916b;
        }
        return list;
    }

    private static Object l() {
        List<IBaseResponseCallback> list;
        synchronized (lvv.class) {
            list = f40917c;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<EventAlarmInfo> list, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("R_HwAlarmManager", "eventAlarmInfoList=" + list + ";mResponseCallback=" + iBaseResponseCallback);
        lvz lvzVar = new lvz();
        lvzVar.c(iBaseResponseCallback);
        lvzVar.c(list);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = lvzVar;
        this.r.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<SmartAlarmInfo> list, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("R_HwAlarmManager", "smartAlarmInfoList ", list, " ; baseResponseCallback ", iBaseResponseCallback);
        lvz lvzVar = new lvz();
        lvzVar.c(iBaseResponseCallback);
        lvzVar.c(list);
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = lvzVar;
        this.r.sendMessage(messageObtain);
    }

    private void g() {
        LogUtil.a("HwAlarmManager", "autoSendCommend() enter.");
        if (this.p != 2) {
            LogUtil.a("HwAlarmManager", "autoSendCommend device is not mConnected, return");
            return;
        }
        List<DeviceInfo> listE = mgg.e("HwAlarmManager");
        if (listE != null) {
            for (DeviceInfo deviceInfo : listE) {
                if (deviceInfo.getAutoDetectSwitchStatus() != 1) {
                    LogUtil.a("HwAlarmManager", "autoSendCommend autoDetectSwitchStatus not equal 1");
                    a(deviceInfo);
                    return;
                }
            }
            deviceInfo = null;
            a(deviceInfo);
            return;
        }
        LogUtil.a("HwAlarmManager", "autoSendCommend getConnectDeviceList is null");
    }

    private void a(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwAlarmManager", "autoSendCommend info is null");
            return;
        }
        if (deviceInfo.getAutoDetectSwitchStatus() == 1) {
            LogUtil.a("HwAlarmManager", "autoSendCommend info is RUN_WORK_MODE");
            return;
        }
        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityA == null) {
            ReleaseLogUtil.e("R_HwAlarmManager", "autoSendCommend CapabilityUtils.getDeviceCapability() is null!!");
            return;
        }
        this.m = deviceInfo.getDeviceIdentify();
        boolean zIsEventAlarm = deviceCapabilityA.isEventAlarm();
        boolean zIsSmartAlarm = deviceCapabilityA.isSmartAlarm();
        boolean zIsSupportChangeAlarm = deviceCapabilityA.isSupportChangeAlarm();
        ReleaseLogUtil.d("R_HwAlarmManager", "autoSendCommend isSupportChangeAlarm: ", Boolean.valueOf(zIsSupportChangeAlarm), " isSupportEventAlarm ", Boolean.valueOf(zIsEventAlarm), ", isSupportSmartAlarm ", Boolean.valueOf(zIsSmartAlarm));
        if (zIsSupportChangeAlarm) {
            return;
        }
        c(zIsEventAlarm, zIsSmartAlarm);
    }

    private void c(boolean z, boolean z2) {
        if (z) {
            b(new IBaseResponseCallback() { // from class: lvv.9
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    synchronized (lvv.e) {
                        List<EventAlarmInfo> arrayList = new ArrayList<>(16);
                        if (i == 0 && (obj instanceof List)) {
                            arrayList = (List) obj;
                        }
                        if (TextUtils.isEmpty(SharedPreferenceManager.e(lvv.this.n, String.valueOf(10022), "ONCE_EVENT_ALARM_INFO"))) {
                            lvv.this.e(arrayList);
                        }
                        lvv lvvVar = lvv.this;
                        lvvVar.b(arrayList, lvvVar.f, true);
                        ReleaseLogUtil.d("R_HwAlarmManager", "autoSendCommend() setEventAlarm finish.");
                    }
                }
            });
        }
        if (z2) {
            a(new IBaseResponseCallback() { // from class: lvv.14
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    List<SmartAlarmInfo> arrayList = new ArrayList<>(16);
                    if (i == 0 && (obj instanceof List)) {
                        arrayList = (List) obj;
                    }
                    LogUtil.a("HwAlarmManager", "autoSendCommend() smartAlarmInfoList.size() ", Integer.valueOf(arrayList.size()));
                    if (arrayList.isEmpty()) {
                        arrayList.add(new SmartAlarmInfo());
                    }
                    lvv lvvVar = lvv.this;
                    lvvVar.c(arrayList, lvvVar.f, true);
                    ReleaseLogUtil.d("R_HwAlarmManager", "autoSendCommend() setSmartAlarm finish.");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(File file) {
        lvy lvyVar = new lvy();
        String strE = phw.e(file);
        ReleaseLogUtil.d("R_HwAlarmManager", "parseLegalHolidayInfo jsonResult is,", strE);
        if (TextUtils.isEmpty(strE) || Constants.NULL.equalsIgnoreCase(strE)) {
            ReleaseLogUtil.d("R_HwAlarmManager", "parseLegalHolidayInfo jsonResult is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strE);
            JSONArray jSONArray = jSONObject.getJSONArray("belowVersion");
            JSONObject jSONObject2 = jSONObject.getJSONObject("normalVersion");
            if (jSONArray != null && jSONArray.length() >= 1 && jSONObject2 != null) {
                b(jSONObject2, lvyVar);
                DeviceInfo deviceInfoC = mgg.c("HwAlarmManager");
                if (deviceInfoC == null) {
                    ReleaseLogUtil.d("R_HwAlarmManager", "curDeviceInfo is null");
                    return;
                }
                String deviceModel = deviceInfoC.getDeviceModel();
                String softVersion = deviceInfoC.getSoftVersion();
                if (deviceModel != null && softVersion != null) {
                    String str = deviceModel.split(com.huawei.openalliance.ad.constant.Constants.LINK)[0];
                    String str2 = softVersion.split("\\(")[0];
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        ReleaseLogUtil.d("R_HwAlarmManager", "deviceModel is:", str, "deviceSoftVersion is:", str2);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                            if (jSONObject3 != null && !jSONObject3.isNull("deviceVersion")) {
                                String string = jSONObject3.getString("deviceVersion");
                                if (str.equals(jSONObject3.getString(a.d)) && a(str2, string)) {
                                    b(jSONObject3, lvyVar);
                                    break;
                                }
                            }
                        }
                        ReleaseLogUtil.d("R_HwAlarmManager", "year is:", lvyVar.e() + "version is:", lvyVar.d() + "freeDay is:", lvyVar.a() + "workDay is:", lvyVar.b());
                        b(lvyVar.e(), lvyVar.d(), lvyVar.b(), lvyVar.a());
                        return;
                    }
                    ReleaseLogUtil.e("R_HwAlarmManager", "deviceModel is null or deviceSoftVersion is null.");
                    b(lvyVar.e(), lvyVar.d(), lvyVar.b(), lvyVar.a());
                    return;
                }
                ReleaseLogUtil.d("R_HwAlarmManager", "deviceModel is null or deviceSoftVersion is null");
                b(lvyVar.e(), lvyVar.d(), lvyVar.b(), lvyVar.a());
                return;
            }
            ReleaseLogUtil.d("R_HwAlarmManager", "belowVersion is,", Boolean.valueOf(jSONArray == null), "normalVersionObject is,", Boolean.valueOf(jSONObject2 == null));
        } catch (JSONException e2) {
            ReleaseLogUtil.e("R_HwAlarmManager", "parseLegalHolidayInfo e: ", ExceptionUtils.c(e2));
        }
    }

    private boolean a(String str, String str2) {
        if (str == null || str2 == null) {
            ReleaseLogUtil.d("R_HwAlarmManager", "deviceVersionStr is null or configVersionStr is null");
            return false;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int length = strArrSplit.length;
        int[] iArr = new int[length];
        int length2 = strArrSplit2.length;
        int[] iArr2 = new int[length2];
        for (int i = 0; i < length; i++) {
            try {
                iArr[i] = Integer.parseInt(strArrSplit[i]);
            } catch (NumberFormatException e2) {
                ReleaseLogUtil.e("R_HwAlarmManager", "compareVersion e: ", ExceptionUtils.c(e2));
                return false;
            }
        }
        for (int i2 = 0; i2 < length2; i2++) {
            iArr2[i2] = Integer.parseInt(strArrSplit2[i2]);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            int i6 = iArr2[i4];
            if (i5 > i6) {
                return false;
            }
            if (i5 < i6 || (i3 = i3 + 1) == length) {
                return true;
            }
        }
        return false;
    }

    private void b(JSONObject jSONObject, lvy lvyVar) throws JSONException {
        if (jSONObject.isNull("year") || jSONObject.isNull("version") || jSONObject.isNull("workday") || jSONObject.isNull("freeday")) {
            return;
        }
        lvyVar.e(jSONObject.getInt("year"));
        lvyVar.b(jSONObject.getString("version"));
        lvyVar.a(d(jSONObject.getJSONArray("workday")));
        lvyVar.d(d(jSONObject.getJSONArray("freeday")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final int i) {
        ReleaseLogUtil.d("R_HwAlarmManager", "enter downloadSkipHolidayConfig retryCount = ", Integer.valueOf(i));
        if (i < 0) {
            ReleaseLogUtil.e("R_HwAlarmManager", "downloadSkipHolidayConfig retryCount < 0");
            m();
        } else {
            fdy.d(new fda("com.huawei.health_skip_holiday_config", new HashMap()), "skipHolidayConfig", 1, new DownloadCallback<File>() { // from class: lvv.11
                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onFinish(File file) {
                    LogUtil.a("HwAlarmManager", "downloadSkipHolidayConfig success, result: ", file.toString());
                    lvv.this.c(file);
                }

                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                public void onProgress(long j2, long j3, boolean z, String str) {
                    LogUtil.a("HwAlarmManager", "downloadSkipHolidayConfig onProgress, already: ", Long.valueOf(j2), ", total: " + j3, ", fileId: ", str);
                }

                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                public void onFail(int i2, Throwable th) {
                    ReleaseLogUtil.a("R_HwAlarmManager", "downloadSkipHolidayConfig failed,", th.getMessage());
                    lvv.this.e(i - 1);
                }
            });
        }
    }

    private void m() {
        LogUtil.a("HwAlarmManager", "getDefaultPath");
        String strD = fdy.d("com.huawei.health_skip_holiday_config", "skipHolidayConfig", "json");
        if (TextUtils.isEmpty(strD)) {
            ReleaseLogUtil.e("R_HwAlarmManager", "DefaultFilePath is null");
        } else {
            LogUtil.a("HwAlarmManager", "DefaultPath :", strD);
            c(new File(strD));
        }
    }

    private void b(int i, String str, String str2, String str3) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(8);
        deviceCommand.setCommandID(8);
        StringBuilder sb = new StringBuilder(16);
        sb.append(eeq.d(2));
        sb.append(eeq.d(2));
        sb.append(eeq.d(i));
        sb.append(eeq.d(3));
        sb.append(eeq.d(str.length()));
        sb.append(eeq.a(str));
        sb.append(eeq.d(4));
        sb.append(eeq.b(str2.length()));
        sb.append(eeq.a(str2));
        sb.append(eeq.d(5));
        sb.append(eeq.b(str3.length()));
        sb.append(eeq.a(str3));
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        deviceCommand.setDataLength(eeq.c(sb.toString()).length);
        LogUtil.a("HwAlarmManager", "sendHoliday, deviceCommand:", deviceCommand.toString());
        this.q.c(deviceCommand);
    }

    private String d(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() >= 1) {
            return jSONArray.toString().replace("[", "").replace("]", "");
        }
        ReleaseLogUtil.d("R_HwAlarmManager", "array is null");
        return "";
    }

    public void d(String str) {
        ReleaseLogUtil.d("HwAlarmManager", "handleLegalHolidayDataCommand");
        if (str == null || str.length() < 8) {
            return;
        }
        if ("7F04".equalsIgnoreCase(str.substring(4, 8))) {
            LogUtil.j("HwAlarmManager", "getResult error 7F04");
        } else {
            e(1);
        }
    }

    public void e(String str, IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(8);
        deviceCommand.setCommandID(3);
        deviceCommand.setmIdentify(str);
        String str2 = eeq.d(1) + eeq.d(0);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        this.q.c(deviceCommand);
        ReleaseLogUtil.d("R_HwAlarmManager", "getDeviceEventAlarm finish.");
        synchronized (k()) {
            f40916b.clear();
            f40916b.add(iBaseResponseCallback);
        }
    }

    public void b(String str, IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(8);
        deviceCommand.setCommandID(4);
        deviceCommand.setmIdentify(str);
        String str2 = eeq.d(1) + eeq.d(0);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        this.q.c(deviceCommand);
        ReleaseLogUtil.d("R_HwAlarmManager", "getDeviceSmartAlarm finish.");
        synchronized (l()) {
            f40917c.clear();
            f40917c.add(iBaseResponseCallback);
        }
    }

    public List<EventAlarmInfo> a(Object obj) {
        ArrayList arrayList = new ArrayList(16);
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() > 4) {
                String strSubstring = str.substring(4, str.length());
                ReleaseLogUtil.d("R_HwAlarmManager", "commandHex , ", strSubstring);
                try {
                    for (ees eesVar : this.s.b(strSubstring).b()) {
                        LogUtil.a("HwAlarmManager", "tlvFatherInfos ", Integer.valueOf(eesVar.b().size()));
                        d(arrayList, eesVar);
                    }
                } catch (eeu e2) {
                    LogUtil.e("HwAlarmManager", "COMMAND_ID_GET_DATE error tlvException ", e2);
                }
            }
        }
        return arrayList;
    }

    private void d(List<EventAlarmInfo> list, ees eesVar) {
        for (ees eesVar2 : eesVar.b()) {
            EventAlarmInfo eventAlarmInfo = new EventAlarmInfo();
            for (eew eewVar : eesVar2.e()) {
                switch (CommonUtil.b(eewVar.e(), 16)) {
                    case 3:
                        eventAlarmInfo.setEventAlarmIndex(c(eewVar.b()));
                        break;
                    case 4:
                        eventAlarmInfo.setEventAlarmEnable(c(eewVar.b()));
                        break;
                    case 5:
                        String strB = eewVar.b();
                        if (strB.length() >= 0 && strB.length() >= 2 && strB.length() >= 4) {
                            eventAlarmInfo.setEventAlarmStartTimeHour(c(strB.substring(0, 2)));
                            eventAlarmInfo.setEventAlarmStartTimeMins(c(strB.substring(2, 4)));
                        } else {
                            LogUtil.j("HwAlarmManager", "setEventTlvFatherInfo valueString timeIndex outOfBounds");
                        }
                        break;
                    case 6:
                        eventAlarmInfo.setEventAlarmRepeat(c(eewVar.b()));
                        break;
                    case 7:
                        eventAlarmInfo.setEventAlarmName(eeq.d(eewVar.b()));
                        break;
                    case 8:
                        eventAlarmInfo.setEventAlarmLegalHolidayEnable(c(eewVar.b()));
                        break;
                    case 9:
                        eventAlarmInfo.setCreateTimestamp(CommonUtil.x(eewVar.b()));
                        break;
                    case 10:
                        eventAlarmInfo.setModifiedTimestamp(CommonUtil.x(eewVar.b()));
                        break;
                    default:
                        LogUtil.a("HwAlarmManager", "setEventTlvFatherInfo unKnow type");
                        break;
                }
            }
            if (eesVar2.e().size() >= 2) {
                list.add(eventAlarmInfo);
                ReleaseLogUtil.d("R_HwAlarmManager", "eventAlarmInfo ", eventAlarmInfo.toString());
            } else {
                LogUtil.a("HwAlarmManager", "add eventAlarmInfo failed");
            }
        }
        LogUtil.a("HwAlarmManager", "eventAlarmInfos ", Integer.valueOf(list.size()));
    }

    private int c(String str) {
        try {
            return Integer.parseInt(str, 16);
        } catch (NumberFormatException e2) {
            LogUtil.a("HwAlarmManager", e2.getMessage());
            return 0;
        }
    }

    public List<SmartAlarmInfo> c(Object obj) {
        ArrayList arrayList = new ArrayList(16);
        String str = obj instanceof String ? (String) obj : null;
        if (str != null && str.length() > 4) {
            String strSubstring = str.substring(4, str.length());
            ReleaseLogUtil.d("R_HwAlarmManager", "commandHex ", strSubstring);
            try {
                for (ees eesVar : this.s.b(strSubstring).b()) {
                    LogUtil.a("HwAlarmManager", "tlvFatherInfos ", Integer.valueOf(eesVar.b().size()));
                    c(arrayList, eesVar);
                }
            } catch (eeu e2) {
                LogUtil.e("HwAlarmManager", "COMMAND_ID_GET_DATE error tlvException ", e2);
            }
        }
        return arrayList;
    }

    private void c(List<SmartAlarmInfo> list, ees eesVar) {
        char c2;
        Iterator<ees> it = eesVar.b().iterator();
        while (it.hasNext()) {
            char c3 = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (eew eewVar : it.next().e()) {
                try {
                    int i6 = Integer.parseInt(eewVar.e(), 16);
                    if (i6 == 3) {
                        c2 = c3;
                        i3 = Integer.parseInt(eewVar.b(), 16);
                    } else if (i6 == 4) {
                        c2 = c3;
                        i4 = Integer.parseInt(eewVar.b(), 16);
                    } else if (i6 == 5) {
                        String strB = eewVar.b();
                        if (strB.length() >= 0 && strB.length() >= 2 && strB.length() >= 4) {
                            i2 = Integer.parseInt(strB.substring(0, 2), 16);
                            i = Integer.parseInt(strB.substring(2, 4), 16);
                            c3 = 0;
                        } else {
                            Object[] objArr = new Object[1];
                            c2 = 0;
                            try {
                                objArr[0] = "setSmartAlarmTlvFatherInfo valueString timeIndex OutOfBounds";
                                LogUtil.j("HwAlarmManager", objArr);
                            } catch (NumberFormatException e2) {
                                e = e2;
                                LogUtil.a("HwAlarmManager", "setSmartAlarmTlvFatherInfo NumberFormatException", e.getMessage());
                            }
                        }
                    } else {
                        if (i6 == 6) {
                            i5 = Integer.parseInt(eewVar.b(), 16);
                            c3 = 0;
                        } else if (i6 == 7) {
                            try {
                                SmartAlarmInfo smartAlarmInfoB = b(i3, i4, i2, i, i5);
                                smartAlarmInfoB.setSmartAlarmAheadTime(Integer.parseInt(eewVar.b(), 16));
                                try {
                                    list.add(smartAlarmInfoB);
                                    LogUtil.a("HwAlarmManager", "smartAlarmInfo ", smartAlarmInfoB.toString());
                                    c2 = 0;
                                } catch (NumberFormatException e3) {
                                    e = e3;
                                    c2 = 0;
                                    LogUtil.a("HwAlarmManager", "setSmartAlarmTlvFatherInfo NumberFormatException", e.getMessage());
                                }
                            } catch (NumberFormatException e4) {
                                e = e4;
                            }
                        } else {
                            Object[] objArr2 = new Object[1];
                            objArr2[c3] = "setSmartAlarmTlvFatherInfo unKnow type";
                            LogUtil.a("HwAlarmManager", objArr2);
                            c2 = c3;
                        }
                        LogUtil.a("HwAlarmManager", "setSmartAlarmTlvFatherInfo NumberFormatException", e.getMessage());
                    }
                } catch (NumberFormatException e5) {
                    e = e5;
                    c2 = c3;
                }
                c3 = c2;
            }
        }
        LogUtil.a("HwAlarmManager", "msmartAlarmInfoList ", Integer.valueOf(list.size()));
    }

    public void a(int i) {
        this.i = i;
    }

    public int j() {
        return this.i;
    }

    private void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwAlarmManager", "parseAlarmNumberData id is empty.");
            return;
        }
        if (str2 == null) {
            this.i = 5;
            LogUtil.j("HwAlarmManager", "alarmNumber is default value.");
            return;
        }
        LogUtil.a("HwAlarmManager", "configData: ", str2);
        try {
            List<eew> listE = new eet().b(str2).e();
            if (ListUtil.isEmpty(listE)) {
                LogUtil.j("HwAlarmManager", "parseAlarmNumberData tlvList is empty.");
                return;
            }
            for (eew eewVar : listE) {
                if (CommonUtil.v(eewVar.e()) == 1) {
                    int iV = CommonUtil.v(eewVar.b());
                    this.i = iV;
                    ReleaseLogUtil.d("R_HwAlarmManager", "parseAlarmNumberData AlarmMaxNumber is ", Integer.valueOf(iV));
                } else {
                    LogUtil.j("HwAlarmManager", "parseAlarmNumberData default branches.");
                }
            }
        } catch (eeu e2) {
            LogUtil.e("HwAlarmManager", "parseAlarmNumberData tlvException: ", ExceptionUtils.c(e2));
        } catch (NumberFormatException e3) {
            LogUtil.e("HwAlarmManager", "parseAlarmNumberData numberFormatException: ", ExceptionUtils.c(e3));
        }
    }

    private SmartAlarmInfo b(int i, int i2, int i3, int i4, int i5) {
        SmartAlarmInfo smartAlarmInfo = new SmartAlarmInfo();
        smartAlarmInfo.setSmartAlarmIndex(i);
        smartAlarmInfo.setSmartAlarmEnable(i2);
        smartAlarmInfo.setSmartAlarmStartTimeHour(i3);
        smartAlarmInfo.setSmartAlarmStartTimeMins(i4);
        smartAlarmInfo.setSmartAlarmRepeat(i5);
        return smartAlarmInfo;
    }

    public void a(String str) {
        LogUtil.a("HwAlarmManager", "commandHex ", str);
        if (str == null || str.length() < 8) {
            LogUtil.j("HwAlarmManager", "hex is null or hex.length less than eight.");
            return;
        }
        int iC = c(str.substring(8, str.length()));
        if (iC == 1) {
            this.o = 0;
            h();
        } else {
            if (iC == 2 || iC == 3) {
                return;
            }
            LogUtil.a("HwAlarmManager", "smartAlarmPut unKnow Type");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        DeviceInfo deviceInfoC = mgg.c("HwAlarmManager");
        if (deviceInfoC != null) {
            this.t.getSwitchSetting("intelligent_home_linkage", deviceInfoC.getDeviceIdentify(), new IBaseResponseCallback() { // from class: lvv.12
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HwAlarmManager", "activeTransDeviceData errorCode = ", Integer.valueOf(i));
                    if (i == 0 && (obj instanceof String)) {
                        lvv.this.e((String) obj);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (str.contains(com.huawei.openalliance.ad.constant.Constants.PARAM_SERVER_SPLIT)) {
            String[] strArrSplit = str.split(com.huawei.openalliance.ad.constant.Constants.PARAM_SERVER_SPLIT);
            LogUtil.a("HwAlarmManager", "INTELLIGENT_HOME_LINKAGE new splits ", Integer.valueOf(strArrSplit.length));
            if (strArrSplit.length == 5) {
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = strArrSplit[2];
                String str5 = strArrSplit[3];
                String str6 = strArrSplit[4];
                LogUtil.a("HwAlarmManager", "checkDevidIsPermanent devId: ", str2, " expiresIn: ", str3, " proId: ", str4, " enable: ", str5, " isClick: ", str6);
                if (Boolean.parseBoolean(str5) && Boolean.parseBoolean(str6)) {
                    j(str2);
                }
            }
        }
    }

    private void j(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        this.r.sendMessage(messageObtain, 60000L);
        lxe.a(this.n).d("sleep", "2", str, new FitnessCloudCallBack() { // from class: lvv.2
            @Override // com.huawei.callback.FitnessCloudCallBack
            public void onResponce(Object obj) {
                if (obj != null) {
                    if (((TransferDeviceDataResponse) obj).getResultCode().intValue() == 0) {
                        LogUtil.a("HwAlarmManager", "transDeviceData is success");
                        lvv.this.r.removeMessages(7);
                    } else {
                        LogUtil.a("HwAlarmManager", "transDeviceData is fail");
                    }
                }
            }
        });
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090019.value(), new HashMap(16), 0);
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        try {
            i();
            this.n.unregisterReceiver(this.k);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HwAlarmManager", "mConnectStateChangedReceiver is not registered");
        }
        ExtendHandler extendHandler = this.r;
        if (extendHandler != null) {
            extendHandler.quit(false);
            this.r = null;
        }
        p();
        LogUtil.a("HwAlarmManager", "onDestroy()");
    }

    private static void i() {
        synchronized (d) {
            g = null;
        }
        synchronized (n()) {
            j.clear();
        }
        synchronized (o()) {
            h.clear();
        }
        synchronized (k()) {
            f40916b.clear();
        }
        synchronized (l()) {
            f40917c.clear();
        }
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.a("HwAlarmManager", "Alarm manager receive data ", eeq.e(bArr));
        c(bArr);
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        ReleaseLogUtil.d("R_HwAlarmManager", "onDataReceived: ", Integer.valueOf(i));
        if (deviceInfo == null || e(eecVar)) {
            LogUtil.j("HwAlarmManager", "device is null or isCheckSampleError.");
            return;
        }
        if (eecVar instanceof eef) {
            List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
            if (configInfoList == null || configInfoList.size() == 0) {
                LogUtil.j("HwAlarmManager", "onDataReceived sampleConfigInfoList empty.");
                return;
            }
            eeg eegVar = configInfoList.get(0);
            LogUtil.a("HwAlarmManager", "onDataReceived configAction", Integer.valueOf(eegVar.d()));
            if (eegVar.d() == 2) {
                e(deviceInfo.getDeviceIdentify(), eeq.e(eegVar.e()));
            }
        }
    }

    class b implements Handler.Callback {
        private b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                LogUtil.a("HwAlarmManager", "INSERT_EVENT_ALARM");
                final lvz lvzVar = (lvz) message.obj;
                synchronized (lvv.e) {
                    List<EventAlarmInfo> list = (List) lvzVar.b();
                    Iterator<EventAlarmInfo> it = list.iterator();
                    while (it.hasNext()) {
                        LogUtil.a("HwAlarmManager", "INSERT_EVENT_ALARM eventAlarmInfos ", it.next().toString());
                    }
                    lvv.this.e(list, new IBaseResponseCallback() { // from class: lvv.b.4
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i, Object obj) {
                            LogUtil.a("HwAlarmManager", "migrateEventAlarm1 errorCode ", Integer.valueOf(i));
                            if (lvzVar.a() == null) {
                                LogUtil.a("HwAlarmManager", "migrateEventAlarm1 callback is null ");
                                return;
                            }
                            LogUtil.a("HwAlarmManager", "alarmObject ", lvzVar);
                            if (i == 0) {
                                lvzVar.a().a(0, 100000);
                            } else {
                                lvzVar.a().a(-1, 108001);
                            }
                        }
                    });
                }
                return true;
            }
            return a(message);
        }

        private boolean a(Message message) {
            int i = message.what;
            if (i == 2) {
                LogUtil.a("HwAlarmManager", "DELETE_EVENT_ALARM");
                List<EventAlarmInfo> list = (List) message.obj;
                Iterator<EventAlarmInfo> it = list.iterator();
                while (it.hasNext()) {
                    LogUtil.a("HwAlarmManager", "DELETE_EVENT_ALARM eventAlarmInfos ", it.next().toString());
                }
                lvv.this.e(list, (IBaseResponseCallback) null);
                return true;
            }
            if (i == 3) {
                LogUtil.a("HwAlarmManager", "GET_EVENT_ALARM");
                if (message.obj instanceof IBaseResponseCallback) {
                    final IBaseResponseCallback iBaseResponseCallback = (IBaseResponseCallback) message.obj;
                    synchronized (lvv.e) {
                        lvv.this.b(new IBaseResponseCallback() { // from class: lvv.b.5
                            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                            /* JADX INFO: renamed from: onResponse */
                            public void a(int i2, Object obj) {
                                LogUtil.a("HwAlarmManager", "GET_EVENT_ALARM getEventAlarm errCode ", Integer.valueOf(i2));
                                Object arrayList = new ArrayList(16);
                                if (i2 == 0 && (obj instanceof List)) {
                                    arrayList = (List) obj;
                                }
                                iBaseResponseCallback.a(0, arrayList);
                            }
                        });
                    }
                } else {
                    LogUtil.j("HwAlarmManager", "message.obj not instanceof IBaseResponseCallback");
                }
                return true;
            }
            return e(message);
        }

        private boolean e(Message message) {
            int i = message.what;
            if (i == 4) {
                LogUtil.a("HwAlarmManager", "INSERT_SMART_ALARM");
                c(message);
                return true;
            }
            if (i == 7) {
                LogUtil.a("HwAlarmManager", "GET_SMART_TIMEOUT");
                if (lvv.this.r != null) {
                    lvv.this.r.removeMessages(7);
                }
                lvv.a(lvv.this);
                LogUtil.a("HwAlarmManager", "mConnected ", Integer.valueOf(lvv.this.o));
                if (lvv.this.o < 3) {
                    lvv.this.h();
                }
                return true;
            }
            return d(message);
        }

        private void c(Message message) {
            if (message.obj instanceof lvz) {
                final lvz lvzVar = (lvz) message.obj;
                if (lvzVar.b() instanceof List) {
                    List<SmartAlarmInfo> list = (List) lvzVar.b();
                    Iterator<SmartAlarmInfo> it = list.iterator();
                    while (it.hasNext()) {
                        LogUtil.a("HwAlarmManager", "INSERT_SMART_ALARM smartAlarmInfoList ", it.next().toString());
                    }
                    lvv.this.a(list, new IBaseResponseCallback() { // from class: lvv.b.3
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i, Object obj) {
                            LogUtil.a("HwAlarmManager", "migrateSmartAlarm1 errorCode ", Integer.valueOf(i));
                            if (lvzVar.a() == null) {
                                LogUtil.j("HwAlarmManager", "migrateSmartAlarm1 callback is null ");
                                return;
                            }
                            LogUtil.a("HwAlarmManager", "alarmObject ", lvzVar);
                            if (i == 0) {
                                lvzVar.a().a(0, 100000);
                            } else {
                                lvzVar.a().a(-1, 108001);
                            }
                        }
                    });
                    return;
                }
                LogUtil.j("HwAlarmManager", "alarmObject.getObject() not instanceof List<?>");
                return;
            }
            LogUtil.j("HwAlarmManager", "message.obj not instanceof AlarmObject");
        }

        private boolean d(Message message) {
            int i = message.what;
            if (i == 5) {
                LogUtil.a("HwAlarmManager", "DELETE_SMART_ALARM");
                List<SmartAlarmInfo> list = (List) message.obj;
                Iterator<SmartAlarmInfo> it = list.iterator();
                while (it.hasNext()) {
                    LogUtil.a("HwAlarmManager", "DELETE_SMART_ALARM eventAlarmInfos ", it.next().toString());
                }
                lvv.this.a(list, (IBaseResponseCallback) null);
                return true;
            }
            if (i == 6) {
                LogUtil.a("HwAlarmManager", "GET_SMART_ALARM");
                if (message.obj instanceof IBaseResponseCallback) {
                    final IBaseResponseCallback iBaseResponseCallback = (IBaseResponseCallback) message.obj;
                    lvv.this.a(new IBaseResponseCallback() { // from class: lvv.b.2
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i2, Object obj) {
                            LogUtil.a("HwAlarmManager", "getSmartAlarm errorCode = ", Integer.valueOf(i2));
                            List arrayList = new ArrayList(16);
                            if (i2 == 0 && (obj instanceof List)) {
                                arrayList = (List) obj;
                            }
                            if (arrayList.size() == 0) {
                                LogUtil.a("HwAlarmManager", "get smartAlart cursor is null");
                                iBaseResponseCallback.a(0, arrayList);
                            }
                        }
                    });
                } else {
                    LogUtil.j("HwAlarmManager", "message.obj not instanceof IBaseResponseCallback");
                }
                return true;
            }
            LogUtil.a("HwAlarmManager", "processingThirdMessage unKnow type");
            return false;
        }
    }

    public void b(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwAlarmManager", "getEventAlarmInfos callback isNull:", Boolean.valueOf(iBaseResponseCallback == null));
        if (iBaseResponseCallback == null) {
            return;
        }
        mhs.a().getSwitchSetting("custom.wear_event_alarm", new IBaseResponseCallback() { // from class: lvv.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                List<EventAlarmInfo> arrayList = new ArrayList<>(16);
                if (i == 0 && (obj instanceof String)) {
                    try {
                        List<EventAlarmInfo> list = (List) new Gson().fromJson((String) obj, new TypeToken<List<EventAlarmInfo>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwalarmmgr.HwAlarmManager$11$1
                        }.getType());
                        try {
                            for (int size = list.size() - 1; size >= 0; size--) {
                                if (list.get(size) == null) {
                                    list.remove(size);
                                }
                            }
                            iBaseResponseCallback.a(0, list);
                        } catch (Exception unused) {
                            arrayList = list;
                            iBaseResponseCallback.a(100001, arrayList);
                            lvv.this.b(arrayList, (IBaseResponseCallback) null, false);
                            LogUtil.e("HwAlarmManager", "getEventAlarmInfos JsonSyntaxException");
                        }
                    } catch (Exception unused2) {
                    }
                } else {
                    iBaseResponseCallback.a(100001, arrayList);
                }
            }
        });
    }

    public void b(String str) {
        SharedPreferenceManager.e(this.n, String.valueOf(10022), "kStorage_AlarmMgr_MAC", str, new StorageParams());
    }

    public void e(final List<EventAlarmInfo> list, final IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.e("R_HwAlarmManager", "setEventAlarmInfos eventAlarmInfoList isNull:", Boolean.valueOf(list == null));
        if (list == null) {
            return;
        }
        mhs.a().setSwitchSetting("custom.wear_event_alarm", new Gson().toJson(list), new IBaseResponseCallback() { // from class: lvv.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(i, list);
                }
            }
        });
    }

    public void a(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwAlarmManager", "getSmartAlarmInfos callback isNull:", Boolean.valueOf(iBaseResponseCallback == null));
        if (iBaseResponseCallback == null) {
            return;
        }
        mhs.a().getSwitchSetting("custom.wear_smart_alarm", new IBaseResponseCallback() { // from class: lvv.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                List arrayList = new ArrayList(16);
                if (i == 0 && (obj instanceof String)) {
                    try {
                        arrayList = (List) new Gson().fromJson((String) obj, new TypeToken<List<SmartAlarmInfo>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwalarmmgr.HwAlarmManager$13$1
                        }.getType());
                    } catch (JsonSyntaxException unused) {
                        iBaseResponseCallback.a(100001, arrayList);
                        LogUtil.e("HwAlarmManager", "getSmartAlarmInfos JsonSyntaxException");
                        return;
                    } catch (NullPointerException e2) {
                        LogUtil.e("HwAlarmManager", "getSmartAlarmInfos fromJson NullPointerException: ", e2.getMessage());
                    }
                    iBaseResponseCallback.a(0, arrayList);
                    return;
                }
                iBaseResponseCallback.a(100001, arrayList);
            }
        });
    }

    public void a(List<SmartAlarmInfo> list, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.j("HwAlarmManager", "setSmartAlarmInfos smartAlarmInfoList isNull:", Boolean.valueOf(list == null));
        if (list == null) {
            return;
        }
        final String json = new Gson().toJson(list);
        mhs.a().setSwitchSetting("custom.wear_smart_alarm", json, new IBaseResponseCallback() { // from class: lvv.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(i, json);
                }
            }
        });
    }

    private void q() {
        edc.e().registerDeviceSampleListener("hw.uniedevice.getAlarmsNumber", this);
    }

    private void p() {
        edc.e().unRegisterDeviceSampleListener("hw.uniedevice.getAlarmsNumber");
    }

    private eef t() {
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.uniedevice.getAlarmsNumber");
        eefVar.setWearPkgName("getAlarmsNumber");
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(900100015L);
        eegVar.b(2);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }

    public boolean b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwAlarmManager", "sendAlarmNumberCommand, deviceInfo is null.");
            return false;
        }
        if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("HwAlarmManager", "sendAlarmNumberCommand, device is not connected.");
            return false;
        }
        q();
        boolean zSendSampleConfigCommand = edc.e().sendSampleConfigCommand(deviceInfo, t(), "HwAlarmManager");
        LogUtil.j("HwAlarmManager", "isSendSuccess is: ", Boolean.valueOf(zSendSampleConfigCommand));
        return zSendSampleConfigCommand;
    }

    private boolean e(eec eecVar) {
        if (eecVar != null) {
            return (eecVar.getCommandId() == 1 && "getAlarmsNumber".equals(eecVar.getSrcPkgName()) && "hw.uniedevice.getAlarmsNumber".equals(eecVar.getWearPkgName())) ? false : true;
        }
        LogUtil.a("HwAlarmManager", "sampleBase is null.");
        return true;
    }

    public void b(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) HandleIntentService.class);
        intent.setAction("com.huawei.health.ACTION_NOTIFICATION_CLOCK_STATE");
        Bundle bundle = new Bundle();
        bundle.putString("clockStateType", "0");
        bundle.putBoolean("clockStateValue", z);
        intent.putExtras(bundle);
        context.startService(intent);
        ReleaseLogUtil.d("R_HwAlarmManager", "sendSyncRemindChangeBroadcast success.");
    }

    public boolean f() {
        PackageInfo packageInfo;
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        try {
            if (MagicBuild.f36615a) {
                packageInfo = packageManager.getPackageInfo("com.hihonor.synergy", 128);
            } else {
                packageInfo = packageManager.getPackageInfo("com.huawei.synergy", 128);
            }
            if (packageInfo == null) {
                ReleaseLogUtil.e("R_HwAlarmManager", "isMiddleWearSupportHealth packageInfo is null");
                return false;
            }
            String str = packageInfo.versionName;
            ReleaseLogUtil.d("R_HwAlarmManager", "deviceVersion is,", str);
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length < 4) {
                return false;
            }
            boolean z = CommonUtils.j(strArrSplit[0]) == 14 && CommonUtils.j(strArrSplit[1]) == 0;
            boolean z2 = CommonUtils.j(strArrSplit[0]) == 14 && CommonUtils.j(strArrSplit[1]) == 1;
            boolean z3 = CommonUtils.j(strArrSplit[0]) == 14 && CommonUtils.j(strArrSplit[1]) >= 2;
            if (z) {
                return CommonUtils.j(strArrSplit[3]) >= 11;
            }
            if (z2) {
                return CommonUtils.j(strArrSplit[3]) >= 2;
            }
            return z3 && CommonUtils.j(strArrSplit[3]) >= 1;
        } catch (PackageManager.NameNotFoundException unused) {
            ReleaseLogUtil.a("R_HwAlarmManager", "isMiddleWearSupportHealth not exist");
            return false;
        }
    }
}
