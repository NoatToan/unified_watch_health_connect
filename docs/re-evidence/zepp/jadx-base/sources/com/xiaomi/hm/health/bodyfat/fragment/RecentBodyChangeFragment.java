package com.xiaomi.hm.health.bodyfat.fragment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.GoalLineStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.lib.view.text.UnitTextView;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.databinding.FragmentRecentBodyChangeBinding;
import com.xiaomi.hm.health.bodyfat.fragment.RecentBodyChangeFragment;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BodyFatTimeUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.viewmodel.BodyFatDetailsViewModel;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.utils.Utils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u0016\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u0018\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0012\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u0007H\u0002J$\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010,\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016J\u0006\u0010-\u001a\u00020\u0007R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00106\u001a\u0002028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u00103\u001a\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00107R\u001d\u0010<\u001a\u0002098B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b:\u0010;¨\u0006@"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/RecentBodyChangeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "weightInfos", "", hl.k, "lastWeightInfos", "", "f", "", "startTime", "endTime", "", "l", "timeInMil", "", GoogleApiAvailabilityLight.a, "", "infos", "Lcom/huami/chart/data/ChartDataList;", "b", "info", z.j, "e", "g", "Lcom/huami/chart/provider/RenderConfig;", "c", "up", "Lcom/huami/lib/view/text/UnitTextView;", "textView", "", GoogleApiAvailabilityLight.b, "bfChangeMonthValue", "Landroid/graphics/drawable/Drawable;", "i", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "getShareValue", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentRecentBodyChangeBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentRecentBodyChangeBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/BodyFatDetailsViewModel;", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/BodyFatDetailsViewModel;", "viewModel", "Lcom/huami/chart/data/ChartDataList;", "mChartData", "Lcom/huami/chart/chart/ChartProvider;", "h", "()Lcom/huami/chart/chart/ChartProvider;", "mChartProvider", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class RecentBodyChangeFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int TYPE_BODY_FAT = 18;
    public static final int TYPE_MUSCLE = 19;
    public static final int TYPE_WEIGHT = 17;

    @NotNull
    private static final String e = "typeKey";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FragmentRecentBodyChangeBinding binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ChartDataList mChartData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mChartProvider = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/RecentBodyChangeFragment$Companion;", "", "", "type", "Lcom/xiaomi/hm/health/bodyfat/fragment/RecentBodyChangeFragment;", "newInstance", "TYPE_BODY_FAT", LogUtil.I, "TYPE_MUSCLE", Utils.TYPE_WEIGHT, "", RecentBodyChangeFragment.e, "Ljava/lang/String;", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RecentBodyChangeFragment newInstance(int type) {
            Bundle bundle = new Bundle();
            bundle.putInt(RecentBodyChangeFragment.e, type);
            RecentBodyChangeFragment recentBodyChangeFragment = new RecentBodyChangeFragment();
            recentBodyChangeFragment.setArguments(bundle);
            return recentBodyChangeFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/chart/ChartProvider;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ChartProvider> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChartProvider getA() {
            return new ChartProvider(RecentBodyChangeFragment.this.getActivity(), true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/BodyFatDetailsViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<BodyFatDetailsViewModel> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BodyFatDetailsViewModel getA() {
            return (BodyFatDetailsViewModel) ViewModelProviders.of(RecentBodyChangeFragment.this.requireActivity()).get(BodyFatDetailsViewModel.class);
        }
    }

    private final ChartDataList b(List<? extends WeightInfos> infos) {
        SparseArray sparseArray = new SparseArray();
        int size = infos.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                sparseArray.put(i, new ChartData(i, j(infos.get(i))));
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return new ChartDataList(sparseArray, 0, infos.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RenderConfig c() {
        if (getActivity() == null || (getActivity() != null && requireActivity().isFinishing())) {
            return new RenderConfig.Builder().create();
        }
        int[] colors = com.xiaomi.hm.health.bodyfat.utils.Utils.INSTANCE.getColors(requireContext(), e());
        Float targetWeight = BFCallback.getHMPersonInfo().getTargetWeight();
        boolean z = targetWeight.floatValue() > 0.0f;
        RenderConfig.Builder lineStyle = new RenderConfig.Builder().setLineStyle(new LineStyle.Builder(getActivity()).setLineStyle(4).setLineColor(ContextCompat.getColor(requireContext(), g())).setLineWidth(ChartUtil.dp2px(getActivity(), 1.0f)).setShadowColors(colors).create());
        GoalLineStyle.Builder builder = new GoalLineStyle.Builder(getActivity());
        Bundle arguments = getArguments();
        return lineStyle.setGoalLineStyle(builder.setGoalLineStyle(((arguments != null && arguments.getInt(e) == 17) && z) ? 2 : 1).setGoalLineColor(new int[]{ContextCompat.getColor(requireContext(), R.color.s3)}).setGoalLineWidth(ChartUtil.dp2px(getActivity(), 1.0f)).setGoals(new float[]{targetWeight.floatValue()}).create()).create();
    }

    private final String d(long timeInMil) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeInMil);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return BodyFatTimeUtils.INSTANCE.formatDateYmd(activity, calendar.getTime());
    }

    private final int e() {
        Bundle arguments = getArguments();
        Object obj = arguments == null ? null : arguments.get(e);
        if (Intrinsics.areEqual(obj, (Object) 17)) {
            return R.array.weight_change_curve_colors;
        }
        if (Intrinsics.areEqual(obj, (Object) 18)) {
            return R.array.fat_change_curve_colors;
        }
        return Intrinsics.areEqual(obj, (Object) 19) ? R.array.weight_change_curve_colors : R.array.weight_change_curve_colors;
    }

    private final float f(WeightInfos weightInfos, WeightInfos lastWeightInfos) {
        float fFloatValue;
        float fFloatValue2;
        Bundle arguments = getArguments();
        Object obj = arguments == null ? null : arguments.get(e);
        if (Intrinsics.areEqual(obj, (Object) 17)) {
            fFloatValue = weightInfos.getWeight().floatValue();
            fFloatValue2 = lastWeightInfos.getWeight().floatValue();
        } else {
            if (Intrinsics.areEqual(obj, (Object) 18)) {
                return ((weightInfos.getBody_fat().floatValue() * weightInfos.getWeight().floatValue()) - (lastWeightInfos.getBody_fat().floatValue() * lastWeightInfos.getWeight().floatValue())) / 100;
            }
            if (!Intrinsics.areEqual(obj, (Object) 19)) {
                return 0.0f;
            }
            fFloatValue = weightInfos.getMuscle().floatValue();
            fFloatValue2 = lastWeightInfos.getMuscle().floatValue();
        }
        return fFloatValue - fFloatValue2;
    }

    private final int g() {
        Bundle arguments = getArguments();
        Object obj = arguments == null ? null : arguments.get(e);
        if (Intrinsics.areEqual(obj, (Object) 17)) {
            return R.color.bf3_list_health;
        }
        if (Intrinsics.areEqual(obj, (Object) 18)) {
            return R.color.tangerine;
        }
        return Intrinsics.areEqual(obj, (Object) 19) ? R.color.bf3_list_health : R.color.bf3_list_health;
    }

    private final ChartProvider h() {
        return (ChartProvider) this.mChartProvider.getValue();
    }

    private final Drawable i(float bfChangeMonthValue) {
        return bfChangeMonthValue > 0.0f ? ContextCompat.getDrawable(requireContext(), R.drawable.bf3_arrow_up) : ContextCompat.getDrawable(requireContext(), R.drawable.icon_arrow_down);
    }

    private final float j(WeightInfos info) {
        Bundle arguments = getArguments();
        Object obj = arguments == null ? null : arguments.get(e);
        if (Intrinsics.areEqual(obj, (Object) 17)) {
            return info.getWeight().floatValue();
        }
        if (Intrinsics.areEqual(obj, (Object) 18)) {
            return info.getBody_fat().floatValue();
        }
        return Intrinsics.areEqual(obj, (Object) 19) ? info.getMuscle().floatValue() : info.getWeight().floatValue();
    }

    private final boolean k(WeightInfos weightInfos) {
        Bundle arguments = getArguments();
        Object obj = arguments == null ? null : arguments.get(e);
        if (Intrinsics.areEqual(obj, (Object) 18)) {
            if (weightInfos.getBody_fat() != null) {
                return true;
            }
        } else if (Intrinsics.areEqual(obj, (Object) 19)) {
            if (weightInfos.getMuscle() != null) {
                Integer source = weightInfos.getSource();
                int value = HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue();
                if (source != null && source.intValue() == value) {
                    return true;
                }
            }
        } else if (weightInfos.getWeight() != null) {
            return true;
        }
        return false;
    }

    private final int l(long startTime, long endTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTime);
        SportDay sportDay = new SportDay(calendar);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(endTime);
        return sportDay.offsetDay(new SportDay(calendar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final RecentBodyChangeFragment recentBodyChangeFragment, WeightInfos weightInfos) {
        Object next;
        if (weightInfos == null || !recentBodyChangeFragment.k(weightInfos)) {
            FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding = recentBodyChangeFragment.binding;
            Objects.requireNonNull(fragmentRecentBodyChangeBinding);
            fragmentRecentBodyChangeBinding.layoutRootView.setVisibility(8);
            return;
        }
        List<WeightInfos> latestWeightInfos = recentBodyChangeFragment.getViewModel().getLatestWeightInfos(weightInfos.getTimestamp().longValue());
        if (latestWeightInfos.isEmpty()) {
            FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding2 = recentBodyChangeFragment.binding;
            Objects.requireNonNull(fragmentRecentBodyChangeBinding2);
            fragmentRecentBodyChangeBinding2.layoutRootView.setVisibility(8);
            return;
        }
        WeightInfos weightInfos2 = (WeightInfos) CollectionsKt.last((List) latestWeightInfos);
        WeightInfos weightInfos3 = (WeightInfos) CollectionsKt.first((List) latestWeightInfos);
        int iL = recentBodyChangeFragment.l(weightInfos2.getTimestamp().longValue(), weightInfos.getTimestamp().longValue());
        if (iL == 0) {
            FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding3 = recentBodyChangeFragment.binding;
            Objects.requireNonNull(fragmentRecentBodyChangeBinding3);
            fragmentRecentBodyChangeBinding3.layoutRootView.setVisibility(8);
            return;
        }
        FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding4 = recentBodyChangeFragment.binding;
        Objects.requireNonNull(fragmentRecentBodyChangeBinding4);
        fragmentRecentBodyChangeBinding4.layoutRootView.setVisibility(0);
        FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding5 = recentBodyChangeFragment.binding;
        Objects.requireNonNull(fragmentRecentBodyChangeBinding5);
        fragmentRecentBodyChangeBinding5.bodyChartStartDate.setText(recentBodyChangeFragment.d(weightInfos2.getTimestamp().longValue()));
        FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding6 = recentBodyChangeFragment.binding;
        Objects.requireNonNull(fragmentRecentBodyChangeBinding6);
        fragmentRecentBodyChangeBinding6.bodyChartEndDate.setText(recentBodyChangeFragment.d(weightInfos3.getTimestamp().longValue()));
        recentBodyChangeFragment.mChartData = recentBodyChangeFragment.b(CollectionsKt___CollectionsKt.reversed(latestWeightInfos));
        recentBodyChangeFragment.h().createChart(new ChartProvider.StatisChartProvider() { // from class: com.xiaomi.hm.health.bodyfat.fragment.RecentBodyChangeFragment$onViewCreated$1$1
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer */
            public ViewGroup getA() {
                FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding7 = this.a.binding;
                Objects.requireNonNull(fragmentRecentBodyChangeBinding7);
                return fragmentRecentBodyChangeBinding7.bodyChangeChartContainer;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList */
            public ChartDataList getB() {
                return this.a.mChartData;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                DrawConfig.Builder builder = new DrawConfig.Builder(this.a.getActivity());
                FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding7 = this.a.binding;
                Objects.requireNonNull(fragmentRecentBodyChangeBinding7);
                DrawConfig.Builder dataMarginTop = builder.setCanvasHeight(fragmentRecentBodyChangeBinding7.bodyChangeChartContainer.getMeasuredHeight()).setDataMarginBottom(this.a.getResources().getDimension(R.dimen.fat_change_chart_margin_bottom)).setDataMarginTop(this.a.getResources().getDimension(R.dimen.fat_change_chart_margin_top));
                FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding8 = this.a.binding;
                Objects.requireNonNull(fragmentRecentBodyChangeBinding8);
                return dataMarginTop.setCanvasWidth(fragmentRecentBodyChangeBinding8.bodyChangeChartContainer.getMeasuredWidth()).create();
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                return this.a.c();
            }
        }, false, false);
        float f = recentBodyChangeFragment.f(weightInfos, weightInfos2);
        int iSuitableWeightUnit = HMWeightUtils.suitableWeightUnit(Math.abs(f));
        FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding7 = recentBodyChangeFragment.binding;
        Objects.requireNonNull(fragmentRecentBodyChangeBinding7);
        fragmentRecentBodyChangeBinding7.bodyChangeMonUv.setValues(HMWeightUtils.getWeightValueStringForDisplay(Math.abs(f), iSuitableWeightUnit), BFCallback.getUnitManager().getWeightUnitString(iSuitableWeightUnit));
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            boolean z = f > 0.0f;
            FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding8 = recentBodyChangeFragment.binding;
            Objects.requireNonNull(fragmentRecentBodyChangeBinding8);
            recentBodyChangeFragment.n(z, fragmentRecentBodyChangeBinding8.bodyChangeMonUv);
        }
        String quantityString = recentBodyChangeFragment.getResources().getQuantityString(R.plurals.bf3_compare_last_mon, Math.abs(iL), Integer.valueOf(Math.abs(iL)));
        FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding9 = recentBodyChangeFragment.binding;
        Objects.requireNonNull(fragmentRecentBodyChangeBinding9);
        fragmentRecentBodyChangeBinding9.bodyChangeMonNavDate.setText(quantityString);
        FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding10 = recentBodyChangeFragment.binding;
        Objects.requireNonNull(fragmentRecentBodyChangeBinding10);
        fragmentRecentBodyChangeBinding10.bodyChangeMonNavDate.append(" (" + ((Object) recentBodyChangeFragment.d(weightInfos2.getTimestamp().longValue())) + ')');
        FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding11 = recentBodyChangeFragment.binding;
        Objects.requireNonNull(fragmentRecentBodyChangeBinding11);
        fragmentRecentBodyChangeBinding11.bodyChangeMonNavDate.setCompoundDrawablesRelativeWithIntrinsicBounds(recentBodyChangeFragment.i(f), (Drawable) null, (Drawable) null, (Drawable) null);
        Iterator<T> it2 = latestWeightInfos.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(((WeightInfos) next).getTimestamp().longValue() < weightInfos.getTimestamp().longValue()));
        WeightInfos weightInfos4 = (WeightInfos) next;
        if (weightInfos4 != null) {
            float f2 = recentBodyChangeFragment.f(weightInfos, weightInfos4);
            int iSuitableWeightUnit2 = HMWeightUtils.suitableWeightUnit(Math.abs(f2));
            String weightValueStringForDisplay = HMWeightUtils.getWeightValueStringForDisplay(Math.abs(f2), iSuitableWeightUnit2);
            FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding12 = recentBodyChangeFragment.binding;
            Objects.requireNonNull(fragmentRecentBodyChangeBinding12);
            fragmentRecentBodyChangeBinding12.bodyChangeLastUv.setValue(weightValueStringForDisplay, BFCallback.getUnitManager().getWeightUnitString(iSuitableWeightUnit2));
            FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding13 = recentBodyChangeFragment.binding;
            Objects.requireNonNull(fragmentRecentBodyChangeBinding13);
            fragmentRecentBodyChangeBinding13.bodyChangeLastUv.setTag(Float.valueOf(f2));
            if (BFCallback.getInstance().enableMiDongFlavor()) {
                boolean z2 = f2 > 0.0f;
                FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding14 = recentBodyChangeFragment.binding;
                Objects.requireNonNull(fragmentRecentBodyChangeBinding14);
                recentBodyChangeFragment.n(z2, fragmentRecentBodyChangeBinding14.bodyChangeLastUv);
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(recentBodyChangeFragment.getResources().getString(R.string.bf3_compare_last), Arrays.copyOf(new Object[]{recentBodyChangeFragment.d(weightInfos4.getTimestamp().longValue())}, 1));
            FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding15 = recentBodyChangeFragment.binding;
            Objects.requireNonNull(fragmentRecentBodyChangeBinding15);
            fragmentRecentBodyChangeBinding15.bodyChangeLastDate.setText(str);
            FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding16 = recentBodyChangeFragment.binding;
            Objects.requireNonNull(fragmentRecentBodyChangeBinding16);
            fragmentRecentBodyChangeBinding16.bodyChangeLastDate.setCompoundDrawablesRelativeWithIntrinsicBounds(recentBodyChangeFragment.i(f2), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    private final void n(boolean up, UnitTextView textView) {
        if (up) {
            textView.setColor(ContextCompat.getColor(requireActivity(), R.color.p4));
        } else {
            textView.setColor(ContextCompat.getColor(requireContext(), R.color.s20));
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final float getShareValue() {
        FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding = this.binding;
        Objects.requireNonNull(fragmentRecentBodyChangeBinding);
        if (fragmentRecentBodyChangeBinding.bodyChangeLastUv.getTag() == null) {
            return 0.0f;
        }
        FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding2 = this.binding;
        Objects.requireNonNull(fragmentRecentBodyChangeBinding2);
        Object tag = fragmentRecentBodyChangeBinding2.bodyChangeLastUv.getTag();
        Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) tag).floatValue();
    }

    @NotNull
    public final BodyFatDetailsViewModel getViewModel() {
        return (BodyFatDetailsViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBindingInflate = FragmentRecentBodyChangeBinding.inflate(inflater);
        this.binding = fragmentRecentBodyChangeBindingInflate;
        Objects.requireNonNull(fragmentRecentBodyChangeBindingInflate);
        return fragmentRecentBodyChangeBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        Object obj = arguments == null ? null : arguments.get(e);
        if (Intrinsics.areEqual(obj, (Object) 17)) {
            FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding = this.binding;
            Objects.requireNonNull(fragmentRecentBodyChangeBinding);
            fragmentRecentBodyChangeBinding.titleBodyChange.setText(getString(R.string.bf3_weight_change_mon));
        } else if (Intrinsics.areEqual(obj, (Object) 18)) {
            FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding2 = this.binding;
            Objects.requireNonNull(fragmentRecentBodyChangeBinding2);
            fragmentRecentBodyChangeBinding2.titleBodyChange.setText(getString(R.string.bf3_bf_change_mon));
        } else if (Intrinsics.areEqual(obj, (Object) 19)) {
            FragmentRecentBodyChangeBinding fragmentRecentBodyChangeBinding3 = this.binding;
            Objects.requireNonNull(fragmentRecentBodyChangeBinding3);
            fragmentRecentBodyChangeBinding3.titleBodyChange.setText(getString(R.string.recent_change_of_muscle));
        }
        getViewModel().getSelectWeightInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: e76
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj2) {
                RecentBodyChangeFragment.m(this.a, (WeightInfos) obj2);
            }
        });
    }
}
