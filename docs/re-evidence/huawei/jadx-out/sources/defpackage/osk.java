package defpackage;

import android.text.TextUtils;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.connectivity.https.HttpResCallBack;
import health.compact.a.CommonUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class osk {
    public static int a(String str, JSONObject jSONObject, HashMap<String, String> map, HttpResCallBack httpResCallBack) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (d(str)) {
            return osi.e(str, jSONObject, map, httpResCallBack);
        }
        return osh.a(str, jSONObject, map, httpResCallBack);
    }

    public static int c(String str, String str2, HttpResCallBack httpResCallBack) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1;
        }
        if (d(str)) {
            return osi.e(str, str2, httpResCallBack);
        }
        return osh.e(str, str2, httpResCallBack);
    }

    private static boolean d(String str) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf > 0) {
            String strSubstring = str.substring(0, iIndexOf);
            LogUtil.a("PLGACHIEVE_HttpUtils", "isHttpProtocol protocol:", strSubstring);
            if (strSubstring.equalsIgnoreCase("http")) {
                return true;
            }
        }
        return false;
    }

    public static void d(HttpURLConnection httpURLConnection, HashMap<String, String> map) {
        if (httpURLConnection == null || map == null || map.size() <= 0) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                httpURLConnection.setRequestProperty(String.valueOf(key), String.valueOf(value));
            }
        }
    }

    public static byte[] e(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return new byte[1024];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int i = 0;
        do {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i2);
            i += i2;
        } while (i <= 10485760);
        byteArrayOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    public static boolean b(InputStream inputStream, String str) {
        boolean z;
        boolean z2 = false;
        if (inputStream == null) {
            return false;
        }
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("PLGACHIEVE_HttpUtils", "saveFile: untrusted -> " + str);
            return false;
        }
        String strC = CommonUtil.c(str);
        if (strC == null || !strC.contains("/")) {
            LogUtil.j("PLGACHIEVE_HttpUtils", "saveFile error: path does not contain /");
            return false;
        }
        int iLastIndexOf = strC.lastIndexOf(47);
        if (iLastIndexOf < 0) {
            return false;
        }
        String strSubstring = strC.substring(0, iLastIndexOf);
        File file = new File(strSubstring);
        if (!file.exists()) {
            boolean zMkdirs = file.mkdirs();
            LogUtil.a("PLGACHIEVE_HttpUtils", "saveFile mkDirRet:", Boolean.valueOf(zMkdirs));
            if (!zMkdirs) {
                return false;
            }
        }
        File file2 = new File(strC);
        File file3 = new File(strSubstring + "/_" + strC.substring(iLastIndexOf + 1, strC.length()));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i);
                    LogUtil.e("PLGACHIEVE_HttpUtils", "saveFile:IOException");
                    a(inputStream);
                    return z2;
                }
                fileOutputStream.flush();
                boolean zRenameTo = file3.renameTo(file2);
                if (zRenameTo) {
                    z = true;
                } else {
                    if (file3.exists()) {
                        LogUtil.a("PLGACHIEVE_HttpUtils", "saveFile tmp deleteRet:", Boolean.valueOf(file3.delete()));
                    }
                    z = false;
                }
                LogUtil.a("PLGACHIEVE_HttpUtils", "saveFile isRenameOK:", Boolean.valueOf(zRenameTo));
                fileOutputStream.close();
                z2 = z;
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            LogUtil.e("PLGACHIEVE_HttpUtils", "saveFile:IOException");
        }
        a(inputStream);
        return z2;
    }

    private static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                LogUtil.e("PLGACHIEVE_HttpUtils", "saveFile:IOException");
            }
        }
    }
}
