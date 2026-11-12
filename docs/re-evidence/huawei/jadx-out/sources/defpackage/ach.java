package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes21.dex */
public final class ach extends AnnotatedWithParams {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Constructor<?> f246a;
    protected b e;

    public ach(TypeResolutionContext typeResolutionContext, Constructor<?> constructor, act actVar, act[] actVarArr) {
        super(typeResolutionContext, actVar, actVarArr);
        if (constructor == null) {
            throw new IllegalArgumentException("Null constructor not allowed");
        }
        this.f246a = constructor;
    }

    protected ach(b bVar) {
        super(null, null, null);
        this.f246a = null;
        this.e = bVar;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ach withAnnotations(act actVar) {
        return new ach(this._typeContext, this.f246a, actVar, this._paramAnnotations);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Constructor<?> getAnnotated() {
        return this.f246a;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int getModifiers() {
        return this.f246a.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return this.f246a.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public JavaType getType() {
        return this._typeContext.resolveType(getRawType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this.f246a.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public int getParameterCount() {
        return this.f246a.getParameterTypes().length;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public Class<?> getRawParameterType(int i) {
        Class<?>[] parameterTypes = this.f246a.getParameterTypes();
        if (i >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i];
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public JavaType getParameterType(int i) {
        Type[] genericParameterTypes = this.f246a.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.resolveType(genericParameterTypes[i]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    @Deprecated
    public Type getGenericParameterType(int i) {
        Type[] genericParameterTypes = this.f246a.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i];
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call() throws Exception {
        return this.f246a.newInstance(new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call(Object[] objArr) throws Exception {
        return this.f246a.newInstance(objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call1(Object obj) throws Exception {
        return this.f246a.newInstance(obj);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this.f246a.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this.f246a;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor of " + getDeclaringClass().getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of " + getDeclaringClass().getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        int length = this.f246a.getParameterTypes().length;
        return String.format("[constructor for %s (%d arg%s), annotations: %s", ahw.u(this.f246a.getDeclaringClass()), Integer.valueOf(length), length == 1 ? "" : "s", this._annotations);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this.f246a.getName().hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ahw.e(obj, getClass()) && ((ach) obj).f246a == this.f246a;
    }

    Object writeReplace() {
        return new ach(new b(this.f246a));
    }

    Object readResolve() {
        Class<?> cls = this.e.d;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(this.e.f247c);
            if (!declaredConstructor.isAccessible()) {
                ahw.a((Member) declaredConstructor, false);
            }
            return new ach(null, declaredConstructor, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find constructor with " + this.e.f247c.length + " args from Class '" + cls.getName());
        }
    }

    static final class b implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected Class<?>[] f247c;
        protected Class<?> d;

        public b(Constructor<?> constructor) {
            this.d = constructor.getDeclaringClass();
            this.f247c = constructor.getParameterTypes();
        }
    }
}
