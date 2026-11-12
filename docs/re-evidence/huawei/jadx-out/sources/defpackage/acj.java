package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes21.dex */
public final class acj extends AnnotatedMember implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected a f248a;
    protected final transient Field e;

    public acj(TypeResolutionContext typeResolutionContext, Field field, act actVar) {
        super(typeResolutionContext, actVar);
        this.e = field;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public acj withAnnotations(act actVar) {
        return new acj(this._typeContext, this.e, actVar);
    }

    protected acj(a aVar) {
        super(null, null);
        this.e = null;
        this.f248a = aVar;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Field getAnnotated() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int getModifiers() {
        return this.e.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return this.e.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this.e.getType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public JavaType getType() {
        return this._typeContext.resolveType(this.e.getGenericType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this.e.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this.e.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to setValue() for field " + getFullName() + ": " + e.getMessage(), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this.e.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to getValue() for field " + getFullName() + ": " + e.getMessage(), e);
        }
    }

    public boolean b() {
        return Modifier.isTransient(getModifiers());
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this.e.getName().hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ahw.e(obj, getClass()) && ((acj) obj).e == this.e;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        return "[field " + getFullName() + "]";
    }

    Object writeReplace() {
        return new acj(new a(this.e));
    }

    Object readResolve() {
        Class<?> cls = this.f248a.d;
        try {
            Field declaredField = cls.getDeclaredField(this.f248a.e);
            if (!declaredField.isAccessible()) {
                ahw.a((Member) declaredField, false);
            }
            return new acj(null, declaredField, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this.f248a.e + "' from Class '" + cls.getName());
        }
    }

    static final class a implements Serializable {
        private static final long serialVersionUID = 1;
        protected Class<?> d;
        protected String e;

        public a(Field field) {
            this.d = field.getDeclaringClass();
            this.e = field.getName();
        }
    }
}
