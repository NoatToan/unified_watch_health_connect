package com.amazon.alexa.avs.http;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes2.dex */
public class StringContentRequestBody extends RequestBody {
    private String content;
    private String contentType;
    private String name;

    public StringContentRequestBody(String str, String str2, String str3) {
        this.contentType = str2;
        this.content = str3;
        this.name = str;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return MediaType.parse(this.contentType);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        bufferedSink.write(MultipartContentBuilder.getMiddleBoundary(this.name, this.contentType).getBytes());
        bufferedSink.write(this.content.getBytes());
        bufferedSink.write(MultipartContentBuilder.getEndIterator().getBytes());
    }
}
