package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hwidauth.c.k;
import com.huawei.up.request.HttpRequestBase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes3.dex */
public class nmx extends k {
    private String e;
    private String f;
    private Context g;
    private String h;
    private String j = "";

    public nmx(String str, String str2, String str3, Context context) {
        this.e = str;
        this.f = str2;
        this.h = str3;
        this.g = context;
    }

    @Override // com.huawei.hwidauth.c.k
    public String a() throws IllegalStateException, IOException, IllegalArgumentException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            XmlSerializer xmlSerializerB = nnn.b(byteArrayOutputStream);
            xmlSerializerB.startDocument("UTF-8", true);
            xmlSerializerB.startTag(null, "GetClientConfigurationReq");
            nnn.e(xmlSerializerB, "version", "66300");
            if (!TextUtils.isEmpty(this.e)) {
                nnn.e(xmlSerializerB, "country", this.e);
            } else {
                nnn.e(xmlSerializerB, "country", "");
            }
            if (!TextUtils.isEmpty(this.f)) {
                nnn.e(xmlSerializerB, NetworkService.Constants.CONFIG_SERVICE, this.f);
            } else {
                nnn.e(xmlSerializerB, NetworkService.Constants.CONFIG_SERVICE, "");
            }
            nox.b("GetClientConfigurationRequest", "Request dataVer = " + this.h, true);
            if (!TextUtils.isEmpty(this.h)) {
                nnn.e(xmlSerializerB, "dataVer", this.h);
            } else {
                nnn.e(xmlSerializerB, "dataVer", "");
            }
            xmlSerializerB.endTag(null, "GetClientConfigurationReq");
            xmlSerializerB.endDocument();
            String string = byteArrayOutputStream.toString("UTF-8");
            nox.b("GetClientConfigurationRequest", "Config request info:" + string, false);
            try {
                return string;
            } catch (IOException e) {
                return string;
            }
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e2) {
                nox.a("GetClientConfigurationRequest", e2.getClass().getSimpleName(), true);
            }
        }
    }

    public void e(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserC = nnn.c(str.getBytes("UTF-8"));
        noo.c(this.g).b();
        for (int eventType = xmlPullParserC.getEventType(); 1 != eventType; eventType = xmlPullParserC.next()) {
            String name = xmlPullParserC.getName();
            if (eventType == 2) {
                if ("result".equals(name)) {
                    this.f17572a = nnh.b(xmlPullParserC.getAttributeValue(null, "resultCode"));
                } else if (this.f17572a == 0 && "CountryList".equalsIgnoreCase(name)) {
                    nox.b("GetClientConfigurationRequest", "mResultCode is success.", true);
                    this.j = str;
                    noo.c(this.g).c(xmlPullParserC, str);
                } else if ("errorCode".equals(name)) {
                    this.f17573b = nnh.b(xmlPullParserC.nextText());
                } else if (HttpRequestBase.TAG_ERROR_DESC.equals(name)) {
                    this.f17574c = xmlPullParserC.nextText();
                }
            }
        }
    }

    @Override // com.huawei.hwidauth.c.k
    public String b() {
        return "";
    }

    @Override // com.huawei.hwidauth.c.k
    public String c() {
        return "/AccountServer/IDM/getClientConfiguration?cVersion=HwID_6.13.0.301&Version=66300";
    }

    public String d() {
        return this.j;
    }
}
