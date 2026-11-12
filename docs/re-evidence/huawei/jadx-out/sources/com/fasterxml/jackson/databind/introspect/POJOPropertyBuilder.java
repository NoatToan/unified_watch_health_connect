package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.ConfigOverride;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import defpackage.ach;
import defpackage.acj;
import defpackage.aco;
import defpackage.acp;
import defpackage.act;
import defpackage.acv;
import defpackage.acx;
import defpackage.ahp;
import defpackage.ahw;
import defpackage.yq;
import defpackage.ys;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class POJOPropertyBuilder extends BeanPropertyDefinition implements Comparable<POJOPropertyBuilder> {
    private static final AnnotationIntrospector.ReferenceProperty n = AnnotationIntrospector.ReferenceProperty.a("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final boolean f4158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final AnnotationIntrospector f4159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e<acj> f4160c;
    protected e<acp> d;
    protected final MapperConfig<?> e;
    protected e<aco> f;
    protected final ys g;
    protected transient yq h;
    protected transient AnnotationIntrospector.ReferenceProperty i;
    protected final ys j;
    protected e<aco> l;

    interface WithMember<T> {
        T withMember(AnnotatedMember annotatedMember);
    }

    public POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, ys ysVar) {
        this(mapperConfig, annotationIntrospector, z, ysVar, ysVar);
    }

    protected POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, ys ysVar, ys ysVar2) {
        this.e = mapperConfig;
        this.f4159b = annotationIntrospector;
        this.g = ysVar;
        this.j = ysVar2;
        this.f4158a = z;
    }

    protected POJOPropertyBuilder(POJOPropertyBuilder pOJOPropertyBuilder, ys ysVar) {
        this.e = pOJOPropertyBuilder.e;
        this.f4159b = pOJOPropertyBuilder.f4159b;
        this.g = pOJOPropertyBuilder.g;
        this.j = ysVar;
        this.f4160c = pOJOPropertyBuilder.f4160c;
        this.d = pOJOPropertyBuilder.d;
        this.f = pOJOPropertyBuilder.f;
        this.l = pOJOPropertyBuilder.l;
        this.f4158a = pOJOPropertyBuilder.f4158a;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public POJOPropertyBuilder withName(ys ysVar) {
        return new POJOPropertyBuilder(this, ysVar);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public POJOPropertyBuilder withSimpleName(String str) {
        ys ysVarB = this.j.b(str);
        return ysVarB == this.j ? this : new POJOPropertyBuilder(this, ysVarB);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(POJOPropertyBuilder pOJOPropertyBuilder) {
        if (this.d != null) {
            if (pOJOPropertyBuilder.d == null) {
                return -1;
            }
        } else if (pOJOPropertyBuilder.d != null) {
            return 1;
        }
        return getName().compareTo(pOJOPropertyBuilder.getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.util.Named
    public String getName() {
        ys ysVar = this.j;
        if (ysVar == null) {
            return null;
        }
        return ysVar.b();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public ys getFullName() {
        return this.j;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasName(ys ysVar) {
        return this.j.equals(ysVar);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public String getInternalName() {
        return this.g.b();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public ys getWrapperName() {
        AnnotationIntrospector annotationIntrospector;
        AnnotatedMember primaryMember = getPrimaryMember();
        if (primaryMember == null || (annotationIntrospector = this.f4159b) == null) {
            return null;
        }
        return annotationIntrospector.findWrapperName(primaryMember);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isExplicitlyIncluded() {
        return d(this.f4160c) || d(this.f) || d(this.l) || a(this.d);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isExplicitlyNamed() {
        return a(this.f4160c) || a(this.f) || a(this.l) || a(this.d);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public yq getMetadata() {
        yq yqVarB;
        if (this.h == null) {
            AnnotatedMember annotatedMemberA = a();
            if (annotatedMemberA == null) {
                this.h = yq.f53746b;
            } else {
                Boolean boolHasRequiredMarker = this.f4159b.hasRequiredMarker(annotatedMemberA);
                String strFindPropertyDescription = this.f4159b.findPropertyDescription(annotatedMemberA);
                Integer numFindPropertyIndex = this.f4159b.findPropertyIndex(annotatedMemberA);
                String strFindPropertyDefaultValue = this.f4159b.findPropertyDefaultValue(annotatedMemberA);
                if (boolHasRequiredMarker == null && numFindPropertyIndex == null && strFindPropertyDefaultValue == null) {
                    if (strFindPropertyDescription == null) {
                        yqVarB = yq.f53746b;
                    } else {
                        yqVarB = yq.f53746b.b(strFindPropertyDescription);
                    }
                    this.h = yqVarB;
                } else {
                    this.h = yq.e(boolHasRequiredMarker, strFindPropertyDescription, numFindPropertyIndex, strFindPropertyDefaultValue);
                }
                if (!this.f4158a) {
                    this.h = a(this.h, annotatedMemberA);
                }
            }
        }
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035 A[PHI: r1 r7
      0x0035: PHI (r1v3 boolean) = (r1v0 boolean), (r1v6 boolean) binds: [B:5:0x000b, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r7v5 yq) = (r7v0 yq), (r7v9 yq) binds: [B:5:0x000b, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    protected yq a(yq yqVar, AnnotatedMember annotatedMember) {
        Nulls nullsB;
        Boolean mergeable;
        Boolean boolFindMergeInfo;
        AnnotatedMember accessor = getAccessor();
        boolean z = true;
        Nulls nullsD = null;
        if (annotatedMember != null) {
            AnnotationIntrospector annotationIntrospector = this.f4159b;
            if (annotationIntrospector == null) {
                nullsB = null;
            } else {
                if (accessor != null && (boolFindMergeInfo = annotationIntrospector.findMergeInfo(annotatedMember)) != null) {
                    if (boolFindMergeInfo.booleanValue()) {
                        yqVar = yqVar.c(yq.d.b(accessor));
                    }
                    z = false;
                }
                JsonSetter.e eVarFindSetterInfo = this.f4159b.findSetterInfo(annotatedMember);
                if (eVarFindSetterInfo != null) {
                    nullsD = eVarFindSetterInfo.d();
                    nullsB = eVarFindSetterInfo.b();
                } else {
                    nullsB = null;
                }
            }
            if (z || nullsD == null || nullsB == null) {
                ConfigOverride configOverride = this.e.getConfigOverride(a(annotatedMember));
                JsonSetter.e setterInfo = configOverride.getSetterInfo();
                if (setterInfo != null) {
                    if (nullsD == null) {
                        nullsD = setterInfo.d();
                    }
                    if (nullsB == null) {
                        nullsB = setterInfo.b();
                    }
                }
                if (z && accessor != null && (mergeable = configOverride.getMergeable()) != null) {
                    if (mergeable.booleanValue()) {
                        yqVar = yqVar.c(yq.d.d(accessor));
                    }
                    z = false;
                }
            }
        } else {
            nullsB = null;
        }
        if (z || nullsD == null || nullsB == null) {
            JsonSetter.e defaultSetterInfo = this.e.getDefaultSetterInfo();
            if (nullsD == null) {
                nullsD = defaultSetterInfo.d();
            }
            if (nullsB == null) {
                nullsB = defaultSetterInfo.b();
            }
            if (z) {
                if (Boolean.TRUE.equals(this.e.getDefaultMergeable()) && accessor != null) {
                    yqVar = yqVar.c(yq.d.a(accessor));
                }
            }
        }
        return (nullsD == null && nullsB == null) ? yqVar : yqVar.e(nullsD, nullsB);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public JavaType getPrimaryType() {
        if (this.f4158a) {
            Annotated getter = getGetter();
            if (getter == null && (getter = getField()) == null) {
                return ahp.c();
            }
            return getter.getType();
        }
        Annotated constructorParameter = getConstructorParameter();
        if (constructorParameter == null) {
            aco setter = getSetter();
            if (setter != null) {
                return setter.getParameterType(0);
            }
            constructorParameter = getField();
        }
        if (constructorParameter == null && (constructorParameter = getGetter()) == null) {
            return ahp.c();
        }
        return constructorParameter.getType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Class<?> getRawPrimaryType() {
        return getPrimaryType().getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasGetter() {
        return this.f != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasSetter() {
        return this.l != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasField() {
        return this.f4160c != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasConstructorParameter() {
        return this.d != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean couldDeserialize() {
        return (this.d == null && this.l == null && this.f4160c == null) ? false : true;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean couldSerialize() {
        return (this.f == null && this.f4160c == null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public aco getGetter() {
        int iC;
        int iC2;
        e eVar = this.f;
        if (eVar == null) {
            return null;
        }
        e eVar2 = eVar.e;
        if (eVar2 == null) {
            return (aco) eVar.g;
        }
        while (eVar2 != null) {
            Class<?> declaringClass = ((aco) eVar.g).getDeclaringClass();
            Class<?> declaringClass2 = ((aco) eVar2.g).getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    eVar = eVar2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                    continue;
                } else {
                    iC = c((aco) eVar2.g);
                    iC2 = c((aco) eVar.g);
                    if (iC != iC2) {
                        throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + ((aco) eVar.g).getFullName() + " vs " + ((aco) eVar2.g).getFullName());
                    }
                    if (iC < iC2) {
                        eVar = eVar2;
                    }
                }
            } else {
                iC = c((aco) eVar2.g);
                iC2 = c((aco) eVar.g);
                if (iC != iC2) {
                    throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + ((aco) eVar.g).getFullName() + " vs " + ((aco) eVar2.g).getFullName());
                }
                if (iC < iC2) {
                    eVar = eVar2;
                }
            }
            eVar2 = eVar2.e;
        }
        this.f = eVar.a();
        return (aco) eVar.g;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:36:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public aco getSetter() {
        aco acoVar;
        aco acoVar2;
        int iE;
        int iE2;
        AnnotationIntrospector annotationIntrospector;
        aco acoVarResolveSetterConflict;
        e eVar = this.l;
        if (eVar == null) {
            return null;
        }
        e eVar2 = eVar.e;
        if (eVar2 == null) {
            return (aco) eVar.g;
        }
        while (eVar2 != null) {
            Class<?> declaringClass = ((aco) eVar.g).getDeclaringClass();
            Class<?> declaringClass2 = ((aco) eVar2.g).getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    eVar = eVar2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                    continue;
                } else {
                    acoVar = (aco) eVar2.g;
                    acoVar2 = (aco) eVar.g;
                    iE = e(acoVar);
                    iE2 = e(acoVar2);
                    if (iE != iE2) {
                        annotationIntrospector = this.f4159b;
                        if (annotationIntrospector == null) {
                            acoVarResolveSetterConflict = annotationIntrospector.resolveSetterConflict(this.e, acoVar2, acoVar);
                            if (acoVarResolveSetterConflict != acoVar2) {
                                if (acoVarResolveSetterConflict != acoVar) {
                                }
                                eVar = eVar2;
                            } else {
                                continue;
                            }
                        }
                        throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", getName(), ((aco) eVar.g).getFullName(), ((aco) eVar2.g).getFullName()));
                    }
                    if (iE < iE2) {
                        eVar = eVar2;
                    }
                }
            } else {
                acoVar = (aco) eVar2.g;
                acoVar2 = (aco) eVar.g;
                iE = e(acoVar);
                iE2 = e(acoVar2);
                if (iE != iE2) {
                    annotationIntrospector = this.f4159b;
                    if (annotationIntrospector == null) {
                        acoVarResolveSetterConflict = annotationIntrospector.resolveSetterConflict(this.e, acoVar2, acoVar);
                        if (acoVarResolveSetterConflict != acoVar2) {
                            if (acoVarResolveSetterConflict != acoVar) {
                            }
                            eVar = eVar2;
                        } else {
                            continue;
                        }
                    }
                    throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", getName(), ((aco) eVar.g).getFullName(), ((aco) eVar2.g).getFullName()));
                }
                if (iE < iE2) {
                    eVar = eVar2;
                }
            }
            eVar2 = eVar2.e;
        }
        this.l = eVar.a();
        return (aco) eVar.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public acj getField() {
        e<acj> eVar = this.f4160c;
        if (eVar == null) {
            return null;
        }
        acj acjVar = eVar.g;
        for (e eVar2 = this.f4160c.e; eVar2 != null; eVar2 = eVar2.e) {
            acj acjVar2 = (acj) eVar2.g;
            Class<?> declaringClass = acjVar.getDeclaringClass();
            Class<?> declaringClass2 = acjVar2.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    acjVar = acjVar2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + getName() + "\": " + acjVar.getFullName() + " vs " + acjVar2.getFullName());
        }
        return acjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public acp getConstructorParameter() {
        e eVar = this.d;
        if (eVar == null) {
            return null;
        }
        while (!(((acp) eVar.g).e() instanceof ach)) {
            eVar = eVar.e;
            if (eVar == null) {
                return this.d.g;
            }
        }
        return (acp) eVar.g;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Iterator<acp> getConstructorParameters() {
        e<acp> eVar = this.d;
        if (eVar == null) {
            return ahw.d();
        }
        return new d(eVar);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedMember getPrimaryMember() {
        if (this.f4158a) {
            return getAccessor();
        }
        AnnotatedMember mutator = getMutator();
        return mutator == null ? getAccessor() : mutator;
    }

    protected AnnotatedMember a() {
        if (this.f4158a) {
            e<aco> eVar = this.f;
            if (eVar != null) {
                return eVar.g;
            }
            e<acj> eVar2 = this.f4160c;
            if (eVar2 != null) {
                return eVar2.g;
            }
            return null;
        }
        e<acp> eVar3 = this.d;
        if (eVar3 != null) {
            return eVar3.g;
        }
        e<aco> eVar4 = this.l;
        if (eVar4 != null) {
            return eVar4.g;
        }
        e<acj> eVar5 = this.f4160c;
        if (eVar5 != null) {
            return eVar5.g;
        }
        e<aco> eVar6 = this.f;
        if (eVar6 != null) {
            return eVar6.g;
        }
        return null;
    }

    protected int c(aco acoVar) {
        String name = acoVar.getName();
        if (!name.startsWith("get") || name.length() <= 3) {
            return (!name.startsWith("is") || name.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    protected int e(aco acoVar) {
        String name = acoVar.getName();
        return (!name.startsWith("set") || name.length() <= 3) ? 2 : 1;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Class<?>[] findViews() {
        return (Class[]) d(new WithMember<Class<?>[]>() { // from class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.2
            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Class<?>[] withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this.f4159b.findViews(annotatedMember);
            }
        });
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotationIntrospector.ReferenceProperty findReferenceType() {
        AnnotationIntrospector.ReferenceProperty referenceProperty = this.i;
        if (referenceProperty != null) {
            if (referenceProperty == n) {
                return null;
            }
            return referenceProperty;
        }
        AnnotationIntrospector.ReferenceProperty referenceProperty2 = (AnnotationIntrospector.ReferenceProperty) d(new WithMember<AnnotationIntrospector.ReferenceProperty>() { // from class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.4
            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public AnnotationIntrospector.ReferenceProperty withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this.f4159b.findReferenceType(annotatedMember);
            }
        });
        this.i = referenceProperty2 == null ? n : referenceProperty2;
        return referenceProperty2;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isTypeId() {
        Boolean bool = (Boolean) d(new WithMember<Boolean>() { // from class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.3
            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Boolean withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this.f4159b.isTypeId(annotatedMember);
            }
        });
        return bool != null && bool.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public acv findObjectIdInfo() {
        return (acv) d(new WithMember<acv>() { // from class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.5
            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public acv withMember(AnnotatedMember annotatedMember) {
                acv acvVarFindObjectIdInfo = POJOPropertyBuilder.this.f4159b.findObjectIdInfo(annotatedMember);
                return acvVarFindObjectIdInfo != null ? POJOPropertyBuilder.this.f4159b.findObjectReferenceInfo(annotatedMember, acvVarFindObjectIdInfo) : acvVarFindObjectIdInfo;
            }
        });
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public JsonInclude.b findInclusion() {
        AnnotatedMember accessor = getAccessor();
        AnnotationIntrospector annotationIntrospector = this.f4159b;
        JsonInclude.b bVarFindPropertyInclusion = annotationIntrospector == null ? null : annotationIntrospector.findPropertyInclusion(accessor);
        return bVarFindPropertyInclusion == null ? JsonInclude.b.e() : bVarFindPropertyInclusion;
    }

    public JsonProperty.Access d() {
        return (JsonProperty.Access) e(new WithMember<JsonProperty.Access>() { // from class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.1
            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public JsonProperty.Access withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this.f4159b.findPropertyAccess(annotatedMember);
            }
        }, JsonProperty.Access.AUTO);
    }

    public void d(acj acjVar, ys ysVar, boolean z, boolean z2, boolean z3) {
        this.f4160c = new e<>(acjVar, this.f4160c, ysVar, z, z2, z3);
    }

    public void a(acp acpVar, ys ysVar, boolean z, boolean z2, boolean z3) {
        this.d = new e<>(acpVar, this.d, ysVar, z, z2, z3);
    }

    public void a(aco acoVar, ys ysVar, boolean z, boolean z2, boolean z3) {
        this.f = new e<>(acoVar, this.f, ysVar, z, z2, z3);
    }

    public void d(aco acoVar, ys ysVar, boolean z, boolean z2, boolean z3) {
        this.l = new e<>(acoVar, this.l, ysVar, z, z2, z3);
    }

    public void a(POJOPropertyBuilder pOJOPropertyBuilder) {
        this.f4160c = d(this.f4160c, pOJOPropertyBuilder.f4160c);
        this.d = d(this.d, pOJOPropertyBuilder.d);
        this.f = d(this.f, pOJOPropertyBuilder.f);
        this.l = d(this.l, pOJOPropertyBuilder.l);
    }

    private static <T> e<T> d(e<T> eVar, e<T> eVar2) {
        if (eVar == null) {
            return eVar2;
        }
        return eVar2 == null ? eVar : eVar.c(eVar2);
    }

    public void j() {
        this.f4160c = h(this.f4160c);
        this.f = h(this.f);
        this.l = h(this.l);
        this.d = h(this.d);
    }

    public JsonProperty.Access d(boolean z, acx acxVar) {
        JsonProperty.Access accessD = d();
        if (accessD == null) {
            accessD = JsonProperty.Access.AUTO;
        }
        int i = AnonymousClass9.d[accessD.ordinal()];
        if (i == 1) {
            if (acxVar != null) {
                acxVar.e(getName());
                Iterator<ys> it = c().iterator();
                while (it.hasNext()) {
                    acxVar.e(it.next().b());
                }
            }
            this.l = null;
            this.d = null;
            if (!this.f4158a) {
                this.f4160c = null;
            }
        } else if (i != 2) {
            if (i == 3) {
                this.f = null;
                if (this.f4158a) {
                    this.f4160c = null;
                    return accessD;
                }
            } else {
                this.f = j(this.f);
                this.d = j(this.d);
                if (!z || this.f == null) {
                    this.f4160c = j(this.f4160c);
                    this.l = j(this.l);
                    return accessD;
                }
            }
        }
        return accessD;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$9, reason: invalid class name */
    static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[JsonProperty.Access.values().length];
            d = iArr;
            try {
                iArr[JsonProperty.Access.READ_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[JsonProperty.Access.READ_WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[JsonProperty.Access.WRITE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[JsonProperty.Access.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void g() {
        this.d = null;
    }

    public void f() {
        this.f4160c = f(this.f4160c);
        this.f = f(this.f);
        this.l = f(this.l);
        this.d = f(this.d);
    }

    public void a(boolean z) {
        if (z) {
            e<aco> eVar = this.f;
            if (eVar != null) {
                this.f = a(this.f, e(0, eVar, this.f4160c, this.d, this.l));
                return;
            }
            e<acj> eVar2 = this.f4160c;
            if (eVar2 != null) {
                this.f4160c = a(this.f4160c, e(0, eVar2, this.d, this.l));
                return;
            }
            return;
        }
        e<acp> eVar3 = this.d;
        if (eVar3 != null) {
            this.d = a(this.d, e(0, eVar3, this.l, this.f4160c, this.f));
            return;
        }
        e<aco> eVar4 = this.l;
        if (eVar4 != null) {
            this.l = a(this.l, e(0, eVar4, this.f4160c, this.f));
            return;
        }
        e<acj> eVar5 = this.f4160c;
        if (eVar5 != null) {
            this.f4160c = a(this.f4160c, e(0, eVar5, this.f));
        }
    }

    private act e(int i, e<? extends AnnotatedMember>... eVarArr) {
        act actVarB = b(eVarArr[i]);
        do {
            i++;
            if (i >= eVarArr.length) {
                return actVarB;
            }
        } while (eVarArr[i] == null);
        return act.c(actVarB, e(i, eVarArr));
    }

    private <T extends AnnotatedMember> act b(e<T> eVar) {
        act allAnnotations = eVar.g.getAllAnnotations();
        return eVar.e != null ? act.c(allAnnotations, b(eVar.e)) : allAnnotations;
    }

    private <T extends AnnotatedMember> e<T> a(e<T> eVar, act actVar) {
        AnnotatedMember annotatedMember = (AnnotatedMember) eVar.g.withAnnotations(actVar);
        e<T> eVar2 = eVar.e;
        e eVarD = eVar;
        if (eVar2 != null) {
            eVarD = eVar.d(a(eVar.e, actVar));
        }
        return eVarD.d(annotatedMember);
    }

    private <T> e<T> h(e<T> eVar) {
        return eVar == null ? eVar : eVar.b();
    }

    private <T> e<T> j(e<T> eVar) {
        return eVar == null ? eVar : eVar.e();
    }

    private <T> e<T> f(e<T> eVar) {
        return eVar == null ? eVar : eVar.c();
    }

    private <T> boolean d(e<T> eVar) {
        while (eVar != null) {
            if (eVar.f4166b != null && eVar.f4166b.c()) {
                return true;
            }
            eVar = eVar.e;
        }
        return false;
    }

    private <T> boolean a(e<T> eVar) {
        while (eVar != null) {
            if (eVar.f4166b != null && eVar.f4167c) {
                return true;
            }
            eVar = eVar.e;
        }
        return false;
    }

    public boolean e() {
        return e(this.f4160c) || e(this.f) || e(this.l) || e(this.d);
    }

    private <T> boolean e(e<T> eVar) {
        while (eVar != null) {
            if (eVar.f4165a) {
                return true;
            }
            eVar = eVar.e;
        }
        return false;
    }

    public boolean b() {
        return c(this.f4160c) || c(this.f) || c(this.l) || c(this.d);
    }

    private <T> boolean c(e<T> eVar) {
        while (eVar != null) {
            if (eVar.d) {
                return true;
            }
            eVar = eVar.e;
        }
        return false;
    }

    public Set<ys> c() {
        Set<ys> setE = e(this.d, e(this.l, e(this.f, e(this.f4160c, (Set<ys>) null))));
        return setE == null ? Collections.EMPTY_SET : setE;
    }

    public Collection<POJOPropertyBuilder> b(Collection<ys> collection) {
        HashMap map = new HashMap();
        a(collection, map, this.f4160c);
        a(collection, map, this.f);
        a(collection, map, this.l);
        a(collection, map, this.d);
        return map.values();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0023: INVOKE (r11v0 ?? I:java.util.Map), (r7v0 ?? I:java.lang.Object), (r8v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:1105)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private void a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0023: INVOKE (r11v0 ?? I:java.util.Map), (r7v0 ?? I:java.lang.Object), (r8v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:1105)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    private Set<ys> e(e<? extends AnnotatedMember> eVar, Set<ys> set) {
        for (e eVar2 = eVar; eVar2 != null; eVar2 = eVar2.e) {
            if (eVar2.f4167c && eVar2.f4166b != null) {
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(eVar2.f4166b);
            }
        }
        return set;
    }

    public String toString() {
        return "[Property '" + this.j + "'; ctors: " + this.d + ", field(s): " + this.f4160c + ", getter(s): " + this.f + ", setter(s): " + this.l + "]";
    }

    protected <T> T d(WithMember<T> withMember) {
        e<aco> eVar;
        e<acj> eVar2;
        T tWithMember = null;
        if (this.f4159b != null) {
            if (this.f4158a) {
                e<aco> eVar3 = this.f;
                if (eVar3 != null) {
                    tWithMember = withMember.withMember(eVar3.g);
                }
            } else {
                e<acp> eVar4 = this.d;
                tWithMember = eVar4 != null ? withMember.withMember(eVar4.g) : null;
                if (tWithMember == null && (eVar = this.l) != null) {
                    tWithMember = withMember.withMember(eVar.g);
                }
            }
            if (tWithMember == null && (eVar2 = this.f4160c) != null) {
                return withMember.withMember(eVar2.g);
            }
        }
        return tWithMember;
    }

    protected <T> T e(WithMember<T> withMember, T t) {
        T tWithMember;
        T tWithMember2;
        T tWithMember3;
        T tWithMember4;
        T tWithMember5;
        T tWithMember6;
        T tWithMember7;
        T tWithMember8;
        if (this.f4159b == null) {
            return null;
        }
        if (this.f4158a) {
            e<aco> eVar = this.f;
            if (eVar != null && (tWithMember8 = withMember.withMember(eVar.g)) != null && tWithMember8 != t) {
                return tWithMember8;
            }
            e<acj> eVar2 = this.f4160c;
            if (eVar2 != null && (tWithMember7 = withMember.withMember(eVar2.g)) != null && tWithMember7 != t) {
                return tWithMember7;
            }
            e<acp> eVar3 = this.d;
            if (eVar3 != null && (tWithMember6 = withMember.withMember(eVar3.g)) != null && tWithMember6 != t) {
                return tWithMember6;
            }
            e<aco> eVar4 = this.l;
            if (eVar4 == null || (tWithMember5 = withMember.withMember(eVar4.g)) == null || tWithMember5 == t) {
                return null;
            }
            return tWithMember5;
        }
        e<acp> eVar5 = this.d;
        if (eVar5 != null && (tWithMember4 = withMember.withMember(eVar5.g)) != null && tWithMember4 != t) {
            return tWithMember4;
        }
        e<aco> eVar6 = this.l;
        if (eVar6 != null && (tWithMember3 = withMember.withMember(eVar6.g)) != null && tWithMember3 != t) {
            return tWithMember3;
        }
        e<acj> eVar7 = this.f4160c;
        if (eVar7 != null && (tWithMember2 = withMember.withMember(eVar7.g)) != null && tWithMember2 != t) {
            return tWithMember2;
        }
        e<aco> eVar8 = this.f;
        if (eVar8 == null || (tWithMember = withMember.withMember(eVar8.g)) == null || tWithMember == t) {
            return null;
        }
        return tWithMember;
    }

    protected Class<?> a(AnnotatedMember annotatedMember) {
        if (annotatedMember instanceof aco) {
            aco acoVar = (aco) annotatedMember;
            if (acoVar.getParameterCount() > 0) {
                return acoVar.getParameterType(0).getRawClass();
            }
        }
        return annotatedMember.getType().getRawClass();
    }

    protected static class d<T extends AnnotatedMember> implements Iterator<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e<T> f4164c;

        public d(e<T> eVar) {
            this.f4164c = eVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4164c != null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public T next() {
            e<T> eVar = this.f4164c;
            if (eVar == null) {
                throw new NoSuchElementException();
            }
            T t = eVar.g;
            this.f4164c = this.f4164c.e;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    protected static final class e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f4165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ys f4166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f4167c;
        public final boolean d;
        public final e<T> e;
        public final T g;

        public e(T t, e<T> eVar, ys ysVar, boolean z, boolean z2, boolean z3) {
            this.g = t;
            this.e = eVar;
            ys ysVar2 = (ysVar == null || ysVar.a()) ? null : ysVar;
            this.f4166b = ysVar2;
            if (z) {
                if (ysVar2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
                if (!ysVar.c()) {
                    z = false;
                }
            }
            this.f4167c = z;
            this.f4165a = z2;
            this.d = z3;
        }

        public e<T> a() {
            return this.e == null ? this : new e<>(this.g, null, this.f4166b, this.f4167c, this.f4165a, this.d);
        }

        public e<T> d(T t) {
            return t == this.g ? this : new e<>(t, this.e, this.f4166b, this.f4167c, this.f4165a, this.d);
        }

        public e<T> d(e<T> eVar) {
            return eVar == this.e ? this : new e<>(this.g, eVar, this.f4166b, this.f4167c, this.f4165a, this.d);
        }

        public e<T> b() {
            e<T> eVarB;
            if (this.d) {
                e<T> eVar = this.e;
                if (eVar == null) {
                    return null;
                }
                return eVar.b();
            }
            e<T> eVar2 = this.e;
            return (eVar2 == null || (eVarB = eVar2.b()) == this.e) ? this : d((e) eVarB);
        }

        public e<T> e() {
            e<T> eVar = this.e;
            e<T> eVarE = eVar == null ? null : eVar.e();
            return this.f4165a ? d((e) eVarE) : eVarE;
        }

        protected e<T> c(e<T> eVar) {
            e<T> eVar2 = this.e;
            if (eVar2 == null) {
                return d((e) eVar);
            }
            return d((e) eVar2.c(eVar));
        }

        public e<T> c() {
            e<T> eVar = this.e;
            if (eVar == null) {
                return this;
            }
            e<T> eVarC = eVar.c();
            if (this.f4166b != null) {
                if (eVarC.f4166b == null) {
                    return d((e) null);
                }
                return d((e) eVarC);
            }
            if (eVarC.f4166b != null) {
                return eVarC;
            }
            boolean z = this.f4165a;
            if (z == eVarC.f4165a) {
                return d((e) eVarC);
            }
            return z ? d((e) null) : eVarC;
        }

        public String toString() {
            String str = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.g.toString(), Boolean.valueOf(this.f4165a), Boolean.valueOf(this.d), Boolean.valueOf(this.f4167c));
            if (this.e == null) {
                return str;
            }
            return str + ", " + this.e.toString();
        }
    }
}
