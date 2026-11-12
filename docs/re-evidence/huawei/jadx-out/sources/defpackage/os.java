package defpackage;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class os {
    public static JSONObject a(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    String string = sb.toString();
                    oq.b("mspl", "readFileToJSON result=" + string);
                    return new JSONObject(string);
                }
                sb.append(line);
            }
        } catch (Throwable th) {
            oq.c(th);
            return null;
        }
    }

    public static WebResourceResponse b(String str) {
        WebResourceResponse webResourceResponse = null;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(d(str));
                    HashMap map = new HashMap();
                    map.put("Access-Control-Allow-Origin", "*");
                    WebResourceResponse webResourceResponse2 = new WebResourceResponse(mimeTypeFromExtension, "UTF-8", fileInputStream);
                    try {
                        webResourceResponse2.setResponseHeaders(map);
                        return webResourceResponse2;
                    } catch (Throwable th) {
                        th = th;
                        webResourceResponse = webResourceResponse2;
                        oq.c(th);
                        return webResourceResponse;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return webResourceResponse;
    }

    public static void c(String str) {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        c(file2.getAbsolutePath());
                    } else {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }
    }

    public static String d(String str) {
        return str.substring(str.lastIndexOf(".") + 1);
    }
}
