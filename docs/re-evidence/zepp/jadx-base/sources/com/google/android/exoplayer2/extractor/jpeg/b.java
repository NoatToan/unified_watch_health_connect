package com.google.android.exoplayer2.extractor.jpeg;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
final class b {
    private static final String a = "MotionPhotoXmpParser";
    private static final String[] b = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] c = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] d = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private b() {
    }

    @Nullable
    public static MotionPhotoDescription a(String xmpString) throws IOException {
        try {
            return b(xmpString);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            Log.w(a, "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    @Nullable
    private static MotionPhotoDescription b(String xmpString) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(xmpString));
        xmlPullParserNewPullParser.next();
        if (!XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        long jE = C.TIME_UNSET;
        ImmutableList<MotionPhotoDescription.ContainerItem> immutableListOf = ImmutableList.of();
        do {
            xmlPullParserNewPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!d(xmlPullParserNewPullParser)) {
                    return null;
                }
                jE = e(xmlPullParserNewPullParser);
                immutableListOf = c(xmlPullParserNewPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableListOf = f(xmlPullParserNewPullParser, "Container", "Item");
            } else if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableListOf = f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (immutableListOf.isEmpty()) {
            return null;
        }
        return new MotionPhotoDescription(jE, immutableListOf);
    }

    private static ImmutableList<MotionPhotoDescription.ContainerItem> c(XmlPullParser xpp) {
        for (String str : d) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xpp, str);
            if (attributeValue != null) {
                return ImmutableList.of(new MotionPhotoDescription.ContainerItem(MimeTypes.IMAGE_JPEG, "Primary", 0L, 0L), new MotionPhotoDescription.ContainerItem(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(attributeValue), 0L));
            }
        }
        return ImmutableList.of();
    }

    private static boolean d(XmlPullParser xpp) {
        for (String str : b) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xpp, str);
            if (attributeValue != null) {
                return Integer.parseInt(attributeValue) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xpp) {
        for (String str : c) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xpp, str);
            if (attributeValue != null) {
                long j = Long.parseLong(attributeValue);
                return j == -1 ? C.TIME_UNSET : j;
            }
        }
        return C.TIME_UNSET;
    }

    private static ImmutableList<MotionPhotoDescription.ContainerItem> f(XmlPullParser xpp, String containerNamespacePrefix, String itemNamespacePrefix) throws XmlPullParserException, IOException {
        ImmutableList.Builder builder = ImmutableList.builder();
        String strConcat = String.valueOf(containerNamespacePrefix).concat(":Item");
        String strConcat2 = String.valueOf(containerNamespacePrefix).concat(":Directory");
        do {
            xpp.next();
            if (XmlPullParserUtil.isStartTag(xpp, strConcat)) {
                String strConcat3 = String.valueOf(itemNamespacePrefix).concat(":Mime");
                String strConcat4 = String.valueOf(itemNamespacePrefix).concat(":Semantic");
                String strConcat5 = String.valueOf(itemNamespacePrefix).concat(":Length");
                String strConcat6 = String.valueOf(itemNamespacePrefix).concat(":Padding");
                String attributeValue = XmlPullParserUtil.getAttributeValue(xpp, strConcat3);
                String attributeValue2 = XmlPullParserUtil.getAttributeValue(xpp, strConcat4);
                String attributeValue3 = XmlPullParserUtil.getAttributeValue(xpp, strConcat5);
                String attributeValue4 = XmlPullParserUtil.getAttributeValue(xpp, strConcat6);
                if (attributeValue == null || attributeValue2 == null) {
                    return ImmutableList.of();
                }
                builder.add(new MotionPhotoDescription.ContainerItem(attributeValue, attributeValue2, attributeValue3 != null ? Long.parseLong(attributeValue3) : 0L, attributeValue4 != null ? Long.parseLong(attributeValue4) : 0L));
            }
        } while (!XmlPullParserUtil.isEndTag(xpp, strConcat2));
        return builder.build();
    }
}
