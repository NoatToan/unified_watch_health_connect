package com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.view.NoScrollListView;
import defpackage.ufm;
import defpackage.ugb;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class OptionsListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<ufm> f26971a;
    private Context d;
    private ListView e;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return true;
    }

    public OptionsListAdapter(Context context, List<ufm> list, ListView listView) {
        this.d = context;
        this.f26971a = list;
        this.e = listView;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<ufm> list = this.f26971a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.d).inflate(R.layout.prassure_calibrate_question_item_option, (ViewGroup) null);
            aVar = new a();
            aVar.e = (HealthRadioButton) view.findViewById(R.id.hw_pressure_calibrate_check_name);
            aVar.f26972a = (HealthTextView) view.findViewById(R.id.hw_pressure_calibrate_check_tv_name);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        c(i, aVar.e);
        if (((!(viewGroup instanceof NoScrollListView) && !(viewGroup instanceof ListView)) || !ugb.b().i()) && i >= 0 && i < this.f26971a.size()) {
            aVar.f26972a.setText(this.f26971a.get(i).c());
        }
        return view;
    }

    private void c(int i, HealthRadioButton healthRadioButton) {
        if (this.e.isItemChecked(i)) {
            healthRadioButton.setChecked(true);
        } else {
            healthRadioButton.setChecked(false);
        }
        notifyDataSetChanged();
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f26972a;
        private HealthRadioButton e;

        private a() {
        }
    }
}
