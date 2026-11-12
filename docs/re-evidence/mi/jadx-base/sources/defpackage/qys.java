package defpackage;

import com.xiaomi.push.e;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes11.dex */
public class qys {
    public static qys c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Object> f31991a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, Object> f31992b = new ConcurrentHashMap();

    public qys() throws Throwable {
        d();
    }

    public static synchronized qys a() {
        try {
            if (c == null) {
                c = new qys();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public Object b(String str, String str2) {
        return this.f31991a.get(c(str, str2));
    }

    public final String c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(str);
        sb.append("/>");
        if (str != null) {
            sb.append("<");
            sb.append(str2);
            sb.append("/>");
        }
        return sb.toString();
    }

    public void d() throws Throwable {
        InputStream inputStreamOpenStream;
        try {
            for (ClassLoader classLoader : f()) {
                Enumeration<URL> resources = classLoader.getResources("META-INF/smack.providers");
                while (resources.hasMoreElements()) {
                    try {
                        inputStreamOpenStream = resources.nextElement().openStream();
                        try {
                            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                            xmlPullParserNewPullParser.setInput(inputStreamOpenStream, "UTF-8");
                            int eventType = xmlPullParserNewPullParser.getEventType();
                            do {
                                if (eventType == 2) {
                                    if (xmlPullParserNewPullParser.getName().equals("iqProvider")) {
                                        xmlPullParserNewPullParser.next();
                                        xmlPullParserNewPullParser.next();
                                        String strNextText = xmlPullParserNewPullParser.nextText();
                                        xmlPullParserNewPullParser.next();
                                        xmlPullParserNewPullParser.next();
                                        String strNextText2 = xmlPullParserNewPullParser.nextText();
                                        xmlPullParserNewPullParser.next();
                                        xmlPullParserNewPullParser.next();
                                        String strNextText3 = xmlPullParserNewPullParser.nextText();
                                        String strC = c(strNextText, strNextText2);
                                        if (!this.f31992b.containsKey(strC)) {
                                            try {
                                                Class<?> cls = Class.forName(strNextText3);
                                                if (oys.class.isAssignableFrom(cls)) {
                                                    this.f31992b.put(strC, cls.newInstance());
                                                } else if (e.class.isAssignableFrom(cls)) {
                                                    this.f31992b.put(strC, cls);
                                                }
                                            } catch (ClassNotFoundException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    } else if (xmlPullParserNewPullParser.getName().equals("extensionProvider")) {
                                        xmlPullParserNewPullParser.next();
                                        xmlPullParserNewPullParser.next();
                                        String strNextText4 = xmlPullParserNewPullParser.nextText();
                                        xmlPullParserNewPullParser.next();
                                        xmlPullParserNewPullParser.next();
                                        String strNextText5 = xmlPullParserNewPullParser.nextText();
                                        xmlPullParserNewPullParser.next();
                                        xmlPullParserNewPullParser.next();
                                        String strNextText6 = xmlPullParserNewPullParser.nextText();
                                        String strC2 = c(strNextText4, strNextText5);
                                        if (!this.f31991a.containsKey(strC2)) {
                                            try {
                                                Class<?> cls2 = Class.forName(strNextText6);
                                                if (pys.class.isAssignableFrom(cls2)) {
                                                    this.f31991a.put(strC2, cls2.newInstance());
                                                } else if (hys.class.isAssignableFrom(cls2)) {
                                                    this.f31991a.put(strC2, cls2);
                                                }
                                            } catch (ClassNotFoundException e2) {
                                                e2.printStackTrace();
                                            }
                                        }
                                    }
                                }
                                eventType = xmlPullParserNewPullParser.next();
                            } while (eventType != 1);
                            inputStreamOpenStream.close();
                        } catch (Throwable th) {
                            th = th;
                            try {
                                inputStreamOpenStream.close();
                            } catch (Exception unused) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStreamOpenStream = null;
                    }
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public void e(String str, String str2, Object obj) {
        if (!(obj instanceof pys) && !(obj instanceof Class)) {
            throw new IllegalArgumentException("Provider must be a PacketExtensionProvider or a Class instance.");
        }
        this.f31991a.put(c(str, str2), obj);
    }

    public final ClassLoader[] f() {
        ClassLoader[] classLoaderArr = {qys.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            ClassLoader classLoader = classLoaderArr[i];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }
}
