package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.p004activity.result.ActivityResult;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.contract.ActivityResultContracts;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.LinkSpanHelper;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingConstants;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingsExportPreference;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.milink.export.MilinkManager;
import com.xiaomi.fitness.milink.export.MilinkManagerExtKt;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.cji;
import defpackage.eui;
import defpackage.wh6;
import defpackage.wzi;
import defpackage.xc6;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b0\u0010\u001bJ)\u0010\b\u001a\u00020\u00062\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\rJ+\u0010\u0012\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\"\u0010\u001bR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010,\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicViewModel;", "Lwh6;", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "", "positiveCallback", "showComfirmDialog", "(Lkotlin/jvm/functions/Function1;)V", "", "isNeedSync", "sendSettingChangeReceiver", "(Z)V", "isNeedSendChange", "resetSwitchUi", "Lkotlin/Function0;", "negativeCallback", "showPermissionRemindDialog", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "resultCode", "Landroid/content/Intent;", "data", "onMiuiNotificationSettingResult", "(ILandroid/content/Intent;)V", "openNotification", "()V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "bindView", "(Lwh6;)V", "onVisible", "Landroidx/activity/result/ActivityResultLauncher;", "miuiNotificationSettingLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "iSMIUIPermissionLaunch", "Z", "NOTIFIINTENT$delegate", "Lkotlin/Lazy;", "getNOTIFIINTENT", "()Landroid/content/Intent;", "NOTIFIINTENT", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MusicFragment extends BaseBindingFragment<MusicViewModel, wh6> {

    /* JADX INFO: renamed from: NOTIFIINTENT$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy NOTIFIINTENT = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zag
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MusicFragment.NOTIFIINTENT_delegate$lambda$0(this.f41074a);
        }
    });
    private boolean iSMIUIPermissionLaunch;
    private ActivityResultLauncher<Intent> miuiNotificationSettingLauncher;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent NOTIFIINTENT_delegate$lambda$0(MusicFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Intent("miui.intent.action.NOTIFICATION_VERIFY").putExtra("component_name", ApplicationExtKt.getApplication().getPackageName() + (AppUtil.INSTANCE.isPlayChannel() ? "/com.xiaomi.wearable.home.devices.ble.sync.NotifySyncService" : "/com.xiaomi.fitness.notify.NotifySyncService")).putExtra("enable", true).putExtra(MiuiCursorConstants.CONTENT, this$0.getString(wzi.v5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(MusicFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, MusicSettingFragment.class, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$6(final MusicFragment this$0, boolean z, final ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            iSwitchButton.setChecked(!z);
            this$0.showComfirmDialog(new Function1() { // from class: yag
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MusicFragment.bindView$lambda$6$lambda$5(iSwitchButton, this$0, (DialogInterface) obj);
                }
            });
            return;
        }
        boolean zIsNotificationListenersEnabled = MusicFragmentKt.getNotificationManagerImpl().isNotificationListenersEnabled();
        xc6.d("MusicFragment setOnCheckedChangeCallback " + zIsNotificationListenersEnabled);
        if (zIsNotificationListenersEnabled) {
            DeviceSettingsExportPreference.INSTANCE.setAppMusicSync2Device(true);
            this$0.sendSettingChangeReceiver(true);
        } else {
            iSwitchButton.setChecked(!z);
            this$0.showPermissionRemindDialog(new Function0() { // from class: wag
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MusicFragment.bindView$lambda$6$lambda$3(this.f37768a);
                }
            }, new Function0() { // from class: xag
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$6$lambda$3(MusicFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xc6.d("MusicFragment openNotification");
        this$0.openNotification();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$6$lambda$5(ISwitchButton iSwitchButton, MusicFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xc6.d("MusicFragment setOnCheckedChangeCallback false");
        DeviceSettingsExportPreference.INSTANCE.setAppMusicSync2Device(false);
        iSwitchButton.setChecked(false);
        this$0.sendSettingChangeReceiver(false);
        return Unit.INSTANCE;
    }

    private final Intent getNOTIFIINTENT() {
        return (Intent) this.NOTIFIINTENT.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$1(MusicFragment this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xc6.d("MusicFragment onMiuiNotificationSettingResult");
        this$0.onMiuiNotificationSettingResult(activityResult.c(), activityResult.a());
    }

    private final void onMiuiNotificationSettingResult(int resultCode, Intent data) {
        xc6.b("MusicFragment onMiuiNotificationSettingResult " + resultCode);
        if (resultCode != -1) {
            PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE).statisticNotificationListenPermission(false);
            return;
        }
        PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE).statisticNotificationListenPermission(true);
        getMBinding().A.setSwitch(true);
        sendSettingChangeReceiver(true);
    }

    private final void openNotification() {
        boolean z = ApplicationExtKt.getApplication().getPackageManager().resolveActivity(getNOTIFIINTENT(), 0) != null;
        xc6.d("MusicFragment openNotification " + z);
        if (!z) {
            this.iSMIUIPermissionLaunch = false;
            MusicFragmentKt.getNotificationManagerImpl().gotoNotificationAccessSetting();
            return;
        }
        try {
            this.iSMIUIPermissionLaunch = true;
            ActivityResultLauncher<Intent> activityResultLauncher = this.miuiNotificationSettingLauncher;
            if (activityResultLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("miuiNotificationSettingLauncher");
                activityResultLauncher = null;
            }
            activityResultLauncher.launch(getNOTIFIINTENT());
        } catch (SecurityException e) {
            xc6.c("MusicFragment openNotification", e);
            this.iSMIUIPermissionLaunch = false;
            MusicFragmentKt.getNotificationManagerImpl().gotoNotificationAccessSetting();
        }
    }

    private final void resetSwitchUi(boolean isNeedSendChange) {
        boolean zIsNotificationListenersEnabled = MusicFragmentKt.getNotificationManagerImpl().isNotificationListenersEnabled();
        xc6.d("MusicFragment resetSwitchUi " + zIsNotificationListenersEnabled);
        if (!zIsNotificationListenersEnabled) {
            getMBinding().A.setSwitch(false);
            return;
        }
        boolean zIsAppMusicSync2Device = DeviceSettingsExportPreference.INSTANCE.isAppMusicSync2Device();
        xc6.d("MusicFragment resetSwitchUi isAppMusicSync2Device:" + zIsAppMusicSync2Device);
        if (isNeedSendChange) {
            sendSettingChangeReceiver(zIsAppMusicSync2Device);
        }
        getMBinding().A.setSwitch(zIsAppMusicSync2Device);
    }

    private final void sendSettingChangeReceiver(boolean isNeedSync) {
        Intent intent = new Intent(DeviceSettingConstants.INSTANCE.getSActionMusicSettingChange());
        intent.putExtra("isNeedSync", isNeedSync);
        ApplicationExtKt.getApplication().sendBroadcast(intent);
    }

    private final void showComfirmDialog(Function1<? super DialogInterface, Unit> positiveCallback) {
        String string = getString(wzi.A1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int i = wzi.g;
        int i2 = wzi.e;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showMsgDialog$default(null, string, i, parentFragmentManager, i2, positiveCallback, null, 64, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showComfirmDialog$default(MusicFragment musicFragment, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        musicFragment.showComfirmDialog(function1);
    }

    private final void showPermissionRemindDialog(final Function0<Unit> positiveCallback, final Function0<Unit> negativeCallback) {
        String string = getString(wzi.v5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(wzi.w5);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getString(wzi.x5);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = getString(wzi.y5, string, string2, string3);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string4);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(BaseFragmentExtKt.getColor(this, cji.D));
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(BaseFragmentExtKt.getColor(this, cji.F));
        LinkSpanHelper.SizeSpanWithUnderline sizeSpanWithUnderline = new LinkSpanHelper.SizeSpanWithUnderline("", new LinkSpanHelper.a() { // from class: dbg
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str) {
                MusicFragment.showPermissionRemindDialog$lambda$8(this.f15342a, view, str);
            }
        }, BaseFragmentExtKt.getColor(this, cji.common_main_red_color), ExtUtilsKt.getSp(Float.valueOf(16.0f)));
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, string.length(), 33);
        spannableStringBuilder.setSpan(foregroundColorSpan2, string.length(), string.length() + string2.length(), 33);
        spannableStringBuilder.setSpan(sizeSpanWithUnderline, string.length() + string2.length(), string.length() + string2.length() + string3.length(), 33);
        new CommonDialog.c("commonDialog").setDialogTitle(wzi.ff).setDialogDescriptionString(new DialogParams.DialogDescriptionString(spannableStringBuilder)).setNegativeText(wzi.e).setPositiveText(wzi.lf).setCanceledOnBackPressed(false).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicFragment.showPermissionRemindDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    negativeCallback.invoke();
                    if (dialog != null) {
                        dialog.dismiss();
                        return;
                    }
                    return;
                }
                if (which != -1) {
                    return;
                }
                positiveCallback.invoke();
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPermissionRemindDialog$lambda$8(MusicFragment this$0, View view, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", ApplicationExtKt.getApplication().getPackageName(), null));
        this$0.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull wh6 wh6Var) {
        Intrinsics.checkNotNullParameter(wh6Var, "<this>");
        setTitle(wzi.z5);
        wh6Var.B.setOnClickListener(new View.OnClickListener() { // from class: abg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicFragment.bindView$lambda$2(this.f858a, view);
            }
        });
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.LOCAL_MUSIC)) {
            wh6Var.B.setVisibility(8);
        } else {
            wh6Var.B.setVisibility(0);
        }
        wh6Var.A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: bbg
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                MusicFragment.bindView$lambda$6(this.f4017a, z, iSwitchButton);
            }
        });
        resetSwitchUi(false);
        MilinkManager.Companion companion = MilinkManager.INSTANCE;
        if (MilinkManagerExtKt.getInstance(companion).isPhoneSupportMilink() && MilinkManagerExtKt.getInstance(companion).isDeviceSupportMilink()) {
            wh6Var.A.setVisibility(8);
        } else {
            wh6Var.A.setVisibility(0);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.r0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.miuiNotificationSettingLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: cbg
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                MusicFragment.onAttach$lambda$1(this.f5163a, (ActivityResult) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        resetSwitchUi(true);
    }
}
