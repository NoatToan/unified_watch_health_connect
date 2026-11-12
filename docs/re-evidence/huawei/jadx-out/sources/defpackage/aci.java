package defpackage;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
final class aci extends acu {
    private final boolean d;
    private ach e;
    private final TypeResolutionContext f;

    aci(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, boolean z) {
        super(annotationIntrospector);
        this.f = typeResolutionContext;
        this.d = z;
    }

    public static ack.e e(AnnotationIntrospector annotationIntrospector, ahp ahpVar, TypeResolutionContext typeResolutionContext, JavaType javaType, Class<?> cls, boolean z) {
        return new aci(annotationIntrospector, typeResolutionContext, z | (cls != null)).c(ahpVar, javaType, cls);
    }

    ack.e c(ahp ahpVar, JavaType javaType, Class<?> cls) {
        List<ach> listA = a(javaType, cls);
        List<aco> listB = b(ahpVar, javaType, cls);
        if (this.d) {
            if (this.e != null && this.f274a.hasIgnoreMarker(this.e)) {
                this.e = null;
            }
            int size = listA.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                if (this.f274a.hasIgnoreMarker(listA.get(size))) {
                    listA.remove(size);
                }
            }
            int size2 = listB.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                if (this.f274a.hasIgnoreMarker(listB.get(size2))) {
                    listB.remove(size2);
                }
            }
        }
        return new ack.e(this.e, listA, listB);
    }

    private List<ach> a(JavaType javaType, Class<?> cls) {
        ahw.d dVar;
        ArrayList arrayList;
        int size;
        List<ach> arrayList2;
        if (javaType.isEnumType()) {
            dVar = null;
            arrayList = null;
        } else {
            dVar = null;
            arrayList = null;
            for (ahw.d dVar2 : ahw.i(javaType.getRawClass())) {
                if (e(dVar2.b())) {
                    if (dVar2.a() == 0) {
                        dVar = dVar2;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(dVar2);
                    }
                }
            }
        }
        if (arrayList == null) {
            List<ach> list = Collections.EMPTY_LIST;
            if (dVar == null) {
                return list;
            }
            arrayList2 = list;
            size = 0;
        } else {
            size = arrayList.size();
            arrayList2 = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add(null);
            }
        }
        if (cls != null) {
            acz[] aczVarArr = null;
            for (ahw.d dVar3 : ahw.i(cls)) {
                if (dVar3.a() == 0) {
                    if (dVar != null) {
                        this.e = a(dVar, dVar3);
                        dVar = null;
                    }
                } else if (arrayList != null) {
                    if (aczVarArr == null) {
                        aczVarArr = new acz[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            aczVarArr[i2] = new acz(((ahw.d) arrayList.get(i2)).b());
                        }
                    }
                    acz aczVar = new acz(dVar3.b());
                    for (int i3 = 0; i3 < size; i3++) {
                        if (aczVar.equals(aczVarArr[i3])) {
                            arrayList2.set(i3, c((ahw.d) arrayList.get(i3), dVar3));
                            break;
                        }
                    }
                }
            }
        }
        if (dVar != null) {
            this.e = a(dVar, (ahw.d) null);
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (arrayList2.get(i4) == null) {
                arrayList2.set(i4, c((ahw.d) arrayList.get(i4), null));
            }
        }
        return arrayList2;
    }

    private List<aco> b(ahp ahpVar, JavaType javaType, Class<?> cls) {
        ArrayList arrayList = null;
        for (Method method : ahw.c(javaType.getRawClass())) {
            if (d(method)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(method);
            }
        }
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        TypeResolutionContext typeResolutionContext = this.f;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        if (cls != null) {
            acz[] aczVarArr = null;
            for (Method method2 : cls.getDeclaredMethods()) {
                if (d(method2)) {
                    if (aczVarArr == null) {
                        aczVarArr = new acz[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            aczVarArr[i2] = new acz((Method) arrayList.get(i2));
                        }
                    }
                    acz aczVar = new acz(method2);
                    for (int i3 = 0; i3 < size; i3++) {
                        if (aczVar.equals(aczVarArr[i3])) {
                            arrayList2.set(i3, e((Method) arrayList.get(i3), typeResolutionContext, method2));
                            break;
                        }
                    }
                }
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (((aco) arrayList2.get(i4)) == null) {
                Method method3 = (Method) arrayList.get(i4);
                arrayList2.set(i4, e(method3, acw.e(method3, javaType, ahpVar, typeResolutionContext), null));
            }
        }
        return arrayList2;
    }

    private static boolean d(Method method) {
        return Modifier.isStatic(method.getModifiers()) && !method.isSynthetic();
    }

    protected ach a(ahw.d dVar, ahw.d dVar2) {
        return new ach(this.f, dVar.b(), d(dVar, dVar2), f272b);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    protected ach c(ahw.d dVar, ahw.d dVar2) {
        Annotation[][] annotationArr;
        act[] actVarArrB;
        int iA = dVar.a();
        if (this.f274a == null) {
            return new ach(this.f, dVar.b(), e(), c(iA));
        }
        if (iA == 0) {
            return new ach(this.f, dVar.b(), d(dVar, dVar2), f272b);
        }
        Annotation[][] annotationArrE = dVar.e();
        actVarArrB = null;
        act[] actVarArrB2 = null;
        if (iA != annotationArrE.length) {
            Class<?> clsD = dVar.d();
            if (ahw.m(clsD) && iA == annotationArrE.length + 2) {
                annotationArr = new Annotation[annotationArrE.length + 2][];
                System.arraycopy(annotationArrE, 0, annotationArr, 2, annotationArrE.length);
                actVarArrB = b(annotationArr, (Annotation[][]) null);
            } else {
                if (clsD.isMemberClass() && iA == annotationArrE.length + 1) {
                    annotationArr = new Annotation[annotationArrE.length + 1][];
                    System.arraycopy(annotationArrE, 0, annotationArr, 1, annotationArrE.length);
                    annotationArr[0] = f273c;
                    actVarArrB = b(annotationArr, (Annotation[][]) null);
                }
                if (actVarArrB2 == null) {
                    throw new IllegalStateException(String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", dVar.d().getName(), Integer.valueOf(iA), Integer.valueOf(annotationArrE.length)));
                }
            }
            actVarArrB2 = actVarArrB;
            annotationArrE = annotationArr;
            if (actVarArrB2 == null) {
                throw new IllegalStateException(String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", dVar.d().getName(), Integer.valueOf(iA), Integer.valueOf(annotationArrE.length)));
            }
        } else {
            actVarArrB2 = b(annotationArrE, dVar2 != null ? dVar2.e() : null);
        }
        return new ach(this.f, dVar.b(), d(dVar, dVar2), actVarArrB2);
    }

    protected aco e(Method method, TypeResolutionContext typeResolutionContext, Method method2) {
        int length = method.getParameterTypes().length;
        if (this.f274a == null) {
            return new aco(typeResolutionContext, method, e(), c(length));
        }
        if (length == 0) {
            return new aco(typeResolutionContext, method, a(method, method2), f272b);
        }
        return new aco(typeResolutionContext, method, a(method, method2), b(method.getParameterAnnotations(), method2 == null ? null : method2.getParameterAnnotations()));
    }

    private act[] b(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (this.d) {
            int length = annotationArr.length;
            act[] actVarArr = new act[length];
            for (int i = 0; i < length; i++) {
                AnnotationCollector annotationCollectorA = a(AnnotationCollector.emptyCollector(), annotationArr[i]);
                if (annotationArr2 != null) {
                    annotationCollectorA = a(annotationCollectorA, annotationArr2[i]);
                }
                actVarArr[i] = annotationCollectorA.asAnnotationMap();
            }
            return actVarArr;
        }
        return f272b;
    }

    private act d(ahw.d dVar, ahw.d dVar2) {
        if (this.d) {
            AnnotationCollector annotationCollectorE = e(dVar.c());
            if (dVar2 != null) {
                annotationCollectorE = a(annotationCollectorE, dVar2.c());
            }
            return annotationCollectorE.asAnnotationMap();
        }
        return e();
    }

    private final act a(AnnotatedElement annotatedElement, AnnotatedElement annotatedElement2) {
        AnnotationCollector annotationCollectorE = e(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            annotationCollectorE = a(annotationCollectorE, annotatedElement2.getDeclaredAnnotations());
        }
        return annotationCollectorE.asAnnotationMap();
    }

    private static boolean e(Constructor<?> constructor) {
        return !constructor.isSynthetic();
    }
}
