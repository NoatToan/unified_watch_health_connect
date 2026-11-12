package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import defpackage.act;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AnnotationCollector {
    protected static final Annotations NO_ANNOTATIONS = new e();
    protected final Object _data;

    public abstract AnnotationCollector addOrOverride(Annotation annotation);

    public abstract act asAnnotationMap();

    public abstract Annotations asAnnotations();

    public abstract boolean isPresent(Annotation annotation);

    protected AnnotationCollector(Object obj) {
        this._data = obj;
    }

    public static Annotations emptyAnnotations() {
        return NO_ANNOTATIONS;
    }

    public static AnnotationCollector emptyCollector() {
        return d.f4148a;
    }

    public static AnnotationCollector emptyCollector(Object obj) {
        return new d(obj);
    }

    public Object getData() {
        return this._data;
    }

    static class d extends AnnotationCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f4148a = new d(null);

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public boolean isPresent(Annotation annotation) {
            return false;
        }

        d(Object obj) {
            super(obj);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public Annotations asAnnotations() {
            return NO_ANNOTATIONS;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public act asAnnotationMap() {
            return new act();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public AnnotationCollector addOrOverride(Annotation annotation) {
            return new c(this._data, annotation.annotationType(), annotation);
        }
    }

    static class c extends AnnotationCollector {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Annotation f4147c;
        private Class<?> e;

        public c(Object obj, Class<?> cls, Annotation annotation) {
            super(obj);
            this.e = cls;
            this.f4147c = annotation;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public Annotations asAnnotations() {
            return new b(this.e, this.f4147c);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public act asAnnotationMap() {
            return act.c(this.e, this.f4147c);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public boolean isPresent(Annotation annotation) {
            return annotation.annotationType() == this.e;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public AnnotationCollector addOrOverride(Annotation annotation) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            if (this.e == clsAnnotationType) {
                this.f4147c = annotation;
                return this;
            }
            return new a(this._data, this.e, this.f4147c, clsAnnotationType, annotation);
        }
    }

    static class a extends AnnotationCollector {
        protected final HashMap<Class<?>, Annotation> d;

        public a(Object obj, Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            super(obj);
            HashMap<Class<?>, Annotation> map = new HashMap<>();
            this.d = map;
            map.put(cls, annotation);
            map.put(cls2, annotation2);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public Annotations asAnnotations() {
            if (this.d.size() == 2) {
                Iterator<Map.Entry<Class<?>, Annotation>> it = this.d.entrySet().iterator();
                Map.Entry<Class<?>, Annotation> next = it.next();
                Map.Entry<Class<?>, Annotation> next2 = it.next();
                return new j(next.getKey(), next.getValue(), next2.getKey(), next2.getValue());
            }
            return new act(this.d);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public act asAnnotationMap() {
            act actVar = new act();
            Iterator<Annotation> it = this.d.values().iterator();
            while (it.hasNext()) {
                actVar.d(it.next());
            }
            return actVar;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public boolean isPresent(Annotation annotation) {
            return this.d.containsKey(annotation.annotationType());
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public AnnotationCollector addOrOverride(Annotation annotation) {
            this.d.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static class e implements Annotations, Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public <A extends Annotation> A get(Class<A> cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public boolean has(Class<?> cls) {
            return false;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            return false;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public int size() {
            return 0;
        }

        e() {
        }
    }

    public static class b implements Annotations, Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Annotation f4145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<?> f4146c;

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public int size() {
            return 1;
        }

        public b(Class<?> cls, Annotation annotation) {
            this.f4146c = cls;
            this.f4145b = annotation;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public <A extends Annotation> A get(Class<A> cls) {
            if (this.f4146c == cls) {
                return (A) this.f4145b;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public boolean has(Class<?> cls) {
            return this.f4146c == cls;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (cls == this.f4146c) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class j implements Annotations, Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f4149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<?> f4150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Annotation f4151c;
        private final Annotation d;

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public int size() {
            return 2;
        }

        public j(Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            this.f4150b = cls;
            this.f4151c = annotation;
            this.f4149a = cls2;
            this.d = annotation2;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public <A extends Annotation> A get(Class<A> cls) {
            if (this.f4150b == cls) {
                return (A) this.f4151c;
            }
            if (this.f4149a == cls) {
                return (A) this.d;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public boolean has(Class<?> cls) {
            return this.f4150b == cls || this.f4149a == cls;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (cls == this.f4150b || cls == this.f4149a) {
                    return true;
                }
            }
            return false;
        }
    }
}
