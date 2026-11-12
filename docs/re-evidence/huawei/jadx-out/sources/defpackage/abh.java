package defpackage;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class abh extends ValueInstantiator implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected AnnotatedWithParams f213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected JavaType f214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected SettableBeanProperty[] f215c;
    protected AnnotatedWithParams d;
    protected SettableBeanProperty[] e;
    protected AnnotatedWithParams f;
    protected SettableBeanProperty[] g;
    protected JavaType h;
    protected AnnotatedWithParams i;
    protected AnnotatedWithParams j;
    protected AnnotatedWithParams k;
    protected AnnotatedWithParams l;
    protected AnnotatedWithParams m;
    protected AnnotatedWithParams n;
    protected AnnotatedWithParams o;
    protected AnnotatedWithParams p;
    protected final Class<?> q;
    protected final String r;

    public abh(yi yiVar, JavaType javaType) {
        this.r = javaType == null ? "UNKNOWN TYPE" : javaType.toString();
        this.q = javaType == null ? Object.class : javaType.getRawClass();
    }

    public void c(AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr, AnnotatedWithParams annotatedWithParams3, SettableBeanProperty[] settableBeanPropertyArr2) {
        this.f213a = annotatedWithParams;
        this.i = annotatedWithParams2;
        this.h = javaType;
        this.g = settableBeanPropertyArr;
        this.p = annotatedWithParams3;
        this.f215c = settableBeanPropertyArr2;
    }

    public void d(AnnotatedWithParams annotatedWithParams, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr) {
        this.d = annotatedWithParams;
        this.f214b = javaType;
        this.e = settableBeanPropertyArr;
    }

    public void f(AnnotatedWithParams annotatedWithParams) {
        this.l = annotatedWithParams;
    }

    public void e(AnnotatedWithParams annotatedWithParams) {
        this.n = annotatedWithParams;
    }

    public void h(AnnotatedWithParams annotatedWithParams) {
        this.m = annotatedWithParams;
    }

    public void a(AnnotatedWithParams annotatedWithParams) {
        this.j = annotatedWithParams;
    }

    public void d(AnnotatedWithParams annotatedWithParams) {
        this.k = annotatedWithParams;
    }

    public void b(AnnotatedWithParams annotatedWithParams) {
        this.f = annotatedWithParams;
    }

    public void c(AnnotatedWithParams annotatedWithParams) {
        this.o = annotatedWithParams;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public String getValueTypeDesc() {
        return this.r;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Class<?> getValueClass() {
        return this.q;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromString() {
        return this.l != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromInt() {
        return this.n != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromLong() {
        return this.m != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromBigInteger() {
        return this.j != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromDouble() {
        return this.k != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromBigDecimal() {
        return this.f != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromBoolean() {
        return this.o != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateUsingDefault() {
        return this.f213a != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateUsingDelegate() {
        return this.h != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateUsingArrayDelegate() {
        return this.f214b != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromObjectWith() {
        return this.p != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canInstantiate() {
        return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public JavaType getDelegateType(yi yiVar) {
        return this.h;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public JavaType getArrayDelegateType(yi yiVar) {
        return this.f214b;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public SettableBeanProperty[] getFromObjectArguments(yi yiVar) {
        return this.f215c;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
        AnnotatedWithParams annotatedWithParams = this.f213a;
        if (annotatedWithParams == null) {
            return super.createUsingDefault(deserializationContext);
        }
        try {
            return annotatedWithParams.call();
        } catch (Exception e) {
            return deserializationContext.handleInstantiationProblem(this.q, null, a(deserializationContext, e));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        AnnotatedWithParams annotatedWithParams = this.p;
        if (annotatedWithParams == null) {
            return super.createFromObjectWith(deserializationContext, objArr);
        }
        try {
            return annotatedWithParams.call(objArr);
        } catch (Exception e) {
            return deserializationContext.handleInstantiationProblem(this.q, objArr, a(deserializationContext, e));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createUsingDelegate(DeserializationContext deserializationContext, Object obj) throws IOException {
        AnnotatedWithParams annotatedWithParams;
        AnnotatedWithParams annotatedWithParams2 = this.i;
        if (annotatedWithParams2 == null && (annotatedWithParams = this.d) != null) {
            return b(annotatedWithParams, this.e, deserializationContext, obj);
        }
        return b(annotatedWithParams2, this.g, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createUsingArrayDelegate(DeserializationContext deserializationContext, Object obj) throws IOException {
        AnnotatedWithParams annotatedWithParams = this.d;
        if (annotatedWithParams == null && this.i != null) {
            return createUsingDelegate(deserializationContext, obj);
        }
        return b(annotatedWithParams, this.e, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromString(DeserializationContext deserializationContext, String str) throws IOException {
        AnnotatedWithParams annotatedWithParams = this.l;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.call1(str);
            } catch (Throwable th) {
                return deserializationContext.handleInstantiationProblem(this.l.getDeclaringClass(), str, a(deserializationContext, th));
            }
        }
        return super.createFromString(deserializationContext, str);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromInt(DeserializationContext deserializationContext, int i) throws IOException {
        if (this.n != null) {
            Integer numValueOf = Integer.valueOf(i);
            try {
                return this.n.call1(numValueOf);
            } catch (Throwable th) {
                return deserializationContext.handleInstantiationProblem(this.n.getDeclaringClass(), numValueOf, a(deserializationContext, th));
            }
        }
        if (this.m != null) {
            Long lValueOf = Long.valueOf(i);
            try {
                return this.m.call1(lValueOf);
            } catch (Throwable th2) {
                return deserializationContext.handleInstantiationProblem(this.m.getDeclaringClass(), lValueOf, a(deserializationContext, th2));
            }
        }
        if (this.j != null) {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(i);
            try {
                return this.j.call1(bigIntegerValueOf);
            } catch (Throwable th3) {
                return deserializationContext.handleInstantiationProblem(this.j.getDeclaringClass(), bigIntegerValueOf, a(deserializationContext, th3));
            }
        }
        return super.createFromInt(deserializationContext, i);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromLong(DeserializationContext deserializationContext, long j) throws IOException {
        if (this.m != null) {
            Long lValueOf = Long.valueOf(j);
            try {
                return this.m.call1(lValueOf);
            } catch (Throwable th) {
                return deserializationContext.handleInstantiationProblem(this.m.getDeclaringClass(), lValueOf, a(deserializationContext, th));
            }
        }
        if (this.j != null) {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(j);
            try {
                return this.j.call1(bigIntegerValueOf);
            } catch (Throwable th2) {
                return deserializationContext.handleInstantiationProblem(this.j.getDeclaringClass(), bigIntegerValueOf, a(deserializationContext, th2));
            }
        }
        return super.createFromLong(deserializationContext, j);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromBigInteger(DeserializationContext deserializationContext, BigInteger bigInteger) throws IOException {
        AnnotatedWithParams annotatedWithParams = this.j;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.call1(bigInteger);
            } catch (Throwable th) {
                return deserializationContext.handleInstantiationProblem(this.j.getDeclaringClass(), bigInteger, a(deserializationContext, th));
            }
        }
        return super.createFromBigInteger(deserializationContext, bigInteger);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromDouble(DeserializationContext deserializationContext, double d) throws IOException {
        if (this.k != null) {
            Double dValueOf = Double.valueOf(d);
            try {
                return this.k.call1(dValueOf);
            } catch (Throwable th) {
                return deserializationContext.handleInstantiationProblem(this.k.getDeclaringClass(), dValueOf, a(deserializationContext, th));
            }
        }
        if (this.f != null) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
            try {
                return this.f.call1(bigDecimalValueOf);
            } catch (Throwable th2) {
                return deserializationContext.handleInstantiationProblem(this.f.getDeclaringClass(), bigDecimalValueOf, a(deserializationContext, th2));
            }
        }
        return super.createFromDouble(deserializationContext, d);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromBigDecimal(DeserializationContext deserializationContext, BigDecimal bigDecimal) throws IOException {
        Double dC;
        AnnotatedWithParams annotatedWithParams = this.f;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.call1(bigDecimal);
            } catch (Throwable th) {
                return deserializationContext.handleInstantiationProblem(this.f.getDeclaringClass(), bigDecimal, a(deserializationContext, th));
            }
        }
        if (this.k != null && (dC = c(bigDecimal)) != null) {
            try {
                return this.k.call1(dC);
            } catch (Throwable th2) {
                return deserializationContext.handleInstantiationProblem(this.k.getDeclaringClass(), dC, a(deserializationContext, th2));
            }
        }
        return super.createFromBigDecimal(deserializationContext, bigDecimal);
    }

    static Double c(BigDecimal bigDecimal) {
        double dDoubleValue = bigDecimal.doubleValue();
        if (Double.isInfinite(dDoubleValue)) {
            return null;
        }
        return Double.valueOf(dDoubleValue);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromBoolean(DeserializationContext deserializationContext, boolean z) throws IOException {
        if (this.o == null) {
            return super.createFromBoolean(deserializationContext, z);
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        try {
            return this.o.call1(boolValueOf);
        } catch (Throwable th) {
            return deserializationContext.handleInstantiationProblem(this.o.getDeclaringClass(), boolValueOf, a(deserializationContext, th));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public AnnotatedWithParams getDelegateCreator() {
        return this.i;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public AnnotatedWithParams getArrayDelegateCreator() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public AnnotatedWithParams getDefaultCreator() {
        return this.f213a;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public AnnotatedWithParams getWithArgsCreator() {
        return this.p;
    }

    protected ym b(DeserializationContext deserializationContext, Throwable th) {
        if (th instanceof ym) {
            return (ym) th;
        }
        return deserializationContext.instantiationException(getValueClass(), th);
    }

    protected ym a(DeserializationContext deserializationContext, Throwable th) {
        Throwable cause;
        if (((th instanceof ExceptionInInitializerError) || (th instanceof InvocationTargetException)) && (cause = th.getCause()) != null) {
            th = cause;
        }
        return b(deserializationContext, th);
    }

    private Object b(AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (annotatedWithParams == null) {
            throw new IllegalStateException("No delegate constructor for " + getValueTypeDesc());
        }
        try {
            if (settableBeanPropertyArr == null) {
                return annotatedWithParams.call1(obj);
            }
            int length = settableBeanPropertyArr.length;
            Object[] objArr = new Object[length];
            for (int i = 0; i < length; i++) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                if (settableBeanProperty == null) {
                    objArr[i] = obj;
                } else {
                    objArr[i] = deserializationContext.findInjectableValue(settableBeanProperty.getInjectableValueId(), settableBeanProperty, null);
                }
            }
            return annotatedWithParams.call(objArr);
        } catch (Throwable th) {
            throw a(deserializationContext, th);
        }
    }
}
