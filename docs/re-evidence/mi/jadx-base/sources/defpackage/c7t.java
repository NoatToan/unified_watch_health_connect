package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes11.dex */
public class c7t implements pys {
    public static vxs a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String[] strArr;
        String[] strArr2;
        String strTrim;
        ArrayList arrayList;
        if (xmlPullParser.getEventType() != 2) {
            return null;
        }
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        if (xmlPullParser.getAttributeCount() > 0) {
            String[] strArr3 = new String[xmlPullParser.getAttributeCount()];
            String[] strArr4 = new String[xmlPullParser.getAttributeCount()];
            for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                strArr3[i] = xmlPullParser.getAttributeName(i);
                strArr4[i] = uys.e(xmlPullParser.getAttributeValue(i));
            }
            strArr = strArr3;
            strTrim = null;
            arrayList = null;
            strArr2 = strArr4;
        } else {
            strArr = null;
            strArr2 = null;
            strTrim = null;
            arrayList = null;
        }
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                return new vxs(name, namespace, strArr, strArr2, strTrim, arrayList);
            }
            if (next == 4) {
                strTrim = xmlPullParser.getText().trim();
            } else if (next == 2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                vxs vxsVarA = a(xmlPullParser);
                if (vxsVarA != null) {
                    arrayList.add(vxsVarA);
                }
            }
        }
    }

    public void b() {
        qys.a().e("all", "xm:chat", this);
    }

    public vxs c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && eventType != 2) {
            eventType = xmlPullParser.next();
        }
        if (eventType == 2) {
            return a(xmlPullParser);
        }
        return null;
    }
}
