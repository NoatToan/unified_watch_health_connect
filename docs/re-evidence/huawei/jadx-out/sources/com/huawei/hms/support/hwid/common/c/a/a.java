package com.huawei.hms.support.hwid.common.c.a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.hwid.common.e.e;
import com.huawei.hms.support.hwid.common.e.h;
import com.huawei.hms.support.hwid.common.e.i;
import com.huawei.up.request.HttpRequestBase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes34.dex */
public class a extends com.huawei.hms.support.hwid.common.c.a {
    private String e;
    private String g;
    private String i;
    private String j;
    private int f = -1;
    private String h = "siteDomain";
    private int k = 0;
    private String l = "/AccountServer/IUserInfoMng/getResource";

    public a(Context context, String str) {
        this.i = str;
        this.j = a(context);
    }

    public String e() throws IllegalStateException, IOException, IllegalArgumentException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            XmlSerializer xmlSerializerA = i.a(byteArrayOutputStream);
            xmlSerializerA.startDocument("UTF-8", true);
            xmlSerializerA.startTag(null, "GetResourceReq");
            i.a(xmlSerializerA, "version", "66300");
            if (!TextUtils.isEmpty(this.i)) {
                i.a(xmlSerializerA, "resourceID", this.i);
            } else {
                i.a(xmlSerializerA, "resourceID", this.h);
            }
            if (!TextUtils.isEmpty(this.j)) {
                i.a(xmlSerializerA, "languageCode", this.j);
            }
            i.a(xmlSerializerA, "reqClientType", String.valueOf(this.k));
            i.a(xmlSerializerA, "clientVersion", com.huawei.hms.support.hwid.common.e.b.a());
            xmlSerializerA.endTag(null, "GetResourceReq");
            xmlSerializerA.endDocument();
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
                e.b("GetResourceRequest", e2.getClass().getSimpleName());
            }
        }
    }

    public void a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserA = i.a(str.getBytes("UTF-8"));
        for (int eventType = xmlPullParserA.getEventType(); 1 != eventType; eventType = xmlPullParserA.next()) {
            String name = xmlPullParserA.getName();
            if (eventType == 2) {
                if ("result".equals(name)) {
                    this.f16612b = h.a(xmlPullParserA.getAttributeValue(null, "resultCode"));
                }
                if (this.f16612b == 0) {
                    if ("ResourceContent".equals(name)) {
                        this.e = xmlPullParserA.nextText();
                        e.a("GetResourceRequest", "resourceContent");
                    }
                } else if ("errorCode".equals(name)) {
                    this.f = h.a(xmlPullParserA.nextText());
                } else if (HttpRequestBase.TAG_ERROR_DESC.equals(name)) {
                    this.g = xmlPullParserA.nextText();
                }
            }
        }
    }

    @Override // com.huawei.hms.support.hwid.common.c.a
    public String a(Context context) {
        return com.huawei.hms.support.hwid.common.e.b.d(context);
    }

    public String f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    public String h() {
        return this.g;
    }

    @Override // com.huawei.hms.support.hwid.common.c.a
    public String a() {
        return this.l;
    }
}
