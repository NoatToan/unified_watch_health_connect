package com.xiaomi.fitness.baseui.recyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.baseui.recyclerview.view.FooterView;
import com.xiaomi.fitness.baseui.recyclerview.view.FooterViewKt;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.z4j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 >2\u00020\u0001:\u0004>?@AB'\b\u0007\u0012\u0006\u00108\u001a\u000207\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000109\u0012\b\b\u0002\u0010;\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b$\u0010\u0012R\u001c\u0010&\u001a\b\u0018\u00010%R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010+R\"\u00102\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u0010\u0019¨\u0006B"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "lastPositions", "", "findLast", "([I)I", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "adapter", "", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "", "enable", "setEnableMore", "(Z)V", "Landroidx/recyclerview/widget/RecyclerView$o;", "layout", "setLayoutManager", "(Landroidx/recyclerview/widget/RecyclerView$o;)V", "state", "onScrollStateChanged", "(I)V", "Lcom/xiaomi/fitness/baseui/recyclerview/view/Status;", "status", "needRefresh", "setStatus", "(Lcom/xiaomi/fitness/baseui/recyclerview/view/Status;Z)V", "Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView$LoadListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setLoadListener", "(Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView$LoadListener;)V", "show", "showFooterDesc", "Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView$WrapAdapter;", "mWrapAdapter", "Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView$WrapAdapter;", "mLoadListener", "Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView$LoadListener;", "mEnableMore", "Z", "Landroidx/recyclerview/widget/RecyclerView$i;", "mDataObserver", "Landroidx/recyclerview/widget/RecyclerView$i;", "mStatus", "Lcom/xiaomi/fitness/baseui/recyclerview/view/Status;", "showDesc", "loadMoreThreshold", "I", "getLoadMoreThreshold", "()I", "setLoadMoreThreshold", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "WrapAdapter", "DataObserver", "LoadListener", "ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMoreRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoreRecyclerView.kt\ncom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
public final class MoreRecyclerView extends RecyclerView {

    @NotNull
    public static final String TAG = "MoreRecyclerView";
    private int loadMoreThreshold;

    @NotNull
    private final RecyclerView.i mDataObserver;
    private boolean mEnableMore;

    @Nullable
    private LoadListener mLoadListener;

    @NotNull
    private Status mStatus;

    @Nullable
    private WrapAdapter mWrapAdapter;
    private boolean showDesc;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ)\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\n\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\tJ'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView$DataObserver;", "Landroidx/recyclerview/widget/RecyclerView$i;", "", "onChanged", "()V", "", "positionStart", "itemCount", "onItemRangeInserted", "(II)V", "onItemRangeChanged", "", TSMAuthContants.PARAM_PAYLOAD, "(IILjava/lang/Object;)V", "onItemRangeRemoved", "fromPosition", "toPosition", "onItemRangeMoved", "(III)V", "<init>", "(Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView;)V", "ui_release"}, k = 1, mv = {2, 0, 0})
    public final class DataObserver extends RecyclerView.i {
        public DataObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            WrapAdapter wrapAdapter = MoreRecyclerView.this.mWrapAdapter;
            if (wrapAdapter != null) {
                wrapAdapter.notifyDataSetChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int positionStart, int itemCount) {
            WrapAdapter wrapAdapter = MoreRecyclerView.this.mWrapAdapter;
            if (wrapAdapter != null) {
                wrapAdapter.notifyItemRangeChanged(positionStart, itemCount);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeInserted(int positionStart, int itemCount) {
            WrapAdapter wrapAdapter = MoreRecyclerView.this.mWrapAdapter;
            if (wrapAdapter != null) {
                wrapAdapter.notifyItemRangeInserted(positionStart, itemCount);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
            WrapAdapter wrapAdapter = MoreRecyclerView.this.mWrapAdapter;
            if (wrapAdapter != null) {
                wrapAdapter.notifyItemMoved(fromPosition, toPosition);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeRemoved(int positionStart, int itemCount) {
            WrapAdapter wrapAdapter = MoreRecyclerView.this.mWrapAdapter;
            if (wrapAdapter != null) {
                wrapAdapter.notifyItemRangeRemoved(positionStart, itemCount);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int positionStart, int itemCount, @Nullable Object payload) {
            WrapAdapter wrapAdapter = MoreRecyclerView.this.mWrapAdapter;
            if (wrapAdapter != null) {
                wrapAdapter.notifyItemRangeChanged(positionStart, itemCount, payload);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView$LoadListener;", "", "loadMore", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface LoadListener {
        void loadMore();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MoreRecyclerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int findLast(int[] lastPositions) {
        int i = lastPositions[0];
        for (int i2 : lastPositions) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public static /* synthetic */ void setStatus$default(MoreRecyclerView moreRecyclerView, Status status, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        moreRecyclerView.setStatus(status, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @Nullable
    public RecyclerView.Adapter<?> getAdapter() {
        WrapAdapter wrapAdapter = this.mWrapAdapter;
        if (wrapAdapter != null) {
            return wrapAdapter.getOriAdapter();
        }
        return null;
    }

    public final int getLoadMoreThreshold() {
        return this.loadMoreThreshold;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int state) {
        RecyclerView.o layoutManager;
        int iFindLast;
        if (state != 0 || !FooterViewKt.canLoadMore(this.mStatus) || this.mLoadListener == null || (layoutManager = getLayoutManager()) == null) {
            return;
        }
        int itemCount = layoutManager.getItemCount();
        if (layoutManager instanceof GridLayoutManager) {
            iFindLast = ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        } else if (layoutManager instanceof LinearLayoutManager) {
            iFindLast = ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.L()];
            staggeredGridLayoutManager.A(iArr);
            iFindLast = findLast(iArr);
        } else {
            iFindLast = -1;
        }
        if (itemCount - iFindLast <= this.loadMoreThreshold) {
            setStatus(Status.LOADING, true);
            LoadListener loadListener = this.mLoadListener;
            if (loadListener != null) {
                loadListener.loadMore();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(@Nullable RecyclerView.Adapter<? extends RecyclerView.d0> adapter) {
        if (adapter != null) {
            WrapAdapter wrapAdapter = new WrapAdapter(this, adapter);
            this.mWrapAdapter = wrapAdapter;
            super.setAdapter(wrapAdapter);
            adapter.registerAdapterDataObserver(this.mDataObserver);
            this.mDataObserver.onChanged();
        }
    }

    public final void setEnableMore(boolean enable) {
        this.mEnableMore = enable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(@Nullable RecyclerView.o layout) {
        super.setLayoutManager(layout);
        WrapAdapter wrapAdapter = this.mWrapAdapter;
        if (wrapAdapter == null || !(layout instanceof GridLayoutManager) || wrapAdapter == null) {
            return;
        }
        wrapAdapter.resetGridSpanSize((GridLayoutManager) layout);
    }

    public final void setLoadListener(@NotNull LoadListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mLoadListener = listener;
    }

    public final void setLoadMoreThreshold(int i) {
        this.loadMoreThreshold = i;
    }

    @JvmOverloads
    public final void setStatus(@NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        setStatus$default(this, status, false, 2, null);
    }

    public final void showFooterDesc(boolean show) {
        this.showDesc = show;
        WrapAdapter wrapAdapter = this.mWrapAdapter;
        if (wrapAdapter != null) {
            wrapAdapter.getOriAdapter().notifyItemChanged(wrapAdapter.getItemCount() - 1);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MoreRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmOverloads
    public final void setStatus(@NotNull Status status, boolean needRefresh) {
        WrapAdapter wrapAdapter;
        Intrinsics.checkNotNullParameter(status, "status");
        this.mStatus = status;
        if (!needRefresh || (wrapAdapter = this.mWrapAdapter) == null) {
            return;
        }
        wrapAdapter.getOriAdapter().notifyItemChanged(wrapAdapter.getItemCount() - 1);
    }

    public /* synthetic */ MoreRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B\u0015\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b6\u00107J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u000f\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u0007J\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010'J\u0017\u0010*\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b0\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView$WrapAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "viewType", "", "viewTypeConflict", "(I)Z", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "", "", "payloads", "(Landroidx/recyclerview/widget/RecyclerView$d0;ILjava/util/List;)V", "getItemViewType", "(I)I", "getItemCount", "()I", "", "getItemId", "(I)J", "isFooter", "Landroidx/recyclerview/widget/GridLayoutManager;", "manager", "resetGridSpanSize", "(Landroidx/recyclerview/widget/GridLayoutManager;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onDetachedFromRecyclerView", "onViewAttachedToWindow", "(Landroidx/recyclerview/widget/RecyclerView$d0;)V", "onViewDetachedFromWindow", "onViewRecycled", "onFailedToRecycleView", "(Landroidx/recyclerview/widget/RecyclerView$d0;)Z", "Landroidx/recyclerview/widget/RecyclerView$i;", "observer", "unregisterAdapterDataObserver", "(Landroidx/recyclerview/widget/RecyclerView$i;)V", "registerAdapterDataObserver", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getOriAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "oriAdapter", "<init>", "(Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView;Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "FooterHolder", "ui_release"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nMoreRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoreRecyclerView.kt\ncom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView$WrapAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
    public final class WrapAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

        @NotNull
        private final RecyclerView.Adapter<RecyclerView.d0> adapter;
        final /* synthetic */ MoreRecyclerView this$0;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView$WrapAdapter$FooterHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/view/Status;", "itemView", "Lcom/xiaomi/fitness/baseui/recyclerview/view/FooterView;", "<init>", "(Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView$WrapAdapter;Lcom/xiaomi/fitness/baseui/recyclerview/view/FooterView;)V", "bind", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public final class FooterHolder extends BaseViewHolder<Status> {
            final /* synthetic */ WrapAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FooterHolder(@NotNull WrapAdapter wrapAdapter, FooterView itemView) {
                super(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                this.this$0 = wrapAdapter;
                itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            }

            @Override // com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder
            public void bind(@NotNull Status t) {
                Intrinsics.checkNotNullParameter(t, "t");
                this.itemView.setVisibility(!this.this$0.this$0.showDesc ? 4 : 0);
                View view = this.itemView;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.recyclerview.view.FooterView");
                ((FooterView) view).updateState(t);
            }
        }

        public WrapAdapter(@NotNull MoreRecyclerView moreRecyclerView, RecyclerView.Adapter<RecyclerView.d0> adapter) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.this$0 = moreRecyclerView;
            this.adapter = adapter;
        }

        private final boolean viewTypeConflict(int viewType) {
            return viewType == 7737571;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int itemCount = this.adapter.getItemCount();
            if (itemCount == 0) {
                return 0;
            }
            return this.this$0.mEnableMore ? itemCount + 1 : itemCount;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int position) {
            return (position >= this.adapter.getItemCount() || position >= this.adapter.getItemCount()) ? super.getItemId(position) : this.adapter.getItemId(position);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            if (isFooter(position)) {
                return 7737571;
            }
            if (position >= this.adapter.getItemCount()) {
                return super.getItemViewType(position);
            }
            int itemViewType = this.adapter.getItemViewType(position);
            if (!viewTypeConflict(itemViewType)) {
                return itemViewType;
            }
            throw new IllegalStateException("itemViewType in adapter conflict with MoreRecyclerView's footer type".toString());
        }

        @NotNull
        public final RecyclerView.Adapter<RecyclerView.d0> getOriAdapter() {
            return this.adapter;
        }

        public final boolean isFooter(int position) {
            return this.this$0.mEnableMore && position == getItemCount() - 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onAttachedToRecyclerView(recyclerView);
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                resetGridSpanSize((GridLayoutManager) layoutManager);
            }
            this.adapter.onAttachedToRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (holder instanceof FooterHolder) {
                ((FooterHolder) holder).bind(this.this$0.mStatus);
            } else if (position < this.adapter.getItemCount()) {
                this.adapter.onBindViewHolder(holder, position);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (viewType != 7737571) {
                RecyclerView.d0 d0VarOnCreateViewHolder = this.adapter.onCreateViewHolder(parent, viewType);
                Intrinsics.checkNotNullExpressionValue(d0VarOnCreateViewHolder, "onCreateViewHolder(...)");
                return d0VarOnCreateViewHolder;
            }
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new FooterHolder(this, new FooterView(context, null, 0, 6, null));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            this.adapter.onDetachedFromRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public boolean onFailedToRecycleView(@NotNull RecyclerView.d0 holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            return this.adapter.onFailedToRecycleView(holder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(@NotNull RecyclerView.d0 holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            super.onViewAttachedToWindow(holder);
            ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
            if ((layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) && isFooter(holder.getLayoutPosition())) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).i(true);
            }
            this.adapter.onViewAttachedToWindow(holder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(@NotNull RecyclerView.d0 holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            this.adapter.onViewDetachedFromWindow(holder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(@NotNull RecyclerView.d0 holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            this.adapter.onViewRecycled(holder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void registerAdapterDataObserver(@NotNull RecyclerView.i observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.adapter.registerAdapterDataObserver(observer);
        }

        public final void resetGridSpanSize(@NotNull final GridLayoutManager manager) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            final GridLayoutManager.b bVarY = manager.y();
            manager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView$WrapAdapter$resetGridSpanSize$newLookup$1
                @Override // androidx.recyclerview.widget.GridLayoutManager.b
                public int getSpanSize(int position) {
                    return this.this$0.isFooter(position) ? manager.u() : bVarY.getSpanSize(position);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void unregisterAdapterDataObserver(@NotNull RecyclerView.i observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.adapter.unregisterAdapterDataObserver(observer);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position, @NotNull List<? extends Object> payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            if (isFooter(position)) {
                ((FooterHolder) holder).bind(this.this$0.mStatus);
            } else if (position < this.adapter.getItemCount()) {
                if (payloads.isEmpty()) {
                    this.adapter.onBindViewHolder(holder, position);
                } else {
                    this.adapter.onBindViewHolder(holder, position, payloads);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MoreRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mEnableMore = true;
        this.mDataObserver = new DataObserver();
        this.mStatus = Status.MORE;
        this.showDesc = true;
        this.loadMoreThreshold = 20;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4j.m2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.loadMoreThreshold = typedArrayObtainStyledAttributes.getInteger(z4j.n2, 20);
        typedArrayObtainStyledAttributes.recycle();
    }
}
