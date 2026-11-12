package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes23.dex */
public class MessageDigestCalculatingInputStream extends ObservableInputStream {
    private final MessageDigest b;

    public static class MessageDigestMaintainingObserver extends ObservableInputStream.Observer {
        private final MessageDigest a;

        public MessageDigestMaintainingObserver(MessageDigest messageDigest) {
            this.a = messageDigest;
        }

        @Override // org.apache.commons.io.input.ObservableInputStream.Observer
        public void b(int i) throws IOException {
            this.a.update((byte) i);
        }

        @Override // org.apache.commons.io.input.ObservableInputStream.Observer
        public void c(byte[] bArr, int i, int i2) throws IOException {
            this.a.update(bArr, i, i2);
        }
    }

    public MessageDigestCalculatingInputStream(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream);
        this.b = messageDigest;
        add(new MessageDigestMaintainingObserver(messageDigest));
    }

    public MessageDigest getMessageDigest() {
        return this.b;
    }

    public MessageDigestCalculatingInputStream(InputStream inputStream, String str) throws NoSuchAlgorithmException {
        this(inputStream, MessageDigest.getInstance(str));
    }

    public MessageDigestCalculatingInputStream(InputStream inputStream) throws NoSuchAlgorithmException {
        this(inputStream, MessageDigest.getInstance("MD5"));
    }
}
