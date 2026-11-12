package com.xmlywind.sdk.base.services;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.huami.feedback.log.utils.ConstantsKt;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.BaseBroadcastReceiver;
import com.xmlywind.sdk.base.common.t;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.IntentActions;
import com.xmlywind.sdk.common.models.SigmobError;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
class c extends BroadcastReceiver {
    private void a(Context context, long j, BaseAdUnit baseAdUnit) {
        if (baseAdUnit != null) {
            Map<String, Object> mapA = com.xmlywind.sdk.base.common.l.a(a(context), j);
            com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_DOWNLOAD_FINISH);
            String str = "download info is null";
            if (mapA != null) {
                String str2 = (String) mapA.get("fileName");
                int iIntValue = ((Integer) mapA.get("status")).intValue();
                int iIntValue2 = ((Integer) mapA.get("reason")).intValue();
                Uri uri = (Uri) mapA.get("uri");
                if (str2 != null && iIntValue == 8) {
                    try {
                        String strA = com.xmlywind.sdk.common.utils.d.a(context, uri);
                        com.xmlywind.sdk.base.common.l.b(context, strA, baseAdUnit);
                        t.a(baseAdUnit, PointCategory.DOWNLOAD_END, com.xmlywind.sdk.common.a.a(context, strA), "1");
                        HashMap map = new HashMap();
                        map.put("result", "1");
                        BaseBroadcastReceiver.a(context, baseAdUnit.getUuid(), map, IntentActions.ACTION_INTERSTITIAL_DOWNLOAD_END);
                        return;
                    } catch (Throwable th) {
                        SigmobLog.e(th.getMessage());
                        t.a(PointCategory.APP_INSTALL_START, SigmobError.ERROR_SIGMOB_INSTALL_FAIL.getErrorCode(), th.getMessage(), baseAdUnit);
                        t.b(PointCategory.APP_INSTALL_START, "0", baseAdUnit);
                        return;
                    }
                }
                try {
                    str = String.format("status %d, reason %d", Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                    SigmobLog.i("handleDownloadComplete:fail:" + com.xmlywind.sdk.common.utils.d.b(com.xmlywind.sdk.common.utils.d.a(context, uri)));
                } catch (Throwable th2) {
                    SigmobLog.e(th2.getMessage());
                }
            }
            try {
                Toast.makeText(context, "下载失败", 0).show();
            } catch (Throwable th3) {
                SigmobLog.e(th3.getMessage());
            }
            t.a(PointCategory.DOWNLOAD_FAILED, 2, str, baseAdUnit);
            t.b(PointCategory.DOWNLOAD_END, "0", baseAdUnit);
            HashMap map2 = new HashMap();
            map2.put("result", "0");
            BaseBroadcastReceiver.a(context, baseAdUnit.getUuid(), map2, IntentActions.ACTION_INTERSTITIAL_DOWNLOAD_END);
        }
    }

    public DownloadManager a(Context context) {
        return (DownloadManager) context.getSystemService(WatchFaceApi.SORT_DOWNLOAD);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        BaseAdUnit baseAdUnit = null;
        com.xmlywind.sdk.base.common.l.b(longExtra, (String) null);
        File file = new File(com.xmlywind.sdk.common.utils.d.d(), longExtra + ConstantsKt.LOG_FILE_SUFFIX);
        Object objD = com.xmlywind.sdk.common.utils.d.d(file.getAbsolutePath());
        if (objD != null && (objD instanceof BaseAdUnit)) {
            baseAdUnit = (BaseAdUnit) objD;
            BaseAdUnit baseAdUnitA = com.xmlywind.sdk.base.common.d.a(baseAdUnit.getUuid());
            if (baseAdUnitA != null) {
                baseAdUnit = baseAdUnitA;
            }
        }
        com.xmlywind.sdk.common.utils.d.b(file.getAbsolutePath());
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DOWNLOAD_COMPLETE") && baseAdUnit != null) {
            a(context, longExtra, baseAdUnit);
        }
    }
}
