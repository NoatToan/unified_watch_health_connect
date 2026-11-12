package com.garmin.android.gncs.datamappers;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.GNCSParsedNotification;
import com.garmin.android.gncs.persistence.GNCSNotificationAction;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import ih2.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ConfigurableDataMapper extends GenericDataMapper {
    private static final String TAG = "ConfigurableDataMapper: ";
    private static final Map<String, DataMapperConfig> mapperConfig = new HashMap();
    private String packageName;

    public static class DataMapperConfig {
        final int actionIndex;
        final JSONArray messageMapping;
        final JSONArray subTitleMapping;
        final JSONArray titleMapping;

        public DataMapperConfig(JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, int i14) {
            this.titleMapping = jSONArray;
            this.subTitleMapping = jSONArray2;
            this.messageMapping = jSONArray3;
            this.actionIndex = i14;
        }
    }

    private static String getValue(String str, Bundle bundle) {
        str.getClass();
        switch (str) {
            case "android.title":
            case "android.conversationTitle":
            case "android.subText":
            case "android.text":
            case "android.bigText":
            case "android.infoText":
            case "android.summaryText":
            case "android.title.big":
                Object obj = bundle.get(str);
                return obj != null ? obj.toString() : "";
            case "android.textLines":
                CharSequence[] charSequenceArray = bundle.getCharSequenceArray("android.textLines");
                if (charSequenceArray == null) {
                    return "";
                }
                StringBuilder sb3 = new StringBuilder();
                for (CharSequence charSequence : charSequenceArray) {
                    if (sb3.length() > 0) {
                        sb3.append("\n");
                    }
                    sb3.append(charSequence);
                }
                return sb3.toString();
            default:
                return "";
        }
    }

    public static void setRemoteConfig(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap map = new HashMap();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                map.put(jSONObject.getString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME), new DataMapperConfig(jSONObject.optJSONArray("titleMapping"), jSONObject.optJSONArray("subTitleMapping"), jSONObject.optJSONArray("messageMapping"), jSONObject.optInt("actionIndex", -1)));
            }
        } catch (Throwable th3) {
            b.c("ConfigurableDataMapper: setRemoteConfig -> invalid json configuration", th3);
            map.clear();
        }
        Map<String, DataMapperConfig> map2 = mapperConfig;
        synchronized (map2) {
            try {
                if (!map.isEmpty()) {
                    map2.clear();
                    map2.putAll(map);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // com.garmin.android.gncs.datamappers.GenericDataMapper
    public int getSimpleActionIndex(List<GNCSNotificationAction> list) {
        int i14;
        DataMapperConfig dataMapperConfig = mapperConfig.get(this.packageName);
        return (dataMapperConfig == null || (i14 = dataMapperConfig.actionIndex) == -1) ? super.getSimpleActionIndex(list) : i14;
    }

    @Override // com.garmin.android.gncs.datamappers.GenericDataMapper, com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void mapExtras(Context context, GNCSParsedNotification gNCSParsedNotification) {
        DataMapperConfig dataMapperConfig;
        Bundle bundle;
        super.mapExtras(context, gNCSParsedNotification);
        Map<String, DataMapperConfig> map = mapperConfig;
        synchronized (map) {
            dataMapperConfig = map.get(gNCSParsedNotification.notificationInfo.packageName);
        }
        if (dataMapperConfig == null || (bundle = gNCSParsedNotification.extras) == null || bundle.size() == 0) {
            return;
        }
        String value = getValue(dataMapperConfig.titleMapping, bundle);
        if (!TextUtils.isEmpty(value)) {
            gNCSParsedNotification.notificationInfo.title = value;
        }
        String value2 = getValue(dataMapperConfig.subTitleMapping, bundle);
        if (!TextUtils.isEmpty(value2)) {
            gNCSParsedNotification.notificationInfo.subTitle = value2;
        }
        String value3 = getValue(dataMapperConfig.messageMapping, bundle);
        if (TextUtils.isEmpty(value3)) {
            return;
        }
        gNCSParsedNotification.notificationInfo.message = value3;
    }

    @Override // com.garmin.android.gncs.datamappers.GenericDataMapper, com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void mapSimpleActions(Context context, GNCSNotificationInfo gNCSNotificationInfo) {
        this.packageName = gNCSNotificationInfo.packageName;
        super.mapSimpleActions(context, gNCSNotificationInfo);
    }

    private static String getValue(JSONArray jSONArray, Bundle bundle) {
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                try {
                    String value = getValue("android." + jSONArray.get(i14), bundle);
                    if (!TextUtils.isEmpty(value)) {
                        return value;
                    }
                } catch (JSONException e4) {
                    b.a(e4, "ConfigurableDataMapper: getValue");
                }
            }
        }
        return null;
    }
}
