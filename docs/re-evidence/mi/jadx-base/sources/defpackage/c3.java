package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0000*\u00020\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0006*\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001\u001a \u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001\u001a \u0010\u0002\u001a\u00020\b*\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001¨\u0006\t"}, d2 = {"", "", PluginDeviceInfo.FDESC, "", PluginDeviceInfo.FMODEL, "bits", "", "offset", "", "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class c3 {
    public static final byte a(boolean z) {
        return z ? (byte) 1 : (byte) 0;
    }

    public static final int b(boolean z) {
        return z ? 1 : 0;
    }

    public static final boolean a(byte b2) {
        return b2 == 1;
    }

    public static final long b(@Nullable byte[] bArr, int i, int i2) {
        return tet.v(bArr, i2, i);
    }

    @NotNull
    public static final byte[] a(int i, int i2) {
        byte[] bArrR = tet.r(i, i2);
        Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(this.toLong(), bits)");
        return bArrR;
    }

    public static /* synthetic */ long b(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 4;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return b(bArr, i, i2);
    }

    public static /* synthetic */ byte[] a(int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 4;
        }
        return a(i, i2);
    }

    public static final int a(@Nullable byte[] bArr, int i, int i2) {
        return tet.d(bArr, i2, i);
    }

    public static /* synthetic */ int a(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 4;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return a(bArr, i, i2);
    }
}
