package nq;

import androidx.lifecycle.z0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class c implements z0, p005kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f126887a;

    public c(e23.l lVar) {
        lVar.getClass();
        this.f126887a = lVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
            return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p005kotlin.jvm.internal.n
    public final o13.h<?> getFunctionDelegate() {
        return this.f126887a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.z0
    public final /* synthetic */ void onChanged(Object obj) {
        this.f126887a.invoke(obj);
    }
}
