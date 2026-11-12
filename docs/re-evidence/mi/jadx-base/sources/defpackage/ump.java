package defpackage;

import com.xiaomi.fitness.common.utils.AppUtil;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public class ump {
    public static String a(String str) {
        File externalFilesDir = AppUtil.getApp().getExternalFilesDir(str);
        return externalFilesDir != null ? externalFilesDir.getAbsolutePath() : c(str);
    }

    public static String b() {
        return a("Track");
    }

    public static String c(String str) {
        return AppUtil.getApp().getFilesDir().getAbsolutePath() + File.separator + str;
    }
}
