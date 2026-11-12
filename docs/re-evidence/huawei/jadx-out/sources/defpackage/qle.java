package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes16.dex */
public class qle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f46425b;
    private String d;
    private int h;
    private Rect g = new Rect();
    private int e = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46426c = -1;

    public qle() {
    }

    public qle(int i, String str, int i2) {
        this.f46424a = i;
        this.d = str;
        this.h = i2;
    }

    public int f() {
        return this.f46424a;
    }

    public void c(int i) {
        this.f46424a = i;
    }

    public String e() {
        return this.d;
    }

    public void e(String str) {
        this.d = str;
    }

    public int j() {
        return this.h;
    }

    public void b(int i) {
        this.h = i;
    }

    public Rect g() {
        return this.g;
    }

    public boolean k() {
        return this.f46425b;
    }

    public void b(boolean z) {
        this.f46425b = z;
    }

    public int i() {
        return this.e;
    }

    public void d(int i) {
        this.e = i;
    }

    public int h() {
        return this.f46426c;
    }

    public void e(int i) {
        this.f46426c = i;
    }

    public String toString() {
        return "TagInfo{itemId = " + this.f46424a + "'itemName = " + this.d + "'}";
    }
}
