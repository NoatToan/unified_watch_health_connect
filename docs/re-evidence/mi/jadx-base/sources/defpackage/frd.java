package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.xiaomi.common.Optional;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class frd extends u4q {
    @Override // defpackage.u4q
    public JavaType a(JavaType javaType, Type type, TypeBindings typeBindings, TypeFactory typeFactory) {
        return (javaType.isReferenceType() || javaType.isContainerType() || javaType.getRawClass() != Optional.class) ? javaType : ReferenceType.upgradeFrom(javaType, javaType.containedTypeOrUnknown(0));
    }
}
