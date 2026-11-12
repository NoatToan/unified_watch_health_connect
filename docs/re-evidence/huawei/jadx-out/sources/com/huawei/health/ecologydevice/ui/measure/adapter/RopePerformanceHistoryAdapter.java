package com.huawei.health.ecologydevice.ui.measure.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import com.huawei.ecologydevice.R;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.jpq;
import defpackage.jql;
import defpackage.jqp;
import defpackage.njy;
import defpackage.nlt;
import defpackage.qsp;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class RopePerformanceHistoryAdapter extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6641a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f6643c;
    private int d;
    private int e;
    private jqp g;
    private final Resources i;
    private List<HiHealthData> h = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<List<HiHealthData>> f6642b = new ArrayList();

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i, int i2) {
        if (i2 > 0) {
            return i2;
        }
        return 0L;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i) {
        if (i > 0) {
            return i;
        }
        return 0L;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public RopePerformanceHistoryAdapter(Context context) {
        this.f6643c = context;
        this.i = context.getResources();
        e();
    }

    private void e() {
        this.e = this.i.getDimensionPixelSize(R.dimen.health_common_4dp);
        this.d = this.i.getDimensionPixelSize(R.dimen.health_common_92dp);
        this.f6641a = this.i.getDimensionPixelSize(R.dimen.health_common_64dp);
        this.g = new jqp();
    }

    public void d(List<HiHealthData> list, List<List<HiHealthData>> list2) {
        if ((list instanceof ArrayList) && (list2 instanceof ArrayList)) {
            Object objClone = ((ArrayList) list).clone();
            if (objClone instanceof ArrayList) {
                this.h = (List) objClone;
            }
            Object objClone2 = ((ArrayList) list2).clone();
            if (objClone2 instanceof ArrayList) {
                this.f6642b = (List) objClone2;
            }
        }
    }

    public void c() {
        if (njy.b(this.h)) {
            this.h.clear();
            this.h = null;
        }
        if (njy.b(this.f6642b)) {
            this.f6642b.clear();
            this.f6642b = null;
        }
        this.g = null;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        List<HiHealthData> list = this.h;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        List<List<HiHealthData>> list = this.f6642b;
        if (list != null && njy.c(list, i)) {
            return this.f6642b.get(i).size();
        }
        return 0;
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public HiHealthData getGroup(int i) {
        if (njy.c(this.h, i)) {
            return this.h.get(i);
        }
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public HiHealthData getChild(int i, int i2) {
        if (njy.c(this.f6642b, i) && !njy.e(this.f6642b.get(i), i2)) {
            return this.f6642b.get(i).get(i2);
        }
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = d();
        }
        Object tag = view.getTag();
        if (tag instanceof e) {
            e eVar = (e) tag;
            a(eVar, i, z);
            HiHealthData group = getGroup(i);
            if (group != null) {
                eVar.f6648b.setText(DateUtils.formatDateTime(this.f6643c, group.getStartTime(), 52));
                eVar.f6647a.setText(a(group));
            }
        }
        return view;
    }

    private View d() {
        e eVar = new e();
        View viewInflate = LayoutInflater.from(this.f6643c).inflate(R.layout.item_rope_performance_history_father, (ViewGroup) null);
        eVar.f6649c = qsp.a(viewInflate, R.id.performance_history_father_bg);
        eVar.f6648b = (HealthTextView) qsp.a(viewInflate, R.id.performance_history_father_date);
        eVar.f6647a = (HealthTextView) qsp.a(viewInflate, R.id.performance_history_father_statistics);
        eVar.d = (ImageView) qsp.a(viewInflate, R.id.performance_history_father_arrow);
        eVar.e = qsp.a(viewInflate, R.id.performance_history_father_line);
        viewInflate.setTag(eVar);
        return viewInflate;
    }

    private void a(e eVar, int i, boolean z) {
        ViewGroup.LayoutParams layoutParams = eVar.e.getLayoutParams();
        if (i == 0) {
            layoutParams.height = 0;
        } else {
            layoutParams.height = this.i.getDimensionPixelSize(R.dimen.cardMarginMiddle);
        }
        eVar.e.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = eVar.f6649c.getLayoutParams();
        if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            if (z) {
                eVar.f6649c.setBackground(ContextCompat.getDrawable(this.f6643c, R.drawable.blood_sugar_history_bg_round_top));
                eVar.d.setImageResource(R.drawable.ic_health_list_drop_down_arrow_sel);
                layoutParams3.height = this.f6641a + this.e;
            } else {
                eVar.f6649c.setBackground(ContextCompat.getDrawable(this.f6643c, R.drawable.blood_sugar_history_bg_round));
                eVar.d.setImageResource(R.drawable.ic_health_list_drop_down_arrow_nor);
                int i2 = this.f6641a;
                int i3 = this.e;
                layoutParams3.height = i2 + i3 + i3;
            }
            eVar.f6649c.setLayoutParams(layoutParams3);
        }
    }

    private String a(HiHealthData hiHealthData) {
        String string;
        double d = hiHealthData.getDouble("Track_Calorie_Sum");
        double d2 = hiHealthData.getDouble("Track_Duration_Sum");
        double d3 = hiHealthData.getDouble("Track_Count_Sum");
        String quantityString = this.i.getQuantityString(R.plurals.IDS_details_sleep_latency_times, (int) d3, UnitUtil.e(d3, 1, 0));
        double d4 = d2 / 60000.0d;
        if (d4 > 60.0d) {
            string = this.i.getQuantityString(com.huawei.healthcloud.plugintrack.R.plurals.IDS_hour_string, (int) d4, UnitUtil.e(d4 / 60.0d, 1, 1));
        } else {
            string = this.i.getString(R.string.IDS_hw_show_set_target_sport_time_unit, UnitUtil.e(d4, 1, 2));
        }
        return this.i.getString(R.string.IDS_history_desc_three, string, quantityString, jpq.d(d / 1000.0d));
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = b();
        }
        Object tag = view.getTag();
        if (tag instanceof a) {
            a aVar = (a) tag;
            d(aVar, z);
            HiHealthData child = getChild(i, i2);
            if (child != null) {
                aVar.f6644a.setText(DateUtils.formatDateTime(this.f6643c, child.getStartTime(), 145));
                this.g.a(nlt.d(child));
                c(aVar, this.g.e());
            }
        }
        return view;
    }

    private void c(a aVar, Pair<float[], float[]> pair) {
        if (pair == null) {
            LogUtil.a("RopePerformanceHistoryAdapter", "performanceScore is null");
            return;
        }
        float[] fArr = pair.first;
        float[] fArr2 = pair.second;
        if (fArr == null || fArr2 == null) {
            LogUtil.a("RopePerformanceHistoryAdapter", "scores or ranks is null");
            return;
        }
        int iB = jql.b(fArr2);
        if (iB == -1) {
            LogUtil.a("RopePerformanceHistoryAdapter", "invalid value");
            return;
        }
        if (iB == 1) {
            aVar.d.setText(UnitUtil.e(fArr[iB], 1, 2));
        } else {
            aVar.d.setText(UnitUtil.e(fArr[iB], 1, 0));
        }
        Pair<Integer, String> pairC = jql.c(iB);
        aVar.h.setText(pairC.second);
        float f = fArr2[iB];
        if (f <= 0.0f || pairC.first == null || pairC.first.intValue() <= 0) {
            return;
        }
        aVar.f6646c.setText(this.i.getString(pairC.first.intValue(), UnitUtil.e(f, 2, 1)));
    }

    private View b() {
        a aVar = new a();
        View viewInflate = LayoutInflater.from(this.f6643c).inflate(R.layout.item_rope_performance_history_child, (ViewGroup) null);
        aVar.f6645b = qsp.a(viewInflate, R.id.performance_history_child_bg);
        aVar.f6644a = (HealthTextView) qsp.a(viewInflate, R.id.performance_history_child_time);
        aVar.d = (HealthTextView) qsp.a(viewInflate, R.id.performance_history_child_count);
        aVar.h = (HealthTextView) qsp.a(viewInflate, R.id.performance_history_child_data_unit);
        aVar.f6646c = (HealthTextView) qsp.a(viewInflate, R.id.performance_history_child_best_rank);
        aVar.e = (HealthDivider) qsp.a(viewInflate, R.id.performance_history_child_middle_line);
        viewInflate.setTag(aVar);
        return viewInflate;
    }

    private void d(a aVar, boolean z) {
        ViewGroup.LayoutParams layoutParams = aVar.f6645b.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if (z) {
                aVar.e.setVisibility(8);
                aVar.f6645b.setBackground(ContextCompat.getDrawable(this.f6643c, R.drawable.blood_sugar_history_bg_round_bottom));
                layoutParams2.height = this.d + this.e;
            } else {
                aVar.e.setVisibility(0);
                aVar.f6645b.setBackgroundColor(ContextCompat.getColor(this.f6643c, R.color.colorCardPanelBg));
                layoutParams2.height = this.d;
            }
            aVar.f6645b.setLayoutParams(layoutParams2);
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f6647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f6648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View f6649c;
        ImageView d;
        View e;

        private e() {
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f6644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f6645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f6646c;
        HealthTextView d;
        HealthDivider e;
        HealthTextView h;

        private a() {
        }
    }
}
