package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class jem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f38491a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f38492b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f38493c = false;
    private static jeb d = null;
    private static boolean e = false;
    private static int f;
    private static jea h;
    private static int j;

    public static int a() {
        return j;
    }

    public static void c(boolean z) {
        e = z;
    }

    public static boolean f() {
        return f38493c;
    }

    public static boolean d() {
        return f38492b;
    }

    public static void b(boolean z) {
        f38492b = z;
    }

    public static boolean i() {
        return e(BaseApplication.getContext(), "smart_coach_enable_type");
    }

    public static boolean g() {
        return c() >= new jae().a("1.1.1");
    }

    public static long c() {
        File[] fileArrListFiles = new File(jeo.d().a()).listFiles();
        return fileArrListFiles == null ? 0 : fileArrListFiles.length;
    }

    public static boolean e(int i) {
        return i == -1 && i() && g();
    }

    public static boolean c(int i, int i2) {
        if (!jae.e()) {
            LogUtil.j("Track_SmartCoachStatusControl", "phone not support smart coach");
            f38493c = false;
            return false;
        }
        if (!LanguageUtil.l(BaseApplication.getContext()) || Utils.o()) {
            f38493c = false;
            return false;
        }
        if (i != 264 && i != 258) {
            f38493c = false;
            return false;
        }
        if (UnitUtil.f()) {
            LogUtil.j("Track_SmartCoachStatusControl", "isOpenSmartCoachModule isShowImperialUnit.");
            f38493c = false;
            return false;
        }
        if (!l()) {
            LogUtil.j("Track_SmartCoachStatusControl", "isOpenSmartCoachModule age is not int 18-59 section.");
            f38493c = false;
            return false;
        }
        if (!j() || o()) {
            f38493c = e(i2);
        } else {
            f38493c = true;
        }
        return f38493c;
    }

    public static boolean j() {
        PluginSportTrackAdapter pluginSportTrackAdapterA = ive.c().a();
        return pluginSportTrackAdapterA != null && pluginSportTrackAdapterA.isWearDeviceConnected();
    }

    public static boolean o() {
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            LogUtil.e("Track_SmartCoachStatusControl", "isWearDeviceSupportHeartRate deviceCapability is null.");
            return false;
        }
        return deviceCapabilityC.isSupportHeartRateInfo();
    }

    public static boolean h() {
        boolean z = false;
        if (e) {
            return false;
        }
        if (j() && o()) {
            z = true;
        }
        b(z);
        return z;
    }

    public static boolean l() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).fetchUserData(new HiCommonListener() { // from class: jem.3
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a("Track_SmartCoachStatusControl", "readUserInfomation fetchUserData onSuccess");
                List list = njy.b(obj, HiUserInfo.class) ? (List) obj : null;
                if (list != null && list.size() > 0) {
                    jem.f = ((HiUserInfo) list.get(0)).getAge();
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.a("Track_SmartCoachStatusControl", "isUserAgeMatchOpenSmartCoach fetchUserData onFailure");
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("Track_SmartCoachStatusControl", "isUserAgeMatchOpenSmartCoach interruptedException");
        }
        int i = f;
        return i >= 18 && i <= 59;
    }

    public static boolean e(Context context, String str) {
        if (context == null) {
            LogUtil.j("Track_SmartCoachStatusControl", "getVoiceEnable context is null.");
            return true;
        }
        if (str == null || str.length() <= 0) {
            LogUtil.j("Track_SmartCoachStatusControl", "getVoiceEnable storage is null.");
            return true;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), str);
        try {
            return !TextUtils.isEmpty(strE) && Integer.parseInt(strE) == 1;
        } catch (NumberFormatException e2) {
            LogUtil.e("Track_SmartCoachStatusControl", e2.getMessage());
            return true;
        }
    }

    public static void d(int i) {
        if (h()) {
            jea jeaVar = new jea();
            h = jeaVar;
            jeaVar.a(i);
        } else {
            jeb jebVar = new jeb();
            d = jebVar;
            jebVar.c(i);
        }
    }

    public static void d(long j2) {
        new Handler().postDelayed(new Runnable() { // from class: jem.5
            @Override // java.lang.Runnable
            public void run() {
                jem.b(jem.j);
            }
        }, j2 + 1000);
    }

    public static void b(int i) {
        if (!f38493c) {
            LogUtil.j("Track_SmartCoachStatusControl", "openSmartCoachVoicePlay error.");
            return;
        }
        if (iwy.a(BaseApplication.getContext()).o() != 1 && jel.b().j() != 1) {
            LogUtil.j("Track_SmartCoachStatusControl", "openSmartCoachVoicePlay not in sport.");
            return;
        }
        String[] strArr = {jeo.d().d("L128"), jeo.d().d("empty_500")};
        if (f38492b) {
            b(strArr);
            HashMap map = new HashMap(10);
            map.put("click", 1);
            map.put("type", 5);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_SMART_COACH_2010101.value(), map, 0);
        } else {
            b(i, strArr);
        }
        jei.b().a(j);
    }

    private static void b(String[] strArr) {
        jea jeaVar = h;
        if (jeaVar != null) {
            jeaVar.c(strArr);
            if (h.g()) {
                return;
            }
            jeh.e().e(f38491a);
            jeh.e().h();
            jeh.e().g();
            jeh.e().i();
        }
    }

    private static void b(int i, String[] strArr) {
        jeb jebVar = d;
        if (jebVar != null) {
            jebVar.c(i, strArr);
            if (d.c()) {
                return;
            }
            jeh.e().e(f38491a);
            jeh.e().k();
            jeh.e().i();
        }
    }

    public static void e(boolean z) {
        LogUtil.a("Track_SmartCoachStatusControl", "closeSmartCoachForDFH ", Boolean.valueOf(z));
        jeh.e().f();
        jei.b().a();
        if (z) {
            e();
        }
        iwy.a(BaseApplication.getContext()).bh();
    }

    public static void b(final int i, final int i2, final boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: jem.4
                @Override // java.lang.Runnable
                public void run() {
                    jem.b(i, i2, z);
                }
            });
            return;
        }
        if (!c(i, i2)) {
            LogUtil.a("Track_SmartCoachStatusControl", "startSmartCoachVoiceFunction isOpenSmartCoachModule error");
            return;
        }
        HashMap map = new HashMap(10);
        map.put("click", 1);
        map.put("type", 2);
        f38491a = z;
        if (z) {
            map.put("type", 4);
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_SMART_COACH_2010101.value(), map, 0);
        jau.c().j("Track_SmartCoachStatusControl");
        j = i;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: jem.1
            @Override // java.lang.Runnable
            public void run() {
                jem.d(i);
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    public static void e() {
        j = -1;
        f = 0;
        e = false;
        f38493c = false;
        h = null;
        d = null;
        jel.b().d();
        HandlerExecutor.c(new Runnable() { // from class: jen
            @Override // java.lang.Runnable
            public final void run() {
                jau.c().h("Track_SmartCoachStatusControl");
            }
        }, 1000L);
    }

    public static void a(Object obj) {
        if (!e(BaseApplication.getContext(), "voice_enable_type")) {
            LogUtil.j("Track_SmartCoachStatusControl", "smartCoachCommonVoicePlay isVoicePlayEnable false, object = ", obj);
            return;
        }
        if (obj instanceof jbc) {
            jau.c().d((jbc) obj);
        } else if (obj instanceof String[]) {
            jau.c().d((String[]) obj);
        } else if (!(obj instanceof String)) {
            LogUtil.j("Track_SmartCoachStatusControl", "smartCoachCommonVoicePlay object = ", obj);
        } else {
            jau.c().b((String) obj);
        }
    }
}
