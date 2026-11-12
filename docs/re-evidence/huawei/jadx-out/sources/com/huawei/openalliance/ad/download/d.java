package com.huawei.openalliance.ad.download;

import android.text.TextUtils;
import com.huawei.openalliance.ad.download.DownloadTask;
import com.huawei.openalliance.ad.hw;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes12.dex */
public class d<T extends DownloadTask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BlockingQueue<T> f18614a = new PriorityBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue<T> f18615b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Queue<T> f18616c = new ConcurrentLinkedQueue();

    boolean g(T t) {
        if (t == null) {
            return false;
        }
        boolean zRemove = this.f18614a.remove(t);
        if (this.f18615b.remove(t)) {
            zRemove = true;
        }
        if (!this.f18616c.contains(t)) {
            return zRemove;
        }
        t.w();
        return true;
    }

    boolean f(T t) {
        if (t == null) {
            return false;
        }
        boolean zA = a(t);
        if (hw.a()) {
            hw.a("DownloadQueue", "resumeTask, succ:%s, taskId:%s", Boolean.valueOf(zA), t.n());
        }
        return zA;
    }

    boolean e(T t) {
        if (t == null) {
            return false;
        }
        if (this.f18614a.contains(t)) {
            if (hw.a()) {
                hw.a("DownloadQueue", "pauseTask, from waitingQueue, taskId:%s", t.n());
            }
            this.f18614a.remove(t);
        } else {
            if (!this.f18616c.contains(t)) {
                if (!this.f18615b.contains(t)) {
                    return false;
                }
                if (hw.a()) {
                    hw.a("DownloadQueue", "pauseTask, from idleQueue, taskId:%s", t.n());
                }
                return true;
            }
            if (hw.a()) {
                hw.a("DownloadQueue", "pauseTask, from workingQueue, taskId:%s", t.n());
            }
            t.w();
        }
        b(t);
        return true;
    }

    boolean d(T t) {
        return this.f18616c.remove(t);
    }

    public List<T> d() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f18614a);
        arrayList.addAll(this.f18616c);
        return arrayList;
    }

    void c(T t) {
        this.f18616c.remove(t);
    }

    public List<T> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f18615b);
        return arrayList;
    }

    boolean b(T t) {
        if (hw.a()) {
            hw.a("DownloadQueue", "addIdleTask, task:%s", t.toString());
        }
        if (t == null || this.f18615b.contains(t)) {
            return false;
        }
        return this.f18615b.offer(t);
    }

    T b() {
        String str;
        try {
            if (hw.a()) {
                hw.a("DownloadQueue", "takeTask, workingQueue.size:%d, waitingQueue.size:%d, idleQueue.size:%d", Integer.valueOf(this.f18616c.size()), Integer.valueOf(this.f18614a.size()), Integer.valueOf(this.f18615b.size()));
            }
            T tTake = this.f18614a.take();
            if (!this.f18616c.offer(tTake)) {
                hw.b("DownloadQueue", "taskTask - workingQueue fail to offer ");
            }
            if (hw.a()) {
                hw.a("DownloadQueue", "takeTask, task:%s", tTake.toString());
            }
            return tTake;
        } catch (InterruptedException unused) {
            str = "takeTask InterruptedException";
            hw.d("DownloadQueue", str);
            return null;
        } catch (Exception unused2) {
            str = "takeTask Exception";
            hw.d("DownloadQueue", str);
            return null;
        }
    }

    boolean a(T t) {
        if (t == null) {
            return false;
        }
        boolean zH = h(t);
        if (hw.a()) {
            hw.a("DownloadQueue", "addTask, succ:%s, taskId:%s, priority:%d, seqNum:%d", Boolean.valueOf(zH), t.n(), Integer.valueOf(t.k()), Long.valueOf(t.m()));
        }
        return zH;
    }

    T a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (hw.a()) {
            hw.a("DownloadQueue", "findTask, workingQueue.size:%d, waitingQueue.size:%d, idleQueue.size:%d", Integer.valueOf(this.f18616c.size()), Integer.valueOf(this.f18614a.size()), Integer.valueOf(this.f18615b.size()));
        }
        T t = (T) a(this.f18616c, str);
        return (t == null && (t = (T) a(this.f18614a, str)) == null) ? (T) a(this.f18615b, str) : t;
    }

    int a() {
        return this.f18614a.size();
    }

    private boolean h(T t) {
        if (t == null || this.f18616c.contains(t)) {
            return false;
        }
        if (this.f18614a.contains(t)) {
            return true;
        }
        boolean zOffer = this.f18614a.offer(t);
        if (zOffer) {
            this.f18615b.remove(t);
        }
        return zOffer;
    }

    private T a(Queue<T> queue, String str) {
        if (hw.a()) {
            hw.a("DownloadQueue", "findTaskFromQueue, taskId:%s", str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (T t : queue) {
            if (str.equals(t.n())) {
                return t;
            }
        }
        return null;
    }
}
