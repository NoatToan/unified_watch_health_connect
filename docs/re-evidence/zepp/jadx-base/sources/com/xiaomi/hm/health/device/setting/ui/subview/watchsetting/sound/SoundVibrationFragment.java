package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.SoundAndVibrate;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v1.SoundAndVibrateV1;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationFragment;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u0007¢\u0006\u0004\b=\u0010>J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J#\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00105\u001a\u0002008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\"\u00107\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/SoundVibrationFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/component/KoinComponent;", "", "initView", hl.k, b.r, "", "isChecked", "", "checkId", "t", "(ZLjava/lang/Integer;)V", "result", z.j, "(Ljava/lang/Boolean;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onActivityCreated", "initEvents", "refreshView", "onDestroyView", "Landroid/widget/RadioGroup;", "a", "Landroid/widget/RadioGroup;", "soundStrength", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "b", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingDialogHelper", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;", "c", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;", "getSoundAndVibrate", "()Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;", "setSoundAndVibrate", "(Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;)V", "soundAndVibrate", "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", "fragment", "Lcom/huami/devicex/manager/DeviceManagerApi;", "e", "Lkotlin/Lazy;", "i", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/SoundVibrationViewModel;", "viewModel", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/SoundVibrationViewModel;", "getViewModel", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/SoundVibrationViewModel;", "setViewModel", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/SoundVibrationViewModel;)V", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class SoundVibrationFragment extends Fragment implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private RadioGroup soundStrength;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper loadingDialogHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private SoundAndVibrate soundAndVibrate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private BTStatusFragment fragment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;
    public SoundVibrationViewModel viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/SoundVibrationFragment$Companion;", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/SoundVibrationFragment;", "newInstance", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "isOnlySupportVibration", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean isOnlySupportVibration(@NotNull HMDeviceSource source) {
            return !ConfigHelperKt.hasFeature(source, Feature.SUPPORT_VOICE);
        }

        @NotNull
        public final SoundVibrationFragment newInstance() {
            return new SoundVibrationFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(SoundVibrationFragment.this).popBackStack();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SoundVibrationFragment() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceManagerApi i() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final void initView() {
        int i = INSTANCE.isOnlySupportVibration(i().getBoundDeviceSource(HMDeviceType.MILI)) ? R.string.ds_vibration : R.string.ds_sound_vibration;
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.toolbar_title))).setText(i);
    }

    @JvmStatic
    public static final boolean isOnlySupportVibration(@NotNull HMDeviceSource hMDeviceSource) {
        return INSTANCE.isOnlySupportVibration(hMDeviceSource);
    }

    private final void j(Boolean result) {
        if (result == null) {
            return;
        }
        if (result.booleanValue()) {
            LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.setSuccess(R.string.save_success);
            return;
        }
        LoadingDialogHelper loadingDialogHelper2 = this.loadingDialogHelper;
        if (loadingDialogHelper2 == null) {
            return;
        }
        loadingDialogHelper2.setFail(R.string.save_failed);
    }

    private final void k() {
        if (this.fragment == null) {
            BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(R.id.container, getChildFragmentManager());
            this.fragment = bTStatusFragmentNewInstance;
            if (bTStatusFragmentNewInstance != null) {
                bTStatusFragmentNewInstance.setShowBottomArea(false);
            }
            BTStatusFragment bTStatusFragment = this.fragment;
            if (bTStatusFragment == null) {
                return;
            }
            bTStatusFragment.setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationFragment$initBTStatusFragment$1
                @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
                public void onEnableChange(boolean enable) {
                    View view = this.a.getView();
                    if ((view == null ? null : view.findViewById(R.id.mask_view)) != null) {
                        View view2 = this.a.getView();
                        (view2 != null ? view2.findViewById(R.id.mask_view) : null).setVisibility(enable ? 8 : 0);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(SoundVibrationFragment soundVibrationFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            soundVibrationFragment.getViewModel().setRemindState(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(SoundVibrationFragment soundVibrationFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            soundVibrationFragment.getViewModel().setNotificationVibrationState(z);
            SoundVibrationViewModel.updateSoundVibrationCache$default(soundVibrationFragment.getViewModel(), false, null, null, Boolean.valueOf(z), null, null, null, 118, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(SoundVibrationFragment soundVibrationFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            soundVibrationFragment.getViewModel().setSystemVibration(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(SoundVibrationFragment soundVibrationFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            soundVibrationFragment.getViewModel().setCrownVibration(z);
        }
    }

    private final void p() {
        setViewModel((SoundVibrationViewModel) new ViewModelProvider(requireActivity()).get(SoundVibrationViewModel.class));
        final WatchSettingViewModel watchSettingViewModel = (WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class);
        getViewModel().setSettings(watchSettingViewModel.getWatchSettings());
        getViewModel().initJob(HMDeviceType.MILI);
        getViewModel().getWritingResult().observe(getViewLifecycleOwner(), new Observer() { // from class: e77
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SoundVibrationFragment.q(this.a, (Boolean) obj);
            }
        });
        getViewModel().getSoundAndVibrate().observe(getViewLifecycleOwner(), new Observer() { // from class: g77
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SoundVibrationFragment.r(this.a, watchSettingViewModel, (SoundAndVibrate) obj);
            }
        });
        getViewModel().isShowLoading().observe(getViewLifecycleOwner(), new Observer() { // from class: f77
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SoundVibrationFragment.s(this.a, (Boolean) obj);
            }
        });
        getViewModel().querySettings(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(SoundVibrationFragment soundVibrationFragment, Boolean bool) {
        soundVibrationFragment.j(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(SoundVibrationFragment soundVibrationFragment, WatchSettingViewModel watchSettingViewModel, SoundAndVibrate soundAndVibrate) {
        if (soundAndVibrate == null) {
            return;
        }
        soundVibrationFragment.setSoundAndVibrate(soundAndVibrate);
        watchSettingViewModel.setSoundAndVibrate(soundAndVibrate);
        soundVibrationFragment.refreshView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(SoundVibrationFragment soundVibrationFragment, Boolean bool) {
        LoadingDialogHelper loadingDialogHelper;
        if (!bool.booleanValue() || (loadingDialogHelper = soundVibrationFragment.loadingDialogHelper) == null) {
            return;
        }
        loadingDialogHelper.showLoading(R.string.saving);
    }

    private final void t(boolean isChecked, Integer checkId) {
        RadioGroup radioGroup;
        if (this.soundStrength == null) {
            View view = getView();
            ViewStub viewStub = (ViewStub) (view == null ? null : view.findViewById(R.id.sound_strength_vibration));
            View viewInflate = viewStub == null ? null : viewStub.inflate();
            RadioGroup radioGroup2 = viewInflate != null ? (RadioGroup) viewInflate.findViewById(R.id.sound_strength_radio_group) : null;
            this.soundStrength = radioGroup2;
            if (radioGroup2 != null) {
                radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: d77
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(RadioGroup radioGroup3, int i) {
                        SoundVibrationFragment.v(this.a, radioGroup3, i);
                    }
                });
            }
        }
        RadioGroup radioGroup3 = this.soundStrength;
        if (radioGroup3 != null) {
            radioGroup3.setVisibility(isChecked ? 0 : 8);
        }
        RadioGroup radioGroup4 = this.soundStrength;
        if (radioGroup4 != null) {
            radioGroup4.clearCheck();
        }
        if (checkId != null) {
            int iIntValue = checkId.intValue();
            RadioGroup radioGroup5 = this.soundStrength;
            if (radioGroup5 != null) {
                radioGroup5.check(iIntValue);
            }
        }
        if (checkId != null || (radioGroup = this.soundStrength) == null) {
            return;
        }
        radioGroup.getVisibility();
    }

    public static /* synthetic */ void u(SoundVibrationFragment soundVibrationFragment, boolean z, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSoundStrengthVibration");
        }
        if ((i & 2) != 0) {
            num = null;
        }
        soundVibrationFragment.t(z, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(SoundVibrationFragment soundVibrationFragment, RadioGroup radioGroup, int i) {
        if (i != -1 && ((RadioButton) radioGroup.findViewById(i)).isPressed()) {
            EnumData enumData = new EnumData(i == R.id.sound_strength_standard ? SoundStrength.STANDARD.ordinal() : SoundStrength.STRONG.ordinal());
            soundVibrationFragment.getViewModel().setSoundStrength(enumData);
            SoundVibrationViewModel.updateSoundVibrationCache$default(soundVibrationFragment.getViewModel(), false, null, null, null, enumData, null, null, 110, null);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Nullable
    public final SoundAndVibrate getSoundAndVibrate() {
        return this.soundAndVibrate;
    }

    @NotNull
    public final SoundVibrationViewModel getViewModel() {
        SoundVibrationViewModel soundVibrationViewModel = this.viewModel;
        Objects.requireNonNull(soundVibrationViewModel);
        return soundVibrationViewModel;
    }

    public void initEvents() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.btn_back), 0L, new a(), 1, null);
        View view2 = getView();
        ((ListTile) (view2 == null ? null : view2.findViewById(R.id.device_setting_ringtone_reminder))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: b77
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SoundVibrationFragment.l(this.a, compoundButton, z);
            }
        });
        View view3 = getView();
        ((SeekBar) (view3 == null ? null : view3.findViewById(R.id.device_setting_volume_controller))).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationFragment.initEvents.3
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@Nullable SeekBar seekBar, int progress, boolean fromUser) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@Nullable SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@Nullable SeekBar seekBar) {
                if (seekBar == null) {
                    return;
                }
                SoundVibrationFragment soundVibrationFragment = SoundVibrationFragment.this;
                if (seekBar.isPressed()) {
                    IntData intData = new IntData(seekBar.getProgress());
                    soundVibrationFragment.getViewModel().setVolume(intData);
                    SoundVibrationViewModel.updateSoundVibrationCache$default(soundVibrationFragment.getViewModel(), false, null, intData, null, null, null, null, 122, null);
                }
            }
        });
        View view4 = getView();
        ((ListTile) (view4 == null ? null : view4.findViewById(R.id.device_setting_sound_notification_vibration))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: c77
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SoundVibrationFragment.m(this.a, compoundButton, z);
            }
        });
        View view5 = getView();
        ((ListTile) (view5 == null ? null : view5.findViewById(R.id.device_setting_sound_system_vibration))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: z67
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SoundVibrationFragment.n(this.a, compoundButton, z);
            }
        });
        View view6 = getView();
        ((ListTile) (view6 != null ? view6.findViewById(R.id.device_setting_sound_crown_vibration) : null)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: a77
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SoundVibrationFragment.o(this.a, compoundButton, z);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.loadingDialogHelper = new LoadingDialogHelper(requireActivity());
        initEvents();
        p();
        k();
        initView();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sound_vibration_fragment, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
        if (loadingDialogHelper == null) {
            return;
        }
        loadingDialogHelper.hideLoading();
    }

    public void refreshView() {
        SoundAndVibrate soundAndVibrate = this.soundAndVibrate;
        SoundAndVibrateV1 soundAndVibrateV1 = soundAndVibrate instanceof SoundAndVibrateV1 ? (SoundAndVibrateV1) soundAndVibrate : null;
        if (soundAndVibrateV1 == null) {
            return;
        }
        View view = getView();
        ListTile listTile = (ListTile) (view == null ? null : view.findViewById(R.id.device_setting_ringtone_reminder));
        Boolean remindSwitch = soundAndVibrateV1.getRemindSwitch();
        listTile.setChecked(remindSwitch == null ? false : remindSwitch.booleanValue());
        View view2 = getView();
        SeekBar seekBar = (SeekBar) (view2 == null ? null : view2.findViewById(R.id.device_setting_volume_controller));
        IntData volume = soundAndVibrateV1.getVolume();
        seekBar.setProgress(volume == null ? 0 : volume.getValue());
        View view3 = getView();
        ListTile listTile2 = (ListTile) (view3 == null ? null : view3.findViewById(R.id.device_setting_sound_system_vibration));
        Boolean systemVibrationSwitch = soundAndVibrateV1.getSystemVibrationSwitch();
        listTile2.setChecked(systemVibrationSwitch == null ? false : systemVibrationSwitch.booleanValue());
        View view4 = getView();
        ListTile listTile3 = (ListTile) (view4 == null ? null : view4.findViewById(R.id.device_setting_sound_crown_vibration));
        Boolean crownVibrationSwitch = soundAndVibrateV1.getCrownVibrationSwitch();
        listTile3.setChecked(crownVibrationSwitch == null ? false : crownVibrationSwitch.booleanValue());
        View view5 = getView();
        ((ListTile) (view5 == null ? null : view5.findViewById(R.id.device_setting_sound_notification_vibration))).setChecked(Intrinsics.areEqual(soundAndVibrateV1.getNotificationVibrationSwitch(), Boolean.TRUE));
        View view6 = getView();
        ((ListTile) (view6 == null ? null : view6.findViewById(R.id.device_setting_ringtone_reminder))).setVisibility(soundAndVibrateV1.getRemindSwitch() != null ? 0 : 8);
        View view7 = getView();
        ((ConstraintLayout) (view7 == null ? null : view7.findViewById(R.id.device_setting_volume_viewGroup))).setVisibility(soundAndVibrateV1.getVolume() != null ? 0 : 8);
        View view8 = getView();
        ((ListTile) (view8 == null ? null : view8.findViewById(R.id.device_setting_sound_system_vibration))).setVisibility(soundAndVibrateV1.getSystemVibrationSwitch() != null ? 0 : 8);
        View view9 = getView();
        ((ListTile) (view9 == null ? null : view9.findViewById(R.id.device_setting_sound_crown_vibration))).setVisibility(soundAndVibrateV1.getCrownVibrationSwitch() != null ? 0 : 8);
        View view10 = getView();
        ((ListTile) (view10 != null ? view10.findViewById(R.id.device_setting_sound_notification_vibration) : null)).setVisibility(soundAndVibrateV1.getNotificationVibrationSwitch() == null ? 8 : 0);
    }

    public final void setSoundAndVibrate(@Nullable SoundAndVibrate soundAndVibrate) {
        this.soundAndVibrate = soundAndVibrate;
    }

    public final void setViewModel(@NotNull SoundVibrationViewModel soundVibrationViewModel) {
        this.viewModel = soundVibrationViewModel;
    }
}
