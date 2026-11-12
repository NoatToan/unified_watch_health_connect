package org.cybergarage.http;

import java.io.InputStream;

/* JADX INFO: loaded from: classes23.dex */
public class HTTPResponse extends HTTPPacket {
    private int statusCode;

    public HTTPResponse() {
        this.statusCode = 0;
        setVersion("1.1");
        setContentType(HTML.CONTENT_TYPE);
        setServer(HTTPServer.getName());
        setContent("");
    }

    public String getHeader() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getStatusLineString());
        stringBuffer.append(getHeaderString());
        return stringBuffer.toString();
    }

    public int getStatusCode() {
        int i = this.statusCode;
        return i != 0 ? i : new HTTPStatus(getFirstLine()).getStatusCode();
    }

    public String getStatusLineString() {
        return "HTTP/" + getVersion() + " " + getStatusCode() + " " + HTTPStatus.code2String(this.statusCode) + "\r\n";
    }

    public boolean isSuccessful() {
        return HTTPStatus.isSuccessful(getStatusCode());
    }

    public void print() {
        System.out.println(toString());
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getStatusLineString());
        stringBuffer.append(getHeaderString());
        stringBuffer.append("\r\n");
        stringBuffer.append(getContentString());
        return stringBuffer.toString();
    }

    public HTTPResponse(HTTPResponse hTTPResponse) {
        this.statusCode = 0;
        set(hTTPResponse);
    }

    public HTTPResponse(InputStream inputStream) {
        super(inputStream);
        this.statusCode = 0;
    }

    public HTTPResponse(HTTPSocket hTTPSocket) {
        this(hTTPSocket.getInputStream());
    }
}
