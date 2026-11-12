package fg;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f71198a = a.ONLINE;

    public enum a {
        ONLINE,
        PRE_SANDBOX,
        SANDBOX
    }

    public static boolean a() {
        return f71198a == a.PRE_SANDBOX || f71198a == a.SANDBOX;
    }
}
