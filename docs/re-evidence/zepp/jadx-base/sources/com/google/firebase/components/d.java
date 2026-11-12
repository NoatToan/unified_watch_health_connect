package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
class d {

    public static class b {
        private final Component<?> a;
        private final Set<b> b = new HashSet();
        private final Set<b> c = new HashSet();

        public b(Component<?> component) {
            this.a = component;
        }

        public void a(b bVar) {
            this.b.add(bVar);
        }

        public void b(b bVar) {
            this.c.add(bVar);
        }

        public Component<?> c() {
            return this.a;
        }

        public Set<b> d() {
            return this.b;
        }

        public boolean e() {
            return this.b.isEmpty();
        }

        public boolean f() {
            return this.c.isEmpty();
        }

        public void g(b bVar) {
            this.c.remove(bVar);
        }
    }

    public static class c {
        private final Class<?> a;
        private final boolean b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b == this.b;
        }

        public int hashCode() {
            return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
        }

        private c(Class<?> cls, boolean z) {
            this.a = cls;
            this.b = z;
        }
    }

    public static void a(List<Component<?>> list) {
        Set<b> setC = c(list);
        Set<b> setB = b(setC);
        int i = 0;
        while (!setB.isEmpty()) {
            b next = setB.iterator().next();
            setB.remove(next);
            i++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    setB.add(bVar);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setC) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<Component<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<Component<?>> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    for (b bVar : (Set) it3.next()) {
                        for (Dependency dependency : bVar.c().getDependencies()) {
                            if (dependency.isDirectInjection() && (set = (Set) map.get(new c(dependency.getInterface(), dependency.isSet()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it4 = map.values().iterator();
                while (it4.hasNext()) {
                    hashSet.addAll((Set) it4.next());
                }
                return hashSet;
            }
            Component<?> next = it2.next();
            b bVar3 = new b(next);
            for (Class<? super Object> cls : next.getProvidedInterfaces()) {
                c cVar = new c(cls, !next.isValue());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar3);
            }
        }
    }
}
