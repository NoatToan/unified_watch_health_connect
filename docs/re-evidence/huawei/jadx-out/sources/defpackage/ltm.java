package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.coresleepresult.HwCoreSleepDataProvider;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.algorithm.callback.IBluetoothResponseCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.hiai.awareness.client.AwarenessRequest;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.ThermalCallback;
import com.huawei.hwcoresleepmgr.SyncBaseFunction;
import com.huawei.hwcoresleepmgr.datatype.NotificationData;
import com.huawei.hwcoresleepmgr.datatype.TruSleepLastSyncTime;
import com.huawei.hwcoresleepmgr.datatype.TruSleepUpgTime;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.operation.jsoperation.JsUtil;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import com.huawei.syncmgr.SyncMode;
import com.huawei.syncmgr.SyncOption;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes10.dex */
public class ltm extends HwBaseManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ltm f40789b;
    private static final Object d = new Object();
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f40790a;
    private List<ciq> aa;
    private long ab;
    private List<ciu> ac;
    private List<civ> ad;
    private long ae;
    private b af;
    private Timer ag;
    private final Object ah;
    private SyncBaseFunction ai;
    private IBaseResponseCallback aj;
    private IBaseResponseCallback ak;
    private ThreadPoolManager am;
    private final Object an;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<IBaseResponseCallback> f40791c;
    private final BroadcastReceiver f;
    private long g;
    private final Object h;
    private long i;
    private Context j;
    private String k;
    private ltl l;
    private int m;
    private int n;
    private int o;
    private ExtendHandler p;
    private Map<String, Boolean> q;
    private final BroadcastReceiver r;
    private boolean s;
    private boolean t;
    private boolean u;
    private SyncOption v;
    private boolean w;
    private long x;
    private boolean y;
    private long z;

    private ltm(Context context, SyncBaseFunction syncBaseFunction) {
        super(context);
        this.aj = null;
        this.f40790a = null;
        this.ak = null;
        this.an = new Object();
        this.w = false;
        this.o = 0;
        this.g = 0L;
        this.m = 0;
        this.ag = null;
        this.af = null;
        this.f40791c = new ArrayList(0);
        this.h = new Object();
        this.ab = 0L;
        this.x = 0L;
        this.q = new HashMap(10);
        this.ah = new Object();
        this.ae = 0L;
        this.s = false;
        this.v = null;
        this.y = false;
        this.u = false;
        this.z = 0L;
        this.i = 0L;
        this.f = new BroadcastReceiver() { // from class: ltm.5
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                LogUtil.a("HwCoreSleepManager", "mConnectStateChangedReceiver(): intent is ", intent.getAction());
                if (context2 == null) {
                    LogUtil.j("HwCoreSleepManager", "mConnectStateChangedReceiver context is null.");
                    return;
                }
                if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                    if (!(parcelableExtra instanceof DeviceInfo)) {
                        LogUtil.j("HwCoreSleepManager", "mConnectStateChangedReceiver(): cast error");
                        return;
                    }
                    DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                    if (deviceInfo.getRelationship() != null && "followed_relationship".equals(deviceInfo.getRelationship())) {
                        LogUtil.j("HwCoreSleepManager", "This device does not have the correspond capability.");
                        return;
                    }
                    int deviceConnectState = deviceInfo.getDeviceConnectState();
                    LogUtil.a("HwCoreSleepManager", "mConnectStateChangedReceiver(): ", deviceInfo.getDeviceName(), ",state is ", Integer.valueOf(deviceConnectState));
                    if (deviceConnectState == 3) {
                        LogUtil.a("HwCoreSleepManager", "bt disconnect, mCoreSleepSyncFlag is ", Integer.valueOf(ltm.this.o));
                        ltm.this.b(deviceInfo, false);
                        ltm.this.d(21000, deviceConnectState);
                        ltm.this.d(30004, AwarenessRequest.MessageType.DISCONNECT);
                        if (ltm.this.o == 2) {
                            ltm.this.w = false;
                            ltm.this.n();
                            ltm.this.c(-1);
                            ltm.this.c(21000, "");
                        }
                    }
                }
            }
        };
        this.r = new BroadcastReceiver() { // from class: ltm.8
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                LogUtil.a("HwCoreSleepManager", "mEventNotifySleepSyncdReceiver(): intent is ", intent.getAction());
                if (context2 == null) {
                    LogUtil.j("HwCoreSleepManager", "mEventNotifySleepSyncdReceiver context is null.");
                } else if ("com.huawei.health.action.EVENT_NOFITY_SLEEP_SYNC".equals(intent.getAction())) {
                    long intExtra = intent.getIntExtra("lastDataTime", 0);
                    long j = 1000 * intExtra;
                    LogUtil.a("HwCoreSleepManager", "mEventNotifySleepSyncdReceiver lastDataTime: ", Long.valueOf(intExtra), " updateTime: ", Long.valueOf(j));
                    ltm.this.b(j);
                }
            }
        };
        this.j = BaseApplication.getContext();
        ltl ltlVarE = ltl.e();
        this.l = ltlVarE;
        this.ai = syncBaseFunction;
        ltlVarE.d(syncBaseFunction);
        this.am = ThreadPoolManager.d(1, 2);
        this.p = HandlerCenter.b(new a(), "HwCoreSleepManager");
        s();
        q();
    }

    public static ltm c(SyncBaseFunction syncBaseFunction) {
        ltm ltmVar;
        synchronized (d) {
            if (f40789b == null) {
                f40789b = new ltm(BaseApplication.getContext(), syncBaseFunction);
            }
            ltmVar = f40789b;
        }
        return ltmVar;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 30;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, String str) {
        IBaseResponseCallback iBaseResponseCallbackB = b();
        if (iBaseResponseCallbackB != null) {
            ReleaseLogUtil.d("HwCoreSleepManager", "setCoreSleepSyncRate sProgressListener is responding errCode=", Integer.valueOf(i));
            iBaseResponseCallbackB.a(i, "");
        }
        c(i, (Object) str);
        if (c() != null) {
            ReleaseLogUtil.d("HwCoreSleepManager", "setCoreSleepSyncRate sCoreSleepCallback is responding errCode=", Integer.valueOf(i));
            c().a(i, "");
            b(i, "");
        } else {
            ReleaseLogUtil.e("HwCoreSleepManager", "setCoreSleepSyncRate sCoreSleepCallback is null");
            d(i);
            b(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z, DeviceInfo deviceInfo) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("HwCoreSleepManager", "isNormalSync ", Boolean.valueOf(z), ", currTime ", Long.valueOf(jCurrentTimeMillis), ", mBeginSyncTime ", Long.valueOf(this.g), ",totalTime: ", 1200000L, " mCoreSleepSyncFlag: ", Integer.valueOf(this.o));
        if (jCurrentTimeMillis - this.g > 1200000) {
            a(z, deviceInfo);
            return;
        }
        int i = this.o;
        if (i == 1) {
            c(z, deviceInfo);
            d((IBaseResponseCallback) null);
            return;
        }
        if (i == -1) {
            n();
            if (z) {
                d(21004);
            } else {
                c(21004, VastAttribute.ERROR);
                d((IBaseResponseCallback) null);
            }
            d(21004, "save error.");
            b(deviceInfo, false);
            return;
        }
        if (i == 3) {
            n();
            if (z) {
                d(21006);
            } else {
                c(21006, VastAttribute.ERROR);
            }
            d(21006, "cpc error");
            b(deviceInfo, false);
            return;
        }
        if (i != 4) {
            LogUtil.j("HwCoreSleepManager", "Enter else");
            return;
        }
        int i2 = this.m + 2;
        this.m = i2;
        LogUtil.a("HwCoreSleepManager", "cpc progress :", Integer.valueOf(i2));
        if (c() != null && this.m > 100) {
            c().a(20000, Integer.valueOf(this.m));
            b(20000, Integer.valueOf(this.m));
            b(this.m);
        } else {
            int i3 = this.m;
            if (i3 <= 100) {
                LogUtil.j("HwCoreSleepManager", "process error.");
            } else {
                b(i3);
            }
        }
    }

    private void a(boolean z, DeviceInfo deviceInfo) {
        LogUtil.a("HwCoreSleepManager", "setCoreSleepSyncRate() timeout");
        IBaseResponseCallback iBaseResponseCallbackB = b();
        if (iBaseResponseCallbackB != null) {
            iBaseResponseCallbackB.a(21003, "");
        }
        n();
        this.o = -1;
        if (z) {
            d(21003);
        } else {
            c(21003, "timeout");
        }
        d(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "time out");
        b(deviceInfo, false);
        LogUtil.a("HwCoreSleepManager", "setCoreSleepSyncRate sync timeout");
    }

    private void c(boolean z, DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "rate is 100, isNormalSync is", Boolean.valueOf(z));
        if (!e() || !i()) {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "coreSleepSyncSuccess cancelTimer");
            n();
        }
        if (z) {
            r();
            b(-1);
        } else {
            c(0, "success");
        }
        d(0, "success");
        if (e()) {
            return;
        }
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "coreSleepSyncSuccess syncAll updateDeviceSyncingMap false");
        b(deviceInfo, false);
    }

    class a implements Handler.Callback {
        private a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            DeviceInfo deviceInfo = message.obj instanceof DeviceInfo ? (DeviceInfo) message.obj : null;
            int i = message.what;
            if (i == 0) {
                ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "sync core sleep timeout");
                ltm.this.a(deviceInfo);
                ltm.this.d(0, message.what);
                return true;
            }
            if (i == 1) {
                lti.c();
                ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "sync core sleep timeout : cpc timeout out.");
                ltm.this.a(deviceInfo);
                return true;
            }
            if (i == 2) {
                LogUtil.a("HwCoreSleepManager", "process update sync flag");
                ltm.this.o = 1;
                ltm.this.m = 0;
                String deviceUdid = "";
                if (deviceInfo != null) {
                    deviceUdid = deviceInfo.getDeviceUdid();
                }
                if (ltq.d(message, deviceUdid, ltm.this.ab, ltm.this.x) && (message.obj instanceof NotificationData)) {
                    ltm.this.b((NotificationData) message.obj);
                }
                return true;
            }
            if (i == 3) {
                LogUtil.a("HwCoreSleepManager", "sync from device success");
                if (ltm.this.o != 3) {
                    ltm.this.m = 100;
                    ltm.this.o = 4;
                    synchronized (ltm.this.an) {
                        if (ltm.this.af == null) {
                            LogUtil.j("HwCoreSleepManager", "have no time task");
                            ltm.this.d(message.getData().getBoolean("isNormalSync"), deviceInfo);
                        }
                    }
                    IBaseResponseCallback iBaseResponseCallbackC = ltm.this.c();
                    if (iBaseResponseCallbackC != null) {
                        LogUtil.a("HwCoreSleepManager", "report progress 100");
                        iBaseResponseCallbackC.a(20000, Integer.valueOf(ltm.this.m));
                    }
                    ltm ltmVar = ltm.this;
                    ltmVar.b(20000, Integer.valueOf(ltmVar.m));
                } else {
                    ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "cpc error，do nothing");
                }
                return true;
            }
            LogUtil.j("HwCoreSleepManager", "no support message : ", Integer.valueOf(message.what));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(NotificationData notificationData) {
        int iJ;
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "enter sendSleepBroadcast");
        String description = notificationData.getDescription();
        if (TextUtils.isEmpty(description)) {
            iJ = 0;
        } else {
            Matcher matcher = Pattern.compile("\\d+").matcher(description);
            StringBuffer stringBuffer = new StringBuffer(16);
            while (matcher.find()) {
                stringBuffer.append(matcher.group());
            }
            iJ = CommonUtil.j(stringBuffer.toString());
        }
        LogUtil.a("HwCoreSleepManager", "sendSleepBroadcast score is:", Integer.valueOf(iJ));
        long startTime = notificationData.getStartTime();
        long endTime = notificationData.getEndTime();
        Intent intent = new Intent("com.huawei.health.track.broadcast");
        intent.putExtra("fallAsleepTime", startTime);
        intent.putExtra("wakeTime", endTime);
        intent.putExtra(JsUtil.SCORE, iJ);
        intent.putExtra("command_type", "com.huawei.health.sync.coresleep");
        BroadcastManagerUtil.e(this.j, intent);
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "sendSleepBroadcast end");
    }

    private void e(List<ciu> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        long jA = 0;
        for (ciu ciuVar : list) {
            if (ciuVar != null && ciuVar.a() > jA) {
                jA = ciuVar.a();
            }
        }
        if (jA > 0) {
            LogUtil.a("HwCoreSleepManager", "checkFailLastTime success, update time.");
            b(jA);
        } else {
            LogUtil.j("HwCoreSleepManager", "wrong situation, please check json and code.");
        }
    }

    private void c(long j, int i) {
        if (i == 0 || i == 100) {
            return;
        }
        LogUtil.a("HwCoreSleepManager", "addCoreSleepToUpgrage enter, endTime=", Long.valueOf(j), ", errorCode=", Integer.valueOf(i));
        if (!lto.e(j, System.currentTimeMillis())) {
            LogUtil.j("HwCoreSleepManager", "addCoreSleepToUpgrage is not today.");
            return;
        }
        if (c(j)) {
            LogUtil.j("HwCoreSleepManager", "addCoreSleepToUpgrage has the endTime.");
            return;
        }
        lti.e(i);
        SyncBaseFunction syncBaseFunction = this.ai;
        if (syncBaseFunction != null) {
            syncBaseFunction.addOtaCoreSleepLog(i, j);
        }
        d(j);
    }

    private void d(long j) {
        String securityDeviceId;
        List list;
        LogUtil.a("HwCoreSleepManager", "enter saveUpgradeEndTime, endTime is ", Long.valueOf(j));
        String string = Long.toString(j);
        StorageParams storageParams = new StorageParams(1);
        DeviceInfo deviceInfo = this.ai.getDeviceInfo();
        if (deviceInfo == null) {
            securityDeviceId = "";
        } else {
            securityDeviceId = deviceInfo.getSecurityDeviceId();
        }
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        LogUtil.a("HwCoreSleepManager", "saveUpgradeEndTime keyID:", strC);
        Gson gson = new Gson();
        String sharedPreference = getSharedPreference("kStorage_CoreSleepMgr_Long_UpgTimes");
        LogUtil.d("HwCoreSleepManager", "saveUpgradeEndTime - get time is: ", sharedPreference);
        try {
            list = (List) gson.fromJson(sharedPreference, new TypeToken<List<TruSleepUpgTime>>() { // from class: com.huawei.hwcoresleepmgr.HwCoreSleepManager$3
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.e("HwCoreSleepManager", "saveUpgradeEndTime fromJson parse fail.");
            list = null;
        }
        if (list == null || list.isEmpty()) {
            a(strC, securityDeviceId, string, storageParams);
            return;
        }
        if (!b(list.iterator(), strC + securityDeviceId, string)) {
            TruSleepUpgTime truSleepUpgTime = new TruSleepUpgTime();
            truSleepUpgTime.setDeviceMac(strC + securityDeviceId);
            truSleepUpgTime.setLastUpgEndTime(string);
            list.add(truSleepUpgTime);
        }
        setSharedPreference("kStorage_CoreSleepMgr_Long_UpgTimes", new Gson().toJson(list), storageParams);
    }

    private void a(String str, String str2, String str3, StorageParams storageParams) {
        LogUtil.a("HwCoreSleepManager", "updateUpg sleepUpgTimeList is null.");
        ArrayList arrayList = new ArrayList(16);
        TruSleepUpgTime truSleepUpgTime = new TruSleepUpgTime();
        truSleepUpgTime.setDeviceMac(str + str2);
        truSleepUpgTime.setLastUpgEndTime(str3);
        arrayList.add(truSleepUpgTime);
        setSharedPreference("kStorage_CoreSleepMgr_Long_UpgTimes", new Gson().toJson(arrayList), storageParams);
    }

    private boolean b(Iterator<TruSleepUpgTime> it, String str, String str2) {
        boolean z = false;
        while (it.hasNext()) {
            TruSleepUpgTime next = it.next();
            if (str.equalsIgnoreCase(next.getDeviceMac())) {
                next.setLastUpgEndTime(str2);
                z = true;
            } else {
                LogUtil.j("HwCoreSleepManager", "no condition");
            }
            if (z) {
                break;
            }
        }
        return z;
    }

    private boolean c(long j) {
        String securityDeviceId;
        List<TruSleepUpgTime> list;
        LogUtil.a("HwCoreSleepManager", "enter isUpgradeEndTimeExist() endTime =", Long.valueOf(j));
        DeviceInfo deviceInfo = this.ai.getDeviceInfo();
        if (deviceInfo == null) {
            securityDeviceId = "";
        } else {
            securityDeviceId = deviceInfo.getSecurityDeviceId();
        }
        LogUtil.d("HwCoreSleepManager", "isUpgradeEndTimeExist currentDeviceMac is: ", BTDeviceMgrUtil.c().e(securityDeviceId));
        Gson gson = new Gson();
        String sharedPreference = getSharedPreference("kStorage_CoreSleepMgr_Long_UpgTimes");
        if (TextUtils.isEmpty(sharedPreference)) {
            LogUtil.a("HwCoreSleepManager", "isUpgradeEndTimeExist timeString is empty.");
            return false;
        }
        try {
            list = (List) gson.fromJson(sharedPreference, new TypeToken<List<TruSleepUpgTime>>() { // from class: com.huawei.hwcoresleepmgr.HwCoreSleepManager$4
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.e("HwCoreSleepManager", "upgTimeList fromJson parse fail.");
            list = null;
        }
        if (list == null || list.isEmpty()) {
            LogUtil.j("HwCoreSleepManager", "upgTimeList is empty!");
            return false;
        }
        LogUtil.a("HwCoreSleepManager", "upgTimeList: ", list.toString());
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        LogUtil.a("HwCoreSleepManager", "isUpgradeEndTimeExist keyID:", strC);
        String str = strC + securityDeviceId;
        for (TruSleepUpgTime truSleepUpgTime : list) {
            if (str.equalsIgnoreCase(truSleepUpgTime.getDeviceMac()) && truSleepUpgTime.getLastUpgEndTime().equalsIgnoreCase(Long.toString(j))) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        this.o = -1;
    }

    public void d(Message message) {
        message.what = 2;
        if (CommonUtil.ap()) {
            this.p.sendMessage(message);
        } else {
            this.p.sendMessage(message, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        LogUtil.j("HwCoreSleepManager", "handle sync error:", Integer.valueOf(i));
        this.o = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        LogUtil.j("HwCoreSleepManager", "enter mSyncTimer");
        synchronized (this.an) {
            b bVar = this.af;
            if (bVar != null) {
                bVar.cancel();
                this.af = null;
                LogUtil.j("HwCoreSleepManager", "sync timeout,task cancel");
            }
            Timer timer = this.ag;
            if (timer != null) {
                timer.cancel();
                this.ag = null;
                LogUtil.j("HwCoreSleepManager", "sync timeout,mSyncTimer cancel");
            }
        }
    }

    public void b(long j) {
        String securityDeviceId;
        List list;
        if (l()) {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "exit updateLastSyncTime ");
            return;
        }
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "enter updateLastSyncTime,time is ", Long.valueOf(j));
        StorageParams storageParams = new StorageParams();
        String string = Long.toString(j);
        DeviceInfo deviceInfo = this.ai.getDeviceInfo();
        if (deviceInfo == null) {
            securityDeviceId = "";
        } else {
            securityDeviceId = deviceInfo.getSecurityDeviceId();
        }
        LogUtil.d("HwCoreSleepManager", "currentDeviceMac is:", BTDeviceMgrUtil.c().e(securityDeviceId));
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        LogUtil.d("HwCoreSleepManager", "updateLastSyncTime keyId:", strC);
        Gson gson = new Gson();
        String sharedPreference = getSharedPreference("kStorage_CoreSleepMgr_Long_LastSyncTime");
        LogUtil.d("HwCoreSleepManager", "get timeStringFromSharedPreference is: ", sharedPreference);
        try {
            list = (List) gson.fromJson(sharedPreference, new TypeToken<List<TruSleepLastSyncTime>>() { // from class: com.huawei.hwcoresleepmgr.HwCoreSleepManager$5
            }.getType());
        } catch (JsonSyntaxException e2) {
            LogUtil.e("HwCoreSleepManager", "fromJson parse fail.", e2.getMessage());
            list = null;
        }
        if (list != null) {
            if (list.size() != 0) {
                LogUtil.d("HwCoreSleepManager", "lastSyncTimeList: ", list.toString());
                boolean zE = e(list.iterator(), strC + securityDeviceId, string);
                LogUtil.a("HwCoreSleepManager", "lastSyncTime isExist:", Boolean.valueOf(zE));
                if (!zE) {
                    TruSleepLastSyncTime truSleepLastSyncTime = new TruSleepLastSyncTime();
                    truSleepLastSyncTime.setDeviceMac(strC + securityDeviceId);
                    truSleepLastSyncTime.setLastSyncTime(string);
                    list.add(truSleepLastSyncTime);
                }
                setSharedPreference("kStorage_CoreSleepMgr_Long_LastSyncTime", new Gson().toJson(list), storageParams);
                return;
            }
            return;
        }
        c(strC, securityDeviceId, string, storageParams);
    }

    private boolean l() {
        return (!e() || eey.d(this.ai.getDeviceInfo(), 143) || this.y) ? false : true;
    }

    private boolean e(Iterator<TruSleepLastSyncTime> it, String str, String str2) {
        boolean z = false;
        while (it.hasNext()) {
            TruSleepLastSyncTime next = it.next();
            if (str.equalsIgnoreCase(next.getDeviceMac())) {
                next.setLastSyncTime(str2);
                z = true;
            } else {
                LogUtil.j("HwCoreSleepManager", "no condition");
            }
            if (z) {
                break;
            }
        }
        return z;
    }

    private void c(String str, String str2, String str3, StorageParams storageParams) {
        LogUtil.a("HwCoreSleepManager", "lastSyncTimeList is null.");
        ArrayList arrayList = new ArrayList(16);
        TruSleepLastSyncTime truSleepLastSyncTime = new TruSleepLastSyncTime();
        truSleepLastSyncTime.setDeviceMac(str + str2);
        truSleepLastSyncTime.setLastSyncTime(str3);
        arrayList.add(truSleepLastSyncTime);
        setSharedPreference("kStorage_CoreSleepMgr_Long_LastSyncTime", new Gson().toJson(arrayList), storageParams);
    }

    private long o() {
        String securityDeviceId;
        List<TruSleepLastSyncTime> list;
        LogUtil.a("HwCoreSleepManager", "enter getLastSyncTime()");
        DeviceInfo deviceInfo = this.ai.getDeviceInfo();
        if (deviceInfo == null) {
            securityDeviceId = "";
        } else {
            securityDeviceId = deviceInfo.getSecurityDeviceId();
        }
        LogUtil.d("HwCoreSleepManager", "currentDeviceMac is: ", BTDeviceMgrUtil.c().e(securityDeviceId));
        Gson gson = new Gson();
        String sharedPreference = getSharedPreference("kStorage_CoreSleepMgr_Long_LastSyncTime");
        long j = 0;
        if (TextUtils.isEmpty(sharedPreference)) {
            LogUtil.a("HwCoreSleepManager", "timeStringFromSharedPreference is empty.");
            return 0L;
        }
        try {
            list = (List) gson.fromJson(sharedPreference, new TypeToken<List<TruSleepLastSyncTime>>() { // from class: com.huawei.hwcoresleepmgr.HwCoreSleepManager$6
            }.getType());
        } catch (JsonSyntaxException e2) {
            LogUtil.e("HwCoreSleepManager", "fromJson parse fail : ", e2.getMessage());
            list = null;
        }
        if (list == null || list.size() == 0) {
            LogUtil.j("HwCoreSleepManager", "lastSyncTimeList is empty!");
            return 0L;
        }
        LogUtil.a("HwCoreSleepManager", "lastSyncTimeList: ", list.toString());
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        LogUtil.a("HwCoreSleepManager", "getLastSyncTime keyID:", strC);
        String str = strC + securityDeviceId;
        for (TruSleepLastSyncTime truSleepLastSyncTime : list) {
            if (str.equalsIgnoreCase(truSleepLastSyncTime.getDeviceMac())) {
                String lastSyncTime = truSleepLastSyncTime.getLastSyncTime();
                LogUtil.a("HwCoreSleepManager", "getLastCoreSleepSyncTime timeString is ", lastSyncTime);
                if (lastSyncTime != null && !lastSyncTime.isEmpty()) {
                    try {
                        j = Long.parseLong(lastSyncTime);
                        break;
                    } catch (NumberFormatException unused) {
                        LogUtil.e("HwCoreSleepManager", "getLastCoreSleepSyncTime exception");
                    }
                }
            }
        }
        LogUtil.a("HwCoreSleepManager", "getLastCoreSleepSyncTime lastTimeStamp is ", Long.valueOf(j));
        return j;
    }

    private void b(SyncOption syncOption, IBaseResponseCallback iBaseResponseCallback, DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "enter startSyncCoreSleepAuto");
        if (!e(syncOption, deviceInfo)) {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startSyncCoreSleepAuto false");
            b(deviceInfo, false);
            c(21005, "isSupportSyncAuto false");
            return;
        }
        boolean zD = eey.d(deviceInfo, 143);
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "isSupportAlgorithmDown ", Boolean.valueOf(zD), Boolean.valueOf(e(syncOption)), "hasUpgradeTime ", Boolean.valueOf(e(syncOption)));
        if (zD && !e(syncOption)) {
            if (e()) {
                b(deviceInfo, syncOption, iBaseResponseCallback);
                return;
            } else {
                a(deviceInfo, syncOption, iBaseResponseCallback);
                return;
            }
        }
        a(iBaseResponseCallback);
        if (e()) {
            c(deviceInfo, syncOption, true, iBaseResponseCallback);
        } else {
            a(deviceInfo, syncOption, true, iBaseResponseCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, Object obj) {
        synchronized (e) {
            if (this.ak != null) {
                LogUtil.a("HwCoreSleepManager", "syncResultToUiCallback errorCode", Integer.valueOf(i));
                this.ak.a(i, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (e) {
            this.ak = iBaseResponseCallback;
        }
    }

    private void a(SyncOption syncOption) {
        DeviceCapability deviceCapability = this.ai.getDeviceCapability(this.ai.getDeviceInfo());
        if (deviceCapability == null) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "wakeUpDevice deviceCapability is null.");
            return;
        }
        if (!deviceCapability.isSupportSendCoreSleepOutState()) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "not support wake up.");
            return;
        }
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "syncCoreSleepData isManualSync is ", Boolean.valueOf(syncOption.isManualSync()));
        if (syncOption.isManualSync()) {
            ltj.c(this.ai);
        }
    }

    private long a(long j, long j2) {
        if (j >= j2 && j - j2 <= 300) {
            LogUtil.a("HwCoreSleepManager", "future time : ", Long.valueOf(j));
            return j2 - 61;
        }
        if (j - j2 <= 300) {
            return j;
        }
        LogUtil.a("HwCoreSleepManager", "future time : ", Long.valueOf(j));
        long j3 = j2 - 61;
        b(j3);
        return j3;
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        DeviceInfo f40809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f40810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f40811c;
        IBaseResponseCallback d;
        long e;

        d(long j, long j2, IBaseResponseCallback iBaseResponseCallback, boolean z, DeviceInfo deviceInfo) {
            this.d = iBaseResponseCallback;
            this.e = j;
            this.f40810b = j2;
            this.f40811c = z;
            this.f40809a = deviceInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            ltm.this.b(this.e, this.f40810b, this.d, this.f40811c, this.f40809a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z, DeviceInfo deviceInfo) {
        synchronized (this.an) {
            b bVar = this.af;
            if (bVar != null) {
                bVar.cancel();
            }
            this.af = new b(z, deviceInfo);
            Timer timer = new Timer("HwCoreSleepManager");
            this.ag = timer;
            timer.schedule(this.af, 0L, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j, long j2, IBaseResponseCallback iBaseResponseCallback, boolean z, DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "enter syncCoreSleepDetailDataRun, isNormalSync:", Boolean.valueOf(z));
        this.o = 2;
        this.g = System.currentTimeMillis();
        synchronized (this.an) {
            try {
                b bVar = this.af;
                if (bVar != null) {
                    bVar.cancel();
                }
                this.af = new b(z, deviceInfo);
                Timer timer = new Timer("HwCoreSleepManager");
                this.ag = timer;
                timer.schedule(this.af, 0L, 2000L);
            } catch (Throwable th) {
                throw th;
            }
        }
        e(j, j2, iBaseResponseCallback, z, deviceInfo);
        this.p.removeMessages(0);
        Message messageObtain = Message.obtain();
        messageObtain.obj = deviceInfo;
        messageObtain.what = 0;
        this.p.sendMessage(messageObtain, 1200000L);
    }

    private void e(long j, long j2, final IBaseResponseCallback iBaseResponseCallback, final boolean z, final DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "enter sendCommand, startTime : ", Long.valueOf(j), ",endTime : ", Long.valueOf(j2));
        p();
        SyncBaseFunction syncBaseFunction = this.ai;
        if (syncBaseFunction != null) {
            syncBaseFunction.getSleepDataFromDevice(false, z, (int) j, (int) j2, new IBluetoothResponseCallback() { // from class: ltm.9
                @Override // com.huawei.health.algorithm.callback.IBluetoothResponseCallback
                public void onSuccess(int i, String str) throws Throwable {
                    ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "getSleepDataFromDevice onSuccess successCode: ", Integer.valueOf(i));
                    LogUtil.a("HwCoreSleepManager", "getSleepDataFromDevice onSuccess successMessage=", str);
                    if (CommonUtil.ap()) {
                        xjt.d("core sleep file sync is completed, sync duration: " + (System.currentTimeMillis() - ltm.this.ae));
                    }
                    ltm.this.e(str, i, iBaseResponseCallback, z, deviceInfo);
                }

                @Override // com.huawei.health.algorithm.callback.IBluetoothResponseCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "getSleepDataFromDevice onFailure errorCode: ", Integer.valueOf(i));
                    ltm.this.d(i, z, iBaseResponseCallback, deviceInfo);
                }

                @Override // com.huawei.health.algorithm.callback.IBluetoothResponseCallback
                public void onProgress(int i, String str) {
                    if (iBaseResponseCallback != null) {
                        LogUtil.a("HwCoreSleepManager", "getSleepDataFromDevice onProgress() progress: ", Integer.valueOf(i));
                        iBaseResponseCallback.a(20000, Integer.valueOf(i));
                        ltm.this.c(20000, Integer.valueOf(i));
                    }
                    ltm.this.b(i);
                }
            });
        } else {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "getSleepDataFromDevice mSyncBaseFunction is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, boolean z, IBaseResponseCallback iBaseResponseCallback, DeviceInfo deviceInfo) {
        if (i == 10002) {
            lti.e();
        }
        ExtendHandler extendHandler = this.p;
        if (extendHandler != null) {
            extendHandler.removeMessages(0);
            LogUtil.a("HwCoreSleepManager", "onFailure remove sync detail timeout.");
        }
        n();
        c(-1);
        if (z) {
            d(i);
        }
        d(-1, i);
        d(i, "device error");
        if (!e()) {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "handleOnFailure SyncAll updateDeviceSyncingMap");
            b(deviceInfo, false);
        } else if (i == 10000 || i == 10002) {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "handleOnFailure errorCode：", Integer.valueOf(i));
            if (this.y) {
                LogUtil.a("HwCoreSleepManager", "handleOnFailure startFileSyncBySecondStage no data");
                if (this.t) {
                    b(a());
                }
                b(deviceInfo, false);
                this.y = false;
            } else {
                LogUtil.a("HwCoreSleepManager", "handleOnFailure startFileSyncBySecondStage, first no data.");
                this.t = false;
                h();
            }
        } else {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "handleOnFailure SyncAll NeedSegment updateDeviceSyncingMap");
            b(deviceInfo, false);
        }
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i, null);
            c(i, (Object) null);
            m();
        }
    }

    private void d(int i, IBaseResponseCallback iBaseResponseCallback, boolean z, DeviceInfo deviceInfo) {
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, null);
            c(0, (Object) null);
            m();
        }
        if (z && this.p != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = deviceInfo;
            Bundle bundle = new Bundle();
            bundle.putBoolean("isNormalSync", true);
            messageObtain.setData(bundle);
            messageObtain.what = 3;
            this.p.sendMessage(messageObtain);
        }
        d(3, i);
    }

    private void b(ArrayList<byte[]> arrayList, ArrayList<byte[]> arrayList2, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "enter processCpcData");
        this.am.a("HwCoreSleepManager", new e(arrayList, arrayList2, iBaseResponseCallback));
    }

    class e implements Runnable {
        IBaseResponseCallback d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ArrayList<byte[]> f40813c = new ArrayList<>(16);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayList<byte[]> f40812a = new ArrayList<>(16);

        e(ArrayList<byte[]> arrayList, ArrayList<byte[]> arrayList2, IBaseResponseCallback iBaseResponseCallback) {
            this.d = iBaseResponseCallback;
            if (arrayList.size() > 0) {
                this.f40813c.addAll(arrayList);
            }
            if (arrayList2.size() > 0) {
                this.f40812a.addAll(arrayList2);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ltm.this.e(this.f40813c, this.f40812a, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ArrayList<byte[]> arrayList, ArrayList<byte[]> arrayList2, IBaseResponseCallback iBaseResponseCallback) {
        Thread.currentThread().setPriority(10);
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "enter processCpcDataRun.");
        new HwCoreSleepDataProvider().e(arrayList, arrayList2, iBaseResponseCallback);
    }

    class b extends TimerTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        DeviceInfo f40808b;
        boolean d;

        b(boolean z, DeviceInfo deviceInfo) {
            this.d = false;
            LogUtil.a("HwCoreSleepManager", "SyncTimerTask:", Boolean.valueOf(z));
            this.d = z;
            this.f40808b = deviceInfo;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            LogUtil.a("HwCoreSleepManager", "run.");
            ltm.this.b(this.d, this.f40808b);
        }
    }

    private void t() {
        LogUtil.a("HwCoreSleepManager", "registerDeviceToHiHealth");
        DeviceInfo deviceInfo = this.ai.getDeviceInfo();
        if (deviceInfo != null) {
            this.ai.registerHiHealthDataClient(deviceInfo);
        } else {
            ReleaseLogUtil.a("BTSYNC_CoreSleep_HwCoreSleepManager", "registerDeviceToHiHealth deviceInfo is null");
        }
    }

    public long d() {
        int iB;
        long jO = o();
        List<ciu> list = this.ac;
        if (list == null || list.size() == 0) {
            LogUtil.j("HwCoreSleepManager", "mSleepErrorFramesList size is 0,Can not update SyncTime");
        } else {
            for (ciu ciuVar : this.ac) {
                if (ciuVar.a() > jO && ((iB = ciuVar.b()) == 104 || iB == 215 || iB == 217 || iB == 237 || iB == 252)) {
                    jO = ciuVar.a();
                }
            }
            List<civ> list2 = this.ad;
            if (list2 == null || list2.size() == 0) {
                LogUtil.j("HwCoreSleepManager", "mSleepStatusFramesList size is 0,Can not update SyncTime");
            } else {
                List<ciq> list3 = this.aa;
                if (list3 == null || list3.size() == 0) {
                    if (b(this.ad)) {
                        LogUtil.j("HwCoreSleepManager", "mSleepCalcFramesList size is 0, Has Night Sleep, Can not update SyncTime");
                    } else {
                        for (civ civVar : this.ad) {
                            if (civVar.c() > jO) {
                                jO = civVar.c();
                            }
                        }
                        LogUtil.j("HwCoreSleepManager", "mSleepCalcFramesList size is 0,Can Only update noonSleep Time");
                    }
                } else {
                    for (civ civVar2 : this.ad) {
                        if (civVar2.c() > jO) {
                            jO = civVar2.c();
                        }
                    }
                    return jO + 60000;
                }
            }
        }
        return jO + 60000;
    }

    private boolean b(List<civ> list) {
        Iterator<civ> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b().get(0).intValue() != 5) {
                return true;
            }
        }
        return false;
    }

    private void p() {
        LogUtil.a("HwCoreSleepManager", "sendSyncStartBroadcast.");
        Intent intent = new Intent("com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_START");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        this.j.sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    private void r() {
        LogUtil.a("HwCoreSleepManager", "sendSyncSuccessBroadcast.");
        Intent intent = new Intent("com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_SUCCESS");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        this.j.sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    private void d(int i) {
        LogUtil.a("HwCoreSleepManager", "sendSyncFailBroadcast.error:", Integer.valueOf(i));
        Intent intent = new Intent("com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_FAILED");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        intent.putExtra("errorCode", i);
        this.j.sendBroadcast(intent, LocalBroadcast.f36595c);
        b(-1);
    }

    public boolean g() {
        return k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final int i, final int i2) {
        LogUtil.a("HwCoreSleepManager", "enter sendCoreSleepSyncEvent.state is ", Integer.valueOf(i), ",errorMessage is ", Integer.valueOf(i2));
        final DeviceInfo deviceInfo = this.ai.getDeviceInfo();
        ThreadPoolManager.c().execute(new Runnable() { // from class: ltm.7
            @Override // java.lang.Runnable
            public void run() {
                lti.e(i, i2, ltm.this.g, ltm.this.n, deviceInfo);
            }
        });
    }

    private void e(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (this.h) {
            this.f40791c.add(iBaseResponseCallback);
        }
    }

    private void m() {
        synchronized (this.h) {
            this.f40791c.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, Object obj) {
        synchronized (this.h) {
            if (!njy.e(this.f40791c)) {
                Iterator<IBaseResponseCallback> it = this.f40791c.iterator();
                while (it.hasNext()) {
                    it.next().a(i, obj);
                }
            }
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        n();
        if (k()) {
            c(-1);
            c(21005, "");
        }
        d(-1, "object destroy");
        this.q.clear();
        y();
        u();
        this.p.quit(false);
    }

    private void u() {
        try {
            this.j.unregisterReceiver(this.r);
        } catch (IllegalArgumentException e2) {
            LogUtil.e("HwCoreSleepManager", e2.getMessage());
        }
    }

    private void y() {
        try {
            this.j.unregisterReceiver(this.f);
        } catch (IllegalArgumentException e2) {
            LogUtil.e("HwCoreSleepManager", e2.getMessage());
        }
    }

    private void s() {
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(this.j, this.f, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void q() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.action.EVENT_NOFITY_SLEEP_SYNC");
        BroadcastManagerUtil.d(this.j, this.r, intentFilter, LocalBroadcast.f36595c, null);
    }

    public IBaseResponseCallback c() {
        return this.f40790a;
    }

    public void a(IBaseResponseCallback iBaseResponseCallback) {
        this.f40790a = iBaseResponseCallback;
    }

    private void e(SyncOption syncOption, IBaseResponseCallback iBaseResponseCallback, final DeviceInfo deviceInfo) {
        synchronized (this) {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "enter startSyncCoreSleepByUi");
            if (((VersionMgrApi) Services.b("HWVersionMgr", VersionMgrApi.class)).isDeviceOtaUpdating(deviceInfo.getDeviceIdentify())) {
                ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "startSyncCoreSleepByUi device is Otaing.");
                b(deviceInfo, false);
                iBaseResponseCallback.a(22000, "");
            } else if (eey.d(deviceInfo, 143)) {
                if (e()) {
                    b(deviceInfo, syncOption, iBaseResponseCallback);
                } else {
                    a(deviceInfo, syncOption, iBaseResponseCallback);
                }
            } else {
                a(iBaseResponseCallback);
                if (e()) {
                    c(deviceInfo, syncOption, false, new IBaseResponseCallback() { // from class: ltm.10
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i, Object obj) {
                            ltm.this.d(i, obj, deviceInfo);
                        }
                    });
                } else {
                    a(deviceInfo, syncOption, false, new IBaseResponseCallback() { // from class: ltm.2
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i, Object obj) {
                            ltm.this.d(i, obj, deviceInfo);
                        }
                    });
                }
            }
        }
    }

    private void b(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.j("HwCoreSleepManager", "busy,return");
        iBaseResponseCallback.a(30002, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, Object obj, DeviceInfo deviceInfo) {
        LogUtil.a("HwCoreSleepManager", "reportProcessForUi has been done errorCode: ", Integer.valueOf(i));
        if (i == 20000) {
            if (c() != null) {
                c().a(20000, obj);
            }
            b(20000, obj);
        } else {
            if (i != 0) {
                c(i, "");
                return;
            }
            if (this.p != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = deviceInfo;
                Bundle bundle = new Bundle();
                bundle.putBoolean("isNormalSync", false);
                messageObtain.setData(bundle);
                messageObtain.what = 3;
                this.p.sendMessage(messageObtain);
            }
        }
    }

    public IBaseResponseCallback b() {
        return this.aj;
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        this.aj = iBaseResponseCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        LogUtil.a("HwCoreSleepManager", "reportProgress original progress ", Integer.valueOf(i));
        int i2 = 100;
        if (i <= 100 && i >= 0) {
            i2 = (i * 7) / 9;
        } else if (i < 160 && i > 100) {
            i2 = (((i - 100) * 600) / 2160) + 77;
        } else if (i < 280 && i >= 160) {
            i2 = (((i - 160) * 200) / 4320) + 94;
        } else if (i != -1) {
            i2 = 99;
        }
        if (this.u && i()) {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "reportProgress SecondStage return");
            return;
        }
        LogUtil.a("HwCoreSleepManager", "reportProgress finish progress ", Integer.valueOf(i2));
        IBaseResponseCallback iBaseResponseCallbackB = b();
        if (iBaseResponseCallbackB != null) {
            iBaseResponseCallbackB.a(20000, Integer.valueOf(i2));
        } else {
            LogUtil.j("HwCoreSleepManager", "reportProgress callback is null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, String str) {
        Intent intent = new Intent("com.huawei.health.action.ACTION_CORE_SLEEP_ERROR_CODE");
        intent.putExtra("errorCode", i);
        intent.putExtra("message", str);
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DeviceInfo deviceInfo) {
        n();
        c(-1);
        c(21005, "");
        d(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "timeout");
        b(deviceInfo, false);
        this.m = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:52:0x0161  */
    public void e(String str, int i, IBaseResponseCallback iBaseResponseCallback, boolean z, DeviceInfo deviceInfo) throws Throwable {
        FileInputStream fileInputStreamOpenFileInput;
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2;
        FileInputStream fileInputStream;
        ArrayList<byte[]> arrayList;
        ArrayList<byte[]> arrayList2;
        ObjectInputStream objectInputStream3;
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "enter readCoreSleepFile");
        HashMap map = (HashMap) new Gson().fromJson(str, HashMap.class);
        String str2 = (String) map.get("coreSleepDataFilePath");
        String str3 = (String) map.get("coreSleepStatusFilePath");
        boolean z2 = Boolean.parseBoolean((String) map.get("isNewFile"));
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "isNewFile=", Boolean.valueOf(z2));
        if (z2) {
            d(b(str3), b(str2), i, iBaseResponseCallback, z, deviceInfo);
            return;
        }
        ArrayList<byte[]> arrayList3 = new ArrayList<>(16);
        ArrayList<byte[]> arrayList4 = new ArrayList<>(16);
        FileInputStream fileInputStream2 = null;
        FileInputStream fileInputStream3 = null;
        ObjectInputStream objectInputStream4 = null;
        ObjectInputStream objectInputStream5 = null;
        ObjectInputStream objectInputStream6 = null;
        ObjectInputStream objectInputStream7 = null;
        fileInputStream2 = null;
        fileInputStream2 = null;
        fileInputStream2 = null;
        FileInputStream fileInputStream4 = null;
        try {
            try {
                LogUtil.a("HwCoreSleepManager", "readFileAndSetContent(), mTransferStateContent stateLength = ", Long.valueOf(this.j.getFileStreamPath(str3).length()));
                FileInputStream fileInputStreamOpenFileInput2 = this.j.openFileInput(str3);
                try {
                    objectInputStream2 = new ObjectInputStream(fileInputStreamOpenFileInput2);
                    try {
                        try {
                            ArrayList<byte[]> arrayList5 = (ArrayList) objectInputStream2.readObject();
                            if (str2 != null) {
                                try {
                                    LogUtil.a("HwCoreSleepManager", "readFileAndSetContent(), mTransferStateContent dataLength = ", Long.valueOf(this.j.getFileStreamPath(str2).length()));
                                    fileInputStreamOpenFileInput = this.j.openFileInput(str2);
                                    try {
                                        objectInputStream3 = new ObjectInputStream(fileInputStreamOpenFileInput);
                                        try {
                                            arrayList4 = (ArrayList) objectInputStream3.readObject();
                                            fileInputStream3 = fileInputStreamOpenFileInput;
                                        } catch (FileNotFoundException unused) {
                                            objectInputStream4 = objectInputStream3;
                                            fileInputStream = fileInputStreamOpenFileInput;
                                            arrayList3 = arrayList5;
                                            objectInputStream = objectInputStream4;
                                            fileInputStream2 = fileInputStreamOpenFileInput2;
                                            ReleaseLogUtil.a("BTSYNC_CoreSleep_HwCoreSleepManager", "readFileAndSetContent(), getFile() FileNotFoundException.");
                                            e(fileInputStream2, fileInputStream, objectInputStream2, objectInputStream);
                                            arrayList = arrayList3;
                                            arrayList2 = arrayList4;
                                        } catch (IOException unused2) {
                                            objectInputStream5 = objectInputStream3;
                                            fileInputStream = fileInputStreamOpenFileInput;
                                            arrayList3 = arrayList5;
                                            objectInputStream = objectInputStream5;
                                            fileInputStream2 = fileInputStreamOpenFileInput2;
                                            ReleaseLogUtil.a("BTSYNC_CoreSleep_HwCoreSleepManager", "readFileAndSetContent(), getFile() IOException.");
                                            e(fileInputStream2, fileInputStream, objectInputStream2, objectInputStream);
                                            arrayList = arrayList3;
                                            arrayList2 = arrayList4;
                                        } catch (ClassNotFoundException unused3) {
                                            objectInputStream6 = objectInputStream3;
                                            fileInputStream = fileInputStreamOpenFileInput;
                                            arrayList3 = arrayList5;
                                            objectInputStream = objectInputStream6;
                                            fileInputStream2 = fileInputStreamOpenFileInput2;
                                            ReleaseLogUtil.a("BTSYNC_CoreSleep_HwCoreSleepManager", "readFileAndSetContent(), getFile() ClassNotFoundException.");
                                            e(fileInputStream2, fileInputStream, objectInputStream2, objectInputStream);
                                            arrayList = arrayList3;
                                            arrayList2 = arrayList4;
                                        } catch (Throwable th) {
                                            th = th;
                                            objectInputStream7 = objectInputStream3;
                                            objectInputStream = objectInputStream7;
                                            fileInputStream4 = fileInputStreamOpenFileInput2;
                                            e(fileInputStream4, fileInputStreamOpenFileInput, objectInputStream2, objectInputStream);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused4) {
                                    } catch (IOException unused5) {
                                    } catch (ClassNotFoundException unused6) {
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (FileNotFoundException unused7) {
                                    arrayList3 = arrayList5;
                                    fileInputStream = null;
                                    fileInputStream2 = fileInputStreamOpenFileInput2;
                                    objectInputStream = null;
                                    ReleaseLogUtil.a("BTSYNC_CoreSleep_HwCoreSleepManager", "readFileAndSetContent(), getFile() FileNotFoundException.");
                                    e(fileInputStream2, fileInputStream, objectInputStream2, objectInputStream);
                                    arrayList = arrayList3;
                                    arrayList2 = arrayList4;
                                    d(arrayList, arrayList2, i, iBaseResponseCallback, z, deviceInfo);
                                    if (str2 != null) {
                                        LogUtil.a("HwCoreSleepManager", "readFileAndSetContent(), isDeleteDataSuc = ", Boolean.valueOf(this.j.deleteFile(str2)));
                                    }
                                    LogUtil.a("HwCoreSleepManager", "readFileAndSetContent(), isDeleteStateSuc = ", Boolean.valueOf(this.j.deleteFile(str3)));
                                } catch (IOException unused8) {
                                    arrayList3 = arrayList5;
                                    fileInputStream = null;
                                    fileInputStream2 = fileInputStreamOpenFileInput2;
                                    objectInputStream = null;
                                    ReleaseLogUtil.a("BTSYNC_CoreSleep_HwCoreSleepManager", "readFileAndSetContent(), getFile() IOException.");
                                    e(fileInputStream2, fileInputStream, objectInputStream2, objectInputStream);
                                    arrayList = arrayList3;
                                    arrayList2 = arrayList4;
                                    d(arrayList, arrayList2, i, iBaseResponseCallback, z, deviceInfo);
                                    if (str2 != null) {
                                        LogUtil.a("HwCoreSleepManager", "readFileAndSetContent(), isDeleteDataSuc = ", Boolean.valueOf(this.j.deleteFile(str2)));
                                    }
                                    LogUtil.a("HwCoreSleepManager", "readFileAndSetContent(), isDeleteStateSuc = ", Boolean.valueOf(this.j.deleteFile(str3)));
                                } catch (ClassNotFoundException unused9) {
                                    arrayList3 = arrayList5;
                                    fileInputStream = null;
                                    fileInputStream2 = fileInputStreamOpenFileInput2;
                                    objectInputStream = null;
                                    ReleaseLogUtil.a("BTSYNC_CoreSleep_HwCoreSleepManager", "readFileAndSetContent(), getFile() ClassNotFoundException.");
                                    e(fileInputStream2, fileInputStream, objectInputStream2, objectInputStream);
                                    arrayList = arrayList3;
                                    arrayList2 = arrayList4;
                                    d(arrayList, arrayList2, i, iBaseResponseCallback, z, deviceInfo);
                                    if (str2 != null) {
                                        LogUtil.a("HwCoreSleepManager", "readFileAndSetContent(), isDeleteDataSuc = ", Boolean.valueOf(this.j.deleteFile(str2)));
                                    }
                                    LogUtil.a("HwCoreSleepManager", "readFileAndSetContent(), isDeleteStateSuc = ", Boolean.valueOf(this.j.deleteFile(str3)));
                                }
                            } else {
                                objectInputStream3 = null;
                            }
                            e(fileInputStreamOpenFileInput2, fileInputStream3, objectInputStream2, objectInputStream3);
                            arrayList2 = arrayList4;
                            arrayList = arrayList5;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStreamOpenFileInput = null;
                            fileInputStream4 = fileInputStreamOpenFileInput2;
                            objectInputStream = null;
                            e(fileInputStream4, fileInputStreamOpenFileInput, objectInputStream2, objectInputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException unused10) {
                    } catch (IOException unused11) {
                    } catch (ClassNotFoundException unused12) {
                    }
                } catch (FileNotFoundException unused13) {
                    objectInputStream2 = null;
                } catch (IOException unused14) {
                    objectInputStream2 = null;
                } catch (ClassNotFoundException unused15) {
                    objectInputStream2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    objectInputStream2 = null;
                }
            } catch (Throwable th5) {
                th = th5;
                objectInputStream2 = objectInputStream2;
                fileInputStream4 = fileInputStream2;
                fileInputStreamOpenFileInput = fileInputStream;
            }
        } catch (FileNotFoundException unused16) {
            fileInputStream = null;
            objectInputStream = null;
            objectInputStream2 = null;
        } catch (IOException unused17) {
            fileInputStream = null;
            objectInputStream = null;
            objectInputStream2 = null;
        } catch (ClassNotFoundException unused18) {
            fileInputStream = null;
            objectInputStream = null;
            objectInputStream2 = null;
        } catch (Throwable th6) {
            th = th6;
            fileInputStreamOpenFileInput = null;
            objectInputStream = null;
            objectInputStream2 = null;
        }
        d(arrayList, arrayList2, i, iBaseResponseCallback, z, deviceInfo);
        if (str2 != null) {
            LogUtil.a("HwCoreSleepManager", "readFileAndSetContent(), isDeleteDataSuc = ", Boolean.valueOf(this.j.deleteFile(str2)));
        }
        LogUtil.a("HwCoreSleepManager", "readFileAndSetContent(), isDeleteStateSuc = ", Boolean.valueOf(this.j.deleteFile(str3)));
    }

    private void e(FileInputStream fileInputStream, FileInputStream fileInputStream2, ObjectInputStream objectInputStream, ObjectInputStream objectInputStream2) {
        IoUtils.c(fileInputStream);
        IoUtils.c(fileInputStream2);
        IoUtils.c(objectInputStream);
        IoUtils.c(objectInputStream2);
    }

    private void d(ArrayList<byte[]> arrayList, ArrayList<byte[]> arrayList2, int i, IBaseResponseCallback iBaseResponseCallback, boolean z, DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "enter reportDataContent");
        LogUtil.a("HwCoreSleepManager", "reportDataContent(), ", ", coreSleepStatus: ", arrayList, ", coreSleepData: ", arrayList2, ", sucCode = ", Integer.valueOf(i), " coreSleepDatas size: ", Integer.valueOf(arrayList2.size()), ", coreSleepStatus size: ", Integer.valueOf(arrayList.size()), ", sucCode: ", Integer.valueOf(i), ", isNormalSync: ", Boolean.valueOf(z));
        if (arrayList.size() == 0) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "reportDataContent, sucCode is ", Integer.valueOf(i), "status file size is 0.");
            d(i, z, iBaseResponseCallback, deviceInfo);
        } else if (arrayList2.size() == 0) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "reportDataContent, sucCode is ", Integer.valueOf(i), "data file size is 0.");
            d(i, iBaseResponseCallback, z, deviceInfo);
            d(arrayList2, arrayList, deviceInfo);
        } else {
            d(i, iBaseResponseCallback, z, deviceInfo);
            d(arrayList2, arrayList, deviceInfo);
        }
    }

    private void d(ArrayList<byte[]> arrayList, ArrayList<byte[]> arrayList2, DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "enter processCoreSleepData");
        if (this.w) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "processCoreSleepData is running");
            return;
        }
        this.w = true;
        ExtendHandler extendHandler = this.p;
        if (extendHandler != null) {
            extendHandler.removeMessages(0);
        }
        this.n = arrayList2.size();
        if (arrayList2.size() == 0) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "processCoreSleepData data is null");
            this.o = -1;
            this.w = false;
            return;
        }
        LogUtil.a("HwCoreSleepManager", "CoreSleepData from BT is as follow:");
        ArrayList<byte[]> arrayList3 = new ArrayList<>(16);
        ArrayList<byte[]> arrayList4 = new ArrayList<>(16);
        if (arrayList.size() > 0) {
            LogUtil.a("HwCoreSleepManager", "dataContents size is ", Integer.valueOf(arrayList.size()));
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList3.add(i, arrayList.get(i));
            }
        }
        if (arrayList2.size() > 0) {
            LogUtil.a("HwCoreSleepManager", "statusContents size is ", Integer.valueOf(arrayList2.size()));
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                arrayList4.add(i2, arrayList2.get(i2));
            }
        }
        LogUtil.a("HwCoreSleepManager", "CoreSleepData before getCpcResult(stringDataContents, stringStatusContents) is as follow");
        a(arrayList3, arrayList4, deviceInfo);
    }

    private void a(ArrayList<byte[]> arrayList, ArrayList<byte[]> arrayList2, DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "enter getCpcResult");
        this.aa = new ArrayList(16);
        this.ad = new ArrayList(16);
        this.ac = new ArrayList(16);
        Message messageObtain = Message.obtain();
        messageObtain.obj = deviceInfo;
        messageObtain.what = 1;
        this.p.sendMessage(messageObtain, 180000L);
        b(arrayList, arrayList2, new IBaseResponseCallback() { // from class: ltm.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ltm.this.d(i, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, Object obj) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "enter cpcResponseTask, errorCode=", Integer.valueOf(i));
        this.p.removeMessages(1);
        if (i != 0 || !(obj instanceof cir)) {
            LogUtil.j("HwCoreSleepManager", "get cpc result error");
            this.o = 3;
        } else {
            cir cirVar = (cir) obj;
            if (cirVar.e().size() > 0) {
                this.aa = cirVar.e();
            }
            if (cirVar.d().size() > 0) {
                this.ad = cirVar.d();
            }
            if (cirVar.b().size() <= 0) {
                LogUtil.a("HwCoreSleepManager", "get cpc result no error");
            } else {
                this.ac = cirVar.b();
                ciu ciuVar = cirVar.b().get(cirVar.b().size() - 1);
                c(ciuVar.a(), ciuVar.b());
                if (this.aa.size() == 0 && this.ad.size() == 0) {
                    ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "SleepCalcFramesList.size() is 0, SleepStatusFramesList.size() is 0");
                    e(cirVar.b());
                    this.o = 3;
                    this.w = false;
                    return;
                }
            }
            t();
            DeviceInfo deviceInfo = this.ai.getDeviceInfo();
            if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
                LogUtil.a("HwCoreSleepManager", "disconnected,don't save");
                n();
                c(-1);
                c(21000, "");
            } else {
                this.l.e(this, this.aa, this.ad);
            }
        }
        this.w = false;
    }

    public ArrayList<byte[]> b(String str) {
        ArrayList<byte[]> arrayList = new ArrayList<>(16);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwCoreSleepManager", "getFileByte filePath is empty.");
            return arrayList;
        }
        try {
            try {
                File file = FileUtils.getFile(str);
                FileInputStream fileInputStreamOpenInputStream = FileUtils.openInputStream(file);
                long length = file.length();
                if (length > 20971520) {
                    LogUtil.j("HwCoreSleepManager", "wrong file. file.length is too large.");
                    IoUtils.c(fileInputStreamOpenInputStream);
                    return arrayList;
                }
                byte[] bArr = new byte[(int) length];
                if (fileInputStreamOpenInputStream.read(bArr) == length) {
                    LogUtil.a("HwCoreSleepManager", "read inputStream success.");
                }
                arrayList.add(bArr);
                IoUtils.c(fileInputStreamOpenInputStream);
                return arrayList;
            } catch (IOException e2) {
                LogUtil.e("HwCoreSleepManager", "getFileByte : ", e2.getMessage());
                IoUtils.c(null);
                return arrayList;
            }
        } catch (Throwable th) {
            IoUtils.c(null);
            throw th;
        }
    }

    public void d(SyncOption syncOption, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "enter startSynCoreSleep, isManualSync: ", Boolean.valueOf(syncOption.isManualSync()), ", isNightCheck: ", Boolean.valueOf(syncOption.isNightCheck()), ", isTemperatureCheck: ", Boolean.valueOf(syncOption.isTemperatureCheck()), ", mode:", Integer.valueOf(syncOption.getMode(SyncMode.INCREMENTAL.getValue())), ", interfaceType: ", syncOption.getCustomParameter("isUiInterface"));
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "startSynCoreSleep callback is null");
            return;
        }
        DeviceInfo deviceInfoD = ltj.d(this.ai);
        if (b(iBaseResponseCallback, deviceInfoD)) {
            boolean zEquals = "uiInterface".equals(syncOption.getCustomParameter("isUiInterface"));
            synchronized (this.ah) {
                boolean zB = b(deviceInfoD);
                ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startSynCoreSleep isSyncing: ", Boolean.valueOf(zB));
                if (zB) {
                    if (zEquals) {
                        b(iBaseResponseCallback);
                        d(iBaseResponseCallback);
                    } else {
                        e(iBaseResponseCallback);
                    }
                    return;
                }
                b(deviceInfoD, true);
                d((IBaseResponseCallback) null);
                this.ae = System.currentTimeMillis();
                e(deviceInfoD);
                this.u = c(deviceInfoD);
                this.k = deviceInfoD.getDeviceIdentify();
                this.t = true;
                ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startSynCoreSleep mIsNeedSegmentMark: ", Boolean.valueOf(this.u));
                if (zEquals) {
                    e(syncOption, iBaseResponseCallback, deviceInfoD);
                } else {
                    b(syncOption, iBaseResponseCallback, deviceInfoD);
                }
            }
        }
    }

    public void e(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return;
        }
        if (!eey.d(deviceInfo, 143)) {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "isSupportAlgorithmDown false");
            return;
        }
        if (o() == 0) {
            long jB = b(deviceInfo.getDeviceIdentify(), 700013, 4000000, "HwCoreSleepManager") * 1000;
            if (jB == 0) {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "updateLastSyncTime 1");
                b(1L);
            } else {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "updateLastSyncTime lastSyncTime：", Long.valueOf(jB));
                b(jB);
            }
        }
    }

    private boolean e(SyncOption syncOption, DeviceInfo deviceInfo) {
        int i = Calendar.getInstance().get(11);
        LogUtil.a("HwCoreSleepManager", "localHour=", Integer.valueOf(i));
        if (syncOption.isNightCheck() && i >= 0 && i < 6) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "startSyncCoreSleepAuto isPullDownRefresh and localHour false");
            return false;
        }
        if (!syncOption.isTemperatureCheck() || ThermalCallback.getInstance().isTriggerTask()) {
            return true;
        }
        ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "startSyncCoreSleepAuto does not have the conditions to trigger the task.");
        return false;
    }

    private long c(SyncOption syncOption, DeviceInfo deviceInfo) {
        int mode = syncOption.getMode(SyncMode.INCREMENTAL.getValue());
        if (mode == SyncMode.CUSTOM.getValue()) {
            return syncOption.getStartTime() / 1000;
        }
        if (mode == SyncMode.FULL.getValue()) {
            return 0L;
        }
        return o() / 1000;
    }

    private long d(SyncOption syncOption) {
        int mode = syncOption.getMode(SyncMode.INCREMENTAL.getValue());
        if (mode == SyncMode.CUSTOM.getValue()) {
            return syncOption.getEndTime() / 1000;
        }
        if (mode == SyncMode.FULL.getValue()) {
            return System.currentTimeMillis() / 1000;
        }
        if (e(syncOption)) {
            return Long.parseLong(syncOption.getCustomParameter("hasUpgradeTime")) / 1000;
        }
        return System.currentTimeMillis() / 1000;
    }

    public long a() {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "getSegmentTime:mSegmentTime: ", Long.valueOf(this.z));
        return this.z;
    }

    private boolean e(SyncOption syncOption) {
        return syncOption.getCustomParameter("hasUpgradeTime") != null;
    }

    private void a(final DeviceInfo deviceInfo, SyncOption syncOption, final IBaseResponseCallback iBaseResponseCallback) {
        int iC;
        a(syncOption);
        if (c(syncOption, deviceInfo) != 0) {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startDicSync getStarTime is not zero.");
            iC = ((int) c(syncOption, deviceInfo)) + 1;
        } else {
            iC = 0;
        }
        long jD = d(syncOption);
        int i = (int) jD;
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startDicSync dicSyncCoreSleep start. startTime: ", Integer.valueOf(iC), " endTime: ", Integer.valueOf(i));
        this.i = jD * 1000;
        this.ai.dicSyncCoreSleep(deviceInfo.getDeviceIdentify(), iC, i, new IBaseResponseCallback() { // from class: ltm.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startDicSync errorCode:", Integer.valueOf(i2));
                ltm.this.b(deviceInfo, false);
                ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startDicSync updateTime:", Long.valueOf(ltm.this.i));
                if (i2 == 0) {
                    ltm ltmVar = ltm.this;
                    ltmVar.b(ltmVar.i);
                }
                if (i2 == 144001) {
                    i2 = 0;
                }
                iBaseResponseCallback.a(i2, obj);
                ltm.this.b(i2, obj);
                ltm.this.d((IBaseResponseCallback) null);
                ltm.this.d(i2, "dicSyncCoreSleep");
            }
        });
    }

    private void b(final DeviceInfo deviceInfo, final SyncOption syncOption, final IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startDicSyncByFirstStage enter.");
        a(syncOption);
        int iC = (int) lto.c();
        long jD = d(syncOption);
        int i = (int) jD;
        long j = jD * 1000;
        this.z = j;
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startDicSyncByFirstStage startTime: ", Integer.valueOf(iC), " endTime: ", Integer.valueOf(i), " mSegmentTime: ", Long.valueOf(j));
        this.ai.dicSyncCoreSleep(deviceInfo.getDeviceIdentify(), iC, i, new IBaseResponseCallback() { // from class: ltm.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startDicSyncByFirstStage errorCode:", Integer.valueOf(i2));
                if (144001 == i2) {
                    ltm.this.t = false;
                    i2 = 0;
                }
                iBaseResponseCallback.a(i2, obj);
                ltm.this.b(i2, obj);
                ltm.this.d((IBaseResponseCallback) null);
                ltm.this.a(deviceInfo, syncOption);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final DeviceInfo deviceInfo, SyncOption syncOption) {
        int iC;
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startDicSyncBySecondStage enter.");
        if (c(syncOption, deviceInfo) != 0) {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startDicSyncBySecondStage getStarTime is not zero.");
            iC = ((int) c(syncOption, deviceInfo)) + 1;
        } else {
            iC = 0;
        }
        int iC2 = ((int) lto.c()) - 1;
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startDicSyncBySecondStage startTime: ", Integer.valueOf(iC), " endTime: ", Integer.valueOf(iC2));
        if (iC >= iC2) {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startDicSyncBySecondStage startTime >= endTime, return.");
            b(a());
        } else {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startDicSyncBySecondStage dicSyncCoreSleep start");
            this.ai.dicSyncCoreSleep(deviceInfo.getDeviceIdentify(), iC, iC2, new IBaseResponseCallback() { // from class: ltm.6
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startDicSyncBySecondStage errorCode:", Integer.valueOf(i));
                    ltm.this.b(deviceInfo, false);
                    if (i == 0 || (144001 == i && ltm.this.t)) {
                        ltm ltmVar = ltm.this;
                        ltmVar.b(ltmVar.a());
                    }
                    if (i == 144001) {
                        i = 0;
                    }
                    ltm.this.d(i, "dicSyncCoreSleep");
                }
            });
        }
    }

    private boolean k() {
        return b(ltj.d(this.ai));
    }

    private boolean b(DeviceInfo deviceInfo) {
        Boolean bool;
        if (deviceInfo != null && this.q != null) {
            String deviceIdentify = deviceInfo.getDeviceIdentify();
            if (this.q.containsKey(deviceIdentify) && (bool = this.q.get(deviceIdentify)) != null && bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(DeviceInfo deviceInfo, boolean z) {
        if (deviceInfo == null || this.q == null) {
            return;
        }
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "update deviceSync: ", Boolean.valueOf(z), ", deviceName: ", deviceInfo.getDeviceName());
        this.q.put(deviceInfo.getDeviceIdentify(), Boolean.valueOf(z));
        if (z || !deviceInfo.getDeviceIdentify().equals(this.k)) {
            return;
        }
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "setIsNeedSegmentMark false");
        e(false);
    }

    private boolean b(IBaseResponseCallback iBaseResponseCallback, DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "startSynCoreSleep deviceInfo null or DEVICE_DISCONNECTED return!");
            iBaseResponseCallback.a(21000, "");
            return false;
        }
        DeviceCapability deviceCapabilityB = ltj.b(deviceInfo, this.ai);
        if (deviceCapabilityB == null) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "startSynCoreSleep capability is null.");
            iBaseResponseCallback.a(21001, "capability is null");
            return false;
        }
        LogUtil.a("HwCoreSleepManager", "isSupportQueryDeviceCoreSleepSwitch(): ", Boolean.valueOf(deviceCapabilityB.isSupportQueryDeviceCoreSleepSwitch()), ", isSupportCoreSleep() : ", Boolean.valueOf(deviceCapabilityB.isSupportCoreSleep()));
        if (deviceCapabilityB.isSupportCoreSleep() || deviceCapabilityB.isSupportQueryDeviceCoreSleepSwitch()) {
            return true;
        }
        ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "startSynCoreSleep don't satisfy coreSleep sync condition!");
        iBaseResponseCallback.a(21002, "don't satisfy coreSleep sync condition");
        return false;
    }

    private void a(DeviceInfo deviceInfo, SyncOption syncOption, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        a(syncOption);
        long jC = c(syncOption, deviceInfo);
        long jD = d(syncOption);
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "starFileSync start. startTime: ", Long.valueOf(jC), " endTime: ", Long.valueOf(jD));
        if (z && jC >= jD && e(syncOption)) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "startTime >= endTime", "startime: ", Long.valueOf(jC), "endTime: ", Long.valueOf(jD));
            b(deviceInfo, false);
            c(21005, "startTime >= endTime");
        } else {
            long jA = a(jC, jD);
            this.ab = jA;
            this.x = jD;
            this.am.a("HwCoreSleepManager", new d(jA, jD, iBaseResponseCallback, z, deviceInfo));
        }
    }

    private void c(DeviceInfo deviceInfo, SyncOption syncOption, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startFileSyncByFirstStage enter.");
        a(syncOption);
        this.s = z;
        this.v = syncOption;
        this.y = false;
        long jC = lto.c();
        long jD = d(syncOption);
        this.z = 1000 * jD;
        this.x = jD;
        if (z && jC >= jD && e(syncOption)) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "startFileSyncByFirstStage startTime >= endTime", "startime: ", Long.valueOf(jC), "endTime: ", Long.valueOf(jD));
            b(deviceInfo, false);
            this.y = false;
            c(21005, "startTime >= endTime");
            return;
        }
        this.ab = jC;
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startFileSyncByFirstStage startTime: ", Long.valueOf(jC), " endTime: ", Long.valueOf(jD), " mSegmentTime: ", Long.valueOf(this.z));
        this.am.a("HwCoreSleepManager", new d(jC, jD, iBaseResponseCallback, z, deviceInfo));
    }

    public void h() {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startFileSyncBySecondStage enter.");
        DeviceInfo deviceInfoD = ltj.d(this.ai);
        SyncOption syncOption = this.v;
        if (syncOption == null) {
            b(deviceInfoD, false);
            ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startFileSyncBySecondStage mOption is null.");
            c(21005, "option is null");
            this.y = false;
            return;
        }
        long jC = c(syncOption, deviceInfoD);
        long jC2 = lto.c();
        this.y = true;
        if (jC >= jC2) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepManager", "startFileSyncBySecondStage startTime >= endTime", "startime: ", Long.valueOf(jC), "endTime: ", Long.valueOf(jC2));
            b(deviceInfoD, false);
            b(a());
            c(21005, "startTime >= endTime");
            this.y = false;
            return;
        }
        this.ab = jC;
        this.x = jC2;
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "startFileSyncBySecondStage startTime: ", Long.valueOf(jC), " endTime: ", Long.valueOf(jC2));
        this.am.a("HwCoreSleepManager", new d(jC, jC2, null, this.s, deviceInfoD));
    }

    public void j() {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepManager", "updateDeviceSyncingStatus enter");
        b(ltj.d(this.ai), false);
    }

    public boolean i() {
        return this.y;
    }

    public void d(boolean z) {
        this.y = z;
    }

    public boolean e() {
        return this.u;
    }

    public void e(boolean z) {
        this.u = z;
    }

    public boolean c(DeviceInfo deviceInfo) {
        long jO = o() / 1000;
        return jO == 0 || (System.currentTimeMillis() / 1000) - jO >= 129600;
    }

    public static long b(String str, int i, int i2, String str2) {
        String str3 = KeyValDbManager.d(BaseApplication.getContext()).c("user_id") + "_" + ckg.b(str) + "_" + i;
        long jD = SharedPreferenceManager.d(String.valueOf(i2), str3, 0L);
        LogUtil.a("HwCoreSleepManager", "getLastTimeFromStorage identify:", cpl.a(str), ",dicId:", Integer.valueOf(i), ",storageKey:", str3, ",lastStorageTime:", Long.valueOf(jD), ",tag:", str2);
        return jD;
    }
}
