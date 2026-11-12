package oi2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pi2.c;
import pi2.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Loi2/a;", "", "<init>", "()V", "a", "application-events_release"}, k = 1, mv = {1, 4, 0})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2513a f132270a = new C2513a(null);

    public static final void a(c cVar) {
        f132270a.getClass();
        C2513a.b(cVar);
    }

    public static final void b(c cVar) {
        f132270a.getClass();
        C2513a.c(cVar);
    }

    /* JADX INFO: renamed from: oi2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loi2/a$a;", "", "<init>", "()V", "application-events_release"}, k = 1, mv = {1, 4, 0})
    public static final class C2513a {
        private C2513a() {
        }

        public static void a(C2513a c2513a, f fVar) {
            c2513a.getClass();
            l73.c.b().e(fVar);
        }

        public static void b(c cVar) {
            boolean zContainsKey;
            cVar.getClass();
            l73.c cVarB = l73.c.b();
            synchronized (cVarB) {
                zContainsKey = cVarB.f111418b.containsKey(cVar);
            }
            if (zContainsKey) {
                return;
            }
            l73.c.b().i(cVar);
        }

        public static void c(c cVar) {
            cVar.getClass();
            l73.c.b().k(cVar);
        }

        public /* synthetic */ C2513a(j jVar) {
            this();
        }
    }
}
