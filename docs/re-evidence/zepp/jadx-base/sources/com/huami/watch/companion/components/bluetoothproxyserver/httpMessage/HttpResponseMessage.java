package com.huami.watch.companion.components.bluetoothproxyserver.httpMessage;

import com.huami.watch.companion.components.bluetoothproxyserver.constants.HttpResponseStatus;
import com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.exception.BuildHttpMessageError;
import com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.startLine.ResponseStartLine;
import com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.startLine.StartLine;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class HttpResponseMessage extends HttpMessage {
    private HttpResponseMessage() {
    }

    private HttpResponseMessage d(HttpResponseStatus httpResponseStatus) {
        ResponseStartLine responseStartLine = new ResponseStartLine(null);
        responseStartLine.setProtocol("HTTP");
        responseStartLine.setMasterVersion(1);
        responseStartLine.setMinorVersion(1);
        responseStartLine.setStatus(httpResponseStatus.getStatus());
        responseStartLine.setDescription(httpResponseStatus.getDescription());
        super.setStartLine(responseStartLine);
        return this;
    }

    @Override // com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.HttpMessage
    public StartLine buildStartLien(String str) {
        return new ResponseStartLine(str);
    }

    @Override // com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.HttpMessage
    public HttpMessage decryptHttpMessage() {
        if (!super.headerIsEmpty()) {
            for (Map.Entry<String, String> entry : super.getHeaders().entrySet()) {
                super.addHeader(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    @Override // com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.HttpMessage
    public HttpMessage encryptHttpMessage() {
        if (!super.headerIsEmpty()) {
            for (Map.Entry<String, String> entry : super.getHeaders().entrySet()) {
                super.addHeader(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    @Override // com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.HttpMessage
    public boolean isSupportBody() {
        return true;
    }

    public HttpResponseMessage(InputStream inputStream) throws BuildHttpMessageError {
        super(inputStream);
    }

    public HttpResponseMessage(HttpResponseStatus httpResponseStatus) {
        d(httpResponseStatus);
    }
}
