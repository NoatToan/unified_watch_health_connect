package com.huami.lib.qrcode.ext;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.RawRes;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.android.Utils;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u001a\n\u0010\n\u001a\u00020\u0003*\u00020\t\u001a\n\u0010\u000b\u001a\u00020\u0003*\u00020\t\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0001\u001a$\u0010\u0011\u001a\u00020\u000e*\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¨\u0006\u0012"}, d2 = {"Landroid/widget/ImageView;", "Lorg/opencv/core/Mat;", "source", "", "showMat", "Landroid/content/Context;", "", "resId", "getBgrFromResId", "Landroid/view/View;", "setVisible", "setInvisible", "toRgb", "toGray", "", "targetDir", "targetFileName", "copyFromRaw", "qrcode_release"}, k = 2, mv = {1, 5, 1})
public final class ExtensionKt {
    @NotNull
    public static final String copyFromRaw(@NotNull Context context, @RawRes int i, @NotNull String str, @NotNull String str2) {
        File file = new File(context.getDir(str, 0), str2);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            ByteStreamsKt.copyTo$default(context.getResources().openRawResource(i), fileOutputStream, 0, 2, null);
            CloseableKt.closeFinally(fileOutputStream, null);
            return file.getAbsolutePath();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @NotNull
    public static final Mat getBgrFromResId(@NotNull Context context, @DrawableRes int i) {
        return Utils.loadResource(context, i);
    }

    public static final void setInvisible(@NotNull View view) {
        view.setVisibility(4);
    }

    public static final void setVisible(@NotNull View view) {
        view.setVisibility(0);
    }

    public static final void showMat(@NotNull ImageView imageView, @NotNull Mat mat) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(mat.width(), mat.height(), Bitmap.Config.ARGB_8888);
        Utils.matToBitmap(mat, bitmapCreateBitmap);
        imageView.setImageBitmap(bitmapCreateBitmap);
    }

    @NotNull
    public static final Mat toGray(@NotNull Mat mat) {
        Mat mat2 = new Mat();
        Imgproc.cvtColor(mat, mat2, 6);
        return mat2;
    }

    @NotNull
    public static final Mat toRgb(@NotNull Mat mat) {
        Mat mat2 = new Mat();
        Imgproc.cvtColor(mat, mat2, 4);
        return mat2;
    }
}
