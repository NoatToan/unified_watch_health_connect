package com.xiaomi.hm.health.relation.utils;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.TextUtilsCompat;
import com.google.gson.Gson;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.relation.R;
import com.xiaomi.hm.health.relation.copy.DimPanelFragment;
import com.xiaomi.hm.health.relation.copy.ProgressBarFragment;
import com.xiaomi.hm.health.relation.utils.Utils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class Utils {
    private static final String a = "Utils";
    private static final String b = "Millelet";
    private static final String c = "hk.alipay.wallet";
    private static final String d = "unknown";
    private static final String e = "HK";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(DialogInterface dialogInterface, int i) {
    }

    public static Bitmap clipToRoundBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        HMLog.i("Utils", "round bitmap w=" + bitmap.getWidth() + ", h=" + bitmap.getHeight(), new Object[0]);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect();
        RectF rectF = new RectF();
        if (bitmap.getWidth() > bitmap.getHeight()) {
            rect.left = (bitmap.getWidth() - iMin) / 2;
            rect.top = 0;
            rect.right = bitmap.getWidth() - rect.left;
            rect.bottom = bitmap.getHeight();
        } else if (bitmap.getWidth() < bitmap.getHeight()) {
            rect.left = 0;
            rect.top = (bitmap.getHeight() - iMin) / 2;
            rect.right = bitmap.getWidth();
            rect.bottom = bitmap.getHeight() - rect.top;
        } else {
            rect.left = 0;
            rect.top = 0;
            rect.right = bitmap.getWidth();
            rect.bottom = bitmap.getHeight();
        }
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        float f = iMin;
        rectF.right = f;
        rectF.bottom = f;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-16777216);
        float f2 = iMin / 2;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        if (bitmap.isRecycled()) {
            return null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
        return bitmapCreateBitmap;
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Gson getGson() {
        return HMHttpUtils.getGson();
    }

    public static void hideProgressDialog(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            DialogFragment dialogFragment = (DialogFragment) activity.getFragmentManager().findFragmentByTag(ProgressBarFragment.class.getName());
            if (dialogFragment != null) {
                dialogFragment.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static boolean isRTL() {
        return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static boolean saveBitmapToFile(String str, Bitmap bitmap) {
        return saveBitmapToFile(str, bitmap, 100);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean saveBitmapToPngFile(String str, Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        Exception e2;
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        boolean zCompress = false;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    zCompress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                } catch (Exception e3) {
                    e2 = e3;
                    HMLog.w("Utils", e2.getMessage(), new Object[0]);
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
        } catch (Exception e4) {
            fileOutputStream = null;
            e2 = e4;
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

    public static void showPermissionDenieDialog(final AppCompatActivity appCompatActivity, String str) {
        new AlertDialogFragment.Builder(appCompatActivity).setTitle(R.string.relatives_permisson_tips_dialog_title).setMessage(str).setNegativeButton(R.string.relatives_cancel, new DialogInterface.OnClickListener() { // from class: m88
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Utils.c(dialogInterface, i);
            }
        }).setPositiveButton(R.string.relatives_per_go_setting, new DialogInterface.OnClickListener() { // from class: l88
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Utils.startAppSettings(appCompatActivity);
            }
        }).show(appCompatActivity.getSupportFragmentManager());
    }

    public static void showProgressDialog(Activity activity, int i) {
        showProgressDialog(activity, i, true);
    }

    public static int sp2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static void startAppSettings(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            e2.printStackTrace();
            intent.setAction("android.settings.APPLICATION_SETTINGS");
            context.startActivity(intent);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean saveBitmapToFile(String str, Bitmap bitmap, int i) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        Exception e2;
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
                } catch (Exception e3) {
                    e2 = e3;
                    HMLog.w("Utils", e2.getMessage(), new Object[0]);
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
        } catch (Exception e4) {
            fileOutputStream = null;
            e2 = e4;
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

    public static void showProgressDialog(Activity activity, int i, boolean z) {
        if (activity == null) {
            return;
        }
        hideProgressDialog(activity);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("REF_PROGRESS_INFO", activity.getString(i));
            bundle.putBoolean("REF_PROGRESS_CANCELABLE", z);
            DimPanelFragment.showPanel(activity, ProgressBarFragment.class, bundle);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
