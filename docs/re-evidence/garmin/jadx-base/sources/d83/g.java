package d83;

import c83.a0;
import c83.b0;
import c83.f0;
import i3.e5;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import q03.i;
import q03.l;
import q03.q;
import q03.r;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends c83.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f58409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f58410b;

    private g(q qVar, boolean z14) {
        this.f58409a = qVar;
        this.f58410b = z14;
    }

    public static g b() {
        return new g(null, false);
    }

    @Override // c83.e.a
    public final c83.e<?, ?> a(Type type, Annotation[] annotationArr, b0 b0Var) {
        Type typeD;
        boolean z14;
        boolean z15;
        String str;
        Class<?> clsE = f0.e(type);
        if (clsE == q03.b.class) {
            return new f(Void.class, this.f58409a, this.f58410b, false, true, false, false, false, true);
        }
        boolean z16 = clsE == q03.g.class;
        boolean z17 = clsE == r.class;
        boolean z18 = clsE == i.class;
        if (clsE != l.class && !z16 && !z17 && !z18) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z16) {
                str = "Flowable";
            } else if (z17) {
                str = "Single";
            } else {
                str = z18 ? "Maybe" : "Observable";
            }
            fb1.c.y(e5.l(str, " return type must be parameterized as ", str, "<Foo> or ", str), "<? extends Foo>");
            return null;
        }
        Type typeD2 = f0.d(0, (ParameterizedType) type);
        Class<?> clsE2 = f0.e(typeD2);
        if (clsE2 == a0.class) {
            if (!(typeD2 instanceof ParameterizedType)) {
                h.z("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                return null;
            }
            typeD = f0.d(0, (ParameterizedType) typeD2);
            z15 = false;
            z14 = false;
        } else if (clsE2 != d.class) {
            typeD = typeD2;
            z14 = true;
            z15 = false;
        } else {
            if (!(typeD2 instanceof ParameterizedType)) {
                h.z("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
                return null;
            }
            typeD = f0.d(0, (ParameterizedType) typeD2);
            z15 = true;
            z14 = false;
        }
        return new f(typeD, this.f58409a, this.f58410b, z15, z14, z16, z17, z18, false);
    }
}
