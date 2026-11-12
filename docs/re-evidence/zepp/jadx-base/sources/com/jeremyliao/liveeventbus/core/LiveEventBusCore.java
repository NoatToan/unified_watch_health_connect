package com.jeremyliao.liveeventbus.core;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.ExternalLiveData;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import com.jeremyliao.liveeventbus.ipc.consts.IpcConst;
import com.jeremyliao.liveeventbus.ipc.core.ProcessorManager;
import com.jeremyliao.liveeventbus.ipc.receiver.LebIpcReceiver;
import com.jeremyliao.liveeventbus.logger.DefaultLogger;
import com.jeremyliao.liveeventbus.logger.Logger;
import com.jeremyliao.liveeventbus.logger.LoggerManager;
import com.jeremyliao.liveeventbus.utils.AppUtils;
import com.jeremyliao.liveeventbus.utils.ThreadUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveEventBusCore {
    private final Map<String, c<Object>> a;
    private final Config b;
    private boolean c;
    private boolean d;
    private LoggerManager e;
    private LebIpcReceiver f;
    private boolean g;
    public final b h;

    public class b {
        public b() {
        }

        private int a(LiveData liveData) {
            try {
                Field declaredField = LiveData.class.getDeclaredField("mActiveCount");
                declaredField.setAccessible(true);
                return ((Integer) declaredField.get(liveData)).intValue();
            } catch (Exception unused) {
                return -1;
            }
        }

        private int e(LiveData liveData) {
            try {
                Field declaredField = LiveData.class.getDeclaredField("mObservers");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(liveData);
                Method declaredMethod = obj.getClass().getDeclaredMethod("size", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Integer) declaredMethod.invoke(obj, new Object[0])).intValue();
            } catch (Exception unused) {
                return -1;
            }
        }

        private String f(LiveData liveData) {
            try {
                Field declaredField = LiveData.class.getDeclaredField("mObservers");
                declaredField.setAccessible(true);
                return declaredField.get(liveData).toString();
            } catch (Exception unused) {
                return "";
            }
        }

        public String b() {
            return "lifecycleObserverAlwaysActive: " + LiveEventBusCore.this.c + "\nautoClear: " + LiveEventBusCore.this.d + "\nlogger enable: " + LiveEventBusCore.this.e.isEnable() + "\nlogger: " + LiveEventBusCore.this.e.getLogger() + "\nReceiver register: " + LiveEventBusCore.this.g + "\nApplication: " + AppUtils.getApp() + "\n";
        }

        public String c() {
            StringBuilder sb = new StringBuilder();
            for (String str : LiveEventBusCore.this.a.keySet()) {
                sb.append("Event name: " + str);
                sb.append("\n");
                c.g gVar = ((c) LiveEventBusCore.this.a.get(str)).b;
                sb.append("\tversion: " + gVar.getVersion());
                sb.append("\n");
                sb.append("\thasActiveObservers: " + gVar.hasActiveObservers());
                sb.append("\n");
                sb.append("\thasObservers: " + gVar.hasObservers());
                sb.append("\n");
                sb.append("\tActiveCount: " + a(gVar));
                sb.append("\n");
                sb.append("\tObserverCount: " + e(gVar));
                sb.append("\n");
                sb.append("\tObservers: ");
                sb.append("\n");
                sb.append("\t\t" + f(gVar));
                sb.append("\n");
            }
            return sb.toString();
        }

        public String d() {
            return "*********Base info*********\n" + b() + "*********Event info*********\n" + c();
        }
    }

    public class c<T> implements Observable<T> {

        @NonNull
        private final String a;
        private final Map<Observer, d<T>> c = new HashMap();
        private final Handler d = new Handler(Looper.getMainLooper());
        private final c<T>.g<T> b = new g<>();

        public class a implements Runnable {
            public final /* synthetic */ Object a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ boolean c;

            public a(Object obj, boolean z, boolean z2) {
                this.a = obj;
                this.b = z;
                this.c = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.j(this.a, this.b, this.c);
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ LifecycleOwner a;
            public final /* synthetic */ Observer b;

            public b(LifecycleOwner lifecycleOwner, Observer observer) {
                this.a = lifecycleOwner;
                this.b = observer;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.l(this.a, this.b);
            }
        }

        /* JADX INFO: renamed from: com.jeremyliao.liveeventbus.core.LiveEventBusCore$c$c, reason: collision with other inner class name */
        public class RunnableC0724c implements Runnable {
            public final /* synthetic */ LifecycleOwner a;
            public final /* synthetic */ Observer b;

            public RunnableC0724c(LifecycleOwner lifecycleOwner, Observer observer) {
                this.a = lifecycleOwner;
                this.b = observer;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.n(this.a, this.b);
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ Observer a;

            public d(Observer observer) {
                this.a = observer;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.k(this.a);
            }
        }

        public class e implements Runnable {
            public final /* synthetic */ Observer a;

            public e(Observer observer) {
                this.a = observer;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.m(this.a);
            }
        }

        public class f implements Runnable {
            public final /* synthetic */ Observer a;

            public f(Observer observer) {
                this.a = observer;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.p(this.a);
            }
        }

        public class g<T> extends ExternalLiveData<T> {
            private g() {
            }

            @Override // androidx.p008lifecycle.ExternalLiveData
            public Lifecycle.State observerActiveLevel() {
                return LiveEventBusCore.this.c ? Lifecycle.State.CREATED : Lifecycle.State.STARTED;
            }

            @Override // androidx.p008lifecycle.LiveData
            public void removeObserver(@NonNull Observer<? super T> observer) {
                super.removeObserver(observer);
                if (LiveEventBusCore.this.d && !c.this.b.hasObservers()) {
                    LiveEventBusCore.get().a.remove(c.this.a);
                }
                LiveEventBusCore.this.e.log(Level.INFO, "observer removed: " + observer);
            }
        }

        public class h implements Runnable {
            private Object a;
            private LifecycleOwner b;

            public h(@Nullable Object obj, LifecycleOwner lifecycleOwner) {
                this.a = obj;
                this.b = lifecycleOwner;
            }

            @Override // java.lang.Runnable
            public void run() {
                LifecycleOwner lifecycleOwner = this.b;
                if (lifecycleOwner == null || !lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    return;
                }
                c.this.o(this.a);
            }
        }

        public class i implements Runnable {
            private Object a;

            public i(Object obj) {
                this.a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.o(this.a);
            }
        }

        public c(String str) {
            this.a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void j(T t, boolean z, boolean z2) {
            LiveEventBusCore.this.e.log(Level.INFO, "broadcast: " + t + " foreground: " + z + " with key: " + this.a);
            Application app = AppUtils.getApp();
            if (app == null) {
                LiveEventBusCore.this.e.log(Level.WARNING, "application is null, you can try setContext() when config");
                return;
            }
            Intent intent = new Intent(IpcConst.ACTION);
            if (z && Build.VERSION.SDK_INT >= 16) {
                intent.addFlags(268435456);
            }
            if (z2) {
                intent.setPackage(app.getPackageName());
            }
            intent.putExtra(IpcConst.KEY, this.a);
            if (ProcessorManager.getManager().writeTo(intent, t)) {
                try {
                    app.sendBroadcast(intent);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void k(@NonNull Observer<T> observer) {
            d<T> dVar = LiveEventBusCore.this.new d<>(observer);
            ((d) dVar).b = this.b.getVersion() > -1;
            this.c.put(observer, dVar);
            this.b.observeForever(dVar);
            LiveEventBusCore.this.e.log(Level.INFO, "observe forever observer: " + dVar + "(" + observer + ") with key: " + this.a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void l(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<T> observer) {
            d dVar = LiveEventBusCore.this.new d(observer);
            dVar.b = this.b.getVersion() > -1;
            this.b.observe(lifecycleOwner, dVar);
            LiveEventBusCore.this.e.log(Level.INFO, "observe observer: " + dVar + "(" + observer + ") on owner: " + lifecycleOwner + " with key: " + this.a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void m(@NonNull Observer<T> observer) {
            d<T> dVar = LiveEventBusCore.this.new d<>(observer);
            this.c.put(observer, dVar);
            this.b.observeForever(dVar);
            LiveEventBusCore.this.e.log(Level.INFO, "observe sticky forever observer: " + dVar + "(" + observer + ") with key: " + this.a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void n(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<T> observer) {
            d dVar = LiveEventBusCore.this.new d(observer);
            this.b.observe(lifecycleOwner, dVar);
            LiveEventBusCore.this.e.log(Level.INFO, "observe sticky observer: " + dVar + "(" + observer + ") on owner: " + lifecycleOwner + " with key: " + this.a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void o(T t) {
            LiveEventBusCore.this.e.log(Level.INFO, "post: " + t + " with key: " + this.a);
            this.b.setValue(t);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void p(@NonNull Observer<T> observer) {
            if (this.c.containsKey(observer)) {
                observer = this.c.remove(observer);
            }
            this.b.removeObserver(observer);
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        @Deprecated
        public void broadcast(T t) {
            broadcast(t, false, false);
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<T> observer) {
            if (ThreadUtils.isMainThread()) {
                l(lifecycleOwner, observer);
            } else {
                this.d.post(new b(lifecycleOwner, observer));
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void observeForever(@NonNull Observer<T> observer) {
            if (ThreadUtils.isMainThread()) {
                k(observer);
            } else {
                this.d.post(new d(observer));
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void observeSticky(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<T> observer) {
            if (ThreadUtils.isMainThread()) {
                n(lifecycleOwner, observer);
            } else {
                this.d.post(new RunnableC0724c(lifecycleOwner, observer));
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void observeStickyForever(@NonNull Observer<T> observer) {
            if (ThreadUtils.isMainThread()) {
                m(observer);
            } else {
                this.d.post(new e(observer));
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void post(T t) {
            if (ThreadUtils.isMainThread()) {
                o(t);
            } else {
                this.d.post(new i(t));
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postAcrossApp(T t) {
            broadcast(t, false, false);
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postAcrossProcess(T t) {
            broadcast(t, false, true);
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postDelay(T t, long j) {
            this.d.postDelayed(new i(t), j);
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postOrderly(T t) {
            this.d.post(new i(t));
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void removeObserver(@NonNull Observer<T> observer) {
            if (ThreadUtils.isMainThread()) {
                p(observer);
            } else {
                this.d.post(new f(observer));
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void broadcast(T t, boolean z, boolean z2) {
            if (AppUtils.getApp() == null) {
                post(t);
            } else if (ThreadUtils.isMainThread()) {
                j(t, z, z2);
            } else {
                this.d.post(new a(t, z, z2));
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postDelay(LifecycleOwner lifecycleOwner, T t, long j) {
            this.d.postDelayed(new h(t, lifecycleOwner), j);
        }
    }

    public class d<T> implements Observer<T> {

        @NonNull
        private final Observer<T> a;
        private boolean b = false;

        public d(Observer<T> observer) {
            this.a = observer;
        }

        @Override // androidx.p008lifecycle.Observer
        public void onChanged(@Nullable T t) {
            if (this.b) {
                this.b = false;
                return;
            }
            LiveEventBusCore.this.e.log(Level.INFO, "message received: " + t);
            try {
                this.a.onChanged(t);
            } catch (ClassCastException e) {
                LiveEventBusCore.this.e.log(Level.WARNING, "class cast error on message received: " + t, e);
            } catch (Exception e2) {
                LiveEventBusCore.this.e.log(Level.WARNING, "error on message received: " + t, e2);
            }
        }
    }

    public static class e {
        private static final LiveEventBusCore a = new LiveEventBusCore();

        private e() {
        }
    }

    public static LiveEventBusCore get() {
        return e.a;
    }

    public Config config() {
        return this.b;
    }

    public void f(boolean z) {
        this.e.setEnable(z);
    }

    public void g() {
        Application app;
        if (this.g || (app = AppUtils.getApp()) == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(IpcConst.ACTION);
        app.registerReceiver(this.f, intentFilter);
        this.g = true;
    }

    public void h(boolean z) {
        this.d = z;
    }

    public void i(boolean z) {
        this.c = z;
    }

    public void j(@NonNull Logger logger) {
        this.e.setLogger(logger);
    }

    public synchronized <T> Observable<T> with(String str, Class<T> cls) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, new c<>(str));
        }
        return this.a.get(str);
    }

    private LiveEventBusCore() {
        this.b = new Config();
        this.g = false;
        this.h = new b();
        this.a = new HashMap();
        this.c = true;
        this.d = false;
        this.e = new LoggerManager(new DefaultLogger());
        this.f = new LebIpcReceiver();
        g();
    }
}
