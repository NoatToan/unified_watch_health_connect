package com.huami.web.container.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.web.container.R;
import com.huami.web.container.utils.UtilsKt;
import com.xiaomi.hm.health.baseutil.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a \u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u001a\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u001a\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002\"\u0016\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "captureViewShare", "imagePath", "Landroid/graphics/Bitmap;", "bmp", "", "quality", "", "saveBitmapToFile", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "showNoSdcardPermissionDialog", "startAppSettings", "TAG", "Ljava/lang/String;", "web_release"}, k = 2, mv = {1, 5, 1})
public final class UtilsKt {

    @NotNull
    public static final String TAG = "Utils";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    @NotNull
    public static final String captureViewShare(@NotNull View view, @NotNull Context context) {
        String absolutePath = FileUtils.getShareImagePath(context).getAbsolutePath();
        view.setDrawingCacheEnabled(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.destroyDrawingCache();
        view.setDrawingCacheEnabled(false);
        boolean zSaveBitmapToFile = saveBitmapToFile(absolutePath, bitmapCreateBitmap, 100);
        if (!bitmapCreateBitmap.isRecycled()) {
            bitmapCreateBitmap.recycle();
        }
        return zSaveBitmapToFile ? absolutePath : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AppCompatActivity appCompatActivity, DialogInterface dialogInterface, int i) {
        startAppSettings(appCompatActivity);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final boolean saveBitmapToFile(@Nullable String str, @NotNull Bitmap bitmap, int i) {
        FileOutputStream fileOutputStream;
        Throwable th;
        Exception e;
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        boolean zCompress = false;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                try {
                    zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
                } catch (Exception e2) {
                    e = e2;
                    HMLog.e(TAG, e.getMessage(), new Object[0]);
                    if (fileOutputStream != null) {
                    }
                    return zCompress;
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            fileOutputStream = null;
            e = e3;
        } catch (Throwable th3) {
            fileOutputStream = null;
            th = th3;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
        try {
            fileOutputStream.close();
        } catch (IOException unused2) {
        }
        return zCompress;
    }

    public static final void showNoSdcardPermissionDialog(@NotNull final AppCompatActivity appCompatActivity) {
        new AlertDialogFragment.Builder(appCompatActivity).setTitle(R.string.no_sdcard_permission_title).setMessage(R.string.no_sdcard_permission_messgae).setCancelable(false).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: s88
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UtilsKt.c(dialogInterface, i);
            }
        }).setPositiveButton(R.string.per_go_setting, new DialogInterface.OnClickListener() { // from class: r88
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UtilsKt.d(appCompatActivity, dialogInterface, i);
            }
        }).show(appCompatActivity.getSupportFragmentManager());
    }

    public static final void startAppSettings(@NotNull Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse(Intrinsics.stringPlus("package:", context.getPackageName())));
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            intent.setAction("android.settings.APPLICATION_SETTINGS");
            context.startActivity(intent);
        }
    }
}
