package com.zhouyou.recyclerview.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BaseRecyclerViewAdapter<T> extends RecyclerView.Adapter<BH> {
    private SparseArray<View> a = new SparseArray<>();
    private OnItemClickListener b;
    private OnItemLongClickListener c;
    public Context mContext;
    public LayoutInflater mLInflater;
    public int[] mLayoutIds;
    public List<T> mList;

    public interface OnItemClickListener<T> {
        void onItemClick(View view, T t, int i);
    }

    public interface OnItemLongClickListener<T> {
        void onItemLongClick(View view, T t, int i);
    }

    public class a implements View.OnClickListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseRecyclerViewAdapter.this.b.onItemClick(view, BaseRecyclerViewAdapter.this.mList.get(this.a), this.a);
        }
    }

    public class b implements View.OnLongClickListener {
        public final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            BaseRecyclerViewAdapter.this.c.onItemLongClick(view, BaseRecyclerViewAdapter.this.mList.get(this.a), this.a);
            return true;
        }
    }

    public BaseRecyclerViewAdapter(List<T> list, Context context, int... iArr) {
        this.mList = list;
        this.mLayoutIds = iArr;
        this.mContext = context;
        this.mLInflater = LayoutInflater.from(context);
    }

    public int checkLayout(T t, int i) {
        return 0;
    }

    public BaseRecyclerViewHolder createViewHolder(View view, int i) {
        return new BaseRecyclerViewHolder(view, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<T> list = this.mList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return (i < 0 || i >= getItemCount()) ? i : checkLayout(this.mList.get(i), i);
    }

    public View inflateItemView(int i, ViewGroup viewGroup) {
        View view = this.a.get(i);
        return view == null ? this.mLInflater.inflate(i, viewGroup, false) : view;
    }

    public boolean isEmpty() {
        return getItemCount() == 0;
    }

    public abstract void onBindData(BH bh, int i, T t);

    public final void onBindItemClickListener(BH bh, int i) {
        if (this.b != null) {
            bh.itemView.setOnClickListener(new a(i));
        }
        if (this.c != null) {
            bh.itemView.setOnLongClickListener(new b(i));
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.b = onItemClickListener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        this.c = onItemLongClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        onBindViewHolder((BH) viewHolder, i, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public BH onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i >= 0) {
            int[] iArr = this.mLayoutIds;
            if (i <= iArr.length) {
                if (iArr.length == 0) {
                    throw new IllegalArgumentException("not layoutId");
                }
                int i2 = iArr[i];
                View viewInflateItemView = inflateItemView(i2, viewGroup);
                BaseRecyclerViewHolder baseRecyclerViewHolder = (BaseRecyclerViewHolder) viewInflateItemView.getTag(-1211707988);
                return (baseRecyclerViewHolder == null || baseRecyclerViewHolder.getLayoutId() != i2) ? createViewHolder(viewInflateItemView, i2) : baseRecyclerViewHolder;
            }
        }
        throw new ArrayIndexOutOfBoundsException("checkLayout > LayoutId.length");
    }

    public void onBindViewHolder(BH bh, int i, List<Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder(bh, i);
        } else {
            super.onBindViewHolder(bh, i, list);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(BH bh, int i) {
        if (i >= 0) {
            onBindData(bh, i, this.mList.get(i));
            onBindItemClickListener(bh, i);
        } else {
            throw new RuntimeException("The position is less than 0 !!!!!!" + i);
        }
    }

    public BaseRecyclerViewAdapter(Context context, int... iArr) {
        this.mLayoutIds = iArr;
        this.mContext = context;
        this.mLInflater = LayoutInflater.from(context);
    }

    public BaseRecyclerViewAdapter(Context context) {
        this.mContext = context;
        this.mLInflater = LayoutInflater.from(context);
    }

    public BaseRecyclerViewAdapter(List<T> list, Context context) {
        this.mList = list;
        this.mContext = context;
        this.mLInflater = LayoutInflater.from(context);
    }
}
