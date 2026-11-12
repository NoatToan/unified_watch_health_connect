package defpackage;

import android.os.Environment;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes7.dex */
public class eho {
    public static void c(int i, String str) {
        File fileE;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            if (i == 1) {
                fileE = e("LogDeviceDotting");
            } else {
                fileE = i != 2 ? null : e("LogDeviceCrash");
            }
            e(str, fileE);
        }
    }

    private static File e(String str) {
        String str2;
        if (BaseApplication.f().getExternalFilesDir(null) != null) {
            str2 = BaseApplication.f().getExternalFilesDir(null) + File.separator + str + File.separator;
        } else {
            str2 = BaseApplication.f().getFilesDir() + File.separator + str + File.separator;
        }
        LogUtil.a("FileUtils", "dir path is : ", str2);
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(str2, "debugLog.txt");
    }

    public static void e(String str, File file) throws Throwable {
        OutputStreamWriter outputStreamWriter;
        OutputStreamWriter outputStreamWriter2 = null;
        try {
            try {
                outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
                try {
                    outputStreamWriter.write(str);
                    outputStreamWriter.flush();
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                } catch (IOException e) {
                    e = e;
                    outputStreamWriter2 = outputStreamWriter;
                    LogUtil.e("FileUtils", "writeJsonFile IOException ", e.getMessage());
                    IOUtils.closeQuietly((Writer) outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter = outputStreamWriter2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }
}
