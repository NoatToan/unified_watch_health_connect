package defpackage;

import android.content.Context;
import com.huawei.hwidauth.utils.globalcfg.CountryInfoForCFG;
import com.huawei.hwidauth.utils.globalcfg.SiteInfoForCFG;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class noq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f43381a = "a";

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static noq f43382b = new noq();
    }

    private noq() {
    }

    public static noq a() {
        return a.f43382b;
    }

    public List<CountryInfoForCFG> c(Context context, List<CountryInfoForCFG> list, List<CountryInfoForCFG> list2, List<SiteInfoForCFG> list3) {
        if (context == null) {
            nox.e(f43381a, "parseSiteCountryXML mContext == null", true);
            return list;
        }
        try {
            XmlPullParser xmlPullParserC = noz.c(context, noz.c(context), noz.d(context));
            for (int eventType = xmlPullParserC.getEventType(); 1 != eventType; eventType = xmlPullParserC.next()) {
                String name = xmlPullParserC.getName();
                if (eventType == 2) {
                    e(xmlPullParserC, list, list2, list3, name);
                }
            }
        } catch (IOException unused) {
            nox.a(f43381a, "parseXMLGetCountryList IOException", true);
        } catch (XmlPullParserException unused2) {
            nox.a(f43381a, "parseXMLGetCountryList XmlPullParserException", true);
        }
        return list;
    }

    private void a(XmlPullParser xmlPullParser, List<CountryInfoForCFG> list, List<CountryInfoForCFG> list2, String str) {
        CountryInfoForCFG countryInfoForCFG = new CountryInfoForCFG();
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i) == null ? "" : xmlPullParser.getAttributeValue(i);
            if ("site-id".equals(attributeName)) {
                countryInfoForCFG.a(attributeValue);
            } else if ("name-zh".equals(attributeName)) {
                countryInfoForCFG.b(attributeValue);
            } else if ("name-en".equals(attributeName)) {
                countryInfoForCFG.c(attributeValue);
            } else if ("iso-2code".equals(attributeName)) {
                countryInfoForCFG.d(attributeValue);
            } else if ("tel-code".equals(attributeName)) {
                countryInfoForCFG.e(attributeValue);
            } else if ("mcc".equals(attributeName)) {
                countryInfoForCFG.f(attributeValue);
            } else if ("sms".equals(attributeName)) {
                countryInfoForCFG.g(attributeValue);
            } else if ("register".equals(attributeName)) {
                countryInfoForCFG.h(attributeValue);
            }
        }
        if ("country".equals(str)) {
            list.add(countryInfoForCFG);
        } else {
            list2.add(countryInfoForCFG);
        }
    }

    private void a(XmlPullParser xmlPullParser, List<SiteInfoForCFG> list) {
        SiteInfoForCFG siteInfoForCFG = new SiteInfoForCFG();
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i) == null ? "" : xmlPullParser.getAttributeValue(i);
            if ("id".equals(attributeName)) {
                siteInfoForCFG.a(attributeValue);
            } else if ("name-zh".equals(attributeName)) {
                siteInfoForCFG.b(attributeValue);
            } else if ("name-en".equals(attributeName)) {
                siteInfoForCFG.c(attributeValue);
            } else if ("register".equals(attributeName)) {
                siteInfoForCFG.d(attributeValue);
            }
        }
        list.add(siteInfoForCFG);
    }

    private void e(XmlPullParser xmlPullParser, List<CountryInfoForCFG> list, List<CountryInfoForCFG> list2, List<SiteInfoForCFG> list3, String str) {
        if ("country".equals(str) || "country-plus".equals(str)) {
            a(xmlPullParser, list, list2, str);
        } else if ("site".equals(str)) {
            a(xmlPullParser, list3);
        }
    }
}
