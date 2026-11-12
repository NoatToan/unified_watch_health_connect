package com.huawei.health.h5pro.jsbridge.system.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.health.h5pro.core.a;
import com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback;
import com.huawei.health.h5pro.jsbridge.ErrorEnum;
import com.huawei.health.h5pro.jsbridge.system.storage.StorageUtil;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.utils.PermissionUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import defpackage.exk;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class TakePictureOperate extends exk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f6842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H5ProMediaScanner f6843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6844c;
    private final H5ProInstance d;
    private String f;
    private OnTakePictureCallback i;
    private File j;

    public interface OnTakePictureCallback {
        void onFailure(int i, String str);

        void onSuccess(String str);
    }

    public TakePictureOperate(Activity activity, H5ProInstance h5ProInstance) {
        super(activity);
        this.f6842a = 1024000L;
        this.f6844c = -1;
        this.d = h5ProInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file) {
        if (file == null) {
            return;
        }
        if (this.f6843b == null) {
            this.f6843b = new H5ProMediaScanner();
        }
        this.f6843b.scanFile(this.e, file.getAbsolutePath(), new String[0], new H5ProMediaScanner.OnScanFileCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.media.TakePictureOperate.1
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                LogUtil.i("H5PRO_MediaOperate", "refreshMedia: onScanCompleted");
                LogUtil.d("H5PRO_MediaOperate", a.a("refreshMedia: onScanCompleted - path -> ", str));
            }

            @Override // com.huawei.health.h5pro.jsbridge.system.media.H5ProMediaScanner.OnScanFileCallback
            public void onScanFailure(String str) {
                LogUtil.i("H5PRO_MediaOperate", "refreshMedia: onScanFailure");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        OnTakePictureCallback onTakePictureCallback = this.i;
        ErrorEnum errorEnum = ErrorEnum.NO_PERMISSION_SPECIAL;
        onTakePictureCallback.onFailure(errorEnum.getCode(), errorEnum.getMsg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        File fileE = e(CommonUtil.getAppId(this.d), "takePicture");
        if (fileE == null || !(fileE.exists() || StorageUtil.ensureDirExists(fileE))) {
            this.i.onFailure(-1, "Failed to create the folder");
            return;
        }
        Locale locale = Locale.ENGLISH;
        this.j = new File(fileE, System.currentTimeMillis() + ".jpg");
        try {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", StorageUtil.getUriFromFile(this.e, this.j));
            intent.addFlags(3);
            this.e.startActivityForResult(intent, 10001);
        } catch (ActivityNotFoundException e) {
            LogUtil.w("H5PRO_MediaOperate", "doTakePicture: exception -> " + e.getMessage());
        }
    }

    private void e() {
        PermissionUtil.getInstance().checkAndRequestPermissions(this.e, PermissionUtil.f6999a, 10001, new H5ProPermissionCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.media.TakePictureOperate.3
            @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
            public void onDenied(String str) {
                TakePictureOperate.this.b();
            }

            @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
            public void onForeverDenied(String[] strArr) {
                TakePictureOperate.this.b();
            }

            @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
            public void onGranted() {
                TakePictureOperate.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(File file) {
        String absolutePath = file.getAbsolutePath();
        if ("BASE64".equalsIgnoreCase(this.f)) {
            absolutePath = MediaUtils.fileToBase64(absolutePath);
        }
        if (TextUtils.isEmpty(absolutePath)) {
            this.i.onFailure(-1, "failed to encrypt the file");
        } else {
            this.i.onSuccess(absolutePath);
        }
    }

    public void c() {
        H5ProMediaScanner h5ProMediaScanner = this.f6843b;
        if (h5ProMediaScanner != null) {
            h5ProMediaScanner.disconnect();
            this.f6843b = null;
        }
    }

    @Override // defpackage.exk
    public void d(int i, int i2, Intent intent) {
        super.d(i, i2, intent);
        if (i != 10001) {
            return;
        }
        if (i2 != -1) {
            LogUtil.i("H5PRO_MediaOperate", "onActivityResult: Failed to take photos -> " + i2);
            File file = this.j;
            if (file != null) {
                b(file);
                a(this.j);
            }
            this.i.onFailure(-1, "failed to take the picture, resultCode is " + i2);
            return;
        }
        File file2 = this.j;
        if (file2 == null) {
            this.i.onFailure(-1, "failed to take the picture, file is null");
            return;
        }
        if (!file2.exists()) {
            this.i.onFailure(-1, "failed to take the picture, file does not exist");
            return;
        }
        if ((this.f6842a < 0 || this.j.length() <= this.f6842a) && this.f6844c <= 0) {
            a(this.j);
            e(this.j);
            return;
        }
        int i3 = this.f6844c;
        if (i3 > 0) {
            BitmapUtils.equalRatioCompress(this.j, i3, true, new BitmapUtils.OnCompressPictureCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.media.TakePictureOperate.4
                @Override // com.huawei.health.h5pro.jsbridge.system.media.BitmapUtils.OnCompressPictureCallback
                public void onFailure(String str) {
                    TakePictureOperate.this.i.onFailure(-1, str);
                }

                @Override // com.huawei.health.h5pro.jsbridge.system.media.BitmapUtils.OnCompressPictureCallback
                public void onSuccess(File file3, String str) {
                    TakePictureOperate.this.a(file3);
                    TakePictureOperate.this.e(file3);
                }
            });
        } else {
            BitmapUtils.compress(this.j, this.f6842a, new BitmapUtils.OnCompressPictureCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.media.TakePictureOperate.5
                @Override // com.huawei.health.h5pro.jsbridge.system.media.BitmapUtils.OnCompressPictureCallback
                public void onFailure(String str) {
                    TakePictureOperate.this.i.onFailure(-1, str);
                }

                @Override // com.huawei.health.h5pro.jsbridge.system.media.BitmapUtils.OnCompressPictureCallback
                public void onSuccess(File file3, String str) {
                    TakePictureOperate.this.a(file3);
                    TakePictureOperate.this.e(file3);
                }
            });
        }
    }

    @Override // defpackage.exk
    public void d(int i, String[] strArr, int[] iArr) {
        super.d(i, strArr, iArr);
        if (i == 10001) {
            if (PermissionUtil.getInstance().isAllPermitted(iArr)) {
                d();
            } else {
                b();
            }
        }
    }

    public void e(String str, long j, int i, OnTakePictureCallback onTakePictureCallback) {
        this.f = str;
        if (j == 0) {
            j = 1024000;
        }
        this.f6842a = j;
        this.f6844c = i;
        this.i = onTakePictureCallback;
        e();
    }
}
