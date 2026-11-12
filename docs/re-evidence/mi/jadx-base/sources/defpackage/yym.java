package defpackage;

import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class yym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f40697b;
    public int c;
    public File d;
    public boolean e;

    public File a() {
        return this.d;
    }

    public int b() {
        return this.f40696a;
    }

    public long c() {
        return this.f40697b;
    }

    public int d() {
        return this.c;
    }

    public void e(File file) {
        this.d = file;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        yym yymVar = (yym) obj;
        return this.f40696a == yymVar.f40696a && this.f40697b == yymVar.f40697b && this.c == yymVar.c;
    }

    public void f(int i) {
        this.f40696a = i;
    }

    public void g(long j) {
        this.f40697b = j;
    }

    public void h(int i) {
        this.c = i;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f40696a), Long.valueOf(this.f40697b), Integer.valueOf(this.c));
    }

    public void i(boolean z) {
        this.e = z;
    }
}
