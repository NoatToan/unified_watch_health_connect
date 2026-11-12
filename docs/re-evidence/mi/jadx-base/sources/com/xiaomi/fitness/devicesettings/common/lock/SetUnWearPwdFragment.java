package com.xiaomi.fitness.devicesettings.common.lock;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.devicesettings.common.lock.SetUnWearPwdFragment;
import com.xiaomi.fitness.nfc.export.NfcManager;
import com.xiaomi.fitness.nfc.export.NfcManagerExtKt;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.aj6;
import defpackage.cji;
import defpackage.eui;
import defpackage.jni;
import defpackage.wzi;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 A2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001AB\u0007¢\u0006\u0004\b@\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0007J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0007J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0005*\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001b\u0010\u0007J\u0019\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010%\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010&J1\u0010(\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010'\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010&R\u001d\u0010.\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u0010/\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b/\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00100\u001a\u0004\b4\u00101\"\u0004\b5\u00103R\"\u00106\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b6\u00101\"\u0004\b7\u00103R$\u00108\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010\fR\u0014\u0010?\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/lock/SetUnWearPwdFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/common/lock/SetUnWearPwdViewModel;", "Laj6;", "Landroid/text/TextWatcher;", "", "resetView", "()V", "notNeedPrepare", "", "pwd", "setResult", "(Ljava/lang/String;)V", "checkPinOnce", "checkPinTwice", "checkCRSStatus", "regex", MiuiCursorConstants.CONTENT, "", "isInputValidate", "(Ljava/lang/String;Ljava/lang/String;)Z", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "bindView", "(Laj6;)V", "setListener", "Landroid/text/Editable;", "s", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", StatConstants.PARAM_START, "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "isShowPwd", "Z", "()Z", "setShowPwd", "(Z)V", "isNeedSync", "setNeedSync", "isRequired", "setRequired", "prePwd", "Ljava/lang/String;", "getPrePwd", "()Ljava/lang/String;", "setPrePwd", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSetUnWearPwdFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetUnWearPwdFragment.kt\ncom/xiaomi/fitness/devicesettings/common/lock/SetUnWearPwdFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,260:1\n1#2:261\n*E\n"})
public final class SetUnWearPwdFragment extends BaseBindingFragment<SetUnWearPwdViewModel, aj6> implements TextWatcher {

    @NotNull
    public static final String sIsRequired = "sIsRequired";

    @NotNull
    public static final String sPassWord = "sPassWord";
    private boolean isNeedSync;
    private boolean isRequired;
    private boolean isShowPwd;

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rzl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SetUnWearPwdFragment.mDeviceModel_delegate$lambda$0();
        }
    });

    @Nullable
    private String prePwd;

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkCRSStatus() {
        ((SetUnWearPwdViewModel) getMViewModel()).checkCRSCode(new Function1() { // from class: vzl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SetUnWearPwdFragment.checkCRSStatus$lambda$12(this.f37399a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit checkCRSStatus$lambda$12(final SetUnWearPwdFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.hideLoading();
            NfcManager nfcManagerExtKt = NfcManagerExtKt.getInstance(NfcManager.INSTANCE);
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            nfcManagerExtKt.gotoUpgradePinPage(fragmentActivityRequireActivity);
            this$0.finish();
        } else {
            ((SetUnWearPwdViewModel) this$0.getMViewModel()).checkCRSStatus(new Function1() { // from class: wzl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SetUnWearPwdFragment.checkCRSStatus$lambda$12$lambda$11(this.f38523a, ((Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCRSStatus$lambda$12$lambda$11(SetUnWearPwdFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new SetUnWearPwdFragment$checkCRSStatus$1$1$1(this$0, z, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkPinOnce() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        ((SetUnWearPwdViewModel) getMViewModel()).checkPin(new Function1() { // from class: szl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SetUnWearPwdFragment.checkPinOnce$lambda$9(this.f34136a, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit checkPinOnce$lambda$9(final SetUnWearPwdFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 1) {
            this$0.hideLoading();
            NfcManager nfcManagerExtKt = NfcManagerExtKt.getInstance(NfcManager.INSTANCE);
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            nfcManagerExtKt.gotoMasterListPage(fragmentActivityRequireActivity);
            this$0.finish();
        } else if (i == 2) {
            this$0.hideLoading();
            this$0.checkPinTwice();
        } else if (i == 3) {
            this$0.checkCRSStatus();
        } else if (i == 4) {
            this$0.hideLoading();
            NfcManager nfcManagerExtKt2 = NfcManagerExtKt.getInstance(NfcManager.INSTANCE);
            FragmentActivity fragmentActivityRequireActivity2 = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
            nfcManagerExtKt2.gotoMasterListPage(fragmentActivityRequireActivity2);
            this$0.finish();
        } else if (i == 6) {
            ((SetUnWearPwdViewModel) this$0.getMViewModel()).clearSE(new Function2() { // from class: uzl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SetUnWearPwdFragment.checkPinOnce$lambda$9$lambda$8(this.f36327a, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        } else if (i != 7) {
            this$0.checkPinTwice();
        } else {
            ((SetUnWearPwdViewModel) this$0.getMViewModel()).clearSE(new Function2() { // from class: tzl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SetUnWearPwdFragment.checkPinOnce$lambda$9$lambda$7(this.f35222a, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPinOnce$lambda$9$lambda$7(SetUnWearPwdFragment this$0, boolean z, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkPinTwice();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPinOnce$lambda$9$lambda$8(SetUnWearPwdFragment this$0, boolean z, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkPinTwice();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkPinTwice() {
        ((SetUnWearPwdViewModel) getMViewModel()).checkPin(new Function1() { // from class: b0m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SetUnWearPwdFragment.checkPinTwice$lambda$10(this.f3658a, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    public static final Unit checkPinTwice$lambda$10(SetUnWearPwdFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 1) {
            this$0.hideLoading();
            NfcManager nfcManagerExtKt = NfcManagerExtKt.getInstance(NfcManager.INSTANCE);
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            nfcManagerExtKt.gotoMasterListPage(fragmentActivityRequireActivity);
            this$0.finish();
        } else if (i == 3) {
            this$0.checkCRSStatus();
        } else if (i != 4) {
            this$0.hideLoading();
            FragmentActivity mActivity = this$0.getMActivity();
            Intrinsics.checkNotNull(mActivity);
            ToastExtKt.toastShort(mActivity, wzi.common_hint_unkonwn_error);
        } else {
            this$0.hideLoading();
            NfcManager nfcManagerExtKt2 = NfcManagerExtKt.getInstance(NfcManager.INSTANCE);
            FragmentActivity fragmentActivityRequireActivity2 = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
            nfcManagerExtKt2.gotoMasterListPage(fragmentActivityRequireActivity2);
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    private final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    private final boolean isInputValidate(String regex, String content) {
        Pattern patternCompile = Pattern.compile(regex);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        return patternCompile.matcher(content).matches();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void notNeedPrepare() {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        if (!mDeviceModel.getIsDeviceConnected()) {
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            ToastExtKt.toastShort(mActivity, wzi.u);
            return;
        }
        String string = getMBinding().D.getText().toString();
        if (Intrinsics.areEqual(this.prePwd, string)) {
            PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
            ((SetUnWearPwdViewModel) getMViewModel()).setUnWearEnable(true, string);
            return;
        }
        getMBinding().A.setText(wzi.U8);
        TextView textView = getMBinding().A;
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        textView.setTextColor(mActivity2.getColor(cji.z));
    }

    private final void resetView() {
        if (TextUtils.isEmpty(this.prePwd)) {
            finish();
            return;
        }
        this.prePwd = null;
        getMBinding().D.setText("");
        getMBinding().A.setText(wzi.S8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(SetUnWearPwdFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_set_success);
            }
            this$0.setResult(this$0.getMBinding().D.getText().toString());
            return;
        }
        this$0.hideLoading();
        FragmentActivity mActivity2 = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        ToastExtKt.toastShort(mActivity2, wzi.common_set_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(SetUnWearPwdFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.resetView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(SetUnWearPwdFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!TextUtils.isEmpty(this$0.prePwd)) {
            this$0.notNeedPrepare();
            return;
        }
        this$0.prePwd = this$0.getMBinding().D.getText().toString();
        this$0.getMBinding().A.setText(wzi.T8);
        this$0.getMBinding().D.setText("");
        this$0.getMBinding().C.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$4(SetUnWearPwdFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isShowPwd) {
            this$0.isShowPwd = false;
            this$0.getMBinding().F.setImageResource(jni.A1);
            this$0.getMBinding().D.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this$0.getMBinding().F.setContentDescription(this$0.getString(wzi.e7));
        } else {
            this$0.isShowPwd = true;
            this$0.getMBinding().F.setImageResource(jni.z1);
            this$0.getMBinding().D.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            this$0.getMBinding().F.setContentDescription(this$0.getString(wzi.Y4));
        }
        this$0.getMBinding().D.postInvalidate();
        Editable text = this$0.getMBinding().D.getText();
        if (text == null || text.length() == 0) {
            return;
        }
        this$0.getMBinding().D.setSelection(text.length());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setResult(String pwd) {
        ((SetUnWearPwdViewModel) getMViewModel()).setUnWearSetting();
        Intent intent = new Intent();
        intent.putExtra(sPassWord, pwd);
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1, intent);
        }
        if (!this.isNeedSync) {
            finish();
            return;
        }
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel != null) {
            if (DeviceModelExtKt.isHuaMi(mDeviceModel)) {
                checkPinOnce();
                return;
            }
            FragmentActivity mActivity2 = getMActivity();
            if (mActivity2 != null) {
                NfcManagerExtKt.getInstance(NfcManager.INSTANCE).gotoMasterListPage(mActivity2);
            }
            finish();
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable s) {
        getMBinding().C.setEnabled(isInputValidate("\\d{6}", String.valueOf(s)));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence s, int start, int count, int after) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull aj6 aj6Var) {
        Intrinsics.checkNotNullParameter(aj6Var, "<this>");
        setTitle(wzi.s5);
        getMBinding().A.setText(wzi.S8);
        ((SetUnWearPwdViewModel) getMViewModel()).setIsRequired(this.isRequired);
        aj6Var.D.setFocusable(true);
        aj6Var.D.requestFocus();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.G0;
    }

    @Nullable
    public final String getPrePwd() {
        return this.prePwd;
    }

    /* JADX INFO: renamed from: isNeedSync, reason: from getter */
    public final boolean getIsNeedSync() {
        return this.isNeedSync;
    }

    /* JADX INFO: renamed from: isRequired, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    /* JADX INFO: renamed from: isShowPwd, reason: from getter */
    public final boolean getIsShowPwd() {
        return this.isShowPwd;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence s, int start, int before, int count) {
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            this.isNeedSync = args.getBoolean(UnWearSettingFragment.IS_NFC_NEED, false);
            this.isRequired = args.getBoolean(sIsRequired, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        ((SetUnWearPwdViewModel) getMViewModel()).getSetUnWearResult().observe(getViewLifecycleOwner(), new Observer() { // from class: xzl
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SetUnWearPwdFragment.setListener$lambda$1(this.f39621a, (Boolean) obj);
            }
        });
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: yzl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetUnWearPwdFragment.setListener$lambda$2(this.f40728a, view);
            }
        });
        getMBinding().C.setOnClickListener(new View.OnClickListener() { // from class: zzl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetUnWearPwdFragment.setListener$lambda$3(this.f41836a, view);
            }
        });
        getMBinding().F.setOnClickListener(new View.OnClickListener() { // from class: a0m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetUnWearPwdFragment.setListener$lambda$4(this.f489a, view);
            }
        });
        getMBinding().D.addTextChangedListener(this);
    }

    public final void setNeedSync(boolean z) {
        this.isNeedSync = z;
    }

    public final void setPrePwd(@Nullable String str) {
        this.prePwd = str;
    }

    public final void setRequired(boolean z) {
        this.isRequired = z;
    }

    public final void setShowPwd(boolean z) {
        this.isShowPwd = z;
    }
}
