package com.huawei.operation.h5pro.jsmodules;

import android.webkit.JavascriptInterface;
import androidx.core.app.ActivityCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import defpackage.jpg;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class LocationService extends JsBaseModule {
    private static final int LOCATION_DIGIT = 2;

    @JavascriptInterface
    public void getCurrentLocation(final long j, String str) {
        final boolean z = true;
        boolean z2 = ActivityCompat.checkSelfPermission(BaseApplication.b(), "android.permission.ACCESS_FINE_LOCATION") == 0;
        boolean z3 = ActivityCompat.checkSelfPermission(BaseApplication.b(), "android.permission.ACCESS_COARSE_LOCATION") == 0;
        LogUtil.a(this.TAG, "getCurrentLocation hasFineLocation:", Boolean.valueOf(z2), " hasCoarseLocation:", Boolean.valueOf(z3));
        if (!z2 && !z3) {
            onFailureCallback(j, "location is null", -1);
            return;
        }
        LogUtil.a(this.TAG, "getCurrentLocation start:", str);
        String string = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            string = jSONObject.getString("coordinate");
            if (jSONObject.has("isAccessFine")) {
                z = jSONObject.getBoolean("isAccessFine");
            }
        } catch (JSONException e) {
            ReleaseLogUtil.e(this.TAG, "getCurrentLocation coordinate exception ", e);
        }
        RunningRouteUtils.a(string, new ResultCallback<jpg>() { // from class: com.huawei.operation.h5pro.jsmodules.LocationService.1
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(jpg jpgVar) {
                HashMap map = new HashMap();
                double d = jpgVar.f38787a;
                double d2 = jpgVar.d;
                if (!z) {
                    d = UnitUtil.d(d, 2);
                    d2 = UnitUtil.d(d2, 2);
                }
                map.put(JsbMapKeyNames.H5_LOC_LON, Double.valueOf(d));
                map.put(JsbMapKeyNames.H5_LOC_LAT, Double.valueOf(d2));
                LocationService.this.onSuccessCallback(j, map);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LocationService.this.onFailureCallback(j, "location is null", -1);
            }
        });
    }
}
