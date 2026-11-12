package qw0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqw0/l;", "", "<init>", "()V", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f148323a = 0;

    static {
        new l();
    }

    private l() {
    }

    public static Bitmap a(Resources resources, int i14) {
        Bitmap bitmapC;
        resources.getClass();
        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
        Drawable drawable = resources.getDrawable(R.drawable.gcm_map_poi, null);
        Bitmap bitmapC2 = drawable != null ? d7.b.c(drawable, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) : null;
        int width = bitmapC2 != null ? bitmapC2.getWidth() : 0;
        int height = bitmapC2 != null ? bitmapC2.getHeight() : 0;
        Drawable drawable2 = resources.getDrawable(i14, null);
        if (drawable2 != null) {
            int i15 = (int) (width * 0.65f);
            bitmapC = d7.b.c(drawable2, i15, i15);
        } else {
            bitmapC = null;
        }
        int width2 = bitmapC != null ? bitmapC.getWidth() : 0;
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(resources.getColor(R.color.gray_15_static), PorterDuff.Mode.SRC_IN));
        if (bitmapC2 == null || bitmapC == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapC2.getWidth(), bitmapC2.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmapC2, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmapC, (width - width2) / 2.0f, height / 9.0f, paint);
        return bitmapCreateBitmap;
    }
}
