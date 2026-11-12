package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.hls.HlsTrackMetadataEntry;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import com.huawei.hms.support.hwid.common.constants.CommonConstant;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes21.dex */
public final class HlsPlaylistParser implements ParsingLoadable.Parser<HlsPlaylist> {
    private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final String BOOLEAN_FALSE = "NO";
    private static final String BOOLEAN_TRUE = "YES";
    private static final String KEYFORMAT_IDENTITY = "identity";
    private static final String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final String LOG_TAG = "HlsPlaylistParser";
    private static final String METHOD_AES_128 = "AES-128";
    private static final String METHOD_NONE = "NONE";
    private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final String PLAYLIST_HEADER = "#EXTM3U";
    private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final String TAG_GAP = "#EXT-X-GAP";
    private static final String TAG_IFRAME = "#EXT-X-I-FRAMES-ONLY";
    private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final String TAG_I_FRAME_STREAM_INF = "#EXT-X-I-FRAME-STREAM-INF";
    private static final String TAG_KEY = "#EXT-X-KEY";
    private static final String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final String TAG_MEDIA_DURATION = "#EXTINF";
    private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final String TAG_PART = "#EXT-X-PART";
    private static final String TAG_PART_INF = "#EXT-X-PART-INF";
    private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final String TAG_PREFIX = "#EXT";
    private static final String TAG_PRELOAD_HINT = "#EXT-X-PRELOAD-HINT";
    private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final String TAG_RENDITION_REPORT = "#EXT-X-RENDITION-REPORT";
    private static final String TAG_SERVER_CONTROL = "#EXT-X-SERVER-CONTROL";
    private static final String TAG_SESSION_KEY = "#EXT-X-SESSION-KEY";
    private static final String TAG_SKIP = "#EXT-X-SKIP";
    private static final String TAG_START = "#EXT-X-START";
    private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final String TAG_VERSION = "#EXT-X-VERSION";
    private static final String TYPE_AUDIO = "AUDIO";
    private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final String TYPE_MAP = "MAP";
    private static final String TYPE_PART = "PART";
    private static final String TYPE_SUBTITLES = "SUBTITLES";
    private static final String TYPE_VIDEO = "VIDEO";
    private final HlsMultivariantPlaylist multivariantPlaylist;
    private final HlsMediaPlaylist previousMediaPlaylist;
    private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_VIDEO = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern REGEX_AUDIO = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern REGEX_SUBTITLES = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern REGEX_CLOSED_CAPTIONS = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_CHANNELS = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern REGEX_CODECS = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern REGEX_ATTR_DURATION = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_TARGET_DURATION = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern REGEX_CAN_SKIP_UNTIL = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_SKIP_DATE_RANGES = compileBooleanAttrPattern("CAN-SKIP-DATERANGES");
    private static final Pattern REGEX_SKIPPED_SEGMENTS = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern REGEX_HOLD_BACK = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_HOLD_BACK = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_BLOCK_RELOAD = compileBooleanAttrPattern("CAN-BLOCK-RELOAD");
    private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern REGEX_MEDIA_TITLE = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern REGEX_LAST_MSN = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern REGEX_LAST_PART = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern REGEX_BYTERANGE_START = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern REGEX_BYTERANGE_LENGTH = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern REGEX_KEYFORMATVERSIONS = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern REGEX_URI = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern REGEX_IV = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern REGEX_PRELOAD_HINT_TYPE = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern REGEX_NAME = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern REGEX_CHARACTERISTICS = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final Pattern REGEX_DEFAULT = compileBooleanAttrPattern(CommonConstant.StartQrLoginQrValue.QRSCENE_DEFAULT);
    private static final Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final Pattern REGEX_INDEPENDENT = compileBooleanAttrPattern("INDEPENDENT");
    private static final Pattern REGEX_GAP = compileBooleanAttrPattern("GAP");
    private static final Pattern REGEX_PRECISE = compileBooleanAttrPattern("PRECISE");
    private static final Pattern REGEX_VALUE = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern REGEX_IMPORT = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern REGEX_VARIABLE_REFERENCE = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class DeltaUpdateException extends IOException {
    }

    public HlsPlaylistParser() {
        this(HlsMultivariantPlaylist.EMPTY, null);
    }

    public HlsPlaylistParser(HlsMultivariantPlaylist hlsMultivariantPlaylist, HlsMediaPlaylist hlsMediaPlaylist) {
        this.multivariantPlaylist = hlsMultivariantPlaylist;
        this.previousMediaPlaylist = hlsMediaPlaylist;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public HlsPlaylist parse(Uri uri, InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!checkPlaylistHeader(bufferedReader)) {
                throw ParserException.createForMalformedManifest("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    String strTrim = line.trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.startsWith(TAG_STREAM_INF)) {
                            arrayDeque.add(strTrim);
                            HlsMultivariantPlaylist multivariantPlaylist = parseMultivariantPlaylist(new LineIterator(arrayDeque, bufferedReader), uri.toString());
                            Util.closeQuietly(bufferedReader);
                            return multivariantPlaylist;
                        }
                        if (!strTrim.startsWith(TAG_TARGET_DURATION) && !strTrim.startsWith(TAG_MEDIA_SEQUENCE) && !strTrim.startsWith(TAG_MEDIA_DURATION) && !strTrim.startsWith(TAG_KEY) && !strTrim.startsWith(TAG_BYTERANGE) && !strTrim.equals(TAG_DISCONTINUITY) && !strTrim.equals(TAG_DISCONTINUITY_SEQUENCE) && !strTrim.equals(TAG_ENDLIST)) {
                            arrayDeque.add(strTrim);
                        }
                        arrayDeque.add(strTrim);
                        HlsMediaPlaylist mediaPlaylist = parseMediaPlaylist(this.multivariantPlaylist, this.previousMediaPlaylist, new LineIterator(arrayDeque, bufferedReader), uri.toString());
                        Util.closeQuietly(bufferedReader);
                        return mediaPlaylist;
                    }
                } else {
                    Util.closeQuietly(bufferedReader);
                    throw ParserException.createForMalformedManifest("Failed to parse the playlist, could not identify any tags.", null);
                }
            }
        } catch (Throwable th) {
            Util.closeQuietly(bufferedReader);
            throw th;
        }
    }

    private static boolean checkPlaylistHeader(BufferedReader bufferedReader) throws IOException {
        int i = bufferedReader.read();
        if (i == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i = bufferedReader.read();
        }
        int iSkipIgnorableWhitespace = skipIgnorableWhitespace(bufferedReader, true, i);
        for (int i2 = 0; i2 < 7; i2++) {
            if (iSkipIgnorableWhitespace != PLAYLIST_HEADER.charAt(i2)) {
                return false;
            }
            iSkipIgnorableWhitespace = bufferedReader.read();
        }
        return Util.isLinebreak(skipIgnorableWhitespace(bufferedReader, false, iSkipIgnorableWhitespace));
    }

    private static int skipIgnorableWhitespace(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z || !Util.isLinebreak(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x0362  */
    /* JADX WARN: Code duplicated, block: B:97:0x0357  */
    private static HlsMultivariantPlaylist parseMultivariantPlaylist(LineIterator lineIterator, String str) throws IOException {
        byte b2;
        ArrayList arrayList;
        String mediaMimeType;
        ArrayList arrayList2;
        int i;
        String str2;
        String mediaMimeType2;
        int i2;
        int i3;
        Uri uriResolveToUri;
        HashMap map;
        int i4;
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
        boolean z = false;
        boolean z2 = false;
        while (true) {
            boolean zHasNext = lineIterator.hasNext();
            String str3 = MimeTypes.APPLICATION_M3U8;
            if (zHasNext) {
                String next = lineIterator.next();
                if (next.startsWith(TAG_PREFIX)) {
                    arrayList10.add(next);
                }
                boolean zStartsWith = next.startsWith(TAG_I_FRAME_STREAM_INF);
                boolean z3 = z;
                if (next.startsWith(TAG_DEFINE)) {
                    map3.put(parseStringAttr(next, REGEX_NAME, map3), parseStringAttr(next, REGEX_VALUE, map3));
                } else {
                    if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                        map = map2;
                        arrayList8 = arrayList8;
                        arrayList4 = arrayList4;
                        arrayList5 = arrayList5;
                        arrayList6 = arrayList6;
                        arrayList7 = arrayList7;
                        arrayList10 = arrayList10;
                        arrayList9 = arrayList9;
                        z = true;
                    } else if (next.startsWith(TAG_MEDIA)) {
                        arrayList8.add(next);
                    } else if (next.startsWith(TAG_SESSION_KEY)) {
                        DrmInitData.SchemeData drmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, map3), map3);
                        if (drmSchemeData != null) {
                            arrayList9.add(new DrmInitData(parseEncryptionScheme(parseStringAttr(next, REGEX_METHOD, map3)), drmSchemeData));
                        }
                    } else {
                        if (next.startsWith(TAG_STREAM_INF) || zStartsWith) {
                            boolean zContains = next.contains(ATTR_CLOSED_CAPTIONS_NONE);
                            int i5 = zStartsWith ? 16384 : 0;
                            int intAttr = parseIntAttr(next, REGEX_BANDWIDTH);
                            int optionalIntAttr = parseOptionalIntAttr(next, REGEX_AVERAGE_BANDWIDTH, -1);
                            String optionalStringAttr = parseOptionalStringAttr(next, REGEX_CODECS, map3);
                            String optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_RESOLUTION, map3);
                            if (optionalStringAttr2 != null) {
                                String[] strArrSplit = Util.split(optionalStringAttr2, "x");
                                int i6 = Integer.parseInt(strArrSplit[0]);
                                int i7 = Integer.parseInt(strArrSplit[1]);
                                if (i6 <= 0 || i7 <= 0) {
                                    i7 = -1;
                                    i4 = -1;
                                } else {
                                    i4 = i6;
                                }
                                i3 = i7;
                                i2 = i4;
                            } else {
                                i2 = -1;
                                i3 = -1;
                            }
                            String optionalStringAttr3 = parseOptionalStringAttr(next, REGEX_FRAME_RATE, map3);
                            float f = optionalStringAttr3 != null ? Float.parseFloat(optionalStringAttr3) : -1.0f;
                            String optionalStringAttr4 = parseOptionalStringAttr(next, REGEX_VIDEO, map3);
                            boolean z4 = z2;
                            String optionalStringAttr5 = parseOptionalStringAttr(next, REGEX_AUDIO, map3);
                            HashMap map4 = map2;
                            String optionalStringAttr6 = parseOptionalStringAttr(next, REGEX_SUBTITLES, map3);
                            String optionalStringAttr7 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, map3);
                            if (zStartsWith) {
                                uriResolveToUri = UriUtil.resolveToUri(str, parseStringAttr(next, REGEX_URI, map3));
                            } else {
                                if (!lineIterator.hasNext()) {
                                    throw ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                                }
                                uriResolveToUri = UriUtil.resolveToUri(str, replaceVariableReferences(lineIterator.next(), map3));
                            }
                            arrayList3.add(new HlsMultivariantPlaylist.Variant(uriResolveToUri, new Format.Builder().setId(arrayList3.size()).setContainerMimeType(MimeTypes.APPLICATION_M3U8).setCodecs(optionalStringAttr).setAverageBitrate(optionalIntAttr).setPeakBitrate(intAttr).setWidth(i2).setHeight(i3).setFrameRate(f).setRoleFlags(i5).build(), optionalStringAttr4, optionalStringAttr5, optionalStringAttr6, optionalStringAttr7));
                            map = map4;
                            ArrayList arrayList11 = (ArrayList) map.get(uriResolveToUri);
                            if (arrayList11 == null) {
                                arrayList11 = new ArrayList();
                                map.put(uriResolveToUri, arrayList11);
                            }
                            arrayList11.add(new HlsTrackMetadataEntry.VariantInfo(optionalIntAttr, intAttr, optionalStringAttr4, optionalStringAttr5, optionalStringAttr6, optionalStringAttr7));
                            z2 = z4 | zContains;
                        }
                        z = z3;
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
                arrayList8 = arrayList8;
                arrayList4 = arrayList4;
                arrayList7 = arrayList7;
                arrayList9 = arrayList9;
                z = z3;
                map2 = map;
                arrayList9 = arrayList9;
                arrayList7 = arrayList7;
                arrayList10 = arrayList10;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
                arrayList4 = arrayList4;
                arrayList8 = arrayList8;
            } else {
                HashMap map5 = map2;
                ArrayList arrayList12 = arrayList8;
                ArrayList arrayList13 = arrayList4;
                ArrayList arrayList14 = arrayList5;
                ArrayList arrayList15 = arrayList6;
                ArrayList arrayList16 = arrayList7;
                ArrayList arrayList17 = arrayList10;
                boolean z5 = z;
                ArrayList arrayList18 = arrayList9;
                boolean z6 = z2;
                ArrayList arrayList19 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                    HlsMultivariantPlaylist.Variant variant = (HlsMultivariantPlaylist.Variant) arrayList3.get(i8);
                    if (hashSet.add(variant.url)) {
                        Assertions.checkState(variant.format.metadata == null);
                        arrayList19.add(variant.copyWithFormat(variant.format.buildUpon().setMetadata(new Metadata(new HlsTrackMetadataEntry(null, null, (List) Assertions.checkNotNull((ArrayList) map5.get(variant.url))))).build()));
                    }
                }
                Uri uri = null;
                ArrayList arrayList20 = null;
                Format formatBuild = null;
                int i9 = 0;
                while (i9 < arrayList12.size()) {
                    ArrayList arrayList21 = arrayList12;
                    String str4 = (String) arrayList21.get(i9);
                    String stringAttr = parseStringAttr(str4, REGEX_GROUP_ID, map3);
                    String stringAttr2 = parseStringAttr(str4, REGEX_NAME, map3);
                    Format.Builder language = new Format.Builder().setId(stringAttr + ":" + stringAttr2).setLabel(stringAttr2).setContainerMimeType(str3).setSelectionFlags(parseSelectionFlags(str4)).setRoleFlags(parseRoleFlags(str4, map3)).setLanguage(parseOptionalStringAttr(str4, REGEX_LANGUAGE, map3));
                    String optionalStringAttr8 = parseOptionalStringAttr(str4, REGEX_URI, map3);
                    Uri uriResolveToUri2 = optionalStringAttr8 == null ? uri : UriUtil.resolveToUri(str, optionalStringAttr8);
                    arrayList12 = arrayList21;
                    Metadata metadata = new Metadata(new HlsTrackMetadataEntry(stringAttr, stringAttr2, Collections.EMPTY_LIST));
                    String stringAttr3 = parseStringAttr(str4, REGEX_TYPE, map3);
                    stringAttr3.hashCode();
                    switch (stringAttr3) {
                        case "SUBTITLES":
                            b2 = 0;
                            break;
                        case "CLOSED-CAPTIONS":
                            b2 = 1;
                            break;
                        case "AUDIO":
                            b2 = 2;
                            break;
                        case "VIDEO":
                            b2 = 3;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 != 0) {
                        if (b2 == 1) {
                            str3 = str3;
                            arrayList14 = arrayList14;
                            arrayList = arrayList13;
                            String stringAttr4 = parseStringAttr(str4, REGEX_INSTREAM_ID, map3);
                            if (stringAttr4.startsWith("CC")) {
                                i = Integer.parseInt(stringAttr4.substring(2));
                                str2 = MimeTypes.APPLICATION_CEA608;
                            } else {
                                i = Integer.parseInt(stringAttr4.substring(7));
                                str2 = MimeTypes.APPLICATION_CEA708;
                            }
                            if (arrayList20 == null) {
                                arrayList20 = new ArrayList();
                            }
                            language.setSampleMimeType(str2).setAccessibilityChannel(i);
                            arrayList20.add(language.build());
                        } else if (b2 == 2) {
                            arrayList = arrayList13;
                            HlsMultivariantPlaylist.Variant variantWithAudioGroup = getVariantWithAudioGroup(arrayList3, stringAttr);
                            if (variantWithAudioGroup != null) {
                                String codecsOfType = Util.getCodecsOfType(variantWithAudioGroup.format.codecs, 1);
                                language.setCodecs(codecsOfType);
                                mediaMimeType2 = MimeTypes.getMediaMimeType(codecsOfType);
                            } else {
                                mediaMimeType2 = null;
                            }
                            String optionalStringAttr9 = parseOptionalStringAttr(str4, REGEX_CHANNELS, map3);
                            if (optionalStringAttr9 != null) {
                                language.setChannelCount(Integer.parseInt(Util.splitAtFirst(optionalStringAttr9, "/")[0]));
                                if (MimeTypes.AUDIO_E_AC3.equals(mediaMimeType2) && optionalStringAttr9.endsWith("/JOC")) {
                                    language.setCodecs(MimeTypes.CODEC_E_AC3_JOC);
                                    mediaMimeType2 = MimeTypes.AUDIO_E_AC3_JOC;
                                }
                            }
                            language.setSampleMimeType(mediaMimeType2);
                            if (uriResolveToUri2 != null) {
                                language.setMetadata(metadata);
                                arrayList14 = arrayList14;
                                arrayList14.add(new HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2));
                            } else {
                                arrayList14 = arrayList14;
                                if (variantWithAudioGroup != null) {
                                    formatBuild = language.build();
                                }
                            }
                        } else if (b2 == 3) {
                            HlsMultivariantPlaylist.Variant variantWithVideoGroup = getVariantWithVideoGroup(arrayList3, stringAttr);
                            if (variantWithVideoGroup != null) {
                                Format format = variantWithVideoGroup.format;
                                String codecsOfType2 = Util.getCodecsOfType(format.codecs, 2);
                                language.setCodecs(codecsOfType2).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType2)).setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate);
                            }
                            if (uriResolveToUri2 == null) {
                                arrayList = arrayList13;
                            } else {
                                language.setMetadata(metadata);
                                arrayList = arrayList13;
                                arrayList.add(new HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2));
                            }
                        } else {
                            arrayList = arrayList13;
                        }
                        arrayList2 = arrayList15;
                    } else {
                        str3 = str3;
                        arrayList14 = arrayList14;
                        arrayList = arrayList13;
                        HlsMultivariantPlaylist.Variant variantWithSubtitleGroup = getVariantWithSubtitleGroup(arrayList3, stringAttr);
                        if (variantWithSubtitleGroup != null) {
                            String codecsOfType3 = Util.getCodecsOfType(variantWithSubtitleGroup.format.codecs, 3);
                            language.setCodecs(codecsOfType3);
                            mediaMimeType = MimeTypes.getMediaMimeType(codecsOfType3);
                        } else {
                            mediaMimeType = null;
                        }
                        if (mediaMimeType == null) {
                            mediaMimeType = MimeTypes.TEXT_VTT;
                        }
                        language.setSampleMimeType(mediaMimeType).setMetadata(metadata);
                        if (uriResolveToUri2 != null) {
                            HlsMultivariantPlaylist.Rendition rendition = new HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2);
                            arrayList2 = arrayList15;
                            arrayList2.add(rendition);
                        } else {
                            arrayList2 = arrayList15;
                            Log.w(LOG_TAG, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                        }
                    }
                    i9++;
                    arrayList15 = arrayList2;
                    arrayList13 = arrayList;
                    arrayList14 = arrayList14;
                    str3 = str3;
                    uri = null;
                }
                return new HlsMultivariantPlaylist(str, arrayList17, arrayList19, arrayList13, arrayList14, arrayList15, arrayList16, formatBuild, z6 ? Collections.EMPTY_LIST : arrayList20, z5, map3, arrayList18);
            }
        }
    }

    private static HlsMultivariantPlaylist.Variant getVariantWithAudioGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.audioGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static HlsMultivariantPlaylist.Variant getVariantWithVideoGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.videoGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static HlsMultivariantPlaylist.Variant getVariantWithSubtitleGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.subtitleGroupId)) {
                return variant;
            }
        }
        return null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19141. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private static androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist parseMediaPlaylist(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist r95, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist r96, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.LineIterator r97, java.lang.String r98) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.parseMediaPlaylist(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$LineIterator, java.lang.String):androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist");
    }

    private static DrmInitData getPlaylistProtectionSchemes(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i = 0; i < schemeDataArr.length; i++) {
            schemeDataArr2[i] = schemeDataArr[i].copyWithData(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    private static String getSegmentEncryptionIV(long j, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int parseSelectionFlags(String str) {
        boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_DEFAULT, false);
        ?? r0 = optionalBooleanAttribute;
        if (parseOptionalBooleanAttribute(str, REGEX_FORCED, false)) {
            r0 = (optionalBooleanAttribute ? 1 : 0) | 2;
        }
        return parseOptionalBooleanAttribute(str, REGEX_AUTOSELECT, false) ? r0 | 4 : r0;
    }

    private static int parseRoleFlags(String str, Map<String, String> map) {
        String optionalStringAttr = parseOptionalStringAttr(str, REGEX_CHARACTERISTICS, map);
        if (TextUtils.isEmpty(optionalStringAttr)) {
            return 0;
        }
        String[] strArrSplit = Util.split(optionalStringAttr, ",");
        int i = Util.contains(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
        if (Util.contains(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (Util.contains(strArrSplit, "public.accessibility.describes-music-and-sound")) {
            i |= 1024;
        }
        return Util.contains(strArrSplit, "public.easy-to-read") ? i | 8192 : i;
    }

    private static DrmInitData.SchemeData parseDrmSchemeData(String str, String str2, Map<String, String> map) throws ParserException {
        String optionalStringAttr = parseOptionalStringAttr(str, REGEX_KEYFORMATVERSIONS, "1", map);
        if (KEYFORMAT_WIDEVINE_PSSH_BINARY.equals(str2)) {
            String stringAttr = parseStringAttr(str, REGEX_URI, map);
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "video/mp4", Base64.decode(stringAttr.substring(stringAttr.indexOf(44)), 0));
        }
        if (KEYFORMAT_WIDEVINE_PSSH_JSON.equals(str2)) {
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "hls", Util.getUtf8Bytes(str));
        }
        if (!KEYFORMAT_PLAYREADY.equals(str2) || !"1".equals(optionalStringAttr)) {
            return null;
        }
        String stringAttr2 = parseStringAttr(str, REGEX_URI, map);
        return new DrmInitData.SchemeData(C.PLAYREADY_UUID, "video/mp4", PsshAtomUtil.buildPsshAtom(C.PLAYREADY_UUID, Base64.decode(stringAttr2.substring(stringAttr2.indexOf(44)), 0)));
    }

    private static HlsMediaPlaylist.ServerControl parseServerControl(String str) {
        double optionalDoubleAttr = parseOptionalDoubleAttr(str, REGEX_CAN_SKIP_UNTIL, -9.223372036854776E18d);
        long j = C.TIME_UNSET;
        long j2 = optionalDoubleAttr == -9.223372036854776E18d ? -9223372036854775807L : (long) (optionalDoubleAttr * 1000000.0d);
        boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_CAN_SKIP_DATE_RANGES, false);
        double optionalDoubleAttr2 = parseOptionalDoubleAttr(str, REGEX_HOLD_BACK, -9.223372036854776E18d);
        long j3 = optionalDoubleAttr2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (optionalDoubleAttr2 * 1000000.0d);
        double optionalDoubleAttr3 = parseOptionalDoubleAttr(str, REGEX_PART_HOLD_BACK, -9.223372036854776E18d);
        if (optionalDoubleAttr3 != -9.223372036854776E18d) {
            j = (long) (optionalDoubleAttr3 * 1000000.0d);
        }
        return new HlsMediaPlaylist.ServerControl(j2, optionalBooleanAttribute, j3, j, parseOptionalBooleanAttribute(str, REGEX_CAN_BLOCK_RELOAD, false));
    }

    private static String parseEncryptionScheme(String str) {
        if (METHOD_SAMPLE_AES_CENC.equals(str) || METHOD_SAMPLE_AES_CTR.equals(str)) {
            return C.CENC_TYPE_cenc;
        }
        return C.CENC_TYPE_cbcs;
    }

    private static int parseIntAttr(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    private static int parseOptionalIntAttr(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))) : i;
    }

    private static long parseLongAttr(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    private static long parseOptionalLongAttr(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) : j;
    }

    private static long parseTimeSecondsToUs(String str, Pattern pattern) throws ParserException {
        return new BigDecimal(parseStringAttr(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static double parseDoubleAttr(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    private static String parseStringAttr(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String optionalStringAttr = parseOptionalStringAttr(str, pattern, map);
        if (optionalStringAttr != null) {
            return optionalStringAttr;
        }
        throw ParserException.createForMalformedManifest("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, Map<String, String> map) {
        return parseOptionalStringAttr(str, pattern, null, map);
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) Assertions.checkNotNull(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : replaceVariableReferences(str2, map);
    }

    private static double parseOptionalDoubleAttr(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) Assertions.checkNotNull(matcher.group(1))) : d;
    }

    private static String replaceVariableReferences(String str, Map<String, String> map) {
        Matcher matcher = REGEX_VARIABLE_REFERENCE.matcher(str);
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

    private static boolean parseOptionalBooleanAttribute(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? BOOLEAN_TRUE.equals(matcher.group(1)) : z;
    }

    private static Pattern compileBooleanAttrPattern(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    static class LineIterator {
        private final Queue<String> extraLines;
        private String next;
        private final BufferedReader reader;

        public LineIterator(Queue<String> queue, BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        public boolean hasNext() throws IOException {
            String strTrim;
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                this.next = (String) Assertions.checkNotNull(this.extraLines.poll());
                return true;
            }
            do {
                String line = this.reader.readLine();
                this.next = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.next = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String next() throws IOException {
            if (hasNext()) {
                String str = this.next;
                this.next = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }
}
