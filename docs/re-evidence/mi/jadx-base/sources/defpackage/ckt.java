package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ckt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gkt f5440a = new gkt("SplitInstallInfoProvider");

    public static String a(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean b(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }
}
