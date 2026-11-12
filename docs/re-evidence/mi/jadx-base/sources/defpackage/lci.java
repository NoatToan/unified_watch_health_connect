package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class lci {
    public boolean g;
    public final v63 h;
    public int c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24903b = 0;
    public int d = 0;
    public int f = 0;
    public int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24902a = 0;

    public lci(v63 v63Var) {
        this.h = (v63) b6i.g(v63Var);
    }

    public static boolean b(int i) {
        if (i == 1) {
            return false;
        }
        return ((i >= 208 && i <= 215) || i == 217 || i == 216) ? false : true;
    }

    public final boolean a(InputStream inputStream) throws Throwable {
        int i;
        int i2 = this.e;
        while (this.f24902a != 6 && (i = inputStream.read()) != -1) {
            try {
                int i3 = this.c;
                this.c = i3 + 1;
                if (this.g) {
                    this.f24902a = 6;
                    this.g = false;
                    return false;
                }
                int i4 = this.f24902a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    this.f24902a = 5;
                                } else if (i4 != 5) {
                                    b6i.i(false);
                                } else {
                                    int i5 = ((this.f24903b << 8) + i) - 2;
                                    ajo.a(inputStream, i5);
                                    this.c += i5;
                                    this.f24902a = 2;
                                }
                            } else if (i == 255) {
                                this.f24902a = 3;
                            } else if (i == 0) {
                                this.f24902a = 2;
                            } else if (i == 217) {
                                this.g = true;
                                f(i3 - 1);
                                this.f24902a = 2;
                            } else {
                                if (i == 218) {
                                    f(i3 - 1);
                                }
                                if (b(i)) {
                                    this.f24902a = 4;
                                } else {
                                    this.f24902a = 2;
                                }
                            }
                        } else if (i == 255) {
                            this.f24902a = 3;
                        }
                    } else if (i == 216) {
                        this.f24902a = 2;
                    } else {
                        this.f24902a = 6;
                    }
                } else if (i == 255) {
                    this.f24902a = 1;
                } else {
                    this.f24902a = 6;
                }
                this.f24903b = i;
            } catch (IOException e) {
                wdp.a(e);
            }
        }
        return (this.f24902a == 6 || this.e == i2) ? false : true;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public boolean e() {
        return this.g;
    }

    public final void f(int i) {
        int i2 = this.d;
        if (i2 > 0) {
            this.f = i;
        }
        this.d = i2 + 1;
        this.e = i2;
    }

    public boolean g(o98 o98Var) {
        if (this.f24902a == 6 || o98Var.J() <= this.c) {
            return false;
        }
        m3i m3iVar = new m3i(o98Var.y(), this.h.get(16384), this.h);
        try {
            ajo.a(m3iVar, this.c);
            return a(m3iVar);
        } catch (IOException e) {
            wdp.a(e);
            return false;
        } finally {
            a24.b(m3iVar);
        }
    }
}
