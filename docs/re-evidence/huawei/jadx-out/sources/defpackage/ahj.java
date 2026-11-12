package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBase;

/* JADX INFO: loaded from: classes21.dex */
public class ahj extends TypeBase {
    private static final long serialVersionUID = 1;
    protected final int d;
    protected JavaType e;

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public boolean isContainerType() {
        return false;
    }

    public ahj(int i) {
        super(Object.class, ahn.e(), ahp.c(), null, 1, null, null, false);
        this.d = i;
    }

    public JavaType c() {
        return this.e;
    }

    public void c(JavaType javaType) {
        this.e = javaType;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public String buildCanonicalName() {
        return toString();
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb) {
        return getErasedSignature(sb);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb) {
        sb.append('$');
        sb.append(this.d + 1);
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withTypeHandler(Object obj) {
        return (JavaType) d();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentTypeHandler(Object obj) {
        return (JavaType) d();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withValueHandler(Object obj) {
        return (JavaType) d();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentValueHandler(Object obj) {
        return (JavaType) d();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        return (JavaType) d();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withStaticTyping() {
        return (JavaType) d();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        return (JavaType) d();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        return (JavaType) d();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return getErasedSignature(new StringBuilder()).toString();
    }

    private <T> T d() {
        throw new UnsupportedOperationException("Operation should not be attempted on " + getClass().getName());
    }
}
