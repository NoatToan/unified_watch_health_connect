package com.xiaomi.fitness.route.track.ext;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.route.track.view.MyTrackLibraryActivity;
import defpackage.av6;
import defpackage.x0j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"TAG", "", "checkConnect", "", "Lcom/xiaomi/fitness/route/track/view/MyTrackLibraryActivity;", "action", "Lkotlin/Function0;", "route_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MyTrackLibraryActivityExtKt {

    @NotNull
    public static final String TAG = "MyTrackLibraryActivityExt";

    public static final void checkConnect(@NotNull final MyTrackLibraryActivity myTrackLibraryActivity, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(myTrackLibraryActivity, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        FragmentManager supportFragmentManager = myTrackLibraryActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            new CommonDialog.c("face_check_connect").setDialogTitle(new DialogParams.DialogDescriptionString("设备连接异常")).setDialogDescriptionString(new DialogParams.DialogDescriptionString("请检查你的设备是否连接正常")).setPositiveText(x0j.f38548b).setNegativeText(x0j.f38547a).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.route.track.ext.MyTrackLibraryActivityExtKt.checkConnect.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        myTrackLibraryActivity.hideLoading();
                    } else {
                        if (which != -1) {
                            return;
                        }
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        Bundle bundle = new Bundle();
                        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
                        MainExtKt.showMainActivity$default(myTrackLibraryActivity, null, bundle, 2, null);
                    }
                }
            }).showIfNeed(supportFragmentManager);
        } else {
            action.invoke();
        }
    }
}
