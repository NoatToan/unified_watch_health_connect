package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.h5pro.core.R;
import com.huawei.health.h5pro.core.b;
import com.huawei.health.h5pro.dialog.BaseDialog;
import com.huawei.health.h5pro.jsbridge.Callback;
import com.huawei.health.h5pro.jsbridge.system.media.AlbumChooserOperate;
import com.huawei.health.h5pro.jsbridge.system.media.BitmapUtils;
import com.huawei.health.h5pro.jsbridge.system.media.CropPictureOperate;
import com.huawei.health.h5pro.jsbridge.system.media.MediaUtils;
import com.huawei.health.h5pro.jsbridge.system.media.TakePictureOperate;
import com.huawei.health.h5pro.jsbridge.system.storage.StorageUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import java.io.File;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class exl extends exk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AlbumChooserOperate f33618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H5ProInstance f33619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CropPictureOperate f33620c;
    private TakePictureOperate d;

    public exl(Activity activity, H5ProInstance h5ProInstance) {
        super(activity);
        this.f33619b = h5ProInstance;
    }

    private void a(final String str, final long j, final int i, final boolean z, final Callback callback) {
        final BaseDialog baseDialog = new BaseDialog(this.e);
        baseDialog.contentView(R.layout.dialog_photo).gravity(80).canceledOnTouchOutside(false).show();
        baseDialog.findViewById(R.id.tv_camera).setOnClickListener(new View.OnClickListener() { // from class: exl.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                exl.this.b("camera", str, j, i, z, callback);
                baseDialog.dismiss();
            }
        });
        baseDialog.findViewById(R.id.tv_album).setOnClickListener(new View.OnClickListener() { // from class: exl.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                exl.this.b(MusicSong.SORT_TYPE_ALBUM, str, j, i, z, callback);
                baseDialog.dismiss();
            }
        });
        baseDialog.findViewById(R.id.btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: exl.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                baseDialog.dismiss();
                callback.onFailure("user cancel");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Uri uri, final String str2, final boolean z, final Callback callback) {
        this.d = null;
        this.f33618a = null;
        CropPictureOperate cropPictureOperate = new CropPictureOperate(this.e, this.f33619b);
        this.f33620c = cropPictureOperate;
        cropPictureOperate.a(str, uri, new CropPictureOperate.OnCropPictureCallback() { // from class: exl.9
            @Override // com.huawei.health.h5pro.jsbridge.system.media.CropPictureOperate.OnCropPictureCallback
            public void onFailure(int i, String str3) {
                Locale locale = Locale.ENGLISH;
                LogUtil.w("H5PRO_MediaOperate", "cropPicture: onFailure -> " + i + " - " + str3);
                callback.onFailure(i, str3);
                exl.this.d(str2);
            }

            @Override // com.huawei.health.h5pro.jsbridge.system.media.CropPictureOperate.OnCropPictureCallback
            public void onSuccess(boolean z2, String str3) {
                if (!z2) {
                    exl.this.d(str2);
                }
                if (TextUtils.isEmpty(str3)) {
                    LogUtil.w("H5PRO_MediaOperate", "onSuccess(crop): picturePath is empty");
                    callback.onFailure(-1, "picturePath is empty");
                    return;
                }
                File file = new File(str3);
                if (!file.exists()) {
                    LogUtil.w("H5PRO_MediaOperate", "onSuccess(crop): pictureFile does not exist");
                    callback.onFailure(-1, "pictureFile does not exist");
                    return;
                }
                LogUtil.i("H5PRO_MediaOperate", "onSuccess(crop): length -> " + file.length());
                callback.onSuccess(z ? exl.this.d(new JSONArray(), str3) : MediaUtils.fileToBase64(str3));
                if (z2) {
                    exl.this.d(str2);
                } else {
                    exl.this.b(file);
                }
            }
        });
    }

    private void b(final String str, long j, int i, final Callback callback) {
        this.f33618a = null;
        this.f33620c = null;
        this.d = new TakePictureOperate(this.e, this.f33619b);
        final boolean z = "none".equalsIgnoreCase(str) || TextUtils.isEmpty(str);
        if (!z) {
            j = -1;
        }
        long j2 = j;
        if (!z) {
            i = -1;
        }
        this.d.e("uri", j2, i, new TakePictureOperate.OnTakePictureCallback() { // from class: exl.5
            @Override // com.huawei.health.h5pro.jsbridge.system.media.TakePictureOperate.OnTakePictureCallback
            public void onFailure(int i2, String str2) {
                Locale locale = Locale.ENGLISH;
                LogUtil.w("H5PRO_MediaOperate", "takePicture: onFailure -> " + i2 + " - " + str2);
                callback.onFailure(i2, str2);
            }

            @Override // com.huawei.health.h5pro.jsbridge.system.media.TakePictureOperate.OnTakePictureCallback
            public void onSuccess(String str2) {
                if (z) {
                    callback.onSuccess(MediaUtils.fileToBase64(str2));
                    exl.this.d(str2);
                } else {
                    exl.this.a(str, StorageUtil.getUriFromFile(exl.this.e, new File(str2)), str2, false, callback);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z, Callback callback, Uri... uriArr) {
        int i = 0;
        if (z) {
            JSONArray jSONArray = new JSONArray();
            while (i < uriArr.length) {
                d(jSONArray, StorageUtil.getFilePathFromUri(this.e, uriArr[i]));
                i++;
            }
            callback.onSuccess(jSONArray);
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (i < uriArr.length) {
            if (i != 0) {
                sb.append("_");
            }
            sb.append(MediaUtils.fileToBase64(StorageUtil.getFilePathFromUri(this.e, uriArr[i])));
            i++;
        }
        callback.onSuccess(sb.toString());
    }

    private void b(final boolean z, final String str, final long j, final int i, final boolean z2, final Callback callback) {
        this.d = null;
        this.f33620c = null;
        AlbumChooserOperate albumChooserOperate = new AlbumChooserOperate(this.e);
        this.f33618a = albumChooserOperate;
        albumChooserOperate.c(z, new AlbumChooserOperate.OnAlbumChooserCallback() { // from class: exl.4
            @Override // com.huawei.health.h5pro.jsbridge.system.media.AlbumChooserOperate.OnAlbumChooserCallback
            public void onFailure(int i2, String str2) {
                Locale locale = Locale.ENGLISH;
                LogUtil.w("H5PRO_MediaOperate", "albumChooser: onFailure -> " + i2 + " - " + str2);
                callback.onFailure(i2, str2);
            }

            @Override // com.huawei.health.h5pro.jsbridge.system.media.AlbumChooserOperate.OnAlbumChooserCallback
            public void onSuccess(Uri... uriArr) {
                if (z) {
                    exl.this.b(z2, callback, uriArr);
                } else if ("none".equalsIgnoreCase(str) || TextUtils.isEmpty(str)) {
                    exl.this.c(j, i, z2, uriArr[0], callback);
                } else {
                    exl.this.a(str, uriArr[0], (String) null, z2, callback);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j, int i, final boolean z, Uri uri, final Callback callback) {
        String filePathFromUri = StorageUtil.getFilePathFromUri(this.e, uri);
        if (i > 0) {
            BitmapUtils.equalRatioCompress(new File(filePathFromUri), i, false, new BitmapUtils.OnCompressPictureCallback() { // from class: exl.6
                @Override // com.huawei.health.h5pro.jsbridge.system.media.BitmapUtils.OnCompressPictureCallback
                public void onFailure(String str) {
                    callback.onFailure(-1, str);
                }

                @Override // com.huawei.health.h5pro.jsbridge.system.media.BitmapUtils.OnCompressPictureCallback
                public void onSuccess(File file, String str) {
                    if (TextUtils.isEmpty(str)) {
                        str = MediaUtils.fileToBase64(file.getAbsolutePath(), true);
                    }
                    if (z) {
                        callback.onSuccess(exl.this.b(new JSONArray(), file.getAbsolutePath(), str));
                    } else {
                        callback.onSuccess(str);
                    }
                }
            });
        } else {
            BitmapUtils.compress(new File(filePathFromUri), j, false, new BitmapUtils.OnCompressPictureCallback() { // from class: exl.8
                @Override // com.huawei.health.h5pro.jsbridge.system.media.BitmapUtils.OnCompressPictureCallback
                public void onFailure(String str) {
                    callback.onFailure(-1, str);
                }

                @Override // com.huawei.health.h5pro.jsbridge.system.media.BitmapUtils.OnCompressPictureCallback
                public void onSuccess(File file, String str) {
                    if (TextUtils.isEmpty(str)) {
                        str = MediaUtils.fileToBase64(file.getAbsolutePath(), true);
                    }
                    if (z) {
                        callback.onSuccess(exl.this.b(new JSONArray(), file.getAbsolutePath(), str));
                    } else {
                        callback.onSuccess(str);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONArray d(JSONArray jSONArray, String str) {
        return b(jSONArray, str, "");
    }

    public void b(String str, String str2, long j, int i, boolean z, Callback callback) {
        if (callback == null) {
            LogUtil.w("H5PRO_MediaOperate", "pictureChooser: callback is null");
            return;
        }
        if ("camera".equalsIgnoreCase(str)) {
            b(str2, j, i, callback);
        } else if (MusicSong.SORT_TYPE_ALBUM.equalsIgnoreCase(str) || "album-multiple".equalsIgnoreCase(str)) {
            b("album-multiple".equalsIgnoreCase(str), str2, j, i, z, callback);
        } else {
            a(str2, j, i, z, callback);
        }
    }

    @Override // defpackage.exk
    public void d(int i, int i2, Intent intent) {
        super.d(i, i2, intent);
        TakePictureOperate takePictureOperate = this.d;
        if (takePictureOperate != null) {
            takePictureOperate.d(i, i2, intent);
            this.d = null;
            return;
        }
        AlbumChooserOperate albumChooserOperate = this.f33618a;
        if (albumChooserOperate != null) {
            albumChooserOperate.d(i, i2, intent);
            this.f33618a = null;
            return;
        }
        CropPictureOperate cropPictureOperate = this.f33620c;
        if (cropPictureOperate != null) {
            cropPictureOperate.d(i, i2, intent);
            this.f33620c = null;
        }
    }

    @Override // defpackage.exk
    public void d(int i, String[] strArr, int[] iArr) {
        super.d(i, strArr, iArr);
        TakePictureOperate takePictureOperate = this.d;
        if (takePictureOperate != null) {
            takePictureOperate.d(i, strArr, iArr);
            return;
        }
        AlbumChooserOperate albumChooserOperate = this.f33618a;
        if (albumChooserOperate != null) {
            albumChooserOperate.d(i, strArr, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONArray b(JSONArray jSONArray, String str, String str2) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                LogUtil.w("H5PRO_MediaOperate", "putFileInfo: not exist -> " + str);
                return jSONArray;
            }
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.isEmpty(str2)) {
                str2 = MediaUtils.fileToBase64(str);
            }
            jSONObject.put("content", str2);
            jSONObject.put("name", file.getName());
            jSONArray.put(jSONObject);
            return jSONArray;
        } catch (JSONException e) {
            LogUtil.e("H5PRO_MediaOperate", b.a(e, new StringBuilder("putFileInfo: exception -> ")));
            return jSONArray;
        }
    }
}
