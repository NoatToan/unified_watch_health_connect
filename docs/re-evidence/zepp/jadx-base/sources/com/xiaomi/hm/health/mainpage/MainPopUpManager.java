package com.xiaomi.hm.health.mainpage;

import android.app.NotificationManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Observer;
import com.amap.api.mapcore.util.hl;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.homepage.promotion.beans.PromotionVo;
import com.huami.homepage.promotion.server.PromotionDataManager;
import com.huami.homepage.promotion.server.PromotionType;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.findphone.AskAndAnswer;
import com.huami.watch.companion.findphone.SettingsTransporterModules;
import com.huami.watch.hmwatchmanager.R;
import com.huami.web.service.WebItem;
import com.xiaomi.hm.health.AppExpiredConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.mainpage.MainPopUpManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/MainPopUpManager;", "", "", "f", "i", hl.k, "checkHomePagePopup", "checkDialog", "Landroidx/appcompat/app/AppCompatActivity;", "a", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "b", "Z", "isFindPhone", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class MainPopUpManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppCompatActivity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isFindPhone;

    public MainPopUpManager(@NotNull AppCompatActivity appCompatActivity) {
        this.activity = appCompatActivity;
        Intent intent = appCompatActivity.getIntent();
        this.isFindPhone = Intrinsics.areEqual(intent == null ? null : intent.getAction(), SettingsTransporterModules.ACTION_FIND_PHONE_DIALOG);
    }

    private final void f() {
        if (AppExpiredConfig.isExpired()) {
            new AlertDialogFragment.Builder(this.activity).setMessage(R.string.app_config_expired_tip).setNeutralButton(R.string.i_know, new DialogInterface.OnClickListener() { // from class: cv4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    MainPopUpManager.g(this.a, dialogInterface, i);
                }
            }).setCancelable(false).show(this.activity.getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(MainPopUpManager mainPopUpManager, DialogInterface dialogInterface, int i) {
        mainPopUpManager.activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String url = ((PromotionVo) list.get(0)).getNavigateInfo().getUrl();
        if (TextUtils.isEmpty(url)) {
            return;
        }
        WebItem webItem = new WebItem(url);
        webItem.from = "from_home_popup";
        WebHelper.launch(webItem);
    }

    private final void i() {
        if (!this.isFindPhone) {
            AskAndAnswer.stopAudio();
            return;
        }
        AppCompatActivity appCompatActivity = this.activity;
        new AlertDialogFragment.Builder(this.activity).setTitle(R.string.find_phone_dialog_title).setMessage(this.activity.getString(R.string.find_phone_dialog_msg, new Object[]{DeviceSource.getDeviceName(appCompatActivity, DeviceManager.getManager(appCompatActivity).getCurrentDevice())})).setNeutralButton(R.string.btn_enter, new DialogInterface.OnClickListener() { // from class: fv4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MainPopUpManager.j(dialogInterface, i);
            }
        }).setCancelable(false).show(this.activity.getSupportFragmentManager());
        this.isFindPhone = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(DialogInterface dialogInterface, int i) {
        AskAndAnswer.stopAudio();
    }

    private final void k() {
        NotificationManager notificationManager;
        int i;
        if (HMKeeper.isDisturbShowd() || (notificationManager = (NotificationManager) this.activity.getSystemService(SleepHomeActivity.FROM_NOTIFICATION)) == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        if ((HMDeviceManager.getInstance().hasBound(HMDeviceType.MILI) || HMDeviceManager.getInstance().hasBound(HMDeviceType.WATCH)) && HMPersonInfo.getInstance().getMiliConfig() != null) {
            if ((HMPersonInfo.getInstance().getMiliConfig().isInComingCallEnabled() || HMDeviceConfig.hasFeatureMutePhoneDevice()) && !notificationManager.isNotificationPolicyAccessGranted()) {
                HMKeeper.setDisturbShowStatusEnable(true);
                AlertDialogFragment.Builder title = new AlertDialogFragment.Builder(this.activity).setCancelable(false).setTitle(R.string.permission_disturb_title);
                if (HMDeviceConfig.hasBoundBand3()) {
                    i = R.string.permission_disturb_msg_device;
                } else {
                    i = HMDeviceConfig.hasBoundWatch() ? R.string.permission_disturb_msg_watch : R.string.permission_disturb_msg;
                }
                title.setMessage(i).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: ev4
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        MainPopUpManager.l(dialogInterface, i2);
                    }
                }).setPositiveButton(R.string.per_go_setting, new DialogInterface.OnClickListener() { // from class: dv4
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        MainPopUpManager.m(this.a, dialogInterface, i2);
                    }
                }).show(this.activity.getSupportFragmentManager());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(MainPopUpManager mainPopUpManager, DialogInterface dialogInterface, int i) {
        mainPopUpManager.activity.startActivity(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
    }

    public final void checkDialog() {
        f();
        i();
        k();
    }

    public final void checkHomePagePopup() {
        PromotionDataManager.INSTANCE.loadData(PromotionType.HOME_POPUP_WEB_VIEW).observe(this.activity, new Observer() { // from class: gv4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MainPopUpManager.h((List) obj);
            }
        });
    }
}
