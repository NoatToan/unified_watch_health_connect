package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.miui.circulate.api.bean.CirculateParam;
import com.miui.circulate.api.bean.ResponseParam;
import com.miui.circulate.api.exception.CirculateException;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public class ex3 implements xw3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw3 f17144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f17145b;
    public int f;
    public final String h;
    public ExecutorService i;
    public CountDownLatch d = null;
    public CountDownLatch e = null;
    public final zw3 j = new a();
    public final Map<Integer, b14> c = new ConcurrentHashMap();
    public final dy6 g = new dy6.b(new Integer[0]).e();

    public class a implements zw3 {
        public a() {
        }

        @Override // defpackage.zw3
        public void a(int i, CirculateDeviceInfo circulateDeviceInfo, CirculateServiceInfo circulateServiceInfo) {
            CirculateDeviceInfo circulateDeviceInfoU = qx3.g().u(circulateDeviceInfo, circulateServiceInfo);
            if (circulateDeviceInfoU == null) {
                tpe.i("CirculateClientProxy", "onServiceUpdate error, null device");
                return;
            }
            tpe.f("CirculateClientProxy", "onServiceUpdate: device=" + circulateDeviceInfoU.j() + ", serviceInfo=" + circulateServiceInfo);
            if (ex3.this.f17144a == null || ex3.this.g.f16051b == null || !ex3.this.g.f16051b.contains(Integer.valueOf(ex3.this.y(i)))) {
                return;
            }
            ex3.this.f17144a.onServiceUpdate(circulateDeviceInfoU, circulateServiceInfo);
        }

        @Override // defpackage.zw3
        public void b(int i, ResponseParam responseParam) {
            tpe.g("CirculateClientProxy", true, "InnerCallBack-initFail: " + i);
            akp.d("initAsync_" + ex3.this.y(i), 1);
            ex3.this.e.countDown();
            if (ex3.this.f17144a != null) {
                ex3.this.f17144a.anyProtocolInitFail(i);
            }
            tpe.b("CirculateClientProxy", true, "InnerCallBack-initFail: " + ex3.this.d.getCount() + "," + ex3.this.e.getCount());
            if (ex3.this.e.getCount() != 0 || ex3.this.f17144a == null) {
                return;
            }
            tpe.g("CirculateClientProxy", true, "CirculateClient init fail");
            ex3.this.f17144a.initFail(responseParam);
        }

        @Override // defpackage.zw3
        public void c(int i) {
            tpe.b("CirculateClientProxy", true, "InnerCallBack-initSuccess: " + i);
            akp.d("initAsync_" + ex3.this.y(i), 1);
            ex3.this.d.countDown();
            if (ex3.this.f17144a != null) {
                ex3.this.f17144a.anyProtocolInitSuccess(i);
            }
            if (ex3.this.d.getCount() + ex3.this.e.getCount() != ex3.this.f || ex3.this.d.getCount() >= ex3.this.f || ex3.this.f17144a == null) {
                return;
            }
            tpe.g("CirculateClientProxy", true, "CirculateClient init success");
            ex3.this.f17144a.initSuccess();
        }

        @Override // defpackage.zw3
        public void d(int i, CirculateDeviceInfo circulateDeviceInfo, CirculateServiceInfo circulateServiceInfo) {
            CirculateDeviceInfo circulateDeviceInfoS = qx3.g().s(circulateDeviceInfo, circulateServiceInfo);
            if (circulateDeviceInfoS == null) {
                if (circulateServiceInfo.c == 393216) {
                    tpe.i("CirculateClientProxy", "bluetooth device found, but host device miss");
                    return;
                } else {
                    tpe.i("CirculateClientProxy", "onServiceFound error, null device");
                    return;
                }
            }
            tpe.f("CirculateClientProxy", "onServiceFound, discovery=, device=" + circulateDeviceInfoS.j() + ", service=" + circulateServiceInfo);
            if (ex3.this.f17144a == null || ex3.this.g.f16051b == null || !ex3.this.g.f16051b.contains(Integer.valueOf(ex3.this.y(i)))) {
                return;
            }
            ex3.this.f17144a.onServiceFound(circulateDeviceInfoS, circulateServiceInfo);
        }

        @Override // defpackage.zw3
        public void e(int i, CirculateDeviceInfo circulateDeviceInfo, CirculateServiceInfo circulateServiceInfo) {
            if (circulateServiceInfo == null) {
                tpe.i("CirculateClientProxy", "onServiceLost error, null serviceInfo, drop this message");
                return;
            }
            CirculateDeviceInfo circulateDeviceInfoT = qx3.g().t(circulateDeviceInfo, circulateServiceInfo);
            if (circulateDeviceInfoT == null) {
                if (!circulateDeviceInfo.f10301a.equals("camera_id")) {
                    tpe.i("CirculateClientProxy", "onServiceLost error, null device");
                    return;
                }
                tpe.f("CirculateClientProxy", "camera device, directly lost");
                if (ex3.this.f17144a == null || ex3.this.g.f16051b == null || !ex3.this.g.f16051b.contains(Integer.valueOf(ex3.this.y(i)))) {
                    return;
                }
                ex3.this.f17144a.onServiceLost(circulateDeviceInfo, circulateServiceInfo);
                return;
            }
            tpe.f("CirculateClientProxy", "onServiceLost, discovery=, device:" + circulateDeviceInfoT.j() + ", serviceInfo=" + circulateServiceInfo);
            if (ex3.this.f17144a == null || ex3.this.g.f16051b == null || !ex3.this.g.f16051b.contains(Integer.valueOf(ex3.this.y(i)))) {
                return;
            }
            ex3.this.f17144a.onServiceLost(circulateDeviceInfoT, circulateServiceInfo);
        }

        @Override // defpackage.zw3
        public void onConnectStateChange(int i, CirculateDeviceInfo circulateDeviceInfo, CirculateServiceInfo circulateServiceInfo) {
            if (circulateDeviceInfo == null || ex3.this.f17144a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("onConnectStateChange error, null device=");
                sb.append(circulateDeviceInfo == null);
                sb.append(", or null callback");
                tpe.i("CirculateClientProxy", sb.toString());
                return;
            }
            tpe.f("CirculateClientProxy", "onConnectStateChange, state=" + i + ", device=" + circulateDeviceInfo.j() + ", serviceInfo=" + circulateServiceInfo);
            ex3.this.f17144a.onConnectStateChange(i, circulateDeviceInfo, circulateServiceInfo);
        }
    }

    public class b implements Supplier<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b14 f17147a;

        public b(b14 b14Var) {
            this.f17147a = b14Var;
        }

        @Override // java.util.function.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void get() {
            tpe.f("CirculateClientProxy", "createClient type=" + ex3.this.y(this.f17147a.f()));
            this.f17147a.g(ex3.this.f17145b, ex3.this.j, ex3.this.h);
            akp.d("install_" + ex3.this.y(this.f17147a.f()), 0);
            return null;
        }
    }

    public ex3(yw3 yw3Var, Context context, String str) {
        this.f17144a = yw3Var;
        this.f17145b = context;
        this.h = str;
        x();
    }

    public static /* synthetic */ void A(Runnable runnable) {
        Process.setThreadPriority(-4);
        runnable.run();
    }

    public static /* synthetic */ Thread B(final Runnable runnable) {
        Thread thread = new Thread(new Runnable() { // from class: dx3
            @Override // java.lang.Runnable
            public final void run() {
                ex3.A(runnable);
            }
        });
        thread.setName("CirculateClientProxy");
        return thread;
    }

    public static /* synthetic */ boolean z(CirculateDeviceInfo circulateDeviceInfo) {
        return circulateDeviceInfo.f10301a.equals("local_device_id");
    }

    public final /* synthetic */ Void C(int i) {
        b14 b14Var = this.c.get(Integer.valueOf(y(i)));
        if (b14Var != null) {
            if (b14Var.d()) {
                this.j.c(i);
            } else {
                akp.a("initAsync_" + y(i), 1);
                b14Var.init();
            }
        }
        akp.d("init_" + y(i), 0);
        return null;
    }

    public final void D() {
        ExecutorService executorService = this.i;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.i.shutdown();
        this.i = null;
    }

    public final boolean E(dy6 dy6Var, boolean z) {
        if (dy6Var != null) {
            if (dy6Var.f16051b != null) {
                return true;
            }
            tpe.f("CirculateClientProxy", "validate discovery param: ServiceFilter can not be null");
            return false;
        }
        tpe.f("CirculateClientProxy", "validate discovery param: param is null, " + z);
        return z;
    }

    @Override // defpackage.xw3
    @SuppressLint({"NewApi"})
    public void a(List<CirculateDeviceInfo> list, List<CirculateDeviceInfo> list2, CirculateParam circulateParam) throws CirculateException {
        CirculateServiceInfo circulateServiceInfo;
        CirculateServiceInfo circulateServiceInfo2;
        if (circulateParam == null) {
            tpe.g("CirculateClientProxy", true, "circulateService: param can not be null");
            v(-3, list2, circulateParam);
            return;
        }
        int i = circulateParam.f10282a.c;
        if (i == 393216 && (circulateServiceInfo2 = circulateParam.c) != null && circulateServiceInfo2.c != 393216) {
            if (!TextUtils.equals("com.milink.service", this.f17145b.getPackageName()) && Build.VERSION.SDK_INT >= 30) {
                ifh.i(this.f17145b).B();
            }
            i = circulateParam.c.c;
        }
        b14 b14Var = this.c.get(Integer.valueOf(y(i)));
        if (!(b14Var instanceof dqc)) {
            tpe.c("CirculateClientProxy", "circulateService error, protocol not init, protocolType=" + circulateParam.f10282a.c);
            return;
        }
        tpe.b("CirculateClientProxy", true, "circulateService: dispatch " + i);
        ((dqc) b14Var).a(list, list2, circulateParam);
        if (TextUtils.equals("com.milink.service", this.f17145b.getPackageName()) || Build.VERSION.SDK_INT < 30 || (circulateServiceInfo = circulateParam.c) == null || circulateServiceInfo.c != 393216 || !list2.stream().anyMatch(new Predicate() { // from class: ax3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ex3.z((CirculateDeviceInfo) obj);
            }
        })) {
            return;
        }
        ifh.i(this.f17145b).z(d());
    }

    @Override // defpackage.xw3
    public void b(dy6 dy6Var) throws CirculateException {
        if (!E(dy6Var, true)) {
            throw new CirculateException("stop discovery error: param not correct");
        }
        if (dy6Var == null) {
            for (int size = this.g.f16051b.size() - 1; size >= 0; size--) {
                int iIntValue = this.g.f16051b.get(size).intValue();
                b14 b14Var = this.c.get(Integer.valueOf(y(iIntValue)));
                if (b14Var instanceof trc) {
                    ((trc) b14Var).b(dy6Var);
                    this.g.f16051b.remove(size);
                } else {
                    tpe.i("CirculateClientProxy", "start stopDiscovery warn, init protocol first! protocolType=" + iIntValue);
                }
            }
            return;
        }
        for (int size2 = dy6Var.f16051b.size() - 1; size2 >= 0; size2--) {
            int iIntValue2 = dy6Var.f16051b.get(size2).intValue();
            b14 b14Var2 = this.c.get(Integer.valueOf(y(iIntValue2)));
            boolean zContains = this.g.f16051b.contains(Integer.valueOf(y(iIntValue2)));
            if ((b14Var2 instanceof trc) && zContains) {
                ((trc) b14Var2).b(dy6Var);
                this.g.f16051b.remove(Integer.valueOf(y(iIntValue2)));
            } else {
                tpe.i("CirculateClientProxy", "start stopDiscovery warn, protocolType=" + iIntValue2 + zContains);
            }
        }
    }

    @Override // defpackage.xw3
    public void c(dy6 dy6Var, Executor executor) throws CirculateException {
        if (!E(dy6Var, false)) {
            throw new CirculateException("start discovery error, param not correct");
        }
        Iterator<Integer> it = dy6Var.f16051b.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            b14 b14Var = this.c.get(Integer.valueOf(y(iIntValue)));
            boolean zContains = this.g.f16051b.contains(Integer.valueOf(y(iIntValue)));
            boolean z = b14Var instanceof trc;
            if (z && !zContains) {
                this.g.f16051b.add(Integer.valueOf(y(iIntValue)));
                ((trc) b14Var).c(dy6Var, executor);
            } else if (z && y(iIntValue) == 65536) {
                ((trc) b14Var).c(dy6Var, executor);
            } else {
                tpe.i("CirculateClientProxy", "start startDiscovery warn, protocolType=" + iIntValue + zContains);
            }
        }
    }

    @Override // defpackage.xw3
    public CirculateDeviceInfo d() {
        return ((e96) gx3.e().a("DeviceManager")).d();
    }

    @Override // defpackage.xw3
    public hyc e(int i) throws CirculateException {
        b14 b14Var = this.c.get(Integer.valueOf(y(i)));
        if (b14Var != null) {
            return b14Var.e(i);
        }
        return null;
    }

    @Override // defpackage.xw3
    public void f(List<Integer> list) {
        tpe.f("CirculateClientProxy", "uninit");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iY = y(it.next().intValue());
            if (this.c.containsKey(Integer.valueOf(iY))) {
                if (qx3.n()) {
                    qx3.g().e(iY);
                } else {
                    tpe.c("CirculateClientProxy", "uninit error, null CirculateDeviceManager");
                }
                this.c.get(Integer.valueOf(iY)).release();
                this.c.remove(Integer.valueOf(iY));
            }
        }
    }

    @Override // defpackage.xw3
    public synchronized void g(List<Integer> list) throws CirculateException {
        if (list != null) {
            if (!list.isEmpty()) {
                this.f = list.size();
                this.d = new CountDownLatch(this.f);
                this.e = new CountDownLatch(this.f);
                ArrayList arrayList = new ArrayList();
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    final int iIntValue = it.next().intValue();
                    akp.a("init_" + y(iIntValue), 0);
                    arrayList.add(CompletableFuture.supplyAsync(new Supplier() { // from class: bx3
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return this.f4689a.C(iIntValue);
                        }
                    }, w()));
                }
                try {
                    CompletableFuture.allOf((CompletableFuture[]) arrayList.toArray(new CompletableFuture[0])).get();
                } catch (Exception e) {
                    tpe.c("CirculateClientProxy", "init: " + Log.getStackTraceString(e));
                }
                D();
                return;
            }
        }
        tpe.i("CirculateClientProxy", "init error, null protocolTypes");
    }

    @Override // defpackage.xw3
    public void release() {
        tpe.f("CirculateClientProxy", "release");
        Iterator<b14> it = this.c.values().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        if (qx3.n()) {
            qx3.g().w();
        }
        this.c.clear();
    }

    public final void v(int i, List<CirculateDeviceInfo> list, CirculateParam circulateParam) {
        CirculateServiceInfo circulateServiceInfoC = null;
        CirculateDeviceInfo circulateDeviceInfo = (list == null || list.size() <= 0) ? null : list.get(0);
        if (circulateParam != null) {
            circulateServiceInfoC = circulateDeviceInfo != null ? circulateDeviceInfo.c(circulateParam.f10282a.c) : null;
            if (circulateServiceInfoC != null) {
                circulateServiceInfoC = CirculateServiceInfo.a(circulateParam.f10282a.c);
            }
        }
        this.f17144a.onConnectStateChange(i, circulateDeviceInfo, circulateServiceInfoC);
    }

    public final ExecutorService w() {
        ExecutorService executorService = this.i;
        if (executorService == null || executorService.isShutdown()) {
            this.i = Executors.newFixedThreadPool(12, new ThreadFactory() { // from class: cx3
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return ex3.B(runnable);
                }
            });
        }
        return this.i;
    }

    public final void x() {
        tpe.a("CirculateClientProxy", "createClient");
        ServiceLoader<b14> serviceLoaderLoad = ServiceLoader.load(b14.class);
        ArrayList arrayList = new ArrayList();
        for (b14 b14Var : serviceLoaderLoad) {
            akp.a("install_" + y(b14Var.f()), 0);
            this.c.put(Integer.valueOf(b14Var.f()), b14Var);
            arrayList.add(CompletableFuture.supplyAsync(new b(b14Var), w()));
        }
        try {
            CompletableFuture.allOf((CompletableFuture[]) arrayList.toArray(new CompletableFuture[0])).get();
        } catch (Exception e) {
            tpe.c("CirculateClientProxy", "createClient: " + Log.getStackTraceString(e));
        }
    }

    public final int y(int i) {
        return fx3.a(i);
    }
}
