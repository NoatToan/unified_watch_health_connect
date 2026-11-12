package defpackage;

import android.text.TextUtils;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xhy {
    private static final Map<Integer, String> d = new HashMap(16) { // from class: xhy.2
        {
            put(8, "ecg_data_file");
            put(14, "sleep_state.bin");
            put(15, "sleep_data.bin");
            put(16, "rrisqi_data.bin");
            put(17, "_gps.bin");
            put(18, "_pdr.bin");
        }
    };

    public static void d(File file, int i) {
        if (file == null) {
            LogUtil.e("BluetoothFileLabelManager", "file is null.");
        } else if (e(file.getName(), i)) {
            try {
                xhw.b(file.getCanonicalPath(), "S2", 0);
            } catch (IOException unused) {
                LogUtil.d("BluetoothFileLabelManager", "setCommonFileFlag:getCanonicalPath IOException");
            }
        }
    }

    public static boolean e(String str, int i) {
        String str2 = d.get(Integer.valueOf(i));
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str.contains(str2);
    }
}
