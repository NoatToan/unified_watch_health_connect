package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public class icm implements c93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21002a;

    public icm(String str) {
        this.f21002a = (String) b6i.g(str);
    }

    @Override // defpackage.c93
    public String a() {
        return this.f21002a;
    }

    @Override // defpackage.c93
    public boolean b(Uri uri) {
        return this.f21002a.contains(uri.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof icm) {
            return this.f21002a.equals(((icm) obj).f21002a);
        }
        return false;
    }

    public int hashCode() {
        return this.f21002a.hashCode();
    }

    public String toString() {
        return this.f21002a;
    }
}
