package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class mcy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41447b;
    private String d;

    public String a() {
        return this.f41447b;
    }

    public void c(String str) {
        this.f41447b = str;
    }

    public void b(String str) {
        this.d = str;
    }

    public String e() {
        return this.d;
    }

    public String d() {
        return this.f41446a;
    }

    public void e(String str) {
        this.f41446a = str;
    }

    public String c() {
        if (TextUtils.isEmpty(this.f41446a) || this.f41446a.length() <= 42) {
            return null;
        }
        return (this.f41446a.substring(0, 4) + this.f41446a.substring(20, 36)).toUpperCase(Locale.getDefault());
    }
}
