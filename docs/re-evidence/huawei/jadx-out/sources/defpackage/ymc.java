package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.text.TextUtils;
import com.huawei.wearengine.core.callback.ServiceConnectStateCallback;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes46.dex */
public class ymc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f53633c;
    private String d;
    private final String j;
    private final ExecutorService g = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Object f = new Object();
    private final Object e = new Object();
    private ServiceConnectStateCallback i = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile IBinder f53632b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f53631a = false;
    private final ServiceConnection h = new ServiceConnection() { // from class: ymc.4
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            yit.e("ServiceBindingHelper", "onServiceConnected success!");
            synchronized (ymc.this.e) {
                ymc.this.f53632b = iBinder;
                ymc.this.f53631a = true;
                yit.a("ServiceBindingHelper", "onServiceConnected BINDER_LOCK notifyAll");
                ymc.this.e.notifyAll();
            }
            ymc.this.e(componentName, iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            yit.e("ServiceBindingHelper", "onServiceDisconnected success!");
            synchronized (ymc.this.e) {
                ymc.this.f53632b = null;
                ymc.this.f53631a = true;
                yit.a("ServiceBindingHelper", "onServiceDisconnected BINDER_LOCK notifyAll");
                ymc.this.e.notifyAll();
            }
            ymc.this.d(componentName);
        }
    };

    public ymc(String str, String str2) {
        this.j = str;
        this.f53633c = str2;
    }

    public void e(String str) {
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final ComponentName componentName, final IBinder iBinder) {
        if (this.i == null) {
            yit.c("ServiceBindingHelper", this.f53633c + ", mServiceConnectStateCallback is null");
            return;
        }
        this.g.execute(new Runnable() { // from class: ymc.2
            @Override // java.lang.Runnable
            public void run() {
                ymc.this.i.onConnectChanged(componentName, iBinder, true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final ComponentName componentName) {
        if (this.i == null) {
            yit.c("ServiceBindingHelper", this.f53633c + ", mServiceConnectStateCallback is null");
            return;
        }
        this.g.execute(new Runnable() { // from class: ymc.1
            @Override // java.lang.Runnable
            public void run() {
                ymc.this.i.onConnectChanged(componentName, null, false);
            }
        });
    }

    public void d(ServiceConnectStateCallback serviceConnectStateCallback) {
        yit.e("ServiceBindingHelper", "registerOnServiceConnectStateCallback:" + this.f53633c);
        this.i = serviceConnectStateCallback;
    }

    private void d() {
        yit.e("ServiceBindingHelper", "start bindService service : " + this.f53633c);
        synchronized (this.f) {
            yit.e("ServiceBindingHelper", "bindService locked");
            if (this.f53632b != null) {
                yit.e("ServiceBindingHelper", "mBinder is not null");
                return;
            }
            if (TextUtils.isEmpty(this.j) || TextUtils.isEmpty(this.f53633c)) {
                yit.b("ServiceBindingHelper", "packageName or className is empty");
                throw new IllegalStateException(String.valueOf(12));
            }
            Intent intent = new Intent();
            intent.setPackage(this.j);
            intent.setClassName(this.j, this.f53633c);
            if (!TextUtils.isEmpty(this.d)) {
                intent.setAction(this.d);
            }
            Intent intentD = yiv.d(intent);
            if (intentD == null) {
                throw new IllegalStateException(String.valueOf(12));
            }
            synchronized (this.e) {
                this.f53631a = false;
                if (!yiv.a().bindService(intentD, this.h, 37)) {
                    yit.b("ServiceBindingHelper", "bindService do not has permission");
                    throw new IllegalStateException(String.valueOf(15));
                }
                a();
            }
        }
    }

    private void a() {
        while (!this.f53631a) {
            try {
                yit.e("ServiceBindingHelper", "bindService BINDER_LOCK wait");
                this.e.wait(30000L);
                yit.e("ServiceBindingHelper", "bindService BINDER_LOCK continue");
                this.f53631a = true;
            } catch (InterruptedException unused) {
                yit.b("ServiceBindingHelper", "bindService wait error");
                return;
            }
        }
        yit.e("ServiceBindingHelper", "bindService finish");
    }

    public void b() {
        synchronized (this.f) {
            if (this.f53632b != null) {
                yit.e("ServiceBindingHelper", "begin unBindService");
                try {
                    yiv.a().unbindService(this.h);
                } catch (Exception unused) {
                    yit.b("ServiceBindingHelper", "unBindService has exception");
                }
                this.f53632b = null;
            }
        }
        yit.e("ServiceBindingHelper", "unBindService success");
    }

    public IBinder c() {
        return this.f53632b;
    }

    public IBinder e() {
        if (this.f53632b == null) {
            d();
        }
        return this.f53632b;
    }
}
