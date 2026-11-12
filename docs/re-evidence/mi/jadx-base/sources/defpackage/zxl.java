package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class zxl {
    public static zxl g;
    public static String h = uys.a(5) + "-";
    public static long i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f41786a;
    public boolean c;
    public Messenger f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Messenger f41787b = null;
    public List<Message> d = new ArrayList();
    public boolean e = false;

    public zxl(Context context) {
        this.c = false;
        this.f41786a = context.getApplicationContext();
        if (f()) {
            x9s.B("use miui push service");
            this.c = true;
        }
    }

    public static zxl h(Context context) {
        if (g == null) {
            g = new zxl(context);
        }
        return g;
    }

    public final Message a(Intent intent) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 17;
        messageObtain.obj = intent;
        return messageObtain;
    }

    public final synchronized void e(Intent intent) {
        try {
            if (this.e) {
                Message messageA = a(intent);
                if (this.d.size() >= 50) {
                    this.d.remove(0);
                }
                this.d.add(messageA);
                return;
            }
            if (this.f == null) {
                this.f41786a.bindService(intent, new ods(this), 1);
                this.e = true;
                this.d.clear();
                this.d.add(a(intent));
            } else {
                try {
                    this.f.send(a(intent));
                } catch (RemoteException unused) {
                    this.f = null;
                    this.e = false;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean f() {
        if (hht.f20083b) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.f41786a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            return packageInfo != null && packageInfo.versionCode >= 104;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean i(Intent intent) {
        try {
            if (y0t.i()) {
                this.f41786a.startService(intent);
                return true;
            }
            e(intent);
            return true;
        } catch (Exception e) {
            x9s.s(e);
            return false;
        }
    }
}
