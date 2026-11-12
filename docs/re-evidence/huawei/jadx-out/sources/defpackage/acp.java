package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes21.dex */
public final class acp extends AnnotatedMember {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AnnotatedWithParams f261a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final JavaType f262c;
    protected final int e;

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public AnnotatedElement getAnnotated() {
        return null;
    }

    public acp(AnnotatedWithParams annotatedWithParams, JavaType javaType, TypeResolutionContext typeResolutionContext, act actVar, int i) {
        super(typeResolutionContext, actVar);
        this.f261a = annotatedWithParams;
        this.f262c = javaType;
        this.e = i;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public acp withAnnotations(act actVar) {
        return actVar == this._annotations ? this : this.f261a.replaceParameterAnnotations(this.e, actVar);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int getModifiers() {
        return this.f261a.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this.f262c.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public JavaType getType() {
        return this.f262c;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this.f261a.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this.f261a.getMember();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of " + getDeclaringClass().getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of " + getDeclaringClass().getName());
    }

    public AnnotatedWithParams e() {
        return this.f261a;
    }

    public int d() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this.f261a.hashCode() + this.e;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ahw.e(obj, getClass())) {
            return false;
        }
        acp acpVar = (acp) obj;
        return acpVar.f261a.equals(this.f261a) && acpVar.e == this.e;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        return "[parameter #" + d() + ", annotations: " + this._annotations + "]";
    }
}
