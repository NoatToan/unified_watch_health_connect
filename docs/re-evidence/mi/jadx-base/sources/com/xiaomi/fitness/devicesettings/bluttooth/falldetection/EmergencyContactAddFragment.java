package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyInfoFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactAddFragment;
import defpackage.eui;
import defpackage.jni;
import defpackage.kg6;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactAddFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactAddViewModel;", "Lkg6;", "", "hasInfo", "()Z", "isPhoneNumberLegal", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getLayoutId", "()I", "layoutId", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EmergencyContactAddFragment extends BaseBindingFragment<EmergencyContactAddViewModel, kg6> {

    @NotNull
    private static final String TAG = "EmergencyContactAddFragment";

    private final boolean hasInfo() {
        return getMBinding().B.getText().length() > 0 && getMBinding().A.getText().length() > 0;
    }

    private final boolean isPhoneNumberLegal() {
        return getMBinding().B.getText().length() <= 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(EmergencyContactAddFragment this$0, View view) {
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
        Intent intent = new Intent();
        intent.putExtra(EmergencyInfoFragment.EMERGENCY_INFO_REMARK_EXTRA, this$0.getMBinding().A.getText());
        intent.putExtra(EmergencyInfoFragment.EMERGENCY_INFO_NUMBER_EXTRA, this$0.getMBinding().B.getText());
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
        return eui.Z;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.v7);
        View endView$default = IActionBar.DefaultImpls.setEndView$default(this, 0, jni.f0, null, new View.OnClickListener() { // from class: f78
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EmergencyContactAddFragment.onViewCreated$lambda$1(this.f17490a, view2);
            }
        }, 5, null);
        if (endView$default != null) {
            endView$default.setContentDescription(getString(wzi.T6));
        }
    }
}
