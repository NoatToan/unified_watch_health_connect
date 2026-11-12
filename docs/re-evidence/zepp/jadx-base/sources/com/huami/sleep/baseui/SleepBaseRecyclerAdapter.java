package com.huami.sleep.baseui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class SleepBaseRecyclerAdapter<T> extends RecyclerView.Adapter<SleepViewHolder> {
    public List<T> a = new ArrayList();
    private int b;

    public class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(final int val$position, final Object val$item) {
            this.a = val$position;
            this.b = val$item;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            SleepBaseRecyclerAdapter.this.onItemClicked(v, this.a, this.b);
        }
    }

    public SleepBaseRecyclerAdapter(@LayoutRes int layoutRes) {
        this.b = layoutRes;
    }

    public void add(T data) {
        this.a.add(data);
        notifyItemInserted(this.a.size());
    }

    public void clear() {
        this.a.clear();
        notifyDataSetChanged();
    }

    public T getItem(int position) {
        return this.a.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.a.size();
    }

    public abstract void onBindViewHolder(SleepViewHolder holder, T item, int position);

    public void onItemClicked(View itemView, int position, T item) {
    }

    public void update(List<T> data) {
        this.a.clear();
        this.a.addAll(data);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SleepViewHolder holder, final int position) {
        T t = this.a.get(position);
        onBindViewHolder(holder, this.a.get(position), position);
        holder.setOnClickedListener(new a(position, t));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SleepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SleepViewHolder(LayoutInflater.from(parent.getContext()).inflate(this.b, parent, false));
    }
}
