package defpackage;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class aae implements NullValueProvider, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ys f154c;
    protected final JavaType e;

    protected aae(ys ysVar, JavaType javaType) {
        this.f154c = ysVar;
        this.e = javaType;
    }

    public static aae a(BeanProperty beanProperty) {
        return e(beanProperty, beanProperty.getType());
    }

    public static aae e(BeanProperty beanProperty, JavaType javaType) {
        return new aae(beanProperty.getFullName(), javaType);
    }

    public static aae b(JavaType javaType) {
        return new aae(null, javaType);
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public AccessPattern getNullAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public Object getNullValue(DeserializationContext deserializationContext) throws ym {
        throw abz.a(deserializationContext, this.f154c, this.e);
    }
}
