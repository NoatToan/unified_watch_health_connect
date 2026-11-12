package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes11.dex */
public final class qws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f31920a = 5000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f31921b = 330000;
    public static int c = 600000;
    public static Vector<String> d = new Vector<>();

    static {
        try {
            for (ClassLoader classLoader : e()) {
                Enumeration<URL> resources = classLoader.getResources("META-INF/smack-config.xml");
                while (resources.hasMoreElements()) {
                    InputStream inputStreamOpenStream = null;
                    try {
                        try {
                            inputStreamOpenStream = resources.nextElement().openStream();
                            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                            xmlPullParserNewPullParser.setInput(inputStreamOpenStream, "UTF-8");
                            int eventType = xmlPullParserNewPullParser.getEventType();
                            do {
                                if (eventType == 2) {
                                    if (xmlPullParserNewPullParser.getName().equals("className")) {
                                        d(xmlPullParserNewPullParser);
                                    } else if (xmlPullParserNewPullParser.getName().equals("packetReplyTimeout")) {
                                        f31920a = b(xmlPullParserNewPullParser, f31920a);
                                    } else if (xmlPullParserNewPullParser.getName().equals("keepAliveInterval")) {
                                        f31921b = b(xmlPullParserNewPullParser, f31921b);
                                    } else if (xmlPullParserNewPullParser.getName().equals("mechName")) {
                                        d.add(xmlPullParserNewPullParser.nextText());
                                    }
                                }
                                eventType = xmlPullParserNewPullParser.next();
                            } while (eventType != 1);
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Exception unused) {
                            }
                            throw th;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        inputStreamOpenStream.close();
                    } catch (Exception unused2) {
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static int a() {
        return f31921b;
    }

    public static int b(XmlPullParser xmlPullParser, int i) {
        try {
            return Integer.parseInt(xmlPullParser.nextText());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return i;
        }
    }

    public static String c() {
        return "3.1.0";
    }

    public static void d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = xmlPullParser.nextText();
        try {
            Class.forName(strNextText);
        } catch (ClassNotFoundException unused) {
            System.err.println("Error! A startup class specified in smack-config.xml could not be loaded: " + strNextText);
        }
    }

    public static ClassLoader[] e() {
        ClassLoader[] classLoaderArr = {qws.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            ClassLoader classLoader = classLoaderArr[i];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    public static int f() {
        return c;
    }
}
