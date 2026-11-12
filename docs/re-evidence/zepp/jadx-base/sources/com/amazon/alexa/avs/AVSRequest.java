package com.amazon.alexa.avs;

import com.amazon.alexa.avs.http.AVSClient;
import com.amazon.alexa.avs.http.MultipartParser;
import com.amazon.alexa.avs.http.RetryPolicy;
import java.io.InputStream;
import okhttp3.RequestBody;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes2.dex */
public class AVSRequest {
    private final RequestBody contentProvider;
    private final int dataType;
    private final InputStream mInputStream;
    private final String mTagId;
    private final MultipartParser multipartParser;
    private final RequestListener requestListener;
    private final AVSClient.Resource resource;
    private final RetryPolicy retryPolicy;

    public AVSRequest(String str, int i, AVSClient.Resource resource, RequestBody requestBody, RetryPolicy retryPolicy, MultipartParser multipartParser, RequestListener requestListener) {
        this(str, i, resource, requestBody, retryPolicy, multipartParser, requestListener, null);
    }

    public void closeInputStream() {
        InputStream inputStream = this.mInputStream;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
        }
    }

    public RequestBody getContentProvider() {
        return this.contentProvider;
    }

    public int getDataType() {
        return this.dataType;
    }

    public MultipartParser getMultipartParser() {
        return this.multipartParser;
    }

    public RequestListener getRequestListener() {
        return this.requestListener;
    }

    public AVSClient.Resource getResource() {
        return this.resource;
    }

    public RetryPolicy getRetryPolicy() {
        return this.retryPolicy;
    }

    public String getTagId() {
        return this.mTagId;
    }

    public AVSRequest(String str, int i, AVSClient.Resource resource, RequestBody requestBody, RetryPolicy retryPolicy, MultipartParser multipartParser, RequestListener requestListener, InputStream inputStream) {
        this.resource = resource;
        this.dataType = i;
        this.contentProvider = requestBody;
        this.retryPolicy = retryPolicy;
        this.multipartParser = multipartParser;
        this.requestListener = requestListener;
        this.mInputStream = inputStream;
        this.mTagId = str;
    }

    public AVSRequest(String str, int i, AVSClient.Resource resource, RequestBody requestBody, RetryPolicy retryPolicy, MultipartParser multipartParser) {
        this(str, i, resource, requestBody, retryPolicy, multipartParser, null, null);
    }
}
