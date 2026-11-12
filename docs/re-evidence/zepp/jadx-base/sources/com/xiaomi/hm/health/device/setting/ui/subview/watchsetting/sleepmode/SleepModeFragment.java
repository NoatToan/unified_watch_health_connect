package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sleepmode;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingHelper;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sleepmode.SleepModeFragment;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u001c\u0010\u0010\u001a\u00020\u000b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u00020\u00118\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sleepmode/SleepModeFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/BaseWatchSettingFragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "initView", "initViewModel", "initEvent", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getContainerId", "()I", "containerId", "", "e", "Ljava/lang/String;", "getTitleRes", "()Ljava/lang/String;", "titleRes", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sleepmode/SleepModeViewModel;", "f", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sleepmode/SleepModeViewModel;", "sleepModeViewModel", "Lcom/huami/lib/rainbow/ListTile;", "g", "Lcom/huami/lib/rainbow/ListTile;", "sleepModeScreenLt", "h", "sleepWatchScreenSmartEnableLt", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepModeFragment extends BaseWatchSettingFragment {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String titleRes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private SleepModeViewModel sleepModeViewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private ListTile sleepModeScreenLt;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ListTile sleepWatchScreenSmartEnableLt;

    public SleepModeFragment() {
        super(R.layout.fragment_sleep_mode);
        this.containerId = R.id.container;
        this.titleRes = IntroduceShuffleFactoryKt.getString(R.string.ctrl_center_sleep);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SleepModeFragment sleepModeFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            SleepModeViewModel sleepModeViewModel = sleepModeFragment.sleepModeViewModel;
            Objects.requireNonNull(sleepModeViewModel);
            sleepModeViewModel.pushSleepModeToDevice(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SleepModeFragment sleepModeFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            SleepModeViewModel sleepModeViewModel = sleepModeFragment.sleepModeViewModel;
            Objects.requireNonNull(sleepModeViewModel);
            sleepModeViewModel.pushSleepModeSmartEnableToDevice(z);
        }
    }

    private final void initEvent() {
        ListTile listTile = this.sleepModeScreenLt;
        Objects.requireNonNull(listTile);
        listTile.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: r07
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SleepModeFragment.f(this.a, compoundButton, z);
            }
        });
        ListTile listTile2 = this.sleepWatchScreenSmartEnableLt;
        Objects.requireNonNull(listTile2);
        listTile2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: s07
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SleepModeFragment.g(this.a, compoundButton, z);
            }
        });
    }

    private final void initView(View view) {
        this.sleepModeScreenLt = (ListTile) view.findViewById(R.id.sleep_mode_screen_lt);
        this.sleepWatchScreenSmartEnableLt = (ListTile) view.findViewById(R.id.sleep_watch_screen_smart_enable_lt);
    }

    private final void initViewModel() {
        this.sleepModeViewModel = (SleepModeViewModel) new ViewModelProvider(requireActivity()).get(SleepModeViewModel.class);
        WatchSettingViewModel watchSettingViewModel = (WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class);
        SleepModeViewModel sleepModeViewModel = this.sleepModeViewModel;
        Objects.requireNonNull(sleepModeViewModel);
        sleepModeViewModel.init(watchSettingViewModel.getWatchSettings());
        SleepModeViewModel sleepModeViewModel2 = this.sleepModeViewModel;
        Objects.requireNonNull(sleepModeViewModel2);
        sleepModeViewModel2.getLoadingLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sleepmode.SleepModeFragment$initViewModel$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                LoadingHelper.responseToLoadingStatus$default(this.a.getLoadingHelper(), this.a.getActivity(), (LoadingVo) t, null, null, 12, null);
            }
        });
        SleepModeViewModel sleepModeViewModel3 = this.sleepModeViewModel;
        Objects.requireNonNull(sleepModeViewModel3);
        sleepModeViewModel3.getSleepScreenLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sleepmode.SleepModeFragment$initViewModel$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                SleepModeVo sleepModeVo = (SleepModeVo) t;
                ListTile listTile = this.a.sleepModeScreenLt;
                Objects.requireNonNull(listTile);
                Boolean sleepScreen = sleepModeVo.getSleepScreen();
                Boolean bool = Boolean.TRUE;
                listTile.setChecked(Intrinsics.areEqual(sleepScreen, bool));
                ListTile listTile2 = this.a.sleepWatchScreenSmartEnableLt;
                Objects.requireNonNull(listTile2);
                listTile2.setChecked(Intrinsics.areEqual(sleepModeVo.getSmartEnable(), bool));
                ListTile listTile3 = this.a.sleepModeScreenLt;
                Objects.requireNonNull(listTile3);
                listTile3.setVisibility(sleepModeVo.getSleepScreen() == null ? 8 : 0);
                ListTile listTile4 = this.a.sleepWatchScreenSmartEnableLt;
                Objects.requireNonNull(listTile4);
                listTile4.setVisibility(sleepModeVo.getSmartEnable() != null ? 0 : 8);
            }
        });
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
        initView(view);
        initViewModel();
        initEvent();
    }
}
