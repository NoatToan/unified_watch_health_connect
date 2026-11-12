package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class loo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eoo f25283b;
    public volatile boolean c;

    public boolean equals(Object obj) {
        if (!(obj instanceof loo)) {
            return false;
        }
        loo looVar = (loo) obj;
        return this.f25282a == looVar.f25282a && this.f25283b.equals(looVar.f25283b);
    }

    public int hashCode() {
        return this.f25282a.hashCode() + this.f25283b.c.hashCode();
    }
}
