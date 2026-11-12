package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import com.google.android.exoplayer2.text.ttml.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J-\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\tR\u001c\u0010\u0013\u001a\u00020\u00128\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8\u0002@\u0003X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/platform/AndroidGenericFontFamilyTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/FontWeight;", b.L, "Landroidx/compose/ui/text/font/FontStyle;", b.I, "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "buildStyledTypeface-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "buildStyledTypeface", "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getNativeTypeface", "getOrPut-FO1MlWM", "getOrPut", "Landroidx/compose/ui/text/font/FontFamily;", b.K, "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "nativeTypeface", "Landroid/graphics/Typeface;", "", "lock", "Ljava/lang/Object;", "Landroidx/collection/SparseArrayCompat;", "styledCache", "Landroidx/collection/SparseArrayCompat;", "Landroidx/compose/ui/text/font/GenericFontFamily;", "<init>", "(Landroidx/compose/ui/text/font/GenericFontFamily;)V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {

    @NotNull
    private final FontFamily fontFamily;

    @NotNull
    private final Typeface nativeTypeface;

    @NotNull
    private final Object lock = new Object();

    @GuardedBy("lock")
    @NotNull
    private final SparseArrayCompat<Typeface> styledCache = new SparseArrayCompat<>(4);

    public AndroidGenericFontFamilyTypeface(@NotNull GenericFontFamily genericFontFamily) {
        this.fontFamily = genericFontFamily;
        this.nativeTypeface = Typeface.create(genericFontFamily.getName(), 0);
    }

    /* JADX INFO: renamed from: buildStyledTypeface-FO1MlWM, reason: not valid java name */
    private final Typeface m2839buildStyledTypefaceFO1MlWM(FontWeight fontWeight, int fontStyle) {
        return Build.VERSION.SDK_INT < 28 ? Typeface.create(this.nativeTypeface, TypefaceAdapter.INSTANCE.m2858getTypefaceStyleFO1MlWM(fontWeight, fontStyle)) : TypefaceAdapterHelperMethods.INSTANCE.create(this.nativeTypeface, fontWeight.getWeight(), FontStyle.m2760equalsimpl0(fontStyle, FontStyle.INSTANCE.m2764getItalic_LCdwA()));
    }

    @Override // androidx.compose.ui.text.font.Typeface
    @NotNull
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    @NotNull
    /* JADX INFO: renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo2838getNativeTypefacePYhJU0U(@NotNull FontWeight fontWeight, int fontStyle, int synthesis) {
        return m2840getOrPutFO1MlWM(fontWeight, fontStyle);
    }

    @NotNull
    /* JADX INFO: renamed from: getOrPut-FO1MlWM, reason: not valid java name */
    public final Typeface m2840getOrPutFO1MlWM(@NotNull FontWeight fontWeight, int fontStyle) {
        Typeface typefaceM2839buildStyledTypefaceFO1MlWM;
        int weight = (fontWeight.getWeight() << 1) | (FontStyle.m2760equalsimpl0(fontStyle, FontStyle.INSTANCE.m2764getItalic_LCdwA()) ? 1 : 0);
        synchronized (this.lock) {
            typefaceM2839buildStyledTypefaceFO1MlWM = this.styledCache.get(weight == true ? 1 : 0);
            if (typefaceM2839buildStyledTypefaceFO1MlWM == null) {
                typefaceM2839buildStyledTypefaceFO1MlWM = m2839buildStyledTypefaceFO1MlWM(fontWeight, fontStyle);
                this.styledCache.append(weight == true ? 1 : 0, typefaceM2839buildStyledTypefaceFO1MlWM);
            }
        }
        return typefaceM2839buildStyledTypefaceFO1MlWM;
    }
}
