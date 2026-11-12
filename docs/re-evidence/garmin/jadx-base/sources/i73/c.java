package i73;

import e73.h;
import e73.m;
import e73.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f92207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f92208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f92209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f92210d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f92211a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f92212b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f92213c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final LinkedHashSet f92214d = h.f63351p;
    }

    private c(b bVar) {
        ArrayList arrayList = bVar.f92211a;
        LinkedHashSet linkedHashSet = bVar.f92214d;
        LinkedHashSet linkedHashSet2 = h.f63351p;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(h.f63352q.get((Class) it.next()));
        }
        this.f92207a = arrayList2;
        this.f92209c = new d(bVar);
        this.f92210d = bVar.f92213c;
        ArrayList arrayList3 = bVar.f92212b;
        this.f92208b = arrayList3;
        new n(new m(arrayList3, Collections.EMPTY_MAP));
    }
}
