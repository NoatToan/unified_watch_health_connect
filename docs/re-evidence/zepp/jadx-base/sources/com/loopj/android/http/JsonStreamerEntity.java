package com.loopj.android.http;

import android.util.Log;
import com.alipay.sdk.m.u.i;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

/* JADX INFO: loaded from: classes18.dex */
class JsonStreamerEntity implements HttpEntity {
    private static final int BUFFER_SIZE = 4096;
    private static final String LOG_TAG = "JsonStreamerEntity";
    private final Header contentEncoding;
    private final ResponseHandlerInterface progressHandler;
    private static final UnsupportedOperationException ERR_UNSUPPORTED = new UnsupportedOperationException("Unsupported operation in this implementation.");
    private static final StringBuilder BUILDER = new StringBuilder(128);
    private static final byte[] JSON_TRUE = "true".getBytes();
    private static final byte[] JSON_FALSE = "false".getBytes();
    private static final byte[] JSON_NULL = "null".getBytes();
    private static final byte[] STREAM_NAME = escape("name");
    private static final byte[] STREAM_TYPE = escape("type");
    private static final byte[] STREAM_CONTENTS = escape("contents");
    private static final byte[] STREAM_ELAPSED = escape("_elapsed");
    private static final Header HEADER_JSON_CONTENT = new BasicHeader("Content-Type", "application/json");
    private static final Header HEADER_GZIP_ENCODING = new BasicHeader("Content-Encoding", AsyncHttpClient.ENCODING_GZIP);
    private final byte[] buffer = new byte[4096];
    private final Map<String, Object> jsonParams = new HashMap();

    public JsonStreamerEntity(ResponseHandlerInterface responseHandlerInterface, boolean z) {
        this.progressHandler = responseHandlerInterface;
        this.contentEncoding = z ? HEADER_GZIP_ENCODING : null;
    }

    private void endMetaData(OutputStream outputStream) throws IOException {
        outputStream.write(34);
    }

    public static byte[] escape(String str) {
        if (str == null) {
            return JSON_NULL;
        }
        BUILDER.append('\"');
        int length = str.length();
        int i = -1;
        while (true) {
            i++;
            int i2 = 0;
            if (i >= length) {
                StringBuilder sb = BUILDER;
                sb.append('\"');
                try {
                    return sb.toString().getBytes();
                } finally {
                    BUILDER.setLength(0);
                }
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                BUILDER.append("\\f");
            } else if (cCharAt == '\r') {
                BUILDER.append("\\r");
            } else if (cCharAt == '\"') {
                BUILDER.append("\\\"");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        BUILDER.append("\\b");
                        break;
                    case '\t':
                        BUILDER.append("\\t");
                        break;
                    case '\n':
                        BUILDER.append("\\n");
                        break;
                    default:
                        if ((cCharAt >= 0 && cCharAt <= 31) || ((cCharAt >= 127 && cCharAt <= 159) || (cCharAt >= 8192 && cCharAt <= 8447))) {
                            String hexString = Integer.toHexString(cCharAt);
                            BUILDER.append("\\u");
                            int length2 = 4 - hexString.length();
                            while (i2 < length2) {
                                BUILDER.append('0');
                                i2++;
                            }
                            BUILDER.append(hexString.toUpperCase(Locale.US));
                        } else {
                            BUILDER.append(cCharAt);
                        }
                        break;
                }
            } else {
                BUILDER.append("\\\\");
            }
        }
    }

    private void writeMetaData(OutputStream outputStream, String str, String str2) throws IOException {
        outputStream.write(STREAM_NAME);
        outputStream.write(58);
        outputStream.write(escape(str));
        outputStream.write(44);
        outputStream.write(STREAM_TYPE);
        outputStream.write(58);
        outputStream.write(escape(str2));
        outputStream.write(44);
        outputStream.write(STREAM_CONTENTS);
        outputStream.write(58);
        outputStream.write(34);
    }

    private void writeToFromFile(OutputStream outputStream, RequestParams.FileWrapper fileWrapper) throws IOException {
        writeMetaData(outputStream, fileWrapper.file.getName(), fileWrapper.contentType);
        int length = (int) fileWrapper.file.length();
        FileInputStream fileInputStream = new FileInputStream(fileWrapper.file);
        Base64OutputStream base64OutputStream = new Base64OutputStream(outputStream, 18);
        int i = 0;
        while (true) {
            int i2 = fileInputStream.read(this.buffer);
            if (i2 == -1) {
                AsyncHttpClient.silentCloseOutputStream(base64OutputStream);
                endMetaData(outputStream);
                AsyncHttpClient.silentCloseInputStream(fileInputStream);
                return;
            } else {
                base64OutputStream.write(this.buffer, 0, i2);
                i += i2;
                this.progressHandler.sendProgressMessage(i, length);
            }
        }
    }

    private void writeToFromStream(OutputStream outputStream, RequestParams.StreamWrapper streamWrapper) throws IOException {
        writeMetaData(outputStream, streamWrapper.name, streamWrapper.contentType);
        Base64OutputStream base64OutputStream = new Base64OutputStream(outputStream, 18);
        while (true) {
            int i = streamWrapper.inputStream.read(this.buffer);
            if (i == -1) {
                break;
            } else {
                base64OutputStream.write(this.buffer, 0, i);
            }
        }
        AsyncHttpClient.silentCloseOutputStream(base64OutputStream);
        endMetaData(outputStream);
        if (streamWrapper.autoClose) {
            AsyncHttpClient.silentCloseInputStream(streamWrapper.inputStream);
        }
    }

    public void addPart(String str, Object obj) {
        this.jsonParams.put(str, obj);
    }

    @Override // org.apache.http.HttpEntity
    public void consumeContent() throws UnsupportedOperationException, IOException {
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() throws UnsupportedOperationException, IOException {
        throw ERR_UNSUPPORTED;
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentEncoding() {
        return this.contentEncoding;
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return -1L;
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentType() {
        return HEADER_JSON_CONTENT;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isChunked() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalStateException("Output stream cannot be null.");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.contentEncoding != null) {
            outputStream = new GZIPOutputStream(outputStream, 4096);
        }
        outputStream.write(123);
        for (String str : this.jsonParams.keySet()) {
            Object obj = this.jsonParams.get(str);
            if (obj != null) {
                outputStream.write(escape(str));
                outputStream.write(58);
                boolean z = obj instanceof RequestParams.FileWrapper;
                if (z || (obj instanceof RequestParams.StreamWrapper)) {
                    outputStream.write(123);
                    if (z) {
                        writeToFromFile(outputStream, (RequestParams.FileWrapper) obj);
                    } else {
                        writeToFromStream(outputStream, (RequestParams.StreamWrapper) obj);
                    }
                    outputStream.write(125);
                } else if (obj instanceof Boolean) {
                    outputStream.write(((Boolean) obj).booleanValue() ? JSON_TRUE : JSON_FALSE);
                } else if (obj instanceof Long) {
                    outputStream.write((((Number) obj).longValue() + "").getBytes());
                } else if (obj instanceof Double) {
                    outputStream.write((((Number) obj).doubleValue() + "").getBytes());
                } else if (obj instanceof Float) {
                    outputStream.write((((Number) obj).floatValue() + "").getBytes());
                } else if (obj instanceof Integer) {
                    outputStream.write((((Number) obj).intValue() + "").getBytes());
                } else {
                    outputStream.write(obj.toString().getBytes());
                }
                outputStream.write(44);
            }
        }
        outputStream.write(STREAM_ELAPSED);
        outputStream.write(58);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        outputStream.write((jCurrentTimeMillis2 + i.d).getBytes());
        Log.i(LOG_TAG, "Uploaded JSON in " + Math.floor((double) (jCurrentTimeMillis2 / 1000)) + " seconds");
        outputStream.flush();
        AsyncHttpClient.silentCloseOutputStream(outputStream);
    }
}
