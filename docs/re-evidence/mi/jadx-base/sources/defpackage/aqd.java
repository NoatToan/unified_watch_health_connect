package defpackage;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes4.dex */
public class aqd implements m8h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f3353a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f3354b;

    @Override // defpackage.m8h
    public boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
        int i = this.f3353a;
        return (i == -1 || motionEvent.getAction() == 1 || viewGroup.getId() != i) ? false : true;
    }

    public void b() {
        this.f3353a = -1;
        c();
    }

    public final void c() {
        ViewParent viewParent = this.f3354b;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            this.f3354b = null;
        }
    }

    public void d(int i, ViewParent viewParent) {
        this.f3353a = i;
        c();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.f3354b = viewParent;
        }
    }
}
