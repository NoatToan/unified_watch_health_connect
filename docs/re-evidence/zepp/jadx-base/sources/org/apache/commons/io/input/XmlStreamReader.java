package org.apache.commons.io.input;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huami.network.base.model.HMContentType;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.ByteOrderMark;

/* JADX INFO: loaded from: classes23.dex */
public class XmlStreamReader extends Reader {
    private static final int d = 4096;
    private static final String e = "UTF-8";
    private static final String f = "US-ASCII";
    private static final String g = "UTF-16BE";
    private static final String h = "UTF-16LE";
    private static final String k = "UTF-16";
    private static final String l = "UTF-32";
    private static final String q = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
    private static final String r = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";
    private static final String s = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL";
    private static final String t = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";
    private static final String u = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME";
    private final Reader a;
    private final String b;
    private final String c;
    private static final ByteOrderMark[] n = {ByteOrderMark.UTF_8, ByteOrderMark.UTF_16BE, ByteOrderMark.UTF_16LE, ByteOrderMark.UTF_32BE, ByteOrderMark.UTF_32LE};
    private static final String i = "UTF-32BE";
    private static final String j = "UTF-32LE";
    private static final String m = "CP1047";
    private static final ByteOrderMark[] o = {new ByteOrderMark("UTF-8", 60, 63, 120, 109), new ByteOrderMark("UTF-16BE", 0, 60, 0, 63), new ByteOrderMark("UTF-16LE", 60, 0, 63, 0), new ByteOrderMark(i, 0, 0, 0, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109), new ByteOrderMark(j, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109, 0, 0, 0), new ByteOrderMark(m, 76, 111, 167, 148)};
    private static final Pattern p = Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?");
    public static final Pattern ENCODING_PATTERN = Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", 8);

    public XmlStreamReader(File file) throws IOException {
        this(new FileInputStream(file));
    }

    private String c(BOMInputStream bOMInputStream, BOMInputStream bOMInputStream2, String str, boolean z) throws IOException {
        String bOMCharsetName = bOMInputStream.getBOMCharsetName();
        String bOMCharsetName2 = bOMInputStream2.getBOMCharsetName();
        try {
            return a(str, bOMCharsetName, bOMCharsetName2, h(bOMInputStream2, bOMCharsetName2), z);
        } catch (XmlStreamReaderException e2) {
            if (z) {
                return d(str, e2);
            }
            throw e2;
        }
    }

    private String d(String str, XmlStreamReaderException xmlStreamReaderException) throws IOException {
        if (str != null && str.startsWith("text/html")) {
            try {
                return a(HMContentType.CONTENT_TYPE_TEXT_XML + str.substring(9), xmlStreamReaderException.getBomEncoding(), xmlStreamReaderException.getXmlGuessEncoding(), xmlStreamReaderException.getXmlEncoding(), true);
            } catch (XmlStreamReaderException e2) {
                xmlStreamReaderException = e2;
            }
        }
        String xmlEncoding = xmlStreamReaderException.getXmlEncoding();
        if (xmlEncoding == null) {
            xmlEncoding = xmlStreamReaderException.getContentTypeEncoding();
        }
        if (xmlEncoding != null) {
            return xmlEncoding;
        }
        String str2 = this.c;
        return str2 == null ? "UTF-8" : str2;
    }

    private String e(BOMInputStream bOMInputStream, BOMInputStream bOMInputStream2, boolean z) throws IOException {
        String bOMCharsetName = bOMInputStream.getBOMCharsetName();
        String bOMCharsetName2 = bOMInputStream2.getBOMCharsetName();
        try {
            return b(bOMCharsetName, bOMCharsetName2, h(bOMInputStream2, bOMCharsetName2));
        } catch (XmlStreamReaderException e2) {
            if (z) {
                return d(null, e2);
            }
            throw e2;
        }
    }

    public static String f(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(";")) <= -1) {
            return null;
        }
        Matcher matcher = p.matcher(str.substring(iIndexOf + 1));
        String strGroup = matcher.find() ? matcher.group(1) : null;
        if (strGroup != null) {
            return strGroup.toUpperCase(Locale.US);
        }
        return null;
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(";");
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        return str.trim();
    }

    private static String h(InputStream inputStream, String str) throws IOException {
        if (str != null) {
            byte[] bArr = new byte[4096];
            inputStream.mark(4096);
            int i2 = inputStream.read(bArr, 0, 4096);
            String str2 = "";
            int iIndexOf = -1;
            int i3 = 0;
            int i4 = 4096;
            while (i2 != -1 && iIndexOf == -1 && i3 < 4096) {
                i3 += i2;
                i4 -= i2;
                i2 = inputStream.read(bArr, i3, i4);
                str2 = new String(bArr, 0, i3, str);
                iIndexOf = str2.indexOf(62);
            }
            if (iIndexOf == -1) {
                if (i2 == -1) {
                    throw new IOException("Unexpected end of XML stream");
                }
                throw new IOException("XML prolog or ROOT element not found on first " + i3 + " bytes");
            }
            if (i3 > 0) {
                inputStream.reset();
                BufferedReader bufferedReader = new BufferedReader(new StringReader(str2.substring(0, iIndexOf + 1)));
                StringBuffer stringBuffer = new StringBuffer();
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    stringBuffer.append(line);
                }
                Matcher matcher = ENCODING_PATTERN.matcher(stringBuffer);
                if (matcher.find()) {
                    String upperCase = matcher.group(1).toUpperCase();
                    return upperCase.substring(1, upperCase.length() - 1);
                }
            }
        }
        return null;
    }

    public static boolean i(String str) {
        return str != null && (str.equals(HMContentType.CONTENT_TYPE_APPLICATION_XML) || str.equals("application/xml-dtd") || str.equals("application/xml-external-parsed-entity") || (str.startsWith("application/") && str.endsWith("+xml")));
    }

    public static boolean j(String str) {
        return str != null && (str.equals(HMContentType.CONTENT_TYPE_TEXT_XML) || str.equals("text/xml-external-parsed-entity") || (str.startsWith("text/") && str.endsWith("+xml")));
    }

    public String a(String str, String str2, String str3, String str4, boolean z) throws IOException {
        if (z && str4 != null) {
            return str4;
        }
        String strG = g(str);
        String strF = f(str);
        boolean zI = i(strG);
        boolean zJ = j(strG);
        if (!zI && !zJ) {
            throw new XmlStreamReaderException(MessageFormat.format(u, strG, strF, str2, str3, str4), strG, strF, str2, str3, str4);
        }
        if (strF == null) {
            if (zI) {
                return b(str2, str3, str4);
            }
            String str5 = this.c;
            return str5 == null ? "US-ASCII" : str5;
        }
        if (strF.equals("UTF-16BE") || strF.equals("UTF-16LE")) {
            if (str2 == null) {
                return strF;
            }
            throw new XmlStreamReaderException(MessageFormat.format(s, strG, strF, str2, str3, str4), strG, strF, str2, str3, str4);
        }
        if (strF.equals("UTF-16")) {
            if (str2 == null || !str2.startsWith("UTF-16")) {
                throw new XmlStreamReaderException(MessageFormat.format(t, strG, strF, str2, str3, str4), strG, strF, str2, str3, str4);
            }
            return str2;
        }
        if (strF.equals(i) || strF.equals(j)) {
            if (str2 == null) {
                return strF;
            }
            throw new XmlStreamReaderException(MessageFormat.format(s, strG, strF, str2, str3, str4), strG, strF, str2, str3, str4);
        }
        if (!strF.equals(l)) {
            return strF;
        }
        if (str2 == null || !str2.startsWith(l)) {
            throw new XmlStreamReaderException(MessageFormat.format(t, strG, strF, str2, str3, str4), strG, strF, str2, str3, str4);
        }
        return str2;
    }

    public String b(String str, String str2, String str3) throws IOException {
        if (str == null) {
            if (str2 != null && str3 != null) {
                return (str3.equals("UTF-16") && (str2.equals("UTF-16BE") || str2.equals("UTF-16LE"))) ? str2 : str3;
            }
            String str4 = this.c;
            return str4 == null ? "UTF-8" : str4;
        }
        if (str.equals("UTF-8")) {
            if (str2 != null && !str2.equals("UTF-8")) {
                throw new XmlStreamReaderException(MessageFormat.format(q, str, str2, str3), str, str2, str3);
            }
            if (str3 == null || str3.equals("UTF-8")) {
                return str;
            }
            throw new XmlStreamReaderException(MessageFormat.format(q, str, str2, str3), str, str2, str3);
        }
        if (str.equals("UTF-16BE") || str.equals("UTF-16LE")) {
            if (str2 != null && !str2.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format(q, str, str2, str3), str, str2, str3);
            }
            if (str3 == null || str3.equals("UTF-16") || str3.equals(str)) {
                return str;
            }
            throw new XmlStreamReaderException(MessageFormat.format(q, str, str2, str3), str, str2, str3);
        }
        if (!str.equals(i) && !str.equals(j)) {
            throw new XmlStreamReaderException(MessageFormat.format(r, str, str2, str3), str, str2, str3);
        }
        if (str2 != null && !str2.equals(str)) {
            throw new XmlStreamReaderException(MessageFormat.format(q, str, str2, str3), str, str2, str3);
        }
        if (str3 == null || str3.equals(l) || str3.equals(str)) {
            return str;
        }
        throw new XmlStreamReaderException(MessageFormat.format(q, str, str2, str3), str, str2, str3);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    public String getDefaultEncoding() {
        return this.c;
    }

    public String getEncoding() {
        return this.b;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i2, int i3) throws IOException {
        return this.a.read(cArr, i2, i3);
    }

    public XmlStreamReader(InputStream inputStream) throws IOException {
        this(inputStream, true);
    }

    public XmlStreamReader(InputStream inputStream, boolean z) throws IOException {
        this(inputStream, z, (String) null);
    }

    public XmlStreamReader(InputStream inputStream, boolean z, String str) throws IOException {
        this.c = str;
        BOMInputStream bOMInputStream = new BOMInputStream(new BufferedInputStream(inputStream, 4096), false, n);
        BOMInputStream bOMInputStream2 = new BOMInputStream(bOMInputStream, true, o);
        String strE = e(bOMInputStream, bOMInputStream2, z);
        this.b = strE;
        this.a = new InputStreamReader(bOMInputStream2, strE);
    }

    public XmlStreamReader(URL url) throws IOException {
        this((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()), (String) null);
    }

    public XmlStreamReader(URLConnection uRLConnection, String str) throws IOException {
        this.c = str;
        String contentType = uRLConnection.getContentType();
        BOMInputStream bOMInputStream = new BOMInputStream(new BufferedInputStream(uRLConnection.getInputStream(), 4096), false, n);
        BOMInputStream bOMInputStream2 = new BOMInputStream(bOMInputStream, true, o);
        if (!(uRLConnection instanceof HttpURLConnection) && contentType == null) {
            this.b = e(bOMInputStream, bOMInputStream2, true);
        } else {
            this.b = c(bOMInputStream, bOMInputStream2, contentType, true);
        }
        this.a = new InputStreamReader(bOMInputStream2, this.b);
    }

    public XmlStreamReader(InputStream inputStream, String str) throws IOException {
        this(inputStream, str, true);
    }

    public XmlStreamReader(InputStream inputStream, String str, boolean z, String str2) throws IOException {
        this.c = str2;
        BOMInputStream bOMInputStream = new BOMInputStream(new BufferedInputStream(inputStream, 4096), false, n);
        BOMInputStream bOMInputStream2 = new BOMInputStream(bOMInputStream, true, o);
        String strC = c(bOMInputStream, bOMInputStream2, str, z);
        this.b = strC;
        this.a = new InputStreamReader(bOMInputStream2, strC);
    }

    public XmlStreamReader(InputStream inputStream, String str, boolean z) throws IOException {
        this(inputStream, str, z, null);
    }
}
