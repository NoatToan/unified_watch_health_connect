package com.liulishuo.filedownloader.event;

import com.liulishuo.filedownloader.util.FileDownloadLog;

/* JADX INFO: loaded from: classes18.dex */
public abstract class IDownloadEvent {
    public Runnable callback = null;
    public final String id;

    public IDownloadEvent(String str) {
        this.id = str;
    }

    public final String getId() {
        return this.id;
    }

    public IDownloadEvent(String str, boolean z) {
        this.id = str;
        if (z) {
            FileDownloadLog.w(this, "do not handle ORDER any more, %s", str);
        }
    }
}
