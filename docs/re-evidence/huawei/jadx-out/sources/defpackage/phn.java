package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.pluginachievement.AchieveNavigationApi;
import com.huawei.pluginachievement.manager.model.PersonalData;
import health.compact.a.Services;
import java.util.HashMap;

/* JADX INFO: loaded from: classes14.dex */
public class phn {
    public static void d(Context context, Uri uri, int i) {
        if (uri == null) {
            LogUtil.j("KaKaJumpUtil", "achieveJump, kakaMessage, and detailUri is null.");
            return;
        }
        AchieveNavigationApi achieveNavigationApi = (AchieveNavigationApi) Services.d("PluginAchievement", AchieveNavigationApi.class);
        String queryParameter = uri.getQueryParameter("type");
        if ("unclaimedKaka".equals(queryParameter)) {
            LogUtil.a("KaKaJumpUtil", "achieveJump, and type is: ", queryParameter);
            HashMap map = new HashMap(2);
            map.put("from", "2");
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_KAKA_1100007.value(), map, 0);
            if (achieveNavigationApi == null) {
                LogUtil.a("KaKaJumpUtil", "host: kakaMessage", ",achieveNavigationApi is null");
                return;
            } else {
                achieveNavigationApi.showAchieveKaka(context);
                return;
            }
        }
        if ("kakaExpiration".equals(queryParameter)) {
            LogUtil.a("KaKaJumpUtil", "achieveJump, and type is: ", queryParameter);
            if (i == 2) {
                HashMap map2 = new HashMap(3);
                map2.put("click", 1);
                map2.put("event", 0);
                map2.put("from", Integer.valueOf(i));
                lmf.d().c(com.huawei.haf.application.BaseApplication.b(), AnalyticsValue.SUCCESSES_KAKA_1100082.value(), map2, 0);
            }
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getContext(), PersonalData.CLASS_NAME_PERSONAL_KAKA_DETAIL);
            Bundle bundle = new Bundle();
            bundle.putString(RemoteMessageConst.Notification.TAG, JsbMapKeyNames.H5_TEXT_DETAIL);
            intent.putExtra(RemoteMessageConst.Notification.TAG, bundle);
            intent.putExtra("from", i);
            intent.setFlags(268435456);
            lsx.c(intent, BaseApplication.getContext());
            return;
        }
        LogUtil.j("KaKaJumpUtil", "achieveJump, unknown type. no jump");
    }
}
