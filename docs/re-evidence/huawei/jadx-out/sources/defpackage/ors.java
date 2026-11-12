package defpackage;

import android.content.Context;
import android.content.Intent;
import com.huawei.haf.router.AppRouter;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.AchieveNavigationApi;
import com.huawei.pluginachievement.manager.model.PersonalData;
import health.compact.a.HuaweiHealth;

/* JADX INFO: loaded from: classes41.dex */
@ApiDefine(uri = AchieveNavigationApi.class)
public class ors implements AchieveNavigationApi {
    @Override // com.huawei.pluginachievement.AchieveNavigationApi
    public void showAchieveReport(Context context) {
        if (context == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_PluginAchieve", "showAchieveReport()");
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.pluginachievement.ui.AchieveReportActivity");
        context.startActivity(intent);
    }

    @Override // com.huawei.pluginachievement.AchieveNavigationApi
    public void showAchieveKaka(Context context) {
        if (context == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_PluginAchieve", "showAchieveKaka()");
        Intent intent = new Intent();
        intent.setClassName(context, PersonalData.CLASS_NAME_PERSONAL_KAKA);
        context.startActivity(intent);
        oun.a(context);
    }

    @Override // com.huawei.pluginachievement.AchieveNavigationApi
    public void showMyAwardPage(Context context) {
        if (context == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_PluginAchieve", "showMyAwardPage()");
        AppRouter.c("/HWUserProfileMgr/MyAwardActivity").b(context);
    }

    @Override // com.huawei.pluginachievement.AchieveNavigationApi
    public void showAchieveMedal(Context context) {
        if (context == null) {
            return;
        }
        if (pax.b()) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "showAchieveMedal isMedalFastClick!");
            return;
        }
        LogUtil.a("PLGACHIEVE_PluginAchieve", "showAchieveMedal()");
        Intent intent = new Intent();
        intent.setClassName(context, PersonalData.CLASS_NAME_PERSONAL_NEW_MEDALS);
        iov.d(context, intent);
    }

    @Override // com.huawei.pluginachievement.AchieveNavigationApi
    public void showAchieveMedalById(Context context, String str, String str2) {
        LogUtil.a("PLGACHIEVE_PluginAchieve", "showAchieveMedalById()");
        if (context == null) {
            LogUtil.a("PLGACHIEVE_PluginAchieve", "context is null");
        } else {
            oru.a(HuaweiHealth.a()).e(context, str, str2);
        }
    }
}
