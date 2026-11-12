package com.google.android.exoplayer2.text.webvtt;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan;
import com.google.android.exoplayer2.text.span.RubySpan;
import com.google.android.exoplayer2.text.span.SpanUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.xiaomi.hm.health.relation.OperationType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class WebvttCueParser {
    public static final float A = 0.5f;
    private static final String B = "WebvttCueParser";
    private static final Map<String, Integer> C;
    private static final Map<String, Integer> D;
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 3;
    private static final int d = 4;
    private static final int e = 5;
    private static final char g = '<';
    private static final char h = '>';
    private static final char i = '/';
    private static final char j = '&';
    private static final char k = ';';
    private static final char l = ' ';
    private static final String m = "lt";
    private static final String n = "gt";
    private static final String o = "amp";
    private static final String p = "nbsp";
    private static final String q = "b";
    private static final String r = "c";
    private static final String s = "i";
    private static final String t = "lang";
    private static final String u = "ruby";
    private static final String v = "rt";
    private static final String w = "u";
    private static final String x = "v";
    private static final int y = 1;
    private static final int z = 2;
    public static final Pattern CUE_HEADER_PATTERN = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern f = Pattern.compile("(\\S+?):(\\S+)");

    public static class b {
        private static final Comparator<b> c = new Comparator() { // from class: com.google.android.exoplayer2.text.webvtt.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return WebvttCueParser.b.e((WebvttCueParser.b) obj, (WebvttCueParser.b) obj2);
            }
        };
        private final c a;
        private final int b;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int e(b bVar, b bVar2) {
            return Integer.compare(bVar.a.b, bVar2.a.b);
        }

        private b(c startTag, int endPosition) {
            this.a = startTag;
            this.b = endPosition;
        }
    }

    public static final class c {
        public final String a;
        public final int b;
        public final String c;
        public final Set<String> d;

        private c(String name, int position, String voice, Set<String> classes) {
            this.b = position;
            this.a = name;
            this.c = voice;
            this.d = classes;
        }

        public static c a(String fullTagExpression, int position) {
            String str;
            String strTrim = fullTagExpression.trim();
            Assertions.checkArgument(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str = strTrim2;
            }
            String[] strArrSplit = Util.split(strTrim, "\\.");
            String str2 = strArrSplit[0];
            HashSet hashSet = new HashSet();
            for (int i = 1; i < strArrSplit.length; i++) {
                hashSet.add(strArrSplit[i]);
            }
            return new c(str2, position, str, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    public static final class d implements Comparable<d> {
        public final int a;
        public final WebvttCssStyle b;

        public d(int score, WebvttCssStyle style) {
            this.a = score;
            this.b = style;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d another) {
            return Integer.compare(this.a, another.a);
        }
    }

    public static final class e {
        public CharSequence c;
        public long a = 0;
        public long b = 0;
        public int d = 2;
        public float e = -3.4028235E38f;
        public int f = 1;
        public int g = 0;
        public float h = -3.4028235E38f;
        public int i = Integer.MIN_VALUE;
        public float j = 1.0f;
        public int k = Integer.MIN_VALUE;

        private static float b(float line, int lineType) {
            if (line != -3.4028235E38f && lineType == 0 && (line < 0.0f || line > 1.0f)) {
                return 1.0f;
            }
            if (line != -3.4028235E38f) {
                return line;
            }
            return lineType == 0 ? 1.0f : -3.4028235E38f;
        }

        @Nullable
        private static Layout.Alignment c(int textAlignment) {
            if (textAlignment != 1) {
                if (textAlignment == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (textAlignment != 3) {
                    if (textAlignment != 4) {
                        if (textAlignment != 5) {
                            StringBuilder sb = new StringBuilder(34);
                            sb.append("Unknown textAlignment: ");
                            sb.append(textAlignment);
                            Log.w(WebvttCueParser.B, sb.toString());
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int positionAnchor, float position) {
            if (positionAnchor == 0) {
                return 1.0f - position;
            }
            if (positionAnchor == 1) {
                return position <= 0.5f ? position * 2.0f : (1.0f - position) * 2.0f;
            }
            if (positionAnchor == 2) {
                return position;
            }
            throw new IllegalStateException(String.valueOf(positionAnchor));
        }

        private static float e(int textAlignment) {
            if (textAlignment != 4) {
                return textAlignment != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int textAlignment) {
            if (textAlignment == 1) {
                return 0;
            }
            if (textAlignment == 3) {
                return 2;
            }
            if (textAlignment != 4) {
                return textAlignment != 5 ? 1 : 2;
            }
            return 0;
        }

        public WebvttCueInfo a() {
            return new WebvttCueInfo(g().build(), this.a, this.b);
        }

        public Cue.Builder g() {
            float fE = this.h;
            if (fE == -3.4028235E38f) {
                fE = e(this.d);
            }
            int iF = this.i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.d);
            }
            Cue.Builder verticalType = new Cue.Builder().setTextAlignment(c(this.d)).setLine(b(this.e, this.f), this.f).setLineAnchor(this.g).setPosition(fE).setPositionAnchor(iF).setSize(Math.min(this.j, d(iF, fE))).setVerticalType(this.k);
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                verticalType.setText(charSequence);
            }
            return verticalType;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put(OperationType.Black, Integer.valueOf(Color.rgb(0, 0, 0)));
        C = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        D = Collections.unmodifiableMap(map2);
    }

    private static void a(SpannableStringBuilder text, Set<String> classes, int start, int end) {
        for (String str : classes) {
            Map<String, Integer> map = C;
            if (map.containsKey(str)) {
                text.setSpan(new ForegroundColorSpan(map.get(str).intValue()), start, end, 33);
            } else {
                Map<String, Integer> map2 = D;
                if (map2.containsKey(str)) {
                    text.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), start, end, 33);
                }
            }
        }
    }

    private static void b(String entity, SpannableStringBuilder spannedText) {
        entity.hashCode();
        switch (entity) {
            case "gt":
                spannedText.append('>');
                break;
            case "lt":
                spannedText.append('<');
                break;
            case "amp":
                spannedText.append('&');
                break;
            case "nbsp":
                spannedText.append(' ');
                break;
            default:
                StringBuilder sb = new StringBuilder(entity.length() + 33);
                sb.append("ignoring unsupported entity: '&");
                sb.append(entity);
                sb.append(";'");
                Log.w(B, sb.toString());
                break;
        }
    }

    private static void c(SpannableStringBuilder text, @Nullable String cueId, c startTag, List<b> nestedElements, List<WebvttCssStyle> styles) {
        int i2 = i(styles, cueId, startTag);
        ArrayList arrayList = new ArrayList(nestedElements.size());
        arrayList.addAll(nestedElements);
        Collections.sort(arrayList, b.c);
        int i3 = startTag.b;
        int length = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if (v.equals(((b) arrayList.get(i4)).a.a)) {
                b bVar = (b) arrayList.get(i4);
                int iG = g(i(styles, cueId, bVar.a), i2, 1);
                int i5 = bVar.a.b - length;
                int i6 = bVar.b - length;
                CharSequence charSequenceSubSequence = text.subSequence(i5, i6);
                text.delete(i5, i6);
                text.setSpan(new RubySpan(charSequenceSubSequence.toString(), iG), i3, i5, 33);
                length += charSequenceSubSequence.length();
                i3 = i5;
            }
        }
    }

    private static void d(@Nullable String cueId, c startTag, List<b> nestedElements, SpannableStringBuilder text, List<WebvttCssStyle> styles) {
        int i2 = startTag.b;
        int length = text.length();
        String str = startTag.a;
        str.hashCode();
        switch (str) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                text.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case "c":
                a(text, startTag.d, i2, length);
                break;
            case "i":
                text.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case "u":
                text.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case "ruby":
                c(text, cueId, startTag, nestedElements, styles);
                break;
            default:
                return;
        }
        List<d> listH = h(styles, cueId, startTag);
        for (int i3 = 0; i3 < listH.size(); i3++) {
            e(text, listH.get(i3).b, i2, length);
        }
    }

    private static void e(SpannableStringBuilder spannedText, WebvttCssStyle style, int start, int end) {
        if (style == null) {
            return;
        }
        if (style.getStyle() != -1) {
            SpanUtil.addOrReplaceSpan(spannedText, new StyleSpan(style.getStyle()), start, end, 33);
        }
        if (style.isLinethrough()) {
            spannedText.setSpan(new StrikethroughSpan(), start, end, 33);
        }
        if (style.isUnderline()) {
            spannedText.setSpan(new UnderlineSpan(), start, end, 33);
        }
        if (style.hasFontColor()) {
            SpanUtil.addOrReplaceSpan(spannedText, new ForegroundColorSpan(style.getFontColor()), start, end, 33);
        }
        if (style.hasBackgroundColor()) {
            SpanUtil.addOrReplaceSpan(spannedText, new BackgroundColorSpan(style.getBackgroundColor()), start, end, 33);
        }
        if (style.getFontFamily() != null) {
            SpanUtil.addOrReplaceSpan(spannedText, new TypefaceSpan(style.getFontFamily()), start, end, 33);
        }
        int fontSizeUnit = style.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            SpanUtil.addOrReplaceSpan(spannedText, new AbsoluteSizeSpan((int) style.getFontSize(), true), start, end, 33);
        } else if (fontSizeUnit == 2) {
            SpanUtil.addOrReplaceSpan(spannedText, new RelativeSizeSpan(style.getFontSize()), start, end, 33);
        } else if (fontSizeUnit == 3) {
            SpanUtil.addOrReplaceSpan(spannedText, new RelativeSizeSpan(style.getFontSize() / 100.0f), start, end, 33);
        }
        if (style.getCombineUpright()) {
            spannedText.setSpan(new HorizontalTextInVerticalContextSpan(), start, end, 33);
        }
    }

    private static int f(String markup, int startPos) {
        int iIndexOf = markup.indexOf(62, startPos);
        return iIndexOf == -1 ? markup.length() : iIndexOf + 1;
    }

    private static int g(int position1, int position2, int position3) {
        if (position1 != -1) {
            return position1;
        }
        if (position2 != -1) {
            return position2;
        }
        if (position3 != -1) {
            return position3;
        }
        throw new IllegalArgumentException();
    }

    private static List<d> h(List<WebvttCssStyle> declaredStyles, @Nullable String id, c tag) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < declaredStyles.size(); i2++) {
            WebvttCssStyle webvttCssStyle = declaredStyles.get(i2);
            int specificityScore = webvttCssStyle.getSpecificityScore(id, tag.a, tag.d, tag.c);
            if (specificityScore > 0) {
                arrayList.add(new d(specificityScore, webvttCssStyle));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int i(List<WebvttCssStyle> styles, @Nullable String cueId, c startTag) {
        List<d> listH = h(styles, cueId, startTag);
        for (int i2 = 0; i2 < listH.size(); i2++) {
            WebvttCssStyle webvttCssStyle = listH.get(i2).b;
            if (webvttCssStyle.getRubyPosition() != -1) {
                return webvttCssStyle.getRubyPosition();
            }
        }
        return -1;
    }

    private static String j(String tagExpression) {
        String strTrim = tagExpression.trim();
        Assertions.checkArgument(!strTrim.isEmpty());
        return Util.splitAtFirst(strTrim, "[ \\.]")[0];
    }

    private static boolean k(String tagName) {
        tagName.hashCode();
        switch (tagName) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static Cue l(CharSequence text) {
        e eVar = new e();
        eVar.c = text;
        return eVar.g().build();
    }

    @Nullable
    private static WebvttCueInfo m(@Nullable String id, Matcher cueHeaderMatcher, ParsableByteArray webvttData, List<WebvttCssStyle> styles) {
        e eVar = new e();
        try {
            eVar.a = WebvttParserUtil.parseTimestampUs((String) Assertions.checkNotNull(cueHeaderMatcher.group(1)));
            eVar.b = WebvttParserUtil.parseTimestampUs((String) Assertions.checkNotNull(cueHeaderMatcher.group(2)));
            o((String) Assertions.checkNotNull(cueHeaderMatcher.group(3)), eVar);
            StringBuilder sb = new StringBuilder();
            String line = webvttData.readLine();
            while (!TextUtils.isEmpty(line)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(line.trim());
                line = webvttData.readLine();
            }
            eVar.c = p(id, sb.toString(), styles);
            return eVar.a();
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(cueHeaderMatcher.group());
            Log.w(B, strValueOf.length() != 0 ? "Skipping cue with bad header: ".concat(strValueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    public static Cue.Builder n(String cueSettingsList) {
        e eVar = new e();
        o(cueSettingsList, eVar);
        return eVar.g();
    }

    private static void o(String cueSettingsList, e builder) {
        Matcher matcher = f.matcher(cueSettingsList);
        while (matcher.find()) {
            String str = (String) Assertions.checkNotNull(matcher.group(1));
            String str2 = (String) Assertions.checkNotNull(matcher.group(2));
            try {
                if ("line".equals(str)) {
                    r(str2, builder);
                } else if ("align".equals(str)) {
                    builder.d = u(str2);
                } else if ("position".equals(str)) {
                    t(str2, builder);
                } else if ("size".equals(str)) {
                    builder.j = WebvttParserUtil.parsePercentage(str2);
                } else if ("vertical".equals(str)) {
                    builder.k = v(str2);
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
                    sb.append("Unknown cue setting ");
                    sb.append(str);
                    sb.append(":");
                    sb.append(str2);
                    Log.w(B, sb.toString());
                }
            } catch (NumberFormatException unused) {
                String strValueOf = String.valueOf(matcher.group());
                Log.w(B, strValueOf.length() != 0 ? "Skipping bad cue setting: ".concat(strValueOf) : new String("Skipping bad cue setting: "));
            }
        }
    }

    public static SpannedString p(@Nullable String id, String markup, List<WebvttCssStyle> styles) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < markup.length()) {
            char cCharAt = markup.charAt(i2);
            if (cCharAt == '&') {
                i2++;
                int iIndexOf = markup.indexOf(59, i2);
                int iIndexOf2 = markup.indexOf(32, i2);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    b(markup.substring(i2, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i2 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i2++;
            } else {
                int iF = i2 + 1;
                if (iF < markup.length()) {
                    boolean z2 = markup.charAt(iF) == '/';
                    iF = f(markup, iF);
                    int i3 = iF - 2;
                    boolean z3 = markup.charAt(i3) == '/';
                    int i4 = i2 + (z2 ? 2 : 1);
                    if (!z3) {
                        i3 = iF - 1;
                    }
                    String strSubstring = markup.substring(i4, i3);
                    if (!strSubstring.trim().isEmpty()) {
                        String strJ = j(strSubstring);
                        if (k(strJ)) {
                            if (z2) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(id, cVar, arrayList, spannableStringBuilder, styles);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.a.equals(strJ)) {
                                        break;
                                    }
                                }
                            } else if (!z3) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i2 = iF;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(id, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, styles);
        }
        d(id, c.b(), Collections.emptyList(), spannableStringBuilder, styles);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    @Nullable
    public static WebvttCueInfo parseCue(ParsableByteArray webvttData, List<WebvttCssStyle> styles) {
        String line = webvttData.readLine();
        if (line == null) {
            return null;
        }
        Pattern pattern = CUE_HEADER_PATTERN;
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return m(null, matcher, webvttData, styles);
        }
        String line2 = webvttData.readLine();
        if (line2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(line2);
        if (matcher2.matches()) {
            return m(line.trim(), matcher2, webvttData, styles);
        }
        return null;
    }

    private static int q(String s2) {
        s2.hashCode();
        switch (s2) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                Log.w(B, s2.length() != 0 ? "Invalid anchor value: ".concat(s2) : new String("Invalid anchor value: "));
                return Integer.MIN_VALUE;
        }
    }

    private static void r(String s2, e builder) {
        int iIndexOf = s2.indexOf(44);
        if (iIndexOf != -1) {
            builder.g = q(s2.substring(iIndexOf + 1));
            s2 = s2.substring(0, iIndexOf);
        }
        if (s2.endsWith("%")) {
            builder.e = WebvttParserUtil.parsePercentage(s2);
            builder.f = 0;
        } else {
            builder.e = Integer.parseInt(s2);
            builder.f = 1;
        }
    }

    private static int s(String s2) {
        s2.hashCode();
        switch (s2) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                Log.w(B, s2.length() != 0 ? "Invalid anchor value: ".concat(s2) : new String("Invalid anchor value: "));
                return Integer.MIN_VALUE;
        }
    }

    private static void t(String s2, e builder) {
        int iIndexOf = s2.indexOf(44);
        if (iIndexOf != -1) {
            builder.i = s(s2.substring(iIndexOf + 1));
            s2 = s2.substring(0, iIndexOf);
        }
        builder.h = WebvttParserUtil.parsePercentage(s2);
    }

    private static int u(String s2) {
        s2.hashCode();
        switch (s2) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                Log.w(B, s2.length() != 0 ? "Invalid alignment value: ".concat(s2) : new String("Invalid alignment value: "));
                return 2;
        }
    }

    private static int v(String s2) {
        s2.hashCode();
        if (s2.equals("lr")) {
            return 2;
        }
        if (s2.equals("rl")) {
            return 1;
        }
        Log.w(B, s2.length() != 0 ? "Invalid 'vertical' value: ".concat(s2) : new String("Invalid 'vertical' value: "));
        return Integer.MIN_VALUE;
    }
}
