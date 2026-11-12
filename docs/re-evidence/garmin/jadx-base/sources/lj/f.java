package lj;

import java.util.ArrayList;
import ui.k;

/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f112932a = new ArrayList();

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f112933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k<T> f112934b;

        public a(Class<T> cls, k<T> kVar) {
            this.f112933a = cls;
            this.f112934b = kVar;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized <Z> k<Z> a(Class<Z> cls) {
        int size = this.f112932a.size();
        for (int i14 = 0; i14 < size; i14++) {
            a aVar = (a) this.f112932a.get(i14);
            if (aVar.f112933a.isAssignableFrom((Class<?>) cls)) {
                return aVar.f112934b;
            }
        }
        return null;
    }
}
