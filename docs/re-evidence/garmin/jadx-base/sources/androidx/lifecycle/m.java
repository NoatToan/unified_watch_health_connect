package androidx.lifecycle;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f7959a;

        public a(e23.l lVar) {
            lVar.getClass();
            this.f7959a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f7959a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f7959a.invoke(obj);
        }
    }

    public static j a(t13.g gVar, e23.p pVar, int i14) {
        if ((i14 & 1) != 0) {
            gVar = t13.h.f161748a;
        }
        gVar.getClass();
        return new j(gVar, 5000L, pVar);
    }
}
