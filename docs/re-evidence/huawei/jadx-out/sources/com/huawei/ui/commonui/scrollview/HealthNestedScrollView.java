package com.huawei.ui.commonui.scrollview;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.secure.android.common.intent.SafeBroadcastReceiver;
import com.huawei.ui.commonui.R;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class HealthNestedScrollView extends NestedScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f23868a;
    private boolean e;

    public HealthNestedScrollView(Context context) {
        super(context);
    }

    public HealthNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public HealthNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, attributeSet);
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthNestedScrollView);
        this.e = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthNestedScrollView_isNeedScrollToTop, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (getParent() instanceof ScrollView) {
            return true;
        }
        return super.isFocused();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e) {
            this.f23868a = new a(this, true);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(Constants.CLICK_STATUS_BAR_ACTION);
            BroadcastManagerUtil.c(BaseApplication.b(), this.f23868a, intentFilter, Constants.SYSTEM_UI_PERMISSION, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int iComputeVerticalScrollOffset = computeVerticalScrollOffset();
        int iComputeVerticalScrollExtent = computeVerticalScrollExtent() * 3;
        if (iComputeVerticalScrollOffset > iComputeVerticalScrollExtent) {
            scrollBy(0, iComputeVerticalScrollExtent - iComputeVerticalScrollOffset);
        }
        LogUtil.a("HealthNestedScrollView", "scrollOverDistanceToTopProc");
        smoothScrollTo(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.e || this.f23868a == null) {
            return;
        }
        BaseApplication.b().unregisterReceiver(this.f23868a);
        this.f23868a = null;
    }

    class a extends SafeBroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private View f23869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f23870b;

        public a(View view, boolean z) {
            this.f23869a = view;
            this.f23870b = z;
        }

        @Override // com.huawei.secure.android.common.intent.SafeBroadcastReceiver
        public void onReceiveMsg(Context context, Intent intent) {
            if (!this.f23870b || this.f23869a == null || intent == null || !Constants.CLICK_STATUS_BAR_ACTION.equals(intent.getAction())) {
                return;
            }
            HealthNestedScrollView.this.d();
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        try {
            super.onRestoreInstanceState(parcelable);
        } catch (Exception e) {
            ReleaseLogUtil.a("HealthNestedScrollView", "onRestoreInstanceState exception: ", ExceptionUtils.c(e));
        }
    }
}
