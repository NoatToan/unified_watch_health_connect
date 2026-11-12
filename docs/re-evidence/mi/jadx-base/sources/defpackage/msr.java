package defpackage;

import android.util.Xml;
import androidx.collection.ArrayMap;
import com.mi.health.course.export.data.CourseConfigModel;
import com.xiaomi.smarthome.framework.plugin.rn.utils.StringUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes5.dex */
public class msr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f27167a = Charset.forName("UTF-8");

    public interface a {
        Object a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException;
    }

    public interface b {
        void a(Object obj, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException;
    }

    public static final void A(Object obj, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        B(obj, str, xmlSerializer, null);
    }

    public static final void B(Object obj, String str, XmlSerializer xmlSerializer, b bVar) throws XmlPullParserException, IOException {
        String str2;
        if (obj == null) {
            xmlSerializer.startTag(null, AbstractJsonLexerKt.NULL);
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.endTag(null, AbstractJsonLexerKt.NULL);
            return;
        }
        if (obj instanceof String) {
            xmlSerializer.startTag(null, "string");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag(null, "string");
            return;
        }
        if (obj instanceof Integer) {
            str2 = "int";
        } else if (obj instanceof Long) {
            str2 = "long";
        } else if (obj instanceof Float) {
            str2 = "float";
        } else if (obj instanceof Double) {
            str2 = "double";
        } else {
            if (!(obj instanceof Boolean)) {
                if (obj instanceof byte[]) {
                    p((byte[]) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof int[]) {
                    r((int[]) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof long[]) {
                    t((long[]) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof double[]) {
                    q((double[]) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof String[]) {
                    z((String[]) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof boolean[]) {
                    o((boolean[]) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof Map) {
                    v((Map) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof List) {
                    s((List) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof Set) {
                    y((Set) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof CharSequence) {
                    xmlSerializer.startTag(null, "string");
                    if (str != null) {
                        xmlSerializer.attribute(null, "name", str);
                    }
                    xmlSerializer.text(obj.toString());
                    xmlSerializer.endTag(null, "string");
                    return;
                }
                if (bVar != null) {
                    bVar.a(obj, str, xmlSerializer);
                    return;
                }
                throw new RuntimeException("writeValueXml: unable to write value " + obj);
            }
            str2 = "boolean";
        }
        xmlSerializer.startTag(null, str2);
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "value", obj.toString());
        xmlSerializer.endTag(null, str2);
    }

    public static final HashMap<String, ?> a(InputStream inputStream) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, f27167a.name());
        return (HashMap) n(xmlPullParserNewPullParser, new String[1]);
    }

    public static final ArrayMap<String, ?> b(XmlPullParser xmlPullParser, String str, String[] strArr, a aVar) throws XmlPullParserException, IOException {
        ArrayMap<String, ?> arrayMap = new ArrayMap<>();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayMap.put(strArr[0], m(xmlPullParser, strArr, aVar, true));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayMap;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static final boolean[] c(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        try {
            int i = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
            xmlPullParser.next();
            boolean[] zArr = new boolean[i];
            int eventType = xmlPullParser.getEventType();
            int i2 = 0;
            do {
                if (eventType == 2) {
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                    try {
                        zArr[i2] = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "value"));
                    } catch (NullPointerException unused) {
                        throw new XmlPullParserException("Need value attribute in item");
                    } catch (NumberFormatException unused2) {
                        throw new XmlPullParserException("Not a number in value attribute in item");
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return zArr;
                    }
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                    i2++;
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in string-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in string-array");
        }
    }

    public static final byte[] d(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        try {
            int i = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
            byte[] bArr = new byte[i];
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 4) {
                    if (i > 0) {
                        String text = xmlPullParser.getText();
                        if (text == null || text.length() != i * 2) {
                            throw new XmlPullParserException("Invalid value found in byte-array: " + text);
                        }
                        for (int i2 = 0; i2 < i; i2++) {
                            int i3 = i2 * 2;
                            char cCharAt = text.charAt(i3);
                            char cCharAt2 = text.charAt(i3 + 1);
                            bArr[i2] = (byte) (((cCharAt2 > 'a' ? cCharAt2 - 'W' : cCharAt2 - '0') & 15) | (((cCharAt > 'a' ? cCharAt - 'W' : cCharAt - '0') & 15) << 4));
                        }
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return bArr;
                    }
                    throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException unused2) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    public static final double[] e(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        try {
            int i = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
            xmlPullParser.next();
            double[] dArr = new double[i];
            int eventType = xmlPullParser.getEventType();
            int i2 = 0;
            do {
                if (eventType == 2) {
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                    try {
                        dArr[i2] = Double.parseDouble(xmlPullParser.getAttributeValue(null, "value"));
                    } catch (NullPointerException unused) {
                        throw new XmlPullParserException("Need value attribute in item");
                    } catch (NumberFormatException unused2) {
                        throw new XmlPullParserException("Not a number in value attribute in item");
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return dArr;
                    }
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                    i2++;
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in double-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in double-array");
        }
    }

    public static final int[] f(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        try {
            int i = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
            xmlPullParser.next();
            int[] iArr = new int[i];
            int eventType = xmlPullParser.getEventType();
            int i2 = 0;
            do {
                if (eventType == 2) {
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                    try {
                        iArr[i2] = Integer.parseInt(xmlPullParser.getAttributeValue(null, "value"));
                    } catch (NullPointerException unused) {
                        throw new XmlPullParserException("Need value attribute in item");
                    } catch (NumberFormatException unused2) {
                        throw new XmlPullParserException("Not a number in value attribute in item");
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return iArr;
                    }
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                    i2++;
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in int-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in int-array");
        }
    }

    public static final ArrayList g(XmlPullParser xmlPullParser, String str, String[] strArr, a aVar, boolean z) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(m(xmlPullParser, strArr, aVar, z));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayList;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static final long[] h(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        try {
            int i = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
            xmlPullParser.next();
            long[] jArr = new long[i];
            int eventType = xmlPullParser.getEventType();
            int i2 = 0;
            do {
                if (eventType == 2) {
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                    try {
                        jArr[i2] = Long.parseLong(xmlPullParser.getAttributeValue(null, "value"));
                    } catch (NullPointerException unused) {
                        throw new XmlPullParserException("Need value attribute in item");
                    } catch (NumberFormatException unused2) {
                        throw new XmlPullParserException("Not a number in value attribute in item");
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return jArr;
                    }
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                    i2++;
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in long-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in long-array");
        }
    }

    public static final HashMap<String, ?> i(XmlPullParser xmlPullParser, String str, String[] strArr, a aVar) throws XmlPullParserException, IOException {
        HashMap<String, ?> map = new HashMap<>();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                map.put(strArr[0], m(xmlPullParser, strArr, aVar, false));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return map;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static final Object j(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        try {
            if (str.equals("int")) {
                return Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue(null, "value")));
            }
            if (str.equals("long")) {
                return Long.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            }
            if (str.equals("float")) {
                return new Float(xmlPullParser.getAttributeValue(null, "value"));
            }
            if (str.equals("double")) {
                return new Double(xmlPullParser.getAttributeValue(null, "value"));
            }
            if (str.equals("boolean")) {
                return Boolean.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            }
            return null;
        } catch (NullPointerException unused) {
            throw new XmlPullParserException("Need value attribute in <" + str + ">");
        } catch (NumberFormatException unused2) {
            throw new XmlPullParserException("Not a number in value attribute in <" + str + ">");
        }
    }

    public static final HashSet k(XmlPullParser xmlPullParser, String str, String[] strArr, a aVar, boolean z) throws XmlPullParserException, IOException {
        HashSet hashSet = new HashSet();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashSet.add(m(xmlPullParser, strArr, aVar, z));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashSet;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static final String[] l(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        try {
            int i = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
            xmlPullParser.next();
            String[] strArr2 = new String[i];
            int eventType = xmlPullParser.getEventType();
            int i2 = 0;
            do {
                if (eventType == 2) {
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                    try {
                        strArr2[i2] = xmlPullParser.getAttributeValue(null, "value");
                    } catch (NullPointerException unused) {
                        throw new XmlPullParserException("Need value attribute in item");
                    } catch (NumberFormatException unused2) {
                        throw new XmlPullParserException("Not a number in value attribute in item");
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return strArr2;
                    }
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                    i2++;
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in string-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in string-array");
        }
    }

    public static final Object m(XmlPullParser xmlPullParser, String[] strArr, a aVar, boolean z) throws XmlPullParserException, IOException {
        int next;
        Object objJ = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        String name = xmlPullParser.getName();
        if (!name.equals(AbstractJsonLexerKt.NULL)) {
            if (name.equals("string")) {
                String str = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 1) {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    }
                    if (next2 == 3) {
                        if (xmlPullParser.getName().equals("string")) {
                            strArr[0] = attributeValue;
                            return str;
                        }
                        throw new XmlPullParserException("Unexpected end tag in <string>: " + xmlPullParser.getName());
                    }
                    if (next2 == 4) {
                        str = str + xmlPullParser.getText();
                    } else if (next2 == 2) {
                        throw new XmlPullParserException("Unexpected start tag in <string>: " + xmlPullParser.getName());
                    }
                }
            } else {
                objJ = j(xmlPullParser, name);
                if (objJ == null) {
                    if (name.equals("byte-array")) {
                        byte[] bArrD = d(xmlPullParser, "byte-array", strArr);
                        strArr[0] = attributeValue;
                        return bArrD;
                    }
                    if (name.equals(StringUtil.INT_ARRAY)) {
                        int[] iArrF = f(xmlPullParser, StringUtil.INT_ARRAY, strArr);
                        strArr[0] = attributeValue;
                        return iArrF;
                    }
                    if (name.equals("long-array")) {
                        long[] jArrH = h(xmlPullParser, "long-array", strArr);
                        strArr[0] = attributeValue;
                        return jArrH;
                    }
                    if (name.equals("double-array")) {
                        double[] dArrE = e(xmlPullParser, "double-array", strArr);
                        strArr[0] = attributeValue;
                        return dArrE;
                    }
                    if (name.equals("string-array")) {
                        String[] strArrL = l(xmlPullParser, "string-array", strArr);
                        strArr[0] = attributeValue;
                        return strArrL;
                    }
                    if (name.equals("boolean-array")) {
                        boolean[] zArrC = c(xmlPullParser, "boolean-array", strArr);
                        strArr[0] = attributeValue;
                        return zArrC;
                    }
                    if (name.equals("map")) {
                        xmlPullParser.next();
                        Object objB = z ? b(xmlPullParser, "map", strArr, aVar) : i(xmlPullParser, "map", strArr, aVar);
                        strArr[0] = attributeValue;
                        return objB;
                    }
                    if (name.equals("list")) {
                        xmlPullParser.next();
                        ArrayList arrayListG = g(xmlPullParser, "list", strArr, aVar, z);
                        strArr[0] = attributeValue;
                        return arrayListG;
                    }
                    if (name.equals(CourseConfigModel.DevCmd.CMD_ACTION_SET)) {
                        xmlPullParser.next();
                        HashSet hashSetK = k(xmlPullParser, CourseConfigModel.DevCmd.CMD_ACTION_SET, strArr, aVar, z);
                        strArr[0] = attributeValue;
                        return hashSetK;
                    }
                    if (aVar != null) {
                        Object objA = aVar.a(xmlPullParser, name);
                        strArr[0] = attributeValue;
                        return objA;
                    }
                    throw new XmlPullParserException("Unknown tag: " + name);
                }
            }
        }
        do {
            next = xmlPullParser.next();
            if (next == 1) {
                throw new XmlPullParserException("Unexpected end of document in <" + name + ">");
            }
            if (next == 3) {
                if (xmlPullParser.getName().equals(name)) {
                    strArr[0] = attributeValue;
                    return objJ;
                }
                throw new XmlPullParserException("Unexpected end tag in <" + name + ">: " + xmlPullParser.getName());
            }
            if (next == 4) {
                throw new XmlPullParserException("Unexpected text in <" + name + ">: " + xmlPullParser.getName());
            }
        } while (next != 2);
        throw new XmlPullParserException("Unexpected start tag in <" + name + ">: " + xmlPullParser.getName());
    }

    public static final Object n(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            if (eventType == 3) {
                throw new XmlPullParserException("Unexpected end tag at: " + xmlPullParser.getName());
            }
            if (eventType == 4) {
                throw new XmlPullParserException("Unexpected text: " + xmlPullParser.getText());
            }
            eventType = xmlPullParser.next();
            if (eventType == 1) {
                throw new XmlPullParserException("Unexpected end of document");
            }
        }
        return m(xmlPullParser, strArr, null, false);
    }

    public static final void o(boolean[] zArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (zArr == null) {
            xmlSerializer.startTag(null, AbstractJsonLexerKt.NULL);
            xmlSerializer.endTag(null, AbstractJsonLexerKt.NULL);
            return;
        }
        xmlSerializer.startTag(null, "boolean-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(zArr.length));
        for (boolean z : zArr) {
            xmlSerializer.startTag(null, "item");
            xmlSerializer.attribute(null, "value", Boolean.toString(z));
            xmlSerializer.endTag(null, "item");
        }
        xmlSerializer.endTag(null, "boolean-array");
    }

    public static final void p(byte[] bArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (bArr == null) {
            xmlSerializer.startTag(null, AbstractJsonLexerKt.NULL);
            xmlSerializer.endTag(null, AbstractJsonLexerKt.NULL);
            return;
        }
        xmlSerializer.startTag(null, "byte-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(bArr.length));
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i = (b2 >> 4) & 15;
            sb.append((char) (i >= 10 ? i + 87 : i + 48));
            int i2 = b2 & 15;
            sb.append((char) (i2 >= 10 ? i2 + 87 : i2 + 48));
        }
        xmlSerializer.text(sb.toString());
        xmlSerializer.endTag(null, "byte-array");
    }

    public static final void q(double[] dArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (dArr == null) {
            xmlSerializer.startTag(null, AbstractJsonLexerKt.NULL);
            xmlSerializer.endTag(null, AbstractJsonLexerKt.NULL);
            return;
        }
        xmlSerializer.startTag(null, "double-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(dArr.length));
        for (double d : dArr) {
            xmlSerializer.startTag(null, "item");
            xmlSerializer.attribute(null, "value", Double.toString(d));
            xmlSerializer.endTag(null, "item");
        }
        xmlSerializer.endTag(null, "double-array");
    }

    public static final void r(int[] iArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (iArr == null) {
            xmlSerializer.startTag(null, AbstractJsonLexerKt.NULL);
            xmlSerializer.endTag(null, AbstractJsonLexerKt.NULL);
            return;
        }
        xmlSerializer.startTag(null, StringUtil.INT_ARRAY);
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(iArr.length));
        for (int i : iArr) {
            xmlSerializer.startTag(null, "item");
            xmlSerializer.attribute(null, "value", Integer.toString(i));
            xmlSerializer.endTag(null, "item");
        }
        xmlSerializer.endTag(null, StringUtil.INT_ARRAY);
    }

    public static final void s(List list, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (list == null) {
            xmlSerializer.startTag(null, AbstractJsonLexerKt.NULL);
            xmlSerializer.endTag(null, AbstractJsonLexerKt.NULL);
            return;
        }
        xmlSerializer.startTag(null, "list");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A(list.get(i), null, xmlSerializer);
        }
        xmlSerializer.endTag(null, "list");
    }

    public static final void t(long[] jArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (jArr == null) {
            xmlSerializer.startTag(null, AbstractJsonLexerKt.NULL);
            xmlSerializer.endTag(null, AbstractJsonLexerKt.NULL);
            return;
        }
        xmlSerializer.startTag(null, "long-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(jArr.length));
        for (long j : jArr) {
            xmlSerializer.startTag(null, "item");
            xmlSerializer.attribute(null, "value", Long.toString(j));
            xmlSerializer.endTag(null, "item");
        }
        xmlSerializer.endTag(null, "long-array");
    }

    public static final void u(Map map, OutputStream outputStream) throws XmlPullParserException, IOException {
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(outputStream, f27167a.name());
        xmlSerializerNewSerializer.startDocument(null, Boolean.TRUE);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        v(map, null, xmlSerializerNewSerializer);
        xmlSerializerNewSerializer.endDocument();
    }

    public static final void v(Map map, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        w(map, str, xmlSerializer, null);
    }

    public static final void w(Map map, String str, XmlSerializer xmlSerializer, b bVar) throws XmlPullParserException, IOException {
        if (map == null) {
            xmlSerializer.startTag(null, AbstractJsonLexerKt.NULL);
            xmlSerializer.endTag(null, AbstractJsonLexerKt.NULL);
            return;
        }
        xmlSerializer.startTag(null, "map");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        x(map, xmlSerializer, bVar);
        xmlSerializer.endTag(null, "map");
    }

    public static final void x(Map map, XmlSerializer xmlSerializer, b bVar) throws XmlPullParserException, IOException {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            B(entry.getValue(), (String) entry.getKey(), xmlSerializer, bVar);
        }
    }

    public static final void y(Set set, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (set == null) {
            xmlSerializer.startTag(null, AbstractJsonLexerKt.NULL);
            xmlSerializer.endTag(null, AbstractJsonLexerKt.NULL);
            return;
        }
        xmlSerializer.startTag(null, CourseConfigModel.DevCmd.CMD_ACTION_SET);
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A(it.next(), null, xmlSerializer);
        }
        xmlSerializer.endTag(null, CourseConfigModel.DevCmd.CMD_ACTION_SET);
    }

    public static final void z(String[] strArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (strArr == null) {
            xmlSerializer.startTag(null, AbstractJsonLexerKt.NULL);
            xmlSerializer.endTag(null, AbstractJsonLexerKt.NULL);
            return;
        }
        xmlSerializer.startTag(null, "string-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(strArr.length));
        for (String str2 : strArr) {
            xmlSerializer.startTag(null, "item");
            xmlSerializer.attribute(null, "value", str2);
            xmlSerializer.endTag(null, "item");
        }
        xmlSerializer.endTag(null, "string-array");
    }
}
