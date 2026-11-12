package com.huawei.hms.framework.network.restclient.proxy.new2old;

import com.huawei.hms.framework.common.CheckParamUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.restclient.hwhttp.RequestBody;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public class ProxyRequestBody {
    private static final String TAG = "ProxyRequestBody";

    public static RequestBody requestBody2Old(final com.huawei.hms.network.httpclient.RequestBody requestBody) {
        CheckParamUtils.checkNotNull(requestBody, "RequestBody2Old body == null");
        return new RequestBody() { // from class: com.huawei.hms.framework.network.restclient.proxy.new2old.ProxyRequestBody.1
            @Override // com.huawei.hms.framework.network.restclient.hwhttp.RequestBody
            public byte[] body() {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    writeTo(byteArrayOutputStream);
                    return byteArrayOutputStream.toByteArray();
                } catch (IOException unused) {
                    Logger.w(ProxyRequestBody.TAG, "ProxyRequestBody requestBody2Old body error");
                    return new byte[0];
                }
            }

            @Override // com.huawei.hms.framework.network.restclient.hwhttp.RequestBody
            public String contentType() {
                return requestBody.contentType();
            }

            @Override // com.huawei.hms.framework.network.restclient.hwhttp.RequestBody
            public void writeTo(OutputStream outputStream) throws IOException {
                requestBody.writeTo(outputStream);
            }

            @Override // com.huawei.hms.framework.network.restclient.hwhttp.RequestBody
            public long contentLength() throws IOException {
                if (requestBody.contentLength() == -1) {
                    return 0L;
                }
                return requestBody.contentLength();
            }
        };
    }

    public static com.huawei.hms.network.httpclient.RequestBody requestBody2New(final RequestBody requestBody) {
        CheckParamUtils.checkNotNull(requestBody, "RequestBody2New body == null");
        return new com.huawei.hms.network.httpclient.RequestBody() { // from class: com.huawei.hms.framework.network.restclient.proxy.new2old.ProxyRequestBody.2
            @Override // com.huawei.hms.network.httpclient.RequestBody
            public String contentType() {
                return requestBody.contentType();
            }

            @Override // com.huawei.hms.network.httpclient.RequestBody
            public void writeTo(OutputStream outputStream) throws IOException {
                if (requestBody.body() != null && requestBody.body().length != 0) {
                    outputStream.write(requestBody.body());
                } else {
                    requestBody.writeTo(outputStream);
                }
            }

            @Override // com.huawei.hms.network.httpclient.RequestBody
            public long contentLength() throws IOException {
                if (requestBody.contentLength() == 0) {
                    return -1L;
                }
                return requestBody.contentLength();
            }
        };
    }
}
