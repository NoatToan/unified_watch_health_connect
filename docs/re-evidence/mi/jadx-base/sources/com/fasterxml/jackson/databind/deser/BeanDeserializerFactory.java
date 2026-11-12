package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.xiaomi.onetrack.OneTrack;
import defpackage.bj4;
import defpackage.ecm;
import defpackage.esd;
import defpackage.fh2;
import defpackage.gh2;
import defpackage.h04;
import defpackage.hh2;
import defpackage.id8;
import defpackage.ih2;
import defpackage.mtd;
import defpackage.pno;
import defpackage.q4q;
import defpackage.vzd;
import defpackage.x10;
import defpackage.z3h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class BeanDeserializerFactory extends BasicDeserializerFactory implements Serializable {
    private static final Class<?>[] INIT_CAUSE_PARAMS = {Throwable.class};
    public static final BeanDeserializerFactory instance = new BeanDeserializerFactory(new DeserializerFactoryConfig());
    private static final long serialVersionUID = 1;

    public BeanDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        super(deserializerFactoryConfig);
    }

    private boolean _isSetterlessType(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    public void _validateSubType(DeserializationContext deserializationContext, JavaType javaType, fh2 fh2Var) throws JsonMappingException {
        pno.a().b(deserializationContext, javaType, fh2Var);
    }

    public void addBackReferenceProperties(DeserializationContext deserializationContext, fh2 fh2Var, gh2 gh2Var) throws JsonMappingException {
        List<ih2> listC = fh2Var.c();
        if (listC != null) {
            for (ih2 ih2Var : listC) {
                gh2Var.c(ih2Var.e(), constructSettableProperty(deserializationContext, fh2Var, ih2Var, ih2Var.u()));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0140  */
    public void addBeanProps(DeserializationContext deserializationContext, fh2 fh2Var, gh2 gh2Var) throws JsonMappingException {
        Set<String> setEmptySet;
        SettableBeanProperty settableBeanPropertyConstructSetterlessProperty;
        CreatorProperty creatorProperty;
        SettableBeanProperty[] fromObjectArguments = fh2Var.z().isAbstract() ^ true ? gh2Var.q().getFromObjectArguments(deserializationContext.getConfig()) : null;
        boolean z = fromObjectArguments != null;
        JsonIgnoreProperties.Value defaultPropertyIgnorals = deserializationContext.getConfig().getDefaultPropertyIgnorals(fh2Var.s(), fh2Var.u());
        if (defaultPropertyIgnorals != null) {
            gh2Var.t(defaultPropertyIgnorals.getIgnoreUnknown());
            setEmptySet = defaultPropertyIgnorals.findIgnoredForDeserialization();
            Iterator<String> it = setEmptySet.iterator();
            while (it.hasNext()) {
                gh2Var.e(it.next());
            }
        } else {
            setEmptySet = Collections.emptySet();
        }
        Set<String> set = setEmptySet;
        AnnotatedMember annotatedMemberB = fh2Var.b();
        if (annotatedMemberB != null) {
            gh2Var.s(constructAnySetter(deserializationContext, fh2Var, annotatedMemberB));
        } else {
            Set<String> setX = fh2Var.x();
            if (setX != null) {
                Iterator<String> it2 = setX.iterator();
                while (it2.hasNext()) {
                    gh2Var.e(it2.next());
                }
            }
        }
        boolean z2 = deserializationContext.isEnabled(MapperFeature.USE_GETTERS_AS_SETTERS) && deserializationContext.isEnabled(MapperFeature.AUTO_DETECT_GETTERS);
        List<ih2> listFilterBeanProps = filterBeanProps(deserializationContext, fh2Var, gh2Var, fh2Var.o(), set);
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<hh2> it3 = this._factoryConfig.deserializerModifiers().iterator();
            while (it3.hasNext()) {
                listFilterBeanProps = it3.next().k(deserializationContext.getConfig(), fh2Var, listFilterBeanProps);
            }
        }
        for (ih2 ih2Var : listFilterBeanProps) {
            if (ih2Var.B()) {
                settableBeanPropertyConstructSetterlessProperty = constructSettableProperty(deserializationContext, fh2Var, ih2Var, ih2Var.x().getParameterType(0));
            } else if (ih2Var.z()) {
                settableBeanPropertyConstructSetterlessProperty = constructSettableProperty(deserializationContext, fh2Var, ih2Var, ih2Var.n().getType());
            } else {
                AnnotatedMethod annotatedMethodO = ih2Var.o();
                if (annotatedMethodO == null) {
                    settableBeanPropertyConstructSetterlessProperty = null;
                } else if (z2 && _isSetterlessType(annotatedMethodO.getRawType())) {
                    if (gh2Var.r(ih2Var.getName())) {
                        settableBeanPropertyConstructSetterlessProperty = null;
                    } else {
                        settableBeanPropertyConstructSetterlessProperty = constructSetterlessProperty(deserializationContext, fh2Var, ih2Var);
                    }
                } else if (ih2Var.y() || ih2Var.getMetadata().getMergeInfo() == null) {
                    settableBeanPropertyConstructSetterlessProperty = null;
                } else {
                    settableBeanPropertyConstructSetterlessProperty = constructSetterlessProperty(deserializationContext, fh2Var, ih2Var);
                }
            }
            if (z && ih2Var.y()) {
                String name = ih2Var.getName();
                if (fromObjectArguments == null) {
                    creatorProperty = null;
                    break;
                }
                int length = fromObjectArguments.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        creatorProperty = null;
                        break;
                    }
                    SettableBeanProperty settableBeanProperty = fromObjectArguments[i];
                    if (name.equals(settableBeanProperty.getName()) && (settableBeanProperty instanceof CreatorProperty)) {
                        creatorProperty = (CreatorProperty) settableBeanProperty;
                        break;
                    }
                    i++;
                }
                if (creatorProperty == null) {
                    ArrayList arrayList = new ArrayList();
                    for (SettableBeanProperty settableBeanProperty2 : fromObjectArguments) {
                        arrayList.add(settableBeanProperty2.getName());
                    }
                    deserializationContext.reportBadPropertyDefinition(fh2Var, ih2Var, "Could not find creator property with name '%s' (known Creator properties: %s)", name, arrayList);
                } else {
                    if (settableBeanPropertyConstructSetterlessProperty != null) {
                        creatorProperty.setFallbackSetter(settableBeanPropertyConstructSetterlessProperty);
                    }
                    Class<?>[] clsArrI = ih2Var.i();
                    if (clsArrI == null) {
                        clsArrI = fh2Var.e();
                    }
                    creatorProperty.setViews(clsArrI);
                    gh2Var.d(creatorProperty);
                }
            } else if (settableBeanPropertyConstructSetterlessProperty != null) {
                Class<?>[] clsArrI2 = ih2Var.i();
                if (clsArrI2 == null) {
                    clsArrI2 = fh2Var.e();
                }
                settableBeanPropertyConstructSetterlessProperty.setViews(clsArrI2);
                gh2Var.h(settableBeanPropertyConstructSetterlessProperty);
            }
        }
    }

    public void addInjectables(DeserializationContext deserializationContext, fh2 fh2Var, gh2 gh2Var) throws JsonMappingException {
        Map<Object, AnnotatedMember> mapI = fh2Var.i();
        if (mapI != null) {
            for (Map.Entry<Object, AnnotatedMember> entry : mapI.entrySet()) {
                AnnotatedMember value = entry.getValue();
                gh2Var.f(PropertyName.construct(value.getName()), value.getType(), fh2Var.t(), value, entry.getKey());
            }
        }
    }

    public void addObjectIdReader(DeserializationContext deserializationContext, fh2 fh2Var, gh2 gh2Var) throws JsonMappingException {
        SettableBeanProperty settableBeanPropertyL;
        ObjectIdGenerator<?> objectIdGeneratorObjectIdGeneratorInstance;
        JavaType type;
        z3h z3hVarY = fh2Var.y();
        if (z3hVarY == null) {
            return;
        }
        Class<? extends ObjectIdGenerator<?>> clsC = z3hVarY.c();
        com.fasterxml.jackson.annotation.a aVarObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(fh2Var.u(), z3hVarY);
        if (clsC == ObjectIdGenerators$PropertyGenerator.class) {
            PropertyName propertyNameD = z3hVarY.d();
            settableBeanPropertyL = gh2Var.l(propertyNameD);
            if (settableBeanPropertyL == null) {
                throw new IllegalArgumentException("Invalid Object Id definition for " + fh2Var.s().getName() + ": cannot find property with name '" + propertyNameD + "'");
            }
            type = settableBeanPropertyL.getType();
            objectIdGeneratorObjectIdGeneratorInstance = new PropertyBasedObjectIdGenerator(z3hVarY.f());
        } else {
            JavaType javaType = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType((Class<?>) clsC), ObjectIdGenerator.class)[0];
            settableBeanPropertyL = null;
            objectIdGeneratorObjectIdGeneratorInstance = deserializationContext.objectIdGeneratorInstance(fh2Var.u(), z3hVarY);
            type = javaType;
        }
        gh2Var.u(ObjectIdReader.construct(type, z3hVarY.d(), objectIdGeneratorObjectIdGeneratorInstance, deserializationContext.findRootValueDeserializer(type), settableBeanPropertyL, aVarObjectIdResolverInstance));
    }

    @Deprecated
    public void addReferenceProperties(DeserializationContext deserializationContext, fh2 fh2Var, gh2 gh2Var) throws JsonMappingException {
        addBackReferenceProperties(deserializationContext, fh2Var, gh2Var);
    }

    public esd<Object> buildBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, fh2 fh2Var) throws JsonMappingException {
        try {
            b bVarFindValueInstantiator = findValueInstantiator(deserializationContext, fh2Var);
            gh2 gh2VarConstructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, fh2Var);
            gh2VarConstructBeanDeserializerBuilder.w(bVarFindValueInstantiator);
            addBeanProps(deserializationContext, fh2Var, gh2VarConstructBeanDeserializerBuilder);
            addObjectIdReader(deserializationContext, fh2Var, gh2VarConstructBeanDeserializerBuilder);
            addBackReferenceProperties(deserializationContext, fh2Var, gh2VarConstructBeanDeserializerBuilder);
            addInjectables(deserializationContext, fh2Var, gh2VarConstructBeanDeserializerBuilder);
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<hh2> it = this._factoryConfig.deserializerModifiers().iterator();
                while (it.hasNext()) {
                    gh2VarConstructBeanDeserializerBuilder = it.next().j(config, fh2Var, gh2VarConstructBeanDeserializerBuilder);
                }
            }
            esd<?> esdVarI = (!javaType.isAbstract() || bVarFindValueInstantiator.canInstantiate()) ? gh2VarConstructBeanDeserializerBuilder.i() : gh2VarConstructBeanDeserializerBuilder.j();
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<hh2> it2 = this._factoryConfig.deserializerModifiers().iterator();
                while (it2.hasNext()) {
                    esdVarI = it2.next().d(config, fh2Var, esdVarI);
                }
            }
            return esdVarI;
        } catch (IllegalArgumentException e) {
            throw InvalidDefinitionException.from(deserializationContext.getParser(), h04.n(e), fh2Var, (ih2) null);
        } catch (NoClassDefFoundError e2) {
            return new id8(e2);
        }
    }

    public esd<Object> buildBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, fh2 fh2Var) throws JsonMappingException {
        try {
            b bVarFindValueInstantiator = findValueInstantiator(deserializationContext, fh2Var);
            DeserializationConfig config = deserializationContext.getConfig();
            gh2 gh2VarConstructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, fh2Var);
            gh2VarConstructBeanDeserializerBuilder.w(bVarFindValueInstantiator);
            addBeanProps(deserializationContext, fh2Var, gh2VarConstructBeanDeserializerBuilder);
            addObjectIdReader(deserializationContext, fh2Var, gh2VarConstructBeanDeserializerBuilder);
            addBackReferenceProperties(deserializationContext, fh2Var, gh2VarConstructBeanDeserializerBuilder);
            addInjectables(deserializationContext, fh2Var, gh2VarConstructBeanDeserializerBuilder);
            mtd.a aVarN = fh2Var.n();
            String str = aVarN == null ? OneTrack.Param.BUILD : aVarN.f27181a;
            AnnotatedMethod annotatedMethodL = fh2Var.l(str, null);
            if (annotatedMethodL != null && config.canOverrideAccessModifiers()) {
                h04.f(annotatedMethodL.getMember(), config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            gh2VarConstructBeanDeserializerBuilder.v(annotatedMethodL, aVarN);
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<hh2> it = this._factoryConfig.deserializerModifiers().iterator();
                while (it.hasNext()) {
                    gh2VarConstructBeanDeserializerBuilder = it.next().j(config, fh2Var, gh2VarConstructBeanDeserializerBuilder);
                }
            }
            esd<?> esdVarK = gh2VarConstructBeanDeserializerBuilder.k(javaType, str);
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<hh2> it2 = this._factoryConfig.deserializerModifiers().iterator();
                while (it2.hasNext()) {
                    esdVarK = it2.next().d(config, fh2Var, esdVarK);
                }
            }
            return esdVarK;
        } catch (IllegalArgumentException e) {
            throw InvalidDefinitionException.from(deserializationContext.getParser(), h04.n(e), fh2Var, (ih2) null);
        } catch (NoClassDefFoundError e2) {
            return new id8(e2);
        }
    }

    public esd<Object> buildThrowableDeserializer(DeserializationContext deserializationContext, JavaType javaType, fh2 fh2Var) throws JsonMappingException {
        SettableBeanProperty settableBeanPropertyConstructSettableProperty;
        DeserializationConfig config = deserializationContext.getConfig();
        gh2 gh2VarConstructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, fh2Var);
        gh2VarConstructBeanDeserializerBuilder.w(findValueInstantiator(deserializationContext, fh2Var));
        addBeanProps(deserializationContext, fh2Var, gh2VarConstructBeanDeserializerBuilder);
        AnnotatedMethod annotatedMethodL = fh2Var.l("initCause", INIT_CAUSE_PARAMS);
        if (annotatedMethodL != null && (settableBeanPropertyConstructSettableProperty = constructSettableProperty(deserializationContext, fh2Var, ecm.F(deserializationContext.getConfig(), annotatedMethodL, new PropertyName("cause")), annotatedMethodL.getParameterType(0))) != null) {
            gh2VarConstructBeanDeserializerBuilder.g(settableBeanPropertyConstructSettableProperty, true);
        }
        gh2VarConstructBeanDeserializerBuilder.e("localizedMessage");
        gh2VarConstructBeanDeserializerBuilder.e("suppressed");
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<hh2> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                gh2VarConstructBeanDeserializerBuilder = it.next().j(config, fh2Var, gh2VarConstructBeanDeserializerBuilder);
            }
        }
        esd<?> esdVarI = gh2VarConstructBeanDeserializerBuilder.i();
        if (esdVarI instanceof BeanDeserializer) {
            esdVarI = new ThrowableDeserializer((BeanDeserializer) esdVarI);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<hh2> it2 = this._factoryConfig.deserializerModifiers().iterator();
            while (it2.hasNext()) {
                esdVarI = it2.next().d(config, fh2Var, esdVarI);
            }
        }
        return esdVarI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [vzd] */
    public SettableAnyProperty constructAnySetter(DeserializationContext deserializationContext, fh2 fh2Var, AnnotatedMember annotatedMember) throws JsonMappingException {
        JavaType keyType;
        BeanProperty.Std std;
        JavaType javaTypeResolveMemberAndTypeAnnotations;
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            keyType = annotatedMethod.getParameterType(0);
            javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, annotatedMethod.getParameterType(1));
            std = new BeanProperty.Std(PropertyName.construct(annotatedMember.getName()), javaTypeResolveMemberAndTypeAnnotations, null, annotatedMember, PropertyMetadata.STD_OPTIONAL);
        } else {
            if (!(annotatedMember instanceof AnnotatedField)) {
                return (SettableAnyProperty) deserializationContext.reportBadDefinition(fh2Var.z(), String.format("Unrecognized mutator type for any setter: %s", annotatedMember.getClass()));
            }
            JavaType javaTypeResolveMemberAndTypeAnnotations2 = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, ((AnnotatedField) annotatedMember).getType());
            keyType = javaTypeResolveMemberAndTypeAnnotations2.getKeyType();
            JavaType contentType = javaTypeResolveMemberAndTypeAnnotations2.getContentType();
            std = new BeanProperty.Std(PropertyName.construct(annotatedMember.getName()), javaTypeResolveMemberAndTypeAnnotations2, null, annotatedMember, PropertyMetadata.STD_OPTIONAL);
            javaTypeResolveMemberAndTypeAnnotations = contentType;
        }
        Object objFindKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, annotatedMember);
        if (objFindKeyDeserializerFromAnnotation == null) {
            objFindKeyDeserializerFromAnnotation = (vzd) keyType.getValueHandler();
        }
        if (objFindKeyDeserializerFromAnnotation == null) {
            objFindKeyDeserializerFromAnnotation = deserializationContext.findKeyDeserializer(keyType, std);
        } else if (objFindKeyDeserializerFromAnnotation instanceof bj4) {
            objFindKeyDeserializerFromAnnotation = ((bj4) objFindKeyDeserializerFromAnnotation).createContextual(deserializationContext, std);
        }
        ?? r4 = objFindKeyDeserializerFromAnnotation;
        esd<?> esdVarFindContentDeserializerFromAnnotation = findContentDeserializerFromAnnotation(deserializationContext, annotatedMember);
        if (esdVarFindContentDeserializerFromAnnotation == null) {
            esdVarFindContentDeserializerFromAnnotation = (esd) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        return new SettableAnyProperty(std, annotatedMember, javaTypeResolveMemberAndTypeAnnotations, r4, esdVarFindContentDeserializerFromAnnotation != null ? deserializationContext.handlePrimaryContextualization(esdVarFindContentDeserializerFromAnnotation, std, javaTypeResolveMemberAndTypeAnnotations) : esdVarFindContentDeserializerFromAnnotation, (q4q) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler());
    }

    public gh2 constructBeanDeserializerBuilder(DeserializationContext deserializationContext, fh2 fh2Var) {
        return new gh2(fh2Var, deserializationContext);
    }

    public SettableBeanProperty constructSettableProperty(DeserializationContext deserializationContext, fh2 fh2Var, ih2 ih2Var, JavaType javaType) throws JsonMappingException {
        AnnotatedMember annotatedMemberR = ih2Var.r();
        if (annotatedMemberR == null) {
            deserializationContext.reportBadPropertyDefinition(fh2Var, ih2Var, "No non-constructor mutator available", new Object[0]);
        }
        JavaType javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMemberR, javaType);
        q4q q4qVar = (q4q) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler();
        SettableBeanProperty methodProperty = annotatedMemberR instanceof AnnotatedMethod ? new MethodProperty(ih2Var, javaTypeResolveMemberAndTypeAnnotations, q4qVar, fh2Var.t(), (AnnotatedMethod) annotatedMemberR) : new FieldProperty(ih2Var, javaTypeResolveMemberAndTypeAnnotations, q4qVar, fh2Var.t(), (AnnotatedField) annotatedMemberR);
        esd<?> esdVarFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedMemberR);
        if (esdVarFindDeserializerFromAnnotation == null) {
            esdVarFindDeserializerFromAnnotation = (esd) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        if (esdVarFindDeserializerFromAnnotation != null) {
            methodProperty = methodProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(esdVarFindDeserializerFromAnnotation, methodProperty, javaTypeResolveMemberAndTypeAnnotations));
        }
        AnnotationIntrospector.ReferenceProperty referencePropertyH = ih2Var.h();
        if (referencePropertyH != null && referencePropertyH.d()) {
            methodProperty.setManagedReferenceName(referencePropertyH.b());
        }
        z3h z3hVarD = ih2Var.d();
        if (z3hVarD != null) {
            methodProperty.setObjectIdInfo(z3hVarD);
        }
        return methodProperty;
    }

    public SettableBeanProperty constructSetterlessProperty(DeserializationContext deserializationContext, fh2 fh2Var, ih2 ih2Var) throws JsonMappingException {
        AnnotatedMethod annotatedMethodO = ih2Var.o();
        JavaType javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMethodO, annotatedMethodO.getType());
        SetterlessProperty setterlessProperty = new SetterlessProperty(ih2Var, javaTypeResolveMemberAndTypeAnnotations, (q4q) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler(), fh2Var.t(), annotatedMethodO);
        esd<?> esdVarFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedMethodO);
        if (esdVarFindDeserializerFromAnnotation == null) {
            esdVarFindDeserializerFromAnnotation = (esd) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        return esdVarFindDeserializerFromAnnotation != null ? setterlessProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(esdVarFindDeserializerFromAnnotation, setterlessProperty, javaTypeResolveMemberAndTypeAnnotations)) : setterlessProperty;
    }

    @Override // com.fasterxml.jackson.databind.deser.a
    public esd<Object> createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, fh2 fh2Var) throws JsonMappingException {
        JavaType javaTypeMaterializeAbstractType;
        DeserializationConfig config = deserializationContext.getConfig();
        esd<Object> esdVar_findCustomBeanDeserializer = _findCustomBeanDeserializer(javaType, config, fh2Var);
        if (esdVar_findCustomBeanDeserializer != null) {
            return esdVar_findCustomBeanDeserializer;
        }
        if (javaType.isThrowable()) {
            return buildThrowableDeserializer(deserializationContext, javaType, fh2Var);
        }
        if (javaType.isAbstract() && !javaType.isPrimitive() && !javaType.isEnumType() && (javaTypeMaterializeAbstractType = materializeAbstractType(deserializationContext, javaType, fh2Var)) != null) {
            return buildBeanDeserializer(deserializationContext, javaTypeMaterializeAbstractType, config.introspect(javaTypeMaterializeAbstractType));
        }
        esd<?> esdVarFindStdDeserializer = findStdDeserializer(deserializationContext, javaType, fh2Var);
        if (esdVarFindStdDeserializer != null) {
            return esdVarFindStdDeserializer;
        }
        if (!isPotentialBeanType(javaType.getRawClass())) {
            return null;
        }
        _validateSubType(deserializationContext, javaType, fh2Var);
        return buildBeanDeserializer(deserializationContext, javaType, fh2Var);
    }

    @Override // com.fasterxml.jackson.databind.deser.a
    public esd<Object> createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, fh2 fh2Var, Class<?> cls) throws JsonMappingException {
        return buildBuilderBasedDeserializer(deserializationContext, javaType, deserializationContext.getConfig().introspectForBuilder(deserializationContext.constructType(cls)));
    }

    public List<ih2> filterBeanProps(DeserializationContext deserializationContext, fh2 fh2Var, gh2 gh2Var, List<ih2> list, Set<String> set) throws JsonMappingException {
        Class<?> clsW;
        ArrayList arrayList = new ArrayList(Math.max(4, list.size()));
        HashMap map = new HashMap();
        for (ih2 ih2Var : list) {
            String name = ih2Var.getName();
            if (!set.contains(name)) {
                if (ih2Var.y() || (clsW = ih2Var.w()) == null || !isIgnorableType(deserializationContext.getConfig(), ih2Var, clsW, map)) {
                    arrayList.add(ih2Var);
                } else {
                    gh2Var.e(name);
                }
            }
        }
        return arrayList;
    }

    public esd<?> findStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, fh2 fh2Var) throws JsonMappingException {
        esd<?> esdVarFindDefaultDeserializer = findDefaultDeserializer(deserializationContext, javaType, fh2Var);
        if (esdVarFindDefaultDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<hh2> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                esdVarFindDefaultDeserializer = it.next().d(deserializationContext.getConfig(), fh2Var, esdVarFindDefaultDeserializer);
            }
        }
        return esdVarFindDefaultDeserializer;
    }

    public boolean isIgnorableType(DeserializationConfig deserializationConfig, ih2 ih2Var, Class<?> cls, Map<Class<?>, Boolean> map) {
        Boolean isIgnoredType;
        Boolean bool = map.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        if (cls == String.class || cls.isPrimitive()) {
            isIgnoredType = Boolean.FALSE;
        } else {
            isIgnoredType = deserializationConfig.getConfigOverride(cls).getIsIgnoredType();
            if (isIgnoredType == null) {
                isIgnoredType = deserializationConfig.getAnnotationIntrospector().isIgnorableType(deserializationConfig.introspectClassAnnotations(cls).u());
                if (isIgnoredType == null) {
                    isIgnoredType = Boolean.FALSE;
                }
            }
        }
        map.put(cls, isIgnoredType);
        return isIgnoredType.booleanValue();
    }

    public boolean isPotentialBeanType(Class<?> cls) {
        String strE = h04.e(cls);
        if (strE != null) {
            throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + strE + ") as a Bean");
        }
        if (h04.R(cls)) {
            throw new IllegalArgumentException("Cannot deserialize Proxy class " + cls.getName() + " as a Bean");
        }
        String strO = h04.O(cls, true);
        if (strO == null) {
            return true;
        }
        throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + strO + ") as a Bean");
    }

    public JavaType materializeAbstractType(DeserializationContext deserializationContext, JavaType javaType, fh2 fh2Var) throws JsonMappingException {
        Iterator<x10> it = this._factoryConfig.abstractTypeResolvers().iterator();
        while (it.hasNext()) {
            JavaType javaTypeResolveAbstractType = it.next().resolveAbstractType(deserializationContext.getConfig(), fh2Var);
            if (javaTypeResolveAbstractType != null) {
                return javaTypeResolveAbstractType;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.BasicDeserializerFactory
    public a withConfig(DeserializerFactoryConfig deserializerFactoryConfig) {
        if (this._factoryConfig == deserializerFactoryConfig) {
            return this;
        }
        h04.j0(BeanDeserializerFactory.class, this, "withConfig");
        return new BeanDeserializerFactory(deserializerFactoryConfig);
    }
}
