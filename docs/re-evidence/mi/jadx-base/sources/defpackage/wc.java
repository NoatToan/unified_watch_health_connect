package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¨\u0006\u0003"}, d2 = {"", "Lvc;", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class wc {
    @Nullable
    public static final GenericResponse a(@Nullable byte[] bArr) {
        if (bArr == null || bArr.length < 5) {
            return null;
        }
        return new GenericResponse(c3.a(bArr, 0, 0, 3, null), c3.a(bArr, 1, 4), ArraysKt___ArraysJvmKt.copyOfRange(bArr, 5, bArr.length));
    }
}
