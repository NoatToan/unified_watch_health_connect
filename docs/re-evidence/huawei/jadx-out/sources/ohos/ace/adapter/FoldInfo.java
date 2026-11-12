package ohos.ace.adapter;

/* JADX INFO: loaded from: classes46.dex */
public class FoldInfo {
    public static final int FOLD_STATUS_EXPANDED = 1;
    public static final int FOLD_STATUS_FOLDED = 2;
    public static final int FOLD_STATUS_HALF_FOLDED = 3;
    public static final int FOLD_STATUS_UNKNOWN = 0;
    private boolean isFoldable = false;
    private int foldStatus = 0;

    public boolean isFoldable() {
        return this.isFoldable;
    }

    public void setFoldable(boolean z) {
        this.isFoldable = z;
    }

    public int getFoldStatus() {
        return this.foldStatus;
    }

    public void setFoldStatus(int i) {
        this.foldStatus = i;
    }
}
