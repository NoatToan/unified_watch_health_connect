package bn;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public interface a {

    /* JADX INFO: renamed from: bn.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbn/a$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0275a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f18963a = 0;

        static {
            new C0275a();
        }

        private C0275a() {
        }
    }

    static {
        int i14 = C0275a.f18963a;
    }

    static /* synthetic */ Object b(a aVar, boolean z14, v13.c cVar, int i14) {
        if ((i14 & 2) != 0) {
            z14 = false;
        }
        return aVar.a(86400000L, cVar, z14);
    }

    Object a(long j8, v13.c cVar, boolean z14);
}
