package com.xiaomi.fitness.health.pai;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.PaiEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.valueformatter.DayRateHighLightMarkValueFormatter;
import com.xiaomi.fitness.health.pai.PaiRateChartFragment;
import com.xiaomi.fitness.health.pai.view.PaiLimitGridView;
import com.xiaomi.fitness.util.HealthBundleKey;
import defpackage.a52;
import defpackage.c0j;
import defpackage.hak;
import defpackage.laa;
import defpackage.ubj;
import defpackage.vfe;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.yfe;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 R2\u00020\u0001:\u0001RB\u0007¢\u0006\u0004\bQ\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0004R$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00109\u001a\b\u0012\u0002\b\u0003\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010\u001eR\u0018\u0010J\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010\u001eR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lcom/xiaomi/fitness/health/pai/PaiRateChartFragment;", "Lcom/xiaomi/fitness/base/BaseDataChartChildFragment;", "", "initView", "()V", "initRateChartView", "bindRateRecordData", "Lcom/xiaomi/fitness/chart/entrys/PaiEntry;", "paiEntry", "bindPaiTitleData", "(Lcom/xiaomi/fitness/chart/entrys/PaiEntry;)V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", LifecycleConstantKt.ON_START, "setListener", "Lorg/joda/time/LocalDate;", "mSelectDate", "Lorg/joda/time/LocalDate;", "getMSelectDate", "()Lorg/joda/time/LocalDate;", "setMSelectDate", "(Lorg/joda/time/LocalDate;)V", "Landroid/widget/TextView;", "tvTodayPaiCount", "Landroid/widget/TextView;", "getTvTodayPaiCount", "()Landroid/widget/TextView;", "setTvTodayPaiCount", "(Landroid/widget/TextView;)V", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "rateChartView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "getRateChartView", "()Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "setRateChartView", "(Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;)V", "Lcom/xiaomi/fitness/health/pai/view/PaiLimitGridView;", "paiLimitGridView", "Lcom/xiaomi/fitness/health/pai/view/PaiLimitGridView;", "getPaiLimitGridView", "()Lcom/xiaomi/fitness/health/pai/view/PaiLimitGridView;", "setPaiLimitGridView", "(Lcom/xiaomi/fitness/health/pai/view/PaiLimitGridView;)V", "Lubj;", "rateChartAdapter", "Lubj;", "Lvfe;", "rateChartAttrs", "Lvfe;", "Lvnq;", "La52;", "rateYAxis", "Lvnq;", "Lvqr;", "rateXAxis", "Lvqr;", "", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "rateEntries", "Ljava/util/List;", "rateStartDate", "rateEndDate", "Lcom/xiaomi/fitness/health/pai/DataPaiViewModel;", "mSportBasicViewModel", "Lcom/xiaomi/fitness/health/pai/DataPaiViewModel;", "Llaa;", "mBinding", "Llaa;", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPaiRateChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaiRateChartFragment.kt\ncom/xiaomi/fitness/health/pai/PaiRateChartFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n1#2:189\n*E\n"})
public final class PaiRateChartFragment extends Hilt_PaiRateChartFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private laa mBinding;

    @Nullable
    private LocalDate mSelectDate;

    @Nullable
    private DataPaiViewModel mSportBasicViewModel;

    @Nullable
    private PaiLimitGridView paiLimitGridView;

    @Nullable
    private ubj<?> rateChartAdapter;
    private vfe rateChartAttrs;

    @Nullable
    private LineChartRecyclerView rateChartView;

    @Nullable
    private LocalDate rateEndDate;

    @NotNull
    private final List<SegmentBarEntry> rateEntries = new ArrayList();

    @Nullable
    private LocalDate rateStartDate;

    @Nullable
    private vqr rateXAxis;

    @Nullable
    private vnq<a52> rateYAxis;

    @Nullable
    private TextView tvTodayPaiCount;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/health/pai/PaiRateChartFragment$Companion;", "", "<init>", "()V", "switchDetailFragment", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "rateStartDate", "Lorg/joda/time/LocalDate;", "rateEndDate", "selectDate", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void switchDetailFragment(@Nullable FragmentManager fragmentManager, @Nullable LocalDate rateStartDate, @Nullable LocalDate rateEndDate, @Nullable LocalDate selectDate) {
            Bundle bundle = new Bundle();
            bundle.putSerializable(HealthBundleKey.BUNDLE_PARAMS_LOCAL_DATE_START, rateStartDate);
            bundle.putSerializable(HealthBundleKey.BUNDLE_PARAMS_LOCAL_DATE_END, rateEndDate);
            bundle.putSerializable("local_date", selectDate);
        }
    }

    private final void bindPaiTitleData(PaiEntry paiEntry) {
        Logger.d("PaiChart", "PaiEntry " + paiEntry);
        if (paiEntry == null) {
            TextView textView = this.tvTodayPaiCount;
            Intrinsics.checkNotNull(textView);
            textView.setText(getString(c0j.common_data_empty));
            TextView textView2 = this.tvTodayPaiCount;
            Intrinsics.checkNotNull(textView2);
            textView2.setVisibility(8);
            LineChartRecyclerView lineChartRecyclerView = this.rateChartView;
            Intrinsics.checkNotNull(lineChartRecyclerView);
            lineChartRecyclerView.setVisibility(8);
        } else {
            LocalDate localDate = this.mSelectDate;
            Intrinsics.checkNotNull(localDate);
            String string = getString(c0j.Wa, TimeDateUtil.getDateMMddFormat(localDate), Integer.toString(Math.round(paiEntry.c) + Math.round(paiEntry.d) + Math.round(paiEntry.e)));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            TextView textView3 = this.tvTodayPaiCount;
            Intrinsics.checkNotNull(textView3);
            textView3.setText(string);
            TextView textView4 = this.tvTodayPaiCount;
            Intrinsics.checkNotNull(textView4);
            textView4.setVisibility(0);
            LineChartRecyclerView lineChartRecyclerView2 = this.rateChartView;
            Intrinsics.checkNotNull(lineChartRecyclerView2);
            lineChartRecyclerView2.setVisibility(0);
        }
        PaiLimitGridView paiLimitGridView = this.paiLimitGridView;
        Intrinsics.checkNotNull(paiLimitGridView);
        paiLimitGridView.b(paiEntry);
    }

    private final void bindRateRecordData() {
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            this.rateStartDate = (LocalDate) bundle.getSerializable(HealthBundleKey.BUNDLE_PARAMS_LOCAL_DATE_START);
            this.rateEndDate = (LocalDate) bundle.getSerializable(HealthBundleKey.BUNDLE_PARAMS_LOCAL_DATE_END);
            this.mSelectDate = (LocalDate) bundle.getSerializable("local_date");
        }
    }

    private final void initRateChartView() {
        vfe vfeVar;
        LineChartRecyclerView lineChartRecyclerView = this.rateChartView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        this.rateChartAttrs = (vfe) lineChartRecyclerView.mAttrs;
        DayRateHighLightMarkValueFormatter dayRateHighLightMarkValueFormatter = new DayRateHighLightMarkValueFormatter(0);
        vfe vfeVar2 = this.rateChartAttrs;
        vfe vfeVar3 = null;
        if (vfeVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rateChartAttrs");
            vfeVar2 = null;
        }
        vnq<a52> vnqVarO = vnq.o(vfeVar2, 200.0f);
        this.rateYAxis = vnqVarO;
        if (vnqVarO != null) {
            vnqVarO.setValueFormatter(dayRateHighLightMarkValueFormatter);
        }
        vfe vfeVar4 = this.rateChartAttrs;
        if (vfeVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rateChartAttrs");
            vfeVar4 = null;
        }
        vfe vfeVar5 = this.rateChartAttrs;
        if (vfeVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rateChartAttrs");
            vfeVar5 = null;
        }
        vqr vqrVar = new vqr(vfeVar4, vfeVar5.c, dayRateHighLightMarkValueFormatter);
        this.rateXAxis = vqrVar;
        vnq<a52> vnqVar = this.rateYAxis;
        vfe vfeVar6 = this.rateChartAttrs;
        if (vfeVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rateChartAttrs");
            vfeVar6 = null;
        }
        yfe yfeVar = new yfe(vnqVar, vqrVar, vfeVar6);
        yfeVar.setYAxis(this.rateYAxis);
        yfeVar.setHighLightValueFormatter(dayRateHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView2 = this.rateChartView;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        lineChartRecyclerView2.addItemDecoration(yfeVar);
        FragmentActivity activity = getActivity();
        List<SegmentBarEntry> list = this.rateEntries;
        LineChartRecyclerView lineChartRecyclerView3 = this.rateChartView;
        vqr vqrVar2 = this.rateXAxis;
        vfe vfeVar7 = this.rateChartAttrs;
        if (vfeVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rateChartAttrs");
            vfeVar = null;
        } else {
            vfeVar = vfeVar7;
        }
        this.rateChartAdapter = new ubj<>(activity, list, lineChartRecyclerView3, vqrVar2, vfeVar);
        LineChartRecyclerView lineChartRecyclerView4 = this.rateChartView;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setAdapter(this.rateChartAdapter);
        FragmentActivity activity2 = getActivity();
        vfe vfeVar8 = this.rateChartAttrs;
        if (vfeVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rateChartAttrs");
        } else {
            vfeVar3 = vfeVar8;
        }
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(activity2, vfeVar3);
        LineChartRecyclerView lineChartRecyclerView5 = this.rateChartView;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView6 = this.rateChartView;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.setNestedScrollingEnabled(false);
    }

    private final void initView() {
        initParamsFromBundle(getArguments());
        initRateChartView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(PaiRateChartFragment this$0, PaiEntry paiEntry) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (paiEntry != null) {
            this$0.bindPaiTitleData(paiEntry);
        }
        return Unit.INSTANCE;
    }

    @JvmStatic
    public static final void switchDetailFragment(@Nullable FragmentManager fragmentManager, @Nullable LocalDate localDate, @Nullable LocalDate localDate2, @Nullable LocalDate localDate3) {
        INSTANCE.switchDetailFragment(fragmentManager, localDate, localDate2, localDate3);
    }

    @Nullable
    public final LocalDate getMSelectDate() {
        return this.mSelectDate;
    }

    @Nullable
    public final PaiLimitGridView getPaiLimitGridView() {
        return this.paiLimitGridView;
    }

    @Nullable
    public final LineChartRecyclerView getRateChartView() {
        return this.rateChartView;
    }

    @Nullable
    public final TextView getTvTodayPaiCount() {
        return this.tvTodayPaiCount;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        laa laaVarA0 = laa.A0(inflater, container, false);
        this.mBinding = laaVarA0;
        Intrinsics.checkNotNull(laaVarA0);
        this.tvTodayPaiCount = laaVarA0.C;
        laa laaVar = this.mBinding;
        Intrinsics.checkNotNull(laaVar);
        this.rateChartView = laaVar.B;
        laa laaVar2 = this.mBinding;
        Intrinsics.checkNotNull(laaVar2);
        this.paiLimitGridView = laaVar2.A;
        initView();
        laa laaVar3 = this.mBinding;
        Intrinsics.checkNotNull(laaVar3);
        return laaVar3.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        DataPaiViewModel dataPaiViewModel = (DataPaiViewModel) new ViewModelProvider(mActivity).get(DataPaiViewModel.class);
        this.mSportBasicViewModel = dataPaiViewModel;
        Intrinsics.checkNotNull(dataPaiViewModel);
        MutableLiveData<PaiEntry> paiEntry = dataPaiViewModel.getPaiEntry();
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        paiEntry.observe(mActivity2, new PaiRateChartFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vih
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PaiRateChartFragment.onStart$lambda$1(this.f36926a, (PaiEntry) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        setListener();
    }

    public final void setListener() {
        hak hakVar = new hak(getActivity(), this.rateChartView, new xcm());
        LineChartRecyclerView lineChartRecyclerView = this.rateChartView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        lineChartRecyclerView.addOnItemTouchListener(hakVar);
    }

    public final void setMSelectDate(@Nullable LocalDate localDate) {
        this.mSelectDate = localDate;
    }

    public final void setPaiLimitGridView(@Nullable PaiLimitGridView paiLimitGridView) {
        this.paiLimitGridView = paiLimitGridView;
    }

    public final void setRateChartView(@Nullable LineChartRecyclerView lineChartRecyclerView) {
        this.rateChartView = lineChartRecyclerView;
    }

    public final void setTvTodayPaiCount(@Nullable TextView textView) {
        this.tvTodayPaiCount = textView;
    }
}
