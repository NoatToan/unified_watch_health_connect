package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.hwsmartinteractmgr.data.msgcontent.NotificationMsgContent;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.ActivityHtmlPathApi;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.main.R;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class wng {
    public static void a(int i, Context context, String str) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(SmartMsgConstant.MSG_CONTENT_MESSAGE_CENTER_DETAIL_URL);
                String string2 = jSONObject.getString("content");
                LogUtil.a("SMART_SmartMsgSkipActivity", "skipToInformationDetail :", string2);
                Intent intent = new Intent();
                intent.setClass(context, WebViewActivity.class);
                intent.putExtra("url", string);
                intent.putExtra("type", "RecommendInfo");
                intent.putExtra("title", context.getResources().getString(R.string.IDS_social_information));
                intent.putExtra("EXTRA_BI_NAME", string2);
                intent.putExtra("EXTRA_BI_ID", jSONObject.getString("msgId"));
                intent.putExtra("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
                if (i == 1) {
                    intent.setFlags(1879048192);
                }
                if (i == 2) {
                    intent.putExtra("EXTRA_BI_SOURCE", "OPERPOSITION");
                } else {
                    intent.putExtra("EXTRA_BI_SOURCE", "SMARTCARD");
                }
                context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                LogUtil.e("SMART_SmartMsgSkipActivity", "ActivityNotFoundException e = ", e.getMessage());
            } catch (JSONException e2) {
                LogUtil.e("SMART_SmartMsgSkipActivity", "JSONException e = ", e2.getMessage());
            }
        }
    }

    public static void b(int i, Context context, String str) {
        NotificationMsgContent notificationMsgContent = (NotificationMsgContent) HiJsonUtil.d(str, NotificationMsgContent.class);
        String notificationId = notificationMsgContent.getNotificationId();
        String url = notificationMsgContent.getUrl();
        String type = notificationMsgContent.getType();
        LogUtil.a("SMART_SmartMsgSkipActivity", "skipToNotificationDetail=", notificationId);
        if (TextUtils.isEmpty(url)) {
            return;
        }
        Uri uri = Uri.parse(url);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        String strValue = AnalyticsValue.SUCCESSES_ACTIVITY_1100005.value();
        HashMap map = new HashMap(4);
        map.put("click", "1");
        if ("http".equals(scheme) || ProxyConfig.MATCH_HTTPS.equals(scheme)) {
            map.put("type", "1");
            map.put("from", "1");
            map.put("activityId", uri.getQueryParameter("activityId"));
            lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
        } else {
            map.put("type", "0");
            map.put("from", "1");
            lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
        }
        d(type, host, uri);
        Bundle bundle = new Bundle();
        bundle.putString("msgId", notificationId);
        bundle.putString(CommonUtil.DETAIL_URI, url);
        bundle.putString("EXTRA_BI_NAME", notificationMsgContent.getContent());
        bundle.putString("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
        if (i == 2) {
            bundle.putString("EXTRA_BI_SOURCE", "OPERPOSITION");
        } else {
            bundle.putString("EXTRA_BI_SOURCE", "SMARTCARD");
        }
        AppRouter.c("/PluginMessageCenter/DispatchSkipEventActivity").d(bundle).b(context);
    }

    private static void d(String str, String str2, Uri uri) {
        if ("kakaMessage".equals(str)) {
            HashMap map = new HashMap(4);
            map.put("from", "1");
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_KAKA_1100007.value(), map, 0);
        }
        if ("sportReport".equals(str2)) {
            HashMap map2 = new HashMap(4);
            if (qrs.a(uri.getQueryParameter("report_stype")) == 0) {
                map2.put("report", "1");
            } else {
                map2.put("report", "0");
            }
            map2.put("from", "3");
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_REPORT_1100009.value(), map2, 0);
            return;
        }
        if (NotificationMsgContent.MSG_TYPE_HISTORY_BEST_MSG.equals(str2)) {
            HashMap map3 = new HashMap(4);
            map3.put("click", "1");
            map3.put("from", "1");
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_HISTORY_BEST_1100008.value(), map3, 0);
            return;
        }
        LogUtil.j("SMART_SmartMsgSkipActivity", "setBiEvent is other host");
    }

    public static void e(final Context context, String str) {
        GRSManager.c(context).d("domainContentcenterDbankcdnNew", new GrsQueryCallback() { // from class: wng.4
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str2) {
                LogUtil.a("SMART_SmartMsgSkipActivity", "GET KEY SUCCESS");
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    String str3 = str2 + ((ActivityHtmlPathApi) Services.b("PluginOperation", ActivityHtmlPathApi.class)).getActivityHtmlPath() + Constants.MY_ACTIVITY_HTML;
                    Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
                    intent.putExtra("EXTRA_BI_NAME", context.getResources().getString(R.string.IDS_activity_social_my_activities));
                    intent.putExtra("EXTRA_BI_SOURCE", "SMARTCARD");
                    intent.putExtra("url", str3);
                    intent.putExtra("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
                    context.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    LogUtil.e("SMART_SmartMsgSkipActivity", "ActivityNotFoundException e = ", e.getMessage());
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("SMART_SmartMsgSkipActivity", "onCallBackFail i = ", Integer.valueOf(i));
            }
        });
    }
}
