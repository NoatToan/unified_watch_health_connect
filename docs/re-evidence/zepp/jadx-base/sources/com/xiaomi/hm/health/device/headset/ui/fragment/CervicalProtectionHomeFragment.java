package com.xiaomi.hm.health.device.headset.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcherKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.xiaomi.hm.health.device.headset.ui.CervicalProtectionActivity;
import com.xiaomi.hm.health.device.headset.ui.fragment.CervicalProtectionHomeFragment;
import com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel;
import com.xiaomi.hm.health.device.headset.vo.CervicalProtectionVo;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/fragment/CervicalProtectionHomeFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "onActivityCreated", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CervicalProtectionViewModel;", "a", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CervicalProtectionViewModel;", "viewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "b", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "setLoadingDlg", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class CervicalProtectionHomeFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private CervicalProtectionViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog setLoadingDlg;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<OnBackPressedCallback, Unit> {
        public final /* synthetic */ CervicalProtectionActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CervicalProtectionActivity cervicalProtectionActivity) {
            super(1);
            this.a = cervicalProtectionActivity;
        }

        public final void a(@NotNull OnBackPressedCallback onBackPressedCallback) {
            this.a.setResult();
            this.a.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
            a(onBackPressedCallback);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                FragmentKt.findNavController(CervicalProtectionHomeFragment.this).navigate(R.id.action_cervicalProtectionHomeFragment_to_cervicalProtectionCalibrationFragment);
                return;
            }
            LoadingDialog loadingDialog = CervicalProtectionHomeFragment.this.setLoadingDlg;
            if (loadingDialog == null) {
                return;
            }
            if (!(!loadingDialog.isShowing())) {
                loadingDialog = null;
            }
            if (loadingDialog == null) {
                return;
            }
            CervicalProtectionHomeFragment cervicalProtectionHomeFragment = CervicalProtectionHomeFragment.this;
            loadingDialog.show();
            loadingDialog.setFailed(cervicalProtectionHomeFragment.getString(R.string.save_failed));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CervicalProtectionActivity cervicalProtectionActivity, View view) {
        cervicalProtectionActivity.setResult();
        cervicalProtectionActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(CervicalProtectionHomeFragment cervicalProtectionHomeFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            CervicalProtectionViewModel cervicalProtectionViewModel = cervicalProtectionHomeFragment.viewModel;
            Objects.requireNonNull(cervicalProtectionViewModel);
            cervicalProtectionViewModel.setCervicalProtection(z, cervicalProtectionHomeFragment.new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(CervicalProtectionHomeFragment cervicalProtectionHomeFragment, CervicalProtectionVo cervicalProtectionVo) {
        if (cervicalProtectionVo == null) {
            return;
        }
        View view = cervicalProtectionHomeFragment.getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.headset_settings_cervical_protection_switch))).setEnabled(cervicalProtectionVo.isEnable());
        View view2 = cervicalProtectionHomeFragment.getView();
        ListTile listTile = (ListTile) (view2 != null ? view2.findViewById(R.id.headset_settings_cervical_protection_switch) : null);
        Boolean cervicalProtection = cervicalProtectionVo.getCervicalProtection();
        listTile.setChecked(cervicalProtection == null ? false : cervicalProtection.booleanValue());
        if (Intrinsics.areEqual(cervicalProtectionVo.getCervicalProtection(), Boolean.TRUE)) {
            FragmentKt.findNavController(cervicalProtectionHomeFragment).navigate(R.id.action_cervicalProtectionHomeFragment_to_cervicalProtectionDetailFragment);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        final CervicalProtectionActivity cervicalProtectionActivity;
        super.onActivityCreated(savedInstanceState);
        FragmentActivity activity = getActivity();
        if (!(activity == null ? true : activity instanceof CervicalProtectionActivity) || (cervicalProtectionActivity = (CervicalProtectionActivity) getActivity()) == null) {
            return;
        }
        cervicalProtectionActivity.setRainbowTitle(R.string.settings_item_cervical_protection);
        cervicalProtectionActivity.setBackClick(new View.OnClickListener() { // from class: xm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CervicalProtectionHomeFragment.d(cervicalProtectionActivity, view);
            }
        });
        OnBackPressedDispatcherKt.addCallback$default(cervicalProtectionActivity.getOnBackPressedDispatcher(), this, false, new a(cervicalProtectionActivity), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cervical_protection, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        CervicalProtectionViewModel cervicalProtectionViewModel = this.viewModel;
        if (cervicalProtectionViewModel != null) {
            Objects.requireNonNull(cervicalProtectionViewModel);
            CervicalProtectionViewModel.releaseCallback$default(cervicalProtectionViewModel, Boolean.TRUE, null, null, null, 14, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (this.setLoadingDlg == null) {
            LoadingDialog loadingDialog = new LoadingDialog(requireContext());
            loadingDialog.setCancelable(false);
            Unit unit = Unit.INSTANCE;
            this.setLoadingDlg = loadingDialog;
        }
        View view2 = getView();
        ((ListTile) (view2 == null ? null : view2.findViewById(R.id.headset_settings_cervical_protection_switch))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ym0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CervicalProtectionHomeFragment.e(this.a, compoundButton, z);
            }
        });
        CervicalProtectionViewModel cervicalProtectionViewModel = (CervicalProtectionViewModel) new ViewModelProvider(requireActivity()).get(CervicalProtectionViewModel.class);
        this.viewModel = cervicalProtectionViewModel;
        Objects.requireNonNull(cervicalProtectionViewModel);
        cervicalProtectionViewModel.getCervicalProtection().observe(getViewLifecycleOwner(), new Observer() { // from class: zm0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CervicalProtectionHomeFragment.f(this.a, (CervicalProtectionVo) obj);
            }
        });
    }
}
