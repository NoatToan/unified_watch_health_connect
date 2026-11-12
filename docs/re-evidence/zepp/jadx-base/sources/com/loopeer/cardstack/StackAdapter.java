package com.loopeer.cardstack;

import android.content.Context;
import android.view.LayoutInflater;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public abstract class StackAdapter<T> extends CardStackView.Adapter<CardStackView.ViewHolder> {
    private final Context b;
    private final LayoutInflater c;
    private List<T> d = new ArrayList();

    public StackAdapter(Context context) {
        this.b = context;
        this.c = LayoutInflater.from(context);
    }

    public abstract void bindView(T t, int i, CardStackView.ViewHolder viewHolder);

    public Context getContext() {
        return this.b;
    }

    public T getItem(int i) {
        return this.d.get(i);
    }

    @Override // com.loopeer.cardstack.CardStackView.Adapter
    public int getItemCount() {
        return this.d.size();
    }

    public LayoutInflater getLayoutInflater() {
        return this.c;
    }

    @Override // com.loopeer.cardstack.CardStackView.Adapter
    public void onBindViewHolder(CardStackView.ViewHolder viewHolder, int i) {
        bindView(getItem(i), i, viewHolder);
    }

    public void setData(List<T> list) {
        this.d.clear();
        if (list != null) {
            this.d.addAll(list);
        }
    }

    public void updateData(List<T> list) {
        setData(list);
        notifyDataSetChanged();
    }
}
