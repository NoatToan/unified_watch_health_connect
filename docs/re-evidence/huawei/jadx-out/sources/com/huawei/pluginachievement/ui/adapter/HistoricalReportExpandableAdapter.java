package com.huawei.pluginachievement.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import com.huawei.pluginachievement.R;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import defpackage.out;
import defpackage.ozq;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class HistoricalReportExpandableAdapter extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<ozq> f22175c;
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
        return true;
    }

    public HistoricalReportExpandableAdapter(Context context, ArrayList<ozq> arrayList) {
        this.d = context;
        this.f22175c = arrayList;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        ArrayList<ozq> arrayList = this.f22175c;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        if (njy.e(this.f22175c, i)) {
            LogUtil.d("PLGACHIEVE_HistoricalReportExpandableAdapter", "getChildrenCount is out of bounds");
            return 0;
        }
        ozq ozqVar = this.f22175c.get(i);
        if (ozqVar == null) {
            LogUtil.d("PLGACHIEVE_HistoricalReportExpandableAdapter", "getChildrenCount reportDataBean is null.");
            return 0;
        }
        ArrayList<ozq.a> arrayListE = ozqVar.e();
        if (njy.e(arrayListE)) {
            LogUtil.d("PLGACHIEVE_HistoricalReportExpandableAdapter", "getChildrenCount oneMonthOrWeekRecordList is empty.");
            return 0;
        }
        return arrayListE.size();
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ozq getGroup(int i) {
        if (njy.c(this.f22175c, i)) {
            return this.f22175c.get(i);
        }
        LogUtil.d("PLGACHIEVE_HistoricalReportExpandableAdapter", "getGroup is out of bounds");
        return new ozq();
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ozq.a getChild(int i, int i2) {
        if (njy.c(this.f22175c, i)) {
            ArrayList<ozq.a> arrayListE = this.f22175c.get(i).e();
            if (njy.c(arrayListE, i2)) {
                return arrayListE.get(i2);
            }
            LogUtil.d("PLGACHIEVE_HistoricalReportExpandableAdapter", "getChild recordArrayList is out of bounds");
            return new ozq.a();
        }
        LogUtil.d("PLGACHIEVE_HistoricalReportExpandableAdapter", "getChild mHistoryReportDataList is out of bounds");
        return new ozq.a();
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            aVar = new a();
            view = LayoutInflater.from(this.d).inflate(R.layout.achieve_historical_report_expandable_father_item, (ViewGroup) null);
            aVar.f22176a = (HealthTextView) out.b(view, R.id.father_item);
            view.setTag(aVar);
        } else {
            Object tag = view.getTag();
            if (tag instanceof a) {
                aVar = (a) tag;
            }
            return view;
        }
        if (njy.e(this.f22175c, i)) {
            LogUtil.d("PLGACHIEVE_HistoricalReportExpandableAdapter", "getGroupView mHistoryReportDataList is out of bounds");
            return view;
        }
        aVar.f22176a.setText(this.f22175c.get(i).a());
        aVar.f22176a.setBackgroundColor(0);
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        View viewInflate;
        c cVar;
        if (view == null) {
            cVar = new c();
            viewInflate = LayoutInflater.from(this.d).inflate(R.layout.achieve_historical_report_expandable_child_item, (ViewGroup) null);
            cVar.f22179c = (ImageView) out.b(viewInflate, R.id.child_item_bg);
            cVar.f22177a = (HealthTextView) out.b(viewInflate, R.id.child_item_date);
            cVar.e = (ImageView) out.b(viewInflate, R.id.child_item_arrow);
            cVar.f22178b = (HealthDivider) out.b(viewInflate, R.id.child_item_divider);
            viewInflate.setTag(cVar);
        } else {
            Object tag = view.getTag();
            if (!(tag instanceof c)) {
                return view;
            }
            c cVar2 = (c) tag;
            viewInflate = view;
            cVar = cVar2;
        }
        cVar.e.setBackgroundResource(LanguageUtil.ba(this.d) ? R.drawable.common_ui_arrow_left : R.drawable.common_ui_arrow_right);
        cVar.f22178b.setVisibility(z ? 8 : 0);
        if (njy.e(this.f22175c, i)) {
            return viewInflate;
        }
        ArrayList<ozq.a> arrayListE = this.f22175c.get(i).e();
        if (njy.e(arrayListE, i2)) {
            LogUtil.d("PLGACHIEVE_HistoricalReportExpandableAdapter", "getChildView childList is out of bounds");
            return viewInflate;
        }
        cVar.f22177a.setText(arrayListE.get(i2).a());
        e(i2, z, cVar, arrayListE);
        return viewInflate;
    }

    private void e(int i, boolean z, c cVar, ArrayList<ozq.a> arrayList) {
        Drawable drawable;
        if (njy.e(arrayList, i)) {
            LogUtil.d("PLGACHIEVE_HistoricalReportExpandableAdapter", "setChildViewBackground childList is out of bounds");
            return;
        }
        int size = arrayList.size();
        if (size == 1) {
            drawable = this.d.getResources().getDrawable(R.drawable.achieve_history_report_date_bg);
        } else if (size == 2) {
            if (z) {
                drawable = this.d.getResources().getDrawable(R.drawable.achieve_history_report_date_bottom_bg);
            } else {
                drawable = this.d.getResources().getDrawable(R.drawable.achieve_history_report_date_top_bg);
            }
        } else if (i == 0) {
            drawable = this.d.getResources().getDrawable(R.drawable.achieve_history_report_date_top_bg);
        } else if (i == size - 1) {
            drawable = this.d.getResources().getDrawable(R.drawable.achieve_history_report_date_bottom_bg);
        } else {
            drawable = this.d.getResources().getDrawable(R.color.colorCardPanelBg);
        }
        cVar.f22179c.setBackground(drawable);
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f22176a;

        private a() {
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f22177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthDivider f22178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f22179c;
        ImageView e;

        private c() {
        }
    }
}
