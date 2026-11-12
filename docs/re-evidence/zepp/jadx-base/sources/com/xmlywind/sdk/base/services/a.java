package com.xmlywind.sdk.base.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.huami.feedback.log.utils.ConstantsKt;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.BaseBroadcastReceiver;
import com.xmlywind.sdk.base.common.t;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.IntentActions;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.common.models.SigmobError;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
class a extends BroadcastReceiver {
    private void a(Context context, PackageInfo packageInfo, String str) {
        t.a((BaseAdUnit) null, PointCategory.APP_INSTALL_MONITOR, packageInfo, str);
    }

    private void a(Context context, BaseAdUnit baseAdUnit, PackageInfo packageInfo) {
        com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_INSTALL_FINISH);
        t.a(baseAdUnit, PointCategory.APP_INSTALL_END, packageInfo, "1");
        HashMap map = new HashMap();
        map.put("result", "1");
        BaseBroadcastReceiver.a(context, baseAdUnit.getUuid(), map, IntentActions.ACTION_INTERSTITIAL_INSTALL_END);
        if (baseAdUnit.getMaterial().interaction_type.intValue() == com.xmlywind.sdk.videoAd.f.DownloadOpenDeepLinkType.a()) {
            try {
                com.xmlywind.sdk.common.utils.j.a(context, Uri.parse(baseAdUnit.getMacroCommon().macroProcess(baseAdUnit.getMaterial().deeplink_url)));
                com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_OPEN_DEEPLINK);
            } catch (Throwable th) {
                SigmobLog.e(th.getMessage());
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PackageInfo packageInfo;
        Toast toastMakeText;
        try {
            PackageManager packageManager = context.getPackageManager();
            String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
            BaseAdUnit baseAdUnitA = null;
            try {
                packageInfo = packageManager.getPackageInfo(schemeSpecificPart, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (!TextUtils.isEmpty(schemeSpecificPart)) {
                File file = new File(com.xmlywind.sdk.common.utils.d.d(), schemeSpecificPart + ConstantsKt.LOG_FILE_SUFFIX);
                Object objD = com.xmlywind.sdk.common.utils.d.d(file.getAbsolutePath());
                if (objD != null && (objD instanceof BaseAdUnit)) {
                    BaseAdUnit baseAdUnit = (BaseAdUnit) objD;
                    baseAdUnitA = com.xmlywind.sdk.base.common.d.a(baseAdUnit.getUuid());
                    if (baseAdUnitA == null) {
                        baseAdUnitA = baseAdUnit;
                    }
                }
                com.xmlywind.sdk.common.utils.d.b(file.getAbsolutePath());
            }
            if (baseAdUnitA == null) {
                a(context, packageInfo, intent.getAction());
                return;
            }
            String action = intent.getAction();
            byte b = -1;
            switch (action.hashCode()) {
                case -1585864895:
                    if (action.equals("android.intent.action.INSTALL_FAILURE")) {
                        b = 3;
                    }
                    break;
                case -810471698:
                    if (action.equals("android.intent.action.PACKAGE_REPLACED")) {
                        b = 2;
                    }
                    break;
                case 525384130:
                    if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                        b = 1;
                    }
                    break;
                case 1544582882:
                    if (action.equals("android.intent.action.PACKAGE_ADDED")) {
                        b = 0;
                    }
                    break;
            }
            if (b == 0) {
                a(context, baseAdUnitA, packageInfo);
                if (!Constants.IS_TEST.booleanValue()) {
                    return;
                }
                toastMakeText = Toast.makeText(context, "安装成功" + schemeSpecificPart, 1);
            } else if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        return;
                    }
                    if (Constants.IS_TEST.booleanValue()) {
                        Toast.makeText(context, "安装失败", 0).show();
                    }
                    StringBuilder sb = new StringBuilder();
                    SigmobError sigmobError = SigmobError.ERROR_SIGMOB_INSTALL_FAIL;
                    sb.append(sigmobError.toString());
                    sb.append(",System");
                    t.a(baseAdUnitA, PointCategory.APP_INSTALL_END, packageInfo, sb.toString());
                    t.a(PointCategory.APP_INSTALL_END, sigmobError.getErrorCode(), "system", baseAdUnitA);
                    HashMap map = new HashMap();
                    map.put("result", "0");
                    BaseBroadcastReceiver.a(context, baseAdUnitA.getUuid(), map, IntentActions.ACTION_INTERSTITIAL_INSTALL_END);
                    return;
                }
                a(context, baseAdUnitA, packageInfo);
                if (!Constants.IS_TEST.booleanValue()) {
                    return;
                }
                toastMakeText = Toast.makeText(context, "替换成功" + schemeSpecificPart, 1);
            } else if (intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                a(context, baseAdUnitA, packageInfo);
                toastMakeText = Toast.makeText(context, "替换成功" + schemeSpecificPart, 1);
            } else {
                if (!Constants.IS_TEST.booleanValue()) {
                    return;
                }
                toastMakeText = Toast.makeText(context, "卸载成功" + schemeSpecificPart, 1);
            }
            toastMakeText.show();
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
    }
}
