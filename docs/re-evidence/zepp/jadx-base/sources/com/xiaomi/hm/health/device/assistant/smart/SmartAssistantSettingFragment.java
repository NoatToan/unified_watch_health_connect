package com.xiaomi.hm.health.device.assistant.smart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.p008lifecycle.Observer;
import androidx.p010navigation.fragment.FragmentKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.databinding.FragmentSmartAssistantSettingBinding;
import com.huami.lib.rainbow.widget.SwitchCompat;
import com.loc.z;
import com.xiaomi.hm.health.device.assistant.smart.SmartAssistantSettingFragment;
import com.xiaomi.hm.health.device.assistant.viewmodel.SmartCardsSettingViewModel;
import com.xiaomi.hm.health.device.assistant.viewmodel.UpdateStatus;
import com.xiaomi.hm.health.device.setting.ui.subview.AbstractDeviceFragment;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001d\u0010\u0016\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/SmartAssistantSettingFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/AbstractDeviceFragment;", "", "h", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/device/assistant/viewmodel/SmartCardsSettingViewModel;", "g", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/assistant/viewmodel/SmartCardsSettingViewModel;", "smartCardsViewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "f", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingHelper", "i", "Landroid/view/View;", "contentView", "Lcom/huami/devicex/databinding/FragmentSmartAssistantSettingBinding;", z.j, "Lcom/huami/devicex/databinding/FragmentSmartAssistantSettingBinding;", "_binding", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SmartAssistantSettingFragment extends AbstractDeviceFragment {

    @NotNull
    private static final String k = "SmartAssistantSettingFragment";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy smartCardsViewModel = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingHelper = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private View contentView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private FragmentSmartAssistantSettingBinding _binding;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdateStatus.values().length];
            iArr[UpdateStatus.LOADING.ordinal()] = 1;
            iArr[UpdateStatus.SUCCESS.ordinal()] = 2;
            iArr[UpdateStatus.SAVING.ordinal()] = 3;
            iArr[UpdateStatus.SAVE_FAIL.ordinal()] = 4;
            iArr[UpdateStatus.SAVE_SUCCESS.ordinal()] = 5;
            iArr[UpdateStatus.FAIL.ordinal()] = 6;
            iArr[UpdateStatus.TIMEOUT.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LoadingDialog> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog invoke() {
            return new LoadingDialog(SmartAssistantSettingFragment.this.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/viewmodel/SmartCardsSettingViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SmartCardsSettingViewModel> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SmartCardsSettingViewModel invoke() {
            return (SmartCardsSettingViewModel) SmartAssistantSettingFragment.this.loadViewModel(SmartCardsSettingViewModel.class);
        }
    }

    private final LoadingDialog f() {
        return (LoadingDialog) this.loadingHelper.getValue();
    }

    private final SmartCardsSettingViewModel g() {
        return (SmartCardsSettingViewModel) this.smartCardsViewModel.getValue();
    }

    private final void h() {
        SmartCardsSettingViewModel smartCardsSettingViewModelG = g();
        if (smartCardsSettingViewModelG == null) {
            return;
        }
        smartCardsSettingViewModelG.getDisplayMattersSettingLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: s37
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SmartAssistantSettingFragment.i(this.a, (Boolean) obj);
            }
        });
        smartCardsSettingViewModelG.getStatueLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: r37
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SmartAssistantSettingFragment.j(this.a, (UpdateStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SmartAssistantSettingFragment smartAssistantSettingFragment, Boolean bool) {
        if (bool == null) {
            return;
        }
        FragmentSmartAssistantSettingBinding fragmentSmartAssistantSettingBinding = smartAssistantSettingFragment._binding;
        Objects.requireNonNull(fragmentSmartAssistantSettingBinding);
        fragmentSmartAssistantSettingBinding.itemShowAttention.setChecked(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SmartAssistantSettingFragment smartAssistantSettingFragment, UpdateStatus updateStatus) {
        if (updateStatus == null) {
            return;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[updateStatus.ordinal()]) {
            case 1:
                smartAssistantSettingFragment.f().setMessage(smartAssistantSettingFragment.getString(R.string.setting_dev_loading));
                smartAssistantSettingFragment.f().show();
                break;
            case 2:
                smartAssistantSettingFragment.f().dismiss();
                break;
            case 3:
                smartAssistantSettingFragment.f().setMessage(smartAssistantSettingFragment.getString(R.string.saving));
                smartAssistantSettingFragment.f().show();
                break;
            case 4:
                smartAssistantSettingFragment.f().setFailed(smartAssistantSettingFragment.getString(R.string.save_failed));
                break;
            case 5:
                smartAssistantSettingFragment.f().setSuccess(smartAssistantSettingFragment.getString(R.string.saving_success));
                break;
            case 6:
            case 7:
                smartAssistantSettingFragment.f().setFailed(smartAssistantSettingFragment.getString(R.string.load_fail));
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(SmartAssistantSettingFragment smartAssistantSettingFragment, View view) {
        FragmentKt.findNavController(smartAssistantSettingFragment).navigateUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(SmartAssistantSettingFragment smartAssistantSettingFragment, CompoundButton compoundButton, boolean z) {
        SmartCardsSettingViewModel smartCardsSettingViewModelG;
        if (!(compoundButton instanceof SwitchCompat) || (smartCardsSettingViewModelG = smartAssistantSettingFragment.g()) == null) {
            return;
        }
        smartCardsSettingViewModelG.updateDisplayMatters(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(SmartAssistantSettingFragment smartAssistantSettingFragment, View view) {
        FragmentKt.findNavController(smartAssistantSettingFragment).navigate(R.id.action_to_smartCardSettingFragment);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.AbstractDeviceFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (this.contentView == null) {
            FragmentSmartAssistantSettingBinding fragmentSmartAssistantSettingBindingInflate = FragmentSmartAssistantSettingBinding.inflate(inflater, container, false);
            this._binding = fragmentSmartAssistantSettingBindingInflate;
            Objects.requireNonNull(fragmentSmartAssistantSettingBindingInflate);
            this.contentView = fragmentSmartAssistantSettingBindingInflate.getRoot();
        }
        return this.contentView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentSmartAssistantSettingBinding fragmentSmartAssistantSettingBinding = this._binding;
        Objects.requireNonNull(fragmentSmartAssistantSettingBinding);
        fragmentSmartAssistantSettingBinding.actionbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: p37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SmartAssistantSettingFragment.k(this.a, view2);
            }
        });
        FragmentSmartAssistantSettingBinding fragmentSmartAssistantSettingBinding2 = this._binding;
        Objects.requireNonNull(fragmentSmartAssistantSettingBinding2);
        fragmentSmartAssistantSettingBinding2.itemShowAttention.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: q37
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SmartAssistantSettingFragment.l(this.a, compoundButton, z);
            }
        });
        FragmentSmartAssistantSettingBinding fragmentSmartAssistantSettingBinding3 = this._binding;
        Objects.requireNonNull(fragmentSmartAssistantSettingBinding3);
        fragmentSmartAssistantSettingBinding3.itemCardSetting.setOnClickListener(new View.OnClickListener() { // from class: o37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SmartAssistantSettingFragment.m(this.a, view2);
            }
        });
        h();
        SmartCardsSettingViewModel smartCardsSettingViewModelG = g();
        if (smartCardsSettingViewModelG == null) {
            return;
        }
        smartCardsSettingViewModelG.loadDisplayMatters();
    }
}
