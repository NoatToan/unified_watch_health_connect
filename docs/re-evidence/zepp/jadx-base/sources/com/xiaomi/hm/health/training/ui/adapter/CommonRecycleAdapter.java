package com.xiaomi.hm.health.training.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes21.dex */
public abstract class CommonRecycleAdapter<T> extends RecyclerView.Adapter<CommonViewHolder> {
    private int a;
    private CopyOnWriteArrayList<T> b;
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
        if (list != null) {
            this.b = new CopyOnWriteArrayList<>(list);
        }
        this.c = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public T getItem(int i) {
        CopyOnWriteArrayList<T> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList != null) {
            return copyOnWriteArrayList.get(i);
        }
        return null;
    }

    public void addData(List<T> list) {
        CopyOnWriteArrayList<T> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            insertList(this.b, list, getAdapterItemCount());
        } else {
            this.b = new CopyOnWriteArrayList<>(list);
            notifyDataSetChanged();
        }
    }

    public abstract void bindViewHolder(CommonViewHolder commonViewHolder, T t);

    public void clearAllData() {
        this.b.clear();
        notifyDataSetChanged();
    }

    public int getAdapterItemCount() {
        CopyOnWriteArrayList<T> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList != null) {
            return copyOnWriteArrayList.size();
        }
        return 0;
    }

    public List<T> getData() {
        return this.b;
    }

    public T getItemAt(int i) {
        CopyOnWriteArrayList<T> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList != null) {
            return copyOnWriteArrayList.get(i);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getAdapterItemCount();
    }

    public <T> void insert(List<T> list, T t, int i) {
        list.add(i, t);
        notifyItemInserted(i);
    }

    public <T> void insertList(List<T> list, List<T> list2, int i) {
        list.addAll(i, list2);
        notifyItemRangeInserted(i, list2.size());
    }

    public abstract void onItemClick(T t, int i);

    public void remove(List<?> list, int i) {
        if (list.size() > 0) {
            list.remove(i);
            notifyItemRemoved(i);
        }
    }

    public void removeData(int i) {
        CopyOnWriteArrayList<T> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList != null) {
            remove(copyOnWriteArrayList, i);
        }
    }

    public void setData(List<T> list) {
        this.b.clear();
        this.b.addAll(list);
        notifyDataSetChanged();
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
        return new CommonViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(this.a, viewGroup, false), true);
    }

    public T getItem(T t) {
        int iIndexOf;
        CopyOnWriteArrayList<T> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList == null || (iIndexOf = copyOnWriteArrayList.indexOf(t)) < 0) {
            return null;
        }
        return this.b.get(iIndexOf);
    }

    public void removeData(T t) {
        int iIndexOf;
        CopyOnWriteArrayList<T> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList == null || (iIndexOf = copyOnWriteArrayList.indexOf(t)) < 0) {
            return;
        }
        remove(this.b, iIndexOf);
    }

    public CommonRecycleAdapter(@LayoutRes int i, @IdRes int i2, T[] tArr) {
        this.a = i;
        if (tArr != null) {
            this.b = new CopyOnWriteArrayList<>(tArr);
        }
        this.c = i2;
    }

    public void addData(T t, int i) {
        CopyOnWriteArrayList<T> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList != null) {
            insert(copyOnWriteArrayList, t, i);
        }
    }
}
