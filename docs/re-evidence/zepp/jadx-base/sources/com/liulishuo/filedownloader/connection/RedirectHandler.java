package com.liulishuo.filedownloader.connection;

import com.liulishuo.filedownloader.download.CustomComponentHolder;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class RedirectHandler {
    private static final int a = 10;
    private static final int b = 307;
    private static final int c = 308;

    private static FileDownloadConnection a(Map<String, List<String>> map, String str) throws IOException {
        FileDownloadConnection fileDownloadConnectionCreateConnection = CustomComponentHolder.getImpl().createConnection(str);
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value != null) {
                Iterator<String> it2 = value.iterator();
                while (it2.hasNext()) {
                    fileDownloadConnectionCreateConnection.addHeader(key, it2.next());
                }
            }
        }
        return fileDownloadConnectionCreateConnection;
    }

    private static boolean b(int i) {
        return i == 301 || i == 302 || i == 303 || i == 300 || i == 307 || i == 308;
    }

    public static FileDownloadConnection process(Map<String, List<String>> map, FileDownloadConnection fileDownloadConnection, List<String> list) throws IllegalAccessException, IOException {
        int responseCode = fileDownloadConnection.getResponseCode();
        String responseHeaderField = fileDownloadConnection.getResponseHeaderField("Location");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (b(responseCode)) {
            if (responseHeaderField == null) {
                throw new IllegalAccessException(FileDownloadUtils.formatString("receive %d (redirect) but the location is null with response [%s]", Integer.valueOf(responseCode), fileDownloadConnection.getResponseHeaderFields()));
            }
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(RedirectHandler.class, "redirect to %s with %d, %s", responseHeaderField, Integer.valueOf(responseCode), arrayList);
            }
            fileDownloadConnection.ending();
            fileDownloadConnection = a(map, responseHeaderField);
            arrayList.add(responseHeaderField);
            fileDownloadConnection.execute();
            responseCode = fileDownloadConnection.getResponseCode();
            responseHeaderField = fileDownloadConnection.getResponseHeaderField("Location");
            i++;
            if (i >= 10) {
                throw new IllegalAccessException(FileDownloadUtils.formatString("redirect too many times! %s", arrayList));
            }
        }
        if (list != null) {
            list.addAll(arrayList);
        }
        return fileDownloadConnection;
    }
}
