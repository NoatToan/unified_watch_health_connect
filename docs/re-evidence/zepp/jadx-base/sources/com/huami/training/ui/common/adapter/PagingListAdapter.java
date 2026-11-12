package com.huami.training.ui.common.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.ui.common.CourseLayoutDelegate;
import com.huami.training.ui.common.MiFitCourseLayoutDelegate;
import com.huami.training.ui.common.adapter.PagingListAdapter;
import com.huami.training.ui.common.viewholder.FirstLoadErrorViewHolder;
import com.huami.training.ui.common.viewholder.NetworkStateItemViewHolder;
import com.huami.training.vo.Resource;
import com.huami.training.vo.Status;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 3*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0004:\u00013B-\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001b\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/¢\u0006\u0004\b1\u00102J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0017\u0010\u0011\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u00012\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\u0014\u0010\u001a\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\"RT\u0010.\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000f\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00064"}, d2 = {"Lcom/huami/training/ui/common/adapter/PagingListAdapter;", "Item", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "NormalViewHolder", "Landroidx/paging/PagedListAdapter;", "", "c", "b", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "createItemViewHolder", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "item", "bindTo", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V", "getItemViewType", "getItemCount", "Lcom/huami/training/vo/Resource;", "newNetworkState", "setNetworkState", "Lcom/huami/training/ui/common/CourseLayoutDelegate;", "a", "Lcom/huami/training/ui/common/CourseLayoutDelegate;", "layoutDelegate", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "retryCallback", "Lcom/huami/training/vo/Resource;", "networkState", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "pos", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function2;", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function2;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function2;)V", "onItemClickListener", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallBack", "<init>", "(Lcom/huami/training/ui/common/CourseLayoutDelegate;Lkotlin/jvm/functions/Function0;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class PagingListAdapter<Item, NormalViewHolder extends RecyclerView.ViewHolder> extends PagedListAdapter<Item, RecyclerView.ViewHolder> {
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CourseLayoutDelegate layoutDelegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> retryCallback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Resource<Unit> networkState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function2<? super Integer, ? super Item, Unit> onItemClickListener;

    public /* synthetic */ PagingListAdapter(CourseLayoutDelegate courseLayoutDelegate, Function0 function0, DiffUtil.ItemCallback itemCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MiFitCourseLayoutDelegate() : courseLayoutDelegate, function0, itemCallback);
    }

    private final boolean b() {
        Resource<Unit> resource = this.networkState;
        if (resource != null) {
            if ((resource == null ? null : resource.getStatus()) == Status.ERROR) {
                return true;
            }
        }
        return false;
    }

    private final boolean c() {
        Resource<Unit> resource = this.networkState;
        if (resource != null) {
            if ((resource == null ? null : resource.getStatus()) != Status.SUCCESS) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(RecyclerView.ViewHolder viewHolder, PagingListAdapter pagingListAdapter, View view) {
        Item item;
        Function2<Integer, Item, Unit> onItemClickListener;
        int adapterPosition = viewHolder.getAdapterPosition();
        boolean z = false;
        if (adapterPosition >= 0 && adapterPosition < pagingListAdapter.getFragmentsCount()) {
            z = true;
        }
        if (!z || (item = pagingListAdapter.getItem(adapterPosition)) == null || (onItemClickListener = pagingListAdapter.getOnItemClickListener()) == null) {
            return;
        }
        onItemClickListener.invoke(Integer.valueOf(adapterPosition), item);
    }

    public abstract void bindTo(@NotNull NormalViewHolder holder, @Nullable Item item);

    @NotNull
    public abstract NormalViewHolder createItemViewHolder(@NotNull ViewGroup parent);

    @Override // androidx.paging.PagedListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return super.getFragmentsCount() + (c() ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (c() && position == getFragmentsCount() - 1) {
            return (b() && super.getFragmentsCount() == 0) ? 3 : 1;
        }
        return 2;
    }

    @Nullable
    public final Function2<Integer, Item, Unit> getOnItemClickListener() {
        return this.onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {
        int itemViewType = getItemViewType(position);
        if (itemViewType == 1) {
            ((NetworkStateItemViewHolder) holder).bindTo(this.networkState);
        } else {
            if (itemViewType != 2) {
                return;
            }
            bindTo(holder, getItem(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        if (viewType == 1) {
            return NetworkStateItemViewHolder.INSTANCE.create(parent, this.retryCallback);
        }
        if (viewType != 2) {
            if (viewType == 3) {
                return FirstLoadErrorViewHolder.INSTANCE.create(this.layoutDelegate, parent, this.retryCallback);
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("unknown view type ", Integer.valueOf(viewType)));
        }
        final RecyclerView.ViewHolder viewHolderCreateItemViewHolder = createItemViewHolder(parent);
        viewHolderCreateItemViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: er5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PagingListAdapter.d(viewHolderCreateItemViewHolder, this, view);
            }
        });
        return viewHolderCreateItemViewHolder;
    }

    public final void setNetworkState(@NotNull Resource<Unit> newNetworkState) {
        Resource<Unit> resource = this.networkState;
        boolean zC = c();
        this.networkState = newNetworkState;
        boolean zC2 = c();
        if (zC != zC2) {
            if (zC) {
                notifyItemRemoved(super.getFragmentsCount());
                return;
            } else {
                notifyItemInserted(super.getFragmentsCount());
                return;
            }
        }
        if (!zC2 || resource == newNetworkState) {
            return;
        }
        notifyItemChanged(getFragmentsCount() - 1);
    }

    public final void setOnItemClickListener(@Nullable Function2<? super Integer, ? super Item, Unit> function2) {
        this.onItemClickListener = function2;
    }

    public PagingListAdapter(@NotNull CourseLayoutDelegate courseLayoutDelegate, @NotNull Function0<Unit> function0, @NotNull DiffUtil.ItemCallback<Item> itemCallback) {
        super(itemCallback);
        this.layoutDelegate = courseLayoutDelegate;
        this.retryCallback = function0;
    }
}
