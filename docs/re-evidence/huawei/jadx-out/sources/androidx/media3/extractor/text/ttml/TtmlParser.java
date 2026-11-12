package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ColorParser;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.base.Ascii;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
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

/* JADX INFO: loaded from: classes4.dex */
public final class TtmlParser implements SubtitleParser {
    private static final String ATTR_BEGIN = "begin";
    private static final String ATTR_DURATION = "dur";
    private static final String ATTR_END = "end";
    private static final String ATTR_IMAGE = "backgroundImage";
    private static final String ATTR_REGION = "region";
    private static final String ATTR_STYLE = "style";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final int DEFAULT_CELL_ROWS = 15;
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final String TAG = "TtmlParser";
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

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    public TtmlParser() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.xmlParserFactory = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        LegacySubtitleUtil.toCuesWithTiming(parseToLegacySubtitle(bArr, i, i2), outputOptions, consumer);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public Subtitle parseToLegacySubtitle(byte[] bArr, int i, int i2) {
        FrameAndTickRate frameAndTickRate;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new TtmlRegion(""));
            TtsExtent ttsExtent = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            FrameAndTickRate frameAndTickRates = DEFAULT_FRAME_AND_TICK_RATE;
            TtmlSubtitle ttmlSubtitle = null;
            int i3 = 0;
            int cellRows = 15;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            frameAndTickRates = parseFrameAndTickRates(xmlPullParserNewPullParser);
                            cellRows = parseCellRows(xmlPullParserNewPullParser, 15);
                            ttsExtent = parseTtsExtent(xmlPullParserNewPullParser);
                        }
                        TtsExtent ttsExtent2 = ttsExtent;
                        FrameAndTickRate frameAndTickRate2 = frameAndTickRates;
                        int i4 = cellRows;
                        if (isSupportedTag(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                frameAndTickRate = frameAndTickRate2;
                                parseHeader(xmlPullParserNewPullParser, map, i4, ttsExtent2, map2, map3);
                            } else {
                                frameAndTickRate = frameAndTickRate2;
                                try {
                                    TtmlNode node = parseNode(xmlPullParserNewPullParser, ttmlNode, map2, frameAndTickRate);
                                    arrayDeque.push(node);
                                    if (ttmlNode != null) {
                                        ttmlNode.addChild(node);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    Log.w(TAG, "Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            frameAndTickRates = frameAndTickRate;
                            ttsExtent = ttsExtent2;
                            cellRows = i4;
                        } else {
                            Log.i(TAG, "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            frameAndTickRate = frameAndTickRate2;
                        }
                        i3++;
                        frameAndTickRates = frameAndTickRate;
                        ttsExtent = ttsExtent2;
                        cellRows = i4;
                    } else if (eventType == 4) {
                        ((TtmlNode) Assertions.checkNotNull(ttmlNode)).addChild(TtmlNode.buildTextNode(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            ttmlSubtitle = new TtmlSubtitle((TtmlNode) Assertions.checkNotNull((TtmlNode) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (Subtitle) Assertions.checkNotNull(ttmlSubtitle);
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    private static FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue(TTP, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrSplit = Util.split(attributeValue2, " ");
            Assertions.checkArgument(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
        int i2 = frameAndTickRate.subFrameRate;
        String attributeValue3 = xmlPullParser.getAttributeValue(TTP, "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = frameAndTickRate.tickRate;
        String attributeValue4 = xmlPullParser.getAttributeValue(TTP, "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(i * f, i2, i3);
    }

    private static int parseCellRows(XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "cellResolution");
        if (attributeValue == null) {
            return i;
        }
        Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return i;
        }
        boolean z = true;
        try {
            int i2 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
            int i3 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2)));
            if (i2 == 0 || i3 == 0) {
                z = false;
            }
            Assertions.checkArgument(z, "Invalid cell resolution " + i2 + " " + i3);
            return i3;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return i;
        }
    }

    private static TtsExtent parseTtsExtent(XmlPullParser xmlPullParser) {
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = PIXEL_COORDINATES.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring non-pixel tts extent: " + attributeValue);
            return null;
        }
        try {
            return new TtsExtent(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed tts extent: " + attributeValue);
            return null;
        }
    }

    private static Map<String, TtmlStyle> parseHeader(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, int i, TtsExtent ttsExtent, Map<String, TtmlRegion> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
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
                String id = styleAttributes.getId();
                if (id != null) {
                    map.put(id, styleAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "region")) {
                TtmlRegion regionAttributes = parseRegionAttributes(xmlPullParser, i, ttsExtent);
                if (regionAttributes != null) {
                    map2.put(regionAttributes.id, regionAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "metadata")) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    private static void parseMetadata(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String attributeValue;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "image") && (attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id")) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x015a  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b3  */
    private static TtmlRegion parseRegionAttributes(XmlPullParser xmlPullParser, int i, TtsExtent ttsExtent) {
        float f;
        float f2;
        float f3;
        float f4;
        int i2;
        float f5;
        int i3;
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id");
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
        if (matcher.matches()) {
            try {
                float f6 = Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))) / 100.0f;
                f = Float.parseFloat((String) Assertions.checkNotNull(matcher.group(2))) / 100.0f;
                f2 = f6;
            } catch (NumberFormatException unused) {
                Log.w(TAG, "Ignoring region with malformed origin: " + attributeValue2);
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                Log.w(TAG, "Ignoring region with unsupported origin: " + attributeValue2);
                return null;
            }
            if (ttsExtent == null) {
                Log.w(TAG, "Ignoring region with missing tts:extent: " + attributeValue2);
                return null;
            }
            try {
                int i4 = Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(1)));
                int i5 = Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(2)));
                f2 = i4 / ttsExtent.width;
                f = i5 / ttsExtent.height;
            } catch (NumberFormatException unused2) {
                Log.w(TAG, "Ignoring region with malformed origin: " + attributeValue2);
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
                f3 = Float.parseFloat((String) Assertions.checkNotNull(matcher3.group(1))) / 100.0f;
                f4 = Float.parseFloat((String) Assertions.checkNotNull(matcher3.group(2))) / 100.0f;
            } catch (NumberFormatException unused3) {
                Log.w(TAG, "Ignoring region with malformed extent: " + attributeValue2);
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                Log.w(TAG, "Ignoring region with unsupported extent: " + attributeValue2);
                return null;
            }
            if (ttsExtent == null) {
                Log.w(TAG, "Ignoring region with missing tts:extent: " + attributeValue2);
                return null;
            }
            try {
                int i6 = Integer.parseInt((String) Assertions.checkNotNull(matcher4.group(1)));
                int i7 = Integer.parseInt((String) Assertions.checkNotNull(matcher4.group(2)));
                f3 = i6 / ttsExtent.width;
                f4 = i7 / ttsExtent.height;
            } catch (NumberFormatException unused4) {
                Log.w(TAG, "Ignoring region with malformed extent: " + attributeValue2);
                return null;
            }
        }
        String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
        byte b2 = 0;
        if (attributeValue4 != null) {
            String lowerCase = Ascii.toLowerCase(attributeValue4);
            lowerCase.hashCode();
            if (lowerCase.equals(TtmlNode.CENTER)) {
                f5 = f + (f4 / 2.0f);
                i2 = 1;
            } else if (lowerCase.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                f5 = f + f4;
                i2 = 2;
            } else {
                i2 = 0;
                f5 = f;
            }
        } else {
            i2 = 0;
            f5 = f;
        }
        float f7 = 1.0f / i;
        String attributeValue5 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
        if (attributeValue5 != null) {
            String lowerCase2 = Ascii.toLowerCase(attributeValue5);
            lowerCase2.hashCode();
            int iHashCode = lowerCase2.hashCode();
            if (iHashCode != 3694) {
                if (iHashCode != 3553396) {
                    if (iHashCode == 3553576 && lowerCase2.equals(TtmlNode.VERTICAL_RL)) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (lowerCase2.equals(TtmlNode.VERTICAL_LR)) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (!lowerCase2.equals("tb")) {
                b2 = -1;
            }
            if (b2 == 0 || b2 == 1) {
                i3 = 2;
            } else if (b2 != 2) {
                i3 = Integer.MIN_VALUE;
            } else {
                i3 = 1;
            }
        } else {
            i3 = Integer.MIN_VALUE;
        }
        return new TtmlRegion(attributeValue, f2, f5, 0, i2, f3, f4, 1, f7, i3);
    }

    private static String[] parseStyleIds(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : Util.split(strTrim, "\\s+");
    }

    /* JADX WARN: Code duplicated, block: B:133:0x022f  */
    /* JADX WARN: Code duplicated, block: B:136:0x024d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static TtmlStyle parseStyleAttributes(XmlPullParser xmlPullParser, TtmlStyle ttmlStyle) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.hashCode();
            byte b2 = -1;
            switch (attributeName) {
                case "fontStyle":
                    ttmlStyle = createIfNull(ttmlStyle).setItalic(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case "fontFamily":
                    ttmlStyle = createIfNull(ttmlStyle).setFontFamily(attributeValue);
                    break;
                case "textAlign":
                    ttmlStyle = createIfNull(ttmlStyle).setTextAlign(parseAlignment(attributeValue));
                    break;
                case "textDecoration":
                    String lowerCase = Ascii.toLowerCase(attributeValue);
                    lowerCase.hashCode();
                    switch (lowerCase.hashCode()) {
                        case -1461280213:
                            if (lowerCase.equals(TtmlNode.NO_UNDERLINE)) {
                                b2 = 0;
                            }
                            break;
                        case -1026963764:
                            if (lowerCase.equals(TtmlNode.UNDERLINE)) {
                                b2 = 1;
                            }
                            break;
                        case 913457136:
                            if (lowerCase.equals(TtmlNode.NO_LINETHROUGH)) {
                                b2 = 2;
                            }
                            break;
                        case 1679736913:
                            if (lowerCase.equals(TtmlNode.LINETHROUGH)) {
                                b2 = 3;
                            }
                            break;
                    }
                    if (b2 == 0) {
                        ttmlStyle = createIfNull(ttmlStyle).setUnderline(false);
                        break;
                    } else {
                        if (b2 == 1) {
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(true);
                        } else if (b2 == 2) {
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(false);
                        } else if (b2 == 3) {
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(true);
                        }
                        break;
                    }
                    break;
                case "fontWeight":
                    ttmlStyle = createIfNull(ttmlStyle).setBold(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).setId(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String lowerCase2 = Ascii.toLowerCase(attributeValue);
                    lowerCase2.hashCode();
                    switch (lowerCase2.hashCode()) {
                        case -618561360:
                            if (lowerCase2.equals(TtmlNode.RUBY_BASE_CONTAINER)) {
                                b2 = 0;
                            }
                            break;
                        case -410956671:
                            if (lowerCase2.equals(TtmlNode.RUBY_CONTAINER)) {
                                b2 = 1;
                            }
                            break;
                        case -250518009:
                            if (lowerCase2.equals(TtmlNode.RUBY_DELIMITER)) {
                                b2 = 2;
                            }
                            break;
                        case -136074796:
                            if (lowerCase2.equals(TtmlNode.RUBY_TEXT_CONTAINER)) {
                                b2 = 3;
                            }
                            break;
                        case 3016401:
                            if (lowerCase2.equals("base")) {
                                b2 = 4;
                            }
                            break;
                        case 3556653:
                            if (lowerCase2.equals("text")) {
                                b2 = 5;
                            }
                            break;
                    }
                    if (b2 != 0) {
                        if (b2 == 1) {
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(1);
                        } else if (b2 == 2) {
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(4);
                        } else if (b2 == 3) {
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(3);
                        } else if (b2 == 4) {
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(2);
                        } else if (b2 == 5) {
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(3);
                        }
                        break;
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).setRubyType(2);
                        break;
                    }
                    break;
                case "color":
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setFontColor(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        Log.w(TAG, "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "shear":
                    ttmlStyle = createIfNull(ttmlStyle).setShearPercentage(parseShear(attributeValue));
                    break;
                case "textCombine":
                    String lowerCase3 = Ascii.toLowerCase(attributeValue);
                    lowerCase3.hashCode();
                    if (!lowerCase3.equals("all")) {
                        if (lowerCase3.equals("none")) {
                            ttmlStyle = createIfNull(ttmlStyle).setTextCombine(false);
                        }
                        break;
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).setTextCombine(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        ttmlStyle = createIfNull(ttmlStyle);
                        parseFontSize(attributeValue, ttmlStyle);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        Log.w(TAG, "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "textEmphasis":
                    ttmlStyle = createIfNull(ttmlStyle).setTextEmphasis(TextEmphasis.parse(attributeValue));
                    break;
                case "rubyPosition":
                    String lowerCase4 = Ascii.toLowerCase(attributeValue);
                    lowerCase4.hashCode();
                    if (!lowerCase4.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
                        if (lowerCase4.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                            ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(2);
                        }
                        break;
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setBackgroundColor(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        Log.w(TAG, "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    ttmlStyle = createIfNull(ttmlStyle).setMultiRowAlign(parseAlignment(attributeValue));
                    break;
            }
        }
        return ttmlStyle;
    }

    private static TtmlStyle createIfNull(TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    private static Layout.Alignment parseAlignment(String str) {
        byte b2;
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "center":
                b2 = 0;
                break;
            case "end":
                b2 = 1;
                break;
            case "left":
                b2 = 2;
                break;
            case "right":
                b2 = 3;
                break;
            case "start":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    if (b2 != 3) {
                        if (b2 != 4) {
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0103  */
    private static TtmlNode parseNode(XmlPullParser xmlPullParser, TtmlNode ttmlNode, Map<String, TtmlRegion> map, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        long j;
        long j2;
        byte b2;
        int attributeCount = xmlPullParser.getAttributeCount();
        TtmlStyle styleAttributes = parseStyleAttributes(xmlPullParser, null);
        String[] strArr = null;
        String strSubstring = null;
        String str = "";
        long timeExpression = C.TIME_UNSET;
        long timeExpression2 = C.TIME_UNSET;
        long timeExpression3 = C.TIME_UNSET;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName) {
                case "region":
                    b2 = 0;
                    break;
                case "dur":
                    b2 = 1;
                    break;
                case "end":
                    b2 = 2;
                    break;
                case "begin":
                    b2 = 3;
                    break;
                case "style":
                    b2 = 4;
                    break;
                case "backgroundImage":
                    b2 = 5;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 != 0) {
                if (b2 == 1) {
                    timeExpression3 = parseTimeExpression(attributeValue, frameAndTickRate);
                } else if (b2 == 2) {
                    timeExpression2 = parseTimeExpression(attributeValue, frameAndTickRate);
                } else if (b2 == 3) {
                    timeExpression = parseTimeExpression(attributeValue, frameAndTickRate);
                } else if (b2 == 4) {
                    String[] styleIds = parseStyleIds(attributeValue);
                    if (styleIds.length > 0) {
                        strArr = styleIds;
                    }
                } else if (b2 == 5 && attributeValue.startsWith("#")) {
                    strSubstring = attributeValue.substring(1);
                }
            } else if (map.containsKey(attributeValue)) {
                str = attributeValue;
            }
        }
        if (ttmlNode != null) {
            long j3 = ttmlNode.startTimeUs;
            j = C.TIME_UNSET;
            if (j3 != C.TIME_UNSET) {
                if (timeExpression != C.TIME_UNSET) {
                    timeExpression += ttmlNode.startTimeUs;
                }
                if (timeExpression2 != C.TIME_UNSET) {
                    timeExpression2 += ttmlNode.startTimeUs;
                }
            }
        } else {
            j = C.TIME_UNSET;
        }
        long j4 = timeExpression;
        if (timeExpression2 != j) {
            j2 = timeExpression2;
        } else if (timeExpression3 != j) {
            j2 = j4 + timeExpression3;
        } else if (ttmlNode == null || ttmlNode.endTimeUs == j) {
            j2 = timeExpression2;
        } else {
            j2 = ttmlNode.endTimeUs;
        }
        return TtmlNode.buildNode(xmlPullParser.getName(), j4, j2, styleAttributes, strArr, str, strSubstring, ttmlNode);
    }

    private static boolean isSupportedTag(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals(TtmlNode.TAG_BODY) || str.equals(TtmlNode.TAG_DIV) || str.equals("p") || str.equals(TtmlNode.TAG_SPAN) || str.equals("br") || str.equals("style") || str.equals(TtmlNode.TAG_STYLING) || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals(TtmlNode.TAG_INFORMATION);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    private static void parseFontSize(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        byte b2;
        String[] strArrSplit = Util.split(str, "\\s+");
        if (strArrSplit.length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else if (strArrSplit.length == 2) {
            matcher = FONT_SIZE.matcher(strArrSplit[1]);
            Log.w(TAG, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrSplit.length + ".");
        }
        if (matcher.matches()) {
            String str2 = (String) Assertions.checkNotNull(matcher.group(3));
            str2.hashCode();
            int iHashCode = str2.hashCode();
            if (iHashCode != 37) {
                if (iHashCode != 3240) {
                    if (iHashCode == 3592 && str2.equals("px")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (str2.equals("em")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str2.equals("%")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                ttmlStyle.setFontSizeUnit(3);
            } else if (b2 == 1) {
                ttmlStyle.setFontSizeUnit(2);
            } else if (b2 == 2) {
                ttmlStyle.setFontSizeUnit(1);
            } else {
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
            }
            ttmlStyle.setFontSize(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
            return;
        }
        throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
    }

    private static float parseShear(String str) {
        Matcher matcher = SIGNED_PERCENTAGE.matcher(str);
        if (!matcher.matches()) {
            Log.w(TAG, "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1)))));
        } catch (NumberFormatException e) {
            Log.w(TAG, "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    private static long parseTimeExpression(String str, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        byte b2;
        double d;
        double d2;
        Matcher matcher = CLOCK_TIME.matcher(str);
        if (matcher.matches()) {
            double d3 = Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) * 3600;
            double d4 = Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))) * 60;
            double d5 = Long.parseLong((String) Assertions.checkNotNull(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d6 = strGroup != null ? Double.parseDouble(strGroup) : 0.0d;
            String strGroup2 = matcher.group(5);
            double d7 = strGroup2 != null ? Long.parseLong(strGroup2) / frameAndTickRate.effectiveFrameRate : 0.0d;
            String strGroup3 = matcher.group(6);
            return (long) ((d3 + d4 + d5 + d6 + d7 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) frameAndTickRate.subFrameRate)) / ((double) frameAndTickRate.effectiveFrameRate) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = OFFSET_TIME.matcher(str);
        if (matcher2.matches()) {
            double d8 = Double.parseDouble((String) Assertions.checkNotNull(matcher2.group(1)));
            String str2 = (String) Assertions.checkNotNull(matcher2.group(2));
            str2.hashCode();
            int iHashCode = str2.hashCode();
            if (iHashCode != 102) {
                if (iHashCode != 104) {
                    if (iHashCode != 109) {
                        if (iHashCode != 116) {
                            if (iHashCode == 3494 && str2.equals("ms")) {
                                b2 = 4;
                            } else {
                                b2 = -1;
                            }
                        } else if (str2.equals(FitRunPlayAudio.PLAY_TYPE_T)) {
                            b2 = 3;
                        } else {
                            b2 = -1;
                        }
                    } else if (str2.equals(FitRunPlayAudio.OPPORTUNITY_M)) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (str2.equals("h")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str2.equals("f")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 == 2) {
                        d2 = 60.0d;
                    } else if (b2 == 3) {
                        d = frameAndTickRate.tickRate;
                    } else if (b2 == 4) {
                        d = 1000.0d;
                    }
                    return (long) (d8 * 1000000.0d);
                }
                d2 = 3600.0d;
                d8 *= d2;
                return (long) (d8 * 1000000.0d);
            }
            d = frameAndTickRate.effectiveFrameRate;
            d8 /= d;
            return (long) (d8 * 1000000.0d);
        }
        throw new SubtitleDecoderException("Malformed time expression: " + str);
    }

    static final class FrameAndTickRate {
        final float effectiveFrameRate;
        final int subFrameRate;
        final int tickRate;

        FrameAndTickRate(float f, int i, int i2) {
            this.effectiveFrameRate = f;
            this.subFrameRate = i;
            this.tickRate = i2;
        }
    }

    static final class TtsExtent {
        final int height;
        final int width;

        TtsExtent(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }
}
