package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import k7.f;
import p1.k1;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f6370a = new f(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1<T, ArrayList<T>> f6371b = new k1<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<T> f6372c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet<T> f6373d = new HashSet<>();

    public final void a(T t7, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t7)) {
            return;
        }
        if (hashSet.contains(t7)) {
            kg.f.n("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(t7);
        ArrayList<T> arrayList2 = this.f6371b.get(t7);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                a(arrayList2.get(i14), arrayList, hashSet);
            }
        }
        hashSet.remove(t7);
        arrayList.add(t7);
    }
}
