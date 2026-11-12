package uw0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import qs.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luw0/c;", "", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f172973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f172974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f172975c;

    public c(Resources resources) {
        resources.getClass();
        this.f172973a = resources;
        Paint paint = new Paint(65);
        this.f172974b = paint;
        this.f172975c = new b(resources);
        paint.setColor(-16777216);
        paint.setTypeface(Typeface.SANS_SERIF);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(resources.getDimension(R.dimen.andfont_caption));
    }

    public final Bitmap a(String str) {
        str.getClass();
        Bitmap bitmapE = e(2131231999);
        Rect rect = new Rect();
        int length = str.length();
        Paint paint = this.f172974b;
        paint.getTextBounds(str, 0, length, rect);
        new Canvas(bitmapE).drawText(str, (bitmapE.getWidth() - rect.width()) / 2, (rect.height() + bitmapE.getHeight()) / 2, paint);
        return bitmapE;
    }

    public abstract int b();

    public abstract int c();

    public abstract int d(x xVar);

    public final Bitmap e(int i14) {
        Resources resources = this.f172975c.f172972a;
        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
        Drawable drawable = resources.getDrawable(i14, null);
        Canvas canvas = new Canvas();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable != null ? drawable.getIntrinsicWidth() : 0, drawable != null ? drawable.getIntrinsicHeight() : 0, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(bitmapCreateBitmap);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
        return bitmapCreateBitmap;
    }

    public abstract Bitmap f();

    public abstract Bitmap g();

    public abstract Bitmap h(x xVar);

    public abstract Bitmap i();

    public abstract Bitmap j(int i14);

    public abstract Bitmap k();
}
