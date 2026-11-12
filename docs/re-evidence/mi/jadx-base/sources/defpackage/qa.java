package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¨\u0006\u0003"}, d2 = {"", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class qa {
    public static final long a(@Nullable String str) {
        if (str != null && str.length() != 0) {
            File file = new File(str);
            if (file.exists()) {
                return file.length();
            }
        }
        return 0L;
    }
}
