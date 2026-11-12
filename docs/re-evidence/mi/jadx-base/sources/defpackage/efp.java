package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class efp {
    public static String a(long j) {
        int i = (int) (j / 1000);
        int i2 = i % 60;
        int i3 = (i / 60) % 60;
        int i4 = i / 3600;
        try {
            return i4 > 0 ? String.format("%02d:%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2)) : String.format("%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i2));
        } catch (Exception unused) {
            return null;
        }
    }
}
