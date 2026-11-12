package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class ucx {
    public static void c(final CommonUiBaseResponse commonUiBaseResponse) {
        long j;
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(PrebakedEffectId.RT_COIN_DROP), "core_sleep_user_rate_data_update_time");
        if (!TextUtils.isEmpty(strE)) {
            try {
                j = Long.parseLong(strE);
            } catch (NumberFormatException unused) {
                LogUtil.j("SleepUserRateRequestUtil", "NumberFormatException");
                j = 0;
            }
            if (System.currentTimeMillis() - j < 604800000) {
                LogUtil.a("SleepUserRateRequestUtil", "time less than WEEK_IN_MILLIS");
                e(commonUiBaseResponse);
                return;
            }
        }
        if (!oco.d(BaseApplication.getContext())) {
            LogUtil.j("SleepUserRateRequestUtil", "no network, please check");
            e(commonUiBaseResponse);
        } else {
            d(new HttpResCallback() { // from class: uda
                @Override // com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback
                public final void onFinished(int i, String str) {
                    ucx.e(commonUiBaseResponse, i, str);
                }
            }, commonUiBaseResponse);
        }
    }

    static /* synthetic */ void e(CommonUiBaseResponse commonUiBaseResponse, int i, String str) {
        if (i != 200 || TextUtils.isEmpty(str)) {
            LogUtil.j("SleepUserRateRequestUtil", "requestUserRateCloudData resCode = ", Integer.valueOf(i), " or result is empty");
            e(commonUiBaseResponse);
        } else {
            b(str, commonUiBaseResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(CommonUiBaseResponse commonUiBaseResponse) {
        b(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(PrebakedEffectId.RT_COIN_DROP), "core_sleep_user_rate_data"), commonUiBaseResponse);
    }

    private static void d(final HttpResCallback httpResCallback, final CommonUiBaseResponse commonUiBaseResponse) {
        final HashMap<String, String> mapC = trd.c();
        final HashMap<String, String> mapD = trd.d();
        GRSManager.c(BaseApplication.getContext()).d("achievementUrl", new GrsQueryCallback() { // from class: ucx.5
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                if (TextUtils.isEmpty(str)) {
                    LogUtil.j("SleepUserRateRequestUtil", "requestUserRateCloudData grs get url is null");
                    ucx.e(commonUiBaseResponse);
                    return;
                }
                ltg.c(str + "/achievement/getSleepScoreRank" + CommonUtil.getUrlSuffix(), mapC, mapD, httpResCallback);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("SleepUserRateRequestUtil", "requestUserRateCloudData grs get url errorCode ", Integer.valueOf(i));
                ucx.e(commonUiBaseResponse);
            }
        });
    }

    private static void b(String str, CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.d("SleepUserRateRequestUtil", "parseUserRateData result = ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SleepUserRateRequestUtil", "parseUserRateData result is empty");
            if (commonUiBaseResponse != null) {
                commonUiBaseResponse.onResponse(-1, null);
                return;
            }
            return;
        }
        a(str, commonUiBaseResponse);
        d(str);
    }

    private static void a(String str, CommonUiBaseResponse commonUiBaseResponse) {
        ubq ubqVar = (ubq) HiJsonUtil.d(str, ubq.class);
        if (commonUiBaseResponse != null) {
            commonUiBaseResponse.onResponse(0, ubqVar);
        }
    }

    private static void d(String str) {
        Context context = BaseApplication.getContext();
        String string = Integer.toString(PrebakedEffectId.RT_COIN_DROP);
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferenceManager.e(context, string, "core_sleep_user_rate_data_update_time", String.valueOf(jCurrentTimeMillis), new StorageParams());
        if (str == null || !str.equals(a())) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_COIN_DROP), "core_sleep_user_rate_data", str, new StorageParams());
        }
    }

    private static String a() {
        return SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_COIN_DROP), "core_sleep_user_rate_data");
    }
}
