package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.ExternalPhoneService;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes11.dex */
public class moy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile moy f42094a;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f42095c;

    private moy(Context context) {
        this.f42095c = context;
    }

    public static moy a() {
        moy moyVar;
        synchronized (e) {
            if (f42094a == null) {
                f42094a = new moy(BaseApplication.getContext());
            }
            moyVar = f42094a;
        }
        return moyVar;
    }

    public void d(String str) {
        int iV;
        LogUtil.a("HwAlarmClockManager", "handleAlarmClockMessage hex=", str);
        if (str == null || str.length() < 20) {
            LogUtil.j("HwAlarmClockManager", "handleAlarmClockMessage hex length is error");
            return;
        }
        String strSubstring = str.substring(8, 16);
        int i = -1;
        if (TextUtils.isEmpty(strSubstring)) {
            iV = -1;
        } else {
            LogUtil.a("HwAlarmClockManager", "handleAlarmClockMessage alarmIdHex=" + strSubstring);
            iV = CommonUtil.v(strSubstring);
            LogUtil.a("HwAlarmClockManager", "handleAlarmClockMessage alarmId=" + iV);
            if (iV == -1) {
                return;
            }
        }
        String strSubstring2 = str.substring(20, str.length());
        if (!TextUtils.isEmpty(strSubstring2)) {
            int iV2 = CommonUtil.v(strSubstring2);
            LogUtil.a("HwAlarmClockManager", "handleAlarmClockMessage alarmActionId=" + iV2);
            if (iV2 == -1) {
                return;
            } else {
                i = iV2;
            }
        }
        LogUtil.a("HwAlarmClockManager", "testAlarmClockReceive alarmActionId=" + i);
        Intent intent = new Intent();
        intent.setClass(this.f42095c, ExternalPhoneService.class);
        intent.setAction("alarm_clock_msg_from_device");
        intent.putExtra("notification_id", iV);
        intent.putExtra("action", i);
        try {
            this.f42095c.startService(intent);
        } catch (IllegalStateException | SecurityException unused) {
            LogUtil.e("HwAlarmClockManager", "handleAlarmClockMessage occur exception");
        }
    }
}
