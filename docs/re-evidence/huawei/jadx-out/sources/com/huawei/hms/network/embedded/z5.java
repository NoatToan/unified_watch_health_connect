package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes34.dex */
public class z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15653a = "PingNet";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15654b = "\n";

    /* JADX WARN: Code duplicated, block: B:51:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed A[PHI: r3 r4 r9 r11 r12
      0x00ed: PHI (r3v3 com.huawei.hms.network.embedded.a6) = (r3v1 com.huawei.hms.network.embedded.a6), (r3v4 com.huawei.hms.network.embedded.a6) binds: [B:51:0x00c9, B:56:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r4v6 java.io.InputStreamReader) = (r4v4 java.io.InputStreamReader), (r4v7 java.io.InputStreamReader) binds: [B:51:0x00c9, B:56:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r9v13 ??) = (r9v16 ??), (r9v17 ??) binds: [B:51:0x00c9, B:56:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r11v5 java.io.BufferedReader) = (r11v3 java.io.BufferedReader), (r11v6 java.io.BufferedReader) binds: [B:51:0x00c9, B:56:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r12v10 ??) = (r12v16 ??), (r12v17 ??) binds: [B:51:0x00c9, B:56:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.ProcessBuilder] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public a6 a(String str, int i, int i2, StringBuffer stringBuffer) throws Throwable {
        Throwable th;
        InterruptedException e;
        IOException e2;
        InputStreamReader inputStreamReader;
        ?? r12;
        ?? r13;
        ?? r9;
        a6 a6Var = new a6(str, i, i2, stringBuffer);
        ?? processBuilder = new ProcessBuilder(a(a6Var));
        processBuilder.redirectErrorStream(true);
        BufferedReader bufferedReader = null;
        try {
            try {
                processBuilder = processBuilder.start();
                try {
                    stringBuffer = processBuilder.getInputStream();
                    try {
                        inputStreamReader = new InputStreamReader((InputStream) stringBuffer, Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                            while (true) {
                                try {
                                    String line = bufferedReader2.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    a(a6Var.g(), line);
                                    a6Var = a(line, a6Var);
                                } catch (IOException e3) {
                                    e2 = e3;
                                    bufferedReader = bufferedReader2;
                                    Logger.w(f15653a, "the ping has ioException:" + e2.getClass().getSimpleName());
                                    r9 = processBuilder;
                                    r13 = stringBuffer;
                                    r12 = stringBuffer;
                                    if (processBuilder != 0) {
                                        r9.destroy();
                                        r12 = r13;
                                    }
                                    IoUtils.closeSecure((InputStream) r12);
                                    IoUtils.closeSecure((Reader) inputStreamReader);
                                    IoUtils.closeSecure((Reader) bufferedReader);
                                    return a6Var;
                                } catch (InterruptedException e4) {
                                    e = e4;
                                    bufferedReader = bufferedReader2;
                                    Logger.w(f15653a, "the ping has interruptedException:" + e.getClass().getSimpleName());
                                    r12 = stringBuffer;
                                    if (processBuilder != 0) {
                                        r9 = processBuilder;
                                        r13 = stringBuffer;
                                        r9.destroy();
                                        r12 = r13;
                                    }
                                    IoUtils.closeSecure((InputStream) r12);
                                    IoUtils.closeSecure((Reader) inputStreamReader);
                                    IoUtils.closeSecure((Reader) bufferedReader);
                                    return a6Var;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader = bufferedReader2;
                                    if (processBuilder != 0) {
                                        processBuilder.destroy();
                                    }
                                    IoUtils.closeSecure((InputStream) stringBuffer);
                                    IoUtils.closeSecure((Reader) inputStreamReader);
                                    IoUtils.closeSecure((Reader) bufferedReader);
                                    throw th;
                                }
                            }
                            if (processBuilder.waitFor() == 0) {
                                Logger.v(f15653a, "exec cmd success.");
                                a(a6Var.g(), "exec cmd success.");
                                a6Var.a(true);
                            } else {
                                Logger.v(f15653a, "exec cmd fail.");
                                a(a6Var.g(), "exec cmd fail.");
                                a6Var.d(null);
                                a6Var.a(false);
                            }
                            a(a6Var.g(), "exec finished.");
                            if (processBuilder != 0) {
                                processBuilder.destroy();
                            }
                            IoUtils.closeSecure((InputStream) stringBuffer);
                            IoUtils.closeSecure((Reader) inputStreamReader);
                            IoUtils.closeSecure((Reader) bufferedReader2);
                            return a6Var;
                        } catch (IOException e5) {
                            e2 = e5;
                        } catch (InterruptedException e6) {
                            e = e6;
                        }
                    } catch (IOException e7) {
                        e2 = e7;
                        inputStreamReader = null;
                        Logger.w(f15653a, "the ping has ioException:" + e2.getClass().getSimpleName());
                        r9 = processBuilder;
                        r13 = stringBuffer;
                        r12 = stringBuffer;
                        if (processBuilder != 0) {
                            r9.destroy();
                            r12 = r13;
                        }
                        IoUtils.closeSecure((InputStream) r12);
                        IoUtils.closeSecure((Reader) inputStreamReader);
                        IoUtils.closeSecure((Reader) bufferedReader);
                        return a6Var;
                    } catch (InterruptedException e8) {
                        e = e8;
                        inputStreamReader = null;
                        Logger.w(f15653a, "the ping has interruptedException:" + e.getClass().getSimpleName());
                        r12 = stringBuffer;
                        if (processBuilder != 0) {
                            r9 = processBuilder;
                            r13 = stringBuffer;
                            r9.destroy();
                            r12 = r13;
                        }
                        IoUtils.closeSecure((InputStream) r12);
                        IoUtils.closeSecure((Reader) inputStreamReader);
                        IoUtils.closeSecure((Reader) bufferedReader);
                        return a6Var;
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamReader = null;
                        if (processBuilder != 0) {
                            processBuilder.destroy();
                        }
                        IoUtils.closeSecure((InputStream) stringBuffer);
                        IoUtils.closeSecure((Reader) inputStreamReader);
                        IoUtils.closeSecure((Reader) bufferedReader);
                        throw th;
                    }
                } catch (IOException e9) {
                    e2 = e9;
                    stringBuffer = 0;
                } catch (InterruptedException e10) {
                    e = e10;
                    stringBuffer = 0;
                } catch (Throwable th4) {
                    th = th4;
                    stringBuffer = 0;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (IOException e11) {
            e2 = e11;
            processBuilder = 0;
            stringBuffer = 0;
        } catch (InterruptedException e12) {
            e = e12;
            processBuilder = 0;
            stringBuffer = 0;
        } catch (Throwable th6) {
            th = th6;
            processBuilder = 0;
            stringBuffer = 0;
        }
    }

    public static String[] a(a6 a6Var) {
        int iD = a6Var.d();
        int iF = a6Var.f();
        return new String[]{r3.r, "-c", String.valueOf(iD), "-w", String.valueOf(iF), a6Var.b()};
    }

    public static void a(StringBuffer stringBuffer, String str) {
        if (stringBuffer != null) {
            stringBuffer.append(str).append("\n");
        }
    }

    public static String a(String str) {
        String strSubstring = null;
        for (String str2 : str.split("\n")) {
            if (str2.contains("time=")) {
                strSubstring = str2.substring(str2.indexOf("time=") + 5);
                Logger.v(f15653a, "the ping time is : " + strSubstring);
            }
        }
        return strSubstring;
    }

    public static a6 a(String str, a6 a6Var) {
        String strA = a(str);
        if (strA != null) {
            a6Var.d(strA);
            Logger.v(f15653a, "ping time:" + strA);
        }
        if (str.contains("avg")) {
            int iIndexOf = str.indexOf("/", 20);
            int iIndexOf2 = str.indexOf(".", iIndexOf);
            StringBuilder sb = new StringBuilder("ping avg time:");
            int i = iIndexOf + 1;
            sb.append(str.substring(i, iIndexOf2));
            sb.append("ms");
            Logger.v(f15653a, sb.toString());
            a6Var.a(str.substring(i, iIndexOf2) + "ms");
        }
        if (str.contains("packet loss")) {
            int iIndexOf3 = str.indexOf("%");
            StringBuilder sb2 = new StringBuilder("packet loss rate:");
            int i2 = iIndexOf3 - 2;
            sb2.append(str.substring(i2, iIndexOf3));
            Logger.v(f15653a, sb2.toString());
            a6Var.c(str.substring(i2, iIndexOf3));
        }
        return a6Var;
    }
}
