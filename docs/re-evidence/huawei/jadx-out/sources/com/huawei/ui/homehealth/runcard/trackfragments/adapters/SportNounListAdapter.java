package com.huawei.ui.homehealth.runcard.trackfragments.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import defpackage.njy;
import defpackage.syx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SportNounListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f25965a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<syx> f25966c;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public SportNounListAdapter(Context context, List<syx> list) {
        this.f25966c = new ArrayList(10);
        this.f25965a = context;
        if (list != null) {
            this.f25966c = list;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<syx> list = this.f25966c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        List<syx> list = this.f25966c;
        if (list == null || njy.e(list, i)) {
            return null;
        }
        return this.f25966c.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        d dVar;
        if (view == null) {
            d dVar2 = new d();
            View viewInflate = LayoutInflater.from(this.f25965a).inflate(R.layout.layout_sport_noun_item, (ViewGroup) null);
            dVar2.f25967a = (HealthTextView) viewInflate.findViewById(R.id.hw_show_sport_noun_text_title);
            dVar2.d = (HealthTextView) viewInflate.findViewById(R.id.hw_show_sport_noun_text_content);
            viewInflate.setTag(dVar2);
            dVar = dVar2;
            view = viewInflate;
        } else {
            Object tag = view.getTag();
            if (!(tag instanceof d)) {
                LogUtil.a("SportNounExpandableListAdapter", "getView object is not instanceof ItemViewHolder");
                return view;
            }
            dVar = (d) tag;
        }
        List<syx> list = this.f25966c;
        if (list == null || njy.e(list, i)) {
            LogUtil.a("SportNounExpandableListAdapter", "position is out of bounds or mList is null");
            return view;
        }
        syx syxVar = this.f25966c.get(i);
        if (syxVar == null) {
            LogUtil.j("SportNounExpandableListAdapter", "child is null'");
            return view;
        }
        c(dVar, syxVar);
        return view;
    }

    private void c(d dVar, syx syxVar) {
        if (dVar == null || syxVar == null) {
            LogUtil.j("SportNounExpandableListAdapter", "viewholder or data is null");
        } else {
            dVar.f25967a.setText(syxVar.c());
            dVar.d.setText(syxVar.b().replace("\\n", "\n"));
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f25967a;
        private HealthTextView d;
    }
}
