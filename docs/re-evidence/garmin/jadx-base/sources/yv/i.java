package yv;

import androidx.lifecycle.z0;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class i implements z0, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f199835a;

    public i(l lVar) {
        lVar.getClass();
        this.f199835a = lVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof z0) && (obj instanceof n)) {
            return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p005kotlin.jvm.internal.n
    public final o13.h<?> getFunctionDelegate() {
        return this.f199835a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.z0
    public final /* synthetic */ void onChanged(Object obj) {
        this.f199835a.invoke(obj);
    }
}
