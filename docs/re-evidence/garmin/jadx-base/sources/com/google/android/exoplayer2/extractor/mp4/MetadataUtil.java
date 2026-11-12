package com.google.android.exoplayer2.extractor.mp4;

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
import com.google.android.exoplayer2.v;
import com.google.common.net.HttpHeaders;

/* JADX INFO: loaded from: classes13.dex */
final class MetadataUtil {
    private static final int PICTURE_TYPE_FRONT_COVER = 3;
    private static final int SHORT_TYPE_ALBUM = 6384738;
    private static final int SHORT_TYPE_ARTIST = 4280916;
    private static final int SHORT_TYPE_COMMENT = 6516084;
    private static final int SHORT_TYPE_COMPOSER_1 = 6516589;
    private static final int SHORT_TYPE_COMPOSER_2 = 7828084;
    private static final int SHORT_TYPE_ENCODER = 7630703;
    private static final int SHORT_TYPE_GENRE = 6776174;
    private static final int SHORT_TYPE_LYRICS = 7108978;
    private static final int SHORT_TYPE_NAME_1 = 7233901;
    private static final int SHORT_TYPE_NAME_2 = 7631467;
    private static final int SHORT_TYPE_YEAR = 6578553;
    static final String[] STANDARD_GENRES = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    private static final String TAG = "MetadataUtil";
    private static final int TYPE_ALBUM_ARTIST = 1631670868;
    private static final int TYPE_COMPILATION = 1668311404;
    private static final int TYPE_COVER_ART = 1668249202;
    private static final int TYPE_DISK_NUMBER = 1684632427;
    private static final int TYPE_GAPLESS_ALBUM = 1885823344;
    private static final int TYPE_GENRE = 1735291493;
    private static final int TYPE_GROUPING = 6779504;
    private static final int TYPE_INTERNAL = 757935405;
    private static final int TYPE_RATING = 1920233063;
    private static final int TYPE_SORT_ALBUM = 1936679276;
    private static final int TYPE_SORT_ALBUM_ARTIST = 1936679265;
    private static final int TYPE_SORT_ARTIST = 1936679282;
    private static final int TYPE_SORT_COMPOSER = 1936679791;
    private static final int TYPE_SORT_TRACK_NAME = 1936682605;
    private static final int TYPE_TEMPO = 1953329263;
    private static final int TYPE_TOP_BYTE_COPYRIGHT = 169;
    private static final int TYPE_TOP_BYTE_REPLACEMENT = 253;
    private static final int TYPE_TRACK_NUMBER = 1953655662;
    private static final int TYPE_TV_SHOW = 1953919848;
    private static final int TYPE_TV_SORT_SHOW = 1936683886;

    private MetadataUtil() {
    }

    private static CommentFrame parseCommentAttribute(int i14, ParsableByteArray parsableByteArray) {
        int i15 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            String nullTerminatedString = parsableByteArray.readNullTerminatedString(i15 - 16);
            return new CommentFrame(C.LANGUAGE_UNDETERMINED, nullTerminatedString, nullTerminatedString);
        }
        String strValueOf = String.valueOf(Atom.getAtomTypeString(i14));
        Log.w(TAG, strValueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(strValueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    private static ApicFrame parseCoverArt(ParsableByteArray parsableByteArray) {
        String str;
        int i14 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() != 1684108385) {
            Log.w(TAG, "Failed to parse cover art attribute");
            return null;
        }
        int fullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        if (fullAtomFlags == 13) {
            str = MimeTypes.IMAGE_JPEG;
        } else {
            str = fullAtomFlags == 14 ? "image/png" : null;
        }
        if (str == null) {
            v.e(41, fullAtomFlags, "Unrecognized cover art flags: ", TAG);
            return null;
        }
        parsableByteArray.skipBytes(4);
        int i15 = i14 - 16;
        byte[] bArr = new byte[i15];
        parsableByteArray.readBytes(bArr, 0, i15);
        return new ApicFrame(str, null, 3, bArr);
    }

    public static Metadata.Entry parseIlstElement(ParsableByteArray parsableByteArray) {
        int i14 = parsableByteArray.readInt() + parsableByteArray.getPosition();
        int i15 = parsableByteArray.readInt();
        int i16 = (i15 >> 24) & 255;
        try {
            if (i16 == TYPE_TOP_BYTE_COPYRIGHT || i16 == TYPE_TOP_BYTE_REPLACEMENT) {
                int i17 = 16777215 & i15;
                if (i17 == SHORT_TYPE_COMMENT) {
                    CommentFrame commentAttribute = parseCommentAttribute(i15, parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return commentAttribute;
                }
                if (i17 == SHORT_TYPE_NAME_1 || i17 == SHORT_TYPE_NAME_2) {
                    TextInformationFrame textAttribute = parseTextAttribute(i15, "TIT2", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute;
                }
                if (i17 == SHORT_TYPE_COMPOSER_1 || i17 == SHORT_TYPE_COMPOSER_2) {
                    TextInformationFrame textAttribute2 = parseTextAttribute(i15, "TCOM", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute2;
                }
                if (i17 == SHORT_TYPE_YEAR) {
                    TextInformationFrame textAttribute3 = parseTextAttribute(i15, "TDRC", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute3;
                }
                if (i17 == SHORT_TYPE_ARTIST) {
                    TextInformationFrame textAttribute4 = parseTextAttribute(i15, "TPE1", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute4;
                }
                if (i17 == SHORT_TYPE_ENCODER) {
                    TextInformationFrame textAttribute5 = parseTextAttribute(i15, "TSSE", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute5;
                }
                if (i17 == SHORT_TYPE_ALBUM) {
                    TextInformationFrame textAttribute6 = parseTextAttribute(i15, "TALB", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute6;
                }
                if (i17 == SHORT_TYPE_LYRICS) {
                    TextInformationFrame textAttribute7 = parseTextAttribute(i15, "USLT", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute7;
                }
                if (i17 == SHORT_TYPE_GENRE) {
                    TextInformationFrame textAttribute8 = parseTextAttribute(i15, "TCON", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute8;
                }
                if (i17 == TYPE_GROUPING) {
                    TextInformationFrame textAttribute9 = parseTextAttribute(i15, "TIT1", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute9;
                }
            } else {
                if (i15 == TYPE_GENRE) {
                    TextInformationFrame standardGenreAttribute = parseStandardGenreAttribute(parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return standardGenreAttribute;
                }
                if (i15 == TYPE_DISK_NUMBER) {
                    TextInformationFrame indexAndCountAttribute = parseIndexAndCountAttribute(i15, "TPOS", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return indexAndCountAttribute;
                }
                if (i15 == TYPE_TRACK_NUMBER) {
                    TextInformationFrame indexAndCountAttribute2 = parseIndexAndCountAttribute(i15, "TRCK", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return indexAndCountAttribute2;
                }
                if (i15 == TYPE_TEMPO) {
                    Id3Frame uint8Attribute = parseUint8Attribute(i15, "TBPM", parsableByteArray, true, false);
                    parsableByteArray.setPosition(i14);
                    return uint8Attribute;
                }
                if (i15 == TYPE_COMPILATION) {
                    Id3Frame uint8Attribute2 = parseUint8Attribute(i15, "TCMP", parsableByteArray, true, true);
                    parsableByteArray.setPosition(i14);
                    return uint8Attribute2;
                }
                if (i15 == TYPE_COVER_ART) {
                    ApicFrame coverArt = parseCoverArt(parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return coverArt;
                }
                if (i15 == TYPE_ALBUM_ARTIST) {
                    TextInformationFrame textAttribute10 = parseTextAttribute(i15, "TPE2", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute10;
                }
                if (i15 == TYPE_SORT_TRACK_NAME) {
                    TextInformationFrame textAttribute11 = parseTextAttribute(i15, "TSOT", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute11;
                }
                if (i15 == TYPE_SORT_ALBUM) {
                    TextInformationFrame textAttribute12 = parseTextAttribute(i15, "TSO2", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute12;
                }
                if (i15 == TYPE_SORT_ARTIST) {
                    TextInformationFrame textAttribute13 = parseTextAttribute(i15, "TSOA", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute13;
                }
                if (i15 == TYPE_SORT_ALBUM_ARTIST) {
                    TextInformationFrame textAttribute14 = parseTextAttribute(i15, "TSOP", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute14;
                }
                if (i15 == TYPE_SORT_COMPOSER) {
                    TextInformationFrame textAttribute15 = parseTextAttribute(i15, "TSOC", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute15;
                }
                if (i15 == TYPE_RATING) {
                    Id3Frame uint8Attribute3 = parseUint8Attribute(i15, "ITUNESADVISORY", parsableByteArray, false, false);
                    parsableByteArray.setPosition(i14);
                    return uint8Attribute3;
                }
                if (i15 == TYPE_GAPLESS_ALBUM) {
                    Id3Frame uint8Attribute4 = parseUint8Attribute(i15, "ITUNESGAPLESS", parsableByteArray, false, true);
                    parsableByteArray.setPosition(i14);
                    return uint8Attribute4;
                }
                if (i15 == TYPE_TV_SORT_SHOW) {
                    TextInformationFrame textAttribute16 = parseTextAttribute(i15, "TVSHOWSORT", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute16;
                }
                if (i15 == TYPE_TV_SHOW) {
                    TextInformationFrame textAttribute17 = parseTextAttribute(i15, "TVSHOW", parsableByteArray);
                    parsableByteArray.setPosition(i14);
                    return textAttribute17;
                }
                if (i15 == TYPE_INTERNAL) {
                    Id3Frame internalAttribute = parseInternalAttribute(parsableByteArray, i14);
                    parsableByteArray.setPosition(i14);
                    return internalAttribute;
                }
            }
            String strValueOf = String.valueOf(Atom.getAtomTypeString(i15));
            Log.d(TAG, strValueOf.length() != 0 ? "Skipped unknown metadata entry: ".concat(strValueOf) : new String("Skipped unknown metadata entry: "));
            parsableByteArray.setPosition(i14);
            return null;
        } catch (Throwable th3) {
            parsableByteArray.setPosition(i14);
            throw th3;
        }
    }

    private static TextInformationFrame parseIndexAndCountAttribute(int i14, String str, ParsableByteArray parsableByteArray) {
        int i15 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385 && i15 >= 22) {
            parsableByteArray.skipBytes(10);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            if (unsignedShort > 0) {
                StringBuilder sb3 = new StringBuilder(11);
                sb3.append(unsignedShort);
                String string = sb3.toString();
                int unsignedShort2 = parsableByteArray.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    StringBuilder sb4 = new StringBuilder(string.length() + 12);
                    sb4.append(string);
                    sb4.append("/");
                    sb4.append(unsignedShort2);
                    string = sb4.toString();
                }
                return new TextInformationFrame(str, null, string);
            }
        }
        String strValueOf = String.valueOf(Atom.getAtomTypeString(i14));
        Log.w(TAG, strValueOf.length() != 0 ? "Failed to parse index/count attribute: ".concat(strValueOf) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static Id3Frame parseInternalAttribute(ParsableByteArray parsableByteArray, int i14) {
        String nullTerminatedString = null;
        String nullTerminatedString2 = null;
        int i15 = -1;
        int i16 = -1;
        while (parsableByteArray.getPosition() < i14) {
            int position = parsableByteArray.getPosition();
            int i17 = parsableByteArray.readInt();
            int i18 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            if (i18 == 1835360622) {
                nullTerminatedString = parsableByteArray.readNullTerminatedString(i17 - 12);
            } else if (i18 == 1851878757) {
                nullTerminatedString2 = parsableByteArray.readNullTerminatedString(i17 - 12);
            } else {
                if (i18 == 1684108385) {
                    i15 = position;
                    i16 = i17;
                }
                parsableByteArray.skipBytes(i17 - 12);
            }
        }
        if (nullTerminatedString == null || nullTerminatedString2 == null || i15 == -1) {
            return null;
        }
        parsableByteArray.setPosition(i15);
        parsableByteArray.skipBytes(16);
        return new InternalFrame(nullTerminatedString, nullTerminatedString2, parsableByteArray.readNullTerminatedString(i16 - 16));
    }

    public static MdtaMetadataEntry parseMdtaMetadataEntryFromIlst(ParsableByteArray parsableByteArray, int i14, String str) {
        while (true) {
            int position = parsableByteArray.getPosition();
            if (position >= i14) {
                return null;
            }
            int i15 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1684108385) {
                int i16 = parsableByteArray.readInt();
                int i17 = parsableByteArray.readInt();
                int i18 = i15 - 16;
                byte[] bArr = new byte[i18];
                parsableByteArray.readBytes(bArr, 0, i18);
                return new MdtaMetadataEntry(str, bArr, i17, i16);
            }
            parsableByteArray.setPosition(position + i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    private static TextInformationFrame parseStandardGenreAttribute(ParsableByteArray parsableByteArray) {
        String str;
        int uint8AttributeValue = parseUint8AttributeValue(parsableByteArray);
        if (uint8AttributeValue > 0) {
            String[] strArr = STANDARD_GENRES;
            if (uint8AttributeValue <= strArr.length) {
                str = strArr[uint8AttributeValue - 1];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new TextInformationFrame("TCON", null, str);
        }
        Log.w(TAG, "Failed to parse standard genre code");
        return null;
    }

    private static TextInformationFrame parseTextAttribute(int i14, String str, ParsableByteArray parsableByteArray) {
        int i15 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            return new TextInformationFrame(str, null, parsableByteArray.readNullTerminatedString(i15 - 16));
        }
        String strValueOf = String.valueOf(Atom.getAtomTypeString(i14));
        Log.w(TAG, strValueOf.length() != 0 ? "Failed to parse text attribute: ".concat(strValueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static Id3Frame parseUint8Attribute(int i14, String str, ParsableByteArray parsableByteArray, boolean z14, boolean z15) {
        int uint8AttributeValue = parseUint8AttributeValue(parsableByteArray);
        if (z15) {
            uint8AttributeValue = Math.min(1, uint8AttributeValue);
        }
        if (uint8AttributeValue >= 0) {
            return z14 ? new TextInformationFrame(str, null, Integer.toString(uint8AttributeValue)) : new CommentFrame(C.LANGUAGE_UNDETERMINED, str, Integer.toString(uint8AttributeValue));
        }
        String strValueOf = String.valueOf(Atom.getAtomTypeString(i14));
        Log.w(TAG, strValueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strValueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static int parseUint8AttributeValue(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            return parsableByteArray.readUnsignedByte();
        }
        Log.w(TAG, "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void setFormatGaplessInfo(int i14, GaplessInfoHolder gaplessInfoHolder, Format.Builder builder) {
        if (i14 == 1 && gaplessInfoHolder.hasGaplessInfo()) {
            builder.setEncoderDelay(gaplessInfoHolder.encoderDelay).setEncoderPadding(gaplessInfoHolder.encoderPadding);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    public static void setFormatMetadata(int i14, Metadata metadata, Metadata metadata2, Format.Builder builder, Metadata... metadataArr) {
        Metadata metadata3 = new Metadata(new Metadata.Entry[0]);
        if (i14 == 1) {
            if (metadata == null) {
                metadata = metadata3;
                break;
            }
        } else {
            if (i14 != 2 || metadata2 == null) {
                metadata = metadata3;
                break;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= metadata2.length()) {
                    metadata = metadata3;
                    break;
                }
                Metadata.Entry entry = metadata2.get(i15);
                if (entry instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entry;
                    if (MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS.equals(mdtaMetadataEntry.key)) {
                        metadata = new Metadata(mdtaMetadataEntry);
                        break;
                    }
                }
                i15++;
            }
        }
        for (Metadata metadata4 : metadataArr) {
            metadata = metadata.copyWithAppendedEntriesFrom(metadata4);
        }
        if (metadata.length() > 0) {
            builder.setMetadata(metadata);
        }
    }
}
