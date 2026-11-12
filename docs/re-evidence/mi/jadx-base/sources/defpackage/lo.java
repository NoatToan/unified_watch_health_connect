package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"", "status", "Lko;", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class lo {
    @NotNull
    public static final PairStatus a(int i) {
        if (i == 0) {
            return new kv();
        }
        if (i == 1) {
            return new mo();
        }
        if (i == 2) {
            return new no();
        }
        if (i != 3 && i == 4) {
            return new io();
        }
        return new jo();
    }
}
