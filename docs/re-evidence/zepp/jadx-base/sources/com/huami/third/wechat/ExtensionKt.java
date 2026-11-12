package com.huami.third.wechat;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.tools.analytics.DbUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005\u001a \u0010\n\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\u0006\u0010\u000b\u001a\u00020\u0003¨\u0006\f"}, d2 = {"Landroid/graphics/Bitmap;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "saveQR", "", "fileName", "saveImageToGallery", "bmp", "imageName", "a", "isQ", "wechat_release"}, k = 2, mv = {1, 5, 1})
public final class ExtensionKt {
    private static final boolean a(Context context, Bitmap bitmap, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", MimeTypes.IMAGE_JPEG);
        boolean z = true;
        if (isQ()) {
            contentValues.put("is_pending", (Integer) 1);
        }
        Uri contentUri = MediaStore.Images.Media.getContentUri("external_primary");
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriInsert = contentResolver.insert(contentUri, contentValues);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, contentResolver.openOutputStream(uriInsert));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            z = false;
        }
        contentValues.clear();
        if (isQ()) {
            contentValues.put("is_pending", (Integer) 0);
        }
        contentResolver.update(uriInsert, contentValues, null, null);
        if (!isQ()) {
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uriInsert));
        }
        return z;
    }

    public static final boolean isQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static final boolean saveImageToGallery(@NotNull Bitmap bitmap, @NotNull Context context, @NotNull String str) {
        if (isQ()) {
            return a(context, bitmap, str);
        }
        boolean z = true;
        File file = new File(Environment.getExternalStorageDirectory(), "temp");
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            z = false;
        } catch (IOException e2) {
            e2.printStackTrace();
            z = false;
        }
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file2)));
        return z;
    }

    public static final boolean saveQR(@NotNull Bitmap bitmap, @NotNull Context context) {
        return saveImageToGallery(bitmap, context, "bind_qr_" + System.currentTimeMillis() + ".jpg");
    }
}
