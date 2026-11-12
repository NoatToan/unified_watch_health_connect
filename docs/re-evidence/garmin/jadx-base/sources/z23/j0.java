package z23;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends g0 implements o33.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WildcardType f202057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p13.j0 f202058c;

    public j0(WildcardType wildcardType) {
        wildcardType.getClass();
        this.f202057b = wildcardType;
        this.f202058c = p13.j0.f134944a;
    }

    @Override // z23.g0
    public final Type H() {
        return this.f202057b;
    }

    @Override // o33.c
    public final Collection<o33.a> getAnnotations() {
        return this.f202058c;
    }

    @Override // o33.x
    public final g0 l() {
        WildcardType wildcardType = this.f202057b;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            j20.x.k(wildcardType, "Wildcard types with many bounds are not yet supported: ");
            return null;
        }
        int length = lowerBounds.length;
        g0.a aVar = g0.f202047a;
        if (length == 1) {
            Object objV = p13.u.V(lowerBounds);
            objV.getClass();
            aVar.getClass();
            return g0.a.a((Type) objV);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type type = (Type) p13.u.V(upperBounds);
        if (p005kotlin.jvm.internal.s.g(type, Object.class)) {
            return null;
        }
        type.getClass();
        aVar.getClass();
        return g0.a.a(type);
    }

    @Override // o33.x
    public final boolean o() {
        Type[] upperBounds = this.f202057b.getUpperBounds();
        upperBounds.getClass();
        return !p005kotlin.jvm.internal.s.g(p13.u.H(upperBounds), Object.class);
    }
}
