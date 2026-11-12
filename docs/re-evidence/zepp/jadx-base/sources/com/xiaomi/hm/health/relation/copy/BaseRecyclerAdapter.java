package com.xiaomi.hm.health.relation.copy;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.hm.health.relation.view.MyViewHolder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BaseRecyclerAdapter<T> extends RecyclerView.Adapter<MyViewHolder> {
    public List<T> a = new ArrayList();
    private final int b;

    public BaseRecyclerAdapter(@LayoutRes int i) {
        this.b = i;
    }

    public void add(T t) {
        this.a.add(t);
        notifyItemInserted(this.a.size());
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void clear() {
        this.a.clear();
        notifyDataSetChanged();
    }

    public T getItem(int i) {
        return this.a.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.a.size();
    }

    public abstract void onBindViewHolder(MyViewHolder myViewHolder, T t, int i);

    /* JADX INFO: renamed from: onItemClicked, reason: merged with bridge method [inline-methods] */
    public void b(View view, int i, T t) {
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void update(List<T> list) {
        this.a.clear();
        this.a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {
        final T t = this.a.get(i);
        onBindViewHolder(myViewHolder, this.a.get(i), i);
        myViewHolder.setOnClickedListener(new View.OnClickListener() { // from class: hr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b(i, t, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(this.b, viewGroup, false));
    }
}
