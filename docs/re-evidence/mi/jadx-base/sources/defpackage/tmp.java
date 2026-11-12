package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.FileUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class tmp {
    public static void a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        FileUtils.INSTANCE.deleteFile(new File(b(context) + File.separator + str));
    }

    public static String b(Context context) {
        String str = FileUtils.getFilesPath(context) + File.separator + "sport";
        FileUtils.createFolder(str);
        return str;
    }

    public static List<xnp> c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ynp ynpVar = new ynp();
        File file = new File(b(context) + File.separator + str);
        if (!file.exists()) {
            FitnessLogUtils.w("TrackFileProcessor", file.getAbsolutePath() + " is not exists");
            return Collections.emptyList();
        }
        try {
            return ynpVar.a(new BufferedInputStream(new FileInputStream(file)));
        } catch (Exception e) {
            FitnessLogUtils.e("TrackFileProcessor", "readTrackFile error " + e);
            return Collections.emptyList();
        }
    }
}
