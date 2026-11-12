package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MenuHostHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f2094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<MenuProvider> f2095b = new CopyOnWriteArrayList<>();
    public final Map<MenuProvider, a> c = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lifecycle f2096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LifecycleEventObserver f2097b;

        public a(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            this.f2096a = lifecycle;
            this.f2097b = lifecycleEventObserver;
            lifecycle.addObserver(lifecycleEventObserver);
        }

        public void a() {
            this.f2096a.removeObserver(this.f2097b);
            this.f2097b = null;
        }
    }

    public MenuHostHelper(Runnable runnable) {
        this.f2094a = runnable;
    }

    public void c(MenuProvider menuProvider) {
        this.f2095b.add(menuProvider);
        this.f2094a.run();
    }

    public void d(final MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        c(menuProvider);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        a aVarRemove = this.c.remove(menuProvider);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.c.put(menuProvider, new a(lifecycle, new LifecycleEventObserver() { // from class: kqf
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                this.f24190a.f(menuProvider, lifecycleOwner2, event);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void e(final MenuProvider menuProvider, LifecycleOwner lifecycleOwner, final Lifecycle.State state) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        a aVarRemove = this.c.remove(menuProvider);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.c.put(menuProvider, new a(lifecycle, new LifecycleEventObserver() { // from class: jqf
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                this.f23022a.g(state, menuProvider, lifecycleOwner2, event);
            }
        }));
    }

    public final /* synthetic */ void f(MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            l(menuProvider);
        }
    }

    public final /* synthetic */ void g(Lifecycle.State state, MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.upTo(state)) {
            c(menuProvider);
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            l(menuProvider);
        } else if (event == Lifecycle.Event.downFrom(state)) {
            this.f2095b.remove(menuProvider);
            this.f2094a.run();
        }
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator<MenuProvider> it = this.f2095b.iterator();
        while (it.hasNext()) {
            it.next().a(menu, menuInflater);
        }
    }

    public void i(Menu menu) {
        Iterator<MenuProvider> it = this.f2095b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator<MenuProvider> it = this.f2095b.iterator();
        while (it.hasNext()) {
            if (it.next().d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(Menu menu) {
        Iterator<MenuProvider> it = this.f2095b.iterator();
        while (it.hasNext()) {
            it.next().c(menu);
        }
    }

    public void l(MenuProvider menuProvider) {
        this.f2095b.remove(menuProvider);
        a aVarRemove = this.c.remove(menuProvider);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f2094a.run();
    }
}
