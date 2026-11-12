package ij;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f93802a = new ArrayList();

    public static final class a<Z, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<Z> f93803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<R> f93804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e<Z, R> f93805c;

        public a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.f93803a = cls;
            this.f93804b = cls2;
            this.f93805c = eVar;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList a(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f93802a) {
            if ((aVar.f93803a.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(aVar.f93804b)) && !arrayList.contains(aVar.f93804b)) {
                arrayList.add(aVar.f93804b);
            }
        }
        return arrayList;
    }
}
