package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ColorParser;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.common.base.Ascii;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.huami.watch.ota.UpdateUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class TtmlDecoder extends SimpleSubtitleDecoder {
    private static final int E = 30;
    private static final String p = "TtmlDecoder";
    private static final String q = "http://www.w3.org/ns/ttml#parameter";
    private static final String r = "begin";
    private static final String s = "dur";
    private static final String t = "end";
    private static final String u = "style";
    private static final String v = "region";
    private static final String w = "backgroundImage";
    private final XmlPullParserFactory o;
    private static final Pattern x = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern y = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern z = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern A = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern B = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern C = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern D = Pattern.compile("^(\\d+) (\\d+)$");
    private static final b F = new b(30.0f, 1, 1);
    private static final a G = new a(32, 15);

    public static final class a {
        public final int a;
        public final int b;

        public a(int columns, int rows) {
            this.a = columns;
            this.b = rows;
        }
    }

    public static final class b {
        public final float a;
        public final int b;
        public final int c;

        public b(float effectiveFrameRate, int subFrameRate, int tickRate) {
            this.a = effectiveFrameRate;
            this.b = subFrameRate;
            this.c = tickRate;
        }
    }

    public static final class c {
        public final int a;
        public final int b;

        public c(int width, int height) {
            this.a = width;
            this.b = height;
        }
    }

    public TtmlDecoder() {
        super(p);
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private static TtmlStyle j(@Nullable TtmlStyle style) {
        return style == null ? new TtmlStyle() : style;
    }

    private static boolean k(String tag) {
        return tag.equals(com.google.android.exoplayer2.text.ttml.b.n) || tag.equals(com.google.android.exoplayer2.text.ttml.b.o) || tag.equals("body") || tag.equals(com.google.android.exoplayer2.text.ttml.b.q) || tag.equals(com.google.android.exoplayer2.text.ttml.b.r) || tag.equals("span") || tag.equals(com.google.android.exoplayer2.text.ttml.b.t) || tag.equals("style") || tag.equals(com.google.android.exoplayer2.text.ttml.b.v) || tag.equals("layout") || tag.equals("region") || tag.equals("metadata") || tag.equals("image") || tag.equals("data") || tag.equals("information");
    }

    @Nullable
    private static Layout.Alignment l(String alignment) {
        String lowerCase = Ascii.toLowerCase(alignment);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static a m(XmlPullParser xmlParser, a defaultValue) throws SubtitleDecoderException {
        String attributeValue = xmlParser.getAttributeValue(q, "cellResolution");
        if (attributeValue == null) {
            return defaultValue;
        }
        Matcher matcher = D.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(p, attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return defaultValue;
        }
        try {
            int i = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
            int i2 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2)));
            if (i != 0 && i2 != 0) {
                return new a(i, i2);
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid cell resolution ");
            sb.append(i);
            sb.append(" ");
            sb.append(i2);
            throw new SubtitleDecoderException(sb.toString());
        } catch (NumberFormatException unused) {
            Log.w(p, attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return defaultValue;
        }
    }

    private static void n(String expression, TtmlStyle out) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrSplit = Util.split(expression, "\\s+");
        if (strArrSplit.length == 1) {
            matcher = z.matcher(expression);
        } else {
            if (strArrSplit.length != 2) {
                int length = strArrSplit.length;
                StringBuilder sb = new StringBuilder(52);
                sb.append("Invalid number of entries for fontSize: ");
                sb.append(length);
                sb.append(".");
                throw new SubtitleDecoderException(sb.toString());
            }
            matcher = z.matcher(strArrSplit[1]);
            Log.w(p, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(expression).length() + 36);
            sb2.append("Invalid expression for fontSize: '");
            sb2.append(expression);
            sb2.append("'.");
            throw new SubtitleDecoderException(sb2.toString());
        }
        String str = (String) Assertions.checkNotNull(matcher.group(3));
        str.hashCode();
        switch (str) {
            case "%":
                out.A(3);
                break;
            case "em":
                out.A(2);
                break;
            case "px":
                out.A(1);
                break;
            default:
                StringBuilder sb3 = new StringBuilder(str.length() + 30);
                sb3.append("Invalid unit for fontSize: '");
                sb3.append(str);
                sb3.append("'.");
                throw new SubtitleDecoderException(sb3.toString());
        }
        out.z(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
    }

    private static b o(XmlPullParser xmlParser) throws SubtitleDecoderException {
        String attributeValue = xmlParser.getAttributeValue(q, "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlParser.getAttributeValue(q, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrSplit = Util.split(attributeValue2, " ");
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        }
        b bVar = F;
        int i2 = bVar.b;
        String attributeValue3 = xmlParser.getAttributeValue(q, "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = bVar.c;
        String attributeValue4 = xmlParser.getAttributeValue(q, "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new b(i * f, i2, i3);
    }

    private static Map<String, TtmlStyle> p(XmlPullParser xmlParser, Map<String, TtmlStyle> globalStyles, a cellResolution, @Nullable c ttsExtent, Map<String, com.google.android.exoplayer2.text.ttml.c> globalRegions, Map<String, String> imageMap) throws XmlPullParserException, IOException {
        do {
            xmlParser.next();
            if (XmlPullParserUtil.isStartTag(xmlParser, "style")) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlParser, "style");
                TtmlStyle ttmlStyleU = u(xmlParser, new TtmlStyle());
                if (attributeValue != null) {
                    for (String str : v(attributeValue)) {
                        ttmlStyleU.a(globalStyles.get(str));
                    }
                }
                String strG = ttmlStyleU.g();
                if (strG != null) {
                    globalStyles.put(strG, ttmlStyleU);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlParser, "region")) {
                com.google.android.exoplayer2.text.ttml.c cVarS = s(xmlParser, cellResolution, ttsExtent);
                if (cVarS != null) {
                    globalRegions.put(cVarS.a, cVarS);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlParser, "metadata")) {
                q(xmlParser, imageMap);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlParser, com.google.android.exoplayer2.text.ttml.b.o));
        return globalStyles;
    }

    private static void q(XmlPullParser xmlParser, Map<String, String> imageMap) throws XmlPullParserException, IOException {
        String attributeValue;
        do {
            xmlParser.next();
            if (XmlPullParserUtil.isStartTag(xmlParser, "image") && (attributeValue = XmlPullParserUtil.getAttributeValue(xmlParser, "id")) != null) {
                imageMap.put(attributeValue, xmlParser.nextText());
            }
        } while (!XmlPullParserUtil.isEndTag(xmlParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:6:0x0038  */
    private static com.google.android.exoplayer2.text.ttml.b r(XmlPullParser parser, @Nullable com.google.android.exoplayer2.text.ttml.b parent, Map<String, com.google.android.exoplayer2.text.ttml.c> regionMap, b frameAndTickRate) throws SubtitleDecoderException {
        long j;
        long j2;
        int attributeCount = parser.getAttributeCount();
        TtmlStyle ttmlStyleU = u(parser, null);
        String strSubstring = null;
        String str = "";
        long jW = C.TIME_UNSET;
        long jW2 = C.TIME_UNSET;
        long jW3 = C.TIME_UNSET;
        String[] strArr = null;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = parser.getAttributeName(i);
            String attributeValue = parser.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName) {
                case "region":
                    if (regionMap.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jW3 = w(attributeValue, frameAndTickRate);
                    break;
                case "end":
                    jW2 = w(attributeValue, frameAndTickRate);
                    break;
                case "begin":
                    jW = w(attributeValue, frameAndTickRate);
                    break;
                case "style":
                    String[] strArrV = v(attributeValue);
                    if (strArrV.length > 0) {
                        strArr = strArrV;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith(UpdateUtils.CMD_FILTER)) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (parent != null) {
            long j3 = parent.d;
            j = C.TIME_UNSET;
            if (j3 != C.TIME_UNSET) {
                if (jW != C.TIME_UNSET) {
                    jW += j3;
                }
                if (jW2 != C.TIME_UNSET) {
                    jW2 += j3;
                }
            }
        } else {
            j = C.TIME_UNSET;
        }
        long j4 = jW;
        if (jW2 != j) {
            j2 = jW2;
        } else if (jW3 != j) {
            j2 = j4 + jW3;
        } else if (parent != null) {
            long j5 = parent.e;
            if (j5 != j) {
                j2 = j5;
            } else {
                j2 = jW2;
            }
        } else {
            j2 = jW2;
        }
        return com.google.android.exoplayer2.text.ttml.b.c(parser.getName(), j4, j2, ttmlStyleU, strArr, str, strSubstring, parent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:60:0x016b  */
    /* JADX WARN: Code duplicated, block: B:65:0x018f  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b8  */
    @Nullable
    private static com.google.android.exoplayer2.text.ttml.c s(XmlPullParser xmlParser, a cellResolution, @Nullable c ttsExtent) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        int i2;
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlParser, "id");
        if (attributeValue == null) {
            return null;
        }
        String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlParser, "origin");
        if (attributeValue2 == null) {
            Log.w(p, "Ignoring region without an origin");
            return null;
        }
        Pattern pattern = B;
        Matcher matcher = pattern.matcher(attributeValue2);
        Pattern pattern2 = C;
        Matcher matcher2 = pattern2.matcher(attributeValue2);
        if (matcher.matches()) {
            try {
                float f6 = Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))) / 100.0f;
                f = Float.parseFloat((String) Assertions.checkNotNull(matcher.group(2))) / 100.0f;
                f2 = f6;
            } catch (NumberFormatException unused) {
                Log.w(p, attributeValue2.length() != 0 ? "Ignoring region with malformed origin: ".concat(attributeValue2) : new String("Ignoring region with malformed origin: "));
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                Log.w(p, attributeValue2.length() != 0 ? "Ignoring region with unsupported origin: ".concat(attributeValue2) : new String("Ignoring region with unsupported origin: "));
                return null;
            }
            if (ttsExtent == null) {
                Log.w(p, attributeValue2.length() != 0 ? "Ignoring region with missing tts:extent: ".concat(attributeValue2) : new String("Ignoring region with missing tts:extent: "));
                return null;
            }
            try {
                int i3 = Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(1)));
                int i4 = Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(2)));
                f2 = i3 / ttsExtent.a;
                f = i4 / ttsExtent.b;
            } catch (NumberFormatException unused2) {
                Log.w(p, attributeValue2.length() != 0 ? "Ignoring region with malformed origin: ".concat(attributeValue2) : new String("Ignoring region with malformed origin: "));
                return null;
            }
        }
        String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlParser, com.google.android.exoplayer2.text.ttml.b.F);
        if (attributeValue3 == null) {
            Log.w(p, "Ignoring region without an extent");
            return null;
        }
        Matcher matcher3 = pattern.matcher(attributeValue3);
        Matcher matcher4 = pattern2.matcher(attributeValue3);
        if (matcher3.matches()) {
            try {
                f3 = Float.parseFloat((String) Assertions.checkNotNull(matcher3.group(1))) / 100.0f;
                f4 = Float.parseFloat((String) Assertions.checkNotNull(matcher3.group(2))) / 100.0f;
            } catch (NumberFormatException unused3) {
                Log.w(p, attributeValue2.length() != 0 ? "Ignoring region with malformed extent: ".concat(attributeValue2) : new String("Ignoring region with malformed extent: "));
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                Log.w(p, attributeValue2.length() != 0 ? "Ignoring region with unsupported extent: ".concat(attributeValue2) : new String("Ignoring region with unsupported extent: "));
                return null;
            }
            if (ttsExtent == null) {
                Log.w(p, attributeValue2.length() != 0 ? "Ignoring region with missing tts:extent: ".concat(attributeValue2) : new String("Ignoring region with missing tts:extent: "));
                return null;
            }
            try {
                int i5 = Integer.parseInt((String) Assertions.checkNotNull(matcher4.group(1)));
                int i6 = Integer.parseInt((String) Assertions.checkNotNull(matcher4.group(2)));
                f3 = i5 / ttsExtent.a;
                f4 = i6 / ttsExtent.b;
            } catch (NumberFormatException unused4) {
                Log.w(p, attributeValue2.length() != 0 ? "Ignoring region with malformed extent: ".concat(attributeValue2) : new String("Ignoring region with malformed extent: "));
                return null;
            }
        }
        String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlParser, com.google.android.exoplayer2.text.ttml.b.G);
        if (attributeValue4 != null) {
            String lowerCase = Ascii.toLowerCase(attributeValue4);
            lowerCase.hashCode();
            if (lowerCase.equals(com.google.android.exoplayer2.text.ttml.b.m0)) {
                f5 = f + (f4 / 2.0f);
                i = 1;
            } else if (lowerCase.equals(com.google.android.exoplayer2.text.ttml.b.d0)) {
                f5 = f + f4;
                i = 2;
            } else {
                f5 = f;
                i = 0;
            }
        } else {
            f5 = f;
            i = 0;
        }
        float f7 = 1.0f / cellResolution.b;
        String attributeValue5 = XmlPullParserUtil.getAttributeValue(xmlParser, com.google.android.exoplayer2.text.ttml.b.T);
        if (attributeValue5 != null) {
            String lowerCase2 = Ascii.toLowerCase(attributeValue5);
            lowerCase2.hashCode();
            switch (lowerCase2) {
                case "tb":
                case "tblr":
                    i2 = 2;
                    break;
                case "tbrl":
                    i2 = 1;
                    break;
                default:
                    i2 = Integer.MIN_VALUE;
                    break;
            }
        } else {
            i2 = Integer.MIN_VALUE;
        }
        return new com.google.android.exoplayer2.text.ttml.c(attributeValue, f2, f5, 0, i, f3, f4, 1, f7, i2);
    }

    private static float t(String expression) {
        Matcher matcher = A.matcher(expression);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(expression);
            Log.w(p, strValueOf.length() != 0 ? "Invalid value for shear: ".concat(strValueOf) : new String("Invalid value for shear: "));
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1)))));
        } catch (NumberFormatException e) {
            String strValueOf2 = String.valueOf(expression);
            Log.w(p, strValueOf2.length() != 0 ? "Failed to parse shear: ".concat(strValueOf2) : new String("Failed to parse shear: "), e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:6:0x0020  */
    private static TtmlStyle u(XmlPullParser parser, TtmlStyle style) {
        int attributeCount = parser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = parser.getAttributeValue(i);
            String attributeName = parser.getAttributeName(i);
            attributeName.hashCode();
            switch (attributeName) {
                case "fontStyle":
                    style = j(style).C(com.google.android.exoplayer2.text.ttml.b.j0.equalsIgnoreCase(attributeValue));
                    break;
                case "fontFamily":
                    style = j(style).y(attributeValue);
                    break;
                case "textAlign":
                    style = j(style).I(l(attributeValue));
                    break;
                case "textDecoration":
                    String lowerCase = Ascii.toLowerCase(attributeValue);
                    lowerCase.hashCode();
                    switch (lowerCase) {
                        case "nounderline":
                            style = j(style).L(false);
                            break;
                        case "underline":
                            style = j(style).L(true);
                            break;
                        case "nolinethrough":
                            style = j(style).D(false);
                            break;
                        case "linethrough":
                            style = j(style).D(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    style = j(style).w(com.google.android.exoplayer2.text.ttml.b.k0.equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!"style".equals(parser.getName())) {
                        break;
                    } else {
                        style = j(style).B(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String lowerCase2 = Ascii.toLowerCase(attributeValue);
                    lowerCase2.hashCode();
                    switch (lowerCase2) {
                        case "baseContainer":
                        case "base":
                            style = j(style).G(2);
                            break;
                        case "container":
                            style = j(style).G(1);
                            break;
                        case "delimiter":
                            style = j(style).G(4);
                            break;
                        case "textContainer":
                        case "text":
                            style = j(style).G(3);
                            break;
                    }
                    break;
                case "color":
                    style = j(style);
                    try {
                        style.x(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        String strValueOf = String.valueOf(attributeValue);
                        Log.w(p, strValueOf.length() != 0 ? "Failed parsing color value: ".concat(strValueOf) : new String("Failed parsing color value: "));
                        break;
                    }
                    break;
                case "shear":
                    style = j(style).H(t(attributeValue));
                    break;
                case "textCombine":
                    String lowerCase3 = Ascii.toLowerCase(attributeValue);
                    lowerCase3.hashCode();
                    if (!lowerCase3.equals("all")) {
                        if (lowerCase3.equals("none")) {
                            style = j(style).J(false);
                        }
                        break;
                    } else {
                        style = j(style).J(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        style = j(style);
                        n(attributeValue, style);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        String strValueOf2 = String.valueOf(attributeValue);
                        Log.w(p, strValueOf2.length() != 0 ? "Failed parsing fontSize value: ".concat(strValueOf2) : new String("Failed parsing fontSize value: "));
                        break;
                    }
                    break;
                case "textEmphasis":
                    style = j(style).K(TextEmphasis.a(attributeValue));
                    break;
                case "rubyPosition":
                    String lowerCase4 = Ascii.toLowerCase(attributeValue);
                    lowerCase4.hashCode();
                    if (!lowerCase4.equals(com.google.android.exoplayer2.text.ttml.b.c0)) {
                        if (lowerCase4.equals(com.google.android.exoplayer2.text.ttml.b.d0)) {
                            style = j(style).F(2);
                        }
                        break;
                    } else {
                        style = j(style).F(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    style = j(style);
                    try {
                        style.v(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        String strValueOf3 = String.valueOf(attributeValue);
                        Log.w(p, strValueOf3.length() != 0 ? "Failed parsing background value: ".concat(strValueOf3) : new String("Failed parsing background value: "));
                        break;
                    }
                    break;
                case "multiRowAlign":
                    style = j(style).E(l(attributeValue));
                    break;
            }
        }
        return style;
    }

    private static String[] v(String parentStyleIds) {
        String strTrim = parentStyleIds.trim();
        return strTrim.isEmpty() ? new String[0] : Util.split(strTrim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x00b7  */
    private static long w(String time, b frameAndTickRate) throws SubtitleDecoderException {
        double d;
        double d2;
        Matcher matcher = x.matcher(time);
        if (matcher.matches()) {
            double d3 = (Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) * TimeUtils.TIME_1_HOURS) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))) * 60) + Long.parseLong((String) Assertions.checkNotNull(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d4 = d3 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d5 = d4 + (strGroup2 != null ? Long.parseLong(strGroup2) / frameAndTickRate.a : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d5 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) frameAndTickRate.b)) / ((double) frameAndTickRate.a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = y.matcher(time);
        if (!matcher2.matches()) {
            String strValueOf = String.valueOf(time);
            throw new SubtitleDecoderException(strValueOf.length() != 0 ? "Malformed time expression: ".concat(strValueOf) : new String("Malformed time expression: "));
        }
        double d6 = Double.parseDouble((String) Assertions.checkNotNull(matcher2.group(1)));
        String str = (String) Assertions.checkNotNull(matcher2.group(2));
        str.hashCode();
        switch (str) {
            case "f":
                d = frameAndTickRate.a;
                d6 /= d;
                return (long) (d6 * 1000000.0d);
            case "h":
                d2 = 3600.0d;
                break;
            case "m":
                d2 = 60.0d;
                break;
            case "t":
                d = frameAndTickRate.c;
                d6 /= d;
                return (long) (d6 * 1000000.0d);
            case "ms":
                d = 1000.0d;
                d6 /= d;
                return (long) (d6 * 1000000.0d);
            default:
                return (long) (d6 * 1000000.0d);
        }
        d6 *= d2;
        return (long) (d6 * 1000000.0d);
    }

    @Nullable
    private static c x(XmlPullParser xmlParser) {
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlParser, com.google.android.exoplayer2.text.ttml.b.F);
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = C.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(p, attributeValue.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(attributeValue) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            return new c(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            Log.w(p, attributeValue.length() != 0 ? "Ignoring malformed tts extent: ".concat(attributeValue) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bytes, int length, boolean reset) throws SubtitleDecoderException {
        b bVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new com.google.android.exoplayer2.text.ttml.c(""));
            c cVarX = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bytes, 0, length), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarO = F;
            a aVarM = G;
            e eVar = null;
            int i = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                com.google.android.exoplayer2.text.ttml.b bVar2 = (com.google.android.exoplayer2.text.ttml.b) arrayDeque.peek();
                if (i == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (com.google.android.exoplayer2.text.ttml.b.n.equals(name)) {
                            bVarO = o(xmlPullParserNewPullParser);
                            aVarM = m(xmlPullParserNewPullParser, G);
                            cVarX = x(xmlPullParserNewPullParser);
                        }
                        c cVar = cVarX;
                        b bVar3 = bVarO;
                        a aVar = aVarM;
                        if (k(name)) {
                            if (com.google.android.exoplayer2.text.ttml.b.o.equals(name)) {
                                bVar = bVar3;
                                p(xmlPullParserNewPullParser, map, aVar, cVar, map2, map3);
                            } else {
                                bVar = bVar3;
                                try {
                                    com.google.android.exoplayer2.text.ttml.b bVarR = r(xmlPullParserNewPullParser, bVar2, map2, bVar);
                                    arrayDeque.push(bVarR);
                                    if (bVar2 != null) {
                                        bVar2.a(bVarR);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    Log.w(p, "Suppressing parser error", e);
                                    i++;
                                }
                            }
                            bVarO = bVar;
                        } else {
                            String strValueOf = String.valueOf(xmlPullParserNewPullParser.getName());
                            Log.i(p, strValueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(strValueOf) : new String("Ignoring unsupported tag: "));
                            i++;
                            bVarO = bVar3;
                        }
                        cVarX = cVar;
                        aVarM = aVar;
                    } else if (eventType == 4) {
                        ((com.google.android.exoplayer2.text.ttml.b) Assertions.checkNotNull(bVar2)).a(com.google.android.exoplayer2.text.ttml.b.d(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(com.google.android.exoplayer2.text.ttml.b.n)) {
                            eVar = new e((com.google.android.exoplayer2.text.ttml.b) Assertions.checkNotNull((com.google.android.exoplayer2.text.ttml.b) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i++;
                } else if (eventType == 3) {
                    i--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (eVar != null) {
                return eVar;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new SubtitleDecoderException("Unable to decode source", e3);
        }
    }
}
