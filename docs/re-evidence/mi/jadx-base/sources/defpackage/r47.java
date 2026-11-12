package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes4.dex */
public final class r47 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cq2 f32170a = new a();

    public class a extends dq2 {
        @Override // defpackage.dq2, defpackage.cq2
        public void a(Bitmap bitmap) {
        }
    }

    public static kqk<Bitmap> a(cq2 cq2Var, Drawable drawable, int i, int i2) {
        Bitmap bitmapB;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmapB = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapB = null;
        } else {
            bitmapB = b(cq2Var, current, i, i2);
            z = true;
        }
        if (!z) {
            cq2Var = f32170a;
        }
        return gq2.c(bitmapB, cq2Var);
    }

    public static Bitmap b(cq2 cq2Var, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to draw ");
                sb.append(drawable);
                sb.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to draw ");
                sb2.append(drawable);
                sb2.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        Lock lockF = oyp.f();
        lockF.lock();
        Bitmap bitmapB = cq2Var.b(i, i2, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapB);
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapB;
        } finally {
            lockF.unlock();
        }
    }
}
