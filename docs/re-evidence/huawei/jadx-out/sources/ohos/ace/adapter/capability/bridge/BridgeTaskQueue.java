package ohos.ace.adapter.capability.bridge;

/* JADX INFO: loaded from: classes46.dex */
public interface BridgeTaskQueue {

    public enum TaskTag {
        INPUT,
        OUTPUT
    }

    void dispatch(Runnable runnable);

    TaskTag getTag();
}
