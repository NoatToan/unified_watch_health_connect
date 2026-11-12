package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class ifq {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.BufferedReader] */
    public static Map<Integer, hma> c(File file) throws Throwable {
        ?? bufferedReader;
        String str = "parseSrt() finally IOException";
        if (file == null || !file.exists()) {
            LogUtil.j("Suggestion_SrtParserUtils", "parseSrt() srtFile is null or no exists");
            return new HashMap();
        }
        HashMap map = new HashMap(16);
        ?? r3 = 0;
        ?? r4 = 0;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
                try {
                    StringBuilder sb = new StringBuilder();
                    int i = 0;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            String[] strArrC = c(line, sb);
                            if (strArrC.length != 0) {
                                map.put(Integer.valueOf(i), a(strArrC));
                                i++;
                                sb.delete(0, sb.length());
                            }
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                                LogUtil.e("Suggestion_SrtParserUtils", "parseSrt() finally IOException");
                                r3 = i;
                            }
                        }
                    }
                    bufferedReader.close();
                    r3 = i;
                } catch (IOException unused2) {
                    r4 = bufferedReader;
                    LogUtil.e("Suggestion_SrtParserUtils", "parseSrt() IOException");
                    r3 = r4;
                    if (r4 != 0) {
                        try {
                            r4.close();
                            r3 = r4;
                        } catch (IOException unused3) {
                            LogUtil.e("Suggestion_SrtParserUtils", "parseSrt() finally IOException");
                            r3 = r4;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (bufferedReader != 0) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused4) {
                            LogUtil.e("Suggestion_SrtParserUtils", str);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = r3;
            }
        } catch (IOException unused5) {
        }
        str = "parseSrt() srtMap size:";
        LogUtil.a("Suggestion_SrtParserUtils", "parseSrt() srtMap size:", Integer.valueOf(map.size()));
        return map;
    }

    private static String[] c(String str, StringBuilder sb) {
        if (!TextUtils.isEmpty(str) && str.length() <= 1000) {
            sb.append(str);
            sb.append("@");
            return new String[0];
        }
        String[] strArrSplit = sb.toString().split("@");
        if (TextUtils.isEmpty(str) && strArrSplit.length == 2) {
            sb.append(" ");
            sb.append("@");
            return new String[0];
        }
        if (strArrSplit.length >= 3) {
            return strArrSplit;
        }
        sb.delete(0, sb.length());
        return new String[0];
    }

    private static hma a(String[] strArr) {
        hma hmaVar = new hma();
        String str = strArr[1];
        int iD = d(str);
        int iC = c(str);
        String strD = d(strArr);
        hmaVar.b(iD);
        hmaVar.a(iC);
        hmaVar.c(strD);
        return hmaVar;
    }

    private static int d(String str) {
        return (((b(str, 0, 2) * 3600) + (b(str, 3, 5) * 60) + b(str, 6, 8)) * 1000) + b(str, 9, 12);
    }

    private static int c(String str) {
        return (((b(str, 17, 19) * 3600) + (b(str, 20, 22) * 60) + b(str, 23, 25)) * 1000) + b(str, 26, 29);
    }

    private static int b(String str, int i, int i2) {
        if (str == null) {
            ReleaseLogUtil.e("Suggestion_SrtParserUtils", "getFormatTime null startIndex:", Integer.valueOf(i), " endIndex:", Integer.valueOf(i2));
            return 0;
        }
        if (i < 0 || i2 > str.length()) {
            ReleaseLogUtil.e("Suggestion_SrtParserUtils", "getFormatTime totalTimeStr:", str, " startIndex:", Integer.valueOf(i), " endIndex:", Integer.valueOf(i2));
            return 0;
        }
        return CommonUtil.j(str.substring(i, i2));
    }

    private static String d(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < strArr.length; i++) {
            sb.append(strArr[i]);
            sb.append(System.lineSeparator());
            if (i > 5) {
                LogUtil.j("Suggestion_SrtParserUtils", "parseSrtBody() same time max line beyond limit");
                break;
            }
        }
        String string = sb.toString();
        return string.substring(0, string.length() - 1);
    }
}
