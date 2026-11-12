package com.huawei.hianalytics.visual;

import android.text.TextUtils;
import com.huawei.hianalytics.framework.utils.JsonUtils;
import com.huawei.hianalytics.visual.view.model.config.AbConfigResponse;
import com.huawei.hianalytics.visual.view.model.config.AutoCollectPackages;
import com.huawei.hianalytics.visual.view.model.config.VisualConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f11707a;

    public v0() {
        this.f11707a = TextUtils.isEmpty("visual_config") ? null : new x0(s0.f11693a);
    }

    public final List a() {
        AbConfigResponse.AbConfigResult result;
        List<AbConfigResponse.AbConfigResult.FeatureConfigValue> featureConfigValues;
        String str = (String) this.f11707a.a();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        AbConfigResponse abConfigResponse = (AbConfigResponse) JsonUtils.toObjectNoException(str, AbConfigResponse.class, AbConfigResponse.AbConfigResult.class, AbConfigResponse.AbConfigResult.FeatureConfigValue.class);
        if (abConfigResponse == null || (result = abConfigResponse.getResult()) == null || (featureConfigValues = result.getFeatureConfigValues()) == null || featureConfigValues.isEmpty()) {
            featureConfigValues = new ArrayList<>();
        }
        if (featureConfigValues.isEmpty()) {
            return new ArrayList();
        }
        for (AbConfigResponse.AbConfigResult.FeatureConfigValue featureConfigValue : featureConfigValues) {
            if (TextUtils.equals(featureConfigValue.getParamKey(), "hianalytics_auto_collect_packages")) {
                AutoCollectPackages autoCollectPackages = (AutoCollectPackages) JsonUtils.toObjectNoException(featureConfigValue.getParamValue(), AutoCollectPackages.class, new Class[0]);
                return autoCollectPackages == null ? new ArrayList() : autoCollectPackages.packagesList;
            }
        }
        return new ArrayList();
    }

    public final ArrayList b() {
        AbConfigResponse.AbConfigResult result;
        List<AbConfigResponse.AbConfigResult.FeatureConfigValue> featureConfigValues;
        String str = (String) this.f11707a.a();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        AbConfigResponse abConfigResponse = (AbConfigResponse) JsonUtils.toObjectNoException(str, AbConfigResponse.class, AbConfigResponse.AbConfigResult.class, AbConfigResponse.AbConfigResult.FeatureConfigValue.class);
        if (abConfigResponse == null || (result = abConfigResponse.getResult()) == null || (featureConfigValues = result.getFeatureConfigValues()) == null || featureConfigValues.isEmpty()) {
            featureConfigValues = new ArrayList<>();
        }
        if (featureConfigValues.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<AbConfigResponse.AbConfigResult.FeatureConfigValue> it = featureConfigValues.iterator();
        while (it.hasNext()) {
            VisualConfig visualConfig = (VisualConfig) JsonUtils.toObjectNoException(it.next().getParamValue(), VisualConfig.class, VisualConfig.VisualEvent.class, VisualConfig.VisualProperty.class);
            if (visualConfig != null && visualConfig.event != null) {
                arrayList.add(visualConfig);
            }
        }
        return arrayList;
    }
}
