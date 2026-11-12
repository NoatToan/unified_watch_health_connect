package com.xiaomi.hm.health.calendar.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public abstract class CommonRecycleAdapter<T> extends RecyclerView.Adapter<CommonViewHolder> {
    private int a;
    private List<T> b;
    private int c;

    public class a implements View.OnClickListener {
        public final /* synthetic */ CommonViewHolder a;

        public a(CommonViewHolder commonViewHolder) {
            this.a = commonViewHolder;
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
        public void onClick(View view) {
            CommonRecycleAdapter commonRecycleAdapter = CommonRecycleAdapter.this;
            commonRecycleAdapter.onItemClick(commonRecycleAdapter.getItem(this.a.getLayoutPosition()), this.a.getLayoutPosition());
        }
    }

    public CommonRecycleAdapter(@LayoutRes int i, @IdRes int i2, List<T> list) {
        this.a = i;
        this.b = list;
        this.c = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public T getItem(int i) {
        List<T> list = this.b;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    public void addData(T t, int i) {
        this.b.add(i, t);
        notifyItemInserted(i);
    }

    public abstract void bindViewHolder(CommonViewHolder commonViewHolder, T t);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<T> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public abstract void onItemClick(T t, int i);

    public void removeData(int i) {
        this.b.remove(i);
        notifyItemRemoved(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(CommonViewHolder commonViewHolder, int i) {
        bindViewHolder(commonViewHolder, getItem(i));
        View view = commonViewHolder.getView(this.c);
        if (view != null) {
            view.setOnClickListener(new a(commonViewHolder));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public CommonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log.d("CommonRecycleAdapter", "onCreateViewHolder");
        return new CommonViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(this.a, viewGroup, false));
    }

    public CommonRecycleAdapter(@LayoutRes int i, @IdRes int i2, T[] tArr) {
        this.a = i;
        this.b = Arrays.asList(tArr);
        this.c = i2;
    }
}
