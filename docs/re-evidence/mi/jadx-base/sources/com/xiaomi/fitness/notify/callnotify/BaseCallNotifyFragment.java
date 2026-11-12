package com.xiaomi.fitness.notify.callnotify;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.example.aivs.export.AivsHelper;
import com.example.aivs.export.AivsHelperExtKt;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtil;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.notify.callnotify.BaseCallNotifyFragment;
import com.xiaomi.fitness.notify.callnotify.smsreply.BleSmsReplyFragment;
import com.xiaomi.fitness.notify.callnotify.smsreply.HuamiSmsReplyFragment;
import com.xiaomi.fitness.notify.di.NotifyStartExtKt;
import com.xiaomi.fitness.notify.notification.NotificationManagerInter;
import com.xiaomi.fitness.notify.util.NotifyPreference;
import com.xiaomi.fitness.notify.util.NotifyUtil;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.fitness.widget.button.SwitchButton;
import defpackage.av6;
import defpackage.bzg;
import defpackage.q0j;
import defpackage.tui;
import defpackage.vxi;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001DB\u0007¢\u0006\u0004\bC\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\nJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\nJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\nJ\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\nJ\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\nJ\u0017\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\nJ\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J!\u00102\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0006H\u0014¢\u0006\u0004\b4\u0010\nJ\u000f\u00105\u001a\u00020\u0006H\u0014¢\u0006\u0004\b5\u0010\nJ\u000f\u00106\u001a\u00020\u0004H\u0014¢\u0006\u0004\b6\u0010\u0010J\u000f\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u0010\nJ\u000f\u00108\u001a\u00020\u0006H$¢\u0006\u0004\b8\u0010\nJ\u000f\u00109\u001a\u00020\u0006H$¢\u0006\u0004\b9\u0010\nJ\u000f\u0010:\u001a\u00020*H$¢\u0006\u0004\b:\u0010;R$\u0010=\u001a\u0004\u0018\u00010<8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/BaseCallNotifyFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/notify/callnotify/CallNotifyViewModel;", "Lbzg;", "", "isChecked", "", "dealCallNotifyShowContactName", "(Z)V", "closeNotifyShowContactName", "()V", "openNotifyShowContactName", "chooseDelayTime", "handleSmsReplySwitchChanged", "updateViewStatus", "needSendSmsPermission", "()Z", "dealCallStrangeNoNotifyEnable", "checkCallStrangePermission", "closeCallContactNotifyEnable", "openCallContactNotifyEnable", "isWearOS", "dealCallNotifySwitch", "checkCallPermission", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "switchButton", "yes", "setImportantForAccessibility", "(Lcom/xiaomi/fitness/widget/button/SwitchButton;Z)V", "closeCallNotify", "handleDelayNoticeSwitchChanged", "openCallNotify", "requestWearOSPermission", "requestPhonePermission", "needRequestCallLogPerm", "needRequestContactsPerm", "requestCallLogPermission", "", AccountInteractActivity.KEY_REQUEST_CODE, "requestContactsPermission", "(I)V", "requestSendSmsPermission", "", "permission", "showPermissionDeniedDialog", "(Ljava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "onGetInCallConfig", "needRequestReadContactsPerm", "toPermissionSetting", "loadInCallConfig", "updateInCallConfig", "getDid", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "inCall", "Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "getInCall", "()Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "setInCall", "(Lcom/xiaomi/fitness/settingitem/settingitem/InCall;)V", "<init>", "Companion", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBaseCallNotifyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCallNotifyFragment.kt\ncom/xiaomi/fitness/notify/callnotify/BaseCallNotifyFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,775:1\n254#2:776\n*S KotlinDebug\n*F\n+ 1 BaseCallNotifyFragment.kt\ncom/xiaomi/fitness/notify/callnotify/BaseCallNotifyFragment\n*L\n611#1:776\n*E\n"})
public abstract class BaseCallNotifyFragment extends Hilt_BaseCallNotifyFragment<CallNotifyViewModel, bzg> {

    @NotNull
    public static final String OPEN_IN_CALL_IN_REMIND = "open_in_call_in_remind";
    public static final int PERMISSION_SETTING_REQUEST_CODE = 1001;
    private static final int REQUEST_CODE_CALL_CONTACT = 3;
    private static final int REQUEST_CODE_CALL_LOG = 2;
    private static final int REQUEST_CODE_PHONE = 1;
    private static final int REQUEST_CODE_SEND_SMS = 6;
    private static final int REQUEST_CODE_STRANGE_CONTACT = 4;

    @NotNull
    public static final String TAG = "BaseCallNotifyFragment";

    @Nullable
    private InCall inCall;

    public BaseCallNotifyFragment() {
        super(tui.f35057b, 0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ bzg access$getMBinding(BaseCallNotifyFragment baseCallNotifyFragment) {
        return (bzg) baseCallNotifyFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CallNotifyViewModel access$getMViewModel(BaseCallNotifyFragment baseCallNotifyFragment) {
        return (CallNotifyViewModel) baseCallNotifyFragment.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkCallPermission() {
        ISwitchButton switchButton = ((bzg) getMBinding()).B.getSwitchButton();
        Intrinsics.checkNotNull(switchButton, "null cannot be cast to non-null type com.xiaomi.fitness.widget.button.SwitchButton");
        final SwitchButton switchButton2 = (SwitchButton) switchButton;
        setImportantForAccessibility(switchButton2, true);
        if (NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
            if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_CONTACTS")) {
                setImportantForAccessibility(switchButton2, false);
                ((bzg) getMBinding()).B.setSwitch(false);
                if (PermissionExtKt.supportMiuiPermissionEnable()) {
                    requestContactsPermission(3);
                    return;
                }
                NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                notifyUtil.showAlertPermissionDialog(childFragmentManager, q0j.V, new Function0() { // from class: g32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseCallNotifyFragment.checkCallPermission$lambda$31(this.f18537a);
                    }
                }, new Function0() { // from class: h32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseCallNotifyFragment.checkCallPermission$lambda$32(this.f19639a, switchButton2);
                    }
                });
                return;
            }
        } else if (isWearOS()) {
            Application application = ApplicationExtKt.getApplication();
            NotifyUtil notifyUtil2 = NotifyUtil.INSTANCE;
            String[] wearOsCallpermissionList = notifyUtil2.getWearOsCallpermissionList();
            if (!PermissionExtKt.isPermissionGranted(application, (String[]) Arrays.copyOf(wearOsCallpermissionList, wearOsCallpermissionList.length))) {
                setImportantForAccessibility(switchButton2, false);
                ((bzg) getMBinding()).B.setSwitch(false);
                if (PermissionExtKt.supportMiuiPermissionEnable()) {
                    requestWearOSPermission();
                    return;
                }
                FragmentManager childFragmentManager2 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                notifyUtil2.showDialog(childFragmentManager2, q0j.n, q0j.m, q0j.common_allow, q0j.common_reject, new Function0() { // from class: i32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseCallNotifyFragment.checkCallPermission$lambda$33(this.f20725a);
                    }
                }, new Function0() { // from class: j32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseCallNotifyFragment.checkCallPermission$lambda$34(this.f22367a, switchButton2);
                    }
                });
                return;
            }
            NotifyStartExtKt.getNotificationManagerImpl().setWearOSSettingCallSync(true);
        } else {
            if (!NotifyStartExtKt.getNotificationManagerImpl().isNotificationPolicyAccessGranted()) {
                setImportantForAccessibility(switchButton2, true);
                ((bzg) getMBinding()).B.setSwitch(false);
                NotifyUtil notifyUtil3 = NotifyUtil.INSTANCE;
                FragmentManager childFragmentManager3 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                notifyUtil3.showGoSettingDialog(childFragmentManager3, q0j.x, new Function0() { // from class: k32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseCallNotifyFragment.checkCallPermission$lambda$35(this.f23373a);
                    }
                });
                return;
            }
            Application application2 = ApplicationExtKt.getApplication();
            String[] phoneNotifyPermissionList = NotifyStartExtKt.getNotificationManagerImpl().getPhoneNotifyPermissionList();
            if (!PermissionExtKt.isPermissionGranted(application2, (String[]) Arrays.copyOf(phoneNotifyPermissionList, phoneNotifyPermissionList.length))) {
                setImportantForAccessibility(switchButton2, false);
                ((bzg) getMBinding()).B.setSwitch(false);
                if (PermissionExtKt.supportMiuiPermissionEnable()) {
                    requestPhonePermission();
                    return;
                }
                NotifyUtil notifyUtil4 = NotifyUtil.INSTANCE;
                FragmentManager childFragmentManager4 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                notifyUtil4.showDialog(childFragmentManager4, q0j.n, q0j.m, q0j.common_allow, q0j.common_reject, new Function0() { // from class: l32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseCallNotifyFragment.checkCallPermission$lambda$36(this.f24591a);
                    }
                }, new Function0() { // from class: m32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseCallNotifyFragment.checkCallPermission$lambda$37(this.f25699a, switchButton2);
                    }
                });
                return;
            }
        }
        openCallNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCallPermission$lambda$31(BaseCallNotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestContactsPermission(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCallPermission$lambda$32(BaseCallNotifyFragment this$0, SwitchButton switchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(switchButton, "$switchButton");
        this$0.setImportantForAccessibility(switchButton, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCallPermission$lambda$33(BaseCallNotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestWearOSPermission();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCallPermission$lambda$34(BaseCallNotifyFragment this$0, SwitchButton switchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(switchButton, "$switchButton");
        this$0.setImportantForAccessibility(switchButton, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCallPermission$lambda$35(BaseCallNotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SettingsPageUtil settingsPageUtil = SettingsPageUtilExtKt.getSettingsPageUtil();
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        settingsPageUtil.gotoOpenPolicyAccessActivity(mActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCallPermission$lambda$36(BaseCallNotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestPhonePermission();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCallPermission$lambda$37(BaseCallNotifyFragment this$0, SwitchButton switchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(switchButton, "$switchButton");
        this$0.setImportantForAccessibility(switchButton, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkCallStrangePermission() {
        if (NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
            if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_CONTACTS")) {
                ((bzg) getMBinding()).D.setSwitch(false);
                if (PermissionExtKt.supportMiuiPermissionEnable()) {
                    requestContactsPermission(4);
                    return;
                }
                NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                notifyUtil.showAlertPermissionDialog(childFragmentManager, q0j.V, new Function0() { // from class: m42
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseCallNotifyFragment.checkCallStrangePermission$lambda$25(this.f25732a);
                    }
                }, new Function0() { // from class: n42
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                });
                return;
            }
        } else {
            if (needRequestCallLogPerm()) {
                ((bzg) getMBinding()).D.setSwitch(false);
                if (PermissionExtKt.supportMiuiPermissionEnable()) {
                    requestCallLogPermission();
                    return;
                }
                NotifyUtil notifyUtil2 = NotifyUtil.INSTANCE;
                FragmentManager childFragmentManager2 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                notifyUtil2.showAlertPermissionDialog(childFragmentManager2, q0j.U, new Function0() { // from class: o42
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseCallNotifyFragment.checkCallStrangePermission$lambda$27(this.f28721a);
                    }
                }, new Function0() { // from class: p42
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                });
                return;
            }
            if (needRequestContactsPerm()) {
                ((bzg) getMBinding()).D.setSwitch(false);
                NotifyUtil notifyUtil3 = NotifyUtil.INSTANCE;
                FragmentManager childFragmentManager3 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                notifyUtil3.showAlertPermissionDialog(childFragmentManager3, q0j.V, new Function0() { // from class: q42
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseCallNotifyFragment.checkCallStrangePermission$lambda$29(this.f31065a);
                    }
                }, new Function0() { // from class: r42
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                });
                return;
            }
        }
        openCallContactNotifyEnable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCallStrangePermission$lambda$25(BaseCallNotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestContactsPermission(4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCallStrangePermission$lambda$27(BaseCallNotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestCallLogPermission();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCallStrangePermission$lambda$29(BaseCallNotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestContactsPermission(4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void chooseDelayTime() {
        final PickerDialog pickerDialogCreate = new PickerDialog.b("delay").setDialogTitle(q0j.j).setCustomLayoutId(tui.f35056a).setNegativeText(q0j.f30960b).setPositiveText(q0j.d).c(new PickerDialog.a() { // from class: com.xiaomi.fitness.notify.callnotify.BaseCallNotifyFragment$chooseDelayTime$pickerDialog$1
            @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
            public int getCount() {
                return 28;
            }

            @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
            public int getValue(int index) {
                return index + 3;
            }
        }).create();
        pickerDialogCreate.setValue(((CallNotifyViewModel) getMViewModel()).getDelayTime());
        pickerDialogCreate.setPickerHintTextPluralsRes(vxi.f37334b);
        pickerDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.notify.callnotify.BaseCallNotifyFragment.chooseDelayTime.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    BaseCallNotifyFragment.access$getMViewModel(BaseCallNotifyFragment.this).setDelayTime(pickerDialogCreate.getValue());
                    CallNotifyViewModel callNotifyViewModelAccess$getMViewModel = BaseCallNotifyFragment.access$getMViewModel(BaseCallNotifyFragment.this);
                    Context contextRequireContext = BaseCallNotifyFragment.this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    BaseCallNotifyFragment.access$getMBinding(BaseCallNotifyFragment.this).F.setRemindText(callNotifyViewModelAccess$getMViewModel.getDelayNoticeTimeStr(contextRequireContext));
                    BaseCallNotifyFragment.this.updateInCallConfig();
                }
            }
        });
        pickerDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void closeCallContactNotifyEnable() {
        InCall inCall = this.inCall;
        if (inCall != null) {
            inCall.setIncallContactNotifyEnabled(false);
        }
        ((bzg) getMBinding()).D.setSwitch(false);
        updateInCallConfig();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void closeCallNotify() {
        InCall inCall = this.inCall;
        Intrinsics.checkNotNull(inCall);
        inCall.setIncallNotifyEnabled(false);
        InCall inCall2 = this.inCall;
        if (inCall2 != null) {
            inCall2.setIncallNameDisplayEnabled(false);
        }
        ((bzg) getMBinding()).B.setSwitch(false);
        handleDelayNoticeSwitchChanged(false);
        updateInCallConfig();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void closeNotifyShowContactName() {
        InCall inCall = this.inCall;
        Intrinsics.checkNotNull(inCall);
        inCall.setIncallNameDisplayEnabled(false);
        ((bzg) getMBinding()).C.setSwitch(false);
        if (NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
            NotifyStartExtKt.getNotificationManagerImpl().updateInCallRemindState(false);
        }
        updateInCallConfig();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void dealCallNotifyShowContactName(boolean isChecked) {
        ISwitchButton switchButton = ((bzg) getMBinding()).C.getSwitchButton();
        Intrinsics.checkNotNull(switchButton, "null cannot be cast to non-null type com.xiaomi.fitness.widget.button.SwitchButton");
        final SwitchButton switchButton2 = (SwitchButton) switchButton;
        setImportantForAccessibility(switchButton2, true);
        if (!isChecked) {
            closeNotifyShowContactName();
            return;
        }
        final Function0 function0 = new Function0() { // from class: g42
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCallNotifyFragment.dealCallNotifyShowContactName$lambda$19(this.f18573a, switchButton2);
            }
        };
        if (!needRequestContactsPerm()) {
            openNotifyShowContactName();
            return;
        }
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            function0.invoke();
            return;
        }
        setImportantForAccessibility(switchButton2, false);
        ((bzg) getMBinding()).C.setSwitch(false);
        NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        notifyUtil.showAlertPermissionDialog(childFragmentManager, q0j.V, new Function0() { // from class: h42
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCallNotifyFragment.dealCallNotifyShowContactName$lambda$20(function0);
            }
        }, new Function0() { // from class: i42
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCallNotifyFragment.dealCallNotifyShowContactName$lambda$21(this.f20755a, switchButton2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dealCallNotifyShowContactName$lambda$19(final BaseCallNotifyFragment this$0, final SwitchButton switchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(switchButton, "$switchButton");
        PermissionExtKt.permission(this$0, "android.permission.READ_CONTACTS", this$0.getString(q0j.e0), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: a32
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.dealCallNotifyShowContactName$lambda$19$lambda$18(this.f565a, switchButton, (PermissionBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dealCallNotifyShowContactName$lambda$19$lambda$18(final BaseCallNotifyFragment this$0, final SwitchButton switchButton, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(switchButton, "$switchButton");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: r22
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.dealCallNotifyShowContactName$lambda$19$lambda$18$lambda$15(this.f32099a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: c32
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.dealCallNotifyShowContactName$lambda$19$lambda$18$lambda$17(this.f4878a, switchButton, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dealCallNotifyShowContactName$lambda$19$lambda$18$lambda$15(BaseCallNotifyFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AivsHelperExtKt.getInstance(AivsHelper.INSTANCE).syncNlpEngine();
        this$0.openNotifyShowContactName();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit dealCallNotifyShowContactName$lambda$19$lambda$18$lambda$17(final BaseCallNotifyFragment this$0, SwitchButton switchButton, final String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(switchButton, "$switchButton");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.setImportantForAccessibility(switchButton, true);
        ((bzg) this$0.getMBinding()).C.setSwitch(false);
        IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, it, fragmentActivityRequireActivity, null, null, null, new Function0() { // from class: l42
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCallNotifyFragment.dealCallNotifyShowContactName$lambda$19$lambda$18$lambda$17$lambda$16(this.f24622a, it);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dealCallNotifyShowContactName$lambda$19$lambda$18$lambda$17$lambda$16(BaseCallNotifyFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.showPermissionDeniedDialog(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dealCallNotifyShowContactName$lambda$20(Function0 requestPermission) {
        Intrinsics.checkNotNullParameter(requestPermission, "$requestPermission");
        requestPermission.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dealCallNotifyShowContactName$lambda$21(BaseCallNotifyFragment this$0, SwitchButton switchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(switchButton, "$switchButton");
        this$0.setImportantForAccessibility(switchButton, true);
        return Unit.INSTANCE;
    }

    private final void dealCallNotifySwitch(boolean isChecked) {
        if (isChecked) {
            checkCallPermission();
            return;
        }
        closeCallNotify();
        closeCallContactNotifyEnable();
        NotifyStartExtKt.getNotificationManagerImpl().updateInCallRemindState(false);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.50.1.1.22819"), "name", "call_reminder_btn", "result", Boolean.FALSE, "source", "device_tab");
        if (isWearOS()) {
            NotifyStartExtKt.getNotificationManagerImpl().setWearOSSettingCallSync(false);
        }
    }

    private final void dealCallStrangeNoNotifyEnable(boolean isChecked) {
        if (isChecked) {
            checkCallStrangePermission();
        } else {
            closeCallContactNotifyEnable();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleDelayNoticeSwitchChanged(boolean isChecked) {
        ((CallNotifyViewModel) getMViewModel()).setDelayNoticeEnabled(isChecked);
        ((bzg) getMBinding()).F.setEnable(isChecked);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleSmsReplySwitchChanged(boolean isChecked) {
        ISwitchButton switchButton = ((bzg) getMBinding()).H.getSwitchButton();
        Intrinsics.checkNotNull(switchButton, "null cannot be cast to non-null type com.xiaomi.fitness.widget.button.SwitchButton");
        final SwitchButton switchButton2 = (SwitchButton) switchButton;
        if (isChecked && needSendSmsPermission()) {
            setImportantForAccessibility(switchButton2, false);
            ((bzg) getMBinding()).H.setSwitch(false);
            if (PermissionExtKt.supportMiuiPermissionEnable()) {
                requestSendSmsPermission();
                return;
            }
            NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            notifyUtil.showAlertPermissionDialog(childFragmentManager, q0j.Y, new Function0() { // from class: v42
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseCallNotifyFragment.handleSmsReplySwitchChanged$lambda$22(this.f36458a);
                }
            }, new Function0() { // from class: w42
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseCallNotifyFragment.handleSmsReplySwitchChanged$lambda$23(this.f37595a, switchButton2);
                }
            });
            return;
        }
        Logger.d(TAG, "handleSmsReplySwitchChanged " + isChecked);
        setImportantForAccessibility(switchButton2, true);
        ((bzg) getMBinding()).H.setSwitch(isChecked);
        switchButton2.announceForAccessibility(switchButton2.getContentDescription());
        InCall inCall = this.inCall;
        Intrinsics.checkNotNull(inCall);
        inCall.setIncomingCallReply(isChecked);
        ((bzg) getMBinding()).G.setEnable(isChecked);
        updateInCallConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleSmsReplySwitchChanged$lambda$22(BaseCallNotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestSendSmsPermission();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleSmsReplySwitchChanged$lambda$23(BaseCallNotifyFragment this$0, SwitchButton switchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(switchButton, "$switchButton");
        this$0.setImportantForAccessibility(switchButton, true);
        return Unit.INSTANCE;
    }

    private final boolean isWearOS() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(getDid());
        if (wearableDeviceModel != null) {
            return DeviceModelExtKt.isWearOS(wearableDeviceModel);
        }
        return false;
    }

    private final boolean needRequestCallLogPerm() {
        if (Build.VERSION.SDK_INT >= 28) {
            return NotifyUtil.INSTANCE.shouldRequestPermission("android.permission.READ_CALL_LOG");
        }
        return false;
    }

    private final boolean needRequestContactsPerm() {
        return NotifyUtil.INSTANCE.shouldRequestPermission("android.permission.READ_CONTACTS");
    }

    private final boolean needSendSmsPermission() {
        return NotifyUtil.INSTANCE.shouldRequestPermission("android.permission.SEND_SMS");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetInCallConfig$lambda$24(BaseCallNotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void openCallContactNotifyEnable() {
        InCall inCall = this.inCall;
        if (inCall != null) {
            inCall.setIncallContactNotifyEnabled(true);
        }
        ((bzg) getMBinding()).D.setSwitch(true);
        updateInCallConfig();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void openCallNotify() {
        InCall inCall = this.inCall;
        Intrinsics.checkNotNull(inCall);
        inCall.setIncallNotifyEnabled(true);
        InCall inCall2 = this.inCall;
        Intrinsics.checkNotNull(inCall2);
        inCall2.setIncallNameDisplayEnabled(true);
        ISwitchButton switchButton = ((bzg) getMBinding()).B.getSwitchButton();
        Intrinsics.checkNotNull(switchButton, "null cannot be cast to non-null type com.xiaomi.fitness.widget.button.SwitchButton");
        setImportantForAccessibility((SwitchButton) switchButton, true);
        ((bzg) getMBinding()).B.setSwitch(true);
        SwitchButtonSingleLineTextView btnStrangeNoNotify = ((bzg) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(btnStrangeNoNotify, "btnStrangeNoNotify");
        if (btnStrangeNoNotify.getVisibility() == 0) {
            if (needRequestReadContactsPerm()) {
                ((bzg) getMBinding()).D.setSwitch(false);
            } else {
                SwitchButtonSingleLineTextView switchButtonSingleLineTextView = ((bzg) getMBinding()).D;
                InCall inCall3 = this.inCall;
                Intrinsics.checkNotNull(inCall3);
                switchButtonSingleLineTextView.setSwitch(inCall3.isIncallContactNotifyEnabled());
            }
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.50.1.1.22819"), "name", "call_reminder_btn", "result", Boolean.TRUE, "source", "device_tab");
        updateInCallConfig();
        NotifyStartExtKt.getNotificationManagerImpl().updateInCallRemindState(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void openNotifyShowContactName() {
        ISwitchButton switchButton = ((bzg) getMBinding()).C.getSwitchButton();
        Intrinsics.checkNotNull(switchButton, "null cannot be cast to non-null type com.xiaomi.fitness.widget.button.SwitchButton");
        setImportantForAccessibility((SwitchButton) switchButton, true);
        ((bzg) getMBinding()).C.setSwitch(true);
        InCall inCall = this.inCall;
        Intrinsics.checkNotNull(inCall);
        inCall.setIncallNameDisplayEnabled(true);
        if (NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
            if (Build.VERSION.SDK_INT >= 31) {
                NotifyStartExtKt.getNotificationManagerImpl().updateInCallRemindState(PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_PHONE_STATE") && NotifyPreference.INSTANCE.isInCallOptimizationOpen());
            } else {
                NotifyStartExtKt.getNotificationManagerImpl().updateInCallRemindState(true);
            }
        }
        updateInCallConfig();
    }

    private final void requestCallLogPermission() {
        PermissionExtKt.permission(this, "android.permission.READ_CALL_LOG", getString(q0j.h0), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: k42
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.requestCallLogPermission$lambda$48(this.f23409a, (PermissionBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCallLogPermission$lambda$48(final BaseCallNotifyFragment this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: z32
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.requestCallLogPermission$lambda$48$lambda$45(this.f40829a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: a42
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.requestCallLogPermission$lambda$48$lambda$47(this.f593a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCallLogPermission$lambda$48$lambda$45(BaseCallNotifyFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.checkCallStrangePermission();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCallLogPermission$lambda$48$lambda$47(final BaseCallNotifyFragment this$0, final String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, it, fragmentActivityRequireActivity, null, null, null, new Function0() { // from class: y32
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCallNotifyFragment.requestCallLogPermission$lambda$48$lambda$47$lambda$46(this.f39740a, it);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCallLogPermission$lambda$48$lambda$47$lambda$46(BaseCallNotifyFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.showPermissionDeniedDialog(it);
        return Unit.INSTANCE;
    }

    private final void requestContactsPermission(final int requestCode) {
        PermissionExtKt.permission(this, "android.permission.READ_CONTACTS", getString(q0j.e0), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: b32
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.requestContactsPermission$lambda$52(requestCode, this, (PermissionBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContactsPermission$lambda$52(final int i, final BaseCallNotifyFragment this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: d32
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.requestContactsPermission$lambda$52$lambda$49(i, this$0, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: e32
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.requestContactsPermission$lambda$52$lambda$51(this.f16207a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContactsPermission$lambda$52$lambda$49(int i, BaseCallNotifyFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d(TAG, "granted " + it);
        if (i == 3) {
            this$0.checkCallPermission();
        } else if (i == 4) {
            this$0.checkCallStrangePermission();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContactsPermission$lambda$52$lambda$51(final BaseCallNotifyFragment this$0, final String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, it, fragmentActivityRequireActivity, null, null, null, new Function0() { // from class: f32
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCallNotifyFragment.requestContactsPermission$lambda$52$lambda$51$lambda$50(this.f17350a, it);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContactsPermission$lambda$52$lambda$51$lambda$50(BaseCallNotifyFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.showPermissionDeniedDialog(it);
        return Unit.INSTANCE;
    }

    private final void requestPhonePermission() {
        NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
        String[] needRequestPhoneNotifyPermissionList = notifyUtil.getNeedRequestPhoneNotifyPermissionList();
        PermissionExtKt.permissions(this, (String[]) Arrays.copyOf(needRequestPhoneNotifyPermissionList, needRequestPhoneNotifyPermissionList.length), notifyUtil.getNeedRequestPhoneNotifyPermissionDescList(), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: w32
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.requestPhonePermission$lambda$44(this.f37503a, (MultiplePermissionsBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPhonePermission$lambda$44(final BaseCallNotifyFragment this$0, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: t42
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCallNotifyFragment.requestPhonePermission$lambda$44$lambda$41(this.f34285a);
            }
        });
        permissions.denied(new Function1() { // from class: u42
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.requestPhonePermission$lambda$44$lambda$43(this.f35351a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPhonePermission$lambda$44$lambda$41(BaseCallNotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkCallPermission();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPhonePermission$lambda$44$lambda$43(final BaseCallNotifyFragment this$0, final List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.isEmpty()) {
            IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
            String str = (String) it.get(0);
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, str, fragmentActivityRequireActivity, it, null, null, new Function0() { // from class: b42
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseCallNotifyFragment.requestPhonePermission$lambda$44$lambda$43$lambda$42(this.f3770a, it);
                }
            }, 24, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPhonePermission$lambda$44$lambda$43$lambda$42(BaseCallNotifyFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.showPermissionDeniedDialog((String) it.get(0));
        return Unit.INSTANCE;
    }

    private final void requestSendSmsPermission() {
        PermissionExtKt.permission(this, "android.permission.SEND_SMS", getString(q0j.j0), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: s22
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.requestSendSmsPermission$lambda$56(this.f33194a, (PermissionBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestSendSmsPermission$lambda$56(final BaseCallNotifyFragment this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: t22
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.requestSendSmsPermission$lambda$56$lambda$53(this.f34221a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: u22
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.requestSendSmsPermission$lambda$56$lambda$55(this.f35303a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestSendSmsPermission$lambda$56$lambda$53(BaseCallNotifyFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.handleSmsReplySwitchChanged(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestSendSmsPermission$lambda$56$lambda$55(final BaseCallNotifyFragment this$0, final String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, it, fragmentActivityRequireActivity, null, null, null, new Function0() { // from class: s42
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCallNotifyFragment.requestSendSmsPermission$lambda$56$lambda$55$lambda$54(this.f33259a, it);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestSendSmsPermission$lambda$56$lambda$55$lambda$54(BaseCallNotifyFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.showPermissionDeniedDialog(it);
        return Unit.INSTANCE;
    }

    private final void requestWearOSPermission() {
        NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
        String[] wearOsCallpermissionList = notifyUtil.getWearOsCallpermissionList();
        PermissionExtKt.permissions(this, (String[]) Arrays.copyOf(wearOsCallpermissionList, wearOsCallpermissionList.length), notifyUtil.getWearOSPhoneNotifyPermissionDescList(), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: f42
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.requestWearOSPermission$lambda$40(this.f17379a, (MultiplePermissionsBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestWearOSPermission$lambda$40(final BaseCallNotifyFragment this$0, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: v22
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCallNotifyFragment.requestWearOSPermission$lambda$40$lambda$38(this.f36403a);
            }
        });
        permissions.denied(new Function1() { // from class: w22
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.requestWearOSPermission$lambda$40$lambda$39(this.f37469a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestWearOSPermission$lambda$40$lambda$38(BaseCallNotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkCallPermission();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestWearOSPermission$lambda$40$lambda$39(BaseCallNotifyFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.isEmpty()) {
            this$0.showPermissionDeniedDialog((String) it.get(0));
        }
        Logger.d(TAG, "denied " + it);
        return Unit.INSTANCE;
    }

    private final void setImportantForAccessibility(SwitchButton switchButton, boolean yes) {
        switchButton.setImportantForAccessibility(yes ? 1 : 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(BaseCallNotifyFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dealCallNotifySwitch(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(BaseCallNotifyFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dealCallStrangeNoNotifyEnable(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$14(final BaseCallNotifyFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z2 = false;
        if (PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_PHONE_STATE")) {
            NotifyPreference.INSTANCE.isInCallOptimizationOpen(z);
            NotificationManagerInter notificationManagerImpl = NotifyStartExtKt.getNotificationManagerImpl();
            if (z && ((bzg) this$0.getMBinding()).C.getSwitch()) {
                z2 = true;
            }
            notificationManagerImpl.updateInCallRemindState(z2);
            return;
        }
        ISwitchButton switchButton = ((bzg) this$0.getMBinding()).A.getSwitchButton();
        Intrinsics.checkNotNull(switchButton, "null cannot be cast to non-null type com.xiaomi.fitness.widget.button.SwitchButton");
        final SwitchButton switchButton2 = (SwitchButton) switchButton;
        if (!z) {
            NotifyPreference.INSTANCE.isInCallOptimizationOpen(false);
            NotifyStartExtKt.getNotificationManagerImpl().updateInCallRemindState(false);
            return;
        }
        final Function0 function0 = new Function0() { // from class: c42
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCallNotifyFragment.setListener$lambda$14$lambda$11(this.f4906a, switchButton2);
            }
        };
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            function0.invoke();
            return;
        }
        this$0.setImportantForAccessibility(switchButton2, false);
        ((bzg) this$0.getMBinding()).A.setSwitch(false);
        NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
        FragmentManager childFragmentManager = this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        notifyUtil.showAlertPermissionDialog(childFragmentManager, q0j.i0, new Function0() { // from class: d42
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCallNotifyFragment.setListener$lambda$14$lambda$12(function0);
            }
        }, new Function0() { // from class: e42
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCallNotifyFragment.setListener$lambda$14$lambda$13(this.f16241a, switchButton2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$14$lambda$11(final BaseCallNotifyFragment this$0, final SwitchButton switchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(switchButton, "$switchButton");
        PermissionExtKt.permission(this$0, "android.permission.READ_PHONE_STATE", this$0.getString(q0j.i0), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: x22
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.setListener$lambda$14$lambda$11$lambda$10(this.f38596a, switchButton, (PermissionBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$14$lambda$11$lambda$10(final BaseCallNotifyFragment this$0, final SwitchButton switchButton, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(switchButton, "$switchButton");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: y22
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.setListener$lambda$14$lambda$11$lambda$10$lambda$7(this.f39703a, switchButton, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: z22
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCallNotifyFragment.setListener$lambda$14$lambda$11$lambda$10$lambda$9(this.f40798a, switchButton, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$14$lambda$11$lambda$10$lambda$7(BaseCallNotifyFragment this$0, SwitchButton switchButton, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(switchButton, "$switchButton");
        Intrinsics.checkNotNullParameter(it, "it");
        NotifyPreference.INSTANCE.isInCallOptimizationOpen(true);
        this$0.setImportantForAccessibility(switchButton, true);
        ((bzg) this$0.getMBinding()).A.setSwitch(true);
        NotifyStartExtKt.getNotificationManagerImpl().updateInCallRemindState(((bzg) this$0.getMBinding()).C.getSwitch());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$14$lambda$11$lambda$10$lambda$9(final BaseCallNotifyFragment this$0, SwitchButton switchButton, final String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(switchButton, "$switchButton");
        Intrinsics.checkNotNullParameter(it, "it");
        NotifyPreference.INSTANCE.isInCallOptimizationOpen(false);
        this$0.setImportantForAccessibility(switchButton, true);
        ((bzg) this$0.getMBinding()).A.setSwitch(false);
        NotifyStartExtKt.getNotificationManagerImpl().updateInCallRemindState(false);
        IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, it, fragmentActivityRequireActivity, null, null, null, new Function0() { // from class: n32
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCallNotifyFragment.setListener$lambda$14$lambda$11$lambda$10$lambda$9$lambda$8(this.f27498a, it);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$14$lambda$11$lambda$10$lambda$9$lambda$8(BaseCallNotifyFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.showPermissionDeniedDialog(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$14$lambda$12(Function0 requestPermission) {
        Intrinsics.checkNotNullParameter(requestPermission, "$requestPermission");
        requestPermission.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$14$lambda$13(BaseCallNotifyFragment this$0, SwitchButton switchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(switchButton, "$switchButton");
        this$0.setImportantForAccessibility(switchButton, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(BaseCallNotifyFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleSmsReplySwitchChanged(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$3(BaseCallNotifyFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((CallNotifyViewModel) this$0.getMViewModel()).getIsHuaMiSupport()) {
            BaseFragmentExKt.gotoPage(this$0, HuamiSmsReplyFragment.class, null);
        } else if (((CallNotifyViewModel) this$0.getMViewModel()).getIsBleDevice()) {
            BaseFragmentExKt.gotoPage(this$0, BleSmsReplyFragment.class, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$4(BaseCallNotifyFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleDelayNoticeSwitchChanged(z);
        this$0.updateInCallConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$5(BaseCallNotifyFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dealCallNotifyShowContactName(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$6(BaseCallNotifyFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.chooseDelayTime();
    }

    private final void showPermissionDeniedDialog(String permission) {
        NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        notifyUtil.showGoSettingDialog(childFragmentManager, NotifyStartExtKt.getNotificationManagerImpl().getPermissionName(permission), new Function0() { // from class: j42
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCallNotifyFragment.showPermissionDeniedDialog$lambda$57(this.f22394a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPermissionDeniedDialog$lambda$57(BaseCallNotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.toPermissionSetting();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void updateViewStatus() {
        if (this.inCall == null) {
            return;
        }
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean(OPEN_IN_CALL_IN_REMIND, false) : false;
        boolean z2 = true;
        if (isWearOS()) {
            SwitchButtonTwoLineTextView switchButtonTwoLineTextView = ((bzg) getMBinding()).B;
            if (NotifyStartExtKt.getNotificationManagerImpl().isCallSyncResult()) {
                Application application = ApplicationExtKt.getApplication();
                String[] wearOsCallpermissionList = NotifyUtil.INSTANCE.getWearOsCallpermissionList();
                z2 = PermissionExtKt.isPermissionGranted(application, (String[]) Arrays.copyOf(wearOsCallpermissionList, wearOsCallpermissionList.length));
            }
            switchButtonTwoLineTextView.setSwitch(z2);
        } else if (NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
            SwitchButtonTwoLineTextView switchButtonTwoLineTextView2 = ((bzg) getMBinding()).B;
            if (!z) {
                if (PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_CONTACTS")) {
                    InCall inCall = this.inCall;
                    Intrinsics.checkNotNull(inCall);
                    if (inCall.isIncallNotifyEnabled()) {
                        InCall inCall2 = this.inCall;
                        Intrinsics.checkNotNull(inCall2);
                        if (!inCall2.isIncallNameDisplayEnabled()) {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
            }
            switchButtonTwoLineTextView2.setSwitch(z2);
        } else {
            SwitchButtonTwoLineTextView switchButtonTwoLineTextView3 = ((bzg) getMBinding()).B;
            if (!z) {
                if (NotifyStartExtKt.getNotificationManagerImpl().isNotificationPolicyAccessGranted()) {
                    Application application2 = ApplicationExtKt.getApplication();
                    NotificationManagerInter notificationManagerImpl = NotifyStartExtKt.getNotificationManagerImpl();
                    InCall inCall3 = this.inCall;
                    Intrinsics.checkNotNull(inCall3);
                    String[] filterPhoneNotifyPermissionList = notificationManagerImpl.getFilterPhoneNotifyPermissionList(inCall3.isIncallNotifyEnabled(), AppUtil.INSTANCE.isPlayChannel());
                    if (PermissionExtKt.isPermissionGranted(application2, (String[]) Arrays.copyOf(filterPhoneNotifyPermissionList, filterPhoneNotifyPermissionList.length))) {
                        InCall inCall4 = this.inCall;
                        Intrinsics.checkNotNull(inCall4);
                        if (inCall4.isIncallNotifyEnabled()) {
                            InCall inCall5 = this.inCall;
                            Intrinsics.checkNotNull(inCall5);
                            if (!inCall5.isIncallNameDisplayEnabled()) {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
            }
            switchButtonTwoLineTextView3.setSwitch(z2);
        }
        if (needRequestReadContactsPerm()) {
            ((bzg) getMBinding()).C.setSwitch(false);
            ((bzg) getMBinding()).D.setSwitch(false);
        } else {
            SwitchButtonTwoLineTextView switchButtonTwoLineTextView4 = ((bzg) getMBinding()).C;
            InCall inCall6 = this.inCall;
            Intrinsics.checkNotNull(inCall6);
            switchButtonTwoLineTextView4.setSwitch(inCall6.isIncallNameDisplayEnabled());
            SwitchButtonSingleLineTextView switchButtonSingleLineTextView = ((bzg) getMBinding()).D;
            InCall inCall7 = this.inCall;
            Intrinsics.checkNotNull(inCall7);
            switchButtonSingleLineTextView.setSwitch(inCall7.isIncallContactNotifyEnabled());
        }
        if (((CallNotifyViewModel) getMViewModel()).getIsDeviceSupportSMSReply()) {
            InCall inCall8 = this.inCall;
            Intrinsics.checkNotNull(inCall8);
            boolean zIsIncomingCallReply = inCall8.isIncomingCallReply();
            if (needSendSmsPermission()) {
                ((bzg) getMBinding()).H.setSwitch(false);
                ((bzg) getMBinding()).G.setEnable(false);
            } else {
                ((bzg) getMBinding()).H.setSwitch(zIsIncomingCallReply);
                ((bzg) getMBinding()).G.setEnable(zIsIncomingCallReply);
            }
            boolean zIsDelayNoticeSwitchOn = ((CallNotifyViewModel) getMViewModel()).isDelayNoticeSwitchOn();
            ((bzg) getMBinding()).E.setSwitch(zIsDelayNoticeSwitchOn);
            ((bzg) getMBinding()).F.setEnable(zIsDelayNoticeSwitchOn);
            CallNotifyViewModel callNotifyViewModel = (CallNotifyViewModel) getMViewModel();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            ((bzg) getMBinding()).F.setRemindText(callNotifyViewModel.getDelayNoticeTimeStr(contextRequireContext));
        }
    }

    @NotNull
    public abstract String getDid();

    @Nullable
    public final InCall getInCall() {
        return this.inCall;
    }

    public abstract void loadInCallConfig();

    public boolean needRequestReadContactsPerm() {
        if (NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
            return needRequestContactsPerm();
        }
        return needRequestCallLogPerm() || needRequestContactsPerm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onGetInCallConfig() {
        CallNotifyViewModel callNotifyViewModel = (CallNotifyViewModel) getMViewModel();
        InCall inCall = this.inCall;
        Intrinsics.checkNotNull(inCall);
        callNotifyViewModel.setIncall(inCall);
        updateViewStatus();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: x32
            @Override // java.lang.Runnable
            public final void run() {
                BaseCallNotifyFragment.onGetInCallConfig$lambda$24(this.f38630a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(q0j.l);
        boolean z = false;
        ((bzg) getMBinding()).D.setVisibility(RomUtils.isXiaomi() ? 0 : 8);
        if (((CallNotifyViewModel) getMViewModel()).getIsDeviceSupportSMSReply()) {
            ((bzg) getMBinding()).H.setVisibility(0);
            ((bzg) getMBinding()).G.setVisibility(0);
            ((bzg) getMBinding()).E.setVisibility(0);
            ((bzg) getMBinding()).F.setVisibility(0);
        }
        if (NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
            SwitchButtonTwoLineTextView btnCallNotifyOpen = ((bzg) getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(btnCallNotifyOpen, "btnCallNotifyOpen");
            ViewExtKt.gone(btnCallNotifyOpen);
            SwitchButtonSingleLineTextView btnStrangeNoNotify = ((bzg) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(btnStrangeNoNotify, "btnStrangeNoNotify");
            ViewExtKt.gone(btnStrangeNoNotify);
            SwitchButtonTwoLineTextView btnCallNotifyShowName = ((bzg) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(btnCallNotifyShowName, "btnCallNotifyShowName");
            ViewExtKt.visible(btnCallNotifyShowName);
            SwitchButtonSingleLineTextView delayNoticeView = ((bzg) getMBinding()).E;
            Intrinsics.checkNotNullExpressionValue(delayNoticeView, "delayNoticeView");
            ViewExtKt.gone(delayNoticeView);
            RightArrowSingleLineTextView delayTimeView = ((bzg) getMBinding()).F;
            Intrinsics.checkNotNullExpressionValue(delayTimeView, "delayTimeView");
            ViewExtKt.gone(delayTimeView);
            if (Build.VERSION.SDK_INT >= 31) {
                SwitchButtonTwoLineTextView btnCallNotifyForPhoneState = ((bzg) getMBinding()).A;
                Intrinsics.checkNotNullExpressionValue(btnCallNotifyForPhoneState, "btnCallNotifyForPhoneState");
                ViewExtKt.visible(btnCallNotifyForPhoneState);
                SwitchButtonTwoLineTextView switchButtonTwoLineTextView = ((bzg) getMBinding()).A;
                if (PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_PHONE_STATE") && NotifyPreference.INSTANCE.isInCallOptimizationOpen()) {
                    z = true;
                }
                switchButtonTwoLineTextView.setSwitch(z);
            } else {
                SwitchButtonTwoLineTextView btnCallNotifyForPhoneState2 = ((bzg) getMBinding()).A;
                Intrinsics.checkNotNullExpressionValue(btnCallNotifyForPhoneState2, "btnCallNotifyForPhoneState");
                ViewExtKt.gone(btnCallNotifyForPhoneState2);
            }
        }
        if (isWearOS()) {
            SwitchButtonTwoLineTextView btnCallNotifyShowName2 = ((bzg) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(btnCallNotifyShowName2, "btnCallNotifyShowName");
            ViewExtKt.gone(btnCallNotifyShowName2);
            SwitchButtonSingleLineTextView btnStrangeNoNotify2 = ((bzg) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(btnStrangeNoNotify2, "btnStrangeNoNotify");
            ViewExtKt.gone(btnStrangeNoNotify2);
            ((bzg) getMBinding()).B.getVisibility();
        }
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        loadInCallConfig();
    }

    public final void setInCall(@Nullable InCall inCall) {
        this.inCall = inCall;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((bzg) getMBinding()).B.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: o32
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                BaseCallNotifyFragment.setListener$lambda$0(this.f28686a, z, iSwitchButton);
            }
        });
        ((bzg) getMBinding()).D.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: p32
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                BaseCallNotifyFragment.setListener$lambda$1(this.f29952a, z, iSwitchButton);
            }
        });
        ((bzg) getMBinding()).H.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: q32
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                BaseCallNotifyFragment.setListener$lambda$2(this.f31034a, z, iSwitchButton);
            }
        });
        ((bzg) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: r32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseCallNotifyFragment.setListener$lambda$3(this.f32128a, view);
            }
        });
        ((bzg) getMBinding()).E.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: s32
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                BaseCallNotifyFragment.setListener$lambda$4(this.f33226a, z, iSwitchButton);
            }
        });
        ((bzg) getMBinding()).C.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: t32
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                BaseCallNotifyFragment.setListener$lambda$5(this.f34253a, z, iSwitchButton);
            }
        });
        ((bzg) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: u32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseCallNotifyFragment.setListener$lambda$6(this.f35328a, view);
            }
        });
        ((bzg) getMBinding()).A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: v32
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                BaseCallNotifyFragment.setListener$lambda$14(this.f36427a, z, iSwitchButton);
            }
        });
    }

    public void toPermissionSetting() {
        String packageName;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        FragmentActivity activity = getActivity();
        if (activity == null || (packageName = activity.getPackageName()) == null) {
            packageName = "";
        }
        intent.setData(Uri.fromParts("package", packageName, null));
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.startActivityForResult(intent, 1001);
        }
    }

    public abstract void updateInCallConfig();
}
