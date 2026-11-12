package com.huami.calendarview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
abstract class a<T> extends RecyclerView.Adapter {
    public LayoutInflater a;
    private c c;
    public Context e;
    private List<T> b = new ArrayList();
    private b d = new C0337a();

    /* JADX INFO: renamed from: com.huami.calendarview.a$a, reason: collision with other inner class name */
    public class C0337a extends b {
        public C0337a() {
        }

        @Override // com.huami.calendarview.a.b
        public void a(int i, long j) {
            if (a.this.c != null) {
                a.this.c.a(i, j);
            }
        }
    }

    public static abstract class b implements View.OnClickListener {
        public abstract void a(int i, long j);

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) view.getTag();
            a(viewHolder.getAdapterPosition(), viewHolder.getItemId());
        }
    }

    public interface c {
        void a(int i, long j);
    }

    public a(Context context) {
        this.e = context;
        this.a = LayoutInflater.from(context);
    }

    public void addAll(List<T> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.b.addAll(list);
        notifyItemRangeInserted(this.b.size(), list.size());
    }

    public final void b(T t) {
        if (t != null) {
            this.b.add(t);
            notifyItemChanged(this.b.size());
        }
    }

    public abstract void c(RecyclerView.ViewHolder viewHolder, T t, int i);

    public abstract RecyclerView.ViewHolder d(ViewGroup viewGroup, int i);

    public void e(c cVar) {
        this.c = cVar;
    }

    public final T getItem(int i) {
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return this.b.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.b.size();
    }

    public final List<T> getItems() {
        return this.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        c(viewHolder, this.b.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderD = d(viewGroup, i);
        if (viewHolderD != null) {
            viewHolderD.itemView.setTag(viewHolderD);
            viewHolderD.itemView.setOnClickListener(this.d);
        }
        return viewHolderD;
    }
}
