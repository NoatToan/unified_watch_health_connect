package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting;

import android.os.Bundle;
import android.view.View;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingHelper;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u00020\u00128\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001d\u001a\u00020\u00188\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/GpsSettingFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/BaseWatchSettingFragment;", "", "initViewModel", "initView", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/GpsSettingAdapter;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/GpsSettingAdapter;", "adapter", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/GpsSettingViewModel;", "e", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/GpsSettingViewModel;", "viewModel", "", "f", LogUtil.I, "getContainerId", "()I", "containerId", "", "g", "Ljava/lang/String;", "getTitleRes", "()Ljava/lang/String;", "titleRes", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "h", "Lkotlin/jvm/functions/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "i", "Lkotlin/jvm/functions/Function0;", "onMoreClick", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GpsSettingFragment extends BaseWatchSettingFragment {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private GpsSettingAdapter adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private GpsSettingViewModel viewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String titleRes;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Function1<GpsMode, Unit> listener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onMoreClick;

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
            FragmentKt.findNavController(GpsSettingFragment.this).navigateUp();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "gpsMode", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<GpsMode, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull GpsMode gpsMode) {
            GpsSettingViewModel gpsSettingViewModel = GpsSettingFragment.this.viewModel;
            Objects.requireNonNull(gpsSettingViewModel);
            gpsSettingViewModel.setGpsMode(gpsMode);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GpsMode gpsMode) {
            a(gpsMode);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
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
            FragmentKt.findNavController(GpsSettingFragment.this).navigate(R.id.action_to_gpsDiyFragment);
        }
    }

    public GpsSettingFragment() {
        super(R.layout.fragment_gps_setting);
        this.containerId = R.id.container;
        this.titleRes = IntroduceShuffleFactoryKt.getString(R.string.ds_gps_setting);
        this.listener = new b();
        this.onMoreClick = new c();
    }

    private final void initView() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.btn_back), 0L, new a(), 1, null);
        View view2 = getView();
        ((RecyclerView) (view2 == null ? null : view2.findViewById(R.id.gps_rv))).setLayoutManager(new LinearLayoutManager(requireContext()));
        View view3 = getView();
        View viewFindViewById = view3 != null ? view3.findViewById(R.id.gps_rv) : null;
        GpsSettingAdapter gpsSettingAdapter = new GpsSettingAdapter(requireContext(), GpsMode.DIY, new ArrayList(), this.listener, this.onMoreClick);
        this.adapter = gpsSettingAdapter;
        Unit unit = Unit.INSTANCE;
        ((RecyclerView) viewFindViewById).setAdapter(gpsSettingAdapter);
    }

    private final void initViewModel() {
        GpsSettingViewModel gpsSettingViewModel = (GpsSettingViewModel) new ViewModelProvider(requireActivity()).get(GpsSettingViewModel.class);
        this.viewModel = gpsSettingViewModel;
        Objects.requireNonNull(gpsSettingViewModel);
        gpsSettingViewModel.getGpsModeLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.GpsSettingFragment$initViewModel$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Pair pair = (Pair) t;
                GpsSettingAdapter gpsSettingAdapter = this.a.adapter;
                Objects.requireNonNull(gpsSettingAdapter);
                gpsSettingAdapter.setGpsMode((GpsMode) pair.getFirst());
                GpsSettingAdapter gpsSettingAdapter2 = this.a.adapter;
                Objects.requireNonNull(gpsSettingAdapter2);
                gpsSettingAdapter2.setList((List) pair.getSecond());
                GpsSettingAdapter gpsSettingAdapter3 = this.a.adapter;
                Objects.requireNonNull(gpsSettingAdapter3);
                gpsSettingAdapter3.notifyDataSetChanged();
            }
        });
        GpsSettingViewModel gpsSettingViewModel2 = this.viewModel;
        Objects.requireNonNull(gpsSettingViewModel2);
        gpsSettingViewModel2.getLoadingLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.GpsSettingFragment$initViewModel$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                LoadingHelper.responseToLoadingStatus$default(this.a.getLoadingHelper(), this.a.getActivity(), (LoadingVo) t, null, null, 12, null);
            }
        });
        HashMap<SettingsGroupType, Settings> watchSettings = ((WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class)).getWatchSettings();
        GpsSettingViewModel gpsSettingViewModel3 = this.viewModel;
        Objects.requireNonNull(gpsSettingViewModel3);
        gpsSettingViewModel3.loadGpsSetting(watchSettings);
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
