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
import androidx.recyclerview.widget.LinearLayoutManager;
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
import com.xiaomi.fitness.chart.util.SportRecordChatUtil;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.inner.SportDetailPowerFragment;
import com.xiaomi.fitness.detail.model.SportRecordListModel;
import com.xiaomi.fitness.detail.util.SportComputeUtil;
import com.xiaomi.fitness.detail.util.StatisticData;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.eco.detail.util.PowerUtil;
import com.xiaomi.fitness.util.ConsistencyEventUtils;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.a0o;
import defpackage.b0o;
import defpackage.bsi;
import defpackage.ffa;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.pin;
import defpackage.rz5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
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
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u0007¢\u0006\u0004\bY\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J)\u0010\u000b\u001a\u00020\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010!\u001a\u00020 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b#\u0010\u0010R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R*\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010I\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010P\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010V\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010Q\u001a\u0004\bW\u0010S\"\u0004\bX\u0010U¨\u0006["}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailPowerFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "", "initView", "()V", "initChartData", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "map", "bindPowerData", "(Ljava/util/Map;)V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "createDetailModelList", "initDistributeRecycler", "displayPowerDist", "bindData", "", "getCardName", "()Ljava/lang/String;", "", "hasMaxMinAverage", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onNewIntent", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerBottom", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerBottom", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerBottom", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recyclerDistribute", "getRecyclerDistribute", "setRecyclerDistribute", "Lffa;", "mBinding", "Lffa;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "valueList", "Ljava/util/ArrayList;", "getValueList", "()Ljava/util/ArrayList;", "setValueList", "(Ljava/util/ArrayList;)V", "", "Lb0o;", "mDistributeList", "Ljava/util/List;", "getMDistributeList", "()Ljava/util/List;", "setMDistributeList", "(Ljava/util/List;)V", "Lpin;", "mDistributeViewAdapter", "Lpin;", "getMDistributeViewAdapter", "()Lpin;", "setMDistributeViewAdapter", "(Lpin;)V", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "itemAvg", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "getItemAvg", "()Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "setItemAvg", "(Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;)V", "itemMax", "getItemMax", "setItemMax", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailPowerFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailPowerFragment";

    @Nullable
    private SportDetailItemView itemAvg;

    @Nullable
    private SportDetailItemView itemMax;

    @Nullable
    private ffa mBinding;

    @Nullable
    private List<b0o> mDistributeList;

    @Nullable
    private pin mDistributeViewAdapter;

    @Nullable
    private RecyclerView recyclerBottom;

    @Nullable
    private RecyclerView recyclerDistribute;

    @Nullable
    private DataTitleSimpleView titleView;

    @Nullable
    private ArrayList<SportRecordItem> valueList;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailPowerFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void switchDetailFragment(@NotNull SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType, @Nullable FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(sportValues, "sportValues");
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putInt("sport_type", sportType);
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, sportDetailType);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag("SportDetailPowerFragment", triathlonNum, sportType);
            int i = bsi.g0;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailPowerFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailPowerFragment$bindPowerData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailPowerFragment$bindPowerData$1", f = "SportDetailPowerFragment.kt", i = {0}, l = {113, 131}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<SportRecordItem> $powerList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SportDetailPowerFragment this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailPowerFragment$bindPowerData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailPowerFragment$bindPowerData$1$1", f = "SportDetailPowerFragment.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Deferred<ArrayList<SportRecordItem>> $valueListTask;
            Object L$0;
            int label;
            final /* synthetic */ SportDetailPowerFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03951(SportDetailPowerFragment sportDetailPowerFragment, Deferred<? extends ArrayList<SportRecordItem>> deferred, Continuation<? super C03951> continuation) {
                super(2, continuation);
                this.this$0 = sportDetailPowerFragment;
                this.$valueListTask = deferred;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03951(this.this$0, this.$valueListTask, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                SportDetailPowerFragment sportDetailPowerFragment;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SportDetailPowerFragment sportDetailPowerFragment2 = this.this$0;
                    Deferred<ArrayList<SportRecordItem>> deferred = this.$valueListTask;
                    this.L$0 = sportDetailPowerFragment2;
                    this.label = 1;
                    Object objAwait = deferred.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportDetailPowerFragment = sportDetailPowerFragment2;
                    obj = objAwait;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sportDetailPowerFragment = (SportDetailPowerFragment) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                sportDetailPowerFragment.setValueList((ArrayList) obj);
                SportDetailPowerFragment sportDetailPowerFragment3 = this.this$0;
                sportDetailPowerFragment3.printChartInt("SportDetailPowerFragment", sportDetailPowerFragment3.getValueList());
                this.this$0.bindData();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<SportRecordItem> list, SportDetailPowerFragment sportDetailPowerFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$powerList = list;
            this.this$0 = sportDetailPowerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$powerList, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            SportRecordItem minItem;
            Number value;
            SportRecordItem maxItem;
            Number value2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            List<SportRecordItem> list = this.$powerList;
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = SportComputeUtil.computeMinMaxValue$default(list, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            CoroutineScope coroutineScope2 = coroutineScope;
            StatisticData statisticData = (StatisticData) obj;
            SportRecordChatUtil sportRecordChatUtil = SportRecordChatUtil.INSTANCE;
            SportRecordKey sportRecordKey = SportRecordKey.Power;
            float fFloatValue = 0.0f;
            float fFloatValue2 = (statisticData == null || (maxItem = statisticData.getMaxItem()) == null || (value2 = maxItem.getValue()) == null) ? 0.0f : value2.floatValue();
            if (statisticData != null && (minItem = statisticData.getMinItem()) != null && (value = minItem.getValue()) != null) {
                fFloatValue = value.floatValue();
            }
            Pair<Integer, Integer> yMaxValueByKey = sportRecordChatUtil.getYMaxValueByKey(sportRecordKey, fFloatValue2, fFloatValue);
            CustomLineChart customLineChart = ((BaseSportDetailFragment) this.this$0).mLineChart;
            if (customLineChart != null) {
                customLineChart.setYAxisMinMaxValue(yMaxValueByKey.getFirst().intValue(), yMaxValueByKey.getSecond().intValue());
            }
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, Dispatchers.getIO(), null, new SportDetailPowerFragment$bindPowerData$1$valueListTask$1(this.$powerList, this.this$0, null), 2, null);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C03951 c03951 = new C03951(this.this$0, deferredAsync$default, null);
            this.L$0 = null;
            this.label = 2;
            if (BuildersKt.withContext(main, c03951, this) == coroutine_suspended) {
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
        Integer avgPower;
        Integer maxPower;
        if (isInvalid() || this.valueList == null) {
            return;
        }
        createDetailModelList();
        SportRecordListModel sportRecordListModelCreateEntryListInner = SportRecordDataUtil.createEntryListInner(this.valueList);
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
        customLineChart3.setChartKey(SportRecordKey.Power);
        CustomLineChart customLineChart4 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart4);
        CustomLineChart.bindData$default(customLineChart4, sportRecordList, LineDataSet.Mode.LINEAR, 0.0f, null, 0, 28, null);
        CustomLineChart customLineChart5 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart5);
        customLineChart5.animateX(2000);
    }

    private final void bindPowerData(Map<SportRecordKey, ? extends List<? extends Object>> map) {
        SportRecordKey sportRecordKey = SportRecordKey.Power;
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
        SportBasicReport mSportValues = getMSportValues();
        if (mSportValues != null) {
            Integer avgPower = mSportValues.getAvgPower();
            if (avgPower != null) {
                rz5 rz5Var = new rz5(getString(j1j.D6), String.valueOf(avgPower.intValue()));
                SportDetailItemView sportDetailItemView = this.itemAvg;
                if (sportDetailItemView != null) {
                    SportDetailItemView.bindData$default(sportDetailItemView, rz5Var, false, 2, null);
                }
            }
            Integer maxPower = mSportValues.getMaxPower();
            if (maxPower != null) {
                rz5 rz5Var2 = new rz5(getString(j1j.E6), String.valueOf(maxPower.intValue()));
                SportDetailItemView sportDetailItemView2 = this.itemMax;
                if (sportDetailItemView2 != null) {
                    SportDetailItemView.bindData$default(sportDetailItemView2, rz5Var2, false, 2, null);
                }
            }
            ConsistencyEventUtils consistencyEventUtils = ConsistencyEventUtils.INSTANCE;
            String cardName = getCardName();
            Integer avgPower2 = mSportValues.getAvgPower();
            Float fValueOf = avgPower2 != null ? Float.valueOf(avgPower2.intValue()) : null;
            Integer maxPower2 = mSportValues.getMaxPower();
            consistencyEventUtils.reportCardInfo(mSportValues, cardName, (28 & 4) != 0 ? null : fValueOf, (28 & 8) != 0 ? null : maxPower2 != null ? Float.valueOf(maxPower2.intValue()) : null, (28 & 16) != 0 ? null : null);
        }
    }

    private final void displayPowerDist() {
        if (getMSportValues() == null) {
            RecyclerView recyclerView = this.recyclerDistribute;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            return;
        }
        PowerUtil powerUtil = PowerUtil.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        SportBasicReport mSportValues = getMSportValues();
        Intrinsics.checkNotNull(mSportValues);
        List<b0o> listCreatePowerDistributeModel = powerUtil.createPowerDistributeModel(fragmentActivityRequireActivity, mSportValues, true);
        if (listCreatePowerDistributeModel != null) {
            List<b0o> list = listCreatePowerDistributeModel;
            if (!list.isEmpty()) {
                RecyclerView recyclerView2 = this.recyclerDistribute;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setVisibility(0);
                List<b0o> list2 = this.mDistributeList;
                Intrinsics.checkNotNull(list2);
                list2.clear();
                List<b0o> list3 = this.mDistributeList;
                Intrinsics.checkNotNull(list3);
                list3.addAll(list);
                pin pinVar = this.mDistributeViewAdapter;
                Intrinsics.checkNotNull(pinVar);
                pinVar.notifyDataSetChanged();
                return;
            }
        }
        RecyclerView recyclerView3 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(8);
    }

    private final void initChartData() {
        SportRecordDetailViewModel detailViewModel;
        MutableLiveData<Map<SportRecordKey, List<Object>>> recordDetailMaps;
        initDetailViewModel();
        if (getMSportValues() == null || isInvalid() || getMDetailSportType() != -1 || (detailViewModel = getDetailViewModel()) == null || (recordDetailMaps = detailViewModel.getRecordDetailMaps()) == null) {
            return;
        }
        recordDetailMaps.observe(requireActivity(), new SportDetailPowerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yhn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailPowerFragment.initChartData$lambda$0(this.f40190a, (Map) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$0(SportDetailPowerFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindPowerData(map);
        return Unit.INSTANCE;
    }

    private final void initDistributeRecycler() {
        this.mDistributeList = new ArrayList();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity());
        RecyclerView recyclerView = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        a0o a0oVar = new a0o();
        RecyclerView recyclerView2 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(a0oVar);
        RecyclerView recyclerView3 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setLayoutManager(linearLayoutManager);
        pin pinVar = new pin(requireActivity(), this.mDistributeList, null, 3);
        this.mDistributeViewAdapter = pinVar;
        pinVar.j(false);
        RecyclerView recyclerView4 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setAdapter(this.mDistributeViewAdapter);
        displayPowerDist();
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
        }
    }

    private final void initView() {
        initParamsFromBundle(getArguments());
        DataTitleSimpleView dataTitleSimpleView = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView);
        dataTitleSimpleView.bindData(hoi.H0, getString(j1j.Z2));
        initIvExpandViewClick(SportRecordKey.Power);
        initDistributeRecycler();
        initBaseChart();
        initChartData();
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "bicycle_power";
    }

    @Nullable
    public final SportDetailItemView getItemAvg() {
        return this.itemAvg;
    }

    @Nullable
    public final SportDetailItemView getItemMax() {
        return this.itemMax;
    }

    @Nullable
    public final List<b0o> getMDistributeList() {
        return this.mDistributeList;
    }

    @Nullable
    public final pin getMDistributeViewAdapter() {
        return this.mDistributeViewAdapter;
    }

    @Nullable
    public final RecyclerView getRecyclerBottom() {
        return this.recyclerBottom;
    }

    @Nullable
    public final RecyclerView getRecyclerDistribute() {
        return this.recyclerDistribute;
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
        ffa ffaVarA0 = ffa.A0(inflater, container, false);
        this.mBinding = ffaVarA0;
        Intrinsics.checkNotNull(ffaVarA0);
        this.recyclerBottom = ffaVarA0.G;
        ffa ffaVar = this.mBinding;
        Intrinsics.checkNotNull(ffaVar);
        this.recyclerDistribute = ffaVar.H;
        ffa ffaVar2 = this.mBinding;
        Intrinsics.checkNotNull(ffaVar2);
        this.titleView = ffaVar2.B;
        ffa ffaVar3 = this.mBinding;
        Intrinsics.checkNotNull(ffaVar3);
        this.mLineChart = ffaVar3.A;
        ffa ffaVar4 = this.mBinding;
        Intrinsics.checkNotNull(ffaVar4);
        this.itemAvg = ffaVar4.C;
        ffa ffaVar5 = this.mBinding;
        Intrinsics.checkNotNull(ffaVar5);
        this.itemMax = ffaVar5.D;
        ffa ffaVar6 = this.mBinding;
        Intrinsics.checkNotNull(ffaVar6);
        setIvExpandView(ffaVar6.F);
        initView();
        ffa ffaVar7 = this.mBinding;
        Intrinsics.checkNotNull(ffaVar7);
        View root = ffaVar7.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }

    public final void setItemAvg(@Nullable SportDetailItemView sportDetailItemView) {
        this.itemAvg = sportDetailItemView;
    }

    public final void setItemMax(@Nullable SportDetailItemView sportDetailItemView) {
        this.itemMax = sportDetailItemView;
    }

    public final void setMDistributeList(@Nullable List<b0o> list) {
        this.mDistributeList = list;
    }

    public final void setMDistributeViewAdapter(@Nullable pin pinVar) {
        this.mDistributeViewAdapter = pinVar;
    }

    public final void setRecyclerBottom(@Nullable RecyclerView recyclerView) {
        this.recyclerBottom = recyclerView;
    }

    public final void setRecyclerDistribute(@Nullable RecyclerView recyclerView) {
        this.recyclerDistribute = recyclerView;
    }

    public final void setTitleView(@Nullable DataTitleSimpleView dataTitleSimpleView) {
        this.titleView = dataTitleSimpleView;
    }

    public final void setValueList(@Nullable ArrayList<SportRecordItem> arrayList) {
        this.valueList = arrayList;
    }
}
