package com.huami.module.homepage.sync.view.refresh;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.module.homepage.R;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.ViewExtKt;
import com.huami.tools.analytics.DbUtils;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0015\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u001bJ$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010\u0010\u001a\u00020\u00072\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/huami/module/homepage/sync/view/refresh/HomeRefreshHeader;", "Lcom/scwang/smartrefresh/layout/header/ClassicsHeader;", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "refreshLayout", "Lcom/scwang/smartrefresh/layout/constant/RefreshState;", "oldState", "newState", "", "onStateChanged", "layout", "", "success", "", "onFinish", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "startRefreshListener", "a", "Lkotlin/jvm/functions/Function0;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class HomeRefreshHeader extends ClassicsHeader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> startRefreshListener;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshState.values().length];
            iArr[RefreshState.PullDownToRefresh.ordinal()] = 1;
            iArr[RefreshState.ReleaseToRefresh.ordinal()] = 2;
            iArr[RefreshState.Refreshing.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HomeRefreshHeader(@NotNull Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.header.ClassicsHeader, com.scwang.smartrefresh.layout.api.RefreshInternal
    public int onFinish(@Nullable RefreshLayout layout, boolean success) {
        int iOnFinish = super.onFinish(layout, success);
        this.mTitleText.setText(getContext().getString(R.string.homepage_release_refresh));
        return iOnFinish;
    }

    @Override // com.scwang.smartrefresh.layout.header.ClassicsHeader, com.scwang.smartrefresh.layout.listener.OnStateChangedListener
    public void onStateChanged(@NotNull RefreshLayout refreshLayout, @Nullable RefreshState oldState, @Nullable RefreshState newState) {
        super.onStateChanged(refreshLayout, oldState, newState);
        int i = newState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[newState.ordinal()];
        if (i == 1) {
            this.mTitleText.setText(getContext().getString(R.string.homepage_pull_refresh));
            return;
        }
        if (i == 2) {
            this.mTitleText.setText(getContext().getString(R.string.homepage_release_refresh));
            return;
        }
        if (i != 3) {
            return;
        }
        this.mTitleText.setText(getContext().getString(R.string.homepage_release_refresh));
        refreshLayout.finishRefresh(0);
        Function0<Unit> function0 = this.startRefreshListener;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    public final void startRefreshListener(@Nullable Function0<Unit> listener) {
        this.startRefreshListener = listener;
    }

    public HomeRefreshHeader(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HomeRefreshHeader(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (HomeUtils.isMifitApp()) {
            this.mTitleText.setTextColor(ViewExtKt.loadColor(this, R.color.s38));
        }
    }
}
