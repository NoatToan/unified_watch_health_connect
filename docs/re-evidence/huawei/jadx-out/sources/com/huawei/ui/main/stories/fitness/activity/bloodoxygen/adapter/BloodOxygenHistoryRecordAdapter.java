package com.huawei.ui.main.stories.fitness.activity.bloodoxygen.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.qrk;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class BloodOxygenHistoryRecordAdapter extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f26593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<List<HiHealthData>> f26594c;
    private Context d;

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i, int i2) {
        return false;
    }

    public BloodOxygenHistoryRecordAdapter(Context context, List<String> list, List<List<HiHealthData>> list2) {
        if (context == null) {
            LogUtil.j("BloodOxygenHistoryRecordAdapter", "context is null");
            return;
        }
        this.d = context;
        if (list == null) {
            this.f26593b = new ArrayList();
            this.f26594c = new ArrayList();
            return;
        }
        this.f26593b = list;
        if (list2 == null) {
            this.f26594c = new ArrayList();
        } else {
            this.f26594c = list2;
        }
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.f26593b.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        if (njy.e(this.f26593b, i) || njy.e(this.f26594c, i)) {
            LogUtil.j("BloodOxygenHistoryRecordAdapter", "getChildrenCount is out of bounds");
            return 0;
        }
        return this.f26594c.get(i).size();
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getGroup(int i) {
        if (njy.e(this.f26593b, i)) {
            LogUtil.j("BloodOxygenHistoryRecordAdapter", "getGroup is out of bounds");
            return null;
        }
        return this.f26593b.get(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getChild(int i, int i2) {
        if (njy.e(this.f26593b, i) || njy.e(this.f26594c, i) || njy.e(this.f26594c.get(i), i2)) {
            LogUtil.j("BloodOxygenHistoryRecordAdapter", "getChild is out of bounds");
            return null;
        }
        return this.f26594c.get(i).get(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        c cVar;
        if (view == null) {
            view = LayoutInflater.from(this.d).inflate(R.layout.activity_blood_oxygen_history_data_group, viewGroup, false);
            cVar = new c();
            cVar.f26598a = (RelativeLayout) view.findViewById(R.id.blood_oxygen_history_data_group_data);
            cVar.f26600c = (HealthTextView) view.findViewById(R.id.blood_oxygen_history_data_group_date_textview);
            cVar.e = (ImageView) view.findViewById(R.id.blood_oxygen_history_data_group_img_arrow);
            cVar.d = view.findViewById(R.id.blood_oxygen_history_data_group_divider);
            cVar.f26599b = (HealthDivider) view.findViewById(R.id.blood_oxygen_history_data_group_under_divider);
            view.setTag(cVar);
        } else {
            cVar = (c) view.getTag();
        }
        if (njy.e(this.f26593b, i)) {
            LogUtil.j("BloodOxygenHistoryRecordAdapter", "getGroupView is out of bounds");
            return view;
        }
        cVar.f26600c.setText(this.f26593b.get(i));
        if (z) {
            cVar.f26599b.setVisibility(0);
            cVar.f26598a.setBackgroundResource(R.drawable.activity_expandablelistview_round_top);
        } else {
            cVar.f26599b.setVisibility(8);
            cVar.f26598a.setBackgroundResource(R.drawable.activity_expandablelistview_round_shape);
        }
        cVar.f26598a.setPadding(qrs.d(this.d, 12.0f), qrs.d(this.d, 4.0f), qrs.d(this.d, 12.0f), 0);
        cVar.d.setVisibility(i == 0 ? 8 : 0);
        cVar.e.setImageResource(z ? R.drawable.ic_health_list_drop_down_arrow_nor : R.drawable.ic_health_list_drop_down_arrow_sel);
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = LayoutInflater.from(this.d).inflate(R.layout.activity_blood_oxygen_history_data_item, viewGroup, false);
            bVar = new b();
            bVar.f26597c = (RelativeLayout) view.findViewById(R.id.blood_oxygen_history_data_item_detail);
            bVar.f26596b = (HealthTextView) view.findViewById(R.id.blood_oxygen_history_data_item_percent);
            bVar.e = (HealthTextView) view.findViewById(R.id.blood_oxygen_history_data_item_time);
            bVar.f26595a = (HealthDivider) view.findViewById(R.id.blood_oxygen_history_data_item_divider);
            bVar.d = (HealthTextView) view.findViewById(R.id.blood_oxygen_history_data_item_date);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        if (njy.e(this.f26593b, i) || njy.e(this.f26594c, i) || njy.e(this.f26594c.get(i), i2)) {
            LogUtil.j("BloodOxygenHistoryRecordAdapter", "getChildView is out of bounds");
            return view;
        }
        bVar.f26596b.setText(UnitUtil.e(CommonUtil.n(this.d, String.valueOf(this.f26594c.get(i).get(i2).getIntValue())), 2, 0));
        if (z) {
            bVar.f26597c.setBackgroundResource(R.drawable.activity_expandablelistview_round_bottom);
            bVar.f26597c.setPadding(qrs.d(this.d, 12.0f), 0, qrs.d(this.d, 12.0f), qrs.d(this.d, 4.0f));
        } else {
            bVar.f26597c.setBackgroundColor(this.d.getResources().getColor(R.color.health_dialog_bg_color));
        }
        bVar.f26595a.setVisibility(z ? 8 : 0);
        long endTime = this.f26594c.get(i).get(i2).getEndTime();
        bVar.d.setText(qrk.a(this.d, endTime, 131096));
        bVar.e.setText(qrk.a(this.d, endTime, 1));
        return view;
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        RelativeLayout f26598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthDivider f26599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f26600c;
        View d;
        ImageView e;

        c() {
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthDivider f26595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f26596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RelativeLayout f26597c;
        HealthTextView d;
        HealthTextView e;

        b() {
        }
    }
}
