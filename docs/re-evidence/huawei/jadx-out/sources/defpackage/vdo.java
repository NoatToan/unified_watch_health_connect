package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSampleConfigKey;
import com.huawei.hihealth.HiSampleConfigProcessOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class vdo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f50968c;

    public static int b(double d) {
        if ((d * 100.0d) % 100.0d == 0.0d) {
            return (int) d;
        }
        return 100;
    }

    public static boolean b(int i) {
        return i < 81 && i >= 6;
    }

    public static boolean c(int i) {
        return i < 66 && i >= 18;
    }

    public static boolean d(int i) {
        return i < 81 && i >= 18;
    }

    public static int b(Context context, float f) {
        if (context == null) {
            LogUtil.j("HealthUtil", "context is null");
            return 0;
        }
        return (int) (((double) (f * context.getResources().getDisplayMetrics().density)) + 0.5d);
    }

    public static boolean e() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f50968c < 500) {
            return true;
        }
        f50968c = jElapsedRealtime;
        return false;
    }

    public static boolean c(String str, Context context) {
        if (context == null) {
            LogUtil.e("HealthUtil", "isShowOverseaConfiguredPage context is null");
            return false;
        }
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1010);
        boolean zIsOperation = OperationUtils.isOperation(accountInfo);
        LogUtil.d(str, "isShowOverseaConfiguredPage countryCode = ", accountInfo, " isOperation = ", Boolean.valueOf(zIsOperation));
        return zIsOperation;
    }

    public static boolean b(dnb dnbVar, int i) {
        if (dnbVar == null) {
            LogUtil.j("HealthUtil", "isCommonViewVisible weightBean is null");
            return false;
        }
        if (i == 0) {
            return dnbVar.av() > 0.0d;
        }
        if (i == 2) {
            double dF = dnbVar.f();
            if (!ezh.c(dF, Utils.o())) {
                dF = exz.c(dnbVar.av(), dnbVar.r());
            }
            return ezh.c(dF, Utils.o());
        }
        if (i == 11) {
            return ezh.j(dnbVar.q());
        }
        if (i != 12) {
            return true;
        }
        double dZ = dnbVar.z();
        return ezh.m(dZ) && dZ > 0.0d;
    }

    public static boolean d(dnb dnbVar, int i) {
        if (dnbVar == null) {
            LogUtil.j("HealthUtil", "isNotOverseaViewVisible weightBean is null");
            return false;
        }
        if (i == 9) {
            return dnbVar.a() > 0.0d;
        }
        if (i == 13) {
            int iD = vei.d(dnbVar);
            return ezh.e((double) iD) && iD != 0;
        }
        if (i != 25) {
            return true;
        }
        return ezh.y(dnbVar.ao());
    }

    public static boolean e(dnb dnbVar, int i) {
        if (dnbVar == null) {
            LogUtil.j("HealthUtil", "isNotOverseaViewVisible weightBean is null");
            return false;
        }
        if (i == 1) {
            return ezh.g(dnbVar.b());
        }
        if (i == 7) {
            return ezh.b(dnbVar.g());
        }
        if (i == 10) {
            return ezh.t(dnbVar.am());
        }
        if (i == 26) {
            return ezh.p(dnbVar.af());
        }
        if (i == 3) {
            return ezh.r(dnbVar.aq()) || ezh.r(dnbVar.ak());
        }
        if (i == 4) {
            return ezh.d(dnbVar.e());
        }
        if (i == 5) {
            return ezh.u(dnbVar.s());
        }
        return c(dnbVar, i);
    }

    private static boolean c(dnb dnbVar, int i) {
        if (i == 6) {
            return ezh.k(dnbVar.ad());
        }
        if (i != 8) {
            if (i != 14) {
                return true;
            }
            double dB = dnbVar.b();
            return ezh.g(dB) && ezh.h(exz.a(dB, dnbVar.av()));
        }
        double dAq = dnbVar.aq();
        if (!ezh.r(dAq)) {
            dAq = dnbVar.ak();
        }
        double d = dAq;
        if (ezh.r(d)) {
            return ezh.l(exz.e(dnbVar.av(), d, dnbVar.b(), dnbVar.g(), dnbVar.getFractionDigitByType(0)));
        }
        return false;
    }

    public static HealthCalendar c(HealthCalendar healthCalendar, int i) {
        long millis = TimeUnit.MINUTES.toMillis(i);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        if (healthCalendar == null) {
            healthCalendar = new HealthCalendar();
        }
        return healthCalendar.transformFromCalendar(calendar);
    }

    public static Activity b(Context context) {
        Context context2 = (Context) new WeakReference(context).get();
        if (context2 == null) {
            return null;
        }
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        if (context2 instanceof ContextWrapper) {
            return b(((ContextWrapper) context2).getBaseContext());
        }
        return null;
    }

    public static void b(String str, String str2, String str3, HiDataOperateListener hiDataOperateListener) {
        if (hiDataOperateListener == null) {
            LogUtil.j("HealthUtil", "setSampleConfig listener is null");
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            hiDataOperateListener.onResult(-1, "setSampleConfig type " + str + " configId " + str2 + " configData " + str3);
            return;
        }
        HiSampleConfig.Builder builder = new HiSampleConfig.Builder();
        builder.e(System.currentTimeMillis());
        builder.i(String.valueOf(0));
        builder.e(String.valueOf(-1));
        builder.f(String.valueOf(0));
        builder.h(str);
        builder.a(str2);
        builder.b(str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HiSampleConfig(builder));
        HiHealthManager.d(BaseApplication.b()).setSampleConfig(arrayList, hiDataOperateListener);
    }

    public static void e(final String str, final String str2, final HiDataReadResultListener hiDataReadResultListener) {
        if (hiDataReadResultListener == null) {
            LogUtil.j("HealthUtil", "getSampleConfig listener is null");
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            hiDataReadResultListener.onResult("getSampleConfig type " + str + " configId " + str2, -1, -1);
            return;
        }
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vdp
                @Override // java.lang.Runnable
                public final void run() {
                    vdo.e(str, str2, hiDataReadResultListener);
                }
            });
            return;
        }
        HiSampleConfigKey.Builder builder = new HiSampleConfigKey.Builder();
        builder.c(String.valueOf(0));
        builder.d(String.valueOf(0));
        builder.e(str);
        builder.a(str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HiSampleConfigKey(builder));
        HiSampleConfigProcessOption hiSampleConfigProcessOption = new HiSampleConfigProcessOption();
        hiSampleConfigProcessOption.setSampleConfigKeyList(arrayList);
        HiHealthManager.d(BaseApplication.b()).getSampleConfig(hiSampleConfigProcessOption, hiDataReadResultListener);
    }

    public static void a(String str, String str2, HiDataOperateListener hiDataOperateListener) {
        b(MatterDataContans.TYPE_HEALTH, str, str2, hiDataOperateListener);
    }

    public static void c(String str, HiDataReadResultListener hiDataReadResultListener) {
        e(MatterDataContans.TYPE_HEALTH, str, hiDataReadResultListener);
    }

    public static void e(String str, String str2, HiDataOperateListener hiDataOperateListener) {
        b("9001", str, str2, hiDataOperateListener);
    }

    public static void a(String str, HiDataReadResultListener hiDataReadResultListener) {
        e("9001", str, hiDataReadResultListener);
    }

    public static boolean a() {
        return !Utils.o() || Utils.b(BaseApplication.b()) || Utils.c(BaseApplication.b());
    }
}
