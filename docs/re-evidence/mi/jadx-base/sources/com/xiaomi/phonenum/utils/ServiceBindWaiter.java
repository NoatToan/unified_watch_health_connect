package com.xiaomi.phonenum.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class ServiceBindWaiter {

    public static class ServiceBindFailedException extends Exception {
        public ServiceBindFailedException(String str) {
            super(str);
        }
    }

    public static class ServiceBindTimeoutException extends Exception {
    }

    public class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IBinder[] f14023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f14024b;

        public a(IBinder[] iBinderArr, CountDownLatch countDownLatch) {
            this.f14023a = iBinderArr;
            this.f14024b = countDownLatch;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f14023a[0] = iBinder;
            this.f14024b.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ServiceConnection f14025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IBinder f14026b;

        public b(ServiceConnection serviceConnection, IBinder iBinder) {
            this.f14025a = serviceConnection;
            this.f14026b = iBinder;
        }

        public void a(Context context) {
            context.unbindService(this.f14025a);
        }
    }

    public static b a(Context context, Intent intent) throws InterruptedException, ServiceBindTimeoutException, ServiceBindFailedException {
        return b(context, intent, 5000L);
    }

    public static b b(Context context, Intent intent, long j) throws ServiceBindTimeoutException, InterruptedException, ServiceBindFailedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        IBinder[] iBinderArr = new IBinder[1];
        a aVar = new a(iBinderArr, countDownLatch);
        if (context.bindService(intent, aVar, 1)) {
            if (countDownLatch.await(j, TimeUnit.MILLISECONDS)) {
                return new b(aVar, iBinderArr[0]);
            }
            throw new ServiceBindTimeoutException();
        }
        throw new ServiceBindFailedException("can not bind to service intent=" + intent);
    }
}
