package com.huawei.ui.main.stories.nps.https;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.ParamConstants;
import health.compact.a.util.LogUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class HttpUtils {
    private static final int BYTE_LEN = 1024;
    public static final int CONNECT_TIMEOUT = 5000;
    private static final String HTTP = "http";
    public static final int HTTP_ERR = -1;
    public static final int HTTP_OK = 0;
    private static final int INIT_BYTE_SIZE = 512;
    private static final int MAX_FILE_SIZE = 10485760;
    public static final int READ_TIMEOUT = 5000;
    private static final int RESULT_DEFAULT_CODE = -1;
    private static final String TAG = "PLGOPER_HttpUtils";

    private HttpUtils() {
    }

    public static int postReq(Context context, String str, HashMap<String, String> map, HashMap<String, String> map2, HttpResCallback httpResCallback) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (isHttpProtocol(context, str)) {
            return Http.postReq(context, str, map, map2, httpResCallback);
        }
        return Https.postReq(context, str, map, map2, httpResCallback);
    }

    public static String postReq(Context context, String str, HashMap<String, String> map, HashMap<String, String> map2) {
        if (!TextUtils.isEmpty(str)) {
            if (isHttpProtocol(context, str)) {
                return Http.postReq(context, str, map, map2);
            }
            return Https.postReq(context, str, map, map2);
        }
        return "";
    }

    public static int download(Context context, String str, String str2, HttpResCallback httpResCallback) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (isHttpProtocol(context, str)) {
            return Http.download(context, str, str2, httpResCallback);
        }
        return Https.download(context, str, str2, httpResCallback);
    }

    public static int download(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (isHttpProtocol(context, str)) {
            return Http.download(context, str, str2);
        }
        return Https.download(context, str, str2);
    }

    private static boolean isHttpProtocol(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int iMax = Math.max(str.indexOf(":"), 0);
        return (str.length() >= iMax ? str.substring(0, iMax) : "").equalsIgnoreCase("http");
    }

    public static String getBody(HashMap<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        if (map == null || map.size() <= 0 || (r4 = map.entrySet().iterator()) == null) {
            return "";
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            stringBuffer.append("&").append((Object) entry.getKey()).append("=").append((Object) entry.getValue());
        }
        return stringBuffer.toString().trim().substring(1);
    }

    public static void setHeader(Context context, HttpURLConnection httpURLConnection, HashMap<String, String> map) {
        if (httpURLConnection == null || map == null || map.size() <= 0 || (r1 = map.entrySet().iterator()) == null) {
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

    public static byte[] readInputStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        byte[] byteArray = new byte[1024];
        int i = 0;
        do {
            try {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
                i += i2;
            } catch (IOException unused) {
                LogUtil.c(TAG, "readInputStream IOException!");
                return byteArray;
            }
        } while (i <= MAX_FILE_SIZE);
        byteArrayOutputStream.flush();
        byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    public static Bitmap readInputStream(Context context, InputStream inputStream) {
        try {
            byte[] inputStream2 = readInputStream(inputStream);
            return BitmapFactory.decodeByteArray(inputStream2, 0, inputStream2.length, null);
        } catch (IllegalArgumentException unused) {
            LogUtil.c(TAG, "transformByteToBmp IllegalArgumentException err:");
            return null;
        } finally {
            closeStream(inputStream, null);
        }
    }

    public static boolean saveFile(InputStream inputStream, String str) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        boolean z;
        if (TextUtils.isEmpty(str)) {
            LogUtil.d(TAG, "saveFile isEmpty.");
            return false;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf < 0) {
            iLastIndexOf = 0;
        }
        String fileDir = getFileDir(str, iLastIndexOf);
        if (!createFileDir(fileDir)) {
            return false;
        }
        File file = new File(str);
        File file2 = new File(fileDir + "/_" + getFileName(str, iLastIndexOf));
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                    fileOutputStream.flush();
                    boolean zRenameTo = file2.renameTo(file);
                    if (zRenameTo) {
                        z = true;
                    } else {
                        if (file2.exists()) {
                            LogUtil.e(TAG, "tmp isDeleteRet:", file2.delete() ? "sucess" : ParamConstants.CallbackMethod.ON_FAIL);
                        }
                        z = false;
                    }
                    LogUtil.a(TAG, "isRenameOk:", Boolean.valueOf(zRenameTo));
                    closeStream(inputStream, fileOutputStream);
                    return z;
                } catch (FileNotFoundException unused) {
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.c(TAG, "saveFile exception = FileNotFoundException!");
                    closeStream(inputStream, fileOutputStream2);
                    return false;
                } catch (IOException unused2) {
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.c(TAG, "saveFile exception = IOException!");
                    closeStream(inputStream, fileOutputStream2);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    closeStream(inputStream, fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException unused3) {
        } catch (IOException unused4) {
        }
    }

    public static void closeStream(InputStream inputStream, OutputStream outputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                LogUtil.c(TAG, "streamClose IOException!");
            }
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused2) {
                LogUtil.c(TAG, "streamClose IOException2!");
            }
        }
    }

    private static String getFileDir(String str, int i) {
        return (TextUtils.isEmpty(str) || str.length() < i) ? "" : str.substring(0, i);
    }

    private static boolean createFileDir(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            return true;
        }
        boolean zMkdirs = file.mkdirs();
        LogUtil.e(TAG, "isMkdirRet:", zMkdirs ? "sucess" : ParamConstants.CallbackMethod.ON_FAIL);
        return zMkdirs;
    }

    private static String getFileName(String str, int i) {
        int iMax;
        return (!TextUtils.isEmpty(str) && str.length() > (iMax = Math.max(i + 1, 0))) ? str.substring(iMax) : "";
    }
}
