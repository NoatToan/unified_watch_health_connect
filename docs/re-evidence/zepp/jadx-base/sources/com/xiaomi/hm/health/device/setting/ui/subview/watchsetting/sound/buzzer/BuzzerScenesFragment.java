package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.buzzer;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.SoundAndVibrate;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.enums.BuzzerScenes;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v2.SoundAndVibrateV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.buzzer.BuzzerScenesFragment;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/buzzer/BuzzerScenesFragment;", "Landroidx/fragment/app/Fragment;", "", "e", "initViewModel", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onActivityCreated", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/SoundVibrationViewModel;", "a", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/SoundVibrationViewModel;", "viewModel", "<init>", "()V", "b", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BuzzerScenesFragment extends Fragment {

    @NotNull
    private static final a b = new a(null);

    @Deprecated
    @NotNull
    private static final String c = "BuzzerScenesFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private SoundVibrationViewModel viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/buzzer/BuzzerScenesFragment$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BuzzerScenesFragment() {
        super(R.layout.fragment_buzzer_scenes);
    }

    private final void e() {
        View view = getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.sportSceneItem))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: sg0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                BuzzerScenesFragment.f(this.a, compoundButton, z);
            }
        });
        View view2 = getView();
        ((ListTile) (view2 != null ? view2.findViewById(R.id.otherSceneItem) : null)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: tg0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                BuzzerScenesFragment.g(this.a, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(BuzzerScenesFragment buzzerScenesFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            if (z) {
                SoundVibrationViewModel soundVibrationViewModel = buzzerScenesFragment.viewModel;
                Objects.requireNonNull(soundVibrationViewModel);
                soundVibrationViewModel.addBuzzerScene(BuzzerScenes.Sports);
            } else {
                SoundVibrationViewModel soundVibrationViewModel2 = buzzerScenesFragment.viewModel;
                Objects.requireNonNull(soundVibrationViewModel2);
                soundVibrationViewModel2.removeBuzzerScene(BuzzerScenes.Sports);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(BuzzerScenesFragment buzzerScenesFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            if (z) {
                SoundVibrationViewModel soundVibrationViewModel = buzzerScenesFragment.viewModel;
                Objects.requireNonNull(soundVibrationViewModel);
                soundVibrationViewModel.addBuzzerScene(BuzzerScenes.Others);
            } else {
                SoundVibrationViewModel soundVibrationViewModel2 = buzzerScenesFragment.viewModel;
                Objects.requireNonNull(soundVibrationViewModel2);
                soundVibrationViewModel2.removeBuzzerScene(BuzzerScenes.Others);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(BuzzerScenesFragment buzzerScenesFragment, SoundAndVibrate soundAndVibrate) {
        SoundAndVibrateV2 soundAndVibrateV2 = soundAndVibrate instanceof SoundAndVibrateV2 ? (SoundAndVibrateV2) soundAndVibrate : null;
        if (soundAndVibrateV2 == null) {
            return;
        }
        EnumArray buzzerScenes = soundAndVibrateV2.getBuzzerScenes();
        ArrayList<Integer> values = buzzerScenes == null ? null : buzzerScenes.getValues();
        if (values == null) {
            return;
        }
        View view = buzzerScenesFragment.getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.sportSceneItem))).setChecked(values.contains(0));
        View view2 = buzzerScenesFragment.getView();
        ((ListTile) (view2 != null ? view2.findViewById(R.id.otherSceneItem) : null)).setChecked(values.contains(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(BuzzerScenesFragment buzzerScenesFragment, View view) {
        FragmentKt.findNavController(buzzerScenesFragment).popBackStack();
    }

    private final void initViewModel() {
        SoundVibrationViewModel soundVibrationViewModel = (SoundVibrationViewModel) new ViewModelProvider(requireActivity()).get(SoundVibrationViewModel.class);
        this.viewModel = soundVibrationViewModel;
        Objects.requireNonNull(soundVibrationViewModel);
        soundVibrationViewModel.getSoundAndVibrate().observe(getViewLifecycleOwner(), new Observer() { // from class: ug0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BuzzerScenesFragment.h(this.a, (SoundAndVibrate) obj);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViewModel();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View view2 = getView();
        ((RainbowTitleBar) (view2 == null ? null : view2.findViewById(R.id.titleBar))).setNavigationOnClickListener(new View.OnClickListener() { // from class: rg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                BuzzerScenesFragment.i(this.a, view3);
            }
        });
        e();
    }
}
