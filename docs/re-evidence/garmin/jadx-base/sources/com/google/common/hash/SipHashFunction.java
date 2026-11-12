package com.google.common.hash;

import am.j;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes14.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    static final HashFunction SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f53559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f53560d;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final long f53561k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private final long f53562k1;

    public static final class SipHasher extends AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f53563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f53564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f53565d;
        private long finalM;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        private long f53566v0;

        /* JADX INFO: renamed from: v1, reason: collision with root package name */
        private long f53567v1;

        /* JADX INFO: renamed from: v2, reason: collision with root package name */
        private long f53568v2;

        /* JADX INFO: renamed from: v3, reason: collision with root package name */
        private long f53569v3;

        public SipHasher(int i14, int i15, long j8, long j14) {
            super(8);
            this.f53563b = 0L;
            this.finalM = 0L;
            this.f53564c = i14;
            this.f53565d = i15;
            this.f53566v0 = 8317987319222330741L ^ j8;
            this.f53567v1 = 7237128888997146477L ^ j14;
            this.f53568v2 = 7816392313619706465L ^ j8;
            this.f53569v3 = 8387220255154660723L ^ j14;
        }

        private void processM(long j8) {
            this.f53569v3 ^= j8;
            sipRound(this.f53564c);
            this.f53566v0 = j8 ^ this.f53566v0;
        }

        private void sipRound(int i14) {
            for (int i15 = 0; i15 < i14; i15++) {
                long j8 = this.f53566v0;
                long j14 = this.f53567v1;
                this.f53566v0 = j8 + j14;
                this.f53568v2 += this.f53569v3;
                this.f53567v1 = Long.rotateLeft(j14, 13);
                long jRotateLeft = Long.rotateLeft(this.f53569v3, 16);
                long j15 = this.f53567v1;
                long j16 = this.f53566v0;
                this.f53567v1 = j15 ^ j16;
                this.f53569v3 = jRotateLeft ^ this.f53568v2;
                long jRotateLeft2 = Long.rotateLeft(j16, 32);
                long j17 = this.f53568v2;
                long j18 = this.f53567v1;
                this.f53568v2 = j17 + j18;
                this.f53566v0 = jRotateLeft2 + this.f53569v3;
                this.f53567v1 = Long.rotateLeft(j18, 17);
                long jRotateLeft3 = Long.rotateLeft(this.f53569v3, 21);
                long j19 = this.f53567v1;
                long j24 = this.f53568v2;
                this.f53567v1 = j19 ^ j24;
                this.f53569v3 = jRotateLeft3 ^ this.f53566v0;
                this.f53568v2 = Long.rotateLeft(j24, 32);
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public HashCode makeHash() {
            long j8 = this.finalM ^ (this.f53563b << 56);
            this.finalM = j8;
            processM(j8);
            this.f53568v2 ^= 255;
            sipRound(this.f53565d);
            return HashCode.fromLong(((this.f53566v0 ^ this.f53567v1) ^ this.f53568v2) ^ this.f53569v3);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void process(ByteBuffer byteBuffer) {
            this.f53563b += 8;
            processM(byteBuffer.getLong());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void processRemaining(ByteBuffer byteBuffer) {
            this.f53563b += (long) byteBuffer.remaining();
            int i14 = 0;
            while (byteBuffer.hasRemaining()) {
                this.finalM ^= (((long) byteBuffer.get()) & 255) << i14;
                i14 += 8;
            }
        }
    }

    public SipHashFunction(int i14, int i15, long j8, long j14) {
        Preconditions.checkArgument(i14 > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i14);
        Preconditions.checkArgument(i15 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i15);
        this.f53559c = i14;
        this.f53560d = i15;
        this.f53561k0 = j8;
        this.f53562k1 = j14;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SipHashFunction) {
            SipHashFunction sipHashFunction = (SipHashFunction) obj;
            if (this.f53559c == sipHashFunction.f53559c && this.f53560d == sipHashFunction.f53560d && this.f53561k0 == sipHashFunction.f53561k0 && this.f53562k1 == sipHashFunction.f53562k1) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((long) ((SipHashFunction.class.hashCode() ^ this.f53559c) ^ this.f53560d)) ^ this.f53561k0) ^ this.f53562k1);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new SipHasher(this.f53559c, this.f53560d, this.f53561k0, this.f53562k1);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("Hashing.sipHash");
        sb3.append(this.f53559c);
        sb3.append("");
        sb3.append(this.f53560d);
        sb3.append("(");
        sb3.append(this.f53561k0);
        sb3.append(", ");
        return j.i(this.f53562k1, ")", sb3);
    }
}
