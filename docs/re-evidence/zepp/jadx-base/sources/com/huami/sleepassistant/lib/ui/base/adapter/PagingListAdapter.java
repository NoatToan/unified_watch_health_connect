package com.huami.sleepassistant.lib.ui.base.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.sleepassistant.lib.ui.base.viewholder.NetworkStateItemViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 **\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002:\u0001*B#\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u0019\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0004\b(\u0010)J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&J!\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\u0014\u0010\u0017\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015J\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0015R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR9\u0010%\u001a%\u0012\u0013\u0012\u00110\b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006+"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/base/adapter/PagingListAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/paging/PagedListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "a", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "createItemViewHolder", "item", "bindTo", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V", "getItemViewType", "getItemCount", "Lcom/huami/android/vo/Resource;", "newNetworkState", "setNetworkState", "getNetworkState", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "retryCallback", "b", "Lcom/huami/android/vo/Resource;", "networkState", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "pos", "c", "Lkotlin/jvm/functions/Function2;", "onItemClickListener", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallBack", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class PagingListAdapter<T> extends PagedListAdapter<T, RecyclerView.ViewHolder> {
    public static final int TYPE_LOAD_MORE = 1;
    public static final int TYPE_NORMAL = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> retryCallback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Resource<Unit> networkState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function2<? super Integer, ? super T, Unit> onItemClickListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ PagingListAdapter<T> a;
        public final /* synthetic */ RecyclerView.ViewHolder b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PagingListAdapter<T> pagingListAdapter, RecyclerView.ViewHolder viewHolder) {
            super(1);
            this.a = pagingListAdapter;
            this.b = viewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            Object item = this.a.getItem(this.b.getAdapterPosition());
            if (item == null) {
                return;
            }
            PagingListAdapter<T> pagingListAdapter = this.a;
            RecyclerView.ViewHolder viewHolder = this.b;
            Function2 function2 = ((PagingListAdapter) pagingListAdapter).onItemClickListener;
            if (function2 == null) {
                return;
            }
            function2.invoke(Integer.valueOf(viewHolder.getAdapterPosition()), item);
        }
    }

    public PagingListAdapter(@NotNull Function0<Unit> function0, @NotNull DiffUtil.ItemCallback<T> itemCallback) {
        super(itemCallback);
        this.retryCallback = function0;
    }

    private final boolean a() {
        Resource<Unit> resource = this.networkState;
        if (resource != null) {
            if ((resource == null ? null : resource.getStatus()) != Status.SUCCESS) {
                return true;
            }
        }
        return false;
    }

    public abstract void bindTo(@NotNull RecyclerView.ViewHolder holder, @Nullable T item);

    @NotNull
    public abstract RecyclerView.ViewHolder createItemViewHolder(@NotNull ViewGroup parent);

    @Override // androidx.paging.PagedListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return super.getPagerCount() + (a() ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return (a() && position == getPagerCount() - 1) ? 1 : 2;
    }

    @Nullable
    public final Resource<Unit> getNetworkState() {
        return this.networkState;
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
            throw new IllegalArgumentException(Intrinsics.stringPlus("unknown view type ", Integer.valueOf(viewType)));
        }
        RecyclerView.ViewHolder viewHolderCreateItemViewHolder = createItemViewHolder(parent);
        ViewExKt.smartClick$default(viewHolderCreateItemViewHolder.itemView, 0L, new a(this, viewHolderCreateItemViewHolder), 1, null);
        return viewHolderCreateItemViewHolder;
    }

    public final void setNetworkState(@NotNull Resource<Unit> newNetworkState) {
        Resource<Unit> resource = this.networkState;
        boolean zA = a();
        this.networkState = newNetworkState;
        boolean zA2 = a();
        if (zA != zA2) {
            if (zA) {
                notifyItemRemoved(super.getPagerCount());
                return;
            } else {
                notifyItemInserted(super.getPagerCount());
                return;
            }
        }
        if (!zA2 || resource == newNetworkState) {
            return;
        }
        notifyItemChanged(getPagerCount() - 1);
    }
}
