package ohos.ace.adapter.capability.bridge;

/* JADX INFO: loaded from: classes20.dex */
public interface IMethodResult {
    void onError(String str, int i, String str2);

    void onMethodCancel(String str);

    void onSuccess(Object obj);
}
