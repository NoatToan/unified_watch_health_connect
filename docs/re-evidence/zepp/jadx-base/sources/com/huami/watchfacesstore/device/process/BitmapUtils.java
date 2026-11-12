package com.huami.watchfacesstore.device.process;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002J(\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002J0\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006J\u0016\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014J\u0016\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fR\u0016\u0010\u001a\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010 \u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0016\u0010!\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0016\u0010\"\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u0016\u0010#\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0016\u0010$\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001b¨\u0006'"}, d2 = {"Lcom/huami/watchfacesstore/device/process/BitmapUtils;", "", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "", "offset", "", "c", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, GoogleApiAvailabilityLight.a, "height", "a", "b", "Landroid/graphics/Bitmap;", "bitmap", "roundPx", "corners", "filler", "", "path", "saveBitmap", "background", DownloadService.KEY_FOREGROUND, "mergeBitmap", "CORNER_NONE", LogUtil.I, "CORNER_TOP_LEFT", "CORNER_TOP_RIGHT", "CORNER_BOTTOM_LEFT", "CORNER_BOTTOM_RIGHT", "CORNER_ALL", "CORNER_TOP", "CORNER_BOTTOM", "CORNER_LEFT", "CORNER_RIGHT", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class BitmapUtils {
    public static final int CORNER_ALL = 15;
    public static final int CORNER_BOTTOM = 12;
    public static final int CORNER_LEFT = 5;
    public static final int CORNER_NONE = 0;
    public static final int CORNER_RIGHT = 10;
    public static final int CORNER_TOP = 3;

    @NotNull
    public static final BitmapUtils INSTANCE = new BitmapUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int CORNER_TOP_LEFT = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int CORNER_TOP_RIGHT = 2;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int CORNER_BOTTOM_LEFT = 4;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int CORNER_BOTTOM_RIGHT = 8;

    private BitmapUtils() {
    }

    private final void a(Canvas canvas, Paint paint, int offset, int height) {
        canvas.drawRect(new Rect(0, height - offset, offset, height), paint);
    }

    private final void b(Canvas canvas, Paint paint, int offset, int width, int height) {
        canvas.drawRect(new Rect(width - offset, height - offset, width, height), paint);
    }

    private final void c(Canvas canvas, Paint paint, int offset) {
        canvas.drawRect(new Rect(0, 0, offset, offset), paint);
    }

    private final void d(Canvas canvas, Paint paint, int offset, int width) {
        canvas.drawRect(new Rect(width - offset, 0, width, offset), paint);
    }

    @NotNull
    public final Bitmap filler(@NotNull Bitmap bitmap, int roundPx, int corners) {
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(-16777216);
            float f = roundPx;
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, width, height), f, f, paint);
            int i = corners ^ 15;
            if ((i & 1) != 0) {
                c(canvas, paint, roundPx);
            }
            if ((i & 2) != 0) {
                d(canvas, paint, roundPx, width);
            }
            if ((i & 4) != 0) {
                a(canvas, paint, roundPx, width);
            }
            if ((i & 8) != 0) {
                b(canvas, paint, roundPx, width, height);
            }
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            Rect rect = new Rect(0, 0, width, height);
            canvas.drawBitmap(bitmap, rect, rect, paint);
            return bitmapCreateBitmap;
        } catch (Exception unused) {
            return bitmap;
        }
    }

    @NotNull
    public final Bitmap mergeBitmap(@NotNull Bitmap background, @NotNull Bitmap foreground) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(background.getWidth(), background.getHeight(), background.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(background, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(foreground, 0.0f, 0.0f, (Paint) null);
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }

    @NotNull
    public final String saveBitmap(@NotNull Bitmap bitmap, @NotNull String path) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.close();
        return path;
    }
}
