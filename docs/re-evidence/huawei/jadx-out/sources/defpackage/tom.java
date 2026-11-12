package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes18.dex */
public class tom {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f49441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f49442c;
    private String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f49440a = false;
    private boolean e = false;

    public void d(Drawable drawable) {
        this.f49441b = drawable;
    }

    public Drawable d() {
        return this.f49441b;
    }

    public void c(String str) {
        this.d = str;
    }

    public String a() {
        return this.d;
    }

    public void e(String str) {
        this.f49442c = str;
    }

    public String e() {
        return this.f49442c;
    }

    public boolean b() {
        return this.f49440a;
    }

    public void e(boolean z) {
        this.f49440a = z;
    }

    public boolean c() {
        return this.e;
    }

    public void b(boolean z) {
        this.e = z;
    }
}
