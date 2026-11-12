package com.amazon.alexa.avs.http;

import android.text.TextUtils;
import com.amazon.alexa.avs.http.okhttp.ConnectionListener;
import com.amazon.alexa.avs.log.Logger;
import com.amazon.alexa.avs.log.LoggerFactory;
import com.amazon.alexa.avs.message.response.Directive;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.Util;
import org.apache.commons.fileupload.MultipartStream;

/* JADX INFO: loaded from: classes2.dex */
public class MultipartParser extends MessageParser implements ConnectionListener {
    private static final int MULTIPART_BUFFER_SIZE = 512;
    private static final Logger log = LoggerFactory.getLogger(MultipartParser.class);
    private final MultipartParserConsumer consumer;
    private Map<String, String> headers;
    private String mTag;
    private MultipartStream multipartStream;
    private final AtomicBoolean shutdown = new AtomicBoolean(false);

    public interface MultipartParserConsumer {
        void onDirective(Directive directive);

        void onDirectiveAttachment(String str, InputStream inputStream);
    }

    public MultipartParser(MultipartParserConsumer multipartParserConsumer, String str) {
        this.mTag = str;
        this.consumer = multipartParserConsumer;
    }

    private String getMultipartContentId(Map<String, String> map) {
        String multipartHeaderValue = getMultipartHeaderValue(map, HttpHeaders.CONTENT_ID);
        return multipartHeaderValue.substring(1, multipartHeaderValue.length() - 1);
    }

    private String getMultipartHeaderValue(Map<String, String> map, String str) {
        return map.get(str.toLowerCase());
    }

    private byte[] getPartBytes() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.multipartStream.readBodyData(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private Map<String, String> getPartHeaders() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new StringReader(this.multipartStream.readHeaders()));
        HashMap map = new HashMap();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String strTrim = line.trim();
                if (!TextUtils.isEmpty(strTrim) && strTrim.contains(":")) {
                    int iIndexOf = strTrim.indexOf(":");
                    String strTrim2 = strTrim.substring(0, iIndexOf).trim();
                    map.put(strTrim2.toLowerCase(), strTrim.substring(iIndexOf + 1).trim());
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    private void handleAudio(byte[] bArr) {
        String multipartContentId = getMultipartContentId(this.headers);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        log.debug("handleAudio content ID :   " + multipartContentId + "   headers: " + this.headers);
        this.consumer.onDirectiveAttachment(multipartContentId, byteArrayInputStream);
    }

    private void handleMetadata(String str) throws IOException {
        Directive.DirectiveWrapper directiveWrapper = (Directive.DirectiveWrapper) Directive.DirectiveWrapper.getDirectiveBuilder().create().fromJson(str, Directive.DirectiveWrapper.class);
        if (directiveWrapper.getDirective() != null) {
            this.consumer.onDirective(directiveWrapper.getDirective());
        } else {
            log.error("Failed to parse a directive.");
        }
    }

    private void handlePart() throws IOException {
        this.headers = getPartHeaders();
        byte[] partBytes = getPartBytes();
        if (isPartJSON(this.headers)) {
            handleMetadata(string(partBytes));
        } else {
            handleAudio(partBytes);
        }
    }

    private boolean isPartJSON(Map<String, String> map) {
        String multipartHeaderValue = getMultipartHeaderValue(map, "Content-Type");
        if (TextUtils.isEmpty(multipartHeaderValue)) {
            return false;
        }
        return multipartHeaderValue.contains("application/json");
    }

    private void loopStream() throws IOException {
        try {
            boolean zSkipPreamble = this.multipartStream.skipPreamble();
            while (zSkipPreamble) {
                handlePart();
                zSkipPreamble = this.multipartStream.readBoundary();
            }
        } catch (IOException e) {
            if (!this.shutdown.get()) {
                throw e;
            }
        }
    }

    private static final String string(byte[] bArr) throws IOException {
        return new String(bArr, Util.UTF_8);
    }

    public String getTag() {
        return this.mTag;
    }

    @Override // com.amazon.alexa.avs.http.okhttp.ConnectionListener
    public void onConnected() {
        this.shutdown.set(false);
    }

    @Override // com.amazon.alexa.avs.http.okhttp.ConnectionListener
    public void onDisconnected() {
        this.shutdown.set(true);
    }

    public void parseStream(InputStream inputStream, String str) throws IOException {
        Logger logger = log;
        logger.debug("#####  parseStream  START " + this.mTag + "   #####");
        this.shutdown.set(false);
        this.multipartStream = new MultipartStream(inputStream, str.getBytes(), 512, null);
        this.headers = null;
        loopStream();
        logger.debug("#####  parseStream  END " + this.mTag + "   #####");
    }

    public void shutdownGracefully() {
        this.shutdown.set(false);
    }
}
