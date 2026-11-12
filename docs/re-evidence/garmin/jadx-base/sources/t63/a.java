package t63;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Map<String, SortedSet<String>>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeMap<String, SortedSet<String>> f162800a = new TreeMap<>();

    public final String a(String str) {
        SortedSet<String> sortedSet = this.f162800a.get(str);
        String strFirst = (sortedSet == null || sortedSet.isEmpty()) ? null : sortedSet.first();
        if (strFirst == null) {
            return null;
        }
        return com.nimbusds.jose.shaded.gson.internal.a.h(str, "=\"", strFirst, "\"");
    }

    public final String b(String str, String str2, boolean z14) {
        if (z14) {
            str = r63.b.d(str);
        }
        TreeMap<String, SortedSet<String>> treeMap = this.f162800a;
        SortedSet<String> treeSet = treeMap.get(str);
        if (treeSet == null) {
            treeSet = new TreeSet<>();
            treeMap.put(str, treeSet);
        }
        if (str2 != null) {
            if (z14) {
                str2 = r63.b.d(str2);
            }
            treeSet.add(str2);
        }
        return str2;
    }

    public final void c(a aVar, boolean z14) {
        TreeMap<String, SortedSet<String>> treeMap = this.f162800a;
        if (!z14) {
            treeMap.putAll(aVar);
            return;
        }
        for (String str : aVar.f162800a.keySet()) {
            SortedSet<String> sortedSet = aVar.get(str);
            treeMap.remove(str);
            Iterator<String> it = sortedSet.iterator();
            while (it.hasNext()) {
                b(str, it.next(), true);
            }
            treeMap.get(str);
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f162800a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f162800a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator<SortedSet<String>> it = this.f162800a.values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, SortedSet<String>>> entrySet() {
        return this.f162800a.entrySet();
    }

    @Override // java.util.Map
    public final SortedSet<String> get(Object obj) {
        return this.f162800a.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f162800a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f162800a.keySet();
    }

    @Override // java.util.Map
    public final SortedSet<String> put(String str, SortedSet<String> sortedSet) {
        return this.f162800a.put(str, sortedSet);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends SortedSet<String>> map) {
        this.f162800a.putAll(map);
    }

    @Override // java.util.Map
    public final SortedSet<String> remove(Object obj) {
        return this.f162800a.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        TreeMap<String, SortedSet<String>> treeMap = this.f162800a;
        Iterator<String> it = treeMap.keySet().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += treeMap.get(it.next()).size();
        }
        return size;
    }

    @Override // java.util.Map
    public final Collection<SortedSet<String>> values() {
        return this.f162800a.values();
    }
}
