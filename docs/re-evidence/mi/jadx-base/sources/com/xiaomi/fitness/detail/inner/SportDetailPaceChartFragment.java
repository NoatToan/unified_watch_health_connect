package com.xiaomi.fitness.detail.inner;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.LineDataSet;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.chart.util.SportRecordChatUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.inner.SportDetailPaceChartFragment;
import com.xiaomi.fitness.detail.util.SportComputeUtil;
import com.xiaomi.fitness.detail.util.SportDetailUtil;
import com.xiaomi.fitness.detail.util.StatisticData;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.a0o;
import defpackage.b0o;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.mx5;
import defpackage.o5o;
import defpackage.pin;
import defpackage.rz5;
import defpackage.yea;
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
import kotlin.jvm.JvmStatic;
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
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 W2\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\bV\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00042\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010#\u001a\u00020\"2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010\bJ\r\u0010)\u001a\u00020\u0004¢\u0006\u0004\b)\u0010\bJ\u0019\u0010*\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b*\u0010\u0006R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R6\u0010?\u001a\u0016\u0012\u0004\u0012\u00020=\u0018\u00010<j\n\u0012\u0004\u0012\u00020=\u0018\u0001`>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR*\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010P\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailPaceChartFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "", "initParamsFromBundle", "(Landroid/os/Bundle;)V", "initChartData", "()V", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "map", "bindData", "(Ljava/util/Map;)V", "", DailyRecordKey.sportType, "", "getPaceMaxLevel", "(I)F", "initSegmentRecycler", "displayPaceDist", "", "getCardName", "()Ljava/lang/String;", "", "hasMaxMinAverage", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_START, "initView", "onNewIntent", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerSegment", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerSegment", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerSegment", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Lyea;", "mBinding", "Lyea;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "Lkotlin/collections/ArrayList;", "valueList", "Ljava/util/ArrayList;", "getValueList", "()Ljava/util/ArrayList;", "setValueList", "(Ljava/util/ArrayList;)V", "hasReportConsistencyEvent", "Z", "", "Lb0o;", "mDataList", "Ljava/util/List;", "getMDataList", "()Ljava/util/List;", "setMDataList", "(Ljava/util/List;)V", "Lpin;", "mAdapter", "Lpin;", "getMAdapter", "()Lpin;", "setMAdapter", "(Lpin;)V", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailPaceChartFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private boolean hasReportConsistencyEvent;

    @Nullable
    private pin mAdapter;

    @Nullable
    private yea mBinding;

    @Nullable
    private List<b0o> mDataList;
    public RecyclerView recyclerSegment;
    public DataTitleSimpleView titleView;

    @Nullable
    private ArrayList<SportRecordItem> valueList;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailPaceChartFragment$Companion;", "", "<init>", "()V", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "mBasicReport", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void switchDetailFragment(@NotNull SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType, @NotNull FragmentManager fragmentManager, @Nullable SportBasicReport mBasicReport) {
            Intrinsics.checkNotNullParameter(sportValues, "sportValues");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putInt("sport_type", sportType);
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, sportDetailType);
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT, mBasicReport);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            BaseSportDetailFragment.switchFragment(bsi.e0, SportDetailPaceChartFragment.class, BaseSportDetailFragment.createFragmentTag("SportDetailPaceFragment", triathlonNum, sportType), bundle, fragmentManager);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailPaceChartFragment$bindData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailPaceChartFragment$bindData$1", f = "SportDetailPaceChartFragment.kt", i = {0}, l = {142, 156}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<SportRecordItem> $paceList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SportDetailPaceChartFragment this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailPaceChartFragment$bindData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailPaceChartFragment$bindData$1$1", f = "SportDetailPaceChartFragment.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Pair<Integer, Integer> $maxMinValue;
            final /* synthetic */ Deferred<ArrayList<SportRecordItem>> $valueListTask;
            Object L$0;
            int label;
            final /* synthetic */ SportDetailPaceChartFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03941(SportDetailPaceChartFragment sportDetailPaceChartFragment, Deferred<? extends ArrayList<SportRecordItem>> deferred, Pair<Integer, Integer> pair, Continuation<? super C03941> continuation) {
                super(2, continuation);
                this.this$0 = sportDetailPaceChartFragment;
                this.$valueListTask = deferred;
                this.$maxMinValue = pair;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03941(this.this$0, this.$valueListTask, this.$maxMinValue, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                SportDetailPaceChartFragment sportDetailPaceChartFragment;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SportDetailPaceChartFragment sportDetailPaceChartFragment2 = this.this$0;
                    Deferred<ArrayList<SportRecordItem>> deferred = this.$valueListTask;
                    this.L$0 = sportDetailPaceChartFragment2;
                    this.label = 1;
                    Object objAwait = deferred.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportDetailPaceChartFragment = sportDetailPaceChartFragment2;
                    obj = objAwait;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sportDetailPaceChartFragment = (SportDetailPaceChartFragment) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                sportDetailPaceChartFragment.setValueList((ArrayList) obj);
                SportDetailPaceChartFragment sportDetailPaceChartFragment3 = this.this$0;
                sportDetailPaceChartFragment3.printChartFloat(SportDetailSpeedFragment.TAG, sportDetailPaceChartFragment3.getValueList());
                this.this$0.bindData();
                float fMeasureText = new Paint(1).measureText(TimeDateUtil.getSportPaceStrWithSecDef(this.$maxMinValue.getSecond().intValue()));
                ImageView ivExpandView = this.this$0.getIvExpandView();
                ViewGroup.LayoutParams layoutParams = ivExpandView != null ? ivExpandView.getLayoutParams() : null;
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginEnd(((int) fMeasureText) + DisplayUtil.dip2px(15.0f));
                ImageView ivExpandView2 = this.this$0.getIvExpandView();
                if (ivExpandView2 != null) {
                    ivExpandView2.setLayoutParams(marginLayoutParams);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<SportRecordItem> list, SportDetailPaceChartFragment sportDetailPaceChartFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$paceList = list;
            this.this$0 = sportDetailPaceChartFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$paceList, this.this$0, continuation);
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
            List<SportRecordItem> list = this.$paceList;
            SportRecordKey sportRecordKey = SportRecordKey.Pace;
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = SportComputeUtil.computeMinMaxValue(list, sportRecordKey, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            CoroutineScope coroutineScope2 = coroutineScope;
            StatisticData statisticData = (StatisticData) obj;
            SportRecordChatUtil sportRecordChatUtil = SportRecordChatUtil.INSTANCE;
            SportRecordKey sportRecordKey2 = SportRecordKey.Pace;
            float fFloatValue = 0.0f;
            float fFloatValue2 = (statisticData == null || (maxItem = statisticData.getMaxItem()) == null || (value2 = maxItem.getValue()) == null) ? 0.0f : value2.floatValue();
            if (statisticData != null && (minItem = statisticData.getMinItem()) != null && (value = minItem.getValue()) != null) {
                fFloatValue = value.floatValue();
            }
            Pair<Integer, Integer> yMaxValueByKey = sportRecordChatUtil.getYMaxValueByKey(sportRecordKey2, fFloatValue2, fFloatValue);
            CustomLineChart customLineChart = ((BaseSportDetailFragment) this.this$0).mLineChart;
            if (customLineChart != null) {
                customLineChart.setYAxisMinMaxValue(yMaxValueByKey.getFirst().intValue(), yMaxValueByKey.getSecond().intValue());
            }
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, Dispatchers.getIO(), null, new SportDetailPaceChartFragment$bindData$1$valueListTask$1(this.$paceList, this.this$0, null), 2, null);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C03941 c03941 = new C03941(this.this$0, deferredAsync$default, yMaxValueByKey, null);
            this.L$0 = null;
            this.label = 2;
            if (BuildersKt.withContext(main, c03941, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void bindData(Map<SportRecordKey, ? extends List<? extends Object>> map) {
        SportRecordKey sportRecordKey = SportRecordKey.Pace;
        if (map.containsKey(sportRecordKey)) {
            List<? extends Object> list = map.get(sportRecordKey);
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.data.common.data.sport.SportRecordItem>");
            List<? extends Object> list2 = list;
            Logger.i("SportDetailFragment", "bind Speed detail chart data!!");
            if (this.valueList == null) {
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getIO(), null, new AnonymousClass1(list2, this, null), 2, null);
            }
        }
    }

    private final void displayPaceDist() {
        if (getMSportValues() == null) {
            getRecyclerSegment().setVisibility(8);
            return;
        }
        SportDetailUtil sportDetailUtil = SportDetailUtil.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        SportBasicReport mSportValues = getMSportValues();
        Intrinsics.checkNotNull(mSportValues);
        SportBasicReport mSportValues2 = getMSportValues();
        List<b0o> listCreatePaceSportSegmentModel = sportDetailUtil.createPaceSportSegmentModel(fragmentActivityRequireActivity, mSportValues, mSportValues2 != null ? mSportValues2.getDuration() : 0);
        if (!(!listCreatePaceSportSegmentModel.isEmpty())) {
            getRecyclerSegment().setVisibility(8);
            return;
        }
        getRecyclerSegment().setVisibility(0);
        List<b0o> list = this.mDataList;
        if (list != null) {
            list.clear();
        }
        List<b0o> list2 = this.mDataList;
        if (list2 != null) {
            list2.addAll(listCreatePaceSportSegmentModel);
        }
        pin pinVar = this.mAdapter;
        if (pinVar != null) {
            pinVar.notifyDataSetChanged();
        }
    }

    private final float getPaceMaxLevel(int sportType) {
        if (sportType != 1 && sportType != 2 && sportType != 3 && sportType != 5) {
            if (sportType == 6) {
                return 2400.0f;
            }
            if (sportType != 15) {
                return -1.0f;
            }
        }
        return 3600.0f;
    }

    private final void initChartData() {
        bindData();
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
            this.sportType = bundle.getInt("sport_type");
            setMBasicReport((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT));
        }
    }

    private final void initSegmentRecycler() {
        this.mDataList = new ArrayList();
        getRecyclerSegment().setLayoutManager(new LinearLayoutManager(requireActivity()));
        getRecyclerSegment().addItemDecoration(new a0o());
        pin pinVar = new pin(requireActivity(), this.mDataList, null, 3);
        this.mAdapter = pinVar;
        pinVar.j(false);
        getRecyclerSegment().setAdapter(this.mAdapter);
        getRecyclerSegment().setVisibility(8);
        displayPaceDist();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(SportDetailPaceChartFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindData(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(SportDetailPaceChartFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindData(map);
        return Unit.INSTANCE;
    }

    @JvmStatic
    public static final void switchDetailFragment(@NotNull SportBasicReport sportBasicReport, int i, int i2, int i3, @NotNull FragmentManager fragmentManager, @Nullable SportBasicReport sportBasicReport2) {
        INSTANCE.switchDetailFragment(sportBasicReport, i, i2, i3, fragmentManager, sportBasicReport2);
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "pace";
    }

    @Nullable
    public final pin getMAdapter() {
        return this.mAdapter;
    }

    @Nullable
    public final List<b0o> getMDataList() {
        return this.mDataList;
    }

    @NotNull
    public final RecyclerView getRecyclerSegment() {
        RecyclerView recyclerView = this.recyclerSegment;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerSegment");
        return null;
    }

    @NotNull
    public final DataTitleSimpleView getTitleView() {
        DataTitleSimpleView dataTitleSimpleView = this.titleView;
        if (dataTitleSimpleView != null) {
            return dataTitleSimpleView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("titleView");
        return null;
    }

    @Nullable
    public final ArrayList<SportRecordItem> getValueList() {
        return this.valueList;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    public boolean hasMaxMinAverage() {
        return true;
    }

    public final void initView() {
        LinearLayout linearLayout;
        initParamsFromBundle(getArguments());
        yea yeaVar = this.mBinding;
        if (yeaVar != null && (linearLayout = yeaVar.E) != null) {
            linearLayout.setVisibility(0);
        }
        getTitleView().bindData(hoi.U1, getString(j1j.o8));
        initIvExpandViewClick(SportRecordKey.Pace);
        initSegmentRecycler();
        initBaseChart();
        initChartData();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        yea yeaVarA0 = yea.A0(inflater, container, false);
        this.mBinding = yeaVarA0;
        Intrinsics.checkNotNull(yeaVarA0);
        setRecyclerSegment(yeaVarA0.G);
        yea yeaVar = this.mBinding;
        Intrinsics.checkNotNull(yeaVar);
        setTitleView(yeaVar.B);
        yea yeaVar2 = this.mBinding;
        Intrinsics.checkNotNull(yeaVar2);
        this.mLineChart = yeaVar2.A;
        yea yeaVar3 = this.mBinding;
        Intrinsics.checkNotNull(yeaVar3);
        setItemViewLeft(yeaVar3.C);
        yea yeaVar4 = this.mBinding;
        Intrinsics.checkNotNull(yeaVar4);
        setItemViewRight(yeaVar4.D);
        yea yeaVar5 = this.mBinding;
        Intrinsics.checkNotNull(yeaVar5);
        setIvExpandView(yeaVar5.F);
        initView();
        yea yeaVar6 = this.mBinding;
        Intrinsics.checkNotNull(yeaVar6);
        View root = yeaVar6.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        SportRecordDetailViewModel detailViewModel;
        MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonRunMaps;
        MutableLiveData<Map<SportRecordKey, List<Object>>> recordDetailMaps;
        super.onStart();
        initDetailViewModel();
        if (getMSportValues() == null || isInvalid()) {
            return;
        }
        if (getMDetailSportType() == -1) {
            SportRecordDetailViewModel detailViewModel2 = getDetailViewModel();
            if (detailViewModel2 == null || (recordDetailMaps = detailViewModel2.getRecordDetailMaps()) == null) {
                return;
            }
            recordDetailMaps.observe(requireActivity(), new SportDetailPaceChartFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mhn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailPaceChartFragment.onStart$lambda$0(this.f26195a, (Map) obj);
                }
            }));
            return;
        }
        if (getMDetailSportType() != 2 || (detailViewModel = getDetailViewModel()) == null || (triathlonRunMaps = detailViewModel.getTriathlonRunMaps()) == null) {
            return;
        }
        triathlonRunMaps.observe(requireActivity(), new SportDetailPaceChartFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: nhn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailPaceChartFragment.onStart$lambda$1(this.f27943a, (Map) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
    }

    public final void setMAdapter(@Nullable pin pinVar) {
        this.mAdapter = pinVar;
    }

    public final void setMDataList(@Nullable List<b0o> list) {
        this.mDataList = list;
    }

    public final void setRecyclerSegment(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recyclerSegment = recyclerView;
    }

    public final void setTitleView(@NotNull DataTitleSimpleView dataTitleSimpleView) {
        Intrinsics.checkNotNullParameter(dataTitleSimpleView, "<set-?>");
        this.titleView = dataTitleSimpleView;
    }

    public final void setValueList(@Nullable ArrayList<SportRecordItem> arrayList) {
        this.valueList = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:57:0x014e  */
    public final void bindData() {
        Integer num;
        Integer avgPace;
        Integer maxPace;
        String sportPaceStrWithSecDef;
        SportBasicReport mSportValues;
        Integer distance;
        SportBasicReport mSportValues2;
        YAxis axisRight;
        YAxis axisRight2;
        Integer maxPace2 = 0;
        CustomLineChart customLineChart = this.mLineChart;
        if (customLineChart != null && (axisRight2 = customLineChart.getAxisRight()) != null) {
            axisRight2.r(true);
        }
        CustomLineChart customLineChart2 = this.mLineChart;
        if (customLineChart2 != null && (axisRight = customLineChart2.getAxisRight()) != null) {
            axisRight.setValueFormatter(new mx5());
        }
        List<SportRecordEntry> listCreatePaceEntryList = SportRecordDataUtil.INSTANCE.createPaceEntryList(this.valueList, 1800.0f);
        int i = this.sportType;
        LineDataSet.Mode mode = LineDataSet.Mode.LINEAR;
        SportBasicReport mSportValues3 = getMSportValues();
        if (mSportValues3 != null) {
            if (mSportValues3.getDistance() != null) {
                SportReportComputeUtil sportReportComputeUtil = SportReportComputeUtil.INSTANCE;
                SportBasicReport mSportValues4 = getMSportValues();
                Intrinsics.checkNotNull(mSportValues4);
                avgPace = sportReportComputeUtil.getAvgPace(mSportValues4);
                if (avgPace != null) {
                    String string = getString(j1j.O2, TimeDateUtil.getSportPaceStrWithSecDef(avgPace.intValue()));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    CustomLineChart customLineChart3 = this.mLineChart;
                    if (customLineChart3 != null) {
                        CustomLineChart.setLimitLine$default(customLineChart3, avgPace.intValue(), string, 1.0f, 0.0f, 8, null);
                    }
                    rz5 rz5Var = new rz5(getString(j1j.T), TimeDateUtil.getSportPaceStrWithSecDef(avgPace.intValue()));
                    rz5Var.g(1);
                    SportDetailItemView itemViewLeft = getItemViewLeft();
                    if (itemViewLeft != null) {
                        SportDetailItemView.bindData$default(itemViewLeft, rz5Var, 0, false, false, 12, null);
                    }
                } else {
                    SportDetailItemView itemViewLeft2 = getItemViewLeft();
                    if (itemViewLeft2 != null) {
                        itemViewLeft2.setVisibility(8);
                    }
                }
            } else {
                avgPace = maxPace2;
            }
            if (mSportValues3.getMaxPace() != null && ((maxPace = mSportValues3.getMaxPace()) == null || maxPace.intValue() != 0)) {
                SportBasicReport mSportValues5 = getMSportValues();
                if ((mSportValues5 != null ? mSportValues5.getCorrectedDistance() : null) == null) {
                    maxPace2 = mSportValues3.getMaxPace();
                    Integer maxPace3 = mSportValues3.getMaxPace();
                    Intrinsics.checkNotNull(maxPace3);
                    sportPaceStrWithSecDef = TimeDateUtil.getSportPaceStrWithSecDef(maxPace3.intValue());
                } else {
                    SportBasicReport mSportValues6 = getMSportValues();
                    Integer correctedDistance = mSportValues6 != null ? mSportValues6.getCorrectedDistance() : null;
                    Intrinsics.checkNotNull(correctedDistance);
                    if (correctedDistance.intValue() > 0 && (mSportValues = getMSportValues()) != null && (distance = mSportValues.getDistance()) != null && distance.intValue() > 0 && (mSportValues2 = getMSportValues()) != null && mSportValues2.getSportType() == 3) {
                        Integer maxPace4 = mSportValues3.getMaxPace();
                        Intrinsics.checkNotNull(maxPace4);
                        float fIntValue = maxPace4.intValue();
                        SportBasicReport mSportValues7 = getMSportValues();
                        Intrinsics.checkNotNull(mSportValues7);
                        Integer correctedDistance2 = mSportValues7.getCorrectedDistance();
                        Intrinsics.checkNotNull(correctedDistance2);
                        float fIntValue2 = correctedDistance2.intValue();
                        SportBasicReport mSportValues8 = getMSportValues();
                        Intrinsics.checkNotNull(mSportValues8);
                        Integer distance2 = mSportValues8.getDistance();
                        Intrinsics.checkNotNull(distance2);
                        maxPace2 = Integer.valueOf((int) (fIntValue / (fIntValue2 / distance2.intValue())));
                        sportPaceStrWithSecDef = TimeDateUtil.getSportPaceStrWithSecDef(maxPace2.intValue());
                    } else {
                        maxPace2 = mSportValues3.getMaxPace();
                        Integer maxPace5 = mSportValues3.getMaxPace();
                        Intrinsics.checkNotNull(maxPace5);
                        sportPaceStrWithSecDef = TimeDateUtil.getSportPaceStrWithSecDef(maxPace5.intValue());
                    }
                }
                rz5 rz5Var2 = new rz5(getString(j1j.R), sportPaceStrWithSecDef);
                rz5Var2.g(1);
                SportDetailItemView itemViewRight = getItemViewRight();
                if (itemViewRight != null) {
                    SportDetailItemView.bindData$default(itemViewRight, rz5Var2, 0, false, false, 12, null);
                }
            } else {
                SportDetailItemView itemViewRight2 = getItemViewRight();
                if (itemViewRight2 != null) {
                    itemViewRight2.setVisibility(8);
                }
            }
            num = maxPace2;
            maxPace2 = avgPace;
        } else {
            num = maxPace2;
        }
        o5o.e().m(this.valueList);
        CustomLineChart customLineChart4 = this.mLineChart;
        if (customLineChart4 != null) {
            customLineChart4.setChartKey(SportRecordKey.Pace);
        }
        CustomLineChart customLineChart5 = this.mLineChart;
        if (customLineChart5 != null) {
            CustomLineChart.bindData$default(customLineChart5, listCreatePaceEntryList, mode, getPaceMaxLevel(this.sportType), null, 0, 24, null);
        }
        CustomLineChart customLineChart6 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart6);
        customLineChart6.animateX(2000);
        if (this.hasReportConsistencyEvent) {
            return;
        }
        BaseSportDetailFragment.reportCardInfo$default(this, maxPace2 != null ? Float.valueOf(maxPace2.intValue()) : null, num != null ? Float.valueOf(num.intValue()) : null, null, 4, null);
        this.hasReportConsistencyEvent = true;
    }
}
