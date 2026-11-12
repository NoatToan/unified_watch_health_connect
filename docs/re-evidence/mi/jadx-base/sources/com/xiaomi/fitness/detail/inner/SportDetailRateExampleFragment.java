package com.xiaomi.fitness.detail.inner;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.github.mikephil.charting.data.LineDataSet;
import com.mibi.sdk.common.MibiSdkConstants;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.inner.SportDetailRateExampleFragment;
import com.xiaomi.fitness.detail.model.SportRateFloatingHolder;
import com.xiaomi.fitness.detail.util.HrmUtil;
import com.xiaomi.fitness.detail.view.BubblePopupWindow;
import com.xiaomi.fitness.heartrate.finger.CustomizedFingerprintAcquiredInfo;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import com.xiaomi.fitness.widget.distribute.HrmDistribute;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.mi_connect_sdk.BuildConfig;
import defpackage.a0o;
import defpackage.b0o;
import defpackage.bsi;
import defpackage.dde;
import defpackage.dki;
import defpackage.dn5;
import defpackage.hoi;
import defpackage.ifa;
import defpackage.j1j;
import defpackage.pin;
import defpackage.rz5;
import defpackage.yd5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 W2\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\bV\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u001f\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010$\u001a\u00020#2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b&\u0010\tJ\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00142\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R6\u0010@\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\u0011\"\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR*\u0010I\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010P\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailRateExampleFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "", "initView", "()V", "initChartData", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "initDistributeRecycler", "displayHrmDist", "bindData", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "Lkotlin/collections/ArrayList;", "buildTestRateList", "()Ljava/util/ArrayList;", "", "type", "", "", "getHeartValueList", "(I)Ljava/util/List;", "", "getCardName", "()Ljava/lang/String;", "", "hasMaxMinAverage", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onNewIntent", "Landroid/content/Context;", "context", "Lb0o;", "createTestHrmDistributeModel", "(Landroid/content/Context;)Ljava/util/List;", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerBottom", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerBottom", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerBottom", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recyclerDistribute", "getRecyclerDistribute", "setRecyclerDistribute", "Lifa;", "mBinding", "Lifa;", "valueList", "Ljava/util/ArrayList;", "getValueList", "setValueList", "(Ljava/util/ArrayList;)V", "Lcom/xiaomi/fitness/detail/model/SportRateFloatingHolder;", "floatingHolder", "Lcom/xiaomi/fitness/detail/model/SportRateFloatingHolder;", "", "mDistributeList", "Ljava/util/List;", "getMDistributeList", "()Ljava/util/List;", "setMDistributeList", "(Ljava/util/List;)V", "Lpin;", "mDistributeViewAdapter", "Lpin;", "getMDistributeViewAdapter", "()Lpin;", "setMDistributeViewAdapter", "(Lpin;)V", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailRateExampleFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailRateFragment";
    private SportRateFloatingHolder floatingHolder;

    @Nullable
    private ifa mBinding;

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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailRateExampleFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "mBasicReport", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void switchDetailFragment$default(Companion companion, SportBasicReport sportBasicReport, int i, int i2, int i3, FragmentManager fragmentManager, SportBasicReport sportBasicReport2, int i4, Object obj) {
            if ((i4 & 32) != 0) {
                sportBasicReport2 = null;
            }
            companion.switchDetailFragment(sportBasicReport, i, i2, i3, fragmentManager, sportBasicReport2);
        }

        public final void switchDetailFragment(@NotNull SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType, @Nullable FragmentManager fragmentManager, @Nullable SportBasicReport mBasicReport) {
            Intrinsics.checkNotNullParameter(sportValues, "sportValues");
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putInt("sport_type", sportType);
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, sportDetailType);
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT, mBasicReport);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag("SportDetailRateFragment", triathlonNum, sportType);
            int i = bsi.i0;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailRateExampleFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    private final void bindData() {
        if (isInvalid()) {
            return;
        }
        ArrayList<SportRecordItem> arrayListBuildTestRateList = buildTestRateList();
        this.valueList = arrayListBuildTestRateList;
        List<SportRecordEntry> sportRecordList = SportRecordDataUtil.createEntryListInner(arrayListBuildTestRateList).getSportRecordList();
        rz5 rz5Var = new rz5(getString(j1j.P7), "158");
        SportDetailItemView itemViewRight = getItemViewRight();
        if (itemViewRight != null) {
            SportDetailItemView.bindData$default(itemViewRight, rz5Var, 0, false, false, 12, null);
        }
        rz5 rz5Var2 = new rz5(getString(j1j.x7), "122");
        SportDetailItemView itemViewLeft = getItemViewLeft();
        if (itemViewLeft != null) {
            SportDetailItemView.bindData$default(itemViewLeft, rz5Var2, 0, false, false, 12, null);
        }
        List<Float> heartValueList = getHeartValueList(0);
        ArrayList arrayList = new ArrayList();
        ListExtKt.add(arrayList, Integer.valueOf(ExtUtilsKt.getColor(dki.D)));
        ListExtKt.add(arrayList, Integer.valueOf(ExtUtilsKt.getColor(dki.C)));
        ListExtKt.add(arrayList, Integer.valueOf(ExtUtilsKt.getColor(dki.z)));
        ListExtKt.add(arrayList, Integer.valueOf(ExtUtilsKt.getColor(dki.A)));
        ListExtKt.add(arrayList, Integer.valueOf(ExtUtilsKt.getColor(dki.B)));
        CustomLineChart customLineChart = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart);
        customLineChart.getAxisRight();
        CustomLineChart customLineChart2 = this.mLineChart;
        if (customLineChart2 != null) {
            customLineChart2.setChartKey(SportRecordKey.Hr);
        }
        CustomLineChart customLineChart3 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart3);
        CustomLineChart.bindData$default(customLineChart3, sportRecordList, LineDataSet.Mode.LINEAR, 0.0f, null, 0, 28, null);
        CustomLineChart customLineChart4 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart4);
        dn5 renderer = customLineChart4.getRenderer();
        Intrinsics.checkNotNull(renderer, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChartRenderer");
        ((yd5) renderer).setHeartLine(true, heartValueList, arrayList);
        BaseSportDetailFragment.reportCardInfo$default(this, Float.valueOf(122.0f), Float.valueOf(158.0f), null, 4, null);
    }

    private final ArrayList<SportRecordItem> buildTestRateList() {
        SportRecordItem sportRecordItem = new SportRecordItem(1714395166L, 1714395167L, 80, 0, 0, 16, null);
        SportRecordItem sportRecordItem2 = new SportRecordItem(1714395166L, 1714395171L, Double.valueOf(77.0d), 5, 0, 16, null);
        SportRecordItem sportRecordItem3 = new SportRecordItem(1714395171L, 1714395176L, Double.valueOf(76.0d), 10, 0, 16, null);
        SportRecordItem sportRecordItem4 = new SportRecordItem(1714395176L, 1714395181L, Double.valueOf(77.0d), 15, 0, 16, null);
        SportRecordItem sportRecordItem5 = new SportRecordItem(1714395181L, 1714395186L, Double.valueOf(80.0d), 20, 0, 16, null);
        SportRecordItem sportRecordItem6 = new SportRecordItem(1714395186L, 1714395191L, Double.valueOf(84.0d), 25, 0, 16, null);
        SportRecordItem sportRecordItem7 = new SportRecordItem(1714395191L, 1714395196L, Double.valueOf(90.0d), 30, 0, 16, null);
        SportRecordItem sportRecordItem8 = new SportRecordItem(1714395196L, 1714395201L, Double.valueOf(95.0d), 35, 0, 16, null);
        Double dValueOf = Double.valueOf(94.0d);
        SportRecordItem sportRecordItem9 = new SportRecordItem(1714395201L, 1714395206L, dValueOf, 40, 0, 16, null);
        SportRecordItem sportRecordItem10 = new SportRecordItem(1714395206L, 1714395211L, Double.valueOf(93.0d), 45, 0, 16, null);
        SportRecordItem sportRecordItem11 = new SportRecordItem(1714395211L, 1714395216L, dValueOf, 50, 0, 16, null);
        SportRecordItem sportRecordItem12 = new SportRecordItem(1714395216L, 1714395221L, Double.valueOf(93.0d), 55, 0, 16, null);
        SportRecordItem sportRecordItem13 = new SportRecordItem(1714395221L, 1714395226L, Double.valueOf(100.0d), 60, 0, 16, null);
        SportRecordItem sportRecordItem14 = new SportRecordItem(1714395226L, 1714395231L, Double.valueOf(93.0d), 65, 0, 16, null);
        SportRecordItem sportRecordItem15 = new SportRecordItem(1714395231L, 1714395236L, Double.valueOf(93.0d), 70, 0, 16, null);
        SportRecordItem sportRecordItem16 = new SportRecordItem(1714395236L, 1714395241L, Double.valueOf(90.0d), 75, 0, 16, null);
        SportRecordItem sportRecordItem17 = new SportRecordItem(1714395241L, 1714395246L, Double.valueOf(88.0d), 80, 0, 16, null);
        SportRecordItem sportRecordItem18 = new SportRecordItem(1714395246L, 1714395251L, Double.valueOf(97.0d), 85, 0, 16, null);
        SportRecordItem sportRecordItem19 = new SportRecordItem(1714395251L, 1714395256L, Double.valueOf(109.0d), 90, 0, 16, null);
        SportRecordItem sportRecordItem20 = new SportRecordItem(1714395256L, 1714395261L, Double.valueOf(113.0d), 95, 0, 16, null);
        SportRecordItem sportRecordItem21 = new SportRecordItem(1714395261L, 1714395266L, Double.valueOf(111.0d), 100, 0, 16, null);
        Double dValueOf2 = Double.valueOf(115.0d);
        SportRecordItem sportRecordItem22 = new SportRecordItem(1714395266L, 1714395271L, dValueOf2, 105, 0, 16, null);
        Double dValueOf3 = Double.valueOf(122.0d);
        SportRecordItem sportRecordItem23 = new SportRecordItem(1714395271L, 1714395276L, dValueOf3, 110, 0, 16, null);
        Double dValueOf4 = Double.valueOf(124.0d);
        SportRecordItem sportRecordItem24 = new SportRecordItem(1714395276L, 1714395281L, dValueOf4, 115, 0, 16, null);
        SportRecordItem sportRecordItem25 = new SportRecordItem(1714395281L, 1714395286L, dValueOf4, 120, 0, 16, null);
        Double dValueOf5 = Double.valueOf(125.0d);
        SportRecordItem sportRecordItem26 = new SportRecordItem(1714395286L, 1714395291L, dValueOf5, 125, 0, 16, null);
        Double dValueOf6 = Double.valueOf(127.0d);
        SportRecordItem sportRecordItem27 = new SportRecordItem(1714395291L, 1714395296L, dValueOf6, 130, 0, 16, null);
        SportRecordItem sportRecordItem28 = new SportRecordItem(1714395296L, 1714395301L, dValueOf5, 135, 0, 16, null);
        Double dValueOf7 = Double.valueOf(130.0d);
        SportRecordItem sportRecordItem29 = new SportRecordItem(1714395301L, 1714395306L, dValueOf7, 140, 0, 16, null);
        SportRecordItem sportRecordItem30 = new SportRecordItem(1714395306L, 1714395311L, dValueOf6, 145, 0, 16, null);
        Double dValueOf8 = Double.valueOf(133.0d);
        SportRecordItem sportRecordItem31 = new SportRecordItem(1714395311L, 1714395316L, dValueOf8, 150, 0, 16, null);
        Double dValueOf9 = Double.valueOf(139.0d);
        SportRecordItem sportRecordItem32 = new SportRecordItem(1714395316L, 1714395321L, dValueOf9, 155, 0, 16, null);
        SportRecordItem sportRecordItem33 = new SportRecordItem(1714395321L, 1714395326L, dValueOf8, 160, 0, 16, null);
        SportRecordItem sportRecordItem34 = new SportRecordItem(1714395326L, 1714395331L, dValueOf4, 165, 0, 16, null);
        Double dValueOf10 = Double.valueOf(118.0d);
        SportRecordItem sportRecordItem35 = new SportRecordItem(1714395331L, 1714395336L, dValueOf10, 170, 0, 16, null);
        SportRecordItem sportRecordItem36 = new SportRecordItem(1714395336L, 1714395341L, Double.valueOf(114.0d), 175, 0, 16, null);
        SportRecordItem sportRecordItem37 = new SportRecordItem(1714395341L, 1714395346L, Double.valueOf(113.0d), 180, 0, 16, null);
        SportRecordItem sportRecordItem38 = new SportRecordItem(1714395346L, 1714395351L, Double.valueOf(111.0d), 185, 0, 16, null);
        SportRecordItem sportRecordItem39 = new SportRecordItem(1714395351L, 1714395356L, dValueOf2, SportReportBaseParser.ReportType.maxWaterTemperature, 0, 16, null);
        Double dValueOf11 = Double.valueOf(121.0d);
        SportRecordItem sportRecordItem40 = new SportRecordItem(1714395356L, 1714395361L, dValueOf11, SportReportBaseParser.ReportType.oxygenPartialPressureThreshold, 0, 16, null);
        SportRecordItem sportRecordItem41 = new SportRecordItem(1714395361L, 1714395366L, Double.valueOf(123.0d), 200, 0, 16, null);
        SportRecordItem sportRecordItem42 = new SportRecordItem(1714395366L, 1714395371L, dValueOf5, 205, 0, 16, null);
        SportRecordItem sportRecordItem43 = new SportRecordItem(1714395371L, 1714395376L, dValueOf6, 210, 0, 16, null);
        Double dValueOf12 = Double.valueOf(128.0d);
        SportRecordItem sportRecordItem44 = new SportRecordItem(1714395376L, 1714395381L, dValueOf12, 215, 0, 16, null);
        SportRecordItem sportRecordItem45 = new SportRecordItem(1714395381L, 1714395386L, Double.valueOf(142.0d), 220, 0, 16, null);
        SportRecordItem sportRecordItem46 = new SportRecordItem(1714395386L, 1714395391L, Double.valueOf(144.0d), SportReportBaseParser.ReportType.maxFreq, 0, 16, null);
        SportRecordItem sportRecordItem47 = new SportRecordItem(1714395391L, 1714395396L, dValueOf9, 230, 0, 16, null);
        SportRecordItem sportRecordItem48 = new SportRecordItem(1714395396L, 1714395401L, Double.valueOf(137.0d), 235, 0, 16, null);
        SportRecordItem sportRecordItem49 = new SportRecordItem(1714395401L, 1714395406L, Double.valueOf(135.0d), 240, 0, 16, null);
        SportRecordItem sportRecordItem50 = new SportRecordItem(1714395406L, 1714395411L, Double.valueOf(140.0d), 245, 0, 16, null);
        SportRecordItem sportRecordItem51 = new SportRecordItem(1714395411L, 1714395416L, dValueOf9, 250, 0, 16, null);
        SportRecordItem sportRecordItem52 = new SportRecordItem(1714395416L, 1714395421L, Double.valueOf(138.0d), 255, 0, 16, null);
        SportRecordItem sportRecordItem53 = new SportRecordItem(1714395421L, 1714395426L, dValueOf8, 260, 0, 16, null);
        SportRecordItem sportRecordItem54 = new SportRecordItem(1714395426L, 1714395431L, dValueOf12, 265, 0, 16, null);
        SportRecordItem sportRecordItem55 = new SportRecordItem(1714395431L, 1714395436L, dValueOf12, 270, 0, 16, null);
        Double dValueOf13 = Double.valueOf(129.0d);
        SportRecordItem sportRecordItem56 = new SportRecordItem(1714395436L, 1714395441L, dValueOf13, 275, 0, 16, null);
        SportRecordItem sportRecordItem57 = new SportRecordItem(1714395441L, 1714395446L, dValueOf13, 280, 0, 16, null);
        SportRecordItem sportRecordItem58 = new SportRecordItem(1714395446L, 1714395451L, Double.valueOf(134.0d), 285, 0, 16, null);
        SportRecordItem sportRecordItem59 = new SportRecordItem(1714395451L, 1714395456L, Double.valueOf(134.0d), 290, 0, 16, null);
        SportRecordItem sportRecordItem60 = new SportRecordItem(1714395456L, 1714395461L, Double.valueOf(135.0d), 295, 0, 16, null);
        SportRecordItem sportRecordItem61 = new SportRecordItem(1714395461L, 1714395466L, dValueOf13, 300, 0, 16, null);
        SportRecordItem sportRecordItem62 = new SportRecordItem(1714395466L, 1714395471L, dValueOf5, 305, 0, 16, null);
        SportRecordItem sportRecordItem63 = new SportRecordItem(1714395471L, 1714395476L, dValueOf5, 310, 0, 16, null);
        SportRecordItem sportRecordItem64 = new SportRecordItem(1714395476L, 1714395481L, dValueOf6, 315, 0, 16, null);
        SportRecordItem sportRecordItem65 = new SportRecordItem(1714395481L, 1714395486L, dValueOf7, 320, 0, 16, null);
        SportRecordItem sportRecordItem66 = new SportRecordItem(1714395486L, 1714395491L, Double.valueOf(137.0d), 325, 0, 16, null);
        SportRecordItem sportRecordItem67 = new SportRecordItem(1714395491L, 1714395496L, Double.valueOf(132.0d), 330, 0, 16, null);
        SportRecordItem sportRecordItem68 = new SportRecordItem(1714395496L, 1714395501L, Double.valueOf(131.0d), 335, 0, 16, null);
        SportRecordItem sportRecordItem69 = new SportRecordItem(1714395501L, 1714395506L, Double.valueOf(131.0d), 340, 0, 16, null);
        SportRecordItem sportRecordItem70 = new SportRecordItem(1714395506L, 1714395511L, Double.valueOf(126.0d), 345, 0, 16, null);
        SportRecordItem sportRecordItem71 = new SportRecordItem(1714395511L, 1714395516L, dValueOf8, 350, 0, 16, null);
        SportRecordItem sportRecordItem72 = new SportRecordItem(1714395516L, 1714395521L, Double.valueOf(140.0d), 355, 0, 16, null);
        SportRecordItem sportRecordItem73 = new SportRecordItem(1714395521L, 1714395526L, Double.valueOf(149.0d), SpatialRelationUtil.A_CIRCLE_DEGREE, 0, 16, null);
        SportRecordItem sportRecordItem74 = new SportRecordItem(1714395526L, 1714395531L, Double.valueOf(157.0d), 365, 0, 16, null);
        SportRecordItem sportRecordItem75 = new SportRecordItem(1714395531L, 1714395536L, Double.valueOf(158.0d), BuildConfig.MiConnectVersionBuild, 0, 16, null);
        SportRecordItem sportRecordItem76 = new SportRecordItem(1714395536L, 1714395541L, Double.valueOf(157.0d), 375, 0, 16, null);
        SportRecordItem sportRecordItem77 = new SportRecordItem(1714395541L, 1714395546L, Double.valueOf(158.0d), 380, 0, 16, null);
        SportRecordItem sportRecordItem78 = new SportRecordItem(1714395546L, 1714395551L, Double.valueOf(158.0d), 385, 0, 16, null);
        SportRecordItem sportRecordItem79 = new SportRecordItem(1714395551L, 1714395556L, Double.valueOf(155.0d), 390, 0, 16, null);
        SportRecordItem sportRecordItem80 = new SportRecordItem(1714395556L, 1714395561L, Double.valueOf(154.0d), 395, 0, 16, null);
        SportRecordItem sportRecordItem81 = new SportRecordItem(1714395561L, 1714395566L, Double.valueOf(152.0d), 400, 0, 16, null);
        SportRecordItem sportRecordItem82 = new SportRecordItem(1714395566L, 1714395571L, Double.valueOf(146.0d), 405, 0, 16, null);
        SportRecordItem sportRecordItem83 = new SportRecordItem(1714395571L, 1714395576L, Double.valueOf(140.0d), 410, 0, 16, null);
        SportRecordItem sportRecordItem84 = new SportRecordItem(1714395576L, 1714395581L, Double.valueOf(142.0d), 415, 0, 16, null);
        SportRecordItem sportRecordItem85 = new SportRecordItem(1714395581L, 1714395586L, Double.valueOf(142.0d), 420, 0, 16, null);
        SportRecordItem sportRecordItem86 = new SportRecordItem(1714395586L, 1714395591L, Double.valueOf(144.0d), MibiSdkConstants.REQUEST_MIBI, 0, 16, null);
        SportRecordItem sportRecordItem87 = new SportRecordItem(1714395591L, 1714395596L, Double.valueOf(145.0d), 430, 0, 16, null);
        SportRecordItem sportRecordItem88 = new SportRecordItem(1714395596L, 1714395601L, Double.valueOf(146.0d), 435, 0, 16, null);
        SportRecordItem sportRecordItem89 = new SportRecordItem(1714395601L, 1714395606L, Double.valueOf(142.0d), 440, 0, 16, null);
        SportRecordItem sportRecordItem90 = new SportRecordItem(1714395606L, 1714395611L, dValueOf9, 445, 0, 16, null);
        SportRecordItem sportRecordItem91 = new SportRecordItem(1714395611L, 1714395616L, Double.valueOf(136.0d), 450, 0, 16, null);
        SportRecordItem sportRecordItem92 = new SportRecordItem(1714395616L, 1714395621L, dValueOf9, 455, 0, 16, null);
        SportRecordItem sportRecordItem93 = new SportRecordItem(1714395621L, 1714395626L, dValueOf13, 460, 0, 16, null);
        SportRecordItem sportRecordItem94 = new SportRecordItem(1714395626L, 1714395631L, dValueOf4, 465, 0, 16, null);
        SportRecordItem sportRecordItem95 = new SportRecordItem(1714395631L, 1714395636L, Double.valueOf(126.0d), 470, 0, 16, null);
        SportRecordItem sportRecordItem96 = new SportRecordItem(1714395636L, 1714395641L, dValueOf12, 475, 0, 16, null);
        SportRecordItem sportRecordItem97 = new SportRecordItem(1714395641L, 1714395646L, dValueOf4, 480, 0, 16, null);
        SportRecordItem sportRecordItem98 = new SportRecordItem(1714395646L, 1714395651L, dValueOf8, 485, 0, 16, null);
        SportRecordItem sportRecordItem99 = new SportRecordItem(1714395651L, 1714395656L, Double.valueOf(137.0d), 490, 0, 16, null);
        SportRecordItem sportRecordItem100 = new SportRecordItem(1714395656L, 1714395661L, Double.valueOf(136.0d), 495, 0, 16, null);
        SportRecordItem sportRecordItem101 = new SportRecordItem(1714395661L, 1714395666L, Double.valueOf(137.0d), 500, 0, 16, null);
        SportRecordItem sportRecordItem102 = new SportRecordItem(1714395666L, 1714395671L, dValueOf8, 505, 0, 16, null);
        SportRecordItem sportRecordItem103 = new SportRecordItem(1714395671L, 1714395676L, dValueOf5, 510, 0, 16, null);
        SportRecordItem sportRecordItem104 = new SportRecordItem(1714395676L, 1714395681L, dValueOf10, SportSummary.VERSION_203, 0, 16, null);
        Double dValueOf14 = Double.valueOf(116.0d);
        SportRecordItem sportRecordItem105 = new SportRecordItem(1714395681L, 1714395686L, dValueOf14, SportSummary.VERSION_208, 0, 16, null);
        SportRecordItem sportRecordItem106 = new SportRecordItem(1714395686L, 1714395691L, Double.valueOf(123.0d), 525, 0, 16, null);
        SportRecordItem sportRecordItem107 = new SportRecordItem(1714395691L, 1714395696L, dValueOf10, 530, 0, 16, null);
        SportRecordItem sportRecordItem108 = new SportRecordItem(1714395696L, 1714395701L, Double.valueOf(113.0d), 535, 0, 16, null);
        SportRecordItem sportRecordItem109 = new SportRecordItem(1714395701L, 1714395706L, dValueOf2, 540, 0, 16, null);
        SportRecordItem sportRecordItem110 = new SportRecordItem(1714395706L, 1714395711L, dValueOf14, 545, 0, 16, null);
        SportRecordItem sportRecordItem111 = new SportRecordItem(1714395711L, 1714395716L, dValueOf14, 550, 0, 16, null);
        Double dValueOf15 = Double.valueOf(117.0d);
        return CollectionsKt__CollectionsKt.arrayListOf(sportRecordItem, sportRecordItem2, sportRecordItem3, sportRecordItem4, sportRecordItem5, sportRecordItem6, sportRecordItem7, sportRecordItem8, sportRecordItem9, sportRecordItem10, sportRecordItem11, sportRecordItem12, sportRecordItem13, sportRecordItem14, sportRecordItem15, sportRecordItem16, sportRecordItem17, sportRecordItem18, sportRecordItem19, sportRecordItem20, sportRecordItem21, sportRecordItem22, sportRecordItem23, sportRecordItem24, sportRecordItem25, sportRecordItem26, sportRecordItem27, sportRecordItem28, sportRecordItem29, sportRecordItem30, sportRecordItem31, sportRecordItem32, sportRecordItem33, sportRecordItem34, sportRecordItem35, sportRecordItem36, sportRecordItem37, sportRecordItem38, sportRecordItem39, sportRecordItem40, sportRecordItem41, sportRecordItem42, sportRecordItem43, sportRecordItem44, sportRecordItem45, sportRecordItem46, sportRecordItem47, sportRecordItem48, sportRecordItem49, sportRecordItem50, sportRecordItem51, sportRecordItem52, sportRecordItem53, sportRecordItem54, sportRecordItem55, sportRecordItem56, sportRecordItem57, sportRecordItem58, sportRecordItem59, sportRecordItem60, sportRecordItem61, sportRecordItem62, sportRecordItem63, sportRecordItem64, sportRecordItem65, sportRecordItem66, sportRecordItem67, sportRecordItem68, sportRecordItem69, sportRecordItem70, sportRecordItem71, sportRecordItem72, sportRecordItem73, sportRecordItem74, sportRecordItem75, sportRecordItem76, sportRecordItem77, sportRecordItem78, sportRecordItem79, sportRecordItem80, sportRecordItem81, sportRecordItem82, sportRecordItem83, sportRecordItem84, sportRecordItem85, sportRecordItem86, sportRecordItem87, sportRecordItem88, sportRecordItem89, sportRecordItem90, sportRecordItem91, sportRecordItem92, sportRecordItem93, sportRecordItem94, sportRecordItem95, sportRecordItem96, sportRecordItem97, sportRecordItem98, sportRecordItem99, sportRecordItem100, sportRecordItem101, sportRecordItem102, sportRecordItem103, sportRecordItem104, sportRecordItem105, sportRecordItem106, sportRecordItem107, sportRecordItem108, sportRecordItem109, sportRecordItem110, sportRecordItem111, new SportRecordItem(1714395716L, 1714395721L, dValueOf15, 555, 0, 16, null), new SportRecordItem(1714395721L, 1714395726L, dValueOf2, 560, 0, 16, null), new SportRecordItem(1714395726L, 1714395731L, Double.valueOf(111.0d), 565, 0, 16, null), new SportRecordItem(1714395731L, 1714395736L, dValueOf2, 570, 0, 16, null), new SportRecordItem(1714395736L, 1714395741L, dValueOf15, 575, 0, 16, null), new SportRecordItem(1714395741L, 1714395746L, Double.valueOf(112.0d), 580, 0, 16, null), new SportRecordItem(1714395746L, 1714395751L, dValueOf10, 585, 0, 16, null), new SportRecordItem(1714395751L, 1714395756L, dValueOf12, 590, 0, 16, null), new SportRecordItem(1714395756L, 1714395761L, Double.valueOf(138.0d), 595, 0, 16, null), new SportRecordItem(1714395761L, 1714395766L, Double.valueOf(145.0d), 600, 0, 16, null), new SportRecordItem(1714395766L, 1714395771L, Double.valueOf(146.0d), 605, 0, 16, null), new SportRecordItem(1714395771L, 1714395776L, Double.valueOf(149.0d), 610, 0, 16, null), new SportRecordItem(1714395776L, 1714395781L, Double.valueOf(151.0d), 615, 0, 16, null), new SportRecordItem(1714395781L, 1714395786L, Double.valueOf(152.0d), 620, 0, 16, null), new SportRecordItem(1714395786L, 1714395791L, Double.valueOf(152.0d), 625, 0, 16, null), new SportRecordItem(1714395791L, 1714395796L, Double.valueOf(153.0d), 630, 0, 16, null), new SportRecordItem(1714395796L, 1714395801L, Double.valueOf(157.0d), 635, 0, 16, null), new SportRecordItem(1714395801L, 1714395806L, Double.valueOf(158.0d), GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 0, 16, null), new SportRecordItem(1714395806L, 1714395811L, Double.valueOf(154.0d), 645, 0, 16, null), new SportRecordItem(1714395811L, 1714395816L, Double.valueOf(146.0d), 650, 0, 16, null), new SportRecordItem(1714395816L, 1714395821L, Double.valueOf(141.0d), 655, 0, 16, null), new SportRecordItem(1714395821L, 1714395826L, Double.valueOf(140.0d), 660, 0, 16, null), new SportRecordItem(1714395826L, 1714395831L, Double.valueOf(145.0d), 665, 0, 16, null), new SportRecordItem(1714395831L, 1714395836L, Double.valueOf(144.0d), 670, 0, 16, null), new SportRecordItem(1714395836L, 1714395841L, Double.valueOf(142.0d), 675, 0, 16, null), new SportRecordItem(1714395841L, 1714395846L, Double.valueOf(134.0d), 680, 0, 16, null), new SportRecordItem(1714395846L, 1714395851L, dValueOf6, 685, 0, 16, null), new SportRecordItem(1714395851L, 1714395856L, dValueOf6, 690, 0, 16, null), new SportRecordItem(1714395856L, 1714395861L, Double.valueOf(131.0d), 695, 0, 16, null), new SportRecordItem(1714395861L, 1714395866L, dValueOf7, 700, 0, 16, null), new SportRecordItem(1714395866L, 1714395871L, dValueOf6, 705, 0, 16, null), new SportRecordItem(1714395871L, 1714395876L, dValueOf6, 710, 0, 16, null), new SportRecordItem(1714395876L, 1714395881L, dValueOf6, 715, 0, 16, null), new SportRecordItem(1714395881L, 1714395886L, dValueOf3, HMSedentaryConfig.INGORE_START_INDEX, 0, 16, null), new SportRecordItem(1714395886L, 1714395891L, Double.valueOf(123.0d), 725, 0, 16, null), new SportRecordItem(1714395891L, 1714395896L, Double.valueOf(119.0d), 730, 0, 16, null), new SportRecordItem(1714395896L, 1714395901L, dValueOf4, 735, 0, 16, null), new SportRecordItem(1714395901L, 1714395906L, Double.valueOf(134.0d), 740, 0, 16, null), new SportRecordItem(1714395906L, 1714395911L, dValueOf9, 745, 0, 16, null), new SportRecordItem(1714395911L, 1714395916L, Double.valueOf(135.0d), 750, 0, 16, null), new SportRecordItem(1714395916L, 1714395921L, dValueOf7, 755, 0, 16, null), new SportRecordItem(1714395921L, 1714395926L, Double.valueOf(123.0d), 760, 0, 16, null), new SportRecordItem(1714395926L, 1714395931L, dValueOf15, 765, 0, 16, null), new SportRecordItem(1714395931L, 1714395936L, dValueOf15, 770, 0, 16, null), new SportRecordItem(1714395936L, 1714395941L, dValueOf11, 775, 0, 16, null), new SportRecordItem(1714395941L, 1714395946L, dValueOf12, 780, 0, 16, null), new SportRecordItem(1714395946L, 1714395951L, dValueOf12, 785, 0, 16, null), new SportRecordItem(1714395951L, 1714395956L, dValueOf4, 790, 0, 16, null), new SportRecordItem(1714395956L, 1714395961L, dValueOf10, 795, 0, 16, null), new SportRecordItem(1714395961L, 1714395966L, Double.valueOf(114.0d), 800, 0, 16, null), new SportRecordItem(1714395966L, 1714395971L, Double.valueOf(113.0d), 805, 0, 16, null), new SportRecordItem(1714395971L, 1714395976L, dValueOf2, 810, 0, 16, null), new SportRecordItem(1714395976L, 1714395981L, dValueOf15, 815, 0, 16, null), new SportRecordItem(1714395981L, 1714395986L, dValueOf10, 820, 0, 16, null), new SportRecordItem(1714395986L, 1714395991L, dValueOf3, 825, 0, 16, null), new SportRecordItem(1714395991L, 1714395996L, dValueOf13, 830, 0, 16, null), new SportRecordItem(1714395996L, 1714396001L, dValueOf7, 835, 0, 16, null), new SportRecordItem(1714396001L, 1714396006L, Double.valueOf(132.0d), HMSedentaryConfig.INGORE_STOP_INDEX, 0, 16, null), new SportRecordItem(1714396006L, 1714396011L, dValueOf13, 845, 0, 16, null), new SportRecordItem(1714396011L, 1714396016L, dValueOf6, 850, 0, 16, null), new SportRecordItem(1714396016L, 1714396021L, dValueOf7, 855, 0, 16, null), new SportRecordItem(1714396021L, 1714396026L, dValueOf5, 860, 0, 16, null), new SportRecordItem(1714396026L, 1714396031L, Double.valueOf(119.0d), 865, 0, 16, null), new SportRecordItem(1714396031L, 1714396036L, Double.valueOf(111.0d), 870, 0, 16, null), new SportRecordItem(1714396036L, 1714396041L, Double.valueOf(103.0d), 875, 0, 16, null), new SportRecordItem(1714396041L, 1714396046L, Double.valueOf(106.0d), 880, 0, 16, null), new SportRecordItem(1714396046L, 1714396051L, Double.valueOf(110.0d), 885, 0, 16, null), new SportRecordItem(1714396051L, 1714396056L, dValueOf14, 890, 0, 16, null), new SportRecordItem(1714396056L, 1714396061L, dValueOf11, 895, 0, 16, null), new SportRecordItem(1714396061L, 1714396066L, Double.valueOf(120.0d), 900, 0, 16, null), new SportRecordItem(1714396066L, 1714396071L, dValueOf14, 905, 0, 16, null), new SportRecordItem(1714396071L, 1714396076L, Double.valueOf(112.0d), 910, 0, 16, null), new SportRecordItem(1714396076L, 1714396081L, Double.valueOf(114.0d), 915, 0, 16, null), new SportRecordItem(1714396081L, 1714396086L, dValueOf14, 920, 0, 16, null), new SportRecordItem(1714396086L, 1714396091L, dValueOf11, 925, 0, 16, null), new SportRecordItem(1714396091L, 1714396096L, dValueOf11, 930, 0, 16, null), new SportRecordItem(1714396096L, 1714396101L, Double.valueOf(126.0d), 935, 0, 16, null), new SportRecordItem(1714396101L, 1714396106L, dValueOf7, 940, 0, 16, null), new SportRecordItem(1714396106L, 1714396111L, dValueOf13, 945, 0, 16, null), new SportRecordItem(1714396111L, 1714396116L, dValueOf7, 950, 0, 16, null), new SportRecordItem(1714396116L, 1714396121L, Double.valueOf(123.0d), 955, 0, 16, null), new SportRecordItem(1714396121L, 1714396126L, dValueOf15, 960, 0, 16, null), new SportRecordItem(1714396126L, 1714396131L, Double.valueOf(112.0d), 965, 0, 16, null), new SportRecordItem(1714396131L, 1714396136L, Double.valueOf(114.0d), 970, 0, 16, null), new SportRecordItem(1714396136L, 1714396141L, dValueOf14, 975, 0, 16, null), new SportRecordItem(1714396141L, 1714396146L, dValueOf2, 980, 0, 16, null), new SportRecordItem(1714396146L, 1714396151L, dValueOf4, 985, 0, 16, null), new SportRecordItem(1714396151L, 1714396156L, dValueOf3, 990, 0, 16, null), new SportRecordItem(1714396156L, 1714396161L, dValueOf12, 995, 0, 16, null), new SportRecordItem(1714396161L, 1714396166L, dValueOf8, 1000, 0, 16, null), new SportRecordItem(1714396166L, 1714396171L, dValueOf13, 1005, 0, 16, null), new SportRecordItem(1714396171L, 1714396176L, dValueOf5, 1010, 0, 16, null), new SportRecordItem(1714396176L, 1714396181L, dValueOf3, 1015, 0, 16, null), new SportRecordItem(1714396181L, 1714396186L, dValueOf2, 1020, 0, 16, null), new SportRecordItem(1714396186L, 1714396191L, Double.valueOf(110.0d), 1025, 0, 16, null), new SportRecordItem(1714396191L, 1714396196L, Double.valueOf(104.0d), 1030, 0, 16, null), new SportRecordItem(1714396196L, 1714396201L, Double.valueOf(99.0d), 1035, 0, 16, null), new SportRecordItem(1714396201L, 1714396206L, Double.valueOf(99.0d), CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_HBM_TOO_SLOW, 0, 16, null), new SportRecordItem(1714396206L, 1714396211L, Double.valueOf(103.0d), CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_UI_DISAPPEAR, 0, 16, null), new SportRecordItem(1714396211L, 1714396216L, Double.valueOf(104.0d), 1050, 0, 16, null), new SportRecordItem(1714396216L, 1714396221L, Double.valueOf(96.0d), 1055, 0, 16, null), new SportRecordItem(1714396221L, 1714396226L, dValueOf, 1060, 0, 16, null), new SportRecordItem(1714396226L, 1714396231L, Double.valueOf(87.0d), 1065, 0, 16, null), new SportRecordItem(1714396231L, 1714396236L, Double.valueOf(83.0d), 1070, 0, 16, null), new SportRecordItem(1714396236L, 1714396241L, Double.valueOf(83.0d), 1075, 0, 16, null), new SportRecordItem(1714396241L, 1714396246L, Double.valueOf(82.0d), Constants.FHD_WIDTH, 0, 16, null), new SportRecordItem(1714396246L, 1714396251L, Double.valueOf(82.0d), 1085, 0, 16, null), new SportRecordItem(1714396251L, 1714396256L, Double.valueOf(83.0d), 1090, 0, 16, null), new SportRecordItem(1714396256L, 1714396261L, Double.valueOf(88.0d), 1095, 0, 16, null), new SportRecordItem(1714396261L, 1714396266L, dValueOf, 1100, 0, 16, null), new SportRecordItem(1714396266L, 1714396271L, Double.valueOf(95.0d), 1105, 0, 16, null), new SportRecordItem(1714396271L, 1714396276L, dValueOf, 1110, 0, 16, null), new SportRecordItem(1714396276L, 1714396281L, Double.valueOf(95.0d), 1115, 0, 16, null), new SportRecordItem(1714396281L, 1714396285L, Double.valueOf(0.0d), 1115, 0, 16, null), new SportRecordItem(1714396282L, 1714396286L, Double.valueOf(0.0d), 1116, 0, 16, null));
    }

    private final void displayHrmDist() {
        if (getMSportValues() == null) {
            RecyclerView recyclerView = this.recyclerDistribute;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        List<b0o> listCreateTestHrmDistributeModel = createTestHrmDistributeModel(fragmentActivityRequireActivity);
        if (!(!listCreateTestHrmDistributeModel.isEmpty())) {
            RecyclerView recyclerView2 = this.recyclerDistribute;
            Intrinsics.checkNotNull(recyclerView2);
            recyclerView2.setVisibility(8);
            return;
        }
        RecyclerView recyclerView3 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(0);
        List<b0o> list = this.mDistributeList;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<b0o> list2 = this.mDistributeList;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateTestHrmDistributeModel);
        pin pinVar = this.mDistributeViewAdapter;
        Intrinsics.checkNotNull(pinVar);
        pinVar.notifyDataSetChanged();
    }

    private final List<Float> getHeartValueList(int type) {
        Integer lowerLimitHeartRateZoneFive;
        Integer lowerLimitHeartRateZoneFour;
        Integer lowerLimitHeartRateZoneThree;
        Integer lowerLimitHeartRateZoneTwo;
        Integer lactateThresholdHeartRate;
        ArrayList arrayList = new ArrayList();
        int hrm = SportReportBaseParser.ReportType.maxWaterTemperature;
        if (type == 0) {
            UserProfile.RecordMaxHrm recordMaxHrm = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(true).getRecordMaxHrm();
            if (recordMaxHrm != null) {
                hrm = recordMaxHrm.getHrm();
            }
            float f = hrm;
            ListExtKt.add(arrayList, Float.valueOf(0.6f * f));
            ListExtKt.add(arrayList, Float.valueOf(0.7f * f));
            ListExtKt.add(arrayList, Float.valueOf(0.8f * f));
            ListExtKt.add(arrayList, Float.valueOf(f * 0.9f));
        } else if (type == 1) {
            UserProfile.RecordMaxHrm recordMaxHrm2 = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(true).getRecordMaxHrm();
            if (recordMaxHrm2 != null) {
                hrm = recordMaxHrm2.getHrm();
            }
            float f2 = hrm;
            ListExtKt.add(arrayList, Float.valueOf(0.6f * f2));
            ListExtKt.add(arrayList, Float.valueOf(0.7f * f2));
            ListExtKt.add(arrayList, Float.valueOf(0.8f * f2));
            ListExtKt.add(arrayList, Float.valueOf(f2 * 0.9f));
        } else if (type == 2) {
            UserProfile.RecordMaxHrm recordMaxHrm3 = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(true).getRecordMaxHrm();
            if (recordMaxHrm3 != null) {
                hrm = recordMaxHrm3.getHrm();
            }
            SportBasicReport mSportValues = getMSportValues();
            ListExtKt.add(arrayList, Float.valueOf((mSportValues == null || (lowerLimitHeartRateZoneTwo = mSportValues.getLowerLimitHeartRateZoneTwo()) == null) ? hrm * 0.72f : lowerLimitHeartRateZoneTwo.intValue()));
            SportBasicReport mSportValues2 = getMSportValues();
            ListExtKt.add(arrayList, Float.valueOf((mSportValues2 == null || (lowerLimitHeartRateZoneThree = mSportValues2.getLowerLimitHeartRateZoneThree()) == null) ? hrm * 0.72f : lowerLimitHeartRateZoneThree.intValue()));
            SportBasicReport mSportValues3 = getMSportValues();
            ListExtKt.add(arrayList, Float.valueOf((mSportValues3 == null || (lowerLimitHeartRateZoneFour = mSportValues3.getLowerLimitHeartRateZoneFour()) == null) ? hrm * 0.72f : lowerLimitHeartRateZoneFour.intValue()));
            SportBasicReport mSportValues4 = getMSportValues();
            ListExtKt.add(arrayList, Float.valueOf((mSportValues4 == null || (lowerLimitHeartRateZoneFive = mSportValues4.getLowerLimitHeartRateZoneFive()) == null) ? hrm * 0.72f : lowerLimitHeartRateZoneFive.intValue()));
        } else if (type != 3) {
            UserProfile.RecordMaxHrm recordMaxHrm4 = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(true).getRecordMaxHrm();
            if (recordMaxHrm4 != null) {
                hrm = recordMaxHrm4.getHrm();
            }
            float f3 = hrm;
            ListExtKt.add(arrayList, Float.valueOf(0.6f * f3));
            ListExtKt.add(arrayList, Float.valueOf(0.7f * f3));
            ListExtKt.add(arrayList, Float.valueOf(0.8f * f3));
            ListExtKt.add(arrayList, Float.valueOf(f3 * 0.9f));
        } else {
            SportBasicReport mSportValues5 = getMSportValues();
            float fIntValue = (mSportValues5 == null || (lactateThresholdHeartRate = mSportValues5.getLactateThresholdHeartRate()) == null) ? 170 : lactateThresholdHeartRate.intValue();
            ListExtKt.add(arrayList, Float.valueOf(0.8f * fIntValue));
            ListExtKt.add(arrayList, Float.valueOf(0.89f * fIntValue));
            ListExtKt.add(arrayList, Float.valueOf(0.97f * fIntValue));
            ListExtKt.add(arrayList, Float.valueOf(fIntValue * 0.102f));
        }
        return arrayList;
    }

    private final void initChartData() {
        initDetailViewModel();
        if (getMSportValues() == null || isInvalid()) {
            return;
        }
        bindData();
    }

    private final void initDistributeRecycler() {
        this.mDistributeList = new ArrayList();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getMActivity());
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
        displayHrmDist();
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
            setMBasicReport((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT));
        }
    }

    private final void initView() {
        RecyclerView recyclerView = this.recyclerDistribute;
        if (recyclerView != null) {
            recyclerView.setAlpha(0.4f);
        }
        CustomLineChart customLineChart = this.mLineChart;
        if (customLineChart != null) {
            customLineChart.setAlpha(0.4f);
        }
        DataTitleSimpleView dataTitleSimpleView = this.titleView;
        if (dataTitleSimpleView != null) {
            dataTitleSimpleView.setAlpha(0.8f);
        }
        SportDetailItemView itemViewLeft = getItemViewLeft();
        if (itemViewLeft != null) {
            itemViewLeft.setAlpha(0.4f);
        }
        SportDetailItemView itemViewRight = getItemViewRight();
        if (itemViewRight != null) {
            itemViewRight.setAlpha(0.4f);
        }
        ImageView ivExpandView = getIvExpandView();
        if (ivExpandView != null) {
            ivExpandView.setAlpha(0.4f);
        }
        initParamsFromBundle(getArguments());
        DataTitleSimpleView dataTitleSimpleView2 = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView2);
        dataTitleSimpleView2.bindData(hoi.I0, getString(j1j.e5));
        setAbnormalGuideListener(new View.OnClickListener() { // from class: zhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailRateExampleFragment.initView$lambda$0(this.f41297a, view);
            }
        });
        initDistributeRecycler();
        initBaseChart();
        initChartData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SportDetailRateExampleFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getContext() != null) {
            Context contextRequireContext = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            String string = this$0.getString(j1j.f6);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            BubblePopupWindow bubblePopupWindowCreateAbnormalBubblePop = this$0.createAbnormalBubblePop(contextRequireContext, string);
            DataTitleSimpleView dataTitleSimpleView = this$0.titleView;
            Intrinsics.checkNotNull(dataTitleSimpleView);
            ImageView imgGuide = dataTitleSimpleView.getImgGuide();
            Intrinsics.checkNotNull(imgGuide);
            bubblePopupWindowCreateAbnormalBubblePop.show(imgGuide);
        }
    }

    @NotNull
    public final List<b0o> createTestHrmDistributeModel(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        HrmDistribute hrmDistribute = new HrmDistribute(155, 335, 1365, 775, 385);
        return HrmUtil.INSTANCE.createHrmSportSegmentModel(context, hrmDistribute, hrmDistribute.getSumDuration(), 0);
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "heart_rate_example";
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
        ifa ifaVarA0 = ifa.A0(inflater, container, false);
        this.mBinding = ifaVarA0;
        Intrinsics.checkNotNull(ifaVarA0);
        this.recyclerBottom = ifaVarA0.H;
        ifa ifaVar = this.mBinding;
        Intrinsics.checkNotNull(ifaVar);
        this.recyclerDistribute = ifaVar.I;
        ifa ifaVar2 = this.mBinding;
        Intrinsics.checkNotNull(ifaVar2);
        this.titleView = ifaVar2.B;
        ifa ifaVar3 = this.mBinding;
        Intrinsics.checkNotNull(ifaVar3);
        this.mLineChart = ifaVar3.A;
        ifa ifaVar4 = this.mBinding;
        Intrinsics.checkNotNull(ifaVar4);
        setItemViewLeft(ifaVar4.C);
        ifa ifaVar5 = this.mBinding;
        Intrinsics.checkNotNull(ifaVar5);
        setItemViewRight(ifaVar5.D);
        ifa ifaVar6 = this.mBinding;
        Intrinsics.checkNotNull(ifaVar6);
        setIvExpandView(ifaVar6.F);
        ifa ifaVar7 = this.mBinding;
        Intrinsics.checkNotNull(ifaVar7);
        dde ddeVar = ifaVar7.G;
        Intrinsics.checkNotNull(ddeVar);
        SportRateFloatingHolder sportRateFloatingHolder = new SportRateFloatingHolder(ddeVar);
        this.floatingHolder = sportRateFloatingHolder;
        sportRateFloatingHolder.showBuyToast(getMSportValues());
        initView();
        ifa ifaVar8 = this.mBinding;
        Intrinsics.checkNotNull(ifaVar8);
        View root = ifaVar8.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
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
