package defpackage;

import androidx.annotation.VisibleForTesting;
import coil.util.Utils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;

/* JADX INFO: loaded from: classes4.dex */
public final class utf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public static final String[] f36116a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static CommentFrame a(int i, okh okhVar) {
        int iN = okhVar.n();
        if (okhVar.n() == 1684108385) {
            okhVar.Q(8);
            String strY = okhVar.y(iN - 16);
            return new CommentFrame("und", strY, strY);
        }
        String strValueOf = String.valueOf(zl1.a(i));
        toe.h("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(strValueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    public static ApicFrame b(okh okhVar) {
        String str;
        int iN = okhVar.n();
        if (okhVar.n() != 1684108385) {
            toe.h("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iB = zl1.b(okhVar.n());
        if (iB == 13) {
            str = Utils.MIME_TYPE_JPEG;
        } else {
            str = iB == 14 ? "image/png" : null;
        }
        if (str == null) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Unrecognized cover art flags: ");
            sb.append(iB);
            toe.h("MetadataUtil", sb.toString());
            return null;
        }
        okhVar.Q(4);
        int i = iN - 16;
        byte[] bArr = new byte[i];
        okhVar.j(bArr, 0, i);
        return new ApicFrame(str, null, 3, bArr);
    }

    public static Metadata.Entry c(okh okhVar) {
        int iE = okhVar.e() + okhVar.n();
        int iN = okhVar.n();
        int i = (iN >> 24) & 255;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & iN;
                if (i2 == 6516084) {
                    CommentFrame commentFrameA = a(iN, okhVar);
                    okhVar.P(iE);
                    return commentFrameA;
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    TextInformationFrame textInformationFrameH = h(iN, "TIT2", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH;
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    TextInformationFrame textInformationFrameH2 = h(iN, "TCOM", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH2;
                }
                if (i2 == 6578553) {
                    TextInformationFrame textInformationFrameH3 = h(iN, "TDRC", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH3;
                }
                if (i2 == 4280916) {
                    TextInformationFrame textInformationFrameH4 = h(iN, "TPE1", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH4;
                }
                if (i2 == 7630703) {
                    TextInformationFrame textInformationFrameH5 = h(iN, "TSSE", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH5;
                }
                if (i2 == 6384738) {
                    TextInformationFrame textInformationFrameH6 = h(iN, "TALB", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH6;
                }
                if (i2 == 7108978) {
                    TextInformationFrame textInformationFrameH7 = h(iN, "USLT", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH7;
                }
                if (i2 == 6776174) {
                    TextInformationFrame textInformationFrameH8 = h(iN, "TCON", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH8;
                }
                if (i2 == 6779504) {
                    TextInformationFrame textInformationFrameH9 = h(iN, "TIT1", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH9;
                }
            } else {
                if (iN == 1735291493) {
                    TextInformationFrame textInformationFrameG = g(okhVar);
                    okhVar.P(iE);
                    return textInformationFrameG;
                }
                if (iN == 1684632427) {
                    TextInformationFrame textInformationFrameD = d(iN, "TPOS", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameD;
                }
                if (iN == 1953655662) {
                    TextInformationFrame textInformationFrameD2 = d(iN, "TRCK", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameD2;
                }
                if (iN == 1953329263) {
                    Id3Frame id3FrameI = i(iN, "TBPM", okhVar, true, false);
                    okhVar.P(iE);
                    return id3FrameI;
                }
                if (iN == 1668311404) {
                    Id3Frame id3FrameI2 = i(iN, "TCMP", okhVar, true, true);
                    okhVar.P(iE);
                    return id3FrameI2;
                }
                if (iN == 1668249202) {
                    ApicFrame apicFrameB = b(okhVar);
                    okhVar.P(iE);
                    return apicFrameB;
                }
                if (iN == 1631670868) {
                    TextInformationFrame textInformationFrameH10 = h(iN, "TPE2", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH10;
                }
                if (iN == 1936682605) {
                    TextInformationFrame textInformationFrameH11 = h(iN, "TSOT", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH11;
                }
                if (iN == 1936679276) {
                    TextInformationFrame textInformationFrameH12 = h(iN, "TSO2", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH12;
                }
                if (iN == 1936679282) {
                    TextInformationFrame textInformationFrameH13 = h(iN, "TSOA", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH13;
                }
                if (iN == 1936679265) {
                    TextInformationFrame textInformationFrameH14 = h(iN, "TSOP", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH14;
                }
                if (iN == 1936679791) {
                    TextInformationFrame textInformationFrameH15 = h(iN, "TSOC", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH15;
                }
                if (iN == 1920233063) {
                    Id3Frame id3FrameI3 = i(iN, "ITUNESADVISORY", okhVar, false, false);
                    okhVar.P(iE);
                    return id3FrameI3;
                }
                if (iN == 1885823344) {
                    Id3Frame id3FrameI4 = i(iN, "ITUNESGAPLESS", okhVar, false, true);
                    okhVar.P(iE);
                    return id3FrameI4;
                }
                if (iN == 1936683886) {
                    TextInformationFrame textInformationFrameH16 = h(iN, "TVSHOWSORT", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH16;
                }
                if (iN == 1953919848) {
                    TextInformationFrame textInformationFrameH17 = h(iN, "TVSHOW", okhVar);
                    okhVar.P(iE);
                    return textInformationFrameH17;
                }
                if (iN == 757935405) {
                    Id3Frame id3FrameE = e(okhVar, iE);
                    okhVar.P(iE);
                    return id3FrameE;
                }
            }
            String strValueOf = String.valueOf(zl1.a(iN));
            toe.b("MetadataUtil", strValueOf.length() != 0 ? "Skipped unknown metadata entry: ".concat(strValueOf) : new String("Skipped unknown metadata entry: "));
            okhVar.P(iE);
            return null;
        } catch (Throwable th) {
            okhVar.P(iE);
            throw th;
        }
    }

    public static TextInformationFrame d(int i, String str, okh okhVar) {
        int iN = okhVar.n();
        if (okhVar.n() == 1684108385 && iN >= 22) {
            okhVar.Q(10);
            int iJ = okhVar.J();
            if (iJ > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(iJ);
                String string = sb.toString();
                int iJ2 = okhVar.J();
                if (iJ2 > 0) {
                    String strValueOf = String.valueOf(string);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 12);
                    sb2.append(strValueOf);
                    sb2.append("/");
                    sb2.append(iJ2);
                    string = sb2.toString();
                }
                return new TextInformationFrame(str, null, string);
            }
        }
        String strValueOf2 = String.valueOf(zl1.a(i));
        toe.h("MetadataUtil", strValueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(strValueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    public static Id3Frame e(okh okhVar, int i) {
        String strY = null;
        String strY2 = null;
        int i2 = -1;
        int i3 = -1;
        while (okhVar.e() < i) {
            int iE = okhVar.e();
            int iN = okhVar.n();
            int iN2 = okhVar.n();
            okhVar.Q(4);
            if (iN2 == 1835360622) {
                strY = okhVar.y(iN - 12);
            } else if (iN2 == 1851878757) {
                strY2 = okhVar.y(iN - 12);
            } else {
                if (iN2 == 1684108385) {
                    i2 = iE;
                    i3 = iN;
                }
                okhVar.Q(iN - 12);
            }
        }
        if (strY == null || strY2 == null || i2 == -1) {
            return null;
        }
        okhVar.P(i2);
        okhVar.Q(16);
        return new InternalFrame(strY, strY2, okhVar.y(i3 - 16));
    }

    public static MdtaMetadataEntry f(okh okhVar, int i, String str) {
        while (true) {
            int iE = okhVar.e();
            if (iE >= i) {
                return null;
            }
            int iN = okhVar.n();
            if (okhVar.n() == 1684108385) {
                int iN2 = okhVar.n();
                int iN3 = okhVar.n();
                int i2 = iN - 16;
                byte[] bArr = new byte[i2];
                okhVar.j(bArr, 0, i2);
                return new MdtaMetadataEntry(str, bArr, iN3, iN2);
            }
            okhVar.P(iE + iN);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    public static TextInformationFrame g(okh okhVar) {
        String str;
        int iJ = j(okhVar);
        if (iJ > 0) {
            String[] strArr = f36116a;
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
        toe.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    public static TextInformationFrame h(int i, String str, okh okhVar) {
        int iN = okhVar.n();
        if (okhVar.n() == 1684108385) {
            okhVar.Q(8);
            return new TextInformationFrame(str, null, okhVar.y(iN - 16));
        }
        String strValueOf = String.valueOf(zl1.a(i));
        toe.h("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse text attribute: ".concat(strValueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    public static Id3Frame i(int i, String str, okh okhVar, boolean z, boolean z2) {
        int iJ = j(okhVar);
        if (z2) {
            iJ = Math.min(1, iJ);
        }
        if (iJ >= 0) {
            return z ? new TextInformationFrame(str, null, Integer.toString(iJ)) : new CommentFrame("und", str, Integer.toString(iJ));
        }
        String strValueOf = String.valueOf(zl1.a(i));
        toe.h("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strValueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    public static int j(okh okhVar) {
        okhVar.Q(4);
        if (okhVar.n() == 1684108385) {
            okhVar.Q(8);
            return okhVar.D();
        }
        toe.h("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i, hxa hxaVar, Format.b bVar) {
        if (i == 1 && hxaVar.a()) {
            bVar.M(hxaVar.f20561a).N(hxaVar.f20562b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    public static void l(int i, Metadata metadata, Metadata metadata2, Format.b bVar, Metadata... metadataArr) {
        Metadata metadata3 = new Metadata(new Metadata.Entry[0]);
        if (i == 1) {
            if (metadata == null) {
                metadata = metadata3;
                break;
            }
        } else {
            if (i != 2 || metadata2 == null) {
                metadata = metadata3;
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= metadata2.e()) {
                    metadata = metadata3;
                    break;
                }
                Metadata.Entry entryD = metadata2.d(i2);
                if (entryD instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entryD;
                    if (MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS.equals(mdtaMetadataEntry.f8011a)) {
                        metadata = new Metadata(mdtaMetadataEntry);
                        break;
                    }
                }
                i2++;
            }
        }
        for (Metadata metadata4 : metadataArr) {
            metadata = metadata.c(metadata4);
        }
        if (metadata.e() > 0) {
            bVar.X(metadata);
        }
    }
}
