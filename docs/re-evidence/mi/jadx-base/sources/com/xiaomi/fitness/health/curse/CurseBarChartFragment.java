package com.xiaomi.fitness.health.curse;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MultiBarEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.data.valueformatter.CurseHistoryHighLightValueFormatter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.curse.CurseBarChartFragment;
import com.xiaomi.fitness.health.curse.vm.CurseListVM;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.MultiDataTitleView;
import defpackage.c0j;
import defpackage.eu3;
import defpackage.eub;
import defpackage.hak;
import defpackage.jui;
import defpackage.onq;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.r02;
import defpackage.str;
import defpackage.u9g;
import defpackage.v9g;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00018B\u0007¢\u0006\u0004\b7\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0007J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0007J!\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0007J\u000f\u0010\u0016\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0016\u0010\u0007J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0007R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\t0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010&¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseBarChartFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/curse/vm/CurseListVM;", "Leub;", "Lcom/xiaomi/fitness/health/curse/CurseManager$OnConfigChange;", "", Constants.KEY_REQUEST_DATA, "()V", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "originList", "onDataResult", "(Ljava/util/List;)V", "refreshVisibleEntries", "initView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDataChange", "onVisible", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "mBarChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Lcom/xiaomi/fitness/view/MultiDataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/MultiDataTitleView;", "topGuideView", "Landroid/view/View;", "Lu9g;", "mBarChartAdapter", "Lu9g;", "", "Lcom/xiaomi/fitness/chart/entrys/MultiBarEntry;", "mBarEntries", "Ljava/util/List;", "Lv9g;", "mItemDecoration", "Lv9g;", "Lvnq;", "mYAxis", "Lvnq;", "Lvqr;", "mXAxis", "Lvqr;", "Lonq;", "valueFormatter", "Lonq;", "Lr02;", "mBarChartAttrs", "Lr02;", "curseRecordList", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCurseBarChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseBarChartFragment.kt\ncom/xiaomi/fitness/health/curse/CurseBarChartFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1#2:227\n*E\n"})
public final class CurseBarChartFragment extends Hilt_CurseBarChartFragment<CurseListVM, eub> implements CurseManager.OnConfigChange {

    @NotNull
    public static final String TAG = "CurseBarChart";

    @NotNull
    private List<Record> curseRecordList;

    @Nullable
    private MultiDataTitleView dataTitleView;

    @Nullable
    private u9g mBarChartAdapter;

    @Nullable
    private r02 mBarChartAttrs;

    @Nullable
    private BarChartRecyclerView mBarChartRecyclerView;

    @NotNull
    private List<MultiBarEntry> mBarEntries;

    @Nullable
    private v9g mItemDecoration;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private vnq<?> mYAxis;

    @Nullable
    private View topGuideView;

    @Nullable
    private onq valueFormatter;

    public CurseBarChartFragment() {
        super(jui.t3);
        this.mBarEntries = new ArrayList();
        this.curseRecordList = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CurseListVM access$getMViewModel(CurseBarChartFragment curseBarChartFragment) {
        return (CurseListVM) curseBarChartFragment.getMViewModel();
    }

    private final void initView() {
        BarChartRecyclerView barChartRecyclerView = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        this.mBarChartAttrs = (r02) barChartRecyclerView.mAttrs;
        BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.valueFormatter = barChartRecyclerHelper.createXAxisFormatter(contextRequireContext, 1);
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.mBarChartAttrs);
        this.mYAxis = vnq.p(this.mBarChartAttrs, 30.0f, 3);
        r02 r02Var = this.mBarChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        vqr vqrVar = new vqr(r02Var, r02Var.c, this.valueFormatter);
        this.mXAxis = vqrVar;
        this.mItemDecoration = new v9g(this.mYAxis, vqrVar, this.mBarChartAttrs);
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        CurseHistoryHighLightValueFormatter curseHistoryHighLightValueFormatter = new CurseHistoryHighLightValueFormatter(contextRequireContext2);
        v9g v9gVar = this.mItemDecoration;
        Intrinsics.checkNotNull(v9gVar);
        v9gVar.setHighLightValueFormatter(curseHistoryHighLightValueFormatter);
        BarChartRecyclerView barChartRecyclerView2 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        v9g v9gVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(v9gVar2);
        barChartRecyclerView2.addItemDecoration(v9gVar2);
        this.mBarChartAdapter = new u9g(getActivity(), this.mBarEntries, this.mBarChartRecyclerView, this.mXAxis, this.mBarChartAttrs, curseHistoryHighLightValueFormatter);
        BarChartRecyclerView barChartRecyclerView3 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        barChartRecyclerView3.setAdapter(this.mBarChartAdapter);
        BarChartRecyclerView barChartRecyclerView4 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView5 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.mBarChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.curse.CurseBarChartFragment$initView$itemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    MultiDataTitleView multiDataTitleView = this.this$0.dataTitleView;
                    if (multiDataTitleView != null) {
                        multiDataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                MultiDataTitleView multiDataTitleView2 = this.this$0.dataTitleView;
                if (multiDataTitleView2 != null) {
                    multiDataTitleView2.setVisibility(4);
                }
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == 0) {
                    if (!recyclerView.canScrollHorizontally(-1)) {
                        CurseBarChartFragment.access$getMViewModel(this.this$0).getData(false, 30);
                    }
                    this.this$0.refreshVisibleEntries();
                }
            }
        });
        BarChartRecyclerView barChartRecyclerView6 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataResult(List<Record> originList) {
        boolean z;
        Logger.i(TAG, "onDataResult size:" + originList.size());
        if (((CurseListVM) getMViewModel()).getFirstPage()) {
            this.mBarEntries.clear();
            this.curseRecordList.clear();
            ((CurseListVM) getMViewModel()).setFirstPage(false);
            z = true;
        } else {
            z = false;
        }
        this.curseRecordList.addAll(originList);
        List<MultiBarEntry> listBuildEmptyEntryList = (z && originList.isEmpty()) ? CurseChartHelper.INSTANCE.buildEmptyEntryList() : CurseChartHelper.INSTANCE.buildBarEntryList(originList);
        if (listBuildEmptyEntryList != null) {
            this.mBarEntries.addAll(listBuildEmptyEntryList);
            u9g u9gVar = this.mBarChartAdapter;
            Intrinsics.checkNotNull(u9gVar);
            u9gVar.notifyDataSetChanged();
        }
        if (this.curseRecordList.isEmpty()) {
            View view = this.topGuideView;
            if (view != null) {
                ViewExtKt.setVisible(view, false);
            }
            MultiDataTitleView multiDataTitleView = this.dataTitleView;
            if (multiDataTitleView != null) {
                MultiDataTitleView.showEmpty$default(multiDataTitleView, 0, 1, null);
                return;
            }
            return;
        }
        View view2 = this.topGuideView;
        if (view2 != null) {
            ViewExtKt.setVisible(view2, true);
        }
        BarChartRecyclerView barChartRecyclerView = this.mBarChartRecyclerView;
        if (barChartRecyclerView != null) {
            barChartRecyclerView.post(new Runnable() { // from class: m55
                @Override // java.lang.Runnable
                public final void run() {
                    CurseBarChartFragment.onDataResult$lambda$2(this.f25761a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDataResult$lambda$2(CurseBarChartFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshVisibleEntries();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onVisible$lambda$5(CurseBarChartFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshVisibleEntries();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshVisibleEntries() {
        MultiBarEntry.a aVar;
        MultiBarEntry.a aVar2;
        if (this.curseRecordList.isEmpty()) {
            return;
        }
        str strVarJ = eu3.j(this.mBarChartRecyclerView, 6);
        Intrinsics.checkNotNullExpressionValue(strVarJ, "getVisibleEntries(...)");
        List<T> list = strVarJ.c;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fitness.chart.entrys.MultiBarEntry>");
        int size = list.size();
        Logger.i(TAG, "refreshVisibleEntries visibleEntries size " + size);
        if (size == 0) {
            return;
        }
        List<T> list2 = list;
        Iterator it = list2.iterator();
        int i = 0;
        while (it.hasNext()) {
            List<MultiBarEntry.a> listA = ((MultiBarEntry) it.next()).a();
            i += (listA == null || (aVar2 = (MultiBarEntry.a) CollectionsKt___CollectionsKt.getOrNull(listA, 0)) == null) ? 0 : aVar2.f11757b;
        }
        int i2 = i / size;
        Iterator it2 = list2.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            List<MultiBarEntry.a> listA2 = ((MultiBarEntry) it2.next()).a();
            i3 += (listA2 == null || (aVar = (MultiBarEntry.a) CollectionsKt___CollectionsKt.getOrNull(listA2, 1)) == null) ? 0 : aVar.f11757b;
        }
        int i4 = i3 / size;
        ArrayList arrayList = new ArrayList();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        arrayList.add(new qpo(contextRequireContext.getString(c0j.G5), String.valueOf(i4), contextRequireContext.getResources().getQuantityString(qxi.B, i4, Integer.valueOf(i4))));
        arrayList.add(new qpo(contextRequireContext.getString(c0j.F5), String.valueOf(i2), contextRequireContext.getResources().getQuantityString(qxi.B, i2, Integer.valueOf(i2))));
        MultiDataTitleView multiDataTitleView = this.dataTitleView;
        if (multiDataTitleView != null) {
            multiDataTitleView.showNormal(arrayList);
        }
        float theMaxNumber = HealthUtil.getTheMaxNumber(list);
        vnq<?> vnqVar = this.mYAxis;
        vnq<?> vnqVarS = vnqVar != null ? vnqVar.s(vnqVar, theMaxNumber, 1) : null;
        this.mYAxis = vnqVarS;
        v9g v9gVar = this.mItemDecoration;
        if (v9gVar != null) {
            v9gVar.setYAxis(vnqVarS);
        }
        u9g u9gVar = this.mBarChartAdapter;
        if (u9gVar != null) {
            u9gVar.setYAxis(this.mYAxis);
        }
        u9g u9gVar2 = this.mBarChartAdapter;
        Intrinsics.checkNotNull(u9gVar2);
        u9gVar2.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        ((CurseListVM) getMViewModel()).getEmitter().observe(getViewLifecycleOwner(), new CurseBarChartFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: o55
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseBarChartFragment.requestData$lambda$0(this.f28741a, (List) obj);
            }
        }));
        ((CurseListVM) getMViewModel()).getData(true, 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(CurseBarChartFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.onDataResult(list);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.curse.CurseManager.OnConfigChange
    public void onDataChange() {
        Logger.i(TAG, "onDataChange");
        ((CurseListVM) getMViewModel()).getData(true, 30);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        CurseManager.INSTANCE.getInstance().removeObserver(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        this.dataTitleView = ((eub) getMBinding()).B;
        this.mBarChartRecyclerView = ((eub) getMBinding()).A;
        this.topGuideView = ((eub) getMBinding()).C;
        initView();
        requestData();
        CurseManager.INSTANCE.getInstance().addDataObserver(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        BarChartRecyclerView barChartRecyclerView = this.mBarChartRecyclerView;
        if (barChartRecyclerView != null) {
            barChartRecyclerView.post(new Runnable() { // from class: n55
                @Override // java.lang.Runnable
                public final void run() {
                    CurseBarChartFragment.onVisible$lambda$5(this.f27561a);
                }
            });
        }
    }
}
