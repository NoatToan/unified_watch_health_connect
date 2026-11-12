package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import b71.i;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Personalization {
    public static final String ANALYTICS_ORIGIN_PERSONALIZATION = "fp";
    public static final String ARM_INDEX = "armIndex";
    public static final String CHOICE_ID = "choiceId";
    public static final String EXTERNAL_ARM_INDEX_PARAM = "arm_index";
    public static final String EXTERNAL_ARM_VALUE_PARAM = "arm_value";
    public static final String EXTERNAL_EVENT = "personalization_assignment";
    public static final String EXTERNAL_GROUP_PARAM = "group";
    public static final String EXTERNAL_PERSONALIZATION_ID_PARAM = "personalization_id";
    public static final String EXTERNAL_RC_PARAMETER_PARAM = "arm_key";
    public static final String GROUP = "group";
    public static final String INTERNAL_CHOICE_ID_PARAM = "_fpid";
    public static final String INTERNAL_EVENT = "_fpc";
    public static final String PERSONALIZATION_ID = "personalizationId";
    private final Provider<AnalyticsConnector> analyticsConnector;
    private final Map<String, String> loggedChoiceIds = Collections.synchronizedMap(new HashMap());

    public Personalization(Provider<AnalyticsConnector> provider) {
        this.analyticsConnector = provider;
    }

    public void logArmActive(String str, ConfigContainer configContainer) {
        JSONObject jSONObjectOptJSONObject;
        AnalyticsConnector analyticsConnector = this.analyticsConnector.get();
        if (analyticsConnector == null) {
            return;
        }
        JSONObject personalizationMetadata = configContainer.getPersonalizationMetadata();
        if (personalizationMetadata.length() < 1) {
            return;
        }
        JSONObject configs = configContainer.getConfigs();
        if (configs.length() >= 1 && (jSONObjectOptJSONObject = personalizationMetadata.optJSONObject(str)) != null) {
            String strOptString = jSONObjectOptJSONObject.optString(CHOICE_ID);
            if (strOptString.isEmpty()) {
                return;
            }
            synchronized (this.loggedChoiceIds) {
                try {
                    if (strOptString.equals(this.loggedChoiceIds.get(str))) {
                        return;
                    }
                    this.loggedChoiceIds.put(str, strOptString);
                    Bundle bundleD = i.d(EXTERNAL_RC_PARAMETER_PARAM, str);
                    bundleD.putString(EXTERNAL_ARM_VALUE_PARAM, configs.optString(str));
                    bundleD.putString(EXTERNAL_PERSONALIZATION_ID_PARAM, jSONObjectOptJSONObject.optString(PERSONALIZATION_ID));
                    bundleD.putInt(EXTERNAL_ARM_INDEX_PARAM, jSONObjectOptJSONObject.optInt(ARM_INDEX, -1));
                    bundleD.putString("group", jSONObjectOptJSONObject.optString("group"));
                    analyticsConnector.logEvent(ANALYTICS_ORIGIN_PERSONALIZATION, EXTERNAL_EVENT, bundleD);
                    Bundle bundle = new Bundle();
                    bundle.putString(INTERNAL_CHOICE_ID_PARAM, strOptString);
                    analyticsConnector.logEvent(ANALYTICS_ORIGIN_PERSONALIZATION, INTERNAL_EVENT, bundle);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
