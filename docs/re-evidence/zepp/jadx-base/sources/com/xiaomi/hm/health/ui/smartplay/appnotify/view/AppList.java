package com.xiaomi.hm.health.ui.smartplay.appnotify.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes22.dex */
public class AppList extends RecyclerView {
    private boolean a;

    public AppList(Context context) {
        super(context);
        this.a = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a && super.onInterceptTouchEvent(motionEvent);
    }

    public void setScrollEnable(boolean z) {
        this.a = z;
    }

    public AppList(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
    }

    public AppList(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
    }
}
