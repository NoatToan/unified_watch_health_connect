package com.xiaomi.fitness.detail.inner;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.SportDetailLandActivity;
import com.xiaomi.fitness.detail.inner.SportDetailStepLengthFragment;
import com.xiaomi.fitness.detail.model.SportRecordListModel;
import com.xiaomi.fitness.detail.util.SportComputeUtil;
import com.xiaomi.fitness.detail.util.SportRecordConstants;
import com.xiaomi.fitness.detail.util.StatisticData;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.lga;
import defpackage.rz5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 Q2\u00020\u0001:\u0001QB\u0007¢\u0006\u0004\bP\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\n\u001a\u00020\u00022\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0004¢\u0006\u0004\b \u0010\u0004J\u0019\u0010!\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b!\u0010\u000fR$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R$\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R6\u0010@\u001a\u0016\u0012\u0004\u0012\u00020>\u0018\u00010=j\n\u0012\u0004\u0012\u00020>\u0018\u0001`?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010G\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0011\u0010O\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006R"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailStepLengthFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "", "initChartData", "()V", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "map", "bindStepLengthData", "(Ljava/util/Map;)V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "bindData", "createDetailModelList", "", "getCardName", "()Ljava/lang/String;", "", "hasMaxMinAverage", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "initView", "onNewIntent", "Landroid/widget/LinearLayout;", "itemViewContainer", "Landroid/widget/LinearLayout;", "getItemViewContainer", "()Landroid/widget/LinearLayout;", "setItemViewContainer", "(Landroid/widget/LinearLayout;)V", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "itemView1", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "getItemView1", "()Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "setItemView1", "(Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;)V", "itemView2", "getItemView2", "setItemView2", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Llga;", "_binding", "Llga;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "Lkotlin/collections/ArrayList;", "valueList", "Ljava/util/ArrayList;", "getValueList", "()Ljava/util/ArrayList;", "setValueList", "(Ljava/util/ArrayList;)V", "", "maxStepLength", "Ljava/lang/Integer;", "getMaxStepLength", "()Ljava/lang/Integer;", "setMaxStepLength", "(Ljava/lang/Integer;)V", "getBinding", "()Llga;", "binding", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailStepLengthFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailStepLengthFragment";

    @Nullable
    private lga _binding;

    @Nullable
    private SportDetailItemView itemView1;

    @Nullable
    private SportDetailItemView itemView2;

    @Nullable
    private LinearLayout itemViewContainer;

    @Nullable
    private Integer maxStepLength;

    @Nullable
    private DataTitleSimpleView titleView;

    @Nullable
    private ArrayList<SportRecordItem> valueList;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailStepLengthFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "mBasicReport", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag(SportDetailStepLengthFragment.TAG, triathlonNum, sportType);
            int i = bsi.y0;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailStepLengthFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailStepLengthFragment$bindStepLengthData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailStepLengthFragment$bindStepLengthData$1", f = "SportDetailStepLengthFragment.kt", i = {0, 1}, l = {128, 142, 156}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<SportRecordItem> $stepList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SportDetailStepLengthFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<SportRecordItem> list, SportDetailStepLengthFragment sportDetailStepLengthFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$stepList = list;
            this.this$0 = sportDetailStepLengthFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$stepList, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:45:0x0108 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x0109  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            SportRecordItem maxItem;
            Number value;
            SportDetailStepLengthFragment sportDetailStepLengthFragment;
            SportDetailStepLengthFragment sportDetailStepLengthFragment2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean zBooleanValue = true;
            if (i != 0) {
                if (i == 1) {
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    CoroutineScope coroutineScope2 = coroutineScope;
                    if (zBooleanValue) {
                        DataTitleSimpleView titleView = this.this$0.getTitleView();
                        Intrinsics.checkNotNull(titleView);
                        titleView.setGuideIcon(hoi.J0, this.this$0.getAbnormalGuideListener());
                    }
                    Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, Dispatchers.getIO(), null, new SportDetailStepLengthFragment$bindStepLengthData$1$valueListTask$1(this.$stepList, this.this$0, null), 2, null);
                    sportDetailStepLengthFragment = this.this$0;
                    this.L$0 = sportDetailStepLengthFragment;
                    this.label = 3;
                    obj = deferredAsync$default.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportDetailStepLengthFragment2 = sportDetailStepLengthFragment;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sportDetailStepLengthFragment2 = (SportDetailStepLengthFragment) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                sportDetailStepLengthFragment2.setValueList((ArrayList) obj);
                SportDetailStepLengthFragment sportDetailStepLengthFragment3 = this.this$0;
                sportDetailStepLengthFragment3.printChartInt(SportDetailStepLengthFragment.TAG, sportDetailStepLengthFragment3.getValueList());
                this.this$0.bindData();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            List<SportRecordItem> list = this.$stepList;
            this.L$0 = coroutineScope3;
            this.label = 1;
            Object objComputeMinMaxValue$default = SportComputeUtil.computeMinMaxValue$default(list, null, this, 2, null);
            if (objComputeMinMaxValue$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope3;
            obj = objComputeMinMaxValue$default;
            StatisticData statisticData = (StatisticData) obj;
            this.this$0.setMaxStepLength(Boxing.boxInt((statisticData == null || (maxItem = statisticData.getMaxItem()) == null || (value = maxItem.getValue()) == null) ? 0 : value.intValue()));
            Integer maxStepLength = this.this$0.getMaxStepLength();
            if (maxStepLength != null) {
                SportDetailStepLengthFragment sportDetailStepLengthFragment4 = this.this$0;
                int iIntValue = maxStepLength.intValue();
                rz5 rz5Var = new rz5(sportDetailStepLengthFragment4.getString(j1j.n0), String.valueOf(iIntValue));
                if (iIntValue > 0) {
                    SportDetailItemView itemView2 = sportDetailStepLengthFragment4.getItemView2();
                    if (itemView2 != null) {
                        SportDetailItemView.bindData$default(itemView2, rz5Var, false, 2, null);
                    }
                } else {
                    SportDetailItemView itemView3 = sportDetailStepLengthFragment4.getItemView2();
                    if (itemView3 != null) {
                        itemView3.setVisibility(8);
                    }
                }
            }
            SportRecordDetailViewModel detailViewModel = this.this$0.getDetailViewModel();
            Intrinsics.checkNotNull(detailViewModel);
            if (!Intrinsics.areEqual(detailViewModel.getAbnormalFlag().getValue(), Boxing.boxBoolean(true))) {
                SportRecordKey sportRecordKey = SportRecordKey.StepsLength;
                List<SportRecordItem> list2 = this.$stepList;
                this.L$0 = coroutineScope;
                this.label = 2;
                obj = SportComputeUtil.computeAbnormalState(sportRecordKey, list2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
            CoroutineScope coroutineScope4 = coroutineScope;
            if (zBooleanValue) {
                DataTitleSimpleView titleView2 = this.this$0.getTitleView();
                Intrinsics.checkNotNull(titleView2);
                titleView2.setGuideIcon(hoi.J0, this.this$0.getAbnormalGuideListener());
            }
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope4, Dispatchers.getIO(), null, new SportDetailStepLengthFragment$bindStepLengthData$1$valueListTask$1(this.$stepList, this.this$0, null), 2, null);
            sportDetailStepLengthFragment = this.this$0;
            this.L$0 = sportDetailStepLengthFragment;
            this.label = 3;
            obj = deferredAsync$default2.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            sportDetailStepLengthFragment2 = sportDetailStepLengthFragment;
            sportDetailStepLengthFragment2.setValueList((ArrayList) obj);
            SportDetailStepLengthFragment sportDetailStepLengthFragment5 = this.this$0;
            sportDetailStepLengthFragment5.printChartInt(SportDetailStepLengthFragment.TAG, sportDetailStepLengthFragment5.getValueList());
            this.this$0.bindData();
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
        SportBasicReport mSportValues = getMSportValues();
        Intrinsics.checkNotNull(mSportValues);
        Integer avgStepLength = SportReportComputeUtil.getAvgStepLength(mSportValues);
        SportRecordListModel sportRecordListModelCreateEntryListInner = SportRecordDataUtil.createEntryListInner(this.valueList);
        List<SportRecordEntry> sportRecordList = sportRecordListModelCreateEntryListInner.getSportRecordList();
        if (avgStepLength != null && avgStepLength.intValue() <= 200) {
            Intrinsics.checkNotNullExpressionValue(getString(j1j.O2, avgStepLength.toString()), "getString(...)");
            CustomLineChart customLineChart = this.mLineChart;
            Intrinsics.checkNotNull(customLineChart);
            CustomLineChart.setLimitLine$default(customLineChart, avgStepLength.intValue(), sportRecordListModelCreateEntryListInner.getValueRange(), 0.0f, 4, null);
        }
        CustomLineChart customLineChart2 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart2);
        customLineChart2.setChartKey(SportRecordKey.StepsLength);
        CustomLineChart customLineChart3 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart3);
        customLineChart3.bindStepLengthData(sportRecordList);
        CustomLineChart customLineChart4 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart4);
        customLineChart4.animateX(2000);
        Float fValueOf = avgStepLength != null ? Float.valueOf(avgStepLength.intValue()) : null;
        Integer num = this.maxStepLength;
        BaseSportDetailFragment.reportCardInfo$default(this, fValueOf, num != null ? Float.valueOf(num.intValue()) : null, null, 4, null);
    }

    private final void bindStepLengthData(Map<SportRecordKey, ? extends List<? extends Object>> map) {
        SportRecordKey sportRecordKey = SportRecordKey.StepsLength;
        if (map.containsKey(sportRecordKey)) {
            List<? extends Object> list = map.get(sportRecordKey);
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.data.common.data.sport.SportRecordItem>");
            List<? extends Object> list2 = list;
            if (this.valueList == null) {
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getMain(), null, new AnonymousClass1(list2, this, null), 2, null);
            }
        }
    }

    private final void createDetailModelList() {
        Integer avgStepLength;
        SportBasicReport mSportValues = getMSportValues();
        if (mSportValues == null || (avgStepLength = SportReportComputeUtil.getAvgStepLength(mSportValues)) == null) {
            return;
        }
        rz5 rz5Var = new rz5(getString(j1j.w3), String.valueOf(avgStepLength.intValue()));
        SportDetailItemView sportDetailItemView = this.itemView1;
        if (sportDetailItemView != null) {
            SportDetailItemView.bindData$default(sportDetailItemView, rz5Var, false, 2, null);
        }
    }

    private final void initChartData() {
        SportRecordDetailViewModel detailViewModel;
        MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonRunMaps;
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
            recordDetailMaps.observe(requireActivity(), new SportDetailStepLengthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mjn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailStepLengthFragment.initChartData$lambda$2(this.f26937a, (Map) obj);
                }
            }));
            return;
        }
        if (getMDetailSportType() != 2 || (detailViewModel = getDetailViewModel()) == null || (triathlonRunMaps = detailViewModel.getTriathlonRunMaps()) == null) {
            return;
        }
        triathlonRunMaps.observe(requireActivity(), new SportDetailStepLengthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: njn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailStepLengthFragment.initChartData$lambda$3(this.f27990a, (Map) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$2(SportDetailStepLengthFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindStepLengthData(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$3(SportDetailStepLengthFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindStepLengthData(map);
        return Unit.INSTANCE;
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
            setMBasicReport((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SportDetailStepLengthFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTraceBtmIntroduction("stride_frequency");
        WebViewUtilKt.startWebView$default(SportRecordConstants.INSTANCE.getUnderstandSportTypeUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), FitnessRecordKey.stride), this$0.getString(j1j.w7), false, false, null, false, null, false, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(SportDetailStepLengthFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) SportDetailLandActivity.class);
        intent.putExtra("sport_report", this$0.getMBasicReport());
        intent.putExtra(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_RECORD_KEY, SportRecordKey.StepsLength);
        intent.putExtra(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, this$0.getMDetailSportType());
        this$0.startActivity(intent);
    }

    @NotNull
    public final lga getBinding() {
        lga lgaVar = this._binding;
        Intrinsics.checkNotNull(lgaVar);
        return lgaVar;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return FitnessRecordKey.stride;
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
    public final Integer getMaxStepLength() {
        return this.maxStepLength;
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
        dataTitleSimpleView.bindData(hoi.c2, getString(j1j.k8));
        setAbnormalGuideListener(new View.OnClickListener() { // from class: ojn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailStepLengthFragment.initView$lambda$0(this.f29230a, view);
            }
        });
        DataTitleSimpleView dataTitleSimpleView2 = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView2);
        dataTitleSimpleView2.setGuideIcon(hoi.K0, getAbnormalGuideListener());
        ImageView ivExpandView = getIvExpandView();
        if (ivExpandView != null) {
            ivExpandView.setOnClickListener(new View.OnClickListener() { // from class: pjn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportDetailStepLengthFragment.initView$lambda$1(this.f30472a, view);
                }
            });
        }
        createDetailModelList();
        initBaseChart();
        initChartData();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = lga.A0(inflater, container, false);
        this.titleView = getBinding().B;
        this.itemViewContainer = getBinding().E;
        this.itemView2 = getBinding().D;
        this.itemView1 = getBinding().C;
        this.mLineChart = getBinding().A;
        setIvExpandView(getBinding().F);
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

    public final void setMaxStepLength(@Nullable Integer num) {
        this.maxStepLength = num;
    }

    public final void setTitleView(@Nullable DataTitleSimpleView dataTitleSimpleView) {
        this.titleView = dataTitleSimpleView;
    }

    public final void setValueList(@Nullable ArrayList<SportRecordItem> arrayList) {
        this.valueList = arrayList;
    }
}
