package com.huawei.updatesdk.service.store;

import android.os.AsyncTask;
import com.huawei.updatesdk.sdk.service.storekit.bean.d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes20.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<AsyncTask> f30004a = new CopyOnWriteArrayList();

    private static void a(com.huawei.updatesdk.sdk.service.storekit.b bVar) {
        StringBuilder sb = new StringBuilder("executeTask, ActiveCount:");
        ThreadPoolExecutor threadPoolExecutor = c.f30005a;
        sb.append(threadPoolExecutor.getActiveCount());
        sb.append(", TaskCount:");
        sb.append(threadPoolExecutor.getTaskCount());
        com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("StoreAgent", sb.toString());
        bVar.a(threadPoolExecutor);
    }

    public static void a(AsyncTask asyncTask) {
        if (asyncTask == null) {
            return;
        }
        for (AsyncTask asyncTask2 : f30004a) {
            if (asyncTask2 != null && (asyncTask2.getStatus() == AsyncTask.Status.FINISHED || asyncTask2.isCancelled())) {
                f30004a.remove(asyncTask2);
            }
        }
        f30004a.add(asyncTask);
    }

    public static List<AsyncTask> a() {
        return f30004a;
    }

    public static d a(com.huawei.updatesdk.sdk.service.storekit.bean.c cVar) {
        return new com.huawei.updatesdk.sdk.service.storekit.b(cVar, null).c();
    }

    public static com.huawei.updatesdk.sdk.service.storekit.b a(com.huawei.updatesdk.service.bean.c cVar, com.huawei.updatesdk.sdk.service.storekit.bean.a aVar) {
        com.huawei.updatesdk.sdk.service.storekit.b bVar = new com.huawei.updatesdk.sdk.service.storekit.b(cVar, aVar);
        a(bVar);
        return bVar;
    }
}
