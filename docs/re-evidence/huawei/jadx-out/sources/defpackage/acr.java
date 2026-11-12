package defpackage;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class acr extends ClassIntrospector implements Serializable {
    private static final long serialVersionUID = 2;
    private static final Class<?> h = Object.class;
    private static final Class<?> g = String.class;
    private static final Class<?> i = JsonNode.class;
    protected static final acq d = acq.c(null, ahl.c((Class<?>) String.class), acg.c(String.class));
    protected static final acq e = acq.c(null, ahl.c((Class<?>) Boolean.TYPE), acg.c(Boolean.TYPE));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final acq f267b = acq.c(null, ahl.c((Class<?>) Integer.TYPE), acg.c(Integer.TYPE));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final acq f266a = acq.c(null, ahl.c((Class<?>) Long.TYPE), acg.c(Long.TYPE));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final acq f268c = acq.c(null, ahl.c((Class<?>) Object.class), acg.c(Object.class));

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    public /* synthetic */ BeanDescription forDirectClassAnnotations(MapperConfig mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        return a((MapperConfig<?>) mapperConfig, javaType, mixInResolver);
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    public ClassIntrospector copy() {
        return new acr();
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public acq forSerialization(yt ytVar, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        acq acqVarA = a(ytVar, javaType);
        return (acqVarA == null && (acqVarA = d(ytVar, javaType)) == null) ? acq.c(b(ytVar, javaType, mixInResolver, true)) : acqVarA;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public acq forDeserialization(yi yiVar, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        acq acqVarA = a(yiVar, javaType);
        return (acqVarA == null && (acqVarA = d(yiVar, javaType)) == null) ? acq.a(b(yiVar, javaType, mixInResolver, false)) : acqVarA;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public acq forDeserializationWithBuilder(yi yiVar, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver, BeanDescription beanDescription) {
        return acq.a(e((MapperConfig<?>) yiVar, javaType, mixInResolver, beanDescription, false));
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    @Deprecated
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public acq forDeserializationWithBuilder(yi yiVar, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        return acq.a(e((MapperConfig<?>) yiVar, javaType, mixInResolver, (BeanDescription) null, false));
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public acq forCreation(yi yiVar, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        acq acqVarA = a(yiVar, javaType);
        return (acqVarA == null && (acqVarA = d(yiVar, javaType)) == null) ? acq.a(b(yiVar, javaType, mixInResolver, false)) : acqVarA;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public acq forClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        acq acqVarA = a(mapperConfig, javaType);
        return acqVarA == null ? acq.c(mapperConfig, javaType, c(mapperConfig, javaType, mixInResolver)) : acqVarA;
    }

    public acq a(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        acq acqVarA = a(mapperConfig, javaType);
        return acqVarA == null ? acq.c(mapperConfig, javaType, e(mapperConfig, javaType, mixInResolver)) : acqVarA;
    }

    protected acx b(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver, boolean z) {
        AccessorNamingStrategy accessorNamingStrategyForPOJO;
        ack ackVarC = c(mapperConfig, javaType, mixInResolver);
        if (javaType.isRecordType()) {
            accessorNamingStrategyForPOJO = mapperConfig.getAccessorNaming().forRecord(mapperConfig, ackVarC);
        } else {
            accessorNamingStrategyForPOJO = mapperConfig.getAccessorNaming().forPOJO(mapperConfig, ackVarC);
        }
        return e(mapperConfig, ackVarC, javaType, z, accessorNamingStrategyForPOJO);
    }

    protected acx e(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver, BeanDescription beanDescription, boolean z) {
        ack ackVarC = c(mapperConfig, javaType, mixInResolver);
        return e(mapperConfig, ackVarC, javaType, z, mapperConfig.getAccessorNaming().forBuilder(mapperConfig, ackVarC, beanDescription));
    }

    protected acx e(MapperConfig<?> mapperConfig, ack ackVar, JavaType javaType, boolean z, AccessorNamingStrategy accessorNamingStrategy) {
        return new acx(mapperConfig, z, javaType, ackVar, accessorNamingStrategy);
    }

    protected acq a(MapperConfig<?> mapperConfig, JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass.isPrimitive()) {
            if (rawClass == Integer.TYPE) {
                return f267b;
            }
            if (rawClass == Long.TYPE) {
                return f266a;
            }
            if (rawClass == Boolean.TYPE) {
                return e;
            }
            return null;
        }
        if (ahw.n(rawClass)) {
            if (rawClass == h) {
                return f268c;
            }
            if (rawClass == g) {
                return d;
            }
            if (rawClass == Integer.class) {
                return f267b;
            }
            if (rawClass == Long.class) {
                return f266a;
            }
            if (rawClass == Boolean.class) {
                return e;
            }
            return null;
        }
        if (i.isAssignableFrom(rawClass)) {
            return acq.c(mapperConfig, javaType, acg.c(rawClass));
        }
        return null;
    }

    protected boolean e(JavaType javaType) {
        if (!javaType.isContainerType() || javaType.isArrayType()) {
            return false;
        }
        Class<?> rawClass = javaType.getRawClass();
        if (ahw.n(rawClass)) {
            return Collection.class.isAssignableFrom(rawClass) || Map.class.isAssignableFrom(rawClass);
        }
        return false;
    }

    protected acq d(MapperConfig<?> mapperConfig, JavaType javaType) {
        if (e(javaType)) {
            return acq.c(mapperConfig, javaType, c(mapperConfig, javaType, mapperConfig));
        }
        return null;
    }

    protected ack c(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        return acg.d(mapperConfig, javaType, mixInResolver);
    }

    protected ack e(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        return acg.c(mapperConfig, javaType, mixInResolver);
    }
}
