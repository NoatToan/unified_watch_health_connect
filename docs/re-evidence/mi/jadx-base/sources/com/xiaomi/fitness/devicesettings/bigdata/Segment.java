package com.xiaomi.fitness.devicesettings.bigdata;

import com.xiaomi.fitness.statistics.StatConstants;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bigdata/Segment;", "", "sequence", "", "data", "", StatConstants.PARAM_START, "<init>", "(I[BI)V", "getSequence", "()I", "getData", "()[B", "getStart", "dataLength", "getDataLength", "fillBuffer", "", "buffer", "Ljava/nio/ByteBuffer;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Segment {

    @NotNull
    private final byte[] data;
    private final int sequence;
    private final int start;

    public Segment(int i, @NotNull byte[] data, int i2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.sequence = i;
        this.data = data;
        this.start = i2;
    }

    public final void fillBuffer(@NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.put(this.data, this.start, getDataLength());
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    public final int getDataLength() {
        return this.data.length - this.start;
    }

    public final int getSequence() {
        return this.sequence;
    }

    public final int getStart() {
        return this.start;
    }
}
