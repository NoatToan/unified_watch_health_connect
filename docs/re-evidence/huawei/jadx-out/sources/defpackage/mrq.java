package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mrq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, String> f42291a = new HashMap(16) { // from class: mrq.1
        private static final long serialVersionUID = 2580757970674450558L;

        {
            put(8, "ecg_data_file");
            put(14, "sleep_state.bin");
            put(15, "sleep_data.bin");
            put(16, "rrisqi_data.bin");
            put(17, "_gps.bin");
            put(18, "_pdr.bin");
        }
    };

    public static void b(File file, int i) {
        if (file == null) {
            LogUtil.j("BluetoothFileLabelManager", "file is null.");
        } else if (d(file.getName(), i)) {
            xji.a(file.getPath(), "S2", 0);
        }
    }

    public static boolean d(String str, int i) {
        String str2 = f42291a.get(Integer.valueOf(i));
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str.contains(str2);
    }
}
