package com.xiaomi.fitness.notify;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.p004activity.result.ActivityResult;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.contract.ActivityResultContracts;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.LinkSpanHelper;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.notify.NotifyFragment;
import com.xiaomi.fitness.notify.di.NotifyStartExtKt;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.notify.notification.NotificationManagerInter;
import com.xiaomi.fitness.notify.util.NotificationSettingDialogHelp;
import com.xiaomi.fitness.notify.util.NotifyPreference;
import com.xiaomi.fitness.notify.util.NotifyUtil;
import com.xiaomi.fitness.notify.widget.CheckBoxTextView;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.ubox.export.GuideNavigator;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.fitness.widget.button.SwitchButton;
import defpackage.av6;
import defpackage.d2m;
import defpackage.dzg;
import defpackage.of4;
import defpackage.q0j;
import defpackage.sji;
import defpackage.tui;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import miuix.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 Z2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001ZB\u0007¢\u0006\u0004\bY\u0010\u0010J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J+\u0010 \u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u0010J!\u0010+\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010\u0010J/\u00103\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u00042\u000e\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0/2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0014¢\u0006\u0004\b5\u0010\u0010J\u000f\u00106\u001a\u00020\bH\u0014¢\u0006\u0004\b6\u0010\u0010J\u000f\u00107\u001a\u00020\bH\u0016¢\u0006\u0004\b7\u0010\u0010R\u0016\u00108\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00109R\u0016\u0010B\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00109R\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u001b\u0010J\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00109R\u0016\u0010L\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u00109R\u0016\u0010M\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00109R\u0016\u0010N\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u00109R$\u0010P\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006["}, d2 = {"Lcom/xiaomi/fitness/notify/NotifyFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/notify/NotifyViewModel;", "Ldzg;", "", "resultCode", "Landroid/content/Intent;", "data", "", "onMiuiNotificationSettingResult", "(ILandroid/content/Intent;)V", "", "source", "reportData", "(Ljava/lang/String;)V", "openNotification", "()V", "setDefaultApp", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "switchButton", "", "yes", "setImportantForAccessibility", "(Lcom/xiaomi/fitness/widget/button/SwitchButton;Z)V", "refreshAdapterList", "isChecked", "reportNotificationOpenStatus", "(Z)V", "uboxNextPage", "Lkotlin/Function0;", "positiveCallback", "negativeCallback", "showPermissionRemindDialog", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", LifecycleConstantKt.ON_PAUSE, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "showItemOpenAlert", AccountInteractActivity.KEY_REQUEST_CODE, "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onVisible", "onInvisible", LifecycleConstantKt.ON_DESTROY, "isUBoxContinueBtnClick", "Z", "Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "guideNavigator", "Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "getGuideNavigator", "()Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "setGuideNavigator", "(Lcom/xiaomi/fitness/ubox/export/GuideNavigator;)V", "isRemindPermissionDialogShow", "iSMIUIPermissionLaunch", "Landroidx/activity/result/ActivityResultLauncher;", "miuiNotificationSettingLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "NOTIFIINTENT$delegate", "Lkotlin/Lazy;", "getNOTIFIINTENT", "()Landroid/content/Intent;", "NOTIFIINTENT", "isOpenInRemind", "isUBoxUI", "isInit", "isToOpenNotificationListener", "Lcom/xiaomi/fitness/notify/NotifyAdapter;", "mNotifyAdapter", "Lcom/xiaomi/fitness/notify/NotifyAdapter;", "getMNotifyAdapter", "()Lcom/xiaomi/fitness/notify/NotifyAdapter;", "setMNotifyAdapter", "(Lcom/xiaomi/fitness/notify/NotifyAdapter;)V", "", "mNotifyFragmentVisibleTime", "J", "<init>", "Companion", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class NotifyFragment extends Hilt_NotifyFragment<NotifyViewModel, dzg> {

    @NotNull
    public static final String OPEN_NOTIFICATION = "open_notification";

    @NotNull
    public static final String TAG = "NotifyFragment";

    @NotNull
    public static final String sIsUBoxUI = "sIsUBoxUI";

    /* JADX INFO: renamed from: NOTIFIINTENT$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy NOTIFIINTENT;
    public GuideNavigator guideNavigator;
    private boolean iSMIUIPermissionLaunch;
    private boolean isInit;
    private boolean isOpenInRemind;
    private boolean isRemindPermissionDialogShow;
    private boolean isToOpenNotificationListener;
    private boolean isUBoxContinueBtnClick;
    private boolean isUBoxUI;

    @Nullable
    private NotifyAdapter mNotifyAdapter;
    private long mNotifyFragmentVisibleTime;
    private ActivityResultLauncher<Intent> miuiNotificationSettingLauncher;

    public NotifyFragment() {
        super(tui.c);
        this.NOTIFIINTENT = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nyg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotifyFragment.NOTIFIINTENT_delegate$lambda$0(this.f28568a);
            }
        });
        this.isInit = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent NOTIFIINTENT_delegate$lambda$0(NotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Intent("miui.intent.action.NOTIFICATION_VERIFY").putExtra("component_name", ApplicationExtKt.getApplication().getPackageName() + (AppUtil.INSTANCE.isPlayChannel() ? "/com.xiaomi.wearable.home.devices.ble.sync.NotifySyncService" : "/com.xiaomi.fitness.notify.NotifySyncService")).putExtra("enable", true).putExtra(MiuiCursorConstants.CONTENT, this$0.getString(q0j.R));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ dzg access$getMBinding(NotifyFragment notifyFragment) {
        return (dzg) notifyFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ NotifyViewModel access$getMViewModel(NotifyFragment notifyFragment) {
        return (NotifyViewModel) notifyFragment.getMViewModel();
    }

    private final Intent getNOTIFIINTENT() {
        return (Intent) this.NOTIFIINTENT.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$1(NotifyFragment this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onMiuiNotificationSettingResult(activityResult.c(), activityResult.a());
    }

    private final void onMiuiNotificationSettingResult(int resultCode, Intent data) {
        Logger.i(TAG, " onMiuiNotificationSettingResult " + resultCode + " ");
        if (resultCode == -1) {
            PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE).statisticNotificationListenPermission(true);
            NotifyHelperExtKt.getNotificationManagerExport().updateNotifyRemindState(true);
            if (this.isUBoxUI) {
                uboxNextPage();
            }
        } else {
            PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE).statisticNotificationListenPermission(false);
            if (!this.isUBoxUI && this.iSMIUIPermissionLaunch) {
                showPermissionRemindDialog(new Function0() { // from class: tyg
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotifyFragment.onMiuiNotificationSettingResult$lambda$2(this.f35185a);
                    }
                }, new Function0() { // from class: uyg
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotifyFragment.onMiuiNotificationSettingResult$lambda$3(this.f36280a);
                    }
                });
            }
        }
        reportData("notification_listeners_setting_change");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMiuiNotificationSettingResult$lambda$2(NotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.openNotification();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMiuiNotificationSettingResult$lambda$3(NotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$10(NotifyFragment this$0, Boolean bool) {
        WearableDeviceModel mDeviceModel;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            ((dzg) this$0.getMBinding()).H.setSwitch(true);
            ((dzg) this$0.getMBinding()).H.setSubtitle(q0j.v);
            ((dzg) this$0.getMBinding()).Q.setVisibility(0);
            SwitchButtonTwoLineTextView switchButtonTwoLineTextView = ((dzg) this$0.getMBinding()).J;
            WearableDeviceModel mDeviceModel2 = ((NotifyViewModel) this$0.getMViewModel()).getMDeviceModel();
            switchButtonTwoLineTextView.setVisibility((mDeviceModel2 == null || !DeviceModelExtKt.isWearOS(mDeviceModel2)) ? 0 : 8);
            WearableDeviceModel mDeviceModel3 = ((NotifyViewModel) this$0.getMViewModel()).getMDeviceModel();
            if ((mDeviceModel3 == null || !DeviceModelExtKt.isSupportFeature(mDeviceModel3, "notification_action")) && ((mDeviceModel = ((NotifyViewModel) this$0.getMViewModel()).getMDeviceModel()) == null || !DeviceModelExtKt.isL66(mDeviceModel))) {
                ((dzg) this$0.getMBinding()).G.setVisibility(8);
            } else {
                ((dzg) this$0.getMBinding()).G.setVisibility(0);
            }
            LinearLayout openNotificationTypeView = ((dzg) this$0.getMBinding()).L;
            Intrinsics.checkNotNullExpressionValue(openNotificationTypeView, "openNotificationTypeView");
            ViewExtKt.visible(openNotificationTypeView);
            if (((NotifyViewModel) this$0.getMViewModel()).getIsSupportOnlyWear()) {
                SwitchButtonTwoLineTextView onlyWearButton = ((dzg) this$0.getMBinding()).K;
                Intrinsics.checkNotNullExpressionValue(onlyWearButton, "onlyWearButton");
                ViewExtKt.visible(onlyWearButton);
            } else {
                SwitchButtonTwoLineTextView onlyWearButton2 = ((dzg) this$0.getMBinding()).K;
                Intrinsics.checkNotNullExpressionValue(onlyWearButton2, "onlyWearButton");
                ViewExtKt.gone(onlyWearButton2);
            }
            this$0.setDefaultApp();
            if (Intrinsics.areEqual(((NotifyViewModel) this$0.getMViewModel()).getSyncAllNotificationEnable().getValue(), Boolean.TRUE)) {
                Logger.i(TAG, "doNotifyEnable synAll true");
                ((dzg) this$0.getMBinding()).P.setChecked(true);
                ((dzg) this$0.getMBinding()).M.setChecked(false);
                RecyclerView appList = ((dzg) this$0.getMBinding()).A;
                Intrinsics.checkNotNullExpressionValue(appList, "appList");
                ViewExtKt.gone(appList);
                ((dzg) this$0.getMBinding()).E.setVisibility(0);
            } else {
                Logger.i(TAG, "doNotifyEnable synAll false");
                ((dzg) this$0.getMBinding()).P.setChecked(false);
                ((dzg) this$0.getMBinding()).M.setChecked(true);
                RecyclerView appList2 = ((dzg) this$0.getMBinding()).A;
                Intrinsics.checkNotNullExpressionValue(appList2, "appList");
                ViewExtKt.visible(appList2);
                ((dzg) this$0.getMBinding()).E.setVisibility(8);
            }
        } else {
            ((dzg) this$0.getMBinding()).H.setSwitch(false);
            ((dzg) this$0.getMBinding()).H.setSubtitle(q0j.t);
            ((dzg) this$0.getMBinding()).Q.setVisibility(8);
            ((dzg) this$0.getMBinding()).J.setVisibility(8);
            ((dzg) this$0.getMBinding()).G.setVisibility(8);
            RecyclerView appList3 = ((dzg) this$0.getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(appList3, "appList");
            ViewExtKt.gone(appList3);
            LinearLayout openNotificationTypeView2 = ((dzg) this$0.getMBinding()).L;
            Intrinsics.checkNotNullExpressionValue(openNotificationTypeView2, "openNotificationTypeView");
            ViewExtKt.gone(openNotificationTypeView2);
            SwitchButtonTwoLineTextView onlyWearButton3 = ((dzg) this$0.getMBinding()).K;
            Intrinsics.checkNotNullExpressionValue(onlyWearButton3, "onlyWearButton");
            ViewExtKt.gone(onlyWearButton3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$11(NotifyFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((dzg) this$0.getMBinding()).H.getSwitch()) {
            CheckBoxTextView checkBoxTextView = ((dzg) this$0.getMBinding()).P;
            Intrinsics.checkNotNull(bool);
            checkBoxTextView.setChecked(bool.booleanValue());
            ((dzg) this$0.getMBinding()).M.setChecked(!bool.booleanValue());
            if (bool.booleanValue()) {
                RecyclerView appList = ((dzg) this$0.getMBinding()).A;
                Intrinsics.checkNotNullExpressionValue(appList, "appList");
                ViewExtKt.gone(appList);
            } else {
                RecyclerView appList2 = ((dzg) this$0.getMBinding()).A;
                Intrinsics.checkNotNullExpressionValue(appList2, "appList");
                ViewExtKt.visible(appList2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$12(NotifyFragment this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((dzg) this$0.getMBinding()).P.setChecked(!z);
        ((NotifyViewModel) this$0.getMViewModel()).setAllNotifyEnable(!z, !this$0.isUBoxUI);
        Logger.i(TAG, "selectAppNotificationButton onCheckedChange:" + z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$13(NotifyFragment this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IOnetrack.Companion companion = IOnetrack.INSTANCE;
        OneTrackExtKt.getInstance(companion).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.50.1.1.22816"), "name", "message_image_btn", "result", Boolean.valueOf(z), "source", "device_tab");
        OneTrackExtKt.getInstance(companion).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.50.1.1.22817"), "name", "message_diy_btn", "result", Boolean.valueOf(!z), "source", "device_tab");
        ((NotifyViewModel) this$0.getMViewModel()).setAllNotifyEnable(z, !this$0.isUBoxUI);
        ((dzg) this$0.getMBinding()).M.setChecked(!z);
        Logger.i(TAG, "syncAllNotificationButton onCheckedChange:" + z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$14(final NotifyFragment this$0, boolean z, final ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(iSwitchButton, "null cannot be cast to non-null type com.xiaomi.fitness.widget.button.SwitchButton");
        this$0.setImportantForAccessibility((SwitchButton) iSwitchButton, false);
        ((dzg) this$0.getMBinding()).H.setSwitch(!z);
        if (!z) {
            new CommonDialog.c("commonDialog").setDialogDescriptionString(new DialogParams.DialogDescriptionString(q0j.L, new Object[0])).setPositiveText(q0j.c).setNegativeText(q0j.f30960b).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.notify.NotifyFragment$onViewCreated$9$1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    this.this$0.setImportantForAccessibility((SwitchButton) iSwitchButton, true);
                    if (which == -2) {
                        NotifyFragment notifyFragment = this.this$0;
                        notifyFragment.reportNotificationOpenStatus(NotifyFragment.access$getMBinding(notifyFragment).H.getSwitch());
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    } else if (which == -1) {
                        NotifyStartExtKt.getNotificationManagerImpl().setNotifySwitchStatus(false);
                        NotifyFragment.access$getMViewModel(this.this$0).getNotifyEnable().setValue(Boolean.FALSE);
                        NotifyFragment.access$getMBinding(this.this$0).H.setSwitch(false);
                        this.this$0.reportNotificationOpenStatus(false);
                        NotifyStartExtKt.getNotificationManagerImpl().updateNotifyRemindState(false);
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                    this.this$0.reportData("notify_enable_setting_change");
                }
            }).show(this$0.getParentFragmentManager(), "");
            return;
        }
        NotifyStartExtKt.getNotificationManagerImpl().setNotifySwitchStatus(true);
        ((NotifyViewModel) this$0.getMViewModel()).getNotifyEnable().setValue(Boolean.TRUE);
        ((dzg) this$0.getMBinding()).H.setSwitch(true);
        NotifyStartExtKt.getNotificationManagerImpl().updateNotifyRemindState(true);
        this$0.reportNotificationOpenStatus(true);
        this$0.reportData("notify_enable_setting_change");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$15(NotifyFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = ((dzg) this$0.getMBinding()).G;
        Intrinsics.checkNotNull(bool);
        switchButtonTwoLineTextView.setSwitch(bool.booleanValue());
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$16(NotifyFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((NotifyViewModel) this$0.getMViewModel()).updateEnableAutoScreen(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$17(NotifyFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = ((dzg) this$0.getMBinding()).J;
        Intrinsics.checkNotNull(bool);
        switchButtonTwoLineTextView.setSwitch(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$18(NotifyFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NotifyStartExtKt.getNotificationManagerImpl().setNotifyStatusOnScreenLock(z);
        if (z) {
            NotificationSettingDialogHelp.INSTANCE.showLockScreenRemind(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$19(NotifyFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        String did;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((NotifyViewModel) this$0.getMViewModel()).getOnlyWearLiveData().setValue(Integer.valueOf(z ? 1 : 2));
        NotifyViewModel notifyViewModel = (NotifyViewModel) this$0.getMViewModel();
        WearableDeviceModel mDeviceModel = ((NotifyViewModel) this$0.getMViewModel()).getMDeviceModel();
        if (mDeviceModel == null || (did = mDeviceModel.getDid()) == null) {
            did = "";
        }
        notifyViewModel.updateOnlyWearEnable(did, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$20(NotifyFragment this$0, Integer num) {
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = ((dzg) this$0.getMBinding()).K;
        if (num != null) {
            z = num.intValue() == 1;
        }
        switchButtonTwoLineTextView.setSwitch(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$21(NotifyFragment this$0, boolean z, boolean z2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "notifyEnable:" + z + " allEnable:" + z2 + ",screenOnNewNotification:" + i + ",isNotifyStatusOnScreenLockEnable:" + i2 + ",onlyWear:" + i3);
        AnyExtKt.main$default(null, new NotifyFragment$onViewCreated$16$1(this$0, z, i3, z2, i, i2, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$4(NotifyFragment this$0, String openSubInfo, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(openSubInfo, "$openSubInfo");
        NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
        WearableDeviceModel mDeviceModel = ((NotifyViewModel) this$0.getMViewModel()).getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        WebViewUtilKt.startWebView$default(notifyUtil.getNotificationHelpUrl(DeviceModelExtKt.getModel(mDeviceModel)), openSubInfo, false, false, null, false, null, false, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(NotifyFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getGuideNavigator().navigate("guideOpenPhoneCall");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$9(final NotifyFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isUBoxContinueBtnClick = true;
        if (NotifyStartExtKt.getNotificationManagerImpl().isNotificationListenersEnabled()) {
            this$0.uboxNextPage();
        } else {
            this$0.showPermissionRemindDialog(new Function0() { // from class: yyg
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotifyFragment.onViewCreated$lambda$9$lambda$7(this.f40686a);
                }
            }, new Function0() { // from class: zyg
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9$lambda$7(NotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.openNotification();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onVisible$lambda$23(NotifyFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mNotifyFragmentVisibleTime = System.currentTimeMillis();
        AnyExtKt.io$default(null, new NotifyFragment$onVisible$1$1(z, this$0, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openNotification() {
        if (ApplicationExtKt.getApplication().getPackageManager().resolveActivity(getNOTIFIINTENT(), 0) != null) {
            try {
                this.iSMIUIPermissionLaunch = true;
                ActivityResultLauncher<Intent> activityResultLauncher = this.miuiNotificationSettingLauncher;
                if (activityResultLauncher == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("miuiNotificationSettingLauncher");
                    activityResultLauncher = null;
                }
                activityResultLauncher.launch(getNOTIFIINTENT());
            } catch (IllegalStateException unused) {
            } catch (SecurityException unused2) {
                this.iSMIUIPermissionLaunch = false;
                NotifyStartExtKt.getNotificationManagerImpl().gotoNotificationAccessSetting();
            }
        } else {
            this.iSMIUIPermissionLaunch = false;
            NotifyStartExtKt.getNotificationManagerImpl().gotoNotificationAccessSetting();
        }
        this.isToOpenNotificationListener = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshAdapterList() {
        ((NotifyViewModel) getMViewModel()).getPackageList(new Function1() { // from class: syg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NotifyFragment.refreshAdapterList$lambda$22(this.f34104a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshAdapterList$lambda$22(NotifyFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), Dispatchers.getMain(), null, new NotifyFragment$refreshAdapterList$1$1(this$0, it, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportData(String source) {
        WearableDeviceInfo deviceInfo;
        String firmwareVersion;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.0.0.0.42183");
        Object[] objArr = new Object[18];
        objArr[0] = "name";
        objArr[1] = "notification_permission_setting";
        objArr[2] = "notification_listen";
        objArr[3] = Boolean.valueOf(NotifyStartExtKt.getNotificationManagerImpl().isNotificationListenersEnabled());
        objArr[4] = "notify_enabled";
        objArr[5] = Boolean.valueOf(NotifyStartExtKt.getNotificationManagerImpl().isNotifySwitchStatusEnable());
        objArr[6] = "background_unLimit";
        objArr[7] = Boolean.valueOf(d2m.y(ApplicationExtKt.getApplication()));
        objArr[8] = "source";
        objArr[9] = source;
        objArr[10] = "phone_brand";
        String name = RomUtils.INSTANCE.getRomInfo().getName();
        String str = "";
        if (name == null) {
            name = "";
        }
        objArr[11] = name;
        objArr[12] = "result";
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        objArr[13] = String.valueOf(wearableDeviceModel != null ? Boolean.valueOf(wearableDeviceModel.getIsDeviceConnected()) : null);
        objArr[14] = "user_id";
        objArr[15] = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        objArr[16] = "device_version";
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel2 != null && (deviceInfo = wearableDeviceModel2.getDeviceInfo()) != null && (firmwareVersion = deviceInfo.getFirmwareVersion()) != null) {
            str = firmwareVersion;
        }
        objArr[17] = str;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportNotificationOpenStatus(boolean isChecked) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.50.1.1.22815"), "name", "message_btn", "result", Boolean.valueOf(isChecked), "source", "device_tab");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setDefaultApp() {
        WearableDeviceModel mDeviceModel = ((NotifyViewModel) getMViewModel()).getMDeviceModel();
        if (mDeviceModel == null || !DeviceModelExtKt.isWearOS(mDeviceModel)) {
            List<String> notifyEnableList = NotifyStartExtKt.getNotificationManagerImpl().getNotifyEnableList();
            Logger.i(TAG, "setDefaultApp notifyEnableList.size:" + (notifyEnableList != null ? Integer.valueOf(notifyEnableList.size()) : null));
            List<String> list = notifyEnableList;
            if (list == null || list.isEmpty()) {
                NotifyStartExtKt.getNotificationManagerImpl().setNotifyEnableList(ArraysKt___ArraysKt.toList(NotificationManagerInter.INSTANCE.getDEFAULT_OPEN_APP_LIST()));
                if (!this.isUBoxUI) {
                    showItemOpenAlert();
                }
            }
            refreshAdapterList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setImportantForAccessibility(SwitchButton switchButton, boolean yes) {
        switchButton.setImportantForAccessibility(yes ? 1 : 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPermissionRemindDialog(final Function0<Unit> positiveCallback, final Function0<Unit> negativeCallback) {
        String string = getString(q0j.C, getString(q0j.D), getString(q0j.E), getString(q0j.F));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(BaseFragmentExtKt.getColor(this, sji.f33706a));
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(BaseFragmentExtKt.getColor(this, sji.f33707b));
        LinkSpanHelper.SizeSpanWithUnderline sizeSpanWithUnderline = new LinkSpanHelper.SizeSpanWithUnderline("", new LinkSpanHelper.a() { // from class: vyg
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str) {
                NotifyFragment.showPermissionRemindDialog$lambda$24(view, str);
            }
        }, BaseFragmentExtKt.getColor(this, sji.common_main_red_color), ExtUtilsKt.getSp(Float.valueOf(16.0f)));
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, getString(q0j.D).length(), 33);
        spannableStringBuilder.setSpan(foregroundColorSpan2, getString(q0j.D).length(), getString(q0j.D).length() + getString(q0j.E).length(), 33);
        spannableStringBuilder.setSpan(sizeSpanWithUnderline, getString(q0j.D).length() + getString(q0j.E).length(), getString(q0j.D).length() + getString(q0j.E).length() + getString(q0j.F).length(), 33);
        PermissionDialog permissionDialogCreate = new PermissionDialog.Builder("commonDialog").setDialogTitle(q0j.f0).setDialogDescriptionString(new DialogParams.DialogDescriptionString(spannableStringBuilder)).setNegativeText(q0j.f30960b).setPositiveText(q0j.k0).setCanceledOnBackPressed(false).create();
        permissionDialogCreate.setOnMessageViewClickListener(new Function0() { // from class: wyg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotifyFragment.showPermissionRemindDialog$lambda$25();
            }
        });
        permissionDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.notify.NotifyFragment.showPermissionRemindDialog.2
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
    public static final void showPermissionRemindDialog$lambda$24(View view, String str) {
        String strB = of4.b(LocaleUtil.getCurrentLocale());
        Intrinsics.checkNotNullExpressionValue(strB, "getNotifyListenerRestrictedUrl(...)");
        WebViewUtilKt.startWebView$default(strB, null, false, false, null, false, null, false, 254, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPermissionRemindDialog$lambda$25() {
        String strB = of4.b(LocaleUtil.getCurrentLocale());
        Intrinsics.checkNotNullExpressionValue(strB, "getNotifyListenerRestrictedUrl(...)");
        WebViewUtilKt.startWebView$default(strB, null, false, false, null, false, null, false, 254, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void uboxNextPage() {
        ((NotifyViewModel) getMViewModel()).setAllNotifyEnable(((dzg) getMBinding()).P.isChecked(), true);
        getGuideNavigator().navigate("guideOpenPhoneCall");
    }

    @NotNull
    public final GuideNavigator getGuideNavigator() {
        GuideNavigator guideNavigator = this.guideNavigator;
        if (guideNavigator != null) {
            return guideNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("guideNavigator");
        return null;
    }

    @Nullable
    public final NotifyAdapter getMNotifyAdapter() {
        return this.mNotifyAdapter;
    }

    @Override // com.xiaomi.fitness.notify.Hilt_NotifyFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.miuiNotificationSettingLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: cyg
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                NotifyFragment.onAttach$lambda$1(this.f14865a, (ActivityResult) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        NotifyViewModel notifyViewModel = (NotifyViewModel) getMViewModel();
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        notifyViewModel.unregisterReceiver(mActivity);
        super.onDestroy();
        ActivityResultLauncher<Intent> activityResultLauncher = this.miuiNotificationSettingLauncher;
        if (activityResultLauncher != null) {
            if (activityResultLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("miuiNotificationSettingLauncher");
                activityResultLauncher = null;
            }
            activityResultLauncher.unregister();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            this.mNotifyFragmentVisibleTime = 0L;
        } else {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561"), "name", "message_notification_detail_page", "title", getString(q0j.s), "duration_sec", Long.valueOf((System.currentTimeMillis() - this.mNotifyFragmentVisibleTime) / ((long) 1000)), "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.isInit = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(!this.isUBoxUI ? q0j.s : q0j.u);
        final String string = getString(q0j.w);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ((dzg) getMBinding()).Q.setOnClickListener(new View.OnClickListener() { // from class: azg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NotifyFragment.onViewCreated$lambda$4(this.f3607a, string, view2);
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.isOpenInRemind = arguments.getBoolean(OPEN_NOTIFICATION, false);
            this.isUBoxUI = arguments.getBoolean(sIsUBoxUI, false);
        }
        if (this.isUBoxUI) {
            hideBack();
        }
        Logger.d(TAG, "isOpenInRemind = " + this.isOpenInRemind + "  isUBoxUI:" + this.isUBoxUI);
        if (this.isUBoxUI) {
            ((dzg) getMBinding()).D.setVisibility(0);
            ((dzg) getMBinding()).I.setVisibility(8);
            ((dzg) getMBinding()).E.setVisibility(8);
            ((dzg) getMBinding()).B.setVisibility(0);
            ((dzg) getMBinding()).N.setOnClickListener(new View.OnClickListener() { // from class: iyg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NotifyFragment.onViewCreated$lambda$6(this.f22227a, view2);
                }
            });
            ((dzg) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: jyg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NotifyFragment.onViewCreated$lambda$9(this.f23246a, view2);
                }
            });
            setDefaultApp();
        } else {
            ((dzg) getMBinding()).D.setVisibility(8);
            ((dzg) getMBinding()).I.setVisibility(0);
            ((dzg) getMBinding()).E.setVisibility(0);
            ((dzg) getMBinding()).B.setVisibility(8);
            ((NotifyViewModel) getMViewModel()).getNotifyEnable().observe(getViewLifecycleOwner(), new NotifyFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: kyg
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotifyFragment.onViewCreated$lambda$10(this.f24421a, (Boolean) obj);
                }
            }));
        }
        ((NotifyViewModel) getMViewModel()).getSyncAllNotificationEnable().observe(getViewLifecycleOwner(), new NotifyFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lyg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NotifyFragment.onViewCreated$lambda$11(this.f25556a, (Boolean) obj);
            }
        }));
        ((dzg) getMBinding()).M.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: myg
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                NotifyFragment.onViewCreated$lambda$12(this.f27347a, compoundButton, z);
            }
        });
        ((dzg) getMBinding()).P.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oyg
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                NotifyFragment.onViewCreated$lambda$13(this.f29819a, compoundButton, z);
            }
        });
        ((dzg) getMBinding()).H.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: pyg
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                NotifyFragment.onViewCreated$lambda$14(this.f30899a, z, iSwitchButton);
            }
        });
        ((NotifyViewModel) getMViewModel()).getEnabledAutoScreen().observe(getViewLifecycleOwner(), new NotifyFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qyg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NotifyFragment.onViewCreated$lambda$15(this.f31971a, (Boolean) obj);
            }
        }));
        ((dzg) getMBinding()).G.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: ryg
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                NotifyFragment.onViewCreated$lambda$16(this.f33066a, z, iSwitchButton);
            }
        });
        ((NotifyViewModel) getMViewModel()).getScreenLockEnable().observe(getViewLifecycleOwner(), new NotifyFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dyg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NotifyFragment.onViewCreated$lambda$17(this.f16064a, (Boolean) obj);
            }
        }));
        ((dzg) getMBinding()).J.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: eyg
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                NotifyFragment.onViewCreated$lambda$18(this.f17192a, z, iSwitchButton);
            }
        });
        ((dzg) getMBinding()).K.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: fyg
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                NotifyFragment.onViewCreated$lambda$19(this.f18374a, z, iSwitchButton);
            }
        });
        ((NotifyViewModel) getMViewModel()).getOnlyWearLiveData().observe(getViewLifecycleOwner(), new NotifyFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gyg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NotifyFragment.onViewCreated$lambda$20(this.f19464a, (Integer) obj);
            }
        }));
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        if (((NotifyViewModel) getMViewModel()).getMDeviceModel() != null) {
            WearableDeviceModel mDeviceModel = ((NotifyViewModel) getMViewModel()).getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel);
            if (mDeviceModel.getIsDeviceConnected()) {
                ((NotifyViewModel) getMViewModel()).getNotificationSet(this.isInit && this.isOpenInRemind, new Function5() { // from class: hyg
                    @Override // kotlin.jvm.functions.Function5
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        return NotifyFragment.onViewCreated$lambda$21(this.f20608a, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue(), ((Integer) obj5).intValue());
                    }
                });
                this.mNotifyAdapter = new NotifyAdapter((NotifyViewModel) getMViewModel());
                ((dzg) getMBinding()).A.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
                ((dzg) getMBinding()).A.setAdapter(this.mNotifyAdapter);
                refreshAdapterList();
                NotifyViewModel notifyViewModel = (NotifyViewModel) getMViewModel();
                FragmentActivity mActivity = getMActivity();
                Intrinsics.checkNotNull(mActivity);
                notifyViewModel.registerReceiver(mActivity);
                return;
            }
        }
        FragmentActivity mActivity2 = getMActivity();
        if (mActivity2 != null) {
            ToastExtKt.toastShort(mActivity2, q0j.f);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        final boolean zIsNotificationListenersEnabled = NotifyStartExtKt.getNotificationManagerImpl().isNotificationListenersEnabled();
        Logger.i(TAG, "NotifyFragment onVisible hasNotificationListenersEnabled:" + zIsNotificationListenersEnabled);
        if (!this.isUBoxUI) {
            View view = getView();
            if (view != null) {
                view.post(new Runnable() { // from class: xyg
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotifyFragment.onVisible$lambda$23(this.f39585a, zIsNotificationListenersEnabled);
                    }
                });
            }
        } else if (zIsNotificationListenersEnabled && this.isUBoxContinueBtnClick) {
            uboxNextPage();
        }
        reportData("notification_listeners_setting_change");
    }

    public final void setGuideNavigator(@NotNull GuideNavigator guideNavigator) {
        Intrinsics.checkNotNullParameter(guideNavigator, "<set-?>");
        this.guideNavigator = guideNavigator;
    }

    public final void setMNotifyAdapter(@Nullable NotifyAdapter notifyAdapter) {
        this.mNotifyAdapter = notifyAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showItemOpenAlert() {
        String did;
        WearableDeviceModel mDeviceModel = ((NotifyViewModel) getMViewModel()).getMDeviceModel();
        if (mDeviceModel == null || (did = mDeviceModel.getDid()) == null || !isAdded() || isDetached()) {
            return;
        }
        NotifyPreference notifyPreference = NotifyPreference.INSTANCE;
        if (notifyPreference.isShowNotificationItemOpenAlert(did)) {
            notifyPreference.hideNotificationItemOpenAlert(did);
            new CommonDialog.c("commonDialog").setDialogDescriptionString(new DialogParams.DialogDescriptionString(q0j.N, new Object[0])).setNeutralText(q0j.common_known).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.notify.NotifyFragment.showItemOpenAlert.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    } else if (which == -1 && dialog != null) {
                        dialog.dismiss();
                    }
                }
            }).show(getParentFragmentManager(), "");
        }
    }
}
