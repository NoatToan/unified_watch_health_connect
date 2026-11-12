package z23;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends g0 implements o33.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f202072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f202073c;

    public v(Type type) {
        x tVar;
        type.getClass();
        this.f202072b = type;
        if (type instanceof Class) {
            tVar = new t((Class) type);
        } else if (type instanceof TypeVariable) {
            tVar = new h0((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                androidx.core.view.j.y("Not a classifier type (", type.getClass(), "): ", type);
                throw null;
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            tVar = new t((Class) rawType);
        }
        this.f202073c = tVar;
    }

    @Override // z23.g0
    public final Type H() {
        return this.f202072b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o33.h, z23.x] */
    @Override // o33.i
    public final o33.h g() {
        return this.f202073c;
    }

    @Override // o33.c
    public final Collection<o33.a> getAnnotations() {
        return p13.j0.f134944a;
    }

    @Override // o33.i
    public final ArrayList r() {
        List<Type> listC = f.c(this.f202072b);
        ArrayList arrayList = new ArrayList(p13.y.r(listC, 10));
        for (Type type : listC) {
            g0.f202047a.getClass();
            arrayList.add(g0.a.a(type));
        }
        return arrayList;
    }

    @Override // o33.i
    public final String t() {
        return this.f202072b.toString();
    }

    @Override // o33.i
    public final String u() {
        throw new UnsupportedOperationException("Type not found: " + this.f202072b);
    }

    @Override // o33.i
    public final boolean y() {
        Type type = this.f202072b;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            typeParameters.getClass();
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // z23.g0, o33.c
    public final o33.a z(x33.c cVar) {
        cVar.getClass();
        return null;
    }
}
