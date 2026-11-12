package com.huami.bluetooth.profile;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.text.Charsets;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0014B\t\b\u0016¢\u0006\u0004\b\u0011\u0010\u0015R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/profile/Request;", "", "", "a", "[B", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "", "b", LogUtil.I, "getCmdLen", "()I", "cmdLen", "Lcom/huami/bluetooth/profile/Request$Command;", "command", "body", "<init>", "(Lcom/huami/bluetooth/profile/Request$Command;[B)V", "(Lcom/huami/bluetooth/profile/Request$Command;)V", "([B)V", "()V", "Command", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class Request {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final byte[] bytes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cmdLen;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bB\u001d\b\u0016\u0012\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u001c\"\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001dB\u001d\b\u0016\u0012\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u001c\"\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010!B\u0019\b\u0016\u0012\u0006\u0010 \u001a\u00020\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\"J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\u001c\u0010\u0016\u001a\u00020\u00058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0019\u001a\u00020\b8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", "", "", "aBool", "withBoolean", "", "byteArray", "withBytes", "", "byte", "withByte", "value", "withShort", "withInt", "", "str", "withString", "toString", "a", "[B", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "getLength", "()I", SessionDescription.p, "<init>", "([B)V", "", "([[B)V", "commands", "([Lcom/huami/bluetooth/profile/Request$Command;)V", "command", "([BLcom/huami/bluetooth/profile/Request$Command;)V", "(Lcom/huami/bluetooth/profile/Request$Command;[B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static class Command {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final byte[] bytes;

        public Command(@NotNull byte[] bArr) {
            this.bytes = bArr;
        }

        @NotNull
        public byte[] getBytes() {
            return this.bytes;
        }

        public final int getLength() {
            return getBytes().length;
        }

        @NotNull
        public String toString() {
            return getClass().getSimpleName();
        }

        @NotNull
        public Command withBoolean(boolean aBool) {
            return new Command(ArraysKt___ArraysJvmKt.plus(getBytes(), new byte[]{ByteUtilsKt.toByte(aBool)}));
        }

        @NotNull
        public Command withByte(int i) {
            return new Command(ArraysKt___ArraysJvmKt.plus(getBytes(), new byte[]{(byte) i}));
        }

        @NotNull
        public Command withBytes(@NotNull byte[] byteArray) {
            return new Command(ArraysKt___ArraysJvmKt.plus(getBytes(), byteArray));
        }

        @NotNull
        public Command withInt(int value) {
            return new Command(ArraysKt___ArraysJvmKt.plus(getBytes(), GattUtils.numberToBytes(value, 4)));
        }

        @NotNull
        public Command withShort(int value) {
            return new Command(ArraysKt___ArraysJvmKt.plus(getBytes(), GattUtils.numberToBytes(value, 2)));
        }

        @NotNull
        public Command withString(@NotNull String str) {
            return new Command(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(getBytes(), str.getBytes(Charsets.UTF_8)), new byte[]{0}));
        }

        public Command(@NotNull byte[]... bArr) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                byteArrayOutputStream.write(bArr2, 0, bArr2.length);
            }
            Unit unit = Unit.INSTANCE;
            this(byteArrayOutputStream.toByteArray());
        }

        public Command(@NotNull Command... commandArr) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (Command command : commandArr) {
                byte[] bytes = command.getBytes();
                byteArrayOutputStream.write(bytes, 0, bytes.length);
            }
            Unit unit = Unit.INSTANCE;
            this(byteArrayOutputStream.toByteArray());
        }

        public Command(@NotNull byte[] bArr, @NotNull Command command) {
            this(bArr, command.getBytes());
        }

        public Command(@NotNull Command command, @NotNull byte[] bArr) {
            this(command.getBytes(), bArr);
        }
    }

    public Request(@Nullable Command command, @Nullable byte[] bArr) {
        this.cmdLen = command == null ? 0 : command.getLength();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (command != null) {
            byteArrayOutputStream.write(command.getBytes(), 0, command.getLength());
        }
        if (bArr != null) {
            byteArrayOutputStream.write(bArr, 0, bArr.length);
        }
        this.bytes = byteArrayOutputStream.toByteArray();
    }

    @NotNull
    public final byte[] getBytes() {
        return this.bytes;
    }

    public final int getCmdLen() {
        return this.cmdLen;
    }

    public Request(@NotNull Command command) {
        this(command, null);
    }

    public Request(@NotNull byte[] bArr) {
        this(null, bArr);
    }

    public Request() {
        this(null, null);
    }
}
