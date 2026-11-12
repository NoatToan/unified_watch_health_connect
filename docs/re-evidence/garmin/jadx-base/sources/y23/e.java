package y23;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.commons.io.IOUtils;
import p005kotlin.jvm.internal.s;
import q33.a0;
import q33.x;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f194347c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f194348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r33.a f194349b;

    private e(Class<?> cls, r33.a aVar) {
        this.f194348a = cls;
        this.f194349b = aVar;
    }

    @Override // q33.x
    public final r33.a a() {
        return this.f194349b;
    }

    @Override // q33.x
    public final void b(q33.d dVar) throws InvocationTargetException {
        c.f194345a.getClass();
        Class<?> cls = this.f194348a;
        cls.getClass();
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            x33.f fVarE = x33.f.e(method.getName());
            k.f194359a.getClass();
            StringBuilder sb3 = new StringBuilder("(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            for (Class<?> cls2 : parameterTypes) {
                cls2.getClass();
                sb3.append(z23.f.b(cls2));
            }
            sb3.append(")");
            Class<?> returnType = method.getReturnType();
            returnType.getClass();
            sb3.append(z23.f.b(returnType));
            q33.d.a aVarA = dVar.a(fVarE, sb3.toString());
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            declaredAnnotations.getClass();
            for (Annotation annotation : declaredAnnotations) {
                annotation.getClass();
                c.c(aVarA, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            parameterAnnotations.getClass();
            Annotation[][] annotationArr = parameterAnnotations;
            int length = annotationArr.length;
            for (int i14 = 0; i14 < length; i14++) {
                Annotation[] annotationArr2 = annotationArr[i14];
                annotationArr2.getClass();
                for (Annotation annotation2 : annotationArr2) {
                    Class clsU = dh.b.u(dh.b.s(annotation2));
                    x.a aVarC = aVarA.c(i14, z23.f.a(clsU), new b(annotation2));
                    if (aVarC != null) {
                        c.d(aVarC, annotation2, clsU);
                    }
                }
            }
            aVarA.a();
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        declaredConstructors.getClass();
        int length2 = declaredConstructors.length;
        int i15 = 0;
        while (i15 < length2) {
            Constructor<?> constructor = declaredConstructors[i15];
            x33.f fVar = x33.h.f188614f;
            k kVar = k.f194359a;
            constructor.getClass();
            kVar.getClass();
            StringBuilder sb4 = new StringBuilder("(");
            Class<?>[] parameterTypes2 = constructor.getParameterTypes();
            parameterTypes2.getClass();
            for (Class<?> cls3 : parameterTypes2) {
                cls3.getClass();
                sb4.append(z23.f.b(cls3));
            }
            sb4.append(")V");
            q33.d.a aVarA2 = dVar.a(fVar, sb4.toString());
            Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
            declaredAnnotations2.getClass();
            for (Annotation annotation3 : declaredAnnotations2) {
                annotation3.getClass();
                c.c(aVarA2, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            parameterAnnotations2.getClass();
            if (parameterAnnotations2.length != 0) {
                int length3 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length4 = parameterAnnotations2.length;
                for (int i16 = 0; i16 < length4; i16++) {
                    Annotation[] annotationArr3 = parameterAnnotations2[i16];
                    annotationArr3.getClass();
                    int length5 = annotationArr3.length;
                    int i17 = 0;
                    while (i17 < length5) {
                        Annotation annotation4 = annotationArr3[i17];
                        Class clsU2 = dh.b.u(dh.b.s(annotation4));
                        Constructor<?>[] constructorArr = declaredConstructors;
                        Class<?> cls4 = cls;
                        int i18 = length2;
                        x.a aVarC2 = aVarA2.c(i16 + length3, z23.f.a(clsU2), new b(annotation4));
                        if (aVarC2 != null) {
                            c.d(aVarC2, annotation4, clsU2);
                        }
                        i17++;
                        declaredConstructors = constructorArr;
                        cls = cls4;
                        length2 = i18;
                    }
                }
            }
            Constructor<?>[] constructorArr2 = declaredConstructors;
            Class<?> cls5 = cls;
            int i19 = length2;
            aVarA2.a();
            i15++;
            declaredConstructors = constructorArr2;
            cls = cls5;
            length2 = i19;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        for (Field field : declaredFields) {
            x33.f fVarE2 = x33.f.e(field.getName());
            k.f194359a.getClass();
            Class<?> type = field.getType();
            type.getClass();
            String strB = z23.f.b(type);
            a0.a aVar = a0.f142442b;
            String strB2 = fVarE2.b();
            strB2.getClass();
            aVar.getClass();
            q33.d.b bVar = new q33.d.b(dVar, a0.a.a(strB2, strB));
            Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
            declaredAnnotations3.getClass();
            for (Annotation annotation5 : declaredAnnotations3) {
                annotation5.getClass();
                c.c(bVar, annotation5);
            }
            bVar.a();
        }
    }

    @Override // q33.x
    public final void c(x.c cVar) throws InvocationTargetException {
        c.f194345a.getClass();
        c.b(this.f194348a, cVar);
    }

    @Override // q33.x
    public final x33.b d() {
        return z23.f.a(this.f194348a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return s.g(this.f194348a, ((e) obj).f194348a);
        }
        return false;
    }

    @Override // q33.x
    public final String getLocation() {
        String strReplace = this.f194348a.getName().replace('.', IOUtils.DIR_SEPARATOR_UNIX);
        strReplace.getClass();
        return strReplace.concat(".class");
    }

    public final int hashCode() {
        return this.f194348a.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        androidx.core.view.j.o(e.class, sb3, ": ");
        sb3.append(this.f194348a);
        return sb3.toString();
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
        public static e a(Class cls) {
            r33.a aVar;
            cls.getClass();
            r33.b bVar = new r33.b();
            c.f194345a.getClass();
            c.b(cls, bVar);
            u33.c cVar = u33.c.f168324g;
            p005kotlin.jvm.internal.j jVar = null;
            if (bVar.f150121h == null || bVar.f150114a == null) {
                aVar = null;
            } else {
                boolean z14 = false;
                u33.c cVar2 = new u33.c(bVar.f150114a, (bVar.f150116c & 8) != 0);
                cVar.getClass();
                u33.c cVar3 = cVar2.f168326f ? cVar : u33.c.f168325h;
                int i14 = cVar3.f168291b;
                int i15 = cVar.f168291b;
                if (i14 > i15 || (i14 >= i15 && cVar3.f168292c > cVar.f168292c)) {
                    cVar = cVar3;
                }
                int i16 = cVar2.f168292c;
                int i17 = cVar2.f168291b;
                if ((i17 != 1 || i16 != 0) && i17 != 0) {
                    int i18 = cVar.f168291b;
                    if (i17 > i18 || (i17 >= i18 && i16 > cVar.f168292c)) {
                        z14 = true;
                    }
                    z14 = !z14;
                }
                if (z14) {
                    r33.a.EnumC2820a enumC2820a = bVar.f150121h;
                    if ((enumC2820a == r33.a.EnumC2820a.CLASS || enumC2820a == r33.a.EnumC2820a.FILE_FACADE || enumC2820a == r33.a.EnumC2820a.MULTIFILE_CLASS_PART) && bVar.f150118e == null) {
                        aVar = null;
                    }
                } else {
                    bVar.f150120g = bVar.f150118e;
                    bVar.f150118e = null;
                }
                String[] strArr = bVar.f150122i;
                aVar = new r33.a(bVar.f150121h, cVar2, bVar.f150118e, bVar.f150120g, bVar.f150119f, bVar.f150115b, bVar.f150116c, bVar.f150117d, strArr != null ? w33.a.a(strArr) : null);
            }
            if (aVar == null) {
                return null;
            }
            return new e(cls, aVar, jVar);
        }

        private a() {
        }
    }

    public /* synthetic */ e(Class cls, r33.a aVar, p005kotlin.jvm.internal.j jVar) {
        this(cls, aVar);
    }
}
