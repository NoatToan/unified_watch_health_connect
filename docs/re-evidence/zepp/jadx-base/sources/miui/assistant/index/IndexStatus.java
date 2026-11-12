package miui.assistant.index;

/* JADX INFO: loaded from: classes23.dex */
public class IndexStatus {
    public static final int CODE_GENERIC_ERROR = 100;
    public static final int CODE_SUCCESS = 0;
    private int mCode;
    private String mDesc;

    public IndexStatus(int i) {
        this.mCode = i;
    }

    public int getCode() {
        return this.mCode;
    }

    public String getDesc() {
        return this.mDesc;
    }

    public IndexStatus(int i, String str) {
        this.mCode = i;
        this.mDesc = str;
    }
}
