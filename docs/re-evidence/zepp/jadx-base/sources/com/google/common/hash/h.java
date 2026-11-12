package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
final class h extends c implements Serializable {
    private static final long serialVersionUID = 0;
    private final k<? extends Checksum> a;
    private final int b;
    private final String c;

    public final class b extends com.google.common.hash.a {
        private final Checksum b;

        @Override // com.google.common.hash.a
        public void b(byte b) {
            this.b.update(b);
        }

        @Override // com.google.common.hash.a
        public void e(byte[] bArr, int i, int i2) {
            this.b.update(bArr, i, i2);
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            long value = this.b.getValue();
            return h.this.b == 32 ? HashCode.fromInt((int) value) : HashCode.fromLong(value);
        }

        private b(Checksum checksum) {
            this.b = (Checksum) Preconditions.checkNotNull(checksum);
        }
    }

    public h(k<? extends Checksum> kVar, int i, String str) {
        this.a = (k) Preconditions.checkNotNull(kVar);
        Preconditions.checkArgument(i == 32 || i == 64, "bits (%s) must be either 32 or 64", i);
        this.b = i;
        this.c = (String) Preconditions.checkNotNull(str);
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.b;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new b(this.a.get());
    }

    public String toString() {
        return this.c;
    }
}
