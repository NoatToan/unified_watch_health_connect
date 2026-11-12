package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class qzk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32031a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32032b = 0;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    public int a() {
        return this.g ? this.f32031a : this.f32032b;
    }

    public int b() {
        return this.f32031a;
    }

    public int c() {
        return this.f32032b;
    }

    public int d() {
        return this.g ? this.f32032b : this.f32031a;
    }

    public void e(int i, int i2) {
        this.h = false;
        if (i != Integer.MIN_VALUE) {
            this.e = i;
            this.f32031a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f = i2;
            this.f32032b = i2;
        }
    }

    public void f(boolean z) {
        if (z == this.g) {
            return;
        }
        this.g = z;
        if (!this.h) {
            this.f32031a = this.e;
            this.f32032b = this.f;
            return;
        }
        if (z) {
            int i = this.d;
            if (i == Integer.MIN_VALUE) {
                i = this.e;
            }
            this.f32031a = i;
            int i2 = this.c;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f;
            }
            this.f32032b = i2;
            return;
        }
        int i3 = this.c;
        if (i3 == Integer.MIN_VALUE) {
            i3 = this.e;
        }
        this.f32031a = i3;
        int i4 = this.d;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f;
        }
        this.f32032b = i4;
    }

    public void g(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f32031a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f32032b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f32031a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f32032b = i2;
        }
    }
}
