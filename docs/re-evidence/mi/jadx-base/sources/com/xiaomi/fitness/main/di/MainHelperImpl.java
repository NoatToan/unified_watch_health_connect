package com.xiaomi.fitness.main.di;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fitness.about.utils.MainCommonAppUrlsKt;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceTool;
import com.xiaomi.fitness.electronic.scale.export.EcoDialogHelper;
import com.xiaomi.fitness.electronic.scale.export.EcoShareDialogExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.InviteCallback;
import com.xiaomi.fitness.main.MainActivity;
import com.xiaomi.fitness.main.export.MainHelper;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.mine.export.IWebSync;
import defpackage.av6;
import defpackage.h0j;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/main/di/MainHelperImpl;", "Lcom/xiaomi/fitness/main/export/MainHelper;", "", "isMainActivityOnTop", "()Z", "", "durationSec", "", "name", "titleName", "", "onetrackRecordTabShowTime", "(JLjava/lang/String;Ljava/lang/String;)V", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lav6;", "dialogCallback", "showSyncWebDialog", "(Landroidx/fragment/app/FragmentActivity;Lav6;)V", "Lcom/xiaomi/fitness/mine/export/IWebSync;", "iWebSync", "showSportHealthCloudSynDialogIfNeed", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/mine/export/IWebSync;)V", "userId", "shareUserId", "shareId", "pIcon", "showDeviceShareDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mainActivityName", "Ljava/lang/String;", "getMainActivityName", "()Ljava/lang/String;", "", "getPlayChannelSyncDialogDescStringRes", "()I", "playChannelSyncDialogDescStringRes", "<init>", "()V", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MainHelperImpl implements MainHelper {

    @NotNull
    private final String mainActivityName;

    public MainHelperImpl() {
        String name = MainActivity.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        this.mainActivityName = name;
    }

    @Override // com.xiaomi.fitness.main.export.MainHelper
    @NotNull
    public String getMainActivityName() {
        return this.mainActivityName;
    }

    @Override // com.xiaomi.fitness.main.export.MainHelper
    public int getPlayChannelSyncDialogDescStringRes() {
        return h0j.o;
    }

    @Override // com.xiaomi.fitness.main.export.MainHelper
    public boolean isMainActivityOnTop() {
        return AppManager.INSTANCE.getInstance().getCurrentActivity() instanceof MainActivity;
    }

    @Override // com.xiaomi.fitness.main.export.MainHelper
    public void onetrackRecordTabShowTime(long durationSec, @NotNull String name, @NotNull String titleName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(titleName, "titleName");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.0.0.0.20983"), "name", name, "title", titleName, "duration_sec", Long.valueOf(durationSec));
    }

    @Override // com.xiaomi.fitness.main.export.MainHelper
    public void showDeviceShareDialog(@NotNull final String userId, @NotNull final String shareUserId, @NotNull final String shareId, @NotNull String pIcon) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(shareUserId, "shareUserId");
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(pIcon, "pIcon");
        final Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity instanceof MainActivity) {
            EcoShareDialogExtKt.getInstance(EcoDialogHelper.INSTANCE).showDialog((FragmentActivity) currentActivity, userId, pIcon, new InviteCallback() { // from class: com.xiaomi.fitness.main.di.MainHelperImpl.showDeviceShareDialog.1
                @Override // com.xiaomi.fitness.electronic.scale.export.InviteCallback
                public void onAccepted() {
                    ElectronicScaleShareHelperExtKt.getInstance(ElectronicScaleShareHelper.INSTANCE).updateShareStatus(userId, shareUserId, shareId, 1);
                    TabLayout.g gVarX = ((MainActivity) currentActivity).getMainTlBottom().x(2);
                    Intrinsics.checkNotNull(gVarX, "null cannot be cast to non-null type com.google.android.material.tabs.TabLayout.Tab");
                    gVarX.m();
                    DeviceManagerExtKt.getInstance(DeviceTool.INSTANCE).selectOtherDeviceTab(((MainTab) CollectionsKt___CollectionsKt.elementAt(((MainActivity) currentActivity).getMMainTabs(), 1)).getFragment());
                }

                @Override // com.xiaomi.fitness.electronic.scale.export.InviteCallback
                public void onDenied() {
                    ElectronicScaleShareHelperExtKt.getInstance(ElectronicScaleShareHelper.INSTANCE).updateShareStatus(userId, shareUserId, shareId, 2);
                }
            });
            return;
        }
        Logger.e("ElectronicScaleShareHelper, currentActivity !is MainActivity, currentActivity: " + currentActivity, new Object[0]);
    }

    @Override // com.xiaomi.fitness.main.export.MainHelper
    public void showSportHealthCloudSynDialogIfNeed(@NotNull FragmentActivity activity, @NotNull IWebSync iWebSync) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(iWebSync, "iWebSync");
        MainCommonAppUrlsKt.showSportHealthDialogIfNeed(activity, iWebSync);
    }

    @Override // com.xiaomi.fitness.main.export.MainHelper
    public void showSyncWebDialog(@Nullable FragmentActivity activity, @NotNull av6 dialogCallback) {
        Intrinsics.checkNotNullParameter(dialogCallback, "dialogCallback");
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        MainCommonAppUrlsKt.showSyncWebCommonDialog(activity, dialogCallback);
    }
}
