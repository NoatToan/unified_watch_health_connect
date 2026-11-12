package com.huawei.health.suggestion.customizecourse.manager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.uikit.hwsubheader.widget.HwSubHeader;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessEditListMoreAdapter extends HwSubHeader.SubHeaderRecyclerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8916a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8917c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 2;
    }

    @Override // com.huawei.uikit.hwsubheader.widget.HwSubHeader.SubHeaderRecyclerAdapter
    public int getItemType(int i) {
        return i == 0 ? 1 : 0;
    }

    public FitnessEditListMoreAdapter(String str, String str2) {
        this.f8917c = str;
        this.f8916a = str2;
    }

    public void e(String str) {
        this.f8916a = str;
        notifyDataSetChanged();
    }

    @Override // com.huawei.uikit.hwsubheader.widget.HwSubHeader.SubHeaderRecyclerAdapter
    public View getHeaderViewAsPos(int i, Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_dialog_edit_title, (ViewGroup) null, false);
        onBindViewHolder(new a(viewInflate), i);
        return viewInflate;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_dialog_edit_title, viewGroup, false));
        }
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_dialog_edit_list_more, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof a) {
            ((a) viewHolder).f8918b.setText(this.f8917c);
        } else if (viewHolder instanceof c) {
            ((c) viewHolder).f8919b.setText(this.f8916a);
        } else {
            LogUtil.j("Suggestion_FitnessEditListMoreAdapter", "onBindViewHolder, position = ", Integer.valueOf(i));
        }
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f8918b;

        private a(View view) {
            super(view);
            this.f8918b = (HealthTextView) view.findViewById(R.id.custom_dialog_edit_title);
        }
    }

    static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f8919b;

        private c(View view) {
            super(view);
            this.f8919b = (HealthTextView) view.findViewById(R.id.custom_courses_selected_value);
        }
    }
}
