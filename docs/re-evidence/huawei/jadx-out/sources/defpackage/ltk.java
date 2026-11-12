package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.IoUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes2.dex */
public class ltk {
    public static boolean e() {
        if (new File(b()).exists() && d(b())) {
            return true;
        }
        return new File(a()).exists() && d(a());
    }

    private static String b() {
        return "/system/bin/su";
    }

    private static String a() {
        return "/system/xbin/su";
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009e A[PHI: r9
      0x009e: PHI (r9v8 java.lang.Process) = (r9v7 java.lang.Process), (r9v12 java.lang.Process) binds: [B:42:0x009c, B:20:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    private static boolean d(String str) throws Throwable {
        Throwable th;
        Process processStart;
        Closeable closeable;
        InputStreamReader inputStreamReader;
        char c2;
        Closeable closeable2 = null;
        try {
            processStart = new ProcessBuilder("ls -l " + str).redirectErrorStream(true).start();
            try {
                InputStream inputStream = processStart.getInputStream();
                try {
                    inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                    try {
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        try {
                            char[] cArr = new char[10];
                            if (bufferedReader.read(cArr, 0, 5) < 4 || !((c2 = cArr[3]) == 's' || c2 == 'x')) {
                                IoUtils.c(inputStream);
                                IoUtils.c(inputStreamReader);
                                IoUtils.c(bufferedReader);
                                if (processStart != null) {
                                    processStart.destroy();
                                }
                                return false;
                            }
                            IoUtils.c(inputStream);
                            IoUtils.c(inputStreamReader);
                            IoUtils.c(bufferedReader);
                            if (processStart != null) {
                                processStart.destroy();
                            }
                            return true;
                        } catch (IOException unused) {
                            closeable2 = bufferedReader;
                            closeable = closeable2;
                            closeable2 = inputStream;
                            try {
                                LogUtil.e("RootUtil", "isExecutable IOException", false);
                                IoUtils.c(closeable2);
                                IoUtils.c(inputStreamReader);
                                IoUtils.c(closeable);
                                if (processStart != null) {
                                    processStart.destroy();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                IoUtils.c(closeable2);
                                IoUtils.c(inputStreamReader);
                                IoUtils.c(closeable);
                                if (processStart != null) {
                                    processStart.destroy();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            closeable2 = bufferedReader;
                            closeable = closeable2;
                            closeable2 = inputStream;
                            IoUtils.c(closeable2);
                            IoUtils.c(inputStreamReader);
                            IoUtils.c(closeable);
                            if (processStart != null) {
                                processStart.destroy();
                            }
                            throw th;
                        }
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (IOException unused3) {
                    inputStreamReader = null;
                } catch (Throwable th5) {
                    th = th5;
                    inputStreamReader = null;
                }
            } catch (IOException unused4) {
                closeable = null;
                inputStreamReader = null;
                LogUtil.e("RootUtil", "isExecutable IOException", false);
                IoUtils.c(closeable2);
                IoUtils.c(inputStreamReader);
                IoUtils.c(closeable);
                if (processStart != null) {
                    processStart.destroy();
                }
                return false;
            } catch (Throwable th6) {
                th = th6;
                closeable = null;
                inputStreamReader = null;
                IoUtils.c(closeable2);
                IoUtils.c(inputStreamReader);
                IoUtils.c(closeable);
                if (processStart != null) {
                    processStart.destroy();
                }
                throw th;
            }
        } catch (IOException unused5) {
            processStart = null;
        } catch (Throwable th7) {
            th = th7;
            processStart = null;
        }
    }
}
