package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwidauth.c.k;
import com.huawei.up.request.HttpRequestBase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes3.dex */
public class nnf extends k {
    private String e;
    private String f;
    private String g;
    private String j;
    private String m;
    private int h = -1;
    private String i = "";
    private int n = 0;

    public nnf(Context context, String str) {
        this.f = str;
        this.m = nom.e(context);
    }

    @Override // com.huawei.hwidauth.c.k
    public String a() throws IllegalStateException, IOException, IllegalArgumentException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            XmlSerializer xmlSerializerB = nnn.b(byteArrayOutputStream);
            xmlSerializerB.startDocument("UTF-8", true);
            xmlSerializerB.startTag(null, "GetResourceReq");
            nnn.e(xmlSerializerB, "version", "66300");
            if (!TextUtils.isEmpty(this.f)) {
                nnn.e(xmlSerializerB, "resourceID", this.f);
            } else {
                nnn.e(xmlSerializerB, "resourceID", this.g);
            }
            if (!TextUtils.isEmpty(this.i)) {
                nnn.e(xmlSerializerB, "ResourceOldVer", this.i);
            }
            if (!TextUtils.isEmpty(this.m)) {
                nnn.e(xmlSerializerB, "languageCode", this.m);
            }
            nnn.e(xmlSerializerB, "reqClientType", String.valueOf(this.n));
            nnn.e(xmlSerializerB, "clientVersion", "HwID_6.13.0.301");
            xmlSerializerB.endTag(null, "GetResourceReq");
            xmlSerializerB.endDocument();
            String string = byteArrayOutputStream.toString("UTF-8");
            try {
                return string;
            } catch (IOException e) {
                return string;
            }
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e2) {
                nox.a("GetResourceRequest", e2.getClass().getSimpleName(), true);
            }
        }
    }

    public void e(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserC = nnn.c(str.getBytes("UTF-8"));
        for (int eventType = xmlPullParserC.getEventType(); 1 != eventType; eventType = xmlPullParserC.next()) {
            String name = xmlPullParserC.getName();
            if (eventType == 2) {
                if ("result".equals(name)) {
                    this.f17572a = nnh.b(xmlPullParserC.getAttributeValue(null, "resultCode"));
                }
                if (this.f17572a == 0) {
                    if ("ResourceContent".equals(name)) {
                        this.d = xmlPullParserC.nextText();
                        nox.b("GetResourceRequest", "resourceContent", true);
                    } else if ("ResourceVer".equals(name)) {
                        this.e = xmlPullParserC.nextText();
                    }
                } else if ("errorCode".equals(name)) {
                    this.h = nnh.b(xmlPullParserC.nextText());
                } else if (HttpRequestBase.TAG_ERROR_DESC.equals(name)) {
                    this.j = xmlPullParserC.nextText();
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
        return "/AccountServer/IUserInfoMng/getResource?cVersion=HwID_6.13.0.301&Version=66300";
    }
}
