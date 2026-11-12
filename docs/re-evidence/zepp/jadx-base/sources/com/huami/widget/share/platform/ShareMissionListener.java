package com.huami.widget.share.platform;

/* JADX INFO: loaded from: classes17.dex */
public interface ShareMissionListener {
    void onCancel(int i);

    void onFailed(int i, ErrorMessage errorMessage);

    void onSuccess(int i, ShareResult shareResult);
}
