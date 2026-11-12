package defpackage;

import android.text.Layout;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
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
public final class y3q extends odm {
    public static final Pattern p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f39760r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern v = Pattern.compile("^(\\d+) (\\d+)$");
    public static final b w = new b(30.0f, 1, 1);
    public static final a x = new a(32, 15);
    public final XmlPullParserFactory o;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39762b;

        public a(int i, int i2) {
            this.f39761a = i;
            this.f39762b = i2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f39763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39764b;
        public final int c;

        public b(float f, int i, int i2) {
            this.f39763a = f;
            this.f39764b = i;
            this.c = i2;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39766b;

        public c(int i, int i2) {
            this.f39765a = i;
            this.f39766b = i2;
        }
    }

    public y3q() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static c4q B(c4q c4qVar) {
        return c4qVar == null ? new c4q() : c4qVar;
    }

    public static boolean C(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals(FitnessFilePathUtils.TimeZoneConstant.POSITIVE) || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static Layout.Alignment D(String str) {
        String strE = fk1.e(str);
        strE.hashCode();
        switch (strE) {
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

    public static a E(XmlPullParser xmlPullParser, a aVar) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = v.matcher(attributeValue);
        if (!matcher.matches()) {
            toe.h("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
        try {
            int i = Integer.parseInt((String) rk1.e(matcher.group(1)));
            int i2 = Integer.parseInt((String) rk1.e(matcher.group(2)));
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
            toe.h("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
    }

    public static void F(String str, c4q c4qVar) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrM0 = wlq.M0(str, "\\s+");
        if (strArrM0.length == 1) {
            matcher = f39760r.matcher(str);
        } else {
            if (strArrM0.length != 2) {
                int length = strArrM0.length;
                StringBuilder sb = new StringBuilder(52);
                sb.append("Invalid number of entries for fontSize: ");
                sb.append(length);
                sb.append(".");
                throw new SubtitleDecoderException(sb.toString());
            }
            matcher = f39760r.matcher(strArrM0[1]);
            toe.h("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
            sb2.append("Invalid expression for fontSize: '");
            sb2.append(str);
            sb2.append("'.");
            throw new SubtitleDecoderException(sb2.toString());
        }
        String str2 = (String) rk1.e(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                c4qVar.z(3);
                break;
            case "em":
                c4qVar.z(2);
                break;
            case "px":
                c4qVar.z(1);
                break;
            default:
                StringBuilder sb3 = new StringBuilder(str2.length() + 30);
                sb3.append("Invalid unit for fontSize: '");
                sb3.append(str2);
                sb3.append("'.");
                throw new SubtitleDecoderException(sb3.toString());
        }
        c4qVar.y(Float.parseFloat((String) rk1.e(matcher.group(1))));
    }

    public static b G(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrM0 = wlq.M0(attributeValue2, " ");
            if (strArrM0.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(strArrM0[0]) / Integer.parseInt(strArrM0[1]);
        } else {
            f = 1.0f;
        }
        b bVar = w;
        int i2 = bVar.f39764b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = bVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new b(i * f, i2, i3);
    }

    public static Map<String, c4q> H(XmlPullParser xmlPullParser, Map<String, c4q> map, a aVar, c cVar, Map<String, a4q> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (ksr.f(xmlPullParser, "style")) {
                String strA = ksr.a(xmlPullParser, "style");
                c4q c4qVarM = M(xmlPullParser, new c4q());
                if (strA != null) {
                    for (String str : N(strA)) {
                        c4qVarM.a(map.get(str));
                    }
                }
                String strG = c4qVarM.g();
                if (strG != null) {
                    map.put(strG, c4qVarM);
                }
            } else if (ksr.f(xmlPullParser, "region")) {
                a4q a4qVarK = K(xmlPullParser, aVar, cVar);
                if (a4qVarK != null) {
                    map2.put(a4qVarK.f616a, a4qVarK);
                }
            } else if (ksr.f(xmlPullParser, "metadata")) {
                I(xmlPullParser, map3);
            }
        } while (!ksr.d(xmlPullParser, "head"));
        return map;
    }

    public static void I(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (ksr.f(xmlPullParser, "image") && (strA = ksr.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!ksr.d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:6:0x0039  */
    public static z3q J(XmlPullParser xmlPullParser, z3q z3qVar, Map<String, a4q> map, b bVar) throws SubtitleDecoderException {
        long j;
        long j2;
        int attributeCount = xmlPullParser.getAttributeCount();
        c4q c4qVarM = M(xmlPullParser, null);
        String[] strArr = null;
        String strSubstring = null;
        String str = "";
        long jO = -9223372036854775807L;
        long jO2 = -9223372036854775807L;
        long jO3 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jO3 = O(attributeValue, bVar);
                    break;
                case "end":
                    jO2 = O(attributeValue, bVar);
                    break;
                case "begin":
                    jO = O(attributeValue, bVar);
                    break;
                case "style":
                    String[] strArrN = N(attributeValue);
                    if (strArrN.length > 0) {
                        strArr = strArrN;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX)) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (z3qVar != null) {
            long j3 = z3qVar.d;
            j = -9223372036854775807L;
            if (j3 != -9223372036854775807L) {
                if (jO != -9223372036854775807L) {
                    jO += j3;
                }
                if (jO2 != -9223372036854775807L) {
                    jO2 += j3;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        long j4 = jO;
        if (jO2 != j) {
            j2 = jO2;
        } else if (jO3 != j) {
            j2 = j4 + jO3;
        } else if (z3qVar != null) {
            long j5 = z3qVar.e;
            if (j5 != j) {
                j2 = j5;
            } else {
                j2 = jO2;
            }
        } else {
            j2 = jO2;
        }
        return z3q.c(xmlPullParser.getName(), j4, j2, c4qVarM, strArr, str, strSubstring, z3qVar);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x016d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b8  */
    public static a4q K(XmlPullParser xmlPullParser, a aVar, c cVar) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        int i2;
        String strA = ksr.a(xmlPullParser, "id");
        if (strA == null) {
            return null;
        }
        String strA2 = ksr.a(xmlPullParser, "origin");
        if (strA2 == null) {
            toe.h("TtmlDecoder", "Ignoring region without an origin");
            return null;
        }
        Pattern pattern = t;
        Matcher matcher = pattern.matcher(strA2);
        Pattern pattern2 = u;
        Matcher matcher2 = pattern2.matcher(strA2);
        if (matcher.matches()) {
            try {
                float f6 = Float.parseFloat((String) rk1.e(matcher.group(1))) / 100.0f;
                f = Float.parseFloat((String) rk1.e(matcher.group(2))) / 100.0f;
                f2 = f6;
            } catch (NumberFormatException unused) {
                toe.h("TtmlDecoder", strA2.length() != 0 ? "Ignoring region with malformed origin: ".concat(strA2) : new String("Ignoring region with malformed origin: "));
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                toe.h("TtmlDecoder", strA2.length() != 0 ? "Ignoring region with unsupported origin: ".concat(strA2) : new String("Ignoring region with unsupported origin: "));
                return null;
            }
            if (cVar == null) {
                toe.h("TtmlDecoder", strA2.length() != 0 ? "Ignoring region with missing tts:extent: ".concat(strA2) : new String("Ignoring region with missing tts:extent: "));
                return null;
            }
            try {
                int i3 = Integer.parseInt((String) rk1.e(matcher2.group(1)));
                int i4 = Integer.parseInt((String) rk1.e(matcher2.group(2)));
                f2 = i3 / cVar.f39765a;
                f = i4 / cVar.f39766b;
            } catch (NumberFormatException unused2) {
                toe.h("TtmlDecoder", strA2.length() != 0 ? "Ignoring region with malformed origin: ".concat(strA2) : new String("Ignoring region with malformed origin: "));
                return null;
            }
        }
        String strA3 = ksr.a(xmlPullParser, "extent");
        if (strA3 == null) {
            toe.h("TtmlDecoder", "Ignoring region without an extent");
            return null;
        }
        Matcher matcher3 = pattern.matcher(strA3);
        Matcher matcher4 = pattern2.matcher(strA3);
        if (matcher3.matches()) {
            try {
                f3 = Float.parseFloat((String) rk1.e(matcher3.group(1))) / 100.0f;
                f4 = Float.parseFloat((String) rk1.e(matcher3.group(2))) / 100.0f;
            } catch (NumberFormatException unused3) {
                toe.h("TtmlDecoder", strA2.length() != 0 ? "Ignoring region with malformed extent: ".concat(strA2) : new String("Ignoring region with malformed extent: "));
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                toe.h("TtmlDecoder", strA2.length() != 0 ? "Ignoring region with unsupported extent: ".concat(strA2) : new String("Ignoring region with unsupported extent: "));
                return null;
            }
            if (cVar == null) {
                toe.h("TtmlDecoder", strA2.length() != 0 ? "Ignoring region with missing tts:extent: ".concat(strA2) : new String("Ignoring region with missing tts:extent: "));
                return null;
            }
            try {
                int i5 = Integer.parseInt((String) rk1.e(matcher4.group(1)));
                int i6 = Integer.parseInt((String) rk1.e(matcher4.group(2)));
                f3 = i5 / cVar.f39765a;
                f4 = i6 / cVar.f39766b;
            } catch (NumberFormatException unused4) {
                toe.h("TtmlDecoder", strA2.length() != 0 ? "Ignoring region with malformed extent: ".concat(strA2) : new String("Ignoring region with malformed extent: "));
                return null;
            }
        }
        String strA4 = ksr.a(xmlPullParser, "displayAlign");
        if (strA4 != null) {
            String strE = fk1.e(strA4);
            strE.hashCode();
            if (strE.equals("center")) {
                f5 = f + (f4 / 2.0f);
                i = 1;
            } else if (strE.equals("after")) {
                f5 = f + f4;
                i = 2;
            } else {
                i = 0;
                f5 = f;
            }
        } else {
            i = 0;
            f5 = f;
        }
        float f7 = 1.0f / aVar.f39762b;
        String strA5 = ksr.a(xmlPullParser, "writingMode");
        if (strA5 != null) {
            String strE2 = fk1.e(strA5);
            strE2.hashCode();
            switch (strE2) {
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
        return new a4q(strA, f2, f5, 0, i, f3, f4, 1, f7, i2);
    }

    public static float L(String str) {
        Matcher matcher = s.matcher(str);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(str);
            toe.h("TtmlDecoder", strValueOf.length() != 0 ? "Invalid value for shear: ".concat(strValueOf) : new String("Invalid value for shear: "));
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) rk1.e(matcher.group(1)))));
        } catch (NumberFormatException e) {
            String strValueOf2 = String.valueOf(str);
            toe.i("TtmlDecoder", strValueOf2.length() != 0 ? "Failed to parse shear: ".concat(strValueOf2) : new String("Failed to parse shear: "), e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static c4q M(XmlPullParser xmlPullParser, c4q c4qVar) {
        byte b2;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    b2 = attributeName.equals("fontStyle") ? (byte) 0 : (byte) -1;
                    break;
                case -1224696685:
                    b2 = attributeName.equals("fontFamily") ? (byte) 1 : (byte) -1;
                    break;
                case -1065511464:
                    b2 = attributeName.equals("textAlign") ? (byte) 2 : (byte) -1;
                    break;
                case -879295043:
                    b2 = attributeName.equals("textDecoration") ? (byte) 3 : (byte) -1;
                    break;
                case -734428249:
                    b2 = attributeName.equals("fontWeight") ? (byte) 4 : (byte) -1;
                    break;
                case 3355:
                    b2 = attributeName.equals("id") ? (byte) 5 : (byte) -1;
                    break;
                case 3511770:
                    b2 = attributeName.equals("ruby") ? (byte) 6 : (byte) -1;
                    break;
                case 94842723:
                    b2 = attributeName.equals("color") ? (byte) 7 : (byte) -1;
                    break;
                case 109403361:
                    b2 = attributeName.equals("shear") ? (byte) 8 : (byte) -1;
                    break;
                case 110138194:
                    b2 = attributeName.equals("textCombine") ? (byte) 9 : (byte) -1;
                    break;
                case 365601008:
                    b2 = attributeName.equals("fontSize") ? (byte) 10 : (byte) -1;
                    break;
                case 921125321:
                    b2 = attributeName.equals("textEmphasis") ? (byte) 11 : (byte) -1;
                    break;
                case 1115953443:
                    b2 = attributeName.equals("rubyPosition") ? AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT : (byte) -1;
                    break;
                case 1287124693:
                    b2 = attributeName.equals("backgroundColor") ? HMProSyncDataBaseProfile.DATA_TYPE_PAI : (byte) -1;
                    break;
                case 1754920356:
                    b2 = attributeName.equals("multiRowAlign") ? HMProSyncDataBaseProfile.DATA_TYPE_COACHING : (byte) -1;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    c4qVar = B(c4qVar).B("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    c4qVar = B(c4qVar).x(attributeValue);
                    break;
                case 2:
                    c4qVar = B(c4qVar).H(D(attributeValue));
                    break;
                case 3:
                    String strE = fk1.e(attributeValue);
                    strE.hashCode();
                    switch (strE) {
                        case "nounderline":
                            c4qVar = B(c4qVar).K(false);
                            break;
                        case "underline":
                            c4qVar = B(c4qVar).K(true);
                            break;
                        case "nolinethrough":
                            c4qVar = B(c4qVar).C(false);
                            break;
                        case "linethrough":
                            c4qVar = B(c4qVar).C(true);
                            break;
                    }
                    break;
                case 4:
                    c4qVar = B(c4qVar).v("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        c4qVar = B(c4qVar).A(attributeValue);
                    }
                    break;
                case 6:
                    String strE2 = fk1.e(attributeValue);
                    strE2.hashCode();
                    switch (strE2) {
                        case "baseContainer":
                        case "base":
                            c4qVar = B(c4qVar).F(2);
                            break;
                        case "container":
                            c4qVar = B(c4qVar).F(1);
                            break;
                        case "delimiter":
                            c4qVar = B(c4qVar).F(4);
                            break;
                        case "textContainer":
                        case "text":
                            c4qVar = B(c4qVar).F(3);
                            break;
                    }
                    break;
                case 7:
                    c4qVar = B(c4qVar);
                    try {
                        c4qVar.w(t44.c(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        String strValueOf = String.valueOf(attributeValue);
                        toe.h("TtmlDecoder", strValueOf.length() != 0 ? "Failed parsing color value: ".concat(strValueOf) : new String("Failed parsing color value: "));
                    }
                    break;
                case 8:
                    c4qVar = B(c4qVar).G(L(attributeValue));
                    break;
                case 9:
                    String strE3 = fk1.e(attributeValue);
                    strE3.hashCode();
                    if (strE3.equals("all")) {
                        c4qVar = B(c4qVar).I(true);
                    } else if (strE3.equals("none")) {
                        c4qVar = B(c4qVar).I(false);
                    }
                    break;
                case 10:
                    try {
                        c4qVar = B(c4qVar);
                        F(attributeValue, c4qVar);
                    } catch (SubtitleDecoderException unused2) {
                        String strValueOf2 = String.valueOf(attributeValue);
                        toe.h("TtmlDecoder", strValueOf2.length() != 0 ? "Failed parsing fontSize value: ".concat(strValueOf2) : new String("Failed parsing fontSize value: "));
                    }
                    break;
                case 11:
                    c4qVar = B(c4qVar).J(v7p.a(attributeValue));
                    break;
                case 12:
                    String strE4 = fk1.e(attributeValue);
                    strE4.hashCode();
                    if (strE4.equals("before")) {
                        c4qVar = B(c4qVar).E(1);
                    } else if (strE4.equals("after")) {
                        c4qVar = B(c4qVar).E(2);
                    }
                    break;
                case 13:
                    c4qVar = B(c4qVar);
                    try {
                        c4qVar.u(t44.c(attributeValue));
                    } catch (IllegalArgumentException unused3) {
                        String strValueOf3 = String.valueOf(attributeValue);
                        toe.h("TtmlDecoder", strValueOf3.length() != 0 ? "Failed parsing background value: ".concat(strValueOf3) : new String("Failed parsing background value: "));
                    }
                    break;
                case 14:
                    c4qVar = B(c4qVar).D(D(attributeValue));
                    break;
            }
        }
        return c4qVar;
    }

    public static String[] N(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : wlq.M0(strTrim, "\\s+");
    }

    public static long O(String str, b bVar) throws SubtitleDecoderException {
        double d;
        double d2;
        Matcher matcher = p.matcher(str);
        if (matcher.matches()) {
            double d3 = (Long.parseLong((String) rk1.e(matcher.group(1))) * TimeDateUtil.TIME_HOUR) + (Long.parseLong((String) rk1.e(matcher.group(2))) * 60) + Long.parseLong((String) rk1.e(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d4 = d3 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d5 = d4 + (strGroup2 != null ? Long.parseLong(strGroup2) / bVar.f39763a : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d5 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) bVar.f39764b)) / ((double) bVar.f39763a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = q.matcher(str);
        if (!matcher2.matches()) {
            String strValueOf = String.valueOf(str);
            throw new SubtitleDecoderException(strValueOf.length() != 0 ? "Malformed time expression: ".concat(strValueOf) : new String("Malformed time expression: "));
        }
        double d6 = Double.parseDouble((String) rk1.e(matcher2.group(1)));
        String str2 = (String) rk1.e(matcher2.group(2));
        str2.hashCode();
        switch (str2) {
            case "f":
                d = bVar.f39763a;
                d6 /= d;
                return (long) (d6 * 1000000.0d);
            case "h":
                d2 = 3600.0d;
                break;
            case "m":
                d2 = 60.0d;
                break;
            case "t":
                d = bVar.c;
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

    public static c P(XmlPullParser xmlPullParser) {
        String strA = ksr.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = u.matcher(strA);
        if (!matcher.matches()) {
            toe.h("TtmlDecoder", strA.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(strA) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            return new c(Integer.parseInt((String) rk1.e(matcher.group(1))), Integer.parseInt((String) rk1.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            toe.h("TtmlDecoder", strA.length() != 0 ? "Ignoring malformed tts extent: ".concat(strA) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    @Override // defpackage.odm
    public soo z(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        b bVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new a4q(""));
            c cVarP = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarG = w;
            a aVarE = x;
            int i2 = 0;
            d4q d4qVar = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                z3q z3qVar = (z3q) arrayDeque.peek();
                if (i2 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVarG = G(xmlPullParserNewPullParser);
                            aVarE = E(xmlPullParserNewPullParser, x);
                            cVarP = P(xmlPullParserNewPullParser);
                        }
                        c cVar = cVarP;
                        b bVar2 = bVarG;
                        a aVar = aVarE;
                        if (C(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar2;
                                H(xmlPullParserNewPullParser, map, aVar, cVar, map2, map3);
                            } else {
                                bVar = bVar2;
                                try {
                                    z3q z3qVarJ = J(xmlPullParserNewPullParser, z3qVar, map2, bVar);
                                    arrayDeque.push(z3qVarJ);
                                    if (z3qVar != null) {
                                        z3qVar.a(z3qVarJ);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    toe.i("TtmlDecoder", "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            bVarG = bVar;
                        } else {
                            String strValueOf = String.valueOf(xmlPullParserNewPullParser.getName());
                            toe.f("TtmlDecoder", strValueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(strValueOf) : new String("Ignoring unsupported tag: "));
                            i2++;
                            bVarG = bVar2;
                        }
                        cVarP = cVar;
                        aVarE = aVar;
                    } else if (eventType == 4) {
                        ((z3q) rk1.e(z3qVar)).a(z3q.d(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            d4qVar = new d4q((z3q) rk1.e((z3q) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (d4qVar != null) {
                return d4qVar;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new SubtitleDecoderException("Unable to decode source", e3);
        }
    }
}
