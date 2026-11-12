package androidx.camera.core.impl;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class r0 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5725a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5726b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f5727c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.concurrent.futures.b.d f5728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.concurrent.futures.b.a<Void> f5729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j0 f5730f;

    @Override // androidx.camera.core.impl.q1
    public final void a(List<String> list) throws CameraUpdateException {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f5725a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f5726b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.f5730f.c(str));
            }
            synchronized (this.f5725a) {
                try {
                    HashSet hashSet2 = new HashSet(this.f5726b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList<l0> arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((l0) this.f5726b.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str2 : (ArrayList) list) {
                        if (this.f5726b.containsKey(str2)) {
                            linkedHashMap.put(str2, (l0) this.f5726b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (l0) map.get(str2));
                        }
                    }
                    this.f5726b.clear();
                    this.f5726b.putAll(linkedHashMap);
                    for (l0 l0Var : arrayList) {
                        if (l0Var != null) {
                            l0Var.onRemoved();
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (CameraUnavailableException e4) {
            throw new CameraUpdateException("Failed to create CameraInternal", e4);
        }
    }

    public final l0 b(String str) {
        l0 l0Var;
        synchronized (this.f5725a) {
            try {
                l0Var = (l0) this.f5726b.get(str);
                if (l0Var == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return l0Var;
    }

    public final LinkedHashSet<l0> c() {
        LinkedHashSet<l0> linkedHashSet;
        synchronized (this.f5725a) {
            linkedHashSet = new LinkedHashSet<>((Collection<? extends l0>) this.f5726b.values());
        }
        return linkedHashSet;
    }

    public final void d(j0 j0Var) {
        this.f5730f = j0Var;
        synchronized (this.f5725a) {
            try {
                for (String str : j0Var.e()) {
                    l0 l0Var = (l0) this.f5726b.put(str, j0Var.c(str));
                    if (l0Var != null) {
                        l0Var.release();
                    }
                }
            } catch (CameraUnavailableException e4) {
                throw new InitializationException(e4);
            }
        }
    }
}
