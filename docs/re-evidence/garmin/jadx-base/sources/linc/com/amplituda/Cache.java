package linc.com.amplituda;

/* JADX INFO: loaded from: classes3.dex */
public class Cache {
    static final String DEFAULT_KEY = "";
    static final int NONE = 1;
    public static final int REFRESH = 3;
    public static final int REUSE = 2;
    private final String key;
    private final int state;

    private Cache(int i14, String str) {
        this.state = i14;
        this.key = str;
    }

    public static Cache getDefault() {
        return withParams(1);
    }

    public static Cache withParams(int i14, String str) {
        if (i14 < 1 || i14 > 3) {
            return withParams(1);
        }
        return str == null ? withParams(i14, "") : new Cache(i14, str);
    }

    public String getKey() {
        return this.key;
    }

    public int getState() {
        return this.state;
    }

    public boolean isEnabled() {
        return getState() != 1;
    }

    public static Cache withParams(int i14) {
        return withParams(i14, "");
    }
}
