package sk0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsk0/h;", "", "", "isSaving", "Lsk0/p1;", "saveResult", "<init>", "(ZLsk0/p1;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f159672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f159673b;

    public h(boolean z14, p1 p1Var) {
        this.f159672a = z14;
        this.f159673b = p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f159672a == hVar.f159672a && p005kotlin.jvm.internal.s.g(this.f159673b, hVar.f159673b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f159672a) * 31;
        p1 p1Var = this.f159673b;
        return iHashCode + (p1Var == null ? 0 : p1Var.hashCode());
    }

    public final String toString() {
        return "AddCollectionState(isSaving=" + this.f159672a + ", saveResult=" + this.f159673b + ")";
    }
}
