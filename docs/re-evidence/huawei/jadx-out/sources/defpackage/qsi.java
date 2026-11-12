package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes16.dex */
public class qsi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, ConcurrentLinkedQueue<Future<View>>> f46740a = new ConcurrentHashMap<>();

    public static void c() {
        ReleaseLogUtil.d("R_View_LayoutLoad", "start release");
        if (f46740a != null) {
            Iterator<Map.Entry<Integer, ConcurrentLinkedQueue<Future<View>>>> it = f46740a.entrySet().iterator();
            while (it.hasNext()) {
                e(it.next().getValue());
            }
            f46740a.clear();
        }
        ReleaseLogUtil.d("R_View_LayoutLoad", "end release");
    }

    public static void d(WeakReference<Context> weakReference, int i, int i2) {
        LogUtil.a("View_LayoutLoad", "preInflate layout Id = ", Integer.valueOf(i));
        Context context = weakReference.get();
        if (context == null) {
            LogUtil.a("View_LayoutLoad", "context is null");
        } else {
            e(context, Integer.valueOf(i), i2);
        }
    }

    public static View d(int i) {
        View viewE;
        LogUtil.a("View_LayoutLoad", "getXmlParser id = ", Integer.valueOf(i));
        try {
            viewE = e(i);
        } catch (InterruptedException | ExecutionException e) {
            LogUtil.e("View_LayoutLoad", e.getMessage());
            viewE = null;
        }
        LogUtil.a("View_LayoutLoad", "async inflate success, id: ", Integer.valueOf(i));
        if (viewE != null) {
            return viewE;
        }
        LogUtil.a("View_LayoutLoad", "inflate in main thread, id: ", Integer.valueOf(i));
        return qre.a(BaseApplication.getContext(), i, (ViewGroup) null);
    }

    private static void e(final Context context, final Integer num, int i) {
        LogUtil.a("View_LayoutLoad", "preInflateInner");
        for (int i2 = 0; i2 < i; i2++) {
            Future<View> futureSubmit = ThreadPoolManager.c().submit(new Callable() { // from class: qsg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return qre.a(context, num.intValue(), (ViewGroup) null);
                }
            });
            LogUtil.a("View_LayoutLoad", "submitted, id: ", num);
            f46740a.putIfAbsent(num, new ConcurrentLinkedQueue<>());
            f46740a.get(num).add(futureSubmit);
        }
    }

    private static View e(int i) throws ExecutionException, InterruptedException {
        Future<View> futureD = d(Integer.valueOf(i));
        if (futureD == null) {
            LogUtil.e("View_LayoutLoad", "task not exist, taskId: ", Integer.valueOf(i));
            return null;
        }
        if (futureD.isDone()) {
            return futureD.get();
        }
        futureD.cancel(true);
        return null;
    }

    private static Future<View> d(Integer num) {
        ConcurrentLinkedQueue<Future<View>> concurrentLinkedQueue;
        if (!f46740a.containsKey(num) || (concurrentLinkedQueue = f46740a.get(num)) == null || concurrentLinkedQueue.isEmpty()) {
            return null;
        }
        return concurrentLinkedQueue.poll();
    }

    private static void e(ConcurrentLinkedQueue<Future<View>> concurrentLinkedQueue) {
        while (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            Future<View> futurePoll = concurrentLinkedQueue.poll();
            if (futurePoll == null) {
                return;
            } else {
                futurePoll.cancel(true);
            }
        }
    }
}
