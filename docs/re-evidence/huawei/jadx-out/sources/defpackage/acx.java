package defpackage;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.huawei.operation.utils.Constants;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes21.dex */
public class acx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AccessorNamingStrategy f278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected LinkedList<AnnotatedMember> f279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected LinkedList<AnnotatedMember> f280c;
    protected final AnnotationIntrospector d;
    protected LinkedList<AnnotatedMember> e;
    protected final MapperConfig<?> f;
    protected LinkedList<POJOPropertyBuilder> g;
    protected LinkedList<aco> h;
    protected final ack i;
    protected boolean j;
    protected LinkedHashMap<Object, AnnotatedMember> k;
    protected LinkedList<AnnotatedMember> l;
    protected Map<ys, ys> m;
    protected final boolean n;
    protected HashSet<String> o;
    protected LinkedList<AnnotatedMember> p;

    @Deprecated
    protected String q = "set";
    protected final JavaType r;
    protected LinkedHashMap<String, POJOPropertyBuilder> s;

    @Deprecated
    protected final boolean t;
    protected final VisibilityChecker<?> u;
    protected final boolean y;

    protected acx(MapperConfig<?> mapperConfig, boolean z, JavaType javaType, ack ackVar, AccessorNamingStrategy accessorNamingStrategy) {
        this.f = mapperConfig;
        this.n = z;
        this.r = javaType;
        this.i = ackVar;
        if (mapperConfig.isAnnotationProcessingEnabled()) {
            this.y = true;
            this.d = mapperConfig.getAnnotationIntrospector();
        } else {
            this.y = false;
            this.d = AnnotationIntrospector.nopInstance();
        }
        this.u = mapperConfig.getDefaultVisibilityChecker(javaType.getRawClass(), ackVar);
        this.f278a = accessorNamingStrategy;
        this.t = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
    }

    public MapperConfig<?> j() {
        return this.f;
    }

    public JavaType s() {
        return this.r;
    }

    public ack f() {
        return this.i;
    }

    public List<BeanPropertyDefinition> n() {
        return new ArrayList(l().values());
    }

    public Map<Object, AnnotatedMember> i() {
        if (!this.j) {
            a();
        }
        return this.k;
    }

    public AnnotatedMember g() {
        if (!this.j) {
            a();
        }
        LinkedList<AnnotatedMember> linkedList = this.l;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            a("Multiple 'as-key' properties defined (%s vs %s)", this.l.get(0), this.l.get(1));
        }
        return this.l.get(0);
    }

    public AnnotatedMember o() {
        if (!this.j) {
            a();
        }
        LinkedList<AnnotatedMember> linkedList = this.p;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            a("Multiple 'as-value' properties defined (%s vs %s)", this.p.get(0), this.p.get(1));
        }
        return this.p.get(0);
    }

    public AnnotatedMember c() {
        if (!this.j) {
            a();
        }
        LinkedList<AnnotatedMember> linkedList = this.e;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            a("Multiple 'any-getter' fields defined (%s vs %s)", this.e.get(0), this.e.get(1));
        }
        return this.e.getFirst();
    }

    public AnnotatedMember b() {
        if (!this.j) {
            a();
        }
        LinkedList<AnnotatedMember> linkedList = this.f279b;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            a("Multiple 'any-getter' methods defined (%s vs %s)", this.f279b.get(0), this.f279b.get(1));
        }
        return this.f279b.getFirst();
    }

    public AnnotatedMember e() {
        if (!this.j) {
            a();
        }
        LinkedList<AnnotatedMember> linkedList = this.f280c;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            a("Multiple 'any-setter' fields defined (%s vs %s)", this.f280c.get(0), this.f280c.get(1));
        }
        return this.f280c.getFirst();
    }

    public aco d() {
        if (!this.j) {
            a();
        }
        LinkedList<aco> linkedList = this.h;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            a("Multiple 'any-setter' methods defined (%s vs %s)", this.h.get(0), this.h.get(1));
        }
        return this.h.getFirst();
    }

    public Set<String> h() {
        return this.o;
    }

    public acv m() {
        acv acvVarFindObjectIdInfo = this.d.findObjectIdInfo(this.i);
        return acvVarFindObjectIdInfo != null ? this.d.findObjectReferenceInfo(this.i, acvVarFindObjectIdInfo) : acvVarFindObjectIdInfo;
    }

    protected Map<String, POJOPropertyBuilder> l() {
        if (!this.j) {
            a();
        }
        return this.s;
    }

    @Deprecated
    public aco k() {
        AnnotatedMember annotatedMemberO = o();
        if (annotatedMemberO instanceof aco) {
            return (aco) annotatedMemberO;
        }
        return null;
    }

    protected void a() {
        LinkedHashMap<String, POJOPropertyBuilder> linkedHashMap = new LinkedHashMap<>();
        c(linkedHashMap);
        e(linkedHashMap);
        if (!this.i.g()) {
            a(linkedHashMap);
        }
        j(linkedHashMap);
        b(linkedHashMap);
        g(linkedHashMap);
        d(linkedHashMap);
        Iterator<POJOPropertyBuilder> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            it.next().a(this.n);
        }
        Iterator<POJOPropertyBuilder> it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        PropertyNamingStrategy propertyNamingStrategyT = t();
        if (propertyNamingStrategyT != null) {
            e(linkedHashMap, propertyNamingStrategyT);
        }
        if (this.f.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            f(linkedHashMap);
        }
        i(linkedHashMap);
        this.s = linkedHashMap;
        this.j = true;
    }

    protected void c(Map<String, POJOPropertyBuilder> map) {
        ys ysVarFindNameForDeserialization;
        ys ysVarD;
        boolean z;
        boolean z2;
        boolean z3;
        AnnotationIntrospector annotationIntrospector = this.d;
        boolean z4 = (this.n || this.f.isEnabled(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS)) ? false : true;
        boolean zIsEnabled = this.f.isEnabled(MapperFeature.PROPAGATE_TRANSIENT_MARKER);
        for (acj acjVar : this.i.c()) {
            if (Boolean.TRUE.equals(annotationIntrospector.hasAsKey(this.f, acjVar))) {
                if (this.l == null) {
                    this.l = new LinkedList<>();
                }
                this.l.add(acjVar);
            }
            if (Boolean.TRUE.equals(annotationIntrospector.hasAsValue(acjVar))) {
                if (this.p == null) {
                    this.p = new LinkedList<>();
                }
                this.p.add(acjVar);
            } else {
                boolean zEquals = Boolean.TRUE.equals(annotationIntrospector.hasAnyGetter(acjVar));
                boolean zEquals2 = Boolean.TRUE.equals(annotationIntrospector.hasAnySetter(acjVar));
                if (zEquals || zEquals2) {
                    if (zEquals) {
                        if (this.e == null) {
                            this.e = new LinkedList<>();
                        }
                        this.e.add(acjVar);
                    }
                    if (zEquals2) {
                        if (this.f280c == null) {
                            this.f280c = new LinkedList<>();
                        }
                        this.f280c.add(acjVar);
                    }
                } else {
                    String strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(acjVar);
                    if (strFindImplicitPropertyName == null) {
                        strFindImplicitPropertyName = acjVar.getName();
                    }
                    String strModifyFieldName = this.f278a.modifyFieldName(acjVar, strFindImplicitPropertyName);
                    if (strModifyFieldName != null) {
                        ys ysVarD2 = d(strModifyFieldName);
                        ys ysVarFindRenameByField = annotationIntrospector.findRenameByField(this.f, acjVar, ysVarD2);
                        if (ysVarFindRenameByField != null && !ysVarFindRenameByField.equals(ysVarD2)) {
                            if (this.m == null) {
                                this.m = new HashMap();
                            }
                            this.m.put(ysVarFindRenameByField, ysVarD2);
                        }
                        if (this.n) {
                            ysVarFindNameForDeserialization = annotationIntrospector.findNameForSerialization(acjVar);
                        } else {
                            ysVarFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(acjVar);
                        }
                        boolean z5 = ysVarFindNameForDeserialization != null;
                        if (z5 && ysVarFindNameForDeserialization.a()) {
                            z = false;
                            ysVarD = d(strModifyFieldName);
                        } else {
                            ysVarD = ysVarFindNameForDeserialization;
                            z = z5;
                        }
                        boolean zIsFieldVisible = ysVarD != null;
                        if (!zIsFieldVisible) {
                            zIsFieldVisible = this.u.isFieldVisible(acjVar);
                        }
                        boolean zHasIgnoreMarker = annotationIntrospector.hasIgnoreMarker(acjVar);
                        if (!acjVar.b() || z5) {
                            z2 = zHasIgnoreMarker;
                            z3 = zIsFieldVisible;
                        } else {
                            if (zIsEnabled) {
                                zHasIgnoreMarker = true;
                            }
                            z2 = zHasIgnoreMarker;
                            z3 = false;
                        }
                        if (!z4 || ysVarD != null || z2 || !Modifier.isFinal(acjVar.getModifiers())) {
                            b(map, strModifyFieldName).d(acjVar, ysVarD, z, z3, z2);
                        }
                    }
                }
            }
        }
    }

    protected void a(Map<String, POJOPropertyBuilder> map) {
        if (this.y) {
            Iterator<ach> it = this.i.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ach next = it.next();
                if (this.g == null) {
                    this.g = new LinkedList<>();
                }
                int parameterCount = next.getParameterCount();
                for (int i = 0; i < parameterCount; i++) {
                    d(map, next.getParameter(i));
                }
            }
            for (aco acoVar : this.i.f()) {
                if (this.g == null) {
                    this.g = new LinkedList<>();
                }
                int parameterCount2 = acoVar.getParameterCount();
                for (int i2 = 0; i2 < parameterCount2; i2++) {
                    d(map, acoVar.getParameter(i2));
                }
            }
        }
    }

    protected void d(Map<String, POJOPropertyBuilder> map, acp acpVar) {
        JsonCreator.Mode modeFindCreatorAnnotation;
        String strFindImplicitPropertyName = this.d.findImplicitPropertyName(acpVar);
        if (strFindImplicitPropertyName == null) {
            strFindImplicitPropertyName = "";
        }
        ys ysVarFindNameForDeserialization = this.d.findNameForDeserialization(acpVar);
        boolean z = (ysVarFindNameForDeserialization == null || ysVarFindNameForDeserialization.a()) ? false : true;
        if (!z) {
            if (strFindImplicitPropertyName.isEmpty() || (modeFindCreatorAnnotation = this.d.findCreatorAnnotation(this.f, acpVar.e())) == null || modeFindCreatorAnnotation == JsonCreator.Mode.DISABLED) {
                return;
            } else {
                ysVarFindNameForDeserialization = ys.c(strFindImplicitPropertyName);
            }
        }
        ys ysVar = ysVarFindNameForDeserialization;
        String strC = c(strFindImplicitPropertyName);
        POJOPropertyBuilder pOJOPropertyBuilderE = (z && strC.isEmpty()) ? e(map, ysVar) : b(map, strC);
        pOJOPropertyBuilderE.a(acpVar, ysVar, z, true, false);
        this.g.add(pOJOPropertyBuilderE);
    }

    protected void e(Map<String, POJOPropertyBuilder> map) {
        for (aco acoVar : this.i.i()) {
            int parameterCount = acoVar.getParameterCount();
            if (parameterCount == 0) {
                a(map, acoVar, this.d);
            } else if (parameterCount == 1) {
                b(map, acoVar, this.d);
            } else if (parameterCount == 2 && Boolean.TRUE.equals(this.d.hasAnySetter(acoVar))) {
                if (this.h == null) {
                    this.h = new LinkedList<>();
                }
                this.h.add(acoVar);
            }
        }
    }

    protected void a(Map<String, POJOPropertyBuilder> map, aco acoVar, AnnotationIntrospector annotationIntrospector) {
        ys ysVar;
        boolean z;
        boolean z2;
        String strFindImplicitPropertyName;
        boolean zIsGetterVisible;
        Class<?> clsA = acoVar.a();
        if (clsA != Void.TYPE) {
            if (clsA != Void.class || this.f.isEnabled(MapperFeature.ALLOW_VOID_VALUED_PROPERTIES)) {
                if (Boolean.TRUE.equals(annotationIntrospector.hasAnyGetter(acoVar))) {
                    if (this.f279b == null) {
                        this.f279b = new LinkedList<>();
                    }
                    this.f279b.add(acoVar);
                    return;
                }
                if (Boolean.TRUE.equals(annotationIntrospector.hasAsKey(this.f, acoVar))) {
                    if (this.l == null) {
                        this.l = new LinkedList<>();
                    }
                    this.l.add(acoVar);
                    return;
                }
                if (Boolean.TRUE.equals(annotationIntrospector.hasAsValue(acoVar))) {
                    if (this.p == null) {
                        this.p = new LinkedList<>();
                    }
                    this.p.add(acoVar);
                    return;
                }
                ys ysVarFindNameForSerialization = annotationIntrospector.findNameForSerialization(acoVar);
                boolean z3 = false;
                boolean z4 = ysVarFindNameForSerialization != null;
                if (!z4) {
                    strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(acoVar);
                    if (strFindImplicitPropertyName == null) {
                        strFindImplicitPropertyName = this.f278a.findNameForRegularGetter(acoVar, acoVar.getName());
                    }
                    if (strFindImplicitPropertyName == null) {
                        strFindImplicitPropertyName = this.f278a.findNameForIsGetter(acoVar, acoVar.getName());
                        if (strFindImplicitPropertyName == null) {
                            return;
                        } else {
                            zIsGetterVisible = this.u.isIsGetterVisible(acoVar);
                        }
                    } else {
                        zIsGetterVisible = this.u.isGetterVisible(acoVar);
                    }
                    ysVar = ysVarFindNameForSerialization;
                    z = zIsGetterVisible;
                    z2 = z4;
                } else {
                    String strFindImplicitPropertyName2 = annotationIntrospector.findImplicitPropertyName(acoVar);
                    if (strFindImplicitPropertyName2 == null && (strFindImplicitPropertyName2 = this.f278a.findNameForRegularGetter(acoVar, acoVar.getName())) == null) {
                        strFindImplicitPropertyName2 = this.f278a.findNameForIsGetter(acoVar, acoVar.getName());
                    }
                    if (strFindImplicitPropertyName2 == null) {
                        strFindImplicitPropertyName2 = acoVar.getName();
                    }
                    if (ysVarFindNameForSerialization.a()) {
                        ysVarFindNameForSerialization = d(strFindImplicitPropertyName2);
                    } else {
                        z3 = z4;
                    }
                    ysVar = ysVarFindNameForSerialization;
                    z = true;
                    z2 = z3;
                    strFindImplicitPropertyName = strFindImplicitPropertyName2;
                }
                b(map, c(strFindImplicitPropertyName)).a(acoVar, ysVar, z2, z, annotationIntrospector.hasIgnoreMarker(acoVar));
            }
        }
    }

    protected void b(Map<String, POJOPropertyBuilder> map, aco acoVar, AnnotationIntrospector annotationIntrospector) {
        ys ysVar;
        boolean zIsSetterVisible;
        boolean z;
        String strFindImplicitPropertyName;
        ys ysVarFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(acoVar);
        boolean z2 = false;
        boolean z3 = ysVarFindNameForDeserialization != null;
        if (!z3) {
            strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(acoVar);
            if (strFindImplicitPropertyName == null) {
                strFindImplicitPropertyName = this.f278a.findNameForMutator(acoVar, acoVar.getName());
            }
            if (strFindImplicitPropertyName == null) {
                return;
            }
            ysVar = ysVarFindNameForDeserialization;
            zIsSetterVisible = this.u.isSetterVisible(acoVar);
            z = z3;
        } else {
            String strFindImplicitPropertyName2 = annotationIntrospector.findImplicitPropertyName(acoVar);
            if (strFindImplicitPropertyName2 == null) {
                strFindImplicitPropertyName2 = this.f278a.findNameForMutator(acoVar, acoVar.getName());
            }
            if (strFindImplicitPropertyName2 == null) {
                strFindImplicitPropertyName2 = acoVar.getName();
            }
            if (ysVarFindNameForDeserialization.a()) {
                ysVarFindNameForDeserialization = d(strFindImplicitPropertyName2);
            } else {
                z2 = z3;
            }
            ysVar = ysVarFindNameForDeserialization;
            zIsSetterVisible = true;
            z = z2;
            strFindImplicitPropertyName = strFindImplicitPropertyName2;
        }
        b(map, c(strFindImplicitPropertyName)).d(acoVar, ysVar, z, zIsSetterVisible, annotationIntrospector.hasIgnoreMarker(acoVar));
    }

    protected void d(Map<String, POJOPropertyBuilder> map) {
        for (AnnotatedMember annotatedMember : this.i.c()) {
            c(this.d.findInjectableValue(annotatedMember), annotatedMember);
        }
        for (aco acoVar : this.i.i()) {
            if (acoVar.getParameterCount() == 1) {
                c(this.d.findInjectableValue(acoVar), acoVar);
            }
        }
    }

    protected void c(JacksonInject.b bVar, AnnotatedMember annotatedMember) {
        if (bVar == null) {
            return;
        }
        Object objC = bVar.c();
        if (this.k == null) {
            this.k = new LinkedHashMap<>();
        }
        AnnotatedMember annotatedMemberPut = this.k.put(objC, annotatedMember);
        if (annotatedMemberPut == null || annotatedMemberPut.getClass() != annotatedMember.getClass()) {
            return;
        }
        throw new IllegalArgumentException("Duplicate injectable value with id '" + objC + "' (of type " + objC.getClass().getName() + Constants.RIGHT_BRACKET_ONLY);
    }

    private ys d(String str) {
        return ys.a(str, null);
    }

    private String c(String str) {
        ys ysVar;
        Map<ys, ys> map = this.m;
        return (map == null || (ysVar = map.get(d(str))) == null) ? str : ysVar.b();
    }

    protected void j(Map<String, POJOPropertyBuilder> map) {
        Iterator<POJOPropertyBuilder> it = map.values().iterator();
        while (it.hasNext()) {
            POJOPropertyBuilder next = it.next();
            if (!next.e()) {
                it.remove();
            } else if (next.b()) {
                if (!next.isExplicitlyIncluded()) {
                    it.remove();
                    e(next.getName());
                } else {
                    next.j();
                    if (!next.couldDeserialize()) {
                        e(next.getName());
                    }
                }
            }
        }
    }

    protected void b(Map<String, POJOPropertyBuilder> map) {
        boolean zIsEnabled = this.f.isEnabled(MapperFeature.INFER_PROPERTY_MUTATORS);
        Iterator<POJOPropertyBuilder> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().d(zIsEnabled, this.n ? null : this);
        }
    }

    public void e(String str) {
        if (this.n || str == null) {
            return;
        }
        if (this.o == null) {
            this.o = new HashSet<>();
        }
        this.o.add(str);
    }

    protected void g(Map<String, POJOPropertyBuilder> map) {
        HashSet<String> hashSet;
        Iterator<Map.Entry<String, POJOPropertyBuilder>> it = map.entrySet().iterator();
        LinkedList<POJOPropertyBuilder> linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder value = it.next().getValue();
            Set<ys> setC = value.c();
            if (!setC.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (setC.size() == 1) {
                    linkedList.add(value.withName(setC.iterator().next()));
                } else {
                    linkedList.addAll(value.b(setC));
                }
            }
        }
        if (linkedList != null) {
            for (POJOPropertyBuilder pOJOPropertyBuilder : linkedList) {
                String name = pOJOPropertyBuilder.getName();
                POJOPropertyBuilder pOJOPropertyBuilder2 = map.get(name);
                if (pOJOPropertyBuilder2 == null) {
                    map.put(name, pOJOPropertyBuilder);
                } else {
                    pOJOPropertyBuilder2.a(pOJOPropertyBuilder);
                }
                if (d(pOJOPropertyBuilder, this.g) && (hashSet = this.o) != null) {
                    hashSet.remove(name);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    protected void e(Map<String, POJOPropertyBuilder> map, PropertyNamingStrategy propertyNamingStrategy) {
        String strNameForGetterMethod;
        POJOPropertyBuilder[] pOJOPropertyBuilderArr = (POJOPropertyBuilder[]) map.values().toArray(new POJOPropertyBuilder[map.size()]);
        map.clear();
        for (POJOPropertyBuilder pOJOPropertyBuilderWithSimpleName : pOJOPropertyBuilderArr) {
            ys fullName = pOJOPropertyBuilderWithSimpleName.getFullName();
            if (pOJOPropertyBuilderWithSimpleName.isExplicitlyNamed() && !this.f.isEnabled(MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING)) {
                strNameForGetterMethod = null;
            } else if (this.n) {
                if (pOJOPropertyBuilderWithSimpleName.hasGetter()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForGetterMethod(this.f, pOJOPropertyBuilderWithSimpleName.getGetter(), fullName.b());
                } else if (pOJOPropertyBuilderWithSimpleName.hasField()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForField(this.f, pOJOPropertyBuilderWithSimpleName.getField(), fullName.b());
                } else {
                    strNameForGetterMethod = null;
                }
            } else if (pOJOPropertyBuilderWithSimpleName.hasSetter()) {
                strNameForGetterMethod = propertyNamingStrategy.nameForSetterMethod(this.f, pOJOPropertyBuilderWithSimpleName.getSetter(), fullName.b());
            } else if (pOJOPropertyBuilderWithSimpleName.hasConstructorParameter()) {
                strNameForGetterMethod = propertyNamingStrategy.nameForConstructorParameter(this.f, pOJOPropertyBuilderWithSimpleName.getConstructorParameter(), fullName.b());
            } else if (pOJOPropertyBuilderWithSimpleName.hasField()) {
                strNameForGetterMethod = propertyNamingStrategy.nameForField(this.f, pOJOPropertyBuilderWithSimpleName.getField(), fullName.b());
            } else if (pOJOPropertyBuilderWithSimpleName.hasGetter()) {
                strNameForGetterMethod = propertyNamingStrategy.nameForGetterMethod(this.f, pOJOPropertyBuilderWithSimpleName.getGetter(), fullName.b());
            } else {
                strNameForGetterMethod = null;
            }
            if (strNameForGetterMethod != null && !fullName.e(strNameForGetterMethod)) {
                pOJOPropertyBuilderWithSimpleName = pOJOPropertyBuilderWithSimpleName.withSimpleName(strNameForGetterMethod);
            } else {
                strNameForGetterMethod = fullName.b();
            }
            POJOPropertyBuilder pOJOPropertyBuilder = map.get(strNameForGetterMethod);
            if (pOJOPropertyBuilder == null) {
                map.put(strNameForGetterMethod, pOJOPropertyBuilderWithSimpleName);
            } else {
                pOJOPropertyBuilder.a(pOJOPropertyBuilderWithSimpleName);
            }
            d(pOJOPropertyBuilderWithSimpleName, this.g);
        }
    }

    protected void f(Map<String, POJOPropertyBuilder> map) {
        ys ysVarFindWrapperName;
        Iterator<Map.Entry<String, POJOPropertyBuilder>> it = map.entrySet().iterator();
        LinkedList<POJOPropertyBuilder> linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder value = it.next().getValue();
            AnnotatedMember primaryMember = value.getPrimaryMember();
            if (primaryMember != null && (ysVarFindWrapperName = this.d.findWrapperName(primaryMember)) != null && ysVarFindWrapperName.c() && !ysVarFindWrapperName.equals(value.getFullName())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(value.withName(ysVarFindWrapperName));
                it.remove();
            }
        }
        if (linkedList != null) {
            for (POJOPropertyBuilder pOJOPropertyBuilder : linkedList) {
                String name = pOJOPropertyBuilder.getName();
                POJOPropertyBuilder pOJOPropertyBuilder2 = map.get(name);
                if (pOJOPropertyBuilder2 == null) {
                    map.put(name, pOJOPropertyBuilder);
                } else {
                    pOJOPropertyBuilder2.a(pOJOPropertyBuilder);
                }
            }
        }
    }

    protected void i(Map<String, POJOPropertyBuilder> map) {
        boolean zBooleanValue;
        Map<? extends Object, ? extends Object> linkedHashMap;
        Collection<POJOPropertyBuilder> collectionValues;
        AnnotationIntrospector annotationIntrospector = this.d;
        Boolean boolFindSerializationSortAlphabetically = annotationIntrospector.findSerializationSortAlphabetically(this.i);
        if (boolFindSerializationSortAlphabetically == null) {
            zBooleanValue = this.f.shouldSortPropertiesAlphabetically();
        } else {
            zBooleanValue = boolFindSerializationSortAlphabetically.booleanValue();
        }
        boolean zE = e(map.values());
        String[] strArrFindSerializationPropertyOrder = annotationIntrospector.findSerializationPropertyOrder(this.i);
        if (zBooleanValue || zE || this.g != null || strArrFindSerializationPropertyOrder != null) {
            int size = map.size();
            if (zBooleanValue) {
                linkedHashMap = new TreeMap<>();
            } else {
                linkedHashMap = new LinkedHashMap<>(size + size);
            }
            for (POJOPropertyBuilder pOJOPropertyBuilder : map.values()) {
                linkedHashMap.put(pOJOPropertyBuilder.getName(), pOJOPropertyBuilder);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(size + size);
            if (strArrFindSerializationPropertyOrder != null) {
                for (String name : strArrFindSerializationPropertyOrder) {
                    POJOPropertyBuilder pOJOPropertyBuilder2 = (POJOPropertyBuilder) linkedHashMap.remove(name);
                    if (pOJOPropertyBuilder2 == null) {
                        for (POJOPropertyBuilder pOJOPropertyBuilder3 : map.values()) {
                            if (name.equals(pOJOPropertyBuilder3.getInternalName())) {
                                name = pOJOPropertyBuilder3.getName();
                                pOJOPropertyBuilder2 = pOJOPropertyBuilder3;
                                break;
                            }
                        }
                    }
                    if (pOJOPropertyBuilder2 != null) {
                        linkedHashMap2.put(name, pOJOPropertyBuilder2);
                    }
                }
            }
            if (zE) {
                TreeMap treeMap = new TreeMap();
                Iterator<Map.Entry<? extends Object, ? extends Object>> it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    POJOPropertyBuilder pOJOPropertyBuilder4 = (POJOPropertyBuilder) it.next().getValue();
                    Integer numD = pOJOPropertyBuilder4.getMetadata().d();
                    if (numD != null) {
                        treeMap.put(numD, pOJOPropertyBuilder4);
                        it.remove();
                    }
                }
                for (POJOPropertyBuilder pOJOPropertyBuilder5 : treeMap.values()) {
                    linkedHashMap2.put(pOJOPropertyBuilder5.getName(), pOJOPropertyBuilder5);
                }
            }
            if (this.g != null && (!zBooleanValue || this.f.isEnabled(MapperFeature.SORT_CREATOR_PROPERTIES_FIRST))) {
                if (zBooleanValue) {
                    TreeMap treeMap2 = new TreeMap();
                    for (POJOPropertyBuilder pOJOPropertyBuilder6 : this.g) {
                        treeMap2.put(pOJOPropertyBuilder6.getName(), pOJOPropertyBuilder6);
                    }
                    collectionValues = treeMap2.values();
                } else {
                    collectionValues = this.g;
                }
                for (POJOPropertyBuilder pOJOPropertyBuilder7 : collectionValues) {
                    String name2 = pOJOPropertyBuilder7.getName();
                    if (linkedHashMap.containsKey(name2)) {
                        linkedHashMap2.put(name2, pOJOPropertyBuilder7);
                    }
                }
            }
            linkedHashMap2.putAll(linkedHashMap);
            map.clear();
            map.putAll(linkedHashMap2);
        }
    }

    private boolean e(Collection<POJOPropertyBuilder> collection) {
        Iterator<POJOPropertyBuilder> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().getMetadata().e()) {
                return true;
            }
        }
        return false;
    }

    protected void a(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this.i + ": " + str);
    }

    protected POJOPropertyBuilder e(Map<String, POJOPropertyBuilder> map, ys ysVar) {
        String strB = ysVar.b();
        POJOPropertyBuilder pOJOPropertyBuilder = map.get(strB);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this.f, this.d, this.n, ysVar);
        map.put(strB, pOJOPropertyBuilder2);
        return pOJOPropertyBuilder2;
    }

    protected POJOPropertyBuilder b(Map<String, POJOPropertyBuilder> map, String str) {
        POJOPropertyBuilder pOJOPropertyBuilder = map.get(str);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this.f, this.d, this.n, ys.c(str));
        map.put(str, pOJOPropertyBuilder2);
        return pOJOPropertyBuilder2;
    }

    private PropertyNamingStrategy t() {
        PropertyNamingStrategy propertyNamingStrategyNamingStrategyInstance;
        Object objFindNamingStrategy = this.d.findNamingStrategy(this.i);
        if (objFindNamingStrategy == null) {
            return this.f.getPropertyNamingStrategy();
        }
        if (objFindNamingStrategy instanceof PropertyNamingStrategy) {
            return (PropertyNamingStrategy) objFindNamingStrategy;
        }
        if (!(objFindNamingStrategy instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned PropertyNamingStrategy definition of type " + objFindNamingStrategy.getClass().getName() + "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead");
        }
        Class<?> cls = (Class) objFindNamingStrategy;
        if (cls == PropertyNamingStrategy.class) {
            return null;
        }
        if (!PropertyNamingStrategy.class.isAssignableFrom(cls)) {
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<PropertyNamingStrategy>");
        }
        HandlerInstantiator handlerInstantiator = this.f.getHandlerInstantiator();
        return (handlerInstantiator == null || (propertyNamingStrategyNamingStrategyInstance = handlerInstantiator.namingStrategyInstance(this.f, this.i, cls)) == null) ? (PropertyNamingStrategy) ahw.b(cls, this.f.canOverrideAccessModifiers()) : propertyNamingStrategyNamingStrategyInstance;
    }

    protected boolean d(POJOPropertyBuilder pOJOPropertyBuilder, List<POJOPropertyBuilder> list) {
        if (list != null) {
            String internalName = pOJOPropertyBuilder.getInternalName();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).getInternalName().equals(internalName)) {
                    list.set(i, pOJOPropertyBuilder);
                    return true;
                }
            }
        }
        return false;
    }
}
