package com.xiaomi.fitness.detail.inner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
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
import com.xiaomi.fitness.detail.inner.SportDetailRowingFragment;
import com.xiaomi.fitness.detail.model.SportRecordListModel;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.rz5;
import defpackage.wfa;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 B2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\bA\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0017\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0019\u0010\u0004J\u0019\u0010\u001a\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\bR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R*\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0011\u0010@\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailRowingFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "", "initChartData", "()V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "bindData", "createDetailModelList", "", "getCardName", "()Ljava/lang/String;", "", "hasMaxMinAverage", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "initView", "onNewIntent", "Landroid/widget/LinearLayout;", "itemViewContainer", "Landroid/widget/LinearLayout;", "getItemViewContainer", "()Landroid/widget/LinearLayout;", "setItemViewContainer", "(Landroid/widget/LinearLayout;)V", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "itemView1", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "getItemView1", "()Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "setItemView1", "(Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;)V", "itemView2", "getItemView2", "setItemView2", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Lwfa;", "_binding", "Lwfa;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "valueList", "Ljava/util/ArrayList;", "getValueList", "()Ljava/util/ArrayList;", "setValueList", "(Ljava/util/ArrayList;)V", "getBinding", "()Lwfa;", "binding", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailRowingFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailRowingFragment";

    @Nullable
    private wfa _binding;

    @Nullable
    private SportDetailItemView itemView1;

    @Nullable
    private SportDetailItemView itemView2;

    @Nullable
    private LinearLayout itemViewContainer;

    @Nullable
    private DataTitleSimpleView titleView;

    @Nullable
    private ArrayList<SportRecordItem> valueList;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailRowingFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "report", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void switchDetailFragment(@NotNull SportBasicReport report, int sportType, int triathlonNum, @Nullable FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(report, "report");
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, report);
            bundle.putInt("sport_type", sportType);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag(SportDetailRowingFragment.TAG, triathlonNum, sportType);
            int i = bsi.m0;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailRowingFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindData() {
        Integer avgRowFreq;
        Integer bestRowFreq;
        if (isInvalid()) {
            return;
        }
        SportRecordListModel sportRecordListModelCreateEntryListInner = SportRecordDataUtil.createEntryListInner(this.valueList);
        List<SportRecordEntry> sportRecordList = sportRecordListModelCreateEntryListInner.getSportRecordList();
        SportBasicReport mSportValues = getMSportValues();
        Intrinsics.checkNotNull(mSportValues);
        if (mSportValues.getBestRowFreq() != null) {
            int i = j1j.x5;
            SportBasicReport mSportValues2 = getMSportValues();
            Intrinsics.checkNotNull(mSportValues2);
            Integer bestRowFreq2 = mSportValues2.getBestRowFreq();
            Intrinsics.checkNotNull(bestRowFreq2);
            String string = getString(i, Integer.toString(bestRowFreq2.intValue()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            CustomLineChart customLineChart = this.mLineChart;
            Intrinsics.checkNotNull(customLineChart);
            customLineChart.setMaxStr(string);
        }
        SportBasicReport mSportValues3 = getMSportValues();
        Intrinsics.checkNotNull(mSportValues3);
        if (mSportValues3.getAvgRowFreq() != null) {
            int i2 = j1j.O2;
            SportBasicReport mSportValues4 = getMSportValues();
            Intrinsics.checkNotNull(mSportValues4);
            Integer avgRowFreq2 = mSportValues4.getAvgRowFreq();
            Intrinsics.checkNotNull(avgRowFreq2);
            String string2 = getString(i2, Integer.toString(avgRowFreq2.intValue()));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            CustomLineChart customLineChart2 = this.mLineChart;
            Intrinsics.checkNotNull(customLineChart2);
            SportBasicReport mSportValues5 = getMSportValues();
            Intrinsics.checkNotNull(mSportValues5);
            Integer avgRowFreq3 = mSportValues5.getAvgRowFreq();
            Intrinsics.checkNotNull(avgRowFreq3);
            customLineChart2.setLimitLine(avgRowFreq3.intValue(), string2, sportRecordListModelCreateEntryListInner.getValueRange(), 0.0f);
        }
        CustomLineChart customLineChart3 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart3);
        customLineChart3.setChartKey(SportRecordKey.Frequency);
        CustomLineChart customLineChart4 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart4);
        CustomLineChart.bindData$default(customLineChart4, sportRecordList, LineDataSet.Mode.LINEAR, 0.0f, null, 0, 28, null);
        CustomLineChart customLineChart5 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart5);
        customLineChart5.animateX(2000);
        SportBasicReport mSportValues6 = getMSportValues();
        Float fValueOf = null;
        Float fValueOf2 = (mSportValues6 == null || (bestRowFreq = mSportValues6.getBestRowFreq()) == null) ? null : Float.valueOf(bestRowFreq.intValue());
        SportBasicReport mSportValues7 = getMSportValues();
        if (mSportValues7 != null && (avgRowFreq = mSportValues7.getAvgRowFreq()) != null) {
            fValueOf = Float.valueOf(avgRowFreq.intValue());
        }
        BaseSportDetailFragment.reportCardInfo$default(this, fValueOf, fValueOf2, null, 4, null);
    }

    private final void createDetailModelList() {
        SportBasicReport mSportValues = getMSportValues();
        Intrinsics.checkNotNull(mSportValues);
        if (mSportValues.getAvgRowFreq() != null) {
            String string = getString(j1j.q3);
            SportBasicReport mSportValues2 = getMSportValues();
            Intrinsics.checkNotNull(mSportValues2);
            Integer avgRowFreq = mSportValues2.getAvgRowFreq();
            Intrinsics.checkNotNull(avgRowFreq);
            rz5 rz5Var = new rz5(string, Integer.toString(avgRowFreq.intValue()));
            SportDetailItemView sportDetailItemView = this.itemView1;
            if (sportDetailItemView != null) {
                SportDetailItemView.bindData$default(sportDetailItemView, rz5Var, false, 2, null);
            }
        }
        SportBasicReport mSportValues3 = getMSportValues();
        Intrinsics.checkNotNull(mSportValues3);
        if (mSportValues3.getBestRowFreq() != null) {
            String string2 = getString(j1j.C3);
            SportBasicReport mSportValues4 = getMSportValues();
            Intrinsics.checkNotNull(mSportValues4);
            Integer bestRowFreq = mSportValues4.getBestRowFreq();
            Intrinsics.checkNotNull(bestRowFreq);
            rz5 rz5Var2 = new rz5(string2, Integer.toString(bestRowFreq.intValue()));
            SportDetailItemView sportDetailItemView2 = this.itemView2;
            if (sportDetailItemView2 != null) {
                SportDetailItemView.bindData$default(sportDetailItemView2, rz5Var2, false, 2, null);
            }
        }
    }

    private final void initChartData() {
        initDetailViewModel();
        if (getMSportValues() == null || isInvalid()) {
            return;
        }
        SportRecordDetailViewModel detailViewModel = getDetailViewModel();
        Intrinsics.checkNotNull(detailViewModel);
        detailViewModel.getRecordDetailMaps().observe(requireActivity(), new SportDetailRowingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: min
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailRowingFragment.initChartData$lambda$0(this.f26221a, (Map) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$0(SportDetailRowingFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportRecordKey sportRecordKey = SportRecordKey.Frequency;
        if (map.containsKey(sportRecordKey)) {
            SportBasicReport mSportValues = this$0.getMSportValues();
            Intrinsics.checkNotNull(mSportValues);
            if (mSportValues.getSportType() == 13) {
                Object obj = map.get(sportRecordKey);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.data.common.data.sport.SportRecordItem>");
                List list = (List) obj;
                if (this$0.valueList == null) {
                    LifecycleOwner viewLifecycleOwner = this$0.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getIO(), null, new SportDetailRowingFragment$initChartData$1$1(list, this$0, null), 2, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
        }
    }

    @NotNull
    public final wfa getBinding() {
        wfa wfaVar = this._binding;
        Intrinsics.checkNotNull(wfaVar);
        return wfaVar;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "paddle_frequency";
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
        dataTitleSimpleView.bindData(hoi.M0, getString(j1j.X1));
        initIvExpandViewClick(SportRecordKey.Frequency);
        createDetailModelList();
        initBaseChart();
        initChartData();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = wfa.A0(inflater, container, false);
        this.itemViewContainer = getBinding().E;
        this.itemView2 = getBinding().D;
        this.itemView1 = getBinding().C;
        this.titleView = getBinding().B;
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

    public final void setTitleView(@Nullable DataTitleSimpleView dataTitleSimpleView) {
        this.titleView = dataTitleSimpleView;
    }

    public final void setValueList(@Nullable ArrayList<SportRecordItem> arrayList) {
        this.valueList = arrayList;
    }
}
