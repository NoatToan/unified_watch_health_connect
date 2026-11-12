package org.apache.commons.io.input;

import java.io.InputStream;
import java.security.MessageDigest;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes3.dex */
public class MessageDigestCalculatingInputStream extends ObservableInputStream {
    private final MessageDigest messageDigest;

    public MessageDigestCalculatingInputStream(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream);
        this.messageDigest = messageDigest;
        add(new MessageDigestMaintainingObserver(messageDigest));
    }

    public MessageDigest getMessageDigest() {
        return this.messageDigest;
    }

    public static class MessageDigestMaintainingObserver extends ObservableInputStream.Observer {
        private final MessageDigest messageDigest;

        public MessageDigestMaintainingObserver(MessageDigest messageDigest) {
            this.messageDigest = messageDigest;
        }

        @Override // org.apache.commons.io.input.ObservableInputStream.Observer
        public void data(int i14) {
            this.messageDigest.update((byte) i14);
        }

        @Override // org.apache.commons.io.input.ObservableInputStream.Observer
        public void data(byte[] bArr, int i14, int i15) {
            this.messageDigest.update(bArr, i14, i15);
        }
    }

    public MessageDigestCalculatingInputStream(InputStream inputStream, String str) {
        this(inputStream, MessageDigest.getInstance(str));
    }

    public MessageDigestCalculatingInputStream(InputStream inputStream) {
        this(inputStream, MessageDigest.getInstance(MessageDigestAlgorithms.MD5));
    }
}
