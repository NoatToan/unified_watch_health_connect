package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lc5;", "", "", "data", "", "inputFinish", PluginDeviceInfo.FMODEL, "compress_release"}, k = 1, mv = {1, 4, 1})
public interface c5 {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    public static final class a {
        public static /* synthetic */ byte[] a(c5 c5Var, byte[] bArr, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decompress");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return c5Var.a(bArr, z);
        }
    }

    @NotNull
    byte[] a(@NotNull byte[] data, boolean inputFinish);
}
