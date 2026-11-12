package com.xiaomi.xms.wearable.ui.appshop.manager;

import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0004J\b\u0010\u0010\u001a\u00020\u000bH&J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppTask;", "", "packageName", "", "<init>", "(Ljava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "mName", "getMName", "updateStatus", "", "status", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "errMsg", StatConstants.PARAM_START, "onTaskFinished", "success", "", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AppTask {

    @NotNull
    private final String mName;

    @NotNull
    private final String packageName;

    public AppTask(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.packageName = packageName;
        this.mName = getClass().getSimpleName() + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + packageName;
    }

    public static /* synthetic */ void updateStatus$default(AppTask appTask, int i, int i2, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateStatus");
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            str = null;
        }
        appTask.updateStatus(i, i2, str);
    }

    @NotNull
    public final String getMName() {
        return this.mName;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public abstract void onTaskFinished(boolean success);

    public abstract void start();

    public final void updateStatus(int status, int progress, @Nullable String errMsg) {
        AppStatusManager.INSTANCE.updateStatus(this.packageName, status, progress, errMsg);
    }
}
