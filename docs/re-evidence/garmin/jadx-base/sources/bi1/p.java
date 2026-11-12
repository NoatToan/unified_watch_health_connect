package bi1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lbi1/p;", "Lnj/c;", "Landroid/graphics/Bitmap;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends nj.c<Bitmap> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18058d = 181;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18059e = 370;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ImageView f18060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18061g;

    public p(ImageView imageView, int i14) {
        this.f18060f = imageView;
        this.f18061g = i14;
    }

    @Override // nj.h
    public final void a(Drawable drawable) {
    }

    @Override // nj.c, nj.h
    public final void c(Drawable drawable) {
        int i14 = this.f18061g;
        if (i14 != -1) {
            this.f18060f.setImageResource(i14);
        }
    }

    @Override // nj.h
    public final void f(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        int width = bitmap.getWidth();
        int i14 = this.f18058d;
        int i15 = this.f18059e;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, i14, width, i15);
        bitmapCreateBitmap.getClass();
        ImageView imageView = this.f18060f;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(imageView.getResources(), R.drawable.vvm3_watch_face_mask);
        bitmapDecodeResource.getClass();
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapDecodeResource, 0, i14, bitmapDecodeResource.getWidth(), i15);
        bitmapCreateBitmap2.getClass();
        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap3.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap3);
        Paint paint = new Paint();
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, paint);
        imageView.setImageDrawable(new BitmapDrawable(imageView.getResources(), bitmapCreateBitmap3));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }
}
