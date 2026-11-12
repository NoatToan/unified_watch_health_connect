package com.xiaomi.hm.health.device.headset;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.headset.BindSingleHeadsetFragment;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/BindSingleHeadsetFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/device/headset/BindSingleHeadsetViewModel;", "a", "Lcom/xiaomi/hm/health/device/headset/BindSingleHeadsetViewModel;", "viewModel", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BindSingleHeadsetFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private BindSingleHeadsetViewModel viewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(BindSingleHeadsetFragment bindSingleHeadsetFragment, View view) {
        BindSingleHeadsetViewModel bindSingleHeadsetViewModel = bindSingleHeadsetFragment.viewModel;
        Objects.requireNonNull(bindSingleHeadsetViewModel);
        bindSingleHeadsetViewModel.upgradeDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(BindSingleHeadsetFragment bindSingleHeadsetFragment, View view) {
        BindSingleHeadsetViewModel bindSingleHeadsetViewModel = bindSingleHeadsetFragment.viewModel;
        Objects.requireNonNull(bindSingleHeadsetViewModel);
        bindSingleHeadsetViewModel.bindDevice();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.viewModel = (BindSingleHeadsetViewModel) new ViewModelProvider(requireActivity()).get(BindSingleHeadsetViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bind_single_headset, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.tv_upgrade))).setOnClickListener(new View.OnClickListener() { // from class: zx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                BindSingleHeadsetFragment.c(this.a, view3);
            }
        });
        View view3 = getView();
        ((TextView) (view3 != null ? view3.findViewById(R.id.tv_next) : null)).setOnClickListener(new View.OnClickListener() { // from class: ay
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                BindSingleHeadsetFragment.d(this.a, view4);
            }
        });
    }
}
