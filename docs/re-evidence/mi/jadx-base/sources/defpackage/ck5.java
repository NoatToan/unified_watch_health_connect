package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.upstream.i;
import com.google.common.collect.ImmutableList;
import com.miui.tsmclient.net.TSMAuthContants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.accountsdk.request.SimpleRequest;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import miuix.animation.internal.FolmeCore;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class ck5 extends DefaultHandler implements i.a<bk5> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f5415b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f5416a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Format f5417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5418b;
        public final grl c;
        public final String d;
        public final ArrayList<DrmInitData.SchemeData> e;
        public final ArrayList<mz5> f;
        public final long g;

        public a(Format format, String str, grl grlVar, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<mz5> arrayList2, long j) {
            this.f5417a = format;
            this.f5418b = str;
            this.c = grlVar;
            this.d = str2;
            this.e = arrayList;
            this.f = arrayList2;
            this.g = j;
        }
    }

    public ck5() {
        try {
            this.f5416a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static int B(List<mz5> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            mz5 mz5Var = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(mz5Var.f27366a) && (str = mz5Var.f27367b) != null) {
                Matcher matcher = c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                String strValueOf = String.valueOf(mz5Var.f27367b);
                toe.h("MpdParser", strValueOf.length() != 0 ? "Unable to parse CEA-608 channel number from: ".concat(strValueOf) : new String("Unable to parse CEA-608 channel number from: "));
            }
        }
        return -1;
    }

    public static int C(List<mz5> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            mz5 mz5Var = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(mz5Var.f27366a) && (str = mz5Var.f27367b) != null) {
                Matcher matcher = d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                String strValueOf = String.valueOf(mz5Var.f27367b);
                toe.h("MpdParser", strValueOf.length() != 0 ? "Unable to parse CEA-708 service block number from: ".concat(strValueOf) : new String("Unable to parse CEA-708 service block number from: "));
            }
        }
        return -1;
    }

    public static long F(XmlPullParser xmlPullParser, String str, long j) throws ParserException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : wlq.C0(attributeValue);
    }

    public static mz5 G(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strM0 = m0(xmlPullParser, "schemeIdUri", "");
        String strM1 = m0(xmlPullParser, "value", null);
        String strM2 = m0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!ksr.d(xmlPullParser, str));
        return new mz5(strM0, strM1, strM2);
    }

    public static int H(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String strE = fk1.e(attributeValue);
        strE.hashCode();
        switch (strE) {
            case "4000":
                return 1;
            case "a000":
                return 2;
            case "f801":
                return 6;
            case "fa01":
                return 8;
            default:
                return -1;
        }
    }

    public static long I(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : wlq.D0(attributeValue);
    }

    public static String J(List<mz5> list) {
        for (int i = 0; i < list.size(); i++) {
            mz5 mz5Var = list.get(i);
            String str = mz5Var.f27366a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(mz5Var.f27367b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(mz5Var.f27367b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static float N(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f : Float.parseFloat(attributeValue);
    }

    public static float O(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f5415b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int i = Integer.parseInt(matcher.group(1));
        String strGroup = matcher.group(2);
        return !TextUtils.isEmpty(strGroup) ? i / Integer.parseInt(strGroup) : i;
    }

    public static int Q(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long S(List<mz5> list) {
        for (int i = 0; i < list.size(); i++) {
            mz5 mz5Var = list.get(i);
            if (fk1.a("http://dashif.org/guidelines/last-segment-number", mz5Var.f27366a)) {
                return Long.parseLong(mz5Var.f27367b);
            }
        }
        return -1L;
    }

    public static long T(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    public static int V(XmlPullParser xmlPullParser) {
        int iQ = Q(xmlPullParser, "value", -1);
        if (iQ < 0) {
            return -1;
        }
        int[] iArr = e;
        if (iQ < iArr.length) {
            return iArr[iQ];
        }
        return -1;
    }

    public static String m0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static String n0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                u(xmlPullParser);
            }
        } while (!ksr.d(xmlPullParser, str));
        return text;
    }

    public static int p(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        rk1.g(i == i2);
        return i;
    }

    public static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        rk1.g(str.equals(str2));
        return str;
    }

    public static void r(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.d()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).a(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                }
            }
        }
    }

    public static long s(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    public static String t(String str, String str2) {
        if (ayf.p(str)) {
            return ayf.c(str2);
        }
        if (ayf.s(str)) {
            return ayf.o(str2);
        }
        if (ayf.r(str)) {
            return "application/x-rawcc".equals(str) ? ayf.j(str2) : str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String strG = ayf.g(str2);
        return "text/vtt".equals(strG) ? "application/x-mp4-vtt" : strG;
    }

    public static void u(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (ksr.e(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (ksr.e(xmlPullParser)) {
                    i++;
                } else if (ksr.c(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    public String A(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return hdq.c(str, n0(xmlPullParser, "BaseURL"));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:58:0x00eb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8 */
    public Pair<String, DrmInitData.SchemeData> D(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? attributeValue2;
        ?? B;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue3 != null) {
            String strE = fk1.e(attributeValue3);
            strE.hashCode();
            switch (strE) {
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = g83.e;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    B = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = g83.d;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    B = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    String strB = ksr.b(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(strB) && !"00000000-0000-0000-0000-000000000000".equals(strB)) {
                        String[] strArrSplit = strB.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i = 0; i < strArrSplit.length; i++) {
                            uuidArr[i] = UUID.fromString(strArrSplit[i]);
                        }
                        uuid = g83.f18709b;
                        attributeValue2 = 0;
                        B = nei.b(uuid, uuidArr, null);
                        break;
                    } else {
                        uuid = null;
                        uuid2 = uuid;
                        attributeValue2 = uuid2;
                        B = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    attributeValue2 = uuid2;
                    B = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            attributeValue2 = uuid2;
            B = uuid2;
        }
        do {
            xmlPullParser.next();
            if (ksr.f(xmlPullParser, "ms:laurl")) {
                B = B;
                attributeValue2 = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (B == 0 && ksr.g(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                UUID uuidF = nei.f(bArrDecode);
                if (uuidF == null) {
                    toe.h("MpdParser", "Skipping malformed cenc:pssh data");
                    uuid = uuidF;
                    B = 0;
                    attributeValue2 = attributeValue2;
                } else {
                    B = bArrDecode;
                    uuid = uuidF;
                    attributeValue2 = attributeValue2;
                }
            } else if (B == 0) {
                UUID uuid3 = g83.e;
                if (uuid3.equals(uuid) && ksr.f(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    B = nei.a(uuid3, Base64.decode(xmlPullParser.getText(), 0));
                    attributeValue2 = attributeValue2;
                } else {
                    u(xmlPullParser);
                    B = B;
                    attributeValue2 = attributeValue2;
                }
            } else {
                u(xmlPullParser);
                B = B;
                attributeValue2 = attributeValue2;
            }
        } while (!ksr.d(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new DrmInitData.SchemeData(uuid, attributeValue2, "video/mp4", B) : null);
    }

    public int E(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    public Pair<Long, EventMessage> K(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long jT = T(xmlPullParser, "id", 0L);
        long jT2 = T(xmlPullParser, "duration", -9223372036854775807L);
        long jT3 = T(xmlPullParser, "presentationTime", 0L);
        long jH0 = wlq.H0(jT2, 1000L, j);
        long jH1 = wlq.H0(jT3, FolmeCore.NANOS_TO_MS, j);
        String strM0 = m0(xmlPullParser, "messageData", null);
        byte[] bArrL = L(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jH1);
        if (strM0 != null) {
            bArrL = wlq.i0(strM0);
        }
        return Pair.create(lValueOf, d(str, str2, jT, jH0, bArrL));
    }

    public byte[] L(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, bu3.c.name());
        xmlPullParser.nextToken();
        while (!ksr.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public ze8 M(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strM0 = m0(xmlPullParser, "schemeIdUri", "");
        String strM1 = m0(xmlPullParser, "value", "");
        long jT = T(xmlPullParser, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (ksr.f(xmlPullParser, "Event")) {
                arrayList.add(K(xmlPullParser, strM0, strM1, jT, byteArrayOutputStream));
            } else {
                u(xmlPullParser);
            }
        } while (!ksr.d(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return e(strM0, strM1, jT, jArr, eventMessageArr);
    }

    public tbj P(XmlPullParser xmlPullParser) {
        return Y(xmlPullParser, "sourceURL", "range");
    }

    public String R(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return n0(xmlPullParser, "Label");
    }

    public bk5 U(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        long j;
        String strA;
        ArrayList arrayList;
        long j2;
        long jF = F(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long jI = I(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long jI2 = I(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean zEquals = FitnessPersistKey.ActiveStage.equals(xmlPullParser.getAttributeValue(null, "type"));
        long jI3 = zEquals ? I(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long jI4 = zEquals ? I(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long jI5 = zEquals ? I(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long jF2 = F(xmlPullParser, "publishTime", -9223372036854775807L);
        long j3 = zEquals ? 0L : -9223372036854775807L;
        ArrayList arrayList2 = new ArrayList();
        String str2 = str;
        boolean z = false;
        boolean z2 = false;
        aci aciVarX = null;
        nlq nlqVarQ0 = null;
        Uri uri = null;
        lyl lylVarL0 = null;
        long j4 = zEquals ? -9223372036854775807L : 0L;
        long jZ = j3;
        while (true) {
            xmlPullParser.next();
            if (!ksr.f(xmlPullParser, "BaseURL")) {
                if (ksr.f(xmlPullParser, "ProgramInformation")) {
                    aciVarX = X(xmlPullParser);
                } else if (ksr.f(xmlPullParser, "UTCTiming")) {
                    nlqVarQ0 = q0(xmlPullParser);
                } else if (ksr.f(xmlPullParser, SimpleRequest.LOCATION)) {
                    uri = Uri.parse(xmlPullParser.nextText());
                } else if (ksr.f(xmlPullParser, "ServiceDescription")) {
                    lylVarL0 = l0(xmlPullParser);
                } else {
                    if (!ksr.f(xmlPullParser, "Period") || z2) {
                        j = jZ;
                        strA = str2;
                        arrayList = arrayList2;
                        u(xmlPullParser);
                    } else {
                        j = jZ;
                        arrayList = arrayList2;
                        strA = str2;
                        Pair<uqh, Long> pairW = W(xmlPullParser, str2, j4, jZ, jF, jI4);
                        uqh uqhVar = (uqh) pairW.first;
                        if (uqhVar.f36028b != -9223372036854775807L) {
                            long jLongValue = ((Long) pairW.second).longValue();
                            j4 = jLongValue == -9223372036854775807L ? -9223372036854775807L : uqhVar.f36028b + jLongValue;
                            arrayList.add(uqhVar);
                        } else {
                            if (!zEquals) {
                                int size = arrayList.size();
                                StringBuilder sb = new StringBuilder(47);
                                sb.append("Unable to determine start of period ");
                                sb.append(size);
                                throw new ParserException(sb.toString());
                            }
                            arrayList = arrayList;
                            z2 = true;
                        }
                    }
                    jZ = j;
                }
                strA = str2;
                arrayList = arrayList2;
            } else if (z) {
                j = jZ;
                strA = str2;
                arrayList = arrayList2;
                jZ = j;
            } else {
                jZ = z(xmlPullParser, jZ);
                strA = A(xmlPullParser, str2);
                arrayList = arrayList2;
                z = true;
            }
            if (ksr.d(xmlPullParser, "MPD")) {
                if (jI != -9223372036854775807L) {
                    j2 = jI;
                } else if (j4 != -9223372036854775807L) {
                    j2 = j4;
                } else {
                    if (!zEquals) {
                        throw new ParserException("Unable to determine duration of static manifest.");
                    }
                    j2 = jI;
                }
                if (arrayList.isEmpty()) {
                    throw new ParserException("No periods found.");
                }
                return g(jF, j2, jI2, zEquals, jI3, jI4, jI5, jF2, aciVarX, nlqVarQ0, lylVarL0, uri, arrayList);
            }
            arrayList2 = arrayList;
            str2 = strA;
        }
    }

    public Pair<uqh, Long> W(XmlPullParser xmlPullParser, String str, long j, long j2, long j3, long j4) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        long j5;
        grl grlVarG0;
        Object obj2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        long jI = I(xmlPullParser, StatConstants.PARAM_START, j);
        long j6 = -9223372036854775807L;
        long j7 = j3 != -9223372036854775807L ? j3 + jI : -9223372036854775807L;
        long jI2 = I(xmlPullParser, "duration", -9223372036854775807L);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String strA = str;
        long jZ = j2;
        boolean z = false;
        long j8 = -9223372036854775807L;
        grl grlVarE0 = null;
        mz5 mz5VarG = null;
        while (true) {
            xmlPullParser.next();
            if (!ksr.f(xmlPullParser, "BaseURL")) {
                if (ksr.f(xmlPullParser, "AdaptationSet")) {
                    jZ = jZ;
                    strA = strA;
                    arrayList = arrayList3;
                    arrayList.add(w(xmlPullParser, strA, grlVarE0, jI2, jZ, j8, j7, j4));
                    arrayList2 = arrayList4;
                } else {
                    jZ = jZ;
                    ArrayList arrayList5 = arrayList4;
                    strA = strA;
                    arrayList = arrayList3;
                    if (ksr.f(xmlPullParser, "EventStream")) {
                        arrayList5.add(M(xmlPullParser));
                        arrayList2 = arrayList5;
                    } else if (ksr.f(xmlPullParser, "SegmentBase")) {
                        arrayList2 = arrayList5;
                        grlVarE0 = e0(xmlPullParser, null);
                        obj = null;
                        jZ = jZ;
                        strA = strA;
                        j5 = -9223372036854775807L;
                    } else {
                        arrayList2 = arrayList5;
                        if (ksr.f(xmlPullParser, "SegmentList")) {
                            long jZ2 = z(xmlPullParser, -9223372036854775807L);
                            obj = null;
                            grlVarG0 = f0(xmlPullParser, null, j7, jI2, jZ, jZ2, j4);
                            j8 = jZ2;
                            j5 = -9223372036854775807L;
                        } else {
                            obj = null;
                            if (ksr.f(xmlPullParser, "SegmentTemplate")) {
                                long jZ3 = z(xmlPullParser, -9223372036854775807L);
                                j5 = -9223372036854775807L;
                                grlVarG0 = g0(xmlPullParser, null, ImmutableList.of(), j7, jI2, jZ, jZ3, j4);
                                j8 = jZ3;
                            } else {
                                j5 = -9223372036854775807L;
                                if (ksr.f(xmlPullParser, "AssetIdentifier")) {
                                    mz5VarG = G(xmlPullParser, "AssetIdentifier");
                                } else {
                                    u(xmlPullParser);
                                }
                                jZ = jZ;
                                strA = strA;
                            }
                        }
                        grlVarE0 = grlVarG0;
                    }
                }
                obj = null;
                j5 = -9223372036854775807L;
                jZ = jZ;
                strA = strA;
            } else if (z) {
                jZ = jZ;
                arrayList2 = arrayList4;
                strA = strA;
                j5 = j6;
                obj = obj2;
                arrayList = arrayList3;
                jZ = jZ;
                strA = strA;
            } else {
                jZ = z(xmlPullParser, jZ);
                strA = A(xmlPullParser, strA);
                z = true;
                arrayList2 = arrayList4;
                j5 = j6;
                obj = obj2;
                arrayList = arrayList3;
            }
            if (ksr.d(xmlPullParser, "Period")) {
                return Pair.create(h(attributeValue, jI, arrayList, arrayList2, mz5VarG), Long.valueOf(jI2));
            }
            arrayList3 = arrayList;
            obj2 = obj;
            arrayList4 = arrayList2;
            j6 = j5;
        }
    }

    public aci X(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strM0 = m0(xmlPullParser, "moreInformationURL", null);
        String strM1 = m0(xmlPullParser, TSMAuthContants.PARAM_LANGUAGE, null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (ksr.f(xmlPullParser, WebViewActivity.TITLE)) {
                strNextText = xmlPullParser.nextText();
            } else if (ksr.f(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (ksr.f(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                u(xmlPullParser);
            }
            String str = strNextText3;
            if (ksr.d(xmlPullParser, "ProgramInformation")) {
                return new aci(strNextText, strNextText2, str, strM0, strM1);
            }
            strNextText3 = str;
        }
    }

    public tbj Y(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return i(attributeValue, j, j2);
        }
        j = 0;
        j2 = -1;
        return i(attributeValue, j, j2);
    }

    public a Z(XmlPullParser xmlPullParser, String str, String str2, String str3, int i, int i2, float f, int i3, int i4, String str4, List<mz5> list, List<mz5> list2, List<mz5> list3, List<mz5> list4, grl grlVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        String strA;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long jZ;
        grl grlVarE0;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        int iQ = Q(xmlPullParser, "bandwidth", -1);
        String strM0 = m0(xmlPullParser, "mimeType", str2);
        String strM1 = m0(xmlPullParser, "codecs", str3);
        int iQ2 = Q(xmlPullParser, "width", i);
        int iQ3 = Q(xmlPullParser, "height", i2);
        float fO = O(xmlPullParser, f);
        int iQ4 = Q(xmlPullParser, "audioSamplingRate", i4);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList(list3);
        ArrayList arrayList9 = new ArrayList(list4);
        String str5 = str;
        int iY = i3;
        long j7 = j3;
        boolean z = false;
        String str6 = null;
        grl grlVarG0 = grlVar;
        long j8 = j4;
        while (true) {
            xmlPullParser.next();
            if (!ksr.f(xmlPullParser, "BaseURL")) {
                if (ksr.f(xmlPullParser, "AudioChannelConfiguration")) {
                    grlVarE0 = grlVarG0;
                    strA = str5;
                    iY = y(xmlPullParser);
                } else if (ksr.f(xmlPullParser, "SegmentBase")) {
                    strA = str5;
                    iY = iY;
                    grlVarE0 = e0(xmlPullParser, (grl.e) grlVarG0);
                } else {
                    if (ksr.f(xmlPullParser, "SegmentList")) {
                        jZ = z(xmlPullParser, j8);
                        j6 = j7;
                        strA = str5;
                        arrayList = arrayList9;
                        arrayList2 = arrayList7;
                        arrayList3 = arrayList8;
                        grlVarG0 = f0(xmlPullParser, (grl.b) grlVarG0, j, j2, j6, jZ, j5);
                    } else {
                        j6 = j7;
                        strA = str5;
                        arrayList = arrayList9;
                        arrayList2 = arrayList7;
                        arrayList3 = arrayList8;
                        if (ksr.f(xmlPullParser, "SegmentTemplate")) {
                            jZ = z(xmlPullParser, j8);
                            grlVarG0 = g0(xmlPullParser, (grl.c) grlVarG0, list4, j, j2, j6, jZ, j5);
                        } else {
                            arrayList6 = arrayList6;
                            if (ksr.f(xmlPullParser, "ContentProtection")) {
                                Pair<String, DrmInitData.SchemeData> pairD = D(xmlPullParser);
                                Object obj = pairD.first;
                                if (obj != null) {
                                    str6 = (String) obj;
                                }
                                Object obj2 = pairD.second;
                                if (obj2 != null) {
                                    arrayList6.add((DrmInitData.SchemeData) obj2);
                                }
                            } else {
                                if (ksr.f(xmlPullParser, "InbandEventStream")) {
                                    arrayList4 = arrayList2;
                                    arrayList4.add(G(xmlPullParser, "InbandEventStream"));
                                    arrayList5 = arrayList;
                                    arrayList8 = arrayList3;
                                } else {
                                    arrayList4 = arrayList2;
                                    if (ksr.f(xmlPullParser, "EssentialProperty")) {
                                        arrayList8 = arrayList3;
                                        arrayList8.add(G(xmlPullParser, "EssentialProperty"));
                                        arrayList5 = arrayList;
                                    } else {
                                        arrayList8 = arrayList3;
                                        if (ksr.f(xmlPullParser, "SupplementalProperty")) {
                                            arrayList5 = arrayList;
                                            arrayList5.add(G(xmlPullParser, "SupplementalProperty"));
                                        } else {
                                            arrayList5 = arrayList;
                                            u(xmlPullParser);
                                        }
                                    }
                                }
                                iY = iY;
                                j7 = j6;
                                grlVarE0 = grlVarG0;
                            }
                        }
                        j7 = j6;
                        arrayList5 = arrayList;
                        arrayList4 = arrayList2;
                        arrayList8 = arrayList3;
                        grlVarE0 = grlVarG0;
                    }
                    j8 = jZ;
                    j7 = j6;
                    arrayList5 = arrayList;
                    arrayList4 = arrayList2;
                    arrayList8 = arrayList3;
                    grlVarE0 = grlVarG0;
                }
                arrayList4 = arrayList7;
                arrayList5 = arrayList9;
            } else if (z) {
                j6 = j7;
                strA = str5;
                arrayList6 = arrayList6;
                arrayList4 = arrayList7;
                arrayList5 = arrayList9;
                iY = iY;
                j7 = j6;
                grlVarE0 = grlVarG0;
            } else {
                long jZ2 = z(xmlPullParser, j7);
                strA = A(xmlPullParser, str5);
                z = true;
                iY = iY;
                grlVarE0 = grlVarG0;
                j7 = jZ2;
                arrayList4 = arrayList7;
                arrayList5 = arrayList9;
            }
            if (ksr.d(xmlPullParser, "Representation")) {
                break;
            }
            arrayList9 = arrayList5;
            arrayList7 = arrayList4;
            arrayList6 = arrayList6;
            grlVarG0 = grlVarE0;
            iY = iY;
            str5 = strA;
        }
        ArrayList arrayList10 = arrayList4;
        Format formatF = f(attributeValue, strM0, iQ2, iQ3, fO, iY, iQ4, iQ, str4, list, list2, strM1, arrayList8, arrayList5);
        if (grlVarE0 == null) {
            grlVarE0 = new grl.e();
        }
        return new a(formatF, strA, grlVarE0, str6, arrayList6, arrayList10, -1L);
    }

    public int a0(List<mz5> list) {
        int iO0;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            mz5 mz5Var = list.get(i2);
            if (fk1.a("urn:mpeg:dash:role:2011", mz5Var.f27366a)) {
                iO0 = b0(mz5Var.f27367b);
            } else {
                if (fk1.a("urn:tva:metadata:cs:AudioPurposeCS:2007", mz5Var.f27366a)) {
                    iO0 = o0(mz5Var.f27367b);
                }
            }
            i |= iO0;
        }
        return i;
    }

    public final long b(List<grl.d> list, long j, long j2, int i, long j3) {
        int iM = i >= 0 ? i + 1 : (int) wlq.m(j3 - j, j2);
        for (int i2 = 0; i2 < iM; i2++) {
            list.add(m(j, j2));
            j += j2;
        }
        return j;
    }

    public int b0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "subtitle":
            case "forced_subtitle":
                return 128;
            case "description":
                return 512;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return 256;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    public dp0 c(int i, int i2, List<tmk> list, List<mz5> list2, List<mz5> list3, List<mz5> list4) {
        return new dp0(i, i2, list, list2, list3, list4);
    }

    public int c0(List<mz5> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (fk1.a("http://dashif.org/guidelines/trickmode", list.get(i2).f27366a)) {
                i = 16384;
            }
        }
        return i;
    }

    public EventMessage d(String str, String str2, long j, long j2, byte[] bArr) {
        return new EventMessage(str, str2, j2, j, bArr);
    }

    public int d0(List<mz5> list) {
        int iB0 = 0;
        for (int i = 0; i < list.size(); i++) {
            mz5 mz5Var = list.get(i);
            if (fk1.a("urn:mpeg:dash:role:2011", mz5Var.f27366a)) {
                iB0 |= b0(mz5Var.f27367b);
            }
        }
        return iB0;
    }

    public ze8 e(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new ze8(str, str2, j, jArr, eventMessageArr);
    }

    public grl.e e0(XmlPullParser xmlPullParser, grl.e eVar) throws XmlPullParserException, IOException {
        long j;
        long j2;
        long jT = T(xmlPullParser, "timescale", eVar != null ? eVar.f19273b : 1L);
        long jT2 = T(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.c : 0L);
        long j3 = eVar != null ? eVar.d : 0L;
        long j4 = eVar != null ? eVar.e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j2 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j2) + 1;
        } else {
            j = j4;
            j2 = j3;
        }
        tbj tbjVarP = eVar != null ? eVar.f19272a : null;
        do {
            xmlPullParser.next();
            if (ksr.f(xmlPullParser, "Initialization")) {
                tbjVarP = P(xmlPullParser);
            } else {
                u(xmlPullParser);
            }
        } while (!ksr.d(xmlPullParser, "SegmentBase"));
        return n(tbjVarP, jT, jT2, j2, j);
    }

    public Format f(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, List<mz5> list, List<mz5> list2, String str4, List<mz5> list3, List<mz5> list4) {
        int iC;
        String strT = t(str2, str4);
        if ("audio/eac3".equals(strT)) {
            strT = J(list4);
        }
        Format.b bVarV = new Format.b().S(str).K(str2).e0(strT).I(str4).Z(i5).g0(k0(list)).c0(d0(list) | a0(list2) | c0(list3) | c0(list4)).V(str3);
        if (ayf.s(strT)) {
            bVarV.j0(i).Q(i2).P(f);
        } else if (ayf.p(strT)) {
            bVarV.H(i3).f0(i4);
        } else if (ayf.r(strT)) {
            if ("application/cea-608".equals(strT)) {
                iC = B(list2);
            } else {
                iC = "application/cea-708".equals(strT) ? C(list2) : -1;
            }
            bVarV.F(iC);
        }
        return bVarV.E();
    }

    public grl.b f0(XmlPullParser xmlPullParser, grl.b bVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long jT = T(xmlPullParser, "timescale", bVar != null ? bVar.f19273b : 1L);
        long jT2 = T(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.c : 0L);
        long jT3 = T(xmlPullParser, "duration", bVar != null ? bVar.e : -9223372036854775807L);
        long jT4 = T(xmlPullParser, "startNumber", bVar != null ? bVar.d : 1L);
        long jS = s(j3, j4);
        List<grl.d> listH0 = null;
        List<tbj> arrayList = null;
        tbj tbjVarP = null;
        do {
            xmlPullParser.next();
            if (ksr.f(xmlPullParser, "Initialization")) {
                tbjVarP = P(xmlPullParser);
            } else if (ksr.f(xmlPullParser, "SegmentTimeline")) {
                listH0 = h0(xmlPullParser, jT, j2);
            } else if (ksr.f(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(i0(xmlPullParser));
            } else {
                u(xmlPullParser);
            }
        } while (!ksr.d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (tbjVarP == null) {
                tbjVarP = bVar.f19272a;
            }
            if (listH0 == null) {
                listH0 = bVar.f;
            }
            if (arrayList == null) {
                arrayList = bVar.j;
            }
        }
        return k(tbjVarP, jT, jT2, jT4, jT3, listH0, jS, arrayList, j5, j);
    }

    public bk5 g(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, aci aciVar, nlq nlqVar, lyl lylVar, Uri uri, List<uqh> list) {
        return new bk5(j, j2, j3, z, j4, j5, j6, j7, aciVar, nlqVar, lylVar, uri, list);
    }

    public grl.c g0(XmlPullParser xmlPullParser, grl.c cVar, List<mz5> list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long jT = T(xmlPullParser, "timescale", cVar != null ? cVar.f19273b : 1L);
        long jT2 = T(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.c : 0L);
        long jT3 = T(xmlPullParser, "duration", cVar != null ? cVar.e : -9223372036854775807L);
        long jT4 = T(xmlPullParser, "startNumber", cVar != null ? cVar.d : 1L);
        long jS = S(list);
        long jS2 = s(j3, j4);
        List<grl.d> listH0 = null;
        rdq rdqVarP0 = p0(xmlPullParser, Feature.MEDIA, cVar != null ? cVar.f19274k : null);
        rdq rdqVarP1 = p0(xmlPullParser, "initialization", cVar != null ? cVar.j : null);
        tbj tbjVarP = null;
        do {
            xmlPullParser.next();
            if (ksr.f(xmlPullParser, "Initialization")) {
                tbjVarP = P(xmlPullParser);
            } else if (ksr.f(xmlPullParser, "SegmentTimeline")) {
                listH0 = h0(xmlPullParser, jT, j2);
            } else {
                u(xmlPullParser);
            }
        } while (!ksr.d(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (tbjVarP == null) {
                tbjVarP = cVar.f19272a;
            }
            if (listH0 == null) {
                listH0 = cVar.f;
            }
        }
        return l(tbjVarP, jT, jT2, jT4, jS, jT3, listH0, jS2, rdqVarP1, rdqVarP0, j5, j);
    }

    public uqh h(String str, long j, List<dp0> list, List<ze8> list2, mz5 mz5Var) {
        return new uqh(str, j, list, list2, mz5Var);
    }

    public List<grl.d> h0(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jB = 0;
        long jT = -9223372036854775807L;
        boolean z = false;
        int iQ = 0;
        do {
            xmlPullParser.next();
            if (ksr.f(xmlPullParser, "S")) {
                long jT2 = T(xmlPullParser, DeviceTagInterface.CUSTOM_TAG_TYPE, -9223372036854775807L);
                if (z) {
                    jB = b(arrayList, jB, jT, iQ, jT2);
                }
                if (jT2 == -9223372036854775807L) {
                    jT2 = jB;
                }
                jT = T(xmlPullParser, PluginDeviceInfo.FICONOFF, -9223372036854775807L);
                iQ = Q(xmlPullParser, "r", 0);
                z = true;
                jB = jT2;
            } else {
                u(xmlPullParser);
            }
        } while (!ksr.d(xmlPullParser, "SegmentTimeline"));
        if (z) {
            b(arrayList, jB, jT, iQ, wlq.H0(j2, j, 1000L));
        }
        return arrayList;
    }

    public tbj i(String str, long j, long j2) {
        return new tbj(str, j, j2);
    }

    public tbj i0(XmlPullParser xmlPullParser) {
        return Y(xmlPullParser, Feature.MEDIA, "mediaRange");
    }

    public tmk j(a aVar, String str, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<mz5> arrayList2) {
        Format.b bVarA = aVar.f5417a.a();
        if (str != null) {
            bVarA.U(str);
        }
        String str3 = aVar.d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = aVar.e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            bVarA.L(new DrmInitData(str2, arrayList3));
        }
        ArrayList<mz5> arrayList4 = aVar.f;
        arrayList4.addAll(arrayList2);
        return tmk.o(aVar.g, bVarA.E(), aVar.f5418b, aVar.c, arrayList4);
    }

    public int j0(String str) {
        if (str == null) {
            return 0;
        }
        if (str.equals("forced_subtitle")) {
            return 2;
        }
        return !str.equals(FaceSchema.FACE_PAGE_MAIN) ? 0 : 1;
    }

    public grl.b k(tbj tbjVar, long j, long j2, long j3, long j4, List<grl.d> list, long j5, List<tbj> list2, long j6, long j7) {
        return new grl.b(tbjVar, j, j2, j3, j4, list, j5, list2, g83.c(j6), g83.c(j7));
    }

    public int k0(List<mz5> list) {
        int iJ0 = 0;
        for (int i = 0; i < list.size(); i++) {
            mz5 mz5Var = list.get(i);
            if (fk1.a("urn:mpeg:dash:role:2011", mz5Var.f27366a)) {
                iJ0 |= j0(mz5Var.f27367b);
            }
        }
        return iJ0;
    }

    public grl.c l(tbj tbjVar, long j, long j2, long j3, long j4, long j5, List<grl.d> list, long j6, rdq rdqVar, rdq rdqVar2, long j7, long j8) {
        return new grl.c(tbjVar, j, j2, j3, j4, j5, list, j6, rdqVar, rdqVar2, g83.c(j7), g83.c(j8));
    }

    public lyl l0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long jT = -9223372036854775807L;
        long jT2 = -9223372036854775807L;
        long jT3 = -9223372036854775807L;
        float fN = -3.4028235E38f;
        float fN2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (ksr.f(xmlPullParser, "Latency")) {
                jT = T(xmlPullParser, "target", -9223372036854775807L);
                jT2 = T(xmlPullParser, "min", -9223372036854775807L);
                jT3 = T(xmlPullParser, VibrateModeSetFragment.MAX, -9223372036854775807L);
            } else if (ksr.f(xmlPullParser, "PlaybackRate")) {
                fN = N(xmlPullParser, "min", -3.4028235E38f);
                fN2 = N(xmlPullParser, VibrateModeSetFragment.MAX, -3.4028235E38f);
            }
            long j = jT;
            long j2 = jT2;
            long j3 = jT3;
            float f = fN;
            float f2 = fN2;
            if (ksr.d(xmlPullParser, "ServiceDescription")) {
                return new lyl(j, j2, j3, f, f2);
            }
            jT = j;
            jT2 = j2;
            jT3 = j3;
            fN = f;
            fN2 = f2;
        }
    }

    public grl.d m(long j, long j2) {
        return new grl.d(j, j2);
    }

    public grl.e n(tbj tbjVar, long j, long j2, long j3, long j4) {
        return new grl.e(tbjVar, j, j2, j3, j4);
    }

    public nlq o(String str, String str2) {
        return new nlq(str, str2);
    }

    public int o0(String str) {
        if (str == null) {
            return 0;
        }
        byte b2 = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    b2 = 0;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    b2 = 1;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    b2 = 2;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    b2 = 3;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    b2 = 4;
                }
                break;
        }
        switch (b2) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    public rdq p0(XmlPullParser xmlPullParser, String str, rdq rdqVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? rdq.b(attributeValue) : rdqVar;
    }

    public nlq q0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // com.google.android.exoplayer2.upstream.i.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public bk5 a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f5416a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return U(xmlPullParserNewPullParser, uri.toString());
            }
            throw new ParserException("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e2) {
            throw new ParserException(e2);
        }
    }

    public dp0 w(XmlPullParser xmlPullParser, String str, grl grlVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        String str2;
        long j6;
        String str3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList<DrmInitData.SchemeData> arrayList5;
        String str4;
        Object obj;
        ArrayList arrayList6;
        int i;
        ArrayList<mz5> arrayList7;
        long jZ;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int iQ = Q(xmlPullParser2, "id", -1);
        int iE = E(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int iQ2 = Q(xmlPullParser2, "width", -1);
        int iQ3 = Q(xmlPullParser2, "height", -1);
        float fO = O(xmlPullParser2, -1.0f);
        int iQ4 = Q(xmlPullParser2, "audioSamplingRate", -1);
        String str5 = TSMAuthContants.PARAM_LANGUAGE;
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, TSMAuthContants.PARAM_LANGUAGE);
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "label");
        ArrayList<DrmInitData.SchemeData> arrayList8 = new ArrayList<>();
        ArrayList<mz5> arrayList9 = new ArrayList<>();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        String strA = str;
        grl grlVarG0 = grlVar;
        int iP = iE;
        int iY = -1;
        String strQ = attributeValue3;
        String strR = attributeValue4;
        String str6 = null;
        boolean z = false;
        long jZ2 = j2;
        long j7 = j3;
        while (true) {
            xmlPullParser.next();
            if (ksr.f(xmlPullParser2, "BaseURL")) {
                if (z) {
                    j6 = jZ2;
                    arrayList6 = arrayList14;
                    arrayList = arrayList13;
                    arrayList2 = arrayList12;
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList10;
                    arrayList7 = arrayList9;
                    arrayList5 = arrayList8;
                    str4 = str5;
                    i = iP;
                    str2 = strQ;
                    obj = null;
                    str3 = strA;
                    strA = str3;
                    strQ = str2;
                    iP = i;
                } else {
                    jZ2 = z(xmlPullParser2, jZ2);
                    strA = A(xmlPullParser2, strA);
                    z = true;
                    j6 = jZ2;
                    arrayList6 = arrayList14;
                    arrayList = arrayList13;
                    arrayList2 = arrayList12;
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList10;
                    arrayList7 = arrayList9;
                    arrayList5 = arrayList8;
                    str4 = str5;
                    obj = null;
                }
            } else if (ksr.f(xmlPullParser2, "ContentProtection")) {
                Pair<String, DrmInitData.SchemeData> pairD = D(xmlPullParser);
                long j8 = j7;
                Object obj2 = pairD.first;
                if (obj2 != null) {
                    str6 = (String) obj2;
                }
                Object obj3 = pairD.second;
                if (obj3 != null) {
                    arrayList8.add((DrmInitData.SchemeData) obj3);
                }
                j7 = j8;
                j6 = jZ2;
                arrayList6 = arrayList14;
                arrayList = arrayList13;
                arrayList2 = arrayList12;
                arrayList3 = arrayList11;
                arrayList4 = arrayList10;
                arrayList7 = arrayList9;
                arrayList5 = arrayList8;
                str4 = str5;
                obj = null;
            } else {
                long j9 = j7;
                if (ksr.f(xmlPullParser2, "ContentComponent")) {
                    strQ = q(strQ, xmlPullParser2.getAttributeValue(null, str5));
                    iP = p(iP, E(xmlPullParser));
                    j6 = jZ2;
                    arrayList6 = arrayList14;
                    arrayList = arrayList13;
                    arrayList2 = arrayList12;
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList10;
                    arrayList7 = arrayList9;
                    arrayList5 = arrayList8;
                    str4 = str5;
                    obj = null;
                    j7 = j9;
                } else {
                    int i2 = iP;
                    String str7 = strQ;
                    if (ksr.f(xmlPullParser2, "Role")) {
                        arrayList11.add(G(xmlPullParser2, "Role"));
                    } else if (ksr.f(xmlPullParser2, "AudioChannelConfiguration")) {
                        iY = y(xmlPullParser);
                        strQ = str7;
                        j6 = jZ2;
                        arrayList = arrayList13;
                        arrayList2 = arrayList12;
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList10;
                        arrayList7 = arrayList9;
                        arrayList5 = arrayList8;
                        str4 = str5;
                        obj = null;
                        iP = i2;
                        j7 = j9;
                        arrayList6 = arrayList14;
                    } else if (ksr.f(xmlPullParser2, AIApiConstants.Accessibility.NAME)) {
                        arrayList10.add(G(xmlPullParser2, AIApiConstants.Accessibility.NAME));
                    } else if (ksr.f(xmlPullParser2, "EssentialProperty")) {
                        arrayList12.add(G(xmlPullParser2, "EssentialProperty"));
                    } else if (ksr.f(xmlPullParser2, "SupplementalProperty")) {
                        arrayList13.add(G(xmlPullParser2, "SupplementalProperty"));
                    } else if (ksr.f(xmlPullParser2, "Representation")) {
                        j6 = jZ2;
                        arrayList = arrayList13;
                        arrayList2 = arrayList12;
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList10;
                        arrayList5 = arrayList8;
                        str4 = str5;
                        obj = null;
                        a aVarZ = Z(xmlPullParser, strA, attributeValue, attributeValue2, iQ2, iQ3, fO, iY, iQ4, str7, arrayList3, arrayList4, arrayList2, arrayList, grlVarG0, j4, j, j6, j9, j5);
                        int iP2 = p(i2, ayf.l(aVarZ.f5417a.l));
                        arrayList6 = arrayList14;
                        arrayList6.add(aVarZ);
                        xmlPullParser2 = xmlPullParser;
                        strA = strA;
                        arrayList7 = arrayList9;
                        strQ = str7;
                        iP = iP2;
                        j7 = j9;
                    } else {
                        str2 = str7;
                        j6 = jZ2;
                        str3 = strA;
                        arrayList = arrayList13;
                        arrayList2 = arrayList12;
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList10;
                        ArrayList<mz5> arrayList15 = arrayList9;
                        arrayList5 = arrayList8;
                        str4 = str5;
                        obj = null;
                        arrayList6 = arrayList14;
                        xmlPullParser2 = xmlPullParser;
                        if (ksr.f(xmlPullParser2, "SegmentBase")) {
                            grlVarG0 = e0(xmlPullParser2, (grl.e) grlVarG0);
                            strA = str3;
                            arrayList7 = arrayList15;
                            j7 = j9;
                            strQ = str2;
                            iP = i2;
                            xmlPullParser2 = xmlPullParser2;
                        } else {
                            if (ksr.f(xmlPullParser2, "SegmentList")) {
                                jZ = z(xmlPullParser2, j9);
                                i = i2;
                                grlVarG0 = f0(xmlPullParser, (grl.b) grlVarG0, j4, j, j6, jZ, j5);
                            } else {
                                j7 = j9;
                                i = i2;
                                if (ksr.f(xmlPullParser2, "SegmentTemplate")) {
                                    jZ = z(xmlPullParser2, j7);
                                    grlVarG0 = g0(xmlPullParser, (grl.c) grlVarG0, arrayList, j4, j, j6, jZ, j5);
                                } else {
                                    xmlPullParser2 = xmlPullParser2;
                                    if (ksr.f(xmlPullParser2, "InbandEventStream")) {
                                        arrayList7 = arrayList15;
                                        arrayList7.add(G(xmlPullParser2, "InbandEventStream"));
                                    } else {
                                        arrayList7 = arrayList15;
                                        if (ksr.f(xmlPullParser2, "Label")) {
                                            strR = R(xmlPullParser);
                                        } else if (ksr.e(xmlPullParser)) {
                                            x(xmlPullParser);
                                        }
                                    }
                                    strA = str3;
                                    strQ = str2;
                                    iP = i;
                                }
                            }
                            j7 = jZ;
                            strA = str3;
                            arrayList7 = arrayList15;
                            strQ = str2;
                            iP = i;
                        }
                    }
                    str2 = str7;
                    j6 = jZ2;
                    str3 = strA;
                    arrayList = arrayList13;
                    arrayList2 = arrayList12;
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList10;
                    arrayList7 = arrayList9;
                    arrayList5 = arrayList8;
                    str4 = str5;
                    obj = null;
                    i = i2;
                    j7 = j9;
                    arrayList6 = arrayList14;
                    strA = str3;
                    strQ = str2;
                    iP = i;
                }
            }
            if (ksr.d(xmlPullParser2, "AdaptationSet")) {
                break;
            }
            arrayList9 = arrayList7;
            arrayList14 = arrayList6;
            jZ2 = j6;
            arrayList13 = arrayList;
            arrayList12 = arrayList2;
            arrayList11 = arrayList3;
            arrayList10 = arrayList4;
            arrayList8 = arrayList5;
            str5 = str4;
        }
        List<tmk> arrayList16 = new ArrayList<>(arrayList6.size());
        for (int i3 = 0; i3 < arrayList6.size(); i3++) {
            arrayList16.add(j((a) arrayList6.get(i3), strR, str6, arrayList5, arrayList7));
        }
        return c(iQ, iP, arrayList16, arrayList4, arrayList2, arrayList);
    }

    public void x(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        u(xmlPullParser);
    }

    public int y(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strM0 = m0(xmlPullParser, "schemeIdUri", null);
        strM0.hashCode();
        int iQ = -1;
        switch (strM0) {
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                iQ = Q(xmlPullParser, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                iQ = H(xmlPullParser);
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                iQ = V(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!ksr.d(xmlPullParser, "AudioChannelConfiguration"));
        return iQ;
    }

    public long z(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }
}
