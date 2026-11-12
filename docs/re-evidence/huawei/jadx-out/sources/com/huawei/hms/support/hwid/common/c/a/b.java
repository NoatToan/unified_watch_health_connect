package com.huawei.hms.support.hwid.common.c.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hms.support.hwid.bean.CheckPasswordByUserIdReq;
import com.huawei.hms.support.hwid.common.e.e;
import com.huawei.hms.support.hwid.common.e.h;
import com.huawei.hms.support.hwid.common.e.i;
import com.huawei.hwidauth.datatype.DeviceInfo;
import com.huawei.up.request.HttpRequestBase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import ohos.ace.adapter.capability.web.WebDataBaseColumns;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes34.dex */
public class b extends com.huawei.hms.support.hwid.common.c.a {
    private String e;
    private String f;
    private String g;
    private String h;
    private String i = "/IUserPwdMng/uidVerifyPasswordV3";
    private String j = "7";
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;

    public b(Context context, CheckPasswordByUserIdReq checkPasswordByUserIdReq, String str, String str2, String str3) {
        this.e = checkPasswordByUserIdReq.getUserId();
        this.l = str3;
        this.g = checkPasswordByUserIdReq.getAppId();
        String guardianUserID = checkPasswordByUserIdReq.getGuardianUserID();
        this.m = guardianUserID;
        this.f = TextUtils.isEmpty(guardianUserID) ? "0" : "1";
        this.h = com.huawei.hms.support.hwid.common.b.b.a(checkPasswordByUserIdReq.getPassword(), str2);
        this.n = a(context);
        this.r = com.huawei.hms.support.hwid.common.a.a.a(context);
        this.o = checkPasswordByUserIdReq.getDeviceId();
        this.p = checkPasswordByUserIdReq.getDeviceId2();
        this.q = checkPasswordByUserIdReq.getDeviceType();
        a(str, checkPasswordByUserIdReq.getSiteId());
    }

    public String e() throws IllegalStateException, IOException, IllegalArgumentException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            XmlSerializer xmlSerializerA = i.a(byteArrayOutputStream);
            xmlSerializerA.startDocument("UTF-8", true);
            xmlSerializerA.startTag(null, "UidVerifyPasswordV3Req");
            i.a(xmlSerializerA, "version", "66300");
            i.a(xmlSerializerA, HwPayConstant.KEY_USER_ID, this.e);
            i.a(xmlSerializerA, "sceneID", this.f);
            i.a(xmlSerializerA, WebDataBaseColumns.EntryColumns.COLUMN_NAME_USERPASS, this.h);
            i.a(xmlSerializerA, "appID", this.g);
            i.a(xmlSerializerA, "supportAlg", "PS256");
            i.a(xmlSerializerA, "reqClientType", "7");
            i.a(xmlSerializerA, "guardianUserID", this.m);
            if (!TextUtils.isEmpty(this.n)) {
                i.a(xmlSerializerA, "languageCode", this.n);
            }
            xmlSerializerA.startTag(null, "deviceInfo");
            i.a(xmlSerializerA, DeviceInfo.TAG_DEVICE_ID, this.o);
            if (!TextUtils.isEmpty(this.p)) {
                i.a(xmlSerializerA, "deviceID2", this.p);
            }
            i.a(xmlSerializerA, "deviceType", this.q);
            i.a(xmlSerializerA, "uuid", this.r);
            i.a(xmlSerializerA, "terminalType", com.huawei.hms.support.hwid.common.a.a.a());
            xmlSerializerA.endTag(null, "deviceInfo");
            xmlSerializerA.endTag(null, "UidVerifyPasswordV3Req");
            xmlSerializerA.endDocument();
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
                e.c("UIDVerifyPasswordV3Request", "GetAuthCodeSendListRequest pack error", true);
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
                    a(xmlPullParserA, name);
                } else if ("errorCode".equals(name)) {
                    this.f16613c = h.a(xmlPullParserA.nextText());
                } else if (HttpRequestBase.TAG_ERROR_DESC.equals(name)) {
                    this.d = xmlPullParserA.nextText();
                }
            }
        }
    }

    private void a(XmlPullParser xmlPullParser, String str) {
        try {
            if (CommonConstant.KEY_ID_TOKEN.equals(str)) {
                this.k = xmlPullParser.nextText();
                return;
            }
            e.a("UIDVerifyPasswordV3Request", "do nothing for node: " + str, false);
        } catch (Throwable th) {
            e.a("UIDVerifyPasswordV3Request", "getSendListReqResult error " + th.getClass().getSimpleName(), true);
        }
    }

    @Override // com.huawei.hms.support.hwid.common.c.a
    public String a() {
        return this.i;
    }

    @Override // com.huawei.hms.support.hwid.common.c.a
    public Bundle b() {
        Bundle bundleB = super.b();
        bundleB.putString(CommonConstant.KEY_ID_TOKEN, this.k);
        return bundleB;
    }

    @Override // com.huawei.hms.support.hwid.common.c.a
    public String a(Context context) {
        return com.huawei.hms.support.hwid.common.e.b.d(context);
    }
}
