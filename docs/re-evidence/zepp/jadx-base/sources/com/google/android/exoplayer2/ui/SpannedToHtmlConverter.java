package com.google.android.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan;
import com.google.android.exoplayer2.text.span.RubySpan;
import com.google.android.exoplayer2.text.span.TextEmphasisSpan;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class SpannedToHtmlConverter {
    private static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    public static class HtmlAndCss {
        public final Map<String, String> cssRuleSets;
        public final String html;

        private HtmlAndCss(String html, Map<String, String> cssRuleSets) {
            this.html = html;
            this.cssRuleSets = cssRuleSets;
        }
    }

    public static final class b {
        private static final Comparator<b> e = new Comparator() { // from class: com.google.android.exoplayer2.ui.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SpannedToHtmlConverter.b.e((SpannedToHtmlConverter.b) obj, (SpannedToHtmlConverter.b) obj2);
            }
        };
        private static final Comparator<b> f = new Comparator() { // from class: com.google.android.exoplayer2.ui.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SpannedToHtmlConverter.b.f((SpannedToHtmlConverter.b) obj, (SpannedToHtmlConverter.b) obj2);
            }
        };
        public final int a;
        public final int b;
        public final String c;
        public final String d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int e(b bVar, b bVar2) {
            int iCompare = Integer.compare(bVar2.b, bVar.b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = bVar.c.compareTo(bVar2.c);
            return iCompareTo != 0 ? iCompareTo : bVar.d.compareTo(bVar2.d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int f(b bVar, b bVar2) {
            int iCompare = Integer.compare(bVar2.a, bVar.a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = bVar2.c.compareTo(bVar.c);
            return iCompareTo != 0 ? iCompareTo : bVar2.d.compareTo(bVar.d);
        }

        private b(int start, int end, String openingTag, String closingTag) {
            this.a = start;
            this.b = end;
            this.c = openingTag;
            this.d = closingTag;
        }
    }

    public static final class c {
        private final List<b> a = new ArrayList();
        private final List<b> b = new ArrayList();
    }

    private SpannedToHtmlConverter() {
    }

    public static HtmlAndCss a(@Nullable CharSequence text, float displayDensity) {
        if (text == null) {
            return new HtmlAndCss("", ImmutableMap.of());
        }
        if (!(text instanceof Spanned)) {
            return new HtmlAndCss(b(text), ImmutableMap.of());
        }
        Spanned spanned = (Spanned) text;
        HashSet hashSet = new HashSet();
        int i = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            StringBuilder sb = new StringBuilder(14);
            sb.append("bg_");
            sb.append(iIntValue);
            map.put(com.google.android.exoplayer2.ui.a.a(sb.toString()), Util.formatInvariant("background-color:%s;", com.google.android.exoplayer2.ui.a.b(iIntValue)));
        }
        SparseArray<c> sparseArrayC = c(spanned, displayDensity);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i2 = 0;
        while (i < sparseArrayC.size()) {
            int iKeyAt = sparseArrayC.keyAt(i);
            sb2.append(b(spanned.subSequence(i2, iKeyAt)));
            c cVar = sparseArrayC.get(iKeyAt);
            Collections.sort(cVar.b, b.f);
            Iterator it3 = cVar.b.iterator();
            while (it3.hasNext()) {
                sb2.append(((b) it3.next()).d);
            }
            Collections.sort(cVar.a, b.e);
            Iterator it4 = cVar.a.iterator();
            while (it4.hasNext()) {
                sb2.append(((b) it4.next()).c);
            }
            i++;
            i2 = iKeyAt;
        }
        sb2.append(b(spanned.subSequence(i2, spanned.length())));
        return new HtmlAndCss(sb2.toString(), map);
    }

    private static String b(CharSequence text) {
        return a.matcher(Html.escapeHtml(text)).replaceAll("<br>");
    }

    private static SparseArray<c> c(Spanned spanned, float displayDensity) {
        SparseArray<c> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strE = e(obj, displayDensity);
            String strD = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strE != null) {
                Assertions.checkNotNull(strD);
                b bVar = new b(spanStart, spanEnd, strE, strD);
                f(sparseArray, spanStart).a.add(bVar);
                f(sparseArray, spanEnd).b.add(bVar);
            }
        }
        return sparseArray;
    }

    @Nullable
    private static String d(Object span) {
        if ((span instanceof StrikethroughSpan) || (span instanceof ForegroundColorSpan) || (span instanceof BackgroundColorSpan) || (span instanceof HorizontalTextInVerticalContextSpan) || (span instanceof AbsoluteSizeSpan) || (span instanceof RelativeSizeSpan) || (span instanceof TextEmphasisSpan)) {
            return "</span>";
        }
        if (span instanceof TypefaceSpan) {
            if (((TypefaceSpan) span).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (span instanceof StyleSpan) {
            int style = ((StyleSpan) span).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (span instanceof RubySpan) {
                String strB = b(((RubySpan) span).rubyText);
                StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 16);
                sb.append("<rt>");
                sb.append(strB);
                sb.append("</rt></ruby>");
                return sb.toString();
            }
            if (span instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    @Nullable
    private static String e(Object span, float displayDensity) {
        if (span instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (span instanceof ForegroundColorSpan) {
            return Util.formatInvariant("<span style='color:%s;'>", com.google.android.exoplayer2.ui.a.b(((ForegroundColorSpan) span).getForegroundColor()));
        }
        if (span instanceof BackgroundColorSpan) {
            return Util.formatInvariant("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) span).getBackgroundColor()));
        }
        if (span instanceof HorizontalTextInVerticalContextSpan) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (span instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) span;
            return Util.formatInvariant("<span style='font-size:%.2fpx;'>", Float.valueOf(absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() : absoluteSizeSpan.getSize() / displayDensity));
        }
        if (span instanceof RelativeSizeSpan) {
            return Util.formatInvariant("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) span).getSizeChange() * 100.0f));
        }
        if (span instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) span).getFamily();
            if (family != null) {
                return Util.formatInvariant("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (span instanceof StyleSpan) {
            int style = ((StyleSpan) span).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(span instanceof RubySpan)) {
            if (span instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(span instanceof TextEmphasisSpan)) {
                return null;
            }
            TextEmphasisSpan textEmphasisSpan = (TextEmphasisSpan) span;
            return Util.formatInvariant("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(textEmphasisSpan.markShape, textEmphasisSpan.markFill), g(textEmphasisSpan.position));
        }
        int i = ((RubySpan) span).position;
        if (i == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static c f(SparseArray<c> transitions, int key) {
        c cVar = transitions.get(key);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        transitions.put(key, cVar2);
        return cVar2;
    }

    private static String g(int position) {
        return position != 2 ? "over right" : "under left";
    }

    private static String h(int shape, int fill) {
        StringBuilder sb = new StringBuilder();
        if (fill == 1) {
            sb.append("filled ");
        } else if (fill == 2) {
            sb.append("open ");
        }
        if (shape == 0) {
            sb.append("none");
        } else if (shape == 1) {
            sb.append("circle");
        } else if (shape == 2) {
            sb.append(com.google.android.exoplayer2.text.ttml.b.x0);
        } else if (shape != 3) {
            sb.append("unset");
        } else {
            sb.append(com.google.android.exoplayer2.text.ttml.b.y0);
        }
        return sb.toString();
    }
}
