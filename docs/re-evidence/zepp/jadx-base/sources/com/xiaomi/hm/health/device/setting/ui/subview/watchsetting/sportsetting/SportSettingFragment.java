package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.HMTimeChooseView;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingHelper;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.SportSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.SportSettingFragment.d;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.SportSettingFragment.e;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsMode;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0007H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001c\u0010\u0014\u001a\u00020\u000f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u00020\u00158\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/SportSettingFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/BaseWatchSettingFragment;", "", "initView", "initViewModel", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "time", "Lkotlin/Function1;", "action", "h", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getContainerId", "()I", "containerId", "", "e", "Ljava/lang/String;", "getTitleRes", "()Ljava/lang/String;", "titleRes", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/SportSettingViewModel;", "f", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/SportSettingViewModel;", "viewModel", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SportSettingFragment extends BaseWatchSettingFragment {

    @NotNull
    private static final String g = "SportSettingFragment";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String titleRes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private SportSettingViewModel viewModel;

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
            FragmentKt.findNavController(SportSettingFragment.this).navigateUp();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onCheckedChange: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "time", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Time, Unit> {
            public final /* synthetic */ SportSettingFragment a;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.SportSettingFragment$c$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0861a extends Lambda implements Function0<String> {
                public final /* synthetic */ Time a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0861a(Time time) {
                    super(0);
                    this.a = time;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "aGps time: " + this.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportSettingFragment sportSettingFragment) {
                super(1);
                this.a = sportSettingFragment;
            }

            public final void a(@NotNull Time time) {
                HMLog.info(SportSettingFragment.g, new C0861a(time));
                SportSettingViewModel sportSettingViewModel = this.a.viewModel;
                Objects.requireNonNull(sportSettingViewModel);
                SportSettingViewModel.setAGpsOutOfDateAlert$default(sportSettingViewModel, null, time, 1, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Time time) {
                a(time);
                return Unit.INSTANCE;
            }
        }

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
            SportSettingFragment sportSettingFragment = SportSettingFragment.this;
            SportSettingViewModel sportSettingViewModel = sportSettingFragment.viewModel;
            Objects.requireNonNull(sportSettingViewModel);
            AGpsOutOfDateVo value = sportSettingViewModel.getAGpsOutOfDateLiveData().getValue();
            sportSettingFragment.h(value == null ? null : value.getTime(), new a(SportSettingFragment.this));
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
            FragmentKt.findNavController(SportSettingFragment.this).navigate(R.id.action_to_sportRecognizeFragment);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<View, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(SportSettingFragment.this).navigate(R.id.action_to_gpsSettingFragment);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "showTimeChooseUI time null";
        }
    }

    public SportSettingFragment() {
        super(R.layout.fragment_sport_setting);
        this.containerId = R.id.container;
        this.titleRes = IntroduceShuffleFactoryKt.getString(R.string.ds_sport);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SportSettingFragment sportSettingFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            HMLog.info(g, new b(z));
            SportSettingViewModel sportSettingViewModel = sportSettingFragment.viewModel;
            Objects.requireNonNull(sportSettingViewModel);
            SportSettingViewModel.setAGpsOutOfDateAlert$default(sportSettingViewModel, Boolean.valueOf(z), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(final Time time, final Function1<? super Time, Unit> action) {
        if (time == null) {
            HMLog.error$default(g, null, null, f.a, 6, null);
            return;
        }
        final Time time2 = new Time(0, 0);
        AlertDialogFragment.Builder title = new AlertDialogFragment.Builder(requireActivity()).setTitle(R.string.avoid_disturb_on_time);
        HMTimeChooseView hMTimeChooseView = new HMTimeChooseView(requireActivity());
        hMTimeChooseView.setInitialTime(time.getHour(), time.getMinute());
        hMTimeChooseView.setOnTimeChooseListener(new HMTimeChooseView.ITimeChooseListener() { // from class: dc7
            @Override // com.huami.widget.wheelview.HMTimeChooseView.ITimeChooseListener
            public final void onTimeChoose(int i, int i2) {
                SportSettingFragment.i(time2, i, i2);
            }
        });
        Unit unit = Unit.INSTANCE;
        title.setContentView(hMTimeChooseView).setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: bc7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SportSettingFragment.j(time2, time, action, dialogInterface, i);
            }
        }).setNegativeButton(getString(R.string.cancel), (DialogInterface.OnClickListener) null).setCancelable(true).show(requireActivity().getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Time time, int i, int i2) {
        time.setHour(i);
        time.setMinute(i2);
    }

    private final void initView() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.btn_back), 0L, new a(), 1, null);
        View view2 = getView();
        ((ListTile) (view2 == null ? null : view2.findViewById(R.id.remind_switch_lt))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cc7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SportSettingFragment.g(this.a, compoundButton, z);
            }
        });
        View view3 = getView();
        ExtKt.smartClick$default(view3 != null ? view3.findViewById(R.id.remind_time_lt) : null, 0L, new c(), 1, null);
    }

    private final void initViewModel() {
        SportSettingViewModel sportSettingViewModel = (SportSettingViewModel) new ViewModelProvider(requireActivity()).get(SportSettingViewModel.class);
        this.viewModel = sportSettingViewModel;
        Objects.requireNonNull(sportSettingViewModel);
        sportSettingViewModel.getLoadingLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.SportSettingFragment$initViewModel$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                LoadingHelper.responseToLoadingStatus$default(this.a.getLoadingHelper(), this.a.getActivity(), (LoadingVo) t, null, null, 12, null);
            }
        });
        SportSettingViewModel sportSettingViewModel2 = this.viewModel;
        Objects.requireNonNull(sportSettingViewModel2);
        sportSettingViewModel2.getSportRecognizeVisibleLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.SportSettingFragment$initViewModel$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Boolean bool = (Boolean) t;
                View view = this.a.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.sport_recognize_container), bool.booleanValue(), false, 2, null);
                if (bool.booleanValue()) {
                    View view2 = this.a.getView();
                    ExtKt.smartClick$default(view2 != null ? view2.findViewById(R.id.sport_recognize_container) : null, 0L, this.a.new d(), 1, null);
                }
            }
        });
        SportSettingViewModel sportSettingViewModel3 = this.viewModel;
        Objects.requireNonNull(sportSettingViewModel3);
        sportSettingViewModel3.getGpsSettingVisibleLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.SportSettingFragment$initViewModel$$inlined$observe$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                String strFullDesc;
                Boolean bool = (Boolean) t;
                View view = this.a.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.gps_setting_container), bool.booleanValue(), false, 2, null);
                View view2 = this.a.getView();
                TextView textView = (TextView) (view2 == null ? null : view2.findViewById(R.id.curr_gps_mode_tv));
                SportSettingViewModel sportSettingViewModel4 = this.a.viewModel;
                Objects.requireNonNull(sportSettingViewModel4);
                GpsMode currGpsMode = sportSettingViewModel4.getCurrGpsMode();
                String str = "";
                if (currGpsMode != null && (strFullDesc = currGpsMode.fullDesc()) != null) {
                    str = strFullDesc;
                }
                textView.setText(str);
                if (bool.booleanValue()) {
                    View view3 = this.a.getView();
                    ExtKt.smartClick$default(view3 != null ? view3.findViewById(R.id.gps_setting_container) : null, 0L, this.a.new e(), 1, null);
                }
            }
        });
        SportSettingViewModel sportSettingViewModel4 = this.viewModel;
        Objects.requireNonNull(sportSettingViewModel4);
        sportSettingViewModel4.getAGpsOutOfDateVisibleLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.SportSettingFragment$initViewModel$$inlined$observe$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Boolean bool = (Boolean) t;
                View view = this.a.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.agps_container), bool.booleanValue(), false, 2, null);
            }
        });
        SportSettingViewModel sportSettingViewModel5 = this.viewModel;
        Objects.requireNonNull(sportSettingViewModel5);
        sportSettingViewModel5.getAGpsOutOfDateLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.SportSettingFragment$initViewModel$$inlined$observe$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                AGpsOutOfDateVo aGpsOutOfDateVo = (AGpsOutOfDateVo) t;
                if (aGpsOutOfDateVo.getEnable() != null) {
                    View view = this.a.getView();
                    ((ListTile) (view == null ? null : view.findViewById(R.id.remind_switch_lt))).setChecked(aGpsOutOfDateVo.getEnable().booleanValue());
                    View view2 = this.a.getView();
                    ((ListTile) (view2 == null ? null : view2.findViewById(R.id.remind_time_lt))).setEnabled(aGpsOutOfDateVo.getEnable().booleanValue());
                }
                if (aGpsOutOfDateVo.getTime() != null) {
                    View view3 = this.a.getView();
                    View viewFindViewById = view3 != null ? view3.findViewById(R.id.remind_time_lt) : null;
                    SportSettingFragment sportSettingFragment = this.a;
                    ((ListTile) viewFindViewById).setSubtitle(sportSettingFragment.getString(R.string.agps_alert_time, TimeUtils.formatTime(sportSettingFragment.requireContext(), WatchSettingExtsKt.toMinutes(aGpsOutOfDateVo.getTime()))));
                }
            }
        });
        HashMap<SettingsGroupType, Settings> watchSettings = ((WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class)).getWatchSettings();
        SportSettingViewModel sportSettingViewModel6 = this.viewModel;
        Objects.requireNonNull(sportSettingViewModel6);
        sportSettingViewModel6.load(watchSettings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Time time, Time time2, Function1 function1, DialogInterface dialogInterface, int i) {
        if (WatchSettingExtsKt.toMinutes(time) != WatchSettingExtsKt.toMinutes(time2)) {
            function1.invoke(time);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment
    public int getContainerId() {
        return this.containerId;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment
    @NotNull
    public String getTitleRes() {
        return this.titleRes;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initViewModel();
    }
}
