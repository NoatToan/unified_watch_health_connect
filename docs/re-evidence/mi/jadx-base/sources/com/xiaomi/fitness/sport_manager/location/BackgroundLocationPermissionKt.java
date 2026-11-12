package com.xiaomi.fitness.sport_manager.location;

import android.app.Application;
import android.content.DialogInterface;
import android.os.Build;
import android.os.RemoteException;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessPreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.sport_manager.utils.PermissionUtils;
import com.xiaomi.fitness.sport_manager.utils.SportManagerPreference;
import defpackage.av6;
import defpackage.czc;
import defpackage.g1j;
import defpackage.ipc;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lczc;", "mSportState", "", "initBackgroundLocationPermission", "(Lczc;)V", "checkBackgroundLocationPermission", "()V", "", "checkBackgroundLocationPermissionDate", "()Z", "Landroidx/fragment/app/FragmentActivity;", "currentActivity", "requestLocationDialog", "(Landroidx/fragment/app/FragmentActivity;)V", "", "TAG", "Ljava/lang/String;", "sport-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class BackgroundLocationPermissionKt {

    @NotNull
    public static final String TAG = "BackgroundLocationPermission";

    public static final void checkBackgroundLocationPermission() {
        FitnessPreference fitnessPreference = FitnessPreference.INSTANCE;
        FitnessLogUtils.i(TAG, "checkBackgroundLocationPermission  , deviceLaunch:" + fitnessPreference.getDEVICE_LAUNCH_GPS_SPORT());
        if (fitnessPreference.getDEVICE_LAUNCH_GPS_SPORT() && checkBackgroundLocationPermissionDate()) {
            fitnessPreference.setDEVICE_LAUNCH_GPS_SPORT(false);
            AppManager.Companion companion = AppManager.INSTANCE;
            FragmentActivity fragmentActivity = (FragmentActivity) companion.getInstance().getCurrentActivity();
            FitnessLogUtils.i(TAG, "checkBackgroundLocationPermission , currentActivity:" + fragmentActivity + " , appForeground:" + companion.getInstance().isAppForeground());
            if (fragmentActivity != null) {
                requestLocationDialog(fragmentActivity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkBackgroundLocationPermissionDate() {
        return !TimeDateUtil.INSTANCE.getTodayDate().equals(SportManagerPreference.INSTANCE.getKEY_REQUEST_LOCATION_DATE());
    }

    public static final void initBackgroundLocationPermission(@Nullable czc czcVar) throws RemoteException {
        if (czcVar != null) {
            czcVar.addBackgroundLocationPermissionListener(new ipc.a() { // from class: com.xiaomi.fitness.sport_manager.location.BackgroundLocationPermissionKt.initBackgroundLocationPermission.1
                @Override // defpackage.ipc
                public void onApplyLocationPermission() {
                    AppManager.Companion companion = AppManager.INSTANCE;
                    FragmentActivity fragmentActivity = (FragmentActivity) companion.getInstance().getCurrentActivity();
                    FitnessLogUtils.i(BackgroundLocationPermissionKt.TAG, "current : " + fragmentActivity + " , appForeground:" + companion.getInstance().isAppForeground());
                    String[] strArr = Build.VERSION.SDK_INT >= 30 ? new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"} : new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
                    Application app = AppUtil.getApp();
                    String[] strArr2 = (String[]) ArraysKt___ArraysKt.toList(strArr).toArray(new String[0]);
                    if (PermissionExtKt.isPermissionGranted(app, (String[]) Arrays.copyOf(strArr2, strArr2.length)) || !BackgroundLocationPermissionKt.checkBackgroundLocationPermissionDate()) {
                        return;
                    }
                    BackgroundLocationPermissionKt.requestLocationDialog(fragmentActivity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestLocationDialog(FragmentActivity fragmentActivity) {
        CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(g1j.f).setDialogDescription(g1j.n).setPositiveText(g1j.c).setNegativeText(g1j.f18471b).create();
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller("");
        commonDialogCreate.showIfNeed(fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null);
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_manager.location.BackgroundLocationPermissionKt.requestLocationDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    PermissionUtils.INSTANCE.getLocation();
                    SportManagerPreference.INSTANCE.setKEY_REQUEST_LOCATION_DATE(TimeDateUtil.INSTANCE.getTodayDate());
                }
            }
        });
    }
}
