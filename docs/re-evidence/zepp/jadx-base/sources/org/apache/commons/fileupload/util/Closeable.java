package org.apache.commons.fileupload.util;

import java.io.IOException;

/* JADX INFO: loaded from: classes23.dex */
public interface Closeable {
    void close() throws IOException;

    boolean isClosed() throws IOException;
}
