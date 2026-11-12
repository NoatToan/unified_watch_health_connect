package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#BB\u0012\u0006\u0010\u0017\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u001c\b\u0002\u0010 \u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u001f\u0018\u00010\u001e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b!\u0010\"J-\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u00020\u00168\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/FontWeight;", b.L, "Landroidx/compose/ui/text/font/FontStyle;", b.I, "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", "Landroid/graphics/Typeface;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getNativeTypeface", "Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher$1", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher", "", "Landroidx/compose/ui/text/font/Font;", "loadedTypefaces", "Ljava/util/Map;", "Landroidx/compose/ui/text/font/FontFamily;", b.K, "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lkotlin/Pair;", "necessaryStyles", "<init>", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroid/content/Context;Ljava/util/List;Landroidx/compose/ui/text/font/FontMatcher;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class AndroidFontListTypeface implements AndroidTypeface {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    private static final FontMatcher fontMatcher = new FontMatcher();

    @NotNull
    private final FontFamily fontFamily;

    /* JADX INFO: renamed from: fontMatcher$1, reason: from kotlin metadata */
    @NotNull
    private final FontMatcher fontMatcher;

    @NotNull
    private final Map<Font, Typeface> loadedTypefaces;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface$Companion;", "", "Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FontMatcher getFontMatcher() {
            return AndroidFontListTypeface.fontMatcher;
        }
    }

    public AndroidFontListTypeface(@NotNull FontListFontFamily fontListFontFamily, @NotNull Context context, @Nullable List<Pair<FontWeight, FontStyle>> list, @NotNull FontMatcher fontMatcher2) {
        List<Font> list2;
        this.fontMatcher = fontMatcher2;
        int i = 0;
        if (list == null) {
            list2 = null;
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size() - 1;
            if (size >= 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    Pair<FontWeight, FontStyle> pair = list.get(i2);
                    arrayList.add(getFontMatcher().m2755matchFontRetOiIg(fontListFontFamily, pair.component1(), pair.component2().m2763unboximpl()));
                    if (i3 > size) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            list2 = CollectionsKt___CollectionsKt.toList(new LinkedHashSet(arrayList));
        }
        list2 = list2 == null ? fontListFontFamily.getFonts() : list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size2 = list2.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i4 = i + 1;
                Font font = list2.get(i);
                try {
                    linkedHashMap.put(font, AndroidTypefaceCache.INSTANCE.getOrCreate(context, font));
                    if (i4 > size2) {
                        break;
                    } else {
                        i = i4;
                    }
                } catch (Exception unused) {
                    throw new IllegalStateException(Intrinsics.stringPlus("Cannot create Typeface from ", font));
                }
            }
        }
        this.loadedTypefaces = linkedHashMap;
        this.fontFamily = fontListFontFamily;
    }

    @Override // androidx.compose.ui.text.font.Typeface
    @NotNull
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @NotNull
    public final FontMatcher getFontMatcher() {
        return this.fontMatcher;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    @NotNull
    /* JADX INFO: renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo2838getNativeTypefacePYhJU0U(@NotNull FontWeight fontWeight, int fontStyle, int synthesis) {
        Font fontM2756matchFontRetOiIg = this.fontMatcher.m2756matchFontRetOiIg(this.loadedTypefaces.keySet(), fontWeight, fontStyle);
        Typeface typeface = this.loadedTypefaces.get(fontM2756matchFontRetOiIg);
        if (typeface != null) {
            return ((Intrinsics.areEqual(fontM2756matchFontRetOiIg.getWeight(), fontWeight) && FontStyle.m2760equalsimpl0(fontM2756matchFontRetOiIg.getStyle(), fontStyle)) || FontSynthesis.m2769equalsimpl0(synthesis, FontSynthesis.INSTANCE.m2776getNoneGVVA2EU())) ? typeface : TypefaceAdapter.INSTANCE.m2859synthesizeWqqsr6A(typeface, fontM2756matchFontRetOiIg, fontWeight, fontStyle, synthesis);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public /* synthetic */ AndroidFontListTypeface(FontListFontFamily fontListFontFamily, Context context, List list, FontMatcher fontMatcher2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontListFontFamily, context, (i & 4) != 0 ? null : list, (i & 8) != 0 ? fontMatcher : fontMatcher2);
    }
}
