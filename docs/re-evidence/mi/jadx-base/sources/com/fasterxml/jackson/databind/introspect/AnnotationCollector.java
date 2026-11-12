package com.fasterxml.jackson.databind.introspect;

import defpackage.hd1;
import defpackage.ld1;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AnnotationCollector {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ld1 f7674b = new NoAnnotations();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7675a;

    public static class NoAnnotations implements ld1, Serializable {
        private static final long serialVersionUID = 1;

        @Override // defpackage.ld1
        public <A extends Annotation> A get(Class<A> cls) {
            return null;
        }

        @Override // defpackage.ld1
        public boolean has(Class<?> cls) {
            return false;
        }

        @Override // defpackage.ld1
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            return false;
        }

        @Override // defpackage.ld1
        public int size() {
            return 0;
        }
    }

    public static class OneAnnotation implements ld1, Serializable {
        private static final long serialVersionUID = 1;
        private final Class<?> _type;
        private final Annotation _value;

        public OneAnnotation(Class<?> cls, Annotation annotation) {
            this._type = cls;
            this._value = annotation;
        }

        @Override // defpackage.ld1
        public <A extends Annotation> A get(Class<A> cls) {
            if (this._type == cls) {
                return (A) this._value;
            }
            return null;
        }

        @Override // defpackage.ld1
        public boolean has(Class<?> cls) {
            return this._type == cls;
        }

        @Override // defpackage.ld1
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (cls == this._type) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.ld1
        public int size() {
            return 1;
        }
    }

    public static class TwoAnnotations implements ld1, Serializable {
        private static final long serialVersionUID = 1;
        private final Class<?> _type1;
        private final Class<?> _type2;
        private final Annotation _value1;
        private final Annotation _value2;

        public TwoAnnotations(Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            this._type1 = cls;
            this._value1 = annotation;
            this._type2 = cls2;
            this._value2 = annotation2;
        }

        @Override // defpackage.ld1
        public <A extends Annotation> A get(Class<A> cls) {
            if (this._type1 == cls) {
                return (A) this._value1;
            }
            if (this._type2 == cls) {
                return (A) this._value2;
            }
            return null;
        }

        @Override // defpackage.ld1
        public boolean has(Class<?> cls) {
            return this._type1 == cls || this._type2 == cls;
        }

        @Override // defpackage.ld1
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (cls == this._type1 || cls == this._type2) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.ld1
        public int size() {
            return 2;
        }
    }

    public static class a extends AnnotationCollector {
        public static final a c = new a(null);

        public a(Object obj) {
            super(obj);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public AnnotationCollector a(Annotation annotation) {
            return new c(this.f7675a, annotation.annotationType(), annotation);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public hd1 b() {
            return new hd1();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public ld1 c() {
            return AnnotationCollector.f7674b;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public boolean f(Annotation annotation) {
            return false;
        }
    }

    public static class b extends AnnotationCollector {
        public final HashMap<Class<?>, Annotation> c;

        public b(Object obj, Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            super(obj);
            HashMap<Class<?>, Annotation> map = new HashMap<>();
            this.c = map;
            map.put(cls, annotation);
            map.put(cls2, annotation2);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public AnnotationCollector a(Annotation annotation) {
            this.c.put(annotation.annotationType(), annotation);
            return this;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public hd1 b() {
            hd1 hd1Var = new hd1();
            Iterator<Annotation> it = this.c.values().iterator();
            while (it.hasNext()) {
                hd1Var.b(it.next());
            }
            return hd1Var;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public ld1 c() {
            if (this.c.size() != 2) {
                return new hd1(this.c);
            }
            Iterator<Map.Entry<Class<?>, Annotation>> it = this.c.entrySet().iterator();
            Map.Entry<Class<?>, Annotation> next = it.next();
            Map.Entry<Class<?>, Annotation> next2 = it.next();
            return new TwoAnnotations(next.getKey(), next.getValue(), next2.getKey(), next2.getValue());
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public boolean f(Annotation annotation) {
            return this.c.containsKey(annotation.annotationType());
        }
    }

    public static class c extends AnnotationCollector {
        public Class<?> c;
        public Annotation d;

        public c(Object obj, Class<?> cls, Annotation annotation) {
            super(obj);
            this.c = cls;
            this.d = annotation;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public AnnotationCollector a(Annotation annotation) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            Class<?> cls = this.c;
            if (cls != clsAnnotationType) {
                return new b(this.f7675a, cls, this.d, clsAnnotationType, annotation);
            }
            this.d = annotation;
            return this;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public hd1 b() {
            return hd1.e(this.c, this.d);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public ld1 c() {
            return new OneAnnotation(this.c, this.d);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public boolean f(Annotation annotation) {
            return annotation.annotationType() == this.c;
        }
    }

    public AnnotationCollector(Object obj) {
        this.f7675a = obj;
    }

    public static ld1 d() {
        return f7674b;
    }

    public static AnnotationCollector e() {
        return a.c;
    }

    public abstract AnnotationCollector a(Annotation annotation);

    public abstract hd1 b();

    public abstract ld1 c();

    public abstract boolean f(Annotation annotation);
}
