package com.xiaomi.push;

import android.text.TextUtils;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.view.basetitle.IdGetter;
import com.xiaomi.push.service.bh;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import org.cybergarage.soap.SOAP;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes22.dex */
public class cr {
    private static XmlPullParser a;

    public static cg a(String str, String str2, XmlPullParser xmlPullParser) {
        Object objA = cq.a().a("all", "xm:chat");
        if (objA == null || !(objA instanceof com.xiaomi.push.service.k)) {
            return null;
        }
        return ((com.xiaomi.push.service.k) objA).b(xmlPullParser);
    }

    public static ch a(XmlPullParser xmlPullParser, bt btVar) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue("", "id");
        String attributeValue2 = xmlPullParser.getAttributeValue("", "to");
        String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
        String attributeValue4 = xmlPullParser.getAttributeValue("", "chid");
        ch.a aVarA = ch.a.a(xmlPullParser.getAttributeValue("", "type"));
        HashMap map = new HashMap();
        boolean z = false;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            map.put(attributeName, xmlPullParser.getAttributeValue("", attributeName));
        }
        ch m0Var = null;
        cn cnVarM3648a = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("error")) {
                    cnVarM3648a = m3648a(xmlPullParser);
                } else {
                    m0Var = new ch();
                    m0Var.a(a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("iq")) {
                z = true;
            }
        }
        if (m0Var == null) {
            if (ch.a.a == aVarA || ch.a.b == aVarA) {
                l0 l0Var = new l0();
                l0Var.k(attributeValue);
                l0Var.m(attributeValue3);
                l0Var.n(attributeValue2);
                l0Var.a(ch.a.d);
                l0Var.l(attributeValue4);
                l0Var.a(new cn(cn.a.e));
                btVar.a(l0Var);
                com.xiaomi.channel.commonutils.logger.b.d("iq usage error. send packet in packet parser.");
                return null;
            }
            m0Var = new m0();
        }
        m0Var.k(attributeValue);
        m0Var.m(attributeValue2);
        m0Var.l(attributeValue4);
        m0Var.n(attributeValue3);
        m0Var.a(aVarA);
        m0Var.a(cnVarM3648a);
        m0Var.a(map);
        return m0Var;
    }

    public static cj a(XmlPullParser xmlPullParser) throws XmlPullParserException, cd, IOException {
        String attributeValue;
        boolean z = false;
        String strNextText = null;
        if ("1".equals(xmlPullParser.getAttributeValue("", SOAP.XMLNS))) {
            String attributeValue2 = xmlPullParser.getAttributeValue("", "chid");
            String attributeValue3 = xmlPullParser.getAttributeValue("", "id");
            String attributeValue4 = xmlPullParser.getAttributeValue("", "from");
            String attributeValue5 = xmlPullParser.getAttributeValue("", "to");
            String attributeValue6 = xmlPullParser.getAttributeValue("", "type");
            com.xiaomi.push.service.az.b bVarA = com.xiaomi.push.service.az.a().a(attributeValue2, attributeValue5);
            if (bVarA == null) {
                bVarA = com.xiaomi.push.service.az.a().a(attributeValue2, attributeValue4);
            }
            if (bVarA == null) {
                throw new cd("the channel id is wrong while receiving a encrypted message");
            }
            cj cjVarA = null;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (!SOAP.XMLNS.equals(xmlPullParser.getName())) {
                        throw new cd("error while receiving a encrypted message with wrong format");
                    }
                    if (xmlPullParser.next() != 4) {
                        throw new cd("error while receiving a encrypted message with wrong format");
                    }
                    String text = xmlPullParser.getText();
                    if ("5".equals(attributeValue2) || "6".equals(attributeValue2)) {
                        ci ciVar = new ci();
                        ciVar.l(attributeValue2);
                        ciVar.b(true);
                        ciVar.n(attributeValue4);
                        ciVar.m(attributeValue5);
                        ciVar.k(attributeValue3);
                        ciVar.f(attributeValue6);
                        cg cgVar = new cg(SOAP.XMLNS, null, null, null);
                        cgVar.m3637a(text);
                        ciVar.a(cgVar);
                        return ciVar;
                    }
                    c(bh.a(bh.a(bVarA.h, attributeValue3), text));
                    a.next();
                    cjVarA = a(a);
                } else if (next == 3 && xmlPullParser.getName().equals("message")) {
                    z = true;
                }
            }
            if (cjVarA != null) {
                return cjVarA;
            }
            throw new cd("error while receiving a encrypted message with wrong format");
        }
        ci ciVar2 = new ci();
        String attributeValue7 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue7 == null) {
            attributeValue7 = "ID_NOT_AVAILABLE";
        }
        ciVar2.k(attributeValue7);
        ciVar2.m(xmlPullParser.getAttributeValue("", "to"));
        ciVar2.n(xmlPullParser.getAttributeValue("", "from"));
        ciVar2.l(xmlPullParser.getAttributeValue("", "chid"));
        ciVar2.a(xmlPullParser.getAttributeValue("", "appid"));
        try {
            attributeValue = xmlPullParser.getAttributeValue("", FacebookRequestErrorClassification.KEY_TRANSIENT);
        } catch (Exception unused) {
            attributeValue = null;
        }
        try {
            String attributeValue8 = xmlPullParser.getAttributeValue("", "seq");
            if (!TextUtils.isEmpty(attributeValue8)) {
                ciVar2.b(attributeValue8);
            }
        } catch (Exception unused2) {
        }
        try {
            String attributeValue9 = xmlPullParser.getAttributeValue("", "mseq");
            if (!TextUtils.isEmpty(attributeValue9)) {
                ciVar2.c(attributeValue9);
            }
        } catch (Exception unused3) {
        }
        try {
            String attributeValue10 = xmlPullParser.getAttributeValue("", "fseq");
            if (!TextUtils.isEmpty(attributeValue10)) {
                ciVar2.d(attributeValue10);
            }
        } catch (Exception unused4) {
        }
        try {
            String attributeValue11 = xmlPullParser.getAttributeValue("", "status");
            if (!TextUtils.isEmpty(attributeValue11)) {
                ciVar2.e(attributeValue11);
            }
        } catch (Exception unused5) {
        }
        ciVar2.a(!TextUtils.isEmpty(attributeValue) && attributeValue.equalsIgnoreCase("true"));
        ciVar2.f(xmlPullParser.getAttributeValue("", "type"));
        String strD = d(xmlPullParser);
        if (strD == null || "".equals(strD.trim())) {
            cj.q();
        } else {
            ciVar2.j(strD);
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
                    d(xmlPullParser);
                    ciVar2.g(b(xmlPullParser));
                } else if (name.equals("body")) {
                    String attributeValue12 = xmlPullParser.getAttributeValue("", "encode");
                    String strB = b(xmlPullParser);
                    if (TextUtils.isEmpty(attributeValue12)) {
                        ciVar2.h(strB);
                    } else {
                        ciVar2.a(strB, attributeValue12);
                    }
                } else if (name.equals("thread")) {
                    if (strNextText == null) {
                        strNextText = xmlPullParser.nextText();
                    }
                } else if (name.equals("error")) {
                    ciVar2.a(m3648a(xmlPullParser));
                } else {
                    ciVar2.a(a(name, namespace, xmlPullParser));
                }
            } else if (next2 == 3 && xmlPullParser.getName().equals("message")) {
                z = true;
            }
        }
        ciVar2.i(strNextText);
        return ciVar2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static cl m3646a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        cl.b bVarValueOf = cl.b.available;
        String attributeValue = xmlPullParser.getAttributeValue("", "type");
        if (attributeValue != null && !attributeValue.equals("")) {
            try {
                bVarValueOf = cl.b.valueOf(attributeValue);
            } catch (IllegalArgumentException unused) {
                System.err.println("Found invalid presence type " + attributeValue);
            }
        }
        cl clVar = new cl(bVarValueOf);
        clVar.m(xmlPullParser.getAttributeValue("", "to"));
        clVar.n(xmlPullParser.getAttributeValue("", "from"));
        clVar.l(xmlPullParser.getAttributeValue("", "chid"));
        String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue2 == null) {
            attributeValue2 = "ID_NOT_AVAILABLE";
        }
        clVar.k(attributeValue2);
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("status")) {
                    clVar.a(xmlPullParser.nextText());
                } else if (name.equals("priority")) {
                    try {
                        clVar.a(Integer.parseInt(xmlPullParser.nextText()));
                    } catch (NumberFormatException unused2) {
                    } catch (IllegalArgumentException unused3) {
                        clVar.a(0);
                    }
                } else if (name.equals("show")) {
                    String strNextText = xmlPullParser.nextText();
                    try {
                        clVar.a(cl.a.valueOf(strNextText));
                    } catch (IllegalArgumentException unused4) {
                        System.err.println("Found invalid presence mode " + strNextText);
                    }
                } else if (name.equals("error")) {
                    clVar.a(m3648a(xmlPullParser));
                } else {
                    clVar.a(a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("presence")) {
                z = true;
            }
        }
        return clVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static cm m3647a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        cm cmVar = null;
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                cmVar = new cm(xmlPullParser.getName());
            } else if (next == 3 && xmlPullParser.getName().equals("error")) {
                z = true;
            }
        }
        return cmVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static cn m3648a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        String attributeValue = EcgData.DEFAULT_DIGIT_VALUE;
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
                        arrayList.add(a(name, namespace, xmlPullParser));
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
        return new cn(Integer.parseInt(attributeValue), attributeValue3 == null ? com.twitter.sdk.android.tweetcomposer.g.g : attributeValue3, attributeValue2, str, strNextText, arrayList);
    }

    private static String b(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        String str = "";
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getDepth() == depth) {
                return str;
            }
            str = str + xmlPullParser.getText();
        }
    }

    private static void c(byte[] bArr) throws XmlPullParserException {
        if (a == null) {
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }
        }
        a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
    }

    private static String d(XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            if ("xml:lang".equals(attributeName) || ("lang".equals(attributeName) && IdGetter.xml.equals(xmlPullParser.getAttributePrefix(i)))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
