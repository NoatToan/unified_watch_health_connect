package com.garmin.android.gfdi.configuration;

import j20.x;
import java.io.IOException;
import java.util.EnumSet;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes8.dex */
final class XmlUtil {
    public static boolean readBoolean(XmlPullParser xmlPullParser) {
        return Boolean.parseBoolean(readText(xmlPullParser));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Enum<T>> EnumSet<T> readEnumSet(XmlPullParser xmlPullParser, String str, Class<T> cls) throws XmlPullParserException, IOException {
        EnumSet<T> enumSet = (EnumSet<T>) EnumSet.noneOf(cls);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals(str)) {
                    String text = readText(xmlPullParser);
                    for (Enum r14 : EnumSet.allOf(cls)) {
                        if (r14.name().equalsIgnoreCase(text)) {
                            enumSet.add(r14);
                            break;
                        }
                    }
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        return enumSet;
    }

    public static int readInt(XmlPullParser xmlPullParser) {
        return Integer.parseInt(readText(xmlPullParser));
    }

    public static long readLong(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String text = readText(xmlPullParser);
        return text.startsWith("0x") ? Long.parseLong(text.substring(2), 16) : Long.parseLong(text);
    }

    public static String readText(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.next() != 4) {
            return null;
        }
        String text = xmlPullParser.getText();
        xmlPullParser.nextTag();
        return text;
    }

    public static UUID readUuid(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String text = readText(xmlPullParser);
        if (text == null) {
            return null;
        }
        return UUID.fromString(text);
    }

    public static void skip(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            x.h();
            return;
        }
        int i14 = 1;
        while (i14 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i14++;
            } else if (next == 3) {
                i14--;
            }
        }
    }
}
