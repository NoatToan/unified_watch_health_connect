package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface u0 {

    public interface a {
    }

    static int h(int i14, int i15, int i16, int i17) {
        return i14 | i15 | i16 | 128 | i17;
    }

    static boolean j(int i14, boolean z14) {
        int i15 = i14 & 7;
        if (i15 != 4) {
            return z14 && i15 == 3;
        }
        return true;
    }

    int a(androidx.media3.common.q qVar);

    String getName();

    int supportsMixedMimeTypeAdaptation();
}
