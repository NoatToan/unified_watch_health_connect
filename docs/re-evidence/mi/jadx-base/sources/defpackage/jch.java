package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import androidx.core.util.Pools;
import com.facebook.imagepipeline.platform.a;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(26)
public class jch extends a {
    public jch(bq2 bq2Var, int i, Pools.SynchronizedPool synchronizedPool) {
        super(bq2Var, i, synchronizedPool);
    }

    public static boolean f(BitmapFactory.Options options) {
        ColorSpace colorSpace = options.outColorSpace;
        return (colorSpace == null || !colorSpace.isWideGamut() || options.inPreferredConfig == Bitmap.Config.RGBA_F16) ? false : true;
    }

    @Override // com.facebook.imagepipeline.platform.a
    public int d(int i, int i2, BitmapFactory.Options options) {
        return f(options) ? i * i2 * 8 : jq2.d(i, i2, options.inPreferredConfig);
    }
}
