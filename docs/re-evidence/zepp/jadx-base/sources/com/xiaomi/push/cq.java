package com.xiaomi.push;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes22.dex */
public class cq {
    private static cq c;
    private Map<String, Object> a = new ConcurrentHashMap();
    private Map<String, Object> b = new ConcurrentHashMap();

    private cq() {
        m3645a();
    }

    public static synchronized cq a() {
        if (c == null) {
            c = new cq();
        }
        return c;
    }

    private String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(SearchCriteria.LT);
        sb.append(str);
        sb.append("/>");
        if (str != null) {
            sb.append(SearchCriteria.LT);
            sb.append(str2);
            sb.append("/>");
        }
        return sb.toString();
    }

    private ClassLoader[] c() {
        ClassLoader[] classLoaderArr = {cq.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            ClassLoader classLoader = classLoaderArr[i];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    public Object a(String str, String str2) {
        return this.a.get(b(str, str2));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3645a() {
        Map<String, Object> map;
        Object objNewInstance;
        Map<String, Object> map2;
        Object objNewInstance2;
        try {
            for (ClassLoader classLoader : c()) {
                Enumeration<URL> resources = classLoader.getResources("META-INF/smack.providers");
                while (resources.hasMoreElements()) {
                    InputStream inputStreamOpenStream = null;
                    try {
                        inputStreamOpenStream = FirebasePerfUrlConnection.openStream(resources.nextElement());
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
                                    String strB = b(strNextText, strNextText2);
                                    if (!this.b.containsKey(strB)) {
                                        try {
                                            Class<?> cls = Class.forName(strNextText3);
                                            if (co.class.isAssignableFrom(cls)) {
                                                map2 = this.b;
                                                objNewInstance2 = cls.newInstance();
                                            } else if (ch.class.isAssignableFrom(cls)) {
                                                map2 = this.b;
                                                objNewInstance2 = cls;
                                            }
                                            map2.put(strB, objNewInstance2);
                                        } catch (ClassNotFoundException e) {
                                            e = e;
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
                                    String strB2 = b(strNextText4, strNextText5);
                                    if (!this.a.containsKey(strB2)) {
                                        try {
                                            Class<?> cls2 = Class.forName(strNextText6);
                                            if (cp.class.isAssignableFrom(cls2)) {
                                                map = this.a;
                                                objNewInstance = cls2.newInstance();
                                            } else if (ck.class.isAssignableFrom(cls2)) {
                                                map = this.a;
                                                objNewInstance = cls2;
                                            }
                                            map.put(strB2, objNewInstance);
                                        } catch (ClassNotFoundException e2) {
                                            e = e2;
                                            e.printStackTrace();
                                        }
                                    }
                                }
                            }
                            eventType = xmlPullParserNewPullParser.next();
                        } while (eventType != 1);
                        inputStreamOpenStream.close();
                    } catch (Throwable th) {
                        try {
                            inputStreamOpenStream.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public void a(String str, String str2, Object obj) {
        if (!(obj instanceof cp) && !(obj instanceof Class)) {
            throw new IllegalArgumentException("Provider must be a PacketExtensionProvider or a Class instance.");
        }
        this.a.put(b(str, str2), obj);
    }
}
