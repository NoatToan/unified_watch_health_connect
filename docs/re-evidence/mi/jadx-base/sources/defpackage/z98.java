package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class z98 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a<?>> f41038a = new ArrayList();

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f41039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x98<T> f41040b;

        public a(Class<T> cls, x98<T> x98Var) {
            this.f41039a = cls;
            this.f41040b = x98Var;
        }

        public boolean a(Class<?> cls) {
            return this.f41039a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(Class<T> cls, x98<T> x98Var) {
        this.f41038a.add(new a<>(cls, x98Var));
    }

    public synchronized <T> x98<T> b(Class<T> cls) {
        for (a<?> aVar : this.f41038a) {
            if (aVar.a(cls)) {
                return (x98<T>) aVar.f41040b;
            }
        }
        return null;
    }
}
