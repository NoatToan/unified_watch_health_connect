package com.xiaomi.fitness.common.recycer.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import defpackage.eri;
import defpackage.jui;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class CommonRecordDetailAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<DetailItem> f11812a;

    public static class a extends RecyclerView.d0 {
        public a(@NotNull View view) {
            super(view);
        }
    }

    public static class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f11813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f11814b;

        public b(View view) {
            super(view);
            this.f11813a = (TextView) view.findViewById(eri.Cl);
            this.f11814b = (TextView) view.findViewById(eri.nm);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (ArrayUtils.isEmpty(this.f11812a)) {
            return 0;
        }
        return this.f11812a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f11812a.get(i).type;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        if (d0Var instanceof b) {
            DetailItem detailItem = this.f11812a.get(i);
            b bVar = (b) d0Var;
            bVar.f11813a.setText(detailItem.leftStr);
            bVar.f11814b.setText(detailItem.rightStr);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 1 ? new a(LayoutInflater.from(viewGroup.getContext()).inflate(jui.k6, viewGroup, false)) : new b(LayoutInflater.from(viewGroup.getContext()).inflate(jui.j6, viewGroup, false));
    }

    public void setDetailItems(List<DetailItem> list) {
        this.f11812a = list;
        notifyDataSetChanged();
    }

    public static class DetailItem implements Serializable {
        public static final int TYPE_DATA = 0;
        public static final int TYPE_DIVIDER = 1;
        private String leftStr;
        private String rightStr;
        private int type;

        public DetailItem(String str, String str2) {
            this.leftStr = str;
            this.rightStr = str2;
        }

        public String getLeftStr() {
            return this.leftStr;
        }

        public String getRightStr() {
            return this.rightStr;
        }

        public int getType() {
            return this.type;
        }

        public DetailItem(int i) {
            this.type = i;
        }
    }
}
