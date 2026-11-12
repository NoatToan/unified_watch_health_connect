package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.IoUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes19.dex */
public class wpk {
    public static int a(String str, String str2) {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20014), str, str2, null);
    }

    public static String e(String str) {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20014), str);
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        File file = new File(str);
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return file.length() <= 0;
        }
        File[] fileArrListFiles = file.listFiles();
        return fileArrListFiles == null || fileArrListFiles.length <= 0;
    }

    public static String b(String str) throws Throwable {
        Throwable th;
        InputStreamReader inputStreamReader;
        IOException e;
        FileInputStream fileInputStream;
        Throwable th2;
        String string = "";
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Util", "readJson path is empty");
            return "";
        }
        FileInputStream fileInputStream2 = null;
        inputStreamReader = null;
        FileInputStream fileInputStream3 = null;
        InputStreamReader inputStreamReader2 = null;
        try {
            File file = new File(str);
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                    try {
                        StringBuilder sb = new StringBuilder(16);
                        while (true) {
                            int i = inputStreamReader.read();
                            if (i == -1) {
                                break;
                            }
                            sb.append((char) i);
                        }
                        string = sb.toString();
                        fileInputStream3 = fileInputStream;
                    } catch (IOException e2) {
                        e = e2;
                        inputStreamReader2 = inputStreamReader;
                        try {
                            LogUtil.e("Util", "readJson ioException is ", LogAnonymous.b(e));
                            IoUtils.c(fileInputStream);
                            IoUtils.c(inputStreamReader2);
                            return "";
                        } catch (Throwable th3) {
                            inputStreamReader = inputStreamReader2;
                            th2 = th3;
                            th = th2;
                            fileInputStream2 = fileInputStream;
                            IoUtils.c(fileInputStream2);
                            IoUtils.c(inputStreamReader);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        IoUtils.c(fileInputStream2);
                        IoUtils.c(inputStreamReader);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                } catch (Throwable th5) {
                    th = th5;
                    inputStreamReader = null;
                    fileInputStream2 = fileInputStream;
                    IoUtils.c(fileInputStream2);
                    IoUtils.c(inputStreamReader);
                    throw th;
                }
            } else {
                inputStreamReader = null;
            }
            IoUtils.c(fileInputStream3);
            IoUtils.c(inputStreamReader);
            return string;
        } catch (IOException e4) {
            e = e4;
            fileInputStream = null;
        } catch (Throwable th6) {
            th = th6;
            inputStreamReader = null;
            IoUtils.c(fileInputStream2);
            IoUtils.c(inputStreamReader);
            throw th;
        }
    }
}
