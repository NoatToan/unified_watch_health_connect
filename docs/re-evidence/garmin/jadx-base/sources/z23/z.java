package z23;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends b0 implements o33.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f202076a;

    public z(Field field) {
        field.getClass();
        this.f202076a = field;
    }

    @Override // o33.m
    public final boolean F() {
        return this.f202076a.isEnumConstant();
    }

    @Override // z23.b0
    public final Member H() {
        return this.f202076a;
    }

    @Override // o33.m
    public final o33.t getType() {
        g0.a aVar = g0.f202047a;
        Type genericType = this.f202076a.getGenericType();
        genericType.getClass();
        aVar.getClass();
        return g0.a.a(genericType);
    }
}
