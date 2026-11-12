package com.huawei.hms.network.file.core.task;

import com.huawei.hms.network.file.core.Constants;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.file.core.util.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f15755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<k> f15756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExecutorService f15757c;
    private Future d;
    private volatile boolean e = false;
    private volatile boolean f = false;

    public boolean e() {
        return this.f;
    }

    public boolean d() {
        Future future = this.d;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    public void c() {
        this.d = this.f15757c.submit(new Runnable() { // from class: com.huawei.hms.network.file.core.task.h$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.f();
            }
        });
    }

    public void b() {
        this.e = true;
    }

    boolean a(List<k> list) {
        FLogger.i("RequestProcessor", "processTaskFinished all task finished start", new Object[0]);
        this.f = true;
        List<ITaskResult> listB = b(list);
        if (this.f15755a.e()) {
            FLogger.w("RequestProcessor", "processTaskFinished exceptionTask not null!", new Object[0]);
            if (!this.f15755a.t) {
                return this.f15755a.a((Throwable) null);
            }
            this.f15755a.q = false;
            return false;
        }
        FLogger.i("RequestProcessor", "1.check results:" + this.f15755a.c().getId() + ",isResuleEmpty:" + Utils.isEmpty(listB), new Object[0]);
        for (ITaskResult iTaskResult : listB) {
            if (!Constants.a(iTaskResult.getErrorCode())) {
                FLogger.e("RequestProcessor", "task finish failed for " + iTaskResult.getErrorMessage());
                this.f15755a.a(iTaskResult.getException(), listB);
                return true;
            }
        }
        return this.f15755a.b(listB);
    }

    public void a() {
        Future future = this.d;
        if (future != null) {
            future.cancel(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        boolean zA;
        try {
            if (this.e) {
                FLogger.w("RequestProcessor", "allFuture.thenAcceptAsync executeSession invalid", new Object[0]);
                return;
            }
            synchronized (this.f15755a) {
                zA = a(this.f15756b);
            }
            if (zA) {
                this.f15755a.g();
            }
        } catch (Throwable th) {
            if (this.e) {
                FLogger.w("RequestProcessor", "allFuture.exceptionally executeSession invalid", new Object[0]);
            }
            FLogger.w("RequestProcessor", "allFuture.exceptionally, exceptionTask", new Object[0]);
            this.f15755a.a(th);
        }
    }

    private List<ITaskResult> b(List<k> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<k> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().u());
        }
        return arrayList;
    }

    public h(i iVar, List<k> list, ExecutorService executorService) {
        this.f15755a = iVar;
        this.f15756b = list;
        this.f15757c = executorService;
    }
}
