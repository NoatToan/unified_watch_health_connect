package com.chad.library.adapter.base.module;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadmore.BaseLoadMoreView;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.c9h;
import defpackage.nie;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010I\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030H¢\u0006\u0004\bN\u0010OJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u0019\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\r\u0010 \u001a\u00020\u0002¢\u0006\u0004\b \u0010\u0004J\u0019\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020\u0002H\u0000¢\u0006\u0004\b%\u0010\u0004R\u0018\u0010'\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010-\u001a\u00020+2\u0006\u0010,\u001a\u00020+8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R$\u00101\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b1\u0010\u0016R\"\u00103\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010*\u001a\u0004\b:\u0010\u0016\"\u0004\b;\u0010\u001eR\"\u0010<\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010*\u001a\u0004\b<\u0010\u0016\"\u0004\b=\u0010\u001eR\"\u0010>\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010*\u001a\u0004\b>\u0010\u0016\"\u0004\b?\u0010\u001eR*\u0010A\u001a\u00020\f2\u0006\u0010@\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010\u0019R*\u0010F\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010*\u001a\u0004\bF\u0010\u0016\"\u0004\bG\u0010\u001eR\u001c\u0010I\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0011\u0010K\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bK\u0010\u0016R\u0011\u0010M\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bL\u0010D¨\u0006P"}, d2 = {"Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "Lnie;", "", "invokeLoadMoreListener", "()V", "Landroidx/recyclerview/widget/LinearLayoutManager;", "llm", "", "isFullScreen", "(Landroidx/recyclerview/widget/LinearLayoutManager;)Z", "", "numbers", "", "getTheBiggestNumber", "([I)I", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "viewHolder", "setupViewHolder$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "setupViewHolder", "loadMoreToLoading", "hasLoadMoreView", "()Z", "position", "autoLoadMore$com_github_CymChad_brvah", "(I)V", "autoLoadMore", "checkDisableLoadMoreIfNotFullPage", "gone", "loadMoreEnd", "(Z)V", "loadMoreComplete", "loadMoreFail", "Lc9h;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnLoadMoreListener", "(Lc9h;)V", "reset$com_github_CymChad_brvah", "reset", "mLoadMoreListener", "Lc9h;", "mNextLoadEnable", "Z", "Lcom/chad/library/adapter/base/loadmore/LoadMoreStatus;", "<set-?>", "loadMoreStatus", "Lcom/chad/library/adapter/base/loadmore/LoadMoreStatus;", "getLoadMoreStatus", "()Lcom/chad/library/adapter/base/loadmore/LoadMoreStatus;", "isLoadEndMoreGone", "Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "loadMoreView", "Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "getLoadMoreView", "()Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "setLoadMoreView", "(Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;)V", "enableLoadMoreEndClick", "getEnableLoadMoreEndClick", "setEnableLoadMoreEndClick", "isAutoLoadMore", "setAutoLoadMore", "isEnableLoadMoreIfNotFullPage", "setEnableLoadMoreIfNotFullPage", "value", "preLoadNumber", "I", "getPreLoadNumber", "()I", "setPreLoadNumber", "isEnableLoadMore", "setEnableLoadMore", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "baseQuickAdapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "isLoading", "getLoadMoreViewPosition", "loadMoreViewPosition", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
public class BaseLoadMoreModule implements nie {
    private final BaseQuickAdapter<?, ?> baseQuickAdapter;
    private boolean enableLoadMoreEndClick;
    private boolean isEnableLoadMore;
    private boolean isLoadEndMoreGone;
    private c9h mLoadMoreListener;
    private boolean mNextLoadEnable = true;

    @NotNull
    private LoadMoreStatus loadMoreStatus = LoadMoreStatus.Complete;

    @NotNull
    private BaseLoadMoreView loadMoreView = LoadMoreModuleConfig.getDefLoadMoreView();
    private boolean isAutoLoadMore = true;
    private boolean isEnableLoadMoreIfNotFullPage = true;
    private int preLoadNumber = 1;

    public BaseLoadMoreModule(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
        this.baseQuickAdapter = baseQuickAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTheBiggestNumber(int[] numbers) {
        int i = -1;
        if (numbers != null && numbers.length != 0) {
            for (int i2 : numbers) {
                if (i2 > i) {
                    i = i2;
                }
            }
        }
        return i;
    }

    private final void invokeLoadMoreListener() {
        this.loadMoreStatus = LoadMoreStatus.Loading;
        RecyclerView mRecyclerView = this.baseQuickAdapter.getMRecyclerView();
        if (mRecyclerView != null) {
            mRecyclerView.post(new Runnable() { // from class: com.chad.library.adapter.base.module.BaseLoadMoreModule$invokeLoadMoreListener$$inlined$let$lambda$1
                @Override // java.lang.Runnable
                public final void run() {
                    c9h c9hVar = this.this$0.mLoadMoreListener;
                    if (c9hVar != null) {
                        c9hVar.onLoadMore();
                    }
                }
            });
            return;
        }
        c9h c9hVar = this.mLoadMoreListener;
        if (c9hVar != null) {
            c9hVar.onLoadMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFullScreen(LinearLayoutManager llm) {
        return (llm.findLastCompletelyVisibleItemPosition() + 1 == this.baseQuickAdapter.getItemCount() && llm.findFirstCompletelyVisibleItemPosition() == 0) ? false : true;
    }

    public static /* synthetic */ void loadMoreEnd$default(BaseLoadMoreModule baseLoadMoreModule, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMoreEnd");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        baseLoadMoreModule.loadMoreEnd(z);
    }

    public final void autoLoadMore$com_github_CymChad_brvah(int position) {
        LoadMoreStatus loadMoreStatus;
        if (this.isAutoLoadMore && hasLoadMoreView() && position >= this.baseQuickAdapter.getItemCount() - this.preLoadNumber && (loadMoreStatus = this.loadMoreStatus) == LoadMoreStatus.Complete && loadMoreStatus != LoadMoreStatus.Loading && this.mNextLoadEnable) {
            invokeLoadMoreListener();
        }
    }

    public final void checkDisableLoadMoreIfNotFullPage() {
        final RecyclerView.o layoutManager;
        if (this.isEnableLoadMoreIfNotFullPage) {
            return;
        }
        this.mNextLoadEnable = false;
        RecyclerView mRecyclerView = this.baseQuickAdapter.getMRecyclerView();
        if (mRecyclerView == null || (layoutManager = mRecyclerView.getLayoutManager()) == null) {
            return;
        }
        Intrinsics.checkExpressionValueIsNotNull(layoutManager, "recyclerView.layoutManager ?: return");
        if (layoutManager instanceof LinearLayoutManager) {
            mRecyclerView.postDelayed(new Runnable() { // from class: com.chad.library.adapter.base.module.BaseLoadMoreModule.checkDisableLoadMoreIfNotFullPage.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (BaseLoadMoreModule.this.isFullScreen((LinearLayoutManager) layoutManager)) {
                        BaseLoadMoreModule.this.mNextLoadEnable = true;
                    }
                }
            }, 50L);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            mRecyclerView.postDelayed(new Runnable() { // from class: com.chad.library.adapter.base.module.BaseLoadMoreModule.checkDisableLoadMoreIfNotFullPage.2
                @Override // java.lang.Runnable
                public final void run() {
                    int[] iArr = new int[((StaggeredGridLayoutManager) layoutManager).L()];
                    ((StaggeredGridLayoutManager) layoutManager).A(iArr);
                    if (BaseLoadMoreModule.this.getTheBiggestNumber(iArr) + 1 != BaseLoadMoreModule.this.baseQuickAdapter.getItemCount()) {
                        BaseLoadMoreModule.this.mNextLoadEnable = true;
                    }
                }
            }, 50L);
        }
    }

    public final boolean getEnableLoadMoreEndClick() {
        return this.enableLoadMoreEndClick;
    }

    @NotNull
    public final LoadMoreStatus getLoadMoreStatus() {
        return this.loadMoreStatus;
    }

    @NotNull
    public final BaseLoadMoreView getLoadMoreView() {
        return this.loadMoreView;
    }

    public final int getLoadMoreViewPosition() {
        if (this.baseQuickAdapter.hasEmptyView()) {
            return -1;
        }
        BaseQuickAdapter<?, ?> baseQuickAdapter = this.baseQuickAdapter;
        return baseQuickAdapter.getHeaderLayoutCount() + baseQuickAdapter.getData().size() + baseQuickAdapter.getFooterLayoutCount();
    }

    public final int getPreLoadNumber() {
        return this.preLoadNumber;
    }

    public final boolean hasLoadMoreView() {
        if (this.mLoadMoreListener == null || !this.isEnableLoadMore) {
            return false;
        }
        if (this.loadMoreStatus == LoadMoreStatus.End && this.isLoadEndMoreGone) {
            return false;
        }
        return !this.baseQuickAdapter.getData().isEmpty();
    }

    /* JADX INFO: renamed from: isAutoLoadMore, reason: from getter */
    public final boolean getIsAutoLoadMore() {
        return this.isAutoLoadMore;
    }

    /* JADX INFO: renamed from: isEnableLoadMore, reason: from getter */
    public final boolean getIsEnableLoadMore() {
        return this.isEnableLoadMore;
    }

    /* JADX INFO: renamed from: isEnableLoadMoreIfNotFullPage, reason: from getter */
    public final boolean getIsEnableLoadMoreIfNotFullPage() {
        return this.isEnableLoadMoreIfNotFullPage;
    }

    /* JADX INFO: renamed from: isLoadEndMoreGone, reason: from getter */
    public final boolean getIsLoadEndMoreGone() {
        return this.isLoadEndMoreGone;
    }

    public final boolean isLoading() {
        return this.loadMoreStatus == LoadMoreStatus.Loading;
    }

    public final void loadMoreComplete() {
        if (hasLoadMoreView()) {
            this.loadMoreStatus = LoadMoreStatus.Complete;
            this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
            checkDisableLoadMoreIfNotFullPage();
        }
    }

    @JvmOverloads
    public final void loadMoreEnd() {
        loadMoreEnd$default(this, false, 1, null);
    }

    public final void loadMoreFail() {
        if (hasLoadMoreView()) {
            this.loadMoreStatus = LoadMoreStatus.Fail;
            this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
        }
    }

    public final void loadMoreToLoading() {
        LoadMoreStatus loadMoreStatus = this.loadMoreStatus;
        LoadMoreStatus loadMoreStatus2 = LoadMoreStatus.Loading;
        if (loadMoreStatus == loadMoreStatus2) {
            return;
        }
        this.loadMoreStatus = loadMoreStatus2;
        this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
        invokeLoadMoreListener();
    }

    public final void reset$com_github_CymChad_brvah() {
        if (this.mLoadMoreListener != null) {
            setEnableLoadMore(true);
            this.loadMoreStatus = LoadMoreStatus.Complete;
        }
    }

    public final void setAutoLoadMore(boolean z) {
        this.isAutoLoadMore = z;
    }

    public final void setEnableLoadMore(boolean z) {
        boolean zHasLoadMoreView = hasLoadMoreView();
        this.isEnableLoadMore = z;
        boolean zHasLoadMoreView2 = hasLoadMoreView();
        if (zHasLoadMoreView) {
            if (zHasLoadMoreView2) {
                return;
            }
            this.baseQuickAdapter.notifyItemRemoved(getLoadMoreViewPosition());
        } else if (zHasLoadMoreView2) {
            this.loadMoreStatus = LoadMoreStatus.Complete;
            this.baseQuickAdapter.notifyItemInserted(getLoadMoreViewPosition());
        }
    }

    public final void setEnableLoadMoreEndClick(boolean z) {
        this.enableLoadMoreEndClick = z;
    }

    public final void setEnableLoadMoreIfNotFullPage(boolean z) {
        this.isEnableLoadMoreIfNotFullPage = z;
    }

    public final void setLoadMoreView(@NotNull BaseLoadMoreView baseLoadMoreView) {
        this.loadMoreView = baseLoadMoreView;
    }

    @Override // defpackage.nie
    public void setOnLoadMoreListener(@Nullable c9h listener) {
        this.mLoadMoreListener = listener;
        setEnableLoadMore(true);
    }

    public final void setPreLoadNumber(int i) {
        if (i > 1) {
            this.preLoadNumber = i;
        }
    }

    public final void setupViewHolder$com_github_CymChad_brvah(@NotNull BaseViewHolder viewHolder) {
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.module.BaseLoadMoreModule$setupViewHolder$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (this.this$0.getLoadMoreStatus() == LoadMoreStatus.Fail) {
                    this.this$0.loadMoreToLoading();
                    return;
                }
                if (this.this$0.getLoadMoreStatus() == LoadMoreStatus.Complete) {
                    this.this$0.loadMoreToLoading();
                } else if (this.this$0.getEnableLoadMoreEndClick() && this.this$0.getLoadMoreStatus() == LoadMoreStatus.End) {
                    this.this$0.loadMoreToLoading();
                }
            }
        });
    }

    @JvmOverloads
    public final void loadMoreEnd(boolean gone) {
        if (hasLoadMoreView()) {
            this.isLoadEndMoreGone = gone;
            this.loadMoreStatus = LoadMoreStatus.End;
            if (gone) {
                this.baseQuickAdapter.notifyItemRemoved(getLoadMoreViewPosition());
            } else {
                this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
            }
        }
    }
}
