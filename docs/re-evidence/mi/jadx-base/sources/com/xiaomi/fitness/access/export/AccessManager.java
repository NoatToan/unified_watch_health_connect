package com.xiaomi.fitness.access.export;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.access.export.bean.MiSportData;
import com.xiaomi.fitness.access.export.listener.OnDialogItemClickListener;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 -2\u00020\u0001:\u0001-J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\n\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\fH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 H&J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\"H&J*\u0010#\u001a\u00020\u00032\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030&H&J\b\u0010'\u001a\u00020\u0019H&J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0016\u0010)\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010*J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H&¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/access/export/AccessManager;", "", "gotoAccessActivity", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "gotoWechatActivity", "gotoAlipayActivity", "gotoStravaActivity", "gotoMiSportImportActivity", "getMiSportLastMigrateStatus", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportStatus;", "setMisportImportState", "state", "", "getMisportImportState", "gotoWechatAccessDeviceManagerActivity", "context", "Landroid/content/Context;", "goToWechatSportSettingsNoDeviceActivity", "goToWechatDeviceActivity", "getWechatSupportBindDeviceLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "goToGoogleFitActivity", "goToSuuntoAccessActivity", "showPrivacyStorageDialog", "Landroidx/fragment/app/FragmentActivity;", "permissionDes", "clickListener", "Lcom/xiaomi/fitness/access/export/listener/OnDialogItemClickListener;", "getShowGoogleFitEntranceLiveData", "Landroidx/lifecycle/LiveData;", "getWechatBindStatus", "onSuccess", "onError", "Lkotlin/Function0;", "isHealthConnectSupported", "isHealthConnectInstalled", "isHealthConnectAuthed", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gotoHealthConnectIntroductionActivity", "gotoHealthConnectPermissionInfoActivity", "Companion", "access-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AccessManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/access/export/AccessManager$Companion;", "", "<init>", "()V", "access-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void getMiSportLastMigrateStatus(@NotNull Function1<? super MiSportData.MiSportStatus, Unit> success);

    int getMisportImportState();

    @NotNull
    LiveData<Boolean> getShowGoogleFitEntranceLiveData();

    void getWechatBindStatus(@NotNull Function1<? super Boolean, Unit> onSuccess, @NotNull Function0<Unit> onError);

    @NotNull
    MutableLiveData<Boolean> getWechatSupportBindDeviceLiveData(@NotNull Activity activity);

    void goToGoogleFitActivity(@NotNull Activity activity);

    void goToSuuntoAccessActivity(@NotNull Activity activity);

    void goToWechatDeviceActivity(@NotNull Activity activity);

    void goToWechatSportSettingsNoDeviceActivity(@NotNull Context context);

    void gotoAccessActivity(@NotNull Activity activity);

    void gotoAlipayActivity(@NotNull Activity activity);

    void gotoHealthConnectIntroductionActivity(@NotNull Context context);

    void gotoHealthConnectPermissionInfoActivity(@NotNull Activity context);

    void gotoMiSportImportActivity(@NotNull Activity activity);

    void gotoStravaActivity(@NotNull Activity activity);

    void gotoWechatAccessDeviceManagerActivity(@NotNull Context context);

    void gotoWechatActivity(@NotNull Activity activity);

    @Nullable
    Object isHealthConnectAuthed(@NotNull Context context, @NotNull Continuation<? super Boolean> continuation);

    boolean isHealthConnectInstalled(@NotNull Context context);

    boolean isHealthConnectSupported();

    void setMisportImportState(int state);

    void showPrivacyStorageDialog(@NotNull FragmentActivity activity, int permissionDes, @NotNull OnDialogItemClickListener clickListener);
}
