package com.huawei.hwarkuix.oHProEngine;

import android.content.Intent;
import android.webkit.WebView;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProAppLoadListener;
import com.huawei.health.h5pro.vengine.H5ProAppLoader;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.vengine.H5ResultCallback;
import com.huawei.health.h5pro.vengine.load.H5ProInstanceStatus;
import com.huawei.health.h5pro.vengine.load.H5ProInstanceStatusListener;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes37.dex */
public class OHH5ProInstance {
    private static final Object LOCK = new Object();
    private static final String TAG = "OhH5ProInstance";
    private static H5ProInstance mH5ProInstance;

    public static H5ProInstance getH5ProInstance() {
        if (mH5ProInstance == null) {
            synchronized (LOCK) {
                mH5ProInstance = new H5ProInstance() { // from class: com.huawei.hwarkuix.oHProEngine.OHH5ProInstance.1
                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public boolean canGoBack() {
                        return false;
                    }

                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public H5ProAppLoadListener getAppLoadListener() {
                        return null;
                    }

                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public H5ProAppLoader getAppLoader() {
                        return null;
                    }

                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public String getUrl() {
                        return null;
                    }

                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public WebView getWebView() {
                        return null;
                    }

                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public void goBack(H5ResultCallback h5ResultCallback) {
                    }

                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public void onActivityResult(int i, int i2, Intent intent) {
                    }

                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public void onMultiWindowModeChange(int i) {
                    }

                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
                    }

                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public void onStatusChanged(H5ProInstanceStatus h5ProInstanceStatus) {
                    }

                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public String readPreRequestsJson() {
                        return null;
                    }

                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public void registerInstanceStatusListener(H5ProInstanceStatusListener h5ProInstanceStatusListener) {
                    }

                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public void registerJsModule(String str, Object obj) {
                    }

                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public void setBackGroundColor(int i) {
                    }

                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public void setIsEnableOnDestroyCallback(boolean z) {
                    }

                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public void setIsEnableOnPauseCallback(boolean z) {
                    }

                    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
                    public void setIsEnableOnResumeCallback(boolean z) {
                    }
                };
                H5ProAppInfo h5ProAppInfo = new H5ProAppInfo();
                h5ProAppInfo.setPkgName("com.huawei.health.h5.my-annual-flag");
                mH5ProInstance.setAppInfo(h5ProAppInfo);
                LogUtil.a(TAG, "Create a new H5ProInstance!");
            }
        }
        return mH5ProInstance;
    }
}
