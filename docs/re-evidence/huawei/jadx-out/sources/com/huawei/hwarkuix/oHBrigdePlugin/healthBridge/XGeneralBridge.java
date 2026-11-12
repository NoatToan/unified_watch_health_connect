package com.huawei.hwarkuix.oHBrigdePlugin.healthBridge;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import defpackage.lrd;
import defpackage.qrs;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class XGeneralBridge extends OHProBridgePlugin {
    private static final String EXTRA_IS_SENSITIVE = "android.content.extra.IS_SENSITIVE";
    private static final String R_TAG = "R_ArkUIX_XGengenalBridge";
    private static final String TAG = "ArkUIX_XGengenalBridge";

    public XGeneralBridge(Context context, String str, int i) {
        super(context, str, i);
    }

    public XGeneralBridge(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
    }

    public void isSupportCloudFeature(int i) {
        ReleaseLogUtil.c(R_TAG, "isSupportCloudFeature enter");
        boolean zK = Utils.k();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSupportCloud", !zK);
        } catch (JSONException unused) {
            LogUtil.c(TAG, "isSupportCloudFeature put error");
        }
        ReleaseLogUtil.c(R_TAG, "isSupportCloudFeature resp: ", jSONObject.toString());
        ohProOnSuccess(i, jSONObject);
    }

    public void getClientId(int i) {
        ReleaseLogUtil.c(R_TAG, "getClientId enter");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientId", BaseApplication.d());
        } catch (JSONException unused) {
            LogUtil.c(TAG, "getClientId put error");
        }
        ReleaseLogUtil.c(R_TAG, "getClientId resp: ", jSONObject.toString());
        ohProOnSuccess(i, jSONObject);
    }

    public void isFoldable(int i) {
        ReleaseLogUtil.c(R_TAG, "isFoldable enter");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isFoldExpend", qrs.t());
        } catch (JSONException unused) {
            LogUtil.c(TAG, "isFoldable put error");
        }
        ReleaseLogUtil.c(R_TAG, "isFoldable resp: ", jSONObject.toString());
        ohProOnSuccess(i, jSONObject);
    }

    public void getFoldStatus(int i) {
        ReleaseLogUtil.c(R_TAG, "getFoldStatus enter");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("foldStatus", (qrs.af(BaseApplication.b()) && qrs.t()) ? "expand" : "fold");
        } catch (JSONException unused) {
            LogUtil.c(TAG, "getFoldStatus put error");
        }
        ReleaseLogUtil.c(R_TAG, "getFoldStatus resp: ", jSONObject.toString());
        ohProOnSuccess(i, jSONObject);
    }

    public void isTablet(int i) {
        ReleaseLogUtil.c(R_TAG, "isTablet enter");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isTablet", qrs.ah(BaseApplication.b()));
        } catch (JSONException unused) {
            LogUtil.c(TAG, "isTablet put error");
        }
        ReleaseLogUtil.c(R_TAG, "isTablet resp: ", jSONObject.toString());
        ohProOnSuccess(i, jSONObject);
    }

    public void isOpenTouchGuide(int i) {
        ReleaseLogUtil.c(R_TAG, "isOpenTouchGuide enter");
        boolean zD = lrd.d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isOpenTouchGuide", zD);
        } catch (JSONException unused) {
            LogUtil.c(TAG, "isOpenTouchGuide put error");
        }
        ReleaseLogUtil.c(R_TAG, "isOpenTouchGuide resp: ", jSONObject.toString());
        ohProOnSuccess(i, jSONObject);
    }

    public void isAppOversea(int i) {
        ReleaseLogUtil.c(R_TAG, "isAppOversea enter");
        boolean zO = Utils.o();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isAppOversea", zO);
        } catch (JSONException unused) {
            LogUtil.c(TAG, "isAppOversea put error");
        }
        ReleaseLogUtil.c(R_TAG, "isAppOversea resp: ", jSONObject.toString());
        ohProOnSuccess(i, jSONObject);
    }

    public void copyToClipboard(int i, String str) {
        ReleaseLogUtil.c(R_TAG, "copyToClipboard enter");
        if (TextUtils.isEmpty(str)) {
            LogUtil.c(TAG, "copyToClipboard content is empty");
            return;
        }
        LogUtil.a(TAG, "copyToClipboard content: ", str);
        boolean zCopyContentToClipboard = copyContentToClipboard(str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("copyToClipboard", zCopyContentToClipboard);
        } catch (JSONException unused) {
            LogUtil.c(TAG, "copyToClipboard JSON error");
        }
        ReleaseLogUtil.c(R_TAG, "copyToClipboard resp: ", jSONObject.toString());
        ohProOnSuccess(i, jSONObject);
    }

    private boolean copyContentToClipboard(String str) {
        Object systemService = BaseApplication.b().getSystemService("clipboard");
        if (TextUtils.isEmpty(str) || !(systemService instanceof ClipboardManager)) {
            LogUtil.c(TAG, "copyToClipboard failed");
            return false;
        }
        try {
            ClipboardManager clipboardManager = (ClipboardManager) systemService;
            ClipData clipDataNewPlainText = ClipData.newPlainText("Label", str);
            ClipDescription description = clipDataNewPlainText.getDescription();
            PersistableBundle persistableBundle = new PersistableBundle();
            if (Build.VERSION.SDK_INT >= 33) {
                persistableBundle.putBoolean(EXTRA_IS_SENSITIVE, true);
            } else {
                persistableBundle.putBoolean(EXTRA_IS_SENSITIVE, true);
            }
            description.setExtras(persistableBundle);
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
            return true;
        } catch (SecurityException unused) {
            LogUtil.c(TAG, "copyToClipboard securityException");
            return false;
        }
    }

    public void goSystemSettings(int i) {
        ReleaseLogUtil.c(R_TAG, "goSystemSettings enter");
        Context contextB = BaseApplication.b();
        JSONObject jSONObject = new JSONObject();
        if (contextB == null) {
            LogUtil.c(TAG, "goSystemSettings context is null");
            return;
        }
        try {
            Intent intent = new Intent("android.settings.SETTINGS");
            intent.addFlags(268435456);
            contextB.startActivity(intent);
            jSONObject.put("isSettings", true);
        } catch (AndroidRuntimeException | JSONException e) {
            LogUtil.c(TAG, "goSystemSettings failed", e.getMessage());
        }
        ReleaseLogUtil.c(R_TAG, "goSystemSettings resp: ", jSONObject.toString());
        ohProOnSuccess(i, jSONObject);
    }
}
