package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.yrn.view.ui.YRNFragment;

/* JADX INFO: loaded from: classes2.dex */
public class hyr {
    public static Fragment a(String str, String str2, Bundle bundle) {
        YRNFragment yRNFragment = new YRNFragment();
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("appName", str);
        bundle.putString(RnReportConst.ApiReport.PARAM_MODULE, str2);
        yRNFragment.setArguments(bundle);
        return yRNFragment;
    }
}
