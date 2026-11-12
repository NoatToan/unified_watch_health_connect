package com.huawei.maps.offlinedata.health.init;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes12.dex */
public class OfflineMapInitOptions {
    private Activity activity;
    private Application context;
    private String deviceName;
    private String h5proUrl;
    private String[] recommendCityIds;
    private String uniqueDevice;

    public Activity getActivity() {
        return this.activity;
    }

    public Application getContext() {
        return this.context;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getH5proUrl() {
        return this.h5proUrl;
    }

    public String[] getRecommendCityIds() {
        return this.recommendCityIds;
    }

    public String getUniqueDevice() {
        return this.uniqueDevice;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setContext(Application application) {
        this.context = application;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setH5proUrl(String str) {
        this.h5proUrl = str;
    }

    public void setRecommendCityIds(String[] strArr) {
        this.recommendCityIds = strArr;
    }

    public void setUniqueDevice(String str) {
        this.uniqueDevice = str;
    }
}
