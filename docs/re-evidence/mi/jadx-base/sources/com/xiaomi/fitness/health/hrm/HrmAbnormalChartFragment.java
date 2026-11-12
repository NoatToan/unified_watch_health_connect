package com.xiaomi.fitness.health.hrm;

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
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.c0j;
import defpackage.eah;
import defpackage.hak;
import defpackage.iji;
import defpackage.jui;
import defpackage.q02;
import defpackage.q7a;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.sbo;
import defpackage.vqr;
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
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 T2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001TB\u0007¢\u0006\u0004\bS\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J1\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u00142\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0006J!\u0010'\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u00109\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010IR\u0016\u0010K\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006U"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/HrmAbnormalChartFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "Lq7a;", "", "fillData", "()V", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "abnormalRecordItem", "refreshBarChart", "(Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;)V", "", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "entries", "", "getTheMinNumber", "(Ljava/util/List;)I", "getTheMaxNumber", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalItem;", "abnormalList", "", "", "convertAbnormalListToTimeMap", "(Ljava/util/List;)Ljava/util/Map;", "time", "zeroSecond", "(J)J", "", "getTitleBarString", "()Ljava/lang/String;", "getUnderstandTitle", "getUnderstandDesc", "initViewBinding", "initBarChart", "initBundle", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "abnormalItem", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "titleBarView", "Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "barChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Lr02;", "barChartAttrs", "Lr02;", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "entryList", "Ljava/util/List;", "Lrtr;", "yAxis", "Lrtr;", "Lvqr;", "xAxis", "Lvqr;", "Lq02;", "chartAdapter", "Lq02;", "Lsbo;", "chartItemDecoration", "Lsbo;", "Landroid/widget/TextView;", "tvUnderstandTitle", "Landroid/widget/TextView;", "tvUnderstandDesc", "currentType", "I", "Ljava/util/Calendar;", "calendar", "Ljava/util/Calendar;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHrmAbnormalChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HrmAbnormalChartFragment.kt\ncom/xiaomi/fitness/health/hrm/HrmAbnormalChartFragment\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n216#2,2:303\n1863#3,2:305\n*S KotlinDebug\n*F\n+ 1 HrmAbnormalChartFragment.kt\ncom/xiaomi/fitness/health/hrm/HrmAbnormalChartFragment\n*L\n128#1:303,2\n214#1:305,2\n*E\n"})
public final class HrmAbnormalChartFragment extends Hilt_HrmAbnormalChartFragment<BasicDataViewModel, q7a> {

    @NotNull
    public static final String PARAM_ABNORMAL_ITEM = "abnormal_item";

    @NotNull
    public static final String PARAM_TYPE = "type";

    @NotNull
    public static final String TAG = "HrmAbnormalChartFragment";
    public static final int TYPE_ABNORMAL_HIGH = 1;
    public static final int TYPE_ABNORMAL_LOW = 0;

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
    private int currentType;

    @Nullable
    private DataTitleView dataTitleView;

    @Nullable
    private List<RecyclerBarEntry> entryList;

    @Nullable
    private TitleBarAlphaView titleBarView;

    @Nullable
    private TextView tvUnderstandDesc;

    @Nullable
    private TextView tvUnderstandTitle;

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
        titleBarAlphaView3.setOnTitleBarClickListener(new eah() { // from class: com.xiaomi.fitness.health.hrm.HrmAbnormalChartFragment.fillData.1
            @Override // defpackage.eah
            public void onImgBackClick(View view) {
                HrmAbnormalChartFragment.this.requireActivity().lambda$onCreate$0();
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
            txtTitle.setText(getTitleBarString());
        }
        TextView textView = this.tvUnderstandTitle;
        Intrinsics.checkNotNull(textView);
        textView.setText(getUnderstandTitle());
        TextView textView2 = this.tvUnderstandDesc;
        Intrinsics.checkNotNull(textView2);
        textView2.setText(getUnderstandDesc());
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

    private final int getTheMaxNumber(List<? extends SegmentBarEntry> entries) {
        if (entries == null || entries.isEmpty()) {
            return -1;
        }
        int maxValue = entries.get(0).getMaxValue();
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            SegmentBarEntry segmentBarEntry = entries.get(i);
            if (segmentBarEntry.getMaxValue() != 0) {
                maxValue = Math.max(maxValue, segmentBarEntry.getMaxValue());
            }
        }
        return maxValue;
    }

    private final int getTheMinNumber(List<? extends SegmentBarEntry> entries) {
        if (entries == null || entries.isEmpty()) {
            return -1;
        }
        int minValue = entries.get(0).getMinValue();
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            SegmentBarEntry segmentBarEntry = entries.get(i);
            if (minValue == 0) {
                minValue = segmentBarEntry.getMinValue();
            }
            if (segmentBarEntry.getMinValue() != 0) {
                minValue = Math.min(minValue, segmentBarEntry.getMinValue());
            }
        }
        return minValue;
    }

    private final String getTitleBarString() {
        String string = this.currentType == 1 ? getString(c0j.a9) : getString(c0j.b9);
        Intrinsics.checkNotNull(string);
        return string;
    }

    private final String getUnderstandDesc() {
        String string = this.currentType == 1 ? getString(c0j.f9) : getString(c0j.h9);
        Intrinsics.checkNotNull(string);
        return string;
    }

    private final String getUnderstandTitle() {
        String string = this.currentType == 1 ? getString(c0j.g9) : getString(c0j.i9);
        Intrinsics.checkNotNull(string);
        return string;
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
        AbnormalHrmHighLightMarkValueFormatter abnormalHrmHighLightMarkValueFormatter = new AbnormalHrmHighLightMarkValueFormatter(0);
        sbo sboVar = this.chartItemDecoration;
        Intrinsics.checkNotNull(sboVar);
        sboVar.setHighLightValueFormatter(abnormalHrmHighLightMarkValueFormatter);
        this.chartAdapter = new q02<>(requireContext(), this.entryList, this.barChartRecyclerView, this.xAxis, this.barChartAttrs, abnormalHrmHighLightMarkValueFormatter);
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
        barChartRecyclerView6.addOnItemTouchListener(new hak(requireContext(), this.barChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.hrm.HrmAbnormalChartFragment.initBarChart.1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                super.onItemSelected(barEntry, position);
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = HrmAbnormalChartFragment.this.dataTitleView;
                    Intrinsics.checkNotNull(dataTitleView);
                    dataTitleView.setVisibility(0);
                } else {
                    DataTitleView dataTitleView2 = HrmAbnormalChartFragment.this.dataTitleView;
                    Intrinsics.checkNotNull(dataTitleView2);
                    dataTitleView2.setVisibility(4);
                }
            }
        }));
    }

    private final void initBundle() {
        Bundle arguments = getArguments();
        this.abnormalItem = (SegmentItem) (arguments != null ? arguments.getSerializable("abnormal_item") : null);
        Bundle arguments2 = getArguments();
        this.currentType = arguments2 != null ? arguments2.getInt("type") : 0;
        SegmentItem segmentItem = this.abnormalItem;
        String string = segmentItem != null ? segmentItem.toString() : null;
        Logger.i(TAG, "bundle abnormalItem is " + string + ",type is " + this.currentType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewBinding() {
        this.titleBarView = ((q7a) getMBinding()).E;
        this.barChartRecyclerView = ((q7a) getMBinding()).A;
        this.dataTitleView = ((q7a) getMBinding()).B;
        this.tvUnderstandTitle = ((q7a) getMBinding()).G;
        this.tvUnderstandDesc = ((q7a) getMBinding()).F;
        initBarChart();
    }

    private final void refreshBarChart(SegmentItem abnormalRecordItem) {
        String strValueOf;
        sbo sboVar = this.chartItemDecoration;
        Intrinsics.checkNotNull(sboVar);
        sboVar.d(abnormalRecordItem.getStartTime(), abnormalRecordItem.getEndTime());
        Map<Long, List<Integer>> mapConvertAbnormalListToTimeMap = convertAbnormalListToTimeMap(abnormalRecordItem.getItems());
        ArrayList arrayList = new ArrayList();
        if (!mapConvertAbnormalListToTimeMap.isEmpty()) {
            int size = mapConvertAbnormalListToTimeMap.size();
            int iA = x44.a(iji.A0);
            for (Map.Entry<Long, List<Integer>> entry : mapConvertAbnormalListToTimeMap.entrySet()) {
                SegmentBarEntry segmentBarEntry = new SegmentBarEntry(SegmentBarEntry.INSTANCE.getRectModels(10, entry.getValue(), iA, iA), 10);
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
            float theMaxNumber = HealthUtil.getTheMaxNumber(this.entryList);
            rtr rtrVar = this.yAxis;
            Intrinsics.checkNotNull(rtrVar);
            this.yAxis = rtrVar.l(this.yAxis, theMaxNumber);
            sbo sboVar2 = this.chartItemDecoration;
            Intrinsics.checkNotNull(sboVar2);
            sboVar2.setYAxis(this.yAxis);
            sbo sboVar3 = this.chartItemDecoration;
            Intrinsics.checkNotNull(sboVar3);
            sboVar3.setXAxis(this.xAxis);
            q02<RecyclerBarEntry> q02Var = this.chartAdapter;
            Intrinsics.checkNotNull(q02Var);
            q02Var.setXAxis(this.xAxis);
            sbo sboVar4 = this.chartItemDecoration;
            Intrinsics.checkNotNull(sboVar4);
            sboVar4.f = true;
            sbo sboVar5 = this.chartItemDecoration;
            Intrinsics.checkNotNull(sboVar5);
            sboVar5.c(abnormalRecordItem.getAbnormalSetValue());
            q02<RecyclerBarEntry> q02Var2 = this.chartAdapter;
            Intrinsics.checkNotNull(q02Var2);
            q02Var2.notifyDataSetChanged();
        }
        if (ArrayUtils.isEmpty(arrayList)) {
            return;
        }
        int theMaxNumber2 = getTheMaxNumber(arrayList);
        int theMinNumber = getTheMinNumber(arrayList);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        String str = String.format(locale, "%s-%s", Arrays.copyOf(new Object[]{TimeDateUtil.getDateStr(abnormalRecordItem.getStartTime(), TimeUtils.FORMAT_H_M), TimeDateUtil.getDateStr(abnormalRecordItem.getEndTime(), TimeUtils.FORMAT_H_M)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String quantityString = getResources().getQuantityString(qxi.common_unit_heart_rate, 1);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        if (theMaxNumber2 == theMinNumber) {
            strValueOf = String.valueOf(theMaxNumber2);
        } else {
            strValueOf = String.format(locale, "%s-%s", Arrays.copyOf(new Object[]{String.valueOf(theMinNumber), String.valueOf(theMaxNumber2)}, 2));
            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
        }
        DataTitleView dataTitleView = this.dataTitleView;
        Intrinsics.checkNotNull(dataTitleView);
        dataTitleView.a(requireContext(), strValueOf + " " + quantityString, strValueOf, str);
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
        return jui.g0;
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
