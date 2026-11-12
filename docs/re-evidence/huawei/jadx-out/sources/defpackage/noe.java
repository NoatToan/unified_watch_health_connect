package defpackage;

import android.content.Intent;
import com.huawei.hwidauth.oberver.a;

/* JADX INFO: loaded from: classes3.dex */
public class noe {
    private static noe d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f43348b;

    private noe() {
    }

    public static noe a() {
        noe noeVar;
        synchronized (noe.class) {
            if (d == null) {
                b(new noe());
            }
            noeVar = d;
        }
        return noeVar;
    }

    private static void b(noe noeVar) {
        synchronized (noe.class) {
            d = noeVar;
        }
    }

    public void d(a aVar) {
        synchronized (this) {
            nox.b("WeixinAuthLogin", "WeixinAuthLogin register:", true);
            this.f43348b = aVar;
        }
    }

    public void c(Intent intent) {
        synchronized (this) {
            nox.b("WeixinAuthLogin", "WeixinAuthLogin send:", true);
            a aVar = this.f43348b;
            if (aVar != null) {
                aVar.a(intent);
            } else {
                nox.a("WeixinAuthLogin", "mWeixinObserver is null.", true);
            }
        }
    }

    public void d() {
        synchronized (this) {
            nox.b("WeixinAuthLogin", "WeixinAuthLogin unregister:", true);
            if (this.f43348b != null) {
                this.f43348b = null;
            }
        }
    }
}
