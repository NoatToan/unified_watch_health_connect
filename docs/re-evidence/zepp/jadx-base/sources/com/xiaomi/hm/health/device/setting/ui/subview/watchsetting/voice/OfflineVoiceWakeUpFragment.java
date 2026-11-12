package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.OfflineVoice;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.v1.OfflineVoiceV1;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.v2.OfflineVoiceV2;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceWakeUpFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u00020\u00158\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010 \u001a\u00020\u001b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceWakeUpFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/BaseWatchSettingFragment;", "", "m", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/OfflineVoice;", "offlineVoice", DTransferConstants.SEARCH_KEY, "initEvent", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceWakeUpViewModel;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceWakeUpViewModel;", "viewModel", "e", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/OfflineVoice;", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "f", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "mLoadingDialogHelper", "", "g", LogUtil.I, "getContainerId", "()I", "containerId", "", "h", "Ljava/lang/String;", "getTitleRes", "()Ljava/lang/String;", "titleRes", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OfflineVoiceWakeUpFragment extends BaseWatchSettingFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private OfflineVoiceWakeUpViewModel viewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private OfflineVoice offlineVoice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper mLoadingDialogHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String titleRes;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceWakeUpFragment$Companion;", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceWakeUpFragment;", "newInstance", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OfflineVoiceWakeUpFragment newInstance() {
            return new OfflineVoiceWakeUpFragment();
        }
    }

    public OfflineVoiceWakeUpFragment() {
        super(R.layout.offline_voice_wake_up_fragment);
        this.containerId = R.id.container;
        this.titleRes = IntroduceShuffleFactoryKt.getString(R.string.ds_offline_voice_wakeup_method);
    }

    private final void initEvent() {
        View view = getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.device_setting_response_after_turning_wrist))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: tj5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                OfflineVoiceWakeUpFragment.j(this.a, compoundButton, z);
            }
        });
        View view2 = getView();
        ((ListTile) (view2 == null ? null : view2.findViewById(R.id.device_setting_response_after_bright_screen))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uj5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                OfflineVoiceWakeUpFragment.k(this.a, compoundButton, z);
            }
        });
        View view3 = getView();
        ((ListTile) (view3 != null ? view3.findViewById(R.id.device_setting_response_during_bright_screen) : null)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vj5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                OfflineVoiceWakeUpFragment.l(this.a, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(OfflineVoiceWakeUpFragment offlineVoiceWakeUpFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel = offlineVoiceWakeUpFragment.viewModel;
            Objects.requireNonNull(offlineVoiceWakeUpViewModel);
            offlineVoiceWakeUpViewModel.setResponseAfterTurningWrist(z);
            OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel2 = offlineVoiceWakeUpFragment.viewModel;
            Objects.requireNonNull(offlineVoiceWakeUpViewModel2);
            OfflineVoiceWakeUpViewModel.updateOfflineVoiceWakeUp$default(offlineVoiceWakeUpViewModel2, false, Boolean.valueOf(z), null, null, null, 28, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(OfflineVoiceWakeUpFragment offlineVoiceWakeUpFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel = offlineVoiceWakeUpFragment.viewModel;
            Objects.requireNonNull(offlineVoiceWakeUpViewModel);
            offlineVoiceWakeUpViewModel.setResponseAfterBrightScreen(z);
            OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel2 = offlineVoiceWakeUpFragment.viewModel;
            Objects.requireNonNull(offlineVoiceWakeUpViewModel2);
            OfflineVoiceWakeUpViewModel.updateOfflineVoiceWakeUp$default(offlineVoiceWakeUpViewModel2, false, null, Boolean.valueOf(z), null, null, 26, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(OfflineVoiceWakeUpFragment offlineVoiceWakeUpFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel = offlineVoiceWakeUpFragment.viewModel;
            Objects.requireNonNull(offlineVoiceWakeUpViewModel);
            offlineVoiceWakeUpViewModel.setResponseDuringBrightScreen(z);
            OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel2 = offlineVoiceWakeUpFragment.viewModel;
            Objects.requireNonNull(offlineVoiceWakeUpViewModel2);
            OfflineVoiceWakeUpViewModel.updateOfflineVoiceWakeUp$default(offlineVoiceWakeUpViewModel2, false, null, null, Boolean.valueOf(z), null, 22, null);
            View view = offlineVoiceWakeUpFragment.getView();
            ((ListTile) (view == null ? null : view.findViewById(R.id.device_setting_response_after_turning_wrist))).setEnabled(!z);
            View view2 = offlineVoiceWakeUpFragment.getView();
            ((ListTile) (view2 != null ? view2.findViewById(R.id.device_setting_response_after_bright_screen) : null)).setEnabled(!z);
        }
    }

    private final void m() {
        this.viewModel = (OfflineVoiceWakeUpViewModel) new ViewModelProvider(requireActivity()).get(OfflineVoiceWakeUpViewModel.class);
        final WatchSettingViewModel watchSettingViewModel = (WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class);
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel);
        offlineVoiceWakeUpViewModel.setSettings(false, watchSettingViewModel.getWatchSettings());
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel2 = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel2);
        offlineVoiceWakeUpViewModel2.initJob(HMDeviceType.MILI);
        SettingsGroupType settingsGroupType = SettingsGroupType.OFFLINE_VOICE;
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel3 = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel3);
        watchSettingViewModel.addListener(settingsGroupType, offlineVoiceWakeUpViewModel3);
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel4 = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel4);
        offlineVoiceWakeUpViewModel4.getOfflineVoice().observe(getViewLifecycleOwner(), new Observer() { // from class: yj5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                OfflineVoiceWakeUpFragment.n(this.a, watchSettingViewModel, (OfflineVoice) obj);
            }
        });
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel5 = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel5);
        offlineVoiceWakeUpViewModel5.getWritingResult().observe(getViewLifecycleOwner(), new Observer() { // from class: xj5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                OfflineVoiceWakeUpFragment.o(this.a, (Boolean) obj);
            }
        });
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel6 = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel6);
        OfflineVoiceWakeUpViewModel.querySettings$default(offlineVoiceWakeUpViewModel6, false, 1, null);
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel7 = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel7);
        offlineVoiceWakeUpViewModel7.isShowLoading().observe(getViewLifecycleOwner(), new Observer() { // from class: wj5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                OfflineVoiceWakeUpFragment.p(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(OfflineVoiceWakeUpFragment offlineVoiceWakeUpFragment, WatchSettingViewModel watchSettingViewModel, OfflineVoice offlineVoice) {
        if (offlineVoice == null) {
            return;
        }
        offlineVoiceWakeUpFragment.offlineVoice = offlineVoice;
        offlineVoiceWakeUpFragment.q(offlineVoice);
        watchSettingViewModel.setOfflineVoice(offlineVoice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(OfflineVoiceWakeUpFragment offlineVoiceWakeUpFragment, Boolean bool) {
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            LoadingDialogHelper loadingDialogHelper = offlineVoiceWakeUpFragment.mLoadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.setSuccess(R.string.save_success);
            return;
        }
        LoadingDialogHelper loadingDialogHelper2 = offlineVoiceWakeUpFragment.mLoadingDialogHelper;
        if (loadingDialogHelper2 == null) {
            return;
        }
        loadingDialogHelper2.setFail(R.string.save_failed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(OfflineVoiceWakeUpFragment offlineVoiceWakeUpFragment, Boolean bool) {
        LoadingDialogHelper loadingDialogHelper;
        if (!bool.booleanValue() || (loadingDialogHelper = offlineVoiceWakeUpFragment.mLoadingDialogHelper) == null) {
            return;
        }
        loadingDialogHelper.showLoading(R.string.saving);
    }

    private final void q(OfflineVoice offlineVoice) {
        boolean zBooleanValue;
        if (offlineVoice instanceof OfflineVoiceV1) {
            View view = getView();
            ListTile listTile = (ListTile) (view == null ? null : view.findViewById(R.id.device_setting_response_after_turning_wrist));
            OfflineVoiceV1 offlineVoiceV1 = (OfflineVoiceV1) offlineVoice;
            Boolean activeWithIn5SByTurningWristSwitch = offlineVoiceV1.getActiveWithIn5SByTurningWristSwitch();
            listTile.setChecked(activeWithIn5SByTurningWristSwitch == null ? false : activeWithIn5SByTurningWristSwitch.booleanValue());
            View view2 = getView();
            ListTile listTile2 = (ListTile) (view2 == null ? null : view2.findViewById(R.id.device_setting_response_after_bright_screen));
            Boolean activeWithIn5SWhenScreenOnSwitch = offlineVoiceV1.getActiveWithIn5SWhenScreenOnSwitch();
            listTile2.setChecked(activeWithIn5SWhenScreenOnSwitch == null ? false : activeWithIn5SWhenScreenOnSwitch.booleanValue());
            Boolean activeDuringScreenOnSwitch = offlineVoiceV1.getActiveDuringScreenOnSwitch();
            zBooleanValue = activeDuringScreenOnSwitch != null ? activeDuringScreenOnSwitch.booleanValue() : false;
            View view3 = getView();
            ((ListTile) (view3 == null ? null : view3.findViewById(R.id.device_setting_response_after_turning_wrist))).setEnabled(!zBooleanValue);
            View view4 = getView();
            ((ListTile) (view4 == null ? null : view4.findViewById(R.id.device_setting_response_after_bright_screen))).setEnabled(!zBooleanValue);
            View view5 = getView();
            ((ListTile) (view5 != null ? view5.findViewById(R.id.device_setting_response_during_bright_screen) : null)).setChecked(zBooleanValue);
            return;
        }
        if (offlineVoice instanceof OfflineVoiceV2) {
            View view6 = getView();
            ListTile listTile3 = (ListTile) (view6 == null ? null : view6.findViewById(R.id.device_setting_response_after_turning_wrist));
            OfflineVoiceV2 offlineVoiceV2 = (OfflineVoiceV2) offlineVoice;
            Boolean activeWithIn5SByTurningWristSwitch2 = offlineVoiceV2.getActiveWithIn5SByTurningWristSwitch();
            listTile3.setChecked(activeWithIn5SByTurningWristSwitch2 == null ? false : activeWithIn5SByTurningWristSwitch2.booleanValue());
            View view7 = getView();
            ListTile listTile4 = (ListTile) (view7 == null ? null : view7.findViewById(R.id.device_setting_response_after_bright_screen));
            Boolean activeWithIn5SWhenScreenOnSwitch2 = offlineVoiceV2.getActiveWithIn5SWhenScreenOnSwitch();
            listTile4.setChecked(activeWithIn5SWhenScreenOnSwitch2 == null ? false : activeWithIn5SWhenScreenOnSwitch2.booleanValue());
            Boolean activeDuringScreenOnSwitch2 = offlineVoiceV2.getActiveDuringScreenOnSwitch();
            zBooleanValue = activeDuringScreenOnSwitch2 != null ? activeDuringScreenOnSwitch2.booleanValue() : false;
            View view8 = getView();
            ((ListTile) (view8 == null ? null : view8.findViewById(R.id.device_setting_response_after_turning_wrist))).setEnabled(!zBooleanValue);
            View view9 = getView();
            ((ListTile) (view9 == null ? null : view9.findViewById(R.id.device_setting_response_after_bright_screen))).setEnabled(!zBooleanValue);
            View view10 = getView();
            ((ListTile) (view10 != null ? view10.findViewById(R.id.device_setting_response_during_bright_screen) : null)).setChecked(zBooleanValue);
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

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.mLoadingDialogHelper = new LoadingDialogHelper(getActivity());
        m();
        initEvent();
    }
}
