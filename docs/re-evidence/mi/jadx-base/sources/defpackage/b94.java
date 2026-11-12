package defpackage;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class b94<E> extends y84<E> {
    public transient int[] f;
    public transient int[] g;
    public transient int h;
    public transient int i;

    public b94(int i) {
        super(i);
    }

    public static <E> b94<E> U(int i) {
        return new b94<>(i);
    }

    @Override // defpackage.y84
    public void A(int i, int i2) {
        int size = size() - 1;
        super.A(i, i2);
        Z(V(i), u(i));
        if (i < size) {
            Z(V(size), i);
            Z(i, u(size));
        }
        W()[size] = 0;
        X()[size] = 0;
    }

    @Override // defpackage.y84
    public void G(int i) {
        super.G(i);
        this.f = Arrays.copyOf(W(), i);
        this.g = Arrays.copyOf(X(), i);
    }

    public final int V(int i) {
        return W()[i] - 1;
    }

    public final int[] W() {
        int[] iArr = this.f;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final int[] X() {
        int[] iArr = this.g;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final void Y(int i, int i2) {
        W()[i] = i2 + 1;
    }

    public final void Z(int i, int i2) {
        if (i == -2) {
            this.h = i2;
        } else {
            a0(i, i2);
        }
        if (i2 == -2) {
            this.i = i;
        } else {
            Y(i2, i);
        }
    }

    public final void a0(int i, int i2) {
        X()[i] = i2 + 1;
    }

    @Override // defpackage.y84, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (B()) {
            return;
        }
        this.h = -2;
        this.i = -2;
        int[] iArr = this.f;
        if (iArr != null && this.g != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.g, 0, size(), 0);
        }
        super.clear();
    }

    @Override // defpackage.y84
    public int g(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // defpackage.y84
    public int h() {
        int iH = super.h();
        this.f = new int[iH];
        this.g = new int[iH];
        return iH;
    }

    @Override // defpackage.y84
    public Set<E> i() {
        Set<E> setI = super.i();
        this.f = null;
        this.g = null;
        return setI;
    }

    @Override // defpackage.y84
    public int t() {
        return this.h;
    }

    @Override // defpackage.y84, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return t3h.f(this);
    }

    @Override // defpackage.y84
    public int u(int i) {
        return X()[i] - 1;
    }

    @Override // defpackage.y84
    public void x(int i) {
        super.x(i);
        this.h = -2;
        this.i = -2;
    }

    @Override // defpackage.y84
    public void z(int i, E e, int i2, int i3) {
        super.z(i, e, i2, i3);
        Z(this.i, i);
        Z(i, -2);
    }

    @Override // defpackage.y84, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) t3h.g(this, tArr);
    }
}
