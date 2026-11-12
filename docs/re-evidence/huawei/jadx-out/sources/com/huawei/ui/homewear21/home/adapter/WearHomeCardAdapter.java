package com.huawei.ui.homewear21.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homewear21.home.card.WearHomeBaseCard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeCardAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<WearHomeBaseCard> f26267a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Integer, WearHomeBaseCard> f26268c = new HashMap();
    private Context d;
    private LayoutInflater e;

    public WearHomeCardAdapter(Context context, ArrayList<WearHomeBaseCard> arrayList) {
        this.d = context;
        this.f26267a = arrayList;
        this.e = LayoutInflater.from(context);
    }

    public void e(ArrayList<WearHomeBaseCard> arrayList) {
        this.f26267a = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        WearHomeBaseCard wearHomeBaseCard = this.f26268c.get(Integer.valueOf(i));
        if (wearHomeBaseCard == null) {
            return new c(new View(this.d));
        }
        return wearHomeBaseCard.getCardViewHolder(viewGroup, this.e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LogUtil.a("WearHomeCardAdapter", "onBindViewHolder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        WearHomeBaseCard wearHomeBaseCard;
        if (i >= this.f26267a.size() || (wearHomeBaseCard = this.f26267a.get(i)) == null) {
            return 0;
        }
        int iHashCode = wearHomeBaseCard.hashCode();
        this.f26268c.put(Integer.valueOf(iHashCode), wearHomeBaseCard);
        return iHashCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f26267a.size();
    }

    static class c extends RecyclerView.ViewHolder {
        public c(View view) {
            super(view);
        }
    }
}
