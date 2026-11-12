package c33;

import r1.q2;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24168c;

    public c0(int i14, int i15, int i16) {
        this.f24166a = i14;
        this.f24167b = i15;
        this.f24168c = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f24166a == c0Var.f24166a && this.f24167b == c0Var.f24167b && this.f24168c == c0Var.f24168c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24168c) + q2.d(this.f24167b, Integer.hashCode(this.f24166a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f24166a);
        sb3.append('.');
        sb3.append(this.f24167b);
        sb3.append('.');
        sb3.append(this.f24168c);
        return sb3.toString();
    }
}
