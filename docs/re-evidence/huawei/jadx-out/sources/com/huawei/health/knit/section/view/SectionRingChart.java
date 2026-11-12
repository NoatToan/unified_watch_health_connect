package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.knit.section.adapter.SectionRingChartAdapter;
import com.huawei.health.knit.section.adapter.SectionRingChartData;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.chart.HealthChart;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.fts;
import defpackage.qrs;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class SectionRingChart extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthChart f7904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthRecycleView f7905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f7906c;
    private Context d;
    private HealthTextView e;
    private HealthTextView i;
    private SectionRingChartAdapter j;

    public SectionRingChart(Context context) {
        this(context, null);
    }

    public SectionRingChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionRingChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(final Context context) {
        LogUtil.a("Section_Ring_Chart", "onCreateView");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_ring_chart_layout, (ViewGroup) this, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.section_root_view);
        this.f7906c = linearLayout;
        linearLayout.post(new Runnable() { // from class: fwi
            @Override // java.lang.Runnable
            public final void run() {
                this.f34636a.e(context);
            }
        });
        this.f7904a = (HealthChart) viewInflate.findViewById(R.id.section_ring_chart);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.section_ring_chart_desc);
        this.f7905b = (HealthRecycleView) viewInflate.findViewById(R.id.section_ring_chart_recycler_view);
        this.i = (HealthTextView) viewInflate.findViewById(R.id.year_data_type_desc);
        this.f7905b.setLayoutManager(new LinearLayoutManager(context));
        this.f7905b.setHasFixedSize(true);
        this.f7905b.setNestedScrollingEnabled(false);
        this.f7905b.b(false);
        this.f7905b.e(false);
        return viewInflate;
    }

    public /* synthetic */ void e(Context context) {
        this.f7906c.setMinimumWidth(qrs.i(context));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("Section_Ring_Chart", "bindParamsToView");
        Set<Map.Entry<String, Object>> setEntrySet = map.entrySet();
        SectionRingChartData sectionRingChartData = new SectionRingChartData();
        for (Map.Entry<String, Object> entry : setEntrySet) {
            String key = entry.getKey();
            key.hashCode();
            switch (key) {
                case "SHOW_VALUE":
                    Object value = entry.getValue();
                    if (value instanceof Boolean) {
                        sectionRingChartData.a(((Boolean) value).booleanValue());
                        break;
                    } else {
                        break;
                    }
                    break;
                case "SHOW_PERCENT":
                    Object value2 = entry.getValue();
                    if (value2 instanceof Boolean) {
                        sectionRingChartData.b(((Boolean) value2).booleanValue());
                        break;
                    } else {
                        break;
                    }
                    break;
                case "CHART_ITEM_TITLE":
                    Object value3 = entry.getValue();
                    if (fts.c(value3)) {
                        sectionRingChartData.c((List) value3);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "CHART_ITEM_VALUE":
                    Object value4 = entry.getValue();
                    if (fts.c(value4)) {
                        sectionRingChartData.d((List<Double>) value4);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "RING_CHART_DESC":
                    Object value5 = entry.getValue();
                    if (fts.j(value5)) {
                        this.e.setText(c((String) value5));
                        break;
                    } else {
                        break;
                    }
                    break;
                case "CHART_ITEM_BEGIN_COLOR":
                    Object value6 = entry.getValue();
                    if (fts.c(value6)) {
                        sectionRingChartData.e((List) value6);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "CHART_ITEM_EDN_COLOR":
                    Object value7 = entry.getValue();
                    if (fts.c(value7)) {
                        sectionRingChartData.a((List<Integer>) value7);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "REPORT_TEXT":
                    Object value8 = entry.getValue();
                    if (value8 instanceof String) {
                        String str = (String) value8;
                        this.i.setText(str);
                        this.i.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
                        break;
                    } else {
                        break;
                    }
                    break;
            }
        }
        setRecycleViewData(sectionRingChartData);
    }

    public String c(String str) {
        if (str.length() < 4) {
            return str;
        }
        int length = str.length();
        int i = length / 2;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(str.charAt(i2));
            if (i2 == i - 1) {
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_Ring_Chart";
    }

    public void setRootLayoutVisibility(int i) {
        LinearLayout linearLayout = this.f7906c;
        if (linearLayout != null) {
            linearLayout.setVisibility(i);
        }
    }

    private void setRecycleViewData(SectionRingChartData sectionRingChartData) {
        int size = sectionRingChartData.b().size();
        int[] iArr = new int[size];
        int[] iArr2 = new int[sectionRingChartData.a().size()];
        int[] iArr3 = new int[sectionRingChartData.c().size()];
        for (int i = 0; i < size; i++) {
            iArr[i] = sectionRingChartData.b().get(i).intValue();
            iArr2[i] = sectionRingChartData.a().get(i).intValue();
            iArr3[i] = sectionRingChartData.c().get(i).intValue();
        }
        this.f7904a.setChartData(sectionRingChartData.e(), iArr, iArr2, iArr3);
        SectionRingChartAdapter sectionRingChartAdapter = new SectionRingChartAdapter(this.d, sectionRingChartData);
        this.j = sectionRingChartAdapter;
        this.f7905b.setAdapter(sectionRingChartAdapter);
    }
}
