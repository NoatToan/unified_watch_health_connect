package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p010navigation.fragment.FragmentKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.device.setting.ui.dialog.WheelViewDialog;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessV2Fragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestEnableMode;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestScreenDisplayFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u001c\u0010\u0019\u001a\u00020\u00148\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessV2Fragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "initEvent", "", "getScreenOffTime", "()Ljava/lang/Integer;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "settings", "refreshView", "", com.google.android.exoplayer2.text.ttml.b.r, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DisplayBrightnessV2Fragment extends DisplayBrightnessFragment {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final String logTag = "DisplayBrightnessV2Fragment";

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
            FragmentKt.findNavController(DisplayBrightnessV2Fragment.this).popBackStack();
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
            DisplayBrightnessV2Fragment.this.showAutoScreenTimeSelect();
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
            FragmentKt.findNavController(DisplayBrightnessV2Fragment.this).navigate(R.id.action_to_gesScreenFragment);
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
            FragmentKt.findNavController(DisplayBrightnessV2Fragment.this).navigate(R.id.action_to_interestScreenV2Fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(DisplayBrightnessV2Fragment displayBrightnessV2Fragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            displayBrightnessV2Fragment.getViewModel().pushAutoBrightnessToDevice(z);
            DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(displayBrightnessV2Fragment.getViewModel(), false, Boolean.valueOf(z), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(DisplayBrightnessV2Fragment displayBrightnessV2Fragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            displayBrightnessV2Fragment.getViewModel().pushScreenOnByNewNotificationSwitchToDevice(z);
            DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(displayBrightnessV2Fragment.getViewModel(), false, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z), null, null, null, 61438, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(DisplayBrightnessV2Fragment displayBrightnessV2Fragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            displayBrightnessV2Fragment.getViewModel().pushScreenOnDuringSportSwitchToDevice(z);
            DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(displayBrightnessV2Fragment.getViewModel(), false, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z), null, null, 57342, null);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessFragment
    @NotNull
    public String getLogTag() {
        return this.logTag;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessFragment
    @Nullable
    public Integer getScreenOffTime() {
        EnumData screenOffTime;
        DisplayAndBrightness displayAndBrightness = getDisplayAndBrightness();
        DisplayAndBrightnessV2 displayAndBrightnessV2 = displayAndBrightness instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) displayAndBrightness : null;
        if (displayAndBrightnessV2 == null || (screenOffTime = displayAndBrightnessV2.getScreenOffTime()) == null) {
            return null;
        }
        return Integer.valueOf(screenOffTime.getValue());
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessFragment
    public void initEvent() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.btn_back), 0L, new a(), 1, null);
        View view2 = getView();
        ExtKt.smartClick$default(view2 == null ? null : view2.findViewById(R.id.device_setting_auto_screen), 0L, new b(), 1, null);
        View view3 = getView();
        ExtKt.smartClick$default(view3 == null ? null : view3.findViewById(R.id.mili_setting_ges_screen_ll), 0L, new c(), 1, null);
        View view4 = getView();
        ExtKt.smartClick$default(view4 == null ? null : view4.findViewById(R.id.ds_interest_screen_display), 0L, new d(), 1, null);
        View view5 = getView();
        ((ListTile) (view5 == null ? null : view5.findViewById(R.id.device_setting_automatic_brightness))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ya1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                DisplayBrightnessV2Fragment.u(this.a, compoundButton, z);
            }
        });
        View view6 = getView();
        ((SeekBar) (view6 == null ? null : view6.findViewById(R.id.device_setting_light_controller))).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessV2Fragment.initEvent.6

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessV2Fragment$initEvent$6$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ SeekBar a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(SeekBar seekBar) {
                    super(0);
                    this.a = seekBar;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    SeekBar seekBar = this.a;
                    return "isPress: " + (seekBar == null ? null : Boolean.valueOf(seekBar.isPressed())) + ", Stop track touch";
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@Nullable SeekBar seekBar, int progress, boolean fromUser) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@Nullable SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@Nullable SeekBar seekBar) {
                HMLog.info(DisplayBrightnessV2Fragment.this.getLogTag(), new a(seekBar));
                if (seekBar != null && seekBar.isPressed()) {
                    IntData intData = new IntData(seekBar.getProgress(), 0, 100, false, 8, null);
                    DisplayBrightnessV2Fragment.this.getViewModel().pushBrightnessValueToDevice(intData);
                    DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(DisplayBrightnessV2Fragment.this.getViewModel(), false, null, intData, null, null, null, null, null, null, null, null, null, null, null, null, null, 65530, null);
                }
            }
        });
        View view7 = getView();
        ((ListTile) (view7 == null ? null : view7.findViewById(R.id.mili_setting_notify_bright_screen_iv))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: wa1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                DisplayBrightnessV2Fragment.v(this.a, compoundButton, z);
            }
        });
        View view8 = getView();
        ((ListTile) (view8 != null ? view8.findViewById(R.id.mili_setting_notify_bright_when_sport_iv) : null)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xa1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                DisplayBrightnessV2Fragment.w(this.a, compoundButton, z);
            }
        });
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.display_brightness_v2_fragment, container, false);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (GlobalConfig.get().isBuildMidong()) {
            return;
        }
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.display_brightness_title))).setText(R.string.smart_card_setting);
        View view3 = getView();
        ((ListTile) (view3 != null ? view3.findViewById(R.id.device_setting_auto_screen) : null)).setTitle(R.string.watch_setting_bright_screen_time);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessFragment
    public void refreshView(@NotNull DisplayAndBrightness settings) {
        if (settings instanceof DisplayAndBrightnessV2) {
            View view = getView();
            ListTile listTile = (ListTile) (view == null ? null : view.findViewById(R.id.device_setting_automatic_brightness));
            DisplayAndBrightnessV2 displayAndBrightnessV2 = (DisplayAndBrightnessV2) settings;
            Boolean autoBrightness = displayAndBrightnessV2.getAutoBrightness();
            listTile.setChecked(autoBrightness == null ? false : autoBrightness.booleanValue());
            WheelViewDialog wheelViewDialog = getWheelViewDialog();
            if (wheelViewDialog != null) {
                EnumData screenOffTime = displayAndBrightnessV2.getScreenOffTime();
                wheelViewDialog.setCurrentItem(screenOffTime == null ? null : Integer.valueOf(screenOffTime.getValue()));
            }
            View view2 = getView();
            SeekBar seekBar = (SeekBar) (view2 == null ? null : view2.findViewById(R.id.device_setting_light_controller));
            IntData brightness = displayAndBrightnessV2.getBrightness();
            seekBar.setProgress(brightness == null ? 0 : brightness.getValue());
            newFeatureGesScreenLight(settings);
            EnumData screenOffTime2 = displayAndBrightnessV2.getScreenOffTime();
            if (screenOffTime2 != null) {
                int value = screenOffTime2.getValue();
                View view3 = getView();
                ((ListTile) (view3 == null ? null : view3.findViewById(R.id.device_setting_auto_screen))).setTips(getResources().getQuantityString(R.plurals.ds_Auto_screen_time, value, Integer.valueOf(value)));
            }
            InterestEnableMode.Companion companion = InterestEnableMode.INSTANCE;
            EnumData screenOffDisplayMode = displayAndBrightnessV2.getScreenOffDisplayMode();
            InterestEnableMode interestEnableMode = companion.parseInterestEnableMode(screenOffDisplayMode == null ? 0 : screenOffDisplayMode.getValue());
            View view4 = getView();
            ((ListTile) (view4 == null ? null : view4.findViewById(R.id.ds_interest_screen_display))).setTips(InterestScreenDisplayFragment.INSTANCE.getEnableModeString(interestEnableMode, requireContext()));
            View view5 = getView();
            ((ListTile) (view5 == null ? null : view5.findViewById(R.id.device_setting_automatic_brightness))).setVisibility(displayAndBrightnessV2.getAutoBrightness() != null ? 0 : 8);
            View view6 = getView();
            ((ConstraintLayout) (view6 == null ? null : view6.findViewById(R.id.d_setting_brightness_ViewGroup))).setVisibility(displayAndBrightnessV2.getBrightness() != null ? 0 : 8);
            View view7 = getView();
            ((ListTile) (view7 == null ? null : view7.findViewById(R.id.device_setting_auto_screen))).setVisibility(displayAndBrightnessV2.getScreenOffTime() != null ? 0 : 8);
            View view8 = getView();
            ((ListTile) (view8 == null ? null : view8.findViewById(R.id.ds_interest_screen_display))).setVisibility(displayAndBrightnessV2.getScreenOffDisplayMode() != null ? 0 : 8);
            View view9 = getView();
            ((ListTile) (view9 == null ? null : view9.findViewById(R.id.mili_setting_ges_screen_ll))).setVisibility(displayAndBrightnessV2.getScreenOnByTurningWristMode() != null ? 0 : 8);
            Boolean screenOnByNewNotificationSwitch = displayAndBrightnessV2.getScreenOnByNewNotificationSwitch();
            if (screenOnByNewNotificationSwitch == null) {
                View view10 = getView();
                ((ListTile) (view10 == null ? null : view10.findViewById(R.id.mili_setting_notify_bright_screen_iv))).setVisibility(8);
            } else {
                View view11 = getView();
                ((ListTile) (view11 == null ? null : view11.findViewById(R.id.mili_setting_notify_bright_screen_iv))).setVisibility(0);
                View view12 = getView();
                ((ListTile) (view12 == null ? null : view12.findViewById(R.id.mili_setting_notify_bright_screen_iv))).setChecked(screenOnByNewNotificationSwitch.booleanValue());
            }
            Boolean screenOnDuringSportSwitch = displayAndBrightnessV2.getScreenOnDuringSportSwitch();
            if (screenOnDuringSportSwitch == null) {
                View view13 = getView();
                ((ListTile) (view13 != null ? view13.findViewById(R.id.mili_setting_notify_bright_when_sport_iv) : null)).setVisibility(8);
            } else {
                View view14 = getView();
                ((ListTile) (view14 == null ? null : view14.findViewById(R.id.mili_setting_notify_bright_when_sport_iv))).setVisibility(0);
                View view15 = getView();
                ((ListTile) (view15 != null ? view15.findViewById(R.id.mili_setting_notify_bright_when_sport_iv) : null)).setChecked(screenOnDuringSportSwitch.booleanValue());
            }
        }
    }
}
