package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class acq extends BeanDescription {
    private static final Class<?>[] g = new Class[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Class<?>[] f263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final MapperConfig<?> f265c;
    protected final AnnotationIntrospector d;
    protected final ack e;
    protected acv f;
    protected final acx h;
    protected List<BeanPropertyDefinition> j;

    protected acq(acx acxVar, JavaType javaType, ack ackVar) {
        super(javaType);
        this.h = acxVar;
        MapperConfig<?> mapperConfigJ = acxVar.j();
        this.f265c = mapperConfigJ;
        if (mapperConfigJ == null) {
            this.d = null;
        } else {
            this.d = mapperConfigJ.getAnnotationIntrospector();
        }
        this.e = ackVar;
    }

    protected acq(MapperConfig<?> mapperConfig, JavaType javaType, ack ackVar, List<BeanPropertyDefinition> list) {
        super(javaType);
        this.h = null;
        this.f265c = mapperConfig;
        if (mapperConfig == null) {
            this.d = null;
        } else {
            this.d = mapperConfig.getAnnotationIntrospector();
        }
        this.e = ackVar;
        this.j = list;
    }

    protected acq(acx acxVar) {
        this(acxVar, acxVar.s(), acxVar.f());
        this.f = acxVar.m();
    }

    public static acq a(acx acxVar) {
        return new acq(acxVar);
    }

    public static acq c(acx acxVar) {
        return new acq(acxVar);
    }

    public static acq c(MapperConfig<?> mapperConfig, JavaType javaType, ack ackVar) {
        return new acq(mapperConfig, javaType, ackVar, Collections.EMPTY_LIST);
    }

    protected List<BeanPropertyDefinition> e() {
        if (this.j == null) {
            this.j = this.h.n();
        }
        return this.j;
    }

    public boolean c(String str) {
        Iterator<BeanPropertyDefinition> it = e().iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean e(BeanPropertyDefinition beanPropertyDefinition) {
        if (a(beanPropertyDefinition.getFullName())) {
            return false;
        }
        e().add(beanPropertyDefinition);
        return true;
    }

    public boolean a(ys ysVar) {
        return c(ysVar) != null;
    }

    public BeanPropertyDefinition c(ys ysVar) {
        for (BeanPropertyDefinition beanPropertyDefinition : e()) {
            if (beanPropertyDefinition.hasName(ysVar)) {
                return beanPropertyDefinition;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public ack getClassInfo() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public acv getObjectIdInfo() {
        return this.f;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public List<BeanPropertyDefinition> findProperties() {
        return e();
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public AnnotatedMember findJsonKeyAccessor() {
        acx acxVar = this.h;
        if (acxVar == null) {
            return null;
        }
        return acxVar.g();
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    @Deprecated
    public aco findJsonValueMethod() {
        acx acxVar = this.h;
        if (acxVar == null) {
            return null;
        }
        return acxVar.k();
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public AnnotatedMember findJsonValueAccessor() {
        acx acxVar = this.h;
        if (acxVar == null) {
            return null;
        }
        return acxVar.o();
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Set<String> getIgnoredPropertyNames() {
        acx acxVar = this.h;
        Set<String> setH = acxVar == null ? null : acxVar.h();
        return setH == null ? Collections.EMPTY_SET : setH;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public boolean hasKnownClassAnnotations() {
        return this.e.j();
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Annotations getClassAnnotations() {
        return this.e.d();
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    @Deprecated
    public ahn bindingsForBeanType() {
        return this._type.getBindings();
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    @Deprecated
    public JavaType resolveType(Type type) {
        return this.f265c.getTypeFactory().a(type, this._type.getBindings());
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public ach findDefaultConstructor() {
        return this.e.e();
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public AnnotatedMember findAnySetterAccessor() throws IllegalArgumentException {
        acx acxVar = this.h;
        if (acxVar == null) {
            return null;
        }
        aco acoVarD = acxVar.d();
        if (acoVarD != null) {
            Class<?> rawParameterType = acoVarD.getRawParameterType(0);
            if (rawParameterType == String.class || rawParameterType == Object.class) {
                return acoVarD;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s", acoVarD.getName(), rawParameterType.getName()));
        }
        AnnotatedMember annotatedMemberE = this.h.e();
        if (annotatedMemberE == null) {
            return null;
        }
        if (Map.class.isAssignableFrom(annotatedMemberE.getRawType())) {
            return annotatedMemberE;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on field '%s': type is not instance of java.util.Map", annotatedMemberE.getName()));
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Map<Object, AnnotatedMember> findInjectables() {
        acx acxVar = this.h;
        if (acxVar != null) {
            return acxVar.i();
        }
        return Collections.EMPTY_MAP;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public List<ach> getConstructors() {
        return this.e.a();
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Object instantiateBean(boolean z) {
        ach achVarE = this.e.e();
        if (achVarE == null) {
            return null;
        }
        if (z) {
            achVarE.fixAccess(this.f265c.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return achVarE.getAnnotated().newInstance(new Object[0]);
        } catch (Exception e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            ahw.e(e);
            ahw.i(e);
            throw new IllegalArgumentException("Failed to instantiate bean of type " + this.e.getAnnotated().getName() + ": (" + e.getClass().getName() + ") " + ahw.a(e), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public aco findMethod(String str, Class<?>[] clsArr) {
        return this.e.d(str, clsArr);
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public JsonFormat.c findExpectedFormat(JsonFormat.c cVar) {
        JsonFormat.c cVarFindFormat;
        AnnotationIntrospector annotationIntrospector = this.d;
        if (annotationIntrospector != null && (cVarFindFormat = annotationIntrospector.findFormat(this.e)) != null) {
            cVar = cVar == null ? cVarFindFormat : cVar.a(cVarFindFormat);
        }
        JsonFormat.c defaultPropertyFormat = this.f265c.getDefaultPropertyFormat(this.e.getRawType());
        if (defaultPropertyFormat != null) {
            return cVar == null ? defaultPropertyFormat : cVar.a(defaultPropertyFormat);
        }
        return cVar;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Class<?>[] findDefaultViews() {
        if (!this.f264b) {
            this.f264b = true;
            AnnotationIntrospector annotationIntrospector = this.d;
            Class<?>[] clsArrFindViews = annotationIntrospector == null ? null : annotationIntrospector.findViews(this.e);
            if (clsArrFindViews == null && !this.f265c.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION)) {
                clsArrFindViews = g;
            }
            this.f263a = clsArrFindViews;
        }
        return this.f263a;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Converter<Object, Object> findSerializationConverter() {
        AnnotationIntrospector annotationIntrospector = this.d;
        if (annotationIntrospector == null) {
            return null;
        }
        return d(annotationIntrospector.findSerializationConverter(this.e));
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public JsonInclude.b findPropertyInclusion(JsonInclude.b bVar) {
        JsonInclude.b bVarFindPropertyInclusion;
        AnnotationIntrospector annotationIntrospector = this.d;
        if (annotationIntrospector == null || (bVarFindPropertyInclusion = annotationIntrospector.findPropertyInclusion(this.e)) == null) {
            return bVar;
        }
        return bVar == null ? bVarFindPropertyInclusion : bVar.b(bVarFindPropertyInclusion);
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public AnnotatedMember findAnyGetter() throws IllegalArgumentException {
        acx acxVar = this.h;
        if (acxVar == null) {
            return null;
        }
        AnnotatedMember annotatedMemberB = acxVar.b();
        if (annotatedMemberB != null) {
            if (Map.class.isAssignableFrom(annotatedMemberB.getRawType())) {
                return annotatedMemberB;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-getter' annotation on method %s(): return type is not instance of java.util.Map", annotatedMemberB.getName()));
        }
        AnnotatedMember annotatedMemberC = this.h.c();
        if (annotatedMemberC == null) {
            return null;
        }
        if (Map.class.isAssignableFrom(annotatedMemberC.getRawType())) {
            return annotatedMemberC;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-getter' annotation on field '%s': type is not instance of java.util.Map", annotatedMemberC.getName()));
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public List<BeanPropertyDefinition> findBackReferences() {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (BeanPropertyDefinition beanPropertyDefinition : e()) {
            AnnotationIntrospector.ReferenceProperty referencePropertyFindReferenceType = beanPropertyDefinition.findReferenceType();
            if (referencePropertyFindReferenceType != null && referencePropertyFindReferenceType.e()) {
                String strB = referencePropertyFindReferenceType.b();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(strB);
                } else if (!hashSet.add(strB)) {
                    throw new IllegalArgumentException("Multiple back-reference properties with name " + ahw.e(strB));
                }
                arrayList.add(beanPropertyDefinition);
            }
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    @Deprecated
    public Map<String, AnnotatedMember> findBackReferenceProperties() {
        List<BeanPropertyDefinition> listFindBackReferences = findBackReferences();
        if (listFindBackReferences == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (BeanPropertyDefinition beanPropertyDefinition : listFindBackReferences) {
            map.put(beanPropertyDefinition.getName(), beanPropertyDefinition.getMutator());
        }
        return map;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public List<aco> getFactoryMethods() {
        List<aco> listF = this.e.f();
        if (listF.isEmpty()) {
            return listF;
        }
        ArrayList arrayList = null;
        for (aco acoVar : listF) {
            if (b(acoVar)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(acoVar);
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Constructor<?> findSingleArgConstructor(Class<?>... clsArr) {
        for (ach achVar : this.e.a()) {
            if (achVar.getParameterCount() == 1) {
                Class<?> rawParameterType = achVar.getRawParameterType(0);
                for (Class<?> cls : clsArr) {
                    if (cls == rawParameterType) {
                        return achVar.getAnnotated();
                    }
                }
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Method findFactoryMethod(Class<?>... clsArr) {
        for (aco acoVar : this.e.f()) {
            if (b(acoVar) && acoVar.getParameterCount() == 1) {
                Class<?> rawParameterType = acoVar.getRawParameterType(0);
                for (Class<?> cls : clsArr) {
                    if (rawParameterType.isAssignableFrom(cls)) {
                        return acoVar.getAnnotated();
                    }
                }
            }
        }
        return null;
    }

    protected boolean b(aco acoVar) {
        Class<?> rawParameterType;
        if (!getBeanClass().isAssignableFrom(acoVar.a())) {
            return false;
        }
        JsonCreator.Mode modeFindCreatorAnnotation = this.d.findCreatorAnnotation(this.f265c, acoVar);
        if (modeFindCreatorAnnotation != null && modeFindCreatorAnnotation != JsonCreator.Mode.DISABLED) {
            return true;
        }
        String name = acoVar.getName();
        if ("valueOf".equals(name) && acoVar.getParameterCount() == 1) {
            return true;
        }
        return "fromString".equals(name) && acoVar.getParameterCount() == 1 && ((rawParameterType = acoVar.getRawParameterType(0)) == String.class || CharSequence.class.isAssignableFrom(rawParameterType));
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Class<?> findPOJOBuilder() {
        AnnotationIntrospector annotationIntrospector = this.d;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilder(this.e);
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public JsonPOJOBuilder.e findPOJOBuilderConfig() {
        AnnotationIntrospector annotationIntrospector = this.d;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilderConfig(this.e);
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Converter<Object, Object> findDeserializationConverter() {
        AnnotationIntrospector annotationIntrospector = this.d;
        if (annotationIntrospector == null) {
            return null;
        }
        return d(annotationIntrospector.findDeserializationConverter(this.e));
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public String findClassDescription() {
        AnnotationIntrospector annotationIntrospector = this.d;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findClassDescription(this.e);
    }

    protected Converter<Object, Object> d(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Converter) {
            return (Converter) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class<?> cls = (Class) obj;
        if (cls == Converter.None.class || ahw.l(cls)) {
            return null;
        }
        if (!Converter.class.isAssignableFrom(cls)) {
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
        }
        HandlerInstantiator handlerInstantiator = this.f265c.getHandlerInstantiator();
        Converter<?, ?> converterConverterInstance = handlerInstantiator != null ? handlerInstantiator.converterInstance(this.f265c, this.e, cls) : null;
        return converterConverterInstance == null ? (Converter) ahw.b(cls, this.f265c.canOverrideAccessModifiers()) : converterConverterInstance;
    }
}
