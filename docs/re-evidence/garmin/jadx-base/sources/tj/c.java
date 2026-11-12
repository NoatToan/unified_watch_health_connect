package tj;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f164736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f164737b;

    public c(long j8, int i14) {
        this.f164737b = j8;
        this.f164736a = i14;
    }

    public static c a(int i14, int i15, String str) {
        if (i14 >= i15) {
            return null;
        }
        long j8 = 0;
        int i16 = i14;
        while (i16 < i15) {
            char cCharAt = str.charAt(i16);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j8 = (j8 * 10) + ((long) (cCharAt - '0'));
            if (j8 > 2147483647L) {
                return null;
            }
            i16++;
        }
        if (i16 == i14) {
            return null;
        }
        return new c(j8, i16);
    }
}
