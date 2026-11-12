package com.xmlywind.wire.okio;

import com.huami.identity.auth.alexa.ConstantsKt;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes22.dex */
public final class HashingSink extends ForwardingSink {
    private final MessageDigest messageDigest;

    private HashingSink(Sink sink, String str) {
        super(sink);
        try {
            this.messageDigest = MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static HashingSink md5(Sink sink) {
        return new HashingSink(sink, "MD5");
    }

    public static HashingSink sha1(Sink sink) {
        return new HashingSink(sink, "SHA-1");
    }

    public static HashingSink sha256(Sink sink) {
        return new HashingSink(sink, ConstantsKt.ALGORITHM_SHA_256);
    }

    public ByteString hash() {
        return ByteString.of(this.messageDigest.digest());
    }

    @Override // com.xmlywind.wire.okio.ForwardingSink, com.xmlywind.wire.okio.Sink
    public void write(Buffer buffer, long j) {
        Util.checkOffsetAndCount(buffer.size, 0L, j);
        Segment segment = buffer.head;
        long j2 = 0;
        while (j2 < j) {
            int iMin = (int) Math.min(j - j2, segment.limit - segment.pos);
            this.messageDigest.update(segment.data, segment.pos, iMin);
            j2 += (long) iMin;
            segment = segment.next;
        }
        super.write(buffer, j);
    }
}
