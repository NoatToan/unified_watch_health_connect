package com.huawei.ui.commonui.listener;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public abstract class RecyclerViewItemTouchListener implements RecyclerView.OnItemTouchListener {
    private static final String TAG = "RecyclerViewItemTouchListener";
    private GestureDetectorCompat mGestureDetectorCompat;

    public abstract void onItemTouchDown(RecyclerView.ViewHolder viewHolder);

    public RecyclerViewItemTouchListener(RecyclerView recyclerView) {
        this.mGestureDetectorCompat = new GestureDetectorCompat(recyclerView.getContext(), new a(recyclerView, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.mGestureDetectorCompat.onTouchEvent(motionEvent);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        LogUtil.a(TAG, "onTouchEvent:", Integer.valueOf(motionEvent.getAction()));
        this.mGestureDetectorCompat.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
        LogUtil.a(TAG, "onRequestDisallowInterceptTouchEvent");
    }

    static class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RecyclerViewItemTouchListener f23763a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<RecyclerView> f23764c;

        a(RecyclerView recyclerView, RecyclerViewItemTouchListener recyclerViewItemTouchListener) {
            this.f23764c = new WeakReference<>(recyclerView);
            this.f23763a = recyclerViewItemTouchListener;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            WeakReference<RecyclerView> weakReference = this.f23764c;
            if (weakReference == null || weakReference.get() == null) {
                return false;
            }
            RecyclerView recyclerView = this.f23764c.get();
            View viewFindChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (viewFindChildViewUnder == null || this.f23763a == null) {
                return true;
            }
            this.f23763a.onItemTouchDown(recyclerView.getChildViewHolder(viewFindChildViewUnder));
            return true;
        }
    }
}
