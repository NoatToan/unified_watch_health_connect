package com.huawei.health.suggestion.ui.run.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.run.holder.RadioViewHolder;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.iat;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ChoiceDataAdapter extends RecyclerView.Adapter<RadioViewHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<iat> f9940b;
    private RadioViewHolder.OnItemClickListener d;
    private LayoutInflater e;

    public ChoiceDataAdapter(Context context, List<iat> list) {
        this.f9940b = list;
        this.e = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RadioViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RadioViewHolder(this.e.inflate(R.layout.item_single_choice, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(RadioViewHolder radioViewHolder, int i) {
        if (njy.e(this.f9940b)) {
            LogUtil.j("Suggestion__ChoiceDataAdapter", "onBindViewHolder holder mData null");
            return;
        }
        boolean z = i != this.f9940b.size() - 1;
        iat iatVar = this.f9940b.get(i);
        radioViewHolder.c(iatVar.d().getName(), iatVar.b(), z);
        radioViewHolder.c(this.d, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<iat> list = this.f9940b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void d(RadioViewHolder.OnItemClickListener onItemClickListener) {
        this.d = onItemClickListener;
    }
}
