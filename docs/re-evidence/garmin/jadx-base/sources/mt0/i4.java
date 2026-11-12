package mt0;

import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public final class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f120659a = gt2.c.b(com.garmin.android.apps.connectmobile.a2.CHALLENGES.f28756a);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements androidx.lifecycle.z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f120660a;

        public a(e23.l lVar) {
            lVar.getClass();
            this.f120660a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f120660a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f120660a.invoke(obj);
        }
    }
}
