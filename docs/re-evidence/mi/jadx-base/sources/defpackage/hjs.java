package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.miui.tsmclient.util.LogUtils;
import com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public class hjs implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20141a = "DKFServiceConnection";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f20142b = new CountDownLatch(1);
    public final WeakReference<Context> c;
    public boolean d;
    public IDigitalKeyFramework e;

    public hjs(Context context) {
        this.c = new WeakReference<>(context);
    }

    public int a() {
        String str;
        Context context = this.c.get();
        if (context == null) {
            return -1;
        }
        int i = 0;
        if (this.d) {
            str = "service is already bound";
        } else {
            Intent intent = new Intent("org.carconnectivity.android.digitalkey.action.service");
            intent.setPackage(context.getPackageName());
            boolean zBindService = context.bindService(intent, this, 1);
            if (zBindService) {
                try {
                    this.f20142b.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    LogUtils.w("DKFServiceConnection", "guardBind interruptedException");
                    i = 11;
                }
            } else {
                i = 3;
            }
            str = "bindService isBind = " + zBindService;
        }
        LogUtils.d("DKFServiceConnection", str);
        return i;
    }

    public IDigitalKeyFramework b() {
        return this.e;
    }

    public void c() {
        Context context = this.c.get();
        if (context != null && this.d) {
            LogUtils.d("DKFServiceConnection", "tsm dkf unbindService");
            try {
                context.unbindService(this);
            } catch (Exception e) {
                LogUtils.e("DKFServiceConnection", "tsm dkf unbind occur exception" + e);
            }
            this.d = false;
            this.e = null;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        LogUtils.t("DKFServiceConnection", "tsm dkf onServiceConnected");
        this.e = IDigitalKeyFramework.Stub.asInterface(iBinder);
        this.d = true;
        this.f20142b.countDown();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        LogUtils.t("DKFServiceConnection", "tsm dkf onServiceDisconnected");
        this.d = false;
        this.f20142b.countDown();
    }
}
