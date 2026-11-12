package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class yqk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a<?>> f40435a = new ArrayList();

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f40436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xqk<T> f40437b;

        public a(Class<T> cls, xqk<T> xqkVar) {
            this.f40436a = cls;
            this.f40437b = xqkVar;
        }

        public boolean a(Class<?> cls) {
            return this.f40436a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(Class<Z> cls, xqk<Z> xqkVar) {
        this.f40435a.add(new a<>(cls, xqkVar));
    }

    public synchronized <Z> xqk<Z> b(Class<Z> cls) {
        int size = this.f40435a.size();
        for (int i = 0; i < size; i++) {
            a<?> aVar = this.f40435a.get(i);
            if (aVar.a(cls)) {
                return (xqk<Z>) aVar.f40437b;
            }
        }
        return null;
    }
}
