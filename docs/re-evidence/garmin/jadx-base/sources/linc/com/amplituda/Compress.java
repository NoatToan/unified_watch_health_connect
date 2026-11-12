package linc.com.amplituda;

/* JADX INFO: loaded from: classes3.dex */
public final class Compress {
    public static final int AVERAGE = 4;
    static final int NONE = 1;
    public static final int PEEK = 3;
    public static final int SKIP = 2;
    private final int preferredSamplesPerSecond;
    private final int type;

    private Compress(int i14, int i15) {
        this.type = i14;
        this.preferredSamplesPerSecond = i15;
    }

    public static Compress getDefault() {
        return withParams(1, 1);
    }

    public static Compress withParams(int i14, int i15) {
        return (i14 <= 1 || i15 > 0) ? new Compress(i14, i15) : getDefault();
    }

    public int getPreferredSamplesPerSecond() {
        return this.preferredSamplesPerSecond;
    }

    public int getType() {
        return this.type;
    }
}
