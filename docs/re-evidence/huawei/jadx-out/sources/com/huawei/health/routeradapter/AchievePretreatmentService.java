package com.huawei.health.routeradapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import defpackage.oru;
import defpackage.osa;
import defpackage.oun;
import defpackage.wss;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes2.dex */
public class AchievePretreatmentService implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.j("AchievePretreatmentService", "onPretreatment uri is null!");
            return false;
        }
        b(context, uriO);
        return false;
    }

    private void b(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("module");
        String queryParameter2 = uri.getQueryParameter("id");
        String queryParameter3 = uri.getQueryParameter("from");
        LogUtil.a("AchievePretreatmentService", "goto achievement module= ", queryParameter);
        oru oruVarA = oru.a(context);
        if ("medal".equals(queryParameter)) {
            d(oruVarA, queryParameter2, queryParameter3, context);
            return;
        }
        if ("level".equals(queryParameter)) {
            if (Utils.o()) {
                return;
            }
            oruVarA.i(context);
            return;
        }
        if ("report".equals(queryParameter)) {
            oruVarA.j(context);
            return;
        }
        if ("kit".equals(queryParameter)) {
            c(context);
            return;
        }
        if ("vmall".equals(queryParameter)) {
            oruVarA.l(context);
            return;
        }
        if (ParsedFieldTag.KAKA_GET_GIFTS.equals(queryParameter)) {
            oruVarA.k(context);
            return;
        }
        if (ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE.equals(queryParameter)) {
            wss wssVarD = wss.d(context);
            wssVarD.a(new Handler());
            wssVarD.a(context);
        } else if ("weekreport".equals(queryParameter)) {
            oruVarA.e(context, oun.d(osa.e(context, "_weekMinReportNo")), oun.d(osa.e(context, "_weekReportNo")), 1);
        } else if ("monthreport".equals(queryParameter)) {
            oruVarA.e(context, oun.d(osa.e(context, "_monthMinReportNo")), oun.d(osa.e(context, "_monthReportNo")), 0);
        } else if ("achievement".equals(queryParameter)) {
            oruVarA.f(context);
        } else {
            LogUtil.j("AchievePretreatmentService", "module invalid");
        }
    }

    private void d(oru oruVar, String str, String str2, Context context) {
        LogUtil.a("AchievePretreatmentService", "showMeadlActivity, medalId:", str, " from: ", str2);
        if (oruVar == null) {
            LogUtil.j("AchievePretreatmentService", "showMeadlActivity: pluginAchieve is null");
        } else {
            if (TextUtils.isEmpty(str)) {
                oruVar.h(context);
                return;
            }
            if (oru.a(context).getAdapter() == null) {
                oru.a(context).setAdapter(new PluginAchieveAdapterImpl());
            }
            oruVar.e(context, str, str2);
        }
    }

    private void c(Context context) {
        LogUtil.a("AchievePretreatmentService", "showHealthKit enter");
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.ui.thirdpartservice.activity.healthkit.HealthKitActivity");
        context.startActivity(intent);
    }
}
