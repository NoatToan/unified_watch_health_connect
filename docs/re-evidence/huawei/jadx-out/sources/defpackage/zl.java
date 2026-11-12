package defpackage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class zl implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final HashMap<JavaType, JsonDeserializer<Object>> f54259a;
    protected final aia<JavaType, JsonDeserializer<Object>> e;

    public zl() {
        this(2000);
    }

    public zl(int i) {
        this.f54259a = new HashMap<>(8);
        this.e = new aia<>(Math.min(64, i >> 2), i);
    }

    Object writeReplace() {
        this.f54259a.clear();
        return this;
    }

    public JsonDeserializer<Object> b(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) throws ym {
        JsonDeserializer<Object> jsonDeserializerA = a(javaType);
        if (jsonDeserializerA != null) {
            return jsonDeserializerA;
        }
        JsonDeserializer<Object> jsonDeserializerE = e(deserializationContext, deserializerFactory, javaType);
        return jsonDeserializerE == null ? d(deserializationContext, javaType) : jsonDeserializerE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyDeserializer d(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) throws ym {
        KeyDeserializer keyDeserializerCreateKeyDeserializer = deserializerFactory.createKeyDeserializer(deserializationContext, javaType);
        if (keyDeserializerCreateKeyDeserializer == 0) {
            return b(deserializationContext, javaType);
        }
        if (keyDeserializerCreateKeyDeserializer instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) keyDeserializerCreateKeyDeserializer).resolve(deserializationContext);
        }
        return keyDeserializerCreateKeyDeserializer;
    }

    public boolean h(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) throws ym {
        JsonDeserializer<Object> jsonDeserializerA = a(javaType);
        if (jsonDeserializerA == null) {
            jsonDeserializerA = e(deserializationContext, deserializerFactory, javaType);
        }
        return jsonDeserializerA != null;
    }

    protected JsonDeserializer<Object> a(JavaType javaType) {
        if (javaType == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        }
        if (c(javaType)) {
            return null;
        }
        return this.e.get(javaType);
    }

    protected JsonDeserializer<Object> e(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) throws ym {
        JsonDeserializer<Object> jsonDeserializer;
        synchronized (this.f54259a) {
            JsonDeserializer<Object> jsonDeserializerA = a(javaType);
            if (jsonDeserializerA != null) {
                return jsonDeserializerA;
            }
            int size = this.f54259a.size();
            if (size > 0 && (jsonDeserializer = this.f54259a.get(javaType)) != null) {
                return jsonDeserializer;
            }
            try {
                JsonDeserializer<Object> jsonDeserializerA2 = a(deserializationContext, deserializerFactory, javaType);
                if (size == 0 && this.f54259a.size() > 0) {
                    this.f54259a.clear();
                }
                return jsonDeserializerA2;
            } catch (Throwable th) {
                if (size == 0 && this.f54259a.size() > 0) {
                    this.f54259a.clear();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected JsonDeserializer<Object> a(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) throws ym {
        try {
            JsonDeserializer<Object> jsonDeserializerC = c(deserializationContext, deserializerFactory, javaType);
            if (jsonDeserializerC == 0) {
                return null;
            }
            boolean z = !c(javaType) && jsonDeserializerC.isCachable();
            if (jsonDeserializerC instanceof ResolvableDeserializer) {
                this.f54259a.put(javaType, jsonDeserializerC);
                ((ResolvableDeserializer) jsonDeserializerC).resolve(deserializationContext);
                this.f54259a.remove(javaType);
            }
            if (z) {
                this.e.put(javaType, jsonDeserializerC);
            }
            return jsonDeserializerC;
        } catch (IllegalArgumentException e) {
            throw ym.from(deserializationContext, ahw.a((Throwable) e), e);
        }
    }

    protected JsonDeserializer<Object> c(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) throws ym {
        yi config = deserializationContext.getConfig();
        if (javaType.isAbstract() || javaType.isMapLikeType() || javaType.isCollectionLikeType()) {
            javaType = deserializerFactory.mapAbstractType(config, javaType);
        }
        BeanDescription beanDescriptionE = config.e(javaType);
        JsonDeserializer<Object> jsonDeserializerE = e(deserializationContext, beanDescriptionE.getClassInfo());
        if (jsonDeserializerE != null) {
            return jsonDeserializerE;
        }
        JavaType javaTypeD = d(deserializationContext, beanDescriptionE.getClassInfo(), javaType);
        if (javaTypeD != javaType) {
            beanDescriptionE = config.e(javaTypeD);
            javaType = javaTypeD;
        }
        Class<?> clsFindPOJOBuilder = beanDescriptionE.findPOJOBuilder();
        if (clsFindPOJOBuilder != null) {
            return deserializerFactory.createBuilderBasedDeserializer(deserializationContext, javaType, beanDescriptionE, clsFindPOJOBuilder);
        }
        Converter<Object, Object> converterFindDeserializationConverter = beanDescriptionE.findDeserializationConverter();
        if (converterFindDeserializationConverter == null) {
            return a(deserializationContext, deserializerFactory, javaType, beanDescriptionE);
        }
        JavaType inputType = converterFindDeserializationConverter.getInputType(deserializationContext.getTypeFactory());
        if (!inputType.hasRawClass(javaType.getRawClass())) {
            beanDescriptionE = config.e(inputType);
        }
        return new abi(converterFindDeserializationConverter, inputType, a(deserializationContext, deserializerFactory, inputType, beanDescriptionE));
    }

    protected JsonDeserializer<?> a(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType, BeanDescription beanDescription) throws ym {
        yi config = deserializationContext.getConfig();
        if (javaType.isEnumType()) {
            return deserializerFactory.createEnumDeserializer(deserializationContext, javaType, beanDescription);
        }
        if (javaType.isContainerType()) {
            if (javaType.isArrayType()) {
                return deserializerFactory.createArrayDeserializer(deserializationContext, (ahe) javaType, beanDescription);
            }
            if (javaType.isMapLikeType() && beanDescription.findExpectedFormat(null).b() != JsonFormat.Shape.OBJECT) {
                ahk ahkVar = (ahk) javaType;
                if (ahkVar instanceof ahh) {
                    return deserializerFactory.createMapDeserializer(deserializationContext, (ahh) ahkVar, beanDescription);
                }
                return deserializerFactory.createMapLikeDeserializer(deserializationContext, ahkVar, beanDescription);
            }
            if (javaType.isCollectionLikeType() && beanDescription.findExpectedFormat(null).b() != JsonFormat.Shape.OBJECT) {
                ahb ahbVar = (ahb) javaType;
                if (ahbVar instanceof ahg) {
                    return deserializerFactory.createCollectionDeserializer(deserializationContext, (ahg) ahbVar, beanDescription);
                }
                return deserializerFactory.createCollectionLikeDeserializer(deserializationContext, ahbVar, beanDescription);
            }
        }
        if (javaType.isReferenceType()) {
            return deserializerFactory.createReferenceDeserializer(deserializationContext, (ahi) javaType, beanDescription);
        }
        if (JsonNode.class.isAssignableFrom(javaType.getRawClass())) {
            return deserializerFactory.createTreeDeserializer(config, javaType, beanDescription);
        }
        return deserializerFactory.createBeanDeserializer(deserializationContext, javaType, beanDescription);
    }

    protected JsonDeserializer<Object> e(DeserializationContext deserializationContext, Annotated annotated) throws ym {
        Object objFindDeserializer = deserializationContext.getAnnotationIntrospector().findDeserializer(annotated);
        if (objFindDeserializer == null) {
            return null;
        }
        return e(deserializationContext, annotated, deserializationContext.deserializerInstance(annotated, objFindDeserializer));
    }

    protected JsonDeserializer<Object> e(DeserializationContext deserializationContext, Annotated annotated, JsonDeserializer<Object> jsonDeserializer) throws ym {
        Converter<Object, Object> converterA = a(deserializationContext, annotated);
        return converterA == null ? jsonDeserializer : new abi(converterA, converterA.getInputType(deserializationContext.getTypeFactory()), jsonDeserializer);
    }

    protected Converter<Object, Object> a(DeserializationContext deserializationContext, Annotated annotated) throws ym {
        Object objFindDeserializationConverter = deserializationContext.getAnnotationIntrospector().findDeserializationConverter(annotated);
        if (objFindDeserializationConverter == null) {
            return null;
        }
        return deserializationContext.converterInstance(annotated, objFindDeserializationConverter);
    }

    private JavaType d(DeserializationContext deserializationContext, Annotated annotated, JavaType javaType) throws ym {
        Object objFindContentDeserializer;
        JsonDeserializer<Object> jsonDeserializerDeserializerInstance;
        JavaType keyType;
        Object objFindKeyDeserializer;
        KeyDeserializer keyDeserializerKeyDeserializerInstance;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (javaType.isMapLikeType() && (keyType = javaType.getKeyType()) != null && keyType.getValueHandler() == null && (objFindKeyDeserializer = annotationIntrospector.findKeyDeserializer(annotated)) != null && (keyDeserializerKeyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotated, objFindKeyDeserializer)) != null) {
            javaType = ((ahk) javaType).c(keyDeserializerKeyDeserializerInstance);
        }
        JavaType contentType = javaType.getContentType();
        if (contentType != null && contentType.getValueHandler() == null && (objFindContentDeserializer = annotationIntrospector.findContentDeserializer(annotated)) != null) {
            if (objFindContentDeserializer instanceof JsonDeserializer) {
                jsonDeserializerDeserializerInstance = (JsonDeserializer) objFindContentDeserializer;
            } else {
                Class<?> clsC = c(objFindContentDeserializer, "findContentDeserializer", JsonDeserializer.None.class);
                jsonDeserializerDeserializerInstance = clsC != null ? deserializationContext.deserializerInstance(annotated, clsC) : null;
            }
            if (jsonDeserializerDeserializerInstance != null) {
                javaType = javaType.withContentValueHandler(jsonDeserializerDeserializerInstance);
            }
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotated, javaType);
    }

    private boolean c(JavaType javaType) {
        if (!javaType.isContainerType()) {
            return false;
        }
        JavaType contentType = javaType.getContentType();
        if (contentType == null || (contentType.getValueHandler() == null && contentType.getTypeHandler() == null)) {
            return javaType.isMapLikeType() && javaType.getKeyType().getValueHandler() != null;
        }
        return true;
    }

    private Class<?> c(Object obj, String str, Class<?> cls) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector." + str + "() returned value of type " + obj.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
        }
        Class<?> cls2 = (Class) obj;
        if (cls2 == cls || ahw.l(cls2)) {
            return null;
        }
        return cls2;
    }

    protected JsonDeserializer<Object> d(DeserializationContext deserializationContext, JavaType javaType) throws ym {
        if (!ahw.o(javaType.getRawClass())) {
            return (JsonDeserializer) deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for abstract type " + javaType);
        }
        return (JsonDeserializer) deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for type " + javaType);
    }

    protected KeyDeserializer b(DeserializationContext deserializationContext, JavaType javaType) throws ym {
        return (KeyDeserializer) deserializationContext.reportBadDefinition(javaType, "Cannot find a (Map) Key deserializer for type " + javaType);
    }
}
