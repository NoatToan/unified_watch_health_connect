package defpackage;

import android.util.JsonReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class odn {
    private static final String d = "VersInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44203a = 0;
    private int e = 0;

    private void a(String str) {
        try {
            this.f44203a = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
    }

    private void b(String str) {
        try {
            this.e = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
    }

    public void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        while (true) {
            xmlPullParser.next();
            if (oee.d(xmlPullParser) || xmlPullParser.getEventType() == 1) {
                return;
            }
            if (xmlPullParser.getEventType() == 2 && "parm".equals(xmlPullParser.getName()) && xmlPullParser.getAttributeCount() >= 2) {
                String attributeValue = xmlPullParser.getAttributeValue(0);
                String attributeValue2 = xmlPullParser.getAttributeValue(1);
                if ("version".equals(attributeValue)) {
                    a(attributeValue2);
                } else if ("validity".equals(attributeValue)) {
                    b(attributeValue2);
                } else {
                    ocq.a(d, "unexpected tag");
                }
            }
        }
    }

    public void d(JsonReader jsonReader) throws IllegalStateException, IOException {
        if (jsonReader == null) {
            ocq.c(d, "parserJsonItems reader == null");
            return;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("validity")) {
                b(String.valueOf(jsonReader.nextInt()));
            } else if (strNextName.equals("version")) {
                a(String.valueOf(jsonReader.nextInt()));
            } else {
                ocq.a(d, "unexpected tag");
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        ocq.a(d, "vers finish");
    }
}
