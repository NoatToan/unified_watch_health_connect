package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class exk {
    public final Activity e;

    public exk(Activity activity) {
        this.e = activity;
    }

    public void b(File file) {
        if (file == null) {
            return;
        }
        if (!file.exists()) {
            LogUtil.w("H5PRO_MediaOperate", "deleteFile -> The file does not exist");
            return;
        }
        LogUtil.d("H5PRO_MediaOperate", "deleteFile -> " + file.getAbsolutePath());
        if (!file.isDirectory()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            file2.delete();
        }
    }

    public void d(int i, int i2, Intent intent) {
    }

    public void d(int i, String[] strArr, int[] iArr) {
    }

    public final File e(String str, String str2) {
        if (!GeneralUtil.isSafePath(str) || !GeneralUtil.isSafePath(str2)) {
            LogUtil.w("H5PRO_MediaOperate", "getMediaStorageDir: invalid appTag or subDir");
            return null;
        }
        Locale locale = Locale.ENGLISH;
        String str3 = File.separator;
        String str4 = "h5pro" + str3 + "media" + str3 + str + str3 + str2;
        File externalFilesDir = this.e.getExternalFilesDir(str4);
        if (externalFilesDir != null) {
            return externalFilesDir;
        }
        LogUtil.i("H5PRO_MediaOperate", "getMediaStorageDir: mediaStorageFile is null -> new");
        return new File(this.e.getFilesDir(), str4);
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b(new File(str));
    }
}
