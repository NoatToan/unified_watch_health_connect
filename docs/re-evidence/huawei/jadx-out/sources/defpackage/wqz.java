package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.ActivityHtmlPathApi;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class wqz {
    public static void d(Context context) {
        if (context == null) {
            LogUtil.j("UIME_PersonalCenterFragment", "goToActivity context is null.");
            return;
        }
        String strValue = AnalyticsValue.HEALTH_ACTIVITY_WEBVIEW_MY_ACTIVITY_1100035.value();
        HashMap map = new HashMap(10);
        map.put("click", 1);
        map.put("from", 2);
        lmf.d().c(context, strValue, map, 0);
        c("domainContentcenterDbankcdnNew", ((ActivityHtmlPathApi) Services.b("PluginOperation", ActivityHtmlPathApi.class)).getActivityHtmlPath() + "myActivity.html?pullfrom=myActivity", context);
    }

    /* JADX INFO: renamed from: wqz$1, reason: invalid class name */
    class AnonymousClass1 implements GrsQueryCallback {
        final /* synthetic */ String d;
        final /* synthetic */ Context e;

        @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
        public void onCallBackFail(int i) {
        }

        AnonymousClass1(String str, Context context) {
            this.d = str;
            this.e = context;
        }

        @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
        public void onCallBackSuccess(String str) {
            LogUtil.a("UIME_PersonalCenterFragment", "GRSManager onCallBackSuccess ACTIVITY_KEY url = ", str, ", urlStr = ", this.d);
            String str2 = str + this.d;
            final Intent intent = new Intent(this.e, (Class<?>) WebViewActivity.class);
            intent.putExtra("url", str2);
            intent.putExtra("EXTRA_BI_SOURCE", "ACT");
            intent.putExtra("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
            final Context context = this.e;
            HandlerExecutor.b(new Runnable() { // from class: wra
                @Override // java.lang.Runnable
                public final void run() {
                    context.startActivity(intent);
                }
            });
        }
    }

    private static void c(String str, String str2, Context context) {
        GRSManager.c(context).d(str, new AnonymousClass1(str2, context));
    }

    public static void d(int i, String str, String str2) {
        LogUtil.a("UIME_PersonalCenterFragment", "get message MSG_GET_DEVICE_LOG, bugTypeId = " + i + ", dtsNumber = " + str + ", fileLogId = " + str2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "Crowd_test_last_time");
        try {
            long j = TextUtils.isEmpty(strE) ? 0L : Long.parseLong(strE);
            LogUtil.a("UIME_PersonalCenterFragment", "WearHomeActivity curTime = ", Long.valueOf(jCurrentTimeMillis), ", lastTime = ", Long.valueOf(j));
            if (jCurrentTimeMillis - j < 300000) {
                return;
            }
        } catch (NumberFormatException e) {
            LogUtil.e("UIME_PersonalCenterFragment", "WearHomeActivity... e = ", e.getMessage());
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "Crowd_test_last_time", String.valueOf(jCurrentTimeMillis), new StorageParams(0));
        lws lwsVarC = lws.c(BaseApplication.getContext());
        lwsVarC.b(i, str, str2);
        lwsVarC.c(0, new DeviceDfxBaseResponseCallback() { // from class: wqz.2
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
            public void onProgress(int i2, String str3) {
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
            public void onSuccess(int i2, String str3) {
                LogUtil.a("UIME_PersonalCenterFragment", "onSuccess sucCode = ", Integer.valueOf(i2));
                mfz.d(4, true);
                lws.c(BaseApplication.getContext()).c(false, str3);
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
            public void onFailure(int i2, String str3) {
                ReleaseLogUtil.a("UIME_PersonalCenterFragment", "onFailure errCode = ", Integer.valueOf(i2), ", errMsg = ", str3);
                String strF = mjh.f(str3);
                mfz.d(4, true);
                lws.c(BaseApplication.getContext()).c(false, strF);
            }
        });
    }
}
