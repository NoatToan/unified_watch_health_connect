package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0005B\u001b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Ljq;", "", "", "bytes", "[B", PluginDeviceInfo.FMODEL, "()[B", "", "cmdLen", "I", PluginDeviceInfo.FDESC, "()I", "Ljq$a;", "command", "body", "<init>", "(Ljq$a;[B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class jq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f23009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23010b;

    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aB\u001d\b\u0016\u0012\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u001b\"\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001cB\u001d\b\u0016\u0012\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u001b\"\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010 B\u0019\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010!J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Ljq$a;", "", "", "aBool", "withBoolean", "", "byteArray", "withBytes", "", "byte", "withByte", "value", "withShort", "withInt", "", "str", "withString", "toString", "bytes", "[B", "getBytes", "()[B", "getLength", "()I", "length", "<init>", "([B)V", "", "([[B)V", "commands", "([Ljq$a;)V", "command", "([BLjq$a;)V", "(Ljq$a;[B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static class a {

        @NotNull
        private final byte[] bytes;

        public a(@NotNull byte[] bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            this.bytes = bytes;
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
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "this.javaClass.simpleName");
            return simpleName;
        }

        @NotNull
        public a withBoolean(boolean aBool) {
            return new a(ArraysKt___ArraysJvmKt.plus(getBytes(), new byte[]{c3.a(aBool)}));
        }

        @NotNull
        public a withByte(int i) {
            return new a(ArraysKt___ArraysJvmKt.plus(getBytes(), new byte[]{(byte) i}));
        }

        @NotNull
        public a withBytes(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            return new a(ArraysKt___ArraysJvmKt.plus(getBytes(), byteArray));
        }

        @NotNull
        public a withInt(int value) {
            byte[] bytes = getBytes();
            byte[] bArrR = tet.r(value, 4);
            Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(value.toLong(), 4)");
            return new a(ArraysKt___ArraysJvmKt.plus(bytes, bArrR));
        }

        @NotNull
        public a withShort(int value) {
            byte[] bytes = getBytes();
            byte[] bArrR = tet.r(value, 2);
            Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(value.toLong(), 2)");
            return new a(ArraysKt___ArraysJvmKt.plus(bytes, bArrR));
        }

        @NotNull
        public a withString(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "str");
            byte[] bytes = getBytes();
            byte[] bytes2 = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            return new a(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(bytes, bytes2), new byte[]{0}));
        }

        public a(@NotNull byte[]... bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr : bytes) {
                byteArrayOutputStream.write(bArr, 0, bArr.length);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "ByteArrayOutputStream().…}\n        }.toByteArray()");
            this(byteArray);
        }

        public a(@NotNull a... commands) {
            Intrinsics.checkNotNullParameter(commands, "commands");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (a aVar : commands) {
                byte[] bytes = aVar.getBytes();
                byteArrayOutputStream.write(bytes, 0, bytes.length);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "ByteArrayOutputStream().…}\n        }.toByteArray()");
            this(byteArray);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull byte[] bytes, @NotNull a command) {
            this(bytes, command.getBytes());
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            Intrinsics.checkNotNullParameter(command, "command");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull a command, @NotNull byte[] bytes) {
            this(command.getBytes(), bytes);
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
        }
    }

    public jq(@Nullable a aVar, @Nullable byte[] bArr) {
        this.f23010b = aVar != null ? aVar.getLength() : 0;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (aVar != null) {
            byteArrayOutputStream.write(aVar.getBytes(), 0, aVar.getLength());
        }
        if (bArr != null) {
            byteArrayOutputStream.write(bArr, 0, bArr.length);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "ByteArrayOutputStream().…  toByteArray()\n        }");
        this.f23009a = byteArray;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getF23009a() {
        return this.f23009a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF23010b() {
        return this.f23010b;
    }
}
