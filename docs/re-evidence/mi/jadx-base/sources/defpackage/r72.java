package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: classes6.dex */
public class r72 {
    public static boolean a(InputStream inputStream, String str) {
        if (inputStream != null && !TextUtils.isEmpty(str)) {
            File parentFile = new File(str).getParentFile();
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                return false;
            }
            Logger.d("BaseFileUtil", "copyFile parent " + parentFile.exists());
            try {
                BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(inputStream));
                try {
                    BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(new File(str)));
                    try {
                        bufferedSinkBuffer.writeAll(bufferedSourceBuffer);
                        bufferedSinkBuffer.flush();
                        bufferedSinkBuffer.close();
                        if (bufferedSourceBuffer == null) {
                            return true;
                        }
                        bufferedSourceBuffer.close();
                        return true;
                    } catch (Throwable th) {
                        if (bufferedSinkBuffer != null) {
                            try {
                                bufferedSinkBuffer.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    if (bufferedSourceBuffer != null) {
                        try {
                            bufferedSourceBuffer.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (Exception e) {
                Logger.e("BaseFileUtil", "copyFile " + e.getMessage());
            }
        }
        return false;
    }

    public static boolean b(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("copyFiles() inPath:");
        sb.append(str);
        sb.append(", outPath:");
        sb.append(str2);
        try {
            String[] list = context.getAssets().list(str);
            if (list == null) {
                return false;
            }
            if (list.length > 0) {
                File file = new File(str2);
                if (file.isFile() && !file.delete()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("delete() FAIL:");
                    sb2.append(file.getAbsolutePath());
                }
                if (!file.exists() && !file.mkdirs()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("mkdirs() FAIL:");
                    sb3.append(file.getAbsolutePath());
                    return false;
                }
                for (String str3 : list) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str2);
                    String str4 = File.separator;
                    sb4.append(str4);
                    String string = sb4.toString();
                    b(context, (str.equals("") ? str : str + str4) + str3, string + str3);
                }
                return true;
            }
            try {
                File file2 = new File(str2);
                if (file2.exists() && !file2.delete()) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("delete() FAIL:");
                    sb5.append(file2.getAbsolutePath());
                }
                if (!file2.createNewFile()) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("createNewFile() FAIL:");
                    sb6.append(file2.getAbsolutePath());
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                InputStream inputStreamOpen = context.getAssets().open(str);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStreamOpen.read(bArr);
                    if (i <= 0) {
                        fileOutputStream.flush();
                        inputStreamOpen.close();
                        fileOutputStream.close();
                        return true;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static String c(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            file.delete();
            file.mkdirs();
        }
        return str;
    }

    public static String d() {
        return f("amap");
    }

    public static String e() {
        return c(AppUtil.getApp().getExternalFilesDir(null).getAbsolutePath() + File.separator + "MiWatch");
    }

    public static String f(String str) {
        File externalFilesDir = AppUtil.getApp().getExternalFilesDir(str);
        return externalFilesDir != null ? externalFilesDir.getAbsolutePath() : k(str);
    }

    public static String g(String str) {
        return c(h() + File.separator + str);
    }

    public static String h() {
        return c(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath() + File.separator + "MiWatch");
    }

    public static String i() {
        return c(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath() + File.separator + "MiWatch");
    }

    public static String j(String str) {
        return c(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + File.separator + str);
    }

    public static String k(String str) {
        return AppUtil.getApp().getFilesDir().getAbsolutePath() + File.separator + str;
    }

    public static String l() {
        return f("medical_data");
    }

    public static File m(String str) {
        return new File(new File(q()), str);
    }

    public static String n() {
        return g("share");
    }

    public static String o() {
        return f("ExportTrack");
    }

    public static String p() {
        return f("RouterRecord");
    }

    public static String q() {
        if (Build.VERSION.SDK_INT >= 29) {
            return c(e() + File.separator + "share");
        }
        return c(i() + File.separator + "share");
    }

    public static void r(String str, String str2) throws Throwable {
        s(str, str2, true);
    }

    public static void s(String str, String str2, boolean z) throws Throwable {
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(str, z));
                try {
                    bufferedWriter2.write(str2);
                    bufferedWriter2.flush();
                    bvc.a(bufferedWriter2);
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Logger.e("BaseFileUtil", "FileUtil FileNotFoundException exception!", e);
                    bvc.a(bufferedWriter);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    bvc.a(bufferedWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
