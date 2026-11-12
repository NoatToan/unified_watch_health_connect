package net.lingala.zip4j.io.outputstream;

import java.io.IOException;

/* JADX INFO: loaded from: classes20.dex */
public interface OutputStreamWithSplitZipSupport {
    int getCurrentSplitFileCounter();

    long getFilePointer() throws IOException;
}
