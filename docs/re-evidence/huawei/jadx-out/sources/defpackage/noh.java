package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import lib.android.paypal.com.magnessdk.g;

/* JADX INFO: loaded from: classes3.dex */
public final class noh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static nor f43358b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f43359c = "WebHelper";
    private static Context d;
    private static ConcurrentHashMap<String, String> e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Handler f43357a = new Handler(Looper.myLooper()) { // from class: noh.4
        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            if (message.what != 1001) {
                return;
            }
            nox.b(noh.f43359c, "download succ,begining copy", true);
            noh.e(noh.c(), noh.e(), (String) message.obj);
        }
    };

    public static ConcurrentHashMap<String, String> b() {
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c() {
        try {
            return d.getDir("hwId", 0).getCanonicalPath() + "/";
        } catch (IOException e2) {
            nox.a(f43359c, "IOException:" + e2.getClass().getSimpleName(), true);
            return "";
        }
    }

    public static String e() {
        try {
            return d.getDir(g.r1, 0).getCanonicalPath() + "/";
        } catch (IOException e2) {
            nox.a(f43359c, "IOException:" + e2.getClass().getSimpleName(), true);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, String str2, String str3) throws Throwable {
        nox.b(f43359c, "handlerRequestCopyData", true);
        f43358b.b(str, str2, str3);
    }
}
