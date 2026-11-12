package com.mipay.sdk.app;

import android.R;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.mipay.sdk.util.WBH5FaceVerifySDK;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;

/* JADX INFO: loaded from: classes.dex */
public class SDKWebChromeClient extends WebChromeClient {
    private static final String ACCEPT_TYPE_IMAGE = "image/";
    private static final String ACCEPT_TYPE_IMAGE_ALL = "image/*";
    private static final String ACCEPT_TYPE_IMAGE_CAMERA = "image/camera";
    private static final String ACCEPT_TYPE_VIDEO = "video/";
    private static final String ACCEPT_TYPE_VIDEO_ALL = "video/*";
    private static final String ACCEPT_TYPE_VIDEO_CAMERA = "video/camera";
    private static final String TAG = "webChromeClient";
    MipayWebActivity mActivity;
    private MipayWebActivity.ResultCallback mCallback;
    private Uri mCameraImageUri;
    private ValueCallback<Uri[]> mUploadCallbackAboveL;
    private ValueCallback<Uri> mUploadMessage;
    private static final String[] LIVE_MODE_PERMS = {"android.permission.CAMERA"};
    private static final String[] IMAGE_SELECTOR_PERMS = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    private static final String[] RECORD_MODE_PERMS = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"};

    public SDKWebChromeClient(MipayWebActivity mipayWebActivity) {
        MipayWebActivity.ResultCallback resultCallback = new MipayWebActivity.ResultCallback() { // from class: com.mipay.sdk.app.SDKWebChromeClient.10
            @Override // com.mipay.sdk.app.MipayWebActivity.ResultCallback
            public void onResult(int i, int i2, Intent intent) {
                if (i == 1001) {
                    Uri data = (i2 != -1 || intent == null) ? null : intent.getData();
                    if (data == null && SDKWebChromeClient.this.mCameraImageUri != null && i2 == -1) {
                        data = SDKWebChromeClient.this.mCameraImageUri;
                    }
                    SDKWebChromeClient.this.doFileChooserCallback(data);
                }
            }
        };
        this.mCallback = resultCallback;
        this.mActivity = mipayWebActivity;
        mipayWebActivity.addResultCallback(resultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent createImageCaptureIntent(Uri uri, int i) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.addFlags(3);
        intent.putExtra("android.intent.extras.CAMERA_FACING", i);
        intent.putExtra("output", uri);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent createOpenableIntent() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent createVideoCaptureIntent(int i) {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        intent.setFlags(3);
        intent.putExtra("android.intent.extras.CAMERA_FACING", i);
        intent.putExtra("android.intent.extra.videoQuality", 1);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doFileChooserCallback(Uri uri) {
        ValueCallback<Uri[]> valueCallback = this.mUploadCallbackAboveL;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uri == null ? null : new Uri[]{uri});
            this.mUploadCallbackAboveL = null;
            return;
        }
        ValueCallback<Uri> valueCallback2 = this.mUploadMessage;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(uri);
            this.mUploadMessage = null;
        }
    }

    private void doOpenFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        doFileChooserCallback(null);
        setUploadMessage(valueCallback);
        open(str, !TextUtils.isEmpty(str2), SceneRecogBroadcastReceiver.FROM_USER.equals(str2) ? 1 : 0);
    }

    @RequiresApi(api = 21)
    private boolean doShowFileChooser(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        int i = 0;
        String str = (acceptTypes == null || acceptTypes.length <= 0) ? null : acceptTypes[0];
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        doFileChooserCallback(null);
        setUploadCallbackAboveL(valueCallback);
        if (str != null && str.endsWith("-front")) {
            i = 1;
        }
        return open(str, fileChooserParams.isCaptureEnabled(), i);
    }

    private void doWebankRecordVideo(final ValueCallback<Uri> valueCallback, final String str) {
        RequestPermissionActivity.request(this.mActivity, new RequestPermissionActivity.IPermCallback() { // from class: com.mipay.sdk.app.SDKWebChromeClient.3
            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public String[] getPermissions() {
                return new String[]{"android.permission.CAMERA"};
            }

            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public void onDenied(String[] strArr) {
                WBH5FaceVerifySDK.getInstance().resetReceive();
            }

            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public void onGranted() {
                WBH5FaceVerifySDK.getInstance().recordVideoForApiBelow21(valueCallback, str, SDKWebChromeClient.this.mActivity);
            }
        });
    }

    private void doWebankRecordVideoFor21(final WebView webView, final ValueCallback<Uri[]> valueCallback, final WebChromeClient.FileChooserParams fileChooserParams) {
        RequestPermissionActivity.request(this.mActivity, new RequestPermissionActivity.IPermCallback() { // from class: com.mipay.sdk.app.SDKWebChromeClient.4
            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public String[] getPermissions() {
                return new String[]{"android.permission.CAMERA"};
            }

            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public void onDenied(String[] strArr) {
                WBH5FaceVerifySDK.getInstance().resetReceive();
            }

            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public void onGranted() {
                WBH5FaceVerifySDK.getInstance().recordVideoForApi21(webView, valueCallback, SDKWebChromeClient.this.mActivity, fileChooserParams);
            }
        });
    }

    private boolean open(String str, boolean z, int i) {
        if ((z && str != null && str.startsWith(ACCEPT_TYPE_IMAGE)) || (str != null && str.startsWith(ACCEPT_TYPE_IMAGE_CAMERA))) {
            takePhoto(i);
            return true;
        }
        if ((z && str != null && str.startsWith(ACCEPT_TYPE_VIDEO)) || (str != null && str.startsWith(ACCEPT_TYPE_VIDEO_CAMERA))) {
            recordVideo(i);
            return true;
        }
        if (str != null && str.startsWith(ACCEPT_TYPE_IMAGE)) {
            openAlbumAndImageCaptureChooser(ACCEPT_TYPE_IMAGE_ALL, i);
            return true;
        }
        if (str == null || !str.startsWith(ACCEPT_TYPE_VIDEO)) {
            return false;
        }
        openAlbumAndVideoCaptureChooser(ACCEPT_TYPE_VIDEO_ALL, i);
        return true;
    }

    private void openAlbumAndImageCaptureChooser(final String str, final int i) {
        RequestPermissionActivity.request(this.mActivity, new RequestPermissionActivity.IPermCallback() { // from class: com.mipay.sdk.app.SDKWebChromeClient.8
            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public String[] getPermissions() {
                return (Build.VERSION.SDK_INT < 33 || SDKWebChromeClient.this.mActivity.getApplicationInfo().targetSdkVersion < 33) ? new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"} : new String[]{"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES"};
            }

            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public void onDenied(String[] strArr) {
                SDKWebChromeClient.this.doFileChooserCallback(null);
            }

            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public void onGranted() {
                Intent intent = new Intent("android.intent.action.PICK");
                Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                intent.setDataAndType(uri, str);
                Uri uriInsert = SDKWebChromeClient.this.mActivity.getContentResolver().insert(uri, new ContentValues());
                Intent intentCreateImageCaptureIntent = SDKWebChromeClient.this.createImageCaptureIntent(uriInsert, i);
                Intent intentCreateOpenableIntent = SDKWebChromeClient.this.createOpenableIntent();
                Intent intentCreateChooser = Intent.createChooser(intent, "");
                intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intentCreateImageCaptureIntent, intentCreateOpenableIntent});
                SDKWebChromeClient.this.mCameraImageUri = uriInsert;
                SDKWebChromeClient.this.mActivity.startActivityForResult(intentCreateChooser, 1001);
            }
        });
    }

    private void openAlbumAndVideoCaptureChooser(final String str, final int i) {
        RequestPermissionActivity.request(this.mActivity, new RequestPermissionActivity.IPermCallback() { // from class: com.mipay.sdk.app.SDKWebChromeClient.9
            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public String[] getPermissions() {
                return (Build.VERSION.SDK_INT < 33 || SDKWebChromeClient.this.mActivity.getApplicationInfo().targetSdkVersion < 33) ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"} : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_MEDIA_VIDEO"};
            }

            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public void onDenied(String[] strArr) {
                SDKWebChromeClient.this.doFileChooserCallback(null);
            }

            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public void onGranted() {
                Intent intent = new Intent("android.intent.action.PICK");
                intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, str);
                Intent intentCreateVideoCaptureIntent = SDKWebChromeClient.this.createVideoCaptureIntent(i);
                Intent intentCreateOpenableIntent = SDKWebChromeClient.this.createOpenableIntent();
                Intent intentCreateChooser = Intent.createChooser(intent, "");
                intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intentCreateVideoCaptureIntent, intentCreateOpenableIntent});
                SDKWebChromeClient.this.mCameraImageUri = null;
                SDKWebChromeClient.this.mActivity.startActivityForResult(intentCreateChooser, 1001);
            }
        });
    }

    private void recordVideo(final int i) {
        RequestPermissionActivity.request(this.mActivity, new RequestPermissionActivity.IPermCallback() { // from class: com.mipay.sdk.app.SDKWebChromeClient.7
            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public String[] getPermissions() {
                return (Build.VERSION.SDK_INT < 33 || SDKWebChromeClient.this.mActivity.getApplicationInfo().targetSdkVersion < 33) ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"} : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_MEDIA_VIDEO"};
            }

            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public void onDenied(String[] strArr) {
                SDKWebChromeClient.this.doFileChooserCallback(null);
            }

            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public void onGranted() {
                Intent intentCreateVideoCaptureIntent = SDKWebChromeClient.this.createVideoCaptureIntent(i);
                SDKWebChromeClient.this.mCameraImageUri = null;
                SDKWebChromeClient.this.mActivity.startActivityForResult(intentCreateVideoCaptureIntent, 1001);
            }
        });
    }

    private void setUploadCallbackAboveL(ValueCallback<Uri[]> valueCallback) {
        this.mUploadCallbackAboveL = valueCallback;
    }

    private void setUploadMessage(ValueCallback<Uri> valueCallback) {
        this.mUploadMessage = valueCallback;
    }

    private void takePhoto(final int i) {
        RequestPermissionActivity.request(this.mActivity, new RequestPermissionActivity.IPermCallback() { // from class: com.mipay.sdk.app.SDKWebChromeClient.6
            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public String[] getPermissions() {
                return (Build.VERSION.SDK_INT < 33 || SDKWebChromeClient.this.mActivity.getApplicationInfo().targetSdkVersion < 33) ? new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"} : new String[]{"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES"};
            }

            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public void onDenied(String[] strArr) {
                SDKWebChromeClient.this.doFileChooserCallback(null);
            }

            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public void onGranted() {
                Uri uriInsert = SDKWebChromeClient.this.mActivity.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new ContentValues());
                Intent intentCreateImageCaptureIntent = SDKWebChromeClient.this.createImageCaptureIntent(uriInsert, i);
                SDKWebChromeClient.this.mCameraImageUri = uriInsert;
                SDKWebChromeClient.this.mActivity.startActivityForResult(intentCreateImageCaptureIntent, 1001);
            }
        });
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.mActivity, 3);
        builder.setMessage(str2);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.mipay.sdk.app.SDKWebChromeClient.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.confirm();
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.mipay.sdk.app.SDKWebChromeClient.2
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                jsResult.cancel();
            }
        });
        builder.show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(final PermissionRequest permissionRequest) {
        if (permissionRequest.getOrigin() == null || !WBH5FaceVerifySDK.getInstance().isTencentH5FaceVerify(permissionRequest.getOrigin().toString())) {
            return;
        }
        RequestPermissionActivity.request(this.mActivity, new RequestPermissionActivity.IPermCallback() { // from class: com.mipay.sdk.app.SDKWebChromeClient.5
            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public String[] getPermissions() {
                return SDKWebChromeClient.LIVE_MODE_PERMS;
            }

            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public void onDenied(String[] strArr) {
                permissionRequest.deny();
            }

            @Override // com.mipay.sdk.app.RequestPermissionActivity.IPermCallback
            public void onGranted() {
                PermissionRequest permissionRequest2 = permissionRequest;
                permissionRequest2.grant(permissionRequest2.getResources());
            }
        });
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        MipayWebActivity mipayWebActivity = this.mActivity;
        if (mipayWebActivity != null) {
            mipayWebActivity.setTitle(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    @RequiresApi(api = 21)
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (!WBH5FaceVerifySDK.getInstance().isTencentH5FaceVerify(webView, fileChooserParams, null)) {
            if (doShowFileChooser(valueCallback, fileChooserParams)) {
                return true;
            }
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        WBH5FaceVerifySDK.getInstance().resetReceive();
        WBH5FaceVerifySDK.getInstance().setUploadCallbackAboveL(valueCallback);
        doWebankRecordVideoFor21(webView, valueCallback, fileChooserParams);
        return true;
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        if (!WBH5FaceVerifySDK.getInstance().isTencentH5FaceVerify(null, null, str)) {
            doOpenFileChooser(valueCallback, str, str2);
            return;
        }
        WBH5FaceVerifySDK.getInstance().resetReceive();
        WBH5FaceVerifySDK.getInstance().setUploadMessage(valueCallback);
        doWebankRecordVideo(valueCallback, str);
    }
}
