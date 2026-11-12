package com.xiaomi.push;

/* JADX INFO: loaded from: classes22.dex */
public class j {
    public static final String a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final boolean f178a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    public static boolean e;
    public static final boolean f;
    public static final boolean g;
    private static int h;

    static {
        int i;
        String str = l.f179a ? "ONEBOX" : "@SHIP.TO.2A2FE0D7@";
        a = str;
        boolean zContains = str.contains("2A2FE0D7");
        f178a = zContains;
        b = zContains || "DEBUG".equalsIgnoreCase(str);
        c = "LOGABLE".equalsIgnoreCase(str);
        d = str.contains("YY");
        e = str.equalsIgnoreCase("TEST");
        f = "BETA".equalsIgnoreCase(str);
        g = str.startsWith("RC");
        h = 1;
        if (str.equalsIgnoreCase("SANDBOX")) {
            i = 2;
        } else {
            if (!str.equalsIgnoreCase("ONEBOX")) {
                h = 1;
                return;
            }
            i = 3;
        }
        h = i;
    }

    public static int a() {
        return h;
    }

    public static void a(int i) {
        h = i;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3789a() {
        return h == 2;
    }

    public static boolean b() {
        return h == 3;
    }
}
