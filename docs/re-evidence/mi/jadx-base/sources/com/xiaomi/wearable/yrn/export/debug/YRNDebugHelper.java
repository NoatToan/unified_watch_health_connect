package com.xiaomi.wearable.yrn.export.debug;

import android.app.Activity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.wearable.yrn.export.data.YRNBundleData;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u001e\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/wearable/yrn/export/debug/YRNDebugHelper;", "", "switchEnv", "", "env", "", "rnDebugEntry", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "getLoadedBundleInfoMap", "", "Lcom/xiaomi/wearable/yrn/export/data/YRNBundleData;", "appName", "Companion", "yrn-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface YRNDebugHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/wearable/yrn/export/debug/YRNDebugHelper$Companion;", "", "<init>", "()V", "yrn-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Nullable
    Map<String, YRNBundleData> getLoadedBundleInfoMap(@NotNull String appName);

    void rnDebugEntry(@NotNull Activity activity);

    void switchEnv(@NotNull String env);
}
