package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ioo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final doo f21954b;
    public volatile boolean c = true;

    public ioo(Object obj, doo dooVar) {
        this.f21953a = obj;
        this.f21954b = dooVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ioo)) {
            return false;
        }
        ioo iooVar = (ioo) obj;
        return this.f21953a == iooVar.f21953a && this.f21954b.equals(iooVar.f21954b);
    }

    public int hashCode() {
        return this.f21953a.hashCode() + this.f21954b.f.hashCode();
    }
}
