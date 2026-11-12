package com.huawei.health.knit.section.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.fcn;
import defpackage.fos;
import defpackage.njy;
import defpackage.qqf;
import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes29.dex */
public class SectionExpandableAdapter extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f7349c;
    private int d;
    private List<List<fos>> e;

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
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i, int i2) {
        return false;
    }

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthImageView f7351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthImageView f7352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthImageView f7353c;
        HealthImageView d;
        HealthTextView e;
        HealthTextView h;

        private a() {
        }
    }

    class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthImageView f7355b;
        HealthTextView d;
        HealthTextView e;

        private d() {
        }
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fos getChild(int i, int i2) {
        return this.e.get(i).get(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        LogUtil.a("SectionExpandableAdapter", "getChildView now is ", getChild(i, i2).toString());
        if (view == null) {
            view = this.f7349c.inflate(R.layout.section_expandable_item_layout, (ViewGroup) null);
        }
        final d dVar = new d();
        dVar.f7355b = (HealthImageView) view.findViewById(R.id.item_expand_icon);
        qqf.b(getChild(i, i2).e(), dVar.f7355b, (int) BaseApplication.getContext().getResources().getDimension(R.dimen.defaultCornerRadiusXS));
        dVar.e = (HealthTextView) view.findViewById(R.id.item_expand_name);
        dVar.e.setText(getChild(i, i2).c());
        dVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.SectionExpandableAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                fcn.c(dVar.e.getText().toString());
            }
        });
        dVar.d = (HealthTextView) view.findViewById(R.id.item_expand_detail);
        dVar.d.setText(getChild(i, i2).b());
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        if (njy.c(this.e, i)) {
            LogUtil.a("SectionExpandableAdapter", "mData.get(groupPosition).size() is ", Integer.valueOf(this.e.get(i).size()));
        } else {
            LogUtil.a("SectionExpandableAdapter", "mData.get(groupPosition).size() is null");
        }
        return this.e.get(i).size();
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<fos> getGroup(int i) {
        return this.e.get(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        LogUtil.a("SectionExpandableAdapter", "mData.size() is ", Integer.valueOf(this.e.size()));
        return this.e.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        LogUtil.a("SectionExpandableAdapter", "getGroupView groupPosition is", Integer.valueOf(i));
        if (view == null) {
            view = this.f7349c.inflate(R.layout.section_expandable_goup_layout, (ViewGroup) null);
        }
        a aVar = new a();
        aVar.h = (HealthTextView) view.findViewById(R.id.item_expand_group_name);
        aVar.h.setText(this.f7347a);
        aVar.e = (HealthTextView) view.findViewById(R.id.item_expand_group_count);
        StringBuffer stringBuffer = new StringBuffer(Marker.ANY_NON_NULL_MARKER);
        if (this.e.get(i).size() > 3) {
            stringBuffer.append(this.e.get(i).size() - 3);
            aVar.e.setText(stringBuffer.toString());
        } else {
            aVar.e.setVisibility(8);
        }
        aVar.f7351a = (HealthImageView) view.findViewById(R.id.item_expand_group_icon_1);
        aVar.f7353c = (HealthImageView) view.findViewById(R.id.item_expand_group_icon_2);
        aVar.f7352b = (HealthImageView) view.findViewById(R.id.item_expand_group_icon_3);
        if (this.e.get(i).size() >= 1) {
            aVar.f7352b.setVisibility(0);
            qqf.b(getChild(i, 0).e(), aVar.f7352b, 0);
        }
        if (this.e.get(i).size() >= 2) {
            aVar.f7353c.setVisibility(0);
            qqf.b(getChild(i, 1).e(), aVar.f7353c, 0);
        }
        if (this.e.get(i).size() >= 3) {
            aVar.f7351a.setVisibility(0);
            qqf.b(getChild(i, 2).e(), aVar.f7351a, 0);
        }
        aVar.d = (HealthImageView) view.findViewById(R.id.item_expand_group_arrow);
        if (z) {
            aVar.d.setBackgroundResource(this.d);
            aVar.f7351a.setVisibility(8);
            aVar.f7353c.setVisibility(8);
            aVar.f7352b.setVisibility(8);
            aVar.e.setVisibility(8);
            return view;
        }
        aVar.d.setBackgroundResource(this.f7348b);
        aVar.f7351a.setVisibility(0);
        aVar.f7353c.setVisibility(0);
        aVar.f7352b.setVisibility(0);
        aVar.e.setVisibility(0);
        return view;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.ExpandableListAdapter
    public void onGroupExpanded(int i) {
        super.onGroupExpanded(i);
        fcn.d();
    }
}
