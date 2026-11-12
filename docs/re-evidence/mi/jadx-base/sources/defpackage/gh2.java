package defpackage;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.AbstractDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.b;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class gh2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeserializationConfig f18971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeserializationContext f18972b;
    public final fh2 c;
    public final Map<String, SettableBeanProperty> d = new LinkedHashMap();
    public List<ValueInjector> e;
    public HashMap<String, SettableBeanProperty> f;
    public HashSet<String> g;
    public b h;
    public ObjectIdReader i;
    public SettableAnyProperty j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18973k;
    public AnnotatedMethod l;
    public mtd.a m;

    public gh2(fh2 fh2Var, DeserializationContext deserializationContext) {
        this.c = fh2Var;
        this.f18972b = deserializationContext;
        this.f18971a = deserializationContext.getConfig();
    }

    public Map<String, List<PropertyName>> a(Collection<SettableBeanProperty> collection) {
        AnnotationIntrospector annotationIntrospector = this.f18971a.getAnnotationIntrospector();
        HashMap map = null;
        if (annotationIntrospector != null) {
            for (SettableBeanProperty settableBeanProperty : collection) {
                List<PropertyName> listFindPropertyAliases = annotationIntrospector.findPropertyAliases(settableBeanProperty.getMember());
                if (listFindPropertyAliases != null && !listFindPropertyAliases.isEmpty()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(settableBeanProperty.getName(), listFindPropertyAliases);
                }
            }
        }
        return map == null ? Collections.emptyMap() : map;
    }

    public void b(Collection<SettableBeanProperty> collection) {
        Iterator<SettableBeanProperty> it = collection.iterator();
        while (it.hasNext()) {
            it.next().fixAccess(this.f18971a);
        }
        SettableAnyProperty settableAnyProperty = this.j;
        if (settableAnyProperty != null) {
            settableAnyProperty.fixAccess(this.f18971a);
        }
        AnnotatedMethod annotatedMethod = this.l;
        if (annotatedMethod != null) {
            annotatedMethod.fixAccess(this.f18971a.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
    }

    public void c(String str, SettableBeanProperty settableBeanProperty) {
        if (this.f == null) {
            this.f = new HashMap<>(4);
        }
        settableBeanProperty.fixAccess(this.f18971a);
        this.f.put(str, settableBeanProperty);
    }

    public void d(SettableBeanProperty settableBeanProperty) {
        h(settableBeanProperty);
    }

    public void e(String str) {
        if (this.g == null) {
            this.g = new HashSet<>();
        }
        this.g.add(str);
    }

    public void f(PropertyName propertyName, JavaType javaType, ld1 ld1Var, AnnotatedMember annotatedMember, Object obj) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        boolean zCanOverrideAccessModifiers = this.f18971a.canOverrideAccessModifiers();
        boolean z = zCanOverrideAccessModifiers && this.f18971a.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
        if (zCanOverrideAccessModifiers) {
            annotatedMember.fixAccess(z);
        }
        this.e.add(new ValueInjector(propertyName, javaType, annotatedMember, obj));
    }

    public void g(SettableBeanProperty settableBeanProperty, boolean z) {
        this.d.put(settableBeanProperty.getName(), settableBeanProperty);
    }

    public void h(SettableBeanProperty settableBeanProperty) {
        SettableBeanProperty settableBeanPropertyPut = this.d.put(settableBeanProperty.getName(), settableBeanProperty);
        if (settableBeanPropertyPut == null || settableBeanPropertyPut == settableBeanProperty) {
            return;
        }
        throw new IllegalArgumentException("Duplicate property '" + settableBeanProperty.getName() + "' for " + this.c.z());
    }

    public esd<?> i() {
        boolean z;
        Collection<SettableBeanProperty> collectionValues = this.d.values();
        b(collectionValues);
        BeanPropertyMap beanPropertyMapConstruct = BeanPropertyMap.construct(collectionValues, this.f18971a.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES), a(collectionValues));
        beanPropertyMapConstruct.assignIndexes();
        boolean z2 = !this.f18971a.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        if (!z2) {
            Iterator<SettableBeanProperty> it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                if (it.next().hasViews()) {
                    z = true;
                    break;
                }
            }
        } else {
            z = z2;
            break;
        }
        if (this.i != null) {
            beanPropertyMapConstruct = beanPropertyMapConstruct.withProperty(new ObjectIdValueProperty(this.i, PropertyMetadata.STD_REQUIRED));
        }
        return new BeanDeserializer(this, this.c, beanPropertyMapConstruct, this.f, this.g, this.f18973k, z);
    }

    public AbstractDeserializer j() {
        return new AbstractDeserializer(this, this.c, this.f, this.d);
    }

    public esd<?> k(JavaType javaType, String str) throws JsonMappingException {
        boolean z;
        AnnotatedMethod annotatedMethod = this.l;
        if (annotatedMethod != null) {
            Class<?> rawReturnType = annotatedMethod.getRawReturnType();
            Class<?> rawClass = javaType.getRawClass();
            if (rawReturnType != rawClass && !rawReturnType.isAssignableFrom(rawClass) && !rawClass.isAssignableFrom(rawReturnType)) {
                this.f18972b.reportBadDefinition(this.c.z(), String.format("Build method '%s' has wrong return type (%s), not compatible with POJO type (%s)", this.l.getFullName(), rawReturnType.getName(), javaType.getRawClass().getName()));
            }
        } else if (!str.isEmpty()) {
            this.f18972b.reportBadDefinition(this.c.z(), String.format("Builder class %s does not have build method (name: '%s')", this.c.s().getName(), str));
        }
        Collection<SettableBeanProperty> collectionValues = this.d.values();
        b(collectionValues);
        BeanPropertyMap beanPropertyMapConstruct = BeanPropertyMap.construct(collectionValues, this.f18971a.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES), a(collectionValues));
        beanPropertyMapConstruct.assignIndexes();
        boolean z2 = !this.f18971a.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        if (!z2) {
            Iterator<SettableBeanProperty> it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                if (it.next().hasViews()) {
                    z = true;
                    break;
                }
            }
        } else {
            z = z2;
            break;
        }
        if (this.i != null) {
            beanPropertyMapConstruct = beanPropertyMapConstruct.withProperty(new ObjectIdValueProperty(this.i, PropertyMetadata.STD_REQUIRED));
        }
        return new BuilderBasedDeserializer(this, this.c, javaType, beanPropertyMapConstruct, this.f, this.g, this.f18973k, z);
    }

    public SettableBeanProperty l(PropertyName propertyName) {
        return this.d.get(propertyName.getSimpleName());
    }

    public SettableAnyProperty m() {
        return this.j;
    }

    public AnnotatedMethod n() {
        return this.l;
    }

    public List<ValueInjector> o() {
        return this.e;
    }

    public ObjectIdReader p() {
        return this.i;
    }

    public b q() {
        return this.h;
    }

    public boolean r(String str) {
        HashSet<String> hashSet = this.g;
        return hashSet != null && hashSet.contains(str);
    }

    public void s(SettableAnyProperty settableAnyProperty) {
        if (this.j != null && settableAnyProperty != null) {
            throw new IllegalStateException("_anySetter already set to non-null");
        }
        this.j = settableAnyProperty;
    }

    public void t(boolean z) {
        this.f18973k = z;
    }

    public void u(ObjectIdReader objectIdReader) {
        this.i = objectIdReader;
    }

    public void v(AnnotatedMethod annotatedMethod, mtd.a aVar) {
        this.l = annotatedMethod;
        this.m = aVar;
    }

    public void w(b bVar) {
        this.h = bVar;
    }
}
