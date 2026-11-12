package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.OfflineVoice;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.v2.OfflineVoiceV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceLanguageFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceLanguageFragment.b;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\b*\u00013\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0003J\u0016\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010 \u001a\u00020\u001c8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010%\u001a\u00020\f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010*\u001a\u00020&8\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u0006:"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceLanguageFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/BaseWatchSettingFragment;", "", "initView", "initViewModel", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/OfflineVoice;", "offlineVoice", "f", "Lkotlin/Function0;", "action", "i", "h", "", "msg", "showLoading", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceWakeUpViewModel;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceWakeUpViewModel;", "viewModel", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceLanguageAdapter;", "e", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceLanguageAdapter;", "adapter", "", LogUtil.I, "getContainerId", "()I", "containerId", "g", "Ljava/lang/String;", "getTitleRes", "()Ljava/lang/String;", "titleRes", "", "Z", "getMenuVisible", "()Z", "menuVisible", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", z.j, "Ljava/lang/Integer;", "startLanguage", hl.k, "currentLanguage", "com/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceLanguageFragment$listener$1", "l", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceLanguageFragment$listener$1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OfflineVoiceLanguageFragment extends BaseWatchSettingFragment {

    @NotNull
    private static final String m = "OfflineVoiceLanguageFragment";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private OfflineVoiceWakeUpViewModel viewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private OfflineVoiceLanguageAdapter adapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String titleRes;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean menuVisible;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Integer startLanguage;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private Integer currentLanguage;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final OfflineVoiceLanguageFragment$listener$1 listener;

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
            return "language not change";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
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
            OfflineVoiceLanguageFragment.g(OfflineVoiceLanguageFragment.this, null, 1, null);
            FragmentKt.findNavController(OfflineVoiceLanguageFragment.this).navigateUp();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "refreshView dto null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            OfflineVoiceLanguageAdapter offlineVoiceLanguageAdapter = OfflineVoiceLanguageFragment.this.adapter;
            Objects.requireNonNull(offlineVoiceLanguageAdapter);
            return "enum: " + offlineVoiceLanguageAdapter.getEnum();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceLanguageFragment$listener$1] */
    public OfflineVoiceLanguageFragment() {
        super(R.layout.fragment_offline_voice_language);
        this.containerId = R.id.container;
        this.titleRes = IntroduceShuffleFactoryKt.getString(R.string.ds_sound_offline_voice_language);
        this.menuVisible = true;
        this.listener = new OfflineVoiceLanguageListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceLanguageFragment$listener$1
            @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceLanguageListener
            public void onSelect(int value) {
                this.a.currentLanguage = Integer.valueOf(value);
                OfflineVoiceLanguageFragment.g(this.a, null, 1, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(OfflineVoiceLanguageFragment offlineVoiceLanguageFragment, View view, int i) {
        if (Intrinsics.areEqual(offlineVoiceLanguageFragment.startLanguage, offlineVoiceLanguageFragment.currentLanguage)) {
            HMLog.info(m, a.a);
        }
        Integer num = offlineVoiceLanguageFragment.currentLanguage;
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel = offlineVoiceLanguageFragment.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel);
        offlineVoiceWakeUpViewModel.setLanguage(iIntValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NotifyDataSetChanged"})
    public final void f(OfflineVoice offlineVoice) {
        ArrayList<Integer> enums;
        OfflineVoiceV2 offlineVoiceV2 = null;
        OfflineVoiceV2 offlineVoiceV3 = offlineVoice instanceof OfflineVoiceV2 ? (OfflineVoiceV2) offlineVoice : null;
        if (offlineVoiceV3 == null) {
            OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel = this.viewModel;
            Objects.requireNonNull(offlineVoiceWakeUpViewModel);
            OfflineVoice value = offlineVoiceWakeUpViewModel.getOfflineVoice().getValue();
            if (value instanceof OfflineVoiceV2) {
                offlineVoiceV2 = (OfflineVoiceV2) value;
            }
        } else {
            offlineVoiceV2 = offlineVoiceV3;
        }
        if (offlineVoiceV2 == null) {
            HMLog.info(m, c.a);
            return;
        }
        Integer num = this.currentLanguage;
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        ArrayList arrayList = new ArrayList();
        EnumData language = offlineVoiceV2.getLanguage();
        if (language != null && (enums = language.getEnums()) != null) {
            arrayList.addAll(enums);
        }
        OfflineVoiceLanguageAdapter offlineVoiceLanguageAdapter = this.adapter;
        Objects.requireNonNull(offlineVoiceLanguageAdapter);
        offlineVoiceLanguageAdapter.setEnum(new EnumData(iIntValue, arrayList, true));
        HMLog.info(m, new d());
        OfflineVoiceLanguageAdapter offlineVoiceLanguageAdapter2 = this.adapter;
        Objects.requireNonNull(offlineVoiceLanguageAdapter2);
        offlineVoiceLanguageAdapter2.notifyDataSetChanged();
    }

    public static /* synthetic */ void g(OfflineVoiceLanguageFragment offlineVoiceLanguageFragment, OfflineVoice offlineVoice, int i, Object obj) {
        if ((i & 1) != 0) {
            offlineVoice = null;
        }
        offlineVoiceLanguageFragment.f(offlineVoice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog != null && loadingDialog.isShowing()) {
            loadingDialog.setFailed(getString(R.string.save_failed));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(final Function0<Unit> action) {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog != null && loadingDialog.isShowing()) {
            loadingDialog.setSuccess(getString(R.string.save_success), new LoadingDialog.OnAnimEndListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceLanguageFragment$showSuccess$1$1
                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onAnimEnd(@Nullable LoadingDialog dialog) {
                    action.getA();
                }

                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onDismiss(@Nullable LoadingDialog dialog) {
                }
            });
        }
    }

    private final void initView() {
        View view = getView();
        View viewFindViewById = view == null ? null : view.findViewById(R.id.offline_voice_language_rv);
        OfflineVoiceLanguageAdapter offlineVoiceLanguageAdapter = new OfflineVoiceLanguageAdapter(null, this.listener, 1, null);
        this.adapter = offlineVoiceLanguageAdapter;
        Unit unit = Unit.INSTANCE;
        ((RecyclerView) viewFindViewById).setAdapter(offlineVoiceLanguageAdapter);
        View view2 = getView();
        ((RecyclerView) (view2 == null ? null : view2.findViewById(R.id.offline_voice_language_rv))).setLayoutManager(new LinearLayoutManager(requireActivity()));
        View view3 = getView();
        ((RainbowTitleBar) (view3 != null ? view3.findViewById(R.id.title_bar) : null)).setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: sj5
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view4, int i) {
                OfflineVoiceLanguageFragment.e(this.a, view4, i);
            }
        });
    }

    private final void initViewModel() {
        this.viewModel = (OfflineVoiceWakeUpViewModel) new ViewModelProvider(requireActivity()).get(OfflineVoiceWakeUpViewModel.class);
        final WatchSettingViewModel watchSettingViewModel = (WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class);
        OfflineVoice offlineVoice = watchSettingViewModel.get_offlineVoice();
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel);
        offlineVoiceWakeUpViewModel.setSettings(false, watchSettingViewModel.getWatchSettings());
        if (offlineVoice instanceof OfflineVoiceV2) {
            EnumData language = ((OfflineVoiceV2) offlineVoice).getLanguage();
            Integer numValueOf = language == null ? null : Integer.valueOf(language.getValue());
            this.startLanguage = numValueOf;
            this.currentLanguage = numValueOf;
        }
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel2 = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel2);
        offlineVoiceWakeUpViewModel2.initJob(HMDeviceType.MILI);
        SettingsGroupType settingsGroupType = SettingsGroupType.OFFLINE_VOICE;
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel3 = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel3);
        watchSettingViewModel.addListener(settingsGroupType, offlineVoiceWakeUpViewModel3);
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel4 = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel4);
        offlineVoiceWakeUpViewModel4.getOfflineVoice().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceLanguageFragment$initViewModel$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                EnumData language2;
                OfflineVoice offlineVoice2 = (OfflineVoice) t;
                OfflineVoiceLanguageFragment offlineVoiceLanguageFragment = this.a;
                Integer numValueOf2 = null;
                OfflineVoiceV2 offlineVoiceV2 = offlineVoice2 instanceof OfflineVoiceV2 ? (OfflineVoiceV2) offlineVoice2 : null;
                if (offlineVoiceV2 != null && (language2 = offlineVoiceV2.getLanguage()) != null) {
                    numValueOf2 = Integer.valueOf(language2.getValue());
                }
                offlineVoiceLanguageFragment.currentLanguage = numValueOf2;
                if (offlineVoice2 == null) {
                    return;
                }
                watchSettingViewModel.setOfflineVoice(offlineVoice2);
                this.a.f(offlineVoice2);
            }
        });
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel5 = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel5);
        offlineVoiceWakeUpViewModel5.getWritingResult().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceLanguageFragment$initViewModel$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Boolean bool = (Boolean) t;
                if (bool == null) {
                    return;
                }
                if (!bool.booleanValue()) {
                    this.a.h();
                } else {
                    OfflineVoiceLanguageFragment offlineVoiceLanguageFragment = this.a;
                    offlineVoiceLanguageFragment.i(offlineVoiceLanguageFragment.new b());
                }
            }
        });
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel6 = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel6);
        offlineVoiceWakeUpViewModel6.isShowLoading().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceLanguageFragment$initViewModel$$inlined$observe$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                if (((Boolean) t).booleanValue()) {
                    OfflineVoiceLanguageFragment offlineVoiceLanguageFragment = this.a;
                    offlineVoiceLanguageFragment.showLoading(offlineVoiceLanguageFragment.getString(R.string.saving));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading(String msg) {
        if (this.loadingDialog == null) {
            this.loadingDialog = LoadingDialog.showDialog(requireActivity(), msg);
        }
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setMessage(msg);
        loadingDialog.setCancelable(false);
        loadingDialog.show();
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment
    public int getContainerId() {
        return this.containerId;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment
    public boolean getMenuVisible() {
        return this.menuVisible;
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
