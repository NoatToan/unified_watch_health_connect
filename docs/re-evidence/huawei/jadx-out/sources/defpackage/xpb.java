package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes20.dex */
public class xpb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53264b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f53265c = null;
    private String d = null;
    private xos e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<xos> f53263a = null;
    private Map<String, List<xos>> j = new HashMap();

    public void a(Context context, Map<String, List<xos>> map, int i) {
        try {
            d(context, map, context.getResources().getXml(i));
        } catch (Exception unused) {
            xnd.d("AddressNameMgr", "XmlParseUtil,parseXml-xmlRes exception", false);
        }
    }

    private void d(Context context, Map<String, List<xos>> map, XmlResourceParser xmlResourceParser) {
        this.j = map;
        if (xmlResourceParser == null) {
            return;
        }
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    c(xmlResourceParser);
                } else if (eventType == 3) {
                    d(xmlResourceParser);
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | IndexOutOfBoundsException | XmlPullParserException unused) {
            xnd.a("AddressNameMgr", " Process address mapping xml file failed.", null, false);
        }
    }

    private void d(XmlResourceParser xmlResourceParser) {
        xos xosVar;
        if ("Module".equals(xmlResourceParser.getName())) {
            this.j.put(this.f53264b, this.f53263a);
            this.f53263a = null;
        }
        if ("Param".equals(xmlResourceParser.getName()) && (xosVar = this.e) != null) {
            xosVar.e(this.f53265c, this.d);
        }
        if ("Address".equals(xmlResourceParser.getName())) {
            List<xos> list = this.f53263a;
            if (list != null) {
                list.add(this.e);
            }
            this.e = null;
        }
    }

    private void c(XmlPullParser xmlPullParser) {
        if ("Module".equals(xmlPullParser.getName())) {
            this.f53264b = xmlPullParser.getAttributeValue(null, "name");
            this.f53263a = new ArrayList();
        } else if (this.f53263a != null) {
            if ("Address".equals(xmlPullParser.getName())) {
                this.e = new xos(xmlPullParser.getAttributeValue(null, "name"), xmlPullParser.getAttributeValue(null, "serverAddressName"));
            }
        } else {
            if (this.e == null || !"Param".equals(xmlPullParser.getName())) {
                return;
            }
            this.f53265c = xmlPullParser.getAttributeValue(null, "name");
            this.d = xmlPullParser.getAttributeValue(null, "value");
        }
    }
}
