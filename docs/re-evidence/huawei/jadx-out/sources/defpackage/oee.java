package defpackage;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class oee {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f44228c = "XmlUtils";

    public static boolean d(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.getEventType() == 3 && "characteristic".equals(xmlPullParser.getName());
        } catch (XmlPullParserException unused) {
            ocq.c(f44228c, "parse xml error");
            return false;
        }
    }
}
