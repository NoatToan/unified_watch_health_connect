package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes20.dex */
public class zuk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<String> f54577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zuk f54578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zuk f54579c;
    private Map<Character, zuk> d;
    private final int e;

    public zuk() {
        this(0);
    }

    public zuk(int i) {
        this.d = new HashMap();
        this.f54578b = null;
        this.f54577a = null;
        this.e = i;
        this.f54579c = i == 0 ? this : null;
    }

    private zuk e(Character ch, boolean z) {
        zuk zukVar;
        zuk zukVar2 = this.d.get(ch);
        return (z || zukVar2 != null || (zukVar = this.f54579c) == null) ? zukVar2 : zukVar;
    }

    public zuk b(Character ch) {
        return e(ch, false);
    }

    public zuk c(Character ch) {
        return e(ch, true);
    }

    public zuk a(Character ch) {
        zuk zukVarC = c(ch);
        if (zukVarC != null) {
            return zukVarC;
        }
        zuk zukVar = new zuk(this.e + 1);
        this.d.put(ch, zukVar);
        return zukVar;
    }

    public void a(String str) {
        if (this.f54577a == null) {
            this.f54577a = new TreeSet();
        }
        this.f54577a.add(str);
    }

    public void a(Collection<String> collection) {
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public Collection<String> e() {
        Set<String> set = this.f54577a;
        return set == null ? Collections.EMPTY_LIST : set;
    }

    public zuk d() {
        return this.f54578b;
    }

    public void d(zuk zukVar) {
        this.f54578b = zukVar;
    }

    public Collection<zuk> c() {
        return this.d.values();
    }

    public Collection<Character> a() {
        return this.d.keySet();
    }
}
