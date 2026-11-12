package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public class xpo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f53274b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile xpo f53275c;

    public String e(String str, String str2) {
        return str2;
    }

    public static xpo b() {
        if (f53275c == null) {
            synchronized (f53274b) {
                if (f53275c == null) {
                    f53275c = new xpo();
                }
            }
        }
        return f53275c;
    }
}
