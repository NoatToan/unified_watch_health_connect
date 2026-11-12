package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.huami.training.ui.course.TrainingFilterListActivity;
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

/* JADX INFO: loaded from: classes3.dex */
public class SsManifestParser implements ParsingLoadable.Parser<SsManifest> {
    private final XmlPullParserFactory a;

    public static class MissingFieldException extends ParserException {
        /* JADX WARN: Illegal instructions before constructor call */
        public MissingFieldException(String fieldName) {
            String strValueOf = String.valueOf(fieldName);
            super(strValueOf.length() != 0 ? "Missing required field: ".concat(strValueOf) : new String("Missing required field: "), null, true, 4);
        }
    }

    public static abstract class a {
        private final String a;
        private final String b;

        @Nullable
        private final a c;
        private final List<Pair<String, Object>> d = new LinkedList();

        public a(@Nullable a parent, String baseUri, String tag) {
            this.c = parent;
            this.a = baseUri;
            this.b = tag;
        }

        private a e(a parent, String name, String baseUri) {
            if (c.f.equals(name)) {
                return new c(parent, baseUri);
            }
            if (b.h.equals(name)) {
                return new b(parent, baseUri);
            }
            if (e.s.equals(name)) {
                return new e(parent, baseUri);
            }
            return null;
        }

        public void a(Object parsedChild) {
        }

        public abstract Object b();

        @Nullable
        public final Object c(String key) {
            for (int i = 0; i < this.d.size(); i++) {
                Pair<String, Object> pair = this.d.get(i);
                if (((String) pair.first).equals(key)) {
                    return pair.second;
                }
            }
            a aVar = this.c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(key);
        }

        public boolean d(String tagName) {
            return false;
        }

        public final Object f(XmlPullParser xmlParser) throws XmlPullParserException, IOException {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlParser.getName();
                    if (this.b.equals(name)) {
                        n(xmlParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (d(name)) {
                            n(xmlParser);
                        } else {
                            a aVarE = e(this, name, this.a);
                            if (aVarE == null) {
                                i = 1;
                            } else {
                                a(aVarE.f(xmlParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        o(xmlParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlParser.getName();
                    h(xmlParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlParser.next();
            }
        }

        public final boolean g(XmlPullParser parser, String key, boolean defaultValue) {
            String attributeValue = parser.getAttributeValue(null, key);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : defaultValue;
        }

        public void h(XmlPullParser xmlParser) {
        }

        public final int i(XmlPullParser parser, String key, int defaultValue) throws ParserException {
            String attributeValue = parser.getAttributeValue(null, key);
            if (attributeValue == null) {
                return defaultValue;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedManifest(null, e);
            }
        }

        public final long j(XmlPullParser parser, String key, long defaultValue) throws ParserException {
            String attributeValue = parser.getAttributeValue(null, key);
            if (attributeValue == null) {
                return defaultValue;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedManifest(null, e);
            }
        }

        public final int k(XmlPullParser parser, String key) throws ParserException {
            String attributeValue = parser.getAttributeValue(null, key);
            if (attributeValue == null) {
                throw new MissingFieldException(key);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedManifest(null, e);
            }
        }

        public final long l(XmlPullParser parser, String key) throws ParserException {
            String attributeValue = parser.getAttributeValue(null, key);
            if (attributeValue == null) {
                throw new MissingFieldException(key);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedManifest(null, e);
            }
        }

        public final String m(XmlPullParser parser, String key) throws MissingFieldException {
            String attributeValue = parser.getAttributeValue(null, key);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new MissingFieldException(key);
        }

        public void n(XmlPullParser xmlParser) throws ParserException {
        }

        public void o(XmlPullParser xmlParser) {
        }

        public final void p(String key, @Nullable Object value) {
            this.d.add(Pair.create(key, value));
        }
    }

    public static class b extends a {
        public static final String h = "Protection";
        public static final String i = "ProtectionHeader";
        public static final String j = "SystemID";
        private static final int k = 8;
        private boolean e;
        private UUID f;
        private byte[] g;

        public b(a parent, String baseUri) {
            super(parent, baseUri, h);
        }

        private static TrackEncryptionBox[] q(byte[] initData) {
            return new TrackEncryptionBox[]{new TrackEncryptionBox(true, null, 8, r(initData), 0, 0, null)};
        }

        private static byte[] r(byte[] initData) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < initData.length; i2 += 2) {
                sb.append((char) initData[i2]);
            }
            String string = sb.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            t(bArrDecode, 0, 3);
            t(bArrDecode, 1, 2);
            t(bArrDecode, 4, 5);
            t(bArrDecode, 6, 7);
            return bArrDecode;
        }

        private static String s(String uuidString) {
            return (uuidString.charAt(0) == '{' && uuidString.charAt(uuidString.length() - 1) == '}') ? uuidString.substring(1, uuidString.length() - 1) : uuidString;
        }

        private static void t(byte[] data, int firstPosition, int secondPosition) {
            byte b = data[firstPosition];
            data[firstPosition] = data[secondPosition];
            data[secondPosition] = b;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            UUID uuid = this.f;
            return new SsManifest.ProtectionElement(uuid, PsshAtomUtil.buildPsshAtom(uuid, this.g), q(this.g));
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public boolean d(String tag) {
            return i.equals(tag);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void h(XmlPullParser parser) {
            if (i.equals(parser.getName())) {
                this.e = false;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser parser) {
            if (i.equals(parser.getName())) {
                this.e = true;
                this.f = UUID.fromString(s(parser.getAttributeValue(null, j)));
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void o(XmlPullParser parser) {
            if (this.e) {
                this.g = Base64.decode(parser.getText(), 0);
            }
        }
    }

    public static class c extends a {
        public static final String f = "QualityLevel";
        private static final String g = "Index";
        private static final String h = "Bitrate";
        private static final String i = "CodecPrivateData";
        private static final String j = "SamplingRate";
        private static final String k = "Channels";
        private static final String l = "FourCC";
        private static final String m = "Type";
        private static final String n = "Subtype";
        private static final String o = "Language";
        private static final String p = "Name";
        private static final String q = "MaxWidth";
        private static final String r = "MaxHeight";
        private Format e;

        public c(a parent, String baseUri) {
            super(parent, baseUri, f);
        }

        private static List<byte[]> q(String codecSpecificDataString) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(codecSpecificDataString)) {
                byte[] bytesFromHexString = Util.getBytesFromHexString(codecSpecificDataString);
                byte[][] bArrSplitNalUnits = CodecSpecificDataUtil.splitNalUnits(bytesFromHexString);
                if (bArrSplitNalUnits == null) {
                    arrayList.add(bytesFromHexString);
                } else {
                    Collections.addAll(arrayList, bArrSplitNalUnits);
                }
            }
            return arrayList;
        }

        @Nullable
        private static String r(String fourCC) {
            if (fourCC.equalsIgnoreCase("H264") || fourCC.equalsIgnoreCase("X264") || fourCC.equalsIgnoreCase("AVC1") || fourCC.equalsIgnoreCase("DAVC")) {
                return MimeTypes.VIDEO_H264;
            }
            if (fourCC.equalsIgnoreCase("AAC") || fourCC.equalsIgnoreCase("AACL") || fourCC.equalsIgnoreCase("AACH") || fourCC.equalsIgnoreCase("AACP")) {
                return MimeTypes.AUDIO_AAC;
            }
            if (fourCC.equalsIgnoreCase("TTML") || fourCC.equalsIgnoreCase("DFXP")) {
                return MimeTypes.APPLICATION_TTML;
            }
            if (fourCC.equalsIgnoreCase("ac-3") || fourCC.equalsIgnoreCase("dac3")) {
                return MimeTypes.AUDIO_AC3;
            }
            if (fourCC.equalsIgnoreCase("ec-3") || fourCC.equalsIgnoreCase("dec3")) {
                return MimeTypes.AUDIO_E_AC3;
            }
            if (fourCC.equalsIgnoreCase("dtsc")) {
                return MimeTypes.AUDIO_DTS;
            }
            if (fourCC.equalsIgnoreCase("dtsh") || fourCC.equalsIgnoreCase("dtsl")) {
                return MimeTypes.AUDIO_DTS_HD;
            }
            if (fourCC.equalsIgnoreCase("dtse")) {
                return MimeTypes.AUDIO_DTS_EXPRESS;
            }
            if (fourCC.equalsIgnoreCase("opus")) {
                return MimeTypes.AUDIO_OPUS;
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            return this.e;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser parser) throws ParserException {
            Format.Builder builder = new Format.Builder();
            String strR = r(m(parser, l));
            int iIntValue = ((Integer) c("Type")).intValue();
            if (iIntValue == 2) {
                builder.setContainerMimeType(MimeTypes.VIDEO_MP4).setWidth(k(parser, q)).setHeight(k(parser, r)).setInitializationData(q(parser.getAttributeValue(null, i)));
            } else if (iIntValue == 1) {
                if (strR == null) {
                    strR = MimeTypes.AUDIO_AAC;
                }
                int iK = k(parser, k);
                int iK2 = k(parser, j);
                List<byte[]> listQ = q(parser.getAttributeValue(null, i));
                if (listQ.isEmpty() && MimeTypes.AUDIO_AAC.equals(strR)) {
                    listQ = Collections.singletonList(AacUtil.buildAacLcAudioSpecificConfig(iK2, iK));
                }
                builder.setContainerMimeType(MimeTypes.AUDIO_MP4).setChannelCount(iK).setSampleRate(iK2).setInitializationData(listQ);
            } else if (iIntValue == 3) {
                int i2 = 0;
                String str = (String) c(n);
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i2 = 64;
                    } else if (str.equals(TrainingFilterListActivity.FILTER_MODE_ORDER_DESC)) {
                        i2 = 1024;
                    }
                }
                builder.setContainerMimeType(MimeTypes.APPLICATION_MP4).setRoleFlags(i2);
            } else {
                builder.setContainerMimeType(MimeTypes.APPLICATION_MP4);
            }
            this.e = builder.setId(parser.getAttributeValue(null, g)).setLabel((String) c("Name")).setSampleMimeType(strR).setAverageBitrate(k(parser, h)).setLanguage((String) c("Language")).build();
        }
    }

    public static class d extends a {
        public static final String n = "SmoothStreamingMedia";
        private static final String o = "MajorVersion";
        private static final String p = "MinorVersion";
        private static final String q = "TimeScale";
        private static final String r = "DVRWindowLength";
        private static final String s = "Duration";
        private static final String t = "LookaheadCount";
        private static final String u = "IsLive";
        private final List<SsManifest.StreamElement> e;
        private int f;
        private int g;
        private long h;
        private long i;
        private long j;
        private int k;
        private boolean l;

        @Nullable
        private SsManifest.ProtectionElement m;

        public d(a parent, String baseUri) {
            super(parent, baseUri, n);
            this.k = -1;
            this.m = null;
            this.e = new LinkedList();
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void a(Object child) {
            if (child instanceof SsManifest.StreamElement) {
                this.e.add((SsManifest.StreamElement) child);
            } else if (child instanceof SsManifest.ProtectionElement) {
                Assertions.checkState(this.m == null);
                this.m = (SsManifest.ProtectionElement) child;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            int size = this.e.size();
            SsManifest.StreamElement[] streamElementArr = new SsManifest.StreamElement[size];
            this.e.toArray(streamElementArr);
            if (this.m != null) {
                SsManifest.ProtectionElement protectionElement = this.m;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(protectionElement.uuid, MimeTypes.VIDEO_MP4, protectionElement.data));
                for (int i = 0; i < size; i++) {
                    SsManifest.StreamElement streamElement = streamElementArr[i];
                    int i2 = streamElement.type;
                    if (i2 == 2 || i2 == 1) {
                        Format[] formatArr = streamElement.formats;
                        for (int i3 = 0; i3 < formatArr.length; i3++) {
                            formatArr[i3] = formatArr[i3].buildUpon().setDrmInitData(drmInitData).build();
                        }
                    }
                }
            }
            return new SsManifest(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, streamElementArr);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser parser) throws ParserException {
            this.f = k(parser, o);
            this.g = k(parser, p);
            this.h = j(parser, q, 10000000L);
            this.i = l(parser, s);
            this.j = j(parser, r, 0L);
            this.k = i(parser, t, -1);
            this.l = g(parser, u, false);
            p(q, Long.valueOf(this.h));
        }
    }

    public static class e extends a {
        private static final String A = "Url";
        private static final String B = "MaxWidth";
        private static final String C = "MaxHeight";
        private static final String D = "DisplayWidth";
        private static final String E = "DisplayHeight";
        private static final String F = "Language";
        private static final String G = "TimeScale";
        private static final String H = "d";
        private static final String I = "t";
        private static final String J = "r";
        public static final String s = "StreamIndex";
        private static final String t = "c";
        private static final String u = "Type";
        private static final String v = "audio";
        private static final String w = "video";
        private static final String x = "text";
        private static final String y = "Subtype";
        private static final String z = "Name";
        private final String e;
        private final List<Format> f;
        private int g;
        private String h;
        private long i;
        private String j;
        private String k;
        private int l;
        private int m;
        private int n;
        private int o;
        private String p;
        private ArrayList<Long> q;
        private long r;

        public e(a parent, String baseUri) {
            super(parent, baseUri, s);
            this.e = baseUri;
            this.f = new LinkedList();
        }

        private void q(XmlPullParser parser) throws ParserException {
            int iS = s(parser);
            this.g = iS;
            p("Type", Integer.valueOf(iS));
            if (this.g == 3) {
                this.h = m(parser, y);
            } else {
                this.h = parser.getAttributeValue(null, y);
            }
            p(y, this.h);
            String attributeValue = parser.getAttributeValue(null, "Name");
            this.j = attributeValue;
            p("Name", attributeValue);
            this.k = m(parser, A);
            this.l = i(parser, B, -1);
            this.m = i(parser, C, -1);
            this.n = i(parser, D, -1);
            this.o = i(parser, E, -1);
            String attributeValue2 = parser.getAttributeValue(null, "Language");
            this.p = attributeValue2;
            p("Language", attributeValue2);
            long jI = i(parser, G, -1);
            this.i = jI;
            if (jI == -1) {
                this.i = ((Long) c(G)).longValue();
            }
            this.q = new ArrayList<>();
        }

        private void r(XmlPullParser parser) throws ParserException {
            int size = this.q.size();
            long j = j(parser, "t", C.TIME_UNSET);
            int i = 1;
            if (j == C.TIME_UNSET) {
                if (size == 0) {
                    j = 0;
                } else {
                    if (this.r == -1) {
                        throw ParserException.createForMalformedManifest("Unable to infer start time", null);
                    }
                    j = this.q.get(size - 1).longValue() + this.r;
                }
            }
            this.q.add(Long.valueOf(j));
            this.r = j(parser, "d", C.TIME_UNSET);
            long j2 = j(parser, J, 1L);
            if (j2 > 1 && this.r == C.TIME_UNSET) {
                throw ParserException.createForMalformedManifest("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j3 = i;
                if (j3 >= j2) {
                    return;
                }
                this.q.add(Long.valueOf((this.r * j3) + j));
                i++;
            }
        }

        private int s(XmlPullParser parser) throws ParserException {
            String attributeValue = parser.getAttributeValue(null, "Type");
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
            throw ParserException.createForMalformedManifest(sb.toString(), null);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void a(Object child) {
            if (child instanceof Format) {
                this.f.add((Format) child);
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            Format[] formatArr = new Format[this.f.size()];
            this.f.toArray(formatArr);
            return new SsManifest.StreamElement(this.e, this.k, this.g, this.h, this.i, this.j, this.l, this.m, this.n, this.o, this.p, formatArr, this.q, this.r);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public boolean d(String tag) {
            return t.equals(tag);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser parser) throws ParserException {
            if (t.equals(parser.getName())) {
                r(parser);
            } else {
                q(parser);
            }
        }
    }

    public SsManifestParser() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public SsManifest parse(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (SsManifest) new d(null, uri.toString()).f(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e2) {
            throw ParserException.createForMalformedManifest(null, e2);
        }
    }
}
