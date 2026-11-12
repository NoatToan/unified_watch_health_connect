package com.huawei.watchface.mvp.model.helper.systemparam;

import android.text.TextUtils;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.e4;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.f1;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.thread.GetSignThread;
import com.huawei.watchface.n;
import com.huawei.watchface.p2;
import com.huawei.watchface.q2;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes20.dex */
public class NewSystemParamManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Set f30340a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ConcurrentHashMap f30341b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ConcurrentHashMap f30342c = new ConcurrentHashMap();
    public static ConcurrentHashMap d = new ConcurrentHashMap();
    public static final Map e = new ConcurrentHashMap();
    public static CountDownLatch f = new CountDownLatch(1);
    public static LinkedBlockingQueue g = new LinkedBlockingQueue();
    public static boolean h = false;
    public static final List i = Arrays.asList("10000001001", "10000001002", "10000001003", "10000001004", "10000001005", "10000001006", "10000001008", "10000001009", "10000001010", "10000001011", "10000001012", "10000001013", "10000001333");
    public static final List j = Arrays.asList("-1");
    public static final List k = Arrays.asList("10000001118");
    public static String l = "0";
    public static boolean m = false;
    public static boolean n = true;
    public static List o;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f30344b;

        public a(String str, AtomicInteger atomicInteger) {
            this.f30343a = str;
            this.f30344b = atomicInteger;
        }

        @Override // java.lang.Runnable
        public void run() {
            NewSystemParamManager.a(NewSystemParamManager.f(this.f30343a));
            HwLog.i("NewSystemParamManager", "requestParamByCode() code: " + this.f30343a);
            NewSystemParamManager.a(this.f30344b.incrementAndGet());
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            for (c cVar = (c) NewSystemParamManager.g.poll(); cVar != null; cVar = (c) NewSystemParamManager.g.poll()) {
                cVar.a(0);
            }
        }
    }

    public interface c {
        void a(int i);
    }

    public static Set a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return e4.a(str, "SystemParamFile", (Set) null);
    }

    public static String b(String str) {
        return getSystemParam(str, null);
    }

    public static List c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return p2.a(str);
    }

    public static void d() {
        Iterator it = k.iterator();
        while (it.hasNext()) {
            g((String) it.next());
        }
    }

    public static void e() {
        HwLog.i("NewSystemParamManager", "startRequestPhoneTypeSystemParam() enter.");
        if (WatchFaceHttpUtil.u() != null) {
            d();
        } else {
            HwLog.i("NewSystemParamManager", "startRequestPhoneTypeSystemParam() watchFaceSignBean is null.");
            a();
        }
    }

    public static void f() {
        HwLog.i("NewSystemParamManager", "startRequestSystemParam() enter.");
        f = new CountDownLatch(1);
        m = false;
        n = true;
        f30340a = new CopyOnWriteArraySet();
        f30341b.clear();
        d.clear();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        h = true;
        if (Environment.getApplicationContext() == null || !HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isOversea()) {
            o = j;
        } else {
            o = i;
        }
        HwLog.i("NewSystemParamManager", "startRequestSystemParam() start request whitelist");
        if (WatchFaceHttpUtil.C() != null) {
            c(atomicInteger);
        } else {
            HwLog.i("NewSystemParamManager", "startRequestSystemParam() watchFaceSignBean is null.");
            a(atomicInteger);
        }
    }

    public static void g(final String str) {
        if (str == null) {
            return;
        }
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                NewSystemParamManager.d(str);
            }
        });
    }

    public static String getSystemParam(String str, String str2) {
        return TextUtils.isEmpty(str) ? "" : e4.a(str, "SystemParamFile", str2);
    }

    public static boolean b(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i("NewSystemParamManager", "parseBooleanParam TextUtils.isEmpty(paramName)");
            return z;
        }
        String strB = b(str);
        return TextUtils.isEmpty(strB) ? z : TextUtils.equals(str2, strB);
    }

    public static /* synthetic */ void d(String str) {
        HwLog.i("NewSystemParamManager", "requestPhoneTypeParamByCode() code: " + str);
        SystemParamInfo systemParamInfoE = e(str);
        HwLog.iBetaLog("NewSystemParamManager", "requestPhoneTypeParamByCode systemParamInfo:" + GsonHelper.toJson(systemParamInfoE));
        b(systemParamInfoE);
    }

    public static String a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (z) {
            Map map = e;
            if (q2.a(map, (Object) str)) {
                FlavorConfig.safeHwLog("NewSystemParamManager", "is cache get" + str);
                return q2.a(map, str, str2);
            }
            FlavorConfig.safeHwLog("NewSystemParamManager", "is sp get" + str);
            String strA = e4.a(str, "SystemParamFile", str2);
            q2.a(map, (Object) str, (Object) strA);
            return strA;
        }
        q2.b(e, str);
        return e4.a(str, "SystemParamFile", str2);
    }

    public static void c(AtomicInteger atomicInteger) {
        if (!ArrayUtils.isEmpty(o) && atomicInteger != null) {
            Iterator it = o.iterator();
            while (it.hasNext()) {
                a((String) it.next(), atomicInteger);
            }
            return;
        }
        HwLog.e("NewSystemParamManager", "requestParamByCodeList() codeList is null.");
    }

    public static SystemParamInfo e(String str) {
        f1 f1Var = new f1();
        f1Var.a(1);
        f1Var.d(str);
        return f1Var.b(f1Var.c(""));
    }

    public static /* synthetic */ void b(AtomicInteger atomicInteger) {
        GetSignThread getSignThread = new GetSignThread();
        if (getSignThread.b(getSignThread.e()) == null) {
            HwLog.w("NewSystemParamManager", "getSignBeforeRequestParam() watchFaceSignBean is null.");
        } else {
            c(atomicInteger);
        }
    }

    public static void c() {
        try {
            List<String> listA = p2.a();
            if (listA.isEmpty()) {
                HwLog.d("NewSystemParamManager", "No system parameters found to process");
                return;
            }
            for (String str : listA) {
                if (!TextUtils.isEmpty(str) && !f30340a.contains(str)) {
                    HwLog.i("NewSystemParamManager", "remove disabled param from SP: " + str);
                    e4.e(str, "SystemParamFile");
                }
            }
        } catch (Exception e2) {
            HwLog.e("NewSystemParamManager", "Error removing disabled parameters: " + HwLog.printException(e2));
        }
    }

    public static /* synthetic */ void b() {
        GetSignThread getSignThread = new GetSignThread();
        getSignThread.a(1);
        if (getSignThread.b(getSignThread.e()) == null) {
            HwLog.w("NewSystemParamManager", "getSignBeforeRequestParam() watchFaceSignBean is null.");
        } else {
            d();
        }
    }

    public static void a(c cVar) {
        if (cVar == null) {
            return;
        }
        HwLog.i("NewSystemParamManager", "getNewSystemParam() isLoading: " + h);
        if (!h) {
            cVar.a(0);
        } else {
            g.add(cVar);
        }
    }

    public static SystemParamInfo f(String str) {
        f1 f1Var = new f1();
        f1Var.d(str);
        return f1Var.b(f1Var.c(""));
    }

    public static void a(final AtomicInteger atomicInteger) {
        HwLog.i("NewSystemParamManager", "getSignBeforeRequestParam watchFaceSignBean is null.");
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                NewSystemParamManager.b(atomicInteger);
            }
        });
    }

    public static void b(SystemParamInfo systemParamInfo) {
        HwLog.i("NewSystemParamManager", "parsePhoneTypeParam");
        if (systemParamInfo != null && l.equals(systemParamInfo.getResultCode())) {
            List<SystemParamInfo.SystemParam> list = systemParamInfo.getList();
            if (ArrayUtils.isEmpty(list)) {
                e4.b(SystemParamNames.CLIENT_GREY_WATCHFACE_SITE, "", "SystemParamFile");
                return;
            }
            boolean z = false;
            for (SystemParamInfo.SystemParam systemParam : list) {
                if (!TextUtils.isEmpty(systemParam.getParamName()) && TextUtils.equals(systemParam.getParamName(), SystemParamNames.CLIENT_GREY_WATCHFACE_SITE)) {
                    HwLog.i("NewSystemParamManager", "parsePhoneTypeParam name:" + systemParam.getParamName() + ",content:" + systemParam.getParamContent());
                    if (systemParam.getParamContent() != null) {
                        f30342c.put(systemParam.getParamName(), systemParam.getParamContent().trim());
                    }
                    e4.a(f30342c, "SystemParamFile");
                    z = true;
                }
            }
            if (z) {
                return;
            }
            e4.b(SystemParamNames.CLIENT_GREY_WATCHFACE_SITE, "", "SystemParamFile");
            return;
        }
        HwLog.i("NewSystemParamManager", "mIsRequestFail = true ");
    }

    public static void a() {
        HwLog.i("NewSystemParamManager", "getSignBeforeRequestParam watchFaceSignBean is null.");
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                NewSystemParamManager.b();
            }
        });
    }

    public static void a(String str, AtomicInteger atomicInteger) {
        if (str == null || atomicInteger == null) {
            return;
        }
        BackgroundTaskUtils.submit(new a(str, atomicInteger));
    }

    public static void a(SystemParamInfo systemParamInfo) {
        HwLog.i("NewSystemParamManager", "parseParam");
        if (systemParamInfo != null && l.equals(systemParamInfo.getResultCode())) {
            List<SystemParamInfo.SystemParam> list = systemParamInfo.getList();
            if (ArrayUtils.isEmpty(list)) {
                n = false;
                HwLog.i("NewSystemParamManager", "parseParam -- list is empty");
                return;
            }
            HwLog.i("NewSystemParamManager", "parseParam -- getList");
            n.e().a();
            n.e().f();
            for (SystemParamInfo.SystemParam systemParam : list) {
                if (!TextUtils.isEmpty(systemParam.getParamName())) {
                    f30340a.add(systemParam.getParamName());
                    if (p2.b(systemParam.getParamName())) {
                        p2.a(systemParam.getParamName(), systemParam.getParamContent());
                    } else {
                        f30341b.put(systemParam.getParamName(), systemParam.getParamContent());
                        if (TextUtils.equals(systemParam.getParamCode(), "10000001333")) {
                            n.e().a(systemParam.getParamName(), systemParam.getParamContent());
                        }
                    }
                }
            }
            for (String str : p2.f30540a) {
                List listA = p2.a(str);
                if (!ArrayUtils.isEmpty(listA)) {
                    d.put(str, new HashSet(listA));
                }
            }
            FlavorConfig.addAodTestData();
            return;
        }
        HwLog.i("NewSystemParamManager", "mIsRequestFail = true ");
        m = true;
    }

    public static void a(int i2) {
        if (i2 >= o.size()) {
            HwLog.i("NewSystemParamManager", "caculateIsLoadFinish mIsRequestFail = " + m);
            if (!m) {
                e4.a(f30341b, "SystemParamFile");
                e4.a(d, "SystemParamFile");
                e4.a("paramNameList", f30340a, "SystemParamFile");
                if (!f30340a.isEmpty() && n) {
                    c();
                }
            }
            f30341b.clear();
            d.clear();
            q2.a(e);
            h = false;
            f.countDown();
            BackgroundTaskUtils.postInMainThread(new b());
        }
    }
}
