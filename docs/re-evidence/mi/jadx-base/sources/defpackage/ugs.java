package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ugs extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35748a;

    public ugs(String str) {
        super(str);
        this.f35748a = -1;
    }

    public ugs(String str, int i) {
        super(str);
        this.f35748a = i;
    }

    public ugs(String str, Exception exc) {
        super(str, exc);
        this.f35748a = -1;
    }

    public ugs(String str, Exception exc, int i) {
        super(str, exc);
        this.f35748a = i;
    }
}
