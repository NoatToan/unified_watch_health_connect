package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.huawei.operation.utils.Constants;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes21.dex */
public final class aco extends AnnotatedWithParams implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected b f257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final transient Method f258b;
    protected Class<?>[] e;

    public aco(TypeResolutionContext typeResolutionContext, Method method, act actVar, act[] actVarArr) {
        super(typeResolutionContext, actVar, actVarArr);
        if (method == null) {
            throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
        }
        this.f258b = method;
    }

    protected aco(b bVar) {
        super(null, null, null);
        this.f258b = null;
        this.f257a = bVar;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aco withAnnotations(act actVar) {
        return new aco(this._typeContext, this.f258b, actVar, this._paramAnnotations);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Method getAnnotated() {
        return this.f258b;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int getModifiers() {
        return this.f258b.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return this.f258b.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public JavaType getType() {
        return this._typeContext.resolveType(this.f258b.getGenericReturnType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this.f258b.getReturnType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call() throws Exception {
        return this.f258b.invoke(null, new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call(Object[] objArr) throws Exception {
        return this.f258b.invoke(null, objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call1(Object obj) throws Exception {
        return this.f258b.invoke(null, obj);
    }

    public final Object e(Object obj, Object... objArr) throws Exception {
        return this.f258b.invoke(obj, objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public int getParameterCount() {
        return b().length;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public Class<?> getRawParameterType(int i) {
        Class<?>[] clsArrB = b();
        if (i >= clsArrB.length) {
            return null;
        }
        return clsArrB[i];
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public JavaType getParameterType(int i) {
        Type[] genericParameterTypes = this.f258b.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.resolveType(genericParameterTypes[i]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    @Deprecated
    public Type getGenericParameterType(int i) {
        Type[] typeArrC = c();
        if (i >= typeArrC.length) {
            return null;
        }
        return typeArrC[i];
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this.f258b.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Method getMember() {
        return this.f258b;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this.f258b.invoke(obj, obj2);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException("Failed to setValue() with method " + getFullName() + ": " + e.getMessage(), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this.f258b.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException("Failed to getValue() with method " + getFullName() + ": " + e.getMessage(), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public String getFullName() {
        String fullName = super.getFullName();
        int parameterCount = getParameterCount();
        if (parameterCount == 0) {
            return fullName + "()";
        }
        if (parameterCount == 1) {
            return fullName + Constants.LEFT_BRACKET_ONLY + getRawParameterType(0).getName() + Constants.RIGHT_BRACKET_ONLY;
        }
        return String.format("%s(%d params)", super.getFullName(), Integer.valueOf(getParameterCount()));
    }

    public Class<?>[] b() {
        if (this.e == null) {
            this.e = this.f258b.getParameterTypes();
        }
        return this.e;
    }

    @Deprecated
    public Type[] c() {
        return this.f258b.getGenericParameterTypes();
    }

    public Class<?> a() {
        return this.f258b.getReturnType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        return "[method " + getFullName() + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this.f258b.getName().hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ahw.e(obj, getClass()) && ((aco) obj).f258b == this.f258b;
    }

    Object writeReplace() {
        return new aco(new b(this.f258b));
    }

    Object readResolve() {
        Class<?> cls = this.f257a.f259a;
        try {
            Method declaredMethod = cls.getDeclaredMethod(this.f257a.e, this.f257a.f260b);
            if (!declaredMethod.isAccessible()) {
                ahw.a((Member) declaredMethod, false);
            }
            return new aco(null, declaredMethod, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this.f257a.e + "' from Class '" + cls.getName());
        }
    }

    static final class b implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected Class<?> f259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected Class<?>[] f260b;
        protected String e;

        public b(Method method) {
            this.f259a = method.getDeclaringClass();
            this.e = method.getName();
            this.f260b = method.getParameterTypes();
        }
    }
}
