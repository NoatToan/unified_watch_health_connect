package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import defpackage.h04;
import defpackage.hd1;
import defpackage.n44;
import defpackage.ynf;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends n44 {
    public final g d;
    public AnnotatedConstructor e;

    public c(AnnotationIntrospector annotationIntrospector, g gVar) {
        super(annotationIntrospector);
        this.d = gVar;
    }

    public static a.C0179a o(AnnotationIntrospector annotationIntrospector, g gVar, JavaType javaType, Class<?> cls) {
        return new c(annotationIntrospector, gVar).k(javaType, cls);
    }

    public static boolean s(Constructor<?> constructor) {
        return !constructor.isSynthetic();
    }

    public final List<AnnotatedConstructor> i(JavaType javaType, Class<?> cls) {
        h04.a aVar;
        ArrayList arrayList;
        int i;
        List<AnnotatedConstructor> listEmptyList;
        if (javaType.isEnumType()) {
            aVar = null;
            arrayList = null;
        } else {
            aVar = null;
            arrayList = null;
            for (h04.a aVar2 : h04.z(javaType.getRawClass())) {
                if (s(aVar2.a())) {
                    if (aVar2.c() == 0) {
                        aVar = aVar2;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(aVar2);
                    }
                }
            }
        }
        if (arrayList == null) {
            listEmptyList = Collections.emptyList();
            if (aVar == null) {
                return listEmptyList;
            }
            i = 0;
        } else {
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(null);
            }
            i = size;
            listEmptyList = arrayList2;
        }
        if (cls != null) {
            ynf[] ynfVarArr = null;
            for (h04.a aVar3 : h04.z(cls)) {
                if (aVar3.c() == 0) {
                    if (aVar != null) {
                        this.e = p(aVar, aVar3);
                        aVar = null;
                    }
                } else if (arrayList != null) {
                    if (ynfVarArr == null) {
                        ynfVarArr = new ynf[i];
                        for (int i3 = 0; i3 < i; i3++) {
                            ynfVarArr[i3] = new ynf(((h04.a) arrayList.get(i3)).a());
                        }
                    }
                    ynf ynfVar = new ynf(aVar3.a());
                    for (int i4 = 0; i4 < i; i4++) {
                        if (ynfVar.equals(ynfVarArr[i4])) {
                            listEmptyList.set(i4, r((h04.a) arrayList.get(i4), aVar3));
                            break;
                        }
                    }
                }
            }
        }
        if (aVar != null) {
            this.e = p(aVar, null);
        }
        for (int i5 = 0; i5 < i; i5++) {
            if (listEmptyList.get(i5) == null) {
                listEmptyList.set(i5, r((h04.a) arrayList.get(i5), null));
            }
        }
        return listEmptyList;
    }

    public final List<AnnotatedMethod> j(JavaType javaType, Class<?> cls) {
        ArrayList arrayList = null;
        for (Method method : h04.y(javaType.getRawClass())) {
            if (Modifier.isStatic(method.getModifiers())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(method);
            }
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        if (cls != null) {
            ynf[] ynfVarArr = null;
            for (Method method2 : h04.B(cls)) {
                if (Modifier.isStatic(method2.getModifiers())) {
                    if (ynfVarArr == null) {
                        ynfVarArr = new ynf[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            ynfVarArr[i2] = new ynf((Method) arrayList.get(i2));
                        }
                    }
                    ynf ynfVar = new ynf(method2);
                    for (int i3 = 0; i3 < size; i3++) {
                        if (ynfVar.equals(ynfVarArr[i3])) {
                            arrayList2.set(i3, q((Method) arrayList.get(i3), method2));
                            break;
                        }
                    }
                }
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (((AnnotatedMethod) arrayList2.get(i4)) == null) {
                arrayList2.set(i4, q((Method) arrayList.get(i4), null));
            }
        }
        return arrayList2;
    }

    public a.C0179a k(JavaType javaType, Class<?> cls) {
        List<AnnotatedConstructor> listI = i(javaType, cls);
        List<AnnotatedMethod> listJ = j(javaType, cls);
        AnnotationIntrospector annotationIntrospector = this.f27527a;
        if (annotationIntrospector != null) {
            AnnotatedConstructor annotatedConstructor = this.e;
            if (annotatedConstructor != null && annotationIntrospector.hasIgnoreMarker(annotatedConstructor)) {
                this.e = null;
            }
            int size = listI.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                if (this.f27527a.hasIgnoreMarker(listI.get(size))) {
                    listI.remove(size);
                }
            }
            int size2 = listJ.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                if (this.f27527a.hasIgnoreMarker(listJ.get(size2))) {
                    listJ.remove(size2);
                }
            }
        }
        return new a.C0179a(this.e, listI, listJ);
    }

    public final hd1 l(h04.a aVar, h04.a aVar2) {
        AnnotationCollector annotationCollectorE = e(aVar.a().getDeclaredAnnotations());
        if (aVar2 != null) {
            annotationCollectorE = d(annotationCollectorE, aVar2.a().getDeclaredAnnotations());
        }
        return annotationCollectorE.b();
    }

    public final hd1 m(AnnotatedElement annotatedElement, AnnotatedElement annotatedElement2) {
        AnnotationCollector annotationCollectorE = e(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            annotationCollectorE = d(annotationCollectorE, annotatedElement2.getDeclaredAnnotations());
        }
        return annotationCollectorE.b();
    }

    public final hd1[] n(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        int length = annotationArr.length;
        hd1[] hd1VarArr = new hd1[length];
        for (int i = 0; i < length; i++) {
            AnnotationCollector annotationCollectorD = d(AnnotationCollector.e(), annotationArr[i]);
            if (annotationArr2 != null) {
                annotationCollectorD = d(annotationCollectorD, annotationArr2[i]);
            }
            hd1VarArr[i] = annotationCollectorD.b();
        }
        return hd1VarArr;
    }

    public AnnotatedConstructor p(h04.a aVar, h04.a aVar2) {
        if (this.f27527a == null) {
            return new AnnotatedConstructor(this.d, aVar.a(), n44.a(), n44.f27526b);
        }
        return new AnnotatedConstructor(this.d, aVar.a(), l(aVar, aVar2), n(aVar.a().getParameterAnnotations(), aVar2 == null ? null : aVar2.a().getParameterAnnotations()));
    }

    public AnnotatedMethod q(Method method, Method method2) {
        int length = method.getParameterTypes().length;
        if (this.f27527a == null) {
            return new AnnotatedMethod(this.d, method, n44.a(), n44.b(length));
        }
        if (length == 0) {
            return new AnnotatedMethod(this.d, method, m(method, method2), n44.f27526b);
        }
        return new AnnotatedMethod(this.d, method, m(method, method2), n(method.getParameterAnnotations(), method2 == null ? null : method2.getParameterAnnotations()));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    public AnnotatedConstructor r(h04.a aVar, h04.a aVar2) {
        Annotation[][] annotationArr;
        int iC = aVar.c();
        if (this.f27527a == null) {
            return new AnnotatedConstructor(this.d, aVar.a(), n44.a(), n44.b(iC));
        }
        if (iC == 0) {
            return new AnnotatedConstructor(this.d, aVar.a(), l(aVar, aVar2), n44.f27526b);
        }
        Annotation[][] annotationArrD = aVar.d();
        hd1VarArrN = null;
        hd1[] hd1VarArrN = null;
        if (iC != annotationArrD.length) {
            Class<?> clsB = aVar.b();
            if (clsB.isEnum() && iC == annotationArrD.length + 2) {
                annotationArr = new Annotation[annotationArrD.length + 2][];
                System.arraycopy(annotationArrD, 0, annotationArr, 2, annotationArrD.length);
                hd1VarArrN = n(annotationArr, null);
            } else {
                if (clsB.isMemberClass() && iC == annotationArrD.length + 1) {
                    annotationArr = new Annotation[annotationArrD.length + 1][];
                    System.arraycopy(annotationArrD, 0, annotationArr, 1, annotationArrD.length);
                    annotationArr[0] = n44.c;
                    hd1VarArrN = n(annotationArr, null);
                }
                if (hd1VarArrN == null) {
                    throw new IllegalStateException(String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", aVar.b().getName(), Integer.valueOf(iC), Integer.valueOf(annotationArrD.length)));
                }
            }
            annotationArrD = annotationArr;
            if (hd1VarArrN == null) {
                throw new IllegalStateException(String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", aVar.b().getName(), Integer.valueOf(iC), Integer.valueOf(annotationArrD.length)));
            }
        } else {
            hd1VarArrN = n(annotationArrD, aVar2 != null ? aVar2.d() : null);
        }
        return new AnnotatedConstructor(this.d, aVar.a(), l(aVar, aVar2), hd1VarArrN);
    }
}
