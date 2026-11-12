package com.miui.tsmclient.model;

import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclientsdk.MiTsmCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
public class e {
    public static final int f = 2;
    public static e g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10353a;
    public ExecutorService e = Executors.newFixedThreadPool(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, j> f10354b = new ConcurrentHashMap();
    public final Map<String, List<j>> c = new HashMap();
    public final Map<String, List<Future>> d = new HashMap();

    public static synchronized void b() {
        g = null;
    }

    public j a(String str, String str2) {
        j jVar;
        synchronized (this.f10354b) {
            try {
                if (this.f10354b.containsKey(str2)) {
                    jVar = this.f10354b.get(str2);
                } else {
                    j jVarA = g.a(str2);
                    this.f10354b.put(str2, jVarA);
                    jVar = jVarA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.c) {
            try {
                List<j> arrayList = this.c.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.c.put(str, arrayList);
                    this.f10353a++;
                }
                arrayList.add(jVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    public void a(Runnable runnable) {
        this.e.execute(runnable);
    }

    public static synchronized e a() {
        try {
            if (g == null) {
                g = new e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public void a(BaseResponse baseResponse, MiTsmCallback miTsmCallback) {
        if (this.e.isShutdown() || baseResponse == null || miTsmCallback == null) {
            return;
        }
        int i = baseResponse.mResultCode;
        if (i == 0) {
            miTsmCallback.onSuccess(i, baseResponse.mDatas);
            return;
        }
        LogUtils.d("api execute failed, errorCode: " + baseResponse.mResultCode + ", errorMsg: " + baseResponse.mMsg);
        miTsmCallback.onFail(baseResponse.mResultCode, baseResponse.mMsg, baseResponse.mDatas);
    }

    public void a(String str) {
        synchronized (this.d) {
            try {
                if (this.d.containsKey(str)) {
                    List<Future> list = this.d.get(str);
                    if (list != null) {
                        Iterator<Future> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().cancel(true);
                        }
                    }
                    this.d.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.c) {
            try {
                if (!this.c.containsKey(str)) {
                    LogUtils.d("tag:" + str + " never used, so return.");
                    return;
                }
                List<j> list2 = this.c.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator<j> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        it2.next().a();
                    }
                }
                this.c.remove(str);
                int i = this.f10353a - 1;
                this.f10353a = i;
                if (i == 0) {
                    LogUtils.d("card executor has no reference, so shutdown");
                    this.e.shutdownNow();
                    synchronized (this.f10354b) {
                        this.f10354b.clear();
                    }
                    this.c.clear();
                    b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(String str, Runnable runnable) {
        synchronized (this.d) {
            try {
                List<Future> arrayList = this.d.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(this.e.submit(runnable));
                this.d.put(str, arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
