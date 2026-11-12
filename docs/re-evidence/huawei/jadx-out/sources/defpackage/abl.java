package defpackage;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes21.dex */
public class abl implements KeyDeserializers, Serializable {
    private static final long serialVersionUID = 1;

    public static KeyDeserializer c(ahz ahzVar) {
        return new abj.b(ahzVar, null);
    }

    public static KeyDeserializer a(ahz ahzVar, aco acoVar) {
        return new abj.b(ahzVar, acoVar);
    }

    public static KeyDeserializer b(yi yiVar, JavaType javaType, JsonDeserializer<?> jsonDeserializer) {
        return new abj.a(javaType.getRawClass(), jsonDeserializer);
    }

    public static KeyDeserializer d(yi yiVar, JavaType javaType) {
        BeanDescription beanDescriptionE = yiVar.e(javaType);
        Constructor<?> constructorFindSingleArgConstructor = beanDescriptionE.findSingleArgConstructor(String.class);
        if (constructorFindSingleArgConstructor != null) {
            if (yiVar.canOverrideAccessModifiers()) {
                ahw.a(constructorFindSingleArgConstructor, yiVar.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new abj.d(constructorFindSingleArgConstructor);
        }
        Method methodFindFactoryMethod = beanDescriptionE.findFactoryMethod(String.class);
        if (methodFindFactoryMethod == null) {
            return null;
        }
        if (yiVar.canOverrideAccessModifiers()) {
            ahw.a(methodFindFactoryMethod, yiVar.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new abj.e(methodFindFactoryMethod);
    }

    @Override // com.fasterxml.jackson.databind.deser.KeyDeserializers
    public KeyDeserializer findKeyDeserializer(JavaType javaType, yi yiVar, BeanDescription beanDescription) throws ym {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass.isPrimitive()) {
            rawClass = ahw.w(rawClass);
        }
        return abj.d(rawClass);
    }
}
