package com.xiaomi.fitness.detail.inner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.LineDataSet;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.RecoverRateData;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.chart.RecoverRateXAxis;
import com.xiaomi.fitness.detail.chart.RecoverRateXAxisRenderer;
import com.xiaomi.fitness.detail.inner.SportRecoverRateFragment;
import com.xiaomi.fitness.detail.util.SportRecordConstants;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.hwq;
import defpackage.j1j;
import defpackage.lfa;
import defpackage.ryp;
import defpackage.rz5;
import defpackage.xd5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b0\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J+\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0014¢\u0006\u0004\b \u0010\u0004J\u0019\u0010!\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b!\u0010\u0010R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R*\u0010+\u001a\u0016\u0012\u0004\u0012\u00020)\u0018\u00010(j\n\u0012\u0004\u0012\u00020)\u0018\u0001`*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportRecoverRateFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "", "initView", "()V", Constants.KEY_REQUEST_DATA, "", "recoverRateRadio", "", "startRate", "endRate", "updateTopTitle", "(FLjava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fit/data/common/data/sport/RecoverRateData;", "data", "updateChart", "(Lcom/xiaomi/fit/data/common/data/sport/RecoverRateData;)V", "", "getCardName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "initBaseChart", "onNewIntent", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "Llfa;", "mBinding", "Llfa;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "Lkotlin/collections/ArrayList;", "valueList", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "itemViewCenter", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportRecoverRateFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportRecoverRateUI";

    @Nullable
    private SportDetailItemView itemViewCenter;

    @Nullable
    private lfa mBinding;

    @Nullable
    private DataTitleSimpleView titleView;

    @Nullable
    private ArrayList<SportRecordItem> valueList;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportRecoverRateFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag("SportRecoverRateFragment", triathlonNum, sportType);
            int i = bsi.k0;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportRecoverRateFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            this.sportType = bundle.getInt("sport_type");
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
        }
    }

    private final void initView() {
        initParamsFromBundle(getArguments());
        DataTitleSimpleView dataTitleSimpleView = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView);
        dataTitleSimpleView.bindData(hoi.I0, getString(j1j.f22331r));
        setAbnormalGuideListener(new View.OnClickListener() { // from class: eun
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportRecoverRateFragment.initView$lambda$0(this.f17082a, view);
            }
        });
        DataTitleSimpleView dataTitleSimpleView2 = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView2);
        dataTitleSimpleView2.setGuideIcon(hoi.K0, getAbnormalGuideListener());
        initBaseChart();
        requestData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SportRecoverRateFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTraceBtmIntroduction("hr_recovery");
        WebViewUtilKt.startWebView$default(SportRecordConstants.INSTANCE.getUnderstandSportTypeUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), "hr_recovery"), this$0.getString(j1j.f22331r), false, false, null, false, null, false, 252, null);
    }

    private final void requestData() {
        SportRecordDetailViewModel detailViewModel;
        MutableLiveData<RecoverRateData> recoverRateDataLiveData;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        setDetailViewModel((SportRecordDetailViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(SportRecordDetailViewModel.class));
        if ((getMDetailSportType() != -1 && this.sportType != 1) || (detailViewModel = getDetailViewModel()) == null || (recoverRateDataLiveData = detailViewModel.getRecoverRateDataLiveData()) == null) {
            return;
        }
        recoverRateDataLiveData.observe(requireActivity(), new SportRecoverRateFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fun
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecoverRateFragment.requestData$lambda$1(this.f18260a, (RecoverRateData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$1(SportRecoverRateFragment this$0, RecoverRateData recoverRateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "requestRecoverRateData result " + recoverRateData);
        if (recoverRateData != null) {
            this$0.updateTopTitle(recoverRateData.getRecoverRateRadio(), recoverRateData.getStartRate(), recoverRateData.getEndRate());
            this$0.updateChart(recoverRateData);
        }
        return Unit.INSTANCE;
    }

    private final void updateChart(RecoverRateData data) {
        if (isInvalid()) {
            return;
        }
        List<Integer> recoverRateList = data.getRecoverRateList();
        if (recoverRateList == null) {
            recoverRateList = new ArrayList<>();
        }
        if (recoverRateList.size() > 120) {
            recoverRateList = recoverRateList.subList(0, 120);
        }
        ArrayList arrayList = new ArrayList();
        int size = recoverRateList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new SportRecordEntry(i, recoverRateList.get(i).intValue(), data.getRecoverTime() + ((long) i), 3));
        }
        CustomLineChart customLineChart = this.mLineChart;
        if (customLineChart != null) {
            customLineChart.setChartKey(SportRecordKey.Hr);
        }
        CustomLineChart customLineChart2 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart2);
        customLineChart2.setMaxStr("111");
        CustomLineChart customLineChart3 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart3);
        CustomLineChart.bindData$default(customLineChart3, arrayList, LineDataSet.Mode.LINEAR, 0.0f, null, 0, 28, null);
    }

    private final void updateTopTitle(float recoverRateRadio, Integer startRate, Integer endRate) {
        String string;
        String string2;
        rz5 rz5Var = new rz5(getString(j1j.h6), String.valueOf(recoverRateRadio));
        SportDetailItemView itemViewLeft = getItemViewLeft();
        if (itemViewLeft != null) {
            SportDetailItemView.bindData$default(itemViewLeft, rz5Var, 0, false, false, 12, null);
        }
        String string3 = getString(j1j.i6);
        String str = "--";
        if (startRate == null || (string = startRate.toString()) == null) {
            string = "--";
        }
        rz5 rz5Var2 = new rz5(string3, string);
        SportDetailItemView sportDetailItemView = this.itemViewCenter;
        if (sportDetailItemView != null) {
            SportDetailItemView.bindData$default(sportDetailItemView, rz5Var2, 0, false, false, 12, null);
        }
        String string4 = getString(j1j.g6);
        if (endRate != null && (string2 = endRate.toString()) != null) {
            str = string2;
        }
        rz5 rz5Var3 = new rz5(string4, str);
        SportDetailItemView itemViewRight = getItemViewRight();
        if (itemViewRight != null) {
            SportDetailItemView.bindData$default(itemViewRight, rz5Var3, 0, false, false, 12, null);
        }
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "recover_heart_rate";
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    public void initBaseChart() {
        super.initBaseChart();
        RecoverRateXAxis recoverRateXAxis = new RecoverRateXAxis();
        recoverRateXAxis.setLabelCount(3);
        CustomLineChart customLineChart = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart);
        hwq viewPortHandler = customLineChart.getViewPortHandler();
        CustomLineChart customLineChart2 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart2);
        ryp transformer = customLineChart2.getTransformer(YAxis.AxisDependency.LEFT);
        xd5 xd5Var = this.mLineChartAttr;
        Intrinsics.checkNotNull(xd5Var);
        RecoverRateXAxisRenderer recoverRateXAxisRenderer = new RecoverRateXAxisRenderer(viewPortHandler, recoverRateXAxis, transformer, xd5Var);
        CustomLineChart customLineChart3 = this.mLineChart;
        if (customLineChart3 != null) {
            customLineChart3.customXAxis(recoverRateXAxis, recoverRateXAxisRenderer);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        lfa lfaVarA0 = lfa.A0(inflater, container, false);
        this.mBinding = lfaVarA0;
        Intrinsics.checkNotNull(lfaVarA0);
        this.titleView = lfaVarA0.B;
        lfa lfaVar = this.mBinding;
        Intrinsics.checkNotNull(lfaVar);
        this.mLineChart = lfaVar.A;
        lfa lfaVar2 = this.mBinding;
        Intrinsics.checkNotNull(lfaVar2);
        setItemViewLeft(lfaVar2.C);
        lfa lfaVar3 = this.mBinding;
        Intrinsics.checkNotNull(lfaVar3);
        this.itemViewCenter = lfaVar3.D;
        lfa lfaVar4 = this.mBinding;
        Intrinsics.checkNotNull(lfaVar4);
        setItemViewRight(lfaVar4.E);
        initView();
        lfa lfaVar5 = this.mBinding;
        Intrinsics.checkNotNull(lfaVar5);
        View root = lfaVar5.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }
}
