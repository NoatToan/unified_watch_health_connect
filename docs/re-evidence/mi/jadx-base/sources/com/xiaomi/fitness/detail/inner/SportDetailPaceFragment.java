package com.xiaomi.fitness.detail.inner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.inner.SportDetailPaceFragment;
import com.xiaomi.fitness.detail.util.SportDetailUtil;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.a0o;
import defpackage.b0o;
import defpackage.b9h;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.o5o;
import defpackage.pin;
import defpackage.tb2;
import defpackage.wea;
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
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0001WB\u0007¢\u0006\u0004\bV\u0010\u0015J)\u0010\t\u001a\u00020\b2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\b2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00052\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J-\u0010'\u001a\u00020&2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\u0015J\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010\u0015J\u0019\u0010.\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b.\u0010\u000eJ\u000f\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010\u0015J\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010\u0015R\"\u00102\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR*\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\u001aR*\u0010H\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010O\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001e\u0010U\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010I¨\u0006X"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailPaceFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "Lb9h;", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "map", "", "bindWholeKMPointData", "(Ljava/util/Map;)V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "", DailyRecordKey.sportType, "", "getPaceMaxLevel", "(I)F", "initSegmentRecycler", "()V", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "distanceList", "addDistanceList", "(Ljava/util/ArrayList;)V", "Lb0o;", "createDataList", "(Ljava/util/ArrayList;)Ljava/util/List;", "", "getCardName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_START, "initView", "onNewIntent", "onLoadMore", "onShowPassage", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerSegment", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerSegment", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerSegment", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Lwea;", "mBinding", "Lwea;", "valueList", "Ljava/util/ArrayList;", "getValueList", "()Ljava/util/ArrayList;", "setValueList", "", "mDataList", "Ljava/util/List;", "getMDataList", "()Ljava/util/List;", "setMDataList", "(Ljava/util/List;)V", "Lpin;", "mAdapter", "Lpin;", "getMAdapter", "()Lpin;", "setMAdapter", "(Lpin;)V", "originalDataList", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailPaceFragment extends BaseSportDetailFragment implements b9h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private pin mAdapter;

    @Nullable
    private wea mBinding;

    @Nullable
    private List<b0o> mDataList;

    @Nullable
    private List<b0o> originalDataList;
    public RecyclerView recyclerSegment;
    public DataTitleSimpleView titleView;

    @Nullable
    private ArrayList<SportRecordItem> valueList;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailPaceFragment$Companion;", "", "<init>", "()V", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "mBasicReport", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            BaseSportDetailFragment.switchFragment(bsi.d0, SportDetailPaceFragment.class, BaseSportDetailFragment.createFragmentTag("SportDetailPaceFragment", triathlonNum, sportType), bundle, fragmentManager);
        }
    }

    private final void addDistanceList(ArrayList<SportRecordItem> distanceList) {
        List<b0o> list = this.mDataList;
        if (list != null && list != null) {
            list.clear();
        }
        this.originalDataList = new ArrayList();
        List<b0o> listCreateDataList = createDataList(distanceList);
        tb2.b(listCreateDataList);
        if (listCreateDataList.isEmpty()) {
            getRecyclerSegment().setVisibility(8);
            return;
        }
        getRecyclerSegment().setVisibility(0);
        List<b0o> list2 = this.originalDataList;
        if (list2 != null) {
            list2.addAll(listCreateDataList);
        }
        pin pinVar = this.mAdapter;
        if (pinVar != null) {
            pinVar.n(this.originalDataList);
        }
        if (listCreateDataList.size() > getMaxShowCountNum() + 2) {
            pin pinVar2 = this.mAdapter;
            Intrinsics.checkNotNull(pinVar2);
            pinVar2.setBottomCount(1);
            listCreateDataList = listCreateDataList.subList(0, getMaxShowCountNum() + 2);
        } else {
            pin pinVar3 = this.mAdapter;
            Intrinsics.checkNotNull(pinVar3);
            pinVar3.setBottomCount(0);
        }
        List<b0o> list3 = this.mDataList;
        if (list3 != null) {
            list3.addAll(listCreateDataList);
        }
        pin pinVar4 = this.mAdapter;
        Intrinsics.checkNotNull(pinVar4);
        pinVar4.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindWholeKMPointData(Map<SportRecordKey, ? extends List<? extends Object>> map) {
        SportRecordKey sportRecordKey = SportRecordKey.WholeKMPoint;
        if (map.containsKey(sportRecordKey)) {
            addDistanceList(SportDetailUtil.INSTANCE.computeDistancePoint(map.get(sportRecordKey)));
        }
        SportRecordKey sportRecordKey2 = SportRecordKey.Pace;
        if (map.containsKey(sportRecordKey2)) {
            List<? extends Object> list = map.get(sportRecordKey2);
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.data.common.data.sport.SportRecordItem>");
            o5o.e().m(list);
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
                    if (fFloatValue < 0.1d) {
                        return arrayList2;
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

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
            this.sportType = bundle.getInt("sport_type");
        }
    }

    private final void initSegmentRecycler() {
        this.mDataList = new ArrayList();
        getRecyclerSegment().setLayoutManager(new LinearLayoutManager(requireActivity()));
        getRecyclerSegment().addItemDecoration(new a0o());
        this.mAdapter = new pin(requireActivity(), this.mDataList, this, 1);
        getRecyclerSegment().setAdapter(this.mAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(SportDetailPaceFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindWholeKMPointData(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(SportDetailPaceFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindWholeKMPointData(map);
        return Unit.INSTANCE;
    }

    @JvmStatic
    public static final void switchDetailFragment(@NotNull SportBasicReport sportBasicReport, int i, int i2, int i3, @NotNull FragmentManager fragmentManager, @Nullable SportBasicReport sportBasicReport2) {
        INSTANCE.switchDetailFragment(sportBasicReport, i, i2, i3, fragmentManager, sportBasicReport2);
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "each_km_pace";
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

    public final void initView() {
        initParamsFromBundle(getArguments());
        getTitleView().bindData(hoi.U1, getString(j1j.T7));
        initSegmentRecycler();
        initBaseChart();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        wea weaVarA0 = wea.A0(inflater, container, false);
        this.mBinding = weaVarA0;
        Intrinsics.checkNotNull(weaVarA0);
        setRecyclerSegment(weaVarA0.C);
        wea weaVar = this.mBinding;
        Intrinsics.checkNotNull(weaVar);
        setTitleView(weaVar.B);
        wea weaVar2 = this.mBinding;
        Intrinsics.checkNotNull(weaVar2);
        CustomLineChart customLineChart = weaVar2.A;
        this.mLineChart = customLineChart;
        if (customLineChart != null) {
            customLineChart.setVisibility(8);
        }
        initView();
        wea weaVar3 = this.mBinding;
        Intrinsics.checkNotNull(weaVar3);
        View root = weaVar3.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // defpackage.b9h
    public void onLoadMore() {
        List<b0o> list;
        onTraceBtnLoad("pace", true);
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
        onTraceBtnLoad("pace", false);
        List<b0o> list2 = this.mDataList;
        if (list2 != null) {
            list2.clear();
        }
        List<b0o> list3 = this.originalDataList;
        if ((list3 != null ? list3.size() : 0) > getMaxShowCountNum() + 2) {
            List<b0o> list4 = this.originalDataList;
            listSubList = list4 != null ? list4.subList(0, getMaxShowCountNum() + 2) : null;
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
            recordDetailMaps.observe(requireActivity(), new SportDetailPaceFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ohn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailPaceFragment.onStart$lambda$0(this.f29185a, (Map) obj);
                }
            }));
            return;
        }
        if (getMDetailSportType() != 2 || (detailViewModel = getDetailViewModel()) == null || (triathlonRunMaps = detailViewModel.getTriathlonRunMaps()) == null) {
            return;
        }
        triathlonRunMaps.observe(requireActivity(), new SportDetailPaceFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: phn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailPaceFragment.onStart$lambda$1(this.f30402a, (Map) obj);
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
}
