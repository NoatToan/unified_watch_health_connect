package re0;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface h {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final a f152133t0 = a.f152134a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lre0/h$a;", "", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f152134a = new a();

        private a() {
        }

        public static h a(hl.a aVar) {
            aVar.getClass();
            if (aVar instanceof hl.a.b) {
                return new m((n) KoinJavaComponent.get$default(n.class, null, null, 6, null), ((hl.a.b) aVar).f84252b);
            }
            re0.a.f152088a.getClass();
            return new g((re0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, re0.a.class, new c83.h.a[0], null, null, null, 120));
        }
    }

    Object a(v13.c cVar);

    Object b(long j8, v13.i iVar);

    Object c(long j8, v13.i iVar);

    Object d(long j8, rg0.h hVar);
}
