package defpackage;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.introspect.a;
import com.mi.health.course.export.data.CourseConfigModel;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public class lgh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MapperConfig<?> f25042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25043b;
    public final boolean c;
    public final JavaType d;
    public final a e;
    public final VisibilityChecker<?> f;
    public final AnnotationIntrospector g;
    public final boolean h;
    public final String i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinkedHashMap<String, mgh> f25044k;
    public LinkedList<mgh> l;
    public LinkedList<AnnotatedMember> m;
    public LinkedList<AnnotatedMethod> n;
    public LinkedList<AnnotatedMember> o;
    public LinkedList<AnnotatedMember> p;
    public HashSet<String> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinkedHashMap<Object, AnnotatedMember> f25045r;

    public lgh(MapperConfig<?> mapperConfig, boolean z, JavaType javaType, a aVar, String str) {
        this.f25042a = mapperConfig;
        this.c = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
        this.f25043b = z;
        this.d = javaType;
        this.e = aVar;
        this.i = str == null ? CourseConfigModel.DevCmd.CMD_ACTION_SET : str;
        if (mapperConfig.isAnnotationProcessingEnabled()) {
            this.h = true;
            this.g = mapperConfig.getAnnotationIntrospector();
        } else {
            this.h = false;
            this.g = AnnotationIntrospector.nopInstance();
        }
        this.f = mapperConfig.getDefaultVisibilityChecker(javaType.getRawClass(), aVar);
    }

    public Set<String> A() {
        return this.q;
    }

    public Map<Object, AnnotatedMember> B() {
        if (!this.j) {
            u();
        }
        return this.f25045r;
    }

    public AnnotatedMember C() {
        if (!this.j) {
            u();
        }
        LinkedList<AnnotatedMember> linkedList = this.p;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            I("Multiple 'as-value' properties defined (%s vs %s)", this.p.get(0), this.p.get(1));
        }
        return this.p.get(0);
    }

    @Deprecated
    public AnnotatedMethod D() {
        AnnotatedMember annotatedMemberC = C();
        if (annotatedMemberC instanceof AnnotatedMethod) {
            return (AnnotatedMethod) annotatedMemberC;
        }
        return null;
    }

    public z3h E() {
        z3h z3hVarFindObjectIdInfo = this.g.findObjectIdInfo(this.e);
        return z3hVarFindObjectIdInfo != null ? this.g.findObjectReferenceInfo(this.e, z3hVarFindObjectIdInfo) : z3hVarFindObjectIdInfo;
    }

    public List<ih2> F() {
        return new ArrayList(G().values());
    }

    public Map<String, mgh> G() {
        if (!this.j) {
            u();
        }
        return this.f25044k;
    }

    public JavaType H() {
        return this.d;
    }

    public void I(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this.e + ": " + str);
    }

    public void a(Map<String, mgh> map, AnnotatedParameter annotatedParameter) {
        JsonCreator.Mode modeFindCreatorAnnotation;
        String strFindImplicitPropertyName = this.g.findImplicitPropertyName(annotatedParameter);
        if (strFindImplicitPropertyName == null) {
            strFindImplicitPropertyName = "";
        }
        PropertyName propertyNameFindNameForDeserialization = this.g.findNameForDeserialization(annotatedParameter);
        boolean z = (propertyNameFindNameForDeserialization == null || propertyNameFindNameForDeserialization.isEmpty()) ? false : true;
        if (!z) {
            if (strFindImplicitPropertyName.isEmpty() || (modeFindCreatorAnnotation = this.g.findCreatorAnnotation(this.f25042a, annotatedParameter.getOwner())) == null || modeFindCreatorAnnotation == JsonCreator.Mode.DISABLED) {
                return;
            } else {
                propertyNameFindNameForDeserialization = PropertyName.construct(strFindImplicitPropertyName);
            }
        }
        PropertyName propertyName = propertyNameFindNameForDeserialization;
        mgh mghVarL = (z && strFindImplicitPropertyName.isEmpty()) ? l(map, propertyName) : m(map, strFindImplicitPropertyName);
        mghVarL.Z(annotatedParameter, propertyName, z, true, false);
        this.l.add(mghVarL);
    }

    public void b(Map<String, mgh> map) {
        if (this.h) {
            Iterator<AnnotatedConstructor> it = this.e.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedConstructor next = it.next();
                if (this.l == null) {
                    this.l = new LinkedList<>();
                }
                int parameterCount = next.getParameterCount();
                for (int i = 0; i < parameterCount; i++) {
                    a(map, next.getParameter(i));
                }
            }
            for (AnnotatedMethod annotatedMethod : this.e.k()) {
                if (this.l == null) {
                    this.l = new LinkedList<>();
                }
                int parameterCount2 = annotatedMethod.getParameterCount();
                for (int i2 = 0; i2 < parameterCount2; i2++) {
                    a(map, annotatedMethod.getParameter(i2));
                }
            }
        }
    }

    public void c(Map<String, mgh> map) {
        PropertyName propertyNameK;
        boolean z;
        boolean z2;
        boolean z3;
        AnnotationIntrospector annotationIntrospector = this.g;
        boolean z4 = (this.f25043b || this.f25042a.isEnabled(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS)) ? false : true;
        boolean zIsEnabled = this.f25042a.isEnabled(MapperFeature.PROPAGATE_TRANSIENT_MARKER);
        for (AnnotatedField annotatedField : this.e.e()) {
            String strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedField);
            Boolean bool = Boolean.TRUE;
            if (bool.equals(annotationIntrospector.hasAsValue(annotatedField))) {
                if (this.p == null) {
                    this.p = new LinkedList<>();
                }
                this.p.add(annotatedField);
            } else if (bool.equals(annotationIntrospector.hasAnySetter(annotatedField))) {
                if (this.o == null) {
                    this.o = new LinkedList<>();
                }
                this.o.add(annotatedField);
            } else {
                if (strFindImplicitPropertyName == null) {
                    strFindImplicitPropertyName = annotatedField.getName();
                }
                PropertyName propertyNameFindNameForSerialization = this.f25043b ? annotationIntrospector.findNameForSerialization(annotatedField) : annotationIntrospector.findNameForDeserialization(annotatedField);
                boolean z5 = propertyNameFindNameForSerialization != null;
                if (z5 && propertyNameFindNameForSerialization.isEmpty()) {
                    z = false;
                    propertyNameK = k(strFindImplicitPropertyName);
                } else {
                    propertyNameK = propertyNameFindNameForSerialization;
                    z = z5;
                }
                boolean zIsFieldVisible = propertyNameK != null;
                if (!zIsFieldVisible) {
                    zIsFieldVisible = this.f.isFieldVisible(annotatedField);
                }
                boolean zHasIgnoreMarker = annotationIntrospector.hasIgnoreMarker(annotatedField);
                if (!annotatedField.isTransient() || z5) {
                    z2 = zHasIgnoreMarker;
                    z3 = zIsFieldVisible;
                } else {
                    z2 = zIsEnabled ? true : zHasIgnoreMarker;
                    z3 = false;
                }
                if (!z4 || propertyNameK != null || z2 || !Modifier.isFinal(annotatedField.getModifiers())) {
                    m(map, strFindImplicitPropertyName).a0(annotatedField, propertyNameK, z, z3, z2);
                }
            }
        }
    }

    public void d(Map<String, mgh> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        PropertyName propertyName;
        boolean z;
        boolean z2;
        String strFindImplicitPropertyName;
        boolean zIsGetterVisible;
        if (annotatedMethod.hasReturnType()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(annotationIntrospector.hasAnyGetter(annotatedMethod))) {
                if (this.m == null) {
                    this.m = new LinkedList<>();
                }
                this.m.add(annotatedMethod);
                return;
            }
            if (bool.equals(annotationIntrospector.hasAsValue(annotatedMethod))) {
                if (this.p == null) {
                    this.p = new LinkedList<>();
                }
                this.p.add(annotatedMethod);
                return;
            }
            PropertyName propertyNameFindNameForSerialization = annotationIntrospector.findNameForSerialization(annotatedMethod);
            boolean z3 = false;
            boolean z4 = propertyNameFindNameForSerialization != null;
            if (z4) {
                String strFindImplicitPropertyName2 = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                if (strFindImplicitPropertyName2 == null) {
                    strFindImplicitPropertyName2 = qh2.e(annotatedMethod, this.c);
                }
                if (strFindImplicitPropertyName2 == null) {
                    strFindImplicitPropertyName2 = annotatedMethod.getName();
                }
                if (propertyNameFindNameForSerialization.isEmpty()) {
                    propertyNameFindNameForSerialization = k(strFindImplicitPropertyName2);
                } else {
                    z3 = z4;
                }
                propertyName = propertyNameFindNameForSerialization;
                z = z3;
                z2 = true;
                strFindImplicitPropertyName = strFindImplicitPropertyName2;
            } else {
                strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                if (strFindImplicitPropertyName == null) {
                    strFindImplicitPropertyName = qh2.h(annotatedMethod, annotatedMethod.getName(), this.c);
                }
                if (strFindImplicitPropertyName == null) {
                    strFindImplicitPropertyName = qh2.f(annotatedMethod, annotatedMethod.getName(), this.c);
                    if (strFindImplicitPropertyName == null) {
                        return;
                    } else {
                        zIsGetterVisible = this.f.isIsGetterVisible(annotatedMethod);
                    }
                } else {
                    zIsGetterVisible = this.f.isGetterVisible(annotatedMethod);
                }
                propertyName = propertyNameFindNameForSerialization;
                z2 = zIsGetterVisible;
                z = z4;
            }
            m(map, strFindImplicitPropertyName).b0(annotatedMethod, propertyName, z, z2, annotationIntrospector.hasIgnoreMarker(annotatedMethod));
        }
    }

    public void e(Map<String, mgh> map) {
        AnnotationIntrospector annotationIntrospector = this.g;
        for (AnnotatedMember annotatedMember : this.e.e()) {
            i(annotationIntrospector.findInjectableValue(annotatedMember), annotatedMember);
        }
        for (AnnotatedMethod annotatedMethod : this.e.o()) {
            if (annotatedMethod.getParameterCount() == 1) {
                i(annotationIntrospector.findInjectableValue(annotatedMethod), annotatedMethod);
            }
        }
    }

    public void f(Map<String, mgh> map) {
        AnnotationIntrospector annotationIntrospector = this.g;
        for (AnnotatedMethod annotatedMethod : this.e.o()) {
            int parameterCount = annotatedMethod.getParameterCount();
            if (parameterCount == 0) {
                d(map, annotatedMethod, annotationIntrospector);
            } else if (parameterCount == 1) {
                g(map, annotatedMethod, annotationIntrospector);
            } else if (parameterCount == 2 && annotationIntrospector != null && Boolean.TRUE.equals(annotationIntrospector.hasAnySetter(annotatedMethod))) {
                if (this.n == null) {
                    this.n = new LinkedList<>();
                }
                this.n.add(annotatedMethod);
            }
        }
    }

    public void g(Map<String, mgh> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        String strFindImplicitPropertyName;
        PropertyName propertyNameFindNameForDeserialization = annotationIntrospector == null ? null : annotationIntrospector.findNameForDeserialization(annotatedMethod);
        boolean zIsSetterVisible = true;
        boolean z = propertyNameFindNameForDeserialization != null;
        if (z) {
            strFindImplicitPropertyName = annotationIntrospector != null ? annotationIntrospector.findImplicitPropertyName(annotatedMethod) : null;
            if (strFindImplicitPropertyName == null) {
                strFindImplicitPropertyName = qh2.g(annotatedMethod, this.i, this.c);
            }
            if (strFindImplicitPropertyName == null) {
                strFindImplicitPropertyName = annotatedMethod.getName();
            }
            if (propertyNameFindNameForDeserialization.isEmpty()) {
                propertyNameFindNameForDeserialization = k(strFindImplicitPropertyName);
                z = false;
            }
        } else {
            strFindImplicitPropertyName = annotationIntrospector != null ? annotationIntrospector.findImplicitPropertyName(annotatedMethod) : null;
            if (strFindImplicitPropertyName == null) {
                strFindImplicitPropertyName = qh2.g(annotatedMethod, this.i, this.c);
            }
            if (strFindImplicitPropertyName == null) {
                return;
            } else {
                zIsSetterVisible = this.f.isSetterVisible(annotatedMethod);
            }
        }
        m(map, strFindImplicitPropertyName).c0(annotatedMethod, propertyNameFindNameForDeserialization, z, zIsSetterVisible, annotationIntrospector != null ? annotationIntrospector.hasIgnoreMarker(annotatedMethod) : false);
    }

    public final void h(String str) {
        if (this.f25043b) {
            return;
        }
        if (this.q == null) {
            this.q = new HashSet<>();
        }
        this.q.add(str);
    }

    public void i(JacksonInject.Value value, AnnotatedMember annotatedMember) {
        if (value == null) {
            return;
        }
        Object id = value.getId();
        if (this.f25045r == null) {
            this.f25045r = new LinkedHashMap<>();
        }
        AnnotatedMember annotatedMemberPut = this.f25045r.put(id, annotatedMember);
        if (annotatedMemberPut == null || annotatedMemberPut.getClass() != annotatedMember.getClass()) {
            return;
        }
        throw new IllegalArgumentException("Duplicate injectable value with id '" + String.valueOf(id) + "' (of type " + id.getClass().getName() + ")");
    }

    public final PropertyNamingStrategy j() {
        Object objFindNamingStrategy = this.g.findNamingStrategy(this.e);
        if (objFindNamingStrategy == null) {
            return this.f25042a.getPropertyNamingStrategy();
        }
        if (objFindNamingStrategy instanceof PropertyNamingStrategy) {
            return (PropertyNamingStrategy) objFindNamingStrategy;
        }
        if (!(objFindNamingStrategy instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned PropertyNamingStrategy definition of type " + objFindNamingStrategy.getClass().getName() + "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead");
        }
        Class cls = (Class) objFindNamingStrategy;
        if (cls == PropertyNamingStrategy.class) {
            return null;
        }
        if (PropertyNamingStrategy.class.isAssignableFrom(cls)) {
            this.f25042a.getHandlerInstantiator();
            return (PropertyNamingStrategy) h04.k(cls, this.f25042a.canOverrideAccessModifiers());
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<PropertyNamingStrategy>");
    }

    public final PropertyName k(String str) {
        return PropertyName.construct(str, null);
    }

    public mgh l(Map<String, mgh> map, PropertyName propertyName) {
        String simpleName = propertyName.getSimpleName();
        mgh mghVar = map.get(simpleName);
        if (mghVar != null) {
            return mghVar;
        }
        mgh mghVar2 = new mgh(this.f25042a, this.g, this.f25043b, propertyName);
        map.put(simpleName, mghVar2);
        return mghVar2;
    }

    public mgh m(Map<String, mgh> map, String str) {
        mgh mghVar = map.get(str);
        if (mghVar != null) {
            return mghVar;
        }
        mgh mghVar2 = new mgh(this.f25042a, this.g, this.f25043b, PropertyName.construct(str));
        map.put(str, mghVar2);
        return mghVar2;
    }

    public void n(Map<String, mgh> map) {
        boolean zIsEnabled = this.f25042a.isEnabled(MapperFeature.INFER_PROPERTY_MUTATORS);
        for (mgh mghVar : map.values()) {
            if (mghVar.r0(zIsEnabled) == JsonProperty.Access.READ_ONLY) {
                h(mghVar.getName());
            }
        }
    }

    public void o(Map<String, mgh> map) {
        Iterator<mgh> it = map.values().iterator();
        while (it.hasNext()) {
            mgh next = it.next();
            if (!next.e0()) {
                it.remove();
            } else if (next.d0()) {
                if (next.C()) {
                    next.q0();
                    if (!next.a()) {
                        h(next.getName());
                    }
                } else {
                    it.remove();
                    h(next.getName());
                }
            }
        }
    }

    public void p(Map<String, mgh> map) {
        Iterator<Map.Entry<String, mgh>> it = map.entrySet().iterator();
        LinkedList<mgh> linkedList = null;
        while (it.hasNext()) {
            mgh value = it.next().getValue();
            Set<PropertyName> setI0 = value.i0();
            if (!setI0.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (setI0.size() == 1) {
                    linkedList.add(value.t0(setI0.iterator().next()));
                } else {
                    linkedList.addAll(value.g0(setI0));
                }
            }
        }
        if (linkedList != null) {
            for (mgh mghVar : linkedList) {
                String name = mghVar.getName();
                mgh mghVar2 = map.get(name);
                if (mghVar2 == null) {
                    map.put(name, mghVar);
                } else {
                    mghVar2.Y(mghVar);
                }
                t(mghVar, this.l);
                HashSet<String> hashSet = this.q;
                if (hashSet != null) {
                    hashSet.remove(name);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    public void q(Map<String, mgh> map, PropertyNamingStrategy propertyNamingStrategy) {
        String strNameForGetterMethod;
        mgh[] mghVarArr = (mgh[]) map.values().toArray(new mgh[map.size()]);
        map.clear();
        for (mgh mghVarU0 : mghVarArr) {
            PropertyName fullName = mghVarU0.getFullName();
            if (mghVarU0.D() && !this.f25042a.isEnabled(MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING)) {
                strNameForGetterMethod = null;
            } else if (this.f25043b) {
                if (mghVarU0.m0()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForGetterMethod(this.f25042a, mghVarU0.o(), fullName.getSimpleName());
                } else if (mghVarU0.z()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForField(this.f25042a, mghVarU0.n(), fullName.getSimpleName());
                } else {
                    strNameForGetterMethod = null;
                }
            } else if (mghVarU0.B()) {
                strNameForGetterMethod = propertyNamingStrategy.nameForSetterMethod(this.f25042a, mghVarU0.x(), fullName.getSimpleName());
            } else if (mghVarU0.y()) {
                strNameForGetterMethod = propertyNamingStrategy.nameForConstructorParameter(this.f25042a, mghVarU0.l(), fullName.getSimpleName());
            } else if (mghVarU0.z()) {
                strNameForGetterMethod = propertyNamingStrategy.nameForField(this.f25042a, mghVarU0.n(), fullName.getSimpleName());
            } else if (mghVarU0.m0()) {
                strNameForGetterMethod = propertyNamingStrategy.nameForGetterMethod(this.f25042a, mghVarU0.o(), fullName.getSimpleName());
            } else {
                strNameForGetterMethod = null;
            }
            if (strNameForGetterMethod == null || fullName.hasSimpleName(strNameForGetterMethod)) {
                strNameForGetterMethod = fullName.getSimpleName();
            } else {
                mghVarU0 = mghVarU0.u0(strNameForGetterMethod);
            }
            mgh mghVar = map.get(strNameForGetterMethod);
            if (mghVar == null) {
                map.put(strNameForGetterMethod, mghVarU0);
            } else {
                mghVar.Y(mghVarU0);
            }
            t(mghVarU0, this.l);
        }
    }

    public void r(Map<String, mgh> map) {
        PropertyName propertyNameFindWrapperName;
        Iterator<Map.Entry<String, mgh>> it = map.entrySet().iterator();
        LinkedList<mgh> linkedList = null;
        while (it.hasNext()) {
            mgh value = it.next().getValue();
            AnnotatedMember annotatedMemberS = value.s();
            if (annotatedMemberS != null && (propertyNameFindWrapperName = this.g.findWrapperName(annotatedMemberS)) != null && propertyNameFindWrapperName.hasSimpleName() && !propertyNameFindWrapperName.equals(value.getFullName())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(value.t0(propertyNameFindWrapperName));
                it.remove();
            }
        }
        if (linkedList != null) {
            for (mgh mghVar : linkedList) {
                String name = mghVar.getName();
                mgh mghVar2 = map.get(name);
                if (mghVar2 == null) {
                    map.put(name, mghVar);
                } else {
                    mghVar2.Y(mghVar);
                }
            }
        }
    }

    public void s(Map<String, mgh> map) {
        AnnotationIntrospector annotationIntrospector = this.g;
        Boolean boolFindSerializationSortAlphabetically = annotationIntrospector.findSerializationSortAlphabetically(this.e);
        boolean zShouldSortPropertiesAlphabetically = boolFindSerializationSortAlphabetically == null ? this.f25042a.shouldSortPropertiesAlphabetically() : boolFindSerializationSortAlphabetically.booleanValue();
        String[] strArrFindSerializationPropertyOrder = annotationIntrospector.findSerializationPropertyOrder(this.e);
        if (!zShouldSortPropertiesAlphabetically && this.l == null && strArrFindSerializationPropertyOrder == null) {
            return;
        }
        int size = map.size();
        Map<? extends Object, ? extends Object> treeMap = zShouldSortPropertiesAlphabetically ? new TreeMap<>() : new LinkedHashMap<>(size + size);
        for (mgh mghVar : map.values()) {
            treeMap.put(mghVar.getName(), mghVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(size + size);
        if (strArrFindSerializationPropertyOrder != null) {
            for (String name : strArrFindSerializationPropertyOrder) {
                mgh mghVar2 = (mgh) treeMap.get(name);
                if (mghVar2 == null) {
                    for (mgh mghVar3 : map.values()) {
                        if (name.equals(mghVar3.l0())) {
                            name = mghVar3.getName();
                            mghVar2 = mghVar3;
                            break;
                        }
                    }
                }
                if (mghVar2 != null) {
                    linkedHashMap.put(name, mghVar2);
                }
            }
        }
        Collection<mgh> collectionValues = this.l;
        if (collectionValues != null) {
            if (zShouldSortPropertiesAlphabetically) {
                TreeMap treeMap2 = new TreeMap();
                for (mgh mghVar4 : this.l) {
                    treeMap2.put(mghVar4.getName(), mghVar4);
                }
                collectionValues = treeMap2.values();
            }
            for (mgh mghVar5 : collectionValues) {
                String name2 = mghVar5.getName();
                if (treeMap.containsKey(name2)) {
                    linkedHashMap.put(name2, mghVar5);
                }
            }
        }
        linkedHashMap.putAll(treeMap);
        map.clear();
        map.putAll(linkedHashMap);
    }

    public void t(mgh mghVar, List<mgh> list) {
        if (list != null) {
            String strL0 = mghVar.l0();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).l0().equals(strL0)) {
                    list.set(i, mghVar);
                    return;
                }
            }
        }
    }

    public void u() {
        LinkedHashMap<String, mgh> linkedHashMap = new LinkedHashMap<>();
        c(linkedHashMap);
        f(linkedHashMap);
        if (!this.e.n()) {
            b(linkedHashMap);
        }
        e(linkedHashMap);
        o(linkedHashMap);
        n(linkedHashMap);
        p(linkedHashMap);
        Iterator<mgh> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            it.next().o0(this.f25043b);
        }
        PropertyNamingStrategy propertyNamingStrategyJ = j();
        if (propertyNamingStrategyJ != null) {
            q(linkedHashMap, propertyNamingStrategyJ);
        }
        Iterator<mgh> it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().s0();
        }
        if (this.f25042a.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            r(linkedHashMap);
        }
        s(linkedHashMap);
        this.f25044k = linkedHashMap;
        this.j = true;
    }

    public AnnotatedMember v() {
        if (!this.j) {
            u();
        }
        LinkedList<AnnotatedMember> linkedList = this.m;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            I("Multiple 'any-getters' defined (%s vs %s)", this.m.get(0), this.m.get(1));
        }
        return this.m.getFirst();
    }

    public AnnotatedMember w() {
        if (!this.j) {
            u();
        }
        LinkedList<AnnotatedMember> linkedList = this.o;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            I("Multiple 'any-setter' fields defined (%s vs %s)", this.o.get(0), this.o.get(1));
        }
        return this.o.getFirst();
    }

    public AnnotatedMethod x() {
        if (!this.j) {
            u();
        }
        LinkedList<AnnotatedMethod> linkedList = this.n;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            I("Multiple 'any-setter' methods defined (%s vs %s)", this.n.get(0), this.n.get(1));
        }
        return this.n.getFirst();
    }

    public a y() {
        return this.e;
    }

    public MapperConfig<?> z() {
        return this.f25042a;
    }
}
