package com.huawei.health.h5pro.jsbridge.system.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback;
import com.huawei.health.h5pro.jsbridge.ErrorEnum;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.utils.PermissionUtil;
import com.huawei.health.h5pro.webkit.WebKitUtil;
import com.huawei.operation.utils.Constants;
import defpackage.exk;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class AlbumChooserOperate extends exk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnAlbumChooserCallback f6802b;

    public interface OnAlbumChooserCallback {
        void onFailure(int i, String str);

        void onSuccess(Uri... uriArr);
    }

    public AlbumChooserOperate(Activity activity) {
        super(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            Intent intent = new Intent("android.intent.action.PICK", (Uri) null);
            intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Constants.IMAGE_TYPE);
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f6801a);
            this.e.startActivityForResult(intent, 10003);
        } catch (ActivityNotFoundException e) {
            LogUtil.w("H5PRO_MediaOperate", "openAlbum: exception -> " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        OnAlbumChooserCallback onAlbumChooserCallback = this.f6802b;
        if (onAlbumChooserCallback == null) {
            LogUtil.w("H5PRO_MediaOperate", "noPermissionOpenCallback: mOnAlbumChooserCallback is null");
        } else {
            onAlbumChooserCallback.onFailure(ErrorEnum.NO_PERMISSION.getCode(), "no permission to open album");
        }
    }

    public void c(boolean z, OnAlbumChooserCallback onAlbumChooserCallback) {
        this.f6801a = z;
        this.f6802b = onAlbumChooserCallback;
        PermissionUtil.getInstance().checkAndRequestPermissions(this.e, PermissionUtil.f7000b, 10003, new H5ProPermissionCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.media.AlbumChooserOperate.1
            @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
            public void onDenied(String str) {
                AlbumChooserOperate.this.d();
            }

            @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
            public void onForeverDenied(String[] strArr) {
                AlbumChooserOperate.this.d();
            }

            @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
            public void onGranted() {
                AlbumChooserOperate.this.b();
            }
        });
    }

    @Override // defpackage.exk
    public void d(int i, int i2, Intent intent) {
        super.d(i, i2, intent);
        if (i != 10003) {
            return;
        }
        if (i2 != -1 || intent == null) {
            Locale locale = Locale.ENGLISH;
            LogUtil.w("H5PRO_MediaOperate", "onActivityResult: album selection failed -> " + i2 + " - " + (intent == null));
            OnAlbumChooserCallback onAlbumChooserCallback = this.f6802b;
            if (onAlbumChooserCallback != null) {
                onAlbumChooserCallback.onFailure(-1, "album selection failed, resultCode is " + i2);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        ClipData clipData = intent.getClipData();
        if (clipData == null || clipData.getItemCount() <= 0) {
            Uri data = intent.getData();
            if (WebKitUtil.checkResultUriIsValid(this.e, data)) {
                arrayList.add(data);
            }
        } else {
            for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                Uri uri = clipData.getItemAt(i3).getUri();
                if (WebKitUtil.checkResultUriIsValid(this.e, uri)) {
                    arrayList.add(uri);
                }
            }
        }
        if (arrayList.isEmpty()) {
            LogUtil.w("H5PRO_MediaOperate", "onActivityResult: album selection failed -> uris is null");
            OnAlbumChooserCallback onAlbumChooserCallback2 = this.f6802b;
            if (onAlbumChooserCallback2 != null) {
                onAlbumChooserCallback2.onFailure(-1, "album selection failed");
                return;
            }
            return;
        }
        OnAlbumChooserCallback onAlbumChooserCallback3 = this.f6802b;
        if (onAlbumChooserCallback3 != null) {
            onAlbumChooserCallback3.onSuccess((Uri[]) arrayList.toArray(new Uri[0]));
        } else {
            LogUtil.w("H5PRO_MediaOperate", "onActivityResult: album selection failed -> callback is null");
        }
    }

    @Override // defpackage.exk
    public void d(int i, String[] strArr, int[] iArr) {
        super.d(i, strArr, iArr);
        if (i == 10003) {
            if (PermissionUtil.getInstance().isAllPermitted(iArr)) {
                b();
            } else {
                d();
            }
        }
    }
}
