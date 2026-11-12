package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lga;", "", "Laa;", "fileInfo", "Lev;", "transferListener", "", "withCompress", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface ga {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public static void a(@NotNull ga gaVar, @NotNull FileInfo fileInfo, @NotNull ev transferListener) {
            Intrinsics.checkNotNullParameter(fileInfo, "fileInfo");
            Intrinsics.checkNotNullParameter(transferListener, "transferListener");
            gaVar.a(fileInfo, transferListener, true);
        }
    }

    void a(@NotNull FileInfo fileInfo, @NotNull ev transferListener);

    void a(@NotNull FileInfo fileInfo, @NotNull ev transferListener, boolean withCompress);
}
