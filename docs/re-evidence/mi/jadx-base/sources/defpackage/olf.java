package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class olf implements ilf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29275b;
    public int c;

    public olf(String str, int i, int i2) {
        this.f29274a = str;
        this.f29275b = i;
        this.c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olf)) {
            return false;
        }
        olf olfVar = (olf) obj;
        if (this.f29275b < 0 || olfVar.f29275b < 0) {
            return TextUtils.equals(this.f29274a, olfVar.f29274a) && this.c == olfVar.c;
        }
        return TextUtils.equals(this.f29274a, olfVar.f29274a) && this.f29275b == olfVar.f29275b && this.c == olfVar.c;
    }

    public int hashCode() {
        return l4h.b(this.f29274a, Integer.valueOf(this.c));
    }
}
