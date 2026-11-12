package com.google.android.exoplayer2.util;

import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes14.dex */
public final class XmlPullParserUtil {
    private XmlPullParserUtil() {
    }

    public static String getAttributeValue(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i14 = 0; i14 < attributeCount; i14++) {
            if (xmlPullParser.getAttributeName(i14).equals(str)) {
                return xmlPullParser.getAttributeValue(i14);
            }
        }
        return null;
    }

    public static String getAttributeValueIgnorePrefix(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i14 = 0; i14 < attributeCount; i14++) {
            if (stripPrefix(xmlPullParser.getAttributeName(i14)).equals(str)) {
                return xmlPullParser.getAttributeValue(i14);
            }
        }
        return null;
    }

    public static boolean isEndTag(XmlPullParser xmlPullParser, String str) {
        return isEndTag(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean isStartTag(XmlPullParser xmlPullParser, String str) {
        return isStartTag(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean isStartTagIgnorePrefix(XmlPullParser xmlPullParser, String str) {
        return isStartTag(xmlPullParser) && stripPrefix(xmlPullParser.getName()).equals(str);
    }

    private static String stripPrefix(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }

    public static boolean isEndTag(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean isStartTag(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }
}
