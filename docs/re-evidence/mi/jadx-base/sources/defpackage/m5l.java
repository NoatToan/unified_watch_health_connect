package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class m5l extends la3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hfl f25778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25779b;

    public m5l(hfl hflVar, boolean z) {
        this.f25778a = hflVar;
        this.f25779b = z;
    }

    public static m5l d() {
        return new m5l(null, false);
    }

    @Override // la3.a
    public la3<?, ?> a(Type type, Annotation[] annotationArr, etk etkVar) {
        Type typeB;
        boolean z;
        boolean z2;
        String str;
        Class<?> clsC = la3.a.c(type);
        if (clsC == ba4.class) {
            return new l5l(Void.class, this.f25778a, this.f25779b, false, true, false, false, false, true);
        }
        boolean z3 = clsC == zy9.class;
        boolean z4 = clsC == ydm.class;
        boolean z5 = clsC == r9f.class;
        if (clsC != o4h.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z3) {
                str = "Flowable";
            } else if (z4) {
                str = "Single";
            } else {
                str = z5 ? "Maybe" : "Observable";
            }
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type typeB2 = la3.a.b(0, (ParameterizedType) type);
        Class<?> clsC2 = la3.a.c(typeB2);
        if (clsC2 == prk.class) {
            if (!(typeB2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            typeB = la3.a.b(0, (ParameterizedType) typeB2);
            z2 = false;
            z = false;
        } else if (clsC2 != vsk.class) {
            typeB = typeB2;
            z = true;
            z2 = false;
        } else {
            if (!(typeB2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            typeB = la3.a.b(0, (ParameterizedType) typeB2);
            z2 = true;
            z = false;
        }
        return new l5l(typeB, this.f25778a, this.f25779b, z2, z, z3, z4, z5, false);
    }
}
