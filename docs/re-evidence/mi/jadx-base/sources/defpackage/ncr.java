package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ncr {
    public int f;
    public int h;
    public float o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27794a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27795b = "";
    public Set<String> c = Collections.emptySet();
    public String d = "";
    public String e = null;
    public boolean g = false;
    public boolean i = false;
    public int j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27796k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int p = -1;
    public boolean q = false;

    public static int z(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    public int a() {
        if (this.i) {
            return this.h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.q;
    }

    public int c() {
        if (this.g) {
            return this.f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.e;
    }

    public float e() {
        return this.o;
    }

    public int f() {
        return this.n;
    }

    public int g() {
        return this.p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f27794a.isEmpty() && this.f27795b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iZ = z(z(z(0, this.f27794a, str, 1073741824), this.f27795b, str2, 2), this.d, str3, 4);
        if (iZ == -1 || !set.containsAll(this.c)) {
            return 0;
        }
        return iZ + (this.c.size() * 4);
    }

    public int i() {
        int i = this.l;
        if (i == -1 && this.m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.i;
    }

    public boolean k() {
        return this.g;
    }

    public boolean l() {
        return this.j == 1;
    }

    public boolean m() {
        return this.f27796k == 1;
    }

    public ncr n(int i) {
        this.h = i;
        this.i = true;
        return this;
    }

    public ncr o(boolean z) {
        this.l = z ? 1 : 0;
        return this;
    }

    public ncr p(boolean z) {
        this.q = z;
        return this;
    }

    public ncr q(int i) {
        this.f = i;
        this.g = true;
        return this;
    }

    public ncr r(String str) {
        this.e = str == null ? null : fk1.e(str);
        return this;
    }

    public ncr s(boolean z) {
        this.m = z ? 1 : 0;
        return this;
    }

    public ncr t(int i) {
        this.p = i;
        return this;
    }

    public void u(String[] strArr) {
        this.c = new HashSet(Arrays.asList(strArr));
    }

    public void v(String str) {
        this.f27794a = str;
    }

    public void w(String str) {
        this.f27795b = str;
    }

    public void x(String str) {
        this.d = str;
    }

    public ncr y(boolean z) {
        this.f27796k = z ? 1 : 0;
        return this;
    }
}
