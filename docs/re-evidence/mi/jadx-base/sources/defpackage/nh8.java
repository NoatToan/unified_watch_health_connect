package defpackage;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes4.dex */
public final class nh8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f27926a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f27927a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f27928b;

        public b a(int i) {
            rk1.g(!this.f27928b);
            this.f27927a.append(i, true);
            return this;
        }

        public b b(nh8 nh8Var) {
            for (int i = 0; i < nh8Var.d(); i++) {
                a(nh8Var.c(i));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i : iArr) {
                a(i);
            }
            return this;
        }

        public b d(int i, boolean z) {
            return z ? a(i) : this;
        }

        public nh8 e() {
            rk1.g(!this.f27928b);
            this.f27928b = true;
            return new nh8(this.f27927a);
        }
    }

    public boolean a(int i) {
        return this.f27926a.get(i);
    }

    public boolean b(int... iArr) {
        for (int i : iArr) {
            if (a(i)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i) {
        rk1.c(i, 0, d());
        return this.f27926a.keyAt(i);
    }

    public int d() {
        return this.f27926a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nh8) {
            return this.f27926a.equals(((nh8) obj).f27926a);
        }
        return false;
    }

    public int hashCode() {
        return this.f27926a.hashCode();
    }

    public nh8(SparseBooleanArray sparseBooleanArray) {
        this.f27926a = sparseBooleanArray;
    }
}
