package com.xiaomi.fitness.main.export;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.mine.export.IWebSync;
import defpackage.av6;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000 $2\u00020\u0001:\u0001$J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H&¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/main/export/MainHelper;", "", "", "isMainActivityOnTop", "()Z", "", "durationSec", "", "name", "titleName", "", "onetrackRecordTabShowTime", "(JLjava/lang/String;Ljava/lang/String;)V", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lav6;", "dialogCallback", "showSyncWebDialog", "(Landroidx/fragment/app/FragmentActivity;Lav6;)V", "Lcom/xiaomi/fitness/mine/export/IWebSync;", "iWebSync", "showSportHealthCloudSynDialogIfNeed", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/mine/export/IWebSync;)V", "userId", "shareUserId", "shareId", "pIcon", "showDeviceShareDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMainActivityName", "()Ljava/lang/String;", "mainActivityName", "", "getPlayChannelSyncDialogDescStringRes", "()I", "playChannelSyncDialogDescStringRes", "Companion", "main-export_release"}, k = 1, mv = {2, 0, 0})
public interface MainHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/main/export/MainHelper$Companion;", "", "<init>", "()V", "main-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @NotNull
    String getMainActivityName();

    int getPlayChannelSyncDialogDescStringRes();

    boolean isMainActivityOnTop();

    void onetrackRecordTabShowTime(long durationSec, @NotNull String name, @NotNull String titleName);

    void showDeviceShareDialog(@NotNull String userId, @NotNull String shareUserId, @NotNull String shareId, @NotNull String pIcon);

    void showSportHealthCloudSynDialogIfNeed(@NotNull FragmentActivity activity, @NotNull IWebSync iWebSync);

    @Deprecated(message = "use showSportHealthCloudSynDialogIfNeed instead")
    void showSyncWebDialog(@Nullable FragmentActivity activity, @NotNull av6 dialogCallback);
}
