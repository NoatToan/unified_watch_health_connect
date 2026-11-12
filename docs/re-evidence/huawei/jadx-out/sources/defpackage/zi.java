package defpackage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.Annotations;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class zi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected zj f54126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected JsonPOJOBuilder.e f54127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected aco f54128c;
    protected HashMap<String, SettableBeanProperty> d;
    protected final BeanDescription e;
    protected boolean f;
    protected HashSet<String> g;
    protected final DeserializationContext h;
    protected HashSet<String> i;
    protected final yi j;
    protected ValueInstantiator l;
    protected aah m;
    protected final Map<String, SettableBeanProperty> n = new LinkedHashMap();
    protected List<aan> o;

    public zi(BeanDescription beanDescription, DeserializationContext deserializationContext) {
        this.e = beanDescription;
        this.h = deserializationContext;
        this.j = deserializationContext.getConfig();
    }

    public void d(SettableBeanProperty settableBeanProperty, boolean z) {
        this.n.put(settableBeanProperty.getName(), settableBeanProperty);
    }

    public void c(SettableBeanProperty settableBeanProperty) {
        SettableBeanProperty settableBeanPropertyPut = this.n.put(settableBeanProperty.getName(), settableBeanProperty);
        if (settableBeanPropertyPut == null || settableBeanPropertyPut == settableBeanProperty) {
            return;
        }
        throw new IllegalArgumentException("Duplicate property '" + settableBeanProperty.getName() + "' for " + this.e.getType());
    }

    public void a(String str, SettableBeanProperty settableBeanProperty) {
        if (this.d == null) {
            this.d = new HashMap<>(4);
        }
        if (this.j.canOverrideAccessModifiers()) {
            settableBeanProperty.fixAccess(this.j);
        }
        this.d.put(str, settableBeanProperty);
    }

    public void b(ys ysVar, JavaType javaType, Annotations annotations, AnnotatedMember annotatedMember, Object obj) {
        if (this.o == null) {
            this.o = new ArrayList();
        }
        if (this.j.canOverrideAccessModifiers()) {
            annotatedMember.fixAccess(this.j.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        this.o.add(new aan(ysVar, javaType, annotatedMember, obj));
    }

    public void c(String str) {
        if (this.g == null) {
            this.g = new HashSet<>();
        }
        this.g.add(str);
    }

    public void b(String str) {
        if (this.i == null) {
            this.i = new HashSet<>();
        }
        this.i.add(str);
    }

    public void a(SettableBeanProperty settableBeanProperty) {
        c(settableBeanProperty);
    }

    public void a(zj zjVar) {
        if (this.f54126a != null && zjVar != null) {
            throw new IllegalStateException("_anySetter already set to non-null");
        }
        this.f54126a = zjVar;
    }

    public void e(boolean z) {
        this.f = z;
    }

    public void c(ValueInstantiator valueInstantiator) {
        this.l = valueInstantiator;
    }

    public void e(aah aahVar) {
        this.m = aahVar;
    }

    public void b(aco acoVar, JsonPOJOBuilder.e eVar) {
        this.f54128c = acoVar;
        this.f54127b = eVar;
    }

    public SettableBeanProperty d(ys ysVar) {
        return this.n.get(ysVar.b());
    }

    public zj d() {
        return this.f54126a;
    }

    public ValueInstantiator h() {
        return this.l;
    }

    public List<aan> j() {
        return this.o;
    }

    public aah i() {
        return this.m;
    }

    public aco b() {
        return this.f54128c;
    }

    public boolean d(String str) {
        return ahy.b(str, this.g, this.i);
    }

    public JsonDeserializer<?> c() {
        Collection<SettableBeanProperty> collectionValues = this.n.values();
        b(collectionValues);
        zr zrVarB = zr.b(this.j, collectionValues, e(collectionValues), e());
        zrVarB.c();
        boolean zIsEnabled = this.j.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        boolean z = !zIsEnabled;
        if (zIsEnabled) {
            Iterator<SettableBeanProperty> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (it.next().hasViews()) {
                    z = true;
                    break;
                }
            }
        }
        boolean z2 = z;
        if (this.m != null) {
            zrVarB = zrVarB.d(new aaf(this.m, yq.d));
        }
        return new zf(this, this.e, zrVarB, this.d, this.g, this.f, this.i, z2);
    }

    public zd a() {
        return new zd(this, this.e, this.d, this.n);
    }

    public JsonDeserializer<?> d(JavaType javaType, String str) throws ym {
        aco acoVar = this.f54128c;
        if (acoVar == null) {
            if (!str.isEmpty()) {
                this.h.reportBadDefinition(this.e.getType(), String.format("Builder class %s does not have build method (name: '%s')", ahw.a(this.e.getType()), str));
            }
        } else {
            Class<?> clsA = acoVar.a();
            Class<?> rawClass = javaType.getRawClass();
            if (clsA != rawClass && !clsA.isAssignableFrom(rawClass) && !rawClass.isAssignableFrom(clsA)) {
                this.h.reportBadDefinition(this.e.getType(), String.format("Build method `%s` has wrong return type (%s), not compatible with POJO type (%s)", this.f54128c.getFullName(), ahw.a((Object) clsA), ahw.a(javaType)));
            }
        }
        Collection<SettableBeanProperty> collectionValues = this.n.values();
        b(collectionValues);
        zr zrVarB = zr.b(this.j, collectionValues, e(collectionValues), e());
        zrVarB.c();
        boolean zIsEnabled = this.j.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        boolean z = !zIsEnabled;
        if (zIsEnabled) {
            Iterator<SettableBeanProperty> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (it.next().hasViews()) {
                    z = true;
                    break;
                }
            }
        }
        if (this.m != null) {
            zrVarB = zrVarB.d(new aaf(this.m, yq.d));
        }
        return a(javaType, zrVarB, z);
    }

    protected JsonDeserializer<?> a(JavaType javaType, zr zrVar, boolean z) {
        return new ze(this, this.e, javaType, zrVar, this.d, this.g, this.f, this.i, z);
    }

    protected void b(Collection<SettableBeanProperty> collection) {
        if (this.j.canOverrideAccessModifiers()) {
            Iterator<SettableBeanProperty> it = collection.iterator();
            while (it.hasNext()) {
                it.next().fixAccess(this.j);
            }
        }
        zj zjVar = this.f54126a;
        if (zjVar != null) {
            zjVar.c(this.j);
        }
        aco acoVar = this.f54128c;
        if (acoVar != null) {
            acoVar.fixAccess(this.j.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
    }

    protected Map<String, List<ys>> e(Collection<SettableBeanProperty> collection) {
        AnnotationIntrospector annotationIntrospector = this.j.getAnnotationIntrospector();
        HashMap map = null;
        if (annotationIntrospector != null) {
            for (SettableBeanProperty settableBeanProperty : collection) {
                List<ys> listFindPropertyAliases = annotationIntrospector.findPropertyAliases(settableBeanProperty.getMember());
                if (listFindPropertyAliases != null && !listFindPropertyAliases.isEmpty()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(settableBeanProperty.getName(), listFindPropertyAliases);
                }
            }
        }
        return map == null ? Collections.EMPTY_MAP : map;
    }

    protected boolean e() {
        Boolean boolA = this.e.findExpectedFormat(null).a(JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        if (boolA == null) {
            return this.j.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        }
        return boolA.booleanValue();
    }
}
