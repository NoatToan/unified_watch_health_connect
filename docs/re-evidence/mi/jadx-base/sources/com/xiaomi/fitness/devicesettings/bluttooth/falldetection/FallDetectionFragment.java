package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.bw1;
import defpackage.cji;
import defpackage.eui;
import defpackage.nte;
import defpackage.qg6;
import defpackage.wzi;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00011B\u0007¢\u0006\u0004\b0\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J7\u0010\u001f\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001d\u0012\u0004\u0012\u00020\u00040\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010%\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0004H\u0014¢\u0006\u0004\b*\u0010\u0006J\u000f\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010\u0006R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionViewModel;", "Lqg6;", "", "initUI", "()V", "loadAnimation", "loadSpanText", "goSetEmergencyCard", "showBatteryRemind", "", "text", "spanText", "Lkotlin/Function0;", "clickListener", "Landroid/text/SpannableStringBuilder;", "setSpanText", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroid/text/SpannableStringBuilder;", "Lcom/xiaomi/fitness/widget/button/ISwitchButton;", "switch", "showPermissionDialog", "(Lcom/xiaomi/fitness/widget/button/ISwitchButton;)V", "denyPermission", "showAlwaysAllow", "(Ljava/lang/String;)V", "gotoSetEmergencyContact", "granted", "Lkotlin/Function1;", "", "deny", "checkFallDetectionPermission", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "isDeviceDisconnected", "()Z", "setListener", LifecycleConstantKt.ON_RESUME, "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFallDetectionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FallDetectionFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionFragment\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,385:1\n37#2:386\n36#2,3:387\n37#2:390\n36#2,3:391\n37#2:394\n36#2,3:395\n*S KotlinDebug\n*F\n+ 1 FallDetectionFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionFragment\n*L\n361#1:386\n361#1:387,3\n159#1:390\n159#1:391,3\n191#1:394\n191#1:395,3\n*E\n"})
public final class FallDetectionFragment extends Hilt_FallDetectionFragment<FallDetectionViewModel, qg6> {
    public static final int ADD_CONTACT_LIST = 1;

    @NotNull
    private static final String TAG = "FallDetectionFragment";

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionFragment$showPermissionDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionFragment$showPermissionDialog$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C20661 extends av6 {
        final /* synthetic */ ISwitchButton $switch;

        public C20661(ISwitchButton iSwitchButton) {
            this.$switch = iSwitchButton;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(FallDetectionFragment this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Logger.i(FallDetectionFragment.TAG, "permission access");
            FallDetectionFragment.access$getMViewModel(this$0).onFallDetectionChecked(true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$5(ISwitchButton iSwitchButton, final FallDetectionFragment this$0, final List it) {
            Intrinsics.checkNotNullParameter(iSwitchButton, "$switch");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.size() == 1 && Intrinsics.areEqual(it.get(0), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                iSwitchButton.setChecked(true);
                FallDetectionFragment.access$getMViewModel(this$0).getMModel().getFallDetectionSwitchOn().set(true);
                Logger.i(FallDetectionFragment.TAG, "permission foreground");
                IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
                String str = (String) it.get(0);
                FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, str, fragmentActivityRequireActivity, null, null, new Function0() { // from class: c99
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FallDetectionFragment.C20661.onDialogClick$lambda$5$lambda$1(this$0, it);
                    }
                }, new Function0() { // from class: d99
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FallDetectionFragment.C20661.onDialogClick$lambda$5$lambda$2(this$0, it);
                    }
                }, 12, null);
            } else {
                iSwitchButton.setChecked(false);
                FallDetectionFragment.access$getMViewModel(this$0).getMModel().getFallDetectionSwitchOn().set(false);
                Logger.i(FallDetectionFragment.TAG, "permission deny");
                IPermissionManager instance2 = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
                String str2 = (String) it.get(0);
                FragmentActivity fragmentActivityRequireActivity2 = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance2, str2, fragmentActivityRequireActivity2, it, null, new Function0() { // from class: e99
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FallDetectionFragment.C20661.onDialogClick$lambda$5$lambda$3(this$0, it);
                    }
                }, new Function0() { // from class: f99
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FallDetectionFragment.C20661.onDialogClick$lambda$5$lambda$4(this$0, it);
                    }
                }, 8, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$5$lambda$1(FallDetectionFragment this$0, List it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "$it");
            this$0.showAlwaysAllow((String) it.get(0));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$5$lambda$2(FallDetectionFragment this$0, List it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "$it");
            this$0.showAlwaysAllow((String) it.get(0));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$5$lambda$3(FallDetectionFragment this$0, List it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "$it");
            PermissionsUtil permissionsUtil = PermissionsUtil.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            PermissionsUtil.showSettingDialog$default(permissionsUtil, fragmentActivityRequireActivity, (String) it.get(0), false, null, 8, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$5$lambda$4(FallDetectionFragment this$0, List it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "$it");
            PermissionsUtil permissionsUtil = PermissionsUtil.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            PermissionsUtil.showSettingDialog$default(permissionsUtil, fragmentActivityRequireActivity, (String) it.get(0), false, null, 8, null);
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            super.onDialogClick(dialogName, dialog, which);
            if (which == -1) {
                final FallDetectionFragment fallDetectionFragment = FallDetectionFragment.this;
                Function0 function0 = new Function0() { // from class: a99
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FallDetectionFragment.C20661.onDialogClick$lambda$0(fallDetectionFragment);
                    }
                };
                final ISwitchButton iSwitchButton = this.$switch;
                final FallDetectionFragment fallDetectionFragment2 = FallDetectionFragment.this;
                fallDetectionFragment.checkFallDetectionPermission(function0, new Function1() { // from class: b99
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return FallDetectionFragment.C20661.onDialogClick$lambda$5(iSwitchButton, fallDetectionFragment2, (List) obj);
                    }
                });
            }
        }
    }

    public FallDetectionFragment() {
        super(eui.c0, bw1.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FallDetectionViewModel access$getMViewModel(FallDetectionFragment fallDetectionFragment) {
        return (FallDetectionViewModel) fallDetectionFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void checkFallDetectionPermission(final Function0<Unit> granted, final Function1<? super List<String>, Unit> deny) {
        String[] strArr = (String[]) ((FallDetectionViewModel) getMViewModel()).getPermissions().toArray(new String[0]);
        PermissionExtKt.permissions(this, (String[]) Arrays.copyOf(strArr, strArr.length), ((FallDetectionViewModel) getMViewModel()).getDescriptions(), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: e89
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FallDetectionFragment.checkFallDetectionPermission$lambda$23(granted, deny, (MultiplePermissionsBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkFallDetectionPermission$lambda$23(final Function0 granted, final Function1 deny, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(granted, "$granted");
        Intrinsics.checkNotNullParameter(deny, "$deny");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: h89
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FallDetectionFragment.checkFallDetectionPermission$lambda$23$lambda$21(granted);
            }
        });
        permissions.denied(new Function1() { // from class: i89
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FallDetectionFragment.checkFallDetectionPermission$lambda$23$lambda$22(deny, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkFallDetectionPermission$lambda$23$lambda$21(Function0 granted) {
        Intrinsics.checkNotNullParameter(granted, "$granted");
        granted.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkFallDetectionPermission$lambda$23$lambda$22(Function1 deny, List it) {
        Intrinsics.checkNotNullParameter(deny, "$deny");
        Intrinsics.checkNotNullParameter(it, "it");
        deny.invoke2(it);
        return Unit.INSTANCE;
    }

    private final void goSetEmergencyCard() {
        SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).goMedicalIdEditPage(getContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void gotoSetEmergencyContact() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(EmergencyContactListFragmentKt.KEY_EMERGENCY_CONTACT_SWITCH, ((FallDetectionViewModel) getMViewModel()).getMModel().getSosContactSwitchOn().get());
        bundle.putBoolean(EmergencyContactListFragmentKt.KEY_FALL_DETECTION_SWITCH, ((FallDetectionViewModel) getMViewModel()).getMModel().getFallDetectionSwitchOn().get());
        bundle.putBoolean(EmergencyContactListFragmentKt.KEY_CALL_MEDICAL_SWITCH, ((FallDetectionViewModel) getMViewModel()).getMModel().getCallMedicalSwitchOn().get());
        BaseFragmentExKt.gotoPageForResult(this, (Class<?>) EmergencyContactListFragment.class, bundle, 1);
    }

    private final void initUI() {
        loadAnimation();
        loadSpanText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadAnimation() {
        ((FallDetectionViewModel) getMViewModel()).loadAnimation();
        ((FallDetectionViewModel) getMViewModel()).getAnimationUrl().observe(getViewLifecycleOwner(), new FallDetectionFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: z89
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FallDetectionFragment.loadAnimation$lambda$2(this.f41013a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit loadAnimation$lambda$2(FallDetectionFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LottieAnimationView deviceImg = ((qg6) this$0.getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(deviceImg, "deviceImg");
        ViewExtKt.visible(deviceImg);
        ((qg6) this$0.getMBinding()).B.setAnimationFromUrl(str);
        ((qg6) this$0.getMBinding()).B.w();
        ((qg6) this$0.getMBinding()).B.setFailureListener(new nte() { // from class: j89
            @Override // defpackage.nte
            public final void onResult(Object obj) {
                FallDetectionFragment.loadAnimation$lambda$2$lambda$1((Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadAnimation$lambda$2$lambda$1(Throwable th) {
        Logger.i(TAG, "emergency animation load fail: " + th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadSpanText() {
        String string = getString(wzi.z7);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(wzi.A7);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SpannableStringBuilder spanText = setSpanText(string + string2, string2, new Function0() { // from class: q89
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FallDetectionFragment.loadSpanText$lambda$3(this.f31221a);
            }
        });
        ((qg6) getMBinding()).N.setMovementMethod(LinkMovementMethod.getInstance());
        ((qg6) getMBinding()).N.setText(spanText);
        String string3 = getString(wzi.B7);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = getString(wzi.C7);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        SpannableStringBuilder spanText2 = setSpanText(string3 + string4, string4, new Function0() { // from class: r89
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FallDetectionFragment.loadSpanText$lambda$4(this.f32313a);
            }
        });
        ((qg6) getMBinding()).O.setMovementMethod(LinkMovementMethod.getInstance());
        ((qg6) getMBinding()).O.setText(spanText2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadSpanText$lambda$3(FallDetectionFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goSetEmergencyCard();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadSpanText$lambda$4(FallDetectionFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showBatteryRemind();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(FallDetectionFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, bool.booleanValue() ? wzi.common_set_success : wzi.common_set_error);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$10(final FallDetectionFragment this$0, boolean z, final ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDeviceDisconnected()) {
            iSwitchButton.setChecked(!z);
            return;
        }
        if (!z) {
            ((FallDetectionViewModel) this$0.getMViewModel()).onSosContactSmsChecked(false);
        } else if (PermissionsUtil.shouldRequestPermission((String[]) ((FallDetectionViewModel) this$0.getMViewModel()).getPermissions().toArray(new String[0]))) {
            this$0.checkFallDetectionPermission(new Function0() { // from class: k89
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FallDetectionFragment.setListener$lambda$10$lambda$6(this.f23583a);
                }
            }, new Function1() { // from class: l89
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FallDetectionFragment.setListener$lambda$10$lambda$9(this.f24765a, iSwitchButton, (List) obj);
                }
            });
        } else {
            ((FallDetectionViewModel) this$0.getMViewModel()).onSosContactSmsChecked(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$10$lambda$6(FallDetectionFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "permission access");
        ((FallDetectionViewModel) this$0.getMViewModel()).onSosContactSmsChecked(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$10$lambda$9(final FallDetectionFragment this$0, ISwitchButton iSwitchButton, final List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.size() == 1 && Intrinsics.areEqual(it.get(0), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            ((FallDetectionViewModel) this$0.getMViewModel()).onSosContactSmsChecked(true);
            Logger.i(TAG, "permission foreground");
            IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
            String str = (String) it.get(0);
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, str, fragmentActivityRequireActivity, null, null, new Function0() { // from class: n89
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FallDetectionFragment.setListener$lambda$10$lambda$9$lambda$7(this.f27648a, it);
                }
            }, new Function0() { // from class: p89
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FallDetectionFragment.setListener$lambda$10$lambda$9$lambda$8(this.f30115a, it);
                }
            }, 12, null);
        } else {
            iSwitchButton.setChecked(false);
            ((FallDetectionViewModel) this$0.getMViewModel()).getMModel().getSosContactSmsSwitchOn().set(false);
            Logger.i(TAG, "permission deny");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$10$lambda$9$lambda$7(FallDetectionFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.showAlwaysAllow((String) it.get(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$10$lambda$9$lambda$8(FallDetectionFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.showAlwaysAllow((String) it.get(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$15(final FallDetectionFragment this$0, boolean z, final ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDeviceDisconnected()) {
            iSwitchButton.setChecked(!z);
            return;
        }
        if (!z) {
            ((FallDetectionViewModel) this$0.getMViewModel()).onshareLocationChecked(false);
        } else if (PermissionsUtil.shouldRequestPermission((String[]) ((FallDetectionViewModel) this$0.getMViewModel()).getPermissions().toArray(new String[0]))) {
            this$0.checkFallDetectionPermission(new Function0() { // from class: f89
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FallDetectionFragment.setListener$lambda$15$lambda$11(this.f17520a);
                }
            }, new Function1() { // from class: g89
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FallDetectionFragment.setListener$lambda$15$lambda$14(this.f18712a, iSwitchButton, (List) obj);
                }
            });
        } else {
            ((FallDetectionViewModel) this$0.getMViewModel()).onshareLocationChecked(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$15$lambda$11(FallDetectionFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "permission access");
        ((FallDetectionViewModel) this$0.getMViewModel()).onshareLocationChecked(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$15$lambda$14(final FallDetectionFragment this$0, ISwitchButton iSwitchButton, final List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.size() == 1 && Intrinsics.areEqual(it.get(0), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            ((FallDetectionViewModel) this$0.getMViewModel()).onshareLocationChecked(true);
            Logger.i(TAG, "permission foreground");
            IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
            String str = (String) it.get(0);
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, str, fragmentActivityRequireActivity, null, null, new Function0() { // from class: d89
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FallDetectionFragment.setListener$lambda$15$lambda$14$lambda$12(this.f15208a, it);
                }
            }, new Function0() { // from class: o89
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FallDetectionFragment.setListener$lambda$15$lambda$14$lambda$13(this.f28851a, it);
                }
            }, 12, null);
        } else {
            iSwitchButton.setChecked(false);
            ((FallDetectionViewModel) this$0.getMViewModel()).getMModel().getShareLocationSwitchOn().set(false);
            Logger.i(TAG, "permission deny");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$15$lambda$14$lambda$12(FallDetectionFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.showAlwaysAllow((String) it.get(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$15$lambda$14$lambda$13(FallDetectionFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.showAlwaysAllow((String) it.get(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$16(final FallDetectionFragment this$0, boolean z, final ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDeviceDisconnected()) {
            iSwitchButton.setChecked(!z);
        } else if (z) {
            new CommonDialog.c("fall detection").setDialogTitle(wzi.l4).setDialogDescription(wzi.k4).setPositiveText(wzi.f38514b).setNegativeText(wzi.pf).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionFragment$setListener$4$1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        iSwitchButton.setChecked(false);
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    }
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    if (!PermissionsUtil.shouldRequestPermission((String[]) FallDetectionFragment.access$getMViewModel(this.this$0).getPermissions().toArray(new String[0]))) {
                        FallDetectionFragment.access$getMViewModel(this.this$0).onFallDetectionChecked(true);
                        return;
                    }
                    FallDetectionFragment fallDetectionFragment = this.this$0;
                    ISwitchButton iSwitchButton2 = iSwitchButton;
                    Intrinsics.checkNotNull(iSwitchButton2);
                    fallDetectionFragment.showPermissionDialog(iSwitchButton2);
                }
            }).showIfNeed(this$0.getParentFragmentManager());
        } else {
            ((FallDetectionViewModel) this$0.getMViewModel()).onFallDetectionChecked(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$17(FallDetectionFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDeviceDisconnected()) {
            iSwitchButton.setChecked(!z);
        } else {
            ((FallDetectionViewModel) this$0.getMViewModel()).onCallMedicalSwitch(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$18(FallDetectionFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDeviceDisconnected()) {
            return;
        }
        this$0.gotoSetEmergencyContact();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$19(FallDetectionFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDeviceDisconnected()) {
            return;
        }
        this$0.gotoSetEmergencyContact();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$5(FallDetectionFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDeviceDisconnected()) {
            iSwitchButton.setChecked(!z);
        } else {
            ((FallDetectionViewModel) this$0.getMViewModel()).onSosContactChecked(z);
        }
    }

    private final SpannableStringBuilder setSpanText(String text, String spanText, final Function0<Unit> clickListener) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) text, spanText, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionFragment.setSpanText.1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                clickListener.invoke();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(BaseFragmentExtKt.getColor(FallDetectionFragment.this, cji.d));
                ds.setUnderlineText(false);
            }
        }, iIndexOf$default, spanText.length() + iIndexOf$default, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAlwaysAllow(final String denyPermission) {
        new CommonDialog.c("request background permission").setDialogTitle(wzi.q5).setDialogDescription(wzi.j4).setPositiveText(wzi.a2).setNegativeText(wzi.e).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionFragment.showAlwaysAllow.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
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
                    PermissionsUtil permissionsUtil = PermissionsUtil.INSTANCE;
                    FragmentActivity fragmentActivityRequireActivity = FallDetectionFragment.this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    PermissionsUtil.showSettingDialog$default(permissionsUtil, fragmentActivityRequireActivity, denyPermission, false, null, 8, null);
                }
            }
        }).showIfNeed(getParentFragmentManager());
    }

    private final void showBatteryRemind() {
        new CommonDialog.c("").setDialogTitle(wzi.r7).setDialogDescription(wzi.q7).setPositiveText(wzi.common_known).create().showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPermissionDialog(ISwitchButton iSwitchButton) {
        new CommonDialog.c("fall detection request permission").setDialogTitle(wzi.l4).setDialogDescription(wzi.n4).setPositiveText(wzi.common_allow).setNegativeText(wzi.pf).create().addDialogCallback(new C20661(iSwitchButton)).showIfNeed(getParentFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.c0;
    }

    public final boolean isDeviceDisconnected() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            return false;
        }
        ToastUtil.showShortToast(wzi.f38517r);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((FallDetectionViewModel) getMViewModel()).getMModel().getSosContactList().set(CollectionsKt___CollectionsKt.toList(FallDetectionHelper.INSTANCE.getSLocalEmergencyContactList()));
        ((FallDetectionViewModel) getMViewModel()).getMModel().refreshSosContactCountText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        WearableDeviceModel mDeviceModel;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (((FallDetectionViewModel) getMViewModel()).getMDeviceModel() != null && ((mDeviceModel = ((FallDetectionViewModel) getMViewModel()).getMDeviceModel()) == null || mDeviceModel.getIsDeviceConnected())) {
            setTitle(wzi.S3);
            initUI();
            ((FallDetectionViewModel) getMViewModel()).getSetResult().observe(getViewLifecycleOwner(), new FallDetectionFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: m89
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FallDetectionFragment.onViewCreated$lambda$0(this.f25879a, (Boolean) obj);
                }
            }));
            ((FallDetectionViewModel) getMViewModel()).loadData();
            return;
        }
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, wzi.common_hint_unkonwn_error);
        }
        FragmentActivity mActivity2 = getMActivity();
        if (mActivity2 != null) {
            mActivity2.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((qg6) getMBinding()).K.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: s89
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                FallDetectionFragment.setListener$lambda$5(this.f33402a, z, iSwitchButton);
            }
        });
        ((qg6) getMBinding()).J.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: t89
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                FallDetectionFragment.setListener$lambda$10(this.f34448a, z, iSwitchButton);
            }
        });
        ((qg6) getMBinding()).F.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: u89
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                FallDetectionFragment.setListener$lambda$15(this.f35519a, z, iSwitchButton);
            }
        });
        ((qg6) getMBinding()).E.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: v89
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                FallDetectionFragment.setListener$lambda$16(this.f36611a, z, iSwitchButton);
            }
        });
        ((qg6) getMBinding()).A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: w89
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                FallDetectionFragment.setListener$lambda$17(this.f37716a, z, iSwitchButton);
            }
        });
        ((qg6) getMBinding()).L.setOnClickListener(new View.OnClickListener() { // from class: x89
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FallDetectionFragment.setListener$lambda$18(this.f38844a, view);
            }
        });
        ((qg6) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: y89
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FallDetectionFragment.setListener$lambda$19(this.f39926a, view);
            }
        });
    }
}
