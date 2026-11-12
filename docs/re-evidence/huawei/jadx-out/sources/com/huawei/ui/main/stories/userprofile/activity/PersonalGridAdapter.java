package com.huawei.ui.main.stories.userprofile.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.userprofile.card.PersonalGridCardViewHolder;
import defpackage.njy;
import defpackage.wrc;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class PersonalGridAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<wrc> d;
    private LayoutInflater e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public PersonalGridAdapter(Context context, List<wrc> list) {
        this.e = LayoutInflater.from(context);
        c(list);
    }

    public void c(List<wrc> list) {
        if (list == null) {
            return;
        }
        if (njy.b(this.d)) {
            this.d.clear();
        }
        this.d = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.d.get(i).getCardViewHolder(viewGroup, this.e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if ((i < this.d.size() ? this.d.get(i) : null) == null || viewHolder == null) {
            LogUtil.j("PersonalGridAdapter", "onBindViewHolder model or holder is null");
        } else if (viewHolder instanceof PersonalGridCardViewHolder) {
            ((PersonalGridCardViewHolder) viewHolder).e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.d)) {
            return 0;
        }
        return this.d.size();
    }
}
