package com.huawei.health.h5pro.jsbridge.system.share;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.jsbridge.system.storage.StorageUtil;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ShareEntry extends JsBaseModule {
    private static Share d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Share f6878c;

    public static Share getShareImpl() {
        return d;
    }

    public static void setShareImpl(Share share) {
        d = share;
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        Share share = d;
        if (share == null) {
            this.f6878c = new AndroidShare(this.mContext);
        } else {
            this.f6878c = share;
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        this.f6878c = null;
    }

    @JavascriptInterface
    public void share(final long j, String str) {
        if (TextUtils.isEmpty(str)) {
            onFailureCallback(j, "share: param is empty");
        } else if (!(this.f6878c instanceof ShareExtApi)) {
            LogUtil.w(this.TAG, "share: ShareExtApi Not Implemented");
        } else {
            H5ProInstance h5ProInstance = this.mH5ProInstance;
            ((ShareExtApi) this.f6878c).share(this.mContext, h5ProInstance == null ? null : h5ProInstance.getAppInfo(), str, new Share.ShareCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.share.ShareEntry.2
                @Override // com.huawei.health.h5pro.jsbridge.system.share.Share.ShareCallback
                public void onFailure(int i, String str2) {
                    ShareEntry.this.onFailureCallback(j, str2, i);
                }

                @Override // com.huawei.health.h5pro.jsbridge.system.share.Share.ShareCallback
                public void onSuccess() {
                    ShareEntry.this.onSuccessCallback(j);
                }
            });
        }
    }

    @JavascriptInterface
    public void shareImage(final long j, String str) {
        LogUtil.i(this.TAG, "shareImage start");
        ShareImageObj shareImageObj = (ShareImageObj) GsonUtil.parseContainsMapJson(str, ShareImageObj.class);
        if (shareImageObj == null) {
            LogUtil.w(this.TAG, "shareImage: shareImageObj is null");
            return;
        }
        try {
            String strWebAppUriToNativePath = StorageUtil.webAppUriToNativePath(this.mContext, CommonUtil.getAppId(this.mH5ProInstance), shareImageObj.getUri());
            LogUtil.d(this.TAG, "shareImage: filePath -> " + strWebAppUriToNativePath);
            shareImageObj.setFilePath(strWebAppUriToNativePath);
            Share share = this.f6878c;
            if (share == null) {
                LogUtil.w(this.TAG, "shareImage: share impl is null");
            } else {
                share.shareImage(shareImageObj, new Share.ShareCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.share.ShareEntry.4
                    @Override // com.huawei.health.h5pro.jsbridge.system.share.Share.ShareCallback
                    public void onFailure(int i, String str2) {
                        LogUtil.w(ShareEntry.this.TAG, "shareImage(onFailure): " + i + " - " + str2);
                        ShareEntry.this.onFailureCallback(j, str2, i);
                    }

                    @Override // com.huawei.health.h5pro.jsbridge.system.share.Share.ShareCallback
                    public void onSuccess() {
                        ShareEntry.this.onSuccessCallback(j);
                    }
                });
            }
        } catch (IOException e) {
            LogUtil.e(this.TAG, "shareImage: exception -> " + e.getMessage());
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void shareLink(final long j, String str) {
        LogUtil.i(this.TAG, "shareLink start");
        ShareLinkObj shareLinkObj = (ShareLinkObj) GsonUtil.parseContainsMapJson(str, ShareLinkObj.class);
        if (shareLinkObj == null) {
            LogUtil.w(this.TAG, "shareLink: shareLinkObj is null");
            return;
        }
        Share share = this.f6878c;
        if (share == null) {
            LogUtil.w(this.TAG, "shareLink: share impl is null");
        } else {
            share.shareLink(shareLinkObj, new Share.ShareCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.share.ShareEntry.1
                @Override // com.huawei.health.h5pro.jsbridge.system.share.Share.ShareCallback
                public void onFailure(int i, String str2) {
                    ShareEntry.this.onFailureCallback(j, str2, i);
                }

                @Override // com.huawei.health.h5pro.jsbridge.system.share.Share.ShareCallback
                public void onSuccess() {
                    ShareEntry.this.onSuccessCallback(j);
                }
            });
        }
    }

    @JavascriptInterface
    public void shareText(final long j, String str) {
        if (TextUtils.isEmpty(str)) {
            onFailureCallback(j, "share content is empty");
            return;
        }
        Share share = this.f6878c;
        if (share == null) {
            LogUtil.w(this.TAG, "shareText: share impl is null");
        } else {
            share.shareText(str, new Share.ShareCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.share.ShareEntry.5
                @Override // com.huawei.health.h5pro.jsbridge.system.share.Share.ShareCallback
                public void onFailure(int i, String str2) {
                    LogUtil.w(ShareEntry.this.TAG, "shareText(onFailure): " + i + " - " + str2);
                    ShareEntry.this.onFailureCallback(j, str2, i);
                }

                @Override // com.huawei.health.h5pro.jsbridge.system.share.Share.ShareCallback
                public void onSuccess() {
                    ShareEntry.this.onSuccessCallback(j);
                }
            });
        }
    }
}
