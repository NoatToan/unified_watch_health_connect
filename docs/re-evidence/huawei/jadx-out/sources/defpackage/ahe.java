package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBase;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes21.dex */
public final class ahe extends TypeBase {
    private static final long serialVersionUID = 1;
    protected final JavaType d;
    protected final Object e;

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public boolean isAbstract() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public boolean isArrayType() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public boolean isConcrete() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public boolean isContainerType() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    protected ahe(JavaType javaType, ahn ahnVar, Object obj, Object obj2, Object obj3, boolean z) {
        super(obj.getClass(), ahnVar, null, null, javaType.hashCode(), obj2, obj3, z);
        this.d = javaType;
        this.e = obj;
    }

    public static ahe e(JavaType javaType, ahn ahnVar) {
        return c(javaType, ahnVar, null, null);
    }

    public static ahe c(JavaType javaType, ahn ahnVar, Object obj, Object obj2) {
        return new ahe(javaType, ahnVar, Array.newInstance(javaType.getRawClass(), 0), obj, obj2, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        return new ahe(javaType, this._bindings, Array.newInstance(javaType.getRawClass(), 0), this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ahe withTypeHandler(Object obj) {
        return obj == this._typeHandler ? this : new ahe(this.d, this._bindings, this.e, this._valueHandler, obj, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ahe withContentTypeHandler(Object obj) {
        return obj == this.d.getTypeHandler() ? this : new ahe(this.d.withTypeHandler(obj), this._bindings, this.e, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ahe withValueHandler(Object obj) {
        return obj == this._valueHandler ? this : new ahe(this.d, this._bindings, this.e, obj, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ahe withContentValueHandler(Object obj) {
        return obj == this.d.getValueHandler() ? this : new ahe(this.d.withValueHandler(obj), this._bindings, this.e, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ahe withStaticTyping() {
        return this._asStatic ? this : new ahe(this.d.withStaticTyping(), this._bindings, this.e, this._valueHandler, this._typeHandler, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        return e();
    }

    private JavaType e() {
        throw new UnsupportedOperationException("Cannot narrow or widen array types");
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public boolean hasGenericTypes() {
        return this.d.hasGenericTypes();
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public JavaType getContentType() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public Object getContentValueHandler() {
        return this.d.getValueHandler();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public Object getContentTypeHandler() {
        return this.d.getTypeHandler();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean hasHandlers() {
        return super.hasHandlers() || this.d.hasHandlers();
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb) {
        sb.append('[');
        return this.d.getGenericSignature(sb);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb) {
        sb.append('[');
        return this.d.getErasedSignature(sb);
    }

    public Object[] d() {
        return (Object[]) this.e;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return "[array type, component type: " + this.d + "]";
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            return this.d.equals(((ahe) obj).d);
        }
        return false;
    }
}
