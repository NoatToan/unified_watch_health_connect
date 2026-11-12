package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes21.dex */
public class ade extends AnnotatedMember implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final JavaType f294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f295b;
    protected final Class<?> e;

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Field getAnnotated() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int getModifiers() {
        return 0;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Annotated withAnnotations(act actVar) {
        return this;
    }

    public ade(TypeResolutionContext typeResolutionContext, Class<?> cls, String str, JavaType javaType) {
        super(typeResolutionContext, null);
        this.e = cls;
        this.f294a = javaType;
        this.f295b = str;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return this.f295b;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this.f294a.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public JavaType getType() {
        return this.f294a;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot set virtual property '" + this.f295b + "'");
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot get virtual property '" + this.f295b + "'");
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this.f295b.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ahw.e(obj, getClass())) {
            return false;
        }
        ade adeVar = (ade) obj;
        return adeVar.e == this.e && adeVar.f295b.equals(this.f295b);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        return "[virtual " + getFullName() + "]";
    }
}
