package defpackage;

import com.google.common.collect.BoundType;
import java.io.Serializable;
import java.util.Comparator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class qxa<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator<? super T> f31934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31935b;
    public final T c;
    public final BoundType d;
    public final boolean e;
    public final T f;
    public final BoundType g;

    public qxa(Comparator<? super T> comparator, boolean z, T t, BoundType boundType, boolean z2, T t2, BoundType boundType2) {
        this.f31934a = (Comparator) c6i.o(comparator);
        this.f31935b = z;
        this.e = z2;
        this.c = t;
        this.d = (BoundType) c6i.o(boundType);
        this.f = t2;
        this.g = (BoundType) c6i.o(boundType2);
        if (z) {
            comparator.compare((Object) d2h.a(t), (Object) d2h.a(t));
        }
        if (z2) {
            comparator.compare((Object) d2h.a(t2), (Object) d2h.a(t2));
        }
        if (z && z2) {
            int iCompare = comparator.compare((Object) d2h.a(t), (Object) d2h.a(t2));
            boolean z3 = true;
            c6i.k(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                if (boundType == boundType3 && boundType2 == boundType3) {
                    z3 = false;
                }
                c6i.d(z3);
            }
        }
    }

    public static <T> qxa<T> a(Comparator<? super T> comparator) {
        BoundType boundType = BoundType.OPEN;
        return new qxa<>(comparator, false, null, boundType, false, null, boundType);
    }

    public static <T> qxa<T> d(Comparator<? super T> comparator, T t, BoundType boundType) {
        return new qxa<>(comparator, true, t, boundType, false, null, BoundType.OPEN);
    }

    public static <T> qxa<T> o(Comparator<? super T> comparator, T t, BoundType boundType) {
        return new qxa<>(comparator, false, null, BoundType.OPEN, true, t, boundType);
    }

    public Comparator<? super T> b() {
        return this.f31934a;
    }

    public boolean c(T t) {
        return (n(t) || m(t)) ? false : true;
    }

    public BoundType e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof qxa)) {
            return false;
        }
        qxa qxaVar = (qxa) obj;
        return this.f31934a.equals(qxaVar.f31934a) && this.f31935b == qxaVar.f31935b && this.e == qxaVar.e && e().equals(qxaVar.e()) && g().equals(qxaVar.g()) && j4h.a(f(), qxaVar.f()) && j4h.a(h(), qxaVar.h());
    }

    public T f() {
        return this.c;
    }

    public BoundType g() {
        return this.g;
    }

    public T h() {
        return this.f;
    }

    public int hashCode() {
        return j4h.b(this.f31934a, f(), e(), h(), g());
    }

    public boolean i() {
        return this.f31935b;
    }

    public boolean j() {
        return this.e;
    }

    public qxa<T> k(qxa<T> qxaVar) {
        int iCompare;
        int iCompare2;
        T t;
        BoundType boundType;
        BoundType boundType2;
        int iCompare3;
        BoundType boundType3;
        c6i.o(qxaVar);
        c6i.d(this.f31934a.equals(qxaVar.f31934a));
        boolean z = this.f31935b;
        T tF = f();
        BoundType boundTypeE = e();
        if (!i()) {
            z = qxaVar.f31935b;
            tF = qxaVar.f();
            boundTypeE = qxaVar.e();
        } else if (qxaVar.i() && ((iCompare = this.f31934a.compare(f(), qxaVar.f())) < 0 || (iCompare == 0 && qxaVar.e() == BoundType.OPEN))) {
            tF = qxaVar.f();
            boundTypeE = qxaVar.e();
        }
        boolean z2 = z;
        boolean z3 = this.e;
        T tH = h();
        BoundType boundTypeG = g();
        if (!j()) {
            z3 = qxaVar.e;
            tH = qxaVar.h();
            boundTypeG = qxaVar.g();
        } else if (qxaVar.j() && ((iCompare2 = this.f31934a.compare(h(), qxaVar.h())) > 0 || (iCompare2 == 0 && qxaVar.g() == BoundType.OPEN))) {
            tH = qxaVar.h();
            boundTypeG = qxaVar.g();
        }
        boolean z4 = z3;
        T t2 = tH;
        if (z2 && z4 && ((iCompare3 = this.f31934a.compare(tF, t2)) > 0 || (iCompare3 == 0 && boundTypeE == (boundType3 = BoundType.OPEN) && boundTypeG == boundType3))) {
            boundType = BoundType.OPEN;
            boundType2 = BoundType.CLOSED;
            t = t2;
        } else {
            t = tF;
            boundType = boundTypeE;
            boundType2 = boundTypeG;
        }
        return new qxa<>(this.f31934a, z2, t, boundType, z4, t2, boundType2);
    }

    public boolean m(T t) {
        if (!j()) {
            return false;
        }
        int iCompare = this.f31934a.compare(t, d2h.a(h()));
        return ((iCompare == 0) & (g() == BoundType.OPEN)) | (iCompare > 0);
    }

    public boolean n(T t) {
        if (!i()) {
            return false;
        }
        int iCompare = this.f31934a.compare(t, d2h.a(f()));
        return ((iCompare == 0) & (e() == BoundType.OPEN)) | (iCompare < 0);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f31934a);
        BoundType boundType = this.d;
        BoundType boundType2 = BoundType.CLOSED;
        char c = boundType == boundType2 ? AbstractJsonLexerKt.BEGIN_LIST : '(';
        String strValueOf2 = String.valueOf(this.f31935b ? this.c : "-∞");
        String strValueOf3 = String.valueOf(this.e ? this.f : "∞");
        char c2 = this.g == boundType2 ? AbstractJsonLexerKt.END_LIST : ')';
        StringBuilder sb = new StringBuilder(strValueOf.length() + 4 + strValueOf2.length() + strValueOf3.length());
        sb.append(strValueOf);
        sb.append(":");
        sb.append(c);
        sb.append(strValueOf2);
        sb.append(',');
        sb.append(strValueOf3);
        sb.append(c2);
        return sb.toString();
    }
}
