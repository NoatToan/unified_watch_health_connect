package com.xiaomi.fitness.sport_export;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.miui.circulate.device.api.DeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.onetrack.api.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rH&¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport_export/IJustDanceApi;", "", "gotoLaunchActivity", "", "context", "Landroid/content/Context;", "gotoControlActivity", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", DeviceInfo.Builder.PrivateDataKey.IP, "", b.F, "fromLaunch", "", "Companion", "sport-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IJustDanceApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_export/IJustDanceApi$Companion;", "", "<init>", "()V", "sport-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void gotoControlActivity$default(IJustDanceApi iJustDanceApi, FragmentActivity fragmentActivity, String str, String str2, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoControlActivity");
            }
            if ((i & 8) != 0) {
                z = false;
            }
            iJustDanceApi.gotoControlActivity(fragmentActivity, str, str2, z);
        }
    }

    void gotoControlActivity(@NotNull FragmentActivity activity, @NotNull String ip, @NotNull String port, boolean fromLaunch);

    void gotoLaunchActivity(@NotNull Context context);
}
