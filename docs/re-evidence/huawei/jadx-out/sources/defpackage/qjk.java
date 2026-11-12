package defpackage;

import android.widget.Switch;

/* JADX INFO: loaded from: classes43.dex */
public class qjk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46315c;
    private int g;
    private int h;
    private int j;
    private String e = Switch.class.getName();
    private boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f46313a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f46314b = false;

    public qjk(String str, int i, int i2, int i3) {
        this.f46315c = str;
        this.h = i;
        this.j = i2;
        this.g = i3;
    }

    public String e() {
        return this.f46315c;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.j;
    }

    public int d() {
        return this.g;
    }

    public boolean i() {
        return this.d;
    }

    public void d(Boolean bool) {
        this.d = bool.booleanValue();
    }

    public boolean h() {
        return this.f46313a;
    }

    public void e(Boolean bool) {
        this.f46313a = bool.booleanValue();
    }

    public boolean a() {
        return this.f46314b;
    }

    public void a(boolean z) {
        this.f46314b = z;
    }
}
