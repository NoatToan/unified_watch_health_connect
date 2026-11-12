package com.huawei.health.h5pro.jsbridge.system.util;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class UtilImpl implements Util {
    private H5ProInstance e;

    public UtilImpl(H5ProInstance h5ProInstance) {
        this.e = h5ProInstance;
    }

    private void e(Context context, JSONObject jSONObject) throws JSONException {
        Resources resources = context.getResources();
        if (resources == null) {
            LogUtil.w("H5PRO_util", "setFontScale: resources is null");
            return;
        }
        Configuration configuration = resources.getConfiguration();
        if (configuration == null) {
            LogUtil.w("H5PRO_util", "setFontScale: configuration is null");
            return;
        }
        double d = configuration.fontScale;
        jSONObject.put("systemFontScale", d);
        H5ProInstance h5ProInstance = this.e;
        if (h5ProInstance == null || !h5ProInstance.isTextZoom()) {
            return;
        }
        jSONObject.put("fontScale", d);
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.util.Util
    public JSONObject deviceInfo(Context context) {
        if (context == null) {
            return null;
        }
        int iPx2dip = CommonUtil.px2dip(context, CommonUtil.getStatusBarHeight(context));
        Configuration configuration = context.getResources().getConfiguration();
        boolean z = (configuration.uiMode & 48) == 32;
        boolean z2 = configuration.orientation == 2;
        int activityWindowMode = context instanceof Activity ? CommonUtil.getActivityWindowMode((Activity) context) : 0;
        if (activityWindowMode == 1 || activityWindowMode == 3) {
            iPx2dip = 0;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("topLayout", iPx2dip);
            jSONObject.put("bottomLayout", 0);
            jSONObject.put("isDarkTheme", z);
            jSONObject.put("winMode", activityWindowMode);
            jSONObject.put("isScreenLandscape", z2);
            e(context, jSONObject);
            LogUtil.i("H5PRO_util", "deviceInfo: result -> " + jSONObject);
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("H5PRO_util", "build result json exception");
            return null;
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.util.Util
    public boolean isAppInstalled(Context context, String str) {
        LogUtil.i("H5PRO_util", "isAppInstalled start");
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.i("H5PRO_util", "context or packageName is null");
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || packageManager.getPackageInfo(str, 0) == null) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
