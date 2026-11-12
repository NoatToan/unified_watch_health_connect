package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lev;", "", "", LifecycleConstantKt.ON_START, "", BroadcastsKt.SILENT_PUSHING_PROGRESS, PluginDeviceInfo.FDESC, "", "throwable", PluginDeviceInfo.FMODEL, "errorCode", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface ev {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public static void a(@NotNull ev evVar, int i) {
        }
    }

    void a(int errorCode);

    void a(@NotNull Throwable throwable);

    void b(int progress);

    void onStart();
}
