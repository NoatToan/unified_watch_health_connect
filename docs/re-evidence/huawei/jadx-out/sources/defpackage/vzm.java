package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.main.R;

/* JADX INFO: loaded from: classes19.dex */
public class vzm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f51747b = BaseApplication.getAppPackage();

    public static class a {
        public static String d(int i) {
            Context context = BaseApplication.getContext();
            if (i == 2) {
                return context.getString(R.string.IDS_privacy_measure_with_wrong_posture);
            }
            if (i == 3) {
                return context.getString(R.string.IDS_privacy_measure_no_remain_stationary);
            }
            if (i == 4) {
                return context.getString(R.string.IDS_privacy_measure_after_exercise);
            }
            if (i == 5) {
                return context.getString(R.string.IDS_privacy_measure_wear_wrongly);
            }
            switch (i) {
                case 9:
                    return context.getString(R.string.IDS_privacy_measure_abnomal_heart_rate);
                case 10:
                case 11:
                    return context.getString(R.string.IDS_privacy_measure_wear_loose);
                default:
                    return "";
            }
        }
    }
}
