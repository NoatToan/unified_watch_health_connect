package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.TextOptions;

/* JADX INFO: loaded from: classes4.dex */
public final class zhs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Paint f41303a = new Paint();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Rect f41304b = new Rect();

    public static float a(int i, boolean z) {
        if (z) {
            if (i != 1) {
                return i != 2 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }
        if (i != 8) {
            return i != 16 ? 0.5f : 1.0f;
        }
        return 0.0f;
    }

    public static MarkerOptions b(TextOptions textOptions) {
        if (textOptions == null) {
            return null;
        }
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(textOptions.getPosition());
        markerOptions.visible(textOptions.isVisible());
        markerOptions.zIndex(textOptions.getZIndex());
        markerOptions.rotateAngle(textOptions.getRotate());
        markerOptions.icon(c(textOptions));
        markerOptions.anchor(a(textOptions.getAlignX(), true), a(textOptions.getAlignY(), false));
        return markerOptions;
    }

    public static BitmapDescriptor c(TextOptions textOptions) {
        if (textOptions == null) {
            return null;
        }
        f41303a.setTypeface(textOptions.getTypeface());
        f41303a.setSubpixelText(true);
        f41303a.setAntiAlias(true);
        f41303a.setStrokeWidth(5.0f);
        f41303a.setStrokeCap(Paint.Cap.ROUND);
        f41303a.setTextSize(textOptions.getFontSize());
        f41303a.setTextAlign(Paint.Align.CENTER);
        f41303a.setColor(textOptions.getFontColor());
        Paint.FontMetrics fontMetrics = f41303a.getFontMetrics();
        int i = (int) (fontMetrics.descent - fontMetrics.ascent);
        int i2 = (int) (((i - fontMetrics.bottom) - fontMetrics.top) / 2.0f);
        if (textOptions.getText() != null) {
            f41303a.getTextBounds(textOptions.getText(), 0, textOptions.getText().length(), f41304b);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(f41304b.width() + 6, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(textOptions.getBackgroundColor());
        if (textOptions.getText() != null) {
            canvas.drawText(textOptions.getText(), f41304b.centerX() + 3, i2, f41303a);
        }
        return BitmapDescriptorFactory.fromBitmap(bitmapCreateBitmap);
    }
}
