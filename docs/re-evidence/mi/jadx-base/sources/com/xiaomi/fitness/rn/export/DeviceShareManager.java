package com.xiaomi.fitness.rn.export;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/rn/export/DeviceShareManager;", "", "gotoDeviceShareListActivity", "", "context", "Landroid/content/Context;", "sonPage", "", "gotoDeviceShareDetailActivity", "did", "checkDeviceShareDialog", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "Companion", "export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceShareManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/rn/export/DeviceShareManager$Companion;", "", "<init>", "()V", "export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void gotoDeviceShareListActivity$default(DeviceShareManager deviceShareManager, Context context, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoDeviceShareListActivity");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            deviceShareManager.gotoDeviceShareListActivity(context, str);
        }
    }

    void checkDeviceShareDialog(@NotNull FragmentActivity activity);

    void gotoDeviceShareDetailActivity(@NotNull Context context, @NotNull String did);

    void gotoDeviceShareListActivity(@NotNull Context context, @Nullable String sonPage);
}
