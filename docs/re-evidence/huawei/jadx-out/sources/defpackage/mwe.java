package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public class mwe {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f42556b;
    private volatile b d;

    public boolean d(int i) {
        return i <= 2;
    }

    /* JADX INFO: loaded from: classes11.dex */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final mwe f42557a = new mwe();
    }

    private mwe() {
        this.f42556b = false;
    }

    public static mwe a() {
        return a.f42557a;
    }

    public void a(int i) {
        ReleaseLogUtil.d("R_HiAiSleepManager", "dealSleepAction enter action:", Integer.valueOf(i));
        if (i == 4) {
            t();
        } else if (i == 16) {
            r();
        } else {
            LogUtil.j("HiAiSleepManager", "error action:", Integer.valueOf(i));
        }
    }

    private void t() {
        mwk.e().g();
        mwk.e().h();
        c(false);
        o();
    }

    private void r() {
        mwk.e().c();
        c(true);
        c();
    }

    public void b() {
        SharedPreferenceManager.i(BaseApplication.b(), "MODULE_HW_AI_SCENES_SLEEP_SCREEN_DATA");
        SharedPreferenceManager.i(BaseApplication.b(), "MODULE_HW_AI_SCENES_SLEEP_SENSOR_DATA");
    }

    public void c(Boolean bool) {
        SharedPreferenceManager.a("MODULE_HW_AI_SCENES_SLEEP_MODEL", "KEY_HW_AI_SCENES_SLEEP_MODEL", bool.booleanValue());
    }

    public boolean h() {
        return SharedPreferenceManager.b("MODULE_HW_AI_SCENES_SLEEP_MODEL", "KEY_HW_AI_SCENES_SLEEP_MODEL", false);
    }

    public void a(Boolean bool) {
        SharedPreferenceManager.a("MODULE_HW_AI_SCENES_SLEEP_RECORD", "KEY_HW_SLEEP_CONFIG_UPDATE_FLAG", bool.booleanValue());
    }

    public boolean n() {
        return SharedPreferenceManager.b("MODULE_HW_AI_SCENES_SLEEP_RECORD", "KEY_HW_SLEEP_CONFIG_UPDATE_FLAG", false);
    }

    public void m() {
        SharedPreferenceManager.c("MODULE_HW_AI_SCENES_SLEEP_RECORD", "KEY_HW_LAST_SEND_SENSOR_TIME", System.currentTimeMillis());
    }

    public boolean k() {
        return Math.abs(System.currentTimeMillis() - SharedPreferenceManager.d("MODULE_HW_AI_SCENES_SLEEP_RECORD", "KEY_HW_LAST_SEND_SENSOR_TIME", 0L)) >= 3600000;
    }

    public boolean i() {
        return CollectionUtils.a(d()) && CollectionUtils.a(g());
    }

    public void a(mwj mwjVar) {
        if (mwjVar == null) {
            return;
        }
        SharedPreferenceManager.e(BaseApplication.b(), "MODULE_HW_AI_SCENES_SLEEP_RECORD", "KEY_HW_AI_SCENES_LAST_SLEEP_RECORD", qqt.b(mwjVar), new StorageParams());
    }

    public mwj f() {
        String strE = SharedPreferenceManager.e(BaseApplication.b(), "MODULE_HW_AI_SCENES_SLEEP_RECORD", "KEY_HW_AI_SCENES_LAST_SLEEP_RECORD");
        if (StringUtils.g(strE)) {
            return new mwj();
        }
        return (mwj) HiJsonUtil.d(strE, mwj.class);
    }

    public void l() {
        synchronized (this) {
            if (!mwi.a().c()) {
                ReleaseLogUtil.e("R_HiAiSleepManager", "startMonitor not support ai sleep");
                return;
            }
            if (!this.f42556b) {
                this.f42556b = true;
                LogUtil.a("HiAiSleepManager", "startMonitor-->querySensorData");
                mws.a().e();
            }
            if (this.d != null) {
                this.d.c();
                this.d = null;
            }
            Timer timer = new Timer("HiAiSleepTimer", true);
            b bVar = new b(timer, new Consumer() { // from class: mwn
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f42580c.b((mwe.b) obj);
                }
            });
            this.d = bVar;
            timer.schedule(bVar, 100L, 5000L);
            LogUtil.a("HiAiSleepManager", "startMonitor-->start");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(b bVar) {
        synchronized (this) {
            if (this.d != bVar) {
                return;
            }
            mws.a().j();
            this.f42556b = false;
            this.d = null;
        }
    }

    public Long e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return Long.valueOf((jCurrentTimeMillis - (jCurrentTimeMillis % 60000)) / 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, String str2, Object obj) {
        SharedPreferenceManager.e(BaseApplication.b(), str, str2, qqt.b(obj), new StorageParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public mwg d(String str, String str2) {
        String strE = SharedPreferenceManager.e(BaseApplication.b(), str, str2);
        if (StringUtils.g(strE)) {
            return new mwg();
        }
        return (mwg) HiJsonUtil.d(strE, mwg.class);
    }

    public mwj j() {
        String strE = SharedPreferenceManager.e(BaseApplication.b(), "MODULE_HW_AI_SCENES_SLEEP_RECORD", "KEY_HW_AI_SCENES_LAST_SLEEP_RECORD");
        if (StringUtils.g(strE)) {
            LogUtil.j("HiAiSleepManager", "getCurrentSleepData sleepRecordJson is empty");
            return new mwj();
        }
        mwj mwjVar = (mwj) HiJsonUtil.d(strE, mwj.class);
        if (mwjVar == null) {
            return new mwj();
        }
        mwj mwjVarP = p();
        if (mwjVarP.f() == 0) {
            return mwjVarP;
        }
        c(mwjVarP, mwjVar);
        return mwjVarP;
    }

    public mwg b(mwj mwjVar) {
        if (d(Math.max(Math.max(mwjVar.c(), mwjVar.d()), mwjVar.a()))) {
            ReleaseLogUtil.d("R_HiAiSleepManager", "getCurrentSleepData max <=2");
            return new mwg();
        }
        mwg mwgVar = new mwg();
        mwgVar.a(e().longValue());
        mwgVar.d(mwjVar.c());
        mwgVar.c(mwjVar.d());
        mwgVar.e(mwjVar.a());
        return mwgVar;
    }

    public List<mwg> d() {
        List<mwg> listB = b("MODULE_HW_AI_SCENES_SLEEP_SCREEN_DATA");
        if (listB.size() <= 400) {
            return listB;
        }
        listB.sort(new Comparator() { // from class: mwl
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((mwg) obj2).b(), ((mwg) obj).b());
            }
        });
        return listB.subList(0, 400);
    }

    public List<mwg> g() {
        List<mwg> listB = b("MODULE_HW_AI_SCENES_SLEEP_SENSOR_DATA");
        if (listB.size() <= 400) {
            return listB;
        }
        listB.sort(new Comparator() { // from class: mwf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((mwg) obj2).a(), ((mwg) obj).a());
            }
        });
        return listB.subList(0, 400);
    }

    private List<mwg> b(String str) {
        mwg mwgVar;
        ArrayList arrayList = new ArrayList();
        Map<String, String> mapE = SharedPreferenceManager.e(BaseApplication.b(), str);
        if (mapE != null) {
            for (Map.Entry<String, String> entry : mapE.entrySet()) {
                if (!StringUtils.g(entry.getValue()) && (mwgVar = (mwg) HiJsonUtil.d(entry.getValue(), mwg.class)) != null) {
                    arrayList.add(mwgVar);
                }
            }
        }
        return arrayList;
    }

    private mwj p() {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        mwj mwjVar = new mwj();
        mwjVar.i(mws.a().d());
        mwjVar.j(mws.a().b());
        mwjVar.h(mws.a().c());
        mwjVar.b(ScreenUtil.d() ? 1 : 0);
        mwjVar.d(jCurrentTimeMillis);
        return (mwjVar.e() == 0 && mwjVar.i() == 0 && mwjVar.g() == 0) ? new mwj() : mwjVar;
    }

    private void c(mwj mwjVar, mwj mwjVar2) {
        int iMin = Math.min(Math.abs(mwjVar.e() - mwjVar2.e()), 200 - Math.abs(mwjVar.e() - mwjVar2.e()));
        int iMin2 = Math.min(Math.abs(mwjVar.i() - mwjVar2.i()), 200 - Math.abs(mwjVar.i() - mwjVar2.i()));
        int iMin3 = Math.min(Math.abs(mwjVar.g() - mwjVar2.g()), 200 - Math.abs(mwjVar.g() - mwjVar2.g()));
        mwjVar.c(iMin);
        mwjVar.d(iMin2);
        mwjVar.a(iMin3);
        mwjVar.e(Math.max(Math.max(iMin, iMin2), iMin3));
        LogUtil.a("HiAiSleepManager", "Merge Data -> dX:", Integer.valueOf(iMin), " dY:", Integer.valueOf(iMin2), " dZ:", Integer.valueOf(iMin3));
    }

    /* JADX INFO: loaded from: classes11.dex */
    static class b extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Timer f42558a;
        private final Consumer<b> d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f42559b = new AtomicInteger(0);
        private volatile long e = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile mwj f42560c = null;
        private final Map<Long, mwj> g = new HashMap();
        private final Map<Long, ArrayList<mwj>> j = new HashMap();

        b(Timer timer, Consumer<b> consumer) {
            this.f42558a = timer;
            this.d = consumer;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                e();
            } catch (Exception e) {
                LogUtil.e("HiAiSleepManager", "TimerTask run error", e);
                cancel();
                b();
            }
        }

        private void e() {
            mwe mweVarA = mwe.a();
            int andIncrement = this.f42559b.getAndIncrement();
            LogUtil.a("HiAiSleepManager", "timer count:", Integer.valueOf(andIncrement));
            if (andIncrement == 0) {
                this.e = mweVarA.e().longValue();
                this.f42560c = mweVarA.f();
                LogUtil.a("HiAiSleepManager", "sCurrentTime:", Long.valueOf(this.e));
            }
            b(mweVarA);
            if (andIncrement >= 12) {
                cancel();
                b();
            }
        }

        private void b() {
            c();
            Consumer<b> consumer = this.d;
            if (consumer != null) {
                consumer.accept(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            LogUtil.a("HiAiSleepManager", "cancelTimer");
            d(mwe.a());
            Timer timer = this.f42558a;
            if (timer != null) {
                timer.cancel();
                this.f42558a.purge();
            }
        }

        private void b(mwe mweVar) {
            Long lE = mweVar.e();
            mwj mwjVarD = d();
            if (mwjVarD.f() == 0) {
                return;
            }
            b(mwjVarD);
            if (mwjVarD.b() == 1 && !this.g.containsKey(lE)) {
                this.g.put(lE, mwjVarD);
            }
            this.f42560c = mwjVarD;
            mweVar.a(mwjVarD);
            ArrayList<mwj> arrayList = this.j.get(lE);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(mwjVarD);
            this.j.put(lE, arrayList);
            LogUtil.a("HiAiSleepManager", "saveOneTimeAISleepData:", mwjVarD.toString());
        }

        private mwj d() {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            mwj mwjVar = new mwj();
            mwjVar.i(mws.a().d());
            mwjVar.j(mws.a().b());
            mwjVar.h(mws.a().c());
            mwjVar.b(ScreenUtil.d() ? 1 : 0);
            mwjVar.d(jCurrentTimeMillis);
            return (mwjVar.e() == 0 && mwjVar.i() == 0 && mwjVar.g() == 0) ? new mwj() : mwjVar;
        }

        private void b(mwj mwjVar) {
            if (this.f42560c == null || this.f42560c.f() == 0) {
                return;
            }
            b(mwjVar, this.f42560c);
        }

        private void b(mwj mwjVar, mwj mwjVar2) {
            int iMin = Math.min(Math.abs(mwjVar.e() - mwjVar2.e()), 200 - Math.abs(mwjVar.e() - mwjVar2.e()));
            int iMin2 = Math.min(Math.abs(mwjVar.i() - mwjVar2.i()), 200 - Math.abs(mwjVar.i() - mwjVar2.i()));
            int iMin3 = Math.min(Math.abs(mwjVar.g() - mwjVar2.g()), 200 - Math.abs(mwjVar.g() - mwjVar2.g()));
            mwjVar.c(iMin);
            mwjVar.d(iMin2);
            mwjVar.a(iMin3);
            mwjVar.e(Math.max(Math.max(iMin, iMin2), iMin3));
            LogUtil.a("HiAiSleepManager", "Merge Data -> dX:", Integer.valueOf(iMin), " dY:", Integer.valueOf(iMin2), " dZ:", Integer.valueOf(iMin3));
        }

        private void d(mwe mweVar) {
            mwg mwgVarC;
            LogUtil.a("HiAiSleepManager", "saveInstantaneousData start");
            if (!this.g.isEmpty()) {
                for (Map.Entry<Long, mwj> entry : this.g.entrySet()) {
                    Long key = entry.getKey();
                    mwj value = entry.getValue();
                    if (value != null && value.b() == 1) {
                        mwg mwgVar = new mwg();
                        mwgVar.a(1);
                        mwgVar.a(key.longValue());
                        mweVar.c("MODULE_HW_AI_SCENES_SLEEP_SCREEN_DATA", String.format(Locale.ENGLISH, "SLEEP_SCREEN_RECORD_%d", key), mwgVar);
                        LogUtil.a("HiAiSleepManager", "Saved Screen Data: ts=" + key);
                    }
                }
            }
            if (!this.j.isEmpty()) {
                for (Map.Entry<Long, ArrayList<mwj>> entry2 : this.j.entrySet()) {
                    Long key2 = entry2.getKey();
                    ArrayList<mwj> value2 = entry2.getValue();
                    if (!CollectionUtils.a(value2) && (mwgVarC = c(key2, value2)) != null && !mweVar.d(mwgVarC.a())) {
                        String str = String.format(Locale.ENGLISH, "SLEEP_SENSOR_RECORD_%d", key2);
                        mwg mwgVarD = mweVar.d("MODULE_HW_AI_SCENES_SLEEP_SENSOR_DATA", str);
                        if (mwgVarD.b() == 0 || mwgVarC.a() > mwgVarD.a()) {
                            mweVar.c("MODULE_HW_AI_SCENES_SLEEP_SENSOR_DATA", str, mwgVarC);
                            LogUtil.a("HiAiSleepManager", "Saved Sensor Data: ts=" + key2 + ", max=" + mwgVarC.a());
                        }
                    }
                }
            }
            LogUtil.a("HiAiSleepManager", "saveInstantaneousData end");
        }

        private mwg c(Long l, ArrayList<mwj> arrayList) {
            int iMax = 0;
            int iMax2 = 0;
            int iMax3 = 0;
            for (mwj mwjVar : arrayList) {
                iMax = Math.max(iMax, mwjVar.c());
                iMax2 = Math.max(iMax2, mwjVar.d());
                iMax3 = Math.max(iMax3, mwjVar.a());
            }
            mwg mwgVar = new mwg();
            mwgVar.a(l.longValue());
            mwgVar.d(iMax);
            mwgVar.c(iMax2);
            mwgVar.e(iMax3);
            mwgVar.b(Math.max(Math.max(iMax, iMax2), iMax3));
            return mwgVar;
        }
    }

    public void a(long j, int i) {
        synchronized (this) {
            String strD = DateFormatUtil.d(j * 1000, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD);
            if (i != 0) {
                i += a(strD);
            }
            SharedPreferenceManager.e(BaseApplication.b(), "MODULE_HW_SLEEP_SEND_COUNT", strD, String.valueOf(i), new StorageParams());
        }
    }

    public int a(String str) {
        String strE = SharedPreferenceManager.e(BaseApplication.b(), "MODULE_HW_SLEEP_SEND_COUNT", str);
        try {
            if (TextUtils.isEmpty(strE)) {
                return 0;
            }
            return Integer.parseInt(strE);
        } catch (NumberFormatException e) {
            LogUtil.e("HiAiSleepManager", "getSendCount error", ExceptionUtils.c(e));
            return 0;
        }
    }

    public void c() {
        SharedPreferenceManager.i(BaseApplication.b(), "MODULE_HW_SLEEP_SEND_COUNT");
    }

    public void o() {
        Map<String, String> mapE = SharedPreferenceManager.e(BaseApplication.b(), "MODULE_HW_SLEEP_SEND_COUNT");
        if (mapE != null) {
            for (Map.Entry<String, String> entry : mapE.entrySet()) {
                String value = entry.getValue();
                String key = entry.getKey();
                if (!StringUtils.g(key) && !StringUtils.g(value)) {
                    LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                    linkedHashMap.put("dottingDate", key);
                    linkedHashMap.put("dottingCount", value);
                    OpAnalyticsUtil.getInstance().setEvent(OperationKey.HEALTH_APP_DEVICE_SLEEP_LINKAGE_2129059.value(), linkedHashMap);
                }
            }
        }
        c();
    }
}
