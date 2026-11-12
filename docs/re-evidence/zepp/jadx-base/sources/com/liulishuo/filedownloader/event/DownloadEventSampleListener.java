package com.liulishuo.filedownloader.event;

/* JADX INFO: loaded from: classes18.dex */
public class DownloadEventSampleListener extends IDownloadListener {
    private final IEventListener a;

    public interface IEventListener {
        boolean callback(IDownloadEvent iDownloadEvent);
    }

    public DownloadEventSampleListener(IEventListener iEventListener) {
        this.a = iEventListener;
    }

    @Override // com.liulishuo.filedownloader.event.IDownloadListener
    public boolean callback(IDownloadEvent iDownloadEvent) {
        IEventListener iEventListener = this.a;
        return iEventListener != null && iEventListener.callback(iDownloadEvent);
    }
}
