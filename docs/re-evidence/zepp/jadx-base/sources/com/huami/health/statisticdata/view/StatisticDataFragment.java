package com.huami.health.statisticdata.view;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.health.statisticdata.R;
import com.huami.health.statisticdata.model.BasicArgumentsData;
import com.huami.health.statisticdata.model.StatisticDataModel;
import com.huami.health.statisticdata.viewmodel.StatisticDataViewModel;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.viewmodel.ext.android.LifecycleOwnerExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b3\u00104J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012J&\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR+\u0010#\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010&R*\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010+R\u001d\u00100\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b%\u0010/R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/huami/health/statisticdata/view/StatisticDataFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/os/Bundle;", "bundle", "", GoogleApiAvailabilityLight.a, "e", "g", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "", "personCurrentValue", "updateStatisticView", "", "timeGroup", "Ljava/util/ArrayList;", "Lcom/huami/health/statisticdata/model/StatisticDataModel;", "Lkotlin/collections/ArrayList;", StatisticDataFragment.p, "onDestroyView", "Lcom/huami/health/statisticdata/model/BasicArgumentsData;", "a", "Lcom/huami/health/statisticdata/model/BasicArgumentsData;", StatisticDataFragment.l, "<set-?>", "b", "Lkotlin/properties/ReadWriteProperty;", "()I", "f", "(I)V", StatisticDataFragment.m, "", "c", "[I", StatisticDataFragment.n, StatisticDataFragment.o, "Ljava/util/ArrayList;", "Lcom/huami/health/statisticdata/view/StatisticsDataView;", "Lcom/huami/health/statisticdata/view/StatisticsDataView;", "statisticDataView", "Lcom/huami/health/statisticdata/viewmodel/StatisticDataViewModel;", "Lkotlin/Lazy;", "()Lcom/huami/health/statisticdata/viewmodel/StatisticDataViewModel;", "viewModel", "h", "Landroid/os/Bundle;", "<init>", "()V", "Companion", "statisticdata_release"}, k = 1, mv = {1, 4, 0})
public final class StatisticDataFragment extends Fragment {
    private static final String k = "StatisticDataFragment";
    private static final String l = "basicArgumentsData";
    private static final String n = "shadowColors";
    private static final String o = "subIndexShadowColors";
    private static final String p = "statisticDataList";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private BasicArgumentsData basicArgumentsData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ReadWriteProperty lineColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int[] shadowColors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int[] subIndexShadowColors;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ArrayList<StatisticDataModel> statisticDataList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private StatisticsDataView statisticDataView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Bundle bundle;
    private HashMap i;
    private static final String m = "lineColor";
    public static final /* synthetic */ KProperty[] j = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(StatisticDataFragment.class, m, "getLineColor()I", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJD\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bH\u0002JB\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/huami/health/statisticdata/view/StatisticDataFragment$Companion;", "", "Lcom/huami/health/statisticdata/model/BasicArgumentsData;", StatisticDataFragment.l, "", StatisticDataFragment.m, "", StatisticDataFragment.n, StatisticDataFragment.o, "Ljava/util/ArrayList;", "Lcom/huami/health/statisticdata/model/StatisticDataModel;", "Lkotlin/collections/ArrayList;", StatisticDataFragment.p, "Landroid/os/Bundle;", "a", "Lcom/huami/health/statisticdata/view/StatisticDataFragment;", "newInstance", "", "BASIC_ARGUMENT_DATA_KEY", "Ljava/lang/String;", "LINE_COLOR_KEY", "SHADOW_COLORS_KEY", "STATISTIC_DATA_LIST_KEY", "SUB_INDEX_SHADOW_COLORS_KEY", "TAG", "<init>", "()V", "statisticdata_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        private final Bundle a(BasicArgumentsData basicArgumentsData, int lineColor, int[] shadowColors, int[] subIndexShadowColors, ArrayList<StatisticDataModel> statisticDataList) {
            Bundle bundleBundleOf = BundleKt.bundleOf(TuplesKt.to(StatisticDataFragment.l, basicArgumentsData), TuplesKt.to(StatisticDataFragment.m, Integer.valueOf(lineColor)), TuplesKt.to(StatisticDataFragment.n, shadowColors), TuplesKt.to(StatisticDataFragment.o, subIndexShadowColors));
            if (statisticDataList != null && (true ^ statisticDataList.isEmpty())) {
                bundleBundleOf.putParcelableArrayList(StatisticDataFragment.p, statisticDataList);
            }
            return bundleBundleOf;
        }

        @NotNull
        public final StatisticDataFragment newInstance(@NotNull BasicArgumentsData basicArgumentsData, int lineColor, @NotNull int[] shadowColors, @NotNull int[] subIndexShadowColors, @Nullable ArrayList<StatisticDataModel> statisticDataList) {
            StatisticDataFragment statisticDataFragment = new StatisticDataFragment();
            statisticDataFragment.setArguments(StatisticDataFragment.INSTANCE.a(basicArgumentsData, lineColor, shadowColors, subIndexShadowColors, statisticDataList));
            return statisticDataFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Receive data is >> " + StatisticDataFragment.this.basicArgumentsData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("Receive basic arguments data  is >> ");
            sb.append(StatisticDataFragment.this.basicArgumentsData);
            sb.append(" , ");
            sb.append("line color is ");
            sb.append(StatisticDataFragment.this.b());
            sb.append(" , shadow colors is ");
            sb.append(StatisticDataFragment.this.shadowColors);
            sb.append(" , ");
            sb.append("statistic data list length is ");
            ArrayList arrayList = StatisticDataFragment.this.statisticDataList;
            sb.append(arrayList != null ? Integer.valueOf(arrayList.size()) : null);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/huami/health/statisticdata/model/StatisticDataModel;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 4, 0})
    public static final class c<T> implements Observer<List<? extends StatisticDataModel>> {
        public c() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(List<StatisticDataModel> list) {
            if (list == null || !(!list.isEmpty())) {
                return;
            }
            StatisticDataFragment.this.statisticDataList = (ArrayList) list;
            StatisticDataFragment.this.statisticDataView.updateCompareView(StatisticDataFragment.this.basicArgumentsData.getPersonCurrentValue(), list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Save instance state";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StatisticDataFragment() {
        super(R.layout.fragment_statistic_data_layout);
        this.lineColor = Delegates.INSTANCE.notNull();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(new Function0<StatisticDataViewModel>() { // from class: com.huami.health.statisticdata.view.StatisticDataFragment$$special$$inlined$viewModel$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.health.statisticdata.viewmodel.StatisticDataViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final StatisticDataViewModel invoke() {
                return LifecycleOwnerExtKt.getViewModel(this, Reflection.getOrCreateKotlinClass(StatisticDataViewModel.class), qualifier, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b() {
        return ((Number) this.lineColor.getValue(this, j[0])).intValue();
    }

    private final StatisticDataViewModel c() {
        return (StatisticDataViewModel) this.viewModel.getValue();
    }

    private final void d(Bundle bundle) {
        this.basicArgumentsData = (BasicArgumentsData) bundle.getParcelable(l);
        f(bundle.getInt(m));
        HMLog.info(k, new a());
        this.shadowColors = bundle.getIntArray(n);
        this.subIndexShadowColors = bundle.getIntArray(o);
        this.statisticDataList = bundle.getParcelableArrayList(p);
        HMLog.info(k, new b());
    }

    private final void e() {
        ArrayList<StatisticDataModel> arrayList = this.statisticDataList;
        if (arrayList != null && (!arrayList.isEmpty())) {
            this.statisticDataView.updateCompareView(this.basicArgumentsData.getPersonCurrentValue(), this.statisticDataList);
        } else {
            c().getStatisticDataListLiveData().observe(requireActivity(), new c());
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(int i) {
        this.lineColor.setValue(this, j[0], Integer.valueOf(i));
    }

    private final void g() {
        c().setStatisticDataList(this.basicArgumentsData.getChildUserId(), this.basicArgumentsData.getDistributionTypeEnum(), this.basicArgumentsData.getGenderType(), this.basicArgumentsData.getAgeGroup(), this.basicArgumentsData.getTimeGroup());
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.i;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.i == null) {
            this.i = new HashMap();
        }
        View view = (View) this.i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.i.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            savedInstanceState = requireArguments();
        }
        this.bundle = savedInstanceState;
        d(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.statisticDataView.recycle();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        HMLog.info(k, d.a);
        outState.putParcelable(l, this.basicArgumentsData);
        outState.putInt(m, b());
        outState.putIntArray(n, this.shadowColors);
        outState.putIntArray(o, this.subIndexShadowColors);
        outState.putParcelableArrayList(p, this.statisticDataList);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.statisticDataView = new StatisticsDataView(requireContext(), (TextView) _$_findCachedViewById(R.id.statistic_data_chart_title), (TextView) _$_findCachedViewById(R.id.statistic_data_chart_sub_title), (RelativeLayout) _$_findCachedViewById(R.id.statistic_data_chart), this.basicArgumentsData, b(), this.shadowColors, this.subIndexShadowColors);
        e();
    }

    public final void updateStatisticView(float personCurrentValue) {
        this.basicArgumentsData.setPersonCurrentValue(personCurrentValue);
        ArrayList<StatisticDataModel> arrayList = this.statisticDataList;
        if (arrayList == null || !(!arrayList.isEmpty())) {
            g();
        } else {
            this.statisticDataView.updateCompareView(this.basicArgumentsData.getPersonCurrentValue(), this.statisticDataList);
        }
    }

    public final void updateStatisticView(float personCurrentValue, int timeGroup) {
        this.basicArgumentsData.setPersonCurrentValue(personCurrentValue);
        this.basicArgumentsData.setTimeGroup(Integer.valueOf(timeGroup));
        g();
    }

    public final void updateStatisticView(float personCurrentValue, @NotNull ArrayList<StatisticDataModel> statisticDataList) {
        this.basicArgumentsData.setPersonCurrentValue(personCurrentValue);
        this.statisticDataView.updateCompareView(this.basicArgumentsData.getPersonCurrentValue(), statisticDataList);
    }
}
