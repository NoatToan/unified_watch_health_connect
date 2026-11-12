package defpackage;

import com.xiaomi.verificationsdk.internal.UnknownValueException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class vu3 {
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static String a(String str) throws Throwable {
        Process processExec;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream2;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            processExec = Runtime.getRuntime().exec("sh");
            try {
                bufferedOutputStream = new BufferedOutputStream(processExec.getOutputStream());
                try {
                    bufferedInputStream2 = new BufferedInputStream(processExec.getInputStream());
                    try {
                        bufferedOutputStream.write(str.getBytes());
                        bufferedOutputStream.write(10);
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        processExec.waitFor();
                        String strB = b(bufferedInputStream2);
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        processExec.destroy();
                        return strB;
                    } catch (Exception unused) {
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (bufferedInputStream2 != 0) {
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream2 = bufferedOutputStream;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedOutputStream2 != null) {
                            try {
                                bufferedOutputStream2.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (bufferedInputStream != 0) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        if (processExec == null) {
                            throw th;
                        }
                        processExec.destroy();
                        throw th;
                    }
                } catch (Exception unused2) {
                    bufferedInputStream2 = 0;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream2 = 0;
                }
            } catch (Exception unused3) {
                bufferedOutputStream = null;
                bufferedInputStream2 = bufferedOutputStream;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (bufferedInputStream2 != 0) {
                    bufferedInputStream2.close();
                }
                if (processExec != null) {
                    processExec.destroy();
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = 0;
            }
        } catch (Exception unused4) {
            processExec = null;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            processExec = null;
            bufferedInputStream = 0;
        }
    }

    public static String b(BufferedInputStream bufferedInputStream) {
        int i;
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[512];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    sb.append(new String(bArr, 0, i));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (i >= 512);
        return sb.toString();
    }

    public static String c() throws Throwable {
        String strA = a("cat /proc/self/cgroup");
        if (strA != null && strA.length() != 0) {
            int iLastIndexOf = strA.lastIndexOf("uid");
            int iLastIndexOf2 = strA.lastIndexOf("/pid");
            if (iLastIndexOf < 0) {
                return null;
            }
            if (iLastIndexOf2 <= 0) {
                iLastIndexOf2 = strA.length();
            }
            try {
                String strReplaceAll = strA.substring(iLastIndexOf + 4, iLastIndexOf2).replaceAll("\n", "");
                if (d(strReplaceAll)) {
                    return String.format("u0_a%d", Integer.valueOf(Integer.valueOf(strReplaceAll).intValue() - 10000));
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static boolean d(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean e() throws Throwable {
        String[] strArrSplit;
        String strC = c();
        if (strC == null) {
            throw new UnknownValueException("getUidStrFormat is null");
        }
        String strA = a("ps");
        if (strA == null || strA.isEmpty() || (strArrSplit = strA.split("\n")) == null || strArrSplit.length <= 0) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            if (strArrSplit[i2].contains(strC)) {
                int iLastIndexOf = strArrSplit[i2].lastIndexOf(" ");
                String str = strArrSplit[i2];
                if (new File(String.format("/data/data/%s", str.substring(iLastIndexOf <= 0 ? 0 : iLastIndexOf + 1, str.length()), Locale.CHINA)).exists()) {
                    i++;
                }
            }
        }
        return i > 1;
    }
}
