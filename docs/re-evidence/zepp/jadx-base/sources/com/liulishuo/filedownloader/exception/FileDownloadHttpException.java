package com.liulishuo.filedownloader.exception;

import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadHttpException extends IOException {
    private final int a;
    private final Map<String, List<String>> b;
    private final Map<String, List<String>> c;

    public FileDownloadHttpException(int i, Map<String, List<String>> map, Map<String, List<String>> map2) {
        super(FileDownloadUtils.formatString("response code error: %d, \n request headers: %s \n response headers: %s", Integer.valueOf(i), map, map2));
        this.a = i;
        this.b = a(map);
        this.c = a(map);
    }

    private static Map<String, List<String>> a(Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            map2.put(entry.getKey(), new ArrayList(entry.getValue()));
        }
        return map2;
    }

    public int getCode() {
        return this.a;
    }

    public Map<String, List<String>> getRequestHeader() {
        return this.b;
    }

    public Map<String, List<String>> getResponseHeader() {
        return this.c;
    }
}
