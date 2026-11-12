package androidx.compose.ui.graphics.colorspace;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0014\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u001c\u0010\u0018\u001a\u00020\u00178\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Illuminant;", "", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getA", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "B", "getB", "C", "getC", "D50", "getD50", "D55", "getD55", "D60", "getD60", "D65", "getD65", "D75", "getD75", "E", "getE", "", "D50Xyz", "[F", "getD50Xyz$ui_graphics_release", "()[F", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 5, 1})
public final class Illuminant {

    @NotNull
    public static final Illuminant INSTANCE = new Illuminant();

    @NotNull
    private static final WhitePoint A = new WhitePoint(0.44757f, 0.40745f);

    @NotNull
    private static final WhitePoint B = new WhitePoint(0.34842f, 0.35161f);

    @NotNull
    private static final WhitePoint C = new WhitePoint(0.31006f, 0.31616f);

    @NotNull
    private static final WhitePoint D50 = new WhitePoint(0.34567f, 0.3585f);

    @NotNull
    private static final WhitePoint D55 = new WhitePoint(0.33242f, 0.34743f);

    @NotNull
    private static final WhitePoint D60 = new WhitePoint(0.32168f, 0.33767f);

    @NotNull
    private static final WhitePoint D65 = new WhitePoint(0.31271f, 0.32902f);

    @NotNull
    private static final WhitePoint D75 = new WhitePoint(0.29902f, 0.31485f);

    @NotNull
    private static final WhitePoint E = new WhitePoint(0.33333f, 0.33333f);

    @NotNull
    private static final float[] D50Xyz = {0.964212f, 1.0f, 0.825188f};

    private Illuminant() {
    }

    @NotNull
    public final WhitePoint getA() {
        return A;
    }

    @NotNull
    public final WhitePoint getB() {
        return B;
    }

    @NotNull
    public final WhitePoint getC() {
        return C;
    }

    @NotNull
    public final WhitePoint getD50() {
        return D50;
    }

    @NotNull
    public final float[] getD50Xyz$ui_graphics_release() {
        return D50Xyz;
    }

    @NotNull
    public final WhitePoint getD55() {
        return D55;
    }

    @NotNull
    public final WhitePoint getD60() {
        return D60;
    }

    @NotNull
    public final WhitePoint getD65() {
        return D65;
    }

    @NotNull
    public final WhitePoint getD75() {
        return D75;
    }

    @NotNull
    public final WhitePoint getE() {
        return E;
    }
}
