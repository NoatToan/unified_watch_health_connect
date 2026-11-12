package org.cybergarage.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.StringTokenizer;
import org.cybergarage.util.Debug;

/* JADX INFO: loaded from: classes23.dex */
public class HTTPRequest extends HTTPPacket {
    private HTTPSocket httpSocket;
    private String method;
    private Socket postSocket;
    private String requestHost;
    private int requestPort;
    private String uri;

    public HTTPRequest() {
        this.method = null;
        this.uri = null;
        this.requestHost = "";
        this.requestPort = -1;
        this.httpSocket = null;
        this.postSocket = null;
        setVersion("1.0");
    }

    public String getFirstLineString() {
        return getMethod() + " " + getURI() + " " + getHTTPVersion() + "\r\n";
    }

    public String getHTTPVersion() {
        if (hasFirstLine()) {
            return getFirstLineToken(2);
        }
        return "HTTP/" + super.getVersion();
    }

    public String getHeader() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getFirstLineString());
        stringBuffer.append(getHeaderString());
        return stringBuffer.toString();
    }

    public String getLocalAddress() {
        return getSocket().getLocalAddress();
    }

    public int getLocalPort() {
        return getSocket().getLocalPort();
    }

    public String getMethod() {
        String str = this.method;
        return str != null ? str : getFirstLineToken(0);
    }

    public ParameterList getParameterList() {
        int iIndexOf;
        ParameterList parameterList = new ParameterList();
        String uri = getURI();
        if (uri == null || (iIndexOf = uri.indexOf(63)) < 0) {
            return parameterList;
        }
        while (iIndexOf > 0) {
            int i = iIndexOf + 1;
            int iIndexOf2 = uri.indexOf(61, i);
            String strSubstring = uri.substring(i, iIndexOf2);
            int i2 = iIndexOf2 + 1;
            int iIndexOf3 = uri.indexOf(38, i2);
            parameterList.add(new Parameter(strSubstring, uri.substring(i2, iIndexOf3 > 0 ? iIndexOf3 : uri.length())));
            iIndexOf = iIndexOf3;
        }
        return parameterList;
    }

    public String getParameterValue(String str) {
        return getParameterList().getValue(str);
    }

    public String getRequestHost() {
        return this.requestHost;
    }

    public int getRequestPort() {
        return this.requestPort;
    }

    public HTTPSocket getSocket() {
        return this.httpSocket;
    }

    public String getURI() {
        String str = this.uri;
        return str != null ? str : getFirstLineToken(1);
    }

    public boolean isGetRequest() {
        return isMethod("GET");
    }

    public boolean isHeadRequest() {
        return isMethod("HEAD");
    }

    public boolean isKeepAlive() {
        if (isCloseConnection()) {
            return false;
        }
        if (isKeepAliveConnection()) {
            return true;
        }
        return !(getHTTPVersion().indexOf("1.0") > 0);
    }

    public boolean isMethod(String str) {
        String method = getMethod();
        if (method == null) {
            return false;
        }
        return method.equalsIgnoreCase(str);
    }

    public boolean isNotifyRequest() {
        return isMethod(HTTP.NOTIFY);
    }

    public boolean isPostRequest() {
        return isMethod("POST");
    }

    public boolean isSOAPAction() {
        return hasHeader(HTTP.SOAP_ACTION);
    }

    public boolean isSubscribeRequest() {
        return isMethod("SUBSCRIBE");
    }

    public boolean isUnsubscribeRequest() {
        return isMethod("UNSUBSCRIBE");
    }

    public boolean parseRequestLine(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
        if (!stringTokenizer.hasMoreTokens()) {
            return false;
        }
        setMethod(stringTokenizer.nextToken());
        if (!stringTokenizer.hasMoreTokens()) {
            return false;
        }
        setURI(stringTokenizer.nextToken());
        if (!stringTokenizer.hasMoreTokens()) {
            return false;
        }
        setVersion(stringTokenizer.nextToken());
        return true;
    }

    public boolean post(HTTPResponse hTTPResponse) {
        long j;
        HTTPSocket socket = getSocket();
        long contentLength = hTTPResponse.getContentLength();
        long j2 = 0;
        if (hasContentRange()) {
            long contentRangeFirstPosition = getContentRangeFirstPosition();
            long contentRangeLastPosition = getContentRangeLastPosition();
            if (contentRangeLastPosition <= 0) {
                contentRangeLastPosition = contentLength - 1;
            }
            long j3 = contentRangeLastPosition;
            if (contentRangeFirstPosition > contentLength || j3 > contentLength) {
                return returnResponse(416);
            }
            j2 = contentRangeFirstPosition;
            hTTPResponse.setContentRange(j2, j3, contentLength);
            hTTPResponse.setStatusCode(206);
            j = (j3 - contentRangeFirstPosition) + 1;
        } else {
            j = contentLength;
        }
        return socket.post(hTTPResponse, j2, j, isHeadRequest());
    }

    public void print() {
        System.out.println(toString());
    }

    public boolean read() {
        return super.read(getSocket());
    }

    public boolean returnBadRequest() {
        return returnResponse(400);
    }

    public boolean returnOK() {
        return returnResponse(200);
    }

    public boolean returnResponse(int i) {
        HTTPResponse hTTPResponse = new HTTPResponse();
        hTTPResponse.setStatusCode(i);
        hTTPResponse.setContentLength(0L);
        return post(hTTPResponse);
    }

    public void set(HTTPRequest hTTPRequest) {
        set((HTTPPacket) hTTPRequest);
        setSocket(hTTPRequest.getSocket());
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setRequestHost(String str) {
        this.requestHost = str;
    }

    public void setRequestPort(int i) {
        this.requestPort = i;
    }

    public void setSocket(HTTPSocket hTTPSocket) {
        this.httpSocket = hTTPSocket;
    }

    public void setURI(String str, boolean z) {
        this.uri = str;
        if (z) {
            this.uri = HTTP.toRelativeURL(str);
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getHeader());
        stringBuffer.append("\r\n");
        stringBuffer.append(getContentString());
        return stringBuffer.toString();
    }

    public void setURI(String str) {
        setURI(str, false);
    }

    public HTTPRequest(InputStream inputStream) {
        super(inputStream);
        this.method = null;
        this.uri = null;
        this.requestHost = "";
        this.requestPort = -1;
        this.httpSocket = null;
        this.postSocket = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [int] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.cybergarage.http.HTTPPacket, org.cybergarage.http.HTTPResponse] */
    public HTTPResponse post(String str, int i, boolean z) throws Throwable {
        Socket socket;
        ?? r0 = "\r\n";
        ?? hTTPResponse = new HTTPResponse();
        setHost(str);
        setConnection(z ? "Keep-Alive" : "close");
        boolean zIsHeadRequest = isHeadRequest();
        try {
            try {
                try {
                    if (this.postSocket == null) {
                        Socket socket2 = new Socket();
                        this.postSocket = socket2;
                        socket2.connect(new InetSocketAddress(str, (int) i), 80000);
                    }
                    OutputStream outputStream = this.postSocket.getOutputStream();
                    try {
                        PrintStream printStream = new PrintStream(outputStream);
                        printStream.print(getHeader());
                        printStream.print("\r\n");
                        boolean zIsChunked = isChunked();
                        String contentString = getContentString();
                        int length = contentString != null ? contentString.length() : 0;
                        if (length > 0) {
                            if (zIsChunked) {
                                printStream.print(Long.toHexString(length));
                                printStream.print("\r\n");
                            }
                            printStream.print(contentString);
                            if (zIsChunked) {
                                printStream.print("\r\n");
                            }
                        }
                        if (zIsChunked) {
                            printStream.print("0");
                            printStream.print("\r\n");
                        }
                        printStream.flush();
                        i = this.postSocket.getInputStream();
                        try {
                            hTTPResponse.set(i, zIsHeadRequest);
                            if (!z) {
                                try {
                                    i.close();
                                } catch (Exception unused) {
                                }
                                if (i != 0) {
                                    try {
                                        outputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                }
                                if (outputStream != null) {
                                    socket = this.postSocket;
                                    r0 = r0;
                                    i = i;
                                    socket.close();
                                }
                                this.postSocket = null;
                                r0 = r0;
                                i = i;
                            }
                        } catch (SocketException e) {
                            i = outputStream;
                            e = e;
                            r0 = i;
                            hTTPResponse.setStatusCode(500);
                            Debug.warning(e);
                            r0 = r0;
                            i = i;
                            if (!z) {
                                try {
                                    r0.close();
                                } catch (Exception unused3) {
                                }
                                if (r0 != 0) {
                                    try {
                                        i.close();
                                    } catch (Exception unused4) {
                                    }
                                }
                                if (i != 0) {
                                    socket = this.postSocket;
                                    r0 = r0;
                                    i = i;
                                }
                                this.postSocket = null;
                                r0 = r0;
                                i = i;
                            }
                            return hTTPResponse;
                        } catch (IOException e2) {
                            i = outputStream;
                            e = e2;
                            r0 = i;
                            hTTPResponse.setStatusCode(500);
                            Debug.warning(e);
                            r0 = r0;
                            i = i;
                            if (!z) {
                                try {
                                    r0.close();
                                } catch (Exception unused5) {
                                }
                                if (r0 != 0) {
                                    try {
                                        i.close();
                                    } catch (Exception unused6) {
                                    }
                                }
                                if (i != 0) {
                                    socket = this.postSocket;
                                    r0 = r0;
                                    i = i;
                                }
                                this.postSocket = null;
                                r0 = r0;
                                i = i;
                            }
                            return hTTPResponse;
                        } catch (Throwable th) {
                            i = outputStream;
                            th = th;
                            r0 = i;
                            if (!z) {
                                try {
                                    r0.close();
                                } catch (Exception unused7) {
                                }
                                if (r0 != 0) {
                                    try {
                                        i.close();
                                    } catch (Exception unused8) {
                                    }
                                }
                                if (i != 0) {
                                    try {
                                        this.postSocket.close();
                                    } catch (Exception unused9) {
                                    }
                                }
                                this.postSocket = null;
                            }
                            throw th;
                        }
                    } catch (SocketException e3) {
                        r0 = 0;
                        i = outputStream;
                        e = e3;
                    } catch (IOException e4) {
                        r0 = 0;
                        i = outputStream;
                        e = e4;
                    } catch (Throwable th2) {
                        r0 = 0;
                        i = outputStream;
                        th = th2;
                    }
                } catch (Exception unused10) {
                }
            } catch (SocketException e5) {
                e = e5;
                i = 0;
                r0 = 0;
            } catch (IOException e6) {
                e = e6;
                i = 0;
                r0 = 0;
            } catch (Throwable th3) {
                th = th3;
                i = 0;
                r0 = 0;
            }
            return hTTPResponse;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public HTTPRequest(HTTPSocket hTTPSocket) {
        this(hTTPSocket.getInputStream());
        setSocket(hTTPSocket);
    }

    public HTTPResponse post(String str, int i) {
        return post(str, i, false);
    }
}
