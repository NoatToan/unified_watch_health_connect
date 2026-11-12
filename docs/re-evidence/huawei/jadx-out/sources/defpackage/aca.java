package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes21.dex */
public class aca extends ym {
    protected Class<?> _targetType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected aca(JsonParser jsonParser, String str) {
        this(jsonParser, str, (JavaType) null);
    }

    public aca(JsonParser jsonParser, String str, wq wqVar) {
        super(jsonParser, str, wqVar);
    }

    protected aca(JsonParser jsonParser, String str, Class<?> cls) {
        super(jsonParser, str);
        this._targetType = cls;
    }

    protected aca(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
        this._targetType = ahw.b(javaType);
    }

    @Deprecated
    public static aca from(JsonParser jsonParser, String str) {
        return from(jsonParser, (Class<?>) null, str);
    }

    public static aca from(JsonParser jsonParser, JavaType javaType, String str) {
        return new aca(jsonParser, str, javaType);
    }

    public static aca from(JsonParser jsonParser, Class<?> cls, String str) {
        return new aca(jsonParser, str, cls);
    }

    public aca setTargetType(JavaType javaType) {
        this._targetType = javaType.getRawClass();
        return this;
    }

    public Class<?> getTargetType() {
        return this._targetType;
    }
}
