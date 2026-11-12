package com.miui.tsmclient.model;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.miui.tsmclient.util.LogUtils;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements ServiceConnection {
    public static final String e = "BaseAppTask";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f10346a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicBoolean f10347b = new AtomicBoolean(false);
    public boolean c;
    public Context d;

    public b(Context context) {
        this.d = context.getApplicationContext();
    }

    public abstract void a();

    public void a(IBinder iBinder) {
        LogUtils.d("BaseAppTask: onServiceConnected()");
        this.f10347b.set(true);
        this.f10346a.countDown();
    }

    public abstract BaseResponse b();

    public void c() {
        this.d.unbindService(this);
    }

    public BaseResponse d() {
        g();
        try {
            this.f10346a.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        synchronized (this) {
            try {
                if (this.c) {
                    i();
                    return new BaseResponse(6, new Object[0]);
                }
                BaseResponse baseResponseB = b();
                LogUtils.i("BaseAppTask: Execute finished, the result code is:" + baseResponseB.mResultCode);
                f();
                return baseResponseB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Object e();

    public void f() {
        i();
    }

    public void g() {
        a();
    }

    public void h() {
        i();
    }

    public synchronized void i() {
        try {
            if (this.f10347b.get()) {
                LogUtils.d("BaseAppTask: unbind service");
                c();
                this.f10347b.set(false);
            }
            this.c = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        LogUtils.d("BaseAppTask: onServiceDisconnected()");
        i();
    }
}
