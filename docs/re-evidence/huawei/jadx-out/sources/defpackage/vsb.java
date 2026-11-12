package defpackage;

import android.content.Context;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import health.compact.a.utils.StringUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class vsb {
    public static void d(Map<String, Object> map, String str) {
        map.put("funnum", a(str));
        LogUtil.a("KeepAliveService", "sendData:" + HiJsonUtil.d(map));
        lmf.d().c(BaseApplication.getContext(), "2040162", map, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    private static String a(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "ignore":
                b2 = 0;
                break;
            case "auto":
                b2 = 1;
                break;
            case "lock":
                b2 = 2;
                break;
            case "allow":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return "SF-10044479_f492";
        }
        if (b2 == 1) {
            return "SF-10044479_f487";
        }
        if (b2 == 2) {
            return "SF-10044479_f483";
        }
        if (b2 == 3) {
            return "SF-10044479_f482";
        }
        return "SF-10044479_f486";
    }

    public static void d(Context context) {
        nzz.i(context);
    }

    public static void a(Context context) {
        nzz.e(context);
    }

    public static void c(Context context) {
        nzz.b(context);
    }

    public static void e(Context context) {
        nzz.d(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    public static String d(String str, boolean z) {
        byte b2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (StringUtils.g(str)) {
            LogUtil.e("KeepAliveService", "type is empty");
            return "";
        }
        str.hashCode();
        switch (str) {
            case "ignore":
                b2 = 0;
                break;
            case "relate":
                b2 = 1;
                break;
            case "auto":
                b2 = 2;
                break;
            case "lock":
                b2 = 3;
                break;
            case "step":
                b2 = 4;
                break;
            case "allow":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            if (z) {
                i = R.string.IDS_keepalive_title_Ignore_battery_optimization;
            } else {
                i = R.string.IDS_keepalive_subtitle_Ignore_battery_optimization;
            }
            return qre.f(i);
        }
        if (b2 == 1) {
            if (z) {
                i2 = R.string.IDS_keepalive_title_app_secondary_launch;
            } else {
                i2 = R.string.IDS_keepalive_subtitle_app_secondary_launch;
            }
            return qre.f(i2);
        }
        if (b2 == 2) {
            if (z) {
                i3 = R.string.IDS_keepalive_title_App_auto_launch;
            } else {
                i3 = R.string.IDS_keepalive_subtitle_App_auto_launch;
            }
            return qre.f(i3);
        }
        if (b2 == 3) {
            if (z) {
                i4 = R.string.IDS_keepalive_title_lock_background_task;
            } else {
                i4 = R.string.IDS_keepalive_subtitle_lock_background_task;
            }
            return qre.f(i4);
        }
        if (b2 == 4) {
            if (z) {
                i5 = R.string.IDS_keepalive_enable_step_notification;
            } else {
                i5 = R.string.IDS_keepalive_improve_accuracy;
            }
            return qre.f(i5);
        }
        if (b2 == 5) {
            if (z) {
                i6 = R.string.IDS_keepalive_title_allow_background_activity;
            } else {
                i6 = R.string.IDS_keepalive_subtitle_allow_background_activity;
            }
            return qre.f(i6);
        }
        LogUtil.e("KeepAliveService", "getTitleOrSubtitleByType Invalid type:" + str);
        return "";
    }
}
