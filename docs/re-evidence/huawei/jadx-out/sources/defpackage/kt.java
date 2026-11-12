package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.alipay.sdk.m.c.b;
import com.alipay.sdk.m.n0.a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class kt implements b {

    public static final class e implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f39397a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f39398c;

        public e() {
            this.f39398c = false;
            this.f39397a = new LinkedBlockingQueue<>();
        }

        public IBinder d() throws InterruptedException {
            if (this.f39398c) {
                throw new IllegalStateException();
            }
            this.f39398c = true;
            return this.f39397a.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f39397a.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        e eVar = new e();
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (context.bindService(intent, eVar, 1)) {
            try {
                return a.AbstractBinderC0018a.a(eVar.d()).a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(eVar);
            }
        }
        return null;
    }
}
