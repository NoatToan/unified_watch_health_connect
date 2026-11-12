package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class dfh extends Exception {
    private static final long serialVersionUID = -5701408157042313112L;
    private final int d;

    public dfh(int i, String str) {
        this(i, str, null);
    }

    public dfh(int i, String str, Throwable th) {
        super("Sport HiWear Error: " + i + " Error Desc: " + str, th);
        this.d = i;
    }
}
