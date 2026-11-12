package com.huawei.hianalytics;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w0 {
    public static String a(File file) throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArr;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr2 = new byte[1024];
                    byte[] bArr3 = new byte[1024];
                    int i = 0;
                    while (true) {
                        int i2 = fileInputStream.read(bArr3);
                        if (i2 == -1) {
                            break;
                        }
                        if (i2 > 0) {
                            if (bArr2.length - i >= i2) {
                                System.arraycopy(bArr3, 0, bArr2, i, i2);
                            } else {
                                byte[] bArr4 = new byte[(bArr2.length + i2) << 1];
                                System.arraycopy(bArr2, 0, bArr4, 0, i);
                                System.arraycopy(bArr3, 0, bArr4, i, i2);
                                bArr2 = bArr4;
                            }
                            i += i2;
                        }
                    }
                    if (i == 0) {
                        a(fileInputStream);
                        return "";
                    }
                    if (i <= 0) {
                        bArr = new byte[0];
                    } else {
                        bArr = new byte[i];
                        System.arraycopy(bArr2, 0, bArr, 0, i);
                    }
                    String str = new String(bArr, StandardCharsets.UTF_8);
                    a(fileInputStream);
                    return str;
                } catch (Exception unused) {
                    fileInputStream2 = fileInputStream;
                    HiLog.e("HASU", "read file error");
                    a(fileInputStream2);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    a(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
            }
        } catch (Exception unused2) {
        }
    }

    public static void a(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
                    fileOutputStream.flush();
                } catch (Exception unused) {
                    fileOutputStream2 = fileOutputStream;
                    HiLog.e("HASU", "save file error");
                    fileOutputStream = fileOutputStream2;
                } catch (Throwable th) {
                    th = th;
                    a(fileOutputStream);
                    throw th;
                }
            } catch (Exception unused2) {
            }
            a(fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                HiLog.w("HASU", "close error");
            }
        }
    }

    public static JSONObject a(LinkedHashMap linkedHashMap) {
        JSONObject jSONObject;
        synchronized (w0.class) {
            jSONObject = new JSONObject();
            try {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                }
            } catch (Exception unused) {
                HiLog.e("HASU", "map to json error");
            }
        }
        return jSONObject;
    }
}
