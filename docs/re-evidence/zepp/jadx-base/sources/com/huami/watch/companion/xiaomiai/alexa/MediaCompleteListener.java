package com.huami.watch.companion.xiaomiai.alexa;

import com.amazon.alexa.avs.message.response.Directive;
import com.liulishuo.filedownloader.BaseDownloadTask;

/* JADX INFO: loaded from: classes16.dex */
public interface MediaCompleteListener {
    void onMediaComplete(BaseDownloadTask baseDownloadTask, Directive directive, String str);

    void onMediaError(BaseDownloadTask baseDownloadTask, Directive directive, String str);

    void onMediaStart(BaseDownloadTask baseDownloadTask, Directive directive, String str, int i);
}
