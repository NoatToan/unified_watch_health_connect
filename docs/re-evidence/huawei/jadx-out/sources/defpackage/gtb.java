package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes30.dex */
public class gtb {
    public static void b(String str) {
        c cVar = (c) GsonUtil.parseJson(str, c.class);
        LogUtil.a("SleepPushUtils", "intelSleepPush msgContext: ", cVar);
        if (cVar == null) {
            LogUtil.j("SleepPushUtils", "msgContext is null.");
            return;
        }
        int i = cVar.f36015a;
        if (i == 601) {
            a();
        } else {
            LogUtil.j("SleepPushUtils", "parsesContext detailType undefined: ", Integer.valueOf(i));
        }
    }

    private static void a() {
        ReleaseLogUtil.d("SleepPushUtils", "detailType is MONTHLY_SEND_MSG");
        new txv().e();
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "BUBBLE_ON_WEBVIEW_FOR_MONTH_DATA", Boolean.toString(true), null);
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName(HealthZonePushReceiver.DETAIL_TYPE)
        public int f36015a;

        private c() {
        }
    }
}
