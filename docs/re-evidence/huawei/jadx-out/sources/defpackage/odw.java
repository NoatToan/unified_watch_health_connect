package defpackage;

import android.util.JsonReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes12.dex */
public class odw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private odq f44217c = null;
    private odn e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private odp f44216a = null;
    private odj d = null;

    public void d(odq odqVar) {
        this.f44217c = odqVar;
    }

    public void c(odn odnVar) {
        this.e = odnVar;
    }

    public odp e() {
        return this.f44216a;
    }

    public void e(odp odpVar) {
        this.f44216a = odpVar;
    }

    public void c(odj odjVar) {
        this.d = odjVar;
    }

    public void d(String str) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes("UTF-8"));
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                xmlPullParserNewPullParser.setInput(byteArrayInputStream, "UTF-8");
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                    if (eventType == 2 && "characteristic".equals(xmlPullParserNewPullParser.getName())) {
                        String attributeValue = xmlPullParserNewPullParser.getAttributeValue(0);
                        if ("EAP-AKA".equals(attributeValue)) {
                            odq odqVar = new odq();
                            odqVar.b(xmlPullParserNewPullParser);
                            d(odqVar);
                        } else if ("VERS".equals(attributeValue)) {
                            odn odnVar = new odn();
                            odnVar.c(xmlPullParserNewPullParser);
                            c(odnVar);
                        } else if ("TOKEN".equals(attributeValue)) {
                            odp odpVar = new odp();
                            odpVar.c(xmlPullParserNewPullParser);
                            e(odpVar);
                        } else if (!"APPLICATION".equals(attributeValue)) {
                            ocq.a("EntitleResponse", "unexpected tag type =" + attributeValue);
                        } else {
                            odj odjVar = new odj();
                            odjVar.a(xmlPullParserNewPullParser);
                            c(odjVar);
                        }
                    }
                }
                byteArrayInputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | XmlPullParserException unused) {
            ocq.c("EntitleResponse", "pullParserXml->XmlPullParserException error");
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    public void e(String str) {
        byte b2;
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 2662736) {
                    if (iHashCode != 80988633) {
                        if (iHashCode == 1597464377 && strNextName.equals("AccessControl")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                    } else if (strNextName.equals("Token")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (strNextName.equals("Vers")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    odn odnVar = new odn();
                    odnVar.d(jsonReader);
                    c(odnVar);
                } else if (b2 == 1) {
                    odp odpVar = new odp();
                    odpVar.c(jsonReader);
                    e(odpVar);
                } else if (b2 == 2) {
                    odj odjVar = new odj();
                    odjVar.d(jsonReader);
                    c(odjVar);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            jsonReader.close();
        } catch (IOException | IllegalStateException unused) {
            ocq.c("EntitleResponse", "pullParserJson error");
        }
    }
}
