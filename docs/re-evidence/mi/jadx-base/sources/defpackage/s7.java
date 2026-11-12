package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Ls7;", "", "", "", "dialIds", "", PluginDeviceInfo.FMODEL, "dialId", "", "imageSize", PluginDeviceInfo.FDESC, "Lf8;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface s7 {
    @Nullable
    DialVersion a();

    boolean a(int dialId, long imageSize);

    boolean a(@NotNull List<Integer> dialIds);

    @NotNull
    List<Integer> b();
}
