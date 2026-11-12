package com.xiaomi.fitness.common.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.icu.number.LocalizedNumberFormatter;
import android.icu.number.NumberFormatter;
import android.icu.number.Precision;
import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.icu.util.MeasureUnit;
import android.os.Build;
import android.text.BidiFormatter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ReplacementSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.miui.tsmclient.net.TSMAuthContants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.ano;
import defpackage.bno;
import defpackage.dno;
import defpackage.fno;
import defpackage.gv5;
import defpackage.ni4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt__StringBuilderJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0007STUVWXYB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\r\u001a\u00020\u000e*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0080\u0001\u0010\u0015\u001a\u00020\u000e*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001aJ\u0080\u0001\u0010\u0015\u001a\u00020\u000e*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001aJ\u008a\u0001\u0010\u0015\u001a\u00020\u000e*\u00020\u00102\b\b\u0001\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001aJf\u0010%\u001a\u00020\u000e*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001a2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014J:\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002JB\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001aJ(\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010,\u001a\b\u0012\u0004\u0012\u00020!0\u001aH\u0002J\u001c\u0010-\u001a\u00020#*\u00020\u00052\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020#H\u0002J\u001e\u00100\u001a\u000201*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u00102\u001a\u00020#H\u0002J\u0018\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001f*\u00020\u0005H\u0002JF\u00104\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00106\u001a\u0002012\u0006\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020#2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001f2\b\b\u0002\u0010:\u001a\u00020#H\u0002J\u001a\u0010;\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0005H\u0002J0\u0010<\u001a\u0002052\u0006\u00106\u001a\u0002012\u0006\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020#2\u0006\u0010=\u001a\u00020\u00052\u0006\u0010:\u001a\u00020#H\u0002J\u0018\u0010>\u001a\u00020#2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010?\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00106\u001a\u000201H\u0002J8\u0010@\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00106\u001a\u0002012\u0006\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020#2\u0006\u0010A\u001a\u00020\u00052\u0006\u0010:\u001a\u00020#H\u0002Ja\u0010B\u001a\u0002052\u0006\u00106\u001a\u0002012\u0006\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020#2\u0006\u0010C\u001a\u00020#2\u0006\u0010D\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010:\u001a\u00020#2\b\u0010E\u001a\u0004\u0018\u00010\u00142\u0006\u0010F\u001a\u00020\u00142\b\u0010G\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0002\u0010HJ,\u0010I\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020K0J2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010L\u001a\u00020#2\u0006\u0010M\u001a\u00020KH\u0002J\"\u0010N\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010L\u001a\u00020#2\b\b\u0002\u0010O\u001a\u00020KH\u0002J\u0018\u0010P\u001a\u00020#2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020#X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Z"}, d2 = {"Lcom/xiaomi/fitness/common/utils/StyledStringUtils;", "", "<init>", "()V", "TAG_INLINE", "", "PLACEHOLDER_REGEX", "Lkotlin/text/Regex;", "DIGIT_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "STYLE_TAG_REGEX", "parseCssStyledText", "Landroid/text/SpannableString;", "ctx", "Landroid/content/Context;", "locale", "Ljava/util/Locale;", "bidiIsolate", "", "getStyledString", "templateOrResId", "overallStyle", "Lcom/xiaomi/fitness/common/utils/StyledStringUtils$CssStyle;", "args", "", "Lcom/xiaomi/fitness/common/utils/StyledStringUtils$StyledArg;", "enableFormat", "numberStyle", "keywords", "", "keywordLocators", "Lcom/xiaomi/fitness/common/utils/StyledStringUtils$SegmentStyle;", "resId", "", "quantity", "styleSmart", "buildTemplateWithArgs", "template", "applySmartStyles", "source", "buildHtmlBySegments", "raw", "segmentStyles", "indexOfNth", "sub", "nth", "parseCssStyled", "Landroid/text/SpannableStringBuilder;", "depth", "toCssAttrMap", "applySpans", "", "sb", "s", PluginDeviceInfo.FICONOFFLINE, "attrs", "flag", "buildFontSizeSpan", "applyWeight", "rawValue", "parseColor", "finalizeMarginSpans", "applyMargin", "v", "insertMargin", "startPx", "endPx", "forceRv", "avoidBoundary", "refSizePx", "(Landroid/text/SpannableStringBuilder;IIIILandroid/content/Context;ILjava/lang/Boolean;ZLjava/lang/Integer;)V", "calcSpacesAndRatio", "Lkotlin/Pair;", "", "expectedPx", "textSizePx", "estimateSpaceCount", "measuredTextSize", "parseSizePx", "SP", "defaultMeasurePx", "CssStyle", "StyledArg", "Locator", "SegmentStyle", "Orientation", "PendingMarginSpan", "SpacerSpan", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStyledStringUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StyledStringUtils.kt\ncom/xiaomi/fitness/common/utils/StyledStringUtils\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 7 Color.kt\nandroidx/core/graphics/ColorKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1251:1\n216#2,2:1252\n216#2,2:1257\n216#2,2:1272\n1317#3:1254\n1318#3:1256\n1#4:1255\n1863#5,2:1259\n1863#5,2:1261\n1010#5,2:1263\n1863#5,2:1265\n774#5:1267\n865#5,2:1268\n1863#5,2:1270\n1557#5:1278\n1628#5,3:1279\n774#5:1287\n865#5,2:1288\n1863#5,2:1290\n1069#6,2:1274\n1069#6,2:1276\n470#7:1282\n470#7:1283\n470#7:1284\n13402#8,2:1285\n*S KotlinDebug\n*F\n+ 1 StyledStringUtils.kt\ncom/xiaomi/fitness/common/utils/StyledStringUtils\n*L\n377#1:1252,2\n551#1:1257,2\n781#1:1272,2\n413#1:1254\n413#1:1256\n557#1:1259,2\n613#1:1261,2\n631#1:1263,2\n649#1:1265,2\n690#1:1267\n690#1:1268,2\n739#1:1270,2\n928#1:1278\n928#1:1279,3\n1091#1:1287\n1091#1:1288,2\n1103#1:1290,2\n916#1:1274,2\n921#1:1276,2\n934#1:1282\n938#1:1283\n945#1:1284\n1020#1:1285,2\n*E\n"})
public final class StyledStringUtils {
    private static final int SP = 33;

    @NotNull
    private static final String TAG_INLINE = "span";

    @NotNull
    public static final StyledStringUtils INSTANCE = new StyledStringUtils();

    @NotNull
    private static final Regex PLACEHOLDER_REGEX = new Regex("%(?:\\d+\\$)?[\\d.]*[dfps]");
    private static final Pattern DIGIT_PATTERN = Pattern.compile("\\p{Nd}+");

    @NotNull
    private static final Regex STYLE_TAG_REGEX = new Regex("<style\\s+(?:style=)?\\\"([^\\\"]*)\\\">([\\s\\S]*?)</style>", (Set<? extends RegexOption>) SetsKt__SetsKt.setOf((Object[]) new RegexOption[]{RegexOption.IGNORE_CASE, RegexOption.DOT_MATCHES_ALL}));
    private static final int defaultMeasurePx = RangesKt___RangesKt.coerceAtLeast(ExtUtilsKt.getDp(1), 3);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0000H\u0086\u0002J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÂ\u0003J\u001f\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/common/utils/StyledStringUtils$CssStyle;", "", "map", "", "Lcom/xiaomi/fitness/common/utils/SpanPropKey;", "<init>", "(Ljava/util/Map;)V", "toCss", "", "toAttrMap", "plus", "other", "component1", "copy", "equals", "", "hashCode", "", "toString", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nStyledStringUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StyledStringUtils.kt\ncom/xiaomi/fitness/common/utils/StyledStringUtils$CssStyle\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1251:1\n216#2,2:1252\n477#3:1254\n423#3:1255\n462#3:1260\n412#3:1261\n1246#4,4:1256\n*S KotlinDebug\n*F\n+ 1 StyledStringUtils.kt\ncom/xiaomi/fitness/common/utils/StyledStringUtils$CssStyle\n*L\n129#1:1252,2\n144#1:1254\n144#1:1255\n144#1:1260\n144#1:1261\n144#1:1256,4\n*E\n"})
    public static final /* data */ class CssStyle {

        @NotNull
        private final Map<SpanPropKey, Object> map;

        public CssStyle(@NotNull Map<SpanPropKey, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
        }

        private final Map<SpanPropKey, Object> component1() {
            return this.map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CssStyle copy$default(CssStyle cssStyle, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = cssStyle.map;
            }
            return cssStyle.copy(map);
        }

        @NotNull
        public final CssStyle copy(@NotNull Map<SpanPropKey, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            return new CssStyle(map);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CssStyle) && Intrinsics.areEqual(this.map, ((CssStyle) other).map);
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        @NotNull
        public final CssStyle plus(@Nullable CssStyle other) {
            return other == null ? this : new CssStyle(MapsKt__MapsKt.plus(this.map, other.map));
        }

        @NotNull
        public final Map<String, String> toAttrMap() {
            Map<SpanPropKey, Object> map = this.map;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(((SpanPropKey) entry.getKey()).getCss(), entry.getValue());
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue().toString());
            }
            return linkedHashMap2;
        }

        @NotNull
        public final String toCss() {
            String string;
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<SpanPropKey, Object> entry : this.map.entrySet()) {
                SpanPropKey key = entry.getKey();
                Object value = entry.getValue();
                sb.append(key.getCss());
                sb.append(AbstractJsonLexerKt.COLON);
                if (value instanceof String) {
                    string = (String) value;
                } else if (value instanceof Integer) {
                    string = gv5.CONNECT_VALUE_STR + value;
                } else {
                    string = value.toString();
                }
                sb.append(string);
                sb.append(';');
            }
            return sb.toString();
        }

        @NotNull
        public String toString() {
            return "CssStyle(map=" + this.map + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/common/utils/StyledStringUtils$Locator;", "", "ByRange", "ByText", "Lcom/xiaomi/fitness/common/utils/StyledStringUtils$Locator$ByRange;", "Lcom/xiaomi/fitness/common/utils/StyledStringUtils$Locator$ByText;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Locator {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/common/utils/StyledStringUtils$Locator$ByRange;", "Lcom/xiaomi/fitness/common/utils/StyledStringUtils$Locator;", StatConstants.PARAM_START, "", "endExclusive", "<init>", "(II)V", "getStart", "()I", "getEndExclusive", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ByRange implements Locator {
            private final int endExclusive;
            private final int start;

            public ByRange(int i, int i2) {
                this.start = i;
                this.endExclusive = i2;
            }

            public static /* synthetic */ ByRange copy$default(ByRange byRange, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = byRange.start;
                }
                if ((i3 & 2) != 0) {
                    i2 = byRange.endExclusive;
                }
                return byRange.copy(i, i2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getStart() {
                return this.start;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getEndExclusive() {
                return this.endExclusive;
            }

            @NotNull
            public final ByRange copy(int start, int endExclusive) {
                return new ByRange(start, endExclusive);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ByRange)) {
                    return false;
                }
                ByRange byRange = (ByRange) other;
                return this.start == byRange.start && this.endExclusive == byRange.endExclusive;
            }

            public final int getEndExclusive() {
                return this.endExclusive;
            }

            public final int getStart() {
                return this.start;
            }

            public int hashCode() {
                return (Integer.hashCode(this.start) * 31) + Integer.hashCode(this.endExclusive);
            }

            @NotNull
            public String toString() {
                return "ByRange(start=" + this.start + ", endExclusive=" + this.endExclusive + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/common/utils/StyledStringUtils$Locator$ByText;", "Lcom/xiaomi/fitness/common/utils/StyledStringUtils$Locator;", "text", "", "nth", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getText", "()Ljava/lang/String;", "getNth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/xiaomi/fitness/common/utils/StyledStringUtils$Locator$ByText;", "equals", "", "other", "", "hashCode", "toString", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ByText implements Locator {

            @Nullable
            private final Integer nth;

            @NotNull
            private final String text;

            public ByText(@NotNull String text, @Nullable Integer num) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.nth = num;
            }

            public static /* synthetic */ ByText copy$default(ByText byText, String str, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = byText.text;
                }
                if ((i & 2) != 0) {
                    num = byText.nth;
                }
                return byText.copy(str, num);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Integer getNth() {
                return this.nth;
            }

            @NotNull
            public final ByText copy(@NotNull String text, @Nullable Integer nth) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new ByText(text, nth);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ByText)) {
                    return false;
                }
                ByText byText = (ByText) other;
                return Intrinsics.areEqual(this.text, byText.text) && Intrinsics.areEqual(this.nth, byText.nth);
            }

            @Nullable
            public final Integer getNth() {
                return this.nth;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                Integer num = this.nth;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            @NotNull
            public String toString() {
                return "ByText(text=" + this.text + ", nth=" + this.nth + ")";
            }

            public /* synthetic */ ByText(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/common/utils/StyledStringUtils$Orientation;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Orientation {
        START,
        END;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<Orientation> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016JP\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/common/utils/StyledStringUtils$PendingMarginSpan;", "Landroid/text/style/ReplacementSpan;", "widthPx", "", "orientation", "Lcom/xiaomi/fitness/common/utils/StyledStringUtils$Orientation;", "rvMode", "", "avoidBoundary", "refSizePx", "<init>", "(ILcom/xiaomi/fitness/common/utils/StyledStringUtils$Orientation;ZZLjava/lang/Integer;)V", "getWidthPx", "()I", "getOrientation", "()Lcom/xiaomi/fitness/common/utils/StyledStringUtils$Orientation;", "getRvMode", "()Z", "getAvoidBoundary", "getRefSizePx", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSize", "paint", "Landroid/graphics/Paint;", "text", "", StatConstants.PARAM_START, StatConstants.PARAM_END, "fm", "Landroid/graphics/Paint$FontMetricsInt;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "x", "", "top", "y", "bottom", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PendingMarginSpan extends ReplacementSpan {
        private final boolean avoidBoundary;

        @NotNull
        private final Orientation orientation;

        @Nullable
        private final Integer refSizePx;
        private final boolean rvMode;
        private final int widthPx;

        public /* synthetic */ PendingMarginSpan(int i, Orientation orientation, boolean z, boolean z2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, orientation, z, z2, (i2 & 16) != 0 ? null : num);
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int start, int end, float x, int top, int y, int bottom, @NotNull Paint paint) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(paint, "paint");
        }

        public final boolean getAvoidBoundary() {
            return this.avoidBoundary;
        }

        @NotNull
        public final Orientation getOrientation() {
            return this.orientation;
        }

        @Nullable
        public final Integer getRefSizePx() {
            return this.refSizePx;
        }

        public final boolean getRvMode() {
            return this.rvMode;
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NotNull Paint paint, @NotNull CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm) {
            Intrinsics.checkNotNullParameter(paint, "paint");
            Intrinsics.checkNotNullParameter(text, "text");
            return this.widthPx;
        }

        public final int getWidthPx() {
            return this.widthPx;
        }

        public PendingMarginSpan(int i, @NotNull Orientation orientation, boolean z, boolean z2, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            this.widthPx = i;
            this.orientation = orientation;
            this.rvMode = z;
            this.avoidBoundary = z2;
            this.refSizePx = num;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/common/utils/StyledStringUtils$SegmentStyle;", "", "locator", "Lcom/xiaomi/fitness/common/utils/StyledStringUtils$Locator;", "style", "Lcom/xiaomi/fitness/common/utils/StyledStringUtils$CssStyle;", "<init>", "(Lcom/xiaomi/fitness/common/utils/StyledStringUtils$Locator;Lcom/xiaomi/fitness/common/utils/StyledStringUtils$CssStyle;)V", "getLocator", "()Lcom/xiaomi/fitness/common/utils/StyledStringUtils$Locator;", "getStyle", "()Lcom/xiaomi/fitness/common/utils/StyledStringUtils$CssStyle;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SegmentStyle {

        @NotNull
        private final Locator locator;

        @NotNull
        private final CssStyle style;

        public SegmentStyle(@NotNull Locator locator, @NotNull CssStyle style) {
            Intrinsics.checkNotNullParameter(locator, "locator");
            Intrinsics.checkNotNullParameter(style, "style");
            this.locator = locator;
            this.style = style;
        }

        public static /* synthetic */ SegmentStyle copy$default(SegmentStyle segmentStyle, Locator locator, CssStyle cssStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                locator = segmentStyle.locator;
            }
            if ((i & 2) != 0) {
                cssStyle = segmentStyle.style;
            }
            return segmentStyle.copy(locator, cssStyle);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Locator getLocator() {
            return this.locator;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CssStyle getStyle() {
            return this.style;
        }

        @NotNull
        public final SegmentStyle copy(@NotNull Locator locator, @NotNull CssStyle style) {
            Intrinsics.checkNotNullParameter(locator, "locator");
            Intrinsics.checkNotNullParameter(style, "style");
            return new SegmentStyle(locator, style);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SegmentStyle)) {
                return false;
            }
            SegmentStyle segmentStyle = (SegmentStyle) other;
            return Intrinsics.areEqual(this.locator, segmentStyle.locator) && Intrinsics.areEqual(this.style, segmentStyle.style);
        }

        @NotNull
        public final Locator getLocator() {
            return this.locator;
        }

        @NotNull
        public final CssStyle getStyle() {
            return this.style;
        }

        public int hashCode() {
            return (this.locator.hashCode() * 31) + this.style.hashCode();
        }

        @NotNull
        public String toString() {
            return "SegmentStyle(locator=" + this.locator + ", style=" + this.style + ")";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016JP\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/common/utils/StyledStringUtils$SpacerSpan;", "Landroid/text/style/ReplacementSpan;", "widthPx", "", "<init>", "(I)V", "getSize", "paint", "Landroid/graphics/Paint;", "text", "", StatConstants.PARAM_START, StatConstants.PARAM_END, "fm", "Landroid/graphics/Paint$FontMetricsInt;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "x", "", "top", "y", "bottom", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SpacerSpan extends ReplacementSpan {
        private final int widthPx;

        public SpacerSpan(int i) {
            this.widthPx = i;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int start, int end, float x, int top, int y, int bottom, @NotNull Paint paint) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(paint, "paint");
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NotNull Paint paint, @NotNull CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm) {
            Intrinsics.checkNotNullParameter(paint, "paint");
            Intrinsics.checkNotNullParameter(text, "text");
            return this.widthPx;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0001HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/common/utils/StyledStringUtils$StyledArg;", "", "value", "style", "Lcom/xiaomi/fitness/common/utils/StyledStringUtils$CssStyle;", "<init>", "(Ljava/lang/Object;Lcom/xiaomi/fitness/common/utils/StyledStringUtils$CssStyle;)V", "getValue", "()Ljava/lang/Object;", "getStyle", "()Lcom/xiaomi/fitness/common/utils/StyledStringUtils$CssStyle;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StyledArg {

        @Nullable
        private final CssStyle style;

        @NotNull
        private final Object value;

        public StyledArg(@NotNull Object value, @Nullable CssStyle cssStyle) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.style = cssStyle;
        }

        public static /* synthetic */ StyledArg copy$default(StyledArg styledArg, Object obj, CssStyle cssStyle, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = styledArg.value;
            }
            if ((i & 2) != 0) {
                cssStyle = styledArg.style;
            }
            return styledArg.copy(obj, cssStyle);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CssStyle getStyle() {
            return this.style;
        }

        @NotNull
        public final StyledArg copy(@NotNull Object value, @Nullable CssStyle style) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new StyledArg(value, style);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StyledArg)) {
                return false;
            }
            StyledArg styledArg = (StyledArg) other;
            return Intrinsics.areEqual(this.value, styledArg.value) && Intrinsics.areEqual(this.style, styledArg.style);
        }

        @Nullable
        public final CssStyle getStyle() {
            return this.style;
        }

        @NotNull
        public final Object getValue() {
            return this.value;
        }

        public int hashCode() {
            int iHashCode = this.value.hashCode() * 31;
            CssStyle cssStyle = this.style;
            return iHashCode + (cssStyle == null ? 0 : cssStyle.hashCode());
        }

        @NotNull
        public String toString() {
            return "StyledArg(value=" + this.value + ", style=" + this.style + ")";
        }

        public /* synthetic */ StyledArg(Object obj, CssStyle cssStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? null : cssStyle);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private StyledStringUtils() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void applyMargin(Context ctx, SpannableStringBuilder sb, int s, int e, String v, int flag) {
        List<String> listSplit = new Regex("[;\\s,]+").split(StringsKt__StringsKt.trim((CharSequence) v).toString(), 0);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listSplit) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zApplyMargin$parseBool = true;
        int iApplyMargin$sz = 0;
        int iApplyMargin$sz2 = 0;
        Boolean boolValueOf = null;
        Integer numValueOf = null;
        for (String str : arrayList) {
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "=", false, 2, (Object) null)) {
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"="}, false, 2, 2, (Object) null);
                String str2 = (String) listSplit$default.get(0);
                String str3 = (String) listSplit$default.get(1);
                Locale ROOT = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                String lowerCase = str2.toLowerCase(ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                switch (lowerCase.hashCode()) {
                    case -1002715474:
                        if (lowerCase.equals("textsize")) {
                            numValueOf = Integer.valueOf(applyMargin$sz(ctx, str3));
                        }
                        break;
                    case -934610874:
                        if (lowerCase.equals("remote")) {
                            boolValueOf = Boolean.valueOf(applyMargin$parseBool(str3));
                        }
                        break;
                    case -554435892:
                        if (lowerCase.equals("relative")) {
                            numValueOf = Integer.valueOf(applyMargin$sz(ctx, str3));
                        }
                        break;
                    case -337312382:
                        if (lowerCase.equals("avoid-boundary")) {
                            zApplyMargin$parseBool = applyMargin$parseBool(str3);
                        }
                        break;
                    case 101:
                        if (lowerCase.equals(PluginDeviceInfo.FICONOFFLINE)) {
                            iApplyMargin$sz2 = applyMargin$sz(ctx, str3);
                        }
                        break;
                    case 104:
                        if (lowerCase.equals("h")) {
                            iApplyMargin$sz = applyMargin$sz(ctx, str3);
                            iApplyMargin$sz2 = iApplyMargin$sz;
                        }
                        break;
                    case 115:
                        if (lowerCase.equals("s")) {
                            iApplyMargin$sz = applyMargin$sz(ctx, str3);
                        }
                        break;
                    case 100571:
                        if (lowerCase.equals(StatConstants.PARAM_END)) {
                            iApplyMargin$sz2 = applyMargin$sz(ctx, str3);
                        }
                        break;
                    case 112787:
                        if (lowerCase.equals("ref")) {
                            numValueOf = Integer.valueOf(applyMargin$sz(ctx, str3));
                        }
                        break;
                    case 3029889:
                        if (lowerCase.equals("both")) {
                            iApplyMargin$sz = applyMargin$sz(ctx, str3);
                            iApplyMargin$sz2 = iApplyMargin$sz;
                        }
                        break;
                    case 3317767:
                        if (lowerCase.equals("left")) {
                            iApplyMargin$sz = applyMargin$sz(ctx, str3);
                        }
                        break;
                    case 108511772:
                        if (lowerCase.equals(TSMAuthContants.PARAM_KEY_RIGHT)) {
                            iApplyMargin$sz2 = applyMargin$sz(ctx, str3);
                        }
                        break;
                    case 109757538:
                        if (lowerCase.equals(StatConstants.PARAM_START)) {
                            iApplyMargin$sz = applyMargin$sz(ctx, str3);
                        }
                        break;
                    case 1387629604:
                        if (lowerCase.equals("horizontal")) {
                            iApplyMargin$sz = applyMargin$sz(ctx, str3);
                            iApplyMargin$sz2 = iApplyMargin$sz;
                        }
                        break;
                }
            } else {
                int iApplyMargin$sz3 = applyMargin$sz(ctx, str);
                if (iApplyMargin$sz3 > 0) {
                    iApplyMargin$sz = iApplyMargin$sz3;
                    iApplyMargin$sz2 = iApplyMargin$sz;
                }
            }
        }
        insertMargin(sb, s, e, iApplyMargin$sz, iApplyMargin$sz2, ctx, flag, boolValueOf, zApplyMargin$parseBool, numValueOf);
    }

    private static final boolean applyMargin$parseBool(String str) {
        return StringsKt__StringsJVMKt.equals(str, "true", true) || Intrinsics.areEqual(str, "1");
    }

    private static final int applyMargin$sz(Context context, String str) {
        return INSTANCE.parseSizePx(str, context);
    }

    private final void applySpans(Context ctx, SpannableStringBuilder sb, int s, int e, Map<String, String> attrs, int flag) {
        String str = attrs.get(SpanPropKey.TEXT_REPLACE.getCss());
        if (str != null) {
            sb.replace(s, e, (CharSequence) str);
            e = str.length() + s;
        }
        for (Map.Entry<String, String> entry : attrs.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = key.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!Intrinsics.areEqual(lowerCase, SpanPropKey.TEXT_REPLACE.getCss())) {
                if (Intrinsics.areEqual(lowerCase, SpanPropKey.FONT_COLOR.getCss())) {
                    sb.setSpan(new ForegroundColorSpan(INSTANCE.parseColor(value, ctx)), s, e, flag);
                } else if (Intrinsics.areEqual(lowerCase, SpanPropKey.BACKGROUND_COLOR.getCss())) {
                    sb.setSpan(new BackgroundColorSpan(INSTANCE.parseColor(value, ctx)), s, e, flag);
                } else if (Intrinsics.areEqual(lowerCase, SpanPropKey.FONT_SIZE.getCss())) {
                    Object objBuildFontSizeSpan = INSTANCE.buildFontSizeSpan(ctx, value);
                    if (objBuildFontSizeSpan != null) {
                        sb.setSpan(objBuildFontSizeSpan, s, e, flag);
                    }
                } else if (Intrinsics.areEqual(lowerCase, SpanPropKey.FONT_WEIGHT.getCss())) {
                    INSTANCE.applyWeight(sb, s, e, value, flag);
                } else if (Intrinsics.areEqual(lowerCase, SpanPropKey.FONT_STYLE.getCss())) {
                    if (StringsKt__StringsJVMKt.equals(value, "italic", true)) {
                        sb.setSpan(new StyleSpan(2), s, e, flag);
                    }
                } else if (Intrinsics.areEqual(lowerCase, SpanPropKey.TEXT_DECORATION.getCss())) {
                    if (StringsKt__StringsKt.contains((CharSequence) value, (CharSequence) "underline", true)) {
                        sb.setSpan(new UnderlineSpan(), s, e, flag);
                    }
                } else if (Intrinsics.areEqual(lowerCase, SpanPropKey.MARGIN.getCss())) {
                    INSTANCE.applyMargin(ctx, sb, s, e, value, flag);
                }
            }
        }
    }

    public static /* synthetic */ void applySpans$default(StyledStringUtils styledStringUtils, Context context, SpannableStringBuilder spannableStringBuilder, int i, int i2, Map map, int i3, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            i3 = 33;
        }
        styledStringUtils.applySpans(context, spannableStringBuilder, i, i2, map, i3);
    }

    private final void applyWeight(SpannableStringBuilder sb, int s, int e, String rawValue, int flag) {
        Integer intOrNull;
        String string = StringsKt__StringsKt.trim((CharSequence) rawValue).toString();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = string.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "bold")) {
            intOrNull = 700;
        } else {
            intOrNull = Intrinsics.areEqual(lowerCase, "normal") ? 400 : StringsKt__StringNumberConversionsKt.toIntOrNull(rawValue);
        }
        if (intOrNull != null) {
            final int iCoerceIn = RangesKt___RangesKt.coerceIn(intOrNull.intValue(), 100, 900);
            if (Build.VERSION.SDK_INT >= 28) {
                sb.setSpan(new MetricAffectingSpan() { // from class: com.xiaomi.fitness.common.utils.StyledStringUtils.applyWeight.1
                    @Override // android.text.style.CharacterStyle
                    public void updateDrawState(TextPaint tp) {
                        Intrinsics.checkNotNullParameter(tp, "tp");
                        tp.setTypeface(Typeface.create(tp.getTypeface(), iCoerceIn, false));
                    }

                    @Override // android.text.style.MetricAffectingSpan
                    public void updateMeasureState(TextPaint tp) {
                        Intrinsics.checkNotNullParameter(tp, "tp");
                        tp.setTypeface(Typeface.create(tp.getTypeface(), iCoerceIn, false));
                    }
                }, s, e, flag);
                return;
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTypeface(Typeface.DEFAULT);
            try {
                textPaint.setFontVariationSettings("'wght' " + iCoerceIn);
                if (textPaint.getFontVariationSettings() != null) {
                    sb.setSpan(new MetricAffectingSpan() { // from class: com.xiaomi.fitness.common.utils.StyledStringUtils.applyWeight.2
                        @Override // android.text.style.CharacterStyle
                        public void updateDrawState(TextPaint tp) {
                            Intrinsics.checkNotNullParameter(tp, "tp");
                            tp.setFontVariationSettings("'wght' " + iCoerceIn);
                        }

                        @Override // android.text.style.MetricAffectingSpan
                        public void updateMeasureState(TextPaint tp) {
                            Intrinsics.checkNotNullParameter(tp, "tp");
                            tp.setFontVariationSettings("'wght' " + iCoerceIn);
                        }
                    }, s, e, flag);
                    return;
                }
            } catch (IllegalArgumentException unused) {
            }
            sb.setSpan(new StyleSpan(iCoerceIn >= 600 ? 1 : 0), s, e, flag);
        }
    }

    private final Object buildFontSizeSpan(Context ctx, String raw) {
        String string = StringsKt__StringsKt.trim((CharSequence) raw).toString();
        if (StringsKt__StringsJVMKt.endsWith$default(string, "%", false, 2, null)) {
            Float floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(StringsKt__StringsKt.removeSuffix(string, (CharSequence) "%"));
            if (floatOrNull != null) {
                return new RelativeSizeSpan(floatOrNull.floatValue() / 100.0f);
            }
            return null;
        }
        if (!StringsKt__StringsJVMKt.endsWith$default(string, "em", false, 2, null)) {
            return new AbsoluteSizeSpan(parseSizePx(string, ctx));
        }
        Float floatOrNull2 = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(StringsKt__StringsKt.removeSuffix(string, (CharSequence) "em"));
        if (floatOrNull2 != null) {
            return new RelativeSizeSpan(floatOrNull2.floatValue());
        }
        return null;
    }

    private final String buildHtmlBySegments(String raw, CssStyle overallStyle, List<SegmentStyle> segmentStyles) {
        if (segmentStyles.isEmpty()) {
            if (overallStyle == null) {
                return raw;
            }
            return "<span style=\"" + overallStyle.toCss() + "\">" + raw + "</span>";
        }
        ArrayList<Pair> arrayList = new ArrayList();
        for (SegmentStyle segmentStyle : segmentStyles) {
            Locator locator = segmentStyle.getLocator();
            if (locator instanceof Locator.ByRange) {
                Locator.ByRange byRange = (Locator.ByRange) locator;
                arrayList.add(TuplesKt.to(RangesKt___RangesKt.until(byRange.getStart(), byRange.getEndExclusive()), segmentStyle.getStyle()));
            } else {
                if (!(locator instanceof Locator.ByText)) {
                    throw new NoWhenBranchMatchedException();
                }
                Locator.ByText byText = (Locator.ByText) locator;
                if (byText.getText().length() != 0) {
                    if (byText.getNth() == null || byText.getNth().intValue() <= 0) {
                        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) raw, byText.getText(), 0, false, 4, (Object) null);
                        while (iIndexOf$default >= 0) {
                            arrayList.add(TuplesKt.to(RangesKt___RangesKt.until(iIndexOf$default, byText.getText().length() + iIndexOf$default), segmentStyle.getStyle()));
                            iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) raw, byText.getText(), iIndexOf$default + byText.getText().length(), false, 4, (Object) null);
                        }
                    } else {
                        int iIndexOfNth = INSTANCE.indexOfNth(raw, byText.getText(), byText.getNth().intValue());
                        if (iIndexOfNth >= 0) {
                            arrayList.add(TuplesKt.to(RangesKt___RangesKt.until(iIndexOfNth, byText.getText().length() + iIndexOfNth), segmentStyle.getStyle()));
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.common.utils.StyledStringUtils$buildHtmlBySegments$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((IntRange) ((Pair) t).getFirst()).getFirst()), Integer.valueOf(((IntRange) ((Pair) t2).getFirst()).getFirst()));
                }
            });
        }
        StringBuilder sb = new StringBuilder(raw.length() * 2);
        int last = 0;
        for (Pair pair : arrayList) {
            IntRange intRange = (IntRange) pair.component1();
            CssStyle cssStyle = (CssStyle) pair.component2();
            buildHtmlBySegments$appendGap(overallStyle, sb, raw, last, intRange.getFirst());
            sb.append("<");
            sb.append(TAG_INLINE);
            sb.append(" style=\"");
            sb.append(cssStyle.toCss());
            sb.append("\">");
            sb.append(StringsKt__StringsKt.substring(raw, intRange));
            sb.append("</");
            sb.append(TAG_INLINE);
            sb.append(Typography.greater);
            last = intRange.getLast() + 1;
        }
        buildHtmlBySegments$appendGap(overallStyle, sb, raw, last, raw.length());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final void buildHtmlBySegments$appendGap(CssStyle cssStyle, StringBuilder sb, String str, int i, int i2) {
        if (i >= i2) {
            return;
        }
        if (cssStyle == null) {
            sb.append((CharSequence) str, i, i2);
            return;
        }
        sb.append("<");
        sb.append(TAG_INLINE);
        sb.append(" style=\"");
        sb.append(cssStyle.toCss());
        sb.append("\">");
        sb.append((CharSequence) str, i, i2);
        sb.append("</");
        sb.append(TAG_INLINE);
        sb.append(Typography.greater);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0318  */
    /* JADX WARN: Code duplicated, block: B:121:0x0325 A[SYNTHETIC] */
    private final String buildTemplateWithArgs(String template, CssStyle overallStyle, List<StyledArg> args, boolean enableFormat, Locale locale) {
        int i;
        int i2;
        Integer num;
        String string;
        List<String> groupValues;
        String str;
        List<String> groupValues2;
        String str2;
        int length;
        int length2;
        CssStyle style;
        List<String> groupValues3;
        String str3;
        List<String> groupValues4;
        String str4;
        List<String> groupValues5;
        String str5;
        if (!enableFormat) {
            return buildHtmlBySegments(template, overallStyle, CollectionsKt__CollectionsKt.emptyList());
        }
        if (overallStyle == null && !PLACEHOLDER_REGEX.containsMatchIn(template)) {
            return StringsKt__StringsJVMKt.replace$default(template, "%%", "%", false, 4, (Object) null);
        }
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(template, "%%", "%", false, 4, (Object) null);
        int i3 = 2;
        StringBuilder sb = new StringBuilder(strReplace$default.length() * 2);
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        Integer num2 = null;
        Iterator it = Regex.findAll$default(PLACEHOLDER_REGEX, strReplace$default, 0, 2, null).iterator();
        int last = 0;
        int iIntValue = 0;
        while (it.hasNext()) {
            MatchResult matchResult = (MatchResult) it.next();
            sb.append((CharSequence) strReplace$default, last, matchResult.getRange().getFirst());
            MatchResult matchResultFind$default = Regex.find$default(new Regex("%(\\d+)\\$"), matchResult.getValue(), i4, i3, num2);
            Integer numValueOf = (matchResultFind$default == null || (groupValues5 = matchResultFind$default.getGroupValues()) == null || (str5 = groupValues5.get(1)) == null) ? num2 : Integer.valueOf(Integer.parseInt(str5) - 1);
            if (numValueOf != null) {
                int i5 = iIntValue;
                iIntValue = numValueOf.intValue();
                i = i5;
            } else {
                i = iIntValue + 1;
            }
            StyledArg styledArg = (StyledArg) CollectionsKt___CollectionsKt.getOrNull(args, iIntValue);
            if (styledArg == null) {
                throw new IllegalArgumentException("Missing StyledArg for index " + (iIntValue + 1));
            }
            String value = matchResult.getValue();
            char cLast = StringsKt___StringsKt.last(value);
            Iterator it2 = it;
            int i6 = i;
            if (Build.VERSION.SDK_INT >= 30) {
                if (cLast == 'd') {
                    LocalizedNumberFormatter localizedNumberFormatterA = fno.a(NumberFormatter.withLocale(locale == null ? Locale.getDefault() : locale).grouping(NumberFormatter.GroupingStrategy.OFF));
                    Object value2 = styledArg.getValue();
                    Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.Number");
                    string = localizedNumberFormatterA.format(((Number) value2).longValue()).toString();
                    Intrinsics.checkNotNull(string);
                } else if (cLast == 'f') {
                    MatchResult matchResultFind$default2 = Regex.find$default(new Regex("\\.(\\d+)f$", RegexOption.IGNORE_CASE), value, 0, 2, null);
                    Integer numValueOf2 = (matchResultFind$default2 == null || (groupValues4 = matchResultFind$default2.getGroupValues()) == null || (str4 = groupValues4.get(1)) == null) ? null : Integer.valueOf(Integer.parseInt(str4));
                    LocalizedNumberFormatter localizedNumberFormatterA2 = fno.a(NumberFormatter.withLocale(locale == null ? Locale.getDefault() : locale).grouping(NumberFormatter.GroupingStrategy.OFF));
                    if (numValueOf2 != null) {
                        localizedNumberFormatterA2 = fno.a(localizedNumberFormatterA2.precision(dno.a(Precision.fixedFraction(numValueOf2.intValue()))));
                    }
                    Object value3 = styledArg.getValue();
                    Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Number");
                    string = localizedNumberFormatterA2.format(((Number) value3).doubleValue()).toString();
                    Intrinsics.checkNotNull(string);
                } else if (cLast == 'p') {
                    MatchResult matchResultFind$default3 = Regex.find$default(new Regex("\\.(\\d+)p$", RegexOption.IGNORE_CASE), value, 0, 2, null);
                    Integer numValueOf3 = (matchResultFind$default3 == null || (groupValues3 = matchResultFind$default3.getGroupValues()) == null || (str3 = groupValues3.get(1)) == null) ? null : Integer.valueOf(Integer.parseInt(str3));
                    LocalizedNumberFormatter localizedNumberFormatterA3 = fno.a(fno.a(NumberFormatter.withLocale(locale == null ? Locale.getDefault() : locale).grouping(NumberFormatter.GroupingStrategy.OFF)).unit(MeasureUnit.PERCENT));
                    if (numValueOf3 != null) {
                        localizedNumberFormatterA3 = fno.a(localizedNumberFormatterA3.precision(dno.a(Precision.fixedFraction(numValueOf3.intValue()))));
                    }
                    Object value4 = styledArg.getValue();
                    Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type kotlin.Number");
                    string = localizedNumberFormatterA3.format(((Number) value4).doubleValue()).toString();
                    Intrinsics.checkNotNull(string);
                } else {
                    string = styledArg.getValue().toString();
                }
            } else if (cLast != 'd') {
                if (cLast == 'f') {
                    if (locale != null) {
                        MatchResult matchResultFind$default4 = Regex.find$default(new Regex("\\.(\\d+)f$", RegexOption.IGNORE_CASE), value, 0, 2, null);
                        Integer numValueOf4 = (matchResultFind$default4 == null || (groupValues2 = matchResultFind$default4.getGroupValues()) == null || (str2 = groupValues2.get(1)) == null) ? null : Integer.valueOf(Integer.parseInt(str2));
                        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
                        if ((numberInstance instanceof DecimalFormat) && numValueOf4 != null) {
                            DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
                            decimalFormat.setMinimumFractionDigits(numValueOf4.intValue());
                            decimalFormat.setMaximumFractionDigits(numValueOf4.intValue());
                        }
                        numberInstance.setGroupingUsed(false);
                        Object value5 = styledArg.getValue();
                        Intrinsics.checkNotNull(value5, "null cannot be cast to non-null type kotlin.Number");
                        string = numberInstance.format(((Number) value5).doubleValue());
                        Intrinsics.checkNotNull(string);
                    } else {
                        string = styledArg.getValue().toString();
                    }
                } else if (cLast == 'p') {
                    i2 = 2;
                    num = null;
                    MatchResult matchResultFind$default5 = Regex.find$default(new Regex("\\.(\\d+)p$", RegexOption.IGNORE_CASE), value, 0, 2, null);
                    Integer numValueOf5 = (matchResultFind$default5 == null || (groupValues = matchResultFind$default5.getGroupValues()) == null || (str = groupValues.get(1)) == null) ? null : Integer.valueOf(Integer.parseInt(str));
                    NumberFormat percentInstance = NumberFormat.getPercentInstance(locale);
                    if ((percentInstance instanceof DecimalFormat) && numValueOf5 != null) {
                        DecimalFormat decimalFormat2 = (DecimalFormat) percentInstance;
                        decimalFormat2.setMinimumFractionDigits(numValueOf5.intValue());
                        decimalFormat2.setMaximumFractionDigits(numValueOf5.intValue());
                    }
                    percentInstance.setGroupingUsed(false);
                    Object value6 = styledArg.getValue();
                    Intrinsics.checkNotNull(value6, "null cannot be cast to non-null type kotlin.Number");
                    string = percentInstance.format(((Number) value6).doubleValue());
                    Intrinsics.checkNotNull(string);
                } else {
                    i2 = 2;
                    num = null;
                    string = styledArg.getValue().toString();
                }
                length = sb.length();
                sb.append(string);
                length2 = sb.length();
                style = styledArg.getStyle();
                if (style != null) {
                    arrayList.add(new SegmentStyle(new Locator.ByRange(length, length2), style));
                }
                num2 = num;
                it = it2;
                iIntValue = i6;
                last = matchResult.getRange().getLast() + 1;
                i3 = i2;
                i4 = 0;
            } else if (locale != null) {
                NumberFormat integerInstance = NumberFormat.getIntegerInstance(locale);
                integerInstance.setGroupingUsed(false);
                Object value7 = styledArg.getValue();
                Intrinsics.checkNotNull(value7, "null cannot be cast to non-null type kotlin.Number");
                string = integerInstance.format(((Number) value7).longValue());
                Intrinsics.checkNotNull(string);
            } else {
                string = styledArg.getValue().toString();
            }
            i2 = 2;
            num = null;
            length = sb.length();
            sb.append(string);
            length2 = sb.length();
            style = styledArg.getStyle();
            if (style != null) {
                arrayList.add(new SegmentStyle(new Locator.ByRange(length, length2), style));
            }
            num2 = num;
            it = it2;
            iIntValue = i6;
            last = matchResult.getRange().getLast() + 1;
            i3 = i2;
            i4 = 0;
        }
        if (last < strReplace$default.length()) {
            String strSubstring = strReplace$default.substring(last);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb.append(strSubstring);
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return buildHtmlBySegments(string2, overallStyle, arrayList);
    }

    private final Pair<Integer, Float> calcSpacesAndRatio(Context ctx, int expectedPx, float textSizePx) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(textSizePx);
        textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(textPaint.measureText(" "), 0.5f);
        float f = expectedPx;
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast((int) Math.ceil(f / fCoerceAtLeast), 1);
        while (true) {
            float f2 = f / (iCoerceAtLeast * fCoerceAtLeast);
            if (f2 >= 0.5f) {
                return TuplesKt.to(Integer.valueOf(iCoerceAtLeast), Float.valueOf(RangesKt___RangesKt.coerceIn(MathKt__MathJVMKt.roundToInt(f2 * 1000) / 1000.0f, 0.5f, 1.0f)));
            }
            iCoerceAtLeast++;
        }
    }

    private final int estimateSpaceCount(Context ctx, int expectedPx, float measuredTextSize) {
        DisplayMetrics displayMetrics = ctx.getResources().getDisplayMetrics();
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(TypedValue.applyDimension(0, measuredTextSize, displayMetrics));
        textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        return RangesKt___RangesKt.coerceAtLeast(MathKt__MathJVMKt.roundToInt(expectedPx / RangesKt___RangesKt.coerceAtLeast(textPaint.measureText(" "), 0.5f)), 1);
    }

    public static /* synthetic */ int estimateSpaceCount$default(StyledStringUtils styledStringUtils, Context context, int i, float f, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = defaultMeasurePx;
        }
        return styledStringUtils.estimateSpaceCount(context, i, f);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    private final void finalizeMarginSpans(Context ctx, SpannableStringBuilder sb) {
        PendingMarginSpan[] pendingMarginSpanArr = (PendingMarginSpan[]) sb.getSpans(0, sb.length(), PendingMarginSpan.class);
        Intrinsics.checkNotNull(pendingMarginSpanArr);
        for (PendingMarginSpan pendingMarginSpan : pendingMarginSpanArr) {
            int spanStart = sb.getSpanStart(pendingMarginSpan);
            int spanEnd = sb.getSpanEnd(pendingMarginSpan);
            int i = WhenMappings.$EnumSwitchMapping$0[pendingMarginSpan.getOrientation().ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (spanEnd != sb.length()) {
                    z = false;
                }
            } else if (spanStart != 0) {
                z = false;
            }
            if (pendingMarginSpan.getAvoidBoundary() && z) {
                sb.delete(spanStart, spanEnd);
                sb.removeSpan(pendingMarginSpan);
            } else if (pendingMarginSpan.getRefSizePx() == null || pendingMarginSpan.getRefSizePx().intValue() <= 0) {
                if (pendingMarginSpan.getRvMode()) {
                    StyledStringUtils styledStringUtils = INSTANCE;
                    int iEstimateSpaceCount$default = estimateSpaceCount$default(styledStringUtils, ctx, pendingMarginSpan.getWidthPx(), 0.0f, 4, null);
                    sb.replace(spanStart, spanEnd, StringsKt__StringsJVMKt.repeat(" ", iEstimateSpaceCount$default));
                    int i2 = spanStart + iEstimateSpaceCount$default;
                    sb.setSpan(new AbsoluteSizeSpan(defaultMeasurePx), spanStart, i2, 33);
                    styledStringUtils.applyWeight(sb, spanStart, i2, "normal", 33);
                    if (Build.VERSION.SDK_INT >= 28) {
                        bno.a();
                        sb.setSpan(ano.a(Typeface.DEFAULT), spanStart, i2, 33);
                    } else {
                        sb.setSpan(new MetricAffectingSpan() { // from class: com.xiaomi.fitness.common.utils.StyledStringUtils$finalizeMarginSpans$1$1
                            @Override // android.text.style.CharacterStyle
                            public void updateDrawState(TextPaint tp) {
                                Intrinsics.checkNotNullParameter(tp, "tp");
                                tp.setTypeface(Typeface.DEFAULT);
                            }

                            @Override // android.text.style.MetricAffectingSpan
                            public void updateMeasureState(TextPaint tp) {
                                Intrinsics.checkNotNullParameter(tp, "tp");
                                tp.setTypeface(Typeface.DEFAULT);
                            }
                        }, spanStart, i2, 33);
                    }
                } else {
                    sb.setSpan(new SpacerSpan(pendingMarginSpan.getWidthPx()), spanStart, spanEnd, 33);
                }
                sb.removeSpan(pendingMarginSpan);
            } else {
                StyledStringUtils styledStringUtils2 = INSTANCE;
                Pair<Integer, Float> pairCalcSpacesAndRatio = styledStringUtils2.calcSpacesAndRatio(ctx, pendingMarginSpan.getWidthPx(), pendingMarginSpan.getRefSizePx().intValue());
                int iIntValue = pairCalcSpacesAndRatio.component1().intValue();
                float fFloatValue = pairCalcSpacesAndRatio.component2().floatValue();
                String strRepeat = StringsKt__StringsJVMKt.repeat(" ", iIntValue);
                sb.replace(spanStart, spanEnd, (CharSequence) strRepeat);
                sb.setSpan(new RelativeSizeSpan(fFloatValue), spanStart, strRepeat.length() + spanStart, 33);
                styledStringUtils2.applyWeight(sb, spanStart, spanStart + strRepeat.length(), "normal", 33);
                if (Build.VERSION.SDK_INT >= 28) {
                    bno.a();
                    sb.setSpan(ano.a(Typeface.DEFAULT), spanStart, strRepeat.length() + spanStart, 33);
                }
                sb.removeSpan(pendingMarginSpan);
            }
        }
    }

    private final int indexOfNth(String str, String str2, int i) {
        if (i <= 0) {
            return -1;
        }
        int i2 = 0;
        int length = 0;
        while (true) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, length, false, 4, (Object) null);
            if (iIndexOf$default == -1) {
                return -1;
            }
            i2++;
            if (i2 == i) {
                return iIndexOf$default;
            }
            length = iIndexOf$default + str2.length();
        }
    }

    private final void insertMargin(SpannableStringBuilder sb, int s, int e, int startPx, int endPx, Context ctx, int flag, Boolean forceRv, boolean avoidBoundary, Integer refSizePx) {
        boolean zBooleanValue = forceRv != null ? forceRv.booleanValue() : false;
        if (endPx > 0) {
            sb.insert(e, "\u200b");
            sb.setSpan(new PendingMarginSpan(endPx, Orientation.END, zBooleanValue, avoidBoundary, refSizePx), e, e + 1, flag);
        }
        if (startPx > 0) {
            sb.insert(s, "\u200b");
            sb.setSpan(new PendingMarginSpan(startPx, Orientation.START, zBooleanValue, avoidBoundary, refSizePx), s, s + 1, flag);
        }
    }

    private final int parseColor(String raw, Context ctx) {
        String string = StringsKt__StringsKt.trim((CharSequence) raw).toString();
        try {
            if (StringsKt__StringsJVMKt.startsWith$default(string, "@color/", false, 2, null)) {
                return ni4.c(ctx, ctx.getResources().getIdentifier(StringsKt__StringsKt.removePrefix(string, (CharSequence) "@color/"), "color", ctx.getPackageName()));
            }
            if (StringsKt__StringsJVMKt.startsWith$default(string, gv5.CONNECT_VALUE_STR, false, 2, null)) {
                String strDrop = StringsKt___StringsKt.drop(string, 1);
                for (int i = 0; i < strDrop.length(); i++) {
                    if (Character.isDigit(strDrop.charAt(i))) {
                    }
                }
                return ni4.c(ctx, Integer.parseInt(StringsKt___StringsKt.drop(string, 1)));
            }
            for (int i2 = 0; i2 < string.length(); i2++) {
                if (!Character.isDigit(string.charAt(i2))) {
                    if (StringsKt__StringsJVMKt.startsWith(string, "rgba", true)) {
                        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.substringBefore$default(StringsKt__StringsKt.substringAfter$default(string, '(', (String) null, 2, (Object) null), ')', (String) null, 2, (Object) null), new char[]{','}, false, 0, 6, (Object) null);
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
                        Iterator it = listSplit$default.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it.next()).toString())));
                        }
                        return Color.argb(MathKt__MathJVMKt.roundToInt(((Number) arrayList.get(3)).floatValue() * 255), (int) ((Number) arrayList.get(0)).floatValue(), (int) ((Number) arrayList.get(1)).floatValue(), (int) ((Number) arrayList.get(2)).floatValue());
                    }
                    if (!StringsKt__StringsJVMKt.startsWith(string, "0x", true)) {
                        return Color.parseColor(string);
                    }
                    return Color.parseColor(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + StringsKt__StringsKt.removePrefix(StringsKt__StringsKt.removePrefix(string, (CharSequence) "0x"), (CharSequence) "0X"));
                }
            }
            return ni4.c(ctx, Integer.parseInt(string));
        } catch (Exception unused) {
            if ((ctx.getResources().getConfiguration().uiMode & 48) == 32) {
                return Color.parseColor("#E6FFFFFF");
            }
            return -16777216;
        }
    }

    private final SpannableStringBuilder parseCssStyled(String str, Context context, int i) {
        List<String> groupValues;
        String str2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            int iIndexOf = StringsKt__StringsKt.indexOf((CharSequence) str, "<span", i2, true);
            int iIndexOf2 = StringsKt__StringsKt.indexOf((CharSequence) str, "<style", i2, true);
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(iIndexOf), Integer.valueOf(iIndexOf2)});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listListOf) {
                if (((Number) obj).intValue() >= 0) {
                    arrayList.add(obj);
                }
            }
            Integer num = (Integer) CollectionsKt___CollectionsKt.minOrNull((Iterable) arrayList);
            int iIntValue = num != null ? num.intValue() : -1;
            if (iIntValue == -1) {
                String strSubstring = str.substring(i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                spannableStringBuilder.append((CharSequence) strSubstring);
                return spannableStringBuilder;
            }
            if (iIntValue > i2) {
                String strSubstring2 = str.substring(i2, iIntValue);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                spannableStringBuilder.append((CharSequence) strSubstring2);
            }
            String str3 = iIntValue == iIndexOf2 ? "style" : TAG_INLINE;
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, Typography.greater, iIntValue, false, 4, (Object) null) + 1;
            String strSubstring3 = str.substring(iIntValue, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            Map<String, String> cssAttrMap = null;
            MatchResult matchResultFind$default = Regex.find$default(new Regex("style\\s*=\\s*\"([^\"]*)\"", RegexOption.IGNORE_CASE), strSubstring3, 0, 2, null);
            if (matchResultFind$default != null && (groupValues = matchResultFind$default.getGroupValues()) != null && (str2 = groupValues.get(1)) != null) {
                cssAttrMap = toCssAttrMap(str2);
            }
            Map<String, String> mapEmptyMap = cssAttrMap == null ? MapsKt__MapsKt.emptyMap() : cssAttrMap;
            String cssStyled$tagClose = parseCssStyled$tagClose(str3);
            int length = iIndexOf$default;
            int i3 = 1;
            while (i3 > 0) {
                int iIndexOf3 = StringsKt__StringsKt.indexOf((CharSequence) str, "<" + str3, length, true);
                int iIndexOf4 = StringsKt__StringsKt.indexOf((CharSequence) str, cssStyled$tagClose, length, true);
                if (iIndexOf4 == -1) {
                    break;
                }
                if (iIndexOf3 == -1 || iIndexOf3 >= iIndexOf4) {
                    i3--;
                    length = iIndexOf4 + cssStyled$tagClose.length();
                } else {
                    i3++;
                    length = iIndexOf3 + str3.length();
                }
            }
            String strSubstring4 = str.substring(iIndexOf$default, length - cssStyled$tagClose.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
            SpannableStringBuilder cssStyled = parseCssStyled(strSubstring4, context, i + 1);
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) cssStyled);
            applySpans(context, spannableStringBuilder, length2, spannableStringBuilder.length(), mapEmptyMap, (i > 0 ? 16711680 : 0) | 33);
            i2 = length;
        }
    }

    public static /* synthetic */ SpannableStringBuilder parseCssStyled$default(StyledStringUtils styledStringUtils, String str, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return styledStringUtils.parseCssStyled(str, context, i);
    }

    private static final String parseCssStyled$tagClose(String str) {
        return "</" + str + ">";
    }

    public static /* synthetic */ SpannableString parseCssStyledText$default(StyledStringUtils styledStringUtils, String str, Context context, Locale locale, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return styledStringUtils.parseCssStyledText(str, context, locale, z);
    }

    private final int parseSizePx(String raw, Context ctx) {
        MatchResult matchResultMatchEntire = new Regex("(\\d+(?:\\.\\d+)?)(dp|px|sp)?").matchEntire(raw);
        if (matchResultMatchEntire == null) {
            return 0;
        }
        float fApplyDimension = Float.parseFloat(matchResultMatchEntire.getGroupValues().get(1));
        String str = matchResultMatchEntire.getGroupValues().get(2);
        DisplayMetrics displayMetrics = ctx.getResources().getDisplayMetrics();
        if (Intrinsics.areEqual(str, "dp")) {
            fApplyDimension = TypedValue.applyDimension(1, fApplyDimension, displayMetrics);
        } else if (!Intrinsics.areEqual(str, "px")) {
            fApplyDimension = TypedValue.applyDimension(2, fApplyDimension, displayMetrics);
        }
        return MathKt__MathJVMKt.roundToInt(fApplyDimension);
    }

    private final Map<String, String> toCssAttrMap(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder sb = new StringBuilder();
        Iterator it = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{';'}, false, 0, 6, (Object) null).iterator();
        String str2 = null;
        while (it.hasNext()) {
            String string = StringsKt__StringsKt.trim((CharSequence) it.next()).toString();
            if (string.length() != 0) {
                if (StringsKt__StringsKt.contains$default((CharSequence) string, AbstractJsonLexerKt.COLON, false, 2, (Object) null)) {
                    if (str2 != null) {
                        Locale ROOT = Locale.ROOT;
                        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                        String lowerCase = str2.toLowerCase(ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        String string2 = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        linkedHashMap.put(lowerCase, StringsKt__StringsKt.trim((CharSequence) string2).toString());
                    }
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, AbstractJsonLexerKt.COLON, 0, false, 6, (Object) null);
                    String strSubstring = string.substring(0, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    String string3 = StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
                    StringsKt__StringBuilderJVMKt.clear(sb);
                    String strSubstring2 = string.substring(iIndexOf$default + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    sb.append(StringsKt__StringsKt.trim((CharSequence) strSubstring2).toString());
                    str2 = string3;
                } else {
                    if (sb.length() > 0) {
                        sb.append(';');
                    }
                    sb.append(string);
                }
            }
        }
        if (str2 != null) {
            Locale ROOT2 = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
            String lowerCase2 = str2.toLowerCase(ROOT2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            String string4 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
            linkedHashMap.put(lowerCase2, StringsKt__StringsKt.trim((CharSequence) string4).toString());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final SpannableString applySmartStyles(@NotNull Context ctx, @NotNull SpannableString source, @Nullable CssStyle numberStyle, @NotNull Map<String, CssStyle> keywords, @NotNull List<SegmentStyle> keywordLocators) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        Intrinsics.checkNotNullParameter(keywordLocators, "keywordLocators");
        if (numberStyle == null && keywords.isEmpty() && keywordLocators.isEmpty()) {
            return source;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(source);
        String string = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        ArrayList<SegmentStyle> arrayList = new ArrayList();
        if (numberStyle != null) {
            Matcher matcher = DIGIT_PATTERN.matcher(string);
            while (matcher.find()) {
                arrayList.add(new SegmentStyle(new Locator.ByRange(matcher.start(), matcher.end()), numberStyle));
            }
        }
        for (Map.Entry<String, CssStyle> entry : keywords.entrySet()) {
            String key = entry.getKey();
            CssStyle value = entry.getValue();
            if (key.length() > 0) {
                arrayList.add(new SegmentStyle(new Locator.ByText(key, null, 2, 0 == true ? 1 : 0), value));
            }
        }
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, keywordLocators);
        for (SegmentStyle segmentStyle : arrayList) {
            Locator locator = segmentStyle.getLocator();
            if (locator instanceof Locator.ByRange) {
                Locator.ByRange byRange = (Locator.ByRange) locator;
                INSTANCE.applySpans(ctx, spannableStringBuilder, byRange.getStart(), byRange.getEndExclusive(), segmentStyle.getStyle().toAttrMap(), 33);
            } else {
                if (!(locator instanceof Locator.ByText)) {
                    throw new NoWhenBranchMatchedException();
                }
                Locator.ByText byText = (Locator.ByText) locator;
                if (byText.getText().length() != 0) {
                    if (byText.getNth() == null || byText.getNth().intValue() <= 0) {
                        for (int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, byText.getText(), 0, false, 4, (Object) null); iIndexOf$default >= 0; iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, byText.getText(), iIndexOf$default + byText.getText().length(), false, 4, (Object) null)) {
                            INSTANCE.applySpans(ctx, spannableStringBuilder, iIndexOf$default, iIndexOf$default + byText.getText().length(), segmentStyle.getStyle().toAttrMap(), 33);
                        }
                    } else {
                        StyledStringUtils styledStringUtils = INSTANCE;
                        int iIndexOfNth = styledStringUtils.indexOfNth(string, byText.getText(), byText.getNth().intValue());
                        if (iIndexOfNth >= 0) {
                            styledStringUtils.applySpans(ctx, spannableStringBuilder, iIndexOfNth, iIndexOfNth + byText.getText().length(), segmentStyle.getStyle().toAttrMap(), 33);
                        }
                    }
                }
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    @NotNull
    public final SpannableString getStyledString(@NotNull Context context, @NotNull Object templateOrResId, @Nullable CssStyle cssStyle, @NotNull List<StyledArg> args, boolean z, @Nullable Locale locale, boolean z2, @Nullable CssStyle cssStyle2, @NotNull Map<String, CssStyle> keywords, @NotNull List<SegmentStyle> keywordLocators) {
        String string;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(templateOrResId, "templateOrResId");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        Intrinsics.checkNotNullParameter(keywordLocators, "keywordLocators");
        if (templateOrResId instanceof Integer) {
            string = context.getString(((Number) templateOrResId).intValue());
        } else {
            if (!(templateOrResId instanceof String)) {
                throw new IllegalArgumentException("templateOrResId must be String or Int");
            }
            string = (String) templateOrResId;
        }
        String str = string;
        Intrinsics.checkNotNull(str);
        return applySmartStyles(context, parseCssStyledText(buildTemplateWithArgs(str, cssStyle, args, z, locale), context, locale, z2), cssStyle2, keywords, keywordLocators);
    }

    @NotNull
    public final SpannableString parseCssStyledText(@NotNull String str, @NotNull Context ctx, @Nullable Locale locale, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        SpannableStringBuilder cssStyled$default = parseCssStyled$default(this, str, ctx, 0, 2, null);
        finalizeMarginSpans(ctx, cssStyled$default);
        CharSequence spannableString = new SpannableString(cssStyled$default);
        if (z) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            spannableString = BidiFormatter.getInstance(locale).unicodeWrap(spannableString, true);
            Intrinsics.checkNotNull(spannableString);
        }
        return new SpannableString(spannableString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final SpannableString styleSmart(@NotNull String str, @NotNull Context ctx, @Nullable CssStyle cssStyle, @Nullable CssStyle cssStyle2, @NotNull Map<String, CssStyle> keywords, @NotNull List<SegmentStyle> keywordLocators, @Nullable Locale locale, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        Intrinsics.checkNotNullParameter(keywordLocators, "keywordLocators");
        ArrayList arrayList = new ArrayList();
        if (cssStyle2 != null) {
            Matcher matcher = DIGIT_PATTERN.matcher(str);
            while (matcher.find()) {
                arrayList.add(new SegmentStyle(new Locator.ByRange(matcher.start(), matcher.end()), cssStyle2));
            }
        }
        for (Map.Entry<String, CssStyle> entry : keywords.entrySet()) {
            String key = entry.getKey();
            CssStyle value = entry.getValue();
            if (key.length() > 0) {
                arrayList.add(new SegmentStyle(new Locator.ByText(key, null, 2, 0 == true ? 1 : 0), value));
            }
        }
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, keywordLocators);
        return parseCssStyledText(buildHtmlBySegments(str, cssStyle, arrayList), ctx, locale, z);
    }

    @NotNull
    public final SpannableString getStyledString(@NotNull String str, @NotNull Context ctx, @Nullable CssStyle cssStyle, @NotNull List<StyledArg> args, boolean z, @Nullable Locale locale, boolean z2, @Nullable CssStyle cssStyle2, @NotNull Map<String, CssStyle> keywords, @NotNull List<SegmentStyle> keywordLocators) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        Intrinsics.checkNotNullParameter(keywordLocators, "keywordLocators");
        return applySmartStyles(ctx, parseCssStyledText(buildTemplateWithArgs(str, cssStyle, args, z, locale), ctx, locale, z2), cssStyle2, keywords, keywordLocators);
    }

    @NotNull
    public final SpannableString getStyledString(@NotNull Context context, int i, int i2, @Nullable CssStyle cssStyle, @NotNull List<StyledArg> args, boolean z, @Nullable Locale locale, boolean z2, @Nullable CssStyle cssStyle2, @NotNull Map<String, CssStyle> keywords, @NotNull List<SegmentStyle> keywordLocators) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        Intrinsics.checkNotNullParameter(keywordLocators, "keywordLocators");
        String quantityString = context.getResources().getQuantityString(i, i2);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return applySmartStyles(context, parseCssStyledText(buildTemplateWithArgs(quantityString, cssStyle, args, z, locale), context, locale, z2), cssStyle2, keywords, keywordLocators);
    }
}
