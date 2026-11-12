package ec;

import am.j;
import android.text.Layout;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import fa.a0;
import fa.k;
import fa.z;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import r1.q2;
import yb.i;
import yb.n;

/* JADX INFO: loaded from: classes.dex */
public final class d implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f63718b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f63719c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f63720d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f63721e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f63722f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f63723g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f63724h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f63725i = new a(30.0f, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f63726a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f63727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63729c;

        public a(float f14, int i14, int i15) {
            this.f63727a = f14;
            this.f63728b = i14;
            this.f63729c = i15;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63731b;

        public b(int i14, int i15) {
            this.f63730a = i14;
            this.f63731b = i15;
        }
    }

    public d() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f63726a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e4) {
            q2.v("Couldn't create XmlPullParserFactory instance", e4);
            throw null;
        }
    }

    public static g d(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean e(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals(TtmlNode.TAG_BODY) || str.equals(TtmlNode.TAG_DIV) || str.equals("p") || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals(TtmlNode.TAG_STYLE) || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals(TtmlNode.TAG_REGION) || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals(TtmlNode.TAG_INFORMATION);
    }

    public static int f(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f63724h.matcher(attributeValue);
        if (!matcher.matches()) {
            k.g("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z14 = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i14 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i15 = Integer.parseInt(strGroup2);
            if (i14 == 0 || i15 == 0) {
                z14 = false;
            }
            fa.a.b(z14, "Invalid cell resolution " + i14 + StringUtils.SPACE + i15);
            return i15;
        } catch (NumberFormatException unused) {
            k.g("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void g(String str, g gVar) throws SubtitleDecoderException {
        Matcher matcher;
        int i14 = z.f70071a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f63720d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(j.q(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            k.g("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(j.m("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                gVar.f63751j = 3;
                break;
            case "em":
                gVar.f63751j = 2;
                break;
            case "px":
                gVar.f63751j = 1;
                break;
            default:
                throw new SubtitleDecoderException(j.m("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        gVar.f63752k = Float.parseFloat(strGroup2);
    }

    public static a h(XmlPullParser xmlPullParser) {
        float f14;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i14 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i15 = z.f70071a;
            String[] strArrSplit = attributeValue2.split(StringUtils.SPACE, -1);
            fa.a.b(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f14 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f14 = 1.0f;
        }
        a aVar = f63725i;
        int i16 = aVar.f63728b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i16 = Integer.parseInt(attributeValue3);
        }
        int i17 = aVar.f63729c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i17 = Integer.parseInt(attributeValue4);
        }
        return new a(i14 * f14, i16, i17);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:44:0x011b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0123  */
    /* JADX WARN: Code duplicated, block: B:52:0x0156  */
    /* JADX WARN: Code duplicated, block: B:54:0x0165  */
    /* JADX WARN: Code duplicated, block: B:57:0x016e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0171  */
    /* JADX WARN: Code duplicated, block: B:59:0x0178  */
    /* JADX WARN: Code duplicated, block: B:62:0x0188  */
    /* JADX WARN: Code duplicated, block: B:65:0x0197  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:80:0x01be A[PHI: r13
      0x01be: PHI (r13v2 int) = (r13v1 int), (r13v0 int) binds: [B:81:0x01c1, B:77:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e4  */
    public static void i(XmlPullParser xmlPullParser, HashMap map, int i14, b bVar, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strA;
        float f14;
        float f15;
        String strA2;
        Matcher matcher;
        Matcher matcher2;
        float f16;
        float f17;
        String strA3;
        int i15;
        String strA4;
        int i16;
        e eVar;
        String lowerCase;
        String lowerCase2;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (a0.c(xmlPullParser, TtmlNode.TAG_STYLE)) {
                String strA5 = a0.a(xmlPullParser, TtmlNode.TAG_STYLE);
                g gVarK = k(xmlPullParser, new g());
                if (strA5 != null) {
                    String strTrim = strA5.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        int i17 = z.f70071a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str : strArrSplit) {
                        gVarK.a((g) map.get(str));
                    }
                }
                String str2 = gVarK.f63753l;
                if (str2 != null) {
                    map.put(str2, gVarK);
                }
            } else if (a0.c(xmlPullParser, TtmlNode.TAG_REGION)) {
                String strA6 = a0.a(xmlPullParser, TtmlNode.ATTR_ID);
                if (strA6 != null) {
                    String strA7 = a0.a(xmlPullParser, "origin");
                    if (strA7 != null) {
                        Pattern pattern = f63722f;
                        Matcher matcher3 = pattern.matcher(strA7);
                        Pattern pattern2 = f63723g;
                        Matcher matcher4 = pattern2.matcher(strA7);
                        int i18 = 2;
                        if (matcher3.matches()) {
                            try {
                                String strGroup = matcher3.group(1);
                                strGroup.getClass();
                                float f18 = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher3.group(2);
                                strGroup2.getClass();
                                f14 = Float.parseFloat(strGroup2) / 100.0f;
                                f15 = f18;
                                strA2 = a0.a(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                if (strA2 != null) {
                                    matcher = pattern.matcher(strA2);
                                    matcher2 = pattern2.matcher(strA2);
                                    if (matcher.matches()) {
                                        try {
                                            String strGroup3 = matcher.group(1);
                                            strGroup3.getClass();
                                            f16 = Float.parseFloat(strGroup3) / 100.0f;
                                            String strGroup4 = matcher.group(2);
                                            strGroup4.getClass();
                                            f17 = Float.parseFloat(strGroup4) / 100.0f;
                                        } catch (NumberFormatException unused) {
                                            k.g("Ignoring region with malformed extent: ".concat(strA7));
                                            eVar = null;
                                        }
                                    } else if (matcher2.matches()) {
                                        k.g("Ignoring region with unsupported extent: ".concat(strA7));
                                    } else if (bVar == null) {
                                        k.g("Ignoring region with missing tts:extent: ".concat(strA7));
                                    } else {
                                        try {
                                            String strGroup5 = matcher2.group(1);
                                            strGroup5.getClass();
                                            int i19 = Integer.parseInt(strGroup5);
                                            String strGroup6 = matcher2.group(2);
                                            strGroup6.getClass();
                                            int i24 = Integer.parseInt(strGroup6);
                                            float f19 = i19 / bVar.f63730a;
                                            f17 = i24 / bVar.f63731b;
                                            f16 = f19;
                                        } catch (NumberFormatException unused2) {
                                            k.g("Ignoring region with malformed extent: ".concat(strA7));
                                            eVar = null;
                                        }
                                    }
                                    strA3 = a0.a(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                    if (strA3 != null) {
                                        lowerCase2 = Ascii.toLowerCase(strA3);
                                        lowerCase2.getClass();
                                        if (!lowerCase2.equals(TtmlNode.CENTER)) {
                                            f14 += f17 / 2.0f;
                                            i15 = 1;
                                        } else if (lowerCase2.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                                            f14 += f17;
                                            i15 = 2;
                                        } else {
                                            i15 = 0;
                                        }
                                    } else {
                                        i15 = 0;
                                    }
                                    float f22 = 1.0f / i14;
                                    strA4 = a0.a(xmlPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
                                    if (strA4 != null) {
                                        lowerCase = Ascii.toLowerCase(strA4);
                                        lowerCase.getClass();
                                        switch (lowerCase) {
                                            case "tb":
                                            case "tblr":
                                                i16 = i18;
                                                break;
                                            case "tbrl":
                                                i16 = 1;
                                                break;
                                            default:
                                                i18 = Integer.MIN_VALUE;
                                                i16 = i18;
                                                break;
                                        }
                                    } else {
                                        i18 = Integer.MIN_VALUE;
                                        i16 = i18;
                                    }
                                    eVar = new e(strA6, f15, f14, 0, i15, f16, f17, 1, f22, i16);
                                } else {
                                    k.g("Ignoring region without an extent");
                                }
                            } catch (NumberFormatException unused3) {
                                k.g("Ignoring region with malformed origin: ".concat(strA7));
                            }
                        } else if (!matcher4.matches()) {
                            k.g("Ignoring region with unsupported origin: ".concat(strA7));
                        } else if (bVar == null) {
                            k.g("Ignoring region with missing tts:extent: ".concat(strA7));
                        } else {
                            try {
                                String strGroup7 = matcher4.group(1);
                                strGroup7.getClass();
                                int i25 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                strGroup8.getClass();
                                int i26 = Integer.parseInt(strGroup8);
                                f15 = i25 / bVar.f63730a;
                                f14 = i26 / bVar.f63731b;
                                strA2 = a0.a(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                if (strA2 != null) {
                                    matcher = pattern.matcher(strA2);
                                    matcher2 = pattern2.matcher(strA2);
                                    if (matcher.matches()) {
                                        String strGroup9 = matcher.group(1);
                                        strGroup9.getClass();
                                        f16 = Float.parseFloat(strGroup9) / 100.0f;
                                        String strGroup10 = matcher.group(2);
                                        strGroup10.getClass();
                                        f17 = Float.parseFloat(strGroup10) / 100.0f;
                                    } else if (matcher2.matches()) {
                                        k.g("Ignoring region with unsupported extent: ".concat(strA7));
                                    } else if (bVar == null) {
                                        k.g("Ignoring region with missing tts:extent: ".concat(strA7));
                                    } else {
                                        String strGroup11 = matcher2.group(1);
                                        strGroup11.getClass();
                                        int i110 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher2.group(2);
                                        strGroup12.getClass();
                                        int i27 = Integer.parseInt(strGroup12);
                                        float f110 = i110 / bVar.f63730a;
                                        f17 = i27 / bVar.f63731b;
                                        f16 = f110;
                                    }
                                    strA3 = a0.a(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                    if (strA3 != null) {
                                        lowerCase2 = Ascii.toLowerCase(strA3);
                                        lowerCase2.getClass();
                                        if (!lowerCase2.equals(TtmlNode.CENTER)) {
                                            f14 += f17 / 2.0f;
                                            i15 = 1;
                                        } else if (lowerCase2.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                                            i15 = 0;
                                        } else {
                                            f14 += f17;
                                            i15 = 2;
                                        }
                                    } else {
                                        i15 = 0;
                                    }
                                    float f24 = 1.0f / i14;
                                    strA4 = a0.a(xmlPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
                                    if (strA4 != null) {
                                        lowerCase = Ascii.toLowerCase(strA4);
                                        lowerCase.getClass();
                                        switch (lowerCase) {
                                            case 3694:
                                                if (lowerCase.equals(TtmlNode.VERTICAL)) {
                                                }
                                                break;
                                            case 3553396:
                                                if (lowerCase.equals(TtmlNode.VERTICAL_LR)) {
                                                }
                                                break;
                                            case 3553576:
                                                if (lowerCase.equals(TtmlNode.VERTICAL_RL)) {
                                                }
                                                break;
                                        }
                                        /*  JADX ERROR: Method code generation error
                                            java.lang.NullPointerException: Switch insn not found in header
                                            	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:216)
                                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                            */
                                        /*
                                            Method dump skipped, instruction units count: 608
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: ec.d.i(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, ec.d$b, java.util.HashMap, java.util.HashMap):void");
                                    }

                                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                    /* JADX WARN: Code duplicated, block: B:6:0x0034  */
                                    public static c j(XmlPullParser xmlPullParser, c cVar, HashMap map, a aVar) throws SubtitleDecoderException {
                                        String[] strArrSplit;
                                        XmlPullParser xmlPullParser2 = xmlPullParser;
                                        int attributeCount = xmlPullParser2.getAttributeCount();
                                        String strSubstring = null;
                                        g gVarK = k(xmlPullParser2, null);
                                        long jL = -9223372036854775807L;
                                        long jL2 = -9223372036854775807L;
                                        long jL3 = -9223372036854775807L;
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
                                                    jL3 = l(attributeValue, aVar);
                                                    break;
                                                case "end":
                                                    jL2 = l(attributeValue, aVar);
                                                    break;
                                                case "begin":
                                                    jL = l(attributeValue, aVar);
                                                    break;
                                                case "style":
                                                    String strTrim = attributeValue.trim();
                                                    if (strTrim.isEmpty()) {
                                                        strArrSplit = new String[0];
                                                    } else {
                                                        int i16 = z.f70071a;
                                                        strArrSplit = strTrim.split("\\s+", -1);
                                                    }
                                                    if (strArrSplit.length > 0) {
                                                        strArr = strArrSplit;
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
                                        if (cVar != null) {
                                            long j8 = cVar.f63708d;
                                            if (j8 != C.TIME_UNSET) {
                                                if (jL != C.TIME_UNSET) {
                                                    jL += j8;
                                                }
                                                if (jL2 != C.TIME_UNSET) {
                                                    jL2 += j8;
                                                }
                                            }
                                        }
                                        long j14 = jL;
                                        if (jL2 == C.TIME_UNSET) {
                                            if (jL3 != C.TIME_UNSET) {
                                                jL2 = j14 + jL3;
                                            } else if (cVar != null) {
                                                long j15 = cVar.f63709e;
                                                if (j15 != C.TIME_UNSET) {
                                                    jL2 = j15;
                                                }
                                            }
                                        }
                                        return c.a(xmlPullParser.getName(), j14, jL2, gVarK, strArr, str, strSubstring, cVar);
                                    }

                                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                    /* JADX WARN: Code duplicated, block: B:134:0x025c  */
                                    /* JADX WARN: Code duplicated, block: B:171:0x02f4  */
                                    /* JADX WARN: Code duplicated, block: B:196:0x0358  */
                                    /* JADX WARN: Code duplicated, block: B:6:0x0022  */
                                    /* JADX WARN: Code duplicated, block: B:72:0x00ff  */
                                    public static g k(XmlPullParser xmlPullParser, g gVar) {
                                        byte b14;
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        g gVarD = gVar;
                                        for (int i14 = 0; i14 < attributeCount; i14++) {
                                            String attributeValue = xmlPullParser.getAttributeValue(i14);
                                            String attributeName = xmlPullParser.getAttributeName(i14);
                                            attributeName.getClass();
                                            switch (attributeName) {
                                                case "fontStyle":
                                                    b14 = 0;
                                                    break;
                                                case "fontFamily":
                                                    b14 = 1;
                                                    break;
                                                case "textAlign":
                                                    b14 = 2;
                                                    break;
                                                case "textDecoration":
                                                    b14 = 3;
                                                    break;
                                                case "fontWeight":
                                                    b14 = 4;
                                                    break;
                                                case "id":
                                                    b14 = 5;
                                                    break;
                                                case "ruby":
                                                    b14 = 6;
                                                    break;
                                                case "color":
                                                    b14 = 7;
                                                    break;
                                                case "shear":
                                                    b14 = 8;
                                                    break;
                                                case "textCombine":
                                                    b14 = 9;
                                                    break;
                                                case "fontSize":
                                                    b14 = 10;
                                                    break;
                                                case "textEmphasis":
                                                    b14 = Ascii.VT;
                                                    break;
                                                case "rubyPosition":
                                                    b14 = Ascii.FF;
                                                    break;
                                                case "backgroundColor":
                                                    b14 = Ascii.CR;
                                                    break;
                                                case "multiRowAlign":
                                                    b14 = Ascii.SO;
                                                    break;
                                                default:
                                                    b14 = -1;
                                                    break;
                                            }
                                            Layout.Alignment alignment = null;
                                            switch (b14) {
                                                case 0:
                                                    gVarD = d(gVarD);
                                                    gVarD.f63750i = TtmlNode.ITALIC.equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case 1:
                                                    gVarD = d(gVarD);
                                                    gVarD.f63742a = attributeValue;
                                                    break;
                                                case 2:
                                                    gVarD = d(gVarD);
                                                    String lowerCase = Ascii.toLowerCase(attributeValue);
                                                    lowerCase.getClass();
                                                    switch (lowerCase) {
                                                        case "center":
                                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                                            break;
                                                        case "end":
                                                        case "right":
                                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                            break;
                                                        case "left":
                                                        case "start":
                                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                                            break;
                                                    }
                                                    gVarD.f63756o = alignment;
                                                    break;
                                                case 3:
                                                    String lowerCase2 = Ascii.toLowerCase(attributeValue);
                                                    lowerCase2.getClass();
                                                    switch (lowerCase2) {
                                                        case "nounderline":
                                                            gVarD = d(gVarD);
                                                            gVarD.f63748g = 0;
                                                            break;
                                                        case "underline":
                                                            gVarD = d(gVarD);
                                                            gVarD.f63748g = 1;
                                                            break;
                                                        case "nolinethrough":
                                                            gVarD = d(gVarD);
                                                            gVarD.f63747f = 0;
                                                            break;
                                                        case "linethrough":
                                                            gVarD = d(gVarD);
                                                            gVarD.f63747f = 1;
                                                            break;
                                                    }
                                                    break;
                                                case 4:
                                                    gVarD = d(gVarD);
                                                    gVarD.f63749h = TtmlNode.BOLD.equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case 5:
                                                    if (TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                                                        gVarD = d(gVarD);
                                                        gVarD.f63753l = attributeValue;
                                                    }
                                                    break;
                                                case 6:
                                                    String lowerCase3 = Ascii.toLowerCase(attributeValue);
                                                    lowerCase3.getClass();
                                                    switch (lowerCase3) {
                                                        case "baseContainer":
                                                        case "base":
                                                            gVarD = d(gVarD);
                                                            gVarD.f63754m = 2;
                                                            break;
                                                        case "container":
                                                            gVarD = d(gVarD);
                                                            gVarD.f63754m = 1;
                                                            break;
                                                        case "delimiter":
                                                            gVarD = d(gVarD);
                                                            gVarD.f63754m = 4;
                                                            break;
                                                        case "textContainer":
                                                        case "text":
                                                            gVarD = d(gVarD);
                                                            gVarD.f63754m = 3;
                                                            break;
                                                    }
                                                    break;
                                                case 7:
                                                    gVarD = d(gVarD);
                                                    try {
                                                        gVarD.f63743b = fa.e.a(attributeValue, false);
                                                        gVarD.f63744c = true;
                                                    } catch (IllegalArgumentException unused) {
                                                        k.g("Failed parsing color value: " + attributeValue);
                                                    }
                                                    break;
                                                case 8:
                                                    g gVarD2 = d(gVarD);
                                                    Matcher matcher = f63721e.matcher(attributeValue);
                                                    float fMin = Float.MAX_VALUE;
                                                    if (matcher.matches()) {
                                                        try {
                                                            String strGroup = matcher.group(1);
                                                            strGroup.getClass();
                                                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                                                        } catch (NumberFormatException e4) {
                                                            k.h("Failed to parse shear: " + attributeValue, e4);
                                                        }
                                                    } else {
                                                        k.g("Invalid value for shear: " + attributeValue);
                                                    }
                                                    gVarD2.f63760s = fMin;
                                                    gVarD = gVarD2;
                                                    break;
                                                case 9:
                                                    String lowerCase4 = Ascii.toLowerCase(attributeValue);
                                                    lowerCase4.getClass();
                                                    if (lowerCase4.equals(TtmlNode.COMBINE_ALL)) {
                                                        gVarD = d(gVarD);
                                                        gVarD.f63758q = 1;
                                                    } else if (lowerCase4.equals("none")) {
                                                        gVarD = d(gVarD);
                                                        gVarD.f63758q = 0;
                                                    }
                                                    break;
                                                case 10:
                                                    try {
                                                        gVarD = d(gVarD);
                                                        g(attributeValue, gVarD);
                                                    } catch (SubtitleDecoderException unused2) {
                                                        k.g("Failed parsing fontSize value: " + attributeValue);
                                                    }
                                                    break;
                                                case 11:
                                                    gVarD = d(gVarD);
                                                    gVarD.f63759r = ec.b.a(attributeValue);
                                                    break;
                                                case 12:
                                                    String lowerCase5 = Ascii.toLowerCase(attributeValue);
                                                    lowerCase5.getClass();
                                                    if (lowerCase5.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
                                                        gVarD = d(gVarD);
                                                        gVarD.f63755n = 1;
                                                    } else if (lowerCase5.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                                                        gVarD = d(gVarD);
                                                        gVarD.f63755n = 2;
                                                    }
                                                    break;
                                                case 13:
                                                    gVarD = d(gVarD);
                                                    try {
                                                        gVarD.f63745d = fa.e.a(attributeValue, false);
                                                        gVarD.f63746e = true;
                                                    } catch (IllegalArgumentException unused3) {
                                                        k.g("Failed parsing background value: " + attributeValue);
                                                    }
                                                    break;
                                                case 14:
                                                    gVarD = d(gVarD);
                                                    String lowerCase6 = Ascii.toLowerCase(attributeValue);
                                                    lowerCase6.getClass();
                                                    switch (lowerCase6.hashCode()) {
                                                        case -1364013995:
                                                            if (lowerCase6.equals(TtmlNode.CENTER)) {
                                                            }
                                                            break;
                                                        case 100571:
                                                            if (lowerCase6.equals(TtmlNode.END)) {
                                                            }
                                                            break;
                                                        case 3317767:
                                                            if (lowerCase6.equals(TtmlNode.LEFT)) {
                                                            }
                                                            break;
                                                        case 108511772:
                                                            if (lowerCase6.equals(TtmlNode.RIGHT)) {
                                                            }
                                                            break;
                                                        case 109757538:
                                                            if (!lowerCase6.equals(TtmlNode.START)) {
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    /*  JADX ERROR: Method code generation error
                                                        java.lang.NullPointerException: Switch insn not found in header
                                                        	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                                                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                                                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                                                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                                        */
                                                    /*
                                                        Method dump skipped, instruction units count: 1182
                                                        To view this dump add '--comments-level debug' option
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: ec.d.k(org.xmlpull.v1.XmlPullParser, ec.g):ec.g");
                                                }

                                                public static long l(String str, a aVar) throws SubtitleDecoderException {
                                                    double d14;
                                                    double d15;
                                                    Matcher matcher = f63718b.matcher(str);
                                                    if (matcher.matches()) {
                                                        String strGroup = matcher.group(1);
                                                        strGroup.getClass();
                                                        double d16 = Long.parseLong(strGroup) * 3600;
                                                        String strGroup2 = matcher.group(2);
                                                        strGroup2.getClass();
                                                        double d17 = d16 + (Long.parseLong(strGroup2) * 60);
                                                        String strGroup3 = matcher.group(3);
                                                        strGroup3.getClass();
                                                        double d18 = d17 + Long.parseLong(strGroup3);
                                                        String strGroup4 = matcher.group(4);
                                                        double d19 = d18 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
                                                        String strGroup5 = matcher.group(5);
                                                        double d24 = d19 + (strGroup5 != null ? Long.parseLong(strGroup5) / aVar.f63727a : 0.0d);
                                                        String strGroup6 = matcher.group(6);
                                                        return (long) ((d24 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) aVar.f63728b)) / ((double) aVar.f63727a) : 0.0d)) * 1000000.0d);
                                                    }
                                                    Matcher matcher2 = f63719c.matcher(str);
                                                    if (!matcher2.matches()) {
                                                        throw new SubtitleDecoderException(fb1.c.n("Malformed time expression: ", str));
                                                    }
                                                    String strGroup7 = matcher2.group(1);
                                                    strGroup7.getClass();
                                                    double d25 = Double.parseDouble(strGroup7);
                                                    String strGroup8 = matcher2.group(2);
                                                    strGroup8.getClass();
                                                    switch (strGroup8) {
                                                        case "f":
                                                            d14 = aVar.f63727a;
                                                            d25 /= d14;
                                                            return (long) (d25 * 1000000.0d);
                                                        case "h":
                                                            d15 = 3600.0d;
                                                            break;
                                                        case "m":
                                                            d15 = 60.0d;
                                                            break;
                                                        case "t":
                                                            d14 = aVar.f63729c;
                                                            d25 /= d14;
                                                            return (long) (d25 * 1000000.0d);
                                                        case "ms":
                                                            d14 = 1000.0d;
                                                            d25 /= d14;
                                                            return (long) (d25 * 1000000.0d);
                                                        default:
                                                            return (long) (d25 * 1000000.0d);
                                                    }
                                                    d25 *= d15;
                                                    return (long) (d25 * 1000000.0d);
                                                }

                                                public static b m(XmlPullParser xmlPullParser) {
                                                    String strA = a0.a(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                    if (strA == null) {
                                                        return null;
                                                    }
                                                    Matcher matcher = f63723g.matcher(strA);
                                                    if (!matcher.matches()) {
                                                        k.g("Ignoring non-pixel tts extent: ".concat(strA));
                                                        return null;
                                                    }
                                                    try {
                                                        String strGroup = matcher.group(1);
                                                        strGroup.getClass();
                                                        int i14 = Integer.parseInt(strGroup);
                                                        String strGroup2 = matcher.group(2);
                                                        strGroup2.getClass();
                                                        return new b(i14, Integer.parseInt(strGroup2));
                                                    } catch (NumberFormatException unused) {
                                                        k.g("Ignoring malformed tts extent: ".concat(strA));
                                                        return null;
                                                    }
                                                }

                                                @Override // yb.n
                                                public final int a() {
                                                    return 1;
                                                }

                                                @Override // yb.n
                                                public final i b(int i14, int i15, byte[] bArr) {
                                                    try {
                                                        XmlPullParser xmlPullParserNewPullParser = this.f63726a.newPullParser();
                                                        HashMap map = new HashMap();
                                                        HashMap map2 = new HashMap();
                                                        HashMap map3 = new HashMap();
                                                        map2.put("", new e(""));
                                                        h hVar = null;
                                                        xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i14, i15), null);
                                                        ArrayDeque arrayDeque = new ArrayDeque();
                                                        int i16 = 0;
                                                        int iF = 15;
                                                        a aVarH = f63725i;
                                                        b bVarM = null;
                                                        for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                                            c cVar = (c) arrayDeque.peek();
                                                            if (i16 == 0) {
                                                                String name = xmlPullParserNewPullParser.getName();
                                                                if (eventType == 2) {
                                                                    if (TtmlNode.TAG_TT.equals(name)) {
                                                                        aVarH = h(xmlPullParserNewPullParser);
                                                                        iF = f(xmlPullParserNewPullParser);
                                                                        bVarM = m(xmlPullParserNewPullParser);
                                                                    }
                                                                    a aVar = aVarH;
                                                                    b bVar = bVarM;
                                                                    int i17 = iF;
                                                                    if (e(name)) {
                                                                        if (TtmlNode.TAG_HEAD.equals(name)) {
                                                                            i(xmlPullParserNewPullParser, map, i17, bVar, map2, map3);
                                                                        } else {
                                                                            try {
                                                                                c cVarJ = j(xmlPullParserNewPullParser, cVar, map2, aVar);
                                                                                arrayDeque.push(cVarJ);
                                                                                if (cVar != null) {
                                                                                    if (cVar.f63717m == null) {
                                                                                        cVar.f63717m = new ArrayList();
                                                                                    }
                                                                                    cVar.f63717m.add(cVarJ);
                                                                                }
                                                                            } catch (SubtitleDecoderException e4) {
                                                                                k.h("Suppressing parser error", e4);
                                                                                i16++;
                                                                            }
                                                                        }
                                                                        iF = i17;
                                                                        bVarM = bVar;
                                                                        aVarH = aVar;
                                                                    } else {
                                                                        k.f("Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                                                                    }
                                                                    i16++;
                                                                    iF = i17;
                                                                    bVarM = bVar;
                                                                    aVarH = aVar;
                                                                } else if (eventType == 4) {
                                                                    cVar.getClass();
                                                                    c cVarB = c.b(xmlPullParserNewPullParser.getText());
                                                                    if (cVar.f63717m == null) {
                                                                        cVar.f63717m = new ArrayList();
                                                                    }
                                                                    cVar.f63717m.add(cVarB);
                                                                } else if (eventType == 3) {
                                                                    if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                                                                        c cVar2 = (c) arrayDeque.peek();
                                                                        cVar2.getClass();
                                                                        hVar = new h(cVar2, map, map2, map3);
                                                                    }
                                                                    arrayDeque.pop();
                                                                }
                                                            } else if (eventType == 2) {
                                                                i16++;
                                                            } else if (eventType == 3) {
                                                                i16--;
                                                            }
                                                            xmlPullParserNewPullParser.next();
                                                        }
                                                        hVar.getClass();
                                                        return hVar;
                                                    } catch (IOException e14) {
                                                        com.airbnb.lottie.animation.keyframe.a.x("Unexpected error when reading input.", e14);
                                                        return null;
                                                    } catch (XmlPullParserException e15) {
                                                        com.airbnb.lottie.animation.keyframe.a.x("Unable to decode source", e15);
                                                        return null;
                                                    }
                                                }

                                                @Override // yb.n
                                                public final void c(byte[] bArr, int i14, int i15, n.b bVar, fa.g<yb.c> gVar) {
                                                    yb.f.b(b(i14, i15, bArr), bVar, gVar);
                                                }
                                            }
