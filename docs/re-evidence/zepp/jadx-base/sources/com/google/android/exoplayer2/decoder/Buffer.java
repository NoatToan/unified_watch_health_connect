package com.google.android.exoplayer2.decoder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Buffer {
    private int a;

    public final void addFlag(int flag) {
        this.a = flag | this.a;
    }

    public void clear() {
        this.a = 0;
    }

    public final void clearFlag(int flag) {
        this.a = (~flag) & this.a;
    }

    public final boolean getFlag(int flag) {
        return (this.a & flag) == flag;
    }

    public final boolean hasSupplementalData() {
        return getFlag(268435456);
    }

    public final boolean isDecodeOnly() {
        return getFlag(Integer.MIN_VALUE);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final void setFlags(int flags) {
        this.a = flags;
    }
}
