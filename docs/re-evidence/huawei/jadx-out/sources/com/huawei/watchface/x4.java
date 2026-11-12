package com.huawei.watchface;

import android.app.ActivityManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes20.dex */
public class x4 implements Runnable {
    public static volatile x4 l;
    public static final f m = new a();
    public static final d n = new b();
    public static final e o = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExecutorService f30660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f30661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f30662c;
    public e d;
    public final Handler e;
    public final int f;
    public boolean g;
    public boolean h;
    public volatile long i;
    public volatile boolean j;
    public final Runnable k;

    public class a implements f {
        @Override // com.huawei.watchface.x4.f
        public void a() {
            HwLog.i("WatchFaceAnrWatchDog", "onAppNotResponding anr maybe happen");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String strB = b();
            linkedHashMap.put("stackTraces", CommonUtils.d(strB));
            if (WebViewActivity.getActivity() == null) {
                com.huawei.watchface.c.a(linkedHashMap);
                return;
            }
            ActivityManager activityManager = (ActivityManager) WebViewActivity.getActivity().getSystemService("activity");
            if (activityManager == null) {
                HwLog.e("WatchFaceAnrWatchDog", "onAppNotResponding activityManager is null");
                com.huawei.watchface.c.a(linkedHashMap);
                return;
            }
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2) {
                        HwLog.d("WatchFaceAnrWatchDog", "onAppNotResponding anr shortMsg:" + processErrorStateInfo.shortMsg);
                        linkedHashMap.put("shortMsg", processErrorStateInfo.shortMsg);
                        linkedHashMap.put("longMsg", CommonUtils.d(processErrorStateInfo.longMsg));
                    }
                }
            }
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            com.huawei.watchface.c.a(linkedHashMap);
        }

        public final String b() {
            StackTraceElement[] stackTrace;
            Thread thread = Looper.getMainLooper().getThread();
            if (thread == null || (stackTrace = thread.getStackTrace()) == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append("\n");
            }
            return sb.toString();
        }
    }

    public class b implements d {
        @Override // com.huawei.watchface.x4.d
        public long a(long j) {
            return 0L;
        }
    }

    public class c implements e {
        @Override // com.huawei.watchface.x4.e
        public void a(Exception exc) {
            HwLog.w("WatchFaceAnrWatchDog", "Interrupted: " + HwLog.printException(exc));
        }
    }

    public interface d {
        long a(long j);
    }

    public interface e {
        void a(Exception exc);
    }

    public interface f {
        void a();
    }

    public x4() {
        this(5000);
    }

    public static x4 a() {
        if (l == null) {
            synchronized (x4.class) {
                if (l == null) {
                    l = new x4();
                }
            }
        }
        return l;
    }

    public final /* synthetic */ void b() {
        this.i = 0L;
        this.j = false;
    }

    public void c() {
        try {
            HwLog.d("WatchFaceAnrWatchDog", "startAnrServer");
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            this.f30660a = executorServiceNewSingleThreadExecutor;
            executorServiceNewSingleThreadExecutor.execute(l);
        } catch (Exception e2) {
            HwLog.d("WatchFaceAnrWatchDog", "startAnrServer(): " + HwLog.printException(e2));
        }
    }

    public void d() {
        HwLog.d("WatchFaceAnrWatchDog", "stopAnrServer");
        ExecutorService executorService = this.f30660a;
        if (executorService == null) {
            HwLog.d("WatchFaceAnrWatchDog", "executorService is null");
            return;
        }
        try {
            if (executorService.isShutdown()) {
                return;
            }
            this.f30660a.shutdownNow();
            this.f30660a = null;
        } catch (Exception e2) {
            HwLog.d("WatchFaceAnrWatchDog", "stopAnrServer Exception:" + HwLog.printException(e2));
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        HwLog.d("WatchFaceAnrWatchDog", "ANR-WatchDog start");
        if (this.g) {
            HwLog.d("WatchFaceAnrWatchDog", "ANR-WatchDog is running");
            return;
        }
        this.g = true;
        long jA = this.f;
        while (this.h) {
            boolean z = this.i == 0;
            this.i += jA;
            if (z) {
                this.e.post(this.k);
            }
            try {
                Thread.currentThread();
                Thread.sleep(jA);
                if (this.i != 0 && !this.j) {
                    jA = this.f30662c.a(this.i);
                    if (jA <= 0) {
                        this.f30661b.a();
                        jA = this.f;
                        this.j = true;
                    }
                }
            } catch (Exception e2) {
                this.d.a(e2);
                return;
            }
        }
    }

    public x4(int i) {
        this.f30661b = m;
        this.f30662c = n;
        this.d = o;
        this.e = new Handler(Looper.getMainLooper());
        this.g = false;
        this.h = true;
        this.i = 0L;
        this.j = false;
        this.k = new Runnable() { // from class: com.huawei.watchface.x4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        };
        this.f = i;
    }

    public void a(boolean z) {
        HwLog.d("WatchFaceAnrWatchDog", "enableAnrCollect:" + z);
        this.h = z;
        if (z) {
            return;
        }
        this.g = false;
    }
}
