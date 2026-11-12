package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBase;

/* JADX INFO: loaded from: classes21.dex */
public class ahl extends TypeBase {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean hasContentType() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public boolean isContainerType() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    protected ahl(Class<?> cls) {
        this(cls, ahn.e(), null, null);
    }

    protected ahl(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        this(cls, ahnVar, javaType, javaTypeArr, null, null, false);
    }

    protected ahl(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr, Object obj, Object obj2, boolean z) {
        super(cls, ahnVar, javaType, javaTypeArr, 0, obj, obj2, z);
    }

    protected ahl(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr, int i, Object obj, Object obj2, boolean z) {
        super(cls, ahnVar, javaType, javaTypeArr, i, obj, obj2, z);
    }

    public static ahl c(Class<?> cls) {
        return new ahl(cls, null, null, null, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        if (this._class == cls) {
            return this;
        }
        if (!this._class.isAssignableFrom(cls)) {
            return new ahl(cls, this._bindings, this, this._superInterfaces, this._valueHandler, this._typeHandler, this._asStatic);
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == this._class) {
            return new ahl(cls, this._bindings, this, this._superInterfaces, this._valueHandler, this._typeHandler, this._asStatic);
        }
        if (superclass != null && this._class.isAssignableFrom(superclass)) {
            return new ahl(cls, this._bindings, _narrow(superclass), null, this._valueHandler, this._typeHandler, this._asStatic);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == this._class) {
                return new ahl(cls, this._bindings, null, new JavaType[]{this}, this._valueHandler, this._typeHandler, this._asStatic);
            }
            if (this._class.isAssignableFrom(cls2)) {
                return new ahl(cls, this._bindings, null, new JavaType[]{_narrow(cls2)}, this._valueHandler, this._typeHandler, this._asStatic);
            }
        }
        throw new IllegalArgumentException("Internal error: Cannot resolve sub-type for Class " + cls.getName() + " to " + this._class.getName());
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ahl withTypeHandler(Object obj) {
        return this._typeHandler == obj ? this : new ahl(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, obj, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentTypeHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public ahl withValueHandler(Object obj) {
        return obj == this._valueHandler ? this : new ahl(this._class, this._bindings, this._superClass, this._superInterfaces, obj, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ahl withContentValueHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ahl withStaticTyping() {
        return this._asStatic ? this : new ahl(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, this._typeHandler, true);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public String buildCanonicalName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._class.getName());
        int iC = this._bindings.c();
        if (iC > 0 && _hasNTypeParameters(iC)) {
            sb.append('<');
            for (int i = 0; i < iC; i++) {
                JavaType javaTypeContainedType = containedType(i);
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(javaTypeContainedType.toCanonical());
            }
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb) {
        return _classSignature(this._class, sb, true);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb) {
        _classSignature(this._class, sb, false);
        int iC = this._bindings.c();
        if (iC > 0) {
            sb.append('<');
            for (int i = 0; i < iC; i++) {
                sb = containedType(i).getGenericSignature(sb);
            }
            sb.append('>');
        }
        sb.append(';');
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[simple type, class ");
        sb.append(buildCanonicalName());
        sb.append(']');
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
        ahl ahlVar = (ahl) obj;
        if (ahlVar._class != this._class) {
            return false;
        }
        return this._bindings.equals(ahlVar._bindings);
    }
}
