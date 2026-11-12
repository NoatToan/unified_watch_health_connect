package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import com.airbnb.lottie.animation.keyframe.a;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ColorParser;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.android.exoplayer2.v;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import r1.q2;

/* JADX INFO: loaded from: classes14.dex */
public final class TtmlDecoder extends SimpleSubtitleDecoder {
    private static final String ATTR_BEGIN = "begin";
    private static final String ATTR_DURATION = "dur";
    private static final String ATTR_END = "end";
    private static final String ATTR_IMAGE = "backgroundImage";
    private static final String ATTR_REGION = "region";
    private static final String ATTR_STYLE = "style";
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final String TAG = "TtmlDecoder";
    private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern SIGNED_PERCENTAGE = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern PIXEL_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
    private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30.0f, 1, 1);
    private static final CellResolution DEFAULT_CELL_RESOLUTION = new CellResolution(32, 15);

    public static final class CellResolution {
        final int columns;
        final int rows;

        public CellResolution(int i14, int i15) {
            this.columns = i14;
            this.rows = i15;
        }
    }

    public static final class FrameAndTickRate {
        final float effectiveFrameRate;
        final int subFrameRate;
        final int tickRate;

        public FrameAndTickRate(float f14, int i14, int i15) {
            this.effectiveFrameRate = f14;
            this.subFrameRate = i14;
            this.tickRate = i15;
        }
    }

    public static final class TtsExtent {
        final int height;
        final int width;

        public TtsExtent(int i14, int i15) {
            this.width = i14;
            this.height = i15;
        }
    }

    public TtmlDecoder() {
        super(TAG);
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.xmlParserFactory = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e4) {
            q2.v("Couldn't create XmlPullParserFactory instance", e4);
            throw null;
        }
    }

    private static TtmlStyle createIfNull(TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    private static boolean isSupportedTag(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals(TtmlNode.TAG_BODY) || str.equals(TtmlNode.TAG_DIV) || str.equals("p") || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals("style") || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals("region") || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals(TtmlNode.TAG_INFORMATION);
    }

    private static Layout.Alignment parseAlignment(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
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

    private static CellResolution parseCellResolution(XmlPullParser xmlPullParser, CellResolution cellResolution) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "cellResolution");
        if (attributeValue == null) {
            return cellResolution;
        }
        Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return cellResolution;
        }
        try {
            int i14 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
            int i15 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2)));
            if (i14 != 0 && i15 != 0) {
                return new CellResolution(i14, i15);
            }
            StringBuilder sb3 = new StringBuilder(47);
            sb3.append("Invalid cell resolution ");
            sb3.append(i14);
            sb3.append(StringUtils.SPACE);
            sb3.append(i15);
            throw new SubtitleDecoderException(sb3.toString());
        } catch (NumberFormatException unused) {
            Log.w(TAG, attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return cellResolution;
        }
    }

    private static void parseFontSize(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrSplit = Util.split(str, "\\s+");
        if (strArrSplit.length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                int length = strArrSplit.length;
                StringBuilder sb3 = new StringBuilder(52);
                sb3.append("Invalid number of entries for fontSize: ");
                sb3.append(length);
                sb3.append(".");
                throw new SubtitleDecoderException(sb3.toString());
            }
            matcher = FONT_SIZE.matcher(strArrSplit[1]);
            Log.w(TAG, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(v.c(v.a(36, str), "Invalid expression for fontSize: '", str, "'."));
        }
        String str2 = (String) Assertions.checkNotNull(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                ttmlStyle.setFontSizeUnit(3);
                break;
            case "em":
                ttmlStyle.setFontSizeUnit(2);
                break;
            case "px":
                ttmlStyle.setFontSizeUnit(1);
                break;
            default:
                throw new SubtitleDecoderException(v.c(str2.length() + 30, "Invalid unit for fontSize: '", str2, "'."));
        }
        ttmlStyle.setFontSize(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
    }

    private static FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        float f14;
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "frameRate");
        int i14 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue(TTP, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrSplit = Util.split(attributeValue2, StringUtils.SPACE);
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f14 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f14 = 1.0f;
        }
        FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
        int i15 = frameAndTickRate.subFrameRate;
        String attributeValue3 = xmlPullParser.getAttributeValue(TTP, "subFrameRate");
        if (attributeValue3 != null) {
            i15 = Integer.parseInt(attributeValue3);
        }
        int i16 = frameAndTickRate.tickRate;
        String attributeValue4 = xmlPullParser.getAttributeValue(TTP, "tickRate");
        if (attributeValue4 != null) {
            i16 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(i14 * f14, i15, i16);
    }

    private static Map<String, TtmlStyle> parseHeader(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, CellResolution cellResolution, TtsExtent ttsExtent, Map<String, TtmlRegion> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "style")) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "style");
                TtmlStyle styleAttributes = parseStyleAttributes(xmlPullParser, new TtmlStyle());
                if (attributeValue != null) {
                    for (String str : parseStyleIds(attributeValue)) {
                        styleAttributes.chain(map.get(str));
                    }
                }
                String id3 = styleAttributes.getId();
                if (id3 != null) {
                    map.put(id3, styleAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "region")) {
                TtmlRegion regionAttributes = parseRegionAttributes(xmlPullParser, cellResolution, ttsExtent);
                if (regionAttributes != null) {
                    map2.put(regionAttributes.f53093id, regionAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, TtmlNode.TAG_METADATA)) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    private static void parseMetadata(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String attributeValue;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "image") && (attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_ID)) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_METADATA));
    }

    private static TtmlNode parseNode(XmlPullParser xmlPullParser, TtmlNode ttmlNode, Map<String, TtmlRegion> map, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String strSubstring = null;
        TtmlStyle styleAttributes = parseStyleAttributes(xmlPullParser2, null);
        long timeExpression = -9223372036854775807L;
        long timeExpression2 = -9223372036854775807L;
        long timeExpression3 = -9223372036854775807L;
        String[] strArr = null;
        String str = "";
        int i14 = 0;
        while (i14 < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i14);
            int i15 = attributeCount;
            String attributeValue = xmlPullParser2.getAttributeValue(i14);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    i14++;
                    xmlPullParser2 = xmlPullParser;
                    attributeCount = i15;
                    break;
                case "dur":
                    timeExpression3 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "end":
                    timeExpression2 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "begin":
                    timeExpression = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "style":
                    String[] styleIds = parseStyleIds(attributeValue);
                    if (styleIds.length > 0) {
                        strArr = styleIds;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i14++;
            xmlPullParser2 = xmlPullParser;
            attributeCount = i15;
        }
        if (ttmlNode != null) {
            long j8 = ttmlNode.startTimeUs;
            if (j8 != C.TIME_UNSET) {
                if (timeExpression != C.TIME_UNSET) {
                    timeExpression += j8;
                }
                if (timeExpression2 != C.TIME_UNSET) {
                    timeExpression2 += j8;
                }
            }
        }
        long j14 = timeExpression;
        if (timeExpression2 == C.TIME_UNSET) {
            if (timeExpression3 != C.TIME_UNSET) {
                timeExpression2 = j14 + timeExpression3;
            } else if (ttmlNode != null) {
                long j15 = ttmlNode.endTimeUs;
                if (j15 != C.TIME_UNSET) {
                    timeExpression2 = j15;
                }
            }
        }
        return TtmlNode.buildNode(xmlPullParser.getName(), j14, timeExpression2, styleAttributes, strArr, str, strSubstring, ttmlNode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:61:0x016e  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b9  */
    private static TtmlRegion parseRegionAttributes(XmlPullParser xmlPullParser, CellResolution cellResolution, TtsExtent ttsExtent) {
        float f14;
        float f15;
        float f16;
        float f17;
        int i14;
        float f18;
        int i15;
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_ID);
        if (attributeValue == null) {
            return null;
        }
        String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, "origin");
        if (attributeValue2 == null) {
            Log.w(TAG, "Ignoring region without an origin");
            return null;
        }
        Pattern pattern = PERCENTAGE_COORDINATES;
        Matcher matcher = pattern.matcher(attributeValue2);
        Pattern pattern2 = PIXEL_COORDINATES;
        Matcher matcher2 = pattern2.matcher(attributeValue2);
        int i16 = 2;
        if (matcher.matches()) {
            try {
                f14 = Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))) / 100.0f;
                f15 = Float.parseFloat((String) Assertions.checkNotNull(matcher.group(2))) / 100.0f;
            } catch (NumberFormatException unused) {
                Log.w(TAG, attributeValue2.length() != 0 ? "Ignoring region with malformed origin: ".concat(attributeValue2) : new String("Ignoring region with malformed origin: "));
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                Log.w(TAG, attributeValue2.length() != 0 ? "Ignoring region with unsupported origin: ".concat(attributeValue2) : new String("Ignoring region with unsupported origin: "));
                return null;
            }
            if (ttsExtent == null) {
                Log.w(TAG, attributeValue2.length() != 0 ? "Ignoring region with missing tts:extent: ".concat(attributeValue2) : new String("Ignoring region with missing tts:extent: "));
                return null;
            }
            try {
                int i17 = Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(1)));
                int i18 = Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(2)));
                float f19 = i17 / ttsExtent.width;
                float f22 = i18 / ttsExtent.height;
                f14 = f19;
                f15 = f22;
            } catch (NumberFormatException unused2) {
                Log.w(TAG, attributeValue2.length() != 0 ? "Ignoring region with malformed origin: ".concat(attributeValue2) : new String("Ignoring region with malformed origin: "));
                return null;
            }
        }
        String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue3 == null) {
            Log.w(TAG, "Ignoring region without an extent");
            return null;
        }
        Matcher matcher3 = pattern.matcher(attributeValue3);
        Matcher matcher4 = pattern2.matcher(attributeValue3);
        if (matcher3.matches()) {
            try {
                f16 = Float.parseFloat((String) Assertions.checkNotNull(matcher3.group(1))) / 100.0f;
                f17 = Float.parseFloat((String) Assertions.checkNotNull(matcher3.group(2))) / 100.0f;
            } catch (NumberFormatException unused3) {
                Log.w(TAG, attributeValue2.length() != 0 ? "Ignoring region with malformed extent: ".concat(attributeValue2) : new String("Ignoring region with malformed extent: "));
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                Log.w(TAG, attributeValue2.length() != 0 ? "Ignoring region with unsupported extent: ".concat(attributeValue2) : new String("Ignoring region with unsupported extent: "));
                return null;
            }
            if (ttsExtent == null) {
                Log.w(TAG, attributeValue2.length() != 0 ? "Ignoring region with missing tts:extent: ".concat(attributeValue2) : new String("Ignoring region with missing tts:extent: "));
                return null;
            }
            try {
                int i19 = Integer.parseInt((String) Assertions.checkNotNull(matcher4.group(1)));
                int i24 = Integer.parseInt((String) Assertions.checkNotNull(matcher4.group(2)));
                float f24 = i19 / ttsExtent.width;
                f17 = i24 / ttsExtent.height;
                f16 = f24;
            } catch (NumberFormatException unused4) {
                Log.w(TAG, attributeValue2.length() != 0 ? "Ignoring region with malformed extent: ".concat(attributeValue2) : new String("Ignoring region with malformed extent: "));
                return null;
            }
        }
        float f25 = f17;
        String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
        if (attributeValue4 != null) {
            String lowerCase = Ascii.toLowerCase(attributeValue4);
            lowerCase.getClass();
            if (lowerCase.equals(TtmlNode.CENTER)) {
                f18 = f15 + (f25 / 2.0f);
                i14 = 1;
            } else if (lowerCase.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                f18 = f15 + f25;
                i14 = 2;
            } else {
                i14 = 0;
                f18 = f15;
            }
        } else {
            i14 = 0;
            f18 = f15;
        }
        float f26 = 1.0f / cellResolution.rows;
        String attributeValue5 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
        if (attributeValue5 != null) {
            String lowerCase2 = Ascii.toLowerCase(attributeValue5);
            lowerCase2.getClass();
            switch (lowerCase2) {
                case "tb":
                case "tblr":
                    i15 = i16;
                    break;
                case "tbrl":
                    i15 = 1;
                    break;
                default:
                    i16 = Integer.MIN_VALUE;
                    i15 = i16;
                    break;
            }
        } else {
            i16 = Integer.MIN_VALUE;
            i15 = i16;
        }
        return new TtmlRegion(attributeValue, f14, f18, 0, i14, f16, f25, 1, f26, i15);
    }

    private static float parseShear(String str) {
        Matcher matcher = SIGNED_PERCENTAGE.matcher(str);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(str);
            Log.w(TAG, strValueOf.length() != 0 ? "Invalid value for shear: ".concat(strValueOf) : new String("Invalid value for shear: "));
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1)))));
        } catch (NumberFormatException e4) {
            String strValueOf2 = String.valueOf(str);
            Log.w(TAG, strValueOf2.length() != 0 ? "Failed to parse shear: ".concat(strValueOf2) : new String("Failed to parse shear: "), e4);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static TtmlStyle parseStyleAttributes(XmlPullParser xmlPullParser, TtmlStyle ttmlStyle) {
        byte b14;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i14 = 0; i14 < attributeCount; i14++) {
            String attributeValue = xmlPullParser.getAttributeValue(i14);
            String attributeName = xmlPullParser.getAttributeName(i14);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    b14 = attributeName.equals(TtmlNode.ATTR_TTS_FONT_STYLE) ? (byte) 0 : (byte) -1;
                    break;
                case -1224696685:
                    b14 = attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY) ? (byte) 1 : (byte) -1;
                    break;
                case -1065511464:
                    b14 = attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN) ? (byte) 2 : (byte) -1;
                    break;
                case -879295043:
                    b14 = attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION) ? (byte) 3 : (byte) -1;
                    break;
                case -734428249:
                    b14 = attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT) ? (byte) 4 : (byte) -1;
                    break;
                case 3355:
                    b14 = attributeName.equals(TtmlNode.ATTR_ID) ? (byte) 5 : (byte) -1;
                    break;
                case 3511770:
                    b14 = attributeName.equals(TtmlNode.ATTR_TTS_RUBY) ? (byte) 6 : (byte) -1;
                    break;
                case 94842723:
                    b14 = attributeName.equals(TtmlNode.ATTR_TTS_COLOR) ? (byte) 7 : (byte) -1;
                    break;
                case 109403361:
                    b14 = attributeName.equals(TtmlNode.ATTR_TTS_SHEAR) ? (byte) 8 : (byte) -1;
                    break;
                case 110138194:
                    b14 = attributeName.equals(TtmlNode.ATTR_TTS_TEXT_COMBINE) ? (byte) 9 : (byte) -1;
                    break;
                case 365601008:
                    b14 = attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE) ? (byte) 10 : (byte) -1;
                    break;
                case 921125321:
                    b14 = attributeName.equals(TtmlNode.ATTR_TTS_TEXT_EMPHASIS) ? Ascii.VT : (byte) -1;
                    break;
                case 1115953443:
                    b14 = attributeName.equals(TtmlNode.ATTR_TTS_RUBY_POSITION) ? Ascii.FF : (byte) -1;
                    break;
                case 1287124693:
                    b14 = attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR) ? Ascii.CR : (byte) -1;
                    break;
                case 1754920356:
                    b14 = attributeName.equals(TtmlNode.ATTR_EBUTTS_MULTI_ROW_ALIGN) ? Ascii.SO : (byte) -1;
                    break;
                default:
                    b14 = -1;
                    break;
            }
            switch (b14) {
                case 0:
                    ttmlStyle = createIfNull(ttmlStyle).setItalic(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    ttmlStyle = createIfNull(ttmlStyle).setFontFamily(attributeValue);
                    break;
                case 2:
                    ttmlStyle = createIfNull(ttmlStyle).setTextAlign(parseAlignment(attributeValue));
                    break;
                case 3:
                    String lowerCase = Ascii.toLowerCase(attributeValue);
                    lowerCase.getClass();
                    switch (lowerCase) {
                        case "nounderline":
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(false);
                            break;
                        case "underline":
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(true);
                            break;
                        case "nolinethrough":
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(false);
                            break;
                        case "linethrough":
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(true);
                            break;
                    }
                    break;
                case 4:
                    ttmlStyle = createIfNull(ttmlStyle).setBold(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        ttmlStyle = createIfNull(ttmlStyle).setId(attributeValue);
                    }
                    break;
                case 6:
                    String lowerCase2 = Ascii.toLowerCase(attributeValue);
                    lowerCase2.getClass();
                    switch (lowerCase2) {
                        case "baseContainer":
                        case "base":
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(2);
                            break;
                        case "container":
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(1);
                            break;
                        case "delimiter":
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(4);
                            break;
                        case "textContainer":
                        case "text":
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(3);
                            break;
                    }
                    break;
                case 7:
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setFontColor(ColorParser.parseTtmlColor(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        String strValueOf = String.valueOf(attributeValue);
                        Log.w(TAG, strValueOf.length() != 0 ? "Failed parsing color value: ".concat(strValueOf) : new String("Failed parsing color value: "));
                    }
                    break;
                case 8:
                    ttmlStyle = createIfNull(ttmlStyle).setShearPercentage(parseShear(attributeValue));
                    break;
                case 9:
                    String lowerCase3 = Ascii.toLowerCase(attributeValue);
                    lowerCase3.getClass();
                    if (lowerCase3.equals(TtmlNode.COMBINE_ALL)) {
                        ttmlStyle = createIfNull(ttmlStyle).setTextCombine(true);
                    } else if (lowerCase3.equals("none")) {
                        ttmlStyle = createIfNull(ttmlStyle).setTextCombine(false);
                    }
                    break;
                case 10:
                    try {
                        ttmlStyle = createIfNull(ttmlStyle);
                        parseFontSize(attributeValue, ttmlStyle);
                    } catch (SubtitleDecoderException unused2) {
                        String strValueOf2 = String.valueOf(attributeValue);
                        Log.w(TAG, strValueOf2.length() != 0 ? "Failed parsing fontSize value: ".concat(strValueOf2) : new String("Failed parsing fontSize value: "));
                    }
                    break;
                case 11:
                    ttmlStyle = createIfNull(ttmlStyle).setTextEmphasis(TextEmphasis.parse(attributeValue));
                    break;
                case 12:
                    String lowerCase4 = Ascii.toLowerCase(attributeValue);
                    lowerCase4.getClass();
                    if (lowerCase4.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
                        ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(1);
                    } else if (lowerCase4.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                        ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(2);
                    }
                    break;
                case 13:
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setBackgroundColor(ColorParser.parseTtmlColor(attributeValue));
                    } catch (IllegalArgumentException unused3) {
                        String strValueOf3 = String.valueOf(attributeValue);
                        Log.w(TAG, strValueOf3.length() != 0 ? "Failed parsing background value: ".concat(strValueOf3) : new String("Failed parsing background value: "));
                    }
                    break;
                case 14:
                    ttmlStyle = createIfNull(ttmlStyle).setMultiRowAlign(parseAlignment(attributeValue));
                    break;
            }
        }
        return ttmlStyle;
    }

    private static String[] parseStyleIds(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : Util.split(strTrim, "\\s+");
    }

    private static long parseTimeExpression(String str, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        double d14;
        double d15;
        Matcher matcher = CLOCK_TIME.matcher(str);
        if (matcher.matches()) {
            double d16 = (Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) * 3600) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))) * 60) + Long.parseLong((String) Assertions.checkNotNull(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d17 = d16 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d18 = d17 + (strGroup2 != null ? Long.parseLong(strGroup2) / frameAndTickRate.effectiveFrameRate : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d18 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) frameAndTickRate.subFrameRate)) / ((double) frameAndTickRate.effectiveFrameRate) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = OFFSET_TIME.matcher(str);
        if (!matcher2.matches()) {
            String strValueOf = String.valueOf(str);
            throw new SubtitleDecoderException(strValueOf.length() != 0 ? "Malformed time expression: ".concat(strValueOf) : new String("Malformed time expression: "));
        }
        double d19 = Double.parseDouble((String) Assertions.checkNotNull(matcher2.group(1)));
        String str2 = (String) Assertions.checkNotNull(matcher2.group(2));
        str2.getClass();
        switch (str2) {
            case "f":
                d14 = frameAndTickRate.effectiveFrameRate;
                d19 /= d14;
                return (long) (d19 * 1000000.0d);
            case "h":
                d15 = 3600.0d;
                break;
            case "m":
                d15 = 60.0d;
                break;
            case "t":
                d14 = frameAndTickRate.tickRate;
                d19 /= d14;
                return (long) (d19 * 1000000.0d);
            case "ms":
                d14 = 1000.0d;
                d19 /= d14;
                return (long) (d19 * 1000000.0d);
            default:
                return (long) (d19 * 1000000.0d);
        }
        d19 *= d15;
        return (long) (d19 * 1000000.0d);
    }

    private static TtsExtent parseTtsExtent(XmlPullParser xmlPullParser) {
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = PIXEL_COORDINATES.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, attributeValue.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(attributeValue) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            return new TtsExtent(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            Log.w(TAG, attributeValue.length() != 0 ? "Ignoring malformed tts extent: ".concat(attributeValue) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bArr, int i14, boolean z14) throws SubtitleDecoderException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new TtmlRegion(""));
            int i15 = 0;
            TtsExtent ttsExtent = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i14), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            FrameAndTickRate frameAndTickRates = DEFAULT_FRAME_AND_TICK_RATE;
            CellResolution cellResolution = DEFAULT_CELL_RESOLUTION;
            TtmlSubtitle ttmlSubtitle = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i15 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            frameAndTickRates = parseFrameAndTickRates(xmlPullParserNewPullParser);
                            cellResolution = parseCellResolution(xmlPullParserNewPullParser, DEFAULT_CELL_RESOLUTION);
                            ttsExtent = parseTtsExtent(xmlPullParserNewPullParser);
                        }
                        FrameAndTickRate frameAndTickRate = frameAndTickRates;
                        TtsExtent ttsExtent2 = ttsExtent;
                        CellResolution cellResolution2 = cellResolution;
                        if (isSupportedTag(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                parseHeader(xmlPullParserNewPullParser, map, cellResolution2, ttsExtent2, map2, map3);
                            } else {
                                try {
                                    TtmlNode node = parseNode(xmlPullParserNewPullParser, ttmlNode, map2, frameAndTickRate);
                                    arrayDeque.push(node);
                                    if (ttmlNode != null) {
                                        ttmlNode.addChild(node);
                                    }
                                } catch (SubtitleDecoderException e4) {
                                    Log.w(TAG, "Suppressing parser error", e4);
                                    i15++;
                                }
                            }
                            cellResolution = cellResolution2;
                            ttsExtent = ttsExtent2;
                            frameAndTickRates = frameAndTickRate;
                        } else {
                            String strValueOf = String.valueOf(xmlPullParserNewPullParser.getName());
                            Log.i(TAG, strValueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(strValueOf) : new String("Ignoring unsupported tag: "));
                        }
                        i15++;
                        cellResolution = cellResolution2;
                        ttsExtent = ttsExtent2;
                        frameAndTickRates = frameAndTickRate;
                    } else if (eventType == 4) {
                        ((TtmlNode) Assertions.checkNotNull(ttmlNode)).addChild(TtmlNode.buildTextNode(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            ttmlSubtitle = new TtmlSubtitle((TtmlNode) Assertions.checkNotNull((TtmlNode) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i15++;
                } else if (eventType == 3) {
                    i15--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (ttmlSubtitle != null) {
                return ttmlSubtitle;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e14) {
            a.x("Unexpected error when reading input.", e14);
            return null;
        } catch (XmlPullParserException e15) {
            throw new SubtitleDecoderException("Unable to decode source", e15);
        }
    }
}
