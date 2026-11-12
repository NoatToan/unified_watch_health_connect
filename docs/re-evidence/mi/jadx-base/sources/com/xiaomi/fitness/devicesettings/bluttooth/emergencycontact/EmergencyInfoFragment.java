package com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyInfoFragment;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.eui;
import defpackage.jni;
import defpackage.og6;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyInfoFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyInfoViewModel;", "Log6;", "", "hasInfo", "()Z", "isPhoneNumberLegal", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "remark", "Ljava/lang/String;", RealNameWebViewActivity.NUMBER, "", "getLayoutId", "()I", "layoutId", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEmergencyInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmergencyInfoFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyInfoFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
public final class EmergencyInfoFragment extends BaseBindingFragment<EmergencyInfoViewModel, og6> {

    @NotNull
    public static final String EMERGENCY_INFO_NUMBER_EXTRA = "emergency_info_number_extra";

    @NotNull
    public static final String EMERGENCY_INFO_REMARK_EXTRA = "emergency_info_remark_extra";

    @NotNull
    public static final String TAG = "EmergencyInfoFragment";

    @Nullable
    private String number;

    @Nullable
    private String remark;

    private final boolean hasInfo() {
        return getMBinding().A.getText().length() > 0 && getMBinding().B.getText().length() > 0;
    }

    private final boolean isPhoneNumberLegal() {
        return getMBinding().A.getText().length() <= 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(EmergencyInfoFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.hasInfo()) {
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.L3);
                return;
            }
            return;
        }
        if (!this$0.isPhoneNumberLegal()) {
            Context context2 = this$0.getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, wzi.M3);
                return;
            }
            return;
        }
        this$0.remark = this$0.getMBinding().B.getText();
        this$0.number = this$0.getMBinding().A.getText();
        Intent intent = new Intent();
        intent.putExtra(EMERGENCY_INFO_REMARK_EXTRA, this$0.remark);
        intent.putExtra(EMERGENCY_INFO_NUMBER_EXTRA, this$0.number);
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
        }
        FragmentActivity activity2 = this$0.getActivity();
        if (activity2 != null) {
            activity2.lambda$onCreate$0();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.b0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.P3);
        this.remark = requireArguments().getString(EMERGENCY_INFO_REMARK_EXTRA);
        this.number = requireArguments().getString(EMERGENCY_INFO_NUMBER_EXTRA);
        String str = this.remark;
        if (str != null) {
            getMBinding().B.setText(str);
        }
        String str2 = this.number;
        if (str2 != null) {
            getMBinding().A.setText(str2);
        }
        IActionBar.DefaultImpls.setEndView$default(this, 0, jni.f1, getString(wzi.U6), new View.OnClickListener() { // from class: q88
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EmergencyInfoFragment.onViewCreated$lambda$3(this.f31220a, view2);
            }
        }, 1, null);
    }
}
