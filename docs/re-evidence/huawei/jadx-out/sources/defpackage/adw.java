package defpackage;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class adw extends SubtypeResolver implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected LinkedHashSet<adg> f309a;

    public adw() {
    }

    protected adw(adw adwVar) {
        LinkedHashSet<adg> linkedHashSet = adwVar.f309a;
        this.f309a = linkedHashSet == null ? null : new LinkedHashSet<>(linkedHashSet);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.SubtypeResolver
    public SubtypeResolver copy() {
        return new adw(this);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.SubtypeResolver
    public void registerSubtypes(adg... adgVarArr) {
        if (this.f309a == null) {
            this.f309a = new LinkedHashSet<>();
        }
        for (adg adgVar : adgVarArr) {
            this.f309a.add(adgVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.SubtypeResolver
    public void registerSubtypes(Class<?>... clsArr) {
        adg[] adgVarArr = new adg[clsArr.length];
        int length = clsArr.length;
        for (int i = 0; i < length; i++) {
            adgVarArr[i] = new adg(clsArr[i]);
        }
        registerSubtypes(adgVarArr);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.SubtypeResolver
    public void registerSubtypes(Collection<Class<?>> collection) {
        adg[] adgVarArr = new adg[collection.size()];
        Iterator<Class<?>> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            adgVarArr[i] = new adg(it.next());
            i++;
        }
        registerSubtypes(adgVarArr);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.SubtypeResolver
    public Collection<adg> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        List<adg> listFindSubtypes;
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        Class<?> rawType = javaType == null ? annotatedMember.getRawType() : javaType.getRawClass();
        HashMap<adg, adg> map = new HashMap<>();
        LinkedHashSet<adg> linkedHashSet = this.f309a;
        if (linkedHashSet != null) {
            for (adg adgVar : linkedHashSet) {
                if (rawType.isAssignableFrom(adgVar.a())) {
                    e(acg.b(mapperConfig, adgVar.a()), adgVar, mapperConfig, annotationIntrospector, map);
                }
            }
        }
        if (annotatedMember != null && (listFindSubtypes = annotationIntrospector.findSubtypes(annotatedMember)) != null) {
            for (adg adgVar2 : listFindSubtypes) {
                e(acg.b(mapperConfig, adgVar2.a()), adgVar2, mapperConfig, annotationIntrospector, map);
            }
        }
        e(acg.b(mapperConfig, rawType), new adg(rawType, null), mapperConfig, annotationIntrospector, map);
        return new ArrayList(map.values());
    }

    @Override // com.fasterxml.jackson.databind.jsontype.SubtypeResolver
    public Collection<adg> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, ack ackVar) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        HashMap<adg, adg> map = new HashMap<>();
        if (this.f309a != null) {
            Class<?> rawType = ackVar.getRawType();
            for (adg adgVar : this.f309a) {
                if (rawType.isAssignableFrom(adgVar.a())) {
                    e(acg.b(mapperConfig, adgVar.a()), adgVar, mapperConfig, annotationIntrospector, map);
                }
            }
        }
        e(ackVar, new adg(ackVar.getRawType(), null), mapperConfig, annotationIntrospector, map);
        return new ArrayList(map.values());
    }

    @Override // com.fasterxml.jackson.databind.jsontype.SubtypeResolver
    public Collection<adg> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        List<adg> listFindSubtypes;
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        Class<?> rawClass = javaType.getRawClass();
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(acg.b(mapperConfig, rawClass), new adg(rawClass, null), mapperConfig, hashSet, linkedHashMap);
        if (annotatedMember != null && (listFindSubtypes = annotationIntrospector.findSubtypes(annotatedMember)) != null) {
            for (adg adgVar : listFindSubtypes) {
                a(acg.b(mapperConfig, adgVar.a()), adgVar, mapperConfig, hashSet, linkedHashMap);
            }
        }
        LinkedHashSet<adg> linkedHashSet = this.f309a;
        if (linkedHashSet != null) {
            for (adg adgVar2 : linkedHashSet) {
                if (rawClass.isAssignableFrom(adgVar2.a())) {
                    a(acg.b(mapperConfig, adgVar2.a()), adgVar2, mapperConfig, hashSet, linkedHashMap);
                }
            }
        }
        return a(rawClass, hashSet, linkedHashMap);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.SubtypeResolver
    public Collection<adg> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, ack ackVar) {
        Class<?> rawType = ackVar.getRawType();
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(ackVar, new adg(rawType, null), mapperConfig, hashSet, linkedHashMap);
        LinkedHashSet<adg> linkedHashSet = this.f309a;
        if (linkedHashSet != null) {
            for (adg adgVar : linkedHashSet) {
                if (rawType.isAssignableFrom(adgVar.a())) {
                    a(acg.b(mapperConfig, adgVar.a()), adgVar, mapperConfig, hashSet, linkedHashMap);
                }
            }
        }
        return a(rawType, hashSet, linkedHashMap);
    }

    protected void e(ack ackVar, adg adgVar, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, HashMap<adg, adg> map) {
        String strFindTypeName;
        if (!adgVar.c() && (strFindTypeName = annotationIntrospector.findTypeName(ackVar)) != null) {
            adgVar = new adg(adgVar.a(), strFindTypeName);
        }
        adg adgVar2 = new adg(adgVar.a());
        if (map.containsKey(adgVar2)) {
            if (!adgVar.c() || map.get(adgVar2).c()) {
                return;
            }
            map.put(adgVar2, adgVar);
            return;
        }
        map.put(adgVar2, adgVar);
        List<adg> listFindSubtypes = annotationIntrospector.findSubtypes(ackVar);
        if (listFindSubtypes == null || listFindSubtypes.isEmpty()) {
            return;
        }
        for (adg adgVar3 : listFindSubtypes) {
            e(acg.b(mapperConfig, adgVar3.a()), adgVar3, mapperConfig, annotationIntrospector, map);
        }
    }

    protected void a(ack ackVar, adg adgVar, MapperConfig<?> mapperConfig, Set<Class<?>> set, Map<String, adg> map) {
        List<adg> listFindSubtypes;
        String strFindTypeName;
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        if (!adgVar.c() && (strFindTypeName = annotationIntrospector.findTypeName(ackVar)) != null) {
            adgVar = new adg(adgVar.a(), strFindTypeName);
        }
        if (adgVar.c()) {
            map.put(adgVar.b(), adgVar);
        }
        if (!set.add(adgVar.a()) || (listFindSubtypes = annotationIntrospector.findSubtypes(ackVar)) == null || listFindSubtypes.isEmpty()) {
            return;
        }
        for (adg adgVar2 : listFindSubtypes) {
            a(acg.b(mapperConfig, adgVar2.a()), adgVar2, mapperConfig, set, map);
        }
    }

    protected Collection<adg> a(Class<?> cls, Set<Class<?>> set, Map<String, adg> map) {
        ArrayList arrayList = new ArrayList(map.values());
        Iterator<adg> it = map.values().iterator();
        while (it.hasNext()) {
            set.remove(it.next().a());
        }
        for (Class<?> cls2 : set) {
            if (cls2 != cls || !Modifier.isAbstract(cls2.getModifiers())) {
                arrayList.add(new adg(cls2));
            }
        }
        return arrayList;
    }
}
