package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.xiaomi.common.Optional;
import com.xiaomi.ext.OptionalSerializer;

/* JADX INFO: loaded from: classes7.dex */
public class erd extends xwl.a {
    @Override // xwl.a, defpackage.xwl
    public eud<?> findReferenceSerializer(SerializationConfig serializationConfig, ReferenceType referenceType, fh2 fh2Var, e5q e5qVar, eud<Object> eudVar) {
        if (Optional.class.isAssignableFrom(referenceType.getRawClass())) {
            return new OptionalSerializer(referenceType, e5qVar == null && serializationConfig.isEnabled(MapperFeature.USE_STATIC_TYPING), e5qVar, eudVar);
        }
        return null;
    }

    @Override // xwl.a, defpackage.xwl
    public eud<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, fh2 fh2Var) {
        javaType.getRawClass();
        return null;
    }
}
