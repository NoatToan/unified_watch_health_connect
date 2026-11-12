package com.huami.widget.share;

/* JADX INFO: loaded from: classes17.dex */
public interface ShareListener {
    void onFailed(int i, String str);

    ShareContent onShareContentCreated(int i);

    void onStart(int i);

    void onSuccess(int i);
}
