package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseIntArray f2035a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<Integer, HashSet<WeakReference<a>>> f2036b = new HashMap<>();

    public interface a {
    }

    public void a(int i, a aVar) {
        HashSet<WeakReference<a>> hashSet = this.f2036b.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f2036b.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }

    public void b(int i, a aVar) {
        HashSet<WeakReference<a>> hashSet = this.f2036b.get(Integer.valueOf(i));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (WeakReference<a> weakReference : hashSet) {
            a aVar2 = weakReference.get();
            if (aVar2 == null || aVar2 == aVar) {
                arrayList.add(weakReference);
            }
        }
        hashSet.removeAll(arrayList);
    }
}
