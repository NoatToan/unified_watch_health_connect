package linc.com.amplituda;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AmplitudaProgressListener {
    private ProgressOperation operation;

    public void onOperationChanged(ProgressOperation progressOperation) {
        this.operation = progressOperation;
    }

    public abstract void onProgress(ProgressOperation progressOperation, int i14);

    public void onProgressInternal(int i14) {
        onProgress(this.operation, i14);
    }

    public void onStartProgress() {
    }

    public void onStopProgress() {
    }
}
