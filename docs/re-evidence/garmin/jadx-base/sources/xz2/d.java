package xz2;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public class d extends androidx.core.view.c {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f192870g1;

    public d(Context context) {
        super(context);
        this.f192870g1 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean canScrollHorizontally(int i14) {
        return this.f192870g1 && super.canScrollHorizontally(i14);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i14) {
        return this.f192870g1 && super.canScrollVertically(i14);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f192870g1 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f192870g1 && super.onTouchEvent(motionEvent);
    }
}
