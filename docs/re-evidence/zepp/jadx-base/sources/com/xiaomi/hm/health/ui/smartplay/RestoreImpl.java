package com.xiaomi.hm.health.ui.smartplay;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.device.setting.life.feature.inject.RestoreApi;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.smartplay.RestoreImpl;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/RestoreImpl;", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/RestoreApi;", "Landroid/app/Activity;", "activity", "", "c", "", "shouldSendRestoreEvent", "afterRestore", "isIntro", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RestoreImpl implements RestoreApi {
    private final void c(final Activity activity) {
        new AlertDialogFragment.Builder(activity).setTitle(R.string.restore_unlock_screen_title).setMessage(R.string.restore_unlock_screen_tips).setNegativeButton(R.string.not_restore, new DialogInterface.OnClickListener() { // from class: me6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RestoreImpl.d(activity, dialogInterface, i);
            }
        }).setPositiveButton(R.string.restore_use, new DialogInterface.OnClickListener() { // from class: le6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RestoreImpl.e(activity, dialogInterface, i);
            }
        }).create().show(((AppCompatActivity) activity).getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Activity activity, DialogInterface dialogInterface, int i) {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        hMPersonInfo.getMiliConfig().setScreenLock(0);
        hMPersonInfo.saveInfo(2);
        HMAccountWebExtAPI.updateProfile();
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Activity activity, DialogInterface dialogInterface, int i) {
        activity.startActivity(new Intent(activity, (Class<?>) ScreenUnlockActivity.class));
        activity.finish();
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.RestoreApi
    public void afterRestore(@Nullable Activity activity) {
        if (activity instanceof RestoreDeviceConfigActivity) {
            if (!SmartPlayUtils.isScreenUnlockOpened() || SmartPlayUtils.isEnableScreenUnlockOnDevice(activity)) {
                ((RestoreDeviceConfigActivity) activity).finish();
            } else {
                c(activity);
            }
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.RestoreApi
    public boolean isIntro(@Nullable Activity activity) {
        return (activity == null || (activity instanceof RestoreDeviceConfigActivity)) ? false : true;
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.RestoreApi
    public boolean shouldSendRestoreEvent(@Nullable Activity activity) {
        return (activity == null || (activity instanceof RestoreDeviceConfigActivity)) ? false : true;
    }
}
