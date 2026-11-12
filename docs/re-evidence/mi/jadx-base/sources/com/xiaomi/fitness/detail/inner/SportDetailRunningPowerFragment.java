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
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.inner.SportDetailRunningPowerFragment;
import com.xiaomi.fitness.detail.model.SportRecordListModel;
import com.xiaomi.fitness.detail.util.SportComputeUtil;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.rfa;
import defpackage.rz5;
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
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b;\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J)\u0010\u000b\u001a\u00020\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b!\u0010\u0011R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R*\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailRunningPowerFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "", "initView", "()V", "initChartData", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "map", "bindPowerData", "(Ljava/util/Map;)V", "createDetailModelList", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "bindData", "", "getCardName", "()Ljava/lang/String;", "", "hasMaxMinAverage", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onNewIntent", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerBottom", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerBottom", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerBottom", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lrfa;", "mBinding", "Lrfa;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "valueList", "Ljava/util/ArrayList;", "getValueList", "()Ljava/util/ArrayList;", "setValueList", "(Ljava/util/ArrayList;)V", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailRunningPowerFragment extends BaseSportDetailFragment {

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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailRunningPowerFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "mBasicReport", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            int i = bsi.n0;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailRunningPowerFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailRunningPowerFragment$bindPowerData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailRunningPowerFragment$bindPowerData$1", f = "SportDetailRunningPowerFragment.kt", i = {0, 1}, l = {115, 116, 125}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<SportRecordItem> $powerList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SportDetailRunningPowerFragment this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailRunningPowerFragment$bindPowerData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailRunningPowerFragment$bindPowerData$1$1", f = "SportDetailRunningPowerFragment.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Deferred<ArrayList<SportRecordItem>> $valueListTask;
            Object L$0;
            int label;
            final /* synthetic */ SportDetailRunningPowerFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03981(SportDetailRunningPowerFragment sportDetailRunningPowerFragment, Deferred<? extends ArrayList<SportRecordItem>> deferred, Continuation<? super C03981> continuation) {
                super(2, continuation);
                this.this$0 = sportDetailRunningPowerFragment;
                this.$valueListTask = deferred;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03981(this.this$0, this.$valueListTask, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                SportDetailRunningPowerFragment sportDetailRunningPowerFragment;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SportDetailRunningPowerFragment sportDetailRunningPowerFragment2 = this.this$0;
                    Deferred<ArrayList<SportRecordItem>> deferred = this.$valueListTask;
                    this.L$0 = sportDetailRunningPowerFragment2;
                    this.label = 1;
                    Object objAwait = deferred.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportDetailRunningPowerFragment = sportDetailRunningPowerFragment2;
                    obj = objAwait;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sportDetailRunningPowerFragment = (SportDetailRunningPowerFragment) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                sportDetailRunningPowerFragment.setValueList((ArrayList) obj);
                SportDetailRunningPowerFragment sportDetailRunningPowerFragment3 = this.this$0;
                sportDetailRunningPowerFragment3.printChartInt("SportDetailPowerFragment", sportDetailRunningPowerFragment3.getValueList());
                this.this$0.bindData();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<SportRecordItem> list, SportDetailRunningPowerFragment sportDetailRunningPowerFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$powerList = list;
            this.this$0 = sportDetailRunningPowerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$powerList, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0088 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            MainCoroutineDispatcher main;
            C03981 c03981;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new SportDetailRunningPowerFragment$bindPowerData$1$valueListTask$1(this.$powerList, this.this$0, null), 2, null);
                    main = Dispatchers.getMain();
                    c03981 = new C03981(this.this$0, deferredAsync$default, null);
                    this.L$0 = null;
                    this.label = 3;
                    if (BuildersKt.withContext(main, c03981, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            List<SportRecordItem> list = this.$powerList;
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (SportComputeUtil.computeMinMaxValue$default(list, null, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            List<SportRecordItem> list2 = this.$powerList;
            SportBasicReport mSportValues = this.this$0.getMSportValues();
            Intrinsics.checkNotNull(mSportValues);
            Integer maxRunningPower = mSportValues.getMaxRunningPower();
            this.L$0 = coroutineScope;
            this.label = 2;
            if (SportComputeUtil.replaceMinMaxValue(list2, (Integer) null, maxRunningPower, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new SportDetailRunningPowerFragment$bindPowerData$1$valueListTask$1(this.$powerList, this.this$0, null), 2, null);
            main = Dispatchers.getMain();
            c03981 = new C03981(this.this$0, deferredAsync$default2, null);
            this.L$0 = null;
            this.label = 3;
            if (BuildersKt.withContext(main, c03981, this) == coroutine_suspended) {
                return coroutine_suspended;
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
        Integer avgRunningPower;
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
        if (mSportValues2 != null && (avgRunningPower = mSportValues2.getAvgRunningPower()) != null) {
            int iIntValue = avgRunningPower.intValue();
            String string2 = getString(j1j.O2, String.valueOf(iIntValue));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            CustomLineChart customLineChart2 = this.mLineChart;
            Intrinsics.checkNotNull(customLineChart2);
            customLineChart2.setLimitLine(iIntValue, string2, sportRecordListModelCreateEntryListInner.getValueRange(), 0.0f);
        }
        CustomLineChart customLineChart3 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart3);
        customLineChart3.setChartKey(SportRecordKey.RunningPower);
        CustomLineChart customLineChart4 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart4);
        CustomLineChart.bindData$default(customLineChart4, sportRecordList, LineDataSet.Mode.LINEAR, 0.0f, null, 0, 28, null);
        CustomLineChart customLineChart5 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart5);
        customLineChart5.animateX(2000);
    }

    private final void bindPowerData(Map<SportRecordKey, ? extends List<? extends Object>> map) {
        SportRecordKey sportRecordKey = SportRecordKey.RunningPower;
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

    private final void createDetailModelList() {
        Integer maxRunningPower;
        Integer avgRunningPower;
        SportBasicReport mSportValues = getMSportValues();
        Intrinsics.checkNotNull(mSportValues);
        Float fValueOf = null;
        if (mSportValues.getAvgRunningPower() != null) {
            String string = getString(j1j.D6);
            SportBasicReport mSportValues2 = getMSportValues();
            Intrinsics.checkNotNull(mSportValues2);
            Integer avgRunningPower2 = mSportValues2.getAvgRunningPower();
            Intrinsics.checkNotNull(avgRunningPower2);
            rz5 rz5Var = new rz5(string, Integer.toString(avgRunningPower2.intValue()));
            SportDetailItemView itemViewLeft = getItemViewLeft();
            if (itemViewLeft != null) {
                SportDetailItemView.bindData$default(itemViewLeft, rz5Var, false, 2, null);
            }
        }
        SportBasicReport mSportValues3 = getMSportValues();
        Intrinsics.checkNotNull(mSportValues3);
        if (mSportValues3.getMaxRunningPower() != null) {
            String string2 = getString(j1j.E6);
            SportBasicReport mSportValues4 = getMSportValues();
            Intrinsics.checkNotNull(mSportValues4);
            Integer maxRunningPower2 = mSportValues4.getMaxRunningPower();
            Intrinsics.checkNotNull(maxRunningPower2);
            rz5 rz5Var2 = new rz5(string2, Integer.toString(maxRunningPower2.intValue()));
            SportDetailItemView itemViewRight = getItemViewRight();
            if (itemViewRight != null) {
                SportDetailItemView.bindData$default(itemViewRight, rz5Var2, false, 2, null);
            }
        }
        SportBasicReport mSportValues5 = getMSportValues();
        Float fValueOf2 = (mSportValues5 == null || (avgRunningPower = mSportValues5.getAvgRunningPower()) == null) ? null : Float.valueOf(avgRunningPower.intValue());
        SportBasicReport mSportValues6 = getMSportValues();
        if (mSportValues6 != null && (maxRunningPower = mSportValues6.getMaxRunningPower()) != null) {
            fValueOf = Float.valueOf(maxRunningPower.intValue());
        }
        BaseSportDetailFragment.reportCardInfo$default(this, fValueOf2, fValueOf, null, 4, null);
    }

    private final void initChartData() {
        MutableLiveData<Map<SportRecordKey, List<Object>>> recordDetailMaps;
        SportRecordDetailViewModel detailViewModel;
        MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonRunMaps;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        setDetailViewModel((SportRecordDetailViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(SportRecordDetailViewModel.class));
        if (getMSportValues() == null || isInvalid()) {
            return;
        }
        int mDetailSportType = getMDetailSportType();
        if (mDetailSportType != -1) {
            if (mDetailSportType != 2 || (detailViewModel = getDetailViewModel()) == null || (triathlonRunMaps = detailViewModel.getTriathlonRunMaps()) == null) {
                return;
            }
            triathlonRunMaps.observe(requireActivity(), new SportDetailRunningPowerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: oin
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailRunningPowerFragment.initChartData$lambda$1(this.f29206a, (Map) obj);
                }
            }));
            return;
        }
        SportRecordDetailViewModel detailViewModel2 = getDetailViewModel();
        if (detailViewModel2 == null || (recordDetailMaps = detailViewModel2.getRecordDetailMaps()) == null) {
            return;
        }
        recordDetailMaps.observe(requireActivity(), new SportDetailRunningPowerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: nin
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailRunningPowerFragment.initChartData$lambda$0(this.f27965a, (Map) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$0(SportDetailRunningPowerFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindPowerData(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$1(SportDetailRunningPowerFragment this$0, Map map) {
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
        dataTitleSimpleView.bindData(hoi.H0, getString(j1j.a6));
        initIvExpandViewClick(SportRecordKey.RunningPower);
        initBaseChart();
        initChartData();
        createDetailModelList();
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "running_power";
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

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    public boolean hasMaxMinAverage() {
        return true;
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
