package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public class hbl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36359c;
    private hbh d;
    private String e;

    public hbl(hbh hbhVar) {
        this.d = hbhVar;
        if (hbhVar == null) {
            return;
        }
        String strG = hbhVar.g();
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        this.f36358b = hbd.e(strG, "\\.", 0);
        this.f36359c = hbd.e(strG, "\\.", 1);
    }

    public int b() {
        return this.f36358b;
    }

    public int c() {
        return this.f36359c;
    }

    public String e() {
        return this.f36357a;
    }

    public void e(String str) {
        this.f36357a = str;
    }

    public String d() {
        return this.e;
    }

    public void b(String str) {
        this.e = str;
    }
}
