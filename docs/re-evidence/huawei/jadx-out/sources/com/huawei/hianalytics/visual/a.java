package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import com.huawei.hianalytics.visual.autocollect.EventType;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes33.dex */
public final class a implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f11616b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f11617a = new HashSet();

    @Override // com.huawei.hianalytics.visual.g0
    public final void a(Activity activity) {
        if (activity.isChild()) {
            return;
        }
        m.a().getClass();
    }

    public final void c(final Activity activity) {
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e(activity);
            }
        });
    }

    public final void d(final Activity activity) {
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.a$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.f(activity);
            }
        });
    }

    public final /* synthetic */ void e(Activity activity) {
        a(new f(activity, "activity_on_destroyed"));
    }

    public final /* synthetic */ void f(Activity activity) {
        a(new f(activity, "activity_on_resume"));
    }

    @Override // com.huawei.hianalytics.visual.g0
    public final void onActivityDestroyed(Activity activity) {
        q1 q1Var = q1.f11686b;
        synchronized (q1Var) {
            q1Var.f11687a.remove(Integer.valueOf(activity.hashCode()));
        }
        c(activity);
        SparseArray sparseArray = v1.g;
        if (sparseArray == null) {
            return;
        }
        sparseArray.clear();
    }

    @Override // com.huawei.hianalytics.visual.g0
    public final void onActivityPaused(Activity activity) {
        if (!activity.isChild()) {
            m.a().getClass();
        }
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        if (decorView == null) {
            return;
        }
        if (w.a().a(EventType.VIEW_EXPOSURE) || decorView.getTag(R.id.hianalytics_view_tree_observer_listener_tag) == null) {
            return;
        }
        decorView.getViewTreeObserver().removeOnDrawListener(u1.a());
        decorView.getViewTreeObserver().removeOnGlobalFocusChangeListener(u1.a());
        decorView.getViewTreeObserver().removeOnScrollChangedListener(u1.a());
        decorView.getViewTreeObserver().removeOnGlobalLayoutListener(u1.a());
        decorView.getViewTreeObserver().removeOnWindowFocusChangeListener(u1.a());
        decorView.setTag(R.id.hianalytics_view_tree_observer_listener_tag, null);
    }

    @Override // com.huawei.hianalytics.visual.g0
    public final void onActivityResumed(Activity activity) {
        d(activity);
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        if (!activity.isChild() && decorView != null) {
            m mVarA = m.a();
            decorView.hashCode();
            mVarA.getClass();
        }
        if (decorView == null) {
            return;
        }
        if (!w.a().a(EventType.VIEW_EXPOSURE) && decorView.getTag(R.id.hianalytics_view_tree_observer_listener_tag) == null) {
            decorView.getViewTreeObserver().addOnDrawListener(u1.a());
            decorView.getViewTreeObserver().addOnGlobalFocusChangeListener(u1.a());
            decorView.getViewTreeObserver().addOnScrollChangedListener(u1.a());
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(u1.a());
            decorView.getViewTreeObserver().addOnWindowFocusChangeListener(u1.a());
            decorView.setTag(R.id.hianalytics_view_tree_observer_listener_tag, Boolean.TRUE);
        }
    }

    public final void a(f fVar) {
        HashSet hashSet;
        synchronized (this.f11617a) {
            hashSet = new HashSet(this.f11617a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((p1) ((g) it.next())).a(fVar);
        }
    }
}
