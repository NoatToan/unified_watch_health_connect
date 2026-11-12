package defpackage;

import android.util.JsonReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class odp {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f44204c = "TokenInfo";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44206b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44205a = 0;

    public String a() {
        return this.f44206b;
    }

    private void d(String str) {
        this.f44206b = str;
    }

    private void e(String str) {
        try {
            this.f44205a = Integer.parseInt(str);
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
                if ("token".equals(attributeValue)) {
                    d(attributeValue2);
                } else if ("validity".equals(attributeValue)) {
                    e(attributeValue2);
                } else if (ocq.f44154c.booleanValue()) {
                    ocq.a(f44204c, "expected tag = " + attributeValue);
                }
            }
        }
    }

    public void c(JsonReader jsonReader) throws IllegalStateException, IOException {
        if (jsonReader == null) {
            ocq.c(f44204c, "parserJsonItems reader == null");
            return;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("validity")) {
                e(String.valueOf(jsonReader.nextInt()));
            } else if (strNextName.equals("token")) {
                d(jsonReader.nextString());
            } else {
                ocq.a(f44204c, "unexpected tag");
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        ocq.a(f44204c, "token finish");
    }
}
