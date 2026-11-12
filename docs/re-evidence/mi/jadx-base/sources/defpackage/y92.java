package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y92 implements b5i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config f39945a = Bitmap.Config.ARGB_8888;

    public static void d(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            Bitmaps.a(bitmap, bitmap2);
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // defpackage.b5i
    public w14<Bitmap> a(Bitmap bitmap, f0i f0iVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f39945a;
        }
        w14<Bitmap> w14VarD = f0iVar.d(width, height, config);
        try {
            f(w14VarD.n(), bitmap);
            return w14.d(w14VarD);
        } finally {
            w14.l(w14VarD);
        }
    }

    @Override // defpackage.b5i
    public c93 b() {
        return null;
    }

    public void e(Bitmap bitmap) {
    }

    public void f(Bitmap bitmap, Bitmap bitmap2) {
        d(bitmap, bitmap2);
        e(bitmap);
    }

    @Override // defpackage.b5i
    public String getName() {
        return "Unknown postprocessor";
    }
}
