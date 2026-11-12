package com.xiaomi.fitness.detail.inner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.data.LineDataSet;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.inner.SportDetailEqualPaceFragment;
import com.xiaomi.fitness.detail.model.SportRecordListModel;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.rfa;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b7\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J)\u0010\u000b\u001a\u00020\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001d\u0010\u0010R$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R*\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailEqualPaceFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "", "initView", "()V", "initChartData", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "map", "bindPowerData", "(Ljava/util/Map;)V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "bindData", "", "getCardName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onNewIntent", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerBottom", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerBottom", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerBottom", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lrfa;", "mBinding", "Lrfa;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "valueList", "Ljava/util/ArrayList;", "getValueList", "()Ljava/util/ArrayList;", "setValueList", "(Ljava/util/ArrayList;)V", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailEqualPaceFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailPowerFragment";

    @Nullable
    private rfa mBinding;

    @Nullable
    private RecyclerView recyclerBottom;

    @Nullable
    private DataTitleSimpleView titleView;

    @Nullable
    private ArrayList<SportRecordItem> valueList;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailEqualPaceFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "mBasicReport", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void switchDetailFragment(@NotNull SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType, @Nullable FragmentManager fragmentManager, @Nullable SportBasicReport mBasicReport) {
            Intrinsics.checkNotNullParameter(sportValues, "sportValues");
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putInt("sport_type", sportType);
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, sportDetailType);
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT, mBasicReport);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag("SportDetailPowerFragment", triathlonNum, sportType);
            int i = bsi.U;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailEqualPaceFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailEqualPaceFragment$bindPowerData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailEqualPaceFragment$bindPowerData$1", f = "SportDetailEqualPaceFragment.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<SportRecordItem> $powerList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SportDetailEqualPaceFragment this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailEqualPaceFragment$bindPowerData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailEqualPaceFragment$bindPowerData$1$1", f = "SportDetailEqualPaceFragment.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Deferred<ArrayList<SportRecordItem>> $valueListTask;
            Object L$0;
            int label;
            final /* synthetic */ SportDetailEqualPaceFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03911(SportDetailEqualPaceFragment sportDetailEqualPaceFragment, Deferred<? extends ArrayList<SportRecordItem>> deferred, Continuation<? super C03911> continuation) {
                super(2, continuation);
                this.this$0 = sportDetailEqualPaceFragment;
                this.$valueListTask = deferred;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03911(this.this$0, this.$valueListTask, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                SportDetailEqualPaceFragment sportDetailEqualPaceFragment;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SportDetailEqualPaceFragment sportDetailEqualPaceFragment2 = this.this$0;
                    Deferred<ArrayList<SportRecordItem>> deferred = this.$valueListTask;
                    this.L$0 = sportDetailEqualPaceFragment2;
                    this.label = 1;
                    Object objAwait = deferred.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportDetailEqualPaceFragment = sportDetailEqualPaceFragment2;
                    obj = objAwait;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sportDetailEqualPaceFragment = (SportDetailEqualPaceFragment) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                sportDetailEqualPaceFragment.setValueList((ArrayList) obj);
                SportDetailEqualPaceFragment sportDetailEqualPaceFragment3 = this.this$0;
                sportDetailEqualPaceFragment3.printChartInt("SportDetailPowerFragment", sportDetailEqualPaceFragment3.getValueList());
                this.this$0.bindData();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<SportRecordItem> list, SportDetailEqualPaceFragment sportDetailEqualPaceFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$powerList = list;
            this.this$0 = sportDetailEqualPaceFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$powerList, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new SportDetailEqualPaceFragment$bindPowerData$1$valueListTask$1(this.$powerList, this.this$0, null), 2, null);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C03911 c03911 = new C03911(this.this$0, deferredAsync$default, null);
                this.label = 1;
                if (BuildersKt.withContext(main, c03911, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindData() {
        ArrayList<SportRecordItem> arrayList;
        Integer avgPower;
        Integer maxPower;
        if (isInvalid() || (arrayList = this.valueList) == null) {
            return;
        }
        SportRecordListModel sportRecordListModelCreateEntryListInner = SportRecordDataUtil.createEntryListInner(arrayList);
        List<SportRecordEntry> sportRecordList = sportRecordListModelCreateEntryListInner.getSportRecordList();
        SportBasicReport mSportValues = getMSportValues();
        if (mSportValues != null && (maxPower = mSportValues.getMaxPower()) != null) {
            String string = getString(j1j.w5, String.valueOf(maxPower.intValue()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            CustomLineChart customLineChart = this.mLineChart;
            Intrinsics.checkNotNull(customLineChart);
            customLineChart.setMaxStr(string);
        }
        SportBasicReport mSportValues2 = getMSportValues();
        if (mSportValues2 != null && (avgPower = mSportValues2.getAvgPower()) != null) {
            int iIntValue = avgPower.intValue();
            String string2 = getString(j1j.O2, String.valueOf(iIntValue));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            CustomLineChart customLineChart2 = this.mLineChart;
            Intrinsics.checkNotNull(customLineChart2);
            customLineChart2.setLimitLine(iIntValue, string2, sportRecordListModelCreateEntryListInner.getValueRange(), 0.0f);
        }
        CustomLineChart customLineChart3 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart3);
        customLineChart3.setChartKey(SportRecordKey.EqualIntensityPace);
        CustomLineChart customLineChart4 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart4);
        CustomLineChart.bindData$default(customLineChart4, sportRecordList, LineDataSet.Mode.LINEAR, 0.0f, null, 0, 28, null);
        CustomLineChart customLineChart5 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart5);
        customLineChart5.animateX(2000);
    }

    private final void bindPowerData(Map<SportRecordKey, ? extends List<? extends Object>> map) {
        SportRecordKey sportRecordKey = SportRecordKey.EqualIntensityPace;
        if (map.containsKey(sportRecordKey)) {
            List<? extends Object> list = map.get(sportRecordKey);
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.data.common.data.sport.SportRecordItem>");
            List<? extends Object> list2 = list;
            if (this.valueList == null) {
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getIO(), null, new AnonymousClass1(list2, this, null), 2, null);
            }
        }
    }

    private final void initChartData() {
        SportRecordDetailViewModel detailViewModel;
        MutableLiveData<Map<SportRecordKey, List<Object>>> recordDetailMaps;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        setDetailViewModel((SportRecordDetailViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(SportRecordDetailViewModel.class));
        if (getMSportValues() == null || isInvalid() || getMDetailSportType() != -1 || (detailViewModel = getDetailViewModel()) == null || (recordDetailMaps = detailViewModel.getRecordDetailMaps()) == null) {
            return;
        }
        recordDetailMaps.observe(requireActivity(), new SportDetailEqualPaceFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: men
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailEqualPaceFragment.initChartData$lambda$0(this.f26082a, (Map) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$0(SportDetailEqualPaceFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindPowerData(map);
        return Unit.INSTANCE;
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
            setMBasicReport((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT));
        }
    }

    private final void initView() {
        initParamsFromBundle(getArguments());
        DataTitleSimpleView dataTitleSimpleView = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView);
        dataTitleSimpleView.bindData(hoi.f20295k, getString(j1j.u4));
        initIvExpandViewClick(SportRecordKey.EqualIntensityPace);
        initBaseChart();
        initChartData();
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "ngp";
    }

    @Nullable
    public final RecyclerView getRecyclerBottom() {
        return this.recyclerBottom;
    }

    @Nullable
    public final DataTitleSimpleView getTitleView() {
        return this.titleView;
    }

    @Nullable
    public final ArrayList<SportRecordItem> getValueList() {
        return this.valueList;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        rfa rfaVarA0 = rfa.A0(inflater, container, false);
        this.mBinding = rfaVarA0;
        Intrinsics.checkNotNull(rfaVarA0);
        this.recyclerBottom = rfaVarA0.G;
        rfa rfaVar = this.mBinding;
        Intrinsics.checkNotNull(rfaVar);
        this.titleView = rfaVar.B;
        rfa rfaVar2 = this.mBinding;
        Intrinsics.checkNotNull(rfaVar2);
        this.mLineChart = rfaVar2.A;
        rfa rfaVar3 = this.mBinding;
        Intrinsics.checkNotNull(rfaVar3);
        setItemViewLeft(rfaVar3.C);
        rfa rfaVar4 = this.mBinding;
        Intrinsics.checkNotNull(rfaVar4);
        setItemViewRight(rfaVar4.D);
        rfa rfaVar5 = this.mBinding;
        Intrinsics.checkNotNull(rfaVar5);
        setIvExpandView(rfaVar5.F);
        initView();
        rfa rfaVar6 = this.mBinding;
        Intrinsics.checkNotNull(rfaVar6);
        View root = rfaVar6.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }

    public final void setRecyclerBottom(@Nullable RecyclerView recyclerView) {
        this.recyclerBottom = recyclerView;
    }

    public final void setTitleView(@Nullable DataTitleSimpleView dataTitleSimpleView) {
        this.titleView = dataTitleSimpleView;
    }

    public final void setValueList(@Nullable ArrayList<SportRecordItem> arrayList) {
        this.valueList = arrayList;
    }
}
