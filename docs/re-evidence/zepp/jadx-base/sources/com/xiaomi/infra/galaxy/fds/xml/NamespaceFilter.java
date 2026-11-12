package com.xiaomi.infra.galaxy.fds.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

/* JADX INFO: loaded from: classes22.dex */
public class NamespaceFilter extends XMLFilterImpl {
    private static final String a = "http://s3.amazonaws.com/doc/2006-03-01/";

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        super.endElement(a, str2, str3);
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        super.startElement(a, str2, str3, attributes);
    }
}
