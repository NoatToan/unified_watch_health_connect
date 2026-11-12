package com.xiaomi.fitness.detail.inner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
import com.xiaomi.fit.data.common.data.sport.SwimmingPassage;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.inner.SportDetailSwimPaceFragment;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.b9h;
import defpackage.bsi;
import defpackage.dro;
import defpackage.fro;
import defpackage.gro;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.mx5;
import defpackage.o5o;
import defpackage.rz5;
import defpackage.uga;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
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
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 c2\u00020\u00012\u00020\u0002:\u0001cB\u0007¢\u0006\u0004\bb\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\u00032\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0019\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u0017\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010#\u001a\u00020\"2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0003H\u0004¢\u0006\u0004\b%\u0010\u0005J\u000f\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010\u0005J\u000f\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010\u0005R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010=\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00108\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR6\u0010F\u001a\u0016\u0012\u0004\u0012\u00020D\u0018\u00010Cj\n\u0012\u0004\u0012\u00020D\u0018\u0001`E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR(\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00140L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010\u0016\"\u0004\bP\u0010QR(\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00140L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010N\u001a\u0004\bS\u0010\u0016\"\u0004\bT\u0010QR(\u0010V\u001a\b\u0012\u0004\u0012\u00020U0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010N\u001a\u0004\bW\u0010\u0016\"\u0004\bX\u0010QR\u0016\u0010Z\u001a\u00020Y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\\8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010^R\u0011\u0010a\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006d"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailSwimPaceFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "Lb9h;", "", "initChartData", "()V", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "map", "bindSwimSwolfData", "(Ljava/util/Map;)V", "bindData", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "createDetailModelList", "initRecycler", "Lgro;", "createDataList", "()Ljava/util/List;", "", "getCardName", "()Ljava/lang/String;", "", "hasMaxMinAverage", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "initView", "onLoadMore", "onShowPassage", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Landroid/widget/LinearLayout;", "itemViewContainer", "Landroid/widget/LinearLayout;", "getItemViewContainer", "()Landroid/widget/LinearLayout;", "setItemViewContainer", "(Landroid/widget/LinearLayout;)V", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "itemView1", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "getItemView1", "()Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "setItemView1", "(Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;)V", "itemView2", "getItemView2", "setItemView2", "Luga;", "_binding", "Luga;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "Lkotlin/collections/ArrayList;", "valueList", "Ljava/util/ArrayList;", "getValueList", "()Ljava/util/ArrayList;", "setValueList", "(Ljava/util/ArrayList;)V", "", "mDataList", "Ljava/util/List;", "getMDataList", "setMDataList", "(Ljava/util/List;)V", "mOriginalList", "getMOriginalList", "setMOriginalList", "Lcom/xiaomi/fit/data/common/data/sport/SwimmingPassage;", "sportItemList", "getSportItemList", "setSportItemList", "Ldro;", "mAdapter", "Ldro;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerSegment", "Landroidx/recyclerview/widget/RecyclerView;", "getBinding", "()Luga;", "binding", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailSwimPaceFragment extends BaseSportDetailFragment implements b9h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailSwimPaceFragment";

    @Nullable
    private uga _binding;

    @Nullable
    private SportDetailItemView itemView1;

    @Nullable
    private SportDetailItemView itemView2;

    @Nullable
    private LinearLayout itemViewContainer;
    private dro mAdapter;
    private RecyclerView recyclerSegment;

    @Nullable
    private DataTitleSimpleView titleView;

    @Nullable
    private ArrayList<SportRecordItem> valueList;

    @NotNull
    private List<gro> mDataList = new ArrayList();

    @NotNull
    private List<gro> mOriginalList = new ArrayList();

    @NotNull
    private List<SwimmingPassage> sportItemList = CollectionsKt__CollectionsKt.emptyList();

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailSwimPaceFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "sportItemList", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SwimmingPassage;", "Ljava/util/ArrayList;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "mBasicReport", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;IIILjava/util/ArrayList;Landroidx/fragment/app/FragmentManager;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void switchDetailFragment(@NotNull SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType, @Nullable ArrayList<SwimmingPassage> sportItemList, @Nullable FragmentManager fragmentManager, @Nullable SportBasicReport mBasicReport) {
            Intrinsics.checkNotNullParameter(sportValues, "sportValues");
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putInt("sport_type", sportType);
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, sportDetailType);
            bundle.putParcelableArrayList(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_ITEM_DISTANCE_LIST, sportItemList);
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT, mBasicReport);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag(SportDetailSwimPaceFragment.TAG, triathlonNum, sportType);
            int i = bsi.C0;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailSwimPaceFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailSwimPaceFragment$bindSwimSwolfData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailSwimPaceFragment$bindSwimSwolfData$1", f = "SportDetailSwimPaceFragment.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<SportRecordItem> $swolfList;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<SportRecordItem> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$swolfList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = SportDetailSwimPaceFragment.this.new AnonymousClass1(this.$swolfList, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SportDetailSwimPaceFragment sportDetailSwimPaceFragment;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new SportDetailSwimPaceFragment$bindSwimSwolfData$1$valueListTask$1(this.$swolfList, SportDetailSwimPaceFragment.this, null), 2, null);
                SportDetailSwimPaceFragment sportDetailSwimPaceFragment2 = SportDetailSwimPaceFragment.this;
                this.L$0 = sportDetailSwimPaceFragment2;
                this.label = 1;
                obj = deferredAsync$default.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sportDetailSwimPaceFragment = sportDetailSwimPaceFragment2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sportDetailSwimPaceFragment = (SportDetailSwimPaceFragment) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            sportDetailSwimPaceFragment.setValueList((ArrayList) obj);
            o5o.e().p(SportDetailSwimPaceFragment.this.getValueList());
            SportDetailSwimPaceFragment sportDetailSwimPaceFragment3 = SportDetailSwimPaceFragment.this;
            sportDetailSwimPaceFragment3.printChartInt(SportDetailSwimPaceFragment.TAG, sportDetailSwimPaceFragment3.getValueList());
            SportDetailSwimPaceFragment.this.bindData();
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
        SportBasicReport mSportValues;
        YAxis axisRight;
        YAxis axisRight2;
        CustomLineChart customLineChart = this.mLineChart;
        if (customLineChart != null && (axisRight2 = customLineChart.getAxisRight()) != null) {
            axisRight2.r(true);
        }
        CustomLineChart customLineChart2 = this.mLineChart;
        if (customLineChart2 != null && (axisRight = customLineChart2.getAxisRight()) != null) {
            axisRight.setValueFormatter(new mx5());
        }
        if (isInvalid() || (arrayList = this.valueList) == null) {
            return;
        }
        List<SportRecordEntry> sportRecordList = SportRecordDataUtil.createEntryListInner(arrayList).getSportRecordList();
        CustomLineChart customLineChart3 = this.mLineChart;
        if (customLineChart3 == null || (mSportValues = getMSportValues()) == null) {
            return;
        }
        customLineChart3.setChartKey(SportRecordKey.SwimPace);
        CustomLineChart.bindData$default(customLineChart3, sportRecordList, LineDataSet.Mode.LINEAR, 0.0f, null, mSportValues.getDuration(), 12, null);
        customLineChart3.animateX(2000);
    }

    private final void bindSwimSwolfData(Map<SportRecordKey, ? extends List<? extends Object>> map) {
        SportRecordKey sportRecordKey = SportRecordKey.SwimPace;
        if (map.containsKey(sportRecordKey)) {
            List<? extends Object> list = map.get(sportRecordKey);
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.data.common.data.sport.SportRecordItem>");
            List<? extends Object> list2 = list;
            if (this.valueList == null) {
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getMain(), null, new AnonymousClass1(list2, null), 2, null);
            }
        }
    }

    private final List<gro> createDataList() {
        this.mDataList.clear();
        ArrayList arrayList = new ArrayList();
        if (this.sportItemList.isEmpty()) {
            return arrayList;
        }
        int size = this.sportItemList.size();
        int duration = 0;
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            SwimmingPassage swimmingPassage = this.sportItemList.get(i2);
            long duration2 = swimmingPassage.getDuration();
            Integer pace = swimmingPassage.getPace();
            Intrinsics.checkNotNull(pace);
            int iIntValue = pace.intValue();
            Integer swolf = swimmingPassage.getSwolf();
            Intrinsics.checkNotNull(swolf);
            int iIntValue2 = swolf.intValue();
            Integer swimmingPosture = swimmingPassage.getSwimmingPosture();
            Intrinsics.checkNotNull(swimmingPosture);
            gro groVar = new gro(i, duration2, 100.0f, iIntValue, 0, iIntValue2, swimmingPosture.intValue());
            duration += (int) swimmingPassage.getDuration();
            arrayList.add(groVar);
            if (i % 5 == 0) {
                arrayList.add(new gro(duration, i * 100, 1));
            }
            i++;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0077  */
    private final void createDetailModelList() {
        Float fValueOf;
        SportBasicReport mSportValues = getMSportValues();
        if (mSportValues == null) {
            BaseSportDetailFragment.reportCardInfo$default(this, null, null, null, 7, null);
            return;
        }
        if (mSportValues.getDistance() != null) {
            SportReportComputeUtil sportReportComputeUtil = SportReportComputeUtil.INSTANCE;
            SportBasicReport mSportValues2 = getMSportValues();
            Intrinsics.checkNotNull(mSportValues2);
            Integer avgPace = sportReportComputeUtil.getAvgPace(mSportValues2);
            if (avgPace != null) {
                String string = getString(j1j.O2, TimeDateUtil.getSportPaceStrWithSecDef(avgPace.intValue()));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                CustomLineChart customLineChart = this.mLineChart;
                if (customLineChart != null) {
                    CustomLineChart.setLimitLine$default(customLineChart, avgPace.intValue(), string, 1.0f, 0.0f, 8, null);
                }
                rz5 rz5Var = new rz5(getString(j1j.y7), TimeDateUtil.getSportPaceStrWithSecDef(avgPace.intValue()));
                SportDetailItemView sportDetailItemView = this.itemView1;
                if (sportDetailItemView != null) {
                    SportDetailItemView.bindData$default(sportDetailItemView, rz5Var, 0, false, false, 12, null);
                }
            }
            if (avgPace != null) {
                fValueOf = Float.valueOf(avgPace.intValue());
            } else {
                fValueOf = null;
            }
        } else {
            fValueOf = null;
        }
        Integer maxPace = mSportValues.getMaxPace();
        if (maxPace != null) {
            rz5 rz5Var2 = new rz5(getString(j1j.R), TimeDateUtil.getSportPaceStrWithSecDef(maxPace.intValue()));
            SportDetailItemView sportDetailItemView2 = this.itemView2;
            if (sportDetailItemView2 != null) {
                SportDetailItemView.bindData$default(sportDetailItemView2, rz5Var2, 0, false, false, 12, null);
            }
        }
        Integer maxPace2 = mSportValues.getMaxPace();
        BaseSportDetailFragment.reportCardInfo$default(this, fValueOf, maxPace2 != null ? Float.valueOf(maxPace2.intValue()) : null, null, 4, null);
    }

    private final void initChartData() {
        SportRecordDetailViewModel detailViewModel;
        MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonSwimMaps;
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
            recordDetailMaps.observe(requireActivity(), new SportDetailSwimPaceFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wjn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailSwimPaceFragment.initChartData$lambda$0(this.f38037a, (Map) obj);
                }
            }));
            return;
        }
        if (getMDetailSportType() != 0 || (detailViewModel = getDetailViewModel()) == null || (triathlonSwimMaps = detailViewModel.getTriathlonSwimMaps()) == null) {
            return;
        }
        triathlonSwimMaps.observe(requireActivity(), new SportDetailSwimPaceFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xjn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailSwimPaceFragment.initChartData$lambda$1(this.f39194a, (Map) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$0(SportDetailSwimPaceFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindSwimSwolfData(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$1(SportDetailSwimPaceFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindSwimSwolfData(map);
        return Unit.INSTANCE;
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
            setMBasicReport((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT));
            List<SwimmingPassage> parcelableArrayList = bundle.getParcelableArrayList(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_ITEM_DISTANCE_LIST);
            if (parcelableArrayList == null) {
                parcelableArrayList = CollectionsKt__CollectionsKt.emptyList();
            }
            this.sportItemList = parcelableArrayList;
        }
    }

    private final void initRecycler() {
        this.mDataList = new ArrayList();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity());
        RecyclerView recyclerView = this.recyclerSegment;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerSegment");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        fro froVar = new fro();
        RecyclerView recyclerView3 = this.recyclerSegment;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerSegment");
            recyclerView3 = null;
        }
        recyclerView3.addItemDecoration(froVar);
        this.mAdapter = new dro(requireActivity(), this.mDataList, this);
        List<gro> listCreateDataList = createDataList();
        if (listCreateDataList.isEmpty()) {
            RecyclerView recyclerView4 = this.recyclerSegment;
            if (recyclerView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerSegment");
            } else {
                recyclerView2 = recyclerView4;
            }
            recyclerView2.setVisibility(8);
            return;
        }
        RecyclerView recyclerView5 = this.recyclerSegment;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerSegment");
            recyclerView5 = null;
        }
        recyclerView5.setVisibility(0);
        ListExtKt.addAll(this.mOriginalList, listCreateDataList);
        dro droVar = this.mAdapter;
        if (droVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            droVar = null;
        }
        droVar.m(this.mOriginalList);
        if (listCreateDataList.size() > getMaxShowCountNum() + 1) {
            dro droVar2 = this.mAdapter;
            if (droVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                droVar2 = null;
            }
            droVar2.setBottomCount(1);
            listCreateDataList = listCreateDataList.subList(0, getMaxShowCountNum() + 1);
        } else {
            dro droVar3 = this.mAdapter;
            if (droVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                droVar3 = null;
            }
            droVar3.setBottomCount(0);
        }
        ListExtKt.addAll(this.mDataList, listCreateDataList);
        dro droVar4 = this.mAdapter;
        if (droVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            droVar4 = null;
        }
        droVar4.notifyDataSetChanged();
        RecyclerView recyclerView6 = this.recyclerSegment;
        if (recyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerSegment");
            recyclerView6 = null;
        }
        dro droVar5 = this.mAdapter;
        if (droVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            droVar5 = null;
        }
        recyclerView6.setAdapter(droVar5);
        RecyclerView recyclerView7 = this.recyclerSegment;
        if (recyclerView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerSegment");
        } else {
            recyclerView2 = recyclerView7;
        }
        recyclerView2.setNestedScrollingEnabled(false);
    }

    @NotNull
    public final uga getBinding() {
        uga ugaVar = this._binding;
        Intrinsics.checkNotNull(ugaVar);
        return ugaVar;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "swim_pace";
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

    @NotNull
    public final List<gro> getMDataList() {
        return this.mDataList;
    }

    @NotNull
    public final List<gro> getMOriginalList() {
        return this.mOriginalList;
    }

    @NotNull
    public final List<SwimmingPassage> getSportItemList() {
        return this.sportItemList;
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
        dataTitleSimpleView.bindData(hoi.U1, getString(j1j.R9));
        initIvExpandViewClick(SportRecordKey.SwimPace);
        createDetailModelList();
        initBaseChart();
        initChartData();
        initRecycler();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = uga.A0(inflater, container, false);
        this.itemViewContainer = getBinding().E;
        this.itemView2 = getBinding().D;
        this.itemView1 = getBinding().C;
        this.titleView = getBinding().B;
        this.mLineChart = getBinding().A;
        setIvExpandView(getBinding().F);
        RecyclerView recyclerView = getBinding().G;
        Intrinsics.checkNotNull(recyclerView);
        this.recyclerSegment = recyclerView;
        initView();
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // defpackage.b9h
    public void onLoadMore() {
        if (this.mOriginalList.size() > 0) {
            this.mDataList.clear();
        }
        this.mDataList.addAll(this.mOriginalList);
        dro droVar = this.mAdapter;
        if (droVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            droVar = null;
        }
        droVar.notifyDataSetChanged();
    }

    @Override // defpackage.b9h
    public void onShowPassage() {
        this.mDataList.clear();
        new ArrayList();
        this.mDataList.addAll(this.mOriginalList.size() > getMaxShowCountNum() + 1 ? this.mOriginalList.subList(0, getMaxShowCountNum() + 1) : this.mOriginalList);
        dro droVar = this.mAdapter;
        if (droVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            droVar = null;
        }
        droVar.notifyDataSetChanged();
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

    public final void setMDataList(@NotNull List<gro> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mDataList = list;
    }

    public final void setMOriginalList(@NotNull List<gro> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mOriginalList = list;
    }

    public final void setSportItemList(@NotNull List<SwimmingPassage> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sportItemList = list;
    }

    public final void setTitleView(@Nullable DataTitleSimpleView dataTitleSimpleView) {
        this.titleView = dataTitleSimpleView;
    }

    public final void setValueList(@Nullable ArrayList<SportRecordItem> arrayList) {
        this.valueList = arrayList;
    }
}
