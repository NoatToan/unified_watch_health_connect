package com.huawei.health.h5pro.dfx.bi;

import android.text.TextUtils;
import com.huawei.health.h5pro.utils.AppInfoUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ParamBuilder {
    private final LinkedHashMap<String, String> d = new LinkedHashMap<>();

    public LinkedHashMap<String, String> build() {
        this.d.put("platform", "h5pro");
        return this.d;
    }

    public ParamBuilder put(String str, String str2) {
        this.d.put(str, str2);
        return this;
    }

    public ParamBuilder putClickType() {
        this.d.put("click", "1");
        return this;
    }

    public ParamBuilder putCustomData(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            this.d.putAll(map);
        }
        return this;
    }

    public ParamBuilder putDomain(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.d.put("domain", str);
        }
        return this;
    }

    public ParamBuilder putUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.d.put("url", str);
        }
        return this;
    }

    public String toJson() {
        return new JSONObject(build()).toString();
    }

    public ParamBuilder withInstance(H5ProInstance h5ProInstance) {
        if (h5ProInstance != null) {
            this.d.put("domain", AppInfoUtil.getInstance().getHostOrPkgNameFroUrl(h5ProInstance.getUrl(), h5ProInstance.getAppInfo()));
            this.d.put("url", h5ProInstance.getUrl());
        }
        return this;
    }

    public ParamBuilder withUrl(String str, H5ProAppInfo h5ProAppInfo) {
        if (!TextUtils.isEmpty(str)) {
            this.d.put("domain", AppInfoUtil.getInstance().getHostOrPkgNameFroUrl(str, h5ProAppInfo));
            this.d.put("url", str);
        }
        return this;
    }
}
