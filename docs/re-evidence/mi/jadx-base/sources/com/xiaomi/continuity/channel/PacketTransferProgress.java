package com.xiaomi.continuity.channel;

/* JADX INFO: loaded from: classes7.dex */
public class PacketTransferProgress {
    private int transferState = 1;
    private long totalLength = -1;
    private long transferredLength = 0;

    public long getTotalLength() {
        return this.totalLength;
    }

    public int getTransferState() {
        return this.transferState;
    }

    public long getTransferredLength() {
        return this.transferredLength;
    }
}
