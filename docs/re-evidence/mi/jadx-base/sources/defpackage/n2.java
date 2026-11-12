package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0002H&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&J\n\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0011"}, d2 = {"Ln2;", "", "", "init", "deInit", "Lw5;", "callback", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FICONOFF, "", "data", "Lqe;", PluginDeviceInfo.FICONON, "", "timeout", PluginDeviceInfo.FDESC, "i", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface n2 {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Nullable
        public static qe a(@NotNull n2 n2Var, @NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return n2Var.b(data, 5000);
        }

        @Nullable
        public static byte[] a(@NotNull n2 n2Var) {
            return n2Var.a(5000);
        }
    }

    boolean a(@NotNull w5 callback);

    @Nullable
    byte[] a(int timeout);

    @Nullable
    qe b(@NotNull byte[] data, int timeout);

    boolean b(@NotNull byte[] data);

    @Nullable
    qe c(@NotNull byte[] data);

    boolean d();

    boolean deInit();

    @Nullable
    byte[] i();

    boolean init();
}
