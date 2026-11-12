package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
final class y0<T> implements Serializable {
    private final Comparator<? super T> a;
    private final boolean b;

    @NullableDecl
    private final T c;
    private final BoundType d;
    private final boolean e;

    @NullableDecl
    private final T f;
    private final BoundType g;

    @MonotonicNonNullDecl
    private transient y0<T> h;

    /* JADX WARN: Multi-variable type inference failed */
    private y0(Comparator<? super T> comparator, boolean z, @NullableDecl T t, BoundType boundType, boolean z2, @NullableDecl T t2, BoundType boundType2) {
        this.a = (Comparator) Preconditions.checkNotNull(comparator);
        this.b = z;
        this.e = z2;
        this.c = t;
        this.d = (BoundType) Preconditions.checkNotNull(boundType);
        this.f = t2;
        this.g = (BoundType) Preconditions.checkNotNull(boundType2);
        if (z) {
            comparator.compare(t, t);
        }
        if (z2) {
            comparator.compare(t2, t2);
        }
        if (z && z2) {
            int iCompare = comparator.compare(t, t2);
            Preconditions.checkArgument(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                Preconditions.checkArgument((boundType != boundType3) | (boundType2 != boundType3));
            }
        }
    }

    public static <T> y0<T> a(Comparator<? super T> comparator) {
        BoundType boundType = BoundType.OPEN;
        return new y0<>(comparator, false, null, boundType, false, null, boundType);
    }

    public static <T> y0<T> e(Comparator<? super T> comparator, @NullableDecl T t, BoundType boundType) {
        return new y0<>(comparator, true, t, boundType, false, null, BoundType.OPEN);
    }

    public static <T extends Comparable> y0<T> f(Range<T> range) {
        return new y0<>(Ordering.natural(), range.hasLowerBound(), range.hasLowerBound() ? range.lowerEndpoint() : null, range.hasLowerBound() ? range.lowerBoundType() : BoundType.OPEN, range.hasUpperBound(), range.hasUpperBound() ? range.upperEndpoint() : null, range.hasUpperBound() ? range.upperBoundType() : BoundType.OPEN);
    }

    public static <T> y0<T> p(Comparator<? super T> comparator, @NullableDecl T t, BoundType boundType, @NullableDecl T t2, BoundType boundType2) {
        return new y0<>(comparator, true, t, boundType, true, t2, boundType2);
    }

    public static <T> y0<T> t(Comparator<? super T> comparator, @NullableDecl T t, BoundType boundType) {
        return new y0<>(comparator, false, null, BoundType.OPEN, true, t, boundType);
    }

    public Comparator<? super T> b() {
        return this.a;
    }

    public boolean c(@NullableDecl T t) {
        return (s(t) || r(t)) ? false : true;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.a.equals(y0Var.a) && this.b == y0Var.b && this.e == y0Var.e && g().equals(y0Var.g()) && i().equals(y0Var.i()) && Objects.equal(h(), y0Var.h()) && Objects.equal(j(), y0Var.j());
    }

    public BoundType g() {
        return this.d;
    }

    public T h() {
        return this.c;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, h(), g(), j(), i());
    }

    public BoundType i() {
        return this.g;
    }

    public T j() {
        return this.f;
    }

    public boolean k() {
        return this.b;
    }

    public boolean m() {
        return this.e;
    }

    public y0<T> n(y0<T> y0Var) {
        int iCompare;
        int iCompare2;
        T t;
        BoundType boundType;
        BoundType boundType2;
        int iCompare3;
        BoundType boundType3;
        Preconditions.checkNotNull(y0Var);
        Preconditions.checkArgument(this.a.equals(y0Var.a));
        boolean z = this.b;
        T tH = h();
        BoundType boundTypeG = g();
        if (!k()) {
            z = y0Var.b;
            tH = y0Var.h();
            boundTypeG = y0Var.g();
        } else if (y0Var.k() && ((iCompare = this.a.compare(h(), y0Var.h())) < 0 || (iCompare == 0 && y0Var.g() == BoundType.OPEN))) {
            tH = y0Var.h();
            boundTypeG = y0Var.g();
        }
        boolean z2 = z;
        boolean z3 = this.e;
        T tJ = j();
        BoundType boundTypeI = i();
        if (!m()) {
            z3 = y0Var.e;
            tJ = y0Var.j();
            boundTypeI = y0Var.i();
        } else if (y0Var.m() && ((iCompare2 = this.a.compare(j(), y0Var.j())) > 0 || (iCompare2 == 0 && y0Var.i() == BoundType.OPEN))) {
            tJ = y0Var.j();
            boundTypeI = y0Var.i();
        }
        boolean z4 = z3;
        T t2 = tJ;
        if (z2 && z4 && ((iCompare3 = this.a.compare(tH, t2)) > 0 || (iCompare3 == 0 && boundTypeG == (boundType3 = BoundType.OPEN) && boundTypeI == boundType3))) {
            boundType = BoundType.OPEN;
            boundType2 = BoundType.CLOSED;
            t = t2;
        } else {
            t = tH;
            boundType = boundTypeG;
            boundType2 = boundTypeI;
        }
        return new y0<>(this.a, z2, t, boundType, z4, t2, boundType2);
    }

    public boolean o() {
        return (m() && s(j())) || (k() && r(h()));
    }

    public y0<T> q() {
        y0<T> y0Var = this.h;
        if (y0Var != null) {
            return y0Var;
        }
        y0<T> y0Var2 = new y0<>(Ordering.from(this.a).reverse(), this.e, j(), i(), this.b, h(), g());
        y0Var2.h = this;
        this.h = y0Var2;
        return y0Var2;
    }

    public boolean r(@NullableDecl T t) {
        if (!m()) {
            return false;
        }
        int iCompare = this.a.compare(t, j());
        return ((iCompare == 0) & (i() == BoundType.OPEN)) | (iCompare > 0);
    }

    public boolean s(@NullableDecl T t) {
        if (!k()) {
            return false;
        }
        int iCompare = this.a.compare(t, h());
        return ((iCompare == 0) & (g() == BoundType.OPEN)) | (iCompare < 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(":");
        BoundType boundType = this.d;
        BoundType boundType2 = BoundType.CLOSED;
        sb.append(boundType == boundType2 ? JsonLexerKt.BEGIN_LIST : '(');
        sb.append(this.b ? this.c : "-∞");
        sb.append(',');
        sb.append(this.e ? this.f : "∞");
        sb.append(this.g == boundType2 ? JsonLexerKt.END_LIST : ')');
        return sb.toString();
    }
}
