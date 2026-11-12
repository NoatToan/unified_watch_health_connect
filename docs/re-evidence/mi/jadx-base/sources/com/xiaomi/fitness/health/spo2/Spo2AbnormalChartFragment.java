package com.xiaomi.fitness.health.spo2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.c0j;
import defpackage.eah;
import defpackage.hak;
import defpackage.iji;
import defpackage.jui;
import defpackage.q02;
import defpackage.qw;
import defpackage.r02;
import defpackage.rtr;
import defpackage.sbo;
import defpackage.vqr;
import defpackage.wca;
import defpackage.x44;
import defpackage.xcm;
import defpackage.xqr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001DB\u0007¢\u0006\u0004\bC\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\u000e2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J!\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020.\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/health/spo2/Spo2AbnormalChartFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "Lwca;", "", "fillData", "()V", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "abnormalRecordItem", "refreshBarChart", "(Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;)V", "", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalItem;", "abnormalList", "", "", "", "convertAbnormalListToTimeMap", "(Ljava/util/List;)Ljava/util/Map;", "time", "zeroSecond", "(J)J", "initViewBinding", "initBarChart", "initBundle", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "abnormalItem", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "titleBarView", "Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "barChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Lr02;", "barChartAttrs", "Lr02;", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "entryList", "Ljava/util/List;", "Lrtr;", "yAxis", "Lrtr;", "Lvqr;", "xAxis", "Lvqr;", "Lq02;", "chartAdapter", "Lq02;", "Lsbo;", "chartItemDecoration", "Lsbo;", "Ljava/util/Calendar;", "calendar", "Ljava/util/Calendar;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSpo2AbnormalChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spo2AbnormalChartFragment.kt\ncom/xiaomi/fitness/health/spo2/Spo2AbnormalChartFragment\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n216#2,2:252\n1863#3,2:254\n*S KotlinDebug\n*F\n+ 1 Spo2AbnormalChartFragment.kt\ncom/xiaomi/fitness/health/spo2/Spo2AbnormalChartFragment\n*L\n118#1:252,2\n184#1:254,2\n*E\n"})
public final class Spo2AbnormalChartFragment extends Hilt_Spo2AbnormalChartFragment<BasicDataViewModel, wca> {

    @NotNull
    public static final String PARAM_ABNORMAL_ITEM = "abnormal_item";

    @NotNull
    public static final String TAG = "Spo2AbnormalChartFragment";

    @Nullable
    private SegmentItem abnormalItem;

    @Nullable
    private r02 barChartAttrs;

    @Nullable
    private BarChartRecyclerView barChartRecyclerView;
    private Calendar calendar;

    @Nullable
    private q02<RecyclerBarEntry> chartAdapter;

    @Nullable
    private sbo chartItemDecoration;

    @Nullable
    private DataTitleView dataTitleView;

    @Nullable
    private List<RecyclerBarEntry> entryList;

    @Nullable
    private TitleBarAlphaView titleBarView;

    @Nullable
    private vqr xAxis;

    @Nullable
    private rtr yAxis;

    private final Map<Long, List<Integer>> convertAbnormalListToTimeMap(List<AbnormalItem> abnormalList) {
        TreeMap treeMap = new TreeMap(ComparisonsKt__ComparisonsKt.reverseOrder());
        if (abnormalList != null) {
            for (AbnormalItem abnormalItem : abnormalList) {
                long jZeroSecond = zeroSecond(abnormalItem.getTime());
                List arrayList = (List) treeMap.get(Long.valueOf(jZeroSecond));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ListExtKt.add(arrayList, Integer.valueOf(abnormalItem.getValue()));
                treeMap.put(Long.valueOf(jZeroSecond), arrayList);
            }
        }
        return treeMap;
    }

    private final void fillData() {
        TitleBarAlphaView titleBarAlphaView = this.titleBarView;
        Intrinsics.checkNotNull(titleBarAlphaView);
        titleBarAlphaView.setShareImgVisible(8);
        TitleBarAlphaView titleBarAlphaView2 = this.titleBarView;
        Intrinsics.checkNotNull(titleBarAlphaView2);
        titleBarAlphaView2.setTitleClickable(false);
        TitleBarAlphaView titleBarAlphaView3 = this.titleBarView;
        Intrinsics.checkNotNull(titleBarAlphaView3);
        titleBarAlphaView3.setOnTitleBarClickListener(new eah() { // from class: com.xiaomi.fitness.health.spo2.Spo2AbnormalChartFragment.fillData.1
            @Override // defpackage.eah
            public void onImgBackClick(View view) {
                Spo2AbnormalChartFragment.this.requireActivity().lambda$onCreate$0();
            }

            @Override // defpackage.eah
            public void onImgShareClick(View view) {
            }

            @Override // defpackage.eah
            public void onShowCalendar() {
            }
        });
        TitleBarAlphaView titleBarAlphaView4 = this.titleBarView;
        Intrinsics.checkNotNull(titleBarAlphaView4);
        TextView txtTitle = titleBarAlphaView4.getTxtTitle();
        if (txtTitle != null) {
            txtTitle.setText(getString(c0j.Vk));
        }
        SegmentItem segmentItem = this.abnormalItem;
        if (segmentItem != null) {
            TitleBarAlphaView titleBarAlphaView5 = this.titleBarView;
            Intrinsics.checkNotNull(titleBarAlphaView5);
            TextView txtDesc = titleBarAlphaView5.getTxtDesc();
            if (txtDesc != null) {
                txtDesc.setText(TimeDateUtil.getDateYYYYMMddLocalFormat(segmentItem.getTimestamp() * ((long) 1000)));
            }
            refreshBarChart(segmentItem);
        }
    }

    private final void initBarChart() {
        BarChartRecyclerView barChartRecyclerView = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        this.barChartAttrs = (r02) barChartRecyclerView.mAttrs;
        xqr xqrVar = new xqr();
        this.entryList = new ArrayList();
        this.yAxis = new rtr(this.barChartAttrs);
        r02 r02Var = this.barChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        vqr vqrVar = new vqr(r02Var, r02Var.c, xqrVar);
        this.xAxis = vqrVar;
        this.chartItemDecoration = new sbo(this.yAxis, vqrVar, this.barChartAttrs);
        qw qwVar = new qw(0);
        sbo sboVar = this.chartItemDecoration;
        Intrinsics.checkNotNull(sboVar);
        sboVar.setHighLightValueFormatter(qwVar);
        this.chartAdapter = new q02<>(requireContext(), this.entryList, this.barChartRecyclerView, this.xAxis, this.barChartAttrs, qwVar);
        BarChartRecyclerView barChartRecyclerView2 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        barChartRecyclerView2.setAdapter(this.chartAdapter);
        BarChartRecyclerView barChartRecyclerView3 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        sbo sboVar2 = this.chartItemDecoration;
        Intrinsics.checkNotNull(sboVar2);
        barChartRecyclerView3.addItemDecoration(sboVar2);
        BarChartRecyclerView barChartRecyclerView4 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(new SpeedRatioLayoutManager(requireContext(), this.barChartAttrs));
        BarChartRecyclerView barChartRecyclerView5 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        BarChartRecyclerView barChartRecyclerView6 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(new hak(requireContext(), this.barChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.spo2.Spo2AbnormalChartFragment.initBarChart.1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                super.onItemSelected(barEntry, position);
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = Spo2AbnormalChartFragment.this.dataTitleView;
                    Intrinsics.checkNotNull(dataTitleView);
                    dataTitleView.setVisibility(0);
                } else {
                    DataTitleView dataTitleView2 = Spo2AbnormalChartFragment.this.dataTitleView;
                    Intrinsics.checkNotNull(dataTitleView2);
                    dataTitleView2.setVisibility(4);
                }
            }
        }));
    }

    private final void initBundle() {
        Bundle arguments = getArguments();
        SegmentItem segmentItem = (SegmentItem) (arguments != null ? arguments.getSerializable("abnormal_item") : null);
        this.abnormalItem = segmentItem;
        Logger.i(TAG, "bundle abnormalItem is " + (segmentItem != null ? segmentItem.toString() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewBinding() {
        this.titleBarView = ((wca) getMBinding()).D;
        this.barChartRecyclerView = ((wca) getMBinding()).A;
        this.dataTitleView = ((wca) getMBinding()).B;
        initBarChart();
    }

    private final void refreshBarChart(SegmentItem abnormalRecordItem) {
        String str;
        int i;
        sbo sboVar = this.chartItemDecoration;
        Intrinsics.checkNotNull(sboVar);
        sboVar.d(abnormalRecordItem.getStartTime(), abnormalRecordItem.getEndTime());
        Map<Long, List<Integer>> mapConvertAbnormalListToTimeMap = convertAbnormalListToTimeMap(abnormalRecordItem.getItems());
        ArrayList arrayList = new ArrayList();
        if (!mapConvertAbnormalListToTimeMap.isEmpty()) {
            int size = mapConvertAbnormalListToTimeMap.size();
            int iA = x44.a(iji.k3);
            for (Map.Entry<Long, List<Integer>> entry : mapConvertAbnormalListToTimeMap.entrySet()) {
                SegmentBarEntry segmentBarEntry = new SegmentBarEntry(SegmentBarEntry.INSTANCE.getRectModels(1, entry.getValue(), iA, iA), 10);
                segmentBarEntry.timestamp = entry.getKey().longValue();
                segmentBarEntry.type = 3;
                segmentBarEntry.setMaxValue(ArrayUtils.getMaxValueInArray(entry.getValue()));
                segmentBarEntry.setMinValue(ArrayUtils.getMinValueInArray(entry.getValue()));
                segmentBarEntry.setY(segmentBarEntry.getMaxValue());
                arrayList.add(segmentBarEntry);
            }
            List<RecyclerBarEntry> list = this.entryList;
            Intrinsics.checkNotNull(list);
            list.clear();
            List<RecyclerBarEntry> list2 = this.entryList;
            Intrinsics.checkNotNull(list2);
            list2.addAll(arrayList);
            vqr vqrVar = this.xAxis;
            Intrinsics.checkNotNull(vqrVar);
            vqrVar.f37144a = size;
            Spo2Utils spo2Utils = Spo2Utils.INSTANCE;
            int theSpoMinNumber = spo2Utils.getTheSpoMinNumber(arrayList);
            int theSpoMaxNumber = spo2Utils.getTheSpoMaxNumber(arrayList);
            float f = 85.0f;
            if (theSpoMinNumber <= 0 || theSpoMinNumber >= 85.0f) {
                i = 5;
            } else {
                f = (theSpoMinNumber / 10) * 10;
                i = 10;
            }
            float f2 = ((float) theSpoMaxNumber) > 100.0f ? ((theSpoMaxNumber / 10) * 10) + 10 : 100.0f;
            r02 r02Var = this.barChartAttrs;
            Intrinsics.checkNotNull(r02Var);
            r02Var.E = f2;
            r02 r02Var2 = this.barChartAttrs;
            Intrinsics.checkNotNull(r02Var2);
            r02Var2.F = f;
            rtr rtrVar = this.yAxis;
            Intrinsics.checkNotNull(rtrVar);
            rtrVar.setAxisMaximum(f2);
            rtr rtrVar2 = this.yAxis;
            Intrinsics.checkNotNull(rtrVar2);
            rtrVar2.setAxisMinimum(f);
            rtr rtrVar3 = this.yAxis;
            Intrinsics.checkNotNull(rtrVar3);
            rtrVar3.d(3, i);
            rtr rtrVar4 = this.yAxis;
            Intrinsics.checkNotNull(rtrVar4);
            rtrVar4.f = 3;
            sbo sboVar2 = this.chartItemDecoration;
            Intrinsics.checkNotNull(sboVar2);
            sboVar2.setYAxis(this.yAxis);
            sbo sboVar3 = this.chartItemDecoration;
            Intrinsics.checkNotNull(sboVar3);
            sboVar3.setXAxis(this.xAxis);
            sbo sboVar4 = this.chartItemDecoration;
            Intrinsics.checkNotNull(sboVar4);
            sboVar4.f = true;
            sbo sboVar5 = this.chartItemDecoration;
            Intrinsics.checkNotNull(sboVar5);
            sboVar5.c(abnormalRecordItem.getAbnormalSetValue());
            q02<RecyclerBarEntry> q02Var = this.chartAdapter;
            Intrinsics.checkNotNull(q02Var);
            q02Var.setXAxis(this.xAxis);
            q02<RecyclerBarEntry> q02Var2 = this.chartAdapter;
            Intrinsics.checkNotNull(q02Var2);
            q02Var2.notifyDataSetChanged();
        }
        if (ArrayUtils.isEmpty(arrayList)) {
            return;
        }
        Spo2Utils spo2Utils2 = Spo2Utils.INSTANCE;
        int theSpoMaxNumber2 = spo2Utils2.getTheSpoMaxNumber(arrayList);
        int theSpoMinNumber2 = spo2Utils2.getTheSpoMinNumber(arrayList);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        String str2 = String.format(locale, "%s-%s", Arrays.copyOf(new Object[]{TimeDateUtil.getDateStr(abnormalRecordItem.getStartTime(), TimeUtils.FORMAT_H_M), TimeDateUtil.getDateStr(abnormalRecordItem.getEndTime(), TimeUtils.FORMAT_H_M)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        if (theSpoMaxNumber2 == theSpoMinNumber2) {
            str = theSpoMaxNumber2 + "%";
        } else {
            str = String.format(locale, "%s-%s", Arrays.copyOf(new Object[]{theSpoMinNumber2 + "%", theSpoMaxNumber2 + "%"}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        }
        DataTitleView dataTitleView = this.dataTitleView;
        Intrinsics.checkNotNull(dataTitleView);
        dataTitleView.a(requireContext(), str, str, str2);
    }

    private final long zeroSecond(long time) {
        Calendar calendar = this.calendar;
        Calendar calendar2 = null;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendar");
            calendar = null;
        }
        long j = 1000;
        calendar.setTimeInMillis(time * j);
        Calendar calendar3 = this.calendar;
        if (calendar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendar");
            calendar3 = null;
        }
        calendar3.set(13, 0);
        Calendar calendar4 = this.calendar;
        if (calendar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendar");
            calendar4 = null;
        }
        calendar4.set(14, 0);
        Calendar calendar5 = this.calendar;
        if (calendar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendar");
        } else {
            calendar2 = calendar5;
        }
        return calendar2.getTimeInMillis() / j;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.a1;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.calendar = Calendar.getInstance();
        setActionBarDisplayable(false);
        initBundle();
        initViewBinding();
        fillData();
    }
}
