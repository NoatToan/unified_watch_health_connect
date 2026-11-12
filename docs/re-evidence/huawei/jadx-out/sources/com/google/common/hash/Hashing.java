package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import defpackage.aoq;
import defpackage.aov;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class Hashing {
    public static final int d = (int) System.currentTimeMillis();

    public static HashFunction a() {
        return aov.d;
    }

    @Immutable
    enum ChecksumType implements ImmutableSupplier<Checksum> {
        CRC_32("Hashing.crc32()") { // from class: com.google.common.hash.Hashing.ChecksumType.1
            @Override // com.google.common.base.Supplier
            public Checksum get() {
                return new CRC32();
            }
        },
        ADLER_32("Hashing.adler32()") { // from class: com.google.common.hash.Hashing.ChecksumType.2
            @Override // com.google.common.base.Supplier
            public Checksum get() {
                return new Adler32();
            }
        };

        public final HashFunction hashFunction;

        ChecksumType(String str) {
            this.hashFunction = new aoq(this, 32, str);
        }
    }
}
