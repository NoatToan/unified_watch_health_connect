package com.huami.bluetooth.profile.cmdrequest;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.passport.Configs;
import com.xiaomi.hm.health.bt.utils.CmdOutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u0002J\u0012\u0010\t\u001a\u00020\u00002\n\u0010\u0003\u001a\u00020\b\"\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\bJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0006\u0010\u0011\u001a\u00020\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/bluetooth/profile/cmdrequest/DataBuilder;", "", "", "data", "dataByteSize", "addInt", "", "addByte", "", "addBytes", "Lcom/huami/bluetooth/profile/cmdrequest/Operation;", "operation", "addOperation", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "toString", "", Configs.Params.RESET, "Lcom/xiaomi/hm/health/bt/utils/CmdOutputStream;", "a", "Lcom/xiaomi/hm/health/bt/utils/CmdOutputStream;", "dataStream", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DataBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CmdOutputStream dataStream = new CmdOutputStream(0, 1, null);

    public static /* synthetic */ DataBuilder addByte$default(DataBuilder dataBuilder, byte b, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return dataBuilder.addByte(b, i);
    }

    public static /* synthetic */ DataBuilder addInt$default(DataBuilder dataBuilder, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 2;
        }
        return dataBuilder.addInt(i, i2);
    }

    @NotNull
    public final DataBuilder addByte(byte data, int dataByteSize) {
        if (dataByteSize == 1) {
            this.dataStream.write(data);
        } else {
            addInt(data, dataByteSize);
        }
        return this;
    }

    @NotNull
    public final DataBuilder addBytes(@NotNull byte... data) {
        this.dataStream.write(data);
        return this;
    }

    @NotNull
    public final DataBuilder addInt(int data, int dataByteSize) {
        this.dataStream.write(ByteUtilsKt.toByteArray(data, dataByteSize));
        return this;
    }

    @NotNull
    public final DataBuilder addOperation(@NotNull Operation operation) {
        return operation.getOpCodeByteSize() == 1 ? addByte$default(this, (byte) operation.getOpCode(), 0, 2, null) : addInt(operation.getOpCode(), operation.getOpCodeByteSize());
    }

    @NotNull
    public final byte[] build() {
        return this.dataStream.toByteArray();
    }

    public final void reset() {
        this.dataStream.reset();
    }

    @NotNull
    public String toString() {
        return this.dataStream.toString();
    }
}
