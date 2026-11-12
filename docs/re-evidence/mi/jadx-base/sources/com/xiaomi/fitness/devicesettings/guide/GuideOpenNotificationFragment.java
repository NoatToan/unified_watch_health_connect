package com.xiaomi.fitness.devicesettings.guide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.p004activity.result.ActivityResult;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.contract.ActivityResultContracts;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.devicesettings.guide.GuideOpenNotificationFragment;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.user.info.export.GoalPageManager;
import com.xiaomi.fitness.user.info.export.GoalPageManagerExtKt;
import defpackage.eui;
import defpackage.ug6;
import defpackage.wzi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import miuix.androidbasewidget.widget.CheckedTextView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00014B\u0007¢\u0006\u0004\b3\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\b*\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J)\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b#\u0010$R\u0016\u0010&\u001a\u0004\u0018\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u0010/\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/guide/GuideOpenNotificationFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationViewModel;", "Lug6;", "", "resultCode", "Landroid/content/Intent;", "data", "", "onMiuiNotificationSettingResult", "(ILandroid/content/Intent;)V", "toCallSettingPage", "()V", "openNotification", "onNextPageWithNotification", "onTrackEvent", "toGoalPage", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "", "onBackPressed", "()Z", "bindView", "(Lug6;)V", AccountInteractActivity.KEY_REQUEST_CODE, "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Landroidx/activity/result/ActivityResultLauncher;", "miuiNotificationSettingLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "intent$delegate", "Lkotlin/Lazy;", "getIntent", "()Landroid/content/Intent;", "intent", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideOpenNotificationFragment extends BaseLoadableBindingFragment<GuideNotificationViewModel, ug6> {
    private static final int REQUEST_NOTIFY_REMIND_CODE = 100;

    @NotNull
    private static final String TAG = "GuideOpenNotificationFragment";
    private ActivityResultLauncher<Intent> miuiNotificationSettingLauncher;

    @Nullable
    private final WearableDeviceModel mDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();

    /* JADX INFO: renamed from: intent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy intent = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: h7b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GuideOpenNotificationFragment.intent_delegate$lambda$0(this.f19774a);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(ug6 this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        CheckedTextView checkedTextView = this_bindView.F;
        checkedTextView.setChecked(!checkedTextView.isChecked());
        this_bindView.B.setChecked(!this_bindView.F.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$3(ug6 this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        CheckedTextView checkedTextView = this_bindView.B;
        checkedTextView.setChecked(!checkedTextView.isChecked());
        this_bindView.F.setChecked(!this_bindView.B.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$4(GuideOpenNotificationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.50.1.1.22813"), "name", "device_intialize_ignore", "source", "device_intialize_msg_page", "type_str", ((ug6) this$0.getMBinding()).B.isChecked() ? "phone_remind_image" : "user_defined_msg");
        this$0.toCallSettingPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$5(GuideOpenNotificationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mDeviceModel == null) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.q);
                return;
            }
            return;
        }
        if (NotifyHelperExtKt.getNotificationManagerExport().isNotificationListenersEnabled()) {
            this$0.onNextPageWithNotification();
        } else {
            this$0.openNotification();
        }
    }

    private final Intent getIntent() {
        return (Intent) this.intent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent intent_delegate$lambda$0(GuideOpenNotificationFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Intent("miui.intent.action.NOTIFICATION_VERIFY").putExtra("component_name", ApplicationExtKt.getApplication().getPackageName() + (AppUtil.INSTANCE.isPlayChannel() ? "/com.xiaomi.wearable.home.devices.ble.sync.NotifySyncService" : "/com.xiaomi.fitness.notify.NotifySyncService")).putExtra("enable", true).putExtra(MiuiCursorConstants.CONTENT, this$0.getString(wzi.K4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$1(GuideOpenNotificationFragment this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onMiuiNotificationSettingResult(activityResult.c(), activityResult.a());
    }

    private final void onMiuiNotificationSettingResult(int resultCode, Intent data) {
        Logger.d(BaseFragment.TAG, " onMiuiNotificationSettingResult " + resultCode + " ");
        if (resultCode == -1) {
            onNextPageWithNotification();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNextPageWithNotification() {
        Logger.i(TAG, "onNextPageWithNotification = " + NotifyHelperExtKt.getNotificationManagerExport().isNotificationListenersEnabled());
        NotifyHelperExtKt.getNotificationManagerExport().updateNotificationSettings(true, ((ug6) getMBinding()).B.isChecked());
        NotifyHelperExtKt.getNotificationManagerExport().updateNotifyRemindState(true);
        onTrackEvent();
        if (((ug6) getMBinding()).B.isChecked()) {
            toCallSettingPage();
        } else {
            BaseFragmentExKt.gotoPage(this, GuideNotificationSelectAppFragment.class, null);
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onTrackEvent() {
        IOnetrack.Companion companion = IOnetrack.INSTANCE;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(companion);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("click_v3", "56.50.1.1.22813");
        Object[] objArr = new Object[6];
        objArr[0] = "name";
        objArr[1] = "device_intialize_open";
        objArr[2] = "source";
        objArr[3] = "device_intialize_msg_page";
        objArr[4] = "type_str";
        objArr[5] = ((ug6) getMBinding()).B.isChecked() ? "phone_remind_image" : "user_defined_msg";
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        OneTrackExtKt.getInstance(companion).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.50.1.1.22815"), "name", "message_btn", "result", Boolean.valueOf(NotifyHelperExtKt.getNotificationManagerExport().isNotificationListenersEnabled()), "source", "initialize");
        OneTrackExtKt.getInstance(companion).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.50.1.1.22816"), "name", "message_image_btn", "result", Boolean.valueOf(((ug6) getMBinding()).B.isChecked()), "source", "initialize");
        OneTrackExtKt.getInstance(companion).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.50.1.1.22817"), "name", "message_diy_btn", "result", Boolean.valueOf(((ug6) getMBinding()).F.isChecked()), "source", "initialize");
    }

    private final void openNotification() {
        if (ApplicationExtKt.getApplication().getPackageManager().resolveActivity(getIntent(), 0) == null) {
            BaseFragmentExKt.gotoPageForResult(this, GuideOpenNotificationRemindFragment.class, 100);
            return;
        }
        try {
            ActivityResultLauncher<Intent> activityResultLauncher = this.miuiNotificationSettingLauncher;
            if (activityResultLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("miuiNotificationSettingLauncher");
                activityResultLauncher = null;
            }
            activityResultLauncher.launch(getIntent());
        } catch (SecurityException unused) {
            BaseFragmentExKt.gotoPageForResult(this, GuideOpenNotificationRemindFragment.class, 100);
        }
    }

    private final void toCallSettingPage() {
        BaseFragmentExKt.gotoPage(this, GuideOpenPhoneCallFragment.class, null);
        finish();
    }

    private final void toGoalPage() {
        if (GoalPageManagerExtKt.getInstance(GoalPageManager.INSTANCE).isShowGoalGuid()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        MainExtKt.showMainActivity(mActivity, null, bundle);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final ug6 ug6Var) {
        Intrinsics.checkNotNullParameter(ug6Var, "<this>");
        ug6Var.F.setChecked(false);
        ug6Var.F.setOnClickListener(new View.OnClickListener() { // from class: i7b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideOpenNotificationFragment.bindView$lambda$2(ug6Var, view);
            }
        });
        ug6Var.B.setChecked(true);
        ug6Var.B.setOnClickListener(new View.OnClickListener() { // from class: j7b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideOpenNotificationFragment.bindView$lambda$3(ug6Var, view);
            }
        });
        ug6Var.A.setOnClickListener(new View.OnClickListener() { // from class: k7b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideOpenNotificationFragment.bindView$lambda$4(this.f23550a, view);
            }
        });
        ug6Var.J.setOnClickListener(new View.OnClickListener() { // from class: l7b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideOpenNotificationFragment.bindView$lambda$5(this.f24736a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.e0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == -1) {
            onNextPageWithNotification();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.miuiNotificationSettingLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: g7b
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                GuideOpenNotificationFragment.onAttach$lambda$1(this.f18674a, (ActivityResult) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        return true;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.J4);
        setActionBarResizeable(true);
        hideBack();
    }
}
