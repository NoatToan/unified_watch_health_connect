package com.amazon.alexa.avs.http;

import com.amazon.alexa.avs.log.Logger;
import com.amazon.alexa.avs.log.LoggerFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes2.dex */
public class MultipartContentBuilder extends RequestBody {
    public static final String BOUNDARY = "__BOUNDARY__";
    public static final String CONTENT_TYPE = "multipart/form-data; boundary=__BOUNDARY__";
    public static final String END_DELIMITER = "\r\n--__BOUNDARY__--\r\n";
    public static final String NEWLINE = "\r\n";
    public static final String PART_CONTENT_DISPOSITION_FORMAT = "Content-Disposition: form-data; name=\"%s\"\r\n";
    public static final String PART_CONTENT_TYPE_FORMAT = "Content-Type: %s\r\n";
    public static final String START_DELIMITER = "\r\n--__BOUNDARY__\r\n";
    public static final String TWO_DASHES = "--";
    private static final Logger log = LoggerFactory.getLogger(MultipartContentBuilder.class);
    private String contentType;
    private List<PartContentProvider> parts;

    public static class PartContentProvider {
        private String contentType;
        private String name;
        private RequestBody requestBody;

        public PartContentProvider(String str, String str2, RequestBody requestBody) {
            this.name = str;
            this.requestBody = requestBody;
            this.contentType = str2;
        }
    }

    public MultipartContentBuilder() {
        this(CONTENT_TYPE);
    }

    public static String getBoundaryContent(String str, String str2) {
        return String.format(PART_CONTENT_DISPOSITION_FORMAT, str) + String.format(PART_CONTENT_TYPE_FORMAT, str2);
    }

    public static String getEndIterator() {
        return END_DELIMITER;
    }

    public static String getMiddleBoundary(String str, String str2) {
        return START_DELIMITER + String.format(PART_CONTENT_DISPOSITION_FORMAT, str) + String.format(PART_CONTENT_TYPE_FORMAT, str2) + "\r\n";
    }

    public void addPart(String str, RequestBody requestBody) {
        addPart(str, requestBody.contentType().toString(), requestBody);
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return MediaType.parse(this.contentType);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        for (PartContentProvider partContentProvider : this.parts) {
            bufferedSink.write(getMiddleBoundary(partContentProvider.name, partContentProvider.contentType).getBytes());
            partContentProvider.requestBody.writeTo(bufferedSink);
        }
        bufferedSink.write(getEndIterator().getBytes());
    }

    public MultipartContentBuilder(String str) {
        this.parts = new ArrayList();
        this.contentType = str;
    }

    public void addPart(String str, String str2, RequestBody requestBody) {
        this.parts.add(new PartContentProvider(str, str2, requestBody));
    }
}
