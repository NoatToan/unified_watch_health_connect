package com.xiaomi.hm.health.device.setting.ui.subview;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p008lifecycle.Observer;
import androidx.p010navigation.fragment.FragmentKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.devicex.R;
import com.huami.devicex.databinding.FragmentDeviceSettingAboutBinding;
import com.xiaomi.hm.health.device.setting.ui.subview.AboutDeviceFragment;
import com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/AboutDeviceFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/AbstractDeviceFragment;", "", "c", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/devicex/databinding/FragmentDeviceSettingAboutBinding;", "g", "Lcom/huami/devicex/databinding/FragmentDeviceSettingAboutBinding;", "binding", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AboutDeviceFragment extends AbstractDeviceFragment {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private FragmentDeviceSettingAboutBinding binding;

    private final void c() {
        FeatureViewModel featureViewModel = getFeatureViewModel();
        if (featureViewModel == null) {
            return;
        }
        featureViewModel.getMacAddressLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: v
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AboutDeviceFragment.d(this.a, (String) obj);
            }
        });
        featureViewModel.loadDeviceMacAddress();
        FragmentDeviceSettingAboutBinding fragmentDeviceSettingAboutBinding = this.binding;
        Objects.requireNonNull(fragmentDeviceSettingAboutBinding);
        fragmentDeviceSettingAboutBinding.itemFwVersion.setTips(featureViewModel.getDeviceVersion());
        FragmentDeviceSettingAboutBinding fragmentDeviceSettingAboutBinding2 = this.binding;
        Objects.requireNonNull(fragmentDeviceSettingAboutBinding2);
        fragmentDeviceSettingAboutBinding2.itemFwVersion.setTrailing((Drawable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AboutDeviceFragment aboutDeviceFragment, String str) {
        FragmentDeviceSettingAboutBinding fragmentDeviceSettingAboutBinding = aboutDeviceFragment.binding;
        Objects.requireNonNull(fragmentDeviceSettingAboutBinding);
        fragmentDeviceSettingAboutBinding.itemMacAddress.setTips(str);
        FragmentDeviceSettingAboutBinding fragmentDeviceSettingAboutBinding2 = aboutDeviceFragment.binding;
        Objects.requireNonNull(fragmentDeviceSettingAboutBinding2);
        fragmentDeviceSettingAboutBinding2.itemMacAddress.setTrailing((Drawable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AboutDeviceFragment aboutDeviceFragment, View view) {
        FragmentKt.findNavController(aboutDeviceFragment).navigateUp();
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.AbstractDeviceFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentDeviceSettingAboutBinding fragmentDeviceSettingAboutBindingInflate = FragmentDeviceSettingAboutBinding.inflate(inflater);
        this.binding = fragmentDeviceSettingAboutBindingInflate;
        Objects.requireNonNull(fragmentDeviceSettingAboutBindingInflate);
        return fragmentDeviceSettingAboutBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentDeviceSettingAboutBinding fragmentDeviceSettingAboutBinding = this.binding;
        Objects.requireNonNull(fragmentDeviceSettingAboutBinding);
        fragmentDeviceSettingAboutBinding.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AboutDeviceFragment.e(this.a, view2);
            }
        });
        FragmentDeviceSettingAboutBinding fragmentDeviceSettingAboutBinding2 = this.binding;
        Objects.requireNonNull(fragmentDeviceSettingAboutBinding2);
        fragmentDeviceSettingAboutBinding2.toolbar.setTitle(R.string.about_device);
        c();
    }
}
