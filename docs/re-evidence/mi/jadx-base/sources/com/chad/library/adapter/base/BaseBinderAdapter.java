package com.chad.library.adapter.base;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.h;
import com.chad.library.adapter.base.binder.BaseItemBinder;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B\u0019\u0012\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000107¢\u0006\u0004\b9\u0010:JM\u0010\u000b\u001a\u00020\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00052\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\u000b\u001a\u00020\u0000\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00022\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0086\b¢\u0006\u0004\b\u000b\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0014¢\u0006\u0004\b\u0017\u0010\u001bJ#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\u00020\u00102\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0003H\u0014¢\u0006\u0004\b-\u0010&J\u001f\u0010.\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b.\u0010$RH\u00101\u001a6\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t0/j\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R8\u00103\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00100/j\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u0010`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R$\u00105\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u0007048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006<"}, d2 = {"Lcom/chad/library/adapter/base/BaseBinderAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "T", "Ljava/lang/Class;", "clazz", "Lcom/chad/library/adapter/base/binder/BaseItemBinder;", "baseItemBinder", "Landroidx/recyclerview/widget/h$f;", "callback", "addItemBinder", "(Ljava/lang/Class;Lcom/chad/library/adapter/base/binder/BaseItemBinder;Landroidx/recyclerview/widget/h$f;)Lcom/chad/library/adapter/base/BaseBinderAdapter;", "(Lcom/chad/library/adapter/base/binder/BaseItemBinder;Landroidx/recyclerview/widget/h$f;)Lcom/chad/library/adapter/base/BaseBinderAdapter;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateDefViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "item", "", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "getItemBinder", "(I)Lcom/chad/library/adapter/base/binder/BaseItemBinder;", "getItemBinderOrNull", "position", "getDefItemViewType", "(I)I", "viewHolder", "bindViewClickListener", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "onViewAttachedToWindow", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "onViewDetachedFromWindow", "", "onFailedToRecycleView", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)Z", "findViewType", "(Ljava/lang/Class;)I", "bindClick", "bindChildClick", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "classDiffMap", "Ljava/util/HashMap;", "mTypeMap", "Landroid/util/SparseArray;", "mBinderArray", "Landroid/util/SparseArray;", "", "list", "<init>", "(Ljava/util/List;)V", "ItemCallback", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
public class BaseBinderAdapter extends BaseQuickAdapter<Object, BaseViewHolder> {
    private final HashMap<Class<?>, h.f<Object>> classDiffMap;
    private final SparseArray<BaseItemBinder<Object, ?>> mBinderArray;
    private final HashMap<Class<?>, Integer> mTypeMap;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\u0007J!\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/chad/library/adapter/base/BaseBinderAdapter$ItemCallback;", "Landroidx/recyclerview/widget/h$f;", "", "oldItem", "newItem", "", "areItemsTheSame", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "areContentsTheSame", "getChangePayload", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<init>", "(Lcom/chad/library/adapter/base/BaseBinderAdapter;)V", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
    public final class ItemCallback extends h.f<Object> {
        public ItemCallback() {
        }

        @Override // androidx.recyclerview.widget.h.f
        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(@NotNull Object oldItem, @NotNull Object newItem) {
            h.f fVar;
            if (!Intrinsics.areEqual(oldItem.getClass(), newItem.getClass()) || (fVar = (h.f) BaseBinderAdapter.this.classDiffMap.get(oldItem.getClass())) == null) {
                return true;
            }
            return fVar.areContentsTheSame(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull Object oldItem, @NotNull Object newItem) {
            h.f fVar;
            return (!Intrinsics.areEqual(oldItem.getClass(), newItem.getClass()) || (fVar = (h.f) BaseBinderAdapter.this.classDiffMap.get(oldItem.getClass())) == null) ? Intrinsics.areEqual(oldItem, newItem) : fVar.areItemsTheSame(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.h.f
        @Nullable
        public Object getChangePayload(@NotNull Object oldItem, @NotNull Object newItem) {
            h.f fVar;
            if (!Intrinsics.areEqual(oldItem.getClass(), newItem.getClass()) || (fVar = (h.f) BaseBinderAdapter.this.classDiffMap.get(oldItem.getClass())) == null) {
                return null;
            }
            return fVar.getChangePayload(oldItem, newItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseBinderAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BaseBinderAdapter addItemBinder$default(BaseBinderAdapter baseBinderAdapter, Class cls, BaseItemBinder baseItemBinder, h.f fVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItemBinder");
        }
        if ((i & 4) != 0) {
            fVar = null;
        }
        return baseBinderAdapter.addItemBinder(cls, baseItemBinder, fVar);
    }

    @JvmOverloads
    @NotNull
    public final <T> BaseBinderAdapter addItemBinder(@NotNull Class<? extends T> cls, @NotNull BaseItemBinder<T, ?> baseItemBinder) {
        return addItemBinder$default(this, cls, baseItemBinder, null, 4, null);
    }

    public void bindChildClick(@NotNull final BaseViewHolder viewHolder, int viewType) {
        getOnItemChildClickListener();
        final BaseItemBinder<Object, BaseViewHolder> itemBinder = getItemBinder(viewType);
        Iterator<T> it = itemBinder.getChildClickViewIds().iterator();
        while (it.hasNext()) {
            View viewFindViewById = viewHolder.itemView.findViewById(((Number) it.next()).intValue());
            if (viewFindViewById != null) {
                if (!viewFindViewById.isClickable()) {
                    viewFindViewById.setClickable(true);
                }
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseBinderAdapter$bindChildClick$$inlined$forEach$lambda$1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View v) {
                        int adapterPosition = viewHolder.getAdapterPosition();
                        if (adapterPosition == -1) {
                            return;
                        }
                        int headerLayoutCount = adapterPosition - this.this$0.getHeaderLayoutCount();
                        BaseItemBinder baseItemBinder = itemBinder;
                        BaseViewHolder baseViewHolder = viewHolder;
                        Intrinsics.checkExpressionValueIsNotNull(v, "v");
                        baseItemBinder.onChildClick(baseViewHolder, v, this.this$0.getData().get(headerLayoutCount), headerLayoutCount);
                    }
                });
            }
        }
        getOnItemChildLongClickListener();
        final BaseItemBinder<Object, BaseViewHolder> itemBinder2 = getItemBinder(viewType);
        Iterator<T> it2 = itemBinder2.getChildLongClickViewIds().iterator();
        while (it2.hasNext()) {
            View viewFindViewById2 = viewHolder.itemView.findViewById(((Number) it2.next()).intValue());
            if (viewFindViewById2 != null) {
                if (!viewFindViewById2.isLongClickable()) {
                    viewFindViewById2.setLongClickable(true);
                }
                viewFindViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseBinderAdapter$bindChildClick$$inlined$forEach$lambda$2
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View v) {
                        int adapterPosition = viewHolder.getAdapterPosition();
                        if (adapterPosition == -1) {
                            return false;
                        }
                        int headerLayoutCount = adapterPosition - this.this$0.getHeaderLayoutCount();
                        BaseItemBinder baseItemBinder = itemBinder2;
                        BaseViewHolder baseViewHolder = viewHolder;
                        Intrinsics.checkExpressionValueIsNotNull(v, "v");
                        return baseItemBinder.onChildLongClick(baseViewHolder, v, this.this$0.getData().get(headerLayoutCount), headerLayoutCount);
                    }
                });
            }
        }
    }

    public void bindClick(@NotNull final BaseViewHolder viewHolder) {
        getOnItemClickListener();
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseBinderAdapter.bindClick.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View it) {
                int adapterPosition = viewHolder.getAdapterPosition();
                if (adapterPosition == -1) {
                    return;
                }
                int headerLayoutCount = adapterPosition - BaseBinderAdapter.this.getHeaderLayoutCount();
                BaseItemBinder<Object, BaseViewHolder> itemBinder = BaseBinderAdapter.this.getItemBinder(viewHolder.getItemViewType());
                BaseViewHolder baseViewHolder = viewHolder;
                Intrinsics.checkExpressionValueIsNotNull(it, "it");
                itemBinder.onClick(baseViewHolder, it, BaseBinderAdapter.this.getData().get(headerLayoutCount), headerLayoutCount);
            }
        });
        getOnItemLongClickListener();
        viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseBinderAdapter.bindClick.2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View it) {
                int adapterPosition = viewHolder.getAdapterPosition();
                if (adapterPosition == -1) {
                    return false;
                }
                int headerLayoutCount = adapterPosition - BaseBinderAdapter.this.getHeaderLayoutCount();
                BaseItemBinder<Object, BaseViewHolder> itemBinder = BaseBinderAdapter.this.getItemBinder(viewHolder.getItemViewType());
                BaseViewHolder baseViewHolder = viewHolder;
                Intrinsics.checkExpressionValueIsNotNull(it, "it");
                return itemBinder.onLongClick(baseViewHolder, it, BaseBinderAdapter.this.getData().get(headerLayoutCount), headerLayoutCount);
            }
        });
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void bindViewClickListener(@NotNull BaseViewHolder viewHolder, int viewType) {
        super.bindViewClickListener(viewHolder, viewType);
        bindClick(viewHolder);
        bindChildClick(viewHolder, viewType);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder holder, @NotNull Object item) {
        getItemBinder(holder.getItemViewType()).convert(holder, item);
    }

    public final int findViewType(@NotNull Class<?> clazz) {
        Integer num = this.mTypeMap.get(clazz);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(("findViewType: ViewType: " + clazz + " Not Find!").toString());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public int getDefItemViewType(int position) {
        return findViewType(getData().get(position).getClass());
    }

    @NotNull
    public BaseItemBinder<Object, BaseViewHolder> getItemBinder(int viewType) {
        BaseItemBinder<Object, BaseViewHolder> baseItemBinder = (BaseItemBinder) this.mBinderArray.get(viewType);
        if (baseItemBinder != null) {
            return baseItemBinder;
        }
        throw new IllegalStateException(("getItemBinder: viewType '" + viewType + "' no such Binder found，please use addItemBinder() first!").toString());
    }

    @Nullable
    public BaseItemBinder<Object, BaseViewHolder> getItemBinderOrNull(int viewType) {
        BaseItemBinder<Object, BaseViewHolder> baseItemBinder = (BaseItemBinder) this.mBinderArray.get(viewType);
        if (baseItemBinder instanceof BaseItemBinder) {
            return baseItemBinder;
        }
        return null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public BaseViewHolder onCreateDefViewHolder(@NotNull ViewGroup parent, int viewType) {
        BaseItemBinder<Object, BaseViewHolder> itemBinder = getItemBinder(viewType);
        itemBinder.set_context$com_github_CymChad_brvah(getContext());
        return itemBinder.onCreateViewHolder(parent, viewType);
    }

    public BaseBinderAdapter(@Nullable List<Object> list) {
        super(0, list);
        this.classDiffMap = new HashMap<>();
        this.mTypeMap = new HashMap<>();
        this.mBinderArray = new SparseArray<>();
        setDiffCallback(new ItemCallback());
    }

    @JvmOverloads
    @NotNull
    public final <T> BaseBinderAdapter addItemBinder(@NotNull Class<? extends T> clazz, @NotNull BaseItemBinder<T, ?> baseItemBinder, @Nullable h.f<T> callback) {
        int size = this.mTypeMap.size() + 1;
        this.mTypeMap.put(clazz, Integer.valueOf(size));
        this.mBinderArray.append(size, baseItemBinder);
        baseItemBinder.set_adapter$com_github_CymChad_brvah(this);
        if (callback != null) {
            this.classDiffMap.put(clazz, callback);
        }
        return this;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder holder, @NotNull Object item, @NotNull List<? extends Object> payloads) {
        getItemBinder(holder.getItemViewType()).convert(holder, item, payloads);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(@NotNull BaseViewHolder holder) {
        BaseItemBinder<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(holder.getItemViewType());
        if (itemBinderOrNull != null) {
            return itemBinderOrNull.onFailedToRecycleView(holder);
        }
        return false;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull BaseViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        BaseItemBinder<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(holder.getItemViewType());
        if (itemBinderOrNull != null) {
            itemBinderOrNull.onViewAttachedToWindow(holder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NotNull BaseViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        BaseItemBinder<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(holder.getItemViewType());
        if (itemBinderOrNull != null) {
            itemBinderOrNull.onViewDetachedFromWindow(holder);
        }
    }

    public static /* synthetic */ BaseBinderAdapter addItemBinder$default(BaseBinderAdapter baseBinderAdapter, BaseItemBinder baseItemBinder, h.f fVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                fVar = null;
            }
            Intrinsics.reifiedOperationMarker(4, "T");
            baseBinderAdapter.addItemBinder(Object.class, baseItemBinder, fVar);
            return baseBinderAdapter;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItemBinder");
    }

    public /* synthetic */ BaseBinderAdapter(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    @NotNull
    public final /* synthetic */ <T> BaseBinderAdapter addItemBinder(@NotNull BaseItemBinder<T, ?> baseItemBinder, @Nullable h.f<T> callback) {
        Intrinsics.reifiedOperationMarker(4, "T");
        addItemBinder(Object.class, baseItemBinder, callback);
        return this;
    }
}
