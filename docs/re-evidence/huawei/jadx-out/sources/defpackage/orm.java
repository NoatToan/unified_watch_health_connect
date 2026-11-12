package defpackage;

/* JADX INFO: loaded from: classes13.dex */
public final class orm {
    public static int e(String str, int i) {
        if (!ort.d(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }
}
