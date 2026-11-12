package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class bjf {
    public static final bjf e = new bjf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1144a;

    public void b(String str, String str2) {
        if (this.f1144a) {
            bjb.f1143a.w(str, str2);
        } else {
            Log.w(str, str2);
        }
    }

    public void c(String str, String str2) {
        if (this.f1144a) {
            bjb.f1143a.i(str, str2);
        } else {
            Log.i(str, str2);
        }
    }

    public void a(String str, String str2, Throwable th) {
        if (this.f1144a) {
            bjb.f1143a.e(str, str2, th);
        } else {
            Log.e(str, str2, th);
        }
    }

    public void a(String str, String str2) {
        if (this.f1144a) {
            bjb.f1143a.e(str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    private bjf() {
        try {
            Class.forName("com.huawei.appgallery.log.LogAdaptor");
            this.f1144a = true;
        } catch (ClassNotFoundException unused) {
            this.f1144a = false;
        }
    }
}
