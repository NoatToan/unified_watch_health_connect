package com.huami.heartrate.ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.timepicker.TimeModel;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.RangeIndex;
import com.huami.chart.util.Index;
import com.huami.health.afppg.model.AtrialFibrillationEventDay;
import com.huami.heartrate.R;
import com.huami.heartrate.atrialfib.AtrialUtils;
import com.huami.heartrate.chart.HRChartHelper;
import com.huami.heartrate.chart.HRChartHelperKt;
import com.huami.heartrate.chart.HandleDataKt;
import com.huami.heartrate.chart.model.HRDayChartData;
import com.huami.heartrate.constant.ConstantKt;
import com.huami.heartrate.databinding.HeartRateFragmentDetailBinding;
import com.huami.heartrate.koin.KoinExtKt;
import com.huami.heartrate.model.UserOfHeartRate;
import com.huami.heartrate.ui.HeartRateDayDetailFragment;
import com.huami.heartrate.utils.ExtensionUtilsKt;
import com.huami.heartrate.utils.HeartRateTimeUtils;
import com.huami.heartrate.utils.HeartRateTimeUtilsKt;
import com.huami.heartrate.viewmodel.AtrialFibViewModel;
import com.huami.heartrate.viewmodel.LocalHRDataViewModel;
import com.huami.heartrate.viewmodel.UserInfoViewModel;
import com.huami.heartrate.vo.LineChartVo;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.widget.typeface.TypefaceTextView;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 K2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\bI\u0010JJ6\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0002J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0018\u0010\u0012\u001a\u00020\u0004*\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J \u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u001e\u0010!\u001a\u00020\u0004*\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010 \u001a\u00020\u001dH\u0002J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u0007H\u0002J\"\u0010\u001c\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u0007H\u0002J\b\u0010%\u001a\u00020\nH\u0002J&\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016R\u001d\u00104\u001a\u0002008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u001d\u0010:\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010>\u001a\u00020;8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b<\u0010=R\u001d\u0010A\u001a\u00020?8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b6\u0010@R\u001d\u0010F\u001a\u00020B8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00107\u001a\u0004\bD\u0010ER\u001f\u0010H\u001a\u0004\u0018\u00010\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00107\u001a\u0004\bC\u0010G¨\u0006L"}, d2 = {"Lcom/huami/heartrate/ui/HeartRateDayDetailFragment;", "Lcom/huami/heartrate/ui/HeartRateBaseFragment;", "Lcom/huami/chart/data/ChartData;", "data", "", "isTouchValue", "isLastPositionValid", "", "currentIndex", "isEndIndex", "", "r", "index", "isLastPosition", "", "b", "Ljava/util/Calendar;", "other", "o", GoogleApiAvailabilityLight.a, "dateFrom", "l", "Lcom/huami/heartrate/vo/LineChartVo;", "lineChartVo", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/huami/chart/chart/HMChart;", "chart", "Lcom/huami/chart/util/Index;", "i", "Lcom/huami/chart/data/ChartDataList;", "chartDataList", "t", "dataList", hl.k, "currentPosition", GoogleApiAvailabilityLight.b, "range", DTransferConstants.SEARCH_KEY, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/heartrate/databinding/HeartRateFragmentDetailBinding;", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "h", "()Lcom/huami/heartrate/databinding/HeartRateFragmentDetailBinding;", "viewBinding", "Lcom/huami/heartrate/viewmodel/UserInfoViewModel;", "c", "Lkotlin/Lazy;", "g", "()Lcom/huami/heartrate/viewmodel/UserInfoViewModel;", "userInfoViewModel", "Lcom/huami/heartrate/viewmodel/LocalHRDataViewModel;", "e", "()Lcom/huami/heartrate/viewmodel/LocalHRDataViewModel;", "localHRDataVM", "Lcom/huami/heartrate/viewmodel/AtrialFibViewModel;", "()Lcom/huami/heartrate/viewmodel/AtrialFibViewModel;", "atrialFibViewModel", "", "f", "getUserId", "()Ljava/lang/String;", "userId", "()Ljava/util/Calendar;", "syncTimeCalendar", "<init>", "()V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateDayDetailFragment extends HeartRateBaseFragment {
    public static final /* synthetic */ KProperty<Object>[] h;

    @NotNull
    private static final String i = "HRDayDetailFragment";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding = FragmentViewBindingKt.viewBinding(new HeartRateDayDetailFragment$special$$inlined$viewBinding$1(new InflateViewBinder(HeartRateFragmentDetailBinding.class)));

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy userInfoViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UserInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.HeartRateDayDetailFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.heartrate.ui.HeartRateDayDetailFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.requireActivity().getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy localHRDataVM;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy atrialFibViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncTimeCalendar;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "wholeDayHrChartData", "Lcom/huami/health/afppg/model/AtrialFibrillationEventDay;", "abnormalHrData", "Lcom/huami/heartrate/vo/LineChartVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<SparseArray<ChartData>, AtrialFibrillationEventDay, LineChartVo> {
        public final /* synthetic */ Calendar a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Calendar calendar) {
            super(2);
            this.a = calendar;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LineChartVo invoke(@Nullable SparseArray<ChartData> sparseArray, @Nullable AtrialFibrillationEventDay atrialFibrillationEventDay) {
            if (sparseArray == null) {
                sparseArray = new SparseArray<>(0);
            }
            return new LineChartVo(sparseArray, AtrialUtils.INSTANCE.atrialFibrillationItemToRange(this.a, atrialFibrillationEventDay == null ? null : atrialFibrillationEventDay.getAtrialFibrillationList()), null, 0.0f, null, null, null, 124, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "i", "Lcom/huami/chart/chart/HMChart;", "chart", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Index, HMChart, Unit> {
        public final /* synthetic */ ChartDataList b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Index a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Index index) {
                super(0);
                this.a = index;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "chart onDown " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ChartDataList chartDataList) {
            super(2);
            this.b = chartDataList;
        }

        public final void a(@NotNull Index index, @NotNull HMChart hMChart) {
            HMLog.debug(HeartRateDayDetailFragment.i, new a(index));
            HeartRateDayDetailFragment.this.t(hMChart, index, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Index index, HMChart hMChart) {
            a(index, hMChart);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public static final c a = new c();

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
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Ljava/util/Calendar;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Calendar> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Calendar getA() {
            return KoinExtKt.getHeartRateDataDelegate().getSyncTime();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            String userId;
            UserOfHeartRate value = HeartRateDayDetailFragment.this.g().getUserInfoLiveData().getValue();
            return (value == null || (userId = value.getUserId()) == null) ? "" : userId;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[6];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HeartRateDayDetailFragment.class), "viewBinding", "getViewBinding()Lcom/huami/heartrate/databinding/HeartRateFragmentDetailBinding;"));
        h = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    public HeartRateDayDetailFragment() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.huami.heartrate.ui.HeartRateDayDetailFragment$localHRDataVM$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                final HeartRateDayDetailFragment heartRateDayDetailFragment = this.a;
                return new ViewModelProvider.Factory() { // from class: com.huami.heartrate.ui.HeartRateDayDetailFragment$localHRDataVM$2.1
                    @Override // androidx.lifecycle.ViewModelProvider.Factory
                    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
                        return new LocalHRDataViewModel(heartRateDayDetailFragment.getUserId());
                    }
                };
            }
        };
        final Function0<Fragment> function1 = new Function0<Fragment>() { // from class: com.huami.heartrate.ui.HeartRateDayDetailFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Fragment getA() {
                return this;
            }
        };
        this.localHRDataVM = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(LocalHRDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.HeartRateDayDetailFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return ((ViewModelStoreOwner) function1.getA()).getViewModelStore();
            }
        }, function0);
        final Function0<Fragment> function2 = new Function0<Fragment>() { // from class: com.huami.heartrate.ui.HeartRateDayDetailFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Fragment getA() {
                return this;
            }
        };
        this.atrialFibViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AtrialFibViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.HeartRateDayDetailFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return ((ViewModelStoreOwner) function2.getA()).getViewModelStore();
            }
        }, null);
        this.userId = LazyKt__LazyJVMKt.lazy(new e());
        this.syncTimeCalendar = LazyKt__LazyJVMKt.lazy(d.a);
    }

    private final long b(int index, boolean isLastPosition, boolean isEndIndex) {
        long timeByIndex = HeartRateTimeUtils.INSTANCE.getTimeByIndex(getStartTime(), index);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeByIndex);
        if (f() != null && o(f(), calendar) && isLastPosition) {
            return d();
        }
        if (!isEndIndex) {
            return timeByIndex;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(getStartTime());
        calendar2.add(6, 1);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.add(12, -1);
        return calendar2.getTimeInMillis();
    }

    private final AtrialFibViewModel c() {
        return (AtrialFibViewModel) this.atrialFibViewModel.getValue();
    }

    private final long d() {
        byte[] value = e().getHrMergedDataLiveData().getValue();
        return value == null ? f().getTimeInMillis() : HeartRateTimeUtils.INSTANCE.getTimeByPosition(getStartTime(), HandleDataKt.findLastValidHeartRateIndex(value));
    }

    private final LocalHRDataViewModel e() {
        return (LocalHRDataViewModel) this.localHRDataVM.getValue();
    }

    private final Calendar f() {
        return (Calendar) this.syncTimeCalendar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserInfoViewModel g() {
        return (UserInfoViewModel) this.userInfoViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserId() {
        return (String) this.userId.getValue();
    }

    private final HeartRateFragmentDetailBinding h() {
        return (HeartRateFragmentDetailBinding) this.viewBinding.getValue(this, h[0]);
    }

    private final boolean i(ChartDataList dataList, int currentPosition, int range) {
        Integer num;
        Integer next;
        int iMax = Math.max(dataList.getStart(), currentPosition - range);
        int iMin = Math.min(dataList.getEnd(), currentPosition + range);
        Iterator<Integer> it2 = kotlin.ranges.e.downTo(currentPosition, iMax).iterator();
        do {
            num = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(dataList.getDataByPositionIndex(next.intValue()) != null));
        Integer num2 = next;
        int start = num2 == null ? dataList.getStart() : num2.intValue();
        for (Integer num3 : new IntRange(currentPosition, iMin)) {
            if (dataList.getDataByPositionIndex(num3.intValue()) != null) {
                num = num3;
                break;
            }
        }
        Integer num4 = num;
        return (num4 == null ? dataList.getEnd() : num4.intValue()) - start <= range;
    }

    public static /* synthetic */ boolean j(HeartRateDayDetailFragment heartRateDayDetailFragment, ChartDataList chartDataList, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 6;
        }
        return heartRateDayDetailFragment.i(chartDataList, i2, i3);
    }

    private final boolean k(Index index, ChartData chartData, ChartDataList chartDataList) {
        int index2 = index.getPosiIndex().getIndex();
        return chartData == null && j(this, chartDataList, index2, 0, 4, null) && n(chartDataList, index2);
    }

    private final void l(long dateFrom) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(dateFrom);
        ExtensionUtilsKt.combine(e().getHrChartDataLiveData(), c().getAbnormalHrLiveData(), new a(calendar)).observe(getViewLifecycleOwner(), new Observer() { // from class: py3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeartRateDayDetailFragment.m(this.a, (LineChartVo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(HeartRateDayDetailFragment heartRateDayDetailFragment, LineChartVo lineChartVo) {
        heartRateDayDetailFragment.p(lineChartVo);
    }

    private final boolean n(ChartDataList dataList, int currentPosition) {
        return dataList.getFirstData().getBaseIndex().getIndex() <= currentPosition && currentPosition <= dataList.getLastData().getBaseIndex().getIndex();
    }

    private final boolean o(Calendar calendar, Calendar calendar2) {
        return calendar != null && calendar2 != null && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    private final void p(LineChartVo lineChartVo) {
        h().llColorDesc.setVisibility(lineChartVo.getAbnormalHr() != null && lineChartVo.getAbnormalHr().size() > 0 ? 0 : 8);
        ChartDataList chartDataList = new ChartDataList(lineChartVo.getChartDatas(), 0, ConstantKt.DRAW_END_INDEX);
        ChartData lastData = chartDataList.getLastData();
        Integer numValueOf = lastData == null ? null : Integer.valueOf(lastData.getIndex());
        r(chartDataList.getLastData(), false, true, numValueOf == null ? -1 : numValueOf.intValue(), numValueOf != null && numValueOf.intValue() == chartDataList.getEnd());
        float roundUpTen = chartDataList.getCount() <= 0 ? 0.0f : HRChartHelperKt.getRoundUpTen(chartDataList.getMaxDataValue());
        HRChartHelper hRChartHelper = new HRChartHelper(requireContext());
        FrameLayout frameLayout = h().chartContainer;
        HRDayChartData hRDayChartData = new HRDayChartData(0.0f, roundUpTen, HRChartHelperKt.getXAxisData$default(16, null, 2, null), HRChartHelperKt.getYAxisData((int) roundUpTen), chartDataList);
        ArrayList<RangeIndex> abnormalHr = lineChartVo.getAbnormalHr();
        if (abnormalHr == null) {
            abnormalHr = new ArrayList<>();
        }
        HRChartHelper.refreshLineChart$default(hRChartHelper, frameLayout, hRDayChartData, abnormalHr, new b(chartDataList), c.a, null, 6, 32, null);
    }

    private final void q() {
        s(this, null, false, false, 0, false, 24, null);
    }

    private final void r(ChartData data, boolean isTouchValue, boolean isLastPositionValid, int currentIndex, boolean isEndIndex) {
        String str;
        String formatTime$default;
        BaseIndex baseIndex;
        TypefaceTextView typefaceTextView = h().textHeartRate;
        if (data == null) {
            str = "--";
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf((int) data.getSumValue())}, 1));
        }
        typefaceTextView.setText(str);
        h().textUnit.setVisibility(data != null ? 0 : 8);
        if (data != null && (baseIndex = data.getBaseIndex()) != null) {
            currentIndex = baseIndex.getStart();
        }
        TypefaceTextView typefaceTextView2 = h().textTime;
        if (currentIndex < 0) {
            formatTime$default = HMDataFormatKt.getFormatTime$default(getStartTime(), HeartRateTimeUtilsKt.isInSameYear(getStartTime(), System.currentTimeMillis()) ? HMPattern.ABBR_MONTH_DAY : HMPattern.YEAR_ABBR_MONTH_DAY, (Locale) null, 2, (Object) null);
        } else {
            formatTime$default = HMDataFormatKt.getFormatTime$default(b(currentIndex, isLastPositionValid, isEndIndex), HeartRateTimeUtilsKt.isInSameYear(getStartTime(), System.currentTimeMillis()) ? HMPattern.ABBR_MONTH_DAY_HOUR24_MINUTE : HMPattern.YEAR_ABBR_MONTH_DAY_HOUR24_MINUTE, (Locale) null, 2, (Object) null);
        }
        typefaceTextView2.setText(formatTime$default);
    }

    public static /* synthetic */ void s(HeartRateDayDetailFragment heartRateDayDetailFragment, ChartData chartData, boolean z, boolean z2, int i2, boolean z3, int i3, Object obj) {
        heartRateDayDetailFragment.r(chartData, z, z2, (i3 & 8) != 0 ? -1 : i2, (i3 & 16) != 0 ? false : z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(HMChart chart, Index i2, ChartDataList chartDataList) {
        if (chart.getChartDataManager().getChartDataList().getCount() <= 0) {
            q();
            return;
        }
        int index = i2.getPosiIndex().getIndex();
        ChartData dataByPositionIndex = chart.getChartDataManager().getDataByPositionIndex(index);
        if (k(i2, dataByPositionIndex, chart.getChartDataManager().getChartDataList())) {
            return;
        }
        r(dataByPositionIndex, true, chartDataList.getLastData().getIndex() == index, index, index == chartDataList.getEnd());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return h().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getChildFragmentManager().beginTransaction().add(R.id.subHrFragmentContainer, HeartRateSubDayDetailFragment.INSTANCE.newInstance(getStartTime())).commit();
        e().setDataDate(HeartRateTimeUtils.INSTANCE.getChinaDateString(getStartTime()));
        c().loadData(getStartTime());
        l(getStartTime());
    }
}
