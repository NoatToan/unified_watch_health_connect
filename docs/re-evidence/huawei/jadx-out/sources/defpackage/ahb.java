package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBase;

/* JADX INFO: loaded from: classes21.dex */
public class ahb extends TypeBase {
    private static final long serialVersionUID = 1;
    protected final JavaType e;

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public boolean isCollectionLikeType() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public boolean isContainerType() {
        return true;
    }

    protected ahb(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, Object obj, Object obj2, boolean z) {
        super(cls, ahnVar, javaType, javaTypeArr, javaType2.hashCode(), obj, obj2, z);
        this.e = javaType2;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        return new ahb(cls, this._bindings, this._superClass, this._superInterfaces, this.e, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        return this.e == javaType ? this : new ahb(this._class, this._bindings, this._superClass, this._superInterfaces, javaType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ahb withTypeHandler(Object obj) {
        return new ahb(this._class, this._bindings, this._superClass, this._superInterfaces, this.e, this._valueHandler, obj, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ahb withContentTypeHandler(Object obj) {
        return new ahb(this._class, this._bindings, this._superClass, this._superInterfaces, this.e.withTypeHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ahb withValueHandler(Object obj) {
        return new ahb(this._class, this._bindings, this._superClass, this._superInterfaces, this.e, obj, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ahb withContentValueHandler(Object obj) {
        return new ahb(this._class, this._bindings, this._superClass, this._superInterfaces, this.e.withValueHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withHandlersFrom(JavaType javaType) {
        JavaType javaTypeWithHandlersFrom;
        JavaType javaTypeWithHandlersFrom2 = super.withHandlersFrom(javaType);
        JavaType contentType = javaType.getContentType();
        return (contentType == null || (javaTypeWithHandlersFrom = this.e.withHandlersFrom(contentType)) == this.e) ? javaTypeWithHandlersFrom2 : javaTypeWithHandlersFrom2.withContentType(javaTypeWithHandlersFrom);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ahb withStaticTyping() {
        return this._asStatic ? this : new ahb(this._class, this._bindings, this._superClass, this._superInterfaces, this.e.withStaticTyping(), this._valueHandler, this._typeHandler, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new ahb(cls, ahnVar, javaType, javaTypeArr, this.e, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public JavaType getContentType() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public Object getContentValueHandler() {
        return this.e.getValueHandler();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public Object getContentTypeHandler() {
        return this.e.getTypeHandler();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean hasHandlers() {
        return super.hasHandlers() || this.e.hasHandlers();
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb) {
        return _classSignature(this._class, sb, true);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb) {
        _classSignature(this._class, sb, false);
        sb.append('<');
        this.e.getGenericSignature(sb);
        sb.append(">;");
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public String buildCanonicalName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._class.getName());
        if (this.e != null && _hasNTypeParameters(1)) {
            sb.append('<');
            sb.append(this.e.toCanonical());
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        ahb ahbVar = (ahb) obj;
        return this._class == ahbVar._class && this.e.equals(ahbVar.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return "[collection-like type; class " + this._class.getName() + ", contains " + this.e + "]";
    }
}
