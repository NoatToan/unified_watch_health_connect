package com.xiaomi.fitness.baseui.recyclerview.adapter;

import com.xiaomi.fitness.baseui.recyclerview.animation.ItemAnimation;
import com.xiaomi.fitness.baseui.recyclerview.provider.LoadMoreModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 **\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\u001a\u0010\u0013\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\nR\u001a\u0010\u0019\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010!\u001a\u0004\u0018\u00010\"@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001e¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseOneAdapter;", "T", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter;", "<init>", "()V", "headerWithEmptyEnable", "", "getHeaderWithEmptyEnable", "()Z", "setHeaderWithEmptyEnable", "(Z)V", "footerWithEmptyEnable", "getFooterWithEmptyEnable", "setFooterWithEmptyEnable", "isUseEmpty", "setUseEmpty", "headerViewAsFlow", "getHeaderViewAsFlow", "setHeaderViewAsFlow", "footerViewAsFlow", "getFooterViewAsFlow", "setFooterViewAsFlow", "animationEnable", "getAnimationEnable", "setAnimationEnable", "isAnimationFirstOnly", "setAnimationFirstOnly", "mLoadMoreModule", "Lcom/xiaomi/fitness/baseui/recyclerview/provider/LoadMoreModule;", "getMLoadMoreModule$ui_release", "()Lcom/xiaomi/fitness/baseui/recyclerview/provider/LoadMoreModule;", "setMLoadMoreModule$ui_release", "(Lcom/xiaomi/fitness/baseui/recyclerview/provider/LoadMoreModule;)V", "value", "Lcom/xiaomi/fitness/baseui/recyclerview/animation/ItemAnimation;", "adapterAnimation", "getAdapterAnimation", "()Lcom/xiaomi/fitness/baseui/recyclerview/animation/ItemAnimation;", "setAdapterAnimation", "(Lcom/xiaomi/fitness/baseui/recyclerview/animation/ItemAnimation;)V", "loadMoreModule", "getLoadMoreModule", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseOneAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseOneAdapter.kt\ncom/xiaomi/fitness/baseui/recyclerview/adapter/BaseOneAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
public abstract class BaseOneAdapter<T> extends BaseAdapter<T> {
    public static final int EMPTY_VIEW = 268435715;
    public static final int FOOTER_VIEW = 268435714;
    public static final int HEADER_VIEW = 268435712;
    public static final int LOAD_MORE_VIEW = 268435713;

    @Nullable
    private ItemAnimation adapterAnimation;
    private boolean animationEnable;
    private boolean footerViewAsFlow;
    private boolean footerWithEmptyEnable;
    private boolean headerViewAsFlow;
    private boolean headerWithEmptyEnable;
    private boolean isAnimationFirstOnly;
    private boolean isUseEmpty;

    @Nullable
    private LoadMoreModule mLoadMoreModule;

    public BaseOneAdapter() {
        super(null, 1, null);
        this.isUseEmpty = true;
        this.isAnimationFirstOnly = true;
    }

    @Nullable
    public final ItemAnimation getAdapterAnimation() {
        return this.adapterAnimation;
    }

    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    public final boolean getFooterViewAsFlow() {
        return this.footerViewAsFlow;
    }

    public final boolean getFooterWithEmptyEnable() {
        return this.footerWithEmptyEnable;
    }

    public final boolean getHeaderViewAsFlow() {
        return this.headerViewAsFlow;
    }

    public final boolean getHeaderWithEmptyEnable() {
        return this.headerWithEmptyEnable;
    }

    @NotNull
    public final LoadMoreModule getLoadMoreModule() {
        LoadMoreModule loadMoreModule = this.mLoadMoreModule;
        if (loadMoreModule == null) {
            throw new IllegalStateException("Please first implements LoadMoreModule".toString());
        }
        Intrinsics.checkNotNull(loadMoreModule);
        return loadMoreModule;
    }

    @Nullable
    /* JADX INFO: renamed from: getMLoadMoreModule$ui_release, reason: from getter */
    public final LoadMoreModule getMLoadMoreModule() {
        return this.mLoadMoreModule;
    }

    /* JADX INFO: renamed from: isAnimationFirstOnly, reason: from getter */
    public final boolean getIsAnimationFirstOnly() {
        return this.isAnimationFirstOnly;
    }

    /* JADX INFO: renamed from: isUseEmpty, reason: from getter */
    public final boolean getIsUseEmpty() {
        return this.isUseEmpty;
    }

    public final void setAdapterAnimation(@Nullable ItemAnimation itemAnimation) {
        this.animationEnable = true;
        this.adapterAnimation = itemAnimation;
    }

    public final void setAnimationEnable(boolean z) {
        this.animationEnable = z;
    }

    public final void setAnimationFirstOnly(boolean z) {
        this.isAnimationFirstOnly = z;
    }

    public final void setFooterViewAsFlow(boolean z) {
        this.footerViewAsFlow = z;
    }

    public final void setFooterWithEmptyEnable(boolean z) {
        this.footerWithEmptyEnable = z;
    }

    public final void setHeaderViewAsFlow(boolean z) {
        this.headerViewAsFlow = z;
    }

    public final void setHeaderWithEmptyEnable(boolean z) {
        this.headerWithEmptyEnable = z;
    }

    public final void setMLoadMoreModule$ui_release(@Nullable LoadMoreModule loadMoreModule) {
        this.mLoadMoreModule = loadMoreModule;
    }

    public final void setUseEmpty(boolean z) {
        this.isUseEmpty = z;
    }
}
