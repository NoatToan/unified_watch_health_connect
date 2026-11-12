package com.huawei.health.h5pro.utils;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class EnvironmentHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile EnvironmentHelper f6987b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6988a = null;
    private ConcurrentHashMap<String, String> g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BuildType f6989c = BuildType.RELEASE;
    private boolean h = false;
    private boolean i = false;
    private String j = "";
    private String d = "";
    private String f = "";
    private String e = "";

    public enum BuildType {
        RELEASE,
        BETA,
        TEST,
        DEBUG,
        GREEN
    }

    private EnvironmentHelper() {
    }

    public static EnvironmentHelper getInstance() {
        if (f6987b == null) {
            synchronized (EnvironmentHelper.class) {
                if (f6987b == null) {
                    f6987b = new EnvironmentHelper();
                }
            }
        }
        return f6987b;
    }

    public void setBaseUrl(String str) {
        this.f6988a = str;
    }

    public void setBaseUrl(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.w("H5PRO_EnvironmentHelper", "setBaseUrl: name or specificBaseUrl is empty");
            return;
        }
        if (this.g == null) {
            this.g = new ConcurrentHashMap<>(1);
        }
        this.g.put(str, str2);
    }

    public void setSpecificBaseUrl(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            setBaseUrl(entry.getKey(), entry.getValue());
        }
    }

    public void setBuildType(BuildType buildType) {
        if (buildType == null) {
            buildType = BuildType.RELEASE;
        }
        this.f6989c = buildType;
    }

    public void useHmsLite(boolean z, String str) {
        this.h = z;
        this.j = str;
    }

    public void setAccountJsLoginUrl(String str) {
        this.d = str;
    }

    public String getUrl() {
        String str = this.f6988a;
        return str != null ? str : "";
    }

    public String getUrl(String str) {
        if (this.g != null && !TextUtils.isEmpty(str) && this.g.containsKey(str)) {
            String str2 = this.g.get(str);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            LogUtil.w("H5PRO_EnvironmentHelper", "getUrl: specificBaseUrl is empty -> " + str);
        }
        return getUrl();
    }

    public Map<String, String> getSpecificBaseUrl() {
        ConcurrentHashMap<String, String> concurrentHashMap = this.g;
        if (concurrentHashMap == null) {
            return null;
        }
        return Collections.unmodifiableMap(concurrentHashMap);
    }

    public BuildType getBuildType() {
        BuildType buildType = this.f6989c;
        return buildType == null ? BuildType.RELEASE : buildType;
    }

    public boolean isUseHmsLite() {
        return this.h;
    }

    public String getHostAt() {
        return this.j;
    }

    public String getAccountJsLoginUrl() {
        return this.d;
    }

    public boolean isMobileAppEngine() {
        return this.i;
    }

    public void setMobileAppEngine(boolean z) {
        this.i = z;
    }

    public String getUserFlag() {
        return this.f;
    }

    public void setUserFlag(String str) {
        this.f = str;
    }

    public void setAccountGrsAppName(String str) {
        if (TextUtils.equals(this.e, str)) {
            return;
        }
        this.e = str;
    }

    public String getAccountGrsAppName() {
        return this.e;
    }
}
