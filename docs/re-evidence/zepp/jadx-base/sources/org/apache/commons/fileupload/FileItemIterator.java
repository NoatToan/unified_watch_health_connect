package org.apache.commons.fileupload;

import java.io.IOException;

/* JADX INFO: loaded from: classes23.dex */
public interface FileItemIterator {
    boolean hasNext() throws FileUploadException, IOException;

    FileItemStream next() throws FileUploadException, IOException;
}
