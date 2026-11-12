package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.quickstart;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingHelper;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.quickstart.QuickStartFragment;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u00020\u00158\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\u00020\u00048\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R(\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/quickstart/QuickStartFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/BaseWatchSettingFragment;", "", "initView", "", "getTitle", "g", "initViewModel", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/quickstart/QuickStartAdapter;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/quickstart/QuickStartAdapter;", "adapter", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/quickstart/QuickStartViewModel;", "e", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/quickstart/QuickStartViewModel;", "quickStartViewModel", "", "f", LogUtil.I, "getContainerId", "()I", "containerId", "Ljava/lang/String;", "getTitleRes", "()Ljava/lang/String;", "titleRes", "h", "type", "Lkotlin/Function2;", "i", "Lkotlin/jvm/functions/Function2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class QuickStartFragment extends BaseWatchSettingFragment {

    @NotNull
    public static final String KEY_TYPE = "type";
    public static final int TYPE_CLICK_DOWN = 3;
    public static final int TYPE_CLICK_SELECT = 4;
    public static final int TYPE_LONG_PRESS_SIDE = 1;
    public static final int TYPE_LONG_PRESS_UP = 2;

    @NotNull
    private static final String j = "QuickStartFragment";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private QuickStartAdapter adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private QuickStartViewModel quickStartViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String titleRes;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int type;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Function2<Integer, Integer, Unit> listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"", "origin", "curr", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<Integer, Integer, Unit> {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.quickstart.QuickStartFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0859a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0859a(int i, int i2) {
                super(0);
                this.a = i;
                this.b = i2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "origin: " + this.a + ", curr: " + this.b;
            }
        }

        public a() {
            super(2);
        }

        public final void a(int i, int i2) {
            HMLog.info(QuickStartFragment.j, new C0859a(i, i2));
            QuickStartViewModel quickStartViewModel = QuickStartFragment.this.quickStartViewModel;
            Objects.requireNonNull(quickStartViewModel);
            quickStartViewModel.setQuickStart(i, i2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            a(num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }
    }

    public QuickStartFragment() {
        super(R.layout.fragment_quick_start);
        this.containerId = R.id.container;
        this.titleRes = "";
        this.type = 1;
        this.listener = new a();
    }

    private final String g() {
        int i = this.type;
        if (i == 1) {
            return getString(R.string.ds_quick_start_tips);
        }
        if (i == 2) {
            return getString(R.string.ds_quick_long_press_up_start_tips);
        }
        if (i != 3) {
            return i != 4 ? "" : getString(R.string.ds_quick_click_select_start_tips);
        }
        return getString(R.string.ds_quick_click_down_start_tips);
    }

    private final String getTitle() {
        int i = this.type;
        if (i == 1) {
            return getString(R.string.ds_quick_start_long_press_side);
        }
        if (i == 2) {
            return getString(R.string.ds_quick_start_long_press_up);
        }
        if (i != 3) {
            return i != 4 ? "" : getString(R.string.ds_quick_start);
        }
        return getString(R.string.ds_quick_start_click_down);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(QuickStartFragment quickStartFragment, LoadingVo loadingVo) {
        LoadingHelper.responseToLoadingStatus$default(quickStartFragment.getLoadingHelper(), quickStartFragment.getActivity(), loadingVo, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(QuickStartFragment quickStartFragment, List list) {
        QuickStartAdapter quickStartAdapter = quickStartFragment.adapter;
        Objects.requireNonNull(quickStartAdapter);
        quickStartAdapter.setData(list);
        QuickStartAdapter quickStartAdapter2 = quickStartFragment.adapter;
        Objects.requireNonNull(quickStartAdapter2);
        quickStartAdapter2.notifyDataSetChanged();
    }

    private final void initView() {
        View view = getView();
        ((Toolbar) (view == null ? null : view.findViewById(R.id.toolbar))).setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.transparency));
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.toolbar_title))).setText(getTitle());
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.quick_start_tips_tv))).setText(g());
        View view4 = getView();
        RecyclerView recyclerView = (RecyclerView) (view4 == null ? null : view4.findViewById(R.id.quick_start_rv));
        QuickStartAdapter quickStartAdapter = new QuickStartAdapter(null, this.listener, 1, null);
        this.adapter = quickStartAdapter;
        Unit unit = Unit.INSTANCE;
        recyclerView.setAdapter(quickStartAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    private final void initViewModel() {
        ViewModelProvider viewModelProvider = new ViewModelProvider(requireActivity());
        QuickStartViewModel quickStartViewModel = (QuickStartViewModel) viewModelProvider.get(QuickStartViewModel.class);
        this.quickStartViewModel = quickStartViewModel;
        Objects.requireNonNull(quickStartViewModel);
        quickStartViewModel.load(((WatchSettingViewModel) viewModelProvider.get(WatchSettingViewModel.class)).getWatchSettings(), this.type);
        QuickStartViewModel quickStartViewModel2 = this.quickStartViewModel;
        Objects.requireNonNull(quickStartViewModel2);
        quickStartViewModel2.getLoadingLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: j66
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                QuickStartFragment.h(this.a, (LoadingVo) obj);
            }
        });
        QuickStartViewModel quickStartViewModel3 = this.quickStartViewModel;
        Objects.requireNonNull(quickStartViewModel3);
        MutableLiveData<List<QuickStartVo>> quickStartListLiveData = quickStartViewModel3.getQuickStartListLiveData();
        if (quickStartListLiveData != null) {
            quickStartListLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: k66
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    QuickStartFragment.i(this.a, (List) obj);
                }
            });
        }
        QuickStartViewModel quickStartViewModel4 = this.quickStartViewModel;
        Objects.requireNonNull(quickStartViewModel4);
        quickStartViewModel4.getQuickStartIndexLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: l66
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                QuickStartFragment.j(this.a, (Pair) obj);
            }
        });
        QuickStartViewModel quickStartViewModel5 = this.quickStartViewModel;
        Objects.requireNonNull(quickStartViewModel5);
        quickStartViewModel5.getQuickStartList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(QuickStartFragment quickStartFragment, Pair pair) {
        if (((Number) pair.getFirst()).intValue() != quickStartFragment.type) {
            return;
        }
        QuickStartAdapter quickStartAdapter = quickStartFragment.adapter;
        Objects.requireNonNull(quickStartAdapter);
        int i = 0;
        for (Object obj : quickStartAdapter.getData()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ((QuickStartVo) obj).setSelect(i == ((Number) pair.getSecond()).intValue());
            i = i2;
        }
        QuickStartAdapter quickStartAdapter2 = quickStartFragment.adapter;
        Objects.requireNonNull(quickStartAdapter2);
        quickStartAdapter2.notifyDataSetChanged();
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
        Bundle arguments = getArguments();
        this.type = arguments == null ? 1 : arguments.getInt("type");
        initView();
        initViewModel();
    }
}
