package com.xiaomi.fitness.detail.inner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.inner.SportDetailSpeedFragment;
import com.xiaomi.fitness.detail.model.SportRecordListModel;
import com.xiaomi.fitness.detail.util.SportComputeUtil;
import com.xiaomi.fitness.detail.util.SportDetailUtil;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.a0o;
import defpackage.b0o;
import defpackage.b9h;
import defpackage.bsi;
import defpackage.cga;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.o5o;
import defpackage.pin;
import defpackage.rz5;
import defpackage.tb2;
import defpackage.xr5;
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
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0001]B\u0007¢\u0006\u0004\b\\\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\u00032\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u001f\u0010\u0016\u001a\u00020\u00032\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J-\u0010'\u001a\u00020&2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0003¢\u0006\u0004\b)\u0010\u0005J\u0019\u0010*\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b*\u0010\u0010J\u000f\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010\u0005J\u000f\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010\u0005R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R*\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\u0017R\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR*\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010R\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010LR\u0011\u0010[\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006^"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailSpeedFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "Lb9h;", "", "initChartData", "()V", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "map", "bindSpeedData", "(Ljava/util/Map;)V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "bindData", "initSegmentRecycler", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "distanceList", "addDistanceList", "(Ljava/util/ArrayList;)V", "Lb0o;", "createDataList", "(Ljava/util/ArrayList;)Ljava/util/List;", "", "getCardName", "()Ljava/lang/String;", "", "hasMaxMinAverage", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "initView", "onNewIntent", "onLoadMore", "onShowPassage", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerSegment", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerSegment", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerSegment", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Lcga;", "_binding", "Lcga;", "valueList", "Ljava/util/ArrayList;", "getValueList", "()Ljava/util/ArrayList;", "setValueList", "", "speedListSize", "I", "getSpeedListSize", "()I", "setSpeedListSize", "(I)V", "", "mDataList", "Ljava/util/List;", "getMDataList", "()Ljava/util/List;", "setMDataList", "(Ljava/util/List;)V", "Lpin;", "mAdapter", "Lpin;", "getMAdapter", "()Lpin;", "setMAdapter", "(Lpin;)V", "originalDataList", "getBinding", "()Lcga;", "binding", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailSpeedFragment extends BaseSportDetailFragment implements b9h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailSpeedFragment";

    @Nullable
    private cga _binding;

    @Nullable
    private pin mAdapter;

    @Nullable
    private List<b0o> mDataList;

    @Nullable
    private List<b0o> originalDataList;

    @Nullable
    private RecyclerView recyclerSegment;
    private int speedListSize;

    @Nullable
    private DataTitleSimpleView titleView;

    @Nullable
    private ArrayList<SportRecordItem> valueList;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailSpeedFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "mBasicReport", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            BaseSportDetailFragment.switchFragment(bsi.s0, SportDetailSpeedFragment.class, BaseSportDetailFragment.createFragmentTag(SportDetailSpeedFragment.TAG, triathlonNum, sportType), bundle, fragmentManager);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailSpeedFragment$bindSpeedData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailSpeedFragment$bindSpeedData$1", f = "SportDetailSpeedFragment.kt", i = {0}, l = {123, 127}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<SportRecordItem> $speedList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SportDetailSpeedFragment this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailSpeedFragment$bindSpeedData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailSpeedFragment$bindSpeedData$1$1", f = "SportDetailSpeedFragment.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Deferred<ArrayList<SportRecordItem>> $valueListTask;
            Object L$0;
            int label;
            final /* synthetic */ SportDetailSpeedFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03991(SportDetailSpeedFragment sportDetailSpeedFragment, Deferred<? extends ArrayList<SportRecordItem>> deferred, Continuation<? super C03991> continuation) {
                super(2, continuation);
                this.this$0 = sportDetailSpeedFragment;
                this.$valueListTask = deferred;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03991(this.this$0, this.$valueListTask, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                SportDetailSpeedFragment sportDetailSpeedFragment;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SportDetailSpeedFragment sportDetailSpeedFragment2 = this.this$0;
                    Deferred<ArrayList<SportRecordItem>> deferred = this.$valueListTask;
                    this.L$0 = sportDetailSpeedFragment2;
                    this.label = 1;
                    Object objAwait = deferred.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportDetailSpeedFragment = sportDetailSpeedFragment2;
                    obj = objAwait;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sportDetailSpeedFragment = (SportDetailSpeedFragment) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                sportDetailSpeedFragment.setValueList((ArrayList) obj);
                o5o.e().o(this.this$0.getValueList());
                SportDetailSpeedFragment sportDetailSpeedFragment3 = this.this$0;
                sportDetailSpeedFragment3.printChartFloat(SportDetailSpeedFragment.TAG, sportDetailSpeedFragment3.getValueList());
                this.this$0.bindData();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<SportRecordItem> list, SportDetailSpeedFragment sportDetailSpeedFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$speedList = list;
            this.this$0 = sportDetailSpeedFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$speedList, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
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
            List<SportRecordItem> list = this.$speedList;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (SportComputeUtil.computeMinMaxValue$default(list, null, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new SportDetailSpeedFragment$bindSpeedData$1$valueListTask$1(this.$speedList, this.this$0, null), 2, null);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C03991 c03991 = new C03991(this.this$0, deferredAsync$default, null);
            this.L$0 = null;
            this.label = 2;
            if (BuildersKt.withContext(main, c03991, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void addDistanceList(ArrayList<SportRecordItem> distanceList) {
        List<b0o> list = this.mDataList;
        if (list != null && list != null) {
            list.clear();
        }
        this.originalDataList = new ArrayList();
        List<b0o> listCreateDataList = createDataList(distanceList);
        Logger.i("SportDetailFragment", "bind Speed detail segment item data!! addDistanceList() size " + listCreateDataList.size());
        tb2.b(listCreateDataList);
        pin pinVar = this.mAdapter;
        if (pinVar != null) {
            pinVar.n(this.originalDataList);
        }
        List<b0o> list2 = listCreateDataList;
        if (!list2.isEmpty()) {
            Intrinsics.checkNotNull(distanceList);
            if (distanceList.get(0).getValue().floatValue() * 1000 >= 995.0f) {
                SportBasicReport mSportValues = getMSportValues();
                Intrinsics.checkNotNull(mSportValues);
                if (mSportValues.getSportType() != 708) {
                    SportBasicReport mSportValues2 = getMSportValues();
                    Intrinsics.checkNotNull(mSportValues2);
                    if (mSportValues2.getSportType() != 709) {
                        SportBasicReport mSportValues3 = getMSportValues();
                        Intrinsics.checkNotNull(mSportValues3);
                        if (mSportValues3.getSportType() != 710) {
                            RecyclerView recyclerView = this.recyclerSegment;
                            Intrinsics.checkNotNull(recyclerView);
                            recyclerView.setVisibility(0);
                            List<b0o> list3 = this.originalDataList;
                            if (list3 != null) {
                                list3.addAll(list2);
                            }
                            if (listCreateDataList.size() > getMaxShowCountNum() + 1) {
                                pin pinVar2 = this.mAdapter;
                                Intrinsics.checkNotNull(pinVar2);
                                pinVar2.setBottomCount(1);
                                listCreateDataList = listCreateDataList.subList(0, getMaxShowCountNum() + 1);
                            } else {
                                pin pinVar3 = this.mAdapter;
                                Intrinsics.checkNotNull(pinVar3);
                                pinVar3.setBottomCount(0);
                            }
                            List<b0o> list4 = this.mDataList;
                            if (list4 != null) {
                                list4.addAll(listCreateDataList);
                            }
                            pin pinVar4 = this.mAdapter;
                            Intrinsics.checkNotNull(pinVar4);
                            pinVar4.notifyDataSetChanged();
                            return;
                        }
                    }
                }
            }
        }
        RecyclerView recyclerView2 = this.recyclerSegment;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x007a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    public final void bindData() {
        Float f;
        SportDetailItemView itemViewRight;
        Float avgSpeed;
        if (isInvalid()) {
            return;
        }
        SportRecordListModel sportRecordListModelCreateEntryListInner = SportRecordDataUtil.createEntryListInner(this.valueList);
        List<SportRecordEntry> sportRecordList = sportRecordListModelCreateEntryListInner.getSportRecordList();
        SportBasicReport mSportValues = getMSportValues();
        if (mSportValues != null) {
            if (mSportValues.getMaxSpeed() != null) {
                Float maxSpeed = mSportValues.getMaxSpeed();
                Intrinsics.checkNotNull(maxSpeed);
                if (maxSpeed.floatValue() > 0.0f) {
                    Float maxSpeed2 = mSportValues.getMaxSpeed();
                    Intrinsics.checkNotNull(maxSpeed2);
                    float fE = xr5.e(1, maxSpeed2.floatValue());
                    rz5 rz5Var = mSportValues.getProtoType() == 21 ? new rz5(getString(j1j.G6), String.valueOf(fE)) : new rz5(getString(j1j.y5), String.valueOf(fE));
                    SportDetailItemView itemViewRight2 = getItemViewRight();
                    if (itemViewRight2 != null) {
                        SportDetailItemView.bindData$default(itemViewRight2, rz5Var, 0, false, false, 12, null);
                    }
                } else {
                    itemViewRight = getItemViewRight();
                    if (itemViewRight != null) {
                        itemViewRight.setVisibility(8);
                    }
                }
            } else {
                itemViewRight = getItemViewRight();
                if (itemViewRight != null) {
                    itemViewRight.setVisibility(8);
                }
            }
            if (mSportValues.getDistance() != null) {
                avgSpeed = SportReportComputeUtil.INSTANCE.getAvgSpeed(mSportValues);
                if (avgSpeed != null) {
                    CustomLineChart customLineChart = this.mLineChart;
                    Intrinsics.checkNotNull(customLineChart);
                    CustomLineChart.setLimitLine$default(customLineChart, avgSpeed.floatValue(), sportRecordListModelCreateEntryListInner.getValueRange(), 0.0f, 4, null);
                    float fE2 = xr5.e(1, avgSpeed.floatValue());
                    rz5 rz5Var2 = mSportValues.getProtoType() == 21 ? new rz5(getString(j1j.F6), String.valueOf(fE2)) : new rz5(getString(j1j.t3), String.valueOf(fE2));
                    SportDetailItemView itemViewLeft = getItemViewLeft();
                    if (itemViewLeft != null) {
                        SportDetailItemView.bindData$default(itemViewLeft, rz5Var2, 0, false, false, 12, null);
                    }
                }
            } else {
                avgSpeed = null;
            }
            f = avgSpeed;
        } else {
            f = null;
        }
        CustomLineChart customLineChart2 = this.mLineChart;
        if (customLineChart2 != null) {
            customLineChart2.setChartKey(SportRecordKey.Speed);
        }
        CustomLineChart customLineChart3 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart3);
        CustomLineChart.bindData$default(customLineChart3, sportRecordList, LineDataSet.Mode.LINEAR, 0.0f, null, 0, 28, null);
        CustomLineChart customLineChart4 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart4);
        customLineChart4.animateX(2000);
        SportBasicReport mSportValues2 = getMSportValues();
        BaseSportDetailFragment.reportCardInfo$default(this, f, mSportValues2 != null ? mSportValues2.getMaxSpeed() : null, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindSpeedData(Map<SportRecordKey, ? extends List<? extends Object>> map) {
        SportRecordKey sportRecordKey = SportRecordKey.WholeKMPoint;
        if (map.containsKey(sportRecordKey)) {
            Logger.i("SportDetailFragment", "bind Speed detail segment item data!!");
            addDistanceList(SportDetailUtil.INSTANCE.computeDistancePoint(map.get(sportRecordKey)));
        }
        SportRecordKey sportRecordKey2 = SportRecordKey.Speed;
        if (map.containsKey(sportRecordKey2)) {
            List<? extends Object> list = map.get(sportRecordKey2);
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.data.common.data.sport.SportRecordItem>");
            List<? extends Object> list2 = list;
            Logger.i("SportDetailFragment", "bind Speed detail chart data!!");
            if (this.valueList != null || list2.size() <= this.speedListSize) {
                return;
            }
            this.speedListSize = list2.size();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getIO(), null, new AnonymousClass1(list2, this, null), 2, null);
        }
    }

    private final List<b0o> createDataList(ArrayList<SportRecordItem> distanceList) {
        int duration;
        int i;
        Integer correctedDistance;
        ArrayList<SportRecordItem> arrayList = distanceList;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && distanceList.size() != 0) {
            int size = distanceList.size();
            int i2 = 0;
            int i3 = 1;
            int i4 = 0;
            int i5 = 1;
            while (i2 < size) {
                SportRecordItem sportRecordItem = arrayList.get(i2);
                Intrinsics.checkNotNullExpressionValue(sportRecordItem, "get(...)");
                SportRecordItem sportRecordItem2 = sportRecordItem;
                float fFloatValue = sportRecordItem2.getValue().floatValue();
                if (size != i3 || fFloatValue >= 1.0f) {
                    duration = sportRecordItem2.getDuration();
                } else {
                    SportBasicReport mSportValues = getMSportValues();
                    Intrinsics.checkNotNull(mSportValues);
                    duration = mSportValues.getDuration();
                }
                if (i2 == size - 1) {
                    SportBasicReport mSportValues2 = getMSportValues();
                    Integer distance = null;
                    if (mSportValues2 == null || (correctedDistance = mSportValues2.getCorrectedDistance()) == null || correctedDistance.intValue() <= 0) {
                        SportBasicReport mSportValues3 = getMSportValues();
                        if (mSportValues3 != null) {
                            distance = mSportValues3.getDistance();
                        }
                    } else {
                        SportBasicReport mSportValues4 = getMSportValues();
                        if (mSportValues4 != null) {
                            distance = mSportValues4.getCorrectedDistance();
                        }
                    }
                    if (distance != null) {
                        fFloatValue = (distance.intValue() - (i2 * 1000)) / 1000;
                        duration = (int) (duration / fFloatValue);
                    }
                }
                int i6 = duration;
                float f = fFloatValue;
                arrayList2.add(new b0o(i5, i6, f, i6, 0));
                i4 += i6;
                if (i5 % 5 != 0 || f < 1.0f) {
                    i = 1;
                } else {
                    i = 1;
                    arrayList2.add(new b0o(i4, f, 1));
                }
                i5++;
                i2++;
                arrayList = distanceList;
                i3 = i;
            }
        }
        return arrayList2;
    }

    private final void initChartData() {
        SportRecordDetailViewModel detailViewModel;
        MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonRidMaps;
        MutableLiveData<Map<SportRecordKey, List<Object>>> recordDetailMaps;
        initDetailViewModel();
        if (getMSportValues() == null || isInvalid()) {
            return;
        }
        if (getMDetailSportType() == -1) {
            SportRecordDetailViewModel detailViewModel2 = getDetailViewModel();
            if (detailViewModel2 == null || (recordDetailMaps = detailViewModel2.getRecordDetailMaps()) == null) {
                return;
            }
            recordDetailMaps.observe(requireActivity(), new SportDetailSpeedFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xin
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailSpeedFragment.initChartData$lambda$0(this.f39166a, (Map) obj);
                }
            }));
            return;
        }
        if (getMDetailSportType() != 1 || (detailViewModel = getDetailViewModel()) == null || (triathlonRidMaps = detailViewModel.getTriathlonRidMaps()) == null) {
            return;
        }
        triathlonRidMaps.observe(requireActivity(), new SportDetailSpeedFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yin
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailSpeedFragment.initChartData$lambda$1(this.f40221a, (Map) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$0(SportDetailSpeedFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i("SportDetailFragment", "bind Speed detail data!!");
        Intrinsics.checkNotNull(map);
        this$0.bindSpeedData(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$1(SportDetailSpeedFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindSpeedData(map);
        return Unit.INSTANCE;
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
            setMBasicReport((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT));
        }
    }

    private final void initSegmentRecycler() {
        this.mDataList = new ArrayList();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity());
        RecyclerView recyclerView = this.recyclerSegment;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        a0o a0oVar = new a0o();
        RecyclerView recyclerView2 = this.recyclerSegment;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(a0oVar);
        this.mAdapter = new pin(requireActivity(), this.mDataList, this, 2);
        RecyclerView recyclerView3 = this.recyclerSegment;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mAdapter);
    }

    @JvmStatic
    public static final void switchDetailFragment(@NotNull SportBasicReport sportBasicReport, int i, int i2, int i3, @NotNull FragmentManager fragmentManager, @Nullable SportBasicReport sportBasicReport2) {
        INSTANCE.switchDetailFragment(sportBasicReport, i, i2, i3, fragmentManager, sportBasicReport2);
    }

    @NotNull
    public final cga getBinding() {
        cga cgaVar = this._binding;
        Intrinsics.checkNotNull(cgaVar);
        return cgaVar;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "speed";
    }

    @Nullable
    public final pin getMAdapter() {
        return this.mAdapter;
    }

    @Nullable
    public final List<b0o> getMDataList() {
        return this.mDataList;
    }

    @Nullable
    public final RecyclerView getRecyclerSegment() {
        return this.recyclerSegment;
    }

    public final int getSpeedListSize() {
        return this.speedListSize;
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

    public final void initView() {
        initParamsFromBundle(getArguments());
        DataTitleSimpleView dataTitleSimpleView = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView);
        dataTitleSimpleView.bindData(hoi.U1, getString(j1j.t7));
        initIvExpandViewClick(SportRecordKey.Speed);
        initSegmentRecycler();
        initBaseChart();
        initChartData();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = cga.A0(inflater, container, false);
        this.recyclerSegment = getBinding().G;
        this.titleView = getBinding().B;
        this.mLineChart = getBinding().A;
        setItemViewLeft(getBinding().C);
        setItemViewRight(getBinding().D);
        setIvExpandView(getBinding().F);
        initView();
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // defpackage.b9h
    public void onLoadMore() {
        List<b0o> list;
        onTraceBtnLoad("speed", true);
        List<b0o> list2 = this.originalDataList;
        if (list2 != null && list2.size() > 0 && (list = this.mDataList) != null) {
            list.clear();
        }
        List<b0o> list3 = this.originalDataList;
        if (list3 != null) {
            List<b0o> list4 = this.mDataList;
            if (list4 != null) {
                list4.addAll(list3);
            }
            pin pinVar = this.mAdapter;
            if (pinVar != null) {
                pinVar.notifyDataSetChanged();
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }

    @Override // defpackage.b9h
    public void onShowPassage() {
        List<b0o> listSubList;
        List<b0o> list;
        onTraceBtnLoad("speed", false);
        List<b0o> list2 = this.mDataList;
        if (list2 != null) {
            list2.clear();
        }
        List<b0o> list3 = this.originalDataList;
        if ((list3 != null ? list3.size() : 0) > getMaxShowCountNum() + 1) {
            List<b0o> list4 = this.originalDataList;
            listSubList = list4 != null ? list4.subList(0, getMaxShowCountNum() + 1) : null;
        } else {
            listSubList = this.originalDataList;
        }
        if (listSubList != null && (list = this.mDataList) != null) {
            list.addAll(listSubList);
        }
        pin pinVar = this.mAdapter;
        if (pinVar != null) {
            pinVar.notifyDataSetChanged();
        }
    }

    public final void setMAdapter(@Nullable pin pinVar) {
        this.mAdapter = pinVar;
    }

    public final void setMDataList(@Nullable List<b0o> list) {
        this.mDataList = list;
    }

    public final void setRecyclerSegment(@Nullable RecyclerView recyclerView) {
        this.recyclerSegment = recyclerView;
    }

    public final void setSpeedListSize(int i) {
        this.speedListSize = i;
    }

    public final void setTitleView(@Nullable DataTitleSimpleView dataTitleSimpleView) {
        this.titleView = dataTitleSimpleView;
    }

    public final void setValueList(@Nullable ArrayList<SportRecordItem> arrayList) {
        this.valueList = arrayList;
    }
}
