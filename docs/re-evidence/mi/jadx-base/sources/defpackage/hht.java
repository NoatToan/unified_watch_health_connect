package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class hht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f20083b;
    public static int c;

    static {
        String str = o4s.f28738a ? "ONEBOX" : "@SHIP.TO.2A2FE0D7@";
        f20082a = str;
        f20083b = false;
        c = 1;
        if (str.equalsIgnoreCase("SANDBOX")) {
            c = 2;
        } else if (str.equalsIgnoreCase("ONEBOX")) {
            c = 3;
        } else {
            c = 1;
        }
    }

    public static int a() {
        return c;
    }

    public static void b(int i) {
        c = i;
    }

    public static boolean c() {
        return c == 2;
    }

    public static boolean d() {
        return c == 3;
    }
}
