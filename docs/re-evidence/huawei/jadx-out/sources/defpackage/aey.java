package defpackage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BasicSerializerFactory;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class aey extends BasicSerializerFactory implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aey f347a = new aey(null);
    private static final long serialVersionUID = 1;

    protected aey(yz yzVar) {
        super(yzVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    public SerializerFactory withConfig(yz yzVar) {
        if (this._factoryConfig == yzVar) {
            return this;
        }
        if (getClass() != aey.class) {
            throw new IllegalStateException("Subtype of BeanSerializerFactory (" + getClass().getName() + ") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with additional serializer definitions");
        }
        return new aey(yzVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    public Iterable<Serializers> customSerializers() {
        return this._factoryConfig.a();
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory, com.fasterxml.jackson.databind.ser.SerializerFactory
    public JsonSerializer<Object> createSerializer(SerializerProvider serializerProvider, JavaType javaType) throws ym {
        JavaType javaTypeRefineSerializationType;
        yt config = serializerProvider.getConfig();
        BeanDescription beanDescriptionD = config.d(javaType);
        JsonSerializer<?> jsonSerializerFindSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, beanDescriptionD.getClassInfo());
        if (jsonSerializerFindSerializerFromAnnotation != null) {
            return jsonSerializerFindSerializerFromAnnotation;
        }
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        boolean z = false;
        if (annotationIntrospector == null) {
            javaTypeRefineSerializationType = javaType;
        } else {
            try {
                javaTypeRefineSerializationType = annotationIntrospector.refineSerializationType(config, beanDescriptionD.getClassInfo(), javaType);
            } catch (ym e) {
                return (JsonSerializer) serializerProvider.reportBadTypeDefinition(beanDescriptionD, e.getMessage(), new Object[0]);
            }
        }
        if (javaTypeRefineSerializationType != javaType) {
            if (!javaTypeRefineSerializationType.hasRawClass(javaType.getRawClass())) {
                beanDescriptionD = config.d(javaTypeRefineSerializationType);
            }
            z = true;
        }
        Converter<Object, Object> converterFindSerializationConverter = beanDescriptionD.findSerializationConverter();
        if (converterFindSerializationConverter == null) {
            return e(serializerProvider, javaTypeRefineSerializationType, beanDescriptionD, z);
        }
        JavaType outputType = converterFindSerializationConverter.getOutputType(serializerProvider.getTypeFactory());
        if (!outputType.hasRawClass(javaTypeRefineSerializationType.getRawClass())) {
            beanDescriptionD = config.d(outputType);
            jsonSerializerFindSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, beanDescriptionD.getClassInfo());
        }
        if (jsonSerializerFindSerializerFromAnnotation == null && !outputType.isJavaLangObject()) {
            jsonSerializerFindSerializerFromAnnotation = e(serializerProvider, outputType, beanDescriptionD, true);
        }
        return new agu(converterFindSerializationConverter, outputType, jsonSerializerFindSerializerFromAnnotation);
    }

    protected JsonSerializer<?> e(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws ym {
        JsonSerializer<?> jsonSerializerFindSerializerByAnnotations;
        yt config = serializerProvider.getConfig();
        JsonSerializer<?> jsonSerializerFindSerializer = null;
        if (javaType.isContainerType()) {
            if (!z) {
                z = usesStaticTyping(config, beanDescription, null);
            }
            jsonSerializerFindSerializerByAnnotations = buildContainerSerializer(serializerProvider, javaType, beanDescription, z);
            if (jsonSerializerFindSerializerByAnnotations != null) {
                return jsonSerializerFindSerializerByAnnotations;
            }
        } else {
            if (javaType.isReferenceType()) {
                jsonSerializerFindSerializerByAnnotations = findReferenceSerializer(serializerProvider, (ahi) javaType, beanDescription, z);
            } else {
                Iterator<Serializers> it = customSerializers().iterator();
                while (it.hasNext() && (jsonSerializerFindSerializer = it.next().findSerializer(config, javaType, beanDescription)) == null) {
                }
                jsonSerializerFindSerializerByAnnotations = jsonSerializerFindSerializer;
            }
            if (jsonSerializerFindSerializerByAnnotations == null) {
                jsonSerializerFindSerializerByAnnotations = findSerializerByAnnotations(serializerProvider, javaType, beanDescription);
            }
        }
        if (jsonSerializerFindSerializerByAnnotations == null && (jsonSerializerFindSerializerByAnnotations = findSerializerByLookup(javaType, config, beanDescription, z)) == null && (jsonSerializerFindSerializerByAnnotations = findSerializerByPrimaryType(serializerProvider, javaType, beanDescription, z)) == null && (jsonSerializerFindSerializerByAnnotations = d(serializerProvider, javaType, beanDescription, z)) == null) {
            jsonSerializerFindSerializerByAnnotations = serializerProvider.getUnknownTypeSerializer(beanDescription.getBeanClass());
        }
        if (jsonSerializerFindSerializerByAnnotations != null && this._factoryConfig.e()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.c().iterator();
            while (it2.hasNext()) {
                jsonSerializerFindSerializerByAnnotations = it2.next().modifySerializer(config, beanDescription, jsonSerializerFindSerializerByAnnotations);
            }
        }
        return jsonSerializerFindSerializerByAnnotations;
    }

    public JsonSerializer<Object> d(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws ym {
        if (d(javaType.getRawClass()) || ahw.m(javaType.getRawClass())) {
            return b(serializerProvider, javaType, beanDescription, z);
        }
        return null;
    }

    public TypeSerializer c(JavaType javaType, yt ytVar, AnnotatedMember annotatedMember) throws ym {
        TypeResolverBuilder<?> typeResolverBuilderFindPropertyTypeResolver = ytVar.getAnnotationIntrospector().findPropertyTypeResolver(ytVar, annotatedMember, javaType);
        if (typeResolverBuilderFindPropertyTypeResolver == null) {
            return createTypeSerializer(ytVar, javaType);
        }
        return typeResolverBuilderFindPropertyTypeResolver.buildTypeSerializer(ytVar, javaType, ytVar.getSubtypeResolver().collectAndResolveSubtypesByClass(ytVar, annotatedMember, javaType));
    }

    public TypeSerializer d(JavaType javaType, yt ytVar, AnnotatedMember annotatedMember) throws ym {
        JavaType contentType = javaType.getContentType();
        TypeResolverBuilder<?> typeResolverBuilderFindPropertyContentTypeResolver = ytVar.getAnnotationIntrospector().findPropertyContentTypeResolver(ytVar, annotatedMember, javaType);
        if (typeResolverBuilderFindPropertyContentTypeResolver == null) {
            return createTypeSerializer(ytVar, contentType);
        }
        return typeResolverBuilderFindPropertyContentTypeResolver.buildTypeSerializer(ytVar, contentType, ytVar.getSubtypeResolver().collectAndResolveSubtypesByClass(ytVar, annotatedMember, contentType));
    }

    protected JsonSerializer<Object> b(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws ym {
        List<aez> listA;
        if (beanDescription.getBeanClass() == Object.class) {
            return serializerProvider.getUnknownTypeSerializer(Object.class);
        }
        JsonSerializer<?> jsonSerializerE = e(serializerProvider, javaType, beanDescription);
        if (jsonSerializerE != null) {
            return jsonSerializerE;
        }
        yt config = serializerProvider.getConfig();
        afa afaVarC = c(beanDescription);
        afaVarC.d(config);
        List<aez> listD = d(serializerProvider, beanDescription, afaVarC);
        if (listD == null) {
            listA = new ArrayList<>();
        } else {
            listA = a(serializerProvider, beanDescription, afaVarC, listD);
        }
        serializerProvider.getAnnotationIntrospector().findAndAddVirtualProperties(config, beanDescription.getClassInfo(), listA);
        if (this._factoryConfig.e()) {
            Iterator<BeanSerializerModifier> it = this._factoryConfig.c().iterator();
            while (it.hasNext()) {
                listA = it.next().changeProperties(config, beanDescription, listA);
            }
        }
        List<aez> listC = c(config, beanDescription, d(config, beanDescription, listA));
        if (this._factoryConfig.e()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.c().iterator();
            while (it2.hasNext()) {
                listC = it2.next().orderProperties(config, beanDescription, listC);
            }
        }
        afaVarC.e(c(serializerProvider, beanDescription, listC));
        afaVarC.e(listC);
        afaVarC.c(findFilterId(config, beanDescription));
        AnnotatedMember annotatedMemberFindAnyGetter = beanDescription.findAnyGetter();
        if (annotatedMemberFindAnyGetter != null) {
            JavaType type = annotatedMemberFindAnyGetter.getType();
            JavaType contentType = type.getContentType();
            TypeSerializer typeSerializerCreateTypeSerializer = createTypeSerializer(config, contentType);
            JsonSerializer<Object> jsonSerializerFindSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, annotatedMemberFindAnyGetter);
            if (jsonSerializerFindSerializerFromAnnotation == null) {
                jsonSerializerFindSerializerFromAnnotation = agq.a(null, type, config.isEnabled(MapperFeature.USE_STATIC_TYPING), typeSerializerCreateTypeSerializer, null, null, null);
            }
            afaVarC.c(new afb(new BeanProperty.d(ys.c(annotatedMemberFindAnyGetter.getName()), contentType, null, annotatedMemberFindAnyGetter, yq.f53745a), annotatedMemberFindAnyGetter, jsonSerializerFindSerializerFromAnnotation));
        }
        c(config, afaVarC);
        if (this._factoryConfig.e()) {
            Iterator<BeanSerializerModifier> it3 = this._factoryConfig.c().iterator();
            while (it3.hasNext()) {
                afaVarC = it3.next().updateBuilder(config, beanDescription, afaVarC);
            }
        }
        try {
            JsonSerializer<?> jsonSerializerE2 = afaVarC.e();
            if (jsonSerializerE2 != null) {
                return jsonSerializerE2;
            }
            if (javaType.isRecordType()) {
                return afaVarC.c();
            }
            JsonSerializer<?> jsonSerializerFindSerializerByAddonType = findSerializerByAddonType(config, javaType, beanDescription, z);
            return (jsonSerializerFindSerializerByAddonType == null && beanDescription.hasKnownClassAnnotations()) ? afaVarC.c() : jsonSerializerFindSerializerByAddonType;
        } catch (RuntimeException e) {
            return (JsonSerializer) serializerProvider.reportBadTypeDefinition(beanDescription, "Failed to construct BeanSerializer for %s: (%s) %s", beanDescription.getType(), e.getClass().getName(), e.getMessage());
        }
    }

    protected afj c(SerializerProvider serializerProvider, BeanDescription beanDescription, List<aez> list) throws ym {
        acv objectIdInfo = beanDescription.getObjectIdInfo();
        if (objectIdInfo == null) {
            return null;
        }
        Class<? extends ObjectIdGenerator<?>> clsE = objectIdInfo.e();
        if (clsE == ObjectIdGenerators.PropertyGenerator.class) {
            String strB = objectIdInfo.c().b();
            int size = list.size();
            for (int i = 0; i != size; i++) {
                aez aezVar = list.get(i);
                if (strB.equals(aezVar.getName())) {
                    if (i > 0) {
                        list.remove(i);
                        list.add(0, aezVar);
                    }
                    return afj.b(aezVar.getType(), null, new afn(objectIdInfo, aezVar), objectIdInfo.b());
                }
            }
            throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", ahw.a(beanDescription.getType()), ahw.e(strB)));
        }
        return afj.b(serializerProvider.getTypeFactory().a(serializerProvider.constructType(clsE), ObjectIdGenerator.class)[0], objectIdInfo.c(), serializerProvider.objectIdGeneratorInstance(beanDescription.getClassInfo(), objectIdInfo), objectIdInfo.b());
    }

    protected aez a(aez aezVar, Class<?>[] clsArr) {
        return FilteredBeanPropertyWriter.constructViewBased(aezVar, clsArr);
    }

    protected afg a(yt ytVar, BeanDescription beanDescription) {
        return new afg(ytVar, beanDescription);
    }

    protected afa c(BeanDescription beanDescription) {
        return new afa(beanDescription);
    }

    protected boolean d(Class<?> cls) {
        return ahw.d(cls) == null && !ahw.p(cls);
    }

    protected List<aez> d(SerializerProvider serializerProvider, BeanDescription beanDescription, afa afaVar) throws ym {
        List<BeanPropertyDefinition> listFindProperties = beanDescription.findProperties();
        yt config = serializerProvider.getConfig();
        e(config, beanDescription, listFindProperties);
        if (config.isEnabled(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS)) {
            a(config, beanDescription, listFindProperties);
        }
        if (listFindProperties.isEmpty()) {
            return null;
        }
        boolean zUsesStaticTyping = usesStaticTyping(config, beanDescription, null);
        afg afgVarA = a(config, beanDescription);
        ArrayList arrayList = new ArrayList(listFindProperties.size());
        for (BeanPropertyDefinition beanPropertyDefinition : listFindProperties) {
            AnnotatedMember accessor = beanPropertyDefinition.getAccessor();
            if (!beanPropertyDefinition.isTypeId()) {
                AnnotationIntrospector.ReferenceProperty referencePropertyFindReferenceType = beanPropertyDefinition.findReferenceType();
                if (referencePropertyFindReferenceType == null || !referencePropertyFindReferenceType.e()) {
                    if (accessor instanceof aco) {
                        arrayList.add(e(serializerProvider, beanPropertyDefinition, afgVarA, zUsesStaticTyping, (aco) accessor));
                    } else {
                        arrayList.add(e(serializerProvider, beanPropertyDefinition, afgVarA, zUsesStaticTyping, (acj) accessor));
                    }
                }
            } else if (accessor != null) {
                afaVar.b(accessor);
            }
        }
        return arrayList;
    }

    protected List<aez> c(yt ytVar, BeanDescription beanDescription, List<aez> list) {
        JsonIgnoreProperties.b defaultPropertyIgnorals = ytVar.getDefaultPropertyIgnorals(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        Set<String> setE = defaultPropertyIgnorals != null ? defaultPropertyIgnorals.e() : null;
        JsonIncludeProperties.b defaultPropertyInclusions = ytVar.getDefaultPropertyInclusions(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        Set<String> setB = defaultPropertyInclusions != null ? defaultPropertyInclusions.b() : null;
        if (setB != null || (setE != null && !setE.isEmpty())) {
            Iterator<aez> it = list.iterator();
            while (it.hasNext()) {
                if (ahy.b(it.next().getName(), setE, setB)) {
                    it.remove();
                }
            }
        }
        return list;
    }

    protected List<aez> d(yt ytVar, BeanDescription beanDescription, List<aez> list) {
        if (beanDescription.getType().isTypeOrSubTypeOf(CharSequence.class)) {
            Iterator<aez> it = list.iterator();
            while (it.hasNext()) {
                AnnotatedMember member = it.next().getMember();
                if ((member instanceof aco) && "isEmpty".equals(member.getName()) && member.getDeclaringClass() == CharSequence.class) {
                    it.remove();
                }
            }
        }
        return list;
    }

    protected void c(yt ytVar, afa afaVar) {
        List<aez> listI = afaVar.i();
        boolean zIsEnabled = ytVar.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        int size = listI.size();
        aez[] aezVarArr = new aez[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            aez aezVar = listI.get(i2);
            Class<?>[] views = aezVar.getViews();
            if (views != null && views.length != 0) {
                i++;
                aezVarArr[i2] = a(aezVar, views);
            } else if (zIsEnabled) {
                aezVarArr[i2] = aezVar;
            }
        }
        if (zIsEnabled && i == 0) {
            return;
        }
        afaVar.b(aezVarArr);
    }

    protected void e(yt ytVar, BeanDescription beanDescription, List<BeanPropertyDefinition> list) {
        AnnotationIntrospector annotationIntrospector = ytVar.getAnnotationIntrospector();
        HashMap map = new HashMap();
        Iterator<BeanPropertyDefinition> it = list.iterator();
        while (it.hasNext()) {
            BeanPropertyDefinition next = it.next();
            if (next.getAccessor() == null) {
                it.remove();
            } else {
                Class<?> rawPrimaryType = next.getRawPrimaryType();
                Boolean isIgnoredType = (Boolean) map.get(rawPrimaryType);
                if (isIgnoredType == null) {
                    isIgnoredType = ytVar.getConfigOverride(rawPrimaryType).getIsIgnoredType();
                    if (isIgnoredType == null && (isIgnoredType = annotationIntrospector.isIgnorableType(ytVar.introspectClassAnnotations(rawPrimaryType).getClassInfo())) == null) {
                        isIgnoredType = Boolean.FALSE;
                    }
                    map.put(rawPrimaryType, isIgnoredType);
                }
                if (isIgnoredType.booleanValue()) {
                    it.remove();
                }
            }
        }
    }

    protected void a(yt ytVar, BeanDescription beanDescription, List<BeanPropertyDefinition> list) {
        Iterator<BeanPropertyDefinition> it = list.iterator();
        while (it.hasNext()) {
            BeanPropertyDefinition next = it.next();
            if (!next.couldDeserialize() && !next.isExplicitlyIncluded()) {
                it.remove();
            }
        }
    }

    protected List<aez> a(SerializerProvider serializerProvider, BeanDescription beanDescription, afa afaVar, List<aez> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aez aezVar = list.get(i);
            TypeSerializer typeSerializer = aezVar.getTypeSerializer();
            if (typeSerializer != null && typeSerializer.getTypeInclusion() == JsonTypeInfo.As.EXTERNAL_PROPERTY) {
                ys ysVarC = ys.c(typeSerializer.getPropertyName());
                for (aez aezVar2 : list) {
                    if (aezVar2 != aezVar && aezVar2.wouldConflictWithName(ysVarC)) {
                        aezVar.assignTypeSerializer(null);
                        break;
                    }
                }
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected aez e(SerializerProvider serializerProvider, BeanPropertyDefinition beanPropertyDefinition, afg afgVar, boolean z, AnnotatedMember annotatedMember) throws ym {
        ys fullName = beanPropertyDefinition.getFullName();
        JavaType type = annotatedMember.getType();
        BeanProperty.d dVar = new BeanProperty.d(fullName, type, beanPropertyDefinition.getWrapperName(), annotatedMember, beanPropertyDefinition.getMetadata());
        JsonSerializer<Object> jsonSerializerFindSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, annotatedMember);
        if (jsonSerializerFindSerializerFromAnnotation instanceof ResolvableSerializer) {
            ((ResolvableSerializer) jsonSerializerFindSerializerFromAnnotation).resolve(serializerProvider);
        }
        return afgVar.c(serializerProvider, beanPropertyDefinition, type, serializerProvider.handlePrimaryContextualization(jsonSerializerFindSerializerFromAnnotation, dVar), c(type, serializerProvider.getConfig(), annotatedMember), (type.isContainerType() || type.isReferenceType()) ? d(type, serializerProvider.getConfig(), annotatedMember) : null, annotatedMember, z);
    }

    protected JsonSerializer<?> e(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription) throws ym {
        String strA = ahr.a(javaType);
        if (strA == null || serializerProvider.getConfig().findMixInClassFor(javaType.getRawClass()) != null) {
            return null;
        }
        return new afw(javaType, strA);
    }
}
