package dj;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f59802c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(ui.e.f171166a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59803b;

    public a0(int i14) {
        qj.l.a(i14 > 0, "roundingRadius must be greater than 0.");
        this.f59803b = i14;
    }

    @Override // ui.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f59802c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f59803b).array());
    }

    @Override // dj.f
    public final Bitmap c(xi.d dVar, Bitmap bitmap, int i14, int i15) {
        Paint paint = d0.f59815a;
        int i16 = this.f59803b;
        qj.l.a(i16 > 0, "roundingRadius must be greater than 0.");
        c0 c0Var = new c0(i16);
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapC = d0.c(bitmap, dVar);
        Bitmap bitmapE = dVar.e(bitmapC.getWidth(), bitmapC.getHeight(), config);
        bitmapE.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapC, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapE.getWidth(), bitmapE.getHeight());
        Lock lock = d0.f59818d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapE);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f14 = c0Var.f59813a;
            canvas.drawRoundRect(rectF, f14, f14, paint2);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapC.equals(bitmap)) {
                dVar.c(bitmapC);
            }
            return bitmapE;
        } catch (Throwable th3) {
            lock.unlock();
            throw th3;
        }
    }

    @Override // ui.e
    public final boolean equals(Object obj) {
        return (obj instanceof a0) && this.f59803b == ((a0) obj).f59803b;
    }

    @Override // ui.e
    public final int hashCode() {
        return qj.m.g(-569625254, qj.m.g(this.f59803b, 17));
    }
}
