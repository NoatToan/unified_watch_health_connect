package defpackage;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class tp5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f34906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34907b;
    public boolean c;
    public boolean d;
    public List<Integer> g;
    public int i;
    public float e = -1.0f;
    public float f = -1.0f;
    public boolean h = true;

    public tp5(Date date, int i) {
        Objects.requireNonNull(date);
        this.f34906a = date;
        this.f34907b = i;
    }

    public Date a() {
        return this.f34906a;
    }

    public int b() {
        return this.f34906a.getDate();
    }

    public int c() {
        return this.i;
    }

    public int d() {
        return this.f34907b;
    }

    public List<Integer> e() {
        return this.g;
    }

    public float f() {
        return this.e;
    }

    public float g() {
        return this.f;
    }

    public boolean h() {
        return this.i == 1;
    }

    public boolean i() {
        return this.h;
    }

    public boolean j() {
        return this.c;
    }

    public boolean k() {
        return this.d;
    }

    public void l(int i) {
        this.i = i;
    }

    public void m(List<Integer> list) {
        this.g = list;
    }

    public void n(boolean z) {
        this.d = z;
    }

    public void o(boolean z) {
        this.h = z;
    }

    public void p(boolean z) {
        this.c = z;
    }

    public void q(float f) {
        this.e = f;
    }

    public void r(float f) {
        this.f = f;
    }
}
