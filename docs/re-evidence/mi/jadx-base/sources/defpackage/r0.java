package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"", "", PluginDeviceInfo.FMODEL, "([B)Ljava/lang/Integer;", "", "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class r0 {
    public static final int a(byte b2) {
        return b2 & 255;
    }

    @Nullable
    public static final Integer a(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length < 2) {
            return null;
        }
        return Integer.valueOf(bArr[1] & 255);
    }
}
