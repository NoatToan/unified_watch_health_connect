package com.amazon.alexa.avs.http;

import com.amazon.alexa.avs.log.LogHelper;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes2.dex */
public class AudioStreamRequestBody extends RequestBody {
    public static final String TAG = LogHelper.makeLogTag(AudioStreamRequestBody.class);
    private Source mAduidoSource;
    private InputStream mInputStream;

    public AudioStreamRequestBody(InputStream inputStream) {
        this.mInputStream = inputStream;
        this.mAduidoSource = Okio.source(inputStream);
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return MediaType.parse("application/octet-stream");
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        bufferedSink.writeAll(this.mAduidoSource);
        LogHelper.d(TAG, "write voice data " + this.mInputStream);
        IOUtils.closeQuietly(this.mInputStream);
    }
}
