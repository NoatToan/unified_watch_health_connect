package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class skk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final skk f33739b = new skk(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33740a;

    public skk(boolean z) {
        this.f33740a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && skk.class == obj.getClass() && this.f33740a == ((skk) obj).f33740a;
    }

    public int hashCode() {
        return !this.f33740a ? 1 : 0;
    }
}
