package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.nio.charset.Charset;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0005B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\tR#\u0010\u0017\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u001b"}, d2 = {"Lw2;", "", "", "byteArray", "", PluginDeviceInfo.FMODEL, "", MediaStoreUtil.MediaInfo.SIZE, PluginDeviceInfo.FICONON, "", PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FDESC, "", PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FLOCALIZATIONS, "", PluginDeviceInfo.FICONOFFLINE, "h", "Lio/netty/buffer/ByteBuf;", "kotlin.jvm.PlatformType", "buf$delegate", "Lkotlin/Lazy;", "()Lio/netty/buffer/ByteBuf;", "buf", "bufSize", "<init>", "([BI)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class w2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f37464b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f37465a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lw2$a;", "", "", "BITS", "I", "BUF_SIZE", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/netty/buffer/ByteBuf;", "kotlin.jvm.PlatformType", PluginDeviceInfo.FMODEL, "()Lio/netty/buffer/ByteBuf;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<ByteBuf> {
        public final /* synthetic */ int t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.t = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteBuf invoke() {
            return Unpooled.buffer(this.t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w2() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ int b(w2 w2Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 4;
        }
        return w2Var.c(i);
    }

    public final ByteBuf a() {
        return (ByteBuf) this.f37465a.getValue();
    }

    public final int c(int size) {
        if (a().readableBytes() < size) {
            throw new IndexOutOfBoundsException("No enough data remain");
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i |= (a().readByte() & 255) << (i2 * 8);
        }
        return i;
    }

    public final long d(int size) {
        if (a().readableBytes() < size) {
            throw new IndexOutOfBoundsException("No enough data remain");
        }
        long j = 0;
        for (int i = 0; i < size; i++) {
            j |= (((long) a().readByte()) & 255) << (i * 8);
        }
        return j;
    }

    public final int e() {
        return c(2);
    }

    @NotNull
    public final String f() {
        if (a().readableBytes() <= 0) {
            return "";
        }
        int iBytesBefore = a().bytesBefore((byte) 0);
        if (iBytesBefore == 0) {
            a().readByte();
            return "";
        }
        if (iBytesBefore < 0) {
            return "";
        }
        ByteBuf bytes = a().readBytes(iBytesBefore);
        a().readByte();
        String string = bytes.toString(Charset.forName("utf-8"));
        Intrinsics.checkNotNullExpressionValue(string, "bytes.toString(Charset.forName(\"utf-8\"))");
        return string;
    }

    public final int g() {
        return a().readByte();
    }

    public final int h() {
        return a().readableBytes();
    }

    public w2(@NotNull byte[] byteArray, int i) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        this.f37465a = LazyKt__LazyJVMKt.lazy(new b(i));
        a(byteArray);
    }

    public final void a(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        a().writeBytes(byteArray);
    }

    @NotNull
    public final byte[] b(int size) {
        byte[] bArr = size <= h() ? new byte[size] : new byte[h()];
        a().readBytes(bArr);
        return bArr;
    }

    public static /* synthetic */ byte[] a(w2 w2Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return w2Var.a(i);
    }

    @NotNull
    public final byte[] a(int size) {
        byte[] bArr;
        if (size > 0) {
            bArr = new byte[size];
        } else {
            bArr = new byte[h()];
        }
        a().readBytes(bArr);
        return bArr;
    }

    public final int c() {
        return c(1);
    }

    @NotNull
    public final String d() {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : a(this, 0, 1, null)) {
            stringBuffer.append((char) b2);
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public /* synthetic */ w2(byte[] bArr, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new byte[0] : bArr, (i2 & 2) != 0 ? 128 : i);
    }

    public final boolean b() {
        return c() == 1;
    }
}
