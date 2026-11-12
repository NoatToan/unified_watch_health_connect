package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¨\u0006\u0007"}, d2 = {"", "", "offset", PluginDeviceInfo.FMODEL, "", PluginDeviceInfo.FDESC, "len", "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class ql {
    public static final int a(@NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i >= 0 && i < bArr.length) {
            int length = bArr.length;
            while (i < length) {
                if (bArr[i] == 0) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Nullable
    public static final String b(@NotNull byte[] bArr, int i) {
        int iA;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i < bArr.length && (iA = a(bArr, i)) >= 0) {
            return a(bArr, i, iA - i);
        }
        return null;
    }

    public static /* synthetic */ String a(byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return b(bArr, i);
    }

    @Nullable
    public static final String a(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i >= bArr.length) {
            return null;
        }
        if (i2 == 0) {
            return "";
        }
        if (i + i2 >= bArr.length) {
            return null;
        }
        return new String(bArr, i, i2, Charsets.UTF_8);
    }
}
