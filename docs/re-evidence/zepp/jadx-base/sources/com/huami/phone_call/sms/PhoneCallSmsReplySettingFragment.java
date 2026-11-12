package com.huami.phone_call.sms;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.phone_call.sms.PhoneCallSmsReplySettingFragment;
import com.huami.phone_call.sms.data.SmsReplySetting;
import com.huami.phone_call.sms.databinding.FragmentSmsReplySettingBinding;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.loc.z;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001d\u0010\u0011\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/phone_call/sms/PhoneCallSmsReplySettingFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/huami/phone_call/sms/databinding/FragmentSmsReplySettingBinding;", "", "f", "Lcom/huami/phone_call/sms/data/SmsReplySetting;", "setting", z.j, "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", GoogleApiAvailabilityLight.a, "()Lcom/huami/phone_call/sms/databinding/FragmentSmsReplySettingBinding;", "binding", "Lcom/huami/phone_call/sms/SmsReplySettingViewModel;", "b", "Lkotlin/Lazy;", "e", "()Lcom/huami/phone_call/sms/SmsReplySettingViewModel;", "viewModel", "<init>", "()V", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
public final class PhoneCallSmsReplySettingFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] c = {Reflection.property1(new PropertyReference1Impl(PhoneCallSmsReplySettingFragment.class, "binding", "getBinding()Lcom/huami/phone_call/sms/databinding/FragmentSmsReplySettingBinding;", 0))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneCallSmsReplySettingFragment() {
        super(R.layout.fragment_sms_reply_setting);
        this.binding = FragmentViewBindingKt.viewBinding(new PhoneCallSmsReplySettingFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentSmsReplySettingBinding.class)));
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.phone_call.sms.PhoneCallSmsReplySettingFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SmsReplySettingViewModel>() { // from class: com.huami.phone_call.sms.PhoneCallSmsReplySettingFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.phone_call.sms.SmsReplySettingViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SmsReplySettingViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SmsReplySettingViewModel.class), function0, objArr);
            }
        });
    }

    private final FragmentSmsReplySettingBinding d() {
        return (FragmentSmsReplySettingBinding) this.binding.getValue(this, c[0]);
    }

    private final SmsReplySettingViewModel e() {
        return (SmsReplySettingViewModel) this.viewModel.getValue();
    }

    private final void f(FragmentSmsReplySettingBinding fragmentSmsReplySettingBinding) {
        fragmentSmsReplySettingBinding.smsReply.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ax5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PhoneCallSmsReplySettingFragment.g(this.a, compoundButton, z);
            }
        });
        fragmentSmsReplySettingBinding.smsReplyManager.setOnClickListener(new View.OnClickListener() { // from class: zw5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneCallSmsReplySettingFragment.h(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(PhoneCallSmsReplySettingFragment phoneCallSmsReplySettingFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            phoneCallSmsReplySettingFragment.e().setEnable(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(View view) {
        PhoneCallReplyMsgActivity.INSTANCE.start(view.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(PhoneCallSmsReplySettingFragment phoneCallSmsReplySettingFragment, SmsReplySetting smsReplySetting) {
        phoneCallSmsReplySettingFragment.j(phoneCallSmsReplySettingFragment.d(), smsReplySetting);
    }

    private final void j(FragmentSmsReplySettingBinding fragmentSmsReplySettingBinding, SmsReplySetting smsReplySetting) {
        if (!smsReplySetting.getVisible()) {
            fragmentSmsReplySettingBinding.smsReply.setVisibility(8);
            fragmentSmsReplySettingBinding.smsReplyManager.setVisibility(8);
            return;
        }
        fragmentSmsReplySettingBinding.smsReply.setVisibility(0);
        boolean z = smsReplySetting.getDeviceConnected() && smsReplySetting.getPhoneAlertEnable();
        fragmentSmsReplySettingBinding.smsReply.setEnabled(z);
        fragmentSmsReplySettingBinding.smsReplyManager.setEnabled(z);
        fragmentSmsReplySettingBinding.smsReply.setChecked(smsReplySetting.getReplyEnable());
        fragmentSmsReplySettingBinding.smsReplyManager.setVisibility(smsReplySetting.getReplyEnable() ? 0 : 8);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        f(d());
        e().getSettingLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: bx5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneCallSmsReplySettingFragment.i(this.a, (SmsReplySetting) obj);
            }
        });
        e().refresh();
    }
}
