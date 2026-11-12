package com.huawei.health.h5pro.jsbridge.system.storage;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.core.a;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.webkit.trustlist.H5ProTrustListChecker;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class StorageEntry extends JsBaseModule {
    private Storage e;

    private String b() {
        return CommonUtil.getAppId(this.mH5ProInstance);
    }

    private boolean c() {
        H5ProInstance h5ProInstance = this.mH5ProInstance;
        H5ProAppInfo appInfo = h5ProInstance == null ? null : h5ProInstance.getAppInfo();
        if (appInfo == null) {
            LogUtil.w(this.TAG, "isInterceptStorage: h5ProAppInfo is null");
            return true;
        }
        if (appInfo.getH5ProAppType() == H5ProAppInfo.H5ProAppType.H5_MINI_PROGRAM) {
            return false;
        }
        LogUtil.w(this.TAG, "isInterceptStorage: isH5MiniProgram -> false");
        return true;
    }

    @JavascriptInterface
    public void access(long j, String str) {
        LogUtil.i(this.TAG, "access");
        if (c()) {
            onFailureCallback(j, "untrusted");
            return;
        }
        try {
            onSuccessCallback(j, Boolean.valueOf(this.e.access(StorageUtil.webAppUriToNativePath(this.mContext, b(), new JSONObject(str).optString("uri")))));
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void base64ToFile(long j, String str) {
        LogUtil.i(this.TAG, "base64ToFile");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("uri");
            String strOptString2 = jSONObject.optString("data");
            this.e.base64ToFile(StorageUtil.webAppUriToNativePath(this.mContext, b(), strOptString), strOptString2);
            onSuccessCallback(j, strOptString);
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void base64ToImageFile(final long j, String str) {
        LogUtil.i(this.TAG, "base64ToImageFile");
        try {
            JSONObject jSONObject = new JSONObject(str);
            final String strOptString = jSONObject.optString("uri");
            String strOptString2 = jSONObject.optString("buffer");
            String strWebAppUriToNativePath = StorageUtil.webAppUriToNativePath(this.mContext, b(), strOptString);
            if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strWebAppUriToNativePath)) {
                this.e.base64ToImageFile(strWebAppUriToNativePath, strOptString2, new AndroidStorage.Callback() { // from class: com.huawei.health.h5pro.jsbridge.system.storage.StorageEntry.3
                    @Override // com.huawei.health.h5pro.jsbridge.system.storage.AndroidStorage.Callback
                    public void onFailure(String str2) {
                        StorageEntry.this.onFailureCallback(j, str2);
                    }

                    @Override // com.huawei.health.h5pro.jsbridge.system.storage.AndroidStorage.Callback
                    public <T> void onSuccess(T t) {
                        StorageEntry.this.onSuccessCallback(j, strOptString);
                    }
                });
                return;
            }
            onFailureCallback(j, "path or buffer is null");
        } catch (IOException | IllegalArgumentException | JSONException e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void clearKeyValues(long j) {
        LogUtil.i(this.TAG, "clearKeyValues");
        if (c()) {
            onFailureCallback(j, "untrusted");
            return;
        }
        try {
            this.e.clearKeyValues(b());
            onSuccessCallback(j);
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void copy(long j, String str) {
        LogUtil.i(this.TAG, "copy");
        if (c()) {
            onFailureCallback(j, "untrusted");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("srcUri");
            String strOptString2 = jSONObject.optString("dstUri");
            this.e.copy(StorageUtil.webAppUriToNativePath(this.mContext, b(), strOptString), StorageUtil.webAppUriToNativePath(this.mContext, b(), strOptString2));
            onSuccessCallback(j);
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void delete(long j, String str) {
        LogUtil.i(this.TAG, "delete");
        if (c()) {
            onFailureCallback(j, "untrusted");
            return;
        }
        try {
            this.e.delete(StorageUtil.webAppUriToNativePath(this.mContext, b(), new JSONObject(str).optString("uri")));
            onSuccessCallback(j);
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void get(long j, String str) {
        LogUtil.i(this.TAG, "get");
        if (c()) {
            onFailureCallback(j, "untrusted");
            return;
        }
        try {
            onSuccessCallback(j, this.e.get(StorageUtil.webAppUriToNativePath(this.mContext, b(), new JSONObject(str).optString("uri"))));
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void getFile(long j, String str) {
        H5ProInstance h5ProInstance;
        if (this.mContext == null || (h5ProInstance = this.mH5ProInstance) == null) {
            LogUtil.w(this.TAG, "getFile: context or instance is null");
        } else if (H5ProTrustListChecker.isTrusted(h5ProInstance)) {
            new FileOperateApi(this.mContext, this.mH5ProInstance).d(j, str);
        } else {
            LogUtil.w(this.TAG, "getFile: untrusted");
        }
    }

    @JavascriptInterface
    public void getValueByKey(long j, String str) {
        LogUtil.i(this.TAG, "getValueByKey");
        if (c()) {
            onFailureCallback(j, "untrusted");
            return;
        }
        try {
            onSuccessCallback(j, this.e.getValueByKey(b(), new JSONObject(str).optString(MedalConstants.EVENT_KEY)));
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void list(long j, String str) {
        LogUtil.i(this.TAG, "list");
        if (c()) {
            onFailureCallback(j, "untrusted");
            return;
        }
        try {
            onSuccessCallback(j, new JSONArray(this.e.list(StorageUtil.webAppUriToNativePath(this.mContext, b(), new JSONObject(str).optString("uri")))).toString());
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void mkdir(long j, String str) {
        LogUtil.i(this.TAG, "mkdir");
        if (c()) {
            onFailureCallback(j, "untrusted");
            return;
        }
        try {
            this.e.mkdir(StorageUtil.webAppUriToNativePath(this.mContext, b(), new JSONObject(str).optString("uri")));
            onSuccessCallback(j);
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void move(long j, String str) {
        LogUtil.i(this.TAG, "move");
        if (c()) {
            onFailureCallback(j, "untrusted");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("srcUri");
            String strOptString2 = jSONObject.optString("dstUri");
            this.e.move(StorageUtil.webAppUriToNativePath(this.mContext, b(), strOptString), StorageUtil.webAppUriToNativePath(this.mContext, b(), strOptString2));
            onSuccessCallback(j);
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        this.e = new AndroidStorage(this.mContext);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.e.onRequestPermissionsResult(i, strArr, iArr);
    }

    @JavascriptInterface
    public void readArrayBuffer(long j, String str) {
        LogUtil.i(this.TAG, "readArrayBuffer");
        if (c()) {
            onFailureCallback(j, "untrusted");
            return;
        }
        try {
            onSuccessCallback(j, this.e.readArrayBuffer(StorageUtil.webAppUriToNativePath(this.mContext, b(), new JSONObject(str).optString("uri"))));
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void readText(long j, String str) {
        LogUtil.i(this.TAG, "readText");
        if (c()) {
            onFailureCallback(j, "untrusted");
            return;
        }
        try {
            onSuccessCallback(j, this.e.readText(StorageUtil.webAppUriToNativePath(this.mContext, b(), new JSONObject(str).optString("uri"))));
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void rmdir(long j, String str) {
        LogUtil.i(this.TAG, "rmdir");
        if (c()) {
            onFailureCallback(j, "untrusted");
            return;
        }
        try {
            this.e.rmdir(StorageUtil.webAppUriToNativePath(this.mContext, b(), new JSONObject(str).optString("uri")));
            onSuccessCallback(j);
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void saveFile(long j, String str) {
        H5ProInstance h5ProInstance;
        if (this.mContext == null || (h5ProInstance = this.mH5ProInstance) == null) {
            LogUtil.w(this.TAG, "saveFile: context or instance is null");
        } else if (H5ProTrustListChecker.isTrusted(h5ProInstance)) {
            new FileOperateApi(this.mContext, this.mH5ProInstance).c(j, str);
        } else {
            LogUtil.w(this.TAG, "saveFile: untrusted");
        }
    }

    @JavascriptInterface
    public void saveImageToAlbum(final long j, String str) {
        LogUtil.i(this.TAG, "saveImageToAlbum");
        if (c()) {
            onFailureCallback(j, "untrusted");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            onFailureCallback(j, "param is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("type");
            String strOptString2 = jSONObject.optString("resource");
            String strOptString3 = jSONObject.optString("name");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                onFailureCallback(j, "type or content is null");
            } else {
                this.e.saveImageToAlbum(strOptString, strOptString2, strOptString3, new AndroidStorage.Callback() { // from class: com.huawei.health.h5pro.jsbridge.system.storage.StorageEntry.5
                    @Override // com.huawei.health.h5pro.jsbridge.system.storage.AndroidStorage.Callback
                    public void onFailure(String str2) {
                        LogUtil.e(StorageEntry.this.TAG, a.a("saveImageToAlbum: onFailure-> ", str2));
                        StorageEntry.this.onFailureCallback(j, str2);
                    }

                    @Override // com.huawei.health.h5pro.jsbridge.system.storage.AndroidStorage.Callback
                    public <T> void onSuccess(T t) {
                        LogUtil.i(StorageEntry.this.TAG, "saveImageToAlbum: onSuccess");
                        StorageEntry.this.onSuccessCallback(j);
                    }
                });
            }
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "saveImageToAlbum: JSONException");
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void setValueByKey(long j, String str) {
        LogUtil.i(this.TAG, "setValueByKey");
        if (c()) {
            onFailureCallback(j, "untrusted");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.e.setValueByKey(b(), jSONObject.optString(MedalConstants.EVENT_KEY), jSONObject.optString("value"));
            onSuccessCallback(j);
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void writeArrayBuffer(long j, String str) {
        LogUtil.i(this.TAG, "writeArrayBuffer");
        if (c()) {
            onFailureCallback(j, "untrusted");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("uri");
            String strOptString2 = jSONObject.optString("buffer");
            this.e.writeArrayBuffer(StorageUtil.webAppUriToNativePath(this.mContext, b(), strOptString), strOptString2);
            onSuccessCallback(j, str);
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void writeText(long j, String str) {
        LogUtil.i(this.TAG, "writeText");
        if (c()) {
            onFailureCallback(j, "untrusted");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("uri");
            String strOptString2 = jSONObject.optString("text");
            boolean zOptBoolean = jSONObject.optBoolean("isAppend");
            this.e.writeText(StorageUtil.webAppUriToNativePath(this.mContext, b(), strOptString), strOptString2, zOptBoolean);
            onSuccessCallback(j);
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }
}
