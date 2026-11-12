package com.xiaomi.fitness.devicesettings.guide;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.guide.GuideOpenPhoneCallFragment;
import com.xiaomi.fitness.devicesettings.utils.ZenUtils;
import com.xiaomi.fitness.notify.export.NotificationManagerExportInter;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import com.xiaomi.fitness.ubox.export.GuideNavigator;
import defpackage.eui;
import defpackage.wg6;
import defpackage.wzi;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00011B\u0007¢\u0006\u0004\b0\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J0\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0002\b\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u00042\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0002\b\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010#\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/guide/GuideOpenPhoneCallFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationViewModel;", "Lwg6;", "", "toSystemSettingPage", "()V", "uboxNextPage", "", "isInCallOptimizationOpen", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/common/extensions/MultiplePermissionsBuilder;", "Lkotlin/ExtensionFunctionType;", "extension", "requestContactsPermission", "(ZLkotlin/jvm/functions/Function1;)V", "requestPhonePermission", "(Lkotlin/jvm/functions/Function1;)V", "", "permission", "showPermissionDeniedDialog", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onBackPressed", "()Z", "bindView", "(Lwg6;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "guideNavigator", "Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "getGuideNavigator", "()Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "setGuideNavigator", "(Lcom/xiaomi/fitness/ubox/export/GuideNavigator;)V", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideOpenPhoneCallFragment extends Hilt_GuideOpenPhoneCallFragment<GuideNotificationViewModel, wg6> {

    @NotNull
    private static final String TAG = "GuideOpenPhoneCallFragment";
    public GuideNavigator guideNavigator;

    @Nullable
    private final WearableDeviceModel mDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(GuideOpenPhoneCallFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.50.1.1.22813"), "name", "device_intialize_ignore", "source", "device_intialize_callreminder_page");
        this$0.toSystemSettingPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$28(wg6 this_bindView, final GuideOpenPhoneCallFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final boolean zIsChecked = this_bindView.D.isChecked();
        if (!zIsChecked && !PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_PHONE_STATE", "android.permission.READ_CONTACTS")) {
            this_bindView.A.callOnClick();
        } else {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.50.1.1.22813"), "name", "device_intialize_open", "source", "device_intialize_callreminder_page");
            ((GuideNotificationViewModel) this$0.getMViewModel()).getCallEnable(new Function1() { // from class: j8b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27(this.f22520a, zIsChecked, (InCall) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$28$lambda$27(final GuideOpenPhoneCallFragment this$0, final boolean z, InCall inCall) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (inCall == null || this$0.mDeviceModel == null) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.q);
            }
            return Unit.INSTANCE;
        }
        if (NotifyHelperExtKt.getNotificationManagerExport().isDualCallWithOutBle()) {
            final boolean z2 = true;
            if (Build.VERSION.SDK_INT >= 31 && (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_PHONE_STATE") || !NotifyHelperExtKt.getNotificationManagerExport().isInCallOptimizationOpen())) {
                z2 = false;
            }
            if (z2 && PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_CONTACTS")) {
                ((GuideNotificationViewModel) this$0.getMViewModel()).updateInCallConfig(z);
                NotifyHelperExtKt.getNotificationManagerExport().setInCallOptimizationOpen();
                this$0.toSystemSettingPage();
            } else if (PermissionExtKt.supportMiuiPermissionEnable()) {
                this$0.requestContactsPermission(z2, new Function1() { // from class: c8b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$6(this.f5043a, z, (MultiplePermissionsBuilder) obj);
                    }
                });
            } else {
                NotificationManagerExportInter notificationManagerExport = NotifyHelperExtKt.getNotificationManagerExport();
                FragmentManager parentFragmentManager = this$0.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                notificationManagerExport.showAlertPermissionDialog(parentFragmentManager, wzi.Ve, new Function0() { // from class: d8b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$12(this.f15210a, z2, z);
                    }
                }, new Function0() { // from class: e8b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                });
            }
        } else {
            Application application = ApplicationExtKt.getApplication();
            String[] filterPhoneNotifyPermissionList = NotifyHelperExtKt.getNotificationManagerExport().getFilterPhoneNotifyPermissionList(inCall.isIncallNotifyEnabled(), AppUtil.INSTANCE.isPlayChannel());
            if (PermissionExtKt.isPermissionGranted(application, (String[]) Arrays.copyOf(filterPhoneNotifyPermissionList, filterPhoneNotifyPermissionList.length)) && NotifyHelperExtKt.getNotificationManagerExport().isNotificationPolicyAccessGranted()) {
                ((GuideNotificationViewModel) this$0.getMViewModel()).updateInCallConfig(z);
                this$0.toSystemSettingPage();
            } else if (NotifyHelperExtKt.getNotificationManagerExport().isNotificationPolicyAccessGranted()) {
                Application application2 = ApplicationExtKt.getApplication();
                String[] phoneNotifyPermissionList = NotifyHelperExtKt.getNotificationManagerExport().getPhoneNotifyPermissionList();
                if (!PermissionExtKt.isPermissionGranted(application2, (String[]) Arrays.copyOf(phoneNotifyPermissionList, phoneNotifyPermissionList.length))) {
                    if (PermissionExtKt.supportMiuiPermissionEnable()) {
                        this$0.requestPhonePermission(new Function1() { // from class: g8b
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$19(this.f18714a, z, (MultiplePermissionsBuilder) obj);
                            }
                        });
                    } else {
                        NotificationManagerExportInter notificationManagerExport2 = NotifyHelperExtKt.getNotificationManagerExport();
                        FragmentManager parentFragmentManager2 = this$0.getParentFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "getParentFragmentManager(...)");
                        notificationManagerExport2.showDialog(parentFragmentManager2, wzi.Qe, wzi.Pe, wzi.common_allow, wzi.common_reject, new Function0() { // from class: h8b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$25(this.f19799a, z);
                            }
                        }, new Function0() { // from class: i8b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
            } else {
                NotificationManagerExportInter notificationManagerExport3 = NotifyHelperExtKt.getNotificationManagerExport();
                FragmentManager parentFragmentManager3 = this$0.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager3, "getParentFragmentManager(...)");
                notificationManagerExport3.showGoSettingDialog(parentFragmentManager3, wzi.Re, new Function0() { // from class: f8b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$14(this.f17521a);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$28$lambda$27$lambda$12(final GuideOpenPhoneCallFragment this$0, boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestContactsPermission(z, new Function1() { // from class: t8b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$12$lambda$11(this.f34449a, z2, (MultiplePermissionsBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$28$lambda$27$lambda$12$lambda$11(final GuideOpenPhoneCallFragment this$0, final boolean z, MultiplePermissionsBuilder requestContactsPermission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(requestContactsPermission, "$this$requestContactsPermission");
        requestContactsPermission.allGranted(new Function0() { // from class: k8b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$12$lambda$11$lambda$7(this.f23584a, z);
            }
        });
        requestContactsPermission.denied(new Function1() { // from class: n8b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$12$lambda$11$lambda$10(this.f27650a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$28$lambda$27$lambda$12$lambda$11$lambda$10(final GuideOpenPhoneCallFragment this$0, final List deniedList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deniedList, "deniedList");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null && (!deniedList.isEmpty())) {
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), (String) deniedList.get(0), mActivity, deniedList, null, null, new Function0() { // from class: m8b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8(this.f25880a, deniedList);
                }
            }, 24, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$28$lambda$27$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8(GuideOpenPhoneCallFragment this$0, List deniedList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deniedList, "$deniedList");
        this$0.showPermissionDeniedDialog((String) deniedList.get(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$28$lambda$27$lambda$12$lambda$11$lambda$7(GuideOpenPhoneCallFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NotifyHelperExtKt.getNotificationManagerExport().setInCallOptimizationOpen();
        ((GuideNotificationViewModel) this$0.getMViewModel()).updateInCallConfig(z);
        this$0.toSystemSettingPage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$28$lambda$27$lambda$14(GuideOpenPhoneCallFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0.getMActivity(), (Class<?>) OpenPolicyAccessActivity.class));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$28$lambda$27$lambda$19(final GuideOpenPhoneCallFragment this$0, final boolean z, MultiplePermissionsBuilder requestPhonePermission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(requestPhonePermission, "$this$requestPhonePermission");
        requestPhonePermission.allGranted(new Function0() { // from class: p8b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$19$lambda$15(this.f30117a, z);
            }
        });
        requestPhonePermission.denied(new Function1() { // from class: q8b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$19$lambda$18(this.f31222a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$28$lambda$27$lambda$19$lambda$15(GuideOpenPhoneCallFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((GuideNotificationViewModel) this$0.getMViewModel()).updateInCallConfig(z);
        this$0.toSystemSettingPage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$28$lambda$27$lambda$19$lambda$18(final GuideOpenPhoneCallFragment this$0, final List deniedList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deniedList, "deniedList");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null && (!deniedList.isEmpty())) {
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), (String) deniedList.get(0), mActivity, deniedList, null, null, new Function0() { // from class: a8b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$19$lambda$18$lambda$17$lambda$16(this.f761a, deniedList);
                }
            }, 24, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$28$lambda$27$lambda$19$lambda$18$lambda$17$lambda$16(GuideOpenPhoneCallFragment this$0, List deniedList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deniedList, "$deniedList");
        this$0.showPermissionDeniedDialog((String) deniedList.get(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$28$lambda$27$lambda$25(final GuideOpenPhoneCallFragment this$0, final boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestPhonePermission(new Function1() { // from class: s8b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$25$lambda$24(this.f33403a, z, (MultiplePermissionsBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$28$lambda$27$lambda$25$lambda$24(final GuideOpenPhoneCallFragment this$0, final boolean z, MultiplePermissionsBuilder requestPhonePermission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(requestPhonePermission, "$this$requestPhonePermission");
        requestPhonePermission.allGranted(new Function0() { // from class: v7b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$25$lambda$24$lambda$20(this.f36585a, z);
            }
        });
        requestPhonePermission.denied(new Function1() { // from class: w7b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$25$lambda$24$lambda$23(this.f37683a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$28$lambda$27$lambda$25$lambda$24$lambda$20(GuideOpenPhoneCallFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((GuideNotificationViewModel) this$0.getMViewModel()).updateInCallConfig(z);
        this$0.toSystemSettingPage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$28$lambda$27$lambda$25$lambda$24$lambda$23(final GuideOpenPhoneCallFragment this$0, final List deniedList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deniedList, "deniedList");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null && (!deniedList.isEmpty())) {
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), (String) deniedList.get(0), mActivity, deniedList, null, null, new Function0() { // from class: o8b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$25$lambda$24$lambda$23$lambda$22$lambda$21(this.f28853a, deniedList);
                }
            }, 24, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$28$lambda$27$lambda$25$lambda$24$lambda$23$lambda$22$lambda$21(GuideOpenPhoneCallFragment this$0, List deniedList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deniedList, "$deniedList");
        this$0.showPermissionDeniedDialog((String) deniedList.get(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$28$lambda$27$lambda$6(final GuideOpenPhoneCallFragment this$0, final boolean z, MultiplePermissionsBuilder requestContactsPermission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(requestContactsPermission, "$this$requestContactsPermission");
        requestContactsPermission.allGranted(new Function0() { // from class: r7b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$6$lambda$2(this.f32285a, z);
            }
        });
        requestContactsPermission.denied(new Function1() { // from class: s7b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$6$lambda$5(this.f33369a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$28$lambda$27$lambda$6$lambda$2(GuideOpenPhoneCallFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NotifyHelperExtKt.getNotificationManagerExport().setInCallOptimizationOpen();
        ((GuideNotificationViewModel) this$0.getMViewModel()).updateInCallConfig(z);
        this$0.toSystemSettingPage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$28$lambda$27$lambda$6$lambda$5(final GuideOpenPhoneCallFragment this$0, final List deniedList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deniedList, "deniedList");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null && (!deniedList.isEmpty())) {
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), (String) deniedList.get(0), mActivity, deniedList, null, null, new Function0() { // from class: b8b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GuideOpenPhoneCallFragment.bindView$lambda$28$lambda$27$lambda$6$lambda$5$lambda$4$lambda$3(this.f3916a, deniedList);
                }
            }, 24, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$28$lambda$27$lambda$6$lambda$5$lambda$4$lambda$3(GuideOpenPhoneCallFragment this$0, List deniedList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deniedList, "$deniedList");
        this$0.showPermissionDeniedDialog((String) deniedList.get(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(GuideOpenPhoneCallFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.uboxNextPage();
        return Unit.INSTANCE;
    }

    private final void requestContactsPermission(boolean isInCallOptimizationOpen, final Function1<? super MultiplePermissionsBuilder, Unit> extension) {
        String[] strArr = isInCallOptimizationOpen ? new String[]{"android.permission.READ_CONTACTS"} : new String[]{"android.permission.READ_CONTACTS", "android.permission.READ_PHONE_STATE"};
        PermissionExtKt.permissions(this, (String[]) Arrays.copyOf(strArr, strArr.length), isInCallOptimizationOpen ? new String[]{getString(wzi.ef)} : new String[]{getString(wzi.ef), getString(wzi.kf)}, (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: l8b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideOpenPhoneCallFragment.requestContactsPermission$lambda$31(extension, (MultiplePermissionsBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContactsPermission$lambda$31(Function1 extension, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(extension, "$extension");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        final MultiplePermissionsBuilder multiplePermissionsBuilder = new MultiplePermissionsBuilder();
        extension.invoke2(multiplePermissionsBuilder);
        permissions.allGranted(new Function0() { // from class: x7b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GuideOpenPhoneCallFragment.requestContactsPermission$lambda$31$lambda$29(multiplePermissionsBuilder);
            }
        });
        permissions.denied(new Function1() { // from class: y7b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideOpenPhoneCallFragment.requestContactsPermission$lambda$31$lambda$30(multiplePermissionsBuilder, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContactsPermission$lambda$31$lambda$29(MultiplePermissionsBuilder pb) {
        Intrinsics.checkNotNullParameter(pb, "$pb");
        pb.getAllGranted().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContactsPermission$lambda$31$lambda$30(MultiplePermissionsBuilder pb, List it) {
        Intrinsics.checkNotNullParameter(pb, "$pb");
        Intrinsics.checkNotNullParameter(it, "it");
        pb.getDenied().invoke2(it);
        return Unit.INSTANCE;
    }

    private final void requestPhonePermission(final Function1<? super MultiplePermissionsBuilder, Unit> extension) {
        if (isVisible()) {
            String[] phoneNotifyPermissionList = NotifyHelperExtKt.getNotificationManagerExport().getPhoneNotifyPermissionList();
            PermissionExtKt.permissions(this, (String[]) Arrays.copyOf(phoneNotifyPermissionList, phoneNotifyPermissionList.length), NotifyHelperExtKt.getNotificationManagerExport().getPhoneNotifyPermissionDescList(), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: z7b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GuideOpenPhoneCallFragment.requestPhonePermission$lambda$34(extension, (MultiplePermissionsBuilder) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPhonePermission$lambda$34(Function1 extension, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(extension, "$extension");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        final MultiplePermissionsBuilder multiplePermissionsBuilder = new MultiplePermissionsBuilder();
        extension.invoke2(multiplePermissionsBuilder);
        permissions.allGranted(new Function0() { // from class: t7b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GuideOpenPhoneCallFragment.requestPhonePermission$lambda$34$lambda$32(multiplePermissionsBuilder);
            }
        });
        permissions.denied(new Function1() { // from class: u7b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideOpenPhoneCallFragment.requestPhonePermission$lambda$34$lambda$33(multiplePermissionsBuilder, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPhonePermission$lambda$34$lambda$32(MultiplePermissionsBuilder pb) {
        Intrinsics.checkNotNullParameter(pb, "$pb");
        pb.getAllGranted().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPhonePermission$lambda$34$lambda$33(MultiplePermissionsBuilder pb, List it) {
        Intrinsics.checkNotNullParameter(pb, "$pb");
        Intrinsics.checkNotNullParameter(it, "it");
        pb.getDenied().invoke2(it);
        return Unit.INSTANCE;
    }

    private final void showPermissionDeniedDialog(String permission) {
        NotificationManagerExportInter notificationManagerExport = NotifyHelperExtKt.getNotificationManagerExport();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        notificationManagerExport.showGoSettingDialog(parentFragmentManager, NotifyHelperExtKt.getNotificationManagerExport().getPermissionName(permission), new Function0() { // from class: r8b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GuideOpenPhoneCallFragment.showPermissionDeniedDialog$lambda$35(this.f32314a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPermissionDeniedDialog$lambda$35(GuideOpenPhoneCallFragment this$0) {
        String packageName;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity == null || (packageName = mActivity.getPackageName()) == null) {
            packageName = "";
        }
        intent.setData(Uri.fromParts("package", packageName, null));
        this$0.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void toSystemSettingPage() {
        if (ZenUtils.INSTANCE.isSupportZenMode(((GuideNotificationViewModel) getMViewModel()).getMDeviceModel())) {
            uboxNextPage();
            return;
        }
        WearableDeviceModel mDeviceModel = ((GuideNotificationViewModel) getMViewModel()).getMDeviceModel();
        if (mDeviceModel == null || !DeviceModelExtKt.isSupportFeature(mDeviceModel, Feature.WIFI_CONFIG)) {
            uboxNextPage();
        } else {
            ((GuideNotificationViewModel) getMViewModel()).tryGetWifiPassword();
        }
    }

    private final void uboxNextPage() {
        getGuideNavigator().navigate("syncSystemSetting");
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final wg6 wg6Var) {
        Intrinsics.checkNotNullParameter(wg6Var, "<this>");
        wg6Var.D.setChecked(true);
        wg6Var.A.setOnClickListener(new View.OnClickListener() { // from class: p7b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideOpenPhoneCallFragment.bindView$lambda$1(this.f30082a, view);
            }
        });
        wg6Var.C.setOnClickListener(new View.OnClickListener() { // from class: q7b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideOpenPhoneCallFragment.bindView$lambda$28(wg6Var, this, view);
            }
        });
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

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.f0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        return true;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (NotifyHelperExtKt.getNotificationManagerExport().isDualCallWithOutBle()) {
            setTitle(wzi.H4);
            ((wg6) getMBinding()).G.setText(getString(wzi.I4));
            ((wg6) getMBinding()).F.setText(getString(wzi.G4));
        } else {
            setTitle(wzi.E4);
            ((wg6) getMBinding()).G.setText(getString(wzi.E4));
            ((wg6) getMBinding()).F.setText(getString(wzi.F4));
        }
        setActionBarResizeable(true);
        hideBack();
        MutableLiveData<Boolean> syncWifiCapability = ((GuideNotificationViewModel) getMViewModel()).getSyncWifiCapability();
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        syncWifiCapability.observe(mActivity, new GuideOpenPhoneCallFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: o7b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideOpenPhoneCallFragment.onViewCreated$lambda$0(this.f28814a, (Boolean) obj);
            }
        }));
        ((wg6) getMBinding()).D.setContentDescription(((wg6) getMBinding()).G.getText());
    }

    public final void setGuideNavigator(@NotNull GuideNavigator guideNavigator) {
        Intrinsics.checkNotNullParameter(guideNavigator, "<set-?>");
        this.guideNavigator = guideNavigator;
    }
}
