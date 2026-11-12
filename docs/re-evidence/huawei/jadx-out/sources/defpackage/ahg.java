package defpackage;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes21.dex */
public final class ahg extends ahb {
    private static final long serialVersionUID = 1;

    private ahg(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, Object obj, Object obj2, boolean z) {
        super(cls, ahnVar, javaType, javaTypeArr, javaType2, obj, obj2, z);
    }

    public static ahg c(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2) {
        return new ahg(cls, ahnVar, javaType, javaTypeArr, javaType2, null, null, false);
    }

    @Override // defpackage.ahb, com.fasterxml.jackson.databind.JavaType
    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        return new ahg(cls, this._bindings, this._superClass, this._superInterfaces, this.e, null, null, this._asStatic);
    }

    @Override // defpackage.ahb, com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        return this.e == javaType ? this : new ahg(this._class, this._bindings, this._superClass, this._superInterfaces, javaType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahb, com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ahg withTypeHandler(Object obj) {
        return new ahg(this._class, this._bindings, this._superClass, this._superInterfaces, this.e, this._valueHandler, obj, this._asStatic);
    }

    @Override // defpackage.ahb, com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ahg withContentTypeHandler(Object obj) {
        return new ahg(this._class, this._bindings, this._superClass, this._superInterfaces, this.e.withTypeHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahb, com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ahg withValueHandler(Object obj) {
        return new ahg(this._class, this._bindings, this._superClass, this._superInterfaces, this.e, obj, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahb, com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public ahg withContentValueHandler(Object obj) {
        return new ahg(this._class, this._bindings, this._superClass, this._superInterfaces, this.e.withValueHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahb, com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ahg withStaticTyping() {
        return this._asStatic ? this : new ahg(this._class, this._bindings, this._superClass, this._superInterfaces, this.e.withStaticTyping(), this._valueHandler, this._typeHandler, true);
    }

    @Override // defpackage.ahb, com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new ahg(cls, ahnVar, javaType, javaTypeArr, this.e, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahb, com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return "[collection type; class " + this._class.getName() + ", contains " + this.e + "]";
    }
}
