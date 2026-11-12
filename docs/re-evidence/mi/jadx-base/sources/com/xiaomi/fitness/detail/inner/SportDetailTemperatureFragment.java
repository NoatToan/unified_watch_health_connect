package com.xiaomi.fitness.detail.inner;

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
import com.xiaomi.fitness.detail.inner.SportDetailTemperatureFragment;
import com.xiaomi.fitness.detail.model.SportRecordListModel;
import com.xiaomi.fitness.detail.util.SportComputeUtil;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.jea;
import defpackage.rz5;
import defpackage.tdc;
import defpackage.uz6;
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
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 _2\u00020\u0001:\u0001_B\u0007¢\u0006\u0004\b^\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00042\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0004¢\u0006\u0004\b \u0010\bJ\u0019\u0010!\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b!\u0010\u0006R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R$\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR*\u0010F\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR*\u0010N\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010U\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0011\u0010]\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006`"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailTemperatureFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "", "initParamsFromBundle", "(Landroid/os/Bundle;)V", "initChartData", "()V", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "map", "bindHeightData", "(Ljava/util/Map;)V", "bindData", "createDetailModelList", "", "getCardName", "()Ljava/lang/String;", "", "hasMaxMinAverage", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "initView", "onNewIntent", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Landroid/widget/LinearLayout;", "itemViewContainer", "Landroid/widget/LinearLayout;", "getItemViewContainer", "()Landroid/widget/LinearLayout;", "setItemViewContainer", "(Landroid/widget/LinearLayout;)V", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "itemView1", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "getItemView1", "()Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "setItemView1", "(Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;)V", "itemView2", "getItemView2", "setItemView2", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerDistribute", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerDistribute", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerDistribute", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Ljea;", "_binding", "Ljea;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "valueList", "Ljava/util/ArrayList;", "getValueList", "()Ljava/util/ArrayList;", "setValueList", "(Ljava/util/ArrayList;)V", "", "Luz6;", "mDistributeList", "Ljava/util/List;", "getMDistributeList", "()Ljava/util/List;", "setMDistributeList", "(Ljava/util/List;)V", "Ltdc;", "mDistributeViewAdapter", "Ltdc;", "getMDistributeViewAdapter", "()Ltdc;", "setMDistributeViewAdapter", "(Ltdc;)V", "getBinding", "()Ljea;", "binding", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailTemperatureFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailHeightFragment";

    @Nullable
    private jea _binding;

    @Nullable
    private SportDetailItemView itemView1;

    @Nullable
    private SportDetailItemView itemView2;

    @Nullable
    private LinearLayout itemViewContainer;

    @Nullable
    private List<uz6> mDistributeList;

    @Nullable
    private tdc mDistributeViewAdapter;

    @Nullable
    private RecyclerView recyclerDistribute;

    @Nullable
    private DataTitleSimpleView titleView;

    @Nullable
    private ArrayList<SportRecordItem> valueList;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailTemperatureFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "mBasicReport", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag("SportDetailHeightFragment", triathlonNum, sportType);
            int i = bsi.E0;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailTemperatureFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailTemperatureFragment$bindHeightData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailTemperatureFragment$bindHeightData$1", f = "SportDetailTemperatureFragment.kt", i = {0}, l = {138, 142}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<SportRecordItem> $heightList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SportDetailTemperatureFragment this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailTemperatureFragment$bindHeightData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailTemperatureFragment$bindHeightData$1$1", f = "SportDetailTemperatureFragment.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Deferred<ArrayList<SportRecordItem>> $valueListTask;
            Object L$0;
            int label;
            final /* synthetic */ SportDetailTemperatureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04051(SportDetailTemperatureFragment sportDetailTemperatureFragment, Deferred<? extends ArrayList<SportRecordItem>> deferred, Continuation<? super C04051> continuation) {
                super(2, continuation);
                this.this$0 = sportDetailTemperatureFragment;
                this.$valueListTask = deferred;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04051(this.this$0, this.$valueListTask, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                SportDetailTemperatureFragment sportDetailTemperatureFragment;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SportDetailTemperatureFragment sportDetailTemperatureFragment2 = this.this$0;
                    Deferred<ArrayList<SportRecordItem>> deferred = this.$valueListTask;
                    this.L$0 = sportDetailTemperatureFragment2;
                    this.label = 1;
                    Object objAwait = deferred.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportDetailTemperatureFragment = sportDetailTemperatureFragment2;
                    obj = objAwait;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sportDetailTemperatureFragment = (SportDetailTemperatureFragment) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                sportDetailTemperatureFragment.setValueList((ArrayList) obj);
                SportDetailTemperatureFragment sportDetailTemperatureFragment3 = this.this$0;
                sportDetailTemperatureFragment3.printChartFloat("SportDetailHeightFragment", sportDetailTemperatureFragment3.getValueList());
                this.this$0.bindData();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<SportRecordItem> list, SportDetailTemperatureFragment sportDetailTemperatureFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$heightList = list;
            this.this$0 = sportDetailTemperatureFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$heightList, this.this$0, continuation);
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
            List<SportRecordItem> list = this.$heightList;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (SportComputeUtil.computeMinMaxValue$default(list, null, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new SportDetailTemperatureFragment$bindHeightData$1$valueListTask$1(this.$heightList, this.this$0, null), 2, null);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C04051 c04051 = new C04051(this.this$0, deferredAsync$default, null);
            this.L$0 = null;
            this.label = 2;
            if (BuildersKt.withContext(main, c04051, this) == coroutine_suspended) {
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
        if (isInvalid()) {
            return;
        }
        SportRecordListModel sportRecordListModelCreateEntryListInner = SportRecordDataUtil.createEntryListInner(this.valueList);
        List<SportRecordEntry> sportRecordList = sportRecordListModelCreateEntryListInner.getSportRecordList();
        if (sportRecordList.isEmpty()) {
            ImageView ivExpandView = getIvExpandView();
            if (ivExpandView != null) {
                ivExpandView.setVisibility(8);
            }
            CustomLineChart customLineChart = this.mLineChart;
            if (customLineChart != null) {
                customLineChart.setVisibility(8);
                return;
            }
            return;
        }
        SportBasicReport mSportValues = getMSportValues();
        Intrinsics.checkNotNull(mSportValues);
        if (mSportValues.getMaxHeight() != null) {
            int i = j1j.r5;
            SportBasicReport mSportValues2 = getMSportValues();
            Intrinsics.checkNotNull(mSportValues2);
            Float maxHeight = mSportValues2.getMaxHeight();
            Intrinsics.checkNotNull(maxHeight);
            String string = getString(i, xr5.f(maxHeight.floatValue()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            CustomLineChart customLineChart2 = this.mLineChart;
            Intrinsics.checkNotNull(customLineChart2);
            customLineChart2.setMaxStr(string);
        }
        SportBasicReport mSportValues3 = getMSportValues();
        Intrinsics.checkNotNull(mSportValues3);
        if (mSportValues3.getAvgWaterTemperature() != null) {
            float minValue = sportRecordListModelCreateEntryListInner.getMinValue();
            if (minValue < 0.0f) {
                CustomLineChart customLineChart3 = this.mLineChart;
                Intrinsics.checkNotNull(customLineChart3);
                SportBasicReport mSportValues4 = getMSportValues();
                Intrinsics.checkNotNull(mSportValues4);
                Float avgWaterTemperature = mSportValues4.getAvgWaterTemperature();
                Intrinsics.checkNotNull(avgWaterTemperature);
                customLineChart3.setLimitLine(avgWaterTemperature.floatValue(), "", sportRecordListModelCreateEntryListInner.getValueRange(), minValue);
            } else {
                CustomLineChart customLineChart4 = this.mLineChart;
                Intrinsics.checkNotNull(customLineChart4);
                SportBasicReport mSportValues5 = getMSportValues();
                Intrinsics.checkNotNull(mSportValues5);
                Float avgWaterTemperature2 = mSportValues5.getAvgWaterTemperature();
                Intrinsics.checkNotNull(avgWaterTemperature2);
                CustomLineChart.setLimitLine$default(customLineChart4, avgWaterTemperature2.floatValue(), "", sportRecordListModelCreateEntryListInner.getValueRange(), 0.0f, 8, null);
            }
        }
        CustomLineChart customLineChart5 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart5);
        customLineChart5.setChartKey(SportRecordKey.DivingTemperature);
        CustomLineChart customLineChart6 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart6);
        CustomLineChart.bindData$default(customLineChart6, sportRecordList, LineDataSet.Mode.LINEAR, 0.0f, null, 0, 28, null);
        CustomLineChart customLineChart7 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart7);
        customLineChart7.animateX(2000);
    }

    private final void bindHeightData(Map<SportRecordKey, ? extends List<? extends Object>> map) {
        SportRecordKey sportRecordKey = SportRecordKey.DivingTemperature;
        if (!map.containsKey(sportRecordKey)) {
            ImageView ivExpandView = getIvExpandView();
            if (ivExpandView != null) {
                ivExpandView.setVisibility(8);
            }
            CustomLineChart customLineChart = this.mLineChart;
            if (customLineChart != null) {
                customLineChart.setVisibility(8);
                return;
            }
            return;
        }
        List<? extends Object> list = map.get(sportRecordKey);
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.data.common.data.sport.SportRecordItem>");
        List<? extends Object> list2 = list;
        if (this.valueList == null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getIO(), null, new AnonymousClass1(list2, this, null), 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:9:0x0052  */
    private final void createDetailModelList() {
        SportDetailItemView sportDetailItemView;
        SportDetailItemView sportDetailItemView2;
        SportBasicReport mSportValues = getMSportValues();
        Intrinsics.checkNotNull(mSportValues);
        if (mSportValues.getMinWaterTemperature() != null) {
            SportBasicReport mSportValues2 = getMSportValues();
            Intrinsics.checkNotNull(mSportValues2);
            Float minWaterTemperature = mSportValues2.getMinWaterTemperature();
            Intrinsics.checkNotNull(minWaterTemperature);
            if (minWaterTemperature.floatValue() > 0.0f) {
                String string = getString(j1j.c3);
                SportBasicReport mSportValues3 = getMSportValues();
                Intrinsics.checkNotNull(mSportValues3);
                Float minWaterTemperature2 = mSportValues3.getMinWaterTemperature();
                Intrinsics.checkNotNull(minWaterTemperature2);
                rz5 rz5Var = new rz5(string, xr5.f(minWaterTemperature2.floatValue()));
                SportDetailItemView sportDetailItemView3 = this.itemView1;
                if (sportDetailItemView3 != null) {
                    SportDetailItemView.bindData$default(sportDetailItemView3, rz5Var, false, 2, null);
                }
            } else {
                sportDetailItemView = this.itemView1;
                if (sportDetailItemView != null) {
                    sportDetailItemView.setVisibility(8);
                }
            }
        } else {
            sportDetailItemView = this.itemView1;
            if (sportDetailItemView != null) {
                sportDetailItemView.setVisibility(8);
            }
        }
        SportBasicReport mSportValues4 = getMSportValues();
        Intrinsics.checkNotNull(mSportValues4);
        if (mSportValues4.getMaxWaterTemperature() != null) {
            SportBasicReport mSportValues5 = getMSportValues();
            Intrinsics.checkNotNull(mSportValues5);
            Float maxWaterTemperature = mSportValues5.getMaxWaterTemperature();
            Intrinsics.checkNotNull(maxWaterTemperature);
            if (maxWaterTemperature.floatValue() > 0.0f) {
                String string2 = getString(j1j.b3);
                SportBasicReport mSportValues6 = getMSportValues();
                Intrinsics.checkNotNull(mSportValues6);
                Float maxWaterTemperature2 = mSportValues6.getMaxWaterTemperature();
                Intrinsics.checkNotNull(maxWaterTemperature2);
                rz5 rz5Var2 = new rz5(string2, xr5.f(maxWaterTemperature2.floatValue()));
                SportDetailItemView sportDetailItemView4 = this.itemView2;
                if (sportDetailItemView4 != null) {
                    SportDetailItemView.bindData$default(sportDetailItemView4, rz5Var2, false, 2, null);
                }
            } else {
                sportDetailItemView2 = this.itemView2;
                if (sportDetailItemView2 != null) {
                    sportDetailItemView2.setVisibility(8);
                }
            }
        } else {
            sportDetailItemView2 = this.itemView2;
            if (sportDetailItemView2 != null) {
                sportDetailItemView2.setVisibility(8);
            }
        }
        SportBasicReport mSportValues7 = getMSportValues();
        Float minWaterTemperature3 = mSportValues7 != null ? mSportValues7.getMinWaterTemperature() : null;
        SportBasicReport mSportValues8 = getMSportValues();
        BaseSportDetailFragment.reportCardInfo$default(this, minWaterTemperature3, mSportValues8 != null ? mSportValues8.getMaxWaterTemperature() : null, null, 4, null);
    }

    private final void initChartData() {
        MutableLiveData<Map<SportRecordKey, List<Object>>> recordDetailMaps;
        MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonRidMaps;
        SportRecordDetailViewModel detailViewModel;
        MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonRunMaps;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        setDetailViewModel((SportRecordDetailViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(SportRecordDetailViewModel.class));
        if (getMSportValues() == null || isInvalid()) {
            return;
        }
        int mDetailSportType = getMDetailSportType();
        if (mDetailSportType == -1) {
            SportRecordDetailViewModel detailViewModel2 = getDetailViewModel();
            if (detailViewModel2 == null || (recordDetailMaps = detailViewModel2.getRecordDetailMaps()) == null) {
                return;
            }
            recordDetailMaps.observe(requireActivity(), new SportDetailTemperatureFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bkn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailTemperatureFragment.initChartData$lambda$0(this.f4321a, (Map) obj);
                }
            }));
            return;
        }
        if (mDetailSportType != 1) {
            if (mDetailSportType != 2 || (detailViewModel = getDetailViewModel()) == null || (triathlonRunMaps = detailViewModel.getTriathlonRunMaps()) == null) {
                return;
            }
            triathlonRunMaps.observe(requireActivity(), new SportDetailTemperatureFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dkn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailTemperatureFragment.initChartData$lambda$2(this.f15633a, (Map) obj);
                }
            }));
            return;
        }
        SportRecordDetailViewModel detailViewModel3 = getDetailViewModel();
        if (detailViewModel3 == null || (triathlonRidMaps = detailViewModel3.getTriathlonRidMaps()) == null) {
            return;
        }
        triathlonRidMaps.observe(requireActivity(), new SportDetailTemperatureFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ckn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailTemperatureFragment.initChartData$lambda$1(this.f5435a, (Map) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$0(SportDetailTemperatureFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindHeightData(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$1(SportDetailTemperatureFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindHeightData(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$2(SportDetailTemperatureFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindHeightData(map);
        return Unit.INSTANCE;
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
            setMBasicReport((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT));
        }
    }

    @NotNull
    public final jea getBinding() {
        jea jeaVar = this._binding;
        Intrinsics.checkNotNull(jeaVar);
        return jeaVar;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "temperature";
    }

    @Nullable
    public final SportDetailItemView getItemView1() {
        return this.itemView1;
    }

    @Nullable
    public final SportDetailItemView getItemView2() {
        return this.itemView2;
    }

    @Nullable
    public final LinearLayout getItemViewContainer() {
        return this.itemViewContainer;
    }

    @Nullable
    public final List<uz6> getMDistributeList() {
        return this.mDistributeList;
    }

    @Nullable
    public final tdc getMDistributeViewAdapter() {
        return this.mDistributeViewAdapter;
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

    public final void initView() {
        initParamsFromBundle(getArguments());
        DataTitleSimpleView dataTitleSimpleView = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView);
        dataTitleSimpleView.bindData(hoi.d1, getString(j1j.k4));
        initIvExpandViewClick(SportRecordKey.DivingTemperature);
        initBaseChart();
        initChartData();
        createDetailModelList();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = jea.A0(inflater, container, false);
        this.itemViewContainer = getBinding().F;
        this.itemView2 = getBinding().D;
        this.itemView1 = getBinding().C;
        this.recyclerDistribute = getBinding().E;
        this.titleView = getBinding().B;
        this.mLineChart = getBinding().A;
        setIvExpandView(getBinding().G);
        initView();
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }

    public final void setItemView1(@Nullable SportDetailItemView sportDetailItemView) {
        this.itemView1 = sportDetailItemView;
    }

    public final void setItemView2(@Nullable SportDetailItemView sportDetailItemView) {
        this.itemView2 = sportDetailItemView;
    }

    public final void setItemViewContainer(@Nullable LinearLayout linearLayout) {
        this.itemViewContainer = linearLayout;
    }

    public final void setMDistributeList(@Nullable List<uz6> list) {
        this.mDistributeList = list;
    }

    public final void setMDistributeViewAdapter(@Nullable tdc tdcVar) {
        this.mDistributeViewAdapter = tdcVar;
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
