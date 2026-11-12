package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice;

import android.os.Bundle;
import android.view.View;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceMainFragment.a;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceMainFragment.c;
import com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel;
import com.xiaomi.hm.health.discovery.WebHelper;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0012\u001a\u00020\r8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0018\u001a\u00020\u00138\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001e\u001a\u00020\u00198\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceMainFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/BaseWatchSettingFragment;", "", "initViewModel", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceWakeUpViewModel;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceWakeUpViewModel;", "viewModel", "", "e", LogUtil.I, "getContainerId", "()I", "containerId", "", "f", "Ljava/lang/String;", "getTitleRes", "()Ljava/lang/String;", "titleRes", "", "g", "Z", "getMenuVisible", "()Z", "menuVisible", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OfflineVoiceMainFragment extends BaseWatchSettingFragment {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private OfflineVoiceWakeUpViewModel viewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String titleRes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean menuVisible;

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
            FragmentKt.findNavController(OfflineVoiceMainFragment.this).navigate(R.id.action_to_offlineVoiceWakeUpFragment);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public static final b a = new b();

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
            WebHelper.launch(FeatureViewModel.INSTANCE.getURL_OFFLINE_VOICE());
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
            FragmentKt.findNavController(OfflineVoiceMainFragment.this).navigate(R.id.action_to_offlineVoiceLanguageFragment);
        }
    }

    public OfflineVoiceMainFragment() {
        super(R.layout.fragment_offline_voice_main);
        this.containerId = R.id.container;
        this.titleRes = IntroduceShuffleFactoryKt.getString(R.string.ds_sound_offline_voice_setting);
    }

    private final void initViewModel() {
        this.viewModel = (OfflineVoiceWakeUpViewModel) new ViewModelProvider(requireActivity()).get(OfflineVoiceWakeUpViewModel.class);
        WatchSettingViewModel watchSettingViewModel = (WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class);
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel);
        OfflineVoiceWakeUpViewModel.setSettings$default(offlineVoiceWakeUpViewModel, false, watchSettingViewModel.getWatchSettings(), 1, null);
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel2 = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel2);
        offlineVoiceWakeUpViewModel2.getOffLineVoiceWakeUpVisibleLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceMainFragment$initViewModel$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Boolean bool = (Boolean) t;
                View view = this.a.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.offline_voice_wakeup_method_iv), bool.booleanValue(), false, 2, null);
                View view2 = this.a.getView();
                ExtKt.smartClick$default(view2 != null ? view2.findViewById(R.id.offline_voice_wakeup_method_iv) : null, 0L, this.a.new a(), 1, null);
            }
        });
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel3 = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel3);
        offlineVoiceWakeUpViewModel3.getOffLineVoiceWakeUpWordsVisibleLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceMainFragment$initViewModel$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Boolean bool = (Boolean) t;
                View view = this.a.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.offline_voice_words_iv), bool.booleanValue(), false, 2, null);
                View view2 = this.a.getView();
                ExtKt.smartClick$default(view2 != null ? view2.findViewById(R.id.offline_voice_words_iv) : null, 0L, OfflineVoiceMainFragment.b.a, 1, null);
            }
        });
        OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel4 = this.viewModel;
        Objects.requireNonNull(offlineVoiceWakeUpViewModel4);
        offlineVoiceWakeUpViewModel4.getOffLineVoiceVoiceLanguageLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceMainFragment$initViewModel$$inlined$observe$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Boolean bool = (Boolean) t;
                View view = this.a.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.offline_voice_language_iv), bool.booleanValue(), false, 2, null);
                View view2 = this.a.getView();
                ExtKt.smartClick$default(view2 != null ? view2.findViewById(R.id.offline_voice_language_iv) : null, 0L, this.a.new c(), 1, null);
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
        initViewModel();
    }
}
