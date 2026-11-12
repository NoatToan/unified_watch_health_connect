package com.huawei.health.h5pro.webkit;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogPrintOperate;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.utils.PermissionUtil;
import com.huawei.health.h5pro.vengine.H5ProAppLoadListener;
import com.huawei.health.h5pro.webkit.trustlist.H5ProTrustListChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
class H5ProWebChromeClient extends WebChromeClient {
    private static final int FILE_CHOOSER_RESULT_CODE = 51;
    private static final int REQUEST_CODE = 1001;
    private static final int REQUEST_CODE_PERMISSION_FILE_CHOOSER = 1002;
    private final Context mContext;
    private WebChromeClient.FileChooserParams mFileChooserParams;
    private final H5ProAppLoadListener mH5ProAppLoadListener;
    private PermissionRequest mPermissionRequest;
    private String[] mRequestResources;
    private ValueCallback<Uri[]> mUploadMessage;
    private final WebKitInstance mWebKitInstance;
    private WeakReference<WebChromeCustomViewListener> mWrWebChromeCustomViewListener;

    H5ProWebChromeClient(Context context, WebKitInstance webKitInstance, H5ProAppLoadListener h5ProAppLoadListener) {
        this.mContext = context;
        this.mWebKitInstance = webKitInstance;
        this.mH5ProAppLoadListener = h5ProAppLoadListener;
    }

    private String getTag() {
        return LogUtil.getTag(this.mWebKitInstance, "WebChromeClient");
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        WebKitInstance webKitInstance = this.mWebKitInstance;
        LogUtil.i(String.format(Locale.ROOT, "H5PRO_AppLog[%s]", webKitInstance != null ? webKitInstance.getAppFlag() : ""), LogPrintOperate.isDecodePrint(this.mWebKitInstance), consoleMessage.message());
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        LogUtil.i(getTag(), "onReceivedTitle: " + str);
        if (!this.mWebKitInstance.isTitleValid(str)) {
            str = "";
        }
        this.mWebKitInstance.updateTitle(str);
        this.mH5ProAppLoadListener.onReceiveTitle(this.mWebKitInstance, str);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        LogUtil.i(getTag(), String.format(Locale.ROOT, "onProgressChanged: %s", Integer.valueOf(i)));
        if (WebKitUtil.e(webView.getUrl())) {
            this.mH5ProAppLoadListener.onProgressChanged(this.mWebKitInstance, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        callback.invoke(str, PermissionUtil.getInstance().checkPermission(this.mContext, new String[]{"android.permission.ACCESS_FINE_LOCATION"}) || PermissionUtil.getInstance().checkPermission(this.mContext, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}), false);
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        String[] resources;
        if (permissionRequest == null || (resources = permissionRequest.getResources()) == null || resources.length == 0) {
            return;
        }
        if (!H5ProTrustListChecker.isTrusted(this.mWebKitInstance)) {
            LogUtil.w(getTag(), "onPermissionRequest: untrusted");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : resources) {
            if (TextUtils.equals("android.webkit.resource.AUDIO_CAPTURE", str) || TextUtils.equals("android.webkit.resource.VIDEO_CAPTURE", str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (PermissionUtil.getInstance().checkWebKitPermission(this.mContext, strArr)) {
            permissionRequest.grant(strArr);
        } else if (this.mContext instanceof Activity) {
            this.mPermissionRequest = permissionRequest;
            this.mRequestResources = strArr;
            PermissionUtil.getInstance().requestWebKitPermission((Activity) this.mContext, this.mRequestResources, 1001);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        WebChromeCustomViewListener webChromeCustomViewListener = (WebChromeCustomViewListener) GeneralUtil.getReferent(this.mWrWebChromeCustomViewListener);
        if (webChromeCustomViewListener != null) {
            webChromeCustomViewListener.onShowCustomView(view, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        WebChromeCustomViewListener webChromeCustomViewListener = (WebChromeCustomViewListener) GeneralUtil.getReferent(this.mWrWebChromeCustomViewListener);
        if (webChromeCustomViewListener != null) {
            webChromeCustomViewListener.onHideCustomView();
        }
        super.onHideCustomView();
    }

    public void setCustomViewListener(WebChromeCustomViewListener webChromeCustomViewListener) {
        this.mWrWebChromeCustomViewListener = new WeakReference<>(webChromeCustomViewListener);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        LogUtil.i(getTag(), "onShowFileChooser: enter");
        this.mUploadMessage = valueCallback;
        Context context = this.mContext;
        if (context == null || !(context instanceof Activity)) {
            LogUtil.i(getTag(), "onShowFileChooser: mH5proContext is null or is not activity");
            returnNoFileChooser();
            return false;
        }
        final WeakReference weakReference = new WeakReference((Activity) this.mContext);
        this.mFileChooserParams = fileChooserParams;
        PermissionUtil.getInstance().checkAndRequestPermissions((Activity) weakReference.get(), PermissionUtil.f7000b, 1002, new H5ProPermissionCallback() { // from class: com.huawei.health.h5pro.webkit.H5ProWebChromeClient.3
            @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
            public void onGranted() {
                H5ProWebChromeClient.this.showFileChooser((Activity) weakReference.get());
            }

            @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
            public void onDenied(String str) {
                H5ProWebChromeClient.this.returnNoFileChooser();
            }

            @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
            public void onForeverDenied(String[] strArr) {
                H5ProWebChromeClient.this.returnNoFileChooser();
            }
        });
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Uri[] uriArr;
        LogUtil.i(getTag(), "onActivityResult: requestCode=" + i + " resultCode=" + i2 + " data=" + intent);
        if (i != 51 || this.mUploadMessage == null) {
            return;
        }
        if (i2 == -1) {
            if (intent == null) {
                returnNoFileChooser();
                return;
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                uriArr = new Uri[clipData.getItemCount()];
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    uriArr[i3] = clipData.getItemAt(i3).getUri();
                    LogUtil.i(getTag(), "result: ", uriArr[i3].getPath());
                }
            } else {
                String dataString = intent.getDataString();
                uriArr = !TextUtils.isEmpty(dataString) ? new Uri[]{Uri.parse(dataString)} : null;
            }
            ArrayList arrayList = new ArrayList();
            if (uriArr != null && uriArr.length > 0) {
                for (Uri uri : uriArr) {
                    if (WebKitUtil.checkResultUriIsValid(this.mContext, uri)) {
                        arrayList.add(uri);
                    }
                }
            }
            this.mUploadMessage.onReceiveValue((Uri[]) arrayList.toArray(new Uri[0]));
        } else if (i2 == 0) {
            returnNoFileChooser();
        }
        this.mUploadMessage = null;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Context context;
        PermissionRequest permissionRequest;
        String[] strArr2;
        if (i == 1001 || i == 1002) {
            int length = iArr.length;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = true;
                    break;
                } else if (iArr[i2] != 0) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i == 1001) {
                if (z && (permissionRequest = this.mPermissionRequest) != null && (strArr2 = this.mRequestResources) != null) {
                    permissionRequest.grant(strArr2);
                }
                this.mPermissionRequest = null;
                this.mRequestResources = null;
                return;
            }
            if (i == 1002) {
                if (z && (context = this.mContext) != null && (context instanceof Activity)) {
                    showFileChooser((Activity) context);
                } else {
                    returnNoFileChooser();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFileChooser(Activity activity) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        WebChromeClient.FileChooserParams fileChooserParams = this.mFileChooserParams;
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", fileChooserParams != null && fileChooserParams.getMode() == 1);
        ArrayList arrayList = new ArrayList(1);
        WebChromeClient.FileChooserParams fileChooserParams2 = this.mFileChooserParams;
        if (fileChooserParams2 != null && fileChooserParams2.getAcceptTypes() != null && this.mFileChooserParams.getAcceptTypes().length > 0) {
            for (String str : this.mFileChooserParams.getAcceptTypes()) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList.isEmpty()) {
            intent.setType("*/*");
        } else {
            intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) arrayList.toArray(new String[0]));
            intent.setType(String.join(",", arrayList));
        }
        LogUtil.i(getTag(), "showFileChooser: types -> " + arrayList);
        if (activity == null) {
            LogUtil.w(getTag(), "showFileChooser: activity is null");
        } else {
            activity.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 51);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void returnNoFileChooser() {
        ValueCallback<Uri[]> valueCallback = this.mUploadMessage;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        this.mUploadMessage = null;
    }
}
