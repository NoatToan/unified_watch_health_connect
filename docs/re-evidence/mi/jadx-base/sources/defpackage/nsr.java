package defpackage;

import coil.util.Utils;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class nsr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f28336a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f28337b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static r8g a(String str) throws IOException {
        try {
            return b(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            toe.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static r8g b(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!ksr.f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw new ParserException("Couldn't find xmp metadata");
        }
        ImmutableList<r8g.a> immutableListOf = ImmutableList.of();
        long j = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (ksr.f(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!d(xmlPullParserNewPullParser)) {
                    return null;
                }
                long jE = e(xmlPullParserNewPullParser);
                immutableListOf = c(xmlPullParserNewPullParser);
                j = jE;
            } else if (ksr.f(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableListOf = f(xmlPullParserNewPullParser, "Container", "Item");
            } else if (ksr.f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableListOf = f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!ksr.d(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (immutableListOf.isEmpty()) {
            return null;
        }
        return new r8g(j, immutableListOf);
    }

    public static ImmutableList<r8g.a> c(XmlPullParser xmlPullParser) {
        for (String str : c) {
            String strA = ksr.a(xmlPullParser, str);
            if (strA != null) {
                return ImmutableList.of(new r8g.a(Utils.MIME_TYPE_JPEG, "Primary", 0L, 0L), new r8g.a("video/mp4", "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return ImmutableList.of();
    }

    public static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f28336a) {
            String strA = ksr.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    public static long e(XmlPullParser xmlPullParser) {
        for (String str : f28337b) {
            String strA = ksr.a(xmlPullParser, str);
            if (strA != null) {
                long j = Long.parseLong(strA);
                if (j == -1) {
                    return -9223372036854775807L;
                }
                return j;
            }
        }
        return -9223372036854775807L;
    }

    public static ImmutableList<r8g.a> f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.a aVarBuilder = ImmutableList.builder();
        String strConcat = String.valueOf(str).concat(":Item");
        String strConcat2 = String.valueOf(str).concat(":Directory");
        do {
            xmlPullParser.next();
            if (ksr.f(xmlPullParser, strConcat)) {
                String strConcat3 = String.valueOf(str2).concat(":Mime");
                String strConcat4 = String.valueOf(str2).concat(":Semantic");
                String strConcat5 = String.valueOf(str2).concat(":Length");
                String strConcat6 = String.valueOf(str2).concat(":Padding");
                String strA = ksr.a(xmlPullParser, strConcat3);
                String strA2 = ksr.a(xmlPullParser, strConcat4);
                String strA3 = ksr.a(xmlPullParser, strConcat5);
                String strA4 = ksr.a(xmlPullParser, strConcat6);
                if (strA == null || strA2 == null) {
                    return ImmutableList.of();
                }
                aVarBuilder.a(new r8g.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!ksr.d(xmlPullParser, strConcat2));
        return aVarBuilder.k();
    }
}
