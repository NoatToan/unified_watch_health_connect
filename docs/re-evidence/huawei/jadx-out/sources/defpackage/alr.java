package defpackage;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.BoundType;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import com.huawei.hms.network.embedded.g4;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class alr<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator<? super T> f515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private final T f516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f517c;
    private final boolean d;
    private final BoundType e;

    @CheckForNull
    private final T f;
    private final BoundType g;

    public static <T> alr<T> d(Comparator<? super T> comparator) {
        return new alr<>(comparator, false, null, BoundType.OPEN, false, null, BoundType.OPEN);
    }

    public static <T> alr<T> d(Comparator<? super T> comparator, @ParametricNullness T t, BoundType boundType) {
        return new alr<>(comparator, true, t, boundType, false, null, BoundType.OPEN);
    }

    public static <T> alr<T> b(Comparator<? super T> comparator, @ParametricNullness T t, BoundType boundType) {
        return new alr<>(comparator, false, null, BoundType.OPEN, true, t, boundType);
    }

    private alr(Comparator<? super T> comparator, boolean z, @CheckForNull T t, BoundType boundType, boolean z2, @CheckForNull T t2, BoundType boundType2) {
        this.f515a = (Comparator) Preconditions.checkNotNull(comparator);
        this.d = z;
        this.f517c = z2;
        this.f516b = t;
        this.e = (BoundType) Preconditions.checkNotNull(boundType);
        this.f = t2;
        this.g = (BoundType) Preconditions.checkNotNull(boundType2);
        if (z) {
            comparator.compare((Object) ams.e(t), (Object) ams.e(t));
        }
        if (z2) {
            comparator.compare((Object) ams.e(t2), (Object) ams.e(t2));
        }
        if (z && z2) {
            int iCompare = comparator.compare((Object) ams.e(t), (Object) ams.e(t2));
            Preconditions.checkArgument(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (iCompare == 0) {
                Preconditions.checkArgument((boundType == BoundType.OPEN && boundType2 == BoundType.OPEN) ? false : true);
            }
        }
    }

    public Comparator<? super T> b() {
        return this.f515a;
    }

    public boolean g() {
        return this.d;
    }

    public boolean i() {
        return this.f517c;
    }

    public boolean b(@ParametricNullness T t) {
        if (!g()) {
            return false;
        }
        int iCompare = this.f515a.compare(t, ams.e(c()));
        return ((iCompare == 0) & (a() == BoundType.OPEN)) | (iCompare < 0);
    }

    public boolean e(@ParametricNullness T t) {
        if (!i()) {
            return false;
        }
        int iCompare = this.f515a.compare(t, ams.e(e()));
        return ((iCompare == 0) & (d() == BoundType.OPEN)) | (iCompare > 0);
    }

    public boolean c(@ParametricNullness T t) {
        return (b(t) || e(t)) ? false : true;
    }

    public alr<T> d(alr<T> alrVar) {
        int iCompare;
        int iCompare2;
        T t;
        BoundType boundType;
        BoundType boundType2;
        int iCompare3;
        Preconditions.checkNotNull(alrVar);
        Preconditions.checkArgument(this.f515a.equals(alrVar.f515a));
        boolean z = this.d;
        T tC = c();
        BoundType boundTypeA = a();
        if (!g()) {
            z = alrVar.d;
            tC = alrVar.c();
            boundTypeA = alrVar.a();
        } else if (alrVar.g() && ((iCompare = this.f515a.compare(c(), alrVar.c())) < 0 || (iCompare == 0 && alrVar.a() == BoundType.OPEN))) {
            tC = alrVar.c();
            boundTypeA = alrVar.a();
        }
        boolean z2 = z;
        boolean z3 = this.f517c;
        T tE = e();
        BoundType boundTypeD = d();
        if (!i()) {
            z3 = alrVar.f517c;
            tE = alrVar.e();
            boundTypeD = alrVar.d();
        } else if (alrVar.i() && ((iCompare2 = this.f515a.compare(e(), alrVar.e())) > 0 || (iCompare2 == 0 && alrVar.d() == BoundType.OPEN))) {
            tE = alrVar.e();
            boundTypeD = alrVar.d();
        }
        boolean z4 = z3;
        T t2 = tE;
        if (z2 && z4 && ((iCompare3 = this.f515a.compare(tC, t2)) > 0 || (iCompare3 == 0 && boundTypeA == BoundType.OPEN && boundTypeD == BoundType.OPEN))) {
            boundType = BoundType.OPEN;
            boundType2 = BoundType.CLOSED;
            t = t2;
        } else {
            t = tC;
            boundType = boundTypeA;
            boundType2 = boundTypeD;
        }
        return new alr<>(this.f515a, z2, t, boundType, z4, t2, boundType2);
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof alr)) {
            return false;
        }
        alr alrVar = (alr) obj;
        return this.f515a.equals(alrVar.f515a) && this.d == alrVar.d && this.f517c == alrVar.f517c && a().equals(alrVar.a()) && d().equals(alrVar.d()) && Objects.equal(c(), alrVar.c()) && Objects.equal(e(), alrVar.e());
    }

    public int hashCode() {
        return Objects.hashCode(this.f515a, c(), a(), e(), d());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f515a);
        sb.append(":");
        sb.append(this.e == BoundType.CLOSED ? '[' : g4.k);
        sb.append(this.d ? this.f516b : "-∞");
        sb.append(',');
        sb.append(this.f517c ? this.f : "∞");
        sb.append(this.g == BoundType.CLOSED ? ']' : g4.l);
        return sb.toString();
    }

    @CheckForNull
    public T c() {
        return this.f516b;
    }

    public BoundType a() {
        return this.e;
    }

    @CheckForNull
    public T e() {
        return this.f;
    }

    public BoundType d() {
        return this.g;
    }
}
