package org.apache.commons.compress.compressors.lz4;

import com.xiaomi.fitness.sync.model.EventRecurrence;

/* JADX INFO: loaded from: classes3.dex */
public enum FramedLZ4CompressorOutputStream$BlockSize {
    K64(65536, 4),
    K256(262144, 5),
    M1(EventRecurrence.TH, 6),
    M4(4194304, 7);

    private final int index;
    private final int size;

    FramedLZ4CompressorOutputStream$BlockSize(int i, int i2) {
        this.size = i;
        this.index = i2;
    }

    public int getIndex() {
        return this.index;
    }

    public int getSize() {
        return this.size;
    }
}
