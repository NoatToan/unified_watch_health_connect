package org.apache.commons.io.input;

import java.io.IOException;

/* JADX INFO: loaded from: classes23.dex */
public class XmlStreamReaderException extends IOException {
    private static final long serialVersionUID = 1;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public XmlStreamReaderException(String str, String str2, String str3, String str4) {
        this(str, null, null, str2, str3, str4);
    }

    public String getBomEncoding() {
        return this.a;
    }

    public String getContentTypeEncoding() {
        return this.e;
    }

    public String getContentTypeMime() {
        return this.d;
    }

    public String getXmlEncoding() {
        return this.c;
    }

    public String getXmlGuessEncoding() {
        return this.b;
    }

    public XmlStreamReaderException(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str);
        this.d = str2;
        this.e = str3;
        this.a = str4;
        this.b = str5;
        this.c = str6;
    }
}
