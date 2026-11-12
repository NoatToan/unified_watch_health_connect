package org.apache.commons.fileupload.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.fileupload.FileItemHeaders;

/* JADX INFO: loaded from: classes23.dex */
public class FileItemHeadersImpl implements FileItemHeaders, Serializable {
    private static final long serialVersionUID = -4455695752627032559L;
    private final Map<String, List<String>> a = new LinkedHashMap();

    public synchronized void addHeader(String str, String str2) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        List<String> arrayList = this.a.get(lowerCase);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.a.put(lowerCase, arrayList);
        }
        arrayList.add(str2);
    }

    @Override // org.apache.commons.fileupload.FileItemHeaders
    public String getHeader(String str) {
        List<String> list = this.a.get(str.toLowerCase(Locale.ENGLISH));
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    @Override // org.apache.commons.fileupload.FileItemHeaders
    public Iterator<String> getHeaderNames() {
        return this.a.keySet().iterator();
    }

    @Override // org.apache.commons.fileupload.FileItemHeaders
    public Iterator<String> getHeaders(String str) {
        List<String> listEmptyList = this.a.get(str.toLowerCase(Locale.ENGLISH));
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        return listEmptyList.iterator();
    }
}
