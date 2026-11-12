package com.xiaomi.hm.health.device.watch_skin;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b!\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b3\u00104J0\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J0\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J0\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J0\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006J\u0016\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014R\u001c\u0010\u001a\u001a\u00020\u00068\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\u00020\u00068\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001e\u001a\u00020\u00068\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010 \u001a\u00020\u00068\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010#\u001a\u00020\u00068\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u001c\u0010&\u001a\u00020\u00068\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u001c\u0010)\u001a\u00020\u00068\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010\u0019R\u001c\u0010,\u001a\u00020\u00068\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010\u0019R\u001c\u0010/\u001a\u00020\u00068\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b-\u0010\u0017\u001a\u0004\b.\u0010\u0019R\u001c\u00102\u001a\u00020\u00068\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b0\u0010\u0017\u001a\u0004\b1\u0010\u0019¨\u00065"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/BitmapUtils;", "", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "", "offset", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "", "c", GoogleApiAvailabilityLight.a, "a", "b", "Landroid/graphics/Bitmap;", "bitmap", "roundPx", "corners", "filler", "", "path", "saveBitmap", LogUtil.I, "getCORNER_NONE", "()I", "CORNER_NONE", "getCORNER_TOP_LEFT", "CORNER_TOP_LEFT", "getCORNER_TOP_RIGHT", "CORNER_TOP_RIGHT", "getCORNER_BOTTOM_LEFT", "CORNER_BOTTOM_LEFT", "e", "getCORNER_BOTTOM_RIGHT", "CORNER_BOTTOM_RIGHT", "f", "getCORNER_ALL", "CORNER_ALL", "g", "getCORNER_TOP", "CORNER_TOP", "h", "getCORNER_BOTTOM", "CORNER_BOTTOM", "i", "getCORNER_LEFT", "CORNER_LEFT", z.j, "getCORNER_RIGHT", "CORNER_RIGHT", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BitmapUtils {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int CORNER_NONE = 0;

    @NotNull
    public static final BitmapUtils INSTANCE = new BitmapUtils();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int CORNER_TOP_LEFT = 1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int CORNER_TOP_RIGHT = 2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int CORNER_BOTTOM_LEFT = 4;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final int CORNER_BOTTOM_RIGHT = 8;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final int CORNER_ALL = ((1 | 2) | 4) | 8;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final int CORNER_TOP = 1 | 2;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final int CORNER_BOTTOM = 4 | 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final int CORNER_LEFT = 1 | 4;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final int CORNER_RIGHT = 2 | 8;

    private BitmapUtils() {
    }

    private final void a(Canvas canvas, Paint paint, int offset, int width, int height) {
        canvas.drawRect(new Rect(0, height - offset, offset, height), paint);
    }

    private final void b(Canvas canvas, Paint paint, int offset, int width, int height) {
        canvas.drawRect(new Rect(width - offset, height - offset, width, height), paint);
    }

    private final void c(Canvas canvas, Paint paint, int offset, int width, int height) {
        canvas.drawRect(new Rect(0, 0, offset, offset), paint);
    }

    private final void d(Canvas canvas, Paint paint, int offset, int width, int height) {
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
            int i = corners ^ CORNER_ALL;
            if ((CORNER_TOP_LEFT & i) != 0) {
                c(canvas, paint, roundPx, width, height);
            }
            if ((CORNER_TOP_RIGHT & i) != 0) {
                d(canvas, paint, roundPx, width, height);
            }
            if ((CORNER_BOTTOM_LEFT & i) != 0) {
                a(canvas, paint, roundPx, width, height);
            }
            if ((i & CORNER_BOTTOM_RIGHT) != 0) {
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

    public final int getCORNER_ALL() {
        return CORNER_ALL;
    }

    public final int getCORNER_BOTTOM() {
        return CORNER_BOTTOM;
    }

    public final int getCORNER_BOTTOM_LEFT() {
        return CORNER_BOTTOM_LEFT;
    }

    public final int getCORNER_BOTTOM_RIGHT() {
        return CORNER_BOTTOM_RIGHT;
    }

    public final int getCORNER_LEFT() {
        return CORNER_LEFT;
    }

    public final int getCORNER_NONE() {
        return CORNER_NONE;
    }

    public final int getCORNER_RIGHT() {
        return CORNER_RIGHT;
    }

    public final int getCORNER_TOP() {
        return CORNER_TOP;
    }

    public final int getCORNER_TOP_LEFT() {
        return CORNER_TOP_LEFT;
    }

    public final int getCORNER_TOP_RIGHT() {
        return CORNER_TOP_RIGHT;
    }

    @NotNull
    public final String saveBitmap(@NotNull Bitmap bitmap, @NotNull String path) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.close();
        return path;
    }
}
