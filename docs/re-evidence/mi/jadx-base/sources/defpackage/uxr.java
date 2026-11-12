package defpackage;

import com.xiaomi.yrn.env.entity.bundleload.load.YRNLoadRequest;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class uxr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f36262b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<YRNLoadRequest> f36263a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final uxr f36264a = new uxr();
    }

    public static uxr c() {
        return b.f36264a;
    }

    public boolean a(YRNLoadRequest yRNLoadRequest) {
        boolean zAdd;
        synchronized (f36262b) {
            try {
                zAdd = !d(yRNLoadRequest) ? this.f36263a.add(yRNLoadRequest) : false;
                ezr.c().f(YRNTraceEvent.newEvent(yRNLoadRequest.getAppName(), 1100, "YRNLoadTaskManager", null, "addRequest:" + zAdd + ",requestList size:" + this.f36263a.size() + ",request is " + yRNLoadRequest));
                StringBuilder sb = new StringBuilder();
                sb.append("YRNLoadTaskManager.addRequest:");
                sb.append(zAdd);
                zxr.a("YRN_YRNV3_SDK", sb.toString());
            } catch (Throwable th) {
                throw th;
            }
        }
        return zAdd;
    }

    public void b() {
        synchronized (f36262b) {
            this.f36263a.clear();
            zxr.a("YRN_YRNV3_SDK", "YRNLoadTaskManager.clearRequest");
        }
    }

    public final boolean d(YRNLoadRequest yRNLoadRequest) {
        boolean zContains = this.f36263a.contains(yRNLoadRequest);
        ezr.c().f(YRNTraceEvent.newEvent(yRNLoadRequest.getAppName(), 1100, "YRNLoadTaskManager.hasRequest", null, "contains is " + zContains + ",requestList size:" + this.f36263a.size()));
        if (zContains) {
            zxr.g("YRN_YRNV3_SDK", "YRNLoadTaskManager.hasRequest\n request is :" + yRNLoadRequest + "\n requestList is " + this.f36263a);
        }
        return zContains;
    }

    public void e(YRNLoadRequest yRNLoadRequest) {
        synchronized (f36262b) {
            boolean zRemove = this.f36263a.remove(yRNLoadRequest);
            ezr.c().f(YRNTraceEvent.newEvent(yRNLoadRequest.getAppName(), 1100, "YRNLoadTaskManager", null, "removeRequest:" + zRemove + ",requestList size:" + this.f36263a.size() + ",request is " + yRNLoadRequest));
            StringBuilder sb = new StringBuilder();
            sb.append("YRNLoadTaskManager.removeRequest:");
            sb.append(zRemove);
            sb.append(":");
            sb.append(yRNLoadRequest);
            zxr.a("YRN_YRNV3_SDK", sb.toString());
        }
    }

    public uxr() {
        this.f36263a = new ArrayList();
    }
}
