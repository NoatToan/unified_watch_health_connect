package com.xiaomi.push;

import android.text.TextUtils;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.push.service.bg;
import com.xiaomi.smarthome.framework.api.UserConfig;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.c7t;
import defpackage.dys;
import defpackage.fys;
import defpackage.gws;
import defpackage.lys;
import defpackage.qys;
import defpackage.rcs;
import defpackage.sys;
import defpackage.tys;
import defpackage.vxs;
import defpackage.x9s;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes11.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static XmlPullParser f14055a;

    public static e a(XmlPullParser xmlPullParser, gws gwsVar) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue("", "id");
        String attributeValue2 = xmlPullParser.getAttributeValue("", "to");
        String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
        String attributeValue4 = xmlPullParser.getAttributeValue("", "chid");
        e.a aVarA = e.a.a(xmlPullParser.getAttributeValue("", "type"));
        HashMap map = new HashMap();
        boolean z = false;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            map.put(attributeName, xmlPullParser.getAttributeValue("", attributeName));
        }
        e tysVar = null;
        f fVarC = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("error")) {
                    fVarC = c(xmlPullParser);
                } else {
                    tysVar = new e();
                    tysVar.i(d(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("iq")) {
                z = true;
            }
        }
        if (tysVar == null) {
            if (e.a.f14035b == aVarA || e.a.c == aVarA) {
                sys sysVar = new sys();
                sysVar.n(attributeValue);
                sysVar.r(attributeValue3);
                sysVar.t(attributeValue2);
                sysVar.z(e.a.e);
                sysVar.p(attributeValue4);
                sysVar.h(new f(f.a.f));
                gwsVar.m(sysVar);
                x9s.D("iq usage error. send packet in packet parser.");
                return null;
            }
            tysVar = new tys();
        }
        tysVar.n(attributeValue);
        tysVar.r(attributeValue2);
        tysVar.p(attributeValue4);
        tysVar.t(attributeValue3);
        tysVar.z(aVarA);
        tysVar.h(fVarC);
        tysVar.A(map);
        return tysVar;
    }

    public static hi b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        hi.b bVarValueOf = hi.b.available;
        String attributeValue = xmlPullParser.getAttributeValue("", "type");
        if (attributeValue != null && !attributeValue.equals("")) {
            try {
                bVarValueOf = hi.b.valueOf(attributeValue);
            } catch (IllegalArgumentException unused) {
                System.err.println("Found invalid presence type " + attributeValue);
            }
        }
        hi hiVar = new hi(bVarValueOf);
        hiVar.r(xmlPullParser.getAttributeValue("", "to"));
        hiVar.t(xmlPullParser.getAttributeValue("", "from"));
        hiVar.p(xmlPullParser.getAttributeValue("", "chid"));
        String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue2 == null) {
            attributeValue2 = "ID_NOT_AVAILABLE";
        }
        hiVar.n(attributeValue2);
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("status")) {
                    hiVar.B(xmlPullParser.nextText());
                } else if (name.equals("priority")) {
                    try {
                        hiVar.y(Integer.parseInt(xmlPullParser.nextText()));
                    } catch (NumberFormatException unused2) {
                    } catch (IllegalArgumentException unused3) {
                        hiVar.y(0);
                    }
                } else if (name.equals("show")) {
                    String strNextText = xmlPullParser.nextText();
                    try {
                        hiVar.z(hi.a.valueOf(strNextText));
                    } catch (IllegalArgumentException unused4) {
                        System.err.println("Found invalid presence mode " + strNextText);
                    }
                } else if (name.equals("error")) {
                    hiVar.h(c(xmlPullParser));
                } else {
                    hiVar.i(d(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("presence")) {
                z = true;
            }
        }
        return hiVar;
    }

    public static f c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        String attributeValue = "-1";
        boolean z = false;
        String attributeValue2 = null;
        String attributeValue3 = null;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals("code")) {
                attributeValue = xmlPullParser.getAttributeValue("", "code");
            }
            if (xmlPullParser.getAttributeName(i).equals("type")) {
                attributeValue3 = xmlPullParser.getAttributeValue("", "type");
            }
            if (xmlPullParser.getAttributeName(i).equals("reason")) {
                attributeValue2 = xmlPullParser.getAttributeValue("", "reason");
            }
        }
        String str = null;
        String strNextText = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("text")) {
                    strNextText = xmlPullParser.nextText();
                } else {
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    if ("urn:ietf:params:xml:ns:xmpp-stanzas".equals(namespace)) {
                        str = name;
                    } else {
                        arrayList.add(d(name, namespace, xmlPullParser));
                    }
                }
            } else if (next == 3) {
                if (xmlPullParser.getName().equals("error")) {
                    z = true;
                }
            } else if (next == 4) {
                strNextText = xmlPullParser.getText();
            }
        }
        return new f(Integer.parseInt(attributeValue), attributeValue3 == null ? BroadcastsKt.SILENT_PUSHING_CANCEL : attributeValue3, attributeValue2, str, strNextText, arrayList);
    }

    public static vxs d(String str, String str2, XmlPullParser xmlPullParser) {
        Object objB = qys.a().b("all", "xm:chat");
        if (objB == null || !(objB instanceof c7t)) {
            return null;
        }
        return ((c7t) objB).c(xmlPullParser);
    }

    public static fys e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ha {
        String attributeValue;
        boolean z = false;
        String strNextText = null;
        if ("1".equals(xmlPullParser.getAttributeValue("", "s"))) {
            String attributeValue2 = xmlPullParser.getAttributeValue("", "chid");
            String attributeValue3 = xmlPullParser.getAttributeValue("", "id");
            String attributeValue4 = xmlPullParser.getAttributeValue("", "from");
            String attributeValue5 = xmlPullParser.getAttributeValue("", "to");
            String attributeValue6 = xmlPullParser.getAttributeValue("", "type");
            bg.b bVarB = bg.c().b(attributeValue2, attributeValue5);
            if (bVarB == null) {
                bVarB = bg.c().b(attributeValue2, attributeValue4);
            }
            if (bVarB == null) {
                throw new ha("the channel id is wrong while receiving a encrypted message");
            }
            fys fysVarE = null;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (!"s".equals(xmlPullParser.getName())) {
                        throw new ha("error while receiving a encrypted message with wrong format");
                    }
                    if (xmlPullParser.next() != 4) {
                        throw new ha("error while receiving a encrypted message with wrong format");
                    }
                    String text = xmlPullParser.getText();
                    if (UserConfig.KEY_DEVICE_LITE_SORT_GROUP.equals(attributeValue2) || "6".equals(attributeValue2)) {
                        dys dysVar = new dys();
                        dysVar.p(attributeValue2);
                        dysVar.D(true);
                        dysVar.t(attributeValue4);
                        dysVar.r(attributeValue5);
                        dysVar.n(attributeValue3);
                        dysVar.L(attributeValue6);
                        vxs vxsVar = new vxs("s", null, null, null);
                        vxsVar.g(text);
                        dysVar.i(vxsVar);
                        return dysVar;
                    }
                    h(rcs.h(rcs.g(bVarB.i, attributeValue3), text));
                    f14055a.next();
                    fysVarE = e(f14055a);
                } else if (next == 3 && xmlPullParser.getName().equals("message")) {
                    z = true;
                }
            }
            if (fysVarE != null) {
                return fysVarE;
            }
            throw new ha("error while receiving a encrypted message with wrong format");
        }
        dys dysVar2 = new dys();
        String attributeValue7 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue7 == null) {
            attributeValue7 = "ID_NOT_AVAILABLE";
        }
        dysVar2.n(attributeValue7);
        dysVar2.r(xmlPullParser.getAttributeValue("", "to"));
        dysVar2.t(xmlPullParser.getAttributeValue("", "from"));
        dysVar2.p(xmlPullParser.getAttributeValue("", "chid"));
        dysVar2.y(xmlPullParser.getAttributeValue("", "appid"));
        try {
            attributeValue = xmlPullParser.getAttributeValue("", "transient");
        } catch (Exception unused) {
            attributeValue = null;
        }
        try {
            String attributeValue8 = xmlPullParser.getAttributeValue("", "seq");
            if (!TextUtils.isEmpty(attributeValue8)) {
                dysVar2.C(attributeValue8);
            }
        } catch (Exception unused2) {
        }
        try {
            String attributeValue9 = xmlPullParser.getAttributeValue("", "mseq");
            if (!TextUtils.isEmpty(attributeValue9)) {
                dysVar2.F(attributeValue9);
            }
        } catch (Exception unused3) {
        }
        try {
            String attributeValue10 = xmlPullParser.getAttributeValue("", "fseq");
            if (!TextUtils.isEmpty(attributeValue10)) {
                dysVar2.H(attributeValue10);
            }
        } catch (Exception unused4) {
        }
        try {
            String attributeValue11 = xmlPullParser.getAttributeValue("", "status");
            if (!TextUtils.isEmpty(attributeValue11)) {
                dysVar2.J(attributeValue11);
            }
        } catch (Exception unused5) {
        }
        dysVar2.A(!TextUtils.isEmpty(attributeValue) && attributeValue.equalsIgnoreCase("true"));
        dysVar2.L(xmlPullParser.getAttributeValue("", "type"));
        String strI = i(xmlPullParser);
        if (strI == null || "".equals(strI.trim())) {
            fys.x();
        } else {
            dysVar2.R(strI);
        }
        while (!z) {
            int next2 = xmlPullParser.next();
            if (next2 == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (TextUtils.isEmpty(namespace)) {
                    namespace = "xm";
                }
                if (name.equals("subject")) {
                    i(xmlPullParser);
                    dysVar2.N(g(xmlPullParser));
                } else if (name.equals("body")) {
                    String attributeValue12 = xmlPullParser.getAttributeValue("", "encode");
                    String strG = g(xmlPullParser);
                    if (TextUtils.isEmpty(attributeValue12)) {
                        dysVar2.P(strG);
                    } else {
                        dysVar2.z(strG, attributeValue12);
                    }
                } else if (name.equals("thread")) {
                    if (strNextText == null) {
                        strNextText = xmlPullParser.nextText();
                    }
                } else if (name.equals("error")) {
                    dysVar2.h(c(xmlPullParser));
                } else {
                    dysVar2.i(d(name, namespace, xmlPullParser));
                }
            } else if (next2 == 3 && xmlPullParser.getName().equals("message")) {
                z = true;
            }
        }
        dysVar2.Q(strNextText);
        return dysVar2;
    }

    public static lys f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        lys lysVar = null;
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                lysVar = new lys(xmlPullParser.getName());
            } else if (next == 3 && xmlPullParser.getName().equals("error")) {
                z = true;
            }
        }
        return lysVar;
    }

    public static String g(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        String str = "";
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getDepth() == depth) {
                return str;
            }
            str = str + xmlPullParser.getText();
        }
    }

    public static void h(byte[] bArr) throws XmlPullParserException {
        if (f14055a == null) {
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                f14055a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }
        }
        f14055a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
    }

    public static String i(XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            if ("xml:lang".equals(attributeName) || (TSMAuthContants.PARAM_LANGUAGE.equals(attributeName) && "xml".equals(xmlPullParser.getAttributePrefix(i)))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
