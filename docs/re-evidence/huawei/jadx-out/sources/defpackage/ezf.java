package defpackage;

import com.huawei.health.servicesapi.R;

/* JADX INFO: loaded from: classes7.dex */
public class ezf {
    public static String a() {
        if (ipc.c()) {
            return qre.f(R.string.IDS_health_insights);
        }
        return qre.f(R.string.IDS_insights_title);
    }

    public static String c() {
        if (ipc.c()) {
            return qre.f(R.string.IDS_acumen_data_summary_two);
        }
        return qre.f(R.string.IDS_insights_data_summary_two);
    }

    public static String d() {
        if (ipc.c()) {
            return qre.f(R.string.IDS_acumen_no_data_tips);
        }
        return qre.f(R.string.IDS_insights_no_data_tips);
    }

    public static String e() {
        if (ipc.c()) {
            return qre.f(R.string.IDS_acumen_loading_data_tips);
        }
        return qre.f(R.string.IDS_insights_loading_data_tips);
    }
}
