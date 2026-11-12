package com.huami.bloodoxygen.ui.business;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bigdata.statistics.bloodoxygen.BloodOxygenStatistics;
import com.huami.bloodoxygen.core.koin.BloodOxygenKoinScopeKt;
import com.huami.bloodoxygen.core.utils.BloodOxygenUtils;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.activity.AddClickSpo2ManuallyActivity;
import com.huami.bloodoxygen.ui.activity.ClickSpo2HistoryActivity;
import com.huami.bloodoxygen.ui.business.BloodOxygenDetailFragment;
import com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailViewModel;
import com.huami.bloodoxygen.ui.databinding.BoUiLayoutDetailFragmentBinding;
import com.huami.bloodoxygen.ui.dto.TimeMode;
import com.huami.bloodoxygen.ui.utils.ChartDataHelper;
import com.huami.bloodoxygen.ui.utils.ExtensionsKt;
import com.huami.bloodoxygen.ui.utils.TimeUtils;
import com.huami.bloodoxygen.ui.view.BloodOxygenCardView;
import com.huami.bloodoxygen.ui.vo.ChartParams;
import com.huami.bloodoxygen.ui.vo.DetailUIConfig;
import com.huami.bodymeasurements.common.ext.ViewExKt;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J3\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0019\u0010\u000f\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u001a\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016R\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u00102\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/huami/bloodoxygen/ui/business/BloodOxygenDetailFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "l", "", "index", "min", "max", "e", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/widget/TextView;", "textView", "value", "r", "o", "(Ljava/lang/Integer;)V", "", "g", com.google.android.exoplayer2.text.ttml.b.r, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/bloodoxygen/ui/databinding/BoUiLayoutDetailFragmentBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "i", "()Lcom/huami/bloodoxygen/ui/databinding/BoUiLayoutDetailFragmentBinding;", "viewBinding", "Lcom/huami/bloodoxygen/ui/dto/TimeMode;", "b", "Lcom/huami/bloodoxygen/ui/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "c", "Ljava/lang/Long;", "timeStamp", "Lcom/huami/bloodoxygen/ui/business/viewmodel/BloodOxygenDetailViewModel;", GoogleApiAvailabilityLight.a, "Lcom/huami/bloodoxygen/ui/business/viewmodel/BloodOxygenDetailViewModel;", "viewModel", "Lcom/huami/bloodoxygen/ui/vo/DetailUIConfig;", "Lkotlin/Lazy;", "h", "()Lcom/huami/bloodoxygen/ui/vo/DetailUIConfig;", "detailUIConfig", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public class BloodOxygenDetailFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] f;

    @NotNull
    private static final String g = "time_mode";

    @NotNull
    private static final String h = "time";
    private static final String i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private TimeMode timeMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Long timeStamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private BloodOxygenDetailViewModel viewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy detailUIConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R!\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/huami/bloodoxygen/ui/business/BloodOxygenDetailFragment$Companion;", "", "Lcom/huami/bloodoxygen/ui/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "time", "Lcom/huami/bloodoxygen/ui/business/BloodOxygenDetailFragment;", "getInstance", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "ARGS_TIME", "ARGS_TIME_MODE", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BloodOxygenDetailFragment getInstance(@NotNull TimeMode timeMode, long time) {
            BloodOxygenDetailFragment bloodOxygenDetailFragment = new BloodOxygenDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putString("time_mode", timeMode.name());
            bundle.putLong("time", time);
            Unit unit = Unit.INSTANCE;
            bloodOxygenDetailFragment.setArguments(bundle);
            return bloodOxygenDetailFragment;
        }

        public final String getTAG() {
            return BloodOxygenDetailFragment.i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.YEAR.ordinal()] = 1;
            iArr[TimeMode.MONTH.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodoxygen/ui/vo/DetailUIConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<DetailUIConfig> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DetailUIConfig invoke() {
            return (DetailUIConfig) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(DetailUIConfig.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "index", "", "min", "max", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function3<Integer, Float, Float, Unit> {
        public b() {
            super(3);
        }

        public final void a(int i, @Nullable Float f, @Nullable Float f2) {
            if (BloodOxygenDetailFragment.this.getContext() == null) {
                return;
            }
            BloodOxygenDetailFragment.this.e(Integer.valueOf(i), f == null ? null : Integer.valueOf((int) f.floatValue()), f2 != null ? Integer.valueOf((int) f2.floatValue()) : null);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Float f, Float f2) {
            a(num.intValue(), f, f2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/androidx/viewmodel/ViewModelOwner;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<ViewModelOwner> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelOwner invoke() {
            ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
            BloodOxygenDetailFragment bloodOxygenDetailFragment = BloodOxygenDetailFragment.this;
            return companion.from(bloodOxygenDetailFragment, bloodOxygenDetailFragment);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<ParametersHolder> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(BloodOxygenDetailFragment.this.timeMode);
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BloodOxygenDetailFragment.class), "viewBinding", "getViewBinding()Lcom/huami/bloodoxygen/ui/databinding/BoUiLayoutDetailFragmentBinding;"));
        f = kPropertyArr;
        Companion companion = new Companion(null);
        INSTANCE = companion;
        i = companion.getClass().getSimpleName();
    }

    public BloodOxygenDetailFragment() {
        super(R.layout.bo_ui_layout_detail_fragment);
        this.viewBinding = FragmentViewBindingKt.viewBinding(new BloodOxygenDetailFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(BoUiLayoutDetailFragmentBinding.class)));
        this.detailUIConfig = LazyKt__LazyJVMKt.lazy(a.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Integer index, Integer min, Integer max) {
        BoUiLayoutDetailFragmentBinding boUiLayoutDetailFragmentBindingI = i();
        o(index);
        boolean z = (min == null && max == null) ? false : true;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(boUiLayoutDetailFragmentBindingI.valueContainer);
        constraintSet.connect(boUiLayoutDetailFragmentBindingI.rangeStart.getId(), 7, boUiLayoutDetailFragmentBindingI.rangeSign.getId(), 6, 0);
        if (!z) {
            constraintSet.applyTo(boUiLayoutDetailFragmentBindingI.valueContainer);
            ViewExKt.setVisible(boUiLayoutDetailFragmentBindingI.rangeStart, false);
            ViewExKt.setVisible(boUiLayoutDetailFragmentBindingI.rangeEnd, false);
            boUiLayoutDetailFragmentBindingI.rangeSign.setVisibility(0);
            TypefaceTextView typefaceTextView = boUiLayoutDetailFragmentBindingI.rangeSign;
            typefaceTextView.setText(getString(R.string.bo_ui_value_invalid));
            typefaceTextView.setTextColor(ContextCompat.getColor(requireContext(), R.color.s1));
            return;
        }
        if (!Intrinsics.areEqual(min, max)) {
            constraintSet.applyTo(boUiLayoutDetailFragmentBindingI.valueContainer);
            ViewExKt.setVisible(boUiLayoutDetailFragmentBindingI.rangeStart, true);
            ViewExKt.setVisible(boUiLayoutDetailFragmentBindingI.rangeEnd, true);
            boUiLayoutDetailFragmentBindingI.rangeSign.setVisibility(0);
            boUiLayoutDetailFragmentBindingI.rangeSign.setText(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            r(boUiLayoutDetailFragmentBindingI.rangeStart, min.intValue());
            r(boUiLayoutDetailFragmentBindingI.rangeEnd, max.intValue());
            return;
        }
        ConstraintSet constraintSet2 = new ConstraintSet();
        constraintSet2.clone(boUiLayoutDetailFragmentBindingI.valueContainer);
        constraintSet2.connect(boUiLayoutDetailFragmentBindingI.rangeStart.getId(), 7, boUiLayoutDetailFragmentBindingI.valueContainer.getId(), 7, 0);
        constraintSet2.applyTo(boUiLayoutDetailFragmentBindingI.valueContainer);
        ViewExKt.setVisible(boUiLayoutDetailFragmentBindingI.rangeStart, true);
        ViewExKt.setVisible(boUiLayoutDetailFragmentBindingI.rangeEnd, false);
        boUiLayoutDetailFragmentBindingI.rangeSign.setVisibility(8);
        r(boUiLayoutDetailFragmentBindingI.rangeStart, min.intValue());
    }

    public static /* synthetic */ void f(BloodOxygenDetailFragment bloodOxygenDetailFragment, Integer num, Integer num2, Integer num3, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: displayRange");
        }
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 2) != 0) {
            num2 = null;
        }
        if ((i2 & 4) != 0) {
            num3 = null;
        }
        bloodOxygenDetailFragment.e(num, num2, num3);
    }

    private final String g() {
        return TimeUtils.INSTANCE.isSameYear(requireContext(), this.timeStamp.longValue(), System.currentTimeMillis()) ? HMDataFormatKt.getFormatTime$default(new Date(this.timeStamp.longValue()), HMPattern.ABBR_MONTH_DAY, (Locale) null, 2, (Object) null) : HMDataFormatKt.getFormatTime$default(new Date(this.timeStamp.longValue()), HMPattern.YEAR_ABBR_MONTH_DAY, (Locale) null, 2, (Object) null);
    }

    private final DetailUIConfig h() {
        return (DetailUIConfig) this.detailUIConfig.getValue();
    }

    private final BoUiLayoutDetailFragmentBinding i() {
        return (BoUiLayoutDetailFragmentBinding) this.viewBinding.getValue(this, f[0]);
    }

    private final void initView() {
        BoUiLayoutDetailFragmentBinding boUiLayoutDetailFragmentBindingI = i();
        boUiLayoutDetailFragmentBindingI.statisticsView.setTimeMode(this.timeMode);
        BloodOxygenCardView bloodOxygenCardView = boUiLayoutDetailFragmentBindingI.historyData;
        ViewExKt.setVisible(bloodOxygenCardView, true);
        bloodOxygenCardView.setOnClickListener(new View.OnClickListener() { // from class: zy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodOxygenDetailFragment.j(this.a, view);
            }
        });
        BloodOxygenCardView bloodOxygenCardView2 = boUiLayoutDetailFragmentBindingI.addData;
        ViewExKt.setVisible(bloodOxygenCardView2, h().getShowAddEntrance());
        bloodOxygenCardView2.setOnClickListener(new View.OnClickListener() { // from class: yy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodOxygenDetailFragment.k(this.a, view);
            }
        });
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(BloodOxygenDetailFragment bloodOxygenDetailFragment, View view) {
        ClickSpo2HistoryActivity.INSTANCE.launch(bloodOxygenDetailFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(BloodOxygenDetailFragment bloodOxygenDetailFragment, View view) {
        AddClickSpo2ManuallyActivity.INSTANCE.launch(bloodOxygenDetailFragment.requireActivity());
    }

    private final void l() {
        BloodOxygenDetailViewModel bloodOxygenDetailViewModel = this.viewModel;
        Objects.requireNonNull(bloodOxygenDetailViewModel);
        bloodOxygenDetailViewModel.getChartBuilderLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: bz
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodOxygenDetailFragment.m(this.a, (ChartParams) obj);
            }
        });
        bloodOxygenDetailViewModel.getStatisticsLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: az
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodOxygenDetailFragment.n(this.a, (BloodOxygenStatistics) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(BloodOxygenDetailFragment bloodOxygenDetailFragment, ChartParams chartParams) {
        bloodOxygenDetailFragment.i().chart.refresh(chartParams, bloodOxygenDetailFragment.new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(BloodOxygenDetailFragment bloodOxygenDetailFragment, BloodOxygenStatistics bloodOxygenStatistics) {
        bloodOxygenDetailFragment.i().statisticsView.setStaticsInfo(bloodOxygenStatistics);
    }

    private final void o(Integer index) {
        String formatTime$default;
        if (index == null) {
            p();
            return;
        }
        if (this.timeMode != TimeMode.DAY) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.timeStamp.longValue());
            ViewExKt.setVisible(i().timeLayout, false);
            TextView textView = i().date;
            TimeMode timeMode = this.timeMode;
            if ((timeMode != null ? WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()] : -1) == 1) {
                calendar.add(2, index.intValue());
                Unit unit = Unit.INSTANCE;
                formatTime$default = HMDataFormatKt.getFormatTime$default(calendar.getTime(), HMPattern.YEAR_ABBR_MONTH, (Locale) null, 2, (Object) null);
            } else {
                calendar.add(6, index.intValue());
                formatTime$default = TimeUtils.INSTANCE.isSameYear(requireContext(), calendar.getTimeInMillis(), System.currentTimeMillis()) ? HMDataFormatKt.getFormatTime$default(calendar.getTime(), HMPattern.ABBR_MONTH_DAY, (Locale) null, 2, (Object) null) : HMDataFormatKt.getFormatTime$default(calendar.getTime(), HMPattern.YEAR_ABBR_MONTH_DAY, (Locale) null, 2, (Object) null);
            }
            textView.setText(formatTime$default);
            return;
        }
        Calendar calendar2 = Calendar.getInstance();
        TimeUtils timeUtils = TimeUtils.INSTANCE;
        calendar2.setTimeInMillis(timeUtils.getEtcDayZeroTime());
        calendar2.add(11, index.intValue());
        ViewExKt.setVisible(i().timeLayout, true);
        String timeHMInEtc = timeUtils.formatTimeHMInEtc(requireContext(), calendar2.getTimeInMillis());
        Context contextRequireContext = requireContext();
        calendar2.add(11, 1);
        if (index.intValue() == 23) {
            calendar2.add(14, -1);
        }
        Unit unit2 = Unit.INSTANCE;
        String timeHMInEtc2 = timeUtils.formatTimeHMInEtc(contextRequireContext, calendar2.getTimeInMillis());
        i().date.setText(g());
        i().timeStart.setText(timeHMInEtc);
        i().timeEnd.setText(timeHMInEtc2);
    }

    private final void p() {
        String formatTime$default;
        TimeUtils timeUtils = TimeUtils.INSTANCE;
        boolean zIsSameYear = timeUtils.isSameYear(requireContext(), this.timeStamp.longValue(), System.currentTimeMillis());
        if (this.timeMode == TimeMode.WEEK) {
            ViewExKt.setVisible(i().timeLayout, true);
            i().timeStart.setText(HMDataFormatKt.getFormatTime$default(new Date(timeUtils.getFirstDayOfWeekTime(this.timeStamp.longValue())), HMPattern.ABBR_MONTH_DAY, (Locale) null, 2, (Object) null));
            i().timeEnd.setText(q(zIsSameYear, timeUtils.getLastDayOfWeekTime(this.timeStamp.longValue())));
            return;
        }
        ViewExKt.setVisible(i().timeLayout, false);
        TextView textView = i().date;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.timeMode.ordinal()];
        if (i2 == 1) {
            formatTime$default = HMDataFormatKt.getFormatTime$default(new Date(this.timeStamp.longValue()), HMPattern.YEAR, (Locale) null, 2, (Object) null);
        } else if (i2 != 2) {
            formatTime$default = g();
        } else {
            formatTime$default = HMDataFormatKt.getFormatTime$default(new Date(this.timeStamp.longValue()), zIsSameYear ? HMPattern.MONTH : HMPattern.YEAR_ABBR_MONTH, (Locale) null, 2, (Object) null);
        }
        textView.setText(formatTime$default);
    }

    private static final String q(boolean z, long j) {
        return HMDataFormatKt.getFormatTime$default(new Date(j), z ? HMPattern.ABBR_MONTH_DAY : HMPattern.YEAR_ABBR_MONTH_DAY, (Locale) null, 2, (Object) null);
    }

    private final void r(TextView textView, int value) {
        String valuePerCent$ui_release = ChartDataHelper.INSTANCE.toValuePerCent$ui_release(value, requireContext());
        SpannableString spannableString = new SpannableString(valuePerCent$ui_release);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) valuePerCent$ui_release, "%", 0, false, 6, (Object) null);
        int i2 = iIndexOf$default + 1;
        spannableString.setSpan(new AbsoluteSizeSpan((int) ExtensionsKt.sp2Px(14)), iIndexOf$default, i2, 18);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(requireContext(), R.color.s2)), iIndexOf$default, i2, 18);
        Unit unit = Unit.INSTANCE;
        textView.setText(spannableString);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        String string = arguments.getString("time_mode");
        if (string != null) {
            this.timeMode = TimeMode.valueOf(string);
        }
        this.timeStamp = Long.valueOf(BloodOxygenUtils.INSTANCE.getZeroTimeInMillis(arguments.getLong("time")));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (this.timeMode == null || this.timeStamp == null) {
            return;
        }
        this.viewModel = (BloodOxygenDetailViewModel) ScopeExtKt.getViewModel$default(BloodOxygenKoinScopeKt.getBloodOxygenKoinScope(), null, new c(), Reflection.getOrCreateKotlinClass(BloodOxygenDetailViewModel.class), null, new d(), 8, null);
        initView();
        f(this, null, null, null, 7, null);
        BloodOxygenDetailViewModel bloodOxygenDetailViewModel = this.viewModel;
        Objects.requireNonNull(bloodOxygenDetailViewModel);
        bloodOxygenDetailViewModel.load(requireContext(), this.timeStamp.longValue());
        l();
    }
}
