package defpackage;

import android.text.TextUtils;
import android.util.JsonReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class odj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44198b = "ApplicationInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44199a = null;
    private String j = null;
    private int d = -1;
    private String f = null;
    private String i = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44200c = null;
    private int g = -1;
    private int e = -1;
    private int h = -1;

    public void b(String str) {
        this.f44199a = str;
    }

    public void e(String str) {
        this.j = str;
    }

    private void a(String str) {
        try {
            this.d = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
    }

    private void g(String str) {
        this.f = str;
    }

    private void j(String str) {
        this.i = str;
    }

    private void d(String str) {
        this.f44200c = str;
    }

    private void f(String str) {
        try {
            this.g = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            ocq.a(f44198b, "empty addrstatus, set to 2");
            this.e = 2;
        } else {
            try {
                this.e = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
    }

    private void h(String str) {
        try {
            this.h = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
    }

    public void a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        while (true) {
            xmlPullParser.next();
            if (oee.d(xmlPullParser) || xmlPullParser.getEventType() == 1) {
                return;
            }
            if (xmlPullParser.getEventType() == 2 && "parm".equals(xmlPullParser.getName()) && xmlPullParser.getAttributeCount() >= 2) {
                String attributeValue = xmlPullParser.getAttributeValue(0);
                String attributeValue2 = xmlPullParser.getAttributeValue(1);
                if (ocq.f44154c.booleanValue()) {
                    ocq.a(f44198b, "name =" + attributeValue + " value =" + attributeValue2);
                }
                if ("AppID".equals(attributeValue)) {
                    b(attributeValue2);
                } else if ("Name".equals(attributeValue)) {
                    e(attributeValue2);
                } else if ("EntitlementStatus".equals(attributeValue)) {
                    a(attributeValue2);
                } else if ("AddrUpdate_URL".equals(attributeValue) || "ServiceFlow_URL".equals(attributeValue)) {
                    g(attributeValue2);
                } else if ("AddrUpdate_POST_Data".equals(attributeValue) || "ServiceFlow_POST_Data".equals(attributeValue)) {
                    j(attributeValue2);
                } else if ("AddrStatus".equals(attributeValue)) {
                    c(attributeValue2);
                } else if ("TC_Status".equals(attributeValue)) {
                    f(attributeValue2);
                } else if ("ProvStatus".equals(attributeValue)) {
                    h(attributeValue2);
                } else if ("MessageForIncompatible".equals(attributeValue)) {
                    d(attributeValue2);
                } else {
                    ocq.a(f44198b, "unexpected type = " + attributeValue);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    public void d(JsonReader jsonReader) throws IllegalStateException, IOException {
        if (jsonReader == null) {
            ocq.c(f44198b, "parserJsonItems reader == null");
            return;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "ServiceFlow_URL":
                case "AddrUpdate_URL":
                    g(jsonReader.nextString());
                    break;
                case "AddrStatus":
                    c(String.valueOf(jsonReader.nextInt()));
                    break;
                case "AddrUpdate_POST_Data":
                case "ServiceFlow_POST_Data":
                    j(jsonReader.nextString());
                    break;
                case "EntitlementStatus":
                    a(jsonReader.nextString());
                    break;
                case "Name":
                    e(String.valueOf(jsonReader.nextInt()));
                    break;
                case "TC_Status":
                    f(String.valueOf(jsonReader.nextInt()));
                    break;
                case "default":
                    c(jsonReader);
                    break;
                case "ProvStatus":
                    h(String.valueOf(jsonReader.nextInt()));
                    break;
                case "MessageForIncompatible":
                    d(String.valueOf(jsonReader.nextInt()));
                    break;
                default:
                    ocq.a(f44198b, "unexpected tag");
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ocq.a(f44198b, "token finish");
    }

    private void c(JsonReader jsonReader) throws IllegalStateException, IOException {
        if (jsonReader == null) {
            ocq.c(f44198b, "parserJsonDefaultItems reader == null");
            return;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("appId")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    b(jsonReader.nextString());
                }
                jsonReader.endArray();
            } else {
                ocq.a(f44198b, "unexpected tag");
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }
}
