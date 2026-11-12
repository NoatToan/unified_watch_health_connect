package com.xmlywind.wire.okio;

import com.huami.identity.auth.alexa.ConstantsKt;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes22.dex */
public final class HashingSource extends ForwardingSource {
    private final MessageDigest messageDigest;

    private HashingSource(Source source, String str) {
        super(source);
        try {
            this.messageDigest = MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static HashingSource md5(Source source) {
        return new HashingSource(source, "MD5");
    }

    public static HashingSource sha1(Source source) {
        return new HashingSource(source, "SHA-1");
    }

    public static HashingSource sha256(Source source) {
        return new HashingSource(source, ConstantsKt.ALGORITHM_SHA_256);
    }

    public ByteString hash() {
        return ByteString.of(this.messageDigest.digest());
    }

    @Override // com.xmlywind.wire.okio.ForwardingSource, com.xmlywind.wire.okio.Source
    public long read(Buffer buffer, long j) {
        long j2 = super.read(buffer, j);
        if (j2 != -1) {
            long j3 = buffer.size;
            Segment segment = buffer.head;
            long j4 = j3;
            while (j4 > buffer.size - j2) {
                segment = segment.prev;
                j4 -= (long) (segment.limit - segment.pos);
            }
            long j5 = j3 - j2;
            while (j4 < buffer.size) {
                int i = (int) ((((long) segment.pos) + j5) - j4);
                this.messageDigest.update(segment.data, i, segment.limit - i);
                j4 += (long) (segment.limit - segment.pos);
                j5 = j4;
            }
        }
        return j2;
    }
}
