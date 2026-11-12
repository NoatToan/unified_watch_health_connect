package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;

/* JADX INFO: loaded from: classes11.dex */
public class oss {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile oss f29656b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f29657a;

    public oss(Context context) {
        this.f29657a = context;
    }

    public static oss a(Context context) {
        if (f29656b == null) {
            synchronized (oss.class) {
                try {
                    if (f29656b == null) {
                        f29656b = new oss(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f29656b;
    }

    public final void b(g3s g3sVar) {
        if (g3sVar instanceof rqh) {
            c14.c(this.f29657a, (rqh) g3sVar);
        } else if (g3sVar instanceof od8) {
            c14.b(this.f29657a, (od8) g3sVar);
        }
    }

    public void c(String str, int i, long j, long j2) {
        if (i < 0 || j2 < 0 || j <= 0) {
            return;
        }
        rqh rqhVarG = mss.g(this.f29657a, i, j, j2);
        rqhVarG.a(str);
        rqhVarG.b("5_7_8-C");
        b(rqhVarG);
    }

    public void d(String str, Intent intent, int i, String str2) {
        if (intent == null) {
            return;
        }
        f(str, mss.j(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), i, System.currentTimeMillis(), str2);
    }

    public void e(String str, Intent intent, String str2) {
        if (intent == null) {
            return;
        }
        f(str, mss.j(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), 5001, System.currentTimeMillis(), str2);
    }

    public void f(String str, String str2, String str3, int i, long j, String str4) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        od8 od8VarD = mss.d(this.f29657a, str2, str3, i, j, str4);
        od8VarD.a(str);
        od8VarD.b("5_7_8-C");
        b(od8VarD);
    }

    public void g(String str, String str2, String str3, int i, String str4) {
        f(str, str2, str3, i, System.currentTimeMillis(), str4);
    }

    public void h(String str, String str2, String str3, String str4) {
        f(str, str2, str3, 5002, System.currentTimeMillis(), str4);
    }

    public void i(String str, String str2, String str3, String str4) {
        f(str, str2, str3, 5001, System.currentTimeMillis(), str4);
    }

    public void j(String str, String str2, String str3, String str4) {
        f(str, str2, str3, AMapException.CODE_AMAP_SHARE_SIGNATURE_FAILURE, System.currentTimeMillis(), str4);
    }
}
