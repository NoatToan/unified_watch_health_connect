package it.sauronsoftware.ftp4j;

/* JADX INFO: loaded from: classes22.dex */
public interface FTPDataTransferListener {
    void aborted();

    void completed();

    void failed();

    void started();

    void transferred(int i);
}
