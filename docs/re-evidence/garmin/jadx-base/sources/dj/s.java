package dj;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ColorMatrixColorFilter f59864a = new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f});

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final qj.f f59865a = new qj.f(new com.nimbusds.jose.shaded.gson.internal.a());

        private b() {
        }
    }

    private s() {
    }

    public static Bitmap a(InputStream inputStream, BitmapFactory.Options options, u uVar) throws Throwable {
        boolean zC;
        int i14 = Build.VERSION.SDK_INT;
        Bitmap bitmapB = null;
        if (i14 == 34) {
            qj.f fVar = b.f59865a;
            if ((i14 == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) b.f59865a.get()).booleanValue() : false) {
                try {
                    zC = uVar.c();
                } catch (IOException unused) {
                    zC = false;
                }
                if (zC) {
                    Bitmap.Config config = options.inPreferredConfig;
                    Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                    qj.l.a(config == config2, "");
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                        if (bitmapDecodeStream == null) {
                            if (bitmapDecodeStream != null) {
                            }
                            options.inPreferredConfig = config2;
                            return bitmapB;
                        }
                        try {
                            bitmapB = b(bitmapDecodeStream);
                        } catch (Throwable th3) {
                            th = th3;
                            bitmapB = bitmapDecodeStream;
                            if (bitmapB != null) {
                                bitmapB.recycle();
                            }
                            options.inPreferredConfig = Bitmap.Config.HARDWARE;
                            throw th;
                        }
                        bitmapDecodeStream.recycle();
                        options.inPreferredConfig = config2;
                        return bitmapB;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            }
        }
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static Bitmap b(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            Bitmap.Config config = gainmap.getGainmapContents().getConfig();
            Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
            if (config == config2) {
                ColorMatrixColorFilter colorMatrixColorFilter = a.f59864a;
                Bitmap gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == config2) {
                    qj.l.a(gainmapContents.getConfig() == config2, "");
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(a.f59864a);
                    canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
                    canvas.setBitmap(null);
                    Gainmap gainmapY = androidx.camera.camera2.internal.compat.g.y(bitmapCreateBitmap);
                    float[] ratioMin = gainmap.getRatioMin();
                    gainmapY.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    float[] ratioMax = gainmap.getRatioMax();
                    gainmapY.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    float[] gamma = gainmap.getGamma();
                    gainmapY.setGamma(gamma[0], gamma[1], gamma[2]);
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    gainmapY.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    gainmapY.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    gainmapY.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                    gainmapY.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                    gainmap = gainmapY;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }
}
