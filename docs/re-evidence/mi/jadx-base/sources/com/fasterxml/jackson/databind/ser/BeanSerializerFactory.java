package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import defpackage.a4h;
import defpackage.ak4;
import defpackage.c5q;
import defpackage.dqk;
import defpackage.e5q;
import defpackage.eud;
import defpackage.fh2;
import defpackage.h04;
import defpackage.ih2;
import defpackage.kh2;
import defpackage.lh2;
import defpackage.mdi;
import defpackage.qd1;
import defpackage.vwl;
import defpackage.wwl;
import defpackage.xwl;
import defpackage.z3h;
import defpackage.zm9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class BeanSerializerFactory extends BasicSerializerFactory implements Serializable {
    public static final BeanSerializerFactory instance = new BeanSerializerFactory(null);
    private static final long serialVersionUID = 1;

    public BeanSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        super(serializerFactoryConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeanPropertyWriter _constructWriter(wwl wwlVar, ih2 ih2Var, mdi mdiVar, boolean z, AnnotatedMember annotatedMember) throws JsonMappingException {
        PropertyName fullName = ih2Var.getFullName();
        JavaType type = annotatedMember.getType();
        BeanProperty.Std std = new BeanProperty.Std(fullName, type, ih2Var.getWrapperName(), annotatedMember, ih2Var.getMetadata());
        eud<Object> eudVarFindSerializerFromAnnotation = findSerializerFromAnnotation(wwlVar, annotatedMember);
        if (eudVarFindSerializerFromAnnotation instanceof dqk) {
            ((dqk) eudVarFindSerializerFromAnnotation).resolve(wwlVar);
        }
        return mdiVar.b(wwlVar, ih2Var, type, wwlVar.handlePrimaryContextualization(eudVarFindSerializerFromAnnotation, std), findPropertyTypeSerializer(type, wwlVar.getConfig(), annotatedMember), (type.isContainerType() || type.isReferenceType()) ? findPropertyContentTypeSerializer(type, wwlVar.getConfig(), annotatedMember) : null, annotatedMember, z);
    }

    public eud<?> _createSerializer2(wwl wwlVar, JavaType javaType, fh2 fh2Var, boolean z) throws JsonMappingException {
        eud<?> eudVarFindSerializerByAnnotations;
        SerializationConfig config = wwlVar.getConfig();
        eud<?> eudVarFindSerializer = null;
        if (javaType.isContainerType()) {
            if (!z) {
                z = usesStaticTyping(config, fh2Var, null);
            }
            eudVarFindSerializerByAnnotations = buildContainerSerializer(wwlVar, javaType, fh2Var, z);
            if (eudVarFindSerializerByAnnotations != null) {
                return eudVarFindSerializerByAnnotations;
            }
        } else {
            if (javaType.isReferenceType()) {
                eudVarFindSerializerByAnnotations = findReferenceSerializer(wwlVar, (ReferenceType) javaType, fh2Var, z);
            } else {
                Iterator<xwl> it = customSerializers().iterator();
                while (it.hasNext() && (eudVarFindSerializer = it.next().findSerializer(config, javaType, fh2Var)) == null) {
                }
                eudVarFindSerializerByAnnotations = eudVarFindSerializer;
            }
            if (eudVarFindSerializerByAnnotations == null) {
                eudVarFindSerializerByAnnotations = findSerializerByAnnotations(wwlVar, javaType, fh2Var);
            }
        }
        if (eudVarFindSerializerByAnnotations == null && (eudVarFindSerializerByAnnotations = findSerializerByLookup(javaType, config, fh2Var, z)) == null && (eudVarFindSerializerByAnnotations = findSerializerByPrimaryType(wwlVar, javaType, fh2Var, z)) == null && (eudVarFindSerializerByAnnotations = findBeanSerializer(wwlVar, javaType, fh2Var)) == null && (eudVarFindSerializerByAnnotations = findSerializerByAddonType(config, javaType, fh2Var, z)) == null) {
            eudVarFindSerializerByAnnotations = wwlVar.getUnknownTypeSerializer(fh2Var.s());
        }
        if (eudVarFindSerializerByAnnotations != null && this._factoryConfig.hasSerializerModifiers()) {
            Iterator<lh2> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                eudVarFindSerializerByAnnotations = it2.next().i(config, fh2Var, eudVarFindSerializerByAnnotations);
            }
        }
        return eudVarFindSerializerByAnnotations;
    }

    public eud<Object> constructBeanSerializer(wwl wwlVar, fh2 fh2Var) throws JsonMappingException {
        eud<?> eudVarA;
        if (fh2Var.s() == Object.class) {
            return wwlVar.getUnknownTypeSerializer(Object.class);
        }
        SerializationConfig config = wwlVar.getConfig();
        kh2 kh2VarConstructBeanSerializerBuilder = constructBeanSerializerBuilder(fh2Var);
        kh2VarConstructBeanSerializerBuilder.j(config);
        List<BeanPropertyWriter> listFindBeanProperties = findBeanProperties(wwlVar, fh2Var, kh2VarConstructBeanSerializerBuilder);
        List<BeanPropertyWriter> arrayList = listFindBeanProperties == null ? new ArrayList<>() : removeOverlappingTypeIds(wwlVar, fh2Var, kh2VarConstructBeanSerializerBuilder, listFindBeanProperties);
        wwlVar.getAnnotationIntrospector().findAndAddVirtualProperties(config, fh2Var.u(), arrayList);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<lh2> it = this._factoryConfig.serializerModifiers().iterator();
            while (it.hasNext()) {
                arrayList = it.next().a(config, fh2Var, arrayList);
            }
        }
        List<BeanPropertyWriter> listFilterBeanProperties = filterBeanProperties(config, fh2Var, arrayList);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<lh2> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                listFilterBeanProperties = it2.next().j(config, fh2Var, listFilterBeanProperties);
            }
        }
        kh2VarConstructBeanSerializerBuilder.m(constructObjectIdHandler(wwlVar, fh2Var, listFilterBeanProperties));
        kh2VarConstructBeanSerializerBuilder.n(listFilterBeanProperties);
        kh2VarConstructBeanSerializerBuilder.k(findFilterId(config, fh2Var));
        AnnotatedMember annotatedMemberA = fh2Var.a();
        if (annotatedMemberA != null) {
            JavaType type = annotatedMemberA.getType();
            boolean zIsEnabled = config.isEnabled(MapperFeature.USE_STATIC_TYPING);
            JavaType contentType = type.getContentType();
            e5q e5qVarCreateTypeSerializer = createTypeSerializer(config, contentType);
            eud<Object> eudVarFindSerializerFromAnnotation = findSerializerFromAnnotation(wwlVar, annotatedMemberA);
            if (eudVarFindSerializerFromAnnotation == null) {
                eudVarFindSerializerFromAnnotation = MapSerializer.construct((Set<String>) null, type, zIsEnabled, e5qVarCreateTypeSerializer, (eud<Object>) null, (eud<Object>) null, (Object) null);
            }
            kh2VarConstructBeanSerializerBuilder.i(new qd1(new BeanProperty.Std(PropertyName.construct(annotatedMemberA.getName()), contentType, null, annotatedMemberA, PropertyMetadata.STD_OPTIONAL), annotatedMemberA, eudVarFindSerializerFromAnnotation));
        }
        processViews(config, kh2VarConstructBeanSerializerBuilder);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<lh2> it3 = this._factoryConfig.serializerModifiers().iterator();
            while (it3.hasNext()) {
                kh2VarConstructBeanSerializerBuilder = it3.next().k(config, fh2Var, kh2VarConstructBeanSerializerBuilder);
            }
        }
        try {
            eudVarA = kh2VarConstructBeanSerializerBuilder.a();
        } catch (RuntimeException e) {
            wwlVar.reportBadTypeDefinition(fh2Var, "Failed to construct BeanSerializer for %s: (%s) %s", fh2Var.z(), e.getClass().getName(), e.getMessage());
            eudVarA = null;
        }
        return (eudVarA == null && fh2Var.A()) ? kh2VarConstructBeanSerializerBuilder.b() : eudVarA;
    }

    public kh2 constructBeanSerializerBuilder(fh2 fh2Var) {
        return new kh2(fh2Var);
    }

    public BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        return zm9.a(beanPropertyWriter, clsArr);
    }

    public a4h constructObjectIdHandler(wwl wwlVar, fh2 fh2Var, List<BeanPropertyWriter> list) throws JsonMappingException {
        z3h z3hVarY = fh2Var.y();
        if (z3hVarY == null) {
            return null;
        }
        Class<? extends ObjectIdGenerator<?>> clsC = z3hVarY.c();
        if (clsC != ObjectIdGenerators$PropertyGenerator.class) {
            return a4h.a(wwlVar.getTypeFactory().findTypeParameters(wwlVar.constructType(clsC), ObjectIdGenerator.class)[0], z3hVarY.d(), wwlVar.objectIdGeneratorInstance(fh2Var.u(), z3hVarY), z3hVarY.b());
        }
        String simpleName = z3hVarY.d().getSimpleName();
        int size = list.size();
        for (int i = 0; i != size; i++) {
            BeanPropertyWriter beanPropertyWriter = list.get(i);
            if (simpleName.equals(beanPropertyWriter.getName())) {
                if (i > 0) {
                    list.remove(i);
                    list.add(0, beanPropertyWriter);
                }
                return a4h.a(beanPropertyWriter.getType(), null, new PropertyBasedObjectIdGenerator(z3hVarY, beanPropertyWriter), z3hVarY.b());
            }
        }
        throw new IllegalArgumentException("Invalid Object Id definition for " + fh2Var.s().getName() + ": cannot find property with name '" + simpleName + "'");
    }

    public mdi constructPropertyBuilder(SerializationConfig serializationConfig, fh2 fh2Var) {
        return new mdi(serializationConfig, fh2Var);
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory, defpackage.vwl
    public eud<Object> createSerializer(wwl wwlVar, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeRefineSerializationType;
        SerializationConfig config = wwlVar.getConfig();
        fh2 fh2VarIntrospect = config.introspect(javaType);
        eud<?> eudVarFindSerializerFromAnnotation = findSerializerFromAnnotation(wwlVar, fh2VarIntrospect.u());
        if (eudVarFindSerializerFromAnnotation != null) {
            return eudVarFindSerializerFromAnnotation;
        }
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        boolean z = false;
        if (annotationIntrospector == null) {
            javaTypeRefineSerializationType = javaType;
        } else {
            try {
                javaTypeRefineSerializationType = annotationIntrospector.refineSerializationType(config, fh2VarIntrospect.u(), javaType);
            } catch (JsonMappingException e) {
                return (eud) wwlVar.reportBadTypeDefinition(fh2VarIntrospect, e.getMessage(), new Object[0]);
            }
        }
        if (javaTypeRefineSerializationType != javaType) {
            if (!javaTypeRefineSerializationType.hasRawClass(javaType.getRawClass())) {
                fh2VarIntrospect = config.introspect(javaTypeRefineSerializationType);
            }
            z = true;
        }
        ak4<Object, Object> ak4VarQ = fh2VarIntrospect.q();
        if (ak4VarQ == null) {
            return _createSerializer2(wwlVar, javaTypeRefineSerializationType, fh2VarIntrospect, z);
        }
        JavaType javaTypeB = ak4VarQ.b(wwlVar.getTypeFactory());
        if (!javaTypeB.hasRawClass(javaTypeRefineSerializationType.getRawClass())) {
            fh2VarIntrospect = config.introspect(javaTypeB);
            eudVarFindSerializerFromAnnotation = findSerializerFromAnnotation(wwlVar, fh2VarIntrospect.u());
        }
        if (eudVarFindSerializerFromAnnotation == null && !javaTypeB.isJavaLangObject()) {
            eudVarFindSerializerFromAnnotation = _createSerializer2(wwlVar, javaTypeB, fh2VarIntrospect, true);
        }
        return new StdDelegatingSerializer(ak4VarQ, javaTypeB, eudVarFindSerializerFromAnnotation);
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    public Iterable<xwl> customSerializers() {
        return this._factoryConfig.serializers();
    }

    public List<BeanPropertyWriter> filterBeanProperties(SerializationConfig serializationConfig, fh2 fh2Var, List<BeanPropertyWriter> list) {
        JsonIgnoreProperties.Value defaultPropertyIgnorals = serializationConfig.getDefaultPropertyIgnorals(fh2Var.s(), fh2Var.u());
        if (defaultPropertyIgnorals != null) {
            Set<String> setFindIgnoredForSerialization = defaultPropertyIgnorals.findIgnoredForSerialization();
            if (!setFindIgnoredForSerialization.isEmpty()) {
                Iterator<BeanPropertyWriter> it = list.iterator();
                while (it.hasNext()) {
                    if (setFindIgnoredForSerialization.contains(it.next().getName())) {
                        it.remove();
                    }
                }
            }
        }
        return list;
    }

    public List<BeanPropertyWriter> findBeanProperties(wwl wwlVar, fh2 fh2Var, kh2 kh2Var) throws JsonMappingException {
        List<ih2> listO = fh2Var.o();
        SerializationConfig config = wwlVar.getConfig();
        removeIgnorableTypes(config, fh2Var, listO);
        if (config.isEnabled(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS)) {
            removeSetterlessGetters(config, fh2Var, listO);
        }
        if (listO.isEmpty()) {
            return null;
        }
        boolean zUsesStaticTyping = usesStaticTyping(config, fh2Var, null);
        mdi mdiVarConstructPropertyBuilder = constructPropertyBuilder(config, fh2Var);
        ArrayList arrayList = new ArrayList(listO.size());
        for (ih2 ih2Var : listO) {
            AnnotatedMember annotatedMemberK = ih2Var.k();
            if (!ih2Var.E()) {
                AnnotationIntrospector.ReferenceProperty referencePropertyH = ih2Var.h();
                if (referencePropertyH == null || !referencePropertyH.c()) {
                    if (annotatedMemberK instanceof AnnotatedMethod) {
                        arrayList.add(_constructWriter(wwlVar, ih2Var, mdiVarConstructPropertyBuilder, zUsesStaticTyping, (AnnotatedMethod) annotatedMemberK));
                    } else {
                        arrayList.add(_constructWriter(wwlVar, ih2Var, mdiVarConstructPropertyBuilder, zUsesStaticTyping, (AnnotatedField) annotatedMemberK));
                    }
                }
            } else if (annotatedMemberK != null) {
                kh2Var.o(annotatedMemberK);
            }
        }
        return arrayList;
    }

    public eud<Object> findBeanSerializer(wwl wwlVar, JavaType javaType, fh2 fh2Var) throws JsonMappingException {
        if (isPotentialBeanType(javaType.getRawClass()) || javaType.isEnumType()) {
            return constructBeanSerializer(wwlVar, fh2Var);
        }
        return null;
    }

    public e5q findPropertyContentTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) throws JsonMappingException {
        JavaType contentType = javaType.getContentType();
        c5q<?> c5qVarFindPropertyContentTypeResolver = serializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(serializationConfig, annotatedMember, javaType);
        return c5qVarFindPropertyContentTypeResolver == null ? createTypeSerializer(serializationConfig, contentType) : c5qVarFindPropertyContentTypeResolver.buildTypeSerializer(serializationConfig, contentType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, annotatedMember, contentType));
    }

    public e5q findPropertyTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) throws JsonMappingException {
        c5q<?> c5qVarFindPropertyTypeResolver = serializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(serializationConfig, annotatedMember, javaType);
        return c5qVarFindPropertyTypeResolver == null ? createTypeSerializer(serializationConfig, javaType) : c5qVarFindPropertyTypeResolver.buildTypeSerializer(serializationConfig, javaType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, annotatedMember, javaType));
    }

    public boolean isPotentialBeanType(Class<?> cls) {
        return h04.e(cls) == null && !h04.R(cls);
    }

    public void processViews(SerializationConfig serializationConfig, kh2 kh2Var) {
        List<BeanPropertyWriter> listG = kh2Var.g();
        boolean zIsEnabled = serializationConfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        int size = listG.size();
        BeanPropertyWriter[] beanPropertyWriterArr = new BeanPropertyWriter[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            BeanPropertyWriter beanPropertyWriter = listG.get(i2);
            Class<?>[] views = beanPropertyWriter.getViews();
            if (views != null) {
                i++;
                beanPropertyWriterArr[i2] = constructFilteredBeanWriter(beanPropertyWriter, views);
            } else if (zIsEnabled) {
                beanPropertyWriterArr[i2] = beanPropertyWriter;
            }
        }
        if (zIsEnabled && i == 0) {
            return;
        }
        kh2Var.l(beanPropertyWriterArr);
    }

    public void removeIgnorableTypes(SerializationConfig serializationConfig, fh2 fh2Var, List<ih2> list) {
        AnnotationIntrospector annotationIntrospector = serializationConfig.getAnnotationIntrospector();
        HashMap map = new HashMap();
        Iterator<ih2> it = list.iterator();
        while (it.hasNext()) {
            ih2 next = it.next();
            if (next.k() == null) {
                it.remove();
            } else {
                Class<?> clsW = next.w();
                Boolean isIgnoredType = (Boolean) map.get(clsW);
                if (isIgnoredType == null) {
                    isIgnoredType = serializationConfig.getConfigOverride(clsW).getIsIgnoredType();
                    if (isIgnoredType == null && (isIgnoredType = annotationIntrospector.isIgnorableType(serializationConfig.introspectClassAnnotations(clsW).u())) == null) {
                        isIgnoredType = Boolean.FALSE;
                    }
                    map.put(clsW, isIgnoredType);
                }
                if (isIgnoredType.booleanValue()) {
                    it.remove();
                }
            }
        }
    }

    public List<BeanPropertyWriter> removeOverlappingTypeIds(wwl wwlVar, fh2 fh2Var, kh2 kh2Var, List<BeanPropertyWriter> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            BeanPropertyWriter beanPropertyWriter = list.get(i);
            e5q typeSerializer = beanPropertyWriter.getTypeSerializer();
            if (typeSerializer != null && typeSerializer.c() == JsonTypeInfo.As.EXTERNAL_PROPERTY) {
                PropertyName propertyNameConstruct = PropertyName.construct(typeSerializer.b());
                for (BeanPropertyWriter beanPropertyWriter2 : list) {
                    if (beanPropertyWriter2 != beanPropertyWriter && beanPropertyWriter2.wouldConflictWithName(propertyNameConstruct)) {
                        beanPropertyWriter.assignTypeSerializer(null);
                        break;
                    }
                }
            }
        }
        return list;
    }

    public void removeSetterlessGetters(SerializationConfig serializationConfig, fh2 fh2Var, List<ih2> list) {
        Iterator<ih2> it = list.iterator();
        while (it.hasNext()) {
            ih2 next = it.next();
            if (!next.a() && !next.C()) {
                it.remove();
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    public vwl withConfig(SerializerFactoryConfig serializerFactoryConfig) {
        if (this._factoryConfig == serializerFactoryConfig) {
            return this;
        }
        if (getClass() == BeanSerializerFactory.class) {
            return new BeanSerializerFactory(serializerFactoryConfig);
        }
        throw new IllegalStateException("Subtype of BeanSerializerFactory (" + getClass().getName() + ") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with additional serializer definitions");
    }
}
