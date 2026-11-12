package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class k8s implements j7s {
    public static volatile k8s c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j7s f23610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23611b = g8s.f18737a;

    public k8s(Context context) {
        this.f23610a = g8s.a(context);
        x9s.o("create id manager is: " + this.f23611b);
    }

    public static k8s a(Context context) {
        if (c == null) {
            synchronized (k8s.class) {
                try {
                    if (c == null) {
                        c = new k8s(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final String b(String str) {
        return str == null ? "" : str;
    }

    public void c() {
    }

    public void d(Map<String, String> map) {
        if (map == null) {
            return;
        }
        String strE = e();
        if (!TextUtils.isEmpty(strE)) {
            map.put("udid", strE);
        }
        String strA = a();
        if (!TextUtils.isEmpty(strA)) {
            map.put("oaid", strA);
        }
        String strF = f();
        if (!TextUtils.isEmpty(strF)) {
            map.put("vaid", strF);
        }
        String strG = g();
        if (!TextUtils.isEmpty(strG)) {
            map.put("aaid", strG);
        }
        map.put("oaid_type", String.valueOf(this.f23611b));
    }

    public String e() {
        return null;
    }

    public String f() {
        return null;
    }

    public String g() {
        return null;
    }

    @Override // defpackage.j7s
    /* JADX INFO: renamed from: a */
    public boolean mo66a() {
        return this.f23610a.mo66a();
    }

    @Override // defpackage.j7s
    public String a() {
        return b(this.f23610a.a());
    }
}
