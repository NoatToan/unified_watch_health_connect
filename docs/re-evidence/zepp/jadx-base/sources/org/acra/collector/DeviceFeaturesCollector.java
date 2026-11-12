package org.acra.collector;

import android.content.Context;
import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;
import com.xiaomi.market.sdk.Constants;
import org.acra.ReportField;
import org.acra.builder.ReportBuilder;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportData;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class DeviceFeaturesCollector extends BaseReportFieldCollector {
    public DeviceFeaturesCollector() {
        super(ReportField.DEVICE_FEATURES, new ReportField[0]);
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(@NonNull ReportField reportField, @NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (FeatureInfo featureInfo : context.getPackageManager().getSystemAvailableFeatures()) {
            String str = featureInfo.name;
            if (str != null) {
                jSONObject.put(str, true);
            } else {
                jSONObject.put(Constants.JSON_GLES_VERSION, featureInfo.getGlEsVersion());
            }
        }
        crashReportData.put(ReportField.DEVICE_FEATURES, jSONObject);
    }
}
