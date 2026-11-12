package com.huawei.health.h5pro.jsbridge.system.shareplus;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.jsbridge.system.storage.StorageUtil;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class SharePlusEntry extends JsBaseModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharePlus f6892b;

    private String a() {
        return CommonUtil.getAppId(this.mH5ProInstance);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        this.f6892b = new SharePlusImpl(this.mContext, this.mH5ProInstance);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        SharePlus sharePlus = this.f6892b;
        if (sharePlus != null) {
            sharePlus.destroy();
            this.f6892b = null;
        }
    }

    @JavascriptInterface
    public void shareFile(long j, String str) {
        Context context;
        try {
            SharePlusParam sharePlusParam = (SharePlusParam) GsonUtil.parseContainsMapJson(str, SharePlusParam.class);
            if (!TextUtils.isEmpty(sharePlusParam.getUri()) && (context = this.mContext) != null) {
                sharePlusParam.setFilePath(StorageUtil.webAppUriToNativePath(context, a(), sharePlusParam.getUri()));
            }
            SharePlus sharePlus = this.f6892b;
            if (sharePlus == null) {
                LogUtil.w(this.TAG, "sharePlus is null");
                return;
            }
            try {
                sharePlus.shareFile(sharePlusParam);
                onSuccessCallback(j);
            } catch (Exception e) {
                onFailureCallback(j, "share file fail:" + e.getMessage());
            }
        } catch (IOException unused) {
            onFailureCallback(j, "share file fail:param invalid");
        }
    }
}
