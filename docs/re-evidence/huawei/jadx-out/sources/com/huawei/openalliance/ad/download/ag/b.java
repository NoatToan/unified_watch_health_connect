package com.huawei.openalliance.ad.download.ag;

import android.text.TextUtils;
import com.huawei.openalliance.ad.download.DownloadTask;
import com.huawei.openalliance.ad.hw;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes12.dex */
public class b<T extends DownloadTask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Queue<T> f18437a = new ConcurrentLinkedQueue();

    public boolean b(T t) {
        if (t == null || !this.f18437a.contains(t)) {
            return false;
        }
        this.f18437a.remove(t);
        return true;
    }

    public void b() {
        this.f18437a.clear();
    }

    public void a(T t) {
        if (t == null || this.f18437a.contains(t)) {
            return;
        }
        this.f18437a.offer(t);
    }

    public Queue<T> a() {
        return this.f18437a;
    }

    public T a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (hw.a()) {
            hw.a("AdapterDownloadQueue", "findTask, workingQueue.size:%d", Integer.valueOf(this.f18437a.size()));
        }
        return (T) a(this.f18437a, str);
    }

    private T a(Queue<T> queue, String str) {
        if (hw.a()) {
            hw.a("AdapterDownloadQueue", "findTaskFromQueue, taskId:%s", str);
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
