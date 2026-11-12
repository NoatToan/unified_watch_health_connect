package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
class alh<E> extends alj<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private transient int[] f504c;
    private transient int d;

    @CheckForNull
    private transient int[] e;

    public static <E> alh<E> d(int i) {
        return new alh<>(i);
    }

    alh() {
    }

    alh(int i) {
        super(i);
    }

    @Override // defpackage.alj
    void a(int i) {
        super.a(i);
        this.f503b = -2;
        this.d = -2;
    }

    @Override // defpackage.alj
    int b() {
        int iB = super.b();
        this.e = new int[iB];
        this.f504c = new int[iB];
        return iB;
    }

    @Override // defpackage.alj
    Set<E> d() {
        Set<E> setD = super.d();
        this.e = null;
        this.f504c = null;
        return setD;
    }

    private int h(int i) {
        return g()[i] - 1;
    }

    @Override // defpackage.alj
    int e(int i) {
        return i()[i] - 1;
    }

    private void a(int i, int i2) {
        i()[i] = i2 + 1;
    }

    private void e(int i, int i2) {
        g()[i] = i2 + 1;
    }

    private void b(int i, int i2) {
        if (i == -2) {
            this.f503b = i2;
        } else {
            a(i, i2);
        }
        if (i2 == -2) {
            this.d = i;
        } else {
            e(i2, i);
        }
    }

    @Override // defpackage.alj
    void e(int i, @ParametricNullness E e, int i2, int i3) {
        super.e(i, e, i2, i3);
        b(this.d, i);
        b(i, -2);
    }

    @Override // defpackage.alj
    void d(int i, int i2) {
        int size = size() - 1;
        super.d(i, i2);
        b(h(i), e(i));
        if (i < size) {
            b(h(size), i);
            b(i, e(size));
        }
        g()[size] = 0;
        i()[size] = 0;
    }

    @Override // defpackage.alj
    void c(int i) {
        super.c(i);
        this.e = Arrays.copyOf(g(), i);
        this.f504c = Arrays.copyOf(i(), i);
    }

    @Override // defpackage.alj
    int e() {
        return this.f503b;
    }

    @Override // defpackage.alj
    int c(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // defpackage.alj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return amu.a(this);
    }

    @Override // defpackage.alj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) amu.a(this, tArr);
    }

    @Override // defpackage.alj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (h()) {
            return;
        }
        this.f503b = -2;
        this.d = -2;
        int[] iArr = this.e;
        if (iArr != null && this.f504c != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f504c, 0, size(), 0);
        }
        super.clear();
    }

    private int[] g() {
        return (int[]) Objects.requireNonNull(this.e);
    }

    private int[] i() {
        return (int[]) Objects.requireNonNull(this.f504c);
    }
}
