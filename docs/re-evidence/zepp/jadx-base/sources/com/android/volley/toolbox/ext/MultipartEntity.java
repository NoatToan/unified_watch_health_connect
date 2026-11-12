package com.android.volley.toolbox.ext;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

/* JADX INFO: loaded from: classes2.dex */
public class MultipartEntity implements HttpEntity {
    private static final char[] j = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private String h;
    private final String a = "\r\n";
    private final String b = "Content-Type: ";
    private final String c = "Content-Disposition: ";
    private final String d = "text/plain; charset=UTF-8";
    private final String e = "application/octet-stream";
    private final byte[] f = "Content-Transfer-Encoding: binary\r\n\r\n".getBytes();
    private final byte[] g = "Content-Transfer-Encoding: 8bit\r\n\r\n".getBytes();
    public ByteArrayOutputStream i = new ByteArrayOutputStream();

    public MultipartEntity() {
        this.h = null;
        this.h = b();
    }

    private void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private final String b() {
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            char[] cArr = j;
            stringBuffer.append(cArr[random.nextInt(cArr.length)]);
        }
        return stringBuffer.toString();
    }

    private byte[] c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Content-Disposition: form-data; name=\"" + str + "\"");
        if (!TextUtils.isEmpty(str2)) {
            sb.append("; filename=\"" + str2 + "\"");
        }
        sb.append("\r\n");
        return sb.toString().getBytes();
    }

    private void d() throws IOException {
        this.i.write(("--" + this.h + "\r\n").getBytes());
    }

    private void e(String str, byte[] bArr, String str2, byte[] bArr2, String str3) {
        try {
            d();
            this.i.write(("Content-Type: " + str2 + "\r\n").getBytes());
            this.i.write(c(str, str3));
            this.i.write(bArr2);
            this.i.write(bArr);
            this.i.write("\r\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addBinaryPart(String str, byte[] bArr) {
        e(str, bArr, "application/octet-stream", this.f, "no-file");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.android.volley.toolbox.ext.MultipartEntity] */
    public void addFilePart(String str, File file) throws Throwable {
        ?? r0 = 0;
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    d();
                    this.i.write(c(str, file.getName()));
                    this.i.write("Content-Type: application/octet-stream\r\n".getBytes());
                    this.i.write(this.f);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = fileInputStream2.read(bArr);
                        r0 = -1;
                        if (i == -1) {
                            break;
                        } else {
                            this.i.write(bArr, 0, i);
                        }
                    }
                    this.i.flush();
                    a(fileInputStream2);
                } catch (IOException e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    a(fileInputStream);
                    r0 = fileInputStream;
                } catch (Throwable th) {
                    th = th;
                    r0 = fileInputStream2;
                    a(r0);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public void addStringPart(String str, String str2) {
        e(str, str2.getBytes(), "text/plain; charset=UTF-8", this.g, "");
    }

    @Override // org.apache.http.HttpEntity
    public void consumeContent() throws UnsupportedOperationException, IOException {
        if (isStreaming()) {
            throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
        }
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        return new ByteArrayInputStream(this.i.toByteArray());
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentEncoding() {
        return null;
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.i.toByteArray().length;
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentType() {
        return new BasicHeader("Content-Type", "multipart/form-data; boundary=" + this.h);
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
        this.i.write(("--" + this.h + "--\r\n").getBytes());
        outputStream.write(this.i.toByteArray());
    }
}
