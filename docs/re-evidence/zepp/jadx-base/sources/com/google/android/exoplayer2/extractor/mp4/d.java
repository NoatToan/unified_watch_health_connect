package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.net.HttpHeaders;
import com.xiaomi.hm.health.device.event.StatEvent;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import org.cybergarage.upnp.std.av.server.object.format.ID3Frame;

/* JADX INFO: loaded from: classes2.dex */
final class d {
    private static final int A = 1885823344;
    private static final int B = 1936683886;
    private static final int C = 1953919848;
    private static final int D = 757935405;
    private static final int E = 3;

    @VisibleForTesting
    public static final String[] F = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", StatEvent.OTHER, "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    private static final int G = 169;
    private static final int H = 253;
    private static final String a = "MetadataUtil";
    private static final int b = 7233901;
    private static final int c = 7631467;
    private static final int d = 6516084;
    private static final int e = 6578553;
    private static final int f = 4280916;
    private static final int g = 7630703;
    private static final int h = 6384738;
    private static final int i = 6516589;
    private static final int j = 7828084;
    private static final int k = 7108978;
    private static final int l = 6776174;
    private static final int m = 1668249202;
    private static final int n = 1735291493;
    private static final int o = 6779504;
    private static final int p = 1684632427;
    private static final int q = 1953655662;
    private static final int r = 1953329263;
    private static final int s = 1668311404;
    private static final int t = 1631670868;
    private static final int u = 1936682605;
    private static final int v = 1936679276;
    private static final int w = 1936679282;
    private static final int x = 1936679265;
    private static final int y = 1936679791;
    private static final int z = 1920233063;

    private d() {
    }

    @Nullable
    private static CommentFrame a(int type, ParsableByteArray data) {
        int i2 = data.readInt();
        if (data.readInt() == 1684108385) {
            data.skipBytes(8);
            String nullTerminatedString = data.readNullTerminatedString(i2 - 16);
            return new CommentFrame(C.LANGUAGE_UNDETERMINED, nullTerminatedString, nullTerminatedString);
        }
        String strValueOf = String.valueOf(a.a(type));
        Log.w(a, strValueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(strValueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    @Nullable
    private static ApicFrame b(ParsableByteArray data) {
        String str;
        int i2 = data.readInt();
        if (data.readInt() != 1684108385) {
            Log.w(a, "Failed to parse cover art attribute");
            return null;
        }
        int iB = a.b(data.readInt());
        if (iB == 13) {
            str = MimeTypes.IMAGE_JPEG;
        } else {
            str = iB == 14 ? "image/png" : null;
        }
        if (str == null) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Unrecognized cover art flags: ");
            sb.append(iB);
            Log.w(a, sb.toString());
            return null;
        }
        data.skipBytes(4);
        int i3 = i2 - 16;
        byte[] bArr = new byte[i3];
        data.readBytes(bArr, 0, i3);
        return new ApicFrame(str, null, 3, bArr);
    }

    @Nullable
    public static Metadata.Entry c(ParsableByteArray ilst) {
        int position = ilst.getPosition() + ilst.readInt();
        int i2 = ilst.readInt();
        int i3 = (i2 >> 24) & 255;
        try {
            if (i3 == 169 || i3 == 253) {
                int i4 = 16777215 & i2;
                if (i4 == d) {
                    CommentFrame commentFrameA = a(i2, ilst);
                    ilst.setPosition(position);
                    return commentFrameA;
                }
                if (i4 == b || i4 == c) {
                    TextInformationFrame textInformationFrameH = h(i2, ID3Frame.TIT2, ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH;
                }
                if (i4 == i || i4 == j) {
                    TextInformationFrame textInformationFrameH2 = h(i2, "TCOM", ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH2;
                }
                if (i4 == e) {
                    TextInformationFrame textInformationFrameH3 = h(i2, "TDRC", ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH3;
                }
                if (i4 == f) {
                    TextInformationFrame textInformationFrameH4 = h(i2, ID3Frame.TPE1, ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH4;
                }
                if (i4 == g) {
                    TextInformationFrame textInformationFrameH5 = h(i2, "TSSE", ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH5;
                }
                if (i4 == h) {
                    TextInformationFrame textInformationFrameH6 = h(i2, "TALB", ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH6;
                }
                if (i4 == k) {
                    TextInformationFrame textInformationFrameH7 = h(i2, "USLT", ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH7;
                }
                if (i4 == l) {
                    TextInformationFrame textInformationFrameH8 = h(i2, "TCON", ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH8;
                }
                if (i4 == o) {
                    TextInformationFrame textInformationFrameH9 = h(i2, ID3Frame.TIT1, ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH9;
                }
            } else {
                if (i2 == n) {
                    TextInformationFrame textInformationFrameG = g(ilst);
                    ilst.setPosition(position);
                    return textInformationFrameG;
                }
                if (i2 == p) {
                    TextInformationFrame textInformationFrameD = d(i2, "TPOS", ilst);
                    ilst.setPosition(position);
                    return textInformationFrameD;
                }
                if (i2 == q) {
                    TextInformationFrame textInformationFrameD2 = d(i2, "TRCK", ilst);
                    ilst.setPosition(position);
                    return textInformationFrameD2;
                }
                if (i2 == r) {
                    Id3Frame id3FrameI = i(i2, "TBPM", ilst, true, false);
                    ilst.setPosition(position);
                    return id3FrameI;
                }
                if (i2 == s) {
                    Id3Frame id3FrameI2 = i(i2, "TCMP", ilst, true, true);
                    ilst.setPosition(position);
                    return id3FrameI2;
                }
                if (i2 == m) {
                    ApicFrame apicFrameB = b(ilst);
                    ilst.setPosition(position);
                    return apicFrameB;
                }
                if (i2 == t) {
                    TextInformationFrame textInformationFrameH10 = h(i2, ID3Frame.TPE2, ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH10;
                }
                if (i2 == u) {
                    TextInformationFrame textInformationFrameH11 = h(i2, "TSOT", ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH11;
                }
                if (i2 == v) {
                    TextInformationFrame textInformationFrameH12 = h(i2, "TSO2", ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH12;
                }
                if (i2 == w) {
                    TextInformationFrame textInformationFrameH13 = h(i2, "TSOA", ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH13;
                }
                if (i2 == x) {
                    TextInformationFrame textInformationFrameH14 = h(i2, "TSOP", ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH14;
                }
                if (i2 == y) {
                    TextInformationFrame textInformationFrameH15 = h(i2, "TSOC", ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH15;
                }
                if (i2 == z) {
                    Id3Frame id3FrameI3 = i(i2, "ITUNESADVISORY", ilst, false, false);
                    ilst.setPosition(position);
                    return id3FrameI3;
                }
                if (i2 == A) {
                    Id3Frame id3FrameI4 = i(i2, "ITUNESGAPLESS", ilst, false, true);
                    ilst.setPosition(position);
                    return id3FrameI4;
                }
                if (i2 == B) {
                    TextInformationFrame textInformationFrameH16 = h(i2, "TVSHOWSORT", ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH16;
                }
                if (i2 == C) {
                    TextInformationFrame textInformationFrameH17 = h(i2, "TVSHOW", ilst);
                    ilst.setPosition(position);
                    return textInformationFrameH17;
                }
                if (i2 == D) {
                    Id3Frame id3FrameE = e(ilst, position);
                    ilst.setPosition(position);
                    return id3FrameE;
                }
            }
            String strValueOf = String.valueOf(a.a(i2));
            Log.d(a, strValueOf.length() != 0 ? "Skipped unknown metadata entry: ".concat(strValueOf) : new String("Skipped unknown metadata entry: "));
            ilst.setPosition(position);
            return null;
        } catch (Throwable th) {
            ilst.setPosition(position);
            throw th;
        }
    }

    @Nullable
    private static TextInformationFrame d(int type, String attributeName, ParsableByteArray data) {
        int i2 = data.readInt();
        if (data.readInt() == 1684108385 && i2 >= 22) {
            data.skipBytes(10);
            int unsignedShort = data.readUnsignedShort();
            if (unsignedShort > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(unsignedShort);
                String string = sb.toString();
                int unsignedShort2 = data.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    String strValueOf = String.valueOf(string);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 12);
                    sb2.append(strValueOf);
                    sb2.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
                    sb2.append(unsignedShort2);
                    string = sb2.toString();
                }
                return new TextInformationFrame(attributeName, null, string);
            }
        }
        String strValueOf2 = String.valueOf(a.a(type));
        Log.w(a, strValueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(strValueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    @Nullable
    private static Id3Frame e(ParsableByteArray data, int endPosition) {
        String nullTerminatedString = null;
        String nullTerminatedString2 = null;
        int i2 = -1;
        int i3 = -1;
        while (data.getPosition() < endPosition) {
            int position = data.getPosition();
            int i4 = data.readInt();
            int i5 = data.readInt();
            data.skipBytes(4);
            if (i5 == 1835360622) {
                nullTerminatedString = data.readNullTerminatedString(i4 - 12);
            } else if (i5 == 1851878757) {
                nullTerminatedString2 = data.readNullTerminatedString(i4 - 12);
            } else {
                if (i5 == 1684108385) {
                    i2 = position;
                    i3 = i4;
                }
                data.skipBytes(i4 - 12);
            }
        }
        if (nullTerminatedString == null || nullTerminatedString2 == null || i2 == -1) {
            return null;
        }
        data.setPosition(i2);
        data.skipBytes(16);
        return new InternalFrame(nullTerminatedString, nullTerminatedString2, data.readNullTerminatedString(i3 - 16));
    }

    @Nullable
    public static MdtaMetadataEntry f(ParsableByteArray ilst, int endPosition, String key) {
        while (true) {
            int position = ilst.getPosition();
            if (position >= endPosition) {
                return null;
            }
            int i2 = ilst.readInt();
            if (ilst.readInt() == 1684108385) {
                int i3 = ilst.readInt();
                int i4 = ilst.readInt();
                int i5 = i2 - 16;
                byte[] bArr = new byte[i5];
                ilst.readBytes(bArr, 0, i5);
                return new MdtaMetadataEntry(key, bArr, i4, i3);
            }
            ilst.setPosition(position + i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    @Nullable
    private static TextInformationFrame g(ParsableByteArray data) {
        String str;
        int iJ = j(data);
        if (iJ > 0) {
            String[] strArr = F;
            if (iJ <= strArr.length) {
                str = strArr[iJ - 1];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new TextInformationFrame("TCON", null, str);
        }
        Log.w(a, "Failed to parse standard genre code");
        return null;
    }

    @Nullable
    private static TextInformationFrame h(int type, String id, ParsableByteArray data) {
        int i2 = data.readInt();
        if (data.readInt() == 1684108385) {
            data.skipBytes(8);
            return new TextInformationFrame(id, null, data.readNullTerminatedString(i2 - 16));
        }
        String strValueOf = String.valueOf(a.a(type));
        Log.w(a, strValueOf.length() != 0 ? "Failed to parse text attribute: ".concat(strValueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    @Nullable
    private static Id3Frame i(int type, String id, ParsableByteArray data, boolean isTextInformationFrame, boolean isBoolean) {
        int iJ = j(data);
        if (isBoolean) {
            iJ = Math.min(1, iJ);
        }
        if (iJ >= 0) {
            return isTextInformationFrame ? new TextInformationFrame(id, null, Integer.toString(iJ)) : new CommentFrame(C.LANGUAGE_UNDETERMINED, id, Integer.toString(iJ));
        }
        String strValueOf = String.valueOf(a.a(type));
        Log.w(a, strValueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strValueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static int j(ParsableByteArray data) {
        data.skipBytes(4);
        if (data.readInt() == 1684108385) {
            data.skipBytes(8);
            return data.readUnsignedByte();
        }
        Log.w(a, "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int trackType, GaplessInfoHolder gaplessInfoHolder, Format.Builder formatBuilder) {
        if (trackType == 1 && gaplessInfoHolder.hasGaplessInfo()) {
            formatBuilder.setEncoderDelay(gaplessInfoHolder.encoderDelay).setEncoderPadding(gaplessInfoHolder.encoderPadding);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    public static void l(int trackType, @Nullable Metadata udtaMetaMetadata, @Nullable Metadata mdtaMetadata, Format.Builder formatBuilder, Metadata... additionalMetadata) {
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        if (trackType == 1) {
            if (udtaMetaMetadata == null) {
                udtaMetaMetadata = metadata;
                break;
            }
        } else {
            if (trackType != 2 || mdtaMetadata == null) {
                udtaMetaMetadata = metadata;
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= mdtaMetadata.length()) {
                    udtaMetaMetadata = metadata;
                    break;
                }
                Metadata.Entry entry = mdtaMetadata.get(i2);
                if (entry instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entry;
                    if (MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS.equals(mdtaMetadataEntry.key)) {
                        udtaMetaMetadata = new Metadata(mdtaMetadataEntry);
                        break;
                    }
                }
                i2++;
            }
        }
        for (Metadata metadata2 : additionalMetadata) {
            udtaMetaMetadata = udtaMetaMetadata.copyWithAppendedEntriesFrom(metadata2);
        }
        if (udtaMetaMetadata.length() > 0) {
            formatBuilder.setMetadata(udtaMetaMetadata);
        }
    }
}
