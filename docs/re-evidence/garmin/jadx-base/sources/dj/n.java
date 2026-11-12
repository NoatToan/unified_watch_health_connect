package dj;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f59860a = new a();

    public class a extends xi.e {
        @Override // xi.e, xi.d
        public final void c(Bitmap bitmap) {
        }
    }

    private n() {
    }

    public static e a(xi.d dVar, Drawable drawable, int i14, int i15) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z14 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i14 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i15 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i14 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i15 = current.getIntrinsicHeight();
                    }
                    Lock lock = d0.f59818d;
                    lock.lock();
                    Bitmap bitmapE = dVar.e(i14, i15, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapE);
                        current.setBounds(0, 0, i14, i15);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapE;
                    } catch (Throwable th3) {
                        lock.unlock();
                        throw th3;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    current.toString();
                }
                z14 = true;
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                current.toString();
            }
            bitmap = null;
            z14 = true;
        }
        if (!z14) {
            dVar = f59860a;
        }
        return e.c(bitmap, dVar);
    }
}
