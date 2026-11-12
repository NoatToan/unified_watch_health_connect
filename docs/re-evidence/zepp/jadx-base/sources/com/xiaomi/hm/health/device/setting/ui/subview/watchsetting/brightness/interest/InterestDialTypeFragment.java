package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestDialTypeFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.vo.InterestDialVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.vo.InterestWatchFaceVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.other.Builder;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J&\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0019\u00100\u001a\u00020+8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestDialTypeFragment;", "Landroidx/fragment/app/Fragment;", "", "h", "initView", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "displayAndBrightness", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/vo/InterestWatchFaceVo;", "vos", com.google.android.exoplayer2.text.ttml.b.r, "", "result", GoogleApiAvailabilityLight.b, "enable", "r", "g", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel;", "a", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel;", "viewModel", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "b", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "mLoadingDialogHelper", "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", "c", "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", "fragment", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestDialTypeAdapter;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestDialTypeAdapter;", "adapter", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/IInterestDialTypeListener;", "e", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/IInterestDialTypeListener;", "getListener", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/IInterestDialTypeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class InterestDialTypeFragment extends Fragment {

    @NotNull
    private static final String f = "InterestDialTypeFragment";
    private static final int g = 2;
    private static final float h = 125.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private DisplayBrightnessViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LoadingDialogHelper mLoadingDialogHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private BTStatusFragment fragment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private InterestDialTypeAdapter adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final IInterestDialTypeListener listener = new IInterestDialTypeListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestDialTypeFragment$listener$1

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onSelect: " + this.a;
            }
        }

        @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.IInterestDialTypeListener
        public void onSelect(@NotNull String style) {
            HMLog.info("InterestDialTypeFragment", new a(style));
            DisplayBrightnessViewModel displayBrightnessViewModel = this.a.viewModel;
            Objects.requireNonNull(displayBrightnessViewModel);
            displayBrightnessViewModel.pushScreenOffDialIdToDevice(style);
        }
    };

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
            FragmentKt.findNavController(InterestDialTypeFragment.this).navigateUp();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "refreshView dto null";
        }
    }

    private final void g() {
        if (this.fragment == null) {
            BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(R.id.container, getChildFragmentManager());
            bTStatusFragmentNewInstance.setShowBottomArea(false);
            Unit unit = Unit.INSTANCE;
            this.fragment = bTStatusFragmentNewInstance;
            bTStatusFragmentNewInstance.setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestDialTypeFragment$initBTStatusFragment$2
                @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
                public void onEnableChange(boolean enable) {
                    this.a.r(enable);
                }
            });
        }
    }

    private final void h() {
        this.viewModel = (DisplayBrightnessViewModel) new ViewModelProvider(requireActivity()).get(DisplayBrightnessViewModel.class);
        final WatchSettingViewModel watchSettingViewModel = (WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class);
        DisplayBrightnessViewModel displayBrightnessViewModel = this.viewModel;
        Objects.requireNonNull(displayBrightnessViewModel);
        displayBrightnessViewModel.initJob(HMDeviceType.MILI);
        DisplayBrightnessViewModel displayBrightnessViewModel2 = this.viewModel;
        Objects.requireNonNull(displayBrightnessViewModel2);
        displayBrightnessViewModel2.getDisplayBrightnessSetting().observe(getViewLifecycleOwner(), new Observer() { // from class: lg4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                InterestDialTypeFragment.i(watchSettingViewModel, (DisplayAndBrightness) obj);
            }
        });
        DisplayBrightnessViewModel displayBrightnessViewModel3 = this.viewModel;
        Objects.requireNonNull(displayBrightnessViewModel3);
        displayBrightnessViewModel3.getWatchSkinBeansLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestDialTypeFragment$initLifeCycles$$inlined$observe$1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                InterestDialTypeFragment.q(this.a, null, (List) t, 1, null);
            }
        });
        DisplayBrightnessViewModel displayBrightnessViewModel4 = this.viewModel;
        Objects.requireNonNull(displayBrightnessViewModel4);
        displayBrightnessViewModel4.getScreenOffFollowCurrentDialSwitchLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: og4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                InterestDialTypeFragment.j(this.a, (Pair) obj);
            }
        });
        DisplayBrightnessViewModel displayBrightnessViewModel5 = this.viewModel;
        Objects.requireNonNull(displayBrightnessViewModel5);
        displayBrightnessViewModel5.getScreenOffDialIdLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ng4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                InterestDialTypeFragment.k(this.a, (Pair) obj);
            }
        });
        DisplayBrightnessViewModel displayBrightnessViewModel6 = this.viewModel;
        Objects.requireNonNull(displayBrightnessViewModel6);
        displayBrightnessViewModel6.isShowLoading().observe(getViewLifecycleOwner(), new Observer() { // from class: mg4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                InterestDialTypeFragment.l(this.a, (Boolean) obj);
            }
        });
        DisplayBrightnessViewModel displayBrightnessViewModel7 = this.viewModel;
        Objects.requireNonNull(displayBrightnessViewModel7);
        displayBrightnessViewModel7.loadInterestDials();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(WatchSettingViewModel watchSettingViewModel, DisplayAndBrightness displayAndBrightness) {
        if (displayAndBrightness == null) {
            return;
        }
        watchSettingViewModel.setDisplayBrightness(displayAndBrightness);
    }

    private final void initView() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.btn_back), 0L, new a(), 1, null);
        View view2 = getView();
        ((ListTile) (view2 == null ? null : view2.findViewById(R.id.follow_dial_iv))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kg4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                InterestDialTypeFragment.m(this.a, compoundButton, z);
            }
        });
        View view3 = getView();
        View viewFindViewById = view3 == null ? null : view3.findViewById(R.id.screen_off_dial_type_rv);
        InterestDialTypeAdapter interestDialTypeAdapter = new InterestDialTypeAdapter(null, null, 3, null);
        this.adapter = interestDialTypeAdapter;
        interestDialTypeAdapter.setListener(getListener());
        Unit unit = Unit.INSTANCE;
        ((RecyclerView) viewFindViewById).setAdapter(interestDialTypeAdapter);
        View view4 = getView();
        ((RecyclerView) (view4 == null ? null : view4.findViewById(R.id.screen_off_dial_type_rv))).setLayoutManager(new GridLayoutManager(requireActivity(), 2));
        View view5 = getView();
        float f2 = 2;
        float width = (((CardView) (view5 == null ? null : view5.findViewById(R.id.style_container))).getWidth() - (ViewUtils.dp2px(requireContext(), h) * f2)) / 4.0f;
        float f3 = f2 * width;
        Builder context = new Builder().setContext(requireActivity());
        View view6 = getView();
        context.setRecyclerView((RecyclerView) (view6 != null ? view6.findViewById(R.id.screen_off_dial_type_rv) : null)).setSpanCount(2).setEdgeSpace(width).setSpace(f3).build().setup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(InterestDialTypeFragment interestDialTypeFragment, Pair pair) {
        interestDialTypeFragment.n(((Boolean) pair.getFirst()).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(InterestDialTypeFragment interestDialTypeFragment, Pair pair) {
        interestDialTypeFragment.n(((Boolean) pair.getFirst()).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(InterestDialTypeFragment interestDialTypeFragment, Boolean bool) {
        if (bool.booleanValue()) {
            LoadingDialogHelper loadingDialogHelper = interestDialTypeFragment.mLoadingDialogHelper;
            Objects.requireNonNull(loadingDialogHelper);
            loadingDialogHelper.showLoading(R.string.saving);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(InterestDialTypeFragment interestDialTypeFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            DisplayBrightnessViewModel displayBrightnessViewModel = interestDialTypeFragment.viewModel;
            Objects.requireNonNull(displayBrightnessViewModel);
            displayBrightnessViewModel.pushScreenOffFollowCurrentDialSwitch(z);
        }
    }

    private final void n(boolean result) {
        if (result) {
            LoadingDialogHelper loadingDialogHelper = this.mLoadingDialogHelper;
            Objects.requireNonNull(loadingDialogHelper);
            loadingDialogHelper.setSuccess(R.string.save_success);
        } else {
            LoadingDialogHelper loadingDialogHelper2 = this.mLoadingDialogHelper;
            Objects.requireNonNull(loadingDialogHelper2);
            loadingDialogHelper2.setFail(R.string.save_failed);
        }
        q(this, null, null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(InterestDialTypeFragment interestDialTypeFragment) {
        interestDialTypeFragment.initView();
        interestDialTypeFragment.h();
    }

    private final void p(DisplayAndBrightnessV2 displayAndBrightness, List<InterestWatchFaceVo> vos) {
        if (displayAndBrightness == null) {
            DisplayBrightnessViewModel displayBrightnessViewModel = this.viewModel;
            Objects.requireNonNull(displayBrightnessViewModel);
            displayAndBrightness = displayBrightnessViewModel.getDisplayAndBrightnessV2();
        }
        if (displayAndBrightness == null) {
            HMLog.info(f, b.a);
            return;
        }
        Boolean screenOffFollowCurrentDialSwitch = displayAndBrightness.getScreenOffFollowCurrentDialSwitch();
        if (screenOffFollowCurrentDialSwitch == null) {
            View view = getView();
            ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.follow_dial_iv), false, false, 2, null);
        } else {
            View view2 = getView();
            ExtKt.setVisible$default(view2 == null ? null : view2.findViewById(R.id.follow_dial_iv), true, false, 2, null);
            View view3 = getView();
            ((ListTile) (view3 == null ? null : view3.findViewById(R.id.follow_dial_iv))).setChecked(screenOffFollowCurrentDialSwitch.booleanValue());
        }
        if (displayAndBrightness.getScreenOffDialId() == null) {
            View view4 = getView();
            ExtKt.setVisible$default(view4 == null ? null : view4.findViewById(R.id.style_container), false, false, 2, null);
        }
        r(true);
        if (vos == null) {
            DisplayBrightnessViewModel displayBrightnessViewModel2 = this.viewModel;
            Objects.requireNonNull(displayBrightnessViewModel2);
            vos = displayBrightnessViewModel2.getWatchFaceVos();
            if (vos == null) {
                return;
            }
        }
        StringEnum screenOffDialId = displayAndBrightness.getScreenOffDialId();
        String value = screenOffDialId != null ? screenOffDialId.getValue() : null;
        if (value == null) {
            return;
        }
        InterestDialTypeAdapter interestDialTypeAdapter = this.adapter;
        Objects.requireNonNull(interestDialTypeAdapter);
        interestDialTypeAdapter.setInterestDialVo(new InterestDialVo(value, vos));
        InterestDialTypeAdapter interestDialTypeAdapter2 = this.adapter;
        Objects.requireNonNull(interestDialTypeAdapter2);
        interestDialTypeAdapter2.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void q(InterestDialTypeFragment interestDialTypeFragment, DisplayAndBrightnessV2 displayAndBrightnessV2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            displayAndBrightnessV2 = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        interestDialTypeFragment.p(displayAndBrightnessV2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(boolean enable) {
        Boolean screenOffFollowCurrentDialSwitch;
        if (!enable) {
            View view = getView();
            ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.mask_view), true, false, 2, null);
            return;
        }
        DisplayBrightnessViewModel displayBrightnessViewModel = this.viewModel;
        Objects.requireNonNull(displayBrightnessViewModel);
        DisplayAndBrightness value = displayBrightnessViewModel.getDisplayBrightnessSetting().getValue();
        DisplayAndBrightnessV2 displayAndBrightnessV2 = value instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) value : null;
        boolean zBooleanValue = (displayAndBrightnessV2 == null || (screenOffFollowCurrentDialSwitch = displayAndBrightnessV2.getScreenOffFollowCurrentDialSwitch()) == null) ? false : screenOffFollowCurrentDialSwitch.booleanValue();
        View view2 = getView();
        ExtKt.setVisible$default(view2 == null ? null : view2.findViewById(R.id.mask_view), zBooleanValue, false, 2, null);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final IInterestDialTypeListener getListener() {
        return this.listener;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_interest_dial_type, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        this.mLoadingDialogHelper = new LoadingDialogHelper(requireActivity());
        g();
        View view2 = getView();
        ((CardView) (view2 == null ? null : view2.findViewById(R.id.style_container))).post(new Runnable() { // from class: pg4
            @Override // java.lang.Runnable
            public final void run() {
                InterestDialTypeFragment.o(this.a);
            }
        });
    }
}
