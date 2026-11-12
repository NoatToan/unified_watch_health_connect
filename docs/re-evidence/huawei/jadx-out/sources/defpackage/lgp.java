package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import androidx.work.WorkRequest;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.data.type.HiSyncType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.sync.HiSyncService;
import com.huawei.hihealthservice.sync.syncdata.dictionary.detail.HiSyncDictionaryDataDetail;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.ThermalCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.AiCoreSdkConstant;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class lgp {
    private static int i;
    private Timer k;
    private final Object l;
    private final AtomicReference<AlarmManager> n;
    private final BroadcastReceiver o;
    private SharedPreferences p;
    private final AtomicReference<Timer> q;
    private d r;
    private a s;
    private final Object t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static AtomicBoolean f40099c = new AtomicBoolean(false);
    private static final Object d = new Object();
    private static boolean f = false;
    private static boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f40097a = false;
    private static boolean j = false;
    private static boolean g = false;
    private static boolean h = false;
    private static Hashtable<Integer, List<Integer>> m = new Hashtable<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Context f40098b = BaseApplication.getContext();

    private boolean q(int i2) {
        return i2 == 15 || i2 == 10005 || i2 == 10028;
    }

    /* synthetic */ lgp(AnonymousClass2 anonymousClass2) {
        this();
    }

    /* JADX INFO: renamed from: lgp$2, reason: invalid class name */
    class AnonymousClass2 extends BroadcastReceiver {
        AnonymousClass2() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            if (context == null || intent == null || !"com.huawei.hihealth.action_one_hour_sync".equals(intent.getAction())) {
                return;
            }
            ReleaseLogUtil.d("HiH_HiSyncControl", "startAlarmManager start autoSync");
            ThreadPoolManager.c().a("HiSyncControl_BroadcastSync", new Runnable() { // from class: lgl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40087c.b(context);
                }
            });
        }

        /* synthetic */ void b(Context context) {
            lgp.this.a(context.getPackageName(), 20000, 5);
            lgp.this.p();
        }
    }

    private lgp() {
        AnonymousClass2 anonymousClass2 = null;
        this.n = new AtomicReference<>(null);
        this.q = new AtomicReference<>(null);
        this.l = new Object();
        this.t = new Object();
        this.o = new AnonymousClass2();
        this.p = f40098b.getSharedPreferences("synSp", 0);
        af();
        if (this.s == null) {
            a aVar = new a(this, anonymousClass2);
            this.s = aVar;
            BroadcastManager.h(aVar);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final lgp f40102b = new lgp(null);
    }

    public static lgp f() {
        return c.f40102b;
    }

    private static void af() {
        i = 2;
        Utils.b(2);
        LogUtil.a("HiH_HiSyncControl", "initSyncModel current SyncModel is ", 2);
    }

    public static void e(boolean z) {
        g = z;
        Object obj = d;
        synchronized (obj) {
            if (!z) {
                obj.notifyAll();
            }
        }
    }

    public static boolean j() {
        return g;
    }

    public static void a(int i2, int i3) {
        List<Integer> arrayList = m.get(Integer.valueOf(i2));
        if (HiCommonUtil.b(arrayList)) {
            arrayList = new ArrayList<>(1);
        }
        arrayList.add(Integer.valueOf(i3));
        m.put(Integer.valueOf(i2), arrayList);
    }

    public static Hashtable<Integer, List<Integer>> g() {
        return new Hashtable<>(m);
    }

    public static void c(int i2) {
        m.remove(Integer.valueOf(i2));
    }

    public static void a(boolean z) {
        h = z;
    }

    public static boolean c() {
        return h;
    }

    public static void d() {
        Object obj = d;
        synchronized (obj) {
            if (g) {
                try {
                    obj.wait(180000L);
                } catch (InterruptedException e2) {
                    ReleaseLogUtil.d("HiH_HiSyncControl", "InterruptedException = " + e2.getMessage());
                }
            }
        }
    }

    public static boolean h() {
        return f40099c.get();
    }

    public static boolean d(boolean z) {
        return f40099c.compareAndSet(!z, z);
    }

    public static void a(Context context, int i2, int i3) {
        if (d(true)) {
            new Thread(new lgx(context, i2, i3)).start();
        }
    }

    private static boolean al() {
        return j;
    }

    public static boolean n() {
        return e;
    }

    public static boolean m() {
        return f40097a;
    }

    public static boolean l() {
        return f;
    }

    public static boolean a() {
        return !f && e();
    }

    public static boolean e() {
        return (e || f40097a) ? false : true;
    }

    public static boolean k() {
        return e && f40097a;
    }

    private void p(int i2) {
        this.p.edit().putInt("biCurrentDay", i2).apply();
    }

    private int ac() {
        return this.p.getInt("biCurrentDay", 0);
    }

    public boolean e(String str) {
        return this.p.getBoolean("initialSync" + str, true);
    }

    public void a(String str, boolean z) {
        this.p.edit().putBoolean("initialSync" + str, z).apply();
    }

    public boolean d(String str) {
        return this.p.getBoolean("userConfigFirstSync" + str, true);
    }

    public void c(String str, boolean z) {
        this.p.edit().putBoolean("userConfigFirstSync" + str, z).apply();
    }

    private void t(int i2) {
        this.p.edit().putInt("currentDay", i2).apply();
    }

    public int s() {
        return this.p.getInt("currentDay", 0);
    }

    public void d(int i2) {
        this.p.edit().putInt("newcurrentDay", i2).apply();
    }

    public int t() {
        return this.p.getInt("newcurrentDay", 0);
    }

    private int ab() {
        int i2 = this.p.getInt("randomSyncDeviceTimestamp", 0);
        if (i2 != 0) {
            return i2;
        }
        int iNextInt = new SecureRandom().nextInt(19) * 3600000;
        this.p.edit().putInt("randomSyncDeviceTimestamp", iNextInt).apply();
        return iNextInt;
    }

    private int v() {
        return this.p.getInt("appAutoSyncTimes", 0);
    }

    private int z() {
        return this.p.getInt("statsynctotalnum", 0);
    }

    private int ae() {
        return this.p.getInt("totalSportStatSyncTimes", 0);
    }

    private long aa() {
        return this.p.getLong("lastSyncBeginTime", 0L);
    }

    private void ar() {
        this.p.edit().putLong("lastSyncBeginTime", System.currentTimeMillis()).apply();
    }

    private void f(int i2, int i3) {
        this.p.edit().putInt("syncThresholdUserDeviceNum_" + i2, i3).apply();
    }

    private int n(int i2) {
        return this.p.getInt("syncThresholdUserDeviceNum_" + i2, 2);
    }

    private long ad() {
        return this.p.getLong("lastSyncStatDataBeinTime", 0L);
    }

    private void d(long j2) {
        this.p.edit().putLong("lastSyncStatDataBeinTime", j2).apply();
    }

    private int h(int i2) {
        String strE = SharedPreferenceManager.e(f40098b, "sync_module", "totalCalorie_" + i2);
        LogUtil.d("HiH_HiSyncControl", "getLastTotalCalorie completed !!! id = ", strE);
        if (!HiCommonUtil.a(strE)) {
            try {
                return Integer.parseInt(strE, 10);
            } catch (NumberFormatException e2) {
                ReleaseLogUtil.d("HiH_HiSyncControl", "lastCalorie parse int error:", LogAnonymous.b(e2));
                return 0;
            }
        }
        return this.p.getInt("totalCalorie_" + i2, 0);
    }

    private int i(int i2) {
        String strE = SharedPreferenceManager.e(f40098b, "sync_module", "totalStep_" + i2);
        LogUtil.d("HiH_HiSyncControl", "getLastTotalStep completed !!! id = ", strE);
        if (!HiCommonUtil.a(strE)) {
            try {
                return Integer.parseInt(strE, 10);
            } catch (NumberFormatException e2) {
                ReleaseLogUtil.d("HiH_HiSyncControl", "lastStep parse int error:", LogAnonymous.b(e2));
                return 0;
            }
        }
        return this.p.getInt("totalStep_" + i2, 0);
    }

    private void h(int i2, int i3) {
        if (SharedPreferenceManager.e(f40098b, "sync_module", "totalCalorie_" + i2, String.valueOf(i3), new StorageParams(2)) == 0) {
            LogUtil.d("HiH_HiSyncControl", "setLastTotalCalorie completed");
            this.p.edit().putInt("totalCalorie_" + i2, 0).apply();
            return;
        }
        this.p.edit().putInt("totalCalorie_" + i2, i3).apply();
    }

    private void j(int i2, int i3) {
        if (SharedPreferenceManager.e(f40098b, "sync_module", "totalStep_" + i2, String.valueOf(i3), new StorageParams(2)) == 0) {
            LogUtil.d("HiH_HiSyncControl", "setLastTotalStep completed");
            this.p.edit().putInt("totalStep_" + i2, 0).apply();
            return;
        }
        this.p.edit().putInt("totalStep_" + i2, i3).apply();
    }

    private void a(int i2, boolean z) {
        this.p.edit().putBoolean("updatedevicestate_" + i2, z).apply();
    }

    private long ah() {
        return this.p.getLong("syncservicestarttimes", 0L);
    }

    private void am() {
        this.p.edit().putLong("syncservicestarttimes", System.currentTimeMillis()).apply();
    }

    private boolean aj() {
        return CommonUtil.ab(f40098b);
    }

    public static int i() {
        int i2 = i;
        if (i2 > 0) {
            return i2;
        }
        LogUtil.e("HiH_HiSyncControl", "error mSyncModel is ", Integer.valueOf(i2));
        return 2;
    }

    private static int w() {
        boolean zO = Utils.o();
        boolean zH = Utils.h();
        if (zO) {
            return zH ? 2 : 3;
        }
        return 1;
    }

    private static void l(int i2) {
        String strC = KeyValDbManager.d(f40098b).c("cloud_user_privacy3");
        if (1 == i2) {
            if ("false".equals(strC)) {
                e = false;
                LogUtil.d("HiH_HiSyncControl", "initSportDataPrivacy the sportDataPrivacyState switch is closed, stop push health data!");
            } else {
                e = true;
                LogUtil.d("HiH_HiSyncControl", "initSportDataPrivacy the sportDataPrivacyState switch is open, start push health data!");
            }
        }
        if (2 == i2) {
            if ("true".equals(strC)) {
                e = true;
                LogUtil.d("HiH_HiSyncControl", "initSportDataPrivacy the sportDataPrivacyState switch is open, start push health data!");
            } else {
                e = false;
                LogUtil.d("HiH_HiSyncControl", "initSportDataPrivacy the sportDataPrivacyState switch is closed, stop push health data!");
            }
        }
        ReleaseLogUtil.d("HiH_HiSyncControl", "initSptDtPcy sptDtPcyState=", Boolean.valueOf(e));
    }

    private static void r(int i2) {
        String strC = KeyValDbManager.d(f40098b).c("cloud_user_privacy2");
        if (1 == i2) {
            if ("false".equals(strC)) {
                f = false;
                LogUtil.d("HiH_HiSyncControl", "initUserPrivacy the userPrivacyState switch is closed, stop push user data!");
            } else {
                f = true;
                LogUtil.d("HiH_HiSyncControl", "initUserPrivacy the userPrivacyState switch is open, start push user data!");
            }
        }
        if (2 == i2) {
            if ("true".equals(strC)) {
                f = true;
                LogUtil.d("HiH_HiSyncControl", "initUserPrivacy the userPrivacyState switch is open, start push user data!");
            } else {
                f = false;
                LogUtil.d("HiH_HiSyncControl", "initUserPrivacy the userPrivacyState switch is closed, stop push user data!");
            }
        }
        ReleaseLogUtil.d("HiH_", "initUPcy uPcyState=", Boolean.valueOf(f));
    }

    private static void m(int i2) {
        String strC = KeyValDbManager.d(f40098b).c("cloud_user_privacy7");
        if (1 == i2) {
            if ("false".equals(strC)) {
                f40097a = false;
                LogUtil.d("HiH_HiSyncControl", "initHealthDataPrivacy the healthDataPrivacyState switch is closed, stop push health data!");
            } else if (HiCommonUtil.a(strC)) {
                f40097a = n();
            } else {
                f40097a = true;
                LogUtil.d("HiH_HiSyncControl", "initHealthDataPrivacy the healthDataPrivacyState switch is open, start push health data!");
            }
        }
        if (2 == i2) {
            if ("true".equals(strC)) {
                f40097a = true;
                LogUtil.d("HiH_HiSyncControl", "initHealthDataPrivacy the healthDataPrivacyState switch is open, start push health data!");
            } else if (HiCommonUtil.a(strC)) {
                f40097a = n();
            } else {
                f40097a = false;
                LogUtil.d("HiH_HiSyncControl", "initHealthDataPrivacy the healthDataPrivacyState switch is closed, stop push health data!");
            }
        }
        ReleaseLogUtil.d("HiH_", "initHlhDtPcy hlhDtPcyState=", Boolean.valueOf(f40097a));
    }

    private static void k(int i2) {
        String strC = KeyValDbManager.d(f40098b).c("key_wether_to_auth");
        if (1 == i2) {
            if ("false".equals(strC)) {
                j = false;
                LogUtil.d("HiH_HiSyncControl", "initUserConferPrivacy the userConferPrivacy switch is closed, can't do sync!");
            } else {
                j = true;
                LogUtil.d("HiH_HiSyncControl", "initUserConferPrivacy the userConferPrivacy switch is open, can do sync!");
            }
        }
        if (2 == i2) {
            if ("true".equals(strC)) {
                j = true;
                LogUtil.d("HiH_HiSyncControl", "initUserConferPrivacy the userConferPrivacy switch is open, can do sync!");
            } else {
                j = false;
                LogUtil.d("HiH_HiSyncControl", "initUserConferPrivacy the userConferPrivacy switch is closed, can't do sync!");
            }
        }
        ReleaseLogUtil.d("HiH_", "initUConfPcy uConfPcy=", Boolean.valueOf(j));
    }

    private static void ag() {
        int iW = w();
        LogUtil.d("HiH_", "initPrivacy cloudversion is ", Integer.valueOf(iW));
        k(iW);
        l(iW);
        r(iW);
        m(iW);
    }

    public void b(HiSyncOption hiSyncOption, int i2) {
        if (hiSyncOption == null) {
            LogUtil.j("HiH_HiSyncControl", " startOneDaySync hiSyncOption is null");
            return;
        }
        LogUtil.a("HiH_HiSyncControl", " startOneDaySync hiSyncOption = ", hiSyncOption);
        if (CommonUtil.ca()) {
            return;
        }
        if (w() == 3) {
            LogUtil.j("HiH_HiSyncControl", "startOneDaySync not, no cloud version.");
        } else {
            i(hiSyncOption, i2);
        }
    }

    public void e(HiSyncOption hiSyncOption, int i2) {
        if (hiSyncOption == null) {
            return;
        }
        liq.e(hiSyncOption);
        if (Utils.i()) {
            b(hiSyncOption);
            ReleaseLogUtil.e("HiH_HiSyncControl", "startSync BrowseMode, can't sync!");
            return;
        }
        if (CommonUtil.ca()) {
            b(hiSyncOption);
            return;
        }
        x();
        Context context = f40098b;
        int iC = kxi.c(context, i2);
        synchronized (this.l) {
            b(hiSyncOption, i2, iC);
            if (this.r == null) {
                this.r = new d(null);
                context.registerReceiver(this.r, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            }
        }
    }

    private void b(HiSyncOption hiSyncOption) {
        String strValueOf;
        if (hiSyncOption.getSyncDataType() == 0) {
            strValueOf = HiJsonUtil.d(hiSyncOption.getSyncDataTypes());
        } else {
            strValueOf = String.valueOf(hiSyncOption.getSyncDataType());
        }
        HiBroadcastUtil.e(f40098b, strValueOf, hiSyncOption.getSyncId(), false);
    }

    private void x() {
        Context context = f40098b;
        if (ljq.h(context, 0) || ljq.h(context, 10001)) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "don't execute startSync after beginTransaction, may appear deadlock.");
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("keyScene", "deadLock risk");
            linkedHashMap.put("trace", HiCommonUtil.a());
            ljv.d(context).c(OperationKey.HEALTH_APP_SQL_CIPHER_TIME_OUT_2129019.value(), linkedHashMap, false);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class d extends BroadcastReceiver {
        private d() {
        }

        /* synthetic */ d(AnonymousClass2 anonymousClass2) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            Object systemService = context.getSystemService("connectivity");
            if (systemService instanceof ConnectivityManager) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                LogUtil.d("HiH_HiSyncControl", "receive active network info = ", activeNetworkInfo);
                if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
                    return;
                }
                ThreadPoolManager.c().execute(new Runnable() { // from class: lgp.d.3
                    @Override // java.lang.Runnable
                    public void run() {
                        lgp.f().e(HiSyncOption.getDefaultAutoSyncOption(), kwi.b().b(context.getPackageName()));
                    }
                });
            }
        }
    }

    public void a(HiSyncOption hiSyncOption, int i2, int i3, int i4, int i5) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
        linkedHashMap.put("startSync", "dataType " + i5);
        Context context = f40098b;
        ljv.d(context).c(OperationKey.HEALTH_APP_START_SYNC.value(), linkedHashMap, false);
        if (CommonUtil.ca()) {
            return;
        }
        int iC = kxi.c(context, i2);
        synchronized (this.l) {
            LogUtil.a("HiH_HiSyncControl", "startSync ", hiSyncOption, ",app=", Integer.valueOf(i2), ",who=", Integer.valueOf(iC), ",sTm=", Integer.valueOf(i3), ",eTm=", Integer.valueOf(i4));
            if (hiSyncOption == null) {
                return;
            }
            int syncDataType = hiSyncOption.getSyncDataType();
            if (!d(i2, hiSyncOption)) {
                HiBroadcastUtil.d(context, syncDataType, -1);
                return;
            }
            Intent intent = new Intent(context, (Class<?>) HiSyncService.class);
            intent.putExtra("sync_option", hiSyncOption);
            intent.putExtra("sync_appId", i2);
            intent.putExtra("sync_main_UserID", iC);
            intent.putExtra("sync_starttime", i3);
            intent.putExtra("sync_endtime", i4);
            intent.putExtra("sync_datatype", i5);
            ReleaseLogUtil.d("HiH_HiSyncControl", "startSync componentName ", context.startService(intent));
        }
    }

    private void i(HiSyncOption hiSyncOption, int i2) {
        int iC = kxi.c(f40098b, i2);
        LogUtil.a("HiH_HiSyncControl", "doOneDaySync hiSyncOption = ", hiSyncOption, ", appId = ", Integer.valueOf(i2), ", who = ", Integer.valueOf(iC));
        if (d(hiSyncOption, i2, iC)) {
            k(hiSyncOption, iC);
        }
    }

    private void k(HiSyncOption hiSyncOption, int i2) {
        int syncDataType = hiSyncOption.getSyncDataType();
        LogUtil.a("HiH_HiSyncControl", "startDaySync hiSyncOption = ", hiSyncOption, ", mainUserId = ", Integer.valueOf(i2), ", type=", Integer.valueOf(syncDataType));
        if (syncDataType != 10019 && syncDataType != 10021 && syncDataType != 10023) {
            switch (syncDataType) {
                case 10011:
                case 10012:
                case 10013:
                    break;
                default:
                    if (HiHealthDictManager.a((Context) null).a(syncDataType) == null) {
                        return;
                    }
                    break;
            }
        }
        try {
            g(hiSyncOption, i2);
        } catch (lif e2) {
            ReleaseLogUtil.a("HiH_HiSyncControl", "startSync syncDataType!=right ", e2.getMessage());
        }
    }

    private void g(HiSyncOption hiSyncOption, int i2) throws lif {
        ReleaseLogUtil.d("HiH_HiSyncControl", "downloadOneDetailData syncDataType = " + hiSyncOption.getSyncDataType(), " getSyncType ", Integer.valueOf(hiSyncOption.getSyncType()));
        int syncDataType = hiSyncOption.getSyncDataType();
        if (syncDataType == 10019) {
            h(hiSyncOption, i2).c(11, hiSyncOption.getSyncStartTime(), hiSyncOption.getSyncEndTime());
            return;
        }
        if (syncDataType == 10021) {
            h(hiSyncOption, i2).c(12, hiSyncOption.getSyncStartTime(), hiSyncOption.getSyncEndTime());
            return;
        }
        if (syncDataType != 10023) {
            switch (syncDataType) {
                case 10011:
                    f(hiSyncOption, i2).a(hiSyncOption.getSyncStartTime(), hiSyncOption.getSyncEndTime());
                    break;
                case 10012:
                    h(hiSyncOption, i2).d(hiSyncOption.getSyncType(), hiSyncOption.getSyncStartTime(), hiSyncOption.getSyncEndTime());
                    break;
                case 10013:
                    h(hiSyncOption, i2).c(7, hiSyncOption.getSyncStartTime(), hiSyncOption.getSyncEndTime());
                    break;
                default:
                    if (HiHealthDictManager.a((Context) null).a(hiSyncOption.getSyncDataType()) != null) {
                        a(hiSyncOption, i2).downloadByTime(hiSyncOption.getSyncDataType(), HiDateUtil.p(hiSyncOption.getSyncStartTime()), HiDateUtil.g(hiSyncOption.getSyncEndTime()));
                        break;
                    }
                    break;
            }
            return;
        }
        c(hiSyncOption, i2).d(16, hiSyncOption.getSyncStartTime(), hiSyncOption.getSyncEndTime());
    }

    private lhf f(HiSyncOption hiSyncOption, int i2) {
        return new lhf(f40098b, new HiSyncOption(hiSyncOption, 1), i2);
    }

    private lhg h(HiSyncOption hiSyncOption, int i2) throws lif {
        return new lhg(f40098b, new HiSyncOption(hiSyncOption, 10001), i2);
    }

    private lhe c(HiSyncOption hiSyncOption, int i2) {
        return new lhe(f40098b, new HiSyncOption(hiSyncOption, 10001), i2);
    }

    private HiSyncDictionaryDataDetail a(HiSyncOption hiSyncOption, int i2) {
        return new HiSyncDictionaryDataDetail(f40098b, new HiSyncOption(hiSyncOption, hiSyncOption.getSyncDataType()), i2);
    }

    private void b(HiSyncOption hiSyncOption, int i2, int i3) {
        ReleaseLogUtil.d("HiH_HiSyncControl", "startSync hiSyncOption=", hiSyncOption, ",app=", Integer.valueOf(i2), ",who=", Integer.valueOf(i3));
        int syncAction = hiSyncOption.getSyncAction();
        if (!d(hiSyncOption, i2, i3)) {
            if (syncAction == 0) {
                b(hiSyncOption);
                HiBroadcastUtil.f(f40098b);
                return;
            }
            return;
        }
        if (!q(hiSyncOption.getSyncDataType()) && !hiSyncOption.isForceSync() && g) {
            long jAh = ah();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jAh > 3600000) {
                LogUtil.e("HiH_HiSyncControl", "lastSyncStartTime=", Long.valueOf(jAh), ",currTime=", Long.valueOf(jCurrentTimeMillis), " destroy last sync service");
                Context context = f40098b;
                context.stopService(new Intent(context, (Class<?>) HiSyncService.class));
                e(false);
                a(false);
                liq.e(false);
            } else if (hiSyncOption.getSyncManual() == 1 && h) {
                try {
                    lsb.d().e(20210701);
                } catch (Exception e2) {
                    ReleaseLogUtil.a("HiH_HiSyncControl", "sync cancel notify throw exception", LogAnonymous.b(e2));
                }
                Context context2 = f40098b;
                context2.stopService(new Intent(context2, (Class<?>) HiSyncService.class));
                e(false);
                a(false);
                String accountInfo = LoginInit.getInstance(context2).getAccountInfo(1011);
                if (TextUtils.isEmpty(accountInfo)) {
                    ReleaseLogUtil.d("HiH_HiSyncControl", "setSharedPreference huid null");
                    return;
                }
                ReleaseLogUtil.d("HiH_HiSyncControl", "Manual stop allAreaSyncTask");
                SharedPreferenceManager.e(context2, String.valueOf(20003), accountInfo + "data_downing_flag", "", null);
            } else {
                ReleaseLogUtil.e("HiH_HiSyncControl", "startSync it is syncing right now !  hiSyncOption is ", hiSyncOption);
                lis.c(hiSyncOption.getSyncAction());
                lis.b(f40098b);
                return;
            }
        }
        c(syncAction, i3);
        if (syncAction != 0 && !d(hiSyncOption.getSyncAction(), i3)) {
            LogUtil.j("HiH_HiSyncControl", "ifCanAutoSync false");
            return;
        }
        if (!d(i2, hiSyncOption)) {
            Context context3 = f40098b;
            HiBroadcastUtil.f(context3);
            if (liq.f(context3, i3)) {
                b(hiSyncOption);
                return;
            }
            return;
        }
        e(hiSyncOption, i2, i3);
        if (4 == syncAction) {
            ao();
        } else {
            g(syncAction);
        }
    }

    private void e(HiSyncOption hiSyncOption, int i2, int i3) {
        if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
            HiBroadcastUtil.j(f40098b);
        }
        if (20000 == hiSyncOption.getSyncDataType()) {
            am();
        }
        if (hiSyncOption.getSyncDataType() == 20000 && hiSyncOption.getSyncAction() != 0 && liq.d(f40098b, i3, 1, 0L)) {
            ReleaseLogUtil.d("HiH_HiSyncControl", "First all sync task, change sync action to MANUAL_SYNC");
            hiSyncOption.setSyncAction(0);
        }
        Context context = f40098b;
        Intent intent = new Intent(context, (Class<?>) HiSyncService.class);
        intent.putExtra("sync_option", hiSyncOption);
        intent.putExtra("sync_appId", i2);
        intent.putExtra("sync_main_UserID", i3);
        try {
            ComponentName componentNameStartService = context.startService(intent);
            ReleaseLogUtil.d("HiH_HiSyncControl", "handleSyncService cptNm=", componentNameStartService);
            if (componentNameStartService == null || hiSyncOption.getSyncDataType() != 20000) {
                return;
            }
            ReleaseLogUtil.d("HiH_HiSyncControl", "All sync task arrive， set mHasAllSyncTask true");
            e(true);
            if (hiSyncOption.getSyncDataArea() == 1) {
                LogUtil.a("HiH_HiSyncControl", "All sync task arrive，setHasAllAreaSyncTask true");
                a(true);
            }
        } catch (IllegalStateException e2) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "doSync ", e2.getMessage());
        } catch (Exception e3) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "handleSyncService Exception", LogAnonymous.b(e3));
        }
    }

    private void ao() {
        int iAe = ae() + 1;
        LogUtil.a("HiH_HiSyncControl", "total sport stat sync times is ", Integer.valueOf(iAe));
        this.p.edit().putInt("totalSportStatSyncTimes", iAe).apply();
    }

    public void a(String str, int i2, int i3) {
        LogUtil.a("HiH_HiSyncControl", "broadcastSync begin dataType is ", Integer.valueOf(i2));
        if (str == null) {
            return;
        }
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(i3);
        hiSyncOption.setSyncDataType(i2);
        hiSyncOption.setSyncMethod(2);
        int iB = kwi.b().b(str);
        if (i2 == 20000 && i3 == 5 && liq.j()) {
            j(hiSyncOption, iB);
            return;
        }
        e(hiSyncOption, iB);
        if (!EnvironmentInfo.l() && i2 == 20000 && i3 == 5) {
            g(i2, i3);
        }
    }

    private void j(final HiSyncOption hiSyncOption, final int i2) {
        HandlerCenter.a().d(new Runnable() { // from class: lgn
            @Override // java.lang.Runnable
            public final void run() {
                this.f40090a.d(hiSyncOption, i2);
            }
        }, liq.i());
    }

    /* synthetic */ void d(HiSyncOption hiSyncOption, int i2) {
        e(hiSyncOption, i2);
        if (CommonUtil.ap() && hiSyncOption.getSyncDataType() == 20000 && hiSyncOption.getSyncAction() == 5) {
            g(hiSyncOption.getSyncDataType(), hiSyncOption.getSyncAction());
        }
    }

    private void g(int i2, int i3) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("sync_datatype", String.valueOf(i2));
        linkedHashMap.put("sync_action", String.valueOf(i3));
        linkedHashMap.put("sync_time", String.valueOf(System.currentTimeMillis()));
        linkedHashMap.put("sdk_ver", Build.VERSION.RELEASE);
        linkedHashMap.put("sdk_int", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("dev_manufacturer", Build.MANUFACTURER);
        linkedHashMap.put("dev_model", Build.MODEL);
        linkedHashMap.put("dev_brand", Build.BRAND);
        linkedHashMap.put("dev_display", Build.DISPLAY);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_DATA_SYNC_ALARM_2129018.value(), linkedHashMap);
    }

    private int e(int i2, int i3) {
        long j2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jAa = jCurrentTimeMillis - aa();
        long jAd = jCurrentTimeMillis - ad();
        if (jAa < 0) {
            jAa = 0 - jAa;
        }
        if (jAd < 0) {
            jAd = 0 - jAd;
        }
        if (n(i2) > 1) {
            j2 = 600000;
        } else {
            j2 = liq.f() ? WorkRequest.MAX_BACKOFF_MILLIS : AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL;
        }
        LogUtil.a("HiH_HiSyncControl", "checkSyncIntervalTime autoSyncTime=", Long.valueOf(j2), ",detailinterval=", Long.valueOf(jAa), ",statinterval=", Long.valueOf(jAd), "syncType:", Integer.valueOf(i3));
        if (i3 == 1) {
            return jAa > j2 ? 10008 : -1;
        }
        if (i3 == 2) {
            return c(jAd) ? 10004 : -1;
        }
        if (i3 != 3) {
            return -1;
        }
        if (jAa > j2) {
            return 10008;
        }
        return c(jAd) ? 10004 : -1;
    }

    private boolean c(long j2) {
        if (ScreenUtil.d()) {
            return j2 > 60000;
        }
        if (j2 > 600000) {
            return true;
        }
        if (j2 <= 60000) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return HiDateUtil.e(jCurrentTimeMillis, 21, 30) <= jCurrentTimeMillis && jCurrentTimeMillis <= HiDateUtil.e(jCurrentTimeMillis, 22, 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        int iV = v();
        LogUtil.a("HiH_HiSyncControl", "appSynTimes is ", Integer.valueOf(iV), ", statsyncTimes is ", Integer.valueOf(z()), ", totalSportStatSyncTimes is ", Integer.valueOf(ae()));
        if (iV <= 400) {
            return true;
        }
        LogUtil.j("HiH_HiSyncControl", "basicSyncCondition! the app has sync more times,appSynTimes is ", Integer.valueOf(iV));
        return false;
    }

    private boolean d(int i2, HiSyncOption hiSyncOption) {
        if (!ThermalCallback.getInstance().isTriggerTask() && !hiSyncOption.isForceSync() && !liq.h()) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "ifCanSync not! temperature is too high");
            return false;
        }
        ag();
        if (!al()) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "ifCanSync not! user didn't auth user confer! can not do sync!");
            return false;
        }
        if (3 == w()) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "ifCanSync not! no cloud version");
            return false;
        }
        if (!aj()) {
            r();
            ReleaseLogUtil.e("HiH_HiSyncControl", "ifCanSync not! no networkConnected");
            return false;
        }
        if (PowerKitManager.a().b()) {
            r();
            ReleaseLogUtil.e("HiH_HiSyncControl", "ifCanSync not! isUserSleeping");
            return false;
        }
        if (s(i2)) {
            return true;
        }
        ReleaseLogUtil.e("HiH_HiSyncControl", "ifCanSync not! not login in database");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    private boolean d(int i2, int i3) {
        if (i2 == 1) {
            if (!b(i3, i2)) {
                ReleaseLogUtil.e("HiH_HiSyncControl", "ifCanAutoSync basicSyncCondition is false , auto sync action is ", Integer.valueOf(i2));
                return false;
            }
        } else if (i2 != 5) {
            if (i2 == 6) {
                if (!b(i3, i2)) {
                    ReleaseLogUtil.e("HiH_HiSyncControl", "ifCanAutoSync basicSyncCondition is false , auto sync action is ", Integer.valueOf(i2));
                    return false;
                }
            }
        } else if (!an()) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "ifCanAutoSync isInSyncTimes is false,auto sync action is ", Integer.valueOf(i2));
            return false;
        }
        return true;
    }

    private boolean an() {
        return v() <= 400;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    private boolean b(int i2, int i3) {
        long j2;
        f(i2);
        int iW = w();
        if (1 != iW) {
            j2 = 600000;
        } else if (1 >= n(i2)) {
            j2 = AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL;
        } else if (i3 == 6) {
            j2 = 60000;
        } else {
            j2 = 600000;
        }
        if (2 == iW) {
            j2 = WorkRequest.MAX_BACKOFF_MILLIS;
        }
        LogUtil.d("HiH_HiSyncControl", "checkSyncIntervalTime autoSyncTime=", Long.valueOf(j2));
        long jCurrentTimeMillis = System.currentTimeMillis() - aa();
        if (0 > jCurrentTimeMillis) {
            jCurrentTimeMillis = 0 - jCurrentTimeMillis;
        }
        if (jCurrentTimeMillis <= j2) {
            LogUtil.j("HiH_HiSyncControl", "basicSyncCondition NOT! the app has sync too quick,intervalTime is ", Long.valueOf(jCurrentTimeMillis));
            return false;
        }
        int iV = v();
        LogUtil.d("HiH_HiSyncControl", "stepSyncOrNot appSynTimes is ", Integer.valueOf(iV));
        if (iV <= 400) {
            return true;
        }
        LogUtil.j("HiH_HiSyncControl", "basicSyncCondition NOT! the app has sync too many times,appSynTimes is ", Integer.valueOf(iV));
        return false;
    }

    private boolean s(int i2) {
        String strD = kwg.b().d(i2);
        if (strD != null && !strD.contains("com.")) {
            return true;
        }
        LogUtil.j("HiH_HiSyncControl", "isLogin such app can not sync , app is ", Integer.valueOf(i2));
        return false;
    }

    private void g(int i2) {
        if (3 == i2) {
            d(System.currentTimeMillis());
            this.p.edit().putInt("statsynctotalnum", z() + 1).apply();
        } else {
            ar();
        }
        this.p.edit().putInt("appAutoSyncTimes", this.p.getInt("appAutoSyncTimes", 0) + 1).apply();
    }

    public void b(int i2) {
        Context context = f40098b;
        int iB = liq.b(context, i2, HiDateUtil.d(System.currentTimeMillis()), 40002);
        h(i2, liq.b(context, i2, HiDateUtil.d(System.currentTimeMillis()), 40003));
        j(i2, iB);
    }

    private void ak() {
        this.p.edit().putInt("appAutoSyncTimes", 0).apply();
        if (0 == aa()) {
            this.p.edit().putLong("lastSyncBeginTime", HiDateUtil.p(System.currentTimeMillis())).apply();
        }
        this.p.edit().putInt("statsynctotalnum", 0).apply();
        this.p.edit().putInt("totalSportStatSyncTimes", 0).apply();
    }

    private void f(int i2) {
        int iD = HiDateUtil.d(System.currentTimeMillis());
        int iS = s();
        if (iD != iS) {
            LogUtil.a("HiH_HiSyncControl", "checkCurrentDay a new day comes , reset basicSyncCondition, currentDay is ", Integer.valueOf(iD), " oldDay is ", Integer.valueOf(iS));
            Context context = f40098b;
            lkb.j(context, v() + ae());
            ljl.a(context).d();
            ljl.a(context).a();
            lkb.a(context, iD);
            t(iD);
            ak();
            d(System.currentTimeMillis());
            h(i2, 0);
            j(i2, 0);
            String strD = kxq.c().d(i2);
            lkb.c(context, strD, 0);
            KeyValDbManager.d(context).b(strD + "step_sum_dvalue", String.valueOf(0));
        }
    }

    private void c(int i2, int i3) {
        int iD;
        f(i3);
        if (4 != i2 || (iD = HiDateUtil.d(System.currentTimeMillis())) == ac()) {
            return;
        }
        Context context = f40098b;
        ljl.a(context).c();
        if (!Utils.o()) {
            ljl.a(context).a(n(i3));
        }
        p(iD);
    }

    public void a(int i2) {
        int iH;
        int iD = HiDateUtil.d(System.currentTimeMillis());
        int iT = t();
        int iAb = ab();
        LogUtil.a("HiH_HiSyncControl", "checkCurrentDayBindDevice a new day comes, currentday is ", Integer.valueOf(iD), " oldDay is ", Integer.valueOf(iT), " r is ", Integer.valueOf(iAb));
        if (iD != iT) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis >= HiDateUtil.p(jCurrentTimeMillis) + ((long) iAb)) {
                if (w() == 3) {
                    LogUtil.j("HiH_HiSyncControl", "checkCurrentDayBindDevice not! no cloud version");
                    iH = -1;
                } else {
                    iH = liq.h(f40098b, i2);
                    LogUtil.a("HiH_HiSyncControl", "checkCurrentDayBindDevice n:", Integer.valueOf(iH));
                }
                if (iH < 0) {
                    LogUtil.e("HiH_HiSyncControl", "checkCurrentDayBindDevice fail !");
                    a(i2, true);
                    f(i2, 1);
                } else {
                    a(i2, true);
                    f(i2, iH);
                }
                d(iD);
            }
        }
    }

    public void u() {
        if (EnvironmentInfo.l()) {
            aq();
        }
    }

    private void aq() {
        if (this.n.get() != null) {
            return;
        }
        BroadcastManagerUtil.d(f40098b, this.o, new IntentFilter("com.huawei.hihealth.action_one_hour_sync"), LocalBroadcast.f36595c, null);
        ReleaseLogUtil.d("HiH_HiSyncControl", "register AlarmManagerBroadcastReceiver end");
        LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.n, null, CommonUtil.m());
        if (this.n.get() != null) {
            ReleaseLogUtil.d("HiH_HiSyncControl", "start background sync alarmManager.");
            ArrayList arrayList = new ArrayList();
            arrayList.add("com.huawei.hihealth.action_one_hour_sync");
            PowerKitManager.a().e(arrayList);
            Intent intent = new Intent("com.huawei.hihealth.action_one_hour_sync");
            intent.setPackage(BaseApplication.getAppPackage());
            this.n.get().setRepeating(0, System.currentTimeMillis(), ai(), PendingIntent.getBroadcast(BaseApplication.getContext(), 0, intent, 67108864));
            ReleaseLogUtil.d("HiH_HiSyncControl", "startAlarmManager success");
        }
    }

    private long ai() {
        return ((long) new SecureRandom().nextInt(300000)) + 3600000;
    }

    public void r() {
        if (Utils.o()) {
            return;
        }
        synchronized (this.t) {
            if (this.k != null) {
                return;
            }
            LogUtil.a("HiH_HiSyncControl", "startNetErrorTimer");
            Timer timer = new Timer("HiH_HiSyncControl");
            this.k = timer;
            timer.schedule(new TimerTask() { // from class: lgp.4
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    lgp.this.a(lgp.f40098b.getPackageName(), 20000, 5);
                }
            }, 600000L, 600000L);
        }
    }

    public void o() {
        synchronized (this.t) {
            if (this.k != null) {
                LogUtil.a("HiH_HiSyncControl", "cancelNetErrorTimer");
                this.k.cancel();
                this.k = null;
            }
        }
    }

    public void p() {
        kwi kwiVarB = kwi.b();
        Context context = f40098b;
        int iC = kxi.c(context, kwiVarB.b(context.getPackageName()));
        int iA = liq.a();
        if (iA < 0) {
            iA = liq.d(context, iC);
        }
        if (iA == 0) {
            return;
        }
        if (System.currentTimeMillis() - liq.e(context, iC) > 43200000) {
            a(context, iC, 300000);
        }
    }

    public static boolean d(HiSyncOption hiSyncOption, int i2, int i3) {
        if (hiSyncOption == null) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "paraCheck hiSyncOption is null");
            return false;
        }
        if (hiSyncOption.getSyncMethod() != 2) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "paraCheck syncMethod is not by_user");
            return false;
        }
        if (i2 <= 0) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "paraCheck app <= 0 ");
            return false;
        }
        if (i3 <= 0) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "paraCheck who <= 0 ");
            return false;
        }
        if (HiSyncType.c(hiSyncOption.getSyncDataType()) || hiSyncOption.getSyncDataTypes() != null) {
            return true;
        }
        ReleaseLogUtil.e("HiH_HiSyncControl", "paraCheck error syncType type is ", Integer.valueOf(hiSyncOption.getSyncDataType()));
        return false;
    }

    public void b(int i2, List<HiHealthData> list) {
        if (list == null) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "data is null");
            return;
        }
        if (!lke.e(list)) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "startInsSptSync no SptDt");
            return;
        }
        Context context = f40098b;
        int iC = kxi.c(context, i2);
        if (iC <= 0) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "startInsSptSync who<=0");
            return;
        }
        if (!y()) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "startInsSptSync CkSyncTm=false");
            return;
        }
        f(iC);
        int iC2 = c(context, iC);
        if (iC2 == 0) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "ckSptDtNum Less StepAndCals");
            return;
        }
        int iE = e(iC, iC2);
        if (-1 == iE) {
            ReleaseLogUtil.e("HiH_HiSyncControl", "startInsSptSync CkSyncItvalTm=false");
            return;
        }
        ar();
        d(System.currentTimeMillis());
        LogUtil.a("HiH_HiSyncControl", "startInsertSportSync start auto sync,app is ", Integer.valueOf(i2));
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        c(iE, hiSyncOption, kxi.c(context, i2));
        hiSyncOption.setSyncMethod(2);
        e(hiSyncOption, i2);
    }

    private void c(int i2, HiSyncOption hiSyncOption, int i3) {
        if (10008 == i2) {
            Context context = f40098b;
            if (liq.d(context, i3, 1, 0L)) {
                LogUtil.a("HiH_HiSyncControl", "startInsertSportSync first 500 steps sync,do all sync");
                hiSyncOption.setSyncDataType(20000);
            } else {
                LogUtil.d("HiH_HiSyncControl", "startInsertSportSync not first 500 steps sync,do push_sport_data sync");
                hiSyncOption.setSyncDataType(10008);
            }
            hiSyncOption.setSyncAction(2);
            lkb.b(context, lkb.a(context) + 1);
        }
        if (10004 == i2) {
            Context context2 = f40098b;
            if (liq.d(context2, i3, 1, 0L)) {
                LogUtil.a("HiH_HiSyncControl", "startInsertSportSync first stat 500 steps sync,do all sync");
                hiSyncOption.setSyncDataType(20000);
            } else {
                LogUtil.d("HiH_HiSyncControl", "startInsertSportSync sync stat data");
                hiSyncOption.setSyncDataType(i2);
            }
            hiSyncOption.setSyncAction(3);
            lkb.c(context2, lkb.c(context2) + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(Context context, int i2) {
        int iO = o(i2);
        int iJ = j(i2);
        l(w());
        int i3 = 0;
        if (!n()) {
            LogUtil.d("HiH_HiSyncControl", "checkSportDataNum sport privacy is close return 0");
            return 0;
        }
        HiHealthData hiHealthDataB = liq.b(context, i2);
        if (hiHealthDataB != null) {
            int i4 = hiHealthDataB.getInt("step");
            int i5 = hiHealthDataB.getInt("calorie");
            if (i4 >= iO || i5 >= iJ) {
                LogUtil.a("HiH_HiSyncControl", "checkInsertStatus stepSum or calorieSum is enough");
                i3 = 1;
            }
        }
        Context context2 = f40098b;
        int iB = liq.b(context2, i2, HiDateUtil.d(System.currentTimeMillis()), 40002);
        int i6 = i(i2);
        int iB2 = liq.b(context2, i2, HiDateUtil.d(System.currentTimeMillis()), 40003);
        int iH = h(i2);
        if (iB - i6 < iO && iB2 - iH < iJ) {
            return i3;
        }
        LogUtil.d("HiH_HiSyncControl", "checkInsertStatus stepStatSum or calorieStatSum is enough");
        return i3 + 2;
    }

    private int o(int i2) {
        return (2 != w() || 2 <= n(i2)) ? 500 : 1500;
    }

    private int j(int i2) {
        return (2 != w() || 2 <= n(i2)) ? 100000 : 300000;
    }

    public void q() {
        synchronized (this.l) {
            d dVar = this.r;
            if (dVar != null) {
                f40098b.unregisterReceiver(dVar);
                this.r = null;
            }
        }
    }

    public static boolean e(int i2) {
        return f40098b.getSharedPreferences("downloadsevendaysleepflag", 0).getBoolean("downloadsevendaysleepflag_" + Integer.toString(i2), true);
    }

    public static void e(int i2, boolean z) {
        f40098b.getSharedPreferences("downloadsevendaysleepflag", 0).edit().putBoolean("downloadsevendaysleepflag_" + Integer.toString(i2), z).apply();
    }

    /* JADX INFO: loaded from: classes10.dex */
    class a extends BroadcastReceiver {
        private a() {
        }

        /* synthetic */ a(lgp lgpVar, AnonymousClass2 anonymousClass2) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            if (context == null || intent == null || !"android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                return;
            }
            if (!lgp.this.y()) {
                ReleaseLogUtil.e("HiH_HiSyncControl", "Screen on checkSyncTimes is false");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: lgm
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40089c.d(context);
                    }
                });
            }
        }

        /* synthetic */ void d(Context context) {
            HiBroadcastUtil.h(context);
            a();
        }

        private void a() {
            if (lgp.this.c(lgp.f40098b, kxi.c(lgp.f40098b, kwi.b().b(lgp.f40098b.getPackageName()))) != 0) {
                lgp.this.a(lgp.f40098b.getPackageName(), 10004, 6);
            } else {
                ReleaseLogUtil.e("HiH_HiSyncControl", "ckStepDtNum LESS StepAndCals OnScreen");
            }
        }
    }
}
