package com.liulishuo.filedownloader.event;

/* JADX INFO: loaded from: classes18.dex */
public class DownloadServiceConnectChangedEvent extends IDownloadEvent {
    public static final String ID = "event.service.connect.changed";
    private final ConnectStatus a;
    private final Class<?> b;

    public enum ConnectStatus {
        connected,
        disconnected,
        lost
    }

    public DownloadServiceConnectChangedEvent(ConnectStatus connectStatus, Class<?> cls) {
        super(ID);
        this.a = connectStatus;
        this.b = cls;
    }

    public ConnectStatus getStatus() {
        return this.a;
    }

    public boolean isSuchService(Class<?> cls) {
        Class<?> cls2 = this.b;
        return cls2 != null && cls2.getName().equals(cls.getName());
    }
}
