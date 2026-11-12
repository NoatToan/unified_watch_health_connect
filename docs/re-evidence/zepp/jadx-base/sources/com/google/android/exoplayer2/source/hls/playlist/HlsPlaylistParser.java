package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.Iterables;
import com.huami.watch.ota.UpdateUtils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
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
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsPlaylistParser implements ParsingLoadable.Parser<HlsPlaylist> {
    private static final String A = "#EXT-X-SESSION-KEY";
    private static final String B = "#EXT-X-BYTERANGE";
    private static final String C = "#EXT-X-GAP";
    private static final String D = "#EXT-X-SKIP";
    private static final String E = "#EXT-X-PRELOAD-HINT";
    private static final String F = "#EXT-X-RENDITION-REPORT";
    private static final String G = "AUDIO";
    private static final String H = "VIDEO";
    private static final String I = "SUBTITLES";
    private static final String J = "CLOSED-CAPTIONS";
    private static final String K = "PART";
    private static final String L = "MAP";
    private static final String M = "NONE";
    private static final String N = "AES-128";
    private static final String O = "SAMPLE-AES";
    private static final String P = "SAMPLE-AES-CENC";
    private static final String Q = "SAMPLE-AES-CTR";
    private static final String R = "com.microsoft.playready";
    private static final String S = "identity";
    private static final String T = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String U = "com.widevine";
    private static final String V = "YES";
    private static final String W = "NO";
    private static final String X = "CLOSED-CAPTIONS=NONE";
    private static final String c = "HlsPlaylistParser";
    private static final String d = "#EXTM3U";
    private static final String e = "#EXT";
    private static final String f = "#EXT-X-VERSION";
    private static final String g = "#EXT-X-PLAYLIST-TYPE";
    private static final String h = "#EXT-X-DEFINE";
    private static final String i = "#EXT-X-SERVER-CONTROL";
    private static final String j = "#EXT-X-STREAM-INF";
    private static final String k = "#EXT-X-PART-INF";
    private static final String l = "#EXT-X-PART";
    private static final String m = "#EXT-X-I-FRAME-STREAM-INF";
    private static final String n = "#EXT-X-I-FRAMES-ONLY";
    private static final String o = "#EXT-X-MEDIA";
    private static final String p = "#EXT-X-TARGETDURATION";
    private static final String q = "#EXT-X-DISCONTINUITY";
    private static final String r = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final String s = "#EXT-X-PROGRAM-DATE-TIME";
    private static final String t = "#EXT-X-MAP";
    private static final String u = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final String v = "#EXTINF";
    private static final String w = "#EXT-X-MEDIA-SEQUENCE";
    private static final String x = "#EXT-X-START";
    private static final String y = "#EXT-X-ENDLIST";
    private static final String z = "#EXT-X-KEY";
    private final HlsMasterPlaylist a;

    @Nullable
    private final HlsMediaPlaylist b;
    private static final Pattern Y = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern Z = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern a0 = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern b0 = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern c0 = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern d0 = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern e0 = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern f0 = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern g0 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern h0 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern i0 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern j0 = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern k0 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern l0 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern m0 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern n0 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern o0 = b("CAN-SKIP-DATERANGES");
    private static final Pattern p0 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern q0 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern r0 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern s0 = b("CAN-BLOCK-RELOAD");
    private static final Pattern t0 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern u0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern v0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern w0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern x0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern y0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern z0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern A0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern B0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern C0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern D0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern E0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern F0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern G0 = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern H0 = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern I0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern J0 = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern K0 = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern L0 = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern M0 = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern N0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern O0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern P0 = b("AUTOSELECT");
    private static final Pattern Q0 = b(MessengerShareContentUtility.PREVIEW_DEFAULT);
    private static final Pattern R0 = b("FORCED");
    private static final Pattern S0 = b("INDEPENDENT");
    private static final Pattern T0 = b("GAP");
    private static final Pattern U0 = b("PRECISE");
    private static final Pattern V0 = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern W0 = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern X0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class DeltaUpdateException extends IOException {
    }

    public static class a {
        private final BufferedReader a;
        private final Queue<String> b;

        @Nullable
        private String c;

        public a(Queue<String> extraLines, BufferedReader reader) {
            this.b = extraLines;
            this.a = reader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        public boolean a() throws IOException {
            String strTrim;
            if (this.c != null) {
                return true;
            }
            if (!this.b.isEmpty()) {
                this.c = (String) Assertions.checkNotNull(this.b.poll());
                return true;
            }
            do {
                String line = this.a.readLine();
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
        this(HlsMasterPlaylist.EMPTY, null);
    }

    private static boolean a(BufferedReader reader) throws IOException {
        int i2 = reader.read();
        if (i2 == 239) {
            if (reader.read() != 187 || reader.read() != 191) {
                return false;
            }
            i2 = reader.read();
        }
        int iZ = z(reader, true, i2);
        for (int i3 = 0; i3 < 7; i3++) {
            if (iZ != d.charAt(i3)) {
                return false;
            }
            iZ = reader.read();
        }
        return Util.isLinebreak(z(reader, false, iZ));
    }

    private static Pattern b(String attribute) {
        StringBuilder sb = new StringBuilder(String.valueOf(attribute).length() + 9);
        sb.append(attribute);
        sb.append("=(");
        sb.append(W);
        sb.append(AESEncryptionHelper.SEPARATOR);
        sb.append(V);
        sb.append(")");
        return Pattern.compile(sb.toString());
    }

    private static DrmInitData c(@Nullable String encryptionScheme, DrmInitData.SchemeData[] schemeDatas) {
        DrmInitData.SchemeData[] schemeDataArr = new DrmInitData.SchemeData[schemeDatas.length];
        for (int i2 = 0; i2 < schemeDatas.length; i2++) {
            schemeDataArr[i2] = schemeDatas[i2].copyWithData(null);
        }
        return new DrmInitData(encryptionScheme, schemeDataArr);
    }

    @Nullable
    private static String d(long segmentMediaSequence, @Nullable String fullSegmentEncryptionKeyUri, @Nullable String fullSegmentEncryptionIV) {
        if (fullSegmentEncryptionKeyUri == null) {
            return null;
        }
        return fullSegmentEncryptionIV != null ? fullSegmentEncryptionIV : Long.toHexString(segmentMediaSequence);
    }

    @Nullable
    private static HlsMasterPlaylist.Variant e(ArrayList<HlsMasterPlaylist.Variant> variants, String groupId) {
        for (int i2 = 0; i2 < variants.size(); i2++) {
            HlsMasterPlaylist.Variant variant = variants.get(i2);
            if (groupId.equals(variant.audioGroupId)) {
                return variant;
            }
        }
        return null;
    }

    @Nullable
    private static HlsMasterPlaylist.Variant f(ArrayList<HlsMasterPlaylist.Variant> variants, String groupId) {
        for (int i2 = 0; i2 < variants.size(); i2++) {
            HlsMasterPlaylist.Variant variant = variants.get(i2);
            if (groupId.equals(variant.subtitleGroupId)) {
                return variant;
            }
        }
        return null;
    }

    @Nullable
    private static HlsMasterPlaylist.Variant g(ArrayList<HlsMasterPlaylist.Variant> variants, String groupId) {
        for (int i2 = 0; i2 < variants.size(); i2++) {
            HlsMasterPlaylist.Variant variant = variants.get(i2);
            if (groupId.equals(variant.videoGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static double h(String line, Pattern pattern) throws ParserException {
        return Double.parseDouble(x(line, pattern, Collections.emptyMap()));
    }

    @Nullable
    private static DrmInitData.SchemeData i(String line, String keyFormat, Map<String, String> variableDefinitions) throws ParserException {
        String strS = s(line, F0, "1", variableDefinitions);
        if (T.equals(keyFormat)) {
            String strX = x(line, G0, variableDefinitions);
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, MimeTypes.VIDEO_MP4, Base64.decode(strX.substring(strX.indexOf(44)), 0));
        }
        if (U.equals(keyFormat)) {
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "hls", Util.getUtf8Bytes(line));
        }
        if (!R.equals(keyFormat) || !"1".equals(strS)) {
            return null;
        }
        String strX2 = x(line, G0, variableDefinitions);
        byte[] bArrDecode = Base64.decode(strX2.substring(strX2.indexOf(44)), 0);
        UUID uuid = C.PLAYREADY_UUID;
        return new DrmInitData.SchemeData(uuid, MimeTypes.VIDEO_MP4, PsshAtomUtil.buildPsshAtom(uuid, bArrDecode));
    }

    private static String j(String method) {
        return (P.equals(method) || Q.equals(method)) ? C.CENC_TYPE_cenc : C.CENC_TYPE_cbcs;
    }

    private static int k(String line, Pattern pattern) throws ParserException {
        return Integer.parseInt(x(line, pattern, Collections.emptyMap()));
    }

    private static long l(String line, Pattern pattern) throws ParserException {
        return Long.parseLong(x(line, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:79:0x033d  */
    private static HlsMasterPlaylist m(a iterator, String baseUri) throws IOException {
        ArrayList arrayList;
        String mediaMimeType;
        int i2;
        String str;
        String mediaMimeType2;
        int i3;
        int i4;
        Uri uriResolveToUri;
        HashMap map;
        int i5;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            boolean zA = iterator.a();
            String str2 = MimeTypes.APPLICATION_M3U8;
            if (!zA) {
                HashMap map4 = map2;
                ArrayList arrayList10 = arrayList7;
                ArrayList arrayList11 = arrayList3;
                ArrayList arrayList12 = arrayList4;
                ArrayList arrayList13 = arrayList5;
                ArrayList arrayList14 = arrayList6;
                ArrayList arrayList15 = arrayList9;
                boolean z4 = z2;
                ArrayList arrayList16 = arrayList8;
                ArrayList arrayList17 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    HlsMasterPlaylist.Variant variant = (HlsMasterPlaylist.Variant) arrayList2.get(i6);
                    if (hashSet.add(variant.url)) {
                        Assertions.checkState(variant.format.metadata == null);
                        arrayList17.add(variant.copyWithFormat(variant.format.buildUpon().setMetadata(new Metadata(new HlsTrackMetadataEntry(null, null, (List) Assertions.checkNotNull((ArrayList) map4.get(variant.url))))).build()));
                    }
                }
                Uri uri = null;
                ArrayList arrayList18 = null;
                Format formatBuild = null;
                int i7 = 0;
                while (i7 < arrayList10.size()) {
                    ArrayList arrayList19 = arrayList10;
                    String str3 = (String) arrayList19.get(i7);
                    String strX = x(str3, M0, map3);
                    String strX2 = x(str3, L0, map3);
                    Format.Builder builder = new Format.Builder();
                    StringBuilder sb = new StringBuilder(String.valueOf(strX).length() + 1 + String.valueOf(strX2).length());
                    sb.append(strX);
                    sb.append(":");
                    sb.append(strX2);
                    Format.Builder language = builder.setId(sb.toString()).setLabel(strX2).setContainerMimeType(str2).setSelectionFlags(v(str3)).setRoleFlags(u(str3, map3)).setLanguage(t(str3, K0, map3));
                    String strT = t(str3, G0, map3);
                    Uri uriResolveToUri2 = strT == null ? uri : UriUtil.resolveToUri(baseUri, strT);
                    arrayList10 = arrayList19;
                    String str4 = str2;
                    Metadata metadata = new Metadata(new HlsTrackMetadataEntry(strX, strX2, Collections.emptyList()));
                    String strX3 = x(str3, I0, map3);
                    strX3.hashCode();
                    switch (strX3) {
                        case "SUBTITLES":
                            formatBuild = formatBuild;
                            arrayList12 = arrayList12;
                            arrayList = arrayList11;
                            HlsMasterPlaylist.Variant variantF = f(arrayList2, strX);
                            if (variantF != null) {
                                String codecsOfType = Util.getCodecsOfType(variantF.format.codecs, 3);
                                language.setCodecs(codecsOfType);
                                mediaMimeType = MimeTypes.getMediaMimeType(codecsOfType);
                            } else {
                                mediaMimeType = null;
                            }
                            if (mediaMimeType == null) {
                                mediaMimeType = MimeTypes.TEXT_VTT;
                            }
                            language.setSampleMimeType(mediaMimeType).setMetadata(metadata);
                            if (uriResolveToUri2 != null) {
                                HlsMasterPlaylist.Rendition rendition = new HlsMasterPlaylist.Rendition(uriResolveToUri2, language.build(), strX, strX2);
                                arrayList13 = arrayList13;
                                arrayList13.add(rendition);
                                break;
                            } else {
                                arrayList13 = arrayList13;
                                Log.w(c, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                            break;
                        case "CLOSED-CAPTIONS":
                            formatBuild = formatBuild;
                            arrayList12 = arrayList12;
                            arrayList = arrayList11;
                            String strX4 = x(str3, O0, map3);
                            if (strX4.startsWith("CC")) {
                                i2 = Integer.parseInt(strX4.substring(2));
                                str = MimeTypes.APPLICATION_CEA608;
                            } else {
                                i2 = Integer.parseInt(strX4.substring(7));
                                str = MimeTypes.APPLICATION_CEA708;
                            }
                            if (arrayList18 == null) {
                                arrayList18 = new ArrayList();
                            }
                            language.setSampleMimeType(str).setAccessibilityChannel(i2);
                            arrayList18.add(language.build());
                            arrayList13 = arrayList13;
                            break;
                        case "AUDIO":
                            arrayList = arrayList11;
                            HlsMasterPlaylist.Variant variantE = e(arrayList2, strX);
                            if (variantE != null) {
                                String codecsOfType2 = Util.getCodecsOfType(variantE.format.codecs, 1);
                                language.setCodecs(codecsOfType2);
                                mediaMimeType2 = MimeTypes.getMediaMimeType(codecsOfType2);
                            } else {
                                mediaMimeType2 = null;
                            }
                            String strT2 = t(str3, e0, map3);
                            if (strT2 != null) {
                                language.setChannelCount(Integer.parseInt(Util.splitAtFirst(strT2, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)[0]));
                                if (MimeTypes.AUDIO_E_AC3.equals(mediaMimeType2) && strT2.endsWith("/JOC")) {
                                    language.setCodecs(Ac3Util.E_AC3_JOC_CODEC_STRING);
                                    mediaMimeType2 = MimeTypes.AUDIO_E_AC3_JOC;
                                }
                            }
                            language.setSampleMimeType(mediaMimeType2);
                            if (uriResolveToUri2 != null) {
                                language.setMetadata(metadata);
                                arrayList12 = arrayList12;
                                arrayList12.add(new HlsMasterPlaylist.Rendition(uriResolveToUri2, language.build(), strX, strX2));
                            } else {
                                arrayList12 = arrayList12;
                                if (variantE != null) {
                                    formatBuild = language.build();
                                }
                            }
                            arrayList13 = arrayList13;
                            break;
                        case "VIDEO":
                            HlsMasterPlaylist.Variant variantG = g(arrayList2, strX);
                            if (variantG != null) {
                                Format format = variantG.format;
                                String codecsOfType3 = Util.getCodecsOfType(format.codecs, 2);
                                language.setCodecs(codecsOfType3).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType3)).setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate);
                            }
                            if (uriResolveToUri2 != null) {
                                language.setMetadata(metadata);
                                arrayList = arrayList11;
                                arrayList.add(new HlsMasterPlaylist.Rendition(uriResolveToUri2, language.build(), strX, strX2));
                            }
                        default:
                            arrayList = arrayList11;
                            break;
                    }
                    i7++;
                    arrayList13 = arrayList13;
                    arrayList12 = arrayList12;
                    arrayList11 = arrayList;
                    str2 = str4;
                    formatBuild = formatBuild;
                    uri = null;
                }
                return new HlsMasterPlaylist(baseUri, arrayList15, arrayList17, arrayList11, arrayList12, arrayList13, arrayList14, formatBuild, z3 ? Collections.emptyList() : arrayList18, z4, map3, arrayList16);
            }
            String strB = iterator.b();
            if (strB.startsWith(e)) {
                arrayList9.add(strB);
            }
            boolean zStartsWith = strB.startsWith(m);
            boolean z5 = z2;
            if (strB.startsWith(h)) {
                map3.put(x(strB, L0, map3), x(strB, V0, map3));
            } else {
                if (strB.equals(u)) {
                    map = map2;
                    arrayList3 = arrayList3;
                    arrayList5 = arrayList5;
                    z2 = true;
                } else if (strB.startsWith(o)) {
                    arrayList7.add(strB);
                } else if (strB.startsWith(A)) {
                    DrmInitData.SchemeData schemeDataI = i(strB, s(strB, E0, "identity", map3), map3);
                    if (schemeDataI != null) {
                        arrayList8.add(new DrmInitData(j(x(strB, D0, map3)), schemeDataI));
                    }
                } else if (strB.startsWith(j) || zStartsWith) {
                    boolean zContains = z3 | strB.contains(X);
                    int i8 = zStartsWith ? 16384 : 0;
                    int iK = k(strB, d0);
                    int iQ = q(strB, Y, -1);
                    String strT3 = t(strB, f0, map3);
                    String strT4 = t(strB, g0, map3);
                    if (strT4 != null) {
                        String[] strArrSplit = Util.split(strT4, "x");
                        int i9 = Integer.parseInt(strArrSplit[0]);
                        int i10 = Integer.parseInt(strArrSplit[1]);
                        if (i9 <= 0 || i10 <= 0) {
                            i10 = -1;
                            i5 = -1;
                        } else {
                            i5 = i9;
                        }
                        i4 = i10;
                        i3 = i5;
                    } else {
                        i3 = -1;
                        i4 = -1;
                    }
                    String strT5 = t(strB, h0, map3);
                    float f2 = strT5 != null ? Float.parseFloat(strT5) : -1.0f;
                    String strT6 = t(strB, Z, map3);
                    String strT7 = t(strB, a0, map3);
                    HashMap map5 = map2;
                    String strT8 = t(strB, b0, map3);
                    String strT9 = t(strB, c0, map3);
                    if (zStartsWith) {
                        uriResolveToUri = UriUtil.resolveToUri(baseUri, x(strB, G0, map3));
                    } else {
                        if (!iterator.a()) {
                            throw ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriResolveToUri = UriUtil.resolveToUri(baseUri, y(iterator.b(), map3));
                    }
                    arrayList2.add(new HlsMasterPlaylist.Variant(uriResolveToUri, new Format.Builder().setId(arrayList2.size()).setContainerMimeType(MimeTypes.APPLICATION_M3U8).setCodecs(strT3).setAverageBitrate(iQ).setPeakBitrate(iK).setWidth(i3).setHeight(i4).setFrameRate(f2).setRoleFlags(i8).build(), strT6, strT7, strT8, strT9));
                    map = map5;
                    ArrayList arrayList20 = (ArrayList) map.get(uriResolveToUri);
                    if (arrayList20 == null) {
                        arrayList20 = new ArrayList();
                        map.put(uriResolveToUri, arrayList20);
                    }
                    arrayList20.add(new HlsTrackMetadataEntry.VariantInfo(iQ, iK, strT6, strT7, strT8, strT9));
                    z2 = z5;
                    z3 = zContains;
                }
                map2 = map;
                arrayList8 = arrayList8;
                arrayList6 = arrayList6;
                arrayList9 = arrayList9;
                arrayList5 = arrayList5;
                arrayList4 = arrayList4;
                arrayList3 = arrayList3;
                arrayList7 = arrayList7;
            }
            map = map2;
            arrayList3 = arrayList3;
            arrayList5 = arrayList5;
            z2 = z5;
            map2 = map;
            arrayList8 = arrayList8;
            arrayList6 = arrayList6;
            arrayList9 = arrayList9;
            arrayList5 = arrayList5;
            arrayList4 = arrayList4;
            arrayList3 = arrayList3;
            arrayList7 = arrayList7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0315 A[PHI: r79
      0x0315: PHI (r79v12 java.lang.String) = (r79v10 java.lang.String), (r79v1 java.lang.String) binds: [B:117:0x032b, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]] */
    private static HlsMediaPlaylist n(HlsMasterPlaylist hlsMasterPlaylist, @Nullable HlsMediaPlaylist hlsMediaPlaylist, a aVar, String str) throws IOException {
        ArrayList arrayList;
        String str2;
        HlsMediaPlaylist.Part part;
        String str3;
        String str4;
        String strX;
        String str5;
        long j2;
        long j3;
        HlsMediaPlaylist.Segment segment;
        DrmInitData drmInitData;
        hlsMasterPlaylist = hlsMasterPlaylist;
        hlsMediaPlaylist = hlsMediaPlaylist;
        boolean z2 = hlsMasterPlaylist.hasIndependentSegments;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap map3 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        HlsMediaPlaylist.ServerControl serverControl = new HlsMediaPlaylist.ServerControl(C.TIME_UNSET, false, C.TIME_UNSET, C.TIME_UNSET, false);
        TreeMap treeMap = new TreeMap();
        String str6 = "";
        boolean z3 = z2;
        HlsMediaPlaylist.ServerControl serverControlW = serverControl;
        String strS = "";
        long jMsToUs = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long jL = 0;
        long j8 = 0;
        long j9 = 0;
        boolean zO = false;
        int i2 = 0;
        long j10 = C.TIME_UNSET;
        boolean z4 = false;
        int i3 = 0;
        int iK = 1;
        long jK = C.TIME_UNSET;
        long jH = C.TIME_UNSET;
        boolean z5 = false;
        DrmInitData drmInitDataC = null;
        DrmInitData drmInitData2 = null;
        boolean z6 = false;
        HlsMediaPlaylist.Part part2 = null;
        String str7 = null;
        long j11 = -1;
        String str8 = null;
        String strJ = null;
        int i4 = 0;
        boolean z7 = false;
        HlsMediaPlaylist.Segment segment2 = null;
        while (aVar.a()) {
            String strB = aVar.b();
            if (strB.startsWith(e)) {
                arrayList4.add(strB);
            }
            if (strB.startsWith(g)) {
                String strX2 = x(strB, m0, map);
                if ("VOD".equals(strX2)) {
                    i2 = 1;
                } else if ("EVENT".equals(strX2)) {
                    i2 = 2;
                }
            } else if (strB.equals(n)) {
                z7 = true;
            } else if (strB.startsWith(x)) {
                long jH2 = (long) (h(strB, y0) * 1000000.0d);
                zO = o(strB, U0, false);
                j10 = jH2;
            } else if (strB.startsWith(i)) {
                serverControlW = w(strB);
            } else if (strB.startsWith(k)) {
                jH = (long) (h(strB, k0) * 1000000.0d);
            } else if (strB.startsWith(t)) {
                String strX3 = x(strB, G0, map);
                String strT = t(strB, A0, map);
                if (strT != null) {
                    String[] strArrSplit = Util.split(strT, "@");
                    j11 = Long.parseLong(strArrSplit[0]);
                    if (strArrSplit.length > 1) {
                        j5 = Long.parseLong(strArrSplit[1]);
                    }
                }
                if (j11 == -1) {
                    j5 = 0;
                }
                String str9 = str7;
                String str10 = str8;
                if (str9 != null && str10 == null) {
                    throw ParserException.createForMalformedManifest("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                }
                segment2 = new HlsMediaPlaylist.Segment(strX3, j5, j11, str9, str10);
                if (j11 != -1) {
                    j5 += j11;
                }
                str7 = str9;
                str8 = str10;
                j11 = -1;
            } else {
                String str11 = str7;
                str8 = str8;
                zO = zO;
                if (strB.startsWith(p)) {
                    jK = 1000000 * ((long) k(strB, i0));
                } else if (strB.startsWith(w)) {
                    jL = l(strB, t0);
                    j4 = jL;
                    str7 = str11;
                } else if (strB.startsWith(f)) {
                    iK = k(strB, l0);
                } else {
                    if (strB.startsWith(h)) {
                        String strT2 = t(strB, W0, map);
                        if (strT2 != null) {
                            String str12 = hlsMasterPlaylist.variableDefinitions.get(strT2);
                            if (str12 != null) {
                                map.put(strT2, str12);
                            }
                        } else {
                            map.put(x(strB, L0, map), x(strB, V0, map));
                        }
                        arrayList = arrayList4;
                        str6 = str6;
                        str2 = str11;
                        part = part2;
                        jL = jL;
                        map3 = map3;
                        str3 = strJ;
                    } else {
                        if (strB.startsWith(v)) {
                            double dH = h(strB, u0);
                            str4 = str11;
                            strS = s(strB, v0, str6, map);
                            j8 = (long) (dH * 1000000.0d);
                            str8 = str8;
                        } else {
                            str4 = str11;
                            if (strB.startsWith(D)) {
                                int iK2 = k(strB, p0);
                                Assertions.checkState(hlsMediaPlaylist != null && arrayList2.isEmpty());
                                int i5 = (int) (j4 - ((HlsMediaPlaylist) Util.castNonNull(hlsMediaPlaylist)).mediaSequence);
                                int i6 = iK2 + i5;
                                if (i5 < 0 || i6 > hlsMediaPlaylist.segments.size()) {
                                    throw new DeltaUpdateException();
                                }
                                str8 = str8;
                                long j12 = j7;
                                while (i5 < i6) {
                                    HlsMediaPlaylist.Segment segmentCopyWith = hlsMediaPlaylist.segments.get(i5);
                                    String str13 = str6;
                                    if (j4 != hlsMediaPlaylist.mediaSequence) {
                                        segmentCopyWith = segmentCopyWith.copyWith(j12, (hlsMediaPlaylist.discontinuitySequence - i3) + segmentCopyWith.relativeDiscontinuitySequence);
                                    }
                                    arrayList2.add(segmentCopyWith);
                                    j12 += segmentCopyWith.durationUs;
                                    long j13 = segmentCopyWith.byteRangeLength;
                                    int i7 = i6;
                                    if (j13 != -1) {
                                        j5 = segmentCopyWith.byteRangeOffset + j13;
                                    }
                                    int i8 = segmentCopyWith.relativeDiscontinuitySequence;
                                    HlsMediaPlaylist.Segment segment3 = segmentCopyWith.initializationSegment;
                                    DrmInitData drmInitData3 = segmentCopyWith.drmInitData;
                                    String str14 = segmentCopyWith.fullSegmentEncryptionKeyUri;
                                    String str15 = segmentCopyWith.encryptionIV;
                                    if (str15 == null || !str15.equals(Long.toHexString(jL))) {
                                        str8 = segmentCopyWith.encryptionIV;
                                    }
                                    jL++;
                                    i5++;
                                    hlsMediaPlaylist = hlsMediaPlaylist;
                                    str4 = str14;
                                    j6 = j12;
                                    i4 = i8;
                                    i6 = i7;
                                    segment2 = segment3;
                                    drmInitData2 = drmInitData3;
                                    str6 = str13;
                                }
                                hlsMediaPlaylist = hlsMediaPlaylist;
                                j7 = j12;
                            } else {
                                str6 = str6;
                                if (strB.startsWith(z)) {
                                    String strX4 = x(strB, D0, map);
                                    String strS2 = s(strB, E0, "identity", map);
                                    if ("NONE".equals(strX4)) {
                                        treeMap.clear();
                                        strX = null;
                                        drmInitData2 = null;
                                        str8 = null;
                                    } else {
                                        String strT3 = t(strB, H0, map);
                                        if (!"identity".equals(strS2)) {
                                            String str16 = strJ;
                                            strJ = str16 == null ? j(strX4) : str16;
                                            DrmInitData.SchemeData schemeDataI = i(strB, strS2, map);
                                            if (schemeDataI != null) {
                                                treeMap.put(strS2, schemeDataI);
                                                str8 = strT3;
                                                strX = null;
                                                drmInitData2 = null;
                                            } else {
                                                str8 = strT3;
                                                strX = null;
                                            }
                                        } else if (N.equals(strX4)) {
                                            strX = x(strB, G0, map);
                                            str8 = strT3;
                                        } else {
                                            str8 = strT3;
                                            strX = null;
                                        }
                                    }
                                    str7 = strX;
                                } else {
                                    String str17 = strJ;
                                    if (strB.startsWith(B)) {
                                        String[] strArrSplit2 = Util.split(x(strB, z0, map), "@");
                                        j11 = Long.parseLong(strArrSplit2[0]);
                                        if (strArrSplit2.length > 1) {
                                            j5 = Long.parseLong(strArrSplit2[1]);
                                        }
                                    } else if (strB.startsWith(r)) {
                                        i3 = Integer.parseInt(strB.substring(strB.indexOf(58) + 1));
                                        hlsMediaPlaylist = hlsMediaPlaylist;
                                        strJ = str17;
                                        str8 = str8;
                                        str6 = str6;
                                        z4 = true;
                                    } else if (strB.equals(q)) {
                                        i4++;
                                    } else if (strB.startsWith(s)) {
                                        if (jMsToUs == 0) {
                                            jMsToUs = C.msToUs(Util.parseXsDateTime(strB.substring(strB.indexOf(58) + 1))) - j7;
                                        } else {
                                            str2 = str4;
                                            arrayList = arrayList4;
                                            jL = jL;
                                            HashMap map4 = map3;
                                            str3 = str17;
                                            part = part2;
                                            map3 = map4;
                                        }
                                    } else if (strB.equals(C)) {
                                        hlsMediaPlaylist = hlsMediaPlaylist;
                                        strJ = str17;
                                        str8 = str8;
                                        str6 = str6;
                                        z6 = true;
                                    } else if (strB.equals(u)) {
                                        hlsMediaPlaylist = hlsMediaPlaylist;
                                        strJ = str17;
                                        str8 = str8;
                                        str6 = str6;
                                        z3 = true;
                                    } else if (strB.equals(y)) {
                                        hlsMediaPlaylist = hlsMediaPlaylist;
                                        strJ = str17;
                                        str8 = str8;
                                        str6 = str6;
                                        z5 = true;
                                    } else {
                                        if (strB.startsWith(F)) {
                                            str2 = str4;
                                            long jR = r(strB, w0, (j4 + ((long) arrayList2.size())) - (arrayList3.isEmpty() ? 1L : 0L));
                                            int iQ = q(strB, x0, jH != C.TIME_UNSET ? (arrayList3.isEmpty() ? ((HlsMediaPlaylist.Segment) Iterables.getLast(arrayList2)).parts : arrayList3).size() - 1 : -1);
                                            Uri uri = Uri.parse(UriUtil.resolve(str, x(strB, G0, map)));
                                            map3.put(uri, new HlsMediaPlaylist.RenditionReport(uri, jR, iQ));
                                            part = part2;
                                            str3 = str17;
                                        } else {
                                            str2 = str4;
                                            if (strB.startsWith(E)) {
                                                HlsMediaPlaylist.Part part3 = part2;
                                                if (part3 == null && K.equals(x(strB, J0, map))) {
                                                    String strX5 = x(strB, G0, map);
                                                    long jR2 = r(strB, B0, -1L);
                                                    HashMap map5 = map3;
                                                    long jR3 = r(strB, C0, -1L);
                                                    long j14 = jL;
                                                    String strD = d(j14, str2, str8);
                                                    if (drmInitData2 != null || treeMap.isEmpty()) {
                                                        str5 = str17;
                                                    } else {
                                                        DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        str5 = str17;
                                                        DrmInitData drmInitData4 = new DrmInitData(str5, schemeDataArr);
                                                        if (drmInitDataC == null) {
                                                            drmInitDataC = c(str5, schemeDataArr);
                                                        }
                                                        drmInitData2 = drmInitData4;
                                                    }
                                                    if (jR2 == -1 || jR3 != -1) {
                                                        part3 = new HlsMediaPlaylist.Part(strX5, segment2, 0L, i4, j6, drmInitData2, str2, strD, jR2 != -1 ? jR2 : 0L, jR3, false, false, true);
                                                    }
                                                    str8 = str8;
                                                    strJ = str5;
                                                    jL = j14;
                                                    map3 = map5;
                                                    part2 = part3;
                                                    str7 = str2;
                                                } else {
                                                    part = part3;
                                                    str3 = str17;
                                                }
                                            } else {
                                                HlsMediaPlaylist.Part part4 = part2;
                                                long j15 = jL;
                                                map3 = map3;
                                                str3 = str17;
                                                if (strB.startsWith(l)) {
                                                    String strD2 = d(j15, str2, str8);
                                                    String strX6 = x(strB, G0, map);
                                                    part = part4;
                                                    long jH3 = (long) (h(strB, j0) * 1000000.0d);
                                                    ArrayList arrayList5 = arrayList4;
                                                    boolean zO2 = o(strB, S0, false) | (z3 && arrayList3.isEmpty());
                                                    boolean zO3 = o(strB, T0, false);
                                                    String strT4 = t(strB, A0, map);
                                                    if (strT4 != null) {
                                                        String[] strArrSplit3 = Util.split(strT4, "@");
                                                        j2 = Long.parseLong(strArrSplit3[0]);
                                                        if (strArrSplit3.length > 1) {
                                                            j9 = Long.parseLong(strArrSplit3[1]);
                                                        }
                                                    } else {
                                                        j2 = -1;
                                                    }
                                                    if (j2 == -1) {
                                                        j9 = 0;
                                                    }
                                                    if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                        DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        DrmInitData drmInitData5 = new DrmInitData(str3, schemeDataArr2);
                                                        if (drmInitDataC == null) {
                                                            drmInitDataC = c(str3, schemeDataArr2);
                                                        }
                                                        drmInitData2 = drmInitData5;
                                                    }
                                                    arrayList3.add(new HlsMediaPlaylist.Part(strX6, segment2, jH3, i4, j6, drmInitData2, str2, strD2, j9, j2, zO3, zO2, false));
                                                    j6 += jH3;
                                                    if (j2 != -1) {
                                                        j9 += j2;
                                                    }
                                                    strJ = str3;
                                                    jL = j15;
                                                    map3 = map3;
                                                    arrayList4 = arrayList5;
                                                    str7 = str2;
                                                    part2 = part;
                                                    str8 = str8;
                                                    str6 = str6;
                                                } else {
                                                    part = part4;
                                                    arrayList = arrayList4;
                                                    if (strB.startsWith(UpdateUtils.CMD_FILTER)) {
                                                        jL = j15;
                                                    } else {
                                                        String strD3 = d(j15, str2, str8);
                                                        jL = j15 + 1;
                                                        String strY = y(strB, map);
                                                        HlsMediaPlaylist.Segment segment4 = (HlsMediaPlaylist.Segment) map2.get(strY);
                                                        if (j11 == -1) {
                                                            j3 = 0;
                                                        } else {
                                                            if (z7 && segment2 == null && segment4 == null) {
                                                                segment4 = new HlsMediaPlaylist.Segment(strY, 0L, j5, null, null);
                                                                map2.put(strY, segment4);
                                                            }
                                                            j3 = j5;
                                                        }
                                                        if (drmInitData2 != null || treeMap.isEmpty()) {
                                                            segment = segment4;
                                                            drmInitData = drmInitData2;
                                                        } else {
                                                            segment = segment4;
                                                            DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                            drmInitData = new DrmInitData(str3, schemeDataArr3);
                                                            if (drmInitDataC == null) {
                                                                drmInitDataC = c(str3, schemeDataArr3);
                                                            }
                                                        }
                                                        arrayList2.add(new HlsMediaPlaylist.Segment(strY, segment2 != null ? segment2 : segment, strS, j8, i4, j7, drmInitData, str2, strD3, j3, j11, z6, arrayList3));
                                                        j6 = j7 + j8;
                                                        arrayList3 = new ArrayList();
                                                        if (j11 != -1) {
                                                            j3 += j11;
                                                        }
                                                        j5 = j3;
                                                        hlsMasterPlaylist = hlsMasterPlaylist;
                                                        hlsMediaPlaylist = hlsMediaPlaylist;
                                                        drmInitData2 = drmInitData;
                                                        strJ = str3;
                                                        j8 = 0;
                                                        j7 = j6;
                                                        map3 = map3;
                                                        zO = zO;
                                                        arrayList4 = arrayList;
                                                        strS = str6;
                                                        z6 = false;
                                                        j11 = -1;
                                                        str7 = str2;
                                                        part2 = part;
                                                        str8 = str8;
                                                        str6 = strS;
                                                    }
                                                }
                                            }
                                        }
                                        arrayList = arrayList4;
                                    }
                                    hlsMediaPlaylist = hlsMediaPlaylist;
                                    strJ = str17;
                                    str8 = str8;
                                    str6 = str6;
                                }
                                hlsMasterPlaylist = hlsMasterPlaylist;
                            }
                        }
                        str7 = str4;
                        zO = zO;
                    }
                    jL = jL;
                    strJ = str3;
                    map3 = map3;
                    arrayList4 = arrayList;
                    str7 = str2;
                    part2 = part;
                    str8 = str8;
                    str6 = str6;
                }
                str7 = str11;
            }
        }
        boolean z8 = zO;
        ArrayList arrayList6 = arrayList4;
        HlsMediaPlaylist.Part part5 = part2;
        HashMap map6 = map3;
        if (part5 != null) {
            arrayList3.add(part5);
        }
        return new HlsMediaPlaylist(i2, str, arrayList6, j10, z8, jMsToUs, z4, i3, j4, iK, jK, jH, z3, z5, jMsToUs != 0, drmInitDataC, arrayList2, arrayList3, serverControlW, map6);
    }

    private static boolean o(String line, Pattern pattern, boolean defaultValue) {
        Matcher matcher = pattern.matcher(line);
        return matcher.find() ? V.equals(matcher.group(1)) : defaultValue;
    }

    private static double p(String line, Pattern pattern, double defaultValue) {
        Matcher matcher = pattern.matcher(line);
        return matcher.find() ? Double.parseDouble((String) Assertions.checkNotNull(matcher.group(1))) : defaultValue;
    }

    private static int q(String line, Pattern pattern, int defaultValue) {
        Matcher matcher = pattern.matcher(line);
        return matcher.find() ? Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))) : defaultValue;
    }

    private static long r(String line, Pattern pattern, long defaultValue) {
        Matcher matcher = pattern.matcher(line);
        return matcher.find() ? Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) : defaultValue;
    }

    private static String s(String line, Pattern pattern, String defaultValue, Map<String, String> variableDefinitions) {
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            defaultValue = (String) Assertions.checkNotNull(matcher.group(1));
        }
        return (variableDefinitions.isEmpty() || defaultValue == null) ? defaultValue : y(defaultValue, variableDefinitions);
    }

    @Nullable
    private static String t(String line, Pattern pattern, Map<String, String> variableDefinitions) {
        return s(line, pattern, null, variableDefinitions);
    }

    private static int u(String line, Map<String, String> variableDefinitions) {
        String strT = t(line, N0, variableDefinitions);
        if (TextUtils.isEmpty(strT)) {
            return 0;
        }
        String[] strArrSplit = Util.split(strT, ",");
        int i2 = Util.contains(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
        if (Util.contains(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
            i2 |= 4096;
        }
        if (Util.contains(strArrSplit, "public.accessibility.describes-music-and-sound")) {
            i2 |= 1024;
        }
        return Util.contains(strArrSplit, "public.easy-to-read") ? i2 | 8192 : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int v(String str) {
        boolean zO = o(str, Q0, false);
        ?? r1 = zO;
        if (o(str, R0, false)) {
            r1 = (zO ? 1 : 0) | 2;
        }
        return o(str, P0, false) ? r1 | 4 : r1;
    }

    private static HlsMediaPlaylist.ServerControl w(String line) {
        double dP = p(line, n0, -9.223372036854776E18d);
        long j2 = C.TIME_UNSET;
        long j3 = dP == -9.223372036854776E18d ? -9223372036854775807L : (long) (dP * 1000000.0d);
        boolean zO = o(line, o0, false);
        double dP2 = p(line, q0, -9.223372036854776E18d);
        long j4 = dP2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dP2 * 1000000.0d);
        double dP3 = p(line, r0, -9.223372036854776E18d);
        if (dP3 != -9.223372036854776E18d) {
            j2 = (long) (dP3 * 1000000.0d);
        }
        return new HlsMediaPlaylist.ServerControl(j3, zO, j4, j2, o(line, s0, false));
    }

    private static String x(String line, Pattern pattern, Map<String, String> variableDefinitions) throws ParserException {
        String strT = t(line, pattern, variableDefinitions);
        if (strT != null) {
            return strT;
        }
        String strPattern = pattern.pattern();
        StringBuilder sb = new StringBuilder(String.valueOf(strPattern).length() + 19 + String.valueOf(line).length());
        sb.append("Couldn't match ");
        sb.append(strPattern);
        sb.append(" in ");
        sb.append(line);
        throw ParserException.createForMalformedManifest(sb.toString(), null);
    }

    private static String y(String string, Map<String, String> variableDefinitions) {
        Matcher matcher = X0.matcher(string);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (variableDefinitions.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(variableDefinitions.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int z(BufferedReader reader, boolean skipLinebreaks, int c2) throws IOException {
        while (c2 != -1 && Character.isWhitespace(c2) && (skipLinebreaks || !Util.isLinebreak(c2))) {
            c2 = reader.read();
        }
        return c2;
    }

    public HlsPlaylistParser(HlsMasterPlaylist masterPlaylist, @Nullable HlsMediaPlaylist previousMediaPlaylist) {
        this.a = masterPlaylist;
        this.b = previousMediaPlaylist;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public HlsPlaylist parse(Uri uri, InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!a(bufferedReader)) {
                throw ParserException.createForMalformedManifest("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    Util.closeQuietly(bufferedReader);
                    throw ParserException.createForMalformedManifest("Failed to parse the playlist, could not identify any tags.", null);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith(j)) {
                        arrayDeque.add(strTrim);
                        HlsMasterPlaylist hlsMasterPlaylistM = m(new a(arrayDeque, bufferedReader), uri.toString());
                        Util.closeQuietly(bufferedReader);
                        return hlsMasterPlaylistM;
                    }
                    if (!strTrim.startsWith(p) && !strTrim.startsWith(w) && !strTrim.startsWith(v) && !strTrim.startsWith(z) && !strTrim.startsWith(B) && !strTrim.equals(q) && !strTrim.equals(r) && !strTrim.equals(y)) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    HlsMediaPlaylist hlsMediaPlaylistN = n(this.a, this.b, new a(arrayDeque, bufferedReader), uri.toString());
                    Util.closeQuietly(bufferedReader);
                    return hlsMediaPlaylistN;
                }
            }
        } catch (Throwable th) {
            Util.closeQuietly(bufferedReader);
            throw th;
        }
    }
}
