package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.exoplayer2.upstream.i;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.ayf;
import defpackage.cpd;
import defpackage.g83;
import defpackage.gv5;
import defpackage.hdq;
import defpackage.k9c;
import defpackage.nei;
import defpackage.rk1;
import defpackage.toe;
import defpackage.wlq;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class HlsPlaylistParser implements i.a<k9c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f8147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f8148b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern i = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern j = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f8145k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern n = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f8146r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern s = c("CAN-SKIP-DATERANGES");
    public static final Pattern t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern w = c("CAN-BLOCK-RELOAD");
    public static final Pattern x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern A = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern B = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern K = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern L = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern N = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern O = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern P = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern T = c("AUTOSELECT");
    public static final Pattern U = c("DEFAULT");
    public static final Pattern V = c("FORCED");
    public static final Pattern W = c("INDEPENDENT");
    public static final Pattern X = c("GAP");
    public static final Pattern Y = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern Z = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern a0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class DeltaUpdateException extends IOException {
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BufferedReader f8149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Queue<String> f8150b;
        public String c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f8150b = queue;
            this.f8149a = bufferedReader;
        }

        public boolean a() throws IOException {
            String strTrim;
            if (this.c != null) {
                return true;
            }
            if (!this.f8150b.isEmpty()) {
                this.c = (String) rk1.e(this.f8150b.poll());
                return true;
            }
            do {
                String line = this.f8149a.readLine();
                this.c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String b() throws IOException {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.c;
            this.c = null;
            return str;
        }
    }

    public HlsPlaylistParser() {
        this(b.n, null);
    }

    public static String A(String str, Map<String, String> map) {
        Matcher matcher = a0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static int B(BufferedReader bufferedReader, boolean z2, int i2) throws IOException {
        while (i2 != -1 && Character.isWhitespace(i2) && (z2 || !wlq.p0(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    public static boolean b(BufferedReader bufferedReader) throws IOException {
        int i2 = bufferedReader.read();
        if (i2 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i2 = bufferedReader.read();
        }
        int iB = B(bufferedReader, true, i2);
        for (int i3 = 0; i3 < 7; i3++) {
            if (iB != "#EXTM3U".charAt(i3)) {
                return false;
            }
            iB = bufferedReader.read();
        }
        return wlq.p0(B(bufferedReader, false, iB));
    }

    public static Pattern c(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9);
        sb.append(str);
        sb.append("=(");
        sb.append("NO");
        sb.append("|");
        sb.append("YES");
        sb.append(")");
        return Pattern.compile(sb.toString());
    }

    public static DrmInitData d(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i2 = 0; i2 < schemeDataArr.length; i2++) {
            schemeDataArr2[i2] = schemeDataArr[i2].c(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    public static String e(long j2, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j2);
    }

    public static b.C0193b f(ArrayList<b.C0193b> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            b.C0193b c0193b = arrayList.get(i2);
            if (str.equals(c0193b.d)) {
                return c0193b;
            }
        }
        return null;
    }

    public static b.C0193b g(ArrayList<b.C0193b> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            b.C0193b c0193b = arrayList.get(i2);
            if (str.equals(c0193b.e)) {
                return c0193b;
            }
        }
        return null;
    }

    public static b.C0193b h(ArrayList<b.C0193b> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            b.C0193b c0193b = arrayList.get(i2);
            if (str.equals(c0193b.c)) {
                return c0193b;
            }
        }
        return null;
    }

    public static double j(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(z(str, pattern, Collections.emptyMap()));
    }

    public static DrmInitData.SchemeData k(String str, String str2, Map<String, String> map) throws ParserException {
        String strU = u(str, J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strZ = z(str, K, map);
            return new DrmInitData.SchemeData(g83.d, "video/mp4", Base64.decode(strZ.substring(strZ.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(g83.d, "hls", wlq.i0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strU)) {
            return null;
        }
        String strZ2 = z(str, K, map);
        byte[] bArrDecode = Base64.decode(strZ2.substring(strZ2.indexOf(44)), 0);
        UUID uuid = g83.e;
        return new DrmInitData.SchemeData(uuid, "video/mp4", nei.a(uuid, bArrDecode));
    }

    public static String l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    public static int m(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(z(str, pattern, Collections.emptyMap()));
    }

    public static long n(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:80:0x0335  */
    public static b o(a aVar, String str) throws IOException {
        Uri uri;
        ArrayList arrayList;
        String strG;
        ArrayList arrayList2;
        int i2;
        String str2;
        String strG2;
        int i3;
        int i4;
        int i5;
        Uri uriD;
        HashMap map;
        int i6;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            String str3 = "application/x-mpegURL";
            if (!aVar.a()) {
                HashMap map4 = map2;
                ArrayList arrayList11 = arrayList4;
                ArrayList arrayList12 = arrayList5;
                ArrayList arrayList13 = arrayList6;
                ArrayList arrayList14 = arrayList7;
                ArrayList arrayList15 = arrayList8;
                ArrayList arrayList16 = arrayList10;
                ArrayList arrayList17 = arrayList9;
                boolean z4 = z2;
                ArrayList arrayList18 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i7 = 0;
                while (true) {
                    uri = null;
                    if (i7 >= arrayList3.size()) {
                        break;
                    }
                    b.C0193b c0193b = (b.C0193b) arrayList3.get(i7);
                    if (hashSet.add(c0193b.f8160a)) {
                        rk1.g(c0193b.f8161b.j == null);
                        i3 = 1;
                        arrayList18.add(c0193b.a(c0193b.f8161b.a().X(new Metadata(new HlsTrackMetadataEntry(null, null, (List) rk1.e((ArrayList) map4.get(c0193b.f8160a))))).E()));
                    } else {
                        i3 = 1;
                    }
                    i7 += i3;
                }
                ArrayList arrayList19 = null;
                Format formatE = null;
                int i8 = 0;
                while (i8 < arrayList15.size()) {
                    ArrayList arrayList20 = arrayList15;
                    String str4 = (String) arrayList20.get(i8);
                    String strZ = z(str4, Q, map3);
                    String strZ2 = z(str4, P, map3);
                    Format.b bVar = new Format.b();
                    StringBuilder sb = new StringBuilder(String.valueOf(strZ).length() + 1 + String.valueOf(strZ2).length());
                    sb.append(strZ);
                    sb.append(":");
                    sb.append(strZ2);
                    Format.b bVarV = bVar.S(sb.toString()).U(strZ2).K(str3).g0(x(str4)).c0(w(str4, map3)).V(v(str4, O, map3));
                    String strV = v(str4, K, map3);
                    Uri uriD2 = strV == null ? uri : hdq.d(str, strV);
                    String str5 = str3;
                    arrayList15 = arrayList20;
                    Metadata metadata = new Metadata(new HlsTrackMetadataEntry(strZ, strZ2, Collections.emptyList()));
                    String strZ3 = z(str4, M, map3);
                    strZ3.hashCode();
                    switch (strZ3) {
                        case "SUBTITLES":
                            arrayList = arrayList12;
                            b.C0193b c0193bG = g(arrayList3, strZ);
                            if (c0193bG != null) {
                                String strK = wlq.K(c0193bG.f8161b.i, 3);
                                bVarV.I(strK);
                                strG = ayf.g(strK);
                            } else {
                                strG = null;
                            }
                            if (strG == null) {
                                strG = "text/vtt";
                            }
                            bVarV.e0(strG).X(metadata);
                            if (uriD2 == null) {
                                arrayList2 = arrayList13;
                                toe.h("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            } else {
                                b.a aVar2 = new b.a(uriD2, bVarV.E(), strZ, strZ2);
                                arrayList2 = arrayList13;
                                arrayList2.add(aVar2);
                                break;
                            }
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList = arrayList12;
                            String strZ4 = z(str4, S, map3);
                            if (strZ4.startsWith("CC")) {
                                i2 = Integer.parseInt(strZ4.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i2 = Integer.parseInt(strZ4.substring(7));
                                str2 = "application/cea-708";
                            }
                            if (arrayList19 == null) {
                                arrayList19 = new ArrayList();
                            }
                            bVarV.e0(str2).F(i2);
                            arrayList19.add(bVarV.E());
                            arrayList2 = arrayList13;
                            break;
                        case "AUDIO":
                            arrayList11 = arrayList11;
                            b.C0193b c0193bF = f(arrayList3, strZ);
                            if (c0193bF != null) {
                                String strK2 = wlq.K(c0193bF.f8161b.i, 1);
                                bVarV.I(strK2);
                                strG2 = ayf.g(strK2);
                            } else {
                                strG2 = null;
                            }
                            String strV2 = v(str4, i, map3);
                            if (strV2 != null) {
                                bVarV.H(Integer.parseInt(wlq.N0(strV2, "/")[0]));
                                if ("audio/eac3".equals(strG2) && strV2.endsWith("/JOC")) {
                                    strG2 = "audio/eac3-joc";
                                }
                            }
                            bVarV.e0(strG2);
                            if (uriD2 != null) {
                                bVarV.X(metadata);
                                arrayList = arrayList12;
                                arrayList.add(new b.a(uriD2, bVarV.E(), strZ, strZ2));
                            } else {
                                arrayList = arrayList12;
                                if (c0193bF != null) {
                                    formatE = bVarV.E();
                                }
                            }
                            arrayList2 = arrayList13;
                            break;
                        case "VIDEO":
                            b.C0193b c0193bH = h(arrayList3, strZ);
                            if (c0193bH != null) {
                                Format format = c0193bH.f8161b;
                                String strK3 = wlq.K(format.i, 2);
                                bVarV.I(strK3).e0(ayf.g(strK3)).j0(format.q).Q(format.f7818r).P(format.s);
                            }
                            if (uriD2 != null) {
                                bVarV.X(metadata);
                                arrayList11.add(new b.a(uriD2, bVarV.E(), strZ, strZ2));
                                break;
                            }
                        default:
                            arrayList2 = arrayList13;
                            arrayList = arrayList12;
                            break;
                    }
                    i8++;
                    arrayList12 = arrayList;
                    arrayList13 = arrayList2;
                    str3 = str5;
                    uri = null;
                }
                return new b(str, arrayList16, arrayList18, arrayList11, arrayList12, arrayList13, arrayList14, formatE, z3 ? Collections.emptyList() : arrayList19, z4, map3, arrayList17);
            }
            String strB = aVar.b();
            if (strB.startsWith("#EXT")) {
                arrayList10.add(strB);
            }
            boolean zStartsWith = strB.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            boolean z5 = z2;
            if (strB.startsWith("#EXT-X-DEFINE")) {
                map3.put(z(strB, P, map3), z(strB, Y, map3));
            } else {
                if (strB.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    map = map2;
                    arrayList5 = arrayList5;
                    arrayList6 = arrayList6;
                    z2 = true;
                } else if (strB.startsWith("#EXT-X-MEDIA")) {
                    arrayList8.add(strB);
                } else if (strB.startsWith("#EXT-X-SESSION-KEY")) {
                    DrmInitData.SchemeData schemeDataK = k(strB, u(strB, I, HTTP.IDENTITY_CODING, map3), map3);
                    if (schemeDataK != null) {
                        arrayList9.add(new DrmInitData(l(z(strB, H, map3)), schemeDataK));
                    }
                } else if (strB.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    boolean zContains = z3 | strB.contains("CLOSED-CAPTIONS=NONE");
                    int i9 = zStartsWith ? 16384 : 0;
                    int iM = m(strB, h);
                    int iS = s(strB, c, -1);
                    String strV3 = v(strB, j, map3);
                    String strV4 = v(strB, f8145k, map3);
                    if (strV4 != null) {
                        String[] strArrM0 = wlq.M0(strV4, "x");
                        int i10 = Integer.parseInt(strArrM0[0]);
                        int i11 = Integer.parseInt(strArrM0[1]);
                        if (i10 <= 0 || i11 <= 0) {
                            i11 = -1;
                            i6 = -1;
                        } else {
                            i6 = i10;
                        }
                        i5 = i11;
                        i4 = i6;
                    } else {
                        i4 = -1;
                        i5 = -1;
                    }
                    String strV5 = v(strB, l, map3);
                    float f2 = strV5 != null ? Float.parseFloat(strV5) : -1.0f;
                    String strV6 = v(strB, d, map3);
                    String strV7 = v(strB, e, map3);
                    HashMap map5 = map2;
                    String strV8 = v(strB, f, map3);
                    String strV9 = v(strB, g, map3);
                    if (zStartsWith) {
                        uriD = hdq.d(str, z(strB, K, map3));
                    } else {
                        if (!aVar.a()) {
                            throw new ParserException("#EXT-X-STREAM-INF must be followed by another line");
                        }
                        uriD = hdq.d(str, A(aVar.b(), map3));
                    }
                    arrayList3.add(new b.C0193b(uriD, new Format.b().R(arrayList3.size()).K("application/x-mpegURL").I(strV3).G(iS).Z(iM).j0(i4).Q(i5).P(f2).c0(i9).E(), strV6, strV7, strV8, strV9));
                    map = map5;
                    ArrayList arrayList21 = (ArrayList) map.get(uriD);
                    if (arrayList21 == null) {
                        arrayList21 = new ArrayList();
                        map.put(uriD, arrayList21);
                    }
                    arrayList21.add(new HlsTrackMetadataEntry.VariantInfo(iS, iM, strV6, strV7, strV8, strV9));
                    z2 = z5;
                    z3 = zContains;
                }
                map2 = map;
                arrayList9 = arrayList9;
                arrayList7 = arrayList7;
                arrayList10 = arrayList10;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
                arrayList4 = arrayList4;
                arrayList8 = arrayList8;
            }
            map = map2;
            arrayList5 = arrayList5;
            arrayList6 = arrayList6;
            z2 = z5;
            map2 = map;
            arrayList9 = arrayList9;
            arrayList7 = arrayList7;
            arrayList10 = arrayList10;
            arrayList6 = arrayList6;
            arrayList5 = arrayList5;
            arrayList4 = arrayList4;
            arrayList8 = arrayList8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0303 A[PHI: r78
      0x0303: PHI (r78v18 java.lang.String) = (r78v16 java.lang.String), (r78v1 java.lang.String) binds: [B:119:0x0316, B:111:0x02f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static c p(b bVar, c cVar, a aVar, String str) throws IOException {
        String str2;
        HashMap map;
        String str3;
        char c2;
        boolean z2;
        long j2;
        c.d dVar;
        char c3;
        DrmInitData drmInitData;
        long j3;
        String strZ;
        bVar = bVar;
        cVar = cVar;
        boolean z3 = bVar.c;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap map4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        c.f fVar = new c.f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        char c4 = 0;
        String str4 = "";
        boolean z4 = z3;
        c.f fVarY = fVar;
        boolean z5 = false;
        int i2 = 0;
        int i3 = 0;
        boolean z6 = false;
        boolean z7 = 0;
        int i4 = 0;
        boolean z8 = false;
        String strU = "";
        long j4 = -9223372036854775807L;
        long jC = 0;
        long j5 = 0;
        int iM = 1;
        long jM = -9223372036854775807L;
        long j6 = -9223372036854775807L;
        DrmInitData drmInitDataD = null;
        long j7 = 0;
        DrmInitData drmInitData2 = null;
        long j8 = 0;
        c.b bVar2 = null;
        String str5 = null;
        long j9 = -1;
        String str6 = null;
        String strL = null;
        long j10 = 0;
        long jN = 0;
        c.d dVar2 = null;
        long j11 = 0;
        long j12 = 0;
        while (aVar.a()) {
            String strB = aVar.b();
            if (strB.startsWith("#EXT")) {
                arrayList3.add(strB);
            }
            if (strB.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strZ2 = z(strB, q, map2);
                if ("VOD".equals(strZ2)) {
                    i2 = 1;
                } else if ("EVENT".equals(strZ2)) {
                    i2 = 2;
                }
            } else if (strB.equals("#EXT-X-I-FRAMES-ONLY")) {
                z8 = true;
            } else if (strB.startsWith("#EXT-X-START")) {
                j4 = (long) (j(strB, C) * 1000000.0d);
            } else if (strB.startsWith("#EXT-X-SERVER-CONTROL")) {
                fVarY = y(strB);
            } else if (strB.startsWith("#EXT-X-PART-INF")) {
                j6 = (long) (j(strB, o) * 1000000.0d);
            } else if (strB.startsWith("#EXT-X-MAP")) {
                String strZ3 = z(strB, K, map2);
                String strV = v(strB, E, map2);
                if (strV != null) {
                    String[] strArrM0 = wlq.M0(strV, gv5.CONNECT_VALUE_STR);
                    j9 = Long.parseLong(strArrM0[c4]);
                    if (strArrM0.length > 1) {
                        j7 = Long.parseLong(strArrM0[1]);
                    }
                }
                String str7 = str5;
                if (j9 == -1) {
                    j7 = 0;
                }
                String str8 = str6;
                if (str7 != null && str8 == null) {
                    throw new ParserException("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                }
                dVar2 = new c.d(strZ3, j7, j9, str7, str8);
                if (j9 != -1) {
                    j7 += j9;
                }
                str6 = str8;
                str5 = str7;
                j9 = -1;
            } else {
                str5 = str5;
                String str9 = str6;
                if (strB.startsWith("#EXT-X-TARGETDURATION")) {
                    jM = FolmeCore.NANOS_TO_MS * ((long) m(strB, m));
                } else if (strB.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                    jN = n(strB, x);
                    j5 = jN;
                    str6 = str9;
                    c4 = 0;
                } else if (strB.startsWith("#EXT-X-VERSION")) {
                    iM = m(strB, p);
                } else {
                    if (strB.startsWith("#EXT-X-DEFINE")) {
                        String strV2 = v(strB, Z, map2);
                        if (strV2 != null) {
                            String str10 = bVar.l.get(strV2);
                            if (str10 != null) {
                                map2.put(strV2, str10);
                            }
                        } else {
                            map2.put(z(strB, P, map2), z(strB, Y, map2));
                        }
                        str2 = str4;
                        map = map4;
                        str3 = strL;
                    } else if (strB.startsWith("#EXTINF")) {
                        long j13 = (long) (j(strB, y) * 1000000.0d);
                        strU = u(strB, z, str4, map2);
                        bVar = bVar;
                        j11 = j13;
                    } else {
                        if (strB.startsWith("#EXT-X-SKIP")) {
                            int iM2 = m(strB, t);
                            rk1.g(cVar != null && arrayList.isEmpty());
                            int i5 = (int) (j5 - ((c) wlq.j(cVar)).i);
                            int i6 = iM2 + i5;
                            if (i5 < 0 || i6 > cVar.p.size()) {
                                throw new DeltaUpdateException();
                            }
                            String str11 = str4;
                            long j14 = j10;
                            str6 = str9;
                            while (i5 < i6) {
                                c.d dVarB = cVar.p.get(i5);
                                HashMap map5 = map4;
                                if (j5 != cVar.i) {
                                    dVarB = dVarB.b(j14, (cVar.h - i3) + dVarB.d);
                                }
                                arrayList.add(dVarB);
                                j14 += dVarB.c;
                                long j15 = dVarB.j;
                                int i7 = i6;
                                if (j15 != -1) {
                                    j7 = dVarB.i + j15;
                                }
                                int i8 = dVarB.d;
                                c.d dVar3 = dVarB.f8167b;
                                DrmInitData drmInitData3 = dVarB.f;
                                String str12 = dVarB.g;
                                String str13 = dVarB.h;
                                if (str13 == null || !str13.equals(Long.toHexString(jN))) {
                                    str6 = dVarB.h;
                                }
                                jN++;
                                i5++;
                                cVar = cVar;
                                j8 = j14;
                                i4 = i8;
                                i6 = i7;
                                dVar2 = dVar3;
                                drmInitData2 = drmInitData3;
                                str5 = str12;
                                map4 = map5;
                            }
                            bVar = bVar;
                            cVar = cVar;
                            j10 = j14;
                            str5 = str5;
                            str4 = str11;
                        } else {
                            str2 = str4;
                            map = map4;
                            if (strB.startsWith("#EXT-X-KEY")) {
                                String strZ4 = z(strB, H, map2);
                                String strU2 = u(strB, I, HTTP.IDENTITY_CODING, map2);
                                if ("NONE".equals(strZ4)) {
                                    treeMap.clear();
                                    strZ = null;
                                    drmInitData2 = null;
                                    str6 = null;
                                } else {
                                    String strV3 = v(strB, L, map2);
                                    if (!HTTP.IDENTITY_CODING.equals(strU2)) {
                                        String str14 = strL;
                                        strL = str14 == null ? l(strZ4) : str14;
                                        DrmInitData.SchemeData schemeDataK = k(strB, strU2, map2);
                                        if (schemeDataK != null) {
                                            treeMap.put(strU2, schemeDataK);
                                            str6 = strV3;
                                            strZ = null;
                                            drmInitData2 = null;
                                        } else {
                                            str6 = strV3;
                                            strZ = null;
                                        }
                                    } else if ("AES-128".equals(strZ4)) {
                                        strZ = z(strB, K, map2);
                                        str6 = strV3;
                                    } else {
                                        str6 = strV3;
                                        strZ = null;
                                    }
                                }
                                cVar = cVar;
                                str5 = strZ;
                                str4 = str2;
                                map4 = map;
                                c4 = 0;
                                bVar = bVar;
                            } else {
                                str3 = strL;
                                if (strB.startsWith("#EXT-X-BYTERANGE")) {
                                    String[] strArrM1 = wlq.M0(z(strB, D, map2), gv5.CONNECT_VALUE_STR);
                                    j9 = Long.parseLong(strArrM1[0]);
                                    if (strArrM1.length > 1) {
                                        j7 = Long.parseLong(strArrM1[1]);
                                    }
                                } else if (strB.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    i3 = Integer.parseInt(strB.substring(strB.indexOf(58) + 1));
                                    bVar = bVar;
                                    cVar = cVar;
                                    strL = str3;
                                    str5 = str5;
                                    str6 = str9;
                                    str4 = str2;
                                    map4 = map;
                                    z5 = true;
                                } else if (strB.equals("#EXT-X-DISCONTINUITY")) {
                                    i4++;
                                } else if (strB.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                    if (jC == 0) {
                                        jC = g83.c(wlq.C0(strB.substring(strB.indexOf(58) + 1))) - j10;
                                    }
                                } else if (strB.equals("#EXT-X-GAP")) {
                                    bVar = bVar;
                                    cVar = cVar;
                                    strL = str3;
                                    str5 = str5;
                                    str6 = str9;
                                    str4 = str2;
                                    map4 = map;
                                    c4 = 0;
                                    z7 = 1;
                                } else if (strB.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                    bVar = bVar;
                                    cVar = cVar;
                                    strL = str3;
                                    str5 = str5;
                                    str6 = str9;
                                    str4 = str2;
                                    map4 = map;
                                    c4 = 0;
                                    z4 = true;
                                } else if (strB.equals("#EXT-X-ENDLIST")) {
                                    bVar = bVar;
                                    cVar = cVar;
                                    strL = str3;
                                    str5 = str5;
                                    str6 = str9;
                                    str4 = str2;
                                    map4 = map;
                                    c4 = 0;
                                    z6 = true;
                                } else if (strB.startsWith("#EXT-X-RENDITION-REPORT")) {
                                    long jT = t(strB, A, (j5 + ((long) arrayList.size())) - (arrayList2.isEmpty() ? 1L : 0L));
                                    int iS = s(strB, B, j6 != -9223372036854775807L ? (arrayList2.isEmpty() ? ((c.d) cpd.f(arrayList)).m : arrayList2).size() - 1 : -1);
                                    Uri uri = Uri.parse(hdq.c(str, z(strB, K, map2)));
                                    map.put(uri, new c.C0194c(uri, jT, iS));
                                    arrayList3 = arrayList3;
                                    bVar2 = bVar2;
                                    c2 = 0;
                                    z2 = z5;
                                    jN = jN;
                                    strL = str3;
                                    c4 = c2;
                                    z5 = z2;
                                    arrayList3 = arrayList3;
                                    bVar2 = bVar2;
                                    str6 = str9;
                                    str4 = str2;
                                    z7 = z7;
                                    map4 = map;
                                } else {
                                    if (strB.startsWith("#EXT-X-PRELOAD-HINT")) {
                                        c.b bVar3 = bVar2;
                                        if (bVar3 == null && "PART".equals(z(strB, N, map2))) {
                                            String strZ5 = z(strB, K, map2);
                                            c.b bVar4 = bVar3;
                                            long jT2 = t(strB, F, -1L);
                                            long jT3 = t(strB, G, -1L);
                                            long j16 = jN;
                                            String strE = e(j16, str5, str9);
                                            if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                DrmInitData drmInitData4 = new DrmInitData(str3, schemeDataArr);
                                                if (drmInitDataD == null) {
                                                    drmInitDataD = d(str3, schemeDataArr);
                                                }
                                                drmInitData2 = drmInitData4;
                                            }
                                            if (jT2 == -1 || jT3 != -1) {
                                                bVar4 = new c.b(strZ5, dVar2, 0L, i4, j8, drmInitData2, str5, strE, jT2 != -1 ? jT2 : 0L, jT3, false, false, true);
                                            }
                                            bVar2 = bVar4;
                                            jN = j16;
                                            strL = str3;
                                            str5 = str5;
                                            str6 = str9;
                                            str4 = str2;
                                            map4 = map;
                                            c4 = 0;
                                            bVar = bVar;
                                            cVar = cVar;
                                        } else {
                                            map = map;
                                            bVar2 = bVar3;
                                            z2 = z5;
                                            arrayList3 = arrayList3;
                                            jN = jN;
                                            str9 = str9;
                                        }
                                    } else {
                                        map = map;
                                        bVar2 = bVar2;
                                        long j17 = jN;
                                        str9 = str9;
                                        z2 = z5;
                                        if (strB.startsWith("#EXT-X-PART")) {
                                            String strE2 = e(j17, str5, str9);
                                            String strZ6 = z(strB, K, map2);
                                            long j18 = (long) (j(strB, n) * 1000000.0d);
                                            ArrayList arrayList4 = arrayList3;
                                            boolean zQ = q(strB, W, false) | (z4 && arrayList2.isEmpty());
                                            boolean zQ2 = q(strB, X, false);
                                            String strV4 = v(strB, E, map2);
                                            if (strV4 != null) {
                                                String[] strArrM2 = wlq.M0(strV4, gv5.CONNECT_VALUE_STR);
                                                j3 = Long.parseLong(strArrM2[0]);
                                                if (strArrM2.length > 1) {
                                                    j12 = Long.parseLong(strArrM2[1]);
                                                }
                                            } else {
                                                j3 = -1;
                                            }
                                            if (j3 == -1) {
                                                j12 = 0;
                                            }
                                            if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                DrmInitData drmInitData5 = new DrmInitData(str3, schemeDataArr2);
                                                if (drmInitDataD == null) {
                                                    drmInitDataD = d(str3, schemeDataArr2);
                                                }
                                                drmInitData2 = drmInitData5;
                                            }
                                            arrayList2.add(new c.b(strZ6, dVar2, j18, i4, j8, drmInitData2, str5, strE2, j12, j3, zQ2, zQ, false));
                                            j8 += j18;
                                            if (j3 != -1) {
                                                j12 += j3;
                                            }
                                            strL = str3;
                                            jN = j17;
                                            z5 = z2;
                                            arrayList3 = arrayList4;
                                            c4 = 0;
                                            bVar2 = bVar2;
                                            str6 = str9;
                                            str4 = str2;
                                            z7 = z7;
                                        } else {
                                            arrayList3 = arrayList3;
                                            if (strB.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX)) {
                                                jN = j17;
                                            } else {
                                                String strE3 = e(j17, str5, str9);
                                                jN = j17 + 1;
                                                String strA = A(strB, map2);
                                                c.d dVar4 = (c.d) map3.get(strA);
                                                if (j9 == -1) {
                                                    j2 = 0;
                                                } else {
                                                    if (z8 && dVar2 == null && dVar4 == null) {
                                                        dVar4 = new c.d(strA, 0L, j7, null, null);
                                                        map3.put(strA, dVar4);
                                                    }
                                                    j2 = j7;
                                                }
                                                if (drmInitData2 != null || treeMap.isEmpty()) {
                                                    dVar = dVar4;
                                                    c3 = 0;
                                                    drmInitData = drmInitData2;
                                                } else {
                                                    dVar = dVar4;
                                                    c3 = 0;
                                                    DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    drmInitData = new DrmInitData(str3, schemeDataArr3);
                                                    if (drmInitDataD == null) {
                                                        drmInitDataD = d(str3, schemeDataArr3);
                                                    }
                                                }
                                                arrayList.add(new c.d(strA, dVar2 != null ? dVar2 : dVar, strU, j11, i4, j10, drmInitData, str5, strE3, j2, j9, z7, arrayList2));
                                                j8 = j10 + j11;
                                                arrayList2 = new ArrayList();
                                                if (j9 != -1) {
                                                    j2 += j9;
                                                }
                                                j7 = j2;
                                                bVar = bVar;
                                                cVar = cVar;
                                                strL = str3;
                                                drmInitData2 = drmInitData;
                                                c4 = c3;
                                                z7 = c4;
                                                str5 = str5;
                                                j10 = j8;
                                                z5 = z2;
                                                j9 = -1;
                                                arrayList3 = arrayList3;
                                                strU = str2;
                                                j11 = 0;
                                                bVar2 = bVar2;
                                                str6 = str9;
                                                str4 = strU;
                                            }
                                        }
                                        map4 = map;
                                    }
                                    c2 = 0;
                                    jN = jN;
                                    strL = str3;
                                    c4 = c2;
                                    z5 = z2;
                                    arrayList3 = arrayList3;
                                    bVar2 = bVar2;
                                    str6 = str9;
                                    str4 = str2;
                                    z7 = z7;
                                    map4 = map;
                                }
                                bVar = bVar;
                                cVar = cVar;
                                strL = str3;
                                str5 = str5;
                                str6 = str9;
                                str4 = str2;
                                map4 = map;
                            }
                        }
                        c4 = 0;
                    }
                    c2 = 0;
                    z2 = z5;
                    jN = jN;
                    strL = str3;
                    c4 = c2;
                    z5 = z2;
                    arrayList3 = arrayList3;
                    bVar2 = bVar2;
                    str6 = str9;
                    str4 = str2;
                    z7 = z7;
                    map4 = map;
                }
                str6 = str9;
                c4 = 0;
            }
        }
        ArrayList arrayList5 = arrayList3;
        char c5 = c4;
        HashMap map6 = map4;
        c.b bVar5 = bVar2;
        boolean z9 = z5;
        if (bVar5 != null) {
            arrayList2.add(bVar5);
        }
        return new c(i2, str, arrayList5, j4, jC, z9, i3, j5, iM, jM, j6, z4, z6, jC != 0 ? (char) 1 : c5, drmInitDataD, arrayList, arrayList2, fVarY, map6);
    }

    public static boolean q(String str, Pattern pattern, boolean z2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z2;
    }

    public static double r(String str, Pattern pattern, double d2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) rk1.e(matcher.group(1))) : d2;
    }

    public static int s(String str, Pattern pattern, int i2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) rk1.e(matcher.group(1))) : i2;
    }

    public static long t(String str, Pattern pattern, long j2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) rk1.e(matcher.group(1))) : j2;
    }

    public static String u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) rk1.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : A(str2, map);
    }

    public static String v(String str, Pattern pattern, Map<String, String> map) {
        return u(str, pattern, null, map);
    }

    public static int w(String str, Map<String, String> map) {
        String strV = v(str, R, map);
        if (TextUtils.isEmpty(strV)) {
            return 0;
        }
        String[] strArrM0 = wlq.M0(strV, ",");
        int i2 = wlq.t(strArrM0, "public.accessibility.describes-video") ? 512 : 0;
        if (wlq.t(strArrM0, "public.accessibility.transcribes-spoken-dialog")) {
            i2 |= 4096;
        }
        if (wlq.t(strArrM0, "public.accessibility.describes-music-and-sound")) {
            i2 |= 1024;
        }
        return wlq.t(strArrM0, "public.easy-to-read") ? i2 | 8192 : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static int x(String str) {
        boolean zQ = q(str, U, false);
        ?? r0 = zQ;
        if (q(str, V, false)) {
            r0 = (zQ ? 1 : 0) | 2;
        }
        return q(str, T, false) ? r0 | 4 : r0;
    }

    public static c.f y(String str) {
        double dR = r(str, f8146r, -9.223372036854776E18d);
        long j2 = dR == -9.223372036854776E18d ? -9223372036854775807L : (long) (dR * 1000000.0d);
        boolean zQ = q(str, s, false);
        double dR2 = r(str, u, -9.223372036854776E18d);
        long j3 = dR2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dR2 * 1000000.0d);
        double dR3 = r(str, v, -9.223372036854776E18d);
        return new c.f(j2, zQ, j3, dR3 != -9.223372036854776E18d ? (long) (dR3 * 1000000.0d) : -9223372036854775807L, q(str, w, false));
    }

    public static String z(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String strV = v(str, pattern, map);
        if (strV != null) {
            return strV;
        }
        String strPattern = pattern.pattern();
        StringBuilder sb = new StringBuilder(String.valueOf(strPattern).length() + 19 + String.valueOf(str).length());
        sb.append("Couldn't match ");
        sb.append(strPattern);
        sb.append(" in ");
        sb.append(str);
        throw new ParserException(sb.toString());
    }

    @Override // com.google.android.exoplayer2.upstream.i.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public k9c a(Uri uri, InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw new UnrecognizedInputFormatException("Input does not start with the #EXTM3U header.", uri);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    wlq.o(bufferedReader);
                    throw new ParserException("Failed to parse the playlist, could not identify any tags.");
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        b bVarO = o(new a(arrayDeque, bufferedReader), uri.toString());
                        wlq.o(bufferedReader);
                        return bVarO;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    c cVarP = p(this.f8147a, this.f8148b, new a(arrayDeque, bufferedReader), uri.toString());
                    wlq.o(bufferedReader);
                    return cVarP;
                }
            }
        } catch (Throwable th) {
            wlq.o(bufferedReader);
            throw th;
        }
    }

    public HlsPlaylistParser(b bVar, c cVar) {
        this.f8147a = bVar;
        this.f8148b = cVar;
    }
}
