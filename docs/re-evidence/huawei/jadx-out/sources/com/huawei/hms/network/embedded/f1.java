package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.httpclient.ResponseBody;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.channels.IllegalBlockingModeException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: loaded from: classes34.dex */
public class f1 extends ResponseBody {
    public static final String d = "ResponseBodyImpl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f14748c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InputStream f14750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f14751c;
        public Charset d;

        public b inputStream(InputStream inputStream) {
            if (inputStream == null) {
                throw new NullPointerException("inputStream not null in ResponseBody");
            }
            this.f14750b = inputStream;
            return this;
        }

        public b contentType(String str) {
            this.f14749a = str;
            return this;
        }

        public b contentLength(long j) {
            this.f14751c = j;
            return this;
        }

        public b charSet(Charset charset) {
            this.d = charset;
            return this;
        }

        public b charSet(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.d = Charset.forName(str);
                    return this;
                } catch (IllegalCharsetNameException | UnsupportedCharsetException e) {
                    Logger.w("ResponseBody", "charSet error", e);
                }
            }
            return this;
        }

        public f1 build() {
            return new f1(this);
        }

        public b(f1 f1Var) {
            this.f14749a = f1Var.f14746a;
            this.f14751c = f1Var.f14747b;
            this.d = f1Var.charSet;
            this.f14750b = f1Var.f14748c;
        }

        public b() {
        }
    }

    public b newBuilder() {
        return new b(this);
    }

    @Override // com.huawei.hms.network.httpclient.ResponseBody
    public final InputStream getInputStream() {
        return this.f14748c;
    }

    @Override // com.huawei.hms.network.httpclient.ResponseBody
    public String getContentType() {
        return this.f14746a;
    }

    @Override // com.huawei.hms.network.httpclient.ResponseBody
    public long getContentLength() {
        return this.f14747b;
    }

    @Override // com.huawei.hms.network.httpclient.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f14748c;
        if (inputStream != null) {
            try {
                IoUtils.closeSecure(inputStream);
            } catch (IllegalBlockingModeException e) {
                Logger.w(d, "closeSecure IllegalBlockingModeException", e);
            }
        }
        Reader reader = this.reader;
        if (reader != null) {
            try {
                IoUtils.closeSecure(reader);
            } catch (IllegalBlockingModeException e2) {
                Logger.w(d, "closeSecure IllegalBlockingModeException", e2);
            }
        }
    }

    public f1(b bVar) {
        this.f14746a = bVar.f14749a;
        this.f14747b = bVar.f14751c;
        this.f14748c = bVar.f14750b;
        this.charSet = bVar.d;
    }
}
