package defpackage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.deser.BasicDeserializerFactory;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class zg extends BasicDeserializerFactory implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?>[] f54069a = {Throwable.class};
    public static final zg d = new zg(new yx());
    private static final long serialVersionUID = 1;

    public zg(yx yxVar) {
        super(yxVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.BasicDeserializerFactory
    public DeserializerFactory withConfig(yx yxVar) {
        if (this._factoryConfig == yxVar) {
            return this;
        }
        ahw.c((Class<?>) zg.class, this, "withConfig");
        return new zg(yxVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws ym {
        JavaType javaTypeH;
        yi config = deserializationContext.getConfig();
        JsonDeserializer<?> jsonDeserializer_findCustomBeanDeserializer = _findCustomBeanDeserializer(javaType, config, beanDescription);
        if (jsonDeserializer_findCustomBeanDeserializer != null) {
            if (this._factoryConfig.d()) {
                Iterator<BeanDeserializerModifier> it = this._factoryConfig.e().iterator();
                while (it.hasNext()) {
                    jsonDeserializer_findCustomBeanDeserializer = it.next().modifyDeserializer(deserializationContext.getConfig(), beanDescription, jsonDeserializer_findCustomBeanDeserializer);
                }
            }
            return jsonDeserializer_findCustomBeanDeserializer;
        }
        if (javaType.isThrowable()) {
            return a(deserializationContext, javaType, beanDescription);
        }
        if (javaType.isAbstract() && !javaType.isPrimitive() && !javaType.isEnumType() && (javaTypeH = h(deserializationContext, javaType, beanDescription)) != null) {
            return e(deserializationContext, javaTypeH, config.e(javaTypeH));
        }
        JsonDeserializer<?> jsonDeserializerG = g(deserializationContext, javaType, beanDescription);
        if (jsonDeserializerG != null) {
            return jsonDeserializerG;
        }
        if (!e(javaType.getRawClass())) {
            return null;
        }
        b(deserializationContext, javaType, beanDescription);
        JsonDeserializer<Object> jsonDeserializerD = d(deserializationContext, javaType, beanDescription);
        return jsonDeserializerD != null ? jsonDeserializerD : e(deserializationContext, javaType, beanDescription);
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<Object> createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription, Class<?> cls) throws ym {
        JavaType javaTypeConstructType;
        if (deserializationContext.isEnabled(MapperFeature.INFER_BUILDER_TYPE_BINDINGS)) {
            javaTypeConstructType = deserializationContext.getTypeFactory().c(cls, javaType.getBindings());
        } else {
            javaTypeConstructType = deserializationContext.constructType(cls);
        }
        return c(deserializationContext, javaType, deserializationContext.getConfig().c(javaTypeConstructType, beanDescription));
    }

    protected JsonDeserializer<?> g(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws ym {
        JsonDeserializer<?> jsonDeserializerFindDefaultDeserializer = findDefaultDeserializer(deserializationContext, javaType, beanDescription);
        if (jsonDeserializerFindDefaultDeserializer != null && this._factoryConfig.d()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.e().iterator();
            while (it.hasNext()) {
                jsonDeserializerFindDefaultDeserializer = it.next().modifyDeserializer(deserializationContext.getConfig(), beanDescription, jsonDeserializerFindDefaultDeserializer);
            }
        }
        return jsonDeserializerFindDefaultDeserializer;
    }

    protected JsonDeserializer<Object> d(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws ym {
        String strA = ahr.a(javaType);
        if (strA == null || deserializationContext.getConfig().findMixInClassFor(javaType.getRawClass()) != null) {
            return null;
        }
        return new aal(javaType, strA);
    }

    protected JavaType h(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws ym {
        Iterator<AbstractTypeResolver> it = this._factoryConfig.a().iterator();
        while (it.hasNext()) {
            JavaType javaTypeResolveAbstractType = it.next().resolveAbstractType(deserializationContext.getConfig(), beanDescription);
            if (javaTypeResolveAbstractType != null) {
                return javaTypeResolveAbstractType;
            }
        }
        return null;
    }

    public JsonDeserializer<Object> e(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws ym {
        JsonDeserializer<?> jsonDeserializerC;
        try {
            ValueInstantiator valueInstantiatorFindValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
            zi ziVarC = c(deserializationContext, beanDescription);
            ziVarC.c(valueInstantiatorFindValueInstantiator);
            d(deserializationContext, beanDescription, ziVarC);
            a(deserializationContext, beanDescription, ziVarC);
            c(deserializationContext, beanDescription, ziVarC);
            e(deserializationContext, beanDescription, ziVarC);
            yi config = deserializationContext.getConfig();
            if (this._factoryConfig.d()) {
                Iterator<BeanDeserializerModifier> it = this._factoryConfig.e().iterator();
                while (it.hasNext()) {
                    ziVarC = it.next().updateBuilder(config, beanDescription, ziVarC);
                }
            }
            if (javaType.isAbstract() && !valueInstantiatorFindValueInstantiator.canInstantiate()) {
                jsonDeserializerC = ziVarC.a();
            } else {
                jsonDeserializerC = ziVarC.c();
            }
            if (this._factoryConfig.d()) {
                Iterator<BeanDeserializerModifier> it2 = this._factoryConfig.e().iterator();
                while (it2.hasNext()) {
                    jsonDeserializerC = it2.next().modifyDeserializer(config, beanDescription, jsonDeserializerC);
                }
            }
            return jsonDeserializerC;
        } catch (IllegalArgumentException e) {
            abv abvVarD = abv.d(deserializationContext.getParser(), ahw.a((Throwable) e), beanDescription, null);
            abvVarD.initCause(e);
            throw abvVarD;
        } catch (NoClassDefFoundError e2) {
            return new zx(e2);
        }
    }

    protected JsonDeserializer<Object> c(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws ym {
        try {
            ValueInstantiator valueInstantiatorFindValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
            yi config = deserializationContext.getConfig();
            zi ziVarC = c(deserializationContext, beanDescription);
            ziVarC.c(valueInstantiatorFindValueInstantiator);
            d(deserializationContext, beanDescription, ziVarC);
            a(deserializationContext, beanDescription, ziVarC);
            c(deserializationContext, beanDescription, ziVarC);
            e(deserializationContext, beanDescription, ziVarC);
            JsonPOJOBuilder.e eVarFindPOJOBuilderConfig = beanDescription.findPOJOBuilderConfig();
            String str = eVarFindPOJOBuilderConfig == null ? JsonPOJOBuilder.DEFAULT_BUILD_METHOD : eVarFindPOJOBuilderConfig.f4098a;
            aco acoVarFindMethod = beanDescription.findMethod(str, null);
            if (acoVarFindMethod != null && config.canOverrideAccessModifiers()) {
                ahw.a(acoVarFindMethod.getMember(), config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            ziVarC.b(acoVarFindMethod, eVarFindPOJOBuilderConfig);
            if (this._factoryConfig.d()) {
                Iterator<BeanDeserializerModifier> it = this._factoryConfig.e().iterator();
                while (it.hasNext()) {
                    ziVarC = it.next().updateBuilder(config, beanDescription, ziVarC);
                }
            }
            JsonDeserializer<?> jsonDeserializerD = ziVarC.d(javaType, str);
            if (this._factoryConfig.d()) {
                Iterator<BeanDeserializerModifier> it2 = this._factoryConfig.e().iterator();
                while (it2.hasNext()) {
                    jsonDeserializerD = it2.next().modifyDeserializer(config, beanDescription, jsonDeserializerD);
                }
            }
            return jsonDeserializerD;
        } catch (IllegalArgumentException e) {
            throw abv.d(deserializationContext.getParser(), ahw.a((Throwable) e), beanDescription, null);
        } catch (NoClassDefFoundError e2) {
            return new zx(e2);
        }
    }

    protected void a(DeserializationContext deserializationContext, BeanDescription beanDescription, zi ziVar) throws ym {
        SettableBeanProperty settableBeanPropertyD;
        ObjectIdGenerator<?> objectIdGeneratorObjectIdGeneratorInstance;
        JavaType javaType;
        acv objectIdInfo = beanDescription.getObjectIdInfo();
        if (objectIdInfo == null) {
            return;
        }
        Class<? extends ObjectIdGenerator<?>> clsE = objectIdInfo.e();
        ObjectIdResolver objectIdResolverObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(beanDescription.getClassInfo(), objectIdInfo);
        if (clsE == ObjectIdGenerators.PropertyGenerator.class) {
            ys ysVarC = objectIdInfo.c();
            settableBeanPropertyD = ziVar.d(ysVarC);
            if (settableBeanPropertyD == null) {
                throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", ahw.a(beanDescription.getType()), ahw.e(ysVarC)));
            }
            JavaType type = settableBeanPropertyD.getType();
            javaType = type;
            objectIdGeneratorObjectIdGeneratorInstance = new aak(objectIdInfo.f());
        } else {
            JavaType javaType2 = deserializationContext.getTypeFactory().a(deserializationContext.constructType((Class<?>) clsE), ObjectIdGenerator.class)[0];
            settableBeanPropertyD = null;
            objectIdGeneratorObjectIdGeneratorInstance = deserializationContext.objectIdGeneratorInstance(beanDescription.getClassInfo(), objectIdInfo);
            javaType = javaType2;
        }
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        ziVar.e(aah.a(javaType, objectIdInfo.c(), objectIdGeneratorObjectIdGeneratorInstance, jsonDeserializerFindRootValueDeserializer, settableBeanPropertyD, objectIdResolverObjectIdResolverInstance));
    }

    public JsonDeserializer<Object> a(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws ym {
        SettableBeanProperty settableBeanPropertyD;
        yi config = deserializationContext.getConfig();
        zi ziVarC = c(deserializationContext, beanDescription);
        ziVarC.c(findValueInstantiator(deserializationContext, beanDescription));
        d(deserializationContext, beanDescription, ziVarC);
        aco acoVarFindMethod = beanDescription.findMethod("initCause", f54069a);
        if (acoVarFindMethod != null && (settableBeanPropertyD = d(deserializationContext, beanDescription, aih.e(deserializationContext.getConfig(), acoVarFindMethod, new ys("cause")), acoVarFindMethod.getParameterType(0))) != null) {
            ziVarC.d(settableBeanPropertyD, true);
        }
        ziVarC.c("localizedMessage");
        ziVarC.c("suppressed");
        if (this._factoryConfig.d()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.e().iterator();
            while (it.hasNext()) {
                ziVarC = it.next().updateBuilder(config, beanDescription, ziVarC);
            }
        }
        JsonDeserializer<?> jsonDeserializerC = ziVarC.c();
        if (jsonDeserializerC instanceof zf) {
            jsonDeserializerC = new abp((zf) jsonDeserializerC);
        }
        if (this._factoryConfig.d()) {
            Iterator<BeanDeserializerModifier> it2 = this._factoryConfig.e().iterator();
            while (it2.hasNext()) {
                jsonDeserializerC = it2.next().modifyDeserializer(config, beanDescription, jsonDeserializerC);
            }
        }
        return jsonDeserializerC;
    }

    protected zi c(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        return new zi(beanDescription, deserializationContext);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x016a  */
    protected void d(DeserializationContext deserializationContext, BeanDescription beanDescription, zi ziVar) throws ym {
        Set<String> setB;
        Set<String> set;
        SettableBeanProperty settableBeanPropertyB;
        zh zhVar;
        SettableBeanProperty[] fromObjectArguments = !beanDescription.getType().isAbstract() ? ziVar.h().getFromObjectArguments(deserializationContext.getConfig()) : null;
        boolean z = fromObjectArguments != null;
        JsonIgnoreProperties.b defaultPropertyIgnorals = deserializationContext.getConfig().getDefaultPropertyIgnorals(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        if (defaultPropertyIgnorals != null) {
            ziVar.e(defaultPropertyIgnorals.d());
            setB = defaultPropertyIgnorals.b();
            Iterator<String> it = setB.iterator();
            while (it.hasNext()) {
                ziVar.c(it.next());
            }
        } else {
            setB = Collections.EMPTY_SET;
        }
        Set<String> set2 = setB;
        JsonIncludeProperties.b defaultPropertyInclusions = deserializationContext.getConfig().getDefaultPropertyInclusions(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        if (defaultPropertyInclusions != null) {
            Set<String> setB2 = defaultPropertyInclusions.b();
            if (setB2 != null) {
                Iterator<String> it2 = setB2.iterator();
                while (it2.hasNext()) {
                    ziVar.b(it2.next());
                }
            }
            set = setB2;
        } else {
            set = null;
        }
        AnnotatedMember annotatedMemberFindAnySetterAccessor = beanDescription.findAnySetterAccessor();
        if (annotatedMemberFindAnySetterAccessor != null) {
            ziVar.a(a(deserializationContext, beanDescription, annotatedMemberFindAnySetterAccessor));
        } else {
            Set<String> ignoredPropertyNames = beanDescription.getIgnoredPropertyNames();
            if (ignoredPropertyNames != null) {
                Iterator<String> it3 = ignoredPropertyNames.iterator();
                while (it3.hasNext()) {
                    ziVar.c(it3.next());
                }
            }
        }
        boolean z2 = deserializationContext.isEnabled(MapperFeature.USE_GETTERS_AS_SETTERS) && deserializationContext.isEnabled(MapperFeature.AUTO_DETECT_GETTERS);
        List<BeanPropertyDefinition> listD = d(deserializationContext, beanDescription, ziVar, beanDescription.findProperties(), set2, set);
        if (this._factoryConfig.d()) {
            Iterator<BeanDeserializerModifier> it4 = this._factoryConfig.e().iterator();
            while (it4.hasNext()) {
                listD = it4.next().updateProperties(deserializationContext.getConfig(), beanDescription, listD);
            }
        }
        for (BeanPropertyDefinition beanPropertyDefinition : listD) {
            if (beanPropertyDefinition.hasSetter()) {
                settableBeanPropertyB = d(deserializationContext, beanDescription, beanPropertyDefinition, beanPropertyDefinition.getSetter().getParameterType(0));
            } else if (beanPropertyDefinition.hasField()) {
                settableBeanPropertyB = d(deserializationContext, beanDescription, beanPropertyDefinition, beanPropertyDefinition.getField().getType());
            } else {
                aco getter = beanPropertyDefinition.getGetter();
                if (getter == null) {
                    settableBeanPropertyB = null;
                } else if (z2 && a(getter.getRawType())) {
                    if (ziVar.d(beanPropertyDefinition.getName())) {
                        settableBeanPropertyB = null;
                    } else {
                        settableBeanPropertyB = b(deserializationContext, beanDescription, beanPropertyDefinition);
                    }
                } else if (beanPropertyDefinition.hasConstructorParameter() || beanPropertyDefinition.getMetadata().a() == null) {
                    settableBeanPropertyB = null;
                } else {
                    settableBeanPropertyB = b(deserializationContext, beanDescription, beanPropertyDefinition);
                }
            }
            if (z && beanPropertyDefinition.hasConstructorParameter()) {
                String name = beanPropertyDefinition.getName();
                int length = fromObjectArguments.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        zhVar = null;
                        break;
                    }
                    SettableBeanProperty settableBeanProperty = fromObjectArguments[i];
                    if (name.equals(settableBeanProperty.getName()) && (settableBeanProperty instanceof zh)) {
                        zhVar = (zh) settableBeanProperty;
                        break;
                    }
                    i++;
                }
                if (zhVar == null) {
                    ArrayList arrayList = new ArrayList();
                    for (SettableBeanProperty settableBeanProperty2 : fromObjectArguments) {
                        arrayList.add(settableBeanProperty2.getName());
                    }
                    deserializationContext.reportBadPropertyDefinition(beanDescription, beanPropertyDefinition, "Could not find creator property with name %s (known Creator properties: %s)", ahw.e(name), arrayList);
                } else {
                    if (settableBeanPropertyB != null) {
                        zhVar.e(settableBeanPropertyB);
                    }
                    Class<?>[] clsArrFindViews = beanPropertyDefinition.findViews();
                    if (clsArrFindViews == null) {
                        clsArrFindViews = beanDescription.findDefaultViews();
                    }
                    zhVar.setViews(clsArrFindViews);
                    ziVar.a(zhVar);
                }
            } else if (settableBeanPropertyB != null) {
                Class<?>[] clsArrFindViews2 = beanPropertyDefinition.findViews();
                if (clsArrFindViews2 == null) {
                    clsArrFindViews2 = beanDescription.findDefaultViews();
                }
                settableBeanPropertyB.setViews(clsArrFindViews2);
                ziVar.c(settableBeanPropertyB);
            }
        }
    }

    private boolean a(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    protected List<BeanPropertyDefinition> d(DeserializationContext deserializationContext, BeanDescription beanDescription, zi ziVar, List<BeanPropertyDefinition> list, Set<String> set, Set<String> set2) {
        Class<?> rawPrimaryType;
        ArrayList arrayList = new ArrayList(Math.max(4, list.size()));
        HashMap map = new HashMap();
        for (BeanPropertyDefinition beanPropertyDefinition : list) {
            String name = beanPropertyDefinition.getName();
            if (!ahy.b(name, set, set2)) {
                if (!beanPropertyDefinition.hasConstructorParameter() && (rawPrimaryType = beanPropertyDefinition.getRawPrimaryType()) != null && c(deserializationContext.getConfig(), beanPropertyDefinition, rawPrimaryType, map)) {
                    ziVar.c(name);
                } else {
                    arrayList.add(beanPropertyDefinition);
                }
            }
        }
        return arrayList;
    }

    protected void c(DeserializationContext deserializationContext, BeanDescription beanDescription, zi ziVar) throws ym {
        List<BeanPropertyDefinition> listFindBackReferences = beanDescription.findBackReferences();
        if (listFindBackReferences != null) {
            for (BeanPropertyDefinition beanPropertyDefinition : listFindBackReferences) {
                ziVar.a(beanPropertyDefinition.findReferenceName(), d(deserializationContext, beanDescription, beanPropertyDefinition, beanPropertyDefinition.getPrimaryType()));
            }
        }
    }

    protected void e(DeserializationContext deserializationContext, BeanDescription beanDescription, zi ziVar) throws ym {
        Map<Object, AnnotatedMember> mapFindInjectables = beanDescription.findInjectables();
        if (mapFindInjectables != null) {
            for (Map.Entry<Object, AnnotatedMember> entry : mapFindInjectables.entrySet()) {
                AnnotatedMember value = entry.getValue();
                ziVar.b(ys.c(value.getName()), value.getType(), beanDescription.getClassAnnotations(), value, entry.getKey());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.fasterxml.jackson.databind.KeyDeserializer] */
    protected zj a(DeserializationContext deserializationContext, BeanDescription beanDescription, AnnotatedMember annotatedMember) throws ym {
        JavaType keyType;
        BeanProperty.d dVar;
        JavaType javaTypeResolveMemberAndTypeAnnotations;
        if (annotatedMember instanceof aco) {
            aco acoVar = (aco) annotatedMember;
            keyType = acoVar.getParameterType(0);
            javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, acoVar.getParameterType(1));
            dVar = new BeanProperty.d(ys.c(annotatedMember.getName()), javaTypeResolveMemberAndTypeAnnotations, null, annotatedMember, yq.f53745a);
        } else if (annotatedMember instanceof acj) {
            JavaType javaTypeResolveMemberAndTypeAnnotations2 = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, ((acj) annotatedMember).getType());
            keyType = javaTypeResolveMemberAndTypeAnnotations2.getKeyType();
            JavaType contentType = javaTypeResolveMemberAndTypeAnnotations2.getContentType();
            dVar = new BeanProperty.d(ys.c(annotatedMember.getName()), javaTypeResolveMemberAndTypeAnnotations2, null, annotatedMember, yq.f53745a);
            javaTypeResolveMemberAndTypeAnnotations = contentType;
        } else {
            return (zj) deserializationContext.reportBadDefinition(beanDescription.getType(), String.format("Unrecognized mutator type for any setter: %s", annotatedMember.getClass()));
        }
        Object objFindKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, annotatedMember);
        if (objFindKeyDeserializerFromAnnotation == null) {
            objFindKeyDeserializerFromAnnotation = (KeyDeserializer) keyType.getValueHandler();
        }
        if (objFindKeyDeserializerFromAnnotation == null) {
            objFindKeyDeserializerFromAnnotation = deserializationContext.findKeyDeserializer(keyType, dVar);
        } else if (objFindKeyDeserializerFromAnnotation instanceof ContextualKeyDeserializer) {
            objFindKeyDeserializerFromAnnotation = ((ContextualKeyDeserializer) objFindKeyDeserializerFromAnnotation).createContextual(deserializationContext, dVar);
        }
        ?? r4 = objFindKeyDeserializerFromAnnotation;
        JsonDeserializer<?> jsonDeserializerFindContentDeserializerFromAnnotation = findContentDeserializerFromAnnotation(deserializationContext, annotatedMember);
        if (jsonDeserializerFindContentDeserializerFromAnnotation == null) {
            jsonDeserializerFindContentDeserializerFromAnnotation = (JsonDeserializer) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        return new zj(dVar, annotatedMember, javaTypeResolveMemberAndTypeAnnotations, r4, jsonDeserializerFindContentDeserializerFromAnnotation != null ? deserializationContext.handlePrimaryContextualization(jsonDeserializerFindContentDeserializerFromAnnotation, dVar, javaTypeResolveMemberAndTypeAnnotations) : jsonDeserializerFindContentDeserializerFromAnnotation, (TypeDeserializer) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler());
    }

    protected SettableBeanProperty d(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, JavaType javaType) throws ym {
        SettableBeanProperty ztVar;
        AnnotatedMember nonConstructorMutator = beanPropertyDefinition.getNonConstructorMutator();
        if (nonConstructorMutator == null) {
            deserializationContext.reportBadPropertyDefinition(beanDescription, beanPropertyDefinition, "No non-constructor mutator available", new Object[0]);
        }
        JavaType javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, nonConstructorMutator, javaType);
        TypeDeserializer typeDeserializer = (TypeDeserializer) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler();
        if (nonConstructorMutator instanceof aco) {
            ztVar = new aac(beanPropertyDefinition, javaTypeResolveMemberAndTypeAnnotations, typeDeserializer, beanDescription.getClassAnnotations(), (aco) nonConstructorMutator);
        } else {
            ztVar = new zt(beanPropertyDefinition, javaTypeResolveMemberAndTypeAnnotations, typeDeserializer, beanDescription.getClassAnnotations(), (acj) nonConstructorMutator);
        }
        JsonDeserializer<?> jsonDeserializerFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, nonConstructorMutator);
        if (jsonDeserializerFindDeserializerFromAnnotation == null) {
            jsonDeserializerFindDeserializerFromAnnotation = (JsonDeserializer) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        if (jsonDeserializerFindDeserializerFromAnnotation != null) {
            ztVar = ztVar.withValueDeserializer(deserializationContext.handlePrimaryContextualization(jsonDeserializerFindDeserializerFromAnnotation, ztVar, javaTypeResolveMemberAndTypeAnnotations));
        }
        AnnotationIntrospector.ReferenceProperty referencePropertyFindReferenceType = beanPropertyDefinition.findReferenceType();
        if (referencePropertyFindReferenceType != null && referencePropertyFindReferenceType.d()) {
            ztVar.setManagedReferenceName(referencePropertyFindReferenceType.b());
        }
        acv acvVarFindObjectIdInfo = beanPropertyDefinition.findObjectIdInfo();
        if (acvVarFindObjectIdInfo != null) {
            ztVar.setObjectIdInfo(acvVarFindObjectIdInfo);
        }
        return ztVar;
    }

    protected SettableBeanProperty b(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) throws ym {
        aco getter = beanPropertyDefinition.getGetter();
        JavaType javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, getter, getter.getType());
        aam aamVar = new aam(beanPropertyDefinition, javaTypeResolveMemberAndTypeAnnotations, (TypeDeserializer) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler(), beanDescription.getClassAnnotations(), getter);
        JsonDeserializer<?> jsonDeserializerFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, getter);
        if (jsonDeserializerFindDeserializerFromAnnotation == null) {
            jsonDeserializerFindDeserializerFromAnnotation = (JsonDeserializer) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        return jsonDeserializerFindDeserializerFromAnnotation != null ? aamVar.withValueDeserializer(deserializationContext.handlePrimaryContextualization(jsonDeserializerFindDeserializerFromAnnotation, aamVar, javaTypeResolveMemberAndTypeAnnotations)) : aamVar;
    }

    protected boolean e(Class<?> cls) {
        String strD = ahw.d(cls);
        if (strD != null) {
            throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + strD + ") as a Bean");
        }
        if (ahw.p(cls)) {
            throw new IllegalArgumentException("Cannot deserialize Proxy class " + cls.getName() + " as a Bean");
        }
        String strE = ahw.e(cls, true);
        if (strE == null) {
            return true;
        }
        throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + strE + ") as a Bean");
    }

    protected boolean c(yi yiVar, BeanPropertyDefinition beanPropertyDefinition, Class<?> cls, Map<Class<?>, Boolean> map) {
        Boolean isIgnoredType;
        Boolean bool = map.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        if (cls == String.class || cls.isPrimitive()) {
            isIgnoredType = Boolean.FALSE;
        } else {
            isIgnoredType = yiVar.getConfigOverride(cls).getIsIgnoredType();
            if (isIgnoredType == null) {
                isIgnoredType = yiVar.getAnnotationIntrospector().isIgnorableType(yiVar.introspectClassAnnotations(cls).getClassInfo());
                if (isIgnoredType == null) {
                    isIgnoredType = Boolean.FALSE;
                }
            }
        }
        map.put(cls, isIgnoredType);
        return isIgnoredType.booleanValue();
    }

    protected void b(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws ym {
        ady.d().e(deserializationContext, javaType, beanDescription);
    }
}
