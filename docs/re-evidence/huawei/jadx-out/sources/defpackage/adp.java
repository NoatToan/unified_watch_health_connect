package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase;
import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes21.dex */
public class adp extends TypeIdResolverBase {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final PolymorphicTypeValidator f302c;

    public adp(JavaType javaType, ahp ahpVar, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, ahpVar);
        this.f302c = polymorphicTypeValidator;
    }

    public static adp a(JavaType javaType, MapperConfig<?> mapperConfig, PolymorphicTypeValidator polymorphicTypeValidator) {
        return new adp(javaType, mapperConfig.getTypeFactory(), polymorphicTypeValidator);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public JsonTypeInfo.Id getMechanism() {
        return JsonTypeInfo.Id.CLASS;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String idFromValue(Object obj) {
        return b(obj, obj.getClass(), this._typeFactory);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String idFromValueAndType(Object obj, Class<?> cls) {
        return b(obj, cls, this._typeFactory);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase, com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public JavaType typeFromId(DatabindContext databindContext, String str) throws IOException {
        return e(str, databindContext);
    }

    protected JavaType e(String str, DatabindContext databindContext) throws IOException {
        JavaType javaTypeResolveAndValidateSubType = databindContext.resolveAndValidateSubType(this._baseType, str, this.f302c);
        return (javaTypeResolveAndValidateSubType == null && (databindContext instanceof DeserializationContext)) ? ((DeserializationContext) databindContext).handleUnknownTypeId(this._baseType, str, this, "no such class found") : javaTypeResolveAndValidateSubType;
    }

    protected String b(Object obj, Class<?> cls, ahp ahpVar) {
        if (ahw.m(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (name.startsWith("java.util.")) {
            if (obj instanceof EnumSet) {
                return ahpVar.b(EnumSet.class, ahw.e((EnumSet<?>) obj)).toCanonical();
            }
            if (obj instanceof EnumMap) {
                return ahpVar.c(EnumMap.class, ahw.e((EnumMap<?, ?>) obj), Object.class).toCanonical();
            }
        } else if (name.indexOf(36) >= 0 && ahw.f(cls) != null && ahw.f(this._baseType.getRawClass()) == null) {
            return this._baseType.getRawClass().getName();
        }
        return name;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase, com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String getDescForKnownTypeIds() {
        return "class name used as type id";
    }
}
