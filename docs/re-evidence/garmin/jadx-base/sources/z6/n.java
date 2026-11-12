package z6;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class n extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IconCompat f202660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IconCompat f202661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f202662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f202663h;

    public static class a {
        private a() {
        }

        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z14) {
            bigPictureStyle.showBigPictureWhenCollapsed(z14);
        }
    }

    public n(q qVar) {
        f(qVar);
    }

    public static IconCompat g(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            PorterDuff.Mode mode = IconCompat.f6391k;
            return IconCompat.a.a((Icon) parcelable);
        }
        if (!(parcelable instanceof Bitmap)) {
            return null;
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f6393b = (Bitmap) parcelable;
        return iconCompat;
    }

    @Override // z6.w
    public final void b(y yVar) {
        Bitmap bitmap;
        Context context = yVar.f202747a;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(yVar.f202748b).setBigContentTitle(this.f202742b);
        IconCompat iconCompat = this.f202660e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                a.a(bigContentTitle, iconCompat.f(context));
            } else {
                int type = iconCompat.f6392a;
                if (type == -1) {
                    type = ((Icon) iconCompat.f6393b).getType();
                }
                if (type == 1) {
                    IconCompat iconCompat2 = this.f202660e;
                    int i14 = iconCompat2.f6392a;
                    if (i14 == -1) {
                        Object obj = iconCompat2.f6393b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i14 == 1) {
                        bitmap = (Bitmap) iconCompat2.f6393b;
                    } else {
                        if (i14 != 5) {
                            com.google.firebase.messaging.l.n(iconCompat2, "called getBitmap() on ");
                            return;
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.f6393b;
                        int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(3);
                        float f14 = iMin;
                        float f15 = 0.5f * f14;
                        float f16 = 0.9166667f * f15;
                        float f17 = 0.010416667f * f14;
                        paint.setColor(0);
                        paint.setShadowLayer(f17, 0.0f, f14 * 0.020833334f, 1023410176);
                        canvas.drawCircle(f15, f15, f16, paint);
                        paint.setShadowLayer(f17, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f15, f15, f16, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f15, f15, f16, paint);
                        canvas.setBitmap(null);
                        bitmap = bitmapCreateBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.f202662g) {
            IconCompat iconCompat3 = this.f202661f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.f(context));
            }
        }
        if (this.f202744d) {
            bigContentTitle.setSummaryText(this.f202743c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            a.c(bigContentTitle, this.f202663h);
            a.b(bigContentTitle, null);
        }
    }

    @Override // z6.w
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.largeIcon.big");
        bundle.remove("android.picture");
        bundle.remove("android.pictureIcon");
        bundle.remove("android.showBigPictureWhenCollapsed");
    }

    @Override // z6.w
    public final String d() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // z6.w
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.f202661f = g(bundle.getParcelable("android.largeIcon.big"));
            this.f202662g = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        this.f202660e = parcelable != null ? g(parcelable) : g(bundle.getParcelable("android.pictureIcon"));
        this.f202663h = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }

    public n() {
    }
}
