package dg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldg/e;", "", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f59476a = new e();

    private e() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (lf.g.b(r0.getWidth(), r0.getHeight(), (int) (r4 >> 32), (int) (r4 & 4294967295L), r11) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap a(Drawable drawable, Bitmap.Config config, xf.g gVar, xf.f fVar, boolean z14) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap.getConfig() == ((config == null || config == Bitmap.Config.HARDWARE) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z14) {
                    long jA = lf.g.a(bitmap.getWidth(), bitmap.getHeight(), gVar, fVar, xf.g.f190618c);
                }
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iB = u.b(drawableMutate);
        if (iB <= 0) {
            iB = 512;
        }
        int iA = u.a(drawableMutate);
        int i14 = iA > 0 ? iA : 512;
        long jA2 = lf.g.a(iB, i14, gVar, fVar, xf.g.f190618c);
        double dB = lf.g.b(iB, i14, (int) (jA2 >> 32), (int) (4294967295L & jA2), fVar);
        int iB2 = MathKt.b(((double) iB) * dB);
        int iB3 = MathKt.b(dB * ((double) i14));
        if (config == null || config == Bitmap.Config.HARDWARE) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iB2, iB3, config);
        Rect bounds = drawableMutate.getBounds();
        int i15 = bounds.left;
        int i16 = bounds.top;
        int i17 = bounds.right;
        int i18 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iB2, iB3);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i15, i16, i17, i18);
        return bitmapCreateBitmap;
    }
}
