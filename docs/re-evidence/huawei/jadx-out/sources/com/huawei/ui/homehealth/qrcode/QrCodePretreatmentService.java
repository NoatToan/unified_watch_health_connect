package com.huawei.ui.homehealth.qrcode;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.ui.homehealth.R;
import defpackage.oru;
import defpackage.qpx;
import defpackage.sub;
import health.compact.a.GRSManager;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class QrCodePretreatmentService implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        if (guidepost.o() == null) {
            LogUtil.e("QrCodePretreatmentService", "uri == null");
            return false;
        }
        if (context instanceof Activity) {
            b((Activity) context, guidepost.d());
        }
        if (guidepost.d().getBoolean("needValidateUrl", true)) {
            guidepost.d().putBoolean("needValidateUrl", false);
            c(context, guidepost);
            return false;
        }
        return d(context, guidepost);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Context context, final Guidepost guidepost) {
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.qrcode.QrCodePretreatmentService.5
                @Override // java.lang.Runnable
                public void run() {
                    QrCodePretreatmentService.this.c(context, guidepost);
                }
            });
            return;
        }
        GRSManager gRSManagerC = GRSManager.c(context);
        String commonCountryCode = gRSManagerC.getCommonCountryCode();
        final String noCheckUrl = gRSManagerC.getNoCheckUrl("domainMessagecenterHicloud", commonCountryCode);
        final ArrayList arrayList = new ArrayList(5);
        arrayList.add("huaweischeme://healthapp");
        arrayList.add(gRSManagerC.getNoCheckUrl("domainUrlCloudHuawei", commonCountryCode));
        arrayList.add(noCheckUrl);
        arrayList.add(gRSManagerC.getNoCheckUrl("domainUrlDreCloudHuawei", commonCountryCode));
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.homehealth.qrcode.QrCodePretreatmentService.3
            @Override // java.lang.Runnable
            public void run() {
                if (QrCodePretreatmentService.this.d(guidepost.o(), (List<String>) arrayList, noCheckUrl)) {
                    QrCodePretreatmentService.this.d(context, guidepost);
                    return;
                }
                if (BaseApplication.d("com.huawei.health.MainActivity") == -1) {
                    context.startActivity(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()));
                }
                LogUtil.e("QrCodePretreatmentService", "qrcode format error");
                qpx.e(context, R.string.IDS_device_wifi_my_qrcode_error_qrcode);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Uri uri, List<String> list, String str) {
        String str2 = uri.getScheme() + "://" + uri.getHost();
        if (!list.contains(str2)) {
            LogUtil.e("QrCodePretreatmentService", "wrong uri: not in the right uri list");
            return false;
        }
        if (uri.getQuery() == null) {
            if (str2.equals(str)) {
                return true;
            }
            LogUtil.e("QrCodePretreatmentService", "wrong uri with null parameter");
            return false;
        }
        if (!str2.equals(str)) {
            return true;
        }
        LogUtil.e("QrCodePretreatmentService", "wrong uri for download apps ");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Context context, Guidepost guidepost) {
        Uri uriO = guidepost.o();
        if (uriO == null) {
            return false;
        }
        String query = uriO.getQuery();
        LogUtil.b("QrCodePretreatmentService", " handleQrCode queryParameter:", query);
        if (query == null) {
            PluginAchieveAdapter pluginAchieveAdapterJ = oru.a(context).getAdapter();
            if (pluginAchieveAdapterJ == null) {
                oru.a(context).setAdapter(new PluginAchieveAdapterImpl());
                pluginAchieveAdapterJ = oru.a(context).getAdapter();
            }
            pluginAchieveAdapterJ.gotoAllDeviceBinding(context);
            return false;
        }
        String queryParameter = uriO.getQueryParameter("a");
        if ("deeplink".equals(queryParameter) || CmcdConfiguration.KEY_DEADLINE.equals(queryParameter)) {
            sub.a(context, uriO, query);
            return false;
        }
        AppRouter.c("/HomeHealth/QrCodeSchemeActivity").c("schemeQrCode", query).e("isAddSourceInfo", true).b(context);
        return false;
    }

    private void b(Activity activity, Bundle bundle) {
        Uri referrer;
        if (bundle.containsKey("src") || (referrer = activity.getReferrer()) == null) {
            return;
        }
        bundle.putString("src", referrer.getHost());
    }
}
