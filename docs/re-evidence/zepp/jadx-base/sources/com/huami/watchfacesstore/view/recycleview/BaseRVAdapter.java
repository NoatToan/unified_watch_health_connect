package com.huami.watchfacesstore.view.recycleview;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.view.recycleview.BaseRVAdapter;
import com.huami.watchfacesstore.view.recycleview.animation.AlphaInAnimation;
import com.huami.watchfacesstore.view.recycleview.animation.BaseAnimation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseRVAdapter<T> extends RecyclerView.Adapter<ViewHolder> implements b<T>, c, ViewHolder.a {
    private static final String m = "BaseRVAdapter";
    private final Context a;
    private final List<T> b;
    private final int c;
    private LayoutInflater d;
    private OnItemClickListener e;
    private OnItemLongClickListener f;
    private Interpolator g;
    private long h;
    private boolean i;
    private boolean j;
    private BaseAnimation k;
    private int l;

    public interface OnItemClickListener {
        void onItemClick(ViewHolder holder, int viewType, int position);
    }

    public interface OnItemLongClickListener {
        boolean onItemLongClick(ViewHolder holder, int viewType, int position);
    }

    public static class a<T> extends AsyncTask<Void, Void, DiffUtil.DiffResult> {
        private final DefaultDiffCallback<T> a;
        private WeakReference<BaseRVAdapter<T>> b;

        public a(DefaultDiffCallback<T> callback, BaseRVAdapter<T> adapter) {
            this.a = callback;
            this.b = new WeakReference<>(adapter);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DiffUtil.DiffResult doInBackground(Void... params) {
            return DiffUtil.calculateDiff(this.a);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(DiffUtil.DiffResult diffResult) {
            this.b.get().replaceAll(this.a.getNewList());
            if (diffResult != null) {
                diffResult.dispatchUpdatesTo(this.b.get());
            }
        }
    }

    public BaseRVAdapter(Context context, @LayoutRes int layoutId) {
        this(context, null, layoutId);
    }

    private boolean e(DiffUtil.Callback callback) {
        if (callback != null && callback.getNewListSize() >= 1) {
            return true;
        }
        HMLog.warn(m, new Function0() { // from class: gr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseRVAdapter.f();
            }
        });
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f() {
        return "Invalid size of the new list.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g() {
        return "Invalid animation duration";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(ViewHolder viewHolder, int i, View view) {
        this.e.onItemClick(viewHolder, i, viewHolder.getAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean i(ViewHolder viewHolder, int i, View view) {
        return this.f.onItemLongClick(viewHolder, i, viewHolder.getAdapterPosition());
    }

    @Override // com.huami.watchfacesstore.view.recycleview.b
    public void add(@NonNull T elem) {
        int size = this.b.size();
        this.b.add(elem);
        notifyItemInserted(size);
        notifyItemRangeChanged(size, 1);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.b
    public void addAll(@NonNull List<T> elem) {
        this.b.addAll(elem);
        notifyItemRangeInserted(this.b.size(), elem.size());
    }

    @Override // com.huami.watchfacesstore.view.recycleview.c
    public void addLoadAnimation(RecyclerView.ViewHolder holder) {
        if (this.i) {
            if (!this.j || holder.getLayoutPosition() > this.l) {
                BaseAnimation alphaInAnimation = this.k;
                if (alphaInAnimation == null) {
                    alphaInAnimation = new AlphaInAnimation();
                }
                for (Animator animator : alphaInAnimation.getAnimators(holder.itemView)) {
                    animator.setInterpolator(this.g);
                    animator.setDuration(this.h).start();
                }
                this.l = holder.getLayoutPosition();
            }
        }
    }

    @Override // com.huami.watchfacesstore.view.recycleview.c
    public void cancelLoadAnimation() {
        this.i = false;
        this.k = null;
    }

    @Override // com.huami.watchfacesstore.view.recycleview.b
    @SuppressLint({"NotifyDataSetChanged"})
    public void clear() {
        this.b.clear();
        notifyDataSetChanged();
    }

    @Override // com.huami.watchfacesstore.view.recycleview.b
    public boolean contains(@NonNull T elem) {
        return this.b.contains(elem);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.b
    public boolean containsAll(List<T> items) {
        return this.b.containsAll(items);
    }

    public abstract void convert(@NonNull ViewHolder holder, int position, @Nullable T item);

    public void diff(DefaultDiffCallback<T> callback) {
        if (e(callback)) {
            new a(callback, this).execute(new Void[0]);
        }
    }

    @Override // com.huami.watchfacesstore.view.recycleview.c
    public void enableLoadAnimation() {
        enableLoadAnimation(this.h, new AlphaInAnimation());
    }

    public Context getContext() {
        return this.a;
    }

    public T getItem(int position) {
        if (position < 0 || position >= this.b.size()) {
            return null;
        }
        return this.b.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        List<T> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getLayoutResId(getItem(position), position);
    }

    @LayoutRes
    public int getLayoutResId(T item, int position) {
        return this.c;
    }

    public List<T> getListData() {
        return this.b;
    }

    @Override // com.huami.watchfacesstore.view.recycleview.b
    public void move(int fromPosition, int toPosition) {
        Collections.swap(this.b, fromPosition, toPosition);
        notifyItemMoved(fromPosition, toPosition);
    }

    public void onViewHolderInit(@NotNull View itemView, int layoutRes) {
    }

    @Override // com.huami.watchfacesstore.view.recycleview.b
    public void remove(@NonNull T elem) {
        if (this.b.indexOf(elem) != -1) {
            remove(this.b.indexOf(elem));
        }
    }

    @Override // com.huami.watchfacesstore.view.recycleview.b
    public void removeAll(List<T> items) {
        this.b.removeAll(items);
        notifyItemRangeRemoved(0, items.size());
    }

    @Override // com.huami.watchfacesstore.view.recycleview.b
    @SuppressLint({"NotifyDataSetChanged"})
    public void replaceAll(@NonNull List<T> elem) {
        getFragmentsCount();
        this.b.clear();
        this.b.addAll(elem);
        notifyDataSetChanged();
    }

    @Override // com.huami.watchfacesstore.view.recycleview.b
    public void set(@NonNull T oldElem, @NonNull T newElem) {
        int iIndexOf = this.b.indexOf(oldElem);
        if (iIndexOf != -1) {
            set(iIndexOf, newElem);
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.e = onItemClickListener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        this.f = onItemLongClickListener;
    }

    @Override // com.huami.watchfacesstore.view.recycleview.c
    public void setOnlyOnce(boolean onlyOnce) {
        this.j = onlyOnce;
    }

    public BaseRVAdapter(Context context, List<T> data, @LayoutRes int layoutId) {
        this.g = new LinearInterpolator();
        this.h = 300L;
        this.j = true;
        this.l = -1;
        this.b = data == null ? new ArrayList() : new ArrayList(data);
        this.a = context;
        this.c = layoutId;
        this.d = LayoutInflater.from(context);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.c
    public void enableLoadAnimation(long duration, BaseAnimation animation) {
        if (duration > 0) {
            this.h = duration;
        } else {
            HMLog.error(m, new Function0() { // from class: fr
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseRVAdapter.g();
                }
            });
        }
        this.i = true;
        this.k = animation;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.setAssociatedObject(getItem(position));
        convert(holder, position, getItem(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, final int viewType) {
        final ViewHolder viewHolderA = ViewHolder.a(null, this.d, parent, viewType, this);
        View view = viewHolderA.itemView;
        if (!(view instanceof AdapterView) && !(view instanceof RecyclerView)) {
            if (this.e != null) {
                view.setOnClickListener(new View.OnClickListener() { // from class: dr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.a.h(viewHolderA, viewType, view2);
                    }
                });
            }
            if (this.f != null) {
                viewHolderA.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: er
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        return this.a.i(viewHolderA, viewType, view2);
                    }
                });
            }
        }
        return viewHolderA;
    }

    @Override // com.huami.watchfacesstore.view.recycleview.b
    public void addAll(int location, List<T> items) {
        this.b.addAll(location, items);
        notifyItemRangeInserted(location, items.size());
    }

    @Override // com.huami.watchfacesstore.view.recycleview.b
    public void remove(int index) {
        this.b.remove(index);
        notifyItemRemoved(index);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.b
    public void set(int index, @NonNull T elem) {
        this.b.set(index, elem);
        notifyItemChanged(index);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.b
    public void add(int index, @NonNull T elem) {
        this.b.add(index, elem);
        notifyItemInserted(index);
    }
}
