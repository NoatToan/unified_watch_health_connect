package com.huami.sleep.daysleep.sleepstagechart.ui;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.util.Index;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.sleepstagechart.helper.DaySleepChartHelper;
import com.huami.sleep.daysleep.sleepstagechart.ui.SleepStageChartFragment;
import com.huami.sleep.daysleep.sleepstagechart.ui.view.DragIntervalView;
import com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepOverlayMenu;
import com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepStageInfoView;
import com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepTagChart;
import com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepTagEditCard;
import com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel;
import com.huami.sleep.daysleep.sleepstagechart.vo.Resource;
import com.huami.sleep.daysleep.sleepstagechart.vo.SelectTip;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepStageDurationInfo;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagDataVo;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagInfo;
import com.huami.sleep.daysleep.sleepstagechart.vo.Status;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.util.SleepStatusAnalytics;
import com.huami.sleep.util.ViewSlideWrapper;
import com.huami.sleep.util.ViewUtils;
import com.huami.sleep.view.UnitTextView;
import com.huami.widget.toast.CustomToast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0006\u0010\r\u001a\u00020\u0002R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/ui/SleepStageChartFragment;", "Landroidx/fragment/app/Fragment;", "", "r", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onActivityCreated", "initView", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "a", "Lkotlin/Lazy;", "J", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mDialog", "Lcom/huami/sleep/util/ViewSlideWrapper;", "b", "K", "()Lcom/huami/sleep/util/ViewSlideWrapper;", "viewSlideHelper", "Lcom/huami/sleep/daysleep/sleepstagechart/helper/DaySleepChartHelper;", "c", LogUtil.I, "()Lcom/huami/sleep/daysleep/sleepstagechart/helper/DaySleepChartHelper;", "chartHelper", "Lcom/huami/sleep/daysleep/sleepstagechart/viewmodel/SleepStageChartViewModel;", GoogleApiAvailabilityLight.a, "getViewModel", "()Lcom/huami/sleep/daysleep/sleepstagechart/viewmodel/SleepStageChartViewModel;", "viewModel", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepStageChartFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String e = "dateKey";

    @NotNull
    private static final String f = "user_id";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDialog = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewSlideHelper = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartHelper = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/ui/SleepStageChartFragment$Companion;", "", "", "userId", "date", "Lcom/huami/sleep/daysleep/sleepstagechart/ui/SleepStageChartFragment;", "newInstance", "KEY_DATE", "Ljava/lang/String;", "KEY_USER_ID", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepStageChartFragment newInstance(@NotNull String userId, @NotNull String date) {
            SleepStageChartFragment sleepStageChartFragment = new SleepStageChartFragment();
            Bundle bundle = new Bundle();
            bundle.putString("dateKey", date);
            bundle.putString("user_id", userId);
            sleepStageChartFragment.setArguments(bundle);
            return sleepStageChartFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.LOADING.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/helper/DaySleepChartHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<DaySleepChartHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DaySleepChartHelper getA() {
            return new DaySleepChartHelper(SleepStageChartFragment.this.requireContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"", "fl", "fl2", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Float, Float, Unit> {
        public b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
            invoke(f.floatValue(), f2.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f, float f2) {
            SleepStageChartFragment.this.getViewModel().setDragInterval(f, f2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<LoadingDialog> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog getA() {
            return new LoadingDialog(SleepStageChartFragment.this.requireContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/util/ViewSlideWrapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<ViewSlideWrapper> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewSlideWrapper getA() {
            View view = SleepStageChartFragment.this.getView();
            return new ViewSlideWrapper(view == null ? null : view.findViewById(R.id.selectInfoLL), ViewUtils.dp2px(SleepStageChartFragment.this.getContext(), 8.0f), SleepStageChartFragment.this.getResources().getDisplayMetrics().widthPixels - ViewUtils.dp2px(SleepStageChartFragment.this.getContext(), 15.0f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepStageChartFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.daysleep.sleepstagechart.ui.SleepStageChartFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SleepStageChartViewModel>() { // from class: com.huami.sleep.daysleep.sleepstagechart.ui.SleepStageChartFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SleepStageChartViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SleepStageChartViewModel.class), function0, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(SleepStageChartFragment sleepStageChartFragment, List list) {
        View view = sleepStageChartFragment.getView();
        ((SleepTagEditCard) (view == null ? null : view.findViewById(R.id.slpTagCard))).setData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(SleepStageChartFragment sleepStageChartFragment, Pair pair) {
        View view = sleepStageChartFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.stopTime))).setText((CharSequence) pair.getSecond());
        View view2 = sleepStageChartFragment.getView();
        ((TextView) (view2 != null ? view2.findViewById(R.id.startTime) : null)).setText((CharSequence) pair.getFirst());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(SleepStageChartFragment sleepStageChartFragment, SleepStageDurationInfo sleepStageDurationInfo) {
        View view = sleepStageChartFragment.getView();
        ((SleepStageInfoView) (view == null ? null : view.findViewById(R.id.sleepDurationView))).update(sleepStageDurationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(SleepStageChartFragment sleepStageChartFragment, Boolean bool) {
        View view = sleepStageChartFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.sleepDurationView), bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(SleepStageChartFragment sleepStageChartFragment, SelectTip selectTip) {
        if (selectTip == null) {
            return;
        }
        View view = sleepStageChartFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.sleepTv))).setText(selectTip.getTitle());
        View view2 = sleepStageChartFragment.getView();
        View viewFindViewById = view2 == null ? null : view2.findViewById(R.id.sleepTotalTimeTv);
        String[] value = selectTip.getValue();
        ((UnitTextView) viewFindViewById).setValues((String[]) Arrays.copyOf(value, value.length));
        View view3 = sleepStageChartFragment.getView();
        ((TextView) (view3 != null ? view3.findViewById(R.id.sleepDurTV) : null)).setText(selectTip.getTimeDur());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(SleepStageChartFragment sleepStageChartFragment, Boolean bool) {
        View view = sleepStageChartFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.belowChartLine), !bool.booleanValue());
        View view2 = sleepStageChartFragment.getView();
        ViewExKt.setVisible(view2 == null ? null : view2.findViewById(R.id.line), !bool.booleanValue());
        View view3 = sleepStageChartFragment.getView();
        ViewExKt.setVisible(view3 == null ? null : view3.findViewById(R.id.startTime), !bool.booleanValue());
        View view4 = sleepStageChartFragment.getView();
        ViewExKt.setVisible(view4 == null ? null : view4.findViewById(R.id.stopTime), !bool.booleanValue());
        if (!bool.booleanValue()) {
            View view5 = sleepStageChartFragment.getView();
            ((TextView) (view5 != null ? view5.findViewById(R.id.sleepTv) : null)).setVisibility(0);
        } else {
            View view6 = sleepStageChartFragment.getView();
            ((UnitTextView) (view6 == null ? null : view6.findViewById(R.id.sleepTotalTimeTv))).setValues(sleepStageChartFragment.getResources().getString(R.string.sleep_no_data_text), "");
            View view7 = sleepStageChartFragment.getView();
            ((TextView) (view7 != null ? view7.findViewById(R.id.sleepTv) : null)).setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(SleepStageChartFragment sleepStageChartFragment, ChartDataList chartDataList) {
        if (Intrinsics.areEqual("heart_rate", sleepStageChartFragment.getViewModel().getOverLayType())) {
            View view = sleepStageChartFragment.getView();
            ((FrameLayout) (view == null ? null : view.findViewById(R.id.hrChartLayout))).setPadding(0, (int) TypedValue.applyDimension(1, 30.0f, sleepStageChartFragment.getResources().getDisplayMetrics()), 0, 0);
        } else {
            View view2 = sleepStageChartFragment.getView();
            ((FrameLayout) (view2 == null ? null : view2.findViewById(R.id.hrChartLayout))).setPadding(0, 0, 0, 0);
        }
        DaySleepChartHelper daySleepChartHelperI = sleepStageChartFragment.I();
        View view3 = sleepStageChartFragment.getView();
        daySleepChartHelperI.refreshOverlayChart((ViewGroup) (view3 != null ? view3.findViewById(R.id.hrChartLayout) : null), chartDataList, sleepStageChartFragment.getViewModel().getOverLayType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(SleepStageChartFragment sleepStageChartFragment, Boolean bool) {
        View view = sleepStageChartFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.hrChartLayout), bool.booleanValue());
    }

    private final DaySleepChartHelper I() {
        return (DaySleepChartHelper) this.chartHelper.getValue();
    }

    private final LoadingDialog J() {
        return (LoadingDialog) this.mDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewSlideWrapper K() {
        return (ViewSlideWrapper) this.viewSlideHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(SleepStageChartFragment sleepStageChartFragment, View view) {
        sleepStageChartFragment.getViewModel().changeMakeSleepTagStatus(true);
        SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.SLP_DETAIL_TAP_CLICK);
    }

    private final void r() {
        String string;
        String string2;
        final SleepStageChartViewModel viewModel = getViewModel();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("user_id")) == null) {
            string = "";
        }
        viewModel.setUserId(string);
        viewModel.getStageSleepChartData().observe(getViewLifecycleOwner(), new Observer() { // from class: x17
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartFragment.s(this.a, viewModel, (ChartDataList) obj);
            }
        });
        viewModel.getStartEndTimeShow().observe(getViewLifecycleOwner(), new Observer() { // from class: v17
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartFragment.B(this.a, (Pair) obj);
            }
        });
        viewModel.getStageDurInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: b27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartFragment.C(this.a, (SleepStageDurationInfo) obj);
            }
        });
        viewModel.getStageViewShow().observe(getViewLifecycleOwner(), new Observer() { // from class: e27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartFragment.D(this.a, (Boolean) obj);
            }
        });
        viewModel.getMSelectTipInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: a27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartFragment.E(this.a, (SelectTip) obj);
            }
        });
        viewModel.getShowNoSleep().observe(getViewLifecycleOwner(), new Observer() { // from class: c27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartFragment.F(this.a, (Boolean) obj);
            }
        });
        viewModel.getAddChartDataList().observe(getViewLifecycleOwner(), new Observer() { // from class: y17
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartFragment.G(this.a, (ChartDataList) obj);
            }
        });
        viewModel.getOverlayChartShow().observe(getViewLifecycleOwner(), new Observer() { // from class: d27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartFragment.H(this.a, (Boolean) obj);
            }
        });
        viewModel.getOverLayTypeListLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: u17
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartFragment.t(this.a, (List) obj);
            }
        });
        viewModel.getMMakeSleepTagStatus().observe(getViewLifecycleOwner(), new Observer() { // from class: f27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartFragment.u(this.a, (Boolean) obj);
            }
        });
        viewModel.getMSleepTagChart().observe(getViewLifecycleOwner(), new Observer() { // from class: s17
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartFragment.v(this.a, (ArrayList) obj);
            }
        });
        viewModel.getMToast().observe(getViewLifecycleOwner(), new Observer() { // from class: r17
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartFragment.w(this.a, (String) obj);
            }
        });
        viewModel.getMSleepStartEndIndex().observe(getViewLifecycleOwner(), new Observer() { // from class: w17
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartFragment.x(this.a, (Pair) obj);
            }
        });
        viewModel.getMWebRequestResult().observe(getViewLifecycleOwner(), new Observer() { // from class: z17
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartFragment.y(this.a, (Resource) obj);
            }
        });
        viewModel.getMSleepMakeTagEnable().observe(getViewLifecycleOwner(), new Observer() { // from class: g27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartFragment.z(this.a, (Boolean) obj);
            }
        });
        viewModel.getMTagList().observe(getViewLifecycleOwner(), new Observer() { // from class: t17
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartFragment.A(this.a, (List) obj);
            }
        });
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("dateKey")) != null) {
            str = string2;
        }
        viewModel.setDate(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(SleepStageChartFragment sleepStageChartFragment, SleepStageChartViewModel sleepStageChartViewModel, ChartDataList chartDataList) {
        DaySleepChartHelper daySleepChartHelperI = sleepStageChartFragment.I();
        View view = sleepStageChartFragment.getView();
        daySleepChartHelperI.refreshChart((ViewGroup) (view == null ? null : view.findViewById(R.id.chartLayout)), chartDataList);
        sleepStageChartViewModel.selectChange(Index.INVALID_INDEX, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(SleepStageChartFragment sleepStageChartFragment, List list) {
        View view = sleepStageChartFragment.getView();
        ((SleepOverlayMenu) (view == null ? null : view.findViewById(R.id.overLayMenu))).setOverLayType(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(SleepStageChartFragment sleepStageChartFragment, Boolean bool) {
        View view = sleepStageChartFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.slpTagCard), bool.booleanValue());
        View view2 = sleepStageChartFragment.getView();
        ViewExKt.setVisible(view2 == null ? null : view2.findViewById(R.id.dragSelectV), bool.booleanValue());
        if (bool.booleanValue()) {
            View view3 = sleepStageChartFragment.getView();
            ((SleepTagEditCard) (view3 == null ? null : view3.findViewById(R.id.slpTagCard))).init();
            View view4 = sleepStageChartFragment.getView();
            ((DragIntervalView) (view4 != null ? view4.findViewById(R.id.dragSelectV) : null)).showDefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(SleepStageChartFragment sleepStageChartFragment, ArrayList arrayList) {
        View view = sleepStageChartFragment.getView();
        ((SleepTagChart) (view == null ? null : view.findViewById(R.id.tagResultLayout))).updateData(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(SleepStageChartFragment sleepStageChartFragment, String str) {
        CustomToast.showShort(sleepStageChartFragment.getContext(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(SleepStageChartFragment sleepStageChartFragment, Pair pair) {
        if (pair == null) {
            return;
        }
        View view = sleepStageChartFragment.getView();
        DragIntervalView dragIntervalView = (DragIntervalView) (view == null ? null : view.findViewById(R.id.dragSelectV));
        dragIntervalView.setXAxisMinMaxValue(((Number) pair.getFirst()).floatValue() * 60.0f, ((Number) pair.getSecond()).floatValue() * 60.0f);
        dragIntervalView.initStartEndValue(((Number) pair.getFirst()).floatValue() * 60.0f, (((((Number) pair.getSecond()).floatValue() * 60.0f) - (((Number) pair.getFirst()).floatValue() * 60.0f)) / 2.0f) + (((Number) pair.getFirst()).intValue() * 60));
        View view2 = sleepStageChartFragment.getView();
        ((SleepTagChart) (view2 != null ? view2.findViewById(R.id.tagResultLayout) : null)).setXMaxMinValue(((Number) pair.getFirst()).floatValue() * 60.0f, ((Number) pair.getSecond()).floatValue() * 60.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(SleepStageChartFragment sleepStageChartFragment, Resource resource) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            sleepStageChartFragment.J().dismiss();
        } else if (i != 2) {
            sleepStageChartFragment.J().setFailed(sleepStageChartFragment.getString(R.string.earbud_net_error_toast));
        } else {
            sleepStageChartFragment.J().setMessage(sleepStageChartFragment.getString(R.string.loading));
            sleepStageChartFragment.J().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(SleepStageChartFragment sleepStageChartFragment, Boolean bool) {
        sleepStageChartFragment.getViewModel().loadSleepTagByDate();
        View view = sleepStageChartFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.makeTagTv), bool.booleanValue());
        View view2 = sleepStageChartFragment.getView();
        ViewExKt.setVisible(view2 != null ? view2.findViewById(R.id.tagResultLayout) : null, bool.booleanValue());
        sleepStageChartFragment.getViewModel().changeMakeSleepTagStatus(false);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final SleepStageChartViewModel getViewModel() {
        return (SleepStageChartViewModel) this.viewModel.getValue();
    }

    public final void initView() {
        I().setITouchListener(new DaySleepChartHelper.IDaySleepStageTouchListener() { // from class: com.huami.sleep.daysleep.sleepstagechart.ui.SleepStageChartFragment.initView.1
            @Override // com.huami.sleep.daysleep.sleepstagechart.helper.DaySleepChartHelper.IDaySleepStageTouchListener
            public void onDown(@Nullable Index i, @NotNull String dataType) {
                if (i == null) {
                    return;
                }
                SleepStageChartFragment sleepStageChartFragment = SleepStageChartFragment.this;
                if (i.getPosiIndex().getIndex() != -1) {
                    sleepStageChartFragment.getViewModel().selectChange(i, dataType);
                    View view = sleepStageChartFragment.getView();
                    ((LinearLayout) (view == null ? null : view.findViewById(R.id.selectInfoLL))).setBackgroundResource(R.drawable.slp_info_rect_tip_bg);
                    sleepStageChartFragment.K().slide(i.getCenterX());
                }
            }

            @Override // com.huami.sleep.daysleep.sleepstagechart.helper.DaySleepChartHelper.IDaySleepStageTouchListener
            public void onUp(@Nullable Index i, @NotNull String dataType) {
                SleepStageChartFragment.this.getViewModel().selectChange(Index.INVALID_INDEX, dataType);
                SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.SLP_POSITION_DRAG);
                SleepStageChartFragment.this.K().reset();
            }
        });
        View view = getView();
        ((SleepOverlayMenu) (view == null ? null : view.findViewById(R.id.overLayMenu))).setOnTypeSelectListener(new SleepOverlayMenu.OnTypeSelectedListener() { // from class: com.huami.sleep.daysleep.sleepstagechart.ui.SleepStageChartFragment.initView.2
            @Override // com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepOverlayMenu.OnTypeSelectedListener
            public void onTypeSelected(@NotNull String type) {
                SleepStageChartFragment.this.getViewModel().selectOverlayDataType(type);
            }
        });
        View view2 = getView();
        ((SleepTagEditCard) (view2 == null ? null : view2.findViewById(R.id.slpTagCard))).setSelectListener(new SleepTagEditCard.SleepEditListener() { // from class: com.huami.sleep.daysleep.sleepstagechart.ui.SleepStageChartFragment.initView.3
            @Override // com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepTagEditCard.SleepEditListener
            public void addNeWTag(@Nullable SleepTagDataVo info) {
                SleepStageChartFragment.this.getViewModel().setSelectTag(info);
            }

            @Override // com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepTagEditCard.SleepEditListener
            public void closeMakeTag() {
                SleepStageChartFragment.this.getViewModel().changeMakeSleepTagStatus(false);
            }

            @Override // com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepTagEditCard.SleepEditListener
            public void manualEditTag(@Nullable SleepTagDataVo info) {
                if (info == null) {
                    return;
                }
                SleepStageChartFragment.this.getViewModel().uploadSelfDefTagToWeb(new SleepTagInfo(info.getTag(), info.getTagType()));
            }
        });
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.makeTagTv))).setOnClickListener(new View.OnClickListener() { // from class: q17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                SleepStageChartFragment.L(this.a, view4);
            }
        });
        View view4 = getView();
        ((DragIntervalView) (view4 == null ? null : view4.findViewById(R.id.dragSelectV))).setDragCallback(new b());
        View view5 = getView();
        ((FrameLayout) (view5 != null ? view5.findViewById(R.id.hrChartLayout) : null)).setBackgroundColor(ViewExKt.addAlpha(ContextCompat.getColor(requireContext(), R.color.s38), 0.5d));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        r();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.fragment_sleep_stage_layout, container, false);
        Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) viewInflate;
    }
}
