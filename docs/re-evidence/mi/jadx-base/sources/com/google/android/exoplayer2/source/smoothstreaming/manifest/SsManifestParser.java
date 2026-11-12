package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.upstream.i;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import defpackage.C3515if;
import defpackage.m34;
import defpackage.nei;
import defpackage.rk1;
import defpackage.smp;
import defpackage.wlq;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes4.dex */
public class SsManifestParser implements i.a<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f8261a;

    public static class MissingFieldException extends ParserException {
        /* JADX WARN: Illegal instructions before constructor call */
        public MissingFieldException(String str) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "Missing required field: ".concat(strValueOf) : new String("Missing required field: "));
        }
    }

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8263b;
        public final a c;
        public final List<Pair<String, Object>> d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.c = aVar;
            this.f8262a = str;
            this.f8263b = str2;
        }

        public void a(Object obj) {
        }

        public abstract Object b();

        public final Object c(String str) {
            for (int i = 0; i < this.d.size(); i++) {
                Pair<String, Object> pair = this.d.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        public boolean d(String str) {
            return false;
        }

        public final a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new c(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new b(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new e(aVar, str2);
            }
            return null;
        }

        public final Object f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f8263b.equals(name)) {
                        n(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a aVarE = e(this, name, this.f8262a);
                            if (aVarE == null) {
                                i = 1;
                            } else {
                                a(aVarE.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        public final boolean g(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z;
        }

        public void h(XmlPullParser xmlPullParser) {
        }

        public final int i(XmlPullParser xmlPullParser, String str, int i) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw new ParserException(e);
            }
        }

        public final long j(XmlPullParser xmlPullParser, String str, long j) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw new ParserException(e);
            }
        }

        public final int k(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new MissingFieldException(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw new ParserException(e);
            }
        }

        public final long l(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new MissingFieldException(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw new ParserException(e);
            }
        }

        public final String m(XmlPullParser xmlPullParser, String str) throws MissingFieldException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new MissingFieldException(str);
        }

        public abstract void n(XmlPullParser xmlPullParser) throws ParserException;

        public void o(XmlPullParser xmlPullParser) {
        }

        public final void p(String str, Object obj) {
            this.d.add(Pair.create(str, obj));
        }
    }

    public static class b extends a {
        public boolean e;
        public UUID f;
        public byte[] g;

        public b(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        public static smp[] q(byte[] bArr) {
            return new smp[]{new smp(true, null, 8, r(bArr), 0, 0, null)};
        }

        public static byte[] r(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArr.length; i += 2) {
                sb.append((char) bArr[i]);
            }
            String string = sb.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            t(bArrDecode, 0, 3);
            t(bArrDecode, 1, 2);
            t(bArrDecode, 4, 5);
            t(bArrDecode, 6, 7);
            return bArrDecode;
        }

        public static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        public static void t(byte[] bArr, int i, int i2) {
            byte b2 = bArr[i];
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            UUID uuid = this.f;
            return new com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0201a(uuid, nei.a(uuid, this.g), q(this.g));
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.e = false;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.e = true;
                this.f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.e) {
                this.g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    public static class c extends a {
        public Format e;

        public c(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        public static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] bArrI = wlq.I(str);
                byte[][] bArrI2 = m34.i(bArrI);
                if (bArrI2 == null) {
                    arrayList.add(bArrI);
                } else {
                    Collections.addAll(arrayList, bArrI2);
                }
            }
            return arrayList;
        }

        public static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE;
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            return this.e;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) throws ParserException {
            int i;
            Format.b bVar = new Format.b();
            String strR = r(m(xmlPullParser, "FourCC"));
            int iIntValue = ((Integer) c("Type")).intValue();
            if (iIntValue == 2) {
                bVar.K("video/mp4").j0(k(xmlPullParser, "MaxWidth")).Q(k(xmlPullParser, "MaxHeight")).T(q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (iIntValue == 1) {
                if (strR == null) {
                    strR = MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE;
                }
                int iK = k(xmlPullParser, "Channels");
                int iK2 = k(xmlPullParser, "SamplingRate");
                List<byte[]> listQ = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (listQ.isEmpty() && MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE.equals(strR)) {
                    listQ = Collections.singletonList(C3515if.a(iK2, iK));
                }
                bVar.K("audio/mp4").H(iK).f0(iK2).T(listQ);
            } else if (iIntValue == 3) {
                String str = (String) c("Subtype");
                if (str == null) {
                    i = 0;
                } else if (str.equals("CAPT")) {
                    i = 64;
                } else if (str.equals("DESC")) {
                    i = 1024;
                } else {
                    i = 0;
                }
                bVar.K("application/mp4").c0(i);
            } else {
                bVar.K("application/mp4");
            }
            this.e = bVar.S(xmlPullParser.getAttributeValue(null, "Index")).U((String) c("Name")).e0(strR).G(k(xmlPullParser, "Bitrate")).V((String) c("Language")).E();
        }
    }

    public static class d extends a {
        public final List<com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b> e;
        public int f;
        public int g;
        public long h;
        public long i;
        public long j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f8264k;
        public boolean l;
        public com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0201a m;

        public d(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f8264k = -1;
            this.m = null;
            this.e = new LinkedList();
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void a(Object obj) {
            if (obj instanceof com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b) {
                this.e.add((com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b) obj);
            } else if (obj instanceof com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0201a) {
                rk1.g(this.m == null);
                this.m = (com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0201a) obj;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            int size = this.e.size();
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b[] bVarArr = new com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b[size];
            this.e.toArray(bVarArr);
            if (this.m != null) {
                com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0201a c0201a = this.m;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(c0201a.f8269a, "video/mp4", c0201a.f8270b));
                for (int i = 0; i < size; i++) {
                    com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = bVarArr[i];
                    int i2 = bVar.f8271a;
                    if (i2 == 2 || i2 == 1) {
                        Format[] formatArr = bVar.j;
                        for (int i3 = 0; i3 < formatArr.length; i3++) {
                            formatArr[i3] = formatArr[i3].a().L(drmInitData).E();
                        }
                    }
                }
            }
            return new com.google.android.exoplayer2.source.smoothstreaming.manifest.a(this.f, this.g, this.h, this.i, this.j, this.f8264k, this.l, this.m, bVarArr);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) throws ParserException {
            this.f = k(xmlPullParser, "MajorVersion");
            this.g = k(xmlPullParser, "MinorVersion");
            this.h = j(xmlPullParser, "TimeScale", 10000000L);
            this.i = l(xmlPullParser, "Duration");
            this.j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f8264k = i(xmlPullParser, "LookaheadCount", -1);
            this.l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.h));
        }
    }

    public static class e extends a {
        public final String e;
        public final List<Format> f;
        public int g;
        public String h;
        public long i;
        public String j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f8265k;
        public int l;
        public int m;
        public int n;
        public int o;
        public String p;
        public ArrayList<Long> q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f8266r;

        public e(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.e = str;
            this.f = new LinkedList();
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void a(Object obj) {
            if (obj instanceof Format) {
                this.f.add((Format) obj);
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            Format[] formatArr = new Format[this.f.size()];
            this.f.toArray(formatArr);
            return new com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b(this.e, this.f8265k, this.g, this.h, this.i, this.j, this.l, this.m, this.n, this.o, this.p, formatArr, this.q, this.f8266r);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public boolean d(String str) {
            return PluginDeviceInfo.FICONON.equals(str);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) throws ParserException {
            if (PluginDeviceInfo.FICONON.equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }

        public final void q(XmlPullParser xmlPullParser) throws ParserException {
            int iS = s(xmlPullParser);
            this.g = iS;
            p("Type", Integer.valueOf(iS));
            if (this.g == 3) {
                this.h = m(xmlPullParser, "Subtype");
            } else {
                this.h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            p("Subtype", this.h);
            this.j = xmlPullParser.getAttributeValue(null, "Name");
            this.f8265k = m(xmlPullParser, "Url");
            this.l = i(xmlPullParser, "MaxWidth", -1);
            this.m = i(xmlPullParser, "MaxHeight", -1);
            this.n = i(xmlPullParser, "DisplayWidth", -1);
            this.o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Language");
            this.p = attributeValue;
            p("Language", attributeValue);
            long jI = i(xmlPullParser, "TimeScale", -1);
            this.i = jI;
            if (jI == -1) {
                this.i = ((Long) c("TimeScale")).longValue();
            }
            this.q = new ArrayList<>();
        }

        public final void r(XmlPullParser xmlPullParser) throws ParserException {
            int size = this.q.size();
            long j = j(xmlPullParser, DeviceTagInterface.CUSTOM_TAG_TYPE, -9223372036854775807L);
            int i = 1;
            if (j == -9223372036854775807L) {
                if (size == 0) {
                    j = 0;
                } else {
                    if (this.f8266r == -1) {
                        throw new ParserException("Unable to infer start time");
                    }
                    j = this.f8266r + this.q.get(size - 1).longValue();
                }
            }
            this.q.add(Long.valueOf(j));
            this.f8266r = j(xmlPullParser, PluginDeviceInfo.FICONOFF, -9223372036854775807L);
            long j2 = j(xmlPullParser, "r", 1L);
            if (j2 > 1 && this.f8266r == -9223372036854775807L) {
                throw new ParserException("Repeated chunk with unspecified duration");
            }
            while (true) {
                long j3 = i;
                if (j3 >= j2) {
                    return;
                }
                this.q.add(Long.valueOf((this.f8266r * j3) + j));
                i++;
            }
        }

        public final int s(XmlPullParser xmlPullParser) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new MissingFieldException("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            StringBuilder sb = new StringBuilder(attributeValue.length() + 19);
            sb.append("Invalid key value[");
            sb.append(attributeValue);
            sb.append("]");
            throw new ParserException(sb.toString());
        }
    }

    public SsManifestParser() {
        try {
            this.f8261a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.i.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.android.exoplayer2.source.smoothstreaming.manifest.a a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f8261a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (com.google.android.exoplayer2.source.smoothstreaming.manifest.a) new d(null, uri.toString()).f(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e2) {
            throw new ParserException(e2);
        }
    }
}
