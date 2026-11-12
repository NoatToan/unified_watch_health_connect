package defpackage;

/* JADX INFO: loaded from: classes22.dex */
public final class bbq extends Exception {
    private static final long serialVersionUID = 398957975986243915L;
    private final int e;

    public bbq(int i, Throwable th) {
        super("Module Load Error: " + i, th);
        this.e = i;
    }

    int c() {
        return this.e;
    }
}
