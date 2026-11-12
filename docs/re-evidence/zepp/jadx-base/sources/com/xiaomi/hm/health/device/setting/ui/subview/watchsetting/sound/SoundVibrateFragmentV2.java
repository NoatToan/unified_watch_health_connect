package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import androidx.core.view.ViewGroupKt;
import androidx.p010navigation.fragment.FragmentKt;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.SoundAndVibrate;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.enums.BuzzerVibrateStrength;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v2.SoundAndVibrateV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.lib.rainbow.ListTile;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrateFragmentV2;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/SoundVibrateFragmentV2;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/SoundVibrationFragment;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "", "O", "Lcom/huami/lib/rainbow/ListTile;", "vibrateMode", "vibrateFeedbackSwitch", "N", "", "R", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "initEvents", "refreshView", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "f", "Lkotlin/Lazy;", "F", "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "", "", "g", "[Ljava/lang/String;", "buzzerStrengthStrs", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SoundVibrateFragmentV2 extends SoundVibrationFragment implements KoinComponentAdapter {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceCenter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String[] buzzerStrengthStrs;

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
            FragmentKt.findNavController(SoundVibrateFragmentV2.this).navigate(R.id.action_to_buzzer_scenes_fragment);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            SoundVibrateFragmentV2.this.O();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(SoundVibrateFragmentV2.this).popBackStack();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<View, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(SoundVibrateFragmentV2.this).navigate(R.id.action_to_vibrateTypeActivity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SoundVibrateFragmentV2() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceCenter = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceCenter>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrateFragmentV2$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.DeviceCenter, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceCenter getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), qualifier, objArr);
            }
        });
    }

    private final DeviceCenter F() {
        return (DeviceCenter) this.deviceCenter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(SoundVibrateFragmentV2 soundVibrateFragmentV2, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            soundVibrateFragmentV2.getViewModel().setRemindState(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(SoundVibrateFragmentV2 soundVibrateFragmentV2, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            soundVibrateFragmentV2.getViewModel().setNotificationVibrationState(z);
            SoundVibrationViewModel.updateSoundVibrationCache$default(soundVibrateFragmentV2.getViewModel(), false, null, null, Boolean.valueOf(z), null, null, null, 118, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(SoundVibrateFragmentV2 soundVibrateFragmentV2, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            soundVibrateFragmentV2.getViewModel().setSystemVibration(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(SoundVibrateFragmentV2 soundVibrateFragmentV2, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            soundVibrateFragmentV2.getViewModel().setCrownVibration(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(SoundVibrateFragmentV2 soundVibrateFragmentV2, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            soundVibrateFragmentV2.getViewModel().setCoverScreenMutingSwitch(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(SoundVibrateFragmentV2 soundVibrateFragmentV2, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            soundVibrateFragmentV2.getViewModel().setVibrationFeedbackSwitch(z);
            View view = soundVibrateFragmentV2.getView();
            ListTile listTile = (ListTile) (view == null ? null : view.findViewById(R.id.custom_vibrate_mode_iv));
            View view2 = soundVibrateFragmentV2.getView();
            soundVibrateFragmentV2.N(listTile, (ListTile) (view2 != null ? view2.findViewById(R.id.device_setting_sound_vibration_feedback_switch) : null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(SoundVibrateFragmentV2 soundVibrateFragmentV2, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            soundVibrateFragmentV2.getViewModel().setVoiceBroadcast(z);
        }
    }

    private final void N(ListTile vibrateMode, ListTile vibrateFeedbackSwitch) {
        if (vibrateFeedbackSwitch.getVisibility() == 0) {
            vibrateMode.setEnabled(vibrateFeedbackSwitch.isChecked());
        } else {
            vibrateMode.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        SoundAndVibrate soundAndVibrate = getSoundAndVibrate();
        BuzzerVibrateStrength buzzerVibrateStrength = null;
        SoundAndVibrateV2 soundAndVibrateV2 = soundAndVibrate instanceof SoundAndVibrateV2 ? (SoundAndVibrateV2) soundAndVibrate : null;
        if (soundAndVibrateV2 == null) {
            return;
        }
        EnumData buzzerVibrateStrength2 = soundAndVibrateV2.getBuzzerVibrateStrength();
        Integer numValueOf = buzzerVibrateStrength2 == null ? null : Integer.valueOf(buzzerVibrateStrength2.getValue());
        if (numValueOf == null) {
            return;
        }
        int iIntValue = numValueOf.intValue();
        f fVar = new PropertyReference1Impl() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrateFragmentV2.f
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Integer.valueOf(((BuzzerVibrateStrength) obj).getValue());
            }
        };
        Integer numValueOf2 = Integer.valueOf(iIntValue);
        for (BuzzerVibrateStrength buzzerVibrateStrength3 : BuzzerVibrateStrength.values()) {
            if (Intrinsics.areEqual(fVar.invoke(buzzerVibrateStrength3), numValueOf2)) {
                buzzerVibrateStrength = buzzerVibrateStrength3;
                break;
            }
        }
        if (buzzerVibrateStrength == null) {
            return;
        }
        int iOrdinal = buzzerVibrateStrength.ordinal();
        AlertDialogFragment.ChoiceItems choiceItems = new AlertDialogFragment.ChoiceItems();
        String[] strArr = this.buzzerStrengthStrs;
        Objects.requireNonNull(strArr);
        new AlertDialogFragment.Builder(requireContext()).setTitle(R.string.ds_sound_buzzer_vibrate_strength).setSingleChoiceItemsNew(choiceItems.setItems(strArr).setItemChoice(iOrdinal), new DialogInterface.OnClickListener() { // from class: q67
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SoundVibrateFragmentV2.P(this.a, dialogInterface, i);
            }
        }).setNeutralButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: r67
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SoundVibrateFragmentV2.Q(dialogInterface, i);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(SoundVibrateFragmentV2 soundVibrateFragmentV2, DialogInterface dialogInterface, int i) {
        soundVibrateFragmentV2.getViewModel().setBuzzerVibrateStrength(BuzzerVibrateStrength.values()[i]);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    private final boolean R() {
        View view = getView();
        Iterator<View> it2 = ViewGroupKt.getChildren((ViewGroup) (view == null ? null : view.findViewById(R.id.voice_setting_layout))).iterator();
        if (it2 == null) {
            return false;
        }
        while (it2.hasNext()) {
            if (it2.next().getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationFragment
    public void initEvents() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.btn_back), 0L, new c(), 1, null);
        View view2 = getView();
        ((ListTile) (view2 == null ? null : view2.findViewById(R.id.device_setting_ringtone_reminder))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: u67
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SoundVibrateFragmentV2.G(this.a, compoundButton, z);
            }
        });
        View view3 = getView();
        ((SeekBar) (view3 == null ? null : view3.findViewById(R.id.device_setting_volume_controller))).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrateFragmentV2.initEvents.3
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@Nullable SeekBar seekBar, int progress, boolean fromUser) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@Nullable SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@Nullable SeekBar seekBar) {
                if (seekBar != null && seekBar.isPressed()) {
                    IntData intData = new IntData(seekBar.getProgress());
                    SoundVibrateFragmentV2 soundVibrateFragmentV2 = SoundVibrateFragmentV2.this;
                    soundVibrateFragmentV2.getViewModel().setVolume(intData);
                    SoundVibrationViewModel.updateSoundVibrationCache$default(soundVibrateFragmentV2.getViewModel(), false, null, intData, null, null, null, null, 122, null);
                }
            }
        });
        View view4 = getView();
        ((ListTile) (view4 == null ? null : view4.findViewById(R.id.device_setting_sound_notification_vibration))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: x67
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SoundVibrateFragmentV2.H(this.a, compoundButton, z);
            }
        });
        View view5 = getView();
        ((ListTile) (view5 == null ? null : view5.findViewById(R.id.device_setting_sound_system_vibration))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: y67
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SoundVibrateFragmentV2.I(this.a, compoundButton, z);
            }
        });
        View view6 = getView();
        ((ListTile) (view6 == null ? null : view6.findViewById(R.id.device_setting_sound_crown_vibration))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: v67
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SoundVibrateFragmentV2.J(this.a, compoundButton, z);
            }
        });
        View view7 = getView();
        ((ListTile) (view7 == null ? null : view7.findViewById(R.id.device_setting_sound_cover_screen_muting_switch))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: s67
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SoundVibrateFragmentV2.K(this.a, compoundButton, z);
            }
        });
        View view8 = getView();
        ((ListTile) (view8 == null ? null : view8.findViewById(R.id.device_setting_sound_vibration_feedback_switch))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: t67
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SoundVibrateFragmentV2.L(this.a, compoundButton, z);
            }
        });
        View view9 = getView();
        ExtKt.smartClick$default(view9 == null ? null : view9.findViewById(R.id.custom_vibrate_mode_iv), 0L, new d(), 1, null);
        View view10 = getView();
        ExtKt.smartClick$default(view10 == null ? null : view10.findViewById(R.id.buzzer_scenes_item), 0L, new a(), 1, null);
        View view11 = getView();
        ExtKt.smartClick$default(view11 == null ? null : view11.findViewById(R.id.buzzer_vibrate_strength_item), 0L, new b(), 1, null);
        View view12 = getView();
        ((ListTile) (view12 != null ? view12.findViewById(R.id.voice_broadcast_switch) : null)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: w67
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SoundVibrateFragmentV2.M(this.a, compoundButton, z);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.buzzerStrengthStrs = getResources().getStringArray(R.array.buzzer_vibrate_strength_arrays);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sound_vibration_fragment_v2, container, false);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationFragment
    public void refreshView() {
        BuzzerVibrateStrength buzzerVibrateStrength;
        SoundAndVibrate soundAndVibrate = getSoundAndVibrate();
        SoundAndVibrateV2 soundAndVibrateV2 = soundAndVibrate instanceof SoundAndVibrateV2 ? (SoundAndVibrateV2) soundAndVibrate : null;
        if (soundAndVibrateV2 == null) {
            return;
        }
        View view = getView();
        View viewFindViewById = view == null ? null : view.findViewById(R.id.device_setting_ringtone_reminder);
        Boolean remindSwitch = soundAndVibrateV2.getRemindSwitch();
        Boolean bool = Boolean.TRUE;
        ((ListTile) viewFindViewById).setChecked(Intrinsics.areEqual(remindSwitch, bool));
        View view2 = getView();
        SeekBar seekBar = (SeekBar) (view2 == null ? null : view2.findViewById(R.id.device_setting_volume_controller));
        IntData volume = soundAndVibrateV2.getVolume();
        seekBar.setProgress(volume == null ? 0 : volume.getValue());
        View view3 = getView();
        ((ListTile) (view3 == null ? null : view3.findViewById(R.id.device_setting_sound_system_vibration))).setChecked(Intrinsics.areEqual(soundAndVibrateV2.getSystemVibrationSwitch(), bool));
        View view4 = getView();
        ((ListTile) (view4 == null ? null : view4.findViewById(R.id.device_setting_sound_crown_vibration))).setChecked(Intrinsics.areEqual(soundAndVibrateV2.getCrownVibrationSwitch(), bool));
        View view5 = getView();
        ((ListTile) (view5 == null ? null : view5.findViewById(R.id.device_setting_sound_notification_vibration))).setChecked(Intrinsics.areEqual(soundAndVibrateV2.getNotificationVibrationSwitch(), bool));
        View view6 = getView();
        ((ListTile) (view6 == null ? null : view6.findViewById(R.id.device_setting_sound_cover_screen_muting_switch))).setChecked(Intrinsics.areEqual(soundAndVibrateV2.getCoverScreenMutingSwitch(), bool));
        View view7 = getView();
        ((ListTile) (view7 == null ? null : view7.findViewById(R.id.device_setting_sound_vibration_feedback_switch))).setChecked(Intrinsics.areEqual(soundAndVibrateV2.getVibrationFeedbackSwitch(), bool));
        View view8 = getView();
        ListTile listTile = (ListTile) (view8 == null ? null : view8.findViewById(R.id.custom_vibrate_mode_iv));
        View view9 = getView();
        N(listTile, (ListTile) (view9 == null ? null : view9.findViewById(R.id.device_setting_sound_vibration_feedback_switch)));
        View view10 = getView();
        ((ListTile) (view10 == null ? null : view10.findViewById(R.id.voice_broadcast_switch))).setChecked(Intrinsics.areEqual(soundAndVibrateV2.getSportVoiceReportSwitch(), bool));
        HMDeviceSource deviceSource = F().getDeviceSource();
        boolean z = true;
        boolean zContains = CollectionsKt__CollectionsKt.arrayListOf(HMDeviceSource.MILI_ZURICH, HMDeviceSource.MILI_ZURICH_W, HMDeviceSource.MILI_VERONA, HMDeviceSource.MILI_VERONA_W).contains(deviceSource);
        boolean zContains2 = CollectionsKt__CollectionsKt.arrayListOf(HMDeviceSource.MILI_MADRID, HMDeviceSource.MILI_MADRID_W, HMDeviceSource.MILI_MADRID_HML).contains(deviceSource);
        View view11 = getView();
        ExtKt.setVisible$default(view11 == null ? null : view11.findViewById(R.id.device_setting_ringtone_reminder), (soundAndVibrateV2.getRemindSwitch() == null || zContains) ? false : true, false, 2, null);
        View view12 = getView();
        ExtKt.setVisible$default(view12 == null ? null : view12.findViewById(R.id.device_setting_volume_viewGroup), (soundAndVibrateV2.getVolume() == null || zContains) ? false : true, false, 2, null);
        View view13 = getView();
        ExtKt.setVisible$default(view13 == null ? null : view13.findViewById(R.id.device_setting_sound_system_vibration), soundAndVibrateV2.getSystemVibrationSwitch() != null, false, 2, null);
        View view14 = getView();
        ExtKt.setVisible$default(view14 == null ? null : view14.findViewById(R.id.device_setting_sound_crown_vibration), soundAndVibrateV2.getCrownVibrationSwitch() != null, false, 2, null);
        View view15 = getView();
        ExtKt.setVisible$default(view15 == null ? null : view15.findViewById(R.id.device_setting_sound_notification_vibration), soundAndVibrateV2.getNotificationVibrationSwitch() != null, false, 2, null);
        View view16 = getView();
        ExtKt.setVisible$default(view16 == null ? null : view16.findViewById(R.id.device_setting_sound_cover_screen_muting_switch), (soundAndVibrateV2.getCoverScreenMutingSwitch() == null || zContains) ? false : true, false, 2, null);
        View view17 = getView();
        ExtKt.setVisible$default(view17 == null ? null : view17.findViewById(R.id.device_setting_sound_vibration_feedback_switch), soundAndVibrateV2.getVibrationFeedbackSwitch() != null, false, 2, null);
        View view18 = getView();
        ExtKt.setVisible$default(view18 == null ? null : view18.findViewById(R.id.voice_broadcast_switch), (soundAndVibrateV2.getSportVoiceReportSwitch() == null || zContains2) ? false : true, false, 2, null);
        boolean zR = R();
        View view19 = getView();
        ExtKt.setVisible$default(view19 == null ? null : view19.findViewById(R.id.voice_setting_layout), zR, false, 2, null);
        View view20 = getView();
        ExtKt.setVisible$default(view20 == null ? null : view20.findViewById(R.id.buzzer_scenes_item), soundAndVibrateV2.getBuzzerScenes() != null, false, 2, null);
        View view21 = getView();
        ExtKt.setVisible$default(view21 == null ? null : view21.findViewById(R.id.buzzer_vibrate_strength_item), soundAndVibrateV2.getBuzzerVibrateStrength() != null, false, 2, null);
        EnumData buzzerVibrateStrength2 = soundAndVibrateV2.getBuzzerVibrateStrength();
        if (buzzerVibrateStrength2 != null) {
            e eVar = new PropertyReference1Impl() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrateFragmentV2.e
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                @Nullable
                public Object get(@Nullable Object obj) {
                    return Integer.valueOf(((BuzzerVibrateStrength) obj).getValue());
                }
            };
            Integer numValueOf = Integer.valueOf(buzzerVibrateStrength2.getValue());
            BuzzerVibrateStrength[] buzzerVibrateStrengthArrValues = BuzzerVibrateStrength.values();
            int length = buzzerVibrateStrengthArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    buzzerVibrateStrength = null;
                    break;
                }
                buzzerVibrateStrength = buzzerVibrateStrengthArrValues[i];
                if (Intrinsics.areEqual(eVar.invoke(buzzerVibrateStrength), numValueOf)) {
                    break;
                } else {
                    i++;
                }
            }
            if (buzzerVibrateStrength != null) {
                View view22 = getView();
                View viewFindViewById2 = view22 == null ? null : view22.findViewById(R.id.buzzer_vibrate_strength_item);
                String[] strArr = this.buzzerStrengthStrs;
                Objects.requireNonNull(strArr);
                ((ListTile) viewFindViewById2).setTips(strArr[buzzerVibrateStrength.ordinal()]);
            }
        }
        View view23 = getView();
        View viewFindViewById3 = view23 == null ? null : view23.findViewById(R.id.buzzer_layout);
        if (soundAndVibrateV2.getBuzzerVibrateStrength() == null && soundAndVibrateV2.getBuzzerScenes() == null) {
            z = false;
        }
        ExtKt.setVisible$default(viewFindViewById3, z, false, 2, null);
    }
}
