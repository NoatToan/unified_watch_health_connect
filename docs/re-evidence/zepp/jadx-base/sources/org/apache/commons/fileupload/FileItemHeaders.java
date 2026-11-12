package org.apache.commons.fileupload;

import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
public interface FileItemHeaders {
    String getHeader(String str);

    Iterator<String> getHeaderNames();

    Iterator<String> getHeaders(String str);
}
