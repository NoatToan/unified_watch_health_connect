package com.huawei.health.h5pro.jsbridge.system.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.health.h5pro.core.b;
import com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback;
import com.huawei.health.h5pro.jsbridge.ErrorEnum;
import com.huawei.health.h5pro.jsbridge.system.storage.FileMeta;
import com.huawei.health.h5pro.jsbridge.system.storage.StorageUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.utils.PermissionUtil;
import com.huawei.health.h5pro.webkit.WebKitUtil;
import com.huawei.hms.hmsscankit.ScanUtil;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.huawei.openalliance.ad.constant.IntentFailError;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class AndroidMedia implements Media {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Callback f6803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.huawei.health.h5pro.jsbridge.Callback f6804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f6805c;
    private String d;
    private boolean e = false;

    public interface Callback {
        void onFailure(String str);

        void onSuccess(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(this.d);
        activity.startActivityForResult(intent, 12);
    }

    private void b(int i, Intent intent) throws Throwable {
        com.huawei.health.h5pro.jsbridge.Callback callback = this.f6804b;
        if (callback == null) {
            LogUtil.w("H5PRO_AndroidMedia", "chooseFileCallback: mChooseFileCallback is null");
            return;
        }
        if (i == 0) {
            callback.onFailure(ErrorEnum.CANCELED);
            return;
        }
        if (i != -1 || intent == null) {
            callback.onFailure("choose file fail");
            return;
        }
        try {
            Uri data = intent.getData();
            if (!WebKitUtil.checkResultUriIsValid(this.f6805c, data)) {
                this.f6804b.onFailure("get file path fail");
                return;
            }
            FileMeta uriToFileMeta = StorageUtil.parseUriToFileMeta(data, this.f6805c);
            if (!uriToFileMeta.isExist()) {
                LogUtil.e("H5PRO_AndroidMedia", "chooseFileCallback: chosen file not exit. ");
                this.f6804b.onFailure("chosen file not exit. ");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uri", uriToFileMeta.getAbsolutePath());
            jSONObject.put(ContentResource.FILE_NAME, uriToFileMeta.getName());
            jSONObject.put("size", uriToFileMeta.getSize());
            jSONObject.put("dateAdded", uriToFileMeta.getDateAdded());
            jSONObject.put("mimeType", uriToFileMeta.getMimeType());
            this.f6804b.onSuccess(jSONObject);
            this.f6804b = null;
        } catch (JSONException e) {
            LogUtil.e("H5PRO_AndroidMedia", b.a(e, new StringBuilder("chooseFileCallback: ")));
            this.f6804b.onFailure(e.getMessage());
        }
    }

    private void b(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i);
            jSONObject.put("qrcode", str);
            Callback callback = this.f6803a;
            if (callback == null) {
                LogUtil.w("H5PRO_AndroidMedia", "scanSuccessCallback: mScanCallback is null");
            } else {
                callback.onSuccess(jSONObject);
                this.f6803a = null;
            }
        } catch (JSONException unused) {
            e("build result json exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!(this.f6805c instanceof Activity)) {
            LogUtil.w("H5PRO_AndroidMedia", "startScan: Illegal mH5proContext");
            return;
        }
        try {
            ScanUtil.startScan((Activity) this.f6805c, 120, new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(HmsScan.QRCODE_SCAN_TYPE, HmsScan.DATAMATRIX_SCAN_TYPE).setErrorCheck(true).setShowGuide(true).create());
        } catch (NullPointerException e) {
            LogUtil.e("H5PRO_AndroidMedia", "startScan: exception -> " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String[] strArr) {
        if (strArr == PermissionUtil.f6999a) {
            d();
        } else {
            this.e = false;
            e(IntentFailError.NO_PERMISSION);
        }
    }

    private void e(Callback callback, final String[] strArr) {
        if (this.e) {
            return;
        }
        synchronized (AndroidMedia.class) {
            this.f6803a = callback;
            boolean z = true;
            this.e = true;
            if (strArr == PermissionUtil.f6999a) {
                z = false;
            }
            PermissionUtil.getInstance().checkAndRequestPermissions((Activity) this.f6805c, strArr, 86, z, new H5ProPermissionCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.media.AndroidMedia.1
                @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
                public void onDenied(String str) {
                    AndroidMedia.this.d(strArr);
                }

                @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
                public void onForeverDenied(String[] strArr2) {
                    AndroidMedia.this.d(strArr2);
                }

                @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
                public void onGranted() {
                    AndroidMedia.this.d();
                }
            });
        }
    }

    private void e(String str) {
        Callback callback = this.f6803a;
        if (callback == null) {
            LogUtil.w("H5PRO_AndroidMedia", "scanFailCallback: mScanCallback is null");
        } else {
            callback.onFailure(str);
            this.f6803a = null;
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.media.Media
    public void chooseFile(String str, com.huawei.health.h5pro.jsbridge.Callback callback) {
        if (callback == null) {
            LogUtil.w("H5PRO_AndroidMedia", "chooseFile: chooseFileCallback is null");
            return;
        }
        this.f6804b = callback;
        this.d = str;
        Context context = this.f6805c;
        if (context == null) {
            LogUtil.e("H5PRO_AndroidMedia", "chooseFile: mContext is null");
            callback.onFailure(ErrorEnum.DEFAULT_ERROR.getCode(), "chooseFile: mContext is null");
        } else {
            final Activity activity = (Activity) context;
            PermissionUtil.getInstance().checkAndRequestPermissions(activity, PermissionUtil.f7000b, 12, new H5ProPermissionCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.media.AndroidMedia.3
                @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
                public void onDenied(String str2) {
                    if (AndroidMedia.this.f6804b != null) {
                        AndroidMedia.this.f6804b.onFailure(ErrorEnum.NO_PERMISSION);
                    }
                }

                @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
                public void onForeverDenied(String[] strArr) {
                    if (AndroidMedia.this.f6804b != null) {
                        AndroidMedia.this.f6804b.onFailure(ErrorEnum.NO_PERMISSION);
                    }
                }

                @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
                public void onGranted() {
                    AndroidMedia.this.a(activity);
                }
            });
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.media.Media
    public void destroy() {
        if (this.f6805c == null) {
            return;
        }
        this.f6805c = null;
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.media.Media
    public void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        LogUtil.i("H5PRO_AndroidMedia", "requestCode=" + i + " resultCode=" + i2 + " data=" + intent);
        if (i != 120) {
            if (i == 12) {
                b(i2, intent);
                return;
            }
            return;
        }
        this.e = false;
        if (intent == null) {
            e("scanner data is null");
            return;
        }
        if (intent.getIntExtra(ScanUtil.RESULT_CODE, 0) == 2) {
            e(this.f6803a, PermissionUtil.f7000b);
            return;
        }
        HmsScan hmsScan = (HmsScan) intent.getParcelableExtra(ScanUtil.RESULT);
        if (hmsScan == null) {
            e("scanner result is null");
        } else {
            b(hmsScan.getScanType(), hmsScan.getOriginalValue());
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.media.Media
    public void onMount(Context context) {
        this.f6805c = context;
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.media.Media
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 86) {
            if (PermissionUtil.getInstance().isAllPermitted(iArr)) {
                d();
                return;
            } else {
                this.e = false;
                e(IntentFailError.NO_PERMISSION);
                return;
            }
        }
        if (i == 12) {
            if (PermissionUtil.getInstance().isAllPermitted(iArr)) {
                a((Activity) this.f6805c);
                return;
            }
            com.huawei.health.h5pro.jsbridge.Callback callback = this.f6804b;
            if (callback != null) {
                callback.onFailure(ErrorEnum.NO_PERMISSION);
            }
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.media.Media
    public void scanQrCode(Callback callback) {
        if (callback == null) {
            return;
        }
        e(callback, PermissionUtil.f6999a);
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.media.Media
    public void uploadPicture(String str) {
    }
}
