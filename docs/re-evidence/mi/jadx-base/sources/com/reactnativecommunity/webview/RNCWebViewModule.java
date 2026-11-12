package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.core.content.FileProvider;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import defpackage.gsh;
import defpackage.ndj;
import defpackage.ni4;
import defpackage.prh;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = RNCWebViewModule.MODULE_NAME)
public class RNCWebViewModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int FILE_DOWNLOAD_PERMISSION_REQUEST = 1;
    public static final String MODULE_NAME = "RNCWebView";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    final String DEFAULT_MIME_TYPES;
    private DownloadManager.Request downloadRequest;
    private ValueCallback<Uri[]> filePathCallback;
    private ValueCallback<Uri> filePathCallbackLegacy;
    private Uri outputFileUri;
    private gsh webviewFileDownloaderPermissionListener;

    public class a implements gsh {
        public a() {
        }

        @Override // defpackage.gsh
        public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            if (i != 1) {
                return false;
            }
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(RNCWebViewModule.this.getCurrentActivity().getApplicationContext(), "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.", 1).show();
            } else if (RNCWebViewModule.this.downloadRequest != null) {
                RNCWebViewModule.this.downloadFile();
            }
            return true;
        }
    }

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.DEFAULT_MIME_TYPES = "*/*";
        this.webviewFileDownloaderPermissionListener = new a();
        reactApplicationContext.addActivityEventListener(this);
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("image"));
    }

    private Boolean acceptsVideo(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("video"));
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (isArrayEmpty(strArr).booleanValue()) {
            return new String[]{"*/*"};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.matches("\\.\\w+")) {
                strArr2[i] = getMimeTypeFromExtension(str.replace(".", ""));
            } else {
                strArr2[i] = str;
            }
        }
        return strArr2;
    }

    private File getCapturedFile(String str) throws IOException {
        String str2;
        String str3;
        if (str.equals("android.media.action.IMAGE_CAPTURE")) {
            String str4 = Environment.DIRECTORY_PICTURES;
            str2 = "image-";
            str3 = ".jpg";
        } else if (str.equals("android.media.action.VIDEO_CAPTURE")) {
            String str5 = Environment.DIRECTORY_MOVIES;
            str2 = "video-";
            str3 = ".mp4";
        } else {
            str2 = "";
            str3 = "";
        }
        return File.createTempFile(str2 + String.valueOf(System.currentTimeMillis()) + str3, str3, getReactApplicationContext().getExternalFilesDir(null));
    }

    private Intent getFileChooserIntent(String str) {
        String mimeTypeFromExtension = str.isEmpty() ? "*/*" : str;
        if (str.matches("\\.\\w+")) {
            mimeTypeFromExtension = getMimeTypeFromExtension(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(mimeTypeFromExtension);
        return intent;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(String str) {
        File capturedFile;
        try {
            capturedFile = getCapturedFile(str);
        } catch (IOException e) {
            e.printStackTrace();
            capturedFile = null;
        }
        String packageName = getReactApplicationContext().getPackageName();
        return FileProvider.getUriForFile(getReactApplicationContext(), packageName + ".fileprovider", capturedFile);
    }

    private prh getPermissionAwareActivity() {
        ComponentCallbacks2 currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof prh) {
            return (prh) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    private Intent getPhotoIntent() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Uri outputUri = getOutputUri("android.media.action.IMAGE_CAPTURE");
        this.outputFileUri = outputUri;
        intent.putExtra("output", outputUri);
        return intent;
    }

    private Uri[] getSelectedFiles(Intent intent, int i) {
        Uri[] uriArr = null;
        if (intent == null) {
            return null;
        }
        if (intent.getData() != null) {
            if (i == -1) {
                return WebChromeClient.FileChooserParams.parseResult(i, intent);
            }
            return null;
        }
        if (intent.getClipData() != null) {
            int itemCount = intent.getClipData().getItemCount();
            uriArr = new Uri[itemCount];
            for (int i2 = 0; i2 < itemCount; i2++) {
                uriArr[i2] = intent.getClipData().getItemAt(i2).getUri();
            }
        }
        return uriArr;
    }

    private Intent getVideoIntent() {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        Uri outputUri = getOutputUri("android.media.action.VIDEO_CAPTURE");
        this.outputFileUri = outputUri;
        intent.putExtra("output", outputUri);
        return intent;
    }

    private Boolean isArrayEmpty(String[] strArr) {
        boolean z = true;
        if (strArr.length != 0 && (strArr.length != 1 || strArr[0].length() != 0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void downloadFile() {
        ((DownloadManager) getCurrentActivity().getBaseContext().getSystemService("download")).enqueue(this.downloadRequest);
        Toast.makeText(getCurrentActivity().getApplicationContext(), "Downloading", 1).show();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public boolean grantFileDownloaderPermissions() {
        boolean z = ni4.a(getCurrentActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (!z) {
            getPermissionAwareActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, this.webviewFileDownloaderPermissionListener);
        }
        return z;
    }

    @ReactMethod
    public void isFileUploadSupported(Promise promise) {
        promise.resolve(Boolean.TRUE);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Uri data;
        ValueCallback<Uri[]> valueCallback = this.filePathCallback;
        if (valueCallback == null && this.filePathCallbackLegacy == null) {
            return;
        }
        if (i != 1) {
            if (i == 3) {
                if (i2 != -1) {
                    data = null;
                } else {
                    data = intent == null ? this.outputFileUri : intent.getData();
                }
                this.filePathCallbackLegacy.onReceiveValue(data);
            }
        } else if (i2 == -1) {
            Uri[] selectedFiles = getSelectedFiles(intent, i2);
            if (selectedFiles != null) {
                this.filePathCallback.onReceiveValue(selectedFiles);
            } else {
                this.filePathCallback.onReceiveValue(new Uri[]{this.outputFileUri});
            }
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        this.filePathCallback = null;
        this.filePathCallbackLegacy = null;
        this.outputFileUri = null;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.downloadRequest = request;
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        this.filePathCallbackLegacy = valueCallback;
        Intent intentCreateChooser = Intent.createChooser(getFileChooserIntent(str), "");
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(str).booleanValue()) {
            arrayList.add(getPhotoIntent());
        }
        if (acceptsVideo(str).booleanValue()) {
            arrayList.add(getVideoIntent());
        }
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intentCreateChooser.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(intentCreateChooser, 3);
        }
    }

    private Boolean acceptsImages(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(isArrayEmpty(acceptedMimeType).booleanValue() || arrayContainsString(acceptedMimeType, "image").booleanValue());
    }

    private Boolean acceptsVideo(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(isArrayEmpty(acceptedMimeType).booleanValue() || arrayContainsString(acceptedMimeType, "video").booleanValue());
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        return intent;
    }

    @RequiresApi(api = 21)
    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, Intent intent, String[] strArr, boolean z) {
        this.filePathCallback = valueCallback;
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(strArr).booleanValue()) {
            arrayList.add(getPhotoIntent());
        }
        if (acceptsVideo(strArr).booleanValue()) {
            arrayList.add(getVideoIntent());
        }
        Intent fileChooserIntent = getFileChooserIntent(strArr, z);
        Intent intent2 = new Intent("android.intent.action.CHOOSER");
        intent2.putExtra("android.intent.extra.INTENT", fileChooserIntent);
        intent2.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intent2.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(intent2, 1);
        }
        return true;
    }
}
