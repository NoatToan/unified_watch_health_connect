package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.collection.LruCache;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.DefaultFontFamily;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.ResourceFont;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0019\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J5\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ;\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0016\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/platform/TypefaceAdapter;", "", "", "genericFontFamily", "Landroidx/compose/ui/text/font/FontWeight;", b.L, "Landroidx/compose/ui/text/font/FontStyle;", b.I, "Landroid/graphics/Typeface;", "create-RetOiIg", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "create", "Landroidx/compose/ui/text/font/FontListFontFamily;", b.K, "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "create-xC2X5gM", "(ILandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontListFontFamily;I)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/FontFamily;", "create-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getResourceLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "<init>", "(Landroidx/compose/ui/text/font/FontMatcher;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "Companion", "CacheKey", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public class TypefaceAdapter {

    @NotNull
    private final FontMatcher fontMatcher;

    @NotNull
    private final Font.ResourceLoader resourceLoader;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final FontWeight ANDROID_BOLD = FontWeight.INSTANCE.getW600();

    @NotNull
    private static final LruCache<CacheKey, Typeface> typefaceCache = new LruCache<>(16);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J;\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R%\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/platform/TypefaceAdapter$Companion;", "", "", "isBold", "isItalic", "", "getTypefaceStyle", "Landroid/graphics/Typeface;", "typeface", "Landroidx/compose/ui/text/font/Font;", "font", "Landroidx/compose/ui/text/font/FontWeight;", b.L, "Landroidx/compose/ui/text/font/FontStyle;", b.I, "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "synthesize-Wqqsr6A", "(Landroid/graphics/Typeface;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "synthesize", "getTypefaceStyle-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)I", "Landroidx/collection/LruCache;", "Landroidx/compose/ui/text/platform/TypefaceAdapter$CacheKey;", "typefaceCache", "Landroidx/collection/LruCache;", "getTypefaceCache", "()Landroidx/collection/LruCache;", "ANDROID_BOLD", "Landroidx/compose/ui/text/font/FontWeight;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int getTypefaceStyle(boolean isBold, boolean isItalic) {
            if (isItalic && isBold) {
                return 3;
            }
            if (isBold) {
                return 1;
            }
            return isItalic ? 2 : 0;
        }

        @NotNull
        public final LruCache<CacheKey, Typeface> getTypefaceCache() {
            return TypefaceAdapter.typefaceCache;
        }

        /* JADX INFO: renamed from: getTypefaceStyle-FO1MlWM, reason: not valid java name */
        public final int m2858getTypefaceStyleFO1MlWM(@NotNull FontWeight fontWeight, int fontStyle) {
            return getTypefaceStyle(fontWeight.compareTo(TypefaceAdapter.ANDROID_BOLD) >= 0, FontStyle.m2760equalsimpl0(fontStyle, FontStyle.INSTANCE.m2764getItalic_LCdwA()));
        }

        @NotNull
        /* JADX INFO: renamed from: synthesize-Wqqsr6A, reason: not valid java name */
        public final Typeface m2859synthesizeWqqsr6A(@NotNull Typeface typeface, @NotNull Font font, @NotNull FontWeight fontWeight, int fontStyle, int fontSynthesis) {
            boolean z = FontSynthesis.m2772isWeightOnimpl$ui_text_release(fontSynthesis) && fontWeight.compareTo(TypefaceAdapter.ANDROID_BOLD) >= 0 && font.getWeight().compareTo(TypefaceAdapter.ANDROID_BOLD) < 0;
            boolean z2 = FontSynthesis.m2771isStyleOnimpl$ui_text_release(fontSynthesis) && !FontStyle.m2760equalsimpl0(fontStyle, font.getStyle());
            if (!z2 && !z) {
                return typeface;
            }
            if (Build.VERSION.SDK_INT < 28) {
                return Typeface.create(typeface, getTypefaceStyle(z, z2 && FontStyle.m2760equalsimpl0(fontStyle, FontStyle.INSTANCE.m2764getItalic_LCdwA())));
            }
            return TypefaceAdapterHelperMethods.INSTANCE.create(typeface, z ? fontWeight.getWeight() : font.getWeight().getWeight(), z2 ? FontStyle.m2760equalsimpl0(fontStyle, FontStyle.INSTANCE.m2764getItalic_LCdwA()) : FontStyle.m2760equalsimpl0(font.getStyle(), FontStyle.INSTANCE.m2764getItalic_LCdwA()));
        }
    }

    public TypefaceAdapter(@NotNull FontMatcher fontMatcher, @NotNull Font.ResourceLoader resourceLoader) {
        this.fontMatcher = fontMatcher;
        this.resourceLoader = resourceLoader;
    }

    /* JADX INFO: renamed from: create-DPcqOEQ$default, reason: not valid java name */
    public static /* synthetic */ Typeface m2846createDPcqOEQ$default(TypefaceAdapter typefaceAdapter, FontFamily fontFamily, FontWeight fontWeight, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create-DPcqOEQ");
        }
        if ((i3 & 1) != 0) {
            fontFamily = null;
        }
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i3 & 4) != 0) {
            i = FontStyle.INSTANCE.m2765getNormal_LCdwA();
        }
        if ((i3 & 8) != 0) {
            i2 = FontSynthesis.INSTANCE.m2775getAllGVVA2EU();
        }
        return typefaceAdapter.m2851createDPcqOEQ(fontFamily, fontWeight, i, i2);
    }

    /* JADX INFO: renamed from: create-RetOiIg, reason: not valid java name */
    private final Typeface m2847createRetOiIg(String genericFontFamily, FontWeight fontWeight, int fontStyle) {
        FontStyle.Companion companion = FontStyle.INSTANCE;
        boolean z = true;
        if (FontStyle.m2760equalsimpl0(fontStyle, companion.m2765getNormal_LCdwA()) && Intrinsics.areEqual(fontWeight, FontWeight.INSTANCE.getNormal())) {
            if (genericFontFamily == null || genericFontFamily.length() == 0) {
                return Typeface.DEFAULT;
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return TypefaceAdapterHelperMethods.INSTANCE.create(genericFontFamily == null ? Typeface.DEFAULT : Typeface.create(genericFontFamily, 0), fontWeight.getWeight(), FontStyle.m2760equalsimpl0(fontStyle, companion.m2764getItalic_LCdwA()));
        }
        int iM2858getTypefaceStyleFO1MlWM = INSTANCE.m2858getTypefaceStyleFO1MlWM(fontWeight, fontStyle);
        if (genericFontFamily != null && genericFontFamily.length() != 0) {
            z = false;
        }
        return z ? Typeface.defaultFromStyle(iM2858getTypefaceStyleFO1MlWM) : Typeface.create(genericFontFamily, iM2858getTypefaceStyleFO1MlWM);
    }

    /* JADX INFO: renamed from: create-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Typeface m2848createRetOiIg$default(TypefaceAdapter typefaceAdapter, String str, FontWeight fontWeight, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create-RetOiIg");
        }
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.INSTANCE.m2765getNormal_LCdwA();
        }
        return typefaceAdapter.m2847createRetOiIg(str, fontWeight, i);
    }

    /* JADX INFO: renamed from: create-xC2X5gM, reason: not valid java name */
    private final Typeface m2849createxC2X5gM(int fontStyle, FontWeight fontWeight, FontListFontFamily fontFamily, int fontSynthesis) {
        Typeface typefaceInternal;
        Font fontM2755matchFontRetOiIg = this.fontMatcher.m2755matchFontRetOiIg(fontFamily, fontWeight, fontStyle);
        try {
            if (fontM2755matchFontRetOiIg instanceof ResourceFont) {
                typefaceInternal = (Typeface) this.resourceLoader.load(fontM2755matchFontRetOiIg);
            } else {
                if (!(fontM2755matchFontRetOiIg instanceof AndroidFont)) {
                    throw new IllegalStateException(Intrinsics.stringPlus("Unknown font type: ", fontM2755matchFontRetOiIg));
                }
                typefaceInternal = ((AndroidFont) fontM2755matchFontRetOiIg).getTypefaceInternal();
            }
            Typeface typeface = typefaceInternal;
            return (FontSynthesis.m2769equalsimpl0(fontSynthesis, FontSynthesis.INSTANCE.m2776getNoneGVVA2EU()) || (Intrinsics.areEqual(fontWeight, fontM2755matchFontRetOiIg.getWeight()) && FontStyle.m2760equalsimpl0(fontStyle, fontM2755matchFontRetOiIg.getStyle()))) ? typeface : INSTANCE.m2859synthesizeWqqsr6A(typeface, fontM2755matchFontRetOiIg, fontWeight, fontStyle, fontSynthesis);
        } catch (Exception e) {
            throw new IllegalStateException(Intrinsics.stringPlus("Cannot create Typeface from ", fontM2755matchFontRetOiIg), e);
        }
    }

    /* JADX INFO: renamed from: create-xC2X5gM$default, reason: not valid java name */
    public static /* synthetic */ Typeface m2850createxC2X5gM$default(TypefaceAdapter typefaceAdapter, int i, FontWeight fontWeight, FontListFontFamily fontListFontFamily, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create-xC2X5gM");
        }
        if ((i3 & 1) != 0) {
            i = FontStyle.INSTANCE.m2765getNormal_LCdwA();
        }
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i3 & 8) != 0) {
            i2 = FontSynthesis.INSTANCE.m2775getAllGVVA2EU();
        }
        return typefaceAdapter.m2849createxC2X5gM(i, fontWeight, fontListFontFamily, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: create-DPcqOEQ, reason: not valid java name */
    public Typeface m2851createDPcqOEQ(@Nullable FontFamily fontFamily, @NotNull FontWeight fontWeight, int fontStyle, int fontSynthesis) {
        Typeface typefaceMo2838getNativeTypefacePYhJU0U;
        CacheKey cacheKey = new CacheKey(fontFamily, fontWeight, fontStyle, fontSynthesis, null);
        LruCache<CacheKey, Typeface> lruCache = typefaceCache;
        Typeface typeface = lruCache.get(cacheKey);
        if (typeface != null) {
            return typeface;
        }
        if (fontFamily instanceof FontListFontFamily) {
            typefaceMo2838getNativeTypefacePYhJU0U = m2849createxC2X5gM(fontStyle, fontWeight, (FontListFontFamily) fontFamily, fontSynthesis);
        } else if (fontFamily instanceof GenericFontFamily) {
            typefaceMo2838getNativeTypefacePYhJU0U = m2847createRetOiIg(((GenericFontFamily) fontFamily).getName(), fontWeight, fontStyle);
        } else {
            boolean z = true;
            if (!(fontFamily instanceof DefaultFontFamily) && fontFamily != null) {
                z = false;
            }
            if (z) {
                typefaceMo2838getNativeTypefacePYhJU0U = m2847createRetOiIg(null, fontWeight, fontStyle);
            } else {
                if (!(fontFamily instanceof LoadedFontFamily)) {
                    throw new NoWhenBranchMatchedException();
                }
                typefaceMo2838getNativeTypefacePYhJU0U = ((AndroidTypeface) ((LoadedFontFamily) fontFamily).getTypeface()).mo2838getNativeTypefacePYhJU0U(fontWeight, fontStyle, fontSynthesis);
            }
        }
        lruCache.put(cacheKey, typefaceMo2838getNativeTypefacePYhJU0U);
        return typefaceMo2838getNativeTypefacePYhJU0U;
    }

    @NotNull
    public final FontMatcher getFontMatcher() {
        return this.fontMatcher;
    }

    @NotNull
    public final Font.ResourceLoader getResourceLoader() {
        return this.resourceLoader;
    }

    public /* synthetic */ TypefaceAdapter(FontMatcher fontMatcher, Font.ResourceLoader resourceLoader, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new FontMatcher() : fontMatcher, resourceLoader);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B.\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\t\u001a\u00020\u0006HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\nHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\bJ@\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b#\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/text/platform/TypefaceAdapter$CacheKey;", "", "Landroidx/compose/ui/text/font/FontFamily;", "component1", "Landroidx/compose/ui/text/font/FontWeight;", "component2", "Landroidx/compose/ui/text/font/FontStyle;", "component3-_-LCdwA", "()I", "component3", "Landroidx/compose/ui/text/font/FontSynthesis;", "component4-GVVA2EU", "component4", b.K, b.L, b.I, "fontSynthesis", "copy-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/ui/text/platform/TypefaceAdapter$CacheKey;", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", LogUtil.I, "getFontStyle-_-LCdwA", "getFontSynthesis-GVVA2EU", "<init>", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class CacheKey {

        @Nullable
        private final FontFamily fontFamily;
        private final int fontStyle;
        private final int fontSynthesis;

        @NotNull
        private final FontWeight fontWeight;

        private CacheKey(FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
            this.fontFamily = fontFamily;
            this.fontWeight = fontWeight;
            this.fontStyle = i;
            this.fontSynthesis = i2;
        }

        public /* synthetic */ CacheKey(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(fontFamily, fontWeight, i, i2);
        }

        /* JADX INFO: renamed from: copy-DPcqOEQ$default, reason: not valid java name */
        public static /* synthetic */ CacheKey m2852copyDPcqOEQ$default(CacheKey cacheKey, FontFamily fontFamily, FontWeight fontWeight, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                fontFamily = cacheKey.fontFamily;
            }
            if ((i3 & 2) != 0) {
                fontWeight = cacheKey.fontWeight;
            }
            if ((i3 & 4) != 0) {
                i = cacheKey.fontStyle;
            }
            if ((i3 & 8) != 0) {
                i2 = cacheKey.fontSynthesis;
            }
            return cacheKey.m2855copyDPcqOEQ(fontFamily, fontWeight, i, i2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FontFamily getFontFamily() {
            return this.fontFamily;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final FontWeight getFontWeight() {
            return this.fontWeight;
        }

        /* JADX INFO: renamed from: component3-_-LCdwA, reason: not valid java name and from getter */
        public final int getFontStyle() {
            return this.fontStyle;
        }

        /* JADX INFO: renamed from: component4-GVVA2EU, reason: not valid java name and from getter */
        public final int getFontSynthesis() {
            return this.fontSynthesis;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-DPcqOEQ, reason: not valid java name */
        public final CacheKey m2855copyDPcqOEQ(@Nullable FontFamily fontFamily, @NotNull FontWeight fontWeight, int fontStyle, int fontSynthesis) {
            return new CacheKey(fontFamily, fontWeight, fontStyle, fontSynthesis, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheKey)) {
                return false;
            }
            CacheKey cacheKey = (CacheKey) other;
            return Intrinsics.areEqual(this.fontFamily, cacheKey.fontFamily) && Intrinsics.areEqual(this.fontWeight, cacheKey.fontWeight) && FontStyle.m2760equalsimpl0(this.fontStyle, cacheKey.fontStyle) && FontSynthesis.m2769equalsimpl0(this.fontSynthesis, cacheKey.fontSynthesis);
        }

        @Nullable
        public final FontFamily getFontFamily() {
            return this.fontFamily;
        }

        /* JADX INFO: renamed from: getFontStyle-_-LCdwA, reason: not valid java name */
        public final int m2856getFontStyle_LCdwA() {
            return this.fontStyle;
        }

        /* JADX INFO: renamed from: getFontSynthesis-GVVA2EU, reason: not valid java name */
        public final int m2857getFontSynthesisGVVA2EU() {
            return this.fontSynthesis;
        }

        @NotNull
        public final FontWeight getFontWeight() {
            return this.fontWeight;
        }

        public int hashCode() {
            FontFamily fontFamily = this.fontFamily;
            return ((((((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + FontStyle.m2761hashCodeimpl(this.fontStyle)) * 31) + FontSynthesis.m2770hashCodeimpl(this.fontSynthesis);
        }

        @NotNull
        public String toString() {
            return "CacheKey(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + ((Object) FontStyle.m2762toStringimpl(this.fontStyle)) + ", fontSynthesis=" + ((Object) FontSynthesis.m2773toStringimpl(this.fontSynthesis)) + ')';
        }

        public /* synthetic */ CacheKey(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : fontFamily, fontWeight, i, i2, null);
        }
    }
}
