package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.hash.AbstractByteHasher;
import com.google.common.hash.AbstractHashFunction;
import com.google.common.hash.ElementTypesAreNonnullByDefault;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hasher;
import com.google.common.hash.ImmutableSupplier;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes21.dex */
@Immutable
@ElementTypesAreNonnullByDefault
public final class aoq extends AbstractHashFunction implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f633c;
    private final int d;
    private final ImmutableSupplier<? extends Checksum> e;

    public aoq(ImmutableSupplier<? extends Checksum> immutableSupplier, int i, String str) {
        this.e = (ImmutableSupplier) Preconditions.checkNotNull(immutableSupplier);
        Preconditions.checkArgument(i == 32 || i == 64, "bits (%s) must be either 32 or 64", i);
        this.d = i;
        this.f633c = (String) Preconditions.checkNotNull(str);
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.d;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new b(this.e.get());
    }

    public String toString() {
        return this.f633c;
    }

    final class b extends AbstractByteHasher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Checksum f634a;

        private b(Checksum checksum) {
            this.f634a = (Checksum) Preconditions.checkNotNull(checksum);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public void update(byte b2) {
            this.f634a.update(b2);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public void update(byte[] bArr, int i, int i2) {
            this.f634a.update(bArr, i, i2);
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            long value = this.f634a.getValue();
            if (aoq.this.d == 32) {
                return HashCode.fromInt((int) value);
            }
            return HashCode.fromLong(value);
        }
    }
}
