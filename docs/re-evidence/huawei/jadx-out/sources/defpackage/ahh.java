package defpackage;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes21.dex */
public final class ahh extends ahk {
    private static final long serialVersionUID = 1;

    private ahh(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z) {
        super(cls, ahnVar, javaType, javaTypeArr, javaType2, javaType3, obj, obj2, z);
    }

    public static ahh c(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3) {
        return new ahh(cls, ahnVar, javaType, javaTypeArr, javaType2, javaType3, null, null, false);
    }

    @Override // defpackage.ahk, com.fasterxml.jackson.databind.JavaType
    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        return new ahh(cls, this._bindings, this._superClass, this._superInterfaces, this.f408b, this.f409c, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahk, com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ahh withTypeHandler(Object obj) {
        return new ahh(this._class, this._bindings, this._superClass, this._superInterfaces, this.f408b, this.f409c, this._valueHandler, obj, this._asStatic);
    }

    @Override // defpackage.ahk, com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ahh withContentTypeHandler(Object obj) {
        return new ahh(this._class, this._bindings, this._superClass, this._superInterfaces, this.f408b, this.f409c.withTypeHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahk, com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public ahh withValueHandler(Object obj) {
        return new ahh(this._class, this._bindings, this._superClass, this._superInterfaces, this.f408b, this.f409c, obj, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahk, com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public ahh withContentValueHandler(Object obj) {
        return new ahh(this._class, this._bindings, this._superClass, this._superInterfaces, this.f408b, this.f409c.withValueHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahk, com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ahh withStaticTyping() {
        return this._asStatic ? this : new ahh(this._class, this._bindings, this._superClass, this._superInterfaces, this.f408b.withStaticTyping(), this.f409c.withStaticTyping(), this._valueHandler, this._typeHandler, true);
    }

    @Override // defpackage.ahk, com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        return this.f409c == javaType ? this : new ahh(this._class, this._bindings, this._superClass, this._superInterfaces, this.f408b, javaType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ahh e(JavaType javaType) {
        return javaType == this.f408b ? this : new ahh(this._class, this._bindings, this._superClass, this._superInterfaces, javaType, this.f409c, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahk, com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new ahh(cls, ahnVar, javaType, javaTypeArr, this.f408b, this.f409c, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahk
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ahh c(Object obj) {
        return new ahh(this._class, this._bindings, this._superClass, this._superInterfaces, this.f408b.withValueHandler(obj), this.f409c, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // defpackage.ahk, com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return "[map type; class " + this._class.getName() + ", " + this.f408b + " -> " + this.f409c + "]";
    }
}
