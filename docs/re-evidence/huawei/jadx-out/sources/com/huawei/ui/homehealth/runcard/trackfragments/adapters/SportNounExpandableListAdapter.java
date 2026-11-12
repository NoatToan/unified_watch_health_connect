package com.huawei.ui.homehealth.runcard.trackfragments.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import defpackage.njy;
import defpackage.syx;
import defpackage.sza;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SportNounExpandableListAdapter extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<sza> f25962a;
    private Context e;

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

    public SportNounExpandableListAdapter(Context context) {
        this.e = context == null ? BaseApplication.getContext() : context;
    }

    public void c(List<sza> list) {
        LogUtil.a("SportNounExpandableListAdapter", "resetGroupData mGroupData");
        List<sza> list2 = this.f25962a;
        if (list2 != null) {
            list2.clear();
        }
        this.f25962a = list;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        List<sza> list = this.f25962a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        if (njy.e(this.f25962a, i)) {
            return 0;
        }
        return this.f25962a.get(i).d();
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getGroup(int i) {
        if (njy.e(this.f25962a, i)) {
            return null;
        }
        return this.f25962a.get(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getChild(int i, int i2) {
        if (njy.e(this.f25962a, i)) {
            return null;
        }
        return this.f25962a.get(i).e(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            a aVar2 = new a();
            View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.layout_sport_noun_father_item, (ViewGroup) null);
            aVar2.f25963a = (HealthTextView) viewInflate.findViewById(R.id.hw_show_health_data_sport_noun_father_date);
            aVar2.d = (ImageView) viewInflate.findViewById(R.id.hw_show_health_data_sport_noun_father_arrow);
            aVar2.e = (HealthDivider) viewInflate.findViewById(R.id.hw_show_health_data_sport_noun_father_line);
            viewInflate.setTag(aVar2);
            aVar = aVar2;
            view = viewInflate;
        } else {
            Object tag = view.getTag();
            if (!(tag instanceof a)) {
                LogUtil.a("SportNounExpandableListAdapter", "getGroupView object is not instanceof FatherViewHolder");
                return view;
            }
            aVar = (a) tag;
        }
        if (njy.e(this.f25962a, i)) {
            LogUtil.j("SportNounExpandableListAdapter", "groupPosition is out of bounds");
            return view;
        }
        if (z) {
            aVar.d.setBackgroundResource(R.drawable.ic_health_list_drop_down_arrow_sel);
        } else {
            aVar.d.setBackgroundResource(R.drawable.ic_health_list_drop_down_arrow_nor);
        }
        if (this.f25962a.get(i).c() != null) {
            aVar.f25963a.setText(this.f25962a.get(i).c());
        }
        if (i == getGroupCount() - 1) {
            aVar.e.setVisibility(8);
            return view;
        }
        aVar.e.setVisibility(0);
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            bVar = new b();
            view = LayoutInflater.from(this.e).inflate(R.layout.layout_sport_noun_child_item, (ViewGroup) null);
            bVar.e = (HealthTextView) view.findViewById(R.id.hw_show_sport_noun_child_text_title);
            bVar.f25964c = (HealthTextView) view.findViewById(R.id.hw_show_sport_noun_child_text_content);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        if (njy.e(this.f25962a, i)) {
            LogUtil.a("SportNounExpandableListAdapter", "groupPosition is out of bounds");
            return view;
        }
        syx syxVarE = this.f25962a.get(i).e(i2);
        if (syxVarE == null) {
            LogUtil.j("SportNounExpandableListAdapter", "child is null'");
            return view;
        }
        a(bVar, syxVarE);
        return view;
    }

    private void a(b bVar, syx syxVar) {
        if (bVar == null || syxVar == null) {
            LogUtil.j("SportNounExpandableListAdapter", "viewholder or data is null");
        } else {
            bVar.e.setText(syxVar.c());
            bVar.f25964c.setText(syxVar.b().replace("\\n", "\n"));
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f25963a;
        private ImageView d;
        private HealthDivider e;
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f25964c;
        private HealthTextView e;
    }
}
