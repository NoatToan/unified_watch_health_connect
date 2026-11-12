package com.huawei.hms.network.file.core.task;

import com.huawei.hms.network.file.api.Progress;
import com.huawei.hms.network.file.api.Request;
import com.huawei.hms.network.file.core.FileManagerException;
import com.huawei.hms.network.file.core.task.k;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.file.core.util.Utils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class j<R extends Request, T extends k> implements d<R, T> {
    c e;
    public volatile long f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile e.a f15761a = e.a.INIT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile long f15762b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected volatile long f15763c = 0;
    volatile long d = 0;
    volatile long g = 0;
    volatile long h = 0;

    public void f(R r) {
        FLogger.i("RequestStatus", "onSuccess:" + r, new Object[0]);
        this.f15761a = e.a.INVALID;
        this.e.a(r, this.f15761a);
    }

    public void e(R r) {
        this.f15761a = e.a.PROCESS;
    }

    public void d(R r) {
        this.f15761a = e.a.PROCESS;
    }

    public void c(R r) {
        FLogger.i("RequestStatus", "onPaused:" + r, new Object[0]);
        this.g += this.d > 0 ? System.currentTimeMillis() - this.d : 0L;
        this.d = 0L;
        this.f15761a = e.a.PAUSE;
        this.e.a(r, this.f15761a);
    }

    public e.a c() {
        return this.f15761a;
    }

    public long c(List<T> list) {
        long jC = 0;
        if (Utils.isEmpty(list)) {
            return 0L;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            jC += it.next().c();
        }
        FLogger.d("RequestStatus", "getCurrentSize:" + jC, new Object[0]);
        return jC;
    }

    public void b(R r) {
        FLogger.i("RequestStatus", "onCanceled:" + r, new Object[0]);
        this.f15761a = e.a.CANCEL;
        this.e.a(r, this.f15761a);
    }

    @Override // com.huawei.hms.network.file.core.task.d
    public long b(List<T> list) {
        long jC = 0;
        if (!Utils.isEmpty(list)) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                jC += it.next().c();
            }
        }
        return jC;
    }

    @Override // com.huawei.hms.network.file.core.task.d
    public long b() {
        return this.d > 0 ? (this.h - this.d) + this.g : this.g;
    }

    public void a(R r, List<T> list) {
        FLogger.i("RequestStatus", "onTaskStart:" + list, new Object[0]);
        if (this.d <= 0) {
            this.d = System.currentTimeMillis();
        }
        if (this.f15763c <= 0) {
            this.f15763c = System.currentTimeMillis();
        }
        this.f15761a = e.a.PROCESS;
        this.e.a(r, this.f15761a);
    }

    public void a(R r, FileManagerException fileManagerException) {
        FLogger.i("RequestStatus", "onException:" + r, new Object[0]);
        this.f15761a = e.a.INVALID;
    }

    public void a(R r) {
        FLogger.i("RequestStatus", "onAllTaskFinished:" + r, new Object[0]);
        this.h = System.currentTimeMillis();
    }

    public void a(long j) {
        this.f = j;
    }

    public Progress a(R r, String str, List<T> list) {
        long j;
        long j2;
        if (Utils.isEmpty(list)) {
            return null;
        }
        long jA = 0;
        long jC = 0;
        for (T t : list) {
            jC += t.c();
            jA += t.a();
        }
        FLogger.v("RequestStatus", "onProgress currentTotalFinished:" + jC + ",totalFileSize:" + jA);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f15763c;
        if (jCurrentTimeMillis > 0) {
            j2 = (long) (((jC - this.f15762b) / jCurrentTimeMillis) * 1000.0d);
            j = 0;
        } else {
            j = 0;
            j2 = 0;
        }
        if (j2 < j || jCurrentTimeMillis == 0) {
            FLogger.w("RequestStatus", "onProgress wait to notify -> timeSpan:" + jCurrentTimeMillis + ",lastReportSize:" + this.f15762b + ",currentTotalFinished:" + jC, new Object[0]);
            return null;
        }
        this.f15763c = System.currentTimeMillis();
        this.f15762b = jC;
        int i = (int) ((jC / jA) * 100.0d);
        if (i > 100) {
            FLogger.w("RequestStatus", "onProgress for error percent, currentTotalFinished:" + jC + ",totalFileSize:" + jA, new Object[0]);
            i = 99;
        }
        return new Progress(r, str, i, jA, jC, j2);
    }

    @Override // com.huawei.hms.network.file.core.task.d
    public long a(List<T> list) {
        long jB = b(list);
        long jA = a();
        if (jA > 0) {
            return (long) ((jB / jA) * 1000.0d);
        }
        return 0L;
    }

    @Override // com.huawei.hms.network.file.core.task.d
    public long a() {
        FLogger.i("RequestStatus", "currentTime:" + System.currentTimeMillis() + "; taskStartTime:" + this.d + "; lastUsedTime:" + this.g, new Object[0]);
        return this.d > 0 ? (System.currentTimeMillis() - this.d) + this.g : this.g;
    }

    public j(c cVar) {
        this.e = cVar;
    }
}
