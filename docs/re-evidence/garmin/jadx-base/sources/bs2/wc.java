package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class wc extends xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20645c;

    public wc(rc rcVar) {
        this.f20643a = rcVar.f20454c;
        this.f20644b = rcVar.g();
        this.f20645c = rcVar.f20455d;
    }

    @Override // bs2.xc
    public final int a() {
        return this.f20644b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc)) {
            return false;
        }
        wc wcVar = (wc) obj;
        return this.f20643a == wcVar.f20643a && this.f20644b == wcVar.f20644b && this.f20645c == wcVar.f20645c;
    }

    public final int hashCode() {
        return new Integer(this.f20645c).hashCode() + ((new Integer(this.f20644b).hashCode() + ((new Integer(this.f20643a).hashCode() + 47) * 31)) * 19);
    }

    public wc() {
        this.f20643a = 255;
        this.f20644b = 0;
    }
}
