package org.apache.commons.io.input;

import fb1.c;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.ByteOrderMark;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class XmlStreamReader extends Reader {
    private static final int BUFFER_SIZE = 8192;
    private static final String HTTP_EX_1 = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL";
    private static final String HTTP_EX_2 = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";
    private static final String HTTP_EX_3 = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME";
    private static final String RAW_EX_1 = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
    private static final String RAW_EX_2 = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";
    private static final String US_ASCII = "US-ASCII";
    private static final String UTF_16 = "UTF-16";
    private static final String UTF_16BE = "UTF-16BE";
    private static final String UTF_16LE = "UTF-16LE";
    private static final String UTF_32 = "UTF-32";
    private static final String UTF_8 = "UTF-8";
    private final String defaultEncoding;
    private final String encoding;
    private final Reader reader;
    private static final ByteOrderMark[] BOMS = {ByteOrderMark.UTF_8, ByteOrderMark.UTF_16BE, ByteOrderMark.UTF_16LE, ByteOrderMark.UTF_32BE, ByteOrderMark.UTF_32LE};
    private static final String UTF_32BE = "UTF-32BE";
    private static final String UTF_32LE = "UTF-32LE";
    private static final String EBCDIC = "CP1047";
    private static final ByteOrderMark[] XML_GUESS_BYTES = {new ByteOrderMark("UTF-8", 60, 63, 120, 109), new ByteOrderMark("UTF-16BE", 0, 60, 0, 63), new ByteOrderMark("UTF-16LE", 60, 0, 63, 0), new ByteOrderMark(UTF_32BE, 0, 0, 0, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109), new ByteOrderMark(UTF_32LE, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109, 0, 0, 0), new ByteOrderMark(EBCDIC, 76, 111, 167, 148)};
    private static final Pattern CHARSET_PATTERN = Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?");
    public static final Pattern ENCODING_PATTERN = Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", 8);

    public XmlStreamReader(URLConnection uRLConnection, String str) {
        Objects.requireNonNull(uRLConnection, "conm");
        this.defaultEncoding = str;
        String contentType = uRLConnection.getContentType();
        BOMInputStream bOMInputStream = new BOMInputStream(new BufferedInputStream(uRLConnection.getInputStream(), 8192), false, BOMS);
        BOMInputStream bOMInputStream2 = new BOMInputStream(bOMInputStream, true, XML_GUESS_BYTES);
        if ((uRLConnection instanceof HttpURLConnection) || contentType != null) {
            this.encoding = processHttpStream(bOMInputStream, bOMInputStream2, contentType, true);
        } else {
            this.encoding = doRawStream(bOMInputStream, bOMInputStream2, true);
        }
        this.reader = new InputStreamReader(bOMInputStream2, this.encoding);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    private String doLenientDetection(String str, XmlStreamReaderException xmlStreamReaderException) {
        XmlStreamReader xmlStreamReader;
        String xmlEncoding;
        String str2;
        if (str == null || !str.startsWith("text/html")) {
            xmlStreamReader = this;
        } else {
            try {
                xmlStreamReader = this;
                try {
                    return xmlStreamReader.calculateHttpEncoding("text/xml".concat(str.substring(9)), xmlStreamReaderException.getBomEncoding(), xmlStreamReaderException.getXmlGuessEncoding(), xmlStreamReaderException.getXmlEncoding(), true);
                } catch (XmlStreamReaderException e4) {
                    e = e4;
                    xmlStreamReaderException = e;
                    xmlEncoding = xmlStreamReaderException.getXmlEncoding();
                    if (xmlEncoding == null) {
                        xmlEncoding = xmlStreamReaderException.getContentTypeEncoding();
                    }
                    if (xmlEncoding == null) {
                        return xmlEncoding;
                    }
                    str2 = xmlStreamReader.defaultEncoding;
                    if (str2 == null) {
                        return "UTF-8";
                    }
                    return str2;
                }
            } catch (XmlStreamReaderException e14) {
                e = e14;
                xmlStreamReader = this;
            }
        }
        xmlEncoding = xmlStreamReaderException.getXmlEncoding();
        if (xmlEncoding == null) {
            xmlEncoding = xmlStreamReaderException.getContentTypeEncoding();
        }
        if (xmlEncoding == null) {
            return xmlEncoding;
        }
        str2 = xmlStreamReader.defaultEncoding;
        if (str2 == null) {
            return "UTF-8";
        }
        return str2;
    }

    private String doRawStream(BOMInputStream bOMInputStream, BOMInputStream bOMInputStream2, boolean z14) throws XmlStreamReaderException {
        String bOMCharsetName = bOMInputStream.getBOMCharsetName();
        String bOMCharsetName2 = bOMInputStream2.getBOMCharsetName();
        try {
            return calculateRawEncoding(bOMCharsetName, bOMCharsetName2, getXmlProlog(bOMInputStream2, bOMCharsetName2));
        } catch (XmlStreamReaderException e4) {
            if (z14) {
                return doLenientDetection(null, e4);
            }
            throw e4;
        }
    }

    public static String getContentTypeEncoding(String str) {
        int iIndexOf;
        if (str != null && (iIndexOf = str.indexOf(";")) > -1) {
            Matcher matcher = CHARSET_PATTERN.matcher(str.substring(iIndexOf + 1));
            String strGroup = matcher.find() ? matcher.group(1) : null;
            if (strGroup != null) {
                return strGroup.toUpperCase(Locale.ROOT);
            }
        }
        return null;
    }

    public static String getContentTypeMime(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(";");
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        return str.trim();
    }

    private static String getXmlProlog(InputStream inputStream, String str) throws IOException {
        if (str == null) {
            return null;
        }
        byte[] bArr = new byte[8192];
        inputStream.mark(8192);
        int i14 = inputStream.read(bArr, 0, 8192);
        String str2 = "";
        int i15 = 8192;
        int i16 = 0;
        int iIndexOf = -1;
        while (i14 != -1 && iIndexOf == -1 && i16 < 8192) {
            i16 += i14;
            i15 -= i14;
            i14 = inputStream.read(bArr, i16, i15);
            str2 = new String(bArr, 0, i16, str);
            iIndexOf = str2.indexOf(62);
        }
        if (iIndexOf == -1) {
            if (i14 == -1) {
                h.C("Unexpected end of XML stream");
                return null;
            }
            h.C(e0.f(i16, "XML prolog or ROOT element not found on first ", " bytes"));
            return null;
        }
        if (i16 <= 0) {
            return null;
        }
        inputStream.reset();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str2.substring(0, iIndexOf + 1)));
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            stringBuffer.append(line);
        }
        Matcher matcher = ENCODING_PATTERN.matcher(stringBuffer);
        if (matcher.find()) {
            return c.m(1, 1, matcher.group(1).toUpperCase(Locale.ROOT));
        }
        return null;
    }

    public static boolean isAppXml(String str) {
        if (str == null) {
            return false;
        }
        if (str.equals("application/xml") || str.equals("application/xml-dtd") || str.equals("application/xml-external-parsed-entity")) {
            return true;
        }
        return str.startsWith("application/") && str.endsWith("+xml");
    }

    public static boolean isTextXml(String str) {
        if (str == null) {
            return false;
        }
        if (str.equals("text/xml") || str.equals("text/xml-external-parsed-entity")) {
            return true;
        }
        return str.startsWith("text/") && str.endsWith("+xml");
    }

    private String processHttpStream(BOMInputStream bOMInputStream, BOMInputStream bOMInputStream2, String str, boolean z14) throws XmlStreamReaderException {
        String bOMCharsetName = bOMInputStream.getBOMCharsetName();
        String bOMCharsetName2 = bOMInputStream2.getBOMCharsetName();
        try {
            return calculateHttpEncoding(str, bOMCharsetName, bOMCharsetName2, getXmlProlog(bOMInputStream2, bOMCharsetName2), z14);
        } catch (XmlStreamReaderException e4) {
            if (z14) {
                return doLenientDetection(str, e4);
            }
            throw e4;
        }
    }

    public String calculateHttpEncoding(String str, String str2, String str3, String str4, boolean z14) throws XmlStreamReaderException {
        if (z14 && str4 != null) {
            return str4;
        }
        String contentTypeMime = getContentTypeMime(str);
        String contentTypeEncoding = getContentTypeEncoding(str);
        boolean zIsAppXml = isAppXml(contentTypeMime);
        boolean zIsTextXml = isTextXml(contentTypeMime);
        if (!zIsAppXml && !zIsTextXml) {
            throw new XmlStreamReaderException(MessageFormat.format(HTTP_EX_3, contentTypeMime, contentTypeEncoding, str2, str3, str4), contentTypeMime, contentTypeEncoding, str2, str3, str4);
        }
        if (contentTypeEncoding == null) {
            if (zIsAppXml) {
                return calculateRawEncoding(str2, str3, str4);
            }
            String str5 = this.defaultEncoding;
            return str5 == null ? "US-ASCII" : str5;
        }
        if (contentTypeEncoding.equals("UTF-16BE") || contentTypeEncoding.equals("UTF-16LE")) {
            if (str2 != null) {
                throw new XmlStreamReaderException(MessageFormat.format(HTTP_EX_1, contentTypeMime, contentTypeEncoding, str2, str3, str4), contentTypeMime, contentTypeEncoding, str2, str3, str4);
            }
        } else {
            if (contentTypeEncoding.equals("UTF-16")) {
                if (str2 == null || !str2.startsWith("UTF-16")) {
                    throw new XmlStreamReaderException(MessageFormat.format(HTTP_EX_2, contentTypeMime, contentTypeEncoding, str2, str3, str4), contentTypeMime, contentTypeEncoding, str2, str3, str4);
                }
                return str2;
            }
            if (contentTypeEncoding.equals(UTF_32BE) || contentTypeEncoding.equals(UTF_32LE)) {
                if (str2 != null) {
                    throw new XmlStreamReaderException(MessageFormat.format(HTTP_EX_1, contentTypeMime, contentTypeEncoding, str2, str3, str4), contentTypeMime, contentTypeEncoding, str2, str3, str4);
                }
            } else if (contentTypeEncoding.equals(UTF_32)) {
                if (str2 == null || !str2.startsWith(UTF_32)) {
                    throw new XmlStreamReaderException(MessageFormat.format(HTTP_EX_2, contentTypeMime, contentTypeEncoding, str2, str3, str4), contentTypeMime, contentTypeEncoding, str2, str3, str4);
                }
                return str2;
            }
        }
        return contentTypeEncoding;
    }

    public String calculateRawEncoding(String str, String str2, String str3) throws XmlStreamReaderException {
        if (str == null) {
            if (str2 != null && str3 != null) {
                return (str3.equals("UTF-16") && (str2.equals("UTF-16BE") || str2.equals("UTF-16LE"))) ? str2 : str3;
            }
            String str4 = this.defaultEncoding;
            return str4 == null ? "UTF-8" : str4;
        }
        if (str.equals("UTF-8")) {
            if (str2 != null && !str2.equals("UTF-8")) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
            if (str3 != null && !str3.equals("UTF-8")) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
        } else if (str.equals("UTF-16BE") || str.equals("UTF-16LE")) {
            if (str2 != null && !str2.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
            if (str3 != null && !str3.equals("UTF-16") && !str3.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
        } else {
            if (!str.equals(UTF_32BE) && !str.equals(UTF_32LE)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_2, str, str2, str3), str, str2, str3);
            }
            if (str2 != null && !str2.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
            if (str3 != null && !str3.equals(UTF_32) && !str3.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
        }
        return str;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.reader.close();
    }

    public String getDefaultEncoding() {
        return this.defaultEncoding;
    }

    public String getEncoding() {
        return this.encoding;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i14, int i15) {
        return this.reader.read(cArr, i14, i15);
    }

    public XmlStreamReader(InputStream inputStream) {
        this(inputStream, true);
    }

    public XmlStreamReader(InputStream inputStream, boolean z14) {
        this(inputStream, z14, (String) null);
    }

    public XmlStreamReader(InputStream inputStream, boolean z14, String str) throws XmlStreamReaderException {
        Objects.requireNonNull(inputStream, "inputStream");
        this.defaultEncoding = str;
        BOMInputStream bOMInputStream = new BOMInputStream(new BufferedInputStream(inputStream, 8192), false, BOMS);
        BOMInputStream bOMInputStream2 = new BOMInputStream(bOMInputStream, true, XML_GUESS_BYTES);
        String strDoRawStream = doRawStream(bOMInputStream, bOMInputStream2, z14);
        this.encoding = strDoRawStream;
        this.reader = new InputStreamReader(bOMInputStream2, strDoRawStream);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public XmlStreamReader(URL url) {
        this(url.openConnection(), (String) null);
        Objects.requireNonNull(url, "url");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public XmlStreamReader(File file) {
        this(new FileInputStream(file));
        Objects.requireNonNull(file);
    }

    public XmlStreamReader(InputStream inputStream, String str) {
        this(inputStream, str, true);
    }

    public XmlStreamReader(InputStream inputStream, String str, boolean z14, String str2) throws XmlStreamReaderException {
        Objects.requireNonNull(inputStream, "inputStream");
        this.defaultEncoding = str2;
        BOMInputStream bOMInputStream = new BOMInputStream(new BufferedInputStream(inputStream, 8192), false, BOMS);
        BOMInputStream bOMInputStream2 = new BOMInputStream(bOMInputStream, true, XML_GUESS_BYTES);
        String strProcessHttpStream = processHttpStream(bOMInputStream, bOMInputStream2, str, z14);
        this.encoding = strProcessHttpStream;
        this.reader = new InputStreamReader(bOMInputStream2, strProcessHttpStream);
    }

    public XmlStreamReader(InputStream inputStream, String str, boolean z14) {
        this(inputStream, str, z14, null);
    }
}
