package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes33.dex */
public final class u1 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalFocusChangeListener, ViewTreeObserver.OnDrawListener, ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile u1 f11705b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f11706a = new HashSet();

    public static u1 a() {
        if (f11705b == null) {
            synchronized (u1.class) {
                if (f11705b == null) {
                    f11705b = new u1();
                }
            }
        }
        return f11705b;
    }

    public final void b(p1 p1Var) {
        synchronized (this.f11706a) {
            this.f11706a.remove(p1Var);
        }
    }

    public final /* synthetic */ void c() {
        a(new s1("view_focus_changed"));
    }

    public final /* synthetic */ void d() {
        a(new s1("view_layout_changed"));
    }

    public final /* synthetic */ void e() {
        a(new s1("view_scroll_changed"));
    }

    public final /* synthetic */ void f() {
        a(new s1("window_focus_changed"));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.u1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        });
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.u1$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        });
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.u1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d();
            }
        });
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.u1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e();
            }
        });
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.u1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.f();
            }
        });
    }

    public final /* synthetic */ void b() {
        a(new s1("view_draw_changed"));
    }

    public final void a(p1 p1Var) {
        synchronized (this.f11706a) {
            this.f11706a.add(p1Var);
        }
    }

    public final void a(s1 s1Var) {
        HashSet hashSet;
        WeakHashMap weakHashMap;
        l1 l1Var;
        n1 n1Var;
        n1 n1Var2;
        synchronized (this.f11706a) {
            hashSet = new HashSet(this.f11706a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            p1 p1Var = (p1) ((t1) it.next());
            p1Var.getClass();
            if (!s1Var.f11694a.equals("window_focus_changed") && !s1Var.f11694a.equals("view_layout_changed")) {
                if (s1Var.f11694a.equals("view_draw_changed") && (n1Var2 = p1Var.f11680c) != null) {
                    n1Var2.a();
                }
            } else {
                m.a().getClass();
                Activity activityC = u.f11699c.c();
                if (activityC != null && (weakHashMap = p1Var.f11679b) != null && (l1Var = (l1) weakHashMap.get(activityC)) != null && (n1Var = l1Var.f11659a.f11673a) != null) {
                    n1Var.a();
                }
            }
        }
    }
}
