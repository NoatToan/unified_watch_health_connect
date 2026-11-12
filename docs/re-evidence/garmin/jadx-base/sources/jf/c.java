package jf;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f98612a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"jf/c$a", "Ljf/c;", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements c {
        @Override // jf.c
        public final boolean equals(Object obj, Object obj2) {
            return p005kotlin.jvm.internal.s.g(obj, obj2);
        }

        @Override // jf.c
        public final int hashCode(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "AsyncImageModelEqualityDelegate.AllProperties";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"jf/c$b", "Ljf/c;", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements c {
        @Override // jf.c
        public final boolean equals(Object obj, Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj instanceof wf.f) || !(obj2 instanceof wf.f)) {
                return p005kotlin.jvm.internal.s.g(obj, obj2);
            }
            wf.f fVar = (wf.f) obj;
            wf.f fVar2 = (wf.f) obj2;
            return p005kotlin.jvm.internal.s.g(fVar.f184902a, fVar2.f184902a) && p005kotlin.jvm.internal.s.g(fVar.f184903b, fVar2.f184903b) && p005kotlin.jvm.internal.s.g(fVar.f184906e, fVar2.f184906e) && p005kotlin.jvm.internal.s.g(fVar.f184907f, fVar2.f184907f) && p005kotlin.jvm.internal.s.g(fVar.f184908g, fVar2.f184908g) && p005kotlin.jvm.internal.s.g(fVar.f184922u, fVar2.f184922u) && fVar.f184923v == fVar2.f184923v && fVar.f184924w == fVar2.f184924w;
        }

        @Override // jf.c
        public final int hashCode(Object obj) {
            if (!(obj instanceof wf.f)) {
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            }
            wf.f fVar = (wf.f) obj;
            int iHashCode = (fVar.f184903b.hashCode() + (fVar.f184902a.hashCode() * 31)) * 31;
            String str = fVar.f184906e;
            int iB = am.j.b(fVar.f184907f, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
            String str2 = fVar.f184908g;
            return fVar.f184924w.hashCode() + ((fVar.f184923v.hashCode() + ((fVar.f184922u.hashCode() + ((iB + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "AsyncImageModelEqualityDelegate.Default";
        }
    }

    /* JADX INFO: renamed from: jf.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"Ljf/c$c;", "", "<init>", "()V", "Ljf/c;", "Default", "Ljf/c;", "AllProperties", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1892c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f98613a = 0;

        static {
            new C1892c();
        }

        private C1892c() {
        }
    }

    static {
        int i14 = C1892c.f98613a;
        f98612a = new b();
        new a();
    }

    boolean equals(Object obj, Object obj2);

    int hashCode(Object obj);
}
