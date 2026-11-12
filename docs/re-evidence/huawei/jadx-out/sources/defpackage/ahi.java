package defpackage;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes21.dex */
public class ahi extends ahl {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final JavaType f407a;
    protected final JavaType d;

    @Override // defpackage.ahl, com.fasterxml.jackson.databind.JavaType
    public boolean hasContentType() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public boolean isReferenceType() {
        return true;
    }

    protected ahi(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z) {
        super(cls, ahnVar, javaType, javaTypeArr, javaType2.hashCode(), obj, obj2, z);
        this.f407a = javaType2;
        this.d = javaType3 == null ? this : javaType3;
    }

    public static ahi e(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2) {
        return new ahi(cls, ahnVar, javaType, javaTypeArr, javaType2, null, null, null, false);
    }

    @Override // defpackage.ahl, com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        return this.f407a == javaType ? this : new ahi(this._class, this._bindings, this._superClass, this._superInterfaces, javaType, this.d, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahl, com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ahi withTypeHandler(Object obj) {
        return obj == this._typeHandler ? this : new ahi(this._class, this._bindings, this._superClass, this._superInterfaces, this.f407a, this.d, this._valueHandler, obj, this._asStatic);
    }

    @Override // defpackage.ahl, com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ahi withContentTypeHandler(Object obj) {
        return obj == this.f407a.getTypeHandler() ? this : new ahi(this._class, this._bindings, this._superClass, this._superInterfaces, this.f407a.withTypeHandler(obj), this.d, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahl, com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ahi withValueHandler(Object obj) {
        return obj == this._valueHandler ? this : new ahi(this._class, this._bindings, this._superClass, this._superInterfaces, this.f407a, this.d, obj, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahl, com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ahi withContentValueHandler(Object obj) {
        if (obj == this.f407a.getValueHandler()) {
            return this;
        }
        return new ahi(this._class, this._bindings, this._superClass, this._superInterfaces, this.f407a.withValueHandler(obj), this.d, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahl, com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ahi withStaticTyping() {
        return this._asStatic ? this : new ahi(this._class, this._bindings, this._superClass, this._superInterfaces, this.f407a.withStaticTyping(), this.d, this._valueHandler, this._typeHandler, true);
    }

    @Override // defpackage.ahl, com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new ahi(cls, this._bindings, javaType, javaTypeArr, this.f407a, this.d, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahl, com.fasterxml.jackson.databind.type.TypeBase
    public String buildCanonicalName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._class.getName());
        if (this.f407a != null && _hasNTypeParameters(1)) {
            sb.append('<');
            sb.append(this.f407a.toCanonical());
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // defpackage.ahl, com.fasterxml.jackson.databind.JavaType
    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        return new ahi(cls, this._bindings, this._superClass, this._superInterfaces, this.f407a, this.d, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public JavaType getContentType() {
        return this.f407a;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public JavaType getReferencedType() {
        return this.f407a;
    }

    @Override // defpackage.ahl, com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb) {
        return _classSignature(this._class, sb, true);
    }

    @Override // defpackage.ahl, com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb) {
        _classSignature(this._class, sb, false);
        sb.append('<');
        StringBuilder genericSignature = this.f407a.getGenericSignature(sb);
        genericSignature.append(">;");
        return genericSignature;
    }

    @Override // defpackage.ahl, com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[reference type, class ");
        sb.append(buildCanonicalName());
        sb.append('<');
        sb.append(this.f407a);
        sb.append(">]");
        return sb.toString();
    }

    @Override // defpackage.ahl, com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        ahi ahiVar = (ahi) obj;
        if (ahiVar._class != this._class) {
            return false;
        }
        return this.f407a.equals(ahiVar.f407a);
    }
}
