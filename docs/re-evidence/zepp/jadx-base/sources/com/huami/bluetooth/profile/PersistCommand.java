package com.huami.bluetooth.profile;

import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.text.Charsets;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\"\u0010\u0018\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u000e8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/bluetooth/profile/PersistCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "aBool", "withBoolean", "", "byteArray", "withBytes", "", "byte", "withByte", "value", "withShort", "withInt", "", "str", "withString", "toString", "b", "[B", "getBytes", "()[B", "setBytes", "([B)V", HTTP.CONTENT_RANGE_BYTES, "getCommandName", "()Ljava/lang/String;", "commandName", "<init>", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class PersistCommand extends Request.Command {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private byte[] bytes;

    public PersistCommand(@NotNull byte[] bArr) {
        super(bArr);
        this.bytes = bArr;
    }

    @Override // com.huami.bluetooth.profile.Request.Command
    @NotNull
    public byte[] getBytes() {
        return this.bytes;
    }

    @NotNull
    public abstract String getCommandName();

    public void setBytes(@NotNull byte[] bArr) {
        this.bytes = bArr;
    }

    @Override // com.huami.bluetooth.profile.Request.Command
    @NotNull
    public String toString() {
        return getCommandName() + "[bytes=" + ((Object) GattUtils.bytesToHexString(getBytes())) + JsonLexerKt.END_LIST;
    }

    @Override // com.huami.bluetooth.profile.Request.Command
    @NotNull
    public Request.Command withBoolean(boolean aBool) {
        setBytes(ArraysKt___ArraysJvmKt.plus(getBytes(), ByteUtilsKt.toByte(aBool)));
        return this;
    }

    @Override // com.huami.bluetooth.profile.Request.Command
    @NotNull
    public Request.Command withByte(int i) {
        setBytes(ArraysKt___ArraysJvmKt.plus(getBytes(), (byte) i));
        return this;
    }

    @Override // com.huami.bluetooth.profile.Request.Command
    @NotNull
    public Request.Command withBytes(@NotNull byte[] byteArray) {
        setBytes(ArraysKt___ArraysJvmKt.plus(getBytes(), byteArray));
        return this;
    }

    @Override // com.huami.bluetooth.profile.Request.Command
    @NotNull
    public Request.Command withInt(int value) {
        setBytes(ArraysKt___ArraysJvmKt.plus(getBytes(), GattUtils.numberToBytes(value, 4)));
        return this;
    }

    @Override // com.huami.bluetooth.profile.Request.Command
    @NotNull
    public Request.Command withShort(int value) {
        setBytes(ArraysKt___ArraysJvmKt.plus(getBytes(), GattUtils.numberToBytes(value, 2)));
        return this;
    }

    @Override // com.huami.bluetooth.profile.Request.Command
    @NotNull
    public Request.Command withString(@NotNull String str) {
        setBytes(ArraysKt___ArraysJvmKt.plus(getBytes(), ArraysKt___ArraysJvmKt.plus(str.getBytes(Charsets.UTF_8), new byte[]{0})));
        return this;
    }
}
