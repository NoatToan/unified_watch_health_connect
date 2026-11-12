package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwidauth.c.k;
import com.huawei.hwidauth.datatype.DeviceInfo;
import com.huawei.up.request.HttpRequestBase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes3.dex */
public class nna extends k {
    private Context e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String n;
    private DeviceInfo o;

    public String e() {
        return this.h;
    }

    public String d() {
        return this.f;
    }

    public String f() {
        return this.n;
    }

    public nna(Context context, String str, String str2, String str3) {
        this.e = context;
        this.i = str;
        this.j = str2;
        this.g = TextUtils.isEmpty(str3) ? "" : str3;
    }

    public void a(DeviceInfo deviceInfo) {
        this.o = deviceInfo;
    }

    @Override // com.huawei.hwidauth.c.k
    public String a() throws IllegalStateException, IOException, IllegalArgumentException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            XmlSerializer xmlSerializerB = nnn.b(byteArrayOutputStream);
            xmlSerializerB.startDocument("UTF-8", true);
            xmlSerializerB.startTag(null, "GetDevAuthCodeReq");
            nnn.e(xmlSerializerB, "version", "66300");
            nnn.e(xmlSerializerB, "uuid", nph.a(this.e));
            if (this.o != null) {
                xmlSerializerB.startTag(null, "deviceInfo");
                DeviceInfo.a(xmlSerializerB, this.o);
                xmlSerializerB.endTag(null, "deviceInfo");
            }
            nnn.e(xmlSerializerB, "oprType", this.i);
            nnn.e(xmlSerializerB, "loginStatus", this.j);
            nnn.e(xmlSerializerB, "serviceToken", this.g);
            nnn.e(xmlSerializerB, "languageCode", nom.e(this.e));
            nnn.e(xmlSerializerB, "appID", "com.huawei.hwid");
            xmlSerializerB.endTag(null, "GetDevAuthCodeReq");
            xmlSerializerB.endDocument();
            String string = byteArrayOutputStream.toString("UTF-8");
            try {
                return string;
            } catch (IOException unused) {
                return string;
            }
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused2) {
                nox.a("GetDevAuthCodeRequest", "GetDevAuthCodeRequest IOException", true);
            }
        }
    }

    @Override // com.huawei.hwidauth.c.k
    public int g() {
        return this.f17573b;
    }

    @Override // com.huawei.hwidauth.c.k
    public String h() {
        return this.f17574c;
    }

    public void e(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserC = nnn.c(str.getBytes("UTF-8"));
        for (int eventType = xmlPullParserC.getEventType(); 1 != eventType; eventType = xmlPullParserC.next()) {
            String name = xmlPullParserC.getName();
            if (eventType == 2) {
                if ("result".equals(name)) {
                    this.f17572a = nom.b(xmlPullParserC.getAttributeValue(null, "resultCode"));
                }
                if (this.f17572a == 0) {
                    if ("devAuthCode".equals(name)) {
                        this.h = xmlPullParserC.nextText();
                    } else if ("encryptKey".equals(name)) {
                        this.f = xmlPullParserC.nextText();
                    } else if ("randomID".equals(name)) {
                        this.n = xmlPullParserC.nextText();
                    }
                } else if ("errorCode".equals(name)) {
                    this.f17573b = nom.b(xmlPullParserC.nextText());
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
        return "/AccountServer/IUserDeviceMng/getDevAuthCode?cVersion=HwID_6.13.0.301&Version=66300&ctrID=" + System.currentTimeMillis() + nom.s();
    }
}
