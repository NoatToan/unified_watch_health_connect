package com.huawei.health.h5pro.jsbridge.system.media;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Size;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback;
import com.huawei.health.h5pro.jsbridge.ErrorEnum;
import com.huawei.health.h5pro.jsbridge.system.storage.FileMeta;
import com.huawei.health.h5pro.jsbridge.system.storage.StorageUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.utils.PermissionUtil;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import defpackage.exk;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
final class PublicFileOperate extends exk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f6832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f6833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnQueryFileCallback f6834c;
    private H5ProMediaScanner d;

    public interface OnQueryFileCallback {
        void onQueryFailure(int i, String str);

        void onQuerySuccess(List<JSONObject> list);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("resultType")
        String f6839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("mimeType")
        String f6840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("pageIndex")
        int f6841c;

        @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
        int d;
    }

    public PublicFileOperate(Activity activity) {
        super(activity);
    }

    private List<JSONObject> b(Cursor cursor, String str, Uri uri) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            try {
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject();
                    if ("BASE64".equalsIgnoreCase(str)) {
                        jSONObject.put("uri", MediaUtils.fileToBase64(string));
                    } else {
                        jSONObject.put("uri", string);
                    }
                    jSONObject.put(ContentResource.FILE_NAME, cursor.getString(cursor.getColumnIndexOrThrow("title")));
                    jSONObject.put("size", cursor.getLong(cursor.getColumnIndexOrThrow("_size")));
                    jSONObject.put("dateAdded", cursor.getLong(cursor.getColumnIndexOrThrow("date_added")) * 1000);
                    String string2 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
                    jSONObject.put("mimeType", string2);
                    c(cursor, uri, string, jSONObject, string2);
                    arrayList.add(jSONObject);
                }
            } catch (SQLiteException | IOException | IllegalArgumentException | JSONException e2) {
                LogUtil.e("H5PRO_MediaOperate", "initResultData: exception -> " + e2.getMessage());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(e eVar, String[] strArr, OnQueryFileCallback onQueryFileCallback) {
        Cursor cursorQuery;
        LogUtil.i("H5PRO_MediaOperate", "queryStorageFiles");
        int i = eVar.d;
        if (i <= 0) {
            i = 10;
        }
        eVar.d = i;
        eVar.f6841c = Math.max(eVar.f6841c, 0);
        String[] strArr2 = this.f6833b;
        if (strArr2 == null || strArr2.length == 0) {
            this.f6833b = new String[]{"date_added", "_data", "_size", "title", "mime_type", "_id"};
        }
        StringBuilder sb = new StringBuilder(Constants.LEFT_BRACKET_ONLY);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            Locale locale = Locale.ENGLISH;
            sb.append("mime_type = ?");
            if (i2 != strArr.length - 1) {
                sb.append(" or ");
            }
        }
        Locale locale2 = Locale.ENGLISH;
        sb.append(") and _size > ?");
        int length = strArr.length;
        String[] strArr3 = (String[]) Arrays.copyOf(strArr, length + 1);
        strArr3[length] = "0";
        ContentResolver contentResolver = this.e.getContentResolver();
        Uri contentUri = MediaStore.Files.getContentUri("external");
        Cursor cursor = null;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Bundle bundle = new Bundle();
                bundle.putString("android:query-arg-sql-selection", sb.toString());
                bundle.putStringArray("android:query-arg-sql-selection-args", strArr3);
                bundle.putStringArray("android:query-arg-sort-columns", new String[]{"date_added"});
                bundle.putInt("android:query-arg-sort-direction", 1);
                bundle.putString("android:query-arg-sql-limit", eVar.d + " OFFSET " + (eVar.f6841c * eVar.d));
                cursorQuery = contentResolver.query(contentUri, this.f6833b, bundle, null);
            } else {
                cursorQuery = contentResolver.query(contentUri, this.f6833b, sb.toString(), strArr3, "date_added DESC limit " + eVar.d + " offset " + (eVar.f6841c * eVar.d));
            }
            cursor = cursorQuery;
            if (cursor != null) {
                onQueryFileCallback.onQuerySuccess(b(cursor, eVar.f6839a, contentUri));
            } else {
                onQueryFileCallback.onQueryFailure(-1, "Failed to query the file(" + eVar.f6840b + Constants.RIGHT_BRACKET_ONLY);
            }
        } catch (Exception e2) {
            onQueryFileCallback.onQueryFailure(-1, e2.getMessage());
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    private void c(Cursor cursor, Uri uri, String str, JSONObject jSONObject, String str2) throws Throwable {
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        if (TextUtils.isEmpty(str2) || !str2.toUpperCase(Locale.ENGLISH).startsWith("IMAGE/")) {
            return;
        }
        Uri uriWithAppendedId = ContentUris.withAppendedId(uri, j);
        ContentResolver contentResolver = this.e.getContentResolver();
        Bitmap thumbnail = null;
        if (Build.VERSION.SDK_INT >= 30) {
            FileMeta uriToFileMeta = StorageUtil.parseUriToFileMeta(uriWithAppendedId, this.e);
            if (uriToFileMeta.isExist()) {
                jSONObject.put("uri", uriToFileMeta.getAbsolutePath());
                thumbnail = contentResolver.loadThumbnail(uriWithAppendedId, new Size(GlMapUtil.DEVICE_DISPLAY_DPI_HIGH, GlMapUtil.DEVICE_DISPLAY_DPI_HIGH), null);
            }
        } else {
            thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, j, 1, null);
        }
        jSONObject.put("thumbnail", TextUtils.concat("data:", str2, ";base64,", thumbnail == null ? BitmapUtils.parseBitmapToBase64(BitmapUtils.compress(new File(str), SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US)) : BitmapUtils.parseBitmapToBase64(BitmapUtils.compress(thumbnail, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US))).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final e eVar, final OnQueryFileCallback onQueryFileCallback) {
        if (TextUtils.isEmpty(eVar.f6840b)) {
            onQueryFileCallback.onQueryFailure(-1, "mimeType is empty");
            return;
        }
        final String[] strArrSplit = eVar.f6840b.split(",");
        if (strArrSplit.length == 0) {
            onQueryFileCallback.onQueryFailure(-1, "Invalid parameter mimeType: " + eVar.f6840b);
        } else {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.huawei.health.h5pro.jsbridge.system.media.PublicFileOperate.5
                @Override // java.lang.Runnable
                public void run() {
                    PublicFileOperate.this.b(eVar, strArrSplit, onQueryFileCallback);
                }
            });
            executorServiceNewSingleThreadExecutor.shutdown();
        }
    }

    public void a() {
        H5ProMediaScanner h5ProMediaScanner = this.d;
        if (h5ProMediaScanner != null) {
            h5ProMediaScanner.disconnect();
            this.d = null;
        }
    }

    public void c(e eVar, OnQueryFileCallback onQueryFileCallback) {
        e(eVar, onQueryFileCallback);
    }

    @Override // defpackage.exk
    public void d(int i, String[] strArr, int[] iArr) {
        super.d(i, strArr, iArr);
        if (i == 10002) {
            if (PermissionUtil.getInstance().isAllPermitted(iArr)) {
                d(this.f6832a, this.f6834c);
                return;
            }
            OnQueryFileCallback onQueryFileCallback = this.f6834c;
            if (onQueryFileCallback != null) {
                onQueryFileCallback.onQueryFailure(ErrorEnum.NO_PERMISSION.getCode(), "no read/write permission on the storage card");
            }
        }
    }

    public void e(final e eVar, final OnQueryFileCallback onQueryFileCallback) {
        this.f6832a = eVar;
        this.f6834c = onQueryFileCallback;
        PermissionUtil.getInstance().checkAndRequestPermissions(this.e, PermissionUtil.f7000b, 10002, new H5ProPermissionCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.media.PublicFileOperate.1
            @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
            public void onDenied(String str) {
                onQueryFileCallback.onQueryFailure(ErrorEnum.NO_PERMISSION.getCode(), "no read/write permission on the storage card");
            }

            @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
            public void onForeverDenied(String[] strArr) {
                onQueryFileCallback.onQueryFailure(ErrorEnum.NO_PERMISSION.getCode(), "no read/write permission on the storage card");
            }

            @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
            public void onGranted() {
                PublicFileOperate.this.d(eVar, onQueryFileCallback);
            }
        });
    }

    public void e(String str, String[] strArr, H5ProMediaScanner.OnScanFileCallback onScanFileCallback) {
        if (onScanFileCallback == null) {
            LogUtil.w("H5PRO_MediaOperate", "scanPublicFile: onScannerCallback is null");
            return;
        }
        if (strArr == null || strArr.length == 0) {
            onScanFileCallback.onScanFailure("mimeTypes is empty");
            return;
        }
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            onScanFileCallback.onScanFailure("the file directory does not exist");
            return;
        }
        if (this.d == null) {
            this.d = new H5ProMediaScanner();
        }
        this.d.scanFile(this.e, str, strArr, onScanFileCallback);
    }
}
