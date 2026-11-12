package com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyContactFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyContactViewModel;
import com.xiaomi.fitness.devicesettings.widget.EmergencyCallView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.eg4;
import defpackage.eui;
import defpackage.fg4;
import defpackage.jni;
import defpackage.nte;
import defpackage.r5a;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001<B\u0007¢\u0006\u0004\b;\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0016J!\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0014¢\u0006\u0004\b!\u0010\nJ\u000f\u0010\"\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\"\u0010\nJ)\u0010(\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010\u0016R\u0016\u0010+\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00103\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00100R\u0016\u00104\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010,R\u0016\u00105\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010,R\u0014\u00107\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0016R\u0014\u0010:\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactViewModel;", "Lr5a;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactViewModel$GetEmergencyResult;", Constants.KEY_PAY_RESULT_RET, "", "loadView", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactViewModel$GetEmergencyResult;)V", "setSosSetViewClickListener", "()V", "showOpenSosDialog", "onSetEndView", "loadIfMiuiSos", "", "chooseMiuiSos", "setChooseMiuiSos", "(Z)V", "setEditUnFocusable", "visible", "setEditVisible", "hasInfo", "()Z", "isPhoneNumberLegal", "switchChanged", "modeChanged", "infoChanged", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "loadData", "setListener", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "isSupportMIUISos", "Z", "isChooseMIUISos", "", "originName", "Ljava/lang/String;", "originNumber", "currentName", "currentNumber", "originSwitch", "originChooseMiui", "getSetChanged", "setChanged", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EmergencyContactFragment extends BaseBindingFragment<EmergencyContactViewModel, r5a> {
    public static final int EDIT_INFO_CODE = 1;

    @NotNull
    public static final String TAG = "EmergencyContactFragment";
    private boolean isChooseMIUISos;
    private boolean isSupportMIUISos;
    private boolean originChooseMiui;
    private boolean originSwitch;

    @NotNull
    private String originName = "";

    @NotNull
    private String originNumber = "";

    @NotNull
    private String currentName = "";

    @NotNull
    private String currentNumber = "";

    private final boolean getSetChanged() {
        boolean z = this.isSupportMIUISos;
        if (z) {
            if (z && (infoChanged() || switchChanged() || modeChanged())) {
                return true;
            }
        } else if (infoChanged() || switchChanged()) {
            return true;
        }
        return false;
    }

    private final boolean hasInfo() {
        boolean z = this.isSupportMIUISos;
        if (z && this.isChooseMIUISos) {
            return true;
        }
        if (!z || this.isChooseMIUISos) {
            if (getMBinding().G.getText().length() > 0 && getMBinding().H.getText().length() > 0) {
                return true;
            }
        } else if (getMBinding().F.getRemarkAndNumber().length() > 0) {
            return true;
        }
        return false;
    }

    private final boolean infoChanged() {
        boolean z = this.isSupportMIUISos;
        if (z) {
            if (z && !this.isChooseMIUISos && (!Intrinsics.areEqual(this.originNumber, this.currentNumber) || !Intrinsics.areEqual(this.originName, this.currentName))) {
                return true;
            }
        } else if (!Intrinsics.areEqual(getMBinding().H.getText(), this.originName) || !Intrinsics.areEqual(getMBinding().G.getText(), this.originNumber)) {
            return true;
        }
        return false;
    }

    private final boolean isPhoneNumberLegal() {
        boolean z = this.isSupportMIUISos;
        return (z && this.isChooseMIUISos) || !z || this.isChooseMIUISos || getMBinding().F.getNumberText() != null;
    }

    private final void loadIfMiuiSos() {
        if (this.isSupportMIUISos) {
            getMBinding().J.setTitle(wzi.S3);
            ConstraintLayout emergencyContactGroup = getMBinding().C;
            Intrinsics.checkNotNullExpressionValue(emergencyContactGroup, "emergencyContactGroup");
            ViewExtKt.gone(emergencyContactGroup);
            setSosSetViewClickListener();
        }
    }

    private final void loadView(EmergencyContactViewModel.GetEmergencyResult ret) {
        String str;
        String str2;
        String str3;
        String str4;
        hideLoading();
        if (!ret.getSuccess()) {
            getMBinding().J.setSwitch(false);
            this.originSwitch = false;
            setEditVisible(false);
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.common_hint_unkonwn_error);
                return;
            }
            return;
        }
        fg4 contact = ret.getContact();
        if (contact == null) {
            return;
        }
        eg4 eg4Var = contact.e;
        String str5 = "";
        if (eg4Var == null || (str = eg4Var.c) == null) {
            str = "";
        }
        this.originName = str;
        if (eg4Var == null || (str2 = eg4Var.d) == null) {
            str2 = "";
        }
        this.originNumber = str2;
        if (eg4Var == null || (str3 = eg4Var.c) == null) {
            str3 = "";
        }
        this.currentName = str3;
        if (eg4Var != null && (str4 = eg4Var.d) != null) {
            str5 = str4;
        }
        this.currentNumber = str5;
        if (this.isSupportMIUISos) {
            ConstraintLayout sosGroup = getMBinding().I;
            Intrinsics.checkNotNullExpressionValue(sosGroup, "sosGroup");
            ViewExtKt.setVisible(sosGroup, contact.c);
            if (contact.e != null) {
                getMBinding().F.setRemarkAndNumber(this.originName, this.originNumber);
            }
            if (contact.d) {
                this.isChooseMIUISos = true;
                this.originChooseMiui = true;
                setChooseMiuiSos(true);
            } else {
                setChooseMiuiSos(false);
                this.isChooseMIUISos = false;
                this.originChooseMiui = false;
            }
        } else {
            if (eg4Var != null) {
                getMBinding().H.setText(this.originName);
                getMBinding().G.setText(this.originNumber);
            }
            setEditVisible(contact.c);
        }
        getMBinding().J.setSwitch(contact.c);
        this.originSwitch = contact.c;
    }

    private final boolean modeChanged() {
        return this.originChooseMiui != this.isChooseMIUISos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onSetEndView() {
        setEditUnFocusable();
        if (!hasInfo() && getMBinding().J.getSwitch()) {
            Logger.i("sendEmergencyContact failed: switch is not check", new Object[0]);
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.L3);
                return;
            }
            return;
        }
        if (!isPhoneNumberLegal()) {
            Logger.i("sendEmergencyContact failed: phone number illegal", new Object[0]);
            Context context2 = getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, wzi.M3);
                return;
            }
            return;
        }
        if (!this.isSupportMIUISos) {
            EmergencyContactViewModel.sendEmergencyContact$default((EmergencyContactViewModel) getMViewModel(), getMBinding().H.getText(), getMBinding().G.getText(), getMBinding().J.getSwitch(), false, 8, null);
        } else if (!this.isChooseMIUISos) {
            ((EmergencyContactViewModel) getMViewModel()).sendEmergencyContact(getMBinding().F.getRemarkText(), getMBinding().F.getNumberText(), getMBinding().J.getSwitch(), false);
        } else if (((EmergencyContactViewModel) getMViewModel()).isMIUISosOpen()) {
            EmergencyContactViewModel.sendEmergencyContact$default((EmergencyContactViewModel) getMViewModel(), null, null, getMBinding().J.getSwitch(), true, 3, null);
        } else {
            showOpenSosDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(EmergencyContactFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LottieAnimationView deviceImg = this$0.getMBinding().A;
        Intrinsics.checkNotNullExpressionValue(deviceImg, "deviceImg");
        ViewExtKt.visible(deviceImg);
        this$0.getMBinding().A.setAnimationFromUrl(str);
        this$0.getMBinding().A.w();
        this$0.getMBinding().A.setFailureListener(new nte() { // from class: k78
            @Override // defpackage.nte
            public final void onResult(Object obj) {
                EmergencyContactFragment.onViewCreated$lambda$1$lambda$0((Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1$lambda$0(Throwable th) {
        Logger.i(TAG, "emergency animation load fail: " + th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(EmergencyContactFragment this$0, EmergencyContactViewModel.GetEmergencyResult getEmergencyResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(getEmergencyResult);
        this$0.loadView(getEmergencyResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(EmergencyContactFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            if (!this$0.isSupportMIUISos && this$0.getMBinding().J.getSwitch()) {
                this$0.originName = this$0.getMBinding().H.getText();
                this$0.originNumber = this$0.getMBinding().G.getText();
            }
            if (this$0.isSupportMIUISos && !this$0.isChooseMIUISos && this$0.getMBinding().J.getSwitch()) {
                String remarkText = this$0.getMBinding().F.getRemarkText();
                if (remarkText == null) {
                    remarkText = "";
                }
                this$0.originName = remarkText;
                String numberText = this$0.getMBinding().F.getNumberText();
                this$0.originNumber = numberText != null ? numberText : "";
            }
            this$0.originChooseMiui = this$0.isChooseMIUISos;
            this$0.originSwitch = this$0.getMBinding().J.getSwitch();
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.common_set_success);
            }
        } else {
            Context context2 = this$0.getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, wzi.common_set_error);
            }
            this$0.getMBinding().J.setSwitch(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(EmergencyContactFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onSetEndView();
    }

    private final void setChooseMiuiSos(boolean chooseMiuiSos) {
        getMBinding().E.setChoose(chooseMiuiSos);
        getMBinding().F.setChoose(!chooseMiuiSos);
    }

    private final void setEditUnFocusable() {
        getMBinding().G.getEditText().clearFocus();
        getMBinding().H.getEditText().clearFocus();
        Object systemService = requireContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        inputMethodManager.hideSoftInputFromWindow(getMBinding().G.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(getMBinding().H.getWindowToken(), 0);
    }

    private final void setEditVisible(boolean visible) {
        EmergencyCallView phoneNumberView = getMBinding().G;
        Intrinsics.checkNotNullExpressionValue(phoneNumberView, "phoneNumberView");
        ViewExtKt.setVisible(phoneNumberView, visible);
        EmergencyCallView remarkNameView = getMBinding().H;
        Intrinsics.checkNotNullExpressionValue(remarkNameView, "remarkNameView");
        ViewExtKt.setVisible(remarkNameView, visible);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$8(EmergencyContactFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isSupportMIUISos) {
            this$0.setEditVisible(z);
            return;
        }
        ConstraintLayout sosGroup = this$0.getMBinding().I;
        Intrinsics.checkNotNullExpressionValue(sosGroup, "sosGroup");
        ViewExtKt.setVisible(sosGroup, z);
    }

    private final void setSosSetViewClickListener() {
        getMBinding().F.setOnSosSetViewClickListener(new Function0() { // from class: h78
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmergencyContactFragment.setSosSetViewClickListener$lambda$6(this.f19773a);
            }
        });
        getMBinding().E.setOnSosSetViewClickListener(new Function0() { // from class: i78
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmergencyContactFragment.setSosSetViewClickListener$lambda$7(this.f20856a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSosSetViewClickListener$lambda$6(EmergencyContactFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isChooseMIUISos) {
            this$0.isChooseMIUISos = false;
            this$0.setChooseMiuiSos(false);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(EmergencyInfoFragment.EMERGENCY_INFO_REMARK_EXTRA, this$0.getMBinding().F.getRemarkText());
            bundle.putString(EmergencyInfoFragment.EMERGENCY_INFO_NUMBER_EXTRA, this$0.getMBinding().F.getNumberText());
            BaseFragmentExKt.gotoPageForResult(this$0, (Class<?>) EmergencyInfoFragment.class, bundle, 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setSosSetViewClickListener$lambda$7(EmergencyContactFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((EmergencyContactViewModel) this$0.getMViewModel()).isMIUISosOpen()) {
            this$0.isChooseMIUISos = true;
            this$0.setChooseMiuiSos(true);
        } else {
            this$0.showOpenSosDialog();
        }
        return Unit.INSTANCE;
    }

    private final void showOpenSosDialog() {
        new CommonDialog.c("").setDialogTitle(wzi.G3).setDialogDescription(wzi.F3).setPositiveText(wzi.a2).setNegativeText(wzi.E3).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyContactFragment.showOpenSosDialog.1
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
                    Intent intent = new Intent();
                    EmergencyContactFragment emergencyContactFragment = EmergencyContactFragment.this;
                    intent.setComponent(new ComponentName(com.miui.tsmclient.util.Constants.SETTINGS_PACKAGE, "com.android.settings.SubSettings"));
                    intent.addFlags(268435456);
                    intent.putExtra(":android:show_fragment", "com.android.settings.emergency.ui.SosSettings");
                    emergencyContactFragment.startActivity(intent);
                }
            }
        }).showIfNeed(getChildFragmentManager());
    }

    private final boolean switchChanged() {
        return this.originSwitch != getMBinding().J.getSwitch();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.s2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        super.loadData();
        showLoading();
        ((EmergencyContactViewModel) getMViewModel()).getEmergencyContact();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == -1) {
            String stringExtra = data != null ? data.getStringExtra(EmergencyInfoFragment.EMERGENCY_INFO_REMARK_EXTRA) : null;
            String stringExtra2 = data != null ? data.getStringExtra(EmergencyInfoFragment.EMERGENCY_INFO_NUMBER_EXTRA) : null;
            this.currentName = stringExtra == null ? "" : stringExtra;
            this.currentNumber = stringExtra2 != null ? stringExtra2 : "";
            Logger.d(TAG, "onActivityResult remark: " + stringExtra + " number: " + stringExtra2);
            getMBinding().F.setRemarkAndNumber(stringExtra, stringExtra2);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        if (!getSetChanged()) {
            return super.onBackPressed();
        }
        new CommonDialog.c("emergency info change").setDialogTitle(wzi.H3).setDialogDescription(wzi.I3).setPositiveText(wzi.g).setNegativeText(wzi.e).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyContactFragment.onBackPressed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which != -1) {
                        return;
                    }
                    EmergencyContactFragment.this.finish();
                } else if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(getParentFragmentManager());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.S3);
        boolean zIsSupportMIUISos = ((EmergencyContactViewModel) getMViewModel()).isSupportMIUISos();
        this.isSupportMIUISos = zIsSupportMIUISos;
        Logger.i(TAG, "isSupportMIUISos: " + zIsSupportMIUISos);
        loadIfMiuiSos();
        if (RegionUtil.isInnerCN()) {
            getMBinding().G.setHint("110");
            EmergencyCallView emergencyCallView = getMBinding().H;
            String string = getString(wzi.C3);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            emergencyCallView.setHint(string);
        }
        ((EmergencyContactViewModel) getMViewModel()).getAnimationUrl().observe(getViewLifecycleOwner(), new EmergencyContactFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: l78
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EmergencyContactFragment.onViewCreated$lambda$1(this.f24735a, (String) obj);
            }
        }));
        ((EmergencyContactViewModel) getMViewModel()).loadAnimation();
        ((EmergencyContactViewModel) getMViewModel()).getGetEmergencyResult().observe(getViewLifecycleOwner(), new EmergencyContactFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: m78
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EmergencyContactFragment.onViewCreated$lambda$2(this.f25835a, (EmergencyContactViewModel.GetEmergencyResult) obj);
            }
        }));
        ((EmergencyContactViewModel) getMViewModel()).getSetEmergencyResult().observe(getViewLifecycleOwner(), new EmergencyContactFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: n78
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EmergencyContactFragment.onViewCreated$lambda$3(this.f27614a, (Boolean) obj);
            }
        }));
        IActionBar.DefaultImpls.setEndView$default(this, 0, jni.f1, getString(wzi.sf), new View.OnClickListener() { // from class: o78
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EmergencyContactFragment.onViewCreated$lambda$4(this.f28812a, view2);
            }
        }, 1, null);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        getMBinding().J.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: j78
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                EmergencyContactFragment.setListener$lambda$8(this.f22484a, z, iSwitchButton);
            }
        });
    }
}
