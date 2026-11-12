package com.xiaomi.fitness.detail.inner;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.recycler.SportBehaviorTitleAdapter;
import com.xiaomi.fitness.summary.recycler.SportBehaviorModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.bl5;
import defpackage.bsi;
import defpackage.byi;
import defpackage.ci2;
import defpackage.dki;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.kda;
import defpackage.uz6;
import defpackage.x44;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 W2\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\bV\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\u0004R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R*\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010;\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010+\u001a\u0004\b<\u0010-\"\u0004\b=\u0010/R*\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010F\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR*\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010@\u001a\u0004\bM\u0010B\"\u0004\bN\u0010DR$\u0010P\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailBehaviorFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "", "initView", "()V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "initDistributeRecycler", "displayBehaviorList", "displayBehaviorTitleList", "Landroid/content/Context;", "context", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportValues", "", "Luz6;", "createBehaviorDistributeModel", "(Landroid/content/Context;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)Ljava/util/List;", "Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;", "createBehaviorTitleModel", "", "getCardName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "initRecylceAbnormalTitle", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerDistribute", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerDistribute", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerDistribute", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lkda;", "mBinding", "Lkda;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "valueList", "Ljava/util/ArrayList;", "getValueList", "()Ljava/util/ArrayList;", "setValueList", "(Ljava/util/ArrayList;)V", "recyclerTitle", "getRecyclerTitle", "setRecyclerTitle", "", "mDistributeList", "Ljava/util/List;", "getMDistributeList", "()Ljava/util/List;", "setMDistributeList", "(Ljava/util/List;)V", "Lci2;", "mDistributeViewAdapter", "Lci2;", "getMDistributeViewAdapter", "()Lci2;", "setMDistributeViewAdapter", "(Lci2;)V", "mRecyclerTitleList", "getMRecyclerTitleList", "setMRecyclerTitleList", "Lcom/xiaomi/fitness/detail/recycler/SportBehaviorTitleAdapter;", "mTitleViewAdapter", "Lcom/xiaomi/fitness/detail/recycler/SportBehaviorTitleAdapter;", "getMTitleViewAdapter", "()Lcom/xiaomi/fitness/detail/recycler/SportBehaviorTitleAdapter;", "setMTitleViewAdapter", "(Lcom/xiaomi/fitness/detail/recycler/SportBehaviorTitleAdapter;)V", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailBehaviorFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailBehaviorFragment";

    @Nullable
    private kda mBinding;

    @Nullable
    private List<uz6> mDistributeList;

    @Nullable
    private ci2 mDistributeViewAdapter;

    @Nullable
    private List<SportBehaviorModel> mRecyclerTitleList;

    @Nullable
    private SportBehaviorTitleAdapter mTitleViewAdapter;

    @Nullable
    private RecyclerView recyclerDistribute;

    @Nullable
    private RecyclerView recyclerTitle;

    @Nullable
    private DataTitleSimpleView titleView;

    @Nullable
    private ArrayList<SportRecordItem> valueList;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailBehaviorFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag(SportDetailBehaviorFragment.TAG, triathlonNum, sportType);
            int i = bsi.O;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailBehaviorFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    private final List<uz6> createBehaviorDistributeModel(Context context, SportBasicReport sportValues) {
        int i;
        ArrayList<uz6> arrayList = new ArrayList();
        Integer perfectPunchCount = sportValues.getPerfectPunchCount();
        int iIntValue = perfectPunchCount != null ? perfectPunchCount.intValue() : 0;
        Integer goodPunchCount = sportValues.getGoodPunchCount();
        int iIntValue2 = goodPunchCount != null ? goodPunchCount.intValue() : 0;
        Integer missPunchCount = sportValues.getMissPunchCount();
        int iIntValue3 = missPunchCount != null ? missPunchCount.intValue() : 0;
        int i2 = iIntValue + iIntValue2 + iIntValue3;
        if (i2 != 0) {
            if (iIntValue != 0) {
                int i3 = (iIntValue * 100) / i2;
                uz6 uz6Var = new uz6(x44.a(dki.c), context.getString(j1j.Y5), 3, RangesKt___RangesKt.coerceAtLeast(i3, 1), String.valueOf(iIntValue), getResources().getQuantityString(byi.common_unit_time, iIntValue2));
                int i4 = i3 == 0 ? 1 : 0;
                arrayList.add(uz6Var);
                i = i4;
            } else {
                i = 0;
            }
            if (iIntValue2 != 0) {
                int i5 = (iIntValue2 * 100) / i2;
                uz6 uz6Var2 = new uz6(x44.a(dki.f15624a), context.getString(j1j.V4), 3, RangesKt___RangesKt.coerceAtLeast(i5, 1), String.valueOf(iIntValue2), getResources().getQuantityString(byi.common_unit_time, iIntValue2));
                if (i5 == 0) {
                    i++;
                }
                arrayList.add(uz6Var2);
            }
            if (iIntValue3 != 0) {
                int i6 = (iIntValue3 * 100) / i2;
                uz6 uz6Var3 = new uz6(x44.a(dki.f15625b), context.getString(j1j.H5), 3, RangesKt___RangesKt.coerceAtLeast(i6, 1), String.valueOf(iIntValue3), getResources().getQuantityString(byi.common_unit_time, iIntValue2));
                if (i6 == 0) {
                    i++;
                }
                arrayList.add(uz6Var3);
            }
            if (i > 0) {
                for (uz6 uz6Var4 : arrayList) {
                    if (uz6Var4.f39601a > (i / (arrayList.size() - i)) + 1 && arrayList.size() > i) {
                        uz6Var4.f39601a -= i / (arrayList.size() - i);
                    }
                }
            }
            DistributeDataUtil.INSTANCE.reviseDistributeDataList(arrayList);
            DistributeDataUtil.setPositionOfList(arrayList);
        }
        return arrayList;
    }

    private final List<SportBehaviorModel> createBehaviorTitleModel(Context context, SportBasicReport sportValues) {
        ArrayList arrayList = new ArrayList();
        if (sportValues.getTotalPunchCount() != null) {
            String strValueOf = String.valueOf(sportValues.getTotalPunchCount());
            Resources resources = getResources();
            int i = byi.common_unit_time;
            Integer totalPunchCount = sportValues.getTotalPunchCount();
            Intrinsics.checkNotNull(totalPunchCount);
            arrayList.add(new SportBehaviorModel(0, strValueOf, resources.getQuantityString(i, totalPunchCount.intValue()), context.getString(j1j.j9), 1, -1));
        }
        if (sportValues.getPunchHitRate() != null) {
            arrayList.add(new SportBehaviorModel(0, String.valueOf(sportValues.getPunchHitRate()), "%", context.getString(j1j.b6), 1, -1));
        }
        if (sportValues.getMaxPunchIntensity() != null) {
            Float maxPunchIntensity = sportValues.getMaxPunchIntensity();
            Intrinsics.checkNotNull(maxPunchIntensity);
            String strG = xr5.g(2, maxPunchIntensity.floatValue());
            Float maxPunchIntensity2 = sportValues.getMaxPunchIntensity();
            Intrinsics.checkNotNull(maxPunchIntensity2);
            if (maxPunchIntensity2.floatValue() > 15.0f) {
                strG = getString(j1j.v5);
            }
            Resources resources2 = getResources();
            int i2 = byi.Q;
            Float maxPunchIntensity3 = sportValues.getMaxPunchIntensity();
            Intrinsics.checkNotNull(maxPunchIntensity3);
            arrayList.add(new SportBehaviorModel(0, strG, resources2.getQuantityString(i2, (int) maxPunchIntensity3.floatValue()), context.getString(j1j.u5), 1, -1));
        }
        if (sportValues.getMaxPunchComboCount() != null) {
            String strValueOf2 = String.valueOf(sportValues.getMaxPunchComboCount());
            Resources resources3 = getResources();
            int i3 = byi.common_unit_time;
            Integer maxPunchComboCount = sportValues.getMaxPunchComboCount();
            Intrinsics.checkNotNull(maxPunchComboCount);
            arrayList.add(new SportBehaviorModel(0, strValueOf2, resources3.getQuantityString(i3, maxPunchComboCount.intValue()), context.getString(j1j.t5), 1, -1));
        }
        return arrayList;
    }

    private final void displayBehaviorList() {
        if (getMSportValues() == null) {
            RecyclerView recyclerView = this.recyclerDistribute;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        SportBasicReport mSportValues = getMSportValues();
        Intrinsics.checkNotNull(mSportValues);
        List<uz6> listCreateBehaviorDistributeModel = createBehaviorDistributeModel(fragmentActivityRequireActivity, mSportValues);
        if (listCreateBehaviorDistributeModel != null) {
            List<uz6> list = listCreateBehaviorDistributeModel;
            if (!list.isEmpty()) {
                RecyclerView recyclerView2 = this.recyclerDistribute;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setVisibility(0);
                List<uz6> list2 = this.mDistributeList;
                Intrinsics.checkNotNull(list2);
                list2.clear();
                List<uz6> list3 = this.mDistributeList;
                Intrinsics.checkNotNull(list3);
                list3.addAll(list);
                ci2 ci2Var = this.mDistributeViewAdapter;
                Intrinsics.checkNotNull(ci2Var);
                ci2Var.notifyDataSetChanged();
                return;
            }
        }
        RecyclerView recyclerView3 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(8);
    }

    private final void displayBehaviorTitleList() {
        if (getMSportValues() == null) {
            RecyclerView recyclerView = this.recyclerDistribute;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        SportBasicReport mSportValues = getMSportValues();
        Intrinsics.checkNotNull(mSportValues);
        List<SportBehaviorModel> listCreateBehaviorTitleModel = createBehaviorTitleModel(fragmentActivityRequireActivity, mSportValues);
        if (listCreateBehaviorTitleModel != null) {
            List<SportBehaviorModel> list = listCreateBehaviorTitleModel;
            if (!list.isEmpty()) {
                RecyclerView recyclerView2 = this.recyclerDistribute;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setVisibility(0);
                List<SportBehaviorModel> list2 = this.mRecyclerTitleList;
                Intrinsics.checkNotNull(list2);
                list2.clear();
                List<SportBehaviorModel> list3 = this.mRecyclerTitleList;
                Intrinsics.checkNotNull(list3);
                list3.addAll(list);
                ci2 ci2Var = this.mDistributeViewAdapter;
                Intrinsics.checkNotNull(ci2Var);
                ci2Var.notifyDataSetChanged();
                return;
            }
        }
        RecyclerView recyclerView3 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(8);
    }

    private final void initDistributeRecycler() {
        this.mDistributeList = new ArrayList();
        final int i = SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand() ? 3 : 2;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), i);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.detail.inner.SportDetailBehaviorFragment.initDistributeRecycler.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                ci2 mDistributeViewAdapter = SportDetailBehaviorFragment.this.getMDistributeViewAdapter();
                Intrinsics.checkNotNull(mDistributeViewAdapter);
                if (mDistributeViewAdapter.isHeaderView(position)) {
                    return i;
                }
                return 1;
            }
        });
        RecyclerView recyclerView = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(gridLayoutManager);
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView2 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(bl5Var);
        RecyclerView recyclerView3 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setLayoutManager(gridLayoutManager);
        this.mDistributeViewAdapter = new ci2(requireActivity(), this.mDistributeList);
        RecyclerView recyclerView4 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setAdapter(this.mDistributeViewAdapter);
        displayBehaviorList();
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
        }
    }

    private final void initView() {
        initParamsFromBundle(getArguments());
        DataTitleSimpleView dataTitleSimpleView = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView);
        dataTitleSimpleView.bindData(hoi.P1, getString(j1j.U2));
        initDistributeRecycler();
        initRecylceAbnormalTitle();
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "course_performance";
    }

    @Nullable
    public final List<uz6> getMDistributeList() {
        return this.mDistributeList;
    }

    @Nullable
    public final ci2 getMDistributeViewAdapter() {
        return this.mDistributeViewAdapter;
    }

    @Nullable
    public final List<SportBehaviorModel> getMRecyclerTitleList() {
        return this.mRecyclerTitleList;
    }

    @Nullable
    public final SportBehaviorTitleAdapter getMTitleViewAdapter() {
        return this.mTitleViewAdapter;
    }

    @Nullable
    public final RecyclerView getRecyclerDistribute() {
        return this.recyclerDistribute;
    }

    @Nullable
    public final RecyclerView getRecyclerTitle() {
        return this.recyclerTitle;
    }

    @Nullable
    public final DataTitleSimpleView getTitleView() {
        return this.titleView;
    }

    @Nullable
    public final ArrayList<SportRecordItem> getValueList() {
        return this.valueList;
    }

    public final void initRecylceAbnormalTitle() {
        this.mRecyclerTitleList = new ArrayList();
        final int i = SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand() ? 3 : 2;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), i);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.detail.inner.SportDetailBehaviorFragment.initRecylceAbnormalTitle.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                ci2 mDistributeViewAdapter = SportDetailBehaviorFragment.this.getMDistributeViewAdapter();
                Intrinsics.checkNotNull(mDistributeViewAdapter);
                if (mDistributeViewAdapter.isHeaderView(position)) {
                    return i;
                }
                return 1;
            }
        });
        RecyclerView recyclerView = this.recyclerTitle;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(gridLayoutManager);
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView2 = this.recyclerTitle;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(bl5Var);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        List<SportBehaviorModel> list = this.mRecyclerTitleList;
        Intrinsics.checkNotNull(list);
        this.mTitleViewAdapter = new SportBehaviorTitleAdapter(fragmentActivityRequireActivity, list);
        RecyclerView recyclerView3 = this.recyclerTitle;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mTitleViewAdapter);
        displayBehaviorTitleList();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        kda kdaVarA0 = kda.A0(inflater, container, false);
        this.mBinding = kdaVarA0;
        Intrinsics.checkNotNull(kdaVarA0);
        this.recyclerDistribute = kdaVarA0.B;
        kda kdaVar = this.mBinding;
        Intrinsics.checkNotNull(kdaVar);
        this.titleView = kdaVar.A;
        kda kdaVar2 = this.mBinding;
        Intrinsics.checkNotNull(kdaVar2);
        this.recyclerTitle = kdaVar2.C;
        initView();
        kda kdaVar3 = this.mBinding;
        Intrinsics.checkNotNull(kdaVar3);
        View root = kdaVar3.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public final void setMDistributeList(@Nullable List<uz6> list) {
        this.mDistributeList = list;
    }

    public final void setMDistributeViewAdapter(@Nullable ci2 ci2Var) {
        this.mDistributeViewAdapter = ci2Var;
    }

    public final void setMRecyclerTitleList(@Nullable List<SportBehaviorModel> list) {
        this.mRecyclerTitleList = list;
    }

    public final void setMTitleViewAdapter(@Nullable SportBehaviorTitleAdapter sportBehaviorTitleAdapter) {
        this.mTitleViewAdapter = sportBehaviorTitleAdapter;
    }

    public final void setRecyclerDistribute(@Nullable RecyclerView recyclerView) {
        this.recyclerDistribute = recyclerView;
    }

    public final void setRecyclerTitle(@Nullable RecyclerView recyclerView) {
        this.recyclerTitle = recyclerView;
    }

    public final void setTitleView(@Nullable DataTitleSimpleView dataTitleSimpleView) {
        this.titleView = dataTitleSimpleView;
    }

    public final void setValueList(@Nullable ArrayList<SportRecordItem> arrayList) {
        this.valueList = arrayList;
    }
}
