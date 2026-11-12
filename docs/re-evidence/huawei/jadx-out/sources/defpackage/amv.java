package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.BoundType;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Cut;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.Ordering;
import com.google.common.collect.RangeGwtSerializationDependencies;
import com.google.errorprone.annotations.Immutable;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import java.io.Serializable;
import java.lang.Comparable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@Immutable(containerOf = {TypeParams.SEARCH_CODE})
@ElementTypesAreNonnullByDefault
public final class amv<C extends Comparable> extends RangeGwtSerializationDependencies implements Predicate<C>, Serializable {
    private static final amv<Comparable> d = new amv<>(Cut.belowAll(), Cut.aboveAll());
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cut<C> f567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cut<C> f568c;

    static class d implements Function<amv, Cut> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final d f571c = new d();

        d() {
        }

        @Override // com.google.common.base.Function
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Cut apply(amv amvVar) {
            return amvVar.f568c;
        }
    }

    static class c implements Function<amv, Cut> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f570c = new c();

        c() {
        }

        @Override // com.google.common.base.Function
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Cut apply(amv amvVar) {
            return amvVar.f567b;
        }
    }

    static <C extends Comparable<?>> Function<amv<C>, Cut<C>> e() {
        return d.f571c;
    }

    static <C extends Comparable<?>> Function<amv<C>, Cut<C>> b() {
        return c.f570c;
    }

    static <C extends Comparable<?>> Ordering<amv<C>> c() {
        return (Ordering<amv<C>>) a.f569c;
    }

    static <C extends Comparable<?>> amv<C> c(Cut<C> cut, Cut<C> cut2) {
        return new amv<>(cut, cut2);
    }

    public static <C extends Comparable<?>> amv<C> d(C c2, C c3) {
        return c(Cut.belowValue(c2), Cut.aboveValue(c3));
    }

    public static <C extends Comparable<?>> amv<C> e(C c2, C c3) {
        return c(Cut.belowValue(c2), Cut.belowValue(c3));
    }

    public static <C extends Comparable<?>> amv<C> b(C c2, BoundType boundType, C c3, BoundType boundType2) {
        Preconditions.checkNotNull(boundType);
        Preconditions.checkNotNull(boundType2);
        return c(boundType == BoundType.OPEN ? Cut.aboveValue(c2) : Cut.belowValue(c2), boundType2 == BoundType.OPEN ? Cut.belowValue(c3) : Cut.aboveValue(c3));
    }

    public static <C extends Comparable<?>> amv<C> a(C c2) {
        return c(Cut.belowAll(), Cut.belowValue(c2));
    }

    public static <C extends Comparable<?>> amv<C> b(C c2) {
        return c(Cut.belowAll(), Cut.aboveValue(c2));
    }

    /* JADX INFO: renamed from: amv$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[BoundType.values().length];
            d = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static <C extends Comparable<?>> amv<C> d(C c2, BoundType boundType) {
        int i = AnonymousClass4.d[boundType.ordinal()];
        if (i == 1) {
            return a(c2);
        }
        if (i == 2) {
            return b(c2);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> amv<C> d(C c2) {
        return c(Cut.aboveValue(c2), Cut.aboveAll());
    }

    public static <C extends Comparable<?>> amv<C> c(C c2) {
        return c(Cut.belowValue(c2), Cut.aboveAll());
    }

    public static <C extends Comparable<?>> amv<C> a(C c2, BoundType boundType) {
        int i = AnonymousClass4.d[boundType.ordinal()];
        if (i == 1) {
            return d(c2);
        }
        if (i == 2) {
            return c(c2);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> amv<C> d() {
        return (amv<C>) d;
    }

    private amv(Cut<C> cut, Cut<C> cut2) {
        this.f568c = (Cut) Preconditions.checkNotNull(cut);
        this.f567b = (Cut) Preconditions.checkNotNull(cut2);
        if (cut.compareTo((Cut) cut2) > 0 || cut == Cut.aboveAll() || cut2 == Cut.belowAll()) {
            throw new IllegalArgumentException("Invalid range: " + e((Cut<?>) cut, (Cut<?>) cut2));
        }
    }

    public boolean a() {
        return this.f568c != Cut.belowAll();
    }

    public boolean j() {
        return this.f567b != Cut.aboveAll();
    }

    public C h() {
        return (C) this.f567b.endpoint();
    }

    public boolean f() {
        return this.f568c.equals(this.f567b);
    }

    public boolean i(C c2) {
        Preconditions.checkNotNull(c2);
        return this.f568c.isLessThan(c2) && !this.f567b.isLessThan(c2);
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean apply(C c2) {
        return i(c2);
    }

    public boolean b(amv<C> amvVar) {
        return this.f568c.compareTo((Cut) amvVar.f568c) <= 0 && this.f567b.compareTo((Cut) amvVar.f567b) >= 0;
    }

    public boolean e(amv<C> amvVar) {
        return this.f568c.compareTo((Cut) amvVar.f567b) <= 0 && amvVar.f568c.compareTo((Cut) this.f567b) <= 0;
    }

    public amv<C> c(amv<C> amvVar) {
        int iCompareTo = this.f568c.compareTo((Cut) amvVar.f568c);
        int iCompareTo2 = this.f567b.compareTo((Cut) amvVar.f567b);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return amvVar;
        }
        Cut<C> cut = iCompareTo >= 0 ? this.f568c : amvVar.f568c;
        Cut<C> cut2 = iCompareTo2 <= 0 ? this.f567b : amvVar.f567b;
        Preconditions.checkArgument(cut.compareTo((Cut) cut2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, amvVar);
        return c(cut, cut2);
    }

    public amv<C> a(amv<C> amvVar) {
        int iCompareTo = this.f568c.compareTo((Cut) amvVar.f568c);
        int iCompareTo2 = this.f567b.compareTo((Cut) amvVar.f567b);
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return this;
        }
        if (iCompareTo < 0 || iCompareTo2 > 0) {
            return c(iCompareTo <= 0 ? this.f568c : amvVar.f568c, iCompareTo2 >= 0 ? this.f567b : amvVar.f567b);
        }
        return amvVar;
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof amv)) {
            return false;
        }
        amv amvVar = (amv) obj;
        return this.f568c.equals(amvVar.f568c) && this.f567b.equals(amvVar.f567b);
    }

    public int hashCode() {
        return (this.f568c.hashCode() * 31) + this.f567b.hashCode();
    }

    public String toString() {
        return e((Cut<?>) this.f568c, (Cut<?>) this.f567b);
    }

    private static String e(Cut<?> cut, Cut<?> cut2) {
        StringBuilder sb = new StringBuilder(16);
        cut.describeAsLowerBound(sb);
        sb.append("..");
        cut2.describeAsUpperBound(sb);
        return sb.toString();
    }

    Object readResolve() {
        return equals(d) ? d() : this;
    }

    public static int b(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    static class a extends Ordering<amv<?>> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final Ordering<amv<?>> f569c = new a();
        private static final long serialVersionUID = 0;

        private a() {
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(amv<?> amvVar, amv<?> amvVar2) {
            return ComparisonChain.start().compare(amvVar.f568c, amvVar2.f568c).compare(amvVar.f567b, amvVar2.f567b).result();
        }
    }
}
