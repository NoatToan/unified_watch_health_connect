package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class has {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36326b;
    private int e;

    public has(int i, int i2, int i3) {
        e(i);
        d(i2);
        a(i3);
    }

    public int b() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public int c() {
        return this.f36325a;
    }

    public void d(int i) {
        this.f36325a = i;
    }

    public int a() {
        return this.f36326b;
    }

    public void a(int i) {
        this.f36326b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        has hasVar = (has) obj;
        return this.e == hasVar.e && this.f36325a == hasVar.f36325a && this.f36326b == hasVar.f36326b;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.e), Integer.valueOf(this.f36325a), Integer.valueOf(this.f36326b));
    }
}
