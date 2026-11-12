package com.huami.watch.companion.components.bluetoothproxyserver.httpMessage;

import com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.exception.BuildHttpMessageError;
import com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.startLine.StartLine;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.ProxyLog;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes16.dex */
public abstract class HttpMessage {
    private StartLine a;
    private Map<String, String> b = new HashMap();
    private String c;

    public HttpMessage() {
    }

    private void a(InputStream inputStream) {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            try {
                int i = inputStream.read();
                if (i == -1) {
                    break;
                }
                char c = (char) i;
                System.out.print(c);
                stringBuffer.append(c);
            } catch (SocketTimeoutException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        setBody(stringBuffer.toString());
    }

    private void b(InputStream inputStream) throws BuildHttpMessageError {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            try {
                int i = inputStream.read();
                if (i == -1) {
                    return;
                }
                char c = (char) i;
                if (c == '\n') {
                    if (stringBuffer.length() == 0) {
                        return;
                    }
                    String string = stringBuffer.toString();
                    int iIndexOf = string.indexOf(":");
                    addHeader(string.substring(0, iIndexOf), string.substring(iIndexOf + 1));
                    stringBuffer.setLength(0);
                } else if (c != '\r') {
                    stringBuffer.append(c);
                }
            } catch (SocketTimeoutException e) {
                e.printStackTrace();
                throw new BuildHttpMessageError("buildHeader SocketTimeoutException");
            } catch (IOException e2) {
                e2.printStackTrace();
                throw new BuildHttpMessageError("buildHeader IOException");
            }
        }
    }

    private String c(InputStream inputStream) throws BuildHttpMessageError {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            try {
                int i = inputStream.read();
                if (i == -1) {
                    break;
                }
                char c = (char) i;
                System.out.print(c);
                if (c == '\n') {
                    break;
                }
                if (c != '\r') {
                    stringBuffer.append(c);
                }
            } catch (SocketTimeoutException e) {
                e.printStackTrace();
                throw new BuildHttpMessageError("buildStartLine SocketTimeoutException");
            } catch (IOException e2) {
                e2.printStackTrace();
                throw new BuildHttpMessageError("buildStartLine IOException");
            }
        }
        return stringBuffer.toString().trim();
    }

    public void addHeader(String str, String str2) {
        if (StringUtils.isNotBlank(str) && StringUtils.isNotBlank(str2)) {
            ProxyLog.D("HttpMessage", "key：" + str + "  value:" + str2);
            this.b.put(str.trim().toLowerCase(), str2.trim());
        }
    }

    public void addHeaders(String... strArr) {
        if (strArr == null || strArr.length < 2) {
            return;
        }
        int length = strArr.length;
        if (length % 2 != 0) {
            length--;
        }
        for (int i = 0; i < length; i += 2) {
            addHeader(strArr[i], strArr[i + 1]);
        }
    }

    public HttpMessage buildHttpMessage(InputStream inputStream) throws BuildHttpMessageError {
        if (inputStream == null) {
            throw new BuildHttpMessageError("inputStream is null");
        }
        String strC = c(inputStream);
        this.a = buildStartLien(strC);
        if (StringUtils.isBlank(strC) || this.a == null) {
            throw new BuildHttpMessageError("startLine is null");
        }
        b(inputStream);
        if (isSupportBody()) {
            a(inputStream);
        }
        return this;
    }

    public abstract StartLine buildStartLien(String str);

    public abstract HttpMessage decryptHttpMessage();

    public abstract HttpMessage encryptHttpMessage();

    public String getBody() {
        return this.c;
    }

    public String getHeader(String str) {
        if (StringUtils.isNotBlank(str)) {
            return this.b.get(str.trim().toLowerCase());
        }
        return null;
    }

    public Map<String, String> getHeaders() {
        return this.b;
    }

    public StartLine getStartLine() {
        return this.a;
    }

    public boolean headerIsEmpty() {
        return this.b.isEmpty();
    }

    public abstract boolean isSupportBody();

    public void removeHeader(String str) {
        if (StringUtils.isNotBlank(str)) {
            this.b.remove(str.trim().toLowerCase());
        }
    }

    public void removeHeaders(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        for (String str : strArr) {
            removeHeader(str);
        }
    }

    public void setBody(String str) {
        this.c = str;
    }

    public void setStartLine(StartLine startLine) {
        this.a = startLine;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (getStartLine() == null) {
            return null;
        }
        stringBuffer.append(getStartLine());
        stringBuffer.append("\r\n");
        if (!headerIsEmpty()) {
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                stringBuffer.append(entry.getKey());
                stringBuffer.append(": ");
                stringBuffer.append(entry.getValue());
                stringBuffer.append("\r\n");
            }
        }
        stringBuffer.append("\r\n");
        if (StringUtils.isNotBlank(this.c)) {
            stringBuffer.append(this.c);
        }
        return stringBuffer.toString();
    }

    public HttpMessage(InputStream inputStream) throws BuildHttpMessageError {
        buildHttpMessage(inputStream);
    }

    public void addHeaders(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            addHeader(entry.getKey(), entry.getValue());
        }
    }
}
