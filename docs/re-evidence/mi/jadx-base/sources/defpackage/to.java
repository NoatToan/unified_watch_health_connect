package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\"\u0010\u0012\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001b"}, d2 = {"Lto;", "Ljq$a;", "", "aBool", "withBoolean", "", "byteArray", "withBytes", "", "byte", "withByte", "value", "withShort", "withInt", "", "str", "withString", "toString", "bytes", "[B", "getBytes", "()[B", PluginDeviceInfo.FMODEL, "([B)V", "()Ljava/lang/String;", "commandName", "<init>", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class to extends jq.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public byte[] f34884a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to(@NotNull byte[] bytes) {
        super(bytes);
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f34884a = bytes;
    }

    @NotNull
    public abstract String a();

    public void a(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.f34884a = bArr;
    }

    @Override // jq.a
    @NotNull
    /* JADX INFO: renamed from: getBytes, reason: from getter */
    public byte[] getF34884a() {
        return this.f34884a;
    }

    @Override // jq.a
    @NotNull
    public String toString() {
        return a() + "[bytes=" + tet.x(getF34884a()) + AbstractJsonLexerKt.END_LIST;
    }

    @Override // jq.a
    @NotNull
    public jq.a withBoolean(boolean aBool) {
        a(ArraysKt___ArraysJvmKt.plus(getF34884a(), c3.a(aBool)));
        return this;
    }

    @Override // jq.a
    @NotNull
    public jq.a withByte(int i) {
        a(ArraysKt___ArraysJvmKt.plus(getF34884a(), (byte) i));
        return this;
    }

    @Override // jq.a
    @NotNull
    public jq.a withBytes(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        a(ArraysKt___ArraysJvmKt.plus(getF34884a(), byteArray));
        return this;
    }

    @Override // jq.a
    @NotNull
    public jq.a withInt(int value) {
        byte[] f34884a = getF34884a();
        byte[] bArrR = tet.r(value, 4);
        Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(value.toLong(), 4)");
        a(ArraysKt___ArraysJvmKt.plus(f34884a, bArrR));
        return this;
    }

    @Override // jq.a
    @NotNull
    public jq.a withShort(int value) {
        byte[] f34884a = getF34884a();
        byte[] bArrR = tet.r(value, 2);
        Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(value.toLong(), 2)");
        a(ArraysKt___ArraysJvmKt.plus(f34884a, bArrR));
        return this;
    }

    @Override // jq.a
    @NotNull
    public jq.a withString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        byte[] f34884a = getF34884a();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        a(ArraysKt___ArraysJvmKt.plus(f34884a, ArraysKt___ArraysJvmKt.plus(bytes, new byte[]{0})));
        return this;
    }
}
