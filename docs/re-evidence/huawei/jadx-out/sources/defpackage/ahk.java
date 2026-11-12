package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBase;

/* JADX INFO: loaded from: classes21.dex */
public class ahk extends TypeBase {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JavaType f408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final JavaType f409c;

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public boolean isContainerType() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public boolean isMapLikeType() {
        return true;
    }

    protected ahk(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z) {
        super(cls, ahnVar, javaType, javaTypeArr, javaType2.hashCode() ^ javaType3.hashCode(), obj, obj2, z);
        this.f408b = javaType2;
        this.f409c = javaType3;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        return new ahk(cls, this._bindings, this._superClass, this._superInterfaces, this.f408b, this.f409c, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public ahk e(JavaType javaType) {
        return javaType == this.f408b ? this : new ahk(this._class, this._bindings, this._superClass, this._superInterfaces, javaType, this.f409c, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        return this.f409c == javaType ? this : new ahk(this._class, this._bindings, this._superClass, this._superInterfaces, this.f408b, javaType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ahk withTypeHandler(Object obj) {
        return new ahk(this._class, this._bindings, this._superClass, this._superInterfaces, this.f408b, this.f409c, this._valueHandler, obj, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ahk withContentTypeHandler(Object obj) {
        return new ahk(this._class, this._bindings, this._superClass, this._superInterfaces, this.f408b, this.f409c.withTypeHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ahk withValueHandler(Object obj) {
        return new ahk(this._class, this._bindings, this._superClass, this._superInterfaces, this.f408b, this.f409c, obj, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ahk withContentValueHandler(Object obj) {
        return new ahk(this._class, this._bindings, this._superClass, this._superInterfaces, this.f408b, this.f409c.withValueHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withHandlersFrom(JavaType javaType) {
        JavaType javaTypeWithHandlersFrom;
        JavaType javaTypeWithHandlersFrom2;
        JavaType javaTypeWithHandlersFrom3 = super.withHandlersFrom(javaType);
        JavaType keyType = javaType.getKeyType();
        if ((javaTypeWithHandlersFrom3 instanceof ahk) && keyType != null && (javaTypeWithHandlersFrom2 = this.f408b.withHandlersFrom(keyType)) != this.f408b) {
            javaTypeWithHandlersFrom3 = ((ahk) javaTypeWithHandlersFrom3).e(javaTypeWithHandlersFrom2);
        }
        JavaType contentType = javaType.getContentType();
        return (contentType == null || (javaTypeWithHandlersFrom = this.f409c.withHandlersFrom(contentType)) == this.f409c) ? javaTypeWithHandlersFrom3 : javaTypeWithHandlersFrom3.withContentType(javaTypeWithHandlersFrom);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ahk withStaticTyping() {
        return this._asStatic ? this : new ahk(this._class, this._bindings, this._superClass, this._superInterfaces, this.f408b, this.f409c.withStaticTyping(), this._valueHandler, this._typeHandler, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new ahk(cls, ahnVar, javaType, javaTypeArr, this.f408b, this.f409c, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public String buildCanonicalName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._class.getName());
        if (this.f408b != null && _hasNTypeParameters(2)) {
            sb.append('<');
            sb.append(this.f408b.toCanonical());
            sb.append(',');
            sb.append(this.f409c.toCanonical());
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public JavaType getKeyType() {
        return this.f408b;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public JavaType getContentType() {
        return this.f409c;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public Object getContentValueHandler() {
        return this.f409c.getValueHandler();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public Object getContentTypeHandler() {
        return this.f409c.getTypeHandler();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean hasHandlers() {
        return super.hasHandlers() || this.f409c.hasHandlers() || this.f408b.hasHandlers();
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb) {
        return _classSignature(this._class, sb, true);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb) {
        _classSignature(this._class, sb, false);
        sb.append('<');
        this.f408b.getGenericSignature(sb);
        this.f409c.getGenericSignature(sb);
        sb.append(">;");
        return sb;
    }

    public ahk c(Object obj) {
        return new ahk(this._class, this._bindings, this._superClass, this._superInterfaces, this.f408b.withValueHandler(obj), this.f409c, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", this._class.getName(), this.f408b, this.f409c);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        ahk ahkVar = (ahk) obj;
        return this._class == ahkVar._class && this.f408b.equals(ahkVar.f408b) && this.f409c.equals(ahkVar.f409c);
    }
}
