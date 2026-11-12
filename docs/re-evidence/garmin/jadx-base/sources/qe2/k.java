package qe2;

import ie2.s;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqe2/k;", "Lie2/s;", "<init>", "()V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f144593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f144594b;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this == obj;
        }
        return (obj instanceof s) && this.f144594b == obj;
    }

    public final int hashCode() {
        s sVar = this.f144594b;
        if (sVar != null) {
            return sVar.hashCode();
        }
        return 0;
    }

    @Override // ie2.s
    public final void remove() {
        s sVar = this.f144594b;
        if (sVar != null) {
            sVar.remove();
        }
        this.f144593a = true;
    }
}
