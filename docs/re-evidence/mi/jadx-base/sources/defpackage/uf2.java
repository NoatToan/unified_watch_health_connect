package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class uf2 extends fh2 {
    public static final Class<?>[] j = new Class[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lgh f35700b;
    public final MapperConfig<?> c;
    public final AnnotationIntrospector d;
    public final a e;
    public Class<?>[] f;
    public boolean g;
    public List<ih2> h;
    public z3h i;

    public uf2(lgh lghVar, JavaType javaType, a aVar) {
        super(javaType);
        this.f35700b = lghVar;
        MapperConfig<?> mapperConfigZ = lghVar.z();
        this.c = mapperConfigZ;
        if (mapperConfigZ == null) {
            this.d = null;
        } else {
            this.d = mapperConfigZ.getAnnotationIntrospector();
        }
        this.e = aVar;
    }

    public static uf2 H(lgh lghVar) {
        return new uf2(lghVar);
    }

    public static uf2 I(MapperConfig<?> mapperConfig, JavaType javaType, a aVar) {
        return new uf2(mapperConfig, javaType, aVar, Collections.emptyList());
    }

    public static uf2 J(lgh lghVar) {
        return new uf2(lghVar);
    }

    @Override // defpackage.fh2
    public boolean A() {
        return this.e.m();
    }

    @Override // defpackage.fh2
    public Object B(boolean z) {
        AnnotatedConstructor annotatedConstructorJ = this.e.j();
        if (annotatedConstructorJ == null) {
            return null;
        }
        if (z) {
            annotatedConstructorJ.fixAccess(this.c.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return annotatedConstructorJ.getAnnotated().newInstance(new Object[0]);
        } catch (Exception e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            h04.d0(e);
            h04.f0(e);
            throw new IllegalArgumentException("Failed to instantiate bean of type " + this.e.getAnnotated().getName() + ": (" + e.getClass().getName() + ") " + h04.n(e), e);
        }
    }

    public ak4<Object, Object> D(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof ak4) {
            return (ak4) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj;
        if (cls == ak4.a.class || h04.K(cls)) {
            return null;
        }
        if (ak4.class.isAssignableFrom(cls)) {
            this.c.getHandlerInstantiator();
            return (ak4) h04.k(cls, this.c.canOverrideAccessModifiers());
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
    }

    public List<ih2> E() {
        if (this.h == null) {
            this.h = this.f35700b.F();
        }
        return this.h;
    }

    public boolean F(ih2 ih2Var) {
        if (K(ih2Var.getFullName())) {
            return false;
        }
        E().add(ih2Var);
        return true;
    }

    public ih2 G(PropertyName propertyName) {
        for (ih2 ih2Var : E()) {
            if (ih2Var.A(propertyName)) {
                return ih2Var;
            }
        }
        return null;
    }

    public boolean K(PropertyName propertyName) {
        return G(propertyName) != null;
    }

    public boolean L(AnnotatedMethod annotatedMethod) {
        Class<?> rawParameterType;
        if (!s().isAssignableFrom(annotatedMethod.getRawReturnType())) {
            return false;
        }
        JsonCreator.Mode modeFindCreatorAnnotation = this.d.findCreatorAnnotation(this.c, annotatedMethod);
        if (modeFindCreatorAnnotation != null && modeFindCreatorAnnotation != JsonCreator.Mode.DISABLED) {
            return true;
        }
        String name = annotatedMethod.getName();
        if ("valueOf".equals(name) && annotatedMethod.getParameterCount() == 1) {
            return true;
        }
        return "fromString".equals(name) && annotatedMethod.getParameterCount() == 1 && ((rawParameterType = annotatedMethod.getRawParameterType(0)) == String.class || CharSequence.class.isAssignableFrom(rawParameterType));
    }

    public boolean M(String str) {
        Iterator<ih2> it = E().iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fh2
    public AnnotatedMember a() throws IllegalArgumentException {
        lgh lghVar = this.f35700b;
        AnnotatedMember annotatedMemberV = lghVar == null ? null : lghVar.v();
        if (annotatedMemberV == null || Map.class.isAssignableFrom(annotatedMemberV.getRawType())) {
            return annotatedMemberV;
        }
        throw new IllegalArgumentException("Invalid 'any-getter' annotation on method " + annotatedMemberV.getName() + "(): return type is not instance of java.util.Map");
    }

    @Override // defpackage.fh2
    public AnnotatedMember b() throws IllegalArgumentException {
        lgh lghVar = this.f35700b;
        if (lghVar == null) {
            return null;
        }
        AnnotatedMethod annotatedMethodX = lghVar.x();
        if (annotatedMethodX != null) {
            Class<?> rawParameterType = annotatedMethodX.getRawParameterType(0);
            if (rawParameterType == String.class || rawParameterType == Object.class) {
                return annotatedMethodX;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s", annotatedMethodX.getName(), rawParameterType.getName()));
        }
        AnnotatedMember annotatedMemberW = this.f35700b.w();
        if (annotatedMemberW == null) {
            return null;
        }
        if (Map.class.isAssignableFrom(annotatedMemberW.getRawType())) {
            return annotatedMemberW;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on field '%s': type is not instance of java.util.Map", annotatedMemberW.getName()));
    }

    @Override // defpackage.fh2
    public List<ih2> c() {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (ih2 ih2Var : E()) {
            AnnotationIntrospector.ReferenceProperty referencePropertyH = ih2Var.h();
            if (referencePropertyH != null && referencePropertyH.c()) {
                String strB = referencePropertyH.b();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(strB);
                } else if (!hashSet.add(strB)) {
                    throw new IllegalArgumentException("Multiple back-reference properties with name '" + strB + "'");
                }
                arrayList.add(ih2Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.fh2
    public AnnotatedConstructor d() {
        return this.e.j();
    }

    @Override // defpackage.fh2
    public Class<?>[] e() {
        if (!this.g) {
            this.g = true;
            AnnotationIntrospector annotationIntrospector = this.d;
            Class<?>[] clsArrFindViews = annotationIntrospector == null ? null : annotationIntrospector.findViews(this.e);
            if (clsArrFindViews == null && !this.c.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION)) {
                clsArrFindViews = j;
            }
            this.f = clsArrFindViews;
        }
        return this.f;
    }

    @Override // defpackage.fh2
    public ak4<Object, Object> f() {
        AnnotationIntrospector annotationIntrospector = this.d;
        if (annotationIntrospector == null) {
            return null;
        }
        return D(annotationIntrospector.findDeserializationConverter(this.e));
    }

    @Override // defpackage.fh2
    public JsonFormat.Value g(JsonFormat.Value value) {
        JsonFormat.Value valueFindFormat;
        AnnotationIntrospector annotationIntrospector = this.d;
        if (annotationIntrospector != null && (valueFindFormat = annotationIntrospector.findFormat(this.e)) != null) {
            value = value == null ? valueFindFormat : value.withOverrides(valueFindFormat);
        }
        JsonFormat.Value defaultPropertyFormat = this.c.getDefaultPropertyFormat(this.e.getRawType());
        if (defaultPropertyFormat != null) {
            return value == null ? defaultPropertyFormat : value.withOverrides(defaultPropertyFormat);
        }
        return value;
    }

    @Override // defpackage.fh2
    public Method h(Class<?>... clsArr) {
        for (AnnotatedMethod annotatedMethod : this.e.k()) {
            if (L(annotatedMethod) && annotatedMethod.getParameterCount() == 1) {
                Class<?> rawParameterType = annotatedMethod.getRawParameterType(0);
                for (Class<?> cls : clsArr) {
                    if (rawParameterType.isAssignableFrom(cls)) {
                        return annotatedMethod.getAnnotated();
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.fh2
    public Map<Object, AnnotatedMember> i() {
        lgh lghVar = this.f35700b;
        return lghVar != null ? lghVar.B() : Collections.emptyMap();
    }

    @Override // defpackage.fh2
    public AnnotatedMember j() {
        lgh lghVar = this.f35700b;
        if (lghVar == null) {
            return null;
        }
        return lghVar.C();
    }

    @Override // defpackage.fh2
    @Deprecated
    public AnnotatedMethod k() {
        lgh lghVar = this.f35700b;
        if (lghVar == null) {
            return null;
        }
        return lghVar.D();
    }

    @Override // defpackage.fh2
    public AnnotatedMethod l(String str, Class<?>[] clsArr) {
        return this.e.f(str, clsArr);
    }

    @Override // defpackage.fh2
    public Class<?> m() {
        AnnotationIntrospector annotationIntrospector = this.d;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilder(this.e);
    }

    @Override // defpackage.fh2
    public mtd.a n() {
        AnnotationIntrospector annotationIntrospector = this.d;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilderConfig(this.e);
    }

    @Override // defpackage.fh2
    public List<ih2> o() {
        return E();
    }

    @Override // defpackage.fh2
    public JsonInclude.Value p(JsonInclude.Value value) {
        JsonInclude.Value valueFindPropertyInclusion;
        AnnotationIntrospector annotationIntrospector = this.d;
        if (annotationIntrospector == null || (valueFindPropertyInclusion = annotationIntrospector.findPropertyInclusion(this.e)) == null) {
            return value;
        }
        return value == null ? valueFindPropertyInclusion : value.withOverrides(valueFindPropertyInclusion);
    }

    @Override // defpackage.fh2
    public ak4<Object, Object> q() {
        AnnotationIntrospector annotationIntrospector = this.d;
        if (annotationIntrospector == null) {
            return null;
        }
        return D(annotationIntrospector.findSerializationConverter(this.e));
    }

    @Override // defpackage.fh2
    public Constructor<?> r(Class<?>... clsArr) {
        for (AnnotatedConstructor annotatedConstructor : this.e.i()) {
            if (annotatedConstructor.getParameterCount() == 1) {
                Class<?> rawParameterType = annotatedConstructor.getRawParameterType(0);
                for (Class<?> cls : clsArr) {
                    if (cls == rawParameterType) {
                        return annotatedConstructor.getAnnotated();
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.fh2
    public ld1 t() {
        return this.e.h();
    }

    @Override // defpackage.fh2
    public a u() {
        return this.e;
    }

    @Override // defpackage.fh2
    public List<AnnotatedConstructor> v() {
        return this.e.i();
    }

    @Override // defpackage.fh2
    public List<AnnotatedMethod> w() {
        List<AnnotatedMethod> listK = this.e.k();
        if (listK.isEmpty()) {
            return listK;
        }
        ArrayList arrayList = null;
        for (AnnotatedMethod annotatedMethod : listK) {
            if (L(annotatedMethod)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(annotatedMethod);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    @Override // defpackage.fh2
    public Set<String> x() {
        lgh lghVar = this.f35700b;
        Set<String> setA = lghVar == null ? null : lghVar.A();
        return setA == null ? Collections.emptySet() : setA;
    }

    @Override // defpackage.fh2
    public z3h y() {
        return this.i;
    }

    public uf2(MapperConfig<?> mapperConfig, JavaType javaType, a aVar, List<ih2> list) {
        super(javaType);
        this.f35700b = null;
        this.c = mapperConfig;
        if (mapperConfig == null) {
            this.d = null;
        } else {
            this.d = mapperConfig.getAnnotationIntrospector();
        }
        this.e = aVar;
        this.h = list;
    }

    public uf2(lgh lghVar) {
        this(lghVar, lghVar.H(), lghVar.y());
        this.i = lghVar.E();
    }
}
