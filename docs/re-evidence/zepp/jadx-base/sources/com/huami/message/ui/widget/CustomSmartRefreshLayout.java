package com.huami.message.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RequiresApi;
import com.huami.tools.analytics.DbUtils;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.listener.OnMultiPurposeListener;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000eB)\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0011"}, d2 = {"Lcom/huami/message/ui/widget/CustomSmartRefreshLayout;", "Lcom/scwang/smartrefresh/layout/SmartRefreshLayout;", "", "startRefreshingAnim", "startFootRefreshingAnim", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class CustomSmartRefreshLayout extends SmartRefreshLayout {
    public CustomSmartRefreshLayout(@NotNull Context context) {
        super(context);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void startFootRefreshingAnim() {
        this.mLastLoadingTime = System.currentTimeMillis();
        notifyStateChanged(RefreshState.Loading);
        RefreshFooter refreshFooter = this.mRefreshFooter;
        if (refreshFooter != null) {
            refreshFooter.onStartAnimator(this, this.mFooterHeight, this.mFooterExtendHeight);
        }
        OnMultiPurposeListener onMultiPurposeListener = this.mOnMultiPurposeListener;
        if (onMultiPurposeListener != null) {
            onMultiPurposeListener.onFooterStartAnimator(this.mRefreshFooter, this.mFooterHeight, this.mFooterExtendHeight);
        }
    }

    public final void startRefreshingAnim() {
        this.mLastRefreshingTime = System.currentTimeMillis();
        notifyStateChanged(RefreshState.Refreshing);
        animSpinner(this.mHeaderHeight);
        RefreshHeader refreshHeader = this.mRefreshHeader;
        if (refreshHeader != null) {
            refreshHeader.onStartAnimator(this, this.mHeaderHeight, this.mHeaderExtendHeight);
        }
        OnMultiPurposeListener onMultiPurposeListener = this.mOnMultiPurposeListener;
        if (onMultiPurposeListener != null) {
            onMultiPurposeListener.onHeaderStartAnimator(this.mRefreshHeader, this.mHeaderHeight, this.mHeaderExtendHeight);
        }
    }

    public CustomSmartRefreshLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomSmartRefreshLayout(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @RequiresApi(21)
    public CustomSmartRefreshLayout(@NotNull Context context, @NotNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
