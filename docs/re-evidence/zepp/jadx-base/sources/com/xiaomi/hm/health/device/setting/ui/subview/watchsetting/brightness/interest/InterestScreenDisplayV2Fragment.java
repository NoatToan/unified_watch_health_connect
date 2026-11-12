package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.OnLifecycleEvent;
import androidx.p010navigation.fragment.FragmentKt;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestScreenDisplayV2Fragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestScreenDisplayFragment;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "displayAndBrightness", "", "refreshView", "initEvents", "initLifecycles", "<init>", "()V", "Companion", "LifecycleComponent", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class InterestScreenDisplayV2Fragment extends InterestScreenDisplayFragment {

    @NotNull
    private static final String m = "InterestScreenDisplayV2Fragment";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestScreenDisplayV2Fragment$LifecycleComponent;", "Landroidx/lifecycle/LifecycleObserver;", "", "onStart", "<init>", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestScreenDisplayV2Fragment;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class LifecycleComponent implements LifecycleObserver {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onStart";
            }
        }

        public LifecycleComponent() {
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public final void onStart() {
            HMLog.info(InterestScreenDisplayV2Fragment.m, a.a);
            InterestScreenDisplayFragment.refreshView$default(InterestScreenDisplayV2Fragment.this, null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InterestEnableMode.values().length];
            iArr[InterestEnableMode.ALL_DAY.ordinal()] = 1;
            iArr[InterestEnableMode.ENABLE_SMART_ON.ordinal()] = 2;
            iArr[InterestEnableMode.OFF.ordinal()] = 3;
            iArr[InterestEnableMode.ENABLE_SCHEDULE.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
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
            DisplayAndBrightness displayAndBrightness = InterestScreenDisplayV2Fragment.this.getDisplayAndBrightness();
            DisplayAndBrightnessV2 displayAndBrightnessV2 = displayAndBrightness instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) displayAndBrightness : null;
            if (displayAndBrightnessV2 == null) {
                return;
            }
            InterestScreenDisplayV2Fragment interestScreenDisplayV2Fragment = InterestScreenDisplayV2Fragment.this;
            List<Pair<Integer, Integer>> startEndTime = interestScreenDisplayV2Fragment.getStartEndTime(displayAndBrightnessV2.getScreenOffDisplayEndTime(), displayAndBrightnessV2.getScreenOffDisplayBeginTime());
            interestScreenDisplayV2Fragment.showTimeChooseUI(true, startEndTime.get(0).getFirst().intValue(), startEndTime.get(0).getSecond().intValue());
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
            DisplayAndBrightness displayAndBrightness = InterestScreenDisplayV2Fragment.this.getDisplayAndBrightness();
            DisplayAndBrightnessV2 displayAndBrightnessV2 = displayAndBrightness instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) displayAndBrightness : null;
            if (displayAndBrightnessV2 == null) {
                return;
            }
            InterestScreenDisplayV2Fragment interestScreenDisplayV2Fragment = InterestScreenDisplayV2Fragment.this;
            List<Pair<Integer, Integer>> startEndTime = interestScreenDisplayV2Fragment.getStartEndTime(displayAndBrightnessV2.getScreenOffDisplayEndTime(), displayAndBrightnessV2.getScreenOffDisplayBeginTime());
            interestScreenDisplayV2Fragment.showTimeChooseUI(false, startEndTime.get(1).getFirst().intValue(), startEndTime.get(1).getSecond().intValue());
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
            FragmentKt.findNavController(InterestScreenDisplayV2Fragment.this).navigate(R.id.action_to_interest_dial_type_fragment);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "refreshView dto null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InterestScreenDisplayV2Fragment.this.showDescriptionConfirmDialog();
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestScreenDisplayFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestScreenDisplayFragment
    public void initEvents() {
        super.initEvents();
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.schedule_start_layout), 0L, new a(), 1, null);
        View view2 = getView();
        ExtKt.smartClick$default(view2 == null ? null : view2.findViewById(R.id.schedule_stop_layout), 0L, new b(), 1, null);
        View view3 = getView();
        ExtKt.smartClick$default(view3 != null ? view3.findViewById(R.id.interest_dial) : null, 0L, new c(), 1, null);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestScreenDisplayFragment
    public void initLifecycles() {
        super.initLifecycles();
        getViewModel().getDialStyleDescLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestScreenDisplayV2Fragment$initLifecycles$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                String str = (String) t;
                View view = this.a.getView();
                ((ListTile) (view == null ? null : view.findViewById(R.id.interest_dial))).setTips(str);
            }
        });
        getViewLifecycleOwner().getLifecycle().addObserver(new LifecycleComponent());
        getViewModel().loadDialStyleDesc();
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestScreenDisplayFragment
    public void refreshView(@Nullable DisplayAndBrightness displayAndBrightness) {
        DisplayAndBrightnessV2 displayAndBrightnessV2 = displayAndBrightness instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) displayAndBrightness : null;
        if (displayAndBrightnessV2 == null) {
            DisplayAndBrightness value = getViewModel().getDisplayBrightnessSetting().getValue();
            displayAndBrightnessV2 = value instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) value : null;
        }
        if (displayAndBrightnessV2 == null) {
            HMLog.info(m, d.a);
            return;
        }
        if (displayAndBrightnessV2.getScreenOffFollowCurrentDialSwitch() == null) {
            View view = getView();
            ((ListTile) (view == null ? null : view.findViewById(R.id.interest_dial))).setVisibility(8);
        } else {
            View view2 = getView();
            ((ListTile) (view2 == null ? null : view2.findViewById(R.id.interest_dial))).setVisibility(0);
        }
        List<Pair<Integer, Integer>> startEndTime = getStartEndTime(displayAndBrightnessV2.getScreenOffDisplayEndTime(), displayAndBrightnessV2.getScreenOffDisplayBeginTime());
        getStart().set((startEndTime.get(0).getFirst().intValue() * 60) + startEndTime.get(0).getSecond().intValue());
        getCom.huami.watch.companion.mediac.Command.STOP java.lang.String().set((startEndTime.get(1).getFirst().intValue() * 60) + startEndTime.get(1).getSecond().intValue());
        Pair<String, String> onOffTime = getOnOffTime(startEndTime.get(0).getFirst().intValue(), startEndTime.get(0).getSecond().intValue(), startEndTime.get(1).getFirst().intValue(), startEndTime.get(1).getSecond().intValue());
        View view3 = getView();
        ((ListTile) (view3 == null ? null : view3.findViewById(R.id.schedule_start_layout))).setTips(onOffTime.getFirst());
        View view4 = getView();
        ((ListTile) (view4 == null ? null : view4.findViewById(R.id.schedule_stop_layout))).setTips(onOffTime.getSecond());
        InterestEnableMode.Companion companion = InterestEnableMode.INSTANCE;
        EnumData screenOffDisplayMode = displayAndBrightnessV2.getScreenOffDisplayMode();
        setCurrentEnableMode(companion.parseInterestEnableMode(screenOffDisplayMode == null ? 0 : screenOffDisplayMode.getValue()));
        InterestEnableMode currentEnableMode = getCurrentEnableMode();
        if (currentEnableMode == null) {
            return;
        }
        View view5 = getView();
        ((ListTile) (view5 == null ? null : view5.findViewById(R.id.interest_enable))).setTips(getEnableModeString(currentEnableMode));
        View view6 = getView();
        ((ListTile) (view6 == null ? null : view6.findViewById(R.id.interest_enable))).setTitle(getInterestEnableSpan(R.string.ds_interest_screen_display_enabled, new e()));
        View view7 = getView();
        TextView textView = (TextView) ((ListTile) (view7 != null ? view7.findViewById(R.id.interest_enable) : null)).findViewById(R.id.rainbow_tile_title);
        if (textView != null) {
            textView.setHighlightColor(0);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        int i = WhenMappings.$EnumSwitchMapping$0[currentEnableMode.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            offOnEnable(false);
        } else {
            if (i != 4) {
                return;
            }
            offOnEnable(true);
        }
    }
}
