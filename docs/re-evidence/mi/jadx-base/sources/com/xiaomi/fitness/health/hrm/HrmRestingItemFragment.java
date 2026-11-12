package com.xiaomi.fitness.health.hrm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.valueformatter.HrmRestingHighLightMarkValueFormatter;
import com.xiaomi.fitness.health.hrm.HrmRestingItemFragment;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.c0j;
import defpackage.eah;
import defpackage.frr;
import defpackage.hak;
import defpackage.jui;
import defpackage.qxi;
import defpackage.rtr;
import defpackage.ufe;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.yfe;
import defpackage.yub;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bm\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J/\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010\u0005R$\u0010%\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010&R$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0004\u0018\u0001068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020/8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b=\u00101\u001a\u0004\b>\u00103R$\u0010@\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010G\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001e\u0010N\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001e\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\\R$\u0010^\u001a\u0004\u0018\u00010]8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010e\u001a\u0004\u0018\u00010d8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0018\u0010k\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006n"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/HrmRestingItemFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Leah;", "", "refreshSelectDateIfNeed", "()V", "initLineChartRecyclerView", "refreshBarChart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "bindTitleBarAlphaView", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "Lvfe;", "lineChartAttrs", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "report", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "createDayEntries", "(Lvfe;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;)Ljava/util/List;", "onImgBackClick", "(Landroid/view/View;)V", "onImgShareClick", "onShowCalendar", "mCurrentDate", "Lorg/joda/time/LocalDate;", "getMCurrentDate", "()Lorg/joda/time/LocalDate;", "setMCurrentDate", "(Lorg/joda/time/LocalDate;)V", "mSavedStateDate", "getMSavedStateDate", "setMSavedStateDate", "mCurrentLocalDate", "", "sid", "Ljava/lang/String;", "getSid", "()Ljava/lang/String;", "setSid", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/health/hrm/HrmViewModel;", "basicDataViewModel", "Lcom/xiaomi/fitness/health/hrm/HrmViewModel;", "getBasicDataViewModel", "()Lcom/xiaomi/fitness/health/hrm/HrmViewModel;", "setBasicDataViewModel", "(Lcom/xiaomi/fitness/health/hrm/HrmViewModel;)V", "logTag", "getLogTag", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "lineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "getLineChartRecyclerView", "()Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "setLineChartRecyclerView", "(Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;)V", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "getDataTitleView", "()Lcom/xiaomi/fitness/view/DataTitleView;", "setDataTitleView", "(Lcom/xiaomi/fitness/view/DataTitleView;)V", "Lufe;", "mLineChartAdapter", "Lufe;", "", "mChartEntries", "Ljava/util/List;", "Lyfe;", "mItemDecoration", "Lyfe;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lvfe;", "Lyub;", "binding", "Lyub;", "getBinding", "()Lyub;", "setBinding", "(Lyub;)V", "Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "titleBarAlphaView", "Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "getTitleBarAlphaView", "()Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "setTitleBarAlphaView", "(Lcom/xiaomi/fitness/view/TitleBarAlphaView;)V", "mDailyHrmReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHrmRestingItemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HrmRestingItemFragment.kt\ncom/xiaomi/fitness/health/hrm/HrmRestingItemFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n1#2:256\n*E\n"})
public final class HrmRestingItemFragment extends BaseFragment implements eah {

    @Nullable
    private HrmViewModel basicDataViewModel;

    @Nullable
    private yub binding;

    @Nullable
    private DataTitleView dataTitleView;

    @Nullable
    private vfe lineChartAttrs;

    @Nullable
    private LineChartRecyclerView lineChartRecyclerView;

    @NotNull
    private final String logTag;

    @Nullable
    private List<MaxMinEntry> mChartEntries;

    @Nullable
    private LocalDate mCurrentDate;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private DailyHrReport mDailyHrmReport;

    @Nullable
    private yfe mItemDecoration;

    @Nullable
    private ufe<MaxMinEntry> mLineChartAdapter;

    @Nullable
    private LocalDate mSavedStateDate;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private String sid;

    @Nullable
    private TitleBarAlphaView titleBarAlphaView;

    public HrmRestingItemFragment() {
        super(jui.D3);
        String simpleName = HrmRestingItemFragment.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.logTag = simpleName;
    }

    private final void initLineChartRecyclerView() {
        LineChartRecyclerView lineChartRecyclerView = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        this.lineChartAttrs = (vfe) lineChartRecyclerView.mAttrs;
        this.mChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.lineChartAttrs);
        this.mYAxis = new rtr(this.lineChartAttrs);
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        vqr vqrVar = new vqr(vfeVar, vfeVar.c, new frr(requireContext()));
        this.mXAxis = vqrVar;
        yfe yfeVar = new yfe(this.mYAxis, vqrVar, this.lineChartAttrs);
        this.mItemDecoration = yfeVar;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setBreakPointLine(Boolean.TRUE);
        HrmRestingHighLightMarkValueFormatter hrmRestingHighLightMarkValueFormatter = new HrmRestingHighLightMarkValueFormatter(0);
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        yfeVar2.setHighLightValueFormatter(hrmRestingHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView2 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        yfe yfeVar3 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar3);
        lineChartRecyclerView2.addItemDecoration(yfeVar3);
        this.mLineChartAdapter = new ufe<>(getActivity(), this.mChartEntries, this.lineChartRecyclerView, this.mXAxis, this.lineChartAttrs, hrmRestingHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView3 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        lineChartRecyclerView3.setAdapter(this.mLineChartAdapter);
        LineChartRecyclerView lineChartRecyclerView4 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView5 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.lineChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.hrm.HrmRestingItemFragment$initLineChartRecyclerView$itemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = this.this$0.getDataTitleView();
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                DataTitleView dataTitleView2 = this.this$0.getDataTitleView();
                if (dataTitleView2 != null) {
                    dataTitleView2.setVisibility(4);
                }
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(HrmRestingItemFragment this$0, DailyHrReport dailyHrReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mDailyHrmReport = dailyHrReport;
        this$0.refreshBarChart();
        return Unit.INSTANCE;
    }

    private final void refreshBarChart() {
        DailyHrReport dailyHrReport = this.mDailyHrmReport;
        if (dailyHrReport == null) {
            LocalDate localDate = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate);
            dailyHrReport = new DailyHrReport(TimeDateUtil.changZeroOfTheDay(localDate), "days");
        }
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        List<MaxMinEntry> listCreateDayEntries = createDayEntries(vfeVar, dailyHrReport);
        List<MaxMinEntry> list = this.mChartEntries;
        if (list != null) {
            list.clear();
        }
        List<MaxMinEntry> list2 = this.mChartEntries;
        if (list2 != null) {
            list2.addAll(listCreateDayEntries);
        }
        float theMaxNumber = HealthUtil.getTheMaxNumber(listCreateDayEntries);
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtr rtrVarL = rtrVar.l(this.mYAxis, theMaxNumber + 10.0f);
        this.mYAxis = rtrVarL;
        Intrinsics.checkNotNull(rtrVarL);
        rtrVarL.setLabelCount(3);
        rtr rtrVar2 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.f = 3;
        int size = listCreateDayEntries.size();
        vqr vqrVar = this.mXAxis;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.f37144a = size;
        yfe yfeVar = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setYAxis(this.mYAxis);
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        yfeVar2.setXAxis(this.mXAxis);
        ufe<MaxMinEntry> ufeVar = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar);
        ufeVar.setYAxis(this.mYAxis);
        ufe<MaxMinEntry> ufeVar2 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar2);
        ufeVar2.setXAxis(this.mXAxis);
        ufe<MaxMinEntry> ufeVar3 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar3);
        ufeVar3.notifyDataSetChanged();
        DailyHrReport dailyHrReport2 = this.mDailyHrmReport;
        if (dailyHrReport2 != null) {
            Intrinsics.checkNotNull(dailyHrReport2);
            if (dailyHrReport2.getRestHr() != null) {
                DailyHrReport dailyHrReport3 = this.mDailyHrmReport;
                Intrinsics.checkNotNull(dailyHrReport3);
                Integer restHr = dailyHrReport3.getRestHr();
                Intrinsics.checkNotNull(restHr);
                if (restHr.intValue() > 0) {
                    String string = getString(c0j.Eb);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    DailyHrReport dailyHrReport4 = this.mDailyHrmReport;
                    Intrinsics.checkNotNull(dailyHrReport4);
                    Integer restHr2 = dailyHrReport4.getRestHr();
                    Intrinsics.checkNotNull(restHr2);
                    int iIntValue = restHr2.intValue();
                    String quantityString = requireContext().getResources().getQuantityString(qxi.common_unit_heart_rate_desc2, iIntValue, restHr2);
                    Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                    String strValueOf = String.valueOf(iIntValue);
                    DataTitleView dataTitleView = this.dataTitleView;
                    if (dataTitleView != null) {
                        dataTitleView.a(requireContext(), quantityString, strValueOf, string);
                        return;
                    }
                    return;
                }
            }
        }
        DataTitleView dataTitleView2 = this.dataTitleView;
        if (dataTitleView2 != null) {
            dataTitleView2.c(getString(c0j.L6));
        }
    }

    private final void refreshSelectDateIfNeed() {
        LocalDate localDate = this.mSavedStateDate;
        if (localDate != null) {
            this.mCurrentDate = localDate;
            this.mSavedStateDate = null;
        } else {
            Bundle arguments = getArguments();
            this.mCurrentDate = (LocalDate) (arguments != null ? arguments.getSerializable("local_date") : null);
        }
        if (this.mCurrentDate == null) {
            this.mCurrentDate = LocalDate.now();
        }
    }

    public final void bindTitleBarAlphaView(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
        String dateMMddFormat;
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        String string = getString(c0j.Hb);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (TimeDateUtil.isSameLocalDate(startDate, endDate)) {
            dateMMddFormat = TimeDateUtil.getDateMMddFormat(startDate);
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            dateMMddFormat = String.format("%s-%s", Arrays.copyOf(new Object[]{TimeDateUtil.getDateMMddFormat(startDate), TimeDateUtil.getDateMMddFormat(endDate)}, 2));
            Intrinsics.checkNotNullExpressionValue(dateMMddFormat, "format(...)");
        }
        TitleBarAlphaView titleBarAlphaView = this.titleBarAlphaView;
        Intrinsics.checkNotNull(titleBarAlphaView);
        titleBarAlphaView.bindData(string, dateMMddFormat);
        TitleBarAlphaView titleBarAlphaView2 = this.titleBarAlphaView;
        Intrinsics.checkNotNull(titleBarAlphaView2);
        titleBarAlphaView2.setOnTitleBarClickListener(this);
        TitleBarAlphaView titleBarAlphaView3 = this.titleBarAlphaView;
        Intrinsics.checkNotNull(titleBarAlphaView3);
        titleBarAlphaView3.setTitleClickable(false);
        TitleBarAlphaView titleBarAlphaView4 = this.titleBarAlphaView;
        Intrinsics.checkNotNull(titleBarAlphaView4);
        titleBarAlphaView4.setShareImgVisible(8);
    }

    @NotNull
    public final List<MaxMinEntry> createDayEntries(@NotNull vfe lineChartAttrs, @NotNull DailyHrReport report) {
        Integer restHr;
        Intrinsics.checkNotNullParameter(lineChartAttrs, "lineChartAttrs");
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateMinusDays = this.mCurrentDate;
        List<DailyHrReport> hrReportList = report.getHrReportList();
        HashMap map = new HashMap();
        if (hrReportList != null) {
            for (DailyHrReport dailyHrReport : hrReportList) {
                map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(dailyHrReport.getTime())), dailyHrReport);
            }
        }
        for (int i = 0; i < 30; i++) {
            Intrinsics.checkNotNull(localDateMinusDays);
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            DailyHrReport dailyHrReport2 = (DailyHrReport) map.get(Long.valueOf(jChangZeroOfTheDay));
            MaxMinEntry maxMinEntry = new MaxMinEntry(i, (dailyHrReport2 == null || (restHr = dailyHrReport2.getRestHr()) == null) ? 0 : restHr.intValue(), jChangZeroOfTheDay, i % 5 == 0 ? 2 : 3);
            maxMinEntry.localDate = localDateMinusDays;
            arrayList.add(maxMinEntry);
            localDateMinusDays = localDateMinusDays.minusDays(1);
        }
        return arrayList;
    }

    @Nullable
    public final HrmViewModel getBasicDataViewModel() {
        return this.basicDataViewModel;
    }

    @Nullable
    public final yub getBinding() {
        return this.binding;
    }

    @Nullable
    public final DataTitleView getDataTitleView() {
        return this.dataTitleView;
    }

    @Nullable
    public final LineChartRecyclerView getLineChartRecyclerView() {
        return this.lineChartRecyclerView;
    }

    @NotNull
    public final String getLogTag() {
        return this.logTag;
    }

    @Nullable
    public final LocalDate getMCurrentDate() {
        return this.mCurrentDate;
    }

    @Nullable
    public final LocalDate getMSavedStateDate() {
        return this.mSavedStateDate;
    }

    @Nullable
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    public final TitleBarAlphaView getTitleBarAlphaView() {
        return this.titleBarAlphaView;
    }

    @Override // defpackage.eah
    public void onImgBackClick(@Nullable View view) {
        requireActivity().lambda$onCreate$0();
    }

    @Override // defpackage.eah
    public void onImgShareClick(@Nullable View view) {
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        yub yubVarA0 = yub.A0(inflater, container, false);
        this.binding = yubVarA0;
        Intrinsics.checkNotNull(yubVarA0);
        this.dataTitleView = yubVarA0.A;
        yub yubVar = this.binding;
        Intrinsics.checkNotNull(yubVar);
        this.lineChartRecyclerView = yubVar.B;
        yub yubVar2 = this.binding;
        Intrinsics.checkNotNull(yubVar2);
        this.titleBarAlphaView = yubVar2.C;
        yub yubVar3 = this.binding;
        Intrinsics.checkNotNull(yubVar3);
        return yubVar3.getRoot();
    }

    @Override // defpackage.eah
    public void onShowCalendar() {
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        this.basicDataViewModel = (HrmViewModel) new ViewModelProvider(mActivity).get(HrmViewModel.class);
        if (savedInstanceState != null) {
            LocalDate localDate = (LocalDate) savedInstanceState.getSerializable("saved_date");
            this.mSavedStateDate = localDate;
            Logger.i(this.logTag, "mSavedStateDate " + localDate);
        }
        refreshSelectDateIfNeed();
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            LocalDate localDateMinusDays = null;
            Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("offset", 0)) : null;
            if (numValueOf != null) {
                localDateMinusDays = LocalDate.now().minusDays(numValueOf.intValue());
            }
            this.mCurrentDate = localDateMinusDays;
        }
        initLineChartRecyclerView();
        LocalDate localDate2 = this.mCurrentDate;
        Intrinsics.checkNotNull(localDate2);
        LocalDate localDateMinusDays2 = localDate2.minusDays(29);
        Intrinsics.checkNotNull(localDateMinusDays2);
        LocalDate localDate3 = this.mCurrentDate;
        Intrinsics.checkNotNull(localDate3);
        bindTitleBarAlphaView(localDateMinusDays2, localDate3);
        LocalDate localDate4 = this.mCurrentDate;
        this.mCurrentLocalDate = localDate4;
        Intrinsics.checkNotNull(localDate4);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDate4);
        HrmViewModel hrmViewModel = this.basicDataViewModel;
        Intrinsics.checkNotNull(hrmViewModel);
        hrmViewModel.queryRestingHrmRecords(jChangZeroOfTheDay).observe(getViewLifecycleOwner(), new HrmRestingItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yec
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrmRestingItemFragment.onViewCreated$lambda$1(this.f40094a, (DailyHrReport) obj);
            }
        }));
    }

    public final void setBasicDataViewModel(@Nullable HrmViewModel hrmViewModel) {
        this.basicDataViewModel = hrmViewModel;
    }

    public final void setBinding(@Nullable yub yubVar) {
        this.binding = yubVar;
    }

    public final void setDataTitleView(@Nullable DataTitleView dataTitleView) {
        this.dataTitleView = dataTitleView;
    }

    public final void setLineChartRecyclerView(@Nullable LineChartRecyclerView lineChartRecyclerView) {
        this.lineChartRecyclerView = lineChartRecyclerView;
    }

    public final void setMCurrentDate(@Nullable LocalDate localDate) {
        this.mCurrentDate = localDate;
    }

    public final void setMSavedStateDate(@Nullable LocalDate localDate) {
        this.mSavedStateDate = localDate;
    }

    public final void setSid(@Nullable String str) {
        this.sid = str;
    }

    public final void setTitleBarAlphaView(@Nullable TitleBarAlphaView titleBarAlphaView) {
        this.titleBarAlphaView = titleBarAlphaView;
    }
}
