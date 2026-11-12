package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.common.h;
import androidx.media3.common.l;
import androidx.media3.common.q;
import androidx.media3.common.w;
import c22.t;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import fa.k;
import fa.x;
import fa.z;
import ha.e;
import i3.e5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ma.p;
import org.apache.commons.lang3.time.TimeZones;

/* JADX INFO: loaded from: classes.dex */
public final class HlsPlaylistParser implements androidx.media3.exoplayer.upstream.c.a<na.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f9052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f9053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f9028c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f9029d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f9030e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f9031f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f9032g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f9033h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f9034i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f9035j = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f9036k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f9037l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f9038m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f9039n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f9040o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f9041p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f9042q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f9043r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f9044s = b("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f9045t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f9046u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f9047v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f9048w = b("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f9049x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f9050y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f9051z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
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
    public static final Pattern T = b("AUTOSELECT");
    public static final Pattern U = b("DEFAULT");
    public static final Pattern V = b("FORCED");
    public static final Pattern W = b("INDEPENDENT");
    public static final Pattern X = b("GAP");
    public static final Pattern Y = b("PRECISE");
    public static final Pattern Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Pattern f9026a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Pattern f9027b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class DeltaUpdateException extends IOException {
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BufferedReader f9054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Queue<String> f9055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9056c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f9055b = queue;
            this.f9054a = bufferedReader;
        }

        public final boolean a() throws IOException {
            String strTrim;
            if (this.f9056c != null) {
                return true;
            }
            Queue<String> queue = this.f9055b;
            if (!queue.isEmpty()) {
                String strPoll = queue.poll();
                strPoll.getClass();
                this.f9056c = strPoll;
                return true;
            }
            do {
                String line = this.f9054a.readLine();
                this.f9056c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f9056c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public final String b() {
            if (!a()) {
                t.g();
                return null;
            }
            String str = this.f9056c;
            this.f9056c = null;
            return str;
        }
    }

    public HlsPlaylistParser(c cVar, b bVar) {
        this.f9052a = cVar;
        this.f9053b = bVar;
    }

    public static Pattern b(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static l c(String str, l.b[] bVarArr) {
        l.b[] bVarArr2 = new l.b[bVarArr.length];
        for (int i14 = 0; i14 < bVarArr.length; i14++) {
            l.b bVar = bVarArr[i14];
            bVarArr2[i14] = new l.b(bVar.f8343b, bVar.f8344c, bVar.f8345d, null);
        }
        return new l(str, bVarArr2);
    }

    public static l.b d(String str, String str2, HashMap map) throws ParserException {
        String strJ = j(str, J, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = K;
        if (zEquals) {
            String strK = k(str, pattern, map);
            return new l.b(h.f8299d, MimeTypes.VIDEO_MP4, Base64.decode(strK.substring(strK.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = h.f8299d;
            int i14 = z.f70071a;
            return new l.b(uuid, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strJ)) {
            return null;
        }
        String strK2 = k(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strK2.substring(strK2.indexOf(44)), 0);
        UUID uuid2 = h.f8300e;
        return new l.b(uuid2, MimeTypes.VIDEO_MP4, vb.l.a(uuid2, bArrDecode));
    }

    /* JADX WARN: Code duplicated, block: B:296:0x0873  */
    /* JADX WARN: Code duplicated, block: B:298:0x0890  */
    /* JADX WARN: Code duplicated, block: B:301:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:302:0x08ad  */
    /* JADX WARN: Multi-variable type inference failed */
    public static b e(c cVar, b bVar, a aVar, String str) throws DeltaUpdateException, ParserException {
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i14;
        int i15;
        b.d dVar;
        l lVar;
        String str3;
        int i16;
        l lVarC;
        b.d dVar2;
        long j8;
        long j14;
        long j15;
        l lVar2;
        l lVar3;
        int i17;
        c cVar2 = cVar;
        b bVar2 = bVar;
        boolean z14 = cVar2.f125104c;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        b.f fVar = new b.f(C.TIME_UNSET, false, C.TIME_UNSET, C.TIME_UNSET, false);
        TreeMap treeMap = new TreeMap();
        boolean z15 = z14;
        String strJ = "";
        long j16 = -9223372036854775807L;
        long j17 = 0;
        long jO = 0;
        long j18 = 0;
        long j19 = 0;
        long j24 = 0;
        long jLongValue = 0;
        long j25 = 0;
        long j26 = -1;
        boolean zG = false;
        b.C0125b c0125b = null;
        int i18 = 0;
        l lVar4 = null;
        b.d dVar3 = null;
        l lVar5 = null;
        int i19 = 0;
        String strK = null;
        String strJ2 = null;
        boolean z16 = false;
        int i24 = 0;
        boolean z17 = false;
        int i25 = 0;
        String str4 = null;
        boolean z18 = false;
        int i26 = 0;
        long j27 = -9223372036854775807L;
        long j28 = -9223372036854775807L;
        long j29 = 0;
        int i27 = 1;
        while (aVar.a()) {
            String strB = aVar.b();
            if (strB.startsWith("#EXT")) {
                arrayList6.add(strB);
            }
            zG = zG;
            if (strB.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strK2 = k(strB, f9042q, map);
                if ("VOD".equals(strK2)) {
                    i18 = 1;
                } else if ("EVENT".equals(strK2)) {
                    i18 = 2;
                }
                zG = zG;
            } else if (strB.equals("#EXT-X-I-FRAMES-ONLY")) {
                zG = zG;
                z18 = true;
            } else {
                if (strB.startsWith("#EXT-X-START")) {
                    double d14 = Double.parseDouble(k(strB, C, Collections.EMPTY_MAP));
                    fVar = fVar;
                    zG = g(strB, Y);
                    j16 = (long) (d14 * 1000000.0d);
                    arrayList6 = arrayList6;
                } else {
                    ArrayList arrayList7 = arrayList6;
                    fVar = fVar;
                    if (strB.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double dH = h(strB, f9043r);
                        long j34 = dH == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH * 1000000.0d);
                        boolean zG2 = g(strB, f9044s);
                        double dH2 = h(strB, f9046u);
                        long j35 = dH2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH2 * 1000000.0d);
                        double dH3 = h(strB, f9047v);
                        fVar = new b.f(j34, zG2, j35, dH3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH3 * 1000000.0d), g(strB, f9048w));
                    } else if (strB.startsWith("#EXT-X-PART-INF")) {
                        j28 = (long) (Double.parseDouble(k(strB, f9040o, Collections.EMPTY_MAP)) * 1000000.0d);
                    } else {
                        boolean zStartsWith = strB.startsWith("#EXT-X-MAP");
                        Pattern pattern = E;
                        Pattern pattern2 = K;
                        if (zStartsWith) {
                            String strK3 = k(strB, pattern2, map);
                            String strJ3 = j(strB, pattern, null, map);
                            if (strJ3 != null) {
                                int i28 = z.f70071a;
                                String[] strArrSplit = strJ3.split("@", -1);
                                j26 = Long.parseLong(strArrSplit[i24]);
                                if (strArrSplit.length > 1) {
                                    j19 = Long.parseLong(strArrSplit[1]);
                                }
                            }
                            long j36 = j26;
                            if (j36 == -1) {
                                j19 = 0;
                            }
                            if (strK != null && strJ2 == null) {
                                throw ParserException.createForMalformedManifest("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            String str5 = strK;
                            b.d dVar4 = new b.d(strK3, j19, j36, str5, strJ2);
                            strK = str5;
                            String str6 = strJ2;
                            if (j36 != -1) {
                                j19 += j36;
                            }
                            arrayList6 = arrayList7;
                            dVar3 = dVar4;
                            j26 = -1;
                            zG = zG;
                            fVar = fVar;
                            strJ2 = str6;
                        } else {
                            arrayList6 = arrayList7;
                            strJ2 = strJ2;
                            ArrayList arrayList8 = arrayList4;
                            ArrayList arrayList9 = arrayList5;
                            if (strB.startsWith("#EXT-X-TARGETDURATION")) {
                                j27 = ((long) Integer.parseInt(k(strB, f9038m, Collections.EMPTY_MAP))) * 1000000;
                            } else if (strB.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j18 = Long.parseLong(k(strB, f9049x, Collections.EMPTY_MAP));
                                j29 = j18;
                            } else if (strB.startsWith("#EXT-X-VERSION")) {
                                i27 = Integer.parseInt(k(strB, f9041p, Collections.EMPTY_MAP));
                            } else {
                                if (strB.startsWith("#EXT-X-DEFINE")) {
                                    String strJ4 = j(strB, f9026a0, null, map);
                                    if (strJ4 != null) {
                                        String str7 = cVar2.f9137l.get(strJ4);
                                        if (str7 != null) {
                                            map.put(strJ4, str7);
                                        }
                                    } else {
                                        map.put(k(strB, P, map), k(strB, Z, map));
                                    }
                                    str2 = str4;
                                } else if (strB.startsWith("#EXTINF")) {
                                    jLongValue = new BigDecimal(k(strB, f9050y, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                    strJ = j(strB, f9051z, "", map);
                                } else if (strB.startsWith("#EXT-X-SKIP")) {
                                    int i29 = Integer.parseInt(k(strB, f9045t, Collections.EMPTY_MAP));
                                    fa.a.d((bVar2 == null || !arrayList3.isEmpty()) ? i24 : 1);
                                    int i30 = z.f70071a;
                                    long j37 = bVar2.f9093k;
                                    ImmutableList immutableList = bVar2.f9100r;
                                    int i34 = (int) (j29 - j37);
                                    int i35 = i29 + i34;
                                    if (i34 < 0 || i35 > immutableList.size()) {
                                        throw new DeltaUpdateException();
                                    }
                                    long j38 = j24;
                                    strJ2 = strJ2;
                                    while (i34 < i35) {
                                        b.d dVar5 = (b.d) immutableList.get(i34);
                                        if (j29 != bVar2.f9093k) {
                                            int i36 = (bVar2.f9092j - i25) + dVar5.f9115d;
                                            ImmutableList immutableList2 = dVar5.f9111m;
                                            ArrayList arrayList10 = new ArrayList();
                                            int i37 = i24;
                                            long j39 = j38;
                                            while (i37 < immutableList2.size()) {
                                                b.C0125b c0125b2 = (b.C0125b) immutableList2.get(i37);
                                                arrayList10.add(new b.C0125b(c0125b2.f9112a, c0125b2.f9113b, c0125b2.f9114c, i36, j39, c0125b2.f9117f, c0125b2.f9118g, c0125b2.f9119h, c0125b2.f9120i, c0125b2.f9121j, c0125b2.f9122k, c0125b2.f9105l, c0125b2.f9106m));
                                                j39 += c0125b2.f9114c;
                                                i37++;
                                                i35 = i35;
                                            }
                                            i17 = i35;
                                            dVar5 = new b.d(dVar5.f9112a, dVar5.f9113b, dVar5.f9110l, dVar5.f9114c, i36, j38, dVar5.f9117f, dVar5.f9118g, dVar5.f9119h, dVar5.f9120i, dVar5.f9121j, dVar5.f9122k, arrayList10);
                                        } else {
                                            i17 = i35;
                                        }
                                        arrayList3.add(dVar5);
                                        long j44 = dVar5.f9114c;
                                        String str8 = dVar5.f9119h;
                                        j38 += j44;
                                        long j45 = dVar5.f9121j;
                                        if (j45 != -1) {
                                            j19 = dVar5.f9120i + j45;
                                        }
                                        int i38 = dVar5.f9115d;
                                        b.d dVar6 = dVar5.f9113b;
                                        l lVar6 = dVar5.f9117f;
                                        String str9 = dVar5.f9118g;
                                        if (str8 == null || !str8.equals(Long.toHexString(j18))) {
                                            strJ2 = str8;
                                        }
                                        j18++;
                                        i34++;
                                        i19 = i38;
                                        dVar3 = dVar6;
                                        strK = str9;
                                        lVar4 = lVar6;
                                        i35 = i17;
                                        j17 = j38;
                                        bVar2 = bVar;
                                    }
                                    cVar2 = cVar;
                                    bVar2 = bVar;
                                    zG = zG;
                                    fVar = fVar;
                                    arrayList6 = arrayList6;
                                    arrayList5 = arrayList9;
                                    arrayList4 = arrayList8;
                                    j24 = j38;
                                } else if (strB.startsWith("#EXT-X-KEY")) {
                                    String strK4 = k(strB, H, map);
                                    String strJ5 = j(strB, I, "identity", map);
                                    if ("NONE".equals(strK4)) {
                                        treeMap.clear();
                                        lVar4 = null;
                                        strK = null;
                                        strJ2 = null;
                                    } else {
                                        strJ2 = j(strB, L, null, map);
                                        if (!"identity".equals(strJ5)) {
                                            String str10 = str4;
                                            str4 = str10 == null ? ("SAMPLE-AES-CENC".equals(strK4) || "SAMPLE-AES-CTR".equals(strK4)) ? C.CENC_TYPE_cenc : C.CENC_TYPE_cbcs : str10;
                                            l.b bVarD = d(strB, strJ5, map);
                                            if (bVarD != null) {
                                                treeMap.put(strJ5, bVarD);
                                                lVar4 = null;
                                            }
                                            strK = null;
                                        } else if ("AES-128".equals(strK4)) {
                                            strK = k(strB, pattern2, map);
                                            strJ2 = strJ2;
                                        }
                                        strK = null;
                                    }
                                    cVar2 = cVar;
                                    bVar2 = bVar;
                                    arrayList6 = arrayList6;
                                    arrayList5 = arrayList9;
                                    arrayList4 = arrayList8;
                                } else {
                                    str2 = str4;
                                    if (strB.startsWith("#EXT-X-BYTERANGE")) {
                                        String strK5 = k(strB, D, map);
                                        int i39 = z.f70071a;
                                        String[] strArrSplit2 = strK5.split("@", -1);
                                        j26 = Long.parseLong(strArrSplit2[i24]);
                                        if (strArrSplit2.length > 1) {
                                            j19 = Long.parseLong(strArrSplit2[1]);
                                        }
                                    } else if (strB.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i25 = Integer.parseInt(strB.substring(strB.indexOf(58) + 1));
                                        cVar2 = cVar;
                                        bVar2 = bVar;
                                        str4 = str2;
                                        zG = zG;
                                        fVar = fVar;
                                        strJ2 = strJ2;
                                        arrayList6 = arrayList6;
                                        arrayList5 = arrayList9;
                                        arrayList4 = arrayList8;
                                        z17 = true;
                                    } else if (strB.equals("#EXT-X-DISCONTINUITY")) {
                                        i19++;
                                    } else if (strB.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                        if (jO == 0) {
                                            String strSubstring = strB.substring(strB.indexOf(58) + 1);
                                            Matcher matcher = z.f70078h.matcher(strSubstring);
                                            if (!matcher.matches()) {
                                                throw ParserException.createForMalformedContainer("Invalid date/time format: ".concat(strSubstring), null);
                                            }
                                            if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                                i14 = i24;
                                            } else {
                                                i14 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                                                if ("-".equals(matcher.group(11))) {
                                                    i14 *= -1;
                                                }
                                            }
                                            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone(TimeZones.GMT_ID));
                                            gregorianCalendar.clear();
                                            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                                            if (!TextUtils.isEmpty(matcher.group(8))) {
                                                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                                            }
                                            long timeInMillis = gregorianCalendar.getTimeInMillis();
                                            if (i14 != 0) {
                                                timeInMillis -= ((long) i14) * 60000;
                                            }
                                            jO = z.O(timeInMillis) - j24;
                                        }
                                    } else if (strB.equals("#EXT-X-GAP")) {
                                        cVar2 = cVar;
                                        bVar2 = bVar;
                                        str4 = str2;
                                        zG = zG;
                                        fVar = fVar;
                                        strJ2 = strJ2;
                                        arrayList6 = arrayList6;
                                        arrayList5 = arrayList9;
                                        arrayList4 = arrayList8;
                                        i26 = 1;
                                    } else if (strB.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                        cVar2 = cVar;
                                        bVar2 = bVar;
                                        str4 = str2;
                                        zG = zG;
                                        fVar = fVar;
                                        strJ2 = strJ2;
                                        arrayList6 = arrayList6;
                                        arrayList5 = arrayList9;
                                        arrayList4 = arrayList8;
                                        z15 = true;
                                    } else if (strB.equals("#EXT-X-ENDLIST")) {
                                        cVar2 = cVar;
                                        bVar2 = bVar;
                                        str4 = str2;
                                        zG = zG;
                                        fVar = fVar;
                                        strJ2 = strJ2;
                                        arrayList6 = arrayList6;
                                        arrayList5 = arrayList9;
                                        arrayList4 = arrayList8;
                                        z16 = true;
                                    } else {
                                        if (strB.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            long jI = i(strB, A);
                                            Matcher matcher2 = B.matcher(strB);
                                            if (matcher2.find()) {
                                                String strGroup = matcher2.group(1);
                                                strGroup.getClass();
                                                i15 = Integer.parseInt(strGroup);
                                            } else {
                                                i15 = -1;
                                            }
                                            b.c cVar3 = new b.c(Uri.parse(x.c(str, k(strB, pattern2, map))), jI, i15);
                                            arrayList = arrayList9;
                                            arrayList.add(cVar3);
                                        } else {
                                            arrayList = arrayList9;
                                            if (!strB.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                l lVarC2 = lVar5;
                                                b.d dVar7 = dVar3;
                                                if (strB.startsWith("#EXT-X-PART")) {
                                                    String hexString = strK == null ? null : strJ2 != null ? strJ2 : Long.toHexString(j18);
                                                    String strK6 = k(strB, pattern2, map);
                                                    long j46 = (long) (Double.parseDouble(k(strB, f9039n, Collections.EMPTY_MAP)) * 1000000.0d);
                                                    boolean zG3 = g(strB, W) | (z15 && arrayList8.isEmpty());
                                                    boolean zG4 = g(strB, X);
                                                    String strJ6 = j(strB, pattern, null, map);
                                                    if (strJ6 != null) {
                                                        int i44 = z.f70071a;
                                                        String[] strArrSplit3 = strJ6.split("@", -1);
                                                        long j47 = Long.parseLong(strArrSplit3[0]);
                                                        if (strArrSplit3.length > 1) {
                                                            j25 = Long.parseLong(strArrSplit3[1]);
                                                        }
                                                        j15 = j47;
                                                    } else {
                                                        j15 = -1;
                                                    }
                                                    long j48 = j15 == -1 ? 0L : j25;
                                                    if (lVar4 != null || treeMap.isEmpty()) {
                                                        lVar2 = lVar4;
                                                    } else {
                                                        l.b[] bVarArr = (l.b[]) treeMap.values().toArray(new l.b[0]);
                                                        l lVar7 = new l(str2, bVarArr);
                                                        if (lVarC2 == null) {
                                                            lVarC2 = c(str2, bVarArr);
                                                        }
                                                        lVar2 = lVar7;
                                                    }
                                                    long j49 = j17;
                                                    arrayList8.add(new b.C0125b(strK6, dVar7, j46, i19, j49, lVar2, strK, hexString, j48, j15, zG4, zG3, false));
                                                    j17 = j49 + j46;
                                                    if (j15 != -1) {
                                                        j48 += j15;
                                                    }
                                                    j25 = j48;
                                                    lVar5 = lVarC2;
                                                    dVar3 = dVar7;
                                                    arrayList4 = arrayList8;
                                                    str4 = str2;
                                                    lVar4 = lVar2;
                                                    i24 = 0;
                                                } else {
                                                    dVar3 = dVar7;
                                                    j17 = j17;
                                                    arrayList2 = arrayList8;
                                                    if (strB.startsWith("#")) {
                                                        lVar5 = lVarC2;
                                                        strK = strK;
                                                        j26 = j26;
                                                        i26 = i26;
                                                        strJ = strJ;
                                                        i24 = 0;
                                                        i24 = i24;
                                                        dVar3 = dVar3;
                                                        arrayList4 = arrayList2;
                                                        str4 = str2;
                                                        strJ = strJ;
                                                        j17 = j17;
                                                        strK = strK;
                                                        j26 = j26;
                                                        i26 = i26;
                                                    } else {
                                                        String hexString2 = strK == null ? null : strJ2 != null ? strJ2 : Long.toHexString(j18);
                                                        long j54 = j18 + 1;
                                                        String strL = l(strB, map);
                                                        b.d dVar8 = (b.d) map2.get(strL);
                                                        if (j26 == -1) {
                                                            dVar = dVar8;
                                                            j19 = 0;
                                                        } else {
                                                            if (z18 && dVar3 == null && dVar8 == null) {
                                                                dVar8 = new b.d(strL, 0L, j19, null, null);
                                                                map2.put(strL, dVar8);
                                                            }
                                                            dVar = dVar8;
                                                        }
                                                        if (lVar4 != null || treeMap.isEmpty()) {
                                                            lVar = lVarC2;
                                                            str3 = strL;
                                                            i16 = 0;
                                                        } else {
                                                            lVar = lVarC2;
                                                            str3 = strL;
                                                            i16 = 0;
                                                            l.b[] bVarArr2 = (l.b[]) treeMap.values().toArray(new l.b[0]);
                                                            l lVar8 = new l(str2, bVarArr2);
                                                            if (lVar == null) {
                                                                lVarC = c(str2, bVarArr2);
                                                                lVar4 = lVar8;
                                                            } else {
                                                                lVar4 = lVar8;
                                                            }
                                                            if (dVar3 != null) {
                                                                dVar2 = dVar3;
                                                            } else {
                                                                dVar2 = dVar;
                                                            }
                                                            int i45 = i19;
                                                            String str11 = strK;
                                                            j8 = j26;
                                                            j14 = j19;
                                                            long j55 = j24;
                                                            long j56 = jLongValue;
                                                            l lVar9 = lVar4;
                                                            i19 = i45;
                                                            arrayList3.add(new b.d(str3, dVar2, strJ, j56, i45, j55, lVar9, str11, hexString2, j14, j8, i26, arrayList2));
                                                            j17 = j55 + j56;
                                                            ArrayList arrayList11 = new ArrayList();
                                                            if (j26 != -1) {
                                                                j19 = j14 + j8;
                                                            } else {
                                                                j19 = j14;
                                                            }
                                                            i24 = i16;
                                                            i26 = i24;
                                                            lVar5 = lVarC;
                                                            dVar3 = dVar3;
                                                            arrayList4 = arrayList11;
                                                            j18 = j54;
                                                            str4 = str2;
                                                            strJ = "";
                                                            j24 = j17;
                                                            lVar4 = lVar9;
                                                            strK = str11;
                                                            jLongValue = 0;
                                                            j26 = -1;
                                                        }
                                                        lVarC = lVar;
                                                        if (dVar3 != null) {
                                                            dVar2 = dVar3;
                                                        } else {
                                                            dVar2 = dVar;
                                                        }
                                                        int i46 = i19;
                                                        String str12 = strK;
                                                        j8 = j26;
                                                        j14 = j19;
                                                        long j57 = j24;
                                                        long j58 = jLongValue;
                                                        l lVar10 = lVar4;
                                                        i19 = i46;
                                                        arrayList3.add(new b.d(str3, dVar2, strJ, j58, i46, j57, lVar10, str12, hexString2, j14, j8, i26, arrayList2));
                                                        j17 = j57 + j58;
                                                        ArrayList arrayList12 = new ArrayList();
                                                        if (j26 != -1) {
                                                            j19 = j14 + j8;
                                                        } else {
                                                            j19 = j14;
                                                        }
                                                        i24 = i16;
                                                        i26 = i24;
                                                        lVar5 = lVarC;
                                                        dVar3 = dVar3;
                                                        arrayList4 = arrayList12;
                                                        j18 = j54;
                                                        str4 = str2;
                                                        strJ = "";
                                                        j24 = j17;
                                                        lVar4 = lVar10;
                                                        strK = str12;
                                                        jLongValue = 0;
                                                        j26 = -1;
                                                    }
                                                }
                                                bVar2 = bVar;
                                                arrayList5 = arrayList;
                                                cVar2 = cVar;
                                            } else if (c0125b == null && "PART".equals(k(strB, N, map))) {
                                                l lVarC3 = lVar5;
                                                b.d dVar9 = dVar3;
                                                String strK7 = k(strB, pattern2, map);
                                                long jI2 = i(strB, F);
                                                long jI3 = i(strB, G);
                                                String hexString3 = strK == null ? null : strJ2 != null ? strJ2 : Long.toHexString(j18);
                                                if (lVar4 != null || treeMap.isEmpty()) {
                                                    lVar3 = lVar4;
                                                } else {
                                                    l.b[] bVarArr3 = (l.b[]) treeMap.values().toArray(new l.b[i24]);
                                                    l lVar11 = new l(str2, bVarArr3);
                                                    if (lVarC3 == null) {
                                                        lVarC3 = c(str2, bVarArr3);
                                                    }
                                                    lVar3 = lVar11;
                                                }
                                                if (jI2 == -1 || jI3 != -1) {
                                                    long j59 = j17;
                                                    j17 = j59;
                                                    c0125b = new b.C0125b(strK7, dVar9, 0L, i19, j59, lVar3, strK, hexString3, jI2 != -1 ? jI2 : 0L, jI3, false, false, true);
                                                }
                                                arrayList5 = arrayList;
                                                str4 = str2;
                                                dVar3 = dVar9;
                                                lVar4 = lVar3;
                                                zG = zG;
                                                fVar = fVar;
                                                strJ2 = strJ2;
                                                arrayList6 = arrayList6;
                                                arrayList4 = arrayList8;
                                                i24 = 0;
                                                cVar2 = cVar;
                                                lVar5 = lVarC3;
                                                bVar2 = bVar;
                                            }
                                        }
                                        dVar3 = dVar3;
                                        j17 = j17;
                                        strK = strK;
                                        i24 = i24;
                                        j26 = j26;
                                        arrayList2 = arrayList8;
                                        i24 = i24;
                                        dVar3 = dVar3;
                                        arrayList4 = arrayList2;
                                        str4 = str2;
                                        strJ = strJ;
                                        j17 = j17;
                                        strK = strK;
                                        j26 = j26;
                                        i26 = i26;
                                        bVar2 = bVar;
                                        arrayList5 = arrayList;
                                        cVar2 = cVar;
                                    }
                                    cVar2 = cVar;
                                    bVar2 = bVar;
                                    str4 = str2;
                                }
                                arrayList = arrayList9;
                                arrayList2 = arrayList8;
                                i24 = i24;
                                dVar3 = dVar3;
                                arrayList4 = arrayList2;
                                str4 = str2;
                                strJ = strJ;
                                j17 = j17;
                                strK = strK;
                                j26 = j26;
                                i26 = i26;
                                bVar2 = bVar;
                                arrayList5 = arrayList;
                                cVar2 = cVar;
                            }
                            strJ2 = strJ2;
                            arrayList6 = arrayList6;
                            arrayList5 = arrayList9;
                            arrayList4 = arrayList8;
                        }
                    }
                    arrayList6 = arrayList7;
                    zG = zG;
                }
                fVar = fVar;
            }
        }
        boolean z19 = zG;
        ArrayList arrayList13 = arrayList5;
        ArrayList arrayList14 = arrayList6;
        b.f fVar2 = fVar;
        int i47 = i24;
        ArrayList arrayList15 = arrayList4;
        HashMap map3 = new HashMap();
        for (int i48 = i47; i48 < arrayList13.size(); i48++) {
            b.c cVar4 = (b.c) arrayList13.get(i48);
            long size = cVar4.f9108b;
            if (size == -1) {
                size = (j29 + ((long) arrayList3.size())) - (arrayList15.isEmpty() ? 1L : 0L);
            }
            int size2 = cVar4.f9109c;
            if (size2 == -1 && j28 != C.TIME_UNSET) {
                size2 = (arrayList15.isEmpty() ? ((b.d) Iterables.getLast(arrayList3)).f9111m : arrayList15).size() - 1;
            }
            Uri uri = cVar4.f9107a;
            map3.put(uri, new b.c(uri, size, size2));
        }
        if (c0125b != null) {
            arrayList15.add(c0125b);
        }
        return new b(i18, str, arrayList14, j16, z19, jO, z17, i25, j29, i27, j27, j28, z15, z16, jO != 0 ? 1 : i47, lVar5, arrayList3, arrayList15, fVar2, map3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:114:0x0375  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v6 */
    public static c f(a aVar, String str) throws IOException {
        ?? r14;
        int i14;
        int i15;
        ArrayList arrayList;
        ArrayList arrayList2;
        c.b bVar;
        String strD;
        ArrayList arrayList3;
        int i16;
        String str2;
        c.b bVar2;
        String strD2;
        c.b bVar3;
        int i17;
        int i18;
        int i19;
        Uri uriD;
        int i24;
        String str3 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean z14 = false;
        boolean z15 = false;
        while (true) {
            boolean zA = aVar.a();
            Pattern pattern = K;
            ArrayList arrayList12 = arrayList8;
            Pattern pattern2 = P;
            boolean z16 = z14;
            if (!zA) {
                ArrayList arrayList13 = arrayList5;
                ArrayList arrayList14 = arrayList6;
                ArrayList arrayList15 = arrayList7;
                ArrayList arrayList16 = arrayList11;
                ArrayList arrayList17 = arrayList10;
                boolean z17 = z15;
                ArrayList arrayList18 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i25 = 0; i25 < arrayList4.size(); i25++) {
                    c.b bVar4 = (c.b) arrayList4.get(i25);
                    Uri uri = bVar4.f9142a;
                    q qVar = bVar4.f9143b;
                    if (hashSet.add(uri)) {
                        fa.a.d(qVar.f8384l == null);
                        ArrayList arrayList19 = (ArrayList) map.get(bVar4.f9142a);
                        arrayList19.getClass();
                        w wVar = new w(new p(null, null, arrayList19));
                        q.b bVarA = qVar.a();
                        bVarA.f8409k = wVar;
                        arrayList18.add(new c.b(bVar4.f9142a, bVarA.a(), bVar4.f9144c, bVar4.f9145d, bVar4.f9146e, bVar4.f9147f));
                    }
                }
                int i26 = 0;
                q qVarA = null;
                List arrayList20 = null;
                while (i26 < arrayList9.size()) {
                    String str4 = (String) arrayList9.get(i26);
                    String strK = k(str4, Q, map2);
                    String strK2 = k(str4, pattern2, map2);
                    q.b bVar5 = new q.b();
                    bVar5.f8399a = e5.g(strK, ":", strK2);
                    bVar5.f8400b = strK2;
                    bVar5.f8410l = androidx.media3.common.x.n(MimeTypes.APPLICATION_M3U8);
                    boolean zG = g(str4, U);
                    if (g(str4, V)) {
                        r14 = zG;
                        r14 = (zG ? 1 : 0) | 2;
                    }
                    r14 = zG;
                    int i27 = r14;
                    if (g(str4, T)) {
                        i27 = (r14 == true ? 1 : 0) | 4;
                    }
                    bVar5.f8403e = i27;
                    String strJ = j(str4, R, null, map2);
                    if (TextUtils.isEmpty(strJ)) {
                        i14 = i26;
                        i15 = 0;
                    } else {
                        int i28 = z.f70071a;
                        i14 = i26;
                        String[] strArrSplit = strJ.split(",", -1);
                        i15 = z.k(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
                        if (z.k(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
                            i15 |= 4096;
                        }
                        if (z.k(strArrSplit, "public.accessibility.describes-music-and-sound")) {
                            i15 |= 1024;
                        }
                        if (z.k(strArrSplit, "public.easy-to-read")) {
                            i15 |= 8192;
                        }
                    }
                    bVar5.f8404f = i15;
                    bVar5.f8402d = j(str4, O, null, map2);
                    String strJ2 = j(str4, pattern, null, map2);
                    Uri uriD2 = strJ2 == null ? null : x.d(str3, strJ2);
                    ArrayList arrayList21 = arrayList9;
                    w wVar2 = new w(new p(strK, strK2, Collections.EMPTY_LIST));
                    switch (k(str4, M, map2)) {
                        case "SUBTITLES":
                            arrayList = arrayList18;
                            arrayList2 = arrayList14;
                            int i29 = 0;
                            while (true) {
                                if (i29 < arrayList4.size()) {
                                    bVar = (c.b) arrayList4.get(i29);
                                    if (!strK.equals(bVar.f9146e)) {
                                        i29++;
                                    }
                                } else {
                                    bVar = null;
                                }
                            }
                            if (bVar != null) {
                                String strS = z.s(bVar.f9143b.f8383k, 3);
                                bVar5.f8408j = strS;
                                strD = androidx.media3.common.x.d(strS);
                            } else {
                                strD = null;
                            }
                            if (strD == null) {
                                strD = MimeTypes.TEXT_VTT;
                            }
                            bVar5.f8411m = androidx.media3.common.x.n(strD);
                            bVar5.f8409k = wVar2;
                            if (uriD2 != null) {
                                c.a aVar2 = new c.a(uriD2, bVar5.a(), strK, strK2);
                                arrayList3 = arrayList15;
                                arrayList3.add(aVar2);
                                break;
                            } else {
                                arrayList3 = arrayList15;
                                k.g("EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList = arrayList18;
                            arrayList2 = arrayList14;
                            String strK3 = k(str4, S, map2);
                            if (strK3.startsWith("CC")) {
                                i16 = Integer.parseInt(strK3.substring(2));
                                str2 = MimeTypes.APPLICATION_CEA608;
                            } else {
                                i16 = Integer.parseInt(strK3.substring(7));
                                str2 = MimeTypes.APPLICATION_CEA708;
                            }
                            if (arrayList20 == null) {
                                arrayList20 = new ArrayList();
                            }
                            bVar5.f8411m = androidx.media3.common.x.n(str2);
                            bVar5.G = i16;
                            arrayList20.add(bVar5.a());
                            arrayList3 = arrayList15;
                            break;
                        case "AUDIO":
                            arrayList13 = arrayList13;
                            int i30 = 0;
                            while (true) {
                                if (i30 < arrayList4.size()) {
                                    bVar2 = (c.b) arrayList4.get(i30);
                                    int i34 = i30;
                                    if (!strK.equals(bVar2.f9145d)) {
                                        i30 = i34 + 1;
                                    }
                                } else {
                                    bVar2 = null;
                                }
                            }
                            if (bVar2 != null) {
                                String strS2 = z.s(bVar2.f9143b.f8383k, 1);
                                bVar5.f8408j = strS2;
                                strD2 = androidx.media3.common.x.d(strS2);
                            } else {
                                strD2 = null;
                            }
                            arrayList = arrayList18;
                            String strJ3 = j(str4, f9034i, null, map2);
                            if (strJ3 != null) {
                                int i35 = z.f70071a;
                                bVar5.B = Integer.parseInt(strJ3.split("/", 2)[0]);
                                if (MimeTypes.AUDIO_E_AC3.equals(strD2) && strJ3.endsWith("/JOC")) {
                                    bVar5.f8408j = MimeTypes.CODEC_E_AC3_JOC;
                                    strD2 = MimeTypes.AUDIO_E_AC3_JOC;
                                }
                            }
                            bVar5.f8411m = androidx.media3.common.x.n(strD2);
                            if (uriD2 != null) {
                                bVar5.f8409k = wVar2;
                                arrayList2 = arrayList14;
                                arrayList2.add(new c.a(uriD2, bVar5.a(), strK, strK2));
                            } else {
                                arrayList2 = arrayList14;
                                if (bVar2 != null) {
                                    qVarA = bVar5.a();
                                }
                            }
                            arrayList3 = arrayList15;
                            break;
                        case "VIDEO":
                            int i36 = 0;
                            while (true) {
                                if (i36 < arrayList4.size()) {
                                    bVar3 = (c.b) arrayList4.get(i36);
                                    if (!strK.equals(bVar3.f9144c)) {
                                        i36++;
                                    }
                                } else {
                                    bVar3 = null;
                                }
                            }
                            if (bVar3 != null) {
                                q qVar2 = bVar3.f9143b;
                                String strS3 = z.s(qVar2.f8383k, 2);
                                bVar5.f8408j = strS3;
                                bVar5.f8411m = androidx.media3.common.x.n(androidx.media3.common.x.d(strS3));
                                bVar5.f8418t = qVar2.f8393u;
                                bVar5.f8419u = qVar2.f8394v;
                                bVar5.f8420v = qVar2.f8395w;
                            }
                            if (uriD2 != null) {
                                bVar5.f8409k = wVar2;
                                arrayList13.add(new c.a(uriD2, bVar5.a(), strK, strK2));
                                break;
                            }
                        default:
                            arrayList = arrayList18;
                            arrayList3 = arrayList15;
                            arrayList2 = arrayList14;
                            break;
                    }
                    i26 = i14 + 1;
                    str3 = str;
                    arrayList14 = arrayList2;
                    arrayList15 = arrayList3;
                    arrayList9 = arrayList21;
                    arrayList18 = arrayList;
                }
                ArrayList arrayList22 = arrayList18;
                ArrayList arrayList23 = arrayList15;
                ArrayList arrayList24 = arrayList14;
                if (z16) {
                    arrayList20 = Collections.EMPTY_LIST;
                }
                return new c(str, arrayList16, arrayList22, arrayList13, arrayList24, arrayList23, arrayList12, qVarA, arrayList20, z17, map2, arrayList17);
            }
            String strB = aVar.b();
            if (strB.startsWith("#EXT")) {
                arrayList11.add(strB);
            }
            boolean zStartsWith = strB.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList25 = arrayList11;
            if (strB.startsWith("#EXT-X-DEFINE")) {
                map2.put(k(strB, pattern2, map2), k(strB, Z, map2));
            } else {
                if (strB.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    arrayList7 = arrayList7;
                    arrayList10 = arrayList10;
                    z14 = z16;
                    z15 = true;
                } else if (strB.startsWith("#EXT-X-MEDIA")) {
                    arrayList9.add(strB);
                } else if (strB.startsWith("#EXT-X-SESSION-KEY")) {
                    l.b bVarD = d(strB, j(strB, I, "identity", map2), map2);
                    if (bVarD != null) {
                        String strK4 = k(strB, H, map2);
                        arrayList10.add(new l(("SAMPLE-AES-CENC".equals(strK4) || "SAMPLE-AES-CTR".equals(strK4)) ? C.CENC_TYPE_cenc : C.CENC_TYPE_cbcs, bVarD));
                    }
                } else if (strB.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    boolean zContains = z16 | strB.contains("CLOSED-CAPTIONS=NONE");
                    int i37 = zStartsWith ? 16384 : 0;
                    int i38 = Integer.parseInt(k(strB, f9033h, Collections.EMPTY_MAP));
                    Matcher matcher = f9028c.matcher(strB);
                    if (matcher.find()) {
                        String strGroup = matcher.group(1);
                        strGroup.getClass();
                        i17 = Integer.parseInt(strGroup);
                    } else {
                        i17 = -1;
                    }
                    boolean z18 = z15;
                    String strJ4 = j(strB, f9035j, null, map2);
                    String strJ5 = j(strB, f9036k, null, map2);
                    if (strJ5 != null) {
                        int i39 = z.f70071a;
                        String[] strArrSplit2 = strJ5.split("x", -1);
                        int i44 = Integer.parseInt(strArrSplit2[0]);
                        i19 = Integer.parseInt(strArrSplit2[1]);
                        if (i44 <= 0 || i19 <= 0) {
                            i19 = -1;
                            i24 = -1;
                        } else {
                            i24 = i44;
                        }
                        i18 = i24;
                    } else {
                        i18 = -1;
                        i19 = -1;
                    }
                    String strJ6 = j(strB, f9037l, null, map2);
                    float f14 = strJ6 != null ? Float.parseFloat(strJ6) : -1.0f;
                    String strJ7 = j(strB, f9029d, null, map2);
                    String strJ8 = j(strB, f9030e, null, map2);
                    String strJ9 = j(strB, f9031f, null, map2);
                    String strJ10 = j(strB, f9032g, null, map2);
                    if (zStartsWith) {
                        uriD = x.d(str3, k(strB, pattern, map2));
                    } else {
                        if (!aVar.a()) {
                            throw ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriD = x.d(str3, l(aVar.b(), map2));
                    }
                    Uri uri2 = uriD;
                    q.b bVar6 = new q.b();
                    bVar6.f8399a = Integer.toString(arrayList4.size());
                    bVar6.f8410l = androidx.media3.common.x.n(MimeTypes.APPLICATION_M3U8);
                    bVar6.f8408j = strJ4;
                    bVar6.f8406h = i17;
                    bVar6.f8407i = i38;
                    bVar6.f8418t = i18;
                    bVar6.f8419u = i19;
                    bVar6.f8420v = f14;
                    bVar6.f8404f = i37;
                    arrayList4.add(new c.b(uri2, bVar6.a(), strJ7, strJ8, strJ9, strJ10));
                    ArrayList arrayList26 = (ArrayList) map.get(uri2);
                    if (arrayList26 == null) {
                        arrayList26 = new ArrayList();
                        map.put(uri2, arrayList26);
                    }
                    arrayList26.add(new p.b(i17, i38, strJ7, strJ8, strJ9, strJ10));
                    z14 = zContains;
                    z15 = z18;
                }
                arrayList8 = arrayList12;
                arrayList11 = arrayList25;
                arrayList10 = arrayList10;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
            }
            arrayList7 = arrayList7;
            arrayList10 = arrayList10;
            z14 = z16;
            arrayList8 = arrayList12;
            arrayList11 = arrayList25;
            arrayList10 = arrayList10;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList5 = arrayList5;
        }
    }

    public static boolean g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String j(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String k(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String strJ = j(str, pattern, null, map);
        if (strJ != null) {
            return strJ;
        }
        throw ParserException.createForMalformedManifest("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map<String, String> map) {
        Matcher matcher = f9027b0.matcher(str);
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

    /* JADX WARN: Code duplicated, block: B:19:0x003f A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:44:0x0098, B:46:0x00a0, B:48:0x00a8, B:50:0x00b0, B:52:0x00b8, B:54:0x00c0, B:56:0x00c8, B:58:0x00d0, B:61:0x00d9, B:62:0x00dd, B:67:0x00ff, B:68:0x0105, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:71:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0096, LOOP:2: B:17:0x003c->B:22:0x0048, LOOP_END, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:44:0x0098, B:46:0x00a0, B:48:0x00a8, B:50:0x00b0, B:52:0x00b8, B:54:0x00c0, B:56:0x00c8, B:58:0x00d0, B:61:0x00d9, B:62:0x00dd, B:67:0x00ff, B:68:0x0105, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:71:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:90:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0047 A[SYNTHETIC] */
    @Override // androidx.media3.exoplayer.upstream.c.a
    public final Object a(Uri uri, e eVar) throws ParserException {
        int i14;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(eVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int i15 = bufferedReader.read();
            boolean zK = false;
            if (i15 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i15 = bufferedReader.read();
                    while (i15 != -1) {
                        i15 = bufferedReader.read();
                    }
                    i14 = 0;
                    while (true) {
                        if (i14 < 7) {
                            while (i15 != -1) {
                                i15 = bufferedReader.read();
                            }
                            zK = z.K(i15);
                            break;
                        }
                        if (i15 != "#EXTM3U".charAt(i14)) {
                            break;
                            break;
                        }
                        i15 = bufferedReader.read();
                        i14++;
                    }
                }
            } else {
                while (i15 != -1 && Character.isWhitespace(i15)) {
                    i15 = bufferedReader.read();
                }
                i14 = 0;
                while (true) {
                    if (i14 < 7) {
                        while (i15 != -1 && Character.isWhitespace(i15) && !z.K(i15)) {
                            i15 = bufferedReader.read();
                        }
                        zK = z.K(i15);
                        break;
                    }
                    if (i15 != "#EXTM3U".charAt(i14)) {
                        break;
                    }
                    i15 = bufferedReader.read();
                    i14++;
                }
            }
            if (!zK) {
                throw ParserException.createForMalformedManifest("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    z.g(bufferedReader);
                    throw ParserException.createForMalformedManifest("Failed to parse the playlist, could not identify any tags.", null);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        c cVarF = f(new a(arrayDeque, bufferedReader), uri.toString());
                        z.g(bufferedReader);
                        return cVarF;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    b bVarE = e(this.f9052a, this.f9053b, new a(arrayDeque, bufferedReader), uri.toString());
                    z.g(bufferedReader);
                    return bVarE;
                }
            }
        } catch (Throwable th3) {
            z.g(bufferedReader);
            throw th3;
        }
    }

    public HlsPlaylistParser() {
        this(c.f9128n, null);
    }
}
