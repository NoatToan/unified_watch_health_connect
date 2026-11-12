package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class mt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42368c;
    public Boolean d;

    public boolean a() {
        Boolean bool = this.d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public void a(String str) {
        this.f42368c = str;
    }

    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(this.f42368c, str);
    }

    public boolean c() {
        return this.d != null;
    }

    public void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }
}
