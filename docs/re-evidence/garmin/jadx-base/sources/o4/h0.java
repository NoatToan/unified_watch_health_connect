package o4;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import ch.qos.logback.core.CoreConstants;
import com.google.maps.android.BuildConfig;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lo4/h0;", "Lo4/e0;", "Lo4/g0;", "colorMatrix", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "([FLandroid/graphics/ColorFilter;Lkotlin/jvm/internal/j;)V", "([FLkotlin/jvm/internal/j;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 extends e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f128862c;

    private h0(float[] fArr) {
        this(fArr, new ColorMatrixColorFilter(fArr), null);
    }

    public final float[] a() {
        float[] fArr = this.f128862c;
        if (fArr != null) {
            return fArr;
        }
        ColorFilter colorFilter = this.f128844a;
        if (!(colorFilter instanceof ColorMatrixColorFilter)) {
            vb.h.s("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
            return null;
        }
        i0.f128868a.getClass();
        ColorMatrix colorMatrix = new ColorMatrix();
        ((ColorMatrixColorFilter) colorFilter).getColorMatrix(colorMatrix);
        float[] array = colorMatrix.getArray();
        this.f128862c = array;
        return array;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Arrays.equals(a(), ((h0) obj).a());
    }

    public final int hashCode() {
        float[] fArr = this.f128862c;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f128862c;
        if (fArr == null) {
            str = BuildConfig.TRAVIS;
        } else {
            str = "ColorMatrix(values=" + Arrays.toString(fArr) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        sb3.append((Object) str);
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    public /* synthetic */ h0(float[] fArr, p005kotlin.jvm.internal.j jVar) {
        this(fArr);
    }

    public /* synthetic */ h0(float[] fArr, ColorFilter colorFilter, p005kotlin.jvm.internal.j jVar) {
        this(fArr, colorFilter);
    }

    private h0(float[] fArr, ColorFilter colorFilter) {
        super(colorFilter);
        this.f128862c = fArr;
    }
}
