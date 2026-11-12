package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import com.huawei.haf.common.exception.ExceptionUtils;
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

/* JADX INFO: loaded from: classes.dex */
public class qsk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, ConcurrentLinkedQueue<Future<XmlResourceParser>>> f46743b = new ConcurrentHashMap<>();

    public static void c() {
        ReleaseLogUtil.d("R_View_Load", "start release");
        if (f46743b != null) {
            Iterator<Map.Entry<Integer, ConcurrentLinkedQueue<Future<XmlResourceParser>>>> it = f46743b.entrySet().iterator();
            while (it.hasNext()) {
                a(it.next().getValue());
            }
            f46743b.clear();
        }
        ReleaseLogUtil.d("R_View_Load", "end release");
    }

    public static void b(WeakReference<Context> weakReference, int i, int i2) {
        LogUtil.a("View_Load", "preInflate layout Id = ", Integer.valueOf(i));
        Context context = weakReference.get();
        if (context == null) {
            LogUtil.a("View_Load", "context is null");
        } else {
            e(context, Integer.valueOf(i), i2);
        }
    }

    public static XmlResourceParser c(int i) {
        XmlResourceParser xmlResourceParserE;
        LogUtil.a("View_Load", "getXmlParser id = ", Integer.valueOf(i));
        try {
            xmlResourceParserE = e(i);
        } catch (InterruptedException | ExecutionException e) {
            LogUtil.e("View_Load", e.getMessage());
            xmlResourceParserE = null;
        }
        LogUtil.a("View_Load", "async inflate success, id: ", Integer.valueOf(i));
        if (xmlResourceParserE != null) {
            return xmlResourceParserE;
        }
        LogUtil.a("View_Load", "inflate in main thread, id: ", Integer.valueOf(i));
        try {
            return BaseApplication.getContext().getResources().getLayout(i);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("View_Load", "inflate failed in main thread");
            return xmlResourceParserE;
        }
    }

    private static void e(Context context, final Integer num, int i) {
        try {
            LogUtil.a("View_Load", "preInflateInner");
            final Resources resources = context.getResources();
            for (int i2 = 0; i2 < i; i2++) {
                Future<XmlResourceParser> futureSubmit = ThreadPoolManager.c().submit(new Callable() { // from class: qsh
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return resources.getLayout(num.intValue());
                    }
                });
                LogUtil.a("View_Load", "submitted, id: ", num);
                f46743b.putIfAbsent(num, new ConcurrentLinkedQueue<>());
                f46743b.get(num).add(futureSubmit);
            }
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("View_Load", "inflate failed!");
        }
    }

    private static XmlResourceParser e(int i) throws ExecutionException, InterruptedException {
        Future<XmlResourceParser> futureD = d(Integer.valueOf(i));
        if (futureD == null) {
            LogUtil.e("View_Load", "task not exist, taskId: ", Integer.valueOf(i));
            return null;
        }
        if (futureD.isDone()) {
            return futureD.get();
        }
        futureD.cancel(true);
        return null;
    }

    private static Future<XmlResourceParser> d(Integer num) {
        ConcurrentLinkedQueue<Future<XmlResourceParser>> concurrentLinkedQueue;
        if (!f46743b.containsKey(num) || (concurrentLinkedQueue = f46743b.get(num)) == null || concurrentLinkedQueue.isEmpty()) {
            return null;
        }
        return concurrentLinkedQueue.poll();
    }

    private static void a(ConcurrentLinkedQueue<Future<XmlResourceParser>> concurrentLinkedQueue) {
        while (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            Future<XmlResourceParser> futurePoll = concurrentLinkedQueue.poll();
            if (futurePoll == null) {
                return;
            }
            if (futurePoll.isDone()) {
                try {
                    futurePoll.get().close();
                } catch (InterruptedException | ExecutionException e) {
                    ReleaseLogUtil.a("R_View_Load", "get xml parser error:" + ExceptionUtils.c(e));
                }
            }
            futurePoll.cancel(true);
        }
    }
}
