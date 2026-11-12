package jb;

import androidx.media3.common.ParserException;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import fa.a0;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f98097a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f98098b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f98099c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private f() {
    }

    public static c a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!a0.c(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        ImmutableList<c.a> immutableListOf = ImmutableList.of();
        long j8 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (a0.c(xmlPullParserNewPullParser, "rdf:Description")) {
                int i14 = 0;
                for (int i15 = 0; i15 < 4; i15++) {
                    String strA = a0.a(xmlPullParserNewPullParser, f98097a[i15]);
                    if (strA != null) {
                        if (Integer.parseInt(strA) != 1) {
                            break loop0;
                        }
                        int i16 = 0;
                        while (true) {
                            if (i16 < 4) {
                                String strA2 = a0.a(xmlPullParserNewPullParser, f98098b[i16]);
                                if (strA2 != null) {
                                    j8 = Long.parseLong(strA2);
                                    if (j8 != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i16++;
                            }
                            j8 = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i14 >= 2) {
                                immutableListOf = ImmutableList.of();
                                break;
                            }
                            String strA3 = a0.a(xmlPullParserNewPullParser, f98099c[i14]);
                            if (strA3 != null) {
                                immutableListOf = ImmutableList.of(new c.a(MimeTypes.IMAGE_JPEG, "Primary", 0L, 0L), new c.a(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(strA3), 0L));
                                break;
                            }
                            i14++;
                        }
                    }
                }
                return null;
            }
            if (a0.c(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableListOf = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (a0.c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableListOf = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!a0.b(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (immutableListOf.isEmpty()) {
            break loop0;
        }
        return new c(j8, immutableListOf);
        return null;
    }

    public static ImmutableList<c.a> b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.Builder builder = ImmutableList.builder();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (a0.c(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strA = a0.a(xmlPullParser, strConcat3);
                String strA2 = a0.a(xmlPullParser, strConcat4);
                String strA3 = a0.a(xmlPullParser, strConcat5);
                String strA4 = a0.a(xmlPullParser, strConcat6);
                if (strA == null || strA2 == null) {
                    return ImmutableList.of();
                }
                builder.add(new c.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!a0.b(xmlPullParser, strConcat2));
        return builder.build();
    }
}
