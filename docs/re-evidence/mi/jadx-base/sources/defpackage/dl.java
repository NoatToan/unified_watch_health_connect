package defpackage;

import androidx.health.connect.client.records.OvulationTestRecord;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u001e\u0010\u0004\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003¨\u0006\u000b"}, d2 = {"", "low", OvulationTestRecord.Result.HIGH, "", PluginDeviceInfo.FMODEL, "element", "startIndex", "", "data", "stopIndex", "", "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class dl {
    public static final int a(byte b2, byte b3) {
        return (b2 & 255) | ((b3 & 255) << 8);
    }

    public static final int a(byte b2, int i, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return a(b2, i, data.length, data);
    }

    public static final int a(byte b2, int i, int i2, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length != 0 && i <= i2 && i >= 0 && i2 <= data.length) {
            while (i < i2) {
                if (data[i] == b2) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static final int a(@NotNull byte[] data, int i) {
        Intrinsics.checkNotNullParameter(data, "data");
        return a((byte) 0, i, data);
    }

    @NotNull
    public static final String a(@NotNull byte[] data, int i, int i2) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArr = new byte[i2 - i];
        ArraysKt___ArraysJvmKt.copyInto(data, bArr, 0, i, i2);
        return new String(bArr, Charsets.UTF_8);
    }
}
