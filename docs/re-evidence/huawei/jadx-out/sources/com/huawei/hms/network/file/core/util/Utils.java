package com.huawei.hms.network.file.core.util;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.embedded.x2;
import com.huawei.hms.network.file.api.GlobalRequestConfig;
import com.huawei.hms.network.file.api.Result;
import com.huawei.hms.network.file.core.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class Utils {
    public static final String REQUEST_TIME = "requestTime";
    public static final String RESPONSE_TIME = "responseTime";
    private static final String TAG = "Utils";
    public static final String TOTAL_TIME = "totalTime";
    private static final String WARN_MESSAGE = "com.huawei.android.hms:download and com.huawei.android.hms:upload will not receive new requirements in the future. The maintenance deadline is December 31, 2021. You are advised to switch services You are advised to switch services to com.huawei.hms:filemanager before this time point";
    private static final HashMap<String, String> METHOD_MAP = new HashMap<>();
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T cast(Object obj) {
        return obj;
    }

    public static boolean checkReadableStream(int i) {
        return i != 304;
    }

    public static void printDeprecatedMethodLog(String str) {
        HashMap<String, String> map = METHOD_MAP;
        if (map.containsKey(str)) {
            return;
        }
        map.put(str, str);
        FLogger.w("Utils", "the method " + str + " is deprecated and invalid in this version", new Object[0]);
    }

    public static void printDeprecatedLogIfNeed() {
        FLogger.w("Utils", WARN_MESSAGE, new Object[0]);
    }

    public static String nullStrToEmpty(String str) {
        return str == null ? "" : str;
    }

    public static boolean isUrlValid(List<String> list) {
        if (isEmpty(list)) {
            return true;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (!isUrlValid(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean isUrlValid(String str) {
        if (isBlank(str)) {
            return false;
        }
        return str.toLowerCase(Locale.ROOT).startsWith("http");
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isDeepEqual(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static boolean isBlank(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static String getValueFromOptions(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new JSONObject(str2).getString(str);
        } catch (JSONException unused) {
            FLogger.w("Utils", "get key From options fail, key is " + str, new Object[0]);
            return "";
        }
    }

    public static String getUrlPath(String str) {
        String path = (isBlank(str) || !str.startsWith("http")) ? "" : Uri.parse(str).getPath();
        return (path == null || path.equals(str)) ? "" : path;
    }

    public static Result.STATUS getMapedStatus(com.huawei.hms.network.file.core.task.e.a aVar) {
        int i = a.f15770a[aVar.ordinal()];
        if (i == 1) {
            return Result.STATUS.INIT;
        }
        if (i != 2) {
            return i != 3 ? Result.STATUS.INVALID : Result.STATUS.PAUSE;
        }
        return Result.STATUS.PROCESS;
    }

    public static long getLongId() {
        return e.b().a();
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public static String getFileHashData(String str, String str2) throws Throwable {
        NoSuchAlgorithmException e;
        FileInputStream fileInputStreamB;
        IndexOutOfBoundsException e2;
        IllegalArgumentException e3;
        IOException e4;
        FileNotFoundException e5;
        ?? r2 = 0;
        try {
            try {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(str2);
                    fileInputStreamB = c.b(str);
                    try {
                        byte[] bArr = new byte[1024];
                        long j = 0;
                        while (true) {
                            int i = fileInputStreamB.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            messageDigest.update(bArr, 0, i);
                            j += (long) i;
                        }
                        String strByteArrayToHex = j > 0 ? byteArrayToHex(messageDigest.digest()) : null;
                        if (fileInputStreamB != null) {
                            fileInputStreamB.close();
                        }
                        return strByteArrayToHex;
                    } catch (FileNotFoundException e6) {
                        e5 = e6;
                        FLogger.e("Utils", "getFileHashData FileNotFoundException", e5);
                        if (fileInputStreamB != null) {
                            fileInputStreamB.close();
                        }
                        return null;
                    } catch (IOException e7) {
                        e4 = e7;
                        FLogger.e("Utils", "getFileHashData IOException", e4);
                        if (fileInputStreamB != null) {
                            fileInputStreamB.close();
                        }
                        return null;
                    } catch (IllegalArgumentException e8) {
                        e3 = e8;
                        FLogger.e("Utils", "getFileHashData IllegalArgumentException", e3);
                        if (fileInputStreamB != null) {
                            fileInputStreamB.close();
                        }
                        return null;
                    } catch (IndexOutOfBoundsException e9) {
                        e2 = e9;
                        FLogger.e("Utils", "getFileHashData IndexOutOfBoundsException", e2);
                        if (fileInputStreamB != null) {
                            fileInputStreamB.close();
                        }
                        return null;
                    } catch (NoSuchAlgorithmException e10) {
                        e = e10;
                        FLogger.e("Utils", "getFileHashData NoSuchAlgorithmException", e);
                        if (fileInputStreamB != null) {
                            fileInputStreamB.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    r2 = str;
                    th = th;
                    if (r2 != 0) {
                        try {
                            r2.close();
                        } catch (IOException unused) {
                            FLogger.e("Utils", "Close FileInputStream failed!");
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e11) {
                e5 = e11;
                fileInputStreamB = null;
            } catch (IOException e12) {
                e4 = e12;
                fileInputStreamB = null;
            } catch (IllegalArgumentException e13) {
                e3 = e13;
                fileInputStreamB = null;
            } catch (IndexOutOfBoundsException e14) {
                e2 = e14;
                fileInputStreamB = null;
            } catch (NoSuchAlgorithmException e15) {
                e = e15;
                fileInputStreamB = null;
            } catch (Throwable th2) {
                th = th2;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
        } catch (IOException unused2) {
            FLogger.e("Utils", "Close FileInputStream failed!");
        }
    }

    public static int getCheckRangeResult(String str, int i, boolean z, boolean z2) {
        boolean z3;
        StringBuilder sb;
        boolean z4;
        StringBuilder sb2;
        String str2;
        HashMap<Pair<Integer, Integer>, Integer> map = Constants.a.i.get(str);
        if (map == null || map.isEmpty()) {
            return 0;
        }
        Iterator<Pair<Integer, Integer>> it = map.keySet().iterator();
        Pair<Integer, Integer> next = null;
        while (it.hasNext()) {
            next = it.next();
        }
        Iterator<Integer> it2 = map.values().iterator();
        int iIntValue = 0;
        while (it2.hasNext()) {
            iIntValue = it2.next().intValue();
        }
        if (next == null) {
            FLogger.e("Utils", "getCheckRangeResult null rangePair for:" + str);
            return iIntValue;
        }
        if (z) {
            z3 = i >= ((Integer) next.first).intValue();
            sb = new StringBuilder("[");
        } else {
            z3 = i > ((Integer) next.first).intValue();
            sb = new StringBuilder(com.huawei.operation.utils.Constants.LEFT_BRACKET_ONLY);
        }
        sb.append(next.first);
        sb.append(",");
        String string = sb.toString();
        if (z2) {
            z4 = i <= ((Integer) next.second).intValue();
            sb2 = new StringBuilder();
            sb2.append(next.second);
            str2 = "]";
        } else {
            z4 = i < ((Integer) next.second).intValue();
            sb2 = new StringBuilder();
            sb2.append(next.second);
            str2 = com.huawei.operation.utils.Constants.RIGHT_BRACKET_ONLY;
        }
        sb2.append(str2);
        String string2 = sb2.toString();
        if (z3 && z4) {
            return i;
        }
        FLogger.w("Utils", str + " range is " + string + string2, new Object[0]);
        return iIntValue;
    }

    public static boolean deleteFile(String str) {
        if (isBlank(str)) {
            return false;
        }
        File fileA = c.a(str);
        if (!fileA.exists()) {
            return false;
        }
        if (fileA.delete()) {
            FLogger.v("Utils", "deleteFile success filePath: " + str);
            return true;
        }
        FLogger.v("Utils", "deleteFile failed filePath: " + str);
        return false;
    }

    public static String convertToJsonString(GlobalRequestConfig globalRequestConfig) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (globalRequestConfig.getConnectTimeoutMillis() != -100) {
                jSONObject.put(x2.CONNECT_TIMEOUT, globalRequestConfig.getConnectTimeoutMillis());
            }
            if (globalRequestConfig.getReadTimeoutMillis() != -100) {
                jSONObject.put("read_timeout", globalRequestConfig.getReadTimeoutMillis());
            }
            if (globalRequestConfig.getWriteTimeoutMillis() != -100) {
                jSONObject.put(x2.WRITE_TIMEMEOUT, globalRequestConfig.getWriteTimeoutMillis());
            }
            if (globalRequestConfig.getPingIntervalMillis() != -100) {
                jSONObject.put("ping_interval", globalRequestConfig.getPingIntervalMillis());
            }
            if (globalRequestConfig.getCallTimeoutMillis() != -100) {
                jSONObject.put("call_timeout", globalRequestConfig.getCallTimeoutMillis());
            }
            jSONObject.put("retry_time", 0);
        } catch (JSONException e) {
            FLogger.w("Utils", "convertToJsonString exception", e);
        }
        return jSONObject.toString();
    }

    public static void close(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (RuntimeException | Exception e) {
            FLogger.logException(e);
        }
    }

    public static void checkNpParamsWithException(String str, Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException(str + " can not be null");
    }

    public static String byteArrayToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(b2 >>> 4) & 15];
            cArr[i + 1] = cArr2[b2 & 15];
            i2++;
            i += 2;
        }
        return new String(cArr);
    }

    public static String anonymizeMessage(String str) {
        return isBlank(str) ? "" : StringUtils.anonymizeMessage(str);
    }

    public static void addNonEmptyMapItem(Map<String, String> map, Map<String, String> map2) {
        if (map == null || map2 == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15770a;

        static {
            int[] iArr = new int[com.huawei.hms.network.file.core.task.e.a.values().length];
            f15770a = iArr;
            try {
                iArr[com.huawei.hms.network.file.core.task.e.a.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15770a[com.huawei.hms.network.file.core.task.e.a.PROCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15770a[com.huawei.hms.network.file.core.task.e.a.PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
