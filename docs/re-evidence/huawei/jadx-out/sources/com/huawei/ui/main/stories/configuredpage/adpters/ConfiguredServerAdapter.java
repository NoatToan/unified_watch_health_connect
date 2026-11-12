package com.huawei.ui.main.stories.configuredpage.adpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.configuredpage.views.ConfiguredServerContentHolder;
import defpackage.dlm;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ConfiguredServerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<dlm> f26384a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f26385c;

    public ConfiguredServerAdapter(Context context, List<dlm> list) {
        this.f26385c = context;
        this.f26384a = list;
    }

    public void d(List<dlm> list) {
        this.f26384a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ConfiguredServerContentHolder(LayoutInflater.from(this.f26385c).inflate(R.layout.hw_configure_server_detail_item, (ViewGroup) null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder == null) {
            LogUtil.j("ConfiguredServerAdapter", "onBindViewHolder holder is null.");
            return;
        }
        if (i < 0 || i >= this.f26384a.size()) {
            return;
        }
        viewHolder.setIsRecyclable(false);
        dlm dlmVar = this.f26384a.get(i);
        if (dlmVar != null) {
            if (!(viewHolder instanceof ConfiguredServerContentHolder)) {
                LogUtil.j("ConfiguredServerAdapter", "onBindViewHolder holder is not matching");
            } else {
                ((ConfiguredServerContentHolder) viewHolder).b(this.f26384a, dlmVar, i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f26384a.size();
    }
}
