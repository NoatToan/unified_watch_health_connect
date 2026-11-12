package com.xiaomi.hm.health.training.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RequiresApi;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.listener.OnMultiPurposeListener;

/* JADX INFO: loaded from: classes22.dex */
public class CustomSmartRefreshLayout extends SmartRefreshLayout {
    public CustomSmartRefreshLayout(Context context) {
        super(context);
    }

    public void startRefreshingAnim() {
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

    public CustomSmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomSmartRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @RequiresApi(21)
    public CustomSmartRefreshLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
