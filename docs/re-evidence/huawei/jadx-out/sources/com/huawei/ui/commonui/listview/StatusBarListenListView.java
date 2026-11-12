package com.huawei.ui.commonui.listview;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ListView;
import com.huawei.ui.commonui.utils.StatusBarClickedListener;

/* JADX INFO: loaded from: classes43.dex */
public class StatusBarListenListView extends ListView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StatusBarListenListView f23768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23769c;
    private StatusBarClickedListener d;

    public StatusBarListenListView(Context context) {
        super(context);
        this.f23769c = true;
        this.f23768b = this;
    }

    public StatusBarListenListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23769c = true;
        this.f23768b = this;
    }

    public StatusBarListenListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23769c = true;
        this.f23768b = this;
    }

    public void a() {
        if (this.f23769c) {
            smoothScrollToPosition(0);
            new Handler().postDelayed(new Runnable() { // from class: com.huawei.ui.commonui.listview.StatusBarListenListView.2
                @Override // java.lang.Runnable
                public void run() {
                    if (StatusBarListenListView.this.getFirstVisiblePosition() > 0) {
                        StatusBarListenListView.this.setSelectionAfterHeaderView();
                    }
                }
            }, 100L);
        }
    }

    public void setScrollTopEnable(boolean z) {
        this.f23769c = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchWindowFocusChanged(boolean z) {
        super.dispatchWindowFocusChanged(z);
        setScrollTopEnable(z);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i("StatusBarListenListView", "onAttachedToWindow");
        if (this.d == null) {
            this.d = new StatusBarClickedListener() { // from class: com.huawei.ui.commonui.listview.StatusBarListenListView.4
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if (StatusBarListenListView.this.f23768b != null) {
                        StatusBarListenListView.this.f23768b.a();
                    }
                }
            };
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i("StatusBarListenListView", "onDetachedFromWindow");
        StatusBarClickedListener statusBarClickedListener = this.d;
        if (statusBarClickedListener != null) {
            statusBarClickedListener.unregister();
            this.d = null;
        }
    }
}
