package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBase;

/* JADX INFO: loaded from: classes21.dex */
public class aho extends TypeBase {
    private static final long serialVersionUID = 1;
    protected JavaType d;

    @Override // com.fasterxml.jackson.databind.JavaType
    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public boolean isContainerType() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentTypeHandler(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentValueHandler(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withStaticTyping() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withTypeHandler(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withValueHandler(Object obj) {
        return this;
    }

    public aho(Class<?> cls, ahn ahnVar) {
        super(cls, ahnVar, null, null, 0, null, null, false);
    }

    public void c(JavaType javaType) {
        if (this.d != null) {
            throw new IllegalStateException("Trying to re-set self reference; old value = " + this.d + ", new = " + javaType);
        }
        this.d = javaType;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public JavaType getSuperClass() {
        JavaType javaType = this.d;
        if (javaType != null) {
            return javaType.getSuperClass();
        }
        return super.getSuperClass();
    }

    public JavaType a() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public ahn getBindings() {
        JavaType javaType = this.d;
        if (javaType != null) {
            return javaType.getBindings();
        }
        return super.getBindings();
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb) {
        JavaType javaType = this.d;
        if (javaType != null) {
            return javaType.getErasedSignature(sb);
        }
        sb.append("?");
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb) {
        JavaType javaType = this.d;
        return javaType != null ? javaType.getErasedSignature(sb) : sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[recursive type; ");
        JavaType javaType = this.d;
        if (javaType == null) {
            sb.append("UNRESOLVED");
        } else {
            sb.append(javaType.getRawClass().getName());
        }
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        obj.getClass();
        return false;
    }
}
