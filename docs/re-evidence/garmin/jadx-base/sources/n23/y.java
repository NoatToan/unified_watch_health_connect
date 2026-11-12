package n23;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class y implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a f122661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f122662b;

    public y(e23.a aVar, int i14) {
        this.f122661a = aVar;
        this.f122662b = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        b53.a aVar = (b53.a) this.f122661a.invoke();
        o13.l lVarA = o13.m.a(o13.n.PUBLICATION, new a0(aVar));
        Type typeU = aVar.u();
        if (typeU instanceof Class) {
            Class cls = (Class) typeU;
            Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            componentType.getClass();
            return componentType;
        }
        boolean z14 = typeU instanceof GenericArrayType;
        int i14 = this.f122662b;
        if (z14) {
            if (i14 != 0) {
                lc.u0.t(aVar, "Array type has been queried for a non-0th argument: ");
                return null;
            }
            Type genericComponentType = ((GenericArrayType) typeU).getGenericComponentType();
            genericComponentType.getClass();
            return genericComponentType;
        }
        if (!(typeU instanceof ParameterizedType)) {
            lc.u0.t(aVar, "Non-generic type has been queried for arguments: ");
            return null;
        }
        Type type = (Type) ((List) lVarA.getValue()).get(i14);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        lowerBounds.getClass();
        Type type2 = (Type) p13.u.H(lowerBounds);
        if (type2 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            upperBounds.getClass();
            type2 = (Type) p13.u.E(upperBounds);
        }
        type2.getClass();
        return type2;
    }
}
