package com.xiaomi.fitness.detail.inner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.inner.SportDetailSkippingSegmentFragment;
import com.xiaomi.fitness.detail.recycler.SportSkippingSegmentItemDecoration;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.b0o;
import defpackage.b9h;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.qea;
import defpackage.uin;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0001ZB\u0007¢\u0006\u0004\bY\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\u00032\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u001f\u0010\u0014\u001a\u00020\u00032\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\"\u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0003¢\u0006\u0004\b$\u0010\u0005J\u0019\u0010%\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b%\u0010\u0010J\u000f\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010\u0005J\u000f\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010\u0005R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u0010:\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R6\u0010B\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010@j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR(\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00160H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010\u0015R$\u0010O\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001c\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00160H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010JR\u0011\u0010X\u001a\u0002068F¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006["}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailSkippingSegmentFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "Lb9h;", "", "initChartData", "()V", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "map", "bindSpeedData", "(Ljava/util/Map;)V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "initSegmentRecycler", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "distanceList", "addDistanceList", "(Ljava/util/List;)V", "Lb0o;", "createDataList", "(Ljava/util/List;)Ljava/util/List;", "", "getCardName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "initView", "onNewIntent", "onLoadMore", "onShowPassage", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerSegment", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerSegment", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerSegment", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Lqea;", "_binding", "Lqea;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "mSportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getMSportReport", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "setMSportReport", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "valueList", "Ljava/util/ArrayList;", "getValueList", "()Ljava/util/ArrayList;", "setValueList", "(Ljava/util/ArrayList;)V", "", "mDataList", "Ljava/util/List;", "getMDataList", "()Ljava/util/List;", "setMDataList", "Luin;", "mAdapter", "Luin;", "getMAdapter", "()Luin;", "setMAdapter", "(Luin;)V", "originalDataList", "getBinding", "()Lqea;", "binding", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailSkippingSegmentFragment extends BaseSportDetailFragment implements b9h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailSkippingSegmentFragment";

    @Nullable
    private qea _binding;

    @Nullable
    private uin mAdapter;

    @Nullable
    private SportBasicReport mSportReport;

    @Nullable
    private RecyclerView recyclerSegment;

    @Nullable
    private DataTitleSimpleView titleView;

    @Nullable
    private ArrayList<SportRecordItem> valueList;

    @NotNull
    private List<b0o> mDataList = new ArrayList();

    @NotNull
    private List<b0o> originalDataList = new ArrayList();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailSkippingSegmentFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void switchDetailFragment(@NotNull SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType, @NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(sportValues, "sportValues");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putInt("sport_type", sportType);
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, sportDetailType);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            BaseSportDetailFragment.switchFragment(bsi.r0, SportDetailSkippingSegmentFragment.class, BaseSportDetailFragment.createFragmentTag(SportDetailSkippingSegmentFragment.TAG, triathlonNum, sportType), bundle, fragmentManager);
        }
    }

    private final void addDistanceList(List<SportRecordItem> distanceList) {
        this.mDataList.clear();
        this.originalDataList = new ArrayList();
        List<b0o> listCreateDataList = createDataList(distanceList);
        Logger.i("SportDetailFragment", "bind Skipping detail segment item data!! addDistanceList() size " + listCreateDataList.size());
        if (listCreateDataList.isEmpty()) {
            RecyclerView recyclerView = this.recyclerSegment;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            return;
        }
        RecyclerView recyclerView2 = this.recyclerSegment;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setVisibility(0);
        this.originalDataList.addAll(listCreateDataList);
        uin uinVar = this.mAdapter;
        if (uinVar != null) {
            uinVar.j(this.originalDataList);
        }
        if (listCreateDataList.size() > getMaxShowCountNum()) {
            uin uinVar2 = this.mAdapter;
            Intrinsics.checkNotNull(uinVar2);
            uinVar2.setBottomCount(1);
            listCreateDataList = listCreateDataList.subList(0, getMaxShowCountNum());
        } else {
            uin uinVar3 = this.mAdapter;
            Intrinsics.checkNotNull(uinVar3);
            uinVar3.setBottomCount(0);
        }
        this.mDataList.addAll(listCreateDataList);
        uin uinVar4 = this.mAdapter;
        Intrinsics.checkNotNull(uinVar4);
        uinVar4.notifyDataSetChanged();
    }

    private final void bindSpeedData(Map<SportRecordKey, ? extends List<? extends Object>> map) {
        SportRecordKey sportRecordKey = SportRecordKey.RopeSkipStumbleInfo;
        if (map.containsKey(sportRecordKey)) {
            Logger.i(TAG, "bind Skipping detail segment item data!!");
            List<SportRecordItem> list = (List) map.get(sportRecordKey);
            printChartInt(TAG, list);
            addDistanceList(list);
        }
    }

    private final List<b0o> createDataList(List<SportRecordItem> distanceList) {
        ArrayList arrayList = new ArrayList();
        if (distanceList != null && !distanceList.isEmpty()) {
            int size = distanceList.size();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                SportRecordItem sportRecordItem = distanceList.get(i3);
                arrayList.add(new b0o(i, sportRecordItem.getDuration(), sportRecordItem.getValue().floatValue(), sportRecordItem.getValue().intValue(), 0));
                if (((b0o) arrayList.get(i2)).m < sportRecordItem.getValue().floatValue()) {
                    i2 = i3;
                }
                i++;
            }
            if (size > 1) {
                ((b0o) arrayList.get(i2)).e = 1;
            }
        }
        return arrayList;
    }

    private final void initChartData() {
        SportRecordDetailViewModel detailViewModel;
        MutableLiveData<Map<SportRecordKey, List<Object>>> recordDetailMaps;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        setDetailViewModel((SportRecordDetailViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(SportRecordDetailViewModel.class));
        if (this.mSportReport == null || isInvalid() || (detailViewModel = getDetailViewModel()) == null || (recordDetailMaps = detailViewModel.getRecordDetailMaps()) == null) {
            return;
        }
        recordDetailMaps.observe(requireActivity(), new SportDetailSkippingSegmentFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: win
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailSkippingSegmentFragment.initChartData$lambda$0(this.f38012a, (Map) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$0(SportDetailSkippingSegmentFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "bind Skipping Segment detail data!!");
        Intrinsics.checkNotNull(map);
        this$0.bindSpeedData(map);
        return Unit.INSTANCE;
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            SportBasicReport sportBasicReport = (SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES);
            this.mSportReport = sportBasicReport;
            setMSportValues(sportBasicReport);
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
        }
    }

    private final void initSegmentRecycler() {
        this.mDataList = new ArrayList();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity());
        RecyclerView recyclerView = this.recyclerSegment;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        SportSkippingSegmentItemDecoration sportSkippingSegmentItemDecoration = new SportSkippingSegmentItemDecoration();
        RecyclerView recyclerView2 = this.recyclerSegment;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(sportSkippingSegmentItemDecoration);
        this.mAdapter = new uin(requireActivity(), this.mDataList, this);
        RecyclerView recyclerView3 = this.recyclerSegment;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mAdapter);
    }

    @JvmStatic
    public static final void switchDetailFragment(@NotNull SportBasicReport sportBasicReport, int i, int i2, int i3, @NotNull FragmentManager fragmentManager) {
        INSTANCE.switchDetailFragment(sportBasicReport, i, i2, i3, fragmentManager);
    }

    @NotNull
    public final qea getBinding() {
        qea qeaVar = this._binding;
        Intrinsics.checkNotNull(qeaVar);
        return qeaVar;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "rope_continuous_jump";
    }

    @Nullable
    public final uin getMAdapter() {
        return this.mAdapter;
    }

    @NotNull
    public final List<b0o> getMDataList() {
        return this.mDataList;
    }

    @Nullable
    public final SportBasicReport getMSportReport() {
        return this.mSportReport;
    }

    @Nullable
    public final RecyclerView getRecyclerSegment() {
        return this.recyclerSegment;
    }

    @Nullable
    public final DataTitleSimpleView getTitleView() {
        return this.titleView;
    }

    @Nullable
    public final ArrayList<SportRecordItem> getValueList() {
        return this.valueList;
    }

    public final void initView() {
        initParamsFromBundle(getArguments());
        DataTitleSimpleView dataTitleSimpleView = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView);
        dataTitleSimpleView.bindData(hoi.b1, getString(j1j.r7));
        initSegmentRecycler();
        initBaseChart();
        initChartData();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = qea.A0(inflater, container, false);
        this.recyclerSegment = getBinding().C;
        this.titleView = getBinding().B;
        CustomLineChart customLineChart = getBinding().A;
        this.mLineChart = customLineChart;
        if (customLineChart != null) {
            customLineChart.setVisibility(8);
        }
        initView();
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // defpackage.b9h
    public void onLoadMore() {
        if (this.originalDataList.size() > 0) {
            this.mDataList.clear();
        }
        this.mDataList.addAll(this.originalDataList);
        uin uinVar = this.mAdapter;
        if (uinVar != null) {
            uinVar.notifyDataSetChanged();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }

    @Override // defpackage.b9h
    public void onShowPassage() {
        this.mDataList.clear();
        this.mDataList.addAll(this.originalDataList.size() > getMaxShowCountNum() ? this.originalDataList.subList(0, getMaxShowCountNum()) : this.originalDataList);
        uin uinVar = this.mAdapter;
        if (uinVar != null) {
            uinVar.notifyDataSetChanged();
        }
    }

    public final void setMAdapter(@Nullable uin uinVar) {
        this.mAdapter = uinVar;
    }

    public final void setMDataList(@NotNull List<b0o> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mDataList = list;
    }

    public final void setMSportReport(@Nullable SportBasicReport sportBasicReport) {
        this.mSportReport = sportBasicReport;
    }

    public final void setRecyclerSegment(@Nullable RecyclerView recyclerView) {
        this.recyclerSegment = recyclerView;
    }

    public final void setTitleView(@Nullable DataTitleSimpleView dataTitleSimpleView) {
        this.titleView = dataTitleSimpleView;
    }

    public final void setValueList(@Nullable ArrayList<SportRecordItem> arrayList) {
        this.valueList = arrayList;
    }
}
