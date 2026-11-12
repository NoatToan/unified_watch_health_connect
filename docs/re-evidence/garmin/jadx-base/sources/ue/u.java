package ue;

/* JADX INFO: loaded from: classes7.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f170121a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f170122b;

    public static class a extends u {
        public a(int i14) {
            super(i14);
        }
    }

    public u(int i14) {
    }

    public static u a() {
        a aVar;
        synchronized (f170121a) {
            try {
                if (f170122b == null) {
                    f170122b = new a(3);
                }
                aVar = f170122b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return aVar;
    }

    public static String b(String str) {
        int length = str.length();
        StringBuilder sb3 = new StringBuilder(23);
        sb3.append("WM-");
        if (length >= 20) {
            sb3.append(str.substring(0, 20));
        } else {
            sb3.append(str);
        }
        return sb3.toString();
    }
}
