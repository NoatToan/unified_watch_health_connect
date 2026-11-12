package lj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ui.j;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f112927a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f112928b = new HashMap();

    public static class a<T, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f112929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<R> f112930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j<T, R> f112931c;

        public a(Class<T> cls, Class<R> cls2, j<T, R> jVar) {
            this.f112929a = cls;
            this.f112930b = cls2;
            this.f112931c = jVar;
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.f112927a.contains(str)) {
                this.f112927a.add(str);
            }
            arrayList = (List) this.f112928b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f112928b.put(str, arrayList);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f112927a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f112928b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if ((aVar.f112929a.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(aVar.f112930b)) && !arrayList.contains(aVar.f112930b)) {
                        arrayList.add(aVar.f112930b);
                    }
                }
            }
        }
        return arrayList;
    }
}
