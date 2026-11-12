package org.cybergarage.http;

import com.xmlywind.sdk.common.Constants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.Vector;
import org.cybergarage.net.HostInterface;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.cybergarage.util.Debug;
import org.cybergarage.util.StringUtil;

/* JADX INFO: loaded from: classes23.dex */
public class HTTPPacket {
    private byte[] content;
    private InputStream contentInput;
    private String firstLine;
    private Vector httpHeaderList;
    private String version;

    public HTTPPacket() {
        this.firstLine = "";
        this.httpHeaderList = new Vector();
        this.content = new byte[0];
        this.contentInput = null;
        setVersion("1.1");
        setContentInputStream(null);
    }

    private String readLine(BufferedInputStream bufferedInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1];
        try {
            int i = bufferedInputStream.read(bArr);
            while (i > 0 && bArr[0] != 10) {
                if (bArr[0] != 13) {
                    byteArrayOutputStream.write(bArr[0]);
                }
                i = bufferedInputStream.read(bArr);
            }
        } catch (InterruptedIOException unused) {
        } catch (IOException e) {
            Debug.warning(e);
        }
        return byteArrayOutputStream.toString();
    }

    private void setFirstLine(String str) {
        this.firstLine = str;
    }

    public void addHeader(HTTPHeader hTTPHeader) {
        this.httpHeaderList.add(hTTPHeader);
    }

    public void clearHeaders() {
        this.httpHeaderList.clear();
        this.httpHeaderList = new Vector();
    }

    public String getCacheControl() {
        return getHeaderValue("Cache-Control");
    }

    public String getCharSet() {
        String lowerCase;
        int iIndexOf;
        String contentType = getContentType();
        if (contentType == null || (iIndexOf = (lowerCase = contentType.toLowerCase()).indexOf("charset")) < 0) {
            return "";
        }
        int i = iIndexOf + 7 + 1;
        String str = new String(lowerCase.getBytes(), i, lowerCase.length() - i);
        if (str.length() < 0) {
            return "";
        }
        if (str.charAt(0) == '\"') {
            str = str.substring(1, str.length() - 1);
        }
        if (str.length() < 0) {
            return "";
        }
        return str.charAt(str.length() - 1) == '\"' ? str.substring(0, str.length() - 1) : str;
    }

    public String getConnection() {
        return getHeaderValue("Connection");
    }

    public byte[] getContent() {
        return this.content;
    }

    public InputStream getContentInputStream() {
        return this.contentInput;
    }

    public String getContentLanguage() {
        return getHeaderValue("Content-Language");
    }

    public long getContentLength() {
        return getLongHeaderValue("Content-Length");
    }

    public long[] getContentRange() {
        long[] jArr = {0, 0, 0};
        if (!hasContentRange()) {
            return jArr;
        }
        String headerValue = getHeaderValue("Content-Range");
        if (headerValue.length() <= 0) {
            headerValue = getHeaderValue("Range");
        }
        if (headerValue.length() <= 0) {
            return jArr;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(headerValue, " =");
        if (!stringTokenizer.hasMoreTokens()) {
            return jArr;
        }
        stringTokenizer.nextToken(" ");
        if (!stringTokenizer.hasMoreTokens()) {
            return jArr;
        }
        try {
            jArr[0] = Long.parseLong(stringTokenizer.nextToken(" -"));
        } catch (NumberFormatException unused) {
        }
        if (!stringTokenizer.hasMoreTokens()) {
            return jArr;
        }
        try {
            jArr[1] = Long.parseLong(stringTokenizer.nextToken("-/"));
        } catch (NumberFormatException unused2) {
        }
        if (!stringTokenizer.hasMoreTokens()) {
            return jArr;
        }
        try {
            jArr[2] = Long.parseLong(stringTokenizer.nextToken(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE));
        } catch (NumberFormatException unused3) {
        }
        return jArr;
    }

    public long getContentRangeFirstPosition() {
        return getContentRange()[0];
    }

    public long getContentRangeInstanceLength() {
        return getContentRange()[2];
    }

    public long getContentRangeLastPosition() {
        return getContentRange()[1];
    }

    public String getContentString() {
        String charSet = getCharSet();
        if (charSet == null || charSet.length() <= 0) {
            return new String(this.content);
        }
        try {
            return new String(this.content, charSet);
        } catch (Exception e) {
            Debug.warning(e);
            return new String(this.content);
        }
    }

    public String getContentType() {
        return getHeaderValue("Content-Type");
    }

    public String getDate() {
        return getHeaderValue("Date");
    }

    public String getFirstLine() {
        return this.firstLine;
    }

    public String getFirstLineToken(int i) {
        StringTokenizer stringTokenizer = new StringTokenizer(this.firstLine, " ");
        String strNextToken = "";
        for (int i2 = 0; i2 <= i; i2++) {
            if (!stringTokenizer.hasMoreTokens()) {
                return "";
            }
            strNextToken = stringTokenizer.nextToken();
        }
        return strNextToken;
    }

    public HTTPHeader getHeader(int i) {
        return (HTTPHeader) this.httpHeaderList.get(i);
    }

    public String getHeaderString() {
        StringBuffer stringBuffer = new StringBuffer();
        int nHeaders = getNHeaders();
        for (int i = 0; i < nHeaders; i++) {
            HTTPHeader header = getHeader(i);
            stringBuffer.append(header.getName() + ": " + header.getValue() + "\r\n");
        }
        return stringBuffer.toString();
    }

    public String getHeaderValue(String str) {
        HTTPHeader header = getHeader(str);
        return header == null ? "" : header.getValue();
    }

    public String getHost() {
        return getHeaderValue(HTTP.HOST);
    }

    public int getIntegerHeaderValue(String str) {
        HTTPHeader header = getHeader(str);
        if (header == null) {
            return 0;
        }
        return StringUtil.toInteger(header.getValue());
    }

    public long getLongHeaderValue(String str) {
        HTTPHeader header = getHeader(str);
        if (header == null) {
            return 0L;
        }
        return StringUtil.toLong(header.getValue());
    }

    public int getNHeaders() {
        return this.httpHeaderList.size();
    }

    public String getServer() {
        return getHeaderValue("Server");
    }

    public String getStringHeaderValue(String str, String str2, String str3) {
        String headerValue = getHeaderValue(str);
        if (headerValue.startsWith(str2)) {
            headerValue = headerValue.substring(1, headerValue.length());
        }
        return headerValue.endsWith(str3) ? headerValue.substring(0, headerValue.length() - 1) : headerValue;
    }

    public String getTransferEncoding() {
        return getHeaderValue("Transfer-Encoding");
    }

    public String getVersion() {
        return this.version;
    }

    public boolean hasConnection() {
        return hasHeader("Connection");
    }

    public boolean hasContent() {
        return this.content.length > 0;
    }

    public boolean hasContentInputStream() {
        return this.contentInput != null;
    }

    public boolean hasContentRange() {
        return hasHeader("Content-Range") || hasHeader("Range");
    }

    public boolean hasFirstLine() {
        return this.firstLine.length() > 0;
    }

    public boolean hasHeader(String str) {
        return getHeader(str) != null;
    }

    public boolean hasTransferEncoding() {
        return hasHeader("Transfer-Encoding");
    }

    public void init() {
        setFirstLine("");
        clearHeaders();
        setContent(new byte[0], false);
        setContentInputStream(null);
    }

    public boolean isChunked() {
        String transferEncoding;
        if (hasTransferEncoding() && (transferEncoding = getTransferEncoding()) != null) {
            return transferEncoding.equalsIgnoreCase(HTTP.CHUNKED);
        }
        return false;
    }

    public boolean isCloseConnection() {
        String connection;
        if (hasConnection() && (connection = getConnection()) != null) {
            return connection.equalsIgnoreCase("close");
        }
        return false;
    }

    public boolean isKeepAliveConnection() {
        String connection;
        if (hasConnection() && (connection = getConnection()) != null) {
            return connection.equalsIgnoreCase("Keep-Alive");
        }
        return false;
    }

    public boolean read(HTTPSocket hTTPSocket) {
        init();
        return set(hTTPSocket);
    }

    public boolean set(InputStream inputStream, boolean z) {
        long contentLength;
        long j;
        long j2;
        long j3;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            String line = readLine(bufferedInputStream);
            if (line != null && line.length() > 0) {
                setFirstLine(line);
                if (new HTTPStatus(line).getStatusCode() == 100) {
                    String line2 = readLine(bufferedInputStream);
                    while (line2 != null && line2.length() > 0) {
                        HTTPHeader hTTPHeader = new HTTPHeader(line2);
                        if (hTTPHeader.hasName()) {
                            setHeader(hTTPHeader);
                        }
                        line2 = readLine(bufferedInputStream);
                    }
                    String line3 = readLine(bufferedInputStream);
                    if (line3 == null || line3.length() <= 0) {
                        return true;
                    }
                    setFirstLine(line3);
                }
                String line4 = readLine(bufferedInputStream);
                while (line4 != null && line4.length() > 0) {
                    HTTPHeader hTTPHeader2 = new HTTPHeader(line4);
                    if (hTTPHeader2.hasName()) {
                        setHeader(hTTPHeader2);
                    }
                    line4 = readLine(bufferedInputStream);
                }
                if (z) {
                    setContent("", false);
                    return true;
                }
                boolean zIsChunked = isChunked();
                long j4 = 0;
                if (zIsChunked) {
                    try {
                        String line5 = readLine(bufferedInputStream);
                        contentLength = line5 != null ? Long.parseLong(line5.trim(), 16) : 0L;
                    } catch (Exception unused) {
                    }
                } else {
                    contentLength = getContentLength();
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (j4 < contentLength) {
                    long chunkSize = HTTP.getChunkSize();
                    byte[] bArr = new byte[(int) (contentLength > chunkSize ? chunkSize : contentLength)];
                    long j5 = j4;
                    while (j5 < contentLength) {
                        long j6 = contentLength - j5;
                        try {
                            int i = bufferedInputStream.read(bArr, 0, (int) (chunkSize < j6 ? chunkSize : j6));
                            if (i < 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                            j5 += (long) i;
                        } catch (Exception e) {
                            Debug.warning(e);
                        }
                    }
                    if (zIsChunked) {
                        long j7 = 0;
                        do {
                            j2 = 2;
                            long jSkip = bufferedInputStream.skip(j2 - j7);
                            j = 0;
                            if (jSkip < 0) {
                                break;
                            }
                            j7 += jSkip;
                        } while (j7 < j2);
                        try {
                            String line6 = readLine(bufferedInputStream);
                            try {
                                j3 = Long.parseLong(new String(line6.getBytes(), 0, line6.length() - 2), 16);
                            } catch (Exception unused2) {
                                j3 = 0;
                            }
                        } catch (Exception unused3) {
                        }
                        contentLength = j3;
                    } else {
                        j = 0;
                        contentLength = 0;
                    }
                    j4 = j;
                }
                setContent(byteArrayOutputStream.toByteArray(), false);
                return true;
            }
            return false;
        } catch (Exception e2) {
            Debug.warning(e2);
            return false;
        }
    }

    public void setCacheControl(String str) {
        setHeader("Cache-Control", str);
    }

    public void setConnection(String str) {
        setHeader("Connection", str);
    }

    public void setContent(byte[] bArr, boolean z) {
        this.content = bArr;
        if (z) {
            setContentLength(bArr.length);
        }
    }

    public void setContentInputStream(InputStream inputStream) {
        this.contentInput = inputStream;
    }

    public void setContentLanguage(String str) {
        setHeader("Content-Language", str);
    }

    public void setContentLength(long j) {
        setLongHeader("Content-Length", j);
    }

    public void setContentRange(long j, long j2, long j3) {
        String str = (("" + Constants.CONTENT_RANGE_PARAMS) + Long.toString(j) + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER) + Long.toString(j2) + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(0 < j3 ? Long.toString(j3) : "*");
        setHeader("Content-Range", sb.toString());
    }

    public void setContentType(String str) {
        setHeader("Content-Type", str);
    }

    public void setDate(Calendar calendar) {
        setHeader("Date", new Date(calendar).getDateString());
    }

    public void setHeader(String str, String str2) {
        HTTPHeader header = getHeader(str);
        if (header != null) {
            header.setValue(str2);
        } else {
            addHeader(str, str2);
        }
    }

    public void setHost(String str, int i) {
        if (HostInterface.isIPv6Address(str)) {
            str = "[" + str + "]";
        }
        setHeader(HTTP.HOST, str + ":" + Integer.toString(i));
    }

    public void setIntegerHeader(String str, int i) {
        setHeader(str, Integer.toString(i));
    }

    public void setLongHeader(String str, long j) {
        setHeader(str, Long.toString(j));
    }

    public void setServer(String str) {
        setHeader("Server", str);
    }

    public void setStringHeader(String str, String str2, String str3, String str4) {
        if (!str2.startsWith(str3)) {
            str2 = str3 + str2;
        }
        if (!str2.endsWith(str4)) {
            str2 = str2 + str4;
        }
        setHeader(str, str2);
    }

    public void setTransferEncoding(String str) {
        setHeader("Transfer-Encoding", str);
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void addHeader(String str, String str2) {
        this.httpHeaderList.add(new HTTPHeader(str, str2));
    }

    public HTTPHeader getHeader(String str) {
        int nHeaders = getNHeaders();
        for (int i = 0; i < nHeaders; i++) {
            HTTPHeader header = getHeader(i);
            if (header.getName().equalsIgnoreCase(str)) {
                return header;
            }
        }
        return null;
    }

    public void setCacheControl(String str, int i) {
        setHeader("Cache-Control", str + SearchCriteria.EQ + Integer.toString(i));
    }

    public void setContent(byte[] bArr) {
        setContent(bArr, true);
    }

    public void setCacheControl(int i) {
        setCacheControl(HTTP.MAX_AGE, i);
    }

    public void setContent(String str, boolean z) {
        setContent(str.getBytes(), z);
    }

    public void setHeader(String str, int i) {
        setHeader(str, Integer.toString(i));
    }

    public void setHost(String str) {
        if (HostInterface.isIPv6Address(str)) {
            str = "[" + str + "]";
        }
        setHeader(HTTP.HOST, str);
    }

    public void setContent(String str) {
        setContent(str, true);
    }

    public void setHeader(String str, long j) {
        setHeader(str, Long.toString(j));
    }

    public String getStringHeaderValue(String str) {
        return getStringHeaderValue(str, "\"", "\"");
    }

    public void setHeader(HTTPHeader hTTPHeader) {
        setHeader(hTTPHeader.getName(), hTTPHeader.getValue());
    }

    public void setStringHeader(String str, String str2) {
        setStringHeader(str, str2, "\"", "\"");
    }

    public HTTPPacket(HTTPPacket hTTPPacket) {
        this.firstLine = "";
        this.httpHeaderList = new Vector();
        this.content = new byte[0];
        this.contentInput = null;
        setVersion("1.1");
        set(hTTPPacket);
        setContentInputStream(null);
    }

    public HTTPPacket(InputStream inputStream) {
        this.firstLine = "";
        this.httpHeaderList = new Vector();
        this.content = new byte[0];
        this.contentInput = null;
        setVersion("1.1");
        set(inputStream);
        setContentInputStream(null);
    }

    public boolean set(InputStream inputStream) {
        return set(inputStream, false);
    }

    public boolean set(HTTPSocket hTTPSocket) {
        return set(hTTPSocket.getInputStream());
    }

    public void set(HTTPPacket hTTPPacket) {
        setFirstLine(hTTPPacket.getFirstLine());
        clearHeaders();
        int nHeaders = hTTPPacket.getNHeaders();
        for (int i = 0; i < nHeaders; i++) {
            addHeader(hTTPPacket.getHeader(i));
        }
        setContent(hTTPPacket.getContent());
    }
}
