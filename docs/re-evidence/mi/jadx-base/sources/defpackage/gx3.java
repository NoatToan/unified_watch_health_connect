package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.circulate.api.exception.CirculateException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class gx3 {
    public static gx3 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f19422b;
    public boolean c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f19424b;
        public boolean c = d63.f15124a.booleanValue();
        public String d = "";
        public boolean e = false;

        public a(Context context, String str) {
            Objects.requireNonNull(context);
            this.f19424b = context.getApplicationContext();
            Objects.requireNonNull(str);
            this.f19423a = str;
        }

        public a e(boolean z) {
            this.c = z;
            return this;
        }

        public a f(boolean z) {
            this.e = z;
            return this;
        }

        public a g(String str) {
            this.d = str;
            return this;
        }
    }

    public gx3(a aVar) {
        this.f19421a = aVar.f19423a;
        Context context = aVar.f19424b;
        this.f19422b = context;
        this.c = aVar.c;
        bpe.b bVar = new bpe.b(aVar.d, context);
        boolean z = true;
        bVar.c(true);
        if (!this.c && !d63.f15124a.booleanValue()) {
            z = false;
        }
        bVar.b(z);
        bVar.d("");
        bVar.e("/debug_log/");
        bVar.f(172800000L);
        tpe.h(bVar);
        tpe.f("CirculateContext", "circulate-core lib version=5.0.0.10.health-SNAPSHOT");
    }

    public static boolean d() {
        gx3 gx3Var = d;
        return gx3Var != null ? gx3Var.c : d63.f15124a.booleanValue();
    }

    public static gx3 e() {
        gx3 gx3Var = d;
        if (gx3Var != null) {
            return gx3Var;
        }
        throw new NullPointerException("please call Installer install first");
    }

    public static boolean f(Context context, String str) {
        boolean z = false;
        try {
            z = context.getContentResolver().call(Uri.parse("content://com.milink.service.circulate"), "check_permission", str, (Bundle) null).getBoolean("result", false);
        } catch (Exception e) {
            tpe.f("CirculateContext", "check permission error:" + e);
        }
        tpe.f("CirculateContext", "check permission " + str + " by provider, ret:" + z);
        return z;
    }

    public static boolean g(Context context) {
        return f(context, "common");
    }

    public static void h(a aVar) throws CirculateException {
        boolean z = TextUtils.equals(Application.getProcessName(), "com.milink.service:ui") || TextUtils.equals(Application.getProcessName(), "com.milink.service:provider");
        boolean zEquals = TextUtils.equals(Application.getProcessName(), "com.mi.health:device");
        if (!aVar.c && !z && !zEquals && !g(aVar.f19424b)) {
            throw new CirculateException("Circulate not available！");
        }
        if (d != null) {
            throw new CirculateException("Repeat install CirculateContext！");
        }
        synchronized (gx3.class) {
            try {
                if (d != null) {
                    throw new CirculateException("Repeat install CirculateContext！");
                }
                d = new hx3(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static gx3 i(a aVar) throws CirculateException {
        if (d == null) {
            h(aVar);
        }
        return d;
    }

    public abstract <T> T a(String str);

    public final Context b() {
        return this.f19422b;
    }

    public final String c() {
        return this.f19421a;
    }

    public abstract void j(String str, Object obj) throws CirculateException;
}
