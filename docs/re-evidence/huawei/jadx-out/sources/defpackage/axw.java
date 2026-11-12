package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class axw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f766b;
    private StringBuilder d;
    private int e;

    public int c() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public String d() {
        StringBuilder sb = this.d;
        if (sb == null) {
            return null;
        }
        return sb.toString();
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb = this.d;
        if (sb == null) {
            this.d = new StringBuilder(str);
        } else {
            sb.append("|");
            sb.append(str);
        }
    }

    public void c(int i) {
        this.f766b = i;
    }

    public int b() {
        return this.f766b;
    }
}
