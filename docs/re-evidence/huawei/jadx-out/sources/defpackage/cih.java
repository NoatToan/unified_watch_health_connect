package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class cih {
    public static String b(String str) {
        return str == null ? "" : str;
    }

    public static String e(String str) {
        return (str == null || !str.startsWith("https://")) ? "https://" + str : str;
    }
}
