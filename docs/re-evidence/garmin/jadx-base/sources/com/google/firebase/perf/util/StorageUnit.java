package com.google.firebase.perf.util;

import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes2.dex */
public enum StorageUnit {
    TERABYTES(FileUtils.ONE_TB) { // from class: com.google.firebase.perf.util.StorageUnit.1
        @Override // com.google.firebase.perf.util.StorageUnit
        public long convert(long j8, StorageUnit storageUnit) {
            return storageUnit.toTerabytes(j8);
        }
    },
    GIGABYTES(1073741824) { // from class: com.google.firebase.perf.util.StorageUnit.2
        @Override // com.google.firebase.perf.util.StorageUnit
        public long convert(long j8, StorageUnit storageUnit) {
            return storageUnit.toGigabytes(j8);
        }
    },
    MEGABYTES(1048576) { // from class: com.google.firebase.perf.util.StorageUnit.3
        @Override // com.google.firebase.perf.util.StorageUnit
        public long convert(long j8, StorageUnit storageUnit) {
            return storageUnit.toMegabytes(j8);
        }
    },
    KILOBYTES(1024) { // from class: com.google.firebase.perf.util.StorageUnit.4
        @Override // com.google.firebase.perf.util.StorageUnit
        public long convert(long j8, StorageUnit storageUnit) {
            return storageUnit.toKilobytes(j8);
        }
    },
    BYTES(1) { // from class: com.google.firebase.perf.util.StorageUnit.5
        @Override // com.google.firebase.perf.util.StorageUnit
        public long convert(long j8, StorageUnit storageUnit) {
            return storageUnit.toBytes(j8);
        }
    };

    long numBytes;

    StorageUnit(long j8) {
        this.numBytes = j8;
    }

    public abstract long convert(long j8, StorageUnit storageUnit);

    public long toBytes(long j8) {
        return j8 * this.numBytes;
    }

    public long toGigabytes(long j8) {
        return (j8 * this.numBytes) / GIGABYTES.numBytes;
    }

    public long toKilobytes(long j8) {
        return (j8 * this.numBytes) / KILOBYTES.numBytes;
    }

    public long toMegabytes(long j8) {
        return (j8 * this.numBytes) / MEGABYTES.numBytes;
    }

    public long toTerabytes(long j8) {
        return (j8 * this.numBytes) / TERABYTES.numBytes;
    }
}
