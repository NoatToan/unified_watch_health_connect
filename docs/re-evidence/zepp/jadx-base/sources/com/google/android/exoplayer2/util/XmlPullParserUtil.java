package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class XmlPullParserUtil {
    private XmlPullParserUtil() {
    }

    private static String a(String name) {
        int iIndexOf = name.indexOf(58);
        return iIndexOf == -1 ? name : name.substring(iIndexOf + 1);
    }

    @Nullable
    public static String getAttributeValue(XmlPullParser xpp, String attributeName) {
        int attributeCount = xpp.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xpp.getAttributeName(i).equals(attributeName)) {
                return xpp.getAttributeValue(i);
            }
        }
        return null;
    }

    @Nullable
    public static String getAttributeValueIgnorePrefix(XmlPullParser xpp, String attributeName) {
        int attributeCount = xpp.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (a(xpp.getAttributeName(i)).equals(attributeName)) {
                return xpp.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean isEndTag(XmlPullParser xpp, String name) throws XmlPullParserException {
        return isEndTag(xpp) && xpp.getName().equals(name);
    }

    public static boolean isStartTag(XmlPullParser xpp, String name) throws XmlPullParserException {
        return isStartTag(xpp) && xpp.getName().equals(name);
    }

    public static boolean isStartTagIgnorePrefix(XmlPullParser xpp, String name) throws XmlPullParserException {
        return isStartTag(xpp) && a(xpp.getName()).equals(name);
    }

    public static boolean isEndTag(XmlPullParser xpp) throws XmlPullParserException {
        return xpp.getEventType() == 3;
    }

    public static boolean isStartTag(XmlPullParser xpp) throws XmlPullParserException {
        return xpp.getEventType() == 2;
    }
}
