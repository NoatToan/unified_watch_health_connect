package defpackage;

import android.text.TextUtils;
import health.compact.a.LogUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public class cpb {
    public static String d() {
        if (cop.b()) {
            String strB = b();
            return strB == null ? cot.e() : strB;
        }
        return cot.e();
    }

    private static String b() {
        try {
            String strA = a();
            if (!TextUtils.isEmpty(strA)) {
                LogUtil.b("DeviceManageCommonUtil", "getHarmonyUDID deviceUdid");
                return strA;
            }
            Object objInvoke = Class.forName("com.huawei.android.os.BuildEx").getMethod("getUDID", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                strA = (String) objInvoke;
            }
            LogUtil.b("DeviceManageCommonUtil", "getEmuiDeviceUdid deviceUdid");
            return strA;
        } catch (ClassNotFoundException unused) {
            LogUtil.d("DeviceManageCommonUtil", "getEmuiDeviceUdid(),ClassNotFoundException");
            return null;
        } catch (NoSuchMethodException unused2) {
            LogUtil.d("DeviceManageCommonUtil", "getEmuiDeviceUdid(),NoSuchMethodException");
            return null;
        } catch (InvocationTargetException unused3) {
            LogUtil.d("DeviceManageCommonUtil", "getEmuiDeviceUdid(),InvocationTargetException");
            return null;
        } catch (Exception unused4) {
            LogUtil.d("DeviceManageCommonUtil", "getEmuiDeviceUdid(),others:");
            return null;
        }
    }

    private static String a() {
        try {
            Object objInvoke = Class.forName("com.huawei.android.os.BuildEx").getMethod("getHarmonyUDID", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
            return null;
        } catch (ClassNotFoundException unused) {
            LogUtil.d("DeviceManageCommonUtil", "getHarmonyUDID(),ClassNotFoundException");
            return null;
        } catch (NoSuchMethodException unused2) {
            LogUtil.d("DeviceManageCommonUtil", "getHarmonyUDID(),NoSuchMethodException");
            return null;
        } catch (InvocationTargetException unused3) {
            LogUtil.d("DeviceManageCommonUtil", "getHarmonyUDID(),InvocationTargetException");
            return null;
        } catch (Exception unused4) {
            LogUtil.d("DeviceManageCommonUtil", "getHarmonyUDID(),others:");
            return null;
        }
    }

    public static int a(String str) {
        return c(str, 16);
    }

    public static int c(String str, int i) {
        try {
            return Integer.parseInt(str, i);
        } catch (NumberFormatException unused) {
            LogUtil.d("DeviceManageCommonUtil", "parseIntByRadix occur NumberFormatException, input is ", str);
            return -1;
        }
    }

    public static long d(String str) {
        try {
            return Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            LogUtil.d("DeviceManageCommonUtil", "parseLongByRadix exception");
            return -1L;
        }
    }

    public static String e(String str) {
        String strB = b(str);
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        try {
            return new File(strB).getCanonicalPath();
        } catch (IOException e) {
            LogUtil.e("DeviceManageCommonUtil", "filterFilePath IOException: ", cpc.c(e));
            return null;
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (int i = 0; i < str.length(); i++) {
            if ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-=[];\\',./ ~!@#$%^&*()_+\"{}|:<>?".contains(String.valueOf(str.charAt(i)))) {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }

    public static boolean d(byte[] bArr, int i) {
        if (bArr == null || bArr.length == 0 || i >= bArr.length * 8) {
            return false;
        }
        if (i < 0) {
            LogUtil.e("DeviceManageCommonUtil", "isSupport target: ", Integer.valueOf(i));
            return false;
        }
        int i2 = bArr[i / 8];
        int i3 = 1 << (i % 8);
        return (i2 & i3) == i3;
    }

    public static int i(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("DeviceManageCommonUtil", "stringToInt str is empty");
            return 0;
        }
        try {
            if (str.indexOf(".") > 0) {
                str = str.substring(0, str.indexOf("."));
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            LogUtil.d("DeviceManageCommonUtil", "stringToInt occur NumberFormatException: ", cpc.c(e));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.io.Closeable, java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static byte[] c(String str) throws Throwable {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        IOException e;
        FileNotFoundException e2;
        ?? r9;
        ?? r2 = 0;
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    str = new FileInputStream(new File(cop.b(str)));
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = str.read(bArr);
                                if (i != -1) {
                                    byteArrayOutputStream.write(bArr, 0, i);
                                } else {
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    cpm.d(str);
                                    cpm.d(byteArrayOutputStream);
                                    return byteArray;
                                }
                            }
                        } catch (FileNotFoundException e3) {
                            e2 = e3;
                            LogUtil.d("DeviceManageCommonUtil", "file2byte FileNotFoundException file: ", cpc.c(e2));
                            r9 = str;
                            cpm.d(r9);
                            cpm.d(byteArrayOutputStream);
                            return null;
                        } catch (IOException e4) {
                            e = e4;
                            LogUtil.d("DeviceManageCommonUtil", "file2byte IOException file: ", cpc.c(e));
                            r9 = str;
                            cpm.d(r9);
                            cpm.d(byteArrayOutputStream);
                            return null;
                        } catch (Exception unused) {
                            LogUtil.d("DeviceManageCommonUtil", "file2byte occur Exception.");
                            r9 = str;
                            cpm.d(r9);
                            cpm.d(byteArrayOutputStream);
                            return null;
                        }
                    } catch (FileNotFoundException e5) {
                        e2 = e5;
                        byteArrayOutputStream = null;
                    } catch (IOException e6) {
                        e = e6;
                        byteArrayOutputStream = null;
                    } catch (Exception unused2) {
                        byteArrayOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        r2 = str;
                        cpm.d(r2);
                        cpm.d(0);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (FileNotFoundException e7) {
                e2 = e7;
                str = 0;
                byteArrayOutputStream = null;
            } catch (IOException e8) {
                e = e8;
                str = 0;
                byteArrayOutputStream = null;
            } catch (Exception unused3) {
                str = 0;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                cpm.d(r2);
                cpm.d(0);
                throw th;
            }
        }
        return null;
    }
}
