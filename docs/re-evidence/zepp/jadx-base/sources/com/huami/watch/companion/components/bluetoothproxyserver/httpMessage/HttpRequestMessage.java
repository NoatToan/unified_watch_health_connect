package com.huami.watch.companion.components.bluetoothproxyserver.httpMessage;

import com.huami.watch.companion.components.bluetoothproxyserver.constants.RequestMethod;
import com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.exception.BuildHttpMessageError;
import com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.startLine.RequestStartLine;
import com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.startLine.StartLine;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class HttpRequestMessage extends HttpMessage {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RequestMethod.values().length];
            a = iArr;
            try {
                iArr[RequestMethod.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RequestMethod.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public HttpRequestMessage(InputStream inputStream) throws BuildHttpMessageError {
        super(inputStream);
    }

    @Override // com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.HttpMessage
    public StartLine buildStartLien(String str) {
        return new RequestStartLine(str);
    }

    @Override // com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.HttpMessage
    public HttpMessage decryptHttpMessage() {
        StartLine startLine = getStartLine();
        if (startLine instanceof RequestStartLine) {
            RequestStartLine requestStartLine = (RequestStartLine) startLine;
            requestStartLine.setUrl(requestStartLine.getUrl());
            super.setStartLine(requestStartLine);
        }
        if (!super.headerIsEmpty()) {
            for (Map.Entry<String, String> entry : super.getHeaders().entrySet()) {
                super.addHeader(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    @Override // com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.HttpMessage
    public HttpMessage encryptHttpMessage() {
        StartLine startLine = getStartLine();
        if (startLine instanceof RequestStartLine) {
            RequestStartLine requestStartLine = (RequestStartLine) startLine;
            requestStartLine.setUrl(requestStartLine.getUrl());
            super.setStartLine(requestStartLine);
        }
        if (!super.headerIsEmpty()) {
            for (Map.Entry<String, String> entry : super.getHeaders().entrySet()) {
                super.addHeader(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    @Override // com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.HttpMessage
    public boolean isSupportBody() {
        int i = a.a[((RequestStartLine) super.getStartLine()).getMethod().ordinal()];
        return i == 1 || i == 2;
    }
}
