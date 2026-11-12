package com.huawei.ui.commonui.listview;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ExpandableListView;
import com.huawei.ui.commonui.utils.StatusBarClickedListener;

/* JADX INFO: loaded from: classes16.dex */
public class HealthExpandableListView extends ExpandableListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HealthExpandableListView f23766b;
    private StatusBarClickedListener d;

    public HealthExpandableListView(Context context) {
        super(context);
        this.f23765a = true;
        this.f23766b = this;
    }

    public HealthExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23765a = true;
        this.f23766b = this;
    }

    public HealthExpandableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23765a = true;
        this.f23766b = this;
    }

    public void d() {
        if (this.f23765a) {
            smoothScrollToPositionFromTop(0, 0);
            new Handler().postDelayed(new Runnable() { // from class: com.huawei.ui.commonui.listview.HealthExpandableListView.4
                @Override // java.lang.Runnable
                public void run() {
                    if (HealthExpandableListView.this.getFirstVisiblePosition() > 0) {
                        HealthExpandableListView.this.setSelectionAfterHeaderView();
                    }
                }
            }, 100L);
        }
    }

    public void setScrollTopEnable(boolean z) {
        this.f23765a = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchWindowFocusChanged(boolean z) {
        super.dispatchWindowFocusChanged(z);
        setScrollTopEnable(z);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i("HealthExpandableListView", "onAttachedToWindow");
        if (this.d == null) {
            this.d = new StatusBarClickedListener() { // from class: com.huawei.ui.commonui.listview.HealthExpandableListView.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if (HealthExpandableListView.this.f23766b != null) {
                        HealthExpandableListView.this.f23766b.d();
                    }
                }
            };
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i("HealthExpandableListView", "onDetachedFromWindow");
        StatusBarClickedListener statusBarClickedListener = this.d;
        if (statusBarClickedListener != null) {
            statusBarClickedListener.unregister();
            this.d = null;
        }
    }
}
