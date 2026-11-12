package defpackage;

import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;

/* JADX INFO: loaded from: classes10.dex */
public class izd {
    public static final String d = BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_invalid_data);

    public static String d(int i) {
        if (i == 0 || i >= 6000) {
            return d;
        }
        return izn.a(i);
    }

    public static String e(String str) {
        if (str == null || "".equals(str) || d.equals(str)) {
            return d;
        }
        try {
            return d(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return d;
        }
    }
}
