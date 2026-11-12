package com.huawei.health.h5pro.vengine;

import android.content.Intent;
import android.text.TextUtils;
import android.webkit.WebView;
import com.huawei.health.h5pro.utils.AppInfoUtil;
import com.huawei.health.h5pro.vengine.load.H5ProInstanceStatus;
import com.huawei.health.h5pro.vengine.load.H5ProInstanceStatusListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class H5ProInstance {
    private static final String TAG = "H5PRO_H5ProInstance";
    private H5ProAppInfo mH5ProAppInfo;
    private H5ProJsCbkInvoker<Object> mH5ProJsCbkInvoker;
    private H5ProViewControls mH5ProViewControls;
    private boolean mIsEnableSelfProtection;
    private String mPath;
    private String[] mSafeUrls;
    private String mTitleName;
    private boolean mIsEmbedded = false;
    private boolean mIsLoaded = false;
    private boolean mIsEnableImageCache = false;
    private boolean mIsDisableImageProxy = false;
    private boolean mIsInterceptWebViewPause = false;
    private boolean isTextZoom = false;
    private final List<JsBridgeCleaner> mListCleaner = new ArrayList();
    private final Map<String, String> mAccessTokenMap = new HashMap();
    private long mLaunchTime = System.currentTimeMillis();

    public interface JsBridgeCleaner {
        void destroy();
    }

    public abstract boolean canGoBack();

    public abstract H5ProAppLoadListener getAppLoadListener();

    public abstract H5ProAppLoader getAppLoader();

    public abstract String getUrl();

    public abstract WebView getWebView();

    public abstract void goBack(H5ResultCallback h5ResultCallback);

    public abstract void onActivityResult(int i, int i2, Intent intent);

    public abstract void onMultiWindowModeChange(int i);

    public void onPause() {
    }

    public abstract void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    public void onResume() {
    }

    public abstract void onStatusChanged(H5ProInstanceStatus h5ProInstanceStatus);

    public abstract String readPreRequestsJson();

    public abstract void registerInstanceStatusListener(H5ProInstanceStatusListener h5ProInstanceStatusListener);

    public abstract void registerJsModule(String str, Object obj);

    public abstract void setBackGroundColor(int i);

    public abstract void setIsEnableOnDestroyCallback(boolean z);

    public abstract void setIsEnableOnPauseCallback(boolean z);

    public abstract void setIsEnableOnResumeCallback(boolean z);

    public void setAccessToken(String str) {
        String hostOrPkgNameFroUrl = AppInfoUtil.getInstance().getHostOrPkgNameFroUrl(getUrl(), this.mH5ProAppInfo);
        if (hostOrPkgNameFroUrl == null) {
            return;
        }
        this.mAccessTokenMap.put(hostOrPkgNameFroUrl, str);
    }

    public String getAccessToken() {
        String hostOrPkgNameFroUrl = AppInfoUtil.getInstance().getHostOrPkgNameFroUrl(getUrl(), this.mH5ProAppInfo);
        return TextUtils.isEmpty(hostOrPkgNameFroUrl) ? hostOrPkgNameFroUrl : this.mAccessTokenMap.get(hostOrPkgNameFroUrl);
    }

    public void removeAccessToken() {
        String hostOrPkgNameFroUrl = AppInfoUtil.getInstance().getHostOrPkgNameFroUrl(getUrl(), this.mH5ProAppInfo);
        if (TextUtils.isEmpty(hostOrPkgNameFroUrl)) {
            return;
        }
        this.mAccessTokenMap.remove(hostOrPkgNameFroUrl);
    }

    public boolean registerCleaner(JsBridgeCleaner jsBridgeCleaner) {
        if (this.mListCleaner.contains(jsBridgeCleaner)) {
            return false;
        }
        this.mListCleaner.add(jsBridgeCleaner);
        return true;
    }

    public void destroy() {
        Iterator<JsBridgeCleaner> it = this.mListCleaner.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.mSafeUrls = null;
        this.mH5ProViewControls = null;
    }

    public void setAppInfo(H5ProAppInfo h5ProAppInfo) {
        this.mH5ProAppInfo = h5ProAppInfo;
    }

    public H5ProAppInfo getAppInfo() {
        return this.mH5ProAppInfo;
    }

    public void setJsCbkInvoker(H5ProJsCbkInvoker<Object> h5ProJsCbkInvoker) {
        this.mH5ProJsCbkInvoker = h5ProJsCbkInvoker;
    }

    public H5ProJsCbkInvoker<Object> getJsCbkInvoker() {
        return this.mH5ProJsCbkInvoker;
    }

    public H5ProViewControls getViewControls() {
        return this.mH5ProViewControls;
    }

    public void setViewControls(H5ProViewControls h5ProViewControls) {
        this.mH5ProViewControls = h5ProViewControls;
    }

    public void updateTitle(String str) {
        H5ProAppInfo appInfo;
        if (TextUtils.isEmpty(str) && (appInfo = getAppInfo()) != null && !TextUtils.isEmpty(appInfo.getAppName())) {
            this.mTitleName = appInfo.getAppName();
        } else {
            this.mTitleName = str;
        }
    }

    public String getTitle() {
        return this.mTitleName;
    }

    public String getAppFlag() {
        H5ProAppInfo h5ProAppInfo = this.mH5ProAppInfo;
        if (h5ProAppInfo != null) {
            if (TextUtils.isEmpty(h5ProAppInfo.getPkgName())) {
                return "H5ProLight";
            }
            return TextUtils.isEmpty(this.mH5ProAppInfo.getAppName()) ? this.mH5ProAppInfo.getPkgName() : this.mH5ProAppInfo.getAppName();
        }
        return "";
    }

    public long getLaunchTime() {
        return this.mLaunchTime;
    }

    public boolean isEnableSelfProtection() {
        return this.mIsEnableSelfProtection;
    }

    public void setIsEnableSelfProtection(boolean z) {
        this.mIsEnableSelfProtection = z;
    }

    public String[] getSafeUrls() {
        return this.mSafeUrls;
    }

    public void setSafeUrls(String[] strArr) {
        this.mSafeUrls = strArr;
    }

    public boolean isEmbedded() {
        return this.mIsEmbedded;
    }

    public void setEmbedded() {
        this.mIsEmbedded = true;
    }

    public boolean isLoaded() {
        return this.mIsLoaded;
    }

    public void setLoaded() {
        this.mIsLoaded = true;
    }

    public boolean isEnableImageCache() {
        return this.mIsEnableImageCache;
    }

    public void setIsEnableImageCache(boolean z) {
        this.mIsEnableImageCache = z;
    }

    public boolean isDisableImageProxy() {
        return this.mIsDisableImageProxy;
    }

    public void setIsDisableImageProxy(boolean z) {
        this.mIsDisableImageProxy = z;
    }

    public void interceptWebViewPause(boolean z) {
        this.mIsInterceptWebViewPause = z;
    }

    public boolean isInterceptWebViewPause() {
        return this.mIsInterceptWebViewPause;
    }

    public void setPath(String str) {
        this.mPath = str;
    }

    public String getPath() {
        return this.mPath;
    }

    public void setTextZoom(boolean z) {
        this.isTextZoom = z;
    }

    public boolean isTextZoom() {
        return this.isTextZoom;
    }
}
