package com.huawei.hwdevice.phoneprocess.mgr.hwdevicescreenshotmgr;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import defpackage.miw;
import defpackage.muk;
import defpackage.xiu;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceScreenshotPretreatment implements PretreatmentService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f17485b = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        LogUtil.a("DeviceScreenshotPretreatment", "enter deviceScreenshot pretreatment.");
        muk.a().d(new xiu.c().a(d(context).getBytes(StandardCharsets.UTF_8)).c(), new SendCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwdevicescreenshotmgr.DeviceScreenshotPretreatment.3
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                LogUtil.a("DeviceScreenshotPretreatment", "send msg code: ", Integer.valueOf(i), " in DeviceScreenshotPretreatment");
            }
        });
        b(guidepost, context);
        return false;
    }

    private void b(Guidepost guidepost, Context context) {
        Uri uriO = guidepost.o();
        String string = uriO.toString();
        LogUtil.a("DeviceScreenshotPretreatment", "screenshot uri is ", string);
        if (!string.contains("screenshot")) {
            LogUtil.a("DeviceScreenshotPretreatment", " uri do not contains screenshot");
        } else if (Objects.equals(uriO.getQueryParameter("type"), "manual")) {
            if (e(context) == 2) {
                miw.d();
            }
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("DeviceScreenshotPretreatment", "screenshot type is manual");
        }
    }

    private boolean e(String str) {
        if (CommonUtil.bu()) {
            return false;
        }
        return SharedPreferenceManager.b(Integer.toString(1000), str, false);
    }

    private String d(Context context) {
        JSONObject jSONObject = new JSONObject();
        boolean zE = e("screenshot_init_screenshot_fail_switch");
        int iE = e("screenshot_no_storage_permission_switch") ? 2 : e(context);
        try {
            jSONObject.put("operateType", 1);
            jSONObject.put("statusCode", zE ? 2 : 1);
            jSONObject.put("hasPermission", iE);
        } catch (JSONException unused) {
            LogUtil.e("DeviceScreenshotPretreatment", "createResponseForStartService has an JSONException");
        }
        LogUtil.a("DeviceScreenshotPretreatment", "createResponseForStartService json:", jSONObject.toString());
        return jSONObject.toString();
    }

    private int e(Context context) {
        return (Build.VERSION.SDK_INT < 29 && !PermissionUtil.b(context, f17485b)) ? 2 : 1;
    }
}
